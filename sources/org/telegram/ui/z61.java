package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class z61 implements org.telegram.ui.Components.mm0, org.telegram.ui.Components.z00 {
    public final /* synthetic */ w71 a;

    public /* synthetic */ z61(w71 w71Var) {
        this.a = w71Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.mm0
    public void l(boolean z9, float f10) {
        w71 w71Var = this.a;
        w71Var.m1 = f10;
        w71Var.p1();
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
        w71 w71Var = this.a;
        Scroller scroller = w71Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        w71Var.c.fling((int) w71Var.Y1, 0, Math.round(-f10), Math.round(f11), 0, (int) w71Var.X1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        w71Var.y0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.z00
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        w71 w71Var = this.a;
        Scroller scroller = w71Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        w71Var.Y1 = Utilities.i(w71Var.Y1 + f10, w71Var.X1, 0.0f);
        w71Var.a1();
        w71Var.y0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.z00
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.mm0
    public /* synthetic */ int q0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.z00
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.mm0
    public void D() {
    }

    @Override // org.telegram.ui.Components.z00
    public void d1() {
    }
}
