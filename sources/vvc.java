// default package

import org.telegram.tgnet.RequestTimeDelegate;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class vvc implements RequestTimeDelegate {
    public final /* synthetic */ xvc a;
    public final /* synthetic */ wvc b;

    public /* synthetic */ vvc(xvc xvcVar, wvc wvcVar) {
        this.a = xvcVar;
        this.b = wvcVar;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public final void run(long j) {
        gm.c3(new e4b((Object) this.a, (Object) this.b, j, (byte) 14));
    }
}
