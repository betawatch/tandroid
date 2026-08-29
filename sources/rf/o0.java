package rf;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o0 implements Comparator {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;

    public o0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final int a(u0 u0Var) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i11 >= arrayList.size()) {
                while (true) {
                    ArrayList arrayList2 = this.b;
                    if (i10 >= Math.min(20, arrayList2.size())) {
                        return -1;
                    }
                    if (((TLRPC.Document) arrayList2.get(i10)).id == u0Var.a.id) {
                        return (arrayList2.size() - i10) + MediaController.VIDEO_BITRATE_480;
                    }
                    i10++;
                }
            } else {
                if (((TLRPC.Document) arrayList.get(i11)).id == u0Var.a.id) {
                    return i11 + 2000000;
                }
                i11++;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        u0 u0Var = (u0) obj;
        u0 u0Var2 = (u0) obj2;
        boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(u0Var.a, true);
        if (isAnimatedStickerDocument == MessageObject.isAnimatedStickerDocument(u0Var2.a, true)) {
            int a2 = a(u0Var);
            int a10 = a(u0Var2);
            if (a2 > a10) {
                return -1;
            }
            if (a2 >= a10) {
                return 0;
            }
        } else if (isAnimatedStickerDocument) {
            return -1;
        }
        return 1;
    }
}
