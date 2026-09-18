package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ wv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = 0;
        switch (this.a) {
            case 0:
                wy wyVar = (wy) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && wyVar.e0 != null) {
                        while (true) {
                            vy[] vyVarArr = wyVar.e0;
                            if (i11 >= vyVarArr.length) {
                                break;
                            } else {
                                vy vyVar = vyVarArr[i11];
                                if (vyVar.s == 0 && vyVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.r2 Q3 = wy.Q3(wyVar.e0[i11]);
                                    sy syVar = wyVar.e0[i11].a;
                                    int i12 = sy.v3;
                                    syVar.A1(true, Q3);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    wyVar.getMessagesStorage().readAllDialogs(1);
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
                    org.telegram.ui.Components.vc.a0(xg0Var.V).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        hg.k0.w(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                qn0 qn0Var = (qn0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        qn0Var.getClass();
                        break;
                    } else {
                        qn0Var.w = "female";
                        qn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    qn0Var.w = "male";
                    qn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                g91.d0((g91) this.b, i10);
                break;
        }
    }
}
