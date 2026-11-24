// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class y3c implements v2b {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ d4c b;

    public y3c(d4c d4cVar, TLRPC.InputStickerSet inputStickerSet) {
        this.b = d4cVar;
        this.a = inputStickerSet;
    }

    @Override // v2b
    public final void a() {
        d4c d4cVar = this.b;
        y59 adapter = d4cVar.n.getAdapter();
        c4c c4cVar = d4cVar.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i = 0;
        if (adapter == c4cVar) {
            while (i < c4cVar.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) c4cVar.e.get(i);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    c4cVar.F(stickerSetCovered, null);
                    return;
                }
                i++;
            }
            return;
        }
        e3b e3bVar = d4cVar.w;
        ArrayList arrayList = e3bVar.F;
        while (i < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                e3bVar.F(stickerSetCovered2, null);
                return;
            }
            i++;
        }
    }
}
