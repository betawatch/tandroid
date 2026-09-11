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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class qy extends org.telegram.ui.Components.ia implements bi.b9 {
    public static final /* synthetic */ int v3 = 0;
    public boolean d3;
    public boolean e3;
    public boolean f3;
    public final ty g3;
    public int h3;
    public float i3;
    public final Paint j3;
    public final RectF k3;
    public org.telegram.ui.Components.ll0 l3;
    public LongSparseArray m3;
    public Paint n3;
    public float o3;
    public float p3;
    public float q3;
    public boolean r3;
    public bi.xb s3;
    public int t3;
    public final /* synthetic */ uy u3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy(uy uyVar, Context context, ty tyVar) {
        super(context, null);
        this.u3 = uyVar;
        this.e3 = true;
        this.j3 = new Paint();
        this.k3 = new RectF();
        this.p3 = 1.0f;
        this.g3 = tyVar;
        this.b3 = AndroidUtilities.dp(200.0f);
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.l4) || view.isClickable();
    }

    @Override // bi.b9
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.u3.N);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(uy.A4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02ce  */
    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f7;
        int i10;
        org.telegram.ui.Components.bd0 bd0Var;
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        float f14;
        Paint paint2;
        uy uyVar;
        float f15;
        int i11;
        int i12;
        org.telegram.ui.Cells.r2 r2Var;
        int i13;
        org.telegram.ui.Cells.r2 r2Var2;
        int i14;
        int i15;
        int i16;
        View view;
        int R;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f16 = this.i3;
        org.telegram.ui.ActionBar.f6 f6Var = this.p2;
        Paint paint3 = this.j3;
        if (f16 > 0.0f) {
            canvas2.clipRect(0, 0, AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(o41.getRightPaddingSize()), this.i3), getMeasuredHeight());
            paint3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s9, f6Var));
            paint3.setAlpha((int) (paint3.getAlpha() * this.i3));
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(o41.getRightPaddingSize()), getMeasuredHeight(), paint3);
            paint = paint3;
            int alpha = org.telegram.ui.ActionBar.j6.k0.getAlpha();
            org.telegram.ui.ActionBar.j6.k0.setAlpha((int) (this.i3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(o41.getRightPaddingSize()), 0.0f, AndroidUtilities.dp(o41.getRightPaddingSize()) - 1, getMeasuredHeight(), org.telegram.ui.ActionBar.j6.k0);
            org.telegram.ui.ActionBar.j6.k0.setAlpha(alpha);
        } else {
            paint = paint3;
        }
        if (this.l3 != null) {
            if (this.m3 == null) {
                this.m3 = new LongSparseArray();
            }
            for (int i17 = 0; i17 < this.l3.getChildCount(); i17++) {
                View childAt = this.l3.getChildAt(i17);
                if ((childAt instanceof org.telegram.ui.Cells.r2) && childAt.getBottom() > 0) {
                    this.m3.put(((org.telegram.ui.Cells.r2) childAt).getDialogId(), childAt);
                }
            }
        }
        uy uyVar2 = this.u3;
        float f17 = uyVar2.E ? 0.0f : uyVar2.N;
        int i18 = TLObject.FLAG_31;
        int i19 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i20 = 0;
        org.telegram.ui.Cells.r2 r2Var3 = null;
        float f18 = 2.14748365E9f;
        float f19 = -2.14748365E9f;
        while (i20 < getChildCount()) {
            View childAt2 = getChildAt(i20);
            if (childAt2 instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var4 = (org.telegram.ui.Cells.r2) childAt2;
                f15 = 1.0f;
                r2Var4.setRightFragmentOpenedProgress(this.i3);
                if (AndroidUtilities.isTablet()) {
                    paint2 = paint;
                    r2Var4.setDialogSelected(r2Var4.getDialogId() == uyVar2.p2.dialogId);
                } else {
                    paint2 = paint;
                }
                LongSparseArray longSparseArray = this.m3;
                if (longSparseArray == null || this.l3 == null) {
                    uyVar = uyVar2;
                } else {
                    View view2 = (View) longSparseArray.get(r2Var4.getDialogId());
                    uyVar = uyVar2;
                    this.m3.delete(r2Var4.getDialogId());
                    if (view2 != null) {
                        this.l3.getClass();
                        int S = RecyclerView.S(view2);
                        if (S > i18) {
                            i18 = S;
                        }
                        if (S < i19) {
                            i19 = S;
                        }
                        r2Var4.C0 = (view2.getTop() - r2Var4.getTop()) * this.i3;
                        if (r2Var4.getTop() + r2Var4.C0 < f18) {
                            f18 = (r2Var4.getTop() + r2Var4.C0) - f17;
                        }
                        float lerp = AndroidUtilities.lerp(r2Var4.getMeasuredHeight(), view2.getMeasuredHeight(), this.i3) + r2Var4.getTop() + r2Var4.C0;
                        if (lerp > f19) {
                            f19 = lerp - f17;
                        }
                    }
                }
                if (this.d3 && r2Var4.b0(0, true) && (R = RecyclerView.R(r2Var4)) >= 0) {
                    getAdapter().m(R);
                }
                if (r2Var4.getDialogId() == uyVar.F3.getCurrentFragmetDialogId()) {
                    r2Var3 = r2Var4;
                    r2Var = r2Var3;
                } else {
                    r2Var = r2Var4;
                }
                i11 = i18;
                i12 = i19;
            } else {
                paint2 = paint;
                uyVar = uyVar2;
                f15 = 1.0f;
                i11 = i18;
                i12 = i19;
                r2Var = null;
            }
            if (this.l3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (r2Var != null) {
                    r2Var.n = -f17;
                    view = childAt2;
                    i13 = i20;
                    r2Var2 = r2Var3;
                    i14 = i11;
                    i15 = i12;
                    i16 = save;
                } else {
                    i14 = i11;
                    i16 = save;
                    i15 = i12;
                    r2Var2 = r2Var3;
                    i13 = i20;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f15 - this.i3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (r2Var != null && r2Var != r2Var2) {
                    r2Var.C0 = 0.0f;
                    r2Var.n = 0.0f;
                }
                canvas2.restoreToCount(i16);
            } else {
                i13 = i20;
                r2Var2 = r2Var3;
                i14 = i11;
                i15 = i12;
            }
            i20 = i13 + 1;
            uyVar2 = uyVar;
            r2Var3 = r2Var2;
            i18 = i14;
            paint = paint2;
            i19 = i15;
        }
        Paint paint4 = paint;
        uy uyVar3 = uyVar2;
        if (r2Var3 != null) {
            ImageReceiver imageReceiver = r2Var3.Y1;
            canvas2.save();
            this.o3 = imageReceiver.getImageY() + r2Var3.getY() + r2Var3.C0;
            r2Var3.C0 = 0.0f;
            r2Var3.n = 0.0f;
            float f20 = this.p3;
            if (f20 != 1.0f) {
                float f21 = f20 + 0.08f;
                this.p3 = f21;
                f12 = 1.0f;
                this.p3 = Utilities.clamp(f21, 1.0f, 0.0f);
                invalidate();
            } else {
                f12 = 1.0f;
            }
            float interpolation = org.telegram.ui.Components.pr.f.getInterpolation(this.p3);
            if (interpolation != f12) {
                float f22 = this.q3;
                if (f22 != -2.14748365E9f) {
                    if (Math.abs(f22 - this.o3) < getMeasuredHeight() * 0.4f) {
                        this.o3 = AndroidUtilities.lerp(this.q3, this.o3, interpolation);
                    } else {
                        z10 = true;
                        if (this.r3 || !(z10 || this.q3 == -2.14748365E9f)) {
                            f13 = 1.0f;
                            interpolation = this.i3;
                        } else {
                            f13 = 1.0f;
                        }
                        f14 = f13 - interpolation;
                        if (f14 != f13) {
                            f7 = -2.14748365E9f;
                            this.o3 = -2.14748365E9f;
                        } else {
                            f7 = -2.14748365E9f;
                        }
                        float f23 = (-AndroidUtilities.dp(5.0f)) * f14;
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set((-AndroidUtilities.dp(4.0f)) + f23, this.o3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f23, imageReceiver.getImageHeight() + this.o3 + AndroidUtilities.dp(1.0f));
                        if (this.n3 == null) {
                            this.n3 = new Paint(1);
                        }
                        this.n3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.n3);
                        canvas2.restore();
                    }
                }
            }
            z10 = false;
            if (this.r3) {
            }
            f13 = 1.0f;
            interpolation = this.i3;
            f14 = f13 - interpolation;
            if (f14 != f13) {
            }
            float f232 = (-AndroidUtilities.dp(5.0f)) * f14;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((-AndroidUtilities.dp(4.0f)) + f232, this.o3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f232, imageReceiver.getImageHeight() + this.o3 + AndroidUtilities.dp(1.0f));
            if (this.n3 == null) {
            }
            this.n3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.n3);
            canvas2.restore();
        } else {
            f7 = -2.14748365E9f;
            this.o3 = -2.14748365E9f;
        }
        boolean z11 = false;
        if (this.m3 != null) {
            float f24 = 2.14748365E9f;
            for (int i21 = 0; i21 < this.m3.size(); i21++) {
                View view3 = (View) this.m3.valueAt(i21);
                this.l3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i19 && view3.getTop() > f7) {
                    f7 = view3.getTop();
                }
                if (S2 > i18 && view3.getBottom() < f24) {
                    f24 = view3.getBottom();
                }
            }
            for (int i22 = 0; i22 < this.m3.size(); i22++) {
                View view4 = (View) this.m3.valueAt(i22);
                if (view4 instanceof org.telegram.ui.Cells.r2) {
                    this.l3.getClass();
                    int S3 = RecyclerView.S(view4);
                    org.telegram.ui.Cells.r2 r2Var5 = (org.telegram.ui.Cells.r2) view4;
                    r2Var5.j0 = false;
                    r2Var5.t();
                    r2Var5.j0 = true;
                    r2Var5.setRightFragmentOpenedProgress(this.i3);
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
            this.m3.clear();
            z11 = false;
        }
        this.d3 = z11;
        if (this.l3 != null) {
            invalidate();
        }
        if (this.l3 == null) {
            super.dispatchDraw(canvas);
        }
        if (getItemAnimator() != null && getItemAnimator().k()) {
            paint4.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            for (int i23 = 0; i23 < getChildCount(); i23++) {
                View childAt3 = getChildAt(i23);
                if (((childAt3 instanceof org.telegram.ui.Cells.r2) && ((org.telegram.ui.Cells.r2) childAt3).r) || ((childAt3 instanceof hg.l) && ((hg.l) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x10 = childAt3.getX();
                        float y3 = childAt3.getY();
                        float x11 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y10 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.k3;
                        rectF3.set(x10, y3, x11, y10);
                        canvas2.saveLayerAlpha(rectF3, (int) (childAt3.getAlpha() * 255.0f), 31);
                    } else {
                        canvas2.save();
                    }
                    canvas2.translate(childAt3.getX(), childAt3.getY());
                    canvas2.drawRect(0.0f, 0.0f, childAt3.getMeasuredWidth(), childAt3.getMeasuredHeight(), paint4);
                    childAt3.draw(canvas2);
                    canvas2.restore();
                }
            }
            invalidate();
        }
        org.telegram.ui.Cells.r2 r2Var6 = uyVar3.W0;
        if (r2Var6 != null && (bd0Var = uyVar3.V0) != null) {
            int measuredHeight = (uyVar3.W0.getMeasuredHeight() / 2) + r2Var6.getTop();
            Paint paint5 = bd0Var.b;
            View view5 = bd0Var.c;
            RectF rectF4 = bd0Var.f;
            Paint paint6 = bd0Var.a;
            int dp = AndroidUtilities.dp(110.0f);
            int dp2 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r12) * bd0Var.h) - org.telegram.messenger.w1.D(62.0f, 3, dp);
            int i24 = dp / 2;
            int i25 = measuredHeight - i24;
            paint6.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            int i26 = dp2 / 2;
            float f25 = measuredHeight - i26;
            float f26 = i24 + measuredWidth;
            float f27 = i26 + measuredHeight + 1;
            canvas.drawRect(0.0f, f25, f26, f27, paint6);
            paint6.setColor(-69120);
            float f28 = dp + measuredWidth;
            rectF4.set(measuredWidth, i25, f28, i25 + dp);
            float f29 = bd0Var.g;
            int u10 = (int) (f29 < 0.5f ? org.telegram.messenger.vl.u(f29, 0.5f, 1.0f, 35.0f) : ((f29 - 0.5f) * 35.0f) / 0.5f);
            float f30 = u10;
            float f31 = 360 - (u10 * 2);
            canvas.drawArc(rectF4, f30, f31, true, paint5);
            canvas.drawArc(rectF4, f30, f31, true, paint6);
            paint6.setColor(-16777216);
            canvas.drawCircle(f26 - AndroidUtilities.dp(8.0f), (dp / 4) + i25, AndroidUtilities.dp(8.0f), paint6);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(20.0f) + f28, measuredHeight - AndroidUtilities.dp(25.0f));
            int i27 = 0;
            for (int i28 = 3; i27 < i28; i28 = 3) {
                Path path = bd0Var.j;
                if (path != null) {
                    f10 = 20.0f;
                    if (bd0Var.k == bd0Var.l) {
                        f11 = 35.0f;
                        canvas.drawPath(bd0Var.j, paint5);
                        if (i27 != 0) {
                            paint6.setColor(-90112);
                        } else if (i27 == 1) {
                            paint6.setColor(-85326);
                        } else {
                            paint6.setColor(-16720161);
                        }
                        canvas.drawPath(bd0Var.j, paint6);
                        paint6.setColor(-1);
                        rectF4.set(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        paint6.setColor(-16777216);
                        rectF4.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                        i27++;
                    }
                } else {
                    f10 = 20.0f;
                }
                if (path == null) {
                    bd0Var.j = new Path();
                }
                bd0Var.j.reset();
                boolean z12 = bd0Var.k;
                bd0Var.l = z12;
                if (z12) {
                    bd0Var.j.moveTo(0.0f, AndroidUtilities.dp(50.0f));
                    bd0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    bd0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    bd0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(50.0f));
                    bd0Var.j.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(43.0f));
                    bd0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(50.0f));
                    bd0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(43.0f));
                    bd0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(50.0f));
                    bd0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(43.0f));
                    f11 = 35.0f;
                } else {
                    f11 = 35.0f;
                    bd0Var.j.moveTo(0.0f, AndroidUtilities.dp(43.0f));
                    bd0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    bd0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    bd0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(43.0f));
                    bd0Var.j.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(50.0f));
                    bd0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(43.0f));
                    bd0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(50.0f));
                    bd0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(43.0f));
                    bd0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f));
                }
                bd0Var.j.close();
                canvas.drawPath(bd0Var.j, paint5);
                if (i27 != 0) {
                }
                canvas.drawPath(bd0Var.j, paint6);
                paint6.setColor(-1);
                rectF4.set(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f10), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF4, paint6);
                paint6.setColor(-16777216);
                rectF4.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF4, paint6);
                canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                i27++;
            }
            canvas.restore();
            if (bd0Var.h >= 1.0f) {
                bd0Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - bd0Var.e;
            bd0Var.e = currentTimeMillis;
            if (j3 > 17) {
                j3 = 17;
            }
            if (bd0Var.g >= 1.0f) {
                bd0Var.g = 0.0f;
            }
            float f32 = j3;
            float f33 = (f32 / 400.0f) + bd0Var.g;
            bd0Var.g = f33;
            if (f33 > 1.0f) {
                bd0Var.g = 1.0f;
            }
            float f34 = (f32 / 2000.0f) + bd0Var.h;
            bd0Var.h = f34;
            if (f34 > 1.0f) {
                bd0Var.h = 1.0f;
            }
            float f35 = (f32 / 200.0f) + bd0Var.i;
            bd0Var.i = f35;
            if (f35 >= 1.0f) {
                bd0Var.k = !bd0Var.k;
                bd0Var.i = 0.0f;
            }
            view5.invalidate();
        }
        if (this.s3 == null) {
            i10 = ((org.telegram.ui.ActionBar.n2) uyVar3).currentAccount;
            bi.xb[] xbVarArr = bi.xb.f;
            if (xbVarArr[i10] == null) {
                xbVarArr[i10] = new bi.xb(i10);
            }
            this.s3 = xbVarArr[i10];
        }
        this.s3.a(this);
    }

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.u3.N) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.r2) && ((org.telegram.ui.Cells.r2) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public float getViewOffset() {
        return uy.A4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        ty tyVar = this.g3;
        if (tyVar.n != null && uy.A4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            tyVar.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.X1) {
            return false;
        }
        uy uyVar = this.u3;
        if (uyVar.b1 || this.g3.x.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
            uyVar.c1 = !kVar.s();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.h3 = getPaddingTop();
        this.u3.x3 = 0.0f;
        this.g3.getClass();
    }

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        ty[] tyVarArr;
        AnimatorSet animatorSet;
        ty tyVar = this.g3;
        int L0 = tyVar.c.L0();
        uy uyVar = this.u3;
        if (L0 != -1 && tyVar.e.y == 0 && tyVar.c.y < 0 && tyVar.a.getScrollState() != 1) {
            s4.c1 K = tyVar.a.K(L0);
            if (K != null) {
                int top = K.a.getTop();
                if (tyVar.s == 0 && uyVar.Z3() && tyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.f3 = true;
                tyVar.c.h1(L0, (int) ((top - this.h3) + uyVar.x3 + 0));
                this.f3 = false;
            }
        } else if (L0 == -1 && this.e3) {
            tyVar.c.h1((tyVar.s == 0 && uyVar.Z3()) ? 1 : 0, (int) uyVar.N);
        }
        this.f3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.n2) uyVar).actionBar;
        int i12 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        if (uyVar.K && !uyVar.O) {
            i12 += AndroidUtilities.dp(81.0f);
        }
        if (!uyVar.O) {
            i12 += AndroidUtilities.dp(48.0f);
        }
        this.t3 = 0;
        float S3 = uyVar.S3(false);
        org.telegram.ui.Components.js jsVar = uyVar.J1;
        float f7 = jsVar != null ? jsVar.getMetadata().c.a : 0.0f;
        int dp = i12 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.t3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.js jsVar2 = uyVar.J1;
        if (jsVar2 != null) {
            int c10 = (int) jsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c10;
            this.t3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f7) * 5.0f);
        this.t3 -= AndroidUtilities.dp(Math.max(S3, f7) * 5.0f);
        int n32 = uyVar.n3();
        if (dp2 != this.Y2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (uyVar.K) {
                tyVar.w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                tyVar.w.setPaddingTop(dp2);
            }
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                if (getChildAt(i13) instanceof hg.l) {
                    getChildAt(i13).requestLayout();
                }
            }
        }
        this.f3 = false;
        if (this.e3 && uyVar.getMessagesController().dialogsLoaded) {
            if (tyVar.s == 0 && uyVar.Z3()) {
                this.f3 = true;
                ((s4.c0) getLayoutManager()).h1(1, (int) uyVar.N);
                this.f3 = false;
            }
            this.e3 = false;
        }
        super.onMeasure(i10, i11);
        if (uyVar.l2 || dp2 == 0 || (tyVarArr = uyVar.e0) == null || tyVarArr.length <= 1 || uyVar.l3 || (animatorSet = uyVar.f3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.c1 c1Var;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        char c10;
        if (this.X1) {
            return false;
        }
        uy uyVar = this.u3;
        if (uyVar.b1 || uyVar.y) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setOverScrollMode(0);
        }
        ty tyVar = this.g3;
        if (action == 1 || action == 3) {
            s4.y yVar = tyVar.e;
            if (yVar.y != 0) {
                sy syVar = tyVar.f;
                if (syVar.e) {
                    syVar.f = true;
                    if (yVar.g(null, 4) != 0 && (c1Var = tyVar.f.d) != null) {
                        View view = c1Var.a;
                        if (view instanceof org.telegram.ui.Cells.r2) {
                            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                            long dialogId = r2Var.getDialogId();
                            if (DialogObject.isFolderDialogId(dialogId)) {
                                y1(false, r2Var);
                            } else {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) uyVar.getMessagesController().dialogs_dict.f(dialogId);
                                if (dialog != null) {
                                    if (ChatObject.isCommunity(uyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(Long.valueOf(dialogId));
                                        uyVar = uyVar;
                                        uyVar.r4(arrayList, 111, true, false, null);
                                    } else {
                                        uyVar = uyVar;
                                        i10 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                        if (SharedConfig.getChatSwipeAction(i10) == 1) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Long.valueOf(dialogId));
                                            uyVar.M2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                            uyVar.r4(arrayList2, 101, true, false, null);
                                        } else {
                                            i11 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i11) != 3) {
                                                i12 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i12) == 0) {
                                                    ArrayList arrayList3 = new ArrayList();
                                                    arrayList3.add(Long.valueOf(dialogId));
                                                    uyVar.N2 = !uyVar.g4(dialog) ? 1 : 0;
                                                    uyVar.r4(arrayList3, 100, true, false, null);
                                                } else {
                                                    i13 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i13) == 4) {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        arrayList4.add(Long.valueOf(dialogId));
                                                        uyVar.r4(arrayList4, 102, true, false, null);
                                                    }
                                                }
                                            } else if (uyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                i14 = ((org.telegram.ui.ActionBar.n2) uyVar).currentAccount;
                                                uyVar.O2 = !MessagesController.getInstance(i14).isDialogMuted(dialogId, 0L) ? 1 : 0;
                                                uyVar.P2 = uyVar.O2 > 0 ? 0 : 1;
                                                uyVar.r4(arrayList5, 104, true, false, null);
                                            } else {
                                                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                if (org.telegram.ui.Components.yc.a(uyVar)) {
                                                    org.telegram.ui.Components.yc.z(uyVar, 3, 0, null).j();
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
        if (tyVar.s == 0 && ((action == 1 || action == 3) && tyVar.v == 2 && uyVar.Z3() && ((s4.c0) getLayoutManager()).L0() == 0)) {
            int paddingTop = getPaddingTop();
            org.telegram.ui.Cells.r2 Q3 = uy.Q3(tyVar);
            if (Q3 != null) {
                int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f) * 0.85f);
                int measuredHeight = Q3.getMeasuredHeight() + (Q3.getTop() - paddingTop);
                long currentTimeMillis = System.currentTimeMillis() - uyVar.c3;
                if (measuredHeight < dp || currentTimeMillis < 200) {
                    uyVar.e2 = true;
                    c10 = 0;
                    v0(0, measuredHeight, org.telegram.ui.Components.pr.h);
                    tyVar.v = 2;
                } else {
                    if (tyVar.v != 1) {
                        if (getViewOffset() == 0.0f) {
                            uyVar.e2 = true;
                            v0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.pr.h);
                        }
                        if (!uyVar.e3) {
                            uyVar.e3 = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            ax axVar = tyVar.n;
                            if (axVar != null) {
                                axVar.a(true);
                            }
                        }
                        Q3.a0();
                        tyVar.v = 1;
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
                    ofFloat.addUpdateListener(new c3(this, 10));
                    ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.vl.c(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                    ofFloat.setInterpolator(org.telegram.ui.Components.pr.h);
                    setScrollEnabled(false);
                    ofFloat.addListener(new org.telegram.ui.Components.k61(this, 22));
                    ofFloat.start();
                }
            }
        }
        return onTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        super.removeView(view);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // org.telegram.ui.Components.ia, org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.e3 = true;
    }

    public void setOpenRightFragmentProgress(float f7) {
        this.i3 = f7;
        invalidate();
    }

    public void setViewsOffset(float f7) {
        View m10;
        uy.A4 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.E1 != -1 && (m10 = getLayoutManager().m(this.E1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f7);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.G1;
            rect.set(left, top, right, bottom);
            this.D1.setBounds(rect);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean t1() {
        return true;
    }

    @Override // org.telegram.ui.Components.ia
    public final int v1() {
        return AndroidUtilities.dp(48.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if ((r3.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x1(mx mxVar, float f7, boolean z10) {
        uy uyVar;
        org.telegram.ui.Components.ll0 ll0Var = mxVar == null ? this.l3 : this;
        if (ll0Var == null) {
            this.l3 = mxVar;
            return;
        }
        boolean z11 = false;
        org.telegram.ui.Cells.r2 r2Var = null;
        org.telegram.ui.Cells.r2 r2Var2 = null;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = 0;
        while (true) {
            int childCount = ll0Var.getChildCount();
            uyVar = this.u3;
            if (i11 >= childCount) {
                break;
            }
            View childAt = ll0Var.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var3 = (org.telegram.ui.Cells.r2) childAt;
                if (r2Var3.getDialogId() == uyVar.F3.getCurrentFragmetDialogId()) {
                    r2Var = r2Var3;
                }
                if (childAt.getTop() >= 0 && r2Var3.getDialogId() != 0 && childAt.getTop() < i10) {
                    i10 = r2Var3.getTop();
                    r2Var2 = r2Var3;
                }
            }
            i11++;
        }
        if (r2Var != null) {
            if (AndroidUtilities.dp(70.0f) * getAdapter().h() > getMeasuredHeight()) {
            }
        }
        r2Var = r2Var2;
        this.l3 = mxVar;
        if (r2Var != null) {
            if (mxVar != null) {
                mxVar.setPadding(getPaddingLeft(), this.Y2, getPaddingLeft(), getPaddingBottom());
                int F = ((hg.m) mxVar.getAdapter()).F(r2Var.getDialogId());
                int top = (int) ((r2Var.getTop() - ll0Var.getPaddingTop()) + f7);
                if (F >= 0) {
                    ty tyVar = this.g3;
                    if (tyVar.s == 0 && tyVar.v == 2 && uyVar.Z3()) {
                        z11 = true;
                    }
                    int dp = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f);
                    int paddingTop = ((getPaddingTop() + top) - (F * dp)) - F;
                    if (z11) {
                        paddingTop += dp;
                    }
                    int paddingTop2 = getPaddingTop();
                    if (paddingTop > paddingTop2) {
                        top = (top + paddingTop2) - paddingTop;
                    }
                    ((s4.c0) mxVar.getLayoutManager()).h1(F, top);
                }
            }
            int F2 = ((hg.m) getAdapter()).F(r2Var.getDialogId());
            int top2 = r2Var.getTop() - getPaddingTop();
            if (z10 && uyVar.K) {
                top2 += AndroidUtilities.dp(81.0f);
            }
            if (z10) {
                top2 += AndroidUtilities.dp(48.0f);
            }
            if (F2 >= 0) {
                ((s4.c0) getLayoutManager()).h1(F2, top2);
            }
        }
    }

    public final void y1(boolean z10, org.telegram.ui.Cells.r2 r2Var) {
        SharedConfig.toggleArchiveHidden();
        uy uyVar = this.u3;
        UndoView Y3 = uyVar.Y3();
        if (!SharedConfig.archiveHidden) {
            Y3.l(0L, 7, null, null);
            z1();
            if (!z10 || r2Var == null) {
                return;
            }
            r2Var.U();
            r2Var.invalidate();
            return;
        }
        if (r2Var != null) {
            uyVar.e2 = true;
            uyVar.b1 = true;
            int top = (r2Var.getTop() - getPaddingTop()) + r2Var.getMeasuredHeight();
            if (uyVar.K && !uyVar.E0.g()) {
                uyVar.R = true;
                top += AndroidUtilities.dp(81.0f);
            }
            v0(0, top, org.telegram.ui.Components.pr.g);
            if (z10) {
                uyVar.d1 = true;
            } else {
                z1();
            }
        }
        Y3.l(0L, 6, null, null);
    }

    public final void z1() {
        int i10 = SharedConfig.archiveHidden ? 2 : 0;
        ty tyVar = this.g3;
        tyVar.v = i10;
        ax axVar = tyVar.n;
        if (axVar != null) {
            axVar.X = i10 != 0;
        }
    }
}
