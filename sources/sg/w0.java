package sg;

import a8.r9;
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
import c8.dc;
import c8.j9;
import di.z5;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a8;
import org.telegram.messenger.p10;
import org.telegram.messenger.p2;
import org.telegram.messenger.q5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y9;
import org.telegram.ui.r81;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class w0 extends TextureView {
    public boolean D;
    public v0 a;
    public m1 b;
    public final j0 c;
    public u0 d;
    public final w e;
    public final i1 f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float w;
    public int x;
    public h y;

    public w0(Context context, j0 j0Var, Bitmap bitmap, Bitmap bitmap2, y9 y9Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = j0Var;
        j0Var.f = this;
        setSurfaceTextureListener(new r0(this, y9Var));
        this.e = new w(this);
        p0 p0Var = new p0(this, 0);
        i1 i1Var = new i1();
        Paint paint = new Paint(1);
        i1Var.c = paint;
        Paint paint2 = new Paint(1);
        i1Var.d = paint2;
        Paint paint3 = new Paint(1);
        i1Var.e = paint3;
        Paint paint4 = new Paint(1);
        i1Var.f = paint4;
        Paint paint5 = new Paint(1);
        i1Var.g = paint5;
        i1Var.m = new ArrayList();
        i1Var.n = new ArrayList();
        i1Var.p = new float[2];
        i1Var.a = this;
        i1Var.b = p0Var;
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
        this.f = i1Var;
        j0Var.a = new uy(this, 17);
    }

    public final void a() {
        p0 p0Var = new p0(this, 2);
        w wVar = this.e;
        wVar.g = new n0(wVar.a.getPainting().g.a, 0.0d, 1.0d);
        wVar.l = true;
        wVar.a(new d(), false, p0Var);
    }

    public final void b() {
        w0 w0Var;
        i1 i1Var = this.f;
        if (i1Var == null || (w0Var = i1Var.a) == null || w0Var.getPainting() == null || i1Var.h == null) {
            return;
        }
        j0 painting = w0Var.getPainting();
        painting.f.f(new f0(painting, 0));
        i1Var.m.clear();
        i1Var.n.clear();
        i1Var.h = null;
    }

    public final Bitmap c(boolean z9, boolean z10) {
        if (this.y instanceof g) {
            this.f.e();
        }
        u0 u0Var = this.d;
        if (u0Var == null || !u0Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            u0Var.postRunnable(new z5(u0Var, z9, z10, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.y instanceof g) {
            i1 i1Var = this.f;
            Paint paint = i1Var.c;
            ArrayList arrayList = i1Var.m;
            w0 w0Var = i1Var.a;
            if (w0Var == null || w0Var.getPainting() == null) {
                return;
            }
            mt0 mt0Var = w0Var.getPainting().g;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                h1 h1Var = (h1) arrayList.get(i7);
                if (h1Var.c && !h1Var.b) {
                    i1Var.b(canvas, mt0Var, h1Var);
                }
            }
            z0 z0Var = i1Var.h;
            if (z0Var != null && z0Var.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r1.h) / 3.141592653589793d) * 180.0d), (i1Var.h.b / mt0Var.a) * canvas.getWidth(), (i1Var.h.c / mt0Var.b) * canvas.getHeight());
            }
            z0 z0Var2 = i1Var.h;
            if (z0Var2 == null || z0Var2.a.o() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (i1Var.h.b / mt0Var.a), canvas.getHeight() * (i1Var.h.c / mt0Var.b), canvas.getWidth() * (i1Var.h.i / mt0Var.a), canvas.getHeight() * (i1Var.h.j / mt0Var.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (i1Var.h.d / mt0Var.a), canvas2.getHeight() * (i1Var.h.e / mt0Var.b), canvas2.getWidth() * (i1Var.h.i / mt0Var.a), canvas2.getHeight() * (i1Var.h.j / mt0Var.b), paint);
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                h1 h1Var2 = (h1) arrayList.get(i10);
                if (h1Var2.c && h1Var2.b) {
                    i1Var.b(canvas2, mt0Var, h1Var2);
                }
            }
            z0 z0Var3 = i1Var.h;
            if (z0Var3 == null || z0Var3.h == 0.0f) {
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
    /* JADX WARN: Type inference failed for: r0v10, types: [sg.i1] */
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
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MotionEvent motionEvent) {
        u0 u0Var;
        boolean z9;
        float f10;
        boolean z10;
        ?? r42;
        int i7;
        float f11;
        ?? r72;
        v0 v0Var;
        int i10;
        float f12;
        float f13;
        float f14;
        float sqrt;
        int i11;
        ?? r33;
        int i12 = 1;
        if (motionEvent.getPointerCount() > 1 || (u0Var = this.d) == null || !u0Var.f || !u0Var.h) {
            return;
        }
        h1 h1Var = null;
        ?? r62 = 0;
        ?? r63 = 0;
        ?? r92 = 0;
        if (this.y instanceof g) {
            ?? r02 = this.f;
            getScaleX();
            ArrayList arrayList = r02.n;
            ArrayList arrayList2 = r02.m;
            p0 p0Var = r02.b;
            float[] fArr = r02.p;
            w0 w0Var = r02.a;
            if (w0Var == null || w0Var.getPainting() == null || r02.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX();
            float height = w0Var.getHeight() - motionEvent.getY();
            fArr[0] = x10;
            fArr[1] = height;
            r02.o.mapPoints(fArr);
            float f15 = fArr[0];
            float f16 = fArr[1];
            p0Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        r02.k = null;
                        return;
                    }
                    return;
                }
                h1 h1Var2 = r02.k;
                if (h1Var2 == null) {
                    e1 e1Var = r02.l;
                    if (e1Var != null) {
                        if (e1Var.b) {
                            r02.c(f15, f16, false);
                        }
                        float f17 = fArr[0] + r02.i;
                        e1 e1Var2 = r02.l;
                        float f18 = f17 - e1Var2.d;
                        float f19 = (fArr[1] + r02.j) - e1Var2.e;
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            h1 h1Var3 = (h1) arrayList.get(i13);
                            h1Var3.b(h1Var3.d + f18, h1Var3.e + f19);
                        }
                    }
                } else {
                    if (h1Var2.b) {
                        r02.d(false);
                    }
                    r02.k.b(fArr[0] + r02.i, fArr[1] + r02.j);
                }
                w0Var.getPainting().k(r02.h);
                p0Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                h1 h1Var4 = (h1) arrayList2.get(i14);
                if (h1Var4.c) {
                    fArr[r92] = f15;
                    fArr[i12] = f16;
                    if (h1Var4.b) {
                        r02.c(f15, f16, r92);
                    }
                    i11 = i12;
                    double a10 = r9.a(h1Var4.d, h1Var4.e, fArr[r92], fArr[i11]);
                    int L = org.telegram.messenger.g0.L(40.0f);
                    r33 = r92 == true ? 1 : 0;
                    if (a10 < L && (h1Var == null || a10 < d)) {
                        h1Var = h1Var4;
                        d = a10;
                    }
                } else {
                    i11 = i12;
                    r33 = r92;
                }
                i14++;
                r92 = r33;
                i12 = i11;
            }
            int i15 = i12;
            boolean z11 = r92;
            fArr[z11 ? 1 : 0] = f15;
            fArr[i15] = f16;
            r02.c(f15, f16, z11);
            if (h1Var == null) {
                z0 z0Var = r02.h;
                if (z0Var != null) {
                    if (z0Var.a.o() == 0 || r02.h.a.o() == 2) {
                        f12 = f16;
                        f13 = f15;
                        double sqrt2 = Math.sqrt(Math.pow(f12 - r02.h.c, 2.0d) + Math.pow(f13 - r02.h.b, 2.0d));
                        z0 z0Var2 = r02.h;
                    } else if (r02.h.a.o() == i15 || r02.h.a.o() == 3) {
                        z0 z0Var3 = r02.h;
                        float f20 = z0Var3.b;
                        float f21 = z0Var3.d;
                        float f22 = z0Var3.f / 2.0f;
                        float f23 = (f20 - f21) - f22;
                        float f24 = z0Var3.c;
                        float f25 = z0Var3.e;
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
                            double d2 = f15 - f23;
                            f14 = 30.0f;
                            double d10 = f16 - f26;
                            double d11 = f15 - f27;
                            double d12 = f16 - f28;
                            sqrt = (float) Math.sqrt(Math.min(Math.min(Math.pow(d10, 2.0d) + Math.pow(d2, 2.0d), Math.pow(d10, 2.0d) + Math.pow(d11, 2.0d)), Math.min(Math.pow(d12, 2.0d) + Math.pow(d2, 2.0d), Math.pow(d12, 2.0d) + Math.pow(d11, 2.0d))));
                            if (r02.h.a.o() == 3) {
                                z0 z0Var4 = r02.h;
                                float a11 = i1.a(f15, f16, z0Var4.b, z0Var4.c, z0Var4.i, z0Var4.j);
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
                        mt0 mt0Var = w0Var.getPainting().g;
                        z0 z0Var5 = r02.h;
                        float a12 = i1.a(f15, f16, z0Var5.b, z0Var5.c, z0Var5.i, z0Var5.j);
                        z0 z0Var6 = r02.h;
                        if (Math.min(a12, i1.a(f15, f16, z0Var6.d, z0Var6.e, z0Var6.i, z0Var6.j)) - (r02.h.f / 2.0f) < Math.min(mt0Var.a, mt0Var.b) * 0.1f) {
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
            r02.k = h1Var;
            if (h1Var != null) {
                if (h1Var.b) {
                    r02.c(f13, f12, false);
                }
                h1 h1Var5 = r02.k;
                r02.i = h1Var5.d - fArr[0];
                r02.j = h1Var5.e - fArr[1];
                return;
            }
            e1 e1Var3 = r02.l;
            if (e1Var3 != null) {
                if (e1Var3.b) {
                    r02.c(f13, f12, false);
                }
                e1 e1Var4 = r02.l;
                r02.i = e1Var4.d - fArr[0];
                r02.j = e1Var4.e - fArr[1];
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
        wVar.w = j9.a(wVar.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
        if (wVar.a.getCurrentBrush() != null && (wVar.a.getCurrentBrush() instanceof a)) {
            wVar.w = 1.0f - wVar.w;
        }
        wVar.v = System.currentTimeMillis();
        float f29 = wVar.w;
        if (motionEvent.getToolType(motionEvent.getActionIndex()) == 2) {
            f29 = Math.max(0.1f, w.B.getInterpolation(motionEvent.getPressure()));
            if ((motionEvent.getButtonState() & 32) == 32) {
                z9 = true;
                if (wVar.a.getCurrentBrush() != null) {
                    f29 = (org.telegram.messenger.g0.T1(wVar.a.getCurrentBrush().j(), 1.0f, j9.a(wVar.o / 16.0f, 0.0f, 1.0f)) * (f29 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = wVar.u;
                double d13 = fArr3[0];
                double d14 = fArr3[1];
                double d15 = f29;
                n0 n0Var = new n0(d13, d14, d15);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (wVar.z) {
                            wVar.z = false;
                            return;
                        }
                        wVar.l = false;
                        wVar.s.c();
                        org.telegram.messenger.g0.r(wVar.y);
                        j0 painting = wVar.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!wVar.e) {
                                v0 v0Var2 = wVar.a.a;
                                if (v0Var2 == null || v0Var2.z()) {
                                    n0Var.d = true;
                                    k0 k0Var = new k0();
                                    Vector vector = new Vector();
                                    k0Var.b = vector;
                                    vector.add(n0Var);
                                    wVar.b(k0Var);
                                }
                                wVar.n = 0;
                            } else if (wVar.n > 0) {
                                wVar.c(true, wVar.a.getCurrentBrush().j());
                                if (wVar.a.getCurrentBrush() instanceof a) {
                                    final float f30 = wVar.k;
                                    final n0 n0Var2 = wVar.m[wVar.n - 1];
                                    n0 n0Var3 = wVar.h;
                                    double d16 = n0Var3 == null ? d15 : n0Var3.c;
                                    final float currentWeight = wVar.a.getCurrentWeight() * ((float) d16) * 12.0f;
                                    ValueAnimator valueAnimator = wVar.r;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    final float[] fArr4 = new float[1];
                                    final boolean[] zArr = new boolean[1];
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    wVar.r = ofFloat;
                                    final double d17 = d16;
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.r
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            w wVar2 = w.this;
                                            wVar2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d18 = f30;
                                            double cos = Math.cos(d18 - 2.5918139392115793d);
                                            double sin = Math.sin(d18 - 2.748893571891069d);
                                            n0 n0Var4 = n0Var2;
                                            double d19 = n0Var4.a;
                                            double d20 = currentWeight;
                                            double d21 = cos * d20;
                                            float[] fArr5 = fArr4;
                                            double d22 = fArr5[0];
                                            double d23 = (d21 * d22) + d19;
                                            double d24 = n0Var4.b;
                                            double d25 = sin * d20;
                                            double d26 = (d22 * d25) + d24;
                                            double d27 = d17;
                                            double d28 = floatValue;
                                            wVar2.b(new k0(new n0[]{new n0(d23, d26, d27), new n0((d21 * d28) + d19, (d25 * d28) + d24, d27, 0)}));
                                            double cos2 = Math.cos(d18 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d18 + 2.748893571891069d);
                                            double d29 = n0Var4.a;
                                            double d30 = cos2 * d20;
                                            double d31 = fArr5[0];
                                            double d32 = sin2 * d20;
                                            wVar2.b(new k0(new n0[]{new n0((d30 * d31) + d29, (d31 * d32) + d24, d27), new n0((d30 * d28) + d29, (d32 * d28) + d24, d27, 0)}));
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0] && floatValue > 0.4f) {
                                                zArr2[0] = true;
                                                p2.y.a();
                                            }
                                            fArr5[0] = floatValue;
                                        }
                                    });
                                    wVar.r.addListener(new r81(wVar, 14));
                                    wVar.r.setDuration(240L);
                                    wVar.r.setInterpolator(xq.h);
                                    wVar.r.start();
                                }
                            }
                            r72 = 0;
                            wVar.a.getPainting().c(null, wVar.a.getCurrentColor(), true, new s(wVar, 0 == true ? 1 : 0));
                            wVar.n = r72;
                            wVar.o = r72;
                            wVar.j = r72;
                            wVar.b = r72;
                            wVar.p = 0.0d;
                            wVar.q = 0.0d;
                            v0Var = wVar.a.a;
                            if (v0Var == null) {
                                v0Var.Y();
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
                        v0Var = wVar.a.a;
                        if (v0Var == null) {
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
                        j0 painting2 = wVar.a.getPainting();
                        if (painting2.L != null) {
                            i10 = 1;
                        } else {
                            i10 = 1;
                            painting2.f.f(new e0(painting2, r63 == true ? 1 : 0, i10));
                        }
                        org.telegram.messenger.g0.r(wVar.y);
                        j0 painting3 = wVar.a.getPainting();
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
                        wVar.g = n0Var;
                        wVar.d = System.currentTimeMillis();
                        wVar.m[0] = n0Var;
                        wVar.n = 1;
                        wVar.o = 1;
                        wVar.j = false;
                        wVar.f = true;
                        wVar.l = true;
                        org.telegram.messenger.g0.i3(wVar.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a13 = n0Var.a(wVar.g);
                    if (a13 < org.telegram.messenger.g0.L(5.0f) / scaleX) {
                        return;
                    }
                    if (wVar.l && (a13 > org.telegram.messenger.g0.L(6.0f) / scaleX || wVar.n > 4)) {
                        wVar.l = false;
                        org.telegram.messenger.g0.r(wVar.y);
                    }
                    if (!wVar.e) {
                        v0 v0Var3 = wVar.a.a;
                        if (v0Var3 != null) {
                            v0Var3.d0();
                        }
                        wVar.e = true;
                        if (z9 && (wVar.a.getCurrentBrush() instanceof f)) {
                            wVar.A = wVar.a.getCurrentBrush();
                            wVar.a.g((h) rf.b.g(1, h.a));
                        }
                    }
                    wVar.m[wVar.n] = n0Var;
                    if (wVar.a.getPainting() == null || !wVar.a.getPainting().G) {
                        f10 = a13;
                        if (System.currentTimeMillis() - wVar.d > 3000) {
                            wVar.s.c();
                            j0 painting4 = wVar.a.getPainting();
                            if (painting4.L == null) {
                                painting4.f.f(new e0(painting4, r62 == true ? 1 : 0, 1));
                            }
                        } else if ((wVar.a.getCurrentBrush() instanceof f) || (wVar.a.getCurrentBrush() instanceof c)) {
                            d1 d1Var = wVar.s;
                            boolean z12 = f10 > ((float) org.telegram.messenger.g0.L(6.0f)) / scaleX;
                            synchronized (d1Var) {
                                d1Var.b.add(new b1(d13, d14));
                                z10 = d1Var.b.size() >= 8;
                            }
                            if (z10) {
                                q5 q5Var = d1.m;
                                a1 a1Var = d1Var.l;
                                AtomicBoolean atomicBoolean = d1Var.k;
                                if (!d1Var.j.get()) {
                                    if (atomicBoolean.get() && !d1Var.d && z12) {
                                        q5Var.cancelRunnable(a1Var);
                                        q5Var.postRunnable(a1Var, 150L);
                                    }
                                    if (!atomicBoolean.get()) {
                                        r42 = 1;
                                        atomicBoolean.set(true);
                                        q5Var.postRunnable(a1Var, 150L);
                                        i7 = wVar.n + r42;
                                        wVar.n = i7;
                                        wVar.o += r42;
                                        if (i7 != 3) {
                                            n0[] n0VarArr = wVar.m;
                                            n0 n0Var4 = n0VarArr[2];
                                            double d18 = n0Var4.b;
                                            n0 n0Var5 = n0VarArr[r42];
                                            float atan2 = (float) Math.atan2(d18 - n0Var5.b, n0Var4.a - n0Var5.a);
                                            if (wVar.j) {
                                                float a14 = j9.a(f10 / (org.telegram.messenger.g0.L(16.0f) / scaleX), 0.0f, 1.0f);
                                                if (a14 > 0.4f) {
                                                    double d19 = 1.0f - a14;
                                                    double d20 = wVar.k;
                                                    double d21 = a14;
                                                    double d22 = atan2;
                                                    f11 = scaleX;
                                                    wVar.k = (float) Math.atan2((Math.sin(d22) * d21) + (Math.sin(d20) * d19), jg.g.d(d22, d21, Math.cos(d20) * d19));
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
                                        wVar.g = n0Var;
                                        if (f10 > org.telegram.messenger.g0.L(8.0f) / f11) {
                                            wVar.h = n0Var;
                                        }
                                        wVar.w = j9.a((currentTimeMillis / 75.0f) + wVar.w, 0.6f, 1.0f);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        f10 = a13;
                    }
                    r42 = 1;
                    i7 = wVar.n + r42;
                    wVar.n = i7;
                    wVar.o += r42;
                    if (i7 != 3) {
                    }
                    wVar.g = n0Var;
                    if (f10 > org.telegram.messenger.g0.L(8.0f) / f11) {
                    }
                    wVar.w = j9.a((currentTimeMillis / 75.0f) + wVar.w, 0.6f, 1.0f);
                    return;
                }
                return;
            }
        }
        z9 = false;
        if (wVar.a.getCurrentBrush() != null) {
        }
        float[] fArr32 = wVar.u;
        double d132 = fArr32[0];
        double d142 = fArr32[1];
        double d152 = f29;
        n0 n0Var6 = new n0(d132, d142, d152);
        if (actionMasked2 != 0) {
        }
        if (wVar.z) {
        }
    }

    public final void f(Runnable runnable) {
        u0 u0Var = this.d;
        if (u0Var == null) {
            return;
        }
        u0Var.postRunnable(new org.telegram.ui.web.w(24, this, runnable));
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

    public j0 getPainting() {
        return this.c;
    }

    public m1 getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.D = true;
        if (this.d != null) {
            f(new p0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        j0 j0Var = this.c;
        float width = j0Var != null ? getWidth() / j0Var.g.a : 1.0f;
        float f10 = width > 0.0f ? width : 1.0f;
        mt0 mt0Var = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-mt0Var.a) / 2.0f, (-mt0Var.b) / 2.0f);
        if (this.y instanceof g) {
            i1 i1Var = this.f;
            i1Var.getClass();
            Matrix matrix2 = new Matrix();
            i1Var.o = matrix2;
            matrix.invert(matrix2);
        } else {
            w wVar = this.e;
            wVar.getClass();
            Matrix matrix3 = new Matrix();
            wVar.t = matrix3;
            matrix.invert(matrix3);
        }
        u0 u0Var = this.d;
        j0Var.y = dc.c(dc.b(u0Var.n, u0Var.r), dc.a(matrix));
    }

    public void setBrush(h hVar) {
        boolean z9 = this.y instanceof g;
        i1 i1Var = this.f;
        if (z9) {
            i1Var.e();
        }
        this.y = hVar;
        i();
        this.c.q(this.y);
        h hVar2 = this.y;
        if (hVar2 instanceof g) {
            int o4 = ((g) hVar2).o();
            ArrayList arrayList = i1Var.n;
            ArrayList arrayList2 = i1Var.m;
            w0 w0Var = i1Var.a;
            if (w0Var == null || w0Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            i1Var.h = new z0(g.p(o4));
            mt0 mt0Var = w0Var.getPainting().g;
            z0 z0Var = i1Var.h;
            float f10 = mt0Var.a;
            z0Var.b = f10 / 2.0f;
            float f11 = mt0Var.b;
            z0Var.c = f11 / 2.0f;
            float min = Math.min(f10, f11) / 5.0f;
            z0Var.e = min;
            z0Var.d = min;
            i1Var.h.f = w0Var.getCurrentWeight();
            i1Var.h.g = org.telegram.messenger.g0.L(32.0f);
            i1Var.h.l = l0.e(p10.s0).k;
            if (i1Var.h.a.o() == 4) {
                z0 z0Var2 = i1Var.h;
                float f12 = mt0Var.a / 2.0f;
                z0Var2.d = f12;
                z0Var2.b = f12;
                z0Var2.i = f12 + 1.0f;
                float f13 = mt0Var.b;
                float f14 = f13 / 3.0f;
                float f15 = 1.0f * f14;
                z0Var2.c = f15;
                float f16 = f13 / 2.0f;
                z0Var2.j = f16;
                z0Var2.e = f14 * 2.0f;
                z0Var2.k = Math.abs(f15 - f16);
                e1 e1Var = new e1(i1Var, 0);
                arrayList2.add(e1Var);
                f1 f1Var = new f1(i1Var, e1Var, 0);
                arrayList2.add(f1Var);
                arrayList.add(f1Var);
                f1 f1Var2 = new f1(i1Var, e1Var, 1);
                arrayList2.add(f1Var2);
                arrayList.add(f1Var2);
            }
            if (i1Var.h.a.o() == 0) {
                arrayList2.add(new e1(i1Var, 1));
            }
            if (i1Var.h.a.o() == 2) {
                arrayList2.add(new e1(i1Var, 2));
            }
            if (i1Var.h.a.o() == 1 || i1Var.h.a.o() == 3) {
                arrayList2.add(new g1(i1Var, i1Var.h, false, false));
                arrayList2.add(new g1(i1Var, i1Var.h, true, false));
                arrayList2.add(new g1(i1Var, i1Var.h, false, true));
                arrayList2.add(new g1(i1Var, i1Var.h, true, true));
                arrayList2.add(new e1(i1Var, 3, false));
            }
            if (i1Var.h.a.o() == 3) {
                z0 z0Var3 = i1Var.h;
                z0Var3.i = (z0Var3.d * 0.8f) + z0Var3.b;
                z0Var3.j = (z0Var3.e * 1.2f) + z0Var3.c + z0Var3.f;
                e1 e1Var2 = new e1(i1Var, 4);
                arrayList2.add(e1Var2);
                e1Var2.b = false;
                arrayList.add(e1Var2);
            }
            i1Var.l = new e1(i1Var, 5, false);
            if (i1Var.h.a.o() != 4) {
                i1Var.l.c = false;
            }
            e1 e1Var3 = i1Var.l;
            e1Var3.b = false;
            arrayList.add(e1Var3);
            arrayList2.add(i1Var.l);
            w0Var.getPainting().k(i1Var.h);
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.c.g.a;
        this.w = com.google.android.recaptcha.internal.a.x(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.y instanceof g) {
            i1 i1Var = this.f;
            w0 w0Var = i1Var.a;
            z0 z0Var = i1Var.h;
            if (z0Var == null || z0Var.f == w0Var.getCurrentWeight()) {
                return;
            }
            i1Var.h.f = w0Var.getCurrentWeight();
            w0Var.getPainting().k(i1Var.h);
        }
    }

    public void setColor(int i7) {
        this.x = i7;
        if (this.y instanceof g) {
            i1 i1Var = this.f;
            if (i1Var.h != null) {
                i1Var.a.getPainting().k(i1Var.h);
            }
        }
    }

    public void setDelegate(v0 v0Var) {
        this.a = v0Var;
    }

    public void setUndoStore(m1 m1Var) {
        this.b = m1Var;
    }

    public void g(h hVar) {
    }

    public void setQueue(q5 q5Var) {
    }
}
