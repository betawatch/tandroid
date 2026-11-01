package yh;

import android.os.Bundle;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.h10;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;

    public /* synthetic */ s(z zVar, int i10) {
        this.a = i10;
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z zVar = this.b;
                zVar.r1.d.e3.h1(1, zVar.L1.b);
                zVar.i1.a(false, true);
                zVar.q0 = true;
                h10 h10Var = zVar.u1;
                i0.v1(h10Var.r);
                h10Var.r.clearFocus();
                break;
            case 1:
                z zVar2 = this.b;
                zVar2.t1.d.e3.h1(1, zVar2.L1.b);
                zVar2.j1.a(false, true);
                zVar2.q0 = true;
                h10 h10Var2 = zVar2.v1;
                i0.v1(h10Var2.r);
                h10Var2.r.clearFocus();
                break;
            default:
                z zVar3 = this.b;
                zVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", zVar3.l1);
                zVar3.q1.presentFragment(new l(bundle));
                zVar3.dismiss();
                break;
        }
    }
}
