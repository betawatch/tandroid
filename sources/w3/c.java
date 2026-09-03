package w3;

import r3.r;
import r3.s;
import r3.t;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c implements s {
    public final /* synthetic */ s a;
    public final /* synthetic */ f2.c b;

    public c(f2.c cVar, s sVar) {
        this.b = cVar;
        this.a = sVar;
    }

    @Override // r3.s
    public final boolean c() {
        return this.a.c();
    }

    @Override // r3.s
    public final r f(long j10) {
        r f10 = this.a.f(j10);
        t tVar = f10.a;
        long j11 = tVar.a;
        long j12 = tVar.b;
        long j13 = this.b.b;
        t tVar2 = new t(j11, j12 + j13);
        t tVar3 = f10.b;
        return new r(tVar2, new t(tVar3.a, tVar3.b + j13));
    }

    @Override // r3.s
    public final long g() {
        return this.a.g();
    }
}
