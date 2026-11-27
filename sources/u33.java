// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class u33 {
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
    public final u33 clone() {
        u33 u33Var = new u33();
        u33Var.a = this.a;
        u33Var.b = this.b;
        u33Var.c = this.c;
        u33Var.d = this.d;
        u33Var.e = this.e;
        u33Var.f = this.f;
        u33Var.g = this.g;
        u33Var.h = this.h;
        u33Var.i = this.i;
        u33Var.j = this.j;
        u33Var.k = this.k;
        u33Var.l = this.l;
        u33Var.m = this.m;
        return u33Var;
    }

    public final void b(boolean z, float f, float f2, float f3, int i, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z2) {
        this.a = z;
        this.b = f;
        this.c = f2;
        this.f = f4;
        this.g = f3;
        this.i = i;
        while (true) {
            int i2 = this.i;
            if (i2 >= 0) {
                break;
            } else {
                this.i = i2 + 360;
            }
        }
        while (true) {
            int i3 = this.i;
            if (i3 < 360) {
                this.j = f7;
                this.k = f8;
                this.d = f9;
                this.e = f10;
                this.l = f5;
                this.m = f6;
                this.h = z2;
                return;
            }
            this.i = i3 - 360;
        }
    }
}
