package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rf0 extends org.telegram.ui.Components.v5 {
    public static final float[] S = {12.0f, 12.0f, 10.0f};
    public static final int[] T = {16, 8, 4};
    public int[] D;
    public int[] E;
    public int[] F;
    public int G;
    public final zy H;
    public boolean I;
    public final Paint J;
    public final o1.j K;
    public final o1.j L;
    public float M;
    public float N;
    public View O;
    public final HashSet P;
    public final fe.b Q;
    public final ge.b R;
    public final org.telegram.ui.ActionBar.p6 s;
    public int w;
    public float[] x;
    public float[] y;

    public rf0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.H = new zy(this, 29);
        this.J = new Paint(1);
        new ArrayList();
        new ArrayList();
        o1.c cVar = o1.j.u;
        o1.c cVar2 = o1.j.t;
        o1.c cVar3 = o1.j.q;
        o1.c cVar4 = o1.j.s;
        new o1.k(1.0f);
        new ArrayList();
        new ArrayList();
        o1.c cVar5 = o1.j.r;
        new o1.k(1.0f);
        o1.j jVar = new o1.j(this, new org.telegram.ui.Components.wa(1));
        this.K = jVar;
        o1.j jVar2 = new o1.j(this, new org.telegram.ui.Components.wa(2));
        this.L = jVar2;
        jVar.m = org.telegram.ui.Cells.f1.p(1.0f, 1500.0f, 0.75f);
        o1.k kVar = new o1.k(1.0f);
        kVar.b(250.0f);
        kVar.a(0.25f);
        o1.k kVar2 = new o1.k(1.0f);
        kVar2.b(250.0f);
        kVar2.a(0.25f);
        o1.k kVar3 = new o1.k(1.0f);
        kVar3.b(1500.0f);
        kVar3.a(0.75f);
        jVar2.m = kVar3;
        this.P = new HashSet();
        this.Q = new fe.b(0, new tt(this, 22), org.telegram.ui.Components.gr.h, 380L, false);
        this.R = new ge.b(new e(this, 23));
        this.s = p6Var;
    }

    public static void k(rf0 rf0Var, View view, float f7, float f10) {
        float f11;
        float f12;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f13 = width * 0.5f;
        float f14 = height * 0.5f;
        float f15 = f7 - f13;
        float f16 = f10 - f14;
        float f17 = f15 / f13;
        float f18 = f16 / f14;
        float sqrt = (float) Math.sqrt((f18 * f18) + (f17 * f17));
        if (sqrt > 1.0E-4f) {
            float f19 = ((1.5f * sqrt) / (0.5f + sqrt)) / sqrt;
            f11 = (f15 * f19) + f13;
            f12 = (f16 * f19) + f14;
        } else {
            f11 = f13;
            f12 = f14;
        }
        float T1 = org.telegram.messenger.i0.T1(f13, f11, 1.0f);
        float T12 = org.telegram.messenger.i0.T1(f14, f12, 3.0f);
        view.setPivotX(T1);
        view.setPivotY(T12);
    }

    public static void m(rf0 rf0Var, float f7, boolean z10, boolean z11) {
        View view;
        o1.j jVar = rf0Var.L;
        float f10 = Float.MAX_VALUE;
        int i10 = 0;
        if (rf0Var.getChildCount() != 0) {
            float f11 = -3.4028235E38f;
            float f12 = Float.MAX_VALUE;
            boolean z12 = false;
            for (int i11 = 0; i11 < rf0Var.getChildCount(); i11++) {
                View childAt = rf0Var.getChildAt(i11);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float width = (childAt.getWidth() * 0.5f) + childAt.getX();
                    if (width < f12) {
                        f12 = width;
                    }
                    if (width > f11) {
                        f11 = width;
                    }
                    z12 = true;
                }
            }
            if (z12) {
                if (f7 < f12) {
                    f7 = f12;
                } else if (f7 > f11) {
                    f7 = f11;
                }
            }
        }
        View view2 = null;
        if (rf0Var.getChildCount() == 0) {
            view = null;
        } else {
            view = null;
            for (int i12 = 0; i12 < rf0Var.getChildCount(); i12++) {
                View childAt2 = rf0Var.getChildAt(i12);
                if (childAt2 != null && childAt2.getVisibility() == 0) {
                    float abs = Math.abs(((childAt2.getWidth() * 0.5f) + childAt2.getX()) - f7);
                    if (abs < f10) {
                        view = childAt2;
                        f10 = abs;
                    }
                }
            }
        }
        if (z10) {
            int childCount = rf0Var.getChildCount();
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt3 = rf0Var.getChildAt(i10);
                if (childAt3.getVisibility() == 0 && (childAt3 instanceof gh.b) && ((gh.b) childAt3).h.f) {
                    view2 = childAt3;
                    break;
                }
                i10++;
            }
            if (view2 != null) {
                float width2 = (view2.getWidth() / 2.0f) + view2.getX();
                rf0Var.M = width2;
                rf0Var.N = width2 - f7;
                rf0Var.K.c(0.0f);
                if (view2 != view && view != null) {
                    view.performClick();
                }
            }
            jVar.d();
        }
        if (!z11) {
            rf0Var.M = f7;
            rf0Var.invalidate();
        }
        if (view != null) {
            rf0Var.O = view;
            rf0Var.q(view, true);
            if (z11) {
                float width3 = view.getWidth();
                float x10 = (width3 / 2.0f) + view.getX();
                if (0.0f == width3 && 0.0f == x10) {
                    return;
                }
                jVar.c(x10);
            }
        }
    }

    public static float p(View view) {
        return (view.getWidth() * 0.5f) + view.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipDrawSelector(boolean z10) {
        this.I = z10;
        if (z10) {
            this.J.setColor(org.telegram.ui.ActionBar.t6.r1(0.09f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ol, this.s)));
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (childAt instanceof gh.b)) {
                ((gh.b) childAt).setSkipDrawSelector(z10);
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int width;
        if (this.I) {
            float f7 = this.M + this.N;
            float f10 = 0.0f;
            if (getChildCount() != 0) {
                View view = null;
                View view2 = null;
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        float width2 = (childAt.getWidth() * 0.5f) + childAt.getX();
                        if (width2 <= f7 && (view == null || width2 > p(view))) {
                            view = childAt;
                        }
                        if (width2 >= f7 && (view2 == null || width2 < p(view2))) {
                            view2 = childAt;
                        }
                    }
                }
                if (view != null || view2 != null) {
                    if (view == null) {
                        width = view2.getWidth();
                    } else if (view2 == null) {
                        width = view.getWidth();
                    } else {
                        float p5 = p(view);
                        float p9 = p(view2);
                        width = (view == view2 || p5 == p9) ? view.getWidth() : org.telegram.messenger.i0.W1((f7 - p5) / (p9 - p5), view.getWidth(), view2.getWidth());
                    }
                    f10 = width;
                }
            }
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f11 = f10 / 2.0f;
            float f12 = height / 2.0f;
            canvas2 = canvas;
            canvas2.drawRoundRect(f7 - f11, (getHeight() - height) / 2.0f, f7 + f11, (getHeight() + height) / 2.0f, f12, f12, this.J);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.R.a(this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.v5
    public final void e() {
        o();
    }

    @Override // org.telegram.ui.Components.v5
    public final void f(View view, float f7) {
        float T1 = org.telegram.messenger.i0.T1(0.7f, 1.0f, f7);
        view.setAlpha(f7);
        view.setScaleX(T1);
        view.setScaleY(T1);
    }

    public final void n() {
        int i10 = (Math.abs(getScaleX() - 1.0f) >= 1.0E-4f || Math.abs(getScaleY() - 1.0f) >= 1.0E-4f) ? 2 : 0;
        if (getLayerType() != i10) {
            setLayerType(i10, null);
            invalidate();
        }
    }

    public final void o() {
        int entriesCount = getEntriesCount();
        for (int i10 = 0; i10 < entriesCount; i10++) {
            fe.h m10 = this.c.m(i10);
            ((gh.b) ((org.telegram.ui.Components.u5) m10.a).a).setVisualWidth(m10.b().width());
        }
    }

    @Override // org.telegram.ui.Components.v5, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.v5, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int[] iArr;
        float[] fArr;
        int i12;
        float f7;
        int i13;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i14 = this.w;
        if (i14 > 0 && size > i14) {
            size = i14;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(org.telegram.messenger.i0.L(320.0f), paddingLeft);
        int i15 = 0;
        float f11 = -1.0f;
        while (true) {
            iArr = T;
            fArr = S;
            if (i15 >= 3) {
                i12 = 0;
                f7 = 0.0f;
                i15 = 2;
                break;
            }
            if (fArr[i15] != f11) {
                int childCount = getChildCount();
                float[] fArr2 = this.x;
                if (fArr2 == null || fArr2.length < childCount) {
                    this.x = new float[childCount];
                    this.y = new float[childCount];
                    this.D = new int[childCount];
                    this.F = new int[childCount];
                    this.E = new int[childCount];
                }
                float f12 = 0.0f;
                int i16 = 0;
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = getChildAt(i17);
                    if (d(childAt)) {
                        if (childAt instanceof qf0) {
                            gh.b bVar = (gh.b) ((qf0) childAt);
                            if (bVar.T == null) {
                                bVar.T = new TextPaint(bVar.F);
                            }
                            bVar.T.setTextSize(org.telegram.messenger.i0.L(r9));
                            f10 = bVar.T.measureText(bVar.a.getText().toString());
                        } else {
                            f10 = 0.0f;
                        }
                        this.x[i17] = f10;
                        f12 = Math.max(f12, f10);
                        i16++;
                    } else {
                        this.x[i17] = -1.0f;
                    }
                }
                i12 = 0;
                f7 = 0.0f;
                i13 = 2;
                Math.ceil(f12);
                this.G = i16;
                f11 = fArr[i15];
            } else {
                i12 = 0;
                f7 = 0.0f;
                i13 = 2;
            }
            int L = org.telegram.messenger.i0.L(iArr[i15]);
            int childCount2 = getChildCount();
            float f13 = f7;
            for (int i18 = i12; i18 < childCount2; i18++) {
                if (d(getChildAt(i18))) {
                    f13 += this.x[i18] + (L * 2);
                }
            }
            if (f13 <= paddingLeft || i15 == i13) {
                break;
            } else {
                i15++;
            }
        }
        float f14 = fArr[i15];
        int childCount3 = getChildCount();
        for (int i19 = i12; i19 < childCount3; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2 instanceof qf0) {
                ((gh.b) ((qf0) childAt2)).setTextSizeDp(f14);
            }
        }
        int L2 = org.telegram.messenger.i0.L(iArr[i15]) * 2;
        int max = (paddingLeft / Math.max(1, this.G)) - L2;
        int childCount4 = getChildCount();
        int i20 = i12;
        int i21 = i20;
        float f15 = f7;
        while (i20 < childCount4) {
            if (d(getChildAt(i20))) {
                float[] fArr3 = this.y;
                float f16 = this.x[i20] + L2;
                fArr3[i20] = f16;
                int[] iArr2 = this.D;
                int i22 = f16 > ((float) (max + L2)) ? i12 : 1;
                iArr2[i20] = i22;
                f15 += f16;
                i21 += i22;
            } else {
                float[] fArr4 = this.x;
                this.y[i20] = f7;
                fArr4[i20] = f7;
                this.D[i20] = i12;
            }
            i20++;
        }
        if (i21 == 0) {
            int childCount5 = getChildCount();
            for (int i23 = i12; i23 < childCount5; i23++) {
                this.D[i23] = d(getChildAt(i23)) ? 1 : 0;
            }
            i21 = this.G;
        }
        float f17 = paddingLeft;
        if (f15 > f17) {
            float f18 = f17 / f15;
            int childCount6 = getChildCount();
            for (int i24 = i12; i24 < childCount6; i24++) {
                float[] fArr5 = this.y;
                fArr5[i24] = fArr5[i24] * f18;
            }
        } else {
            float f19 = min;
            if (f15 < f19) {
                float f20 = (f19 - f15) / i21;
                int childCount7 = getChildCount();
                for (int i25 = i12; i25 < childCount7; i25++) {
                    float[] fArr6 = this.y;
                    fArr6[i25] = (this.D[i25] * f20) + fArr6[i25];
                }
            }
        }
        int childCount8 = getChildCount();
        int i26 = i12;
        int i27 = i26;
        while (i26 < childCount8) {
            if (d(getChildAt(i26))) {
                this.E[i26] = Math.round(this.y[i26]);
                this.F[i26] = i27;
                i27 += this.E[i26];
            }
            i26++;
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i27, size2);
        int childCount9 = getChildCount();
        for (int i28 = i12; i28 < childCount9; i28++) {
            getChildAt(i28).measure(View.MeasureSpec.makeMeasureSpec(this.E[i28], TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
        }
        a();
    }

    public final void q(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof gh.b) {
                ((gh.b) childAt).f(childAt == view, z10);
            }
        }
    }

    public void setMaxWidth(int i10) {
        if (this.w != i10) {
            this.w = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        super.setScaleX(f7);
        n();
    }

    @Override // android.view.View
    public void setScaleY(float f7) {
        super.setScaleY(f7);
        n();
    }
}
