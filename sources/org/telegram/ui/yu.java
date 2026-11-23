package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx b;

    public /* synthetic */ yu(bx bxVar, int i7) {
        this.a = i7;
        this.b = bxVar;
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
                bx.L0(this.b);
                break;
            case 3:
                this.b.getMessagesController().s4(0L, "SETUP_LOGIN_EMAIL");
                break;
            case 4:
                bx bxVar = this.b;
                hi.u3 u3Var = bxVar.r0;
                if (u3Var != null) {
                    u3Var.f(true);
                }
                bxVar.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
            case 5:
                this.b.f0[0].d.f();
                break;
            case 6:
                bx bxVar2 = this.b;
                bxVar2.getClass();
                SharedPreferences g12 = org.telegram.messenger.mp.g1();
                long j3 = g12.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                g12.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                bxVar2.o5();
                break;
            case 7:
                bx bxVar3 = this.b;
                UndoView l42 = bxVar3.l4();
                if (l42 != null) {
                    l42.l(0L, 15, null, new fu(bxVar3, 17));
                    break;
                }
                break;
            case 8:
                bx.c0(this.b);
                break;
            case 9:
                bx bxVar4 = this.b;
                bxVar4.getClass();
                bxVar4.presentFragment(new UserInfoActivity());
                break;
            case 10:
                bx.i0(this.b);
                break;
            case 11:
                org.telegram.messenger.mp.u1(this.b.currentAccount).l0(null);
                break;
            case 12:
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2();
                e2Var.a = true;
                this.b.showAsSheet(new PrivacyControlActivity(11, false), e2Var);
                break;
            case 13:
                bx bxVar5 = this.b;
                bxVar5.U4(false, true);
                if (bxVar5.f0 != null) {
                    int i7 = 0;
                    while (true) {
                        ax[] axVarArr = bxVar5.f0;
                        if (i7 >= axVarArr.length) {
                            break;
                        } else {
                            if (axVarArr[i7].getVisibility() == 0) {
                                ax axVar = bxVar5.f0[i7];
                                if (!axVar.d.H) {
                                    axVar.q(false);
                                }
                            }
                            i7++;
                        }
                    }
                }
                break;
            case 14:
                bx bxVar6 = this.b;
                bxVar6.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", bxVar6.a3);
                bxVar6.presentFragment(new li.o(bundle));
                break;
            case 15:
                bx bxVar7 = this.b;
                bxVar7.getClass();
                bxVar7.presentFragment(new org.telegram.ui.Wallet.o6());
                break;
            case 16:
                bx bxVar8 = this.b;
                bxVar8.f0[0].a.requestLayout();
                wv wvVar = bxVar8.H3;
                w91 w91Var = (wvVar == null || !(wvVar.getFragment() instanceof w91)) ? null : (w91) bxVar8.H3.getFragment();
                if (w91Var != null) {
                    w91Var.F0();
                }
                bxVar8.S3(false);
                bxVar8.m5();
                jw jwVar = bxVar8.D0;
                if (jwVar != null) {
                    jwVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.w5();
                break;
        }
    }
}
