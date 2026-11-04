package zh;

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
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.vf0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i extends ViewGroup {
    public final GestureDetector a;
    public final Path b;
    public final RectF c;
    public boolean d;
    public final /* synthetic */ j e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Context context) {
        super(context);
        this.e = jVar;
        this.a = new GestureDetector(getContext(), new x9(2, this));
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int height = getHeight();
        j jVar = this.e;
        int i13 = jVar.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = jVar.f;
        int i14 = jVar.b;
        int d = (height - jVar.d()) / 2;
        int width = getWidth();
        vf0 vf0Var = jVar.h;
        int measuredWidth = (width - vf0Var.getMeasuredWidth()) / 2;
        vf0Var.layout(measuredWidth, d, vf0Var.getMeasuredWidth() + measuredWidth, vf0Var.getMeasuredHeight() + d);
        h hVar = jVar.n;
        hVar.layout(vf0Var.getLeft(), vf0Var.getTop(), vf0Var.getRight(), hVar.getMeasuredHeight() + vf0Var.getTop());
        int C = k5.C(12.0f, vf0Var.getMeasuredHeight(), d);
        TextView textView = jVar.d;
        textView.layout(g0.L(16.0f) + vf0Var.getLeft(), C, vf0Var.getRight() - g0.L(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = jVar.e;
        if (textView2.getVisibility() != 8) {
            int L = g0.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = g0.L(12.0f) + measuredHeight;
        jVar.c.setBounds(vf0Var.getLeft() - i14, vf0Var.getTop() - i13, vf0Var.getRight() + i14, i13 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((vf0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i14, L2, vf0Var.getRight() + i14, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i12 ? 0 : 8);
        int L3 = g0.L(6.0f);
        float left = vf0Var.getLeft();
        float top = vf0Var.getTop();
        float right = vf0Var.getRight();
        float top2 = (L3 * 2) + vf0Var.getTop();
        RectF rectF = this.c;
        rectF.set(left, top, right, top2);
        Path path = this.b;
        path.reset();
        float f10 = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        rectF.set(i3, vf0Var.getTop() + L3, i11, i12);
        path.addRect(rectF, direction);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setWillNotDraw(false);
        super.onMeasure(i3, i10);
        int A = q.A(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A, TLObject.FLAG_31);
        j jVar = this.e;
        vf0 vf0Var = jVar.h;
        vf0Var.measure(makeMeasureSpec, makeMeasureSpec);
        jVar.n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A - (g0.L(16.0f) * 2), TLObject.FLAG_30);
        jVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        jVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        jVar.f.measure(View.MeasureSpec.makeMeasureSpec((jVar.b * 2) + vf0Var.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        Point point = g0.q;
        int i13 = point.x;
        int i14 = point.y;
        j jVar = this.e;
        if (i13 > i14) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i3 == i11 || i10 == i12) {
            return;
        }
        if (!this.d) {
            jVar.f();
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
