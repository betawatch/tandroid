package rb;

import com.google.firebase.messaging.l;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e {
    public final pb.d a;
    public final int b;
    public final int c;
    public final int d;
    public final e e;
    public final int f;

    public e(l lVar, pb.d dVar, int i9, int i10, int i11, e eVar, pb.e eVar2) {
        this.a = dVar;
        this.b = i9;
        pb.d dVar2 = pb.d.h;
        int i12 = (dVar == dVar2 || eVar == null) ? i10 : eVar.c;
        this.c = i12;
        this.d = i11;
        this.e = eVar;
        boolean z10 = false;
        int i13 = eVar != null ? eVar.f : 0;
        if ((dVar == dVar2 && eVar == null && i12 != 0) || (eVar != null && i12 != eVar.c)) {
            z10 = true;
        }
        int i14 = 4;
        i13 = (eVar == null || dVar != eVar.a || z10) ? i13 + dVar.a(eVar2) + 4 : i13;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    i13 += ((String) lVar.b).substring(i9, i11 + i9).getBytes(((lb.e) lVar.c).a[i10].charset()).length * 8;
                    if (z10) {
                        i13 += 12;
                    }
                } else if (ordinal == 6) {
                    i13 += 13;
                }
                this.f = i13;
            }
            i14 = i11 == 1 ? 6 : 11;
        } else if (i11 != 1) {
            i14 = i11 == 2 ? 7 : 10;
        }
        i13 += i14;
        this.f = i13;
    }
}
