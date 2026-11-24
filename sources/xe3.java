// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xe3 extends fka implements mcb {
    public final String r;
    public final vcb s;

    public xe3(String str, vcb vcbVar) {
        super(new rcb[2], new scb[2]);
        this.r = str;
        q(1024);
        this.s = vcbVar;
    }

    @Override // fka
    public final la3 f() {
        return new rcb();
    }

    @Override // fka
    public final na3 g() {
        return new kka(this);
    }

    @Override // ga3
    public final String getName() {
        return this.r;
    }

    @Override // fka
    public final ja3 h(Throwable th) {
        return new ncb("Unexpected decode error", th);
    }

    @Override // fka
    public final ja3 i(la3 la3Var, na3 na3Var, boolean z) {
        rcb rcbVar = (rcb) la3Var;
        scb scbVar = (scb) na3Var;
        try {
            ByteBuffer byteBuffer = rcbVar.c;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            vcb vcbVar = this.s;
            if (z) {
                vcbVar.reset();
            }
            lcb g = vcbVar.g(0, limit, array);
            long j = rcbVar.e;
            long j2 = rcbVar.r;
            scbVar.timeUs = j;
            scbVar.a = g;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            scbVar.b = j;
            scbVar.shouldBeSkipped = false;
            return null;
        } catch (ncb e) {
            return e;
        }
    }

    @Override // mcb
    public final void b(long j) {
    }
}
