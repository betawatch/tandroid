// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tnb implements ylb {
    public ylb a;
    public final SparseIntArray b = new SparseIntArray();
    public final Paint c = new Paint(3);
    public final Paint d = new Paint(3);
    public final Paint e;
    public final TextPaint f;
    public final TextPaint g;
    public final TextPaint h;
    public Bitmap i;
    public BitmapShader j;
    public Matrix k;
    public final /* synthetic */ rob l;
    public final /* synthetic */ rob m;

    public tnb(rob robVar) {
        this.m = robVar;
        this.l = robVar;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(gm.L(Math.max(16, gda.S0) - 2));
        textPaint2.setTextSize(gm.L(Math.max(16, gda.S0) - 2));
        textPaint3.setTextSize(gm.L(15.0f));
        textPaint3.setTypeface(gm.o());
        paint.setColor(352321536);
    }

    @Override // ylb
    public final boolean a() {
        job jobVar = this.m.r1;
        if (jobVar != null) {
            return jobVar.a();
        }
        job jobVar2 = this.l.r1;
        if (jobVar2 != null) {
            return jobVar2.a();
        }
        ylb ylbVar = this.a;
        return ylbVar != null ? ylbVar.a() : cmb.I.o();
    }

    @Override // ylb
    public final void b(float f, float f2, int i, int i2) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.i;
        if (bitmap == null || (bitmapShader = this.j) == null) {
            cmb.q(f, f2, i, i2);
        } else {
            cmb.r(bitmap, bitmapShader, this.k, i, i2, f, f2);
        }
    }

    @Override // ylb
    public final ColorFilter c() {
        return cmb.u3;
    }

    @Override // ylb
    public final Paint d(String str) {
        str.getClass();
        switch (str) {
            case "paintChatActionText2":
                return this.g;
            case "paintChatActionBackground":
                return this.c;
            case "paintChatBotButton":
                return this.h;
            case "paintChatActionBackgroundDarken":
                return this.e;
            case "paintChatActionBackgroundSelected":
                return this.d;
            case "paintChatActionText":
                return this.f;
            default:
                ylb ylbVar = this.a;
                return ylbVar != null ? ylbVar.d(str) : cmb.T0(str);
        }
    }

    @Override // ylb
    public final boolean e() {
        return gda.D0;
    }

    @Override // ylb
    public final int f(int i) {
        return h(i);
    }

    @Override // ylb
    public final boolean g() {
        ylb ylbVar = this.a;
        return ylbVar != null ? ylbVar.g() : cmb.b1();
    }

    @Override // ylb
    public final Drawable getDrawable(String str) {
        ylb ylbVar = this.a;
        return ylbVar != null ? ylbVar.getDrawable(str) : cmb.P0(str);
    }

    @Override // ylb
    public final int h(int i) {
        ylb ylbVar = this.a;
        return ylbVar != null ? ylbVar.h(i) : cmb.w0(null, i, false);
    }

    @Override // ylb
    public final int j(int i) {
        ylb ylbVar = this.a;
        return ylbVar != null ? ylbVar.j(i) : h(i);
    }

    public final void k(Drawable drawable, Drawable drawable2, Float f) {
        int i = cmb.bd;
        int h = h(i);
        int h2 = h(cmb.cd);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z = drawable instanceof ah7;
        TextPaint textPaint = this.g;
        TextPaint textPaint2 = this.f;
        if ((z || (drawable instanceof BitmapDrawable)) && gda.o() != 0 && e86.e(32)) {
            Bitmap bitmap = z ? ((ah7) drawable).k : drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
            if (this.i != bitmap) {
                this.i = bitmap;
                Bitmap bitmap2 = this.i;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.j = new BitmapShader(bitmap2, tileMode, tileMode);
                if (this.k == null) {
                    this.k = new Matrix();
                }
            }
            textPaint2.setColor(-1);
            textPaint.setColor(-1);
            textPaint2.linkColor = -1;
            this.h.setColor(-1);
        } else {
            this.i = null;
            this.j = null;
            int i2 = cmb.Yc;
            textPaint2.setColor(h(i2));
            textPaint.setColor(h(i2));
            textPaint2.linkColor = h(cmb.Zc);
        }
        Paint paint = this.c;
        paint.setColor(h);
        Paint paint2 = this.d;
        paint2.setColor(h2);
        if (this.j == null || !(this.b.indexOfKey(i) < 0 || z || (drawable instanceof BitmapDrawable))) {
            paint.setColorFilter(null);
            paint.setShader(null);
            paint2.setColorFilter(null);
            paint2.setShader(null);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        if (z) {
            if (((ah7) drawable).q >= 0.0f) {
                colorMatrix.setSaturation(1.6f);
                gm.l2(colorMatrix, a() ? 0.97f : 0.92f);
                gm.h(colorMatrix, a() ? 0.12f : -0.06f);
            } else {
                colorMatrix.setSaturation(1.1f);
                gm.l2(colorMatrix, a() ? 0.4f : 0.8f);
                gm.h(colorMatrix, a() ? 0.08f : -0.06f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            gm.l2(colorMatrix, a() ? 0.9f : 0.84f);
            gm.h(colorMatrix, a() ? -0.04f : 0.06f);
        }
        if (z) {
            float f2 = ((ah7) drawable).q;
            if (f != null) {
                f2 = f.floatValue();
            }
            if (f2 >= 0.0f) {
                colorMatrix.setSaturation(1.8f);
                gm.l2(colorMatrix, 0.97f);
                gm.h(colorMatrix, 0.03f);
            } else {
                colorMatrix.setSaturation(0.5f);
                gm.l2(colorMatrix, 0.35f);
                gm.h(colorMatrix, 0.03f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            gm.l2(colorMatrix, 0.97f);
            gm.h(colorMatrix, 0.06f);
        }
        paint.setShader(this.j);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setAlpha(nm7.d4);
        paint2.setShader(this.j);
        ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
        gm.l2(colorMatrix2, 0.85f);
        paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        paint2.setAlpha(nm7.d4);
    }

    @Override // ylb
    public final void i(int i, int i2) {
    }
}
