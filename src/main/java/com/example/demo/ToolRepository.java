package com.example.demo;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


public class ToolRepository implements JpaRepository<Tool, Integer> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Tool> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Tool> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Tool> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Tool getOne(Integer integer) {
        return null;
    }

    @Override
    public Tool getById(Integer integer) {
        return null;
    }

    @Override
    public Tool getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Tool> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Tool> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Tool> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Tool> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Tool> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Tool> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Tool, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Tool> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Tool> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Tool> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Tool> findAll() {
        return null;
    }

    @Override
    public List<Tool> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Tool entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Tool> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Tool> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Tool> findAll(Pageable pageable) {
        return null;
    }
}
