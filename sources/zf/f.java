package zf;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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

    public final void e(boolean z4, float f10, float f11, float f12, int i10, float f13, float f14, float f15, float f16, float f17, float f18, float f19, boolean z10) {
        this.a = z4;
        this.b = f10;
        this.c = f11;
        this.f = f13;
        this.g = f12;
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
                this.j = f16;
                this.k = f17;
                this.d = f18;
                this.e = f19;
                this.l = f14;
                this.m = f15;
                this.h = z10;
                return;
            }
            this.i = i12 - 360;
        }
    }
}
