// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v3a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ d d;
    public final /* synthetic */ TLRPC.TL_messages_editMessage e;

    public /* synthetic */ v3a(a6a a6aVar, TLRPC.TL_error tL_error, d dVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = tL_error;
        this.d = dVar;
        this.e = tL_messages_editMessage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = this.e;
        d dVar = this.d;
        TLRPC.TL_error tL_error = this.c;
        a6a a6aVar = this.b;
        switch (b) {
            case 0:
                ik.c0(a6aVar.currentAccount, tL_error, dVar, tL_messages_editMessage, new Object[0]);
                break;
            default:
                ik.c0(a6aVar.currentAccount, tL_error, dVar, tL_messages_editMessage, new Object[0]);
                break;
        }
    }
}
