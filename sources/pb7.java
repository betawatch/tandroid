// default package

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pb7 extends a81 {
    public final /* synthetic */ oc7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb7(oc7 oc7Var) {
        super(3600000);
        this.e = oc7Var;
    }

    @Override // a81
    public final void e(int i, Object obj, jac jacVar) {
        cf7.Y(i).a.c(new bm3(i, jacVar, (byte) 27));
    }

    @Override // a81
    public final void f(int i, Object obj, long j, z71 z71Var) {
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new kc((byte) 0), new vt4((Object) z71Var, (byte) 20));
    }

    @Override // a81
    public final void g(int i, Object obj, Object obj2) {
        cf7.Y(i).a.c(new bm3(i, (TL_account.TL_webBrowserSettings) obj2, (byte) 28));
    }

    @Override // a81
    public final boolean j(Object obj) {
        return false;
    }
}
