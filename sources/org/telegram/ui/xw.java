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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xw extends org.telegram.ui.Components.aa implements fi.w6 {
    public static final /* synthetic */ int C3 = 0;
    public int A3;
    public final /* synthetic */ bx B3;
    public boolean k3;
    public boolean l3;
    public boolean m3;
    public final ax n3;
    public int o3;
    public float p3;
    public final Paint q3;
    public final RectF r3;
    public org.telegram.ui.Components.ek0 s3;
    public LongSparseArray t3;
    public Paint u3;
    public float v3;
    public float w3;
    public float x3;
    public boolean y3;
    public fi.n9 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(bx bxVar, Context context, ax axVar) {
        super(context, null);
        this.B3 = bxVar;
        this.l3 = true;
        this.q3 = new Paint();
        this.r3 = new RectF();
        this.w3 = 1.0f;
        this.n3 = axVar;
        this.i3 = org.telegram.messenger.g0.L(200.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if ((r3.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B1(uv uvVar, float f10, boolean z10) {
        bx bxVar;
        org.telegram.ui.Components.ek0 ek0Var = uvVar == null ? this.s3 : this;
        if (ek0Var == null) {
            this.s3 = uvVar;
            return;
        }
        boolean z11 = false;
        org.telegram.ui.Cells.u2 u2Var = null;
        int i7 = 0;
        int i10 = Integer.MAX_VALUE;
        org.telegram.ui.Cells.u2 u2Var2 = null;
        while (true) {
            int childCount = ek0Var.getChildCount();
            bxVar = this.B3;
            if (i7 >= childCount) {
                break;
            }
            View childAt = ek0Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.u2) {
                org.telegram.ui.Cells.u2 u2Var3 = (org.telegram.ui.Cells.u2) childAt;
                if (u2Var3.getDialogId() == bxVar.H3.getCurrentFragmetDialogId()) {
                    u2Var = u2Var3;
                }
                if (childAt.getTop() >= 0 && u2Var3.getDialogId() != 0 && childAt.getTop() < i10) {
                    i10 = u2Var3.getTop();
                    u2Var2 = u2Var3;
                }
            }
            i7++;
        }
        if (u2Var != null) {
            if (org.telegram.messenger.g0.L(70.0f) * getAdapter().b() > getMeasuredHeight()) {
            }
        }
        u2Var = u2Var2;
        this.s3 = uvVar;
        if (u2Var != null) {
            if (uvVar != null) {
                uvVar.setPadding(getPaddingLeft(), this.g3, getPaddingLeft(), getPaddingBottom());
                int G = ((jg.m) uvVar.getAdapter()).G(u2Var.getDialogId());
                int top = (int) ((u2Var.getTop() - ek0Var.getPaddingTop()) + f10);
                if (G >= 0) {
                    ax axVar = this.n3;
                    if (axVar.s == 0 && axVar.w == 2 && bxVar.n4()) {
                        z11 = true;
                    }
                    int L = org.telegram.messenger.g0.L(org.telegram.messenger.bz.p1 ? 76.0f : 70.0f);
                    int paddingTop = ((getPaddingTop() + top) - (G * L)) - G;
                    if (z11) {
                        paddingTop += L;
                    }
                    int paddingTop2 = getPaddingTop();
                    if (paddingTop > paddingTop2) {
                        top = (top + paddingTop2) - paddingTop;
                    }
                    ((v4.c0) uvVar.getLayoutManager()).h1(G, top);
                }
            }
            int G2 = ((jg.m) getAdapter()).G(u2Var.getDialogId());
            int top2 = u2Var.getTop() - ek0Var.getPaddingTop();
            if (z10) {
                top2 -= (int) bxVar.O;
            }
            if (G2 >= 0) {
                ((v4.c0) getLayoutManager()).h1(G2, top2);
            }
        }
    }

    public final void C1(boolean z10, org.telegram.ui.Cells.u2 u2Var) {
        org.telegram.messenger.bz.q1 = !org.telegram.messenger.bz.q1;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
        edit.putBoolean("archiveHidden", org.telegram.messenger.bz.q1);
        edit.apply();
        bx bxVar = this.B3;
        UndoView l42 = bxVar.l4();
        if (!org.telegram.messenger.bz.q1) {
            l42.l(0L, 7, null, null);
            D1();
            if (!z10 || u2Var == null) {
                return;
            }
            u2Var.d0();
            u2Var.invalidate();
            return;
        }
        if (u2Var != null) {
            bxVar.g2 = true;
            bxVar.d1 = true;
            int top = (u2Var.getTop() - getPaddingTop()) + u2Var.getMeasuredHeight();
            if (bxVar.L && !bxVar.F0.g()) {
                bxVar.S = true;
                top += org.telegram.messenger.g0.L(81.0f);
            }
            w0(0, top, org.telegram.ui.Components.kr.g);
            if (z10) {
                bxVar.f1 = true;
            } else {
                D1();
            }
        }
        l42.l(0L, 6, null, null);
    }

    public final void D1() {
        int i7 = org.telegram.messenger.bz.q1 ? 2 : 0;
        ax axVar = this.n3;
        axVar.w = i7;
        iv ivVar = axVar.n;
        if (ivVar != null) {
            ivVar.X = i7 != 0;
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.o4) || view.isClickable();
    }

    @Override // fi.w6
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.B3.O);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i7, layoutParams);
        view.setTranslationY(bx.F4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02d0  */
    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f10;
        org.telegram.ui.ActionBar.i6 i6Var;
        int i7;
        org.telegram.ui.Components.xb0 xb0Var;
        float f11;
        float f12;
        Paint paint2;
        float f13;
        boolean z10;
        float f14;
        float f15;
        org.telegram.ui.ActionBar.i6 i6Var2;
        float f16;
        int i10;
        int i11;
        org.telegram.ui.Cells.u2 u2Var;
        int i12;
        org.telegram.ui.Cells.u2 u2Var2;
        int i13;
        int i14;
        int i15;
        View view;
        int R;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f17 = this.p3;
        org.telegram.ui.ActionBar.i6 i6Var3 = this.o2;
        Paint paint3 = this.q3;
        boolean z11 = true;
        boolean z12 = false;
        if (f17 > 0.0f) {
            canvas2.clipRect(0, 0, org.telegram.messenger.g0.W1(this.p3, getMeasuredWidth(), org.telegram.messenger.g0.L(xy0.getRightPaddingSize())), getMeasuredHeight());
            paint3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.s9, i6Var3));
            paint3.setAlpha((int) (paint3.getAlpha() * this.p3));
            canvas2.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(xy0.getRightPaddingSize()), getMeasuredHeight(), paint3);
            paint = paint3;
            int alpha = org.telegram.ui.ActionBar.n6.k0.getAlpha();
            org.telegram.ui.ActionBar.n6.k0.setAlpha((int) (this.p3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(org.telegram.messenger.g0.L(xy0.getRightPaddingSize()), 0.0f, org.telegram.messenger.g0.L(xy0.getRightPaddingSize()) - 1, getMeasuredHeight(), org.telegram.ui.ActionBar.n6.k0);
            org.telegram.ui.ActionBar.n6.k0.setAlpha(alpha);
        } else {
            paint = paint3;
        }
        if (this.s3 != null) {
            if (this.t3 == null) {
                this.t3 = new LongSparseArray();
            }
            for (int i16 = 0; i16 < this.s3.getChildCount(); i16++) {
                View childAt = this.s3.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.u2) && childAt.getBottom() > 0) {
                    this.t3.put(((org.telegram.ui.Cells.u2) childAt).getDialogId(), childAt);
                }
            }
        }
        bx bxVar = this.B3;
        float f18 = bxVar.F ? 0.0f : bxVar.O;
        int i17 = TLObject.FLAG_31;
        int i18 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i19 = 0;
        org.telegram.ui.Cells.u2 u2Var3 = null;
        float f19 = 2.1474836E9f;
        float f20 = -2.1474836E9f;
        while (i19 < getChildCount()) {
            View childAt2 = getChildAt(i19);
            if (childAt2 instanceof org.telegram.ui.Cells.u2) {
                org.telegram.ui.Cells.u2 u2Var4 = (org.telegram.ui.Cells.u2) childAt2;
                f16 = 1.0f;
                u2Var4.setRightFragmentOpenedProgress(this.p3);
                if (org.telegram.messenger.g0.Q1()) {
                    i6Var2 = i6Var3;
                    u2Var4.setDialogSelected(u2Var4.getDialogId() == bxVar.r2.a ? z11 : z12);
                } else {
                    i6Var2 = i6Var3;
                }
                LongSparseArray longSparseArray = this.t3;
                if (longSparseArray != null && this.s3 != null) {
                    View view2 = (View) longSparseArray.get(u2Var4.getDialogId());
                    this.t3.delete(u2Var4.getDialogId());
                    if (view2 != null) {
                        this.s3.getClass();
                        int S = RecyclerView.S(view2);
                        if (S > i17) {
                            i17 = S;
                        }
                        if (S < i18) {
                            i18 = S;
                        }
                        u2Var4.D0 = ((getPaddingTop() + (view2.getTop() - this.s3.getPaddingTop())) - u2Var4.getTop()) * this.p3;
                        if (u2Var4.getTop() + u2Var4.D0 < f19) {
                            f19 = (u2Var4.getTop() + u2Var4.D0) - f18;
                        }
                        float W1 = org.telegram.messenger.g0.W1(this.p3, u2Var4.getMeasuredHeight(), view2.getMeasuredHeight()) + u2Var4.getTop() + u2Var4.D0;
                        if (W1 > f20) {
                            f20 = W1 - f18;
                        }
                    }
                }
                if (this.k3 && u2Var4.k0(0, true) && (R = RecyclerView.R(u2Var4)) >= 0) {
                    getAdapter().g(R);
                }
                if (u2Var4.getDialogId() == bxVar.H3.getCurrentFragmetDialogId()) {
                    u2Var3 = u2Var4;
                    u2Var = u2Var3;
                } else {
                    u2Var = u2Var4;
                }
                i10 = i17;
                i11 = i18;
            } else {
                i6Var2 = i6Var3;
                f16 = 1.0f;
                i10 = i17;
                i11 = i18;
                u2Var = null;
            }
            if (this.s3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (u2Var != null) {
                    u2Var.n = -f18;
                    view = childAt2;
                    i12 = i19;
                    u2Var2 = u2Var3;
                    i13 = i10;
                    i14 = i11;
                    i15 = save;
                } else {
                    i13 = i10;
                    i15 = save;
                    i14 = i11;
                    u2Var2 = u2Var3;
                    i12 = i19;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f16 - this.p3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (u2Var != null && u2Var != u2Var2) {
                    u2Var.D0 = 0.0f;
                    u2Var.n = 0.0f;
                }
                canvas2.restoreToCount(i15);
            } else {
                i12 = i19;
                u2Var2 = u2Var3;
                i13 = i10;
                i14 = i11;
            }
            i19 = i12 + 1;
            u2Var3 = u2Var2;
            i17 = i13;
            i6Var3 = i6Var2;
            i18 = i14;
            z11 = true;
            z12 = false;
        }
        org.telegram.ui.ActionBar.i6 i6Var4 = i6Var3;
        if (u2Var3 != null) {
            ImageReceiver imageReceiver = u2Var3.Z1;
            canvas2.save();
            this.v3 = u2Var3.getY() + u2Var3.D0 + imageReceiver.M0;
            u2Var3.D0 = 0.0f;
            u2Var3.n = 0.0f;
            float f21 = this.w3;
            if (f21 != 1.0f) {
                float f22 = f21 + 0.08f;
                this.w3 = f22;
                f13 = 1.0f;
                this.w3 = Utilities.i(f22, 1.0f, 0.0f);
                invalidate();
            } else {
                f13 = 1.0f;
            }
            float interpolation = org.telegram.ui.Components.kr.f.getInterpolation(this.w3);
            if (interpolation != f13) {
                float f23 = this.x3;
                if (f23 != -2.1474836E9f) {
                    if (Math.abs(f23 - this.v3) < getMeasuredHeight() * 0.4f) {
                        this.v3 = org.telegram.messenger.g0.T1(this.x3, this.v3, interpolation);
                    } else {
                        z10 = true;
                        if (this.y3 || !(z10 || this.x3 == -2.1474836E9f)) {
                            f14 = 1.0f;
                            interpolation = this.p3;
                        } else {
                            f14 = 1.0f;
                        }
                        f15 = f14 - interpolation;
                        if (f15 != f14) {
                            f10 = -2.1474836E9f;
                            this.v3 = -2.1474836E9f;
                        } else {
                            f10 = -2.1474836E9f;
                        }
                        float f24 = (-org.telegram.messenger.g0.L(5.0f)) * f15;
                        RectF rectF = org.telegram.messenger.g0.P;
                        rectF.set((-org.telegram.messenger.g0.L(4.0f)) + f24, this.v3 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f) + f24, this.v3 + imageReceiver.O0 + org.telegram.messenger.g0.L(1.0f));
                        if (this.u3 == null) {
                            this.u3 = new Paint(1);
                        }
                        i6Var = i6Var4;
                        this.u3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.u3);
                        canvas2.restore();
                    }
                }
            }
            z10 = false;
            if (this.y3) {
            }
            f14 = 1.0f;
            interpolation = this.p3;
            f15 = f14 - interpolation;
            if (f15 != f14) {
            }
            float f242 = (-org.telegram.messenger.g0.L(5.0f)) * f15;
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set((-org.telegram.messenger.g0.L(4.0f)) + f242, this.v3 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(4.0f) + f242, this.v3 + imageReceiver.O0 + org.telegram.messenger.g0.L(1.0f));
            if (this.u3 == null) {
            }
            i6Var = i6Var4;
            this.u3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), this.u3);
            canvas2.restore();
        } else {
            f10 = -2.1474836E9f;
            i6Var = i6Var4;
            this.v3 = -2.1474836E9f;
        }
        boolean z13 = false;
        if (this.t3 != null) {
            float f25 = 2.1474836E9f;
            for (int i20 = 0; i20 < this.t3.size(); i20++) {
                View view3 = (View) this.t3.valueAt(i20);
                this.s3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i18 && view3.getTop() > f10) {
                    f10 = view3.getTop();
                }
                if (S2 > i17 && view3.getBottom() < f25) {
                    f25 = view3.getBottom();
                }
            }
            for (int i21 = 0; i21 < this.t3.size(); i21++) {
                View view4 = (View) this.t3.valueAt(i21);
                if (view4 instanceof org.telegram.ui.Cells.u2) {
                    this.s3.getClass();
                    int S3 = RecyclerView.S(view4);
                    org.telegram.ui.Cells.u2 u2Var5 = (org.telegram.ui.Cells.u2) view4;
                    u2Var5.k0 = false;
                    u2Var5.z();
                    u2Var5.k0 = true;
                    u2Var5.setRightFragmentOpenedProgress(this.p3);
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
            this.t3.clear();
            z13 = false;
        }
        this.k3 = z13;
        if (this.s3 != null) {
            invalidate();
        }
        if (this.s3 == null) {
            super.dispatchDraw(canvas);
        }
        if (getItemAnimator() != null && getItemAnimator().k()) {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d6, i6Var));
            int i22 = 0;
            while (i22 < getChildCount()) {
                View childAt3 = getChildAt(i22);
                if (((childAt3 instanceof org.telegram.ui.Cells.u2) && ((org.telegram.ui.Cells.u2) childAt3).r) || ((childAt3 instanceof jg.l) && ((jg.l) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x10 = childAt3.getX();
                        float y10 = childAt3.getY();
                        float x11 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y11 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.r3;
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
        org.telegram.ui.Cells.u2 u2Var6 = bxVar.Y0;
        if (u2Var6 != null && (xb0Var = bxVar.X0) != null) {
            int measuredHeight = (bxVar.Y0.getMeasuredHeight() / 2) + u2Var6.getTop();
            Paint paint4 = xb0Var.b;
            View view5 = xb0Var.c;
            RectF rectF4 = xb0Var.f;
            Paint paint5 = xb0Var.a;
            int L = org.telegram.messenger.g0.L(110.0f);
            int L2 = org.telegram.messenger.g0.L(org.telegram.messenger.bz.p1 ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r9) * xb0Var.h) - org.telegram.messenger.f3.D(62.0f, 3, L);
            int i23 = L / 2;
            int i24 = measuredHeight - i23;
            paint5.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false));
            int i25 = L2 / 2;
            float f26 = measuredHeight - i25;
            float f27 = i23 + measuredWidth;
            float f28 = i25 + measuredHeight + 1;
            canvas.drawRect(0.0f, f26, f27, f28, paint5);
            paint5.setColor(-69120);
            float f29 = L + measuredWidth;
            rectF4.set(measuredWidth, i24, f29, i24 + L);
            float f30 = xb0Var.g;
            float f31 = 35.0f;
            int y12 = (int) (f30 < 0.5f ? org.telegram.messenger.m10.y(f30, 0.5f, 1.0f, 35.0f) : ((f30 - 0.5f) * 35.0f) / 0.5f);
            float f32 = y12;
            float f33 = 360 - (y12 * 2);
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
                Path path = xb0Var.j;
                float f36 = f34;
                if (path != null) {
                    f11 = f35;
                    if (xb0Var.k == xb0Var.l) {
                        f12 = f31;
                        canvas.drawPath(xb0Var.j, paint4);
                        if (i26 != 0) {
                            paint5.setColor(-90112);
                        } else if (i26 == 1) {
                            paint5.setColor(-85326);
                        } else {
                            paint5.setColor(-16720161);
                        }
                        canvas.drawPath(xb0Var.j, paint5);
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
                    xb0Var.j = new Path();
                }
                xb0Var.j.reset();
                boolean z14 = xb0Var.k;
                xb0Var.l = z14;
                if (z14) {
                    xb0Var.j.moveTo(0.0f, org.telegram.messenger.g0.L(50.0f));
                    xb0Var.j.lineTo(0.0f, org.telegram.messenger.g0.L(24.0f));
                    rectF4.set(0.0f, 0.0f, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(24.0f));
                    xb0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    xb0Var.j.lineTo(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(50.0f));
                    xb0Var.j.lineTo(org.telegram.messenger.g0.L(r4), org.telegram.messenger.g0.L(43.0f));
                    xb0Var.j.lineTo(org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(50.0f));
                    xb0Var.j.lineTo(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(43.0f));
                    xb0Var.j.lineTo(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(50.0f));
                    xb0Var.j.lineTo(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(43.0f));
                    f12 = f31;
                } else {
                    f12 = f31;
                    xb0Var.j.moveTo(0.0f, org.telegram.messenger.g0.L(43.0f));
                    xb0Var.j.lineTo(0.0f, org.telegram.messenger.g0.L(24.0f));
                    rectF4.set(0.0f, 0.0f, org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(24.0f));
                    xb0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    xb0Var.j.lineTo(org.telegram.messenger.g0.L(42.0f), org.telegram.messenger.g0.L(43.0f));
                    xb0Var.j.lineTo(org.telegram.messenger.g0.L(f12), org.telegram.messenger.g0.L(50.0f));
                    xb0Var.j.lineTo(org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(43.0f));
                    xb0Var.j.lineTo(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(50.0f));
                    xb0Var.j.lineTo(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(43.0f));
                    xb0Var.j.lineTo(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(50.0f));
                }
                xb0Var.j.close();
                canvas.drawPath(xb0Var.j, paint4);
                if (i26 != 0) {
                }
                canvas.drawPath(xb0Var.j, paint5);
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
            if (xb0Var.h >= 1.0f) {
                xb0Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - xb0Var.e;
            xb0Var.e = currentTimeMillis;
            if (j3 > 17) {
                j3 = 17;
            }
            if (xb0Var.g >= 1.0f) {
                xb0Var.g = 0.0f;
            }
            float f37 = j3;
            float f38 = (f37 / 400.0f) + xb0Var.g;
            xb0Var.g = f38;
            if (f38 > 1.0f) {
                xb0Var.g = 1.0f;
            }
            float f39 = (f37 / 2000.0f) + xb0Var.h;
            xb0Var.h = f39;
            if (f39 > 1.0f) {
                xb0Var.h = 1.0f;
            }
            float f40 = (f37 / 200.0f) + xb0Var.i;
            xb0Var.i = f40;
            if (f40 >= 1.0f) {
                xb0Var.k = !xb0Var.k;
                xb0Var.i = 0.0f;
            }
            view5.invalidate();
        }
        if (this.z3 == null) {
            i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
            fi.n9[] n9VarArr = fi.n9.f;
            if (n9VarArr[i7] == null) {
                n9VarArr[i7] = new fi.n9(i7);
            }
            this.z3 = n9VarArr[i7];
        }
        this.z3.a(this);
    }

    @Override // org.telegram.ui.Components.ek0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.B3.O) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.u2) && ((org.telegram.ui.Cells.u2) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return bx.F4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        ax axVar = this.n3;
        if (axVar.n != null && bx.F4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            axVar.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.W1) {
            return false;
        }
        bx bxVar = this.B3;
        if (bxVar.d1 || this.n3.y.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            bxVar.e1 = !kVar.x();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.o3 = getPaddingTop();
        this.B3.A3 = 0.0f;
        this.n3.getClass();
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        ax[] axVarArr;
        AnimatorSet animatorSet;
        ax axVar = this.n3;
        int L0 = axVar.c.L0();
        bx bxVar = this.B3;
        if (L0 != -1 && axVar.e.E == 0 && axVar.c.y < 0 && axVar.a.getScrollState() != 1) {
            v4.f1 K = axVar.a.K(L0);
            if (K == null) {
                K = axVar.a.L(L0, false);
            }
            if (K != null) {
                int top = K.a.getTop();
                if (axVar.s == 0 && bxVar.n4() && axVar.w == 2) {
                    L0 = Math.max(1, L0);
                }
                this.m3 = true;
                axVar.c.h1(L0, (int) ((top - this.o3) + bxVar.A3 + 0));
                this.m3 = false;
            }
        } else if (L0 == -1 && this.l3) {
            axVar.c.h1((axVar.s == 0 && bxVar.n4()) ? 1 : 0, (int) bxVar.O);
        }
        this.m3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
        int i11 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
        if (bxVar.L && !bxVar.P) {
            i11 += org.telegram.messenger.g0.L(81.0f);
        }
        if (!bxVar.P) {
            i11 += org.telegram.messenger.g0.L(48.0f);
        }
        this.A3 = 0;
        float e42 = bxVar.e4(false);
        org.telegram.ui.Components.bs bsVar = bxVar.L1;
        float f10 = bsVar != null ? bsVar.getMetadata().c.a : 0.0f;
        float L = org.telegram.messenger.g0.L(50.0f);
        qw qwVar = bxVar.A0;
        int unreadOnlyBannerHeight = (int) ((L + (qwVar != null ? qwVar.getUnreadOnlyBannerHeight() : 0.0f)) * e42);
        int i12 = i11 + unreadOnlyBannerHeight;
        this.A3 += unreadOnlyBannerHeight;
        org.telegram.ui.Components.bs bsVar2 = bxVar.L1;
        if (bsVar2 != null) {
            int d = (int) bsVar2.d(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(7.0f), e42));
            i12 += d;
            this.A3 += d;
        }
        int L2 = i12 - org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        this.A3 -= org.telegram.messenger.g0.L(Math.max(e42, f10) * 5.0f);
        int w32 = bxVar.w3();
        if (L2 != this.g3 || w32 != getPaddingBottom()) {
            setTopGlowOffset(L2);
            setPadding(0, L2, 0, w32);
            if (bxVar.L) {
                axVar.x.setPaddingTop(L2 - org.telegram.messenger.g0.L(81.0f));
            } else {
                axVar.x.setPaddingTop(L2);
            }
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof jg.l) {
                    getChildAt(i13).requestLayout();
                }
            }
        }
        this.m3 = false;
        if (this.l3 && bxVar.getMessagesController().b2) {
            if (axVar.s == 0 && bxVar.n4()) {
                this.m3 = true;
                ((v4.c0) getLayoutManager()).h1(1, (int) bxVar.O);
                this.m3 = false;
            }
            this.l3 = false;
        }
        super.onMeasure(i7, i10);
        if (bxVar.n2 || L2 == 0 || (axVarArr = bxVar.f0) == null || axVarArr.length <= 1 || bxVar.o3 || (animatorSet = bxVar.i3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        v4.f1 f1Var;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (!this.W1) {
            bx bxVar = this.B3;
            if (!bxVar.d1 && !bxVar.E) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                ax axVar = this.n3;
                if (action == 1 || action == 3) {
                    v4.z zVar = axVar.e;
                    if (zVar.E != 0) {
                        zw zwVar = axVar.f;
                        if (zwVar.e) {
                            zwVar.f = true;
                            if (zVar.i(null, 4) != 0 && (f1Var = axVar.f.d) != null) {
                                View view = f1Var.a;
                                if (view instanceof org.telegram.ui.Cells.u2) {
                                    org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) view;
                                    long dialogId = u2Var.getDialogId();
                                    if (org.telegram.messenger.n5.D(dialogId)) {
                                        C1(false, u2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) bxVar.getMessagesController().R.f(dialogId);
                                        if (dialog != null) {
                                            if (org.telegram.messenger.v3.Y(bxVar.getMessagesController().O0(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                bxVar.K4(arrayList, org.telegram.messenger.ks.w1, true, false, null);
                                            } else {
                                                i7 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                                if (org.telegram.messenger.bz.m(i7) == 1) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Long.valueOf(dialogId));
                                                    bxVar.P2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                                    bxVar.K4(arrayList2, 101, true, false, null);
                                                } else {
                                                    i10 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                                    if (org.telegram.messenger.bz.m(i10) != 3) {
                                                        i11 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                                        if (org.telegram.messenger.bz.m(i11) == 0) {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            bxVar.Q2 = !bxVar.v4(dialog) ? 1 : 0;
                                                            bxVar.K4(arrayList3, 100, true, false, null);
                                                        } else {
                                                            i12 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                                            if (org.telegram.messenger.bz.m(i12) == 4) {
                                                                ArrayList arrayList4 = new ArrayList();
                                                                arrayList4.add(Long.valueOf(dialogId));
                                                                bxVar.K4(arrayList4, org.telegram.messenger.ks.n1, true, false, null);
                                                            }
                                                        }
                                                    } else if (bxVar.getMessagesController().u2(dialogId, 0L, null)) {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        arrayList5.add(Long.valueOf(dialogId));
                                                        i13 = ((org.telegram.ui.ActionBar.g2) bxVar).currentAccount;
                                                        bxVar.R2 = !org.telegram.messenger.mp.u1(i13).u2(dialogId, 0L, null) ? 1 : 0;
                                                        bxVar.S2 = bxVar.R2 > 0 ? 0 : 1;
                                                        bxVar.K4(arrayList5, org.telegram.messenger.ks.p1, true, false, null);
                                                    } else {
                                                        org.telegram.messenger.xs.t(org.telegram.messenger.i10.t0).T(dialogId, 3, 0L);
                                                        if (org.telegram.ui.Components.kc.a(bxVar)) {
                                                            org.telegram.ui.Components.kc.z(bxVar, 3, 0, null).j();
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
                if (axVar.s == 0 && ((action == 1 || action == 3) && axVar.w == 2 && bxVar.n4() && ((v4.c0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.u2 c42 = bx.c4(axVar);
                    if (c42 != null) {
                        int L = (int) (org.telegram.messenger.g0.L(org.telegram.messenger.bz.p1 ? 76.0f : 70.0f) * 0.85f);
                        int measuredHeight = c42.getMeasuredHeight() + (c42.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - bxVar.f3;
                        if (measuredHeight < L || currentTimeMillis < 200) {
                            bxVar.g2 = true;
                            w0(0, measuredHeight, org.telegram.ui.Components.kr.h);
                            i14 = 2;
                            axVar.w = 2;
                        } else {
                            if (axVar.w != 1) {
                                if (getViewOffset() == 0.0f) {
                                    bxVar.g2 = true;
                                    w0(0, c42.getTop() - paddingTop, org.telegram.ui.Components.kr.h);
                                }
                                if (!bxVar.h3) {
                                    bxVar.h3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    iv ivVar = axVar.n;
                                    if (ivVar != null) {
                                        ivVar.a(true);
                                    }
                                }
                                c42.j0();
                                axVar.w = 1;
                                if (org.telegram.messenger.g0.C1()) {
                                    org.telegram.messenger.g0.i2(org.telegram.messenger.gd.N0(2131754923, null));
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
                            ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.m10.w(getViewOffset(), org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.kr.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Cells.x9(this, 28));
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

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.m3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ek0, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(v4.i0 i0Var) {
        super.setAdapter(i0Var);
        this.l3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.p3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m10;
        bx.F4 = f10;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            getChildAt(i7).setTranslationY(f10);
        }
        if (this.D1 != -1 && (m10 = getLayoutManager().m(this.D1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f10);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.F1;
            rect.set(left, top, right, bottom);
            this.C1.setBounds(rect);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.ek0
    public final boolean w1() {
        return true;
    }

    @Override // org.telegram.ui.Components.aa
    public final int z1() {
        return org.telegram.messenger.g0.L(48.0f);
    }
}
