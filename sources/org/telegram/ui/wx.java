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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wx extends org.telegram.ui.Components.ka implements di.o7 {
    public static final /* synthetic */ int C3 = 0;
    public int A3;
    public final /* synthetic */ cy B3;
    public boolean k3;
    public boolean l3;
    public boolean m3;
    public final ay n3;
    public int o3;
    public float p3;
    public final Paint q3;
    public final RectF r3;
    public org.telegram.ui.Components.mm0 s3;
    public LongSparseArray t3;
    public Paint u3;
    public float v3;
    public float w3;
    public float x3;
    public boolean y3;
    public di.ga z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(cy cyVar, Context context, ay ayVar) {
        super(context, null);
        this.B3 = cyVar;
        this.l3 = true;
        this.q3 = new Paint();
        this.r3 = new RectF();
        this.w3 = 1.0f;
        this.n3 = ayVar;
        this.i3 = AndroidUtilities.dp(200.0f);
    }

    @Override // org.telegram.ui.Components.ka
    public final int C1() {
        return AndroidUtilities.dp(48.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if ((r3.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E1(rw rwVar, float f7, boolean z10) {
        cy cyVar;
        org.telegram.ui.Components.mm0 mm0Var = rwVar == null ? this.s3 : this;
        if (mm0Var == null) {
            this.s3 = rwVar;
            return;
        }
        boolean z11 = false;
        org.telegram.ui.Cells.p2 p2Var = null;
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        org.telegram.ui.Cells.p2 p2Var2 = null;
        while (true) {
            int childCount = mm0Var.getChildCount();
            cyVar = this.B3;
            if (i10 >= childCount) {
                break;
            }
            View childAt = mm0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var3 = (org.telegram.ui.Cells.p2) childAt;
                if (p2Var3.getDialogId() == cyVar.G3.getCurrentFragmetDialogId()) {
                    p2Var = p2Var3;
                }
                if (childAt.getTop() >= 0 && p2Var3.getDialogId() != 0 && childAt.getTop() < i11) {
                    i11 = p2Var3.getTop();
                    p2Var2 = p2Var3;
                }
            }
            i10++;
        }
        if (p2Var != null) {
            if (AndroidUtilities.dp(70.0f) * getAdapter().h() > getMeasuredHeight()) {
            }
        }
        p2Var = p2Var2;
        this.s3 = rwVar;
        if (p2Var != null) {
            if (rwVar != null) {
                rwVar.setPadding(getPaddingLeft(), this.g3, getPaddingLeft(), getPaddingBottom());
                int G = ((ig.n) rwVar.getAdapter()).G(p2Var.getDialogId());
                int top = (int) ((p2Var.getTop() - mm0Var.getPaddingTop()) + f7);
                if (G >= 0) {
                    ay ayVar = this.n3;
                    if (ayVar.s == 0 && ayVar.v == 2 && cyVar.h4()) {
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
                    ((s4.c0) rwVar.getLayoutManager()).h1(G, top);
                }
            }
            int G2 = ((ig.n) getAdapter()).G(p2Var.getDialogId());
            int top2 = p2Var.getTop() - getPaddingTop();
            if (z10 && cyVar.K) {
                top2 += AndroidUtilities.dp(81.0f);
            }
            if (z10) {
                top2 += AndroidUtilities.dp(48.0f);
            }
            if (G2 >= 0) {
                ((s4.c0) getLayoutManager()).h1(G2, top2);
            }
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.q4) || view.isClickable();
    }

    public final void F1(boolean z10, org.telegram.ui.Cells.p2 p2Var) {
        SharedConfig.toggleArchiveHidden();
        cy cyVar = this.B3;
        UndoView g42 = cyVar.g4();
        if (!SharedConfig.archiveHidden) {
            g42.l(0L, 7, null, null);
            G1();
            if (!z10 || p2Var == null) {
                return;
            }
            p2Var.T();
            p2Var.invalidate();
            return;
        }
        if (p2Var != null) {
            cyVar.e2 = true;
            cyVar.b1 = true;
            int top = (p2Var.getTop() - getPaddingTop()) + p2Var.getMeasuredHeight();
            if (cyVar.K && !cyVar.E0.g()) {
                cyVar.R = true;
                top += AndroidUtilities.dp(81.0f);
            }
            w0(0, top, org.telegram.ui.Components.ds.g);
            if (z10) {
                cyVar.d1 = true;
            } else {
                G1();
            }
        }
        g42.l(0L, 6, null, null);
    }

    public final void G1() {
        int i10 = SharedConfig.archiveHidden ? 2 : 0;
        ay ayVar = this.n3;
        ayVar.v = i10;
        fw fwVar = ayVar.n;
        if (fwVar != null) {
            fwVar.X = i10 != 0;
        }
    }

    @Override // di.o7
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.B3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(cy.B4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02c6  */
    @Override // org.telegram.ui.Components.ka, org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f7;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i10;
        org.telegram.ui.Components.td0 td0Var;
        float f10;
        float f11;
        Paint paint2;
        float f12;
        boolean z10;
        float f13;
        float f14;
        org.telegram.ui.ActionBar.u6 u6Var2;
        float f15;
        int i11;
        int i12;
        org.telegram.ui.Cells.p2 p2Var;
        int i13;
        org.telegram.ui.Cells.p2 p2Var2;
        int i14;
        int i15;
        int i16;
        View view;
        int R;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f16 = this.p3;
        org.telegram.ui.ActionBar.u6 u6Var3 = this.n2;
        Paint paint3 = this.q3;
        boolean z11 = true;
        boolean z12 = false;
        if (f16 > 0.0f) {
            canvas2.clipRect(0, 0, AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(e31.getRightPaddingSize()), this.p3), getMeasuredHeight());
            paint3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.s9, u6Var3));
            paint3.setAlpha((int) (paint3.getAlpha() * this.p3));
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(e31.getRightPaddingSize()), getMeasuredHeight(), paint3);
            paint = paint3;
            int alpha = org.telegram.ui.ActionBar.y6.k0.getAlpha();
            org.telegram.ui.ActionBar.y6.k0.setAlpha((int) (this.p3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(e31.getRightPaddingSize()), 0.0f, AndroidUtilities.dp(e31.getRightPaddingSize()) - 1, getMeasuredHeight(), org.telegram.ui.ActionBar.y6.k0);
            org.telegram.ui.ActionBar.y6.k0.setAlpha(alpha);
        } else {
            paint = paint3;
        }
        if (this.s3 != null) {
            if (this.t3 == null) {
                this.t3 = new LongSparseArray();
            }
            for (int i17 = 0; i17 < this.s3.getChildCount(); i17++) {
                View childAt = this.s3.getChildAt(i17);
                if ((childAt instanceof org.telegram.ui.Cells.p2) && childAt.getBottom() > 0) {
                    this.t3.put(((org.telegram.ui.Cells.p2) childAt).getDialogId(), childAt);
                }
            }
        }
        cy cyVar = this.B3;
        float f17 = cyVar.E ? 0.0f : cyVar.N;
        int i18 = TLObject.FLAG_31;
        int i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i20 = 0;
        org.telegram.ui.Cells.p2 p2Var3 = null;
        float f18 = 2.14748365E9f;
        float f19 = -2.14748365E9f;
        while (i20 < getChildCount()) {
            View childAt2 = getChildAt(i20);
            if (childAt2 instanceof org.telegram.ui.Cells.p2) {
                org.telegram.ui.Cells.p2 p2Var4 = (org.telegram.ui.Cells.p2) childAt2;
                f15 = 1.0f;
                p2Var4.setRightFragmentOpenedProgress(this.p3);
                if (AndroidUtilities.isTablet()) {
                    u6Var2 = u6Var3;
                    p2Var4.setDialogSelected(p2Var4.getDialogId() == cyVar.p2.dialogId ? z11 : z12);
                } else {
                    u6Var2 = u6Var3;
                }
                LongSparseArray longSparseArray = this.t3;
                if (longSparseArray != null && this.s3 != null) {
                    View view2 = (View) longSparseArray.get(p2Var4.getDialogId());
                    this.t3.delete(p2Var4.getDialogId());
                    if (view2 != null) {
                        this.s3.getClass();
                        int S = RecyclerView.S(view2);
                        if (S > i18) {
                            i18 = S;
                        }
                        if (S < i19) {
                            i19 = S;
                        }
                        p2Var4.C0 = (view2.getTop() - p2Var4.getTop()) * this.p3;
                        if (p2Var4.getTop() + p2Var4.C0 < f18) {
                            f18 = (p2Var4.getTop() + p2Var4.C0) - f17;
                        }
                        float lerp = AndroidUtilities.lerp(p2Var4.getMeasuredHeight(), view2.getMeasuredHeight(), this.p3) + p2Var4.getTop() + p2Var4.C0;
                        if (lerp > f19) {
                            f19 = lerp - f17;
                        }
                    }
                }
                if (this.k3 && p2Var4.a0(0, true) && (R = RecyclerView.R(p2Var4)) >= 0) {
                    getAdapter().m(R);
                }
                if (p2Var4.getDialogId() == cyVar.G3.getCurrentFragmetDialogId()) {
                    p2Var3 = p2Var4;
                    p2Var = p2Var3;
                } else {
                    p2Var = p2Var4;
                }
                i11 = i18;
                i12 = i19;
            } else {
                u6Var2 = u6Var3;
                f15 = 1.0f;
                i11 = i18;
                i12 = i19;
                p2Var = null;
            }
            if (this.s3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (p2Var != null) {
                    p2Var.n = -f17;
                    view = childAt2;
                    i13 = i20;
                    p2Var2 = p2Var3;
                    i14 = i11;
                    i15 = i12;
                    i16 = save;
                } else {
                    i14 = i11;
                    i16 = save;
                    i15 = i12;
                    p2Var2 = p2Var3;
                    i13 = i20;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f15 - this.p3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (p2Var != null && p2Var != p2Var2) {
                    p2Var.C0 = 0.0f;
                    p2Var.n = 0.0f;
                }
                canvas2.restoreToCount(i16);
            } else {
                i13 = i20;
                p2Var2 = p2Var3;
                i14 = i11;
                i15 = i12;
            }
            i20 = i13 + 1;
            p2Var3 = p2Var2;
            i18 = i14;
            u6Var3 = u6Var2;
            i19 = i15;
            z11 = true;
            z12 = false;
        }
        org.telegram.ui.ActionBar.u6 u6Var4 = u6Var3;
        if (p2Var3 != null) {
            ImageReceiver imageReceiver = p2Var3.Y1;
            canvas2.save();
            this.v3 = imageReceiver.getImageY() + p2Var3.getY() + p2Var3.C0;
            p2Var3.C0 = 0.0f;
            p2Var3.n = 0.0f;
            float f20 = this.w3;
            if (f20 != 1.0f) {
                float f21 = f20 + 0.08f;
                this.w3 = f21;
                f12 = 1.0f;
                this.w3 = Utilities.clamp(f21, 1.0f, 0.0f);
                invalidate();
            } else {
                f12 = 1.0f;
            }
            float interpolation = org.telegram.ui.Components.ds.f.getInterpolation(this.w3);
            if (interpolation != f12) {
                float f22 = this.x3;
                if (f22 != -2.14748365E9f) {
                    if (Math.abs(f22 - this.v3) < getMeasuredHeight() * 0.4f) {
                        this.v3 = AndroidUtilities.lerp(this.x3, this.v3, interpolation);
                    } else {
                        z10 = true;
                        if (this.y3 || !(z10 || this.x3 == -2.14748365E9f)) {
                            f13 = 1.0f;
                            interpolation = this.p3;
                        } else {
                            f13 = 1.0f;
                        }
                        f14 = f13 - interpolation;
                        if (f14 != f13) {
                            f7 = -2.14748365E9f;
                            this.v3 = -2.14748365E9f;
                        } else {
                            f7 = -2.14748365E9f;
                        }
                        float f23 = (-AndroidUtilities.dp(5.0f)) * f14;
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set((-AndroidUtilities.dp(4.0f)) + f23, this.v3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f23, imageReceiver.getImageHeight() + this.v3 + AndroidUtilities.dp(1.0f));
                        if (this.u3 == null) {
                            this.u3 = new Paint(1);
                        }
                        u6Var = u6Var4;
                        this.u3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var));
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.u3);
                        canvas2.restore();
                    }
                }
            }
            z10 = false;
            if (this.y3) {
            }
            f13 = 1.0f;
            interpolation = this.p3;
            f14 = f13 - interpolation;
            if (f14 != f13) {
            }
            float f232 = (-AndroidUtilities.dp(5.0f)) * f14;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((-AndroidUtilities.dp(4.0f)) + f232, this.v3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f232, imageReceiver.getImageHeight() + this.v3 + AndroidUtilities.dp(1.0f));
            if (this.u3 == null) {
            }
            u6Var = u6Var4;
            this.u3.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, u6Var));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.u3);
            canvas2.restore();
        } else {
            f7 = -2.14748365E9f;
            u6Var = u6Var4;
            this.v3 = -2.14748365E9f;
        }
        boolean z13 = false;
        if (this.t3 != null) {
            float f24 = 2.14748365E9f;
            for (int i21 = 0; i21 < this.t3.size(); i21++) {
                View view3 = (View) this.t3.valueAt(i21);
                this.s3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i19 && view3.getTop() > f7) {
                    f7 = view3.getTop();
                }
                if (S2 > i18 && view3.getBottom() < f24) {
                    f24 = view3.getBottom();
                }
            }
            for (int i22 = 0; i22 < this.t3.size(); i22++) {
                View view4 = (View) this.t3.valueAt(i22);
                if (view4 instanceof org.telegram.ui.Cells.p2) {
                    this.s3.getClass();
                    int S3 = RecyclerView.S(view4);
                    org.telegram.ui.Cells.p2 p2Var5 = (org.telegram.ui.Cells.p2) view4;
                    p2Var5.j0 = false;
                    p2Var5.s();
                    p2Var5.j0 = true;
                    p2Var5.setRightFragmentOpenedProgress(this.p3);
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
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d6, u6Var));
            int i23 = 0;
            while (i23 < getChildCount()) {
                View childAt3 = getChildAt(i23);
                if (((childAt3 instanceof org.telegram.ui.Cells.p2) && ((org.telegram.ui.Cells.p2) childAt3).r) || ((childAt3 instanceof ig.m) && ((ig.m) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x9 = childAt3.getX();
                        float y3 = childAt3.getY();
                        float x10 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y10 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.r3;
                        rectF3.set(x9, y3, x10, y10);
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
        org.telegram.ui.Cells.p2 p2Var6 = cyVar.W0;
        if (p2Var6 != null && (td0Var = cyVar.V0) != null) {
            int measuredHeight = (cyVar.W0.getMeasuredHeight() / 2) + p2Var6.getTop();
            Paint paint4 = td0Var.b;
            View view5 = td0Var.c;
            RectF rectF4 = td0Var.f;
            Paint paint5 = td0Var.a;
            int dp = AndroidUtilities.dp(110.0f);
            int dp2 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r9) * td0Var.h) - org.telegram.messenger.vh.b(62.0f, 3, dp);
            int i24 = dp / 2;
            int i25 = measuredHeight - i24;
            paint5.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false));
            int i26 = dp2 / 2;
            float f25 = measuredHeight - i26;
            float f26 = i24 + measuredWidth;
            float f27 = i26 + measuredHeight + 1;
            canvas.drawRect(0.0f, f25, f26, f27, paint5);
            paint5.setColor(-69120);
            float f28 = dp + measuredWidth;
            rectF4.set(measuredWidth, i25, f28, i25 + dp);
            float f29 = td0Var.g;
            float f30 = 35.0f;
            int y11 = (int) (f29 < 0.5f ? org.telegram.messenger.vh.y(f29, 0.5f, 1.0f, 35.0f) : ((f29 - 0.5f) * 35.0f) / 0.5f);
            float f31 = y11;
            float f32 = 360 - (y11 * 2);
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
                Path path = td0Var.j;
                float f35 = f33;
                if (path != null) {
                    f10 = f34;
                    if (td0Var.k == td0Var.l) {
                        f11 = f30;
                        canvas.drawPath(td0Var.j, paint4);
                        if (i27 != 0) {
                            paint5.setColor(-90112);
                        } else if (i27 == 1) {
                            paint5.setColor(-85326);
                        } else {
                            paint5.setColor(-16720161);
                        }
                        canvas.drawPath(td0Var.j, paint5);
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
                    td0Var.j = new Path();
                }
                td0Var.j.reset();
                boolean z14 = td0Var.k;
                td0Var.l = z14;
                if (z14) {
                    td0Var.j.moveTo(0.0f, AndroidUtilities.dp(50.0f));
                    td0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    td0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    td0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(50.0f));
                    td0Var.j.lineTo(AndroidUtilities.dp(r4), AndroidUtilities.dp(43.0f));
                    td0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(50.0f));
                    td0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(43.0f));
                    td0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(50.0f));
                    td0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(43.0f));
                    f11 = f30;
                } else {
                    f11 = f30;
                    td0Var.j.moveTo(0.0f, AndroidUtilities.dp(43.0f));
                    td0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    td0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    td0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(43.0f));
                    td0Var.j.lineTo(AndroidUtilities.dp(f11), AndroidUtilities.dp(50.0f));
                    td0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(43.0f));
                    td0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(50.0f));
                    td0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(43.0f));
                    td0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f));
                }
                td0Var.j.close();
                canvas.drawPath(td0Var.j, paint4);
                if (i27 != 0) {
                }
                canvas.drawPath(td0Var.j, paint5);
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
            if (td0Var.h >= 1.0f) {
                td0Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - td0Var.e;
            td0Var.e = currentTimeMillis;
            if (j10 > 17) {
                j10 = 17;
            }
            if (td0Var.g >= 1.0f) {
                td0Var.g = 0.0f;
            }
            float f36 = j10;
            float f37 = (f36 / 400.0f) + td0Var.g;
            td0Var.g = f37;
            if (f37 > 1.0f) {
                td0Var.g = 1.0f;
            }
            float f38 = (f36 / 2000.0f) + td0Var.h;
            td0Var.h = f38;
            if (f38 > 1.0f) {
                td0Var.h = 1.0f;
            }
            float f39 = (f36 / 200.0f) + td0Var.i;
            td0Var.i = f39;
            if (f39 >= 1.0f) {
                td0Var.k = !td0Var.k;
                td0Var.i = 0.0f;
            }
            view5.invalidate();
        }
        if (this.z3 == null) {
            i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
            di.ga[] gaVarArr = di.ga.f;
            if (gaVarArr[i10] == null) {
                gaVarArr[i10] = new di.ga(i10);
            }
            this.z3 = gaVarArr[i10];
        }
        this.z3.a(this);
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.B3.N) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ka, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.p2) && ((org.telegram.ui.Cells.p2) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return cy.B4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        ay ayVar = this.n3;
        if (ayVar.n != null && cy.B4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            ayVar.n.c(canvas, true);
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
        cy cyVar = this.B3;
        if (cyVar.b1 || this.n3.x.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
            cyVar.c1 = !kVar.q();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.o3 = getPaddingTop();
        this.B3.y3 = 0.0f;
        this.n3.getClass();
    }

    @Override // org.telegram.ui.Components.ka, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        ay[] ayVarArr;
        AnimatorSet animatorSet;
        ay ayVar = this.n3;
        int L0 = ayVar.c.L0();
        cy cyVar = this.B3;
        if (L0 != -1 && ayVar.e.y == 0 && ayVar.c.y < 0 && ayVar.a.getScrollState() != 1) {
            s4.e1 K = ayVar.a.K(L0);
            if (K != null) {
                int top = K.a.getTop();
                if (ayVar.s == 0 && cyVar.h4() && ayVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.m3 = true;
                ayVar.c.h1(L0, (int) ((top - this.o3) + cyVar.y3 + 0));
                this.m3 = false;
            }
        } else if (L0 == -1 && this.l3) {
            ayVar.c.h1((ayVar.s == 0 && cyVar.h4()) ? 1 : 0, (int) cyVar.N);
        }
        this.m3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.r2) cyVar).actionBar;
        int i12 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        if (cyVar.K && !cyVar.O) {
            i12 += AndroidUtilities.dp(81.0f);
        }
        if (!cyVar.O) {
            i12 += AndroidUtilities.dp(48.0f);
        }
        this.A3 = 0;
        float a42 = cyVar.a4(false);
        org.telegram.ui.Components.ws wsVar = cyVar.J1;
        float f7 = wsVar != null ? wsVar.getMetadata().c.a : 0.0f;
        int dp = i12 + ((int) (AndroidUtilities.dp(50.0f) * a42));
        this.A3 += (int) (AndroidUtilities.dp(50.0f) * a42);
        org.telegram.ui.Components.ws wsVar2 = cyVar.J1;
        if (wsVar2 != null) {
            int c10 = (int) wsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), a42));
            dp += c10;
            this.A3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(a42, f7) * 5.0f);
        this.A3 -= AndroidUtilities.dp(Math.max(a42, f7) * 5.0f);
        int t32 = cyVar.t3();
        if (dp2 != this.g3 || t32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, t32);
            if (cyVar.K) {
                ayVar.w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                ayVar.w.setPaddingTop(dp2);
            }
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof ig.m) {
                    getChildAt(i13).requestLayout();
                }
            }
        }
        this.m3 = false;
        if (this.l3 && cyVar.getMessagesController().dialogsLoaded) {
            if (ayVar.s == 0 && cyVar.h4()) {
                this.m3 = true;
                ((s4.c0) getLayoutManager()).h1(1, (int) cyVar.N);
                this.m3 = false;
            }
            this.l3 = false;
        }
        super.onMeasure(i10, i11);
        if (cyVar.l2 || dp2 == 0 || (ayVarArr = cyVar.e0) == null || ayVarArr.length <= 1 || cyVar.m3 || (animatorSet = cyVar.g3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.e1 e1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c10;
        if (!this.V1) {
            cy cyVar = this.B3;
            if (!cyVar.b1 && !cyVar.y) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                ay ayVar = this.n3;
                if (action == 1 || action == 3) {
                    s4.z zVar = ayVar.e;
                    if (zVar.y != 0) {
                        zx zxVar = ayVar.f;
                        if (zxVar.e) {
                            zxVar.f = true;
                            if (zVar.i(null, 4) != 0 && (e1Var = ayVar.f.d) != null) {
                                View view = e1Var.a;
                                if (view instanceof org.telegram.ui.Cells.p2) {
                                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
                                    long dialogId = p2Var.getDialogId();
                                    if (DialogObject.isFolderDialogId(dialogId)) {
                                        F1(false, p2Var);
                                    } else {
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) cyVar.getMessagesController().dialogs_dict.f(dialogId);
                                        if (dialog != null) {
                                            if (ChatObject.isCommunity(cyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(dialogId));
                                                cyVar = cyVar;
                                                cyVar.z4(arrayList, 111, true, false, null);
                                            } else {
                                                cyVar = cyVar;
                                                i10 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i10) == 1) {
                                                    ArrayList arrayList2 = new ArrayList();
                                                    arrayList2.add(Long.valueOf(dialogId));
                                                    cyVar.N2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                                    cyVar.z4(arrayList2, 101, true, false, null);
                                                } else {
                                                    i11 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                        i12 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                        if (SharedConfig.getChatSwipeAction(i12) == 0) {
                                                            ArrayList arrayList3 = new ArrayList();
                                                            arrayList3.add(Long.valueOf(dialogId));
                                                            cyVar.O2 = !cyVar.o4(dialog) ? 1 : 0;
                                                            cyVar.z4(arrayList3, 100, true, false, null);
                                                        } else {
                                                            i13 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                            if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                                ArrayList arrayList4 = new ArrayList();
                                                                arrayList4.add(Long.valueOf(dialogId));
                                                                cyVar.z4(arrayList4, 102, true, false, null);
                                                            }
                                                        }
                                                    } else if (cyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        arrayList5.add(Long.valueOf(dialogId));
                                                        i14 = ((org.telegram.ui.ActionBar.r2) cyVar).currentAccount;
                                                        cyVar.P2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L) ? 1 : 0;
                                                        cyVar.Q2 = cyVar.P2 > 0 ? 0 : 1;
                                                        cyVar.z4(arrayList5, 104, true, false, null);
                                                    } else {
                                                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                        if (org.telegram.ui.Components.wc.a(cyVar)) {
                                                            org.telegram.ui.Components.wc.z(cyVar, 3, 0, null).j();
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
                if (ayVar.s == 0 && ((action == 1 || action == 3) && ayVar.v == 2 && cyVar.h4() && ((s4.c0) getLayoutManager()).L0() == 0)) {
                    int paddingTop = getPaddingTop();
                    org.telegram.ui.Cells.p2 Y3 = cy.Y3(ayVar);
                    if (Y3 != null) {
                        int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f) * 0.85f);
                        int measuredHeight = Y3.getMeasuredHeight() + (Y3.getTop() - paddingTop);
                        long currentTimeMillis = System.currentTimeMillis() - cyVar.d3;
                        if (measuredHeight < dp || currentTimeMillis < 200) {
                            cyVar.e2 = true;
                            c10 = 0;
                            w0(0, measuredHeight, org.telegram.ui.Components.ds.h);
                            ayVar.v = 2;
                        } else {
                            if (ayVar.v != 1) {
                                if (getViewOffset() == 0.0f) {
                                    cyVar.e2 = true;
                                    w0(0, Y3.getTop() - paddingTop, org.telegram.ui.Components.ds.h);
                                }
                                if (!cyVar.f3) {
                                    cyVar.f3 = true;
                                    try {
                                        performHapticFeedback(3, 2);
                                    } catch (Exception unused) {
                                    }
                                    fw fwVar = ayVar.n;
                                    if (fwVar != null) {
                                        fwVar.a(true);
                                    }
                                }
                                Y3.Z();
                                ayVar.v = 1;
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
                            ofFloat.addUpdateListener(new b3(this, 9));
                            ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.vh.w(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                            ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
                            setScrollEnabled(false);
                            ofFloat.addListener(new org.telegram.ui.Components.h31(this, 27));
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

    @Override // org.telegram.ui.Components.ka, org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.m3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.l3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.p3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        cy.B4 = f7;
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
