package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wr b;

    public /* synthetic */ vr(wr wrVar, int i10) {
        this.a = i10;
        this.b = wrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.z51 z51Var = this.b.a;
                if (z51Var != null) {
                    z51Var.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.z51 z51Var2 = this.b.a;
                if (z51Var2 != null) {
                    z51Var2.Y2.N(true);
                    break;
                }
                break;
        }
    }
}
