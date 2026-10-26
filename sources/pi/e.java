package pi;

import a8.lf;
import ag.h0;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import oi.r;
import org.telegram.ui.ActionBar.y6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e extends oi.e {
    public f E;
    public hh.c F;
    public int G;
    public int H;
    public int I;
    public int J;
    public final RectF K;
    public final ri.a e;
    public final oi.c f;
    public final lf h;
    public final lf n;
    public lf r;
    public boolean s = true;
    public boolean v = true;
    public int w = 1;
    public f x;
    public f y;

    public e(ri.a aVar) {
        f fVar = f.b;
        this.x = fVar;
        this.y = fVar;
        this.E = fVar;
        this.H = 255;
        this.J = 255;
        this.K = new RectF();
        this.e = aVar;
        this.f = aVar instanceof oi.c ? (oi.c) aVar : null;
        if (aVar instanceof ri.b) {
            lf bVar = Build.VERSION.SDK_INT >= 29 ? new b(this) : new a(this, false);
            this.h = bVar;
            this.n = bVar;
        } else {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 33) {
                this.h = new d(this);
                this.n = new b(this);
            } else if (i10 >= 31) {
                this.h = new c(this);
                this.n = new b(this);
            } else {
                this.h = new a(this, true);
                this.n = new a(this, false);
            }
        }
        g(this.a);
    }

    public static float k(float f7, int i10, int i11) {
        return (((float) Math.floor((f7 - r3) / r4)) * i11) + i10;
    }

    public static LinearGradient l(e eVar, f fVar, float f7, float f10, int i10, int i11) {
        int i12 = fVar == null ? -1 : fVar.a;
        float f11 = 0;
        float f12 = f7 - f11;
        float max = Math.max(0.0f, f12 - f10);
        if (i12 != -1) {
            max = Math.min(i12, max);
        }
        float f13 = 1.0f / i11;
        int i13 = eVar.w;
        boolean z10 = i13 == 1 || i13 == 2;
        if (z10) {
            f11 = f12;
        }
        float f14 = (f11 + (z10 ? -0.0f : 0.0f)) * f13;
        float max2 = (Math.max(max * f13, 0.001f) * (z10 ? -1.0f : 1.0f)) + f14;
        int[] iArr = new int[8];
        h0.a(h0.i, i10, iArr);
        int i14 = eVar.w;
        return (i14 == 1 || i14 == 4) ? new LinearGradient(0.0f, max2, 0.0f, f14, iArr, (float[]) null, Shader.TileMode.CLAMP) : new LinearGradient(max2, 0.0f, f14, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override // oi.e
    public final void a() {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            this.r.b();
            return;
        }
        RectF rectF = this.K;
        rectF.set(bounds);
        rectF.offset(this.c, this.d);
        this.r.a(bounds, rectF);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if ((r0 instanceof pi.a) != false) goto L11;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || this.b <= 0) {
            return;
        }
        canvas.save();
        canvas.clipRect(bounds);
        canvas.translate(bounds.left, bounds.top);
        if (!canvas.isHardwareAccelerated()) {
            lf lfVar = this.r;
            lfVar.getClass();
        }
        this.r.c(canvas);
        canvas.restore();
    }

    @Override // oi.e
    public final boolean e() {
        return this.r.d();
    }

    @Override // oi.e
    public final void f(int i10) {
        this.r.e(i10 / 255.0f);
        invalidateSelf();
    }

    @Override // oi.e
    public final void g(r rVar) {
        boolean z10 = rVar.a;
        lf lfVar = this.n;
        lf lfVar2 = z10 ? this.h : lfVar;
        lf lfVar3 = this.r;
        if (lfVar3 != lfVar2) {
            if (lfVar3 != null) {
                lfVar3.b();
            }
            this.r = lfVar2;
            lfVar2.e(this.b / 255.0f);
            if (this.r == lfVar) {
                this.v = true;
            } else {
                this.s = true;
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
        this.r.getClass();
        return !(r0 instanceof a);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.s = true;
        this.v = true;
    }

    @Override // oi.e, org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        hh.c cVar = this.F;
        if (cVar != null) {
            this.G = y6.o1(this.H / 255.0f, cVar.b);
            this.I = y6.o1(this.J / 255.0f, this.F.b);
        }
        this.s = true;
        this.v = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
