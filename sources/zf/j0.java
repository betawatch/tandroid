package zf;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.oz;
import org.telegram.messenger.us;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ay;
import org.telegram.ui.pb1;
import org.telegram.ui.ux;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements u1, ux {
    public final /* synthetic */ us a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ j0(us usVar, Serializable serializable) {
        this.a = usVar;
        this.b = serializable;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean N(ay ayVar) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        x0 x0Var = (x0) this.a;
        boolean[] zArr = (boolean[]) this.b;
        x0Var.getClass();
        zArr[0] = true;
        x0Var.Q();
    }

    @Override // org.telegram.ui.ux
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        mg.c1 c1Var = (mg.c1) this.a;
        String str = (String) this.b;
        long j10 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            j10 = ((gs) arrayList.get(i12)).a;
            c1Var.o1.getSendMessagesHelper().r0(oz.b(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
        }
        ayVar.finishFragment();
        mg.p.h(j10);
        return true;
    }
}
