// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oy3 extends yp {
    public final /* synthetic */ az3 c;

    public oy3(az3 az3Var) {
        this.c = az3Var;
    }

    @Override // yp
    public final int i(int i) {
        TLRPC.StickerSet stickerSet;
        az3 az3Var = this.c;
        q55 q55Var = az3Var.x1;
        my3 my3Var = az3Var.o1;
        hx hxVar = az3Var.q1;
        if (hxVar.getAdapter() == null || hxVar.getAdapter().d(i) != 1) {
            return q55Var.J;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = my3Var.c;
            if (i2 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i2].size();
            if (my3Var.c.length > 1) {
                size = Math.min(q55Var.J << 1, size);
            }
            i3 += size + 2;
            if (i < i3) {
                break;
            }
            i2++;
        }
        ArrayList arrayList = my3Var.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i2 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) my3Var.b.get(i2);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
