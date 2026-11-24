// default package

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qm implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rm b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ qm(rm rmVar, ArrayList arrayList, TLObject tLObject, byte b) {
        this.a = b;
        this.b = rmVar;
        this.c = arrayList;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.d;
        ArrayList arrayList = this.c;
        rm rmVar = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                gm.c3(new qm(rmVar, arrayList, tLObject, b2));
                break;
            default:
                int i = rmVar.e;
                HashSet hashSet = new HashSet(arrayList);
                if (tLObject instanceof Vector) {
                    ArrayList arrayList2 = ((Vector) tLObject).objects;
                    cf7.Y(i).a.c(new nm(rmVar, arrayList2, b2));
                    rmVar.d(arrayList2);
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
                        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getCustomEmojiDocuments, new pm(rmVar, arrayList3, b3));
                        break;
                    }
                }
                break;
        }
    }
}
