// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pl0 implements nl0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vnb b;

    public /* synthetic */ pl0(vnb vnbVar, byte b) {
        this.a = b;
        this.b = vnbVar;
    }

    @Override // nl0
    public final int l(vnb vnbVar, boolean z) {
        byte b = this.a;
        vnb vnbVar2 = this.b;
        switch (b) {
            case 0:
                if (dtd.d(yac.t0, vnbVar2)) {
                    return aob.p1(i86.e(262144) ? 0.85f : 0.76f, aob.v0(aob.Je, vnbVar));
                }
                return vm2.o(aob.v0(aob.Je, vnbVar), jn7.d4);
            case 1:
                if (dtd.d(yac.t0, vnbVar2)) {
                    return aob.p1(i86.e(262144) ? 0.85f : 0.76f, aob.v0(aob.Te, vnbVar));
                }
                return vm2.o(aob.v0(z ? aob.s8 : aob.Te, vnbVar), jn7.d4);
            default:
                if (dtd.d(yac.t0, vnbVar2)) {
                    return aob.p1(i86.e(262144) ? 0.85f : 0.76f, aob.v0(aob.Te, vnbVar));
                }
                return vm2.o(aob.v0(z ? aob.s8 : aob.Te, vnbVar), jn7.d4);
        }
    }
}
