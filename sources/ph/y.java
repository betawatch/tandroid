package ph;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nr;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public abstract class y extends FrameLayout implements n70 {
    public static final /* synthetic */ int u0 = 0;
    public final LinearGradient B;
    public final Matrix C;
    public final org.telegram.ui.Components.ba D;
    public final w E;
    public final org.telegram.ui.Components.z5 F;
    public final org.telegram.ui.Components.z5[] G;
    public final org.telegram.ui.Components.z5 H;
    public final float[] I;
    public final float[] J;
    public Object K;
    public Object L;
    public final RectF M;
    public final Path N;
    public Drawable O;
    public boolean P;
    public Runnable Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public final FrameLayout a;
    public float a0;
    public final nh.b b;
    public boolean b0;
    public final o5 c;
    public boolean c0;
    public CameraView d;
    public x d0;
    public Object e;
    public x e0;
    public r f;
    public w f0;
    public x g0;
    public final ArrayList h;
    public boolean h0;
    public Runnable i0;
    public Runnable j0;
    public boolean k0;
    public long l0;
    public boolean m0;
    public final ArrayList n;
    public boolean n0;
    public oa o0;
    public l5 p0;
    public boolean q0;
    public x r;
    public long r0;
    public x s;
    public boolean s0;
    public final w t0;
    public final Paint v;
    public final Path w;
    public final float[] x;
    public final int y;

    public y(Context context, org.telegram.ui.Components.ba baVar, FrameLayout frameLayout, nh.b bVar) {
        super(context);
        this.c = new o5(new w(this, 1));
        this.f = new r(".");
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        this.n = new ArrayList();
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new Path();
        this.x = new float[8];
        this.E = new w(this, 2);
        nr nrVar = nr.h;
        this.F = new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar);
        this.G = new org.telegram.ui.Components.z5[]{new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar), new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar), new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar), new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar), new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar)};
        this.H = new org.telegram.ui.Components.z5(this, 0L, 320L, nrVar);
        this.I = new float[5];
        this.J = new float[5];
        this.M = new RectF();
        this.N = new Path();
        this.P = true;
        this.n0 = true;
        this.q0 = true;
        this.t0 = new w(this, 3);
        this.D = baVar;
        this.a = frameLayout;
        this.b = bVar;
        setBackgroundColor(-14737633);
        x xVar = new x(this);
        xVar.b((q) this.f.e.get(0), false);
        xVar.m = true;
        if (this.h0) {
            xVar.c.onAttachedToWindow();
        }
        arrayList.add(xVar);
        this.r = xVar;
        this.s = null;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setStrokeWidth(AndroidUtilities.dp(8.0f));
        int dp = AndroidUtilities.dp(300.0f);
        this.y = dp;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{0, -1, -1, 0}, new float[]{0.0f, 0.2f, 0.8f, 1.0f}, Shader.TileMode.CLAMP);
        this.B = linearGradient;
        this.C = new Matrix();
        paint.setShader(linearGradient);
        setWillNotDraw(false);
    }

    public static void c(y yVar, RectF rectF, q qVar) {
        int measuredWidth = yVar.getMeasuredWidth();
        int measuredHeight = yVar.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        yVar.k(rectF, qVar);
        float f10 = rectF.left;
        boolean z4 = f10 <= 0.0f;
        float f11 = rectF.top;
        boolean z10 = f11 <= 0.0f;
        float f12 = measuredWidth;
        boolean z11 = rectF.right >= f12;
        float f13 = measuredHeight;
        boolean z12 = rectF.bottom >= f13;
        if (z4 && z11 && !z10 && !z12) {
            rectF.offset(0.0f, f13 - f11);
            return;
        }
        if (z10 && z12 && !z4 && !z11) {
            rectF.offset(0.0f, f12 - f10);
            return;
        }
        if (z11 && !z4) {
            rectF.offset(rectF.width(), 0.0f);
        }
        if (!z12 || z10) {
            return;
        }
        rectF.offset(0.0f, rectF.height());
    }

    public static void f(Canvas canvas, Drawable drawable, RectF rectF, float f10) {
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
        if (f10 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(drawable.getAlpha() * f10, -16777216));
        }
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.n70
    public final void a(RectF rectF) {
        x xVar = this.g0;
        if (xVar == null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            return;
        }
        q qVar = xVar.h;
        r rVar = qVar.a;
        int i10 = qVar.b;
        int i11 = qVar.c;
        float f10 = rVar.c;
        float d = this.G[i11].d(rVar.d[i11], false);
        rectF.set((getMeasuredWidth() / d) * i10, (getMeasuredHeight() / f10) * i11, (getMeasuredWidth() / d) * (i10 + 1), (getMeasuredHeight() / f10) * (i11 + 1));
    }

    @Override // org.telegram.ui.Components.n70
    public final void b(Canvas canvas, float f10) {
        x xVar = this.g0;
        if (xVar != null) {
            q qVar = xVar.h;
            r rVar = qVar.a;
            int i10 = qVar.b;
            int i11 = qVar.c;
            float f11 = rVar.c;
            float d = this.G[i11].d(rVar.d[i11], false);
            float measuredWidth = (getMeasuredWidth() / d) * i10;
            float measuredHeight = (getMeasuredHeight() / f11) * i11;
            float measuredWidth2 = (getMeasuredWidth() / d) * (i10 + 1);
            float measuredHeight2 = (getMeasuredHeight() / f11) * (i11 + 1);
            RectF rectF = this.M;
            rectF.set(measuredWidth, measuredHeight, measuredWidth2, measuredHeight2);
            g(canvas, rectF, this.g0);
        }
    }

    public final boolean d() {
        if (this.d0 == null) {
            return false;
        }
        this.d0 = null;
        this.b0 = false;
        invalidate();
        w wVar = this.f0;
        if (wVar == null) {
            return true;
        }
        AndroidUtilities.cancelRunOnUIThread(wVar);
        this.f0 = null;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0303  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        double d;
        float[] fArr;
        float[] fArr2;
        ArrayList arrayList;
        float f10;
        RectF rectF;
        float f11;
        int i10;
        org.telegram.ui.Components.ba baVar;
        x xVar;
        int i11;
        if (this.K == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            canvas2 = canvas;
        } else {
            RenderNode c3 = org.telegram.messenger.b.c(this.K);
            c3.setPosition(0, 0, getWidth(), getHeight());
            canvas2 = c3.beginRecording();
        }
        super.dispatchDraw(canvas2);
        boolean j10 = j();
        org.telegram.ui.Components.z5 z5Var = this.F;
        org.telegram.ui.Components.z5[] z5VarArr = this.G;
        if (!j10 && !this.c0 && !this.b0) {
            float f12 = z5Var.c;
            r rVar = this.f;
            if (f12 == rVar.c && z5VarArr[0].c == rVar.d[0]) {
                o5 o5Var = this.c;
                if (!o5Var.b && o5Var.d.c <= 0.0f) {
                    setCameraNeedsBlur(false);
                    i(canvas);
                    return;
                }
            }
        }
        if (this.k0) {
            setCameraNeedsBlur(false);
        }
        canvas2.drawColor(-14737633);
        float e = this.H.e(this.b0);
        float d10 = z5Var.d(this.f.c, false);
        int i12 = 0;
        while (true) {
            double d11 = i12;
            d = d10;
            double ceil = Math.ceil(d);
            fArr = this.J;
            fArr2 = this.I;
            if (d11 >= ceil) {
                break;
            }
            fArr2[i12] = getMeasuredWidth();
            fArr[i12] = 0.0f;
            i12++;
        }
        for (int i13 = this.f.c; i13 < z5VarArr.length; i13++) {
            z5VarArr[i13].d(1.0f, false);
        }
        int i14 = 0;
        float f13 = 0.0f;
        boolean z4 = false;
        while (true) {
            arrayList = this.h;
            int size = arrayList.size();
            f10 = 0.0f;
            rectF = this.M;
            if (i14 >= size) {
                break;
            }
            x xVar2 = (x) arrayList.get(i14);
            q qVar = xVar2.h;
            int i15 = qVar.c;
            float f14 = e;
            int i16 = qVar.b;
            float f15 = d10;
            org.telegram.ui.Components.z5[] z5VarArr2 = z5VarArr;
            float d12 = z5VarArr[i15].d(qVar.a.d[i15], false);
            if (this.c0 || this.b0) {
                i11 = i15;
                AndroidUtilities.lerp(xVar2.j, xVar2.k, xVar2.l, rectF);
            } else {
                i11 = i15;
                rectF.set((getMeasuredWidth() / d12) * i16, (getMeasuredHeight() / f15) * i15, (getMeasuredWidth() / d12) * (i16 + 1), (getMeasuredHeight() / f15) * (i11 + 1));
            }
            fArr2[i11] = Math.min(fArr2[i11], rectF.left);
            fArr[i11] = Math.max(fArr[i11], rectF.right);
            f13 = Math.max(f13, rectF.bottom);
            if (f14 <= 0.0f || xVar2 != this.e0) {
                if (this.k0 && xVar2.d != null) {
                    z4 = true;
                }
                g(canvas2, rectF, xVar2);
            }
            i14++;
            e = f14;
            d10 = f15;
            z5VarArr = z5VarArr2;
        }
        float f16 = e;
        float f17 = d10;
        org.telegram.ui.Components.z5[] z5VarArr3 = z5VarArr;
        int i17 = 0;
        while (true) {
            ArrayList arrayList2 = this.n;
            if (i17 >= arrayList2.size()) {
                break;
            }
            x xVar3 = (x) arrayList2.get(i17);
            q qVar2 = xVar3.h;
            int i18 = qVar2.c;
            int i19 = qVar2.b;
            int i20 = i17;
            float d13 = z5VarArr3[i18].d(i18 >= this.f.d.length ? 1.0f : r9[i18], false);
            rectF.set((getMeasuredWidth() / d13) * i19, (getMeasuredHeight() / f17) * i18, (getMeasuredWidth() / d13) * (i19 + 1), (i18 + 1) * (getMeasuredHeight() / f17));
            fArr2[i18] = Math.min(fArr2[i18], rectF.left);
            fArr[i18] = Math.max(fArr[i18], rectF.right);
            f13 = Math.max(f13, rectF.bottom);
            if (this.k0 && xVar3.d != null) {
                z4 = true;
            }
            g(canvas2, rectF, xVar3);
            i17 = i20 + 1;
        }
        if (!this.b0) {
            int i21 = 0;
            while (i21 < Math.ceil(d)) {
                if (fArr2[i21] >= f10) {
                    rectF.set(0.0f, (getMeasuredHeight() / f17) * i21, fArr2[i21], (getMeasuredHeight() / f17) * (i21 + 1));
                    g(canvas2, rectF, null);
                }
                if (fArr[i21] < getMeasuredWidth()) {
                    rectF.set(fArr[i21], (getMeasuredHeight() / f17) * i21, getMeasuredWidth(), (getMeasuredHeight() / f17) * (i21 + 1));
                    g(canvas2, rectF, null);
                }
                i21++;
                f10 = 0.0f;
            }
            if (f13 < getMeasuredHeight()) {
                f11 = 0.0f;
                rectF.set(0.0f, f13, getMeasuredWidth(), getMeasuredHeight());
                g(canvas2, rectF, null);
                if (f16 > f11 && (xVar = this.e0) != null) {
                    q qVar3 = xVar.h;
                    int i22 = qVar3.c;
                    int i23 = qVar3.b;
                    float d14 = z5VarArr3[i22].d(this.f.d[i22], false);
                    if (this.b0) {
                        rectF.set((getMeasuredWidth() / d14) * i23, (getMeasuredHeight() / f17) * i22, (getMeasuredWidth() / d14) * (i23 + 1), (getMeasuredHeight() / f17) * (i22 + 1));
                    } else {
                        AndroidUtilities.lerp(xVar.j, xVar.k, xVar.l, rectF);
                    }
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.lerp(this.U, this.W, xVar.l) * f16, AndroidUtilities.lerp(this.V, this.a0, xVar.l) * f16);
                    g(canvas2, rectF, xVar);
                    canvas2.restore();
                }
                for (i10 = 0; i10 < arrayList.size(); i10++) {
                    x xVar4 = (x) arrayList.get(i10);
                    q qVar4 = xVar4.h;
                    float d15 = xVar4.b.d(0.0f, false);
                    if (d15 > 0.0f) {
                        int i24 = qVar4.c;
                        int i25 = qVar4.c;
                        int i26 = qVar4.b;
                        float d16 = z5VarArr3[i24].d(qVar4.a.d[i24], false);
                        if (this.c0 || this.b0) {
                            AndroidUtilities.lerp(xVar4.j, xVar4.k, xVar4.l, rectF);
                        } else {
                            rectF.set((getMeasuredWidth() / d16) * i26, (getMeasuredHeight() / f17) * i25, (getMeasuredWidth() / d16) * (i26 + 1), (getMeasuredHeight() / f17) * (i25 + 1));
                        }
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(rectF);
                        rectF2.inset(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                        Matrix matrix = this.C;
                        matrix.reset();
                        float f18 = rectF.left;
                        int i27 = this.y;
                        int i28 = i27 * i27;
                        matrix.postTranslate(AndroidUtilities.lerp(((float) Math.sqrt(i28 + i28)) * (-1.4f), (float) Math.sqrt((rectF.height() * rectF.height()) + (rectF.width() * rectF.width())), 1.0f - d15) + f18, 0.0f);
                        matrix.postRotate(-25.0f);
                        this.B.setLocalMatrix(matrix);
                        Paint paint = this.v;
                        paint.setAlpha(255);
                        Path path = this.w;
                        path.rewind();
                        q qVar5 = xVar4.h;
                        float dp = (qVar5.b == 0 && qVar5.c == 0) ? AndroidUtilities.dp(8.0f) : 0.0f;
                        float[] fArr3 = this.x;
                        fArr3[1] = dp;
                        fArr3[0] = dp;
                        q qVar6 = xVar4.h;
                        float dp2 = (qVar6.b == qVar6.a.b + (-1) && qVar6.c == 0) ? AndroidUtilities.dp(8.0f) : 0.0f;
                        fArr3[2] = dp2;
                        fArr3[1] = dp2;
                        q qVar7 = xVar4.h;
                        int i29 = qVar7.b;
                        r rVar2 = qVar7.a;
                        float dp3 = (i29 == rVar2.b + (-1) && qVar7.c == rVar2.c + (-1)) ? AndroidUtilities.dp(8.0f) : 0.0f;
                        fArr3[4] = dp3;
                        fArr3[3] = dp3;
                        q qVar8 = xVar4.h;
                        float dp4 = (qVar8.b == 0 && qVar8.c == qVar8.a.c + (-1)) ? AndroidUtilities.dp(8.0f) : 0.0f;
                        fArr3[6] = dp4;
                        fArr3[5] = dp4;
                        path.addRoundRect(rectF2, fArr3, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
                if (z4 && (baVar = this.D) != null) {
                    baVar.d();
                }
                i(canvas);
            }
        }
        f11 = 0.0f;
        if (f16 > f11) {
            q qVar32 = xVar.h;
            int i222 = qVar32.c;
            int i232 = qVar32.b;
            float d142 = z5VarArr3[i222].d(this.f.d[i222], false);
            if (this.b0) {
            }
            canvas2.save();
            canvas2.translate(AndroidUtilities.lerp(this.U, this.W, xVar.l) * f16, AndroidUtilities.lerp(this.V, this.a0, xVar.l) * f16);
            g(canvas2, rectF, xVar);
            canvas2.restore();
        }
        while (i10 < arrayList.size()) {
        }
        if (z4) {
            baVar.d();
        }
        i(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        org.telegram.ui.Components.z5[] z5VarArr;
        RectF rectF;
        x xVar;
        w wVar;
        if (!j() || this.k0) {
            d();
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            d();
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.Components.z5 z5Var = this.F;
        float f10 = z5Var.c;
        int i10 = 0;
        while (true) {
            arrayList = this.h;
            int size = arrayList.size();
            z5VarArr = this.G;
            rectF = this.M;
            if (i10 >= size) {
                xVar = null;
                break;
            }
            xVar = (x) arrayList.get(i10);
            q qVar = xVar.h;
            int i11 = qVar.c;
            int i12 = qVar.b;
            float f11 = z5VarArr[i11].c;
            rectF.set((getMeasuredWidth() / f11) * i12, (getMeasuredHeight() / f10) * i11, (getMeasuredWidth() / f11) * (i12 + 1), (getMeasuredHeight() / f10) * (i11 + 1));
            if (rectF.contains(x10, y10)) {
                break;
            }
            i10++;
        }
        if (motionEvent.getAction() == 0) {
            this.S = motionEvent.getX();
            this.T = motionEvent.getY();
            this.b0 = false;
            this.W = 0.0f;
            this.U = 0.0f;
            this.a0 = 0.0f;
            this.V = 0.0f;
            this.d0 = xVar;
            if (xVar != null) {
                w wVar2 = new w(this, 0);
                this.f0 = wVar2;
                AndroidUtilities.runOnUIThread(wVar2, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 2) {
            if (k7.n6.a(motionEvent.getX(), motionEvent.getY(), this.S, this.T) > AndroidUtilities.touchSlop * 1.2f && (wVar = this.f0) != null) {
                AndroidUtilities.cancelRunOnUIThread(wVar);
                this.f0 = null;
            }
            if (!this.b0 && getFilledProgress() >= 1.0f && this.d0 != null && xVar != null && k7.n6.a(motionEvent.getX(), motionEvent.getY(), this.S, this.T) > AndroidUtilities.touchSlop * 1.2f) {
                this.b0 = true;
                this.e0 = this.d0;
                this.W = 0.0f;
                this.U = 0.0f;
                this.a0 = 0.0f;
                this.V = 0.0f;
                invalidate();
                w wVar3 = this.f0;
                if (wVar3 != null) {
                    AndroidUtilities.cancelRunOnUIThread(wVar3);
                    this.f0 = null;
                }
            } else if (this.b0 && this.e0 != null) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                float f12 = z5Var.c;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        i13 = -1;
                        break;
                    }
                    q qVar2 = ((x) arrayList.get(i13)).h;
                    int i14 = qVar2.c;
                    int i15 = qVar2.b;
                    float f13 = z5VarArr[i14].c;
                    rectF.set((getMeasuredWidth() / f13) * i15, (getMeasuredHeight() / f12) * i14, (getMeasuredWidth() / f13) * (i15 + 1), (getMeasuredHeight() / f12) * (i14 + 1));
                    if (rectF.contains(x11, y11)) {
                        break;
                    }
                    i13++;
                }
                int indexOf = arrayList.indexOf(this.e0);
                if (i13 >= 0 && indexOf >= 0 && i13 != indexOf) {
                    Collections.swap(arrayList, indexOf, i13);
                    o(this.f);
                    this.c0 = true;
                    invalidate();
                    float f14 = this.f.c;
                    q qVar3 = this.e0.h;
                    int i16 = qVar3.c;
                    int i17 = qVar3.b;
                    float f15 = z5VarArr[i16].c;
                    rectF.set((getMeasuredWidth() / f15) * i17, (getMeasuredHeight() / f14) * i16, (getMeasuredWidth() / f15) * (i17 + 1), (getMeasuredHeight() / f14) * (i16 + 1));
                    this.U = this.W;
                    this.V = this.a0;
                    this.S = rectF.centerX();
                    this.T = rectF.centerY();
                }
                this.W = motionEvent.getX() - this.S;
                this.a0 = motionEvent.getY() - this.T;
                invalidate();
            } else if (this.d0 != xVar) {
                this.d0 = null;
                w wVar4 = this.f0;
                if (wVar4 == null) {
                    return true;
                }
                AndroidUtilities.cancelRunOnUIThread(wVar4);
                this.f0 = null;
                return true;
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.d0 != null) {
                this.d0 = null;
                this.b0 = false;
                invalidate();
                w wVar5 = this.f0;
                if (wVar5 == null) {
                    return true;
                }
                AndroidUtilities.cancelRunOnUIThread(wVar5);
                this.f0 = null;
                return true;
            }
        } else if (motionEvent.getAction() == 3 && d()) {
            return true;
        }
        return this.d0 != null || super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.d && AndroidUtilities.makingGlobalBlurBitmap) {
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
            ((x) obj).a(null);
        }
        q();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Canvas canvas, RectF rectF, x xVar) {
        boolean z4;
        CameraView cameraView;
        ImageView imageView;
        if (AndroidUtilities.makingGlobalBlurBitmap && xVar == this.g0) {
            return;
        }
        if (xVar == this.e0) {
            org.telegram.ui.Components.z5 z5Var = this.H;
            if (z5Var.c > 0.0f) {
                canvas.save();
                Path path = this.N;
                path.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(rectF);
                rectF2.inset(AndroidUtilities.dp(10.0f) * z5Var.c, AndroidUtilities.dp(10.0f) * z5Var.c);
                float dp = AndroidUtilities.dp(12.0f) * z5Var.c;
                path.addRoundRect(rectF2, dp, dp, Path.Direction.CW);
                canvas.clipPath(path);
                z4 = true;
                if (xVar != null) {
                    ImageReceiver imageReceiver = xVar.c;
                    if (xVar.n != null) {
                        TextureView textureView = xVar.e;
                        if (textureView == null || !xVar.f) {
                            imageReceiver.setImageCoords(rectF.left, rectF.top, rectF.width(), rectF.height());
                            if (!imageReceiver.draw(canvas)) {
                                CameraView cameraView2 = this.d;
                                if (cameraView2 == null && this.P) {
                                    f(canvas, this.O, rectF, 0.0f);
                                } else {
                                    h(0.0f, canvas, rectF, cameraView2);
                                }
                            }
                        } else {
                            h(0.0f, canvas, rectF, textureView);
                        }
                        if (z4) {
                            canvas.restore();
                            return;
                        }
                        return;
                    }
                }
                if ((xVar == null && xVar.m) || AndroidUtilities.makingGlobalBlurBitmap) {
                    CameraView cameraView3 = this.d;
                    if (cameraView3 == null && this.P) {
                        f(canvas, this.O, rectF, (xVar == null || !xVar.m) ? 0.4f : 0.0f);
                    } else {
                        h((xVar == null || !xVar.m) ? 0.4f : 0.0f, canvas, rectF, cameraView3);
                    }
                } else {
                    setCameraNeedsBlur(!this.k0);
                    if (this.e == null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
                        RenderNode c3 = org.telegram.messenger.b.c(this.e);
                        float max = Math.max(rectF.width() / c3.getWidth(), rectF.height() / c3.getHeight());
                        canvas.save();
                        canvas.translate(rectF.left, rectF.top);
                        canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                        canvas.scale(max, max);
                        canvas.drawRenderNode(c3);
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
                if (z4) {
                }
            }
        }
        z4 = false;
        if (xVar != null) {
        }
        if (xVar == null) {
        }
        setCameraNeedsBlur(!this.k0);
        if (this.e == null) {
        }
        h(0.75f, canvas, rectF, this.d);
        cameraView = this.d;
        if (cameraView != null) {
            h(0.4f, canvas, rectF, this.d.blurredStubView);
        }
        if (z4) {
        }
    }

    public Object getBlurRenderNode() {
        Shader.TileMode tileMode;
        if (this.K == null && Build.VERSION.SDK_INT >= 31) {
            this.K = new RenderNode("CameraViewRenderNode");
            RenderNode renderNode = new RenderNode("CameraViewRenderNodeBlur");
            this.L = renderNode;
            float dp = AndroidUtilities.dp(32.0f);
            float dp2 = AndroidUtilities.dp(32.0f);
            tileMode = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(dp, dp2, tileMode));
        }
        return this.L;
    }

    public ArrayList<u6> getContent() {
        ArrayList<u6> arrayList = new ArrayList<>();
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            u6 u6Var = ((x) obj).n;
            if (u6Var != null) {
                arrayList.add(u6Var);
            }
        }
        return arrayList;
    }

    public x getCurrent() {
        return this.r;
    }

    public long getDuration() {
        x mainPart;
        u6 u6Var;
        if (!this.k0 || (mainPart = getMainPart()) == null || (u6Var = mainPart.n) == null) {
            return 1L;
        }
        return Math.max(Math.min((long) ((u6Var.W - u6Var.V) * u6Var.h0), 59500L), 1L);
    }

    public int getFilledCount() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return i11;
            }
            if (((x) arrayList.get(i10)).n != null) {
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

    public x getMainPart() {
        x xVar = null;
        if (!this.k0) {
            return null;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        long j10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x xVar2 = (x) obj;
            u6 u6Var = xVar2.n;
            if (u6Var != null && u6Var.K) {
                long j11 = u6Var.h0;
                eg.t2 t2Var = xVar2.d;
                if (t2Var != null && t2Var.getDuration() > 0) {
                    j11 = xVar2.d.getDuration();
                }
                if (j11 > j10) {
                    xVar = xVar2;
                    j10 = j11;
                }
            }
        }
        return xVar;
    }

    public x getNext() {
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
            i10 = yh.e(((x) arrayList2.get(i10)).a, i10, 1, arrayList);
        }
    }

    public long getPosition() {
        if (!this.k0) {
            return 0L;
        }
        if (!this.n0) {
            return this.r0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.l0;
        if (j10 > getDuration()) {
            this.l0 = currentTimeMillis - (j10 % getDuration());
        }
        return j10;
    }

    public long getPositionWithOffset() {
        long j10 = 0;
        if (!this.k0) {
            return 0L;
        }
        getPosition();
        x mainPart = getMainPart();
        if (mainPart != null) {
            u6 u6Var = mainPart.n;
            j10 = u6Var.X + ((long) (u6Var.V * u6Var.h0));
        }
        return getPosition() + j10;
    }

    public int getTotalCount() {
        return this.h.size();
    }

    public final void h(float f10, Canvas canvas, RectF rectF, View view) {
        o5 o5Var;
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
        if (AndroidUtilities.makingGlobalBlurBitmap) {
            TextureView textureView = view instanceof TextureView ? (TextureView) view : view instanceof CameraView ? ((CameraView) view).getTextureView() : null;
            if (textureView != null && (bitmap = textureView.getBitmap()) != null) {
                canvas.scale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        } else {
            view.draw(canvas);
        }
        if (f10 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(view.getAlpha() * f10, -16777216));
        }
        canvas.restore();
        if (view != this.d || (o5Var = this.c) == null) {
            return;
        }
        Paint paint = o5Var.i;
        org.telegram.ui.Components.z5[] z5VarArr = o5Var.h;
        org.telegram.ui.Components.z5[] z5VarArr2 = o5Var.g;
        Path path = o5Var.j;
        n5 n5Var = o5Var.c;
        if (n5Var == null || n5Var.b.length <= 0) {
            return;
        }
        float e = o5Var.d.e(o5Var.b);
        float d = o5Var.e.d(o5Var.c.c, false);
        float width = (rectF.width() * d) + rectF.left;
        float d10 = o5Var.f.d(o5Var.c.d, false);
        float height = (rectF.height() * d10) + rectF.top;
        float lerp = AndroidUtilities.lerp(0.5f, 1.1f, e);
        canvas.save();
        canvas.scale(lerp, lerp, width, height);
        if (e > 0.0f) {
            path.rewind();
            int min = Math.min(4, o5Var.c.b.length);
            int i10 = 0;
            while (i10 < min) {
                int i11 = i10 - 1;
                if (i11 < 0) {
                    i11 = min - 1;
                }
                int i12 = i10 + 1;
                int i13 = i12 >= min ? 0 : i12;
                n5 n5Var2 = o5Var.c;
                PointF[] pointFArr = n5Var2.b;
                PointF pointF = pointFArr[i11];
                int i14 = min;
                PointF pointF2 = pointFArr[i10];
                org.telegram.ui.Components.z5[] z5VarArr3 = z5VarArr;
                PointF pointF3 = pointFArr[i13];
                org.telegram.ui.Components.z5[] z5VarArr4 = z5VarArr2;
                float f11 = e;
                float width2 = (rectF.width() * (z5VarArr4[i11].d(pointF.x - n5Var2.c, false) + d)) + rectF.left;
                float height2 = (rectF.height() * (z5VarArr3[i11].d(pointF.y - o5Var.c.d, false) + d10)) + rectF.top;
                float width3 = (rectF.width() * (z5VarArr4[i10].d(pointF2.x - o5Var.c.c, false) + d)) + rectF.left;
                float height3 = (rectF.height() * (z5VarArr3[i10].d(pointF2.y - o5Var.c.d, false) + d10)) + rectF.top;
                float width4 = (rectF.width() * (z5VarArr4[i13].d(pointF3.x - o5Var.c.c, false) + d)) + rectF.left;
                float height4 = ((rectF.height() * (z5VarArr3[i13].d(pointF3.y - o5Var.c.d, false) + d10)) + rectF.top) - height3;
                path.moveTo(((width2 - width3) * 0.18f) + width3, ((height2 - height3) * 0.18f) + height3);
                path.lineTo(width3, height3);
                path.lineTo(((width4 - width3) * 0.18f) + width3, (height4 * 0.18f) + height3);
                z5VarArr2 = z5VarArr4;
                i10 = i12;
                min = i14;
                z5VarArr = z5VarArr3;
                e = f11;
            }
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    public final void i(Canvas canvas) {
        if (this.K == null || Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated()) {
            return;
        }
        RenderNode c3 = org.telegram.messenger.b.c(this.K);
        c3.endRecording();
        canvas.drawRenderNode(c3);
        Object obj = this.L;
        if (obj != null) {
            RenderNode c10 = org.telegram.messenger.b.c(obj);
            c10.setPosition(0, 0, getWidth(), getHeight());
            c10.beginRecording().drawRenderNode(c3);
            c10.endRecording();
        }
    }

    public final boolean j() {
        return this.f.e.size() > 1;
    }

    public final void k(RectF rectF, q qVar) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            Point point = AndroidUtilities.displaySize;
            int i10 = point.x;
            measuredHeight = point.y;
            measuredWidth = i10;
        }
        float f10 = measuredWidth;
        r rVar = qVar.a;
        int[] iArr = rVar.d;
        int i11 = qVar.c;
        int i12 = iArr[i11];
        int i13 = qVar.b;
        float f11 = measuredHeight;
        int i14 = rVar.c;
        rectF.set((f10 / i12) * i13, (f11 / i14) * i11, (f10 / i12) * (i13 + 1), (f11 / i14) * (i11 + 1));
    }

    public final boolean l(u6 u6Var) {
        if (u6Var.K) {
            ArrayList arrayList = this.h;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                u6 u6Var2 = ((x) obj).n;
                if (u6Var2 != null && u6Var2.K && u6Var2.P > 0.0f) {
                    u6Var.P = 0.0f;
                    break;
                }
            }
        }
        x xVar = this.r;
        if (xVar != null) {
            xVar.a(u6Var);
        }
        q();
        requestLayout();
        return this.r == null;
    }

    public final void m(long j10, boolean z4) {
        if (this.k0) {
            long clamp = Utilities.clamp(j10, getDuration(), 0L);
            if (!this.n0) {
                this.r0 = clamp;
            }
            this.l0 = System.currentTimeMillis() - clamp;
            this.m0 = z4;
            if (this.k0) {
                w wVar = this.t0;
                AndroidUtilities.cancelRunOnUIThread(wVar);
                wVar.run();
            }
        }
    }

    public final void n(u6 u6Var) {
        if (u6Var == null || u6Var.T == null) {
            e();
            return;
        }
        o(u6Var.S);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((x) arrayList.get(i10)).a((u6) u6Var.T.get(i10));
            i10++;
        }
    }

    public final void o(r rVar) {
        if (rVar == null) {
            rVar = new r(".");
        }
        ArrayList arrayList = rVar.e;
        this.f = rVar;
        w wVar = this.E;
        AndroidUtilities.cancelRunOnUIThread(wVar);
        int i10 = 0;
        while (true) {
            int size = arrayList.size();
            ArrayList arrayList2 = this.h;
            if (i10 >= Math.max(size, arrayList2.size())) {
                q();
                invalidate();
                AndroidUtilities.runOnUIThread(wVar, 360L);
                return;
            }
            q qVar = i10 < arrayList.size() ? (q) arrayList.get(i10) : null;
            x xVar = i10 < arrayList2.size() ? (x) arrayList2.get(i10) : null;
            if (xVar == null && qVar != null) {
                x xVar2 = new x(this);
                if (this.h0) {
                    xVar2.c.onAttachedToWindow();
                }
                xVar2.b(qVar, true);
                arrayList2.add(xVar2);
            } else if (qVar != null) {
                xVar.b(qVar, true);
            } else if (xVar != null) {
                this.n.add(xVar);
                arrayList2.remove(xVar);
                xVar.b(null, true);
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
                this.h0 = true;
                return;
            } else {
                ((x) arrayList.get(i10)).c.onAttachedToWindow();
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
                this.h0 = false;
                AndroidUtilities.cancelRunOnUIThread(this.t0);
                return;
            } else {
                ((x) arrayList.get(i10)).c.onDetachedFromWindow();
                i10++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        x xVar;
        u6 u6Var;
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
                        xVar = null;
                        break;
                    } else {
                        if (childAt == ((x) arrayList.get(i15)).e) {
                            xVar = (x) arrayList.get(i15);
                            break;
                        }
                        i15++;
                    }
                }
                if (xVar == null || (u6Var = xVar.n) == null || (i12 = u6Var.k0) <= 0 || (i13 = u6Var.l0) <= 0) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
                } else {
                    if (u6Var.Q % 90 == 1) {
                        i13 = i12;
                        i12 = i13;
                    }
                    float f10 = i12;
                    float f11 = i13;
                    float min = Math.min(1.0f, Math.max(f10 / size, f11 / size2));
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * min), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (f11 * min), TLObject.FLAG_30));
                }
            }
        }
    }

    public final void p() {
        CameraView cameraView = this.d;
        boolean z4 = cameraView != null && this.R;
        if (z4 == (this.e != null)) {
            return;
        }
        if (z4) {
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
            x xVar = (x) arrayList.get(i10);
            if (xVar.n == null) {
                if (this.r != null) {
                    this.s = xVar;
                    break;
                }
                this.r = xVar;
            }
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            x xVar2 = (x) arrayList.get(i11);
            xVar2.m = xVar2 == this.r;
        }
    }

    public void setCameraNeedsBlur(boolean z4) {
        if (this.R == z4) {
            return;
        }
        this.R = z4;
        p();
    }

    public void setCameraThumb(Drawable drawable) {
        this.O = drawable;
        invalidate();
    }

    public void setCameraThumbVisible(boolean z4) {
        this.P = z4;
        invalidate();
    }

    public void setCameraView(CameraView cameraView) {
        CameraView cameraView2 = this.d;
        if (cameraView2 != cameraView && cameraView2 != null) {
            cameraView2.unlistenDraw(new w(this, 1));
            AndroidUtilities.removeFromParent(this.d);
            this.d = null;
            p();
        }
        this.d = cameraView;
        if (cameraView != null) {
            addView(cameraView, k7.b6.e(-1, -1, 119));
        }
        CameraView cameraView3 = this.d;
        if (cameraView3 != null) {
            cameraView3.unlistenDraw(new w(this, 1));
        }
        this.d = cameraView;
        if (cameraView != null) {
            cameraView.listenDraw(new w(this, 1));
        }
        p();
        invalidate();
    }

    public void setCancelGestures(Runnable runnable) {
        this.i0 = runnable;
    }

    public void setMuted(boolean z4) {
        if (this.s0 == z4) {
            return;
        }
        this.s0 = z4;
    }

    public void setOnCameraThumbClick(Runnable runnable) {
        this.Q = runnable;
    }

    public void setPlaying(boolean z4) {
        boolean z10 = this.q0;
        this.q0 = true;
        if (this.n0 == z4) {
            return;
        }
        this.n0 = z4;
        if (!z4) {
            this.r0 = getPosition();
        } else if (z10) {
            m(this.r0, false);
        } else {
            this.m0 = false;
        }
        if (this.k0) {
            w wVar = this.t0;
            AndroidUtilities.cancelRunOnUIThread(wVar);
            wVar.run();
        }
    }

    public void setPreview(boolean z4) {
        if (this.k0 == z4) {
            return;
        }
        this.k0 = z4;
        ArrayList arrayList = this.h;
        int i10 = 0;
        if (z4) {
            org.telegram.ui.Components.ba baVar = this.D;
            if (baVar != null) {
                baVar.d();
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((x) arrayList.get(i11)).a = i11;
            }
        }
        this.m0 = false;
        this.r0 = 0L;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            x xVar = (x) obj;
            eg.t2 t2Var = xVar.d;
            if (t2Var != null) {
                t2Var.setAudioEnabled(z4, true);
                if (!z4 || this.n0) {
                    xVar.d.play();
                } else {
                    xVar.d.pause();
                }
            }
        }
        w wVar = this.t0;
        AndroidUtilities.cancelRunOnUIThread(wVar);
        if (z4) {
            this.l0 = System.currentTimeMillis();
            AndroidUtilities.runOnUIThread(wVar, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
        }
    }

    public void setPreviewView(l5 l5Var) {
        this.p0 = l5Var;
    }

    public void setResetState(Runnable runnable) {
        this.j0 = runnable;
    }

    public void setTimelineView(oa oaVar) {
        this.o0 = oaVar;
    }
}
