package pf;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class n0 implements Comparator {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ ArrayList b;

    public n0(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final int a(t0 t0Var) {
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
                    if (((TLRPC.Document) arrayList2.get(i10)).id == t0Var.a.id) {
                        return (arrayList2.size() - i10) + MediaController.VIDEO_BITRATE_480;
                    }
                    i10++;
                }
            } else {
                if (((TLRPC.Document) arrayList.get(i11)).id == t0Var.a.id) {
                    return i11 + 2000000;
                }
                i11++;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        t0 t0Var = (t0) obj;
        t0 t0Var2 = (t0) obj2;
        boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(t0Var.a, true);
        if (isAnimatedStickerDocument == MessageObject.isAnimatedStickerDocument(t0Var2.a, true)) {
            int a2 = a(t0Var);
            int a3 = a(t0Var2);
            if (a2 > a3) {
                return -1;
            }
            if (a2 >= a3) {
                return 0;
            }
        } else if (isAnimatedStickerDocument) {
            return -1;
        }
        return 1;
    }
}
