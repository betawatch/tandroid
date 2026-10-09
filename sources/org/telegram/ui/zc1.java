package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zc1 implements org.telegram.ui.Components.jp0, org.telegram.ui.Components.z20 {
    public final /* synthetic */ xd1 a;

    public /* synthetic */ zc1(xd1 xd1Var) {
        this.a = xd1Var;
    }

    @Override // org.telegram.ui.Components.jp0
    public void X(float f7, boolean z10) {
        xd1 xd1Var = this.a;
        xd1Var.l1 = f7;
        xd1Var.k1();
    }

    @Override // org.telegram.ui.Components.jp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.jp0
    public /* synthetic */ int i0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.z20
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.z20
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

    @Override // org.telegram.ui.Components.z20
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

    @Override // org.telegram.ui.Components.z20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.z20
    public void W0() {
    }

    @Override // org.telegram.ui.Components.z20
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.jp0
    public void z() {
    }
}
