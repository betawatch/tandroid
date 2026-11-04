package tg;

import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x0 {
    public final g a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public boolean l;

    public x0(g gVar) {
        this.a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.a;
        if (gVar.o() == 4) {
            float f10 = this.b;
            float f11 = this.k;
            float f12 = this.c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.e);
            rectF.union(this.i, this.j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f13 = this.b;
            float f14 = max * 1.42f;
            float f15 = this.c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.i, this.j);
            }
        }
        float f16 = (-this.f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
