// default package

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.StateSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class sjb {
    public static final int a = bkb.c6;
    public static float[] b;

    public static float[] a(float... fArr) {
        return fArr.length == 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f} : fArr.length == 1 ? new float[]{gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0])} : fArr.length == 2 ? new float[]{gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[1]), gl.L(fArr[1]), gl.L(fArr[1]), gl.L(fArr[1])} : fArr.length == 3 ? new float[]{gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[1]), gl.L(fArr[1]), gl.L(fArr[2]), gl.L(fArr[2]), gl.L(fArr[2]), gl.L(fArr[2])} : fArr.length < 8 ? new float[]{gl.L(fArr[0]), gl.L(fArr[0]), gl.L(fArr[1]), gl.L(fArr[1]), gl.L(fArr[2]), gl.L(fArr[2]), gl.L(fArr[3]), gl.L(fArr[3])} : new float[]{gl.L(fArr[0]), gl.L(fArr[1]), gl.L(fArr[2]), gl.L(fArr[3]), gl.L(fArr[4]), gl.L(fArr[5]), gl.L(fArr[6]), gl.L(fArr[7])};
    }

    public static int b(int i) {
        float[] fArr = b;
        if (fArr == null) {
            fArr = new float[3];
            b = fArr;
        }
        Color.colorToHSV(i, fArr);
        float[] fArr2 = b;
        float f = fArr2[1];
        if (f > 0.01f) {
            fArr2[1] = Math.min(1.0f, Math.max(0.0f, f + (bkb.I.o() ? 0.25f : -0.25f)));
            float[] fArr3 = b;
            fArr3[2] = Math.min(1.0f, Math.max(0.0f, fArr3[2] + (bkb.I.o() ? 0.05f : -0.05f)));
        } else {
            fArr2[2] = Math.min(1.0f, Math.max(0.0f, fArr2[2] + (bkb.I.o() ? 0.1f : -0.1f)));
        }
        return Color.HSVToColor(kk7.K1, b);
    }

    public static ff0 c(wl9 wl9Var, int i) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i});
        wl9 wl9Var2 = new wl9((byte) 1);
        if (wl9.c == null) {
            Paint paint = new Paint(1);
            wl9.c = paint;
            paint.setColor(-1);
        }
        wl9Var2.b = wl9.c;
        return new ff0(colorStateList, wl9Var, wl9Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ff0 d(int i, int i2, float... fArr) {
        ColorDrawable colorDrawable;
        ShapeDrawable shapeDrawable;
        if (i != 0) {
            int i3 = 0;
            while (true) {
                if (i3 >= Math.min(8, fArr.length)) {
                    colorDrawable = new ColorDrawable(i);
                    break;
                }
                if (fArr[i3] > 0.0f) {
                    ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                    shapeDrawable2.getPaint().setColor(i);
                    colorDrawable = shapeDrawable2;
                    break;
                }
                i3++;
            }
        } else {
            colorDrawable = null;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= Math.min(8, fArr.length)) {
                shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.getPaint().setColor(-1);
                break;
            }
            if (fArr[i4] > 0.0f) {
                shapeDrawable = new ShapeDrawable(new RoundRectShape(a(fArr), null, null));
                shapeDrawable.getPaint().setColor(-1);
                break;
            }
            i4++;
        }
        return new ff0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i2}), colorDrawable, shapeDrawable);
    }

    public static ff0 e(int i, float... fArr) {
        return d(i, b(i), fArr);
    }

    public static ff0 f(int i, float... fArr) {
        return e(bkb.w0(null, i, false), fArr);
    }
}
