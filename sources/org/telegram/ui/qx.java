package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qx implements org.telegram.ui.Components.oz {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zx b;

    public qx(Context context, zx zxVar) {
        this.b = zxVar;
        this.a = context;
    }

    public final int a(int i10) {
        zx zxVar = this.b;
        if (zxVar.R0 == 3) {
            return 0;
        }
        if (i10 == zxVar.z0.getDefaultTabId()) {
            return zxVar.getMessagesStorage().K;
        }
        ArrayList S0 = zxVar.getMessagesController().S0();
        if (i10 < 0 || i10 >= S0.size()) {
            return 0;
        }
        return ((org.telegram.messenger.bp) zxVar.getMessagesController().S0().get(i10)).d;
    }

    public final void b(float f7) {
        zx zxVar = this.b;
        if (f7 != 1.0f || zxVar.e0[1].getVisibility() == 0 || zxVar.j2) {
            if (zxVar.i3) {
                zxVar.e0[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                zxVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * zxVar.e0[0].getMeasuredWidth()));
            } else {
                zxVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f7);
                zxVar.e0[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - zxVar.e0[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                yx[] yxVarArr = zxVar.e0;
                yx yxVar = yxVarArr[0];
                yxVarArr[0] = yxVarArr[1];
                yxVarArr[1] = yxVar;
                yxVar.setVisibility(8);
                zx.j1(zxVar, true);
                zxVar.f5(false);
                zxVar.z0.O = false;
                zxVar.C3(zxVar.e0[0]);
                zxVar.e0[0].d.getClass();
                zxVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.pz pzVar, boolean z10) {
        int i10;
        int i11;
        zx zxVar = this.b;
        int i12 = zxVar.e0[0].h;
        int i13 = pzVar.a;
        if (i12 == i13) {
            return;
        }
        if (pzVar.f) {
            zxVar.z0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.k2) zxVar).currentAccount;
            zxVar.showDialog(new kg.q0(3, i11, this.a, zxVar, null));
            return;
        }
        ArrayList S0 = zxVar.getMessagesController().S0();
        if (pzVar.e || ((i10 = pzVar.a) >= 0 && i10 < S0.size())) {
            yx yxVar = zxVar.e0[1];
            yxVar.h = pzVar.a;
            yxVar.setVisibility(0);
            zxVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            zx.j1(zxVar, false);
            zxVar.d5(true);
            zxVar.i3 = z10;
        }
    }

    public final void d(org.telegram.messenger.bp bpVar) {
        boolean d = bpVar.d();
        zx zxVar = this.b;
        if (d) {
            org.telegram.ui.Components.j00.g1(zxVar, bpVar.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zxVar.getParentActivity());
        String L0 = org.telegram.messenger.dd.L0(2131750791, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new qv(3, this, bpVar));
        zxVar.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, zxVar.getResourceProvider());
        }
    }
}
