package yf;

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
import cg.u1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import kf.k0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.s61;
import ph.wa;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class n extends FrameLayout implements a {
    public float B;
    public boolean C;
    public final b D;
    public final float[] E;
    public boolean F;
    public boolean G;
    public int H;
    public l I;
    public m J;
    public final RectF K;
    public final RectF L;
    public final CropAreaView a;
    public final ImageView b;
    public final Matrix c;
    public w61 d;
    public f e;
    public final RectF f;
    public final RectF h;
    public float n;
    public final boolean r;
    public final tp0 s;
    public final Matrix v;
    public Bitmap w;
    public boolean x;
    public float y;

    public n(Context context) {
        super(context);
        this.E = new float[9];
        this.K = new RectF();
        this.L = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z4 = context instanceof BubbleActivity;
        this.r = z4;
        this.f = new RectF();
        this.h = new RectF();
        this.c = new Matrix();
        tp0 tp0Var = new tp0(25);
        tp0Var.b = new float[8];
        this.s = tp0Var;
        this.v = new Matrix();
        this.C = false;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        b bVar = new b(context);
        this.D = bVar;
        bVar.b = this;
        CropAreaView cropAreaView = new CropAreaView(context);
        cropAreaView.d = new RectF();
        cropAreaView.e = new RectF();
        cropAreaView.f = new RectF();
        cropAreaView.h = new RectF();
        cropAreaView.n = new RectF();
        cropAreaView.r = new RectF();
        cropAreaView.s = new RectF();
        cropAreaView.v = new RectF();
        cropAreaView.x = new RectF();
        cropAreaView.y = new RectF();
        cropAreaView.H = -1.0f;
        cropAreaView.I = 1.0f;
        cropAreaView.J = -1.0f;
        cropAreaView.R = new AccelerateDecelerateInterpolator();
        cropAreaView.c0 = true;
        cropAreaView.i0 = new RectF();
        cropAreaView.k0 = 0.0f;
        cropAreaView.l0 = 1.0f;
        cropAreaView.m0 = 0.0f;
        cropAreaView.n0 = 0.0f;
        cropAreaView.U = z4;
        cropAreaView.G = true;
        cropAreaView.F = true;
        cropAreaView.S = AndroidUtilities.dp(16.0f);
        cropAreaView.T = AndroidUtilities.dp(32.0f);
        cropAreaView.q0 = 1;
        Paint paint = new Paint();
        cropAreaView.L = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        cropAreaView.M = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint paint3 = new Paint();
        cropAreaView.N = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        Paint paint4 = new Paint();
        cropAreaView.O = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        Paint paint5 = new Paint();
        cropAreaView.P = paint5;
        paint5.setStyle(style);
        paint5.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        cropAreaView.e0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        cropAreaView.Q = paint7;
        paint7.setColor(-1);
        cropAreaView.setWillNotDraw(false);
        this.a = cropAreaView;
        cropAreaView.setListener(this);
        addView(cropAreaView);
    }

    public static void a(n nVar, Integer[][] numArr, int i10) {
        nVar.F = false;
        if (i10 == 0) {
            l lVar = nVar.I;
            float f10 = lVar.g % 180.0f;
            nVar.setLockedAspectRatio((f10 != 0.0f ? lVar.b : lVar.a) / (f10 != 0.0f ? lVar.a : lVar.b));
        } else {
            if (i10 == 1) {
                nVar.setLockedAspectRatio(1.0f);
                return;
            }
            Integer[] numArr2 = numArr[i10 - 2];
            if (nVar.a.getAspectRatio() > 1.0f) {
                nVar.setLockedAspectRatio(numArr2[0].intValue() / numArr2[1].intValue());
            } else {
                nVar.setLockedAspectRatio(numArr2[1].intValue() / numArr2[0].intValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8 A[Catch: all -> 0x019b, TryCatch #0 {all -> 0x019b, blocks: (B:3:0x000c, B:5:0x007c, B:7:0x0082, B:9:0x0089, B:15:0x00f4, B:17:0x00f8, B:19:0x014b, B:20:0x011d, B:22:0x00eb, B:24:0x0197), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011d A[Catch: all -> 0x019b, TryCatch #0 {all -> 0x019b, blocks: (B:3:0x000c, B:5:0x007c, B:7:0x0082, B:9:0x0089, B:15:0x00f4, B:17:0x00f8, B:19:0x014b, B:20:0x011d, B:22:0x00eb, B:24:0x0197), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(String str, Canvas canvas, Bitmap bitmap, Matrix matrix, int i10, int i11, float f10, float f11, float f12, float f13, ArrayList arrayList) {
        char c3;
        int i12 = i10;
        int i13 = i11;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            Matrix matrix2 = new Matrix();
            matrix2.postTranslate((-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2);
            float max = 1.0f / (Math.max(decodeFile.getWidth(), decodeFile.getHeight()) / Math.max(i10, i11));
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
                int i14 = 0;
                while (i14 < size) {
                    VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i14);
                    float[] fArr = {((mediaEntity.width / 2.0f) + mediaEntity.x) * decodeFile.getWidth(), ((mediaEntity.height / 2.0f) + mediaEntity.y) * decodeFile.getHeight(), mediaEntity.textViewX * decodeFile.getWidth(), mediaEntity.textViewY * decodeFile.getHeight()};
                    matrix2.mapPoints(fArr);
                    int width = decodeFile.getWidth();
                    int height = decodeFile.getHeight();
                    if (f12 != 90.0f) {
                        if (f12 == 270.0f) {
                        }
                        if (mediaEntity.type != 1) {
                            mediaEntity.width = ((mediaEntity.width * i12) / bitmap.getWidth()) * f13 * f10;
                            mediaEntity.height = ((mediaEntity.height * i13) / bitmap.getHeight()) * f13 * f10;
                            c3 = 1;
                        } else {
                            c3 = 1;
                            float f14 = i12;
                            float f15 = width;
                            mediaEntity.viewWidth = (int) ((mediaEntity.viewWidth / f14) * f15);
                            float f16 = i13;
                            float f17 = height;
                            mediaEntity.viewHeight = (int) ((mediaEntity.viewHeight / f16) * f17);
                            mediaEntity.width = ((mediaEntity.width * f14) / f15) * f13 * f10;
                            mediaEntity.height = ((mediaEntity.height * f16) / f17) * f13 * f10;
                        }
                        mediaEntity.x = (fArr[0] / bitmap.getWidth()) - (mediaEntity.width / 2.0f);
                        mediaEntity.y = (fArr[c3] / bitmap.getHeight()) - (mediaEntity.height / 2.0f);
                        mediaEntity.textViewX = fArr[2] / bitmap.getWidth();
                        mediaEntity.textViewY = fArr[3] / bitmap.getHeight();
                        mediaEntity.rotation = (float) (mediaEntity.rotation - ((f11 + f12) * 0.017453292519943295d));
                        i14++;
                        i12 = i10;
                        i13 = i11;
                    }
                    width = decodeFile.getHeight();
                    height = decodeFile.getWidth();
                    if (mediaEntity.type != 1) {
                    }
                    mediaEntity.x = (fArr[0] / bitmap.getWidth()) - (mediaEntity.width / 2.0f);
                    mediaEntity.y = (fArr[c3] / bitmap.getHeight()) - (mediaEntity.height / 2.0f);
                    mediaEntity.textViewX = fArr[2] / bitmap.getWidth();
                    mediaEntity.textViewY = fArr[3] / bitmap.getHeight();
                    mediaEntity.rotation = (float) (mediaEntity.rotation - ((f11 + f12) * 0.017453292519943295d));
                    i14++;
                    i12 = i10;
                    i13 = i11;
                }
            }
            decodeFile.recycle();
        } catch (Throwable th2) {
            FileLog.e(th2);
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
        File file = new File(FileLoader.getDirectory(4), SharedConfig.getLastLocalId() + "_temp.jpg");
        try {
            AndroidUtilities.copyFile(new File(str), file);
        } catch (Exception e) {
            FileLog.e(e);
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
        m mVar = this.J;
        if (mVar != null) {
            mVar.G1(false);
            this.J.M0(true);
        }
    }

    public final void b(MediaController.CropState cropState) {
        int i10;
        int i11;
        float f10;
        CropAreaView cropAreaView = this.a;
        cropAreaView.d(this.K);
        int ceil = (int) Math.ceil(n(r1, this.L));
        int ceil2 = (int) Math.ceil(r2 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.I.k;
        float[] fArr = this.E;
        matrix.getValues(fArr);
        l lVar = this.I;
        float f11 = lVar.f * cropWidth;
        cropState.transformRotation = (int) lVar.h;
        if (BuildVars.LOGS_ENABLED) {
            k0.t(cropState.transformRotation, new StringBuilder("set transformRotation = "));
        }
        while (true) {
            i10 = cropState.transformRotation;
            if (i10 >= 0) {
                break;
            } else {
                cropState.transformRotation = i10 + 360;
            }
        }
        if (i10 == 90 || i10 == 270) {
            l lVar2 = this.I;
            i11 = (int) lVar2.b;
            f10 = lVar2.a;
        } else {
            l lVar3 = this.I;
            i11 = (int) lVar3.a;
            f10 = lVar3.b;
        }
        int i12 = (int) f10;
        float f12 = i11;
        cropState.cropPw = (float) (ceil / Math.ceil(f12 * f11));
        float f13 = i12;
        float ceil3 = (float) (ceil2 / Math.ceil(f11 * f13));
        cropState.cropPh = ceil3;
        float f14 = cropState.cropPw;
        if (f14 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f14, ceil3);
            cropState.cropPw /= max;
            cropState.cropPh /= max;
        }
        cropState.cropScale = Math.min(f12 / cropAreaView.getCropWidth(), f13 / cropAreaView.getCropHeight()) * this.I.e;
        float f15 = fArr[2] / f12;
        l lVar4 = this.I;
        float f16 = lVar4.e;
        cropState.cropPx = f15 / f16;
        cropState.cropPy = (fArr[5] / f13) / f16;
        cropState.cropRotate = lVar4.i;
        cropState.stateScale = f16;
        cropState.mirrored = lVar4.j;
        cropState.scale = cropWidth;
        cropState.matrix = lVar4.k;
        cropState.width = ceil;
        cropState.height = ceil2;
        cropState.freeform = this.x;
        cropState.lockedAspectRatio = cropAreaView.getLockAspectRatio();
        cropState.initied = true;
    }

    public final void d(RectF rectF) {
        boolean z4;
        if (this.I == null) {
            return;
        }
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f10 = this.I.e;
        if (f10 * max > 30.0f) {
            max = 30.0f / f10;
            z4 = true;
        } else {
            z4 = false;
        }
        float f11 = max;
        int i10 = !this.r ? AndroidUtilities.statusBarHeight : 0;
        float centerX = rectF.centerX();
        ImageView imageView = this.b;
        float a2 = l.a(this.I) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = l.b(this.I) * ((rectF.centerY() - ((((imageView.getHeight() - this.y) + i10) + this.B) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new g(this, f11, fArr, a2, b10, 0));
        ofFloat.addListener(new s61(17, this, z4));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.R;
        AnimatorSet animatorSet = cropAreaView.h0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.h0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.h0 = animatorSet2;
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
        animatorSet2.addListener(new ex0(23, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z4, boolean z10, boolean z11, boolean z12) {
        float f10;
        if (this.I == null) {
            return;
        }
        CropAreaView cropAreaView = this.a;
        float cropWidth = cropAreaView.getCropWidth();
        float cropHeight = cropAreaView.getCropHeight();
        float a2 = l.a(this.I);
        float b10 = l.b(this.I);
        float f11 = this.I.i;
        float radians = (float) Math.toRadians(f11);
        RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
        Matrix matrix = new Matrix();
        matrix.postRotate(f11, cropWidth / 2.0f, cropHeight / 2.0f);
        matrix.mapRect(rectF);
        RectF rectF2 = new RectF(0.0f, 0.0f, a2, b10);
        float f12 = (cropWidth - a2) / 2.0f;
        l lVar = this.I;
        float f13 = lVar.e;
        tp0 tp0Var = this.s;
        float[] fArr = (float[]) tp0Var.b;
        float[] fArr2 = (float[]) tp0Var.b;
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
        matrix2.set(lVar.k);
        matrix2.preTranslate(f12 / f13, ((cropHeight - b10) / 2.0f) / f13);
        Matrix matrix3 = this.v;
        matrix3.reset();
        matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
        matrix3.setConcat(matrix3, matrix2);
        matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        matrix3.mapPoints(fArr2);
        matrix3.reset();
        matrix3.preRotate(-f11, a2 / 2.0f, b10 / 2.0f);
        matrix3.mapPoints(fArr2);
        rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
        l lVar2 = this.I;
        PointF pointF = new PointF(lVar2.c, lVar2.d);
        if (!rectF2.contains(rectF)) {
            f10 = (!z4 || (rectF.width() <= rectF2.width() && rectF.height() <= rectF2.height())) ? f13 : f(rectF2, f13, rectF.width() / n(rectF, rectF2));
            g(rectF2, rectF, pointF, radians);
        } else if (!z10 || this.n <= 0.0f) {
            f10 = f13;
        } else {
            float width = rectF.width() / n(rectF, rectF2);
            if (this.I.e * width < this.n) {
                width = 1.0f;
            }
            f10 = f(rectF2, f13, width);
            g(rectF2, rectF, pointF, radians);
        }
        float f18 = pointF.x;
        l lVar3 = this.I;
        float f19 = f18 - lVar3.c;
        float f20 = pointF.y - lVar3.d;
        if (!z11) {
            l.f(lVar3, f19, f20);
            l.g(this.I, f10 / f13, 0.0f, 0.0f);
            r(false);
            return;
        }
        float f21 = f10 / f13;
        if (Math.abs(f21 - 1.0f) >= 1.0E-5f || Math.abs(f19) >= 1.0E-5f || Math.abs(f20) >= 1.0E-5f) {
            this.C = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new g(this, f19, new float[]{1.0f, 0.0f, 0.0f}, f20, f21, 1));
            ofFloat.addListener(new k(this, z12, z4, z10, z11));
            ofFloat.setInterpolator(cropAreaView.getInterpolator());
            ofFloat.setDuration(z12 ? 100L : 200L);
            ofFloat.start();
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.a;
        RectF rectF = this.K;
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
        w61 w61Var = this.d;
        if (w61Var != null) {
            return w61Var.getVideoHeight();
        }
        Bitmap bitmap = this.w;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.H;
        return (i10 == 90 || i10 == 270) ? bitmap.getWidth() : bitmap.getHeight();
    }

    public int getCurrentWidth() {
        w61 w61Var = this.d;
        if (w61Var != null) {
            return w61Var.getVideoWidth();
        }
        Bitmap bitmap = this.w;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.H;
        return (i10 == 90 || i10 == 270) ? bitmap.getHeight() : bitmap.getWidth();
    }

    public float getStateFullOrientation() {
        l lVar = this.I;
        if (lVar == null) {
            return 0.0f;
        }
        return lVar.g + lVar.h;
    }

    public boolean getStateMirror() {
        l lVar = this.I;
        return lVar != null && lVar.j;
    }

    public float getStateOrientation() {
        l lVar = this.I;
        if (lVar == null) {
            return 0.0f;
        }
        return lVar.h;
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        l lVar = this.I;
        if (lVar == null) {
            return;
        }
        final float f10 = lVar.f;
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.h0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.h0 = null;
        }
        l lVar2 = this.I;
        if ((lVar2.h + lVar2.g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f11 = currentWidth / currentHeight;
        if (!this.x) {
            f11 = 1.0f;
        }
        cropAreaView.a(this.h, f11);
        cropAreaView.setLockedAspectRatio(this.x ? 0.0f : 1.0f);
        this.n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.x);
        l lVar3 = this.I;
        final float f12 = lVar3.c;
        final float f13 = lVar3.d;
        final float f14 = lVar3.e;
        final float f15 = lVar3.i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yf.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n nVar = n.this;
                if (nVar.I == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = nVar.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                AndroidUtilities.lerp(rectF4, rectF3, floatValue, rectF5);
                nVar.a.setActualRect(rectF5);
                l lVar4 = nVar.I;
                float f16 = 1.0f - floatValue;
                float f17 = lVar4.c - (f12 * f16);
                float f18 = lVar4.d - (f13 * f16);
                float f19 = lVar4.i - (f15 * f16);
                float lerp = AndroidUtilities.lerp(f14, f10, floatValue);
                l lVar5 = nVar.I;
                float f20 = lerp / lVar5.e;
                l.f(lVar5, -f17, -f18);
                l.g(nVar.I, f20, 0.0f, 0.0f);
                l.e(nVar.I, -f19);
                nVar.e(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        l lVar = this.I;
        boolean z4 = false;
        if (lVar == null) {
            return false;
        }
        lVar.j = !lVar.j;
        r(false);
        m mVar = this.J;
        if (mVar != null) {
            l lVar2 = this.I;
            float f10 = lVar2.h;
            float f11 = lVar2.g;
            float f12 = ((f10 + f11) - f11) % 360.0f;
            if (!l.c(lVar2) && f12 == 0.0f && this.a.getLockAspectRatio() == 0.0f && !this.I.j) {
                z4 = true;
            }
            mVar.G1(z4);
        }
        return this.I.j;
    }

    public final void k() {
        this.a.g(2, false);
        if (this.n < 1.0E-5f) {
            this.n = this.I.e;
        }
    }

    public final void l(boolean z4) {
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.h0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.h0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        l lVar = this.I;
        cropAreaView.e(currentWidth, currentHeight, (lVar == null || lVar.g % 180.0f == 0.0f) ? false : true, this.x);
        cropAreaView.setLockedAspectRatio(this.x ? 0.0f : 1.0f);
        l lVar2 = this.I;
        if (lVar2 != null) {
            l.d(lVar2, 0.0f);
            this.I.j = false;
        }
        cropAreaView.d(this.h);
        r(z4);
        this.n = 0.0f;
        m mVar = this.J;
        if (mVar != null) {
            mVar.G1(true);
            this.J.M0(false);
        }
    }

    public final boolean m(float f10) {
        if (this.I != null) {
            CropAreaView cropAreaView = this.a;
            AnimatorSet animatorSet = cropAreaView.h0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.h0 = null;
            }
            this.n = 0.0f;
            l lVar = this.I;
            float f11 = lVar.h;
            float f12 = lVar.g;
            float f13 = (((f11 + f12) - f12) + f10) % 360.0f;
            if (!this.x || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.e(getCurrentWidth(), getCurrentHeight(), (this.I.g + f13) % 180.0f != 0.0f, this.x);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            l.d(this.I, f13);
            r(false);
            e(true, false, false, false);
            m mVar = this.J;
            if (mVar != null) {
                mVar.G1(f13 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.I.j);
            }
            if (((int) this.I.h) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        int i10 = 4;
        if (this.I == null || this.F) {
            return;
        }
        this.F = true;
        String[] strArr = new String[8];
        Integer[][] numArr = {new Integer[]{3, 2}, new Integer[]{5, 3}, new Integer[]{4, 3}, new Integer[]{5, 4}, new Integer[]{7, 5}, new Integer[]{16, 9}};
        strArr[0] = LocaleController.getString(R.string.CropOriginal);
        strArr[1] = LocaleController.getString(R.string.CropSquare);
        int i11 = 2;
        for (int i12 = 0; i12 < 6; i12++) {
            Integer[] numArr2 = numArr[i12];
            if (this.a.getAspectRatio() > 1.0f) {
                strArr[i11] = String.format("%d:%d", numArr2[0], numArr2[1]);
            } else {
                strArr[i11] = String.format("%d:%d", numArr2[1], numArr2[0]);
            }
            i11++;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.f(strArr, new u1(13, this, numArr));
        d2 d2Var = alertDialog$Builder.a;
        d2Var.setCanceledOnTouchOutside(true);
        d2Var.setOnCancelListener(new wa(this, i10));
        d2Var.show();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.C) {
            CropAreaView cropAreaView = this.a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        e(true, false, true, false);
                    }
                } else if (!this.C) {
                    cropAreaView.g(3, true);
                    this.n = 0.0f;
                    m mVar = this.J;
                    if (mVar != null) {
                        mVar.G1(false);
                    }
                }
                try {
                    this.D.a(motionEvent);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void p(int i10, f fVar, MediaController.CropState cropState) {
        this.x = true;
        this.d = null;
        this.e = fVar;
        this.H = i10;
        this.w = null;
        CropAreaView cropAreaView = this.a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.I = new l(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new i(this, cropState, currentHeight, currentWidth));
    }

    public final void q() {
        int i10;
        float f10;
        if (this.e == null || this.I == null) {
            return;
        }
        CropAreaView cropAreaView = this.a;
        cropAreaView.d(this.K);
        int ceil = (int) Math.ceil(n(r2, this.L));
        int ceil2 = (int) Math.ceil(r3 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.I.k;
        float[] fArr = this.E;
        matrix.getValues(fArr);
        l lVar = this.I;
        float f11 = lVar.f * cropWidth;
        int i11 = (int) lVar.h;
        while (i11 < 0) {
            i11 += 360;
        }
        if (i11 == 90 || i11 == 270) {
            l lVar2 = this.I;
            i10 = (int) lVar2.b;
            f10 = lVar2.a;
        } else {
            l lVar3 = this.I;
            i10 = (int) lVar3.a;
            f10 = lVar3.b;
        }
        int i12 = (int) f10;
        double d = ceil;
        float f12 = i10;
        float ceil3 = (float) (d / Math.ceil(f12 * f11));
        float f13 = i12;
        float ceil4 = (float) (ceil2 / Math.ceil(f11 * f13));
        if (ceil3 > 1.0f || ceil4 > 1.0f) {
            float max = Math.max(ceil3, ceil4);
            ceil3 /= max;
            ceil4 /= max;
        }
        float f14 = ceil4;
        float f15 = ceil3;
        RectF rectF = cropAreaView.i0;
        cropAreaView.a(rectF, f12 / f13);
        float width = this.x ? rectF.width() / f12 : Math.max(rectF.width() / f12, rectF.height() / f13);
        l lVar4 = this.I;
        float f16 = lVar4.e;
        float f17 = f16 / width;
        float f18 = f16 / lVar4.f;
        float f19 = (fArr[2] / f12) / f16;
        float f20 = (fArr[5] / f13) / f16;
        float f21 = lVar4.i;
        RectF targetRectToFill = cropAreaView.getTargetRectToFill();
        float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
        float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
        f fVar = this.e;
        l lVar5 = this.I;
        boolean z4 = lVar5.j || l.c(lVar5) || this.I.g >= 1.0E-5f;
        l lVar6 = this.I;
        fVar.e(z4, f19, f20, f21, (int) lVar6.h, f17, f18, lVar6.f / width, f15, f14, cropCenterX, cropCenterY, lVar6.j);
    }

    public final void r(boolean z4) {
        if (this.I == null) {
            return;
        }
        Matrix matrix = this.c;
        matrix.reset();
        l lVar = this.I;
        float f10 = lVar.g;
        if (f10 == 90.0f || f10 == 270.0f) {
            matrix.postTranslate((-lVar.b) / 2.0f, (-lVar.a) / 2.0f);
        } else {
            matrix.postTranslate((-lVar.a) / 2.0f, (-lVar.b) / 2.0f);
        }
        matrix.postRotate((int) this.I.h);
        matrix.postConcat(this.I.k);
        CropAreaView cropAreaView = this.a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.x || this.G || z4) {
            q();
            this.J.r0();
        }
        invalidate();
    }

    public void setAspectRatio(float f10) {
        this.a.setActualRect(f10);
    }

    public void setBottomPadding(float f10) {
        this.y = f10;
        this.a.setBottomPadding(f10);
    }

    public void setFreeform(boolean z4) {
        this.a.setFreeform(z4);
        this.x = z4;
    }

    public void setListener(m mVar) {
        this.J = mVar;
    }

    @Override // android.view.View
    public void setRotation(float f10) {
        l lVar = this.I;
        l.e(lVar, f10 - lVar.i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.a.setSubtitle(str);
    }

    public void setTopPadding(float f10) {
        this.B = f10;
        this.a.setTopPadding(f10);
    }
}
