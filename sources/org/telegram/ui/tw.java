package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class tw implements org.telegram.ui.Components.nz {
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

    public final void c(org.telegram.ui.Components.oz ozVar, boolean z10) {
        int i7;
        int i10;
        cx cxVar = this.b;
        int i11 = cxVar.f0[0].h;
        int i12 = ozVar.a;
        if (i11 == i12) {
            return;
        }
        if (ozVar.f) {
            cxVar.A0.l(i12);
            i10 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
            cxVar.showDialog(new ug.k0(3, i10, this.a, cxVar, null));
            return;
        }
        ArrayList V0 = cxVar.getMessagesController().V0();
        if (ozVar.e || ((i7 = ozVar.a) >= 0 && i7 < V0.size())) {
            bx bxVar = cxVar.f0[1];
            bxVar.h = ozVar.a;
            bxVar.setVisibility(0);
            cxVar.f0[1].setTranslationX(r0[0].getMeasuredWidth());
            cx.i1(cxVar, false);
            cxVar.l5(true);
            cxVar.C5(ozVar.a, true);
            cxVar.k3 = z10;
        }
    }

    public final void d(org.telegram.messenger.ro roVar) {
        boolean c10 = roVar.c();
        cx cxVar = this.b;
        if (c10) {
            org.telegram.ui.Components.i00.h1(cxVar, roVar.a, null);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(cxVar.getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131750778, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131750777, null);
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new at(5, this, roVar));
        cxVar.showDialog(t1Var);
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, cxVar.getResourceProvider());
        }
    }
}
