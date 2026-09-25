package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class uq0 implements org.telegram.ui.Components.xm0 {
    public final /* synthetic */ yq0 a;

    public uq0(yq0 yq0Var) {
        this.a = yq0Var;
    }

    @Override // org.telegram.ui.Components.xm0
    public final void C0(float f7) {
        yq0 yq0Var = this.a;
        if (f7 != 1.0f || yq0Var.n[1].getVisibility() == 0) {
            if (yq0Var.v) {
                yq0Var.n[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                yq0Var.n[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * yq0Var.n[0].getMeasuredWidth()));
            } else {
                yq0Var.n[0].setTranslationX(r3.getMeasuredWidth() * f7);
                yq0Var.n[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - yq0Var.n[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                wq0[] wq0VarArr = yq0Var.n;
                wq0 wq0Var = wq0VarArr[0];
                wq0VarArr[0] = wq0VarArr[1];
                wq0VarArr[1] = wq0Var;
                wq0Var.setVisibility(8);
            }
        }
    }

    @Override // org.telegram.ui.Components.xm0
    public final void d(int i10, boolean z10) {
        yq0 yq0Var = this.a;
        if (yq0Var.n[0].e == i10) {
            return;
        }
        yq0Var.e = i10 == yq0Var.h.getFirstTabId();
        wq0 wq0Var = yq0Var.n[1];
        wq0Var.e = i10;
        wq0Var.setVisibility(0);
        yq0Var.j0(true);
        yq0Var.v = z10;
        if (i10 == 0) {
            yq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        } else {
            yq0Var.c.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
        }
    }

    @Override // org.telegram.ui.Components.xm0
    public final /* synthetic */ boolean n1(int i10, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.xm0
    public final /* synthetic */ void C() {
    }
}
