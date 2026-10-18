package zh;

import android.animation.ValueAnimator;
import android.app.Activity;
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
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
import com.google.android.gms.internal.play_billing.k3;
import ei.i6;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.q10;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class w extends FrameLayout {
    public static final bs t0 = new bs(0.05d, 0.7d, 0.1d, 1.0d);
    public static final bs u0 = new bs(0.3d, 0.0d, 0.1d, 1.0d);
    public final q10 E;
    public final Drawable F;
    public final Drawable G;
    public final g2 H;
    public final TextPaint I;
    public String J;
    public final TextPaint K;
    public StaticLayout L;
    public final float M;
    public float N;
    public ValueAnimator O;
    public boolean P;
    public boolean Q;
    public int R;
    public float S;
    public float T;
    public boolean U;
    public float V;
    public final HandlerThread W;
    public final le.b a;
    public final Handler a0;
    public CameraView b;
    public volatile boolean b0;
    public Object c;
    public r8.n c0;
    public final RectF d;
    public a6.i d0;
    public final RectF e;
    public Bitmap e0;
    public final RectF f;
    public boolean f0;
    public PointF[] g0;
    public final RectF h;
    public float h0;
    public Bitmap i0;
    public Bitmap j0;
    public final RectF k0;
    public final Paint l0;
    public BitmapShader m0;
    public final RectF n;
    public final Paint n0;
    public final Matrix o0;
    public Bitmap p0;
    public final Paint q0;
    public final RectF r;
    public final RectF r0;
    public final Path s;
    public final p4.s0 s0;
    public final Path v;
    public final Paint w;
    public final Paint x;
    public final Paint y;

    public w(Activity activity, RectF rectF, RectF rectF2, le.b bVar) {
        super(activity);
        float g10;
        RectF rectF3 = new RectF();
        this.d = rectF3;
        this.e = new RectF();
        RectF rectF4 = new RectF();
        this.f = rectF4;
        this.h = new RectF();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new Path();
        this.v = new Path();
        this.w = new Paint(1);
        Paint paint = new Paint(1);
        this.x = paint;
        Paint paint2 = new Paint(1);
        this.y = paint2;
        this.E = new q10(2);
        g2 g2Var = new g2(true);
        this.H = g2Var;
        TextPaint textPaint = new TextPaint(1);
        this.I = textPaint;
        this.K = new TextPaint(1);
        this.R = -1;
        this.S = 1.0f;
        this.T = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.W = handlerThread;
        this.k0 = new RectF();
        this.l0 = new Paint(2);
        this.n0 = new Paint(3);
        this.o0 = new Matrix();
        this.q0 = new Paint(2);
        this.r0 = new RectF();
        this.s0 = new p4.s0(this, 17);
        this.a = bVar;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        Drawable mutate = activity.getDrawable(R.drawable.msg_qr_scan).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.F = mutate;
        Drawable mutate2 = activity.getDrawable(R.drawable.qr_flashlight).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.G = mutate2;
        g2Var.a(-1);
        g2Var.b(-1);
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(22.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Join join = Paint.Join.ROUND;
        paint.setStrokeJoin(join);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeJoin(join);
        paint2.setColor(-8697);
        paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
        if (u.f()) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            g10 = u.g(findActivity != null ? findActivity.getWindow().getDecorView() : null, 0.0f);
        } else {
            g10 = AndroidUtilities.dp(28.0f);
        }
        this.M = g10;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.a0 = handler;
        handler.post(new v(this, 2));
        invalidate();
        b(1.0f, 390L, new v(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7 A[Catch: all -> 0x00c2, Exception -> 0x00e1, LOOP:2: B:58:0x00f5->B:59:0x00f7, LOOP_END, TryCatch #2 {Exception -> 0x00e1, all -> 0x00c2, blocks: (B:39:0x009f, B:41:0x00bd, B:42:0x00c6, B:44:0x00cc, B:46:0x00d2, B:52:0x00e7, B:54:0x00ed, B:57:0x00f3, B:59:0x00f7, B:61:0x010b), top: B:38:0x009f }] */
    /* JADX WARN: Type inference failed for: r12v12, types: [android.graphics.PointF[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.graphics.PointF[], java.lang.Cloneable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xf.c a(w wVar, Bitmap bitmap) {
        int i10;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        r8.n nVar = wVar.c0;
        int i11 = 0;
        if (nVar != null && nVar.b.k()) {
            r8.n nVar2 = wVar.c0;
            g3 g3Var = new g3(23);
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            g3Var.d = bitmap;
            a3.l lVar = (a3.l) g3Var.b;
            lVar.a = width2;
            lVar.b = height2;
            SparseArray e12 = nVar2.e1(g3Var);
            for (int i12 = 0; i12 < e12.size(); i12++) {
                r8.m mVar = (r8.m) e12.valueAt(i12);
                String str = mVar.b;
                Point[] pointArr = mVar.e;
                String trim = str != null ? str.trim() : null;
                if (!TextUtils.isEmpty(trim) && (trim.startsWith("tg:") || pf.d.e(Uri.parse(trim), false, null))) {
                    int length = pointArr != null ? pointArr.length : 0;
                    ?? r12 = new PointF[length];
                    while (i11 < length) {
                        Point point = pointArr[i11];
                        r12[i11] = new PointF(point.x / width, point.y / height);
                        i11++;
                    }
                    return new xf.c(trim, r12);
                }
            }
        } else if (wVar.d0 != null) {
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            try {
                androidx.biometric.e m10 = wVar.d0.m(new n4.s(15, (Object) new ec.f(new dc.g(width, height, iArr)), false));
                String str2 = (String) m10.b;
                String trim2 = str2 != null ? str2.trim() : null;
                if (!TextUtils.isEmpty(trim2) && (trim2.startsWith("tg:") || pf.d.e(Uri.parse(trim2), false, null))) {
                    dc.j[] jVarArr = (dc.j[]) m10.c;
                    if (jVarArr != null) {
                        i10 = 4;
                        if (jVarArr.length == 4) {
                            ?? r13 = new PointF[i10];
                            while (i11 < i10) {
                                dc.j jVar = jVarArr[i11];
                                r13[i11] = new PointF(jVar.a / width, jVar.b / height);
                                i11++;
                            }
                            xf.c cVar = new xf.c(trim2, r13);
                            wVar.d0.getClass();
                            return cVar;
                        }
                    }
                    i10 = 0;
                    ?? r132 = new PointF[i10];
                    while (i11 < i10) {
                    }
                    xf.c cVar2 = new xf.c(trim2, r132);
                    wVar.d0.getClass();
                    return cVar2;
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                wVar.d0.getClass();
                throw th2;
            }
            wVar.d0.getClass();
            return null;
        }
        return null;
    }

    public static boolean d() {
        return u.f() && LiteMode.isEnabled(256);
    }

    public static boolean i(RectF rectF, float f7, float f10) {
        return f7 >= rectF.left - ((float) AndroidUtilities.dp(8.0f)) && f7 <= rectF.right + ((float) AndroidUtilities.dp(8.0f)) && f10 >= rectF.top - ((float) AndroidUtilities.dp(8.0f)) && f10 <= rectF.bottom + ((float) AndroidUtilities.dp(8.0f));
    }

    public final void b(float f7, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, f7);
        ofFloat.addUpdateListener(new i6(this, 28));
        ofFloat.addListener(new ah.q0(this, runnable));
        ofFloat.setDuration((long) (Math.abs(f7 - this.N) * j10));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.O = ofFloat;
        ofFloat.start();
    }

    public final float c(float f7, float f10) {
        if (Math.abs(f7 - f10) < 0.005f) {
            return f10;
        }
        invalidate();
        return ((f10 - f7) * 0.3f) + f7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        Path path;
        CameraView cameraView;
        Canvas canvas2 = canvas;
        float k10 = k();
        RectF rectF = this.d;
        float width = rectF.width() / 2.0f;
        float height = rectF.height() / 2.0f;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float lerp = AndroidUtilities.lerp(centerX - width, 0.0f, k10);
        float lerp2 = AndroidUtilities.lerp(centerY - height, 0.0f, k10);
        float lerp3 = AndroidUtilities.lerp(centerX + width, getWidth(), k10);
        float lerp4 = AndroidUtilities.lerp(centerY + height, getHeight(), k10);
        RectF rectF2 = this.e;
        rectF2.set(lerp, lerp2, lerp3, lerp4);
        float lerp5 = AndroidUtilities.lerp(rectF.height() / 2.0f, this.M, k());
        int save = canvas2.save();
        if (this.N < 1.0f) {
            Path path2 = this.s;
            path2.rewind();
            path2.addRoundRect(rectF2, lerp5, lerp5, Path.Direction.CW);
            canvas2.clipPath(path2);
        }
        float clamp01 = 1.0f - Utilities.clamp01(k() / 0.35f);
        float clamp012 = Utilities.clamp01(k() / 0.3f);
        Paint paint = this.w;
        if (clamp012 > 0.0f) {
            paint.setColor(-16777216);
            paint.setAlpha((int) (clamp012 * 255.0f));
            canvas2.drawRect(rectF2, paint);
        }
        int width2 = getWidth();
        int height2 = getHeight();
        if (this.N < 1.0f && width2 > 0 && height2 > 0) {
            float max = Math.max(rectF2.width() / width2, rectF2.height() / height2);
            canvas2.translate(rectF2.centerX(), rectF2.centerY());
            canvas2.scale(max, max);
            canvas2.translate((-width2) / 2.0f, (-height2) / 2.0f);
        }
        super.dispatchDraw(canvas);
        if (this.i0 != null) {
            int clamp013 = (int) (Utilities.clamp01((k() - 0.15f) / 0.45f) * 255.0f);
            Paint paint2 = this.l0;
            paint2.setAlpha(clamp013);
            canvas2.drawBitmap(this.i0, (Rect) null, this.k0, paint2);
        }
        float clamp014 = Utilities.clamp01((k() - 0.15f) / 0.45f);
        if (clamp014 > 0.0f) {
            float dp = AndroidUtilities.dp(14.0f);
            paint.setColor(TLObject.FLAG_30);
            paint.setAlpha((int) (64.0f * clamp014));
            int i10 = Build.VERSION.SDK_INT;
            RectF rectF3 = this.n;
            Path path3 = this.v;
            if (i10 >= 29) {
                float width3 = getWidth();
                float height3 = getHeight();
                RectF rectF4 = this.r0;
                rectF4.set(0.0f, 0.0f, width3, height3);
                canvas2.drawDoubleRoundRect(rectF4, 0.0f, 0.0f, rectF3, dp, dp, paint);
                path = path3;
            } else {
                path3.rewind();
                path = path3;
                path.setFillType(Path.FillType.EVEN_ODD);
                float width4 = getWidth();
                float height4 = getHeight();
                Path.Direction direction = Path.Direction.CW;
                path.addRect(0.0f, 0.0f, width4, height4, direction);
                path.addRoundRect(rectF3, dp, dp, direction);
                canvas2.drawPath(path, paint);
                path.setFillType(Path.FillType.WINDING);
            }
            float f13 = (1.0f - this.h0) * clamp014;
            int i11 = 1;
            if (f13 <= 0.004f) {
                f7 = 2.0f;
                f10 = 0.0f;
                f11 = 1.0f;
                f12 = clamp01;
            } else {
                float dp2 = AndroidUtilities.dp(28.0f);
                f7 = 2.0f;
                Paint paint3 = this.x;
                f10 = 0.0f;
                f11 = 1.0f;
                f12 = clamp01;
                int ceil = ((int) Math.ceil(paint3.getStrokeWidth() / 2.0f)) + 1;
                if (this.p0 == null) {
                    int ceil2 = (ceil * 2) + ((int) Math.ceil(dp2));
                    this.p0 = Bitmap.createBitmap(ceil2, ceil2, Bitmap.Config.ARGB_8888);
                    Path path4 = new Path();
                    float f14 = ceil;
                    float f15 = dp2 + f14;
                    path4.moveTo(f14, f15);
                    float f16 = dp + f14;
                    path4.lineTo(f14, f16);
                    path4.quadTo(f14, f14, f16, f14);
                    path4.lineTo(f15, f14);
                    Paint paint4 = new Paint(paint3);
                    paint4.setAlpha(255);
                    new Canvas(this.p0).drawPath(path4, paint4);
                    this.p0.prepareToDraw();
                }
                Paint paint5 = this.q0;
                paint5.setAlpha((int) (f13 * 255.0f));
                int i12 = 0;
                while (i12 < 4) {
                    boolean z10 = i12 == 1 || i12 == 2;
                    boolean z11 = i12 >= 2;
                    canvas2.save();
                    canvas2.translate(z10 ? rectF3.right : rectF3.left, z11 ? rectF3.bottom : rectF3.top);
                    float f17 = -1.0f;
                    float f18 = z10 ? -1.0f : 1.0f;
                    if (!z11) {
                        f17 = 1.0f;
                    }
                    canvas2.scale(f18, f17);
                    float f19 = -ceil;
                    canvas2.drawBitmap(this.p0, f19, f19, paint5);
                    canvas2.restore();
                    i12++;
                }
            }
            if (this.L != null) {
                canvas2.save();
                canvas2.translate((getWidth() / f7) - (this.L.getWidth() / f7), (rectF3.top - AndroidUtilities.dp(36.0f)) - this.L.getHeight());
                this.I.setAlpha((int) (clamp014 * 255.0f));
                this.L.draw(canvas2);
                canvas2.restore();
            }
            float c10 = c(this.h0, this.g0 != null ? f11 : f10);
            this.h0 = c10;
            PointF[] pointFArr = this.g0;
            if (pointFArr != null && pointFArr.length >= 3 && (cameraView = this.b) != null && c10 > f10) {
                TextureView textureView = cameraView.getTextureView();
                float left = textureView.getLeft() + this.b.getLeft();
                float top = textureView.getTop() + this.b.getTop();
                float right = textureView.getRight() + this.b.getLeft();
                float bottom = textureView.getBottom() + this.b.getTop();
                RectF rectF5 = this.r;
                rectF5.set(left, top, right, bottom);
                int min = Math.min(4, this.g0.length);
                float f20 = f10;
                float f21 = f20;
                for (int i13 = 0; i13 < min; i13++) {
                    PointF pointF = this.g0[i13];
                    f20 += pointF.x;
                    f21 += pointF.y;
                }
                float f22 = min;
                float width5 = (rectF5.width() * (f20 / f22)) + rectF5.left;
                float height5 = (rectF5.height() * (f21 / f22)) + rectF5.top;
                path.rewind();
                int i14 = 0;
                while (i14 < min) {
                    PointF[] pointFArr2 = this.g0;
                    PointF pointF2 = pointFArr2[((i14 + min) - i11) % min];
                    PointF pointF3 = pointFArr2[i14];
                    int i15 = i14 + 1;
                    PointF pointF4 = pointFArr2[i15 % min];
                    float width6 = (rectF5.width() * pointF3.x) + rectF5.left;
                    float height6 = (rectF5.height() * pointF3.y) + rectF5.top;
                    int i16 = min;
                    float width7 = (rectF5.width() * pointF2.x) + rectF5.left;
                    float height7 = (rectF5.height() * pointF2.y) + rectF5.top;
                    float width8 = (rectF5.width() * pointF4.x) + rectF5.left;
                    float height8 = (rectF5.height() * pointF4.y) + rectF5.top;
                    path.moveTo(k3.y(width7, width6, 0.18f, width6), k3.y(height7, height6, 0.18f, height6));
                    path.lineTo(width6, height6);
                    path.lineTo(((width8 - width6) * 0.18f) + width6, k3.y(height8, height6, 0.18f, height6));
                    min = i16;
                    i14 = i15;
                    i11 = 1;
                }
                canvas2.save();
                float lerp6 = AndroidUtilities.lerp(0.5f, 1.1f, this.h0);
                canvas2.scale(lerp6, lerp6, width5, height5);
                int i17 = (int) (this.h0 * 255.0f * clamp014);
                Paint paint6 = this.y;
                paint6.setAlpha(i17);
                canvas2.drawPath(path, paint6);
                canvas2.restore();
            }
            this.S = c(this.S, this.R == 0 ? 0.88f : f11);
            this.T = c(this.T, this.R != 1 ? f11 : 0.88f);
            this.V = c(this.V, this.U ? f11 : f10);
            g(canvas2, this.f, this.S, clamp014, null);
            canvas2 = canvas;
            g(canvas2, this.h, this.T, clamp014, this.G);
        } else {
            f7 = 2.0f;
            f10 = 0.0f;
            f11 = 1.0f;
            f12 = clamp01;
        }
        canvas2.restoreToCount(save);
        if (f12 > f10) {
            Canvas canvas3 = canvas2;
            float f23 = f12;
            h(lerp5, f23, canvas3, rectF2, false);
            String str = this.J;
            Drawable drawable = this.F;
            if (str == null) {
                float dp3 = ((int) (AndroidUtilities.dp(22.0f) * f11)) / f7;
                drawable.setBounds((int) (rectF2.centerX() - dp3), (int) (rectF2.centerY() - dp3), (int) (rectF2.centerX() + dp3), (int) (rectF2.centerY() + dp3));
                drawable.setAlpha((int) (f23 * 255.0f));
                drawable.draw(canvas3);
                return;
            }
            float dp4 = ((AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(12.0f)) * f11) + rectF2.left;
            float dp5 = ((int) (AndroidUtilities.dp(20.0f) * f11)) / f7;
            drawable.setBounds((int) (dp4 - dp5), (int) (rectF2.centerY() - dp5), (int) (dp4 + dp5), (int) (rectF2.centerY() + dp5));
            int i18 = (int) (f23 * 255.0f);
            drawable.setAlpha(i18);
            drawable.draw(canvas3);
            TextPaint textPaint = this.K;
            textPaint.setTextSize(AndroidUtilities.dp(14.0f) * f11);
            textPaint.setAlpha(i18);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            canvas3.drawText(this.J, ((AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f)) * f11) + rectF2.left, rectF2.centerY() - ((fontMetrics.ascent + fontMetrics.descent) / f7), textPaint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.N >= 1.0f && !this.P) {
            float x10 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int actionMasked = motionEvent.getActionMasked();
            RectF rectF = this.h;
            RectF rectF2 = this.f;
            int i10 = -1;
            if (actionMasked == 0) {
                if (i(rectF2, x10, y3)) {
                    i10 = 0;
                } else if (i(rectF, x10, y3)) {
                    i10 = 1;
                }
                this.R = i10;
                invalidate();
            } else {
                if (actionMasked == 1) {
                    int i11 = this.R;
                    if (i11 == 0) {
                        performHapticFeedback(3);
                        e();
                    } else if (i11 == 1) {
                        performHapticFeedback(3);
                        CameraView cameraView = this.b;
                        CameraSessionWrapper cameraSession = cameraView != null ? cameraView.getCameraSession() : null;
                        if (cameraSession != null) {
                            boolean z10 = this.U;
                            this.U = !z10;
                            cameraSession.setCurrentFlashMode(!z10 ? "torch" : "off");
                            invalidate();
                        }
                    } else {
                        CameraView cameraView2 = this.b;
                        if (cameraView2 != null) {
                            cameraView2.focusToPoint((int) x10, (int) y3);
                        }
                    }
                    this.R = -1;
                    invalidate();
                    return true;
                }
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.R = -1;
                        invalidate();
                        return true;
                    }
                } else if ((this.R == 0 && !i(rectF2, x10, y3)) || (this.R == 1 && !i(rectF, x10, y3))) {
                    this.R = -1;
                    invalidate();
                    return true;
                }
            }
        }
        return true;
    }

    public final void e() {
        TextureView textureView;
        if (this.P || this.Q) {
            return;
        }
        this.P = true;
        this.b0 = false;
        Matrix matrix = this.o0;
        RectF rectF = this.k0;
        CameraView cameraView = this.b;
        if (cameraView != null && cameraView.getAlpha() >= 0.5f && (textureView = cameraView.getTextureView()) != null && textureView.isAvailable() && textureView.getWidth() > 0 && textureView.getHeight() > 0) {
            try {
                this.i0 = textureView.getBitmap(Math.max(1, textureView.getWidth() / 2), Math.max(1, textureView.getHeight() / 2));
            } catch (Throwable th2) {
                FileLog.e(th2);
                this.i0 = null;
            }
            if (this.i0 != null) {
                rectF.set(textureView.getLeft() + cameraView.getLeft(), textureView.getTop() + cameraView.getTop(), textureView.getRight() + cameraView.getLeft(), textureView.getBottom() + cameraView.getTop());
                if (d()) {
                    Bitmap bitmap = this.i0;
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.max(1, bitmap.getWidth() / 8), Math.max(1, this.i0.getHeight() / 8), true);
                    this.j0 = createScaledBitmap;
                    Utilities.stackBlurBitmap(createScaledBitmap, 6);
                    Bitmap bitmap2 = this.j0;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.m0 = new BitmapShader(bitmap2, tileMode, tileMode);
                    matrix.setScale(rectF.width() / this.j0.getWidth(), rectF.height() / this.j0.getHeight());
                    matrix.postTranslate(rectF.left, rectF.top);
                    this.m0.setLocalMatrix(matrix);
                    this.n0.setShader(this.m0);
                }
            }
        }
        j();
        b(0.0f, 330L, new v(this, 0));
    }

    public final void f() {
        if (this.Q) {
            return;
        }
        this.Q = true;
        this.b0 = false;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.O = null;
        }
        j();
        this.a0.removeCallbacksAndMessages(null);
        this.a0.post(new v(this, 1));
    }

    public final void g(Canvas canvas, RectF rectF, float f7, float f10, Drawable drawable) {
        canvas.save();
        canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        h(height, f10, canvas, rectF, true);
        if (drawable == this.G && this.V > 0.0f) {
            Paint paint = this.w;
            paint.setColor(-1);
            paint.setAlpha((int) (this.V * 102.0f * f10));
            canvas.drawRoundRect(rectF, height, height, paint);
        }
        if (drawable != null) {
            int dp = AndroidUtilities.dp(28.0f);
            float centerX = rectF.centerX();
            float f11 = dp / 2.0f;
            drawable.setBounds((int) (centerX - f11), (int) (rectF.centerY() - f11), (int) (rectF.centerX() + f11), (int) (rectF.centerY() + f11));
            drawable.setAlpha((int) (f10 * 255.0f));
            drawable.draw(canvas);
        } else {
            g2 g2Var = this.H;
            g2Var.setAlpha((int) (f10 * 255.0f));
            canvas.save();
            canvas.translate(rectF.centerX() - (AndroidUtilities.dp(24.0f) / 2.0f), rectF.centerY() - (AndroidUtilities.dp(24.0f) / 2.0f));
            g2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void h(float f7, float f10, Canvas canvas, RectF rectF, boolean z10) {
        boolean z11;
        if (f10 <= 0.0f) {
            return;
        }
        int clamp01 = (int) (Utilities.clamp01(v0.b[3] / 100.0f) * 255.0f);
        Paint paint = this.w;
        if (z10) {
            if (this.b != null && canvas.isHardwareAccelerated() && d()) {
                if (this.c == null) {
                    this.c = this.b.getBlurRenderNode();
                    invalidate();
                }
                z11 = u.e(this.c);
            } else {
                z11 = false;
            }
            if (z11) {
                Path path = this.v;
                path.rewind();
                path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                canvas.save();
                canvas.translate(this.b.getLeft(), this.b.getTop());
                u.h(this.c, f10);
                u.c(canvas, this.c);
                canvas.restore();
                paint.setColor((clamp01 << 24) | 16777215);
                paint.setAlpha((int) (clamp01 * f10));
                canvas.drawRect(rectF, paint);
                t.b(canvas, rectF, f10);
                canvas.restore();
                this.E.a(canvas, rectF, f7, 0, f10);
            }
        }
        if (!z10 || this.j0 == null) {
            paint.setColor(i0.a.k((clamp01 << 24) | 16777215, d() ? 687865856 : TLObject.FLAG_31));
            paint.setAlpha((int) (Color.alpha(paint.getColor()) * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            t.c(canvas, rectF, f7, f10);
        } else {
            Paint paint2 = this.n0;
            paint2.setAlpha((int) (255.0f * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint2);
            paint.setColor((clamp01 << 24) | 16777215);
            paint.setAlpha((int) (clamp01 * f10));
            canvas.drawRoundRect(rectF, f7, f7, paint);
            t.c(canvas, rectF, f7, f10);
        }
        this.E.a(canvas, rectF, f7, 0, f10);
    }

    public final void j() {
        CameraView cameraView = this.b;
        if (cameraView == null) {
            return;
        }
        this.b = null;
        this.c = null;
        CameraSessionWrapper cameraSession = cameraView.getCameraSession();
        if (this.U && cameraSession != null) {
            cameraSession.setCurrentFlashMode("off");
        }
        cameraView.animate().cancel();
        cameraView.destroy(true, null);
        removeView(cameraView);
    }

    public final float k() {
        if (this.P) {
            return 1.0f - u0.getInterpolation(1.0f - this.N);
        }
        return t0.getInterpolation(Utilities.clamp01(this.N));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        float min = Math.min(i14, r2) * 0.66f;
        float dp = ((i13 - i11) / 2.0f) - AndroidUtilities.dp(20.0f);
        float f7 = i14 / 2.0f;
        float f10 = min / 2.0f;
        float f11 = f7 - f10;
        float f12 = dp - f10;
        float f13 = f7 + f10;
        float f14 = dp + f10;
        RectF rectF = this.n;
        rectF.set(f11, f12, f13, f14);
        float dp2 = AndroidUtilities.dp(56.0f);
        float f15 = dp2 / 2.0f;
        this.h.set(f7 - f15, rectF.bottom + AndroidUtilities.dp(64.0f), f7 + f15, rectF.bottom + AndroidUtilities.dp(64.0f) + dp2);
        this.L = new StaticLayout(LocaleController.getString(R.string.ScanQrCode), this.I, org.telegram.messenger.g0.b(72.0f, i14, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f;
        if (!rectF2.isEmpty()) {
            return;
        }
        String[] strArr = t0.C9;
        int i15 = AndroidUtilities.statusBarHeight;
        View view = this;
        int i16 = 0;
        while (true) {
            int top = view.getTop() + i16;
            if (!(view.getParent() instanceof View)) {
                float currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + Math.max(0, i15 - top);
                rectF2.set(AndroidUtilities.dp(9.0f), currentActionBarHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(49.0f), currentActionBarHeight + AndroidUtilities.dp(20.0f));
                return;
            }
            view = (View) view.getParent();
            i16 = top - view.getScrollY();
        }
    }
}
