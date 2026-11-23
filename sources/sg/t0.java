package sg;

import a8.x9;
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
import c8.ic;
import c8.m9;
import com.google.android.gms.internal.vision.e2;
import fi.q5;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a8;
import org.telegram.messenger.i10;
import org.telegram.messenger.q2;
import org.telegram.messenger.r5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.i71;
import org.telegram.ui.web.t1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class t0 extends TextureView {
    public boolean E;
    public s0 a;
    public j1 b;
    public final h0 c;
    public r0 d;
    public final v e;
    public final f1 f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float w;
    public int x;
    public h y;

    public t0(Context context, h0 h0Var, Bitmap bitmap, Bitmap bitmap2, ba baVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = h0Var;
        h0Var.f = this;
        setSurfaceTextureListener(new p0(this, baVar));
        this.e = new v(this);
        n0 n0Var = new n0(this, 0);
        f1 f1Var = new f1();
        Paint paint = new Paint(1);
        f1Var.c = paint;
        Paint paint2 = new Paint(1);
        f1Var.d = paint2;
        Paint paint3 = new Paint(1);
        f1Var.e = paint3;
        Paint paint4 = new Paint(1);
        f1Var.f = paint4;
        Paint paint5 = new Paint(1);
        f1Var.g = paint5;
        f1Var.m = new ArrayList();
        f1Var.n = new ArrayList();
        f1Var.p = new float[2];
        f1Var.a = this;
        f1Var.b = n0Var;
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
        this.f = f1Var;
        h0Var.a = new nd0(this, 14);
    }

    public final void a() {
        n0 n0Var = new n0(this, 2);
        v vVar = this.e;
        vVar.g = new l0(vVar.a.getPainting().g.a, 0.0d, 1.0d);
        vVar.l = true;
        vVar.a(new d(), false, n0Var);
    }

    public final void b() {
        t0 t0Var;
        f1 f1Var = this.f;
        if (f1Var == null || (t0Var = f1Var.a) == null || t0Var.getPainting() == null || f1Var.h == null) {
            return;
        }
        h0 painting = t0Var.getPainting();
        painting.f.f(new e0(painting, 0));
        f1Var.m.clear();
        f1Var.n.clear();
        f1Var.h = null;
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.y instanceof g) {
            this.f.e();
        }
        r0 r0Var = this.d;
        if (r0Var == null || !r0Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            r0Var.postRunnable(new q5(r0Var, z10, z11, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.y instanceof g) {
            f1 f1Var = this.f;
            Paint paint = f1Var.c;
            ArrayList arrayList = f1Var.m;
            t0 t0Var = f1Var.a;
            if (t0Var == null || t0Var.getPainting() == null) {
                return;
            }
            xt0 xt0Var = t0Var.getPainting().g;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                e1 e1Var = (e1) arrayList.get(i7);
                if (e1Var.c && !e1Var.b) {
                    f1Var.b(canvas, xt0Var, e1Var);
                }
            }
            w0 w0Var = f1Var.h;
            if (w0Var != null && w0Var.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r1.h) / 3.141592653589793d) * 180.0d), (f1Var.h.b / xt0Var.a) * canvas.getWidth(), (f1Var.h.c / xt0Var.b) * canvas.getHeight());
            }
            w0 w0Var2 = f1Var.h;
            if (w0Var2 == null || w0Var2.a.o() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (f1Var.h.b / xt0Var.a), canvas.getHeight() * (f1Var.h.c / xt0Var.b), canvas.getWidth() * (f1Var.h.i / xt0Var.a), canvas.getHeight() * (f1Var.h.j / xt0Var.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (f1Var.h.d / xt0Var.a), canvas2.getHeight() * (f1Var.h.e / xt0Var.b), canvas2.getWidth() * (f1Var.h.i / xt0Var.a), canvas2.getHeight() * (f1Var.h.j / xt0Var.b), paint);
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e1 e1Var2 = (e1) arrayList.get(i10);
                if (e1Var2.c && e1Var2.b) {
                    f1Var.b(canvas2, xt0Var, e1Var2);
                }
            }
            w0 w0Var3 = f1Var.h;
            if (w0Var3 == null || w0Var3.h == 0.0f) {
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
    /* JADX WARN: Type inference failed for: r0v10, types: [sg.f1] */
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
        r0 r0Var;
        boolean z10;
        float f10;
        boolean z11;
        ?? r42;
        int i7;
        float f11;
        ?? r72;
        s0 s0Var;
        int i10;
        float f12;
        float f13;
        float f14;
        float sqrt;
        int i11;
        ?? r33;
        int i12 = 1;
        if (motionEvent.getPointerCount() > 1 || (r0Var = this.d) == null || !r0Var.f || !r0Var.h) {
            return;
        }
        e1 e1Var = null;
        ?? r62 = 0;
        ?? r63 = 0;
        ?? r92 = 0;
        if (this.y instanceof g) {
            ?? r02 = this.f;
            getScaleX();
            ArrayList arrayList = r02.n;
            ArrayList arrayList2 = r02.m;
            n0 n0Var = r02.b;
            float[] fArr = r02.p;
            t0 t0Var = r02.a;
            if (t0Var == null || t0Var.getPainting() == null || r02.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX();
            float height = t0Var.getHeight() - motionEvent.getY();
            fArr[0] = x10;
            fArr[1] = height;
            r02.o.mapPoints(fArr);
            float f15 = fArr[0];
            float f16 = fArr[1];
            n0Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        r02.k = null;
                        return;
                    }
                    return;
                }
                e1 e1Var2 = r02.k;
                if (e1Var2 == null) {
                    b1 b1Var = r02.l;
                    if (b1Var != null) {
                        if (b1Var.b) {
                            r02.c(f15, f16, false);
                        }
                        float f17 = fArr[0] + r02.i;
                        b1 b1Var2 = r02.l;
                        float f18 = f17 - b1Var2.d;
                        float f19 = (fArr[1] + r02.j) - b1Var2.e;
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            e1 e1Var3 = (e1) arrayList.get(i13);
                            e1Var3.b(e1Var3.d + f18, e1Var3.e + f19);
                        }
                    }
                } else {
                    if (e1Var2.b) {
                        r02.d(false);
                    }
                    r02.k.b(fArr[0] + r02.i, fArr[1] + r02.j);
                }
                t0Var.getPainting().k(r02.h);
                n0Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                e1 e1Var4 = (e1) arrayList2.get(i14);
                if (e1Var4.c) {
                    fArr[r92] = f15;
                    fArr[i12] = f16;
                    if (e1Var4.b) {
                        r02.c(f15, f16, r92);
                    }
                    i11 = i12;
                    double a10 = x9.a(e1Var4.d, e1Var4.e, fArr[r92], fArr[i11]);
                    int L = org.telegram.messenger.g0.L(40.0f);
                    r33 = r92 == true ? 1 : 0;
                    if (a10 < L && (e1Var == null || a10 < d)) {
                        e1Var = e1Var4;
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
            boolean z12 = r92;
            fArr[z12 ? 1 : 0] = f15;
            fArr[i15] = f16;
            r02.c(f15, f16, z12);
            if (e1Var == null) {
                w0 w0Var = r02.h;
                if (w0Var != null) {
                    if (w0Var.a.o() == 0 || r02.h.a.o() == 2) {
                        f12 = f16;
                        f13 = f15;
                        double sqrt2 = Math.sqrt(Math.pow(f12 - r02.h.c, 2.0d) + Math.pow(f13 - r02.h.b, 2.0d));
                        w0 w0Var2 = r02.h;
                    } else if (r02.h.a.o() == i15 || r02.h.a.o() == 3) {
                        w0 w0Var3 = r02.h;
                        float f20 = w0Var3.b;
                        float f21 = w0Var3.d;
                        float f22 = w0Var3.f / 2.0f;
                        float f23 = (f20 - f21) - f22;
                        float f24 = w0Var3.c;
                        float f25 = w0Var3.e;
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
                                w0 w0Var4 = r02.h;
                                float a11 = f1.a(f15, f16, w0Var4.b, w0Var4.c, w0Var4.i, w0Var4.j);
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
                        xt0 xt0Var = t0Var.getPainting().g;
                        w0 w0Var5 = r02.h;
                        float a12 = f1.a(f15, f16, w0Var5.b, w0Var5.c, w0Var5.i, w0Var5.j);
                        w0 w0Var6 = r02.h;
                        if (Math.min(a12, f1.a(f15, f16, w0Var6.d, w0Var6.e, w0Var6.i, w0Var6.j)) - (r02.h.f / 2.0f) < Math.min(xt0Var.a, xt0Var.b) * 0.1f) {
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
            r02.k = e1Var;
            if (e1Var != null) {
                if (e1Var.b) {
                    r02.c(f13, f12, false);
                }
                e1 e1Var5 = r02.k;
                r02.i = e1Var5.d - fArr[0];
                r02.j = e1Var5.e - fArr[1];
                return;
            }
            b1 b1Var3 = r02.l;
            if (b1Var3 != null) {
                if (b1Var3.b) {
                    r02.c(f13, f12, false);
                }
                b1 b1Var4 = r02.l;
                r02.i = b1Var4.d - fArr[0];
                r02.j = b1Var4.e - fArr[1];
                return;
            }
            return;
        }
        final v vVar = this.e;
        float scaleX = getScaleX();
        if (vVar.x != null || vVar.r != null) {
            return;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        float x11 = motionEvent.getX();
        float height2 = vVar.a.getHeight() - motionEvent.getY();
        float[] fArr2 = vVar.u;
        fArr2[0] = x11;
        fArr2[1] = height2;
        vVar.t.mapPoints(fArr2);
        float currentTimeMillis = System.currentTimeMillis() - vVar.v;
        vVar.w = m9.a(vVar.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
        if (vVar.a.getCurrentBrush() != null && (vVar.a.getCurrentBrush() instanceof a)) {
            vVar.w = 1.0f - vVar.w;
        }
        vVar.v = System.currentTimeMillis();
        float f29 = vVar.w;
        if (motionEvent.getToolType(motionEvent.getActionIndex()) == 2) {
            f29 = Math.max(0.1f, v.B.getInterpolation(motionEvent.getPressure()));
            if ((motionEvent.getButtonState() & 32) == 32) {
                z10 = true;
                if (vVar.a.getCurrentBrush() != null) {
                    f29 = (org.telegram.messenger.g0.T1(vVar.a.getCurrentBrush().j(), 1.0f, m9.a(vVar.o / 16.0f, 0.0f, 1.0f)) * (f29 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = vVar.u;
                double d13 = fArr3[0];
                double d14 = fArr3[1];
                double d15 = f29;
                l0 l0Var = new l0(d13, d14, d15);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (vVar.z) {
                            vVar.z = false;
                            return;
                        }
                        vVar.l = false;
                        vVar.s.c();
                        org.telegram.messenger.g0.r(vVar.y);
                        h0 painting = vVar.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!vVar.e) {
                                s0 s0Var2 = vVar.a.a;
                                if (s0Var2 == null || s0Var2.s()) {
                                    l0Var.d = true;
                                    i0 i0Var = new i0();
                                    Vector vector = new Vector();
                                    i0Var.b = vector;
                                    vector.add(l0Var);
                                    vVar.b(i0Var);
                                }
                                vVar.n = 0;
                            } else if (vVar.n > 0) {
                                vVar.c(true, vVar.a.getCurrentBrush().j());
                                if (vVar.a.getCurrentBrush() instanceof a) {
                                    final float f30 = vVar.k;
                                    final l0 l0Var2 = vVar.m[vVar.n - 1];
                                    l0 l0Var3 = vVar.h;
                                    double d16 = l0Var3 == null ? d15 : l0Var3.c;
                                    final float currentWeight = vVar.a.getCurrentWeight() * ((float) d16) * 12.0f;
                                    ValueAnimator valueAnimator = vVar.r;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    final float[] fArr4 = new float[1];
                                    final boolean[] zArr = new boolean[1];
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    vVar.r = ofFloat;
                                    final double d17 = d16;
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.r
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            v vVar2 = v.this;
                                            vVar2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d18 = f30;
                                            double cos = Math.cos(d18 - 2.5918139392115793d);
                                            double sin = Math.sin(d18 - 2.748893571891069d);
                                            l0 l0Var4 = l0Var2;
                                            double d19 = l0Var4.a;
                                            double d20 = currentWeight;
                                            double d21 = cos * d20;
                                            float[] fArr5 = fArr4;
                                            double d22 = fArr5[0];
                                            double d23 = (d21 * d22) + d19;
                                            double d24 = l0Var4.b;
                                            double d25 = sin * d20;
                                            double d26 = (d22 * d25) + d24;
                                            double d27 = d17;
                                            double d28 = floatValue;
                                            vVar2.b(new i0(new l0[]{new l0(d23, d26, d27), new l0((d21 * d28) + d19, (d25 * d28) + d24, d27, 0)}));
                                            double cos2 = Math.cos(d18 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d18 + 2.748893571891069d);
                                            double d29 = l0Var4.a;
                                            double d30 = cos2 * d20;
                                            double d31 = fArr5[0];
                                            double d32 = sin2 * d20;
                                            vVar2.b(new i0(new l0[]{new l0((d30 * d31) + d29, (d31 * d32) + d24, d27), new l0((d30 * d28) + d29, (d32 * d28) + d24, d27, 0)}));
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0] && floatValue > 0.4f) {
                                                zArr2[0] = true;
                                                q2.y.a();
                                            }
                                            fArr5[0] = floatValue;
                                        }
                                    });
                                    vVar.r.addListener(new i71(vVar, 16));
                                    vVar.r.setDuration(240L);
                                    vVar.r.setInterpolator(kr.h);
                                    vVar.r.start();
                                }
                            }
                            r72 = 0;
                            vVar.a.getPainting().c(null, vVar.a.getCurrentColor(), true, new s(vVar, 0 == true ? 1 : 0));
                            vVar.n = r72;
                            vVar.o = r72;
                            vVar.j = r72;
                            vVar.b = r72;
                            vVar.p = 0.0d;
                            vVar.q = 0.0d;
                            s0Var = vVar.a.a;
                            if (s0Var == null) {
                                s0Var.k0();
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
                        ofFloat2.addUpdateListener(new c0(painting, i16));
                        painting.L.addListener(new g0(painting, i16));
                        painting.L.setInterpolator(kr.h);
                        painting.L.setDuration(350L);
                        painting.L.start();
                        q2.n.a();
                        r72 = 0;
                        vVar.n = r72;
                        vVar.o = r72;
                        vVar.j = r72;
                        vVar.b = r72;
                        vVar.p = 0.0d;
                        vVar.q = 0.0d;
                        s0Var = vVar.a.a;
                        if (s0Var == null) {
                        }
                    } else if (actionMasked2 != 2) {
                        if (actionMasked2 != 3) {
                            return;
                        }
                        if (vVar.z) {
                            vVar.z = false;
                            return;
                        }
                        vVar.l = false;
                        vVar.s.c();
                        h0 painting2 = vVar.a.getPainting();
                        if (painting2.L != null) {
                            i10 = 1;
                        } else {
                            i10 = 1;
                            painting2.f.f(new d0(painting2, r63 == true ? 1 : 0, i10));
                        }
                        org.telegram.messenger.g0.r(vVar.y);
                        h0 painting3 = vVar.a.getPainting();
                        painting3.f.f(new e0(painting3, i10));
                        vVar.n = 0;
                        vVar.o = 0;
                        vVar.j = false;
                        vVar.b = false;
                        vVar.p = 0.0d;
                        vVar.q = 0.0d;
                        h hVar = vVar.A;
                        if (hVar != null) {
                            vVar.a.g(hVar);
                            vVar.A = null;
                            return;
                        }
                        return;
                    }
                }
                if (vVar.z) {
                    if (!vVar.b) {
                        vVar.b = true;
                        vVar.e = false;
                        vVar.c = true;
                        vVar.g = l0Var;
                        vVar.d = System.currentTimeMillis();
                        vVar.m[0] = l0Var;
                        vVar.n = 1;
                        vVar.o = 1;
                        vVar.j = false;
                        vVar.f = true;
                        vVar.l = true;
                        org.telegram.messenger.g0.h3(vVar.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a13 = l0Var.a(vVar.g);
                    if (a13 < org.telegram.messenger.g0.L(5.0f) / scaleX) {
                        return;
                    }
                    if (vVar.l && (a13 > org.telegram.messenger.g0.L(6.0f) / scaleX || vVar.n > 4)) {
                        vVar.l = false;
                        org.telegram.messenger.g0.r(vVar.y);
                    }
                    if (!vVar.e) {
                        s0 s0Var3 = vVar.a.a;
                        if (s0Var3 != null) {
                            s0Var3.x0();
                        }
                        vVar.e = true;
                        if (z10 && (vVar.a.getCurrentBrush() instanceof f)) {
                            vVar.A = vVar.a.getCurrentBrush();
                            vVar.a.g((h) p5.c.h(1, h.a));
                        }
                    }
                    vVar.m[vVar.n] = l0Var;
                    if (vVar.a.getPainting() == null || !vVar.a.getPainting().G) {
                        f10 = a13;
                        if (System.currentTimeMillis() - vVar.d > 3000) {
                            vVar.s.c();
                            h0 painting4 = vVar.a.getPainting();
                            if (painting4.L == null) {
                                painting4.f.f(new d0(painting4, r62 == true ? 1 : 0, 1));
                            }
                        } else if ((vVar.a.getCurrentBrush() instanceof f) || (vVar.a.getCurrentBrush() instanceof c)) {
                            a1 a1Var = vVar.s;
                            boolean z13 = f10 > ((float) org.telegram.messenger.g0.L(6.0f)) / scaleX;
                            synchronized (a1Var) {
                                a1Var.b.add(new y0(d13, d14));
                                z11 = a1Var.b.size() >= 8;
                            }
                            if (z11) {
                                r5 r5Var = a1.m;
                                x0 x0Var = a1Var.l;
                                AtomicBoolean atomicBoolean = a1Var.k;
                                if (!a1Var.j.get()) {
                                    if (atomicBoolean.get() && !a1Var.d && z13) {
                                        r5Var.cancelRunnable(x0Var);
                                        r5Var.postRunnable(x0Var, 150L);
                                    }
                                    if (!atomicBoolean.get()) {
                                        r42 = 1;
                                        atomicBoolean.set(true);
                                        r5Var.postRunnable(x0Var, 150L);
                                        i7 = vVar.n + r42;
                                        vVar.n = i7;
                                        vVar.o += r42;
                                        if (i7 != 3) {
                                            l0[] l0VarArr = vVar.m;
                                            l0 l0Var4 = l0VarArr[2];
                                            double d18 = l0Var4.b;
                                            l0 l0Var5 = l0VarArr[r42];
                                            float atan2 = (float) Math.atan2(d18 - l0Var5.b, l0Var4.a - l0Var5.a);
                                            if (vVar.j) {
                                                float a14 = m9.a(f10 / (org.telegram.messenger.g0.L(16.0f) / scaleX), 0.0f, 1.0f);
                                                if (a14 > 0.4f) {
                                                    double d19 = 1.0f - a14;
                                                    double d20 = vVar.k;
                                                    double d21 = a14;
                                                    double d22 = atan2;
                                                    f11 = scaleX;
                                                    vVar.k = (float) Math.atan2((Math.sin(d22) * d21) + (Math.sin(d20) * d19), i5.c.c(d22, d21, Math.cos(d20) * d19));
                                                    vVar.c(false, vVar.a.getCurrentBrush().j());
                                                }
                                            } else {
                                                vVar.k = atan2;
                                                vVar.j = r42;
                                            }
                                            f11 = scaleX;
                                            vVar.c(false, vVar.a.getCurrentBrush().j());
                                        } else {
                                            f11 = scaleX;
                                        }
                                        vVar.g = l0Var;
                                        if (f10 > org.telegram.messenger.g0.L(8.0f) / f11) {
                                            vVar.h = l0Var;
                                        }
                                        vVar.w = m9.a((currentTimeMillis / 75.0f) + vVar.w, 0.6f, 1.0f);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        f10 = a13;
                    }
                    r42 = 1;
                    i7 = vVar.n + r42;
                    vVar.n = i7;
                    vVar.o += r42;
                    if (i7 != 3) {
                    }
                    vVar.g = l0Var;
                    if (f10 > org.telegram.messenger.g0.L(8.0f) / f11) {
                    }
                    vVar.w = m9.a((currentTimeMillis / 75.0f) + vVar.w, 0.6f, 1.0f);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (vVar.a.getCurrentBrush() != null) {
        }
        float[] fArr32 = vVar.u;
        double d132 = fArr32[0];
        double d142 = fArr32[1];
        double d152 = f29;
        l0 l0Var6 = new l0(d132, d142, d152);
        if (actionMasked2 != 0) {
        }
        if (vVar.z) {
        }
    }

    public final void f(Runnable runnable) {
        r0 r0Var = this.d;
        if (r0Var == null) {
            return;
        }
        r0Var.postRunnable(new t1(15, this, runnable));
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

    public h0 getPainting() {
        return this.c;
    }

    public j1 getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.E = true;
        if (this.d != null) {
            f(new n0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        h0 h0Var = this.c;
        float width = h0Var != null ? getWidth() / h0Var.g.a : 1.0f;
        float f10 = width > 0.0f ? width : 1.0f;
        xt0 xt0Var = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f10, -f10);
        matrix.preTranslate((-xt0Var.a) / 2.0f, (-xt0Var.b) / 2.0f);
        if (this.y instanceof g) {
            f1 f1Var = this.f;
            f1Var.getClass();
            Matrix matrix2 = new Matrix();
            f1Var.o = matrix2;
            matrix.invert(matrix2);
        } else {
            v vVar = this.e;
            vVar.getClass();
            Matrix matrix3 = new Matrix();
            vVar.t = matrix3;
            matrix.invert(matrix3);
        }
        r0 r0Var = this.d;
        h0Var.y = ic.c(ic.b(r0Var.n, r0Var.r), ic.a(matrix));
    }

    public void setBrush(h hVar) {
        boolean z10 = this.y instanceof g;
        f1 f1Var = this.f;
        if (z10) {
            f1Var.e();
        }
        this.y = hVar;
        i();
        this.c.q(this.y);
        h hVar2 = this.y;
        if (hVar2 instanceof g) {
            int o4 = ((g) hVar2).o();
            ArrayList arrayList = f1Var.n;
            ArrayList arrayList2 = f1Var.m;
            t0 t0Var = f1Var.a;
            if (t0Var == null || t0Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            f1Var.h = new w0(g.p(o4));
            xt0 xt0Var = t0Var.getPainting().g;
            w0 w0Var = f1Var.h;
            float f10 = xt0Var.a;
            w0Var.b = f10 / 2.0f;
            float f11 = xt0Var.b;
            w0Var.c = f11 / 2.0f;
            float min = Math.min(f10, f11) / 5.0f;
            w0Var.e = min;
            w0Var.d = min;
            f1Var.h.f = t0Var.getCurrentWeight();
            f1Var.h.g = org.telegram.messenger.g0.L(32.0f);
            f1Var.h.l = j0.e(i10.t0).k;
            if (f1Var.h.a.o() == 4) {
                w0 w0Var2 = f1Var.h;
                float f12 = xt0Var.a / 2.0f;
                w0Var2.d = f12;
                w0Var2.b = f12;
                w0Var2.i = f12 + 1.0f;
                float f13 = xt0Var.b;
                float f14 = f13 / 3.0f;
                float f15 = 1.0f * f14;
                w0Var2.c = f15;
                float f16 = f13 / 2.0f;
                w0Var2.j = f16;
                w0Var2.e = f14 * 2.0f;
                w0Var2.k = Math.abs(f15 - f16);
                b1 b1Var = new b1(f1Var, 0);
                arrayList2.add(b1Var);
                c1 c1Var = new c1(f1Var, b1Var, 0);
                arrayList2.add(c1Var);
                arrayList.add(c1Var);
                c1 c1Var2 = new c1(f1Var, b1Var, 1);
                arrayList2.add(c1Var2);
                arrayList.add(c1Var2);
            }
            if (f1Var.h.a.o() == 0) {
                arrayList2.add(new b1(f1Var, 1));
            }
            if (f1Var.h.a.o() == 2) {
                arrayList2.add(new b1(f1Var, 2));
            }
            if (f1Var.h.a.o() == 1 || f1Var.h.a.o() == 3) {
                arrayList2.add(new d1(f1Var, f1Var.h, false, false));
                arrayList2.add(new d1(f1Var, f1Var.h, true, false));
                arrayList2.add(new d1(f1Var, f1Var.h, false, true));
                arrayList2.add(new d1(f1Var, f1Var.h, true, true));
                arrayList2.add(new b1(f1Var, 3, false));
            }
            if (f1Var.h.a.o() == 3) {
                w0 w0Var3 = f1Var.h;
                w0Var3.i = (w0Var3.d * 0.8f) + w0Var3.b;
                w0Var3.j = (w0Var3.e * 1.2f) + w0Var3.c + w0Var3.f;
                b1 b1Var2 = new b1(f1Var, 4);
                arrayList2.add(b1Var2);
                b1Var2.b = false;
                arrayList.add(b1Var2);
            }
            f1Var.l = new b1(f1Var, 5, false);
            if (f1Var.h.a.o() != 4) {
                f1Var.l.c = false;
            }
            b1 b1Var3 = f1Var.l;
            b1Var3.b = false;
            arrayList.add(b1Var3);
            arrayList2.add(f1Var.l);
            t0Var.getPainting().k(f1Var.h);
        }
    }

    public void setBrushSize(float f10) {
        float f11 = this.c.g.a;
        this.w = e2.x(f11, 0.043945312f, f10, 0.00390625f * f11);
        if (this.y instanceof g) {
            f1 f1Var = this.f;
            t0 t0Var = f1Var.a;
            w0 w0Var = f1Var.h;
            if (w0Var == null || w0Var.f == t0Var.getCurrentWeight()) {
                return;
            }
            f1Var.h.f = t0Var.getCurrentWeight();
            t0Var.getPainting().k(f1Var.h);
        }
    }

    public void setColor(int i7) {
        this.x = i7;
        if (this.y instanceof g) {
            f1 f1Var = this.f;
            if (f1Var.h != null) {
                f1Var.a.getPainting().k(f1Var.h);
            }
        }
    }

    public void setDelegate(s0 s0Var) {
        this.a = s0Var;
    }

    public void setUndoStore(j1 j1Var) {
        this.b = j1Var;
    }

    public void g(h hVar) {
    }

    public void setQueue(r5 r5Var) {
    }
}
