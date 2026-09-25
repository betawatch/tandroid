package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ tp0 b;

    public /* synthetic */ qo0(tp0 tp0Var, int i10) {
        this.a = i10;
        this.b = tp0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                tp0 tp0Var = this.b;
                tp0Var.r = false;
                tp0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    tp0Var.x0();
                    tp0Var.finishFragment();
                    tp0Var.E0();
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                ci.i1 i1Var = this.b.I;
                if (i1Var != null) {
                    i1Var.D(num.intValue());
                    break;
                }
                break;
        }
    }
}
