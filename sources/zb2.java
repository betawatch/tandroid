// default package

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zb2 {
    public final wb2 a;
    public GradientDrawable b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public StaticLayout h;
    public StaticLayout i;
    public int j;
    public float k;
    public int l;
    public int m;
    public int n;
    public int o = 45;
    public LinearGradient p;
    public hh7 q;
    public int r;
    public va6 s;
    public Path t;
    public Paint u;
    public boolean v;
    public v41 w;
    public hf0 x;

    public zb2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0acf  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0bc7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0cf3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0e4d  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0e8b  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0f27  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0feb  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0f91  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0fdd  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x1043  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x1276  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x1314  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x1319  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x1379  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x1462  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x147e  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x13a5  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x1316  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0ce4  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x063d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, float f) {
        float f2;
        int L;
        int extraTextX;
        int i;
        int L2;
        int U1;
        int i2;
        int L3;
        float f3;
        int i3;
        int i4;
        ab9 ab9Var;
        byte b;
        boolean z;
        float f4;
        int i5;
        int i6;
        float f5;
        boolean z2;
        RectF rectF;
        int i7;
        byte b2;
        int i8;
        float f6;
        boolean z3;
        int i9;
        float f7;
        int i10;
        float f8;
        int i11;
        int i12;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        int i13;
        ImageReceiver imageReceiver;
        int i14;
        float f14;
        ImageReceiver imageReceiver2;
        dc2 dc2Var;
        int i15;
        RectF rectF2;
        int i16;
        nl nlVar;
        float f15;
        float f16;
        byte b3;
        float f17;
        float f18;
        float f19;
        float f20;
        RectF rectF3;
        float f21;
        Drawable drawable;
        Drawable mutate;
        float f22;
        boolean z4;
        va6 va6Var;
        float f23;
        byte b4;
        int L4;
        Drawable b22;
        boolean z5;
        int i17;
        byte b5;
        float f24;
        jx jxVar;
        r47 r47Var;
        ab9 ab9Var2;
        float f25;
        ImageReceiver imageReceiver3;
        int i18;
        float f26;
        int i19;
        float f27;
        float v;
        float f28;
        float f29;
        int i20;
        float f30;
        byte b6;
        jx jxVar2;
        float f31;
        float f32;
        float f33;
        float f34;
        float f35;
        int i21;
        Canvas canvas2 = canvas;
        wb2 wb2Var = this.a;
        RadialProgress2 radialProgress2 = wb2Var.Q0;
        ImageReceiver imageReceiver4 = wb2Var.V0;
        RectF rectF4 = wb2Var.M2;
        RectF rectF5 = wb2Var.c4;
        dc2 dc2Var2 = wb2Var.ub;
        nl nlVar2 = wb2Var.U0;
        if (wb2Var.Q5.q4() || wb2Var.Q5.F4() || wb2Var.R1 || wb2Var.T1 || wb2Var.U1) {
            int saveCount = canvas2.getSaveCount();
            float backgroundDrawableRight = ((wb2Var.getBackgroundDrawableRight() + (dc2Var2 != null ? dc2Var2.i0 : 0.0f)) - hl.L(10 + ((!wb2Var.Q5.O3() || wb2Var.C6 || wb2Var.K) ? 0 : 6))) - wb2Var.getExtraTextX();
            if (wb2Var.T1) {
                U1 = hl.L(14.0f) + wb2Var.gb;
                L2 = wb2Var.p0 - hl.L(10.0f);
            } else {
                if (wb2Var.U1) {
                    U1 = wb2Var.gb + hl.L(14.0f);
                    i2 = wb2Var.p0;
                    L3 = hl.L(1.0f);
                } else {
                    if (!wb2Var.Q5.q4()) {
                        if (wb2Var.Q5.O3()) {
                            i = wb2Var.getExtraTextX() + hl.L(12.0f) + wb2Var.N6;
                            f2 = 1.0f;
                            if (wb2Var.Q5.D == 19) {
                                i -= Math.max(0, (hl.L(14.0f) + (Math.max(wb2Var.X7, wb2Var.Z7) + i)) - hl.q.x);
                            }
                        } else {
                            f2 = 1.0f;
                            boolean z6 = wb2Var.C6;
                            int i22 = wb2Var.N6;
                            if (z6) {
                                L = hl.L(12.0f) + i22;
                                extraTextX = wb2Var.getExtraTextX();
                            } else {
                                L = hl.L(wb2Var.K ? 12.0f : 18.0f) + i22;
                                extraTextX = wb2Var.getExtraTextX();
                            }
                            i = L + extraTextX;
                        }
                        L2 = ((int) (i + dc2Var2.h0)) - hl.L(1.33f);
                        int i23 = wb2Var.q0;
                        U1 = dc2Var2.s2 ? hl.U1(dc2Var2.L1, dc2Var2.r2, i23) : i23;
                        f3 = L2;
                        i3 = (int) (backgroundDrawableRight - f3);
                        int i24 = wb2Var.W1;
                        if (dc2Var2 == null && dc2Var2.J1) {
                            i4 = L2;
                            i24 = hl.U1(dc2Var2.L1, dc2Var2.I1, i24);
                        } else {
                            i4 = L2;
                        }
                        int i25 = i24;
                        ab9Var = wb2Var.o8;
                        if (ab9Var == null) {
                            ab9Var = new ab9(wb2Var);
                            wb2Var.o8 = ab9Var;
                        }
                        aob.Y2.setColor(ab9Var.a(wb2Var.Q5, wb2Var.va, wb2Var.wa, wb2Var.cc, 3));
                        ab9 ab9Var3 = wb2Var.o8;
                        byte b7 = wb2Var.y2;
                        ab9Var3.r = (b7 != 23 || b7 == 24 || b7 == 28) ? 0.5f : f2;
                        boolean z7 = (wb2Var.Q5.q4() || wb2Var.x1) ? false : true;
                        boolean z8 = !(!z7 || !wb2Var.u2 || (b = wb2Var.y2) == 26 || b == 9 || b == 2 || b == 13 || b == 11 || b == 25 || b == 1 || b == 29 || b == 18 || b == 22) || ((b = wb2Var.y2) == 6 && this.j != 0);
                        boolean z9 = z7 && (!wb2Var.u2 || b == 9 || b == 2 || b == 11 || b == 25 || b == 13 || b == 1 || b == 29 || b == 18 || b == 22 || b == 32 || wb2Var.x1 || b == 26);
                        rb2 rb2Var = wb2Var.eb;
                        z = rb2Var == null && rb2Var.k1(wb2Var, 2);
                        if (!wb2Var.U1 || wb2Var.Q5.v3() || wb2Var.Q5.F4()) {
                            f4 = f;
                            i5 = i3;
                            i6 = U1;
                            f5 = f3;
                            z2 = z;
                            rectF = rectF4;
                            i7 = i4;
                            b2 = 1;
                            i8 = 0;
                            f6 = 10.0f;
                            z3 = false;
                        } else {
                            if (this.w == null) {
                                f31 = 2.0f;
                                this.w = new v41(wb2Var, 2.0f, 2.0f);
                            } else {
                                f31 = 2.0f;
                            }
                            canvas2.save();
                            float f36 = f31;
                            float a = this.w.a(0.01f);
                            canvas2.scale(a, a, (i3 / f36) + f3, ((i25 + (wb2Var.u2 ? hl.L(42.0f) : 0)) / f36) + U1);
                            RectF rectF6 = hl.P;
                            rectF6.set(f3, U1 - hl.L(6.0f), i4 + i3, U1 + i25 + (wb2Var.u2 ? hl.L(42.0f) : 0));
                            wb2Var.o8.o(z);
                            float floor = (float) Math.floor(xea.U0 / (wb2Var.Q5.q4() ? f36 : 3.0f));
                            ab9 ab9Var4 = wb2Var.o8;
                            if (z8) {
                                boolean z10 = dc2Var2.t1;
                                boolean z11 = wb2Var.x1;
                                if (z10) {
                                    f34 = dc2Var2.L1;
                                    if (!z11) {
                                        f34 = f2 - f34;
                                    }
                                } else {
                                    f34 = z11 ? f2 : 0.0f;
                                }
                                float f37 = f2 - f34;
                                f32 = floor;
                                float L5 = hl.L(18.0f) + nlVar2.O0;
                                StaticLayout staticLayout = wb2Var.g2;
                                if (staticLayout != null) {
                                    f35 = f37;
                                    i21 = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                                } else {
                                    f35 = f37;
                                    i21 = 0;
                                }
                                f33 = (L5 + i21) * f35;
                            } else {
                                f32 = floor;
                                f33 = 0.0f;
                            }
                            ab9Var4.j(f33);
                            i6 = U1;
                            f5 = f3;
                            z2 = z;
                            rectF = rectF4;
                            i7 = i4;
                            i5 = i3;
                            float f38 = f32;
                            f6 = 10.0f;
                            ab9Var4.c(f38, f32, f32, f, canvas, rectF6);
                            int i26 = wb2Var.o8.x;
                            hf0 hf0Var = this.x;
                            if (hf0Var == null) {
                                wb2Var.db = i26;
                                hf0 Y = aob.Y(i26, 0, 0);
                                this.x = Y;
                                Y.setCallback(wb2Var);
                                aob.D1(this.x, 3.0f, 6.0f, 6.0f, 3.0f);
                                this.x.setCallback(wb2Var);
                            } else if (wb2Var.db != i26) {
                                wb2Var.db = i26;
                                aob.F1(hf0Var, i26, true);
                            }
                            i8 = 0;
                            this.x.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                            this.x.draw(canvas);
                            wb2Var.o8.f(canvas, rectF6, f);
                            b2 = 1;
                            wb2Var.o8.g(f38, f38, f38, f, canvas, rectF6);
                            f4 = f;
                            canvas2 = canvas;
                            z3 = true;
                        }
                        if (wb2Var.O1 || !z7) {
                            i9 = i6;
                            f7 = 1.0f;
                            i10 = i9;
                        } else {
                            int L6 = i5 - hl.L(17.0f);
                            if (wb2Var.x1) {
                                nlVar2.L0 = ((i7 + i5) - nlVar2.N0) - hl.L(6.0f);
                                nlVar2.M0 = 0.0f;
                                i9 = i6;
                            } else {
                                nlVar2.L0 = (wb2Var.U1 ? -hl.L(6.3f) : hl.L(f6)) + i7;
                                i9 = i6;
                                nlVar2.M0 = i9;
                            }
                            if (dc2Var2 == null || !dc2Var2.t1) {
                                f30 = 2.0f;
                                if (!wb2Var.x1 && (b6 = wb2Var.M1) != 7 && b6 != b2) {
                                    nlVar2.l0(L6);
                                }
                            } else {
                                if (!wb2Var.x1 && wb2Var.M1 != b2) {
                                    nlVar2.l0((int) hl.R1(dc2Var2.p1, L6, dc2Var2.L1));
                                }
                                nlVar2.L0 = hl.R1(dc2Var2.r1, nlVar2.r(), dc2Var2.L1) - (nlVar2.N0 / 2.0f);
                                f30 = 2.0f;
                                nlVar2.M0 = hl.R1(dc2Var2.s1, nlVar2.s(), dc2Var2.L1) - (nlVar2.O0 / 2.0f);
                            }
                            if (!wb2Var.x1 && wb2Var.y1) {
                                int L7 = hl.L(48.0f);
                                float f39 = L7;
                                float f40 = f30;
                                int z12 = (int) bp1.z(nlVar2.N0, f39, f40, nlVar2.L0);
                                wb2Var.K3 = z12;
                                int z13 = (int) bp1.z(nlVar2.O0, f39, f40, nlVar2.M0);
                                wb2Var.L3 = z13;
                                radialProgress2.p(z12, z13, z12 + L7, z13 + L7);
                            }
                            if (wb2Var.Kb && MediaController.z().H(wb2Var.Q5) && (jxVar2 = MediaController.z().M0) != null && jxVar2.d && canvas2.isHardwareAccelerated()) {
                                wb2Var.wb = true;
                                wb2Var.R9 = true;
                            } else {
                                rb2 rb2Var2 = wb2Var.eb;
                                if (rb2Var2 == null || rb2Var2.J1() == null || !wb2Var.eb.J1().f(wb2Var)) {
                                    f7 = 1.0f;
                                    if (f4 != 1.0f) {
                                        nlVar2.setAlpha(f4);
                                        if (wb2Var.y()) {
                                            wb2Var.wb = nlVar2.g(canvas2);
                                        } else {
                                            wb2Var.wb = true;
                                        }
                                        if (wb2Var.Q5.t2()) {
                                            imageReceiver4.setAlpha(f4);
                                            wb2Var.N0(canvas2);
                                            imageReceiver4.setAlpha(1.0f);
                                        }
                                        nlVar2.setAlpha(1.0f);
                                    } else {
                                        if (wb2Var.y()) {
                                            wb2Var.wb = nlVar2.g(canvas2);
                                        } else {
                                            wb2Var.wb = true;
                                        }
                                        if (wb2Var.Q5.t2()) {
                                            wb2Var.N0(canvas2);
                                        }
                                    }
                                    i10 = (int) (nlVar2.O0 + hl.L(6.0f) + i9);
                                }
                            }
                            f7 = 1.0f;
                            i10 = (int) (nlVar2.O0 + hl.L(6.0f) + i9);
                        }
                        if (wb2Var.g2 == null) {
                            if (wb2Var.h2 != null) {
                                i10 += hl.L(f7);
                            }
                            int L8 = i10 - hl.L(f7);
                            int alpha = aob.Y2.getAlpha();
                            f8 = f7;
                            if (f4 != f7) {
                                aob.Y2.setAlpha((int) (alpha * f4));
                            }
                            canvas2.save();
                            if (Math.abs(wb2Var.d2) > f8) {
                                f29 = ((i5 - hl.L(wb2Var.U1 ? 0.0f : 20.0f)) - wb2Var.f2) - wb2Var.d2;
                            } else {
                                f29 = 0.0f;
                            }
                            float f41 = f5;
                            float L9 = f29 + (wb2Var.U1 ? i8 : hl.L(f6)) + f41;
                            i11 = L8;
                            canvas2.translate(L9, i10 - hl.L(f8));
                            npa.f(canvas2, wb2Var.g2);
                            canvas2.restore();
                            if (wb2Var.h2 != null) {
                                float L10 = L9 + wb2Var.e2 + hl.L(12.0f);
                                wb2Var.k2 = L10;
                                wb2Var.l2 = i10;
                                i20 = i10;
                                f5 = f41;
                                rectF5.set(L10 - hl.L(6.0f), wb2Var.l2 - hl.L(2.0f), wb2Var.k2 + wb2Var.i2 + hl.L(6.0f), wb2Var.l2 + wb2Var.j2 + hl.L(2.0f));
                                v41 v41Var = wb2Var.n2;
                                if (v41Var == null) {
                                    v41Var = new v41(wb2Var);
                                    wb2Var.n2 = v41Var;
                                }
                                float a2 = v41Var.a(0.1f);
                                int i27 = a2 != f8 ? 1 : i8;
                                if (i27 != 0) {
                                    canvas2.save();
                                    canvas2.scale(a2, a2, rectF5.centerX(), rectF5.centerY());
                                }
                                aob.M2.setColor(aob.Y2.getColor());
                                int alpha2 = aob.M2.getAlpha();
                                aob.M2.setAlpha((int) (alpha * 0.11f));
                                int i28 = i27;
                                canvas2.drawRoundRect(rectF5, rectF5.height(), rectF5.height(), aob.M2);
                                aob.M2.setAlpha(alpha2);
                                aob.c3.setColor(aob.Y2.getColor());
                                aob.c3.setAlpha(aob.Y2.getAlpha());
                                canvas2.save();
                                canvas2.translate(wb2Var.k2, wb2Var.l2);
                                wb2Var.h2.draw(canvas2);
                                canvas2.restore();
                                if (i28 != 0) {
                                    canvas2.restore();
                                }
                            } else {
                                i20 = i10;
                                f5 = f41;
                            }
                            i10 = wb2Var.g2.getLineBottom(r2.getLineCount() - 1) + i20;
                            aob.Y2.setAlpha(alpha);
                        } else {
                            f8 = f7;
                            i11 = i8;
                        }
                        if ((!wb2Var.T1 || wb2Var.U1) && wb2Var.Q5.V5(dc2Var2) != 0) {
                            i9 = uh9.w(4.0f, wb2Var.Q5.V5(dc2Var2), i9);
                            i10 = uh9.w(4.0f, wb2Var.Q5.V5(dc2Var2), i10);
                        }
                        int i29 = i9;
                        if (wb2Var.O1 && z8) {
                            if (wb2Var.x1) {
                                float f42 = (dc2Var2 == null || !dc2Var2.t1) ? 1.0f : dc2Var2.L1;
                                if (i10 != i29) {
                                    i10 = (int) ((hl.L(2.0f) * f42) + i10);
                                }
                                int L11 = i5 - hl.L(17.0f);
                                f9 = 4.0f;
                                if (wb2Var.x1 || wb2Var.y2 != 17) {
                                    f25 = f42;
                                    i12 = i7;
                                    imageReceiver3 = imageReceiver4;
                                    f10 = f6;
                                    i18 = i29;
                                    f26 = 0.0f;
                                } else {
                                    Rect rect = hl.Q;
                                    int L12 = hl.L(f6) + i7;
                                    imageReceiver3 = imageReceiver4;
                                    float f43 = f6;
                                    i18 = i29;
                                    f10 = f43;
                                    rect.set(L12, i10, uh9.w(f43, i7, L11), ((int) nlVar2.O0) + i10);
                                    RectF rectF7 = hl.P;
                                    rectF7.set(rect);
                                    if (this.b == null) {
                                        TLRPC.PhotoSize photoSize = wb2Var.e4;
                                        if (photoSize == null || photoSize.gradientTopColor == 0 || photoSize.gradientBottomColor == 0) {
                                            f25 = f42;
                                            i12 = i7;
                                            if (nlVar2.n() != null) {
                                                int[] b8 = bje.b(nlVar2.n(), aob.h1());
                                                this.b = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b8);
                                                TLRPC.PhotoSize photoSize2 = wb2Var.e4;
                                                if (photoSize2 != null) {
                                                    photoSize2.gradientTopColor = b8[i8];
                                                    photoSize2.gradientBottomColor = b8[1];
                                                }
                                            }
                                        } else {
                                            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                                            f25 = f42;
                                            TLRPC.PhotoSize photoSize3 = wb2Var.e4;
                                            i12 = i7;
                                            this.b = new GradientDrawable(orientation, new int[]{photoSize3.gradientTopColor, photoSize3.gradientBottomColor});
                                        }
                                    } else {
                                        f25 = f42;
                                        i12 = i7;
                                    }
                                    if (this.b != null) {
                                        canvas2.save();
                                        Path path = wb2Var.U9;
                                        if (path != null) {
                                            path.rewind();
                                        } else {
                                            wb2Var.U9 = new Path();
                                        }
                                        wb2Var.U9.addRoundRect(rectF7, hl.L(4.0f), hl.L(4.0f), Path.Direction.CW);
                                        canvas2.clipPath(wb2Var.U9);
                                        this.b.setBounds(rect);
                                        this.b.draw(canvas2);
                                        canvas2.restore();
                                    }
                                    f26 = (((wb2Var.D2 - nlVar2.N0) - hl.L(f10)) - (dc2Var2 == null ? 0.0f : wb2Var.Q5.O3() ? dc2Var2.h0 : -dc2Var2.i0)) / 2.0f;
                                }
                                if (wb2Var.A2 != 0) {
                                    float L13 = hl.L(f10) + i12;
                                    nlVar2.L0 = bp1.z(this.r, nlVar2.N0, 2.0f, f26 + L13);
                                    float f44 = i10;
                                    nlVar2.M0 = f44;
                                    rectF5.set(L13, f44, r5 + r10, nlVar2.x());
                                    aob.M2.setColor(vm2.o(wb2Var.A2, (int) (f4 * 255.0f)));
                                    canvas2.drawRoundRect(rectF5, hl.L(4.0f), hl.L(4.0f), aob.M2);
                                } else {
                                    nlVar2.L0 = f26 + f5 + hl.L(f10);
                                    nlVar2.M0 = i10;
                                }
                                if (wb2Var.y2 != 17) {
                                    if (dc2Var2 != null && dc2Var2.t1) {
                                        if (!wb2Var.x1 && wb2Var.M1 != 1) {
                                            nlVar2.l0((int) hl.R1(dc2Var2.p1, L11, dc2Var2.L1));
                                        }
                                        nlVar2.L0 = hl.R1(dc2Var2.r1, nlVar2.r(), dc2Var2.L1) - (nlVar2.N0 / 2.0f);
                                        nlVar2.M0 = hl.R1(dc2Var2.s1, nlVar2.s(), dc2Var2.L1) - (nlVar2.O0 / 2.0f);
                                    } else if (!wb2Var.x1 && wb2Var.M1 != 1) {
                                        nlVar2.l0(L11);
                                    }
                                }
                                if (this.j != 0) {
                                    rectF5.set(nlVar2.L0, nlVar2.M0, nlVar2.w(), nlVar2.x());
                                    if (this.l == 0) {
                                        f12 = 0.0f;
                                        aob.M2.setShader(null);
                                        aob.M2.setColor(this.j);
                                        if (f4 != 1.0f) {
                                            aob.M2.setAlpha((int) (f4 * 255.0f));
                                        }
                                    } else if (this.m == 0) {
                                        f12 = 0.0f;
                                        LinearGradient linearGradient = this.p;
                                        if (linearGradient == null) {
                                            Rect d = yd0.d(yd0.c(hl.q1(this.o, i8)), (int) rectF5.width(), (int) rectF5.height());
                                            linearGradient = new LinearGradient(d.left, d.top, d.right, d.bottom, new int[]{this.j, this.l}, (float[]) null, Shader.TileMode.CLAMP);
                                            this.p = linearGradient;
                                        }
                                        aob.M2.setShader(linearGradient);
                                        if (f4 != 1.0f) {
                                            aob.M2.setAlpha((int) (f4 * 255.0f));
                                        }
                                    } else if (this.q == null) {
                                        hh7 hh7Var = new hh7(true, this.j, this.l, this.m, this.n);
                                        this.q = hh7Var;
                                        f12 = 0.0f;
                                        if (this.k < 0.0f) {
                                            nlVar2.W(hh7Var.k);
                                        }
                                        if (!nlVar2.D()) {
                                            this.q.u(hl.L(4.0f));
                                        }
                                    } else {
                                        f12 = 0.0f;
                                    }
                                    hh7 hh7Var2 = this.q;
                                    if (hh7Var2 != null) {
                                        hh7Var2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                                        this.q.draw(canvas2);
                                        i19 = i10;
                                        i13 = i18;
                                        i14 = i5;
                                        f27 = f25;
                                    } else if (wb2Var.A2 != 0) {
                                        i19 = i10;
                                        i13 = i18;
                                        i14 = i5;
                                        f27 = f25;
                                        canvas2.drawRect(nlVar2.L0, nlVar2.M0, nlVar2.w(), nlVar2.x(), aob.M2);
                                    } else {
                                        i19 = i10;
                                        i13 = i18;
                                        i14 = i5;
                                        f27 = f25;
                                        canvas2.drawRoundRect(rectF5, hl.L(4.0f), hl.L(4.0f), aob.M2);
                                    }
                                    aob.M2.setShader(null);
                                    aob.M2.setAlpha(jn7.d4);
                                } else {
                                    i19 = i10;
                                    i13 = i18;
                                    i14 = i5;
                                    f27 = f25;
                                    f12 = 0.0f;
                                }
                                if (wb2Var.O1 && wb2Var.u2 && wb2Var.y2 != 9) {
                                    if (wb2Var.y1) {
                                        int L14 = hl.L(48.0f);
                                        float f45 = L14;
                                        f11 = 2.0f;
                                        int z14 = (int) bp1.z(nlVar2.N0, f45, 2.0f, nlVar2.L0);
                                        wb2Var.K3 = z14;
                                        int z15 = (int) bp1.z(nlVar2.O0, f45, 2.0f, nlVar2.M0);
                                        wb2Var.L3 = z15;
                                        radialProgress2.p(z14, z15, z14 + L14, L14 + z15);
                                    } else {
                                        f11 = 2.0f;
                                    }
                                    rb2 rb2Var3 = wb2Var.eb;
                                    if (rb2Var3 != null && rb2Var3.J1() != null && wb2Var.eb.J1().f(wb2Var)) {
                                        imageReceiver = imageReceiver3;
                                    } else if (f4 != 1.0f) {
                                        nlVar2.setAlpha(f4);
                                        if (wb2Var.y()) {
                                            wb2Var.wb = nlVar2.g(canvas2);
                                        } else {
                                            wb2Var.wb = true;
                                        }
                                        imageReceiver = imageReceiver3;
                                        if (wb2Var.Q5.t2()) {
                                            imageReceiver.setAlpha(f4);
                                            wb2Var.N0(canvas2);
                                            f28 = 1.0f;
                                            imageReceiver.setAlpha(1.0f);
                                        } else {
                                            f28 = 1.0f;
                                        }
                                        nlVar2.setAlpha(f28);
                                    } else {
                                        imageReceiver = imageReceiver3;
                                        if (wb2Var.y()) {
                                            wb2Var.wb = nlVar2.g(canvas2);
                                        } else {
                                            wb2Var.wb = true;
                                        }
                                        if (wb2Var.Q5.t2()) {
                                            wb2Var.N0(canvas2);
                                        }
                                    }
                                } else {
                                    imageReceiver = imageReceiver3;
                                    f11 = 2.0f;
                                }
                                if (dc2Var2 == null || !dc2Var2.h) {
                                    f13 = 6.0f;
                                    v = uh9.v(nlVar2.O0, hl.L(6.0f), f27, i19);
                                } else {
                                    f13 = 6.0f;
                                    v = uh9.v(dc2Var2.q0, hl.L(6.0f), f27, i19);
                                }
                                i10 = (int) v;
                                if (wb2Var.Q5.O3()) {
                                    TextPaint textPaint = aob.Y2;
                                    int i30 = aob.Wc;
                                    f14 = f11;
                                    int i31 = (int) (f4 * 255.0f);
                                    textPaint.setColor(vm2.o(wb2Var.a2(i30), i31));
                                    aob.Z2.setColor(vm2.o(wb2Var.a2(i30), i31));
                                } else {
                                    f14 = f11;
                                    TextPaint textPaint2 = aob.Y2;
                                    int i32 = aob.Vc;
                                    int i33 = (int) (f4 * 255.0f);
                                    textPaint2.setColor(vm2.o(wb2Var.a2(i32), i33));
                                    aob.Z2.setColor(vm2.o(wb2Var.a2(i32), i33));
                                }
                                if (wb2Var.o2 != null) {
                                    if (i10 != i13) {
                                        i10 += hl.L(f9);
                                    }
                                    if (i11 == 0) {
                                        i11 = i10 - hl.L(1.0f);
                                    }
                                    canvas2.save();
                                    canvas2.translate(hl.L(f10) + i12 + (Math.abs(this.g) > 1 ? ((i14 - hl.L(20.0f)) - this.f) - this.g : 0), (i10 - hl.L(3.0f)) + (!dc2Var2.s2 ? (-dc2Var2.k0) + dc2Var2.j0 : f12));
                                    TextPaint paint = wb2Var.o2.getPaint();
                                    int alpha3 = paint.getAlpha();
                                    paint.setAlpha((int) (alpha3 * f4));
                                    npa.f(canvas2, wb2Var.o2);
                                    paint.setAlpha(alpha3);
                                    canvas2.restore();
                                    i10 += wb2Var.o2.getLineBottom(r4.getLineCount() - 1);
                                }
                                if (this.i != null) {
                                    if (i10 != i13) {
                                        i10 += hl.L(f14);
                                    }
                                    if (i11 == 0) {
                                        i11 = i10 - hl.L(1.0f);
                                    }
                                    canvas2.save();
                                    canvas2.translate(hl.L(f10) + i12 + (Math.abs(this.e) > 1 ? ((i14 - hl.L(20.0f)) - this.d) - this.e : 0), (i10 - hl.L(3.0f)) + (!dc2Var2.s2 ? (-dc2Var2.k0) + dc2Var2.j0 : f12));
                                    TextPaint paint2 = this.i.getPaint();
                                    int alpha4 = paint2.getAlpha();
                                    paint2.setAlpha((int) (alpha4 * f4));
                                    npa.f(canvas2, this.i);
                                    paint2.setAlpha(alpha4);
                                    canvas2.restore();
                                    i10 += this.i.getLineBottom(r4.getLineCount() - 1);
                                }
                                if (wb2Var.p2 != null) {
                                    if (i10 != i13) {
                                        i10 += hl.L(f14);
                                    }
                                    int i34 = i10;
                                    if (i11 == 0) {
                                        i11 = i34 - hl.L(1.0f);
                                    }
                                    wb2Var.Y1 = i34 - hl.L(3.0f);
                                    canvas2.save();
                                    canvas2.translate(hl.L(f10) + i12 + (Math.abs(wb2Var.c2) > 1 ? ((i14 - hl.L(20.0f)) - wb2Var.b2) - wb2Var.c2 : 0), wb2Var.Y1 + (!dc2Var2.s2 ? (-dc2Var2.k0) + dc2Var2.j0 : f12));
                                    if (wb2Var.y0 == -10 && wb2Var.u4.g(canvas2)) {
                                        wb2Var.invalidate();
                                    }
                                    wb2Var.o1(canvas2, -2);
                                    rb2 rb2Var4 = wb2Var.eb;
                                    if (rb2Var4 != null && rb2Var4.l2() != null && wb2Var.getDelegate().l2().y(wb2Var.Q5)) {
                                        wb2Var.eb.l2().X(wb2Var.Q5.O3(), wb2Var.p2, canvas2);
                                    }
                                    TextPaint paint3 = wb2Var.p2.getPaint();
                                    if (z3 && (r47Var = wb2Var.Q5) != null && !r47Var.O3() && (ab9Var2 = wb2Var.o8) != null) {
                                        paint3.linkColor = ab9Var2.h();
                                    }
                                    int alpha5 = paint3.getAlpha();
                                    paint3.setAlpha((int) (alpha5 * f4));
                                    npa.f(canvas2, wb2Var.p2);
                                    paint3.setAlpha(alpha5);
                                    StaticLayout staticLayout2 = wb2Var.p2;
                                    imageReceiver2 = imageReceiver;
                                    i15 = i14;
                                    rectF2 = rectF5;
                                    i16 = saveCount;
                                    dc2Var = dc2Var2;
                                    nlVar = nlVar2;
                                    hm.drawAnimatedEmojis(canvas2, staticLayout2, wb2Var.Oa, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, wb2Var.L1(1, staticLayout2.getPaint().getColor()));
                                    canvas2.restore();
                                    paint3.linkColor = wb2Var.a2(wb2Var.Q5.O3() ? aob.Yc : aob.Xc);
                                    i10 = wb2Var.p2.getLineBottom(r2.getLineCount() - 1) + i34;
                                } else {
                                    imageReceiver2 = imageReceiver;
                                    dc2Var = dc2Var2;
                                    i15 = i14;
                                    rectF2 = rectF5;
                                    i16 = saveCount;
                                    nlVar = nlVar2;
                                }
                                int i35 = i11;
                                if (wb2Var.O1 || !z9) {
                                    f15 = f;
                                    f16 = f14;
                                } else {
                                    if (i10 != i13) {
                                        i10 += hl.L(f14);
                                    }
                                    int L15 = i15 - hl.L(17.0f);
                                    if (wb2Var.x1) {
                                        nlVar.L0 = ((i12 + i15) - nlVar.N0) - hl.L(f13);
                                        nlVar.M0 = i35;
                                    } else {
                                        nlVar.L0 = i12 + (wb2Var.U1 ? -hl.L(6.3f) : hl.L(f10));
                                        nlVar.M0 = i10;
                                    }
                                    if (dc2Var != null && dc2Var.t1) {
                                        if (!wb2Var.x1 && wb2Var.M1 != 1) {
                                            nlVar.l0((int) hl.R1(dc2Var.p1, L15, dc2Var.L1));
                                        }
                                        nlVar.L0 = hl.R1(dc2Var.r1, nlVar.r(), dc2Var.L1) - (nlVar.N0 / f14);
                                        nlVar.M0 = hl.R1(dc2Var.s1, nlVar.s(), dc2Var.L1) - (nlVar.O0 / f14);
                                    } else if (!wb2Var.x1 && (b5 = wb2Var.M1) != 7 && b5 != 1) {
                                        nlVar.l0(L15);
                                    }
                                    if (wb2Var.x1 || !wb2Var.y1) {
                                        f16 = f14;
                                    } else {
                                        int L16 = hl.L(48.0f);
                                        float f46 = L16;
                                        f16 = f14;
                                        int z16 = (int) bp1.z(nlVar.N0, f46, f16, nlVar.L0);
                                        wb2Var.K3 = z16;
                                        int z17 = (int) bp1.z(nlVar.O0, f46, f16, nlVar.M0);
                                        wb2Var.L3 = z17;
                                        radialProgress2.p(z16, z17, z16 + L16, L16 + z17);
                                    }
                                    if (wb2Var.Kb && MediaController.z().H(wb2Var.Q5) && (jxVar = MediaController.z().M0) != null && jxVar.d && canvas2.isHardwareAccelerated()) {
                                        wb2Var.wb = true;
                                        wb2Var.R9 = true;
                                    } else {
                                        rb2 rb2Var5 = wb2Var.eb;
                                        if (rb2Var5 == null || rb2Var5.J1() == null || !wb2Var.eb.J1().f(wb2Var)) {
                                            f15 = f;
                                            if (f != 1.0f) {
                                                nlVar.setAlpha(f15);
                                                if (wb2Var.y()) {
                                                    wb2Var.wb = nlVar.g(canvas2);
                                                } else {
                                                    wb2Var.wb = true;
                                                }
                                                if (wb2Var.Q5.t2()) {
                                                    ImageReceiver imageReceiver5 = imageReceiver2;
                                                    imageReceiver5.setAlpha(f15);
                                                    wb2Var.N0(canvas2);
                                                    f24 = 1.0f;
                                                    imageReceiver5.setAlpha(1.0f);
                                                } else {
                                                    f24 = 1.0f;
                                                }
                                                nlVar.setAlpha(f24);
                                            } else {
                                                if (wb2Var.y()) {
                                                    wb2Var.wb = nlVar.g(canvas2);
                                                } else {
                                                    wb2Var.wb = true;
                                                }
                                                if (wb2Var.Q5.t2()) {
                                                    wb2Var.N0(canvas2);
                                                }
                                            }
                                        }
                                    }
                                    f15 = f;
                                }
                                b3 = wb2Var.M1;
                                if (b3 != 4 || b3 == 2) {
                                    wb2Var.M3 = (int) (nlVar.L0 + hl.L(8.0f));
                                    int L17 = (int) (nlVar.M0 + hl.L(8.0f));
                                    wb2Var.N3 = L17;
                                    RadialProgress2 radialProgress22 = wb2Var.R0;
                                    int i36 = wb2Var.M3;
                                    radialProgress22.p(i36, L17, hl.L(24.0f) + i36, hl.L(24.0f) + wb2Var.N3);
                                }
                                Paint c2 = wb2Var.c2("paintChatTimeBackground");
                                if (this.h == null && nlVar.R0) {
                                    int L18 = (int) (((nlVar.L0 + nlVar.N0) - hl.L(8.0f)) - this.c);
                                    f17 = 8.0f;
                                    int L19 = (int) ((nlVar.M0 + nlVar.O0) - hl.L(19.0f));
                                    f19 = 19.0f;
                                    f21 = 14.5f;
                                    f20 = 1.5f;
                                    f18 = f16;
                                    rectF3 = rectF2;
                                    rectF3.set(L18 - hl.L(f9), L19 - hl.L(1.5f), hl.L(f9) + this.c + L18, hl.L(14.5f) + L19);
                                    int alpha6 = c2.getAlpha();
                                    c2.setAlpha((int) (alpha6 * wb2Var.l4));
                                    aob.J2.setAlpha((int) (wb2Var.l4 * 255.0f));
                                    canvas2.drawRoundRect(rectF3, hl.L(f9), hl.L(f9), c2);
                                    c2.setAlpha(alpha6);
                                    canvas2.save();
                                    canvas2.translate(L18, L19);
                                    this.h.draw(canvas2);
                                    canvas2.restore();
                                    aob.J2.setAlpha(jn7.d4);
                                } else {
                                    f17 = 8.0f;
                                    f18 = f16;
                                    f19 = 19.0f;
                                    f20 = 1.5f;
                                    rectF3 = rectF2;
                                    f21 = 14.5f;
                                }
                                if (wb2Var.q2 != null && ((!(z5 = wb2Var.O1) || nlVar.R0) && wb2Var.A2 == 0)) {
                                    if (wb2Var.T1 && !wb2Var.U1 && wb2Var.M1 != 8) {
                                        i17 = (int) (((nlVar.L0 + nlVar.N0) - hl.L(f17)) - wb2Var.Z1);
                                        i10 = (int) ((nlVar.M0 + nlVar.O0) - hl.L(f19));
                                        rectF3.set(i17 - hl.L(f9), i10 - hl.L(f20), hl.L(f9) + wb2Var.Z1 + i17, hl.L(f21) + i10);
                                        canvas2.drawRoundRect(rectF3, hl.L(f9), hl.L(f9), wb2Var.c2("paintChatTimeBackground"));
                                    } else if (z5) {
                                        i17 = i12;
                                    } else {
                                        int L20 = (int) (nlVar.L0 + hl.L(8.5f));
                                        i10 = (int) (nlVar.M0 + hl.L(f13));
                                        rectF3.set(L20 - hl.L(f9), i10 - hl.L(f20), hl.L(f9) + wb2Var.Z1 + L20, hl.L(wb2Var.M1 == 8 ? f21 : 16.5f) + i10);
                                        canvas2.drawRoundRect(rectF3, hl.L(f9), hl.L(f9), c2);
                                        i17 = L20;
                                    }
                                    canvas2.save();
                                    canvas2.translate(i17, i10);
                                    if (wb2Var.U1) {
                                        if (wb2Var.O1) {
                                            aob.L2.setColor(wb2Var.a2(aob.Ad));
                                        } else if (wb2Var.Q5.O3()) {
                                            aob.L2.setColor(wb2Var.a2(aob.Wc));
                                        } else {
                                            aob.L2.setColor(wb2Var.a2(aob.Vc));
                                        }
                                    }
                                    wb2Var.q2.draw(canvas2);
                                    canvas2.restore();
                                }
                                wb2Var.C1(canvas2, wb2Var.o8.h());
                                int i37 = i12;
                                wb2Var.P.b(canvas2, wb2Var.gb, i37, wb2Var.cc);
                                wb2Var.Q.b(canvas2, wb2Var.gb, i37, wb2Var.cc);
                                if (wb2Var.u2) {
                                    if (wb2Var.Q5.O3()) {
                                        int a22 = wb2Var.a2(aob.Ob);
                                        if (wb2Var.m8 == null) {
                                            if (wb2Var.y2 == 27) {
                                                b22 = wb2Var.getContext().getResources().getDrawable(R.drawable.mini_call_join).mutate();
                                                wb2Var.m8 = b22;
                                            } else {
                                                b22 = wb2Var.b2("drawableMsgOutInstant");
                                                wb2Var.m8 = b22;
                                            }
                                            wb2Var.l8 = a22;
                                            b22.setColorFilter(new PorterDuffColorFilter(a22, PorterDuff.Mode.SRC_IN));
                                        }
                                        if (wb2Var.l8 != a22) {
                                            Drawable drawable2 = wb2Var.m8;
                                            wb2Var.l8 = a22;
                                            drawable2.setColorFilter(new PorterDuffColorFilter(a22, PorterDuff.Mode.SRC_IN));
                                        }
                                        drawable = wb2Var.m8;
                                        aob.M2.setColor(a22);
                                        aob.Y1.setColor(aob.p1(0.1f, a22));
                                        va6 va6Var2 = this.s;
                                        if (va6Var2 != null) {
                                            va6Var2.g(aob.p1(0.1f, a22), aob.p1(0.3f, a22), aob.p1(0.3f, a22), aob.p1(1.2f, a22));
                                        }
                                    } else {
                                        int a23 = wb2Var.a2(aob.Bd);
                                        if (wb2Var.o8 != null && !wb2Var.Q5.F4()) {
                                            a23 = wb2Var.o8.h();
                                        }
                                        if (wb2Var.m8 == null) {
                                            byte b9 = wb2Var.y2;
                                            if (b9 == 16) {
                                                mutate = wb2Var.getContext().getResources().getDrawable(R.drawable.mini_external_link).mutate();
                                                wb2Var.m8 = mutate;
                                            } else if (b9 == 27) {
                                                mutate = wb2Var.getContext().getResources().getDrawable(R.drawable.mini_call_join).mutate();
                                                wb2Var.m8 = mutate;
                                            } else {
                                                mutate = wb2Var.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                                                wb2Var.m8 = mutate;
                                            }
                                            wb2Var.l8 = a23;
                                            mutate.setColorFilter(new PorterDuffColorFilter(a23, PorterDuff.Mode.SRC_IN));
                                        }
                                        if (wb2Var.l8 != a23) {
                                            Drawable drawable3 = wb2Var.m8;
                                            wb2Var.l8 = a23;
                                            drawable3.setColorFilter(new PorterDuffColorFilter(a23, PorterDuff.Mode.SRC_IN));
                                        }
                                        drawable = wb2Var.m8;
                                        aob.M2.setColor(a23);
                                        aob.Y1.setColor(aob.p1(0.1f, a23));
                                        va6 va6Var3 = this.s;
                                        if (va6Var3 != null) {
                                            va6Var3.g(aob.p1(0.1f, a23), aob.p1(0.3f, a23), aob.p1(0.3f, a23), aob.p1(1.2f, a23));
                                        }
                                    }
                                    Drawable drawable4 = drawable;
                                    if (z3) {
                                        int L21 = hl.L(14.0f) + i13 + i25;
                                        int alpha7 = aob.M2.getAlpha();
                                        aob.M2.setAlpha((int) (alpha7 * 0.18f));
                                        canvas.drawRect(hl.L(f10) + i37, hl.L(f18) + r3, (i37 + i15) - hl.L(7.0f), Math.max(1, hl.L(0.66f)) + hl.L(f18) + r3, aob.M2);
                                        canvas2 = canvas;
                                        aob.M2.setAlpha(alpha7);
                                        byte b10 = wb2Var.y2;
                                        float L22 = hl.L(b10 == 27 ? 20.0f : b10 == 0 ? 15.0f : f12) + wb2Var.s2;
                                        float z18 = bp1.z(i15, L22, f18, f5);
                                        byte b11 = wb2Var.y2;
                                        if (b11 == 0) {
                                            float L23 = hl.L(1.0f) + L21;
                                            int L24 = hl.L(9.0f);
                                            int L25 = hl.L(13.0f);
                                            if (drawable4 != null) {
                                                int i38 = (int) z18;
                                                int i39 = (int) L23;
                                                drawable4.setBounds(i38, i39, L24 + i38, L25 + i39);
                                            }
                                            drawable4.setAlpha((int) (f15 * 255.0f));
                                            drawable4.draw(canvas2);
                                            L4 = hl.L(15.0f);
                                        } else if (b11 == 27) {
                                            int i40 = (int) z18;
                                            int i41 = L21;
                                            drawable4.setBounds(i40, i41, drawable4.getIntrinsicWidth() + i40, drawable4.getIntrinsicHeight() + i41);
                                            drawable4.setAlpha((int) (f15 * 255.0f));
                                            drawable4.draw(canvas2);
                                            L4 = hl.L(20.0f);
                                        } else {
                                            if (b11 == 16) {
                                                z18 -= hl.L(11.0f);
                                                float L26 = L22 + z18 + hl.L(f9);
                                                float L27 = L21 - hl.L(2.0f);
                                                int L28 = hl.L(18.0f);
                                                int L29 = hl.L(18.0f);
                                                if (drawable4 != null) {
                                                    int i42 = (int) L26;
                                                    int i43 = (int) L27;
                                                    drawable4.setBounds(i42, i43, L28 + i42, L29 + i43);
                                                }
                                                drawable4.setAlpha((int) (f15 * 255.0f));
                                                drawable4.draw(canvas2);
                                            }
                                            if (wb2Var.r2 != null) {
                                                canvas2.save();
                                                canvas2.translate(z18 - wb2Var.t2, L21);
                                                npa.f(canvas2, wb2Var.r2);
                                                canvas2.restore();
                                            }
                                        }
                                        z18 += L4;
                                        if (wb2Var.r2 != null) {
                                        }
                                    } else {
                                        float f47 = f5;
                                        int i44 = i13 + i25;
                                        if (wb2Var.Q5.F4()) {
                                            f10 = -5.0f;
                                        }
                                        int L30 = hl.L(f10) + i44;
                                        va6 va6Var4 = this.s;
                                        if (va6Var4 != null && !z2 && !va6Var4.c() && !this.s.d()) {
                                            this.s.a();
                                        }
                                        va6 va6Var5 = this.s;
                                        if (va6Var5 == null) {
                                            if (z2) {
                                                va6 va6Var6 = new va6();
                                                this.s = va6Var6;
                                                va6Var6.x.setStrokeWidth(hl.L(1.25f));
                                                this.s.D = true;
                                            }
                                        } else if (z2 && (va6Var5.c() || this.s.d())) {
                                            va6 va6Var7 = this.s;
                                            f22 = 9.0f;
                                            va6Var7.b = -1L;
                                            va6Var7.c = -1L;
                                            RectF rectF8 = rectF;
                                            rectF8.set(f47, L30, wb2Var.D2 + i37, hl.L(36.0f) + L30);
                                            float a3 = wb2Var.H2.a(0.02f);
                                            z4 = a3 == 1.0f;
                                            if (z4) {
                                                canvas2.save();
                                                canvas2.scale(a3, a3, rectF8.centerX(), rectF8.centerY());
                                            }
                                            wb2Var.L2[0] = 0;
                                            wb2Var.B0(0);
                                            wb2Var.J2[0].setBounds(i37, L30, wb2Var.D2 + i37, hl.L(36.0f) + L30);
                                            wb2Var.J2[0].draw(canvas2);
                                            va6Var = this.s;
                                            if (va6Var != null || va6Var.c()) {
                                                f23 = f13;
                                            } else {
                                                this.s.e(rectF8);
                                                f23 = f13;
                                                this.s.j(f23);
                                                this.s.draw(canvas2);
                                                wb2Var.invalidate();
                                            }
                                            canvas2.drawRoundRect(rectF8, hl.L(f23), hl.L(f23), aob.Y1);
                                            b4 = wb2Var.y2;
                                            if (b4 != 0) {
                                                int L31 = ((wb2Var.C2 + wb2Var.B2) + i37) - hl.L(15.0f);
                                                int L32 = hl.L(11.5f) + L30;
                                                int L33 = hl.L(f22);
                                                int L34 = hl.L(13.0f);
                                                if (drawable4 != null) {
                                                    drawable4.setBounds(L31, L32, L33 + L31, L34 + L32);
                                                }
                                                drawable4.setAlpha((int) (f15 * 255.0f));
                                                drawable4.draw(canvas2);
                                            } else if (b4 == 16) {
                                                if (this.u == null) {
                                                    Paint paint4 = new Paint(1);
                                                    this.u = paint4;
                                                    paint4.setStyle(Paint.Style.STROKE);
                                                    this.u.setStrokeCap(Paint.Cap.ROUND);
                                                    this.u.setStrokeJoin(Paint.Join.ROUND);
                                                }
                                                this.u.setColor(aob.M2.getColor());
                                                this.u.setStrokeWidth(hl.N(1.333f));
                                                Path path2 = this.t;
                                                if (path2 == null) {
                                                    this.t = new Path();
                                                } else {
                                                    path2.rewind();
                                                }
                                                this.t.moveTo(rectF8.right - hl.L(11.0f), rectF8.top + hl.L(f23));
                                                this.t.lineTo(rectF8.right - hl.L(f23), rectF8.top + hl.L(f23));
                                                this.t.lineTo(rectF8.right - hl.L(f23), rectF8.top + hl.L(11.0f));
                                                this.t.moveTo(rectF8.right - hl.N(11.66f), rectF8.top + hl.L(11.66f));
                                                this.t.lineTo(rectF8.right - hl.L(f23), rectF8.top + hl.L(f23));
                                                canvas2.drawPath(this.t, this.u);
                                            }
                                            if (wb2Var.r2 != null) {
                                                canvas2.save();
                                                canvas2.translate(wb2Var.B2 + i37, hl.L(10.5f) + L30);
                                                npa.f(canvas2, wb2Var.r2);
                                                canvas2.restore();
                                            }
                                            if (z4) {
                                                canvas2.restore();
                                            }
                                        }
                                        f22 = 9.0f;
                                        RectF rectF82 = rectF;
                                        rectF82.set(f47, L30, wb2Var.D2 + i37, hl.L(36.0f) + L30);
                                        float a32 = wb2Var.H2.a(0.02f);
                                        if (a32 == 1.0f) {
                                        }
                                        if (z4) {
                                        }
                                        wb2Var.L2[0] = 0;
                                        wb2Var.B0(0);
                                        wb2Var.J2[0].setBounds(i37, L30, wb2Var.D2 + i37, hl.L(36.0f) + L30);
                                        wb2Var.J2[0].draw(canvas2);
                                        va6Var = this.s;
                                        if (va6Var != null) {
                                        }
                                        f23 = f13;
                                        canvas2.drawRoundRect(rectF82, hl.L(f23), hl.L(f23), aob.Y1);
                                        b4 = wb2Var.y2;
                                        if (b4 != 0) {
                                        }
                                        if (wb2Var.r2 != null) {
                                        }
                                        if (z4) {
                                        }
                                    }
                                }
                                canvas2.restoreToCount(i16);
                            }
                            if (dc2Var2 != null && dc2Var2.t1) {
                                i10 = (int) qd4.A(f8, dc2Var2.L1, (i10 != i29 ? hl.L(2.0f) : i8) + dc2Var2.q1 + hl.L(6.0f), i10);
                            }
                        }
                        i12 = i7;
                        f9 = 4.0f;
                        f10 = f6;
                        f11 = 2.0f;
                        f12 = 0.0f;
                        f13 = 6.0f;
                        i13 = i29;
                        imageReceiver = imageReceiver4;
                        i14 = i5;
                        if (wb2Var.Q5.O3()) {
                        }
                        if (wb2Var.o2 != null) {
                        }
                        if (this.i != null) {
                        }
                        if (wb2Var.p2 != null) {
                        }
                        int i352 = i11;
                        if (wb2Var.O1) {
                        }
                        f15 = f;
                        f16 = f14;
                        b3 = wb2Var.M1;
                        if (b3 != 4) {
                        }
                        wb2Var.M3 = (int) (nlVar.L0 + hl.L(8.0f));
                        int L172 = (int) (nlVar.M0 + hl.L(8.0f));
                        wb2Var.N3 = L172;
                        RadialProgress2 radialProgress222 = wb2Var.R0;
                        int i362 = wb2Var.M3;
                        radialProgress222.p(i362, L172, hl.L(24.0f) + i362, hl.L(24.0f) + wb2Var.N3);
                        Paint c22 = wb2Var.c2("paintChatTimeBackground");
                        if (this.h == null) {
                        }
                        f17 = 8.0f;
                        f18 = f16;
                        f19 = 19.0f;
                        f20 = 1.5f;
                        rectF3 = rectF2;
                        f21 = 14.5f;
                        if (wb2Var.q2 != null) {
                            if (wb2Var.T1) {
                            }
                            if (z5) {
                            }
                            canvas2.save();
                            canvas2.translate(i17, i10);
                            if (wb2Var.U1) {
                            }
                            wb2Var.q2.draw(canvas2);
                            canvas2.restore();
                        }
                        wb2Var.C1(canvas2, wb2Var.o8.h());
                        int i372 = i12;
                        wb2Var.P.b(canvas2, wb2Var.gb, i372, wb2Var.cc);
                        wb2Var.Q.b(canvas2, wb2Var.gb, i372, wb2Var.cc);
                        if (wb2Var.u2) {
                        }
                        canvas2.restoreToCount(i16);
                    }
                    U1 = wb2Var.q0 - hl.L(2.0f);
                    i2 = wb2Var.p0;
                    L3 = hl.L(1.0f);
                }
                L2 = L3 + i2;
            }
            f2 = 1.0f;
            f3 = L2;
            i3 = (int) (backgroundDrawableRight - f3);
            int i242 = wb2Var.W1;
            if (dc2Var2 == null) {
            }
            i4 = L2;
            int i252 = i242;
            ab9Var = wb2Var.o8;
            if (ab9Var == null) {
            }
            aob.Y2.setColor(ab9Var.a(wb2Var.Q5, wb2Var.va, wb2Var.wa, wb2Var.cc, 3));
            ab9 ab9Var32 = wb2Var.o8;
            byte b72 = wb2Var.y2;
            ab9Var32.r = (b72 != 23 || b72 == 24 || b72 == 28) ? 0.5f : f2;
            if (wb2Var.Q5.q4()) {
            }
            if (!z7) {
            }
            if (z7) {
            }
            rb2 rb2Var6 = wb2Var.eb;
            if (rb2Var6 == null) {
            }
            if (wb2Var.U1) {
            }
            f4 = f;
            i5 = i3;
            i6 = U1;
            f5 = f3;
            z2 = z;
            rectF = rectF4;
            i7 = i4;
            b2 = 1;
            i8 = 0;
            f6 = 10.0f;
            z3 = false;
            if (wb2Var.O1) {
            }
            i9 = i6;
            f7 = 1.0f;
            i10 = i9;
            if (wb2Var.g2 == null) {
            }
            if (!wb2Var.T1) {
            }
            i9 = uh9.w(4.0f, wb2Var.Q5.V5(dc2Var2), i9);
            i10 = uh9.w(4.0f, wb2Var.Q5.V5(dc2Var2), i10);
            int i292 = i9;
            if (wb2Var.O1) {
                if (wb2Var.x1) {
                }
            }
            i12 = i7;
            f9 = 4.0f;
            f10 = f6;
            f11 = 2.0f;
            f12 = 0.0f;
            f13 = 6.0f;
            i13 = i292;
            imageReceiver = imageReceiver4;
            i14 = i5;
            if (wb2Var.Q5.O3()) {
            }
            if (wb2Var.o2 != null) {
            }
            if (this.i != null) {
            }
            if (wb2Var.p2 != null) {
            }
            int i3522 = i11;
            if (wb2Var.O1) {
            }
            f15 = f;
            f16 = f14;
            b3 = wb2Var.M1;
            if (b3 != 4) {
            }
            wb2Var.M3 = (int) (nlVar.L0 + hl.L(8.0f));
            int L1722 = (int) (nlVar.M0 + hl.L(8.0f));
            wb2Var.N3 = L1722;
            RadialProgress2 radialProgress2222 = wb2Var.R0;
            int i3622 = wb2Var.M3;
            radialProgress2222.p(i3622, L1722, hl.L(24.0f) + i3622, hl.L(24.0f) + wb2Var.N3);
            Paint c222 = wb2Var.c2("paintChatTimeBackground");
            if (this.h == null) {
            }
            f17 = 8.0f;
            f18 = f16;
            f19 = 19.0f;
            f20 = 1.5f;
            rectF3 = rectF2;
            f21 = 14.5f;
            if (wb2Var.q2 != null) {
            }
            wb2Var.C1(canvas2, wb2Var.o8.h());
            int i3722 = i12;
            wb2Var.P.b(canvas2, wb2Var.gb, i3722, wb2Var.cc);
            wb2Var.Q.b(canvas2, wb2Var.gb, i3722, wb2Var.cc);
            if (wb2Var.u2) {
            }
            canvas2.restoreToCount(i16);
        }
    }
}
