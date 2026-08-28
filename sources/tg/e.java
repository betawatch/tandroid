package tg;

import f2.q1;
import f2.r0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class e extends r0 implements GroupCallMessagesController.CallMessageListener {
    public List c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f;

    @Override // f2.r0
    public final int h() {
        List list = this.c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onNewGroupCallMessage(long j10, GroupCallMessage groupCallMessage) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(0, groupCallMessage);
        o(0);
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onPopGroupCallMessage() {
        List list = this.c;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.c.size() - 1;
        this.c.remove(size);
        u(size);
    }

    @Override // f2.r0
    public final void v(q1 q1Var, int i9) {
        c cVar = (c) q1Var;
        List list = this.c;
        if (list == null || list.size() <= i9) {
            return;
        }
        ((d) cVar.a).set((GroupCallMessage) this.c.get(i9));
    }
}
