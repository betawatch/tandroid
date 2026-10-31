package th;

import java.util.ArrayList;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v7 implements Runnable {
    public final /* synthetic */ w7 a;

    public v7(w7 w7Var) {
        this.a = w7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w7 w7Var = this.a;
        int i10 = w7Var.a;
        ArrayList arrayList = w7Var.d;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            tL_stories_getPeerMaxIDs.id.add(vp.r1(i10).i1(((Long) arrayList2.get(i11)).longValue()));
        }
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_stories_getPeerMaxIDs, new a3.b(1), new rh.s6(4, this, arrayList2));
    }
}
