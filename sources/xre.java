// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xre extends zqe {
    @Override // zqe
    public final void a(nne nneVar, nne nneVar2, long j) {
        kpe kpeVar = (kpe) i0f.l(nneVar, j);
        kpe kpeVar2 = (kpe) i0f.l(nneVar2, j);
        int size = kpeVar.size();
        int size2 = kpeVar2.size();
        if (size > 0 && size2 > 0) {
            if (!kpeVar.zza()) {
                kpeVar = kpeVar.zza(size2 + size);
            }
            kpeVar.addAll(kpeVar2);
        }
        if (size > 0) {
            kpeVar2 = kpeVar;
        }
        i0f.d(nneVar, j, kpeVar2);
    }

    @Override // zqe
    public final void b(Object obj, long j) {
        ((kpe) i0f.l(obj, j)).zzb();
    }
}
