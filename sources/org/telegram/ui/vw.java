package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class vw implements org.telegram.messenger.x5 {
    public long a;
    public long b;
    public final String c;
    public final /* synthetic */ ww d;

    public vw(ww wwVar, String str) {
        this.d = wwVar;
        this.c = str;
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return 0;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        this.b = j10;
        this.a = j11;
        this.d.b();
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
