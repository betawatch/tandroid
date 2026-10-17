package zh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.gms.internal.cast.a6;
import ei.i6;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.q10;
import w7.z5;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class d0 extends FrameLayout {
    public static final bs l0 = new bs(0.05d, 0.7d, 0.1d, 1.0d);
    public static final bs m0 = new bs(0.3d, 0.0d, 0.1d, 1.0d);
    public final LinearGradient E;
    public final Matrix F;
    public final q10 G;
    public final Drawable H;
    public final Drawable I;
    public final g2 J;
    public final TextPaint K;
    public String L;
    public final TextPaint M;
    public StaticLayout N;
    public final float O;
    public float P;
    public ValueAnimator Q;
    public boolean R;
    public boolean S;
    public int T;
    public float U;
    public float V;
    public boolean W;
    public final le.b a;
    public float a0;
    public final CameraView b;
    public final HandlerThread b0;
    public final Object c;
    public final Handler c0;
    public final RectF d;
    public volatile boolean d0;
    public final RectF e;
    public r8.n e0;
    public final RectF f;
    public a6.i f0;
    public Bitmap g0;
    public final RectF h;
    public boolean h0;
    public PointF[] i0;
    public float j0;
    public final p4.s0 k0;
    public final RectF n;
    public final RectF r;
    public final Path s;
    public final Path v;
    public final Paint w;
    public final Paint x;
    public final Paint y;

    public d0(Activity activity, RectF rectF, RectF rectF2, le.b bVar) {
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
        this.E = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, 352321535, 16777215, Shader.TileMode.CLAMP);
        this.F = new Matrix();
        this.G = new q10(2);
        g2 g2Var = new g2(true);
        this.J = g2Var;
        TextPaint textPaint = new TextPaint(1);
        this.K = textPaint;
        this.M = new TextPaint(1);
        this.T = -1;
        this.U = 1.0f;
        this.V = 1.0f;
        HandlerThread handlerThread = new HandlerThread("QrScan");
        this.b0 = handlerThread;
        this.k0 = new p4.s0(this, 17);
        this.a = bVar;
        rectF3.set(rectF);
        rectF4.set(rectF2);
        setWillNotDraw(false);
        Drawable mutate = activity.getDrawable(R.drawable.msg_qr_scan).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.H = mutate;
        Drawable mutate2 = activity.getDrawable(R.drawable.qr_flashlight).mutate();
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.I = mutate2;
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
        paint2.setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(3.0f), 1080452710);
        if (b0.f()) {
            Activity findActivity = AndroidUtilities.findActivity(getContext());
            g10 = b0.g(findActivity != null ? findActivity.getWindow().getDecorView() : null, 0.0f);
        } else {
            g10 = AndroidUtilities.dp(28.0f);
        }
        this.O = g10;
        if (CameraView.isCameraAllowed()) {
            CameraController.getInstance().initCamera(null);
            CameraView cameraView = new CameraView(activity, false);
            this.b = cameraView;
            cameraView.setUseMaxPreview(true);
            cameraView.setOptimizeForBarcode(true);
            cameraView.setDelegate(new yh.r0(this, 4));
            if (b0.f()) {
                this.c = cameraView.getBlurRenderNode();
            }
            addView(cameraView, z5.d(-1.0f, -1));
        } else {
            this.b = null;
        }
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.c0 = handler;
        handler.post(new c0(this, 2));
        CameraView cameraView2 = this.b;
        if (cameraView2 != null) {
            cameraView2.setAlpha(Utilities.clamp01((j() - 0.15f) / 0.45f));
        }
        invalidate();
        b(1.0f, 500L, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7 A[Catch: all -> 0x00c2, Exception -> 0x00e1, LOOP:2: B:58:0x00f5->B:59:0x00f7, LOOP_END, TryCatch #2 {Exception -> 0x00e1, all -> 0x00c2, blocks: (B:39:0x009f, B:41:0x00bd, B:42:0x00c6, B:44:0x00cc, B:46:0x00d2, B:52:0x00e7, B:54:0x00ed, B:57:0x00f3, B:59:0x00f7, B:61:0x010b), top: B:38:0x009f }] */
    /* JADX WARN: Type inference failed for: r12v12, types: [android.graphics.PointF[], java.lang.Cloneable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.graphics.PointF[], java.lang.Cloneable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xf.c a(d0 d0Var, Bitmap bitmap) {
        int i10;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        r8.n nVar = d0Var.e0;
        int i11 = 0;
        if (nVar != null && nVar.b.k()) {
            r8.n nVar2 = d0Var.e0;
            g3 g3Var = new g3(22);
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
        } else if (d0Var.f0 != null) {
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            try {
                androidx.biometric.e m10 = d0Var.f0.m(new n4.s(15, (Object) new ec.f(new dc.g(width, height, iArr)), false));
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
                            d0Var.f0.getClass();
                            return cVar;
                        }
                    }
                    i10 = 0;
                    ?? r132 = new PointF[i10];
                    while (i11 < i10) {
                    }
                    xf.c cVar2 = new xf.c(trim2, r132);
                    d0Var.f0.getClass();
                    return cVar2;
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                d0Var.f0.getClass();
                throw th2;
            }
            d0Var.f0.getClass();
            return null;
        }
        return null;
    }

    public static boolean i(RectF rectF, float f7, float f10) {
        return f7 >= rectF.left - ((float) AndroidUtilities.dp(8.0f)) && f7 <= rectF.right + ((float) AndroidUtilities.dp(8.0f)) && f10 >= rectF.top - ((float) AndroidUtilities.dp(8.0f)) && f10 <= rectF.bottom + ((float) AndroidUtilities.dp(8.0f));
    }

    public final void b(float f7, long j10, c0 c0Var) {
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.P, f7);
        ofFloat.addUpdateListener(new i6(this, 28));
        ofFloat.addListener(new ah.q0(this, c0Var));
        ofFloat.setDuration((long) (Math.abs(f7 - this.P) * j10));
        ofFloat.setInterpolator(new LinearInterpolator());
        this.Q = ofFloat;
        ofFloat.start();
    }

    public final float c(float f7, float f10) {
        if (Math.abs(f7 - f10) < 0.005f) {
            return f10;
        }
        invalidate();
        return ((f10 - f7) * 0.3f) + f7;
    }

    public final void d() {
        if (this.R || this.S) {
            return;
        }
        this.R = true;
        this.d0 = false;
        b(0.0f, 330L, new c0(this, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        RectF rectF;
        float f11;
        float f12;
        float f13;
        CameraView cameraView;
        Canvas canvas2 = canvas;
        float lerp = AndroidUtilities.lerp(1.0f, 1.15f, h());
        float j10 = j();
        RectF rectF2 = this.d;
        float width = (rectF2.width() / 2.0f) * lerp;
        float height = (rectF2.height() / 2.0f) * lerp;
        float centerX = rectF2.centerX();
        float centerY = rectF2.centerY();
        float lerp2 = AndroidUtilities.lerp(centerX - width, 0.0f, j10);
        float lerp3 = AndroidUtilities.lerp(centerY - height, 0.0f, j10);
        float lerp4 = AndroidUtilities.lerp(centerX + width, getWidth(), j10);
        float lerp5 = AndroidUtilities.lerp(centerY + height, getHeight(), j10);
        RectF rectF3 = this.e;
        rectF3.set(lerp2, lerp3, lerp4, lerp5);
        float lerp6 = AndroidUtilities.lerp(AndroidUtilities.lerp(1.0f, 1.15f, h()) * (rectF2.height() / 2.0f), this.O, j());
        int save = canvas2.save();
        if (this.P < 1.0f) {
            Path path = this.s;
            path.rewind();
            path.addRoundRect(rectF3, lerp6, lerp6, Path.Direction.CW);
            canvas2.clipPath(path);
        }
        float clamp01 = 1.0f - Utilities.clamp01(j() / 0.35f);
        float clamp012 = Utilities.clamp01(j() / 0.3f);
        Paint paint = this.w;
        if (clamp012 > 0.0f) {
            paint.setColor(-16777216);
            paint.setAlpha((int) (clamp012 * 255.0f));
            canvas2.drawRect(rectF3, paint);
        }
        int width2 = getWidth();
        int height2 = getHeight();
        if (this.P >= 1.0f || width2 <= 0 || height2 <= 0) {
            f7 = 2.0f;
        } else {
            f7 = 2.0f;
            float max = Math.max(rectF3.width() / width2, rectF3.height() / height2);
            canvas2.translate(rectF3.centerX(), rectF3.centerY());
            canvas2.scale(max, max);
            canvas2.translate((-width2) / 2.0f, (-height2) / 2.0f);
        }
        super.dispatchDraw(canvas);
        float clamp013 = Utilities.clamp01((j() - 0.15f) / 0.45f);
        if (clamp013 > 0.0f) {
            float dp = AndroidUtilities.dp(14.0f);
            Path path2 = this.v;
            path2.rewind();
            path2.setFillType(Path.FillType.EVEN_ODD);
            float width3 = getWidth();
            f10 = 14.0f;
            float height3 = getHeight();
            Path.Direction direction = Path.Direction.CW;
            path2.addRect(0.0f, 0.0f, width3, height3, direction);
            RectF rectF4 = this.n;
            path2.addRoundRect(rectF4, dp, dp, direction);
            paint.setColor(TLObject.FLAG_30);
            paint.setAlpha((int) (64.0f * clamp013));
            canvas2.drawPath(path2, paint);
            path2.setFillType(Path.FillType.WINDING);
            float dp2 = AndroidUtilities.dp(28.0f);
            float f14 = clamp013 * 255.0f;
            f11 = 0.0f;
            int i10 = (int) ((1.0f - this.j0) * f14);
            f12 = 255.0f;
            Paint paint2 = this.x;
            paint2.setAlpha(i10);
            path2.rewind();
            path2.moveTo(rectF4.left, rectF4.top + dp2);
            path2.lineTo(rectF4.left, rectF4.top + dp);
            float f15 = rectF4.left;
            float f16 = rectF4.top;
            path2.quadTo(f15, f16, f15 + dp, f16);
            path2.lineTo(rectF4.left + dp2, rectF4.top);
            path2.moveTo(rectF4.right - dp2, rectF4.top);
            path2.lineTo(rectF4.right - dp, rectF4.top);
            float f17 = rectF4.right;
            float f18 = rectF4.top;
            path2.quadTo(f17, f18, f17, f18 + dp);
            path2.lineTo(rectF4.right, rectF4.top + dp2);
            path2.moveTo(rectF4.right, rectF4.bottom - dp2);
            path2.lineTo(rectF4.right, rectF4.bottom - dp);
            float f19 = rectF4.right;
            float f20 = rectF4.bottom;
            path2.quadTo(f19, f20, f19 - dp, f20);
            path2.lineTo(rectF4.right - dp2, rectF4.bottom);
            path2.moveTo(rectF4.left + dp2, rectF4.bottom);
            path2.lineTo(rectF4.left + dp, rectF4.bottom);
            float f21 = rectF4.left;
            float f22 = rectF4.bottom;
            path2.quadTo(f21, f22, f21, f22 - dp);
            path2.lineTo(rectF4.left, rectF4.bottom - dp2);
            canvas2.drawPath(path2, paint2);
            if (this.N != null) {
                canvas2.save();
                canvas2.translate((getWidth() / f7) - (this.N.getWidth() / f7), (rectF4.top - AndroidUtilities.dp(36.0f)) - this.N.getHeight());
                this.K.setAlpha((int) f14);
                this.N.draw(canvas2);
                canvas2.restore();
            }
            float c10 = c(this.j0, this.i0 != null ? 1.0f : 0.0f);
            this.j0 = c10;
            PointF[] pointFArr = this.i0;
            int i11 = 1;
            if (pointFArr == null || pointFArr.length < 3 || (cameraView = this.b) == null || c10 <= 0.0f) {
                f13 = clamp013;
                rectF = rectF3;
            } else {
                TextureView textureView = cameraView.getTextureView();
                float left = textureView.getLeft() + cameraView.getLeft();
                float top = textureView.getTop() + cameraView.getTop();
                float right = textureView.getRight() + cameraView.getLeft();
                float bottom = textureView.getBottom() + cameraView.getTop();
                RectF rectF5 = this.r;
                rectF5.set(left, top, right, bottom);
                int min = Math.min(4, this.i0.length);
                float f23 = 0.0f;
                float f24 = 0.0f;
                for (int i12 = 0; i12 < min; i12++) {
                    PointF pointF = this.i0[i12];
                    f23 += pointF.x;
                    f24 += pointF.y;
                }
                float f25 = min;
                float width4 = (rectF5.width() * (f23 / f25)) + rectF5.left;
                float height4 = (rectF5.height() * (f24 / f25)) + rectF5.top;
                path2.rewind();
                int i13 = 0;
                while (i13 < min) {
                    PointF[] pointFArr2 = this.i0;
                    PointF pointF2 = pointFArr2[((i13 + min) - i11) % min];
                    PointF pointF3 = pointFArr2[i13];
                    int i14 = i13 + 1;
                    PointF pointF4 = pointFArr2[i14 % min];
                    float f26 = clamp013;
                    float width5 = (rectF5.width() * pointF3.x) + rectF5.left;
                    int i15 = min;
                    float height5 = (rectF5.height() * pointF3.y) + rectF5.top;
                    float width6 = (rectF5.width() * pointF2.x) + rectF5.left;
                    float height6 = (rectF5.height() * pointF2.y) + rectF5.top;
                    float width7 = (rectF5.width() * pointF4.x) + rectF5.left;
                    float height7 = (rectF5.height() * pointF4.y) + rectF5.top;
                    path2.moveTo(a6.x(width6, width5, 0.18f, width5), a6.x(height6, height5, 0.18f, height5));
                    path2.lineTo(width5, height5);
                    path2.lineTo(((width7 - width5) * 0.18f) + width5, a6.x(height7, height5, 0.18f, height5));
                    clamp013 = f26;
                    min = i15;
                    i13 = i14;
                    rectF3 = rectF3;
                    i11 = 1;
                }
                f13 = clamp013;
                rectF = rectF3;
                canvas2.save();
                float lerp7 = AndroidUtilities.lerp(0.5f, 1.1f, this.j0);
                canvas2.scale(lerp7, lerp7, width4, height4);
                int i16 = (int) (this.j0 * 255.0f * f13);
                Paint paint3 = this.y;
                paint3.setAlpha(i16);
                canvas2.drawPath(path2, paint3);
                canvas2.restore();
            }
            this.U = c(this.U, this.T == 0 ? 0.88f : 1.0f);
            this.V = c(this.V, this.T != 1 ? 1.0f : 0.88f);
            this.a0 = c(this.a0, this.W ? 1.0f : 0.0f);
            float f27 = f13;
            f(canvas2, this.f, this.U, f27, null);
            canvas2 = canvas;
            f(canvas2, this.h, this.V, f27, this.I);
        } else {
            f10 = 14.0f;
            rectF = rectF3;
            f11 = 0.0f;
            f12 = 255.0f;
        }
        canvas2.restoreToCount(save);
        if (clamp01 > f11) {
            Canvas canvas3 = canvas2;
            RectF rectF6 = rectF;
            g(lerp6, clamp01, canvas3, rectF6, false);
            float lerp8 = AndroidUtilities.lerp(1.0f, 1.15f, h());
            String str = this.L;
            Drawable drawable = this.H;
            if (str == null) {
                float dp3 = ((int) (AndroidUtilities.dp(22.0f) * lerp8)) / f7;
                drawable.setBounds((int) (rectF6.centerX() - dp3), (int) (rectF6.centerY() - dp3), (int) (rectF6.centerX() + dp3), (int) (rectF6.centerY() + dp3));
                drawable.setAlpha((int) (clamp01 * f12));
                drawable.draw(canvas3);
                return;
            }
            float dp4 = ((AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(12.0f)) * lerp8) + rectF6.left;
            float dp5 = ((int) (AndroidUtilities.dp(20.0f) * lerp8)) / f7;
            drawable.setBounds((int) (dp4 - dp5), (int) (rectF6.centerY() - dp5), (int) (dp4 + dp5), (int) (rectF6.centerY() + dp5));
            int i17 = (int) (clamp01 * f12);
            drawable.setAlpha(i17);
            drawable.draw(canvas3);
            TextPaint textPaint = this.M;
            textPaint.setTextSize(AndroidUtilities.dp(f10) * lerp8);
            textPaint.setAlpha(i17);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            canvas3.drawText(this.L, ((AndroidUtilities.dp(6.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(12.0f)) * lerp8) + rectF6.left, rectF6.centerY() - ((fontMetrics.ascent + fontMetrics.descent) / f7), textPaint);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.P >= 1.0f && !this.R) {
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
                this.T = i10;
                invalidate();
            } else {
                if (actionMasked == 1) {
                    int i11 = this.T;
                    if (i11 == 0) {
                        performHapticFeedback(3);
                        d();
                    } else {
                        CameraView cameraView = this.b;
                        if (i11 == 1) {
                            performHapticFeedback(3);
                            CameraSessionWrapper cameraSession = cameraView != null ? cameraView.getCameraSession() : null;
                            if (cameraSession != null) {
                                boolean z10 = this.W;
                                this.W = !z10;
                                cameraSession.setCurrentFlashMode(!z10 ? "torch" : "off");
                                invalidate();
                            }
                        } else if (cameraView != null) {
                            cameraView.focusToPoint((int) x10, (int) y3);
                        }
                    }
                    this.T = -1;
                    invalidate();
                    return true;
                }
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        this.T = -1;
                        invalidate();
                        return true;
                    }
                } else if ((this.T == 0 && !i(rectF2, x10, y3)) || (this.T == 1 && !i(rectF, x10, y3))) {
                    this.T = -1;
                    invalidate();
                    return true;
                }
            }
        }
        return true;
    }

    public final void e() {
        if (this.S) {
            return;
        }
        this.S = true;
        this.d0 = false;
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Q = null;
        }
        CameraView cameraView = this.b;
        if (cameraView != null) {
            CameraSessionWrapper cameraSession = cameraView.getCameraSession();
            if (this.W && cameraSession != null) {
                cameraSession.setCurrentFlashMode("off");
            }
            this.b.destroy(true, null);
        }
        this.c0.removeCallbacksAndMessages(null);
        this.c0.post(new c0(this, 1));
    }

    public final void f(Canvas canvas, RectF rectF, float f7, float f10, Drawable drawable) {
        canvas.save();
        canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
        float height = rectF.height() / 2.0f;
        g(height, f10, canvas, rectF, true);
        if (drawable == this.I && this.a0 > 0.0f) {
            Paint paint = this.w;
            paint.setColor(-1);
            paint.setAlpha((int) (this.a0 * 102.0f * f10));
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
            g2 g2Var = this.J;
            g2Var.setAlpha((int) (f10 * 255.0f));
            canvas.save();
            canvas.translate(rectF.centerX() - (AndroidUtilities.dp(24.0f) / 2.0f), rectF.centerY() - (AndroidUtilities.dp(24.0f) / 2.0f));
            g2Var.draw(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public final void g(float f7, float f10, Canvas canvas, RectF rectF, boolean z10) {
        CameraView cameraView;
        if (f10 <= 0.0f) {
            return;
        }
        Path path = this.v;
        path.rewind();
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        Paint paint = this.w;
        if (z10 && b0.f() && (cameraView = this.b) != null && canvas.isHardwareAccelerated()) {
            Object obj = this.c;
            if (b0.e(obj)) {
                if (f10 < 1.0f) {
                    canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f));
                }
                canvas.save();
                canvas.translate(cameraView.getLeft(), cameraView.getTop());
                b0.c(canvas, obj);
                canvas.restore();
                if (f10 < 1.0f) {
                    canvas.restore();
                }
                int clamp01 = (int) (Utilities.clamp01(e1.b[3] / 100.0f) * 255.0f);
                paint.setColor((clamp01 << 24) | 16777215);
                paint.setAlpha((int) (clamp01 * f10));
                canvas.drawRect(rectF, paint);
                float min = Math.min(rectF.height(), AndroidUtilities.dp(40.0f));
                Matrix matrix = this.F;
                matrix.setScale(1.0f, min);
                matrix.postTranslate(0.0f, rectF.top);
                LinearGradient linearGradient = this.E;
                linearGradient.setLocalMatrix(matrix);
                paint.setShader(linearGradient);
                paint.setAlpha((int) (255.0f * f10));
                canvas.drawRect(rectF, paint);
                paint.setShader(null);
                canvas.restore();
                this.G.a(canvas, rectF, f7, 0, f10);
            }
        }
        paint.setColor(687865856);
        paint.setAlpha((int) (41.0f * f10));
        canvas.drawRect(rectF, paint);
        int clamp012 = (int) (Utilities.clamp01(e1.b[3] / 100.0f) * 255.0f);
        paint.setColor((clamp012 << 24) | 16777215);
        paint.setAlpha((int) (clamp012 * f10));
        canvas.drawRect(rectF, paint);
        float min2 = Math.min(rectF.height(), AndroidUtilities.dp(40.0f));
        Matrix matrix2 = this.F;
        matrix2.setScale(1.0f, min2);
        matrix2.postTranslate(0.0f, rectF.top);
        LinearGradient linearGradient2 = this.E;
        linearGradient2.setLocalMatrix(matrix2);
        paint.setShader(linearGradient2);
        paint.setAlpha((int) (255.0f * f10));
        canvas.drawRect(rectF, paint);
        paint.setShader(null);
        canvas.restore();
        this.G.a(canvas, rectF, f7, 0, f10);
    }

    public final float h() {
        return this.R ? Utilities.clamp01(this.P / 0.12f) : bs.k.getInterpolation(Utilities.clamp01((this.P * 500.0f) / 150.0f));
    }

    public final float j() {
        if (this.R) {
            return 1.0f - m0.getInterpolation(1.0f - this.P);
        }
        return l0.getInterpolation(Utilities.clamp01(((this.P * 500.0f) - 110.0f) / 390.0f));
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
        this.N = new StaticLayout(LocaleController.getString(R.string.ScanQrCode), this.K, org.telegram.messenger.q.b(72.0f, i14, 1), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        RectF rectF2 = this.f;
        if (rectF2.isEmpty()) {
            float currentActionBarHeight = (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f) + AndroidUtilities.statusBarHeight;
            rectF2.set(AndroidUtilities.dp(9.0f), currentActionBarHeight - AndroidUtilities.dp(20.0f), AndroidUtilities.dp(49.0f), currentActionBarHeight + AndroidUtilities.dp(20.0f));
        }
    }
}
