// default package

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
import java.util.HashSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rl0 extends Drawable implements snb {
    public final Paint E;
    public int F;
    public boolean G;
    public int H;
    public final Paint a;
    public final jl0 b;
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

    public rl0(jl0 jl0Var) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.c = new Matrix();
        this.e = new Matrix();
        this.r = new Matrix();
        Paint paint2 = new Paint(1);
        this.s = paint2;
        jn jnVar = new jn(this, (byte) 1);
        this.E = new Paint(1);
        this.H = jn7.d4;
        this.b = jl0Var;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint2.setFilterBitmap(true);
        b(hl.L(40.0f), false);
        jl0Var.setCallback(jnVar);
    }

    public static LinearGradient a(int i, boolean z) {
        int alpha = Color.alpha(i);
        return z ? new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{vm2.o(i, 0), vm2.o(i, (alpha * 96) / jn7.H4), vm2.o(i, (alpha * jn7.F2) / jn7.H4), vm2.o(i, (alpha * jn7.H3) / jn7.H4)}, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{vm2.o(i, 0), vm2.o(i, (alpha * 96) / jn7.d4), vm2.o(i, (alpha * jn7.F2) / jn7.d4), vm2.o(i, (alpha * jn7.H3) / jn7.d4), vm2.o(i, (alpha * jn7.d4) / jn7.d4)}, (float[]) null, Shader.TileMode.CLAMP);
    }

    public final void b(int i, boolean z) {
        if (this.x == i && this.y == z) {
            return;
        }
        this.x = i;
        this.y = z;
        LinearGradient a = a(-16777216, z);
        this.d = a;
        this.a.setShader(a);
        this.E.setShader(null);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setScale(1.0f, i);
        if (i < 0) {
            matrix.postTranslate(0.0f, -i);
        }
        this.d.setLocalMatrix(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int height;
        int i;
        boolean z;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.H == 0) {
            return;
        }
        jl0 jl0Var = this.b;
        mz4 v = jl0.v(jl0Var.r);
        if (!this.G) {
            boolean z2 = v instanceof oz4;
            Matrix matrix = this.c;
            Matrix matrix2 = this.e;
            if (z2) {
                int i2 = ((oz4) v).b;
                int i3 = this.F;
                Paint paint = this.E;
                if (i3 != i2 || this.f == null) {
                    LinearGradient a = a(i2, this.y);
                    this.f = a;
                    this.F = i2;
                    paint.setShader(a);
                }
                height = this.x < 0 ? bounds.height() + this.x : 0;
                matrix2.set(matrix);
                matrix2.postTranslate(bounds.left, bounds.top + height);
                this.f.setLocalMatrix(matrix2);
                paint.setAlpha(this.H);
                canvas.drawRect(bounds, paint);
                return;
            }
            if ((v instanceof nz4) && (i = Build.VERSION.SDK_INT) >= 28) {
                nz4 nz4Var = (nz4) v;
                Bitmap bitmap = nz4Var.d;
                if (bitmap != null) {
                    boolean z3 = true;
                    if (this.F != -16777216 || this.f == null) {
                        this.f = a(-16777216, this.y);
                        this.F = -16777216;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.h == null || this.w != bitmap) {
                        this.w = bitmap;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.h = bitmapShader;
                        if (i >= 33) {
                            bitmapShader.setFilterMode(2);
                        }
                    } else {
                        z3 = z;
                    }
                    Paint paint2 = this.s;
                    if (z3 || this.n == null) {
                        ComposeShader composeShader = new ComposeShader(this.h, this.f, PorterDuff.Mode.DST_IN);
                        this.n = composeShader;
                        paint2.setShader(composeShader);
                    }
                    height = this.x < 0 ? bounds.height() + this.x : 0;
                    matrix2.set(matrix);
                    matrix2.postTranslate(bounds.left, bounds.top + height);
                    this.f.setLocalMatrix(matrix2);
                    Matrix matrix3 = nz4Var.b;
                    Matrix matrix4 = this.r;
                    matrix4.set(matrix3);
                    matrix4.postTranslate(-jl0Var.d, -jl0Var.e);
                    this.h.setLocalMatrix(matrix4);
                    paint2.setAlpha(this.H);
                    canvas.drawRect(bounds, paint2);
                    return;
                }
                return;
            }
        }
        int saveLayerAlpha = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.H);
        height = this.x < 0 ? bounds.height() + this.x : 0;
        jl0Var.draw(canvas);
        canvas.translate(bounds.left, bounds.top + height);
        canvas.drawRect(0.0f, -height, bounds.width(), bounds.height() - height, this.a);
        canvas.restoreToCount(saveLayerAlpha);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.H;
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
    public final void setAlpha(int i) {
        this.H = i;
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.b.updateColors();
            invalidateSelf();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
