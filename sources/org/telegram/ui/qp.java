package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qp implements j70 {
    public final /* synthetic */ yp a;

    public qp(yp ypVar) {
        this.a = ypVar;
    }

    @Override // org.telegram.ui.j70
    public final void a(k70 k70Var, long j3) {
        yp ypVar = this.a;
        ypVar.Y(ypVar.getMessagesController().getChat(Long.valueOf(j3)), k70Var);
    }
}
