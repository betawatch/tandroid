package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class vq0 implements org.telegram.ui.Components.mm0 {
    public final /* synthetic */ ar0 a;

    public vq0(ar0 ar0Var) {
        this.a = ar0Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final void C0(float f7) {
        ar0 ar0Var = this.a;
        if (f7 != 1.0f || ar0Var.n[1].getVisibility() == 0) {
            if (ar0Var.v) {
                ar0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                ar0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * ar0Var.n[0].getMeasuredWidth()));
            } else {
                ar0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                ar0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - ar0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                yq0[] yq0VarArr = ar0Var.n;
                yq0 yq0Var = yq0VarArr[0];
                yq0VarArr[0] = yq0VarArr[1];
                yq0VarArr[1] = yq0Var;
                yq0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final void d(int i10, boolean z10) {
        ar0 ar0Var = this.a;
        if (ar0Var.n[0].e == i10) {
            return;
        }
        ar0Var.e = i10 == ar0Var.h.getFirstTabId();
        yq0 yq0Var = ar0Var.n[1];
        yq0Var.e = i10;
        yq0Var.setVisibility(0);
        ar0Var.j0(true);
        ar0Var.v = z10;
        if (i10 == 0) {
            ar0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            ar0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final /* synthetic */ boolean n1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.mm0
    public final /* synthetic */ void C() {
    }
}
