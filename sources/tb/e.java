package tb;

import ab.m;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e {
    public final rb.d a;
    public final int b;
    public final int c;
    public final int d;
    public final e e;
    public final int f;

    public e(m mVar, rb.d dVar, int i10, int i11, int i12, e eVar, rb.e eVar2) {
        this.a = dVar;
        this.b = i10;
        rb.d dVar2 = rb.d.h;
        int i13 = (dVar == dVar2 || eVar == null) ? i11 : eVar.c;
        this.c = i13;
        this.d = i12;
        this.e = eVar;
        boolean z10 = false;
        int i14 = eVar != null ? eVar.f : 0;
        if ((dVar == dVar2 && eVar == null && i13 != 0) || (eVar != null && i13 != eVar.c)) {
            z10 = true;
        }
        int i15 = 4;
        i14 = (eVar == null || dVar != eVar.a || z10) ? i14 + dVar.a(eVar2) + 4 : i14;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    i14 += ((String) mVar.b).substring(i10, i12 + i10).getBytes(((nb.e) mVar.c).a[i11].charset()).length * 8;
                    if (z10) {
                        i14 += 12;
                    }
                } else if (ordinal == 6) {
                    i14 += 13;
                }
                this.f = i14;
            }
            i15 = i12 == 1 ? 6 : 11;
        } else if (i12 != 1) {
            i15 = i12 == 2 ? 7 : 10;
        }
        i14 += i15;
        this.f = i14;
    }
}
