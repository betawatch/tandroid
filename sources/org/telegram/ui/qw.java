package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qw implements org.telegram.ui.Components.az {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zw b;

    public qw(Context context, zw zwVar) {
        this.b = zwVar;
        this.a = context;
    }

    public final int a(int i7) {
        zw zwVar = this.b;
        if (zwVar.S0 == 3) {
            return 0;
        }
        if (i7 == zwVar.z0.getDefaultTabId()) {
            return zwVar.getMessagesStorage().K;
        }
        ArrayList T0 = zwVar.getMessagesController().T0();
        if (i7 < 0 || i7 >= T0.size()) {
            return 0;
        }
        return ((org.telegram.messenger.vo) zwVar.getMessagesController().T0().get(i7)).d;
    }

    public final void b(float f10) {
        zw zwVar = this.b;
        if (f10 != 1.0f || zwVar.e0[1].getVisibility() == 0 || zwVar.k2) {
            if (zwVar.j3) {
                zwVar.e0[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                zwVar.e0[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * zwVar.e0[0].getMeasuredWidth()));
            } else {
                zwVar.e0[0].setTranslationX(r3.getMeasuredWidth() * f10);
                zwVar.e0[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - zwVar.e0[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                yw[] ywVarArr = zwVar.e0;
                yw ywVar = ywVarArr[0];
                ywVarArr[0] = ywVarArr[1];
                ywVarArr[1] = ywVar;
                ywVar.setVisibility(8);
                zw.j1(zwVar, true);
                zwVar.f5(false);
                zwVar.z0.O = false;
                zwVar.C3(zwVar.e0[0]);
                zwVar.e0[0].d.getClass();
                zwVar.e0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.bz bzVar, boolean z9) {
        int i7;
        int i10;
        zw zwVar = this.b;
        int i11 = zwVar.e0[0].h;
        int i12 = bzVar.a;
        if (i11 == i12) {
            return;
        }
        if (bzVar.f) {
            zwVar.z0.i(i12);
            i10 = ((org.telegram.ui.ActionBar.f2) zwVar).currentAccount;
            zwVar.showDialog(new ug.i0(3, i10, this.a, zwVar, null));
            return;
        }
        ArrayList T0 = zwVar.getMessagesController().T0();
        if (bzVar.e || ((i7 = bzVar.a) >= 0 && i7 < T0.size())) {
            yw ywVar = zwVar.e0[1];
            ywVar.h = bzVar.a;
            ywVar.setVisibility(0);
            zwVar.e0[1].setTranslationX(r7[0].getMeasuredWidth());
            zw.j1(zwVar, false);
            zwVar.d5(true);
            zwVar.j3 = z9;
        }
    }

    public final void d(org.telegram.messenger.vo voVar) {
        boolean d = voVar.d();
        zw zwVar = this.b;
        if (d) {
            org.telegram.ui.Components.vz.g1(zwVar, voVar.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zwVar.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131750790, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.id.M0(2131750789, null);
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new su(2, this, voVar));
        zwVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, zwVar.getResourceProvider());
        }
    }
}
