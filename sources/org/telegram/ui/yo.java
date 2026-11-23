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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class yo implements org.telegram.messenger.gs {
    public int E;
    public int F;
    public final ImageReceiver G;
    public TLRPC.Chat H;
    public TLRPC.TL_forumTopic I;
    public long J;
    public AnimatorSet K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public float P;
    public long Q;
    public float R;
    public boolean S;
    public float T;
    public final View U;
    public long V;
    public boolean W;
    public boolean X;
    public final boolean Y;
    public bh Z;
    public int a;
    public long a0;
    public int b;
    public View b0;
    public int c;
    public boolean c0;
    public float d;
    public final org.telegram.ui.Components.sq d0;
    public final Paint e;
    public final int[] e0;
    public final TextPaint f;
    public final int f0;
    public final int g0;
    public final TextPaint h;
    public final int h0;
    public final long i0;
    public final long j0;
    public final org.telegram.ui.ActionBar.h6 k0;
    public org.telegram.ui.Components.p5 l0;
    public qg.b m0;
    public final Paint n;
    public int n0;
    public int o0;
    public final Path r;
    public StaticLayout s;
    public StaticLayout w;
    public StaticLayout x;
    public int y;

    public yo(int i7, View view, long j3, int i10, int i11, long j10, org.telegram.ui.ActionBar.h6 h6Var) {
        Paint paint = new Paint(1);
        this.e = paint;
        TextPaint textPaint = new TextPaint(1);
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.h = textPaint2;
        Paint paint2 = new Paint(1);
        this.n = paint2;
        this.r = new Path();
        this.J = 0L;
        this.c0 = true;
        org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(null, true, null);
        this.d0 = sqVar;
        this.e0 = new int[3];
        this.U = view;
        this.f0 = i7;
        this.j0 = j3;
        this.g0 = i10;
        this.h0 = i11;
        this.i0 = j10;
        this.Y = org.telegram.messenger.np.u1(i7).y2(j3);
        this.k0 = h6Var;
        this.G = new ImageReceiver(view);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(2.8f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        sqVar.z = 3;
        sqVar.I = 1;
        sqVar.g = true;
        sqVar.d = d("paintChatActionBackground");
        sqVar.e = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static TLRPC.Dialog c(long j3, int i7, int i10, boolean z10, int[] iArr) {
        ArrayList Y0;
        TLRPC.Dialog c10;
        TLRPC.Dialog c11;
        org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(org.telegram.messenger.c.a(org.telegram.messenger.k10.t0).a);
        SparseArray sparseArray = u12.w;
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i7;
            iArr[2] = i10;
        }
        if (i10 != 0) {
            org.telegram.messenger.so soVar = (org.telegram.messenger.so) u12.T0.get(i10);
            if (soVar == null) {
                return null;
            }
            Y0 = soVar.k;
        } else {
            Y0 = u12.Y0(i7);
        }
        if (Y0 == null) {
            return null;
        }
        for (int i11 = 0; i11 < Y0.size(); i11++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) Y0.get(i11);
            TLRPC.Chat O0 = u12.O0(Long.valueOf(-dialog.id));
            if (O0 != null && dialog.id != j3 && dialog.unread_count > 0 && org.telegram.messenger.n5.y(dialog) && !O0.megagroup && !u12.I2(dialog.id, false) && u12.H1(O0.restriction_reason) == null) {
                return dialog;
            }
        }
        if (!z10) {
            return null;
        }
        if (i10 != 0) {
            for (int i12 = 0; i12 < u12.Q0.size(); i12++) {
                int i13 = ((org.telegram.messenger.so) u12.Q0.get(i12)).a;
                if (i10 != i13 && (c11 = c(j3, i7, i13, false, iArr)) != null) {
                    if (iArr != null) {
                        iArr[0] = 1;
                    }
                    return c11;
                }
            }
        }
        for (int i14 = 0; i14 < sparseArray.size(); i14++) {
            int keyAt = sparseArray.keyAt(i14);
            if (i7 != keyAt && (c10 = c(j3, keyAt, 0, false, iArr)) != null) {
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
    public final void a(Canvas canvas, bj bjVar, float f10, float f11) {
        float f12;
        TextPaint textPaint;
        Paint paint;
        int alpha;
        int alpha2;
        int i7;
        int i10;
        TextPaint textPaint2;
        RectF rectF;
        int i11;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        int i12;
        org.telegram.ui.Components.sq sqVar;
        float f19;
        float f20;
        float f21;
        int i13;
        float f22;
        int i14;
        TextPaint textPaint3;
        float f23;
        Paint paint2;
        org.telegram.ui.Components.p5 p5Var;
        ImageReceiver imageReceiver;
        float f24;
        float f25;
        RectF rectF2;
        float z10;
        int w02;
        TLRPC.TL_forumTopic tL_forumTopic;
        int w03;
        Canvas canvas2 = canvas;
        org.telegram.ui.ActionBar.h6 h6Var = this.k0;
        if (this.b0 != bjVar) {
            this.b0 = bjVar;
            org.telegram.ui.Components.p5 p5Var2 = this.l0;
            if (p5Var2 != null) {
                p5Var2.a(bjVar);
            }
        }
        org.telegram.ui.Components.sq sqVar2 = this.d0;
        sqVar2.H = bjVar;
        RectF rectF3 = sqVar2.f;
        float L = org.telegram.messenger.g0.L(110.0f) * f10;
        if (L < org.telegram.messenger.g0.L(8.0f)) {
            return;
        }
        float f26 = f10 < 0.2f ? 5.0f * f10 * f11 : f11;
        org.telegram.ui.ActionBar.m6.r(0.0f, bjVar.getMeasuredHeight() - L, this.c, bjVar.getMeasuredHeight());
        try {
            if (this.m0 != null && (tL_forumTopic = this.I) != null && tL_forumTopic.id == 1 && (w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.rd, h6Var)) != this.n0) {
                this.n0 = w03;
                this.m0.a(w03);
            }
            if (this.l0 == null || (w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zc, h6Var)) == this.o0) {
                f12 = 0.2f;
            } else {
                this.o0 = w02;
                f12 = 0.2f;
                try {
                    this.l0.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                } catch (Exception e10) {
                    e = e10;
                    org.telegram.messenger.a8.g(e, true);
                    int w04 = org.telegram.ui.ActionBar.m6.w0(!org.telegram.ui.ActionBar.m6.i1(h6Var) ? org.telegram.ui.ActionBar.m6.Ia : org.telegram.ui.ActionBar.m6.Zc, h6Var);
                    textPaint = this.f;
                    textPaint.setColor(w04);
                    paint = this.e;
                    paint.setColor(w04);
                    this.h.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Me, h6Var));
                    alpha = d("paintChatActionBackground").getAlpha();
                    alpha2 = org.telegram.ui.ActionBar.m6.h2.getAlpha();
                    int alpha3 = textPaint.getAlpha();
                    int alpha4 = paint.getAlpha();
                    org.telegram.ui.ActionBar.m6.h2.setAlpha((int) (alpha2 * f26));
                    int i15 = (int) (alpha * f26);
                    d("paintChatActionBackground").setAlpha(i15);
                    i7 = (int) (alpha3 * f26);
                    textPaint.setAlpha(i7);
                    if (f10 >= 1.0f) {
                    }
                    i10 = i7;
                    textPaint2 = textPaint;
                    rectF = rectF3;
                    i11 = alpha2;
                    if (f10 != 1.0f) {
                    }
                    if (f10 != 1.0f) {
                        this.N = false;
                        e(bjVar, false);
                    }
                    f13 = this.c / 2.0f;
                    f14 = this.M * (-org.telegram.messenger.g0.L(4.0f));
                    if (!this.S) {
                    }
                    float f27 = f15 / 2.0f;
                    float max = Math.max(0.0f, Math.min(this.d, (f27 - (org.telegram.messenger.g0.L(16.0f) * f10)) - org.telegram.messenger.g0.L(4.0f)));
                    float max2 = (1.0f - this.L) * ((Math.max(0.0f, Math.min(this.d * f10, f27 - (org.telegram.messenger.g0.L(8.0f) * f10))) * 2.0f) - org.telegram.messenger.g0.M(16.0f));
                    float L2 = org.telegram.messenger.g0.L(56.0f);
                    f16 = this.L;
                    float f28 = max2 + (L2 * f16);
                    if (f16 >= 1.0f) {
                    }
                    float f29 = -f15;
                    float f30 = f15;
                    float L3 = (this.L * (org.telegram.messenger.g0.L(56.0f) + f29)) + ((1.0f - this.L) * (-org.telegram.messenger.g0.L(8.0f)));
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    TextPaint textPaint4 = textPaint2;
                    rectF4.set(f13 - max, f29, f13 + max, L3);
                    if (this.L > 0.0f) {
                    }
                    f17 = 1.0f;
                    if (this.X) {
                    }
                    float z11 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, org.telegram.messenger.g0.L(8.0f), f18 + org.telegram.messenger.g0.L(24.0f)) - (org.telegram.messenger.g0.L(36.0f) * this.L);
                    canvas2.save();
                    rectF4.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
                    canvas2.clipRect(rectF4);
                    f21 = this.L;
                    if (f21 > 0.0f) {
                    }
                    canvas2.save();
                    float L4 = (org.telegram.messenger.g0.L(24.0f) * f10) / org.telegram.messenger.g0.N(24.0f);
                    canvas2.scale(L4, L4, f13, z11 - org.telegram.messenger.g0.L(20.0f));
                    canvas2.translate(f13 - org.telegram.messenger.g0.M(12.0f), z11 - org.telegram.messenger.g0.L(12.0f));
                    i13 = i10;
                    f22 = f14;
                    i14 = alpha;
                    textPaint3 = textPaint4;
                    f23 = f30;
                    canvas2.drawLine(org.telegram.messenger.g0.N(12.5f), org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(12.5f), org.telegram.messenger.g0.N(22.0f), paint);
                    canvas.drawLine(org.telegram.messenger.g0.N(3.5f), org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.5f), org.telegram.messenger.g0.N(3.5f), paint);
                    canvas2 = canvas;
                    canvas2.drawLine(org.telegram.messenger.g0.N(21.5f), org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.5f), org.telegram.messenger.g0.N(3.5f), paint);
                    canvas2.restore();
                    if (this.S) {
                    }
                    canvas2.restore();
                    if (this.s != null) {
                        d("paintChatActionBackground").setAlpha(i12);
                        textPaint3.setAlpha(i13);
                        float L5 = (((1.0f - this.L) * org.telegram.messenger.g0.L(20.0f)) - (org.telegram.messenger.g0.L(36.0f) * this.L)) + f22;
                        RectF rectF5 = org.telegram.messenger.g0.P;
                        float f31 = (r4 - this.y) / 2.0f;
                        rectF5.set(f31, L5, this.c - f31, this.s.getHeight() + L5);
                        rectF5.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(4.0f));
                        canvas2.drawRoundRect(rectF5, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), d("paintChatActionBackground"));
                        if (h6Var == null ? h6Var.j() : org.telegram.ui.ActionBar.m6.d1()) {
                        }
                        canvas2.save();
                        canvas2.translate((this.c - this.y) / 2.0f, L5);
                        this.s.draw(canvas2);
                        canvas2.restore();
                    }
                    if (!this.S) {
                        float e11 = p5.c.e((-f23) + org.telegram.messenger.g0.L(4.0f), this.L, (1.0f - this.L) * (((-org.telegram.messenger.g0.L(8.0f)) - (org.telegram.messenger.g0.M(8.0f) * f10)) - f19), f22);
                        p5Var = this.l0;
                        if (p5Var != null) {
                        }
                        ImageReceiver imageReceiver2 = this.G;
                        imageReceiver = imageReceiver2;
                        imageReceiver.setAlpha(f20);
                        float f32 = f19 / 2.0f;
                        imageReceiver.J0((int) f32);
                        float f33 = f19;
                        imageReceiver.y0(f13 - f32, e11, f33, f33);
                        if (this.Y) {
                            ((org.telegram.ui.Components.w70) ((org.telegram.ui.Components.oq) imageReceiver.t()).b).i = f10;
                        }
                        if (this.L > 0.0f) {
                        }
                        imageReceiver.h(canvas2, null);
                        imageReceiver.setAlpha(1.0f);
                    }
                    d("paintChatActionBackground").setAlpha(i14);
                    org.telegram.ui.ActionBar.m6.h2.setAlpha(i11);
                    textPaint3.setAlpha(alpha3);
                    paint2.setAlpha(alpha4);
                }
            }
        } catch (Exception e12) {
            e = e12;
            f12 = 0.2f;
        }
        int w042 = org.telegram.ui.ActionBar.m6.w0(!org.telegram.ui.ActionBar.m6.i1(h6Var) ? org.telegram.ui.ActionBar.m6.Ia : org.telegram.ui.ActionBar.m6.Zc, h6Var);
        textPaint = this.f;
        textPaint.setColor(w042);
        paint = this.e;
        paint.setColor(w042);
        this.h.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Me, h6Var));
        alpha = d("paintChatActionBackground").getAlpha();
        alpha2 = org.telegram.ui.ActionBar.m6.h2.getAlpha();
        int alpha32 = textPaint.getAlpha();
        int alpha42 = paint.getAlpha();
        org.telegram.ui.ActionBar.m6.h2.setAlpha((int) (alpha2 * f26));
        int i152 = (int) (alpha * f26);
        d("paintChatActionBackground").setAlpha(i152);
        i7 = (int) (alpha32 * f26);
        textPaint.setAlpha(i7);
        if ((f10 >= 1.0f || this.R >= 1.0f) && (f10 >= 1.0f || this.R != 1.0f)) {
            i10 = i7;
            textPaint2 = textPaint;
            rectF = rectF3;
            i11 = alpha2;
        } else {
            i10 = i7;
            textPaint2 = textPaint;
            long currentTimeMillis = System.currentTimeMillis();
            rectF = rectF3;
            i11 = alpha2;
            if (currentTimeMillis - this.Q > 100) {
                try {
                    bjVar.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                this.Q = currentTimeMillis;
            }
            this.R = f10;
        }
        if (f10 != 1.0f && !this.N) {
            this.N = true;
            this.O = true;
            e(bjVar, true);
            this.V = System.currentTimeMillis();
        } else if (f10 != 1.0f && this.N) {
            this.N = false;
            e(bjVar, false);
        }
        f13 = this.c / 2.0f;
        f14 = this.M * (-org.telegram.messenger.g0.L(4.0f));
        f15 = !this.S ? L - f14 : L;
        float f272 = f15 / 2.0f;
        float max3 = Math.max(0.0f, Math.min(this.d, (f272 - (org.telegram.messenger.g0.L(16.0f) * f10)) - org.telegram.messenger.g0.L(4.0f)));
        float max22 = (1.0f - this.L) * ((Math.max(0.0f, Math.min(this.d * f10, f272 - (org.telegram.messenger.g0.L(8.0f) * f10))) * 2.0f) - org.telegram.messenger.g0.M(16.0f));
        float L22 = org.telegram.messenger.g0.L(56.0f);
        f16 = this.L;
        float f282 = max22 + (L22 * f16);
        if (f16 >= 1.0f || this.S) {
            float f292 = -f15;
            float f302 = f15;
            float L32 = (this.L * (org.telegram.messenger.g0.L(56.0f) + f292)) + ((1.0f - this.L) * (-org.telegram.messenger.g0.L(8.0f)));
            RectF rectF42 = org.telegram.messenger.g0.P;
            TextPaint textPaint42 = textPaint2;
            rectF42.set(f13 - max3, f292, f13 + max3, L32);
            if (this.L > 0.0f || this.S) {
                f17 = 1.0f;
            } else {
                float L6 = org.telegram.messenger.g0.L(16.0f) * this.L;
                rectF42.inset(L6, L6);
                f17 = 1.0f - this.L;
            }
            if (this.X) {
                f18 = f292;
                i12 = i152;
                sqVar = sqVar2;
                f19 = f282;
                f20 = f26;
                int alpha5 = d("paintChatActionBackground").getAlpha();
                d("paintChatActionBackground").setAlpha((int) (alpha5 * f17));
                float f34 = this.d;
                canvas2.drawRoundRect(rectF42, f34, f34, d("paintChatActionBackground"));
                d("paintChatActionBackground").setAlpha(alpha5);
                if (h6Var != null ? h6Var.j() : org.telegram.ui.ActionBar.m6.d1()) {
                    int alpha6 = org.telegram.ui.ActionBar.m6.h2.getAlpha();
                    org.telegram.ui.ActionBar.m6.h2.setAlpha((int) (alpha6 * f17));
                    float f35 = this.d;
                    canvas2.drawRoundRect(rectF42, f35, f35, org.telegram.ui.ActionBar.m6.h2);
                    org.telegram.ui.ActionBar.m6.h2.setAlpha(alpha6);
                }
            } else {
                Path path = this.r;
                path.reset();
                float width = rectF42.width() * f12;
                float width2 = rectF42.width() * 0.1f;
                float width3 = rectF42.width() * 0.03f;
                f18 = f292;
                float f36 = width2 / 2.0f;
                float height = rectF42.height() - width2;
                sqVar = sqVar2;
                f19 = f282;
                path.moveTo(rectF42.right, rectF42.top + width + width2);
                float f37 = -width;
                path.rQuadTo(0.0f, f37, f37, f37);
                float f38 = width * 2.0f;
                float f39 = f36 * 2.0f;
                f20 = f26;
                path.rLineTo((((-(rectF42.width() - f38)) / 2.0f) + f39) - width3, 0.0f);
                float f40 = -f36;
                float f41 = f40 / 2.0f;
                float f42 = f40 * 2.0f;
                i12 = i152;
                float f43 = (-width2) / 2.0f;
                path.rQuadTo(f41, 0.0f, f42, f43);
                path.rQuadTo(f41, f43, f42, f43);
                path.rLineTo(((-(rectF42.width() - f38)) / 2.0f) + f39 + width3, 0.0f);
                path.rQuadTo(f37, 0.0f, f37, width);
                path.rLineTo(0.0f, (height + width2) - f38);
                path.rQuadTo(0.0f, width, width, width);
                path.rLineTo(rectF42.width() - f38, 0.0f);
                path.rQuadTo(width, 0.0f, width, f37);
                path.rLineTo(0.0f, -(height - f38));
                path.close();
                canvas2.drawPath(path, d("paintChatActionBackground"));
                if (h6Var != null ? h6Var.j() : org.telegram.ui.ActionBar.m6.d1()) {
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.m6.h2);
                }
            }
            float z112 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, org.telegram.messenger.g0.L(8.0f), f18 + org.telegram.messenger.g0.L(24.0f)) - (org.telegram.messenger.g0.L(36.0f) * this.L);
            canvas2.save();
            rectF42.inset(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
            canvas2.clipRect(rectF42);
            f21 = this.L;
            if (f21 > 0.0f) {
                paint.setAlpha((int) ((1.0f - f21) * 255.0f));
            }
            canvas2.save();
            float L42 = (org.telegram.messenger.g0.L(24.0f) * f10) / org.telegram.messenger.g0.N(24.0f);
            canvas2.scale(L42, L42, f13, z112 - org.telegram.messenger.g0.L(20.0f));
            canvas2.translate(f13 - org.telegram.messenger.g0.M(12.0f), z112 - org.telegram.messenger.g0.L(12.0f));
            i13 = i10;
            f22 = f14;
            i14 = alpha;
            textPaint3 = textPaint42;
            f23 = f302;
            canvas2.drawLine(org.telegram.messenger.g0.N(12.5f), org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(12.5f), org.telegram.messenger.g0.N(22.0f), paint);
            canvas.drawLine(org.telegram.messenger.g0.N(3.5f), org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.5f), org.telegram.messenger.g0.N(3.5f), paint);
            canvas2 = canvas;
            canvas2.drawLine(org.telegram.messenger.g0.N(21.5f), org.telegram.messenger.g0.N(12.0f), org.telegram.messenger.g0.N(12.5f), org.telegram.messenger.g0.N(3.5f), paint);
            canvas2.restore();
            if (this.S) {
                paint2 = paint;
            } else {
                float e13 = p5.c.e(f18 - org.telegram.messenger.g0.L(2.0f), this.L, (1.0f - this.L) * (((-org.telegram.messenger.g0.L(8.0f)) - (org.telegram.messenger.g0.M(8.0f) * f10)) - f19), f22);
                paint.setAlpha(alpha42);
                canvas2.save();
                canvas2.scale(f10, f10, f13, org.telegram.messenger.g0.L(28.0f) + e13);
                float L7 = e13 + org.telegram.messenger.g0.L(28.0f);
                if (this.O) {
                    float f44 = this.P;
                    if (f44 < 1.0f) {
                        float f45 = f44 + 0.07272727f;
                        this.P = f45;
                        if (f45 > 1.0f) {
                            this.P = 1.0f;
                        }
                    }
                    float f46 = this.P;
                    float f47 = f46 > 0.5f ? 1.0f : f46 / 0.5f;
                    float f48 = f46 < 0.5f ? 0.0f : (f46 - 0.5f) / 0.5f;
                    canvas2.save();
                    canvas2.clipRect(rectF42);
                    canvas2.translate(f13 - org.telegram.messenger.g0.L(24.0f), L7 - org.telegram.messenger.g0.L(24.0f));
                    float L8 = org.telegram.messenger.g0.L(16.0f);
                    float L9 = org.telegram.messenger.g0.L(26.0f);
                    float L10 = org.telegram.messenger.g0.L(22.0f);
                    float L11 = org.telegram.messenger.g0.L(32.0f);
                    float L12 = org.telegram.messenger.g0.L(32.0f);
                    float L13 = org.telegram.messenger.g0.L(20.0f);
                    float f49 = 1.0f - f47;
                    canvas.drawLine(L8, L9, (L10 * f47) + (L8 * f49), (f47 * L11) + (f49 * L9), paint);
                    if (f48 > 0.0f) {
                        float f50 = 1.0f - f48;
                        float f51 = (L12 * f48) + (L10 * f50);
                        float f52 = (L13 * f48) + (f50 * L11);
                        canvas2 = canvas;
                        canvas2.drawLine(L10, L11, f51, f52, paint);
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
            i12 = i152;
            sqVar = sqVar2;
            f19 = f282;
            f20 = f26;
            textPaint3 = textPaint2;
            i13 = i10;
            f22 = f14;
            f23 = f15;
            i14 = alpha;
            paint2 = paint;
        }
        if (this.s != null && this.L > 0.0f) {
            d("paintChatActionBackground").setAlpha(i12);
            textPaint3.setAlpha(i13);
            float L52 = (((1.0f - this.L) * org.telegram.messenger.g0.L(20.0f)) - (org.telegram.messenger.g0.L(36.0f) * this.L)) + f22;
            RectF rectF52 = org.telegram.messenger.g0.P;
            float f312 = (r4 - this.y) / 2.0f;
            rectF52.set(f312, L52, this.c - f312, this.s.getHeight() + L52);
            rectF52.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(4.0f));
            canvas2.drawRoundRect(rectF52, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), d("paintChatActionBackground"));
            if (h6Var == null ? h6Var.j() : org.telegram.ui.ActionBar.m6.d1()) {
                canvas2.drawRoundRect(rectF52, org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(15.0f), org.telegram.ui.ActionBar.m6.h2);
            }
            canvas2.save();
            canvas2.translate((this.c - this.y) / 2.0f, L52);
            this.s.draw(canvas2);
            canvas2.restore();
        }
        if (!this.S && f19 > 0.0f) {
            float e112 = p5.c.e((-f23) + org.telegram.messenger.g0.L(4.0f), this.L, (1.0f - this.L) * (((-org.telegram.messenger.g0.L(8.0f)) - (org.telegram.messenger.g0.M(8.0f) * f10)) - f19), f22);
            p5Var = this.l0;
            if (p5Var != null || (imageReceiver2 = p5Var.k) == null) {
                ImageReceiver imageReceiver22 = this.G;
            }
            imageReceiver = imageReceiver22;
            imageReceiver.setAlpha(f20);
            float f322 = f19 / 2.0f;
            imageReceiver.J0((int) f322);
            float f332 = f19;
            imageReceiver.y0(f13 - f322, e112, f332, f332);
            if (this.Y && imageReceiver.t() != null && (imageReceiver.t() instanceof org.telegram.ui.Components.oq) && (((org.telegram.ui.Components.oq) imageReceiver.t()).b instanceof org.telegram.ui.Components.w70)) {
                ((org.telegram.ui.Components.w70) ((org.telegram.ui.Components.oq) imageReceiver.t()).b).i = f10;
            }
            if (this.L > 0.0f || !this.c0) {
                imageReceiver.h(canvas2, null);
            } else {
                float f53 = imageReceiver.L0;
                float f54 = imageReceiver.M0;
                canvas2.saveLayerAlpha(f53, f54, imageReceiver.N0 + f53, imageReceiver.O0 + f54, org.telegram.messenger.ls.e4, 31);
                imageReceiver.h(canvas2, null);
                float f55 = this.L;
                org.telegram.ui.Components.sq sqVar3 = sqVar;
                sqVar3.e(sqVar3.s);
                canvas2.scale(f55, f55, (sqVar3.s / 2.0f) + sqVar3.A + org.telegram.messenger.g0.L(12.0f) + f13, (e112 - org.telegram.messenger.g0.L(6.0f)) + org.telegram.messenger.g0.L(14.0f));
                canvas2.translate(org.telegram.messenger.g0.L(12.0f) + f13, e112 - org.telegram.messenger.g0.L(6.0f));
                float f56 = sqVar3.C;
                float f57 = sqVar3.l;
                if (f57 != 1.0f) {
                    int i16 = sqVar3.c;
                    f24 = 6.0f;
                    if (i16 == 0 || i16 == 1) {
                        f25 = 14.0f;
                        rectF2 = rectF;
                        sqVar3.e(sqVar3.s);
                        float L14 = (sqVar3.x - org.telegram.messenger.g0.L(f56 * 2.0f)) / 2.0f;
                        float f58 = sqVar3.B;
                        rectF2.set(f58, L14, sqVar3.s + f58 + org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(23.0f) + L14);
                    } else {
                        float f59 = f57 * 2.0f;
                        if (f59 > 1.0f) {
                            f59 = 1.0f;
                        }
                        float L15 = (sqVar3.x - org.telegram.messenger.g0.L(f56 * 2.0f)) / 2.0f;
                        int i17 = sqVar3.s;
                        int i18 = sqVar3.r;
                        if (i17 == i18) {
                            z10 = i17;
                            f25 = 14.0f;
                        } else {
                            f25 = 14.0f;
                            z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f59, i18, i17 * f59);
                        }
                        sqVar3.e(z10);
                        float f60 = sqVar3.B;
                        rectF2 = rectF;
                        rectF2.set(f60, L15, z10 + f60 + org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(23.0f) + L15);
                    }
                } else {
                    f24 = 6.0f;
                    f25 = 14.0f;
                    rectF2 = rectF;
                    sqVar3.e(sqVar3.s);
                    float L16 = (sqVar3.x - org.telegram.messenger.g0.L(f56 * 2.0f)) / 2.0f;
                    float f61 = sqVar3.B;
                    rectF2.set(f61, L16, sqVar3.s + f61 + org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(23.0f) + L16);
                }
                rectF2.inset(-org.telegram.messenger.g0.L(2.0f), -org.telegram.messenger.g0.L(2.0f));
                canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, rectF2.height() / 2.0f, this.n);
                canvas2.restore();
                canvas2.save();
                float f62 = this.L;
                sqVar3.e(sqVar3.s);
                canvas2.scale(f62, f62, (sqVar3.s / 2.0f) + sqVar3.A + org.telegram.messenger.g0.L(12.0f) + f13, (e112 - org.telegram.messenger.g0.L(f24)) + org.telegram.messenger.g0.L(f25));
                canvas2.translate(f13 + org.telegram.messenger.g0.L(12.0f), e112 - org.telegram.messenger.g0.L(f24));
                sqVar3.a(canvas2);
                canvas2.restore();
            }
            imageReceiver.setAlpha(1.0f);
        }
        d("paintChatActionBackground").setAlpha(i14);
        org.telegram.ui.ActionBar.m6.h2.setAlpha(i11);
        textPaint3.setAlpha(alpha32);
        paint2.setAlpha(alpha42);
    }

    public final void b(Canvas canvas, int i7, int i10) {
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ol, this.k0);
        TextPaint textPaint = this.h;
        textPaint.setColor(w02);
        Paint d = d("paintChatComposeBackground");
        int alpha = d.getAlpha();
        int alpha2 = textPaint.getAlpha();
        d.setAlpha((int) (alpha * this.T));
        if (this.w != null) {
            float f10 = this.L;
            if (f10 < 1.0f) {
                textPaint.setAlpha((int) ((1.0f - f10) * alpha2 * this.T));
                float height = ((((i10 - i7) - this.w.getHeight()) / 2.0f) + i7) - (org.telegram.messenger.g0.L(10.0f) * this.L);
                canvas.save();
                canvas.translate((this.c - this.E) / 2.0f, height);
                this.w.draw(canvas);
                canvas.restore();
            }
        }
        if (this.x != null) {
            float f11 = this.L;
            if (f11 > 0.0f) {
                textPaint.setAlpha((int) (alpha2 * f11 * this.T));
                float L = ((1.0f - this.L) * org.telegram.messenger.g0.L(10.0f)) + (((i10 - i7) - this.x.getHeight()) / 2.0f) + i7;
                canvas.save();
                canvas.translate((this.c - this.F) / 2.0f, L);
                this.x.draw(canvas);
                canvas.restore();
            }
        }
        textPaint.setAlpha(alpha2);
        d.setAlpha(alpha);
    }

    public final Paint d(String str) {
        org.telegram.ui.ActionBar.h6 h6Var = this.k0;
        Paint g10 = h6Var != null ? h6Var.g(str) : null;
        return g10 != null ? g10 : org.telegram.ui.ActionBar.m6.V0(str);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.Dialog dialog;
        if (this.a0 == 0 || (dialog = (TLRPC.Dialog) org.telegram.messenger.np.u1(this.f0).R.f(this.a0)) == null) {
            return;
        }
        int i11 = dialog.unread_count;
        this.d0.c(i11, true);
        this.c0 = i11 > 0;
        View view = this.b0;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void e(final View view, boolean z10) {
        AnimatorSet animatorSet = this.K;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.K.cancel();
        }
        final int i7 = 1;
        final int i10 = 0;
        final int i11 = 2;
        if (!z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.L, 0.0f);
            final int i12 = 4;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.wo
                public final /* synthetic */ yo b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i12) {
                        case 0:
                            yo yoVar = this.b;
                            yoVar.getClass();
                            yoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            yoVar.U.invalidate();
                            break;
                        case 1:
                            yo yoVar2 = this.b;
                            yoVar2.getClass();
                            yoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        case 2:
                            yo yoVar3 = this.b;
                            yoVar3.getClass();
                            yoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        case 3:
                            yo yoVar4 = this.b;
                            yoVar4.getClass();
                            yoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            view.invalidate();
                            break;
                        default:
                            yo yoVar5 = this.b;
                            yoVar5.getClass();
                            yoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            yoVar5.U.invalidate();
                            view.invalidate();
                            break;
                    }
                }
            });
            ofFloat.setInterpolator(org.telegram.ui.Components.nr.f);
            ofFloat.setDuration(220L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.K = animatorSet2;
            animatorSet2.playTogether(ofFloat);
            this.K.start();
            return;
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.L, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.wo
            public final /* synthetic */ yo b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        yo yoVar = this.b;
                        yoVar.getClass();
                        yoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        yoVar.U.invalidate();
                        break;
                    case 1:
                        yo yoVar2 = this.b;
                        yoVar2.getClass();
                        yoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        yo yoVar3 = this.b;
                        yoVar3.getClass();
                        yoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        yo yoVar4 = this.b;
                        yoVar4.getClass();
                        yoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        yo yoVar5 = this.b;
                        yoVar5.getClass();
                        yoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        yoVar5.U.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat2.setInterpolator(org.telegram.ui.Components.nr.h);
        ofFloat2.setDuration(250L);
        this.M = 0.0f;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.wo
            public final /* synthetic */ yo b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i7) {
                    case 0:
                        yo yoVar = this.b;
                        yoVar.getClass();
                        yoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        yoVar.U.invalidate();
                        break;
                    case 1:
                        yo yoVar2 = this.b;
                        yoVar2.getClass();
                        yoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        yo yoVar3 = this.b;
                        yoVar3.getClass();
                        yoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        yo yoVar4 = this.b;
                        yoVar4.getClass();
                        yoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        yo yoVar5 = this.b;
                        yoVar5.getClass();
                        yoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        yoVar5.U.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.j;
        ofFloat3.setInterpolator(nrVar);
        ofFloat3.setDuration(180L);
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, -0.5f);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.wo
            public final /* synthetic */ yo b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        yo yoVar = this.b;
                        yoVar.getClass();
                        yoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        yoVar.U.invalidate();
                        break;
                    case 1:
                        yo yoVar2 = this.b;
                        yoVar2.getClass();
                        yoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        yo yoVar3 = this.b;
                        yoVar3.getClass();
                        yoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        yo yoVar4 = this.b;
                        yoVar4.getClass();
                        yoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        yo yoVar5 = this.b;
                        yoVar5.getClass();
                        yoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        yoVar5.U.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat4.setInterpolator(nrVar);
        ofFloat4.setDuration(120L);
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(-0.5f, 0.0f);
        final int i13 = 3;
        ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.wo
            public final /* synthetic */ yo b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        yo yoVar = this.b;
                        yoVar.getClass();
                        yoVar.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        yoVar.U.invalidate();
                        break;
                    case 1:
                        yo yoVar2 = this.b;
                        yoVar2.getClass();
                        yoVar2.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 2:
                        yo yoVar3 = this.b;
                        yoVar3.getClass();
                        yoVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    case 3:
                        yo yoVar4 = this.b;
                        yoVar4.getClass();
                        yoVar4.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        view.invalidate();
                        break;
                    default:
                        yo yoVar5 = this.b;
                        yoVar5.getClass();
                        yoVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        yoVar5.U.invalidate();
                        view.invalidate();
                        break;
                }
            }
        });
        ofFloat5.setInterpolator(nrVar);
        ofFloat5.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.K = animatorSet3;
        animatorSet3.addListener(new ah.l(18, this, view));
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(ofFloat3, ofFloat4, ofFloat5);
        this.K.playTogether(ofFloat2, animatorSet4);
        this.K.start();
    }

    public final void f() {
        this.W = false;
        this.I = null;
        TLRPC.Dialog c10 = c(this.j0, this.g0, this.h0, true, this.e0);
        if (c10 == null) {
            this.H = null;
            this.X = false;
            this.S = true;
            return;
        }
        this.a0 = c10.id;
        int[] iArr = this.e0;
        this.X = iArr[0] == 1;
        this.a = iArr[1];
        this.b = iArr[2];
        this.S = false;
        int i7 = this.f0;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-c10.id));
        this.H = O0;
        if (O0 == null) {
            this.H = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(c10.id));
        }
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.q(this.H);
        this.G.q0(org.telegram.messenger.gc.a(1, this.H), "50_50", b9Var, null, org.telegram.messenger.k10.i(0).f(), 0);
        org.telegram.messenger.np.u1(i7).t0(c10.id, 0, null);
        int i10 = c10.unread_count;
        this.d0.c(i10, false);
        this.c0 = i10 > 0;
    }

    public final void g(TLRPC.Chat chat) {
        if (chat == null) {
            f();
            return;
        }
        this.a0 = -chat.id;
        int[] iArr = this.e0;
        this.X = iArr[0] == 1;
        this.a = iArr[1];
        this.b = iArr[2];
        this.S = false;
        this.H = chat;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        b9Var.q(this.H);
        this.G.q0(org.telegram.messenger.gc.a(1, this.H), "50_50", b9Var, null, org.telegram.messenger.k10.i(0).f(), 0);
        int i7 = this.f0;
        org.telegram.messenger.np.u1(i7).t0(-chat.id, 0, null);
        TLRPC.Dialog U0 = org.telegram.messenger.np.u1(i7).U0(-chat.id);
        int i10 = U0 == null ? 0 : U0.unread_count;
        this.d0.c(i10, false);
        this.c0 = i10 > 0;
        this.W = true;
        this.I = null;
    }

    public final void h() {
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.Components.p5 p5Var;
        View view;
        View view2;
        org.telegram.ui.Components.p5 p5Var2;
        TLRPC.Message message;
        TLRPC.Message message2;
        this.W = false;
        this.X = false;
        this.H = null;
        this.a0 = 0L;
        ImageReceiver imageReceiver = this.G;
        imageReceiver.f();
        long j3 = -this.j0;
        int i7 = this.f0;
        ArrayList l10 = org.telegram.messenger.np.u1(i7).t7.l(j3);
        if (l10 == null || l10.size() <= 1) {
            tL_forumTopic = null;
        } else {
            tL_forumTopic = null;
            for (int i10 = 0; i10 < l10.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) l10.get(i10);
                if (tL_forumTopic2.id != this.i0 && !tL_forumTopic2.hidden && tL_forumTopic2.unread_count > 0 && (tL_forumTopic == null || ((message = tL_forumTopic2.topMessage) != null && (message2 = tL_forumTopic.topMessage) != null && message.date > message2.date))) {
                    tL_forumTopic = tL_forumTopic2;
                }
            }
        }
        if (tL_forumTopic == null) {
            this.I = null;
            this.S = true;
            return;
        }
        this.S = false;
        this.I = tL_forumTopic;
        int i11 = tL_forumTopic.id;
        org.telegram.ui.ActionBar.h6 h6Var = this.k0;
        if (i11 == 1) {
            View view3 = this.b0;
            if (view3 != null && (p5Var2 = this.l0) != null) {
                p5Var2.n(view3);
            }
            this.l0 = null;
            Context context = this.U.getContext();
            int i12 = org.telegram.ui.ActionBar.m6.rd;
            qg.b d = qg.c.d(context, 1.0f, org.telegram.ui.ActionBar.m6.w0(i12, h6Var), true);
            this.m0 = d != null ? d : null;
            this.n0 = org.telegram.ui.ActionBar.m6.w0(i12, h6Var);
            imageReceiver.w0(d);
        } else if (tL_forumTopic.icon_emoji_id != 0) {
            org.telegram.ui.Components.p5 p5Var3 = this.l0;
            if (p5Var3 == null || p5Var3.h() != tL_forumTopic.icon_emoji_id) {
                org.telegram.ui.Components.p5 p5Var4 = this.l0;
                if (p5Var4 != null && (view = this.b0) != null) {
                    p5Var4.n(view);
                }
                org.telegram.ui.Components.p5 p5Var5 = new org.telegram.ui.Components.p5(22, i7, tL_forumTopic.icon_emoji_id);
                this.l0 = p5Var5;
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zc, h6Var);
                this.o0 = w02;
                p5Var5.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Components.p5 p5Var6 = this.l0;
            if (p5Var6 != null && (view2 = this.b0) != null) {
                p5Var6.a(view2);
            }
            imageReceiver.w0(null);
        } else {
            View view4 = this.b0;
            if (view4 != null && (p5Var = this.l0) != null) {
                p5Var.n(view4);
            }
            this.l0 = null;
            imageReceiver.w0(qg.c.f(tL_forumTopic));
        }
        int i13 = tL_forumTopic.unread_count;
        this.d0.c(i13, false);
        this.c0 = i13 > 0;
    }
}
