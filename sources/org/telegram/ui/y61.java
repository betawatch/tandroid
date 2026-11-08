package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class y61 implements org.telegram.ui.Components.lm0, org.telegram.ui.Components.z00 {
    public final /* synthetic */ v71 a;

    public /* synthetic */ y61(v71 v71Var) {
        this.a = v71Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.lm0
    public void l(boolean z9, float f10) {
        v71 v71Var = this.a;
        v71Var.m1 = f10;
        v71Var.p1();
    }

    @Override // org.telegram.ui.Components.z00
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.z00
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        v71 v71Var = this.a;
        Scroller scroller = v71Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        v71Var.c.fling((int) v71Var.Y1, 0, Math.round(-f10), Math.round(f11), 0, (int) v71Var.X1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        v71Var.y0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.z00
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        v71 v71Var = this.a;
        Scroller scroller = v71Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        v71Var.Y1 = Utilities.i(v71Var.Y1 + f10, v71Var.X1, 0.0f);
        v71Var.a1();
        v71Var.y0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.z00
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.lm0
    public /* synthetic */ int q0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.z00
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.lm0
    public void D() {
    }

    @Override // org.telegram.ui.Components.z00
    public void d1() {
    }
}
