package org.telegram.ui;

import android.view.MotionEvent;
import android.widget.Scroller;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class tc1 implements org.telegram.ui.Components.xo0, org.telegram.ui.Components.m20 {
    public final /* synthetic */ rd1 a;

    public /* synthetic */ tc1(rd1 rd1Var) {
        this.a = rd1Var;
    }

    @Override // org.telegram.ui.Components.xo0
    public void Y(float f7, boolean z10) {
        rd1 rd1Var = this.a;
        rd1Var.l1 = f7;
        rd1Var.k1();
    }

    @Override // org.telegram.ui.Components.xo0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.Components.m20
    public boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = this.a.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        return true;
    }

    @Override // org.telegram.ui.Components.m20
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        rd1 rd1Var = this.a;
        Scroller scroller = rd1Var.c;
        if (scroller == null) {
            return true;
        }
        scroller.abortAnimation();
        rd1Var.c.fling((int) rd1Var.X1, 0, Math.round(-f7), Math.round(f10), 0, (int) rd1Var.W1, 0, ConnectionsManager.DEFAULT_DATACENTER_ID);
        rd1Var.x0.postInvalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.m20
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        rd1 rd1Var = this.a;
        Scroller scroller = rd1Var.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        rd1Var.X1 = Utilities.clamp(rd1Var.X1 + f7, rd1Var.W1, 0.0f);
        rd1Var.V0();
        rd1Var.x0.invalidate();
        return true;
    }

    @Override // org.telegram.ui.Components.m20
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // org.telegram.ui.Components.xo0
    public /* synthetic */ int p0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.xo0
    public void B() {
    }

    @Override // org.telegram.ui.Components.m20
    public void d1() {
    }

    @Override // org.telegram.ui.Components.m20
    public void onLongPress(MotionEvent motionEvent) {
    }
}
