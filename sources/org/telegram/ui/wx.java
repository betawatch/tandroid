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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wx extends org.telegram.ui.Components.r9 implements th.l5 {
    public static final /* synthetic */ int B3 = 0;
    public final /* synthetic */ ay A3;
    public boolean j3;
    public boolean k3;
    public boolean l3;
    public final zx m3;
    public int n3;
    public float o3;
    public final Paint p3;
    public final RectF q3;
    public org.telegram.ui.Components.tk0 r3;
    public LongSparseArray s3;
    public Paint t3;
    public float u3;
    public float v3;
    public float w3;
    public boolean x3;
    public th.w7 y3;
    public int z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(ay ayVar, Context context, zx zxVar) {
        super(context, null);
        this.A3 = ayVar;
        this.k3 = true;
        this.p3 = new Paint();
        this.q3 = new RectF();
        this.v3 = 1.0f;
        this.m3 = zxVar;
        this.h3 = org.telegram.messenger.i0.L(200.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if ((r3.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(vw vwVar, float f7, boolean z10) {
        ay ayVar;
        org.telegram.ui.Components.tk0 tk0Var = vwVar == null ? this.r3 : this;
        if (tk0Var == null) {
            this.r3 = vwVar;
            return;
        }
        boolean z11 = false;
        org.telegram.ui.Cells.v2 v2Var = null;
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        org.telegram.ui.Cells.v2 v2Var2 = null;
        while (true) {
            int childCount = tk0Var.getChildCount();
            ayVar = this.A3;
            if (i10 >= childCount) {
                break;
            }
            View childAt = tk0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v2) {
                org.telegram.ui.Cells.v2 v2Var3 = (org.telegram.ui.Cells.v2) childAt;
                if (v2Var3.getDialogId() == ayVar.F3.getCurrentFragmetDialogId()) {
                    v2Var = v2Var3;
                }
                if (childAt.getTop() >= 0 && v2Var3.getDialogId() != 0 && childAt.getTop() < i11) {
                    i11 = v2Var3.getTop();
                    v2Var2 = v2Var3;
                }
            }
            i10++;
        }
        if (v2Var != null) {
            if (org.telegram.messenger.i0.L(70.0f) * getAdapter().b() > getMeasuredHeight()) {
            }
        }
        v2Var = v2Var2;
        this.r3 = vwVar;
        if (v2Var != null) {
            if (vwVar != null) {
                vwVar.setPadding(getPaddingLeft(), this.f3, getPaddingLeft(), getPaddingBottom());
                int G = ((zf.m) vwVar.getAdapter()).G(v2Var.getDialogId());
                int top = (int) ((v2Var.getTop() - tk0Var.getPaddingTop()) + f7);
                if (G >= 0) {
                    zx zxVar = this.m3;
                    if (zxVar.s == 0 && zxVar.w == 2 && ayVar.k4()) {
                        z11 = true;
                    }
                    int L = org.telegram.messenger.i0.L(org.telegram.messenger.tz.p1 ? 76.0f : 70.0f);
                    int paddingTop = ((getPaddingTop() + top) - (G * L)) - G;
                    if (z11) {
                        paddingTop += L;
                    }
                    int paddingTop2 = getPaddingTop();
                    if (paddingTop > paddingTop2) {
                        top = (top + paddingTop2) - paddingTop;
                    }
                    ((s4.a0) vwVar.getLayoutManager()).h1(G, top);
                }
            }
            int G2 = ((zf.m) getAdapter()).G(v2Var.getDialogId());
            int top2 = v2Var.getTop() - tk0Var.getPaddingTop();
            if (z10) {
                top2 -= (int) ayVar.N;
            }
            if (G2 >= 0) {
                ((s4.a0) getLayoutManager()).h1(G2, top2);
            }
        }
    }

    public final void C1(boolean z10, org.telegram.ui.Cells.v2 v2Var) {
        org.telegram.messenger.tz.q1 = !org.telegram.messenger.tz.q1;
        SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
        edit.putBoolean("archiveHidden", org.telegram.messenger.tz.q1);
        edit.apply();
        ay ayVar = this.A3;
        UndoView j42 = ayVar.j4();
        if (!org.telegram.messenger.tz.q1) {
            j42.l(0L, 7, null, null);
            D1();
            if (!z10 || v2Var == null) {
                return;
            }
            v2Var.b0();
            v2Var.invalidate();
            return;
        }
        if (v2Var != null) {
            ayVar.e2 = true;
            ayVar.b1 = true;
            int top = (v2Var.getTop() - getPaddingTop()) + v2Var.getMeasuredHeight();
            if (ayVar.K && !ayVar.E0.g()) {
                ayVar.R = true;
                top += org.telegram.messenger.i0.L(81.0f);
            }
            w0(0, top, org.telegram.ui.Components.gr.g);
            if (z10) {
                ayVar.d1 = true;
            } else {
                D1();
            }
        }
        j42.l(0L, 6, null, null);
    }

    public final void D1() {
        int i10 = org.telegram.messenger.tz.q1 ? 2 : 0;
        zx zxVar = this.m3;
        zxVar.w = i10;
        kw kwVar = zxVar.n;
        if (kwVar != null) {
            kwVar.X = i10 != 0;
        }
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.p4) || view.isClickable();
    }

    @Override // th.l5
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.A3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(ay.A4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02d0  */
    @Override // org.telegram.ui.Components.r9, org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f7;
        org.telegram.ui.ActionBar.p6 p6Var;
        int i10;
        org.telegram.ui.Components.gc0 gc0Var;
        float f10;
        float f11;
        Paint paint2;
        float f12;
        boolean z10;
        float f13;
        float f14;
        org.telegram.ui.ActionBar.p6 p6Var2;
        float f15;
        int i11;
        int i12;
        org.telegram.ui.Cells.v2 v2Var;
        int i13;
        org.telegram.ui.Cells.v2 v2Var2;
        int i14;
        int i15;
        int i16;
        View view;
        int R;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f16 = this.o3;
        org.telegram.ui.ActionBar.p6 p6Var3 = this.n2;
        Paint paint3 = this.p3;
        boolean z11 = true;
        boolean z12 = false;
        if (f16 > 0.0f) {
            canvas2.clipRect(0, 0, org.telegram.messenger.i0.W1(this.o3, getMeasuredWidth(), org.telegram.messenger.i0.L(k01.getRightPaddingSize())), getMeasuredHeight());
            paint3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s9, p6Var3));
            paint3.setAlpha((int) (paint3.getAlpha() * this.o3));
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.i0.L(k01.getRightPaddingSize()), getMeasuredHeight(), paint3);
            paint = paint3;
            int alpha = org.telegram.ui.ActionBar.t6.k0.getAlpha();
            org.telegram.ui.ActionBar.t6.k0.setAlpha((int) (this.o3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.i0.L(k01.getRightPaddingSize()), 0.0f, org.telegram.messenger.i0.L(k01.getRightPaddingSize()) - 1, getMeasuredHeight(), org.telegram.ui.ActionBar.t6.k0);
            org.telegram.ui.ActionBar.t6.k0.setAlpha(alpha);
        } else {
            paint = paint3;
        }
        if (this.r3 != null) {
            if (this.s3 == null) {
                this.s3 = new LongSparseArray();
            }
            for (int i17 = 0; i17 < this.r3.getChildCount(); i17++) {
                View childAt = this.r3.getChildAt(i17);
                if ((childAt instanceof org.telegram.ui.Cells.v2) && childAt.getBottom() > 0) {
                    this.s3.put(((org.telegram.ui.Cells.v2) childAt).getDialogId(), childAt);
                }
            }
        }
        ay ayVar = this.A3;
        float f17 = ayVar.E ? 0.0f : ayVar.N;
        int i18 = TLObject.FLAG_31;
        int i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i20 = 0;
        org.telegram.ui.Cells.v2 v2Var3 = null;
        float f18 = 2.14748365E9f;
        float f19 = -2.14748365E9f;
        while (i20 < getChildCount()) {
            View childAt2 = getChildAt(i20);
            if (childAt2 instanceof org.telegram.ui.Cells.v2) {
                org.telegram.ui.Cells.v2 v2Var4 = (org.telegram.ui.Cells.v2) childAt2;
                f15 = 1.0f;
                v2Var4.setRightFragmentOpenedProgress(this.o3);
                if (org.telegram.messenger.i0.Q1()) {
                    p6Var2 = p6Var3;
                    v2Var4.setDialogSelected(v2Var4.getDialogId() == ayVar.p2.a ? z11 : z12);
                } else {
                    p6Var2 = p6Var3;
                }
                LongSparseArray longSparseArray = this.s3;
                if (longSparseArray != null && this.r3 != null) {
                    View view2 = (View) longSparseArray.get(v2Var4.getDialogId());
                    this.s3.delete(v2Var4.getDialogId());
                    if (view2 != null) {
                        this.r3.getClass();
                        int S = RecyclerView.S(view2);
                        if (S > i18) {
                            i18 = S;
                        }
                        if (S < i19) {
                            i19 = S;
                        }
                        v2Var4.C0 = ((getPaddingTop() + (view2.getTop() - this.r3.getPaddingTop())) - v2Var4.getTop()) * this.o3;
                        if (v2Var4.getTop() + v2Var4.C0 < f18) {
                            f18 = (v2Var4.getTop() + v2Var4.C0) - f17;
                        }
                        float W1 = org.telegram.messenger.i0.W1(this.o3, v2Var4.getMeasuredHeight(), view2.getMeasuredHeight()) + v2Var4.getTop() + v2Var4.C0;
                        if (W1 > f19) {
                            f19 = W1 - f17;
                        }
                    }
                }
                if (this.j3 && v2Var4.i0(0, true) && (R = RecyclerView.R(v2Var4)) >= 0) {
                    getAdapter().g(R);
                }
                if (v2Var4.getDialogId() == ayVar.F3.getCurrentFragmetDialogId()) {
                    v2Var3 = v2Var4;
                    v2Var = v2Var3;
                } else {
                    v2Var = v2Var4;
                }
                i11 = i18;
                i12 = i19;
            } else {
                p6Var2 = p6Var3;
                f15 = 1.0f;
                i11 = i18;
                i12 = i19;
                v2Var = null;
            }
            if (this.r3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (v2Var != null) {
                    v2Var.n = -f17;
                    view = childAt2;
                    i13 = i20;
                    v2Var2 = v2Var3;
                    i14 = i11;
                    i15 = i12;
                    i16 = save;
                } else {
                    i14 = i11;
                    i16 = save;
                    i15 = i12;
                    v2Var2 = v2Var3;
                    i13 = i20;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f15 - this.o3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (v2Var != null && v2Var != v2Var2) {
                    v2Var.C0 = 0.0f;
                    v2Var.n = 0.0f;
                }
                canvas2.restoreToCount(i16);
            } else {
                i13 = i20;
                v2Var2 = v2Var3;
                i14 = i11;
                i15 = i12;
            }
            i20 = i13 + 1;
            v2Var3 = v2Var2;
            i18 = i14;
            p6Var3 = p6Var2;
            i19 = i15;
            z11 = true;
            z12 = false;
        }
        org.telegram.ui.ActionBar.p6 p6Var4 = p6Var3;
        if (v2Var3 != null) {
            ImageReceiver imageReceiver = v2Var3.Y1;
            canvas2.save();
            this.u3 = v2Var3.getY() + v2Var3.C0 + imageReceiver.L0;
            v2Var3.C0 = 0.0f;
            v2Var3.n = 0.0f;
            float f20 = this.v3;
            if (f20 != 1.0f) {
                float f21 = f20 + 0.08f;
                this.v3 = f21;
                f12 = 1.0f;
                this.v3 = Utilities.i(f21, 1.0f, 0.0f);
                invalidate();
            } else {
                f12 = 1.0f;
            }
            float interpolation = org.telegram.ui.Components.gr.f.getInterpolation(this.v3);
            if (interpolation != f12) {
                float f22 = this.w3;
                if (f22 != -2.14748365E9f) {
                    if (Math.abs(f22 - this.u3) < getMeasuredHeight() * 0.4f) {
                        this.u3 = org.telegram.messenger.i0.T1(this.w3, this.u3, interpolation);
                    } else {
                        z10 = true;
                        if (this.x3 || !(z10 || this.w3 == -2.14748365E9f)) {
                            f13 = 1.0f;
                            interpolation = this.o3;
                        } else {
                            f13 = 1.0f;
                        }
                        f14 = f13 - interpolation;
                        if (f14 != f13) {
                            f7 = -2.14748365E9f;
                            this.u3 = -2.14748365E9f;
                        } else {
                            f7 = -2.14748365E9f;
                        }
                        float f23 = (-org.telegram.messenger.i0.L(5.0f)) * f14;
                        RectF rectF = org.telegram.messenger.i0.P;
                        rectF.set((-org.telegram.messenger.i0.L(4.0f)) + f23, this.u3 - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(4.0f) + f23, this.u3 + imageReceiver.N0 + org.telegram.messenger.i0.L(1.0f));
                        if (this.t3 == null) {
                            this.t3 = new Paint(1);
                        }
                        p6Var = p6Var4;
                        this.t3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), this.t3);
                        canvas2.restore();
                    }
                }
            }
            z10 = false;
            if (this.x3) {
            }
            f13 = 1.0f;
            interpolation = this.o3;
            f14 = f13 - interpolation;
            if (f14 != f13) {
            }
            float f232 = (-org.telegram.messenger.i0.L(5.0f)) * f14;
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set((-org.telegram.messenger.i0.L(4.0f)) + f232, this.u3 - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(4.0f) + f232, this.u3 + imageReceiver.N0 + org.telegram.messenger.i0.L(1.0f));
            if (this.t3 == null) {
            }
            p6Var = p6Var4;
            this.t3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), this.t3);
            canvas2.restore();
        } else {
            f7 = -2.14748365E9f;
            p6Var = p6Var4;
            this.u3 = -2.14748365E9f;
        }
        boolean z13 = false;
        if (this.s3 != null) {
            float f24 = 2.14748365E9f;
            for (int i21 = 0; i21 < this.s3.size(); i21++) {
                View view3 = (View) this.s3.valueAt(i21);
                this.r3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i19 && view3.getTop() > f7) {
                    f7 = view3.getTop();
                }
                if (S2 > i18 && view3.getBottom() < f24) {
                    f24 = view3.getBottom();
                }
            }
            for (int i22 = 0; i22 < this.s3.size(); i22++) {
                View view4 = (View) this.s3.valueAt(i22);
                if (view4 instanceof org.telegram.ui.Cells.v2) {
                    this.r3.getClass();
                    int S3 = RecyclerView.S(view4);
                    org.telegram.ui.Cells.v2 v2Var5 = (org.telegram.ui.Cells.v2) view4;
                    v2Var5.j0 = false;
                    v2Var5.z();
                    v2Var5.j0 = true;
                    v2Var5.setRightFragmentOpenedProgress(this.o3);
                    int save2 = canvas2.save();
                    if (S3 > i18) {
                        canvas2.translate(view4.getX(), (f19 + view4.getBottom()) - f24);
                    } else {
                        canvas2.translate(view4.getX(), (f19 + view4.getTop()) - f7);
                    }
                    view4.draw(canvas2);
                    canvas2.restoreToCount(save2);
                }
            }
            this.s3.clear();
            z13 = false;
        }
        this.j3 = z13;
        if (this.r3 != null) {
            invalidate();
        }
        if (this.r3 == null) {
            super.dispatchDraw(canvas);
        }
        if (getItemAnimator() != null && getItemAnimator().k()) {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var));
            int i23 = 0;
            while (i23 < getChildCount()) {
                View childAt3 = getChildAt(i23);
                if (((childAt3 instanceof org.telegram.ui.Cells.v2) && ((org.telegram.ui.Cells.v2) childAt3).r) || ((childAt3 instanceof zf.l) && ((zf.l) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x10 = childAt3.getX();
                        float y3 = childAt3.getY();
                        float x11 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y10 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.q3;
                        rectF3.set(x10, y3, x11, y10);
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
                i23++;
                paint = paint2;
            }
            invalidate();
        }
        org.telegram.ui.Cells.v2 v2Var6 = ayVar.W0;
        if (v2Var6 != null && (gc0Var = ayVar.V0) != null) {
            int measuredHeight = (ayVar.W0.getMeasuredHeight() / 2) + v2Var6.getTop();
            Paint paint4 = gc0Var.b;
            View view5 = gc0Var.c;
            RectF rectF4 = gc0Var.f;
            Paint paint5 = gc0Var.a;
            int L = org.telegram.messenger.i0.L(110.0f);
            int L2 = org.telegram.messenger.i0.L(org.telegram.messenger.tz.p1 ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r9) * gc0Var.h) - org.telegram.messenger.m5.D(62.0f, 3, L);
            int i24 = L / 2;
            int i25 = measuredHeight - i24;
            paint5.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false));
            int i26 = L2 / 2;
            float f25 = measuredHeight - i26;
            float f26 = i24 + measuredWidth;
            float f27 = i26 + measuredHeight + 1;
            canvas.drawRect(0.0f, f25, f26, f27, paint5);
            paint5.setColor(-69120);
            float f28 = L + measuredWidth;
            rectF4.set(measuredWidth, i25, f28, i25 + L);
            float f29 = gc0Var.g;
            float f30 = 35.0f;
            int x12 = (int) (f29 < 0.5f ? org.telegram.messenger.z20.x(f29, 0.5f, 1.0f, 35.0f) : ((f29 - 0.5f) * 35.0f) / 0.5f);
            float f31 = x12;
            float f32 = 360 - (x12 * 2);
            canvas.drawArc(rectF4, f31, f32, true, paint4);
            canvas.drawArc(rectF4, f31, f32, true, paint5);
            paint5.setColor(-16777216);
            float f33 = 8.0f;
            canvas.drawCircle(f26 - org.telegram.messenger.i0.L(8.0f), (L / 4) + i25, org.telegram.messenger.i0.L(8.0f), paint5);
            canvas.save();
            float f34 = 20.0f;
            canvas.translate(org.telegram.messenger.i0.L(20.0f) + f28, measuredHeight - org.telegram.messenger.i0.L(25.0f));
            int i27 = 0;
            for (int i28 = 3; i27 < i28; i28 = 3) {
                Path path = gc0Var.j;
                float f35 = f33;
                if (path != null) {
                    f10 = f34;
                    if (gc0Var.k == gc0Var.l) {
                        f11 = f30;
                        canvas.drawPath(gc0Var.j, paint4);
                        if (i27 != 0) {
                            paint5.setColor(-90112);
                        } else if (i27 == 1) {
                            paint5.setColor(-85326);
                        } else {
                            paint5.setColor(-16720161);
                        }
                        canvas.drawPath(gc0Var.j, paint5);
                        paint5.setColor(-1);
                        rectF4.set(org.telegram.messenger.i0.L(f35), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(28.0f));
                        canvas.drawOval(rectF4, paint5);
                        rectF4.set(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(28.0f));
                        canvas.drawOval(rectF4, paint5);
                        paint5.setColor(-16777216);
                        rectF4.set(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(24.0f));
                        canvas.drawOval(rectF4, paint5);
                        rectF4.set(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(24.0f));
                        canvas.drawOval(rectF4, paint5);
                        canvas.translate(org.telegram.messenger.i0.L(62.0f), 0.0f);
                        i27++;
                        f30 = f11;
                        f33 = f35;
                        f34 = f10;
                    }
                } else {
                    f10 = f34;
                }
                if (path == null) {
                    gc0Var.j = new Path();
                }
                gc0Var.j.reset();
                boolean z14 = gc0Var.k;
                gc0Var.l = z14;
                if (z14) {
                    gc0Var.j.moveTo(0.0f, org.telegram.messenger.i0.L(50.0f));
                    gc0Var.j.lineTo(0.0f, org.telegram.messenger.i0.L(24.0f));
                    rectF4.set(0.0f, 0.0f, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(24.0f));
                    gc0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    gc0Var.j.lineTo(org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(50.0f));
                    gc0Var.j.lineTo(org.telegram.messenger.i0.L(r4), org.telegram.messenger.i0.L(43.0f));
                    gc0Var.j.lineTo(org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(50.0f));
                    gc0Var.j.lineTo(org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(43.0f));
                    gc0Var.j.lineTo(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(50.0f));
                    gc0Var.j.lineTo(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(43.0f));
                    f11 = f30;
                } else {
                    f11 = f30;
                    gc0Var.j.moveTo(0.0f, org.telegram.messenger.i0.L(43.0f));
                    gc0Var.j.lineTo(0.0f, org.telegram.messenger.i0.L(24.0f));
                    rectF4.set(0.0f, 0.0f, org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(24.0f));
                    gc0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    gc0Var.j.lineTo(org.telegram.messenger.i0.L(42.0f), org.telegram.messenger.i0.L(43.0f));
                    gc0Var.j.lineTo(org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(50.0f));
                    gc0Var.j.lineTo(org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(43.0f));
                    gc0Var.j.lineTo(org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(50.0f));
                    gc0Var.j.lineTo(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(43.0f));
                    gc0Var.j.lineTo(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(50.0f));
                }
                gc0Var.j.close();
                canvas.drawPath(gc0Var.j, paint4);
                if (i27 != 0) {
                }
                canvas.drawPath(gc0Var.j, paint5);
                paint5.setColor(-1);
                rectF4.set(org.telegram.messenger.i0.L(f35), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(28.0f));
                canvas.drawOval(rectF4, paint5);
                rectF4.set(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(28.0f));
                canvas.drawOval(rectF4, paint5);
                paint5.setColor(-16777216);
                rectF4.set(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(24.0f));
                canvas.drawOval(rectF4, paint5);
                rectF4.set(org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(24.0f));
                canvas.drawOval(rectF4, paint5);
                canvas.translate(org.telegram.messenger.i0.L(62.0f), 0.0f);
                i27++;
                f30 = f11;
                f33 = f35;
                f34 = f10;
            }
            canvas.restore();
            if (gc0Var.h >= 1.0f) {
                gc0Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - gc0Var.e;
            gc0Var.e = currentTimeMillis;
            if (j10 > 17) {
                j10 = 17;
            }
            if (gc0Var.g >= 1.0f) {
                gc0Var.g = 0.0f;
            }
            float f36 = j10;
            float f37 = (f36 / 400.0f) + gc0Var.g;
            gc0Var.g = f37;
            if (f37 > 1.0f) {
                gc0Var.g = 1.0f;
            }
            float f38 = (f36 / 2000.0f) + gc0Var.h;
            gc0Var.h = f38;
            if (f38 > 1.0f) {
                gc0Var.h = 1.0f;
            }
            float f39 = (f36 / 200.0f) + gc0Var.i;
            gc0Var.i = f39;
            if (f39 >= 1.0f) {
                gc0Var.k = !gc0Var.k;
                gc0Var.i = 0.0f;
            }
            view5.invalidate();
        }
        if (this.y3 == null) {
            i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
            th.w7[] w7VarArr = th.w7.f;
            if (w7VarArr[i10] == null) {
                w7VarArr[i10] = new th.w7(i10);
            }
            this.y3 = w7VarArr[i10];
        }
        this.y3.a(this);
    }

    @Override // org.telegram.ui.Components.tk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.A3.N) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.r9, org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.v2) && ((org.telegram.ui.Cells.v2) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return ay.A4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        zx zxVar = this.m3;
        if (zxVar.n != null && ay.A4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            zxVar.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (this.V1) {
            return false;
        }
        ay ayVar = this.A3;
        if (ayVar.b1 || this.m3.y.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            ayVar.c1 = !lVar.u();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.n3 = getPaddingTop();
        this.A3.y3 = 0.0f;
        this.m3.getClass();
    }

    @Override // org.telegram.ui.Components.r9, org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        zx[] zxVarArr;
        AnimatorSet animatorSet;
        zx zxVar = this.m3;
        int L0 = zxVar.c.L0();
        ay ayVar = this.A3;
        if (L0 != -1 && zxVar.e.D == 0 && zxVar.c.y < 0 && zxVar.a.getScrollState() != 1) {
            s4.c1 K = zxVar.a.K(L0);
            if (K != null) {
                int top = K.a.getTop();
                if (zxVar.s == 0 && ayVar.k4() && zxVar.w == 2) {
                    L0 = Math.max(1, L0);
                }
                this.l3 = true;
                zxVar.c.h1(L0, (int) ((top - this.n3) + ayVar.y3 + 0));
                this.l3 = false;
            }
        } else if (L0 == -1 && this.k3) {
            zxVar.c.h1((zxVar.s == 0 && ayVar.k4()) ? 1 : 0, (int) ayVar.N);
        }
        this.l3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
        int i12 = currentActionBarHeight + (lVar.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
        if (ayVar.K && !ayVar.O) {
            i12 += org.telegram.messenger.i0.L(81.0f);
        }
        if (!ayVar.O) {
            i12 += org.telegram.messenger.i0.L(48.0f);
        }
        this.z3 = 0;
        float d42 = ayVar.d4(false);
        org.telegram.ui.Components.zr zrVar = ayVar.J1;
        float f7 = zrVar != null ? zrVar.getMetadata().c.a : 0.0f;
        int L = i12 + ((int) (org.telegram.messenger.i0.L(50.0f) * d42));
        this.z3 += (int) (org.telegram.messenger.i0.L(50.0f) * d42);
        org.telegram.ui.Components.zr zrVar2 = ayVar.J1;
        if (zrVar2 != null) {
            int c10 = (int) zrVar2.c(org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(7.0f), d42));
            L += c10;
            this.z3 += c10;
        }
        int L2 = L - org.telegram.messenger.i0.L(Math.max(d42, f7) * 5.0f);
        this.z3 -= org.telegram.messenger.i0.L(Math.max(d42, f7) * 5.0f);
        int v32 = ayVar.v3();
        if (L2 != this.f3 || v32 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, v32);
            if (ayVar.K) {
                zxVar.x.setPaddingTop(L2 - org.telegram.messenger.i0.L(81.0f));
            } else {
                zxVar.x.setPaddingTop(L2);
            }
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof zf.l) {
                    getChildAt(i13).requestLayout();
                }
            }
        }
        this.l3 = false;
        if (this.k3 && ayVar.getMessagesController().Y1) {
            if (zxVar.s == 0 && ayVar.k4()) {
                this.l3 = true;
                ((s4.a0) getLayoutManager()).h1(1, (int) ayVar.N);
                this.l3 = false;
            }
            this.k3 = false;
        }
        super.onMeasure(i10, i11);
        if (ayVar.l2 || L2 == 0 || (zxVarArr = ayVar.e0) == null || zxVarArr.length <= 1 || ayVar.m3 || (animatorSet = ayVar.g3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.c1 c1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!this.V1) {
            ay ayVar = this.A3;
            if (!ayVar.b1 && !ayVar.D) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                zx zxVar = this.m3;
                if (action == 1 || action == 3) {
                    s4.x xVar = zxVar.e;
                    if (xVar.D != 0) {
                        yx yxVar = zxVar.f;
                        if (yxVar.e) {
                            yxVar.f = true;
                            if (xVar.i(null, 4) != 0 && (c1Var = zxVar.f.d) != null) {
                                View view = c1Var.a;
                                if (view instanceof org.telegram.ui.Cells.v2) {
                                    org.telegram.ui.Cells.v2 v2Var = (org.telegram.ui.Cells.v2) view;
                                    long dialogId = v2Var.getDialogId();
                                    if (org.telegram.messenger.o5.D(dialogId)) {
                                        C1(false, v2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) ayVar.getMessagesController().Q.f(dialogId);
                                        if (dialog != null) {
                                            if (org.telegram.messenger.w3.Y(ayVar.getMessagesController().L0(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                ayVar.C4(arrayList, org.telegram.messenger.zs.w1, true, false, null);
                                            } else {
                                                i10 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                                if (org.telegram.messenger.tz.m(i10) == 1) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Long.valueOf(dialogId));
                                                    ayVar.N2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                                    ayVar.C4(arrayList2, 101, true, false, null);
                                                } else {
                                                    i11 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                                    if (org.telegram.messenger.tz.m(i11) != 3) {
                                                        i12 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                                        if (org.telegram.messenger.tz.m(i12) == 0) {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            ayVar.O2 = !ayVar.r4(dialog) ? 1 : 0;
                                                            ayVar.C4(arrayList3, 100, true, false, null);
                                                        } else {
                                                            i13 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                                            if (org.telegram.messenger.tz.m(i13) == 4) {
                                                                ArrayList arrayList4 = new ArrayList();
                                                                arrayList4.add(Long.valueOf(dialogId));
                                                                ayVar.C4(arrayList4, org.telegram.messenger.zs.n1, true, false, null);
                                                            }
                                                        }
                                                    } else if (ayVar.getMessagesController().q2(dialogId, 0L, null)) {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        arrayList5.add(Long.valueOf(dialogId));
                                                        i14 = ((org.telegram.ui.ActionBar.k2) ayVar).currentAccount;
                                                        ayVar.P2 = !org.telegram.messenger.vp.r1(i14).q2(dialogId, 0L, null) ? 1 : 0;
                                                        ayVar.Q2 = ayVar.P2 > 0 ? 0 : 1;
                                                        ayVar.C4(arrayList5, org.telegram.messenger.zs.p1, true, false, null);
                                                    } else {
                                                        org.telegram.messenger.ot.t(org.telegram.messenger.d20.s0).T(dialogId, 3, 0L);
                                                        if (org.telegram.ui.Components.cc.a(ayVar)) {
                                                            org.telegram.ui.Components.cc.z(ayVar, 3, 0, null).j();
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
                if (zxVar.s == 0 && ((action == 1 || action == 3) && zxVar.w == 2 && ayVar.k4() && ((s4.a0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.v2 b42 = ay.b4(zxVar);
                    if (b42 != null) {
                        int L = (int) (org.telegram.messenger.i0.L(org.telegram.messenger.tz.p1 ? 76.0f : 70.0f) * 0.85f);
                        int measuredHeight = b42.getMeasuredHeight() + (b42.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - ayVar.d3;
                        if (measuredHeight < L || currentTimeMillis < 200) {
                            ayVar.e2 = true;
                            w0(0, measuredHeight, org.telegram.ui.Components.gr.h);
                            i15 = 2;
                            zxVar.w = 2;
                        } else {
                            if (zxVar.w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    ayVar.e2 = true;
                                    w0(0, b42.getTop() - paddingTop, org.telegram.ui.Components.gr.h);
                                }
                                if (!ayVar.f3) {
                                    ayVar.f3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    kw kwVar = zxVar.n;
                                    if (kwVar != null) {
                                        kwVar.a(true);
                                    }
                                }
                                b42.h0();
                                zxVar.w = 1;
                                if (org.telegram.messenger.i0.C1()) {
                                    org.telegram.messenger.i0.i2(org.telegram.messenger.cd.L0(2131754923, null));
                                }
                            }
                            i15 = 2;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[i15];
                            fArr[0] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new a3(this, 9));
                            ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.z20.v(getViewOffset(), org.telegram.messenger.i0.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Components.voip.h2(this, 8));
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

    @Override // org.telegram.ui.Components.r9, org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.tk0, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.k3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.o3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        ay.A4 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.C1 != -1 && (m10 = getLayoutManager().m(this.C1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f7);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.E1;
            rect.set(left, top, right, bottom);
            this.B1.setBounds(rect);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean w1() {
        return true;
    }

    @Override // org.telegram.ui.Components.r9
    public final int z1() {
        return org.telegram.messenger.i0.L(48.0f);
    }
}
