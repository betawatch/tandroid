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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class r30 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r30(Object obj, byte b) {
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
                vn9 vn9Var = (vn9) obj;
                vn9Var.getClass();
                yed.c.b(i == 0 ? e40.a : e40.b);
                ((s30) vn9Var.c).g(2);
                break;
            case 1:
                nk3 nk3Var = (nk3) obj;
                if (i != 0) {
                    if (i == 1 && nk3Var.f0 != null) {
                        while (true) {
                            mk3[] mk3VarArr = nk3Var.f0;
                            if (i2 >= mk3VarArr.length) {
                                break;
                            } else {
                                mk3 mk3Var = mk3VarArr[i2];
                                if (mk3Var.s == 0 && mk3Var.getVisibility() == 0) {
                                    hg3 n3 = nk3.n3(nk3Var.f0[i2]);
                                    jk3 jk3Var = nk3Var.f0[i2].a;
                                    int i4 = jk3.C3;
                                    jk3Var.C1(true, n3);
                                }
                                i2++;
                            }
                        }
                    }
                } else {
                    cf7 messagesStorage = nk3Var.getMessagesStorage();
                    messagesStorage.a.c(new xc7(messagesStorage, i3, b2));
                    break;
                }
                break;
            case 2:
                lh6 lh6Var = (lh6) obj;
                if (i != 0) {
                    ProfileActivity.p3(lh6Var.h0.getParentActivity(), false);
                    break;
                } else {
                    e21.a = !e21.a;
                    a.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", e21.a).commit();
                    c41.b0(lh6Var.h0).Q(R.raw.chats_infotip, 36, e21.a ? "Logs enabled." : "Logs disabled.").j();
                    if (e21.a) {
                        wi8.q(a.s, new StringBuilder("app start time = "));
                        try {
                            fc4.b("buildVersion = " + a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0).versionCode);
                            break;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                    }
                }
                break;
            case 3:
                xz7 xz7Var = (xz7) obj;
                if (i != 0) {
                    if (i == 1) {
                        xz7Var.x = "female";
                        xz7Var.Z[4].setText(jb6.M0(2131747302, null));
                        break;
                    }
                } else {
                    xz7Var.x = "male";
                    xz7Var.Z[4].setText(jb6.M0(2131747241, null));
                    break;
                }
                break;
            case 4:
                ((VoIPService) obj).lambda$toggleSpeakerphoneOrShowRouteSheet$89(dialogInterface, i);
                break;
            default:
                sm2 sm2Var = (sm2) obj;
                etc etcVar = (etc) sm2Var.e;
                Activity activity = (Activity) sm2Var.c;
                try {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    etcVar.b(null, null, false);
                                    break;
                                }
                            } else {
                                etcVar.a();
                                break;
                            }
                        } else {
                            sm2Var.J();
                            break;
                        }
                    } else {
                        try {
                            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                            File q0 = gm.q0(null, false);
                            if (q0 != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    a.d();
                                    intent.putExtra("output", FileProvider.c(activity, "org.telegram.messenger.beta.provider", q0));
                                    intent.addFlags(2);
                                    intent.addFlags(1);
                                } else {
                                    intent.putExtra("output", Uri.fromFile(q0));
                                }
                                sm2Var.b = q0.getAbsolutePath();
                            }
                            activity.startActivityForResult(intent, 10);
                            break;
                        } catch (Exception e2) {
                            fc4.g(e2, true);
                            return;
                        }
                    }
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
                break;
        }
    }
}
