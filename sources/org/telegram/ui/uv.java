package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ uv(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.u0 u0Var;
        int i10;
        lg1 lg1Var = null;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                yy yyVar = this.b;
                yyVar.getClass();
                yyVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                yy yyVar2 = this.b;
                yyVar2.x4(false, true);
                if (yyVar2.e0 != null) {
                    int i11 = 0;
                    while (true) {
                        xy[] xyVarArr = yyVar2.e0;
                        if (i11 >= xyVarArr.length) {
                            break;
                        } else {
                            if (xyVarArr[i11].getVisibility() == 0) {
                                xy xyVar = yyVar2.e0[i11];
                                if (!xyVar.d.G) {
                                    xyVar.q(false);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 3:
                yy yyVar3 = this.b;
                yyVar3.X.r.requestFocus();
                AndroidUtilities.showKeyboard(yyVar3.X.r);
                break;
            case 4:
                yy yyVar4 = this.b;
                yyVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", yyVar4.X2);
                yyVar4.presentFragment(new gi.p(bundle));
                break;
            case 5:
                yy yyVar5 = this.b;
                yyVar5.e0[0].a.requestLayout();
                sx sxVar = yyVar5.F3;
                if (sxVar != null && (sxVar.getFragment() instanceof lg1)) {
                    lg1Var = (lg1) yyVar5.F3.getFragment();
                }
                if (lg1Var != null) {
                    lg1Var.B0();
                }
                yyVar5.D3(false);
                yyVar5.P4();
                iy iyVar = yyVar5.C0;
                if (iyVar != null) {
                    iyVar.invalidate();
                    break;
                }
                break;
            case 6:
                yy yyVar6 = this.b;
                yyVar6.getClass();
                yyVar6.presentFragment(new o91(null));
                break;
            case 7:
                yy yyVar7 = this.b;
                if (!yyVar7.Y2.collapsed_in_dialogs) {
                    yyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(yyVar7.X2, true);
                    yyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                yy yyVar8 = this.b;
                if (yyVar8.Y2.collapsed_in_dialogs) {
                    yyVar8.getMessagesController().toggleCommunityCollapsedInDialogs(yyVar8.X2, false);
                    yyVar8.finishFragment();
                    break;
                }
                break;
            case 9:
                yy yyVar9 = this.b;
                yyVar9.getClass();
                yyVar9.presentFragment(new l());
                break;
            case 10:
                this.b.D4();
                break;
            case 11:
                yy yyVar10 = this.b;
                if (!yy.w4) {
                    yy.w4 = true;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.g6.O0(string) == null || org.telegram.ui.ActionBar.g6.O0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.g6.O0(string2) == null || !org.telegram.ui.ActionBar.g6.O0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
                    if (string.equals(string2)) {
                        if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                            str2 = string2;
                            boolean equals = str.equals(f6Var.m());
                            org.telegram.ui.ActionBar.f6 O0 = !equals ? org.telegram.ui.ActionBar.g6.O0(str2) : org.telegram.ui.ActionBar.g6.O0(str);
                            u0Var = yyVar10.k0;
                            if (u0Var != null) {
                                int[] iArr = {(yyVar10.k0.getIconView().getMeasuredWidth() / 2) + r7, (yyVar10.k0.getIconView().getMeasuredHeight() / 2) + r7};
                                u0Var.getLocationInWindow(iArr);
                                int i12 = iArr[0];
                                int i13 = iArr[1];
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                            }
                            org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(yyVar10);
                            uv uvVar = new uv(yyVar10, 27);
                            i10 = org.telegram.ui.ActionBar.g6.o;
                            if (i10 == 0) {
                                if (a02 != null) {
                                    try {
                                        a02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, uvVar).j();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                org.telegram.ui.ActionBar.g6.o = 0;
                                org.telegram.ui.ActionBar.g6.r1();
                                org.telegram.ui.ActionBar.g6.A();
                                break;
                            }
                        }
                    } else {
                        str2 = string2;
                    }
                    str = string;
                    boolean equals2 = str.equals(f6Var.m());
                    if (!equals2) {
                    }
                    u0Var = yyVar10.k0;
                    if (u0Var != null) {
                    }
                    org.telegram.ui.Components.zc a022 = org.telegram.ui.Components.zc.a0(yyVar10);
                    uv uvVar2 = new uv(yyVar10, 27);
                    i10 = org.telegram.ui.ActionBar.g6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 12:
                yy yyVar11 = this.b;
                yyVar11.getClass();
                yyVar11.presentFragment(new j70(new Bundle()));
                break;
            case 13:
                yy.Z(this.b);
                break;
            case 14:
                yy yyVar12 = this.b;
                yyVar12.getClass();
                yyVar12.presentFragment(new org.telegram.ui.Wallet.z4());
                break;
            case 15:
                this.b.j3();
                break;
            case 16:
                yy.q0(this.b);
                break;
            case 17:
                this.b.R4();
                break;
            case 18:
                yy yyVar13 = this.b;
                org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
                k2Var.a = true;
                yyVar13.showAsSheet(new PrivacyControlActivity(11, false), k2Var);
                break;
            case 19:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 20:
                yy yyVar14 = this.b;
                ArrayList arrayList = yyVar14.I2;
                yyVar14.J2 = false;
                if (yyVar14.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
                    }
                    yyVar14.C2.w(yyVar14, arrayList2, yyVar14.B1.getFieldText(), false, yyVar14.J2, yyVar14.K2, yyVar14.L2, null);
                    break;
                }
                break;
            case 21:
                yy yyVar15 = this.b;
                org.telegram.ui.Components.g5.L(yyVar15.getParentActivity(), -1L, new gy(yyVar15), yyVar15.getResourceProvider());
                break;
            case 22:
                yy.v0(this.b);
                break;
            case 23:
                yy yyVar16 = this.b;
                yyVar16.getClass();
                if (LaunchActivity.R() != null) {
                    yyVar16.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 24:
                this.b.x4(false, true);
                break;
            case 25:
                yy yyVar17 = this.b;
                yyVar17.getClass();
                yyVar17.presentFragment(new l());
                break;
            case 26:
                yy yyVar18 = this.b;
                yyVar18.getClass();
                yyVar18.presentFragment(new FiltersSetupActivity());
                break;
            case 27:
                yy yyVar19 = this.b;
                yyVar19.getClass();
                yyVar19.presentFragment(new ThemeActivity(1));
                break;
            case 28:
                yy yyVar20 = this.b;
                yyVar20.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(yyVar20.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            default:
                this.b.getMessagesController().clearSendAsPeers();
                break;
        }
    }
}
