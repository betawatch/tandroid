// default package

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.StaticLayout;
import android.text.TextUtils;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ra2 {
    public final gb2 a;
    public float b;
    public float c;
    public StaticLayout d;
    public int e;
    public StaticLayout f;
    public int g;
    public float h;

    public ra2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01cb, code lost:
    
        if (r3 < 1.0f) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, float f, float f2) {
        Drawable drawable;
        k27 k27Var;
        gb2 gb2Var = this.a;
        xa2 xa2Var = gb2Var.D4;
        nb2 nb2Var = gb2Var.ub;
        RadialProgress2 radialProgress2 = gb2Var.Q0;
        if (gb2Var.Q5.O3()) {
            bkb.N2.setColor(bkb.v0(bkb.jc, gb2Var.cc));
            bkb.O2.setColor(bkb.v0(gb2Var.A2() ? bkb.cc : bkb.bc, gb2Var.cc));
            bkb.M2.setColor(bkb.v0(gb2Var.A2() ? bkb.lc : bkb.kc, gb2Var.cc));
            radialProgress2.d = bkb.v0((gb2Var.A2() || gb2Var.P3) ? bkb.hc : bkb.gc, gb2Var.cc);
        } else {
            n79 n79Var = gb2Var.o8;
            if (n79Var == null || !gb2Var.R1) {
                bkb.N2.setColor(bkb.v0(bkb.he, gb2Var.cc));
                bkb.O2.setColor(bkb.v0(gb2Var.A2() ? bkb.ge : bkb.fe, gb2Var.cc));
                bkb.M2.setColor(bkb.v0(gb2Var.A2() ? bkb.je : bkb.ie, gb2Var.cc));
                radialProgress2.d = bkb.v0((gb2Var.A2() || gb2Var.P3) ? bkb.Zd : bkb.Yd, gb2Var.cc);
            } else {
                bkb.N2.setColor(n79Var.h());
                bkb.O2.setColor(bkb.b(bkb.v0(gb2Var.A2() ? bkb.ge : bkb.fe, gb2Var.cc), gb2Var.o8.h()));
                bkb.M2.setColor(bkb.b(bkb.v0(gb2Var.A2() ? bkb.je : bkb.ie, gb2Var.cc), gb2Var.o8.h()));
                radialProgress2.d = bkb.b(bkb.v0((gb2Var.A2() || gb2Var.P3) ? bkb.Zd : bkb.Yd, gb2Var.cc), gb2Var.o8.h());
                xa2 xa2Var2 = gb2Var.D4;
                int b = bkb.b(bkb.v0(bkb.ke, gb2Var.cc), gb2Var.o8.h());
                int b2 = bkb.b(bkb.v0(bkb.le, gb2Var.cc), gb2Var.o8.h());
                int i = bkb.ne;
                xa2Var2.f(b, b2, bkb.b(bkb.v0(i, gb2Var.cc), gb2Var.o8.h()), bkb.b(bkb.v0(i, gb2Var.cc), gb2Var.o8.h()), bkb.b(bkb.v0(bkb.me, gb2Var.cc), gb2Var.o8.h()));
            }
        }
        float f3 = nb2Var.x0 ? nb2Var.h0 : 0.0f;
        m17 m17Var = gb2Var.A2() ? gb2Var.M6 : gb2Var.L6;
        radialProgress2.i.B = m17Var;
        radialProgress2.j.B = m17Var;
        radialProgress2.I = 1.0f;
        if (gb2Var.O1 && (k27Var = gb2Var.Q5) != null && k27Var.t2() && gb2Var.Q5.o4()) {
            if (gb2Var.Q5.O0) {
                float f4 = gb2Var.Y9;
                if (f4 != 0.0f) {
                }
            }
            radialProgress2.I *= gb2Var.Y9;
        }
        radialProgress2.draw(canvas);
        canvas.save();
        canvas.translate(gb2Var.O4 + f3 + this.e, gb2Var.getMediaOffsetY() + gl.L(13.0f) + gb2Var.gb);
        this.d.draw(canvas);
        canvas.restore();
        boolean D = MediaController.w().D(gb2Var.Q5);
        float f5 = this.h;
        if (D) {
            if (f5 != 1.0f) {
                float f6 = f5 + 0.16f;
                this.h = f6;
                if (f6 > 1.0f) {
                    this.h = 1.0f;
                }
                gb2Var.invalidate();
            }
        } else if (f5 != 0.0f) {
            float f7 = f5 - 0.16f;
            this.h = f7;
            if (f7 < 0.0f) {
                this.h = 0.0f;
            }
            gb2Var.invalidate();
        }
        float f8 = this.h;
        if (f8 > 0.0f) {
            float f9 = gb2Var.H4;
            if (nb2Var.x0) {
                f9 += nb2Var.k0;
            }
            if (f8 != 1.0f) {
                float f10 = gb2Var.G4 + f3;
                canvas.saveLayerAlpha(f10, f9, (xa2Var.f - xu9.E) + f10 + gl.L(24.0f), gl.L(24.0f) + f9, (int) (this.h * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.translate(gb2Var.G4 + f3, f9);
            xa2Var.b(canvas);
            canvas.restore();
        }
        if (this.h < 1.0f) {
            float f11 = gb2Var.O4 + f3 + this.g;
            float mediaOffsetY = gb2Var.getMediaOffsetY() + gl.L(35.0f) + gb2Var.gb;
            if (this.h != 0.0f) {
                canvas.saveLayerAlpha(f11, mediaOffsetY, this.f.getWidth() + f11, this.f.getHeight() + mediaOffsetY, (int) ((1.0f - this.h) * 255.0f), 31);
            } else {
                canvas.save();
            }
            float f12 = this.h;
            if (f12 != 0.0f) {
                float A = tb4.A(1.0f, f12, 0.3f, 0.7f);
                canvas.scale(A, A, f11, (this.f.getHeight() / 2.0f) + mediaOffsetY);
            }
            canvas.translate(f11, mediaOffsetY);
            this.f.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(f3 + gb2Var.O4, gb2Var.getMediaOffsetY() + gl.L(57.0f) + gb2Var.gb);
        gb2Var.L4.draw(canvas);
        canvas.restore();
        if (gb2Var.H3()) {
            if (gb2Var.Q5.O3()) {
                drawable = gb2Var.b2(gb2Var.A2() ? "drawableMsgOutMenuSelected" : "drawableMsgOutMenu");
            } else {
                drawable = gb2Var.A2() ? bkb.c4 : bkb.b4;
            }
            int L = ((((int) f) + gb2Var.b7) - gl.L(gb2Var.Q5.D == 0 ? 58.0f : 48.0f)) - gl.L(gb2Var.R1 ? 18.0f : 0.0f);
            gb2Var.S3 = L;
            int L2 = ((int) f2) - gl.L(2.0f);
            gb2Var.T3 = L2;
            hf0.t(L, L2, drawable);
            float f13 = nb2Var.L1;
            if (f13 != 1.0f && nb2Var.i2) {
                drawable.setAlpha((int) (f13 * 255.0f));
            }
            drawable.draw(canvas);
            if (nb2Var.L1 == 1.0f || !nb2Var.i2) {
                return;
            }
            drawable.setAlpha(kk7.d4);
        }
    }

    public final void b(Canvas canvas, float f, float f2, int i) {
        float R1;
        float f3;
        float f4;
        float f5;
        int i2;
        float f6;
        float[] fArr;
        canvas.save();
        gb2 gb2Var = this.a;
        nb2 nb2Var = gb2Var.ub;
        int L = (gl.L(gb2Var.G ? 6.0f : 0.0f) + (gb2Var.getCurrentBackgroundRight() - gb2Var.getCurrentBackgroundLeft())) - gl.L((gb2Var.R1 ? 10 : 0) + 128);
        if (gb2Var.J4 == null) {
            qa2 qa2Var = new qa2(this, gb2Var, gb2Var.E4);
            gb2Var.J4 = qa2Var;
            k27 k27Var = gb2Var.Q5;
            TLRPC.Message message = k27Var.k;
            qa2Var.u(message != null && message.voiceTranscriptionOpen && message.voiceTranscriptionFinal && uyb.m(k27Var), false);
            gb2Var.J4.s(uyb.l(gb2Var.Q5), false);
            gb2Var.J4.t(uyb.w(gb2Var.Q5), false);
        }
        if (gb2Var.R8 != 0) {
            this.b = gl.R1(de9.w(21.0f, i, L), gb2Var.d9, 1.0f - gb2Var.getVideoTranscriptionProgress());
            R1 = gl.R1(gl.L(3.0f) + gb2Var.H4, gb2Var.e9 - gl.L(40.0f), 1.0f - gb2Var.getVideoTranscriptionProgress());
            this.c = R1;
        } else {
            float w = de9.w(21.0f, i, L);
            k27 k27Var2 = gb2Var.Q5;
            this.b = gl.R1(w, (k27Var2 == null || !k27Var2.O3()) ? gb2Var.v2() ? Math.min(gb2Var.getPhotoImage().w() + gl.L(8.0f), gb2Var.getCompactRight() - gl.L(32.0f)) : (gl.L(8.0f) + gb2Var.getCurrentBackgroundRight()) - (gl.L(40.0f) * f2) : (gl.L(28.0f) * f2) + (gb2Var.getCurrentBackgroundLeft() - gl.L(40.0f)), 1.0f - gb2Var.getVideoTranscriptionProgress());
            float L2 = (gb2Var.e7 + nb2Var.j0) - gl.L(28 - (gb2Var.K ? 2 : 0));
            i19 i19Var = gb2Var.O;
            if (!i19Var.p) {
                L2 -= i19Var.i(nb2Var.L1);
            }
            R1 = gl.R1(gl.L(3.0f) + gb2Var.H4, ((gl.R1(L2, (gb2Var.getMediaOffsetY() + (gl.L(44.0f) + gb2Var.gb)) - gl.L(1.7f), gb2Var.getVideoTranscriptionProgress()) + gl.L(1.7f)) - gl.L(12.0f)) - (gb2Var.Q5.O3() ? 0.0f : gl.L(28.0f) * f2), 1.0f - gb2Var.getVideoTranscriptionProgress());
            this.c = R1;
        }
        qa2 qa2Var2 = gb2Var.J4;
        int i3 = (int) this.b;
        int i4 = (int) R1;
        int U1 = gl.U1(1.0f - gb2Var.getVideoTranscriptionProgress(), gl.L(30.0f), gl.L(32.0f));
        int U12 = gl.U1(1.0f - gb2Var.getVideoTranscriptionProgress(), gl.L(24.0f), gl.L(32.0f));
        int U13 = gl.U1(1.0f - gb2Var.getVideoTranscriptionProgress(), gl.L(8.0f), gl.L(16.0f));
        Rect rect = qa2Var2.u;
        if (U1 == rect.width() && U12 == rect.height()) {
            f3 = 12.0f;
            f4 = 40.0f;
            i2 = 2;
            f5 = 0.0f;
        } else {
            float f7 = U1 / 2.0f;
            f3 = 12.0f;
            float f8 = U13;
            f4 = 40.0f;
            float f9 = U12 / 2.0f;
            f5 = 0.0f;
            i2 = 2;
            qa2Var2.F = (float) ((Math.atan((f7 - f8) / f9) * 180.0d) / 3.141592653589793d);
            qa2Var2.G = (float) ((Math.atan(f7 / (f9 - f8)) * 180.0d) / 3.141592653589793d);
        }
        rect.set(i3, i4, i3 + U1, i4 + U12);
        int min = Math.min(Math.min(U1, U12) / 2, U13);
        qa2Var2.D = min;
        qa2Var2.E = min << 1;
        qa2 qa2Var3 = gb2Var.J4;
        int f10 = bm2.f(gb2Var.M1 == 3 ? 1.0f : gb2Var.getVideoTranscriptionProgress(), bkb.v0(gb2Var.v2() ? bkb.Sa : bkb.Yc, gb2Var.cc), bkb.v0(gb2Var.Q5.O3() ? bkb.Ic : bkb.sk, gb2Var.cc));
        bkb.v0(bkb.x6, gb2Var.cc);
        gb2Var.Q5.N3();
        float videoTranscriptionProgress = gb2Var.M1 == 3 ? f5 : 1.0f - gb2Var.getVideoTranscriptionProgress();
        oy8 oy8Var = qa2Var3.p;
        oy8 oy8Var2 = qa2Var3.n;
        boolean z = qa2Var3.b != f10;
        qa2Var3.b = f10;
        qa2Var3.c = f10;
        int o = bm2.o(f10, (int) (Color.alpha(f10) * 0.156f));
        qa2Var3.a = o;
        qa2Var3.e = videoTranscriptionProgress;
        qa2Var3.d = bkb.v(o, bm2.o(f10, (int) (Color.alpha(f10) * (bkb.I.o() ? 0.3f : 0.2f))));
        Paint paint = qa2Var3.f;
        if (paint == null) {
            paint = new Paint();
            qa2Var3.f = paint;
        }
        paint.setColor(qa2Var3.a);
        qa2Var3.f.setAlpha((int) ((1.0f - videoTranscriptionProgress) * r10.getAlpha()));
        if (z || qa2Var3.q == null) {
            int L3 = gl.L(8.0f);
            int i5 = qa2Var3.d;
            ff0 i0 = bkb.i0(L3, L3, L3, L3, 0, i5, i5);
            qa2Var3.q = i0;
            i0.setCallback(qa2Var3.r);
        }
        if (z) {
            oy8Var2.a0 = true;
            oy8Var2.L(qa2Var3.c, "Artboard Outlines");
            oy8Var2.j();
            oy8Var2.E(true);
            oy8Var2.Q(0L);
            int alpha = Color.alpha(f10);
            qa2Var3.m = alpha;
            oy8Var2.setAlpha(alpha);
            oy8Var.a0 = true;
            oy8Var.L(qa2Var3.c, "Artboard Outlines");
            oy8Var.j();
            oy8Var.E(true);
            oy8Var.Q(0L);
            int alpha2 = Color.alpha(f10);
            qa2Var3.o = alpha2;
            oy8Var.setAlpha(alpha2);
        }
        if (qa2Var3.g == null) {
            Paint paint2 = new Paint(1);
            qa2Var3.g = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            qa2Var3.g.setStrokeCap(Paint.Cap.ROUND);
        }
        qa2Var3.g.setColor(f10);
        qa2 qa2Var4 = gb2Var.J4;
        oy8 oy8Var3 = qa2Var4.p;
        oy8 oy8Var4 = qa2Var4.n;
        Rect rect2 = qa2Var4.v;
        Rect rect3 = qa2Var4.u;
        rect2.set(rect3.left - gl.L(8.0f), rect3.top - gl.L(8.0f), gl.L(8.0f) + rect3.right, gl.L(8.0f) + rect3.bottom);
        Path path = qa2Var4.C;
        if (path == null) {
            qa2Var4.C = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = gl.P;
        rectF.set(rect3);
        Path path2 = qa2Var4.C;
        float f11 = qa2Var4.D;
        path2.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(qa2Var4.C);
        float f12 = qa2Var4.e * f;
        if (f12 > f5) {
            gb2 gb2Var2 = qa2Var4.T.a;
            Paint c2 = gb2Var2.Q5.O5() ? gb2Var2.c2("paintChatActionBackground") : gb2Var2.c2("paintChatTimeBackground");
            int alpha3 = c2.getAlpha();
            c2.setAlpha((int) (alpha3 * f12));
            gb2Var2.z();
            canvas.drawRect(rect3, c2);
            if (c2 == gb2Var2.c2("paintChatActionBackground") && gb2Var2.i2()) {
                int alpha4 = bkb.g2.getAlpha();
                bkb.g2.setAlpha((int) (alpha4 * f12));
                canvas.drawRect(rect3, bkb.g2);
                bkb.g2.setAlpha(alpha4);
            }
            c2.setAlpha(alpha3);
        }
        Paint paint3 = qa2Var4.f;
        if (paint3 != null) {
            int alpha5 = paint3.getAlpha();
            qa2Var4.f.setAlpha((int) (alpha5 * f));
            canvas.drawRect(rect3, qa2Var4.f);
            qa2Var4.f.setAlpha(alpha5);
        }
        ff0 ff0Var = qa2Var4.q;
        if (ff0Var != null) {
            ff0Var.setBounds(rect3);
            qa2Var4.q.draw(canvas);
        }
        canvas.restore();
        float e = qa2Var4.l.e(false, qa2Var4.k ? 1.0f : f5);
        if (e > f5) {
            long elapsedRealtime = (long) ((SystemClock.elapsedRealtime() - qa2Var4.t) * 0.75f);
            c84 c84Var = qa2Var4.B;
            float[] fArr2 = qa2Var4.M;
            if (fArr2 == null) {
                fArr2 = new float[i2];
                qa2Var4.M = fArr2;
            }
            long j = elapsedRealtime % 5400;
            float f13 = (1520 * j) / 5400.0f;
            fArr2[0] = f13 - 20.0f;
            fArr2[1] = f13;
            int i6 = 0;
            while (true) {
                fArr = qa2Var4.M;
                if (i6 >= 4) {
                    break;
                }
                int i7 = i6 * 1350;
                fArr[1] = (c84Var.getInterpolation((j - i7) / 667.0f) * 250.0f) + fArr[1];
                float[] fArr3 = qa2Var4.M;
                fArr3[0] = (c84Var.getInterpolation((j - (i7 + 667)) / 667.0f) * 250.0f) + fArr3[0];
                i6++;
            }
            f6 = 180.0f;
            Path path3 = qa2Var4.h;
            if (path3 == null) {
                qa2Var4.h = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(e * f4, fArr[1] - fArr[0]);
            float f14 = ((1.0f - e) * max * (qa2Var4.k ? f5 : 1.0f)) + fArr[0];
            float f15 = (max * e) + f14;
            float f16 = f14 % 360.0f;
            float f17 = f15 % 360.0f;
            if (f16 < f5) {
                f16 += 360.0f;
            }
            float f18 = f16;
            if (f17 < f5) {
                f17 += 360.0f;
            }
            float f19 = f17;
            Path path4 = qa2Var4.h;
            int centerX = rect3.centerX();
            int i8 = rect3.top;
            uyb.d(path4, centerX, i8, rect3.right - qa2Var4.D, i8, f18, f19, 0.0f, qa2Var4.F);
            uyb.b(qa2Var4.h, rect3.right, rect3.top, qa2Var4.E, 1, f18, f19, qa2Var4.F, qa2Var4.G);
            Path path5 = qa2Var4.h;
            int i9 = rect3.right;
            int i10 = rect3.top;
            int i11 = qa2Var4.D;
            int i12 = i10 + i11;
            int i13 = rect3.bottom - i11;
            float f20 = qa2Var4.G;
            uyb.d(path5, i9, i12, i9, i13, f18, f19, f20, 180.0f - f20);
            uyb.b(qa2Var4.h, rect3.right, rect3.bottom, qa2Var4.E, 2, f18, f19, 180.0f - qa2Var4.G, 180.0f - qa2Var4.F);
            Path path6 = qa2Var4.h;
            int i14 = rect3.right;
            int i15 = qa2Var4.D;
            int i16 = i14 - i15;
            int i17 = rect3.bottom;
            int i18 = rect3.left + i15;
            float f21 = qa2Var4.F;
            uyb.d(path6, i16, i17, i18, i17, f18, f19, 180.0f - f21, f21 + 180.0f);
            uyb.b(qa2Var4.h, rect3.left, rect3.bottom, qa2Var4.E, 3, f18, f19, qa2Var4.F + 180.0f, qa2Var4.G + 180.0f);
            Path path7 = qa2Var4.h;
            int i19 = rect3.left;
            int i20 = rect3.bottom;
            int i21 = qa2Var4.D;
            int i22 = i20 - i21;
            int i23 = rect3.top + i21;
            float f22 = qa2Var4.G;
            uyb.d(path7, i19, i22, i19, i23, f18, f19, f22 + 180.0f, 360.0f - f22);
            uyb.b(qa2Var4.h, rect3.left, rect3.top, qa2Var4.E, 4, f18, f19, 360.0f - qa2Var4.G, 360.0f - qa2Var4.F);
            uyb.d(qa2Var4.h, rect3.left + qa2Var4.D, rect3.top, rect3.centerX(), rect3.top, f18, f19, 360.0f - qa2Var4.F, 360.0f);
            qa2Var4.g.setStrokeWidth(gl.L(1.5f));
            int alpha6 = qa2Var4.g.getAlpha();
            qa2Var4.g.setAlpha((int) (alpha6 * f));
            canvas.drawPath(qa2Var4.h, qa2Var4.g);
            qa2Var4.g.setAlpha(alpha6);
            qa2Var4.r.invalidate();
        } else {
            f6 = 180.0f;
        }
        canvas.save();
        canvas.translate(gl.L(-13.0f) + rect3.centerX(), gl.L(-13.0f) + rect3.centerY());
        canvas.saveLayerAlpha(0.0f, 0.0f, gl.L(26.0f), gl.L(26.0f), kk7.d4, 31);
        if (qa2Var4.y) {
            oy8Var4.setAlpha((int) (qa2Var4.m * f));
            oy8Var4.draw(canvas);
        } else {
            oy8Var3.setAlpha((int) (qa2Var4.o * f));
            oy8Var3.draw(canvas);
        }
        float d = qa2Var4.j.d((!qa2Var4.i || qa2Var4.y || qa2Var4.k) ? false : true);
        if (d > f5) {
            canvas.save();
            canvas.translate(gl.L(18.0f), gl.L(f3));
            if (qa2Var4.H == null) {
                Paint paint4 = new Paint(1);
                qa2Var4.H = paint4;
                paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            RectF rectF2 = gl.P;
            rectF2.set(f5, -gl.L(0.4f), gl.L(6.666f), gl.L(8.733f));
            canvas.scale(d, d, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, gl.L(2.0f), gl.L(2.0f), qa2Var4.H);
            Paint paint5 = qa2Var4.I;
            if (paint5 == null) {
                paint5 = new Paint(1);
                qa2Var4.I = paint5;
            }
            paint5.setColor(qa2Var4.c);
            int i24 = (int) (d * 255.0f);
            qa2Var4.I.setAlpha(i24);
            rectF2.set(0.0f, gl.L(3.33f), gl.L(6.666f), gl.L(8.33f));
            canvas.drawRoundRect(rectF2, gl.L(1.33f), gl.L(1.33f), qa2Var4.I);
            if (qa2Var4.L == null || Math.abs(qa2Var4.K - gl.p) > 0.1f) {
                qa2Var4.K = gl.p;
                Path path8 = new Path();
                qa2Var4.L = path8;
                path8.moveTo(gl.L(1.66f), gl.L(3.33f));
                qa2Var4.L.lineTo(gl.L(1.66f), gl.L(2.0f));
                rectF2.set(gl.L(1.66f), gl.L(0.33f), gl.L(4.99f), gl.L(3.6599998f));
                qa2Var4.L.arcTo(rectF2, -180.0f, f6, false);
                qa2Var4.L.lineTo(gl.L(5.0f), gl.L(3.33f));
            }
            if (qa2Var4.J == null) {
                Paint paint6 = new Paint(1);
                qa2Var4.J = paint6;
                paint6.setStyle(Paint.Style.STROKE);
            }
            qa2Var4.J.setStrokeWidth(gl.L(1.0f));
            qa2Var4.J.setColor(qa2Var4.c);
            qa2Var4.J.setAlpha(i24);
            canvas.drawPath(qa2Var4.L, qa2Var4.J);
            canvas.restore();
        }
        canvas.restore();
        canvas.restore();
        canvas.restore();
    }

    public final void c(Canvas canvas, int i, float f) {
        canvas.save();
        int L = gl.L(44.0f);
        gb2 gb2Var = this.a;
        canvas.translate(i, gb2Var.getMediaOffsetY() + L + gb2Var.gb + f);
        gb2Var.L4.draw(canvas);
        canvas.restore();
        k27 k27Var = gb2Var.Q5;
        if (k27Var.D == 0 || !k27Var.k.media_unread) {
            return;
        }
        bkb.R1.setColor(bkb.v0(k27Var.O3() ? bkb.sc : bkb.qe, gb2Var.cc));
        canvas.drawCircle(gl.L(6.0f) + i + gb2Var.N4, gb2Var.getMediaOffsetY() + gl.L(51.0f) + gb2Var.gb, gl.L(3.0f), bkb.R1);
    }

    public final void d(k27 k27Var, boolean z) {
        c27 c27Var;
        int L;
        f27 f27Var;
        gb2 gb2Var = this.a;
        i19 i19Var = gb2Var.O;
        int i = 0;
        gb2Var.E9 = (gb2Var.u6 || k27Var.k.fwd_from == null) ? false : true;
        gb2Var.v9 = (gb2Var.h6 && !k27Var.O3() && (k27Var.P1() < 0 || k27Var.P1() == 2666000)) || (((k27Var.o3() && k27Var.z4()) || (k27Var.y3() && k27Var.k.fwd_from.from_id == null)) && ((c27Var = gb2Var.M) == null || (c27Var.l & 4) != 0));
        if (gl.O1()) {
            int P0 = gl.P0();
            if (gb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            L = P0 - gl.L(i + 50);
            gb2Var.b7 = Math.min(gl.L(270.0f), L);
        } else {
            int parentWidth = gb2Var.getParentWidth();
            if (gb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            L = parentWidth - gl.L(i + 50);
            gb2Var.b7 = Math.min(gl.L(270.0f), L);
        }
        if (gb2Var.M != null) {
            gb2Var.b7 = L;
        }
        int w0 = gb2Var.w0(L, k27Var);
        gb2Var.setMessageObjectInternal(k27Var);
        gb2Var.v0 = gl.L(82.0f) + gb2Var.gb;
        if (gl.L(76.0f) + w0 >= (gb2Var.b7 - gb2Var.M9) - gl.L(12.0f)) {
            gb2Var.v0 = gl.L(14.0f) + gb2Var.v0;
        }
        if (gb2Var.M != null && (f27Var = gb2Var.L) != null && f27Var.d.size() > 1) {
            if ((gb2Var.M.l & 4) == 0) {
                gb2Var.v0 -= gl.L(6.0f);
                gb2Var.X1 -= gl.L(6.0f);
            }
            if ((gb2Var.M.l & 8) == 0) {
                gb2Var.v0 -= gl.L(6.0f);
            }
        }
        if (gb2Var.J) {
            gb2Var.gb -= gl.L(1.0f);
        }
        i19Var.getClass();
        i19Var.o(L - gl.L(24.0f), 3);
        if (i19Var.p) {
            return;
        }
        i19Var.n = gl.L(12.0f) + i19Var.m;
        gb2Var.Z2(k27Var);
        int i2 = i19Var.o;
        if (i2 > gb2Var.b7) {
            gb2Var.b7 = i2;
        }
        if (gl.L(24.0f) + i19Var.r + gb2Var.M9 > gb2Var.b7) {
            i19Var.n = gl.L(12.0f) + i19Var.n;
            i19Var.k -= gl.L(12.0f);
        }
        if (!k27Var.G0 && k27Var.z != null) {
            i19Var.k = gl.L(14.0f) + i19Var.k;
        }
        gb2Var.v0 += i19Var.n;
    }

    public final void e(k27 k27Var, boolean z) {
        int min;
        gb2 gb2Var = this.a;
        i19 i19Var = gb2Var.O;
        boolean z2 = true;
        gb2Var.E9 = !gb2Var.u6;
        int i = 0;
        if ((!gb2Var.h6 || k27Var.O3() || (k27Var.P1() >= 0 && k27Var.P1() != 2666000)) && ((!k27Var.o3() || !k27Var.z4()) && ((!k27Var.y3() || k27Var.k.fwd_from.from_id != null) && (!gb2Var.Y6 || k27Var.O3() || (!gb2Var.l6 && (!gb2Var.m6 || !gb2Var.W6)))))) {
            z2 = false;
        }
        gb2Var.v9 = z2;
        if (gl.O1()) {
            int P0 = gl.P0();
            if (gb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            min = Math.min(P0 - gl.L(i + 50), gl.L(270.0f));
            gb2Var.b7 = min;
        } else {
            int parentWidth = gb2Var.getParentWidth();
            if (gb2Var.X6) {
                i = 71;
            } else if (z) {
                i = 52;
            }
            min = Math.min(parentWidth - gl.L(i + 50), gl.L(270.0f));
            gb2Var.b7 = min;
        }
        gb2Var.w0(min, k27Var);
        gb2Var.setMessageObjectInternal(k27Var);
        int L = gl.L(70.0f);
        int i2 = gb2Var.gb;
        gb2Var.v0 = L + i2;
        if (gb2Var.J) {
            gb2Var.gb = i2 - gl.L(1.0f);
        }
        i19Var.getClass();
        i19Var.o(min - gl.L(k27Var.O3() ? 32.0f : 24.0f), 3);
        if (i19Var.p) {
            return;
        }
        i19Var.n = i19Var.m;
        if (TextUtils.isEmpty(k27Var.z)) {
            i19Var.n = gl.L(12.0f) + i19Var.n;
        } else {
            i19Var.n = gl.L(8.0f) + i19Var.n;
        }
        int i3 = i19Var.o;
        if (i3 > gb2Var.b7) {
            gb2Var.b7 = i3;
        }
        int L2 = gl.L(6.0f) + gb2Var.M9;
        if (k27.a4(k27Var.k) && !k27Var.m4()) {
            L2 -= gl.L(3.0f);
        } else if (k27Var.O3()) {
            L2 += gl.L(20.5f);
        }
        int extraTimeX = gb2Var.getExtraTimeX() + L2;
        if (!gb2Var.y2() && i19Var.r + extraTimeX >= gb2Var.b7) {
            i19Var.n = gl.L(12.0f) + i19Var.n;
            i19Var.k -= gl.L(12.0f);
        }
        gb2Var.v0 += i19Var.n;
    }
}
