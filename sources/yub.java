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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yub extends cja {
    public boolean m0;
    public final Paint n0;
    public final /* synthetic */ qvb o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yub(qvb qvbVar, Context context) {
        super(context, null);
        this.o0 = qvbVar;
        setWillNotDraw(false);
        this.n0 = new Paint();
    }

    @Override // cja
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        if (Build.VERSION.SDK_INT >= 29 && gba.f()) {
            qvb qvbVar = this.o0;
            if (qvbVar.j1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f);
                qvbVar.j1.e(rect.left, rect.top + f, rect.right, rect.bottom + f, canvas);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(kk7.H2);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cja
    public final void J(Canvas canvas, ArrayList arrayList) {
        int i = 0;
        while (true) {
            qvb qvbVar = this.o0;
            if (i >= qvbVar.O.getChildCount()) {
                return;
            }
            View childAt = qvbVar.O.getChildAt(i);
            if (childAt.getY() < gl.L(100.0f) && childAt.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(childAt.getX() + qvbVar.O.getX(), childAt.getY() + qvbVar.O.getY() + getY());
                if (arrayList != null && (childAt instanceof zia)) {
                    arrayList.add((zia) childAt);
                }
                childAt.draw(canvas);
                canvas.restoreToCount(save);
            }
            i++;
        }
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        qvb qvbVar = this.o0;
        lx4 lx4Var = qvbVar.k1;
        lx4 lx4Var2 = qvbVar.j1;
        cq3 cq3Var = qvbVar.i1;
        if (Build.VERSION.SDK_INT >= 31 && cq3Var != null) {
            qvbVar.x0();
            cj3 cj3Var = qvbVar.N0;
            int measuredWidth = cj3Var != null ? cj3Var.fragmentView.getMeasuredWidth() : getMeasuredWidth();
            cj3 cj3Var2 = qvbVar.N0;
            int measuredHeight = cj3Var2 != null ? cj3Var2.fragmentView.getMeasuredHeight() : getMeasuredHeight();
            if (lx4Var2 != null && !lx4Var2.r && lx4Var2.k(measuredWidth, measuredHeight)) {
                cq3Var.b(lx4Var2.i(measuredWidth, measuredHeight), -3);
                lx4Var2.j();
            }
            if (lx4Var != null && !lx4Var.r && lx4Var.k(measuredWidth, measuredHeight)) {
                cq3Var.b(lx4Var.i(measuredWidth, measuredHeight), -2);
                lx4Var.j();
            }
        }
        super.dispatchDraw(canvas);
        if (qvbVar.isInPreviewMode()) {
            int themedColor = qvbVar.getThemedColor(bkb.c6);
            Paint paint = this.n0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (qvbVar.X * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), gl.m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), bkb.j0);
        } else {
            canvas2 = canvas;
        }
        if (qvbVar.N0 == null) {
            gl.O(canvas2, this, qvbVar.getThemedColor(bkb.c6), qvbVar.h1, 1.0f);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        a aVar2;
        a aVar3;
        qvb qvbVar = this.o0;
        aVar = ((d) qvbVar).actionBar;
        if (view == aVar && !qvbVar.isInPreviewMode()) {
            aVar2 = ((d) qvbVar).actionBar;
            float y = aVar2.getY();
            aVar3 = ((d) qvbVar).actionBar;
            float height = aVar3.getHeight();
            vec vecVar = qvbVar.b1;
            int measuredHeight = (int) (y + ((int) ((((vecVar == null || vecVar.getVisibility() == 8) ? 0.0f : qvbVar.b1.getMeasuredHeight()) * qvbVar.X) + height)));
            ((ActionBarLayout) qvbVar.getParentLayout()).n(canvas, (int) ((1.0f - qvbVar.X) * 255.0f), measuredHeight);
            float f = qvbVar.X;
            if (f > 0.0f) {
                if (f < 1.0f) {
                    int alpha = bkb.j0.getAlpha();
                    bkb.j0.setAlpha((int) (alpha * qvbVar.X));
                    float f2 = measuredHeight;
                    canvas.drawLine(0.0f, f2, getMeasuredWidth(), f2, bkb.j0);
                    bkb.j0.setAlpha(alpha);
                } else {
                    float f3 = measuredHeight;
                    canvas.drawLine(0.0f, f3, getMeasuredWidth(), f3, bkb.j0);
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    @Override // cja, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
                int i13 = i12 & kk7.w1;
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
                            qvb qvbVar = this.o0;
                            if (!qvbVar.isInPreviewMode()) {
                                aVar = ((d) qvbVar).actionBar;
                                int top = aVar.getTop();
                                aVar2 = ((d) qvbVar).actionBar;
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
        qvb qvbVar = this.o0;
        ar8 ar8Var = qvbVar.p0;
        if (ar8Var != null) {
            this.m0 = true;
            ViewGroup.LayoutParams layoutParams = ar8Var.getLayoutParams();
            int L = gl.L(51.0f);
            int i4 = qvbVar.h1;
            layoutParams.height = L + i4;
            qvbVar.p0.setPadding(0, 0, 0, i4);
            this.m0 = false;
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
        if (this.m0) {
            return;
        }
        super.requestLayout();
    }
}
