package qc;

import ne.p;
import ne.s;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class d extends h {
    public final /* synthetic */ int e;

    @Override // qc.h
    public final p b() {
        switch (this.e) {
            case 0:
                int i10 = this.d + 1;
                this.d = i10;
                if (c() != '[') {
                    return null;
                }
                this.d++;
                s f10 = f("![");
                i iVar = this.a;
                ke.b bVar = iVar.i;
                ke.b bVar2 = new ke.b(f10, i10, bVar, iVar.h, true);
                if (bVar != null) {
                    bVar.d = true;
                }
                iVar.i = bVar2;
                return f10;
            default:
                int i11 = this.d;
                this.d = i11 + 1;
                s f11 = f("[");
                i iVar2 = this.a;
                ke.b bVar3 = iVar2.i;
                ke.b bVar4 = new ke.b(f11, i11, bVar3, iVar2.h, false);
                if (bVar3 != null) {
                    bVar3.d = true;
                }
                iVar2.i = bVar4;
                return f11;
        }
    }

    @Override // qc.h
    public final char d() {
        switch (this.e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
