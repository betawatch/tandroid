package vh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class x extends FrameLayout implements y60 {
    public static final /* synthetic */ int x0 = 0;
    public final int D;
    public final LinearGradient E;
    public final Matrix F;
    public final s9 G;
    public final v H;
    public final org.telegram.ui.Components.t5 I;
    public final org.telegram.ui.Components.t5[] J;
    public final org.telegram.ui.Components.t5 K;
    public final float[] L;
    public final float[] M;
    public Object N;
    public Object O;
    public final RectF P;
    public final Path Q;
    public Drawable R;
    public boolean S;
    public Runnable T;
    public boolean U;
    public float V;
    public float W;
    public final FrameLayout a;
    public float a0;
    public final th.b b;
    public float b0;
    public final n4 c;
    public float c0;
    public CameraView d;
    public float d0;
    public Object e;
    public boolean e0;
    public r f;
    public boolean f0;
    public w g0;
    public final ArrayList h;
    public w h0;
    public v i0;
    public w j0;
    public boolean k0;
    public Runnable l0;
    public Runnable m0;
    public final ArrayList n;
    public boolean n0;
    public long o0;
    public boolean p0;
    public boolean q0;
    public w r;
    public z8 r0;
    public w s;
    public k4 s0;
    public boolean t0;
    public long u0;
    public boolean v0;
    public final Paint w;
    public final v w0;
    public final Path x;
    public final float[] y;

    public x(Context context, s9 s9Var, FrameLayout frameLayout, th.b bVar) {
        super(context);
        this.c = new n4(new v(this, 1));
        this.f = new r(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.n = new ArrayList();
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new float[8];
        this.H = new v(this, 2);
        gr grVar = gr.h;
        this.I = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.J = new org.telegram.ui.Components.t5[]{new org.telegram.ui.Components.t5(this, 0L, 320L, grVar), new org.telegram.ui.Components.t5(this, 0L, 320L, grVar), new org.telegram.ui.Components.t5(this, 0L, 320L, grVar), new org.telegram.ui.Components.t5(this, 0L, 320L, grVar), new org.telegram.ui.Components.t5(this, 0L, 320L, grVar)};
        this.K = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.L = new float[5];
        this.M = new float[5];
        this.P = new RectF();
        this.Q = new Path();
        this.S = true;
        this.q0 = true;
        this.t0 = true;
        this.w0 = new v(this, 3);
        this.G = s9Var;
        this.a = frameLayout;
        this.b = bVar;
        setBackgroundColor(-14737633);
        w wVar = new w(this);
        wVar.b((q) this.f.e.get(0), false);
        wVar.m = true;
        if (this.k0) {
            wVar.c.P();
        }
        arrayList.add(wVar);
        this.r = wVar;
        this.s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(8.0f));
        int L = org.telegram.messenger.i0.L(300.0f);
        this.D = L;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = linearGradient;
        this.F = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void c(x xVar, RectF rectF, q qVar) {
        int measuredWidth = xVar.getMeasuredWidth();
        int measuredHeight = xVar.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.i0.q;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        xVar.k(rectF, qVar);
        float f7 = rectF.left;
        boolean z10 = f7 <= 0.0f;
        float f10 = rectF.top;
        boolean z11 = f10 <= 0.0f;
        float f11 = measuredWidth;
        boolean z12 = rectF.right >= f11;
        float f12 = measuredHeight;
        boolean z13 = rectF.bottom >= f12;
        if (z10 && z12 && !z11 && !z13) {
            rectF.offset(0.0f, f12 - f10);
            return;
        }
        if (z11 && z13 && !z10 && !z12) {
            rectF.offset(0.0f, f11 - f7);
            return;
        }
        if (z12 && !z10) {
            rectF.offset(rectF.width(), 0.0f);
        }
        if (!z13 || z11) {
            return;
        }
        rectF.offset(0.0f, rectF.height());
    }

    public static void f(Canvas canvas, Drawable drawable, RectF rectF, float f7) {
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float max = Math.max(rectF.width() / intrinsicWidth, rectF.height() / intrinsicHeight);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
        canvas.scale(max, max);
        canvas.translate((-intrinsicWidth) / 2.0f, (-intrinsicHeight) / 2.0f);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        if (f7 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.t6.r1(drawable.getAlpha() * f7, -16777216));
        }
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.y60
    public final void a(RectF rectF) {
        w wVar = this.j0;
        if (wVar == null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            return;
        }
        q qVar = wVar.h;
        r rVar = qVar.a;
        int i10 = qVar.b;
        int i11 = qVar.c;
        float f7 = rVar.c;
        float e = this.J[i11].e(false, rVar.d[i11]);
        rectF.set((getMeasuredWidth() / e) * i10, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / e) * (i10 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
    }

    @Override // org.telegram.ui.Components.y60
    public final void b(Canvas canvas, float f7) {
        w wVar = this.j0;
        if (wVar != null) {
            q qVar = wVar.h;
            r rVar = qVar.a;
            int i10 = qVar.b;
            int i11 = qVar.c;
            float f10 = rVar.c;
            float e = this.J[i11].e(false, rVar.d[i11]);
            float measuredWidth = (getMeasuredWidth() / e) * i10;
            float measuredHeight = (getMeasuredHeight() / f10) * i11;
            float measuredWidth2 = (getMeasuredWidth() / e) * (i10 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f10) * (i11 + 1);
            RectF rectF = this.P;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.j0);
        }
    }

    public final boolean d() {
        if (this.g0 == null) {
            return false;
        }
        this.g0 = null;
        this.e0 = false;
        invalidate();
        v vVar = this.i0;
        if (vVar == null) {
            return true;
        }
        org.telegram.messenger.i0.r(vVar);
        this.i0 = null;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        double d;
        float[] fArr;
        float[] fArr2;
        float f7;
        ArrayList arrayList;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        s9 s9Var;
        w wVar;
        int i10;
        if (this.N == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            canvas2 = canvas;
        } else {
            RenderNode b10 = m4.v0.b(this.N);
            b10.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = b10.beginRecording();
        }
        super.dispatchDraw(canvas2);
        boolean j10 = j();
        org.telegram.ui.Components.t5 t5Var = this.I;
        org.telegram.ui.Components.t5[] t5VarArr = this.J;
        float f13 = 0.0f;
        if (!j10 && !this.f0 && !this.e0) {
            float f14 = t5Var.c;
            r rVar = this.f;
            if (f14 == rVar.c && t5VarArr[0].c == rVar.d[0]) {
                n4 n4Var = this.c;
                if (!n4Var.b && n4Var.d.c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    i(canvas);
                    return;
                }
            }
        }
        if (this.n0) {
            setCameraNeedsBlur(false);
        }
        canvas2.drawColor(-14737633);
        float d10 = this.K.d(this.e0);
        float e = t5Var.e(false, this.f.c);
        int i11 = 0;
        while (true) {
            double d11 = i11;
            d = e;
            double ceil = Math.ceil(d);
            fArr = this.M;
            fArr2 = this.L;
            if (d11 >= ceil) {
                break;
            }
            fArr2[i11] = getMeasuredWidth();
            fArr[i11] = 0.0f;
            i11++;
        }
        int i12 = this.f.c;
        while (true) {
            f7 = 1.0f;
            if (i12 >= t5VarArr.length) {
                break;
            }
            t5VarArr[i12].e(false, 1.0f);
            i12++;
        }
        int i13 = 0;
        boolean z10 = false;
        float f15 = 0.0f;
        while (true) {
            arrayList = this.h;
            f10 = f7;
            int size = arrayList.size();
            f11 = f13;
            rectF = this.P;
            if (i13 >= size) {
                break;
            }
            w wVar2 = (w) arrayList.get(i13);
            q qVar = wVar2.h;
            int i14 = qVar.c;
            float f16 = d10;
            int i15 = qVar.b;
            float f17 = e;
            org.telegram.ui.Components.t5[] t5VarArr2 = t5VarArr;
            float e7 = t5VarArr[i14].e(false, qVar.a.d[i14]);
            if (this.f0 || this.e0) {
                i10 = i14;
                org.telegram.messenger.i0.Z1(wVar2.j, wVar2.k, wVar2.l, rectF);
            } else {
                i10 = i14;
                rectF.set((getMeasuredWidth() / e7) * i15, (getMeasuredHeight() / f17) * i14, (getMeasuredWidth() / e7) * (i15 + 1), (getMeasuredHeight() / f17) * (i10 + 1));
            }
            fArr2[i10] = Math.min(fArr2[i10], rectF.left);
            fArr[i10] = Math.max(fArr[i10], rectF.right);
            f15 = Math.max(f15, rectF.bottom);
            if (f16 <= f11 || wVar2 != this.h0) {
                if (this.n0 && wVar2.d != null) {
                    z10 = true;
                }
                g(canvas2, rectF, wVar2);
            }
            i13++;
            f7 = f10;
            f13 = f11;
            d10 = f16;
            e = f17;
            t5VarArr = t5VarArr2;
        }
        float f18 = d10;
        float f19 = e;
        org.telegram.ui.Components.t5[] t5VarArr3 = t5VarArr;
        int i16 = 0;
        while (true) {
            ArrayList arrayList2 = this.n;
            if (i16 >= arrayList2.size()) {
                break;
            }
            w wVar3 = (w) arrayList2.get(i16);
            q qVar2 = wVar3.h;
            int i17 = qVar2.c;
            int i18 = qVar2.b;
            int i19 = i16;
            float e10 = t5VarArr3[i17].e(false, i17 >= this.f.d.length ? f10 : r13[i17]);
            rectF.set((getMeasuredWidth() / e10) * i18, (getMeasuredHeight() / f19) * i17, (getMeasuredWidth() / e10) * (i18 + 1), (i17 + 1) * (getMeasuredHeight() / f19));
            fArr2[i17] = Math.min(fArr2[i17], rectF.left);
            fArr[i17] = Math.max(fArr[i17], rectF.right);
            f15 = Math.max(f15, rectF.bottom);
            if (this.n0 && wVar3.d != null) {
                z10 = true;
            }
            g(canvas2, rectF, wVar3);
            i16 = i19 + 1;
        }
        if (this.e0) {
            f12 = f11;
        } else {
            int i20 = 0;
            while (i20 < Math.ceil(d)) {
                if (fArr2[i20] >= f11) {
                    rectF.set(f11, (getMeasuredHeight() / f19) * i20, fArr2[i20], (getMeasuredHeight() / f19) * (i20 + 1));
                    g(canvas2, rectF, null);
                }
                if (fArr[i20] < getMeasuredWidth()) {
                    rectF.set(fArr[i20], (getMeasuredHeight() / f19) * i20, getMeasuredWidth(), (getMeasuredHeight() / f19) * (i20 + 1));
                    g(canvas2, rectF, null);
                }
                i20++;
                f11 = 0.0f;
            }
            if (f15 < getMeasuredHeight()) {
                f12 = 0.0f;
                rectF.set(0.0f, f15, getMeasuredWidth(), getMeasuredHeight());
                g(canvas2, rectF, null);
            } else {
                f12 = 0.0f;
            }
        }
        if (f18 > f12 && (wVar = this.h0) != null) {
            q qVar3 = wVar.h;
            int i21 = qVar3.c;
            int i22 = qVar3.b;
            float e11 = t5VarArr3[i21].e(false, this.f.d[i21]);
            if (this.e0) {
                org.telegram.messenger.i0.Z1(wVar.j, wVar.k, wVar.l, rectF);
            } else {
                rectF.set((getMeasuredWidth() / e11) * i22, (getMeasuredHeight() / f19) * i21, (getMeasuredWidth() / e11) * (i22 + 1), (getMeasuredHeight() / f19) * (i21 + 1));
            }
            canvas2.save();
            canvas2.translate(org.telegram.messenger.i0.T1(this.a0, this.c0, wVar.l) * f18, org.telegram.messenger.i0.T1(this.b0, this.d0, wVar.l) * f18);
            g(canvas2, rectF, wVar);
            canvas2.restore();
        }
        for (int i23 = 0; i23 < arrayList.size(); i23++) {
            w wVar4 = (w) arrayList.get(i23);
            q qVar4 = wVar4.h;
            float e12 = wVar4.b.e(false, 0.0f);
            if (e12 > 0.0f) {
                int i24 = qVar4.c;
                int i25 = qVar4.c;
                int i26 = qVar4.b;
                float e13 = t5VarArr3[i24].e(false, qVar4.a.d[i24]);
                if (this.f0 || this.e0) {
                    org.telegram.messenger.i0.Z1(wVar4.j, wVar4.k, wVar4.l, rectF);
                } else {
                    rectF.set((getMeasuredWidth() / e13) * i26, (getMeasuredHeight() / f19) * i25, (getMeasuredWidth() / e13) * (i26 + 1), (getMeasuredHeight() / f19) * (i25 + 1));
                }
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(rectF);
                rectF2.inset(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
                Matrix matrix = this.F;
                matrix.reset();
                float f20 = rectF.left;
                int i27 = this.D;
                int i28 = i27 * i27;
                matrix.postTranslate(org.telegram.messenger.i0.T1(((float) Math.sqrt(i28 + i28)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), f10 - e12) + f20, 0.0f);
                matrix.postRotate(-25.0f);
                this.E.setLocalMatrix(matrix);
                Paint paint = this.w;
                paint.setAlpha(zs.e4);
                Path path = this.x;
                path.rewind();
                q qVar5 = wVar4.h;
                float L = (qVar5.b == 0 && qVar5.c == 0) ? org.telegram.messenger.i0.L(8.0f) : 0.0f;
                float[] fArr3 = this.y;
                fArr3[1] = L;
                fArr3[0] = L;
                q qVar6 = wVar4.h;
                float L2 = (qVar6.b == qVar6.a.b + (-1) && qVar6.c == 0) ? org.telegram.messenger.i0.L(8.0f) : 0.0f;
                fArr3[2] = L2;
                fArr3[1] = L2;
                q qVar7 = wVar4.h;
                int i29 = qVar7.b;
                r rVar2 = qVar7.a;
                float L3 = (i29 == rVar2.b + (-1) && qVar7.c == rVar2.c + (-1)) ? org.telegram.messenger.i0.L(8.0f) : 0.0f;
                fArr3[4] = L3;
                fArr3[3] = L3;
                q qVar8 = wVar4.h;
                float L4 = (qVar8.b == 0 && qVar8.c == qVar8.a.c + (-1)) ? org.telegram.messenger.i0.L(8.0f) : 0.0f;
                fArr3[6] = L4;
                fArr3[5] = L4;
                path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                canvas2.drawPath(path, paint);
            }
        }
        if (z10 && (s9Var = this.G) != null) {
            s9Var.d();
        }
        i(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0244, code lost:
    
        if (d() != false) goto L67;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        org.telegram.ui.Components.t5[] t5VarArr;
        RectF rectF;
        boolean z10;
        w wVar;
        v vVar;
        if (!j() || this.n0) {
            d();
            return false;
        }
        boolean z11 = true;
        if (motionEvent.getPointerCount() > 1) {
            d();
            return false;
        }
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.Components.t5 t5Var = this.I;
        float f7 = t5Var.c;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            int size = arrayList.size();
            t5VarArr = this.J;
            rectF = this.P;
            if (i10 >= size) {
                z10 = z11;
                wVar = null;
                break;
            }
            wVar = (w) arrayList.get(i10);
            q qVar = wVar.h;
            int i11 = qVar.c;
            int i12 = qVar.b;
            float f10 = t5VarArr[i11].c;
            z10 = z11;
            rectF.set((getMeasuredWidth() / f10) * i12, (getMeasuredHeight() / f7) * i11, (getMeasuredWidth() / f10) * (i12 + 1), (getMeasuredHeight() / f7) * (i11 + 1));
            if (rectF.contains(x10, y3)) {
                break;
            }
            i10++;
            z11 = z10;
        }
        if (motionEvent.getAction() == 0) {
            this.V = motionEvent.getX();
            this.W = motionEvent.getY();
            this.e0 = false;
            this.c0 = 0.0f;
            this.a0 = 0.0f;
            this.d0 = 0.0f;
            this.b0 = 0.0f;
            this.g0 = wVar;
            if (wVar != null) {
                v vVar2 = new v(this, 0);
                this.i0 = vVar2;
                org.telegram.messenger.i0.h3(vVar2, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 2) {
            if (w7.z8.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > org.telegram.messenger.i0.e * 1.2f && (vVar = this.i0) != null) {
                org.telegram.messenger.i0.r(vVar);
                this.i0 = null;
            }
            if (!this.e0 && getFilledProgress() >= 1.0f && this.g0 != null && wVar != null && w7.z8.a(motionEvent.getX(), motionEvent.getY(), this.V, this.W) > org.telegram.messenger.i0.e * 1.2f) {
                this.e0 = z10;
                this.h0 = this.g0;
                this.c0 = 0.0f;
                this.a0 = 0.0f;
                this.d0 = 0.0f;
                this.b0 = 0.0f;
                invalidate();
                v vVar3 = this.i0;
                if (vVar3 != null) {
                    org.telegram.messenger.i0.r(vVar3);
                    this.i0 = null;
                }
            } else if (this.e0 && this.h0 != null) {
                float x11 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float f11 = t5Var.c;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        i13 = -1;
                        break;
                    }
                    q qVar2 = ((w) arrayList.get(i13)).h;
                    int i14 = qVar2.c;
                    int i15 = qVar2.b;
                    float f12 = t5VarArr[i14].c;
                    rectF.set((getMeasuredWidth() / f12) * i15, (getMeasuredHeight() / f11) * i14, (getMeasuredWidth() / f12) * (i15 + 1), (getMeasuredHeight() / f11) * (i14 + 1));
                    if (rectF.contains(x11, y10)) {
                        break;
                    }
                    i13++;
                }
                int indexOf = arrayList.indexOf(this.h0);
                if (i13 >= 0 && indexOf >= 0 && i13 != indexOf) {
                    Collections.swap(arrayList, indexOf, i13);
                    o(this.f);
                    this.f0 = true;
                    invalidate();
                    float f13 = this.f.c;
                    q qVar3 = this.h0.h;
                    int i16 = qVar3.c;
                    int i17 = qVar3.b;
                    float f14 = t5VarArr[i16].c;
                    rectF.set((getMeasuredWidth() / f14) * i17, (getMeasuredHeight() / f13) * i16, (getMeasuredWidth() / f14) * (i17 + 1), (getMeasuredHeight() / f13) * (i16 + 1));
                    this.a0 = this.c0;
                    this.b0 = this.d0;
                    this.V = rectF.centerX();
                    this.W = rectF.centerY();
                }
                this.c0 = motionEvent.getX() - this.V;
                this.d0 = motionEvent.getY() - this.W;
                invalidate();
            } else if (this.g0 != wVar) {
                this.g0 = null;
                v vVar4 = this.i0;
                if (vVar4 != null) {
                    org.telegram.messenger.i0.r(vVar4);
                    this.i0 = null;
                    return true;
                }
            }
        } else {
            boolean z12 = z10;
            if (motionEvent.getAction() == z12) {
                if (this.g0 != null) {
                    this.g0 = null;
                    this.e0 = false;
                    invalidate();
                    v vVar5 = this.i0;
                    if (vVar5 == null) {
                        return z12;
                    }
                    org.telegram.messenger.i0.r(vVar5);
                    this.i0 = null;
                    return z12;
                }
            } else if (motionEvent.getAction() == 3) {
            }
        }
        return this.g0 != null || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d && org.telegram.messenger.i0.m0) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((w) obj).a(null);
        }
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas, RectF rectF, w wVar) {
        boolean z10;
        CameraView cameraView;
        ImageView imageView;
        if (org.telegram.messenger.i0.m0 && wVar == this.j0) {
            return;
        }
        if (wVar == this.h0) {
            org.telegram.ui.Components.t5 t5Var = this.K;
            if (t5Var.c > 0.0f) {
                canvas.save();
                Path path = this.Q;
                path.rewind();
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(rectF);
                rectF2.inset(org.telegram.messenger.i0.L(10.0f) * t5Var.c, org.telegram.messenger.i0.L(10.0f) * t5Var.c);
                float L = org.telegram.messenger.i0.L(12.0f) * t5Var.c;
                path.addRoundRect(rectF2, L, L, Path.Direction.CW);
                canvas.clipPath(path);
                z10 = true;
                if (wVar != null) {
                    ImageReceiver imageReceiver = wVar.c;
                    if (wVar.n != null) {
                        TextureView textureView = wVar.e;
                        if (textureView == null || !wVar.f) {
                            imageReceiver.y0(rectF.left, rectF.top, rectF.width(), rectF.height());
                            if (!imageReceiver.h(canvas, null)) {
                                CameraView cameraView2 = this.d;
                                if (cameraView2 == null && this.S) {
                                    f(canvas, this.R, rectF, 0.0f);
                                } else {
                                    h(0.0f, canvas, rectF, cameraView2);
                                }
                            }
                        } else {
                            h(0.0f, canvas, rectF, textureView);
                        }
                        if (z10) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                }
                if ((wVar == null && wVar.m) || org.telegram.messenger.i0.m0) {
                    CameraView cameraView3 = this.d;
                    if (cameraView3 == null && this.S) {
                        f(canvas, this.R, rectF, (wVar == null || !wVar.m) ? 0.4f : 0.0f);
                    } else {
                        h((wVar == null || !wVar.m) ? 0.4f : 0.0f, canvas, rectF, cameraView3);
                    }
                } else {
                    setCameraNeedsBlur(!this.n0);
                    if (this.e == null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
                        RenderNode b10 = m4.v0.b(this.e);
                        float max = Math.max(rectF.width() / b10.getWidth(), rectF.height() / b10.getHeight());
                        canvas.save();
                        canvas.translate(rectF.left, rectF.top);
                        canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                        canvas.scale(max, max);
                        canvas.drawRenderNode(b10);
                        canvas.drawColor(1677721600);
                        canvas.restore();
                    } else {
                        h(0.75f, canvas, rectF, this.d);
                    }
                    cameraView = this.d;
                    if (cameraView != null && (imageView = cameraView.blurredStubView) != null && imageView.getVisibility() == 0 && this.d.blurredStubView.getAlpha() > 0.0f) {
                        h(0.4f, canvas, rectF, this.d.blurredStubView);
                    }
                }
                if (z10) {
                }
            }
        }
        z10 = false;
        if (wVar != null) {
        }
        if (wVar == null) {
        }
        setCameraNeedsBlur(!this.n0);
        if (this.e == null) {
        }
        h(0.75f, canvas, rectF, this.d);
        cameraView = this.d;
        if (cameraView != null) {
            h(0.4f, canvas, rectF, this.d.blurredStubView);
        }
        if (z10) {
        }
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.N == null && Build.VERSION.SDK_INT >= 31) {
            this.N = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.O = renderNode;
            float L = org.telegram.messenger.i0.L(32.0f);
            float L2 = org.telegram.messenger.i0.L(32.0f);
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(L, L2, tileMode));
        }
        return this.O;
    }

    public ArrayList<n5> getContent() {
        ArrayList<n5> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            n5 n5Var = ((w) obj).n;
            if (n5Var != null) {
                arrayList.add(n5Var);
            }
        }
        return arrayList;
    }

    public w getCurrent() {
        return this.r;
    }

    public long getDuration() {
        w mainPart;
        n5 n5Var;
        if (!this.n0 || (mainPart = getMainPart()) == null || (n5Var = mainPart.n) == null) {
            return 1L;
        }
        return Math.max(Math.min((long) ((n5Var.W - n5Var.V) * n5Var.h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            if (((w) arrayList.get(i10)).n != null) {
                i11++;
            }
            i10++;
        }
    }

    public float getFilledProgress() {
        return getFilledCount() / getTotalCount();
    }

    public r getLayout() {
        return this.f;
    }

    public w getMainPart() {
        w wVar = null;
        if (!this.n0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar2 = (w) obj;
            n5 n5Var = wVar2.n;
            if (n5Var != null && n5Var.K) {
                long j11 = n5Var.h0;
                kg.j2 j2Var = wVar2.d;
                if (j2Var != null && j2Var.getDuration() > 0) {
                    j11 = wVar2.d.getDuration();
                }
                if (j11 > j10) {
                    wVar = wVar2;
                    j10 = j11;
                }
            }
        }
        return wVar;
    }

    public w getNext() {
        return this.s;
    }

    public ArrayList<Integer> getOrder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.h;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            i10 = c3.i0.j(((w) arrayList2.get(i10)).a, i10, 1, arrayList);
        }
    }

    public long getPosition() {
        if (!this.n0) {
            return 0L;
        }
        if (!this.q0) {
            return this.u0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.o0;
        if (j10 > getDuration()) {
            this.o0 = currentTimeMillis - (j10 % getDuration());
        }
        return j10;
    }

    public long getPositionWithOffset() {
        long j10 = 0;
        if (!this.n0) {
            return 0L;
        }
        getPosition();
        w mainPart = getMainPart();
        if (mainPart != null) {
            n5 n5Var = mainPart.n;
            j10 = n5Var.X + ((long) (n5Var.V * n5Var.h0));
        }
        return getPosition() + j10;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f7, Canvas canvas, RectF rectF, View view) {
        n4 n4Var;
        Bitmap bitmap;
        if (view == null) {
            return;
        }
        float max = Math.max(rectF.width() / view.getWidth(), rectF.height() / view.getHeight());
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
        canvas.scale(max, max);
        canvas.translate((-view.getWidth()) / 2.0f, (-view.getHeight()) / 2.0f);
        if (org.telegram.messenger.i0.m0) {
            TextureView textureView = view instanceof TextureView ? (TextureView) view : view instanceof CameraView ? ((CameraView) view).getTextureView() : null;
            if (textureView != null && (bitmap = textureView.getBitmap()) != null) {
                canvas.scale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            view.draw(canvas);
        }
        if (f7 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.t6.r1(view.getAlpha() * f7, -16777216));
        }
        canvas.restore();
        if (view != this.d || (n4Var = this.c) == null) {
            return;
        }
        Paint paint = n4Var.i;
        org.telegram.ui.Components.t5[] t5VarArr = n4Var.h;
        org.telegram.ui.Components.t5[] t5VarArr2 = n4Var.g;
        Path path = n4Var.j;
        m4 m4Var = n4Var.c;
        if (m4Var == null || m4Var.b.length <= 0) {
            return;
        }
        float d = n4Var.d.d(n4Var.b);
        int i10 = 0;
        float e = n4Var.e.e(false, n4Var.c.c);
        float width = (rectF.width() * e) + rectF.left;
        float e7 = n4Var.f.e(false, n4Var.c.d);
        float height = (rectF.height() * e7) + rectF.top;
        float T1 = org.telegram.messenger.i0.T1(0.5f, 1.1f, d);
        canvas.save();
        canvas.scale(T1, T1, width, height);
        if (d > 0.0f) {
            path.rewind();
            int min = Math.min(4, n4Var.c.b.length);
            int i11 = 0;
            while (i11 < min) {
                int i12 = i11 - 1;
                if (i12 < 0) {
                    i12 = min - 1;
                }
                int i13 = i11 + 1;
                int i14 = i13 >= min ? i10 : i13;
                m4 m4Var2 = n4Var.c;
                PointF[] pointFArr = m4Var2.b;
                PointF pointF = pointFArr[i12];
                int i15 = min;
                PointF pointF2 = pointFArr[i11];
                org.telegram.ui.Components.t5[] t5VarArr3 = t5VarArr;
                PointF pointF3 = pointFArr[i14];
                org.telegram.ui.Components.t5[] t5VarArr4 = t5VarArr2;
                float f10 = d;
                float width2 = (rectF.width() * (t5VarArr4[i12].e(false, pointF.x - m4Var2.c) + e)) + rectF.left;
                float height2 = (rectF.height() * (t5VarArr3[i12].e(false, pointF.y - n4Var.c.d) + e7)) + rectF.top;
                float width3 = (rectF.width() * (t5VarArr4[i11].e(false, pointF2.x - n4Var.c.c) + e)) + rectF.left;
                float height3 = (rectF.height() * (t5VarArr3[i11].e(false, pointF2.y - n4Var.c.d) + e7)) + rectF.top;
                float width4 = (rectF.width() * (t5VarArr4[i14].e(false, pointF3.x - n4Var.c.c) + e)) + rectF.left;
                float height4 = ((rectF.height() * (t5VarArr3[i14].e(false, pointF3.y - n4Var.c.d) + e7)) + rectF.top) - height3;
                path.moveTo(((width2 - width3) * 0.18f) + width3, ((height2 - height3) * 0.18f) + height3);
                path.lineTo(width3, height3);
                path.lineTo(((width4 - width3) * 0.18f) + width3, (height4 * 0.18f) + height3);
                t5VarArr2 = t5VarArr4;
                i10 = 0;
                i11 = i13;
                min = i15;
                t5VarArr = t5VarArr3;
                d = f10;
            }
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    public final void i(Canvas canvas) {
        if (this.N == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        RenderNode b10 = m4.v0.b(this.N);
        b10.endRecording();
        canvas.drawRenderNode(b10);
        Object obj = this.O;
        if (obj != null) {
            RenderNode b11 = m4.v0.b(obj);
            b11.setPosition(0, 0, getWidth(), getHeight());
            b11.beginRecording().drawRenderNode(b10);
            b11.endRecording();
        }
    }

    public final boolean j() {
        return this.f.e.size() > 1;
    }

    public final void k(RectF rectF, q qVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = org.telegram.messenger.i0.q;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        float f7 = measuredWidth;
        r rVar = qVar.a;
        int[] iArr = rVar.d;
        int i11 = qVar.c;
        int i12 = iArr[i11];
        int i13 = qVar.b;
        float f10 = measuredHeight;
        int i14 = rVar.c;
        rectF.set((f7 / i12) * i13, (f10 / i14) * i11, (f7 / i12) * (i13 + 1), (f10 / i14) * (i11 + 1));
    }

    public final boolean l(n5 n5Var) {
        if (n5Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                n5 n5Var2 = ((w) obj).n;
                if (n5Var2 != null && n5Var2.K && n5Var2.P > 0.0f) {
                    n5Var.P = 0.0f;
                    break;
                }
            }
        }
        w wVar = this.r;
        if (wVar != null) {
            wVar.a(n5Var);
        }
        q();
        requestLayout();
        return this.r == null;
    }

    public final void m(long j10, boolean z10) {
        if (this.n0) {
            long k10 = Utilities.k(j10, getDuration(), 0L);
            if (!this.q0) {
                this.u0 = k10;
            }
            this.o0 = System.currentTimeMillis() - k10;
            this.p0 = z10;
            if (this.n0) {
                v vVar = this.w0;
                org.telegram.messenger.i0.r(vVar);
                vVar.run();
            }
        }
    }

    public final void n(n5 n5Var) {
        if (n5Var == null || n5Var.T == null) {
            e();
            return;
        }
        o(n5Var.S);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((w) arrayList.get(i10)).a((n5) n5Var.T.get(i10));
            i10++;
        }
    }

    public final void o(r rVar) {
        if (rVar == null) {
            rVar = new r(".");
        }
        ArrayList arrayList = rVar.e;
        this.f = rVar;
        v vVar = this.H;
        org.telegram.messenger.i0.r(vVar);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i10 >= Math.max(size, arrayList2.size())) {
                q();
                invalidate();
                org.telegram.messenger.i0.h3(vVar, 360L);
                return;
            }
            q qVar = i10 < arrayList.size() ? (q) arrayList.get(i10) : null;
            w wVar = i10 < arrayList2.size() ? (w) arrayList2.get(i10) : null;
            if (wVar == null && qVar != null) {
                w wVar2 = new w(this);
                if (this.k0) {
                    wVar2.c.P();
                }
                wVar2.b(qVar, true);
                arrayList2.add(wVar2);
            } else if (qVar != null) {
                wVar.b(qVar, true);
            } else if (wVar != null) {
                this.n.add(wVar);
                arrayList2.remove(wVar);
                wVar.b(null, true);
                i10--;
            }
            i10++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                this.k0 = true;
                return;
            } else {
                ((w) arrayList.get(i10)).c.P();
                i10++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                this.k0 = false;
                org.telegram.messenger.i0.r(this.w0);
                return;
            } else {
                ((w) arrayList.get(i10)).c.R();
                i10++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        w wVar;
        n5 n5Var;
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt == this.d) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
            } else {
                int i15 = 0;
                while (true) {
                    ArrayList arrayList = this.h;
                    if (i15 >= arrayList.size()) {
                        wVar = null;
                        break;
                    } else {
                        if (childAt == ((w) arrayList.get(i15)).e) {
                            wVar = (w) arrayList.get(i15);
                            break;
                        }
                        i15++;
                    }
                }
                if (wVar == null || (n5Var = wVar.n) == null || (i12 = n5Var.k0) <= 0 || (i13 = n5Var.l0) <= 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                } else {
                    if (n5Var.Q % 90 == 1) {
                        i13 = i12;
                        i12 = i13;
                    }
                    float f7 = i12;
                    float f10 = i13;
                    float min = Math.min(1.0f, Math.max(f7 / size, f10 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f7 * min), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (f10 * min), TLObject.FLAG_30));
                }
            }
        }
    }

    public final void p() {
        CameraView cameraView = this.d;
        boolean z10 = cameraView != null && this.U;
        if (z10 == (this.e != null)) {
            return;
        }
        if (z10) {
            this.e = cameraView.getBlurRenderNode();
        } else {
            this.e = null;
        }
    }

    public final void q() {
        ArrayList arrayList;
        this.r = null;
        this.s = null;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            if (i10 >= arrayList.size()) {
                break;
            }
            w wVar = (w) arrayList.get(i10);
            if (wVar.n == null) {
                if (this.r != null) {
                    this.s = wVar;
                    break;
                }
                this.r = wVar;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            w wVar2 = (w) arrayList.get(i11);
            wVar2.m = wVar2 == this.r;
        }
    }

    public void setCameraNeedsBlur(boolean z10) {
        if (this.U == z10) {
            return;
        }
        this.U = z10;
        p();
    }

    public void setCameraThumb(Drawable drawable) {
        this.R = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z10) {
        this.S = z10;
        invalidate();
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.d;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new v(this, 1));
            org.telegram.messenger.i0.E2(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, w7.b6.e(-1, -1, zs.E1));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new v(this, 1));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new v(this, 1));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.l0 = runnable;
    }

    public void setMuted(boolean z10) {
        if (this.v0 == z10) {
            return;
        }
        this.v0 = z10;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.T = runnable;
    }

    public void setPlaying(boolean z10) {
        boolean z11 = this.t0;
        this.t0 = true;
        if (this.q0 == z10) {
            return;
        }
        this.q0 = z10;
        if (!z10) {
            this.u0 = getPosition();
        } else if (z11) {
            m(this.u0, false);
        } else {
            this.p0 = false;
        }
        if (this.n0) {
            v vVar = this.w0;
            org.telegram.messenger.i0.r(vVar);
            vVar.run();
        }
    }

    public void setPreview(boolean z10) {
        if (this.n0 == z10) {
            return;
        }
        this.n0 = z10;
        ArrayList arrayList = this.h;
        int i10 = 0;
        if (z10) {
            s9 s9Var = this.G;
            if (s9Var != null) {
                s9Var.d();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((w) arrayList.get(i11)).a = i11;
            }
        }
        this.p0 = false;
        this.u0 = 0L;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) obj;
            kg.j2 j2Var = wVar.d;
            if (j2Var != null) {
                j2Var.setAudioEnabled(z10, true);
                if (!z10 || this.q0) {
                    wVar.d.play();
                } else {
                    wVar.d.pause();
                }
            }
        }
        v vVar = this.w0;
        org.telegram.messenger.i0.r(vVar);
        if (z10) {
            this.o0 = System.currentTimeMillis();
            org.telegram.messenger.i0.h3(vVar, (long) (1000.0f / org.telegram.messenger.i0.r));
        }
    }

    public void setPreviewView(k4 k4Var) {
        this.s0 = k4Var;
    }

    public void setResetState(Runnable runnable) {
        this.m0 = runnable;
    }

    public void setTimelineView(z8 z8Var) {
        this.r0 = z8Var;
    }
}
