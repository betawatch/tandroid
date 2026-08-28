package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0240 A[Catch: Exception -> 0x0280, TRY_LEAVE, TryCatch #0 {Exception -> 0x0280, blocks: (B:73:0x0238, B:77:0x0240, B:81:0x0289, B:80:0x0282, B:87:0x0278, B:85:0x0254), top: B:72:0x0238, inners: #6 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01ea -> B:55:0x021d). Please report as a decompilation issue!!! */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, int i9) {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        File p02;
        String str;
        File file;
        Throwable th;
        FileOutputStream fileOutputStream;
        String sb2;
        String str2 = "";
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        r13 = null;
        r13 = null;
        r13 = null;
        FileOutputStream fileOutputStream2 = null;
        switch (this.a) {
            case 0:
                l4 l4Var = (l4) this.c;
                String str3 = (String) this.b;
                y3 y3Var = l4Var.G;
                if (l4Var.H == null || l4Var.q0[0].c.A == null) {
                    return;
                }
                if (i9 != 0) {
                    if (i9 != 1 || str3 == null) {
                        return;
                    }
                    if (str3.startsWith("mailto:")) {
                        str3 = str3.substring(7);
                    } else if (str3.startsWith("tel:")) {
                        str3 = str3.substring(4);
                    }
                    AndroidUtilities.addToClipboard(str3);
                    return;
                }
                int lastIndexOf = str3.lastIndexOf(35);
                if (lastIndexOf != -1) {
                    String lowerCase = !TextUtils.isEmpty(l4Var.q0[0].c.A.cached_page.url) ? l4Var.q0[0].c.A.cached_page.url.toLowerCase() : l4Var.q0[0].c.A.url.toLowerCase();
                    try {
                        str2 = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str2)) {
                            l4Var.V(str2, true);
                            return;
                        } else {
                            l4Var.q0[0].d.h1(y3Var == null ? 0 : 1, y3Var != null ? AndroidUtilities.dp(32.0f) : 0);
                            l4Var.m(null);
                            return;
                        }
                    }
                }
                ve.e.s(l4Var.H, str3);
                return;
            case 1:
                gb gbVar = (gb) this.c;
                String str4 = (String) this.b;
                if (i9 == 0) {
                    ve.e.o(gbVar.a.n.getParentActivity(), str4, true);
                    return;
                }
                if (i9 == 1) {
                    if (str4.startsWith("mailto:")) {
                        str4 = str4.substring(7);
                    } else if (str4.startsWith("tel:")) {
                        str4 = str4.substring(4);
                    }
                    AndroidUtilities.addToClipboard(str4);
                    return;
                }
                return;
            case 2:
                qn qnVar = (qn) this.c;
                String str5 = (String) this.b;
                AndroidUtilities.addToClipboard(str5);
                org.telegram.ui.Components.oc.a0(qnVar).i(LocaleController.formatString(R.string.ExactTextCopied, str5)).j();
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.c;
                dy dyVar = (dy) this.b;
                int i10 = i9 == 0 ? 0 : i9 == 1 ? 1 : i9 == 2 ? 2 : 3;
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(((Long) arrayList.get(i11)).longValue(), 0, i10);
                    }
                }
                int i12 = i10;
                if (org.telegram.ui.Components.oc.a(dyVar)) {
                    org.telegram.ui.Components.oc.z(dyVar, i12, 0, null).j();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.wd0 wd0Var = (org.telegram.ui.Components.wd0) this.c;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.b;
                wd0Var.getClass();
                if (i9 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(wd0Var.r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            case 5:
                org.telegram.ui.Components.bs0 bs0Var = (org.telegram.ui.Components.bs0) this.c;
                String str6 = (String) this.b;
                if (i9 == 0) {
                    bs0Var.a.R0(str6);
                    return;
                }
                bs0Var.getClass();
                if (i9 == 1) {
                    if (str6.startsWith("mailto:")) {
                        str6 = str6.substring(7);
                    } else if (str6.startsWith("tel:")) {
                        str6 = str6.substring(4);
                    }
                    AndroidUtilities.addToClipboard(str6);
                    return;
                }
                return;
            case 6:
                b10 b10Var = (b10) this.c;
                String str7 = (String) this.b;
                if (i9 == 0) {
                    f10 f10Var = b10Var.a.v;
                    SpannableStringBuilder[] spannableStringBuilderArr = f10.o0;
                    f10Var.g(str7);
                    return;
                }
                b10Var.getClass();
                if (i9 == 1) {
                    if (str7.startsWith("mailto:")) {
                        str7 = str7.substring(7);
                    } else if (str7.startsWith("tel:")) {
                        str7 = str7.substring(4);
                    }
                    AndroidUtilities.addToClipboard(str7);
                    return;
                }
                return;
            case 7:
                r40 r40Var = (r40) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                o50 o50Var = r40Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i9);
                int intValue = num.intValue();
                o50Var.u3 = num;
                o50Var.N1(true, true);
                o50Var.u3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qd(r40Var, intValue, 14));
                return;
            case 8:
                wm0 wm0Var = (wm0) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                try {
                    tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                    try {
                        tL_secureRequiredType.type = (TLRPC.SecureValueType) ((Class) arrayList3.get(i9)).newInstance();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    tL_secureRequiredType = null;
                }
                if (!wm0.v1(tL_secureRequiredType.type)) {
                    if (wm0.t1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    wm0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                wm0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 9:
                hy0.b((hy0) this.c, (Context) this.b, i9);
                return;
            case 10:
                y61 y61Var = (y61) this.c;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                org.telegram.messenger.ll.o(R.string.TextCopied, new org.telegram.ui.Components.oc(y61Var.getContainer(), null));
                return;
            case 11:
                xa1 xa1Var = (xa1) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.b;
                ThemeActivity themeActivity = xa1Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i9 == 0) {
                    if (e6Var.B == null) {
                        themeActivity.getMessagesController().saveThemeToServer(e6Var, null);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, e6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().linkPrefix + "/addtheme/" + e6Var.B.slug;
                    themeActivity.showDialog(new org.telegram.ui.Components.rp0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i9 != 1) {
                    if (i9 == 2) {
                        b5Var = ((org.telegram.ui.ActionBar.o2) themeActivity).parentLayout;
                        if (b5Var != null) {
                            org.telegram.ui.ActionBar.f6.t(e6Var, true, false);
                            b5Var2 = ((org.telegram.ui.ActionBar.o2) themeActivity).parentLayout;
                            ((ActionBarLayout) b5Var2).U(true, true);
                            new ThemeEditorView().c(themeActivity.getParentActivity(), e6Var);
                            return;
                        }
                        return;
                    }
                    if (i9 == 3) {
                        themeActivity.presentFragment(new tc1(e6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.N = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    alertDialog$Builder.a.P = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new nl0(23, xa1Var, e6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    themeActivity.showDialog(c2Var);
                    TextView textView = (TextView) c2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                        return;
                    }
                    return;
                }
                if (e6Var.b == null && e6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = org.telegram.ui.ActionBar.f6.nl;
                    for (int i13 = 0; i13 < iArr.length; i13++) {
                        sb3.append(org.telegram.ui.ActionBar.e5.i(i13));
                        sb3.append("=");
                        sb3.append(iArr[i13]);
                        sb3.append("\n");
                    }
                    p02 = new File(ApplicationLoader.getFilesDirFixed(), "default_theme.attheme");
                    try {
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(p02);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                    try {
                        fileOutputStream.write(AndroidUtilities.getStringBytes(sb3.toString()));
                        fileOutputStream.close();
                    } catch (Exception e13) {
                        e = e13;
                        fileOutputStream2 = fileOutputStream;
                        FileLog.e(e);
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        str = e6Var.a;
                        if (!str.endsWith(".attheme")) {
                        }
                        file = new File(FileLoader.getDirectory(4), FileLoader.fixFileName(str));
                        if (AndroidUtilities.copyFile(p02, file)) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream2.close();
                            throw th;
                        } catch (Exception e14) {
                            FileLog.e(e14);
                            throw th;
                        }
                    }
                } else {
                    String str9 = e6Var.d;
                    p02 = str9 != null ? org.telegram.ui.ActionBar.f6.p0(str9) : new File(e6Var.b);
                }
                str = e6Var.a;
                if (!str.endsWith(".attheme")) {
                    str = str.concat(".attheme");
                }
                file = new File(FileLoader.getDirectory(4), FileLoader.fixFileName(str));
                try {
                    if (AndroidUtilities.copyFile(p02, file)) {
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/xml");
                    if (Build.VERSION.SDK_INT >= 24) {
                        try {
                            intent.putExtra("android.intent.extra.STREAM", FileProvider.d(themeActivity.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file));
                            intent.setFlags(1);
                        } catch (Exception unused4) {
                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                        }
                    } else {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    }
                    themeActivity.startActivityForResult(Intent.createChooser(intent, LocaleController.getString("ShareFile", R.string.ShareFile)), 500);
                    return;
                } catch (Exception e15) {
                    FileLog.e(e15);
                    return;
                }
            case 12:
                tf.n.a((tf.n) this.c, (Integer[][]) this.b, i9);
                return;
            default:
                xf.k1 k1Var = (xf.k1) this.c;
                ArrayList arrayList4 = (ArrayList) this.b;
                SharedPreferences sharedPreferences = k1Var.g;
                ArrayList arrayList5 = k1Var.c;
                if (i9 != 0) {
                    xf.j1 j1Var = new xf.j1();
                    j1Var.a = i9 - 1;
                    j1Var.b = arrayList4;
                    arrayList5.add(j1Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb2 = "" + j1Var.a;
                    } else {
                        StringBuilder e16 = ta.b.e(string, "|");
                        e16.append(j1Var.a);
                        sb2 = e16.toString();
                    }
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        StringBuilder e17 = ta.b.e(sb2, ",");
                        e17.append(Math.round(((xf.h1) arrayList4.get(i14)).a));
                        e17.append(",");
                        e17.append(Math.round(((xf.h1) arrayList4.get(i14)).b));
                        sb2 = e17.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb4 = new StringBuilder("[");
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    xf.j1 j1Var2 = (xf.j1) arrayList5.get(i15);
                    if (i15 > 0) {
                        sb4.append(",\n");
                    }
                    sb4.append("\t{\n\t\t\"shape\": ");
                    sb4.append(j1Var2.a);
                    sb4.append(",\n\t\t\"points\": [");
                    for (int i16 = 0; i16 < j1Var2.b.size(); i16++) {
                        if (i16 > 0) {
                            sb4.append(",");
                        }
                        xf.h1 h1Var = (xf.h1) j1Var2.b.get(i16);
                        sb4.append("[");
                        sb4.append(Math.round(h1Var.a));
                        sb4.append(",");
                        sb4.append(Math.round(h1Var.b));
                        sb4.append("]");
                    }
                    sb4.append("],\n\t\t\"freq\": ");
                    sb4.append(Math.round(((j1Var2.c / k1Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb4.append("\n\t}");
                }
                sb4.append("\n]");
                Log.i("shapedetector", sb4.toString());
                return;
        }
    }
}
