package pg;

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
import gi.ob;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.r2;
import org.telegram.messenger.re;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.y00;
import org.telegram.ui.u;
import org.telegram.ui.u40;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class m extends FrameLayout implements a {
    public float E;
    public float F;
    public boolean G;
    public final b H;
    public final float[] I;
    public boolean J;
    public boolean K;
    public int L;
    public k M;
    public l N;
    public final RectF O;
    public final RectF P;
    public final CropAreaView a;
    public final ImageView b;
    public final Matrix c;
    public b51 d;
    public f e;
    public final RectF f;
    public final RectF h;
    public float n;
    public final boolean r;
    public final y00 s;
    public final Matrix w;
    public Bitmap x;
    public boolean y;

    public m(Context context) {
        super(context);
        this.I = new float[9];
        this.O = new RectF();
        this.P = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z10 = context instanceof BubbleActivity;
        this.r = z10;
        this.f = new RectF();
        this.h = new RectF();
        this.c = new Matrix();
        y00 y00Var = new y00();
        y00Var.a = new float[8];
        this.s = y00Var;
        this.w = new Matrix();
        this.G = false;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        b bVar = new b(context);
        this.H = bVar;
        bVar.b = this;
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
        cropAreaView.b0 = z10;
        cropAreaView.K = true;
        cropAreaView.J = true;
        cropAreaView.W = g0.L(16.0f);
        cropAreaView.a0 = g0.L(32.0f);
        cropAreaView.u0 = 1;
        Paint paint = new Paint();
        cropAreaView.P = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        cropAreaView.Q = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(g0.L(2.0f));
        Paint paint3 = new Paint();
        cropAreaView.R = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(g0.L(1.0f));
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

    public static void a(m mVar, Integer[][] numArr, int i3) {
        mVar.J = false;
        if (i3 == 0) {
            k kVar = mVar.M;
            float f10 = kVar.g % 180.0f;
            mVar.setLockedAspectRatio((f10 != 0.0f ? kVar.b : kVar.a) / (f10 != 0.0f ? kVar.a : kVar.b));
        } else {
            if (i3 == 1) {
                mVar.setLockedAspectRatio(1.0f);
                return;
            }
            Integer[] numArr2 = numArr[i3 - 2];
            if (mVar.a.getAspectRatio() > 1.0f) {
                mVar.setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
            } else {
                mVar.setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
            }
        }
    }

    public static void c(String str, Canvas canvas, Bitmap bitmap, Matrix matrix, int i3, int i10, float f10, float f11, float f12, float f13, ArrayList arrayList) {
        int i11 = i3;
        int i12 = i10;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix2 = new Matrix();
            char c2 = 2;
            matrix2.postTranslate((-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2);
            float max = 1.0f / (Math.max(decodeFile.getWidth(), decodeFile.getHeight()) / Math.max(i3, i10));
            matrix2.postScale(max, max);
            matrix2.postRotate(f12);
            matrix2.postConcat(matrix);
            matrix2.postScale(f13, f13);
            matrix2.postTranslate(bitmap.getWidth() / 2, bitmap.getHeight() / 2);
            canvas.drawBitmap(decodeFile, matrix2, new Paint(2));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(compressFormat, 87, fileOutputStream);
            fileOutputStream.close();
            if (arrayList != null && !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    z10 z10Var = (z10) arrayList.get(i13);
                    float width = ((z10Var.f / 2.0f) + z10Var.c) * decodeFile.getWidth();
                    float height = ((z10Var.g / 2.0f) + z10Var.d) * decodeFile.getHeight();
                    char c10 = c2;
                    float width2 = z10Var.y * decodeFile.getWidth();
                    float height2 = z10Var.z * decodeFile.getHeight();
                    float[] fArr = new float[4];
                    fArr[0] = width;
                    fArr[1] = height;
                    fArr[c10] = width2;
                    fArr[3] = height2;
                    matrix2.mapPoints(fArr);
                    int width3 = decodeFile.getWidth();
                    int height3 = decodeFile.getHeight();
                    if (f12 == 90.0f || f12 == 270.0f) {
                        width3 = decodeFile.getHeight();
                        height3 = decodeFile.getWidth();
                    }
                    if (z10Var.a == 1) {
                        z10Var.f = ((z10Var.f * i11) / bitmap.getWidth()) * f13 * f10;
                        z10Var.g = ((z10Var.g * i12) / bitmap.getHeight()) * f13 * f10;
                    } else {
                        float f14 = i11;
                        float f15 = width3;
                        z10Var.q = (int) ((z10Var.q / f14) * f15);
                        float f16 = i12;
                        float f17 = height3;
                        z10Var.r = (int) ((z10Var.r / f16) * f17);
                        z10Var.f = ((z10Var.f * f14) / f15) * f13 * f10;
                        z10Var.g = ((z10Var.g * f16) / f17) * f13 * f10;
                    }
                    z10Var.c = (fArr[0] / bitmap.getWidth()) - (z10Var.f / 2.0f);
                    z10Var.d = (fArr[1] / bitmap.getHeight()) - (z10Var.g / 2.0f);
                    z10Var.y = fArr[c10] / bitmap.getWidth();
                    z10Var.z = fArr[3] / bitmap.getHeight();
                    z10Var.e = (float) (z10Var.e - ((f11 + f12) * 0.017453292519943295d));
                    i13++;
                    i11 = i3;
                    i12 = i10;
                    c2 = c10;
                }
            }
            decodeFile.recycle();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    public static float f(RectF rectF, float f10, float f11) {
        float width = rectF.width() * f11;
        float height = rectF.height() * f11;
        float width2 = (rectF.width() - width) / 2.0f;
        float height2 = (rectF.height() - height) / 2.0f;
        float f12 = rectF.left + width2;
        float f13 = rectF.top + height2;
        rectF.set(f12, f13, width + f12, height + f13);
        return f10 * f11;
    }

    public static void g(RectF rectF, RectF rectF2, PointF pointF, float f10) {
        float f11 = rectF2.left;
        float f12 = rectF2.top;
        float f13 = rectF2.right;
        float f14 = rectF2.bottom;
        float f15 = rectF.left;
        if (f15 > f11) {
            f13 += f15 - f11;
            f11 = f15;
        }
        float f16 = rectF.top;
        if (f16 > f12) {
            f14 += f16 - f12;
            f12 = f16;
        }
        float f17 = rectF.right;
        if (f17 < f13) {
            f11 += f17 - f13;
        }
        float f18 = rectF.bottom;
        if (f18 < f14) {
            f12 += f18 - f14;
        }
        float centerX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f11);
        float centerY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f12);
        double d = f10;
        double d10 = 1.5707963267948966d - d;
        double d11 = centerX;
        float sin = (float) (Math.sin(d10) * d11);
        float cos = (float) (Math.cos(d10) * d11);
        double d12 = d + 1.5707963267948966d;
        double d13 = centerY;
        pointF.set(pointF.x + sin + ((float) (Math.cos(d12) * d13)), pointF.y + cos + ((float) (Math.sin(d12) * d13)));
    }

    public static String h(String str) {
        File file = new File(w7.z(4), az.p() + "_temp.jpg");
        try {
            g0.E(new File(str), file);
        } catch (Exception e10) {
            a8.g(e10, true);
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

    private void setLockedAspectRatio(float f10) {
        CropAreaView cropAreaView = this.a;
        cropAreaView.setLockedAspectRatio(f10);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f10);
        d(rectF);
        l lVar = this.N;
        if (lVar != null) {
            lVar.Q(false);
            this.N.A(true);
        }
    }

    public final void b(re reVar) {
        int i3;
        int i10;
        float f10;
        CropAreaView cropAreaView = this.a;
        cropAreaView.d(this.O);
        int ceil = (int) Math.ceil(n(r1, this.P));
        int ceil2 = (int) Math.ceil(r2 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.M.k;
        float[] fArr = this.I;
        matrix.getValues(fArr);
        k kVar = this.M;
        float f11 = kVar.f * cropWidth;
        reVar.k = (int) kVar.h;
        if (r2.a) {
            p1.q(reVar.k, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i3 = reVar.k;
            if (i3 >= 0) {
                break;
            } else {
                reVar.k = i3 + 360;
            }
        }
        if (i3 == 90 || i3 == 270) {
            k kVar2 = this.M;
            i10 = (int) kVar2.b;
            f10 = kVar2.a;
        } else {
            k kVar3 = this.M;
            i10 = (int) kVar3.a;
            f10 = kVar3.b;
        }
        int i11 = (int) f10;
        float f12 = i10;
        reVar.e = (float) (ceil / Math.ceil(f12 * f11));
        float f13 = i11;
        float ceil3 = (float) (ceil2 / Math.ceil(f11 * f13));
        reVar.f = ceil3;
        float f14 = reVar.e;
        if (f14 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f14, ceil3);
            reVar.e /= max;
            reVar.f /= max;
        }
        reVar.c = Math.min(f12 / cropAreaView.getCropWidth(), f13 / cropAreaView.getCropHeight()) * this.M.e;
        float f15 = fArr[2] / f12;
        k kVar4 = this.M;
        float f16 = kVar4.e;
        reVar.a = f15 / f16;
        reVar.b = (fArr[5] / f13) / f16;
        reVar.d = kVar4.i;
        reVar.m = f16;
        reVar.l = kVar4.j;
        reVar.o = cropWidth;
        reVar.r = kVar4.k;
        reVar.s = ceil;
        reVar.t = ceil2;
        reVar.u = this.y;
        reVar.v = cropAreaView.getLockAspectRatio();
        reVar.C = true;
    }

    public final void d(RectF rectF) {
        boolean z10;
        if (this.M == null) {
            return;
        }
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f10 = this.M.e;
        if (f10 * max > 30.0f) {
            max = 30.0f / f10;
            z10 = true;
        } else {
            z10 = false;
        }
        float f11 = max;
        int i3 = !this.r ? g0.m : 0;
        float centerX = rectF.centerX();
        ImageView imageView = this.b;
        float a10 = k.a(this.M) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = k.b(this.M) * ((rectF.centerY() - ((((imageView.getHeight() - this.E) + i3) + this.F) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new g(this, f11, fArr, a10, b10, 0));
        ofFloat.addListener(new u40(14, this, z10));
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
        animatorSet2.addListener(new ri0(17, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z10, boolean z11, boolean z12, boolean z13) {
        float f10;
        if (this.M == null) {
            return;
        }
        CropAreaView cropAreaView = this.a;
        float cropWidth = cropAreaView.getCropWidth();
        float cropHeight = cropAreaView.getCropHeight();
        float a10 = k.a(this.M);
        float b10 = k.b(this.M);
        float f11 = this.M.i;
        float radians = (float) Math.toRadians(f11);
        RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
        Matrix matrix = new Matrix();
        matrix.postRotate(f11, cropWidth / 2.0f, cropHeight / 2.0f);
        matrix.mapRect(rectF);
        RectF rectF2 = new RectF(0.0f, 0.0f, a10, b10);
        float f12 = (cropWidth - a10) / 2.0f;
        k kVar = this.M;
        float f13 = kVar.e;
        y00 y00Var = this.s;
        float[] fArr = (float[]) y00Var.a;
        float[] fArr2 = (float[]) y00Var.a;
        float f14 = rectF2.left;
        fArr[0] = f14;
        float f15 = rectF2.top;
        fArr[1] = f15;
        float f16 = rectF2.right;
        fArr[2] = f16;
        fArr[3] = f15;
        fArr[4] = f16;
        float f17 = rectF2.bottom;
        fArr[5] = f17;
        fArr[6] = f14;
        fArr[7] = f17;
        Matrix matrix2 = new Matrix();
        matrix2.set(kVar.k);
        matrix2.preTranslate(f12 / f13, ((cropHeight - b10) / 2.0f) / f13);
        Matrix matrix3 = this.w;
        matrix3.reset();
        matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
        matrix3.setConcat(matrix3, matrix2);
        matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        matrix3.mapPoints(fArr2);
        matrix3.reset();
        matrix3.preRotate(-f11, a10 / 2.0f, b10 / 2.0f);
        matrix3.mapPoints(fArr2);
        rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
        k kVar2 = this.M;
        PointF pointF = new PointF(kVar2.c, kVar2.d);
        if (!rectF2.contains(rectF)) {
            f10 = (!z10 || (rectF.width() <= rectF2.width() && rectF.height() <= rectF2.height())) ? f13 : f(rectF2, f13, rectF.width() / n(rectF, rectF2));
            g(rectF2, rectF, pointF, radians);
        } else if (!z11 || this.n <= 0.0f) {
            f10 = f13;
        } else {
            float width = rectF.width() / n(rectF, rectF2);
            if (this.M.e * width < this.n) {
                width = 1.0f;
            }
            f10 = f(rectF2, f13, width);
            g(rectF2, rectF, pointF, radians);
        }
        float f18 = pointF.x;
        k kVar3 = this.M;
        float f19 = f18 - kVar3.c;
        float f20 = pointF.y - kVar3.d;
        if (!z12) {
            k.f(kVar3, f19, f20);
            k.g(this.M, f10 / f13, 0.0f, 0.0f);
            r(false);
            return;
        }
        float f21 = f10 / f13;
        if (Math.abs(f21 - 1.0f) >= 1.0E-5f || Math.abs(f19) >= 1.0E-5f || Math.abs(f20) >= 1.0E-5f) {
            this.G = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new g(this, f19, new float[]{1.0f, 0.0f, 0.0f}, f20, f21, 1));
            ofFloat.addListener(new j(this, z13, z10, z11, z12));
            ofFloat.setInterpolator(cropAreaView.getInterpolator());
            ofFloat.setDuration(z13 ? 100L : 200L);
            ofFloat.start();
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
        b51 b51Var = this.d;
        if (b51Var != null) {
            return b51Var.getVideoHeight();
        }
        Bitmap bitmap = this.x;
        if (bitmap == null) {
            return 1;
        }
        int i3 = this.L;
        return (i3 == 90 || i3 == 270) ? bitmap.getWidth() : bitmap.getHeight();
    }

    public int getCurrentWidth() {
        b51 b51Var = this.d;
        if (b51Var != null) {
            return b51Var.getVideoWidth();
        }
        Bitmap bitmap = this.x;
        if (bitmap == null) {
            return 1;
        }
        int i3 = this.L;
        return (i3 == 90 || i3 == 270) ? bitmap.getHeight() : bitmap.getWidth();
    }

    public float getStateFullOrientation() {
        k kVar = this.M;
        if (kVar == null) {
            return 0.0f;
        }
        return kVar.g + kVar.h;
    }

    public boolean getStateMirror() {
        k kVar = this.M;
        return kVar != null && kVar.j;
    }

    public float getStateOrientation() {
        k kVar = this.M;
        if (kVar == null) {
            return 0.0f;
        }
        return kVar.h;
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        k kVar = this.M;
        if (kVar == null) {
            return;
        }
        final float f10 = kVar.f;
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.l0 = null;
        }
        k kVar2 = this.M;
        if ((kVar2.h + kVar2.g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f11 = currentWidth / currentHeight;
        if (!this.y) {
            f11 = 1.0f;
        }
        cropAreaView.a(this.h, f11);
        cropAreaView.setLockedAspectRatio(this.y ? 0.0f : 1.0f);
        this.n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.y);
        k kVar3 = this.M;
        final float f12 = kVar3.c;
        final float f13 = kVar3.d;
        final float f14 = kVar3.e;
        final float f15 = kVar3.i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pg.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                m mVar = m.this;
                if (mVar.M == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = mVar.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                g0.Z1(rectF4, rectF3, floatValue, rectF5);
                mVar.a.setActualRect(rectF5);
                k kVar4 = mVar.M;
                float f16 = 1.0f - floatValue;
                float f17 = kVar4.c - (f12 * f16);
                float f18 = kVar4.d - (f13 * f16);
                float f19 = kVar4.i - (f15 * f16);
                float T1 = g0.T1(f14, f10, floatValue);
                k kVar5 = mVar.M;
                float f20 = T1 / kVar5.e;
                k.f(kVar5, -f17, -f18);
                k.g(mVar.M, f20, 0.0f, 0.0f);
                k.e(mVar.M, -f19);
                mVar.e(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        k kVar = this.M;
        boolean z10 = false;
        if (kVar == null) {
            return false;
        }
        kVar.j = !kVar.j;
        r(false);
        l lVar = this.N;
        if (lVar != null) {
            k kVar2 = this.M;
            float f10 = kVar2.h;
            float f11 = kVar2.g;
            float f12 = ((f10 + f11) - f11) % 360.0f;
            if (!k.c(kVar2) && f12 == 0.0f && this.a.getLockAspectRatio() == 0.0f && !this.M.j) {
                z10 = true;
            }
            lVar.Q(z10);
        }
        return this.M.j;
    }

    public final void k() {
        this.a.g(2, false);
        if (this.n < 1.0E-5f) {
            this.n = this.M.e;
        }
    }

    public final void l(boolean z10) {
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.l0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.l0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        k kVar = this.M;
        cropAreaView.e(currentWidth, currentHeight, (kVar == null || kVar.g % 180.0f == 0.0f) ? false : true, this.y);
        cropAreaView.setLockedAspectRatio(this.y ? 0.0f : 1.0f);
        k kVar2 = this.M;
        if (kVar2 != null) {
            k.d(kVar2, 0.0f);
            this.M.j = false;
        }
        cropAreaView.d(this.h);
        r(z10);
        this.n = 0.0f;
        l lVar = this.N;
        if (lVar != null) {
            lVar.Q(true);
            this.N.A(false);
        }
    }

    public final boolean m(float f10) {
        if (this.M != null) {
            CropAreaView cropAreaView = this.a;
            AnimatorSet animatorSet = cropAreaView.l0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.l0 = null;
            }
            this.n = 0.0f;
            k kVar = this.M;
            float f11 = kVar.h;
            float f12 = kVar.g;
            float f13 = (((f11 + f12) - f12) + f10) % 360.0f;
            if (!this.y || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.e(getCurrentWidth(), getCurrentHeight(), (this.M.g + f13) % 180.0f != 0.0f, this.y);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            k.d(this.M, f13);
            r(false);
            e(true, false, false, false);
            l lVar = this.N;
            if (lVar != null) {
                lVar.Q(f13 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.M.j);
            }
            if (((int) this.M.h) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        int i3 = 4;
        if (this.M == null || this.J) {
            return;
        }
        this.J = true;
        String[] strArr = new String[8];
        Integer[][] numArr = {new Integer[]{3, 2}, new Integer[]{5, 3}, new Integer[]{4, 3}, new Integer[]{5, 4}, new Integer[]{7, 5}, new Integer[]{16, 9}};
        strArr[0] = bd.M0(2131751698, null);
        strArr[1] = bd.M0(2131751696, null);
        int i10 = 2;
        for (int i11 = 0; i11 < 6; i11++) {
            Integer[] numArr2 = numArr[i11];
            if (this.a.getAspectRatio() > 1.0f) {
                strArr[i10] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i10] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i10++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f(strArr, new u(13, this, numArr));
        s1 s1Var = alertDialog$Builder.a;
        s1Var.setCanceledOnTouchOutside(true);
        s1Var.setOnCancelListener(new ob(this, i3));
        s1Var.show();
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
                        e(true, false, true, false);
                    }
                } else if (!this.G) {
                    cropAreaView.g(3, true);
                    this.n = 0.0f;
                    l lVar = this.N;
                    if (lVar != null) {
                        lVar.Q(false);
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

    public final void p(int i3, f fVar, re reVar) {
        this.y = true;
        this.d = null;
        this.e = fVar;
        this.L = i3;
        this.x = null;
        CropAreaView cropAreaView = this.a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.M = new k(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new i(this, reVar, currentHeight, currentWidth, 0));
    }

    public final void q() {
        int i3;
        float f10;
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
        k kVar = this.M;
        float f11 = kVar.f * cropWidth;
        int i10 = (int) kVar.h;
        while (i10 < 0) {
            i10 += 360;
        }
        if (i10 == 90 || i10 == 270) {
            k kVar2 = this.M;
            i3 = (int) kVar2.b;
            f10 = kVar2.a;
        } else {
            k kVar3 = this.M;
            i3 = (int) kVar3.a;
            f10 = kVar3.b;
        }
        int i11 = (int) f10;
        double d = ceil;
        float f12 = i3;
        float ceil3 = (float) (d / Math.ceil(f12 * f11));
        float f13 = i11;
        float ceil4 = (float) (ceil2 / Math.ceil(f11 * f13));
        if (ceil3 > 1.0f || ceil4 > 1.0f) {
            float max = Math.max(ceil3, ceil4);
            ceil3 /= max;
            ceil4 /= max;
        }
        float f14 = ceil4;
        float f15 = ceil3;
        RectF rectF = cropAreaView.m0;
        cropAreaView.a(rectF, f12 / f13);
        float width = this.y ? rectF.width() / f12 : Math.max(rectF.width() / f12, rectF.height() / f13);
        k kVar4 = this.M;
        float f16 = kVar4.e;
        float f17 = f16 / width;
        float f18 = f16 / kVar4.f;
        float f19 = (fArr[2] / f12) / f16;
        float f20 = (fArr[5] / f13) / f16;
        float f21 = kVar4.i;
        RectF targetRectToFill = cropAreaView.getTargetRectToFill();
        float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
        float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
        f fVar = this.e;
        k kVar5 = this.M;
        boolean z10 = kVar5.j || k.c(kVar5) || this.M.g >= 1.0E-5f;
        k kVar6 = this.M;
        fVar.e(z10, f19, f20, f21, (int) kVar6.h, f17, f18, kVar6.f / width, f15, f14, cropCenterX, cropCenterY, kVar6.j);
    }

    public final void r(boolean z10) {
        if (this.M == null) {
            return;
        }
        Matrix matrix = this.c;
        matrix.reset();
        k kVar = this.M;
        float f10 = kVar.g;
        if (f10 == 90.0f || f10 == 270.0f) {
            matrix.postTranslate((-kVar.b) / 2.0f, (-kVar.a) / 2.0f);
        } else {
            matrix.postTranslate((-kVar.a) / 2.0f, (-kVar.b) / 2.0f);
        }
        matrix.postRotate((int) this.M.h);
        matrix.postConcat(this.M.k);
        CropAreaView cropAreaView = this.a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.y || this.K || z10) {
            q();
            this.N.u();
        }
        invalidate();
    }

    public void setAspectRatio(float f10) {
        this.a.setActualRect(f10);
    }

    public void setBottomPadding(float f10) {
        this.E = f10;
        this.a.setBottomPadding(f10);
    }

    public void setFreeform(boolean z10) {
        this.a.setFreeform(z10);
        this.y = z10;
    }

    public void setListener(l lVar) {
        this.N = lVar;
    }

    @Override // android.view.View
    public void setRotation(float f10) {
        k kVar = this.M;
        k.e(kVar, f10 - kVar.i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.a.setSubtitle(str);
    }

    public void setTopPadding(float f10) {
        this.F = f10;
        this.a.setTopPadding(f10);
    }
}
