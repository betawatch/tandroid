package zf;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class n0 extends View {
    public final Paint A;
    public boolean B;
    public pz0 C;
    public final Paint D;
    public boolean E;
    public pz0 F;
    public boolean G;
    public pz0 H;
    public boolean I;
    public final TextPaint J;
    public StaticLayout K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final ImageReceiver P;
    public boolean Q;
    public int R;
    public m0 S;
    public float T;
    public float U;
    public float V;
    public float W;
    public int a;
    public int a0;
    public int b;
    public final RectF b0;
    public boolean c;
    public final RectF c0;
    public boolean d;
    public final Path d0;
    public final float e;
    public final Path e0;
    public final int f;
    public final RectF f0;
    public final RectF g0;
    public final int h;
    public final y5 h0;
    public final y5 i0;
    public final y5 j0;
    public final y5 k0;
    public final y5 l0;
    public final y5 m0;
    public float n;
    public final y5 n0;
    public final y5 o0;
    public final TextPaint r;
    public StaticLayout s;
    public float v;
    public float w;
    public final RectF x;
    public final Drawable y;

    public n0(Context context, float f10) {
        super(context);
        this.c = true;
        this.n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        this.x = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.A = new Paint(1);
        this.D = new Paint(1);
        this.J = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        this.b0 = new RectF();
        this.c0 = new RectF();
        this.d0 = new Path();
        this.e0 = new Path();
        this.f0 = new RectF();
        this.g0 = new RectF();
        er erVar = er.h;
        this.h0 = new y5(this, 0L, 350L, erVar);
        this.i0 = new y5(this, 0L, 350L, erVar);
        this.j0 = new y5(this, 0L, 350L, erVar);
        this.k0 = new y5(this, 0L, 350L, erVar);
        this.l0 = new y5(this, 0L, 350L, erVar);
        this.m0 = new y5(this, 0L, 350L, erVar);
        this.n0 = new y5(this, 0L, 350L, erVar);
        this.o0 = new y5(this, 0L, 350L, erVar);
        this.e = f10;
        imageReceiver.setInvalidateAll(true);
        this.f = (int) (f10 * 3.0f);
        this.h = (int) (f10 * 1.0f);
        this.y = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f10);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        Path.Direction direction;
        float f13;
        float f14;
        pz0 pz0Var;
        pz0 pz0Var2;
        Canvas canvas2 = canvas;
        d();
        float d = this.n0.d(this.T, false);
        float d10 = this.o0.d(this.U, false);
        float e9 = this.l0.e(this.R == 0);
        float e10 = this.k0.e(e());
        float f15 = this.e;
        float lerp = AndroidUtilities.lerp(0.2f * d10, 16.66f * f15, e10);
        int i10 = this.f;
        int i11 = this.h;
        RectF rectF = this.b0;
        rectF.set(i10, i11, i10 + d, i11 + d10);
        int d11 = i0.b.d(e10, this.a0, i0.b.d(e9, -1, -14670807));
        Paint paint = this.A;
        paint.setColor(d11);
        Path path = this.e0;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, lerp, lerp, direction2);
        canvas2.drawPath(path, paint);
        if (e10 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i10, i11);
            float e11 = this.h0.e(this.B);
            float f16 = (7.33f * f15) + 0.0f;
            pz0 pz0Var3 = this.C;
            if (pz0Var3 == null || e11 <= 0.0f) {
                f11 = e11;
                f12 = e10;
                direction = direction2;
                f10 = 1.0f;
            } else {
                direction = direction2;
                f11 = e11;
                f10 = 1.0f;
                pz0Var3.c(f15 * 10.0f, pa.b(1.0f, e11, (15.0f * f15) + this.C.j(), (pz0Var3.j() / 2.0f) + f16), e10, -15033089, canvas2);
                f12 = e10;
                f16 = (((7.0f * f15) + this.C.j()) * f11) + f16;
            }
            float f17 = f16;
            float d12 = this.m0.d(this.V, false);
            Paint paint2 = this.D;
            paint2.setAlpha(25);
            float f18 = d12 + f17;
            RectF rectF2 = this.c0;
            rectF2.set(f15 * 10.0f, f17, d - (f15 * 10.0f), f18);
            Path path2 = this.d0;
            path2.rewind();
            path2.addRoundRect(rectF2, f15 * 5.0f, f15 * 5.0f, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(255);
            canvas2.drawRect(f15 * 10.0f, f17, 13.0f * f15, f18, paint2);
            canvas.restore();
            float f19 = (5.66f * f15) + f17;
            if (!this.G || (pz0Var2 = this.H) == null) {
                f13 = d;
                e10 = f12;
                f14 = 2.66f;
            } else {
                float j10 = (pz0Var2.j() / 2.0f) + f19;
                int color = paint2.getColor();
                f13 = d;
                e10 = f12;
                f14 = 2.66f;
                pz0Var2.c(f15 * 20.0f, j10, e10, color, canvas);
                f19 = com.google.android.recaptcha.internal.a.d(f15, 2.66f, this.H.j(), f19);
            }
            if (!this.E || (pz0Var = this.F) == null) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                pz0Var.c(f15 * 20.0f, (pz0Var.j() / 2.0f) + f19, e10, i0.b.d(e9, -13421773, -1), canvas2);
                f19 = com.google.android.recaptcha.internal.a.d(f15, f14, this.F.j(), f19);
            }
            if (this.I && this.K != null) {
                canvas2.save();
                canvas2.translate((f15 * 20.0f) - this.M, f19);
                this.J.setColor(i0.b.d(e9, -13421773, -1));
                this.J.setAlpha((int) (255.0f * e10));
                this.K.draw(canvas2);
                canvas2.restore();
                f19 = com.google.android.recaptcha.internal.a.d(f15, f14, this.K.getHeight(), f19);
            }
            float e12 = this.i0.e(this.N);
            if (e12 > 0.0f) {
                float e13 = this.j0.e(this.O);
                this.f0.set(f15 * 20.0f, (f15 * f14) + f19, f13 - (20.0f * f15), (f15 * f14) + f19 + this.W);
                this.g0.set(((f13 - (f15 * 10.0f)) - (f15 * 6.0f)) - (48.0f * f15), (f15 * 6.0f) + f17, (f13 - (f15 * 10.0f)) - (f15 * 6.0f), (48.0f * f15) + (6.0f * f15) + f17);
                AndroidUtilities.lerp(this.f0, this.g0, e13, rectF2);
                float f20 = rectF2.left;
                float f21 = rectF2.top;
                float width = rectF2.width();
                float height = rectF2.height();
                ImageReceiver imageReceiver = this.P;
                imageReceiver.setImageCoords(f20, f21, width, height);
                imageReceiver.setAlpha(e12 * e10);
                imageReceiver.draw(canvas2);
                f19 += ((f15 * 2.66f) + this.W) * (f10 - e13);
            }
            float f22 = (5.0f * f15) + (7.0f * f15) + f19;
            pz0 pz0Var4 = this.C;
            if (pz0Var4 != null && f10 - f11 > 0.0f) {
                pz0Var4.c(f15 * 10.0f, (pz0Var4.j() / 2.0f) + f22 + (((15.0f * f15) + this.C.j()) * f11), e10, -15033089, canvas2);
                this.C.j();
            }
            canvas2.restore();
        } else {
            f10 = 1.0f;
        }
        if (e10 < f10) {
            float f23 = this.x.left;
            int y10 = ((int) com.google.android.recaptcha.internal.a.y(f15, 30.0f, d10, 2.0f)) + i11;
            Drawable drawable = this.y;
            drawable.setBounds(((int) (f23 * f15)) + i10, ((int) com.google.android.recaptcha.internal.a.w(f15, 30.0f, d10, 2.0f)) + i11, ((int) ((f23 + 30.0f) * f15)) + i10, y10);
            int i12 = (int) ((f10 - e10) * 255.0f);
            drawable.setAlpha(i12);
            drawable.draw(canvas2);
            if (this.s != null) {
                canvas2.save();
                canvas2.translate(((this.x.left + 30.0f + 3.25f) * f15) + i10, (d10 / 2.0f) + i11);
                float f24 = this.n;
                canvas2.scale(f24, f24);
                canvas2.translate(-this.w, (-this.s.getHeight()) / 2.0f);
                this.r.setAlpha(i12);
                this.s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i10, m0 m0Var, boolean z10) {
        this.a = i10;
        if (this.S != m0Var || z10) {
            this.S = m0Var;
            this.c = true;
            this.d = z10;
            requestLayout();
        }
    }

    public final void c(int i10, int i11) {
        Drawable drawable = this.y;
        TextPaint textPaint = this.r;
        if (i10 == 0) {
            this.a0 = i11;
            int i12 = AndroidUtilities.computePerceivedBrightness(i11) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            this.a0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 2) {
            this.a0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.a0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        int color1;
        float f10;
        int i10;
        int i11;
        int i12;
        float f11;
        float f12;
        if (!this.c || this.S == null) {
            return;
        }
        boolean e9 = e();
        int i13 = this.f;
        float f13 = this.e;
        if (e9) {
            String str2 = TextUtils.isEmpty(this.S.b) ? this.S.c : this.S.b;
            TLRPC.WebPage webPage = this.S.d;
            float f14 = (this.b - i13) - i13;
            this.U = 0.0f;
            this.T = 0.0f;
            this.V = 0.0f;
            int colorId = UserObject.getColorId(UserConfig.getInstance(this.a).getCurrentUser());
            MessagesController.PeerColors peerColors = MessagesController.getInstance(this.a).peerColors;
            MessagesController.PeerColor color = (peerColors == null || colorId < 7) ? null : peerColors.getColor(colorId);
            if (color == null) {
                int[] iArr = g6.r8;
                color1 = g6.w0(null, iArr[colorId % iArr.length], false);
            } else {
                color1 = color.getColor1();
            }
            this.D.setColor(color1);
            this.U = (7.33f * f13) + this.U;
            this.B = this.S.f;
            pz0 pz0Var = new pz0(str2, 16.0f, null);
            pz0Var.a.setTextSize(16.0f * f13);
            float f15 = 20.0f * f13;
            pz0Var.q(f14 - f15);
            this.C = pz0Var;
            this.T = Math.max(this.T, Math.min(f15 + pz0Var.c, f14));
            float f16 = 7.0f * f13;
            this.U = this.C.j() + this.U + f16;
            this.N = webPage.photo != null || MessageObject.isVideoDocument(webPage.document);
            m0 m0Var = this.S;
            boolean z10 = m0Var.e;
            this.O = !z10;
            int i14 = (!this.Q || (m0Var.a & 4) == 0) ? ((int) (!z10 ? 48.0f : (f14 / f13) - 40.0f)) * 2 : m0Var.i;
            ImageReceiver imageReceiver = this.P;
            imageReceiver.setRoundRadius((int) (4.0f * f13));
            TLRPC.Photo photo = webPage.photo;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1, false, null, false);
                f10 = 48.0f;
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, (int) (i14 * f13), false, closestPhotoSizeWithSize, false);
                if (closestPhotoSizeWithSize2 != null) {
                    i11 = closestPhotoSizeWithSize2.w;
                    i10 = closestPhotoSizeWithSize2.h;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo), com.google.android.recaptcha.internal.a.l(i14, "_", i14), this.Q ? null : ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo), this.Q ? null : com.google.android.recaptcha.internal.a.l(i14, "_", i14), 0L, null, null, 0);
            } else {
                f10 = 48.0f;
                TLRPC.Document document = webPage.document;
                if (document != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1, false, null, false);
                    TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(webPage.document.thumbs, (int) (i14 * f13), false, closestPhotoSizeWithSize3, false);
                    if (closestPhotoSizeWithSize4 != null) {
                        i11 = closestPhotoSizeWithSize4.w;
                        i10 = closestPhotoSizeWithSize4.h;
                    } else {
                        i10 = 0;
                        i11 = 0;
                    }
                    imageReceiver.setImage(ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document), com.google.android.recaptcha.internal.a.l(i14, "_", i14), this.Q ? null : ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document), this.Q ? null : com.google.android.recaptcha.internal.a.l(i14, "_", i14), 0L, null, null, 0);
                } else {
                    i10 = 0;
                    i11 = 0;
                }
            }
            this.V = (5.66f * f13) + this.V;
            boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
            this.G = !isEmpty;
            if (isEmpty) {
                i12 = 0;
            } else {
                pz0 pz0Var2 = new pz0(webPage.site_name, 14.0f, AndroidUtilities.bold());
                pz0Var2.a.setTextSize(f13 * 14.0f);
                float f17 = f13 * 40.0f;
                pz0Var2.q((int) Math.ceil((f14 - f17) - ((this.N && this.O) ? f13 * 60.0f : 0.0f)));
                this.H = pz0Var2;
                this.T = Math.max(this.T, Math.min(f17 + pz0Var2.c + ((this.N && this.O) ? f13 * 60.0f : 0.0f), f14));
                this.V = (f13 * 2.66f) + this.H.j() + this.V;
                i12 = this.H.b.getLineCount();
            }
            boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
            this.E = !isEmpty2;
            if (isEmpty2) {
                f11 = f13;
                f12 = 2.66f;
            } else {
                pz0 pz0Var3 = new pz0(webPage.title, 14.0f, AndroidUtilities.bold());
                pz0Var3.a.setTextSize(f13 * 14.0f);
                float f18 = f13 * 40.0f;
                f12 = 2.66f;
                f11 = f13;
                pz0Var3.q((int) Math.ceil((f14 - f18) - ((this.N && this.O) ? f13 * 60.0f : 0.0f)));
                this.F = pz0Var3;
                this.T = Math.max(this.T, Math.min(f18 + pz0Var3.c + ((this.N && this.O) ? 60.0f * f11 : 0.0f), f14));
                this.V = (f11 * 2.66f) + this.F.j() + this.V;
                i12 += this.F.b.getLineCount();
            }
            boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
            this.I = !isEmpty3;
            if (!isEmpty3) {
                TextPaint textPaint = this.J;
                textPaint.setTextSize(f11 * 14.0f);
                float f19 = f11 * 40.0f;
                int i15 = 3 - i12;
                this.K = org.telegram.ui.Cells.s1.t2(webPage.description, textPaint, (int) Math.ceil(Math.max(1.0f, f14 - f19)), (int) Math.ceil(Math.max(1.0f, f14 - ((40 + ((this.N && this.O) ? 60 : 0)) * f11))), i15, 4);
                this.L = 0.0f;
                this.M = Float.MAX_VALUE;
                int i16 = 0;
                while (i16 < this.K.getLineCount()) {
                    this.L = Math.max(this.L, this.K.getLineWidth(i16) + (this.N && this.O && i16 < i15 ? f11 * f10 : 0.0f));
                    this.M = Math.min(this.M, this.K.getLineLeft(i16));
                    i16++;
                }
                this.T = Math.max(this.T, Math.min(f19 + this.L, f14));
                this.V = (f11 * f12) + this.V + this.K.getHeight();
            }
            if (this.N && !this.O) {
                if (i11 <= 0 || i10 <= 0) {
                    this.W = f11 * 120.0f;
                } else {
                    this.W = Math.min((Math.max(0.0f, this.T - (f11 * 40.0f)) / i11) * i10, f11 * 200.0f);
                }
                this.V = (f11 * f12) + this.V + this.W;
            }
            float f20 = f16 + this.V;
            this.V = f20;
            this.U = (f11 * 11.0f) + this.U + f20;
        } else {
            if (TextUtils.isEmpty(this.S.b)) {
                String str3 = this.S.c;
                if (str3.startsWith("https://")) {
                    str3 = str3.substring(8);
                }
                str = str3.toUpperCase();
            } else {
                str = this.S.b;
            }
            float f21 = (this.b - i13) - i13;
            RectF rectF = this.x;
            float f22 = f21 - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f13);
            this.n = 1.0f;
            double d = f22;
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
                this.n = Math.min(1.0f, f22 / this.v);
            }
            this.T = (this.v * this.n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f13);
            this.U = Math.max(f13 * 30.0f, this.s.getHeight() * this.n) + ((rectF.top + rectF.bottom) * f13);
        }
        if (this.d) {
            invalidate();
        } else {
            this.h0.f(this.B, true);
            this.j0.f(this.O, true);
            this.i0.f(this.N, true);
            this.m0.d(this.V, true);
        }
        this.c = false;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        m0 m0Var = this.S;
        return (m0Var == null || m0Var.d == null) ? false : true;
    }

    public int getPhotoSide() {
        float f10;
        if (this.O) {
            f10 = 48.0f;
        } else {
            int i10 = this.b;
            int i11 = this.f;
            f10 = (((i10 - i11) - i11) / this.e) - 40.0f;
        }
        return ((int) f10) * 2;
    }

    public int getPreviewType() {
        return this.R;
    }

    public float getRadius() {
        float f10;
        float f11;
        if (e()) {
            f10 = 16.66f;
            f11 = this.e;
        } else {
            f10 = 0.2f;
            f11 = this.U;
        }
        return f11 * f10;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        d();
        int ceil = (int) Math.ceil(this.T);
        int i12 = this.f;
        int i13 = ceil + i12 + i12;
        int ceil2 = (int) Math.ceil(this.U);
        int i14 = this.h;
        setMeasuredDimension(i13, ceil2 + i14 + i14);
    }

    public void setMaxWidth(int i10) {
        this.b = i10;
        this.c = true;
    }

    public void setPreviewType(int i10) {
        this.R = i10;
        invalidate();
    }
}
