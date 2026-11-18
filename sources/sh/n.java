package sh;

import java.util.ArrayList;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.web.z0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n {
    public final int a;
    public final TLRPC.InputPeer b;
    public final int c;
    public final byte[] d;
    public final z0 e;
    public final x10 f;
    public String g;
    public boolean h;
    public boolean i;
    public final ArrayList j = new ArrayList();

    public n(int i7, TLRPC.InputPeer inputPeer, int i10, byte[] bArr, z0 z0Var, x10 x10Var) {
        this.a = i7;
        this.b = inputPeer;
        this.c = i10;
        this.d = bArr;
        this.e = z0Var;
        this.f = x10Var;
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
        ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getPollVotes, new d3.b(1), new i(this, 1));
    }
}
