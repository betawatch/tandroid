package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class rc1 implements org.telegram.ui.Components.yo0, org.telegram.ui.Components.m20 {
    public final /* synthetic */ pd1 a;

    public /* synthetic */ rc1(pd1 pd1Var) {
        this.a = pd1Var;
    }

    @Override // org.telegram.ui.Components.yo0
    public void Y(float f7, boolean z10) {
        pd1 pd1Var = this.a;
        pd1Var.l1 = f7;
        pd1Var.k1();
    }

    @Override // org.telegram.ui.Components.yo0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.m20
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.m20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        pd1 pd1Var = this.a;
        Scroller scroller = pd1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        pd1Var.c.fling((int) pd1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) pd1Var.W1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        pd1Var.x0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.m20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        pd1 pd1Var = this.a;
        Scroller scroller = pd1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        pd1Var.X1 = Utilities.clamp(pd1Var.X1 + f7, pd1Var.W1, 0.0f);
        pd1Var.V0();
        pd1Var.x0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.m20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.yo0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.yo0
    public void B() {
    }

    @Override // org.telegram.ui.Components.m20
    public void d1() {
    }

    @Override // org.telegram.ui.Components.m20
    public void onLongPress(MotionEvent motionEvent) {
    }
}
