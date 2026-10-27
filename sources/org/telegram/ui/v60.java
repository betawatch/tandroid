package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v60 implements org.telegram.ui.Components.bm0, mc0 {
    public final /* synthetic */ z60 a;

    public /* synthetic */ v60(z60 z60Var) {
        this.a = z60Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.mc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        z60 z60Var = this.a;
        Location location = z60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        z60Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ga;
        z60 z60Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(z60Var)) {
                return;
            }
            rc0 rc0Var = new rc0(4);
            rc0Var.e0 = 0L;
            rc0Var.E0 = new v60(z60Var);
            z60Var.presentFragment(rc0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.v8) || z60Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.o1 o1Var = z60Var.w;
        if (o1Var == null || !o1Var.isShowing()) {
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8(z60Var.getParentActivity(), null, new f(z60Var, 22), true, 1, null);
            r8Var.b(z60Var.W);
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(r8Var.a, -2, -2);
            z60Var.w = o1Var2;
            o1Var2.e = true;
            o1Var2.c = 220;
            o1Var2.setOutsideTouchable(true);
            z60Var.w.setClippingEnabled(true);
            z60Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            z60Var.w.setFocusable(true);
            r8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            z60Var.w.setInputMethodMode(2);
            z60Var.w.getContentView().setFocusableInTouchMode(true);
            z60Var.w.showAtLocation(z60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((r8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
            z60Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
