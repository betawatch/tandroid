// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class t5d extends qo2 {
    public final /* synthetic */ byte f;
    public final /* synthetic */ so2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5d(so2 so2Var, byte b) {
        super(so2Var, (byte) 0);
        this.f = b;
        this.h = so2Var;
    }

    @Override // qo2
    public final Object b(int i) {
        byte b = this.f;
        so2 so2Var = this.h;
        switch (b) {
            case 0:
                Object[] objArr = so2Var.d;
                objArr.getClass();
                return objArr[i];
            case 1:
                return new k7d(so2Var, i);
            default:
                Object[] objArr2 = so2Var.e;
                objArr2.getClass();
                return objArr2[i];
        }
    }
}
