package rf;

import java.util.ArrayList;
import org.telegram.messenger.jj;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class p {
    public final ArrayList a = new ArrayList();
    public final a0.h b = new a0.h();
    public final a0.h c = new a0.h();

    public static void a(p pVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, jj jjVar) {
        a0.h hVar = pVar.c;
        long B0 = jj.B0(tL_message);
        pVar.a.add(ephemeralMessage);
        a0.h hVar2 = pVar.b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar2.f(B0);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            hVar2.k(tL_messages_messages, B0);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) hVar.f(B0);
        if (arrayList == null) {
            arrayList = m5.i(hVar, B0);
        }
        arrayList.add(jjVar);
    }
}
