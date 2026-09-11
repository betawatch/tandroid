package rg;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class q0 extends View {
    public final Paint E;
    public boolean F;
    public f01 G;
    public final Paint H;
    public boolean I;
    public f01 J;
    public boolean K;
    public f01 L;
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
    public p0 W;
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
    public final e6 l0;
    public final e6 m0;
    public float n;
    public final e6 n0;
    public final e6 o0;
    public final e6 p0;
    public final e6 q0;
    public final TextPaint r;
    public final e6 r0;
    public StaticLayout s;
    public final e6 s0;
    public float v;
    public float w;
    public final RectF x;
    public final Drawable y;

    public q0(Context context, float f7) {
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
        pr prVar = pr.h;
        this.l0 = new e6(this, 0L, 350L, prVar);
        this.m0 = new e6(this, 0L, 350L, prVar);
        this.n0 = new e6(this, 0L, 350L, prVar);
        this.o0 = new e6(this, 0L, 350L, prVar);
        this.p0 = new e6(this, 0L, 350L, prVar);
        this.q0 = new e6(this, 0L, 350L, prVar);
        this.r0 = new e6(this, 0L, 350L, prVar);
        this.s0 = new e6(this, 0L, 350L, prVar);
        this.e = f7;
        imageReceiver.setInvalidateAll(true);
        this.f = (int) (f7 * 3.0f);
        this.h = (int) (f7 * 1.0f);
        this.y = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f7);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        Path.Direction direction;
        float f12;
        float f13;
        f01 f01Var;
        f01 f01Var2;
        Canvas canvas2 = canvas;
        d();
        float d = this.r0.d(this.a0, false);
        float d10 = this.s0.d(this.b0, false);
        float e7 = this.p0.e(this.V == 0);
        float e10 = this.o0.e(e());
        float f14 = this.e;
        float lerp = AndroidUtilities.lerp(0.2f * d10, 16.66f * f14, e10);
        int i10 = this.f;
        int i11 = this.h;
        RectF rectF = this.f0;
        rectF.set(i10, i11, i10 + d, i11 + d10);
        int d11 = i0.a.d(e10, this.e0, i0.a.d(e7, -1, -14670807));
        Paint paint = this.E;
        paint.setColor(d11);
        Path path = this.i0;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, lerp, lerp, direction2);
        canvas2.drawPath(path, paint);
        if (e10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i10, i11);
            float e11 = this.l0.e(this.F);
            float f15 = (7.33f * f14) + 0.0f;
            f01 f01Var3 = this.G;
            if (f01Var3 == null || e11 <= 0.0f) {
                f10 = e11;
                f11 = e10;
                direction = direction2;
                f7 = 1.0f;
            } else {
                direction = direction2;
                f10 = e11;
                f7 = 1.0f;
                f01Var3.c(f14 * 10.0f, com.google.android.gms.internal.vision.e2.b(1.0f, e11, (15.0f * f14) + this.G.j(), (f01Var3.j() / 2.0f) + f15), e10, -15033089, canvas2);
                f11 = e10;
                f15 = (((7.0f * f14) + this.G.j()) * f10) + f15;
            }
            float f16 = f15;
            float d12 = this.q0.d(this.c0, false);
            Paint paint2 = this.H;
            paint2.setAlpha(25);
            float f17 = d12 + f16;
            RectF rectF2 = this.g0;
            rectF2.set(f14 * 10.0f, f16, d - (f14 * 10.0f), f17);
            Path path2 = this.h0;
            path2.rewind();
            path2.addRoundRect(rectF2, f14 * 5.0f, f14 * 5.0f, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(255);
            canvas2.drawRect(f14 * 10.0f, f16, 13.0f * f14, f17, paint2);
            canvas.restore();
            float f18 = (5.66f * f14) + f16;
            if (!this.K || (f01Var2 = this.L) == null) {
                f12 = d;
                e10 = f11;
                f13 = 2.66f;
            } else {
                float j3 = (f01Var2.j() / 2.0f) + f18;
                int color = paint2.getColor();
                f12 = d;
                e10 = f11;
                f13 = 2.66f;
                f01Var2.c(f14 * 20.0f, j3, e10, color, canvas);
                f18 = p6.a(f14, 2.66f, this.L.j(), f18);
            }
            if (!this.I || (f01Var = this.J) == null) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                f01Var.c(f14 * 20.0f, (f01Var.j() / 2.0f) + f18, e10, i0.a.d(e7, -13421773, -1), canvas2);
                f18 = p6.a(f14, f13, this.J.j(), f18);
            }
            if (this.M && this.O != null) {
                canvas2.save();
                canvas2.translate((f14 * 20.0f) - this.Q, f18);
                this.N.setColor(i0.a.d(e7, -13421773, -1));
                this.N.setAlpha((int) (255.0f * e10));
                this.O.draw(canvas2);
                canvas2.restore();
                f18 = p6.a(f14, f13, this.O.getHeight(), f18);
            }
            float e12 = this.m0.e(this.R);
            if (e12 > 0.0f) {
                float e13 = this.n0.e(this.S);
                this.j0.set(f14 * 20.0f, (f14 * f13) + f18, f12 - (20.0f * f14), (f14 * f13) + f18 + this.d0);
                this.k0.set(((f12 - (f14 * 10.0f)) - (f14 * 6.0f)) - (48.0f * f14), (f14 * 6.0f) + f16, (f12 - (f14 * 10.0f)) - (f14 * 6.0f), (48.0f * f14) + (6.0f * f14) + f16);
                AndroidUtilities.lerp(this.j0, this.k0, e13, rectF2);
                float f19 = rectF2.left;
                float f20 = rectF2.top;
                float width = rectF2.width();
                float height = rectF2.height();
                ImageReceiver imageReceiver = this.T;
                imageReceiver.setImageCoords(f19, f20, width, height);
                imageReceiver.setAlpha(e12 * e10);
                imageReceiver.draw(canvas2);
                f18 += ((f14 * 2.66f) + this.d0) * (f7 - e13);
            }
            float f21 = (5.0f * f14) + (7.0f * f14) + f18;
            f01 f01Var4 = this.G;
            if (f01Var4 != null && f7 - f10 > 0.0f) {
                f01Var4.c(f14 * 10.0f, (f01Var4.j() / 2.0f) + f21 + (((15.0f * f14) + this.G.j()) * f10), e10, -15033089, canvas2);
                this.G.j();
            }
            canvas2.restore();
        } else {
            f7 = 1.0f;
        }
        if (e10 < f7) {
            float f22 = this.x.left;
            int y3 = ((int) com.google.android.gms.internal.vision.e2.y(f14, 30.0f, d10, 2.0f)) + i11;
            Drawable drawable = this.y;
            drawable.setBounds(((int) (f22 * f14)) + i10, ((int) com.google.android.gms.internal.vision.e2.v(f14, 30.0f, d10, 2.0f)) + i11, ((int) ((f22 + 30.0f) * f14)) + i10, y3);
            int i12 = (int) ((f7 - e10) * 255.0f);
            drawable.setAlpha(i12);
            drawable.draw(canvas2);
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(((this.x.left + 30.0f + 3.25f) * f14) + i10, (d10 / 2.0f) + i11);
                float f23 = this.n;
                canvas2.scale(f23, f23);
                canvas2.translate(-this.w, (-this.s.getHeight()) / 2.0f);
                this.r.setAlpha(i12);
                this.s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i10, p0 p0Var, boolean z10) {
        this.a = i10;
        if (this.W != p0Var || z10) {
            this.W = p0Var;
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
                int[] iArr = j6.r8;
                color1 = j6.w0(null, iArr[colorId % iArr.length], false);
            } else {
                color1 = color.getColor1();
            }
            this.H.setColor(color1);
            this.b0 = (7.33f * f12) + this.b0;
            this.F = this.W.f;
            f01 f01Var = new f01(str2, 16.0f, null);
            f01Var.a.setTextSize(16.0f * f12);
            float f14 = 20.0f * f12;
            f01Var.q(f13 - f14);
            this.G = f01Var;
            this.a0 = Math.max(this.a0, Math.min(f14 + f01Var.c, f13));
            float f15 = 7.0f * f12;
            this.b0 = this.G.j() + this.b0 + f15;
            this.R = webPage.photo != null || MessageObject.isVideoDocument(webPage.document);
            p0 p0Var = this.W;
            boolean z10 = p0Var.e;
            this.S = !z10;
            int i14 = (!this.U || (p0Var.a & 4) == 0) ? ((int) (!z10 ? 48.0f : (f13 / f12) - 40.0f)) * 2 : p0Var.i;
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
                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo), a4.a.k(i14, i14, "_"), this.U ? null : ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo), this.U ? null : a4.a.k(i14, i14, "_"), 0L, null, null, 0);
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
                    imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document), a4.a.k(i14, i14, "_"), this.U ? null : ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document), this.U ? null : a4.a.k(i14, i14, "_"), 0L, null, null, 0);
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
                f01 f01Var2 = new f01(webPage.site_name, 14.0f, AndroidUtilities.bold());
                f01Var2.a.setTextSize(f12 * 14.0f);
                float f16 = f12 * 40.0f;
                f01Var2.q((int) Math.ceil((f13 - f16) - ((this.R && this.S) ? f12 * 60.0f : 0.0f)));
                this.L = f01Var2;
                this.a0 = Math.max(this.a0, Math.min(f16 + f01Var2.c + ((this.R && this.S) ? f12 * 60.0f : 0.0f), f13));
                this.c0 = (f12 * 2.66f) + this.L.j() + this.c0;
                i12 = this.L.b.getLineCount();
            }
            boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
            this.I = !isEmpty2;
            if (isEmpty2) {
                f10 = f12;
                f11 = 2.66f;
            } else {
                f01 f01Var3 = new f01(webPage.title, 14.0f, AndroidUtilities.bold());
                f01Var3.a.setTextSize(f12 * 14.0f);
                float f17 = f12 * 40.0f;
                f11 = 2.66f;
                f10 = f12;
                f01Var3.q((int) Math.ceil((f13 - f17) - ((this.R && this.S) ? f12 * 60.0f : 0.0f)));
                this.J = f01Var3;
                this.a0 = Math.max(this.a0, Math.min(f17 + f01Var3.c + ((this.R && this.S) ? 60.0f * f10 : 0.0f), f13));
                this.c0 = (f10 * 2.66f) + this.J.j() + this.c0;
                i12 += this.J.b.getLineCount();
            }
            boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
            this.M = !isEmpty3;
            if (!isEmpty3) {
                TextPaint textPaint = this.N;
                textPaint.setTextSize(f10 * 14.0f);
                float f18 = f10 * 40.0f;
                int i15 = 3 - i12;
                this.O = org.telegram.ui.Cells.t1.u2(webPage.description, textPaint, (int) Math.ceil(Math.max(1.0f, f13 - f18)), (int) Math.ceil(Math.max(1.0f, f13 - ((40 + ((this.R && this.S) ? 60 : 0)) * f10))), i15, 4);
                this.P = 0.0f;
                this.Q = Float.MAX_VALUE;
                int i16 = 0;
                while (i16 < this.O.getLineCount()) {
                    this.P = Math.max(this.P, this.O.getLineWidth(i16) + (this.R && this.S && i16 < i15 ? f10 * f7 : 0.0f));
                    this.Q = Math.min(this.Q, this.O.getLineLeft(i16));
                    i16++;
                }
                this.a0 = Math.max(this.a0, Math.min(f18 + this.P, f13));
                this.c0 = (f10 * f11) + this.c0 + this.O.getHeight();
            }
            if (this.R && !this.S) {
                if (i11 <= 0 || i10 <= 0) {
                    this.d0 = f10 * 120.0f;
                } else {
                    this.d0 = Math.min((Math.max(0.0f, this.a0 - (f10 * 40.0f)) / i11) * i10, f10 * 200.0f);
                }
                this.c0 = (f10 * f11) + this.c0 + this.d0;
            }
            float f19 = f15 + this.c0;
            this.c0 = f19;
            this.b0 = (f10 * 11.0f) + this.b0 + f19;
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
        p0 p0Var = this.W;
        return (p0Var == null || p0Var.d == null) ? false : true;
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
