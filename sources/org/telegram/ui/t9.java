package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
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
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.camera.Size;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class t9 extends org.telegram.ui.ActionBar.h2 {
    public r1.g E;
    public float F;
    public final PointF[] G;
    public final PointF[] H;
    public final PointF[] I;
    public final PointF[] J;
    public final RectF K;
    public final RectF L;
    public long M;
    public s9 N;
    public boolean O;
    public long P;
    public int Q;
    public int R;
    public String S;
    public final int T;
    public boolean U;
    public d6.i V;
    public u8.n W;
    public final int X;
    public ValueAnimator Y;
    public float Z;
    public f a;
    public float a0;
    public r9 b;
    public r1.g b0;
    public TextView c;
    public float c0;
    public CameraView d;
    public RectF d0;
    public final HandlerThread e;
    public final m4 e0;
    public Handler f;
    public float f0;
    public long g0;
    public TextView h;
    public final Paint n;
    public final Paint r;
    public ImageView s;
    public AnimatorSet w;
    public float x;
    public boolean y;

    public t9(int i7) {
        super(null);
        this.e = new HandlerThread("ScanCamera");
        this.n = new Paint();
        this.r = new Paint(1);
        new Path();
        this.x = 0.5f;
        this.y = false;
        this.E = null;
        this.F = 0.0f;
        this.G = new PointF[4];
        this.H = new PointF[4];
        this.I = new PointF[4];
        this.J = new PointF[4];
        for (int i10 = 0; i10 < 4; i10++) {
            this.G[i10] = new PointF(-1.0f, -1.0f);
            this.H[i10] = new PointF(-1.0f, -1.0f);
            this.I[i10] = new PointF(-1.0f, -1.0f);
            this.J[i10] = new PointF(-1.0f, -1.0f);
        }
        this.K = new RectF();
        this.L = new RectF();
        this.M = 0L;
        this.Q = 0;
        this.R = 0;
        this.U = false;
        this.V = null;
        this.W = null;
        this.Z = 0.0f;
        this.a0 = 0.0f;
        this.c0 = 0.0f;
        this.e0 = new m4(this, 2);
        this.f0 = 0.0f;
        this.g0 = 0L;
        this.X = i7;
        if (f0()) {
            Utilities.e.c(new j9(this, 5));
        }
        int o4 = org.telegram.messenger.bz.o();
        if (o4 == 0) {
            this.T = 8;
        } else if (o4 != 1) {
            this.T = 40;
        } else {
            this.T = 24;
        }
    }

    public static Bitmap e0(Bitmap bitmap) {
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

    public static Bitmap g0(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f10 = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f10, 85.0f, 85.0f, 85.0f, 0.0f, f10, 85.0f, 85.0f, 85.0f, 0.0f, f10, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void i0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static p9 j0(Activity activity, int i7, s9 s9Var) {
        if (activity == null) {
            return null;
        }
        p9 p9Var = new p9(activity, new org.telegram.ui.ActionBar.s4[]{new ActionBarLayout(activity, false)}, i7, s9Var);
        p9Var.G0(false);
        org.telegram.messenger.g0.m3(p9Var, false);
        org.telegram.messenger.g0.s3(p9Var, -16777216, false, null);
        p9Var.G0(false);
        p9Var.getWindow().addFlags(512);
        p9Var.show();
        return p9Var;
    }

    public static PointF[] k0(Point[] pointArr, int i7, int i10) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i11 = 0; i11 < pointArr.length; i11++) {
            Point point = pointArr[i11];
            pointFArr[i11] = new PointF(point.x / i7, point.y / i10);
        }
        return pointFArr;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.y;
        int i7 = this.X;
        hi0 hi0Var = null;
        if (z10) {
            this.actionBar.I(-1, false);
            this.actionBar.G(-1, false);
            this.actionBar.setTitleColor(-1);
        } else if (i7 == 0) {
            org.telegram.ui.ActionBar.u6.l(this.actionBar, 1, org.telegram.ui.ActionBar.n6.z6, null);
            org.telegram.ui.ActionBar.u6.l(this.actionBar, 3, org.telegram.ui.ActionBar.n6.u8, null);
            org.telegram.ui.ActionBar.u6.l(this.actionBar, 5, org.telegram.ui.ActionBar.n6.A8, null);
        } else {
            this.actionBar.I(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.z6, false), false);
            this.actionBar.G(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!org.telegram.messenger.g0.Q1() && !f0()) {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar.J && kVar.w == null) {
                View view = new View(kVar.getContext());
                kVar.w = view;
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.x8, view, kVar.K0);
                kVar.addView(kVar.w);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.w.getLayoutParams();
                layoutParams.height = org.telegram.messenger.g0.m;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                kVar.w.setLayoutParams(layoutParams);
            }
        }
        int i10 = 2;
        this.actionBar.setActionBarMenuOnItemClick(new x7(this, i10));
        this.n.setColor(2130706432);
        Paint paint = this.r;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        q9 q9Var = new q9(this, context);
        q9Var.setOnTouchListener(new gi.a(i10));
        this.fragmentView = q9Var;
        if (f0()) {
            this.fragmentView.postDelayed(new j9(this, 0), 450L);
        } else {
            d0();
        }
        if (i7 == 0) {
            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.n6.d6;
            org.telegram.ui.ActionBar.u6.h(i11, kVar2, null);
            org.telegram.ui.ActionBar.u6.h(i11, this.fragmentView, null);
        } else {
            this.actionBar.setBackgroundDrawable(null);
            this.actionBar.setAddToContainer(false);
            this.actionBar.setTitleColor(-1);
            this.actionBar.I(-1, false);
            this.actionBar.G(587202559, false);
            q9Var.setBackgroundColor(-16777216);
            q9Var.addView(this.actionBar);
        }
        if (i7 == 2 || i7 == 3) {
            this.actionBar.setTitle(org.telegram.messenger.gd.M0(2131753883, null));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.f80.c());
        paint2.setColor(i0.a.o(-1, 40));
        r9 r9Var = new r9(context, paint2);
        this.b = r9Var;
        r9Var.setGravity(1);
        this.b.setTextSize(1, 24.0f);
        q9Var.addView(this.b);
        TextView textView = new TextView(context);
        this.c = textView;
        if (i7 == 3) {
            textView.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.D6, false));
        } else {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.D6, null);
        }
        this.c.setGravity(1);
        this.c.setTextSize(1, 16.0f);
        q9Var.addView(this.c);
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        this.h.setGravity(81);
        this.h.setAlpha(0.0f);
        if (i7 == 0) {
            this.b.setText(org.telegram.messenger.gd.M0(2131747277, null));
            this.c.setText(org.telegram.messenger.gd.M0(2131747276, null));
            org.telegram.ui.ActionBar.u6.U(this.b, org.telegram.ui.ActionBar.n6.G6, null);
            this.h.setTypeface(Typeface.MONOSPACE);
        } else {
            if (i7 == 1 || i7 == 3) {
                this.b.setText(org.telegram.messenger.gd.M0(2131753883, null));
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.gd.M0(2131753886, null));
                String[] strArr = {org.telegram.messenger.gd.M0(2131753891, null), org.telegram.messenger.gd.M0(2131753881, null)};
                int i12 = 0;
                while (i12 < i10) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    int indexOf = spannableStringBuilder2.indexOf(42);
                    int i13 = indexOf + 1;
                    int indexOf2 = spannableStringBuilder2.indexOf(42, i13);
                    if (indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2) {
                        break;
                    }
                    this.b.setMovementMethod(new org.telegram.messenger.c0(false));
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i13, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.p41(strArr[i12], 0), i13, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(org.telegram.messenger.g0.o()), i13, indexOf2, 33);
                    i12++;
                    i10 = 2;
                }
                this.b.setLinkTextColor(-1);
                this.b.setTextSize(1, 16.0f);
                this.b.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                this.b.setPadding(0, 0, 0, 0);
                this.b.setText(spannableStringBuilder);
            }
            this.b.setTextColor(-1);
            if (i7 == 3) {
                this.c.setTextColor(-1711276033);
            }
            this.h.setTextSize(1, 16.0f);
            this.h.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
            hi0Var = null;
            this.h.setText(org.telegram.messenger.gd.M0(2131753885, null));
            q9Var.addView(this.h);
            ImageView imageView = new ImageView(context);
            this.s = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setImageResource(R.drawable.qr_flashlight);
            this.s.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.L(org.telegram.messenger.g0.L(60.0f), 587202559));
            q9Var.addView(this.s);
            this.s.setOnClickListener(new a(this, 10));
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            hi0Var = ((LaunchActivity) parentActivity).t1;
        }
        if (hi0Var != null && this.a == null) {
            f fVar = new f(hi0Var, 27);
            hi0Var.b.add(fVar);
            hi0Var.a();
            this.a = fVar;
        }
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public final void d0() {
        TextView textView;
        if (this.fragmentView == null || !CameraView.isCameraAllowed()) {
            return;
        }
        CameraController.getInstance().initCamera(null);
        CameraView cameraView = new CameraView(this.fragmentView.getContext(), false);
        this.d = cameraView;
        cameraView.setUseMaxPreview(true);
        this.d.setOptimizeForBarcode(true);
        this.d.setDelegate(new w0(this, 13));
        ((ViewGroup) this.fragmentView).addView(this.d, 0, c8.ma.c(-1.0f, -1));
        if (this.X != 0 || (textView = this.h) == null) {
            return;
        }
        this.d.addView(textView);
    }

    public final boolean f0() {
        int i7 = this.X;
        return i7 == 1 || i7 == 2 || i7 == 3;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (f0()) {
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.c, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.D6));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x002c A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:8:0x000f, B:63:0x001b, B:67:0x002c, B:69:0x0034, B:71:0x003c, B:73:0x0044, B:75:0x0048, B:77:0x004c, B:80:0x0054, B:82:0x0058, B:11:0x0074, B:85:0x0023), top: B:7:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(Bitmap bitmap) {
        t9 t9Var;
        org.telegram.messenger.ur j3;
        m4 m4Var = this.e0;
        if (this.d == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Size previewSize = this.d.getPreviewSize();
            org.telegram.messenger.ur urVar = null;
            int i7 = this.X;
            if (i7 == 0) {
                try {
                    j3 = MrzRecognizer.j(bitmap);
                } catch (Exception unused) {
                }
                if (j3 != null) {
                    urVar = j3;
                    if (urVar != null) {
                        if (!TextUtils.isEmpty(urVar.b)) {
                            if (!TextUtils.isEmpty(urVar.c)) {
                                if (!TextUtils.isEmpty(urVar.e)) {
                                    if (urVar.k != 0) {
                                        if (urVar.h != 0) {
                                            if (urVar.o) {
                                            }
                                        }
                                        if (urVar.n != 0) {
                                            this.O = true;
                                            CameraController.getInstance().stopPreview(this.d.getCameraSession());
                                            org.telegram.messenger.g0.g3(new k9(1, this, urVar));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    t9Var = this;
                }
                org.telegram.messenger.ur i10 = MrzRecognizer.i(bitmap);
                if (i10 != null) {
                    urVar = i10;
                }
                if (urVar != null) {
                }
                t9Var = this;
            } else {
                int min = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                t9Var = this;
                try {
                    h6.m l02 = t9Var.l0(previewSize, (previewSize.getWidth() - min) / 2, (previewSize.getHeight() - min) / 2, min, bitmap);
                    boolean z10 = t9Var.O;
                    if (z10) {
                        t9Var.R++;
                    }
                    if (l02 != null) {
                        t9Var.Q = 0;
                        String str = (String) l02.b;
                        t9Var.S = str;
                        if (!z10) {
                            t9Var.O = true;
                            t9Var.U = t9Var.N.c1(str, new j9(this, 7));
                            t9Var.P = SystemClock.elapsedRealtime();
                            org.telegram.messenger.g0.g3(new j9(this, 8));
                        }
                        org.telegram.messenger.g0.g3(new k9(2, this, l02));
                    } else if (z10) {
                        int i11 = t9Var.Q + 1;
                        t9Var.Q = i11;
                        if (i11 > 4 && !t9Var.U) {
                            t9Var.O = false;
                            t9Var.R = 0;
                            t9Var.S = null;
                            org.telegram.messenger.g0.g3(new j9(this, 8));
                            org.telegram.messenger.g0.h3(m4Var, 500L);
                            return;
                        }
                    }
                    if (((t9Var.R == 0 && l02 != null && ((RectF) l02.c) == null && !t9Var.U) || (SystemClock.elapsedRealtime() - t9Var.P > 1000 && !t9Var.U)) && t9Var.S != null) {
                        CameraView cameraView = t9Var.d;
                        if (cameraView != null && cameraView.getCameraSession() != null && i7 != 3) {
                            CameraController.getInstance().stopPreview(t9Var.d.getCameraSession());
                        }
                        org.telegram.messenger.g0.g3(new k9(0, this, t9Var.S));
                        if (i7 == 3) {
                            org.telegram.messenger.g0.g3(new j9(this, 1));
                        }
                    } else if (t9Var.O) {
                        t9Var.f.postDelayed(new j9(this, 2), Math.max(16L, (1000 / t9Var.T) - ((long) t9Var.f0)));
                    }
                } catch (Throwable unused2) {
                    org.telegram.messenger.g0.g3(new j9(this, 6));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    float f10 = t9Var.f0;
                    long j10 = t9Var.g0;
                    float f11 = (f10 * j10) + elapsedRealtime2;
                    long j11 = j10 + 1;
                    t9Var.g0 = j11;
                    t9Var.f0 = f11 / j11;
                    t9Var.g0 = Math.max(j11, 30L);
                    if (t9Var.O) {
                    }
                }
            }
        } catch (Throwable unused3) {
            t9Var = this;
        }
        long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime;
        float f102 = t9Var.f0;
        long j102 = t9Var.g0;
        float f112 = (f102 * j102) + elapsedRealtime22;
        long j112 = j102 + 1;
        t9Var.g0 = j112;
        t9Var.f0 = f112 / j112;
        t9Var.g0 = Math.max(j112, 30L);
        if (t9Var.O) {
            org.telegram.messenger.g0.h3(m4Var, 500L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.graphics.PointF[]] */
    public final h6.m l0(Size size, int i7, int i10, int i11, Bitmap bitmap) {
        h6.m mVar;
        h6.m mVar2;
        int i12;
        int i13;
        String str;
        PointF[] pointFArr;
        bc.d dVar;
        ?? r52;
        nd0 nd0Var;
        PointF[] pointFArr2;
        PointF[] pointFArr3;
        h6.m mVar3 = null;
        try {
            RectF rectF = new RectF();
            u8.n nVar = this.W;
            float f10 = Float.MIN_VALUE;
            float f11 = Float.MAX_VALUE;
            int i14 = 0;
            if (nVar != null && nVar.b.k()) {
                if (bitmap != null) {
                    nd0Var = new nd0(18);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    nd0Var.d = bitmap;
                    b7.d dVar2 = (b7.d) nd0Var.b;
                    dVar2.a = width;
                    dVar2.b = height;
                    i12 = bitmap.getWidth();
                    i13 = bitmap.getHeight();
                } else {
                    nd0Var = new nd0(18);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap == null) {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                    if (wrap.capacity() < width2 * height2) {
                        throw new IllegalArgumentException("Invalid image data size.");
                    }
                    nd0Var.c = wrap;
                    b7.d dVar3 = (b7.d) nd0Var.b;
                    dVar3.a = width2;
                    dVar3.b = height2;
                    i12 = size.getWidth();
                    i13 = size.getWidth();
                }
                SparseArray e12 = this.W.e1(nd0Var);
                if (e12.size() > 0) {
                    u8.m mVar4 = (u8.m) e12.valueAt(0);
                    str = mVar4.b;
                    Point[] pointArr = mVar4.e;
                    PointF[] k02 = k0(pointArr, i12, i13);
                    pointFArr3 = k02;
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
                        pointFArr2 = k02;
                        mVar2 = null;
                        pointFArr = pointFArr2;
                    }
                    rectF = null;
                    pointFArr2 = pointFArr3;
                    mVar2 = null;
                    pointFArr = pointFArr2;
                } else {
                    if (bitmap != null) {
                        Bitmap e02 = e0(bitmap);
                        bitmap.recycle();
                        nd0 nd0Var2 = new nd0(18);
                        int width3 = e02.getWidth();
                        int height3 = e02.getHeight();
                        nd0Var2.d = e02;
                        b7.d dVar4 = (b7.d) nd0Var2.b;
                        dVar4.a = width3;
                        dVar4.b = height3;
                        i12 = e02.getWidth();
                        i13 = e02.getHeight();
                        SparseArray e13 = this.W.e1(nd0Var2);
                        if (e13.size() > 0) {
                            u8.m mVar5 = (u8.m) e13.valueAt(0);
                            str = mVar5.b;
                            Point[] pointArr2 = mVar5.e;
                            PointF[] k03 = k0(pointArr2, i12, i13);
                            if (pointArr2.length == 0) {
                                pointFArr3 = k03;
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
                                pointFArr2 = k03;
                            }
                        } else {
                            Bitmap g02 = g0(e02);
                            e02.recycle();
                            nd0 nd0Var3 = new nd0(18);
                            int width4 = g02.getWidth();
                            int height4 = g02.getHeight();
                            nd0Var3.d = g02;
                            b7.d dVar5 = (b7.d) nd0Var3.b;
                            dVar5.a = width4;
                            dVar5.b = height4;
                            int width5 = e02.getWidth();
                            int height5 = e02.getHeight();
                            SparseArray e14 = this.W.e1(nd0Var3);
                            if (e14.size() > 0) {
                                u8.m mVar6 = (u8.m) e14.valueAt(0);
                                String str2 = mVar6.b;
                                Point[] pointArr3 = mVar6.e;
                                PointF[] k04 = k0(pointArr3, width5, height5);
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
                                pointFArr2 = k04;
                            } else {
                                i12 = width5;
                                i13 = height5;
                            }
                        }
                        mVar2 = null;
                        pointFArr = pointFArr2;
                    }
                    str = null;
                    pointFArr2 = null;
                    mVar2 = null;
                    pointFArr = pointFArr2;
                }
            } else if (this.V != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    dVar = new bc.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width6 = bitmap.getWidth();
                    i13 = bitmap.getHeight();
                    i12 = width6;
                } else {
                    bc.f fVar = new bc.f(size.getWidth(), size.getHeight(), i7, i10, i11, i11);
                    i12 = size.getWidth();
                    i13 = size.getHeight();
                    dVar = fVar;
                }
                android.support.v4.media.session.a0 q10 = this.V.q(new wf.b(new cc.g(dVar), 6));
                bc.j[] jVarArr = (bc.j[]) q10.c;
                String str3 = (String) q10.b;
                if (jVarArr == null || jVarArr.length == 0) {
                    mVar2 = null;
                    r52 = 0;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f18 = Float.MIN_VALUE;
                    float f19 = Float.MAX_VALUE;
                    int i15 = 0;
                    while (i15 < length4) {
                        bc.j jVar = jVarArr[i15];
                        float f20 = jVar.a;
                        mVar = mVar3;
                        try {
                            float f21 = jVar.b;
                            f11 = Math.min(f11, f20);
                            f10 = Math.max(f10, jVar.a);
                            f19 = Math.min(f19, f21);
                            f18 = Math.max(f18, f21);
                            i15++;
                            mVar3 = mVar;
                        } catch (Throwable unused) {
                            org.telegram.messenger.g0.g3(new j9(this, 6));
                            return mVar;
                        }
                    }
                    mVar2 = mVar3;
                    rectF.set(f11, f19, f10, f18);
                    if (jVarArr.length == 4) {
                        r52 = new PointF[4];
                        while (i14 < 4) {
                            bc.j jVar2 = jVarArr[i14];
                            r52[i14] = new PointF(jVar2.a / i12, jVar2.b / i13);
                            i14++;
                        }
                    } else {
                        r52 = mVar2;
                    }
                }
                str = str3;
                pointFArr = r52;
            } else {
                mVar2 = null;
                i12 = 1;
                i13 = 1;
                str = null;
                pointFArr = null;
            }
            if (TextUtils.isEmpty(str)) {
                org.telegram.messenger.g0.g3(new j9(this, 6));
                return mVar2;
            }
            if (this.X == 2 && !str.startsWith("tg://login?token=")) {
                org.telegram.messenger.g0.g3(new j9(this, 6));
                return mVar2;
            }
            h6.m mVar7 = new h6.m(23, false);
            if (rectF != null) {
                float L = org.telegram.messenger.g0.L(25.0f);
                float L2 = org.telegram.messenger.g0.L(15.0f);
                rectF.set(rectF.left - L, rectF.top - L2, rectF.right + L, rectF.bottom + L2);
                float f22 = i12;
                float f23 = i13;
                rectF.set(rectF.left / f22, rectF.top / f23, rectF.right / f22, rectF.bottom / f23);
            }
            mVar7.d = pointFArr;
            mVar7.c = rectF;
            mVar7.b = str;
            return mVar7;
        } catch (Throwable unused2) {
            mVar = null;
        }
    }

    public final void m0() {
        if (this.d0 == null) {
            this.d0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, r1) / 1.5f);
        float f10 = width;
        float height = this.fragmentView.getHeight();
        this.d0.set(((width - min) / 2.0f) / f10, ((r1 - min) / 2.0f) / height, ((width + min) / 2.0f) / f10, ((r1 + min) / 2.0f) / height);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        Point c12;
        if (i10 != -1 || i7 != 11 || intent == null || intent.getData() == null) {
            return;
        }
        try {
            c12 = org.telegram.messenger.g0.c1();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            h6.m l02 = l0(null, 0, 0, 0, org.telegram.messenger.ec.K(null, intent.getData(), c12.x, c12.y, true));
            if (l02 != null) {
                s9 s9Var = this.N;
                if (s9Var != null) {
                    s9Var.J((String) l02.b);
                }
                finishFragment();
            }
        } catch (Throwable th3) {
            th = th3;
            org.telegram.messenger.a8.g(th, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
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
            hi0 hi0Var = (hi0) fVar.b;
            if (hi0Var.b.remove(fVar)) {
                hi0Var.a();
            }
            this.a = null;
        }
        u8.n nVar = this.W;
        if (nVar != null) {
            nVar.X0();
        }
    }
}
