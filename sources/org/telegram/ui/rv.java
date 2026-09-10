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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ rv(wy wyVar, int i10) {
        this.a = i10;
        this.b = wyVar;
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
        org.telegram.ui.ActionBar.w0 w0Var;
        int i10;
        ig1 ig1Var = null;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                wy wyVar = this.b;
                wyVar.getClass();
                wyVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                wy wyVar2 = this.b;
                wyVar2.A4(false, true);
                if (wyVar2.e0 != null) {
                    int i11 = 0;
                    while (true) {
                        vy[] vyVarArr = wyVar2.e0;
                        if (i11 >= vyVarArr.length) {
                            break;
                        } else {
                            if (vyVarArr[i11].getVisibility() == 0) {
                                vy vyVar = wyVar2.e0[i11];
                                if (!vyVar.d.G) {
                                    vyVar.q(false);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 3:
                wy wyVar3 = this.b;
                wyVar3.X.r.requestFocus();
                AndroidUtilities.showKeyboard(wyVar3.X.r);
                break;
            case 4:
                wy wyVar4 = this.b;
                wyVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", wyVar4.X2);
                wyVar4.presentFragment(new ei.p(bundle));
                break;
            case 5:
                wy wyVar5 = this.b;
                wyVar5.e0[0].a.requestLayout();
                qx qxVar = wyVar5.F3;
                if (qxVar != null && (qxVar.getFragment() instanceof ig1)) {
                    ig1Var = (ig1) wyVar5.F3.getFragment();
                }
                if (ig1Var != null) {
                    ig1Var.B0();
                }
                wyVar5.G3(false);
                wyVar5.S4();
                gy gyVar = wyVar5.C0;
                if (gyVar != null) {
                    gyVar.invalidate();
                    break;
                }
                break;
            case 6:
                wy wyVar6 = this.b;
                wyVar6.getClass();
                wyVar6.presentFragment(new k91(null));
                break;
            case 7:
                wy wyVar7 = this.b;
                if (!wyVar7.Y2.collapsed_in_dialogs) {
                    wyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(wyVar7.X2, true);
                    wyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                wy wyVar8 = this.b;
                if (wyVar8.Y2.collapsed_in_dialogs) {
                    wyVar8.getMessagesController().toggleCommunityCollapsedInDialogs(wyVar8.X2, false);
                    wyVar8.finishFragment();
                    break;
                }
                break;
            case 9:
                wy wyVar9 = this.b;
                wyVar9.getClass();
                wyVar9.presentFragment(new l());
                break;
            case 10:
                this.b.G4();
                break;
            case 11:
                wy wyVar10 = this.b;
                if (!wy.x4) {
                    wy.x4 = true;
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
                            w0Var = wyVar10.k0;
                            if (w0Var != null) {
                                int[] iArr = {(wyVar10.k0.getIconView().getMeasuredWidth() / 2) + r7, (wyVar10.k0.getIconView().getMeasuredHeight() / 2) + r7};
                                w0Var.getLocationInWindow(iArr);
                                int i12 = iArr[0];
                                int i13 = iArr[1];
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                            }
                            org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(wyVar10);
                            rv rvVar = new rv(wyVar10, 26);
                            i10 = org.telegram.ui.ActionBar.j6.o;
                            if (i10 == 0) {
                                if (a02 != null) {
                                    try {
                                        a02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, rvVar).j();
                                    } catch (Exception e) {
                                        FileLog.e(e);
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
                    w0Var = wyVar10.k0;
                    if (w0Var != null) {
                    }
                    org.telegram.ui.Components.wc a022 = org.telegram.ui.Components.wc.a0(wyVar10);
                    rv rvVar2 = new rv(wyVar10, 26);
                    i10 = org.telegram.ui.ActionBar.j6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 12:
                wy wyVar11 = this.b;
                wyVar11.getClass();
                wyVar11.presentFragment(new e70(new Bundle()));
                break;
            case 13:
                wy.c0(this.b);
                break;
            case 14:
                this.b.m3();
                break;
            case 15:
                wy.r0(this.b);
                break;
            case 16:
                this.b.U4();
                break;
            case 17:
                wy wyVar12 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                wyVar12.showAsSheet(new PrivacyControlActivity(11, false), n2Var);
                break;
            case 18:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 19:
                wy wyVar13 = this.b;
                ArrayList arrayList = wyVar13.I2;
                wyVar13.J2 = false;
                if (wyVar13.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
                    }
                    wyVar13.C2.v(wyVar13, arrayList2, wyVar13.B1.getFieldText(), false, wyVar13.J2, wyVar13.K2, wyVar13.L2, null);
                    break;
                }
                break;
            case 20:
                wy wyVar14 = this.b;
                org.telegram.ui.Components.d5.M(wyVar14.getParentActivity(), -1L, new ey(wyVar14), wyVar14.getResourceProvider());
                break;
            case 21:
                wy.y0(this.b);
                break;
            case 22:
                wy wyVar15 = this.b;
                wyVar15.getClass();
                if (LaunchActivity.R() != null) {
                    wyVar15.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 23:
                this.b.A4(false, true);
                break;
            case 24:
                wy wyVar16 = this.b;
                wyVar16.getClass();
                wyVar16.presentFragment(new l());
                break;
            case 25:
                wy wyVar17 = this.b;
                wyVar17.getClass();
                wyVar17.presentFragment(new FiltersSetupActivity());
                break;
            case 26:
                wy wyVar18 = this.b;
                wyVar18.getClass();
                wyVar18.presentFragment(new ThemeActivity(1));
                break;
            case 27:
                wy wyVar19 = this.b;
                wyVar19.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(wyVar19.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            case 28:
                this.b.getMessagesController().clearSendAsPeers();
                break;
            default:
                wy wyVar20 = this.b;
                gy gyVar2 = wyVar20.C0;
                if (gyVar2 == null || !gyVar2.y0) {
                    wyVar20.X.r.getText().clear();
                    AndroidUtilities.hideKeyboard(wyVar20.X.r);
                    wyVar20.X.r.clearFocus();
                    wyVar20.Y.b(false);
                    break;
                } else {
                    gyVar2.Q(false);
                    break;
                }
        }
    }
}
