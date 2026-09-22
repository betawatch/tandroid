package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zc1 implements org.telegram.ui.Components.to0, org.telegram.ui.Components.i20 {
    public final /* synthetic */ xd1 a;

    public /* synthetic */ zc1(xd1 xd1Var) {
        this.a = xd1Var;
    }

    @Override // org.telegram.ui.Components.to0
    public void X(float f7, boolean z10) {
        xd1 xd1Var = this.a;
        xd1Var.l1 = f7;
        xd1Var.k1();
    }

    @Override // org.telegram.ui.Components.to0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.to0
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
        xd1 xd1Var = this.a;
        Scroller scroller = xd1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        xd1Var.c.fling((int) xd1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) xd1Var.W1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        xd1Var.x0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.i20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        xd1 xd1Var = this.a;
        Scroller scroller = xd1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        xd1Var.X1 = Utilities.clamp(xd1Var.X1 + f7, xd1Var.W1, 0.0f);
        xd1Var.V0();
        xd1Var.x0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.i20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.to0
    public void B() {
    }

    @Override // org.telegram.ui.Components.i20
    public void b1() {
    }

    @Override // org.telegram.ui.Components.i20
    public void onLongPress(MotionEvent motionEvent) {
    }
}
