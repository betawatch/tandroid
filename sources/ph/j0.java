package ph;

import android.net.Uri;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ j0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                Float f10 = (Float) obj;
                m0 m0Var = this.b.n;
                if (m0Var != null) {
                    m0Var.setProgress(f10.floatValue());
                    break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                n0 n0Var = this.b;
                if (n0Var.c && n0Var.r != null) {
                    n0Var.n.b(R.raw.ic_save_to_gallery, 3500, LocaleController.getString("VideoSavedHint"));
                    n0Var.c = false;
                    n0Var.d();
                    n0Var.v = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                n0 n0Var2 = this.b;
                n0Var2.c = false;
                n0Var2.d();
                m0 m0Var2 = n0Var2.n;
                if (m0Var2 != null) {
                    m0Var2.a();
                    n0Var2.n = null;
                }
                m0 m0Var3 = new m0(n0Var2.getContext());
                n0Var2.n = m0Var3;
                m0Var3.b(R.raw.ic_save_to_gallery, 2500, LocaleController.getString("PhotoSavedHint"));
                n0Var2.b.addView(n0Var2.n);
                n0Var2.v = uri2;
                break;
        }
    }
}
