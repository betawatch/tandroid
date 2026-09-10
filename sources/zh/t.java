package zh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m0 b;

    public /* synthetic */ t(m0 m0Var, int i10) {
        this.a = i10;
        this.b = m0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                m0 m0Var = this.b;
                ArrayList arrayList = m0Var.s;
                t tVar = m0Var.E;
                if (tVar != null) {
                    AndroidUtilities.cancelRunOnUIThread(tVar);
                    m0Var.E = null;
                }
                int currentTime = ConnectionsManager.getInstance(m0Var.N).getCurrentTime();
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    l0 l0Var = (l0) arrayList.get(size);
                    ArrayList arrayList2 = l0Var.f;
                    int size2 = arrayList2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size2) {
                            Object obj = arrayList2.get(i10);
                            i10++;
                            k0 k0Var = (k0) obj;
                            long j3 = k0Var.g;
                            if (j3 <= 0 || currentTime - k0Var.d > o.b(l0Var.a, (int) j3, 0)) {
                            }
                        } else {
                            arrayList.remove(size);
                        }
                    }
                }
                Collections.sort(arrayList, new sg.p(m0Var, 21));
                m0Var.n.N(true);
                m0Var.u(true);
                m0Var.m();
                break;
        }
    }
}
