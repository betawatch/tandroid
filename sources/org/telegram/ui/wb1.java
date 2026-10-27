package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wb1 implements org.telegram.ui.Components.lp0, org.telegram.ui.Components.t20 {
    public final /* synthetic */ vc1 a;

    public /* synthetic */ wb1(vc1 vc1Var) {
        this.a = vc1Var;
    }

    @Override // org.telegram.ui.Components.lp0
    public void U(float f7, boolean z10) {
        vc1 vc1Var = this.a;
        vc1Var.m1 = f7;
        vc1Var.l1();
    }

    @Override // org.telegram.ui.Components.lp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.lp0
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
        vc1 vc1Var = this.a;
        Scroller scroller = vc1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        vc1Var.c.fling((int) vc1Var.Y1, 0, Math.round(-f7), Math.round(f10), 0, (int) vc1Var.X1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        vc1Var.y0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.t20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        vc1 vc1Var = this.a;
        Scroller scroller = vc1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        vc1Var.Y1 = Utilities.clamp(vc1Var.Y1 + f7, vc1Var.X1, 0.0f);
        vc1Var.W0();
        vc1Var.y0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.t20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.t20
    public void a1() {
    }

    @Override // org.telegram.ui.Components.lp0
    public void y() {
    }

    @Override // org.telegram.ui.Components.t20
    public void onLongPress(MotionEvent motionEvent) {
    }
}
