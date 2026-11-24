// default package

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yx0 extends View {
    public float E;
    public float F;
    public long G;
    public boolean H;
    public boolean I;
    public VelocityTracker J;
    public float K;
    public boolean L;
    public float M;
    public Bitmap N;
    public BitmapShader O;
    public Paint P;
    public Matrix Q;
    public final RectF R;
    public final ArrayList S;
    public View T;
    public ValueAnimator U;
    public boolean V;
    public float W;
    public qx0 a;
    public ValueAnimator a0;
    public vx0 b;
    public final int[] b0;
    public nx0 c;
    public final int[] c0;
    public ValueAnimator d;
    public final RectF d0;
    public float e;
    public final RectF e0;
    public final lm f;
    public final RectF f0;
    public final Path g0;
    public final OverScroller h;
    public tgb h0;
    public boolean i0;
    public ff0 j0;
    public xl3 k0;
    public final int n;
    public final int r;
    public int s;
    public final ux0 w;
    public xx0 x;
    public boolean y;

    public yx0(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f = new lm(this, 0L, 350L, s33.h);
        this.R = new RectF();
        this.S = new ArrayList();
        this.b0 = new int[2];
        this.c0 = new int[2];
        this.d0 = new RectF();
        this.e0 = new RectF();
        this.f0 = new RectF();
        this.g0 = new Path();
        setWillNotDraw(false);
        this.h = new OverScroller(launchActivity);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(launchActivity);
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.r = viewConfiguration.getScaledMinimumFlingVelocity();
        ux0 ux0Var = new ux0(this, this);
        this.w = ux0Var;
        jdc.k(this, ux0Var);
        setImportantForAccessibility(2);
        bdc.i(this, new sg0(this, (byte) 14));
    }

    public static void g(ViewGroup viewGroup, float f, final x0 x0Var) {
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            x0Var.a(null);
            return;
        }
        final SurfaceTexture d = fk.d();
        d.setDefaultBufferSize(viewGroup.getWidth(), viewGroup.getHeight());
        final Surface surface = new Surface(d);
        final Bitmap createBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
        lockHardwareCanvas.translate(0.0f, f);
        viewGroup.draw(lockHardwareCanvas);
        surface.unlockCanvasAndPost(lockHardwareCanvas);
        PixelCopy.request(surface, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: tx0
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                x0 x0Var2 = x0.this;
                Bitmap bitmap = createBitmap;
                Surface surface2 = surface;
                SurfaceTexture surfaceTexture = d;
                if (i == 0) {
                    x0Var2.a(bitmap);
                } else {
                    bitmap.recycle();
                    x0Var2.a(null);
                }
                surface2.release();
                surfaceTexture.release();
            }
        }, new Handler());
    }

    private float getScrollStep() {
        return gl.L(200.0f);
    }

    private void setModalAccessibility(boolean z) {
        setImportantForAccessibility(z ? 1 : 2);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != this) {
                    childAt.setImportantForAccessibility(z ? 4 : 0);
                }
            }
        }
        ux0 ux0Var = this.w;
        if (ux0Var != null) {
            ux0Var.i();
        }
        if (z) {
            sendAccessibilityEvent(32);
        }
    }

    public final void a(boolean z) {
        if (this.V == z) {
            return;
        }
        ValueAnimator valueAnimator = this.a0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.V = z;
        qx0 qx0Var = this.a;
        if (qx0Var != null) {
            qx0Var.b = false;
            qx0Var.invalidate();
        }
        setModalAccessibility(z);
        invalidate();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, z ? 1.0f : 0.0f);
        this.a0 = ofFloat;
        ofFloat.addUpdateListener(new rx0(this, (byte) 0));
        this.a0.addListener(new g0(this, (byte) 27));
        this.a0.setInterpolator(s33.h);
        this.a0.setDuration(320L);
        this.a0.start();
    }

    public final void b(vx0 vx0Var) {
        ValueAnimator valueAnimator;
        if (this.a == null) {
            return;
        }
        if (this.b != null && (valueAnimator = this.d) != null) {
            valueAnimator.end();
            this.d = null;
        }
        this.b = vx0Var;
        vx0Var.b(false);
        ValueAnimator valueAnimator2 = this.d;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        px0 c = vx0Var.c();
        qx0 qx0Var = this.a;
        ArrayList<px0> tabs = qx0Var.getTabs();
        ArrayList<nx0> tabDrawables = qx0Var.getTabDrawables();
        nx0 nx0Var = new nx0(qx0Var, c);
        byte b = 1;
        nx0Var.e.e(true, -1.0f);
        nx0Var.f.e(true, 0.0f);
        tabDrawables.add(nx0Var);
        tabs.add(0, c);
        for (int i = 0; i < tabDrawables.size(); i++) {
            nx0 nx0Var2 = tabDrawables.get(i);
            int indexOf = tabs.indexOf(nx0Var2.a);
            nx0Var2.d = indexOf;
            if (indexOf >= 0) {
                nx0Var2.c = indexOf;
            }
        }
        qx0Var.n();
        qx0Var.o(true);
        qx0Var.invalidate();
        ox0 ox0Var = qx0Var.e;
        if (ox0Var != null) {
            ox0Var.i();
        }
        this.c = nx0Var;
        post(new nv0(vx0Var, (byte) 4));
        invalidate();
        this.e = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new rx0(this, (byte) 2));
        this.d.addListener(new i8(this, c, vx0Var, b));
        gl.n(this.d, 220.0d, 30.0d);
        this.d.setDuration((long) (r11.getDuration() * 1.1f));
        this.d.start();
    }

    public final float c(boolean z) {
        return (e(z) - Math.min(3.0f, e(z))) - (Utilities.i(4.0f - e(z), 0.5f, 0.0f) * (Math.min(3.0f, e(z)) / 3.0f));
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.h.computeScrollOffset()) {
            setScrollOffset(r0.getCurrY() / getScrollStep());
            postInvalidateOnAnimation();
        }
    }

    public final float d(boolean z) {
        return Utilities.i(e(z), 1.0f, 0.0f) * ((-getScrollWindow()) / 3.0f);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        ArrayList arrayList;
        float f;
        int i;
        ff0 i0;
        float f2;
        int i2;
        int i3;
        float f3;
        float f4;
        ArrayList arrayList2;
        float f5;
        RectF rectF2;
        int i4;
        float f6;
        float f7;
        yx0 yx0Var = this;
        super.dispatchDraw(canvas);
        vx0 vx0Var = yx0Var.b;
        float f8 = 1.0f;
        float f9 = 0.0f;
        int i5 = 1;
        int[] iArr = yx0Var.b0;
        int[] iArr2 = yx0Var.c0;
        int i6 = 0;
        RectF rectF3 = yx0Var.d0;
        if (vx0Var != null) {
            yx0Var.getLocationOnScreen(iArr2);
            yx0Var.a.getLocationOnScreen(iArr);
            yx0Var.a.d(rectF3, 0.0f);
            rectF3.offset(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
            canvas.save();
            canvas.clipRect(0, 0, yx0Var.getMeasuredWidth(), yx0Var.getMeasuredHeight() - yx0Var.s);
            wx0 d = yx0Var.b.d();
            float f10 = yx0Var.e;
            RectF rectF4 = yx0Var.f0;
            float y = d.y(canvas, rectF3, f10, rectF4, f10);
            if (yx0Var.c != null) {
                Path path = yx0Var.g0;
                path.rewind();
                path.addRoundRect(rectF4, y, y, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                float B = ls6.B(1.0f, yx0Var.e, gl.L(50.0f), rectF4.top);
                rectF3.set(rectF4.left, B, rectF4.right, gl.L(50.0f) + B);
                yx0Var.a.setupTab(yx0Var.c);
                yx0Var.c.a(canvas, rectF3, y, yx0Var.e, 1.0f);
                rectF = rectF3;
                canvas.restore();
            } else {
                rectF = rectF3;
            }
            canvas.restore();
        } else {
            rectF = rectF3;
        }
        if (yx0Var.W <= 0.0f) {
            return;
        }
        canvas.save();
        View view = yx0Var.T;
        RectF rectF5 = yx0Var.R;
        if (view != null) {
            view.getLocationOnScreen(iArr);
            yx0Var.getLocationOnScreen(iArr2);
            rectF5.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], yx0Var.T.getWidth() + r1, yx0Var.T.getHeight() + (iArr[1] - iArr2[1]));
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
            rectF5.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        canvas.clipRect(rectF5);
        canvas.translate(rectF5.left, rectF5.top);
        float width = rectF5.width();
        float height = rectF5.height();
        float f11 = 255.0f;
        if (yx0Var.N != null) {
            yx0Var.Q.reset();
            float width2 = rectF5.width() / yx0Var.N.getWidth();
            yx0Var.Q.postScale(width2, width2);
            yx0Var.O.setLocalMatrix(yx0Var.Q);
            yx0Var.P.setAlpha((int) (yx0Var.W * 255.0f));
            canvas.drawRect(0.0f, 0.0f, width, height, yx0Var.P);
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, kk7.d4, 31);
        float f12 = width;
        float L = gl.L(55.0f) + gl.L(40.0f) + gl.m;
        float L2 = gl.L(68.0f);
        int min = (int) Math.min(gl.L(340.0f), 0.95f * f12);
        int height2 = (int) (gl.O1() ? rectF5.height() * 0.5f : 0.75f * height);
        float f13 = f12 / 2.0f;
        float f14 = 0.0f;
        int i7 = 0;
        while (true) {
            arrayList = yx0Var.S;
            f = f11;
            if (i7 >= arrayList.size()) {
                break;
            }
            f14 += ((xx0) arrayList.get(i7)).d.d >= 0 ? 1.0f : 0.0f;
            i7++;
            f11 = f;
        }
        float e = yx0Var.f.e(false, f14);
        float R1 = gl.R1(0.0f, 1.0f - Utilities.i(yx0Var.getScrollWindow() <= 0.0f ? 0.0f : ((yx0Var.getScrollMin() - yx0Var.getScrollOffset()) / (yx0Var.getScrollWindow() * 0.15f)) * 0.2f, 1.0f, 0.0f), yx0Var.W);
        int i8 = 0;
        while (true) {
            i = i5;
            int i9 = i6;
            if (i8 >= arrayList.size() + 1) {
                break;
            }
            if (i8 == arrayList.size()) {
                f6 = L;
                f2 = L2;
                i3 = min;
                f3 = R1;
                i2 = i8;
                f4 = f12;
                f7 = f8;
                arrayList2 = arrayList;
                f5 = e;
                rectF2 = rectF;
                i4 = height2;
            } else {
                xx0 xx0Var = (xx0) arrayList.get(i8);
                if (i8 < arrayList.size()) {
                    nx0 nx0Var = xx0Var.d;
                }
                nx0 nx0Var2 = xx0Var.d;
                float f15 = f8;
                float[] fArr = xx0Var.h;
                float f16 = f9;
                float[] fArr2 = xx0Var.g;
                float f17 = L;
                Matrix matrix = xx0Var.f;
                float c = (e - f15) - nx0Var2.c();
                f2 = L2;
                i2 = i8;
                float max = (c - Math.max(yx0Var.getScrollMin(), yx0Var.getScrollOffset())) / yx0Var.getScrollWindow();
                float min2 = (Math.min(5.0f, c) * gl.L(6.0f)) + f17;
                float f18 = height2;
                float f19 = ((((height - f2) - (0.26f * f18)) - min2) * max) + min2;
                float f20 = min / 2.0f;
                i3 = min;
                RectF rectF6 = yx0Var.e0;
                rectF6.set(f13 - f20, f19, f13 + f20, f19 + f18);
                int i10 = ((rectF6.top > height || rectF6.bottom < f16 || R1 < 0.1f) && c < e - 3.0f) ? i : i9;
                yx0Var.a.d(rectF, Utilities.i(nx0Var2.c(), f15, f16));
                rectF.offset(yx0Var.a.getX(), yx0Var.a.getY());
                gl.a2(rectF, rectF6, R1, rectF6);
                qx0 qx0Var = yx0Var.a;
                if (qx0Var != null) {
                    qx0Var.setupTab(nx0Var2);
                }
                if (rectF6.top > height || rectF6.bottom < 0.0f) {
                    f3 = R1;
                    f4 = f12;
                    arrayList2 = arrayList;
                    f5 = e;
                    rectF2 = rectF;
                    i4 = height2;
                    f6 = f17;
                    f7 = 1.0f;
                } else {
                    canvas.save();
                    xx0Var.a.set(rectF6);
                    matrix.reset();
                    fArr2[i9] = rectF6.left;
                    float f21 = rectF6.top;
                    fArr2[i] = f21;
                    float f22 = rectF6.right;
                    fArr2[2] = f22;
                    fArr2[3] = f21;
                    fArr2[4] = f22;
                    fArr2[5] = (rectF6.height() * 1.0f) + f21;
                    fArr2[6] = rectF6.left;
                    fArr2[7] = (rectF6.height() * 1.0f) + rectF6.top;
                    fArr[i9] = rectF6.left;
                    fArr[i] = rectF6.top - gl.L(0.0f);
                    fArr[2] = rectF6.right;
                    fArr[3] = rectF6.top - gl.L(0.0f);
                    float f23 = R1 * 1.0f;
                    fArr[4] = (gl.R1(1.0f, 0.83f, f23) * (rectF6.width() / 2.0f)) + rectF6.centerX();
                    fArr[5] = (gl.R1(1.0f, 0.6f, f23) * ((rectF6.height() * 1.0f) + gl.L(0.0f))) + (rectF6.top - gl.L(0.0f));
                    fArr[6] = rectF6.centerX() - (gl.R1(1.0f, 0.83f, f23) * (rectF6.width() / 2.0f));
                    fArr[7] = (gl.R1(1.0f, 0.6f, f23) * ((rectF6.height() * 1.0f) + gl.L(0.0f))) + (rectF6.top - gl.L(0.0f));
                    matrix.setPolyToPoly(fArr2, 0, fArr, 0, 4);
                    canvas.concat(matrix);
                    float R12 = gl.R1(nx0Var2.b(), 1.0f, yx0Var.W);
                    float R13 = gl.R1(Utilities.l((c - e) + 2.0f), 1.0f, Utilities.l((R1 - 0.1f) / 0.8f));
                    nx0 nx0Var3 = xx0Var.d;
                    RadialGradient radialGradient = xx0Var.p;
                    Paint paint = xx0Var.o;
                    Paint paint2 = xx0Var.r;
                    Matrix matrix2 = xx0Var.q;
                    f3 = R1;
                    px0 px0Var = xx0Var.c;
                    arrayList2 = arrayList;
                    Path path2 = xx0Var.n;
                    f5 = e;
                    Paint paint3 = xx0Var.e;
                    rectF2 = rectF;
                    RectF rectF7 = xx0Var.m;
                    i4 = height2;
                    Paint paint4 = xx0Var.l;
                    f4 = f12;
                    f7 = 1.0f;
                    float i11 = Utilities.i(1.0f - ((Math.abs(xx0Var.i) - 0.3f) / 0.7f), 1.0f, 0.0f) * R12;
                    if (i11 <= 0.0f) {
                        f6 = f17;
                    } else {
                        float f24 = f23 * 1.0f;
                        float R14 = gl.R1(1.0f, 1.3f, f24);
                        float currentActionBarHeight = ((a.getCurrentActionBarHeight() + gl.m) - gl.L(50.0f)) * 0.0f;
                        canvas.save();
                        canvas.rotate(xx0Var.i * 20.0f, (xx0Var.i * gl.L(50.0f)) + rectF6.centerX(), rectF6.bottom + gl.L(350.0f));
                        float a = xx0Var.k.a(0.01f);
                        canvas.scale(a, a, rectF6.centerX(), rectF6.centerY());
                        float U1 = gl.U1(f23, gl.L(18.0f), gl.L(18.0f));
                        if (i10 != 0) {
                            paint4.setColor(i9);
                            paint4.setShadowLayer(gl.L(30.0f), 0.0f, gl.L(10.0f), bkb.p1(i11 * f23 * 1.0f, TLObject.FLAG_29));
                            canvas.drawRoundRect(rectF6, U1, U1, paint4);
                            paint3.setAlpha((int) (i11 * f));
                            canvas.drawRoundRect(rectF6, U1, U1, paint3);
                            canvas.restore();
                            f6 = f17;
                            f7 = 1.0f;
                        } else {
                            path2.rewind();
                            path2.addRoundRect(rectF6, U1, U1, Path.Direction.CW);
                            canvas.save();
                            paint4.setColor(0);
                            paint4.setShadowLayer(gl.L(30.0f), 0.0f, gl.L(10.0f), bkb.p1(i11 * f23 * 1.0f, TLObject.FLAG_29));
                            canvas.drawPath(path2, paint4);
                            canvas.clipPath(path2);
                            float f25 = i11 * f * f23;
                            int i12 = (int) f25;
                            paint3.setAlpha(i12);
                            canvas.drawRoundRect(rectF6, U1, U1, paint3);
                            canvas.save();
                            canvas.translate(rectF6.left, ir2.i(gl.L(50.0f), R14, rectF6.top, currentActionBarHeight));
                            canvas.scale(1.0f, gl.R1(1.0f, 1.25f, f24));
                            if (px0Var != null && px0Var.m != null) {
                                float width3 = rectF6.width() / px0Var.m.getWidth();
                                canvas.scale(width3, width3);
                                paint.setAlpha(i12);
                                canvas.drawBitmap(px0Var.m, 0.0f, 0.0f, paint);
                            }
                            canvas.restore();
                            canvas.save();
                            paint2.setAlpha((int) (f25 * 1.0f));
                            matrix2.reset();
                            float height3 = rectF6.height() / f;
                            matrix2.postScale(height3, height3);
                            matrix2.postTranslate(rectF6.centerX(), rectF6.top);
                            radialGradient.setLocalMatrix(matrix2);
                            paint2.setShader(radialGradient);
                            canvas.drawRect(rectF6, paint2);
                            canvas.restore();
                            rectF7.set(rectF6);
                            rectF7.bottom = Math.min(rectF6.height(), gl.L(50.0f)) + rectF7.top;
                            rectF7.offset(0.0f, currentActionBarHeight);
                            nx0Var3.w = f23;
                            f7 = 1.0f;
                            canvas.scale(1.0f, R14, rectF7.centerX(), rectF7.top);
                            float f26 = i11 * i11;
                            f6 = f17;
                            nx0Var3.a(canvas, rectF7, U1, f26, R13);
                            canvas.restore();
                            canvas.restore();
                        }
                    }
                    canvas.restore();
                }
            }
            i8 = i2 + 1;
            L = f6;
            f8 = f7;
            i5 = i;
            R1 = f3;
            arrayList = arrayList2;
            e = f5;
            rectF = rectF2;
            height2 = i4;
            L2 = f2;
            f12 = f4;
            min = i3;
            f9 = 0.0f;
            i6 = 0;
            yx0Var = this;
        }
        float f27 = L;
        float f28 = f12;
        canvas.save();
        if (this.k0 == null) {
            this.k0 = new xl3((byte) 7);
        }
        RectF rectF8 = gl.P;
        rectF8.set(0.0f, 0.0f, f28, f27);
        this.k0.s(canvas, rectF8, i, this.W);
        canvas.restore();
        canvas.restore();
        if (this.h0 == null) {
            this.h0 = new tgb(k96.M0(2131753096, null), 14.0f, gl.o());
        }
        if (this.j0 == null || this.i0 != bkb.I.o()) {
            boolean o = bkb.I.o();
            this.i0 = o;
            if (o) {
                i0 = bkb.i0(64, 64, 64, 64, 553648127, 872415231, 872415231);
                this.j0 = i0;
            } else {
                i0 = bkb.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688);
                this.j0 = i0;
            }
            i0.setCallback(this);
        }
        float L3 = this.h0.c + gl.L(24.0f);
        float f29 = (f28 - L3) / 2.0f;
        this.j0.setBounds((int) f29, (int) ((f27 - (gl.L(95.0f) / 2.0f)) - gl.L(14.0f)), (int) ((f28 + L3) / 2.0f), (int) ((f27 - (gl.L(95.0f) / 2.0f)) + gl.L(14.0f)));
        this.j0.setAlpha((int) (this.W * f));
        this.j0.draw(canvas);
        this.h0.c(f29 + gl.L(12.0f), f27 - (gl.L(95.0f) / 2.0f), this.W, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        ux0 ux0Var;
        if (this.W <= 0.0f || (ux0Var = this.w) == null || !ux0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0467  */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.VelocityTracker, xx0] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        ?? r8;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        boolean z2;
        xx0 xx0Var;
        final byte b = 0;
        if ((gl.O1() && motionEvent.getAction() == 0 && !this.R.contains(motionEvent.getX(), motionEvent.getY())) || this.W <= 0.0f) {
            return false;
        }
        VelocityTracker velocityTracker3 = this.J;
        if (velocityTracker3 == null) {
            velocityTracker3 = VelocityTracker.obtain();
            this.J = velocityTracker3;
        }
        velocityTracker3.addMovement(motionEvent);
        int action = motionEvent.getAction();
        OverScroller overScroller = this.h;
        if (action == 0) {
            this.G = System.currentTimeMillis();
            this.F = motionEvent.getX();
            this.E = motionEvent.getY();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.W >= 1.0f) {
                ArrayList arrayList = this.S;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    xx0Var = (xx0) arrayList.get(size);
                    if (Math.abs(xx0Var.i) < 0.4f && xx0Var.a.contains(x, y)) {
                        break;
                    }
                }
            }
            xx0Var = null;
            this.x = xx0Var;
            ff0 ff0Var = this.j0;
            boolean z3 = ff0Var != null && ff0Var.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
            this.L = z3;
            if (z3) {
                this.x = null;
            }
            ff0 ff0Var2 = this.j0;
            if (ff0Var2 != null) {
                ff0Var2.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.j0.setState(this.L ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : new int[0]);
            }
            this.H = false;
            this.I = false;
            this.y = false;
            xx0 xx0Var2 = this.x;
            if (xx0Var2 != null) {
                ValueAnimator valueAnimator = xx0Var2.j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                boolean contains = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - gl.L(24.0f)));
                this.y = contains;
                if (contains) {
                    ff0 ff0Var3 = this.x.d.l;
                    float x2 = motionEvent.getX();
                    RectF rectF = this.d0;
                    ff0Var3.setHotspot((int) (x2 - rectF.left), (int) (motionEvent.getY() - rectF.centerY()));
                }
                this.x.k.c(!this.y);
                this.x.d.l.setState(this.y ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : new int[0]);
            }
            this.K = motionEvent.getY();
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
            }
            ValueAnimator valueAnimator2 = this.U;
            if (valueAnimator2 == null) {
                return true;
            }
            valueAnimator2.cancel();
            this.U = null;
            return true;
        }
        if (motionEvent.getAction() == 2) {
            xx0 xx0Var3 = this.x;
            if (xx0Var3 != null) {
                if (xx0Var3.k.i) {
                    if (!this.I && !this.H && loe.a(this.F, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > gl.e) {
                        this.I = true;
                    }
                    if (!this.H && !this.I && loe.a(motionEvent.getX(), this.E, motionEvent.getX(), motionEvent.getY()) > gl.e) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator3 = this.U;
                        if (valueAnimator3 != null) {
                            valueAnimator3.cancel();
                            this.U = null;
                        }
                        this.H = true;
                    }
                    if (this.a != null && (this.H || this.I)) {
                        this.x.k.c(false);
                        ValueAnimator valueAnimator4 = this.x.j;
                        if (valueAnimator4 != null) {
                            valueAnimator4.cancel();
                        }
                    }
                } else {
                    if (!this.y && !this.I && !this.H && loe.a(this.F, motionEvent.getY(), motionEvent.getX(), motionEvent.getY()) > gl.e) {
                        this.I = true;
                    }
                    if (!this.y && !this.H && !this.I && loe.a(motionEvent.getX(), this.E, motionEvent.getX(), motionEvent.getY()) > gl.e) {
                        if (!overScroller.isFinished()) {
                            overScroller.abortAnimation();
                        }
                        ValueAnimator valueAnimator5 = this.U;
                        if (valueAnimator5 != null) {
                            valueAnimator5.cancel();
                            this.U = null;
                        }
                        this.H = true;
                    }
                    if (this.y) {
                        boolean contains2 = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - gl.L(24.0f)));
                        this.y = contains2;
                        if (!contains2) {
                            this.x.d.l.setState(new int[0]);
                        }
                    }
                }
                xx0 xx0Var4 = this.x;
                if (!xx0Var4.k.i) {
                    if (this.I) {
                        xx0Var4.i = (motionEvent.getX() - this.F) / gl.L(300.0f);
                    } else if (this.H) {
                        float y2 = motionEvent.getY() - this.K;
                        if (this.M < getScrollMin()) {
                            y2 *= 1.0f - (Utilities.i((getScrollMin() - this.M) / getScrollStep(), 1.0f, 0.0f) * 0.5f);
                        }
                        setScrollOffset(Utilities.i(((getScrollOffset() * getScrollStep()) - y2) / getScrollStep(), getScrollMax(), getScrollMin() - (getScrollStep() * 1.4f)));
                        invalidate();
                    }
                }
                invalidate();
            }
            ff0 ff0Var4 = this.j0;
            if (ff0Var4 != null && this.L) {
                boolean z4 = this.x == null && ff0Var4.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
                this.L = z4;
                if (!z4) {
                    this.j0.setState(new int[0]);
                }
            }
            this.K = motionEvent.getY();
            return true;
        }
        if (motionEvent.getAction() != 1) {
            if (motionEvent.getAction() != 3) {
                return true;
            }
            xx0 xx0Var5 = this.x;
            if (xx0Var5 != null) {
                xx0Var5.a(0.0f);
                this.x.k.c(false);
                this.x.d.l.setState(new int[0]);
            }
            this.x = null;
            this.y = false;
            VelocityTracker velocityTracker4 = this.J;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.J = null;
            }
            this.L = false;
            ff0 ff0Var5 = this.j0;
            if (ff0Var5 == null) {
                return true;
            }
            ff0Var5.setState(new int[0]);
            return true;
        }
        xx0 xx0Var6 = this.x;
        if (xx0Var6 != null) {
            if (this.a == null || Math.abs(xx0Var6.i) <= 0.4f) {
                this.x.a(0.0f);
                if (this.a != null && this.x.k.i) {
                    a(false);
                    xx0 xx0Var7 = this.x;
                    xx0Var7.getClass();
                    this.a.e(xx0Var7.c);
                } else if (this.H) {
                    if (this.M < getScrollMin() - (getScrollWindow() * 0.15f)) {
                        a(false);
                    } else if (this.M < getScrollMin()) {
                        h(getScrollMin());
                    } else {
                        this.J.computeCurrentVelocity(1000, this.n);
                        float yVelocity = this.J.getYVelocity();
                        if (Math.abs(yVelocity) > this.r) {
                            velocityTracker = null;
                            z = true;
                            overScroller.fling(0, (int) (getScrollOffset() * getScrollStep()), 0, (int) (-yVelocity), 0, 0, (int) (getScrollMin() * getScrollStep()), (int) (getScrollMax() * getScrollStep()), 0, (int) (getScrollStep() * 0.1f));
                        } else {
                            velocityTracker = null;
                            z = true;
                            overScroller.startScroll(0, (int) (getScrollOffset() * getScrollStep()), 0, 0, 0);
                        }
                        this.J.recycle();
                        this.J = velocityTracker;
                        postInvalidateOnAnimation();
                        velocityTracker2 = velocityTracker;
                        this.x.k.c(false);
                        z2 = this.y;
                        if (z2) {
                            z2 = this.x.d.l.getBounds().contains((int) (motionEvent.getX() - this.x.a.left), (int) ((motionEvent.getY() - this.x.a.top) - gl.L(24.0f)));
                            this.y = z2;
                        }
                        if (z2) {
                            final xx0 xx0Var8 = this.x;
                            qx0 qx0Var = this.a;
                            px0 px0Var = xx0Var8.c;
                            final byte b2 = z ? (byte) 1 : (byte) 0;
                            qx0Var.g(px0Var, new p8c(this) { // from class: sx0
                                public final /* synthetic */ yx0 b;

                                {
                                    this.b = this;
                                }

                                @Override // p8c
                                public final void a(Object obj) {
                                    byte b3 = b2;
                                    xx0 xx0Var9 = xx0Var8;
                                    yx0 yx0Var = this.b;
                                    Boolean bool = (Boolean) obj;
                                    switch (b3) {
                                        case 0:
                                            if (!bool.booleanValue()) {
                                                xx0Var9.a(0.0f);
                                                break;
                                            } else {
                                                xx0Var9.a(xx0Var9.i < 0.0f ? -1.0f : 1.0f);
                                                yx0Var.h(Utilities.i(yx0Var.M, yx0Var.c(false), yx0Var.d(false)));
                                                if (yx0Var.a.getTabs().isEmpty()) {
                                                    yx0Var.a(false);
                                                    break;
                                                }
                                            }
                                            break;
                                        default:
                                            if (!bool.booleanValue()) {
                                                xx0Var9.a(0.0f);
                                                break;
                                            } else {
                                                xx0Var9.a(1.0f);
                                                yx0Var.h(Utilities.i(yx0Var.M, yx0Var.c(false), yx0Var.d(false)));
                                                if (yx0Var.a.getTabs().isEmpty()) {
                                                    yx0Var.a(false);
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                        }
                        this.x.d.l.setState(new int[0]);
                        r8 = velocityTracker2;
                    }
                    velocityTracker = null;
                    z = true;
                    this.J.recycle();
                    this.J = velocityTracker;
                    postInvalidateOnAnimation();
                    velocityTracker2 = velocityTracker;
                    this.x.k.c(false);
                    z2 = this.y;
                    if (z2) {
                    }
                    if (z2) {
                    }
                    this.x.d.l.setState(new int[0]);
                    r8 = velocityTracker2;
                }
            } else {
                final xx0 xx0Var9 = this.x;
                this.a.g(xx0Var9.c, new p8c(this) { // from class: sx0
                    public final /* synthetic */ yx0 b;

                    {
                        this.b = this;
                    }

                    @Override // p8c
                    public final void a(Object obj) {
                        byte b3 = b;
                        xx0 xx0Var92 = xx0Var9;
                        yx0 yx0Var = this.b;
                        Boolean bool = (Boolean) obj;
                        switch (b3) {
                            case 0:
                                if (!bool.booleanValue()) {
                                    xx0Var92.a(0.0f);
                                    break;
                                } else {
                                    xx0Var92.a(xx0Var92.i < 0.0f ? -1.0f : 1.0f);
                                    yx0Var.h(Utilities.i(yx0Var.M, yx0Var.c(false), yx0Var.d(false)));
                                    if (yx0Var.a.getTabs().isEmpty()) {
                                        yx0Var.a(false);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (!bool.booleanValue()) {
                                    xx0Var92.a(0.0f);
                                    break;
                                } else {
                                    xx0Var92.a(1.0f);
                                    yx0Var.h(Utilities.i(yx0Var.M, yx0Var.c(false), yx0Var.d(false)));
                                    if (yx0Var.a.getTabs().isEmpty()) {
                                        yx0Var.a(false);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            velocityTracker2 = null;
            z = true;
            this.x.k.c(false);
            z2 = this.y;
            if (z2) {
            }
            if (z2) {
            }
            this.x.d.l.setState(new int[0]);
            r8 = velocityTracker2;
        } else {
            Object obj = null;
            z = true;
            if (this.L) {
                this.a.f();
                a(false);
                r8 = obj;
            } else {
                r8 = obj;
                if (loe.a(this.F, this.E, motionEvent.getX(), motionEvent.getY()) <= gl.e) {
                    r8 = obj;
                    if (!this.H) {
                        r8 = obj;
                        if (!this.I) {
                            r8 = obj;
                            if (System.currentTimeMillis() - this.G <= ViewConfiguration.getTapTimeout() * 1.2f) {
                                a(false);
                                r8 = obj;
                            }
                        }
                    }
                }
            }
        }
        this.x = r8;
        this.y = false;
        VelocityTracker velocityTracker5 = this.J;
        if (velocityTracker5 != null) {
            velocityTracker5.recycle();
            this.J = r8;
        }
        this.L = false;
        ff0 ff0Var6 = this.j0;
        if (ff0Var6 == null) {
            return z;
        }
        ff0Var6.setState(new int[0]);
        return z;
    }

    public final float e(boolean z) {
        float f = 0.0f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.S;
            if (i >= arrayList.size()) {
                break;
            }
            f += ((xx0) arrayList.get(i)).d.d >= 0 ? 1.0f : 0.0f;
            i++;
        }
        return z ? this.f.e(false, f) : f;
    }

    public final void f() {
        nx0 nx0Var;
        qx0 qx0Var = this.a;
        if (qx0Var == null || !(qx0Var.getParent() instanceof View)) {
            return;
        }
        HashSet hashSet = ow0.b1;
        if (!hashSet.isEmpty()) {
            Iterator it = new HashSet(hashSet).iterator();
            while (it.hasNext()) {
                ((ow0) it.next()).m(true);
            }
            gl.e3(new nv0(this, (byte) 5), 100L);
            return;
        }
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d = null;
        }
        View view = (View) this.a.getParent();
        this.T = view;
        int[] iArr = this.b0;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        } else {
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.c0;
        getLocationOnScreen(iArr2);
        this.R.set(iArr[0] - iArr2[0], iArr[1] - iArr2[1], this.T.getWidth() + r5, this.T.getHeight() + (iArr[1] - iArr2[1]));
        View view2 = this.T;
        gl.m0 = true;
        this.N = gl.h2(14.0f, 14, view2);
        gl.m0 = false;
        Paint paint = new Paint(1);
        this.P = paint;
        Bitmap bitmap = this.N;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.O = bitmapShader;
        paint.setShader(bitmapShader);
        ColorMatrix colorMatrix = new ColorMatrix();
        gl.i(colorMatrix, bkb.I.o() ? 0.08f : 0.25f);
        this.P.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        this.Q = new Matrix();
        ArrayList arrayList = this.S;
        arrayList.clear();
        ArrayList<px0> tabs = this.a.getTabs();
        ArrayList<nx0> tabDrawables = this.a.getTabDrawables();
        for (int size = tabs.size() - 1; size >= 0; size--) {
            px0 px0Var = tabs.get(size);
            int i = 0;
            while (true) {
                if (i >= tabDrawables.size()) {
                    nx0Var = null;
                    break;
                }
                nx0Var = tabDrawables.get(i);
                if (nx0Var.a == px0Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (nx0Var != null) {
                arrayList.add(new xx0(this, px0Var, nx0Var));
            }
        }
        this.f.e(true, arrayList.size());
        setScrollOffset(getScrollMax());
        a(true);
    }

    public float getScrollMax() {
        return c(true);
    }

    public float getScrollMin() {
        return d(true);
    }

    public float getScrollOffset() {
        return this.M;
    }

    public float getScrollRange() {
        return e(true);
    }

    public float getScrollWindow() {
        return Math.min(3.0f, getScrollRange());
    }

    public final void h(float f) {
        ValueAnimator valueAnimator = this.U;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.U = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M, f);
        this.U = ofFloat;
        ofFloat.addUpdateListener(new rx0(this, (byte) 1));
        this.U.setDuration(250L);
        this.U.setInterpolator(s33.h);
        this.U.start();
    }

    public void setScrollOffset(float f) {
        this.M = f;
    }

    public void setTabsView(qx0 qx0Var) {
        this.a = qx0Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.j0 || super.verifyDrawable(drawable);
    }

    public void setSlowerDismiss(boolean z) {
    }
}
