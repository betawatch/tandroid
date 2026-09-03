package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ rv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = 0;
        switch (this.a) {
            case 0:
                py pyVar = (py) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && pyVar.b0 != null) {
                        while (true) {
                            oy[] oyVarArr = pyVar.b0;
                            if (i11 >= oyVarArr.length) {
                                break;
                            } else {
                                oy oyVar = oyVarArr[i11];
                                if (oyVar.s == 0 && oyVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.r2 Q3 = py.Q3(pyVar.b0[i11]);
                                    ly lyVar = pyVar.b0[i11].a;
                                    int i12 = ly.s3;
                                    lyVar.y1(true, Q3);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    pyVar.getMessagesStorage().readAllDialogs(1);
                    break;
                }
                break;
            case 1:
                ng0 ng0Var = (ng0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(ng0Var.S.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.qc.a0(ng0Var.S).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        l.d.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                            break;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            return;
                        }
                    }
                }
                break;
            case 2:
                fn0 fn0Var = (fn0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        fn0Var.getClass();
                        break;
                    } else {
                        fn0Var.w = "female";
                        fn0Var.V[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    fn0Var.w = "male";
                    fn0Var.V[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                v81.c0((v81) this.b, i10);
                break;
        }
    }
}
