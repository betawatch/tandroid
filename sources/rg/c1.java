package rg;

import a8.ee;
import a8.ic;
import a8.wf;
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
import di.i6;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import li.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Wallet.q6;
import org.telegram.ui.fc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class c1 extends TextureView {
    public b1 a;
    public t1 b;
    public final q0 c;
    public a1 d;
    public final e0 e;
    public final p1 f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float v;
    public int w;
    public m x;
    public boolean y;

    public c1(Context context, q0 q0Var, Bitmap bitmap, Bitmap bitmap2, la laVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = q0Var;
        q0Var.f = this;
        setSurfaceTextureListener(new y0(this, laVar));
        this.e = new e0(this);
        w0 w0Var = new w0(this, 0);
        p1 p1Var = new p1();
        Paint paint = new Paint(1);
        p1Var.c = paint;
        Paint paint2 = new Paint(1);
        p1Var.d = paint2;
        Paint paint3 = new Paint(1);
        p1Var.e = paint3;
        Paint paint4 = new Paint(1);
        p1Var.f = paint4;
        Paint paint5 = new Paint(1);
        p1Var.g = paint5;
        p1Var.m = new ArrayList();
        p1Var.n = new ArrayList();
        p1Var.p = new float[2];
        p1Var.a = this;
        p1Var.b = w0Var;
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
        this.f = p1Var;
        q0Var.a = new e3(this, 16);
    }

    public final void a() {
        w0 w0Var = new w0(this, 2);
        e0 e0Var = this.e;
        e0Var.g = new u0(e0Var.a.getPainting().g.a, 0.0d, 1.0d);
        e0Var.l = true;
        e0Var.a(new d(), false, w0Var);
    }

    public final void b() {
        c1 c1Var;
        p1 p1Var = this.f;
        if (p1Var == null || (c1Var = p1Var.a) == null || c1Var.getPainting() == null || p1Var.h == null) {
            return;
        }
        q0 painting = c1Var.getPainting();
        painting.f.f(new n0(painting, 0));
        p1Var.m.clear();
        p1Var.n.clear();
        p1Var.h = null;
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.x instanceof l) {
            this.f.e();
        }
        a1 a1Var = this.d;
        if (a1Var == null || !a1Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            a1Var.postRunnable(new i6(a1Var, z10, z11, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.x instanceof l) {
            p1 p1Var = this.f;
            Paint paint = p1Var.c;
            ArrayList arrayList = p1Var.m;
            c1 c1Var = p1Var.a;
            if (c1Var == null || c1Var.getPainting() == null) {
                return;
            }
            qw0 qw0Var = c1Var.getPainting().g;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o1 o1Var = (o1) arrayList.get(i10);
                if (o1Var.c && !o1Var.b) {
                    p1Var.b(canvas, qw0Var, o1Var);
                }
            }
            f1 f1Var = p1Var.h;
            if (f1Var != null && f1Var.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r1.h) / 3.141592653589793d) * 180.0d), (p1Var.h.b / qw0Var.a) * canvas.getWidth(), (p1Var.h.c / qw0Var.b) * canvas.getHeight());
            }
            f1 f1Var2 = p1Var.h;
            if (f1Var2 == null || f1Var2.a.o() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (p1Var.h.b / qw0Var.a), canvas.getHeight() * (p1Var.h.c / qw0Var.b), canvas.getWidth() * (p1Var.h.i / qw0Var.a), canvas.getHeight() * (p1Var.h.j / qw0Var.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (p1Var.h.d / qw0Var.a), canvas2.getHeight() * (p1Var.h.e / qw0Var.b), canvas2.getWidth() * (p1Var.h.i / qw0Var.a), canvas2.getHeight() * (p1Var.h.j / qw0Var.b), paint);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                o1 o1Var2 = (o1) arrayList.get(i11);
                if (o1Var2.c && o1Var2.b) {
                    p1Var.b(canvas2, qw0Var, o1Var2);
                }
            }
            f1 f1Var3 = p1Var.h;
            if (f1Var3 == null || f1Var3.h == 0.0f) {
                return;
            }
            canvas2.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0262, code lost:
    
        if (((r7 - java.lang.Math.min(r2.d, r2.e)) - (r0.h.f / 2.0f)) < org.telegram.messenger.AndroidUtilities.dp(30.0f)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x022a, code lost:
    
        if (r5 < org.telegram.messenger.AndroidUtilities.dp(r12)) goto L91;
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
    /* JADX WARN: Type inference failed for: r0v10, types: [rg.p1] */
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
        a1 a1Var;
        boolean z10;
        float f7;
        boolean z11;
        ?? r42;
        int i10;
        float f10;
        ?? r72;
        b1 b1Var;
        int i11;
        float f11;
        float f12;
        float f13;
        float sqrt;
        int i12;
        ?? r33;
        int i13 = 1;
        if (motionEvent.getPointerCount() > 1 || (a1Var = this.d) == null || !a1Var.f || !a1Var.h) {
            return;
        }
        o1 o1Var = null;
        ?? r6 = 0;
        ?? r62 = 0;
        ?? r92 = 0;
        if (this.x instanceof l) {
            ?? r02 = this.f;
            getScaleX();
            ArrayList arrayList = r02.n;
            ArrayList arrayList2 = r02.m;
            w0 w0Var = r02.b;
            float[] fArr = r02.p;
            c1 c1Var = r02.a;
            if (c1Var == null || c1Var.getPainting() == null || r02.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x9 = motionEvent.getX();
            float height = c1Var.getHeight() - motionEvent.getY();
            fArr[0] = x9;
            fArr[1] = height;
            r02.o.mapPoints(fArr);
            float f14 = fArr[0];
            float f15 = fArr[1];
            w0Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        r02.k = null;
                        return;
                    }
                    return;
                }
                o1 o1Var2 = r02.k;
                if (o1Var2 == null) {
                    l1 l1Var = r02.l;
                    if (l1Var != null) {
                        if (l1Var.b) {
                            r02.c(f14, f15, false);
                        }
                        float f16 = fArr[0] + r02.i;
                        l1 l1Var2 = r02.l;
                        float f17 = f16 - l1Var2.d;
                        float f18 = (fArr[1] + r02.j) - l1Var2.e;
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            o1 o1Var3 = (o1) arrayList.get(i14);
                            o1Var3.b(o1Var3.d + f17, o1Var3.e + f18);
                        }
                    }
                } else {
                    if (o1Var2.b) {
                        r02.d(false);
                    }
                    r02.k.b(fArr[0] + r02.i, fArr[1] + r02.j);
                }
                c1Var.getPainting().k(r02.h);
                w0Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                o1 o1Var4 = (o1) arrayList2.get(i15);
                if (o1Var4.c) {
                    fArr[r92] = f14;
                    fArr[i13] = f15;
                    if (o1Var4.b) {
                        r02.c(f14, f15, r92);
                    }
                    i12 = i13;
                    double a2 = ic.a(o1Var4.d, o1Var4.e, fArr[r92], fArr[i12]);
                    int dp = AndroidUtilities.dp(40.0f);
                    r33 = r92 == true ? 1 : 0;
                    if (a2 < dp && (o1Var == null || a2 < d)) {
                        o1Var = o1Var4;
                        d = a2;
                    }
                } else {
                    i12 = i13;
                    r33 = r92;
                }
                i15++;
                r92 = r33;
                i13 = i12;
            }
            int i16 = i13;
            boolean z12 = r92;
            fArr[z12 ? 1 : 0] = f14;
            fArr[i16] = f15;
            r02.c(f14, f15, z12);
            if (o1Var == null) {
                f1 f1Var = r02.h;
                if (f1Var != null) {
                    if (f1Var.a.o() == 0 || r02.h.a.o() == 2) {
                        f11 = f15;
                        f12 = f14;
                        double sqrt2 = Math.sqrt(Math.pow(f11 - r02.h.c, 2.0d) + Math.pow(f12 - r02.h.b, 2.0d));
                        f1 f1Var2 = r02.h;
                    } else if (r02.h.a.o() == i16 || r02.h.a.o() == 3) {
                        f1 f1Var3 = r02.h;
                        float f19 = f1Var3.b;
                        float f20 = f1Var3.d;
                        float f21 = f1Var3.f / 2.0f;
                        float f22 = (f19 - f20) - f21;
                        float f23 = f1Var3.c;
                        float f24 = f1Var3.e;
                        float f25 = (f23 - f24) - f21;
                        float f26 = f19 + f20 + f21;
                        float f27 = f23 + f24 + f21;
                        if (f15 > f25 && f15 < f27) {
                            if (f14 < f22) {
                                sqrt = f22 - f14;
                            } else {
                                if (f14 > f26) {
                                    sqrt = f14 - f26;
                                }
                                sqrt = 0.0f;
                            }
                            f13 = 30.0f;
                            if (r02.h.a.o() == 3) {
                            }
                        } else if (f14 >= f22 || f14 <= f26) {
                            double d10 = f14 - f22;
                            f13 = 30.0f;
                            double d11 = f15 - f25;
                            double d12 = f14 - f26;
                            double d13 = f15 - f27;
                            sqrt = (float) Math.sqrt(Math.min(Math.min(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d12, 2.0d)), Math.min(Math.pow(d13, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d13, 2.0d) + Math.pow(d12, 2.0d))));
                            if (r02.h.a.o() == 3) {
                                f1 f1Var4 = r02.h;
                                float a10 = p1.a(f14, f15, f1Var4.b, f1Var4.c, f1Var4.i, f1Var4.j);
                                f12 = f14;
                                f11 = f15;
                                sqrt = Math.min(sqrt, a10);
                            } else {
                                f12 = f14;
                                f11 = f15;
                            }
                        } else {
                            if (f15 < f25) {
                                sqrt = f25 - f15;
                            } else {
                                if (f15 > f27) {
                                    sqrt = f15 - f27;
                                }
                                sqrt = 0.0f;
                            }
                            f13 = 30.0f;
                            if (r02.h.a.o() == 3) {
                            }
                        }
                    } else if (r02.h.a.o() == 4) {
                        qw0 qw0Var = c1Var.getPainting().g;
                        f1 f1Var5 = r02.h;
                        float a11 = p1.a(f14, f15, f1Var5.b, f1Var5.c, f1Var5.i, f1Var5.j);
                        f1 f1Var6 = r02.h;
                        if (Math.min(a11, p1.a(f14, f15, f1Var6.d, f1Var6.e, f1Var6.i, f1Var6.j)) - (r02.h.f / 2.0f) < Math.min(qw0Var.a, qw0Var.b) * 0.1f) {
                            f12 = f14;
                            f11 = f15;
                        }
                    }
                }
                r02.e();
                return;
            }
            f11 = f15;
            f12 = f14;
            fArr[0] = f12;
            fArr[1] = f11;
            r02.k = o1Var;
            if (o1Var != null) {
                if (o1Var.b) {
                    r02.c(f12, f11, false);
                }
                o1 o1Var5 = r02.k;
                r02.i = o1Var5.d - fArr[0];
                r02.j = o1Var5.e - fArr[1];
                return;
            }
            l1 l1Var3 = r02.l;
            if (l1Var3 != null) {
                if (l1Var3.b) {
                    r02.c(f12, f11, false);
                }
                l1 l1Var4 = r02.l;
                r02.i = l1Var4.d - fArr[0];
                r02.j = l1Var4.e - fArr[1];
                return;
            }
            return;
        }
        final e0 e0Var = this.e;
        float scaleX = getScaleX();
        if (e0Var.x != null || e0Var.r != null) {
            return;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float height2 = e0Var.a.getHeight() - motionEvent.getY();
        float[] fArr2 = e0Var.u;
        fArr2[0] = x10;
        fArr2[1] = height2;
        e0Var.t.mapPoints(fArr2);
        float currentTimeMillis = System.currentTimeMillis() - e0Var.v;
        e0Var.w = ee.a(e0Var.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
        if (e0Var.a.getCurrentBrush() != null && (e0Var.a.getCurrentBrush() instanceof a)) {
            e0Var.w = 1.0f - e0Var.w;
        }
        e0Var.v = System.currentTimeMillis();
        float f28 = e0Var.w;
        if (motionEvent.getToolType(motionEvent.getActionIndex()) == 2) {
            f28 = Math.max(0.1f, e0.B.getInterpolation(motionEvent.getPressure()));
            if ((motionEvent.getButtonState() & 32) == 32) {
                z10 = true;
                if (e0Var.a.getCurrentBrush() != null) {
                    f28 = (AndroidUtilities.lerp(e0Var.a.getCurrentBrush().j(), 1.0f, ee.a(e0Var.o / 16.0f, 0.0f, 1.0f)) * (f28 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = e0Var.u;
                double d14 = fArr3[0];
                double d15 = fArr3[1];
                double d16 = f28;
                u0 u0Var = new u0(d14, d15, d16);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (e0Var.z) {
                            e0Var.z = false;
                            return;
                        }
                        e0Var.l = false;
                        e0Var.s.c();
                        AndroidUtilities.cancelRunOnUIThread(e0Var.y);
                        q0 painting = e0Var.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!e0Var.e) {
                                b1 b1Var2 = e0Var.a.a;
                                if (b1Var2 == null || b1Var2.d()) {
                                    u0Var.d = true;
                                    r0 r0Var = new r0();
                                    Vector vector = new Vector();
                                    r0Var.b = vector;
                                    vector.add(u0Var);
                                    e0Var.b(r0Var);
                                }
                                e0Var.n = 0;
                            } else if (e0Var.n > 0) {
                                e0Var.c(e0Var.a.getCurrentBrush().j(), true);
                                if (e0Var.a.getCurrentBrush() instanceof a) {
                                    final float f29 = e0Var.k;
                                    final u0 u0Var2 = e0Var.m[e0Var.n - 1];
                                    u0 u0Var3 = e0Var.h;
                                    double d17 = u0Var3 == null ? d16 : u0Var3.c;
                                    final float currentWeight = e0Var.a.getCurrentWeight() * ((float) d17) * 12.0f;
                                    ValueAnimator valueAnimator = e0Var.r;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    final float[] fArr4 = new float[1];
                                    final boolean[] zArr = new boolean[1];
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    e0Var.r = ofFloat;
                                    final double d18 = d17;
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rg.z
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            e0 e0Var2 = e0.this;
                                            e0Var2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d19 = f29;
                                            double cos = Math.cos(d19 - 2.5918139392115793d);
                                            double sin = Math.sin(d19 - 2.748893571891069d);
                                            u0 u0Var4 = u0Var2;
                                            double d20 = u0Var4.a;
                                            double d21 = currentWeight;
                                            double d22 = cos * d21;
                                            float[] fArr5 = fArr4;
                                            double d23 = fArr5[0];
                                            double d24 = (d22 * d23) + d20;
                                            double d25 = u0Var4.b;
                                            double d26 = sin * d21;
                                            double d27 = (d23 * d26) + d25;
                                            double d28 = d18;
                                            double d29 = floatValue;
                                            e0Var2.b(new r0(new u0[]{new u0(d24, d27, d28), new u0((d22 * d29) + d20, (d26 * d29) + d25, d28, 0)}));
                                            double cos2 = Math.cos(d19 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d19 + 2.748893571891069d);
                                            double d30 = u0Var4.a;
                                            double d31 = cos2 * d21;
                                            double d32 = fArr5[0];
                                            double d33 = sin2 * d21;
                                            e0Var2.b(new r0(new u0[]{new u0((d31 * d32) + d30, (d32 * d33) + d25, d28), new u0((d31 * d29) + d30, (d33 * d29) + d25, d28, 0)}));
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0] && floatValue > 0.4f) {
                                                zArr2[0] = true;
                                                BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                                            }
                                            fArr5[0] = floatValue;
                                        }
                                    });
                                    e0Var.r.addListener(new fc1(e0Var, 15));
                                    e0Var.r.setDuration(240L);
                                    e0Var.r.setInterpolator(ds.h);
                                    e0Var.r.start();
                                }
                            }
                            r72 = 0;
                            e0Var.a.getPainting().c(null, e0Var.a.getCurrentColor(), true, new a0(e0Var, 0 == true ? 1 : 0));
                            e0Var.n = r72;
                            e0Var.o = r72;
                            e0Var.j = r72;
                            e0Var.b = r72;
                            e0Var.p = 0.0d;
                            e0Var.q = 0.0d;
                            b1Var = e0Var.a.a;
                            if (b1Var == null) {
                                b1Var.e();
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
                        int i17 = 1;
                        ofFloat2.addUpdateListener(new l0(painting, i17));
                        painting.L.addListener(new p0(painting, i17));
                        painting.L.setInterpolator(ds.h);
                        painting.L.setDuration(350L);
                        painting.L.start();
                        BotWebViewVibrationEffect.IMPACT_RIGID.vibrate();
                        r72 = 0;
                        e0Var.n = r72;
                        e0Var.o = r72;
                        e0Var.j = r72;
                        e0Var.b = r72;
                        e0Var.p = 0.0d;
                        e0Var.q = 0.0d;
                        b1Var = e0Var.a.a;
                        if (b1Var == null) {
                        }
                    } else if (actionMasked2 != 2) {
                        if (actionMasked2 != 3) {
                            return;
                        }
                        if (e0Var.z) {
                            e0Var.z = false;
                            return;
                        }
                        e0Var.l = false;
                        e0Var.s.c();
                        q0 painting2 = e0Var.a.getPainting();
                        if (painting2.L != null) {
                            i11 = 1;
                        } else {
                            i11 = 1;
                            painting2.f.f(new m0(painting2, r62 == true ? 1 : 0, i11));
                        }
                        AndroidUtilities.cancelRunOnUIThread(e0Var.y);
                        q0 painting3 = e0Var.a.getPainting();
                        painting3.f.f(new n0(painting3, i11));
                        e0Var.n = 0;
                        e0Var.o = 0;
                        e0Var.j = false;
                        e0Var.b = false;
                        e0Var.p = 0.0d;
                        e0Var.q = 0.0d;
                        m mVar = e0Var.A;
                        if (mVar != null) {
                            e0Var.a.g(mVar);
                            e0Var.A = null;
                            return;
                        }
                        return;
                    }
                }
                if (e0Var.z) {
                    if (!e0Var.b) {
                        e0Var.b = true;
                        e0Var.e = false;
                        e0Var.c = true;
                        e0Var.g = u0Var;
                        e0Var.d = System.currentTimeMillis();
                        e0Var.m[0] = u0Var;
                        e0Var.n = 1;
                        e0Var.o = 1;
                        e0Var.j = false;
                        e0Var.f = true;
                        e0Var.l = true;
                        AndroidUtilities.runOnUIThread(e0Var.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a12 = u0Var.a(e0Var.g);
                    if (a12 < AndroidUtilities.dp(5.0f) / scaleX) {
                        return;
                    }
                    if (e0Var.l && (a12 > AndroidUtilities.dp(6.0f) / scaleX || e0Var.n > 4)) {
                        e0Var.l = false;
                        AndroidUtilities.cancelRunOnUIThread(e0Var.y);
                    }
                    if (!e0Var.e) {
                        b1 b1Var3 = e0Var.a.a;
                        if (b1Var3 != null) {
                            b1Var3.f();
                        }
                        e0Var.e = true;
                        if (z10 && (e0Var.a.getCurrentBrush() instanceof f)) {
                            e0Var.A = e0Var.a.getCurrentBrush();
                            e0Var.a.g((m) b10.h(1, m.a));
                        }
                    }
                    e0Var.m[e0Var.n] = u0Var;
                    if (e0Var.a.getPainting() == null || !e0Var.a.getPainting().G) {
                        f7 = a12;
                        if (System.currentTimeMillis() - e0Var.d > 3000) {
                            e0Var.s.c();
                            q0 painting4 = e0Var.a.getPainting();
                            if (painting4.L == null) {
                                painting4.f.f(new m0(painting4, r6 == true ? 1 : 0, 1));
                            }
                        } else if ((e0Var.a.getCurrentBrush() instanceof f) || (e0Var.a.getCurrentBrush() instanceof c)) {
                            k1 k1Var = e0Var.s;
                            boolean z13 = f7 > ((float) AndroidUtilities.dp(6.0f)) / scaleX;
                            synchronized (k1Var) {
                                k1Var.b.add(new h1(d14, d15));
                                z11 = k1Var.b.size() >= 8;
                            }
                            if (z11) {
                                DispatchQueue dispatchQueue = k1.m;
                                g1 g1Var = k1Var.l;
                                AtomicBoolean atomicBoolean = k1Var.k;
                                if (!k1Var.j.get()) {
                                    if (atomicBoolean.get() && !k1Var.d && z13) {
                                        dispatchQueue.cancelRunnable(g1Var);
                                        dispatchQueue.postRunnable(g1Var, 150L);
                                    }
                                    if (!atomicBoolean.get()) {
                                        r42 = 1;
                                        atomicBoolean.set(true);
                                        dispatchQueue.postRunnable(g1Var, 150L);
                                        i10 = e0Var.n + r42;
                                        e0Var.n = i10;
                                        e0Var.o += r42;
                                        if (i10 != 3) {
                                            u0[] u0VarArr = e0Var.m;
                                            u0 u0Var4 = u0VarArr[2];
                                            double d19 = u0Var4.b;
                                            u0 u0Var5 = u0VarArr[r42];
                                            float atan2 = (float) Math.atan2(d19 - u0Var5.b, u0Var4.a - u0Var5.a);
                                            if (e0Var.j) {
                                                float a13 = ee.a(f7 / (AndroidUtilities.dp(16.0f) / scaleX), 0.0f, 1.0f);
                                                if (a13 > 0.4f) {
                                                    double d20 = 1.0f - a13;
                                                    double d21 = e0Var.k;
                                                    double d22 = a13;
                                                    double d23 = atan2;
                                                    f10 = scaleX;
                                                    e0Var.k = (float) Math.atan2((Math.sin(d23) * d22) + (Math.sin(d21) * d20), org.telegram.messenger.t.a(d23, d22, Math.cos(d21) * d20));
                                                    e0Var.c(e0Var.a.getCurrentBrush().j(), false);
                                                }
                                            } else {
                                                e0Var.k = atan2;
                                                e0Var.j = r42;
                                            }
                                            f10 = scaleX;
                                            e0Var.c(e0Var.a.getCurrentBrush().j(), false);
                                        } else {
                                            f10 = scaleX;
                                        }
                                        e0Var.g = u0Var;
                                        if (f7 > AndroidUtilities.dp(8.0f) / f10) {
                                            e0Var.h = u0Var;
                                        }
                                        e0Var.w = ee.a((currentTimeMillis / 75.0f) + e0Var.w, 0.6f, 1.0f);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        f7 = a12;
                    }
                    r42 = 1;
                    i10 = e0Var.n + r42;
                    e0Var.n = i10;
                    e0Var.o += r42;
                    if (i10 != 3) {
                    }
                    e0Var.g = u0Var;
                    if (f7 > AndroidUtilities.dp(8.0f) / f10) {
                    }
                    e0Var.w = ee.a((currentTimeMillis / 75.0f) + e0Var.w, 0.6f, 1.0f);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (e0Var.a.getCurrentBrush() != null) {
        }
        float[] fArr32 = e0Var.u;
        double d142 = fArr32[0];
        double d152 = fArr32[1];
        double d162 = f28;
        u0 u0Var6 = new u0(d142, d152, d162);
        if (actionMasked2 != 0) {
        }
        if (e0Var.z) {
        }
    }

    public final void f(Runnable runnable) {
        a1 a1Var = this.d;
        if (a1Var == null) {
            return;
        }
        a1Var.postRunnable(new q6(26, this, runnable));
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

    public q0 getPainting() {
        return this.c;
    }

    public t1 getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.y = true;
        if (this.d != null) {
            f(new w0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        q0 q0Var = this.c;
        float width = q0Var != null ? getWidth() / q0Var.g.a : 1.0f;
        float f7 = width > 0.0f ? width : 1.0f;
        qw0 qw0Var = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f7, -f7);
        matrix.preTranslate((-qw0Var.a) / 2.0f, (-qw0Var.b) / 2.0f);
        if (this.x instanceof l) {
            p1 p1Var = this.f;
            p1Var.getClass();
            Matrix matrix2 = new Matrix();
            p1Var.o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.t = matrix3;
            matrix.invert(matrix3);
        }
        a1 a1Var = this.d;
        q0Var.y = wf.c(wf.b(a1Var.n, a1Var.r), wf.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.x instanceof l;
        p1 p1Var = this.f;
        if (z10) {
            p1Var.e();
        }
        this.x = mVar;
        i();
        this.c.q(this.x);
        m mVar2 = this.x;
        if (mVar2 instanceof l) {
            int o10 = ((l) mVar2).o();
            ArrayList arrayList = p1Var.n;
            ArrayList arrayList2 = p1Var.m;
            c1 c1Var = p1Var.a;
            if (c1Var == null || c1Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            p1Var.h = new f1(l.p(o10));
            qw0 qw0Var = c1Var.getPainting().g;
            f1 f1Var = p1Var.h;
            float f7 = qw0Var.a;
            f1Var.b = f7 / 2.0f;
            float f10 = qw0Var.b;
            f1Var.c = f10 / 2.0f;
            float min = Math.min(f7, f10) / 5.0f;
            f1Var.e = min;
            f1Var.d = min;
            p1Var.h.f = c1Var.getCurrentWeight();
            p1Var.h.g = AndroidUtilities.dp(32.0f);
            p1Var.h.l = s0.e(UserConfig.selectedAccount).k;
            if (p1Var.h.a.o() == 4) {
                f1 f1Var2 = p1Var.h;
                float f11 = qw0Var.a / 2.0f;
                f1Var2.d = f11;
                f1Var2.b = f11;
                f1Var2.i = f11 + 1.0f;
                float f12 = qw0Var.b;
                float f13 = f12 / 3.0f;
                float f14 = 1.0f * f13;
                f1Var2.c = f14;
                float f15 = f12 / 2.0f;
                f1Var2.j = f15;
                f1Var2.e = f13 * 2.0f;
                f1Var2.k = Math.abs(f14 - f15);
                l1 l1Var = new l1(p1Var, 0);
                arrayList2.add(l1Var);
                m1 m1Var = new m1(p1Var, l1Var, 0);
                arrayList2.add(m1Var);
                arrayList.add(m1Var);
                m1 m1Var2 = new m1(p1Var, l1Var, 1);
                arrayList2.add(m1Var2);
                arrayList.add(m1Var2);
            }
            if (p1Var.h.a.o() == 0) {
                arrayList2.add(new l1(p1Var, 1));
            }
            if (p1Var.h.a.o() == 2) {
                arrayList2.add(new l1(p1Var, 2));
            }
            if (p1Var.h.a.o() == 1 || p1Var.h.a.o() == 3) {
                arrayList2.add(new n1(p1Var, p1Var.h, false, false));
                arrayList2.add(new n1(p1Var, p1Var.h, true, false));
                arrayList2.add(new n1(p1Var, p1Var.h, false, true));
                arrayList2.add(new n1(p1Var, p1Var.h, true, true));
                arrayList2.add(new l1(p1Var, 3, false));
            }
            if (p1Var.h.a.o() == 3) {
                f1 f1Var3 = p1Var.h;
                f1Var3.i = (f1Var3.d * 0.8f) + f1Var3.b;
                f1Var3.j = (f1Var3.e * 1.2f) + f1Var3.c + f1Var3.f;
                l1 l1Var2 = new l1(p1Var, 4);
                arrayList2.add(l1Var2);
                l1Var2.b = false;
                arrayList.add(l1Var2);
            }
            p1Var.l = new l1(p1Var, 5, false);
            if (p1Var.h.a.o() != 4) {
                p1Var.l.c = false;
            }
            l1 l1Var3 = p1Var.l;
            l1Var3.b = false;
            arrayList.add(l1Var3);
            arrayList2.add(p1Var.l);
            c1Var.getPainting().k(p1Var.h);
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.c.g.a;
        this.v = c3.h0.u(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.x instanceof l) {
            p1 p1Var = this.f;
            c1 c1Var = p1Var.a;
            f1 f1Var = p1Var.h;
            if (f1Var == null || f1Var.f == c1Var.getCurrentWeight()) {
                return;
            }
            p1Var.h.f = c1Var.getCurrentWeight();
            c1Var.getPainting().k(p1Var.h);
        }
    }

    public void setColor(int i10) {
        this.w = i10;
        if (this.x instanceof l) {
            p1 p1Var = this.f;
            if (p1Var.h != null) {
                p1Var.a.getPainting().k(p1Var.h);
            }
        }
    }

    public void setDelegate(b1 b1Var) {
        this.a = b1Var;
    }

    public void setUndoStore(t1 t1Var) {
        this.b = t1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
