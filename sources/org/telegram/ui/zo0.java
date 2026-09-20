package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ cq0 b;

    public /* synthetic */ zo0(cq0 cq0Var, int i10) {
        this.a = i10;
        this.b = cq0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                cq0 cq0Var = this.b;
                cq0Var.r = false;
                cq0Var.Q.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    cq0Var.x0();
                    cq0Var.finishFragment();
                    cq0Var.E0();
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                ci.i1 i1Var = this.b.I;
                if (i1Var != null) {
                    i1Var.E(num.intValue());
                    break;
                }
                break;
        }
    }
}
