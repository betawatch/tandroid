package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class xq0 implements org.telegram.ui.Components.dn0 {
    public final /* synthetic */ br0 a;

    public xq0(br0 br0Var) {
        this.a = br0Var;
    }

    @Override // org.telegram.ui.Components.dn0
    public final void E0(float f7) {
        br0 br0Var = this.a;
        if (f7 != 1.0f || br0Var.n[1].getVisibility() == 0) {
            if (br0Var.v) {
                br0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                br0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * br0Var.n[0].getMeasuredWidth()));
            } else {
                br0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                br0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - br0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                zq0[] zq0VarArr = br0Var.n;
                zq0 zq0Var = zq0VarArr[0];
                zq0VarArr[0] = zq0VarArr[1];
                zq0VarArr[1] = zq0Var;
                zq0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.dn0
    public final void b(int i10, boolean z10) {
        br0 br0Var = this.a;
        if (br0Var.n[0].e == i10) {
            return;
        }
        br0Var.e = i10 == br0Var.h.getFirstTabId();
        zq0 zq0Var = br0Var.n[1];
        zq0Var.e = i10;
        zq0Var.setVisibility(0);
        br0Var.j0(true);
        br0Var.v = z10;
        if (i10 == 0) {
            br0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            br0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.dn0
    public final /* synthetic */ boolean o1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.dn0
    public final /* synthetic */ void C() {
    }
}
