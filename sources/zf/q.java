package zf;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.v0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public class q {
    public final ArrayList a = new ArrayList();
    public final a0.h b = new a0.h();
    public final a0.h c = new a0.h();

    public static void a(q qVar, TL_ephemeral.EphemeralMessage ephemeralMessage, TLRPC.TL_message tL_message, MessageObject messageObject) {
        a0.h hVar = qVar.c;
        long dialogId = MessageObject.getDialogId(tL_message);
        qVar.a.add(ephemeralMessage);
        a0.h hVar2 = qVar.b;
        TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) hVar2.f(dialogId);
        if (tL_messages_messages == null) {
            tL_messages_messages = new TLRPC.TL_messages_messages();
            hVar2.k(tL_messages_messages, dialogId);
        }
        tL_messages_messages.messages.add(tL_message);
        ArrayList arrayList = (ArrayList) hVar.f(dialogId);
        if (arrayList == null) {
            arrayList = v0.j(dialogId, hVar);
        }
        arrayList.add(messageObject);
    }
}
