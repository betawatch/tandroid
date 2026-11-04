package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uw b;

    public /* synthetic */ wu(uw uwVar, int i3) {
        this.a = i3;
        this.b = uwVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.q0 q0Var;
        int i3;
        m91 m91Var = null;
        switch (this.a) {
            case 0:
                uw uwVar = this.b;
                uwVar.M4(false, true);
                if (uwVar.f0 != null) {
                    int i10 = 0;
                    while (true) {
                        tw[] twVarArr = uwVar.f0;
                        if (i10 >= twVarArr.length) {
                            break;
                        } else {
                            if (twVarArr[i10].getVisibility() == 0) {
                                tw twVar = uwVar.f0[i10];
                                if (!twVar.d.H) {
                                    twVar.q(false);
                                }
                            }
                            i10++;
                        }
                    }
                }
                break;
            case 1:
                uw uwVar2 = this.b;
                uwVar2.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", uwVar2.Z2);
                uwVar2.presentFragment(new ji.n(bundle));
                break;
            case 2:
                uw.k0(this.b);
                break;
            case 3:
                uw uwVar3 = this.b;
                uwVar3.getClass();
                uwVar3.presentFragment(new c31(null));
                break;
            case 4:
                uw uwVar4 = this.b;
                if (!uwVar4.a3.collapsed_in_dialogs) {
                    uwVar4.getMessagesController().e5(uwVar4.Z2, true);
                    uwVar4.finishFragment();
                    break;
                }
                break;
            case 5:
                uw uwVar5 = this.b;
                if (uwVar5.a3.collapsed_in_dialogs) {
                    uwVar5.getMessagesController().e5(uwVar5.Z2, false);
                    uwVar5.finishFragment();
                    break;
                }
                break;
            case 6:
                uw uwVar6 = this.b;
                uwVar6.getClass();
                uwVar6.presentFragment(new k());
                break;
            case 7:
                this.b.S4();
                break;
            case 8:
                uw uwVar7 = this.b;
                if (!uw.y4) {
                    uw.y4 = true;
                    SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.k6.Q0(string) == null || org.telegram.ui.ActionBar.k6.Q0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.k6.Q0(string2) == null || !org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean equals = str.equals(j6Var.m());
                        org.telegram.ui.ActionBar.j6 Q0 = !equals ? org.telegram.ui.ActionBar.k6.Q0(str2) : org.telegram.ui.ActionBar.k6.Q0(str);
                        q0Var = uwVar7.l0;
                        if (q0Var != null) {
                            int[] iArr = {(uwVar7.l0.getIconView().getMeasuredWidth() / 2) + r7, (uwVar7.l0.getIconView().getMeasuredHeight() / 2) + r7};
                            q0Var.getLocationInWindow(iArr);
                            int i11 = iArr[0];
                            int i12 = iArr[1];
                            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(uwVar7);
                        au auVar = new au(uwVar7, 12);
                        i3 = org.telegram.ui.ActionBar.k6.o;
                        if (i3 == 0) {
                            if (a02 != null) {
                                try {
                                    a02.J(R.raw.auto_night_off, i3 == 3 ? org.telegram.messenger.bd.M0(2131753785, "AutoNightSystemModeOff") : org.telegram.messenger.bd.M0(2131753790, "AutoNightModeOff"), org.telegram.messenger.bd.M0(2131745505, "Settings"), 5000, false, auVar).j();
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                            }
                            org.telegram.ui.ActionBar.k6.o = 0;
                            org.telegram.ui.ActionBar.k6.w1();
                            org.telegram.ui.ActionBar.k6.B();
                            break;
                        }
                    }
                    str = string;
                    boolean equals2 = str.equals(j6Var.m());
                    if (!equals2) {
                    }
                    q0Var = uwVar7.l0;
                    if (q0Var != null) {
                    }
                    org.telegram.ui.Components.fc a022 = org.telegram.ui.Components.fc.a0(uwVar7);
                    au auVar2 = new au(uwVar7, 12);
                    i3 = org.telegram.ui.ActionBar.k6.o;
                    if (i3 == 0) {
                    }
                }
                break;
            case 9:
                uw uwVar8 = this.b;
                uwVar8.getClass();
                uwVar8.presentFragment(new r40(new Bundle()));
                break;
            case 10:
                uw.e0(this.b);
                break;
            case 11:
                uw uwVar9 = this.b;
                uwVar9.f0[0].a.requestLayout();
                pv pvVar = uwVar9.G3;
                if (pvVar != null && (pvVar.getFragment() instanceof m91)) {
                    m91Var = (m91) uwVar9.G3.getFragment();
                }
                if (m91Var != null) {
                    m91Var.F0();
                }
                uwVar9.S3(false);
                uwVar9.e5();
                cw cwVar = uwVar9.D0;
                if (cwVar != null) {
                    cwVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.o5();
                break;
        }
    }
}
