// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ur8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lea b;

    public /* synthetic */ ur8(lea leaVar, byte b) {
        this.a = b;
        this.b = leaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lea leaVar = this.b;
        switch (b) {
            case 0:
                yua yuaVar = leaVar.e;
                yuaVar.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i = yuaVar.a;
                reorderstargiftcollections.peer = oc7.r1(i).i1(yuaVar.b);
                ArrayList arrayList = yuaVar.e;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i).sendRequest(reorderstargiftcollections, null);
                yuaVar.j();
                break;
            case 1:
                leaVar.setReorderingCollections(true);
                break;
            case 2:
                leaVar.a();
                break;
            default:
                leaVar.p();
                break;
        }
    }
}
