package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class yc1 implements org.telegram.ui.Components.eo0, org.telegram.ui.Components.i20 {
    public final /* synthetic */ wd1 a;

    public /* synthetic */ yc1(wd1 wd1Var) {
        this.a = wd1Var;
    }

    @Override // org.telegram.ui.Components.eo0
    public void X(float f7, boolean z10) {
        wd1 wd1Var = this.a;
        wd1Var.l1 = f7;
        wd1Var.k1();
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ int l0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.i20
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.i20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        wd1 wd1Var = this.a;
        Scroller scroller = wd1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        wd1Var.c.fling((int) wd1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) wd1Var.W1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        wd1Var.x0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.i20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        wd1 wd1Var = this.a;
        Scroller scroller = wd1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        wd1Var.X1 = Utilities.clamp(wd1Var.X1 + f7, wd1Var.W1, 0.0f);
        wd1Var.V0();
        wd1Var.x0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.i20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.eo0
    public void B() {
    }

    @Override // org.telegram.ui.Components.i20
    public void b1() {
    }

    @Override // org.telegram.ui.Components.i20
    public void onLongPress(MotionEvent motionEvent) {
    }
}
