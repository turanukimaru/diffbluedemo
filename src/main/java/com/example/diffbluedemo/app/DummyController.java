package com.example.diffbluedemo.app;

import com.example.diffbluedemo.entity.Child;
import com.example.diffbluedemo.entity.Dummy;
import com.example.diffbluedemo.usecase.DummyUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/dummies")
public class DummyController {
    private final DummyUseCase dummyUseCase;

    public DummyController(DummyUseCase dummyUseCase) {
        this.dummyUseCase = dummyUseCase;
    }

    @GetMapping
    public List<Dummy> list() {
        return dummyUseCase.allDummies();
    }
    @PutMapping
    public Dummy add() {
        return dummyUseCase.newDummy();

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        dummyUseCase.deleteDummy(id);
    }

    @GetMapping("/{id}/children")
    public List<Child> children(@PathVariable Long id) {
        return dummyUseCase.findChildren(id);
    }
}
