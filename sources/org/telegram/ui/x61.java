package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x61 implements org.telegram.ui.Components.zm0, org.telegram.ui.Components.k10 {
    public final /* synthetic */ v71 a;

    public /* synthetic */ x61(v71 v71Var) {
        this.a = v71Var;
    }

    @Override // org.telegram.ui.Components.zm0
    public /* synthetic */ int a0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.zm0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.zm0
    public void j(boolean z10, float f10) {
        v71 v71Var = this.a;
        v71Var.n1 = f10;
        v71Var.p1();
    }

    @Override // org.telegram.ui.Components.k10
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.k10
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        v71 v71Var = this.a;
        Scroller scroller = v71Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        v71Var.c.fling((int) v71Var.Z1, 0, Math.round(-f10), Math.round(f11), 0, (int) v71Var.Y1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        v71Var.z0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.k10
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        v71 v71Var = this.a;
        Scroller scroller = v71Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        v71Var.Z1 = Utilities.i(v71Var.Z1 + f10, v71Var.Y1, 0.0f);
        v71Var.a1();
        v71Var.z0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.k10
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.k10
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // org.telegram.ui.Components.k10
    public void Q0() {
    }

    @Override // org.telegram.ui.Components.zm0
    public void w() {
    }
}
