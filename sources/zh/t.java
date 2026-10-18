package zh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public abstract class t {
    public static Bitmap a;
    public static BitmapShader b;
    public static final Paint c = new Paint(2);
    public static final Paint d = new Paint(3);
    public static final RectF e = new RectF();
    public static final Matrix f = new Matrix();
    public static final HashMap g = new HashMap();
    public static final SweepGradient[] h = new SweepGradient[4];
    public static int i = -1;
    public static final Paint j = new Paint(2);
    public static final Rect k = new Rect();
    public static final RectF l = new RectF();
    public static final int[] m = new int[4];
    public static final int[] n = new int[4];
    public static final float[] o = new float[4];
    public static final float[] p = new float[4];

    public static boolean a(Canvas canvas, RectF rectF, float f7, int i10, float f10) {
        float f11;
        float f12;
        float f13;
        boolean z10;
        RectF rectF2;
        boolean z11;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        float f14 = 0.004f;
        boolean z12 = true;
        if (f10 <= 0.004f) {
            return true;
        }
        int i11 = i;
        SweepGradient[] sweepGradientArr = h;
        float[][] fArr = v0.a;
        int i12 = 4;
        HashMap hashMap = g;
        if (i11 != 1) {
            i = 1;
            hashMap.clear();
            int i13 = 0;
            while (i13 < i12) {
                float[] fArr2 = fArr[i13];
                float f15 = f14;
                int[] iArr = new int[73];
                float[] fArr3 = new float[73];
                int i14 = 0;
                for (int i15 = 73; i14 < i15; i15 = 73) {
                    boolean z13 = z12;
                    SweepGradient[] sweepGradientArr2 = sweepGradientArr;
                    double radians = Math.toRadians(i14 * 5);
                    int i16 = i12;
                    HashMap hashMap2 = hashMap;
                    float pow = (float) Math.pow(Math.abs(Math.cos(radians)), fArr2[6]);
                    float f16 = (((float) Math.sin(radians)) < 0.0f ? fArr2[11] : fArr2[12]) / 100.0f;
                    iArr[i14] = ((int) ((Math.max(0.0f, Math.min(1.0f, (((fArr2[5] / 100.0f) - f16) * pow) + f16)) * 255.0f) + 0.5f)) << 24;
                    fArr3[i14] = i14 / 72.0f;
                    i14++;
                    z12 = z13;
                    sweepGradientArr = sweepGradientArr2;
                    i12 = i16;
                    hashMap = hashMap2;
                }
                sweepGradientArr[i13] = new SweepGradient(0.0f, 0.0f, iArr, fArr3);
                i13++;
                f14 = f15;
                z12 = z12;
            }
        }
        float f17 = f14;
        boolean z14 = z12;
        SweepGradient[] sweepGradientArr3 = sweepGradientArr;
        int i17 = i12;
        HashMap hashMap3 = hashMap;
        float[] fArr4 = fArr[i10];
        float dpf2 = AndroidUtilities.dpf2(fArr4[8]);
        float f18 = rectF.left + dpf2;
        float f19 = rectF.top + dpf2;
        float f20 = rectF.right - dpf2;
        float f21 = rectF.bottom - dpf2;
        float f22 = f20 - f18;
        float f23 = f21 - f19;
        if (f22 >= 1.0f) {
            if (f23 < 1.0f) {
                return z14;
            }
            float min = Math.min(Math.max(0.0f, f7 - dpf2), Math.min(f22, f23) / 2.0f);
            float dpf22 = AndroidUtilities.dpf2(fArr4[i17]);
            float max = Math.max(AndroidUtilities.dpf2(fArr4[0]), AndroidUtilities.dpf2(fArr4[2]));
            int ceil = ((int) Math.ceil(dpf22)) + 2;
            int ceil2 = ((int) Math.ceil(max + min)) + 1;
            int round = Math.round(f22);
            int round2 = Math.round(f23);
            int i18 = (ceil2 * 2) + 2;
            boolean z15 = round >= i18 ? z14 ? 1 : 0 : false;
            boolean z16 = round2 >= i18 ? z14 ? 1 : 0 : false;
            if (z15) {
                round = i18;
            }
            if (z16) {
                round2 = i18;
            }
            boolean z17 = z16;
            long round3 = (((Math.round(4.0f * min) << 32) ^ (i10 << 56)) ^ (round << 16)) ^ round2;
            Bitmap bitmap = (Bitmap) hashMap3.get(Long.valueOf(round3));
            if (bitmap == null) {
                float[] fArr5 = fArr[i10];
                int i19 = ceil * 2;
                bitmap = Bitmap.createBitmap(round + i19, i19 + round2, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmap);
                f11 = f18;
                float f24 = ceil;
                RectF rectF3 = new RectF(f24, f24, round + ceil, round2 + ceil);
                float dpf23 = AndroidUtilities.dpf2(fArr5[i17]);
                if (dpf23 > 0.05f) {
                    Matrix matrix = new Matrix();
                    f12 = f19;
                    f13 = f20;
                    matrix.setScale(rectF3.width() / Math.max(1.0f, rectF3.height()), 1.0f);
                    matrix.postTranslate(rectF3.centerX(), rectF3.centerY());
                    SweepGradient sweepGradient = sweepGradientArr3[i10];
                    sweepGradient.setLocalMatrix(matrix);
                    Paint paint = new Paint(z14 ? 1 : 0);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(dpf23);
                    paint.setShader(sweepGradient);
                    RectF rectF4 = new RectF(rectF3);
                    float f25 = (-dpf23) / 2.0f;
                    rectF4.inset(f25, f25);
                    float f26 = (dpf23 / 2.0f) + min;
                    canvas2.drawRoundRect(rectF4, f26, f26, paint);
                } else {
                    f12 = f19;
                    f13 = f20;
                }
                Paint paint2 = new Paint(1);
                paint2.setColor(-1);
                Path path = new Path();
                Path path2 = new Path();
                RectF rectF5 = new RectF();
                int i20 = 0;
                boolean z18 = z17;
                while (i20 < 2) {
                    float dpf24 = i20 == 0 ? AndroidUtilities.dpf2(fArr5[0]) : -AndroidUtilities.dpf2(fArr5[2]);
                    int i21 = i20;
                    float f27 = (i20 == 0 ? fArr5[1] : fArr5[3]) / 100.0f;
                    if (f27 <= f17 || Math.abs(dpf24) < 0.1f) {
                        rectF2 = rectF3;
                        z11 = z18;
                    } else {
                        path.rewind();
                        z11 = z18;
                        Path.Direction direction = Path.Direction.CW;
                        path.addRoundRect(rectF3, min, min, direction);
                        rectF5.set(rectF3);
                        rectF2 = rectF3;
                        rectF5.offset(0.0f, dpf24);
                        path2.rewind();
                        path2.addRoundRect(rectF5, min, min, direction);
                        canvas2.save();
                        u.b(canvas2, path2);
                        paint2.setAlpha(Math.round(Math.min(1.0f, f27) * 255.0f));
                        canvas2.drawPath(path, paint2);
                        canvas2.restore();
                    }
                    i20 = i21 + 1;
                    z18 = z11;
                    rectF3 = rectF2;
                }
                z10 = z18;
                bitmap.prepareToDraw();
                hashMap3.put(Long.valueOf(round3), bitmap);
            } else {
                f11 = f18;
                f12 = f19;
                f13 = f20;
                z10 = z17;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i22 = z15 ? 3 : 1;
            int i23 = z10 ? 3 : 1;
            int[] iArr2 = m;
            iArr2[0] = 0;
            float f28 = ceil;
            float[] fArr6 = o;
            fArr6[0] = f11 - f28;
            if (z15) {
                iArr2[1] = ceil + ceil2;
                iArr2[2] = (width - ceil) - ceil2;
                float f29 = ceil2;
                fArr6[1] = f11 + f29;
                fArr6[2] = f13 - f29;
            }
            iArr2[i22] = width;
            fArr6[i22] = f13 + f28;
            int[] iArr3 = n;
            iArr3[0] = 0;
            float[] fArr7 = p;
            fArr7[0] = f12 - f28;
            if (z10) {
                iArr3[1] = ceil + ceil2;
                iArr3[2] = (height - ceil) - ceil2;
                float f30 = ceil2;
                fArr7[1] = f12 + f30;
                fArr7[2] = f21 - f30;
            }
            iArr3[i23] = height;
            fArr7[i23] = f21 + f28;
            int min2 = (int) (Math.min(1.0f, f10) * 255.0f);
            Paint paint3 = j;
            paint3.setAlpha(min2);
            for (int i24 = 0; i24 < i23; i24++) {
                int i25 = 0;
                while (i25 < i22) {
                    int i26 = iArr2[i25];
                    int i27 = iArr3[i24];
                    int i28 = i25 + 1;
                    int i29 = iArr2[i28];
                    int i30 = i24 + 1;
                    int i31 = iArr3[i30];
                    int[] iArr4 = iArr3;
                    Rect rect = k;
                    rect.set(i26, i27, i29, i31);
                    float f31 = fArr6[i25];
                    float f32 = fArr7[i24];
                    float f33 = fArr6[i28];
                    float f34 = fArr7[i30];
                    RectF rectF6 = l;
                    rectF6.set(f31, f32, f33, f34);
                    canvas.drawBitmap(bitmap, rect, rectF6, paint3);
                    iArr3 = iArr4;
                    i25 = i28;
                }
            }
        }
        return true;
    }

    public static void b(Canvas canvas, RectF rectF, float f7) {
        float f10 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.right;
        float min = Math.min(rectF.height(), AndroidUtilities.dp(40.0f)) + f11;
        RectF rectF2 = e;
        rectF2.set(f10, f11, f12, min);
        int max = (int) (Math.max(0.0f, Math.min(1.0f, f7)) * 255.0f * 0.3125f);
        Paint paint = c;
        paint.setAlpha(max);
        canvas.drawBitmap(d(), (Rect) null, rectF2, paint);
    }

    public static void c(Canvas canvas, RectF rectF, float f7, float f10) {
        Bitmap d10 = d();
        BitmapShader bitmapShader = b;
        Paint paint = d;
        if (bitmapShader == null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(d10, tileMode, tileMode);
            b = bitmapShader2;
            paint.setShader(bitmapShader2);
        }
        float width = rectF.width() / d10.getWidth();
        float min = Math.min(rectF.height(), AndroidUtilities.dp(40.0f)) / d10.getHeight();
        Matrix matrix = f;
        matrix.setScale(width, min);
        matrix.postTranslate(rectF.left, rectF.top);
        b.setLocalMatrix(matrix);
        paint.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, f10)) * 255.0f * 0.3125f));
        canvas.drawRoundRect(rectF, f7, f7, paint);
    }

    public static Bitmap d() {
        if (a == null) {
            int[] iArr = new int[64];
            for (int i10 = 0; i10 < 64; i10++) {
                iArr[i10] = (((int) (((1.0f - ((i10 + 0.5f) / 64.0f)) * 64.0f) + 0.5f)) << 24) | 16777215;
            }
            a = Bitmap.createBitmap(iArr, 1, 64, Bitmap.Config.ARGB_8888);
        }
        return a;
    }
}
