// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class wma extends FrameLayout implements snb {
    public static boolean f0;
    public float E;
    public int F;
    public boolean G;
    public final wk5 H;
    public hb I;
    public int J;
    public boolean K;
    public wna L;
    public nf9 M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public final Paint Q;
    public final Paint R;
    public final Paint S;
    public final Paint T;
    public float U;
    public float V;
    public float W;
    public final Rect a;
    public RenderNode[] a0;
    public Drawable b;
    public final boolean[] b0;
    public boolean c;
    public final boolean[] c0;
    public Drawable d;
    public final ArrayList d0;
    public boolean e;
    public final ArrayList e0;
    public int f;
    public int h;
    public vma n;
    public final ArrayList r;
    public boolean s;
    public pvc w;
    public float x;
    public float y;

    public wma(Context context, wk5 wk5Var) {
        super(context);
        this.a = new Rect();
        this.r = new ArrayList();
        this.s = true;
        this.E = 1.0f;
        this.G = true;
        this.O = new ArrayList(10);
        this.P = new ArrayList();
        this.Q = new Paint();
        this.R = new Paint();
        this.S = new Paint();
        this.T = new Paint();
        this.U = 1.0f;
        this.b0 = new boolean[2];
        this.c0 = new boolean[2];
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        setWillNotDraw(false);
        this.H = wk5Var;
        this.I = null;
    }

    public static boolean E() {
        return Build.VERSION.SDK_INT >= 31 && xea.X;
    }

    public static float getBlurRadius() {
        int o = xea.o();
        if (o != 1) {
            return o != 2 ? 3.0f : 60.0f;
        }
        return 4.0f;
    }

    public static float getRenderNodeScale() {
        int L;
        int o = xea.o();
        if (o == 1) {
            L = hl.L(12.0f);
        } else {
            if (o == 2) {
                return hl.p;
            }
            L = hl.L(15.0f);
        }
        return L;
    }

    public final void F() {
        if (!this.e && !this.c) {
            pvc pvcVar = this.w;
            if (pvcVar != null) {
                pvcVar.b(false);
                this.w = null;
                this.E = 1.0f;
                this.x = 0.0f;
                this.y = 0.0f;
                return;
            }
            return;
        }
        byte b = 1;
        if (this.w == null) {
            pvc pvcVar2 = new pvc(getContext());
            this.w = pvcVar2;
            pvcVar2.n = new hja(this, b);
            if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
                pvc pvcVar3 = this.w;
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                pvcVar3.getClass();
                this.E = pvc.a(measuredWidth, measuredHeight);
            }
        }
        if (this.G) {
            return;
        }
        this.w.b(true);
    }

    public final void G(Canvas canvas) {
        if (this.M != null && aob.G1 && i86.e(32)) {
            if (this.L == null) {
                wna wnaVar = new wna(1);
                this.L = wnaVar;
                wnaVar.g = -1;
                wnaVar.c();
            }
            this.L.b(canvas, this.M);
        }
    }

    public void H(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
        I(canvas, f, rect, paint, z, Color.alpha(aob.v0((E() && xea.o() == 2) ? aob.og : aob.pg, getResourceProvider())));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(Canvas canvas, float f, Rect rect, Paint paint, boolean z, int i) {
        int i2;
        boolean z2;
        float f2;
        RenderNode renderNode;
        float f3;
        boolean z3;
        Shader.TileMode tileMode;
        if (!xea.f()) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (!E()) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (!canvas.isHardwareAccelerated()) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (this.a0 == null) {
            this.a0 = new RenderNode[2];
        }
        float renderNodeScale = getRenderNodeScale();
        int i3 = !z ? 1 : 0;
        boolean[] zArr = this.c0;
        if (!z && !zArr[i3] && Math.abs(getBottomOffset() - this.V) > 0.1f) {
            zArr[i3] = true;
        }
        int L = hl.L(36.0f);
        if (i < 255 && zArr[i3]) {
            boolean[] zArr2 = this.b0;
            if (!zArr2[i3]) {
                RenderNode[] renderNodeArr = this.a0;
                if (renderNodeArr[i3] == null) {
                    vk1.p();
                    z2 = true;
                    f2 = 1.0f;
                    renderNodeArr[i3] = new RenderNode("blurNode" + i3);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(2.0f);
                    RenderNode renderNode2 = this.a0[i3];
                    float blurRadiusInternal = getBlurRadiusInternal();
                    float blurRadiusInternal2 = getBlurRadiusInternal();
                    tileMode = Shader.TileMode.DECAL;
                    renderNode2.setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(blurRadiusInternal, blurRadiusInternal2, tileMode), RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix))));
                } else {
                    z2 = true;
                    f2 = 1.0f;
                }
                int measuredWidth = getMeasuredWidth();
                int L2 = hl.L(100.0f) + a.getCurrentActionBarHeight() + hl.m;
                int i4 = 0;
                this.a0[i3].setPosition(0, 0, (int) (measuredWidth / renderNodeScale), (int) (((L << 1) + L2) / renderNodeScale));
                RecordingCanvas beginRecording = this.a0[i3].beginRecording();
                f0 = z2;
                float f4 = f2 / renderNodeScale;
                beginRecording.scale(f4, f4);
                beginRecording.drawPaint(paint);
                beginRecording.translate(0.0f, L);
                if (!z) {
                    float bottomOffset = getBottomOffset();
                    this.V = bottomOffset;
                    float f5 = bottomOffset - L2;
                    this.W = f5;
                    beginRecording.translate(0.0f, -f5);
                }
                if (N()) {
                    ArrayList arrayList = this.d0;
                    arrayList.clear();
                    ArrayList arrayList2 = this.e0;
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    J(beginRecording, arrayList2);
                    int size = arrayList.size();
                    z3 = false;
                    while (i4 < size) {
                        Object obj = arrayList.get(i4);
                        i4++;
                        ((tma) obj).d(null);
                        i3 = i3;
                    }
                    i2 = i3;
                    int size2 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj2 = arrayList2.get(i5);
                        i5++;
                        ((tma) obj2).d(new ux9(this, (byte) 29));
                    }
                } else {
                    J(beginRecording, null);
                    i2 = i3;
                    z3 = false;
                }
                f0 = z3;
                this.a0[i2].endRecording();
                zArr2[i2] = z2;
                zArr[i2] = z3;
                if (!N()) {
                    zArr[i2] = z2;
                    M();
                }
                canvas.save();
                canvas.drawRect(rect, paint);
                canvas.clipRect(rect);
                renderNode = this.a0[i2];
                if (renderNode != null && i < 255) {
                    renderNode.setAlpha(f2 - (i / 255.0f));
                    if (z) {
                        f3 = 0.0f;
                        canvas.translate(0.0f, ((-f) + this.W) - (this.V - (getListTranslationY() + getBottomOffset())));
                    } else {
                        f3 = 0.0f;
                        canvas.translate(0.0f, (-f) - getTranslationY());
                    }
                    canvas.translate(f3, -L);
                    canvas.scale(renderNodeScale, renderNodeScale);
                    canvas.drawRenderNode(this.a0[i2]);
                }
                canvas.restore();
            }
        }
        i2 = i3;
        z2 = true;
        f2 = 1.0f;
        if (!N()) {
        }
        canvas.save();
        canvas.drawRect(rect, paint);
        canvas.clipRect(rect);
        renderNode = this.a0[i2];
        if (renderNode != null) {
            renderNode.setAlpha(f2 - (i / 255.0f));
            if (z) {
            }
            canvas.translate(f3, -L);
            canvas.scale(renderNodeScale, renderNodeScale);
            canvas.drawRenderNode(this.a0[i2]);
        }
        canvas.restore();
    }

    public void K() {
        xea.f();
    }

    public final void M() {
        boolean[] zArr = this.c0;
        int i = 0;
        zArr[0] = true;
        zArr[1] = true;
        while (true) {
            ArrayList arrayList = this.P;
            if (i >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i)).invalidate();
            i++;
        }
    }

    public boolean N() {
        return this instanceof nt1;
    }

    public boolean O() {
        return !(this instanceof mf1);
    }

    public boolean P() {
        return !(this instanceof mf1);
    }

    public int Q() {
        View rootView = getRootView();
        Rect rect = this.a;
        getWindowVisibleDisplayFrame(rect);
        if (rect.bottom == 0 && rect.top == 0) {
            return 0;
        }
        int max = Math.max(0, ((rootView.getHeight() - (rect.top != 0 ? hl.m : 0)) - hl.o1(rootView)) - (rect.bottom - rect.top));
        this.f = max;
        return max;
    }

    public void R() {
        if (this.w != null) {
            this.E = pvc.a(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.n == null && this.r.isEmpty()) {
            return;
        }
        this.f = Q();
        Point point = hl.q;
        post(new q38((byte) 15, (Object) this, point.x > point.y));
    }

    public final void U(Drawable drawable) {
        if (this.b == drawable) {
            return;
        }
        if (this.M == null) {
            nf9 nf9Var = new nf9((byte) 8, getContext(), this);
            this.M = nf9Var;
            addView(nf9Var, 0, tre.c(-1.0f, -1));
        }
        if (drawable instanceof hh7) {
            ((hh7) drawable).p(this.M);
        }
        if (this.N) {
            Drawable drawable2 = this.b;
            if (drawable2 instanceof g82) {
                ((g82) drawable2).g(this.M);
            }
        }
        this.b = drawable;
        if (this.N && (drawable instanceof g82)) {
            ((g82) drawable).f(this.M);
        }
        if (this.N) {
            Drawable drawable3 = this.b;
            if (drawable3 instanceof hh7) {
                ((hh7) drawable3).l();
            }
        }
        if (this.N) {
            Drawable drawable4 = this.b;
            if (drawable4 instanceof hh7) {
                ((hh7) drawable4).k();
            }
        }
        T(this.b);
        F();
        this.M.invalidate();
    }

    public void V() {
        if (E()) {
            M();
        }
    }

    public boolean W() {
        return !(this instanceof u4a);
    }

    public void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.pg));
        hashSet.add(Integer.valueOf(aob.og));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean[] zArr = this.b0;
        zArr[0] = false;
        zArr[1] = false;
        super.dispatchDraw(canvas);
    }

    public Drawable getBackgroundImage() {
        return this.b;
    }

    public int getBackgroundSizeY() {
        return getMeasuredHeight() - (this.b instanceof g82 ? this.F : 0);
    }

    public int getBackgroundTranslationY() {
        Drawable drawable = this.b;
        if (drawable instanceof hh7) {
            return this.F;
        }
        if (drawable instanceof g82) {
            return this.F;
        }
        return 0;
    }

    public float getBlurRadiusInternal() {
        return getBlurRadius();
    }

    public float getBottomOffset() {
        return getMeasuredHeight();
    }

    public int getBottomPadding() {
        return 0;
    }

    public float getBottomTranslation() {
        return 0.0f;
    }

    public int getHeightWithKeyboard() {
        return getMeasuredHeight() + this.f;
    }

    public int getKeyboardHeight() {
        return this.f;
    }

    public float getListTranslationY() {
        return 0.0f;
    }

    public Drawable getNewDrawable() {
        return aob.s0();
    }

    public boolean getNewDrawableMotion() {
        return aob.h0;
    }

    public vnb getResourceProvider() {
        return null;
    }

    public int getScrollOffset() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        Drawable drawable = this.b;
        if (drawable instanceof g82) {
            ((g82) drawable).f(this.M);
        }
        Drawable drawable2 = this.b;
        if (drawable2 instanceof hh7) {
            ((hh7) drawable2).k();
        }
        Drawable drawable3 = this.d;
        if (drawable3 instanceof g82) {
            ((g82) drawable3).f(this.M);
        }
        Drawable drawable4 = this.d;
        if (drawable4 instanceof hh7) {
            ((hh7) drawable4).k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.N = false;
        this.Q.setShader(null);
        this.R.setShader(null);
        this.S.setShader(null);
        this.T.setShader(null);
        while (true) {
            ArrayList arrayList = this.O;
            if (i >= arrayList.size()) {
                arrayList.clear();
                Drawable drawable = this.b;
                if (drawable instanceof g82) {
                    ((g82) drawable).g(this.M);
                }
                Drawable drawable2 = this.d;
                if (drawable2 instanceof g82) {
                    ((g82) drawable2).g(this.M);
                }
                Drawable drawable3 = this.b;
                if (drawable3 instanceof hh7) {
                    ((hh7) drawable3).l();
                }
                Drawable drawable4 = this.d;
                if (drawable4 instanceof hh7) {
                    ((hh7) drawable4).l();
                    return;
                }
                return;
            }
            if (arrayList.get(i) != null) {
                ((sma) arrayList.get(i)).getClass();
                throw null;
            }
            i++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        R();
    }

    public void setBackgroundTranslation(int i) {
        if (i != this.F) {
            this.F = i;
            nf9 nf9Var = this.M;
            if (nf9Var != null) {
                nf9Var.invalidate();
            }
        }
    }

    public void setBottomClip(int i) {
        if (i != this.h) {
            this.h = i;
            nf9 nf9Var = this.M;
            if (nf9Var != null) {
                nf9Var.invalidate();
            }
        }
    }

    public void setDelegate(vma vmaVar) {
        this.n = vmaVar;
    }

    public void setEmojiKeyboardHeight(int i) {
        if (this.J != i) {
            this.J = i;
            nf9 nf9Var = this.M;
            if (nf9Var != null) {
                nf9Var.invalidate();
            }
        }
    }

    public void setOccupyStatusBar(boolean z) {
        this.s = z;
    }

    public void setSkipBackgroundDrawing(boolean z) {
        if (this.K != z) {
            this.K = z;
            nf9 nf9Var = this.M;
            if (nf9Var != null) {
                nf9Var.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == getBackgroundImage() || super.verifyDrawable(drawable);
    }

    public void S() {
    }

    public void updateColors() {
    }

    public void T(Drawable drawable) {
    }

    public void J(Canvas canvas, ArrayList arrayList) {
    }
}
