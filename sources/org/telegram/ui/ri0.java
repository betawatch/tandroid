package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ri0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ri0(si0 si0Var, String str, int i10) {
        this.a = i10;
        this.b = si0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                si0 si0Var = this.b;
                String str = this.c;
                si0Var.getClass();
                org.telegram.messenger.i0.g3(new ri0(si0Var, str, 1));
                break;
            default:
                si0 si0Var2 = this.b;
                String str2 = this.c;
                zf.m1 m1Var = si0Var2.h;
                int i10 = si0Var2.n.s;
                m1Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.g.c(new qd0(si0Var2, str2, new ArrayList(si0Var2.n.x), 11));
                break;
        }
    }
}
