package vb;

import cb.m;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e {
    public final tb.d a;
    public final int b;
    public final int c;
    public final int d;
    public final e e;
    public final int f;

    public e(m mVar, tb.d dVar, int i10, int i11, int i12, e eVar, tb.e eVar2) {
        this.a = dVar;
        this.b = i10;
        tb.d dVar2 = tb.d.h;
        int i13 = (dVar == dVar2 || eVar == null) ? i11 : eVar.c;
        this.c = i13;
        this.d = i12;
        this.e = eVar;
        boolean z4 = false;
        int i14 = eVar != null ? eVar.f : 0;
        if ((dVar == dVar2 && eVar == null && i13 != 0) || (eVar != null && i13 != eVar.c)) {
            z4 = true;
        }
        int i15 = 4;
        i14 = (eVar == null || dVar != eVar.a || z4) ? i14 + dVar.a(eVar2) + 4 : i14;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 4) {
                    i14 += ((String) mVar.b).substring(i10, i12 + i10).getBytes(((pb.e) mVar.c).a[i11].charset()).length * 8;
                    if (z4) {
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
