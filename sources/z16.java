// default package

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z16 extends RelativeLayout {
    public iq5 a;
    public boolean b;
    public final /* synthetic */ LaunchActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z16(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.c = launchActivity;
        this.a = iq5.e;
        wx4 wx4Var = new wx4((Object) this, (byte) 25);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(this, wx4Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ActionBarLayout actionBarLayout = this.c.q0;
        if (actionBarLayout != null) {
            actionBarLayout.P(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        LaunchActivity launchActivity = this.c;
        if (launchActivity.N0) {
            launchActivity.p0.getView().layout(0, 0, launchActivity.p0.getView().getMeasuredWidth(), launchActivity.p0.getView().getMeasuredHeight());
        } else {
            iq5 iq5Var = this.a;
            int k1 = gm.k1(measuredWidth, iq5Var.a, iq5Var.c);
            launchActivity.p0.getView().layout(0, 0, launchActivity.p0.getView().getMeasuredWidth(), launchActivity.p0.getView().getMeasuredHeight());
            launchActivity.r0.getView().layout(k1, 0, launchActivity.r0.getView().getMeasuredWidth() + k1, launchActivity.r0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.q0.getView().getMeasuredWidth()) / 2;
        int L = gm.L(8.0f) + this.a.b;
        launchActivity.q0.getView().layout(measuredWidth2, L, launchActivity.q0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.q0.getView().getMeasuredHeight() + L);
        w91 w91Var = launchActivity.u0;
        w91Var.layout(0, 0, w91Var.getMeasuredWidth(), launchActivity.u0.getMeasuredHeight());
        FrameLayout frameLayout = launchActivity.t0;
        frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), launchActivity.t0.getMeasuredHeight());
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.b = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        String str = LaunchActivity.C1;
        boolean z = gm.E;
        LaunchActivity launchActivity = this.c;
        if ((!z && (!gm.N1() || launchActivity.getResources().getConfiguration().orientation == 2)) == launchActivity.N0 && !launchActivity.O0) {
            launchActivity.O0 = true;
            gm.c3(new kg5(this, (byte) 16));
        }
        if (launchActivity.N0) {
            launchActivity.p0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        } else {
            iq5 iq5Var = this.a;
            int k1 = gm.k1(size, iq5Var.a, iq5Var.c);
            launchActivity.p0.getView().measure(View.MeasureSpec.makeMeasureSpec(k1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            launchActivity.r0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - k1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        launchActivity.u0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        launchActivity.t0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        ViewGroup view = launchActivity.q0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(gm.L(500.0f), size - gm.L(16.0f)), TLObject.FLAG_30);
        iq5 iq5Var2 = this.a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - iq5Var2.b) - iq5Var2.d) - gm.L(16.0f), TLObject.FLAG_30));
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
