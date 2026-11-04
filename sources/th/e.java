package th;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ac;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.e20;
import org.telegram.messenger.g0;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.messenger.x5;
import org.telegram.messenger.z5;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e extends Drawable implements x5, lm0 {
    public final boolean E;
    public String F;
    public String G;
    public boolean H;
    public zi I;
    public double J;
    public int K;
    public final mm0 L;
    public float M;
    public float N;
    public jz O;
    public np P;
    public Drawable Q;
    public a R;
    public boolean S;
    public boolean T;
    public TLRPC.MessageMedia U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final qe.a a;
    public final ImageReceiver b;
    public int b0;
    public final int c;
    public int c0;
    public final ViewGroup d;
    public String e;
    public final int e0;
    public String f;
    public int f0;
    public int g0;
    public String h;
    public int h0;
    public ly0 n;
    public ly0 r;
    public ly0 s;
    public ly0 w;
    public final RadialProgress2 y;
    public final Paint x = new Paint(1);
    public int a0 = 0;
    public int d0 = hs.e4;

    public e(int i3, ViewGroup viewGroup, e6 e6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.b = imageReceiver;
        imageReceiver.J0(g0.L(6.0f));
        this.c = i3;
        this.E = z10;
        this.y = new RadialProgress2(viewGroup, e6Var);
        this.d = viewGroup;
        mm0 mm0Var = new mm0(viewGroup);
        this.L = mm0Var;
        mm0Var.h = this;
        this.a = new qe.a(viewGroup, pe.a.a, 180L);
        this.e0 = z5.q(i3).k();
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        e();
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        e();
    }

    public final void a() {
        this.b.P();
        this.y.e();
    }

    public final void b(boolean z10) {
        ly0 ly0Var = this.n;
        if (ly0Var != null) {
            ly0Var.n(k6.x0(null, z10 ? k6.tc : k6.re, false));
        }
        this.x.setColor(1711276032);
        ly0 ly0Var2 = this.w;
        if (ly0Var2 != null) {
            ly0Var2.n(-1);
        }
        jz jzVar = this.O;
        if (jzVar != null) {
            jzVar.m = z10 ? k6.Dc : k6.ef;
        }
        boolean z11 = this.Y;
        RadialProgress2 radialProgress2 = this.y;
        if (!z11 && !this.X) {
            radialProgress2.g(k6.Ze, k6.af, k6.bf, k6.cf);
            return;
        }
        mm0 mm0Var = this.L;
        if (z10) {
            int x02 = k6.x0(null, k6.kc, false);
            int x03 = k6.x0(null, k6.lc, false);
            int i3 = k6.nc;
            mm0Var.g(x02, x03, k6.x0(null, i3, false), k6.x0(null, i3, false), k6.x0(null, k6.mc, false));
            radialProgress2.g(k6.Bc, k6.Cc, k6.Db, k6.Eb);
            return;
        }
        radialProgress2.g(k6.We, k6.Xe, k6.id, k6.jd);
        int x04 = k6.x0(null, k6.ie, false);
        int x05 = k6.x0(null, k6.je, false);
        int i10 = k6.le;
        mm0Var.g(x04, x05, k6.x0(null, i10, false), k6.x0(null, i10, false), k6.x0(null, k6.ke, false));
    }

    @Override // org.telegram.ui.Components.lm0
    public final void c(float f10) {
        if (j()) {
            MediaController.B().i0(MediaController.B().v0, f10);
            p(true);
        }
    }

    @Override // org.telegram.ui.Components.lm0
    public final void d(float f10) {
        if (j()) {
            zi ziVar = MediaController.B().v0;
            ziVar.b0 = f10;
            ziVar.g0 = (int) (ziVar.L0() * f10);
            p(true);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.d0 == 0 || bounds.isEmpty()) {
            return;
        }
        f(false);
        boolean z10 = this.X;
        int i3 = 2;
        RadialProgress2 radialProgress2 = this.y;
        if (z10 || this.Y) {
            int i10 = bounds.left;
            boolean z11 = this.E;
            int L = i10 + (z11 ? 0 : g0.L(8.0f));
            int L2 = bounds.top + (z11 ? 0 : g0.L(3.0f));
            int L3 = this.Y ? 0 : g0.L(3.0f);
            ly0 ly0Var = this.n;
            if (ly0Var != null) {
                ly0Var.e(canvas, g0.L(56.0f) + L, g0.L(15.0f) + L2 + L3);
            }
            if (this.Y) {
                float f10 = this.a.e;
                if (this.r != null && f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    int i11 = L2 + L3;
                    canvas.scale(f11, f11, g0.L(56.0f) + L, g0.L(35.0f) + i11);
                    this.r.a.setAlpha((int) (f11 * 255.0f));
                    this.r.e(canvas, g0.L(56.0f) + L, g0.L(35.0f) + i11);
                    canvas.restore();
                }
                if (f10 > 0.0f) {
                    mm0 mm0Var = this.L;
                    mm0Var.t = f10;
                    mm0Var.i(q.w(56.0f, L, bounds.right), g0.L(30.0f));
                    canvas.save();
                    float L4 = g0.L(45.0f) + L;
                    this.M = L4;
                    float L5 = g0.L(21.0f) + L2 + L3;
                    this.N = L5;
                    canvas.translate(L4, L5);
                    mm0Var.b(canvas);
                    canvas.restore();
                }
            }
            ly0 ly0Var2 = this.s;
            if (ly0Var2 != null) {
                ly0Var2.e(canvas, g0.L(56.0f) + L, g0.L((this.Y ? 20 : 2) + 34) + L3 + L2);
            }
            int L6 = g0.L(2.0f) + L;
            this.b0 = L6;
            int L7 = g0.L(5.0f) + L2;
            this.c0 = L7;
            radialProgress2.r(L6, L7, g0.L(44.0f) + g0.L(2.0f) + L, g0.L(44.0f) + g0.L(5.0f) + L2);
        } else {
            ImageReceiver imageReceiver = this.b;
            imageReceiver.setAlpha(this.d0 / 255.0f);
            imageReceiver.z0(bounds);
            imageReceiver.h(canvas, null);
            if (this.Z && (drawable = this.Q) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.Q.getIntrinsicHeight() * 0.8f);
                int z12 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - xq.k.getInterpolation(imageReceiver.i1)) * g0.L(16.0f)));
                this.Q.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.i1 * 5.0f) * 255.0f));
                this.Q.setBounds(z12, interpolation, intrinsicWidth + z12, intrinsicHeight + interpolation);
                this.Q.draw(canvas);
            }
            radialProgress2.r(bounds.centerX() - g0.L(22.0f), bounds.centerY() - g0.L(22.0f), g0.L(22.0f) + bounds.centerX(), g0.L(22.0f) + bounds.centerY());
            if (this.H && this.w != null) {
                canvas.drawRoundRect(g0.L(6.0f) + bounds.left, g0.L(6.0f) + bounds.top, bounds.left + this.w.c + g0.L(18.0f), g0.L(23.0f) + bounds.top, g0.L(8.5f), g0.L(8.5f), this.x);
                this.w.e(canvas, g0.L(12.0f) + bounds.left, g0.L(15.0f) + bounds.top);
            }
        }
        if (this.Z) {
            return;
        }
        zi ziVar = this.I;
        if (ziVar == null || !ziVar.p4()) {
            a aVar = this.R;
            if (aVar == null || !aVar.g) {
                if (this.Y) {
                    if (aVar != null && aVar.f) {
                        i3 = 4;
                    }
                    m(i3, true);
                } else {
                    l(g());
                }
            } else if (this.Y) {
                m(3, true);
            } else {
                l(3);
            }
        } else if (zb.D().x(this.G) == null) {
            radialProgress2.p(true, 1.0f);
            if (this.Y) {
                m(6, true);
            } else {
                l(6);
            }
        }
        if (this.Y) {
            l(g());
        }
        radialProgress2.draw(canvas);
    }

    public final void e() {
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void f(boolean z10) {
        int width = getBounds().width() - g0.L(this.E ? 64.0f : 72.0f);
        if (this.a0 != width || z10) {
            this.a0 = width;
            String str = this.e;
            if (str != null) {
                if (this.n == null) {
                    this.n = new ly0(str, 15.0f, g0.o());
                }
                ly0 ly0Var = this.n;
                ly0Var.q(TextUtils.ellipsize(this.e, ly0Var.a, width, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                if (this.r == null) {
                    this.r = new ly0(str2, 14.0f, null);
                }
                ly0 ly0Var2 = this.r;
                ly0Var2.q(TextUtils.ellipsize(this.f, ly0Var2.a, width, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.s == null) {
                    this.s = new ly0(str3, 12.0f, null);
                }
                ly0 ly0Var3 = this.s;
                ly0Var3.q(TextUtils.ellipsize(this.h, ly0Var3.a, width, TextUtils.TruncateAt.END));
            }
            if (this.H && this.w == null) {
                this.w = new ly0(g0.g0(this.K, true, false), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z10 = this.Y;
        if (z10 && this.a.f) {
            return !MediaController.B().H() ? 1 : 0;
        }
        if (this.H || z10) {
            return 0;
        }
        if (!this.X) {
            return 4;
        }
        a aVar = this.R;
        return (aVar == null || !aVar.f) ? 2 : 5;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d0;
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.e0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i3) {
        if (this.Y) {
            return g0.L(63.0f);
        }
        if (this.X) {
            return g0.L(56.0f);
        }
        int i10 = this.V;
        if (i10 == 0) {
            return g0.L(100.0f);
        }
        return Math.min(Math.round((i3 / i10) * this.W), this.E ? (i3 * 4) / 5 : (i3 * 5) / 4);
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.y.p(true, min);
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
        if (this.Y) {
            m(min >= 1.0f ? 4 : 3, true);
        } else {
            l(min >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    public final boolean j() {
        return this.Y && MediaController.B().I(this.I) && MediaController.B().v0 != null && MediaController.B().v0.k0 == this.E;
    }

    public final boolean k(float f10, float f11, int i3) {
        if (!this.Y || this.g0 == 4) {
            return false;
        }
        if (i3 == 0) {
            int L = g0.L(36.0f);
            int L2 = g0.L(27.0f);
            if (f10 >= this.b0 + L2 && f10 <= r4 + L) {
                if (f11 >= this.c0 + L2 && f11 <= r7 + L) {
                    this.S = true;
                    return true;
                }
            }
        }
        boolean z10 = this.S;
        if (z10) {
            if (i3 == 1) {
                a aVar = this.R;
                if (aVar != null) {
                    TLRPC.Document document = aVar.b;
                    int i10 = aVar.a;
                    if (aVar.g) {
                        w7.G(i10).f(document);
                        aVar.a();
                    } else if (!aVar.f) {
                        w7.G(i10).X(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    e();
                }
                this.S = false;
                return true;
            }
            if (i3 == 3) {
                this.S = false;
                return true;
            }
        }
        return z10;
    }

    public final void l(int i3) {
        if (this.f0 != i3) {
            this.f0 = i3;
            this.y.setIcon(i3, true, true);
        }
    }

    public final void m(int i3, boolean z10) {
        if (this.g0 != i3) {
            this.g0 = i3;
            this.y.k(i3, true, z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(zi ziVar, TLRPC.MessageMedia messageMedia, zi ziVar2, int i3, String str, boolean z10) {
        boolean z11;
        boolean z12;
        TLRPC.Document document;
        int i10;
        double d;
        String str2 = this.F;
        this.V = 0;
        this.W = 0;
        this.I = ziVar;
        this.U = messageMedia;
        this.X = false;
        this.Y = false;
        this.H = false;
        this.Z = false;
        this.J = 0.0d;
        this.K = 0;
        this.G = str;
        this.F = null;
        this.R = null;
        int i11 = this.c;
        RadialProgress2 radialProgress2 = this.y;
        ImageReceiver imageReceiver = this.b;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                TLRPC.PhotoSize w10 = w7.w(photo.sizes, 40, false, null, false);
                TLRPC.PhotoSize w11 = w7.w(photo.sizes, g0.Z0(false), true, w10, true);
                if (w11 != null) {
                    int i12 = w11.w;
                    this.V = i12;
                    int i13 = w11.h;
                    this.W = i13;
                    Locale locale = Locale.US;
                    float f10 = g0.p;
                    String i14 = com.google.android.recaptcha.internal.a.i((int) (i12 / f10), "_", (int) (i13 / f10));
                    String concat = i14.concat("_b");
                    this.F = !TextUtils.isEmpty(str) ? str : zi.U0(messageMedia);
                    z12 = true;
                    imageReceiver.r0(ac.f(w11, photo), i14, ac.f(w10, photo), concat, null, w11.size, null, ziVar2, 1);
                    z11 = z12;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                z12 = true;
                if (messageMedia.geo != null) {
                    if (this.O == null) {
                        jz c2 = t5.c((k6.I.q() ? 3 : 6) * 0.12f, k6.Dc);
                        this.O = c2;
                        c2.t = true;
                        this.P = new np(c2);
                    }
                    if (this.Q == null) {
                        this.Q = this.d.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    this.Z = true;
                    this.V = i3;
                    int i15 = (i3 * 9) / 16;
                    this.W = i15;
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    float f11 = g0.p;
                    imageReceiver.s0(ac.p(e20.b(geoPoint, (int) (i3 / f11), (int) (i15 / f11), 15, Math.min(2, (int) Math.ceil(f11)))), null, null, null, this.P, ziVar2, 0);
                    z11 = z12;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) != null) {
                this.R = new a(i11, ziVar, document, str);
                this.F = !TextUtils.isEmpty(str) ? str : zi.U0(messageMedia);
                if (zi.K3(document)) {
                    this.Y = true;
                    this.e = zi.y1(document);
                    this.f = zi.w1(document);
                    int i16 = 0;
                    while (true) {
                        if (i16 >= document.attributes.size()) {
                            d = 0.0d;
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i16);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            d = documentAttribute.duration;
                            break;
                        }
                        i16++;
                    }
                    if (zi.X2(document)) {
                        TLRPC.PhotoSize w12 = w7.w(document.thumbs, g0.L(22.0f), true, null, false);
                        radialProgress2.j(w7.w(document.thumbs, g0.L(44.0f), true, w12, true), w12, document, this.I);
                    } else {
                        String t02 = zi.t0(document, true);
                        if (TextUtils.isEmpty(t02)) {
                            radialProgress2.i(null, null, null);
                        } else {
                            radialProgress2.h(t02);
                        }
                    }
                    this.J = d;
                    this.h = g0.k0(j() ? MediaController.B().v0.g0 : 0, (int) this.J);
                    z12 = true;
                } else if (zi.L4(document)) {
                    this.K = (int) Math.max(1L, Math.round(zi.H0(document)));
                    this.H = true;
                    TLRPC.PhotoSize w13 = w7.w(document.thumbs, g0.Z0(false), true, null, true);
                    float f12 = i3;
                    TLRPC.PhotoSize w14 = w7.w(document.thumbs, (int) (f12 / g0.p), false, w13, false);
                    ac c10 = ac.c(w13, document);
                    ac c11 = ac.c(w14, document);
                    int i17 = (int) (f12 / g0.p);
                    if (w13 != null) {
                        int i18 = w13.w;
                        this.V = i18;
                        int i19 = w13.h;
                        this.W = i19;
                        if (i18 != 0) {
                            i10 = (i19 * i17) / i18;
                            String i20 = com.google.android.recaptcha.internal.a.i(i17, "_", i10);
                            z12 = true;
                            imageReceiver.u0(null, i20, c10, i20, c11, i20, null, 0L, null, ziVar2, 0);
                        }
                        i10 = i17;
                        String i202 = com.google.android.recaptcha.internal.a.i(i17, "_", i10);
                        z12 = true;
                        imageReceiver.u0(null, i202, c10, i202, c11, i202, null, 0L, null, ziVar2, 0);
                    } else {
                        if (w14 != null) {
                            int i21 = w14.w;
                            this.V = i21;
                            int i22 = w14.h;
                            this.W = i22;
                            if (i21 != 0) {
                                i10 = (i22 * i17) / i21;
                                String i2022 = com.google.android.recaptcha.internal.a.i(i17, "_", i10);
                                z12 = true;
                                imageReceiver.u0(null, i2022, c10, i2022, c11, i2022, null, 0L, null, ziVar2, 0);
                            }
                        }
                        i10 = i17;
                        String i20222 = com.google.android.recaptcha.internal.a.i(i17, "_", i10);
                        z12 = true;
                        imageReceiver.u0(null, i20222, c10, i20222, c11, i20222, null, 0L, null, ziVar2, 0);
                    }
                } else {
                    z12 = true;
                    this.X = true;
                    this.e = w7.B(document);
                    String str3 = g0.i0(document.size, false, false) + " " + w7.A(document);
                    this.h = str3;
                    this.f = str3;
                }
                f(z12);
                z11 = z12;
            }
            this.T = z11;
            if (!z11) {
                imageReceiver.f();
            }
            if (!TextUtils.equals(str2, this.F)) {
                if (!TextUtils.isEmpty(str2)) {
                    z5.q(i11).v(this);
                }
                if (!TextUtils.isEmpty(this.F)) {
                    z5.q(i11).a(this.F, null, this);
                }
            }
            if (!this.Y) {
                radialProgress2.i(null, null, null);
                m(4, false);
            }
            p(z10);
        }
        z11 = false;
        this.T = z11;
        if (!z11) {
        }
        if (!TextUtils.equals(str2, this.F)) {
        }
        if (!this.Y) {
        }
        p(z10);
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.y.p(true, min);
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
        if (this.Y) {
            m(min >= 1.0f ? 4 : 3, true);
        } else {
            l(min >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    public final void p(boolean z10) {
        int i3;
        if (!this.Y || this.I == null) {
            return;
        }
        zi ziVar = MediaController.B().v0;
        boolean j10 = j();
        this.a.a(j10, z10);
        if (ziVar == null || !j10) {
            i3 = 0;
        } else {
            i3 = ziVar.g0;
            mm0 mm0Var = this.L;
            if (!mm0Var.e) {
                mm0Var.h(ziVar.b0);
                mm0Var.q = ziVar.e0;
            }
            mm0Var.j(ziVar);
        }
        if (this.h0 != i3) {
            this.h0 = i3;
            this.h = g0.k0(i3, (int) this.J);
            f(true);
            this.d.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.d0 = i3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
