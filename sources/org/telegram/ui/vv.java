package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                                    org.telegram.ui.Cells.s2 Q3 = uy.Q3(uyVar.e0[i11]);
                                    qy qyVar = uyVar.e0[i11].a;
                                    int i12 = qy.v3;
                                    qyVar.A1(true, Q3);
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
                xg0 xg0Var = (xg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(xg0Var.V.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.xc.a0(xg0Var.V).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        hg.k0.u(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
