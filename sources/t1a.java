// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class t1a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ d d;
    public final /* synthetic */ TLRPC.TL_messages_editMessage e;

    public /* synthetic */ t1a(z3a z3aVar, TLRPC.TL_error tL_error, d dVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, byte b) {
        this.a = b;
        this.b = z3aVar;
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
        z3a z3aVar = this.b;
        switch (b) {
            case 0:
                ij.c0(z3aVar.currentAccount, tL_error, dVar, tL_messages_editMessage, new Object[0]);
                break;
            default:
                ij.c0(z3aVar.currentAccount, tL_error, dVar, tL_messages_editMessage, new Object[0]);
                break;
        }
    }
}
