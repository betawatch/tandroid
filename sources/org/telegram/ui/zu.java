package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww b;

    public /* synthetic */ zu(ww wwVar, int i7) {
        this.a = i7;
        this.b = wwVar;
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
        org.telegram.ui.ActionBar.r0 r0Var;
        int i7;
        v91 v91Var = null;
        switch (this.a) {
            case 0:
                ww wwVar = this.b;
                wwVar.M4(false, true);
                if (wwVar.e0 != null) {
                    int i10 = 0;
                    while (true) {
                        vw[] vwVarArr = wwVar.e0;
                        if (i10 >= vwVarArr.length) {
                            break;
                        } else {
                            if (vwVarArr[i10].getVisibility() == 0) {
                                vw vwVar = wwVar.e0[i10];
                                if (!vwVar.d.G) {
                                    vwVar.q(false);
                                }
                            }
                            i10++;
                        }
                    }
                }
                break;
            case 1:
                ww wwVar2 = this.b;
                wwVar2.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", wwVar2.Y2);
                wwVar2.presentFragment(new ii.p(bundle));
                break;
            case 2:
                ww.k0(this.b);
                break;
            case 3:
                ww wwVar3 = this.b;
                wwVar3.getClass();
                wwVar3.presentFragment(new m31(null));
                break;
            case 4:
                ww wwVar4 = this.b;
                if (!wwVar4.Z2.collapsed_in_dialogs) {
                    wwVar4.getMessagesController().e5(wwVar4.Y2, true);
                    wwVar4.finishFragment();
                    break;
                }
                break;
            case 5:
                ww wwVar5 = this.b;
                if (wwVar5.Z2.collapsed_in_dialogs) {
                    wwVar5.getMessagesController().e5(wwVar5.Y2, false);
                    wwVar5.finishFragment();
                    break;
                }
                break;
            case 6:
                ww wwVar6 = this.b;
                wwVar6.getClass();
                wwVar6.presentFragment(new k());
                break;
            case 7:
                this.b.S4();
                break;
            case 8:
                ww wwVar7 = this.b;
                if (!ww.x4) {
                    ww.x4 = true;
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
                        r0Var = wwVar7.k0;
                        if (r0Var != null) {
                            int[] iArr = {(wwVar7.k0.getIconView().getMeasuredWidth() / 2) + r7, (wwVar7.k0.getIconView().getMeasuredHeight() / 2) + r7};
                            r0Var.getLocationInWindow(iArr);
                            int i11 = iArr[0];
                            int i12 = iArr[1];
                            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        org.telegram.ui.Components.hc a02 = org.telegram.ui.Components.hc.a0(wwVar7);
                        cu cuVar = new cu(wwVar7, 12);
                        i7 = org.telegram.ui.ActionBar.k6.o;
                        if (i7 == 0) {
                            if (a02 != null) {
                                try {
                                    a02.J(R.raw.auto_night_off, i7 == 3 ? org.telegram.messenger.hd.M0(2131753785, "AutoNightSystemModeOff") : org.telegram.messenger.hd.M0(2131753790, "AutoNightModeOff"), org.telegram.messenger.hd.M0(2131745496, "Settings"), 5000, false, cuVar).j();
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
                    r0Var = wwVar7.k0;
                    if (r0Var != null) {
                    }
                    org.telegram.ui.Components.hc a022 = org.telegram.ui.Components.hc.a0(wwVar7);
                    cu cuVar2 = new cu(wwVar7, 12);
                    i7 = org.telegram.ui.ActionBar.k6.o;
                    if (i7 == 0) {
                    }
                }
                break;
            case 9:
                ww wwVar8 = this.b;
                wwVar8.getClass();
                wwVar8.presentFragment(new w40(new Bundle()));
                break;
            case 10:
                ww.e0(this.b);
                break;
            case 11:
                ww wwVar9 = this.b;
                wwVar9.e0[0].a.requestLayout();
                sv svVar = wwVar9.F3;
                if (svVar != null && (svVar.getFragment() instanceof v91)) {
                    v91Var = (v91) wwVar9.F3.getFragment();
                }
                if (v91Var != null) {
                    v91Var.F0();
                }
                wwVar9.S3(false);
                wwVar9.e5();
                fw fwVar = wwVar9.C0;
                if (fwVar != null) {
                    fwVar.invalidate();
                    break;
                }
                break;
            default:
                this.b.o5();
                break;
        }
    }
}
