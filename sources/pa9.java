// default package

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
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class pa9 extends TextureView {
    public boolean E;
    public oa9 a;
    public a9c b;
    public final nx7 c;
    public na9 d;
    public final bq5 e;
    public final dda f;
    public Bitmap h;
    public Bitmap n;
    public boolean r;
    public boolean s;
    public float w;
    public int x;
    public v01 y;

    public pa9(Context context, nx7 nx7Var, Bitmap bitmap, Bitmap bitmap2, tl0 tl0Var) {
        super(context);
        setOpaque(false);
        this.h = bitmap;
        this.n = bitmap2;
        this.c = nx7Var;
        nx7Var.f = this;
        setSurfaceTextureListener(new la9(this, tl0Var));
        this.e = new bq5(this);
        ja9 ja9Var = new ja9(this, (byte) 0);
        dda ddaVar = new dda();
        Paint paint = new Paint(1);
        ddaVar.c = paint;
        Paint paint2 = new Paint(1);
        ddaVar.d = paint2;
        Paint paint3 = new Paint(1);
        ddaVar.e = paint3;
        Paint paint4 = new Paint(1);
        ddaVar.f = paint4;
        Paint paint5 = new Paint(1);
        ddaVar.g = paint5;
        ddaVar.m = new ArrayList();
        ddaVar.n = new ArrayList();
        ddaVar.p = new float[2];
        ddaVar.a = this;
        ddaVar.b = ja9Var;
        paint2.setColor(-13840296);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(hl.L(1.0f));
        paint4.setColor(-16745729);
        paint5.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(hl.L(1.0f));
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setStrokeWidth(hl.L(0.8f));
        paint.setPathEffect(new DashPathEffect(new float[]{hl.L(8.0f), hl.L(8.0f)}, 0.0f));
        paint.setShadowLayer(4.0f, 0.0f, 1.5f, TLObject.FLAG_30);
        this.f = ddaVar;
        nx7Var.a = new xh4((Object) this, (byte) 29);
    }

    public final void a() {
        ja9 ja9Var = new ja9(this, (byte) 2);
        bq5 bq5Var = this.e;
        bq5Var.g = new vg8(bq5Var.a.getPainting().g.a, 0.0d, 1.0d);
        bq5Var.l = true;
        bq5Var.a(new r01(), false, ja9Var);
    }

    public final void b() {
        pa9 pa9Var;
        dda ddaVar = this.f;
        if (ddaVar == null || (pa9Var = ddaVar.a) == null || pa9Var.getPainting() == null || ddaVar.h == null) {
            return;
        }
        nx7 painting = pa9Var.getPainting();
        painting.f.f(new kx7(painting, (byte) 0));
        ddaVar.m.clear();
        ddaVar.n.clear();
        ddaVar.h = null;
    }

    public final Bitmap c(boolean z, boolean z2) {
        if (this.y instanceof u01) {
            this.f.e();
        }
        na9 na9Var = this.d;
        if (na9Var == null || !na9Var.f) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            na9Var.postRunnable(new my6(na9Var, z, z2, bitmapArr, countDownLatch));
            countDownLatch.await();
        } catch (Exception e) {
            cc4.g(e, true);
        }
        return bitmapArr[0];
    }

    public final void d(Canvas canvas) {
        Canvas canvas2;
        if (this.y instanceof u01) {
            dda ddaVar = this.f;
            Paint paint = ddaVar.c;
            ArrayList arrayList = ddaVar.m;
            pa9 pa9Var = ddaVar.a;
            if (pa9Var == null || pa9Var.getPainting() == null) {
                return;
            }
            qma qmaVar = pa9Var.getPainting().g;
            for (int i = 0; i < arrayList.size(); i++) {
                cda cdaVar = (cda) arrayList.get(i);
                if (cdaVar.c && !cdaVar.b) {
                    ddaVar.b(canvas, qmaVar, cdaVar);
                }
            }
            uca ucaVar = ddaVar.h;
            if (ucaVar != null && ucaVar.h != 0.0f) {
                canvas.save();
                canvas.rotate((float) (((-r0.h) / 3.141592653589793d) * 180.0d), (ddaVar.h.b / qmaVar.a) * canvas.getWidth(), (ddaVar.h.c / qmaVar.b) * canvas.getHeight());
            }
            uca ucaVar2 = ddaVar.h;
            if (ucaVar2 == null || ucaVar2.a.n() != 4) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(canvas.getWidth() * (ddaVar.h.b / qmaVar.a), canvas.getHeight() * (ddaVar.h.c / qmaVar.b), canvas.getWidth() * (ddaVar.h.i / qmaVar.a), canvas.getHeight() * (ddaVar.h.j / qmaVar.b), paint);
                canvas2.drawLine(canvas2.getWidth() * (ddaVar.h.d / qmaVar.a), canvas2.getHeight() * (ddaVar.h.e / qmaVar.b), canvas2.getWidth() * (ddaVar.h.i / qmaVar.a), canvas2.getHeight() * (ddaVar.h.j / qmaVar.b), paint);
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                cda cdaVar2 = (cda) arrayList.get(i2);
                if (cdaVar2.c && cdaVar2.b) {
                    ddaVar.b(canvas2, qmaVar, cdaVar2);
                }
            }
            uca ucaVar3 = ddaVar.h;
            if (ucaVar3 == null || ucaVar3.h == 0.0f) {
                return;
            }
            canvas2.restore();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x024e, code lost:
    
        if (((r7 - java.lang.Math.min(r0.d, r0.e)) - (r1.h.f / 2.0f)) >= hl.L(30.0f)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0212, code lost:
    
        if (r5 < hl.L(r34)) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v35, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MotionEvent motionEvent) {
        na9 na9Var;
        boolean z;
        boolean z2;
        ?? r5;
        int i;
        byte b;
        float f;
        float f2;
        float f3;
        float sqrt;
        int i2;
        int i3 = 1;
        if (motionEvent.getPointerCount() > 1 || (na9Var = this.d) == null || !na9Var.f || !na9Var.h) {
            return;
        }
        cda cdaVar = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        byte b2 = 2;
        Object[] objArr3 = 0;
        if (this.y instanceof u01) {
            dda ddaVar = this.f;
            getScaleX();
            ArrayList arrayList = ddaVar.n;
            ArrayList arrayList2 = ddaVar.m;
            ja9 ja9Var = ddaVar.b;
            float[] fArr = ddaVar.p;
            pa9 pa9Var = ddaVar.a;
            if (pa9Var == null || pa9Var.getPainting() == null || ddaVar.h == null) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            float x = motionEvent.getX();
            float height = pa9Var.getHeight() - motionEvent.getY();
            fArr[0] = x;
            fArr[1] = height;
            ddaVar.o.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            ja9Var.run();
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked == 1 || actionMasked == 3) {
                        ddaVar.k = null;
                        return;
                    }
                    return;
                }
                cda cdaVar2 = ddaVar.k;
                if (cdaVar2 == null) {
                    zca zcaVar = ddaVar.l;
                    if (zcaVar != null) {
                        if (zcaVar.b) {
                            ddaVar.c(f4, f5, false);
                        }
                        float f6 = fArr[0] + ddaVar.i;
                        zca zcaVar2 = ddaVar.l;
                        float f7 = f6 - zcaVar2.d;
                        float f8 = (fArr[1] + ddaVar.j) - zcaVar2.e;
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            cda cdaVar3 = (cda) arrayList.get(i4);
                            cdaVar3.b(cdaVar3.d + f7, cdaVar3.e + f8);
                        }
                    }
                } else {
                    if (cdaVar2.b) {
                        ddaVar.d(false);
                    }
                    ddaVar.k.b(fArr[0] + ddaVar.i, fArr[1] + ddaVar.j);
                }
                pa9Var.getPainting().k(ddaVar.h);
                ja9Var.run();
                return;
            }
            double d = Double.MAX_VALUE;
            int i5 = 0;
            while (i5 < arrayList2.size()) {
                cda cdaVar4 = (cda) arrayList2.get(i5);
                if (cdaVar4.c) {
                    fArr[0] = f4;
                    fArr[i3] = f5;
                    if (cdaVar4.b) {
                        ddaVar.c(f4, f5, false);
                    }
                    double a = dte.a(cdaVar4.d, cdaVar4.e, fArr[0], fArr[i3]);
                    i2 = i3;
                    if (a < hl.L(40.0f) && (cdaVar == null || a < d)) {
                        cdaVar = cdaVar4;
                        d = a;
                    }
                } else {
                    i2 = i3;
                }
                i5++;
                i3 = i2;
            }
            int i6 = i3;
            fArr[0] = f4;
            fArr[i6] = f5;
            ddaVar.c(f4, f5, false);
            if (cdaVar == null) {
                uca ucaVar = ddaVar.h;
                if (ucaVar != null) {
                    if (ucaVar.a.n() == 0 || ddaVar.h.a.n() == 2) {
                        f = f4;
                        f2 = f5;
                        double sqrt2 = Math.sqrt(Math.pow(f2 - ddaVar.h.c, 2.0d) + Math.pow(f - ddaVar.h.b, 2.0d));
                        uca ucaVar2 = ddaVar.h;
                    } else if (ddaVar.h.a.n() == i6 || ddaVar.h.a.n() == 3) {
                        uca ucaVar3 = ddaVar.h;
                        float f9 = ucaVar3.b;
                        float f10 = ucaVar3.d;
                        float f11 = ucaVar3.f / 2.0f;
                        float f12 = (f9 - f10) - f11;
                        float f13 = ucaVar3.c;
                        float f14 = ucaVar3.e;
                        float f15 = (f13 - f14) - f11;
                        float f16 = f9 + f10 + f11;
                        float f17 = f13 + f14 + f11;
                        if (f5 > f15 && f5 < f17) {
                            if (f4 < f12) {
                                sqrt = f12 - f4;
                            } else {
                                if (f4 > f16) {
                                    sqrt = f4 - f16;
                                }
                                f3 = 30.0f;
                                sqrt = 0.0f;
                            }
                            f3 = 30.0f;
                        } else if (f4 >= f12 || f4 <= f16) {
                            double d2 = f4 - f12;
                            f3 = 30.0f;
                            double d3 = f5 - f15;
                            double d4 = f4 - f16;
                            double d5 = f5 - f17;
                            sqrt = (float) Math.sqrt(Math.min(Math.min(Math.pow(d3, 2.0d) + Math.pow(d2, 2.0d), Math.pow(d3, 2.0d) + Math.pow(d4, 2.0d)), Math.min(Math.pow(d2, 2.0d) + Math.pow(d5, 2.0d), Math.pow(d5, 2.0d) + Math.pow(d4, 2.0d))));
                        } else {
                            if (f5 < f15) {
                                sqrt = f15 - f5;
                            } else {
                                if (f5 > f17) {
                                    sqrt = f5 - f17;
                                }
                                f3 = 30.0f;
                                sqrt = 0.0f;
                            }
                            f3 = 30.0f;
                        }
                        if (ddaVar.h.a.n() == 3) {
                            uca ucaVar4 = ddaVar.h;
                            f = f4;
                            f2 = f5;
                            sqrt = Math.min(sqrt, dda.a(f4, f5, ucaVar4.b, ucaVar4.c, ucaVar4.i, ucaVar4.j));
                        } else {
                            f = f4;
                            f2 = f5;
                        }
                    } else if (ddaVar.h.a.n() == 4) {
                        qma qmaVar = pa9Var.getPainting().g;
                        uca ucaVar5 = ddaVar.h;
                        float a2 = dda.a(f4, f5, ucaVar5.b, ucaVar5.c, ucaVar5.i, ucaVar5.j);
                        uca ucaVar6 = ddaVar.h;
                        if (Math.min(a2, dda.a(f4, f5, ucaVar6.d, ucaVar6.e, ucaVar6.i, ucaVar6.j)) - (ddaVar.h.f / 2.0f) < Math.min(qmaVar.a, qmaVar.b) * 0.1f) {
                            f = f4;
                            f2 = f5;
                        }
                    }
                }
                ddaVar.e();
                return;
            }
            f = f4;
            f2 = f5;
            fArr[0] = f;
            fArr[1] = f2;
            ddaVar.k = cdaVar;
            if (cdaVar != null) {
                if (cdaVar.b) {
                    ddaVar.c(f, f2, false);
                }
                cda cdaVar5 = ddaVar.k;
                ddaVar.i = cdaVar5.d - fArr[0];
                ddaVar.j = cdaVar5.e - fArr[1];
                return;
            }
            zca zcaVar3 = ddaVar.l;
            if (zcaVar3 != null) {
                if (zcaVar3.b) {
                    ddaVar.c(f, f2, false);
                }
                zca zcaVar4 = ddaVar.l;
                ddaVar.i = zcaVar4.d - fArr[0];
                ddaVar.j = zcaVar4.e - fArr[1];
                return;
            }
            return;
        }
        final bq5 bq5Var = this.e;
        float scaleX = getScaleX();
        if (bq5Var.x != null || bq5Var.r != null) {
            return;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float height2 = bq5Var.a.getHeight() - motionEvent.getY();
        float[] fArr2 = bq5Var.u;
        fArr2[0] = x2;
        fArr2[1] = height2;
        bq5Var.t.mapPoints(fArr2);
        float currentTimeMillis = System.currentTimeMillis() - bq5Var.v;
        bq5Var.w = ete.a(bq5Var.w - (currentTimeMillis / 125.0f), 0.6f, 1.0f);
        if (bq5Var.a.getCurrentBrush() != null && (bq5Var.a.getCurrentBrush() instanceof o01)) {
            bq5Var.w = 1.0f - bq5Var.w;
        }
        bq5Var.v = System.currentTimeMillis();
        float f18 = bq5Var.w;
        if (motionEvent.getToolType(motionEvent.getActionIndex()) == 2) {
            f18 = Math.max(0.1f, bq5.B.getInterpolation(motionEvent.getPressure()));
            if ((motionEvent.getButtonState() & 32) == 32) {
                z = true;
                if (bq5Var.a.getCurrentBrush() != null) {
                    f18 = (hl.R1(bq5Var.a.getCurrentBrush().i(), 1.0f, ete.a(bq5Var.o / 16.0f, 0.0f, 1.0f)) * (f18 - 1.0f)) + 1.0f;
                }
                float[] fArr3 = bq5Var.u;
                double d6 = fArr3[0];
                double d7 = fArr3[1];
                double d8 = f18;
                vg8 vg8Var = new vg8(d6, d7, d8);
                if (actionMasked2 != 0) {
                    if (actionMasked2 == 1) {
                        if (bq5Var.z) {
                            bq5Var.z = false;
                            return;
                        }
                        bq5Var.l = false;
                        bq5Var.s.c();
                        hl.r(bq5Var.y);
                        nx7 painting = bq5Var.a.getPainting();
                        if (painting.d == null || !painting.H || painting.q == 0) {
                            if (!bq5Var.e) {
                                oa9 oa9Var = bq5Var.a.a;
                                if (oa9Var == null || oa9Var.E()) {
                                    vg8Var.d = true;
                                    j18 j18Var = new j18();
                                    Vector vector = new Vector();
                                    j18Var.b = vector;
                                    vector.add(vg8Var);
                                    bq5Var.b(j18Var);
                                }
                                bq5Var.n = 0;
                            } else if (bq5Var.n > 0) {
                                bq5Var.c(true, bq5Var.a.getCurrentBrush().i());
                                if (bq5Var.a.getCurrentBrush() instanceof o01) {
                                    final float f19 = bq5Var.k;
                                    final vg8 vg8Var2 = bq5Var.m[bq5Var.n - 1];
                                    vg8 vg8Var3 = bq5Var.h;
                                    double d9 = vg8Var3 == null ? d8 : vg8Var3.c;
                                    final float currentWeight = bq5Var.a.getCurrentWeight() * ((float) d9) * 12.0f;
                                    ValueAnimator valueAnimator = bq5Var.r;
                                    if (valueAnimator != null) {
                                        valueAnimator.cancel();
                                    }
                                    final float[] fArr4 = new float[1];
                                    final boolean[] zArr = new boolean[1];
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    bq5Var.r = ofFloat;
                                    final double d10 = d9;
                                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xp5
                                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                            bq5 bq5Var2 = bq5.this;
                                            bq5Var2.getClass();
                                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                            double d11 = f19;
                                            double cos = Math.cos(d11 - 2.5918139392115793d);
                                            double sin = Math.sin(d11 - 2.748893571891069d);
                                            vg8 vg8Var4 = vg8Var2;
                                            double d12 = vg8Var4.a;
                                            double d13 = currentWeight;
                                            double d14 = cos * d13;
                                            float[] fArr5 = fArr4;
                                            double d15 = fArr5[0];
                                            double d16 = (d14 * d15) + d12;
                                            double d17 = vg8Var4.b;
                                            double d18 = sin * d13;
                                            double d19 = (d15 * d18) + d17;
                                            double d20 = d10;
                                            double d21 = floatValue;
                                            bq5Var2.b(new j18(new vg8[]{new vg8(d16, d19, d20), new vg8((d14 * d21) + d12, (d18 * d21) + d17, d20, 0)}));
                                            double cos2 = Math.cos(d11 + 2.5918139392115793d);
                                            double sin2 = Math.sin(d11 + 2.748893571891069d);
                                            double d22 = vg8Var4.a;
                                            double d23 = cos2 * d13;
                                            double d24 = fArr5[0];
                                            double d25 = sin2 * d13;
                                            bq5Var2.b(new j18(new vg8[]{new vg8((d23 * d24) + d22, (d24 * d25) + d17, d20), new vg8((d23 * d21) + d22, (d25 * d21) + d17, d20, 0)}));
                                            boolean[] zArr2 = zArr;
                                            if (!zArr2[0] && floatValue > 0.4f) {
                                                zArr2[0] = true;
                                                yw0.y.a();
                                            }
                                            fArr5[0] = floatValue;
                                        }
                                    });
                                    bq5Var.r.addListener(new ad5(bq5Var, b2));
                                    bq5Var.r.setDuration(240L);
                                    bq5Var.r.setInterpolator(k43.h);
                                    bq5Var.r.start();
                                }
                            }
                            bq5Var.a.getPainting().c(null, bq5Var.a.getCurrentColor(), true, new yp5(bq5Var, objArr3 == true ? 1 : 0));
                        } else {
                            ValueAnimator valueAnimator2 = painting.L;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            painting.L = ofFloat2;
                            byte b3 = 1;
                            ofFloat2.addUpdateListener(new ix7(painting, b3));
                            painting.L.addListener(new mx7(painting, b3));
                            painting.L.setInterpolator(k43.h);
                            painting.L.setDuration(350L);
                            painting.L.start();
                            yw0.n.a();
                        }
                        bq5Var.n = 0;
                        bq5Var.o = 0;
                        bq5Var.j = false;
                        bq5Var.b = false;
                        bq5Var.p = 0.0d;
                        bq5Var.q = 0.0d;
                        oa9 oa9Var2 = bq5Var.a.a;
                        if (oa9Var2 != null) {
                            oa9Var2.O();
                            return;
                        }
                        return;
                    }
                    if (actionMasked2 != 2) {
                        if (actionMasked2 == 3) {
                            if (bq5Var.z) {
                                bq5Var.z = false;
                                return;
                            }
                            bq5Var.l = false;
                            bq5Var.s.c();
                            nx7 painting2 = bq5Var.a.getPainting();
                            if (painting2.L != null) {
                                b = 1;
                            } else {
                                b = 1;
                                painting2.f.f(new jx7(painting2, objArr2 == true ? 1 : 0, b));
                            }
                            hl.r(bq5Var.y);
                            nx7 painting3 = bq5Var.a.getPainting();
                            painting3.f.f(new kx7(painting3, b));
                            bq5Var.n = 0;
                            bq5Var.o = 0;
                            bq5Var.j = false;
                            bq5Var.b = false;
                            bq5Var.p = 0.0d;
                            bq5Var.q = 0.0d;
                            v01 v01Var = bq5Var.A;
                            if (v01Var != null) {
                                bq5Var.a.g(v01Var);
                                bq5Var.A = null;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                if (bq5Var.z) {
                    if (!bq5Var.b) {
                        bq5Var.b = true;
                        bq5Var.e = false;
                        bq5Var.c = true;
                        bq5Var.g = vg8Var;
                        bq5Var.d = System.currentTimeMillis();
                        bq5Var.m[0] = vg8Var;
                        bq5Var.n = 1;
                        bq5Var.o = 1;
                        bq5Var.j = false;
                        bq5Var.f = true;
                        bq5Var.l = true;
                        hl.d3(bq5Var.y, ViewConfiguration.getLongPressTimeout());
                        return;
                    }
                    float a3 = vg8Var.a(bq5Var.g);
                    if (a3 >= hl.L(5.0f) / scaleX) {
                        if (bq5Var.l && (a3 > hl.L(6.0f) / scaleX || bq5Var.n > 4)) {
                            bq5Var.l = false;
                            hl.r(bq5Var.y);
                        }
                        if (!bq5Var.e) {
                            oa9 oa9Var3 = bq5Var.a.a;
                            if (oa9Var3 != null) {
                                oa9Var3.R();
                            }
                            bq5Var.e = true;
                            if (z && (bq5Var.a.getCurrentBrush() instanceof t01)) {
                                bq5Var.A = bq5Var.a.getCurrentBrush();
                                bq5Var.a.g((v01) bp1.m(1, v01.a));
                            }
                        }
                        bq5Var.m[bq5Var.n] = vg8Var;
                        if (bq5Var.a.getPainting() == null || !bq5Var.a.getPainting().G) {
                            if (System.currentTimeMillis() - bq5Var.d > 3000) {
                                bq5Var.s.c();
                                nx7 painting4 = bq5Var.a.getPainting();
                                if (painting4.L == null) {
                                    painting4.f.f(new jx7(painting4, objArr == true ? 1 : 0, (byte) 1));
                                }
                            } else if ((bq5Var.a.getCurrentBrush() instanceof t01) || (bq5Var.a.getCurrentBrush() instanceof q01)) {
                                yca ycaVar = bq5Var.s;
                                boolean z3 = a3 > ((float) hl.L(6.0f)) / scaleX;
                                synchronized (ycaVar) {
                                    ycaVar.b.add(new wca(d6, d7));
                                    z2 = ycaVar.b.size() >= 8;
                                }
                                if (z2) {
                                    uo3 uo3Var = yca.m;
                                    vca vcaVar = ycaVar.l;
                                    AtomicBoolean atomicBoolean = ycaVar.k;
                                    if (!ycaVar.j.get()) {
                                        if (atomicBoolean.get() && !ycaVar.d && z3) {
                                            uo3Var.cancelRunnable(vcaVar);
                                            uo3Var.postRunnable(vcaVar, 150L);
                                        }
                                        if (!atomicBoolean.get()) {
                                            r5 = 1;
                                            atomicBoolean.set(true);
                                            uo3Var.postRunnable(vcaVar, 150L);
                                            i = bq5Var.n + r5;
                                            bq5Var.n = i;
                                            bq5Var.o += r5;
                                            if (i == 3) {
                                                vg8[] vg8VarArr = bq5Var.m;
                                                vg8 vg8Var4 = vg8VarArr[2];
                                                double d11 = vg8Var4.b;
                                                vg8 vg8Var5 = vg8VarArr[r5];
                                                float atan2 = (float) Math.atan2(d11 - vg8Var5.b, vg8Var4.a - vg8Var5.a);
                                                if (bq5Var.j) {
                                                    float a4 = ete.a(a3 / (hl.L(16.0f) / scaleX), 0.0f, 1.0f);
                                                    if (a4 > 0.4f) {
                                                        double d12 = 1.0f - a4;
                                                        double d13 = bq5Var.k;
                                                        double d14 = a4;
                                                        double d15 = atan2;
                                                        bq5Var.k = (float) Math.atan2((Math.sin(d15) * d14) + (Math.sin(d13) * d12), ik8.d(d15, d14, Math.cos(d13) * d12));
                                                    }
                                                } else {
                                                    bq5Var.k = atan2;
                                                    bq5Var.j = r5;
                                                }
                                                bq5Var.c(false, bq5Var.a.getCurrentBrush().i());
                                            }
                                            bq5Var.g = vg8Var;
                                            if (a3 > hl.L(8.0f) / scaleX) {
                                                bq5Var.h = vg8Var;
                                            }
                                            bq5Var.w = ete.a((currentTimeMillis / 75.0f) + bq5Var.w, 0.6f, 1.0f);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        r5 = 1;
                        i = bq5Var.n + r5;
                        bq5Var.n = i;
                        bq5Var.o += r5;
                        if (i == 3) {
                        }
                        bq5Var.g = vg8Var;
                        if (a3 > hl.L(8.0f) / scaleX) {
                        }
                        bq5Var.w = ete.a((currentTimeMillis / 75.0f) + bq5Var.w, 0.6f, 1.0f);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        if (bq5Var.a.getCurrentBrush() != null) {
        }
        float[] fArr32 = bq5Var.u;
        double d62 = fArr32[0];
        double d72 = fArr32[1];
        double d82 = f18;
        vg8 vg8Var6 = new vg8(d62, d72, d82);
        if (actionMasked2 != 0) {
        }
        if (bq5Var.z) {
        }
    }

    public final void f(Runnable runnable) {
        na9 na9Var = this.d;
        if (na9Var == null) {
            return;
        }
        na9Var.postRunnable(new yz8(this, runnable, (byte) 8));
    }

    public v01 getCurrentBrush() {
        return this.y;
    }

    public int getCurrentColor() {
        return this.x;
    }

    public float getCurrentWeight() {
        return this.w;
    }

    public nx7 getPainting() {
        return this.c;
    }

    public a9c getUndoStore() {
        return this.b;
    }

    public final void h() {
        this.E = true;
        if (this.d != null) {
            f(new ja9(this, (byte) 1));
        }
        setVisibility(8);
    }

    public final void i() {
        if (this.d == null) {
            return;
        }
        Matrix matrix = new Matrix();
        nx7 nx7Var = this.c;
        float width = nx7Var != null ? getWidth() / nx7Var.g.a : 1.0f;
        float f = width > 0.0f ? width : 1.0f;
        qma qmaVar = getPainting().g;
        matrix.preTranslate(getWidth() / 2.0f, getHeight() / 2.0f);
        matrix.preScale(f, -f);
        matrix.preTranslate((-qmaVar.a) / 2.0f, (-qmaVar.b) / 2.0f);
        if (this.y instanceof u01) {
            dda ddaVar = this.f;
            ddaVar.getClass();
            Matrix matrix2 = new Matrix();
            ddaVar.o = matrix2;
            matrix.invert(matrix2);
        } else {
            bq5 bq5Var = this.e;
            bq5Var.getClass();
            Matrix matrix3 = new Matrix();
            bq5Var.t = matrix3;
            matrix.invert(matrix3);
        }
        na9 na9Var = this.d;
        nx7Var.y = gne.c(gne.b(na9Var.n, na9Var.r), gne.a(matrix));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setBrush(v01 v01Var) {
        boolean z = this.y instanceof u01;
        dda ddaVar = this.f;
        if (z) {
            ddaVar.e();
        }
        this.y = v01Var;
        i();
        this.c.q(this.y);
        v01 v01Var2 = this.y;
        if (v01Var2 instanceof u01) {
            int n = ((u01) v01Var2).n();
            ArrayList arrayList = ddaVar.n;
            ArrayList arrayList2 = ddaVar.m;
            pa9 pa9Var = ddaVar.a;
            if (pa9Var == null || pa9Var.getPainting() == null) {
                return;
            }
            arrayList2.clear();
            arrayList.clear();
            ddaVar.h = new uca(u01.o(n));
            qma qmaVar = pa9Var.getPainting().g;
            uca ucaVar = ddaVar.h;
            float f = qmaVar.a;
            ucaVar.b = f / 2.0f;
            float f2 = qmaVar.b;
            ucaVar.c = f2 / 2.0f;
            float min = Math.min(f, f2) / 5.0f;
            ucaVar.e = min;
            ucaVar.d = min;
            ddaVar.h.f = pa9Var.getCurrentWeight();
            ddaVar.h.g = hl.L(32.0f);
            ddaVar.h.l = a78.e(yac.t0).k;
            byte b = 4;
            byte b2 = 1;
            byte b3 = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            if (ddaVar.h.a.n() == 4) {
                uca ucaVar2 = ddaVar.h;
                float f3 = qmaVar.a / 2.0f;
                ucaVar2.d = f3;
                ucaVar2.b = f3;
                ucaVar2.i = f3 + 1.0f;
                float f4 = qmaVar.b;
                float f5 = f4 / 3.0f;
                float f6 = 1.0f * f5;
                ucaVar2.c = f6;
                float f7 = f4 / 2.0f;
                ucaVar2.j = f7;
                ucaVar2.e = f5 * 2.0f;
                ucaVar2.k = Math.abs(f6 - f7);
                zca zcaVar = new zca(ddaVar, b3);
                arrayList2.add(zcaVar);
                ada adaVar = new ada(ddaVar, zcaVar, objArr3 == true ? 1 : 0);
                arrayList2.add(adaVar);
                arrayList.add(adaVar);
                ada adaVar2 = new ada(ddaVar, zcaVar, b2);
                arrayList2.add(adaVar2);
                arrayList.add(adaVar2);
            }
            if (ddaVar.h.a.n() == 0) {
                arrayList2.add(new zca(ddaVar, b2));
            }
            byte b4 = 2;
            if (ddaVar.h.a.n() == 2) {
                arrayList2.add(new zca(ddaVar, b4));
            }
            byte b5 = 3;
            if (ddaVar.h.a.n() == 1 || ddaVar.h.a.n() == 3) {
                arrayList2.add(new bda(ddaVar, ddaVar.h, false, false));
                arrayList2.add(new bda(ddaVar, ddaVar.h, true, false));
                arrayList2.add(new bda(ddaVar, ddaVar.h, false, true));
                arrayList2.add(new bda(ddaVar, ddaVar.h, true, true));
                arrayList2.add(new zca(ddaVar, b5, objArr == true ? 1 : 0));
            }
            if (ddaVar.h.a.n() == 3) {
                uca ucaVar3 = ddaVar.h;
                ucaVar3.i = (ucaVar3.d * 0.8f) + ucaVar3.b;
                ucaVar3.j = (ucaVar3.e * 1.2f) + ucaVar3.c + ucaVar3.f;
                zca zcaVar2 = new zca(ddaVar, b);
                arrayList2.add(zcaVar2);
                zcaVar2.b = false;
                arrayList.add(zcaVar2);
            }
            ddaVar.l = new zca(ddaVar, (byte) 5, objArr2 == true ? 1 : 0);
            if (ddaVar.h.a.n() != 4) {
                ddaVar.l.c = false;
            }
            zca zcaVar3 = ddaVar.l;
            zcaVar3.b = false;
            arrayList.add(zcaVar3);
            arrayList2.add(ddaVar.l);
            pa9Var.getPainting().k(ddaVar.h);
        }
    }

    public void setBrushSize(float f) {
        float f2 = this.c.g.a;
        this.w = c00.x(f2, 0.043945312f, f, 0.00390625f * f2);
        if (this.y instanceof u01) {
            dda ddaVar = this.f;
            pa9 pa9Var = ddaVar.a;
            uca ucaVar = ddaVar.h;
            if (ucaVar == null || ucaVar.f == pa9Var.getCurrentWeight()) {
                return;
            }
            ddaVar.h.f = pa9Var.getCurrentWeight();
            pa9Var.getPainting().k(ddaVar.h);
        }
    }

    public void setColor(int i) {
        this.x = i;
        if (this.y instanceof u01) {
            dda ddaVar = this.f;
            if (ddaVar.h != null) {
                ddaVar.a.getPainting().k(ddaVar.h);
            }
        }
    }

    public void setDelegate(oa9 oa9Var) {
        this.a = oa9Var;
    }

    public void setUndoStore(a9c a9cVar) {
        this.b = a9cVar;
    }

    public void g(v01 v01Var) {
    }

    public void setQueue(uo3 uo3Var) {
    }
}
