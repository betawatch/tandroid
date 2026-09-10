package zh;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ j1(a3 a3Var, int i10) {
        this.a = i10;
        this.b = a3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.j2.setVisibility(8);
                break;
            case 1:
                a3 a3Var = this.b;
                if (!a3Var.J0.H0) {
                    a3Var.z3 = null;
                    if (a3Var.H0 == null) {
                        bi.x4 x4Var = new bi.x4(a3Var.getContext(), 3);
                        x4Var.l(1.0f, -22.0f);
                        a3Var.H0 = x4Var;
                        x4Var.h(i0.a.k(i0.a.d(0.13f, -16777216, -1), 240));
                        bi.x4 x4Var2 = a3Var.H0;
                        x4Var2.U = false;
                        x4Var2.s(LocaleController.getString(R.string.ReactionLongTapHint));
                        a3Var.H0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.0f));
                        a3Var.c1.addView(a3Var.H0, w7.a6.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, a3Var.x2 ? 0.0f : 56.0f));
                    }
                    a3Var.H0.u();
                    SharedConfig.setStoriesReactionsLongPressHintUsed(true);
                    break;
                }
                break;
            case 2:
                this.b.Q0();
                break;
            case 3:
                ((l7) this.b.Q1).b(true);
                break;
            case 4:
                this.b.r0(true);
                break;
            case 5:
                u7 u7Var = this.b.J0;
                if (u7Var != null) {
                    u7Var.H(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 6:
                this.b.O0();
                break;
            case 7:
                a3 a3Var2 = this.b;
                a3Var2.L3 = 0L;
                t1 t1Var = a3Var2.b2;
                if (t1Var != null) {
                    t1Var.K(true);
                    a3Var2.b2.R1();
                    a3Var2.r0(true);
                    break;
                }
                break;
            case 8:
                a3 a3Var3 = this.b;
                Activity findActivity = AndroidUtilities.findActivity(a3Var3.getContext());
                if (findActivity != null) {
                    yg.q qVar = new yg.q(10, a3Var3, findActivity);
                    u7 u7Var2 = ((l7) a3Var3.Q1).d;
                    t7 t7Var = u7Var2.z0;
                    if (t7Var != null) {
                        z10 = t7Var.release(qVar);
                        u7Var2.z0 = null;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        AndroidUtilities.runOnUIThread(qVar, 80L);
                        break;
                    }
                }
                break;
            case 9:
                u7 u7Var3 = ((l7) this.b.Q1).d;
                u7Var3.i1 = false;
                u7Var3.P();
                break;
            case 10:
                this.b.L0(null);
                break;
            case 11:
                this.b.c1(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            default:
                a3 a3Var4 = this.b;
                a3Var4.U3 = true;
                a3Var4.setActive(false);
                break;
        }
    }
}
