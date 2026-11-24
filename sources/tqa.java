// default package

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tqa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;

    public /* synthetic */ tqa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                wsaVar.dismiss();
                d S = LaunchActivity.S();
                TL_stars.TL_starGiftUnique A1 = wsaVar.A1();
                if (S != null && A1 != null) {
                    nk3 nk3Var = new nk3(td4.j(4, "onlySelect", "dialogsType", true));
                    nk3Var.E2 = new jq9(wsaVar, A1, nk3Var, (byte) 5);
                    S.presentFragment(nk3Var);
                    break;
                }
                break;
            case 1:
                wsaVar.a2();
                break;
            default:
                wsaVar.onBackPressed();
                break;
        }
    }
}
