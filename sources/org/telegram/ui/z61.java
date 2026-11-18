package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class z61 implements org.telegram.ui.Components.xm0, org.telegram.ui.Components.j10 {
    public final /* synthetic */ x71 a;

    public /* synthetic */ z61(x71 x71Var) {
        this.a = x71Var;
    }

    @Override // org.telegram.ui.Components.xm0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.xm0
    public void n(boolean z10, float f10) {
        x71 x71Var = this.a;
        x71Var.n1 = f10;
        x71Var.p1();
    }

    @Override // org.telegram.ui.Components.j10
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.j10
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        x71 x71Var = this.a;
        Scroller scroller = x71Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        x71Var.c.fling((int) x71Var.Z1, 0, Math.round(-f10), Math.round(f11), 0, (int) x71Var.Y1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        x71Var.z0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.j10
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        x71 x71Var = this.a;
        Scroller scroller = x71Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        x71Var.Z1 = Utilities.i(x71Var.Z1 + f10, x71Var.Y1, 0.0f);
        x71Var.a1();
        x71Var.z0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.j10
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.xm0
    public /* synthetic */ int r0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.j10
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.xm0
    public void C() {
    }

    @Override // org.telegram.ui.Components.j10
    public void a1() {
    }
}
