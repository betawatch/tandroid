package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class v80 extends RelativeLayout {
    public i0.b a;
    public boolean b;
    public final /* synthetic */ LaunchActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v80(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.c = launchActivity;
        this.a = i0.b.e;
        wr wrVar = new wr(this, 17);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(this, wrVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.c.p0;
        if (actionBarLayout != null) {
            actionBarLayout.Q(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.c;
        if (launchActivity.M0) {
            launchActivity.o0.getView().layout(0, 0, launchActivity.o0.getView().getMeasuredWidth(), launchActivity.o0.getView().getMeasuredHeight());
        } else {
            i0.b bVar = this.a;
            int l1 = org.telegram.messenger.g0.l1(measuredWidth, bVar.a, bVar.c);
            launchActivity.o0.getView().layout(0, 0, launchActivity.o0.getView().getMeasuredWidth(), launchActivity.o0.getView().getMeasuredHeight());
            launchActivity.q0.getView().layout(l1, 0, launchActivity.q0.getView().getMeasuredWidth() + l1, launchActivity.q0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.p0.getView().getMeasuredWidth()) / 2;
        int L = org.telegram.messenger.g0.L(8.0f) + this.a.b;
        launchActivity.p0.getView().layout(measuredWidth2, L, launchActivity.p0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.p0.getView().getMeasuredHeight() + L);
        v8 v8Var = launchActivity.t0;
        v8Var.layout(0, 0, v8Var.getMeasuredWidth(), launchActivity.t0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.s0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.s0.getMeasuredHeight());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.b = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        String str = LaunchActivity.B1;
        boolean z9 = org.telegram.messenger.g0.E;
        LaunchActivity launchActivity = this.c;
        if ((!z9 && (!org.telegram.messenger.g0.P1() || launchActivity.getResources().getConfiguration().orientation == 2)) == launchActivity.M0 && !launchActivity.N0) {
            launchActivity.N0 = true;
            org.telegram.messenger.g0.h3(new hz(this, 18));
        }
        if (launchActivity.M0) {
            launchActivity.o0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        } else {
            i0.b bVar = this.a;
            int l1 = org.telegram.messenger.g0.l1(size, bVar.a, bVar.c);
            launchActivity.o0.getView().measure(View.MeasureSpec.makeMeasureSpec(l1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            launchActivity.q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - l1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        launchActivity.t0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        launchActivity.s0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        ViewGroup view = launchActivity.p0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(500.0f), size - org.telegram.messenger.g0.L(16.0f)), TLObject.FLAG_30);
        i0.b bVar2 = this.a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - bVar2.b) - bVar2.d) - org.telegram.messenger.g0.L(16.0f), TLObject.FLAG_30));
        this.b = false;
    }

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b) {
            return;
        }
        super.requestLayout();
    }
}
