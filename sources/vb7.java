// default package

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
        kf7.a0(i).a.c(new hl3(i, iccVar, (byte) 27));
    }

    @Override // b71
    public final void f(int i, Object obj, long j, a71 a71Var) {
        TL_account.getWebBrowserSettings getwebbrowsersettings = new TL_account.getWebBrowserSettings();
        getwebbrowsersettings.hash = j;
        this.e.getConnectionsManager().sendRequestTyped(getwebbrowsersettings, new ic((byte) 0), new yt4((Object) a71Var, (byte) 20));
    }

    @Override // b71
    public final void g(int i, Object obj, Object obj2) {
        kf7.a0(i).a.c(new hl3(i, (TL_account.TL_webBrowserSettings) obj2, (byte) 28));
    }

    @Override // b71
    public final boolean j(Object obj) {
        return false;
    }
}
