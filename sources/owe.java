// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class owe extends qve {
    @Override // qve
    public final void a(ese eseVar, ese eseVar2, long j) {
        bue bueVar = (bue) a5f.l(eseVar, j);
        bue bueVar2 = (bue) a5f.l(eseVar2, j);
        int size = bueVar.size();
        int size2 = bueVar2.size();
        if (size > 0 && size2 > 0) {
            if (!bueVar.zza()) {
                bueVar = bueVar.zza(size2 + size);
            }
            bueVar.addAll(bueVar2);
        }
        if (size > 0) {
            bueVar2 = bueVar;
        }
        a5f.d(j, eseVar, bueVar2);
    }

    @Override // qve
    public final void b(long j, Object obj) {
        ((bue) a5f.l(obj, j)).zzb();
    }
}
