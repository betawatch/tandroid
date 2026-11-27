// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xn8 implements dic {
    public int a = 0;
    public byte b;
    public final /* synthetic */ zn8 c;

    public xn8(zn8 zn8Var) {
        this.c = zn8Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    @Override // dic
    public final void a(int i) {
        int i2 = this.a;
        zn8 zn8Var = this.c;
        ?? r2 = zn8Var.E;
        if (i2 == 0) {
            if (i <= r2) {
                zn8Var.n = (byte) 1;
            } else {
                zn8Var.n = (byte) 2;
            }
            zn8Var.b();
            return;
        }
        if (i <= r2) {
            this.b = (byte) 1;
        } else {
            this.b = (byte) 2;
        }
    }

    @Override // dic
    public final void b(float f, int i, int i2) {
        zn8 zn8Var = this.c;
        zn8Var.y = i;
        zn8Var.x = f;
        zn8Var.d();
    }

    @Override // dic
    public final void c(int i) {
        this.a = i;
        if (i == 0) {
            byte b = this.b;
            zn8 zn8Var = this.c;
            zn8Var.n = b;
            zn8Var.b();
        }
    }
}
