package pg;

import ai.b8;
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
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.wq0;
import v7.z6;
import w7.k6;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public class d1 extends TextureView {
    public c1 a;
    public u1 b;
    public final r0 c;
    public b1 d;
    public final d0 e;
    public final q1 f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float v;
    public int w;
    public m x;
    public boolean y;

    public d1(Context context, r0 r0Var, Bitmap bitmap, Bitmap bitmap2, ja jaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = r0Var;
        r0Var.f = this;
        setSurfaceTextureListener(new z0(this, jaVar));
        this.e = new d0(this);
        x0 x0Var = new x0(this, 0);
        q1 q1Var = new q1();
        Paint paint = new Paint(1);
        q1Var.c = paint;
        Paint paint2 = new Paint(1);
        q1Var.d = paint2;
        Paint paint3 = new Paint(1);
        q1Var.e = paint3;
        Paint paint4 = new Paint(1);
        q1Var.f = paint4;
        Paint paint5 = new Paint(1);
        q1Var.g = paint5;
        q1Var.m = new ArrayList();
        q1Var.n = new ArrayList();
        q1Var.p = new float[2];
        q1Var.a = this;
        q1Var.b = x0Var;
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
        this.f = q1Var;
        r0Var.a = new k2.u(this, 18);
    }

    public final void a() {
        x0 x0Var = new x0(this, 2);
        d0 d0Var = this.e;
        d0Var.g = new v0(d0Var.a.getPainting().g.a, 0.0d, 1.0d);
        d0Var.l = true;
        d0Var.a(new d(), false, x0Var);
    }

    public final void b() {
        d1 d1Var;
        q1 q1Var = this.f;
        if (q1Var == null || (d1Var = q1Var.a) == null || d1Var.getPainting() == null || q1Var.h == null) {
            return;
        }
        r0 painting = d1Var.getPainting();
        painting.f.f(new o0(painting, 0));
        q1Var.m.clear();
        q1Var.n.clear();
        q1Var.h = null;
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.x instanceof l) {
            this.f.e();
        }
        b1 b1Var = this.d;
        if (b1Var == null || !b1Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            b1Var.postRunnable(new b8(b1Var, z10, z11, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.x instanceof l) {
            q1 q1Var = this.f;
            Paint paint = q1Var.c;
            ArrayList arrayList = q1Var.m;
            d1 d1Var = q1Var.a;
            if (d1Var == null || d1Var.getPainting() == null) {
                return;
            }
            jv0 jv0Var = d1Var.getPainting().g;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                p1 p1Var = (p1) arrayList.get(i10);
                if (p1Var.c && !p1Var.b) {
                    q1Var.b(canvas, jv0Var, p1Var);
                }
            }
            g1 g1Var = q1Var.h;
            if (g1Var != null && g1Var.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r1.h) / 3.141592653589793d) * 180.0d), (q1Var.h.b / jv0Var.a) * canvas.getWidth(), (q1Var.h.c / jv0Var.b) * canvas.getHeight());
            }
            g1 g1Var2 = q1Var.h;
            if (g1Var2 == null || g1Var2.a.o() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (q1Var.h.b / jv0Var.a), canvas.getHeight() * (q1Var.h.c / jv0Var.b), canvas.getWidth() * (q1Var.h.i / jv0Var.a), canvas.getHeight() * (q1Var.h.j / jv0Var.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (q1Var.h.d / jv0Var.a), canvas2.getHeight() * (q1Var.h.e / jv0Var.b), canvas2.getWidth() * (q1Var.h.i / jv0Var.a), canvas2.getHeight() * (q1Var.h.j / jv0Var.b), paint);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                p1 p1Var2 = (p1) arrayList.get(i11);
                if (p1Var2.c && p1Var2.b) {
                    q1Var.b(canvas2, jv0Var, p1Var2);
                }
            }
            g1 g1Var3 = q1Var.h;
            if (g1Var3 == null || g1Var3.h == 0.0f) {
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
        b1 b1Var;
        boolean z10;
        float f7;
        boolean z11;
        ?? r42;
        int i10;
        float f10;
        ?? r72;
        c1 c1Var;
        int i11;
        float f11;
        float f12;
        float f13;
        float sqrt;
        char c10 = 1;
        if (motionEvent.getPointerCount() > 1 || (b1Var = this.d) == null || !b1Var.f || !b1Var.h) {
            return;
        }
        p1 p1Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        ?? r92 = 0;
        if (this.x instanceof l) {
            q1 q1Var = this.f;
            getScaleX();
            ArrayList arrayList = q1Var.n;
            ArrayList arrayList2 = q1Var.m;
            x0 x0Var = q1Var.b;
            float[] fArr = q1Var.p;
            d1 d1Var = q1Var.a;
            if (d1Var == null || d1Var.getPainting() == null || q1Var.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX();
            float height = d1Var.getHeight() - motionEvent.getY();
            fArr[0] = x10;
            fArr[1] = height;
            q1Var.o.mapPoints(fArr);
            float f14 = fArr[0];
            float f15 = fArr[1];
            x0Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        q1Var.k = null;
                        return;
                    }
                    return;
                }
                p1 p1Var2 = q1Var.k;
                if (p1Var2 == null) {
                    m1 m1Var = q1Var.l;
                    if (m1Var != null) {
                        if (m1Var.b) {
                            q1Var.c(f14, f15, false);
                        }
                        float f16 = fArr[0] + q1Var.i;
                        m1 m1Var2 = q1Var.l;
                        float f17 = f16 - m1Var2.d;
                        float f18 = (fArr[1] + q1Var.j) - m1Var2.e;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            p1 p1Var3 = (p1) arrayList.get(i12);
                            p1Var3.b(p1Var3.d + f17, p1Var3.e + f18);
                        }
                    }
                } else {
                    if (p1Var2.b) {
                        q1Var.d(false);
                    }
                    q1Var.k.b(fArr[0] + q1Var.i, fArr[1] + q1Var.j);
                }
                d1Var.getPainting().k(q1Var.h);
                x0Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                p1 p1Var4 = (p1) arrayList2.get(i13);
                if (p1Var4.c) {
                    fArr[r92] = f14;
                    fArr[c10] = f15;
                    if (p1Var4.b) {
                        q1Var.c(f14, f15, r92);
                    }
                    double a2 = z6.a(p1Var4.d, p1Var4.e, fArr[r92], fArr[1]);
                    if (a2 < AndroidUtilities.dp(40.0f) && (p1Var == null || a2 < d)) {
                        p1Var = p1Var4;
                        d = a2;
                    }
                }
                i13++;
                c10 = 1;
                r92 = 0;
            }
            fArr[0] = f14;
            fArr[1] = f15;
            q1Var.c(f14, f15, false);
            if (p1Var == null) {
                g1 g1Var = q1Var.h;
                if (g1Var != null) {
                    if (g1Var.a.o() == 0 || q1Var.h.a.o() == 2) {
                        f11 = f15;
                        f12 = f14;
                        double sqrt2 = Math.sqrt(Math.pow(f11 - q1Var.h.c, 2.0d) + Math.pow(f12 - q1Var.h.b, 2.0d));
                        g1 g1Var2 = q1Var.h;
                    } else if (q1Var.h.a.o() == 1 || q1Var.h.a.o() == 3) {
                        g1 g1Var3 = q1Var.h;
                        float f19 = g1Var3.b;
                        float f20 = g1Var3.d;
                        float f21 = g1Var3.f / 2.0f;
                        float f22 = (f19 - f20) - f21;
                        float f23 = g1Var3.c;
                        float f24 = g1Var3.e;
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
                            if (q1Var.h.a.o() == 3) {
                            }
                        } else if (f14 >= f22 || f14 <= f26) {
                            double d10 = f14 - f22;
                            f13 = 30.0f;
                            double d11 = f15 - f25;
                            double d12 = f14 - f26;
                            double d13 = f15 - f27;
                            sqrt = (float) Math.sqrt(Math.min(Math.min(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d12, 2.0d)), Math.min(Math.pow(d13, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d13, 2.0d) + Math.pow(d12, 2.0d))));
                            if (q1Var.h.a.o() == 3) {
                                g1 g1Var4 = q1Var.h;
                                float a10 = q1.a(f14, f15, g1Var4.b, g1Var4.c, g1Var4.i, g1Var4.j);
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
                            if (q1Var.h.a.o() == 3) {
                            }
                        }
                    } else if (q1Var.h.a.o() == 4) {
                        jv0 jv0Var = d1Var.getPainting().g;
                        g1 g1Var5 = q1Var.h;
                        float a11 = q1.a(f14, f15, g1Var5.b, g1Var5.c, g1Var5.i, g1Var5.j);
                        g1 g1Var6 = q1Var.h;
                        if (Math.min(a11, q1.a(f14, f15, g1Var6.d, g1Var6.e, g1Var6.i, g1Var6.j)) - (q1Var.h.f / 2.0f) < Math.min(jv0Var.a, jv0Var.b) * 0.1f) {
                            f12 = f14;
                            f11 = f15;
                        }
                    }
                }
                q1Var.e();
                return;
            }
            f11 = f15;
            f12 = f14;
            fArr[0] = f12;
            fArr[1] = f11;
            q1Var.k = p1Var;
            if (p1Var != null) {
                if (p1Var.b) {
                    q1Var.c(f12, f11, false);
                }
                p1 p1Var5 = q1Var.k;
                q1Var.i = p1Var5.d - fArr[0];
                q1Var.j = p1Var5.e - fArr[1];
                return;
            }
            m1 m1Var3 = q1Var.l;
            if (m1Var3 != null) {
                if (m1Var3.b) {
                    q1Var.c(f12, f11, false);
                }
                m1 m1Var4 = q1Var.l;
                q1Var.i = m1Var4.d - fArr[0];
                q1Var.j = m1Var4.e - fArr[1];
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
        float x11 = motionEvent.getX();
        float height2 = d0Var.a.getHeight() - motionEvent.getY();
        float[] fArr2 = d0Var.u;
        fArr2[0] = x11;
        fArr2[1] = height2;
        d0Var.t.mapPoints(fArr2);
        float currentTimeMillis = System.currentTimeMillis() - d0Var.v;
        d0Var.w = w7.p.a(d0Var.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
        if (d0Var.a.getCurrentBrush() != null && (d0Var.a.getCurrentBrush() instanceof a)) {
            d0Var.w = 1.0f - d0Var.w;
        }
        d0Var.v = System.currentTimeMillis();
        float f28 = d0Var.w;
        if (motionEvent.getToolType(motionEvent.getActionIndex()) == 2) {
            f28 = Math.max(0.1f, d0.B.getInterpolation(motionEvent.getPressure()));
            if ((motionEvent.getButtonState() & 32) == 32) {
                z10 = true;
                if (d0Var.a.getCurrentBrush() != null) {
                    f28 = (AndroidUtilities.lerp(d0Var.a.getCurrentBrush().j(), 1.0f, w7.p.a(d0Var.o / 16.0f, 0.0f, 1.0f)) * (f28 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = d0Var.u;
                double d14 = fArr3[0];
                double d15 = fArr3[1];
                double d16 = f28;
                v0 v0Var = new v0(d14, d15, d16);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (d0Var.z) {
                            d0Var.z = false;
                            return;
                        }
                        d0Var.l = false;
                        d0Var.s.c();
                        AndroidUtilities.cancelRunOnUIThread(d0Var.y);
                        r0 painting = d0Var.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!d0Var.e) {
                                c1 c1Var2 = d0Var.a.a;
                                if (c1Var2 == null || c1Var2.d()) {
                                    v0Var.d = true;
                                    s0 s0Var = new s0();
                                    Vector vector = new Vector();
                                    s0Var.b = vector;
                                    vector.add(v0Var);
                                    d0Var.b(s0Var);
                                }
                                d0Var.n = 0;
                            } else if (d0Var.n > 0) {
                                d0Var.c(d0Var.a.getCurrentBrush().j(), true);
                                if (d0Var.a.getCurrentBrush() instanceof a) {
                                    final float f29 = d0Var.k;
                                    final v0 v0Var2 = d0Var.m[d0Var.n - 1];
                                    v0 v0Var3 = d0Var.h;
                                    double d17 = v0Var3 == null ? d16 : v0Var3.c;
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
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pg.y
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            d0 d0Var2 = d0.this;
                                            d0Var2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d19 = f29;
                                            double cos = Math.cos(d19 - 2.5918139392115793d);
                                            double sin = Math.sin(d19 - 2.748893571891069d);
                                            v0 v0Var4 = v0Var2;
                                            double d20 = v0Var4.a;
                                            double d21 = currentWeight;
                                            double d22 = cos * d21;
                                            float[] fArr5 = fArr4;
                                            double d23 = fArr5[0];
                                            double d24 = (d22 * d23) + d20;
                                            double d25 = v0Var4.b;
                                            double d26 = sin * d21;
                                            double d27 = (d23 * d26) + d25;
                                            double d28 = d18;
                                            double d29 = floatValue;
                                            d0Var2.b(new s0(new v0[]{new v0(d24, d27, d28), new v0((d22 * d29) + d20, (d26 * d29) + d25, d28, 0)}));
                                            double cos2 = Math.cos(d19 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d19 + 2.748893571891069d);
                                            double d30 = v0Var4.a;
                                            double d31 = cos2 * d21;
                                            double d32 = fArr5[0];
                                            double d33 = sin2 * d21;
                                            d0Var2.b(new s0(new v0[]{new v0((d31 * d32) + d30, (d32 * d33) + d25, d28), new v0((d31 * d29) + d30, (d33 * d29) + d25, d28, 0)}));
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0] && floatValue > 0.4f) {
                                                zArr2[0] = true;
                                                BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                                            }
                                            fArr5[0] = floatValue;
                                        }
                                    });
                                    d0Var.r.addListener(new wq0(d0Var, 29));
                                    d0Var.r.setDuration(240L);
                                    d0Var.r.setInterpolator(rr.h);
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
                            c1Var = d0Var.a.a;
                            if (c1Var == null) {
                                c1Var.e();
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
                        ofFloat2.addUpdateListener(new m0(painting, i14));
                        painting.L.addListener(new q0(painting, i14));
                        painting.L.setInterpolator(rr.h);
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
                        c1Var = d0Var.a.a;
                        if (c1Var == null) {
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
                        r0 painting2 = d0Var.a.getPainting();
                        if (painting2.L != null) {
                            i11 = 1;
                        } else {
                            i11 = 1;
                            painting2.f.f(new n0(painting2, objArr2 == true ? 1 : 0, i11));
                        }
                        AndroidUtilities.cancelRunOnUIThread(d0Var.y);
                        r0 painting3 = d0Var.a.getPainting();
                        painting3.f.f(new o0(painting3, i11));
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
                        d0Var.g = v0Var;
                        d0Var.d = System.currentTimeMillis();
                        d0Var.m[0] = v0Var;
                        d0Var.n = 1;
                        d0Var.o = 1;
                        d0Var.j = false;
                        d0Var.f = true;
                        d0Var.l = true;
                        AndroidUtilities.runOnUIThread(d0Var.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a12 = v0Var.a(d0Var.g);
                    if (a12 < AndroidUtilities.dp(5.0f) / scaleX) {
                        return;
                    }
                    if (d0Var.l && (a12 > AndroidUtilities.dp(6.0f) / scaleX || d0Var.n > 4)) {
                        d0Var.l = false;
                        AndroidUtilities.cancelRunOnUIThread(d0Var.y);
                    }
                    if (!d0Var.e) {
                        c1 c1Var3 = d0Var.a.a;
                        if (c1Var3 != null) {
                            c1Var3.f();
                        }
                        d0Var.e = true;
                        if (z10 && (d0Var.a.getCurrentBrush() instanceof f)) {
                            d0Var.A = d0Var.a.getCurrentBrush();
                            d0Var.a.g((m) q3.g(1, m.a));
                        }
                    }
                    d0Var.m[d0Var.n] = v0Var;
                    if (d0Var.a.getPainting() == null || !d0Var.a.getPainting().G) {
                        f7 = a12;
                        if (System.currentTimeMillis() - d0Var.d > 3000) {
                            d0Var.s.c();
                            r0 painting4 = d0Var.a.getPainting();
                            if (painting4.L == null) {
                                painting4.f.f(new n0(painting4, objArr == true ? 1 : 0, 1));
                            }
                        } else if ((d0Var.a.getCurrentBrush() instanceof f) || (d0Var.a.getCurrentBrush() instanceof c)) {
                            l1 l1Var = d0Var.s;
                            boolean z12 = f7 > ((float) AndroidUtilities.dp(6.0f)) / scaleX;
                            synchronized (l1Var) {
                                l1Var.b.add(new i1(d14, d15));
                                z11 = l1Var.b.size() >= 8;
                            }
                            if (z11) {
                                DispatchQueue dispatchQueue = l1.m;
                                h1 h1Var = l1Var.l;
                                AtomicBoolean atomicBoolean = l1Var.k;
                                if (!l1Var.j.get()) {
                                    if (atomicBoolean.get() && !l1Var.d && z12) {
                                        dispatchQueue.cancelRunnable(h1Var);
                                        dispatchQueue.postRunnable(h1Var, 150L);
                                    }
                                    if (!atomicBoolean.get()) {
                                        r42 = 1;
                                        atomicBoolean.set(true);
                                        dispatchQueue.postRunnable(h1Var, 150L);
                                        i10 = d0Var.n + r42;
                                        d0Var.n = i10;
                                        d0Var.o += r42;
                                        if (i10 != 3) {
                                            v0[] v0VarArr = d0Var.m;
                                            v0 v0Var4 = v0VarArr[2];
                                            double d19 = v0Var4.b;
                                            v0 v0Var5 = v0VarArr[r42];
                                            float atan2 = (float) Math.atan2(d19 - v0Var5.b, v0Var4.a - v0Var5.a);
                                            if (d0Var.j) {
                                                float a13 = w7.p.a(f7 / (AndroidUtilities.dp(16.0f) / scaleX), 0.0f, 1.0f);
                                                if (a13 > 0.4f) {
                                                    double d20 = 1.0f - a13;
                                                    double d21 = d0Var.k;
                                                    double d22 = a13;
                                                    double d23 = atan2;
                                                    f10 = scaleX;
                                                    d0Var.k = (float) Math.atan2((Math.sin(d23) * d22) + (Math.sin(d21) * d20), hg.c.e(d23, d22, Math.cos(d21) * d20));
                                                    d0Var.c(d0Var.a.getCurrentBrush().j(), false);
                                                }
                                            } else {
                                                d0Var.k = atan2;
                                                d0Var.j = r42;
                                            }
                                            f10 = scaleX;
                                            d0Var.c(d0Var.a.getCurrentBrush().j(), false);
                                        } else {
                                            f10 = scaleX;
                                        }
                                        d0Var.g = v0Var;
                                        if (f7 > AndroidUtilities.dp(8.0f) / f10) {
                                            d0Var.h = v0Var;
                                        }
                                        d0Var.w = w7.p.a((currentTimeMillis / 75.0f) + d0Var.w, 0.6f, 1.0f);
                                        return;
                                    }
                                }
                            }
                        }
                    } else {
                        f7 = a12;
                    }
                    r42 = 1;
                    i10 = d0Var.n + r42;
                    d0Var.n = i10;
                    d0Var.o += r42;
                    if (i10 != 3) {
                    }
                    d0Var.g = v0Var;
                    if (f7 > AndroidUtilities.dp(8.0f) / f10) {
                    }
                    d0Var.w = w7.p.a((currentTimeMillis / 75.0f) + d0Var.w, 0.6f, 1.0f);
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
        double d162 = f28;
        v0 v0Var6 = new v0(d142, d152, d162);
        if (actionMasked2 != 0) {
        }
        if (d0Var.z) {
        }
    }

    public final void f(Runnable runnable) {
        b1 b1Var = this.d;
        if (b1Var == null) {
            return;
        }
        b1Var.postRunnable(new p2.b(2, this, runnable));
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

    public r0 getPainting() {
        return this.c;
    }

    public u1 getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.y = true;
        if (this.d != null) {
            f(new x0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        r0 r0Var = this.c;
        float width = r0Var != null ? getWidth() / r0Var.g.a : 1.0f;
        float f7 = width > 0.0f ? width : 1.0f;
        jv0 jv0Var = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f7, -f7);
        matrix.preTranslate((-jv0Var.a) / 2.0f, (-jv0Var.b) / 2.0f);
        if (this.x instanceof l) {
            q1 q1Var = this.f;
            q1Var.getClass();
            Matrix matrix2 = new Matrix();
            q1Var.o = matrix2;
            matrix.invert(matrix2);
        } else {
            d0 d0Var = this.e;
            d0Var.getClass();
            Matrix matrix3 = new Matrix();
            d0Var.t = matrix3;
            matrix.invert(matrix3);
        }
        b1 b1Var = this.d;
        r0Var.y = k6.c(k6.b(b1Var.n, b1Var.r), k6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.x instanceof l;
        q1 q1Var = this.f;
        if (z10) {
            q1Var.e();
        }
        this.x = mVar;
        i();
        this.c.q(this.x);
        m mVar2 = this.x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = q1Var.n;
            ArrayList arrayList2 = q1Var.m;
            d1 d1Var = q1Var.a;
            if (d1Var == null || d1Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            q1Var.h = new g1(l.p(o9));
            jv0 jv0Var = d1Var.getPainting().g;
            g1 g1Var = q1Var.h;
            float f7 = jv0Var.a;
            g1Var.b = f7 / 2.0f;
            float f10 = jv0Var.b;
            g1Var.c = f10 / 2.0f;
            float min = Math.min(f7, f10) / 5.0f;
            g1Var.e = min;
            g1Var.d = min;
            q1Var.h.f = d1Var.getCurrentWeight();
            q1Var.h.g = AndroidUtilities.dp(32.0f);
            q1Var.h.l = t0.e(UserConfig.selectedAccount).k;
            if (q1Var.h.a.o() == 4) {
                g1 g1Var2 = q1Var.h;
                float f11 = jv0Var.a / 2.0f;
                g1Var2.d = f11;
                g1Var2.b = f11;
                g1Var2.i = f11 + 1.0f;
                float f12 = jv0Var.b;
                float f13 = f12 / 3.0f;
                float f14 = 1.0f * f13;
                g1Var2.c = f14;
                float f15 = f12 / 2.0f;
                g1Var2.j = f15;
                g1Var2.e = f13 * 2.0f;
                g1Var2.k = Math.abs(f14 - f15);
                m1 m1Var = new m1(q1Var, 0);
                arrayList2.add(m1Var);
                n1 n1Var = new n1(q1Var, m1Var, 0);
                arrayList2.add(n1Var);
                arrayList.add(n1Var);
                n1 n1Var2 = new n1(q1Var, m1Var, 1);
                arrayList2.add(n1Var2);
                arrayList.add(n1Var2);
            }
            if (q1Var.h.a.o() == 0) {
                arrayList2.add(new m1(q1Var, 1));
            }
            if (q1Var.h.a.o() == 2) {
                arrayList2.add(new m1(q1Var, 2));
            }
            if (q1Var.h.a.o() == 1 || q1Var.h.a.o() == 3) {
                arrayList2.add(new o1(q1Var, q1Var.h, false, false));
                arrayList2.add(new o1(q1Var, q1Var.h, true, false));
                arrayList2.add(new o1(q1Var, q1Var.h, false, true));
                arrayList2.add(new o1(q1Var, q1Var.h, true, true));
                arrayList2.add(new m1(q1Var, 3, false));
            }
            if (q1Var.h.a.o() == 3) {
                g1 g1Var3 = q1Var.h;
                g1Var3.i = (g1Var3.d * 0.8f) + g1Var3.b;
                g1Var3.j = (g1Var3.e * 1.2f) + g1Var3.c + g1Var3.f;
                m1 m1Var2 = new m1(q1Var, 4);
                arrayList2.add(m1Var2);
                m1Var2.b = false;
                arrayList.add(m1Var2);
            }
            q1Var.l = new m1(q1Var, 5, false);
            if (q1Var.h.a.o() != 4) {
                q1Var.l.c = false;
            }
            m1 m1Var3 = q1Var.l;
            m1Var3.b = false;
            arrayList.add(m1Var3);
            arrayList2.add(q1Var.l);
            d1Var.getPainting().k(q1Var.h);
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.c.g.a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.x instanceof l) {
            q1 q1Var = this.f;
            d1 d1Var = q1Var.a;
            g1 g1Var = q1Var.h;
            if (g1Var == null || g1Var.f == d1Var.getCurrentWeight()) {
                return;
            }
            q1Var.h.f = d1Var.getCurrentWeight();
            d1Var.getPainting().k(q1Var.h);
        }
    }

    public void setColor(int i10) {
        this.w = i10;
        if (this.x instanceof l) {
            q1 q1Var = this.f;
            if (q1Var.h != null) {
                q1Var.a.getPainting().k(q1Var.h);
            }
        }
    }

    public void setDelegate(c1 c1Var) {
        this.a = c1Var;
    }

    public void setUndoStore(u1 u1Var) {
        this.b = u1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
