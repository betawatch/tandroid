package org.telegram.utils.twidget;

import org.telegram.messenger.q20;
import org.telegram.ui.web.v1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ q20 c;

    public /* synthetic */ h0(String str, q20 q20Var) {
        this.b = str;
        this.c = q20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.a(this.b);
                break;
            default:
                org.telegram.messenger.i0.g3(new v1(22, this.c, qh.g.c(this.b, org.telegram.messenger.i0.L(240.0f), ac.d.c, 0.75f, null)));
                break;
        }
    }

    public /* synthetic */ h0(a aVar, String str) {
        this.c = aVar;
        this.b = str;
    }
}
