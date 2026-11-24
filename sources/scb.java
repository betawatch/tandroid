// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class scb extends na3 implements lcb {
    public lcb a;
    public long b;

    @Override // lcb
    public final int b(long j) {
        lcb lcbVar = this.a;
        lcbVar.getClass();
        return lcbVar.b(j - this.b);
    }

    @Override // na3, v11
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // lcb
    public final long k(int i) {
        lcb lcbVar = this.a;
        lcbVar.getClass();
        return lcbVar.k(i) + this.b;
    }

    @Override // lcb
    public final List p(long j) {
        lcb lcbVar = this.a;
        lcbVar.getClass();
        return lcbVar.p(j - this.b);
    }

    @Override // lcb
    public final int q() {
        lcb lcbVar = this.a;
        lcbVar.getClass();
        return lcbVar.q();
    }
}
