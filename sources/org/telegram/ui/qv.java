package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ qv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
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
                    if (i10 == 1 && qyVar.e0 != null) {
                        while (true) {
                            py[] pyVarArr = qyVar.e0;
                            if (i11 >= pyVarArr.length) {
                                break;
                            } else {
                                py pyVar = pyVarArr[i11];
                                if (pyVar.s == 0 && pyVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.s2 Q3 = qy.Q3(qyVar.e0[i11]);
                                    my myVar = qyVar.e0[i11].a;
                                    int i12 = my.v3;
                                    myVar.z1(true, Q3);
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
                pg0 pg0Var = (pg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(pg0Var.V.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.xc.a0(pg0Var.V).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        hg.c.u(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                gn0 gn0Var = (gn0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        gn0Var.getClass();
                        break;
                    } else {
                        gn0Var.w = "female";
                        gn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    gn0Var.w = "male";
                    gn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                z81.d0((z81) this.b, i10);
                break;
        }
    }
}
