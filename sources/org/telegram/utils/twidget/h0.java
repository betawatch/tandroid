package org.telegram.utils.twidget;

import org.telegram.messenger.r20;
import org.telegram.ui.web.v1;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ r20 c;

    public /* synthetic */ h0(String str, r20 r20Var) {
        this.b = str;
        this.c = r20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.a(this.b);
                break;
            default:
                org.telegram.messenger.i0.g3(new v1(23, this.c, qh.g.c(this.b, org.telegram.messenger.i0.L(240.0f), ac.d.c, 0.75f, null)));
                break;
        }
    }

    public /* synthetic */ h0(a aVar, String str) {
        this.c = aVar;
        this.b = str;
    }
}
