// default package

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import java.io.File;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class s20 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s20(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        int i2 = 0;
        byte b2 = 2;
        int i3 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                kp9 kp9Var = (kp9) obj;
                kp9Var.getClass();
                phd.c.b(i == 0 ? f30.a : f30.b);
                ((t20) kp9Var.c).g(2);
                break;
            case 1:
                uj3 uj3Var = (uj3) obj;
                if (i != 0) {
                    if (i == 1 && uj3Var.f0 != null) {
                        while (true) {
                            tj3[] tj3VarArr = uj3Var.f0;
                            if (i2 >= tj3VarArr.length) {
                                break;
                            } else {
                                tj3 tj3Var = tj3VarArr[i2];
                                if (tj3Var.s == 0 && tj3Var.getVisibility() == 0) {
                                    of3 n3 = uj3.n3(uj3Var.f0[i2]);
                                    qj3 qj3Var = uj3Var.f0[i2].a;
                                    int i4 = qj3.C3;
                                    qj3Var.D1(true, n3);
                                }
                                i2++;
                            }
                        }
                    }
                } else {
                    kf7 messagesStorage = uj3Var.getMessagesStorage();
                    messagesStorage.a.c(new bd7(messagesStorage, i3, b2));
                    break;
                }
                break;
            case 2:
                ph6 ph6Var = (ph6) obj;
                if (i != 0) {
                    ProfileActivity.m3(ph6Var.h0.getParentActivity(), false);
                    break;
                } else {
                    f11.a = !f11.a;
                    a.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", f11.a).commit();
                    d31.b0(ph6Var.h0).Q(R.raw.chats_infotip, 36, f11.a ? "Logs enabled." : "Logs disabled.").j();
                    if (f11.a) {
                        ik8.q(a.s, new StringBuilder("app start time = "));
                        try {
                            cc4.b("buildVersion = " + a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0).versionCode);
                            break;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    }
                }
                break;
            case 3:
                b18 b18Var = (b18) obj;
                if (i != 0) {
                    if (i == 1) {
                        b18Var.x = "female";
                        b18Var.Z[4].setText(ob6.M0(2131747296, null));
                        break;
                    }
                } else {
                    b18Var.x = "male";
                    b18Var.Z[4].setText(ob6.M0(2131747235, null));
                    break;
                }
                break;
            case 4:
                ((VoIPService) obj).lambda$toggleSpeakerphoneOrShowRouteSheet$90(dialogInterface, i);
                break;
            default:
                am2 am2Var = (am2) obj;
                qvc qvcVar = (qvc) am2Var.e;
                Activity activity = (Activity) am2Var.c;
                try {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    qvcVar.b(null, null, false);
                                    break;
                                }
                            } else {
                                qvcVar.a();
                                break;
                            }
                        } else {
                            am2Var.J();
                            break;
                        }
                    } else {
                        try {
                            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                            File q0 = hl.q0(null, false);
                            if (q0 != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    a.d();
                                    intent.putExtra("output", FileProvider.c(activity, "org.telegram.messenger.beta.provider", q0));
                                    intent.addFlags(2);
                                    intent.addFlags(1);
                                } else {
                                    intent.putExtra("output", Uri.fromFile(q0));
                                }
                                am2Var.b = q0.getAbsolutePath();
                            }
                            activity.startActivityForResult(intent, 10);
                            break;
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                            return;
                        }
                    }
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
                break;
        }
    }
}
