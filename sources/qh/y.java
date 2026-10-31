package qh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.t2;
import com.google.android.gms.internal.vision.x1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.k9;
import org.telegram.messenger.q20;
import org.telegram.messenger.r20;
import org.telegram.messenger.sc;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.r51;
import org.telegram.ui.px0;
import org.telegram.ui.zh;
import vh.w3;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y extends FrameLayout {
    public final Paint D;
    public final Paint E;
    public final k9 F;
    public final Drawable G;
    public final Drawable H;
    public final Drawable I;
    public final c2 J;
    public final TextPaint K;
    public String L;
    public final TextPaint M;
    public boolean N;
    public r20 O;
    public Runnable P;
    public StaticLayout Q;
    public final float R;
    public float S;
    public ValueAnimator T;
    public boolean U;
    public boolean V;
    public int W;
    public final x a;
    public float a0;
    public CameraView b;
    public float b0;
    public Object c;
    public float c0;
    public final RectF d;
    public boolean d0;
    public final RectF e;
    public float e0;
    public final RectF f;
    public final HandlerThread f0;
    public final Handler g0;
    public final RectF h;
    public volatile boolean h0;
    public r8.n i0;
    public w3 j0;
    public Bitmap k0;
    public boolean l0;
    public PointF[] m0;
    public final RectF n;
    public float n0;
    public Bitmap o0;
    public Bitmap p0;
    public final RectF q0;
    public final RectF r;
    public final Paint r0;
    public final RectF s;
    public BitmapShader s0;
    public final Paint t0;
    public final Matrix u0;
    public Bitmap v0;
    public final Path w;
    public final Paint w0;
    public final Path x;
    public final RectF x0;
    public final Paint y;
    public final ew y0;
    public static final gr z0 = new gr(0.05d, 0.7d, 0.1d, 1.0d);
    public static final gr A0 = new gr(0.3d, 0.0d, 0.1d, 1.0d);

    public y(Activity activity, RectF rectF, RectF rectF2, x xVar) {
        super(activity);
        RectF rectF3 = new RectF();
        this.d = rectF3;
        this.e = new RectF();
        RectF rectF4 = new RectF();
        this.f = rectF4;
        this.h = new RectF();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.w = new Path();
        this.x = new Path();
        this.y = new Paint(1);
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        int i10 = 3;
        this.F = new k9(3);
        c2 c2Var = new c2(true);
        this.J = c2Var;
        TextPaint textPaint = new TextPaint(1);
        this.K = textPaint;
        this.M = new TextPaint(1);
        this.O = new zh(11);
        this.W = -1;
        this.a0 = 1.0f;
        this.b0 = 1.0f;
        this.c0 = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.f0 = handlerThread;
        this.q0 = new RectF();
        int i11 = 2;
        this.r0 = new Paint(2);
        this.t0 = new Paint(3);
        this.u0 = new Matrix();
        this.w0 = new Paint(2);
        this.x0 = new RectF();
        this.y0 = new ew(this, 23);
        this.a = xVar;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        this.G = o(activity, R.drawable.msg_qr_scan);
        this.H = o(activity, R.drawable.qr_flashlight);
        this.I = o(activity, R.drawable.qr_gallery);
        c2Var.a(-1);
        c2Var.b(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(22.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(4.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setColor(-8697);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(6.0f));
        Activity W = org.telegram.messenger.i0.W(getContext());
        this.R = u.g(W != null ? W.getWindow().getDecorView() : this);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.g0 = handler;
        handler.post(new v(this, i11));
        invalidate();
        a(1.0f, 390L, new v(this, i10));
    }

    public static boolean c() {
        return u.f() && sc.e(256);
    }

    public static boolean d(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
            return false;
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[LOOP:0: B:6:0x0032->B:15:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db A[Catch: all -> 0x0108, Exception -> 0x010b, TryCatch #4 {Exception -> 0x010b, blocks: (B:38:0x00a0, B:40:0x00b9, B:41:0x00bf, B:46:0x00db, B:48:0x00e1, B:51:0x00e7, B:53:0x00eb, B:55:0x00ff, B:64:0x00d4), top: B:37:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb A[Catch: all -> 0x0108, Exception -> 0x010b, LOOP:2: B:52:0x00e9->B:53:0x00eb, LOOP_END, TryCatch #4 {Exception -> 0x010b, blocks: (B:38:0x00a0, B:40:0x00b9, B:41:0x00bf, B:46:0x00db, B:48:0x00e1, B:51:0x00e7, B:53:0x00eb, B:55:0x00ff, B:64:0x00d4), top: B:37:0x00a0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m4.c f(Bitmap bitmap, r8.n nVar, w3 w3Var, r20 r20Var) {
        boolean equals;
        int i10;
        boolean equals2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i11 = 0;
        if (nVar != null && nVar.b.k()) {
            q5.d dVar = new q5.d(1);
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            dVar.d = bitmap;
            a3.l lVar = (a3.l) dVar.b;
            lVar.a = width2;
            lVar.b = height2;
            SparseArray e12 = nVar.e1(dVar);
            for (int i12 = 0; i12 < e12.size(); i12++) {
                r8.m mVar = (r8.m) e12.valueAt(i12);
                String str = mVar.b;
                Point[] pointArr = mVar.e;
                String trim = str != null ? str.trim() : null;
                if (!TextUtils.isEmpty(trim)) {
                    try {
                        equals2 = Boolean.TRUE.equals(r20Var.a(trim));
                    } catch (Throwable th2) {
                        f8.g(th2, true);
                    }
                    if (!equals2) {
                        int length = pointArr != null ? pointArr.length : 0;
                        PointF[] pointFArr = new PointF[length];
                        while (i11 < length) {
                            Point point = pointArr[i11];
                            pointFArr[i11] = new PointF(point.x / width, point.y / height);
                            i11++;
                        }
                        return new m4.c(trim, pointFArr, false, 23);
                    }
                }
                equals2 = false;
                if (!equals2) {
                }
            }
        } else if (w3Var != null) {
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            try {
                q5.d a2 = w3Var.a(new u9.b(new wb.f(new vb.g(width, height, iArr))));
                String str2 = (String) a2.b;
                String trim2 = str2 != null ? str2.trim() : null;
                if (!TextUtils.isEmpty(trim2)) {
                    try {
                        equals = Boolean.TRUE.equals(r20Var.a(trim2));
                    } catch (Throwable th3) {
                        f8.g(th3, true);
                    }
                    if (!equals) {
                        vb.j[] jVarArr = (vb.j[]) a2.c;
                        if (jVarArr != null) {
                            i10 = 4;
                            if (jVarArr.length == 4) {
                                PointF[] pointFArr2 = new PointF[i10];
                                while (i11 < i10) {
                                    vb.j jVar = jVarArr[i11];
                                    pointFArr2[i11] = new PointF(jVar.a / width, jVar.b / height);
                                    i11++;
                                }
                                return new m4.c(trim2, pointFArr2, false, 23);
                            }
                        }
                        i10 = 0;
                        PointF[] pointFArr22 = new PointF[i10];
                        while (i11 < i10) {
                        }
                        return new m4.c(trim2, pointFArr22, false, 23);
                    }
                }
                equals = false;
                if (!equals) {
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean j(RectF rectF, float f7, float f10) {
        return f7 >= rectF.left - ((float) org.telegram.messenger.i0.L(8.0f)) && f7 <= rectF.right + ((float) org.telegram.messenger.i0.L(8.0f)) && f10 >= rectF.top - ((float) org.telegram.messenger.i0.L(8.0f)) && f10 <= rectF.bottom + ((float) org.telegram.messenger.i0.L(8.0f));
    }

    public static y k(r51 r51Var, View view, r20 r20Var, q20 q20Var, Runnable runnable) {
        z4 parentLayout = r51Var.getParentLayout();
        FrameLayout overlayContainerView = parentLayout != null ? parentLayout.getOverlayContainerView() : null;
        if (overlayContainerView == null || r51Var.getParentActivity() == null) {
            return null;
        }
        overlayContainerView.getLocationInWindow(new int[2]);
        view.getLocationInWindow(new int[2]);
        float min = Math.min(view.getWidth(), view.getHeight());
        float width = (view.getWidth() / 2.0f) + (r1[0] - r2[0]);
        float height = (view.getHeight() / 2.0f) + (r1[1] - r2[1]);
        float f7 = min / 2.0f;
        y yVar = new y(r51Var.getParentActivity(), new RectF(width - f7, height - f7, width + f7, height + f7), new RectF(), new m5.e(19, q20Var, runnable));
        yVar.setPlainButton(true);
        yVar.setAccept(r20Var);
        yVar.setOnGallery(new px0(r51Var, yVar, r20Var, q20Var, 13));
        overlayContainerView.addView(yVar, b6.c(-1.0f, -1));
        return yVar;
    }

    public static String l(Bitmap bitmap, r20 r20Var) {
        r8.n nVar;
        try {
            Context context = org.telegram.messenger.w0.b;
            x1 x1Var = new x1();
            x1Var.a = 256;
            nVar = new r8.n(new t2(context, x1Var));
        } catch (Throwable th2) {
            f8.g(th2, true);
            nVar = null;
        }
        try {
            m4.c f7 = f(bitmap, nVar, new w3(), r20Var);
            return f7 != null ? (String) f7.b : null;
        } finally {
            if (nVar != null) {
                nVar.X0();
            }
        }
    }

    public static Drawable o(Context context, int i10) {
        Drawable mutate = context.getDrawable(i10).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static void p(k2 k2Var, int i10, w wVar) {
        if (k2Var.isFinished) {
            return;
        }
        z4 parentLayout = k2Var.getParentLayout();
        if (parentLayout == null || ((parentLayout.getLastFragment() == k2Var && !((ActionBarLayout) parentLayout).A()) || i10 >= 40)) {
            wVar.run();
        } else {
            org.telegram.messenger.i0.h3(new org.telegram.ui.Wallet.x0(k2Var, i10, wVar, 9), 50L);
        }
    }

    public final void a(float f7, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, f7);
        ofFloat.addUpdateListener(new bg.k(this, 29));
        ofFloat.addListener(new androidx.fragment.app.g(this, runnable));
        ofFloat.setDuration((long) (Math.abs(f7 - this.S) * j10));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.T = ofFloat;
        ofFloat.start();
    }

    public final float b(float f7, float f10) {
        if (Math.abs(f7 - f10) < 0.005f) {
            return f10;
        }
        invalidate();
        return ((f10 - f7) * 0.3f) + f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        Path path;
        int i10;
        boolean z10;
        boolean z11;
        CameraView cameraView;
        Canvas canvas2 = canvas;
        float n10 = n();
        RectF rectF = this.d;
        float width = rectF.width() / 2.0f;
        float height = rectF.height() / 2.0f;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float T1 = org.telegram.messenger.i0.T1(centerX - width, 0.0f, n10);
        float T12 = org.telegram.messenger.i0.T1(centerY - height, 0.0f, n10);
        float T13 = org.telegram.messenger.i0.T1(centerX + width, getWidth(), n10);
        float T14 = org.telegram.messenger.i0.T1(centerY + height, getHeight(), n10);
        RectF rectF2 = this.e;
        rectF2.set(T1, T12, T13, T14);
        float T15 = org.telegram.messenger.i0.T1(rectF.height() / 2.0f, this.R, n());
        int save = canvas2.save();
        if (this.S < 1.0f) {
            Path path2 = this.w;
            path2.rewind();
            path2.addRoundRect(rectF2, T15, T15, Path.Direction.CW);
            canvas2.clipPath(path2);
        }
        float l4 = 1.0f - Utilities.l(n() / 0.35f);
        float l10 = Utilities.l(n() / 0.3f);
        Paint paint = this.y;
        if (l10 > 0.0f) {
            paint.setColor(-16777216);
            paint.setAlpha((int) (l10 * 255.0f));
            canvas2.drawRect(rectF2, paint);
        }
        int width2 = getWidth();
        int height2 = getHeight();
        if (this.S < 1.0f && width2 > 0 && height2 > 0) {
            float max = Math.max(rectF2.width() / width2, rectF2.height() / height2);
            canvas2.translate(rectF2.centerX(), rectF2.centerY());
            canvas2.scale(max, max);
            canvas2.translate((-width2) / 2.0f, (-height2) / 2.0f);
        }
        super.dispatchDraw(canvas);
        if (this.o0 != null) {
            int l11 = (int) (Utilities.l((n() - 0.15f) / 0.45f) * 255.0f);
            Paint paint2 = this.r0;
            paint2.setAlpha(l11);
            canvas2.drawBitmap(this.o0, (Rect) null, this.q0, paint2);
        }
        float l12 = Utilities.l((n() - 0.15f) / 0.45f);
        if (l12 > 0.0f) {
            float L = org.telegram.messenger.i0.L(14.0f);
            paint.setColor(TLObject.FLAG_30);
            paint.setAlpha((int) (64.0f * l12));
            int i11 = Build.VERSION.SDK_INT;
            RectF rectF3 = this.r;
            Path path3 = this.x;
            if (i11 >= 29) {
                float width3 = getWidth();
                float height3 = getHeight();
                RectF rectF4 = this.x0;
                rectF4.set(0.0f, 0.0f, width3, height3);
                canvas2.drawDoubleRoundRect(rectF4, 0.0f, 0.0f, rectF3, L, L, paint);
                path = path3;
            } else {
                path3.rewind();
                path = path3;
                path.setFillType(Path.FillType.EVEN_ODD);
                float width4 = getWidth();
                float height4 = getHeight();
                Path.Direction direction = Path.Direction.CW;
                path.addRect(0.0f, 0.0f, width4, height4, direction);
                path.addRoundRect(rectF3, L, L, direction);
                canvas2.drawPath(path, paint);
                path.setFillType(Path.FillType.WINDING);
            }
            float f13 = (1.0f - this.n0) * l12;
            f7 = 2.0f;
            if (f13 <= 0.004f) {
                f10 = 0.0f;
                f12 = 1.0f;
            } else {
                float L2 = org.telegram.messenger.i0.L(28.0f);
                f10 = 0.0f;
                Paint paint3 = this.D;
                f12 = 1.0f;
                int i12 = 1;
                int ceil = ((int) Math.ceil(paint3.getStrokeWidth() / 2.0f)) + 1;
                if (this.v0 == null) {
                    int ceil2 = (ceil * 2) + ((int) Math.ceil(L2));
                    this.v0 = Bitmap.createBitmap(ceil2, ceil2, Bitmap.Config.ARGB_8888);
                    Path path4 = new Path();
                    float f14 = ceil;
                    float f15 = L2 + f14;
                    path4.moveTo(f14, f15);
                    float f16 = L + f14;
                    path4.lineTo(f14, f16);
                    path4.quadTo(f14, f14, f16, f14);
                    path4.lineTo(f15, f14);
                    Paint paint4 = new Paint(paint3);
                    paint4.setAlpha(zs.e4);
                    new Canvas(this.v0).drawPath(path4, paint4);
                    this.v0.prepareToDraw();
                }
                Paint paint5 = this.w0;
                paint5.setAlpha((int) (f13 * 255.0f));
                int i13 = 0;
                while (i13 < 4) {
                    if (i13 != i12) {
                        i10 = 2;
                        if (i13 != 2) {
                            z10 = false;
                            z11 = i13 < i10;
                            canvas2.save();
                            canvas2.translate(!z10 ? rectF3.right : rectF3.left, !z11 ? rectF3.bottom : rectF3.top);
                            float f17 = -1.0f;
                            float f18 = !z10 ? -1.0f : 1.0f;
                            if (z11) {
                                f17 = 1.0f;
                            }
                            canvas2.scale(f18, f17);
                            float f19 = -ceil;
                            canvas2.drawBitmap(this.v0, f19, f19, paint5);
                            canvas2.restore();
                            i13++;
                            i12 = 1;
                        }
                    } else {
                        i10 = 2;
                    }
                    z10 = true;
                    if (i13 < i10) {
                    }
                    canvas2.save();
                    canvas2.translate(!z10 ? rectF3.right : rectF3.left, !z11 ? rectF3.bottom : rectF3.top);
                    float f172 = -1.0f;
                    if (!z10) {
                    }
                    if (z11) {
                    }
                    canvas2.scale(f18, f172);
                    float f192 = -ceil;
                    canvas2.drawBitmap(this.v0, f192, f192, paint5);
                    canvas2.restore();
                    i13++;
                    i12 = 1;
                }
            }
            if (this.Q != null) {
                canvas2.save();
                canvas2.translate((getWidth() / 2.0f) - (this.Q.getWidth() / 2.0f), (rectF3.top - org.telegram.messenger.i0.L(36.0f)) - this.Q.getHeight());
                this.K.setAlpha((int) (l12 * 255.0f));
                this.Q.draw(canvas2);
                canvas2.restore();
            }
            float b10 = b(this.n0, this.m0 != null ? f12 : f10);
            this.n0 = b10;
            PointF[] pointFArr = this.m0;
            if (pointFArr == null || pointFArr.length < 3 || (cameraView = this.b) == null || b10 <= f10) {
                f11 = T15;
            } else {
                TextureView textureView = cameraView.getTextureView();
                float left = textureView.getLeft() + this.b.getLeft();
                float top = textureView.getTop() + this.b.getTop();
                float right = textureView.getRight() + this.b.getLeft();
                float bottom = textureView.getBottom() + this.b.getTop();
                RectF rectF5 = this.s;
                rectF5.set(left, top, right, bottom);
                int min = Math.min(4, this.m0.length);
                float f20 = f10;
                float f21 = f20;
                for (int i14 = 0; i14 < min; i14++) {
                    PointF pointF = this.m0[i14];
                    f20 += pointF.x;
                    f21 += pointF.y;
                }
                float f22 = min;
                float width5 = (rectF5.width() * (f20 / f22)) + rectF5.left;
                float height5 = (rectF5.height() * (f21 / f22)) + rectF5.top;
                path.rewind();
                int i15 = 0;
                while (i15 < min) {
                    PointF[] pointFArr2 = this.m0;
                    PointF pointF2 = pointFArr2[((i15 + min) - 1) % min];
                    PointF pointF3 = pointFArr2[i15];
                    int i16 = i15 + 1;
                    PointF pointF4 = pointFArr2[i16 % min];
                    int i17 = min;
                    float width6 = (rectF5.width() * pointF3.x) + rectF5.left;
                    float height6 = (rectF5.height() * pointF3.y) + rectF5.top;
                    float width7 = (rectF5.width() * pointF2.x) + rectF5.left;
                    float height7 = (rectF5.height() * pointF2.y) + rectF5.top;
                    float width8 = (rectF5.width() * pointF4.x) + rectF5.left;
                    float height8 = (rectF5.height() * pointF4.y) + rectF5.top;
                    path.moveTo(c3.i0.z(width7, width6, 0.18f, width6), c3.i0.z(height7, height6, 0.18f, height6));
                    path.lineTo(width6, height6);
                    path.lineTo(((width8 - width6) * 0.18f) + width6, c3.i0.z(height8, height6, 0.18f, height6));
                    min = i17;
                    i15 = i16;
                    T15 = T15;
                }
                f11 = T15;
                canvas2.save();
                float T16 = org.telegram.messenger.i0.T1(0.5f, 1.1f, this.n0);
                canvas2.scale(T16, T16, width5, height5);
                int i18 = (int) (this.n0 * 255.0f * l12);
                Paint paint6 = this.E;
                paint6.setAlpha(i18);
                canvas2.drawPath(path, paint6);
                canvas2.restore();
            }
            this.a0 = b(this.a0, this.W == 0 ? 0.88f : f12);
            this.b0 = b(this.b0, this.W == 1 ? 0.88f : f12);
            this.c0 = b(this.c0, this.W != 2 ? f12 : 0.88f);
            this.e0 = b(this.e0, this.d0 ? f12 : f10);
            h(canvas2, this.f, this.a0, l12, null);
            h(canvas, this.h, this.b0, l12, this.H);
            if (this.P != null) {
                canvas2 = canvas;
                h(canvas2, this.n, this.c0, l12, this.I);
            } else {
                canvas2 = canvas;
            }
        } else {
            f7 = 2.0f;
            f10 = 0.0f;
            f11 = T15;
            f12 = 1.0f;
        }
        canvas2.restoreToCount(save);
        if (l4 <= f10 || this.N) {
            return;
        }
        Canvas canvas3 = canvas2;
        i(f11, l4, canvas3, rectF2, false);
        String str = this.L;
        Drawable drawable = this.G;
        if (str == null) {
            float L3 = ((int) (org.telegram.messenger.i0.L(22.0f) * f12)) / f7;
            drawable.setBounds((int) (rectF2.centerX() - L3), (int) (rectF2.centerY() - L3), (int) (rectF2.centerX() + L3), (int) (rectF2.centerY() + L3));
            drawable.setAlpha((int) (l4 * 255.0f));
            drawable.draw(canvas3);
            return;
        }
        float L4 = ((org.telegram.messenger.i0.L(10.0f) + org.telegram.messenger.i0.L(12.0f)) * f12) + rectF2.left;
        float L5 = ((int) (org.telegram.messenger.i0.L(20.0f) * f12)) / f7;
        drawable.setBounds((int) (L4 - L5), (int) (rectF2.centerY() - L5), (int) (L4 + L5), (int) (rectF2.centerY() + L5));
        int i19 = (int) (l4 * 255.0f);
        drawable.setAlpha(i19);
        drawable.draw(canvas3);
        TextPaint textPaint = this.M;
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f) * f12);
        textPaint.setAlpha(i19);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas3.drawText(this.L, ((org.telegram.messenger.i0.L(6.0f) + org.telegram.messenger.i0.L(20.0f) + org.telegram.messenger.i0.L(12.0f)) * f12) + rectF2.left, rectF2.centerY() - ((fontMetrics.ascent + fontMetrics.descent) / f7), textPaint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.S >= 1.0f && !this.U) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.n;
            RectF rectF2 = this.h;
            RectF rectF3 = this.f;
            int i10 = -1;
            if (actionMasked == 0) {
                if (j(rectF3, x10, y3)) {
                    i10 = 0;
                } else if (j(rectF2, x10, y3)) {
                    i10 = 1;
                } else if (this.P != null && j(rectF, x10, y3)) {
                    i10 = 2;
                }
                this.W = i10;
                invalidate();
            } else {
                if (actionMasked == 1) {
                    int i11 = this.W;
                    if (i11 == 0) {
                        performHapticFeedback(3);
                        e();
                    } else if (i11 == 1) {
                        performHapticFeedback(3);
                        CameraView cameraView = this.b;
                        CameraSessionWrapper cameraSession = cameraView != null ? cameraView.getCameraSession() : null;
                        if (cameraSession != null) {
                            boolean z10 = this.d0;
                            this.d0 = !z10;
                            cameraSession.setCurrentFlashMode(!z10 ? "torch" : "off");
                            invalidate();
                        }
                    } else if (i11 != 2 || this.P == null) {
                        CameraView cameraView2 = this.b;
                        if (cameraView2 != null) {
                            cameraView2.focusToPoint((int) x10, (int) y3);
                        }
                    } else {
                        performHapticFeedback(3);
                        this.P.run();
                    }
                    this.W = -1;
                    invalidate();
                    return true;
                }
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.W = -1;
                        invalidate();
                        return true;
                    }
                } else if ((this.W == 0 && !j(rectF3, x10, y3)) || ((this.W == 1 && !j(rectF2, x10, y3)) || (this.W == 2 && !j(rectF, x10, y3)))) {
                    this.W = -1;
                    invalidate();
                    return true;
                }
            }
        }
        return true;
    }

    public final void e() {
        TextureView textureView;
        if (this.U || this.V) {
            return;
        }
        this.U = true;
        this.h0 = false;
        Matrix matrix = this.u0;
        RectF rectF = this.q0;
        CameraView cameraView = this.b;
        if (cameraView != null && cameraView.getAlpha() >= 0.5f && (textureView = cameraView.getTextureView()) != null && textureView.isAvailable() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
            try {
                this.o0 = textureView.getBitmap(Math.max(1, textureView.getWidth() / 2), Math.max(1, textureView.getHeight() / 2));
            } catch (Throwable th2) {
                f8.g(th2, true);
                this.o0 = null;
            }
            if (this.o0 != null) {
                rectF.set(textureView.getLeft() + cameraView.getLeft(), textureView.getTop() + cameraView.getTop(), textureView.getRight() + cameraView.getLeft(), textureView.getBottom() + cameraView.getTop());
                if (c()) {
                    Bitmap bitmap = this.o0;
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 8), Math.max(1, this.o0.getHeight() / 8), true);
                    this.p0 = createScaledBitmap;
                    Utilities.stackBlurBitmap(createScaledBitmap, 6);
                    Bitmap bitmap2 = this.p0;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                    matrix.setScale(rectF.width() / this.p0.getWidth(), rectF.height() / this.p0.getHeight());
                    matrix.postTranslate(rectF.left, rectF.top);
                    this.s0.setLocalMatrix(matrix);
                    this.t0.setShader(this.s0);
                }
            }
        }
        m();
        a(0.0f, 330L, new v(this, 0));
    }

    public final void g() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.h0 = false;
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.T = null;
        }
        m();
        this.g0.removeCallbacksAndMessages(null);
        this.g0.post(new v(this, 1));
    }

    public final void h(Canvas canvas, RectF rectF, float f7, float f10, Drawable drawable) {
        canvas.save();
        canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        i(height, f10, canvas, rectF, true);
        if (drawable == this.H && this.e0 > 0.0f) {
            Paint paint = this.y;
            paint.setColor(-1);
            paint.setAlpha((int) (this.e0 * 102.0f * f10));
            canvas.drawRoundRect(rectF, height, height, paint);
        }
        if (drawable != null) {
            int L = org.telegram.messenger.i0.L(28.0f);
            float centerX = rectF.centerX();
            float f11 = L / 2.0f;
            drawable.setBounds((int) (centerX - f11), (int) (rectF.centerY() - f11), (int) (rectF.centerX() + f11), (int) (rectF.centerY() + f11));
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
        } else {
            c2 c2Var = this.J;
            c2Var.setAlpha((int) (f10 * 255.0f));
            canvas.save();
            canvas.translate(rectF.centerX() - (org.telegram.messenger.i0.L(24.0f) / 2.0f), rectF.centerY() - (org.telegram.messenger.i0.L(24.0f) / 2.0f));
            c2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void i(float f7, float f10, Canvas canvas, RectF rectF, boolean z10) {
        boolean z11;
        if (f10 <= 0.0f) {
            return;
        }
        int l4 = (int) (Utilities.l(y0.b[3] / 100.0f) * 255.0f);
        Paint paint = this.y;
        if (z10) {
            if (this.b != null && canvas.isHardwareAccelerated() && c()) {
                if (this.c == null) {
                    this.c = this.b.getBlurRenderNode();
                    invalidate();
                }
                z11 = u.e(this.c);
            } else {
                z11 = false;
            }
            if (z11) {
                Path path = this.x;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.b.getLeft(), this.b.getTop());
                u.h(this.c, f10);
                u.c(canvas, this.c);
                canvas.restore();
                paint.setColor((l4 << 24) | 16777215);
                paint.setAlpha((int) (l4 * f10));
                canvas.drawRect(rectF, paint);
                t.b(canvas, rectF, f10);
                canvas.restore();
                this.F.a(canvas, rectF, f7, 0, f10);
            }
        }
        if (!z10 || this.p0 == null) {
            paint.setColor(i0.b.k((l4 << 24) | 16777215, c() ? 687865856 : TLObject.FLAG_31));
            paint.setAlpha((int) (Color.alpha(paint.getColor()) * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            t.c(canvas, rectF, f7, f10);
        } else {
            Paint paint2 = this.t0;
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint2);
            paint.setColor((l4 << 24) | 16777215);
            paint.setAlpha((int) (l4 * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            t.c(canvas, rectF, f7, f10);
        }
        this.F.a(canvas, rectF, f7, 0, f10);
    }

    public final void m() {
        CameraView cameraView = this.b;
        if (cameraView == null) {
            return;
        }
        this.b = null;
        this.c = null;
        CameraSessionWrapper cameraSession = cameraView.getCameraSession();
        if (this.d0 && cameraSession != null) {
            cameraSession.setCurrentFlashMode("off");
        }
        cameraView.animate().cancel();
        cameraView.destroy(true, null);
        removeView(cameraView);
    }

    public final float n() {
        if (this.U) {
            return 1.0f - A0.getInterpolation(1.0f - this.S);
        }
        return z0.getInterpolation(Utilities.l(this.S));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f7;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        float min = Math.min(i14, r2) * 0.66f;
        float L = ((i13 - i11) / 2.0f) - org.telegram.messenger.i0.L(20.0f);
        float f10 = i14 / 2.0f;
        float f11 = min / 2.0f;
        float f12 = f10 - f11;
        float f13 = L - f11;
        float f14 = f10 + f11;
        float f15 = L + f11;
        RectF rectF = this.r;
        rectF.set(f12, f13, f14, f15);
        float L2 = org.telegram.messenger.i0.L(56.0f);
        float L3 = rectF.bottom + org.telegram.messenger.i0.L(64.0f);
        if (this.P != null) {
            f7 = (L2 / 2.0f) + org.telegram.messenger.i0.L(35.0f) + f10;
        } else {
            f7 = f10;
        }
        float f16 = L2 / 2.0f;
        float f17 = L2 + L3;
        this.h.set(f7 - f16, L3, f7 + f16, f17);
        float L4 = (f10 - org.telegram.messenger.i0.L(35.0f)) - f16;
        this.n.set(L4 - f16, L3, L4 + f16, f17);
        this.Q = new StaticLayout(cd.L0(2131745878, null), this.K, i0.a.d(72.0f, i14, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f;
        if (!rectF2.isEmpty()) {
            return;
        }
        String[] strArr = x0.B9;
        int i15 = org.telegram.messenger.i0.m;
        View view = this;
        int i16 = 0;
        while (true) {
            int top = view.getTop() + i16;
            if (!(view.getParent() instanceof View)) {
                float currentActionBarHeight = (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f) + Math.max(0, i15 - top);
                rectF2.set(org.telegram.messenger.i0.L(9.0f), currentActionBarHeight - org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(49.0f), currentActionBarHeight + org.telegram.messenger.i0.L(20.0f));
                return;
            }
            view = (View) view.getParent();
            i16 = top - view.getScrollY();
        }
    }

    public void setAccept(r20 r20Var) {
        this.O = r20Var;
    }

    public void setButtonLabel(String str) {
        this.L = str;
        Typeface o10 = org.telegram.messenger.i0.o();
        TextPaint textPaint = this.M;
        textPaint.setTypeface(o10);
        textPaint.setColor(-1);
        invalidate();
    }

    public void setOnGallery(Runnable runnable) {
        this.P = runnable;
        requestLayout();
        invalidate();
    }

    public void setPlainButton(boolean z10) {
        this.N = z10;
        invalidate();
    }
}
