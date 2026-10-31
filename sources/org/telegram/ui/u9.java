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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class u9 extends org.telegram.ui.ActionBar.k2 {
    public o1.j D;
    public float E;
    public final PointF[] F;
    public final PointF[] G;
    public final PointF[] H;
    public final PointF[] I;
    public final RectF J;
    public final RectF K;
    public long L;
    public t9 M;
    public boolean N;
    public long O;
    public int P;
    public int Q;
    public String R;
    public final int S;
    public boolean T;
    public vh.w3 U;
    public r8.n V;
    public final int W;
    public ValueAnimator X;
    public float Y;
    public float Z;
    public e a;
    public o1.j a0;
    public r9 b;
    public float b0;
    public TextView c;
    public RectF c0;
    public CameraView d;
    public final m4 d0;
    public final HandlerThread e;
    public float e0;
    public Handler f;
    public long f0;
    public TextView h;
    public final Paint n;
    public final Paint r;
    public ImageView s;
    public AnimatorSet w;
    public float x;
    public boolean y;

    public u9(int i10) {
        super(null);
        this.e = new HandlerThread("ScanCamera");
        this.n = new Paint();
        this.r = new Paint(1);
        new Path();
        this.x = 0.5f;
        this.y = false;
        this.D = null;
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
        this.d0 = new m4(this, 2);
        this.e0 = 0.0f;
        this.f0 = 0L;
        this.W = i10;
        if (e0()) {
            Utilities.e.c(new k9(this, 5));
        }
        int o10 = org.telegram.messenger.tz.o();
        if (o10 == 0) {
            this.S = 8;
        } else if (o10 != 1) {
            this.S = 40;
        } else {
            this.S = 24;
        }
    }

    public static Bitmap d0(Bitmap bitmap) {
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

    public static Bitmap f0(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f7 = 90 * (-255.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{85.0f, 85.0f, 85.0f, 0.0f, f7, 85.0f, 85.0f, 85.0f, 0.0f, f7, 85.0f, 85.0f, 85.0f, 0.0f, f7, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static void h0(RectF rectF, PointF[] pointFArr) {
        pointFArr[0].set(rectF.left, rectF.top);
        pointFArr[1].set(rectF.right, rectF.top);
        pointFArr[2].set(rectF.right, rectF.bottom);
        pointFArr[3].set(rectF.left, rectF.bottom);
    }

    public static p9 i0(Activity activity, int i10, t9 t9Var) {
        if (activity == null) {
            return null;
        }
        p9 p9Var = new p9(activity, new org.telegram.ui.ActionBar.z4[]{new ActionBarLayout(activity, false)}, i10, t9Var);
        p9Var.G0(false);
        org.telegram.messenger.i0.m3(p9Var, false);
        org.telegram.messenger.i0.t3(p9Var, -16777216, false, null);
        p9Var.G0(false);
        p9Var.getWindow().addFlags(512);
        p9Var.show();
        return p9Var;
    }

    public static PointF[] j0(Point[] pointArr, int i10, int i11) {
        PointF[] pointFArr = new PointF[pointArr.length];
        for (int i12 = 0; i12 < pointArr.length; i12++) {
            Point point = pointArr[i12];
            pointFArr[i12] = new PointF(point.x / i10, point.y / i11);
        }
        return pointFArr;
    }

    public final void c0() {
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
        ((ViewGroup) this.fragmentView).addView(this.d, 0, w7.b6.c(-1.0f, -1));
        if (this.W != 0 || (textView = this.h) == null) {
            return;
        }
        this.d.addView(textView);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.y;
        int i10 = this.W;
        kj0 kj0Var = null;
        if (z10) {
            this.actionBar.D(-1, false);
            this.actionBar.C(-1, false);
            this.actionBar.setTitleColor(-1);
        } else if (i10 == 0) {
            org.telegram.ui.ActionBar.a7.m(this.actionBar, 1, org.telegram.ui.ActionBar.t6.z6, null);
            org.telegram.ui.ActionBar.a7.m(this.actionBar, 3, org.telegram.ui.ActionBar.t6.u8, null);
            org.telegram.ui.ActionBar.a7.m(this.actionBar, 5, org.telegram.ui.ActionBar.t6.A8, null);
        } else {
            this.actionBar.D(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.z6, false), false);
            this.actionBar.C(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.u8, false), false);
            this.actionBar.setTitleColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.A8, false));
        }
        this.actionBar.setCastShadows(false);
        if (!org.telegram.messenger.i0.Q1() && !e0()) {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar.I && lVar.w == null) {
                View view = new View(lVar.getContext());
                lVar.w = view;
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.x8, view, lVar.J0);
                lVar.addView(lVar.w);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lVar.w.getLayoutParams();
                layoutParams.height = org.telegram.messenger.i0.m;
                layoutParams.width = -1;
                layoutParams.gravity = 51;
                lVar.w.setLayoutParams(layoutParams);
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new ag.e(this, 19));
        this.n.setColor(2130706432);
        Paint paint = this.r;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        q9 q9Var = new q9(this, context);
        q9Var.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
        this.fragmentView = q9Var;
        if (e0()) {
            this.fragmentView.postDelayed(new k9(this, 0), 450L);
        } else {
            c0();
        }
        if (i10 == 0) {
            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.t6.d6;
            org.telegram.ui.ActionBar.a7.i(i11, lVar2, null);
            org.telegram.ui.ActionBar.a7.i(i11, this.fragmentView, null);
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
            this.actionBar.setTitle(org.telegram.messenger.cd.L0(2131753885, null));
        }
        Paint paint2 = new Paint(1);
        paint2.setPathEffect(org.telegram.ui.Components.k80.c());
        paint2.setColor(i0.b.o(-1, 40));
        r9 r9Var = new r9(context, paint2);
        this.b = r9Var;
        r9Var.setGravity(1);
        this.b.setTextSize(1, 24.0f);
        q9Var.addView(this.b);
        TextView textView = new TextView(context);
        this.c = textView;
        if (i10 == 3) {
            textView.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.D6, false));
        } else {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.D6, null);
        }
        this.c.setGravity(1);
        this.c.setTextSize(1, 16.0f);
        q9Var.addView(this.c);
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextColor(-1);
        this.h.setGravity(81);
        this.h.setAlpha(0.0f);
        if (i10 == 0) {
            this.b.setText(org.telegram.messenger.cd.L0(2131747486, null));
            this.c.setText(org.telegram.messenger.cd.L0(2131747485, null));
            org.telegram.ui.ActionBar.a7.V(this.b, org.telegram.ui.ActionBar.t6.G6, null);
            this.h.setTypeface(Typeface.MONOSPACE);
        } else {
            if (i10 == 1 || i10 == 3) {
                this.b.setText(org.telegram.messenger.cd.L0(2131753885, null));
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131753888, null));
                String[] strArr = {org.telegram.messenger.cd.L0(2131753893, null), org.telegram.messenger.cd.L0(2131753883, null)};
                int i12 = 0;
                for (int i13 = 2; i12 < i13; i13 = 2) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    int indexOf = spannableStringBuilder2.indexOf(42);
                    int i14 = indexOf + 1;
                    int indexOf2 = spannableStringBuilder2.indexOf(42, i14);
                    if (indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2) {
                        break;
                    }
                    this.b.setMovementMethod(new org.telegram.messenger.e0(false));
                    spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) " ");
                    spannableStringBuilder.replace(indexOf, i14, (CharSequence) " ");
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(strArr[i12], 0), i14, indexOf2, 33);
                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), i14, indexOf2, 33);
                    i12++;
                }
                this.b.setLinkTextColor(-1);
                this.b.setTextSize(1, 16.0f);
                this.b.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                this.b.setPadding(0, 0, 0, 0);
                this.b.setText(spannableStringBuilder);
            }
            this.b.setTextColor(-1);
            if (i10 == 3) {
                this.c.setTextColor(-1711276033);
            }
            this.h.setTextSize(1, 16.0f);
            this.h.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
            kj0Var = null;
            this.h.setText(org.telegram.messenger.cd.L0(2131753887, null));
            q9Var.addView(this.h);
            ImageView imageView = new ImageView(context);
            this.s = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.s.setImageResource(R.drawable.qr_flashlight);
            this.s.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(60.0f), 587202559));
            q9Var.addView(this.s);
            this.s.setOnClickListener(new a(this, 10));
        }
        Activity parentActivity = getParentActivity();
        if (parentActivity instanceof LaunchActivity) {
            kj0Var = ((LaunchActivity) parentActivity).u1;
        }
        if (kj0Var != null && this.a == null) {
            e eVar = new e(kj0Var, 26);
            kj0Var.b.add(eVar);
            kj0Var.a();
            this.a = eVar;
        }
        this.fragmentView.setKeepScreenOn(true);
        return this.fragmentView;
    }

    public final boolean e0() {
        int i10 = this.W;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x002c A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:8:0x000f, B:63:0x001b, B:67:0x002c, B:69:0x0034, B:71:0x003c, B:73:0x0044, B:75:0x0048, B:77:0x004c, B:80:0x0054, B:82:0x0058, B:11:0x0075, B:85:0x0023), top: B:7:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(Bitmap bitmap) {
        u9 u9Var;
        org.telegram.messenger.is j10;
        m4 m4Var = this.d0;
        if (this.d == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Size previewSize = this.d.getPreviewSize();
            org.telegram.messenger.is isVar = null;
            int i10 = this.W;
            if (i10 == 0) {
                try {
                    j10 = MrzRecognizer.j(bitmap);
                } catch (Exception unused) {
                }
                if (j10 != null) {
                    isVar = j10;
                    if (isVar != null) {
                        if (!TextUtils.isEmpty(isVar.b)) {
                            if (!TextUtils.isEmpty(isVar.c)) {
                                if (!TextUtils.isEmpty(isVar.e)) {
                                    if (isVar.k != 0) {
                                        if (isVar.h != 0) {
                                            if (isVar.o) {
                                            }
                                        }
                                        if (isVar.n != 0) {
                                            this.N = true;
                                            CameraController.getInstance().stopPreview(this.d.getCameraSession());
                                            org.telegram.messenger.i0.g3(new h0(10, this, isVar));
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    u9Var = this;
                }
                org.telegram.messenger.is i11 = MrzRecognizer.i(bitmap);
                if (i11 != null) {
                    isVar = i11;
                }
                if (isVar != null) {
                }
                u9Var = this;
            } else {
                int min = (int) (Math.min(previewSize.getWidth(), previewSize.getHeight()) / 1.5f);
                u9Var = this;
                try {
                    li.k k02 = u9Var.k0(previewSize, (previewSize.getWidth() - min) / 2, (previewSize.getHeight() - min) / 2, min, bitmap);
                    boolean z10 = u9Var.N;
                    if (z10) {
                        u9Var.Q++;
                    }
                    if (k02 != null) {
                        u9Var.P = 0;
                        String str = (String) k02.b;
                        u9Var.R = str;
                        if (!z10) {
                            u9Var.N = true;
                            u9Var.T = u9Var.M.i1(str, new k9(this, 7));
                            u9Var.O = SystemClock.elapsedRealtime();
                            org.telegram.messenger.i0.g3(new k9(this, 8));
                        }
                        org.telegram.messenger.i0.g3(new h0(11, this, k02));
                    } else if (z10) {
                        int i12 = u9Var.P + 1;
                        u9Var.P = i12;
                        if (i12 > 4 && !u9Var.T) {
                            u9Var.N = false;
                            u9Var.Q = 0;
                            u9Var.R = null;
                            org.telegram.messenger.i0.g3(new k9(this, 8));
                            org.telegram.messenger.i0.h3(m4Var, 500L);
                            return;
                        }
                    }
                    if (((u9Var.Q == 0 && k02 != null && ((RectF) k02.c) == null && !u9Var.T) || (SystemClock.elapsedRealtime() - u9Var.O > 1000 && !u9Var.T)) && u9Var.R != null) {
                        CameraView cameraView = u9Var.d;
                        if (cameraView != null && cameraView.getCameraSession() != null && i10 != 3) {
                            CameraController.getInstance().stopPreview(u9Var.d.getCameraSession());
                        }
                        org.telegram.messenger.i0.g3(new h0(9, this, u9Var.R));
                        if (i10 == 3) {
                            org.telegram.messenger.i0.g3(new k9(this, 1));
                        }
                    } else if (u9Var.N) {
                        u9Var.f.postDelayed(new k9(this, 2), Math.max(16L, (1000 / u9Var.S) - ((long) u9Var.e0)));
                    }
                } catch (Throwable unused2) {
                    org.telegram.messenger.i0.g3(new k9(this, 6));
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    float f7 = u9Var.e0;
                    long j11 = u9Var.f0;
                    float f10 = (f7 * j11) + elapsedRealtime2;
                    long j12 = j11 + 1;
                    u9Var.f0 = j12;
                    u9Var.e0 = f10 / j12;
                    u9Var.f0 = Math.max(j12, 30L);
                    if (u9Var.N) {
                    }
                }
            }
        } catch (Throwable unused3) {
            u9Var = this;
        }
        long elapsedRealtime22 = SystemClock.elapsedRealtime() - elapsedRealtime;
        float f72 = u9Var.e0;
        long j112 = u9Var.f0;
        float f102 = (f72 * j112) + elapsedRealtime22;
        long j122 = j112 + 1;
        u9Var.f0 = j122;
        u9Var.e0 = f102 / j122;
        u9Var.f0 = Math.max(j122, 30L);
        if (u9Var.N) {
            org.telegram.messenger.i0.h3(m4Var, 500L);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        if (e0()) {
            return arrayList;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c, 256, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.D6));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.graphics.PointF[]] */
    public final li.k k0(Size size, int i10, int i11, int i12, Bitmap bitmap) {
        li.k kVar;
        li.k kVar2;
        int i13;
        int i14;
        String str;
        PointF[] pointFArr;
        vb.d dVar;
        ?? r52;
        q5.d dVar2;
        PointF[] pointFArr2;
        PointF[] pointFArr3;
        li.k kVar3 = null;
        try {
            RectF rectF = new RectF();
            r8.n nVar = this.V;
            float f7 = Float.MIN_VALUE;
            float f10 = Float.MAX_VALUE;
            int i15 = 0;
            if (nVar != null && nVar.b.k()) {
                if (bitmap != null) {
                    dVar2 = new q5.d(1);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    dVar2.d = bitmap;
                    a3.l lVar = (a3.l) dVar2.b;
                    lVar.a = width;
                    lVar.b = height;
                    i13 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                } else {
                    dVar2 = new q5.d(1);
                    ByteBuffer wrap = ByteBuffer.wrap(null);
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (wrap == null) {
                        throw new IllegalArgumentException("Null image data supplied.");
                    }
                    if (wrap.capacity() < width2 * height2) {
                        throw new IllegalArgumentException("Invalid image data size.");
                    }
                    dVar2.c = wrap;
                    a3.l lVar2 = (a3.l) dVar2.b;
                    lVar2.a = width2;
                    lVar2.b = height2;
                    i13 = size.getWidth();
                    i14 = size.getWidth();
                }
                SparseArray e12 = this.V.e1(dVar2);
                if (e12.size() > 0) {
                    r8.m mVar = (r8.m) e12.valueAt(0);
                    str = mVar.b;
                    Point[] pointArr = mVar.e;
                    PointF[] j02 = j0(pointArr, i13, i14);
                    pointFArr3 = j02;
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
                        pointFArr2 = j02;
                        kVar2 = null;
                        pointFArr = pointFArr2;
                    }
                    rectF = null;
                    pointFArr2 = pointFArr3;
                    kVar2 = null;
                    pointFArr = pointFArr2;
                } else {
                    if (bitmap != null) {
                        Bitmap d02 = d0(bitmap);
                        bitmap.recycle();
                        q5.d dVar3 = new q5.d(1);
                        int width3 = d02.getWidth();
                        int height3 = d02.getHeight();
                        dVar3.d = d02;
                        a3.l lVar3 = (a3.l) dVar3.b;
                        lVar3.a = width3;
                        lVar3.b = height3;
                        i13 = d02.getWidth();
                        i14 = d02.getHeight();
                        SparseArray e13 = this.V.e1(dVar3);
                        if (e13.size() > 0) {
                            r8.m mVar2 = (r8.m) e13.valueAt(0);
                            str = mVar2.b;
                            Point[] pointArr2 = mVar2.e;
                            PointF[] j03 = j0(pointArr2, i13, i14);
                            if (pointArr2.length == 0) {
                                pointFArr3 = j03;
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
                                pointFArr2 = j03;
                            }
                        } else {
                            Bitmap f02 = f0(d02);
                            d02.recycle();
                            q5.d dVar4 = new q5.d(1);
                            int width4 = f02.getWidth();
                            int height4 = f02.getHeight();
                            dVar4.d = f02;
                            a3.l lVar4 = (a3.l) dVar4.b;
                            lVar4.a = width4;
                            lVar4.b = height4;
                            int width5 = d02.getWidth();
                            int height5 = d02.getHeight();
                            SparseArray e14 = this.V.e1(dVar4);
                            if (e14.size() > 0) {
                                r8.m mVar3 = (r8.m) e14.valueAt(0);
                                String str2 = mVar3.b;
                                Point[] pointArr3 = mVar3.e;
                                PointF[] j04 = j0(pointArr3, width5, height5);
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
                                pointFArr2 = j04;
                            } else {
                                i13 = width5;
                                i14 = height5;
                            }
                        }
                        kVar2 = null;
                        pointFArr = pointFArr2;
                    }
                    str = null;
                    pointFArr2 = null;
                    kVar2 = null;
                    pointFArr = pointFArr2;
                }
            } else if (this.U != null) {
                if (bitmap != null) {
                    int[] iArr = new int[bitmap.getWidth() * bitmap.getHeight()];
                    bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                    dVar = new vb.g(bitmap.getWidth(), bitmap.getHeight(), iArr);
                    int width6 = bitmap.getWidth();
                    i14 = bitmap.getHeight();
                    i13 = width6;
                } else {
                    vb.f fVar = new vb.f(size.getWidth(), size.getHeight(), i10, i11, i12, i12);
                    i13 = size.getWidth();
                    i14 = size.getHeight();
                    dVar = fVar;
                }
                q5.d a2 = this.U.a(new u9.b(new wb.e(dVar)));
                vb.j[] jVarArr = (vb.j[]) a2.c;
                String str3 = (String) a2.b;
                if (jVarArr == null || jVarArr.length == 0) {
                    kVar2 = null;
                    r52 = 0;
                    rectF = null;
                } else {
                    int length4 = jVarArr.length;
                    float f17 = Float.MIN_VALUE;
                    float f18 = Float.MAX_VALUE;
                    int i16 = 0;
                    while (i16 < length4) {
                        vb.j jVar = jVarArr[i16];
                        float f19 = jVar.a;
                        kVar = kVar3;
                        try {
                            float f20 = jVar.b;
                            f10 = Math.min(f10, f19);
                            f7 = Math.max(f7, jVar.a);
                            f18 = Math.min(f18, f20);
                            f17 = Math.max(f17, f20);
                            i16++;
                            kVar3 = kVar;
                        } catch (Throwable unused) {
                            org.telegram.messenger.i0.g3(new k9(this, 6));
                            return kVar;
                        }
                    }
                    kVar2 = kVar3;
                    rectF.set(f10, f18, f7, f17);
                    if (jVarArr.length == 4) {
                        r52 = new PointF[4];
                        while (i15 < 4) {
                            vb.j jVar2 = jVarArr[i15];
                            r52[i15] = new PointF(jVar2.a / i13, jVar2.b / i14);
                            i15++;
                        }
                    } else {
                        r52 = kVar2;
                    }
                }
                str = str3;
                pointFArr = r52;
            } else {
                kVar2 = null;
                i13 = 1;
                i14 = 1;
                str = null;
                pointFArr = null;
            }
            if (TextUtils.isEmpty(str)) {
                org.telegram.messenger.i0.g3(new k9(this, 6));
                return kVar2;
            }
            if (this.W == 2 && !str.startsWith("tg://login?token=")) {
                org.telegram.messenger.i0.g3(new k9(this, 6));
                return kVar2;
            }
            li.k kVar4 = new li.k(17, false);
            if (rectF != null) {
                float L = org.telegram.messenger.i0.L(25.0f);
                float L2 = org.telegram.messenger.i0.L(15.0f);
                rectF.set(rectF.left - L, rectF.top - L2, rectF.right + L, rectF.bottom + L2);
                float f21 = i13;
                float f22 = i14;
                rectF.set(rectF.left / f21, rectF.top / f22, rectF.right / f21, rectF.bottom / f22);
            }
            kVar4.d = pointFArr;
            kVar4.c = rectF;
            kVar4.b = str;
            return kVar4;
        } catch (Throwable unused2) {
            kVar = null;
        }
    }

    public final void l0() {
        if (this.c0 == null) {
            this.c0 = new RectF();
        }
        int width = this.fragmentView.getWidth();
        int min = (int) (Math.min(width, r1) / 1.5f);
        float f7 = width;
        float height = this.fragmentView.getHeight();
        this.c0.set(((width - min) / 2.0f) / f7, ((r1 - min) / 2.0f) / height, ((width + min) / 2.0f) / f7, ((r1 + min) / 2.0f) / height);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        Point c12;
        if (i11 != -1 || i10 != 11 || intent == null || intent.getData() == null) {
            return;
        }
        try {
            c12 = org.telegram.messenger.i0.c1();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            li.k k02 = k0(null, 0, 0, 0, org.telegram.messenger.hc.K(null, intent.getData(), c12.x, c12.y, true));
            if (k02 != null) {
                t9 t9Var = this.M;
                if (t9Var != null) {
                    t9Var.L((String) k02.b);
                }
                finishFragment();
            }
        } catch (Throwable th3) {
            th = th3;
            org.telegram.messenger.f8.g(th, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        CameraView cameraView = this.d;
        if (cameraView != null) {
            cameraView.destroy(false, null);
            this.d = null;
        }
        this.e.quitSafely();
        e eVar = this.a;
        if (eVar != null) {
            kj0 kj0Var = (kj0) eVar.b;
            if (kj0Var.b.remove(eVar)) {
                kj0Var.a();
            }
            this.a = null;
        }
        r8.n nVar = this.V;
        if (nVar != null) {
            nVar.X0();
        }
    }
}
