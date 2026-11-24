// default package

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sg3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj3 b;

    public /* synthetic */ sg3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3Var.g3();
                break;
            case 1:
                cj3Var.m5();
                break;
            case 2:
                cj3Var.J3();
                break;
            case 3:
                cj3Var.getMessagesController().n4(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 4:
                je5 je5Var = cj3Var.r0;
                if (je5Var != null) {
                    je5Var.f(true);
                }
                cj3Var.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 5:
                cj3Var.f0[0].d.f();
                break;
            case 6:
                SharedPreferences c1 = na7.c1();
                long j = c1.getLong("cache_hint_period", 604800000L);
                if (j <= 604800000) {
                    j = 2592000000L;
                }
                c1.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j).putLong("cache_hint_period", j).apply();
                cj3Var.m5();
                break;
            case 7:
                UndoView u3 = cj3Var.u3();
                if (u3 != null) {
                    u3.l(0L, 15, null, new wf3(cj3Var, (byte) 17));
                    break;
                }
                break;
            case 8:
                cj3Var.r4();
                break;
            case 9:
                cj3Var.getClass();
                cj3Var.presentFragment(new UserInfoActivity());
                break;
            case 10:
                cj3Var.N3();
                break;
            case 11:
                cj3Var.T3();
                break;
            case 12:
                ag0 ag0Var = new ag0();
                ag0Var.a = true;
                cj3Var.showAsSheet(new PrivacyControlActivity(11, false), ag0Var);
                break;
            case 13:
                cj3Var.Q4(false, true);
                if (cj3Var.f0 != null) {
                    int i = 0;
                    while (true) {
                        bj3[] bj3VarArr = cj3Var.f0;
                        if (i >= bj3VarArr.length) {
                            break;
                        } else {
                            if (bj3VarArr[i].getVisibility() == 0) {
                                bj3 bj3Var = cj3Var.f0[i];
                                if (!bj3Var.d.H) {
                                    bj3Var.b(false);
                                }
                            }
                            i++;
                        }
                    }
                }
                break;
            case 14:
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", cj3Var.a3);
                cj3Var.presentFragment(new en2(bundle));
                break;
            case 15:
                cj3Var.presentFragment(new hmc());
                break;
            case 16:
                cj3Var.f0[0].a.requestLayout();
                rh3 rh3Var = cj3Var.H3;
                qvb qvbVar = (rh3Var == null || !(rh3Var.getFragment() instanceof qvb)) ? null : (qvb) cj3Var.H3.getFragment();
                if (qvbVar != null) {
                    qvbVar.B0();
                }
                cj3Var.a3(false);
                cj3Var.k5();
                hi3 hi3Var = cj3Var.D0;
                if (hi3Var != null) {
                    hi3Var.invalidate();
                    break;
                }
                break;
            case 17:
                cj3Var.u5();
                break;
            default:
                m21.e();
                cj3Var.presentFragment(new SessionsActivity(0));
                break;
        }
    }
}
