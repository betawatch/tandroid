package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u11 extends View {
    public static final float P = AndroidUtilities.dp(2.0f);
    public static final float Q = AndroidUtilities.dp(20.0f);
    public final Paint A;
    public org.telegram.ui.Components.mi0 B;
    public String C;
    public boolean D;
    public String E;
    public int F;
    public boolean G;
    public final float[] H;
    public boolean I;
    public final r11 J;
    public Integer K;
    public Integer L;
    public String M;
    public String N;
    public boolean O;
    public final org.telegram.ui.Components.jb0 a;
    public final Paint b;
    public final BitmapShader c;
    public final BitmapShader d;
    public l11 e;
    public Bitmap f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public final org.telegram.ui.Components.sn0 s;
    public TextPaint v;
    public StaticLayout w;
    public final org.telegram.ui.Components.y5 x;
    public final Paint y;

    public u11(Context context) {
        super(context);
        org.telegram.ui.Components.jb0 jb0Var = new org.telegram.ui.Components.jb0();
        this.a = jb0Var;
        Paint paint = new Paint(1);
        this.b = paint;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.x = new org.telegram.ui.Components.y5(1.0f, this, 0L, 2000L, grVar);
        Paint paint2 = new Paint(1);
        this.y = paint2;
        Paint paint3 = new Paint(1);
        this.A = paint3;
        this.H = new float[8];
        this.J = new r11(this, 0);
        this.O = true;
        jb0Var.N = true;
        jb0Var.r(this);
        Bitmap bitmap = jb0Var.k;
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.c = bitmapShader;
        BitmapShader bitmapShader2 = new BitmapShader(jb0Var.k, tileMode, tileMode);
        this.d = bitmapShader2;
        paint.setShader(bitmapShader);
        org.telegram.ui.Components.sn0 sn0Var = new org.telegram.ui.Components.sn0(this);
        this.s = sn0Var;
        sn0Var.k(0.35f, 300L, grVar);
        sn0Var.setCallback(this);
        sn0Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        sn0Var.a.setShader(bitmapShader2);
        sn0Var.b = 17;
        sn0Var.t(AndroidUtilities.dp(35.0f));
        sn0Var.q("", true, true);
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode2));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode2));
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(Canvas canvas) {
        l11 l11Var;
        if (this.B != null) {
            int y10 = org.telegram.messenger.ll.y(60.0f, getWidth(), 33);
            int i9 = (y10 * 33) + 32;
            int width = (getWidth() - i9) / 2;
            int height = (int) (getHeight() * 0.15f);
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                height = (int) (getHeight() * 0.09f);
            }
            int i10 = height;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, 255, 31);
            int i11 = width + 16;
            int i12 = i10 + 16;
            Paint paint = this.b;
            canvas.drawRect(i11, i12, (getWidth() - width) - 16, (((getWidth() + i10) - width) - width) - 16, paint);
            canvas.save();
            this.B.setBounds(i11, i12, (getWidth() - width) - 16, (((getWidth() + i10) - width) - width) - 16);
            this.B.draw(canvas);
            canvas.restore();
            canvas.restore();
            float width2 = getWidth() / 2.0f;
            float f10 = i10;
            float f11 = width;
            float width3 = ((getWidth() / 2.0f) + f10) - f11;
            float round = ((Math.round((r8 / 4.65f) / r6) * y10) / 2) * 0.75f;
            canvas.drawCircle(width2, width3, round, paint);
            TelegramQRCodeWriter.drawSideQuads(canvas, f11, f10, paint, 7.0f, y10, 16, i9, 0.75f, this.H, true);
            if (this.I || (l11Var = this.e) == null) {
                return;
            }
            z11 z11Var = l11Var.a;
            z11Var.c.set((int) (width2 - round), (int) (width3 - round), (int) (width2 + round), (int) (width3 + round));
            z11Var.A.requestLayout();
            this.I = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0202 A[LOOP:1: B:59:0x01d4->B:68:0x0202, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ff A[EDGE_INSN: B:69:0x01ff->B:70:0x01ff BREAK  A[LOOP:1: B:59:0x01d4->B:68:0x0202], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i9, int i10) {
        String str;
        int i11;
        float f10;
        int i12;
        StaticLayout staticLayout;
        int i13;
        Bitmap bitmap;
        int i14;
        Drawable drawable;
        Integer num;
        if (i9 == 0 || i10 == 0) {
            return;
        }
        if ((TextUtils.isEmpty(this.C) && !this.r) || TextUtils.isEmpty(this.E)) {
            AndroidUtilities.runOnUIThread(new r11(this, 1));
            return;
        }
        String upperCase = this.r ? null : this.D ? this.C : this.C.toUpperCase();
        if (TextUtils.equals(upperCase, this.M) && TextUtils.equals(this.E, this.N) && (num = this.K) != null && this.L != null && num.intValue() == i9 && this.L.intValue() == i10) {
            return;
        }
        final Bitmap createBitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
        TextPaint textPaint = new TextPaint(65);
        int i15 = -16777216;
        textPaint.setColor(-16777216);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        int A = org.telegram.messenger.ll.A(20.0f, 2, createBitmap.getWidth());
        if (!this.r) {
            int i16 = 0;
            for (int i17 = 2; i16 <= i17; i17 = 2) {
                if (i16 == 0) {
                    drawable = getContext().getDrawable(R.drawable.qr_at_large);
                    textPaint.setTextSize(AndroidUtilities.dp(30.0f));
                } else if (i16 == 1) {
                    drawable = getContext().getDrawable(R.drawable.qr_at_medium);
                    textPaint.setTextSize(AndroidUtilities.dp(25.0f));
                } else {
                    drawable = getContext().getDrawable(R.drawable.qr_at_small);
                    textPaint.setTextSize(AndroidUtilities.dp(19.0f));
                }
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    drawable.setColorFilter(new PorterDuffColorFilter(i15, PorterDuff.Mode.SRC_IN));
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ta.b.d(" ", upperCase));
                if (!this.D) {
                    spannableStringBuilder.setSpan(new org.telegram.ui.Cells.v6(drawable), 0, 1, 33);
                }
                float measureText = textPaint.measureText(spannableStringBuilder, 1, spannableStringBuilder.length()) + drawable.getBounds().width();
                if (i16 > 1 || measureText <= A) {
                    int i18 = measureText > ((float) A) ? 2 : 1;
                    int dp = i18 > 1 ? AndroidUtilities.dp(2.0f) + (((int) (drawable.getBounds().width() + measureText)) / 2) : A;
                    if (dp > A) {
                        dp = AndroidUtilities.dp(4.0f) + (((int) (measureText + drawable.getBounds().width())) / 3);
                        i18 = 3;
                    }
                    int i19 = dp;
                    i12 = 0;
                    str = upperCase;
                    i11 = 2;
                    f10 = 30.0f;
                    staticLayout = org.telegram.ui.Components.rv0.c(spannableStringBuilder, textPaint, i19, Layout.Alignment.ALIGN_CENTER, 0.0f, false, null, Math.min(AndroidUtilities.dp(10.0f) + i19, createBitmap.getWidth()), i18, true);
                    float lineCount = (staticLayout != null ? 0 : staticLayout.getLineCount()) * (textPaint.descent() - textPaint.ascent());
                    int A2 = org.telegram.messenger.ll.A(f10, i11, i9);
                    HashMap hashMap = new HashMap();
                    hashMap.put(kb.b.a, pb.b.c);
                    hashMap.put(kb.b.c, Integer.valueOf(i12));
                    TelegramQRCodeWriter telegramQRCodeWriter = new TelegramQRCodeWriter();
                    i13 = 3;
                    bitmap = null;
                    while (true) {
                        if (i13 < 5) {
                            i14 = -16777216;
                            break;
                        }
                        try {
                            hashMap.put(kb.b.d, Integer.valueOf(i13));
                            bitmap = telegramQRCodeWriter.encode(this.E, A2, A2, hashMap, null, 0.75f, 16777215, -16777216);
                            i14 = -16777216;
                        } catch (Exception unused) {
                            i14 = -16777216;
                        }
                        try {
                            i12 = telegramQRCodeWriter.getImageSize();
                        } catch (Exception unused2) {
                            if (bitmap == null) {
                            }
                        }
                        if (bitmap == null) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    final int i20 = i12;
                    if (bitmap != null) {
                        return;
                    }
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.drawColor(16777215);
                    float width = (i9 - bitmap.getWidth()) / 2.0f;
                    float f11 = i10;
                    float f12 = 0.15f * f11;
                    if (staticLayout != null && staticLayout.getLineCount() == 3) {
                        f12 = 0.13f * f11;
                    }
                    if (((ViewGroup) getParent()).getMeasuredWidth() >= ((ViewGroup) getParent()).getMeasuredHeight()) {
                        f12 = 0.09f * f11;
                    }
                    canvas.drawBitmap(bitmap, width, f12, new Paint(3));
                    Paint paint = new Paint(1);
                    paint.setColor(i14);
                    final float width2 = (bitmap.getWidth() * 0.5f) + width;
                    final float width3 = (bitmap.getWidth() * 0.5f) + f12;
                    canvas.drawCircle(width2, width3, i20 * 0.5f, paint);
                    if (staticLayout != null) {
                        canvas.save();
                        canvas.translate((canvas.getWidth() - staticLayout.getWidth()) * 0.5f, ((((canvas.getHeight() - (f12 + bitmap.getHeight())) - lineCount) * 0.5f) + (bitmap.getHeight() + f12)) - AndroidUtilities.dp(4.0f));
                        staticLayout.draw(canvas);
                        canvas.restore();
                        bitmap.recycle();
                    }
                    this.K = Integer.valueOf(i9);
                    this.L = Integer.valueOf(i10);
                    this.M = str;
                    this.N = this.E;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.t11
                        @Override // java.lang.Runnable
                        public final void run() {
                            u11 u11Var = u11.this;
                            Bitmap bitmap2 = u11Var.h;
                            u11Var.h = createBitmap.extractAlpha();
                            if (!u11Var.O) {
                                u11Var.x.d(0.0f, true);
                            }
                            u11Var.O = false;
                            Bitmap bitmap3 = u11Var.n;
                            if (bitmap3 != null) {
                                bitmap3.recycle();
                            }
                            u11Var.n = bitmap2;
                            l11 l11Var = u11Var.e;
                            if (l11Var != null) {
                                float f13 = i20 * 0.5f;
                                float f14 = width2;
                                float f15 = width3;
                                z11 z11Var = l11Var.a;
                                z11Var.c.set((int) (f14 - f13), (int) (f15 - f13), (int) (f14 + f13), (int) (f15 + f13));
                                z11Var.A.requestLayout();
                                u11Var.I = true;
                            }
                            u11Var.invalidate();
                        }
                    });
                    return;
                }
                i16++;
                i15 = -16777216;
            }
        }
        str = upperCase;
        i11 = 2;
        f10 = 30.0f;
        i12 = 0;
        staticLayout = null;
        float lineCount2 = (staticLayout != null ? 0 : staticLayout.getLineCount()) * (textPaint.descent() - textPaint.ascent());
        int A22 = org.telegram.messenger.ll.A(f10, i11, i9);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(kb.b.a, pb.b.c);
        hashMap2.put(kb.b.c, Integer.valueOf(i12));
        TelegramQRCodeWriter telegramQRCodeWriter2 = new TelegramQRCodeWriter();
        i13 = 3;
        bitmap = null;
        while (true) {
            if (i13 < 5) {
            }
            i13++;
        }
        final int i202 = i12;
        if (bitmap != null) {
        }
    }

    public final void c(String str, String str2, boolean z10, boolean z11) {
        this.G = true;
        this.C = str2;
        this.D = z10;
        if (z11) {
            TLRPC.TL_exportedContactToken cachedContactToken = MessagesController.getInstance(UserConfig.selectedAccount).getCachedContactToken();
            if (cachedContactToken != null) {
                this.E = cachedContactToken.url;
                this.F = cachedContactToken.expires;
            } else {
                this.E = null;
            }
        } else {
            this.E = str;
        }
        this.r = z11;
        Utilities.themeQueue.postRunnable(new s11(this, getWidth(), getHeight(), 0));
        invalidate();
        this.J.run();
    }

    public final void d(boolean z10) {
        if (this.r) {
            if (!z10) {
                this.w = null;
                return;
            }
            if (this.v == null) {
                this.v = new TextPaint(1);
            }
            this.v.setShader(this.d);
            this.v.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            this.v.setTextSize(AndroidUtilities.dp(25.0f));
            String str = this.C;
            if (str == null) {
                str = "";
            }
            this.w = org.telegram.ui.Components.rv0.c(Emoji.replaceEmoji(str, this.v.getFontMetricsInt(), false), this.v, getWidth(), Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, getWidth() - AndroidUtilities.dp(60.0f), 1, true);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J.run();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.mi0 mi0Var = this.B;
        if (mi0Var != null) {
            mi0Var.stop();
            this.B.A(false);
            this.B = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        float f10;
        super.onDraw(canvas);
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        float d = this.x.d(1.0f, false);
        boolean z10 = d > 0.0f && d < 1.0f;
        Paint paint = this.b;
        if (d < 1.0f) {
            if (z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.saveLayerAlpha(rectF, 255, 31);
            }
            Bitmap bitmap2 = this.n;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
            } else {
                a(canvas);
            }
            if (z10) {
                float dp = AndroidUtilities.dp(120.0f);
                canvas.save();
                canvas.translate(0.0f, e2.c.z(1.0f, d, getHeight() + dp, -dp));
                i9 = 255;
                i10 = 31;
                f10 = 120.0f;
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight() + dp, this.A);
                canvas.restore();
                canvas.restore();
                if (d > 0.0f) {
                    if (z10) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        canvas.saveLayerAlpha(rectF2, i9, i10);
                    }
                    Bitmap bitmap3 = this.h;
                    if (bitmap3 != null) {
                        canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
                        this.a.z();
                    } else {
                        a(canvas);
                    }
                    if (z10) {
                        float dp2 = AndroidUtilities.dp(f10);
                        canvas.save();
                        float f11 = -dp2;
                        canvas.translate(0.0f, e2.c.z(1.0f, d, getHeight() + dp2, f11));
                        canvas.drawRect(0.0f, f11 - getHeight(), getWidth(), getHeight() + dp2, this.y);
                        canvas.restore();
                        canvas.restore();
                    }
                }
                if (this.r) {
                    return;
                }
                float dp3 = AndroidUtilities.dp(6.0f) + getWidth();
                if (this.w != null) {
                    canvas.save();
                    canvas.translate(0.0f, dp3);
                    if (this.w.getWidth() != getWidth()) {
                        d(true);
                    }
                    this.w.draw(canvas);
                    canvas.restore();
                    return;
                }
                int i11 = (int) dp3;
                int width = getWidth();
                int dp4 = AndroidUtilities.dp(40.0f) + i11;
                org.telegram.ui.Components.sn0 sn0Var = this.s;
                sn0Var.setBounds(0, i11, width, dp4);
                sn0Var.draw(canvas);
                return;
            }
        }
        i9 = 255;
        i10 = 31;
        f10 = 120.0f;
        if (d > 0.0f) {
        }
        if (this.r) {
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 == i11 && i10 == i12) {
            return;
        }
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f = null;
        }
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float dp = AndroidUtilities.dp(4.0f);
        float f10 = P;
        paint.setShadowLayer(dp, 0.0f, f10, 251658240);
        this.f = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f);
        float f11 = i9;
        RectF rectF = new RectF(f10, f10, f11 - f10, getHeight() - f10);
        float f12 = Q;
        canvas.drawRoundRect(rectF, f12, f12, paint);
        if (this.G) {
            Utilities.themeQueue.postRunnable(new s11(this, i9, i10, 1));
        }
        float max = Math.max((getWidth() * 1.0f) / this.a.k.getWidth(), (getHeight() * 1.0f) / this.a.k.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        this.c.setLocalMatrix(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(max, max);
        matrix2.postTranslate(f11 / 2.0f, AndroidUtilities.dp(6.0f) + getWidth());
        this.d.setLocalMatrix(matrix2);
    }
}
