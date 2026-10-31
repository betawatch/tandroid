package th;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ex0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ t(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                j0 j0Var = this.b;
                ArrayList arrayList = j0Var.s;
                t tVar = j0Var.E;
                if (tVar != null) {
                    org.telegram.messenger.i0.r(tVar);
                    j0Var.E = null;
                }
                int currentTime = ConnectionsManager.getInstance(j0Var.N).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    i0 i0Var = (i0) arrayList.get(size);
                    ArrayList arrayList2 = i0Var.f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            h0 h0Var = (h0) obj;
                            long j10 = h0Var.g;
                            if (j10 <= 0 || currentTime - h0Var.d > o.b(i0Var.a, (int) j10, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new ex0(j0Var, 19));
                j0Var.n.O(true);
                j0Var.u(true);
                j0Var.m();
                break;
        }
    }
}
