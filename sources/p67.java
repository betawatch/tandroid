// default package

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class p67 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ TL_account.TL_webBrowserSettings c;

    public /* synthetic */ p67(na7 na7Var, TL_account.TL_webBrowserSettings tL_webBrowserSettings, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = tL_webBrowserSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
        na7 na7Var = this.b;
        switch (b) {
            case 0:
                f67 f67Var = na7Var.l5;
                if (tL_webBrowserSettings != null) {
                    na7Var.m5 = tL_webBrowserSettings;
                    na7Var.getNotificationCenter().k(kk7.T5, new Object[0]);
                }
                gl.r(f67Var);
                gl.e3(f67Var, 3600010L);
                break;
            default:
                if (tL_webBrowserSettings != null) {
                    na7Var.m5 = tL_webBrowserSettings;
                    na7Var.getNotificationCenter().k(kk7.T5, new Object[0]);
                    break;
                }
                break;
        }
    }
}
