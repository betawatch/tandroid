// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yh6 extends to4 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh6(bqb bqbVar, byte b) {
        super(bqbVar);
        this.f = b;
    }

    @Override // to4, bqb
    public final int e(int i, int i2, boolean z) {
        switch (this.f) {
            case 0:
                bqb bqbVar = this.e;
                int e = bqbVar.e(i, i2, z);
                return e == -1 ? bqbVar.a(z) : e;
            default:
                return super.e(i, i2, z);
        }
    }

    @Override // to4, bqb
    public final ypb f(int i, ypb ypbVar, boolean z) {
        switch (this.f) {
            case 1:
                super.f(i, ypbVar, z);
                ypbVar.f = true;
                return ypbVar;
            default:
                return super.f(i, ypbVar, z);
        }
    }

    @Override // to4, bqb
    public final int k(int i, int i2, boolean z) {
        switch (this.f) {
            case 0:
                bqb bqbVar = this.e;
                int k = bqbVar.k(i, i2, z);
                return k == -1 ? bqbVar.c(z) : k;
            default:
                return super.k(i, i2, z);
        }
    }

    @Override // to4, bqb
    public final aqb m(int i, aqb aqbVar, long j) {
        switch (this.f) {
            case 1:
                super.m(i, aqbVar, j);
                aqbVar.j = true;
                return aqbVar;
            default:
                return super.m(i, aqbVar, j);
        }
    }
}
