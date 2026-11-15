package si;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import bg.c0;
import c8.hc;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.j6;
import ri.r;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class f extends ri.e {
    public g E;
    public g F;
    public g G;
    public ui.c H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final RectF M;
    public final ui.a f;
    public final a h;
    public final hc n;
    public final hc r;
    public hc s;
    public boolean w = true;
    public boolean x = true;
    public int y = 1;

    public f(ui.a aVar) {
        g gVar = g.b;
        this.E = gVar;
        this.F = gVar;
        this.G = gVar;
        this.J = ns.e4;
        this.L = ns.e4;
        this.M = new RectF();
        this.f = aVar;
        this.h = aVar instanceof a ? (a) aVar : null;
        if (aVar instanceof ui.e) {
            hc cVar = Build.VERSION.SDK_INT >= 29 ? new c(this) : new b(this, false);
            this.n = cVar;
            this.r = cVar;
        } else {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                this.n = new e(this);
                this.r = new c(this);
            } else if (i7 >= 31) {
                this.n = new d(this);
                this.r = new c(this);
            } else {
                this.n = new b(this, true);
                this.r = new b(this, false);
            }
        }
        g(this.b);
    }

    public static LinearGradient k(f fVar, g gVar, float f10, float f11, int i7, int i10) {
        int i11 = gVar == null ? -1 : gVar.a;
        float f12 = 0;
        float f13 = f10 - f12;
        float max = Math.max(0.0f, f13 - f11);
        if (i11 != -1) {
            max = Math.min(i11, max);
        }
        float f14 = 1.0f / i10;
        int i12 = fVar.y;
        boolean z10 = i12 == 1 || i12 == 2;
        if (z10) {
            f12 = f13;
        }
        float f15 = (f12 + (z10 ? -0.0f : 0.0f)) * f14;
        float max2 = (Math.max(max * f14, 0.001f) * (z10 ? -1.0f : 1.0f)) + f15;
        int[] iArr = new int[8];
        c0.a(c0.i, i7, iArr);
        int i13 = fVar.y;
        return (i13 == 1 || i13 == 4) ? new LinearGradient(0.0f, max2, 0.0f, f15, iArr, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(max2, 0.0f, f15, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    public static float l(float f10, int i7, int i10) {
        return (((float) Math.floor((f10 - r3) / r4)) * i10) + i7;
    }

    @Override // ri.e
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.s.b();
            return;
        }
        RectF rectF = this.M;
        rectF.set(bounds);
        rectF.offset(this.d, this.e);
        this.s.a(bounds, rectF);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if ((r0 instanceof si.b) != false) goto L11;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.c <= 0) {
            return;
        }
        canvas.save();
        canvas.clipRect(bounds);
        canvas.translate(bounds.left, bounds.top);
        if (!canvas.isHardwareAccelerated()) {
            hc hcVar = this.s;
            hcVar.getClass();
        }
        this.s.c(canvas);
        canvas.restore();
    }

    @Override // ri.e
    public final boolean e() {
        return this.s.d();
    }

    @Override // ri.e
    public final void f(int i7) {
        this.s.e(i7 / 255.0f);
        invalidateSelf();
    }

    @Override // ri.e
    public final void g(r rVar) {
        boolean z10 = rVar.a;
        hc hcVar = this.r;
        hc hcVar2 = z10 ? this.n : hcVar;
        hc hcVar3 = this.s;
        if (hcVar3 != hcVar2) {
            if (hcVar3 != null) {
                hcVar3.b();
            }
            this.s = hcVar2;
            hcVar2.e(this.c / 255.0f);
            if (this.s == hcVar) {
                this.x = true;
            } else {
                this.w = true;
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // ri.e
    public final boolean j() {
        this.s.getClass();
        return !(r0 instanceof b);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.w = true;
        this.x = true;
    }

    @Override // ri.e, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        ui.c cVar = this.H;
        if (cVar != null) {
            this.I = j6.r1(this.J / 255.0f, cVar.b);
            this.K = j6.r1(this.L / 255.0f, this.H.b);
        }
        this.w = true;
        this.x = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
