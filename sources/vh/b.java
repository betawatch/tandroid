package vh;

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
import b8.kg;
import cg.r;
import java.util.ArrayList;
import k2.p1;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e20;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.messenger.t0;
import org.telegram.messenger.t5;
import org.telegram.messenger.w7;
import org.telegram.messenger.x5;
import org.telegram.messenger.z5;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z8;
import qe.g;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b extends Drawable implements x5 {
    public final qe.a E;
    public final RadialProgress2 F;
    public zi G;
    public final kg H;
    public String I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public final g6 a;
    public final z8 b;
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

    public b(int i3, View view) {
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new Paint(1);
        this.H = new kg((char) 0, 19);
        this.e = i3;
        this.d = view;
        this.E = new qe.a(view, xq.h, 380L);
        g6 g6Var = new g6(false, false, false);
        this.a = g6Var;
        g6Var.b = 21;
        g6Var.w(g0.L(11.0f));
        g6Var.setCallback(view);
        this.b = new z8(i3, view, g0.L(18.0f), g0.L(8.33f), g0.N(1.0f));
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.c = imageReceiver;
        imageReceiver.J0(g0.L(5.0f));
        paint.setColor(TLObject.FLAG_30);
        RadialProgress2 radialProgress2 = new RadialProgress2(view, null);
        this.F = radialProgress2;
        radialProgress2.setCircleRadius(g0.L(18.0f));
        radialProgress2.d = -1;
        this.J = z5.q(i3).k();
    }

    public final void a(TLRPC.Photo photo, Object obj) {
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, 40, false, null, false);
        TLRPC.PhotoSize w11 = w7.w(photo.sizes, g0.L(36.0f), false, w10, true);
        this.c.r0(ac.f(w11, photo), "36_36", ac.f(w10, photo), "36_36_b", null, w11 != null ? w11.size : 0L, null, obj, 1);
    }

    public final void b(boolean z10) {
        if (this.G.p4() || this.G.Z2()) {
            return;
        }
        if (TextUtils.isEmpty(this.I) || !w7.G(this.e).T(this.I)) {
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
            int i3 = (int) gVar.f.a;
            int W1 = (bounds.right - L) - g0.W1(f10, g0.L(2.0f), g0.L(4.0f) + i3);
            if (f10 > 0.0f) {
                z8 z8Var = this.b;
                z8Var.i = (int) (this.E.e * 255.0f);
                z8Var.setBounds((bounds.right - L) - i3, bounds.bottom - g0.L(31.33f), bounds.right - L, bounds.bottom);
                this.b.c(canvas);
            }
            int L2 = bounds.bottom - g0.L(21.33f);
            g6 g6Var = this.a;
            g6Var.B = (int) (this.E.e * 255.0f);
            g6Var.setBounds(bounds.left, g0.L(15.0f) + L2, W1, L2 - g0.L(15.0f));
            this.a.draw(canvas);
        }
        if (this.h) {
            int L3 = g0.L(36.0f);
            Rect rect = g0.Q;
            rect.set(k5.z(9.0f, bounds.right, L3), k5.z(4.0f, bounds.bottom, L3), bounds.right - g0.L(9.0f), bounds.bottom - g0.L(4.0f));
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
                    this.y.setColor(i0.a.o(k6.x0(null, this.G.Q3() ? k6.Tc : k6.Sc, false), 16));
                    canvas.drawRoundRect(rectF, g0.L(5.0f), g0.L(5.0f), this.y);
                }
            }
            if (this.n) {
                if (this.s == null) {
                    this.s = p1.g(t0.b, R.drawable.media_link_24);
                }
                Drawable drawable = this.s;
                kg kgVar = this.H;
                if (this.r) {
                    x02 = -1;
                } else {
                    x02 = k6.x0(null, this.G.Q3() ? k6.gc : k6.be, false);
                }
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                kgVar.getClass();
                if (((PorterDuffColorFilter) kgVar.c) == null || kgVar.b != x02 || ((PorterDuff.Mode) kgVar.d) != mode) {
                    kgVar.c = new PorterDuffColorFilter(x02, mode);
                    kgVar.b = x02;
                    kgVar.d = mode;
                }
                drawable.setColorFilter((PorterDuffColorFilter) kgVar.c);
                r.e(this.s, rectF.centerX(), rectF.centerY(), g0.L(24.0f), g0.L(24.0f), 17);
                this.s.draw(canvas);
            }
            b(true);
            if (this.K) {
                this.F.draw(canvas);
            }
        }
    }

    public final float d(float f10) {
        z8 z8Var = this.b;
        float c2 = this.a.c() + z8Var.c.d.f.a;
        float L = z8Var.c.d.c.a * g0.L(4.0f);
        float f11 = this.E.e;
        return (f10 * f11) + (L * f11) + c2;
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

    public final void g(int i3, boolean z10) {
        if (this.M != i3) {
            this.M = i3;
            this.F.setIcon(i3, true, z10);
        }
    }

    @Override // org.telegram.messenger.x5
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
    public final void h(zi ziVar, TLRPC.MessageMedia messageMedia, zi ziVar2, String str, boolean z10) {
        ImageReceiver imageReceiver;
        boolean z11;
        boolean z12;
        TLRPC.GeoPoint geoPoint;
        this.G = ziVar;
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
                    a(photo, ziVar2);
                } else {
                    imageReceiver2.f();
                }
            } else {
                if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) messageMedia;
                        TLRPC.Document document = tL_messageMediaDocument.document;
                        if (document != null) {
                            this.I = !TextUtils.isEmpty(str) ? str : zi.U0(messageMedia);
                            if (zi.L4(tL_messageMediaDocument.document)) {
                                TLRPC.PhotoSize w10 = w7.w(document.thumbs, 40, false, null, false);
                                TLRPC.PhotoSize w11 = w7.w(document.thumbs, g0.L(36.0f), false, w10, true);
                                this.w = true;
                                this.K = true;
                                ac f10 = ac.f(w11, document);
                                ac f11 = ac.f(w10, document);
                                imageReceiver = imageReceiver2;
                                imageReceiver.r0(f10, "36_36", f11, "36_36_b", null, w11 != null ? w11.size : 0L, null, ziVar2, 1);
                            } else {
                                imageReceiver = imageReceiver2;
                                boolean z13 = zi.v4(document) || zi.O4(document);
                                boolean L2 = zi.L2(document, true);
                                if (z13 || L2) {
                                    imageReceiver.p0(ac.b(document), "36_36", t5.f(document, k6.Zc, 1.0f, null), document.size, z13 ? "webp" : null, ziVar2, 1);
                                }
                                z11 = false;
                            }
                        }
                    } else if (((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) && (geoPoint = messageMedia.geo) != null) {
                        int min = Math.min(2, (int) Math.ceil(g0.p));
                        int i3 = e20.i;
                        ac p10 = ac.p(e20.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 36, 36, 13, min));
                        imageReceiver = imageReceiver2;
                        imageReceiver.s0(p10, null, null, null, null, ziVar2, 0);
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
                        radialProgress2.setColors(0, 0, k6.x0(null, k6.bf, false), k6.x0(null, k6.cf, false));
                    } else {
                        int i10 = k6.Ze;
                        int x02 = k6.x0(null, i10, false);
                        int i11 = k6.af;
                        int x03 = k6.x0(null, i11, false);
                        int i12 = k6.bf;
                        int x04 = k6.x0(null, i12, false);
                        int i13 = k6.cf;
                        radialProgress2.setColors(x02, x03, x04, k6.x0(null, i13, false));
                        radialProgress2.g(i10, i11, i12, i13);
                    }
                    if (!TextUtils.equals(str2, this.I)) {
                        boolean isEmpty = TextUtils.isEmpty(str2);
                        int i14 = this.e;
                        if (!isEmpty) {
                            z5.q(i14).v(this);
                        }
                        if (!TextUtils.isEmpty(this.I)) {
                            z5.q(i14).a(this.I, null, this);
                        }
                    }
                    b(z10);
                }
                TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = (TLRPC.TL_messageMediaPhoto) messageMedia;
                this.K = true;
                this.I = !TextUtils.isEmpty(str) ? str : zi.U0(messageMedia);
                a(tL_messageMediaPhoto.photo, ziVar2);
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

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.F.p(true, min);
        g(min < 1.0f ? 3 : this.w ? 0 : 4, true);
        this.d.invalidate();
    }

    public final void j(ArrayList arrayList, boolean z10) {
        this.L = arrayList != null ? arrayList.size() : 0;
        this.b.d(arrayList, z10);
    }

    public final void k(int i3, boolean z10) {
        this.a.t(i3 > 0 ? bd.S(null, i3) : null, z10, true);
    }

    public final void l(int i3) {
        this.a.u(i3);
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
        float min = j11 == 0 ? 0.0f : Math.min(1.0f, j10 / j11);
        this.F.p(true, min);
        g(min < 1.0f ? 3 : this.w ? 0 : 4, true);
        this.d.invalidate();
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
