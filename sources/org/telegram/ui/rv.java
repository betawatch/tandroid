package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ry ryVar = (ry) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && ryVar.e0 != null) {
                        while (true) {
                            qy[] qyVarArr = ryVar.e0;
                            if (i11 >= qyVarArr.length) {
                                break;
                            } else {
                                qy qyVar = qyVarArr[i11];
                                if (qyVar.s == 0 && qyVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.r2 Q3 = ry.Q3(ryVar.e0[i11]);
                                    ny nyVar = ryVar.e0[i11].a;
                                    int i12 = ny.v3;
                                    nyVar.z1(true, Q3);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    ryVar.getMessagesStorage().readAllDialogs(1);
                    break;
                }
                break;
            case 1:
                qg0 qg0Var = (qg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(qg0Var.V.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.xc.a0(qg0Var.V).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        hg.c.w(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                in0 in0Var = (in0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        in0Var.getClass();
                        break;
                    } else {
                        in0Var.w = "female";
                        in0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    in0Var.w = "male";
                    in0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                x81.d0((x81) this.b, i10);
                break;
        }
    }
}
