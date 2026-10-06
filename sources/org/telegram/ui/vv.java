package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ vv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = 0;
        switch (this.a) {
            case 0:
                uy uyVar = (uy) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && uyVar.e0 != null) {
                        while (true) {
                            ty[] tyVarArr = uyVar.e0;
                            if (i11 >= tyVarArr.length) {
                                break;
                            } else {
                                ty tyVar = tyVarArr[i11];
                                if (tyVar.s == 0 && tyVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.s2 Z3 = uy.Z3(uyVar.e0[i11]);
                                    qy qyVar = uyVar.e0[i11].a;
                                    int i12 = qy.C3;
                                    qyVar.A1(true, Z3);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    uyVar.getMessagesStorage().readAllDialogs(1);
                    break;
                }
                break;
            case 1:
                tg0 tg0Var = (tg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(tg0Var.V.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.yc.a0(tg0Var.V).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
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
                kn0 kn0Var = (kn0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        kn0Var.getClass();
                        break;
                    } else {
                        kn0Var.w = "female";
                        kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    kn0Var.w = "male";
                    kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                y81.Z((y81) this.b, i10);
                break;
        }
    }
}
