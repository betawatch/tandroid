// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qu9 extends sc3 {
    @Override // sc3, jka
    public final boolean r(u69 u69Var, az8 az8Var, int i, int i2, int i3, int i4) {
        wu9 wu9Var;
        vu9 vu9Var;
        View view = u69Var.a;
        if ((view instanceof wu9) && (vu9Var = (wu9Var = (wu9) view).a) != null) {
            vu9Var.h = vu9Var.M;
            vu9Var.f = vu9Var.N;
            vu9Var.g = vu9Var.O;
            wu9Var.b.e(true, 0.0f);
            wu9Var.invalidate();
        }
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) view.getTranslationY());
        R(u69Var);
        int i5 = i4 - translationY;
        if (i3 - translationX != 0) {
            view.setTranslationX(-r11);
        } else if (i5 == 0) {
            v(u69Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationY(-i5);
        }
        this.r.add(new rc3(u69Var, translationX, translationY, i3, i4));
        return true;
    }

    @Override // jka
    public final boolean t(u69 u69Var) {
        return true;
    }
}
