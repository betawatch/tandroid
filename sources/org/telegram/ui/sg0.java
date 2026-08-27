package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sg0 extends org.telegram.ui.Components.a6 {
    public static final float[] O = {12.0f, 12.0f, 10.0f};
    public static final int[] P = {16, 8, 4};
    public int[] A;
    public int[] B;
    public int C;
    public final r00 D;
    public boolean E;
    public final Paint F;
    public final o1.j G;
    public final o1.j H;
    public float I;
    public float J;
    public View K;
    public final HashSet L;
    public final ud.a M;
    public final vd.b N;
    public final org.telegram.ui.ActionBar.c6 s;
    public int v;
    public float[] w;
    public float[] x;
    public int[] y;

    public sg0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = new r00(this, 26);
        this.F = new Paint(1);
        new ArrayList();
        new ArrayList();
        o1.c cVar = o1.h.s;
        o1.c cVar2 = o1.h.r;
        o1.c cVar3 = o1.h.o;
        o1.c cVar4 = o1.h.q;
        new o1.k(1.0f);
        new ArrayList();
        new ArrayList();
        o1.c cVar5 = o1.h.p;
        new o1.k(1.0f);
        o1.j jVar = new o1.j(this, new org.telegram.ui.Components.fb(1));
        this.G = jVar;
        o1.j jVar2 = new o1.j(this, new org.telegram.ui.Components.fb(2));
        this.H = jVar2;
        jVar.u = org.telegram.ui.Cells.pa.k(1.0f, 1500.0f, 0.75f);
        o1.k kVar = new o1.k(1.0f);
        kVar.b(250.0f);
        kVar.a(0.25f);
        o1.k kVar2 = new o1.k(1.0f);
        kVar2.b(250.0f);
        kVar2.a(0.25f);
        o1.k kVar3 = new o1.k(1.0f);
        kVar3.b(1500.0f);
        kVar3.a(0.75f);
        jVar2.u = kVar3;
        this.L = new HashSet();
        this.M = new ud.a(0, new zt(this, 22), org.telegram.ui.Components.er.h, 380L, false);
        this.N = new vd.b(new g(this, 25));
        this.s = c6Var;
    }

    public static void k(sg0 sg0Var, View view, float f10, float f11) {
        float f12;
        float f13;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f14 = width * 0.5f;
        float f15 = height * 0.5f;
        float f16 = f10 - f14;
        float f17 = f11 - f15;
        float f18 = f16 / f14;
        float f19 = f17 / f15;
        float sqrt = (float) Math.sqrt((f19 * f19) + (f18 * f18));
        if (sqrt > 1.0E-4f) {
            float f20 = ((1.5f * sqrt) / (0.5f + sqrt)) / sqrt;
            f12 = (f16 * f20) + f14;
            f13 = (f17 * f20) + f15;
        } else {
            f12 = f14;
            f13 = f15;
        }
        float lerp = AndroidUtilities.lerp(f14, f12, 1.0f);
        float lerp2 = AndroidUtilities.lerp(f15, f13, 3.0f);
        view.setPivotX(lerp);
        view.setPivotY(lerp2);
    }

    public static void m(sg0 sg0Var, float f10, boolean z10, boolean z11) {
        View view;
        o1.j jVar = sg0Var.H;
        float f11 = Float.MAX_VALUE;
        if (sg0Var.getChildCount() != 0) {
            float f12 = -3.4028235E38f;
            boolean z12 = false;
            float f13 = Float.MAX_VALUE;
            for (int i10 = 0; i10 < sg0Var.getChildCount(); i10++) {
                View childAt = sg0Var.getChildAt(i10);
                if (childAt != null && childAt.getVisibility() == 0) {
                    float width = (childAt.getWidth() * 0.5f) + childAt.getX();
                    if (width < f13) {
                        f13 = width;
                    }
                    if (width > f12) {
                        f12 = width;
                    }
                    z12 = true;
                }
            }
            if (z12) {
                if (f10 < f13) {
                    f10 = f13;
                } else if (f10 > f12) {
                    f10 = f12;
                }
            }
        }
        View view2 = null;
        if (sg0Var.getChildCount() == 0) {
            view = null;
        } else {
            view = null;
            for (int i11 = 0; i11 < sg0Var.getChildCount(); i11++) {
                View childAt2 = sg0Var.getChildAt(i11);
                if (childAt2 != null && childAt2.getVisibility() == 0) {
                    float abs = Math.abs(((childAt2.getWidth() * 0.5f) + childAt2.getX()) - f10);
                    if (abs < f11) {
                        view = childAt2;
                        f11 = abs;
                    }
                }
            }
        }
        if (z10) {
            int childCount = sg0Var.getChildCount();
            int i12 = 0;
            while (true) {
                if (i12 >= childCount) {
                    break;
                }
                View childAt3 = sg0Var.getChildAt(i12);
                if (childAt3.getVisibility() == 0 && (childAt3 instanceof xg.b) && ((xg.b) childAt3).h.f) {
                    view2 = childAt3;
                    break;
                }
                i12++;
            }
            if (view2 != null) {
                float width2 = (view2.getWidth() / 2.0f) + view2.getX();
                sg0Var.I = width2;
                sg0Var.J = width2 - f10;
                o1.j jVar2 = sg0Var.G;
                if (jVar2.f) {
                    jVar2.v = 0.0f;
                } else {
                    if (jVar2.u == null) {
                        jVar2.u = new o1.k(0.0f);
                    }
                    jVar2.u.i = 0.0f;
                    jVar2.f();
                }
                if (view2 != view && view != null) {
                    view.performClick();
                }
            }
            jVar.c();
        }
        if (!z11) {
            sg0Var.I = f10;
            sg0Var.invalidate();
        }
        if (view != null) {
            sg0Var.K = view;
            int childCount2 = sg0Var.getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt4 = sg0Var.getChildAt(i13);
                if (childAt4 instanceof xg.b) {
                    ((xg.b) childAt4).e(childAt4 == view, true);
                }
            }
            if (z11) {
                float width3 = view.getWidth();
                float x8 = (width3 / 2.0f) + view.getX();
                if (0.0f == width3 && 0.0f == x8) {
                    return;
                }
                if (jVar.f) {
                    jVar.v = x8;
                    return;
                }
                if (jVar.u == null) {
                    jVar.u = new o1.k(x8);
                }
                jVar.u.i = x8;
                jVar.f();
            }
        }
    }

    public static float p(View view) {
        return (view.getWidth() * 0.5f) + view.getX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSkipDrawSelector(boolean z10) {
        this.E = z10;
        if (z10) {
            this.F.setColor(org.telegram.ui.ActionBar.g6.l1(0.09f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.al, this.s)));
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (childAt instanceof xg.b)) {
                ((xg.b) childAt).setSkipDrawSelector(z10);
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int width;
        if (this.E) {
            float f10 = this.I + this.J;
            float f11 = 0.0f;
            if (getChildCount() != 0) {
                View view = null;
                View view2 = null;
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        float width2 = (childAt.getWidth() * 0.5f) + childAt.getX();
                        if (width2 <= f10 && (view == null || width2 > p(view))) {
                            view = childAt;
                        }
                        if (width2 >= f10 && (view2 == null || width2 < p(view2))) {
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
                        float p6 = p(view);
                        float p9 = p(view2);
                        width = (view == view2 || p6 == p9) ? view.getWidth() : AndroidUtilities.lerp(view.getWidth(), view2.getWidth(), (f10 - p6) / (p9 - p6));
                    }
                    f11 = width;
                }
            }
            float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f12 = f11 / 2.0f;
            float f13 = height / 2.0f;
            canvas2 = canvas;
            canvas2.drawRoundRect(f10 - f12, (getHeight() - height) / 2.0f, f10 + f12, (getHeight() + height) / 2.0f, f13, f13, this.F);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.N.a(motionEvent, this);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.a6
    public final void e() {
        o();
    }

    @Override // org.telegram.ui.Components.a6
    public final void f(View view, float f10) {
        float lerp = AndroidUtilities.lerp(0.7f, 1.0f, f10);
        view.setAlpha(f10);
        view.setScaleX(lerp);
        view.setScaleY(lerp);
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
            ud.e n10 = this.c.n(i10);
            ((xg.b) ((org.telegram.ui.Components.z5) n10.a).a).setVisualWidth(n10.b().width());
        }
    }

    @Override // org.telegram.ui.Components.a6, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.a6, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int[] iArr;
        float[] fArr;
        int i12;
        float f10;
        float f11;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int i13 = this.v;
        if (i13 > 0 && size > i13) {
            size = i13;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int min = Math.min(AndroidUtilities.dp(320.0f), paddingLeft);
        int i14 = 0;
        float f12 = -1.0f;
        while (true) {
            iArr = P;
            fArr = O;
            if (i14 >= 3) {
                i12 = 0;
                f10 = 0.0f;
                i14 = 2;
                break;
            }
            if (fArr[i14] != f12) {
                int childCount = getChildCount();
                float[] fArr2 = this.w;
                if (fArr2 == null || fArr2.length < childCount) {
                    this.w = new float[childCount];
                    this.x = new float[childCount];
                    this.y = new int[childCount];
                    this.B = new int[childCount];
                    this.A = new int[childCount];
                }
                int i15 = 0;
                float f13 = 0.0f;
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = getChildAt(i16);
                    if (d(childAt)) {
                        if (childAt instanceof rg0) {
                            xg.b bVar = (xg.b) ((rg0) childAt);
                            if (bVar.P == null) {
                                bVar.P = new TextPaint(bVar.B);
                            }
                            bVar.P.setTextSize(AndroidUtilities.dp(r9));
                            f11 = bVar.P.measureText(bVar.a.getText().toString());
                        } else {
                            f11 = 0.0f;
                        }
                        this.w[i16] = f11;
                        f13 = Math.max(f13, f11);
                        i15++;
                    } else {
                        this.w[i16] = -1.0f;
                    }
                }
                i12 = 0;
                f10 = 0.0f;
                Math.ceil(f13);
                this.C = i15;
                f12 = fArr[i14];
            } else {
                i12 = 0;
                f10 = 0.0f;
            }
            int dp = AndroidUtilities.dp(iArr[i14]);
            int childCount2 = getChildCount();
            float f14 = 0.0f;
            for (int i17 = 0; i17 < childCount2; i17++) {
                if (d(getChildAt(i17))) {
                    f14 += this.w[i17] + (dp * 2);
                }
            }
            if (f14 <= paddingLeft || i14 == 2) {
                break;
            } else {
                i14++;
            }
        }
        float f15 = fArr[i14];
        int childCount3 = getChildCount();
        for (int i18 = 0; i18 < childCount3; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2 instanceof rg0) {
                ((xg.b) ((rg0) childAt2)).setTextSizeDp(f15);
            }
        }
        int dp2 = AndroidUtilities.dp(iArr[i14]) * 2;
        int max = (paddingLeft / Math.max(1, this.C)) - dp2;
        int childCount4 = getChildCount();
        int i19 = 0;
        float f16 = 0.0f;
        for (int i20 = 0; i20 < childCount4; i20++) {
            if (d(getChildAt(i20))) {
                float[] fArr3 = this.x;
                float f17 = this.w[i20] + dp2;
                fArr3[i20] = f17;
                int[] iArr2 = this.y;
                int i21 = f17 > ((float) (max + dp2)) ? 0 : 1;
                iArr2[i20] = i21;
                f16 += f17;
                i19 += i21;
            } else {
                float[] fArr4 = this.w;
                this.x[i20] = f10;
                fArr4[i20] = f10;
                this.y[i20] = i12;
            }
        }
        if (i19 == 0) {
            int childCount5 = getChildCount();
            for (int i22 = 0; i22 < childCount5; i22++) {
                this.y[i22] = d(getChildAt(i22)) ? 1 : 0;
            }
            i19 = this.C;
        }
        float f18 = paddingLeft;
        if (f16 > f18) {
            float f19 = f18 / f16;
            int childCount6 = getChildCount();
            for (int i23 = 0; i23 < childCount6; i23++) {
                float[] fArr5 = this.x;
                fArr5[i23] = fArr5[i23] * f19;
            }
        } else {
            float f20 = min;
            if (f16 < f20) {
                float f21 = (f20 - f16) / i19;
                int childCount7 = getChildCount();
                for (int i24 = 0; i24 < childCount7; i24++) {
                    float[] fArr6 = this.x;
                    fArr6[i24] = (this.y[i24] * f21) + fArr6[i24];
                }
            }
        }
        int childCount8 = getChildCount();
        int i25 = 0;
        for (int i26 = 0; i26 < childCount8; i26++) {
            if (d(getChildAt(i26))) {
                this.A[i26] = Math.round(this.x[i26]);
                this.B[i26] = i25;
                i25 += this.A[i26];
            }
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + i25, size2);
        int childCount9 = getChildCount();
        for (int i27 = 0; i27 < childCount9; i27++) {
            getChildAt(i27).measure(View.MeasureSpec.makeMeasureSpec(this.A[i27], TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
        }
        a();
    }

    public void setMaxWidth(int i10) {
        if (this.v != i10) {
            this.v = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        n();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        n();
    }
}
