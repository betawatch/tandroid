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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zwb extends ela {
    public boolean m0;
    public final Paint n0;
    public final /* synthetic */ sxb o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwb(sxb sxbVar, Context context) {
        super(context, null);
        this.o0 = sxbVar;
        setWillNotDraw(false);
        this.n0 = new Paint();
    }

    @Override // ela
    public final void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        if (Build.VERSION.SDK_INT >= 29 && gda.f()) {
            sxb sxbVar = this.o0;
            if (sxbVar.j1 != null) {
                canvas.save();
                canvas.translate(0.0f, -f);
                sxbVar.j1.e(rect.left, rect.top + f, rect.right, rect.bottom + f, canvas);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(nm7.H2);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
        }
        canvas.drawRect(rect, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ela
    public final void J(Canvas canvas, ArrayList arrayList) {
        int i = 0;
        while (true) {
            sxb sxbVar = this.o0;
            if (i >= sxbVar.O.getChildCount()) {
                return;
            }
            View childAt = sxbVar.O.getChildAt(i);
            if (childAt.getY() < gm.L(100.0f) && childAt.getVisibility() == 0) {
                int save = canvas.save();
                canvas.translate(childAt.getX() + sxbVar.O.getX(), childAt.getY() + sxbVar.O.getY() + getY());
                if (arrayList != null && (childAt instanceof bla)) {
                    arrayList.add((bla) childAt);
                }
                childAt.draw(canvas);
                canvas.restoreToCount(save);
            }
            i++;
        }
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        sxb sxbVar = this.o0;
        nz4 nz4Var = sxbVar.k1;
        nz4 nz4Var2 = sxbVar.j1;
        mr3 mr3Var = sxbVar.i1;
        if (Build.VERSION.SDK_INT >= 31 && mr3Var != null) {
            sxbVar.y0();
            nk3 nk3Var = sxbVar.N0;
            int measuredWidth = nk3Var != null ? nk3Var.fragmentView.getMeasuredWidth() : getMeasuredWidth();
            nk3 nk3Var2 = sxbVar.N0;
            int measuredHeight = nk3Var2 != null ? nk3Var2.fragmentView.getMeasuredHeight() : getMeasuredHeight();
            if (nz4Var2 != null && !nz4Var2.r && nz4Var2.k(measuredWidth, measuredHeight)) {
                mr3Var.b(nz4Var2.i(measuredWidth, measuredHeight), -3);
                nz4Var2.j();
            }
            if (nz4Var != null && !nz4Var.r && nz4Var.k(measuredWidth, measuredHeight)) {
                mr3Var.b(nz4Var.i(measuredWidth, measuredHeight), -2);
                nz4Var.j();
            }
        }
        super.dispatchDraw(canvas);
        if (sxbVar.isInPreviewMode()) {
            int themedColor = sxbVar.getThemedColor(cmb.c6);
            Paint paint = this.n0;
            paint.setColor(themedColor);
            paint.setAlpha((int) (sxbVar.X * 255.0f));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), gm.m, paint);
            canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), cmb.j0);
        } else {
            canvas2 = canvas;
        }
        if (sxbVar.N0 == null) {
            gm.O(canvas2, this, sxbVar.getThemedColor(cmb.c6), sxbVar.h1, 1.0f);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        a aVar;
        a aVar2;
        a aVar3;
        sxb sxbVar = this.o0;
        aVar = ((d) sxbVar).actionBar;
        if (view == aVar && !sxbVar.isInPreviewMode()) {
            aVar2 = ((d) sxbVar).actionBar;
            float y = aVar2.getY();
            aVar3 = ((d) sxbVar).actionBar;
            float height = aVar3.getHeight();
            vgc vgcVar = sxbVar.b1;
            int measuredHeight = (int) (y + ((int) ((((vgcVar == null || vgcVar.getVisibility() == 8) ? 0.0f : sxbVar.b1.getMeasuredHeight()) * sxbVar.X) + height)));
            ((ActionBarLayout) sxbVar.getParentLayout()).n(canvas, (int) ((1.0f - sxbVar.X) * 255.0f), measuredHeight);
            float f = sxbVar.X;
            if (f > 0.0f) {
                if (f < 1.0f) {
                    int alpha = cmb.j0.getAlpha();
                    cmb.j0.setAlpha((int) (alpha * sxbVar.X));
                    float f2 = measuredHeight;
                    canvas.drawLine(0.0f, f2, getMeasuredWidth(), f2, cmb.j0);
                    cmb.j0.setAlpha(alpha);
                } else {
                    float f3 = measuredHeight;
                    canvas.drawLine(0.0f, f3, getMeasuredWidth(), f3, cmb.j0);
                }
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    @Override // ela, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
                int i13 = i12 & nm7.w1;
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
                            sxb sxbVar = this.o0;
                            if (!sxbVar.isInPreviewMode()) {
                                aVar = ((d) sxbVar).actionBar;
                                int top = aVar.getTop();
                                aVar2 = ((d) sxbVar).actionBar;
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
        sxb sxbVar = this.o0;
        ct8 ct8Var = sxbVar.p0;
        if (ct8Var != null) {
            this.m0 = true;
            ViewGroup.LayoutParams layoutParams = ct8Var.getLayoutParams();
            int L = gm.L(51.0f);
            int i4 = sxbVar.h1;
            layoutParams.height = L + i4;
            sxbVar.p0.setPadding(0, 0, 0, i4);
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
