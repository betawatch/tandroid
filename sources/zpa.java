// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zpa implements RequestDelegate {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ wsa b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zpa(wsa wsaVar, long j, long j2, qac qacVar, long j3) {
        this.b = wsaVar;
        this.c = j;
        this.d = j2;
        this.f = qacVar;
        this.e = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        switch (b) {
            case 0:
                wsa wsaVar = this.b;
                wsaVar.getClass();
                gm.c3(new gqa(wsaVar, (he) obj, tLObject, this.c, this.d, this.e, tL_error));
                break;
            default:
                gm.c3(new gqa(this.b, tLObject, this.c, this.d, (qac) obj, tL_error, this.e));
                break;
        }
    }

    public /* synthetic */ zpa(wsa wsaVar, he heVar, long j, long j2, long j3) {
        this.b = wsaVar;
        this.f = heVar;
        this.c = j;
        this.d = j2;
        this.e = j3;
    }
}
