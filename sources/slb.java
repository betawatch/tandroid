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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class slb implements wjb {
    public wjb a;
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
    public final /* synthetic */ qmb l;
    public final /* synthetic */ qmb m;

    public slb(qmb qmbVar) {
        this.m = qmbVar;
        this.l = qmbVar;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(gl.L(Math.max(16, gba.T0) - 2));
        textPaint2.setTextSize(gl.L(Math.max(16, gba.T0) - 2));
        textPaint3.setTextSize(gl.L(15.0f));
        textPaint3.setTypeface(gl.o());
        paint.setColor(352321536);
    }

    @Override // wjb
    public final boolean a() {
        imb imbVar = this.m.r1;
        if (imbVar != null) {
            return imbVar.a();
        }
        imb imbVar2 = this.l.r1;
        if (imbVar2 != null) {
            return imbVar2.a();
        }
        wjb wjbVar = this.a;
        return wjbVar != null ? wjbVar.a() : bkb.I.o();
    }

    @Override // wjb
    public final void b(float f, float f2, int i, int i2) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.i;
        if (bitmap == null || (bitmapShader = this.j) == null) {
            bkb.q(f, f2, i, i2);
        } else {
            bkb.r(bitmap, bitmapShader, this.k, i, i2, f, f2);
        }
    }

    @Override // wjb
    public final ColorFilter c() {
        return bkb.u3;
    }

    @Override // wjb
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
                wjb wjbVar = this.a;
                return wjbVar != null ? wjbVar.d(str) : bkb.T0(str);
        }
    }

    @Override // wjb
    public final boolean e() {
        return gba.D0;
    }

    @Override // wjb
    public final int f(int i) {
        return h(i);
    }

    @Override // wjb
    public final boolean g() {
        wjb wjbVar = this.a;
        return wjbVar != null ? wjbVar.g() : bkb.b1();
    }

    @Override // wjb
    public final Drawable getDrawable(String str) {
        wjb wjbVar = this.a;
        return wjbVar != null ? wjbVar.getDrawable(str) : bkb.P0(str);
    }

    @Override // wjb
    public final int h(int i) {
        wjb wjbVar = this.a;
        return wjbVar != null ? wjbVar.h(i) : bkb.w0(null, i, false);
    }

    @Override // wjb
    public final int j(int i) {
        wjb wjbVar = this.a;
        return wjbVar != null ? wjbVar.j(i) : h(i);
    }

    public final void k(Drawable drawable, Drawable drawable2, Float f) {
        int i = bkb.bd;
        int h = h(i);
        int h2 = h(bkb.cd);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z = drawable instanceof ye7;
        TextPaint textPaint = this.g;
        TextPaint textPaint2 = this.f;
        if ((z || (drawable instanceof BitmapDrawable)) && gba.o() != 0 && e66.e(32)) {
            Bitmap bitmap = z ? ((ye7) drawable).k : drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
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
            int i2 = bkb.Yc;
            textPaint2.setColor(h(i2));
            textPaint.setColor(h(i2));
            textPaint2.linkColor = h(bkb.Zc);
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
            if (((ye7) drawable).q >= 0.0f) {
                colorMatrix.setSaturation(1.6f);
                gl.l2(colorMatrix, a() ? 0.97f : 0.92f);
                gl.h(colorMatrix, a() ? 0.12f : -0.06f);
            } else {
                colorMatrix.setSaturation(1.1f);
                gl.l2(colorMatrix, a() ? 0.4f : 0.8f);
                gl.h(colorMatrix, a() ? 0.08f : -0.06f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            gl.l2(colorMatrix, a() ? 0.9f : 0.84f);
            gl.h(colorMatrix, a() ? -0.04f : 0.06f);
        }
        if (z) {
            float f2 = ((ye7) drawable).q;
            if (f != null) {
                f2 = f.floatValue();
            }
            if (f2 >= 0.0f) {
                colorMatrix.setSaturation(1.8f);
                gl.l2(colorMatrix, 0.97f);
                gl.h(colorMatrix, 0.03f);
            } else {
                colorMatrix.setSaturation(0.5f);
                gl.l2(colorMatrix, 0.35f);
                gl.h(colorMatrix, 0.03f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            gl.l2(colorMatrix, 0.97f);
            gl.h(colorMatrix, 0.06f);
        }
        paint.setShader(this.j);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setAlpha(kk7.d4);
        paint2.setShader(this.j);
        ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
        gl.l2(colorMatrix2, 0.85f);
        paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        paint2.setAlpha(kk7.d4);
    }

    @Override // wjb
    public final void i(int i, int i2) {
    }
}
