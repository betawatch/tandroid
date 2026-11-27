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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;
import org.telegram.ui.e0;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class un5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ un5(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        e eVar;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                zn5 zn5Var = (zn5) obj3;
                Runnable runnable = (Runnable) obj;
                int intValue = ((Integer) ((ArrayList) obj2).get(i)).intValue();
                if (intValue == 0) {
                    zn5Var.l();
                    break;
                } else if (intValue == 1) {
                    zn5Var.m();
                    break;
                } else if (intValue == 2) {
                    zn5Var.q();
                    break;
                } else if (intValue == 3) {
                    runnable.run();
                    break;
                } else if (intValue == 4 && (eVar = zn5Var.a) != null && eVar.getParentActivity() != null) {
                    try {
                        if (zn5Var.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                            File s0 = hl.s0(false);
                            if (s0 != null) {
                                if (Build.VERSION.SDK_INT >= 24) {
                                    Activity parentActivity = zn5Var.a.getParentActivity();
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
                                zn5Var.f = s0.getAbsolutePath();
                            }
                            zn5Var.a.startActivityForResult(intent, 15);
                            break;
                        } else {
                            zn5Var.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                            break;
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                break;
            default:
                d0 d0Var = (d0) obj3;
                ynb ynbVar = (ynb) obj2;
                e0 e0Var = (e0) obj;
                ThemeActivity themeActivity = d0Var.e;
                if (themeActivity.getParentActivity() != null) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3 && themeActivity.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                                    String M0 = ob6.M0(2131751449, "DeleteThemeTitle");
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M0;
                                    idVar.U = ob6.M0(2131751450, "DeleteThemeAlert");
                                    alertDialog$Builder.j(ob6.M0(2131751563, "Delete"), new o48((Object) d0Var, (Object) e0Var, (Object) ynbVar, (byte) 17));
                                    alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
                                    themeActivity.showDialog(idVar);
                                    TextView textView = (TextView) idVar.c(-1);
                                    if (textView != null) {
                                        yob.X(textView, aob.q7, null);
                                        break;
                                    }
                                }
                            } else {
                                themeActivity.presentFragment(new xqb(ynbVar.b, ynbVar, false));
                                break;
                            }
                        } else if (ynbVar.r != null) {
                            String str = "https://" + themeActivity.getMessagesController().N2 + "/addtheme/" + ynbVar.r.slug;
                            themeActivity.showDialog(new kea(themeActivity.getParentActivity(), null, str, false, str, false, null));
                            break;
                        } else {
                            themeActivity.getMessagesController().J4(ynbVar.b, ynbVar);
                            jn7.e().k(jn7.v4, ynbVar.b, ynbVar);
                            break;
                        }
                    } else {
                        jj.T(themeActivity, i == 1 ? 2 : 1, ynbVar.b, ynbVar);
                        break;
                    }
                }
                break;
        }
    }
}
