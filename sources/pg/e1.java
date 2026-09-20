package pg;

import ai.z7;
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
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.uv0;
import v7.a7;
import w7.m6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public class e1 extends TextureView {
    public d1 a;
    public v1 b;
    public final s0 c;
    public c1 d;
    public final e0 e;
    public final r1 f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float v;
    public int w;
    public m x;
    public boolean y;

    public e1(Context context, s0 s0Var, Bitmap bitmap, Bitmap bitmap2, ia iaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = s0Var;
        s0Var.f = this;
        setSurfaceTextureListener(new a1(this, iaVar));
        this.e = new e0(this);
        y0 y0Var = new y0(this, 0);
        r1 r1Var = new r1();
        Paint paint = new Paint(1);
        r1Var.c = paint;
        Paint paint2 = new Paint(1);
        r1Var.d = paint2;
        Paint paint3 = new Paint(1);
        r1Var.e = paint3;
        Paint paint4 = new Paint(1);
        r1Var.f = paint4;
        Paint paint5 = new Paint(1);
        r1Var.g = paint5;
        r1Var.m = new ArrayList();
        r1Var.n = new ArrayList();
        r1Var.p = new float[2];
        r1Var.a = this;
        r1Var.b = y0Var;
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
        this.f = r1Var;
        s0Var.a = new n2.e(this, 13);
    }

    public final void a() {
        y0 y0Var = new y0(this, 2);
        e0 e0Var = this.e;
        e0Var.g = new w0(e0Var.a.getPainting().g.a, 0.0d, 1.0d);
        e0Var.l = true;
        e0Var.a(new d(), false, y0Var);
    }

    public final void b() {
        e1 e1Var;
        r1 r1Var = this.f;
        if (r1Var == null || (e1Var = r1Var.a) == null || e1Var.getPainting() == null || r1Var.h == null) {
            return;
        }
        s0 painting = e1Var.getPainting();
        painting.f.f(new p0(painting, 0));
        r1Var.m.clear();
        r1Var.n.clear();
        r1Var.h = null;
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.x instanceof l) {
            this.f.e();
        }
        c1 c1Var = this.d;
        if (c1Var == null || !c1Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            c1Var.postRunnable(new z7(c1Var, z10, z11, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.x instanceof l) {
            r1 r1Var = this.f;
            Paint paint = r1Var.c;
            ArrayList arrayList = r1Var.m;
            e1 e1Var = r1Var.a;
            if (e1Var == null || e1Var.getPainting() == null) {
                return;
            }
            uv0 uv0Var = e1Var.getPainting().g;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                q1 q1Var = (q1) arrayList.get(i10);
                if (q1Var.c && !q1Var.b) {
                    r1Var.b(canvas, uv0Var, q1Var);
                }
            }
            h1 h1Var = r1Var.h;
            if (h1Var != null && h1Var.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r1.h) / 3.141592653589793d) * 180.0d), (r1Var.h.b / uv0Var.a) * canvas.getWidth(), (r1Var.h.c / uv0Var.b) * canvas.getHeight());
            }
            h1 h1Var2 = r1Var.h;
            if (h1Var2 == null || h1Var2.a.o() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (r1Var.h.b / uv0Var.a), canvas.getHeight() * (r1Var.h.c / uv0Var.b), canvas.getWidth() * (r1Var.h.i / uv0Var.a), canvas.getHeight() * (r1Var.h.j / uv0Var.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (r1Var.h.d / uv0Var.a), canvas2.getHeight() * (r1Var.h.e / uv0Var.b), canvas2.getWidth() * (r1Var.h.i / uv0Var.a), canvas2.getHeight() * (r1Var.h.j / uv0Var.b), paint);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                q1 q1Var2 = (q1) arrayList.get(i11);
                if (q1Var2.c && q1Var2.b) {
                    r1Var.b(canvas2, uv0Var, q1Var2);
                }
            }
            h1 h1Var3 = r1Var.h;
            if (h1Var3 == null || h1Var3.h == 0.0f) {
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
    /* JADX WARN: Removed duplicated region for block: B:196:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:307:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021b  */
    /* JADX WARN: Type inference failed for: r4v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MotionEvent motionEvent) {
        c1 c1Var;
        boolean z10;
        float f7;
        boolean z11;
        ?? r42;
        int i10;
        float f10;
        ?? r72;
        d1 d1Var;
        int i11;
        float f11;
        float f12;
        float f13;
        float sqrt;
        char c10 = 1;
        if (motionEvent.getPointerCount() > 1 || (c1Var = this.d) == null || !c1Var.f || !c1Var.h) {
            return;
        }
        q1 q1Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        ?? r92 = 0;
        if (this.x instanceof l) {
            r1 r1Var = this.f;
            getScaleX();
            ArrayList arrayList = r1Var.n;
            ArrayList arrayList2 = r1Var.m;
            y0 y0Var = r1Var.b;
            float[] fArr = r1Var.p;
            e1 e1Var = r1Var.a;
            if (e1Var == null || e1Var.getPainting() == null || r1Var.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX();
            float height = e1Var.getHeight() - motionEvent.getY();
            fArr[0] = x10;
            fArr[1] = height;
            r1Var.o.mapPoints(fArr);
            float f14 = fArr[0];
            float f15 = fArr[1];
            y0Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        r1Var.k = null;
                        return;
                    }
                    return;
                }
                q1 q1Var2 = r1Var.k;
                if (q1Var2 == null) {
                    n1 n1Var = r1Var.l;
                    if (n1Var != null) {
                        if (n1Var.b) {
                            r1Var.c(f14, f15, false);
                        }
                        float f16 = fArr[0] + r1Var.i;
                        n1 n1Var2 = r1Var.l;
                        float f17 = f16 - n1Var2.d;
                        float f18 = (fArr[1] + r1Var.j) - n1Var2.e;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            q1 q1Var3 = (q1) arrayList.get(i12);
                            q1Var3.b(q1Var3.d + f17, q1Var3.e + f18);
                        }
                    }
                } else {
                    if (q1Var2.b) {
                        r1Var.d(false);
                    }
                    r1Var.k.b(fArr[0] + r1Var.i, fArr[1] + r1Var.j);
                }
                e1Var.getPainting().k(r1Var.h);
                y0Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                q1 q1Var4 = (q1) arrayList2.get(i13);
                if (q1Var4.c) {
                    fArr[r92] = f14;
                    fArr[c10] = f15;
                    if (q1Var4.b) {
                        r1Var.c(f14, f15, r92);
                    }
                    double a2 = a7.a(q1Var4.d, q1Var4.e, fArr[r92], fArr[1]);
                    if (a2 < AndroidUtilities.dp(40.0f) && (q1Var == null || a2 < d)) {
                        q1Var = q1Var4;
                        d = a2;
                    }
                }
                i13++;
                c10 = 1;
                r92 = 0;
            }
            fArr[0] = f14;
            fArr[1] = f15;
            r1Var.c(f14, f15, false);
            if (q1Var == null) {
                h1 h1Var = r1Var.h;
                if (h1Var != null) {
                    if (h1Var.a.o() == 0 || r1Var.h.a.o() == 2) {
                        f11 = f15;
                        f12 = f14;
                        double sqrt2 = Math.sqrt(Math.pow(f11 - r1Var.h.c, 2.0d) + Math.pow(f12 - r1Var.h.b, 2.0d));
                        h1 h1Var2 = r1Var.h;
                    } else if (r1Var.h.a.o() == 1 || r1Var.h.a.o() == 3) {
                        h1 h1Var3 = r1Var.h;
                        float f19 = h1Var3.b;
                        float f20 = h1Var3.d;
                        float f21 = h1Var3.f / 2.0f;
                        float f22 = (f19 - f20) - f21;
                        float f23 = h1Var3.c;
                        float f24 = h1Var3.e;
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
                            if (r1Var.h.a.o() == 3) {
                            }
                        } else if (f14 >= f22 || f14 <= f26) {
                            double d10 = f14 - f22;
                            f13 = 30.0f;
                            double d11 = f15 - f25;
                            double d12 = f14 - f26;
                            double d13 = f15 - f27;
                            sqrt = (float) Math.sqrt(Math.min(Math.min(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d12, 2.0d)), Math.min(Math.pow(d13, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d13, 2.0d) + Math.pow(d12, 2.0d))));
                            if (r1Var.h.a.o() == 3) {
                                h1 h1Var4 = r1Var.h;
                                float a10 = r1.a(f14, f15, h1Var4.b, h1Var4.c, h1Var4.i, h1Var4.j);
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
                            if (r1Var.h.a.o() == 3) {
                            }
                        }
                    } else if (r1Var.h.a.o() == 4) {
                        uv0 uv0Var = e1Var.getPainting().g;
                        h1 h1Var5 = r1Var.h;
                        float a11 = r1.a(f14, f15, h1Var5.b, h1Var5.c, h1Var5.i, h1Var5.j);
                        h1 h1Var6 = r1Var.h;
                        if (Math.min(a11, r1.a(f14, f15, h1Var6.d, h1Var6.e, h1Var6.i, h1Var6.j)) - (r1Var.h.f / 2.0f) < Math.min(uv0Var.a, uv0Var.b) * 0.1f) {
                            f12 = f14;
                            f11 = f15;
                        }
                    }
                }
                r1Var.e();
                return;
            }
            f11 = f15;
            f12 = f14;
            fArr[0] = f12;
            fArr[1] = f11;
            r1Var.k = q1Var;
            if (q1Var != null) {
                if (q1Var.b) {
                    r1Var.c(f12, f11, false);
                }
                q1 q1Var5 = r1Var.k;
                r1Var.i = q1Var5.d - fArr[0];
                r1Var.j = q1Var5.e - fArr[1];
                return;
            }
            n1 n1Var3 = r1Var.l;
            if (n1Var3 != null) {
                if (n1Var3.b) {
                    r1Var.c(f12, f11, false);
                }
                n1 n1Var4 = r1Var.l;
                r1Var.i = n1Var4.d - fArr[0];
                r1Var.j = n1Var4.e - fArr[1];
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
        float x11 = motionEvent.getX();
        float height2 = e0Var.a.getHeight() - motionEvent.getY();
        float[] fArr2 = e0Var.u;
        fArr2[0] = x11;
        fArr2[1] = height2;
        e0Var.t.mapPoints(fArr2);
        float currentTimeMillis = System.currentTimeMillis() - e0Var.v;
        e0Var.w = w7.q.a(e0Var.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
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
                    f28 = (AndroidUtilities.lerp(e0Var.a.getCurrentBrush().j(), 1.0f, w7.q.a(e0Var.o / 16.0f, 0.0f, 1.0f)) * (f28 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = e0Var.u;
                double d14 = fArr3[0];
                double d15 = fArr3[1];
                double d16 = f28;
                w0 w0Var = new w0(d14, d15, d16);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (e0Var.z) {
                            e0Var.z = false;
                            return;
                        }
                        e0Var.l = false;
                        e0Var.s.c();
                        AndroidUtilities.cancelRunOnUIThread(e0Var.y);
                        s0 painting = e0Var.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!e0Var.e) {
                                d1 d1Var2 = e0Var.a.a;
                                if (d1Var2 == null || d1Var2.d()) {
                                    w0Var.d = true;
                                    t0 t0Var = new t0();
                                    Vector vector = new Vector();
                                    t0Var.b = vector;
                                    vector.add(w0Var);
                                    e0Var.b(t0Var);
                                }
                                e0Var.n = 0;
                            } else if (e0Var.n > 0) {
                                e0Var.c(e0Var.a.getCurrentBrush().j(), true);
                                if (e0Var.a.getCurrentBrush() instanceof a) {
                                    final float f29 = e0Var.k;
                                    final w0 w0Var2 = e0Var.m[e0Var.n - 1];
                                    w0 w0Var3 = e0Var.h;
                                    double d17 = w0Var3 == null ? d16 : w0Var3.c;
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
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pg.y
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            e0 e0Var2 = e0.this;
                                            e0Var2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d19 = f29;
                                            double cos = Math.cos(d19 - 2.5918139392115793d);
                                            double sin = Math.sin(d19 - 2.748893571891069d);
                                            w0 w0Var4 = w0Var2;
                                            double d20 = w0Var4.a;
                                            double d21 = currentWeight;
                                            double d22 = cos * d21;
                                            float[] fArr5 = fArr4;
                                            double d23 = fArr5[0];
                                            double d24 = (d22 * d23) + d20;
                                            double d25 = w0Var4.b;
                                            double d26 = sin * d21;
                                            double d27 = (d23 * d26) + d25;
                                            double d28 = d18;
                                            double d29 = floatValue;
                                            e0Var2.b(new t0(new w0[]{new w0(d24, d27, d28), new w0((d22 * d29) + d20, (d26 * d29) + d25, d28, 0)}));
                                            double cos2 = Math.cos(d19 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d19 + 2.748893571891069d);
                                            double d30 = w0Var4.a;
                                            double d31 = cos2 * d21;
                                            double d32 = fArr5[0];
                                            double d33 = sin2 * d21;
                                            e0Var2.b(new t0(new w0[]{new w0((d31 * d32) + d30, (d32 * d33) + d25, d28), new w0((d31 * d29) + d30, (d33 * d29) + d25, d28, 0)}));
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0] && floatValue > 0.4f) {
                                                zArr2[0] = true;
                                                BotWebViewVibrationEffect.SELECTION_CHANGE.vibrate();
                                            }
                                            fArr5[0] = floatValue;
                                        }
                                    });
                                    e0Var.r.addListener(new d0(e0Var, 0));
                                    e0Var.r.setDuration(240L);
                                    e0Var.r.setInterpolator(qr.h);
                                    e0Var.r.start();
                                }
                            }
                            r72 = 0;
                            e0Var.a.getPainting().c(null, e0Var.a.getCurrentColor(), true, new z(e0Var, 0 == true ? 1 : 0));
                            e0Var.n = r72;
                            e0Var.o = r72;
                            e0Var.j = r72;
                            e0Var.b = r72;
                            e0Var.p = 0.0d;
                            e0Var.q = 0.0d;
                            d1Var = e0Var.a.a;
                            if (d1Var == null) {
                                d1Var.e();
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
                        ofFloat2.addUpdateListener(new n0(painting, i14));
                        painting.L.addListener(new r0(painting, i14));
                        painting.L.setInterpolator(qr.h);
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
                        d1Var = e0Var.a.a;
                        if (d1Var == null) {
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
                        s0 painting2 = e0Var.a.getPainting();
                        if (painting2.L != null) {
                            i11 = 1;
                        } else {
                            i11 = 1;
                            painting2.f.f(new o0(painting2, objArr2 == true ? 1 : 0, i11));
                        }
                        AndroidUtilities.cancelRunOnUIThread(e0Var.y);
                        s0 painting3 = e0Var.a.getPainting();
                        painting3.f.f(new p0(painting3, i11));
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
                        e0Var.g = w0Var;
                        e0Var.d = System.currentTimeMillis();
                        e0Var.m[0] = w0Var;
                        e0Var.n = 1;
                        e0Var.o = 1;
                        e0Var.j = false;
                        e0Var.f = true;
                        e0Var.l = true;
                        AndroidUtilities.runOnUIThread(e0Var.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a12 = w0Var.a(e0Var.g);
                    if (a12 < AndroidUtilities.dp(5.0f) / scaleX) {
                        return;
                    }
                    if (e0Var.l && (a12 > AndroidUtilities.dp(6.0f) / scaleX || e0Var.n > 4)) {
                        e0Var.l = false;
                        AndroidUtilities.cancelRunOnUIThread(e0Var.y);
                    }
                    if (!e0Var.e) {
                        d1 d1Var3 = e0Var.a.a;
                        if (d1Var3 != null) {
                            d1Var3.f();
                        }
                        e0Var.e = true;
                        if (z10 && (e0Var.a.getCurrentBrush() instanceof f)) {
                            e0Var.A = e0Var.a.getCurrentBrush();
                            e0Var.a.g((m) org.telegram.ui.Cells.c1.i(1, m.a));
                        }
                    }
                    e0Var.m[e0Var.n] = w0Var;
                    if (e0Var.a.getPainting() == null || !e0Var.a.getPainting().G) {
                        f7 = a12;
                        if (System.currentTimeMillis() - e0Var.d > 3000) {
                            e0Var.s.c();
                            s0 painting4 = e0Var.a.getPainting();
                            if (painting4.L == null) {
                                painting4.f.f(new o0(painting4, objArr == true ? 1 : 0, 1));
                            }
                        } else if ((e0Var.a.getCurrentBrush() instanceof f) || (e0Var.a.getCurrentBrush() instanceof c)) {
                            m1 m1Var = e0Var.s;
                            boolean z12 = f7 > ((float) AndroidUtilities.dp(6.0f)) / scaleX;
                            synchronized (m1Var) {
                                m1Var.b.add(new j1(d14, d15));
                                z11 = m1Var.b.size() >= 8;
                            }
                            if (z11) {
                                DispatchQueue dispatchQueue = m1.m;
                                i1 i1Var = m1Var.l;
                                AtomicBoolean atomicBoolean = m1Var.k;
                                if (!m1Var.j.get()) {
                                    if (atomicBoolean.get() && !m1Var.d && z12) {
                                        dispatchQueue.cancelRunnable(i1Var);
                                        dispatchQueue.postRunnable(i1Var, 150L);
                                    }
                                    if (!atomicBoolean.get()) {
                                        r42 = 1;
                                        atomicBoolean.set(true);
                                        dispatchQueue.postRunnable(i1Var, 150L);
                                        i10 = e0Var.n + r42;
                                        e0Var.n = i10;
                                        e0Var.o += r42;
                                        if (i10 != 3) {
                                            w0[] w0VarArr = e0Var.m;
                                            w0 w0Var4 = w0VarArr[2];
                                            double d19 = w0Var4.b;
                                            w0 w0Var5 = w0VarArr[r42];
                                            float atan2 = (float) Math.atan2(d19 - w0Var5.b, w0Var4.a - w0Var5.a);
                                            if (e0Var.j) {
                                                float a13 = w7.q.a(f7 / (AndroidUtilities.dp(16.0f) / scaleX), 0.0f, 1.0f);
                                                if (a13 > 0.4f) {
                                                    double d20 = 1.0f - a13;
                                                    double d21 = e0Var.k;
                                                    double d22 = a13;
                                                    double d23 = atan2;
                                                    f10 = scaleX;
                                                    e0Var.k = (float) Math.atan2((Math.sin(d23) * d22) + (Math.sin(d21) * d20), hg.k0.e(d23, d22, Math.cos(d21) * d20));
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
                                        e0Var.g = w0Var;
                                        if (f7 > AndroidUtilities.dp(8.0f) / f10) {
                                            e0Var.h = w0Var;
                                        }
                                        e0Var.w = w7.q.a((currentTimeMillis / 75.0f) + e0Var.w, 0.6f, 1.0f);
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
                    e0Var.g = w0Var;
                    if (f7 > AndroidUtilities.dp(8.0f) / f10) {
                    }
                    e0Var.w = w7.q.a((currentTimeMillis / 75.0f) + e0Var.w, 0.6f, 1.0f);
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
        w0 w0Var6 = new w0(d142, d152, d162);
        if (actionMasked2 != 0) {
        }
        if (e0Var.z) {
        }
    }

    public final void f(Runnable runnable) {
        c1 c1Var = this.d;
        if (c1Var == null) {
            return;
        }
        c1Var.postRunnable(new org.telegram.ui.web.g1(8, this, runnable));
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

    public s0 getPainting() {
        return this.c;
    }

    public v1 getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.y = true;
        if (this.d != null) {
            f(new y0(this, 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        s0 s0Var = this.c;
        float width = s0Var != null ? getWidth() / s0Var.g.a : 1.0f;
        float f7 = width > 0.0f ? width : 1.0f;
        uv0 uv0Var = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f7, -f7);
        matrix.preTranslate((-uv0Var.a) / 2.0f, (-uv0Var.b) / 2.0f);
        if (this.x instanceof l) {
            r1 r1Var = this.f;
            r1Var.getClass();
            Matrix matrix2 = new Matrix();
            r1Var.o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.t = matrix3;
            matrix.invert(matrix3);
        }
        c1 c1Var = this.d;
        s0Var.y = m6.c(m6.b(c1Var.n, c1Var.r), m6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.x instanceof l;
        r1 r1Var = this.f;
        if (z10) {
            r1Var.e();
        }
        this.x = mVar;
        i();
        this.c.q(this.x);
        m mVar2 = this.x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = r1Var.n;
            ArrayList arrayList2 = r1Var.m;
            e1 e1Var = r1Var.a;
            if (e1Var == null || e1Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            r1Var.h = new h1(l.p(o9));
            uv0 uv0Var = e1Var.getPainting().g;
            h1 h1Var = r1Var.h;
            float f7 = uv0Var.a;
            h1Var.b = f7 / 2.0f;
            float f10 = uv0Var.b;
            h1Var.c = f10 / 2.0f;
            float min = Math.min(f7, f10) / 5.0f;
            h1Var.e = min;
            h1Var.d = min;
            r1Var.h.f = e1Var.getCurrentWeight();
            r1Var.h.g = AndroidUtilities.dp(32.0f);
            r1Var.h.l = u0.e(UserConfig.selectedAccount).k;
            if (r1Var.h.a.o() == 4) {
                h1 h1Var2 = r1Var.h;
                float f11 = uv0Var.a / 2.0f;
                h1Var2.d = f11;
                h1Var2.b = f11;
                h1Var2.i = f11 + 1.0f;
                float f12 = uv0Var.b;
                float f13 = f12 / 3.0f;
                float f14 = 1.0f * f13;
                h1Var2.c = f14;
                float f15 = f12 / 2.0f;
                h1Var2.j = f15;
                h1Var2.e = f13 * 2.0f;
                h1Var2.k = Math.abs(f14 - f15);
                n1 n1Var = new n1(r1Var, 0);
                arrayList2.add(n1Var);
                o1 o1Var = new o1(r1Var, n1Var, 0);
                arrayList2.add(o1Var);
                arrayList.add(o1Var);
                o1 o1Var2 = new o1(r1Var, n1Var, 1);
                arrayList2.add(o1Var2);
                arrayList.add(o1Var2);
            }
            if (r1Var.h.a.o() == 0) {
                arrayList2.add(new n1(r1Var, 1));
            }
            if (r1Var.h.a.o() == 2) {
                arrayList2.add(new n1(r1Var, 2));
            }
            if (r1Var.h.a.o() == 1 || r1Var.h.a.o() == 3) {
                arrayList2.add(new p1(r1Var, r1Var.h, false, false));
                arrayList2.add(new p1(r1Var, r1Var.h, true, false));
                arrayList2.add(new p1(r1Var, r1Var.h, false, true));
                arrayList2.add(new p1(r1Var, r1Var.h, true, true));
                arrayList2.add(new n1(r1Var, 3, false));
            }
            if (r1Var.h.a.o() == 3) {
                h1 h1Var3 = r1Var.h;
                h1Var3.i = (h1Var3.d * 0.8f) + h1Var3.b;
                h1Var3.j = (h1Var3.e * 1.2f) + h1Var3.c + h1Var3.f;
                n1 n1Var2 = new n1(r1Var, 4);
                arrayList2.add(n1Var2);
                n1Var2.b = false;
                arrayList.add(n1Var2);
            }
            r1Var.l = new n1(r1Var, 5, false);
            if (r1Var.h.a.o() != 4) {
                r1Var.l.c = false;
            }
            n1 n1Var3 = r1Var.l;
            n1Var3.b = false;
            arrayList.add(n1Var3);
            arrayList2.add(r1Var.l);
            e1Var.getPainting().k(r1Var.h);
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.c.g.a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.x instanceof l) {
            r1 r1Var = this.f;
            e1 e1Var = r1Var.a;
            h1 h1Var = r1Var.h;
            if (h1Var == null || h1Var.f == e1Var.getCurrentWeight()) {
                return;
            }
            r1Var.h.f = e1Var.getCurrentWeight();
            e1Var.getPainting().k(r1Var.h);
        }
    }

    public void setColor(int i10) {
        this.w = i10;
        if (this.x instanceof l) {
            r1 r1Var = this.f;
            if (r1Var.h != null) {
                r1Var.a.getPainting().k(r1Var.h);
            }
        }
    }

    public void setDelegate(d1 d1Var) {
        this.a = d1Var;
    }

    public void setUndoStore(v1 v1Var) {
        this.b = v1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
