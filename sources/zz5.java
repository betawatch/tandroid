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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zz5 extends RelativeLayout {
    public io5 a;
    public boolean b;
    public final /* synthetic */ LaunchActivity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz5(LaunchActivity launchActivity, LaunchActivity launchActivity2) {
        super(launchActivity2);
        this.c = launchActivity;
        this.a = io5.e;
        ry4 ry4Var = new ry4((Object) this, (byte) 22);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(this, ry4Var);
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
            io5 io5Var = this.a;
            int k1 = gl.k1(measuredWidth, io5Var.a, io5Var.c);
            launchActivity.p0.getView().layout(0, 0, launchActivity.p0.getView().getMeasuredWidth(), launchActivity.p0.getView().getMeasuredHeight());
            launchActivity.r0.getView().layout(k1, 0, launchActivity.r0.getView().getMeasuredWidth() + k1, launchActivity.r0.getView().getMeasuredHeight());
        }
        int measuredWidth2 = (measuredWidth - launchActivity.q0.getView().getMeasuredWidth()) / 2;
        int L = gl.L(8.0f) + this.a.b;
        launchActivity.q0.getView().layout(measuredWidth2, L, launchActivity.q0.getView().getMeasuredWidth() + measuredWidth2, launchActivity.q0.getView().getMeasuredHeight() + L);
        n81 n81Var = launchActivity.u0;
        n81Var.layout(0, 0, n81Var.getMeasuredWidth(), launchActivity.u0.getMeasuredHeight());
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
        boolean z = gl.E;
        LaunchActivity launchActivity = this.c;
        if ((!z && (!gl.N1() || launchActivity.getResources().getConfiguration().orientation == 2)) == launchActivity.N0 && !launchActivity.O0) {
            launchActivity.O0 = true;
            gl.c3(new tp5(this, (byte) 9));
        }
        if (launchActivity.N0) {
            launchActivity.p0.getView().measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        } else {
            io5 io5Var = this.a;
            int k1 = gl.k1(size, io5Var.a, io5Var.c);
            launchActivity.p0.getView().measure(View.MeasureSpec.makeMeasureSpec(k1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            launchActivity.r0.getView().measure(View.MeasureSpec.makeMeasureSpec(size - k1, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        launchActivity.u0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        launchActivity.t0.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        ViewGroup view = launchActivity.q0.getView();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(gl.L(500.0f), size - gl.L(16.0f)), TLObject.FLAG_30);
        io5 io5Var2 = this.a;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(((size2 - io5Var2.b) - io5Var2.d) - gl.L(16.0f), TLObject.FLAG_30));
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
