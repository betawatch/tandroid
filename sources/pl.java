// default package

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pl implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sl b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ HashSet d;

    public /* synthetic */ pl(sl slVar, ArrayList arrayList, HashSet hashSet, byte b) {
        this.a = b;
        this.b = slVar;
        this.c = arrayList;
        this.d = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        HashSet hashSet = this.d;
        ArrayList arrayList = this.c;
        sl slVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new pl(slVar, arrayList, hashSet, (byte) 1));
                break;
            default:
                slVar.d(arrayList);
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                    ConnectionsManager.getInstance(slVar.e).sendRequest(tL_messages_getCustomEmojiDocuments, new ql(slVar, arrayList2, (byte) 0));
                    break;
                }
                break;
        }
    }
}
