package tg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import bi.s0;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c extends Drawable implements k6 {
    public final Paint D;
    public int E;
    public boolean F;
    public int G;
    public final Paint a;
    public final vg.f b;
    public final Matrix c;
    public LinearGradient d;
    public final Matrix e;
    public LinearGradient f;
    public BitmapShader h;
    public ComposeShader n;
    public final Matrix r;
    public final Paint s;
    public Bitmap w;
    public int x;
    public boolean y;

    public c(vg.f fVar) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = new Matrix();
        this.e = new Matrix();
        this.r = new Matrix();
        Paint paint2 = new Paint(1);
        this.s = paint2;
        s0 s0Var = new s0(this, 10);
        this.D = new Paint(1);
        this.G = zs.e4;
        this.b = fVar;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(i0.L(40.0f), false);
        fVar.setCallback(s0Var);
    }

    public static LinearGradient a(int i10, boolean z10) {
        int alpha = Color.alpha(i10);
        return z10 ? new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.b.o(i10, 0), i0.b.o(i10, (alpha * 96) / zs.I4), i0.b.o(i10, (alpha * zs.G2) / zs.I4), i0.b.o(i10, (alpha * zs.I3) / zs.I4)}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{i0.b.o(i10, 0), i0.b.o(i10, (alpha * 96) / zs.e4), i0.b.o(i10, (alpha * zs.G2) / zs.e4), i0.b.o(i10, (alpha * zs.I3) / zs.e4), i0.b.o(i10, (alpha * zs.e4) / zs.e4)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i10, boolean z10) {
        if (this.x == i10 && this.y == z10) {
            return;
        }
        this.x = i10;
        this.y = z10;
        LinearGradient a2 = a(-16777216, z10);
        this.d = a2;
        this.a.setShader(a2);
        this.D.setShader(null);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setScale(1.0f, i10);
        if (i10 < 0) {
            matrix.postTranslate(0.0f, -i10);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int height;
        int i10;
        boolean z10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.G == 0) {
            return;
        }
        vg.f fVar = this.b;
        hi.a u10 = vg.f.u(fVar.f);
        boolean z11 = this.F;
        Matrix matrix = this.c;
        Matrix matrix2 = this.e;
        if (!z11 && (u10 instanceof hi.c)) {
            int i11 = ((hi.c) u10).b;
            int i12 = this.E;
            Paint paint = this.D;
            if (i12 != i11 || this.f == null) {
                LinearGradient a2 = a(i11, this.y);
                this.f = a2;
                this.E = i11;
                paint.setShader(a2);
            }
            height = this.x < 0 ? bounds.height() + this.x : 0;
            matrix2.set(matrix);
            matrix2.postTranslate(bounds.left, bounds.top + height);
            this.f.setLocalMatrix(matrix2);
            paint.setAlpha(this.G);
            canvas.drawRect(bounds, paint);
            return;
        }
        if (z11 || !(u10 instanceof hi.b) || (i10 = Build.VERSION.SDK_INT) < 28) {
            int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.G);
            height = this.x < 0 ? bounds.height() + this.x : 0;
            fVar.draw(canvas);
            canvas.translate(bounds.left, bounds.top + height);
            canvas.drawRect(0.0f, -height, bounds.width(), bounds.height() - height, this.a);
            canvas.restoreToCount(saveLayerAlpha);
            return;
        }
        hi.b bVar = (hi.b) u10;
        Bitmap bitmap = bVar.d;
        if (bitmap == null) {
            return;
        }
        boolean z12 = true;
        if (this.E != -16777216 || this.f == null) {
            this.f = a(-16777216, this.y);
            this.E = -16777216;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.h == null || this.w != bitmap) {
            this.w = bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.h = bitmapShader;
            if (i10 >= 33) {
                bitmapShader.setFilterMode(2);
            }
        } else {
            z12 = z10;
        }
        Paint paint2 = this.s;
        if (z12 || this.n == null) {
            ComposeShader composeShader = new ComposeShader(this.h, this.f, PorterDuff.Mode.DST_IN);
            this.n = composeShader;
            paint2.setShader(composeShader);
        }
        height = this.x < 0 ? bounds.height() + this.x : 0;
        matrix2.set(matrix);
        matrix2.postTranslate(bounds.left, bounds.top + height);
        this.f.setLocalMatrix(matrix2);
        Matrix matrix3 = bVar.b;
        Matrix matrix4 = this.r;
        matrix4.set(matrix3);
        matrix4.postTranslate(-fVar.d, -fVar.e);
        this.h.setLocalMatrix(matrix4);
        paint2.setAlpha(this.G);
        canvas.drawRect(bounds, paint2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.G;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.G = i10;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.b.updateColors();
            invalidateSelf();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
