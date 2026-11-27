// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class w14 {
    public final ArrayList a = new ArrayList();
    public final /* synthetic */ o24 b;

    public w14(o24 o24Var) {
        this.b = o24Var;
    }

    public final void a(String str, boolean z) {
        o24 o24Var = this.b;
        int i = o24Var.d1;
        String y = qd4.y("gif_search_", str, "_");
        if (z && o24Var.m0.containsKey(y)) {
            return;
        }
        String str2 = str;
        si1 si1Var = new si1((Object) this, (Object) str2, z, (Object) y, (byte) 5);
        ArrayList arrayList = this.a;
        if (z) {
            arrayList.add(y);
            jf7.Y(i).L(y, si1Var);
            return;
        }
        uc7 s1 = uc7.s1(i);
        TLObject c2 = s1.c2(s1.o3);
        if (c2 instanceof TLRPC.User) {
            arrayList.add(y);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = s1.q1((TLRPC.User) c2);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i).sendRequest(tL_messages_getInlineBotResults, si1Var, 2);
        }
    }
}
