package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class uw extends org.telegram.ui.Components.x9 implements di.g7 {
    public static final /* synthetic */ int B3 = 0;
    public final /* synthetic */ yw A3;
    public boolean j3;
    public boolean k3;
    public boolean l3;
    public final xw m3;
    public int n3;
    public float o3;
    public final Paint p3;
    public final RectF q3;
    public org.telegram.ui.Components.qj0 r3;
    public LongSparseArray s3;
    public Paint t3;
    public float u3;
    public float v3;
    public float w3;
    public boolean x3;
    public di.y9 y3;
    public int z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(yw ywVar, Context context, xw xwVar) {
        super(context, null);
        this.A3 = ywVar;
        this.k3 = true;
        this.p3 = new Paint();
        this.q3 = new RectF();
        this.v3 = 1.0f;
        this.m3 = xwVar;
        this.h3 = org.telegram.messenger.g0.L(200.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if ((r3.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(sv svVar, float f10, boolean z9) {
        yw ywVar;
        org.telegram.ui.Components.qj0 qj0Var = svVar == null ? this.r3 : this;
        if (qj0Var == null) {
            this.r3 = svVar;
            return;
        }
        boolean z10 = false;
        org.telegram.ui.Cells.t2 t2Var = null;
        int i7 = 0;
        int i10 = Integer.MAX_VALUE;
        org.telegram.ui.Cells.t2 t2Var2 = null;
        while (true) {
            int childCount = qj0Var.getChildCount();
            ywVar = this.A3;
            if (i7 >= childCount) {
                break;
            }
            View childAt = qj0Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var3 = (org.telegram.ui.Cells.t2) childAt;
                if (t2Var3.getDialogId() == ywVar.G3.getCurrentFragmetDialogId()) {
                    t2Var = t2Var3;
                }
                if (childAt.getTop() >= 0 && t2Var3.getDialogId() != 0 && childAt.getTop() < i10) {
                    i10 = t2Var3.getTop();
                    t2Var2 = t2Var3;
                }
            }
            i7++;
        }
        if (t2Var != null) {
            if (org.telegram.messenger.g0.L(70.0f) * getAdapter().b() > getMeasuredHeight()) {
            }
        }
        t2Var = t2Var2;
        this.r3 = svVar;
        if (t2Var != null) {
            if (svVar != null) {
                svVar.setPadding(getPaddingLeft(), this.f3, getPaddingLeft(), getPaddingBottom());
                int G = ((jg.n) svVar.getAdapter()).G(t2Var.getDialogId());
                int top = (int) ((t2Var.getTop() - qj0Var.getPaddingTop()) + f10);
                if (G >= 0) {
                    xw xwVar = this.m3;
                    if (xwVar.s == 0 && xwVar.w == 2 && ywVar.l4()) {
                        z10 = true;
                    }
                    int L = org.telegram.messenger.g0.L(org.telegram.messenger.iz.p1 ? 76.0f : 70.0f);
                    int paddingTop = ((getPaddingTop() + top) - (G * L)) - G;
                    if (z10) {
                        paddingTop += L;
                    }
                    int paddingTop2 = getPaddingTop();
                    if (paddingTop > paddingTop2) {
                        top = (top + paddingTop2) - paddingTop;
                    }
                    ((v4.b0) svVar.getLayoutManager()).h1(G, top);
                }
            }
            int G2 = ((jg.n) getAdapter()).G(t2Var.getDialogId());
            int top2 = t2Var.getTop() - qj0Var.getPaddingTop();
            if (z9) {
                top2 -= (int) ywVar.N;
            }
            if (G2 >= 0) {
                ((v4.b0) getLayoutManager()).h1(G2, top2);
            }
        }
    }

    public final void C1(boolean z9, org.telegram.ui.Cells.t2 t2Var) {
        org.telegram.messenger.iz.q1 = !org.telegram.messenger.iz.q1;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
        edit.putBoolean("archiveHidden", org.telegram.messenger.iz.q1);
        edit.apply();
        yw ywVar = this.A3;
        UndoView k42 = ywVar.k4();
        if (!org.telegram.messenger.iz.q1) {
            k42.l(0L, 7, null, null);
            D1();
            if (!z9 || t2Var == null) {
                return;
            }
            t2Var.b0();
            t2Var.invalidate();
            return;
        }
        if (t2Var != null) {
            ywVar.f2 = true;
            ywVar.c1 = true;
            int top = (t2Var.getTop() - getPaddingTop()) + t2Var.getMeasuredHeight();
            if (ywVar.K && !ywVar.E0.g()) {
                ywVar.R = true;
                top += org.telegram.messenger.g0.L(81.0f);
            }
            w0(0, top, org.telegram.ui.Components.xq.g);
            if (z9) {
                ywVar.e1 = true;
            } else {
                D1();
            }
        }
        k42.l(0L, 6, null, null);
    }

    public final void D1() {
        int i7 = org.telegram.messenger.iz.q1 ? 2 : 0;
        xw xwVar = this.m3;
        xwVar.w = i7;
        hv hvVar = xwVar.n;
        if (hvVar != null) {
            hvVar.X = i7 != 0;
        }
    }

    @Override // org.telegram.ui.Components.qj0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.n4) || view.isClickable();
    }

    @Override // di.g7
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.A3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        view.setTranslationY(yw.B4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02d0  */
    @Override // org.telegram.ui.Components.x9, org.telegram.ui.Components.qj0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f10;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i7;
        org.telegram.ui.Components.ob0 ob0Var;
        float f11;
        float f12;
        Paint paint2;
        float f13;
        boolean z9;
        float f14;
        float f15;
        org.telegram.ui.ActionBar.g6 g6Var2;
        float f16;
        int i10;
        int i11;
        org.telegram.ui.Cells.t2 t2Var;
        int i12;
        org.telegram.ui.Cells.t2 t2Var2;
        int i13;
        int i14;
        int i15;
        View view;
        int R;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f17 = this.o3;
        org.telegram.ui.ActionBar.g6 g6Var3 = this.n2;
        Paint paint3 = this.p3;
        boolean z10 = true;
        boolean z11 = false;
        if (f17 > 0.0f) {
            canvas2.clipRect(0, 0, org.telegram.messenger.g0.W1(this.o3, getMeasuredWidth(), org.telegram.messenger.g0.L(zy0.getRightPaddingSize())), getMeasuredHeight());
            paint3.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.s9, g6Var3));
            paint3.setAlpha((int) (paint3.getAlpha() * this.o3));
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(zy0.getRightPaddingSize()), getMeasuredHeight(), paint3);
            paint = paint3;
            int alpha = org.telegram.ui.ActionBar.l6.k0.getAlpha();
            org.telegram.ui.ActionBar.l6.k0.setAlpha((int) (this.o3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(zy0.getRightPaddingSize()), 0.0f, org.telegram.messenger.g0.L(zy0.getRightPaddingSize()) - 1, getMeasuredHeight(), org.telegram.ui.ActionBar.l6.k0);
            org.telegram.ui.ActionBar.l6.k0.setAlpha(alpha);
        } else {
            paint = paint3;
        }
        if (this.r3 != null) {
            if (this.s3 == null) {
                this.s3 = new LongSparseArray();
            }
            for (int i16 = 0; i16 < this.r3.getChildCount(); i16++) {
                View childAt = this.r3.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.t2) && childAt.getBottom() > 0) {
                    this.s3.put(((org.telegram.ui.Cells.t2) childAt).getDialogId(), childAt);
                }
            }
        }
        yw ywVar = this.A3;
        float f18 = ywVar.E ? 0.0f : ywVar.N;
        int i17 = TLObject.FLAG_31;
        int i18 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i19 = 0;
        org.telegram.ui.Cells.t2 t2Var3 = null;
        float f19 = 2.14748365E9f;
        float f20 = -2.14748365E9f;
        while (i19 < getChildCount()) {
            View childAt2 = getChildAt(i19);
            if (childAt2 instanceof org.telegram.ui.Cells.t2) {
                org.telegram.ui.Cells.t2 t2Var4 = (org.telegram.ui.Cells.t2) childAt2;
                f16 = 1.0f;
                t2Var4.setRightFragmentOpenedProgress(this.o3);
                if (org.telegram.messenger.g0.Q1()) {
                    g6Var2 = g6Var3;
                    t2Var4.setDialogSelected(t2Var4.getDialogId() == ywVar.q2.a ? z10 : z11);
                } else {
                    g6Var2 = g6Var3;
                }
                LongSparseArray longSparseArray = this.s3;
                if (longSparseArray != null && this.r3 != null) {
                    View view2 = (View) longSparseArray.get(t2Var4.getDialogId());
                    this.s3.delete(t2Var4.getDialogId());
                    if (view2 != null) {
                        this.r3.getClass();
                        int S = RecyclerView.S(view2);
                        if (S > i17) {
                            i17 = S;
                        }
                        if (S < i18) {
                            i18 = S;
                        }
                        t2Var4.C0 = ((getPaddingTop() + (view2.getTop() - this.r3.getPaddingTop())) - t2Var4.getTop()) * this.o3;
                        if (t2Var4.getTop() + t2Var4.C0 < f19) {
                            f19 = (t2Var4.getTop() + t2Var4.C0) - f18;
                        }
                        float W1 = org.telegram.messenger.g0.W1(this.o3, t2Var4.getMeasuredHeight(), view2.getMeasuredHeight()) + t2Var4.getTop() + t2Var4.C0;
                        if (W1 > f20) {
                            f20 = W1 - f18;
                        }
                    }
                }
                if (this.j3 && t2Var4.j0(0, true) && (R = RecyclerView.R(t2Var4)) >= 0) {
                    getAdapter().g(R);
                }
                if (t2Var4.getDialogId() == ywVar.G3.getCurrentFragmetDialogId()) {
                    t2Var3 = t2Var4;
                    t2Var = t2Var3;
                } else {
                    t2Var = t2Var4;
                }
                i10 = i17;
                i11 = i18;
            } else {
                g6Var2 = g6Var3;
                f16 = 1.0f;
                i10 = i17;
                i11 = i18;
                t2Var = null;
            }
            if (this.r3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (t2Var != null) {
                    t2Var.n = -f18;
                    view = childAt2;
                    i12 = i19;
                    t2Var2 = t2Var3;
                    i13 = i10;
                    i14 = i11;
                    i15 = save;
                } else {
                    i13 = i10;
                    i15 = save;
                    i14 = i11;
                    t2Var2 = t2Var3;
                    i12 = i19;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f16 - this.o3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (t2Var != null && t2Var != t2Var2) {
                    t2Var.C0 = 0.0f;
                    t2Var.n = 0.0f;
                }
                canvas2.restoreToCount(i15);
            } else {
                i12 = i19;
                t2Var2 = t2Var3;
                i13 = i10;
                i14 = i11;
            }
            i19 = i12 + 1;
            t2Var3 = t2Var2;
            i17 = i13;
            g6Var3 = g6Var2;
            i18 = i14;
            z10 = true;
            z11 = false;
        }
        org.telegram.ui.ActionBar.g6 g6Var4 = g6Var3;
        if (t2Var3 != null) {
            ImageReceiver imageReceiver = t2Var3.Y1;
            canvas2.save();
            this.u3 = t2Var3.getY() + t2Var3.C0 + imageReceiver.L0;
            t2Var3.C0 = 0.0f;
            t2Var3.n = 0.0f;
            float f21 = this.v3;
            if (f21 != 1.0f) {
                float f22 = f21 + 0.08f;
                this.v3 = f22;
                f13 = 1.0f;
                this.v3 = Utilities.i(f22, 1.0f, 0.0f);
                invalidate();
            } else {
                f13 = 1.0f;
            }
            float interpolation = org.telegram.ui.Components.xq.f.getInterpolation(this.v3);
            if (interpolation != f13) {
                float f23 = this.w3;
                if (f23 != -2.14748365E9f) {
                    if (Math.abs(f23 - this.u3) < getMeasuredHeight() * 0.4f) {
                        this.u3 = org.telegram.messenger.g0.T1(this.w3, this.u3, interpolation);
                    } else {
                        z9 = true;
                        if (this.x3 || !(z9 || this.w3 == -2.14748365E9f)) {
                            f14 = 1.0f;
                            interpolation = this.o3;
                        } else {
                            f14 = 1.0f;
                        }
                        f15 = f14 - interpolation;
                        if (f15 != f14) {
                            f10 = -2.14748365E9f;
                            this.u3 = -2.14748365E9f;
                        } else {
                            f10 = -2.14748365E9f;
                        }
                        float f24 = (-org.telegram.messenger.g0.L(5.0f)) * f15;
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set((-org.telegram.messenger.g0.L(4.0f)) + f24, this.u3 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f) + f24, this.u3 + imageReceiver.N0 + org.telegram.messenger.g0.L(1.0f));
                        if (this.t3 == null) {
                            this.t3 = new Paint(1);
                        }
                        g6Var = g6Var4;
                        this.t3.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var));
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.t3);
                        canvas2.restore();
                    }
                }
            }
            z9 = false;
            if (this.x3) {
            }
            f14 = 1.0f;
            interpolation = this.o3;
            f15 = f14 - interpolation;
            if (f15 != f14) {
            }
            float f242 = (-org.telegram.messenger.g0.L(5.0f)) * f15;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set((-org.telegram.messenger.g0.L(4.0f)) + f242, this.u3 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f) + f242, this.u3 + imageReceiver.N0 + org.telegram.messenger.g0.L(1.0f));
            if (this.t3 == null) {
            }
            g6Var = g6Var4;
            this.t3.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.t3);
            canvas2.restore();
        } else {
            f10 = -2.14748365E9f;
            g6Var = g6Var4;
            this.u3 = -2.14748365E9f;
        }
        boolean z12 = false;
        if (this.s3 != null) {
            float f25 = 2.14748365E9f;
            for (int i20 = 0; i20 < this.s3.size(); i20++) {
                View view3 = (View) this.s3.valueAt(i20);
                this.r3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i18 && view3.getTop() > f10) {
                    f10 = view3.getTop();
                }
                if (S2 > i17 && view3.getBottom() < f25) {
                    f25 = view3.getBottom();
                }
            }
            for (int i21 = 0; i21 < this.s3.size(); i21++) {
                View view4 = (View) this.s3.valueAt(i21);
                if (view4 instanceof org.telegram.ui.Cells.t2) {
                    this.r3.getClass();
                    int S3 = RecyclerView.S(view4);
                    org.telegram.ui.Cells.t2 t2Var5 = (org.telegram.ui.Cells.t2) view4;
                    t2Var5.j0 = false;
                    t2Var5.x();
                    t2Var5.j0 = true;
                    t2Var5.setRightFragmentOpenedProgress(this.o3);
                    int save2 = canvas2.save();
                    if (S3 > i17) {
                        canvas2.translate(view4.getX(), (f20 + view4.getBottom()) - f25);
                    } else {
                        canvas2.translate(view4.getX(), (f20 + view4.getTop()) - f10);
                    }
                    view4.draw(canvas2);
                    canvas2.restoreToCount(save2);
                }
            }
            this.s3.clear();
            z12 = false;
        }
        this.j3 = z12;
        if (this.r3 != null) {
            invalidate();
        }
        if (this.r3 == null) {
            super.dispatchDraw(canvas);
        }
        if (getItemAnimator() != null && getItemAnimator().k()) {
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.d6, g6Var));
            int i22 = 0;
            while (i22 < getChildCount()) {
                View childAt3 = getChildAt(i22);
                if (((childAt3 instanceof org.telegram.ui.Cells.t2) && ((org.telegram.ui.Cells.t2) childAt3).r) || ((childAt3 instanceof jg.m) && ((jg.m) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x10 = childAt3.getX();
                        float y10 = childAt3.getY();
                        float x11 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y11 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.q3;
                        rectF3.set(x10, y10, x11, y11);
                        canvas2.saveLayerAlpha(rectF3, (int) (childAt3.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2.save();
                    }
                    canvas2.translate(childAt3.getX(), childAt3.getY());
                    paint2 = paint;
                    canvas2.drawRect(0.0f, 0.0f, childAt3.getMeasuredWidth(), childAt3.getMeasuredHeight(), paint2);
                    childAt3.draw(canvas2);
                    canvas2.restore();
                } else {
                    paint2 = paint;
                }
                i22++;
                paint = paint2;
            }
            invalidate();
        }
        org.telegram.ui.Cells.t2 t2Var6 = ywVar.X0;
        if (t2Var6 != null && (ob0Var = ywVar.W0) != null) {
            int measuredHeight = (ywVar.X0.getMeasuredHeight() / 2) + t2Var6.getTop();
            Paint paint4 = ob0Var.b;
            View view5 = ob0Var.c;
            RectF rectF4 = ob0Var.f;
            Paint paint5 = ob0Var.a;
            int L = org.telegram.messenger.g0.L(110.0f);
            int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.iz.p1 ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r9) * ob0Var.h) - org.telegram.messenger.k5.D(62.0f, 3, L);
            int i23 = L / 2;
            int i24 = measuredHeight - i23;
            paint5.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.d6, false));
            int i25 = L2 / 2;
            float f26 = measuredHeight - i25;
            float f27 = i23 + measuredWidth;
            float f28 = i25 + measuredHeight + 1;
            canvas.drawRect(0.0f, f26, f27, f28, paint5);
            paint5.setColor(-69120);
            float f29 = L + measuredWidth;
            rectF4.set(measuredWidth, i24, f29, i24 + L);
            float f30 = ob0Var.g;
            float f31 = 35.0f;
            int x12 = (int) (f30 < 0.5f ? org.telegram.messenger.camera.q.x(f30, 0.5f, 1.0f, 35.0f) : ((f30 - 0.5f) * 35.0f) / 0.5f);
            float f32 = x12;
            float f33 = 360 - (x12 * 2);
            canvas.drawArc(rectF4, f32, f33, true, paint4);
            canvas.drawArc(rectF4, f32, f33, true, paint5);
            paint5.setColor(-16777216);
            float f34 = 8.0f;
            canvas.drawCircle(f27 - org.telegram.messenger.g0.L(8.0f), (L / 4) + i24, org.telegram.messenger.g0.L(8.0f), paint5);
            canvas.save();
            float f35 = 20.0f;
            canvas.translate(org.telegram.messenger.g0.L(20.0f) + f29, measuredHeight - org.telegram.messenger.g0.L(25.0f));
            int i26 = 0;
            for (int i27 = 3; i26 < i27; i27 = 3) {
                Path path = ob0Var.j;
                float f36 = f34;
                if (path != null) {
                    f11 = f35;
                    if (ob0Var.k == ob0Var.l) {
                        f12 = f31;
                        canvas.drawPath(ob0Var.j, paint4);
                        if (i26 != 0) {
                            paint5.setColor(-90112);
                        } else if (i26 == 1) {
                            paint5.setColor(-85326);
                        } else {
                            paint5.setColor(-16720161);
                        }
                        canvas.drawPath(ob0Var.j, paint5);
                        paint5.setColor(-1);
                        rectF4.set(org.telegram.messenger.g0.L(f36), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(28.0f));
                        canvas.drawOval(rectF4, paint5);
                        rectF4.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(28.0f));
                        canvas.drawOval(rectF4, paint5);
                        paint5.setColor(-16777216);
                        rectF4.set(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(24.0f));
                        canvas.drawOval(rectF4, paint5);
                        rectF4.set(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(24.0f));
                        canvas.drawOval(rectF4, paint5);
                        canvas.translate(org.telegram.messenger.g0.L(62.0f), 0.0f);
                        i26++;
                        f31 = f12;
                        f34 = f36;
                        f35 = f11;
                    }
                } else {
                    f11 = f35;
                }
                if (path == null) {
                    ob0Var.j = new Path();
                }
                ob0Var.j.reset();
                boolean z13 = ob0Var.k;
                ob0Var.l = z13;
                if (z13) {
                    ob0Var.j.moveTo(0.0f, org.telegram.messenger.g0.L(50.0f));
                    ob0Var.j.lineTo(0.0f, org.telegram.messenger.g0.L(24.0f));
                    rectF4.set(0.0f, 0.0f, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(24.0f));
                    ob0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    ob0Var.j.lineTo(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(50.0f));
                    ob0Var.j.lineTo(org.telegram.messenger.g0.L(r4), org.telegram.messenger.g0.L(43.0f));
                    ob0Var.j.lineTo(org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(50.0f));
                    ob0Var.j.lineTo(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(43.0f));
                    ob0Var.j.lineTo(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(50.0f));
                    ob0Var.j.lineTo(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(43.0f));
                    f12 = f31;
                } else {
                    f12 = f31;
                    ob0Var.j.moveTo(0.0f, org.telegram.messenger.g0.L(43.0f));
                    ob0Var.j.lineTo(0.0f, org.telegram.messenger.g0.L(24.0f));
                    rectF4.set(0.0f, 0.0f, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(24.0f));
                    ob0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    ob0Var.j.lineTo(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(43.0f));
                    ob0Var.j.lineTo(org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(50.0f));
                    ob0Var.j.lineTo(org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(43.0f));
                    ob0Var.j.lineTo(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(50.0f));
                    ob0Var.j.lineTo(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(43.0f));
                    ob0Var.j.lineTo(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(50.0f));
                }
                ob0Var.j.close();
                canvas.drawPath(ob0Var.j, paint4);
                if (i26 != 0) {
                }
                canvas.drawPath(ob0Var.j, paint5);
                paint5.setColor(-1);
                rectF4.set(org.telegram.messenger.g0.L(f36), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(f11), org.telegram.messenger.g0.L(28.0f));
                canvas.drawOval(rectF4, paint5);
                rectF4.set(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(28.0f));
                canvas.drawOval(rectF4, paint5);
                paint5.setColor(-16777216);
                rectF4.set(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(24.0f));
                canvas.drawOval(rectF4, paint5);
                rectF4.set(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(24.0f));
                canvas.drawOval(rectF4, paint5);
                canvas.translate(org.telegram.messenger.g0.L(62.0f), 0.0f);
                i26++;
                f31 = f12;
                f34 = f36;
                f35 = f11;
            }
            canvas.restore();
            if (ob0Var.h >= 1.0f) {
                ob0Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - ob0Var.e;
            ob0Var.e = currentTimeMillis;
            if (j3 > 17) {
                j3 = 17;
            }
            if (ob0Var.g >= 1.0f) {
                ob0Var.g = 0.0f;
            }
            float f37 = j3;
            float f38 = (f37 / 400.0f) + ob0Var.g;
            ob0Var.g = f38;
            if (f38 > 1.0f) {
                ob0Var.g = 1.0f;
            }
            float f39 = (f37 / 2000.0f) + ob0Var.h;
            ob0Var.h = f39;
            if (f39 > 1.0f) {
                ob0Var.h = 1.0f;
            }
            float f40 = (f37 / 200.0f) + ob0Var.i;
            ob0Var.i = f40;
            if (f40 >= 1.0f) {
                ob0Var.k = !ob0Var.k;
                ob0Var.i = 0.0f;
            }
            view5.invalidate();
        }
        if (this.y3 == null) {
            i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
            di.y9[] y9VarArr = di.y9.f;
            if (y9VarArr[i7] == null) {
                y9VarArr[i7] = new di.y9(i7);
            }
            this.y3 = y9VarArr[i7];
        }
        this.y3.a(this);
    }

    @Override // org.telegram.ui.Components.qj0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.A3.N) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.x9, org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.t2) && ((org.telegram.ui.Cells.t2) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return yw.B4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        xw xwVar = this.m3;
        if (xwVar.n != null && yw.B4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            xwVar.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.V1) {
            return false;
        }
        yw ywVar = this.A3;
        if (ywVar.c1 || this.m3.y.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            ywVar.d1 = !kVar.w();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.n3 = getPaddingTop();
        this.A3.z3 = 0.0f;
        this.m3.getClass();
    }

    @Override // org.telegram.ui.Components.x9, org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        xw[] xwVarArr;
        AnimatorSet animatorSet;
        xw xwVar = this.m3;
        int L0 = xwVar.c.L0();
        yw ywVar = this.A3;
        if (L0 != -1 && xwVar.e.D == 0 && xwVar.c.y < 0 && xwVar.a.getScrollState() != 1) {
            v4.d1 K = xwVar.a.K(L0);
            if (K != null) {
                int top = K.a.getTop();
                if (xwVar.s == 0 && ywVar.l4() && xwVar.w == 2) {
                    L0 = Math.max(1, L0);
                }
                this.l3 = true;
                xwVar.c.h1(L0, (int) ((top - this.n3) + ywVar.z3 + 0));
                this.l3 = false;
            }
        } else if (L0 == -1 && this.k3) {
            xwVar.c.h1((xwVar.s == 0 && ywVar.l4()) ? 1 : 0, (int) ywVar.N);
        }
        this.l3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
        int i11 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        if (ywVar.K && !ywVar.O) {
            i11 += org.telegram.messenger.g0.L(81.0f);
        }
        if (!ywVar.O) {
            i11 += org.telegram.messenger.g0.L(48.0f);
        }
        this.z3 = 0;
        float e42 = ywVar.e4(false);
        org.telegram.ui.Components.pr prVar = ywVar.K1;
        float f10 = prVar != null ? prVar.getMetadata().c.a : 0.0f;
        int L = i11 + ((int) (org.telegram.messenger.g0.L(50.0f) * e42));
        this.z3 += (int) (org.telegram.messenger.g0.L(50.0f) * e42);
        org.telegram.ui.Components.pr prVar2 = ywVar.K1;
        if (prVar2 != null) {
            int c10 = (int) prVar2.c(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), e42));
            L += c10;
            this.z3 += c10;
        }
        int L2 = L - org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        this.z3 -= org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        int w32 = ywVar.w3();
        if (L2 != this.f3 || w32 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, w32);
            if (ywVar.K) {
                xwVar.x.setPaddingTop(L2 - org.telegram.messenger.g0.L(81.0f));
            } else {
                xwVar.x.setPaddingTop(L2);
            }
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) instanceof jg.m) {
                    getChildAt(i12).requestLayout();
                }
            }
        }
        this.l3 = false;
        if (this.k3 && ywVar.getMessagesController().Y1) {
            if (xwVar.s == 0 && ywVar.l4()) {
                this.l3 = true;
                ((v4.b0) getLayoutManager()).h1(1, (int) ywVar.N);
                this.l3 = false;
            }
            this.k3 = false;
        }
        super.onMeasure(i7, i10);
        if (ywVar.m2 || L2 == 0 || (xwVarArr = ywVar.e0) == null || xwVarArr.length <= 1 || ywVar.n3 || (animatorSet = ywVar.h3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v4.d1 d1Var;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (!this.V1) {
            yw ywVar = this.A3;
            if (!ywVar.c1 && !ywVar.D) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                xw xwVar = this.m3;
                if (action == 1 || action == 3) {
                    v4.y yVar = xwVar.e;
                    if (yVar.D != 0) {
                        ww wwVar = xwVar.f;
                        if (wwVar.e) {
                            wwVar.f = true;
                            if (yVar.i(null, 4) != 0 && (d1Var = xwVar.f.d) != null) {
                                View view = d1Var.a;
                                if (view instanceof org.telegram.ui.Cells.t2) {
                                    org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) view;
                                    long dialogId = t2Var.getDialogId();
                                    if (org.telegram.messenger.m5.D(dialogId)) {
                                        C1(false, t2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) ywVar.getMessagesController().Q.f(dialogId);
                                        if (dialog != null) {
                                            if (org.telegram.messenger.t3.Y(ywVar.getMessagesController().M0(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                ywVar.D4(arrayList, org.telegram.messenger.qs.w1, true, false, null);
                                            } else {
                                                i7 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                                                if (org.telegram.messenger.iz.m(i7) == 1) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Long.valueOf(dialogId));
                                                    ywVar.O2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                                    ywVar.D4(arrayList2, 101, true, false, null);
                                                } else {
                                                    i10 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                                                    if (org.telegram.messenger.iz.m(i10) != 3) {
                                                        i11 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                                                        if (org.telegram.messenger.iz.m(i11) == 0) {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            ywVar.P2 = !ywVar.s4(dialog) ? 1 : 0;
                                                            ywVar.D4(arrayList3, 100, true, false, null);
                                                        } else {
                                                            i12 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                                                            if (org.telegram.messenger.iz.m(i12) == 4) {
                                                                ArrayList arrayList4 = new ArrayList();
                                                                arrayList4.add(Long.valueOf(dialogId));
                                                                ywVar.D4(arrayList4, org.telegram.messenger.qs.n1, true, false, null);
                                                            }
                                                        }
                                                    } else if (ywVar.getMessagesController().r2(dialogId, 0L, null)) {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        arrayList5.add(Long.valueOf(dialogId));
                                                        i13 = ((org.telegram.ui.ActionBar.f2) ywVar).currentAccount;
                                                        ywVar.Q2 = !org.telegram.messenger.qp.s1(i13).r2(dialogId, 0L, null) ? 1 : 0;
                                                        ywVar.R2 = ywVar.Q2 > 0 ? 0 : 1;
                                                        ywVar.D4(arrayList5, org.telegram.messenger.qs.p1, true, false, null);
                                                    } else {
                                                        org.telegram.messenger.dt.t(org.telegram.messenger.p10.s0).T(dialogId, 3, 0L);
                                                        if (org.telegram.ui.Components.hc.a(ywVar)) {
                                                            org.telegram.ui.Components.hc.z(ywVar, 3, 0, null).j();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (xwVar.s == 0 && ((action == 1 || action == 3) && xwVar.w == 2 && ywVar.l4() && ((v4.b0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.t2 c42 = yw.c4(xwVar);
                    if (c42 != null) {
                        int L = (int) (org.telegram.messenger.g0.L(org.telegram.messenger.iz.p1 ? 76.0f : 70.0f) * 0.85f);
                        int measuredHeight = c42.getMeasuredHeight() + (c42.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - ywVar.e3;
                        if (measuredHeight < L || currentTimeMillis < 200) {
                            ywVar.f2 = true;
                            w0(0, measuredHeight, org.telegram.ui.Components.xq.h);
                            i14 = 2;
                            xwVar.w = 2;
                        } else {
                            if (xwVar.w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    ywVar.f2 = true;
                                    w0(0, c42.getTop() - paddingTop, org.telegram.ui.Components.xq.h);
                                }
                                if (!ywVar.g3) {
                                    ywVar.g3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    hv hvVar = xwVar.n;
                                    if (hvVar != null) {
                                        hvVar.a(true);
                                    }
                                }
                                c42.i0();
                                xwVar.w = 1;
                                if (org.telegram.messenger.g0.C1()) {
                                    org.telegram.messenger.g0.i2(org.telegram.messenger.id.M0(2131754923, null));
                                }
                            }
                            i14 = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i14];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new a3(this, 9));
                            ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.camera.q.v(getViewOffset(), org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new va(this, 27));
                            ofFloat.start();
                        }
                    }
                }
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.x9, org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(v4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.k3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.o3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m10;
        yw.B4 = f10;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setTranslationY(f10);
        }
        if (this.C1 != -1 && (m10 = getLayoutManager().m(this.C1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f10);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.E1;
            rect.set(left, top, right, bottom);
            this.B1.setBounds(rect);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.qj0
    public final boolean w1() {
        return true;
    }

    @Override // org.telegram.ui.Components.x9
    public final int z1() {
        return org.telegram.messenger.g0.L(48.0f);
    }
}
