package tg;

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
import b8.be;
import ei.a6;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.p2;
import org.telegram.messenger.q5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.xq;
import org.telegram.ui.hc1;
import org.telegram.ui.i81;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class u0 extends TextureView {
    public boolean E;
    public t0 a;
    public k1 b;
    public final i0 c;
    public s0 d;
    public final w e;
    public final g1 f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float w;
    public int x;
    public h y;

    public u0(Context context, i0 i0Var, Bitmap bitmap, Bitmap bitmap2, x9 x9Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = i0Var;
        i0Var.f = this;
        setSurfaceTextureListener(new q0(this, x9Var));
        this.e = new w(this);
        o0 o0Var = new o0(this, 0);
        g1 g1Var = new g1();
        Paint paint = new Paint(1);
        g1Var.c = paint;
        Paint paint2 = new Paint(1);
        g1Var.d = paint2;
        Paint paint3 = new Paint(1);
        g1Var.e = paint3;
        Paint paint4 = new Paint(1);
        g1Var.f = paint4;
        Paint paint5 = new Paint(1);
        g1Var.g = paint5;
        g1Var.m = new ArrayList();
        g1Var.n = new ArrayList();
        g1Var.p = new float[2];
        g1Var.a = this;
        g1Var.b = o0Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, TLObject.FLAG_30);
        this.f = g1Var;
        i0Var.a = new nh(this, 20);
    }

    public final void a() {
        o0 o0Var = new o0(this, 2);
        w wVar = this.e;
        wVar.g = new m0(wVar.a.getPainting().g.a, 0.0d, 1.0d);
        wVar.l = true;
        wVar.a(new d(), false, o0Var);
    }

    public final void b() {
        u0 u0Var;
        g1 g1Var = this.f;
        if (g1Var == null || (u0Var = g1Var.a) == null || u0Var.getPainting() == null || g1Var.h == null) {
            return;
        }
        i0 painting = u0Var.getPainting();
        painting.f.f(new f0(painting, 0));
        g1Var.m.clear();
        g1Var.n.clear();
        g1Var.h = null;
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.y instanceof g) {
            this.f.e();
        }
        s0 s0Var = this.d;
        if (s0Var == null || !s0Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            s0Var.postRunnable(new a6(s0Var, z10, z11, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.y instanceof g) {
            g1 g1Var = this.f;
            Paint paint = g1Var.c;
            ArrayList arrayList = g1Var.m;
            u0 u0Var = g1Var.a;
            if (u0Var == null || u0Var.getPainting() == null) {
                return;
            }
            lt0 lt0Var = u0Var.getPainting().g;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                f1 f1Var = (f1) arrayList.get(i3);
                if (f1Var.c && !f1Var.b) {
                    g1Var.b(canvas, lt0Var, f1Var);
                }
            }
            x0 x0Var = g1Var.h;
            if (x0Var != null && x0Var.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r1.h) / 3.141592653589793d) * 180.0d), (g1Var.h.b / lt0Var.a) * canvas.getWidth(), (g1Var.h.c / lt0Var.b) * canvas.getHeight());
            }
            x0 x0Var2 = g1Var.h;
            if (x0Var2 == null || x0Var2.a.o() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (g1Var.h.b / lt0Var.a), canvas.getHeight() * (g1Var.h.c / lt0Var.b), canvas.getWidth() * (g1Var.h.i / lt0Var.a), canvas.getHeight() * (g1Var.h.j / lt0Var.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (g1Var.h.d / lt0Var.a), canvas2.getHeight() * (g1Var.h.e / lt0Var.b), canvas2.getWidth() * (g1Var.h.i / lt0Var.a), canvas2.getHeight() * (g1Var.h.j / lt0Var.b), paint);
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                f1 f1Var2 = (f1) arrayList.get(i10);
                if (f1Var2.c && f1Var2.b) {
                    g1Var.b(canvas2, lt0Var, f1Var2);
                }
            }
            x0 x0Var3 = g1Var.h;
            if (x0Var3 == null || x0Var3.h == 0.0f) {
                return;
            }
            canvas2.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0262, code lost:
    
        if (((r7 - java.lang.Math.min(r2.d, r2.e)) - (r0.h.f / 2.0f)) < org.telegram.messenger.g0.L(30.0f)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x022a, code lost:
    
        if (r5 < org.telegram.messenger.g0.L(r12)) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:307:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021f  */
    /* JADX WARN: Type inference failed for: r0v10, types: [tg.g1] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v5 */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MotionEvent motionEvent) {
        s0 s0Var;
        boolean z10;
        float f10;
        boolean z11;
        ?? r42;
        int i3;
        float f11;
        ?? r72;
        t0 t0Var;
        int i10;
        float f12;
        float f13;
        float f14;
        float sqrt;
        int i11;
        ?? r33;
        int i12 = 1;
        if (motionEvent.getPointerCount() > 1 || (s0Var = this.d) == null || !s0Var.f || !s0Var.h) {
            return;
        }
        f1 f1Var = null;
        ?? r62 = 0;
        ?? r63 = 0;
        ?? r9 = 0;
        if (this.y instanceof g) {
            ?? r02 = this.f;
            getScaleX();
            ArrayList arrayList = r02.n;
            ArrayList arrayList2 = r02.m;
            o0 o0Var = r02.b;
            float[] fArr = r02.p;
            u0 u0Var = r02.a;
            if (u0Var == null || u0Var.getPainting() == null || r02.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX();
            float height = u0Var.getHeight() - motionEvent.getY();
            fArr[0] = x10;
            fArr[1] = height;
            r02.o.mapPoints(fArr);
            float f15 = fArr[0];
            float f16 = fArr[1];
            o0Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        r02.k = null;
                        return;
                    }
                    return;
                }
                f1 f1Var2 = r02.k;
                if (f1Var2 == null) {
                    c1 c1Var = r02.l;
                    if (c1Var != null) {
                        if (c1Var.b) {
                            r02.c(f15, f16, false);
                        }
                        float f17 = fArr[0] + r02.i;
                        c1 c1Var2 = r02.l;
                        float f18 = f17 - c1Var2.d;
                        float f19 = (fArr[1] + r02.j) - c1Var2.e;
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            f1 f1Var3 = (f1) arrayList.get(i13);
                            f1Var3.b(f1Var3.d + f18, f1Var3.e + f19);
                        }
                    }
                } else {
                    if (f1Var2.b) {
                        r02.d(false);
                    }
                    r02.k.b(fArr[0] + r02.i, fArr[1] + r02.j);
                }
                u0Var.getPainting().k(r02.h);
                o0Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                f1 f1Var4 = (f1) arrayList2.get(i14);
                if (f1Var4.c) {
                    fArr[r9] = f15;
                    fArr[i12] = f16;
                    if (f1Var4.b) {
                        r02.c(f15, f16, r9);
                    }
                    i11 = i12;
                    double a10 = a7.h.a(f1Var4.d, f1Var4.e, fArr[r9], fArr[i11]);
                    int L = org.telegram.messenger.g0.L(40.0f);
                    r33 = r9 == true ? 1 : 0;
                    if (a10 < L && (f1Var == null || a10 < d)) {
                        f1Var = f1Var4;
                        d = a10;
                    }
                } else {
                    i11 = i12;
                    r33 = r9;
                }
                i14++;
                r9 = r33;
                i12 = i11;
            }
            int i15 = i12;
            boolean z12 = r9;
            fArr[z12 ? 1 : 0] = f15;
            fArr[i15] = f16;
            r02.c(f15, f16, z12);
            if (f1Var == null) {
                x0 x0Var = r02.h;
                if (x0Var != null) {
                    if (x0Var.a.o() == 0 || r02.h.a.o() == 2) {
                        f12 = f16;
                        f13 = f15;
                        double sqrt2 = Math.sqrt(Math.pow(f12 - r02.h.c, 2.0d) + Math.pow(f13 - r02.h.b, 2.0d));
                        x0 x0Var2 = r02.h;
                    } else if (r02.h.a.o() == i15 || r02.h.a.o() == 3) {
                        x0 x0Var3 = r02.h;
                        float f20 = x0Var3.b;
                        float f21 = x0Var3.d;
                        float f22 = x0Var3.f / 2.0f;
                        float f23 = (f20 - f21) - f22;
                        float f24 = x0Var3.c;
                        float f25 = x0Var3.e;
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
                            if (r02.h.a.o() == 3) {
                            }
                        } else if (f15 >= f23 || f15 <= f27) {
                            double d10 = f15 - f23;
                            f14 = 30.0f;
                            double d11 = f16 - f26;
                            double d12 = f15 - f27;
                            double d13 = f16 - f28;
                            sqrt = (float) Math.sqrt(Math.min(Math.min(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d12, 2.0d)), Math.min(Math.pow(d13, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d13, 2.0d) + Math.pow(d12, 2.0d))));
                            if (r02.h.a.o() == 3) {
                                x0 x0Var4 = r02.h;
                                float a11 = g1.a(f15, f16, x0Var4.b, x0Var4.c, x0Var4.i, x0Var4.j);
                                f13 = f15;
                                f12 = f16;
                                sqrt = Math.min(sqrt, a11);
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
                            if (r02.h.a.o() == 3) {
                            }
                        }
                    } else if (r02.h.a.o() == 4) {
                        lt0 lt0Var = u0Var.getPainting().g;
                        x0 x0Var5 = r02.h;
                        float a12 = g1.a(f15, f16, x0Var5.b, x0Var5.c, x0Var5.i, x0Var5.j);
                        x0 x0Var6 = r02.h;
                        if (Math.min(a12, g1.a(f15, f16, x0Var6.d, x0Var6.e, x0Var6.i, x0Var6.j)) - (r02.h.f / 2.0f) < Math.min(lt0Var.a, lt0Var.b) * 0.1f) {
                            f13 = f15;
                            f12 = f16;
                        }
                    }
                }
                r02.e();
                return;
            }
            f12 = f16;
            f13 = f15;
            fArr[0] = f13;
            fArr[1] = f12;
            r02.k = f1Var;
            if (f1Var != null) {
                if (f1Var.b) {
                    r02.c(f13, f12, false);
                }
                f1 f1Var5 = r02.k;
                r02.i = f1Var5.d - fArr[0];
                r02.j = f1Var5.e - fArr[1];
                return;
            }
            c1 c1Var3 = r02.l;
            if (c1Var3 != null) {
                if (c1Var3.b) {
                    r02.c(f13, f12, false);
                }
                c1 c1Var4 = r02.l;
                r02.i = c1Var4.d - fArr[0];
                r02.j = c1Var4.e - fArr[1];
                return;
            }
            return;
        }
        final w wVar = this.e;
        float scaleX = getScaleX();
        if (wVar.x != null || wVar.r != null) {
            return;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        float x11 = motionEvent.getX();
        float height2 = wVar.a.getHeight() - motionEvent.getY();
        float[] fArr2 = wVar.u;
        fArr2[0] = x11;
        fArr2[1] = height2;
        wVar.t.mapPoints(fArr2);
        float currentTimeMillis = System.currentTimeMillis() - wVar.v;
        wVar.w = be.a(wVar.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
        if (wVar.a.getCurrentBrush() != null && (wVar.a.getCurrentBrush() instanceof a)) {
            wVar.w = 1.0f - wVar.w;
        }
        wVar.v = System.currentTimeMillis();
        float f29 = wVar.w;
        if (motionEvent.getToolType(motionEvent.getActionIndex()) == 2) {
            f29 = Math.max(0.1f, w.B.getInterpolation(motionEvent.getPressure()));
            if ((motionEvent.getButtonState() & 32) == 32) {
                z10 = true;
                if (wVar.a.getCurrentBrush() != null) {
                    f29 = (org.telegram.messenger.g0.T1(wVar.a.getCurrentBrush().j(), 1.0f, be.a(wVar.o / 16.0f, 0.0f, 1.0f)) * (f29 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = wVar.u;
                double d14 = fArr3[0];
                double d15 = fArr3[1];
                double d16 = f29;
                m0 m0Var = new m0(d14, d15, d16);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (wVar.z) {
                            wVar.z = false;
                            return;
                        }
                        wVar.l = false;
                        wVar.s.c();
                        org.telegram.messenger.g0.r(wVar.y);
                        i0 painting = wVar.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!wVar.e) {
                                t0 t0Var2 = wVar.a.a;
                                if (t0Var2 == null || t0Var2.q()) {
                                    m0Var.d = true;
                                    j0 j0Var = new j0();
                                    Vector vector = new Vector();
                                    j0Var.b = vector;
                                    vector.add(m0Var);
                                    wVar.b(j0Var);
                                }
                                wVar.n = 0;
                            } else if (wVar.n > 0) {
                                wVar.c(true, wVar.a.getCurrentBrush().j());
                                if (wVar.a.getCurrentBrush() instanceof a) {
                                    final float f30 = wVar.k;
                                    final m0 m0Var2 = wVar.m[wVar.n - 1];
                                    m0 m0Var3 = wVar.h;
                                    double d17 = m0Var3 == null ? d16 : m0Var3.c;
                                    final float currentWeight = wVar.a.getCurrentWeight() * ((float) d17) * 12.0f;
                                    ValueAnimator valueAnimator = wVar.r;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    final float[] fArr4 = new float[1];
                                    final boolean[] zArr = new boolean[1];
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    wVar.r = ofFloat;
                                    final double d18 = d17;
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tg.r
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            w wVar2 = w.this;
                                            wVar2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d19 = f30;
                                            double cos = Math.cos(d19 - 2.5918139392115793d);
                                            double sin = Math.sin(d19 - 2.748893571891069d);
                                            m0 m0Var4 = m0Var2;
                                            double d20 = m0Var4.a;
                                            double d21 = currentWeight;
                                            double d22 = cos * d21;
                                            float[] fArr5 = fArr4;
                                            double d23 = fArr5[0];
                                            double d24 = (d22 * d23) + d20;
                                            double d25 = m0Var4.b;
                                            double d26 = sin * d21;
                                            double d27 = (d23 * d26) + d25;
                                            double d28 = d18;
                                            double d29 = floatValue;
                                            wVar2.b(new j0(new m0[]{new m0(d24, d27, d28), new m0((d22 * d29) + d20, (d26 * d29) + d25, d28, 0)}));
                                            double cos2 = Math.cos(d19 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d19 + 2.748893571891069d);
                                            double d30 = m0Var4.a;
                                            double d31 = cos2 * d21;
                                            double d32 = fArr5[0];
                                            double d33 = sin2 * d21;
                                            wVar2.b(new j0(new m0[]{new m0((d31 * d32) + d30, (d32 * d33) + d25, d28), new m0((d31 * d29) + d30, (d33 * d29) + d25, d28, 0)}));
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0] && floatValue > 0.4f) {
                                                zArr2[0] = true;
                                                p2.y.a();
                                            }
                                            fArr5[0] = floatValue;
                                        }
                                    });
                                    wVar.r.addListener(new i81(wVar, 15));
                                    wVar.r.setDuration(240L);
                                    wVar.r.setInterpolator(xq.h);
                                    wVar.r.start();
                                }
                            }
                            r72 = 0;
                            wVar.a.getPainting().c(null, wVar.a.getCurrentColor(), true, new s(wVar, 0));
                            wVar.n = r72;
                            wVar.o = r72;
                            wVar.j = r72;
                            wVar.b = r72;
                            wVar.p = 0.0d;
                            wVar.q = 0.0d;
                            t0Var = wVar.a.a;
                            if (t0Var == null) {
                                t0Var.N();
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
                        int i16 = 1;
                        ofFloat2.addUpdateListener(new d0(painting, i16));
                        painting.L.addListener(new h0(painting, i16));
                        painting.L.setInterpolator(xq.h);
                        painting.L.setDuration(350L);
                        painting.L.start();
                        p2.n.a();
                        r72 = 0;
                        wVar.n = r72;
                        wVar.o = r72;
                        wVar.j = r72;
                        wVar.b = r72;
                        wVar.p = 0.0d;
                        wVar.q = 0.0d;
                        t0Var = wVar.a.a;
                        if (t0Var == null) {
                        }
                    } else if (actionMasked2 != 2) {
                        if (actionMasked2 != 3) {
                            return;
                        }
                        if (wVar.z) {
                            wVar.z = false;
                            return;
                        }
                        wVar.l = false;
                        wVar.s.c();
                        i0 painting2 = wVar.a.getPainting();
                        if (painting2.L != null) {
                            i10 = 1;
                        } else {
                            i10 = 1;
                            painting2.f.f(new e0(painting2, r63 == true ? 1 : 0, i10));
                        }
                        org.telegram.messenger.g0.r(wVar.y);
                        i0 painting3 = wVar.a.getPainting();
                        painting3.f.f(new f0(painting3, i10));
                        wVar.n = 0;
                        wVar.o = 0;
                        wVar.j = false;
                        wVar.b = false;
                        wVar.p = 0.0d;
                        wVar.q = 0.0d;
                        h hVar = wVar.A;
                        if (hVar != null) {
                            wVar.a.g(hVar);
                            wVar.A = null;
                            return;
                        }
                        return;
                    }
                }
                if (wVar.z) {
                    if (!wVar.b) {
                        wVar.b = true;
                        wVar.e = false;
                        wVar.c = true;
                        wVar.g = m0Var;
                        wVar.d = System.currentTimeMillis();
                        wVar.m[0] = m0Var;
                        wVar.n = 1;
                        wVar.o = 1;
                        wVar.j = false;
                        wVar.f = true;
                        wVar.l = true;
                        org.telegram.messenger.g0.i3(wVar.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a13 = m0Var.a(wVar.g);
                    if (a13 < org.telegram.messenger.g0.L(5.0f) / scaleX) {
                        return;
                    }
                    if (wVar.l && (a13 > org.telegram.messenger.g0.L(6.0f) / scaleX || wVar.n > 4)) {
                        wVar.l = false;
                        org.telegram.messenger.g0.r(wVar.y);
                    }
                    if (!wVar.e) {
                        t0 t0Var3 = wVar.a.a;
                        if (t0Var3 != null) {
                            t0Var3.Z();
                        }
                        wVar.e = true;
                        if (z10 && (wVar.a.getCurrentBrush() instanceof f)) {
                            wVar.A = wVar.a.getCurrentBrush();
                            wVar.a.g((h) t4.c.d(1, h.a));
                        }
                    }
                    wVar.m[wVar.n] = m0Var;
                    if (wVar.a.getPainting() == null || !wVar.a.getPainting().G) {
                        f10 = a13;
                        if (System.currentTimeMillis() - wVar.d > 3000) {
                            wVar.s.c();
                            i0 painting4 = wVar.a.getPainting();
                            if (painting4.L == null) {
                                painting4.f.f(new e0(painting4, r62 == true ? 1 : 0, 1));
                            }
                        } else if ((wVar.a.getCurrentBrush() instanceof f) || (wVar.a.getCurrentBrush() instanceof c)) {
                            b1 b1Var = wVar.s;
                            boolean z13 = f10 > ((float) org.telegram.messenger.g0.L(6.0f)) / scaleX;
                            synchronized (b1Var) {
                                b1Var.b.add(new z0(d14, d15));
                                z11 = b1Var.b.size() >= 8;
                            }
                            if (z11) {
                                q5 q5Var = b1.m;
                                y0 y0Var = b1Var.l;
                                AtomicBoolean atomicBoolean = b1Var.k;
                                if (!b1Var.j.get()) {
                                    if (atomicBoolean.get() && !b1Var.d && z13) {
                                        q5Var.cancelRunnable(y0Var);
                                        q5Var.postRunnable(y0Var, 150L);
                                    }
                                    if (!atomicBoolean.get()) {
                                        r42 = 1;
                                        atomicBoolean.set(true);
                                        q5Var.postRunnable(y0Var, 150L);
                                        i3 = wVar.n + r42;
                                        wVar.n = i3;
                                        wVar.o += r42;
                                        if (i3 != 3) {
                                            m0[] m0VarArr = wVar.m;
                                            m0 m0Var4 = m0VarArr[2];
                                            double d19 = m0Var4.b;
                                            m0 m0Var5 = m0VarArr[r42];
                                            float atan2 = (float) Math.atan2(d19 - m0Var5.b, m0Var4.a - m0Var5.a);
                                            if (wVar.j) {
                                                float a14 = be.a(f10 / (org.telegram.messenger.g0.L(16.0f) / scaleX), 0.0f, 1.0f);
                                                if (a14 > 0.4f) {
                                                    double d20 = 1.0f - a14;
                                                    double d21 = wVar.k;
                                                    double d22 = a14;
                                                    double d23 = atan2;
                                                    f11 = scaleX;
                                                    wVar.k = (float) Math.atan2((Math.sin(d23) * d22) + (Math.sin(d21) * d20), p1.c(d23, d22, Math.cos(d21) * d20));
                                                    wVar.c(false, wVar.a.getCurrentBrush().j());
                                                }
                                            } else {
                                                wVar.k = atan2;
                                                wVar.j = r42;
                                            }
                                            f11 = scaleX;
                                            wVar.c(false, wVar.a.getCurrentBrush().j());
                                        } else {
                                            f11 = scaleX;
                                        }
                                        wVar.g = m0Var;
                                        if (f10 > org.telegram.messenger.g0.L(8.0f) / f11) {
                                            wVar.h = m0Var;
                                        }
                                        wVar.w = be.a((currentTimeMillis / 75.0f) + wVar.w, 0.6f, 1.0f);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        f10 = a13;
                    }
                    r42 = 1;
                    i3 = wVar.n + r42;
                    wVar.n = i3;
                    wVar.o += r42;
                    if (i3 != 3) {
                    }
                    wVar.g = m0Var;
                    if (f10 > org.telegram.messenger.g0.L(8.0f) / f11) {
                    }
                    wVar.w = be.a((currentTimeMillis / 75.0f) + wVar.w, 0.6f, 1.0f);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (wVar.a.getCurrentBrush() != null) {
        }
        float[] fArr32 = wVar.u;
        double d142 = fArr32[0];
        double d152 = fArr32[1];
        double d162 = f29;
        m0 m0Var6 = new m0(d142, d152, d162);
        if (actionMasked2 != 0) {
        }
        if (wVar.z) {
        }
    }

    public final void f(Runnable runnable) {
        s0 s0Var = this.d;
        if (s0Var == null) {
            return;
        }
        s0Var.postRunnable(new hc1(29, this, runnable));
    }

    public h getCurrentBrush() {
        return this.y;
    }

    public int getCurrentColor() {
        return this.x;
    }

    public float getCurrentWeight() {
        return this.w;
    }

    public i0 getPainting() {
        return this.c;
    }

    public k1 getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.E = true;
        if (this.d != null) {
            f(new o0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        i0 i0Var = this.c;
        float width = i0Var != null ? getWidth() / i0Var.g.a : 1.0f;
        float f10 = width > 0.0f ? width : 1.0f;
        lt0 lt0Var = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-lt0Var.a) / 2.0f, (-lt0Var.b) / 2.0f);
        if (this.y instanceof g) {
            g1 g1Var = this.f;
            g1Var.getClass();
            Matrix matrix2 = new Matrix();
            g1Var.o = matrix2;
            matrix.invert(matrix2);
        } else {
            w wVar = this.e;
            wVar.getClass();
            Matrix matrix3 = new Matrix();
            wVar.t = matrix3;
            matrix.invert(matrix3);
        }
        s0 s0Var = this.d;
        i0Var.y = x7.c0.c(x7.c0.b(s0Var.n, s0Var.r), x7.c0.a(matrix));
    }

    public void setBrush(h hVar) {
        boolean z10 = this.y instanceof g;
        g1 g1Var = this.f;
        if (z10) {
            g1Var.e();
        }
        this.y = hVar;
        i();
        this.c.q(this.y);
        h hVar2 = this.y;
        if (hVar2 instanceof g) {
            int o10 = ((g) hVar2).o();
            ArrayList arrayList = g1Var.n;
            ArrayList arrayList2 = g1Var.m;
            u0 u0Var = g1Var.a;
            if (u0Var == null || u0Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            g1Var.h = new x0(g.p(o10));
            lt0 lt0Var = u0Var.getPainting().g;
            x0 x0Var = g1Var.h;
            float f10 = lt0Var.a;
            x0Var.b = f10 / 2.0f;
            float f11 = lt0Var.b;
            x0Var.c = f11 / 2.0f;
            float min = Math.min(f10, f11) / 5.0f;
            x0Var.e = min;
            x0Var.d = min;
            g1Var.h.f = u0Var.getCurrentWeight();
            g1Var.h.g = org.telegram.messenger.g0.L(32.0f);
            g1Var.h.l = k0.e(h10.t0).k;
            if (g1Var.h.a.o() == 4) {
                x0 x0Var2 = g1Var.h;
                float f12 = lt0Var.a / 2.0f;
                x0Var2.d = f12;
                x0Var2.b = f12;
                x0Var2.i = f12 + 1.0f;
                float f13 = lt0Var.b;
                float f14 = f13 / 3.0f;
                float f15 = 1.0f * f14;
                x0Var2.c = f15;
                float f16 = f13 / 2.0f;
                x0Var2.j = f16;
                x0Var2.e = f14 * 2.0f;
                x0Var2.k = Math.abs(f15 - f16);
                c1 c1Var = new c1(g1Var, 0);
                arrayList2.add(c1Var);
                d1 d1Var = new d1(g1Var, c1Var, 0);
                arrayList2.add(d1Var);
                arrayList.add(d1Var);
                d1 d1Var2 = new d1(g1Var, c1Var, 1);
                arrayList2.add(d1Var2);
                arrayList.add(d1Var2);
            }
            if (g1Var.h.a.o() == 0) {
                arrayList2.add(new c1(g1Var, 1));
            }
            if (g1Var.h.a.o() == 2) {
                arrayList2.add(new c1(g1Var, 2));
            }
            if (g1Var.h.a.o() == 1 || g1Var.h.a.o() == 3) {
                arrayList2.add(new e1(g1Var, g1Var.h, false, false));
                arrayList2.add(new e1(g1Var, g1Var.h, true, false));
                arrayList2.add(new e1(g1Var, g1Var.h, false, true));
                arrayList2.add(new e1(g1Var, g1Var.h, true, true));
                arrayList2.add(new c1(g1Var, 3, false));
            }
            if (g1Var.h.a.o() == 3) {
                x0 x0Var3 = g1Var.h;
                x0Var3.i = (x0Var3.d * 0.8f) + x0Var3.b;
                x0Var3.j = (x0Var3.e * 1.2f) + x0Var3.c + x0Var3.f;
                c1 c1Var2 = new c1(g1Var, 4);
                arrayList2.add(c1Var2);
                c1Var2.b = false;
                arrayList.add(c1Var2);
            }
            g1Var.l = new c1(g1Var, 5, false);
            if (g1Var.h.a.o() != 4) {
                g1Var.l.c = false;
            }
            c1 c1Var3 = g1Var.l;
            c1Var3.b = false;
            arrayList.add(c1Var3);
            arrayList2.add(g1Var.l);
            u0Var.getPainting().k(g1Var.h);
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.c.g.a;
        this.w = com.google.android.recaptcha.internal.a.v(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.y instanceof g) {
            g1 g1Var = this.f;
            u0 u0Var = g1Var.a;
            x0 x0Var = g1Var.h;
            if (x0Var == null || x0Var.f == u0Var.getCurrentWeight()) {
                return;
            }
            g1Var.h.f = u0Var.getCurrentWeight();
            u0Var.getPainting().k(g1Var.h);
        }
    }

    public void setColor(int i3) {
        this.x = i3;
        if (this.y instanceof g) {
            g1 g1Var = this.f;
            if (g1Var.h != null) {
                g1Var.a.getPainting().k(g1Var.h);
            }
        }
    }

    public void setDelegate(t0 t0Var) {
        this.a = t0Var;
    }

    public void setUndoStore(k1 k1Var) {
        this.b = k1Var;
    }

    public void g(h hVar) {
    }

    public void setQueue(q5 q5Var) {
    }
}
