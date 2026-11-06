package sh;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.m20;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.messenger.x5;
import org.telegram.messenger.z5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class e extends Drawable implements x5, im0 {
    public final boolean D;
    public String E;
    public String F;
    public boolean G;
    public ij H;
    public double I;
    public int J;
    public final jm0 K;
    public float L;
    public float M;
    public rz N;
    public np O;
    public Drawable P;
    public a Q;
    public boolean R;
    public boolean S;
    public TLRPC.MessageMedia T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public final te.a a;
    public int a0;
    public final ImageReceiver b;
    public int b0;
    public final int c;
    public final ViewGroup d;
    public final int d0;
    public String e;
    public int e0;
    public String f;
    public int f0;
    public int g0;
    public String h;
    public my0 n;
    public my0 r;
    public my0 s;
    public my0 w;
    public final RadialProgress2 y;
    public final Paint x = new Paint(1);
    public int Z = 0;
    public int c0 = qs.e4;

    public e(int i7, ViewGroup viewGroup, f6 f6Var, boolean z9) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.b = imageReceiver;
        imageReceiver.J0(g0.L(6.0f));
        this.c = i7;
        this.D = z9;
        this.y = new RadialProgress2(viewGroup, f6Var);
        this.d = viewGroup;
        jm0 jm0Var = new jm0(viewGroup);
        this.K = jm0Var;
        jm0Var.h = this;
        this.a = new te.a(viewGroup, se.a.a, 180L);
        this.d0 = z5.q(i7).k();
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        e();
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        e();
    }

    @Override // org.telegram.ui.Components.im0
    public final void a(float f10) {
        if (j()) {
            MediaController.B().i0(MediaController.B().u0, f10);
            p(true);
        }
    }

    public final void b() {
        this.b.P();
        this.y.e();
    }

    public final void c(boolean z9) {
        my0 my0Var = this.n;
        if (my0Var != null) {
            my0Var.n(k6.x0(null, z9 ? k6.tc : k6.re, false));
        }
        this.x.setColor(1711276032);
        my0 my0Var2 = this.w;
        if (my0Var2 != null) {
            my0Var2.n(-1);
        }
        rz rzVar = this.N;
        if (rzVar != null) {
            rzVar.m = z9 ? k6.Dc : k6.ef;
        }
        boolean z10 = this.X;
        RadialProgress2 radialProgress2 = this.y;
        if (!z10 && !this.W) {
            radialProgress2.g(k6.Ze, k6.af, k6.bf, k6.cf);
            return;
        }
        jm0 jm0Var = this.K;
        if (z9) {
            int x02 = k6.x0(null, k6.kc, false);
            int x03 = k6.x0(null, k6.lc, false);
            int i7 = k6.nc;
            jm0Var.g(x02, x03, k6.x0(null, i7, false), k6.x0(null, i7, false), k6.x0(null, k6.mc, false));
            radialProgress2.g(k6.Bc, k6.Cc, k6.Db, k6.Eb);
            return;
        }
        radialProgress2.g(k6.We, k6.Xe, k6.id, k6.jd);
        int x04 = k6.x0(null, k6.ie, false);
        int x05 = k6.x0(null, k6.je, false);
        int i10 = k6.le;
        jm0Var.g(x04, x05, k6.x0(null, i10, false), k6.x0(null, i10, false), k6.x0(null, k6.ke, false));
    }

    @Override // org.telegram.ui.Components.im0
    public final void d(float f10) {
        if (j()) {
            ij ijVar = MediaController.B().u0;
            ijVar.b0 = f10;
            ijVar.g0 = (int) (ijVar.L0() * f10);
            p(true);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.c0 == 0 || bounds.isEmpty()) {
            return;
        }
        f(false);
        boolean z9 = this.W;
        int i7 = 2;
        RadialProgress2 radialProgress2 = this.y;
        if (z9 || this.X) {
            int i10 = bounds.left;
            boolean z10 = this.D;
            int L = i10 + (z10 ? 0 : g0.L(8.0f));
            int L2 = bounds.top + (z10 ? 0 : g0.L(3.0f));
            int L3 = this.X ? 0 : g0.L(3.0f);
            my0 my0Var = this.n;
            if (my0Var != null) {
                my0Var.e(canvas, g0.L(56.0f) + L, g0.L(15.0f) + L2 + L3);
            }
            if (this.X) {
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
                    jm0 jm0Var = this.K;
                    jm0Var.t = f10;
                    jm0Var.i(q.w(56.0f, L, bounds.right), g0.L(30.0f));
                    canvas.save();
                    float L4 = g0.L(45.0f) + L;
                    this.L = L4;
                    float L5 = g0.L(21.0f) + L2 + L3;
                    this.M = L5;
                    canvas.translate(L4, L5);
                    jm0Var.b(canvas);
                    canvas.restore();
                }
            }
            my0 my0Var2 = this.s;
            if (my0Var2 != null) {
                my0Var2.e(canvas, g0.L(56.0f) + L, g0.L((this.X ? 20 : 2) + 34) + L3 + L2);
            }
            int L6 = g0.L(2.0f) + L;
            this.a0 = L6;
            int L7 = g0.L(5.0f) + L2;
            this.b0 = L7;
            radialProgress2.r(L6, L7, g0.L(44.0f) + g0.L(2.0f) + L, g0.L(44.0f) + g0.L(5.0f) + L2);
        } else {
            ImageReceiver imageReceiver = this.b;
            imageReceiver.setAlpha(this.c0 / 255.0f);
            imageReceiver.z0(bounds);
            imageReceiver.h(canvas, null);
            if (this.Y && (drawable = this.P) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.P.getIntrinsicHeight() * 0.8f);
                int A = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.M0, intrinsicWidth, 2.0f, imageReceiver.K0);
                int interpolation = (int) ((((imageReceiver.N0 / 2.0f) - intrinsicHeight) + imageReceiver.L0) - ((1.0f - xq.k.getInterpolation(imageReceiver.h1)) * g0.L(16.0f)));
                this.P.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.h1 * 5.0f) * 255.0f));
                this.P.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
                this.P.draw(canvas);
            }
            radialProgress2.r(bounds.centerX() - g0.L(22.0f), bounds.centerY() - g0.L(22.0f), g0.L(22.0f) + bounds.centerX(), g0.L(22.0f) + bounds.centerY());
            if (this.G && this.w != null) {
                canvas.drawRoundRect(g0.L(6.0f) + bounds.left, g0.L(6.0f) + bounds.top, bounds.left + this.w.c + g0.L(18.0f), g0.L(23.0f) + bounds.top, g0.L(8.5f), g0.L(8.5f), this.x);
                this.w.e(canvas, g0.L(12.0f) + bounds.left, g0.L(15.0f) + bounds.top);
            }
        }
        if (this.Y) {
            return;
        }
        ij ijVar = this.H;
        if (ijVar == null || !ijVar.p4()) {
            a aVar = this.Q;
            if (aVar == null || !aVar.g) {
                if (this.X) {
                    if (aVar != null && aVar.f) {
                        i7 = 4;
                    }
                    m(i7, true);
                } else {
                    l(g());
                }
            } else if (this.X) {
                m(3, true);
            } else {
                l(3);
            }
        } else if (gc.D().x(this.F) == null) {
            radialProgress2.p(true, 1.0f);
            if (this.X) {
                m(6, true);
            } else {
                l(6);
            }
        }
        if (this.X) {
            l(g());
        }
        radialProgress2.draw(canvas);
    }

    public final void e() {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void f(boolean z9) {
        int width = getBounds().width() - g0.L(this.D ? 64.0f : 72.0f);
        if (this.Z != width || z9) {
            this.Z = width;
            String str = this.e;
            if (str != null) {
                if (this.n == null) {
                    this.n = new my0(str, 15.0f, g0.o());
                }
                my0 my0Var = this.n;
                my0Var.q(TextUtils.ellipsize(this.e, my0Var.a, width, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                if (this.r == null) {
                    this.r = new my0(str2, 14.0f, null);
                }
                my0 my0Var2 = this.r;
                my0Var2.q(TextUtils.ellipsize(this.f, my0Var2.a, width, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.s == null) {
                    this.s = new my0(str3, 12.0f, null);
                }
                my0 my0Var3 = this.s;
                my0Var3.q(TextUtils.ellipsize(this.h, my0Var3.a, width, TextUtils.TruncateAt.END));
            }
            if (this.G && this.w == null) {
                this.w = new my0(g0.g0(this.J, true, false), 12.0f, null);
            }
        }
    }

    public final int g() {
        boolean z9 = this.X;
        if (z9 && this.a.f) {
            return !MediaController.B().H() ? 1 : 0;
        }
        if (this.G || z9) {
            return 0;
        }
        if (!this.W) {
            return 4;
        }
        a aVar = this.Q;
        return (aVar == null || !aVar.f) ? 2 : 5;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.c0;
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.d0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    public final int h(int i7) {
        if (this.X) {
            return g0.L(63.0f);
        }
        if (this.W) {
            return g0.L(56.0f);
        }
        int i10 = this.U;
        if (i10 == 0) {
            return g0.L(100.0f);
        }
        return Math.min(Math.round((i7 / i10) * this.V), this.D ? (i7 * 4) / 5 : (i7 * 5) / 4);
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.y.p(true, min);
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        if (this.X) {
            m(min >= 1.0f ? 4 : 3, true);
        } else {
            l(min >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    public final boolean j() {
        return this.X && MediaController.B().I(this.H) && MediaController.B().u0 != null && MediaController.B().u0.k0 == this.D;
    }

    public final boolean k(float f10, float f11, int i7) {
        if (!this.X || this.f0 == 4) {
            return false;
        }
        if (i7 == 0) {
            int L = g0.L(36.0f);
            int L2 = g0.L(27.0f);
            if (f10 >= this.a0 + L2 && f10 <= r4 + L) {
                if (f11 >= this.b0 + L2 && f11 <= r7 + L) {
                    this.R = true;
                    return true;
                }
            }
        }
        boolean z9 = this.R;
        if (z9) {
            if (i7 == 1) {
                a aVar = this.Q;
                if (aVar != null) {
                    TLRPC.Document document = aVar.b;
                    int i10 = aVar.a;
                    if (aVar.g) {
                        w7.G(i10).f(document);
                        aVar.a();
                    } else if (!aVar.f) {
                        w7.G(i10).W(document, aVar.d, 2, 0);
                        aVar.a();
                    }
                    e();
                }
                this.R = false;
                return true;
            }
            if (i7 == 3) {
                this.R = false;
                return true;
            }
        }
        return z9;
    }

    public final void l(int i7) {
        if (this.e0 != i7) {
            this.e0 = i7;
            this.y.setIcon(i7, true, true);
        }
    }

    public final void m(int i7, boolean z9) {
        if (this.f0 != i7) {
            this.f0 = i7;
            this.y.k(i7, true, z9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(ij ijVar, TLRPC.MessageMedia messageMedia, ij ijVar2, int i7, String str, boolean z9) {
        boolean z10;
        boolean z11;
        TLRPC.Document document;
        int i10;
        double d;
        String str2 = this.E;
        this.U = 0;
        this.V = 0;
        this.H = ijVar;
        this.T = messageMedia;
        this.W = false;
        this.X = false;
        this.G = false;
        this.Y = false;
        this.I = 0.0d;
        this.J = 0;
        this.F = str;
        this.E = null;
        this.Q = null;
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
                    this.U = i12;
                    int i13 = w11.h;
                    this.V = i13;
                    Locale locale = Locale.US;
                    float f10 = g0.p;
                    String j3 = com.google.android.recaptcha.internal.a.j((int) (i12 / f10), "_", (int) (i13 / f10));
                    String concat = j3.concat("_b");
                    this.E = !TextUtils.isEmpty(str) ? str : ij.U0(messageMedia);
                    z11 = true;
                    imageReceiver.r0(hc.f(w11, photo), j3, hc.f(w10, photo), concat, null, w11.size, null, ijVar2, 1);
                    z10 = z11;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                z11 = true;
                if (messageMedia.geo != null) {
                    if (this.N == null) {
                        rz c10 = t5.c((k6.I.q() ? 3 : 6) * 0.12f, k6.Dc);
                        this.N = c10;
                        c10.t = true;
                        this.O = new np(c10);
                    }
                    if (this.P == null) {
                        this.P = this.d.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    this.Y = true;
                    this.U = i7;
                    int i14 = (i7 * 9) / 16;
                    this.V = i14;
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    float f11 = g0.p;
                    imageReceiver.s0(hc.p(m20.b(geoPoint, (int) (i7 / f11), (int) (i14 / f11), 15, Math.min(2, (int) Math.ceil(f11)))), null, null, null, this.O, ijVar2, 0);
                    z10 = z11;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) != null) {
                this.Q = new a(i11, ijVar, document, str);
                this.E = !TextUtils.isEmpty(str) ? str : ij.U0(messageMedia);
                if (ij.K3(document)) {
                    this.X = true;
                    this.e = ij.y1(document);
                    this.f = ij.w1(document);
                    int i15 = 0;
                    while (true) {
                        if (i15 >= document.attributes.size()) {
                            d = 0.0d;
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i15);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            d = documentAttribute.duration;
                            break;
                        }
                        i15++;
                    }
                    if (ij.X2(document)) {
                        TLRPC.PhotoSize w12 = w7.w(document.thumbs, g0.L(22.0f), true, null, false);
                        radialProgress2.j(w7.w(document.thumbs, g0.L(44.0f), true, w12, true), w12, document, this.H);
                    } else {
                        String t02 = ij.t0(document, true);
                        if (TextUtils.isEmpty(t02)) {
                            radialProgress2.i(null, null, null);
                        } else {
                            radialProgress2.h(t02);
                        }
                    }
                    this.I = d;
                    this.h = g0.k0(j() ? MediaController.B().u0.g0 : 0, (int) this.I);
                    z11 = true;
                } else if (ij.L4(document)) {
                    this.J = (int) Math.max(1L, Math.round(ij.H0(document)));
                    this.G = true;
                    TLRPC.PhotoSize w13 = w7.w(document.thumbs, g0.Z0(false), true, null, true);
                    float f12 = i7;
                    TLRPC.PhotoSize w14 = w7.w(document.thumbs, (int) (f12 / g0.p), false, w13, false);
                    hc c11 = hc.c(w13, document);
                    hc c12 = hc.c(w14, document);
                    int i16 = (int) (f12 / g0.p);
                    if (w13 != null) {
                        int i17 = w13.w;
                        this.U = i17;
                        int i18 = w13.h;
                        this.V = i18;
                        if (i17 != 0) {
                            i10 = (i18 * i16) / i17;
                            String j10 = com.google.android.recaptcha.internal.a.j(i16, "_", i10);
                            z11 = true;
                            imageReceiver.u0(null, j10, c11, j10, c12, j10, null, 0L, null, ijVar2, 0);
                        }
                        i10 = i16;
                        String j102 = com.google.android.recaptcha.internal.a.j(i16, "_", i10);
                        z11 = true;
                        imageReceiver.u0(null, j102, c11, j102, c12, j102, null, 0L, null, ijVar2, 0);
                    } else {
                        if (w14 != null) {
                            int i19 = w14.w;
                            this.U = i19;
                            int i20 = w14.h;
                            this.V = i20;
                            if (i19 != 0) {
                                i10 = (i20 * i16) / i19;
                                String j1022 = com.google.android.recaptcha.internal.a.j(i16, "_", i10);
                                z11 = true;
                                imageReceiver.u0(null, j1022, c11, j1022, c12, j1022, null, 0L, null, ijVar2, 0);
                            }
                        }
                        i10 = i16;
                        String j10222 = com.google.android.recaptcha.internal.a.j(i16, "_", i10);
                        z11 = true;
                        imageReceiver.u0(null, j10222, c11, j10222, c12, j10222, null, 0L, null, ijVar2, 0);
                    }
                } else {
                    z11 = true;
                    this.W = true;
                    this.e = w7.B(document);
                    String str3 = g0.i0(document.size, false, false) + " " + w7.A(document);
                    this.h = str3;
                    this.f = str3;
                }
                f(z11);
                z10 = z11;
            }
            this.S = z10;
            if (!z10) {
                imageReceiver.f();
            }
            if (!TextUtils.equals(str2, this.E)) {
                if (!TextUtils.isEmpty(str2)) {
                    z5.q(i11).v(this);
                }
                if (!TextUtils.isEmpty(this.E)) {
                    z5.q(i11).a(this.E, null, this);
                }
            }
            if (!this.X) {
                radialProgress2.i(null, null, null);
                m(4, false);
            }
            p(z9);
        }
        z10 = false;
        this.S = z10;
        if (!z10) {
        }
        if (!TextUtils.equals(str2, this.E)) {
        }
        if (!this.X) {
        }
        p(z9);
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.y.p(true, min);
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a();
        }
        if (this.X) {
            m(min >= 1.0f ? 4 : 3, true);
        } else {
            l(min >= 1.0f ? g() : 3);
        }
        this.d.invalidate();
    }

    public final void p(boolean z9) {
        int i7;
        if (!this.X || this.H == null) {
            return;
        }
        ij ijVar = MediaController.B().u0;
        boolean j3 = j();
        this.a.a(j3, z9);
        if (ijVar == null || !j3) {
            i7 = 0;
        } else {
            i7 = ijVar.g0;
            jm0 jm0Var = this.K;
            if (!jm0Var.e) {
                jm0Var.h(ijVar.b0);
                jm0Var.q = ijVar.e0;
            }
            jm0Var.j(ijVar);
        }
        if (this.g0 != i7) {
            this.g0 = i7;
            this.h = g0.k0(i7, (int) this.I);
            f(true);
            this.d.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.c0 = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
