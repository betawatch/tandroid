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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class r9 extends org.telegram.ui.ActionBar.o2 {
    public final PointF[] A;
    public final PointF[] B;
    public final PointF[] C;
    public final PointF[] D;
    public final RectF E;
    public final RectF F;
    public long G;
    public q9 H;
    public boolean I;
    public long J;
    public int K;
    public int L;
    public String M;
    public final int N;
    public boolean O;
    public nh.d6 P;
    public d8.n Q;
    public final int R;
    public ValueAnimator S;
    public float T;
    public float U;
    public o1.k V;
    public float W;
    public RectF X;
    public final w5 Y;
    public float Z;
    public p9 a;
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
    public o1.k x;
    public float y;

    public r9(int i10) {
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
        for (int i11 = 0; i11 < 4; i11++) {
            this.A[i11] = new PointF(-1.0f, -1.0f);
            this.B[i11] = new PointF(-1.0f, -1.0f);
            this.C[i11] = new PointF(-1.0f, -1.0f);
            this.D[i11] = new PointF(-1.0f, -1.0f);
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
        this.Y = new w5(this, 1);
        this.Z = 0.0f;
        this.a0 = 0L;
        this.R = i10;
        if (a0()) {
            Utilities.globalQueue.postRunnable(new i9(this, 5));
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

    public static Bitmap Z(Bitmap bitmap) {
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

    public static Bitmap b0(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f9 = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f9, 85.0f, 85.0f, 85.0f, 0.0f, f9, 85.0f, 85.0f, 85.0f, 0.0f, f9, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void d0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static n9 e0(Activity activity, int i10, q9 q9Var) {
        if (activity == null) {
            return null;
        }
        n9 n9Var = new n9(activity, new org.telegram.ui.ActionBar.b5[]{new ActionBarLayout(activity, false)}, i10, q9Var);
        n9Var.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar((Dialog) n9Var, false);
        AndroidUtilities.setNavigationBarColor((Dialog) n9Var, -16777216, false);
        n9Var.setUseLightStatusBar(false);
        n9Var.getWindow().addFlags(512);
        n9Var.show();
        return n9Var;
    }

    public static PointF[] f0(Point[] pointArr, int i10, int i11) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i12 = 0; i12 < pointArr.length; i12++) {
            Point point = pointArr[i12];
            pointFArr[i12] = new PointF(point.x / i10, point.y / i11);
        }
        return pointFArr;
    }

    public final void Y() {
        TextView textView;
        if (this.fragmentView == null || !CameraView.isCameraAllowed()) {
            return;
        }
        CameraController.getInstance().initCamera(null);
        CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
        this.c = cameraView;
        cameraView.setUseMaxPreview(true);
        this.c.setOptimizeForBarcode(true);
        this.c.setDelegate(new c1(this, 11));
        ((ViewGroup) this.fragmentView).addView(this.c, 0, i7.f6.c(-1.0f, -1));
        if (this.R != 0 || (textView = this.f) == null) {
            return;
        }
        this.c.addView(textView);
    }

    public final boolean a0() {
        int i10 = this.R;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(Bitmap bitmap) {
        r9 r9Var;
        w5 w5Var = this.Y;
        if (this.c == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Size previewSize = this.c.getPreviewSize();
            int i10 = this.R;
            if (i10 == 0) {
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
                                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(16, this, recognize));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                r9Var = this;
            } else {
                int min = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                r9Var = this;
                try {
                    l3.g0 g02 = r9Var.g0(previewSize, (previewSize.getWidth() - min) / 2, (previewSize.getHeight() - min) / 2, min, bitmap);
                    boolean z10 = r9Var.I;
                    if (z10) {
                        r9Var.L++;
                    }
                    if (g02 != null) {
                        r9Var.K = 0;
                        String str = (String) g02.b;
                        r9Var.M = str;
                        if (!z10) {
                            r9Var.I = true;
                            r9Var.O = r9Var.H.d1(str, new i9(this, 7));
                            r9Var.J = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new i9(this, 8));
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(17, this, g02));
                    } else if (z10) {
                        int i11 = r9Var.K + 1;
                        r9Var.K = i11;
                        if (i11 > 4 && !r9Var.O) {
                            r9Var.I = false;
                            r9Var.L = 0;
                            r9Var.M = null;
                            AndroidUtilities.runOnUIThread(new i9(this, 8));
                            AndroidUtilities.runOnUIThread(w5Var, 500L);
                            return;
                        }
                    }
                    if (((r9Var.L == 0 && g02 != null && ((RectF) g02.c) == null && !r9Var.O) || (SystemClock.elapsedRealtime() - r9Var.J > 1000 && !r9Var.O)) && r9Var.M != null) {
                        CameraView cameraView = r9Var.c;
                        if (cameraView != null && cameraView.getCameraSession() != null && i10 != 3) {
                            CameraController.getInstance().stopPreview(r9Var.c.getCameraSession());
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c(15, this, r9Var.M));
                        if (i10 == 3) {
                            AndroidUtilities.runOnUIThread(new i9(this, 1));
                        }
                    } else if (r9Var.I) {
                        r9Var.e.postDelayed(new i9(this, 2), Math.max(16L, (MediaDataController.MAX_STYLE_RUNS_COUNT / r9Var.N) - ((long) r9Var.Z)));
                    }
                } catch (Throwable unused) {
                    AndroidUtilities.runOnUIThread(new i9(this, 6));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    float f9 = r9Var.Z;
                    long j10 = r9Var.a0;
                    float f10 = (f9 * j10) + elapsedRealtime2;
                    long j11 = j10 + 1;
                    r9Var.a0 = j11;
                    r9Var.Z = f10 / j11;
                    r9Var.a0 = Math.max(j11, 30L);
                    if (r9Var.I) {
                    }
                }
            }
        } catch (Throwable unused2) {
            r9Var = this;
        }
        long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime;
        float f92 = r9Var.Z;
        long j102 = r9Var.a0;
        float f102 = (f92 * j102) + elapsedRealtime22;
        long j112 = j102 + 1;
        r9Var.a0 = j112;
        r9Var.Z = f102 / j112;
        r9Var.a0 = Math.max(j112, 30L);
        if (r9Var.I) {
            AndroidUtilities.runOnUIThread(w5Var, 500L);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.w) {
            this.actionBar.C(-1, false);
            this.actionBar.B(-1, false);
            this.actionBar.setTitleColor(-1);
        } else {
            this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z6, false), false);
            this.actionBar.B(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !a0()) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar.E && lVar.v == null) {
                View view = new View(lVar.getContext());
                lVar.v = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.x8, lVar.E0));
                lVar.addView(lVar.v);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lVar.v.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                lVar.v.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 12));
        this.h.setColor(2130706432);
        Paint paint = this.n;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        o9 o9Var = new o9(this, context);
        o9Var.setOnTouchListener(new mh.d(2));
        this.fragmentView = o9Var;
        if (a0()) {
            this.fragmentView.postDelayed(new i9(this, 0), 450L);
        } else {
            Y();
        }
        int i10 = this.R;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.g6.d6;
            lVar2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.C(-1, false);
            this.actionBar.B(587202559, false);
            o9Var.setBackgroundColor(-16777216);
            o9Var.addView(this.actionBar);
        }
        if (i10 == 2 || i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.s80.c());
        paint2.setColor(i0.a.k(-1, 40));
        p9 p9Var = new p9(context, paint2);
        this.a = p9Var;
        p9Var.setGravity(1);
        this.a.setTextSize(1, 24.0f);
        o9Var.addView(this.a);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.b.setGravity(1);
        this.b.setTextSize(1, 16.0f);
        o9Var.addView(this.b);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextColor(-1);
        this.f.setGravity(81);
        this.f.setAlpha(0.0f);
        if (i10 == 0) {
            this.a.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.b.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            this.f.setTypeface(Typeface.MONOSPACE);
        } else {
            if (i10 == 1 || i10 == 3) {
                this.a.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.AuthAnotherClientInfo5));
                String[] strArr = {LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl), LocaleController.getString(R.string.AuthAnotherWebClientUrl)};
                int i12 = 0;
                for (int i13 = 2; i12 < i13; i13 = 2) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    int indexOf = spannableStringBuilder2.indexOf(42);
                    int i14 = indexOf + 1;
                    int indexOf2 = spannableStringBuilder2.indexOf(42, i14);
                    if (indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2) {
                        break;
                    }
                    this.a.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i14, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.a51(strArr[i12], 0), i14, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), i14, indexOf2, 33);
                    i12++;
                }
                this.a.setLinkTextColor(-1);
                this.a.setTextSize(1, 16.0f);
                this.a.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.a.setPadding(0, 0, 0, 0);
                this.a.setText(spannableStringBuilder);
            }
            this.a.setTextColor(-1);
            if (i10 == 3) {
                this.b.setTextColor(-1711276033);
            }
            this.f.setTextSize(1, 16.0f);
            this.f.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            this.f.setText(LocaleController.getString(R.string.AuthAnotherClientNotFound));
            o9Var.addView(this.f);
            ImageView imageView = new ImageView(context);
            this.r = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.r.setImageResource(R.drawable.qr_flashlight);
            this.r.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(60.0f), 587202559));
            o9Var.addView(this.r);
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
    public final l3.g0 g0(Size size, int i10, int i11, int i12, Bitmap bitmap) {
        l3.g0 g0Var;
        l3.g0 g0Var2;
        int i13;
        String str;
        PointF[] pointFArr;
        int i14;
        mb.d dVar;
        ?? r52;
        androidx.biometric.e eVar;
        PointF[] pointFArr2;
        PointF[] pointFArr3;
        l3.g0 g0Var3 = null;
        try {
            RectF rectF = new RectF();
            d8.n nVar = this.Q;
            float f9 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            int i15 = 0;
            if (nVar != null && nVar.b.k()) {
                if (bitmap != null) {
                    eVar = new androidx.biometric.e(5);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    eVar.d = bitmap;
                    c8.a aVar = (c8.a) eVar.b;
                    aVar.a = width;
                    aVar.b = height;
                    i13 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                } else {
                    eVar = new androidx.biometric.e(5);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap == null) {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                    if (wrap.capacity() < width2 * height2) {
                        throw new IllegalArgumentException("Invalid image data size.");
                    }
                    eVar.c = wrap;
                    c8.a aVar2 = (c8.a) eVar.b;
                    aVar2.a = width2;
                    aVar2.b = height2;
                    i13 = size.getWidth();
                    i14 = size.getWidth();
                }
                SparseArray Q = this.Q.Q(eVar);
                if (Q.size() > 0) {
                    d8.m mVar = (d8.m) Q.valueAt(0);
                    str = mVar.b;
                    Point[] pointArr = mVar.e;
                    PointF[] f02 = f0(pointArr, i13, i14);
                    pointFArr3 = f02;
                    if (pointArr.length != 0) {
                        int length = pointArr.length;
                        float f11 = Float.MIN_VALUE;
                        float f12 = Float.MAX_VALUE;
                        while (i15 < length) {
                            Point point = pointArr[i15];
                            f10 = Math.min(f10, point.x);
                            f9 = Math.max(f9, point.x);
                            f12 = Math.min(f12, point.y);
                            f11 = Math.max(f11, point.y);
                            i15++;
                        }
                        rectF.set(f10, f12, f9, f11);
                        pointFArr2 = f02;
                        g0Var2 = null;
                        pointFArr = pointFArr2;
                    }
                    rectF = null;
                    pointFArr2 = pointFArr3;
                    g0Var2 = null;
                    pointFArr = pointFArr2;
                } else {
                    if (bitmap != null) {
                        Bitmap Z = Z(bitmap);
                        bitmap.recycle();
                        androidx.biometric.e eVar2 = new androidx.biometric.e(5);
                        int width3 = Z.getWidth();
                        int height3 = Z.getHeight();
                        eVar2.d = Z;
                        c8.a aVar3 = (c8.a) eVar2.b;
                        aVar3.a = width3;
                        aVar3.b = height3;
                        i13 = Z.getWidth();
                        i14 = Z.getHeight();
                        SparseArray Q2 = this.Q.Q(eVar2);
                        if (Q2.size() > 0) {
                            d8.m mVar2 = (d8.m) Q2.valueAt(0);
                            str = mVar2.b;
                            Point[] pointArr2 = mVar2.e;
                            PointF[] f03 = f0(pointArr2, i13, i14);
                            if (pointArr2.length == 0) {
                                pointFArr3 = f03;
                                rectF = null;
                                pointFArr2 = pointFArr3;
                            } else {
                                int length2 = pointArr2.length;
                                float f13 = Float.MIN_VALUE;
                                float f14 = Float.MAX_VALUE;
                                while (i15 < length2) {
                                    Point point2 = pointArr2[i15];
                                    f10 = Math.min(f10, point2.x);
                                    f9 = Math.max(f9, point2.x);
                                    f14 = Math.min(f14, point2.y);
                                    f13 = Math.max(f13, point2.y);
                                    i15++;
                                }
                                rectF.set(f10, f14, f9, f13);
                                pointFArr2 = f03;
                            }
                        } else {
                            Bitmap b02 = b0(Z);
                            Z.recycle();
                            androidx.biometric.e eVar3 = new androidx.biometric.e(5);
                            int width4 = b02.getWidth();
                            int height4 = b02.getHeight();
                            eVar3.d = b02;
                            c8.a aVar4 = (c8.a) eVar3.b;
                            aVar4.a = width4;
                            aVar4.b = height4;
                            int width5 = Z.getWidth();
                            int height5 = Z.getHeight();
                            SparseArray Q3 = this.Q.Q(eVar3);
                            if (Q3.size() > 0) {
                                d8.m mVar3 = (d8.m) Q3.valueAt(0);
                                String str2 = mVar3.b;
                                Point[] pointArr3 = mVar3.e;
                                PointF[] f04 = f0(pointArr3, width5, height5);
                                if (pointArr3.length == 0) {
                                    rectF = null;
                                } else {
                                    int length3 = pointArr3.length;
                                    float f15 = Float.MIN_VALUE;
                                    float f16 = Float.MAX_VALUE;
                                    while (i15 < length3) {
                                        Point point3 = pointArr3[i15];
                                        f10 = Math.min(f10, point3.x);
                                        f9 = Math.max(f9, point3.x);
                                        f16 = Math.min(f16, point3.y);
                                        f15 = Math.max(f15, point3.y);
                                        i15++;
                                    }
                                    rectF.set(f10, f16, f9, f15);
                                }
                                i14 = height5;
                                str = str2;
                                i13 = width5;
                                pointFArr2 = f04;
                            } else {
                                i13 = width5;
                                i14 = height5;
                            }
                        }
                        g0Var2 = null;
                        pointFArr = pointFArr2;
                    }
                    str = null;
                    pointFArr2 = null;
                    g0Var2 = null;
                    pointFArr = pointFArr2;
                }
            } else if (this.P != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    dVar = new mb.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width6 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                    i13 = width6;
                } else {
                    mb.f fVar = new mb.f(size.getWidth(), size.getHeight(), i10, i11, i12, i12);
                    i13 = size.getWidth();
                    i14 = size.getHeight();
                    dVar = fVar;
                }
                l3.g0 K = this.P.K(new g9.l(new nb.f(dVar)));
                mb.j[] jVarArr = (mb.j[]) K.c;
                String str3 = (String) K.b;
                if (jVarArr == null || jVarArr.length == 0) {
                    g0Var2 = null;
                    r52 = 0;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f17 = Float.MIN_VALUE;
                    float f18 = Float.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < length4) {
                        mb.j jVar = jVarArr[i16];
                        float f19 = jVar.a;
                        g0Var = g0Var3;
                        try {
                            float f20 = jVar.b;
                            f10 = Math.min(f10, f19);
                            f9 = Math.max(f9, jVar.a);
                            f18 = Math.min(f18, f20);
                            f17 = Math.max(f17, f20);
                            i16++;
                            g0Var3 = g0Var;
                        } catch (Throwable unused) {
                            AndroidUtilities.runOnUIThread(new i9(this, 6));
                            return g0Var;
                        }
                    }
                    g0Var2 = g0Var3;
                    rectF.set(f10, f18, f9, f17);
                    if (jVarArr.length == 4) {
                        r52 = new PointF[4];
                        while (i15 < 4) {
                            mb.j jVar2 = jVarArr[i15];
                            r52[i15] = new PointF(jVar2.a / i13, jVar2.b / i14);
                            i15++;
                        }
                    } else {
                        r52 = g0Var2;
                    }
                }
                str = str3;
                pointFArr = r52;
            } else {
                g0Var2 = null;
                i13 = 1;
                str = null;
                pointFArr = null;
                i14 = 1;
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(new i9(this, 6));
                return g0Var2;
            }
            if (this.R == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new i9(this, 6));
                return g0Var2;
            }
            l3.g0 g0Var4 = new l3.g0(15, false);
            if (rectF != null) {
                float dp = AndroidUtilities.dp(25.0f);
                float dp2 = AndroidUtilities.dp(15.0f);
                rectF.set(rectF.left - dp, rectF.top - dp2, rectF.right + dp, rectF.bottom + dp2);
                float f21 = i13;
                float f22 = i14;
                rectF.set(rectF.left / f21, rectF.top / f22, rectF.right / f21, rectF.bottom / f22);
            }
            g0Var4.d = pointFArr;
            g0Var4.c = rectF;
            g0Var4.b = str;
            return g0Var4;
        } catch (Throwable unused2) {
            g0Var = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (a0()) {
            return arrayList;
        }
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.u8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.b, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.D6));
        return arrayList;
    }

    public final void h0() {
        if (this.X == null) {
            this.X = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, r1) / 1.5f);
        float f9 = width;
        float height = this.fragmentView.getHeight();
        this.X.set(((width - min) / 2.0f) / f9, ((r1 - min) / 2.0f) / height, ((width + min) / 2.0f) / f9, ((r1 + min) / 2.0f) / height);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        Point realScreenSize;
        if (i11 != -1 || i10 != 11 || intent == null || intent.getData() == null) {
            return;
        }
        try {
            realScreenSize = AndroidUtilities.getRealScreenSize();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            l3.g0 g02 = g0(null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
            if (g02 != null) {
                q9 q9Var = this.H;
                if (q9Var != null) {
                    q9Var.J((String) g02.b);
                }
                finishFragment();
            }
        } catch (Throwable th3) {
            th = th3;
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
        d8.n nVar = this.Q;
        if (nVar != null) {
            nVar.N();
        }
    }
}
