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
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.uv0;
import v7.a7;
import w7.l6;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public class f1 extends TextureView {
    public e1 a;
    public w1 b;
    public final s0 c;
    public d1 d;
    public final e0 e;
    public final s1 f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float v;
    public int w;
    public m x;
    public boolean y;

    public f1(Context context, s0 s0Var, Bitmap bitmap, Bitmap bitmap2, ja jaVar) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = s0Var;
        s0Var.f = this;
        setSurfaceTextureListener(new a1(this, jaVar));
        this.e = new e0(this);
        y0 y0Var = new y0(this, 0);
        s1 s1Var = new s1();
        Paint paint = new Paint(1);
        s1Var.c = paint;
        Paint paint2 = new Paint(1);
        s1Var.d = paint2;
        Paint paint3 = new Paint(1);
        s1Var.e = paint3;
        Paint paint4 = new Paint(1);
        s1Var.f = paint4;
        Paint paint5 = new Paint(1);
        s1Var.g = paint5;
        s1Var.m = new ArrayList();
        s1Var.n = new ArrayList();
        s1Var.p = new float[2];
        s1Var.a = this;
        s1Var.b = y0Var;
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
        this.f = s1Var;
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
        f1 f1Var;
        s1 s1Var = this.f;
        if (s1Var == null || (f1Var = s1Var.a) == null || f1Var.getPainting() == null || s1Var.h == null) {
            return;
        }
        s0 painting = f1Var.getPainting();
        painting.f.f(new p0(painting, 0));
        s1Var.m.clear();
        s1Var.n.clear();
        s1Var.h = null;
    }

    public final Bitmap c(boolean z10, boolean z11) {
        if (this.x instanceof l) {
            this.f.e();
        }
        d1 d1Var = this.d;
        if (d1Var == null || !d1Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            d1Var.postRunnable(new b8(d1Var, z10, z11, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e) {
            FileLog.e(e);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.x instanceof l) {
            s1 s1Var = this.f;
            Paint paint = s1Var.c;
            ArrayList arrayList = s1Var.m;
            f1 f1Var = s1Var.a;
            if (f1Var == null || f1Var.getPainting() == null) {
                return;
            }
            uv0 uv0Var = f1Var.getPainting().g;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                r1 r1Var = (r1) arrayList.get(i10);
                if (r1Var.c && !r1Var.b) {
                    s1Var.b(canvas, uv0Var, r1Var);
                }
            }
            i1 i1Var = s1Var.h;
            if (i1Var != null && i1Var.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r1.h) / 3.141592653589793d) * 180.0d), (s1Var.h.b / uv0Var.a) * canvas.getWidth(), (s1Var.h.c / uv0Var.b) * canvas.getHeight());
            }
            i1 i1Var2 = s1Var.h;
            if (i1Var2 == null || i1Var2.a.o() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (s1Var.h.b / uv0Var.a), canvas.getHeight() * (s1Var.h.c / uv0Var.b), canvas.getWidth() * (s1Var.h.i / uv0Var.a), canvas.getHeight() * (s1Var.h.j / uv0Var.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (s1Var.h.d / uv0Var.a), canvas2.getHeight() * (s1Var.h.e / uv0Var.b), canvas2.getWidth() * (s1Var.h.i / uv0Var.a), canvas2.getHeight() * (s1Var.h.j / uv0Var.b), paint);
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                r1 r1Var2 = (r1) arrayList.get(i11);
                if (r1Var2.c && r1Var2.b) {
                    s1Var.b(canvas2, uv0Var, r1Var2);
                }
            }
            i1 i1Var3 = s1Var.h;
            if (i1Var3 == null || i1Var3.h == 0.0f) {
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
        d1 d1Var;
        boolean z10;
        float f7;
        boolean z11;
        ?? r42;
        int i10;
        float f10;
        ?? r72;
        e1 e1Var;
        int i11;
        float f11;
        float f12;
        float f13;
        float sqrt;
        char c10 = 1;
        if (motionEvent.getPointerCount() > 1 || (d1Var = this.d) == null || !d1Var.f || !d1Var.h) {
            return;
        }
        r1 r1Var = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        ?? r92 = 0;
        if (this.x instanceof l) {
            s1 s1Var = this.f;
            getScaleX();
            ArrayList arrayList = s1Var.n;
            ArrayList arrayList2 = s1Var.m;
            y0 y0Var = s1Var.b;
            float[] fArr = s1Var.p;
            f1 f1Var = s1Var.a;
            if (f1Var == null || f1Var.getPainting() == null || s1Var.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x10 = motionEvent.getX();
            float height = f1Var.getHeight() - motionEvent.getY();
            fArr[0] = x10;
            fArr[1] = height;
            s1Var.o.mapPoints(fArr);
            float f14 = fArr[0];
            float f15 = fArr[1];
            y0Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        s1Var.k = null;
                        return;
                    }
                    return;
                }
                r1 r1Var2 = s1Var.k;
                if (r1Var2 == null) {
                    o1 o1Var = s1Var.l;
                    if (o1Var != null) {
                        if (o1Var.b) {
                            s1Var.c(f14, f15, false);
                        }
                        float f16 = fArr[0] + s1Var.i;
                        o1 o1Var2 = s1Var.l;
                        float f17 = f16 - o1Var2.d;
                        float f18 = (fArr[1] + s1Var.j) - o1Var2.e;
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            r1 r1Var3 = (r1) arrayList.get(i12);
                            r1Var3.b(r1Var3.d + f17, r1Var3.e + f18);
                        }
                    }
                } else {
                    if (r1Var2.b) {
                        s1Var.d(false);
                    }
                    s1Var.k.b(fArr[0] + s1Var.i, fArr[1] + s1Var.j);
                }
                f1Var.getPainting().k(s1Var.h);
                y0Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                r1 r1Var4 = (r1) arrayList2.get(i13);
                if (r1Var4.c) {
                    fArr[r92] = f14;
                    fArr[c10] = f15;
                    if (r1Var4.b) {
                        s1Var.c(f14, f15, r92);
                    }
                    double a2 = a7.a(r1Var4.d, r1Var4.e, fArr[r92], fArr[1]);
                    if (a2 < AndroidUtilities.dp(40.0f) && (r1Var == null || a2 < d)) {
                        r1Var = r1Var4;
                        d = a2;
                    }
                }
                i13++;
                c10 = 1;
                r92 = 0;
            }
            fArr[0] = f14;
            fArr[1] = f15;
            s1Var.c(f14, f15, false);
            if (r1Var == null) {
                i1 i1Var = s1Var.h;
                if (i1Var != null) {
                    if (i1Var.a.o() == 0 || s1Var.h.a.o() == 2) {
                        f11 = f15;
                        f12 = f14;
                        double sqrt2 = Math.sqrt(Math.pow(f11 - s1Var.h.c, 2.0d) + Math.pow(f12 - s1Var.h.b, 2.0d));
                        i1 i1Var2 = s1Var.h;
                    } else if (s1Var.h.a.o() == 1 || s1Var.h.a.o() == 3) {
                        i1 i1Var3 = s1Var.h;
                        float f19 = i1Var3.b;
                        float f20 = i1Var3.d;
                        float f21 = i1Var3.f / 2.0f;
                        float f22 = (f19 - f20) - f21;
                        float f23 = i1Var3.c;
                        float f24 = i1Var3.e;
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
                            if (s1Var.h.a.o() == 3) {
                            }
                        } else if (f14 >= f22 || f14 <= f26) {
                            double d10 = f14 - f22;
                            f13 = 30.0f;
                            double d11 = f15 - f25;
                            double d12 = f14 - f26;
                            double d13 = f15 - f27;
                            sqrt = (float) Math.sqrt(Math.min(Math.min(Math.pow(d11, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d11, 2.0d) + Math.pow(d12, 2.0d)), Math.min(Math.pow(d13, 2.0d) + Math.pow(d10, 2.0d), Math.pow(d13, 2.0d) + Math.pow(d12, 2.0d))));
                            if (s1Var.h.a.o() == 3) {
                                i1 i1Var4 = s1Var.h;
                                float a10 = s1.a(f14, f15, i1Var4.b, i1Var4.c, i1Var4.i, i1Var4.j);
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
                            if (s1Var.h.a.o() == 3) {
                            }
                        }
                    } else if (s1Var.h.a.o() == 4) {
                        uv0 uv0Var = f1Var.getPainting().g;
                        i1 i1Var5 = s1Var.h;
                        float a11 = s1.a(f14, f15, i1Var5.b, i1Var5.c, i1Var5.i, i1Var5.j);
                        i1 i1Var6 = s1Var.h;
                        if (Math.min(a11, s1.a(f14, f15, i1Var6.d, i1Var6.e, i1Var6.i, i1Var6.j)) - (s1Var.h.f / 2.0f) < Math.min(uv0Var.a, uv0Var.b) * 0.1f) {
                            f12 = f14;
                            f11 = f15;
                        }
                    }
                }
                s1Var.e();
                return;
            }
            f11 = f15;
            f12 = f14;
            fArr[0] = f12;
            fArr[1] = f11;
            s1Var.k = r1Var;
            if (r1Var != null) {
                if (r1Var.b) {
                    s1Var.c(f12, f11, false);
                }
                r1 r1Var5 = s1Var.k;
                s1Var.i = r1Var5.d - fArr[0];
                s1Var.j = r1Var5.e - fArr[1];
                return;
            }
            o1 o1Var3 = s1Var.l;
            if (o1Var3 != null) {
                if (o1Var3.b) {
                    s1Var.c(f12, f11, false);
                }
                o1 o1Var4 = s1Var.l;
                s1Var.i = o1Var4.d - fArr[0];
                s1Var.j = o1Var4.e - fArr[1];
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
                                e1 e1Var2 = e0Var.a.a;
                                if (e1Var2 == null || e1Var2.d()) {
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
                                    e0Var.r.setInterpolator(rr.h);
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
                            e1Var = e0Var.a.a;
                            if (e1Var == null) {
                                e1Var.e();
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
                        painting.L.setInterpolator(rr.h);
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
                        e1Var = e0Var.a.a;
                        if (e1Var == null) {
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
                        e1 e1Var3 = e0Var.a.a;
                        if (e1Var3 != null) {
                            e1Var3.f();
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
                            n1 n1Var = e0Var.s;
                            boolean z12 = f7 > ((float) AndroidUtilities.dp(6.0f)) / scaleX;
                            synchronized (n1Var) {
                                n1Var.b.add(new k1(d14, d15));
                                z11 = n1Var.b.size() >= 8;
                            }
                            if (z11) {
                                DispatchQueue dispatchQueue = n1.m;
                                j1 j1Var = n1Var.l;
                                AtomicBoolean atomicBoolean = n1Var.k;
                                if (!n1Var.j.get()) {
                                    if (atomicBoolean.get() && !n1Var.d && z12) {
                                        dispatchQueue.cancelRunnable(j1Var);
                                        dispatchQueue.postRunnable(j1Var, 150L);
                                    }
                                    if (!atomicBoolean.get()) {
                                        r42 = 1;
                                        atomicBoolean.set(true);
                                        dispatchQueue.postRunnable(j1Var, 150L);
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
                                                    e0Var.k = (float) Math.atan2((Math.sin(d23) * d22) + (Math.sin(d21) * d20), hg.c.e(d23, d22, Math.cos(d21) * d20));
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
        d1 d1Var = this.d;
        if (d1Var == null) {
            return;
        }
        d1Var.postRunnable(new org.telegram.ui.web.f1(8, this, runnable));
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

    public w1 getUndoStore() {
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
            s1 s1Var = this.f;
            s1Var.getClass();
            Matrix matrix2 = new Matrix();
            s1Var.o = matrix2;
            matrix.invert(matrix2);
        } else {
            e0 e0Var = this.e;
            e0Var.getClass();
            Matrix matrix3 = new Matrix();
            e0Var.t = matrix3;
            matrix.invert(matrix3);
        }
        d1 d1Var = this.d;
        s0Var.y = l6.c(l6.b(d1Var.n, d1Var.r), l6.a(matrix));
    }

    public void setBrush(m mVar) {
        boolean z10 = this.x instanceof l;
        s1 s1Var = this.f;
        if (z10) {
            s1Var.e();
        }
        this.x = mVar;
        i();
        this.c.q(this.x);
        m mVar2 = this.x;
        if (mVar2 instanceof l) {
            int o9 = ((l) mVar2).o();
            ArrayList arrayList = s1Var.n;
            ArrayList arrayList2 = s1Var.m;
            f1 f1Var = s1Var.a;
            if (f1Var == null || f1Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            s1Var.h = new i1(l.p(o9));
            uv0 uv0Var = f1Var.getPainting().g;
            i1 i1Var = s1Var.h;
            float f7 = uv0Var.a;
            i1Var.b = f7 / 2.0f;
            float f10 = uv0Var.b;
            i1Var.c = f10 / 2.0f;
            float min = Math.min(f7, f10) / 5.0f;
            i1Var.e = min;
            i1Var.d = min;
            s1Var.h.f = f1Var.getCurrentWeight();
            s1Var.h.g = AndroidUtilities.dp(32.0f);
            s1Var.h.l = u0.e(UserConfig.selectedAccount).k;
            if (s1Var.h.a.o() == 4) {
                i1 i1Var2 = s1Var.h;
                float f11 = uv0Var.a / 2.0f;
                i1Var2.d = f11;
                i1Var2.b = f11;
                i1Var2.i = f11 + 1.0f;
                float f12 = uv0Var.b;
                float f13 = f12 / 3.0f;
                float f14 = 1.0f * f13;
                i1Var2.c = f14;
                float f15 = f12 / 2.0f;
                i1Var2.j = f15;
                i1Var2.e = f13 * 2.0f;
                i1Var2.k = Math.abs(f14 - f15);
                o1 o1Var = new o1(s1Var, 0);
                arrayList2.add(o1Var);
                p1 p1Var = new p1(s1Var, o1Var, 0);
                arrayList2.add(p1Var);
                arrayList.add(p1Var);
                p1 p1Var2 = new p1(s1Var, o1Var, 1);
                arrayList2.add(p1Var2);
                arrayList.add(p1Var2);
            }
            if (s1Var.h.a.o() == 0) {
                arrayList2.add(new o1(s1Var, 1));
            }
            if (s1Var.h.a.o() == 2) {
                arrayList2.add(new o1(s1Var, 2));
            }
            if (s1Var.h.a.o() == 1 || s1Var.h.a.o() == 3) {
                arrayList2.add(new q1(s1Var, s1Var.h, false, false));
                arrayList2.add(new q1(s1Var, s1Var.h, true, false));
                arrayList2.add(new q1(s1Var, s1Var.h, false, true));
                arrayList2.add(new q1(s1Var, s1Var.h, true, true));
                arrayList2.add(new o1(s1Var, 3, false));
            }
            if (s1Var.h.a.o() == 3) {
                i1 i1Var3 = s1Var.h;
                i1Var3.i = (i1Var3.d * 0.8f) + i1Var3.b;
                i1Var3.j = (i1Var3.e * 1.2f) + i1Var3.c + i1Var3.f;
                o1 o1Var2 = new o1(s1Var, 4);
                arrayList2.add(o1Var2);
                o1Var2.b = false;
                arrayList.add(o1Var2);
            }
            s1Var.l = new o1(s1Var, 5, false);
            if (s1Var.h.a.o() != 4) {
                s1Var.l.c = false;
            }
            o1 o1Var3 = s1Var.l;
            o1Var3.b = false;
            arrayList.add(o1Var3);
            arrayList2.add(s1Var.l);
            f1Var.getPainting().k(s1Var.h);
        }
    }

    public void setBrushSize(float f7) {
        float f10 = this.c.g.a;
        this.v = e2.x(f10, 0.043945312f, f7, 0.00390625f * f10);
        if (this.x instanceof l) {
            s1 s1Var = this.f;
            f1 f1Var = s1Var.a;
            i1 i1Var = s1Var.h;
            if (i1Var == null || i1Var.f == f1Var.getCurrentWeight()) {
                return;
            }
            s1Var.h.f = f1Var.getCurrentWeight();
            f1Var.getPainting().k(s1Var.h);
        }
    }

    public void setColor(int i10) {
        this.w = i10;
        if (this.x instanceof l) {
            s1 s1Var = this.f;
            if (s1Var.h != null) {
                s1Var.a.getPainting().k(s1Var.h);
            }
        }
    }

    public void setDelegate(e1 e1Var) {
        this.a = e1Var;
    }

    public void setUndoStore(w1 w1Var) {
        this.b = w1Var;
    }

    public void g(m mVar) {
    }

    public void setQueue(DispatchQueue dispatchQueue) {
    }
}
