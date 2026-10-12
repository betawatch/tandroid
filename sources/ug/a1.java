package ug;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m1 b;

    public /* synthetic */ a1(m1 m1Var, int i10) {
        this.a = i10;
        this.b = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0(true);
                break;
            case 1:
                this.b.d0.setVisibility(8);
                break;
            case 2:
                m1 m1Var = this.b;
                m1Var.X();
                m1Var.j0(true, false);
                break;
            case 3:
                h1 h1Var = this.b.Z;
                h1Var.b.setHintText(LocaleController.getString(R.string.Search), true);
                break;
            case 4:
                h1 h1Var2 = this.b.Z;
                h1Var2.b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                break;
            case 5:
                m1 m1Var2 = this.b;
                m1Var2.X();
                m1Var2.j0(true, false);
                break;
            case 6:
                this.b.d0(true);
                break;
            case 7:
                this.b.d0.setVisibility(8);
                break;
            case 8:
                m1 m1Var3 = this.b;
                m1Var3.X();
                m1Var3.j0(true, false);
                break;
            case 9:
                m2 m2Var = this.b.n;
                if (m2Var != null) {
                    k2 k2Var = new k2();
                    k2Var.a = true;
                    m2Var.showAsSheet(new PrivacyControlActivity(11, false), k2Var);
                    break;
                }
                break;
            case 10:
                this.b.i0(true, true);
                break;
            case 11:
                this.b.dismiss();
                break;
            default:
                m1 m1Var4 = this.b;
                m1Var4.X();
                m1Var4.j0(true, false);
                break;
        }
    }
}
