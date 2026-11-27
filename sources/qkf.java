// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
