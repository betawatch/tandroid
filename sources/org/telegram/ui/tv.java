package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ tv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = 0;
        switch (this.a) {
            case 0:
                ty tyVar = (ty) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && tyVar.e0 != null) {
                        while (true) {
                            sy[] syVarArr = tyVar.e0;
                            if (i11 >= syVarArr.length) {
                                break;
                            } else {
                                sy syVar = syVarArr[i11];
                                if (syVar.s == 0 && syVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.s2 N3 = ty.N3(tyVar.e0[i11]);
                                    py pyVar = tyVar.e0[i11].a;
                                    int i12 = py.t3;
                                    pyVar.A1(true, N3);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    tyVar.getMessagesStorage().readAllDialogs(1);
                    break;
                }
                break;
            case 1:
                vg0 vg0Var = (vg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(vg0Var.V.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.ad.a0(vg0Var.V).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.q.r(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                }
                break;
            case 2:
                nn0 nn0Var = (nn0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        nn0Var.getClass();
                        break;
                    } else {
                        nn0Var.w = "female";
                        nn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    nn0Var.w = "male";
                    nn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                i91.d0((i91) this.b, i10);
                break;
        }
    }
}
