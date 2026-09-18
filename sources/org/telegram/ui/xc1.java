package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class xc1 implements org.telegram.ui.Components.so0, org.telegram.ui.Components.i20 {
    public final /* synthetic */ vd1 a;

    public /* synthetic */ xc1(vd1 vd1Var) {
        this.a = vd1Var;
    }

    @Override // org.telegram.ui.Components.so0
    public void X(float f7, boolean z10) {
        vd1 vd1Var = this.a;
        vd1Var.l1 = f7;
        vd1Var.k1();
    }

    @Override // org.telegram.ui.Components.so0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.so0
    public /* synthetic */ int m0() {
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
        vd1 vd1Var = this.a;
        Scroller scroller = vd1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        vd1Var.c.fling((int) vd1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) vd1Var.W1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        vd1Var.x0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.i20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        vd1 vd1Var = this.a;
        Scroller scroller = vd1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        vd1Var.X1 = Utilities.clamp(vd1Var.X1 + f7, vd1Var.W1, 0.0f);
        vd1Var.V0();
        vd1Var.x0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.i20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.so0
    public void B() {
    }

    @Override // org.telegram.ui.Components.i20
    public void b1() {
    }

    @Override // org.telegram.ui.Components.i20
    public void onLongPress(MotionEvent motionEvent) {
    }
}
