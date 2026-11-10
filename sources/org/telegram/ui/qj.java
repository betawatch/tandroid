package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class qj implements Runnable {
    public final /* synthetic */ cn a;

    public qj(cn cnVar) {
        this.a = cnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cn cnVar = this.a;
        org.telegram.messenger.ij ijVar = cnVar.t5;
        if (ijVar == null || cnVar.j9 == null) {
            return;
        }
        int max = Math.max(0, ijVar.k.ttl_period - (cnVar.getConnectionsManager().getCurrentTime() - cnVar.t5.k.date));
        cnVar.j9.setSubtext(org.telegram.messenger.id.a0(null, null, 2131753853, max < 86400 ? org.telegram.messenger.g0.g0(max, false, true) : org.telegram.messenger.id.G(Math.round(max / 86400.0f), "Days", new Object[0])));
        org.telegram.messenger.g0.i3(cnVar.k9, 1000L);
    }
}
