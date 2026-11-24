// default package

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class r87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ TL_account.TL_webBrowserSettings c;

    public /* synthetic */ r87(oc7 oc7Var, TL_account.TL_webBrowserSettings tL_webBrowserSettings, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = tL_webBrowserSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
        oc7 oc7Var = this.b;
        switch (b) {
            case 0:
                g87 g87Var = oc7Var.n5;
                if (tL_webBrowserSettings != null) {
                    oc7Var.o5 = tL_webBrowserSettings;
                    oc7Var.getNotificationCenter().k(nm7.V5, new Object[0]);
                }
                gm.r(g87Var);
                gm.d3(g87Var, 3600010L);
                break;
            default:
                if (tL_webBrowserSettings != null) {
                    oc7Var.o5 = tL_webBrowserSettings;
                    oc7Var.getNotificationCenter().k(nm7.V5, new Object[0]);
                    break;
                }
                break;
        }
    }
}
