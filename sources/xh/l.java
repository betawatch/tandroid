package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.w1;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.oh0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class l extends ViewGroup {
    public final GestureDetector a;
    public final Path b;
    public final RectF c;
    public boolean d;
    public final /* synthetic */ m e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        super(context);
        this.e = mVar;
        this.a = new GestureDetector(getContext(), new k(this));
        this.b = new Path();
        this.c = new RectF();
        this.d = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.b);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.e.c.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int height = getHeight();
        m mVar = this.e;
        int i14 = mVar.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = mVar.f;
        int i15 = mVar.b;
        int d = (height - mVar.d()) / 2;
        int width = getWidth();
        oh0 oh0Var = mVar.h;
        int measuredWidth = (width - oh0Var.getMeasuredWidth()) / 2;
        oh0Var.layout(measuredWidth, d, oh0Var.getMeasuredWidth() + measuredWidth, oh0Var.getMeasuredHeight() + d);
        j jVar = mVar.n;
        jVar.layout(oh0Var.getLeft(), oh0Var.getTop(), oh0Var.getRight(), jVar.getMeasuredHeight() + oh0Var.getTop());
        int C = w1.C(12.0f, oh0Var.getMeasuredHeight(), d);
        TextView textView = mVar.d;
        textView.layout(AndroidUtilities.dp(16.0f) + oh0Var.getLeft(), C, oh0Var.getRight() - AndroidUtilities.dp(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = mVar.e;
        if (textView2.getVisibility() != 8) {
            int dp = AndroidUtilities.dp(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), dp, textView.getRight(), textView2.getMeasuredHeight() + dp);
            measuredHeight = textView2.getMeasuredHeight() + dp;
        }
        int dp2 = AndroidUtilities.dp(12.0f) + measuredHeight;
        mVar.c.setBounds(oh0Var.getLeft() - i15, oh0Var.getTop() - i14, oh0Var.getRight() + i15, i14 + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((oh0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i15, dp2, oh0Var.getRight() + i15, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + dp2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i13 ? 0 : 8);
        int dp3 = AndroidUtilities.dp(6.0f);
        float left = oh0Var.getLeft();
        float top = oh0Var.getTop();
        float right = oh0Var.getRight();
        float top2 = (dp3 * 2) + oh0Var.getTop();
        RectF rectF = this.c;
        rectF.set(left, top, right, top2);
        Path path = this.b;
        path.reset();
        float f7 = dp3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f7, f7, direction);
        rectF.set(i10, oh0Var.getTop() + dp3, i12, i13);
        path.addRect(rectF, direction);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setWillNotDraw(false);
        super.onMeasure(i10, i11);
        int A = wl.A(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A, TLObject.FLAG_31);
        m mVar = this.e;
        oh0 oh0Var = mVar.h;
        oh0Var.measure(makeMeasureSpec, makeMeasureSpec);
        mVar.n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A - (AndroidUtilities.dp(16.0f) * 2), TLObject.FLAG_30);
        mVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        mVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        mVar.f.measure(View.MeasureSpec.makeMeasureSpec((mVar.b * 2) + oh0Var.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Point point = AndroidUtilities.displaySize;
        int i14 = point.x;
        int i15 = point.y;
        m mVar = this.e;
        if (i14 > i15) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i10 == i12 || i11 == i13) {
            return;
        }
        if (!this.d) {
            mVar.f();
        }
        this.d = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e.c || super.verifyDrawable(drawable);
    }
}
