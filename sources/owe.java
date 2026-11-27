// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
