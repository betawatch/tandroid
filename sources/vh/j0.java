package vh;

import android.net.Uri;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ j0(n0 n0Var, int i10) {
        this.a = i10;
        this.b = n0Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        n0 n0Var = this.b;
        switch (i10) {
            case 0:
                Float f7 = (Float) obj;
                m0 m0Var = n0Var.n;
                if (m0Var != null) {
                    m0Var.setProgress(f7.floatValue());
                    break;
                }
                break;
            case 1:
                Uri uri = (Uri) obj;
                if (n0Var.c && n0Var.r != null) {
                    n0Var.n.b(R.raw.ic_save_to_gallery, 3500, cd.M0("VideoSavedHint"));
                    n0Var.c = false;
                    n0Var.d();
                    n0Var.w = uri;
                    break;
                }
                break;
            default:
                Uri uri2 = (Uri) obj;
                n0Var.c = false;
                n0Var.d();
                m0 m0Var2 = n0Var.n;
                if (m0Var2 != null) {
                    m0Var2.a();
                    n0Var.n = null;
                }
                m0 m0Var3 = new m0(n0Var.getContext());
                n0Var.n = m0Var3;
                m0Var3.b(R.raw.ic_save_to_gallery, 2500, cd.M0("PhotoSavedHint"));
                n0Var.b.addView(n0Var.n);
                n0Var.w = uri2;
                break;
        }
    }
}
