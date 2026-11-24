// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class u43 extends FrameLayout implements z33 {
    public float E;
    public float F;
    public boolean G;
    public final g43 H;
    public final float[] I;
    public boolean J;
    public boolean K;
    public int L;
    public s43 M;
    public t43 N;
    public final RectF O;
    public final RectF P;
    public final CropAreaView a;
    public final ImageView b;
    public final Matrix c;
    public ncc d;
    public n43 e;
    public final RectF f;
    public final RectF h;
    public float n;
    public final boolean r;
    public final sz4 s;
    public final Matrix w;
    public Bitmap x;
    public boolean y;

    public u43(Context context) {
        super(context);
        this.I = new float[9];
        this.O = new RectF();
        this.P = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z = context instanceof BubbleActivity;
        this.r = z;
        this.f = new RectF();
        this.h = new RectF();
        this.c = new Matrix();
        sz4 sz4Var = new sz4();
        sz4Var.a = new float[8];
        this.s = sz4Var;
        this.w = new Matrix();
        this.G = false;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        g43 g43Var = new g43(context);
        this.H = g43Var;
        g43Var.b = this;
        CropAreaView cropAreaView = new CropAreaView(context);
        cropAreaView.d = new RectF();
        cropAreaView.e = new RectF();
        cropAreaView.f = new RectF();
        cropAreaView.h = new RectF();
        cropAreaView.n = new RectF();
        cropAreaView.r = new RectF();
        cropAreaView.s = new RectF();
        cropAreaView.w = new RectF();
        cropAreaView.y = new RectF();
        cropAreaView.E = new RectF();
        cropAreaView.L = -1.0f;
        cropAreaView.M = 1.0f;
        cropAreaView.N = -1.0f;
        cropAreaView.V = new AccelerateDecelerateInterpolator();
        cropAreaView.g0 = true;
        cropAreaView.m0 = new RectF();
        cropAreaView.o0 = 0.0f;
        cropAreaView.p0 = 1.0f;
        cropAreaView.q0 = 0.0f;
        cropAreaView.r0 = 0.0f;
        cropAreaView.b0 = z;
        cropAreaView.K = true;
        cropAreaView.J = true;
        cropAreaView.W = gm.L(16.0f);
        cropAreaView.a0 = gm.L(32.0f);
        cropAreaView.u0 = 1;
        Paint paint = new Paint();
        cropAreaView.P = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        cropAreaView.Q = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(gm.L(2.0f));
        Paint paint3 = new Paint();
        cropAreaView.R = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(gm.L(1.0f));
        Paint paint4 = new Paint();
        cropAreaView.S = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        Paint paint5 = new Paint();
        cropAreaView.T = paint5;
        paint5.setStyle(style);
        paint5.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        cropAreaView.i0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        cropAreaView.U = paint7;
        paint7.setColor(-1);
        cropAreaView.setWillNotDraw(false);
        this.a = cropAreaView;
        cropAreaView.setListener(this);
        addView(cropAreaView);
    }

    public static void b(String str, Canvas canvas, Bitmap bitmap, Matrix matrix, int i, int i2, float f, float f2, float f3, float f4, ArrayList arrayList) {
        int i3 = i;
        int i4 = i2;
        float f5 = f3;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix2 = new Matrix();
            char c = 2;
            matrix2.postTranslate((-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2);
            float max = 1.0f / (Math.max(decodeFile.getWidth(), decodeFile.getHeight()) / Math.max(i, i2));
            matrix2.postScale(max, max);
            matrix2.postRotate(f5);
            matrix2.postConcat(matrix);
            matrix2.postScale(f4, f4);
            matrix2.postTranslate(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            canvas.drawBitmap(decodeFile, matrix2, new Paint(2));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    pcc pccVar = (pcc) arrayList.get(i5);
                    float width = ((pccVar.f / 2.0f) + pccVar.c) * decodeFile.getWidth();
                    float height = ((pccVar.g / 2.0f) + pccVar.d) * decodeFile.getHeight();
                    char c2 = c;
                    float width2 = pccVar.y * decodeFile.getWidth();
                    float height2 = pccVar.z * decodeFile.getHeight();
                    float[] fArr = new float[4];
                    fArr[0] = width;
                    fArr[1] = height;
                    fArr[c2] = width2;
                    fArr[3] = height2;
                    matrix2.mapPoints(fArr);
                    int width3 = decodeFile.getWidth();
                    int height3 = decodeFile.getHeight();
                    if (f5 == 90.0f || f5 == 270.0f) {
                        width3 = decodeFile.getHeight();
                        height3 = decodeFile.getWidth();
                    }
                    byte b = pccVar.a;
                    if (b == 1 || b == 11) {
                        pccVar.f = ((pccVar.f * i3) / bitmap.getWidth()) * f4 * f;
                        pccVar.g = ((pccVar.g * i4) / bitmap.getHeight()) * f4 * f;
                    } else {
                        float f6 = i3;
                        float f7 = width3;
                        pccVar.q = (int) ((pccVar.q / f6) * f7);
                        float f8 = i4;
                        float f9 = height3;
                        pccVar.r = (int) ((pccVar.r / f8) * f9);
                        pccVar.f = ((pccVar.f * f6) / f7) * f4 * f;
                        pccVar.g = ((pccVar.g * f8) / f9) * f4 * f;
                    }
                    pccVar.c = (fArr[0] / bitmap.getWidth()) - (pccVar.f / 2.0f);
                    pccVar.d = (fArr[1] / bitmap.getHeight()) - (pccVar.g / 2.0f);
                    pccVar.y = fArr[c2] / bitmap.getWidth();
                    pccVar.z = fArr[3] / bitmap.getHeight();
                    pccVar.e = (float) (pccVar.e - ((f2 + f3) * 0.017453292519943295d));
                    i5++;
                    i3 = i;
                    i4 = i2;
                    f5 = f3;
                    c = c2;
                }
            }
            decodeFile.recycle();
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    public static float e(float f, float f2, RectF rectF) {
        float width = rectF.width() * f2;
        float height = rectF.height() * f2;
        float width2 = (rectF.width() - width) / 2.0f;
        float height2 = (rectF.height() - height) / 2.0f;
        float f3 = rectF.left + width2;
        float f4 = rectF.top + height2;
        rectF.set(f3, f4, width + f3, height + f4);
        return f * f2;
    }

    public static void f(RectF rectF, RectF rectF2, PointF pointF, float f) {
        float f2 = rectF2.left;
        float f3 = rectF2.top;
        float f4 = rectF2.right;
        float f5 = rectF2.bottom;
        float f6 = rectF.left;
        if (f6 > f2) {
            f4 += f6 - f2;
            f2 = f6;
        }
        float f7 = rectF.top;
        if (f7 > f3) {
            f5 += f7 - f3;
            f3 = f7;
        }
        float f8 = rectF.right;
        if (f8 < f4) {
            f2 += f8 - f4;
        }
        float f9 = rectF.bottom;
        if (f9 < f5) {
            f3 += f9 - f5;
        }
        float centerX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f2);
        float centerY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f3);
        double d = f;
        double d2 = 1.5707963267948966d - d;
        double d3 = centerX;
        float sin = (float) (Math.sin(d2) * d3);
        float cos = (float) (Math.cos(d2) * d3);
        double d4 = d + 1.5707963267948966d;
        double d5 = centerY;
        pointF.set(pointF.x + sin + ((float) (Math.cos(d4) * d5)), pointF.y + cos + ((float) (Math.sin(d4) * d5)));
    }

    public static String g(String str) {
        File file = new File(bc4.z(4), gda.p() + "_temp.jpg");
        try {
            gm.E(new File(str), file);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        return file.getAbsolutePath();
    }

    public static float n(RectF rectF, RectF rectF2) {
        float width = rectF2.width();
        if (((float) Math.floor((rectF.height() * width) / rectF.width())) <= rectF2.height()) {
            return width;
        }
        return (float) Math.floor((rectF.width() * rectF2.height()) / rectF.height());
    }

    private void setLockedAspectRatio(float f) {
        CropAreaView cropAreaView = this.a;
        cropAreaView.setLockedAspectRatio(f);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f);
        c(rectF);
        t43 t43Var = this.N;
        if (t43Var != null) {
            t43Var.R0(false);
            this.N.H0(true);
        }
    }

    public final void a(ao6 ao6Var) {
        int i;
        int i2;
        float f;
        CropAreaView cropAreaView = this.a;
        cropAreaView.d(this.O);
        int ceil = (int) Math.ceil(n(r1, this.P));
        int ceil2 = (int) Math.ceil(r2 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.M.k;
        float[] fArr = this.I;
        matrix.getValues(fArr);
        s43 s43Var = this.M;
        float f2 = s43Var.f * cropWidth;
        ao6Var.k = (int) s43Var.h;
        if (e21.a) {
            b10.p(ao6Var.k, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i = ao6Var.k;
            if (i >= 0) {
                break;
            } else {
                ao6Var.k = i + 360;
            }
        }
        if (i == 90 || i == 270) {
            s43 s43Var2 = this.M;
            i2 = (int) s43Var2.b;
            f = s43Var2.a;
        } else {
            s43 s43Var3 = this.M;
            i2 = (int) s43Var3.a;
            f = s43Var3.b;
        }
        int i3 = (int) f;
        float f3 = i2;
        ao6Var.e = (float) (ceil / Math.ceil(f3 * f2));
        float f4 = i3;
        float ceil3 = (float) (ceil2 / Math.ceil(f2 * f4));
        ao6Var.f = ceil3;
        float f5 = ao6Var.e;
        if (f5 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f5, ceil3);
            ao6Var.e /= max;
            ao6Var.f /= max;
        }
        ao6Var.c = Math.min(f3 / cropAreaView.getCropWidth(), f4 / cropAreaView.getCropHeight()) * this.M.e;
        float f6 = fArr[2] / f3;
        s43 s43Var4 = this.M;
        float f7 = s43Var4.e;
        ao6Var.a = f6 / f7;
        ao6Var.b = (fArr[5] / f4) / f7;
        ao6Var.d = s43Var4.i;
        ao6Var.m = f7;
        ao6Var.l = s43Var4.j;
        ao6Var.o = cropWidth;
        ao6Var.r = s43Var4.k;
        ao6Var.s = ceil;
        ao6Var.t = ceil2;
        ao6Var.u = this.y;
        ao6Var.v = cropAreaView.getLockAspectRatio();
        ao6Var.C = true;
    }

    public final void c(RectF rectF) {
        boolean z;
        if (this.M == null) {
            return;
        }
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f = this.M.e;
        if (f * max > 30.0f) {
            max = 30.0f / f;
            z = true;
        } else {
            z = false;
        }
        float f2 = max;
        int i = !this.r ? gm.m : 0;
        float centerX = rectF.centerX();
        ImageView imageView = this.b;
        float b = this.M.b() * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float a = this.M.a() * ((rectF.centerY() - ((((imageView.getHeight() - this.E) + i) + this.F) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new o43(this, f2, fArr, b, a, (byte) 0));
        ofFloat.addListener(new y7((byte) 26, (Object) this, z));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.V;
        AnimatorSet animatorSet = cropAreaView.l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.l0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.l0 = animatorSet2;
        animatorSet2.setDuration(300L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cropAreaView, "cropLeft", rectF.left);
        ofFloat2.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cropAreaView, "cropTop", rectF.top);
        ofFloat3.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cropAreaView, "cropRight", rectF.right);
        ofFloat4.setInterpolator(accelerateDecelerateInterpolator);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(cropAreaView, "cropBottom", rectF.bottom);
        ofFloat5.setInterpolator(accelerateDecelerateInterpolator);
        ofFloat.setInterpolator(accelerateDecelerateInterpolator);
        animatorSet2.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat);
        animatorSet2.addListener(new u5(cropAreaView, rectF, (byte) 16));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void d(boolean z, boolean z2, boolean z3, boolean z4) {
        float f;
        if (this.M != null) {
            CropAreaView cropAreaView = this.a;
            float cropWidth = cropAreaView.getCropWidth();
            float cropHeight = cropAreaView.getCropHeight();
            float b = this.M.b();
            float a = this.M.a();
            float f2 = this.M.i;
            float radians = (float) Math.toRadians(f2);
            RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
            Matrix matrix = new Matrix();
            matrix.postRotate(f2, cropWidth / 2.0f, cropHeight / 2.0f);
            matrix.mapRect(rectF);
            RectF rectF2 = new RectF(0.0f, 0.0f, b, a);
            float f3 = (cropWidth - b) / 2.0f;
            s43 s43Var = this.M;
            float f4 = s43Var.e;
            sz4 sz4Var = this.s;
            float[] fArr = (float[]) sz4Var.a;
            float[] fArr2 = (float[]) sz4Var.a;
            float f5 = rectF2.left;
            fArr[0] = f5;
            float f6 = rectF2.top;
            fArr[1] = f6;
            float f7 = rectF2.right;
            fArr[2] = f7;
            fArr[3] = f6;
            fArr[4] = f7;
            float f8 = rectF2.bottom;
            fArr[5] = f8;
            fArr[6] = f5;
            fArr[7] = f8;
            Matrix matrix2 = new Matrix();
            matrix2.set(s43Var.k);
            matrix2.preTranslate(f3 / f4, ((cropHeight - a) / 2.0f) / f4);
            Matrix matrix3 = this.w;
            matrix3.reset();
            matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
            matrix3.setConcat(matrix3, matrix2);
            matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
            matrix3.mapPoints(fArr2);
            matrix3.reset();
            matrix3.preRotate(-f2, b / 2.0f, a / 2.0f);
            matrix3.mapPoints(fArr2);
            rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
            s43 s43Var2 = this.M;
            PointF pointF = new PointF(s43Var2.c, s43Var2.d);
            if (!rectF2.contains(rectF)) {
                f = (!z || (rectF.width() <= rectF2.width() && rectF.height() <= rectF2.height())) ? f4 : e(f4, rectF.width() / n(rectF, rectF2), rectF2);
                f(rectF2, rectF, pointF, radians);
            } else if (!z2 || this.n <= 0.0f) {
                f = f4;
            } else {
                float width = rectF.width() / n(rectF, rectF2);
                if (this.M.e * width < this.n) {
                    width = 1.0f;
                }
                f = e(f4, width, rectF2);
                f(rectF2, rectF, pointF, radians);
            }
            float f9 = pointF.x;
            s43 s43Var3 = this.M;
            float f10 = f9 - s43Var3.c;
            float f11 = pointF.y - s43Var3.d;
            if (!z3) {
                s43Var3.g(f10, f11);
                this.M.f(f / f4, 0.0f, 0.0f);
                r(false);
                return;
            }
            float f12 = f / f4;
            if (Math.abs(f12 - 1.0f) >= 1.0E-5f || Math.abs(f10) >= 1.0E-5f || Math.abs(f11) >= 1.0E-5f) {
                this.G = true;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new o43(this, f10, new float[]{1.0f, 0.0f, 0.0f}, f11, f12, (byte) 1));
                ofFloat.addListener(new r43(this, z4, z, z2, z3));
                ofFloat.setInterpolator(cropAreaView.getInterpolator());
                ofFloat.setDuration(z4 ? 100L : 200L);
                ofFloat.start();
            }
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.a;
        RectF rectF = this.O;
        cropAreaView.d(rectF);
        return rectF;
    }

    public float getCropHeight() {
        return this.a.getCropHeight();
    }

    public float getCropLeft() {
        return this.a.getCropLeft();
    }

    public float getCropTop() {
        return this.a.getCropTop();
    }

    public float getCropWidth() {
        return this.a.getCropWidth();
    }

    public int getCurrentHeight() {
        ncc nccVar = this.d;
        if (nccVar != null) {
            return nccVar.getVideoHeight();
        }
        Bitmap bitmap = this.x;
        if (bitmap == null) {
            return 1;
        }
        int i = this.L;
        return (i == 90 || i == 270) ? bitmap.getWidth() : bitmap.getHeight();
    }

    public int getCurrentWidth() {
        ncc nccVar = this.d;
        if (nccVar != null) {
            return nccVar.getVideoWidth();
        }
        Bitmap bitmap = this.x;
        if (bitmap == null) {
            return 1;
        }
        int i = this.L;
        return (i == 90 || i == 270) ? bitmap.getHeight() : bitmap.getWidth();
    }

    public float getStateFullOrientation() {
        s43 s43Var = this.M;
        if (s43Var == null) {
            return 0.0f;
        }
        return s43Var.g + s43Var.h;
    }

    public boolean getStateMirror() {
        s43 s43Var = this.M;
        return s43Var != null && s43Var.j;
    }

    public float getStateOrientation() {
        s43 s43Var = this.M;
        if (s43Var == null) {
            return 0.0f;
        }
        return s43Var.h;
    }

    public final void h(Integer[][] numArr, int i) {
        float f;
        float f2;
        this.J = false;
        if (i == 0) {
            s43 s43Var = this.M;
            if (s43Var.g % 180.0f != 0.0f) {
                f = s43Var.b;
                f2 = s43Var.a;
            } else {
                f = s43Var.a;
                f2 = s43Var.b;
            }
            setLockedAspectRatio(f / f2);
            return;
        }
        if (i == 1) {
            setLockedAspectRatio(1.0f);
            return;
        }
        Integer[] numArr2 = numArr[i - 2];
        if (this.a.getAspectRatio() > 1.0f) {
            setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
        } else {
            setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
        }
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        s43 s43Var = this.M;
        if (s43Var == null) {
            return;
        }
        final float f = s43Var.f;
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.l0 = null;
        }
        s43 s43Var2 = this.M;
        if ((s43Var2.h + s43Var2.g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f2 = currentWidth / currentHeight;
        if (!this.y) {
            f2 = 1.0f;
        }
        cropAreaView.a(this.h, f2);
        cropAreaView.setLockedAspectRatio(this.y ? 0.0f : 1.0f);
        this.n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.y);
        s43 s43Var3 = this.M;
        final float f3 = s43Var3.c;
        final float f4 = s43Var3.d;
        final float f5 = s43Var3.e;
        final float f6 = s43Var3.i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p43
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                u43 u43Var = u43.this;
                if (u43Var.M == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = u43Var.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                gm.X1(rectF4, rectF3, floatValue, rectF5);
                u43Var.a.setActualRect(rectF5);
                s43 s43Var4 = u43Var.M;
                float f7 = 1.0f - floatValue;
                float f8 = s43Var4.c - (f3 * f7);
                float f9 = s43Var4.d - (f4 * f7);
                float f10 = s43Var4.i - (f6 * f7);
                float R1 = gm.R1(f5, f, floatValue);
                s43 s43Var5 = u43Var.M;
                float f11 = R1 / s43Var5.e;
                s43Var5.g(-f8, -f9);
                u43Var.M.f(f11, 0.0f, 0.0f);
                u43Var.M.e(-f10);
                u43Var.d(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        s43 s43Var = this.M;
        boolean z = false;
        if (s43Var == null) {
            return false;
        }
        s43Var.j = !s43Var.j;
        r(false);
        t43 t43Var = this.N;
        if (t43Var != null) {
            s43 s43Var2 = this.M;
            float f = s43Var2.h;
            float f2 = s43Var2.g;
            float f3 = ((f + f2) - f2) % 360.0f;
            if (!s43Var2.c() && f3 == 0.0f && this.a.getLockAspectRatio() == 0.0f && !this.M.j) {
                z = true;
            }
            t43Var.R0(z);
        }
        return this.M.j;
    }

    public final void k() {
        this.a.g(2, false);
        if (this.n < 1.0E-5f) {
            this.n = this.M.e;
        }
    }

    public final void l(boolean z) {
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.l0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        s43 s43Var = this.M;
        cropAreaView.e(currentWidth, currentHeight, (s43Var == null || s43Var.g % 180.0f == 0.0f) ? false : true, this.y);
        cropAreaView.setLockedAspectRatio(this.y ? 0.0f : 1.0f);
        s43 s43Var2 = this.M;
        if (s43Var2 != null) {
            s43Var2.d(0.0f);
            this.M.j = false;
        }
        cropAreaView.d(this.h);
        r(z);
        this.n = 0.0f;
        t43 t43Var = this.N;
        if (t43Var != null) {
            t43Var.R0(true);
            this.N.H0(false);
        }
    }

    public final boolean m(float f) {
        if (this.M != null) {
            CropAreaView cropAreaView = this.a;
            AnimatorSet animatorSet = cropAreaView.l0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.l0 = null;
            }
            this.n = 0.0f;
            s43 s43Var = this.M;
            float f2 = s43Var.h;
            float f3 = s43Var.g;
            float f4 = (((f2 + f3) - f3) + f) % 360.0f;
            if (!this.y || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.e(getCurrentWidth(), getCurrentHeight(), (this.M.g + f4) % 180.0f != 0.0f, this.y);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            this.M.d(f4);
            r(false);
            d(true, false, false, false);
            t43 t43Var = this.N;
            if (t43Var != null) {
                t43Var.R0(f4 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.M.j);
            }
            if (((int) this.M.h) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        byte b = 4;
        if (this.M == null || this.J) {
            return;
        }
        this.J = true;
        byte b2 = 8;
        String[] strArr = new String[8];
        Integer[][] numArr = {new Integer[]{3, 2}, new Integer[]{5, 3}, new Integer[]{4, 3}, new Integer[]{5, 4}, new Integer[]{7, 5}, new Integer[]{16, 9}};
        strArr[0] = jb6.M0(2131751634, null);
        strArr[1] = jb6.M0(2131751632, null);
        int i = 2;
        for (int i2 = 0; i2 < 6; i2++) {
            Integer[] numArr2 = numArr[i2];
            if (this.a.getAspectRatio() > 1.0f) {
                strArr[i] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.e(strArr, new ff(this, numArr, b));
        he heVar = alertDialog$Builder.a;
        heVar.setCanceledOnTouchOutside(true);
        heVar.setOnCancelListener(new ct0(this, b2));
        heVar.show();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.G) {
            CropAreaView cropAreaView = this.a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        d(true, false, true, false);
                    }
                } else if (!this.G) {
                    cropAreaView.g(3, true);
                    this.n = 0.0f;
                    t43 t43Var = this.N;
                    if (t43Var != null) {
                        t43Var.R0(false);
                    }
                }
                try {
                    this.H.a(motionEvent);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void p(int i, n43 n43Var, ao6 ao6Var) {
        this.y = true;
        this.d = null;
        this.e = n43Var;
        this.L = i;
        this.x = null;
        CropAreaView cropAreaView = this.a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.M = new s43(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new q43(this, ao6Var, currentHeight, currentWidth, (byte) 0));
    }

    public final void q() {
        int i;
        float f;
        if (this.e == null || this.M == null) {
            return;
        }
        CropAreaView cropAreaView = this.a;
        cropAreaView.d(this.O);
        int ceil = (int) Math.ceil(n(r2, this.P));
        int ceil2 = (int) Math.ceil(r3 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.M.k;
        float[] fArr = this.I;
        matrix.getValues(fArr);
        s43 s43Var = this.M;
        float f2 = s43Var.f * cropWidth;
        int i2 = (int) s43Var.h;
        while (i2 < 0) {
            i2 += 360;
        }
        if (i2 == 90 || i2 == 270) {
            s43 s43Var2 = this.M;
            i = (int) s43Var2.b;
            f = s43Var2.a;
        } else {
            s43 s43Var3 = this.M;
            i = (int) s43Var3.a;
            f = s43Var3.b;
        }
        int i3 = (int) f;
        double d = ceil;
        float f3 = i;
        float ceil3 = (float) (d / Math.ceil(f3 * f2));
        float f4 = i3;
        float ceil4 = (float) (ceil2 / Math.ceil(f2 * f4));
        if (ceil3 > 1.0f || ceil4 > 1.0f) {
            float max = Math.max(ceil3, ceil4);
            ceil3 /= max;
            ceil4 /= max;
        }
        float f5 = ceil4;
        float f6 = ceil3;
        RectF rectF = cropAreaView.m0;
        cropAreaView.a(rectF, f3 / f4);
        float width = this.y ? rectF.width() / f3 : Math.max(rectF.width() / f3, rectF.height() / f4);
        s43 s43Var4 = this.M;
        float f7 = s43Var4.e;
        float f8 = f7 / width;
        float f9 = f7 / s43Var4.f;
        float f10 = (fArr[2] / f3) / f7;
        float f11 = (fArr[5] / f4) / f7;
        float f12 = s43Var4.i;
        RectF targetRectToFill = cropAreaView.getTargetRectToFill();
        float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
        float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
        n43 n43Var = this.e;
        s43 s43Var5 = this.M;
        boolean z = s43Var5.j || s43Var5.c() || this.M.g >= 1.0E-5f;
        s43 s43Var6 = this.M;
        n43Var.b(z, f10, f11, f12, (int) s43Var6.h, f8, f9, s43Var6.f / width, f6, f5, cropCenterX, cropCenterY, s43Var6.j);
    }

    public final void r(boolean z) {
        if (this.M == null) {
            return;
        }
        Matrix matrix = this.c;
        matrix.reset();
        s43 s43Var = this.M;
        float f = s43Var.g;
        if (f == 90.0f || f == 270.0f) {
            matrix.postTranslate((-s43Var.b) / 2.0f, (-s43Var.a) / 2.0f);
        } else {
            matrix.postTranslate((-s43Var.a) / 2.0f, (-s43Var.b) / 2.0f);
        }
        matrix.postRotate((int) this.M.h);
        matrix.postConcat(this.M.k);
        CropAreaView cropAreaView = this.a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.y || this.K || z) {
            q();
            this.N.c0();
        }
        invalidate();
    }

    public void setAspectRatio(float f) {
        this.a.setActualRect(f);
    }

    public void setBottomPadding(float f) {
        this.E = f;
        this.a.setBottomPadding(f);
    }

    public void setFreeform(boolean z) {
        this.a.setFreeform(z);
        this.y = z;
    }

    public void setListener(t43 t43Var) {
        this.N = t43Var;
    }

    @Override // android.view.View
    public void setRotation(float f) {
        s43 s43Var = this.M;
        s43Var.e(f - s43Var.i);
        d(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.a.setSubtitle(str);
    }

    public void setTopPadding(float f) {
        this.F = f;
        this.a.setTopPadding(f);
    }
}
