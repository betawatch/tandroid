package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rx implements org.telegram.ui.Components.oz {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ay b;

    public rx(Context context, ay ayVar) {
        this.b = ayVar;
        this.a = context;
    }

    public final int a(int i10) {
        ay ayVar = this.b;
        if (ayVar.R0 == 3) {
            return 0;
        }
        if (i10 == ayVar.z0.getDefaultTabId()) {
            return ayVar.getMessagesStorage().K;
        }
        ArrayList S0 = ayVar.getMessagesController().S0();
        if (i10 < 0 || i10 >= S0.size()) {
            return 0;
        }
        return ((org.telegram.messenger.ap) ayVar.getMessagesController().S0().get(i10)).d;
    }

    public final void b(float f7) {
        ay ayVar = this.b;
        if (f7 != 1.0f || ayVar.e0[1].getVisibility() == 0 || ayVar.j2) {
            if (ayVar.i3) {
                ayVar.e0[0].setTranslationX((-f7) * r3.getMeasuredWidth());
                ayVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f7 * ayVar.e0[0].getMeasuredWidth()));
            } else {
                ayVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f7);
                ayVar.e0[1].setTranslationX((f7 * r3[0].getMeasuredWidth()) - ayVar.e0[0].getMeasuredWidth());
            }
            if (f7 == 1.0f) {
                zx[] zxVarArr = ayVar.e0;
                zx zxVar = zxVarArr[0];
                zxVarArr[0] = zxVarArr[1];
                zxVarArr[1] = zxVar;
                zxVar.setVisibility(8);
                ay.i1(ayVar, true);
                ayVar.e5(false);
                ayVar.z0.O = false;
                ayVar.B3(ayVar.e0[0]);
                ayVar.e0[0].d.getClass();
                ayVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.pz pzVar, boolean z10) {
        int i10;
        int i11;
        ay ayVar = this.b;
        int i12 = ayVar.e0[0].h;
        int i13 = pzVar.a;
        if (i12 == i13) {
            return;
        }
        if (pzVar.f) {
            ayVar.z0.i(i13);
            i11 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
            ayVar.showDialog(new kg.q0(3, i11, this.a, ayVar, null));
            return;
        }
        ArrayList S0 = ayVar.getMessagesController().S0();
        if (pzVar.e || ((i10 = pzVar.a) >= 0 && i10 < S0.size())) {
            zx zxVar = ayVar.e0[1];
            zxVar.h = pzVar.a;
            zxVar.setVisibility(0);
            ayVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            ay.i1(ayVar, false);
            ayVar.c5(true);
            ayVar.i3 = z10;
        }
    }

    public final void d(org.telegram.messenger.ap apVar) {
        boolean d = apVar.d();
        ay ayVar = this.b;
        if (d) {
            org.telegram.ui.Components.j00.g1(ayVar, apVar.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ayVar.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131750791, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new rv(3, this, apVar));
        ayVar.showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, ayVar.getResourceProvider());
        }
    }
}
