package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ aq0 b;

    public /* synthetic */ xo0(aq0 aq0Var, int i10) {
        this.a = i10;
        this.b = aq0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                aq0 aq0Var = this.b;
                aq0Var.r = false;
                aq0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    aq0Var.x0();
                    aq0Var.finishFragment();
                    aq0Var.E0();
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                ci.h1 h1Var = this.b.I;
                if (h1Var != null) {
                    h1Var.D(num.intValue());
                    break;
                }
                break;
        }
    }
}
