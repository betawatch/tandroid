package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
    public final void C(boolean z9) {
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
