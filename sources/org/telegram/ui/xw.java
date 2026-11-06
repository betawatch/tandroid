package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class xw implements org.telegram.messenger.x5 {
    public long a;
    public long b;
    public final String c;
    public final /* synthetic */ yw d;

    public xw(yw ywVar, String str) {
        this.d = ywVar;
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
