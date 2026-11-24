// default package

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;
import org.telegram.ui.e0;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rn5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rn5(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        d dVar;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                wn5 wn5Var = (wn5) obj3;
                Runnable runnable = (Runnable) obj;
                int intValue = ((Integer) ((ArrayList) obj2).get(i)).intValue();
                if (intValue == 0) {
                    wn5Var.l();
                    break;
                } else if (intValue == 1) {
                    wn5Var.m();
                    break;
                } else if (intValue == 2) {
                    wn5Var.q();
                    break;
                } else if (intValue == 3) {
                    runnable.run();
                    break;
                } else if (intValue == 4 && (dVar = wn5Var.a) != null && dVar.getParentActivity() != null) {
                    try {
                        if (wn5Var.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                            File s0 = gm.s0(false);
                            if (s0 != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    Activity parentActivity = wn5Var.a.getParentActivity();
                                    a.d();
                                    intent.putExtra("output", FileProvider.c(parentActivity, "org.telegram.messenger.beta.provider", s0));
                                    intent.addFlags(2);
                                    intent.addFlags(1);
                                } else {
                                    intent.putExtra("output", Uri.fromFile(s0));
                                }
                                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                                intent.putExtra("android.intent.extra.durationLimit", 10);
                                wn5Var.f = s0.getAbsolutePath();
                            }
                            wn5Var.a.startActivityForResult(intent, 15);
                            break;
                        } else {
                            wn5Var.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                            break;
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                break;
            default:
                d0 d0Var = (d0) obj3;
                amb ambVar = (amb) obj2;
                e0 e0Var = (e0) obj;
                ThemeActivity themeActivity = d0Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3 && themeActivity.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                                    String M0 = jb6.M0(2131751421, "DeleteThemeTitle");
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M0;
                                    heVar.U = jb6.M0(2131751422, "DeleteThemeAlert");
                                    alertDialog$Builder.j(jb6.M0(2131751535, "Delete"), new jq9(d0Var, e0Var, ambVar, (byte) 8));
                                    alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                                    themeActivity.showDialog(heVar);
                                    TextView textView = (TextView) heVar.c(-1);
                                    if (textView != null) {
                                        anb.X(textView, cmb.p7, null);
                                        break;
                                    }
                                }
                            } else {
                                themeActivity.presentFragment(new zob(ambVar.b, ambVar, false));
                                break;
                            }
                        } else if (ambVar.r != null) {
                            String str = "https://" + themeActivity.getMessagesController().N2 + "/addtheme/" + ambVar.r.slug;
                            themeActivity.showDialog(new tca(themeActivity.getParentActivity(), null, str, false, str, false, null));
                            break;
                        } else {
                            themeActivity.getMessagesController().D4(ambVar.b, ambVar);
                            nm7.e().k(nm7.w4, ambVar.b, ambVar);
                            break;
                        }
                    } else {
                        ik.T(themeActivity, i == 1 ? 2 : 1, ambVar.b, ambVar);
                        break;
                    }
                }
                break;
        }
    }
}
