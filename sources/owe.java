// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
