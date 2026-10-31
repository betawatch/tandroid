package vg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import ei.r;
import ei.s;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ol;
import w7.k8;
import w7.o7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends ei.f implements k6 {
    public static Path c0 = new Path();
    public int D;
    public float E;
    public float G;
    public int H;
    public int I;
    public g L;
    public final e M;
    public ol N;
    public boolean O;
    public float P;
    public float Q;
    public float R;
    public boolean S;
    public int T;
    public k8 U;
    public boolean V;
    public hi.a W;
    public boolean X;
    public final c Y;
    public a Z;
    public b a0;
    public d b0;
    public final hi.a f;
    public wg.a n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;
    public boolean h = true;
    public float F = -1.0f;
    public int J = a7.b;
    public final k K = new k();

    public f(hi.a aVar) {
        e eVar = new e();
        this.M = eVar;
        this.R = 1.0f;
        this.T = r.G;
        this.V = true;
        this.Y = new c(this);
        this.f = aVar;
        eVar.i = i0.N(1.0f);
        eVar.j = i0.N(0.6666667f);
        this.P = i0.N(1.0f);
        this.Q = i0.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (o7.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = c0;
        if (path == null) {
            c0 = new Path();
        } else {
            path.rewind();
        }
        c0.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(c0);
    }

    public static hi.a u(hi.a aVar) {
        while (aVar instanceof hi.g) {
            aVar = ((hi.g) aVar).a;
        }
        return aVar;
    }

    @Override // ei.f
    public final void a() {
        k8 n10 = n();
        d dVar = this.b0;
        if (n10 != dVar || dVar == null) {
            return;
        }
        dVar.e();
    }

    @Override // ei.f
    public final void b(Rect rect) {
        rect.set(this.M.m);
    }

    @Override // ei.f
    public final int c() {
        return this.H;
    }

    @Override // ei.f
    public final int d() {
        return this.I;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        hi.a aVar;
        int i10 = a7.b;
        if (this.J != i10) {
            this.J = i10;
            try {
                updateColors();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        int i11 = r.G;
        if (this.T != i11) {
            this.T = i11;
            s f7 = r.f();
            if (!Objects.equals(this.b, f7)) {
                this.b = f7;
                g(f7);
            }
        }
        e eVar = this.M;
        if (eVar.m.isEmpty()) {
            return;
        }
        k8 n10 = n();
        d dVar = this.b0;
        hi.a aVar2 = this.f;
        if (n10 == dVar && !canvas.isHardwareAccelerated()) {
            hi.a u10 = u(u(aVar2));
            if (Build.VERSION.SDK_INT >= 29 && (u10 instanceof hi.f) && (aVar = ((hi.f) u10).a) != null) {
                u10 = u(aVar);
            }
            aVar2 = u10;
            n10 = k(aVar2);
        }
        n10.b(canvas, aVar2);
        float f10 = this.c / 255.0f;
        Rect rect = eVar.m;
        float f11 = rect.left;
        float f12 = rect.top;
        float f13 = rect.right;
        float f14 = rect.bottom;
        float[] fArr = eVar.b;
        if (this.L == null) {
            this.L = new g(this.w, eVar.i, this.x, eVar.j, this.D, this.E);
        }
        this.K.a(canvas, f11, f12, f13, f14, fArr, this.L, f10);
    }

    @Override // ei.f
    public final boolean e() {
        d dVar = this.b0;
        return dVar == null || dVar.c();
    }

    @Override // ei.f
    public final void f(int i10) {
        d dVar = this.b0;
        if (dVar != null) {
            dVar.f(i10 / 255.0f);
        }
    }

    @Override // ei.f
    public final void g(s sVar) {
        this.V = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        e eVar = this.M;
        l(outline, eVar.m, eVar.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        e eVar = this.M;
        int i10 = eVar.d;
        rect.set(i10, i10, i10, i10);
        return eVar.e;
    }

    @Override // ei.f
    public final void h() {
        d dVar = this.b0;
        if (dVar != null) {
            dVar.h = true;
        }
    }

    @Override // ei.f
    public final boolean j() {
        k8 n10 = n();
        d dVar = this.b0;
        return n10 == dVar && dVar != null;
    }

    public final k8 k(hi.a aVar) {
        hi.a u10 = u(aVar);
        if (Color.alpha(this.s) == 255 || (u10 instanceof hi.c)) {
            return this.Y;
        }
        if (u10 instanceof hi.b) {
            if (this.Z == null) {
                this.Z = new a(this);
            }
            return this.Z;
        }
        if (this.a0 == null) {
            this.a0 = new b(this);
        }
        return this.a0;
    }

    public final void m() {
        d dVar = this.b0;
        if (dVar != null) {
            dVar.d();
        }
    }

    public final k8 n() {
        k8 k10;
        hi.a aVar = this.f;
        hi.a u10 = u(aVar);
        boolean z10 = Color.alpha(this.s) == 255;
        if (this.U == null || this.V || this.W != u10 || this.X != z10) {
            this.V = false;
            this.W = u10;
            this.X = z10;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 29 || !(aVar instanceof tg.a) || (u10 instanceof hi.c) || (u10 instanceof hi.b)) {
                k10 = k(u10);
            } else {
                if (this.b0 == null) {
                    d dVar = new d(this);
                    dVar.g(this.h);
                    dVar.f(this.c / 255.0f);
                    dVar.d();
                    this.b0 = dVar;
                }
                k10 = this.b0;
            }
            d dVar2 = this.b0;
            if (dVar2 != null) {
                dVar2.h(k10 == dVar2 && this.S && this.b.b && i10 >= 33);
            }
            k8 k8Var = this.U;
            if (k8Var != k10 && k8Var != null) {
                k8Var.a();
            }
            this.U = k10;
        }
        return this.U;
    }

    public final void o(wg.a aVar) {
        this.n = aVar;
        if (this.F < 0.0f) {
            this.F = this.P;
            this.G = this.Q;
        }
        updateColors();
        if (aVar instanceof wg.d) {
            wg.d dVar = (wg.d) aVar;
            float f7 = dVar.f;
            float f10 = dVar.h;
            e eVar = this.M;
            eVar.i = f7;
            eVar.j = f10;
            this.L = null;
            float c10 = dVar.c();
            float b10 = dVar.b();
            this.P = c10;
            this.Q = b10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        e eVar = this.M;
        eVar.a.set(rect);
        eVar.a();
        m();
    }

    public final void p(int i10) {
        e eVar = this.M;
        if (eVar.d != i10) {
            eVar.d = i10;
            eVar.a();
            m();
        }
    }

    public final void q(float f7) {
        e eVar = this.M;
        Arrays.fill(eVar.b, f7);
        Arrays.fill(eVar.c, f7);
        eVar.a();
        m();
    }

    public final void r(float f7, float f10, float f11, float f12) {
        e eVar = this.M;
        float[] fArr = eVar.b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[7] = f12;
        fArr[6] = f12;
        eVar.a();
        m();
    }

    public final void s(float f7, float f10, float f11, float f12, boolean z10) {
        e eVar = this.M;
        float[] fArr = eVar.b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        float f13 = z10 ? 0.0f : f11;
        fArr[5] = f13;
        fArr[4] = f13;
        float f14 = z10 ? 0.0f : f12;
        fArr[7] = f14;
        fArr[6] = f14;
        float[] fArr2 = eVar.c;
        fArr2[1] = f7;
        fArr2[0] = f7;
        fArr2[3] = f10;
        fArr2[2] = f10;
        fArr2[5] = f11;
        fArr2[4] = f11;
        fArr2[7] = f12;
        fArr2[6] = f12;
        eVar.a();
        m();
    }

    public final void t(int i10) {
        this.M.f = i10;
        m();
    }

    @Override // ei.f
    public final void updateColors() {
        this.J = a7.b;
        wg.a aVar = this.n;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof wg.b) {
            ((wg.b) aVar).d();
        }
        this.s = this.n.n0();
        this.r = this.n.j0();
        this.w = this.n.u();
        this.x = this.n.E();
        this.y = this.n.h0();
        this.D = this.n.w();
        this.E = this.n.b0();
        wg.a aVar2 = this.n;
        if (aVar2 instanceof wg.d) {
            wg.d dVar = (wg.d) aVar2;
            float c10 = dVar.c();
            float b10 = dVar.b();
            this.P = c10;
            this.Q = b10;
        } else if (aVar2.X() >= 0.0f) {
            float X = this.n.X();
            float N = this.n.N();
            this.P = X;
            this.Q = N;
        } else {
            float f7 = this.F;
            if (f7 >= 0.0f) {
                float f10 = this.G;
                this.P = f7;
                this.Q = f10;
            }
        }
        this.L = null;
        d dVar2 = this.b0;
        if (dVar2 != null) {
            dVar2.h = true;
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
