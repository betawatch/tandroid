package r4;

import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class l extends k3.k implements g {
    public g a;
    public long b;

    public final void a(long j10, g gVar, long j11) {
        this.timeUs = j10;
        this.a = gVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.b = j10;
    }

    @Override // r4.g
    public final int c(long j10) {
        g gVar = this.a;
        gVar.getClass();
        return gVar.c(j10 - this.b);
    }

    @Override // k3.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // r4.g
    public final long f(int i10) {
        g gVar = this.a;
        gVar.getClass();
        return gVar.f(i10) + this.b;
    }

    @Override // r4.g
    public final List h(long j10) {
        g gVar = this.a;
        gVar.getClass();
        return gVar.h(j10 - this.b);
    }

    @Override // r4.g
    public final int p() {
        g gVar = this.a;
        gVar.getClass();
        return gVar.p();
    }
}
