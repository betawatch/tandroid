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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f extends ei.f implements k6 {
    public static Path f0 = new Path();
    public int D;
    public int E;
    public int F;
    public int G;
    public float H;
    public float J;
    public int K;
    public int L;
    public g O;
    public final e P;
    public ol Q;
    public boolean R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    public int W;
    public k8 X;
    public boolean Y;
    public hi.a Z;
    public boolean a0;
    public final c b0;
    public a c0;
    public b d0;
    public d e0;
    public final hi.a f;
    public final hi.a h;
    public final hi.a n;
    public hi.a r;
    public wg.a w;
    public int x;
    public int y;
    public boolean s = true;
    public float I = -1.0f;
    public int M = a7.b;
    public final k N = new k();

    public f(hi.a aVar, hi.a aVar2, hi.a aVar3) {
        e eVar = new e();
        this.P = eVar;
        this.U = 1.0f;
        this.W = r.G;
        this.Y = true;
        this.b0 = new c(this);
        this.f = aVar;
        this.h = aVar2;
        this.n = aVar3;
        s sVar = this.b;
        if (!sVar.a) {
            aVar = aVar3;
        } else if (!this.V || !sVar.b || Build.VERSION.SDK_INT < 33) {
            aVar = aVar2;
        }
        this.r = aVar;
        eVar.i = i0.N(1.0f);
        eVar.j = i0.N(0.6666667f);
        this.S = i0.N(1.0f);
        this.T = i0.N(0.33333334f);
    }

    public static void l(Outline outline, Rect rect, float[] fArr) {
        if (o7.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = f0;
        if (path == null) {
            f0 = new Path();
        } else {
            path.rewind();
        }
        f0.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(f0);
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
        d dVar = this.e0;
        if (n10 != dVar || dVar == null) {
            return;
        }
        dVar.e();
    }

    @Override // ei.f
    public final void b(Rect rect) {
        rect.set(this.P.m);
    }

    @Override // ei.f
    public final int c() {
        return this.K;
    }

    @Override // ei.f
    public final int d() {
        return this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        hi.a aVar;
        int i10 = a7.b;
        if (this.M != i10) {
            this.M = i10;
            try {
                updateColors();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        int i11 = r.G;
        if (this.W != i11) {
            this.W = i11;
            s f7 = r.f();
            if (!Objects.equals(this.b, f7)) {
                this.b = f7;
                g(f7);
            }
        }
        e eVar = this.P;
        if (eVar.m.isEmpty()) {
            return;
        }
        k8 n10 = n();
        hi.a aVar2 = this.r;
        if (n10 == this.e0 && !canvas.isHardwareAccelerated()) {
            hi.a u10 = u(u(this.r));
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
        if (this.O == null) {
            this.O = new g(this.D, eVar.i, this.E, eVar.j, this.G, this.H);
        }
        this.N.a(canvas, f11, f12, f13, f14, fArr, this.O, f10);
    }

    @Override // ei.f
    public final boolean e() {
        k8 n10 = n();
        d dVar = this.e0;
        return n10 != dVar || dVar == null || dVar.c();
    }

    @Override // ei.f
    public final void f(int i10) {
        d dVar = this.e0;
        if (dVar != null) {
            dVar.f(i10 / 255.0f);
        }
    }

    @Override // ei.f
    public final void g(s sVar) {
        this.Y = true;
        updateColors();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        e eVar = this.P;
        l(outline, eVar.m, eVar.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        e eVar = this.P;
        int i10 = eVar.d;
        rect.set(i10, i10, i10, i10);
        return eVar.e;
    }

    @Override // ei.f
    public final void h() {
        d dVar = this.e0;
        if (dVar != null) {
            dVar.h = true;
        }
    }

    @Override // ei.f
    public final boolean j() {
        k8 n10 = n();
        d dVar = this.e0;
        return n10 == dVar && dVar != null;
    }

    public final k8 k(hi.a aVar) {
        hi.a u10 = u(aVar);
        if (Color.alpha(this.y) == 255 || (u10 instanceof hi.c)) {
            return this.b0;
        }
        if (u10 instanceof hi.b) {
            if (this.c0 == null) {
                this.c0 = new a(this);
            }
            return this.c0;
        }
        if (this.d0 == null) {
            this.d0 = new b(this);
        }
        return this.d0;
    }

    public final void m() {
        d dVar = this.e0;
        if (dVar != null) {
            dVar.d();
        }
    }

    public final k8 n() {
        k8 k10;
        if (this.Y) {
            s sVar = this.b;
            hi.a aVar = !sVar.a ? this.n : (this.V && sVar.b && Build.VERSION.SDK_INT >= 33) ? this.f : this.h;
            if (this.r != aVar) {
                this.r = aVar;
                d dVar = this.e0;
                if (dVar != null) {
                    dVar.h = true;
                }
            }
        }
        hi.a u10 = u(this.r);
        boolean z10 = Color.alpha(this.y) == 255;
        if (this.X == null || this.Y || this.Z != u10 || this.a0 != z10) {
            this.Y = false;
            this.Z = u10;
            this.a0 = z10;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 29 || !(this.r instanceof tg.a) || (u10 instanceof hi.c) || (u10 instanceof hi.b)) {
                k10 = k(u10);
            } else {
                if (this.e0 == null) {
                    d dVar2 = new d(this);
                    dVar2.g(this.s);
                    dVar2.f(this.c / 255.0f);
                    dVar2.d();
                    this.e0 = dVar2;
                }
                k10 = this.e0;
            }
            d dVar3 = this.e0;
            if (dVar3 != null) {
                dVar3.h(k10 == dVar3 && this.V && this.b.b && i10 >= 33);
            }
            k8 k8Var = this.X;
            if (k8Var != k10 && k8Var != null) {
                k8Var.a();
            }
            this.X = k10;
        }
        return this.X;
    }

    public final void o(wg.a aVar) {
        this.w = aVar;
        if (this.I < 0.0f) {
            this.I = this.S;
            this.J = this.T;
        }
        updateColors();
        if (aVar instanceof wg.d) {
            wg.d dVar = (wg.d) aVar;
            float f7 = dVar.f;
            float f10 = dVar.h;
            e eVar = this.P;
            eVar.i = f7;
            eVar.j = f10;
            this.O = null;
            float c10 = dVar.c();
            float b10 = dVar.b();
            this.S = c10;
            this.T = b10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        e eVar = this.P;
        eVar.a.set(rect);
        eVar.a();
        m();
    }

    public final void p(int i10) {
        e eVar = this.P;
        if (eVar.d != i10) {
            eVar.d = i10;
            eVar.a();
            m();
        }
    }

    public final void q(float f7) {
        e eVar = this.P;
        Arrays.fill(eVar.b, f7);
        Arrays.fill(eVar.c, f7);
        eVar.a();
        m();
    }

    public final void r(float f7, float f10, float f11, float f12) {
        e eVar = this.P;
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
        e eVar = this.P;
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
        this.P.f = i10;
        m();
    }

    @Override // ei.f
    public final void updateColors() {
        this.M = a7.b;
        wg.a aVar = this.w;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof wg.b) {
            ((wg.b) aVar).d();
        }
        this.y = this.w.n0();
        this.x = this.w.j0();
        this.D = this.w.u();
        this.E = this.w.E();
        this.F = this.w.h0();
        this.G = this.w.w();
        this.H = this.w.b0();
        wg.a aVar2 = this.w;
        if (aVar2 instanceof wg.d) {
            wg.d dVar = (wg.d) aVar2;
            float c10 = dVar.c();
            float b10 = dVar.b();
            this.S = c10;
            this.T = b10;
        } else if (aVar2.X() >= 0.0f) {
            float X = this.w.X();
            float N = this.w.N();
            this.S = X;
            this.T = N;
        } else {
            float f7 = this.I;
            if (f7 >= 0.0f) {
                float f10 = this.J;
                this.S = f7;
                this.T = f10;
            }
        }
        this.O = null;
        d dVar2 = this.e0;
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
