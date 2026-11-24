// default package

import android.view.View;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rl1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rl1(mu1 mu1Var, int i) {
        this.a = (byte) 1;
        this.b = mu1Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gb2 gb2Var;
        k27 messageObject;
        byte b = this.a;
        boolean z = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.presentFragment(new PremiumPreviewFragment(0, z ? "upload_speed" : "download_speed"));
                break;
            case 1:
                jq1 jq1Var = mu1Var.A0;
                if (jq1Var != null) {
                    int childCount = jq1Var.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = mu1Var.A0.getChildAt(i);
                        if ((childAt instanceof gb2) && (messageObject = (gb2Var = (gb2) childAt).getMessageObject()) != null && messageObject.T(mu1Var.V3)) {
                            gb2Var.J3(z ? 1 : 0, true, true);
                        }
                    }
                }
                mu1Var.V3 = null;
                break;
            default:
                mu1Var.Uc(0, z);
                break;
        }
    }

    public /* synthetic */ rl1(mu1 mu1Var, boolean z, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = z;
    }
}
