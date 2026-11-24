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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uc2 {
    public final rc2 a;
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
    public ah7 q;
    public int r;
    public qa6 s;
    public Path t;
    public Paint u;
    public boolean v;
    public u51 w;
    public fg0 x;

    public uc2(rc2 rc2Var) {
        this.a = rc2Var;
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
        p99 p99Var;
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
        yc2 yc2Var;
        int i15;
        RectF rectF2;
        int i16;
        mm mmVar;
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
        qa6 qa6Var;
        float f23;
        byte b4;
        int L4;
        Drawable b22;
        boolean z5;
        int i17;
        byte b5;
        float f24;
        jy jyVar;
        k47 k47Var;
        p99 p99Var2;
        float f25;
        ImageReceiver imageReceiver3;
        int i18;
        float f26;
        int i19;
        float f27;
        float u;
        float f28;
        float f29;
        int i20;
        float f30;
        byte b6;
        jy jyVar2;
        float f31;
        float f32;
        float f33;
        float f34;
        float f35;
        int i21;
        Canvas canvas2 = canvas;
        rc2 rc2Var = this.a;
        RadialProgress2 radialProgress2 = rc2Var.Q0;
        ImageReceiver imageReceiver4 = rc2Var.V0;
        RectF rectF4 = rc2Var.M2;
        RectF rectF5 = rc2Var.c4;
        yc2 yc2Var2 = rc2Var.ub;
        mm mmVar2 = rc2Var.U0;
        if (rc2Var.Q5.q4() || rc2Var.Q5.F4() || rc2Var.R1 || rc2Var.T1 || rc2Var.U1) {
            int saveCount = canvas2.getSaveCount();
            float backgroundDrawableRight = ((rc2Var.getBackgroundDrawableRight() + (yc2Var2 != null ? yc2Var2.i0 : 0.0f)) - gm.L(10 + ((!rc2Var.Q5.O3() || rc2Var.C6 || rc2Var.K) ? 0 : 6))) - rc2Var.getExtraTextX();
            if (rc2Var.T1) {
                U1 = gm.L(14.0f) + rc2Var.gb;
                L2 = rc2Var.p0 - gm.L(10.0f);
            } else {
                if (rc2Var.U1) {
                    U1 = rc2Var.gb + gm.L(14.0f);
                    i2 = rc2Var.p0;
                    L3 = gm.L(1.0f);
                } else {
                    if (!rc2Var.Q5.q4()) {
                        if (rc2Var.Q5.O3()) {
                            i = rc2Var.getExtraTextX() + gm.L(12.0f) + rc2Var.N6;
                            f2 = 1.0f;
                            if (rc2Var.Q5.D == 19) {
                                i -= Math.max(0, (gm.L(14.0f) + (Math.max(rc2Var.X7, rc2Var.Z7) + i)) - gm.q.x);
                            }
                        } else {
                            f2 = 1.0f;
                            boolean z6 = rc2Var.C6;
                            int i22 = rc2Var.N6;
                            if (z6) {
                                L = gm.L(12.0f) + i22;
                                extraTextX = rc2Var.getExtraTextX();
                            } else {
                                L = gm.L(rc2Var.K ? 12.0f : 18.0f) + i22;
                                extraTextX = rc2Var.getExtraTextX();
                            }
                            i = L + extraTextX;
                        }
                        L2 = ((int) (i + yc2Var2.h0)) - gm.L(1.33f);
                        int i23 = rc2Var.q0;
                        U1 = yc2Var2.s2 ? gm.U1(yc2Var2.L1, yc2Var2.r2, i23) : i23;
                        f3 = L2;
                        i3 = (int) (backgroundDrawableRight - f3);
                        int i24 = rc2Var.W1;
                        if (yc2Var2 == null && yc2Var2.J1) {
                            i4 = L2;
                            i24 = gm.U1(yc2Var2.L1, yc2Var2.I1, i24);
                        } else {
                            i4 = L2;
                        }
                        int i25 = i24;
                        p99Var = rc2Var.o8;
                        if (p99Var == null) {
                            p99Var = new p99(rc2Var);
                            rc2Var.o8 = p99Var;
                        }
                        cmb.X2.setColor(p99Var.a(rc2Var.Q5, rc2Var.va, rc2Var.wa, rc2Var.cc, 3));
                        p99 p99Var3 = rc2Var.o8;
                        byte b7 = rc2Var.y2;
                        p99Var3.r = (b7 != 23 || b7 == 24 || b7 == 28) ? 0.5f : f2;
                        boolean z7 = (rc2Var.Q5.q4() || rc2Var.x1) ? false : true;
                        boolean z8 = !(!z7 || !rc2Var.u2 || (b = rc2Var.y2) == 26 || b == 9 || b == 2 || b == 13 || b == 11 || b == 25 || b == 1 || b == 29 || b == 18 || b == 22) || ((b = rc2Var.y2) == 6 && this.j != 0);
                        boolean z9 = z7 && (!rc2Var.u2 || b == 9 || b == 2 || b == 11 || b == 25 || b == 13 || b == 1 || b == 29 || b == 18 || b == 22 || b == 32 || rc2Var.x1 || b == 26);
                        mc2 mc2Var = rc2Var.eb;
                        z = mc2Var == null && mc2Var.n1(rc2Var, 2);
                        if (!rc2Var.U1 || rc2Var.Q5.v3() || rc2Var.Q5.F4()) {
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
                                this.w = new u51(rc2Var, 2.0f, 2.0f);
                            } else {
                                f31 = 2.0f;
                            }
                            canvas2.save();
                            float f36 = f31;
                            float a = this.w.a(0.01f);
                            canvas2.scale(a, a, (i3 / f36) + f3, ((i25 + (rc2Var.u2 ? gm.L(42.0f) : 0)) / f36) + U1);
                            RectF rectF6 = gm.P;
                            rectF6.set(f3, U1 - gm.L(6.0f), i4 + i3, U1 + i25 + (rc2Var.u2 ? gm.L(42.0f) : 0));
                            rc2Var.o8.o(z);
                            float floor = (float) Math.floor(gda.U0 / (rc2Var.Q5.q4() ? f36 : 3.0f));
                            p99 p99Var4 = rc2Var.o8;
                            if (z8) {
                                boolean z10 = yc2Var2.t1;
                                boolean z11 = rc2Var.x1;
                                if (z10) {
                                    f34 = yc2Var2.L1;
                                    if (!z11) {
                                        f34 = f2 - f34;
                                    }
                                } else {
                                    f34 = z11 ? f2 : 0.0f;
                                }
                                float f37 = f2 - f34;
                                f32 = floor;
                                float L5 = gm.L(18.0f) + mmVar2.O0;
                                StaticLayout staticLayout = rc2Var.g2;
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
                            p99Var4.j(f33);
                            i6 = U1;
                            f5 = f3;
                            z2 = z;
                            rectF = rectF4;
                            i7 = i4;
                            i5 = i3;
                            float f38 = f32;
                            f6 = 10.0f;
                            p99Var4.c(f38, f32, f32, f, canvas, rectF6);
                            int i26 = rc2Var.o8.x;
                            fg0 fg0Var = this.x;
                            if (fg0Var == null) {
                                rc2Var.db = i26;
                                fg0 Y = cmb.Y(i26, 0, 0);
                                this.x = Y;
                                Y.setCallback(rc2Var);
                                cmb.D1(this.x, 3.0f, 6.0f, 6.0f, 3.0f);
                                this.x.setCallback(rc2Var);
                            } else if (rc2Var.db != i26) {
                                rc2Var.db = i26;
                                cmb.F1(fg0Var, i26, true);
                            }
                            i8 = 0;
                            this.x.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                            this.x.draw(canvas);
                            rc2Var.o8.f(canvas, rectF6, f);
                            b2 = 1;
                            rc2Var.o8.g(f38, f38, f38, f, canvas, rectF6);
                            f4 = f;
                            canvas2 = canvas;
                            z3 = true;
                        }
                        if (rc2Var.O1 || !z7) {
                            i9 = i6;
                            f7 = 1.0f;
                            i10 = i9;
                        } else {
                            int L6 = i5 - gm.L(17.0f);
                            if (rc2Var.x1) {
                                mmVar2.L0 = ((i7 + i5) - mmVar2.N0) - gm.L(6.0f);
                                mmVar2.M0 = 0.0f;
                                i9 = i6;
                            } else {
                                mmVar2.L0 = (rc2Var.U1 ? -gm.L(6.3f) : gm.L(f6)) + i7;
                                i9 = i6;
                                mmVar2.M0 = i9;
                            }
                            if (yc2Var2 == null || !yc2Var2.t1) {
                                f30 = 2.0f;
                                if (!rc2Var.x1 && (b6 = rc2Var.M1) != 7 && b6 != b2) {
                                    mmVar2.l0(L6);
                                }
                            } else {
                                if (!rc2Var.x1 && rc2Var.M1 != b2) {
                                    mmVar2.l0((int) gm.R1(yc2Var2.p1, L6, yc2Var2.L1));
                                }
                                mmVar2.L0 = gm.R1(yc2Var2.r1, mmVar2.r(), yc2Var2.L1) - (mmVar2.N0 / 2.0f);
                                f30 = 2.0f;
                                mmVar2.M0 = gm.R1(yc2Var2.s1, mmVar2.s(), yc2Var2.L1) - (mmVar2.O0 / 2.0f);
                            }
                            if (!rc2Var.x1 && rc2Var.y1) {
                                int L7 = gm.L(48.0f);
                                float f39 = L7;
                                float f40 = f30;
                                int z12 = (int) aq1.z(mmVar2.N0, f39, f40, mmVar2.L0);
                                rc2Var.K3 = z12;
                                int z13 = (int) aq1.z(mmVar2.O0, f39, f40, mmVar2.M0);
                                rc2Var.L3 = z13;
                                radialProgress2.p(z12, z13, z12 + L7, z13 + L7);
                            }
                            if (rc2Var.Kb && MediaController.w().D(rc2Var.Q5) && (jyVar2 = MediaController.w().M0) != null && jyVar2.d && canvas2.isHardwareAccelerated()) {
                                rc2Var.wb = true;
                                rc2Var.R9 = true;
                            } else {
                                mc2 mc2Var2 = rc2Var.eb;
                                if (mc2Var2 == null || mc2Var2.M1() == null || !rc2Var.eb.M1().f(rc2Var)) {
                                    f7 = 1.0f;
                                    if (f4 != 1.0f) {
                                        mmVar2.setAlpha(f4);
                                        if (rc2Var.v()) {
                                            rc2Var.wb = mmVar2.g(canvas2);
                                        } else {
                                            rc2Var.wb = true;
                                        }
                                        if (rc2Var.Q5.t2()) {
                                            imageReceiver4.setAlpha(f4);
                                            rc2Var.N0(canvas2);
                                            imageReceiver4.setAlpha(1.0f);
                                        }
                                        mmVar2.setAlpha(1.0f);
                                    } else {
                                        if (rc2Var.v()) {
                                            rc2Var.wb = mmVar2.g(canvas2);
                                        } else {
                                            rc2Var.wb = true;
                                        }
                                        if (rc2Var.Q5.t2()) {
                                            rc2Var.N0(canvas2);
                                        }
                                    }
                                    i10 = (int) (mmVar2.O0 + gm.L(6.0f) + i9);
                                }
                            }
                            f7 = 1.0f;
                            i10 = (int) (mmVar2.O0 + gm.L(6.0f) + i9);
                        }
                        if (rc2Var.g2 == null) {
                            if (rc2Var.h2 != null) {
                                i10 += gm.L(f7);
                            }
                            int L8 = i10 - gm.L(f7);
                            int alpha = cmb.X2.getAlpha();
                            f8 = f7;
                            if (f4 != f7) {
                                cmb.X2.setAlpha((int) (alpha * f4));
                            }
                            canvas2.save();
                            if (Math.abs(rc2Var.d2) > f8) {
                                f29 = ((i5 - gm.L(rc2Var.U1 ? 0.0f : 20.0f)) - rc2Var.f2) - rc2Var.d2;
                            } else {
                                f29 = 0.0f;
                            }
                            float f41 = f5;
                            float L9 = f29 + (rc2Var.U1 ? i8 : gm.L(f6)) + f41;
                            i11 = L8;
                            canvas2.translate(L9, i10 - gm.L(f8));
                            rna.f(canvas2, rc2Var.g2);
                            canvas2.restore();
                            if (rc2Var.h2 != null) {
                                float L10 = L9 + rc2Var.e2 + gm.L(12.0f);
                                rc2Var.k2 = L10;
                                rc2Var.l2 = i10;
                                i20 = i10;
                                f5 = f41;
                                rectF5.set(L10 - gm.L(6.0f), rc2Var.l2 - gm.L(2.0f), rc2Var.k2 + rc2Var.i2 + gm.L(6.0f), rc2Var.l2 + rc2Var.j2 + gm.L(2.0f));
                                u51 u51Var = rc2Var.n2;
                                if (u51Var == null) {
                                    u51Var = new u51(rc2Var);
                                    rc2Var.n2 = u51Var;
                                }
                                float a2 = u51Var.a(0.1f);
                                int i27 = a2 != f8 ? 1 : i8;
                                if (i27 != 0) {
                                    canvas2.save();
                                    canvas2.scale(a2, a2, rectF5.centerX(), rectF5.centerY());
                                }
                                cmb.L2.setColor(cmb.X2.getColor());
                                int alpha2 = cmb.L2.getAlpha();
                                cmb.L2.setAlpha((int) (alpha * 0.11f));
                                int i28 = i27;
                                canvas2.drawRoundRect(rectF5, rectF5.height(), rectF5.height(), cmb.L2);
                                cmb.L2.setAlpha(alpha2);
                                cmb.b3.setColor(cmb.X2.getColor());
                                cmb.b3.setAlpha(cmb.X2.getAlpha());
                                canvas2.save();
                                canvas2.translate(rc2Var.k2, rc2Var.l2);
                                rc2Var.h2.draw(canvas2);
                                canvas2.restore();
                                if (i28 != 0) {
                                    canvas2.restore();
                                }
                            } else {
                                i20 = i10;
                                f5 = f41;
                            }
                            i10 = rc2Var.g2.getLineBottom(r2.getLineCount() - 1) + i20;
                            cmb.X2.setAlpha(alpha);
                        } else {
                            f8 = f7;
                            i11 = i8;
                        }
                        if ((!rc2Var.T1 || rc2Var.U1) && rc2Var.Q5.V5(yc2Var2) != 0) {
                            i9 = hg9.v(4.0f, rc2Var.Q5.V5(yc2Var2), i9);
                            i10 = hg9.v(4.0f, rc2Var.Q5.V5(yc2Var2), i10);
                        }
                        int i29 = i9;
                        if (rc2Var.O1 && z8) {
                            if (rc2Var.x1) {
                                float f42 = (yc2Var2 == null || !yc2Var2.t1) ? 1.0f : yc2Var2.L1;
                                if (i10 != i29) {
                                    i10 = (int) ((gm.L(2.0f) * f42) + i10);
                                }
                                int L11 = i5 - gm.L(17.0f);
                                f9 = 4.0f;
                                if (rc2Var.x1 || rc2Var.y2 != 17) {
                                    f25 = f42;
                                    i12 = i7;
                                    imageReceiver3 = imageReceiver4;
                                    f10 = f6;
                                    i18 = i29;
                                    f26 = 0.0f;
                                } else {
                                    Rect rect = gm.Q;
                                    int L12 = gm.L(f6) + i7;
                                    imageReceiver3 = imageReceiver4;
                                    float f43 = f6;
                                    i18 = i29;
                                    f10 = f43;
                                    rect.set(L12, i10, hg9.v(f43, i7, L11), ((int) mmVar2.O0) + i10);
                                    RectF rectF7 = gm.P;
                                    rectF7.set(rect);
                                    if (this.b == null) {
                                        TLRPC.PhotoSize photoSize = rc2Var.e4;
                                        if (photoSize == null || photoSize.gradientTopColor == 0 || photoSize.gradientBottomColor == 0) {
                                            f25 = f42;
                                            i12 = i7;
                                            if (mmVar2.n() != null) {
                                                int[] b8 = lge.b(mmVar2.n(), cmb.h1());
                                                this.b = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, b8);
                                                TLRPC.PhotoSize photoSize2 = rc2Var.e4;
                                                if (photoSize2 != null) {
                                                    photoSize2.gradientTopColor = b8[i8];
                                                    photoSize2.gradientBottomColor = b8[1];
                                                }
                                            }
                                        } else {
                                            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                                            f25 = f42;
                                            TLRPC.PhotoSize photoSize3 = rc2Var.e4;
                                            i12 = i7;
                                            this.b = new GradientDrawable(orientation, new int[]{photoSize3.gradientTopColor, photoSize3.gradientBottomColor});
                                        }
                                    } else {
                                        f25 = f42;
                                        i12 = i7;
                                    }
                                    if (this.b != null) {
                                        canvas2.save();
                                        Path path = rc2Var.U9;
                                        if (path != null) {
                                            path.rewind();
                                        } else {
                                            rc2Var.U9 = new Path();
                                        }
                                        rc2Var.U9.addRoundRect(rectF7, gm.L(4.0f), gm.L(4.0f), Path.Direction.CW);
                                        canvas2.clipPath(rc2Var.U9);
                                        this.b.setBounds(rect);
                                        this.b.draw(canvas2);
                                        canvas2.restore();
                                    }
                                    f26 = (((rc2Var.D2 - mmVar2.N0) - gm.L(f10)) - (yc2Var2 == null ? 0.0f : rc2Var.Q5.O3() ? yc2Var2.h0 : -yc2Var2.i0)) / 2.0f;
                                }
                                if (rc2Var.A2 != 0) {
                                    float L13 = gm.L(f10) + i12;
                                    mmVar2.L0 = aq1.z(this.r, mmVar2.N0, 2.0f, f26 + L13);
                                    float f44 = i10;
                                    mmVar2.M0 = f44;
                                    rectF5.set(L13, f44, r5 + r10, mmVar2.x());
                                    cmb.L2.setColor(on2.p(rc2Var.A2, (int) (f4 * 255.0f)));
                                    canvas2.drawRoundRect(rectF5, gm.L(4.0f), gm.L(4.0f), cmb.L2);
                                } else {
                                    mmVar2.L0 = f26 + f5 + gm.L(f10);
                                    mmVar2.M0 = i10;
                                }
                                if (rc2Var.y2 != 17) {
                                    if (yc2Var2 != null && yc2Var2.t1) {
                                        if (!rc2Var.x1 && rc2Var.M1 != 1) {
                                            mmVar2.l0((int) gm.R1(yc2Var2.p1, L11, yc2Var2.L1));
                                        }
                                        mmVar2.L0 = gm.R1(yc2Var2.r1, mmVar2.r(), yc2Var2.L1) - (mmVar2.N0 / 2.0f);
                                        mmVar2.M0 = gm.R1(yc2Var2.s1, mmVar2.s(), yc2Var2.L1) - (mmVar2.O0 / 2.0f);
                                    } else if (!rc2Var.x1 && rc2Var.M1 != 1) {
                                        mmVar2.l0(L11);
                                    }
                                }
                                if (this.j != 0) {
                                    rectF5.set(mmVar2.L0, mmVar2.M0, mmVar2.w(), mmVar2.x());
                                    if (this.l == 0) {
                                        f12 = 0.0f;
                                        cmb.L2.setShader(null);
                                        cmb.L2.setColor(this.j);
                                        if (f4 != 1.0f) {
                                            cmb.L2.setAlpha((int) (f4 * 255.0f));
                                        }
                                    } else if (this.m == 0) {
                                        f12 = 0.0f;
                                        LinearGradient linearGradient = this.p;
                                        if (linearGradient == null) {
                                            Rect d = we0.d(we0.c(gm.q1(this.o, i8)), (int) rectF5.width(), (int) rectF5.height());
                                            linearGradient = new LinearGradient(d.left, d.top, d.right, d.bottom, new int[]{this.j, this.l}, (float[]) null, Shader.TileMode.CLAMP);
                                            this.p = linearGradient;
                                        }
                                        cmb.L2.setShader(linearGradient);
                                        if (f4 != 1.0f) {
                                            cmb.L2.setAlpha((int) (f4 * 255.0f));
                                        }
                                    } else if (this.q == null) {
                                        ah7 ah7Var = new ah7(true, this.j, this.l, this.m, this.n);
                                        this.q = ah7Var;
                                        f12 = 0.0f;
                                        if (this.k < 0.0f) {
                                            mmVar2.W(ah7Var.k);
                                        }
                                        if (!mmVar2.D()) {
                                            this.q.u(gm.L(4.0f));
                                        }
                                    } else {
                                        f12 = 0.0f;
                                    }
                                    ah7 ah7Var2 = this.q;
                                    if (ah7Var2 != null) {
                                        ah7Var2.setBounds((int) rectF5.left, (int) rectF5.top, (int) rectF5.right, (int) rectF5.bottom);
                                        this.q.draw(canvas2);
                                        i19 = i10;
                                        i13 = i18;
                                        i14 = i5;
                                        f27 = f25;
                                    } else if (rc2Var.A2 != 0) {
                                        i19 = i10;
                                        i13 = i18;
                                        i14 = i5;
                                        f27 = f25;
                                        canvas2.drawRect(mmVar2.L0, mmVar2.M0, mmVar2.w(), mmVar2.x(), cmb.L2);
                                    } else {
                                        i19 = i10;
                                        i13 = i18;
                                        i14 = i5;
                                        f27 = f25;
                                        canvas2.drawRoundRect(rectF5, gm.L(4.0f), gm.L(4.0f), cmb.L2);
                                    }
                                    cmb.L2.setShader(null);
                                    cmb.L2.setAlpha(nm7.d4);
                                } else {
                                    i19 = i10;
                                    i13 = i18;
                                    i14 = i5;
                                    f27 = f25;
                                    f12 = 0.0f;
                                }
                                if (rc2Var.O1 && rc2Var.u2 && rc2Var.y2 != 9) {
                                    if (rc2Var.y1) {
                                        int L14 = gm.L(48.0f);
                                        float f45 = L14;
                                        f11 = 2.0f;
                                        int z14 = (int) aq1.z(mmVar2.N0, f45, 2.0f, mmVar2.L0);
                                        rc2Var.K3 = z14;
                                        int z15 = (int) aq1.z(mmVar2.O0, f45, 2.0f, mmVar2.M0);
                                        rc2Var.L3 = z15;
                                        radialProgress2.p(z14, z15, z14 + L14, L14 + z15);
                                    } else {
                                        f11 = 2.0f;
                                    }
                                    mc2 mc2Var3 = rc2Var.eb;
                                    if (mc2Var3 != null && mc2Var3.M1() != null && rc2Var.eb.M1().f(rc2Var)) {
                                        imageReceiver = imageReceiver3;
                                    } else if (f4 != 1.0f) {
                                        mmVar2.setAlpha(f4);
                                        if (rc2Var.v()) {
                                            rc2Var.wb = mmVar2.g(canvas2);
                                        } else {
                                            rc2Var.wb = true;
                                        }
                                        imageReceiver = imageReceiver3;
                                        if (rc2Var.Q5.t2()) {
                                            imageReceiver.setAlpha(f4);
                                            rc2Var.N0(canvas2);
                                            f28 = 1.0f;
                                            imageReceiver.setAlpha(1.0f);
                                        } else {
                                            f28 = 1.0f;
                                        }
                                        mmVar2.setAlpha(f28);
                                    } else {
                                        imageReceiver = imageReceiver3;
                                        if (rc2Var.v()) {
                                            rc2Var.wb = mmVar2.g(canvas2);
                                        } else {
                                            rc2Var.wb = true;
                                        }
                                        if (rc2Var.Q5.t2()) {
                                            rc2Var.N0(canvas2);
                                        }
                                    }
                                } else {
                                    imageReceiver = imageReceiver3;
                                    f11 = 2.0f;
                                }
                                if (yc2Var2 == null || !yc2Var2.h) {
                                    f13 = 6.0f;
                                    u = hg9.u(mmVar2.O0, gm.L(6.0f), f27, i19);
                                } else {
                                    f13 = 6.0f;
                                    u = hg9.u(yc2Var2.q0, gm.L(6.0f), f27, i19);
                                }
                                i10 = (int) u;
                                if (rc2Var.Q5.O3()) {
                                    TextPaint textPaint = cmb.X2;
                                    int i30 = cmb.Vc;
                                    f14 = f11;
                                    int i31 = (int) (f4 * 255.0f);
                                    textPaint.setColor(on2.p(rc2Var.a2(i30), i31));
                                    cmb.Y2.setColor(on2.p(rc2Var.a2(i30), i31));
                                } else {
                                    f14 = f11;
                                    TextPaint textPaint2 = cmb.X2;
                                    int i32 = cmb.Uc;
                                    int i33 = (int) (f4 * 255.0f);
                                    textPaint2.setColor(on2.p(rc2Var.a2(i32), i33));
                                    cmb.Y2.setColor(on2.p(rc2Var.a2(i32), i33));
                                }
                                if (rc2Var.o2 != null) {
                                    if (i10 != i13) {
                                        i10 += gm.L(f9);
                                    }
                                    if (i11 == 0) {
                                        i11 = i10 - gm.L(1.0f);
                                    }
                                    canvas2.save();
                                    canvas2.translate(gm.L(f10) + i12 + (Math.abs(this.g) > 1 ? ((i14 - gm.L(20.0f)) - this.f) - this.g : 0), (i10 - gm.L(3.0f)) + (!yc2Var2.s2 ? (-yc2Var2.k0) + yc2Var2.j0 : f12));
                                    TextPaint paint = rc2Var.o2.getPaint();
                                    int alpha3 = paint.getAlpha();
                                    paint.setAlpha((int) (alpha3 * f4));
                                    rna.f(canvas2, rc2Var.o2);
                                    paint.setAlpha(alpha3);
                                    canvas2.restore();
                                    i10 += rc2Var.o2.getLineBottom(r4.getLineCount() - 1);
                                }
                                if (this.i != null) {
                                    if (i10 != i13) {
                                        i10 += gm.L(f14);
                                    }
                                    if (i11 == 0) {
                                        i11 = i10 - gm.L(1.0f);
                                    }
                                    canvas2.save();
                                    canvas2.translate(gm.L(f10) + i12 + (Math.abs(this.e) > 1 ? ((i14 - gm.L(20.0f)) - this.d) - this.e : 0), (i10 - gm.L(3.0f)) + (!yc2Var2.s2 ? (-yc2Var2.k0) + yc2Var2.j0 : f12));
                                    TextPaint paint2 = this.i.getPaint();
                                    int alpha4 = paint2.getAlpha();
                                    paint2.setAlpha((int) (alpha4 * f4));
                                    rna.f(canvas2, this.i);
                                    paint2.setAlpha(alpha4);
                                    canvas2.restore();
                                    i10 += this.i.getLineBottom(r4.getLineCount() - 1);
                                }
                                if (rc2Var.p2 != null) {
                                    if (i10 != i13) {
                                        i10 += gm.L(f14);
                                    }
                                    int i34 = i10;
                                    if (i11 == 0) {
                                        i11 = i34 - gm.L(1.0f);
                                    }
                                    rc2Var.Y1 = i34 - gm.L(3.0f);
                                    canvas2.save();
                                    canvas2.translate(gm.L(f10) + i12 + (Math.abs(rc2Var.c2) > 1 ? ((i14 - gm.L(20.0f)) - rc2Var.b2) - rc2Var.c2 : 0), rc2Var.Y1 + (!yc2Var2.s2 ? (-yc2Var2.k0) + yc2Var2.j0 : f12));
                                    if (rc2Var.y0 == -10 && rc2Var.u4.g(canvas2)) {
                                        rc2Var.invalidate();
                                    }
                                    rc2Var.o1(canvas2, -2);
                                    mc2 mc2Var4 = rc2Var.eb;
                                    if (mc2Var4 != null && mc2Var4.p2() != null && rc2Var.getDelegate().p2().y(rc2Var.Q5)) {
                                        rc2Var.eb.p2().X(rc2Var.Q5.O3(), rc2Var.p2, canvas2);
                                    }
                                    TextPaint paint3 = rc2Var.p2.getPaint();
                                    if (z3 && (k47Var = rc2Var.Q5) != null && !k47Var.O3() && (p99Var2 = rc2Var.o8) != null) {
                                        paint3.linkColor = p99Var2.h();
                                    }
                                    int alpha5 = paint3.getAlpha();
                                    paint3.setAlpha((int) (alpha5 * f4));
                                    rna.f(canvas2, rc2Var.p2);
                                    paint3.setAlpha(alpha5);
                                    StaticLayout staticLayout2 = rc2Var.p2;
                                    imageReceiver2 = imageReceiver;
                                    i15 = i14;
                                    rectF2 = rectF5;
                                    i16 = saveCount;
                                    yc2Var = yc2Var2;
                                    mmVar = mmVar2;
                                    gn.drawAnimatedEmojis(canvas2, staticLayout2, rc2Var.Oa, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, rc2Var.L1(1, staticLayout2.getPaint().getColor()));
                                    canvas2.restore();
                                    paint3.linkColor = rc2Var.a2(rc2Var.Q5.O3() ? cmb.Xc : cmb.Wc);
                                    i10 = rc2Var.p2.getLineBottom(r2.getLineCount() - 1) + i34;
                                } else {
                                    imageReceiver2 = imageReceiver;
                                    yc2Var = yc2Var2;
                                    i15 = i14;
                                    rectF2 = rectF5;
                                    i16 = saveCount;
                                    mmVar = mmVar2;
                                }
                                int i35 = i11;
                                if (rc2Var.O1 || !z9) {
                                    f15 = f;
                                    f16 = f14;
                                } else {
                                    if (i10 != i13) {
                                        i10 += gm.L(f14);
                                    }
                                    int L15 = i15 - gm.L(17.0f);
                                    if (rc2Var.x1) {
                                        mmVar.L0 = ((i12 + i15) - mmVar.N0) - gm.L(f13);
                                        mmVar.M0 = i35;
                                    } else {
                                        mmVar.L0 = i12 + (rc2Var.U1 ? -gm.L(6.3f) : gm.L(f10));
                                        mmVar.M0 = i10;
                                    }
                                    if (yc2Var != null && yc2Var.t1) {
                                        if (!rc2Var.x1 && rc2Var.M1 != 1) {
                                            mmVar.l0((int) gm.R1(yc2Var.p1, L15, yc2Var.L1));
                                        }
                                        mmVar.L0 = gm.R1(yc2Var.r1, mmVar.r(), yc2Var.L1) - (mmVar.N0 / f14);
                                        mmVar.M0 = gm.R1(yc2Var.s1, mmVar.s(), yc2Var.L1) - (mmVar.O0 / f14);
                                    } else if (!rc2Var.x1 && (b5 = rc2Var.M1) != 7 && b5 != 1) {
                                        mmVar.l0(L15);
                                    }
                                    if (rc2Var.x1 || !rc2Var.y1) {
                                        f16 = f14;
                                    } else {
                                        int L16 = gm.L(48.0f);
                                        float f46 = L16;
                                        f16 = f14;
                                        int z16 = (int) aq1.z(mmVar.N0, f46, f16, mmVar.L0);
                                        rc2Var.K3 = z16;
                                        int z17 = (int) aq1.z(mmVar.O0, f46, f16, mmVar.M0);
                                        rc2Var.L3 = z17;
                                        radialProgress2.p(z16, z17, z16 + L16, L16 + z17);
                                    }
                                    if (rc2Var.Kb && MediaController.w().D(rc2Var.Q5) && (jyVar = MediaController.w().M0) != null && jyVar.d && canvas2.isHardwareAccelerated()) {
                                        rc2Var.wb = true;
                                        rc2Var.R9 = true;
                                    } else {
                                        mc2 mc2Var5 = rc2Var.eb;
                                        if (mc2Var5 == null || mc2Var5.M1() == null || !rc2Var.eb.M1().f(rc2Var)) {
                                            f15 = f;
                                            if (f != 1.0f) {
                                                mmVar.setAlpha(f15);
                                                if (rc2Var.v()) {
                                                    rc2Var.wb = mmVar.g(canvas2);
                                                } else {
                                                    rc2Var.wb = true;
                                                }
                                                if (rc2Var.Q5.t2()) {
                                                    ImageReceiver imageReceiver5 = imageReceiver2;
                                                    imageReceiver5.setAlpha(f15);
                                                    rc2Var.N0(canvas2);
                                                    f24 = 1.0f;
                                                    imageReceiver5.setAlpha(1.0f);
                                                } else {
                                                    f24 = 1.0f;
                                                }
                                                mmVar.setAlpha(f24);
                                            } else {
                                                if (rc2Var.v()) {
                                                    rc2Var.wb = mmVar.g(canvas2);
                                                } else {
                                                    rc2Var.wb = true;
                                                }
                                                if (rc2Var.Q5.t2()) {
                                                    rc2Var.N0(canvas2);
                                                }
                                            }
                                        }
                                    }
                                    f15 = f;
                                }
                                b3 = rc2Var.M1;
                                if (b3 != 4 || b3 == 2) {
                                    rc2Var.M3 = (int) (mmVar.L0 + gm.L(8.0f));
                                    int L17 = (int) (mmVar.M0 + gm.L(8.0f));
                                    rc2Var.N3 = L17;
                                    RadialProgress2 radialProgress22 = rc2Var.R0;
                                    int i36 = rc2Var.M3;
                                    radialProgress22.p(i36, L17, gm.L(24.0f) + i36, gm.L(24.0f) + rc2Var.N3);
                                }
                                Paint c2 = rc2Var.c2("paintChatTimeBackground");
                                if (this.h == null && mmVar.R0) {
                                    int L18 = (int) (((mmVar.L0 + mmVar.N0) - gm.L(8.0f)) - this.c);
                                    f17 = 8.0f;
                                    int L19 = (int) ((mmVar.M0 + mmVar.O0) - gm.L(19.0f));
                                    f19 = 19.0f;
                                    f21 = 14.5f;
                                    f20 = 1.5f;
                                    f18 = f16;
                                    rectF3 = rectF2;
                                    rectF3.set(L18 - gm.L(f9), L19 - gm.L(1.5f), gm.L(f9) + this.c + L18, gm.L(14.5f) + L19);
                                    int alpha6 = c2.getAlpha();
                                    c2.setAlpha((int) (alpha6 * rc2Var.l4));
                                    cmb.I2.setAlpha((int) (rc2Var.l4 * 255.0f));
                                    canvas2.drawRoundRect(rectF3, gm.L(f9), gm.L(f9), c2);
                                    c2.setAlpha(alpha6);
                                    canvas2.save();
                                    canvas2.translate(L18, L19);
                                    this.h.draw(canvas2);
                                    canvas2.restore();
                                    cmb.I2.setAlpha(nm7.d4);
                                } else {
                                    f17 = 8.0f;
                                    f18 = f16;
                                    f19 = 19.0f;
                                    f20 = 1.5f;
                                    rectF3 = rectF2;
                                    f21 = 14.5f;
                                }
                                if (rc2Var.q2 != null && ((!(z5 = rc2Var.O1) || mmVar.R0) && rc2Var.A2 == 0)) {
                                    if (rc2Var.T1 && !rc2Var.U1 && rc2Var.M1 != 8) {
                                        i17 = (int) (((mmVar.L0 + mmVar.N0) - gm.L(f17)) - rc2Var.Z1);
                                        i10 = (int) ((mmVar.M0 + mmVar.O0) - gm.L(f19));
                                        rectF3.set(i17 - gm.L(f9), i10 - gm.L(f20), gm.L(f9) + rc2Var.Z1 + i17, gm.L(f21) + i10);
                                        canvas2.drawRoundRect(rectF3, gm.L(f9), gm.L(f9), rc2Var.c2("paintChatTimeBackground"));
                                    } else if (z5) {
                                        i17 = i12;
                                    } else {
                                        int L20 = (int) (mmVar.L0 + gm.L(8.5f));
                                        i10 = (int) (mmVar.M0 + gm.L(f13));
                                        rectF3.set(L20 - gm.L(f9), i10 - gm.L(f20), gm.L(f9) + rc2Var.Z1 + L20, gm.L(rc2Var.M1 == 8 ? f21 : 16.5f) + i10);
                                        canvas2.drawRoundRect(rectF3, gm.L(f9), gm.L(f9), c2);
                                        i17 = L20;
                                    }
                                    canvas2.save();
                                    canvas2.translate(i17, i10);
                                    if (rc2Var.U1) {
                                        if (rc2Var.O1) {
                                            cmb.K2.setColor(rc2Var.a2(cmb.zd));
                                        } else if (rc2Var.Q5.O3()) {
                                            cmb.K2.setColor(rc2Var.a2(cmb.Vc));
                                        } else {
                                            cmb.K2.setColor(rc2Var.a2(cmb.Uc));
                                        }
                                    }
                                    rc2Var.q2.draw(canvas2);
                                    canvas2.restore();
                                }
                                rc2Var.C1(canvas2, rc2Var.o8.h());
                                int i37 = i12;
                                rc2Var.P.b(canvas2, rc2Var.gb, i37, rc2Var.cc);
                                rc2Var.Q.b(canvas2, rc2Var.gb, i37, rc2Var.cc);
                                if (rc2Var.u2) {
                                    if (rc2Var.Q5.O3()) {
                                        int a22 = rc2Var.a2(cmb.Nb);
                                        if (rc2Var.m8 == null) {
                                            if (rc2Var.y2 == 27) {
                                                b22 = rc2Var.getContext().getResources().getDrawable(R.drawable.mini_call_join).mutate();
                                                rc2Var.m8 = b22;
                                            } else {
                                                b22 = rc2Var.b2("drawableMsgOutInstant");
                                                rc2Var.m8 = b22;
                                            }
                                            rc2Var.l8 = a22;
                                            b22.setColorFilter(new PorterDuffColorFilter(a22, PorterDuff.Mode.SRC_IN));
                                        }
                                        if (rc2Var.l8 != a22) {
                                            Drawable drawable2 = rc2Var.m8;
                                            rc2Var.l8 = a22;
                                            drawable2.setColorFilter(new PorterDuffColorFilter(a22, PorterDuff.Mode.SRC_IN));
                                        }
                                        drawable = rc2Var.m8;
                                        cmb.L2.setColor(a22);
                                        cmb.X1.setColor(cmb.p1(0.1f, a22));
                                        qa6 qa6Var2 = this.s;
                                        if (qa6Var2 != null) {
                                            qa6Var2.g(cmb.p1(0.1f, a22), cmb.p1(0.3f, a22), cmb.p1(0.3f, a22), cmb.p1(1.2f, a22));
                                        }
                                    } else {
                                        int a23 = rc2Var.a2(cmb.Ad);
                                        if (rc2Var.o8 != null && !rc2Var.Q5.F4()) {
                                            a23 = rc2Var.o8.h();
                                        }
                                        if (rc2Var.m8 == null) {
                                            byte b9 = rc2Var.y2;
                                            if (b9 == 16) {
                                                mutate = rc2Var.getContext().getResources().getDrawable(R.drawable.mini_external_link).mutate();
                                                rc2Var.m8 = mutate;
                                            } else if (b9 == 27) {
                                                mutate = rc2Var.getContext().getResources().getDrawable(R.drawable.mini_call_join).mutate();
                                                rc2Var.m8 = mutate;
                                            } else {
                                                mutate = rc2Var.getContext().getResources().getDrawable(R.drawable.msg_instant).mutate();
                                                rc2Var.m8 = mutate;
                                            }
                                            rc2Var.l8 = a23;
                                            mutate.setColorFilter(new PorterDuffColorFilter(a23, PorterDuff.Mode.SRC_IN));
                                        }
                                        if (rc2Var.l8 != a23) {
                                            Drawable drawable3 = rc2Var.m8;
                                            rc2Var.l8 = a23;
                                            drawable3.setColorFilter(new PorterDuffColorFilter(a23, PorterDuff.Mode.SRC_IN));
                                        }
                                        drawable = rc2Var.m8;
                                        cmb.L2.setColor(a23);
                                        cmb.X1.setColor(cmb.p1(0.1f, a23));
                                        qa6 qa6Var3 = this.s;
                                        if (qa6Var3 != null) {
                                            qa6Var3.g(cmb.p1(0.1f, a23), cmb.p1(0.3f, a23), cmb.p1(0.3f, a23), cmb.p1(1.2f, a23));
                                        }
                                    }
                                    Drawable drawable4 = drawable;
                                    if (z3) {
                                        int L21 = gm.L(14.0f) + i13 + i25;
                                        int alpha7 = cmb.L2.getAlpha();
                                        cmb.L2.setAlpha((int) (alpha7 * 0.18f));
                                        canvas.drawRect(gm.L(f10) + i37, gm.L(f18) + r3, (i37 + i15) - gm.L(7.0f), Math.max(1, gm.L(0.66f)) + gm.L(f18) + r3, cmb.L2);
                                        canvas2 = canvas;
                                        cmb.L2.setAlpha(alpha7);
                                        byte b10 = rc2Var.y2;
                                        float L22 = gm.L(b10 == 27 ? 20.0f : b10 == 0 ? 15.0f : f12) + rc2Var.s2;
                                        float z18 = aq1.z(i15, L22, f18, f5);
                                        byte b11 = rc2Var.y2;
                                        if (b11 == 0) {
                                            float L23 = gm.L(1.0f) + L21;
                                            int L24 = gm.L(9.0f);
                                            int L25 = gm.L(13.0f);
                                            if (drawable4 != null) {
                                                int i38 = (int) z18;
                                                int i39 = (int) L23;
                                                drawable4.setBounds(i38, i39, L24 + i38, L25 + i39);
                                            }
                                            drawable4.setAlpha((int) (f15 * 255.0f));
                                            drawable4.draw(canvas2);
                                            L4 = gm.L(15.0f);
                                        } else if (b11 == 27) {
                                            int i40 = (int) z18;
                                            int i41 = L21;
                                            drawable4.setBounds(i40, i41, drawable4.getIntrinsicWidth() + i40, drawable4.getIntrinsicHeight() + i41);
                                            drawable4.setAlpha((int) (f15 * 255.0f));
                                            drawable4.draw(canvas2);
                                            L4 = gm.L(20.0f);
                                        } else {
                                            if (b11 == 16) {
                                                z18 -= gm.L(11.0f);
                                                float L26 = L22 + z18 + gm.L(f9);
                                                float L27 = L21 - gm.L(2.0f);
                                                int L28 = gm.L(18.0f);
                                                int L29 = gm.L(18.0f);
                                                if (drawable4 != null) {
                                                    int i42 = (int) L26;
                                                    int i43 = (int) L27;
                                                    drawable4.setBounds(i42, i43, L28 + i42, L29 + i43);
                                                }
                                                drawable4.setAlpha((int) (f15 * 255.0f));
                                                drawable4.draw(canvas2);
                                            }
                                            if (rc2Var.r2 != null) {
                                                canvas2.save();
                                                canvas2.translate(z18 - rc2Var.t2, L21);
                                                rna.f(canvas2, rc2Var.r2);
                                                canvas2.restore();
                                            }
                                        }
                                        z18 += L4;
                                        if (rc2Var.r2 != null) {
                                        }
                                    } else {
                                        float f47 = f5;
                                        int i44 = i13 + i25;
                                        if (rc2Var.Q5.F4()) {
                                            f10 = -5.0f;
                                        }
                                        int L30 = gm.L(f10) + i44;
                                        qa6 qa6Var4 = this.s;
                                        if (qa6Var4 != null && !z2 && !qa6Var4.c() && !this.s.d()) {
                                            this.s.a();
                                        }
                                        qa6 qa6Var5 = this.s;
                                        if (qa6Var5 == null) {
                                            if (z2) {
                                                qa6 qa6Var6 = new qa6();
                                                this.s = qa6Var6;
                                                qa6Var6.x.setStrokeWidth(gm.L(1.25f));
                                                this.s.D = true;
                                            }
                                        } else if (z2 && (qa6Var5.c() || this.s.d())) {
                                            qa6 qa6Var7 = this.s;
                                            f22 = 9.0f;
                                            qa6Var7.b = -1L;
                                            qa6Var7.c = -1L;
                                            RectF rectF8 = rectF;
                                            rectF8.set(f47, L30, rc2Var.D2 + i37, gm.L(36.0f) + L30);
                                            float a3 = rc2Var.H2.a(0.02f);
                                            z4 = a3 == 1.0f;
                                            if (z4) {
                                                canvas2.save();
                                                canvas2.scale(a3, a3, rectF8.centerX(), rectF8.centerY());
                                            }
                                            rc2Var.L2[0] = 0;
                                            rc2Var.A0(0);
                                            rc2Var.J2[0].setBounds(i37, L30, rc2Var.D2 + i37, gm.L(36.0f) + L30);
                                            rc2Var.J2[0].draw(canvas2);
                                            qa6Var = this.s;
                                            if (qa6Var != null || qa6Var.c()) {
                                                f23 = f13;
                                            } else {
                                                this.s.e(rectF8);
                                                f23 = f13;
                                                this.s.j(f23);
                                                this.s.draw(canvas2);
                                                rc2Var.invalidate();
                                            }
                                            canvas2.drawRoundRect(rectF8, gm.L(f23), gm.L(f23), cmb.X1);
                                            b4 = rc2Var.y2;
                                            if (b4 != 0) {
                                                int L31 = ((rc2Var.C2 + rc2Var.B2) + i37) - gm.L(15.0f);
                                                int L32 = gm.L(11.5f) + L30;
                                                int L33 = gm.L(f22);
                                                int L34 = gm.L(13.0f);
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
                                                this.u.setColor(cmb.L2.getColor());
                                                this.u.setStrokeWidth(gm.N(1.333f));
                                                Path path2 = this.t;
                                                if (path2 == null) {
                                                    this.t = new Path();
                                                } else {
                                                    path2.rewind();
                                                }
                                                this.t.moveTo(rectF8.right - gm.L(11.0f), rectF8.top + gm.L(f23));
                                                this.t.lineTo(rectF8.right - gm.L(f23), rectF8.top + gm.L(f23));
                                                this.t.lineTo(rectF8.right - gm.L(f23), rectF8.top + gm.L(11.0f));
                                                this.t.moveTo(rectF8.right - gm.N(11.66f), rectF8.top + gm.L(11.66f));
                                                this.t.lineTo(rectF8.right - gm.L(f23), rectF8.top + gm.L(f23));
                                                canvas2.drawPath(this.t, this.u);
                                            }
                                            if (rc2Var.r2 != null) {
                                                canvas2.save();
                                                canvas2.translate(rc2Var.B2 + i37, gm.L(10.5f) + L30);
                                                rna.f(canvas2, rc2Var.r2);
                                                canvas2.restore();
                                            }
                                            if (z4) {
                                                canvas2.restore();
                                            }
                                        }
                                        f22 = 9.0f;
                                        RectF rectF82 = rectF;
                                        rectF82.set(f47, L30, rc2Var.D2 + i37, gm.L(36.0f) + L30);
                                        float a32 = rc2Var.H2.a(0.02f);
                                        if (a32 == 1.0f) {
                                        }
                                        if (z4) {
                                        }
                                        rc2Var.L2[0] = 0;
                                        rc2Var.A0(0);
                                        rc2Var.J2[0].setBounds(i37, L30, rc2Var.D2 + i37, gm.L(36.0f) + L30);
                                        rc2Var.J2[0].draw(canvas2);
                                        qa6Var = this.s;
                                        if (qa6Var != null) {
                                        }
                                        f23 = f13;
                                        canvas2.drawRoundRect(rectF82, gm.L(f23), gm.L(f23), cmb.X1);
                                        b4 = rc2Var.y2;
                                        if (b4 != 0) {
                                        }
                                        if (rc2Var.r2 != null) {
                                        }
                                        if (z4) {
                                        }
                                    }
                                }
                                canvas2.restoreToCount(i16);
                            }
                            if (yc2Var2 != null && yc2Var2.t1) {
                                i10 = (int) td4.A(f8, yc2Var2.L1, (i10 != i29 ? gm.L(2.0f) : i8) + yc2Var2.q1 + gm.L(6.0f), i10);
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
                        if (rc2Var.Q5.O3()) {
                        }
                        if (rc2Var.o2 != null) {
                        }
                        if (this.i != null) {
                        }
                        if (rc2Var.p2 != null) {
                        }
                        int i352 = i11;
                        if (rc2Var.O1) {
                        }
                        f15 = f;
                        f16 = f14;
                        b3 = rc2Var.M1;
                        if (b3 != 4) {
                        }
                        rc2Var.M3 = (int) (mmVar.L0 + gm.L(8.0f));
                        int L172 = (int) (mmVar.M0 + gm.L(8.0f));
                        rc2Var.N3 = L172;
                        RadialProgress2 radialProgress222 = rc2Var.R0;
                        int i362 = rc2Var.M3;
                        radialProgress222.p(i362, L172, gm.L(24.0f) + i362, gm.L(24.0f) + rc2Var.N3);
                        Paint c22 = rc2Var.c2("paintChatTimeBackground");
                        if (this.h == null) {
                        }
                        f17 = 8.0f;
                        f18 = f16;
                        f19 = 19.0f;
                        f20 = 1.5f;
                        rectF3 = rectF2;
                        f21 = 14.5f;
                        if (rc2Var.q2 != null) {
                            if (rc2Var.T1) {
                            }
                            if (z5) {
                            }
                            canvas2.save();
                            canvas2.translate(i17, i10);
                            if (rc2Var.U1) {
                            }
                            rc2Var.q2.draw(canvas2);
                            canvas2.restore();
                        }
                        rc2Var.C1(canvas2, rc2Var.o8.h());
                        int i372 = i12;
                        rc2Var.P.b(canvas2, rc2Var.gb, i372, rc2Var.cc);
                        rc2Var.Q.b(canvas2, rc2Var.gb, i372, rc2Var.cc);
                        if (rc2Var.u2) {
                        }
                        canvas2.restoreToCount(i16);
                    }
                    U1 = rc2Var.q0 - gm.L(2.0f);
                    i2 = rc2Var.p0;
                    L3 = gm.L(1.0f);
                }
                L2 = L3 + i2;
            }
            f2 = 1.0f;
            f3 = L2;
            i3 = (int) (backgroundDrawableRight - f3);
            int i242 = rc2Var.W1;
            if (yc2Var2 == null) {
            }
            i4 = L2;
            int i252 = i242;
            p99Var = rc2Var.o8;
            if (p99Var == null) {
            }
            cmb.X2.setColor(p99Var.a(rc2Var.Q5, rc2Var.va, rc2Var.wa, rc2Var.cc, 3));
            p99 p99Var32 = rc2Var.o8;
            byte b72 = rc2Var.y2;
            p99Var32.r = (b72 != 23 || b72 == 24 || b72 == 28) ? 0.5f : f2;
            if (rc2Var.Q5.q4()) {
            }
            if (!z7) {
            }
            if (z7) {
            }
            mc2 mc2Var6 = rc2Var.eb;
            if (mc2Var6 == null) {
            }
            if (rc2Var.U1) {
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
            if (rc2Var.O1) {
            }
            i9 = i6;
            f7 = 1.0f;
            i10 = i9;
            if (rc2Var.g2 == null) {
            }
            if (!rc2Var.T1) {
            }
            i9 = hg9.v(4.0f, rc2Var.Q5.V5(yc2Var2), i9);
            i10 = hg9.v(4.0f, rc2Var.Q5.V5(yc2Var2), i10);
            int i292 = i9;
            if (rc2Var.O1) {
                if (rc2Var.x1) {
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
            if (rc2Var.Q5.O3()) {
            }
            if (rc2Var.o2 != null) {
            }
            if (this.i != null) {
            }
            if (rc2Var.p2 != null) {
            }
            int i3522 = i11;
            if (rc2Var.O1) {
            }
            f15 = f;
            f16 = f14;
            b3 = rc2Var.M1;
            if (b3 != 4) {
            }
            rc2Var.M3 = (int) (mmVar.L0 + gm.L(8.0f));
            int L1722 = (int) (mmVar.M0 + gm.L(8.0f));
            rc2Var.N3 = L1722;
            RadialProgress2 radialProgress2222 = rc2Var.R0;
            int i3622 = rc2Var.M3;
            radialProgress2222.p(i3622, L1722, gm.L(24.0f) + i3622, gm.L(24.0f) + rc2Var.N3);
            Paint c222 = rc2Var.c2("paintChatTimeBackground");
            if (this.h == null) {
            }
            f17 = 8.0f;
            f18 = f16;
            f19 = 19.0f;
            f20 = 1.5f;
            rectF3 = rectF2;
            f21 = 14.5f;
            if (rc2Var.q2 != null) {
            }
            rc2Var.C1(canvas2, rc2Var.o8.h());
            int i3722 = i12;
            rc2Var.P.b(canvas2, rc2Var.gb, i3722, rc2Var.cc);
            rc2Var.Q.b(canvas2, rc2Var.gb, i3722, rc2Var.cc);
            if (rc2Var.u2) {
            }
            canvas2.restoreToCount(i16);
        }
    }
}
