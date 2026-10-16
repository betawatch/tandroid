package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class rp implements o70 {
    public final /* synthetic */ aq a;

    public rp(aq aqVar) {
        this.a = aqVar;
    }

    @Override // org.telegram.ui.o70
    public final void a(p70 p70Var, long j10) {
        aq aqVar = this.a;
        aqVar.Y(aqVar.getMessagesController().getChat(Long.valueOf(j10)), p70Var);
    }
}
