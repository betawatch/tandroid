// default package

import android.app.Activity;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class uv extends HorizontalScrollView {
    public final /* synthetic */ xi5 a;
    public final /* synthetic */ vv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(vv vvVar, Activity activity, xi5 xi5Var) {
        super(activity);
        this.b = vvVar;
        this.a = xi5Var;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        this.b.e.getMeasuredWidth();
        getMeasuredWidth();
        Typeface typeface = hl.a;
        return onInterceptTouchEvent;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        zib zibVar = this.b.e;
        zibVar.measure(View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight(), 0), i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), zibVar.getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        xi5 xi5Var = this.a;
        if (xi5Var.d != null) {
            xi5Var.d = null;
            xi5Var.f = null;
        }
        this.b.a();
        amb ambVar = ((o) xi5Var).Q0;
        if (ambVar == null || !ambVar.w()) {
            return;
        }
        ambVar.v();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.e.getMeasuredWidth() <= getMeasuredWidth() - hl.L(36.0f)) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        o.R(this.a);
        return super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }
}
