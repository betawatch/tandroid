// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sb7 {
    public final int a;
    public final long b;
    public boolean c;
    public boolean d;
    public final ArrayList e;
    public int f;
    public int g;

    public sb7(int i, long j) {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = -1;
        this.a = i;
        this.b = j;
        if (this.c || this.d) {
            return;
        }
        boolean isEmpty = arrayList.isEmpty();
        this.c = true;
        TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
        tL_messages_getCommonChats.user_id = oc7.r1(i).n1(j);
        tL_messages_getCommonChats.max_id = arrayList.isEmpty() ? 0L : ((TLRPC.Chat) b10.f(1, arrayList)).id;
        tL_messages_getCommonChats.limit = isEmpty ? 15 : 30;
        int sendRequest = ConnectionsManager.getInstance(i).sendRequest(tL_messages_getCommonChats, new vj1((Object) this, (Object) r7, isEmpty, (byte) 9));
        this.f = sendRequest;
        int[] iArr = {sendRequest};
    }
}
