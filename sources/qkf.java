// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
