// default package

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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yv8 extends FrameLayout {
    public static final s33 A0 = new s33(0.05d, 0.7d, 0.1d, 1.0d);
    public static final s33 B0 = new s33(0.3d, 0.0d, 0.1d, 1.0d);
    public final Paint E;
    public final Paint F;
    public final nm4 G;
    public final Drawable H;
    public final Drawable I;
    public final Drawable J;
    public final ed0 K;
    public final TextPaint L;
    public String M;
    public final TextPaint N;
    public boolean O;
    public q8c P;
    public Runnable Q;
    public StaticLayout R;
    public final float S;
    public float T;
    public ValueAnimator U;
    public boolean V;
    public boolean W;
    public final xv8 a;
    public int a0;
    public CameraView b;
    public float b0;
    public Object c;
    public float c0;
    public final RectF d;
    public float d0;
    public final RectF e;
    public boolean e0;
    public final RectF f;
    public float f0;
    public final HandlerThread g0;
    public final RectF h;
    public final Handler h0;
    public volatile boolean i0;
    public ye0 j0;
    public ln8 k0;
    public Bitmap l0;
    public boolean m0;
    public final RectF n;
    public PointF[] n0;
    public float o0;
    public Bitmap p0;
    public Bitmap q0;
    public final RectF r;
    public final RectF r0;
    public final RectF s;
    public final Paint s0;
    public BitmapShader t0;
    public final Paint u0;
    public final Matrix v0;
    public final Path w;
    public Bitmap w0;
    public final Path x;
    public final Paint x0;
    public final Paint y;
    public final RectF y0;
    public final bg7 z0;

    public yv8(Activity activity, RectF rectF, RectF rectF2, xv8 xv8Var) {
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
        this.E = paint;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new nm4();
        ed0 ed0Var = new ed0(true);
        this.K = ed0Var;
        TextPaint textPaint = new TextPaint(1);
        this.L = textPaint;
        this.N = new TextPaint(1);
        this.P = new pb((byte) 8);
        this.a0 = -1;
        this.b0 = 1.0f;
        this.c0 = 1.0f;
        this.d0 = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.g0 = handlerThread;
        this.r0 = new RectF();
        byte b = 2;
        this.s0 = new Paint(2);
        byte b2 = 3;
        this.u0 = new Paint(3);
        this.v0 = new Matrix();
        this.x0 = new Paint(2);
        this.y0 = new RectF();
        this.z0 = new bg7(this, (byte) 11);
        this.a = xv8Var;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        this.H = o(activity, R.drawable.msg_qr_scan);
        this.I = o(activity, R.drawable.qr_flashlight);
        this.J = o(activity, R.drawable.qr_gallery);
        ed0Var.a(-1);
        ed0Var.b(-1);
        textPaint.setColor(-1);
        de9.p(textPaint, gl.L(22.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setColor(-1);
        paint.setStrokeWidth(gl.L(4.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setColor(-8697);
        paint2.setStrokeWidth(gl.L(6.0f));
        Activity W = gl.W(getContext());
        this.S = yz.r(W != null ? W.getWindow().getDecorView() : this);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.h0 = handler;
        handler.post(new vv8(this, b));
        invalidate();
        a(1.0f, 390L, new vv8(this, b2));
    }

    public static boolean c() {
        return yz.o() && e66.e(256);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x006f A[LOOP:0: B:6:0x003c->B:15:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db A[Catch: all -> 0x0101, Exception -> 0x0103, TryCatch #4 {Exception -> 0x0103, blocks: (B:38:0x00a6, B:42:0x00db, B:45:0x00e3, B:47:0x00e7, B:49:0x00fb, B:56:0x00d5, B:53:0x00c9), top: B:37:0x00a6, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static sk4 f(Bitmap bitmap, ye0 ye0Var, ln8 ln8Var, q8c q8cVar) {
        boolean equals;
        boolean equals2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        byte b = 17;
        int i = 0;
        if (ye0Var != null && ye0Var.b.k()) {
            xl3 xl3Var = new xl3((byte) 4);
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            xl3Var.d = bitmap;
            pc0 pc0Var = (pc0) xl3Var.b;
            pc0Var.a = width2;
            pc0Var.b = height2;
            SparseArray h = ye0Var.h(xl3Var);
            for (int i2 = 0; i2 < h.size(); i2++) {
                xe0 xe0Var = (xe0) h.valueAt(i2);
                String str = xe0Var.b;
                Point[] pointArr = xe0Var.e;
                String trim = str != null ? str.trim() : null;
                if (!TextUtils.isEmpty(trim)) {
                    try {
                        equals2 = Boolean.TRUE.equals(q8cVar.a(trim));
                    } catch (Throwable th) {
                        fa4.g(th, true);
                    }
                    if (!equals2) {
                        int length = pointArr != null ? pointArr.length : 0;
                        PointF[] pointFArr = new PointF[length];
                        while (i < length) {
                            Point point = pointArr[i];
                            pointFArr[i] = new PointF(point.x / width, point.y / height);
                            i++;
                        }
                        return new sk4(trim, pointFArr, b);
                    }
                }
                equals2 = false;
                if (!equals2) {
                }
            }
        } else if (ln8Var != null) {
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            try {
                xl3 q = ln8Var.q(new tg2((Object) new tg5(new ky8(width, height, iArr)), (byte) 9));
                String trim2 = ((String) q.c).trim();
                if (!TextUtils.isEmpty(trim2)) {
                    try {
                        equals = Boolean.TRUE.equals(q8cVar.a(trim2));
                    } catch (Throwable th2) {
                        fa4.g(th2, true);
                    }
                    if (equals) {
                        wa9[] wa9VarArr = (wa9[]) q.b;
                        int i3 = wa9VarArr.length != 4 ? 0 : 4;
                        PointF[] pointFArr2 = new PointF[i3];
                        while (i < i3) {
                            wa9 wa9Var = wa9VarArr[i];
                            pointFArr2[i] = new PointF(wa9Var.a / width, wa9Var.b / height);
                            i++;
                        }
                        return new sk4(trim2, pointFArr2, b);
                    }
                }
                equals = false;
                if (equals) {
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static boolean j(float f, float f2, RectF rectF) {
        return f >= rectF.left - ((float) gl.L(8.0f)) && f <= rectF.right + ((float) gl.L(8.0f)) && f2 >= rectF.top - ((float) gl.L(8.0f)) && f2 <= rectF.bottom + ((float) gl.L(8.0f));
    }

    public static yv8 k(n5c n5cVar, View view, q8c q8cVar, p8c p8cVar, Runnable runnable) {
        ui5 parentLayout = n5cVar.getParentLayout();
        FrameLayout overlayContainerView = parentLayout != null ? parentLayout.getOverlayContainerView() : null;
        if (overlayContainerView == null || n5cVar.getParentActivity() == null) {
            return null;
        }
        overlayContainerView.getLocationInWindow(new int[2]);
        view.getLocationInWindow(new int[2]);
        float min = Math.min(view.getWidth(), view.getHeight());
        float width = (view.getWidth() / 2.0f) + (r1[0] - r2[0]);
        float height = (view.getHeight() / 2.0f) + (r1[1] - r2[1]);
        float f = min / 2.0f;
        yv8 yv8Var = new yv8(n5cVar.getParentActivity(), new RectF(width - f, height - f, width + f, height + f), new RectF(), new wk4((Object) p8cVar, (Object) runnable, (byte) 20));
        yv8Var.setPlainButton(true);
        yv8Var.setAccept(q8cVar);
        yv8Var.setOnGallery(new bm8((Object) n5cVar, (Object) yv8Var, (Object) q8cVar, (Object) p8cVar, (byte) 4));
        overlayContainerView.addView(yv8Var, nme.c(-1.0f, -1));
        return yv8Var;
    }

    public static String l(Bitmap bitmap, q8c q8cVar) {
        ye0 ye0Var;
        try {
            Context context = a.b;
            zre zreVar = new zre();
            zreVar.a = 256;
            ye0Var = new ye0(new jbd(context, zreVar));
        } catch (Throwable th) {
            fa4.g(th, true);
            ye0Var = null;
        }
        try {
            sk4 f = f(bitmap, ye0Var, new ln8((byte) 1), q8cVar);
            return f != null ? (String) f.b : null;
        } finally {
            if (ye0Var != null) {
                ye0Var.d();
            }
        }
    }

    public static Drawable o(Activity activity, int i) {
        Drawable mutate = activity.getDrawable(i).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        return mutate;
    }

    public static void p(d dVar, int i, wv8 wv8Var) {
        if (dVar.isFinished) {
            return;
        }
        ui5 parentLayout = dVar.getParentLayout();
        if (parentLayout == null || ((parentLayout.getLastFragment() == dVar && !((ActionBarLayout) parentLayout).z()) || i >= 40)) {
            wv8Var.run();
        } else {
            gl.d3(new j45((Object) dVar, i, (Object) wv8Var, (byte) 28), 50L);
        }
    }

    public final void a(float f, long j, Runnable runnable) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, f);
        ofFloat.addUpdateListener(new u28(this, (byte) 21));
        ofFloat.addListener(new qw(this, runnable, (byte) 8));
        ofFloat.setDuration((long) (Math.abs(f - this.T) * j));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.U = ofFloat;
        ofFloat.start();
    }

    public final float b(float f, float f2) {
        if (Math.abs(f - f2) < 0.005f) {
            return f2;
        }
        invalidate();
        return ((f2 - f) * 0.3f) + f;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0214  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        Path path;
        int i;
        boolean z;
        boolean z2;
        CameraView cameraView;
        Canvas canvas2 = canvas;
        float n = n();
        RectF rectF = this.d;
        float width = rectF.width() / 2.0f;
        float height = rectF.height() / 2.0f;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float R1 = gl.R1(centerX - width, 0.0f, n);
        float R12 = gl.R1(centerY - height, 0.0f, n);
        float R13 = gl.R1(centerX + width, getWidth(), n);
        float R14 = gl.R1(centerY + height, getHeight(), n);
        RectF rectF2 = this.e;
        rectF2.set(R1, R12, R13, R14);
        float R15 = gl.R1(rectF.height() / 2.0f, this.S, n());
        int save = canvas2.save();
        if (this.T < 1.0f) {
            Path path2 = this.w;
            path2.rewind();
            path2.addRoundRect(rectF2, R15, R15, Path.Direction.CW);
            canvas2.clipPath(path2);
        }
        float l = 1.0f - Utilities.l(n() / 0.35f);
        float l2 = Utilities.l(n() / 0.3f);
        Paint paint = this.y;
        if (l2 > 0.0f) {
            paint.setColor(-16777216);
            paint.setAlpha((int) (l2 * 255.0f));
            canvas2.drawRect(rectF2, paint);
        }
        int width2 = getWidth();
        int height2 = getHeight();
        if (this.T < 1.0f && width2 > 0 && height2 > 0) {
            float max = Math.max(rectF2.width() / width2, rectF2.height() / height2);
            canvas2.translate(rectF2.centerX(), rectF2.centerY());
            canvas2.scale(max, max);
            canvas2.translate((-width2) / 2.0f, (-height2) / 2.0f);
        }
        super.dispatchDraw(canvas);
        if (this.p0 != null) {
            int l3 = (int) (Utilities.l((n() - 0.15f) / 0.45f) * 255.0f);
            Paint paint2 = this.s0;
            paint2.setAlpha(l3);
            canvas2.drawBitmap(this.p0, (Rect) null, this.r0, paint2);
        }
        float l4 = Utilities.l((n() - 0.15f) / 0.45f);
        if (l4 > 0.0f) {
            float L = gl.L(14.0f);
            paint.setColor(TLObject.FLAG_30);
            paint.setAlpha((int) (64.0f * l4));
            int i2 = Build.VERSION.SDK_INT;
            RectF rectF3 = this.r;
            Path path3 = this.x;
            if (i2 >= 29) {
                float width3 = getWidth();
                float height3 = getHeight();
                RectF rectF4 = this.y0;
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
            float f5 = (1.0f - this.o0) * l4;
            f = 2.0f;
            if (f5 <= 0.004f) {
                f2 = 0.0f;
                f4 = 1.0f;
            } else {
                float L2 = gl.L(28.0f);
                f2 = 0.0f;
                Paint paint3 = this.E;
                f4 = 1.0f;
                int i3 = 1;
                int ceil = ((int) Math.ceil(paint3.getStrokeWidth() / 2.0f)) + 1;
                if (this.w0 == null) {
                    int ceil2 = ((int) Math.ceil(L2)) + (ceil << 1);
                    this.w0 = Bitmap.createBitmap(ceil2, ceil2, Bitmap.Config.ARGB_8888);
                    Path path4 = new Path();
                    float f6 = ceil;
                    float f7 = L2 + f6;
                    path4.moveTo(f6, f7);
                    float f8 = L + f6;
                    path4.lineTo(f6, f8);
                    path4.quadTo(f6, f6, f8, f6);
                    path4.lineTo(f7, f6);
                    Paint paint4 = new Paint(paint3);
                    paint4.setAlpha(kk7.d4);
                    new Canvas(this.w0).drawPath(path4, paint4);
                    this.w0.prepareToDraw();
                }
                Paint paint5 = this.x0;
                paint5.setAlpha((int) (f5 * 255.0f));
                int i4 = 0;
                while (i4 < 4) {
                    if (i4 != i3) {
                        i = 2;
                        if (i4 != 2) {
                            z = false;
                            z2 = i4 < i;
                            canvas2.save();
                            canvas2.translate(!z ? rectF3.right : rectF3.left, !z2 ? rectF3.bottom : rectF3.top);
                            float f9 = -1.0f;
                            float f10 = !z ? -1.0f : 1.0f;
                            if (z2) {
                                f9 = 1.0f;
                            }
                            canvas2.scale(f10, f9);
                            float f11 = -ceil;
                            canvas2.drawBitmap(this.w0, f11, f11, paint5);
                            canvas2.restore();
                            i4++;
                            i3 = 1;
                        }
                    } else {
                        i = 2;
                    }
                    z = true;
                    if (i4 < i) {
                    }
                    canvas2.save();
                    canvas2.translate(!z ? rectF3.right : rectF3.left, !z2 ? rectF3.bottom : rectF3.top);
                    float f92 = -1.0f;
                    if (!z) {
                    }
                    if (z2) {
                    }
                    canvas2.scale(f10, f92);
                    float f112 = -ceil;
                    canvas2.drawBitmap(this.w0, f112, f112, paint5);
                    canvas2.restore();
                    i4++;
                    i3 = 1;
                }
            }
            if (this.R != null) {
                canvas2.save();
                canvas2.translate((getWidth() / 2.0f) - (this.R.getWidth() / 2.0f), (rectF3.top - gl.L(36.0f)) - this.R.getHeight());
                this.L.setAlpha((int) (l4 * 255.0f));
                this.R.draw(canvas2);
                canvas2.restore();
            }
            float b = b(this.o0, this.n0 != null ? f4 : f2);
            this.o0 = b;
            PointF[] pointFArr = this.n0;
            if (pointFArr == null || pointFArr.length < 3 || (cameraView = this.b) == null || b <= f2) {
                f3 = R15;
            } else {
                TextureView textureView = cameraView.getTextureView();
                float left = textureView.getLeft() + this.b.getLeft();
                float top = textureView.getTop() + this.b.getTop();
                float right = textureView.getRight() + this.b.getLeft();
                float bottom = textureView.getBottom() + this.b.getTop();
                RectF rectF5 = this.s;
                rectF5.set(left, top, right, bottom);
                int min = Math.min(4, this.n0.length);
                float f12 = f2;
                float f13 = f12;
                for (int i5 = 0; i5 < min; i5++) {
                    PointF pointF = this.n0[i5];
                    f12 += pointF.x;
                    f13 += pointF.y;
                }
                float f14 = min;
                float width5 = (rectF5.width() * (f12 / f14)) + rectF5.left;
                float height5 = (rectF5.height() * (f13 / f14)) + rectF5.top;
                path.rewind();
                int i6 = 0;
                while (i6 < min) {
                    PointF[] pointFArr2 = this.n0;
                    PointF pointF2 = pointFArr2[((i6 + min) - 1) % min];
                    PointF pointF3 = pointFArr2[i6];
                    int i7 = i6 + 1;
                    PointF pointF4 = pointFArr2[i7 % min];
                    int i8 = min;
                    float width6 = (rectF5.width() * pointF3.x) + rectF5.left;
                    float height6 = (rectF5.height() * pointF3.y) + rectF5.top;
                    float width7 = (rectF5.width() * pointF2.x) + rectF5.left;
                    float height7 = (rectF5.height() * pointF2.y) + rectF5.top;
                    float width8 = (rectF5.width() * pointF4.x) + rectF5.left;
                    float height8 = (rectF5.height() * pointF4.y) + rectF5.top;
                    path.moveTo(tb4.A(width7, width6, 0.18f, width6), tb4.A(height7, height6, 0.18f, height6));
                    path.lineTo(width6, height6);
                    path.lineTo(((width8 - width6) * 0.18f) + width6, tb4.A(height8, height6, 0.18f, height6));
                    min = i8;
                    i6 = i7;
                    R15 = R15;
                }
                f3 = R15;
                canvas2.save();
                float R16 = gl.R1(0.5f, 1.1f, this.o0);
                canvas2.scale(R16, R16, width5, height5);
                int i9 = (int) (this.o0 * 255.0f * l4);
                Paint paint6 = this.F;
                paint6.setAlpha(i9);
                canvas2.drawPath(path, paint6);
                canvas2.restore();
            }
            this.b0 = b(this.b0, this.a0 == 0 ? 0.88f : f4);
            this.c0 = b(this.c0, this.a0 == 1 ? 0.88f : f4);
            this.d0 = b(this.d0, this.a0 != 2 ? f4 : 0.88f);
            this.f0 = b(this.f0, this.e0 ? f4 : f2);
            h(canvas2, this.f, this.b0, l4, null);
            h(canvas, this.h, this.c0, l4, this.I);
            if (this.Q != null) {
                canvas2 = canvas;
                h(canvas2, this.n, this.d0, l4, this.J);
            } else {
                canvas2 = canvas;
            }
        } else {
            f = 2.0f;
            f2 = 0.0f;
            f3 = R15;
            f4 = 1.0f;
        }
        canvas2.restoreToCount(save);
        if (l <= f2 || this.O) {
            return;
        }
        Canvas canvas3 = canvas2;
        i(f3, l, canvas3, rectF2, false);
        String str = this.M;
        Drawable drawable = this.H;
        if (str == null) {
            float L3 = ((int) (gl.L(22.0f) * f4)) / f;
            drawable.setBounds((int) (rectF2.centerX() - L3), (int) (rectF2.centerY() - L3), (int) (rectF2.centerX() + L3), (int) (rectF2.centerY() + L3));
            drawable.setAlpha((int) (l * 255.0f));
            drawable.draw(canvas3);
            return;
        }
        float L4 = ((gl.L(10.0f) + gl.L(12.0f)) * f4) + rectF2.left;
        float L5 = ((int) (gl.L(20.0f) * f4)) / f;
        drawable.setBounds((int) (L4 - L5), (int) (rectF2.centerY() - L5), (int) (L4 + L5), (int) (rectF2.centerY() + L5));
        int i10 = (int) (l * 255.0f);
        drawable.setAlpha(i10);
        drawable.draw(canvas3);
        TextPaint textPaint = this.N;
        textPaint.setTextSize(gl.L(14.0f) * f4);
        textPaint.setAlpha(i10);
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        canvas3.drawText(this.M, ((gl.L(6.0f) + gl.L(20.0f) + gl.L(12.0f)) * f4) + rectF2.left, rectF2.centerY() - ((fontMetrics.ascent + fontMetrics.descent) / f), textPaint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.T >= 1.0f && !this.V) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.n;
            RectF rectF2 = this.h;
            RectF rectF3 = this.f;
            int i = -1;
            if (actionMasked == 0) {
                if (j(x, y, rectF3)) {
                    i = 0;
                } else if (j(x, y, rectF2)) {
                    i = 1;
                } else if (this.Q != null && j(x, y, rectF)) {
                    i = 2;
                }
                this.a0 = i;
                invalidate();
            } else {
                if (actionMasked == 1) {
                    int i2 = this.a0;
                    if (i2 == 0) {
                        performHapticFeedback(3);
                        e();
                    } else if (i2 == 1) {
                        performHapticFeedback(3);
                        CameraView cameraView = this.b;
                        CameraSessionWrapper cameraSession = cameraView != null ? cameraView.getCameraSession() : null;
                        if (cameraSession != null) {
                            boolean z = this.e0;
                            this.e0 = !z;
                            cameraSession.setCurrentFlashMode(!z ? "torch" : "off");
                            invalidate();
                        }
                    } else if (i2 != 2 || this.Q == null) {
                        CameraView cameraView2 = this.b;
                        if (cameraView2 != null) {
                            cameraView2.focusToPoint((int) x, (int) y);
                        }
                    } else {
                        performHapticFeedback(3);
                        this.Q.run();
                    }
                    this.a0 = -1;
                    invalidate();
                    return true;
                }
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.a0 = -1;
                        invalidate();
                        return true;
                    }
                } else if ((this.a0 == 0 && !j(x, y, rectF3)) || ((this.a0 == 1 && !j(x, y, rectF2)) || (this.a0 == 2 && !j(x, y, rectF)))) {
                    this.a0 = -1;
                    invalidate();
                    return true;
                }
            }
        }
        return true;
    }

    public final void e() {
        TextureView textureView;
        if (this.V || this.W) {
            return;
        }
        this.V = true;
        byte b = 0;
        this.i0 = false;
        Matrix matrix = this.v0;
        RectF rectF = this.r0;
        CameraView cameraView = this.b;
        if (cameraView != null && cameraView.getAlpha() >= 0.5f && (textureView = cameraView.getTextureView()) != null && textureView.isAvailable() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
            try {
                this.p0 = textureView.getBitmap(Math.max(1, textureView.getWidth() / 2), Math.max(1, textureView.getHeight() / 2));
            } catch (Throwable th) {
                fa4.g(th, true);
                this.p0 = null;
            }
            if (this.p0 != null) {
                rectF.set(textureView.getLeft() + cameraView.getLeft(), textureView.getTop() + cameraView.getTop(), textureView.getRight() + cameraView.getLeft(), textureView.getBottom() + cameraView.getTop());
                if (c()) {
                    Bitmap bitmap = this.p0;
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 8), Math.max(1, this.p0.getHeight() / 8), true);
                    this.q0 = createScaledBitmap;
                    Utilities.stackBlurBitmap(createScaledBitmap, 6);
                    Bitmap bitmap2 = this.q0;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.t0 = new BitmapShader(bitmap2, tileMode, tileMode);
                    matrix.setScale(rectF.width() / this.q0.getWidth(), rectF.height() / this.q0.getHeight());
                    matrix.postTranslate(rectF.left, rectF.top);
                    this.t0.setLocalMatrix(matrix);
                    this.u0.setShader(this.t0);
                }
            }
        }
        m();
        a(0.0f, 330L, new vv8(this, b));
    }

    public final void g() {
        if (this.W) {
            return;
        }
        byte b = 1;
        this.W = true;
        this.i0 = false;
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        m();
        this.h0.removeCallbacksAndMessages(null);
        this.h0.post(new vv8(this, b));
    }

    public final void h(Canvas canvas, RectF rectF, float f, float f2, Drawable drawable) {
        canvas.save();
        canvas.scale(f, f, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        i(height, f2, canvas, rectF, true);
        if (drawable == this.I && this.f0 > 0.0f) {
            Paint paint = this.y;
            paint.setColor(-1);
            paint.setAlpha((int) (this.f0 * 102.0f * f2));
            canvas.drawRoundRect(rectF, height, height, paint);
        }
        if (drawable != null) {
            float L = gl.L(28.0f) / 2.0f;
            drawable.setBounds((int) (rectF.centerX() - L), (int) (rectF.centerY() - L), (int) (rectF.centerX() + L), (int) (rectF.centerY() + L));
            drawable.setAlpha((int) (f2 * 255.0f));
            drawable.draw(canvas);
        } else {
            ed0 ed0Var = this.K;
            ed0Var.setAlpha((int) (f2 * 255.0f));
            canvas.save();
            de9.n(gl.L(24.0f), 2.0f, rectF.centerY(), rectF.centerX() - (gl.L(24.0f) / 2.0f), canvas);
            ed0Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void i(float f, float f2, Canvas canvas, RectF rectF, boolean z) {
        boolean z2;
        if (f2 <= 0.0f) {
            return;
        }
        int l = (int) (Utilities.l(lcd.b[3] / 100.0f) * 255.0f);
        Paint paint = this.y;
        if (z) {
            if (this.b != null && canvas.isHardwareAccelerated() && c()) {
                if (this.c == null) {
                    this.c = this.b.getBlurRenderNode();
                    invalidate();
                }
                z2 = yz.n(this.c);
            } else {
                z2 = false;
            }
            if (z2) {
                Path path = this.x;
                path.rewind();
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.b.getLeft(), this.b.getTop());
                yz.s(this.c, f2);
                yz.h(canvas, this.c);
                canvas.restore();
                paint.setColor((l << 24) | 16777215);
                paint.setAlpha((int) (l * f2));
                canvas.drawRect(rectF, paint);
                uv8.b(canvas, rectF, f2);
                canvas.restore();
                this.G.a(f, f2, 0, canvas, rectF);
            }
        }
        if (!z || this.q0 == null) {
            paint.setColor(bm2.k((l << 24) | 16777215, c() ? 687865856 : TLObject.FLAG_31));
            paint.setAlpha((int) (Color.alpha(paint.getColor()) * f2));
            canvas.drawRoundRect(rectF, f, f, paint);
            uv8.c(canvas, rectF, f, f2);
        } else {
            Paint paint2 = this.u0;
            paint2.setAlpha((int) (255.0f * f2));
            canvas.drawRoundRect(rectF, f, f, paint2);
            paint.setColor((l << 24) | 16777215);
            paint.setAlpha((int) (l * f2));
            canvas.drawRoundRect(rectF, f, f, paint);
            uv8.c(canvas, rectF, f, f2);
        }
        this.G.a(f, f2, 0, canvas, rectF);
    }

    public final void m() {
        CameraView cameraView = this.b;
        if (cameraView == null) {
            return;
        }
        this.b = null;
        this.c = null;
        CameraSessionWrapper cameraSession = cameraView.getCameraSession();
        if (this.e0 && cameraSession != null) {
            cameraSession.setCurrentFlashMode("off");
        }
        cameraView.animate().cancel();
        cameraView.destroy(true, null);
        removeView(cameraView);
    }

    public final float n() {
        if (this.V) {
            return 1.0f - B0.getInterpolation(1.0f - this.T);
        }
        return A0.getInterpolation(Utilities.l(this.T));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        yv8 yv8Var = this;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        float min = Math.min(i5, r2) * 0.66f;
        float L = ((i4 - i2) / 2.0f) - gl.L(20.0f);
        float f2 = i5 / 2.0f;
        float f3 = min / 2.0f;
        float f4 = f2 - f3;
        float f5 = L - f3;
        float f6 = f2 + f3;
        float f7 = L + f3;
        RectF rectF = yv8Var.r;
        rectF.set(f4, f5, f6, f7);
        float L2 = gl.L(56.0f);
        float L3 = rectF.bottom + gl.L(64.0f);
        if (yv8Var.Q != null) {
            f = (L2 / 2.0f) + gl.L(35.0f) + f2;
        } else {
            f = f2;
        }
        float f8 = L2 / 2.0f;
        float f9 = L2 + L3;
        yv8Var.h.set(f - f8, L3, f + f8, f9);
        float L4 = (f2 - gl.L(35.0f)) - f8;
        yv8Var.n.set(L4 - f8, L3, L4 + f8, f9);
        yv8Var.R = new StaticLayout(k96.M0(2131745669, null), yv8Var.L, b00.c(72.0f, i5, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = yv8Var.f;
        if (!rectF2.isEmpty()) {
            return;
        }
        String[] strArr = vw8.B9;
        int i6 = gl.m;
        int i7 = 0;
        View view = yv8Var;
        while (true) {
            int top = view.getTop() + i7;
            if (!(view.getParent() instanceof View)) {
                float currentActionBarHeight = (org.telegram.ui.ActionBar.a.getCurrentActionBarHeight() / 2.0f) + Math.max(0, i6 - top);
                rectF2.set(gl.L(9.0f), currentActionBarHeight - gl.L(20.0f), gl.L(49.0f), currentActionBarHeight + gl.L(20.0f));
                return;
            } else {
                View view2 = (View) view.getParent();
                i7 = top - view2.getScrollY();
                view = view2;
            }
        }
    }

    public void setAccept(q8c q8cVar) {
        this.P = q8cVar;
    }

    public void setButtonLabel(String str) {
        this.M = str;
        Typeface o = gl.o();
        TextPaint textPaint = this.N;
        textPaint.setTypeface(o);
        textPaint.setColor(-1);
        invalidate();
    }

    public void setOnGallery(Runnable runnable) {
        this.Q = runnable;
        requestLayout();
        invalidate();
    }

    public void setPlainButton(boolean z) {
        this.O = z;
        invalidate();
    }
}
