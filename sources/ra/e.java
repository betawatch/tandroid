package ra;

import pa.u;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e extends u {
    public volatile u a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ pa.g d;
    public final /* synthetic */ wa.a e;
    public final /* synthetic */ f f;

    public e(f fVar, boolean z4, boolean z10, pa.g gVar, wa.a aVar) {
        this.f = fVar;
        this.b = z4;
        this.c = z10;
        this.d = gVar;
        this.e = aVar;
    }

    @Override // pa.u
    public final Object read(xa.a aVar) {
        if (this.b) {
            aVar.C();
            return null;
        }
        u uVar = this.a;
        if (uVar == null) {
            uVar = this.d.c(this.f, this.e);
            this.a = uVar;
        }
        return uVar.read(aVar);
    }

    @Override // pa.u
    public final void write(xa.b bVar, Object obj) {
        if (this.c) {
            bVar.i();
            return;
        }
        u uVar = this.a;
        if (uVar == null) {
            uVar = this.d.c(this.f, this.e);
            this.a = uVar;
        }
        uVar.write(bVar, obj);
    }
}
