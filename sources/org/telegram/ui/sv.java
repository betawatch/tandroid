package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ sv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = 0;
        switch (this.a) {
            case 0:
                qy qyVar = (qy) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && qyVar.b0 != null) {
                        while (true) {
                            py[] pyVarArr = qyVar.b0;
                            if (i11 >= pyVarArr.length) {
                                break;
                            } else {
                                py pyVar = pyVarArr[i11];
                                if (pyVar.s == 0 && pyVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.q2 Q3 = qy.Q3(qyVar.b0[i11]);
                                    my myVar = qyVar.b0[i11].a;
                                    int i12 = my.s3;
                                    myVar.y1(true, Q3);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    qyVar.getMessagesStorage().readAllDialogs(1);
                    break;
                }
                break;
            case 1:
                og0 og0Var = (og0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(og0Var.S.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.qc.a0(og0Var.S).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        kf.k0.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
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
                w81.c0((w81) this.b, i10);
                break;
        }
    }
}
