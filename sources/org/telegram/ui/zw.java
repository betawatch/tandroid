package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zw implements org.telegram.messenger.x5 {
    public long a;
    public long b;
    public final String c;
    public final /* synthetic */ ax d;

    public zw(ax axVar, String str) {
        this.d = axVar;
        this.c = str;
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return 0;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.b = j3;
        this.a = j10;
        this.d.b();
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
    }

    @Override // org.telegram.messenger.x5
    public final void N(String str) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
