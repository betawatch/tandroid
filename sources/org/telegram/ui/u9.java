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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class u9 extends org.telegram.ui.ActionBar.n2 {
    public final PointF[] E;
    public final PointF[] F;
    public final PointF[] G;
    public final PointF[] H;
    public final RectF I;
    public final RectF J;
    public long K;
    public t9 L;
    public boolean M;
    public long N;
    public int O;
    public int P;
    public String Q;
    public final int R;
    public boolean S;
    public a6.m T;
    public r8.n U;
    public final int V;
    public ValueAnimator W;
    public float X;
    public float Y;
    public o1.k Z;
    public s9 a;
    public float a0;
    public TextView b;
    public RectF b0;
    public CameraView c;
    public final w5 c0;
    public final HandlerThread d;
    public float d0;
    public Handler e;
    public long e0;
    public TextView f;
    public final Paint h;
    public final Paint n;
    public ImageView r;
    public AnimatorSet s;
    public float v;
    public boolean w;
    public o1.k x;
    public float y;

    public u9(int i10) {
        super(null);
        this.d = new HandlerThread("ScanCamera");
        this.h = new Paint();
        this.n = new Paint(1);
        new Path();
        this.v = 0.5f;
        this.w = false;
        this.x = null;
        this.y = 0.0f;
        this.E = new PointF[4];
        this.F = new PointF[4];
        this.G = new PointF[4];
        this.H = new PointF[4];
        for (int i11 = 0; i11 < 4; i11++) {
            this.E[i11] = new PointF(-1.0f, -1.0f);
            this.F[i11] = new PointF(-1.0f, -1.0f);
            this.G[i11] = new PointF(-1.0f, -1.0f);
            this.H[i11] = new PointF(-1.0f, -1.0f);
        }
        this.I = new RectF();
        this.J = new RectF();
        this.K = 0L;
        this.O = 0;
        this.P = 0;
        this.S = false;
        this.T = null;
        this.U = null;
        this.X = 0.0f;
        this.Y = 0.0f;
        this.a0 = 0.0f;
        this.c0 = new w5(this, 1);
        this.d0 = 0.0f;
        this.e0 = 0L;
        this.V = i10;
        if (a0()) {
            Utilities.globalQueue.postRunnable(new l9(this, 5));
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.R = 8;
        } else if (devicePerformanceClass != 1) {
            this.R = 40;
        } else {
            this.R = 24;
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
        float f7 = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f7, 85.0f, 85.0f, 85.0f, 0.0f, f7, 85.0f, 85.0f, 85.0f, 0.0f, f7, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void d0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static q9 e0(Activity activity, int i10, t9 t9Var) {
        if (activity == null) {
            return null;
        }
        q9 q9Var = new q9(activity, new org.telegram.ui.ActionBar.d5[]{new ActionBarLayout(activity, false)}, i10, t9Var);
        q9Var.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar((Dialog) q9Var, false);
        AndroidUtilities.setNavigationBarColor((Dialog) q9Var, -16777216, false);
        q9Var.setUseLightStatusBar(false);
        q9Var.getWindow().addFlags(512);
        q9Var.show();
        return q9Var;
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
        this.c.setDelegate(new z0(this, 11));
        ((ViewGroup) this.fragmentView).addView(this.c, 0, w7.x5.c(-1.0f, -1));
        if (this.V != 0 || (textView = this.f) == null) {
            return;
        }
        this.c.addView(textView);
    }

    public final boolean a0() {
        int i10 = this.V;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(Bitmap bitmap) {
        u9 u9Var;
        w5 w5Var = this.c0;
        if (this.c == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Size previewSize = this.c.getPreviewSize();
            int i10 = this.V;
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
                                        this.M = true;
                                        CameraController.getInstance().stopPreview(this.c.getCameraSession());
                                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(13, this, recognize));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                u9Var = this;
            } else {
                int min = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                u9Var = this;
                try {
                    m2.t g02 = u9Var.g0(previewSize, (previewSize.getWidth() - min) / 2, (previewSize.getHeight() - min) / 2, min, bitmap);
                    boolean z10 = u9Var.M;
                    if (z10) {
                        u9Var.P++;
                    }
                    if (g02 != null) {
                        u9Var.O = 0;
                        String str = (String) g02.b;
                        u9Var.Q = str;
                        if (!z10) {
                            u9Var.M = true;
                            u9Var.S = u9Var.L.f1(str, new l9(this, 7));
                            u9Var.N = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new l9(this, 8));
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(14, this, g02));
                    } else if (z10) {
                        int i11 = u9Var.O + 1;
                        u9Var.O = i11;
                        if (i11 > 4 && !u9Var.S) {
                            u9Var.M = false;
                            u9Var.P = 0;
                            u9Var.Q = null;
                            AndroidUtilities.runOnUIThread(new l9(this, 8));
                            AndroidUtilities.runOnUIThread(w5Var, 500L);
                            return;
                        }
                    }
                    if (((u9Var.P == 0 && g02 != null && ((RectF) g02.c) == null && !u9Var.S) || (SystemClock.elapsedRealtime() - u9Var.N > 1000 && !u9Var.S)) && u9Var.Q != null) {
                        CameraView cameraView = u9Var.c;
                        if (cameraView != null && cameraView.getCameraSession() != null && i10 != 3) {
                            CameraController.getInstance().stopPreview(u9Var.c.getCameraSession());
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(12, this, u9Var.Q));
                        if (i10 == 3) {
                            AndroidUtilities.runOnUIThread(new l9(this, 1));
                        }
                    } else if (u9Var.M) {
                        u9Var.e.postDelayed(new l9(this, 2), Math.max(16L, (MediaDataController.MAX_STYLE_RUNS_COUNT / u9Var.R) - ((long) u9Var.d0)));
                    }
                } catch (Throwable unused) {
                    AndroidUtilities.runOnUIThread(new l9(this, 6));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    float f7 = u9Var.d0;
                    long j3 = u9Var.e0;
                    float f10 = (f7 * j3) + elapsedRealtime2;
                    long j10 = j3 + 1;
                    u9Var.e0 = j10;
                    u9Var.d0 = f10 / j10;
                    u9Var.e0 = Math.max(j10, 30L);
                    if (u9Var.M) {
                    }
                }
            }
        } catch (Throwable unused2) {
            u9Var = this;
        }
        long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime;
        float f72 = u9Var.d0;
        long j32 = u9Var.e0;
        float f102 = (f72 * j32) + elapsedRealtime22;
        long j102 = j32 + 1;
        u9Var.e0 = j102;
        u9Var.d0 = f102 / j102;
        u9Var.e0 = Math.max(j102, 30L);
        if (u9Var.M) {
            AndroidUtilities.runOnUIThread(w5Var, 500L);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.w) {
            this.actionBar.C(-1, false);
            this.actionBar.B(-1, false);
            this.actionBar.setTitleColor(-1);
        } else {
            this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.z6, false), false);
            this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !a0()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.I && kVar.v == null) {
                View view = new View(kVar.getContext());
                kVar.v = view;
                view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.x8, kVar.I0));
                kVar.addView(kVar.v);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.v.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.v.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 26));
        this.h.setColor(2130706432);
        Paint paint = this.n;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        r9 r9Var = new r9(this, context);
        r9Var.setOnTouchListener(new ci.d(2));
        this.fragmentView = r9Var;
        if (a0()) {
            this.fragmentView.postDelayed(new l9(this, 0), 450L);
        } else {
            Y();
        }
        int i10 = this.V;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.j6.d6;
            kVar2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            this.fragmentView.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.C(-1, false);
            this.actionBar.B(587202559, false);
            r9Var.setBackgroundColor(-16777216);
            r9Var.addView(this.actionBar);
        }
        if (i10 == 2 || i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.x80.c());
        paint2.setColor(i0.a.k(-1, 40));
        s9 s9Var = new s9(context, paint2);
        this.a = s9Var;
        s9Var.setGravity(1);
        this.a.setTextSize(1, 24.0f);
        r9Var.addView(this.a);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D6, false));
        this.b.setGravity(1);
        this.b.setTextSize(1, 16.0f);
        r9Var.addView(this.b);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTextColor(-1);
        this.f.setGravity(81);
        this.f.setAlpha(0.0f);
        if (i10 == 0) {
            this.a.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.b.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            this.a.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
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
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.l51(strArr[i12], 0), i14, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), i14, indexOf2, 33);
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
            r9Var.addView(this.f);
            ImageView imageView = new ImageView(context);
            this.r = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.r.setImageResource(R.drawable.qr_flashlight);
            this.r.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(60.0f), 587202559));
            r9Var.addView(this.r);
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
    public final m2.t g0(Size size, int i10, int i11, int i12, Bitmap bitmap) {
        m2.t tVar;
        m2.t tVar2;
        int i13;
        String str;
        PointF[] pointFArr;
        int i14;
        cc.d dVar;
        ?? r52;
        m2.t tVar3;
        PointF[] pointFArr2;
        PointF[] pointFArr3;
        m2.t tVar4 = null;
        try {
            RectF rectF = new RectF();
            r8.n nVar = this.U;
            float f7 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            int i15 = 0;
            if (nVar != null && nVar.b.k()) {
                if (bitmap != null) {
                    tVar3 = new m2.t(20);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    tVar3.d = bitmap;
                    a3.k kVar = (a3.k) tVar3.b;
                    kVar.a = width;
                    kVar.b = height;
                    i13 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                } else {
                    tVar3 = new m2.t(20);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap == null) {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                    if (wrap.capacity() < width2 * height2) {
                        throw new IllegalArgumentException("Invalid image data size.");
                    }
                    tVar3.c = wrap;
                    a3.k kVar2 = (a3.k) tVar3.b;
                    kVar2.a = width2;
                    kVar2.b = height2;
                    i13 = size.getWidth();
                    i14 = size.getWidth();
                }
                SparseArray Z0 = this.U.Z0(tVar3);
                if (Z0.size() > 0) {
                    r8.m mVar = (r8.m) Z0.valueAt(0);
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
                            f7 = Math.max(f7, point.x);
                            f12 = Math.min(f12, point.y);
                            f11 = Math.max(f11, point.y);
                            i15++;
                        }
                        rectF.set(f10, f12, f7, f11);
                        pointFArr2 = f02;
                        tVar2 = null;
                        pointFArr = pointFArr2;
                    }
                    rectF = null;
                    pointFArr2 = pointFArr3;
                    tVar2 = null;
                    pointFArr = pointFArr2;
                } else {
                    if (bitmap != null) {
                        Bitmap Z = Z(bitmap);
                        bitmap.recycle();
                        m2.t tVar5 = new m2.t(20);
                        int width3 = Z.getWidth();
                        int height3 = Z.getHeight();
                        tVar5.d = Z;
                        a3.k kVar3 = (a3.k) tVar5.b;
                        kVar3.a = width3;
                        kVar3.b = height3;
                        i13 = Z.getWidth();
                        i14 = Z.getHeight();
                        SparseArray Z02 = this.U.Z0(tVar5);
                        if (Z02.size() > 0) {
                            r8.m mVar2 = (r8.m) Z02.valueAt(0);
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
                                    f7 = Math.max(f7, point2.x);
                                    f14 = Math.min(f14, point2.y);
                                    f13 = Math.max(f13, point2.y);
                                    i15++;
                                }
                                rectF.set(f10, f14, f7, f13);
                                pointFArr2 = f03;
                            }
                        } else {
                            Bitmap b02 = b0(Z);
                            Z.recycle();
                            m2.t tVar6 = new m2.t(20);
                            int width4 = b02.getWidth();
                            int height4 = b02.getHeight();
                            tVar6.d = b02;
                            a3.k kVar4 = (a3.k) tVar6.b;
                            kVar4.a = width4;
                            kVar4.b = height4;
                            int width5 = Z.getWidth();
                            int height5 = Z.getHeight();
                            SparseArray Z03 = this.U.Z0(tVar6);
                            if (Z03.size() > 0) {
                                r8.m mVar3 = (r8.m) Z03.valueAt(0);
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
                                        f7 = Math.max(f7, point3.x);
                                        f16 = Math.min(f16, point3.y);
                                        f15 = Math.max(f15, point3.y);
                                        i15++;
                                    }
                                    rectF.set(f10, f16, f7, f15);
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
                        tVar2 = null;
                        pointFArr = pointFArr2;
                    }
                    str = null;
                    pointFArr2 = null;
                    tVar2 = null;
                    pointFArr = pointFArr2;
                }
            } else if (this.T != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    dVar = new cc.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width6 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                    i13 = width6;
                } else {
                    cc.f fVar = new cc.f(size.getWidth(), size.getHeight(), i10, i11, i12, i12);
                    i13 = size.getWidth();
                    i14 = size.getHeight();
                    dVar = fVar;
                }
                aa.a X = this.T.X(new pf.b(new dc.f(dVar)));
                cc.j[] jVarArr = (cc.j[]) X.c;
                String str3 = (String) X.b;
                if (jVarArr == null || jVarArr.length == 0) {
                    tVar2 = null;
                    r52 = 0;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f17 = Float.MIN_VALUE;
                    float f18 = Float.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < length4) {
                        cc.j jVar = jVarArr[i16];
                        float f19 = jVar.a;
                        tVar = tVar4;
                        try {
                            float f20 = jVar.b;
                            f10 = Math.min(f10, f19);
                            f7 = Math.max(f7, jVar.a);
                            f18 = Math.min(f18, f20);
                            f17 = Math.max(f17, f20);
                            i16++;
                            tVar4 = tVar;
                        } catch (Throwable unused) {
                            AndroidUtilities.runOnUIThread(new l9(this, 6));
                            return tVar;
                        }
                    }
                    tVar2 = tVar4;
                    rectF.set(f10, f18, f7, f17);
                    if (jVarArr.length == 4) {
                        r52 = new PointF[4];
                        while (i15 < 4) {
                            cc.j jVar2 = jVarArr[i15];
                            r52[i15] = new PointF(jVar2.a / i13, jVar2.b / i14);
                            i15++;
                        }
                    } else {
                        r52 = tVar2;
                    }
                }
                str = str3;
                pointFArr = r52;
            } else {
                tVar2 = null;
                i13 = 1;
                str = null;
                pointFArr = null;
                i14 = 1;
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(new l9(this, 6));
                return tVar2;
            }
            if (this.V == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new l9(this, 6));
                return tVar2;
            }
            m2.t tVar7 = new m2.t(9, false);
            if (rectF != null) {
                float dp = AndroidUtilities.dp(25.0f);
                float dp2 = AndroidUtilities.dp(15.0f);
                rectF.set(rectF.left - dp, rectF.top - dp2, rectF.right + dp, rectF.bottom + dp2);
                float f21 = i13;
                float f22 = i14;
                rectF.set(rectF.left / f21, rectF.top / f22, rectF.right / f21, rectF.bottom / f22);
            }
            tVar7.d = pointFArr;
            tVar7.c = rectF;
            tVar7.b = str;
            return tVar7;
        } catch (Throwable unused2) {
            tVar = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (a0()) {
            return arrayList;
        }
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.u8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.a, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.D6));
        return arrayList;
    }

    public final void h0() {
        if (this.b0 == null) {
            this.b0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, r1) / 1.5f);
        float f7 = width;
        float height = this.fragmentView.getHeight();
        this.b0.set(((width - min) / 2.0f) / f7, ((r1 - min) / 2.0f) / height, ((width + min) / 2.0f) / f7, ((r1 + min) / 2.0f) / height);
    }

    @Override // org.telegram.ui.ActionBar.n2
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
            m2.t g02 = g0(null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
            if (g02 != null) {
                t9 t9Var = this.L;
                if (t9Var != null) {
                    t9Var.K((String) g02.b);
                }
                finishFragment();
            }
        } catch (Throwable th3) {
            th = th3;
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
        r8.n nVar = this.U;
        if (nVar != null) {
            nVar.U0();
        }
    }
}
