// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class yf6 extends sm4 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf6(aob aobVar, byte b) {
        super(aobVar);
        this.f = b;
    }

    @Override // sm4, aob
    public final int e(int i, int i2, boolean z) {
        switch (this.f) {
            case 0:
                aob aobVar = this.e;
                int e = aobVar.e(i, i2, z);
                return e == -1 ? aobVar.a(z) : e;
            default:
                return super.e(i, i2, z);
        }
    }

    @Override // sm4, aob
    public final xnb f(int i, xnb xnbVar, boolean z) {
        switch (this.f) {
            case 1:
                super.f(i, xnbVar, z);
                xnbVar.f = true;
                return xnbVar;
            default:
                return super.f(i, xnbVar, z);
        }
    }

    @Override // sm4, aob
    public final int k(int i, int i2, boolean z) {
        switch (this.f) {
            case 0:
                aob aobVar = this.e;
                int k = aobVar.k(i, i2, z);
                return k == -1 ? aobVar.c(z) : k;
            default:
                return super.k(i, i2, z);
        }
    }

    @Override // sm4, aob
    public final znb m(int i, znb znbVar, long j) {
        switch (this.f) {
            case 1:
                super.m(i, znbVar, j);
                znbVar.j = true;
                return znbVar;
            default:
                return super.m(i, znbVar, j);
        }
    }
}
