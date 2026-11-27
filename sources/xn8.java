// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
