// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class y1c implements s0b {
    public final /* synthetic */ TLRPC.InputStickerSet a;
    public final /* synthetic */ d2c b;

    public y1c(d2c d2cVar, TLRPC.InputStickerSet inputStickerSet) {
        this.b = d2cVar;
        this.a = inputStickerSet;
    }

    @Override // s0b
    public final void a() {
        d2c d2cVar = this.b;
        w39 adapter = d2cVar.n.getAdapter();
        c2c c2cVar = d2cVar.s;
        TLRPC.InputStickerSet inputStickerSet = this.a;
        int i = 0;
        if (adapter == c2cVar) {
            while (i < c2cVar.e.size()) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) c2cVar.e.get(i);
                if (stickerSetCovered.set.id == inputStickerSet.id) {
                    c2cVar.F(stickerSetCovered, null);
                    return;
                }
                i++;
            }
            return;
        }
        c1b c1bVar = d2cVar.w;
        ArrayList arrayList = c1bVar.F;
        while (i < arrayList.size()) {
            TLRPC.StickerSetCovered stickerSetCovered2 = (TLRPC.StickerSetCovered) arrayList.get(i);
            if (stickerSetCovered2.set.id == inputStickerSet.id) {
                c1bVar.F(stickerSetCovered2, null);
                return;
            }
            i++;
        }
    }
}
