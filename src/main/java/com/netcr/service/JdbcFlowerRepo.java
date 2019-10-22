package com.netcr.service;

import com.netcr.model.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class JdbcFlowerRepo implements FlowerRepo{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Flower> getAll() {
        return jdbcTemplate.query("SELECT * FROM flowers",
                new RowMapper<Flower>() {
                    @Override
                    public Flower mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return new Flower(rs.getLong("id"),
                                rs.getString("name"),
                                rs.getString("color"));
                    }
                });
    }
}
