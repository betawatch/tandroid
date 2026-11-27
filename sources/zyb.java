// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zyb extends wma {
    public boolean g0;
    public final Paint h0;
    public final /* synthetic */ tzb i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zyb(tzb tzbVar, Context context) {
        super(context, null);
        this.i0 = tzbVar;
        setWillNotDraw(false);
        this.h0 = new Paint();
    }

    @Override // wma
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        if (Build.VERSION.SDK_INT >= 29 && xea.f()) {
            tzb tzbVar = this.i0;
            if (tzbVar.j1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f);
                tzbVar.j1.e(rect.left, rect.top + f, rect.right, rect.bottom + f, canvas);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(jn7.H2);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wma
    public final void J(Canvas canvas, ArrayList arrayList) {
        int i = 0;
        while (true) {
            tzb tzbVar = this.i0;
            if (i >= tzbVar.O.getChildCount()) {
                return;
            }
            View childAt = tzbVar.O.getChildAt(i);
            if (childAt.getY() < hl.L(100.0f) && childAt.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(childAt.getX() + tzbVar.O.getX(), childAt.getY() + tzbVar.O.getY() + getY());
                if (arrayList != null && (childAt instanceof tma)) {
                    arrayList.add((tma) childAt);
                }
                childAt.draw(canvas);
                canvas.restoreToCount(save);
            }
            i++;
        }
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        tzb tzbVar = this.i0;
        rz4 rz4Var = tzbVar.k1;
        rz4 rz4Var2 = tzbVar.j1;
        tq3 tq3Var = tzbVar.i1;
        if (Build.VERSION.SDK_INT >= 31 && tq3Var != null) {
            tzbVar.y0();
            uj3 uj3Var = tzbVar.N0;
            int measuredWidth = uj3Var != null ? uj3Var.fragmentView.getMeasuredWidth() : getMeasuredWidth();
            uj3 uj3Var2 = tzbVar.N0;
            int measuredHeight = uj3Var2 != null ? uj3Var2.fragmentView.getMeasuredHeight() : getMeasuredHeight();
            if (rz4Var2 != null && !rz4Var2.r && rz4Var2.k(measuredWidth, measuredHeight)) {
                tq3Var.b(rz4Var2.i(measuredWidth, measuredHeight), -3);
                rz4Var2.j();
            }
            if (rz4Var != null && !rz4Var.r && rz4Var.k(measuredWidth, measuredHeight)) {
                tq3Var.b(rz4Var.i(measuredWidth, measuredHeight), -2);
                rz4Var.j();
            }
        }
        super.dispatchDraw(canvas);
        if (tzbVar.isInPreviewMode()) {
            int themedColor = tzbVar.getThemedColor(aob.d6);
            Paint paint = this.h0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (tzbVar.X * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), hl.m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), aob.j0);
        } else {
            canvas2 = canvas;
        }
        if (tzbVar.N0 == null) {
            hl.O(canvas2, this, tzbVar.getThemedColor(aob.d6), tzbVar.h1, 1.0f);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        a aVar2;
        a aVar3;
        tzb tzbVar = this.i0;
        aVar = ((e) tzbVar).actionBar;
        if (view == aVar && !tzbVar.isInPreviewMode()) {
            aVar2 = ((e) tzbVar).actionBar;
            float y = aVar2.getY();
            aVar3 = ((e) tzbVar).actionBar;
            float height = aVar3.getHeight();
            uic uicVar = tzbVar.b1;
            int measuredHeight = (int) (y + ((int) ((((uicVar == null || uicVar.getVisibility() == 8) ? 0.0f : tzbVar.b1.getMeasuredHeight()) * tzbVar.X) + height)));
            ((ActionBarLayout) tzbVar.getParentLayout()).n(canvas, (int) ((1.0f - tzbVar.X) * 255.0f), measuredHeight);
            float f = tzbVar.X;
            if (f > 0.0f) {
                if (f < 1.0f) {
                    int alpha = aob.j0.getAlpha();
                    aob.j0.setAlpha((int) (alpha * tzbVar.X));
                    float f2 = measuredHeight;
                    canvas.drawLine(0.0f, f2, getMeasuredWidth(), f2, aob.j0);
                    aob.j0.setAlpha(alpha);
                } else {
                    float f3 = measuredHeight;
                    canvas.drawLine(0.0f, f3, getMeasuredWidth(), f3, aob.j0);
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    @Override // wma, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        a aVar;
        a aVar2;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = layoutParams.gravity;
                if (i12 == -1) {
                    i12 = 0;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, getLayoutDirection());
                int i13 = i12 & jn7.w1;
                int i14 = absoluteGravity & 7;
                if (i14 == 1) {
                    i5 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                } else if (i14 != 5) {
                    i7 = layoutParams.leftMargin + paddingLeft;
                    if (i13 != 16) {
                        i8 = (((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    } else if (i13 != 80) {
                        i10 = layoutParams.topMargin + paddingTop;
                        if (!(childAt instanceof a)) {
                            tzb tzbVar = this.i0;
                            if (!tzbVar.isInPreviewMode()) {
                                aVar = ((e) tzbVar).actionBar;
                                int top = aVar.getTop();
                                aVar2 = ((e) tzbVar).actionBar;
                                i10 += aVar2.getMeasuredHeight() + top;
                            }
                        }
                        childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
                    } else {
                        i8 = paddingBottom - measuredHeight;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = layoutParams.rightMargin;
                }
                i7 = i5 - i6;
                if (i13 != 16) {
                }
                i10 = i8 - i9;
                childAt.layout(i7, i10, measuredWidth + i7, measuredHeight + i10);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        tzb tzbVar = this.i0;
        ir8 ir8Var = tzbVar.p0;
        if (ir8Var != null) {
            this.g0 = true;
            ViewGroup.LayoutParams layoutParams = ir8Var.getLayoutParams();
            int L = hl.L(51.0f);
            int i4 = tzbVar.h1;
            layoutParams.height = L + i4;
            tzbVar.p0.setPadding(0, 0, 0, i4);
            this.g0 = false;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt instanceof a) {
                childAt.measure(i, 0);
                i5 = childAt.getMeasuredHeight();
            }
        }
        int i7 = 0;
        while (i7 < getChildCount()) {
            View childAt2 = getChildAt(i7);
            if (!(childAt2 instanceof a)) {
                if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i, 0, i2, 0);
                } else {
                    i3 = i5;
                    measureChildWithMargins(childAt2, i, 0, i2, i3);
                    i7++;
                    i5 = i3;
                }
            }
            i3 = i5;
            i7++;
            i5 = i3;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g0) {
            return;
        }
        super.requestLayout();
    }
}
