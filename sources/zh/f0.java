package zh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ f0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                n0 n0Var = this.b;
                if (n0Var.getParentActivity() != null) {
                    pf.d.r(n0Var.getParentActivity(), str);
                    break;
                }
                break;
            default:
                n0 n0Var2 = this.b;
                c1 c1Var = n0Var2.d;
                if (c1Var != null && !n0Var2.isFinished) {
                    c1Var.d1(R.drawable.msg_download, LocaleController.getString(R.string.QrSavedToGallery), null);
                    break;
                }
                break;
        }
    }
}
