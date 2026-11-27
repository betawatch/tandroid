// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class q59 {
    public final int a;
    public final TLRPC.InputPeer b;
    public final int c;
    public final byte[] d;
    public final uk8 e;
    public final pcc f;
    public String g;
    public boolean h;
    public boolean i;
    public final ArrayList j = new ArrayList();

    public q59(int i, TLRPC.InputPeer inputPeer, int i2, byte[] bArr, uk8 uk8Var, pcc pccVar) {
        this.a = i;
        this.b = inputPeer;
        this.c = i2;
        this.d = bArr;
        this.e = uk8Var;
        this.f = pccVar;
    }

    public final void a() {
        if (this.h || this.i) {
            return;
        }
        byte b = 1;
        this.i = true;
        TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
        String str = this.g;
        tL_messages_getPollVotes.limit = str != null ? 10 : 15;
        tL_messages_getPollVotes.peer = this.b;
        tL_messages_getPollVotes.id = this.c;
        tL_messages_getPollVotes.option = this.d;
        tL_messages_getPollVotes.offset = str;
        ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getPollVotes, new ic((byte) 0), new l59(this, b));
    }
}
