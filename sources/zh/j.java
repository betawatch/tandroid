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
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.o10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.hg0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class j extends ViewGroup {
    public final GestureDetector a;
    public final Path b;
    public final RectF c;
    public boolean d;
    public final /* synthetic */ k e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Context context) {
        super(context);
        this.e = kVar;
        this.a = new GestureDetector(getContext(), new z9(2, this));
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int height = getHeight();
        k kVar = this.e;
        int i13 = kVar.a;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = kVar.f;
        int i14 = kVar.b;
        int d = (height - kVar.d()) / 2;
        int width = getWidth();
        hg0 hg0Var = kVar.h;
        int measuredWidth = (width - hg0Var.getMeasuredWidth()) / 2;
        hg0Var.layout(measuredWidth, d, hg0Var.getMeasuredWidth() + measuredWidth, hg0Var.getMeasuredHeight() + d);
        i iVar = kVar.n;
        iVar.layout(hg0Var.getLeft(), hg0Var.getTop(), hg0Var.getRight(), iVar.getMeasuredHeight() + hg0Var.getTop());
        int C = f3.C(12.0f, hg0Var.getMeasuredHeight(), d);
        TextView textView = kVar.d;
        textView.layout(g0.L(16.0f) + hg0Var.getLeft(), C, hg0Var.getRight() - g0.L(16.0f), textView.getMeasuredHeight() + C);
        int measuredHeight = textView.getMeasuredHeight() + C;
        TextView textView2 = kVar.e;
        if (textView2.getVisibility() != 8) {
            int L = g0.L(4.0f) + measuredHeight;
            textView2.layout(textView.getLeft(), L, textView.getRight(), textView2.getMeasuredHeight() + L);
            measuredHeight = textView2.getMeasuredHeight() + L;
        }
        int L2 = g0.L(12.0f) + measuredHeight;
        kVar.c.setBounds(hg0Var.getLeft() - i14, hg0Var.getTop() - i13, hg0Var.getRight() + i14, i13 + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.layout((hg0Var.getRight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) + i14, L2, hg0Var.getRight() + i14, actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight() + L2);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setVisibility(actionBarPopupWindow$ActionBarPopupWindowLayout.getBottom() < i12 ? 0 : 8);
        int L3 = g0.L(6.0f);
        float left = hg0Var.getLeft();
        float top = hg0Var.getTop();
        float right = hg0Var.getRight();
        float top2 = (L3 * 2) + hg0Var.getTop();
        RectF rectF = this.c;
        rectF.set(left, top, right, top2);
        Path path = this.b;
        path.reset();
        float f10 = L3;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f10, f10, direction);
        rectF.set(i7, hg0Var.getTop() + L3, i11, i12);
        path.addRect(rectF, direction);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setWillNotDraw(false);
        super.onMeasure(i7, i10);
        int B = o10.B(12.0f, 2, Math.min(Math.min(getMeasuredWidth(), getMeasuredHeight()), (int) (getMeasuredHeight() * 0.66d)));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(B, TLObject.FLAG_31);
        k kVar = this.e;
        hg0 hg0Var = kVar.h;
        hg0Var.measure(makeMeasureSpec, makeMeasureSpec);
        kVar.n.measure(makeMeasureSpec, makeMeasureSpec);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(B - (g0.L(16.0f) * 2), TLObject.FLAG_30);
        kVar.d.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.e.measure(makeMeasureSpec2, View.MeasureSpec.makeMeasureSpec(0, 0));
        kVar.f.measure(View.MeasureSpec.makeMeasureSpec((kVar.b * 2) + hg0Var.getMeasuredWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        Point point = g0.q;
        int i13 = point.x;
        int i14 = point.y;
        k kVar = this.e;
        if (i13 > i14) {
            super/*android.app.Dialog*/.dismiss();
        }
        if (i7 == i11 || i10 == i12) {
            return;
        }
        if (!this.d) {
            kVar.f();
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
