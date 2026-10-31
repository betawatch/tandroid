package rf;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import org.telegram.messenger.jj;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class r {
    public final p a = new p();
    public final p b = new p();
    public final q c = new q();
    public final q d = new q();
    public final q e = new q();

    public final void a(TL_update.TL_updateEditEphemeralMessage tL_updateEditEphemeralMessage, int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateEditEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.a.add(ephemeralMessage);
            return;
        }
        if (!ephemeralMessage.welcome) {
            this.d.a.add(ephemeralMessage);
            return;
        }
        TLRPC.TL_message b10 = s.b(ephemeralMessage);
        jj jjVar = new jj(i10, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true);
        b10.edit_date = ConnectionsManager.getInstance(i10).getCurrentTime();
        b10.flags |= 32768;
        p.a(this.b, ephemeralMessage, b10, jjVar);
    }

    public final void b(TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage, int i10, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        TL_ephemeral.EphemeralMessage ephemeralMessage = tL_updateNewEphemeralMessage.message;
        if (ephemeralMessage.anchor_msg_id != 0) {
            this.e.a.add(ephemeralMessage);
        } else {
            if (!ephemeralMessage.welcome) {
                this.c.a.add(ephemeralMessage);
                return;
            }
            TLRPC.TL_message b10 = s.b(ephemeralMessage);
            p.a(this.a, ephemeralMessage, b10, new jj(i10, (TLRPC.Message) b10, (AbstractMap) concurrentHashMap, (AbstractMap) concurrentHashMap2, true, true));
        }
    }
}
