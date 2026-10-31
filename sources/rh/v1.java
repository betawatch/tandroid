package rh;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ un c;
    public final /* synthetic */ long d;

    public /* synthetic */ v1(e4 e4Var, un unVar, long j10, int i10) {
        this.a = i10;
        this.b = e4Var;
        this.c = unVar;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j10 = this.d;
        un unVar = this.c;
        e4 e4Var = this.b;
        switch (i10) {
            case 0:
                wb I = cc.a0(unVar).I(R.raw.forward, cd.L0(2131749906, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749907, e4Var.z1(), org.telegram.messenger.o5.t(j10))));
                I.t = true;
                I.j();
                break;
            default:
                wb I2 = cc.a0(unVar).I(R.raw.forward, cd.L0(2131749906, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749907, e4Var.z1(), org.telegram.messenger.o5.t(j10))));
                I2.t = true;
                I2.j();
                break;
        }
    }
}
