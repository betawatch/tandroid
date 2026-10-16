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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yy b;

    public /* synthetic */ uv(yy yyVar, int i10) {
        this.a = i10;
        this.b = yyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0251  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.u0 u0Var;
        int i10;
        kg1 kg1Var = null;
        int i11 = 0;
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
                yyVar2.y4(false, true);
                if (yyVar2.e0 != null) {
                    int i12 = 0;
                    while (true) {
                        xy[] xyVarArr = yyVar2.e0;
                        if (i12 >= xyVarArr.length) {
                            break;
                        } else {
                            if (xyVarArr[i12].getVisibility() == 0) {
                                xy xyVar = yyVar2.e0[i12];
                                if (!xyVar.d.G) {
                                    xyVar.q(false);
                                }
                            }
                            i12++;
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
                bundle.putLong("community_id", yyVar4.Y2);
                yyVar4.presentFragment(new gi.p(bundle));
                break;
            case 5:
                yy yyVar5 = this.b;
                yyVar5.e0[0].a.requestLayout();
                sx sxVar = yyVar5.G3;
                if (sxVar != null && (sxVar.getFragment() instanceof kg1)) {
                    kg1Var = (kg1) yyVar5.G3.getFragment();
                }
                if (kg1Var != null) {
                    kg1Var.B0();
                }
                yyVar5.E3(false);
                yyVar5.Q4();
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
                if (!yyVar7.Z2.collapsed_in_dialogs) {
                    yyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(yyVar7.Y2, true);
                    yyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                yy yyVar8 = this.b;
                if (yyVar8.Z2.collapsed_in_dialogs) {
                    yyVar8.getMessagesController().toggleCommunityCollapsedInDialogs(yyVar8.Y2, false);
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
                this.b.E4();
                break;
            case 11:
                yy yyVar10 = this.b;
                if (!yy.x4) {
                    yy.x4 = true;
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
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean equals = str.equals(f6Var.m());
                        org.telegram.ui.ActionBar.f6 O0 = !equals ? org.telegram.ui.ActionBar.g6.O0(str2) : org.telegram.ui.ActionBar.g6.O0(str);
                        u0Var = yyVar10.k0;
                        if (u0Var != null) {
                            int[] iArr = {(yyVar10.k0.getIconView().getMeasuredWidth() / 2) + r7, (yyVar10.k0.getIconView().getMeasuredHeight() / 2) + r7};
                            u0Var.getLocationInWindow(iArr);
                            int i13 = iArr[0];
                            int i14 = iArr[1];
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        org.telegram.ui.Components.zc a02 = org.telegram.ui.Components.zc.a0(yyVar10);
                        uv uvVar = new uv(yyVar10, 26);
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
                    str = string;
                    boolean equals2 = str.equals(f6Var.m());
                    if (!equals2) {
                    }
                    u0Var = yyVar10.k0;
                    if (u0Var != null) {
                    }
                    org.telegram.ui.Components.zc a022 = org.telegram.ui.Components.zc.a0(yyVar10);
                    uv uvVar2 = new uv(yyVar10, 26);
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
                yy.c0(this.b);
                break;
            case 14:
                yy yyVar12 = this.b;
                yyVar12.getClass();
                yyVar12.presentFragment(new org.telegram.ui.Wallet.a5());
                break;
            case 15:
                this.b.j3();
                break;
            case 16:
                yy.q0(this.b);
                break;
            case 17:
                this.b.S4();
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
                yyVar14.M2 = true;
                if (yyVar14.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i11 < arrayList.size()) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    yyVar14.C2.w(yyVar14, arrayList2, yyVar14.B1.getFieldText(), false, yyVar14.J2, yyVar14.K2, yyVar14.L2, null);
                    break;
                }
                break;
            case 21:
                yy yyVar15 = this.b;
                ArrayList arrayList3 = yyVar15.I2;
                yyVar15.J2 = false;
                yyVar15.M2 = false;
                if (yyVar15.C2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i11 < arrayList3.size()) {
                        arrayList4.add(MessagesStorage.TopicKey.of(((Long) arrayList3.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    yyVar15.C2.w(yyVar15, arrayList4, yyVar15.B1.getFieldText(), false, yyVar15.J2, yyVar15.K2, yyVar15.L2, null);
                    break;
                }
                break;
            case 22:
                yy.u0(this.b);
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
                this.b.y4(false, true);
                break;
            case 25:
                yy yyVar17 = this.b;
                yyVar17.getClass();
                yyVar17.presentFragment(new l());
                break;
            case 26:
                yy yyVar18 = this.b;
                yyVar18.getClass();
                yyVar18.presentFragment(new ThemeActivity(1));
                break;
            case 27:
                yy yyVar19 = this.b;
                yyVar19.getClass();
                yyVar19.presentFragment(new FiltersSetupActivity());
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
