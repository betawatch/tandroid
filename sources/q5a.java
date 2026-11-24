// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q5a implements RequestDelegate {
    public final /* synthetic */ TLRPC.TL_messages_startHistoryImport a;
    public final /* synthetic */ r5a b;

    public q5a(r5a r5aVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.b = r5aVar;
        this.a = tL_messages_startHistoryImport;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new hw9(this, tL_error, this.a, (byte) 2));
    }
}
