package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rb1 implements org.telegram.ui.Components.zn0, org.telegram.ui.Components.e20 {
    public final /* synthetic */ qc1 a;

    public /* synthetic */ rb1(qc1 qc1Var) {
        this.a = qc1Var;
    }

    @Override // org.telegram.ui.Components.zn0
    public void W(float f9, boolean z10) {
        qc1 qc1Var = this.a;
        qc1Var.h1 = f9;
        qc1Var.k1();
    }

    @Override // org.telegram.ui.Components.zn0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.zn0
    public /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.e20
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.e20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        qc1 qc1Var = this.a;
        Scroller scroller = qc1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        qc1Var.c.fling((int) qc1Var.T1, 0, Math.round(-f9), Math.round(f10), 0, (int) qc1Var.S1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        qc1Var.t0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.e20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
        qc1 qc1Var = this.a;
        Scroller scroller = qc1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        qc1Var.T1 = Utilities.clamp(qc1Var.T1 + f9, qc1Var.S1, 0.0f);
        qc1Var.V0();
        qc1Var.t0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.e20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.e20
    public void a1() {
    }

    @Override // org.telegram.ui.Components.e20
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.zn0
    public void v() {
    }
}
