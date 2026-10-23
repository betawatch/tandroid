package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class zx extends org.telegram.ui.Components.ia implements ci.o7 {
    public static final /* synthetic */ int w3 = 0;
    public boolean e3;
    public boolean f3;
    public boolean g3;
    public final dy h3;
    public int i3;
    public float j3;
    public final Paint k3;
    public final RectF l3;
    public org.telegram.ui.Components.mm0 m3;
    public LongSparseArray n3;
    public Paint o3;
    public float p3;
    public float q3;
    public float r3;
    public boolean s3;
    public ci.ha t3;
    public int u3;
    public final /* synthetic */ ey v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(ey eyVar, Context context, dy dyVar) {
        super(context, null);
        this.v3 = eyVar;
        this.f3 = true;
        this.k3 = new Paint();
        this.l3 = new RectF();
        this.q3 = 1.0f;
        this.h3 = dyVar;
        this.c3 = AndroidUtilities.dp(200.0f);
    }

    @Override // org.telegram.ui.Components.ia
    public final int C1() {
        return AndroidUtilities.dp(48.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if ((r3.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E1(ww wwVar, float f7, boolean z10) {
        ey eyVar;
        org.telegram.ui.Components.mm0 mm0Var = wwVar == null ? this.m3 : this;
        if (mm0Var == null) {
            this.m3 = wwVar;
            return;
        }
        boolean z11 = false;
        org.telegram.ui.Cells.q2 q2Var = null;
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        org.telegram.ui.Cells.q2 q2Var2 = null;
        while (true) {
            int childCount = mm0Var.getChildCount();
            eyVar = this.v3;
            if (i10 >= childCount) {
                break;
            }
            View childAt = mm0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q2) {
                org.telegram.ui.Cells.q2 q2Var3 = (org.telegram.ui.Cells.q2) childAt;
                if (q2Var3.getDialogId() == eyVar.G3.getCurrentFragmetDialogId()) {
                    q2Var = q2Var3;
                }
                if (childAt.getTop() >= 0 && q2Var3.getDialogId() != 0 && childAt.getTop() < i11) {
                    i11 = q2Var3.getTop();
                    q2Var2 = q2Var3;
                }
            }
            i10++;
        }
        if (q2Var != null) {
            if (AndroidUtilities.dp(70.0f) * getAdapter().h() > getMeasuredHeight()) {
            }
        }
        q2Var = q2Var2;
        this.m3 = wwVar;
        if (q2Var != null) {
            if (wwVar != null) {
                wwVar.setPadding(getPaddingLeft(), this.Z2, getPaddingLeft(), getPaddingBottom());
                int G = ((hg.m) wwVar.getAdapter()).G(q2Var.getDialogId());
                int top = (int) ((q2Var.getTop() - mm0Var.getPaddingTop()) + f7);
                if (G >= 0) {
                    dy dyVar = this.h3;
                    if (dyVar.s == 0 && dyVar.v == 2 && eyVar.X3()) {
                        z11 = true;
                    }
                    int dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                    int paddingTop = ((getPaddingTop() + top) - (G * dp)) - G;
                    if (z11) {
                        paddingTop += dp;
                    }
                    int paddingTop2 = getPaddingTop();
                    if (paddingTop > paddingTop2) {
                        top = (top + paddingTop2) - paddingTop;
                    }
                    ((s4.b0) wwVar.getLayoutManager()).h1(G, top);
                }
            }
            int G2 = ((hg.m) getAdapter()).G(q2Var.getDialogId());
            int top2 = q2Var.getTop() - getPaddingTop();
            if (z10 && eyVar.K) {
                top2 += AndroidUtilities.dp(81.0f);
            }
            if (z10) {
                top2 += AndroidUtilities.dp(48.0f);
            }
            if (G2 >= 0) {
                ((s4.b0) getLayoutManager()).h1(G2, top2);
            }
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.l4) || view.isClickable();
    }

    public final void F1(boolean z10, org.telegram.ui.Cells.q2 q2Var) {
        SharedConfig.toggleArchiveHidden();
        ey eyVar = this.v3;
        UndoView W3 = eyVar.W3();
        if (!SharedConfig.archiveHidden) {
            W3.l(0L, 7, null, null);
            G1();
            if (!z10 || q2Var == null) {
                return;
            }
            q2Var.T();
            q2Var.invalidate();
            return;
        }
        if (q2Var != null) {
            eyVar.e2 = true;
            eyVar.b1 = true;
            int top = (q2Var.getTop() - getPaddingTop()) + q2Var.getMeasuredHeight();
            if (eyVar.K && !eyVar.E0.g()) {
                eyVar.R = true;
                top += AndroidUtilities.dp(81.0f);
            }
            v0(0, top, org.telegram.ui.Components.bs.g);
            if (z10) {
                eyVar.d1 = true;
            } else {
                G1();
            }
        }
        W3.l(0L, 6, null, null);
    }

    public final void G1() {
        int i10 = SharedConfig.archiveHidden ? 2 : 0;
        dy dyVar = this.h3;
        dyVar.v = i10;
        kw kwVar = dyVar.n;
        if (kwVar != null) {
            kwVar.X = i10 != 0;
        }
    }

    @Override // ci.o7
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.v3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(ey.C4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02c6  */
    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f7;
        org.telegram.ui.ActionBar.g6 g6Var;
        int i10;
        org.telegram.ui.Components.xd0 xd0Var;
        float f10;
        float f11;
        Paint paint2;
        float f12;
        boolean z10;
        float f13;
        float f14;
        org.telegram.ui.ActionBar.g6 g6Var2;
        float f15;
        int i11;
        int i12;
        org.telegram.ui.Cells.q2 q2Var;
        int i13;
        org.telegram.ui.Cells.q2 q2Var2;
        int i14;
        int i15;
        int i16;
        View view;
        int R;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f16 = this.j3;
        org.telegram.ui.ActionBar.g6 g6Var3 = this.n2;
        Paint paint3 = this.k3;
        boolean z11 = true;
        boolean z12 = false;
        if (f16 > 0.0f) {
            canvas2.clipRect(0, 0, AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(b31.getRightPaddingSize()), this.j3), getMeasuredHeight());
            paint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.s9, g6Var3));
            paint3.setAlpha((int) (paint3.getAlpha() * this.j3));
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(b31.getRightPaddingSize()), getMeasuredHeight(), paint3);
            paint = paint3;
            int alpha = org.telegram.ui.ActionBar.k6.k0.getAlpha();
            org.telegram.ui.ActionBar.k6.k0.setAlpha((int) (this.j3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(b31.getRightPaddingSize()), 0.0f, AndroidUtilities.dp(b31.getRightPaddingSize()) - 1, getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
            org.telegram.ui.ActionBar.k6.k0.setAlpha(alpha);
        } else {
            paint = paint3;
        }
        if (this.m3 != null) {
            if (this.n3 == null) {
                this.n3 = new LongSparseArray();
            }
            for (int i17 = 0; i17 < this.m3.getChildCount(); i17++) {
                View childAt = this.m3.getChildAt(i17);
                if ((childAt instanceof org.telegram.ui.Cells.q2) && childAt.getBottom() > 0) {
                    this.n3.put(((org.telegram.ui.Cells.q2) childAt).getDialogId(), childAt);
                }
            }
        }
        ey eyVar = this.v3;
        float f17 = eyVar.E ? 0.0f : eyVar.N;
        int i18 = TLObject.FLAG_31;
        int i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i20 = 0;
        org.telegram.ui.Cells.q2 q2Var3 = null;
        float f18 = 2.14748365E9f;
        float f19 = -2.14748365E9f;
        while (i20 < getChildCount()) {
            View childAt2 = getChildAt(i20);
            if (childAt2 instanceof org.telegram.ui.Cells.q2) {
                org.telegram.ui.Cells.q2 q2Var4 = (org.telegram.ui.Cells.q2) childAt2;
                f15 = 1.0f;
                q2Var4.setRightFragmentOpenedProgress(this.j3);
                if (AndroidUtilities.isTablet()) {
                    g6Var2 = g6Var3;
                    q2Var4.setDialogSelected(q2Var4.getDialogId() == eyVar.p2.dialogId ? z11 : z12);
                } else {
                    g6Var2 = g6Var3;
                }
                LongSparseArray longSparseArray = this.n3;
                if (longSparseArray != null && this.m3 != null) {
                    View view2 = (View) longSparseArray.get(q2Var4.getDialogId());
                    this.n3.delete(q2Var4.getDialogId());
                    if (view2 != null) {
                        this.m3.getClass();
                        int S = RecyclerView.S(view2);
                        if (S > i18) {
                            i18 = S;
                        }
                        if (S < i19) {
                            i19 = S;
                        }
                        q2Var4.C0 = (view2.getTop() - q2Var4.getTop()) * this.j3;
                        if (q2Var4.getTop() + q2Var4.C0 < f18) {
                            f18 = (q2Var4.getTop() + q2Var4.C0) - f17;
                        }
                        float lerp = AndroidUtilities.lerp(q2Var4.getMeasuredHeight(), view2.getMeasuredHeight(), this.j3) + q2Var4.getTop() + q2Var4.C0;
                        if (lerp > f19) {
                            f19 = lerp - f17;
                        }
                    }
                }
                if (this.e3 && q2Var4.a0(0, true) && (R = RecyclerView.R(q2Var4)) >= 0) {
                    getAdapter().m(R);
                }
                if (q2Var4.getDialogId() == eyVar.G3.getCurrentFragmetDialogId()) {
                    q2Var3 = q2Var4;
                    q2Var = q2Var3;
                } else {
                    q2Var = q2Var4;
                }
                i11 = i18;
                i12 = i19;
            } else {
                g6Var2 = g6Var3;
                f15 = 1.0f;
                i11 = i18;
                i12 = i19;
                q2Var = null;
            }
            if (this.m3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (q2Var != null) {
                    q2Var.n = -f17;
                    view = childAt2;
                    i13 = i20;
                    q2Var2 = q2Var3;
                    i14 = i11;
                    i15 = i12;
                    i16 = save;
                } else {
                    i14 = i11;
                    i16 = save;
                    i15 = i12;
                    q2Var2 = q2Var3;
                    i13 = i20;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f15 - this.j3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (q2Var != null && q2Var != q2Var2) {
                    q2Var.C0 = 0.0f;
                    q2Var.n = 0.0f;
                }
                canvas2.restoreToCount(i16);
            } else {
                i13 = i20;
                q2Var2 = q2Var3;
                i14 = i11;
                i15 = i12;
            }
            i20 = i13 + 1;
            q2Var3 = q2Var2;
            i18 = i14;
            g6Var3 = g6Var2;
            i19 = i15;
            z11 = true;
            z12 = false;
        }
        org.telegram.ui.ActionBar.g6 g6Var4 = g6Var3;
        if (q2Var3 != null) {
            ImageReceiver imageReceiver = q2Var3.Y1;
            canvas2.save();
            this.p3 = imageReceiver.getImageY() + q2Var3.getY() + q2Var3.C0;
            q2Var3.C0 = 0.0f;
            q2Var3.n = 0.0f;
            float f20 = this.q3;
            if (f20 != 1.0f) {
                float f21 = f20 + 0.08f;
                this.q3 = f21;
                f12 = 1.0f;
                this.q3 = Utilities.clamp(f21, 1.0f, 0.0f);
                invalidate();
            } else {
                f12 = 1.0f;
            }
            float interpolation = org.telegram.ui.Components.bs.f.getInterpolation(this.q3);
            if (interpolation != f12) {
                float f22 = this.r3;
                if (f22 != -2.14748365E9f) {
                    if (Math.abs(f22 - this.p3) < getMeasuredHeight() * 0.4f) {
                        this.p3 = AndroidUtilities.lerp(this.r3, this.p3, interpolation);
                    } else {
                        z10 = true;
                        if (this.s3 || !(z10 || this.r3 == -2.14748365E9f)) {
                            f13 = 1.0f;
                            interpolation = this.j3;
                        } else {
                            f13 = 1.0f;
                        }
                        f14 = f13 - interpolation;
                        if (f14 != f13) {
                            f7 = -2.14748365E9f;
                            this.p3 = -2.14748365E9f;
                        } else {
                            f7 = -2.14748365E9f;
                        }
                        float f23 = (-AndroidUtilities.dp(5.0f)) * f14;
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set((-AndroidUtilities.dp(4.0f)) + f23, this.p3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f23, imageReceiver.getImageHeight() + this.p3 + AndroidUtilities.dp(1.0f));
                        if (this.o3 == null) {
                            this.o3 = new Paint(1);
                        }
                        g6Var = g6Var4;
                        this.o3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.o3);
                        canvas2.restore();
                    }
                }
            }
            z10 = false;
            if (this.s3) {
            }
            f13 = 1.0f;
            interpolation = this.j3;
            f14 = f13 - interpolation;
            if (f14 != f13) {
            }
            float f232 = (-AndroidUtilities.dp(5.0f)) * f14;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((-AndroidUtilities.dp(4.0f)) + f232, this.p3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f232, imageReceiver.getImageHeight() + this.p3 + AndroidUtilities.dp(1.0f));
            if (this.o3 == null) {
            }
            g6Var = g6Var4;
            this.o3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.o3);
            canvas2.restore();
        } else {
            f7 = -2.14748365E9f;
            g6Var = g6Var4;
            this.p3 = -2.14748365E9f;
        }
        boolean z13 = false;
        if (this.n3 != null) {
            float f24 = 2.14748365E9f;
            for (int i21 = 0; i21 < this.n3.size(); i21++) {
                View view3 = (View) this.n3.valueAt(i21);
                this.m3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i19 && view3.getTop() > f7) {
                    f7 = view3.getTop();
                }
                if (S2 > i18 && view3.getBottom() < f24) {
                    f24 = view3.getBottom();
                }
            }
            for (int i22 = 0; i22 < this.n3.size(); i22++) {
                View view4 = (View) this.n3.valueAt(i22);
                if (view4 instanceof org.telegram.ui.Cells.q2) {
                    this.m3.getClass();
                    int S3 = RecyclerView.S(view4);
                    org.telegram.ui.Cells.q2 q2Var5 = (org.telegram.ui.Cells.q2) view4;
                    q2Var5.j0 = false;
                    q2Var5.t();
                    q2Var5.j0 = true;
                    q2Var5.setRightFragmentOpenedProgress(this.j3);
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
            this.n3.clear();
            z13 = false;
        }
        this.e3 = z13;
        if (this.m3 != null) {
            invalidate();
        }
        if (this.m3 == null) {
            super.dispatchDraw(canvas);
        }
        if (getItemAnimator() != null && getItemAnimator().k()) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, g6Var));
            int i23 = 0;
            while (i23 < getChildCount()) {
                View childAt3 = getChildAt(i23);
                if (((childAt3 instanceof org.telegram.ui.Cells.q2) && ((org.telegram.ui.Cells.q2) childAt3).r) || ((childAt3 instanceof hg.l) && ((hg.l) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x10 = childAt3.getX();
                        float y3 = childAt3.getY();
                        float x11 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y10 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.l3;
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
        org.telegram.ui.Cells.q2 q2Var6 = eyVar.W0;
        if (q2Var6 != null && (xd0Var = eyVar.V0) != null) {
            int measuredHeight = (eyVar.W0.getMeasuredHeight() / 2) + q2Var6.getTop();
            Paint paint4 = xd0Var.b;
            View view5 = xd0Var.c;
            RectF rectF4 = xd0Var.f;
            Paint paint5 = xd0Var.a;
            int dp = AndroidUtilities.dp(110.0f);
            int dp2 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r9) * xd0Var.h) - org.telegram.messenger.v0.D(62.0f, 3, dp);
            int i24 = dp / 2;
            int i25 = measuredHeight - i24;
            paint5.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
            int i26 = dp2 / 2;
            float f25 = measuredHeight - i26;
            float f26 = i24 + measuredWidth;
            float f27 = i26 + measuredHeight + 1;
            canvas.drawRect(0.0f, f25, f26, f27, paint5);
            paint5.setColor(-69120);
            float f28 = dp + measuredWidth;
            rectF4.set(measuredWidth, i25, f28, i25 + dp);
            float f29 = xd0Var.g;
            float f30 = 35.0f;
            int z14 = (int) (f29 < 0.5f ? org.telegram.messenger.sl.z(f29, 0.5f, 1.0f, 35.0f) : ((f29 - 0.5f) * 35.0f) / 0.5f);
            float f31 = z14;
            float f32 = 360 - (z14 * 2);
            canvas.drawArc(rectF4, f31, f32, true, paint4);
            canvas.drawArc(rectF4, f31, f32, true, paint5);
            paint5.setColor(-16777216);
            float f33 = 8.0f;
            canvas.drawCircle(f26 - AndroidUtilities.dp(8.0f), (dp / 4) + i25, AndroidUtilities.dp(8.0f), paint5);
            canvas.save();
            float f34 = 20.0f;
            canvas.translate(AndroidUtilities.dp(20.0f) + f28, measuredHeight - AndroidUtilities.dp(25.0f));
            int i27 = 0;
            for (int i28 = 3; i27 < i28; i28 = 3) {
                Path path = xd0Var.j;
                float f35 = f33;
                if (path != null) {
                    f10 = f34;
                    if (xd0Var.k == xd0Var.l) {
                        f11 = f30;
                        canvas.drawPath(xd0Var.j, paint4);
                        if (i27 != 0) {
                            paint5.setColor(-90112);
                        } else if (i27 == 1) {
                            paint5.setColor(-85326);
                        } else {
                            paint5.setColor(-16720161);
                        }
                        canvas.drawPath(xd0Var.j, paint5);
                        paint5.setColor(-1);
                        rectF4.set(AndroidUtilities.dp(f35), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(28.0f));
                        canvas.drawOval(rectF4, paint5);
                        rectF4.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                        canvas.drawOval(rectF4, paint5);
                        paint5.setColor(-16777216);
                        rectF4.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawOval(rectF4, paint5);
                        rectF4.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(24.0f));
                        canvas.drawOval(rectF4, paint5);
                        canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                        i27++;
                        f30 = f11;
                        f33 = f35;
                        f34 = f10;
                    }
                } else {
                    f10 = f34;
                }
                if (path == null) {
                    xd0Var.j = new Path();
                }
                xd0Var.j.reset();
                boolean z15 = xd0Var.k;
                xd0Var.l = z15;
                if (z15) {
                    xd0Var.j.moveTo(0.0f, AndroidUtilities.dp(50.0f));
                    xd0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    xd0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    xd0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(50.0f));
                    xd0Var.j.lineTo(AndroidUtilities.dp(r4), AndroidUtilities.dp(43.0f));
                    xd0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(50.0f));
                    xd0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(43.0f));
                    xd0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(50.0f));
                    xd0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(43.0f));
                    f11 = f30;
                } else {
                    f11 = f30;
                    xd0Var.j.moveTo(0.0f, AndroidUtilities.dp(43.0f));
                    xd0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    xd0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    xd0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(43.0f));
                    xd0Var.j.lineTo(AndroidUtilities.dp(f11), AndroidUtilities.dp(50.0f));
                    xd0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(43.0f));
                    xd0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(50.0f));
                    xd0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(43.0f));
                    xd0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f));
                }
                xd0Var.j.close();
                canvas.drawPath(xd0Var.j, paint4);
                if (i27 != 0) {
                }
                canvas.drawPath(xd0Var.j, paint5);
                paint5.setColor(-1);
                rectF4.set(AndroidUtilities.dp(f35), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF4, paint5);
                rectF4.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF4, paint5);
                paint5.setColor(-16777216);
                rectF4.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF4, paint5);
                rectF4.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF4, paint5);
                canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                i27++;
                f30 = f11;
                f33 = f35;
                f34 = f10;
            }
            canvas.restore();
            if (xd0Var.h >= 1.0f) {
                xd0Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - xd0Var.e;
            xd0Var.e = currentTimeMillis;
            if (j10 > 17) {
                j10 = 17;
            }
            if (xd0Var.g >= 1.0f) {
                xd0Var.g = 0.0f;
            }
            float f36 = j10;
            float f37 = (f36 / 400.0f) + xd0Var.g;
            xd0Var.g = f37;
            if (f37 > 1.0f) {
                xd0Var.g = 1.0f;
            }
            float f38 = (f36 / 2000.0f) + xd0Var.h;
            xd0Var.h = f38;
            if (f38 > 1.0f) {
                xd0Var.h = 1.0f;
            }
            float f39 = (f36 / 200.0f) + xd0Var.i;
            xd0Var.i = f39;
            if (f39 >= 1.0f) {
                xd0Var.k = !xd0Var.k;
                xd0Var.i = 0.0f;
            }
            view5.invalidate();
        }
        if (this.t3 == null) {
            i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
            ci.ha[] haVarArr = ci.ha.f;
            if (haVarArr[i10] == null) {
                haVarArr[i10] = new ci.ha(i10);
            }
            this.t3 = haVarArr[i10];
        }
        this.t3.a(this);
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.v3.N) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.q2) && ((org.telegram.ui.Cells.q2) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return ey.C4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        dy dyVar = this.h3;
        if (dyVar.n != null && ey.C4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            dyVar.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.V1) {
            return false;
        }
        ey eyVar = this.v3;
        if (eyVar.b1 || this.h3.x.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
            eyVar.c1 = !kVar.s();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.i3 = getPaddingTop();
        this.v3.y3 = 0.0f;
        this.h3.getClass();
    }

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        dy[] dyVarArr;
        AnimatorSet animatorSet;
        dy dyVar = this.h3;
        int L0 = dyVar.c.L0();
        ey eyVar = this.v3;
        if (L0 != -1 && dyVar.e.y == 0 && dyVar.c.y < 0 && dyVar.a.getScrollState() != 1) {
            s4.b1 K = dyVar.a.K(L0);
            if (K != null) {
                int top = K.a.getTop();
                if (dyVar.s == 0 && eyVar.X3() && dyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.g3 = true;
                dyVar.c.h1(L0, (int) ((top - this.i3) + eyVar.y3 + 0));
                this.g3 = false;
            }
        } else if (L0 == -1 && this.f3) {
            dyVar.c.h1((dyVar.s == 0 && eyVar.X3()) ? 1 : 0, (int) eyVar.N);
        }
        this.g3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.o2) eyVar).actionBar;
        int i12 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        if (eyVar.K && !eyVar.O) {
            i12 += AndroidUtilities.dp(81.0f);
        }
        if (!eyVar.O) {
            i12 += AndroidUtilities.dp(48.0f);
        }
        this.u3 = 0;
        float Q3 = eyVar.Q3(false);
        org.telegram.ui.Components.us usVar = eyVar.J1;
        float f7 = usVar != null ? usVar.getMetadata().c.a : 0.0f;
        int dp = i12 + ((int) (AndroidUtilities.dp(50.0f) * Q3));
        this.u3 += (int) (AndroidUtilities.dp(50.0f) * Q3);
        org.telegram.ui.Components.us usVar2 = eyVar.J1;
        if (usVar2 != null) {
            int c10 = (int) usVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), Q3));
            dp += c10;
            this.u3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(Q3, f7) * 5.0f);
        this.u3 -= AndroidUtilities.dp(Math.max(Q3, f7) * 5.0f);
        int j32 = eyVar.j3();
        if (dp2 != this.Z2 || j32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, j32);
            if (eyVar.K) {
                dyVar.w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                dyVar.w.setPaddingTop(dp2);
            }
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof hg.l) {
                    getChildAt(i13).requestLayout();
                }
            }
        }
        this.g3 = false;
        if (this.f3 && eyVar.getMessagesController().dialogsLoaded) {
            if (dyVar.s == 0 && eyVar.X3()) {
                this.g3 = true;
                ((s4.b0) getLayoutManager()).h1(1, (int) eyVar.N);
                this.g3 = false;
            }
            this.f3 = false;
        }
        super.onMeasure(i10, i11);
        if (eyVar.l2 || dp2 == 0 || (dyVarArr = eyVar.e0) == null || dyVarArr.length <= 1 || eyVar.m3 || (animatorSet = eyVar.g3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.b1 b1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c10;
        if (!this.V1) {
            ey eyVar = this.v3;
            if (!eyVar.b1 && !eyVar.y) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                dy dyVar = this.h3;
                if (action == 1 || action == 3) {
                    s4.y yVar = dyVar.e;
                    if (yVar.y != 0) {
                        cy cyVar = dyVar.f;
                        if (cyVar.e) {
                            cyVar.f = true;
                            if (yVar.g(null, 4) != 0 && (b1Var = dyVar.f.d) != null) {
                                View view = b1Var.a;
                                if (view instanceof org.telegram.ui.Cells.q2) {
                                    org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
                                    long dialogId = q2Var.getDialogId();
                                    if (DialogObject.isFolderDialogId(dialogId)) {
                                        F1(false, q2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) eyVar.getMessagesController().dialogs_dict.f(dialogId);
                                        if (dialog != null) {
                                            if (ChatObject.isCommunity(eyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                eyVar = eyVar;
                                                eyVar.p4(arrayList, 111, true, false, null);
                                            } else {
                                                eyVar = eyVar;
                                                i10 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Long.valueOf(dialogId));
                                                    eyVar.N2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                                    eyVar.p4(arrayList2, 101, true, false, null);
                                                } else {
                                                    i11 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                        i12 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i12) == 0) {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            eyVar.O2 = !eyVar.e4(dialog) ? 1 : 0;
                                                            eyVar.p4(arrayList3, 100, true, false, null);
                                                        } else {
                                                            i13 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                            if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                                ArrayList arrayList4 = new ArrayList();
                                                                arrayList4.add(Long.valueOf(dialogId));
                                                                eyVar.p4(arrayList4, 102, true, false, null);
                                                            }
                                                        }
                                                    } else if (eyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        arrayList5.add(Long.valueOf(dialogId));
                                                        i14 = ((org.telegram.ui.ActionBar.o2) eyVar).currentAccount;
                                                        eyVar.P2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L) ? 1 : 0;
                                                        eyVar.Q2 = eyVar.P2 > 0 ? 0 : 1;
                                                        eyVar.p4(arrayList5, 104, true, false, null);
                                                    } else {
                                                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                        if (org.telegram.ui.Components.xc.a(eyVar)) {
                                                            org.telegram.ui.Components.xc.z(eyVar, 3, 0, null).j();
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
                if (dyVar.s == 0 && ((action == 1 || action == 3) && dyVar.v == 2 && eyVar.X3() && ((s4.b0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.q2 O3 = ey.O3(dyVar);
                    if (O3 != null) {
                        int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f) * 0.85f);
                        int measuredHeight = O3.getMeasuredHeight() + (O3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - eyVar.d3;
                        if (measuredHeight < dp || currentTimeMillis < 200) {
                            eyVar.e2 = true;
                            c10 = 0;
                            v0(0, measuredHeight, org.telegram.ui.Components.bs.h);
                            dyVar.v = 2;
                        } else {
                            if (dyVar.v != 1) {
                                if (getViewOffset() == 0.0f) {
                                    eyVar.e2 = true;
                                    v0(0, O3.getTop() - paddingTop, org.telegram.ui.Components.bs.h);
                                }
                                if (!eyVar.f3) {
                                    eyVar.f3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    kw kwVar = dyVar.n;
                                    if (kwVar != null) {
                                        kwVar.a(true);
                                    }
                                }
                                O3.Z();
                                dyVar.v = 1;
                                if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                                }
                            }
                            c10 = 0;
                        }
                        if (getViewOffset() != 0.0f) {
                            float[] fArr = new float[2];
                            fArr[c10] = getViewOffset();
                            fArr[1] = 0.0f;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                            ofFloat.addUpdateListener(new d3(this, 10));
                            ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.sl.x(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Components.p31(this, 26));
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

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.j3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        ey.C4 = f7;
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

    @Override // org.telegram.ui.Components.mm0
    public final boolean z1() {
        return true;
    }
}
