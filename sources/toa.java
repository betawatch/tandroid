// default package

import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class toa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vqa b;

    public /* synthetic */ toa(vqa vqaVar, byte b) {
        this.a = b;
        this.b = vqaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                vqaVar.dismiss();
                d S = LaunchActivity.S();
                TL_stars.TL_starGiftUnique A1 = vqaVar.A1();
                if (S != null && A1 != null) {
                    cj3 cj3Var = new cj3(tb4.j(4, "onlySelect", "dialogsType", true));
                    cj3Var.E2 = new io9(vqaVar, A1, cj3Var, (byte) 5);
                    S.presentFragment(cj3Var);
                    break;
                }
                break;
            case 1:
                vqaVar.a2();
                break;
            default:
                vqaVar.onBackPressed();
                break;
        }
    }
}
