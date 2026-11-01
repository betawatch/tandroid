package zf;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.hs;
import org.telegram.messenger.pz;
import org.telegram.messenger.vs;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.nb1;
import org.telegram.ui.tx;
import org.telegram.ui.zx;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements u1, tx {
    public final /* synthetic */ vs a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ j0(vs vsVar, Serializable serializable) {
        this.a = vsVar;
        this.b = serializable;
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean H() {
        return false;
    }

    @Override // org.telegram.ui.tx
    public /* synthetic */ boolean O(zx zxVar) {
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

    @Override // org.telegram.ui.tx
    public boolean z(zx zxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, nb1 nb1Var) {
        mg.c1 c1Var = (mg.c1) this.a;
        String str = (String) this.b;
        long j10 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            j10 = ((hs) arrayList.get(i12)).a;
            c1Var.o1.getSendMessagesHelper().r0(pz.b(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
        }
        zxVar.finishFragment();
        mg.p.h(j10);
        return true;
    }
}
