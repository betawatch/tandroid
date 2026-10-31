package ph;

import java.util.ArrayList;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vq0;
import rh.u5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vq0 b;

    public /* synthetic */ m1(vq0 vq0Var, int i10) {
        this.a = i10;
        this.b = vq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u5 u5Var = this.b.e;
                u5Var.getClass();
                TL_stars.reorderStarGiftCollections reorderstargiftcollections = new TL_stars.reorderStarGiftCollections();
                int i10 = u5Var.a;
                reorderstargiftcollections.peer = vp.r1(i10).i1(u5Var.b);
                ArrayList arrayList = u5Var.e;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    reorderstargiftcollections.order.add(Integer.valueOf(((TL_stars.TL_starGiftCollection) obj).collection_id));
                }
                ConnectionsManager.getInstance(i10).sendRequest(reorderstargiftcollections, null);
                u5Var.j();
                break;
            case 1:
                this.b.setReorderingCollections(true);
                break;
            default:
                this.b.a();
                break;
        }
    }
}
