package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                                    org.telegram.ui.Cells.r2 Q3 = uy.Q3(uyVar.e0[i11]);
                                    qy qyVar = uyVar.e0[i11].a;
                                    int i12 = qy.v3;
                                    qyVar.y1(true, Q3);
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
                vg0 vg0Var = (vg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(vg0Var.V.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.yc.a0(vg0Var.V).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        i2.g.w(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                pn0 pn0Var = (pn0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        pn0Var.getClass();
                        break;
                    } else {
                        pn0Var.w = "female";
                        pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    pn0Var.w = "male";
                    pn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                i91.d0((i91) this.b, i10);
                break;
        }
    }
}
