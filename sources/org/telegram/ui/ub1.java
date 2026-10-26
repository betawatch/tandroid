package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ub1 implements org.telegram.ui.Components.kp0, org.telegram.ui.Components.t20 {
    public final /* synthetic */ tc1 a;

    public /* synthetic */ ub1(tc1 tc1Var) {
        this.a = tc1Var;
    }

    @Override // org.telegram.ui.Components.kp0
    public void U(float f7, boolean z10) {
        tc1 tc1Var = this.a;
        tc1Var.m1 = f7;
        tc1Var.l1();
    }

    @Override // org.telegram.ui.Components.kp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.kp0
    public /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.t20
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.t20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        tc1 tc1Var = this.a;
        Scroller scroller = tc1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        tc1Var.c.fling((int) tc1Var.Y1, 0, Math.round(-f7), Math.round(f10), 0, (int) tc1Var.X1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        tc1Var.y0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.t20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        tc1 tc1Var = this.a;
        Scroller scroller = tc1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        tc1Var.Y1 = Utilities.clamp(tc1Var.Y1 + f7, tc1Var.X1, 0.0f);
        tc1Var.W0();
        tc1Var.y0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.t20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.t20
    public void a1() {
    }

    @Override // org.telegram.ui.Components.kp0
    public void y() {
    }

    @Override // org.telegram.ui.Components.t20
    public void onLongPress(MotionEvent motionEvent) {
    }
}
