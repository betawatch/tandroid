package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx b;

    public /* synthetic */ zu(cx cxVar, int i7) {
        this.a = i7;
        this.b = cxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Y3();
                break;
            case 1:
                this.b.o5();
                break;
            case 2:
                cx.L0(this.b);
                break;
            case 3:
                this.b.getMessagesController().s4(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 4:
                cx cxVar = this.b;
                hi.l3 l3Var = cxVar.r0;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                cxVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 5:
                this.b.f0[0].d.f();
                break;
            case 6:
                cx cxVar2 = this.b;
                cxVar2.getClass();
                SharedPreferences g12 = org.telegram.messenger.np.g1();
                long j3 = g12.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                g12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                cxVar2.o5();
                break;
            case 7:
                cx cxVar3 = this.b;
                UndoView l42 = cxVar3.l4();
                if (l42 != null) {
                    l42.l(0L, 15, null, new gu(cxVar3, 17));
                    break;
                }
                break;
            case 8:
                cx.c0(this.b);
                break;
            case 9:
                cx cxVar4 = this.b;
                cxVar4.getClass();
                cxVar4.presentFragment(new UserInfoActivity());
                break;
            case 10:
                cx.i0(this.b);
                break;
            case 11:
                org.telegram.messenger.np.u1(this.b.currentAccount).l0(null);
                break;
            case 12:
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                e2Var.a = true;
                this.b.showAsSheet(new PrivacyControlActivity(11, false), e2Var);
                break;
            case 13:
                cx cxVar5 = this.b;
                cxVar5.U4(false, true);
                if (cxVar5.f0 != null) {
                    int i7 = 0;
                    while (true) {
                        bx[] bxVarArr = cxVar5.f0;
                        if (i7 >= bxVarArr.length) {
                            break;
                        } else {
                            if (bxVarArr[i7].getVisibility() == 0) {
                                bx bxVar = cxVar5.f0[i7];
                                if (!bxVar.d.H) {
                                    bxVar.q(false);
                                }
                            }
                            i7++;
                        }
                    }
                }
                break;
            case 14:
                cx cxVar6 = this.b;
                cxVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", cxVar6.a3);
                cxVar6.presentFragment(new li.p(bundle));
                break;
            case 15:
                cx cxVar7 = this.b;
                cxVar7.getClass();
                cxVar7.presentFragment(new org.telegram.ui.Wallet.n6());
                break;
            case 16:
                cx cxVar8 = this.b;
                cxVar8.f0[0].a.requestLayout();
                xv xvVar = cxVar8.H3;
                y91 y91Var = (xvVar == null || !(xvVar.getFragment() instanceof y91)) ? null : (y91) cxVar8.H3.getFragment();
                if (y91Var != null) {
                    y91Var.F0();
                }
                cxVar8.S3(false);
                cxVar8.m5();
                kw kwVar = cxVar8.D0;
                if (kwVar != null) {
                    kwVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.w5();
                break;
        }
    }
}
