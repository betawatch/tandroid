package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x50 implements org.telegram.ui.Components.ik0, sb0 {
    public final /* synthetic */ b60 a;

    public /* synthetic */ x50(b60 b60Var) {
        this.a = b60Var;
    }

    @Override // org.telegram.ui.Components.ik0
    public void b(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.x9;
        b60 b60Var = this.a;
        if (z10) {
            if (!org.telegram.messenger.i0.J1(b60Var)) {
                return;
            }
            xb0 xb0Var = new xb0(4);
            xb0Var.n0 = 0L;
            xb0Var.N0 = new x50(b60Var);
            b60Var.presentFragment(xb0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.p8) || b60Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.k1 k1Var = b60Var.x;
        if (k1Var == null || !k1Var.isShowing()) {
            m4.n0 n0Var = new m4.n0(b60Var.getParentActivity(), null, new e(b60Var, 19), true, 1, null);
            n0Var.t(b60Var.W);
            org.telegram.ui.ActionBar.k1 k1Var2 = new org.telegram.ui.ActionBar.k1((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.a, -2, -2);
            b60Var.x = k1Var2;
            k1Var2.e = true;
            k1Var2.c = org.telegram.messenger.at.x3;
            k1Var2.setOutsideTouchable(true);
            b60Var.x.setClippingEnabled(true);
            b60Var.x.setAnimationStyle(R.style.PopupContextAnimation);
            b60Var.x.setFocusable(true);
            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.a).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(1000.0f), TLObject.FLAG_31));
            b60Var.x.setInputMethodMode(2);
            b60Var.x.getContentView().setFocusableInTouchMode(true);
            b60Var.x.showAtLocation(b60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) n0Var.a).getMeasuredHeight() / 2.0f) + view.getY() + f10));
            b60Var.x.b();
        }
    }

    @Override // org.telegram.ui.sb0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        b60 b60Var = this.a;
        Location location = b60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        b60Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
