package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai.z b;

    public /* synthetic */ u01(ai.z zVar, int i3) {
        this.a = i3;
        this.b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.K3(((yz0) this.b.a2).h);
                break;
            default:
                this.b.requestFocus();
                break;
        }
    }
}
