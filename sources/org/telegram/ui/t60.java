package org.telegram.ui;

import android.location.Location;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t60 implements org.telegram.ui.Components.am0, kc0 {
    public final /* synthetic */ x60 a;

    public /* synthetic */ t60(x60 x60Var) {
        this.a = x60Var;
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.kc0
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        x60 x60Var = this.a;
        Location location = x60Var.U;
        location.setLatitude(messageMedia.geo.lat);
        location.setLongitude(messageMedia.geo._long);
        x60Var.T = messageMedia.address;
    }

    @Override // org.telegram.ui.Components.am0
    public void e(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.ga;
        x60 x60Var = this.a;
        if (z10) {
            if (!AndroidUtilities.isMapsInstalled(x60Var)) {
                return;
            }
            pc0 pc0Var = new pc0(4);
            pc0Var.e0 = 0L;
            pc0Var.E0 = new t60(x60Var);
            x60Var.presentFragment(pc0Var);
        }
        if (!(view instanceof org.telegram.ui.Cells.v8) || x60Var.P == 5) {
            return;
        }
        org.telegram.ui.ActionBar.o1 o1Var = x60Var.w;
        if (o1Var == null || !o1Var.isShowing()) {
            org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8(x60Var.getParentActivity(), null, new f(x60Var, 22), true, 1, null);
            r8Var.b(x60Var.W);
            org.telegram.ui.ActionBar.o1 o1Var2 = new org.telegram.ui.ActionBar.o1(r8Var.a, -2, -2);
            x60Var.w = o1Var2;
            o1Var2.e = true;
            o1Var2.c = 220;
            o1Var2.setOutsideTouchable(true);
            x60Var.w.setClippingEnabled(true);
            x60Var.w.setAnimationStyle(R.style.PopupContextAnimation);
            x60Var.w.setFocusable(true);
            r8Var.a.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), TLObject.FLAG_31));
            x60Var.w.setInputMethodMode(2);
            x60Var.w.getContentView().setFocusableInTouchMode(true);
            x60Var.w.showAtLocation(x60Var.getFragmentView(), 0, (int) (view.getX() + f7), (int) ((r8Var.a.getMeasuredHeight() / 2.0f) + view.getY() + f10));
            x60Var.w.b();
        }
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
