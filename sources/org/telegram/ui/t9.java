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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class t9 extends org.telegram.ui.ActionBar.n2 {
    public final PointF[] A;
    public final PointF[] B;
    public final PointF[] C;
    public final PointF[] D;
    public final RectF E;
    public final RectF F;
    public long G;
    public s9 H;
    public boolean I;
    public long J;
    public int K;
    public int L;
    public String M;
    public final int N;
    public boolean O;
    public n2.b0 P;
    public c8.n Q;
    public final int R;
    public ValueAnimator S;
    public float T;
    public float U;
    public o1.j V;
    public float W;
    public RectF X;
    public final w5 Y;
    public float Z;
    public r9 a;
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

    public t9(int i10) {
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
            Utilities.globalQueue.postRunnable(new k9(this, 5));
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
        float f10 = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f10, 85.0f, 85.0f, 85.0f, 0.0f, f10, 85.0f, 85.0f, 85.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void d0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static p9 e0(Activity activity, int i10, s9 s9Var) {
        if (activity == null) {
            return null;
        }
        p9 p9Var = new p9(activity, new org.telegram.ui.ActionBar.b5[]{new ActionBarLayout(activity, false)}, i10, s9Var);
        p9Var.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar((Dialog) p9Var, false);
        AndroidUtilities.setNavigationBarColor((Dialog) p9Var, -16777216, false);
        p9Var.setUseLightStatusBar(false);
        p9Var.getWindow().addFlags(512);
        p9Var.show();
        return p9Var;
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
        ((ViewGroup) this.fragmentView).addView(this.c, 0, h7.z5.c(-1.0f, -1));
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
        t9 t9Var;
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
                                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(19, this, recognize));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                t9Var = this;
            } else {
                int min = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                t9Var = this;
                try {
                    j9.a g02 = t9Var.g0(previewSize, (previewSize.getWidth() - min) / 2, (previewSize.getHeight() - min) / 2, min, bitmap);
                    boolean z10 = t9Var.I;
                    if (z10) {
                        t9Var.L++;
                    }
                    if (g02 != null) {
                        t9Var.K = 0;
                        String str = (String) g02.b;
                        t9Var.M = str;
                        if (!z10) {
                            t9Var.I = true;
                            t9Var.O = t9Var.H.i1(str, new k9(this, 7));
                            t9Var.J = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new k9(this, 8));
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(20, this, g02));
                    } else if (z10) {
                        int i11 = t9Var.K + 1;
                        t9Var.K = i11;
                        if (i11 > 4 && !t9Var.O) {
                            t9Var.I = false;
                            t9Var.L = 0;
                            t9Var.M = null;
                            AndroidUtilities.runOnUIThread(new k9(this, 8));
                            AndroidUtilities.runOnUIThread(w5Var, 500L);
                            return;
                        }
                    }
                    if (((t9Var.L == 0 && g02 != null && ((RectF) g02.c) == null && !t9Var.O) || (SystemClock.elapsedRealtime() - t9Var.J > 1000 && !t9Var.O)) && t9Var.M != null) {
                        CameraView cameraView = t9Var.c;
                        if (cameraView != null && cameraView.getCameraSession() != null && i10 != 3) {
                            CameraController.getInstance().stopPreview(t9Var.c.getCameraSession());
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(18, this, t9Var.M));
                        if (i10 == 3) {
                            AndroidUtilities.runOnUIThread(new k9(this, 1));
                        }
                    } else if (t9Var.I) {
                        t9Var.e.postDelayed(new k9(this, 2), Math.max(16L, (MediaDataController.MAX_STYLE_RUNS_COUNT / t9Var.N) - ((long) t9Var.Z)));
                    }
                } catch (Throwable unused) {
                    AndroidUtilities.runOnUIThread(new k9(this, 6));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    float f10 = t9Var.Z;
                    long j10 = t9Var.a0;
                    float f11 = (f10 * j10) + elapsedRealtime2;
                    long j11 = j10 + 1;
                    t9Var.a0 = j11;
                    t9Var.Z = f11 / j11;
                    t9Var.a0 = Math.max(j11, 30L);
                    if (t9Var.I) {
                    }
                }
            }
        } catch (Throwable unused2) {
            t9Var = this;
        }
        long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime;
        float f102 = t9Var.Z;
        long j102 = t9Var.a0;
        float f112 = (f102 * j102) + elapsedRealtime22;
        long j112 = j102 + 1;
        t9Var.a0 = j112;
        t9Var.Z = f112 / j112;
        t9Var.a0 = Math.max(j112, 30L);
        if (t9Var.I) {
            AndroidUtilities.runOnUIThread(w5Var, 500L);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.w) {
            this.actionBar.D(-1, false);
            this.actionBar.C(-1, false);
            this.actionBar.setTitleColor(-1);
        } else {
            this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z6, false), false);
            this.actionBar.C(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !a0()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.E && kVar.v == null) {
                View view = new View(kVar.getContext());
                kVar.v = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.x8, kVar.E0));
                kVar.addView(kVar.v);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.v.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.v.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ag.e2(this, 21));
        this.h.setColor(2130706432);
        Paint paint = this.n;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        q9 q9Var = new q9(this, context);
        q9Var.setOnTouchListener(new kh.e(2));
        this.fragmentView = q9Var;
        if (a0()) {
            this.fragmentView.postDelayed(new k9(this, 0), 450L);
        } else {
            Y();
        }
        int i10 = this.R;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.g6.d6;
            kVar2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.D(-1, false);
            this.actionBar.C(587202559, false);
            q9Var.setBackgroundColor(-16777216);
            q9Var.addView(this.actionBar);
        }
        if (i10 == 2 || i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.j80.c());
        paint2.setColor(i0.b.k(-1, 40));
        r9 r9Var = new r9(context, paint2);
        this.a = r9Var;
        r9Var.setGravity(1);
        this.a.setTextSize(1, 24.0f);
        q9Var.addView(this.a);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.D6, false));
        this.b.setGravity(1);
        this.b.setTextSize(1, 16.0f);
        q9Var.addView(this.b);
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
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.r41(strArr[i12], 0), i14, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.k41(AndroidUtilities.bold()), i14, indexOf2, 33);
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
            q9Var.addView(this.f);
            ImageView imageView = new ImageView(context);
            this.r = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.r.setImageResource(R.drawable.qr_flashlight);
            this.r.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(60.0f), 587202559));
            q9Var.addView(this.r);
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
    public final j9.a g0(Size size, int i10, int i11, int i12, Bitmap bitmap) {
        j9.a aVar;
        j9.a aVar2;
        int i13;
        String str;
        PointF[] pointFArr;
        int i14;
        lb.d dVar;
        ?? r52;
        a5.n nVar;
        PointF[] pointFArr2;
        PointF[] pointFArr3;
        j9.a aVar3 = null;
        try {
            RectF rectF = new RectF();
            c8.n nVar2 = this.Q;
            float f10 = Float.MIN_VALUE;
            float f11 = Float.MAX_VALUE;
            int i15 = 0;
            if (nVar2 != null && nVar2.b.k()) {
                if (bitmap != null) {
                    nVar = new a5.n(5);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    nVar.d = bitmap;
                    b8.b bVar = (b8.b) nVar.b;
                    bVar.a = width;
                    bVar.b = height;
                    i13 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                } else {
                    nVar = new a5.n(5);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap == null) {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                    if (wrap.capacity() < width2 * height2) {
                        throw new IllegalArgumentException("Invalid image data size.");
                    }
                    nVar.c = wrap;
                    b8.b bVar2 = (b8.b) nVar.b;
                    bVar2.a = width2;
                    bVar2.b = height2;
                    i13 = size.getWidth();
                    i14 = size.getWidth();
                }
                SparseArray Q = this.Q.Q(nVar);
                if (Q.size() > 0) {
                    c8.m mVar = (c8.m) Q.valueAt(0);
                    str = mVar.b;
                    Point[] pointArr = mVar.e;
                    PointF[] f02 = f0(pointArr, i13, i14);
                    pointFArr3 = f02;
                    if (pointArr.length != 0) {
                        int length = pointArr.length;
                        float f12 = Float.MIN_VALUE;
                        float f13 = Float.MAX_VALUE;
                        while (i15 < length) {
                            Point point = pointArr[i15];
                            f11 = Math.min(f11, point.x);
                            f10 = Math.max(f10, point.x);
                            f13 = Math.min(f13, point.y);
                            f12 = Math.max(f12, point.y);
                            i15++;
                        }
                        rectF.set(f11, f13, f10, f12);
                        pointFArr2 = f02;
                        aVar2 = null;
                        pointFArr = pointFArr2;
                    }
                    rectF = null;
                    pointFArr2 = pointFArr3;
                    aVar2 = null;
                    pointFArr = pointFArr2;
                } else {
                    if (bitmap != null) {
                        Bitmap Z = Z(bitmap);
                        bitmap.recycle();
                        a5.n nVar3 = new a5.n(5);
                        int width3 = Z.getWidth();
                        int height3 = Z.getHeight();
                        nVar3.d = Z;
                        b8.b bVar3 = (b8.b) nVar3.b;
                        bVar3.a = width3;
                        bVar3.b = height3;
                        i13 = Z.getWidth();
                        i14 = Z.getHeight();
                        SparseArray Q2 = this.Q.Q(nVar3);
                        if (Q2.size() > 0) {
                            c8.m mVar2 = (c8.m) Q2.valueAt(0);
                            str = mVar2.b;
                            Point[] pointArr2 = mVar2.e;
                            PointF[] f03 = f0(pointArr2, i13, i14);
                            if (pointArr2.length == 0) {
                                pointFArr3 = f03;
                                rectF = null;
                                pointFArr2 = pointFArr3;
                            } else {
                                int length2 = pointArr2.length;
                                float f14 = Float.MIN_VALUE;
                                float f15 = Float.MAX_VALUE;
                                while (i15 < length2) {
                                    Point point2 = pointArr2[i15];
                                    f11 = Math.min(f11, point2.x);
                                    f10 = Math.max(f10, point2.x);
                                    f15 = Math.min(f15, point2.y);
                                    f14 = Math.max(f14, point2.y);
                                    i15++;
                                }
                                rectF.set(f11, f15, f10, f14);
                                pointFArr2 = f03;
                            }
                        } else {
                            Bitmap b02 = b0(Z);
                            Z.recycle();
                            a5.n nVar4 = new a5.n(5);
                            int width4 = b02.getWidth();
                            int height4 = b02.getHeight();
                            nVar4.d = b02;
                            b8.b bVar4 = (b8.b) nVar4.b;
                            bVar4.a = width4;
                            bVar4.b = height4;
                            int width5 = Z.getWidth();
                            int height5 = Z.getHeight();
                            SparseArray Q3 = this.Q.Q(nVar4);
                            if (Q3.size() > 0) {
                                c8.m mVar3 = (c8.m) Q3.valueAt(0);
                                String str2 = mVar3.b;
                                Point[] pointArr3 = mVar3.e;
                                PointF[] f04 = f0(pointArr3, width5, height5);
                                if (pointArr3.length == 0) {
                                    rectF = null;
                                } else {
                                    int length3 = pointArr3.length;
                                    float f16 = Float.MIN_VALUE;
                                    float f17 = Float.MAX_VALUE;
                                    while (i15 < length3) {
                                        Point point3 = pointArr3[i15];
                                        f11 = Math.min(f11, point3.x);
                                        f10 = Math.max(f10, point3.x);
                                        f17 = Math.min(f17, point3.y);
                                        f16 = Math.max(f16, point3.y);
                                        i15++;
                                    }
                                    rectF.set(f11, f17, f10, f16);
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
                        aVar2 = null;
                        pointFArr = pointFArr2;
                    }
                    str = null;
                    pointFArr2 = null;
                    aVar2 = null;
                    pointFArr = pointFArr2;
                }
            } else if (this.P != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    dVar = new lb.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width6 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                    i13 = width6;
                } else {
                    lb.f fVar = new lb.f(size.getWidth(), size.getHeight(), i10, i11, i12, i12);
                    i13 = size.getWidth();
                    i14 = size.getHeight();
                    dVar = fVar;
                }
                j9.a f18 = this.P.f(new g5.b(new mb.f(dVar)));
                lb.j[] jVarArr = (lb.j[]) f18.c;
                String str3 = (String) f18.b;
                if (jVarArr == null || jVarArr.length == 0) {
                    aVar2 = null;
                    r52 = 0;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f19 = Float.MIN_VALUE;
                    float f20 = Float.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < length4) {
                        lb.j jVar = jVarArr[i16];
                        float f21 = jVar.a;
                        aVar = aVar3;
                        try {
                            float f22 = jVar.b;
                            f11 = Math.min(f11, f21);
                            f10 = Math.max(f10, jVar.a);
                            f20 = Math.min(f20, f22);
                            f19 = Math.max(f19, f22);
                            i16++;
                            aVar3 = aVar;
                        } catch (Throwable unused) {
                            AndroidUtilities.runOnUIThread(new k9(this, 6));
                            return aVar;
                        }
                    }
                    aVar2 = aVar3;
                    rectF.set(f11, f20, f10, f19);
                    if (jVarArr.length == 4) {
                        r52 = new PointF[4];
                        while (i15 < 4) {
                            lb.j jVar2 = jVarArr[i15];
                            r52[i15] = new PointF(jVar2.a / i13, jVar2.b / i14);
                            i15++;
                        }
                    } else {
                        r52 = aVar2;
                    }
                }
                str = str3;
                pointFArr = r52;
            } else {
                aVar2 = null;
                i13 = 1;
                str = null;
                pointFArr = null;
                i14 = 1;
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(new k9(this, 6));
                return aVar2;
            }
            if (this.R == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new k9(this, 6));
                return aVar2;
            }
            j9.a aVar4 = new j9.a(16, false);
            if (rectF != null) {
                float dp = AndroidUtilities.dp(25.0f);
                float dp2 = AndroidUtilities.dp(15.0f);
                rectF.set(rectF.left - dp, rectF.top - dp2, rectF.right + dp, rectF.bottom + dp2);
                float f23 = i13;
                float f24 = i14;
                rectF.set(rectF.left / f23, rectF.top / f24, rectF.right / f23, rectF.bottom / f24);
            }
            aVar4.d = pointFArr;
            aVar4.c = rectF;
            aVar4.b = str;
            return aVar4;
        } catch (Throwable unused2) {
            aVar = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        float f10 = width;
        float height = this.fragmentView.getHeight();
        this.X.set(((width - min) / 2.0f) / f10, ((r1 - min) / 2.0f) / height, ((width + min) / 2.0f) / f10, ((r1 + min) / 2.0f) / height);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        Point realScreenSize;
        if (i11 != -1 || i10 != 11 || intent == null || intent.getData() == null) {
            return;
        }
        try {
            realScreenSize = AndroidUtilities.getRealScreenSize();
        } catch (Throwable th) {
            th = th;
        }
        try {
            j9.a g02 = g0(null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
            if (g02 != null) {
                s9 s9Var = this.H;
                if (s9Var != null) {
                    s9Var.C((String) g02.b);
                }
                finishFragment();
            }
        } catch (Throwable th2) {
            th = th2;
            FileLog.e(th);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        CameraView cameraView = this.c;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.c = null;
        }
        this.d.quitSafely();
        AndroidUtilities.unlockOrientation(getParentActivity());
        c8.n nVar = this.Q;
        if (nVar != null) {
            nVar.N();
        }
    }
}
