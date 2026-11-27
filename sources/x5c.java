// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class x5c implements q4b {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ d6c b;

    public x5c(d6c d6cVar, TLRPC.InputStickerSet inputStickerSet) {
        this.b = d6cVar;
        this.a = inputStickerSet;
    }

    @Override // q4b
    public final void a() {
        d6c d6cVar = this.b;
        j79 adapter = d6cVar.n.getAdapter();
        c6c c6cVar = d6cVar.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i = 0;
        if (adapter == c6cVar) {
            while (i < c6cVar.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) c6cVar.e.get(i);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    c6cVar.F(stickerSetCovered, null);
                    return;
                }
                i++;
            }
            return;
        }
        z4b z4bVar = d6cVar.w;
        ArrayList arrayList = z4bVar.F;
        while (i < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                z4bVar.F(stickerSetCovered2, null);
                return;
            }
            i++;
        }
    }
}
