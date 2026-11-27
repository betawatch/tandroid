// default package

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class rl implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sl b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ rl(sl slVar, ArrayList arrayList, TLObject tLObject, byte b) {
        this.a = b;
        this.b = slVar;
        this.c = arrayList;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.d;
        ArrayList arrayList = this.c;
        sl slVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                hl.c3(new rl(slVar, arrayList, tLObject, b2));
                break;
            default:
                int i = slVar.e;
                HashSet hashSet = new HashSet(arrayList);
                if (tLObject instanceof Vector) {
                    ArrayList arrayList2 = ((Vector) tLObject).objects;
                    jf7.Y(i).a.c(new ol(slVar, arrayList2, b2));
                    slVar.d(arrayList2);
                    byte b3 = 0;
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        if (arrayList2.get(i2) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList2.get(i2)).id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList3 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList3;
                        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getCustomEmojiDocuments, new ql(slVar, arrayList3, b3));
                        break;
                    }
                }
                break;
        }
    }
}
