package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
