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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class r20 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r20(Object obj, byte b) {
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
                vl9 vl9Var = (vl9) obj;
                vl9Var.getClass();
                wcd.c.b(i == 0 ? e30.a : e30.b);
                ((s20) vl9Var.c).g(2);
                break;
            case 1:
                cj3 cj3Var = (cj3) obj;
                if (i != 0) {
                    if (i == 1 && cj3Var.f0 != null) {
                        while (true) {
                            bj3[] bj3VarArr = cj3Var.f0;
                            if (i2 >= bj3VarArr.length) {
                                break;
                            } else {
                                bj3 bj3Var = bj3VarArr[i2];
                                if (bj3Var.s == 0 && bj3Var.getVisibility() == 0) {
                                    ue3 l3 = cj3.l3(cj3Var.f0[i2]);
                                    yi3 yi3Var = cj3Var.f0[i2].a;
                                    int i4 = yi3.C3;
                                    yi3Var.C1(true, l3);
                                }
                                i2++;
                            }
                        }
                    }
                } else {
                    ad7 messagesStorage = cj3Var.getMessagesStorage();
                    messagesStorage.a.c(new wa7(messagesStorage, i3, b2));
                    break;
                }
                break;
            case 2:
                lf6 lf6Var = (lf6) obj;
                if (i != 0) {
                    ProfileActivity.l3(lf6Var.h0.getParentActivity(), false);
                    break;
                } else {
                    w01.a = !w01.a;
                    a.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", w01.a).commit();
                    u21.b0(lf6Var.h0).Q(R.raw.chats_infotip, 36, w01.a ? "Logs enabled." : "Logs disabled.").j();
                    if (w01.a) {
                        ug8.q(a.s, new StringBuilder("app start time = "));
                        try {
                            fa4.b("buildVersion = " + a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0).versionCode);
                            break;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    }
                }
                break;
            case 3:
                vx7 vx7Var = (vx7) obj;
                if (i != 0) {
                    if (i == 1) {
                        vx7Var.x = "female";
                        vx7Var.Z[4].setText(k96.M0(2131747376, null));
                        break;
                    }
                } else {
                    vx7Var.x = "male";
                    vx7Var.Z[4].setText(k96.M0(2131747315, null));
                    break;
                }
                break;
            case 4:
                ((VoIPService) obj).lambda$toggleSpeakerphoneOrShowRouteSheet$89(dialogInterface, i);
                break;
            default:
                gl2 gl2Var = (gl2) obj;
                crc crcVar = (crc) gl2Var.e;
                Activity activity = (Activity) gl2Var.c;
                try {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    crcVar.b(null, null, false);
                                    break;
                                }
                            } else {
                                crcVar.a();
                                break;
                            }
                        } else {
                            gl2Var.K();
                            break;
                        }
                    } else {
                        try {
                            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                            File q0 = gl.q0(null, false);
                            if (q0 != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    a.d();
                                    intent.putExtra("output", FileProvider.c(activity, "org.telegram.messenger.beta.provider", q0));
                                    intent.addFlags(2);
                                    intent.addFlags(1);
                                } else {
                                    intent.putExtra("output", Uri.fromFile(q0));
                                }
                                gl2Var.b = q0.getAbsolutePath();
                            }
                            activity.startActivityForResult(intent, 10);
                            break;
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                            return;
                        }
                    }
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                break;
        }
    }
}
