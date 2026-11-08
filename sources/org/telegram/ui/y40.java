package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y40 implements org.telegram.ui.Components.cj0, ma0 {
    public final /* synthetic */ d50 a;

    public /* synthetic */ y40(d50 d50Var) {
        this.a = d50Var;
    }

    @Override // org.telegram.ui.ma0
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        d50 d50Var = this.a;
        Location location = d50Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        d50Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        boolean z9 = view instanceof org.telegram.ui.Cells.w9;
        d50 d50Var = this.a;
        if (z9) {
            if (!org.telegram.messenger.g0.J1(d50Var)) {
                return;
            }
            pa0 pa0Var = new pa0(4);
            pa0Var.l0 = 0L;
            pa0Var.G0 = new y40(d50Var);
            d50Var.presentFragment(pa0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.m8) || d50Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = d50Var.x;
        if (g1Var == null || !g1Var.isShowing()) {
            org.telegram.messenger.re reVar = new org.telegram.messenger.re(d50Var.getParentActivity(), null, new f(d50Var, 19), true, 1, null);
            reVar.u(d50Var.W);
            org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.b, -2, -2);
            d50Var.x = g1Var2;
            g1Var2.e = true;
            g1Var2.c = org.telegram.messenger.qs.x3;
            g1Var2.setOutsideTouchable(true);
            d50Var.x.setClippingEnabled(true);
            d50Var.x.setAnimationStyle(R.style.PopupContextAnimation);
            d50Var.x.setFocusable(true);
            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.b).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            d50Var.x.setInputMethodMode(2);
            d50Var.x.getContentView().setFocusableInTouchMode(true);
            d50Var.x.showAtLocation(d50Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) reVar.b).getMeasuredHeight() / 2.0f) + view.getY() + f11));
            d50Var.x.b();
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
