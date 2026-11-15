package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class u61 implements org.telegram.ui.Components.pm0, org.telegram.ui.Components.c10 {
    public final /* synthetic */ t71 a;

    public /* synthetic */ u61(t71 t71Var) {
        this.a = t71Var;
    }

    @Override // org.telegram.ui.Components.pm0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.pm0
    public void l(boolean z10, float f10) {
        t71 t71Var = this.a;
        t71Var.n1 = f10;
        t71Var.p1();
    }

    @Override // org.telegram.ui.Components.c10
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.c10
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        t71 t71Var = this.a;
        Scroller scroller = t71Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        t71Var.c.fling((int) t71Var.Z1, 0, Math.round(-f10), Math.round(f11), 0, (int) t71Var.Y1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        t71Var.z0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.c10
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        t71 t71Var = this.a;
        Scroller scroller = t71Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        t71Var.Z1 = Utilities.i(t71Var.Z1 + f10, t71Var.Y1, 0.0f);
        t71Var.a1();
        t71Var.z0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.c10
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.pm0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.c10
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.pm0
    public void C() {
    }

    @Override // org.telegram.ui.Components.c10
    public void a1() {
    }
}
