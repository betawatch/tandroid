package yh;

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
import org.telegram.ui.Components.sf0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class k extends ViewGroup {
    public final GestureDetector a;
    public final Path b;
    public final RectF c;
    public boolean d;
    public final /* synthetic */ l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Context context) {
        super(context);
        this.e = lVar;
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int height = getHeight();
        l lVar = this.e;
        int i13 = lVar.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = lVar.f;
        int i14 = lVar.b;
        int d = (height - lVar.d()) / 2;
        int width = getWidth();
        sf0 sf0Var = lVar.h;
        int measuredWidth = (width - sf0Var.getMeasuredWidth()) / 2;
        sf0Var.layout(measuredWidth, d, sf0Var.getMeasuredWidth() + measuredWidth, sf0Var.getMeasuredHeight() + d);
        j jVar = lVar.n;
        jVar.layout(sf0Var.getLeft(), sf0Var.getTop(), sf0Var.getRight(), jVar.getMeasuredHeight() + sf0Var.getTop());
        int C = k5.C(12.0f, sf0Var.getMeasuredHeight(), d);
        TextView textView = lVar.d;
        textView.layout(g0.L(16.0f) + sf0Var.getLeft(), C, sf0Var.getRight() - g0.L(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = lVar.e;
        if (textView2.getVisibility() != 8) {
            int L = g0.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = g0.L(12.0f) + measuredHeight;
        lVar.c.setBounds(sf0Var.getLeft() - i14, sf0Var.getTop() - i13, sf0Var.getRight() + i14, i13 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((sf0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i14, L2, sf0Var.getRight() + i14, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i12 ? 0 : 8);
        int L3 = g0.L(6.0f);
        float left = sf0Var.getLeft();
        float top = sf0Var.getTop();
        float right = sf0Var.getRight();
        float top2 = (L3 * 2) + sf0Var.getTop();
        RectF rectF = this.c;
        rectF.set(left, top, right, top2);
        Path path = this.b;
        path.reset();
        float f10 = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        rectF.set(i7, sf0Var.getTop() + L3, i11, i12);
        path.addRect(rectF, direction);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setWillNotDraw(false);
        super.onMeasure(i7, i10);
        int A = q.A(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(A, TLObject.FLAG_31);
        l lVar = this.e;
        sf0 sf0Var = lVar.h;
        sf0Var.measure(makeMeasureSpec, makeMeasureSpec);
        lVar.n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(A - (g0.L(16.0f) * 2), TLObject.FLAG_30);
        lVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        lVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        lVar.f.measure(View.MeasureSpec.makeMeasureSpec((lVar.b * 2) + sf0Var.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Point point = g0.q;
        int i13 = point.x;
        int i14 = point.y;
        l lVar = this.e;
        if (i13 > i14) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i7 == i11 || i10 == i12) {
            return;
        }
        if (!this.d) {
            lVar.f();
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
