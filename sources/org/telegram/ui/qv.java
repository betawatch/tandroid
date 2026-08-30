package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                oy oyVar = (oy) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && oyVar.b0 != null) {
                        while (true) {
                            ny[] nyVarArr = oyVar.b0;
                            if (i11 >= nyVarArr.length) {
                                break;
                            } else {
                                ny nyVar = nyVarArr[i11];
                                if (nyVar.s == 0 && nyVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.r2 Q3 = oy.Q3(oyVar.b0[i11]);
                                    ky kyVar = oyVar.b0[i11].a;
                                    int i12 = ky.s3;
                                    kyVar.z1(true, Q3);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    oyVar.getMessagesStorage().readAllDialogs(1);
                    break;
                }
                break;
            case 1:
                mg0 mg0Var = (mg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(mg0Var.S.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.qc.a0(mg0Var.S).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        kh.a2.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                dn0 dn0Var = (dn0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        dn0Var.getClass();
                        break;
                    } else {
                        dn0Var.w = "female";
                        dn0Var.V[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    dn0Var.w = "male";
                    dn0Var.V[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                o81.c0((o81) this.b, i10);
                break;
        }
    }
}
