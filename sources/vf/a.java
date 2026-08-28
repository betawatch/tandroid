package vf;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a extends Drawable {
    public static SvgHelper.SvgDrawable j;
    public static final int[] k = {7322096, 16766590, 13338331, 9367192, 16749490, 16478047};
    public static final SparseArray l;
    public final SvgHelper.SvgDrawable a;
    public LinearGradient b;
    public int e;
    public final Paint f;
    public final Paint g;
    public int[] h;
    public final Matrix c = new Matrix();
    public final ArrayList d = new ArrayList();
    public int i = -1;

    static {
        SparseArray sparseArray = new SparseArray();
        l = sparseArray;
        sparseArray.put(7322096, new int[]{-16687423, -11814913});
        sparseArray.put(16766590, new int[]{-1419264, -9380});
        sparseArray.put(13338331, new int[]{-6014789, -1737985});
        sparseArray.put(9367192, new int[]{-15617007, -6823116});
        sparseArray.put(16749490, new int[]{-1826470, -34407});
        sparseArray.put(16478047, new int[]{-3795707, -36532});
    }

    public a(int i9) {
        if (j == null) {
            j = SvgHelper.getDrawable(R.raw.topic_bubble, -1);
        }
        SvgHelper.SvgDrawable clone = j.clone();
        this.a = clone;
        clone.copyCommandFromPosition(0);
        Paint paint = new Paint(1);
        this.g = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint2.setStyle(Paint.Style.STROKE);
        clone.setPaint(paint, 1);
        clone.setPaint(paint2, 2);
        b(i9);
    }

    public static int a(int i9, int i10) {
        return Math.abs(Color.blue(i9) - Color.blue(i10)) + Math.abs(Color.green(i9) - Color.green(i10)) + Math.abs(Color.red(i9) - Color.red(i10));
    }

    public final void b(int i9) {
        int i10 = this.i;
        if (i10 == i9 && i10 == -1) {
            return;
        }
        this.i = i9;
        int[] iArr = k;
        int a2 = a(iArr[0], i9);
        this.e = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            int a3 = a(iArr[i11], i9);
            if (a3 < a2) {
                this.e = i11;
                a2 = a3;
            }
        }
        int[] iArr2 = (int[]) l.get(iArr[this.e]);
        int[] iArr3 = f6.I.q() ? new int[]{i0.a.d(0.2f, iArr2[0], -1), i0.a.d(0.2f, iArr2[1], -1)} : iArr2;
        this.h = iArr3;
        Paint paint = new Paint(1);
        LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, iArr3, (float[]) null, Shader.TileMode.CLAMP);
        this.b = linearGradient;
        linearGradient.setLocalMatrix(this.c);
        paint.setShader(this.b);
        this.a.setPaint(paint, 0);
        this.g.setColor(i0.a.d(0.1f, iArr3[1], -1));
        this.f.setColor(i0.a.d(0.1f, iArr3[0], -16777216));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setScale(1.0f, getBounds().height() / 100.0f);
        this.b.setLocalMatrix(matrix);
        Rect bounds = getBounds();
        SvgHelper.SvgDrawable svgDrawable = this.a;
        svgDrawable.setBounds(bounds);
        svgDrawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i9 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i9)).invalidate();
            i9++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.a.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
