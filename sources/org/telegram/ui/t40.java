package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t40 implements org.telegram.ui.Components.gj0, ia0 {
    public final /* synthetic */ y40 a;

    public /* synthetic */ t40(y40 y40Var) {
        this.a = y40Var;
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.v9;
        y40 y40Var = this.a;
        if (z10) {
            if (!org.telegram.messenger.g0.J1(y40Var)) {
                return;
            }
            la0 la0Var = new la0(4);
            la0Var.m0 = 0L;
            la0Var.H0 = new t40(y40Var);
            y40Var.presentFragment(la0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.l8) || y40Var.Q == 5) {
            return;
        }
        org.telegram.ui.ActionBar.f1 f1Var = y40Var.x;
        if (f1Var == null || !f1Var.isShowing()) {
            o4.m0 m0Var = new o4.m0(y40Var.getParentActivity(), null, new f(y40Var, 19), true, 1, null);
            m0Var.t(y40Var.X);
            org.telegram.ui.ActionBar.f1 f1Var2 = new org.telegram.ui.ActionBar.f1((ActionBarPopupWindow$ActionBarPopupWindowLayout) m0Var.a, -2, -2);
            y40Var.x = f1Var2;
            f1Var2.e = true;
            f1Var2.c = org.telegram.messenger.hs.x3;
            f1Var2.setOutsideTouchable(true);
            y40Var.x.setClippingEnabled(true);
            y40Var.x.setAnimationStyle(R.style.PopupContextAnimation);
            y40Var.x.setFocusable(true);
            ((ActionBarPopupWindow$ActionBarPopupWindowLayout) m0Var.a).measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(1000.0f), TLObject.FLAG_31));
            y40Var.x.setInputMethodMode(2);
            y40Var.x.getContentView().setFocusableInTouchMode(true);
            y40Var.x.showAtLocation(y40Var.getFragmentView(), 0, (int) (view.getX() + f10), (int) ((((ActionBarPopupWindow$ActionBarPopupWindowLayout) m0Var.a).getMeasuredHeight() / 2.0f) + view.getY() + f11));
            y40Var.x.b();
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    @Override // org.telegram.ui.ia0
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        y40 y40Var = this.a;
        Location location = y40Var.V;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        y40Var.U = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
