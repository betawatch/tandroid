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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wp4 extends FrameLayout implements g94, vlb {
    public int E;
    public int F;
    public float G;
    public float H;
    public boolean I;
    public final fn0 a;
    public final fn0 b;
    public final s09 c;
    public final RadialProgressView d;
    public final ylb e;
    public ArrayList f;
    public final boolean h;
    public final kz4 n;
    public final im0 r;
    public final ic1 s;
    public fg0 w;
    public int x;
    public boolean y;

    public wp4(ylb ylbVar, Context context, boolean z) {
        super(context);
        d53 d53Var = d53.h;
        this.a = new fn0(0, this, d53Var, 380L, true);
        this.b = new fn0(1, this, d53Var, 380L, false);
        this.e = ylbVar;
        this.h = z;
        s09 s09Var = new s09(context);
        this.c = s09Var;
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(s09Var, qoe.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(gm.L(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, qoe.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        rve.a(this);
        if (z) {
            ic1 ic1Var = new ic1(cmb.g5, null);
            this.s = ic1Var;
            kz4 kz4Var = new kz4();
            this.n = kz4Var;
            im0 im0Var = new im0(kz4Var, kz4Var, kz4Var);
            this.r = im0Var;
            im0Var.p(ic1Var);
            float N = gm.N(0.4f);
            float N2 = gm.N(0.4f);
            hm0 hm0Var = im0Var.S;
            hm0Var.i = N;
            hm0Var.j = N2;
            im0Var.Q = null;
            wi8.r(im0Var, gm.L(18.0f), 5.66f);
        } else {
            setOutlineProvider(agc.a);
            setTranslationZ(gm.N(0.5f));
        }
        updateColors();
    }

    public static FrameLayout.LayoutParams b() {
        return qoe.d(48, 48.0f, (jb6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        return qoe.d(48, 48.0f, (jb6.a0 ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
        view.setScaleX(gm.R1(0.4f, 1.0f, f));
        view.setScaleY(gm.R1(0.4f, 1.0f, f));
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

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2 = 0;
        if (i == 0) {
            d(this, f);
            setClickable(f >= 0.99f);
            setAdditionalTranslationY((1.0f - f) * gm.L(this.h ? 64.0f : 40.0f));
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
        im0 im0Var = this.r;
        if (im0Var != null) {
            im0Var.draw(canvas);
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
        im0 im0Var = this.r;
        if (im0Var != null) {
            im0Var.setBounds(0, 0, i, i2);
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

    @Override // vlb
    public final void updateColors() {
        RadialProgressView radialProgressView;
        s09 s09Var = this.c;
        if (s09Var == null || (radialProgressView = this.d) == null) {
            return;
        }
        boolean z = this.w != null && getBackground() == this.w;
        boolean z2 = this.h;
        ylb ylbVar = this.e;
        if (!z2) {
            int i = cmb.N9;
            int v0 = cmb.v0(i, ylbVar);
            if (v0 != this.x || !this.y) {
                this.x = v0;
                this.y = true;
                s09Var.setColorFilter(v0, PorterDuff.Mode.SRC_IN);
            }
            radialProgressView.setProgressColor(cmb.v0(i, ylbVar));
            int v02 = cmb.v0(cmb.Ei, ylbVar);
            int v03 = cmb.v0(cmb.Gi, ylbVar);
            if (!z) {
                this.E = v02;
                this.F = v03;
                fg0 h0 = cmb.h0(gm.L(48.0f), v02, v03);
                this.w = h0;
                setBackground(h0);
                return;
            }
            if (v02 == this.E && v03 == this.F) {
                return;
            }
            this.E = v02;
            this.F = v03;
            cmb.F1(this.w, v02, false);
            cmb.F1(this.w, v03, true);
            this.w.invalidateSelf();
            return;
        }
        int i2 = cmb.u8;
        int v04 = cmb.v0(i2, ylbVar);
        if (v04 != this.x || !this.y) {
            this.x = v04;
            this.y = true;
            s09Var.setColorFilter(v04, PorterDuff.Mode.SRC_IN);
        }
        radialProgressView.setProgressColor(cmb.v0(i2, ylbVar));
        kz4 kz4Var = this.n;
        if (kz4Var != null) {
            kz4Var.a(cmb.w0(null, cmb.c6, false));
        }
        ic1 ic1Var = this.s;
        if (ic1Var != null) {
            ic1Var.d();
        }
        im0 im0Var = this.r;
        if (im0Var != null) {
            im0Var.updateColors();
        }
        invalidate();
        int L = gm.L(18.0f);
        int v05 = cmb.v0(cmb.h6, ylbVar);
        if (z) {
            if (v05 != this.F) {
                this.F = v05;
                cmb.F1(this.w, v05, true);
                return;
            }
            return;
        }
        this.F = v05;
        int L2 = gm.L(6.0f);
        fg0 W = cmb.W(L, v05, L2, L2, L2, L2);
        this.w = W;
        setBackground(W);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // g94
    public final void V(float f, int i) {
    }

    public wp4(Context context, ylb ylbVar) {
        this(ylbVar, context, false);
    }
}
