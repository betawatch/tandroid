package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ bq0 b;

    public /* synthetic */ zo0(bq0 bq0Var, int i10) {
        this.a = i10;
        this.b = bq0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                bq0 bq0Var = this.b;
                bq0Var.r = false;
                bq0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    bq0Var.x0();
                    bq0Var.finishFragment();
                    bq0Var.E0();
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                di.i1 i1Var = this.b.I;
                if (i1Var != null) {
                    i1Var.D(num.intValue());
                    break;
                }
                break;
        }
    }
}
