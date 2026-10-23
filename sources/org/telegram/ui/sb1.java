package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class sb1 implements org.telegram.ui.Components.gp0, org.telegram.ui.Components.r20 {
    public final /* synthetic */ qc1 a;

    public /* synthetic */ sb1(qc1 qc1Var) {
        this.a = qc1Var;
    }

    @Override // org.telegram.ui.Components.gp0
    public void L(float f7, boolean z10) {
        qc1 qc1Var = this.a;
        qc1Var.m1 = f7;
        qc1Var.k1();
    }

    @Override // org.telegram.ui.Components.gp0
    public /* synthetic */ int Y() {
        return 0;
    }

    @Override // org.telegram.ui.Components.gp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        qc1 qc1Var = this.a;
        Scroller scroller = qc1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        qc1Var.c.fling((int) qc1Var.Y1, 0, Math.round(-f7), Math.round(f10), 0, (int) qc1Var.X1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        qc1Var.y0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        qc1 qc1Var = this.a;
        Scroller scroller = qc1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        qc1Var.Y1 = Utilities.clamp(qc1Var.Y1 + f7, qc1Var.X1, 0.0f);
        qc1Var.V0();
        qc1Var.y0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.r20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.r20
    public void N0() {
    }

    @Override // org.telegram.ui.Components.r20
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.gp0
    public void v() {
    }
}
