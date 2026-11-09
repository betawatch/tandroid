package tg;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fp;
import org.telegram.messenger.gp;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class i0 extends View {
    public final Drawable D;
    public final Paint E;
    public boolean F;
    public ny0 G;
    public final Paint H;
    public boolean I;
    public ny0 J;
    public boolean K;
    public ny0 L;
    public boolean M;
    public final TextPaint N;
    public StaticLayout O;
    public float P;
    public float Q;
    public boolean R;
    public boolean S;
    public final ImageReceiver T;
    public boolean U;
    public int V;
    public h0 W;
    public int a;
    public float a0;
    public int b;
    public float b0;
    public boolean c;
    public float c0;
    public boolean d;
    public float d0;
    public final float e;
    public int e0;
    public final int f;
    public final RectF f0;
    public final RectF g0;
    public final int h;
    public final Path h0;
    public final Path i0;
    public final RectF j0;
    public final RectF k0;
    public final w5 l0;
    public final w5 m0;
    public float n;
    public final w5 n0;
    public final w5 o0;
    public final w5 p0;
    public final w5 q0;
    public final TextPaint r;
    public final w5 r0;
    public StaticLayout s;
    public final w5 s0;
    public float w;
    public float x;
    public final RectF y;

    public i0(Context context, float f10) {
        super(context);
        this.c = true;
        this.n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        this.y = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.E = new Paint(1);
        this.H = new Paint(1);
        this.N = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.T = imageReceiver;
        this.f0 = new RectF();
        this.g0 = new RectF();
        this.h0 = new Path();
        this.i0 = new Path();
        this.j0 = new RectF();
        this.k0 = new RectF();
        xq xqVar = xq.h;
        this.l0 = new w5(this, 0L, 350L, xqVar);
        this.m0 = new w5(this, 0L, 350L, xqVar);
        this.n0 = new w5(this, 0L, 350L, xqVar);
        this.o0 = new w5(this, 0L, 350L, xqVar);
        this.p0 = new w5(this, 0L, 350L, xqVar);
        this.q0 = new w5(this, 0L, 350L, xqVar);
        this.r0 = new w5(this, 0L, 350L, xqVar);
        this.s0 = new w5(this, 0L, 350L, xqVar);
        this.e = f10;
        imageReceiver.J0 = true;
        this.f = (int) (f10 * 3.0f);
        this.h = (int) (f10 * 1.0f);
        this.D = jg.g.h(context, R.drawable.story_link);
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
        ny0 ny0Var;
        ny0 ny0Var2;
        Canvas canvas2 = canvas;
        d();
        float e10 = this.r0.e(false, this.a0);
        float e11 = this.s0.e(false, this.b0);
        float d2 = this.p0.d(this.V == 0);
        float d10 = this.o0.d(e());
        float f19 = this.e;
        float T1 = org.telegram.messenger.g0.T1(0.2f * e11, 16.66f * f19, d10);
        int i7 = this.f;
        int i10 = this.h;
        RectF rectF = this.f0;
        rectF.set(i7, i10, i7 + e10, i10 + e11);
        int f20 = i0.a.f(d10, this.e0, i0.a.f(d2, -1, -14670807));
        Paint paint = this.E;
        paint.setColor(f20);
        Path path = this.i0;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, T1, T1, direction2);
        canvas2.drawPath(path, paint);
        if (d10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i7, i10);
            float d11 = this.l0.d(this.F);
            float f21 = (7.33f * f19) + 0.0f;
            ny0 ny0Var3 = this.G;
            if (ny0Var3 == null || d11 <= 0.0f) {
                f12 = d11;
                f10 = 1.0f;
                f13 = d10;
                f11 = 2.0f;
                direction = direction2;
            } else {
                f11 = 2.0f;
                direction = direction2;
                f12 = d11;
                f10 = 1.0f;
                ny0Var3.c(f19 * 10.0f, com.google.android.recaptcha.internal.a.v(1.0f, d11, (15.0f * f19) + this.G.i(), (ny0Var3.i() / 2.0f) + f21), d10, -15033089, canvas2);
                f13 = d10;
                f21 = (((7.0f * f19) + this.G.i()) * f12) + f21;
            }
            float f22 = f21;
            float e12 = this.q0.e(false, this.c0);
            Paint paint2 = this.H;
            paint2.setAlpha(25);
            float f23 = e12 + f22;
            RectF rectF2 = this.g0;
            rectF2.set(f19 * 10.0f, f22, e10 - (f19 * 10.0f), f23);
            Path path2 = this.h0;
            path2.rewind();
            path2.addRoundRect(rectF2, f19 * 5.0f, f19 * 5.0f, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(qs.e4);
            canvas2.drawRect(f19 * 10.0f, f22, 13.0f * f19, f23, paint2);
            canvas.restore();
            float f24 = (5.66f * f19) + f22;
            if (this.K) {
                ny0 ny0Var4 = this.L;
                if (ny0Var4 != null) {
                    float i11 = (ny0Var4.i() / f11) + f24;
                    int color = paint2.getColor();
                    f14 = e10;
                    d10 = f13;
                    f16 = f12;
                    f17 = 2.66f;
                    ny0Var4.c(f19 * 20.0f, i11, d10, color, canvas);
                    f15 = rf.b.d(f19, 2.66f, this.L.i(), f24);
                    if (this.I || (ny0Var2 = this.J) == null) {
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        ny0Var2.c(f19 * 20.0f, (ny0Var2.i() / f11) + f15, d10, i0.a.f(d2, -13421773, -1), canvas2);
                        f15 = rf.b.d(f19, f17, this.J.i(), f15);
                    }
                    if (this.M && this.O != null) {
                        canvas2.save();
                        canvas2.translate((f19 * 20.0f) - this.Q, f15);
                        this.N.setColor(i0.a.f(d2, -13421773, -1));
                        this.N.setAlpha((int) (255.0f * d10));
                        this.O.draw(canvas2);
                        canvas2.restore();
                        f15 = rf.b.d(f19, f17, this.O.getHeight(), f15);
                    }
                    d = this.m0.d(this.R);
                    if (d > 0.0f) {
                        float d12 = this.n0.d(this.S);
                        this.j0.set(f19 * 20.0f, (f19 * f17) + f15, f14 - (20.0f * f19), (f19 * f17) + f15 + this.d0);
                        this.k0.set(((f14 - (f19 * 10.0f)) - (f19 * 6.0f)) - (48.0f * f19), (f19 * 6.0f) + f22, (f14 - (f19 * 10.0f)) - (f19 * 6.0f), (48.0f * f19) + (6.0f * f19) + f22);
                        org.telegram.messenger.g0.Z1(this.j0, this.k0, d12, rectF2);
                        float f25 = rectF2.left;
                        float f26 = rectF2.top;
                        float width = rectF2.width();
                        float height = rectF2.height();
                        ImageReceiver imageReceiver = this.T;
                        imageReceiver.y0(f25, f26, width, height);
                        imageReceiver.setAlpha(d * d10);
                        imageReceiver.h(canvas2, null);
                        f15 = org.telegram.messenger.camera.q.b(f19 * f17, this.d0, f10 - d12, f15);
                    }
                    f18 = (5.0f * f19) + (7.0f * f19) + f15;
                    ny0Var = this.G;
                    if (ny0Var != null && f10 - f16 > 0.0f) {
                        ny0Var.c(f19 * 10.0f, (ny0Var.i() / f11) + f18 + (((15.0f * f19) + this.G.i()) * f16), d10, -15033089, canvas2);
                        this.G.i();
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
            d10 = f13;
            f16 = f12;
            f17 = 2.66f;
            if (this.I) {
            }
            canvas2 = canvas;
            if (this.M) {
                canvas2.save();
                canvas2.translate((f19 * 20.0f) - this.Q, f15);
                this.N.setColor(i0.a.f(d2, -13421773, -1));
                this.N.setAlpha((int) (255.0f * d10));
                this.O.draw(canvas2);
                canvas2.restore();
                f15 = rf.b.d(f19, f17, this.O.getHeight(), f15);
            }
            d = this.m0.d(this.R);
            if (d > 0.0f) {
            }
            f18 = (5.0f * f19) + (7.0f * f19) + f15;
            ny0Var = this.G;
            if (ny0Var != null) {
                ny0Var.c(f19 * 10.0f, (ny0Var.i() / f11) + f18 + (((15.0f * f19) + this.G.i()) * f16), d10, -15033089, canvas2);
                this.G.i();
            }
            canvas2.restore();
        } else {
            f10 = 1.0f;
            f11 = 2.0f;
        }
        if (d10 < f10) {
            float f27 = this.y.left;
            float f28 = f11;
            int y10 = ((int) com.google.android.recaptcha.internal.a.y(f19, 30.0f, e11, f28)) + i10;
            Drawable drawable = this.D;
            drawable.setBounds(((int) (f27 * f19)) + i7, ((int) com.google.android.recaptcha.internal.a.w(f19, 30.0f, e11, f28)) + i10, ((int) ((f27 + 30.0f) * f19)) + i7, y10);
            int i12 = (int) ((f10 - d10) * 255.0f);
            drawable.setAlpha(i12);
            drawable.draw(canvas2);
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(((this.y.left + 30.0f + 3.25f) * f19) + i7, (e11 / 2.0f) + i10);
                float f29 = this.n;
                canvas2.scale(f29, f29);
                canvas2.translate(-this.x, (-this.s.getHeight()) / 2.0f);
                this.r.setAlpha(i12);
                this.s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i7, h0 h0Var, boolean z9) {
        this.a = i7;
        if (this.W != h0Var || z9) {
            this.W = h0Var;
            this.c = true;
            this.d = z9;
            requestLayout();
        }
    }

    public final void c(int i7, int i10) {
        Drawable drawable = this.D;
        TextPaint textPaint = this.r;
        if (i7 == 0) {
            this.e0 = i10;
            int i11 = org.telegram.messenger.g0.B(i10) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i11);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        } else if (i7 == 1) {
            this.e0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i7 == 2) {
            this.e0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.e0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        int f10;
        float f11;
        int i7;
        int i10;
        int i11;
        float f12;
        float f13;
        if (!this.c || this.W == null) {
            return;
        }
        boolean e10 = e();
        int i12 = this.f;
        float f14 = this.e;
        if (e10) {
            String str2 = TextUtils.isEmpty(this.W.b) ? this.W.c : this.W.b;
            TLRPC.WebPage webPage = this.W.d;
            float f15 = (this.b - i12) - i12;
            this.b0 = 0.0f;
            this.a0 = 0.0f;
            this.c0 = 0.0f;
            int e11 = t10.e(p10.i(this.a).f());
            gp gpVar = qp.s1(this.a).q4;
            fp d = (gpVar == null || e11 < 7) ? null : gpVar.d(e11);
            if (d == null) {
                int[] iArr = l6.r8;
                f10 = l6.x0(null, iArr[e11 % iArr.length], false);
            } else {
                f10 = d.f();
            }
            this.H.setColor(f10);
            this.b0 = (7.33f * f14) + this.b0;
            this.F = this.W.f;
            ny0 ny0Var = new ny0(str2, 16.0f, null);
            ny0Var.a.setTextSize(16.0f * f14);
            float f16 = 20.0f * f14;
            ny0Var.p(f15 - f16);
            this.G = ny0Var;
            this.a0 = Math.max(this.a0, Math.min(f16 + ny0Var.c, f15));
            float f17 = 7.0f * f14;
            this.b0 = this.G.i() + this.b0 + f17;
            this.R = webPage.photo != null || ij.K4(webPage.document);
            h0 h0Var = this.W;
            boolean z9 = h0Var.e;
            this.S = !z9;
            int i13 = (!this.U || (h0Var.a & 4) == 0) ? 2 * ((int) (!z9 ? 48.0f : (f15 / f14) - 40.0f)) : h0Var.i;
            ImageReceiver imageReceiver = this.T;
            imageReceiver.J0((int) (4.0f * f14));
            TLRPC.Photo photo = webPage.photo;
            if (photo != null) {
                TLRPC.PhotoSize w10 = w7.w(photo.sizes, 1, false, null, false);
                f11 = 48.0f;
                TLRPC.PhotoSize w11 = w7.w(webPage.photo.sizes, (int) (i13 * f14), false, w10, false);
                if (w11 != null) {
                    i10 = w11.w;
                    i7 = w11.h;
                } else {
                    i7 = 0;
                    i10 = 0;
                }
                imageReceiver.r0(hc.i(w11, webPage.photo), com.google.android.recaptcha.internal.a.j(i13, "_", i13), this.U ? null : hc.i(w10, webPage.photo), this.U ? null : com.google.android.recaptcha.internal.a.j(i13, "_", i13), null, 0L, null, null, 0);
            } else {
                f11 = 48.0f;
                TLRPC.Document document = webPage.document;
                if (document != null) {
                    TLRPC.PhotoSize w12 = w7.w(document.thumbs, 1, false, null, false);
                    TLRPC.PhotoSize w13 = w7.w(webPage.document.thumbs, (int) (i13 * f14), false, w12, false);
                    if (w13 != null) {
                        i10 = w13.w;
                        i7 = w13.h;
                    } else {
                        i7 = 0;
                        i10 = 0;
                    }
                    imageReceiver.r0(hc.c(w13, webPage.document), com.google.android.recaptcha.internal.a.j(i13, "_", i13), this.U ? null : hc.c(w12, webPage.document), this.U ? null : com.google.android.recaptcha.internal.a.j(i13, "_", i13), null, 0L, null, null, 0);
                } else {
                    i7 = 0;
                    i10 = 0;
                }
            }
            this.c0 = (5.66f * f14) + this.c0;
            boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
            this.K = !isEmpty;
            if (isEmpty) {
                i11 = 0;
            } else {
                ny0 ny0Var2 = new ny0(webPage.site_name, 14.0f, org.telegram.messenger.g0.o());
                ny0Var2.a.setTextSize(f14 * 14.0f);
                float f18 = f14 * 40.0f;
                ny0Var2.p((int) Math.ceil((f15 - f18) - ((this.R && this.S) ? f14 * 60.0f : 0.0f)));
                this.L = ny0Var2;
                this.a0 = Math.max(this.a0, Math.min(f18 + ny0Var2.c + ((this.R && this.S) ? f14 * 60.0f : 0.0f), f15));
                this.c0 = (f14 * 2.66f) + this.L.i() + this.c0;
                i11 = this.L.b.getLineCount();
            }
            boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
            this.I = !isEmpty2;
            if (isEmpty2) {
                f12 = 2.66f;
                f13 = f14;
            } else {
                ny0 ny0Var3 = new ny0(webPage.title, 14.0f, org.telegram.messenger.g0.o());
                ny0Var3.a.setTextSize(f14 * 14.0f);
                float f19 = f14 * 40.0f;
                f12 = 2.66f;
                f13 = f14;
                ny0Var3.p((int) Math.ceil((f15 - f19) - ((this.R && this.S) ? f14 * 60.0f : 0.0f)));
                this.J = ny0Var3;
                this.a0 = Math.max(this.a0, Math.min(f19 + ny0Var3.c + ((this.R && this.S) ? 60.0f * f13 : 0.0f), f15));
                this.c0 = (f13 * 2.66f) + this.J.i() + this.c0;
                i11 += this.J.b.getLineCount();
            }
            boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
            this.M = !isEmpty3;
            if (!isEmpty3) {
                TextPaint textPaint = this.N;
                textPaint.setTextSize(f13 * 14.0f);
                float f20 = f13 * 40.0f;
                int i14 = 3 - i11;
                this.O = org.telegram.ui.Cells.q1.H1(webPage.description, textPaint, (int) Math.ceil(Math.max(1.0f, f15 - f20)), (int) Math.ceil(Math.max(1.0f, f15 - ((40 + ((this.R && this.S) ? 60 : 0)) * f13))), i14, 4);
                this.P = 0.0f;
                this.Q = Float.MAX_VALUE;
                int i15 = 0;
                while (i15 < this.O.getLineCount()) {
                    this.P = Math.max(this.P, this.O.getLineWidth(i15) + (this.R && this.S && i15 < i14 ? f13 * f11 : 0.0f));
                    this.Q = Math.min(this.Q, this.O.getLineLeft(i15));
                    i15++;
                }
                this.a0 = Math.max(this.a0, Math.min(f20 + this.P, f15));
                this.c0 = (f13 * f12) + this.c0 + this.O.getHeight();
            }
            if (this.R && !this.S) {
                if (i10 <= 0 || i7 <= 0) {
                    this.d0 = f13 * 120.0f;
                } else {
                    this.d0 = Math.min((Math.max(0.0f, this.a0 - (f13 * 40.0f)) / i10) * i7, f13 * 200.0f);
                }
                this.c0 = (f13 * f12) + this.c0 + this.d0;
            }
            float f21 = f17 + this.c0;
            this.c0 = f21;
            this.b0 = (f13 * 11.0f) + this.b0 + f21;
        } else {
            if (TextUtils.isEmpty(this.W.b)) {
                String str3 = this.W.c;
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
                str = str3.toUpperCase();
            } else {
                str = this.W.b;
            }
            float f22 = (this.b - i12) - i12;
            RectF rectF = this.y;
            float f23 = f22 - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f14);
            this.n = 1.0f;
            double d2 = f23;
            float ceil = (int) Math.ceil(d2);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            TextPaint textPaint2 = this.r;
            this.s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, ceil, truncateAt), textPaint2, (int) Math.ceil(d2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            this.a0 = (this.w * this.n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f14);
            this.b0 = Math.max(f14 * 30.0f, this.s.getHeight() * this.n) + ((rectF.top + rectF.bottom) * f14);
        }
        if (this.d) {
            invalidate();
        } else {
            this.l0.f(this.F, true);
            this.n0.f(this.S, true);
            this.m0.f(this.R, true);
            this.q0.e(true, this.c0);
        }
        this.c = false;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        h0 h0Var = this.W;
        return (h0Var == null || h0Var.d == null) ? false : true;
    }

    public int getPhotoSide() {
        float f10;
        if (this.S) {
            f10 = 48.0f;
        } else {
            int i7 = this.b;
            int i10 = this.f;
            f10 = (((i7 - i10) - i10) / this.e) - 40.0f;
        }
        return ((int) f10) * 2;
    }

    public int getPreviewType() {
        return this.V;
    }

    public float getRadius() {
        float f10;
        float f11;
        if (e()) {
            f10 = 16.66f;
            f11 = this.e;
        } else {
            f10 = 0.2f;
            f11 = this.b0;
        }
        return f11 * f10;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T.R();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        d();
        int ceil = (int) Math.ceil(this.a0);
        int i11 = this.f;
        int i12 = ceil + i11 + i11;
        int ceil2 = (int) Math.ceil(this.b0);
        int i13 = this.h;
        setMeasuredDimension(i12, ceil2 + i13 + i13);
    }

    public void setMaxWidth(int i7) {
        this.b = i7;
        this.c = true;
    }

    public void setPreviewType(int i7) {
        this.V = i7;
        invalidate();
    }
}
