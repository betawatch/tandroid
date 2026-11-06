package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class x61 implements org.telegram.ui.Components.lm0, org.telegram.ui.Components.y00 {
    public final /* synthetic */ u71 a;

    public /* synthetic */ x61(u71 u71Var) {
        this.a = u71Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.lm0
    public void l(boolean z9, float f10) {
        u71 u71Var = this.a;
        u71Var.m1 = f10;
        u71Var.p1();
    }

    @Override // org.telegram.ui.Components.y00
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.y00
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        u71 u71Var = this.a;
        Scroller scroller = u71Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        u71Var.c.fling((int) u71Var.Y1, 0, Math.round(-f10), Math.round(f11), 0, (int) u71Var.X1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        u71Var.y0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.y00
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        u71 u71Var = this.a;
        Scroller scroller = u71Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        u71Var.Y1 = Utilities.i(u71Var.Y1 + f10, u71Var.X1, 0.0f);
        u71Var.a1();
        u71Var.y0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.y00
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.lm0
    public /* synthetic */ int q0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.y00
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.lm0
    public void D() {
    }

    @Override // org.telegram.ui.Components.y00
    public void d1() {
    }
}
