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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w(int i10, Object obj, Object obj2) {
        this.a = i10;
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
    public final void onClick(DialogInterface dialogInterface, int i10) {
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
                m4 m4Var = (m4) this.c;
                String str3 = (String) this.b;
                z3 z3Var = m4Var.G;
                if (m4Var.H == null || m4Var.q0[0].c.A == null) {
                    return;
                }
                if (i10 != 0) {
                    if (i10 != 1 || str3 == null) {
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
                    String lowerCase = !TextUtils.isEmpty(m4Var.q0[0].c.A.cached_page.url) ? m4Var.q0[0].c.A.cached_page.url.toLowerCase() : m4Var.q0[0].c.A.url.toLowerCase();
                    try {
                        str2 = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str2)) {
                            m4Var.V(str2, true);
                            return;
                        } else {
                            m4Var.q0[0].d.h1(z3Var == null ? 0 : 1, z3Var != null ? AndroidUtilities.dp(32.0f) : 0);
                            m4Var.m(null);
                            return;
                        }
                    }
                }
                we.e.s(m4Var.H, str3);
                return;
            case 1:
                hb hbVar = (hb) this.c;
                String str4 = (String) this.b;
                if (i10 == 0) {
                    we.e.o(hbVar.a.n.getParentActivity(), str4, true);
                    return;
                }
                if (i10 == 1) {
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
                rn rnVar = (rn) this.c;
                String str5 = (String) this.b;
                AndroidUtilities.addToClipboard(str5);
                org.telegram.ui.Components.mc.a0(rnVar).i(LocaleController.formatString(R.string.ExactTextCopied, str5)).j();
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.c;
                gy gyVar = (gy) this.b;
                int i11 = i10 == 0 ? 0 : i10 == 1 ? 1 : i10 == 2 ? 2 : 3;
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(((Long) arrayList.get(i12)).longValue(), 0, i11);
                    }
                }
                int i13 = i11;
                if (org.telegram.ui.Components.mc.a(gyVar)) {
                    org.telegram.ui.Components.mc.z(gyVar, i13, 0, null).j();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.be0 be0Var = (org.telegram.ui.Components.be0) this.c;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.b;
                be0Var.getClass();
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(be0Var.r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                return;
            case 5:
                org.telegram.ui.Components.cs0 cs0Var = (org.telegram.ui.Components.cs0) this.c;
                String str6 = (String) this.b;
                if (i10 == 0) {
                    cs0Var.a.R0(str6);
                    return;
                }
                cs0Var.getClass();
                if (i10 == 1) {
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
                e10 e10Var = (e10) this.c;
                String str7 = (String) this.b;
                if (i10 == 0) {
                    i10 i10Var = e10Var.a.v;
                    SpannableStringBuilder[] spannableStringBuilderArr = i10.o0;
                    i10Var.g(str7);
                    return;
                }
                e10Var.getClass();
                if (i10 == 1) {
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
                v40 v40Var = (v40) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                s50 s50Var = v40Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i10);
                int intValue = num.intValue();
                s50Var.u3 = num;
                s50Var.N1(true, true);
                s50Var.u3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xl(v40Var, intValue, 13));
                return;
            case 8:
                xm0 xm0Var = (xm0) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                try {
                    tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                    try {
                        tL_secureRequiredType.type = (TLRPC.SecureValueType) ((Class) arrayList3.get(i10)).newInstance();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    tL_secureRequiredType = null;
                }
                if (!xm0.v1(tL_secureRequiredType.type)) {
                    if (xm0.t1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    xm0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                xm0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 9:
                hy0.b((hy0) this.c, (Context) this.b, i10);
                return;
            case 10:
                x61 x61Var = (x61) this.c;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(x61Var.getContainer(), null));
                return;
            case 11:
                va1 va1Var = (va1) this.c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.b;
                ThemeActivity themeActivity = va1Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i10 == 0) {
                    if (f6Var.B == null) {
                        themeActivity.getMessagesController().saveThemeToServer(f6Var, null);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().linkPrefix + "/addtheme/" + f6Var.B.slug;
                    themeActivity.showDialog(new org.telegram.ui.Components.sp0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        b5Var = ((org.telegram.ui.ActionBar.n2) themeActivity).parentLayout;
                        if (b5Var != null) {
                            org.telegram.ui.ActionBar.g6.t(f6Var, true, false);
                            b5Var2 = ((org.telegram.ui.ActionBar.n2) themeActivity).parentLayout;
                            ((ActionBarLayout) b5Var2).U(true, true);
                            new ThemeEditorView().c(themeActivity.getParentActivity(), f6Var);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        themeActivity.presentFragment(new tc1(f6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.N = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    alertDialog$Builder.a.P = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new nl0(23, va1Var, f6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                    themeActivity.showDialog(b2Var);
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                        return;
                    }
                    return;
                }
                if (f6Var.b == null && f6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = org.telegram.ui.ActionBar.g6.nl;
                    for (int i14 = 0; i14 < iArr.length; i14++) {
                        sb3.append(org.telegram.ui.ActionBar.e5.i(i14));
                        sb3.append("=");
                        sb3.append(iArr[i14]);
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
                        } catch (Exception e10) {
                            e = e10;
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    try {
                        fileOutputStream.write(AndroidUtilities.getStringBytes(sb3.toString()));
                        fileOutputStream.close();
                    } catch (Exception e12) {
                        e = e12;
                        fileOutputStream2 = fileOutputStream;
                        FileLog.e(e);
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        str = f6Var.a;
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
                        } catch (Exception e13) {
                            FileLog.e(e13);
                            throw th;
                        }
                    }
                } else {
                    String str9 = f6Var.d;
                    p02 = str9 != null ? org.telegram.ui.ActionBar.g6.p0(str9) : new File(f6Var.b);
                }
                str = f6Var.a;
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
                } catch (Exception e14) {
                    FileLog.e(e14);
                    return;
                }
            case 12:
                uf.n.a((uf.n) this.c, (Integer[][]) this.b, i10);
                return;
            default:
                yf.j1 j1Var = (yf.j1) this.c;
                ArrayList arrayList4 = (ArrayList) this.b;
                SharedPreferences sharedPreferences = j1Var.g;
                ArrayList arrayList5 = j1Var.c;
                if (i10 != 0) {
                    yf.i1 i1Var = new yf.i1();
                    i1Var.a = i10 - 1;
                    i1Var.b = arrayList4;
                    arrayList5.add(i1Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb2 = "" + i1Var.a;
                    } else {
                        StringBuilder f10 = s3.c.f(string, "|");
                        f10.append(i1Var.a);
                        sb2 = f10.toString();
                    }
                    for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                        StringBuilder f11 = s3.c.f(sb2, ",");
                        f11.append(Math.round(((yf.g1) arrayList4.get(i15)).a));
                        f11.append(",");
                        f11.append(Math.round(((yf.g1) arrayList4.get(i15)).b));
                        sb2 = f11.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb4 = new StringBuilder("[");
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    yf.i1 i1Var2 = (yf.i1) arrayList5.get(i16);
                    if (i16 > 0) {
                        sb4.append(",\n");
                    }
                    sb4.append("\t{\n\t\t\"shape\": ");
                    sb4.append(i1Var2.a);
                    sb4.append(",\n\t\t\"points\": [");
                    for (int i17 = 0; i17 < i1Var2.b.size(); i17++) {
                        if (i17 > 0) {
                            sb4.append(",");
                        }
                        yf.g1 g1Var = (yf.g1) i1Var2.b.get(i17);
                        sb4.append("[");
                        sb4.append(Math.round(g1Var.a));
                        sb4.append(",");
                        sb4.append(Math.round(g1Var.b));
                        sb4.append("]");
                    }
                    sb4.append("],\n\t\t\"freq\": ");
                    sb4.append(Math.round(((i1Var2.c / j1Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb4.append("\n\t}");
                }
                sb4.append("\n]");
                Log.i("shapedetector", sb4.toString());
                return;
        }
    }
}
