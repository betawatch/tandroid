package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class uq0 implements org.telegram.ui.Components.tn0 {
    public final /* synthetic */ xq0 a;

    public uq0(xq0 xq0Var) {
        this.a = xq0Var;
    }

    @Override // org.telegram.ui.Components.tn0
    public final void f(int i10, boolean z10) {
        xq0 xq0Var = this.a;
        if (xq0Var.n[0].b == i10) {
            return;
        }
        xq0Var.e = i10 == xq0Var.h.getFirstTabId();
        org.telegram.ui.ActionBar.q5 q5Var = xq0Var.n[1];
        q5Var.b = i10;
        q5Var.setVisibility(0);
        xq0Var.k0(true);
        xq0Var.v = z10;
        if (i10 == 0) {
            xq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            xq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.tn0
    public final /* synthetic */ boolean h1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.tn0
    public final void z0(float f7) {
        xq0 xq0Var = this.a;
        if (f7 != 1.0f || xq0Var.n[1].getVisibility() == 0) {
            if (xq0Var.v) {
                xq0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                xq0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * xq0Var.n[0].getMeasuredWidth()));
            } else {
                xq0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                xq0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - xq0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                org.telegram.ui.ActionBar.q5[] q5VarArr = xq0Var.n;
                org.telegram.ui.ActionBar.q5 q5Var = q5VarArr[0];
                q5VarArr[0] = q5VarArr[1];
                q5VarArr[1] = q5Var;
                q5Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.tn0
    public final /* synthetic */ void z() {
    }
}
