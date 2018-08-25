package com.scarlatti.intellij.data.viewer;

import com.intellij.codeInspection.LocalInspectionTool;
import com.intellij.codeInspection.LocalInspectionToolSession;
import com.intellij.codeInspection.ProblemsHolder;
import com.intellij.psi.*;
import org.jetbrains.annotations.NotNull;

/**
 * ______    __                         __           ____             __     __  __  _
 * ___/ _ | / /__ ___ ___ ___ ____  ___/ /______    / __/______ _____/ /__ _/ /_/ /_(_)
 * __/ __ |/ / -_|_-<(_-</ _ `/ _ \/ _  / __/ _ \  _\ \/ __/ _ `/ __/ / _ `/ __/ __/ /
 * /_/ |_/_/\__/___/___/\_,_/_//_/\_,_/_/  \___/ /___/\__/\_,_/_/ /_/\_,_/\__/\__/_/
 * Thursday, 8/23/2018
 */
public class EnumInspection extends LocalInspectionTool {

    @NotNull
    @Override
    public PsiElementVisitor buildVisitor(@NotNull ProblemsHolder holder, boolean isOnTheFly, @NotNull LocalInspectionToolSession session) {
        return new EnumVisitor(holder);
    }

    private static class EnumVisitor extends JavaRecursiveElementVisitor {
        private ProblemsHolder holder;
        private EnumConstructorVisitor enumConstructorVisitor = new EnumConstructorVisitor();

        public EnumVisitor(ProblemsHolder holder) {
            this.holder = holder;
        }

        @Override
        public void visitClass(PsiClass aClass) {
            super.visitClass(aClass);
        }

        @Override
        public void visitField(PsiField field) {
            super.visitField(field);
        }

        @Override
        public void visitEnumConstant(PsiEnumConstant enumConstant) {
            super.visitEnumConstant(enumConstant);
        }

        @Override
        public void visitEnumConstantInitializer(PsiEnumConstantInitializer enumConstantInitializer) {
            super.visitEnumConstantInitializer(enumConstantInitializer);
        }

        @Override
        public void visitMethodCallExpression(PsiMethodCallExpression expression) {
            super.visitMethodCallExpression(expression);
        }

        @Override
        public void visitParameterList(PsiParameterList list) {
            super.visitParameterList(list);
        }
    }

    private static class EnumConstructorVisitor extends JavaElementVisitor {
        @Override
        public void visitMethodCallExpression(PsiMethodCallExpression expression) {
            super.visitMethodCallExpression(expression);
        }
    }
}
