package sh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.gms.internal.vision.e2;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.a6;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.g20;
import org.telegram.messenger.ks;
import org.telegram.messenger.kz;
import org.telegram.messenger.m10;
import org.telegram.messenger.u5;
import org.telegram.messenger.w7;
import org.telegram.messenger.y5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xm0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e extends Drawable implements y5, wm0 {
    public final boolean E;
    public String F;
    public String G;
    public boolean H;
    public fj I;
    public double J;
    public int K;
    public final xm0 L;
    public float M;
    public float N;
    public kz O;
    public bq P;
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
    public final te.a a;
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
    public wy0 n;
    public wy0 r;
    public wy0 s;
    public wy0 w;
    public final RadialProgress2 y;
    public final Paint x = new Paint(1);
    public int a0 = 0;
    public int d0 = ks.e4;

    public e(int i7, ViewGroup viewGroup, i6 i6Var, boolean z10) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.b = imageReceiver;
        imageReceiver.K0(g0.L(6.0f));
        this.c = i7;
        this.E = z10;
        this.y = new RadialProgress2(viewGroup, i6Var);
        this.d = viewGroup;
        xm0 xm0Var = new xm0(viewGroup);
        this.L = xm0Var;
        xm0Var.h = this;
        this.a = new te.a(viewGroup, se.a.a, 180L);
        this.e0 = a6.q(i7).k();
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
        c();
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        c();
    }

    public final void a() {
        this.b.Q();
        this.y.e();
    }

    public final void b(boolean z10) {
        wy0 wy0Var = this.n;
        if (wy0Var != null) {
            wy0Var.n(n6.x0(null, z10 ? n6.wc : n6.ue, false));
        }
        this.x.setColor(1711276032);
        wy0 wy0Var2 = this.w;
        if (wy0Var2 != null) {
            wy0Var2.n(-1);
        }
        kz kzVar = this.O;
        if (kzVar != null) {
            kzVar.m = z10 ? n6.Gc : n6.hf;
        }
        boolean z11 = this.Y;
        RadialProgress2 radialProgress2 = this.y;
        if (!z11 && !this.X) {
            radialProgress2.g(n6.cf, n6.df, n6.ef, n6.ff);
            return;
        }
        xm0 xm0Var = this.L;
        if (z10) {
            int x02 = n6.x0(null, n6.nc, false);
            int x03 = n6.x0(null, n6.oc, false);
            int i7 = n6.qc;
            xm0Var.g(x02, x03, n6.x0(null, i7, false), n6.x0(null, i7, false), n6.x0(null, n6.pc, false));
            radialProgress2.g(n6.Ec, n6.Fc, n6.Gb, n6.Hb);
            return;
        }
        radialProgress2.g(n6.Ze, n6.af, n6.ld, n6.md);
        int x04 = n6.x0(null, n6.le, false);
        int x05 = n6.x0(null, n6.me, false);
        int i10 = n6.oe;
        xm0Var.g(x04, x05, n6.x0(null, i10, false), n6.x0(null, i10, false), n6.x0(null, n6.ne, false));
    }

    public final void c() {
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
        this.d.invalidate();
    }

    public final void d(boolean z10) {
        int width = getBounds().width() - g0.L(this.E ? 64.0f : 72.0f);
        if (this.a0 != width || z10) {
            this.a0 = width;
            String str = this.e;
            if (str != null) {
                if (this.n == null) {
                    this.n = new wy0(str, 15.0f, g0.o());
                }
                wy0 wy0Var = this.n;
                wy0Var.q(TextUtils.ellipsize(this.e, wy0Var.a, width, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                if (this.r == null) {
                    this.r = new wy0(str2, 14.0f, null);
                }
                wy0 wy0Var2 = this.r;
                wy0Var2.q(TextUtils.ellipsize(this.f, wy0Var2.a, width, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                if (this.s == null) {
                    this.s = new wy0(str3, 12.0f, null);
                }
                wy0 wy0Var3 = this.s;
                wy0Var3.q(TextUtils.ellipsize(this.h, wy0Var3.a, width, TextUtils.TruncateAt.END));
            }
            if (this.H && this.w == null) {
                this.w = new wy0(g0.g0(this.K, true, false), 12.0f, null);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable;
        Rect bounds = getBounds();
        if (this.d0 == 0 || bounds.isEmpty()) {
            return;
        }
        d(false);
        boolean z10 = this.X;
        int i7 = 2;
        RadialProgress2 radialProgress2 = this.y;
        if (z10 || this.Y) {
            int i10 = bounds.left;
            boolean z11 = this.E;
            int L = i10 + (z11 ? 0 : g0.L(8.0f));
            int L2 = bounds.top + (z11 ? 0 : g0.L(3.0f));
            int L3 = this.Y ? 0 : g0.L(3.0f);
            wy0 wy0Var = this.n;
            if (wy0Var != null) {
                wy0Var.e(canvas, g0.L(56.0f) + L, g0.L(15.0f) + L2 + L3);
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
                    xm0 xm0Var = this.L;
                    xm0Var.t = f10;
                    xm0Var.i(m10.x(56.0f, L, bounds.right), g0.L(30.0f));
                    canvas.save();
                    float L4 = g0.L(45.0f) + L;
                    this.M = L4;
                    float L5 = g0.L(21.0f) + L2 + L3;
                    this.N = L5;
                    canvas.translate(L4, L5);
                    xm0Var.b(canvas);
                    canvas.restore();
                }
            }
            wy0 wy0Var2 = this.s;
            if (wy0Var2 != null) {
                wy0Var2.e(canvas, g0.L(56.0f) + L, g0.L((this.Y ? 20 : 2) + 34) + L3 + L2);
            }
            int L6 = g0.L(2.0f) + L;
            this.b0 = L6;
            int L7 = g0.L(5.0f) + L2;
            this.c0 = L7;
            radialProgress2.r(L6, L7, g0.L(44.0f) + g0.L(2.0f) + L, g0.L(44.0f) + g0.L(5.0f) + L2);
        } else {
            ImageReceiver imageReceiver = this.b;
            imageReceiver.setAlpha(this.d0 / 255.0f);
            imageReceiver.A0(bounds);
            imageReceiver.h(canvas, null);
            if (this.Z && (drawable = this.Q) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.Q.getIntrinsicHeight() * 0.8f);
                int A = (int) e2.A(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - kr.k.getInterpolation(imageReceiver.i1)) * g0.L(16.0f)));
                this.Q.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.i1 * 5.0f) * 255.0f));
                this.Q.setBounds(A, interpolation, intrinsicWidth + A, intrinsicHeight + interpolation);
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
        fj fjVar = this.I;
        if (fjVar == null || !fjVar.o4()) {
            a aVar = this.R;
            if (aVar == null || !aVar.g) {
                if (this.Y) {
                    if (aVar != null && aVar.f) {
                        i7 = 4;
                    }
                    m(i7, true);
                } else {
                    l(f());
                }
            } else if (this.Y) {
                m(3, true);
            } else {
                l(3);
            }
        } else if (ec.D().x(this.G) == null) {
            radialProgress2.p(true, 1.0f);
            if (this.Y) {
                m(6, true);
            } else {
                l(6);
            }
        }
        if (this.Y) {
            l(f());
        }
        radialProgress2.draw(canvas);
    }

    @Override // org.telegram.ui.Components.wm0
    public final void e(float f10) {
        if (j()) {
            MediaController.B().i0(MediaController.B().v0, f10);
            p(true);
        }
    }

    public final int f() {
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

    public final int g(int i7) {
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
        return Math.min(Math.round((i7 / i10) * this.W), this.E ? (i7 * 4) / 5 : (i7 * 5) / 4);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d0;
    }

    @Override // org.telegram.messenger.y5
    public final int getObserverTag() {
        return this.e0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // org.telegram.ui.Components.wm0
    public final void h(float f10) {
        if (j()) {
            fj fjVar = MediaController.B().v0;
            fjVar.b0 = f10;
            fjVar.i0 = (int) (fjVar.L0() * f10);
            p(true);
        }
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.y.p(true, min);
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
        if (this.Y) {
            m(min >= 1.0f ? 4 : 3, true);
        } else {
            l(min >= 1.0f ? f() : 3);
        }
        this.d.invalidate();
    }

    public final boolean j() {
        return this.Y && MediaController.B().I(this.I) && MediaController.B().v0 != null && MediaController.B().v0.m0 == this.E;
    }

    public final boolean k(float f10, float f11, int i7) {
        if (!this.Y || this.g0 == 4) {
            return false;
        }
        if (i7 == 0) {
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
            if (i7 == 1) {
                a aVar = this.R;
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
                    c();
                }
                this.S = false;
                return true;
            }
            if (i7 == 3) {
                this.S = false;
                return true;
            }
        }
        return z10;
    }

    public final void l(int i7) {
        if (this.f0 != i7) {
            this.f0 = i7;
            this.y.setIcon(i7, true, true);
        }
    }

    public final void m(int i7, boolean z10) {
        if (this.g0 != i7) {
            this.g0 = i7;
            this.y.k(i7, true, z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(fj fjVar, TLRPC.MessageMedia messageMedia, fj fjVar2, int i7, String str, boolean z10) {
        boolean z11;
        boolean z12;
        TLRPC.Document document;
        int i10;
        double d;
        String str2 = this.F;
        this.V = 0;
        this.W = 0;
        this.I = fjVar;
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
                    String j3 = e2.j((int) (i12 / f10), "_", (int) (i13 / f10));
                    String concat = j3.concat("_b");
                    this.F = !TextUtils.isEmpty(str) ? str : fj.U0(messageMedia);
                    z12 = true;
                    imageReceiver.s0(fc.f(w11, photo), j3, fc.f(w10, photo), concat, null, w11.size, null, fjVar2, 1);
                    z11 = z12;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                z12 = true;
                if (messageMedia.geo != null) {
                    if (this.O == null) {
                        kz c10 = u5.c((n6.I.q() ? 3 : 6) * 0.12f, n6.Gc);
                        this.O = c10;
                        c10.t = true;
                        this.P = new bq(c10);
                    }
                    if (this.Q == null) {
                        this.Q = this.d.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    this.Z = true;
                    this.V = i7;
                    int i14 = (i7 * 9) / 16;
                    this.W = i14;
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    float f11 = g0.p;
                    imageReceiver.t0(fc.p(g20.b(geoPoint, (int) (i7 / f11), (int) (i14 / f11), 15, Math.min(2, (int) Math.ceil(f11)))), null, null, null, this.P, fjVar2, 0);
                    z11 = z12;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) != null) {
                this.R = new a(i11, fjVar, document, str);
                this.F = !TextUtils.isEmpty(str) ? str : fj.U0(messageMedia);
                if (fj.J3(document)) {
                    this.Y = true;
                    this.e = fj.x1(document);
                    this.f = fj.v1(document);
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
                    if (fj.W2(document)) {
                        TLRPC.PhotoSize w12 = w7.w(document.thumbs, g0.L(22.0f), true, null, false);
                        radialProgress2.j(w7.w(document.thumbs, g0.L(44.0f), true, w12, true), w12, document, this.I);
                    } else {
                        String t02 = fj.t0(document, true);
                        if (TextUtils.isEmpty(t02)) {
                            radialProgress2.i(null, null, null);
                        } else {
                            radialProgress2.h(t02);
                        }
                    }
                    this.J = d;
                    this.h = g0.k0(j() ? MediaController.B().v0.i0 : 0, (int) this.J);
                    z12 = true;
                } else if (fj.K4(document)) {
                    this.K = (int) Math.max(1L, Math.round(fj.H0(document)));
                    this.H = true;
                    TLRPC.PhotoSize w13 = w7.w(document.thumbs, g0.Z0(false), true, null, true);
                    float f12 = i7;
                    TLRPC.PhotoSize w14 = w7.w(document.thumbs, (int) (f12 / g0.p), false, w13, false);
                    fc c11 = fc.c(w13, document);
                    fc c12 = fc.c(w14, document);
                    int i16 = (int) (f12 / g0.p);
                    if (w13 != null) {
                        int i17 = w13.w;
                        this.V = i17;
                        int i18 = w13.h;
                        this.W = i18;
                        if (i17 != 0) {
                            i10 = (i18 * i16) / i17;
                            String j10 = e2.j(i16, "_", i10);
                            z12 = true;
                            imageReceiver.v0(null, j10, c11, j10, c12, j10, null, 0L, null, fjVar2, 0);
                        }
                        i10 = i16;
                        String j102 = e2.j(i16, "_", i10);
                        z12 = true;
                        imageReceiver.v0(null, j102, c11, j102, c12, j102, null, 0L, null, fjVar2, 0);
                    } else {
                        if (w14 != null) {
                            int i19 = w14.w;
                            this.V = i19;
                            int i20 = w14.h;
                            this.W = i20;
                            if (i19 != 0) {
                                i10 = (i20 * i16) / i19;
                                String j1022 = e2.j(i16, "_", i10);
                                z12 = true;
                                imageReceiver.v0(null, j1022, c11, j1022, c12, j1022, null, 0L, null, fjVar2, 0);
                            }
                        }
                        i10 = i16;
                        String j10222 = e2.j(i16, "_", i10);
                        z12 = true;
                        imageReceiver.v0(null, j10222, c11, j10222, c12, j10222, null, 0L, null, fjVar2, 0);
                    }
                } else {
                    z12 = true;
                    this.X = true;
                    this.e = w7.B(document);
                    String str3 = g0.i0(document.size, false, false) + " " + w7.A(document);
                    this.h = str3;
                    this.f = str3;
                }
                d(z12);
                z11 = z12;
            }
            this.T = z11;
            if (!z11) {
                imageReceiver.f();
            }
            if (!TextUtils.equals(str2, this.F)) {
                if (!TextUtils.isEmpty(str2)) {
                    a6.q(i11).v(this);
                }
                if (!TextUtils.isEmpty(this.F)) {
                    a6.q(i11).a(this.F, null, this);
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

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.y.p(true, min);
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
        if (this.Y) {
            m(min >= 1.0f ? 4 : 3, true);
        } else {
            l(min >= 1.0f ? f() : 3);
        }
        this.d.invalidate();
    }

    public final void p(boolean z10) {
        int i7;
        if (!this.Y || this.I == null) {
            return;
        }
        fj fjVar = MediaController.B().v0;
        boolean j3 = j();
        this.a.a(j3, z10);
        if (fjVar == null || !j3) {
            i7 = 0;
        } else {
            i7 = fjVar.i0;
            xm0 xm0Var = this.L;
            if (!xm0Var.e) {
                xm0Var.h(fjVar.b0);
                xm0Var.q = fjVar.g0;
            }
            xm0Var.j(fjVar);
        }
        if (this.h0 != i7) {
            this.h0 = i7;
            this.h = g0.k0(i7, (int) this.J);
            d(true);
            this.d.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.d0 = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
