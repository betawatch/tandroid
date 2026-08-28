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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yx extends org.telegram.ui.Components.aa implements ih.c7 {
    public static final /* synthetic */ int r3 = 0;
    public boolean Z2;
    public boolean a3;
    public boolean b3;
    public final cy c3;
    public int d3;
    public float e3;
    public final Paint f3;
    public final RectF g3;
    public org.telegram.ui.Components.wk0 h3;
    public LongSparseArray i3;
    public Paint j3;
    public float k3;
    public float l3;
    public float m3;
    public boolean n3;
    public ih.u9 o3;
    public int p3;
    public final /* synthetic */ dy q3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(dy dyVar, Context context, cy cyVar) {
        super(context, null);
        this.q3 = dyVar;
        this.a3 = true;
        this.f3 = new Paint();
        this.g3 = new RectF();
        this.l3 = 1.0f;
        this.c3 = cyVar;
        this.X2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1() {
        int i9 = SharedConfig.archiveHidden ? 2 : 0;
        cy cyVar = this.c3;
        cyVar.v = i9;
        kw kwVar = cyVar.n;
        if (kwVar != null) {
            kwVar.X = i9 != 0;
        }
    }

    @Override // org.telegram.ui.Components.wk0
    public final boolean F0(View view) {
        return !(view instanceof org.telegram.ui.Cells.m4) || view.isClickable();
    }

    @Override // ih.c7
    public final void a(int[] iArr) {
        int paddingTop = (int) (getPaddingTop() + this.q3.J);
        iArr[0] = paddingTop;
        iArr[1] = getMeasuredHeight() + paddingTop;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
        view.setTranslationY(dy.w4);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02ce  */
    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f10;
        int i9;
        org.telegram.ui.Components.hc0 hc0Var;
        float f11;
        float f12;
        float f13;
        boolean z10;
        float f14;
        float f15;
        Paint paint2;
        dy dyVar;
        float f16;
        int i10;
        int i11;
        org.telegram.ui.Cells.r2 r2Var;
        int i12;
        org.telegram.ui.Cells.r2 r2Var2;
        int i13;
        int i14;
        int i15;
        View view;
        int R;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f17 = this.e3;
        org.telegram.ui.ActionBar.b6 b6Var = this.l2;
        Paint paint3 = this.f3;
        if (f17 > 0.0f) {
            canvas2.clipRect(0, 0, AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(h31.getRightPaddingSize()), this.e3), getMeasuredHeight());
            paint3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s9, b6Var));
            paint3.setAlpha((int) (paint3.getAlpha() * this.e3));
            canvas2.drawRect(0.0f, 0.0f, AndroidUtilities.dp(h31.getRightPaddingSize()), getMeasuredHeight(), paint3);
            paint = paint3;
            int alpha = org.telegram.ui.ActionBar.f6.k0.getAlpha();
            org.telegram.ui.ActionBar.f6.k0.setAlpha((int) (this.e3 * alpha));
            canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(h31.getRightPaddingSize()), 0.0f, AndroidUtilities.dp(h31.getRightPaddingSize()) - 1, getMeasuredHeight(), org.telegram.ui.ActionBar.f6.k0);
            org.telegram.ui.ActionBar.f6.k0.setAlpha(alpha);
        } else {
            paint = paint3;
        }
        if (this.h3 != null) {
            if (this.i3 == null) {
                this.i3 = new LongSparseArray();
            }
            for (int i16 = 0; i16 < this.h3.getChildCount(); i16++) {
                View childAt = this.h3.getChildAt(i16);
                if ((childAt instanceof org.telegram.ui.Cells.r2) && childAt.getBottom() > 0) {
                    this.i3.put(((org.telegram.ui.Cells.r2) childAt).getDialogId(), childAt);
                }
            }
        }
        dy dyVar2 = this.q3;
        float f18 = dyVar2.A ? 0.0f : dyVar2.J;
        int i17 = TLObject.FLAG_31;
        int i18 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i19 = 0;
        org.telegram.ui.Cells.r2 r2Var3 = null;
        float f19 = 2.14748365E9f;
        float f20 = -2.14748365E9f;
        while (i19 < getChildCount()) {
            View childAt2 = getChildAt(i19);
            if (childAt2 instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var4 = (org.telegram.ui.Cells.r2) childAt2;
                f16 = 1.0f;
                r2Var4.setRightFragmentOpenedProgress(this.e3);
                if (AndroidUtilities.isTablet()) {
                    paint2 = paint;
                    r2Var4.setDialogSelected(r2Var4.getDialogId() == dyVar2.l2.dialogId);
                } else {
                    paint2 = paint;
                }
                LongSparseArray longSparseArray = this.i3;
                if (longSparseArray == null || this.h3 == null) {
                    dyVar = dyVar2;
                } else {
                    View view2 = (View) longSparseArray.get(r2Var4.getDialogId());
                    dyVar = dyVar2;
                    this.i3.delete(r2Var4.getDialogId());
                    if (view2 != null) {
                        this.h3.getClass();
                        int S = RecyclerView.S(view2);
                        if (S > i17) {
                            i17 = S;
                        }
                        if (S < i18) {
                            i18 = S;
                        }
                        r2Var4.y0 = (view2.getTop() - r2Var4.getTop()) * this.e3;
                        if (r2Var4.getTop() + r2Var4.y0 < f19) {
                            f19 = (r2Var4.getTop() + r2Var4.y0) - f18;
                        }
                        float lerp = AndroidUtilities.lerp(r2Var4.getMeasuredHeight(), view2.getMeasuredHeight(), this.e3) + r2Var4.getTop() + r2Var4.y0;
                        if (lerp > f20) {
                            f20 = lerp - f18;
                        }
                    }
                }
                if (this.Z2 && r2Var4.a0(0, true) && (R = RecyclerView.R(r2Var4)) >= 0) {
                    getAdapter().m(R);
                }
                if (r2Var4.getDialogId() == dyVar.B3.getCurrentFragmetDialogId()) {
                    r2Var3 = r2Var4;
                    r2Var = r2Var3;
                } else {
                    r2Var = r2Var4;
                }
                i10 = i17;
                i11 = i18;
            } else {
                paint2 = paint;
                dyVar = dyVar2;
                f16 = 1.0f;
                i10 = i17;
                i11 = i18;
                r2Var = null;
            }
            if (this.h3 != null) {
                int save = canvas2.save();
                canvas2.translate(childAt2.getX(), childAt2.getY());
                if (r2Var != null) {
                    r2Var.n = -f18;
                    view = childAt2;
                    i12 = i19;
                    r2Var2 = r2Var3;
                    i13 = i10;
                    i14 = i11;
                    i15 = save;
                } else {
                    i13 = i10;
                    i15 = save;
                    i14 = i11;
                    r2Var2 = r2Var3;
                    i12 = i19;
                    view = childAt2;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight(), (int) ((f16 - this.e3) * 255.0f), 31);
                }
                view.draw(canvas2);
                if (r2Var != null && r2Var != r2Var2) {
                    r2Var.y0 = 0.0f;
                    r2Var.n = 0.0f;
                }
                canvas2.restoreToCount(i15);
            } else {
                i12 = i19;
                r2Var2 = r2Var3;
                i13 = i10;
                i14 = i11;
            }
            i19 = i12 + 1;
            dyVar2 = dyVar;
            r2Var3 = r2Var2;
            i17 = i13;
            paint = paint2;
            i18 = i14;
        }
        Paint paint4 = paint;
        dy dyVar3 = dyVar2;
        if (r2Var3 != null) {
            ImageReceiver imageReceiver = r2Var3.U1;
            canvas2.save();
            this.k3 = imageReceiver.getImageY() + r2Var3.getY() + r2Var3.y0;
            r2Var3.y0 = 0.0f;
            r2Var3.n = 0.0f;
            float f21 = this.l3;
            if (f21 != 1.0f) {
                float f22 = f21 + 0.08f;
                this.l3 = f22;
                f13 = 1.0f;
                this.l3 = Utilities.clamp(f22, 1.0f, 0.0f);
                invalidate();
            } else {
                f13 = 1.0f;
            }
            float interpolation = org.telegram.ui.Components.gr.f.getInterpolation(this.l3);
            if (interpolation != f13) {
                float f23 = this.m3;
                if (f23 != -2.14748365E9f) {
                    if (Math.abs(f23 - this.k3) < getMeasuredHeight() * 0.4f) {
                        this.k3 = AndroidUtilities.lerp(this.m3, this.k3, interpolation);
                    } else {
                        z10 = true;
                        if (this.n3 || !(z10 || this.m3 == -2.14748365E9f)) {
                            f14 = 1.0f;
                            interpolation = this.e3;
                        } else {
                            f14 = 1.0f;
                        }
                        f15 = f14 - interpolation;
                        if (f15 != f14) {
                            f10 = -2.14748365E9f;
                            this.k3 = -2.14748365E9f;
                        } else {
                            f10 = -2.14748365E9f;
                        }
                        float f24 = (-AndroidUtilities.dp(5.0f)) * f15;
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set((-AndroidUtilities.dp(4.0f)) + f24, this.k3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f24, imageReceiver.getImageHeight() + this.k3 + AndroidUtilities.dp(1.0f));
                        if (this.j3 == null) {
                            this.j3 = new Paint(1);
                        }
                        this.j3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var));
                        canvas2.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.j3);
                        canvas2.restore();
                    }
                }
            }
            z10 = false;
            if (this.n3) {
            }
            f14 = 1.0f;
            interpolation = this.e3;
            f15 = f14 - interpolation;
            if (f15 != f14) {
            }
            float f242 = (-AndroidUtilities.dp(5.0f)) * f15;
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((-AndroidUtilities.dp(4.0f)) + f242, this.k3 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f) + f242, imageReceiver.getImageHeight() + this.k3 + AndroidUtilities.dp(1.0f));
            if (this.j3 == null) {
            }
            this.j3.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), this.j3);
            canvas2.restore();
        } else {
            f10 = -2.14748365E9f;
            this.k3 = -2.14748365E9f;
        }
        boolean z11 = false;
        if (this.i3 != null) {
            float f25 = 2.14748365E9f;
            for (int i20 = 0; i20 < this.i3.size(); i20++) {
                View view3 = (View) this.i3.valueAt(i20);
                this.h3.getClass();
                int S2 = RecyclerView.S(view3);
                if (S2 < i18 && view3.getTop() > f10) {
                    f10 = view3.getTop();
                }
                if (S2 > i17 && view3.getBottom() < f25) {
                    f25 = view3.getBottom();
                }
            }
            for (int i21 = 0; i21 < this.i3.size(); i21++) {
                View view4 = (View) this.i3.valueAt(i21);
                if (view4 instanceof org.telegram.ui.Cells.r2) {
                    this.h3.getClass();
                    int S3 = RecyclerView.S(view4);
                    org.telegram.ui.Cells.r2 r2Var5 = (org.telegram.ui.Cells.r2) view4;
                    r2Var5.f0 = false;
                    r2Var5.t();
                    r2Var5.f0 = true;
                    r2Var5.setRightFragmentOpenedProgress(this.e3);
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
            this.i3.clear();
            z11 = false;
        }
        this.Z2 = z11;
        if (this.h3 != null) {
            invalidate();
        }
        if (this.h3 == null) {
            super.dispatchDraw(canvas);
        }
        if (getItemAnimator() != null && getItemAnimator().k()) {
            paint4.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d6, b6Var));
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt3 = getChildAt(i22);
                if (((childAt3 instanceof org.telegram.ui.Cells.r2) && ((org.telegram.ui.Cells.r2) childAt3).r) || ((childAt3 instanceof of.l) && ((of.l) childAt3).a)) {
                    if (childAt3.getAlpha() != 1.0f) {
                        float x10 = childAt3.getX();
                        float y10 = childAt3.getY();
                        float x11 = childAt3.getX() + childAt3.getMeasuredWidth();
                        float y11 = childAt3.getY() + childAt3.getMeasuredHeight();
                        RectF rectF3 = this.g3;
                        rectF3.set(x10, y10, x11, y11);
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
        org.telegram.ui.Cells.r2 r2Var6 = dyVar3.S0;
        if (r2Var6 != null && (hc0Var = dyVar3.R0) != null) {
            int measuredHeight = (dyVar3.S0.getMeasuredHeight() / 2) + r2Var6.getTop();
            Paint paint5 = hc0Var.b;
            View view5 = hc0Var.c;
            RectF rectF4 = hc0Var.f;
            Paint paint6 = hc0Var.a;
            int dp = AndroidUtilities.dp(110.0f);
            int dp2 = AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
            float measuredWidth = ((view5.getMeasuredWidth() + r12) * hc0Var.h) - org.telegram.messenger.l0.D(62.0f, 3, dp);
            int i23 = dp / 2;
            int i24 = measuredHeight - i23;
            paint6.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            int i25 = dp2 / 2;
            float f26 = measuredHeight - i25;
            float f27 = i23 + measuredWidth;
            float f28 = i25 + measuredHeight + 1;
            canvas.drawRect(0.0f, f26, f27, f28, paint6);
            paint6.setColor(-69120);
            float f29 = dp + measuredWidth;
            rectF4.set(measuredWidth, i24, f29, i24 + dp);
            float f30 = hc0Var.g;
            int v = (int) (f30 < 0.5f ? org.telegram.messenger.ll.v(f30, 0.5f, 1.0f, 35.0f) : ((f30 - 0.5f) * 35.0f) / 0.5f);
            float f31 = v;
            float f32 = 360 - (v * 2);
            canvas.drawArc(rectF4, f31, f32, true, paint5);
            canvas.drawArc(rectF4, f31, f32, true, paint6);
            paint6.setColor(-16777216);
            canvas.drawCircle(f27 - AndroidUtilities.dp(8.0f), (dp / 4) + i24, AndroidUtilities.dp(8.0f), paint6);
            canvas.save();
            canvas.translate(AndroidUtilities.dp(20.0f) + f29, measuredHeight - AndroidUtilities.dp(25.0f));
            int i26 = 0;
            for (int i27 = 3; i26 < i27; i27 = 3) {
                Path path = hc0Var.j;
                if (path != null) {
                    f11 = 20.0f;
                    if (hc0Var.k == hc0Var.l) {
                        f12 = 35.0f;
                        canvas.drawPath(hc0Var.j, paint5);
                        if (i26 != 0) {
                            paint6.setColor(-90112);
                        } else if (i26 == 1) {
                            paint6.setColor(-85326);
                        } else {
                            paint6.setColor(-16720161);
                        }
                        canvas.drawPath(hc0Var.j, paint6);
                        paint6.setColor(-1);
                        rectF4.set(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                        canvas.drawOval(rectF4, paint6);
                        paint6.setColor(-16777216);
                        rectF4.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        rectF4.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f12), AndroidUtilities.dp(24.0f));
                        canvas.drawOval(rectF4, paint6);
                        canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                        i26++;
                    }
                } else {
                    f11 = 20.0f;
                }
                if (path == null) {
                    hc0Var.j = new Path();
                }
                hc0Var.j.reset();
                boolean z12 = hc0Var.k;
                hc0Var.l = z12;
                if (z12) {
                    hc0Var.j.moveTo(0.0f, AndroidUtilities.dp(50.0f));
                    hc0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    hc0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    hc0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(50.0f));
                    hc0Var.j.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(43.0f));
                    hc0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(50.0f));
                    hc0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(43.0f));
                    hc0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(50.0f));
                    hc0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(43.0f));
                    f12 = 35.0f;
                } else {
                    f12 = 35.0f;
                    hc0Var.j.moveTo(0.0f, AndroidUtilities.dp(43.0f));
                    hc0Var.j.lineTo(0.0f, AndroidUtilities.dp(24.0f));
                    rectF4.set(0.0f, 0.0f, AndroidUtilities.dp(42.0f), AndroidUtilities.dp(24.0f));
                    hc0Var.j.arcTo(rectF4, 180.0f, 180.0f, false);
                    hc0Var.j.lineTo(AndroidUtilities.dp(42.0f), AndroidUtilities.dp(43.0f));
                    hc0Var.j.lineTo(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(50.0f));
                    hc0Var.j.lineTo(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(43.0f));
                    hc0Var.j.lineTo(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(50.0f));
                    hc0Var.j.lineTo(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(43.0f));
                    hc0Var.j.lineTo(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f));
                }
                hc0Var.j.close();
                canvas.drawPath(hc0Var.j, paint5);
                if (i26 != 0) {
                }
                canvas.drawPath(hc0Var.j, paint6);
                paint6.setColor(-1);
                rectF4.set(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(f11), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(28.0f));
                canvas.drawOval(rectF4, paint6);
                paint6.setColor(-16777216);
                rectF4.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF4, paint6);
                rectF4.set(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(f12), AndroidUtilities.dp(24.0f));
                canvas.drawOval(rectF4, paint6);
                canvas.translate(AndroidUtilities.dp(62.0f), 0.0f);
                i26++;
            }
            canvas.restore();
            if (hc0Var.h >= 1.0f) {
                hc0Var.d.run();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - hc0Var.e;
            hc0Var.e = currentTimeMillis;
            if (j10 > 17) {
                j10 = 17;
            }
            if (hc0Var.g >= 1.0f) {
                hc0Var.g = 0.0f;
            }
            float f33 = j10;
            float f34 = (f33 / 400.0f) + hc0Var.g;
            hc0Var.g = f34;
            if (f34 > 1.0f) {
                hc0Var.g = 1.0f;
            }
            float f35 = (f33 / 2000.0f) + hc0Var.h;
            hc0Var.h = f35;
            if (f35 > 1.0f) {
                hc0Var.h = 1.0f;
            }
            float f36 = (f33 / 200.0f) + hc0Var.i;
            hc0Var.i = f36;
            if (f36 >= 1.0f) {
                hc0Var.k = !hc0Var.k;
                hc0Var.i = 0.0f;
            }
            view5.invalidate();
        }
        if (this.o3 == null) {
            i9 = ((org.telegram.ui.ActionBar.o2) dyVar3).currentAccount;
            ih.u9[] u9VarArr = ih.u9.f;
            if (u9VarArr[i9] == null) {
                u9VarArr[i9] = new ih.u9(i9);
            }
            this.o3 = u9VarArr[i9];
        }
        this.o3.a(this);
    }

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + this.q3.J) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null && getItemAnimator().k() && (view instanceof org.telegram.ui.Cells.r2) && ((org.telegram.ui.Cells.r2) view).r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public float getViewOffset() {
        return dy.w4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        cy cyVar = this.c3;
        if (cyVar.n != null && dy.w4 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            cyVar.n.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.T1) {
            return false;
        }
        dy dyVar = this.q3;
        if (dyVar.X0 || this.c3.x.k()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
            dyVar.Y0 = !kVar.s();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.d3 = getPaddingTop();
        this.q3.t3 = 0.0f;
        this.c3.getClass();
    }

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        cy[] cyVarArr;
        AnimatorSet animatorSet;
        cy cyVar = this.c3;
        int L0 = cyVar.c.L0();
        dy dyVar = this.q3;
        if (L0 != -1 && cyVar.e.y == 0 && cyVar.c.y < 0 && cyVar.a.getScrollState() != 1) {
            f2.q1 K = cyVar.a.K(L0);
            if (K != null) {
                int top = K.a.getTop();
                if (cyVar.s == 0 && dyVar.Z3() && cyVar.v == 2) {
                    L0 = Math.max(1, L0);
                }
                this.b3 = true;
                cyVar.c.h1(L0, (int) ((top - this.d3) + dyVar.t3 + 0));
                this.b3 = false;
            }
        } else if (L0 == -1 && this.a3) {
            cyVar.c.h1((cyVar.s == 0 && dyVar.Z3()) ? 1 : 0, (int) dyVar.J);
        }
        this.b3 = true;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        kVar = ((org.telegram.ui.ActionBar.o2) dyVar).actionBar;
        int i11 = currentActionBarHeight + (kVar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
        if (dyVar.G && !dyVar.K) {
            i11 += AndroidUtilities.dp(81.0f);
        }
        if (!dyVar.K) {
            i11 += AndroidUtilities.dp(48.0f);
        }
        this.p3 = 0;
        float S3 = dyVar.S3(false);
        org.telegram.ui.Components.bs bsVar = dyVar.F1;
        float f10 = bsVar != null ? bsVar.getMetadata().c.a : 0.0f;
        int dp = i11 + ((int) (AndroidUtilities.dp(50.0f) * S3));
        this.p3 += (int) (AndroidUtilities.dp(50.0f) * S3);
        org.telegram.ui.Components.bs bsVar2 = dyVar.F1;
        if (bsVar2 != null) {
            int c10 = (int) bsVar2.c(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), S3));
            dp += c10;
            this.p3 += c10;
        }
        int dp2 = dp - AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        this.p3 -= AndroidUtilities.dp(Math.max(S3, f10) * 5.0f);
        int n32 = dyVar.n3();
        if (dp2 != this.U2 || n32 != getPaddingBottom()) {
            setTopGlowOffset(dp2);
            setPadding(0, dp2, 0, n32);
            if (dyVar.G) {
                cyVar.w.setPaddingTop(dp2 - AndroidUtilities.dp(81.0f));
            } else {
                cyVar.w.setPaddingTop(dp2);
            }
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) instanceof of.l) {
                    getChildAt(i12).requestLayout();
                }
            }
        }
        this.b3 = false;
        if (this.a3 && dyVar.getMessagesController().dialogsLoaded) {
            if (cyVar.s == 0 && dyVar.Z3()) {
                this.b3 = true;
                ((f2.m0) getLayoutManager()).h1(1, (int) dyVar.J);
                this.b3 = false;
            }
            this.a3 = false;
        }
        super.onMeasure(i9, i10);
        if (dyVar.h2 || dp2 == 0 || (cyVarArr = dyVar.a0) == null || cyVarArr.length <= 1 || dyVar.h3 || (animatorSet = dyVar.b3) == null) {
            return;
        }
        animatorSet.isRunning();
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.q1 q1Var;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        char c10;
        if (this.T1) {
            return false;
        }
        dy dyVar = this.q3;
        if (dyVar.X0 || dyVar.y) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setOverScrollMode(0);
        }
        cy cyVar = this.c3;
        if (action == 1 || action == 3) {
            f2.h0 h0Var = cyVar.e;
            if (h0Var.y != 0) {
                ay ayVar = cyVar.f;
                if (ayVar.e) {
                    ayVar.f = true;
                    if (h0Var.f(null, 4) != 0 && (q1Var = cyVar.f.d) != null) {
                        View view = q1Var.a;
                        if (view instanceof org.telegram.ui.Cells.r2) {
                            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
                            long dialogId = r2Var.getDialogId();
                            if (DialogObject.isFolderDialogId(dialogId)) {
                                z1(false, r2Var);
                            } else {
                                TLRPC.Dialog dialog = (TLRPC.Dialog) dyVar.getMessagesController().dialogs_dict.f(dialogId);
                                if (dialog != null) {
                                    if (ChatObject.isCommunity(dyVar.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(Long.valueOf(dialogId));
                                        dyVar = dyVar;
                                        dyVar.r4(arrayList, 111, true, false, null);
                                    } else {
                                        dyVar = dyVar;
                                        i9 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                        if (SharedConfig.getChatSwipeAction(i9) == 1) {
                                            ArrayList arrayList2 = new ArrayList();
                                            arrayList2.add(Long.valueOf(dialogId));
                                            dyVar.I2 = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                            dyVar.r4(arrayList2, 101, true, false, null);
                                        } else {
                                            i10 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                            if (SharedConfig.getChatSwipeAction(i10) != 3) {
                                                i11 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                                if (SharedConfig.getChatSwipeAction(i11) == 0) {
                                                    ArrayList arrayList3 = new ArrayList();
                                                    arrayList3.add(Long.valueOf(dialogId));
                                                    dyVar.J2 = !dyVar.g4(dialog) ? 1 : 0;
                                                    dyVar.r4(arrayList3, 100, true, false, null);
                                                } else {
                                                    i12 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                                    if (SharedConfig.getChatSwipeAction(i12) == 4) {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        arrayList4.add(Long.valueOf(dialogId));
                                                        dyVar.r4(arrayList4, 102, true, false, null);
                                                    }
                                                }
                                            } else if (dyVar.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                                ArrayList arrayList5 = new ArrayList();
                                                arrayList5.add(Long.valueOf(dialogId));
                                                i13 = ((org.telegram.ui.ActionBar.o2) dyVar).currentAccount;
                                                dyVar.K2 = !MessagesController.getInstance(i13).isDialogMuted(dialogId, 0L) ? 1 : 0;
                                                dyVar.L2 = dyVar.K2 > 0 ? 0 : 1;
                                                dyVar.r4(arrayList5, 104, true, false, null);
                                            } else {
                                                NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                                if (org.telegram.ui.Components.oc.a(dyVar)) {
                                                    org.telegram.ui.Components.oc.z(dyVar, 3, 0, null).j();
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
        if (cyVar.s == 0 && ((action == 1 || action == 3) && cyVar.v == 2 && dyVar.Z3() && ((f2.m0) getLayoutManager()).L0() == 0)) {
            int paddingTop = getPaddingTop();
            org.telegram.ui.Cells.r2 Q3 = dy.Q3(cyVar);
            if (Q3 != null) {
                int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f) * 0.85f);
                int measuredHeight = Q3.getMeasuredHeight() + (Q3.getTop() - paddingTop);
                long currentTimeMillis = System.currentTimeMillis() - dyVar.Y2;
                if (measuredHeight < dp || currentTimeMillis < 200) {
                    dyVar.a2 = true;
                    c10 = 0;
                    v0(0, measuredHeight, org.telegram.ui.Components.gr.h);
                    cyVar.v = 2;
                } else {
                    if (cyVar.v != 1) {
                        if (getViewOffset() == 0.0f) {
                            dyVar.a2 = true;
                            v0(0, Q3.getTop() - paddingTop, org.telegram.ui.Components.gr.h);
                        }
                        if (!dyVar.a3) {
                            dyVar.a3 = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            kw kwVar = cyVar.n;
                            if (kwVar != null) {
                                kwVar.a(true);
                            }
                        }
                        Q3.Z();
                        cyVar.v = 1;
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
                    ofFloat.addUpdateListener(new f3(this, 10));
                    ofFloat.setDuration(Math.max(100L, (long) org.telegram.messenger.ll.c(getViewOffset(), AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                    ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                    setScrollEnabled(false);
                    ofFloat.addListener(new org.telegram.ui.Components.y11(this, 25));
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

    @Override // org.telegram.ui.Components.aa, org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.b3) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView
    public void setAdapter(f2.r0 r0Var) {
        super.setAdapter(r0Var);
        this.a3 = true;
    }

    public void setOpenRightFragmentProgress(float f10) {
        this.e3 = f10;
        invalidate();
    }

    public void setViewsOffset(float f10) {
        View m10;
        dy.w4 = f10;
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            getChildAt(i9).setTranslationY(f10);
        }
        if (this.A1 != -1 && (m10 = getLayoutManager().m(this.A1)) != null) {
            int left = m10.getLeft();
            int top = (int) (m10.getTop() + f10);
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.C1;
            rect.set(left, top, right, bottom);
            this.z1.setBounds(rect);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Components.wk0
    public final boolean u1() {
        return true;
    }

    @Override // org.telegram.ui.Components.aa
    public final int w1() {
        return AndroidUtilities.dp(48.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if ((r3.getTop() - getPaddingTop()) > ((getMeasuredHeight() - getPaddingTop()) / 2.0f)) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y1(ww wwVar, float f10, boolean z10) {
        dy dyVar;
        org.telegram.ui.Components.wk0 wk0Var = wwVar == null ? this.h3 : this;
        if (wk0Var == null) {
            this.h3 = wwVar;
            return;
        }
        boolean z11 = false;
        org.telegram.ui.Cells.r2 r2Var = null;
        org.telegram.ui.Cells.r2 r2Var2 = null;
        int i9 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = 0;
        while (true) {
            int childCount = wk0Var.getChildCount();
            dyVar = this.q3;
            if (i10 >= childCount) {
                break;
            }
            View childAt = wk0Var.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.r2) {
                org.telegram.ui.Cells.r2 r2Var3 = (org.telegram.ui.Cells.r2) childAt;
                if (r2Var3.getDialogId() == dyVar.B3.getCurrentFragmetDialogId()) {
                    r2Var = r2Var3;
                }
                if (childAt.getTop() >= 0 && r2Var3.getDialogId() != 0 && childAt.getTop() < i9) {
                    i9 = r2Var3.getTop();
                    r2Var2 = r2Var3;
                }
            }
            i10++;
        }
        if (r2Var != null) {
            if (AndroidUtilities.dp(70.0f) * getAdapter().h() > getMeasuredHeight()) {
            }
        }
        r2Var = r2Var2;
        this.h3 = wwVar;
        if (r2Var != null) {
            if (wwVar != null) {
                wwVar.setPadding(getPaddingLeft(), this.U2, getPaddingLeft(), getPaddingBottom());
                int F = ((of.m) wwVar.getAdapter()).F(r2Var.getDialogId());
                int top = (int) ((r2Var.getTop() - wk0Var.getPaddingTop()) + f10);
                if (F >= 0) {
                    cy cyVar = this.c3;
                    if (cyVar.s == 0 && cyVar.v == 2 && dyVar.Z3()) {
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
                    ((f2.m0) wwVar.getLayoutManager()).h1(F, top);
                }
            }
            int F2 = ((of.m) getAdapter()).F(r2Var.getDialogId());
            int top2 = r2Var.getTop() - getPaddingTop();
            if (z10 && dyVar.G) {
                top2 += AndroidUtilities.dp(81.0f);
            }
            if (z10) {
                top2 += AndroidUtilities.dp(48.0f);
            }
            if (F2 >= 0) {
                ((f2.m0) getLayoutManager()).h1(F2, top2);
            }
        }
    }

    public final void z1(boolean z10, org.telegram.ui.Cells.r2 r2Var) {
        SharedConfig.toggleArchiveHidden();
        dy dyVar = this.q3;
        UndoView Y3 = dyVar.Y3();
        if (!SharedConfig.archiveHidden) {
            Y3.l(0L, 7, null, null);
            A1();
            if (!z10 || r2Var == null) {
                return;
            }
            r2Var.T();
            r2Var.invalidate();
            return;
        }
        if (r2Var != null) {
            dyVar.a2 = true;
            dyVar.X0 = true;
            int top = (r2Var.getTop() - getPaddingTop()) + r2Var.getMeasuredHeight();
            if (dyVar.G && !dyVar.A0.g()) {
                dyVar.N = true;
                top += AndroidUtilities.dp(81.0f);
            }
            v0(0, top, org.telegram.ui.Components.gr.g);
            if (z10) {
                dyVar.Z0 = true;
            } else {
                A1();
            }
        }
        Y3.l(0L, 6, null, null);
    }
}
