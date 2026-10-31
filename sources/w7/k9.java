package w7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.NinePatchDrawable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class k9 {
    public static NinePatchDrawable a(Bitmap bitmap, Rect rect, int i10, int i11) {
        if (bitmap == null) {
            throw new IllegalArgumentException("bitmap == null");
        }
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("bitmap is recycled");
        }
        if (i10 >= 0 && i10 < bitmap.getWidth() && i11 >= 0 && i11 < bitmap.getHeight()) {
            return new NinePatchDrawable(org.telegram.messenger.w0.b.getResources(), bitmap, c(i10, i10 + 1, i11, i11 + 1, rect.left, rect.top, rect.right, rect.bottom, bitmap.getPixel(i10, i11)).array(), rect, null);
        }
        StringBuilder m10 = i0.a.m("center pixel is outside bitmap: (", i10, ", ", i11, ") for ");
        m10.append(bitmap.getWidth());
        m10.append("x");
        m10.append(bitmap.getHeight());
        throw new IllegalArgumentException(m10.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NinePatchDrawable b(Bitmap[] bitmapArr, int i10, float[] fArr, float f7, int i11, float f10, int i12) {
        boolean z10;
        float f11;
        int i13;
        Bitmap bitmap;
        if (fArr == null || fArr.length != 8) {
            throw new IllegalArgumentException("radii must have 8 values: TLx,TLy, TRx,TRy, BRx,BRy, BLx,BLy");
        }
        float max = Math.max(0.0f, fArr[0]);
        float max2 = Math.max(0.0f, fArr[1]);
        float max3 = Math.max(0.0f, fArr[2]);
        float max4 = Math.max(0.0f, fArr[3]);
        float max5 = Math.max(0.0f, fArr[4]);
        float max6 = Math.max(0.0f, fArr[5]);
        float max7 = Math.max(0.0f, fArr[6]);
        float max8 = Math.max(0.0f, fArr[7]);
        int ceil = (int) Math.ceil(f7 * 2.0f);
        int ceil2 = ceil + ((int) Math.ceil(Math.max(0.0f, -0.0f)));
        int ceil3 = ceil + ((int) Math.ceil(Math.max(0.0f, 0.0f)));
        int ceil4 = ceil + ((int) Math.ceil(Math.max(0.0f, -f10)));
        int ceil5 = ceil + ((int) Math.ceil(Math.max(0.0f, f10)));
        float max9 = Math.max(max + max3, max7 + max5);
        float max10 = Math.max(max2 + max8, max4 + max6);
        int ceil6 = ((int) Math.ceil(max9 + 2.0f)) + ceil2;
        int i14 = ceil6 + ceil3;
        int ceil7 = ((int) Math.ceil(max10 + 2.0f)) + ceil4;
        int i15 = ceil7 + ceil5;
        boolean z11 = bitmapArr != null && bitmapArr.length == 1;
        if (!z11 || (bitmap = bitmapArr[0]) == null || bitmap.isRecycled() || !bitmap.isMutable()) {
            z10 = z11;
        } else {
            z10 = z11;
            if (bitmap.getWidth() == i14 && bitmap.getHeight() == i15) {
                f11 = max5;
                if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
                    bitmap.eraseColor(0);
                    i13 = i15;
                    if (bitmap == null) {
                        bitmap = Bitmap.createBitmap(i14, i13, Bitmap.Config.ARGB_8888);
                    }
                    Bitmap bitmap2 = bitmap;
                    if (z10) {
                        bitmapArr[0] = bitmap2;
                    }
                    Canvas canvas = new Canvas(bitmap2);
                    int i16 = i13;
                    Path path = new Path();
                    path.addRoundRect(new RectF(ceil2, ceil4, ceil6, ceil7), new float[]{max, max2, max3, max4, f11, max6, max7, max8}, Path.Direction.CW);
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(i10);
                    if (f7 > 0.0f) {
                        paint.setShadowLayer(f7, 0.0f, f10, i11);
                    }
                    canvas.drawPath(path, paint);
                    if (f7 > 0.0f) {
                        paint.clearShadowLayer();
                        canvas.drawPath(path, paint);
                    }
                    float max11 = Math.max(max, max7);
                    float max12 = Math.max(max3, f11);
                    float max13 = Math.max(max2, max4);
                    float max14 = Math.max(max8, max6);
                    int b10 = u.b(ceil2 + ((int) Math.ceil(max11)), 1, i14 - 2);
                    int b11 = u.b((i14 - ceil3) - ((int) Math.ceil(max12)), b10 + 1, i14 - 1);
                    int b12 = u.b(((int) Math.ceil(max13)) + ceil4, 1, i16 - 2);
                    return new NinePatchDrawable(org.telegram.messenger.w0.b.getResources(), bitmap2, c(b10, b11, b12, u.b((i16 - ceil5) - ((int) Math.ceil(max14)), b12 + 1, i16 - 1), ceil2, ceil4, ceil3, ceil5, i12).array(), new Rect(ceil2, ceil4, ceil3, ceil5), null);
                }
                i13 = i15;
                bitmap = null;
                if (bitmap == null) {
                }
                Bitmap bitmap22 = bitmap;
                if (z10) {
                }
                Canvas canvas2 = new Canvas(bitmap22);
                int i162 = i13;
                Path path2 = new Path();
                path2.addRoundRect(new RectF(ceil2, ceil4, ceil6, ceil7), new float[]{max, max2, max3, max4, f11, max6, max7, max8}, Path.Direction.CW);
                Paint paint2 = new Paint(1);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(i10);
                if (f7 > 0.0f) {
                }
                canvas2.drawPath(path2, paint2);
                if (f7 > 0.0f) {
                }
                float max112 = Math.max(max, max7);
                float max122 = Math.max(max3, f11);
                float max132 = Math.max(max2, max4);
                float max142 = Math.max(max8, max6);
                int b102 = u.b(ceil2 + ((int) Math.ceil(max112)), 1, i14 - 2);
                int b112 = u.b((i14 - ceil3) - ((int) Math.ceil(max122)), b102 + 1, i14 - 1);
                int b122 = u.b(((int) Math.ceil(max132)) + ceil4, 1, i162 - 2);
                return new NinePatchDrawable(org.telegram.messenger.w0.b.getResources(), bitmap22, c(b102, b112, b122, u.b((i162 - ceil5) - ((int) Math.ceil(max142)), b122 + 1, i162 - 1), ceil2, ceil4, ceil3, ceil5, i12).array(), new Rect(ceil2, ceil4, ceil3, ceil5), null);
            }
        }
        f11 = max5;
        i13 = i15;
        bitmap = null;
        if (bitmap == null) {
        }
        Bitmap bitmap222 = bitmap;
        if (z10) {
        }
        Canvas canvas22 = new Canvas(bitmap222);
        int i1622 = i13;
        Path path22 = new Path();
        path22.addRoundRect(new RectF(ceil2, ceil4, ceil6, ceil7), new float[]{max, max2, max3, max4, f11, max6, max7, max8}, Path.Direction.CW);
        Paint paint22 = new Paint(1);
        paint22.setStyle(Paint.Style.FILL);
        paint22.setColor(i10);
        if (f7 > 0.0f) {
        }
        canvas22.drawPath(path22, paint22);
        if (f7 > 0.0f) {
        }
        float max1122 = Math.max(max, max7);
        float max1222 = Math.max(max3, f11);
        float max1322 = Math.max(max2, max4);
        float max1422 = Math.max(max8, max6);
        int b1022 = u.b(ceil2 + ((int) Math.ceil(max1122)), 1, i14 - 2);
        int b1122 = u.b((i14 - ceil3) - ((int) Math.ceil(max1222)), b1022 + 1, i14 - 1);
        int b1222 = u.b(((int) Math.ceil(max1322)) + ceil4, 1, i1622 - 2);
        return new NinePatchDrawable(org.telegram.messenger.w0.b.getResources(), bitmap222, c(b1022, b1122, b1222, u.b((i1622 - ceil5) - ((int) Math.ceil(max1422)), b1222 + 1, i1622 - 1), ceil2, ceil4, ceil3, ceil5, i12).array(), new Rect(ceil2, ceil4, ceil3, ceil5), null);
    }

    public static ByteBuffer c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(i14);
        order.putInt(i16);
        order.putInt(i15);
        order.putInt(i17);
        order.putInt(0);
        order.putInt(i10);
        order.putInt(i11);
        order.putInt(i12);
        order.putInt(i13);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(i18);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        order.putInt(1);
        return order;
    }
}
