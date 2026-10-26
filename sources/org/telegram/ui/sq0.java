package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class sq0 implements org.telegram.ui.Components.sn0 {
    public final /* synthetic */ vq0 a;

    public sq0(vq0 vq0Var) {
        this.a = vq0Var;
    }

    @Override // org.telegram.ui.Components.sn0
    public final void f(int i10, boolean z10) {
        vq0 vq0Var = this.a;
        if (vq0Var.n[0].b == i10) {
            return;
        }
        vq0Var.e = i10 == vq0Var.h.getFirstTabId();
        org.telegram.ui.ActionBar.q5 q5Var = vq0Var.n[1];
        q5Var.b = i10;
        q5Var.setVisibility(0);
        vq0Var.k0(true);
        vq0Var.v = z10;
        if (i10 == 0) {
            vq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            vq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.sn0
    public final /* synthetic */ boolean h1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.sn0
    public final void z0(float f7) {
        vq0 vq0Var = this.a;
        if (f7 != 1.0f || vq0Var.n[1].getVisibility() == 0) {
            if (vq0Var.v) {
                vq0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                vq0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * vq0Var.n[0].getMeasuredWidth()));
            } else {
                vq0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                vq0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - vq0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                org.telegram.ui.ActionBar.q5[] q5VarArr = vq0Var.n;
                org.telegram.ui.ActionBar.q5 q5Var = q5VarArr[0];
                q5VarArr[0] = q5VarArr[1];
                q5VarArr[1] = q5Var;
                q5Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.sn0
    public final /* synthetic */ void z() {
    }
}
