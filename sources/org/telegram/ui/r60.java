package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r60 implements org.telegram.ui.Components.bm0, nc0 {
    public final /* synthetic */ w60 a;

    public /* synthetic */ r60(w60 w60Var) {
        this.a = w60Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.nc0
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        w60 w60Var = this.a;
        Location location = w60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        w60Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ca;
        w60 w60Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(w60Var)) {
                return;
            }
            sc0 sc0Var = new sc0(4);
            sc0Var.e0 = 0L;
            sc0Var.F0 = new r60(w60Var);
            w60Var.presentFragment(sc0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.r8) || w60Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.m1 m1Var = w60Var.w;
        if (m1Var == null || !m1Var.isShowing()) {
            org.telegram.ui.Components.p8 p8Var = new org.telegram.ui.Components.p8(w60Var.getParentActivity(), null, new f(w60Var, 22), true, 1, null);
            p8Var.b(w60Var.W);
            org.telegram.ui.ActionBar.m1 m1Var2 = new org.telegram.ui.ActionBar.m1(p8Var.a, -2, -2);
            w60Var.w = m1Var2;
            m1Var2.e = true;
            m1Var2.c = 220;
            m1Var2.setOutsideTouchable(true);
            w60Var.w.setClippingEnabled(true);
            w60Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            w60Var.w.setFocusable(true);
            p8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            w60Var.w.setInputMethodMode(2);
            w60Var.w.getContentView().setFocusableInTouchMode(true);
            w60Var.w.showAtLocation(w60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((p8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
            w60Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
