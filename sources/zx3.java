// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zx3 extends zo {
    public final /* synthetic */ ly3 c;

    public zx3(ly3 ly3Var) {
        this.c = ly3Var;
    }

    @Override // zo
    public final int i(int i) {
        TLRPC.StickerSet stickerSet;
        ly3 ly3Var = this.c;
        u55 u55Var = ly3Var.x1;
        xx3 xx3Var = ly3Var.o1;
        iw iwVar = ly3Var.q1;
        if (iwVar.getAdapter() == null || iwVar.getAdapter().d(i) != 1) {
            return u55Var.J;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = xx3Var.c;
            if (i2 >= arrayListArr.length) {
                break;
            }
            int size = arrayListArr[i2].size();
            if (xx3Var.c.length > 1) {
                size = Math.min(u55Var.J << 1, size);
            }
            i3 += size + 2;
            if (i < i3) {
                break;
            }
            i2++;
        }
        ArrayList arrayList = xx3Var.b;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (arrayList == null || i2 >= arrayList.size()) ? null : (TLRPC.TL_messages_stickerSet) xx3Var.b.get(i2);
        return (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) ? 5 : 8;
    }
}
