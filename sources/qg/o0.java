package qg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.l11;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class o0 extends View {
    public final Paint E;
    public boolean F;
    public l11 G;
    public final Paint H;
    public boolean I;
    public l11 J;
    public boolean K;
    public l11 L;
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
    public n0 W;
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
    public final g6 l0;
    public final g6 m0;
    public float n;
    public final g6 n0;
    public final g6 o0;
    public final g6 p0;
    public final g6 q0;
    public final TextPaint r;
    public final g6 r0;
    public StaticLayout s;
    public final g6 s0;
    public float v;
    public float w;
    public final RectF x;
    public final Drawable y;

    public o0(Context context, float f7) {
        super(context);
        this.c = true;
        this.n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        this.x = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
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
        hs hsVar = hs.h;
        this.l0 = new g6(this, 0L, 350L, hsVar);
        this.m0 = new g6(this, 0L, 350L, hsVar);
        this.n0 = new g6(this, 0L, 350L, hsVar);
        this.o0 = new g6(this, 0L, 350L, hsVar);
        this.p0 = new g6(this, 0L, 350L, hsVar);
        this.q0 = new g6(this, 0L, 350L, hsVar);
        this.r0 = new g6(this, 0L, 350L, hsVar);
        this.s0 = new g6(this, 0L, 350L, hsVar);
        this.e = f7;
        imageReceiver.setInvalidateAll(true);
        this.f = (int) (f7 * 3.0f);
        this.h = (int) (f7 * 1.0f);
        this.y = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f7);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        Path.Direction direction;
        float f13;
        float f14;
        float f15;
        float f16;
        float e7;
        float f17;
        l11 l11Var;
        l11 l11Var2;
        Canvas canvas2 = canvas;
        d();
        float d = this.r0.d(this.a0, false);
        float d10 = this.s0.d(this.b0, false);
        float e10 = this.p0.e(this.V == 0);
        float e11 = this.o0.e(e());
        float f18 = this.e;
        float lerp = AndroidUtilities.lerp(0.2f * d10, 16.66f * f18, e11);
        int i10 = this.f;
        int i11 = this.h;
        RectF rectF = this.f0;
        rectF.set(i10, i11, i10 + d, i11 + d10);
        int d11 = i0.a.d(e11, this.e0, i0.a.d(e10, -1, -14670807));
        Paint paint = this.E;
        paint.setColor(d11);
        Path path = this.i0;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, lerp, lerp, direction2);
        canvas2.drawPath(path, paint);
        if (e11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i10, i11);
            float e12 = this.l0.e(this.F);
            float f19 = (7.33f * f18) + 0.0f;
            l11 l11Var3 = this.G;
            if (l11Var3 == null || e12 <= 0.0f) {
                f11 = e12;
                f7 = 1.0f;
                f12 = e11;
                f10 = 2.0f;
                direction = direction2;
            } else {
                f10 = 2.0f;
                direction = direction2;
                f11 = e12;
                f7 = 1.0f;
                l11Var3.c(f18 * 10.0f, com.google.android.gms.internal.vision.e2.b(1.0f, e12, (15.0f * f18) + this.G.j(), (l11Var3.j() / 2.0f) + f19), e11, -15033089, canvas2);
                f12 = e11;
                f19 = (((7.0f * f18) + this.G.j()) * f11) + f19;
            }
            float f20 = f19;
            float d12 = this.q0.d(this.c0, false);
            Paint paint2 = this.H;
            paint2.setAlpha(25);
            float f21 = d12 + f20;
            RectF rectF2 = this.g0;
            rectF2.set(f18 * 10.0f, f20, d - (f18 * 10.0f), f21);
            Path path2 = this.h0;
            path2.rewind();
            path2.addRoundRect(rectF2, f18 * 5.0f, f18 * 5.0f, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(255);
            canvas2.drawRect(f18 * 10.0f, f20, 13.0f * f18, f21, paint2);
            canvas.restore();
            float f22 = (5.66f * f18) + f20;
            if (this.K) {
                l11 l11Var4 = this.L;
                if (l11Var4 != null) {
                    float j3 = (l11Var4.j() / f10) + f22;
                    int color = paint2.getColor();
                    f13 = d;
                    e11 = f12;
                    f15 = f11;
                    f16 = 2.66f;
                    l11Var4.c(f18 * 20.0f, j3, e11, color, canvas);
                    f14 = sc.v.d(f18, 2.66f, this.L.j(), f22);
                    if (this.I || (l11Var2 = this.J) == null) {
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        l11Var2.c(f18 * 20.0f, (l11Var2.j() / f10) + f14, e11, i0.a.d(e10, -13421773, -1), canvas2);
                        f14 = sc.v.d(f18, f16, this.J.j(), f14);
                    }
                    if (this.M && this.O != null) {
                        canvas2.save();
                        canvas2.translate((f18 * 20.0f) - this.Q, f14);
                        this.N.setColor(i0.a.d(e10, -13421773, -1));
                        this.N.setAlpha((int) (255.0f * e11));
                        this.O.draw(canvas2);
                        canvas2.restore();
                        f14 = sc.v.d(f18, f16, this.O.getHeight(), f14);
                    }
                    e7 = this.m0.e(this.R);
                    if (e7 > 0.0f) {
                        float e13 = this.n0.e(this.S);
                        this.j0.set(f18 * 20.0f, (f18 * f16) + f14, f13 - (20.0f * f18), (f18 * f16) + f14 + this.d0);
                        this.k0.set(((f13 - (f18 * 10.0f)) - (f18 * 6.0f)) - (48.0f * f18), (f18 * 6.0f) + f20, (f13 - (f18 * 10.0f)) - (f18 * 6.0f), (48.0f * f18) + (6.0f * f18) + f20);
                        AndroidUtilities.lerp(this.j0, this.k0, e13, rectF2);
                        float f23 = rectF2.left;
                        float f24 = rectF2.top;
                        float width = rectF2.width();
                        float height = rectF2.height();
                        ImageReceiver imageReceiver = this.T;
                        imageReceiver.setImageCoords(f23, f24, width, height);
                        imageReceiver.setAlpha(e7 * e11);
                        imageReceiver.draw(canvas2);
                        f14 += ((f18 * f16) + this.d0) * (f7 - e13);
                    }
                    f17 = (5.0f * f18) + (7.0f * f18) + f14;
                    l11Var = this.G;
                    if (l11Var != null && f7 - f15 > 0.0f) {
                        l11Var.c(f18 * 10.0f, (l11Var.j() / f10) + f17 + (((15.0f * f18) + this.G.j()) * f15), e11, -15033089, canvas2);
                        this.G.j();
                    }
                    canvas2.restore();
                } else {
                    f13 = d;
                    f14 = f22;
                }
            } else {
                f13 = d;
                f14 = f22;
            }
            e11 = f12;
            f15 = f11;
            f16 = 2.66f;
            if (this.I) {
            }
            canvas2 = canvas;
            if (this.M) {
                canvas2.save();
                canvas2.translate((f18 * 20.0f) - this.Q, f14);
                this.N.setColor(i0.a.d(e10, -13421773, -1));
                this.N.setAlpha((int) (255.0f * e11));
                this.O.draw(canvas2);
                canvas2.restore();
                f14 = sc.v.d(f18, f16, this.O.getHeight(), f14);
            }
            e7 = this.m0.e(this.R);
            if (e7 > 0.0f) {
            }
            f17 = (5.0f * f18) + (7.0f * f18) + f14;
            l11Var = this.G;
            if (l11Var != null) {
                l11Var.c(f18 * 10.0f, (l11Var.j() / f10) + f17 + (((15.0f * f18) + this.G.j()) * f15), e11, -15033089, canvas2);
                this.G.j();
            }
            canvas2.restore();
        } else {
            f7 = 1.0f;
            f10 = 2.0f;
        }
        if (e11 < f7) {
            float f25 = this.x.left;
            float f26 = f10;
            int x10 = ((int) com.google.android.gms.internal.vision.e2.x(f18, 30.0f, d10, f26)) + i11;
            Drawable drawable = this.y;
            drawable.setBounds(((int) (f25 * f18)) + i10, ((int) com.google.android.gms.internal.vision.e2.u(f18, 30.0f, d10, f26)) + i11, ((int) ((f25 + 30.0f) * f18)) + i10, x10);
            int i12 = (int) ((f7 - e11) * 255.0f);
            drawable.setAlpha(i12);
            drawable.draw(canvas2);
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(((this.x.left + 30.0f + 3.25f) * f18) + i10, (d10 / 2.0f) + i11);
                float f27 = this.n;
                canvas2.scale(f27, f27);
                canvas2.translate(-this.w, (-this.s.getHeight()) / 2.0f);
                this.r.setAlpha(i12);
                this.s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i10, n0 n0Var, boolean z10) {
        this.a = i10;
        if (this.W != n0Var || z10) {
            this.W = n0Var;
            this.c = true;
            this.d = z10;
            requestLayout();
        }
    }

    public final void c(int i10, int i11) {
        Drawable drawable = this.y;
        TextPaint textPaint = this.r;
        if (i10 == 0) {
            this.e0 = i11;
            int i12 = AndroidUtilities.computePerceivedBrightness(i11) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            this.e0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 2) {
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
        int color1;
        float f7;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        if (!this.c || this.W == null) {
            return;
        }
        boolean e7 = e();
        int i13 = this.f;
        float f12 = this.e;
        if (e7) {
            String str2 = TextUtils.isEmpty(this.W.b) ? this.W.c : this.W.b;
            TLRPC.WebPage webPage = this.W.d;
            float f13 = (this.b - i13) - i13;
            this.b0 = 0.0f;
            this.a0 = 0.0f;
            this.c0 = 0.0f;
            int colorId = UserObject.getColorId(UserConfig.getInstance(this.a).getCurrentUser());
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.a).peerColors;
            MessagesController.PeerColor color = (peerColors == null || colorId < 7) ? null : peerColors.getColor(colorId);
            if (color == null) {
                int[] iArr = i6.r8;
                color1 = i6.x0(null, iArr[colorId % iArr.length], false);
            } else {
                color1 = color.getColor1();
            }
            this.H.setColor(color1);
            this.b0 = (7.33f * f12) + this.b0;
            this.F = this.W.f;
            l11 l11Var = new l11(str2, 16.0f, null);
            l11Var.a.setTextSize(16.0f * f12);
            float f14 = 20.0f * f12;
            l11Var.q(f13 - f14);
            this.G = l11Var;
            this.a0 = Math.max(this.a0, Math.min(f14 + l11Var.c, f13));
            float f15 = 7.0f * f12;
            this.b0 = this.G.j() + this.b0 + f15;
            this.R = webPage.photo != null || MessageObject.isVideoDocument(webPage.document);
            n0 n0Var = this.W;
            boolean z10 = n0Var.e;
            this.S = !z10;
            int i14 = (!this.U || (n0Var.a & 4) == 0) ? 2 * ((int) (!z10 ? 48.0f : (f13 / f12) - 40.0f)) : n0Var.i;
            ImageReceiver imageReceiver = this.T;
            imageReceiver.setRoundRadius((int) (4.0f * f12));
            TLRPC.Photo photo = webPage.photo;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1, false, null, false);
                f7 = 48.0f;
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, (int) (i14 * f12), false, closestPhotoSizeWithSize, false);
                if (closestPhotoSizeWithSize2 != null) {
                    i11 = closestPhotoSizeWithSize2.w;
                    i10 = closestPhotoSizeWithSize2.h;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo), a1.g.l(i14, i14, "_"), this.U ? null : ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo), this.U ? null : a1.g.l(i14, i14, "_"), 0L, null, null, 0);
            } else {
                f7 = 48.0f;
                TLRPC.Document document = webPage.document;
                if (document != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1, false, null, false);
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(webPage.document.thumbs, (int) (i14 * f12), false, closestPhotoSizeWithSize3, false);
                    if (closestPhotoSizeWithSize4 != null) {
                        i11 = closestPhotoSizeWithSize4.w;
                        i10 = closestPhotoSizeWithSize4.h;
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                    imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document), a1.g.l(i14, i14, "_"), this.U ? null : ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document), this.U ? null : a1.g.l(i14, i14, "_"), 0L, null, null, 0);
                } else {
                    i10 = 0;
                    i11 = 0;
                }
            }
            this.c0 = (5.66f * f12) + this.c0;
            boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
            this.K = !isEmpty;
            if (isEmpty) {
                i12 = 0;
            } else {
                l11 l11Var2 = new l11(webPage.site_name, 14.0f, AndroidUtilities.bold());
                l11Var2.a.setTextSize(f12 * 14.0f);
                float f16 = f12 * 40.0f;
                l11Var2.q((int) Math.ceil((f13 - f16) - ((this.R && this.S) ? f12 * 60.0f : 0.0f)));
                this.L = l11Var2;
                this.a0 = Math.max(this.a0, Math.min(f16 + l11Var2.c + ((this.R && this.S) ? f12 * 60.0f : 0.0f), f13));
                this.c0 = (f12 * 2.66f) + this.L.j() + this.c0;
                i12 = this.L.b.getLineCount();
            }
            boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
            this.I = !isEmpty2;
            if (isEmpty2) {
                f10 = 2.66f;
                f11 = f12;
            } else {
                l11 l11Var3 = new l11(webPage.title, 14.0f, AndroidUtilities.bold());
                l11Var3.a.setTextSize(f12 * 14.0f);
                float f17 = f12 * 40.0f;
                f10 = 2.66f;
                f11 = f12;
                l11Var3.q((int) Math.ceil((f13 - f17) - ((this.R && this.S) ? f12 * 60.0f : 0.0f)));
                this.J = l11Var3;
                this.a0 = Math.max(this.a0, Math.min(f17 + l11Var3.c + ((this.R && this.S) ? 60.0f * f11 : 0.0f), f13));
                this.c0 = (f11 * 2.66f) + this.J.j() + this.c0;
                i12 += this.J.b.getLineCount();
            }
            boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
            this.M = !isEmpty3;
            if (!isEmpty3) {
                TextPaint textPaint = this.N;
                textPaint.setTextSize(f11 * 14.0f);
                float f18 = f11 * 40.0f;
                int i15 = 3 - i12;
                this.O = org.telegram.ui.Cells.u1.u2(webPage.description, textPaint, (int) Math.ceil(Math.max(1.0f, f13 - f18)), (int) Math.ceil(Math.max(1.0f, f13 - ((40 + ((this.R && this.S) ? 60 : 0)) * f11))), i15, 4);
                this.P = 0.0f;
                this.Q = Float.MAX_VALUE;
                int i16 = 0;
                while (i16 < this.O.getLineCount()) {
                    this.P = Math.max(this.P, this.O.getLineWidth(i16) + (this.R && this.S && i16 < i15 ? f11 * f7 : 0.0f));
                    this.Q = Math.min(this.Q, this.O.getLineLeft(i16));
                    i16++;
                }
                this.a0 = Math.max(this.a0, Math.min(f18 + this.P, f13));
                this.c0 = (f11 * f10) + this.c0 + this.O.getHeight();
            }
            if (this.R && !this.S) {
                if (i11 <= 0 || i10 <= 0) {
                    this.d0 = f11 * 120.0f;
                } else {
                    this.d0 = Math.min((Math.max(0.0f, this.a0 - (f11 * 40.0f)) / i11) * i10, f11 * 200.0f);
                }
                this.c0 = (f11 * f10) + this.c0 + this.d0;
            }
            float f19 = f15 + this.c0;
            this.c0 = f19;
            this.b0 = (f11 * 11.0f) + this.b0 + f19;
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
            float f20 = (this.b - i13) - i13;
            RectF rectF = this.x;
            float f21 = f20 - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f12);
            this.n = 1.0f;
            double d = f21;
            float ceil = (int) Math.ceil(d);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            TextPaint textPaint2 = this.r;
            this.s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, ceil, truncateAt), textPaint2, (int) Math.ceil(d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.v = 0.0f;
            this.w = Float.MAX_VALUE;
            for (int i17 = 0; i17 < this.s.getLineCount(); i17++) {
                this.v = Math.max(this.v, this.s.getLineWidth(i17));
                this.w = Math.min(this.w, this.s.getLineLeft(i17));
            }
            if (this.s.getLineCount() > 2) {
                this.n = 0.3f;
            } else {
                this.n = Math.min(1.0f, f21 / this.v);
            }
            this.a0 = (this.v * this.n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f12);
            this.b0 = Math.max(f12 * 30.0f, this.s.getHeight() * this.n) + ((rectF.top + rectF.bottom) * f12);
        }
        if (this.d) {
            invalidate();
        } else {
            this.l0.f(this.F, true);
            this.n0.f(this.S, true);
            this.m0.f(this.R, true);
            this.q0.d(this.c0, true);
        }
        this.c = false;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        n0 n0Var = this.W;
        return (n0Var == null || n0Var.d == null) ? false : true;
    }

    public int getPhotoSide() {
        float f7;
        if (this.S) {
            f7 = 48.0f;
        } else {
            int i10 = this.b;
            int i11 = this.f;
            f7 = (((i10 - i11) - i11) / this.e) - 40.0f;
        }
        return ((int) f7) * 2;
    }

    public int getPreviewType() {
        return this.V;
    }

    public float getRadius() {
        float f7;
        float f10;
        if (e()) {
            f7 = 16.66f;
            f10 = this.e;
        } else {
            f7 = 0.2f;
            f10 = this.b0;
        }
        return f10 * f7;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.T.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        d();
        int ceil = (int) Math.ceil(this.a0);
        int i12 = this.f;
        int i13 = ceil + i12 + i12;
        int ceil2 = (int) Math.ceil(this.b0);
        int i14 = this.h;
        setMeasuredDimension(i13, ceil2 + i14 + i14);
    }

    public void setMaxWidth(int i10) {
        this.b = i10;
        this.c = true;
    }

    public void setPreviewType(int i10) {
        this.V = i10;
        invalidate();
    }
}
