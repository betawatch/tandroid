package uh;

import a8.xa;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import bg.t;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a6;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.t0;
import org.telegram.messenger.u5;
import org.telegram.messenger.w7;
import org.telegram.messenger.y5;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import te.g;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class b extends Drawable implements y5 {
    public final te.a E;
    public final RadialProgress2 F;
    public gj G;
    public final xa H;
    public String I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public final n6 a;
    public final g9 b;
    public final ImageReceiver c;
    public final View d;
    public final int e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public Drawable s;
    public boolean w;
    public final Paint x;
    public final Paint y;

    public b(int i7, View view) {
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Paint(1);
        this.H = new xa((char) 0, 18);
        this.e = i7;
        this.d = view;
        this.E = new te.a(view, nr.h, 380L);
        n6 n6Var = new n6(false, false, false);
        this.a = n6Var;
        n6Var.b = 21;
        n6Var.w(g0.L(11.0f));
        n6Var.setCallback(view);
        this.b = new g9(i7, view, g0.L(18.0f), g0.L(8.33f), g0.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.c = imageReceiver;
        imageReceiver.J0(g0.L(5.0f));
        paint.setColor(TLObject.FLAG_30);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        this.F = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(18.0f));
        radialProgress2.d = -1;
        this.J = a6.q(i7).k();
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, 40, false, null, false);
        TLRPC.PhotoSize w11 = w7.w(photo.sizes, g0.L(36.0f), false, w10, true);
        this.c.r0(gc.f(w11, photo), "36_36", gc.f(w10, photo), "36_36_b", null, w11 != null ? w11.size : 0L, null, obj, 1);
    }

    public final void b(boolean z10) {
        if (this.G.o4() || this.G.Y2()) {
            return;
        }
        if (TextUtils.isEmpty(this.I) || !w7.G(this.e).S(this.I)) {
            g(this.w ? 0 : 4, z10);
        } else {
            g(3, z10);
        }
    }

    public final void c(Canvas canvas) {
        int x02;
        Rect bounds = getBounds();
        int L = g0.L(this.f ? 56.33f : 19.0f);
        if (this.E.e > 0.0f) {
            g gVar = this.b.c.d;
            float f10 = gVar.c.a;
            int i7 = (int) gVar.f.a;
            int W1 = (bounds.right - L) - g0.W1(f10, g0.L(2.0f), g0.L(4.0f) + i7);
            if (f10 > 0.0f) {
                g9 g9Var = this.b;
                g9Var.i = (int) (this.E.e * 255.0f);
                g9Var.setBounds((bounds.right - L) - i7, bounds.bottom - g0.L(31.33f), bounds.right - L, bounds.bottom);
                this.b.c(canvas);
            }
            int L2 = bounds.bottom - g0.L(21.33f);
            n6 n6Var = this.a;
            n6Var.C = (int) (this.E.e * 255.0f);
            n6Var.setBounds(bounds.left, g0.L(15.0f) + L2, W1, L2 - g0.L(15.0f));
            this.a.draw(canvas);
        }
        if (this.h) {
            int L3 = g0.L(36.0f);
            Rect rect = g0.Q;
            rect.set(f3.z(9.0f, bounds.right, L3), f3.z(4.0f, bounds.bottom, L3), bounds.right - g0.L(9.0f), bounds.bottom - g0.L(4.0f));
            RectF rectF = g0.P;
            rectF.set(rect);
            this.F.a.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            this.c.z0(rect);
            if (!this.n || this.r) {
                this.c.h(canvas, null);
            }
            if (this.w || this.n) {
                if (!this.n || this.r) {
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.x);
                } else {
                    this.y.setColor(i0.a.o(m6.x0(null, this.G.P3() ? m6.Wc : m6.Vc, false), 16));
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.y);
                }
            }
            if (this.n) {
                if (this.s == null) {
                    this.s = i5.c.g(t0.b, R.drawable.media_link_24);
                }
                Drawable drawable = this.s;
                xa xaVar = this.H;
                if (this.r) {
                    x02 = -1;
                } else {
                    x02 = m6.x0(null, this.G.P3() ? m6.jc : m6.ee, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                xaVar.getClass();
                if (((PorterDuffColorFilter) xaVar.c) == null || xaVar.b != x02 || ((PorterDuff.Mode) xaVar.d) != mode) {
                    xaVar.c = new PorterDuffColorFilter(x02, mode);
                    xaVar.b = x02;
                    xaVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) xaVar.c);
                t.e(this.s, rectF.centerX(), rectF.centerY(), g0.L(24.0f), g0.L(24.0f), 17);
                this.s.draw(canvas);
            }
            b(true);
            if (this.K) {
                this.F.draw(canvas);
            }
        }
    }

    public final float d(float f10) {
        g9 g9Var = this.b;
        float c10 = this.a.c() + g9Var.c.d.f.a;
        float L = g9Var.c.d.c.a * g0.L(4.0f);
        float f11 = this.E.e;
        return (f10 * f11) + (L * f11) + c10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c(canvas);
    }

    public final float e() {
        return this.a.d + (this.L > 0 ? g0.L((r1 * 9.34f) + 8.66f) : 0);
    }

    public final void f(boolean z10) {
        this.f = z10;
    }

    public final void g(int i7, boolean z10) {
        if (this.M != i7) {
            this.M = i7;
            this.F.setIcon(i7, true, z10);
        }
    }

    @Override // org.telegram.messenger.y5
    public final int getObserverTag() {
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(gj gjVar, TLRPC.MessageMedia messageMedia, gj gjVar2, String str, boolean z10) {
        ImageReceiver imageReceiver;
        boolean z11;
        boolean z12;
        TLRPC.GeoPoint geoPoint;
        this.G = gjVar;
        String str2 = this.I;
        this.K = false;
        this.I = null;
        ImageReceiver imageReceiver2 = this.c;
        if (messageMedia != null && !(messageMedia instanceof TLRPC.TL_messageMediaEmpty)) {
            this.r = false;
            this.n = false;
            this.w = false;
            z11 = true;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                TLRPC.WebPage webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                this.n = true;
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    this.r = true;
                    a(photo, gjVar2);
                } else {
                    imageReceiver2.f();
                }
            } else {
                if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                        TLRPC.Document document = tL_messageMediaDocument.document;
                        if (document != null) {
                            this.I = !TextUtils.isEmpty(str) ? str : gj.U0(messageMedia);
                            if (gj.K4(tL_messageMediaDocument.document)) {
                                TLRPC.PhotoSize w10 = w7.w(document.thumbs, 40, false, null, false);
                                TLRPC.PhotoSize w11 = w7.w(document.thumbs, g0.L(36.0f), false, w10, true);
                                this.w = true;
                                this.K = true;
                                gc f10 = gc.f(w11, document);
                                gc f11 = gc.f(w10, document);
                                imageReceiver = imageReceiver2;
                                imageReceiver.r0(f10, "36_36", f11, "36_36_b", null, w11 != null ? w11.size : 0L, null, gjVar2, 1);
                            } else {
                                imageReceiver = imageReceiver2;
                                boolean z13 = gj.u4(document) || gj.N4(document);
                                boolean K2 = gj.K2(document, true);
                                if (z13 || K2) {
                                    imageReceiver.p0(gc.b(document), "36_36", u5.f(document, m6.cd, 1.0f, null), document.size, z13 ? "webp" : null, gjVar2, 1);
                                }
                                z11 = false;
                            }
                        }
                    } else if (((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) && (geoPoint = messageMedia.geo) != null) {
                        int min = Math.min(2, (int) Math.ceil(g0.p));
                        int i7 = i20.i;
                        gc p10 = gc.p(i20.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 36, 36, 13, min));
                        imageReceiver = imageReceiver2;
                        imageReceiver.s0(p10, null, null, null, null, gjVar2, 0);
                    } else {
                        imageReceiver = imageReceiver2;
                        z11 = false;
                    }
                    this.h = z11;
                    if (!z11) {
                        imageReceiver.f();
                    }
                    z12 = this.w;
                    RadialProgress2 radialProgress2 = this.F;
                    if (z12) {
                        radialProgress2.setColors(0, 0, m6.x0(null, m6.ef, false), m6.x0(null, m6.ff, false));
                    } else {
                        int i10 = m6.cf;
                        int x02 = m6.x0(null, i10, false);
                        int i11 = m6.df;
                        int x03 = m6.x0(null, i11, false);
                        int i12 = m6.ef;
                        int x04 = m6.x0(null, i12, false);
                        int i13 = m6.ff;
                        radialProgress2.setColors(x02, x03, x04, m6.x0(null, i13, false));
                        radialProgress2.g(i10, i11, i12, i13);
                    }
                    if (!TextUtils.equals(str2, this.I)) {
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        int i14 = this.e;
                        if (!isEmpty) {
                            a6.q(i14).v(this);
                        }
                        if (!TextUtils.isEmpty(this.I)) {
                            a6.q(i14).a(this.I, null, this);
                        }
                    }
                    b(z10);
                }
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                this.K = true;
                this.I = !TextUtils.isEmpty(str) ? str : gj.U0(messageMedia);
                a(tL_messageMediaPhoto.photo, gjVar2);
            }
            imageReceiver = imageReceiver2;
            this.h = z11;
            if (!z11) {
            }
            z12 = this.w;
            RadialProgress2 radialProgress22 = this.F;
            if (z12) {
            }
            if (!TextUtils.equals(str2, this.I)) {
            }
            b(z10);
        }
        imageReceiver = imageReceiver2;
        z11 = false;
        this.h = z11;
        if (!z11) {
        }
        z12 = this.w;
        RadialProgress2 radialProgress222 = this.F;
        if (z12) {
        }
        if (!TextUtils.equals(str2, this.I)) {
        }
        b(z10);
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.F.p(true, min);
        g(min < 1.0f ? 3 : this.w ? 0 : 4, true);
        this.d.invalidate();
    }

    public final void j(ArrayList arrayList, boolean z10) {
        this.L = arrayList != null ? arrayList.size() : 0;
        this.b.d(arrayList, z10);
    }

    public final void k(int i7, boolean z10) {
        this.a.t(i7 > 0 ? hd.S(null, i7) : null, z10, true);
    }

    public final void l(int i7) {
        this.a.u(i7);
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
        float min = j10 == 0 ? 0.0f : Math.min(1.0f, j3 / j10);
        this.F.p(true, min);
        g(min < 1.0f ? 3 : this.w ? 0 : 4, true);
        this.d.invalidate();
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
