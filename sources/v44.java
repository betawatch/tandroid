// default package

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class v44 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public int d;
    public final ln e;
    public boolean f;
    public final /* synthetic */ w44 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v44(w44 w44Var, Context context) {
        super(context);
        this.h = w44Var;
        Paint paint = new Paint(1);
        this.a = paint;
        Paint paint2 = new Paint(1);
        this.b = paint2;
        Paint paint3 = new Paint(1);
        this.c = paint3;
        this.e = new ln(this, 0L, 250L, d53.h);
        this.f = true;
        setWillNotDraw(false);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{gm.L(10.0f), gm.L(10.0f)}, 0.5f));
        paint.setShadowLayer(gm.N(0.75f), 0.0f, 0.0f, 1342177280);
        paint2.setColor(-15033089);
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint3.setStrokeWidth(gm.N(2.66f));
        paint3.setShadowLayer(gm.N(0.75f), 0.0f, 0.0f, 1342177280);
    }

    public abstract int a(float f, float f2);

    public final void b() {
        w44 w44Var = this.h;
        o49 selectionBounds = w44Var.getSelectionBounds();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.leftMargin = (int) selectionBounds.a;
        layoutParams.topMargin = (int) selectionBounds.b;
        layoutParams.width = (int) selectionBounds.c;
        layoutParams.height = (int) selectionBounds.d;
        setLayoutParams(layoutParams);
        setRotation(w44Var.getRotation());
    }

    public float getShowAlpha() {
        return this.e.d(this.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (r0 != 3) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0059  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        double atan2;
        u44 u44Var;
        int actionMasked = motionEvent.getActionMasked();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        w44 w44Var = this.h;
        u44 u44Var2 = w44Var.H;
        r44 r44Var = w44Var.K;
        float[] fArr = w44Var.h0;
        float[] fArr2 = w44Var.g0;
        u44Var2.u(rawX, rawY, fArr2);
        boolean z3 = motionEvent.getPointerCount() > 1 && this.d == 3;
        if (z3) {
            if (Build.VERSION.SDK_INT < 29) {
                z = false;
                float[] fArr3 = w44Var.i0;
                if (z) {
                    fArr3[0] = fArr2[0];
                    fArr3[1] = fArr2[1];
                } else {
                    fArr3[0] = (fArr2[0] + fArr[0]) / 2.0f;
                    fArr3[1] = (fArr2[1] + fArr[1]) / 2.0f;
                }
                if (w44Var.e0 != z) {
                    w44Var.b = fArr2[0];
                    w44Var.c = fArr2[1];
                    w44Var.d = fArr[0];
                    w44Var.e = fArr[1];
                    w44Var.f = fArr3[0];
                    w44Var.h = fArr3[1];
                    this.f = !z;
                    invalidate();
                }
                w44Var.e0 = z;
                float[] fArr4 = w44Var.i0;
                float f = fArr4[0];
                float f2 = fArr4[1];
                if (actionMasked == 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            int i = this.d;
                            if (i == 3) {
                                float[] fArr5 = w44Var.g0;
                                float f3 = fArr5[0];
                                float f4 = fArr5[1];
                                float[] fArr6 = w44Var.h0;
                                z2 = w44Var.c(f3, f4, fArr6[0], fArr6[1], z);
                            } else if (i != 0) {
                                float f5 = f - w44Var.b;
                                float f6 = f2 - w44Var.c;
                                if (w44Var.w || Math.abs(f5) > gm.L(2.0f) || Math.abs(f6) > gm.L(2.0f)) {
                                    if (!w44Var.w && (u44Var = w44Var.H) != null) {
                                        u44Var.x();
                                    }
                                    w44Var.w = true;
                                    gm.r(r44Var);
                                    int[] v = w44Var.H.v(w44Var);
                                    float a = oqe.a(v[0], v[1], w44Var.b, w44Var.c);
                                    float a2 = oqe.a(v[0], v[1], f, f2);
                                    float f7 = 0.0f;
                                    if (a > 0.0f) {
                                        w44Var.j(a2 / a);
                                    }
                                    int i2 = this.d;
                                    if (i2 == 1) {
                                        atan2 = Math.atan2(v[1] - f2, v[0] - f);
                                    } else {
                                        if (i2 == 2) {
                                            atan2 = Math.atan2(f2 - v[1], f - v[0]);
                                        }
                                        w44Var.f((float) Math.toDegrees(f7));
                                        w44Var.b = f;
                                        w44Var.c = f2;
                                    }
                                    f7 = (float) atan2;
                                    w44Var.f((float) Math.toDegrees(f7));
                                    w44Var.b = f;
                                    w44Var.c = f2;
                                }
                                z2 = true;
                            }
                        }
                        z2 = false;
                    }
                    w44Var.d(actionMasked == 3);
                    this.d = 0;
                    this.f = true;
                    invalidate();
                    z2 = true;
                } else {
                    w44Var.f0 = false;
                    int a3 = a(motionEvent.getX(), motionEvent.getY());
                    if (a3 != 0) {
                        this.d = a3;
                        w44Var.b = fArr2[0];
                        w44Var.c = fArr2[1];
                        w44Var.f = f;
                        w44Var.h = f2;
                        w44Var.r = false;
                        w44Var.s = true;
                        if (getParent() instanceof p44) {
                            ((p44) getParent()).invalidate();
                        }
                        if (a3 == 3 && (w44Var instanceof g29)) {
                            gm.d3(r44Var, ViewConfiguration.getLongPressTimeout());
                        }
                        z2 = true;
                    }
                    z2 = false;
                }
                w44Var.f0 = z;
                return !super.onTouchEvent(motionEvent) || z2;
            }
            w44Var.H.u(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr);
        }
        z = z3;
        float[] fArr32 = w44Var.i0;
        if (z) {
        }
        if (w44Var.e0 != z) {
        }
        w44Var.e0 = z;
        float[] fArr42 = w44Var.i0;
        float f8 = fArr42[0];
        float f22 = fArr42[1];
        if (actionMasked == 0) {
        }
        w44Var.f0 = z;
        if (super.onTouchEvent(motionEvent)) {
        }
    }
}
