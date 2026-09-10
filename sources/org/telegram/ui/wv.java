package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                                    syVar.y1(true, Q3);
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
                wg0 wg0Var = (wg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(wg0Var.V.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.wc.a0(wg0Var.V).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        hc.b.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                on0 on0Var = (on0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        on0Var.getClass();
                        break;
                    } else {
                        on0Var.w = "female";
                        on0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    on0Var.w = "male";
                    on0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                k91.d0((k91) this.b, i10);
                break;
        }
    }
}
