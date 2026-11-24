// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class we0 extends GradientDrawable {
    public final int[] a;
    public final qt b;
    public final qt c;
    public final qt d;
    public final ArrayList e;
    public final Paint f;
    public boolean g;

    public we0(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.b = new qt(0);
        this.c = new qt(0);
        this.d = new qt(0);
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.g = false;
        setDither(true);
        this.a = iArr;
        paint.setDither(true);
    }

    public static GradientDrawable.Orientation c(int i) {
        return i != 0 ? i != 90 ? i != 135 ? i != 180 ? i != 225 ? i != 270 ? i != 315 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BR_TL : GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.TR_BL : GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.BOTTOM_TOP;
    }

    public static Rect d(GradientDrawable.Orientation orientation, int i, int i2) {
        Rect rect = new Rect();
        switch (ue0.a[orientation.ordinal()]) {
            case 1:
                int i3 = i / 2;
                rect.left = i3;
                rect.top = 0;
                rect.right = i3;
                rect.bottom = i2;
                break;
            case 2:
                rect.left = i;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = i2;
                break;
            case 3:
                rect.left = i;
                int i4 = i2 / 2;
                rect.top = i4;
                rect.right = 0;
                rect.bottom = i4;
                break;
            case 4:
                rect.left = i;
                rect.top = i2;
                rect.right = 0;
                rect.bottom = 0;
                break;
            case 5:
                int i5 = i / 2;
                rect.left = i5;
                rect.top = i2;
                rect.right = i5;
                rect.bottom = 0;
                break;
            case 6:
                rect.left = 0;
                rect.top = i2;
                rect.right = i;
                rect.bottom = 0;
                break;
            case 7:
                rect.left = 0;
                int i6 = i2 / 2;
                rect.top = i6;
                rect.right = i;
                rect.bottom = i6;
                break;
            default:
                rect.left = 0;
                rect.top = 0;
                rect.right = i;
                rect.bottom = i2;
                break;
        }
        return rect;
    }

    public final void a() {
        if (this.g) {
            return;
        }
        for (int size = this.e.size() - 1; size >= 0; size--) {
            mp3 mp3Var = Utilities.e;
            Runnable[] runnableArr = (Runnable[]) this.e.remove(size);
            mp3Var.getClass();
            for (Runnable runnable : runnableArr) {
                mp3Var.a(runnable);
            }
        }
        for (int i = this.b.c - 1; i >= 0; i--) {
            Bitmap bitmap = (Bitmap) this.b.g(i);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.c.clear();
        this.d.clear();
        this.g = true;
    }

    public final ve0 b(Canvas canvas, final ViewGroup viewGroup) {
        if (this.g) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int width = (int) (bounds.width() * 0.5f);
        int height = (int) (bounds.height() * 0.5f);
        qt qtVar = this.b;
        int i = qtVar.c;
        int i2 = 0;
        while (true) {
            qt qtVar2 = this.d;
            if (i2 >= i) {
                ve0 ve0Var = (ve0) qtVar2.remove(viewGroup);
                if (ve0Var != null) {
                    ve0Var.dispose();
                }
                ir5 ir5Var = new ir5(width, height);
                qtVar.put(ir5Var, null);
                this.c.put(ir5Var, Boolean.TRUE);
                final se0 g = g(new ir5[]{ir5Var}, new te0(this, viewGroup), 0L);
                ve0 ve0Var2 = (ve0) qtVar2.put(viewGroup, new ve0() { // from class: qe0
                    @Override // ve0
                    public final void dispose() {
                        we0.this.d.remove(viewGroup);
                        g.dispose();
                    }
                });
                super.draw(canvas);
                return ve0Var2;
            }
            ir5 ir5Var2 = (ir5) qtVar.f(i2);
            if (ir5Var2.a == width && ir5Var2.b == height) {
                Bitmap bitmap = (Bitmap) qtVar.i(i2);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, bounds, this.f);
                } else {
                    super.draw(canvas);
                }
                return (ve0) qtVar2.get(viewGroup);
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.g) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        qt qtVar = this.b;
        int i = qtVar.c;
        float f = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            ir5 ir5Var = (ir5) qtVar.f(i2);
            float f2 = f;
            float sqrt = (float) Math.sqrt(Math.pow(height - ir5Var.b, 2.0d) + Math.pow(width - ir5Var.a, 2.0d));
            if (sqrt >= f2 || (bitmap = (Bitmap) qtVar.i(i2)) == null || ((bool = (Boolean) this.c.get(ir5Var)) != null && bool.booleanValue())) {
                f = f2;
            } else {
                bitmap2 = bitmap;
                f = sqrt;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.f);
        } else {
            super.draw(canvas);
        }
    }

    public final /* synthetic */ void e(Runnable[] runnableArr, Bitmap bitmap, ir5 ir5Var, int i, wpd[] wpdVarArr) {
        ArrayList arrayList = this.e;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        qt qtVar = this.b;
        if (bitmap != null) {
            qtVar.put(ir5Var, bitmap);
        } else {
            qtVar.remove(ir5Var);
            this.c.remove(ir5Var);
        }
        runnableArr[i] = null;
        boolean z = true;
        if (runnableArr.length > 1) {
            for (Runnable runnable : runnableArr) {
                if (runnable != null) {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            arrayList.remove(runnableArr);
        }
        wpd wpdVar = wpdVarArr[0];
        if (wpdVar != null) {
            wpdVar.b(ir5Var.a, ir5Var.b);
            if (z) {
                return;
            }
            wpdVarArr[0].a();
            wpdVarArr[0] = null;
        }
    }

    public final se0 f(ni6 ni6Var, wpd wpdVar, long j) {
        ir5[] ir5VarArr = (ir5[]) ni6Var.b;
        if (!this.g) {
            ArrayList arrayList = new ArrayList(ir5VarArr.length);
            for (ir5 ir5Var : ir5VarArr) {
                qt qtVar = this.b;
                if (!qtVar.containsKey(ir5Var)) {
                    qtVar.put(ir5Var, null);
                    arrayList.add(ir5Var);
                }
            }
            if (!arrayList.isEmpty()) {
                return g((ir5[]) arrayList.toArray(new ir5[0]), wpdVar, j);
            }
        }
        return null;
    }

    public final void finalize() {
        try {
            a();
        } finally {
            super.finalize();
        }
    }

    public final se0 g(ir5[] ir5VarArr, wpd wpdVar, long j) {
        we0 we0Var;
        if (ir5VarArr.length == 0) {
            return null;
        }
        wpd[] wpdVarArr = {wpdVar};
        Runnable[] runnableArr = new Runnable[ir5VarArr.length];
        this.e.add(runnableArr);
        int i = 0;
        while (i < ir5VarArr.length) {
            ir5 ir5Var = ir5VarArr[i];
            if (ir5Var.a == 0 || ir5Var.b == 0) {
                we0Var = this;
            } else {
                mp3 mp3Var = Utilities.e;
                we0Var = this;
                re0 re0Var = new re0(we0Var, ir5Var, runnableArr, i, wpdVarArr);
                runnableArr[i] = re0Var;
                mp3Var.d(re0Var, j);
            }
            i++;
            this = we0Var;
        }
        return new se0(this, wpdVarArr, runnableArr, ir5VarArr);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.f.setColorFilter(colorFilter);
    }
}
