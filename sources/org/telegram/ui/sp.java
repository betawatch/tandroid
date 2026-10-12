package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class sp implements o70 {
    public final /* synthetic */ aq a;

    public sp(aq aqVar) {
        this.a = aqVar;
    }

    @Override // org.telegram.ui.o70
    public final void a(p70 p70Var, long j10) {
        aq aqVar = this.a;
        aqVar.Y(aqVar.getMessagesController().getChat(Long.valueOf(j10)), p70Var);
    }
}
