package sh;

import java.util.ArrayList;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m {
    public final int a;
    public final TLRPC.InputPeer b;
    public final int c;
    public final byte[] d;
    public final q2.d e;
    public final z10 f;
    public String g;
    public boolean h;
    public boolean i;
    public final ArrayList j = new ArrayList();

    public m(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, q2.d dVar, z10 z10Var) {
        this.a = i7;
        this.b = inputPeer;
        this.c = i10;
        this.d = bArr;
        this.e = dVar;
        this.f = z10Var;
    }

    public final void a() {
        if (this.h || this.i) {
            return;
        }
        this.i = true;
        TLRPC.TL_messages_getPollVotes tL_messages_getPollVotes = new TLRPC.TL_messages_getPollVotes();
        String str = this.g;
        tL_messages_getPollVotes.limit = str != null ? 10 : 15;
        tL_messages_getPollVotes.peer = this.b;
        tL_messages_getPollVotes.id = this.c;
        tL_messages_getPollVotes.option = this.d;
        tL_messages_getPollVotes.offset = str;
        ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new h(this, 1));
    }
}
