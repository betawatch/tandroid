package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.w7;
import org.telegram.messenger.wo;
import org.telegram.messenger.xo;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class h0 extends View {
    public final Drawable E;
    public final Paint F;
    public boolean G;
    public ly0 H;
    public final Paint I;
    public boolean J;
    public ly0 K;
    public boolean L;
    public ly0 M;
    public boolean N;
    public final TextPaint O;
    public StaticLayout P;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public final ImageReceiver U;
    public boolean V;
    public int W;
    public int a;
    public g0 a0;
    public int b;
    public float b0;
    public boolean c;
    public float c0;
    public boolean d;
    public float d0;
    public final float e;
    public float e0;
    public final int f;
    public int f0;
    public final RectF g0;
    public final int h;
    public final RectF h0;
    public final Path i0;
    public final Path j0;
    public final RectF k0;
    public final RectF l0;
    public final u5 m0;
    public float n;
    public final u5 n0;
    public final u5 o0;
    public final u5 p0;
    public final u5 q0;
    public final TextPaint r;
    public final u5 r0;
    public StaticLayout s;
    public final u5 s0;
    public final u5 t0;
    public float w;
    public float x;
    public final RectF y;

    public h0(Context context, float f10) {
        super(context);
        this.c = true;
        this.n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        this.y = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.F = new Paint(1);
        this.I = new Paint(1);
        this.O = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.U = imageReceiver;
        this.g0 = new RectF();
        this.h0 = new RectF();
        this.i0 = new Path();
        this.j0 = new Path();
        this.k0 = new RectF();
        this.l0 = new RectF();
        xq xqVar = xq.h;
        this.m0 = new u5(this, 0L, 350L, xqVar);
        this.n0 = new u5(this, 0L, 350L, xqVar);
        this.o0 = new u5(this, 0L, 350L, xqVar);
        this.p0 = new u5(this, 0L, 350L, xqVar);
        this.q0 = new u5(this, 0L, 350L, xqVar);
        this.r0 = new u5(this, 0L, 350L, xqVar);
        this.s0 = new u5(this, 0L, 350L, xqVar);
        this.t0 = new u5(this, 0L, 350L, xqVar);
        this.e = f10;
        imageReceiver.K0 = true;
        this.f = (int) (f10 * 3.0f);
        this.h = (int) (f10 * 1.0f);
        this.E = k2.p1.g(context, R.drawable.story_link);
        textPaint.setTextSize(24.0f * f10);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        Path.Direction direction;
        float f14;
        float f15;
        float f16;
        float f17;
        float d;
        float f18;
        ly0 ly0Var;
        ly0 ly0Var2;
        Canvas canvas2 = canvas;
        d();
        float e10 = this.s0.e(false, this.b0);
        float e11 = this.t0.e(false, this.c0);
        float d10 = this.q0.d(this.W == 0);
        float d11 = this.p0.d(e());
        float f19 = this.e;
        float T1 = org.telegram.messenger.g0.T1(0.2f * e11, 16.66f * f19, d11);
        int i3 = this.f;
        int i10 = this.h;
        RectF rectF = this.g0;
        rectF.set(i3, i10, i3 + e10, i10 + e11);
        int f20 = i0.a.f(d11, this.f0, i0.a.f(d10, -1, -14670807));
        Paint paint = this.F;
        paint.setColor(f20);
        Path path = this.j0;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, T1, T1, direction2);
        canvas2.drawPath(path, paint);
        if (d11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i3, i10);
            float d12 = this.m0.d(this.G);
            float f21 = (7.33f * f19) + 0.0f;
            ly0 ly0Var3 = this.H;
            if (ly0Var3 == null || d12 <= 0.0f) {
                f12 = d12;
                f10 = 1.0f;
                f13 = d11;
                f11 = 2.0f;
                direction = direction2;
            } else {
                f11 = 2.0f;
                direction = direction2;
                f12 = d12;
                f10 = 1.0f;
                ly0Var3.c(f19 * 10.0f, a1.g.D(1.0f, d12, (15.0f * f19) + this.H.i(), (ly0Var3.i() / 2.0f) + f21), d11, -15033089, canvas2);
                f13 = d11;
                f21 = (((7.0f * f19) + this.H.i()) * f12) + f21;
            }
            float f22 = f21;
            float e12 = this.r0.e(false, this.d0);
            Paint paint2 = this.I;
            paint2.setAlpha(25);
            float f23 = e12 + f22;
            RectF rectF2 = this.h0;
            rectF2.set(f19 * 10.0f, f22, e10 - (f19 * 10.0f), f23);
            Path path2 = this.i0;
            path2.rewind();
            path2.addRoundRect(rectF2, f19 * 5.0f, f19 * 5.0f, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(hs.e4);
            canvas2.drawRect(f19 * 10.0f, f22, 13.0f * f19, f23, paint2);
            canvas.restore();
            float f24 = (5.66f * f19) + f22;
            if (this.L) {
                ly0 ly0Var4 = this.M;
                if (ly0Var4 != null) {
                    float i11 = (ly0Var4.i() / f11) + f24;
                    int color = paint2.getColor();
                    f14 = e10;
                    d11 = f13;
                    f16 = f12;
                    f17 = 2.66f;
                    ly0Var4.c(f19 * 20.0f, i11, d11, color, canvas);
                    f15 = t4.c.c(f19, 2.66f, this.M.i(), f24);
                    if (this.J || (ly0Var2 = this.K) == null) {
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        ly0Var2.c(f19 * 20.0f, (ly0Var2.i() / f11) + f15, d11, i0.a.f(d10, -13421773, -1), canvas2);
                        f15 = t4.c.c(f19, f17, this.K.i(), f15);
                    }
                    if (this.N && this.P != null) {
                        canvas2.save();
                        canvas2.translate((f19 * 20.0f) - this.R, f15);
                        this.O.setColor(i0.a.f(d10, -13421773, -1));
                        this.O.setAlpha((int) (255.0f * d11));
                        this.P.draw(canvas2);
                        canvas2.restore();
                        f15 = t4.c.c(f19, f17, this.P.getHeight(), f15);
                    }
                    d = this.n0.d(this.S);
                    if (d > 0.0f) {
                        float d13 = this.o0.d(this.T);
                        this.k0.set(f19 * 20.0f, (f19 * f17) + f15, f14 - (20.0f * f19), (f19 * f17) + f15 + this.e0);
                        this.l0.set(((f14 - (f19 * 10.0f)) - (f19 * 6.0f)) - (48.0f * f19), (f19 * 6.0f) + f22, (f14 - (f19 * 10.0f)) - (f19 * 6.0f), (48.0f * f19) + (6.0f * f19) + f22);
                        org.telegram.messenger.g0.Z1(this.k0, this.l0, d13, rectF2);
                        float f25 = rectF2.left;
                        float f26 = rectF2.top;
                        float width = rectF2.width();
                        float height = rectF2.height();
                        ImageReceiver imageReceiver = this.U;
                        imageReceiver.y0(f25, f26, width, height);
                        imageReceiver.setAlpha(d * d11);
                        imageReceiver.h(canvas2, null);
                        f15 = org.telegram.messenger.camera.q.b(f19 * f17, this.e0, f10 - d13, f15);
                    }
                    f18 = (5.0f * f19) + (7.0f * f19) + f15;
                    ly0Var = this.H;
                    if (ly0Var != null && f10 - f16 > 0.0f) {
                        ly0Var.c(f19 * 10.0f, (ly0Var.i() / f11) + f18 + (((15.0f * f19) + this.H.i()) * f16), d11, -15033089, canvas2);
                        this.H.i();
                    }
                    canvas2.restore();
                } else {
                    f14 = e10;
                    f15 = f24;
                }
            } else {
                f14 = e10;
                f15 = f24;
            }
            d11 = f13;
            f16 = f12;
            f17 = 2.66f;
            if (this.J) {
            }
            canvas2 = canvas;
            if (this.N) {
                canvas2.save();
                canvas2.translate((f19 * 20.0f) - this.R, f15);
                this.O.setColor(i0.a.f(d10, -13421773, -1));
                this.O.setAlpha((int) (255.0f * d11));
                this.P.draw(canvas2);
                canvas2.restore();
                f15 = t4.c.c(f19, f17, this.P.getHeight(), f15);
            }
            d = this.n0.d(this.S);
            if (d > 0.0f) {
            }
            f18 = (5.0f * f19) + (7.0f * f19) + f15;
            ly0Var = this.H;
            if (ly0Var != null) {
                ly0Var.c(f19 * 10.0f, (ly0Var.i() / f11) + f18 + (((15.0f * f19) + this.H.i()) * f16), d11, -15033089, canvas2);
                this.H.i();
            }
            canvas2.restore();
        } else {
            f10 = 1.0f;
            f11 = 2.0f;
        }
        if (d11 < f10) {
            float f27 = this.y.left;
            float f28 = f11;
            int x10 = ((int) com.google.android.recaptcha.internal.a.x(f19, 30.0f, e11, f28)) + i10;
            Drawable drawable = this.E;
            drawable.setBounds(((int) (f27 * f19)) + i3, ((int) com.google.android.recaptcha.internal.a.c(f19, 30.0f, e11, f28)) + i10, ((int) ((f27 + 30.0f) * f19)) + i3, x10);
            int i12 = (int) ((f10 - d11) * 255.0f);
            drawable.setAlpha(i12);
            drawable.draw(canvas2);
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(((this.y.left + 30.0f + 3.25f) * f19) + i3, (e11 / 2.0f) + i10);
                float f29 = this.n;
                canvas2.scale(f29, f29);
                canvas2.translate(-this.x, (-this.s.getHeight()) / 2.0f);
                this.r.setAlpha(i12);
                this.s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i3, g0 g0Var, boolean z10) {
        this.a = i3;
        if (this.a0 != g0Var || z10) {
            this.a0 = g0Var;
            this.c = true;
            this.d = z10;
            requestLayout();
        }
    }

    public final void c(int i3, int i10) {
        Drawable drawable = this.E;
        TextPaint textPaint = this.r;
        if (i3 == 0) {
            this.f0 = i10;
            int i11 = org.telegram.messenger.g0.B(i10) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i11);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        } else if (i3 == 1) {
            this.f0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i3 == 2) {
            this.f0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        int f10;
        float f11;
        int i3;
        int i10;
        int i11;
        float f12;
        float f13;
        if (!this.c || this.a0 == null) {
            return;
        }
        boolean e10 = e();
        int i12 = this.f;
        float f14 = this.e;
        if (e10) {
            String str2 = TextUtils.isEmpty(this.a0.b) ? this.a0.c : this.a0.b;
            TLRPC.WebPage webPage = this.a0.d;
            float f15 = (this.b - i12) - i12;
            this.c0 = 0.0f;
            this.b0 = 0.0f;
            this.d0 = 0.0f;
            int e11 = l10.e(h10.i(this.a).f());
            xo xoVar = hp.s1(this.a).q4;
            wo d = (xoVar == null || e11 < 7) ? null : xoVar.d(e11);
            if (d == null) {
                int[] iArr = k6.r8;
                f10 = k6.x0(null, iArr[e11 % iArr.length], false);
            } else {
                f10 = d.f();
            }
            this.I.setColor(f10);
            this.c0 = (7.33f * f14) + this.c0;
            this.G = this.a0.f;
            ly0 ly0Var = new ly0(str2, 16.0f, null);
            ly0Var.a.setTextSize(16.0f * f14);
            float f16 = 20.0f * f14;
            ly0Var.p(f15 - f16);
            this.H = ly0Var;
            this.b0 = Math.max(this.b0, Math.min(f16 + ly0Var.c, f15));
            float f17 = 7.0f * f14;
            this.c0 = this.H.i() + this.c0 + f17;
            this.S = webPage.photo != null || zi.L4(webPage.document);
            g0 g0Var = this.a0;
            boolean z10 = g0Var.e;
            this.T = !z10;
            int i13 = (!this.V || (g0Var.a & 4) == 0) ? 2 * ((int) (!z10 ? 48.0f : (f15 / f14) - 40.0f)) : g0Var.i;
            ImageReceiver imageReceiver = this.U;
            imageReceiver.J0((int) (4.0f * f14));
            TLRPC.Photo photo = webPage.photo;
            if (photo != null) {
                TLRPC.PhotoSize w10 = w7.w(photo.sizes, 1, false, null, false);
                f11 = 48.0f;
                TLRPC.PhotoSize w11 = w7.w(webPage.photo.sizes, (int) (i13 * f14), false, w10, false);
                if (w11 != null) {
                    i10 = w11.w;
                    i3 = w11.h;
                } else {
                    i3 = 0;
                    i10 = 0;
                }
                imageReceiver.r0(ac.i(w11, webPage.photo), com.google.android.recaptcha.internal.a.i(i13, "_", i13), this.V ? null : ac.i(w10, webPage.photo), this.V ? null : com.google.android.recaptcha.internal.a.i(i13, "_", i13), null, 0L, null, null, 0);
            } else {
                f11 = 48.0f;
                TLRPC.Document document = webPage.document;
                if (document != null) {
                    TLRPC.PhotoSize w12 = w7.w(document.thumbs, 1, false, null, false);
                    TLRPC.PhotoSize w13 = w7.w(webPage.document.thumbs, (int) (i13 * f14), false, w12, false);
                    if (w13 != null) {
                        i10 = w13.w;
                        i3 = w13.h;
                    } else {
                        i3 = 0;
                        i10 = 0;
                    }
                    imageReceiver.r0(ac.c(w13, webPage.document), com.google.android.recaptcha.internal.a.i(i13, "_", i13), this.V ? null : ac.c(w12, webPage.document), this.V ? null : com.google.android.recaptcha.internal.a.i(i13, "_", i13), null, 0L, null, null, 0);
                } else {
                    i3 = 0;
                    i10 = 0;
                }
            }
            this.d0 = (5.66f * f14) + this.d0;
            boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
            this.L = !isEmpty;
            if (isEmpty) {
                i11 = 0;
            } else {
                ly0 ly0Var2 = new ly0(webPage.site_name, 14.0f, org.telegram.messenger.g0.o());
                ly0Var2.a.setTextSize(f14 * 14.0f);
                float f18 = f14 * 40.0f;
                ly0Var2.p((int) Math.ceil((f15 - f18) - ((this.S && this.T) ? f14 * 60.0f : 0.0f)));
                this.M = ly0Var2;
                this.b0 = Math.max(this.b0, Math.min(f18 + ly0Var2.c + ((this.S && this.T) ? f14 * 60.0f : 0.0f), f15));
                this.d0 = (f14 * 2.66f) + this.M.i() + this.d0;
                i11 = this.M.b.getLineCount();
            }
            boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
            this.J = !isEmpty2;
            if (isEmpty2) {
                f12 = 2.66f;
                f13 = f14;
            } else {
                ly0 ly0Var3 = new ly0(webPage.title, 14.0f, org.telegram.messenger.g0.o());
                ly0Var3.a.setTextSize(f14 * 14.0f);
                float f19 = f14 * 40.0f;
                f12 = 2.66f;
                f13 = f14;
                ly0Var3.p((int) Math.ceil((f15 - f19) - ((this.S && this.T) ? f14 * 60.0f : 0.0f)));
                this.K = ly0Var3;
                this.b0 = Math.max(this.b0, Math.min(f19 + ly0Var3.c + ((this.S && this.T) ? 60.0f * f13 : 0.0f), f15));
                this.d0 = (f13 * 2.66f) + this.K.i() + this.d0;
                i11 += this.K.b.getLineCount();
            }
            boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
            this.N = !isEmpty3;
            if (!isEmpty3) {
                TextPaint textPaint = this.O;
                textPaint.setTextSize(f13 * 14.0f);
                float f20 = f13 * 40.0f;
                int i14 = 3 - i11;
                this.P = org.telegram.ui.Cells.q1.H1(webPage.description, textPaint, (int) Math.ceil(Math.max(1.0f, f15 - f20)), (int) Math.ceil(Math.max(1.0f, f15 - ((40 + ((this.S && this.T) ? 60 : 0)) * f13))), i14, 4);
                this.Q = 0.0f;
                this.R = Float.MAX_VALUE;
                int i15 = 0;
                while (i15 < this.P.getLineCount()) {
                    this.Q = Math.max(this.Q, this.P.getLineWidth(i15) + (this.S && this.T && i15 < i14 ? f13 * f11 : 0.0f));
                    this.R = Math.min(this.R, this.P.getLineLeft(i15));
                    i15++;
                }
                this.b0 = Math.max(this.b0, Math.min(f20 + this.Q, f15));
                this.d0 = (f13 * f12) + this.d0 + this.P.getHeight();
            }
            if (this.S && !this.T) {
                if (i10 <= 0 || i3 <= 0) {
                    this.e0 = f13 * 120.0f;
                } else {
                    this.e0 = Math.min((Math.max(0.0f, this.b0 - (f13 * 40.0f)) / i10) * i3, f13 * 200.0f);
                }
                this.d0 = (f13 * f12) + this.d0 + this.e0;
            }
            float f21 = f17 + this.d0;
            this.d0 = f21;
            this.c0 = (f13 * 11.0f) + this.c0 + f21;
        } else {
            if (TextUtils.isEmpty(this.a0.b)) {
                String str3 = this.a0.c;
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
                str = str3.toUpperCase();
            } else {
                str = this.a0.b;
            }
            float f22 = (this.b - i12) - i12;
            RectF rectF = this.y;
            float f23 = f22 - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f14);
            this.n = 1.0f;
            double d10 = f23;
            float ceil = (int) Math.ceil(d10);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            TextPaint textPaint2 = this.r;
            this.s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, ceil, truncateAt), textPaint2, (int) Math.ceil(d10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.w = 0.0f;
            this.x = Float.MAX_VALUE;
            for (int i16 = 0; i16 < this.s.getLineCount(); i16++) {
                this.w = Math.max(this.w, this.s.getLineWidth(i16));
                this.x = Math.min(this.x, this.s.getLineLeft(i16));
            }
            if (this.s.getLineCount() > 2) {
                this.n = 0.3f;
            } else {
                this.n = Math.min(1.0f, f23 / this.w);
            }
            this.b0 = (this.w * this.n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f14);
            this.c0 = Math.max(f14 * 30.0f, this.s.getHeight() * this.n) + ((rectF.top + rectF.bottom) * f14);
        }
        if (this.d) {
            invalidate();
        } else {
            this.m0.f(this.G, true);
            this.o0.f(this.T, true);
            this.n0.f(this.S, true);
            this.r0.e(true, this.d0);
        }
        this.c = false;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        g0 g0Var = this.a0;
        return (g0Var == null || g0Var.d == null) ? false : true;
    }

    public int getPhotoSide() {
        float f10;
        if (this.T) {
            f10 = 48.0f;
        } else {
            int i3 = this.b;
            int i10 = this.f;
            f10 = (((i3 - i10) - i10) / this.e) - 40.0f;
        }
        return ((int) f10) * 2;
    }

    public int getPreviewType() {
        return this.W;
    }

    public float getRadius() {
        float f10;
        float f11;
        if (e()) {
            f10 = 16.66f;
            f11 = this.e;
        } else {
            f10 = 0.2f;
            f11 = this.c0;
        }
        return f11 * f10;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U.R();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        d();
        int ceil = (int) Math.ceil(this.b0);
        int i11 = this.f;
        int i12 = ceil + i11 + i11;
        int ceil2 = (int) Math.ceil(this.c0);
        int i13 = this.h;
        setMeasuredDimension(i12, ceil2 + i13 + i13);
    }

    public void setMaxWidth(int i3) {
        this.b = i3;
        this.c = true;
    }

    public void setPreviewType(int i3) {
        this.W = i3;
        invalidate();
    }
}
