// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class sw8 implements zcc {
    public final /* synthetic */ byte a;
    public boolean b = false;
    public boolean c = false;
    public sa4 d;
    public final ar7 e;

    public /* synthetic */ sw8(ar7 ar7Var, byte b) {
        this.a = b;
        this.e = ar7Var;
    }

    @Override // zcc
    public final zcc b(String str) {
        byte b = this.a;
        ar7 ar7Var = this.e;
        switch (b) {
            case 0:
                if (this.b) {
                    throw new o34("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((qw8) ar7Var).i(this.d, str, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new o34("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((rcd) ar7Var).c(this.d, str, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new o34("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((hdd) ar7Var).c(this.d, str, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new o34("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((gnd) ar7Var).c(this.d, str, this.c);
                return this;
            default:
                if (this.b) {
                    throw new o34("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((kpd) ar7Var).c(this.d, str, this.c);
                return this;
        }
    }

    @Override // zcc
    public final zcc c(boolean z) {
        byte b = this.a;
        ar7 ar7Var = this.e;
        switch (b) {
            case 0:
                if (this.b) {
                    throw new o34("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((qw8) ar7Var).c(this.d, z ? 1 : 0, this.c);
                return this;
            case 1:
                if (this.b) {
                    throw new o34("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((rcd) ar7Var).h(this.d, z ? 1 : 0, this.c);
                return this;
            case 2:
                if (this.b) {
                    throw new o34("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((hdd) ar7Var).h(this.d, z ? 1 : 0, this.c);
                return this;
            case 3:
                if (this.b) {
                    throw new o34("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((gnd) ar7Var).h(this.d, z ? 1 : 0, this.c);
                return this;
            default:
                if (this.b) {
                    throw new o34("Cannot encode a second value in the ValueEncoderContext");
                }
                this.b = true;
                ((kpd) ar7Var).h(this.d, z ? 1 : 0, this.c);
                return this;
        }
    }
}
