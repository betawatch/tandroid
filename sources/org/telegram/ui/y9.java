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
import android.graphics.drawable.Drawable;
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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class y9 extends org.telegram.ui.ActionBar.r2 {
    public float E;
    public final PointF[] F;
    public final PointF[] G;
    public final PointF[] H;
    public final PointF[] I;
    public final RectF J;
    public final RectF K;
    public long L;
    public x9 M;
    public boolean N;
    public long O;
    public int P;
    public int Q;
    public String R;
    public final int S;
    public boolean T;
    public za.c U;
    public s8.n V;
    public final int W;
    public ValueAnimator X;
    public float Y;
    public float Z;
    public f a;
    public o1.j a0;
    public w9 b;
    public float b0;
    public TextView c;
    public RectF c0;
    public CameraView d;
    public final y5 d0;
    public final HandlerThread e;
    public float e0;
    public Handler f;
    public long f0;
    public TextView h;
    public final Paint n;
    public final Paint r;
    public ImageView s;
    public AnimatorSet v;
    public float w;
    public boolean x;
    public o1.j y;

    public y9(int i10) {
        super(null);
        this.e = new HandlerThread("ScanCamera");
        this.n = new Paint();
        this.r = new Paint(1);
        new Path();
        this.w = 0.5f;
        this.x = false;
        this.y = null;
        this.E = 0.0f;
        this.F = new PointF[4];
        this.G = new PointF[4];
        this.H = new PointF[4];
        this.I = new PointF[4];
        for (int i11 = 0; i11 < 4; i11++) {
            this.F[i11] = new PointF(-1.0f, -1.0f);
            this.G[i11] = new PointF(-1.0f, -1.0f);
            this.H[i11] = new PointF(-1.0f, -1.0f);
            this.I[i11] = new PointF(-1.0f, -1.0f);
        }
        this.J = new RectF();
        this.K = new RectF();
        this.L = 0L;
        this.P = 0;
        this.Q = 0;
        this.T = false;
        this.U = null;
        this.V = null;
        this.Y = 0.0f;
        this.Z = 0.0f;
        this.b0 = 0.0f;
        this.d0 = new y5(this, 1);
        this.e0 = 0.0f;
        this.f0 = 0L;
        this.W = i10;
        if (b0()) {
            Utilities.globalQueue.postRunnable(new p9(this, 5));
        }
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass == 0) {
            this.S = 8;
        } else if (devicePerformanceClass != 1) {
            this.S = 40;
        } else {
            this.S = 24;
        }
    }

    public static Bitmap a0(Bitmap bitmap) {
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

    public static Bitmap c0(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f7 = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f7, 85.0f, 85.0f, 85.0f, 0.0f, f7, 85.0f, 85.0f, 85.0f, 0.0f, f7, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void e0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static u9 f0(Activity activity, int i10, x9 x9Var) {
        if (activity == null) {
            return null;
        }
        u9 u9Var = new u9(activity, new org.telegram.ui.ActionBar.j5[]{new ActionBarLayout(activity, false)}, i10, x9Var);
        u9Var.setUseLightStatusBar(false);
        AndroidUtilities.setLightNavigationBar((Dialog) u9Var, false);
        AndroidUtilities.setNavigationBarColor((Dialog) u9Var, -16777216, false);
        u9Var.setUseLightStatusBar(false);
        u9Var.getWindow().addFlags(512);
        u9Var.show();
        return u9Var;
    }

    public static PointF[] g0(Point[] pointArr, int i10, int i11) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i12 = 0; i12 < pointArr.length; i12++) {
            Point point = pointArr[i12];
            pointFArr[i12] = new PointF(point.x / i10, point.y / i11);
        }
        return pointFArr;
    }

    public final void Z() {
        TextView textView;
        if (this.fragmentView == null || !CameraView.isCameraAllowed()) {
            return;
        }
        CameraController.getInstance().initCamera(null);
        CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
        this.d = cameraView;
        cameraView.setUseMaxPreview(true);
        this.d.setOptimizeForBarcode(true);
        this.d.setDelegate(new y0(this, 13));
        ((ViewGroup) this.fragmentView).addView(this.d, 0, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        if (this.W != 0 || (textView = this.h) == null) {
            return;
        }
        this.d.addView(textView);
    }

    public final boolean b0() {
        int i10 = this.W;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.x;
        int i10 = this.W;
        if (z10) {
            this.actionBar.y(-1, false);
            this.actionBar.x(-1, false);
            this.actionBar.setTitleColor(-1);
        } else if (i10 == 0) {
            org.telegram.ui.ActionBar.f7.m(this.actionBar, 1, org.telegram.ui.ActionBar.y6.z6, null);
            org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.u8, null);
            org.telegram.ui.ActionBar.f7.m(this.actionBar, 5, org.telegram.ui.ActionBar.y6.A8, null);
        } else {
            this.actionBar.y(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.z6, false), false);
            this.actionBar.x(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!AndroidUtilities.isTablet() && !b0()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.I && kVar.v == null) {
                View view = new View(kVar.getContext());
                kVar.v = view;
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.x8, view, kVar.J0);
                kVar.addView(kVar.v);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.v.getLayoutParams();
                layoutParams.height = AndroidUtilities.statusBarHeight;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.v.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 28));
        this.n.setColor(2130706432);
        Paint paint = this.r;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        v9 v9Var = new v9(this, context);
        v9Var.setOnTouchListener(new ei.d(2));
        this.fragmentView = v9Var;
        if (b0()) {
            this.fragmentView.postDelayed(new p9(this, 0), 450L);
        } else {
            Z();
        }
        if (i10 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.y6.d6;
            org.telegram.ui.ActionBar.f7.i(i11, kVar2, null);
            org.telegram.ui.ActionBar.f7.i(i11, this.fragmentView, null);
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.y(-1, false);
            this.actionBar.x(587202559, false);
            v9Var.setBackgroundColor(-16777216);
            v9Var.addView(this.actionBar);
        }
        if (i10 == 2 || i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AuthAnotherClientScan));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.s90.c());
        paint2.setColor(i0.a.o(-1, 40));
        w9 w9Var = new w9(context, paint2);
        this.b = w9Var;
        w9Var.setGravity(1);
        this.b.setTextSize(1, 24.0f);
        v9Var.addView(this.b);
        TextView textView = new TextView(context);
        this.c = textView;
        if (i10 == 3) {
            textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.D6, false));
        } else {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.D6, null);
        }
        this.c.setGravity(1);
        this.c.setTextSize(1, 16.0f);
        v9Var.addView(this.c);
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        this.h.setGravity(81);
        this.h.setAlpha(0.0f);
        if (i10 == 0) {
            this.b.setText(LocaleController.getString(R.string.PassportScanPassport));
            this.c.setText(LocaleController.getString(R.string.PassportScanPassportInfo));
            org.telegram.ui.ActionBar.f7.V(this.b, org.telegram.ui.ActionBar.y6.G6, null);
            this.h.setTypeface(Typeface.MONOSPACE);
        } else {
            if (i10 == 1 || i10 == 3) {
                this.b.setText(LocaleController.getString(R.string.AuthAnotherClientScan));
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
                    this.b.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i14, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.x61(strArr[i12], 0), i14, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), i14, indexOf2, 33);
                    i12++;
                }
                this.b.setLinkTextColor(-1);
                this.b.setTextSize(1, 16.0f);
                this.b.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.b.setPadding(0, 0, 0, 0);
                this.b.setText(spannableStringBuilder);
            }
            this.b.setTextColor(-1);
            if (i10 == 3) {
                this.c.setTextColor(-1711276033);
            }
            this.h.setTextSize(1, 16.0f);
            this.h.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f));
            this.h.setText(LocaleController.getString(R.string.AuthAnotherClientNotFound));
            v9Var.addView(this.h);
            ImageView imageView = new ImageView(context);
            this.s = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setImageResource(R.drawable.qr_flashlight);
            this.s.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(60.0f), 587202559));
            v9Var.addView(this.s);
            this.s.setOnClickListener(new a(this, 10));
        }
        Activity parentActivity = getParentActivity();
        el0 el0Var = parentActivity instanceof LaunchActivity ? ((LaunchActivity) parentActivity).u1 : null;
        if (el0Var != null && this.a == null) {
            f fVar = new f(el0Var, 29);
            el0Var.b.add(fVar);
            el0Var.a();
            this.a = fVar;
        }
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0(Bitmap bitmap) {
        y9 y9Var;
        y5 y5Var = this.d0;
        if (this.d == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Size previewSize = this.d.getPreviewSize();
            int i10 = this.W;
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
                                        this.N = true;
                                        CameraController.getInstance().stopPreview(this.d.getCameraSession());
                                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(20, this, recognize));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                y9Var = this;
            } else {
                int min = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                y9Var = this;
                try {
                    k6.c h02 = y9Var.h0(previewSize, (previewSize.getWidth() - min) / 2, (previewSize.getHeight() - min) / 2, min, bitmap);
                    boolean z10 = y9Var.N;
                    if (z10) {
                        y9Var.Q++;
                    }
                    if (h02 != null) {
                        y9Var.P = 0;
                        String str = (String) h02.c;
                        y9Var.R = str;
                        if (!z10) {
                            y9Var.N = true;
                            y9Var.T = y9Var.M.d1(str, new p9(this, 7));
                            y9Var.O = SystemClock.elapsedRealtime();
                            AndroidUtilities.runOnUIThread(new p9(this, 8));
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(21, this, h02));
                    } else if (z10) {
                        int i11 = y9Var.P + 1;
                        y9Var.P = i11;
                        if (i11 > 4 && !y9Var.T) {
                            y9Var.N = false;
                            y9Var.Q = 0;
                            y9Var.R = null;
                            AndroidUtilities.runOnUIThread(new p9(this, 8));
                            AndroidUtilities.runOnUIThread(y5Var, 500L);
                            return;
                        }
                    }
                    if (((y9Var.Q == 0 && h02 != null && ((RectF) h02.b) == null && !y9Var.T) || (SystemClock.elapsedRealtime() - y9Var.O > 1000 && !y9Var.T)) && y9Var.R != null) {
                        CameraView cameraView = y9Var.d;
                        if (cameraView != null && cameraView.getCameraSession() != null && i10 != 3) {
                            CameraController.getInstance().stopPreview(y9Var.d.getCameraSession());
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.m0(19, this, y9Var.R));
                        if (i10 == 3) {
                            AndroidUtilities.runOnUIThread(new p9(this, 1));
                        }
                    } else if (y9Var.N) {
                        y9Var.f.postDelayed(new p9(this, 2), Math.max(16L, (MediaDataController.MAX_STYLE_RUNS_COUNT / y9Var.S) - ((long) y9Var.e0)));
                    }
                } catch (Throwable unused) {
                    AndroidUtilities.runOnUIThread(new p9(this, 6));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    float f7 = y9Var.e0;
                    long j10 = y9Var.f0;
                    float f10 = (f7 * j10) + elapsedRealtime2;
                    long j11 = j10 + 1;
                    y9Var.f0 = j11;
                    y9Var.e0 = f10 / j11;
                    y9Var.f0 = Math.max(j11, 30L);
                    if (y9Var.N) {
                    }
                }
            }
        } catch (Throwable unused2) {
            y9Var = this;
        }
        long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime;
        float f72 = y9Var.e0;
        long j102 = y9Var.f0;
        float f102 = (f72 * j102) + elapsedRealtime22;
        long j112 = j102 + 1;
        y9Var.f0 = j112;
        y9Var.e0 = f102 / j112;
        y9Var.f0 = Math.max(j112, 30L);
        if (y9Var.N) {
            AndroidUtilities.runOnUIThread(y5Var, 500L);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (b0()) {
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.D6));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.graphics.PointF[]] */
    public final k6.c h0(Size size, int i10, int i11, int i12, Bitmap bitmap) {
        k6.c cVar;
        k6.c cVar2;
        int i13;
        int i14;
        String str;
        PointF[] pointFArr;
        ec.d dVar;
        ?? r52;
        k6.c cVar3;
        PointF[] pointFArr2;
        PointF[] pointFArr3;
        k6.c cVar4 = null;
        try {
            RectF rectF = new RectF();
            s8.n nVar = this.V;
            float f7 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            int i15 = 0;
            if (nVar != null && nVar.b.k()) {
                if (bitmap != null) {
                    cVar3 = new k6.c(28);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    cVar3.d = bitmap;
                    a3.l lVar = (a3.l) cVar3.b;
                    lVar.a = width;
                    lVar.b = height;
                    i13 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                } else {
                    cVar3 = new k6.c(28);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap == null) {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                    if (wrap.capacity() < width2 * height2) {
                        throw new IllegalArgumentException("Invalid image data size.");
                    }
                    cVar3.c = wrap;
                    a3.l lVar2 = (a3.l) cVar3.b;
                    lVar2.a = width2;
                    lVar2.b = height2;
                    i13 = size.getWidth();
                    i14 = size.getWidth();
                }
                SparseArray e12 = this.V.e1(cVar3);
                if (e12.size() > 0) {
                    s8.m mVar = (s8.m) e12.valueAt(0);
                    str = mVar.b;
                    Point[] pointArr = mVar.e;
                    PointF[] g02 = g0(pointArr, i13, i14);
                    pointFArr3 = g02;
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
                        pointFArr2 = g02;
                        cVar2 = null;
                        pointFArr = pointFArr2;
                    }
                    rectF = null;
                    pointFArr2 = pointFArr3;
                    cVar2 = null;
                    pointFArr = pointFArr2;
                } else {
                    if (bitmap != null) {
                        Bitmap a02 = a0(bitmap);
                        bitmap.recycle();
                        k6.c cVar5 = new k6.c(28);
                        int width3 = a02.getWidth();
                        int height3 = a02.getHeight();
                        cVar5.d = a02;
                        a3.l lVar3 = (a3.l) cVar5.b;
                        lVar3.a = width3;
                        lVar3.b = height3;
                        i13 = a02.getWidth();
                        i14 = a02.getHeight();
                        SparseArray e13 = this.V.e1(cVar5);
                        if (e13.size() > 0) {
                            s8.m mVar2 = (s8.m) e13.valueAt(0);
                            str = mVar2.b;
                            Point[] pointArr2 = mVar2.e;
                            PointF[] g03 = g0(pointArr2, i13, i14);
                            if (pointArr2.length == 0) {
                                pointFArr3 = g03;
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
                                pointFArr2 = g03;
                            }
                        } else {
                            Bitmap c02 = c0(a02);
                            a02.recycle();
                            k6.c cVar6 = new k6.c(28);
                            int width4 = c02.getWidth();
                            int height4 = c02.getHeight();
                            cVar6.d = c02;
                            a3.l lVar4 = (a3.l) cVar6.b;
                            lVar4.a = width4;
                            lVar4.b = height4;
                            int width5 = a02.getWidth();
                            int height5 = a02.getHeight();
                            SparseArray e14 = this.V.e1(cVar6);
                            if (e14.size() > 0) {
                                s8.m mVar3 = (s8.m) e14.valueAt(0);
                                String str2 = mVar3.b;
                                Point[] pointArr3 = mVar3.e;
                                PointF[] g04 = g0(pointArr3, width5, height5);
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
                                pointFArr2 = g04;
                            } else {
                                i13 = width5;
                                i14 = height5;
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
            } else if (this.U != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    dVar = new ec.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width6 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                    i13 = width6;
                } else {
                    ec.f fVar = new ec.f(size.getWidth(), size.getHeight(), i10, i11, i12, i12);
                    i13 = size.getWidth();
                    i14 = size.getHeight();
                    dVar = fVar;
                }
                a8.h0 M = this.U.M(new n4.s(new fc.e(dVar), 15));
                ec.j[] jVarArr = (ec.j[]) M.c;
                String str3 = (String) M.b;
                if (jVarArr == null || jVarArr.length == 0) {
                    cVar2 = null;
                    r52 = 0;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f17 = Float.MIN_VALUE;
                    float f18 = Float.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < length4) {
                        ec.j jVar = jVarArr[i16];
                        float f19 = jVar.a;
                        cVar = cVar4;
                        try {
                            float f20 = jVar.b;
                            f10 = Math.min(f10, f19);
                            f7 = Math.max(f7, jVar.a);
                            f18 = Math.min(f18, f20);
                            f17 = Math.max(f17, f20);
                            i16++;
                            cVar4 = cVar;
                        } catch (Throwable unused) {
                            AndroidUtilities.runOnUIThread(new p9(this, 6));
                            return cVar;
                        }
                    }
                    cVar2 = cVar4;
                    rectF.set(f10, f18, f7, f17);
                    if (jVarArr.length == 4) {
                        r52 = new PointF[4];
                        while (i15 < 4) {
                            ec.j jVar2 = jVarArr[i15];
                            r52[i15] = new PointF(jVar2.a / i13, jVar2.b / i14);
                            i15++;
                        }
                    } else {
                        r52 = cVar2;
                    }
                }
                str = str3;
                pointFArr = r52;
            } else {
                cVar2 = null;
                i13 = 1;
                i14 = 1;
                str = null;
                pointFArr = null;
            }
            if (TextUtils.isEmpty(str)) {
                AndroidUtilities.runOnUIThread(new p9(this, 6));
                return cVar2;
            }
            if (this.W == 2 && !str.startsWith("tg://login?token=")) {
                AndroidUtilities.runOnUIThread(new p9(this, 6));
                return cVar2;
            }
            k6.c cVar7 = new k6.c(16, false);
            if (rectF != null) {
                float dp = AndroidUtilities.dp(25.0f);
                float dp2 = AndroidUtilities.dp(15.0f);
                rectF.set(rectF.left - dp, rectF.top - dp2, rectF.right + dp, rectF.bottom + dp2);
                float f21 = i13;
                float f22 = i14;
                rectF.set(rectF.left / f21, rectF.top / f22, rectF.right / f21, rectF.bottom / f22);
            }
            cVar7.d = pointFArr;
            cVar7.b = rectF;
            cVar7.c = str;
            return cVar7;
        } catch (Throwable unused2) {
            cVar = null;
        }
    }

    public final void i0() {
        if (this.c0 == null) {
            this.c0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, r1) / 1.5f);
        float f7 = width;
        float height = this.fragmentView.getHeight();
        this.c0.set(((width - min) / 2.0f) / f7, ((r1 - min) / 2.0f) / height, ((width + min) / 2.0f) / f7, ((r1 + min) / 2.0f) / height);
    }

    @Override // org.telegram.ui.ActionBar.r2
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
            k6.c h02 = h0(null, 0, 0, 0, ImageLoader.loadBitmap(null, intent.getData(), realScreenSize.x, realScreenSize.y, true));
            if (h02 != null) {
                x9 x9Var = this.M;
                if (x9Var != null) {
                    x9Var.H((String) h02.c);
                }
                finishFragment();
            }
        } catch (Throwable th3) {
            th = th3;
            FileLog.e(th);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        CameraView cameraView = this.d;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.d = null;
        }
        this.e.quitSafely();
        f fVar = this.a;
        if (fVar != null) {
            el0 el0Var = (el0) fVar.b;
            if (el0Var.b.remove(fVar)) {
                el0Var.a();
            }
            this.a = null;
        }
        s8.n nVar = this.V;
        if (nVar != null) {
            nVar.X0();
        }
    }
}
