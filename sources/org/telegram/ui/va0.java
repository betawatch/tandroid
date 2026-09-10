package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class va0 extends RelativeLayout {
    public i0.c a;
    public boolean b;
    public final /* synthetic */ LaunchActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.c = launchActivity;
        this.a = i0.c.e;
        iu iuVar = new iu(this, 15);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(this, iuVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.c.r0;
        if (actionBarLayout != null) {
            actionBarLayout.N(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        boolean z11 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.c;
        if (z11 || (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2)) {
            launchActivity.q0.getView().layout(0, 0, launchActivity.q0.getView().getMeasuredWidth(), launchActivity.q0.getView().getMeasuredHeight());
        } else {
            i0.c cVar = this.a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(measuredWidth, cVar.a, cVar.c);
            launchActivity.q0.getView().layout(0, 0, launchActivity.q0.getView().getMeasuredWidth(), launchActivity.q0.getView().getMeasuredHeight());
            launchActivity.s0.getView().layout(tabletLeftFragmentSize, 0, launchActivity.s0.getView().getMeasuredWidth() + tabletLeftFragmentSize, launchActivity.s0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.r0.getView().getMeasuredWidth()) / 2;
        int dp = AndroidUtilities.dp(8.0f) + this.a.b;
        launchActivity.r0.getView().layout(measuredWidth2, dp, launchActivity.r0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.r0.getView().getMeasuredHeight() + dp);
        gg.z1 z1Var = launchActivity.v0;
        z1Var.layout(0, 0, z1Var.getMeasuredWidth(), launchActivity.v0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.u0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.u0.getMeasuredHeight());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.b = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        boolean z10 = AndroidUtilities.isInMultiwindow;
        LaunchActivity launchActivity = this.c;
        if (z10 || (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2)) {
            launchActivity.O0 = true;
            launchActivity.q0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        } else {
            launchActivity.O0 = false;
            i0.c cVar = this.a;
            int tabletLeftFragmentSize = AndroidUtilities.getTabletLeftFragmentSize(size, cVar.a, cVar.c);
            launchActivity.q0.getView().measure(View.MeasureSpec.makeMeasureSpec(tabletLeftFragmentSize, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            launchActivity.s0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - tabletLeftFragmentSize, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        launchActivity.v0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        launchActivity.u0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        ViewGroup view = launchActivity.r0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), TLObject.FLAG_30);
        i0.c cVar2 = this.a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - cVar2.b) - cVar2.d) - AndroidUtilities.dp(16.0f), TLObject.FLAG_30));
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
