package pi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import bg.c0;
import c8.ob;
import oi.r;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class f extends oi.e {
    public g D;
    public g E;
    public g F;
    public ri.c G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final RectF L;
    public final ri.a f;
    public final a h;
    public final ob n;
    public final ob r;
    public ob s;
    public boolean w = true;
    public boolean x = true;
    public int y = 1;

    public f(ri.a aVar) {
        g gVar = g.b;
        this.D = gVar;
        this.E = gVar;
        this.F = gVar;
        this.I = qs.e4;
        this.K = qs.e4;
        this.L = new RectF();
        this.f = aVar;
        this.h = aVar instanceof a ? (a) aVar : null;
        if (aVar instanceof ri.e) {
            ob cVar = Build.VERSION.SDK_INT >= 29 ? new c(this) : new b(this, false);
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
        boolean z9 = i12 == 1 || i12 == 2;
        if (z9) {
            f12 = f13;
        }
        float f15 = (f12 + (z9 ? -0.0f : 0.0f)) * f14;
        float max2 = (Math.max(max * f14, 0.001f) * (z9 ? -1.0f : 1.0f)) + f15;
        int[] iArr = new int[8];
        c0.a(c0.i, i7, iArr);
        int i13 = fVar.y;
        return (i13 == 1 || i13 == 4) ? new LinearGradient(0.0f, max2, 0.0f, f15, iArr, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(max2, 0.0f, f15, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    public static float l(float f10, int i7, int i10) {
        return (((float) Math.floor((f10 - r3) / r4)) * i10) + i7;
    }

    @Override // oi.e
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.s.b();
            return;
        }
        RectF rectF = this.L;
        rectF.set(bounds);
        rectF.offset(this.d, this.e);
        this.s.a(bounds, rectF);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if ((r0 instanceof pi.b) != false) goto L11;
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
            ob obVar = this.s;
            obVar.getClass();
        }
        this.s.c(canvas);
        canvas.restore();
    }

    @Override // oi.e
    public final boolean e() {
        return this.s.d();
    }

    @Override // oi.e
    public final void f(int i7) {
        this.s.e(i7 / 255.0f);
        invalidateSelf();
    }

    @Override // oi.e
    public final void g(r rVar) {
        boolean z9 = rVar.a;
        ob obVar = this.r;
        ob obVar2 = z9 ? this.n : obVar;
        ob obVar3 = this.s;
        if (obVar3 != obVar2) {
            if (obVar3 != null) {
                obVar3.b();
            }
            this.s = obVar2;
            obVar2.e(this.c / 255.0f);
            if (this.s == obVar) {
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

    @Override // oi.e
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

    @Override // oi.e, org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        ri.c cVar = this.G;
        if (cVar != null) {
            this.H = k6.r1(this.I / 255.0f, cVar.b);
            this.J = k6.r1(this.K / 255.0f, this.G.b);
        }
        this.w = true;
        this.x = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
