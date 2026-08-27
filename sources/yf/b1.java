package yf;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.ViewConfiguration;
import h7.l8;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.q5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.zb1;
import rh.o2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class b1 extends TextureView {
    public a1 a;
    public s1 b;
    public final p0 c;
    public z0 d;
    public final d0 e;
    public final o1 f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float v;
    public int w;
    public m x;
    public boolean y;

    public b1(Context context, p0 p0Var, Bitmap bitmap, Bitmap bitmap2, z9 z9Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = p0Var;
        p0Var.f = this;
        setSurfaceTextureListener(new x0(this, z9Var));
        this.e = new d0(this);
        v0 v0Var = new v0(this, 0);
        o1 o1Var = new o1();
        Paint paint = new Paint(1);
        o1Var.c = paint;
        Paint paint2 = new Paint(1);
        o1Var.d = paint2;
        Paint paint3 = new Paint(1);
        o1Var.e = paint3;
        Paint paint4 = new Paint(1);
        o1Var.f = paint4;
        Paint paint5 = new Paint(1);
        o1Var.g = paint5;
        o1Var.m = new ArrayList();
        o1Var.n = new ArrayList();
        o1Var.p = new float[2];
        o1Var.a = this;
        o1Var.b = v0Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, TLObject.FLAG_30);
        this.f = o1Var;
        p0Var.a = new n1.d(this, 25);
    }

    public final void a() {
        v0 v0Var = new v0(this, 2);
        d0 d0Var = this.e;
        d0Var.g = new t0(d0Var.a.getPainting().g.a, 0.0d, 1.0d);
        d0Var.l = true;
        d0Var.a(new d(), false, v0Var);
    }

    public final void b() {
        b1 b1Var;
        o1 o1Var = this.f;
        if (o1Var == null || (b1Var = o1Var.a) == null || b1Var.getPainting() == null || o1Var.h == null) {
            return;
        }
        p0 painting = b1Var.getPainting();
        painting.f.f(new m0(painting, 0));
        o1Var.m.clear();
        o1Var.n.clear();
        o1Var.h = null;
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.x instanceof l) {
            this.f.e();
        }
        z0 z0Var = this.d;
        if (z0Var == null || !z0Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            z0Var.postRunnable(new q5(z0Var, z10, z11, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.x instanceof l) {
            o1 o1Var = this.f;
            Paint paint = o1Var.c;
            ArrayList arrayList = o1Var.m;
            b1 b1Var = o1Var.a;
            if (b1Var == null || b1Var.getPainting() == null) {
                return;
            }
            tu0 tu0Var = b1Var.getPainting().g;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                n1 n1Var = (n1) arrayList.get(i10);
                if (n1Var.c && !n1Var.b) {
                    o1Var.b(canvas, tu0Var, n1Var);
                }
            }
            e1 e1Var = o1Var.h;
            if (e1Var != null && e1Var.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r1.h) / 3.141592653589793d) * 180.0d), (o1Var.h.b / tu0Var.a) * canvas.getWidth(), (o1Var.h.c / tu0Var.b) * canvas.getHeight());
            }
            e1 e1Var2 = o1Var.h;
            if (e1Var2 == null || e1Var2.a.o() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (o1Var.h.b / tu0Var.a), canvas.getHeight() * (o1Var.h.c / tu0Var.b), canvas.getWidth() * (o1Var.h.i / tu0Var.a), canvas.getHeight() * (o1Var.h.j / tu0Var.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (o1Var.h.d / tu0Var.a), canvas2.getHeight() * (o1Var.h.e / tu0Var.b), canvas2.getWidth() * (o1Var.h.i / tu0Var.a), canvas2.getHeight() * (o1Var.h.j / tu0Var.b), paint);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                n1 n1Var2 = (n1) arrayList.get(i11);
                if (n1Var2.c && n1Var2.b) {
                    o1Var.b(canvas2, tu0Var, n1Var2);
                }
            }
            e1 e1Var3 = o1Var.h;
            if (e1Var3 == null || e1Var3.h == 0.0f) {
                return;
            }
            canvas2.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x025e, code lost:
    
        if (((r7 - java.lang.Math.min(r2.d, r2.e)) - (r0.h.f / 2.0f)) < org.telegram.messenger.AndroidUtilities.dp(30.0f)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0226, code lost:
    
        if (r5 < org.telegram.messenger.AndroidUtilities.dp(r12)) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:307:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021b  */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MotionEvent motionEvent) {
        z0 z0Var;
        boolean z10;
        float f10;
        boolean z11;
        ?? r42;
        int i10;
        float f11;
        ?? r72;
        a1 a1Var;
        int i11;
        float f12;
        float f13;
        float f14;
        float sqrt;
        char c10 = 1;
        if (motionEvent.getPointerCount() > 1 || (z0Var = this.d) == null || !z0Var.f || !z0Var.h) {
            return;
        }
        n1 n1Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        ?? r92 = 0;
        if (this.x instanceof l) {
            o1 o1Var = this.f;
            getScaleX();
            ArrayList arrayList = o1Var.n;
            ArrayList arrayList2 = o1Var.m;
            v0 v0Var = o1Var.b;
            float[] fArr = o1Var.p;
            b1 b1Var = o1Var.a;
            if (b1Var == null || b1Var.getPainting() == null || o1Var.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x8 = motionEvent.getX();
            float height = b1Var.getHeight() - motionEvent.getY();
            fArr[0] = x8;
            fArr[1] = height;
            o1Var.o.mapPoints(fArr);
            float f15 = fArr[0];
            float f16 = fArr[1];
            v0Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        o1Var.k = null;
                        return;
                    }
                    return;
                }
                n1 n1Var2 = o1Var.k;
                if (n1Var2 == null) {
                    k1 k1Var = o1Var.l;
                    if (k1Var != null) {
                        if (k1Var.b) {
                            o1Var.c(f15, f16, false);
                        }
                        float f17 = fArr[0] + o1Var.i;
                        k1 k1Var2 = o1Var.l;
                        float f18 = f17 - k1Var2.d;
                        float f19 = (fArr[1] + o1Var.j) - k1Var2.e;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            n1 n1Var3 = (n1) arrayList.get(i12);
                            n1Var3.b(n1Var3.d + f18, n1Var3.e + f19);
                        }
                    }
                } else {
                    if (n1Var2.b) {
                        o1Var.d(false);
                    }
                    o1Var.k.b(fArr[0] + o1Var.i, fArr[1] + o1Var.j);
                }
                b1Var.getPainting().k(o1Var.h);
                v0Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                n1 n1Var4 = (n1) arrayList2.get(i13);
                if (n1Var4.c) {
                    fArr[r92] = f15;
                    fArr[c10] = f16;
                    if (n1Var4.b) {
                        o1Var.c(f15, f16, r92);
                    }
                    double a2 = h7.y.a(n1Var4.d, n1Var4.e, fArr[r92], fArr[1]);
                    if (a2 < AndroidUtilities.dp(40.0f) && (n1Var == null || a2 < d)) {
                        n1Var = n1Var4;
                        d = a2;
                    }
                }
                i13++;
                c10 = 1;
                r92 = 0;
            }
            fArr[0] = f15;
            fArr[1] = f16;
            o1Var.c(f15, f16, false);
            if (n1Var == null) {
                e1 e1Var = o1Var.h;
                if (e1Var != null) {
                    if (e1Var.a.o() == 0 || o1Var.h.a.o() == 2) {
                        f12 = f16;
                        f13 = f15;
                        double sqrt2 = Math.sqrt(Math.pow(f12 - o1Var.h.c, 2.0d) + Math.pow(f13 - o1Var.h.b, 2.0d));
                        e1 e1Var2 = o1Var.h;
                    } else if (o1Var.h.a.o() == 1 || o1Var.h.a.o() == 3) {
                        e1 e1Var3 = o1Var.h;
                        float f20 = e1Var3.b;
                        float f21 = e1Var3.d;
                        float f22 = e1Var3.f / 2.0f;
                        float f23 = (f20 - f21) - f22;
                        float f24 = e1Var3.c;
                        float f25 = e1Var3.e;
                        float f26 = (f24 - f25) - f22;
                        float f27 = f20 + f21 + f22;
                        float f28 = f24 + f25 + f22;
                        if (f16 > f26 && f16 < f28) {
                            if (f15 < f23) {
                                sqrt = f23 - f15;
                            } else {
                                if (f15 > f27) {
                                    sqrt = f15 - f27;
                                }
                                sqrt = 0.0f;
                            }
                            f14 = 30.0f;
                            if (o1Var.h.a.o() == 3) {
                            }
                        } else if (f15 >= f23 || f15 <= f27) {
                            double d10 = f15 - f23;
                            f14 = 30.0f;
                            double d11 = f16 - f26;
                            double d12 = f15 - f27;
                            double d13 = f16 - f28;
                            sqrt = (float) Math.sqrt(Math.min(Math.min(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d12, 2.0d)), Math.min(Math.pow(d13, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d13, 2.0d) + Math.pow(d12, 2.0d))));
                            if (o1Var.h.a.o() == 3) {
                                e1 e1Var4 = o1Var.h;
                                float a3 = o1.a(f15, f16, e1Var4.b, e1Var4.c, e1Var4.i, e1Var4.j);
                                f13 = f15;
                                f12 = f16;
                                sqrt = Math.min(sqrt, a3);
                            } else {
                                f13 = f15;
                                f12 = f16;
                            }
                        } else {
                            if (f16 < f26) {
                                sqrt = f26 - f16;
                            } else {
                                if (f16 > f28) {
                                    sqrt = f16 - f28;
                                }
                                sqrt = 0.0f;
                            }
                            f14 = 30.0f;
                            if (o1Var.h.a.o() == 3) {
                            }
                        }
                    } else if (o1Var.h.a.o() == 4) {
                        tu0 tu0Var = b1Var.getPainting().g;
                        e1 e1Var5 = o1Var.h;
                        float a10 = o1.a(f15, f16, e1Var5.b, e1Var5.c, e1Var5.i, e1Var5.j);
                        e1 e1Var6 = o1Var.h;
                        if (Math.min(a10, o1.a(f15, f16, e1Var6.d, e1Var6.e, e1Var6.i, e1Var6.j)) - (o1Var.h.f / 2.0f) < Math.min(tu0Var.a, tu0Var.b) * 0.1f) {
                            f13 = f15;
                            f12 = f16;
                        }
                    }
                }
                o1Var.e();
                return;
            }
            f12 = f16;
            f13 = f15;
            fArr[0] = f13;
            fArr[1] = f12;
            o1Var.k = n1Var;
            if (n1Var != null) {
                if (n1Var.b) {
                    o1Var.c(f13, f12, false);
                }
                n1 n1Var5 = o1Var.k;
                o1Var.i = n1Var5.d - fArr[0];
                o1Var.j = n1Var5.e - fArr[1];
                return;
            }
            k1 k1Var3 = o1Var.l;
            if (k1Var3 != null) {
                if (k1Var3.b) {
                    o1Var.c(f13, f12, false);
                }
                k1 k1Var4 = o1Var.l;
                o1Var.i = k1Var4.d - fArr[0];
                o1Var.j = k1Var4.e - fArr[1];
                return;
            }
            return;
        }
        final d0 d0Var = this.e;
        float scaleX = getScaleX();
        if (d0Var.x != null || d0Var.r != null) {
            return;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float height2 = d0Var.a.getHeight() - motionEvent.getY();
        float[] fArr2 = d0Var.u;
        fArr2[0] = x10;
        fArr2[1] = height2;
        d0Var.t.mapPoints(fArr2);
        float currentTimeMillis = System.currentTimeMillis() - d0Var.v;
        d0Var.w = h7.n.a(d0Var.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
        if (d0Var.a.getCurrentBrush() != null && (d0Var.a.getCurrentBrush() instanceof a)) {
            d0Var.w = 1.0f - d0Var.w;
        }
        d0Var.v = System.currentTimeMillis();
        float f29 = d0Var.w;
        if (motionEvent.getToolType(motionEvent.getActionIndex()) == 2) {
            f29 = Math.max(0.1f, d0.B.getInterpolation(motionEvent.getPressure()));
            if ((motionEvent.getButtonState() & 32) == 32) {
                z10 = true;
                if (d0Var.a.getCurrentBrush() != null) {
                    f29 = (AndroidUtilities.lerp(d0Var.a.getCurrentBrush().j(), 1.0f, h7.n.a(d0Var.o / 16.0f, 0.0f, 1.0f)) * (f29 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = d0Var.u;
                double d14 = fArr3[0];
                double d15 = fArr3[1];
                double d16 = f29;
                t0 t0Var = new t0(d14, d15, d16);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (d0Var.z) {
                            d0Var.z = false;
                            return;
                        }
                        d0Var.l = false;
                        d0Var.s.c();
                        AndroidUtilities.cancelRunOnUIThread(d0Var.y);
                        p0 painting = d0Var.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!d0Var.e) {
                                a1 a1Var2 = d0Var.a.a;
                                if (a1Var2 == null || a1Var2.d()) {
                                    t0Var.d = true;
                                    q0 q0Var = new q0();
                                    Vector vector = new Vector();
                                    q0Var.b = vector;
                                    vector.add(t0Var);
                                    d0Var.b(q0Var);
                                }
                                d0Var.n = 0;
                            } else if (d0Var.n > 0) {
                                d0Var.c(d0Var.a.getCurrentBrush().j(), true);
                                if (d0Var.a.getCurrentBrush() instanceof a) {
                                    final float f30 = d0Var.k;
                                    final t0 t0Var2 = d0Var.m[d0Var.n - 1];
                                    t0 t0Var3 = d0Var.h;
                                    double d17 = t0Var3 == null ? d16 : t0Var3.c;
                                    final float currentWeight = d0Var.a.getCurrentWeight() * ((float) d17) * 12.0f;
                                    ValueAnimator valueAnimator = d0Var.r;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    final float[] fArr4 = new float[1];
                                    final boolean[] zArr = new boolean[1];
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    d0Var.r = ofFloat;
                                    final double d18 = d17;
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yf.y
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            d0 d0Var2 = d0.this;
                                            d0Var2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d19 = f30;
                                            double cos = Math.cos(d19 - 2.5918139392115793d);
                                            double sin = Math.sin(d19 - 2.748893571891069d);
                                            t0 t0Var4 = t0Var2;
                                            double d20 = t0Var4.a;
                                            double d21 = currentWeight;
                                            double d22 = cos * d21;
                                            float[] fArr5 = fArr4;
                                            double d23 = fArr5[0];
                                            double d24 = (d22 * d23) + d20;
                                            double d25 = t0Var4.b;
                                            double d26 = sin * d21;
                                            double d27 = (d23 * d26) + d25;
                                            double d28 = d18;
                                            double d29 = floatValue;
                                            d0Var2.b(new q0(new t0[]{new t0(d24, d27, d28), new t0((d22 * d29) + d20, (d26 * d29) + d25, d28, 0)}));
                                            double cos2 = Math.cos(d19 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d19 + 2.748893571891069d);
                                            double d30 = t0Var4.a;
                                            double d31 = cos2 * d21;
                                            double d32 = fArr5[0];
                                            double d33 = sin2 * d21;
                                            d0Var2.b(new q0(new t0[]{new t0((d31 * d32) + d30, (d32 * d33) + d25, d28), new t0((d31 * d29) + d30, (d33 * d29) + d25, d28, 0)}));
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0] && floatValue > 0.4f) {
                                                zArr2[0] = true;
                                                BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                                            }
                                            fArr5[0] = floatValue;
                                        }
                                    });
                                    d0Var.r.addListener(new zb1(d0Var, 11));
                                    d0Var.r.setDuration(240L);
                                    d0Var.r.setInterpolator(er.h);
                                    d0Var.r.start();
                                }
                            }
                            r72 = 0;
                            d0Var.a.getPainting().c(null, d0Var.a.getCurrentColor(), true, new z(d0Var, 0 == true ? 1 : 0));
                            d0Var.n = r72;
                            d0Var.o = r72;
                            d0Var.j = r72;
                            d0Var.b = r72;
                            d0Var.p = 0.0d;
                            d0Var.q = 0.0d;
                            a1Var = d0Var.a.a;
                            if (a1Var == null) {
                                a1Var.e();
                                return;
                            }
                            return;
                        }
                        ValueAnimator valueAnimator2 = painting.L;
                        if (valueAnimator2 != null) {
                            valueAnimator2.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        painting.L = ofFloat2;
                        int i14 = 1;
                        ofFloat2.addUpdateListener(new k0(painting, i14));
                        painting.L.addListener(new o0(painting, i14));
                        painting.L.setInterpolator(er.h);
                        painting.L.setDuration(350L);
                        painting.L.start();
                        BotWebViewVibrationEffect.IMPACT_RIGID.vibrate();
                        r72 = 0;
                        d0Var.n = r72;
                        d0Var.o = r72;
                        d0Var.j = r72;
                        d0Var.b = r72;
                        d0Var.p = 0.0d;
                        d0Var.q = 0.0d;
                        a1Var = d0Var.a.a;
                        if (a1Var == null) {
                        }
                    } else if (actionMasked2 != 2) {
                        if (actionMasked2 != 3) {
                            return;
                        }
                        if (d0Var.z) {
                            d0Var.z = false;
                            return;
                        }
                        d0Var.l = false;
                        d0Var.s.c();
                        p0 painting2 = d0Var.a.getPainting();
                        if (painting2.L != null) {
                            i11 = 1;
                        } else {
                            i11 = 1;
                            painting2.f.f(new l0(painting2, objArr2 == true ? 1 : 0, i11));
                        }
                        AndroidUtilities.cancelRunOnUIThread(d0Var.y);
                        p0 painting3 = d0Var.a.getPainting();
                        painting3.f.f(new m0(painting3, i11));
                        d0Var.n = 0;
                        d0Var.o = 0;
                        d0Var.j = false;
                        d0Var.b = false;
                        d0Var.p = 0.0d;
                        d0Var.q = 0.0d;
                        m mVar = d0Var.A;
                        if (mVar != null) {
                            d0Var.a.g(mVar);
                            d0Var.A = null;
                            return;
                        }
                        return;
                    }
                }
                if (d0Var.z) {
                    if (!d0Var.b) {
                        d0Var.b = true;
                        d0Var.e = false;
                        d0Var.c = true;
                        d0Var.g = t0Var;
                        d0Var.d = System.currentTimeMillis();
                        d0Var.m[0] = t0Var;
                        d0Var.n = 1;
                        d0Var.o = 1;
                        d0Var.j = false;
                        d0Var.f = true;
                        d0Var.l = true;
                        AndroidUtilities.runOnUIThread(d0Var.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a11 = t0Var.a(d0Var.g);
                    if (a11 < AndroidUtilities.dp(5.0f) / scaleX) {
                        return;
                    }
                    if (d0Var.l && (a11 > AndroidUtilities.dp(6.0f) / scaleX || d0Var.n > 4)) {
                        d0Var.l = false;
                        AndroidUtilities.cancelRunOnUIThread(d0Var.y);
                    }
                    if (!d0Var.e) {
                        a1 a1Var3 = d0Var.a.a;
                        if (a1Var3 != null) {
                            a1Var3.f();
                        }
                        d0Var.e = true;
                        if (z10 && (d0Var.a.getCurrentBrush() instanceof f)) {
                            d0Var.A = d0Var.a.getCurrentBrush();
                            d0Var.a.g((m) i0.a.j(1, m.a));
                        }
                    }
                    d0Var.m[d0Var.n] = t0Var;
                    if (d0Var.a.getPainting() == null || !d0Var.a.getPainting().G) {
                        f10 = a11;
                        if (System.currentTimeMillis() - d0Var.d > 3000) {
                            d0Var.s.c();
                            p0 painting4 = d0Var.a.getPainting();
                            if (painting4.L == null) {
                                painting4.f.f(new l0(painting4, objArr == true ? 1 : 0, 1));
                            }
                        } else if ((d0Var.a.getCurrentBrush() instanceof f) || (d0Var.a.getCurrentBrush() instanceof c)) {
                            j1 j1Var = d0Var.s;
                            boolean z12 = f10 > ((float) AndroidUtilities.dp(6.0f)) / scaleX;
                            synchronized (j1Var) {
                                j1Var.b.add(new g1(d14, d15));
                                z11 = j1Var.b.size() >= 8;
                            }
                            if (z11) {
                                DispatchQueue dispatchQueue = j1.m;
                                f1 f1Var = j1Var.l;
                                AtomicBoolean atomicBoolean = j1Var.k;
                                if (!j1Var.j.get()) {
                                    if (atomicBoolean.get() && !j1Var.d && z12) {
                                        dispatchQueue.cancelRunnable(f1Var);
                                        dispatchQueue.postRunnable(f1Var, 150L);
                                    }
                                    if (!atomicBoolean.get()) {
                                        r42 = 1;
                                        atomicBoolean.set(true);
                                        dispatchQueue.postRunnable(f1Var, 150L);
                                        i10 = d0Var.n + r42;
                                        d0Var.n = i10;
                                        d0Var.o += r42;
                                        if (i10 != 3) {
                                            t0[] t0VarArr = d0Var.m;
                                            t0 t0Var4 = t0VarArr[2];
                                            double d19 = t0Var4.b;
                                            t0 t0Var5 = t0VarArr[r42];
                                            float atan2 = (float) Math.atan2(d19 - t0Var5.b, t0Var4.a - t0Var5.a);
                                            if (d0Var.j) {
                                                float a12 = h7.n.a(f10 / (AndroidUtilities.dp(16.0f) / scaleX), 0.0f, 1.0f);
                                                if (a12 > 0.4f) {
                                                    double d20 = 1.0f - a12;
                                                    double d21 = d0Var.k;
                                                    double d22 = a12;
                                                    double d23 = atan2;
                                                    f11 = scaleX;
                                                    d0Var.k = (float) Math.atan2((Math.sin(d23) * d22) + (Math.sin(d21) * d20), i0.a.b(d23, d22, Math.cos(d21) * d20));
                                                    d0Var.c(d0Var.a.getCurrentBrush().j(), false);
                                                }
                                            } else {
                                                d0Var.k = atan2;
                                                d0Var.j = r42;
                                            }
                                            f11 = scaleX;
                                            d0Var.c(d0Var.a.getCurrentBrush().j(), false);
                                        } else {
                                            f11 = scaleX;
                                        }
                                        d0Var.g = t0Var;
                                        if (f10 > AndroidUtilities.dp(8.0f) / f11) {
                                            d0Var.h = t0Var;
                                        }
                                        d0Var.w = h7.n.a((currentTimeMillis / 75.0f) + d0Var.w, 0.6f, 1.0f);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        f10 = a11;
                    }
                    r42 = 1;
                    i10 = d0Var.n + r42;
                    d0Var.n = i10;
                    d0Var.o += r42;
                    if (i10 != 3) {
                    }
                    d0Var.g = t0Var;
                    if (f10 > AndroidUtilities.dp(8.0f) / f11) {
                    }
                    d0Var.w = h7.n.a((currentTimeMillis / 75.0f) + d0Var.w, 0.6f, 1.0f);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (d0Var.a.getCurrentBrush() != null) {
        }
        float[] fArr32 = d0Var.u;
        double d142 = fArr32[0];
        double d152 = fArr32[1];
        double d162 = f29;
        t0 t0Var6 = new t0(d142, d152, d162);
        if (actionMasked2 != 0) {
        }
        if (d0Var.z) {
        }
    }

    public final void f(Runnable runnable) {
        z0 z0Var = this.d;
        if (z0Var == null) {
            return;
        }
        z0Var.postRunnable(new o2(7, this, runnable));
    }

    public m getCurrentBrush() {
        return this.x;
    }

    public int getCurrentColor() {
        return this.w;
    }

    public float getCurrentWeight() {
        return this.v;
    }

    public p0 getPainting() {
        return this.c;
    }

    public s1 getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.y = true;
        if (this.d != null) {
            f(new v0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        p0 p0Var = this.c;
        float width = p0Var != null ? getWidth() / p0Var.g.a : 1.0f;
        float f10 = width > 0.0f ? width : 1.0f;
        tu0 tu0Var = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-tu0Var.a) / 2.0f, (-tu0Var.b) / 2.0f);
        if (this.x instanceof l) {
            o1 o1Var = this.f;
            o1Var.getClass();
            Matrix matrix2 = new Matrix();
            o1Var.o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.t = matrix3;
            matrix.invert(matrix3);
        }
        z0 z0Var = this.d;
        p0Var.y = l8.c(l8.b(z0Var.n, z0Var.r), l8.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.x instanceof l;
        o1 o1Var = this.f;
        if (z10) {
            o1Var.e();
        }
        this.x = mVar;
        i();
        this.c.q(this.x);
        m mVar2 = this.x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = o1Var.n;
            ArrayList arrayList2 = o1Var.m;
            b1 b1Var = o1Var.a;
            if (b1Var == null || b1Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            o1Var.h = new e1(l.p(o10));
            tu0 tu0Var = b1Var.getPainting().g;
            e1 e1Var = o1Var.h;
            float f10 = tu0Var.a;
            e1Var.b = f10 / 2.0f;
            float f11 = tu0Var.b;
            e1Var.c = f11 / 2.0f;
            float min = Math.min(f10, f11) / 5.0f;
            e1Var.e = min;
            e1Var.d = min;
            o1Var.h.f = b1Var.getCurrentWeight();
            o1Var.h.g = AndroidUtilities.dp(32.0f);
            o1Var.h.l = r0.e(UserConfig.selectedAccount).k;
            if (o1Var.h.a.o() == 4) {
                e1 e1Var2 = o1Var.h;
                float f12 = tu0Var.a / 2.0f;
                e1Var2.d = f12;
                e1Var2.b = f12;
                e1Var2.i = f12 + 1.0f;
                float f13 = tu0Var.b;
                float f14 = f13 / 3.0f;
                float f15 = 1.0f * f14;
                e1Var2.c = f15;
                float f16 = f13 / 2.0f;
                e1Var2.j = f16;
                e1Var2.e = f14 * 2.0f;
                e1Var2.k = Math.abs(f15 - f16);
                k1 k1Var = new k1(o1Var, 0);
                arrayList2.add(k1Var);
                l1 l1Var = new l1(o1Var, k1Var, 0);
                arrayList2.add(l1Var);
                arrayList.add(l1Var);
                l1 l1Var2 = new l1(o1Var, k1Var, 1);
                arrayList2.add(l1Var2);
                arrayList.add(l1Var2);
            }
            if (o1Var.h.a.o() == 0) {
                arrayList2.add(new k1(o1Var, 1));
            }
            if (o1Var.h.a.o() == 2) {
                arrayList2.add(new k1(o1Var, 2));
            }
            if (o1Var.h.a.o() == 1 || o1Var.h.a.o() == 3) {
                arrayList2.add(new m1(o1Var, o1Var.h, false, false));
                arrayList2.add(new m1(o1Var, o1Var.h, true, false));
                arrayList2.add(new m1(o1Var, o1Var.h, false, true));
                arrayList2.add(new m1(o1Var, o1Var.h, true, true));
                arrayList2.add(new k1(o1Var, 3, false));
            }
            if (o1Var.h.a.o() == 3) {
                e1 e1Var3 = o1Var.h;
                e1Var3.i = (e1Var3.d * 0.8f) + e1Var3.b;
                e1Var3.j = (e1Var3.e * 1.2f) + e1Var3.c + e1Var3.f;
                k1 k1Var2 = new k1(o1Var, 4);
                arrayList2.add(k1Var2);
                k1Var2.b = false;
                arrayList.add(k1Var2);
            }
            o1Var.l = new k1(o1Var, 5, false);
            if (o1Var.h.a.o() != 4) {
                o1Var.l.c = false;
            }
            k1 k1Var3 = o1Var.l;
            k1Var3.b = false;
            arrayList.add(k1Var3);
            arrayList2.add(o1Var.l);
            b1Var.getPainting().k(o1Var.h);
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.c.g.a;
        this.v = com.google.android.recaptcha.internal.a.x(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.x instanceof l) {
            o1 o1Var = this.f;
            b1 b1Var = o1Var.a;
            e1 e1Var = o1Var.h;
            if (e1Var == null || e1Var.f == b1Var.getCurrentWeight()) {
                return;
            }
            o1Var.h.f = b1Var.getCurrentWeight();
            b1Var.getPainting().k(o1Var.h);
        }
    }

    public void setColor(int i10) {
        this.w = i10;
        if (this.x instanceof l) {
            o1 o1Var = this.f;
            if (o1Var.h != null) {
                o1Var.a.getPainting().k(o1Var.h);
            }
        }
    }

    public void setDelegate(a1 a1Var) {
        this.a = a1Var;
    }

    public void setUndoStore(s1 s1Var) {
        this.b = s1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
