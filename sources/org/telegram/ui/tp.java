package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class tp implements org.telegram.messenger.us {
    public int D;
    public int E;
    public final ImageReceiver F;
    public TLRPC.Chat G;
    public TLRPC.TL_forumTopic H;
    public long I;
    public AnimatorSet J;
    public float K;
    public float L;
    public boolean M;
    public boolean N;
    public float O;
    public long P;
    public float Q;
    public boolean R;
    public float S;
    public final View T;
    public long U;
    public boolean V;
    public boolean W;
    public final boolean X;
    public rh Y;
    public long Z;
    public int a;
    public View a0;
    public int b;
    public boolean b0;
    public int c;
    public final org.telegram.ui.Components.kq c0;
    public float d;
    public final int[] d0;
    public final Paint e;
    public final int e0;
    public final TextPaint f;
    public final int f0;
    public final int g0;
    public final TextPaint h;
    public final long h0;
    public final long i0;
    public final org.telegram.ui.ActionBar.p6 j0;
    public org.telegram.ui.Components.f5 k0;
    public gg.d l0;
    public int m0;
    public final Paint n;
    public int n0;
    public final Path r;
    public StaticLayout s;
    public StaticLayout w;
    public StaticLayout x;
    public int y;

    public tp(int i10, View view, long j10, int i11, int i12, long j11, org.telegram.ui.ActionBar.p6 p6Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.n = paint2;
        this.r = new Path();
        this.I = 0L;
        this.b0 = true;
        org.telegram.ui.Components.kq kqVar = new org.telegram.ui.Components.kq(null, true, null);
        this.c0 = kqVar;
        this.d0 = new int[3];
        this.T = view;
        this.e0 = i10;
        this.i0 = j10;
        this.f0 = i11;
        this.g0 = i12;
        this.h0 = j11;
        this.X = org.telegram.messenger.vp.r1(i10).s2(j10);
        this.j0 = p6Var;
        this.F = new ImageReceiver(view);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        kqVar.z = 3;
        kqVar.I = 1;
        kqVar.g = true;
        kqVar.d = d("paintChatActionBackground");
        kqVar.e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint2.setTextSize(org.telegram.messenger.i0.L(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j10, int i10, int i11, boolean z10, int[] iArr) {
        ArrayList V0;
        TLRPC.Dialog c10;
        TLRPC.Dialog c11;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(org.telegram.messenger.c.a(org.telegram.messenger.d20.s0).a);
        SparseArray sparseArray = r12.w;
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i10;
            iArr[2] = i11;
        }
        if (i11 != 0) {
            org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) r12.S0.get(i11);
            if (apVar == null) {
                return null;
            }
            V0 = apVar.k;
        } else {
            V0 = r12.V0(i10);
        }
        if (V0 == null) {
            return null;
        }
        for (int i12 = 0; i12 < V0.size(); i12++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) V0.get(i12);
            TLRPC.Chat L0 = r12.L0(Long.valueOf(-dialog.id));
            if (L0 != null && dialog.id != j10 && dialog.unread_count > 0 && org.telegram.messenger.o5.y(dialog) && !L0.megagroup && !r12.B2(dialog.id, false) && r12.E1(L0.restriction_reason) == null) {
                return dialog;
            }
        }
        if (!z10) {
            return null;
        }
        if (i11 != 0) {
            for (int i13 = 0; i13 < r12.P0.size(); i13++) {
                int i14 = ((org.telegram.messenger.ap) r12.P0.get(i13)).a;
                if (i11 != i14 && (c11 = c(j10, i10, i14, false, iArr)) != null) {
                    if (iArr != null) {
                        iArr[0] = 1;
                    }
                    return c11;
                }
            }
        }
        for (int i15 = 0; i15 < sparseArray.size(); i15++) {
            int keyAt = sparseArray.keyAt(i15);
            if (i10 != keyAt && (c10 = c(j10, keyAt, 0, false, iArr)) != null) {
                if (iArr != null) {
                    iArr[0] = 1;
                }
                return c10;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0551  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, vj vjVar, float f7, float f10) {
        float f11;
        TextPaint textPaint;
        Paint paint;
        int alpha;
        int alpha2;
        int i10;
        int i11;
        TextPaint textPaint2;
        RectF rectF;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i13;
        org.telegram.ui.Components.kq kqVar;
        float f18;
        float f19;
        float f20;
        int i14;
        float f21;
        int i15;
        TextPaint textPaint3;
        float f22;
        Paint paint2;
        org.telegram.ui.Components.f5 f5Var;
        ImageReceiver imageReceiver;
        float f23;
        float f24;
        RectF rectF2;
        float z10;
        int w02;
        TLRPC.TL_forumTopic tL_forumTopic;
        int w03;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.p6 p6Var = this.j0;
        if (this.a0 != vjVar) {
            this.a0 = vjVar;
            org.telegram.ui.Components.f5 f5Var2 = this.k0;
            if (f5Var2 != null) {
                f5Var2.a(vjVar);
            }
        }
        org.telegram.ui.Components.kq kqVar2 = this.c0;
        kqVar2.H = vjVar;
        RectF rectF3 = kqVar2.f;
        float L = org.telegram.messenger.i0.L(110.0f) * f7;
        if (L < org.telegram.messenger.i0.L(8.0f)) {
            return;
        }
        float f25 = f7 < 0.2f ? 5.0f * f7 * f10 : f10;
        org.telegram.ui.ActionBar.t6.r(0.0f, vjVar.getMeasuredHeight() - L, this.c, vjVar.getMeasuredHeight());
        try {
            if (this.l0 != null && (tL_forumTopic = this.H) != null && tL_forumTopic.id == 1 && (w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.od, p6Var)) != this.m0) {
                this.m0 = w03;
                this.l0.a(w03);
            }
            if (this.k0 == null || (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, p6Var)) == this.n0) {
                f11 = 0.2f;
            } else {
                this.n0 = w02;
                f11 = 0.2f;
                try {
                    this.k0.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                } catch (Exception e) {
                    e = e;
                    org.telegram.messenger.f8.g(e, true);
                    int w04 = org.telegram.ui.ActionBar.t6.w0(!org.telegram.ui.ActionBar.t6.i1(p6Var) ? org.telegram.ui.ActionBar.t6.Ia : org.telegram.ui.ActionBar.t6.Wc, p6Var);
                    textPaint = this.f;
                    textPaint.setColor(w04);
                    paint = this.e;
                    paint.setColor(w04);
                    this.h.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Je, p6Var));
                    alpha = d("paintChatActionBackground").getAlpha();
                    alpha2 = org.telegram.ui.ActionBar.t6.h2.getAlpha();
                    int alpha3 = textPaint.getAlpha();
                    int alpha4 = paint.getAlpha();
                    org.telegram.ui.ActionBar.t6.h2.setAlpha((int) (alpha2 * f25));
                    int i16 = (int) (alpha * f25);
                    d("paintChatActionBackground").setAlpha(i16);
                    i10 = (int) (alpha3 * f25);
                    textPaint.setAlpha(i10);
                    if (f7 >= 1.0f) {
                    }
                    i11 = i10;
                    textPaint2 = textPaint;
                    rectF = rectF3;
                    i12 = alpha2;
                    if (f7 != 1.0f) {
                    }
                    if (f7 != 1.0f) {
                        this.M = false;
                        f(vjVar, false);
                    }
                    f12 = this.c / 2.0f;
                    f13 = this.L * (-org.telegram.messenger.i0.L(4.0f));
                    if (!this.R) {
                    }
                    float f26 = f14 / 2.0f;
                    float max = Math.max(0.0f, Math.min(this.d, (f26 - (org.telegram.messenger.i0.L(16.0f) * f7)) - org.telegram.messenger.i0.L(4.0f)));
                    float max2 = (1.0f - this.K) * ((Math.max(0.0f, Math.min(this.d * f7, f26 - (org.telegram.messenger.i0.L(8.0f) * f7))) * 2.0f) - org.telegram.messenger.i0.M(16.0f));
                    float L2 = org.telegram.messenger.i0.L(56.0f);
                    f15 = this.K;
                    float f27 = max2 + (L2 * f15);
                    if (f15 >= 1.0f) {
                    }
                    float f28 = -f14;
                    float f29 = f14;
                    float L3 = (this.K * (org.telegram.messenger.i0.L(56.0f) + f28)) + ((1.0f - this.K) * (-org.telegram.messenger.i0.L(8.0f)));
                    RectF rectF4 = org.telegram.messenger.i0.P;
                    TextPaint textPaint4 = textPaint2;
                    rectF4.set(f12 - max, f28, f12 + max, L3);
                    if (this.K > 0.0f) {
                    }
                    f16 = 1.0f;
                    if (this.W) {
                    }
                    float z11 = c3.i0.z(1.0f, f7, org.telegram.messenger.i0.L(8.0f), f17 + org.telegram.messenger.i0.L(24.0f)) - (org.telegram.messenger.i0.L(36.0f) * this.K);
                    canvas2.save();
                    rectF4.inset(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
                    canvas2.clipRect(rectF4);
                    f20 = this.K;
                    if (f20 > 0.0f) {
                    }
                    canvas2.save();
                    float L4 = (org.telegram.messenger.i0.L(24.0f) * f7) / org.telegram.messenger.i0.N(24.0f);
                    canvas2.scale(L4, L4, f12, z11 - org.telegram.messenger.i0.L(20.0f));
                    canvas2.translate(f12 - org.telegram.messenger.i0.M(12.0f), z11 - org.telegram.messenger.i0.L(12.0f));
                    i14 = i11;
                    f21 = f13;
                    i15 = alpha;
                    textPaint3 = textPaint4;
                    f22 = f29;
                    canvas2.drawLine(org.telegram.messenger.i0.N(12.5f), org.telegram.messenger.i0.N(4.0f), org.telegram.messenger.i0.N(12.5f), org.telegram.messenger.i0.N(22.0f), paint);
                    canvas.drawLine(org.telegram.messenger.i0.N(3.5f), org.telegram.messenger.i0.N(12.0f), org.telegram.messenger.i0.N(12.5f), org.telegram.messenger.i0.N(3.5f), paint);
                    canvas2 = canvas;
                    canvas2.drawLine(org.telegram.messenger.i0.N(21.5f), org.telegram.messenger.i0.N(12.0f), org.telegram.messenger.i0.N(12.5f), org.telegram.messenger.i0.N(3.5f), paint);
                    canvas2.restore();
                    if (this.R) {
                    }
                    canvas2.restore();
                    if (this.s != null) {
                        d("paintChatActionBackground").setAlpha(i13);
                        textPaint3.setAlpha(i14);
                        float L5 = (((1.0f - this.K) * org.telegram.messenger.i0.L(20.0f)) - (org.telegram.messenger.i0.L(36.0f) * this.K)) + f21;
                        RectF rectF5 = org.telegram.messenger.i0.P;
                        float f30 = (r4 - this.y) / 2.0f;
                        rectF5.set(f30, L5, this.c - f30, this.s.getHeight() + L5);
                        rectF5.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(4.0f));
                        canvas2.drawRoundRect(rectF5, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), d("paintChatActionBackground"));
                        if (p6Var == null ? p6Var.g() : org.telegram.ui.ActionBar.t6.d1()) {
                        }
                        canvas2.save();
                        canvas2.translate((this.c - this.y) / 2.0f, L5);
                        this.s.draw(canvas2);
                        canvas2.restore();
                    }
                    if (!this.R) {
                        float d = sc.e.d((-f22) + org.telegram.messenger.i0.L(4.0f), this.K, (1.0f - this.K) * (((-org.telegram.messenger.i0.L(8.0f)) - (org.telegram.messenger.i0.M(8.0f) * f7)) - f18), f21);
                        f5Var = this.k0;
                        if (f5Var != null) {
                        }
                        ImageReceiver imageReceiver2 = this.F;
                        imageReceiver = imageReceiver2;
                        imageReceiver.setAlpha(f19);
                        float f31 = f18 / 2.0f;
                        imageReceiver.J0((int) f31);
                        float f32 = f18;
                        imageReceiver.y0(f12 - f31, d, f32, f32);
                        if (this.X) {
                            ((org.telegram.ui.Components.z70) ((org.telegram.ui.Components.eq) imageReceiver.t()).b).i = f7;
                        }
                        if (this.K > 0.0f) {
                        }
                        imageReceiver.h(canvas2, null);
                        imageReceiver.setAlpha(1.0f);
                    }
                    d("paintChatActionBackground").setAlpha(i15);
                    org.telegram.ui.ActionBar.t6.h2.setAlpha(i12);
                    textPaint3.setAlpha(alpha3);
                    paint2.setAlpha(alpha4);
                }
            }
        } catch (Exception e7) {
            e = e7;
            f11 = 0.2f;
        }
        int w042 = org.telegram.ui.ActionBar.t6.w0(!org.telegram.ui.ActionBar.t6.i1(p6Var) ? org.telegram.ui.ActionBar.t6.Ia : org.telegram.ui.ActionBar.t6.Wc, p6Var);
        textPaint = this.f;
        textPaint.setColor(w042);
        paint = this.e;
        paint.setColor(w042);
        this.h.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Je, p6Var));
        alpha = d("paintChatActionBackground").getAlpha();
        alpha2 = org.telegram.ui.ActionBar.t6.h2.getAlpha();
        int alpha32 = textPaint.getAlpha();
        int alpha42 = paint.getAlpha();
        org.telegram.ui.ActionBar.t6.h2.setAlpha((int) (alpha2 * f25));
        int i162 = (int) (alpha * f25);
        d("paintChatActionBackground").setAlpha(i162);
        i10 = (int) (alpha32 * f25);
        textPaint.setAlpha(i10);
        if ((f7 >= 1.0f || this.Q >= 1.0f) && (f7 >= 1.0f || this.Q != 1.0f)) {
            i11 = i10;
            textPaint2 = textPaint;
            rectF = rectF3;
            i12 = alpha2;
        } else {
            i11 = i10;
            textPaint2 = textPaint;
            long currentTimeMillis = System.currentTimeMillis();
            rectF = rectF3;
            i12 = alpha2;
            if (currentTimeMillis - this.P > 100) {
                try {
                    vjVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.P = currentTimeMillis;
            }
            this.Q = f7;
        }
        if (f7 != 1.0f && !this.M) {
            this.M = true;
            this.N = true;
            f(vjVar, true);
            this.U = System.currentTimeMillis();
        } else if (f7 != 1.0f && this.M) {
            this.M = false;
            f(vjVar, false);
        }
        f12 = this.c / 2.0f;
        f13 = this.L * (-org.telegram.messenger.i0.L(4.0f));
        f14 = !this.R ? L - f13 : L;
        float f262 = f14 / 2.0f;
        float max3 = Math.max(0.0f, Math.min(this.d, (f262 - (org.telegram.messenger.i0.L(16.0f) * f7)) - org.telegram.messenger.i0.L(4.0f)));
        float max22 = (1.0f - this.K) * ((Math.max(0.0f, Math.min(this.d * f7, f262 - (org.telegram.messenger.i0.L(8.0f) * f7))) * 2.0f) - org.telegram.messenger.i0.M(16.0f));
        float L22 = org.telegram.messenger.i0.L(56.0f);
        f15 = this.K;
        float f272 = max22 + (L22 * f15);
        if (f15 >= 1.0f || this.R) {
            float f282 = -f14;
            float f292 = f14;
            float L32 = (this.K * (org.telegram.messenger.i0.L(56.0f) + f282)) + ((1.0f - this.K) * (-org.telegram.messenger.i0.L(8.0f)));
            RectF rectF42 = org.telegram.messenger.i0.P;
            TextPaint textPaint42 = textPaint2;
            rectF42.set(f12 - max3, f282, f12 + max3, L32);
            if (this.K > 0.0f || this.R) {
                f16 = 1.0f;
            } else {
                float L6 = org.telegram.messenger.i0.L(16.0f) * this.K;
                rectF42.inset(L6, L6);
                f16 = 1.0f - this.K;
            }
            if (this.W) {
                f17 = f282;
                i13 = i162;
                kqVar = kqVar2;
                f18 = f272;
                f19 = f25;
                int alpha5 = d("paintChatActionBackground").getAlpha();
                d("paintChatActionBackground").setAlpha((int) (alpha5 * f16));
                float f33 = this.d;
                canvas2.drawRoundRect(rectF42, f33, f33, d("paintChatActionBackground"));
                d("paintChatActionBackground").setAlpha(alpha5);
                if (p6Var != null ? p6Var.g() : org.telegram.ui.ActionBar.t6.d1()) {
                    int alpha6 = org.telegram.ui.ActionBar.t6.h2.getAlpha();
                    org.telegram.ui.ActionBar.t6.h2.setAlpha((int) (alpha6 * f16));
                    float f34 = this.d;
                    canvas2.drawRoundRect(rectF42, f34, f34, org.telegram.ui.ActionBar.t6.h2);
                    org.telegram.ui.ActionBar.t6.h2.setAlpha(alpha6);
                }
            } else {
                Path path = this.r;
                path.reset();
                float width = rectF42.width() * f11;
                float width2 = rectF42.width() * 0.1f;
                float width3 = rectF42.width() * 0.03f;
                f17 = f282;
                float f35 = width2 / 2.0f;
                float height = rectF42.height() - width2;
                kqVar = kqVar2;
                f18 = f272;
                path.moveTo(rectF42.right, rectF42.top + width + width2);
                float f36 = -width;
                path.rQuadTo(0.0f, f36, f36, f36);
                float f37 = width * 2.0f;
                float f38 = f35 * 2.0f;
                f19 = f25;
                path.rLineTo((((-(rectF42.width() - f37)) / 2.0f) + f38) - width3, 0.0f);
                float f39 = -f35;
                float f40 = f39 / 2.0f;
                float f41 = f39 * 2.0f;
                i13 = i162;
                float f42 = (-width2) / 2.0f;
                path.rQuadTo(f40, 0.0f, f41, f42);
                path.rQuadTo(f40, f42, f41, f42);
                path.rLineTo(((-(rectF42.width() - f37)) / 2.0f) + f38 + width3, 0.0f);
                path.rQuadTo(f36, 0.0f, f36, width);
                path.rLineTo(0.0f, (height + width2) - f37);
                path.rQuadTo(0.0f, width, width, width);
                path.rLineTo(rectF42.width() - f37, 0.0f);
                path.rQuadTo(width, 0.0f, width, f36);
                path.rLineTo(0.0f, -(height - f37));
                path.close();
                canvas2.drawPath(path, d("paintChatActionBackground"));
                if (p6Var != null ? p6Var.g() : org.telegram.ui.ActionBar.t6.d1()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.t6.h2);
                }
            }
            float z112 = c3.i0.z(1.0f, f7, org.telegram.messenger.i0.L(8.0f), f17 + org.telegram.messenger.i0.L(24.0f)) - (org.telegram.messenger.i0.L(36.0f) * this.K);
            canvas2.save();
            rectF42.inset(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
            canvas2.clipRect(rectF42);
            f20 = this.K;
            if (f20 > 0.0f) {
                paint.setAlpha((int) ((1.0f - f20) * 255.0f));
            }
            canvas2.save();
            float L42 = (org.telegram.messenger.i0.L(24.0f) * f7) / org.telegram.messenger.i0.N(24.0f);
            canvas2.scale(L42, L42, f12, z112 - org.telegram.messenger.i0.L(20.0f));
            canvas2.translate(f12 - org.telegram.messenger.i0.M(12.0f), z112 - org.telegram.messenger.i0.L(12.0f));
            i14 = i11;
            f21 = f13;
            i15 = alpha;
            textPaint3 = textPaint42;
            f22 = f292;
            canvas2.drawLine(org.telegram.messenger.i0.N(12.5f), org.telegram.messenger.i0.N(4.0f), org.telegram.messenger.i0.N(12.5f), org.telegram.messenger.i0.N(22.0f), paint);
            canvas.drawLine(org.telegram.messenger.i0.N(3.5f), org.telegram.messenger.i0.N(12.0f), org.telegram.messenger.i0.N(12.5f), org.telegram.messenger.i0.N(3.5f), paint);
            canvas2 = canvas;
            canvas2.drawLine(org.telegram.messenger.i0.N(21.5f), org.telegram.messenger.i0.N(12.0f), org.telegram.messenger.i0.N(12.5f), org.telegram.messenger.i0.N(3.5f), paint);
            canvas2.restore();
            if (this.R) {
                paint2 = paint;
            } else {
                float d10 = sc.e.d(f17 - org.telegram.messenger.i0.L(2.0f), this.K, (1.0f - this.K) * (((-org.telegram.messenger.i0.L(8.0f)) - (org.telegram.messenger.i0.M(8.0f) * f7)) - f18), f21);
                paint.setAlpha(alpha42);
                canvas2.save();
                canvas2.scale(f7, f7, f12, org.telegram.messenger.i0.L(28.0f) + d10);
                float L7 = d10 + org.telegram.messenger.i0.L(28.0f);
                if (this.N) {
                    float f43 = this.O;
                    if (f43 < 1.0f) {
                        float f44 = f43 + 0.07272727f;
                        this.O = f44;
                        if (f44 > 1.0f) {
                            this.O = 1.0f;
                        }
                    }
                    float f45 = this.O;
                    float f46 = f45 > 0.5f ? 1.0f : f45 / 0.5f;
                    float f47 = f45 < 0.5f ? 0.0f : (f45 - 0.5f) / 0.5f;
                    canvas2.save();
                    canvas2.clipRect(rectF42);
                    canvas2.translate(f12 - org.telegram.messenger.i0.L(24.0f), L7 - org.telegram.messenger.i0.L(24.0f));
                    float L8 = org.telegram.messenger.i0.L(16.0f);
                    float L9 = org.telegram.messenger.i0.L(26.0f);
                    float L10 = org.telegram.messenger.i0.L(22.0f);
                    float L11 = org.telegram.messenger.i0.L(32.0f);
                    float L12 = org.telegram.messenger.i0.L(32.0f);
                    float L13 = org.telegram.messenger.i0.L(20.0f);
                    float f48 = 1.0f - f46;
                    canvas.drawLine(L8, L9, (L10 * f46) + (L8 * f48), (f46 * L11) + (f48 * L9), paint);
                    if (f47 > 0.0f) {
                        float f49 = 1.0f - f47;
                        float f50 = (L12 * f47) + (L10 * f49);
                        float f51 = (L13 * f47) + (f49 * L11);
                        canvas2 = canvas;
                        canvas2.drawLine(L10, L11, f50, f51, paint);
                    } else {
                        canvas2 = canvas;
                    }
                    paint2 = paint;
                    canvas2.restore();
                } else {
                    paint2 = paint;
                }
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            i13 = i162;
            kqVar = kqVar2;
            f18 = f272;
            f19 = f25;
            textPaint3 = textPaint2;
            i14 = i11;
            f21 = f13;
            f22 = f14;
            i15 = alpha;
            paint2 = paint;
        }
        if (this.s != null && this.K > 0.0f) {
            d("paintChatActionBackground").setAlpha(i13);
            textPaint3.setAlpha(i14);
            float L52 = (((1.0f - this.K) * org.telegram.messenger.i0.L(20.0f)) - (org.telegram.messenger.i0.L(36.0f) * this.K)) + f21;
            RectF rectF52 = org.telegram.messenger.i0.P;
            float f302 = (r4 - this.y) / 2.0f;
            rectF52.set(f302, L52, this.c - f302, this.s.getHeight() + L52);
            rectF52.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(4.0f));
            canvas2.drawRoundRect(rectF52, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), d("paintChatActionBackground"));
            if (p6Var == null ? p6Var.g() : org.telegram.ui.ActionBar.t6.d1()) {
                canvas2.drawRoundRect(rectF52, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(15.0f), org.telegram.ui.ActionBar.t6.h2);
            }
            canvas2.save();
            canvas2.translate((this.c - this.y) / 2.0f, L52);
            this.s.draw(canvas2);
            canvas2.restore();
        }
        if (!this.R && f18 > 0.0f) {
            float d11 = sc.e.d((-f22) + org.telegram.messenger.i0.L(4.0f), this.K, (1.0f - this.K) * (((-org.telegram.messenger.i0.L(8.0f)) - (org.telegram.messenger.i0.M(8.0f) * f7)) - f18), f21);
            f5Var = this.k0;
            if (f5Var != null || (imageReceiver2 = f5Var.k) == null) {
                ImageReceiver imageReceiver22 = this.F;
            }
            imageReceiver = imageReceiver22;
            imageReceiver.setAlpha(f19);
            float f312 = f18 / 2.0f;
            imageReceiver.J0((int) f312);
            float f322 = f18;
            imageReceiver.y0(f12 - f312, d11, f322, f322);
            if (this.X && imageReceiver.t() != null && (imageReceiver.t() instanceof org.telegram.ui.Components.eq) && (((org.telegram.ui.Components.eq) imageReceiver.t()).b instanceof org.telegram.ui.Components.z70)) {
                ((org.telegram.ui.Components.z70) ((org.telegram.ui.Components.eq) imageReceiver.t()).b).i = f7;
            }
            if (this.K > 0.0f || !this.b0) {
                imageReceiver.h(canvas2, null);
            } else {
                float f52 = imageReceiver.K0;
                float f53 = imageReceiver.L0;
                canvas2.saveLayerAlpha(f52, f53, imageReceiver.M0 + f52, imageReceiver.N0 + f53, org.telegram.messenger.zs.e4, 31);
                imageReceiver.h(canvas2, null);
                float f54 = this.K;
                org.telegram.ui.Components.kq kqVar3 = kqVar;
                kqVar3.e(kqVar3.s);
                canvas2.scale(f54, f54, (kqVar3.s / 2.0f) + kqVar3.A + org.telegram.messenger.i0.L(12.0f) + f12, (d11 - org.telegram.messenger.i0.L(6.0f)) + org.telegram.messenger.i0.L(14.0f));
                canvas2.translate(org.telegram.messenger.i0.L(12.0f) + f12, d11 - org.telegram.messenger.i0.L(6.0f));
                float f55 = kqVar3.C;
                float f56 = kqVar3.l;
                if (f56 != 1.0f) {
                    int i17 = kqVar3.c;
                    f23 = 6.0f;
                    if (i17 == 0 || i17 == 1) {
                        f24 = 14.0f;
                        rectF2 = rectF;
                        kqVar3.e(kqVar3.s);
                        float L14 = (kqVar3.x - org.telegram.messenger.i0.L(f55 * 2.0f)) / 2.0f;
                        float f57 = kqVar3.B;
                        rectF2.set(f57, L14, kqVar3.s + f57 + org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(23.0f) + L14);
                    } else {
                        float f58 = f56 * 2.0f;
                        if (f58 > 1.0f) {
                            f58 = 1.0f;
                        }
                        float L15 = (kqVar3.x - org.telegram.messenger.i0.L(f55 * 2.0f)) / 2.0f;
                        int i18 = kqVar3.s;
                        int i19 = kqVar3.r;
                        if (i18 == i19) {
                            z10 = i18;
                            f24 = 14.0f;
                        } else {
                            f24 = 14.0f;
                            z10 = c3.i0.z(1.0f, f58, i19, i18 * f58);
                        }
                        kqVar3.e(z10);
                        float f59 = kqVar3.B;
                        rectF2 = rectF;
                        rectF2.set(f59, L15, z10 + f59 + org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(23.0f) + L15);
                    }
                } else {
                    f23 = 6.0f;
                    f24 = 14.0f;
                    rectF2 = rectF;
                    kqVar3.e(kqVar3.s);
                    float L16 = (kqVar3.x - org.telegram.messenger.i0.L(f55 * 2.0f)) / 2.0f;
                    float f60 = kqVar3.B;
                    rectF2.set(f60, L16, kqVar3.s + f60 + org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(23.0f) + L16);
                }
                rectF2.inset(-org.telegram.messenger.i0.L(2.0f), -org.telegram.messenger.i0.L(2.0f));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.n);
                canvas2.restore();
                canvas2.save();
                float f61 = this.K;
                kqVar3.e(kqVar3.s);
                canvas2.scale(f61, f61, (kqVar3.s / 2.0f) + kqVar3.A + org.telegram.messenger.i0.L(12.0f) + f12, (d11 - org.telegram.messenger.i0.L(f23)) + org.telegram.messenger.i0.L(f24));
                canvas2.translate(f12 + org.telegram.messenger.i0.L(12.0f), d11 - org.telegram.messenger.i0.L(f23));
                kqVar3.a(canvas2);
                canvas2.restore();
            }
            imageReceiver.setAlpha(1.0f);
        }
        d("paintChatActionBackground").setAlpha(i15);
        org.telegram.ui.ActionBar.t6.h2.setAlpha(i12);
        textPaint3.setAlpha(alpha32);
        paint2.setAlpha(alpha42);
    }

    public final void b(Canvas canvas, int i10, int i11) {
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ll, this.j0);
        TextPaint textPaint = this.h;
        textPaint.setColor(w02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.S));
        if (this.w != null) {
            float f7 = this.K;
            if (f7 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f7) * alpha2 * this.S));
                float height = ((((i11 - i10) - this.w.getHeight()) / 2.0f) + i10) - (org.telegram.messenger.i0.L(10.0f) * this.K);
                canvas.save();
                canvas.translate((this.c - this.D) / 2.0f, height);
                this.w.draw(canvas);
                canvas.restore();
            }
        }
        if (this.x != null) {
            float f10 = this.K;
            if (f10 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f10 * this.S));
                float L = ((1.0f - this.K) * org.telegram.messenger.i0.L(10.0f)) + (((i11 - i10) - this.x.getHeight()) / 2.0f) + i10;
                canvas.save();
                canvas.translate((this.c - this.E) / 2.0f, L);
                this.x.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        org.telegram.ui.ActionBar.p6 p6Var = this.j0;
        Paint d = p6Var != null ? p6Var.d(str) : null;
        return d != null ? d : org.telegram.ui.ActionBar.t6.V0(str);
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.Z == 0 || (dialog = (TLRPC.Dialog) org.telegram.messenger.vp.r1(this.e0).Q.f(this.Z)) == null) {
            return;
        }
        int i12 = dialog.unread_count;
        this.c0.c(i12, true);
        this.b0 = i12 > 0;
        View view = this.a0;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean e() {
        return this.S > 0.0f && !this.R;
    }

    public final void f(final View view, boolean z10) {
        AnimatorSet animatorSet = this.J;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.J.cancel();
        }
        final int i10 = 1;
        final int i11 = 0;
        final int i12 = 2;
        if (!z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, 0.0f);
            final int i13 = 4;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.rp
                public final /* synthetic */ tp b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i13) {
                        case 0:
                            tp tpVar = this.b;
                            tpVar.getClass();
                            tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            tpVar.T.invalidate();
                            break;
                        case 1:
                            tp tpVar2 = this.b;
                            tpVar2.getClass();
                            tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        case 2:
                            tp tpVar3 = this.b;
                            tpVar3.getClass();
                            tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        case 3:
                            tp tpVar4 = this.b;
                            tpVar4.getClass();
                            tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        default:
                            tp tpVar5 = this.b;
                            tpVar5.getClass();
                            tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            tpVar5.T.invalidate();
                            view.invalidate();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.gr.f);
            ofFloat.setDuration(220L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.J = animatorSet2;
            animatorSet2.playTogether(ofFloat);
            this.J.start();
            return;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.K, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.rp
            public final /* synthetic */ tp b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        tp tpVar = this.b;
                        tpVar.getClass();
                        tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        tpVar.T.invalidate();
                        break;
                    case 1:
                        tp tpVar2 = this.b;
                        tpVar2.getClass();
                        tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        tp tpVar3 = this.b;
                        tpVar3.getClass();
                        tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        tp tpVar4 = this.b;
                        tpVar4.getClass();
                        tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        tp tpVar5 = this.b;
                        tpVar5.getClass();
                        tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        tpVar5.T.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat2.setInterpolator(org.telegram.ui.Components.gr.h);
        ofFloat2.setDuration(250L);
        this.L = 0.0f;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.rp
            public final /* synthetic */ tp b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        tp tpVar = this.b;
                        tpVar.getClass();
                        tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        tpVar.T.invalidate();
                        break;
                    case 1:
                        tp tpVar2 = this.b;
                        tpVar2.getClass();
                        tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        tp tpVar3 = this.b;
                        tpVar3.getClass();
                        tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        tp tpVar4 = this.b;
                        tpVar4.getClass();
                        tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        tp tpVar5 = this.b;
                        tpVar5.getClass();
                        tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        tpVar5.T.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.j;
        ofFloat3.setInterpolator(grVar);
        ofFloat3.setDuration(180L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, -0.5f);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.rp
            public final /* synthetic */ tp b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        tp tpVar = this.b;
                        tpVar.getClass();
                        tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        tpVar.T.invalidate();
                        break;
                    case 1:
                        tp tpVar2 = this.b;
                        tpVar2.getClass();
                        tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        tp tpVar3 = this.b;
                        tpVar3.getClass();
                        tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        tp tpVar4 = this.b;
                        tpVar4.getClass();
                        tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        tp tpVar5 = this.b;
                        tpVar5.getClass();
                        tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        tpVar5.T.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat4.setInterpolator(grVar);
        ofFloat4.setDuration(120L);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(-0.5f, 0.0f);
        final int i14 = 3;
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.rp
            public final /* synthetic */ tp b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i14) {
                    case 0:
                        tp tpVar = this.b;
                        tpVar.getClass();
                        tpVar.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        tpVar.T.invalidate();
                        break;
                    case 1:
                        tp tpVar2 = this.b;
                        tpVar2.getClass();
                        tpVar2.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        tp tpVar3 = this.b;
                        tpVar3.getClass();
                        tpVar3.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        tp tpVar4 = this.b;
                        tpVar4.getClass();
                        tpVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        tp tpVar5 = this.b;
                        tpVar5.getClass();
                        tpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        tpVar5.T.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat5.setInterpolator(grVar);
        ofFloat5.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.J = animatorSet3;
        animatorSet3.addListener(new bg.f(13, this, view));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(ofFloat3, ofFloat4, ofFloat5);
        this.J.playTogether(ofFloat2, animatorSet4);
        this.J.start();
    }

    public final void g() {
        this.V = false;
        this.H = null;
        TLRPC.Dialog c10 = c(this.i0, this.f0, this.g0, true, this.d0);
        if (c10 == null) {
            this.G = null;
            this.W = false;
            this.R = true;
            return;
        }
        this.Z = c10.id;
        int[] iArr = this.d0;
        this.W = iArr[0] == 1;
        this.a = iArr[1];
        this.b = iArr[2];
        this.R = false;
        int i10 = this.e0;
        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-c10.id));
        this.G = L0;
        if (L0 == null) {
            this.G = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(c10.id));
        }
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.q(this.G);
        this.F.q0(org.telegram.messenger.ic.a(1, this.G), "50_50", r8Var, null, org.telegram.messenger.d20.i(0).f(), 0);
        org.telegram.messenger.vp.r1(i10).s0(c10.id, 0, null);
        int i11 = c10.unread_count;
        this.c0.c(i11, false);
        this.b0 = i11 > 0;
    }

    public final void h(TLRPC.Chat chat) {
        if (chat == null) {
            g();
            return;
        }
        this.Z = -chat.id;
        int[] iArr = this.d0;
        this.W = iArr[0] == 1;
        this.a = iArr[1];
        this.b = iArr[2];
        this.R = false;
        this.G = chat;
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.q(this.G);
        this.F.q0(org.telegram.messenger.ic.a(1, this.G), "50_50", r8Var, null, org.telegram.messenger.d20.i(0).f(), 0);
        int i10 = this.e0;
        org.telegram.messenger.vp.r1(i10).s0(-chat.id, 0, null);
        TLRPC.Dialog R0 = org.telegram.messenger.vp.r1(i10).R0(-chat.id);
        int i11 = R0 == null ? 0 : R0.unread_count;
        this.c0.c(i11, false);
        this.b0 = i11 > 0;
        this.V = true;
        this.H = null;
    }

    public final void i() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.f5 f5Var;
        View view;
        View view2;
        org.telegram.ui.Components.f5 f5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        this.V = false;
        this.W = false;
        this.G = null;
        this.Z = 0L;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.f();
        long j10 = -this.i0;
        int i10 = this.e0;
        ArrayList l4 = org.telegram.messenger.vp.r1(i10).r7.l(j10);
        if (l4 == null || l4.size() <= 1) {
            tL_forumTopic = null;
        } else {
            tL_forumTopic = null;
            for (int i11 = 0; i11 < l4.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l4.get(i11);
                if (tL_forumTopic2.id != this.h0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        }
        if (tL_forumTopic == null) {
            this.H = null;
            this.R = true;
            return;
        }
        this.R = false;
        this.H = tL_forumTopic;
        int i12 = tL_forumTopic.id;
        org.telegram.ui.ActionBar.p6 p6Var = this.j0;
        if (i12 == 1) {
            View view3 = this.a0;
            if (view3 != null && (f5Var2 = this.k0) != null) {
                f5Var2.n(view3);
            }
            this.k0 = null;
            Context context = this.T.getContext();
            int i13 = org.telegram.ui.ActionBar.t6.od;
            gg.d c10 = gg.e.c(context, 1.0f, org.telegram.ui.ActionBar.t6.w0(i13, p6Var), true);
            this.l0 = c10 != null ? c10 : null;
            this.m0 = org.telegram.ui.ActionBar.t6.w0(i13, p6Var);
            imageReceiver.w0(c10);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            org.telegram.ui.Components.f5 f5Var3 = this.k0;
            if (f5Var3 == null || f5Var3.h() != tL_forumTopic.icon_emoji_id) {
                org.telegram.ui.Components.f5 f5Var4 = this.k0;
                if (f5Var4 != null && (view = this.a0) != null) {
                    f5Var4.n(view);
                }
                org.telegram.ui.Components.f5 f5Var5 = new org.telegram.ui.Components.f5(22, i10, tL_forumTopic.icon_emoji_id);
                this.k0 = f5Var5;
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wc, p6Var);
                this.n0 = w02;
                f5Var5.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Components.f5 f5Var6 = this.k0;
            if (f5Var6 != null && (view2 = this.a0) != null) {
                f5Var6.a(view2);
            }
            imageReceiver.w0(null);
        } else {
            View view4 = this.a0;
            if (view4 != null && (f5Var = this.k0) != null) {
                f5Var.n(view4);
            }
            this.k0 = null;
            imageReceiver.w0(gg.e.e(tL_forumTopic));
        }
        int i14 = tL_forumTopic.unread_count;
        this.c0.c(i14, false);
        this.b0 = i14 > 0;
    }
}
