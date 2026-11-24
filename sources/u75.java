// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class u75 extends w39 implements GroupCallMessagesController.CallMessageListener {
    public List c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f;

    @Override // w39
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
        r(size);
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        s75 s75Var = (s75) s49Var;
        List list = this.c;
        if (list == null || list.size() <= i) {
            return;
        }
        ((t75) s75Var.a).set((GroupCallMessage) this.c.get(i));
    }
}
