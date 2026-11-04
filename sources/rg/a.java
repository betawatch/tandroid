package rg;

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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.jz;
import org.telegram.messenger.kz;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a extends Drawable {
    public static jz j;
    public static final int[] k = {7322096, 16766590, 13338331, 9367192, 16749490, 16478047};
    public static final SparseArray l;
    public final jz a;
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

    public a(int i3) {
        if (j == null) {
            j = kz.h(R.raw.topic_bubble, -1);
        }
        jz clone = j.clone();
        SparseArray sparseArray = clone.r;
        this.a = clone;
        ArrayList arrayList = clone.a;
        arrayList.add(arrayList.get(0));
        Paint paint = new Paint(1);
        this.g = paint;
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setStrokeWidth(g0.L(1.0f));
        paint2.setStyle(Paint.Style.STROKE);
        sparseArray.put(1, paint);
        sparseArray.put(2, paint2);
        b(i3);
    }

    public static int a(int i3, int i10) {
        return Math.abs(Color.blue(i3) - Color.blue(i10)) + Math.abs(Color.green(i3) - Color.green(i10)) + Math.abs(Color.red(i3) - Color.red(i10));
    }

    public final void b(int i3) {
        int i10 = this.i;
        if (i10 == i3 && i10 == -1) {
            return;
        }
        this.i = i3;
        int[] iArr = k;
        int a10 = a(iArr[0], i3);
        this.e = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            int a11 = a(iArr[i11], i3);
            if (a11 < a10) {
                this.e = i11;
                a10 = a11;
            }
        }
        int[] iArr2 = (int[]) l.get(iArr[this.e]);
        int[] iArr3 = k6.I.q() ? new int[]{i0.a.f(0.2f, iArr2[0], -1), i0.a.f(0.2f, iArr2[1], -1)} : iArr2;
        this.h = iArr3;
        Paint paint = new Paint(1);
        LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, iArr3, (float[]) null, Shader.TileMode.CLAMP);
        this.b = linearGradient;
        linearGradient.setLocalMatrix(this.c);
        paint.setShader(this.b);
        this.a.r.put(0, paint);
        this.g.setColor(i0.a.f(0.1f, iArr3[1], -1));
        this.f.setColor(i0.a.f(0.1f, iArr3[0], -16777216));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Matrix matrix = this.c;
        matrix.reset();
        matrix.setScale(1.0f, getBounds().height() / 100.0f);
        this.b.setLocalMatrix(matrix);
        Rect bounds = getBounds();
        jz jzVar = this.a;
        jzVar.setBounds(bounds);
        jzVar.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return g0.L(24.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i3)).invalidate();
            i3++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.a.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
