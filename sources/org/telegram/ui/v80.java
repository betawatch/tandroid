package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v80 extends RelativeLayout {
    public i0.c a;
    public boolean b;
    public final /* synthetic */ LaunchActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v80(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.c = launchActivity;
        this.a = i0.c.e;
        zr zrVar = new zr(this, 17);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(this, zrVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.c.q0;
        if (actionBarLayout != null) {
            actionBarLayout.Q(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.c;
        if (launchActivity.N0) {
            launchActivity.p0.getView().layout(0, 0, launchActivity.p0.getView().getMeasuredWidth(), launchActivity.p0.getView().getMeasuredHeight());
        } else {
            i0.c cVar = this.a;
            int l1 = org.telegram.messenger.g0.l1(measuredWidth, cVar.a, cVar.c);
            launchActivity.p0.getView().layout(0, 0, launchActivity.p0.getView().getMeasuredWidth(), launchActivity.p0.getView().getMeasuredHeight());
            launchActivity.r0.getView().layout(l1, 0, launchActivity.r0.getView().getMeasuredWidth() + l1, launchActivity.r0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.q0.getView().getMeasuredWidth()) / 2;
        int L = org.telegram.messenger.g0.L(8.0f) + this.a.b;
        launchActivity.q0.getView().layout(measuredWidth2, L, launchActivity.q0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.q0.getView().getMeasuredHeight() + L);
        v8 v8Var = launchActivity.u0;
        v8Var.layout(0, 0, v8Var.getMeasuredWidth(), launchActivity.u0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.t0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.t0.getMeasuredHeight());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.b = true;
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        String str = LaunchActivity.C1;
        boolean z10 = org.telegram.messenger.g0.E;
        LaunchActivity launchActivity = this.c;
        if ((!z10 && (!org.telegram.messenger.g0.P1() || launchActivity.getResources().getConfiguration().orientation == 2)) == launchActivity.N0 && !launchActivity.O0) {
            launchActivity.O0 = true;
            org.telegram.messenger.g0.h3(new iz(this, 18));
        }
        if (launchActivity.N0) {
            launchActivity.p0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        } else {
            i0.c cVar = this.a;
            int l1 = org.telegram.messenger.g0.l1(size, cVar.a, cVar.c);
            launchActivity.p0.getView().measure(View.MeasureSpec.makeMeasureSpec(l1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            launchActivity.r0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - l1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        launchActivity.u0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        launchActivity.t0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        ViewGroup view = launchActivity.q0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(500.0f), size - org.telegram.messenger.g0.L(16.0f)), TLObject.FLAG_30);
        i0.c cVar2 = this.a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - cVar2.b) - cVar2.d) - org.telegram.messenger.g0.L(16.0f), TLObject.FLAG_30));
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
