package sb;

import com.google.firebase.messaging.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e {
    public final qb.d a;
    public final int b;
    public final int c;
    public final int d;
    public final e e;
    public final int f;

    public e(l lVar, qb.d dVar, int i10, int i11, int i12, e eVar, qb.e eVar2) {
        this.a = dVar;
        this.b = i10;
        qb.d dVar2 = qb.d.h;
        int i13 = (dVar == dVar2 || eVar == null) ? i11 : eVar.c;
        this.c = i13;
        this.d = i12;
        this.e = eVar;
        boolean z10 = false;
        int i14 = eVar != null ? eVar.f : 0;
        if ((dVar == dVar2 && eVar == null && i13 != 0) || (eVar != null && i13 != eVar.c)) {
            z10 = true;
        }
        i14 = (eVar == null || dVar != eVar.a || z10) ? i14 + dVar.a(eVar2) + 4 : i14;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                i14 += i12 != 1 ? 11 : 6;
            } else if (ordinal == 4) {
                i14 += ((String) lVar.b).substring(i10, i12 + i10).getBytes(((mb.e) lVar.c).a[i11].charset()).length * 8;
                if (z10) {
                    i14 += 12;
                }
            } else if (ordinal == 6) {
                i14 += 13;
            }
        } else {
            i14 += i12 != 1 ? i12 == 2 ? 7 : 10 : 4;
        }
        this.f = i14;
    }
}
