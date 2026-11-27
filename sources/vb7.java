// default package

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class vb7 extends b71 {
    public final /* synthetic */ uc7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb7(uc7 uc7Var) {
        super(3600000);
        this.e = uc7Var;
    }

    @Override // b71
    public final void e(int i, Object obj, icc iccVar) {
        jf7.Y(i).a.c(new hl3(i, iccVar, (byte) 27));
    }

    @Override // b71
    public final void f(int i, Object obj, long j, a71 a71Var) {
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new ic((byte) 0), new yt4((Object) a71Var, (byte) 20));
    }

    @Override // b71
    public final void g(int i, Object obj, Object obj2) {
        jf7.Y(i).a.c(new hl3(i, (TL_account.TL_webBrowserSettings) obj2, (byte) 28));
    }

    @Override // b71
    public final boolean j(Object obj) {
        return false;
    }
}
