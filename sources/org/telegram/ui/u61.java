package org.telegram.ui;

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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class u61 implements org.telegram.ui.ActionBar.i6 {
    public org.telegram.ui.ActionBar.i6 a;
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
    public final /* synthetic */ v71 l;
    public final /* synthetic */ v71 m;

    public u61(v71 v71Var) {
        this.m = v71Var;
        this.l = v71Var;
        Paint paint = new Paint(3);
        this.e = paint;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        TextPaint textPaint2 = new TextPaint();
        this.g = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        this.h = textPaint3;
        textPaint.setTextSize(org.telegram.messenger.g0.L(Math.max(16, org.telegram.messenger.bz.W0) - 2));
        textPaint2.setTextSize(org.telegram.messenger.g0.L(Math.max(16, org.telegram.messenger.bz.W0) - 2));
        textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
        textPaint3.setTypeface(org.telegram.messenger.g0.o());
        paint.setColor(352321536);
    }

    public final void a(Drawable drawable, Drawable drawable2, Float f10) {
        int i7 = org.telegram.ui.ActionBar.n6.cd;
        int i10 = i(i7);
        int i11 = i(org.telegram.ui.ActionBar.n6.dd);
        if (drawable == null) {
            drawable = drawable2;
        }
        boolean z10 = drawable instanceof org.telegram.ui.Components.za0;
        TextPaint textPaint = this.g;
        TextPaint textPaint2 = this.f;
        if ((z10 || (drawable instanceof BitmapDrawable)) && org.telegram.messenger.bz.o() != 0 && org.telegram.messenger.pc.e(32)) {
            Bitmap bitmap = z10 ? ((org.telegram.ui.Components.za0) drawable).k : drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
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
            int i12 = org.telegram.ui.ActionBar.n6.Zc;
            textPaint2.setColor(i(i12));
            textPaint.setColor(i(i12));
            textPaint2.linkColor = i(org.telegram.ui.ActionBar.n6.ad);
        }
        Paint paint = this.c;
        paint.setColor(i10);
        Paint paint2 = this.d;
        paint2.setColor(i11);
        if (this.j == null || !(this.b.indexOfKey(i7) < 0 || z10 || (drawable instanceof BitmapDrawable))) {
            paint.setColorFilter(null);
            paint.setShader(null);
            paint2.setColorFilter(null);
            paint2.setShader(null);
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        if (z10) {
            if (((org.telegram.ui.Components.za0) drawable).q >= 0.0f) {
                colorMatrix.setSaturation(1.6f);
                org.telegram.messenger.g0.n2(colorMatrix, b() ? 0.97f : 0.92f);
                org.telegram.messenger.g0.h(colorMatrix, b() ? 0.12f : -0.06f);
            } else {
                colorMatrix.setSaturation(1.1f);
                org.telegram.messenger.g0.n2(colorMatrix, b() ? 0.4f : 0.8f);
                org.telegram.messenger.g0.h(colorMatrix, b() ? 0.08f : -0.06f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            org.telegram.messenger.g0.n2(colorMatrix, b() ? 0.9f : 0.84f);
            org.telegram.messenger.g0.h(colorMatrix, b() ? -0.04f : 0.06f);
        }
        if (z10) {
            float f11 = ((org.telegram.ui.Components.za0) drawable).q;
            if (f10 != null) {
                f11 = f10.floatValue();
            }
            if (f11 >= 0.0f) {
                colorMatrix.setSaturation(1.8f);
                org.telegram.messenger.g0.n2(colorMatrix, 0.97f);
                org.telegram.messenger.g0.h(colorMatrix, 0.03f);
            } else {
                colorMatrix.setSaturation(0.5f);
                org.telegram.messenger.g0.n2(colorMatrix, 0.35f);
                org.telegram.messenger.g0.h(colorMatrix, 0.03f);
            }
        } else {
            colorMatrix.setSaturation(1.6f);
            org.telegram.messenger.g0.n2(colorMatrix, 0.97f);
            org.telegram.messenger.g0.h(colorMatrix, 0.06f);
        }
        paint.setShader(this.j);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        paint.setAlpha(org.telegram.messenger.ks.e4);
        paint2.setShader(this.j);
        ColorMatrix colorMatrix2 = new ColorMatrix(colorMatrix);
        org.telegram.messenger.g0.n2(colorMatrix2, 0.85f);
        paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        paint2.setAlpha(org.telegram.messenger.ks.e4);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean b() {
        n71 n71Var = this.m.r1;
        if (n71Var != null) {
            return n71Var.b();
        }
        n71 n71Var2 = this.l.r1;
        if (n71Var2 != null) {
            return n71Var2.b();
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        return i6Var != null ? i6Var.b() : org.telegram.ui.ActionBar.n6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final void c(float f10, float f11, int i7, int i10) {
        BitmapShader bitmapShader;
        Bitmap bitmap = this.i;
        if (bitmap == null || (bitmapShader = this.j) == null) {
            org.telegram.ui.ActionBar.n6.r(f10, f11, i7, i10);
        } else {
            org.telegram.ui.ActionBar.n6.s(bitmap, bitmapShader, this.k, i7, i10, f10, f11);
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final ColorFilter d() {
        return org.telegram.ui.ActionBar.n6.v3;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Paint e(String str) {
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
                org.telegram.ui.ActionBar.i6 i6Var = this.a;
                return i6Var != null ? i6Var.e(str) : org.telegram.ui.ActionBar.n6.V0(str);
        }
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean f() {
        return org.telegram.messenger.bz.H0;
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int g(int i7) {
        return i(i7);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final Drawable getDrawable(String str) {
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        return i6Var != null ? i6Var.getDrawable(str) : org.telegram.ui.ActionBar.n6.R0(str);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final boolean h() {
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        return i6Var != null ? i6Var.h() : org.telegram.ui.ActionBar.n6.d1();
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int i(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        return i6Var != null ? i6Var.i(i7) : org.telegram.ui.ActionBar.n6.v0(i7);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final int k(int i7) {
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        return i6Var != null ? i6Var.k(i7) : i(i7);
    }

    @Override // org.telegram.ui.ActionBar.i6
    public final /* synthetic */ void j(int i7, int i10) {
    }
}
