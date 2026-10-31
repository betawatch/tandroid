package qh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.k9;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c extends View {
    public static final long f0 = System.currentTimeMillis();
    public static final String[] g0 = new String[100];
    public float D;
    public long E;
    public final RectF F;
    public float G;
    public float H;
    public final k9 I;
    public final Path J;
    public float K;
    public final RectF L;
    public final RectF M;
    public final WeakHashMap N;
    public final Path O;
    public final int[] P;
    public LinearGradient Q;
    public final Paint R;
    public final Paint.FontMetrics S;
    public m T;
    public float U;
    public float V;
    public float W;
    public final k2.m0 a;
    public long a0;
    public g0 b;
    public long b0;
    public final Paint c;
    public boolean c0;
    public final Paint d;
    public final int[] d0;
    public final TextPaint e;
    public final RectF e0;
    public final int[] f;
    public final int[] h;
    public final HashMap n;
    public final ArrayList r;
    public final ArrayList s;
    public final ArrayList w;
    public float x;
    public float y;

    public c(Activity activity, k2.m0 m0Var) {
        super(activity);
        this.c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        new RectF();
        this.f = new int[2];
        this.h = new int[2];
        this.n = new HashMap();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.F = new RectF();
        this.G = Float.NaN;
        this.H = -1.0f;
        this.I = new k9(3);
        this.J = new Path();
        this.K = Float.NaN;
        this.L = new RectF();
        this.M = new RectF();
        this.N = new WeakHashMap();
        this.O = new Path();
        this.P = new int[2];
        this.R = new Paint(1);
        this.S = new Paint.FontMetrics();
        this.U = Float.NaN;
        this.W = 0.45f;
        this.d0 = new int[2];
        this.e0 = new RectF();
        this.a = m0Var;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(10.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.STROKE);
    }

    public static long b() {
        return System.currentTimeMillis() - f0;
    }

    public static float c(float[] fArr, long j10) {
        float min = Math.min(1.0f, (j10 - ((long) fArr[2])) / 180.0f);
        float f7 = fArr[1];
        float f10 = fArr[0] - f7;
        float max = 1.0f - Math.max(0.0f, Math.min(1.0f, min));
        return ((1.0f - ((max * max) * max)) * f10) + f7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
    
        if ((r8 - ((long) r3)) < 200) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Canvas canvas, ViewGroup viewGroup, List list, long j10) {
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float min;
        float f18;
        float f19;
        float f20;
        float f21;
        String valueOf;
        String valueOf2;
        float sin;
        c cVar = this;
        Canvas canvas2 = canvas;
        List list2 = list;
        long j11 = j10;
        boolean z10 = false;
        int i10 = 0;
        while (i10 < viewGroup.getChildCount()) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof l) {
                    l lVar = (l) childAt;
                    String key = lVar.getKey();
                    if (key != null) {
                        int indexOf = list2.indexOf(key);
                        HashMap hashMap = cVar.n;
                        float[] fArr = (float[]) hashMap.get(key);
                        if (indexOf >= 0) {
                            int i11 = 0;
                            f7 = 0.0f;
                            for (int i12 = 0; i12 < indexOf; i12++) {
                                if (list2.indexOf(list2.get(i12)) == i12) {
                                    i11++;
                                }
                            }
                            f10 = 1.0f;
                            int i13 = i11 + 1;
                            if (fArr == null) {
                                float f22 = i13;
                                fArr = new float[]{1.0f, 0.0f, j11, f22, f22, 0.0f};
                                hashMap.put(key, fArr);
                            } else {
                                if (fArr[0] != 1.0f) {
                                    fArr[1] = c(fArr, j11);
                                    fArr[0] = 1.0f;
                                    fArr[2] = j11;
                                }
                                float f23 = fArr[3];
                                float f24 = i13;
                                if (f23 != f24) {
                                    fArr[4] = f23;
                                    fArr[3] = f24;
                                    fArr[5] = j11;
                                }
                            }
                        } else {
                            f7 = 0.0f;
                            f10 = 1.0f;
                            if (fArr != null && fArr[0] != 0.0f) {
                                fArr[1] = c(fArr, j11);
                                fArr[0] = 0.0f;
                                fArr[2] = j11;
                            }
                        }
                        float c10 = fArr == null ? f7 : c(fArr, j11);
                        if (fArr != null && c10 < 0.001f && fArr[0] == f7) {
                            hashMap.remove(key);
                        }
                        float f25 = f10 - (0.1f * c10);
                        if (Math.abs(lVar.n - f25) > 5.0E-4f) {
                            lVar.n = f25;
                            lVar.invalidate();
                            if (lVar.getParent() instanceof View) {
                                ((View) lVar.getParent()).invalidate();
                            }
                        }
                        if (childAt.getAlpha() != f10) {
                            childAt.setAlpha(f10);
                        }
                        if (fArr != null) {
                            if (j11 - ((long) fArr[2]) >= 200) {
                                float f26 = fArr[5];
                                if (f26 != f7) {
                                }
                            }
                            z10 = true;
                        }
                        if (c10 > 0.004f && fArr != null) {
                            int[] iArr = cVar.f;
                            childAt.getLocationOnScreen(iArr);
                            int i14 = iArr[0];
                            int[] iArr2 = cVar.h;
                            float f27 = i14 - iArr2[0];
                            float f28 = iArr[1] - iArr2[1];
                            float width = childAt.getWidth();
                            childAt.getHeight();
                            if (fArr[0] == 1.0f) {
                                f11 = 0.004f;
                                f12 = f28;
                                double d = (j11 - ((long) fArr[2])) / 1000.0d;
                                if (d <= 0.0d) {
                                    f13 = 0.3f;
                                    f14 = f27;
                                    sin = f7;
                                } else {
                                    double d10 = 6.283185307179586d / 0.3f;
                                    double sqrt = d10 / Math.sqrt(0.6975f);
                                    double d11 = d * d10;
                                    f13 = 0.3f;
                                    f14 = f27;
                                    sin = (float) (1.0d - (((Math.sin(d11) * ((0.55f * sqrt) / d10)) + Math.cos(d11)) * Math.exp(((-0.55f) * sqrt) * d)));
                                }
                                f15 = (sin * 0.4f) + 0.6f;
                            } else {
                                f11 = 0.004f;
                                f12 = f28;
                                f13 = 0.3f;
                                f14 = f27;
                                f15 = (0.4f * c10) + 0.6f;
                            }
                            float f29 = f15;
                            boolean z11 = (fArr[0] != 1.0f || j10 - ((long) fArr[2]) >= 600) ? z10 : true;
                            float L = (f14 + width) - org.telegram.messenger.i0.L(9.5f);
                            float L2 = f12 + org.telegram.messenger.i0.L(9.5f);
                            float min2 = Math.min(1.0f, c10 * 1.2f);
                            float L3 = f12 + org.telegram.messenger.i0.L(9.5f);
                            if (Float.isNaN(cVar.G)) {
                                f16 = 1.0f;
                            } else {
                                float f30 = cVar.G;
                                cVar.G = f30;
                                float L4 = org.telegram.messenger.i0.L(10.0f);
                                float max = Math.max(f7, Math.min(1.0f, (L3 - (f30 - L4)) / L4));
                                f16 = 1.0f - ((3.0f - (max * 2.0f)) * (max * max));
                            }
                            float f31 = min2 * f16;
                            if (f31 > f11 && f29 > 0.01f) {
                                float L5 = org.telegram.messenger.i0.L(8.0f);
                                if (cVar.Q == null) {
                                    cVar.Q = new LinearGradient(0.0f, -L5, 0.0f, L5, 1946157055, 536870911, Shader.TileMode.CLAMP);
                                    Paint.Style style = Paint.Style.STROKE;
                                    Paint paint = cVar.R;
                                    paint.setStyle(style);
                                    paint.setShader(cVar.Q);
                                }
                                canvas2.save();
                                canvas2.translate(L, L2);
                                canvas2.scale(f29, f29);
                                Path path = cVar.O;
                                path.rewind();
                                path.addCircle(0.0f, 0.0f, L5, Path.Direction.CW);
                                canvas2.save();
                                canvas2.clipPath(path);
                                if (f31 < 0.999f) {
                                    float f32 = -L5;
                                    canvas2.saveLayerAlpha(f32, f32, L5, L5, (int) (f31 * 255.0f));
                                }
                                k2.m0 m0Var = cVar.a;
                                x0 x0Var = ((i0) m0Var.a).d;
                                int[] iArr3 = cVar.P;
                                x0Var.getLocationOnScreen(iArr3);
                                float f33 = 1.0f / f29;
                                canvas2.scale(f33, f33);
                                canvas2.translate(-L, -L2);
                                float f34 = iArr2[0] - iArr3[0];
                                float f35 = iArr2[1] - iArr3[1];
                                x0 x0Var2 = ((i0) m0Var.a).d;
                                if (!x0Var2.j0(canvas2) && x0Var2.Y2 != null) {
                                    canvas2.save();
                                    canvas2.translate(-f34, -f35);
                                    Bitmap bitmap = x0Var2.Y2;
                                    if (bitmap != null) {
                                        x0Var2.y(canvas2, bitmap);
                                    }
                                    canvas2.restore();
                                } else if (u.f() && x0Var2.j0(canvas2)) {
                                    canvas2.save();
                                    canvas2.translate(-f34, -f35);
                                    Object obj = x0Var2.H1;
                                    canvas2.save();
                                    canvas2.scale(9.0f, 9.0f);
                                    u.c(canvas2, obj);
                                    canvas2.restore();
                                    canvas2.restore();
                                } else {
                                    v0 v0Var = x0Var2.n;
                                    canvas2.drawColor(i0.b.o(v0Var != null ? i0.b.f(0.5f, v0Var.b, v0Var.c) : -12947803, zs.B3));
                                }
                                canvas2.translate(L, L2);
                                canvas2.scale(f29, f29);
                                Paint paint2 = cVar.c;
                                paint2.setColor(788529151);
                                canvas2.drawCircle(0.0f, 0.0f, L5, paint2);
                                if (f31 < 0.999f) {
                                    canvas2.restore();
                                }
                                canvas2.restore();
                                float N = org.telegram.messenger.i0.N(0.6f);
                                Paint paint3 = cVar.d;
                                paint3.setStrokeWidth(N);
                                paint3.setColor(1207959551);
                                paint3.setAlpha((int) (71.0f * f31));
                                canvas2.drawCircle(0.0f, 0.0f, L5 - org.telegram.messenger.i0.N(f13), paint3);
                                float L6 = org.telegram.messenger.i0.L(10.0f);
                                TextPaint textPaint = cVar.e;
                                textPaint.setTextSize(L6);
                                textPaint.setColor(-1);
                                Paint.FontMetrics fontMetrics = cVar.S;
                                textPaint.getFontMetrics(fontMetrics);
                                float f36 = (-(fontMetrics.ascent + fontMetrics.descent)) / 2.0f;
                                if (fArr[5] == 0.0f) {
                                    min = 1.0f;
                                    f17 = 1.0f;
                                } else {
                                    f17 = 1.0f;
                                    min = Math.min(1.0f, (j10 - ((long) r4)) / 200.0f);
                                }
                                String[] strArr = g0;
                                if (min < f17) {
                                    float f37 = (f17 - min) * f31;
                                    f20 = 4.0f;
                                    f21 = 89.0f;
                                    f18 = 0.5f;
                                    textPaint.setShadowLayer(org.telegram.messenger.i0.N(1.5f), 0.0f, org.telegram.messenger.i0.N(0.5f), Color.argb((int) (f37 * 89.0f), 0, 0, 0));
                                    textPaint.setAlpha((int) (f37 * 255.0f));
                                    int i15 = (int) fArr[4];
                                    if (i15 < 0 || i15 >= strArr.length) {
                                        valueOf2 = String.valueOf(i15);
                                    } else {
                                        valueOf2 = strArr[i15];
                                        if (valueOf2 == null) {
                                            valueOf2 = String.valueOf(i15);
                                            strArr[i15] = valueOf2;
                                        }
                                    }
                                    f19 = 0.0f;
                                    canvas2.drawText(valueOf2, 0.0f, f36 - (org.telegram.messenger.i0.L(4.0f) * min), textPaint);
                                } else {
                                    f18 = 0.5f;
                                    f19 = 0.0f;
                                    f20 = 4.0f;
                                    f21 = 89.0f;
                                }
                                float f38 = f31 * min;
                                textPaint.setShadowLayer(org.telegram.messenger.i0.N(1.5f), f19, org.telegram.messenger.i0.N(f18), Color.argb((int) (f38 * f21), 0, 0, 0));
                                textPaint.setAlpha((int) (f38 * 255.0f));
                                int i16 = (int) fArr[3];
                                if (i16 < 0 || i16 >= strArr.length) {
                                    valueOf = String.valueOf(i16);
                                } else {
                                    valueOf = strArr[i16];
                                    if (valueOf == null) {
                                        valueOf = String.valueOf(i16);
                                        strArr[i16] = valueOf;
                                    }
                                }
                                canvas2.drawText(valueOf, 0.0f, ((1.0f - min) * org.telegram.messenger.i0.L(f20)) + f36, textPaint);
                                textPaint.clearShadowLayer();
                                canvas2.restore();
                            }
                            z10 = z11;
                        }
                    }
                } else if (childAt instanceof ViewGroup) {
                    z10 |= cVar.a(canvas2, (ViewGroup) childAt, list, j10);
                }
                i10++;
                cVar = this;
                canvas2 = canvas;
                list2 = list;
                j11 = j10;
            }
            i10++;
            cVar = this;
            canvas2 = canvas;
            list2 = list;
            j11 = j10;
        }
        return z10;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0351, code lost:
    
        if (r8.isEmpty() == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0354, code lost:
    
        r10 = r7;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0568, code lost:
    
        if (java.lang.Math.abs(r13.y - r11) > 0.003f) goto L238;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        c cVar;
        ArrayList arrayList;
        boolean z10;
        float f7;
        RectF rectF;
        long min;
        float f10;
        boolean z11;
        boolean z12;
        ArrayList arrayList2;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float pow;
        float f17;
        float f18;
        float f19;
        float c10;
        int i10;
        int size;
        boolean z13;
        float f20;
        int i11;
        float u10;
        float f21;
        RectF rectF2;
        float f22;
        float f23;
        RectF rectF3;
        g0 g0Var;
        RectF rectF4;
        b bVar;
        float f24;
        boolean z14;
        float f25;
        float f26;
        k2.m0 m0Var = this.a;
        i0 i0Var = (i0) m0Var.a;
        i0 i0Var2 = (i0) m0Var.a;
        ArrayList arrayList3 = i0Var.d.I;
        long b10 = b();
        g0 g0Var2 = this.b;
        int[] iArr = this.h;
        RectF rectF5 = this.F;
        if (g0Var2 != null) {
            getLocationOnScreen(iArr);
            canvas.save();
            if (!Float.isNaN(this.K)) {
                canvas.clipRect(0.0f, this.K, getWidth(), getHeight());
            }
            if (this.y > 0.003f && !rectF5.isEmpty()) {
                Path path = this.J;
                path.rewind();
                path.addRoundRect(rectF5, rectF5.height() / 2.0f, rectF5.height() / 2.0f, Path.Direction.CW);
                u.b(canvas, path);
            }
            z10 = a(canvas, this.b, arrayList3, b10);
            cVar = this;
            arrayList = arrayList3;
            canvas.restore();
        } else {
            cVar = this;
            arrayList = arrayList3;
            z10 = false;
        }
        long j10 = cVar.b0;
        if (j10 == 0) {
            min = 16;
            f7 = 2.0f;
            rectF = rectF5;
        } else {
            f7 = 2.0f;
            rectF = rectF5;
            min = Math.min(64L, b10 - j10);
        }
        long j11 = cVar.b0;
        if (j11 != 0 && b10 - j11 > 200) {
            cVar.V = (cVar.c0 || b10 - cVar.a0 < 900) ? 1.0f : 0.0f;
        }
        cVar.b0 = b10;
        m mVar = cVar.T;
        Paint paint = cVar.c;
        float f27 = 0.5f;
        if (mVar == null || Float.isNaN(cVar.U) || Float.isNaN(cVar.G) || !cVar.T.G) {
            f10 = 0.6f;
            z11 = true;
            z12 = false;
        } else {
            if (cVar.c0) {
                f24 = 0.6f;
                z11 = true;
            } else {
                f24 = 0.6f;
                z11 = true;
                z11 = true;
                if (b10 - cVar.a0 >= 900) {
                    z14 = false;
                    f25 = !z14 ? 1.0f : 0.0f;
                    f26 = cVar.V;
                    if (f26 >= f25) {
                        f10 = f24;
                        cVar.V = f1.e(min, 120.0f, f26, f25);
                    } else {
                        f10 = f24;
                        if (f26 > f25) {
                            cVar.V = f1.v(min, 250.0f, f26, f25);
                        }
                    }
                    float f28 = !cVar.c0 ? f10 : 0.45f;
                    float f29 = cVar.W;
                    float min2 = (Math.min(1.0f, min / 80.0f) * (f28 - f29)) + f29;
                    cVar.W = min2;
                    z12 = (!z14 || cVar.V > 0.0f || Math.abs(min2 - f28) > 0.004f) ? z11 ? 1 : 0 : false;
                    if (cVar.V > 0.004f) {
                        int computeVerticalScrollRange = cVar.T.computeVerticalScrollRange();
                        int computeVerticalScrollExtent = cVar.T.computeVerticalScrollExtent();
                        int computeVerticalScrollOffset = cVar.T.computeVerticalScrollOffset();
                        if (computeVerticalScrollRange > computeVerticalScrollExtent && computeVerticalScrollExtent > 0) {
                            m mVar2 = cVar.T;
                            int[] iArr2 = cVar.d0;
                            mVar2.getLocationOnScreen(iArr2);
                            cVar.getLocationOnScreen(iArr);
                            float paddingTop = cVar.T.getPaddingTop() + (iArr2[z11 ? 1 : 0] - iArr[z11 ? 1 : 0]);
                            float L = ((cVar.y <= 0.5f || rectF.isEmpty()) ? cVar.G - org.telegram.messenger.i0.L(10.0f) : Math.min(cVar.G - org.telegram.messenger.i0.L(10.0f), rectF.top - org.telegram.messenger.i0.L(6.0f))) - paddingTop;
                            if (L > org.telegram.messenger.i0.L(30.0f)) {
                                float max = Math.max(org.telegram.messenger.i0.L(28.0f), (computeVerticalScrollExtent * L) / computeVerticalScrollRange);
                                float z15 = c3.i0.z(L, max, Math.max(0.0f, Math.min(1.0f, computeVerticalScrollOffset / (computeVerticalScrollRange - computeVerticalScrollExtent))), paddingTop);
                                float width = cVar.getWidth() - org.telegram.messenger.i0.L(3.0f);
                                RectF rectF6 = cVar.e0;
                                rectF6.set(width - org.telegram.messenger.i0.L(3.0f), z15, width, max + z15);
                                paint.setColor(-1);
                                paint.setAlpha((int) (cVar.W * 255.0f * cVar.V));
                                canvas.drawRoundRect(rectF6, org.telegram.messenger.i0.N(1.5f), org.telegram.messenger.i0.N(1.5f), paint);
                            }
                        }
                    }
                }
            }
            z14 = z11 ? 1 : 0;
            if (!z14) {
            }
            f26 = cVar.V;
            if (f26 >= f25) {
            }
            if (!cVar.c0) {
            }
            float f292 = cVar.W;
            float min22 = (Math.min(1.0f, min / 80.0f) * (f28 - f292)) + f292;
            cVar.W = min22;
            if (z14) {
            }
            if (cVar.V > 0.004f) {
            }
        }
        boolean z16 = z10 | z12;
        ArrayList arrayList4 = cVar.s;
        arrayList4.clear();
        int i12 = 0;
        while (true) {
            int size2 = arrayList.size();
            arrayList2 = cVar.r;
            if (i12 >= size2) {
                break;
            }
            String str = (String) arrayList.get(i12);
            int i13 = 0;
            while (true) {
                if (i13 >= arrayList2.size()) {
                    bVar = null;
                    break;
                }
                bVar = (b) arrayList2.get(i13);
                if (!bVar.d && !arrayList4.contains(bVar) && bVar.a.equals(str)) {
                    break;
                } else {
                    i13++;
                }
            }
            if (bVar == null) {
                bVar = new b();
                bVar.b = Float.NaN;
                bVar.a = str;
            }
            arrayList4.add(bVar);
            i12++;
        }
        int i14 = 0;
        while (i14 < arrayList2.size()) {
            b bVar2 = (b) arrayList2.get(i14);
            if (!bVar2.d && !arrayList4.contains(bVar2)) {
                bVar2.d = z11;
            }
            i14++;
            z11 = true;
        }
        ArrayList arrayList5 = cVar.w;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            if (((b) arrayList2.get(i15)).d) {
                arrayList5.add(Math.min(i15, arrayList5.size()), (b) arrayList2.get(i15));
            }
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList5);
        int i16 = 0;
        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
            if (!((b) arrayList2.get(i17)).d) {
                i16++;
            }
        }
        float L2 = i16 == 0 ? org.telegram.messenger.i0.L(50.0f) : org.telegram.messenger.i0.L(16.0f) + (org.telegram.messenger.i0.L(34.0f) * i16);
        if (Float.isNaN(cVar.x)) {
            f11 = 0.0f;
        } else {
            float f30 = cVar.x;
            f11 = 0.0f;
            if (f30 != 0.0f) {
                f12 = c3.i0.z(L2, f30, 0.25f, f30);
                cVar.x = f12;
                f13 = i16 <= 0 ? 1.0f : f11;
                long b11 = b();
                float min3 = cVar.E != 0 ? Math.min(64.0f, b11 - r9) : 16.0f;
                cVar.E = b11;
                f14 = cVar.y;
                if (f14 >= f13) {
                    cVar.y = f1.e(min3, 260.0f, f14, f13);
                } else if (f14 > f13) {
                    cVar.y = f1.v(min3, 260.0f, f14, f13);
                }
                if (cVar.y <= 0.003f) {
                    rectF4 = rectF;
                }
                float L3 = org.telegram.messenger.i0.L(44.0f);
                float width2 = cVar.getWidth() / f7;
                f15 = cVar.y;
                if (f15 >= 0.5f) {
                    pow = f15 * f7 * f15;
                    f16 = 34.0f;
                } else {
                    f16 = 34.0f;
                    pow = 1.0f - (((float) Math.pow((f15 * (-2.0f)) + f7, 2.0d)) / f7);
                }
                cVar = this;
                if (pow < 0.4f) {
                    f17 = f16;
                    f18 = c3.i0.z(cVar.x, L3, (pow - 0.4f) / f10, L3);
                } else {
                    f17 = f16;
                    f18 = L3;
                }
                if (pow < 0.4f) {
                    f19 = L3;
                    c10 = 1.0f;
                } else {
                    f19 = L3;
                    c10 = a1.g.c(pow, 0.4f, 0.39999998f, f10);
                }
                float f31 = pow < 0.4f ? 1.0f : pow / 0.4f;
                cVar.D = f31;
                float min4 = Math.min(1.0f, f18 / Math.max(1.0f, cVar.x)) * c10;
                float height = (cVar.getHeight() - org.telegram.messenger.i0.N(18.666666f)) - (f19 / f7);
                float f32 = (f18 * c10) / f7;
                float f33 = (c10 * f19) / f7;
                rectF.set(width2 - f32, height - f33, f32 + width2, height + f33);
                float height2 = rectF.height() / f7;
                v0 v0Var = i0Var2.d.n;
                paint.setColor(v0Var == null ? v0Var.h : 872415231);
                paint.setAlpha((int) (Color.alpha(i0Var2.d.n == null ? r2.h : 872415231) * f31));
                canvas.drawRoundRect(rectF, height2, height2, paint);
                paint.setColor(872415231);
                paint.setAlpha((int) (51.0f * f31));
                canvas.drawRoundRect(rectF, height2, height2, paint);
                RectF rectF7 = rectF;
                cVar.I.a(canvas, rectF7, height2, 0, f31);
                RectF rectF8 = rectF7;
                canvas.save();
                canvas.clipRect(rectF8);
                i10 = 0;
                int i18 = 0;
                while (i10 < arrayList2.size()) {
                    b bVar3 = (b) arrayList2.get(i10);
                    int i19 = i10;
                    float b12 = z20.b(i18, f27, org.telegram.messenger.i0.L(f17), (width2 - (cVar.x / f7)) + org.telegram.messenger.i0.L(8.0f));
                    if (!bVar3.d) {
                        i18++;
                    }
                    if (Float.isNaN(bVar3.b)) {
                        bVar3.b = b12;
                    }
                    boolean z17 = bVar3.d;
                    if (!z17) {
                        float f34 = bVar3.b;
                        bVar3.b = c3.i0.z(b12, f34, 0.3f, f34);
                    }
                    float f35 = bVar3.c;
                    float z18 = c3.i0.z(z17 ? f11 : 1.0f, f35, 0.28f, f35);
                    bVar3.c = z18;
                    if (Math.abs(z18 - (z17 ? f11 : 1.0f)) > 0.004f || Math.abs(b12 - bVar3.b) > 0.5f) {
                        z16 = true;
                    }
                    Drawable U = i0Var2.d.U(bVar3.a);
                    if (U == null) {
                        i11 = i18;
                    } else {
                        float L4 = org.telegram.messenger.i0.L(26.0f);
                        if (bVar3.d) {
                            f21 = bVar3.c;
                            i11 = i18;
                            f20 = 1.0f;
                        } else {
                            float f36 = bVar3.c;
                            f20 = 1.0f;
                            if (f36 >= 1.0f) {
                                i11 = i18;
                                u10 = 1.0f;
                            } else {
                                float f37 = f36 - 1.0f;
                                i11 = i18;
                                u10 = c3.i0.u(f37, 1.4f, f37, (2.4f * f37 * f37 * f37) + 1.0f);
                            }
                            f21 = u10;
                        }
                        float f38 = L4 * f21 * min4;
                        if (f38 >= f20) {
                            U.setAlpha(zs.e4);
                            float z19 = c3.i0.z(bVar3.b, width2, min4, width2);
                            float f39 = f38 / f7;
                            U.setBounds((int) (z19 - f39), (int) (rectF8.centerY() - f39), (int) (z19 + f39), (int) (rectF8.centerY() + f39));
                            r.b(canvas, U);
                        }
                    }
                    i10 = i19 + 1;
                    i18 = i11;
                    f27 = 0.5f;
                }
                canvas.restore();
                for (size = arrayList2.size() - 1; size >= 0; size--) {
                    if (((b) arrayList2.get(size)).d && ((b) arrayList2.get(size)).c < 0.02f) {
                        arrayList2.remove(size);
                    }
                }
                if (Math.abs(cVar.x - L2) <= 0.5f) {
                    rectF4 = rectF8;
                }
                z13 = true;
                rectF2 = rectF8;
                f22 = cVar.y;
                f23 = cVar.H;
                rectF3 = cVar.L;
                if (f22 == f23 || !rectF2.equals(rectF3)) {
                    cVar.H = cVar.y;
                    rectF3.set(rectF2);
                    g0Var = cVar.b;
                    if (g0Var != null) {
                        g0Var.invalidate();
                    }
                }
                if (z13 && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    return;
                }
                cVar.postInvalidateOnAnimation();
            }
        }
        f12 = L2;
        cVar.x = f12;
        if (i16 <= 0) {
        }
        long b112 = b();
        if (cVar.E != 0) {
        }
        cVar.E = b112;
        f14 = cVar.y;
        if (f14 >= f13) {
        }
        if (cVar.y <= 0.003f) {
        }
        float L32 = org.telegram.messenger.i0.L(44.0f);
        float width22 = cVar.getWidth() / f7;
        f15 = cVar.y;
        if (f15 >= 0.5f) {
        }
        cVar = this;
        if (pow < 0.4f) {
        }
        if (pow < 0.4f) {
        }
        if (pow < 0.4f) {
        }
        cVar.D = f31;
        float min42 = Math.min(1.0f, f18 / Math.max(1.0f, cVar.x)) * c10;
        float height3 = (cVar.getHeight() - org.telegram.messenger.i0.N(18.666666f)) - (f19 / f7);
        float f322 = (f18 * c10) / f7;
        float f332 = (c10 * f19) / f7;
        rectF.set(width22 - f322, height3 - f332, f322 + width22, height3 + f332);
        float height22 = rectF.height() / f7;
        v0 v0Var2 = i0Var2.d.n;
        paint.setColor(v0Var2 == null ? v0Var2.h : 872415231);
        paint.setAlpha((int) (Color.alpha(i0Var2.d.n == null ? r2.h : 872415231) * f31));
        canvas.drawRoundRect(rectF, height22, height22, paint);
        paint.setColor(872415231);
        paint.setAlpha((int) (51.0f * f31));
        canvas.drawRoundRect(rectF, height22, height22, paint);
        RectF rectF72 = rectF;
        cVar.I.a(canvas, rectF72, height22, 0, f31);
        RectF rectF82 = rectF72;
        canvas.save();
        canvas.clipRect(rectF82);
        i10 = 0;
        int i182 = 0;
        while (i10 < arrayList2.size()) {
        }
        canvas.restore();
        while (size >= 0) {
        }
        if (Math.abs(cVar.x - L2) <= 0.5f) {
        }
        z13 = true;
        rectF2 = rectF82;
        f22 = cVar.y;
        f23 = cVar.H;
        rectF3 = cVar.L;
        if (f22 == f23) {
        }
        cVar.H = cVar.y;
        rectF3.set(rectF2);
        g0Var = cVar.b;
        if (g0Var != null) {
        }
        if (z13) {
        }
        cVar.postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.y >= 0.5f) {
            if (this.F.contains(motionEvent.getX(), motionEvent.getY())) {
                if (motionEvent.getActionMasked() == 1) {
                    int i11 = 0;
                    while (true) {
                        ArrayList arrayList = this.r;
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        b bVar = (b) arrayList.get(i10);
                        if (!bVar.d) {
                            if (Math.abs(motionEvent.getX() - bVar.b) < org.telegram.messenger.i0.L(34.0f) / 2.0f) {
                                x0 x0Var = ((i0) this.a.a).d;
                                ArrayList arrayList2 = x0Var.I;
                                if (i11 >= 0 && i11 < arrayList2.size()) {
                                    arrayList2.remove(i11);
                                    x0Var.c();
                                    x0Var.i0();
                                }
                                invalidate();
                                return true;
                            }
                            i11++;
                        }
                        i10++;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
