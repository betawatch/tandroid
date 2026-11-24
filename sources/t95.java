// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class t95 extends y59 implements GroupCallMessagesController.CallMessageListener {
    public List c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f;

    @Override // y59
    public final int b() {
        List list = this.c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onNewGroupCallMessage(long j, GroupCallMessage groupCallMessage) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(0, groupCallMessage);
        i(0);
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onPopGroupCallMessage() {
        List list = this.c;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.c.size() - 1;
        this.c.remove(size);
        s(size);
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        r95 r95Var = (r95) u69Var;
        List list = this.c;
        if (list == null || list.size() <= i) {
            return;
        }
        ((s95) r95Var.a).set((GroupCallMessage) this.c.get(i));
    }
}
