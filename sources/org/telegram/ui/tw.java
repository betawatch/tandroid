package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class tw implements org.telegram.ui.Components.lz {
    public final /* synthetic */ Context a;
    public final /* synthetic */ cx b;

    public tw(Context context, cx cxVar) {
        this.b = cxVar;
        this.a = context;
    }

    public final int a(int i7) {
        cx cxVar = this.b;
        if (cxVar.T0 == 3) {
            return 0;
        }
        if (i7 == cxVar.A0.getDefaultTabId()) {
            return cxVar.getMessagesStorage().L;
        }
        ArrayList V0 = cxVar.getMessagesController().V0();
        if (i7 < 0 || i7 >= V0.size()) {
            return 0;
        }
        return ((org.telegram.messenger.ro) cxVar.getMessagesController().V0().get(i7)).d;
    }

    public final void b(float f10) {
        cx cxVar = this.b;
        if (f10 != 1.0f || cxVar.f0[1].getVisibility() == 0 || cxVar.l2) {
            if (cxVar.k3) {
                cxVar.f0[0].setTranslationX((-f10) * r3.getMeasuredWidth());
                cxVar.f0[1].setTranslationX(r3[0].getMeasuredWidth() - (f10 * cxVar.f0[0].getMeasuredWidth()));
            } else {
                cxVar.f0[0].setTranslationX(r3.getMeasuredWidth() * f10);
                cxVar.f0[1].setTranslationX((f10 * r3[0].getMeasuredWidth()) - cxVar.f0[0].getMeasuredWidth());
            }
            if (f10 == 1.0f) {
                bx[] bxVarArr = cxVar.f0;
                bx bxVar = bxVarArr[0];
                bxVarArr[0] = bxVarArr[1];
                bxVarArr[1] = bxVar;
                bxVar.setVisibility(8);
                cx.i1(cxVar, true);
                cxVar.n5(false);
                cxVar.C5(-1, true);
                cxVar.A0.P = false;
                cxVar.C3(cxVar.f0[0]);
                cxVar.f0[0].d.getClass();
                cxVar.f0[1].d.getClass();
            }
        }
    }

    public final void c(org.telegram.ui.Components.mz mzVar, boolean z10) {
        int i7;
        int i10;
        cx cxVar = this.b;
        int i11 = cxVar.f0[0].h;
        int i12 = mzVar.a;
        if (i11 == i12) {
            return;
        }
        if (mzVar.f) {
            cxVar.A0.l(i12);
            i10 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
            cxVar.showDialog(new ug.l0(3, i10, this.a, cxVar, null));
            return;
        }
        ArrayList V0 = cxVar.getMessagesController().V0();
        if (mzVar.e || ((i7 = mzVar.a) >= 0 && i7 < V0.size())) {
            bx bxVar = cxVar.f0[1];
            bxVar.h = mzVar.a;
            bxVar.setVisibility(0);
            cxVar.f0[1].setTranslationX(r0[0].getMeasuredWidth());
            cx.i1(cxVar, false);
            cxVar.l5(true);
            cxVar.C5(mzVar.a, true);
            cxVar.k3 = z10;
        }
    }

    public final void d(org.telegram.messenger.ro roVar) {
        boolean c10 = roVar.c();
        cx cxVar = this.b;
        if (c10) {
            org.telegram.ui.Components.g00.h1(cxVar, roVar.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cxVar.getParentActivity());
        String M0 = org.telegram.messenger.gd.M0(2131750779, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = org.telegram.messenger.gd.M0(2131750778, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new at(5, this, roVar));
        cxVar.showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, cxVar.getResourceProvider());
        }
    }
}
