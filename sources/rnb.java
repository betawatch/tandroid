// default package

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.StateSet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class rnb {
    public static final int a = aob.d6;
    public static float[] b;

    public static float[] a(float... fArr) {
        return fArr.length == 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f} : fArr.length == 1 ? new float[]{hl.L(fArr[0]), hl.L(fArr[0]), hl.L(fArr[0]), hl.L(fArr[0]), hl.L(fArr[0]), hl.L(fArr[0]), hl.L(fArr[0]), hl.L(fArr[0])} : fArr.length == 2 ? new float[]{hl.L(fArr[0]), hl.L(fArr[0]), hl.L(fArr[0]), hl.L(fArr[0]), hl.L(fArr[1]), hl.L(fArr[1]), hl.L(fArr[1]), hl.L(fArr[1])} : fArr.length == 3 ? new float[]{hl.L(fArr[0]), hl.L(fArr[0]), hl.L(fArr[1]), hl.L(fArr[1]), hl.L(fArr[2]), hl.L(fArr[2]), hl.L(fArr[2]), hl.L(fArr[2])} : fArr.length < 8 ? new float[]{hl.L(fArr[0]), hl.L(fArr[0]), hl.L(fArr[1]), hl.L(fArr[1]), hl.L(fArr[2]), hl.L(fArr[2]), hl.L(fArr[3]), hl.L(fArr[3])} : new float[]{hl.L(fArr[0]), hl.L(fArr[1]), hl.L(fArr[2]), hl.L(fArr[3]), hl.L(fArr[4]), hl.L(fArr[5]), hl.L(fArr[6]), hl.L(fArr[7])};
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
            fArr2[1] = Math.min(1.0f, Math.max(0.0f, f + (aob.I.o() ? 0.25f : -0.25f)));
            float[] fArr3 = b;
            fArr3[2] = Math.min(1.0f, Math.max(0.0f, fArr3[2] + (aob.I.o() ? 0.05f : -0.05f)));
        } else {
            fArr2[2] = Math.min(1.0f, Math.max(0.0f, fArr2[2] + (aob.I.o() ? 0.1f : -0.1f)));
        }
        return Color.HSVToColor(jn7.K1, b);
    }

    public static hf0 c(lp9 lp9Var, int i) {
        ColorStateList colorStateList = new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i});
        lp9 lp9Var2 = new lp9((byte) 1);
        if (lp9.c == null) {
            Paint paint = new Paint(1);
            lp9.c = paint;
            paint.setColor(-1);
        }
        lp9Var2.b = lp9.c;
        return new hf0(colorStateList, lp9Var, lp9Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hf0 d(int i, int i2, float... fArr) {
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
        return new hf0(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{i2}), colorDrawable, shapeDrawable);
    }

    public static hf0 e(int i, float... fArr) {
        return d(i, b(i), fArr);
    }

    public static hf0 f(int i, float... fArr) {
        return e(aob.w0(null, i, false), fArr);
    }
}
