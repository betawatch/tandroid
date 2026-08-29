package wf;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f {
    public boolean a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public boolean h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f clone() {
        f fVar = new f();
        fVar.a = this.a;
        fVar.b = this.b;
        fVar.c = this.c;
        fVar.d = this.d;
        fVar.e = this.e;
        fVar.f = this.f;
        fVar.g = this.g;
        fVar.h = this.h;
        fVar.i = this.i;
        fVar.j = this.j;
        fVar.k = this.k;
        fVar.l = this.l;
        fVar.m = this.m;
        return fVar;
    }

    public final int b() {
        return this.i;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean d() {
        return this.h;
    }

    public final void e(boolean z10, float f9, float f10, float f11, int i10, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11) {
        this.a = z10;
        this.b = f9;
        this.c = f10;
        this.f = f12;
        this.g = f11;
        this.i = i10;
        while (true) {
            int i11 = this.i;
            if (i11 >= 0) {
                break;
            } else {
                this.i = i11 + 360;
            }
        }
        while (true) {
            int i12 = this.i;
            if (i12 < 360) {
                this.j = f15;
                this.k = f16;
                this.d = f17;
                this.e = f18;
                this.l = f13;
                this.m = f14;
                this.h = z11;
                return;
            }
            this.i = i12 - 360;
        }
    }
}
