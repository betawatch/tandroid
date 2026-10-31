package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y50 implements org.telegram.ui.Components.hk0, tb0 {
    public final /* synthetic */ c60 a;

    public /* synthetic */ y50(c60 c60Var) {
        this.a = c60Var;
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x9;
        c60 c60Var = this.a;
        if (z10) {
            if (!org.telegram.messenger.i0.J1(c60Var)) {
                return;
            }
            yb0 yb0Var = new yb0(4);
            yb0Var.n0 = 0L;
            yb0Var.N0 = new y50(c60Var);
            c60Var.presentFragment(yb0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.p8) || c60Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.k1 k1Var = c60Var.x;
        if (k1Var == null || !k1Var.isShowing()) {
            m4.n0 n0Var = new m4.n0(c60Var.getParentActivity(), null, new e(c60Var, 19), true, 1, null);
            n0Var.t(c60Var.W);
            org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.a, -2, -2);
            c60Var.x = k1Var2;
            k1Var2.e = true;
            k1Var2.c = org.telegram.messenger.zs.x3;
            k1Var2.setOutsideTouchable(true);
            c60Var.x.setClippingEnabled(true);
            c60Var.x.setAnimationStyle(R.style.PopupContextAnimation);
            c60Var.x.setFocusable(true);
            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.a).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
            c60Var.x.setInputMethodMode(2);
            c60Var.x.getContentView().setFocusableInTouchMode(true);
            c60Var.x.showAtLocation(c60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.a).getMeasuredHeight() / 2.0f) + view.getY() + f10));
            c60Var.x.b();
        }
    }

    @Override // org.telegram.ui.tb0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        c60 c60Var = this.a;
        Location location = c60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        c60Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
