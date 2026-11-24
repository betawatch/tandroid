// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yd8 extends Drawable implements sp3, wu9 {
    public final boolean E;
    public String F;
    public String G;
    public boolean H;
    public k27 I;
    public double J;
    public int K;
    public final xu9 L;
    public float M;
    public float N;
    public kcb O;
    public ni2 P;
    public Drawable Q;
    public bb4 R;
    public boolean S;
    public boolean T;
    public TLRPC.MessageMedia U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final fm0 a;
    public final ImageReceiver b;
    public int b0;
    public final int c;
    public int c0;
    public final ViewGroup d;
    public String e;
    public final int e0;
    public String f;
    public int f0;
    public byte g0;
    public String h;
    public int h0;
    public tgb n;
    public tgb r;
    public tgb s;
    public tgb w;
    public final RadialProgress2 y;
    public final Paint x = new Paint(1);
    public int a0 = 0;
    public int d0 = kk7.d4;

    public yd8(int i, ViewGroup viewGroup, wjb wjbVar, boolean z) {
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.b = imageReceiver;
        imageReceiver.q0(gl.L(6.0f));
        this.c = i;
        this.E = z;
        this.y = new RadialProgress2(viewGroup, wjbVar);
        this.d = viewGroup;
        xu9 xu9Var = new xu9(viewGroup);
        this.L = xu9Var;
        xu9Var.h = this;
        this.a = new fm0(180L, viewGroup, tn.a);
        this.e0 = up3.q(i).k();
    }

    @Override // sp3
    public final void B(boolean z) {
        c();
    }

    @Override // sp3
    public final void N(String str) {
        c();
    }

    public final void a() {
        this.b.I();
        this.y.e();
    }

    public final void b(boolean z) {
        tgb tgbVar = this.n;
        if (tgbVar != null) {
            tgbVar.m(bkb.w0(null, z ? bkb.vc : bkb.te, false));
        }
        this.x.setColor(1711276032);
        tgb tgbVar2 = this.w;
        if (tgbVar2 != null) {
            tgbVar2.m(-1);
        }
        kcb kcbVar = this.O;
        if (kcbVar != null) {
            kcbVar.m = z ? bkb.Fc : bkb.gf;
        }
        boolean z2 = this.Y;
        RadialProgress2 radialProgress2 = this.y;
        if (!z2 && !this.X) {
            radialProgress2.g(bkb.bf, bkb.cf, bkb.df, bkb.ef);
            return;
        }
        xu9 xu9Var = this.L;
        if (z) {
            int w0 = bkb.w0(null, bkb.mc, false);
            int w02 = bkb.w0(null, bkb.nc, false);
            int i = bkb.pc;
            xu9Var.f(w0, w02, bkb.w0(null, i, false), bkb.w0(null, i, false), bkb.w0(null, bkb.oc, false));
            radialProgress2.g(bkb.Dc, bkb.Ec, bkb.Fb, bkb.Gb);
            return;
        }
        radialProgress2.g(bkb.Ye, bkb.Ze, bkb.kd, bkb.ld);
        int w03 = bkb.w0(null, bkb.ke, false);
        int w04 = bkb.w0(null, bkb.le, false);
        int i2 = bkb.ne;
        xu9Var.f(w03, w04, bkb.w0(null, i2, false), bkb.w0(null, i2, false), bkb.w0(null, bkb.me, false));
    }

    public final void c() {
        bb4 bb4Var = this.R;
        if (bb4Var != null) {
            bb4Var.a();
        }
        this.d.invalidate();
    }

    public final void d(boolean z) {
        int width = getBounds().width() - gl.L(this.E ? 64.0f : 72.0f);
        if (this.a0 != width || z) {
            this.a0 = width;
            String str = this.e;
            if (str != null) {
                tgb tgbVar = this.n;
                if (tgbVar == null) {
                    tgbVar = new tgb(str, 15.0f, gl.o());
                    this.n = tgbVar;
                }
                tgbVar.p(TextUtils.ellipsize(this.e, tgbVar.a, width, TextUtils.TruncateAt.MIDDLE));
            }
            String str2 = this.f;
            if (str2 != null) {
                tgb tgbVar2 = this.r;
                if (tgbVar2 == null) {
                    tgbVar2 = new tgb(str2, 14.0f, null);
                    this.r = tgbVar2;
                }
                tgbVar2.p(TextUtils.ellipsize(this.f, tgbVar2.a, width, TextUtils.TruncateAt.END));
            }
            String str3 = this.h;
            if (str3 != null) {
                tgb tgbVar3 = this.s;
                if (tgbVar3 == null) {
                    tgbVar3 = new tgb(str3, 12.0f, null);
                    this.s = tgbVar3;
                }
                tgbVar3.p(TextUtils.ellipsize(this.h, tgbVar3.a, width, TextUtils.TruncateAt.END));
            }
            if (this.H && this.w == null) {
                this.w = new tgb(gl.g0(this.K, true, false), 12.0f, null);
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
        boolean z = this.X;
        int i = 2;
        RadialProgress2 radialProgress2 = this.y;
        if (z || this.Y) {
            int i2 = bounds.left;
            boolean z2 = this.E;
            int L = i2 + (z2 ? 0 : gl.L(8.0f));
            int L2 = bounds.top + (z2 ? 0 : gl.L(3.0f));
            int L3 = this.Y ? 0 : gl.L(3.0f);
            tgb tgbVar = this.n;
            if (tgbVar != null) {
                tgbVar.e(canvas, gl.L(56.0f) + L, gl.L(15.0f) + L2 + L3);
            }
            if (this.Y) {
                float f = this.a.e;
                if (this.r != null && f < 1.0f) {
                    canvas.save();
                    float f2 = 1.0f - f;
                    int i3 = L2 + L3;
                    canvas.scale(f2, f2, gl.L(56.0f) + L, gl.L(35.0f) + i3);
                    this.r.a.setAlpha((int) (f2 * 255.0f));
                    this.r.e(canvas, gl.L(56.0f) + L, gl.L(35.0f) + i3);
                    canvas.restore();
                }
                if (f > 0.0f) {
                    xu9 xu9Var = this.L;
                    xu9Var.t = f;
                    xu9Var.h(ug8.B(56.0f, L, bounds.right), gl.L(30.0f));
                    canvas.save();
                    float L4 = gl.L(45.0f) + L;
                    this.M = L4;
                    float L5 = gl.L(21.0f) + L2 + L3;
                    this.N = L5;
                    canvas.translate(L4, L5);
                    xu9Var.b(canvas);
                    canvas.restore();
                }
            }
            tgb tgbVar2 = this.s;
            if (tgbVar2 != null) {
                tgbVar2.e(canvas, gl.L(56.0f) + L, gl.L((this.Y ? 20 : 2) + 34) + L3 + L2);
            }
            int L6 = gl.L(2.0f) + L;
            this.b0 = L6;
            int L7 = gl.L(5.0f) + L2;
            this.c0 = L7;
            radialProgress2.p(L6, L7, gl.L(44.0f) + gl.L(2.0f) + L, gl.L(44.0f) + gl.L(5.0f) + L2);
        } else {
            ImageReceiver imageReceiver = this.b;
            imageReceiver.setAlpha(this.d0 / 255.0f);
            imageReceiver.j0(bounds);
            imageReceiver.h(canvas, null);
            if (this.Z && (drawable = this.Q) != null) {
                int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight = (int) (this.Q.getIntrinsicHeight() * 0.8f);
                int z3 = (int) oo1.z(imageReceiver.N0, intrinsicWidth, 2.0f, imageReceiver.L0);
                int interpolation = (int) ((((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0) - ((1.0f - s33.k.getInterpolation(imageReceiver.i1)) * gl.L(16.0f)));
                this.Q.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.i1 * 5.0f) * 255.0f));
                this.Q.setBounds(z3, interpolation, intrinsicWidth + z3, intrinsicHeight + interpolation);
                this.Q.draw(canvas);
            }
            radialProgress2.p(bounds.centerX() - gl.L(22.0f), bounds.centerY() - gl.L(22.0f), gl.L(22.0f) + bounds.centerX(), gl.L(22.0f) + bounds.centerY());
            if (this.H && this.w != null) {
                canvas.drawRoundRect(gl.L(6.0f) + bounds.left, gl.L(6.0f) + bounds.top, bounds.left + this.w.c + gl.L(18.0f), gl.L(23.0f) + bounds.top, gl.L(8.5f), gl.L(8.5f), this.x);
                this.w.e(canvas, gl.L(12.0f) + bounds.left, gl.L(15.0f) + bounds.top);
            }
        }
        if (this.Z) {
            return;
        }
        k27 k27Var = this.I;
        if (k27Var == null || !k27Var.n4()) {
            bb4 bb4Var = this.R;
            if (bb4Var == null || !bb4Var.g) {
                if (this.Y) {
                    if (bb4Var != null && bb4Var.f) {
                        i = 4;
                    }
                    n(i, true);
                } else {
                    m(e());
                }
            } else if (this.Y) {
                n(3, true);
            } else {
                m(3);
            }
        } else if (fl5.z().t(this.G) == null) {
            radialProgress2.o(true, 1.0f);
            if (this.Y) {
                n(6, true);
            } else {
                m(6);
            }
        }
        if (this.Y) {
            m(e());
        }
        radialProgress2.draw(canvas);
    }

    public final int e() {
        boolean z = this.Y;
        if (z && this.a.f) {
            return !MediaController.w().C() ? 1 : 0;
        }
        if (this.H || z) {
            return 0;
        }
        if (!this.X) {
            return 4;
        }
        bb4 bb4Var = this.R;
        return (bb4Var == null || !bb4Var.f) ? 2 : 5;
    }

    @Override // wu9
    public final void f(float f) {
        if (j()) {
            MediaController.w().h0(MediaController.w().v0, f);
            p(true);
        }
    }

    public final int g(int i) {
        if (this.Y) {
            return gl.L(63.0f);
        }
        if (this.X) {
            return gl.L(56.0f);
        }
        int i2 = this.V;
        if (i2 == 0) {
            return gl.L(100.0f);
        }
        return Math.min(Math.round((i / i2) * this.W), this.E ? (i << 2) / 5 : (i * 5) / 4);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d0;
    }

    @Override // sp3
    public final int getObserverTag() {
        return this.e0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // wu9
    public final void h(float f) {
        if (j()) {
            k27 k27Var = MediaController.w().v0;
            k27Var.b0 = f;
            k27Var.i0 = (int) (k27Var.L0() * f);
            p(true);
        }
    }

    @Override // sp3
    public final void i(long j, long j2) {
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.y.o(true, min);
        bb4 bb4Var = this.R;
        if (bb4Var != null) {
            bb4Var.a();
        }
        if (this.Y) {
            n(min >= 1.0f ? 4 : 3, true);
        } else {
            m(min >= 1.0f ? e() : 3);
        }
        this.d.invalidate();
    }

    public final boolean j() {
        return this.Y && MediaController.w().D(this.I) && MediaController.w().v0 != null && MediaController.w().v0.m0 == this.E;
    }

    public final boolean k(float f, float f2, int i) {
        if (!this.Y || this.g0 == 4) {
            return false;
        }
        if (i == 0) {
            int L = gl.L(36.0f);
            int L2 = gl.L(27.0f);
            if (f >= this.b0 + L2 && f <= r4 + L) {
                if (f2 >= this.c0 + L2 && f2 <= r7 + L) {
                    this.S = true;
                    return true;
                }
            }
        }
        boolean z = this.S;
        if (z) {
            if (i == 1) {
                bb4 bb4Var = this.R;
                if (bb4Var != null) {
                    TLRPC.Document document = bb4Var.b;
                    int i2 = bb4Var.a;
                    if (bb4Var.g) {
                        ba4.G(i2).f(document);
                        bb4Var.a();
                    } else if (!bb4Var.f) {
                        ba4.G(i2).X(document, bb4Var.d, 2, 0);
                        bb4Var.a();
                    }
                    c();
                }
                this.S = false;
                return true;
            }
            if (i == 3) {
                this.S = false;
                return true;
            }
        }
        return z;
    }

    @Override // sp3
    public final void l(long j, long j2) {
        float min = j2 == 0 ? 0.0f : Math.min(1.0f, j / j2);
        this.y.o(true, min);
        bb4 bb4Var = this.R;
        if (bb4Var != null) {
            bb4Var.a();
        }
        if (this.Y) {
            n(min >= 1.0f ? 4 : 3, true);
        } else {
            m(min >= 1.0f ? e() : 3);
        }
        this.d.invalidate();
    }

    public final void m(int i) {
        if (this.f0 != i) {
            this.f0 = i;
            this.y.setIcon(i, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(int i, boolean z) {
        if (this.g0 != i) {
            this.g0 = i;
            this.y.k(i, true, z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(k27 k27Var, TLRPC.MessageMedia messageMedia, k27 k27Var2, int i, String str, boolean z) {
        boolean z2;
        boolean z3;
        TLRPC.Document document;
        int i2;
        double d;
        String str2 = this.F;
        this.V = 0;
        this.W = 0;
        this.I = k27Var;
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
        int i3 = this.c;
        RadialProgress2 radialProgress2 = this.y;
        ImageReceiver imageReceiver = this.b;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                TLRPC.PhotoSize w = ba4.w(photo.sizes, 40, false, null, false);
                TLRPC.PhotoSize w2 = ba4.w(photo.sizes, gl.Y0(false), true, w, true);
                if (w2 != null) {
                    int i4 = w2.w;
                    this.V = i4;
                    int i5 = w2.h;
                    this.W = i5;
                    Locale locale = Locale.US;
                    float f = gl.p;
                    String m = tb4.m((int) (i4 / f), (int) (i5 / f), "_");
                    String concat = m.concat("_b");
                    this.F = !TextUtils.isEmpty(str) ? str : k27.U0(messageMedia);
                    z3 = true;
                    imageReceiver.Z(gl5.f(w2, photo), m, gl5.f(w, photo), concat, null, w2.size, null, k27Var2, 1);
                    z2 = z3;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                z3 = true;
                if (messageMedia.geo != null) {
                    if (this.O == null) {
                        kcb c = uo3.c((bkb.I.o() ? 3 : 6) * 0.12f, bkb.Fc);
                        this.O = c;
                        c.t = true;
                        this.P = new ni2(c);
                    }
                    if (this.Q == null) {
                        this.Q = this.d.getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    this.Z = true;
                    this.V = i;
                    int i6 = (i * 9) / 16;
                    this.W = i6;
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    float f2 = gl.p;
                    imageReceiver.a0(gl5.p(usc.b(geoPoint, (int) (i / f2), (int) (i6 / f2), 15, Math.min(2, (int) Math.ceil(f2)))), null, null, null, this.P, k27Var2, 0);
                    z2 = z3;
                }
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) messageMedia).document) != null) {
                this.R = new bb4(i3, k27Var, document, str);
                this.F = !TextUtils.isEmpty(str) ? str : k27.U0(messageMedia);
                if (k27.J3(document)) {
                    this.Y = true;
                    this.e = k27.x1(document);
                    this.f = k27.v1(document);
                    int i7 = 0;
                    while (true) {
                        if (i7 >= document.attributes.size()) {
                            d = 0.0d;
                            break;
                        }
                        TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                        if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                            d = documentAttribute.duration;
                            break;
                        }
                        i7++;
                    }
                    if (k27.W2(document)) {
                        TLRPC.PhotoSize w3 = ba4.w(document.thumbs, gl.L(22.0f), true, null, false);
                        radialProgress2.j(ba4.w(document.thumbs, gl.L(44.0f), true, w3, true), w3, document, this.I);
                    } else {
                        String t0 = k27.t0(document, true);
                        if (TextUtils.isEmpty(t0)) {
                            radialProgress2.i(null, null, null);
                        } else {
                            radialProgress2.h(t0);
                        }
                    }
                    this.J = d;
                    this.h = gl.k0(j() ? MediaController.w().v0.i0 : 0, (int) this.J);
                    z3 = true;
                } else if (k27.J4(document)) {
                    this.K = (int) Math.max(1L, Math.round(k27.H0(document)));
                    this.H = true;
                    TLRPC.PhotoSize w4 = ba4.w(document.thumbs, gl.Y0(false), true, null, true);
                    float f3 = i;
                    TLRPC.PhotoSize w5 = ba4.w(document.thumbs, (int) (f3 / gl.p), false, w4, false);
                    gl5 c2 = gl5.c(w4, document);
                    gl5 c3 = gl5.c(w5, document);
                    int i8 = (int) (f3 / gl.p);
                    if (w4 != null) {
                        int i9 = w4.w;
                        this.V = i9;
                        int i10 = w4.h;
                        this.W = i10;
                        if (i9 != 0) {
                            i2 = (i10 * i8) / i9;
                            String m2 = tb4.m(i8, i2, "_");
                            z3 = true;
                            imageReceiver.Y(null, m2, c2, m2, c3, m2, null, 0L, null, k27Var2, 0);
                        }
                        i2 = i8;
                        String m22 = tb4.m(i8, i2, "_");
                        z3 = true;
                        imageReceiver.Y(null, m22, c2, m22, c3, m22, null, 0L, null, k27Var2, 0);
                    } else {
                        if (w5 != null) {
                            int i11 = w5.w;
                            this.V = i11;
                            int i12 = w5.h;
                            this.W = i12;
                            if (i11 != 0) {
                                i2 = (i12 * i8) / i11;
                                String m222 = tb4.m(i8, i2, "_");
                                z3 = true;
                                imageReceiver.Y(null, m222, c2, m222, c3, m222, null, 0L, null, k27Var2, 0);
                            }
                        }
                        i2 = i8;
                        String m2222 = tb4.m(i8, i2, "_");
                        z3 = true;
                        imageReceiver.Y(null, m2222, c2, m2222, c3, m2222, null, 0L, null, k27Var2, 0);
                    }
                } else {
                    z3 = true;
                    this.X = true;
                    this.e = ba4.B(document);
                    String str3 = gl.i0(document.size, false, false) + " " + ba4.A(document);
                    this.h = str3;
                    this.f = str3;
                }
                d(z3);
                z2 = z3;
            }
            this.T = z2;
            if (!z2) {
                imageReceiver.f();
            }
            if (!TextUtils.equals(str2, this.F)) {
                if (!TextUtils.isEmpty(str2)) {
                    up3.q(i3).v(this);
                }
                if (!TextUtils.isEmpty(this.F)) {
                    up3.q(i3).a(this.F, null, this);
                }
            }
            if (!this.Y) {
                radialProgress2.i(null, null, null);
                n(4, false);
            }
            p(z);
        }
        z2 = false;
        this.T = z2;
        if (!z2) {
        }
        if (!TextUtils.equals(str2, this.F)) {
        }
        if (!this.Y) {
        }
        p(z);
    }

    public final void p(boolean z) {
        int i;
        if (!this.Y || this.I == null) {
            return;
        }
        k27 k27Var = MediaController.w().v0;
        boolean j = j();
        this.a.a(j, z);
        if (k27Var == null || !j) {
            i = 0;
        } else {
            i = k27Var.i0;
            xu9 xu9Var = this.L;
            if (!xu9Var.e) {
                xu9Var.g(k27Var.b0);
                xu9Var.q = k27Var.g0;
            }
            xu9Var.i(k27Var);
        }
        if (this.h0 != i) {
            this.h0 = i;
            this.h = gl.k0(i, (int) this.J);
            d(true);
            this.d.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d0 = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
