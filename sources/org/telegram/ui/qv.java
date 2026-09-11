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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ qv(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0235  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.v0 v0Var;
        int i10;
        eg1 eg1Var = null;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                uy uyVar = this.b;
                uyVar.getClass();
                uyVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                uy uyVar2 = this.b;
                uyVar2.A4(false, true);
                if (uyVar2.e0 != null) {
                    int i11 = 0;
                    while (true) {
                        ty[] tyVarArr = uyVar2.e0;
                        if (i11 >= tyVarArr.length) {
                            break;
                        } else {
                            if (tyVarArr[i11].getVisibility() == 0) {
                                ty tyVar = uyVar2.e0[i11];
                                if (!tyVar.d.G) {
                                    tyVar.q(false);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 3:
                uy uyVar3 = this.b;
                uyVar3.X.r.requestFocus();
                AndroidUtilities.showKeyboard(uyVar3.X.r);
                break;
            case 4:
                uy uyVar4 = this.b;
                uyVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", uyVar4.X2);
                uyVar4.presentFragment(new gi.p(bundle));
                break;
            case 5:
                uy uyVar5 = this.b;
                uyVar5.e0[0].a.requestLayout();
                ox oxVar = uyVar5.F3;
                if (oxVar != null && (oxVar.getFragment() instanceof eg1)) {
                    eg1Var = (eg1) uyVar5.F3.getFragment();
                }
                if (eg1Var != null) {
                    eg1Var.B0();
                }
                uyVar5.G3(false);
                uyVar5.S4();
                ey eyVar = uyVar5.C0;
                if (eyVar != null) {
                    eyVar.invalidate();
                    break;
                }
                break;
            case 6:
                uy uyVar6 = this.b;
                uyVar6.getClass();
                uyVar6.presentFragment(new i91(null));
                break;
            case 7:
                uy uyVar7 = this.b;
                if (!uyVar7.Y2.collapsed_in_dialogs) {
                    uyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(uyVar7.X2, true);
                    uyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                uy uyVar8 = this.b;
                if (uyVar8.Y2.collapsed_in_dialogs) {
                    uyVar8.getMessagesController().toggleCommunityCollapsedInDialogs(uyVar8.X2, false);
                    uyVar8.finishFragment();
                    break;
                }
                break;
            case 9:
                uy uyVar9 = this.b;
                uyVar9.getClass();
                uyVar9.presentFragment(new l());
                break;
            case 10:
                this.b.G4();
                break;
            case 11:
                uy uyVar10 = this.b;
                if (!uy.x4) {
                    uy.x4 = true;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.j6.N0(string) == null || org.telegram.ui.ActionBar.j6.N0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.j6.N0(string2) == null || !org.telegram.ui.ActionBar.j6.N0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
                    if (string.equals(string2)) {
                        if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                            str2 = string2;
                            boolean equals = str.equals(i6Var.m());
                            org.telegram.ui.ActionBar.i6 N0 = !equals ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str);
                            v0Var = uyVar10.k0;
                            if (v0Var != null) {
                                int[] iArr = {(uyVar10.k0.getIconView().getMeasuredWidth() / 2) + r7, (uyVar10.k0.getIconView().getMeasuredHeight() / 2) + r7};
                                v0Var.getLocationInWindow(iArr);
                                int i12 = iArr[0];
                                int i13 = iArr[1];
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                            }
                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(uyVar10);
                            qv qvVar = new qv(uyVar10, 26);
                            i10 = org.telegram.ui.ActionBar.j6.o;
                            if (i10 == 0) {
                                if (a02 != null) {
                                    try {
                                        a02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, qvVar).j();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                }
                                org.telegram.ui.ActionBar.j6.o = 0;
                                org.telegram.ui.ActionBar.j6.q1();
                                org.telegram.ui.ActionBar.j6.A();
                                break;
                            }
                        }
                    } else {
                        str2 = string2;
                    }
                    str = string;
                    boolean equals2 = str.equals(i6Var.m());
                    if (!equals2) {
                    }
                    v0Var = uyVar10.k0;
                    if (v0Var != null) {
                    }
                    org.telegram.ui.Components.yc a022 = org.telegram.ui.Components.yc.a0(uyVar10);
                    qv qvVar2 = new qv(uyVar10, 26);
                    i10 = org.telegram.ui.ActionBar.j6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 12:
                uy uyVar11 = this.b;
                uyVar11.getClass();
                uyVar11.presentFragment(new f70(new Bundle()));
                break;
            case 13:
                uy.c0(this.b);
                break;
            case 14:
                this.b.m3();
                break;
            case 15:
                uy.r0(this.b);
                break;
            case 16:
                this.b.U4();
                break;
            case 17:
                uy uyVar12 = this.b;
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                uyVar12.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
                break;
            case 18:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 19:
                uy uyVar13 = this.b;
                ArrayList arrayList = uyVar13.I2;
                uyVar13.J2 = false;
                if (uyVar13.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
                    }
                    uyVar13.C2.u(uyVar13, arrayList2, uyVar13.B1.getFieldText(), false, uyVar13.J2, uyVar13.K2, uyVar13.L2, null);
                    break;
                }
                break;
            case 20:
                uy uyVar14 = this.b;
                org.telegram.ui.Components.e5.M(uyVar14.getParentActivity(), -1L, new cy(uyVar14), uyVar14.getResourceProvider());
                break;
            case 21:
                uy.y0(this.b);
                break;
            case 22:
                uy uyVar15 = this.b;
                uyVar15.getClass();
                if (LaunchActivity.R() != null) {
                    uyVar15.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 23:
                this.b.A4(false, true);
                break;
            case 24:
                uy uyVar16 = this.b;
                uyVar16.getClass();
                uyVar16.presentFragment(new l());
                break;
            case 25:
                uy uyVar17 = this.b;
                uyVar17.getClass();
                uyVar17.presentFragment(new FiltersSetupActivity());
                break;
            case 26:
                uy uyVar18 = this.b;
                uyVar18.getClass();
                uyVar18.presentFragment(new ThemeActivity(1));
                break;
            case 27:
                uy uyVar19 = this.b;
                uyVar19.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(uyVar19.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            case 28:
                this.b.getMessagesController().clearSendAsPeers();
                break;
            default:
                uy uyVar20 = this.b;
                ey eyVar2 = uyVar20.C0;
                if (eyVar2 == null || !eyVar2.y0) {
                    uyVar20.X.r.getText().clear();
                    AndroidUtilities.hideKeyboard(uyVar20.X.r);
                    uyVar20.X.r.clearFocus();
                    uyVar20.Y.b(false);
                    break;
                } else {
                    eyVar2.Q(false);
                    break;
                }
        }
    }
}
