package com.scarlatti.intellij.data.viewer;

import com.scarlatti.intellij.data.viewer.ui.CdTable2;
import com.scarlatti.intellij.data.viewer.ui.EnumConstructor;
import com.scarlatti.intellij.data.viewer.ui.EnumConstructorParam;
import com.scarlatti.intellij.data.viewer.ui.TestForm;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Friday, 8/24/2018
 */
public class CdTableTest {

    @Test
    public void displayCdTable() {
        List<EnumConstructorParam> enumConstructorParams1 = Arrays.asList(
            new EnumConstructorParam("param1", "what"),
            new EnumConstructorParam("param2", "do")
        );

        List<EnumConstructorParam> enumConstructorParams2 = Arrays.asList(
            new EnumConstructorParam("param2", "do"),
            new EnumConstructorParam("param3", "you know")
        );

        EnumConstructor constructor1 = new EnumConstructor(enumConstructorParams1);
        EnumConstructor constructor2 = new EnumConstructor(enumConstructorParams2);


        TestUtils.displayJPanel(() -> {
            CdTable2 cdTable = new CdTable2(Arrays.asList(constructor1, constructor2));
            return cdTable.getJPanel();
        });
    }

    @Test
    public void displayTestForm() {
        TestUtils.displayJPanel(() -> {
            return new TestForm().getJPanel();
        });
    }

    @Test
    public void displayTestForm2() {
        TestUtils.displayJPanel(() -> {
            return new CdTable2(Collections.emptyList()).getJPanel();
        });
    }
}
