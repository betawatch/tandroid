package rc;

import java.util.ArrayList;
import org.telegram.ui.Wallet.i1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class z extends Thread {
    public final u a;

    public z(String str, u uVar, int i7) {
        super(str);
        this.a = uVar;
    }

    public abstract void a();

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ab.q qVar = this.a.d;
        int i7 = 0;
        if (qVar != null) {
            ArrayList arrayList = (ArrayList) qVar.q();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                i1 i1Var = (i1) obj;
                try {
                    try {
                        i1Var.getClass();
                    } catch (Throwable unused) {
                        i1Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        a();
        if (qVar != null) {
            ArrayList arrayList2 = (ArrayList) qVar.q();
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                i1 i1Var2 = (i1) obj2;
                try {
                    try {
                        i1Var2.getClass();
                    } catch (Throwable unused3) {
                        i1Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }
}
