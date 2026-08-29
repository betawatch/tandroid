package wf;

import ag.y1;
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
import j7.l1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import nh.zb;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.p60;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class n extends FrameLayout implements a {
    public float A;
    public boolean B;
    public final b C;
    public final float[] D;
    public boolean E;
    public boolean F;
    public int G;
    public l H;
    public m I;
    public final RectF J;
    public final RectF K;
    public final CropAreaView a;
    public final ImageView b;
    public final Matrix c;
    public l61 d;
    public f e;
    public final RectF f;
    public final RectF h;
    public float n;
    public final boolean r;
    public final vd.d s;
    public final Matrix v;
    public Bitmap w;
    public boolean x;
    public float y;

    public n(Context context) {
        super(context);
        this.D = new float[9];
        this.J = new RectF();
        this.K = new RectF(0.0f, 0.0f, 1280.0f, 1280.0f);
        boolean z10 = context instanceof BubbleActivity;
        this.r = z10;
        this.f = new RectF();
        this.h = new RectF();
        this.c = new Matrix();
        vd.d dVar = new vd.d();
        dVar.a = new float[8];
        this.s = dVar;
        this.v = new Matrix();
        this.B = false;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        addView(imageView);
        b bVar = new b(context);
        this.C = bVar;
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
        cropAreaView.G = -1.0f;
        cropAreaView.H = 1.0f;
        cropAreaView.I = -1.0f;
        cropAreaView.Q = new AccelerateDecelerateInterpolator();
        cropAreaView.b0 = true;
        cropAreaView.h0 = new RectF();
        cropAreaView.j0 = 0.0f;
        cropAreaView.k0 = 1.0f;
        cropAreaView.l0 = 0.0f;
        cropAreaView.m0 = 0.0f;
        cropAreaView.T = z10;
        cropAreaView.F = true;
        cropAreaView.E = true;
        cropAreaView.R = AndroidUtilities.dp(16.0f);
        cropAreaView.S = AndroidUtilities.dp(32.0f);
        cropAreaView.p0 = 1;
        Paint paint = new Paint();
        cropAreaView.K = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        cropAreaView.L = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint paint3 = new Paint();
        cropAreaView.M = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        Paint paint4 = new Paint();
        cropAreaView.N = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        Paint paint5 = new Paint();
        cropAreaView.O = paint5;
        paint5.setStyle(style);
        paint5.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        cropAreaView.d0 = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        cropAreaView.P = paint7;
        paint7.setColor(-1);
        cropAreaView.setWillNotDraw(false);
        this.a = cropAreaView;
        cropAreaView.setListener(this);
        addView(cropAreaView);
    }

    public static void a(n nVar, Integer[][] numArr, int i10) {
        nVar.E = false;
        if (i10 == 0) {
            l lVar = nVar.H;
            float f9 = lVar.g % 180.0f;
            nVar.setLockedAspectRatio((f9 != 0.0f ? lVar.b : lVar.a) / (f9 != 0.0f ? lVar.a : lVar.b));
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
    public static void c(String str, Canvas canvas, Bitmap bitmap, Matrix matrix, int i10, int i11, float f9, float f10, float f11, float f12, ArrayList arrayList) {
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
            matrix2.postRotate(f11);
            matrix2.postConcat(matrix);
            matrix2.postScale(f12, f12);
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
                    if (f11 != 90.0f) {
                        if (f11 == 270.0f) {
                        }
                        if (mediaEntity.type != 1) {
                            mediaEntity.width = ((mediaEntity.width * i12) / bitmap.getWidth()) * f12 * f9;
                            mediaEntity.height = ((mediaEntity.height * i13) / bitmap.getHeight()) * f12 * f9;
                            c3 = 1;
                        } else {
                            c3 = 1;
                            float f13 = i12;
                            float f14 = width;
                            mediaEntity.viewWidth = (int) ((mediaEntity.viewWidth / f13) * f14);
                            float f15 = i13;
                            float f16 = height;
                            mediaEntity.viewHeight = (int) ((mediaEntity.viewHeight / f15) * f16);
                            mediaEntity.width = ((mediaEntity.width * f13) / f14) * f12 * f9;
                            mediaEntity.height = ((mediaEntity.height * f15) / f16) * f12 * f9;
                        }
                        mediaEntity.x = (fArr[0] / bitmap.getWidth()) - (mediaEntity.width / 2.0f);
                        mediaEntity.y = (fArr[c3] / bitmap.getHeight()) - (mediaEntity.height / 2.0f);
                        mediaEntity.textViewX = fArr[2] / bitmap.getWidth();
                        mediaEntity.textViewY = fArr[3] / bitmap.getHeight();
                        mediaEntity.rotation = (float) (mediaEntity.rotation - ((f10 + f11) * 0.017453292519943295d));
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
                    mediaEntity.rotation = (float) (mediaEntity.rotation - ((f10 + f11) * 0.017453292519943295d));
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

    public static float f(RectF rectF, float f9, float f10) {
        float width = rectF.width() * f10;
        float height = rectF.height() * f10;
        float width2 = (rectF.width() - width) / 2.0f;
        float height2 = (rectF.height() - height) / 2.0f;
        float f11 = rectF.left + width2;
        float f12 = rectF.top + height2;
        rectF.set(f11, f12, width + f11, height + f12);
        return f9 * f10;
    }

    public static void g(RectF rectF, RectF rectF2, PointF pointF, float f9) {
        float f10 = rectF2.left;
        float f11 = rectF2.top;
        float f12 = rectF2.right;
        float f13 = rectF2.bottom;
        float f14 = rectF.left;
        if (f14 > f10) {
            f12 += f14 - f10;
            f10 = f14;
        }
        float f15 = rectF.top;
        if (f15 > f11) {
            f13 += f15 - f11;
            f11 = f15;
        }
        float f16 = rectF.right;
        if (f16 < f12) {
            f10 += f16 - f12;
        }
        float f17 = rectF.bottom;
        if (f17 < f13) {
            f11 += f17 - f13;
        }
        float centerX = rectF2.centerX() - ((rectF2.width() / 2.0f) + f10);
        float centerY = rectF2.centerY() - ((rectF2.height() / 2.0f) + f11);
        double d = f9;
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
        } catch (Exception e10) {
            FileLog.e(e10);
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

    private void setLockedAspectRatio(float f9) {
        CropAreaView cropAreaView = this.a;
        cropAreaView.setLockedAspectRatio(f9);
        RectF rectF = new RectF();
        cropAreaView.a(rectF, f9);
        d(rectF);
        m mVar = this.I;
        if (mVar != null) {
            mVar.P(false);
            this.I.C(true);
        }
    }

    public final void b(MediaController.CropState cropState) {
        int i10;
        int i11;
        float f9;
        CropAreaView cropAreaView = this.a;
        cropAreaView.d(this.J);
        int ceil = (int) Math.ceil(n(r1, this.K));
        int ceil2 = (int) Math.ceil(r2 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.H.k;
        float[] fArr = this.D;
        matrix.getValues(fArr);
        l lVar = this.H;
        float f10 = lVar.f * cropWidth;
        cropState.transformRotation = (int) lVar.h;
        if (BuildVars.LOGS_ENABLED) {
            l1.t(cropState.transformRotation, new StringBuilder("set transformRotation = "));
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
            l lVar2 = this.H;
            i11 = (int) lVar2.b;
            f9 = lVar2.a;
        } else {
            l lVar3 = this.H;
            i11 = (int) lVar3.a;
            f9 = lVar3.b;
        }
        int i12 = (int) f9;
        float f11 = i11;
        cropState.cropPw = (float) (ceil / Math.ceil(f11 * f10));
        float f12 = i12;
        float ceil3 = (float) (ceil2 / Math.ceil(f10 * f12));
        cropState.cropPh = ceil3;
        float f13 = cropState.cropPw;
        if (f13 > 1.0f || ceil3 > 1.0f) {
            float max = Math.max(f13, ceil3);
            cropState.cropPw /= max;
            cropState.cropPh /= max;
        }
        cropState.cropScale = Math.min(f11 / cropAreaView.getCropWidth(), f12 / cropAreaView.getCropHeight()) * this.H.e;
        float f14 = fArr[2] / f11;
        l lVar4 = this.H;
        float f15 = lVar4.e;
        cropState.cropPx = f14 / f15;
        cropState.cropPy = (fArr[5] / f12) / f15;
        cropState.cropRotate = lVar4.i;
        cropState.stateScale = f15;
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
        boolean z10;
        if (this.H == null) {
            return;
        }
        float[] fArr = {1.0f};
        float width = rectF.width();
        CropAreaView cropAreaView = this.a;
        float max = Math.max(width / cropAreaView.getCropWidth(), rectF.height() / cropAreaView.getCropHeight());
        float f9 = this.H.e;
        if (f9 * max > 30.0f) {
            max = 30.0f / f9;
            z10 = true;
        } else {
            z10 = false;
        }
        float f10 = max;
        int i10 = !this.r ? AndroidUtilities.statusBarHeight : 0;
        float centerX = rectF.centerX();
        ImageView imageView = this.b;
        float a2 = l.a(this.H) * ((centerX - (imageView.getWidth() / 2)) / cropAreaView.getCropWidth());
        float b10 = l.b(this.H) * ((rectF.centerY() - ((((imageView.getHeight() - this.y) + i10) + this.A) / 2.0f)) / cropAreaView.getCropHeight());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new g(this, f10, fArr, a2, b10, 0));
        ofFloat.addListener(new p60(17, this, z10));
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = cropAreaView.Q;
        AnimatorSet animatorSet = cropAreaView.g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.g0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        cropAreaView.g0 = animatorSet2;
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
        animatorSet2.addListener(new ok0(23, cropAreaView, rectF));
        animatorSet2.start();
        this.h.set(rectF);
    }

    public final void e(boolean z10, boolean z11, boolean z12, boolean z13) {
        float f9;
        if (this.H == null) {
            return;
        }
        CropAreaView cropAreaView = this.a;
        float cropWidth = cropAreaView.getCropWidth();
        float cropHeight = cropAreaView.getCropHeight();
        float a2 = l.a(this.H);
        float b10 = l.b(this.H);
        float f10 = this.H.i;
        float radians = (float) Math.toRadians(f10);
        RectF rectF = new RectF(0.0f, 0.0f, cropWidth, cropHeight);
        Matrix matrix = new Matrix();
        matrix.postRotate(f10, cropWidth / 2.0f, cropHeight / 2.0f);
        matrix.mapRect(rectF);
        RectF rectF2 = new RectF(0.0f, 0.0f, a2, b10);
        float f11 = (cropWidth - a2) / 2.0f;
        l lVar = this.H;
        float f12 = lVar.e;
        vd.d dVar = this.s;
        float[] fArr = (float[]) dVar.a;
        float[] fArr2 = (float[]) dVar.a;
        float f13 = rectF2.left;
        fArr[0] = f13;
        float f14 = rectF2.top;
        fArr[1] = f14;
        float f15 = rectF2.right;
        fArr[2] = f15;
        fArr[3] = f14;
        fArr[4] = f15;
        float f16 = rectF2.bottom;
        fArr[5] = f16;
        fArr[6] = f13;
        fArr[7] = f16;
        Matrix matrix2 = new Matrix();
        matrix2.set(lVar.k);
        matrix2.preTranslate(f11 / f12, ((cropHeight - b10) / 2.0f) / f12);
        Matrix matrix3 = this.v;
        matrix3.reset();
        matrix3.setTranslate(rectF2.centerX(), rectF2.centerY());
        matrix3.setConcat(matrix3, matrix2);
        matrix3.preTranslate(-rectF2.centerX(), -rectF2.centerY());
        matrix3.mapPoints(fArr2);
        matrix3.reset();
        matrix3.preRotate(-f10, a2 / 2.0f, b10 / 2.0f);
        matrix3.mapPoints(fArr2);
        rectF2.set(fArr2[0], fArr2[1], fArr2[2], fArr2[7]);
        l lVar2 = this.H;
        PointF pointF = new PointF(lVar2.c, lVar2.d);
        if (!rectF2.contains(rectF)) {
            f9 = (!z10 || (rectF.width() <= rectF2.width() && rectF.height() <= rectF2.height())) ? f12 : f(rectF2, f12, rectF.width() / n(rectF, rectF2));
            g(rectF2, rectF, pointF, radians);
        } else if (!z11 || this.n <= 0.0f) {
            f9 = f12;
        } else {
            float width = rectF.width() / n(rectF, rectF2);
            if (this.H.e * width < this.n) {
                width = 1.0f;
            }
            f9 = f(rectF2, f12, width);
            g(rectF2, rectF, pointF, radians);
        }
        float f17 = pointF.x;
        l lVar3 = this.H;
        float f18 = f17 - lVar3.c;
        float f19 = pointF.y - lVar3.d;
        if (!z12) {
            l.f(lVar3, f18, f19);
            l.g(this.H, f9 / f12, 0.0f, 0.0f);
            r(false);
            return;
        }
        float f20 = f9 / f12;
        if (Math.abs(f20 - 1.0f) >= 1.0E-5f || Math.abs(f18) >= 1.0E-5f || Math.abs(f19) >= 1.0E-5f) {
            this.B = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new g(this, f18, new float[]{1.0f, 0.0f, 0.0f}, f19, f20, 1));
            ofFloat.addListener(new k(this, z13, z10, z11, z12));
            ofFloat.setInterpolator(cropAreaView.getInterpolator());
            ofFloat.setDuration(z13 ? 100L : 200L);
            ofFloat.start();
        }
    }

    public RectF getActualRect() {
        CropAreaView cropAreaView = this.a;
        RectF rectF = this.J;
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
        l61 l61Var = this.d;
        if (l61Var != null) {
            return l61Var.getVideoHeight();
        }
        Bitmap bitmap = this.w;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.G;
        return (i10 == 90 || i10 == 270) ? bitmap.getWidth() : bitmap.getHeight();
    }

    public int getCurrentWidth() {
        l61 l61Var = this.d;
        if (l61Var != null) {
            return l61Var.getVideoWidth();
        }
        Bitmap bitmap = this.w;
        if (bitmap == null) {
            return 1;
        }
        int i10 = this.G;
        return (i10 == 90 || i10 == 270) ? bitmap.getHeight() : bitmap.getWidth();
    }

    public float getStateFullOrientation() {
        l lVar = this.H;
        if (lVar == null) {
            return 0.0f;
        }
        return lVar.g + lVar.h;
    }

    public boolean getStateMirror() {
        l lVar = this.H;
        return lVar != null && lVar.j;
    }

    public float getStateOrientation() {
        l lVar = this.H;
        if (lVar == null) {
            return 0.0f;
        }
        return lVar.h;
    }

    public final void i() {
        float currentWidth;
        int currentHeight;
        l lVar = this.H;
        if (lVar == null) {
            return;
        }
        final float f9 = lVar.f;
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.g0 = null;
        }
        l lVar2 = this.H;
        if ((lVar2.h + lVar2.g) % 180.0f != 0.0f) {
            currentWidth = getCurrentHeight();
            currentHeight = getCurrentWidth();
        } else {
            currentWidth = getCurrentWidth();
            currentHeight = getCurrentHeight();
        }
        float f10 = currentWidth / currentHeight;
        if (!this.x) {
            f10 = 1.0f;
        }
        cropAreaView.a(this.h, f10);
        cropAreaView.setLockedAspectRatio(this.x ? 0.0f : 1.0f);
        this.n = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final RectF rectF = new RectF();
        final RectF rectF2 = new RectF();
        rectF.set(cropAreaView.x);
        l lVar3 = this.H;
        final float f11 = lVar3.c;
        final float f12 = lVar3.d;
        final float f13 = lVar3.e;
        final float f14 = lVar3.i;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: wf.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n nVar = n.this;
                if (nVar.H == null) {
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                RectF rectF3 = nVar.h;
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                AndroidUtilities.lerp(rectF4, rectF3, floatValue, rectF5);
                nVar.a.setActualRect(rectF5);
                l lVar4 = nVar.H;
                float f15 = 1.0f - floatValue;
                float f16 = lVar4.c - (f11 * f15);
                float f17 = lVar4.d - (f12 * f15);
                float f18 = lVar4.i - (f14 * f15);
                float lerp = AndroidUtilities.lerp(f13, f9, floatValue);
                l lVar5 = nVar.H;
                float f19 = lerp / lVar5.e;
                l.f(lVar5, -f16, -f17);
                l.g(nVar.H, f19, 0.0f, 0.0f);
                l.e(nVar.H, -f18);
                nVar.e(true, false, false, false);
            }
        });
        ofFloat.setInterpolator(cropAreaView.getInterpolator());
        ofFloat.setDuration(250L);
        ofFloat.start();
    }

    public final boolean j() {
        l lVar = this.H;
        boolean z10 = false;
        if (lVar == null) {
            return false;
        }
        lVar.j = !lVar.j;
        r(false);
        m mVar = this.I;
        if (mVar != null) {
            l lVar2 = this.H;
            float f9 = lVar2.h;
            float f10 = lVar2.g;
            float f11 = ((f9 + f10) - f10) % 360.0f;
            if (!l.c(lVar2) && f11 == 0.0f && this.a.getLockAspectRatio() == 0.0f && !this.H.j) {
                z10 = true;
            }
            mVar.P(z10);
        }
        return this.H.j;
    }

    public final void k() {
        this.a.g(2, false);
        if (this.n < 1.0E-5f) {
            this.n = this.H.e;
        }
    }

    public final void l(boolean z10) {
        CropAreaView cropAreaView = this.a;
        AnimatorSet animatorSet = cropAreaView.g0;
        if (animatorSet != null) {
            animatorSet.cancel();
            cropAreaView.g0 = null;
        }
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        l lVar = this.H;
        cropAreaView.e(currentWidth, currentHeight, (lVar == null || lVar.g % 180.0f == 0.0f) ? false : true, this.x);
        cropAreaView.setLockedAspectRatio(this.x ? 0.0f : 1.0f);
        l lVar2 = this.H;
        if (lVar2 != null) {
            l.d(lVar2, 0.0f);
            this.H.j = false;
        }
        cropAreaView.d(this.h);
        r(z10);
        this.n = 0.0f;
        m mVar = this.I;
        if (mVar != null) {
            mVar.P(true);
            this.I.C(false);
        }
    }

    public final boolean m(float f9) {
        if (this.H != null) {
            CropAreaView cropAreaView = this.a;
            AnimatorSet animatorSet = cropAreaView.g0;
            if (animatorSet != null) {
                animatorSet.cancel();
                cropAreaView.g0 = null;
            }
            this.n = 0.0f;
            l lVar = this.H;
            float f10 = lVar.h;
            float f11 = lVar.g;
            float f12 = (((f10 + f11) - f11) + f9) % 360.0f;
            if (!this.x || cropAreaView.getLockAspectRatio() <= 0.0f) {
                cropAreaView.e(getCurrentWidth(), getCurrentHeight(), (this.H.g + f12) % 180.0f != 0.0f, this.x);
            } else {
                cropAreaView.setLockedAspectRatio(1.0f / cropAreaView.getLockAspectRatio());
                cropAreaView.setActualRect(cropAreaView.getLockAspectRatio());
            }
            l.d(this.H, f12);
            r(false);
            e(true, false, false, false);
            m mVar = this.I;
            if (mVar != null) {
                mVar.P(f12 == 0.0f && cropAreaView.getLockAspectRatio() == 0.0f && !this.H.j);
            }
            if (((int) this.H.h) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        int i10 = 4;
        if (this.H == null || this.E) {
            return;
        }
        this.E = true;
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
        alertDialog$Builder.f(strArr, new y1(13, this, numArr));
        c2 c2Var = alertDialog$Builder.a;
        c2Var.setCanceledOnTouchOutside(true);
        c2Var.setOnCancelListener(new zb(this, i10));
        c2Var.show();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.B) {
            CropAreaView cropAreaView = this.a;
            if (!cropAreaView.onTouchEvent(motionEvent)) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3) {
                        cropAreaView.g(1, true);
                        e(true, false, true, false);
                    }
                } else if (!this.B) {
                    cropAreaView.g(3, true);
                    this.n = 0.0f;
                    m mVar = this.I;
                    if (mVar != null) {
                        mVar.P(false);
                    }
                }
                try {
                    this.C.a(motionEvent);
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
        this.G = i10;
        this.w = null;
        CropAreaView cropAreaView = this.a;
        cropAreaView.setIsVideo(false);
        int currentWidth = getCurrentWidth();
        int currentHeight = getCurrentHeight();
        this.H = new l(this, currentWidth, currentHeight);
        cropAreaView.getViewTreeObserver().addOnPreDrawListener(new i(this, cropState, currentHeight, currentWidth));
    }

    public final void q() {
        int i10;
        float f9;
        if (this.e == null || this.H == null) {
            return;
        }
        CropAreaView cropAreaView = this.a;
        cropAreaView.d(this.J);
        int ceil = (int) Math.ceil(n(r2, this.K));
        int ceil2 = (int) Math.ceil(r3 / cropAreaView.getAspectRatio());
        float cropWidth = ceil / cropAreaView.getCropWidth();
        Matrix matrix = this.H.k;
        float[] fArr = this.D;
        matrix.getValues(fArr);
        l lVar = this.H;
        float f10 = lVar.f * cropWidth;
        int i11 = (int) lVar.h;
        while (i11 < 0) {
            i11 += 360;
        }
        if (i11 == 90 || i11 == 270) {
            l lVar2 = this.H;
            i10 = (int) lVar2.b;
            f9 = lVar2.a;
        } else {
            l lVar3 = this.H;
            i10 = (int) lVar3.a;
            f9 = lVar3.b;
        }
        int i12 = (int) f9;
        double d = ceil;
        float f11 = i10;
        float ceil3 = (float) (d / Math.ceil(f11 * f10));
        float f12 = i12;
        float ceil4 = (float) (ceil2 / Math.ceil(f10 * f12));
        if (ceil3 > 1.0f || ceil4 > 1.0f) {
            float max = Math.max(ceil3, ceil4);
            ceil3 /= max;
            ceil4 /= max;
        }
        float f13 = ceil4;
        float f14 = ceil3;
        RectF rectF = cropAreaView.h0;
        cropAreaView.a(rectF, f11 / f12);
        float width = this.x ? rectF.width() / f11 : Math.max(rectF.width() / f11, rectF.height() / f12);
        l lVar4 = this.H;
        float f15 = lVar4.e;
        float f16 = f15 / width;
        float f17 = f15 / lVar4.f;
        float f18 = (fArr[2] / f11) / f15;
        float f19 = (fArr[5] / f12) / f15;
        float f20 = lVar4.i;
        RectF targetRectToFill = cropAreaView.getTargetRectToFill();
        float cropCenterX = cropAreaView.getCropCenterX() - targetRectToFill.centerX();
        float cropCenterY = cropAreaView.getCropCenterY() - targetRectToFill.centerY();
        f fVar = this.e;
        l lVar5 = this.H;
        boolean z10 = lVar5.j || l.c(lVar5) || this.H.g >= 1.0E-5f;
        l lVar6 = this.H;
        fVar.e(z10, f18, f19, f20, (int) lVar6.h, f16, f17, lVar6.f / width, f14, f13, cropCenterX, cropCenterY, lVar6.j);
    }

    public final void r(boolean z10) {
        if (this.H == null) {
            return;
        }
        Matrix matrix = this.c;
        matrix.reset();
        l lVar = this.H;
        float f9 = lVar.g;
        if (f9 == 90.0f || f9 == 270.0f) {
            matrix.postTranslate((-lVar.b) / 2.0f, (-lVar.a) / 2.0f);
        } else {
            matrix.postTranslate((-lVar.a) / 2.0f, (-lVar.b) / 2.0f);
        }
        matrix.postRotate((int) this.H.h);
        matrix.postConcat(this.H.k);
        CropAreaView cropAreaView = this.a;
        matrix.postTranslate(cropAreaView.getCropCenterX(), cropAreaView.getCropCenterY());
        if (!this.x || this.F || z10) {
            q();
            this.I.u();
        }
        invalidate();
    }

    public void setAspectRatio(float f9) {
        this.a.setActualRect(f9);
    }

    public void setBottomPadding(float f9) {
        this.y = f9;
        this.a.setBottomPadding(f9);
    }

    public void setFreeform(boolean z10) {
        this.a.setFreeform(z10);
        this.x = z10;
    }

    public void setListener(m mVar) {
        this.I = mVar;
    }

    @Override // android.view.View
    public void setRotation(float f9) {
        l lVar = this.H;
        l.e(lVar, f9 - lVar.i);
        e(true, true, false, false);
    }

    public void setSubtitle(String str) {
        this.a.setSubtitle(str);
    }

    public void setTopPadding(float f9) {
        this.A = f9;
        this.a.setTopPadding(f9);
    }
}
