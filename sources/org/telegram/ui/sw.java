package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sw implements org.telegram.ui.Components.kz {
    public final /* synthetic */ Context a;
    public final /* synthetic */ bx b;

    public sw(Context context, bx bxVar) {
        this.b = bxVar;
        this.a = context;
    }

    public final int a(int i7) {
        bx bxVar = this.b;
        if (bxVar.T0 == 3) {
            return 0;
        }
        if (i7 == bxVar.A0.getDefaultTabId()) {
            return bxVar.getMessagesStorage().L;
        }
        ArrayList V0 = bxVar.getMessagesController().V0();
        if (i7 < 0 || i7 >= V0.size()) {
            return 0;
        }
        return ((org.telegram.messenger.ro) bxVar.getMessagesController().V0().get(i7)).d;
    }

    public final void b(float f10) {
        bx bxVar = this.b;
        if (f10 != 1.0f || bxVar.f0[1].getVisibility() == 0 || bxVar.l2) {
            if (bxVar.k3) {
                bxVar.f0[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                bxVar.f0[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * bxVar.f0[0].getMeasuredWidth()));
            } else {
                bxVar.f0[0].setTranslationX(r3.getMeasuredWidth() * f10);
                bxVar.f0[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - bxVar.f0[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                ax[] axVarArr = bxVar.f0;
                ax axVar = axVarArr[0];
                axVarArr[0] = axVarArr[1];
                axVarArr[1] = axVar;
                axVar.setVisibility(8);
                bx.i1(bxVar, true);
                bxVar.n5(false);
                bxVar.C5(-1, true);
                bxVar.A0.P = false;
                bxVar.C3(bxVar.f0[0]);
                bxVar.f0[0].d.getClass();
                bxVar.f0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.lz lzVar, boolean z10) {
        int i7;
        int i10;
        bx bxVar = this.b;
        int i11 = bxVar.f0[0].h;
        int i12 = lzVar.a;
        if (i11 == i12) {
            return;
        }
        if (lzVar.f) {
            bxVar.A0.l(i12);
            i10 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
            bxVar.showDialog(new ug.k0(3, i10, this.a, bxVar, null));
            return;
        }
        ArrayList V0 = bxVar.getMessagesController().V0();
        if (lzVar.e || ((i7 = lzVar.a) >= 0 && i7 < V0.size())) {
            ax axVar = bxVar.f0[1];
            axVar.h = lzVar.a;
            axVar.setVisibility(0);
            bxVar.f0[1].setTranslationX(r0[0].getMeasuredWidth());
            bx.i1(bxVar, false);
            bxVar.l5(true);
            bxVar.C5(lzVar.a, true);
            bxVar.k3 = z10;
        }
    }

    public final void d(org.telegram.messenger.ro roVar) {
        boolean c10 = roVar.c();
        bx bxVar = this.b;
        if (c10) {
            org.telegram.ui.Components.g00.h1(bxVar, roVar.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bxVar.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131750778, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131750777, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new zs(5, this, roVar));
        bxVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, bxVar.getResourceProvider());
        }
    }
}
