// default package

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xz9 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ LinkedHashSet b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ xz9(LinkedHashSet linkedHashSet, Runnable runnable, byte b) {
        this.a = b;
        this.b = linkedHashSet;
        this.c = runnable;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        Runnable runnable = this.c;
        LinkedHashSet linkedHashSet = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    linkedHashSet.addAll(arrayList);
                }
                runnable.run();
                break;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                runnable.run();
                break;
        }
    }
}
