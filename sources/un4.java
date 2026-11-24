// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class un4 extends FrameLayout implements x74, tjb {
    public int E;
    public int F;
    public float G;
    public float H;
    public boolean I;
    public final fm0 a;
    public final fm0 b;
    public final ry8 c;
    public final RadialProgressView d;
    public final wjb e;
    public ArrayList f;
    public final boolean h;
    public final ix4 n;
    public final il0 r;
    public final ab1 s;
    public ff0 w;
    public int x;
    public boolean y;

    public un4(wjb wjbVar, Context context, boolean z) {
        super(context);
        s33 s33Var = s33.h;
        this.a = new fm0(0, this, s33Var, 380L, true);
        this.b = new fm0(1, this, s33Var, 380L, false);
        this.e = wjbVar;
        this.h = z;
        ry8 ry8Var = new ry8(context);
        this.c = ry8Var;
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ry8Var, nme.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(gl.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, nme.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        ote.a(this);
        if (z) {
            ab1 ab1Var = new ab1(bkb.g5, null);
            this.s = ab1Var;
            ix4 ix4Var = new ix4();
            this.n = ix4Var;
            il0 il0Var = new il0(ix4Var, ix4Var, ix4Var);
            this.r = il0Var;
            il0Var.p(ab1Var);
            float N = gl.N(0.4f);
            float N2 = gl.N(0.4f);
            hl0 hl0Var = il0Var.S;
            hl0Var.i = N;
            hl0Var.j = N2;
            il0Var.Q = null;
            ug8.r(il0Var, gl.L(18.0f), 5.66f);
        } else {
            setOutlineProvider(zdc.a);
            setTranslationZ(gl.N(0.5f));
        }
        updateColors();
    }

    public static FrameLayout.LayoutParams b() {
        return nme.d(48, 48.0f, (k96.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        return nme.d(48, 48.0f, (k96.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
        view.setScaleX(gl.R1(0.4f, 1.0f, f));
        view.setScaleY(gl.R1(0.4f, 1.0f, f));
        view.setVisibility(f > 0.0f ? 0 : 8);
    }

    private void setAdditionalTranslationY(float f) {
        if (this.G != f) {
            this.I = true;
            super.setTranslationY(this.H + f);
            this.I = false;
            this.G = f;
        }
    }

    public final void a(View view) {
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f = arrayList;
        }
        arrayList.add(view);
        d(view, 1.0f - this.b.e);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        il0 il0Var = this.r;
        if (il0Var != null) {
            il0Var.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z, boolean z2) {
        this.a.a(z, z2);
    }

    public final void f(boolean z, boolean z2) {
        this.b.a(z, z2);
    }

    public boolean getButtonVisible() {
        return this.a.f;
    }

    public boolean getProgressVisible() {
        return this.b.f;
    }

    @Override // android.view.View
    public float getTranslationY() {
        return this.I ? super.getTranslationY() : this.H;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        il0 il0Var = this.r;
        if (il0Var != null) {
            il0Var.setBounds(0, 0, i, i2);
        }
    }

    @Override // x74
    public final void p(int i, float f, float f2, y74 y74Var) {
        int i2 = 0;
        if (i == 0) {
            d(this, f);
            setClickable(f >= 0.99f);
            setAdditionalTranslationY((1.0f - f) * gl.L(this.h ? 64.0f : 40.0f));
        } else if (i == 1) {
            d(this.d, f);
            float f3 = 1.0f - f;
            d(this.c, f3);
            ArrayList arrayList = this.f;
            if (arrayList != null) {
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    d((View) obj, f3);
                }
            }
        }
    }

    public void setImageResource(int i) {
        this.c.setImageResource(i);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        if (this.H != f) {
            this.I = true;
            super.setTranslationY(this.G + f);
            this.I = false;
            this.H = f;
        }
    }

    @Override // tjb
    public final void updateColors() {
        RadialProgressView radialProgressView;
        ry8 ry8Var = this.c;
        if (ry8Var == null || (radialProgressView = this.d) == null) {
            return;
        }
        boolean z = this.w != null && getBackground() == this.w;
        boolean z2 = this.h;
        wjb wjbVar = this.e;
        if (!z2) {
            int i = bkb.N9;
            int v0 = bkb.v0(i, wjbVar);
            if (v0 != this.x || !this.y) {
                this.x = v0;
                this.y = true;
                ry8Var.setColorFilter(v0, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(bkb.v0(i, wjbVar));
            int v02 = bkb.v0(bkb.Ei, wjbVar);
            int v03 = bkb.v0(bkb.Gi, wjbVar);
            if (!z) {
                this.E = v02;
                this.F = v03;
                ff0 h0 = bkb.h0(gl.L(48.0f), v02, v03);
                this.w = h0;
                setBackground(h0);
                return;
            }
            if (v02 == this.E && v03 == this.F) {
                return;
            }
            this.E = v02;
            this.F = v03;
            bkb.F1(this.w, v02, false);
            bkb.F1(this.w, v03, true);
            this.w.invalidateSelf();
            return;
        }
        int i2 = bkb.u8;
        int v04 = bkb.v0(i2, wjbVar);
        if (v04 != this.x || !this.y) {
            this.x = v04;
            this.y = true;
            ry8Var.setColorFilter(v04, PorterDuff.Mode.SRC_IN);
        }
        radialProgressView.setProgressColor(bkb.v0(i2, wjbVar));
        ix4 ix4Var = this.n;
        if (ix4Var != null) {
            ix4Var.a(bkb.w0(null, bkb.c6, false));
        }
        ab1 ab1Var = this.s;
        if (ab1Var != null) {
            ab1Var.d();
        }
        il0 il0Var = this.r;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        invalidate();
        int L = gl.L(18.0f);
        int v05 = bkb.v0(bkb.h6, wjbVar);
        if (z) {
            if (v05 != this.F) {
                this.F = v05;
                bkb.F1(this.w, v05, true);
                return;
            }
            return;
        }
        this.F = v05;
        int L2 = gl.L(6.0f);
        ff0 W = bkb.W(L, v05, L2, L2, L2, L2);
        this.w = W;
        setBackground(W);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // x74
    public final void D(float f, int i) {
    }

    public un4(Context context, wjb wjbVar) {
        this(wjbVar, context, false);
    }
}
