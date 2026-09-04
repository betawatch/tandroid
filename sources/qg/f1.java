package qg;

import android.graphics.RectF;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class f1 {
    public final l a;
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

    public f1(l lVar) {
        this.a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.a;
        if (lVar.o() == 4) {
            float f7 = this.b;
            float f10 = this.k;
            float f11 = this.c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.i, this.j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.b;
            float f13 = max * 1.42f;
            float f14 = this.c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.i, this.j);
            }
        }
        float f15 = (-this.f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
