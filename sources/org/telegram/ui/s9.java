package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class s9 extends org.telegram.ui.ActionBar.o2 {
    public final PointF[] A;
    public final PointF[] B;
    public final PointF[] C;
    public final PointF[] D;
    public final RectF E;
    public final RectF F;
    public long G;
    public r9 H;
    public boolean I;
    public long J;
    public int K;
    public int L;
    public String M;
    public final int N;
    public boolean O;
    public m5.c0 P;
    public b8.n Q;
    public final int R;
    public ValueAnimator S;
    public float T;
    public float U;
    public o1.j V;
    public float W;
    public RectF X;
    public final v5 Y;
    public float Z;
    public q9 a;
    public long a0;
    public TextView b;
    public CameraView c;
    public final HandlerThread d;
    public Handler e;
    public TextView f;
    public final Paint h;
    public final Paint n;
    public ImageView r;
    public AnimatorSet s;
    public float v;
    public boolean w;
    public o1.j x;
    public float y;

    public s9(int i9) {
        super(null);
        this.d = new HandlerThread("ScanCamera");
        this.h = new Paint();
        this.n = new Paint(1);
        new Path();
        this.v = 0.5f;
        this.w = false;
        this.x = null;
        this.y = 0.0f;
        this.A = new PointF[4];
        this.B = new PointF[4];
        this.C = new PointF[4];
        this.D = new PointF[4];
        for (int i10 = 0; i10 < 4; i10++) {
            this.A[i10] = new PointF(-1.0f, -1.0f);
            this.B[i10] = new PointF(-1.0f, -1.0f);
            this.C[i10] = new PointF(-1.0f, -1.0f);
            this.D[i10] = new PointF(-1.0f, -1.0f);
        }
        this.E = new RectF();
        this.F = new RectF();
        this.G = 0L;
        this.K = 0;
        this.L = 0;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.T = 0.0f;
        this.U = 0.0f;
        this.W = 0.0f;
        this.Y = new v5(this, 1);
        this.Z = 0.0f;
        this.a0 = 0L;
        this.R = i9;
        if (Z()) {
            Utilities.globalQueue.postRunnable(new j9(this, 5));
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.N = 8;
        } else if (devicePerformanceClass != 1) {
            this.N = 40;
        } else {
            this.N = 24;
        }
    }

    public static Bitmap Y(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.set(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        colorMatrix2.preConcat(colorMatrix);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static Bitmap a0(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f10 = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f10, 85.0f, 85.0f, 85.0f, 0.0f, f10, 85.0f, 85.0f, 85.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void c0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static o9 d0(Activity activity, int i9, r9 r9Var) {
        if (activity == null) {
            return null;
        }
        o9 o9Var = new o9(activity, new org.telegram.ui.ActionBar.b5[]{new ActionBarLayout(activity, false)}, i9, r9Var);
        o9Var.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar((Dialog) o9Var, false);
        AndroidUtilities.setNavigationBarColor((Dialog) o9Var, -16777216, false);
        o9Var.setUseLightStatusBar(false);
        o9Var.getWindow().addFlags(512);
        o9Var.show();
        return o9Var;
    }

    public static PointF[] e0(Point[] pointArr, int i9, int i10) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i11 = 0; i11 < pointArr.length; i11++) {
            Point point = pointArr[i11];
            pointFArr[i11] = new PointF(point.x / i9, point.y / i10);
        }
        return pointFArr;
    }

    public final void X() {
        TextView textView;
        if (this.fragmentView == null || !CameraView.isCameraAllowed()) {
            return;
        }
        CameraController.getInstance().initCamera(null);
        CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
        this.c = cameraView;
        cameraView.setUseMaxPreview(true);
        this.c.setOptimizeForBarcode(true);
        this.c.setDelegate(new b1(this, 11));
        ((ViewGroup) this.fragmentView).addView(this.c, 0, g7.e6.c(-1.0f, -1));
        if (this.R != 0 || (textView = this.f) == null) {
            return;
        }
        this.c.addView(textView);
    }

    public final boolean Z() {
        int i9 = this.R;
        return i9 == 1 || i9 == 2 || i9 == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(Bitmap bitmap) {
        s9 s9Var;
        v5 v5Var = this.Y;
        if (this.c == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Size previewSize = this.c.getPreviewSize();
            int i9 = this.R;
            if (i9 == 0) {
                MrzRecognizer.Result recognize = MrzRecognizer.recognize(bitmap, false);
                if (recognize != null) {
                    if (!TextUtils.isEmpty(recognize.firstName)) {
                        if (!TextUtils.isEmpty(recognize.lastName)) {
                            if (!TextUtils.isEmpty(recognize.number)) {
                                if (recognize.birthDay != 0) {
                                    if (recognize.expiryDay == 0) {
                                        if (recognize.doesNotExpire) {
                                        }
                                    }
                                    if (recognize.gender != 0) {
                                        this.I = true;
                                        CameraController.getInstance().stopPreview(this.c.getCameraSession());
                                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(19, this, recognize));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                s9Var = this;
            } else {
                int min = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                s9Var = this;
                try {
                    j4.c f02 = s9Var.f0(previewSize, (previewSize.getWidth() - min) / 2, (previewSize.getHeight() - min) / 2, min, bitmap);
                    boolean z10 = s9Var.I;
                    if (z10) {
                        s9Var.L++;
                    }
                    if (f02 != null) {
                        s9Var.K = 0;
                        String str = (String) f02.b;
                        s9Var.M = str;
                        if (!z10) {
                            s9Var.I = true;
                            s9Var.O = s9Var.H.i1(str, new j9(this, 7));
                            s9Var.J = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new j9(this, 8));
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(20, this, f02));
                    } else if (z10) {
                        int i10 = s9Var.K + 1;
                        s9Var.K = i10;
                        if (i10 > 4 && !s9Var.O) {
                            s9Var.I = false;
                            s9Var.L = 0;
                            s9Var.M = null;
                            AndroidUtilities.runOnUIThread(new j9(this, 8));
                            AndroidUtilities.runOnUIThread(v5Var, 500L);
                            return;
                        }
                    }
                    if (((s9Var.L == 0 && f02 != null && ((RectF) f02.c) == null && !s9Var.O) || (SystemClock.elapsedRealtime() - s9Var.J > 1000 && !s9Var.O)) && s9Var.M != null) {
                        CameraView cameraView = s9Var.c;
                        if (cameraView != null && cameraView.getCameraSession() != null && i9 != 3) {
                            CameraController.getInstance().stopPreview(s9Var.c.getCameraSession());
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(18, this, s9Var.M));
                        if (i9 == 3) {
                            AndroidUtilities.runOnUIThread(new j9(this, 1));
                        }
                    } else if (s9Var.I) {
                        s9Var.e.postDelayed(new j9(this, 2), Math.max(16L, (MediaDataController.MAX_STYLE_RUNS_COUNT / s9Var.N) - ((long) s9Var.Z)));
                    }
                } catch (Throwable unused) {
                    AndroidUtilities.runOnUIThread(new j9(this, 6));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    float f10 = s9Var.Z;
                    long j10 = s9Var.a0;
                    float f11 = (f10 * j10) + elapsedRealtime2;
                    long j11 = j10 + 1;
                    s9Var.a0 = j11;
                    s9Var.Z = f11 / j11;
                    s9Var.a0 = Math.max(j11, 30L);
                    if (s9Var.I) {
                    }
                }
            }
        } catch (Throwable unused2) {
            s9Var = this;
        }
        long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime;
        float f102 = s9Var.Z;
        long j102 = s9Var.a0;
        float f112 = (f102 * j102) + elapsedRealtime22;
        long j112 = j102 + 1;
        s9Var.a0 = j112;
        s9Var.Z = f112 / j112;
        s9Var.a0 = Math.max(j112, 30L);
        if (s9Var.I) {
            AndroidUtilities.runOnUIThread(v5Var, 500L);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.w) {
            this.actionBar.C(-1, false);
            this.actionBar.A(-1, false);
            this.actionBar.setTitleColor(-1);
        } else {
            this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.z6, false), false);
            this.actionBar.A(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !Z()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.E && kVar.v == null) {
                View view = new View(kVar.getContext());
                kVar.v = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.x8, kVar.E0));
                kVar.addView(kVar.v);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.v.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.v.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 20));
        this.h.setColor(2130706432);
        Paint paint = this.n;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        p9 p9Var = new p9(this, context);
        p9Var.setOnTouchListener(new jh.d(2));
        this.fragmentView = p9Var;
        if (Z()) {
            this.fragmentView.postDelayed(new j9(this, 0), 450L);
        } else {
            X();
        }
        int i9 = this.R;
        if (i9 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.f6.d6;
            kVar2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.C(-1, false);
            this.actionBar.A(587202559, false);
            p9Var.setBackgroundColor(-16777216);
            p9Var.addView(this.actionBar);
        }
        if (i9 == 2 || i9 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.f80.c());
        paint2.setColor(i0.a.k(-1, 40));
        q9 q9Var = new q9(context, paint2);
        this.a = q9Var;
        q9Var.setGravity(1);
        this.a.setTextSize(1, 24.0f);
        p9Var.addView(this.a);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D6, false));
        this.b.setGravity(1);
        this.b.setTextSize(1, 16.0f);
        p9Var.addView(this.b);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextColor(-1);
        this.f.setGravity(81);
        this.f.setAlpha(0.0f);
        if (i9 == 0) {
            this.a.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.b.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.a.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
            this.f.setTypeface(Typeface.MONOSPACE);
        } else {
            if (i9 == 1 || i9 == 3) {
                this.a.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AuthAnotherClientInfo5));
                String[] strArr = {LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), LocaleController.getString(R.string.AuthAnotherWebClientUrl)};
                int i11 = 0;
                for (int i12 = 2; i11 < i12; i12 = 2) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    int indexOf = spannableStringBuilder2.indexOf(42);
                    int i13 = indexOf + 1;
                    int indexOf2 = spannableStringBuilder2.indexOf(42, i13);
                    if (indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2) {
                        break;
                    }
                    this.a.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i13, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.p41(strArr[i11], 0), i13, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), i13, indexOf2, 33);
                    i11++;
                }
                this.a.setLinkTextColor(-1);
                this.a.setTextSize(1, 16.0f);
                this.a.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.a.setPadding(0, 0, 0, 0);
                this.a.setText(spannableStringBuilder);
            }
            this.a.setTextColor(-1);
            if (i9 == 3) {
                this.b.setTextColor(-1711276033);
            }
            this.f.setTextSize(1, 16.0f);
            this.f.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            this.f.setText(LocaleController.getString(R.string.AuthAnotherClientNotFound));
            p9Var.addView(this.f);
            ImageView imageView = new ImageView(context);
            this.r = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.r.setImageResource(R.drawable.qr_flashlight);
            this.r.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(60.0f), 587202559));
            p9Var.addView(this.r);
            this.r.setOnClickListener(new a(this, 11));
        }
        AndroidUtilities.lockOrientation(getParentActivity(), 1);
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.graphics.PointF[]] */
    public final j4.c f0(Size size, int i9, int i10, int i11, Bitmap bitmap) {
        j4.c cVar;
        j4.c cVar2;
        int i12;
        String str;
        PointF[] pointFArr;
        int i13;
        kb.d dVar;
        ?? r52;
        a5.m mVar;
        PointF[] pointFArr2;
        PointF[] pointFArr3;
        j4.c cVar3 = null;
        try {
            RectF rectF = new RectF();
            b8.n nVar = this.Q;
            float f10 = Float.MIN_VALUE;
            float f11 = Float.MAX_VALUE;
            int i14 = 0;
            if (nVar != null && nVar.b.k()) {
                if (bitmap != null) {
                    mVar = new a5.m(1);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    mVar.d = bitmap;
                    a8.b bVar = (a8.b) mVar.b;
                    bVar.a = width;
                    bVar.b = height;
                    i12 = bitmap.getWidth();
                    i13 = bitmap.getHeight();
                } else {
                    mVar = new a5.m(1);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap == null) {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                    if (wrap.capacity() < width2 * height2) {
                        throw new IllegalArgumentException("Invalid image data size.");
                    }
                    mVar.c = wrap;
                    a8.b bVar2 = (a8.b) mVar.b;
                    bVar2.a = width2;
                    bVar2.b = height2;
                    i12 = size.getWidth();
                    i13 = size.getWidth();
                }
                SparseArray Q = this.Q.Q(mVar);
                if (Q.size() > 0) {
                    b8.m mVar2 = (b8.m) Q.valueAt(0);
                    str = mVar2.b;
                    Point[] pointArr = mVar2.e;
                    PointF[] e02 = e0(pointArr, i12, i13);
                    pointFArr3 = e02;
                    if (pointArr.length != 0) {
                        int length = pointArr.length;
                        float f12 = Float.MIN_VALUE;
                        float f13 = Float.MAX_VALUE;
                        while (i14 < length) {
                            Point point = pointArr[i14];
                            f11 = Math.min(f11, point.x);
                            f10 = Math.max(f10, point.x);
                            f13 = Math.min(f13, point.y);
                            f12 = Math.max(f12, point.y);
                            i14++;
                        }
                        rectF.set(f11, f13, f10, f12);
                        pointFArr2 = e02;
                        cVar2 = null;
                        pointFArr = pointFArr2;
                    }
                    rectF = null;
                    pointFArr2 = pointFArr3;
                    cVar2 = null;
                    pointFArr = pointFArr2;
                } else {
                    if (bitmap != null) {
                        Bitmap Y = Y(bitmap);
                        bitmap.recycle();
                        a5.m mVar3 = new a5.m(1);
                        int width3 = Y.getWidth();
                        int height3 = Y.getHeight();
                        mVar3.d = Y;
                        a8.b bVar3 = (a8.b) mVar3.b;
                        bVar3.a = width3;
                        bVar3.b = height3;
                        i12 = Y.getWidth();
                        i13 = Y.getHeight();
                        SparseArray Q2 = this.Q.Q(mVar3);
                        if (Q2.size() > 0) {
                            b8.m mVar4 = (b8.m) Q2.valueAt(0);
                            str = mVar4.b;
                            Point[] pointArr2 = mVar4.e;
                            PointF[] e03 = e0(pointArr2, i12, i13);
                            if (pointArr2.length == 0) {
                                pointFArr3 = e03;
                                rectF = null;
                                pointFArr2 = pointFArr3;
                            } else {
                                int length2 = pointArr2.length;
                                float f14 = Float.MIN_VALUE;
                                float f15 = Float.MAX_VALUE;
                                while (i14 < length2) {
                                    Point point2 = pointArr2[i14];
                                    f11 = Math.min(f11, point2.x);
                                    f10 = Math.max(f10, point2.x);
                                    f15 = Math.min(f15, point2.y);
                                    f14 = Math.max(f14, point2.y);
                                    i14++;
                                }
                                rectF.set(f11, f15, f10, f14);
                                pointFArr2 = e03;
                            }
                        } else {
                            Bitmap a02 = a0(Y);
                            Y.recycle();
                            a5.m mVar5 = new a5.m(1);
                            int width4 = a02.getWidth();
                            int height4 = a02.getHeight();
                            mVar5.d = a02;
                            a8.b bVar4 = (a8.b) mVar5.b;
                            bVar4.a = width4;
                            bVar4.b = height4;
                            int width5 = Y.getWidth();
                            int height5 = Y.getHeight();
                            SparseArray Q3 = this.Q.Q(mVar5);
                            if (Q3.size() > 0) {
                                b8.m mVar6 = (b8.m) Q3.valueAt(0);
                                String str2 = mVar6.b;
                                Point[] pointArr3 = mVar6.e;
                                PointF[] e04 = e0(pointArr3, width5, height5);
                                if (pointArr3.length == 0) {
                                    rectF = null;
                                } else {
                                    int length3 = pointArr3.length;
                                    float f16 = Float.MIN_VALUE;
                                    float f17 = Float.MAX_VALUE;
                                    while (i14 < length3) {
                                        Point point3 = pointArr3[i14];
                                        f11 = Math.min(f11, point3.x);
                                        f10 = Math.max(f10, point3.x);
                                        f17 = Math.min(f17, point3.y);
                                        f16 = Math.max(f16, point3.y);
                                        i14++;
                                    }
                                    rectF.set(f11, f17, f10, f16);
                                }
                                i13 = height5;
                                str = str2;
                                i12 = width5;
                                pointFArr2 = e04;
                            } else {
                                i12 = width5;
                                i13 = height5;
                            }
                        }
                        cVar2 = null;
                        pointFArr = pointFArr2;
                    }
                    str = null;
                    pointFArr2 = null;
                    cVar2 = null;
                    pointFArr = pointFArr2;
                }
            } else if (this.P != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    dVar = new kb.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width6 = bitmap.getWidth();
                    i13 = bitmap.getHeight();
                    i12 = width6;
                } else {
                    kb.f fVar = new kb.f(size.getWidth(), size.getHeight(), i9, i10, i11, i11);
                    i12 = size.getWidth();
                    i13 = size.getHeight();
                    dVar = fVar;
                }
                j4.c j10 = this.P.j(new g5.b(new lb.f(dVar)));
                kb.j[] jVarArr = (kb.j[]) j10.c;
                String str3 = (String) j10.b;
                if (jVarArr == null || jVarArr.length == 0) {
                    cVar2 = null;
                    r52 = 0;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f18 = Float.MIN_VALUE;
                    float f19 = Float.MAX_VALUE;
                    int i15 = 0;
                    while (i15 < length4) {
                        kb.j jVar = jVarArr[i15];
                        float f20 = jVar.a;
                        cVar = cVar3;
                        try {
                            float f21 = jVar.b;
                            f11 = Math.min(f11, f20);
                            f10 = Math.max(f10, jVar.a);
                            f19 = Math.min(f19, f21);
                            f18 = Math.max(f18, f21);
                            i15++;
                            cVar3 = cVar;
                        } catch (Throwable unused) {
                            AndroidUtilities.runOnUIThread(new j9(this, 6));
                            return cVar;
                        }
                    }
                    cVar2 = cVar3;
                    rectF.set(f11, f19, f10, f18);
                    if (jVarArr.length == 4) {
                        r52 = new PointF[4];
                        while (i14 < 4) {
                            kb.j jVar2 = jVarArr[i14];
                            r52[i14] = new PointF(jVar2.a / i12, jVar2.b / i13);
                            i14++;
                        }
                    } else {
                        r52 = cVar2;
                    }
                }
                str = str3;
                pointFArr = r52;
            } else {
                cVar2 = null;
                i12 = 1;
                str = null;
                pointFArr = null;
                i13 = 1;
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(new j9(this, 6));
                return cVar2;
            }
            if (this.R == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new j9(this, 6));
                return cVar2;
            }
            j4.c cVar4 = new j4.c(17, false);
            if (rectF != null) {
                float dp = AndroidUtilities.dp(25.0f);
                float dp2 = AndroidUtilities.dp(15.0f);
                rectF.set(rectF.left - dp, rectF.top - dp2, rectF.right + dp, rectF.bottom + dp2);
                float f22 = i12;
                float f23 = i13;
                rectF.set(rectF.left / f22, rectF.top / f23, rectF.right / f22, rectF.bottom / f23);
            }
            cVar4.d = pointFArr;
            cVar4.c = rectF;
            cVar4.b = str;
            return cVar4;
        } catch (Throwable unused2) {
            cVar = null;
        }
    }

    public final void g0() {
        if (this.X == null) {
            this.X = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, r1) / 1.5f);
        float f10 = width;
        float height = this.fragmentView.getHeight();
        this.X.set(((width - min) / 2.0f) / f10, ((r1 - min) / 2.0f) / height, ((width + min) / 2.0f) / f10, ((r1 + min) / 2.0f) / height);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (Z()) {
            return arrayList;
        }
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.u8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.D6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        Point realScreenSize;
        if (i10 != -1 || i9 != 11 || intent == null || intent.getData() == null) {
            return;
        }
        try {
            realScreenSize = AndroidUtilities.getRealScreenSize();
        } catch (Throwable th) {
            th = th;
        }
        try {
            j4.c f02 = f0(null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
            if (f02 != null) {
                r9 r9Var = this.H;
                if (r9Var != null) {
                    r9Var.K((String) f02.b);
                }
                finishFragment();
            }
        } catch (Throwable th2) {
            th = th2;
            FileLog.e(th);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        CameraView cameraView = this.c;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.c = null;
        }
        this.d.quitSafely();
        AndroidUtilities.unlockOrientation(getParentActivity());
        b8.n nVar = this.Q;
        if (nVar != null) {
            nVar.N();
        }
    }
}
