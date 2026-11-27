// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qkf implements tkf {
    public final tkf[] a;

    public qkf(tkf... tkfVarArr) {
        this.a = tkfVarArr;
    }

    @Override // tkf
    public final ilf zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            tkf tkfVar = this.a[i];
            if (tkfVar.zzc(cls)) {
                return tkfVar.zzb(cls);
            }
        }
        qyc.c("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // tkf
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
