package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d80;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d80 b;

    public /* synthetic */ k4(d80 d80Var, int i10) {
        this.a = i10;
        this.b = d80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k4(this.b, 3));
                break;
            case 1:
                this.b.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 2:
                this.b.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            default:
                this.b.run(Boolean.FALSE, null);
                break;
        }
    }
}
