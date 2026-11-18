package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rh0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ qh0(rh0 rh0Var, String str, int i7) {
        this.a = i7;
        this.b = rh0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rh0 rh0Var = this.b;
                String str = this.c;
                rh0Var.getClass();
                org.telegram.messenger.g0.g3(new qh0(rh0Var, str, 1));
                break;
            default:
                rh0 rh0Var2 = this.b;
                String str2 = this.c;
                jg.z1 z1Var = rh0Var2.h;
                int i7 = rh0Var2.n.s;
                z1Var.g(str2, true, (i7 == 1 || i7 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.g.c(new lc0(rh0Var2, str2, new ArrayList(rh0Var2.n.x), 10));
                break;
        }
    }
}
