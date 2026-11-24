// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q3b implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ uz5 b;
    public final /* synthetic */ h4b c;

    public q3b(h4b h4bVar, long j, uz5 uz5Var) {
        this.c = h4bVar;
        this.a = j;
        this.b = uz5Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new nz8(this, tLObject, this.a, this.b, (byte) 11));
    }
}
