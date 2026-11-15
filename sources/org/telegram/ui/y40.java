package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class y40 implements org.telegram.ui.Components.hj0, ma0 {
    public final /* synthetic */ c50 a;

    public /* synthetic */ y40(c50 c50Var) {
        this.a = c50Var;
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ma0
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        c50 c50Var = this.a;
        Location location = c50Var.V;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        c50Var.U = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.v9;
        c50 c50Var = this.a;
        if (z10) {
            if (!org.telegram.messenger.g0.J1(c50Var)) {
                return;
            }
            pa0 pa0Var = new pa0(4);
            pa0Var.m0 = 0L;
            pa0Var.H0 = new y40(c50Var);
            c50Var.presentFragment(pa0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.l8) || c50Var.Q == 5) {
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = c50Var.x;
        if (g1Var == null || !g1Var.isShowing()) {
            org.telegram.messenger.qe qeVar = new org.telegram.messenger.qe(c50Var.getParentActivity(), null, new f(c50Var, 19), true, 1, null);
            qeVar.u(c50Var.X);
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.b, -2, -2);
            c50Var.x = g1Var2;
            g1Var2.e = true;
            g1Var2.c = org.telegram.messenger.ns.x3;
            g1Var2.setOutsideTouchable(true);
            c50Var.x.setClippingEnabled(true);
            c50Var.x.setAnimationStyle(R.style.PopupContextAnimation);
            c50Var.x.setFocusable(true);
            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            c50Var.x.setInputMethodMode(2);
            c50Var.x.getContentView().setFocusableInTouchMode(true);
            c50Var.x.showAtLocation(c50Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) qeVar.b).getMeasuredHeight() / 2.0f) + view.getY() + f11));
            c50Var.x.b();
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
