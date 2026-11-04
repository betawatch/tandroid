package org.telegram.ui;

import android.app.Activity;
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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023b A[Catch: Exception -> 0x027a, TRY_LEAVE, TryCatch #5 {Exception -> 0x027a, blocks: (B:73:0x0233, B:77:0x023b, B:81:0x0283, B:80:0x027c, B:87:0x0272, B:85:0x024d), top: B:72:0x0233, inners: #12 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01e7 -> B:55:0x021a). Please report as a decompilation issue!!! */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(DialogInterface dialogInterface, int i3) {
        String str;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        File q02;
        String str2;
        File file;
        Throwable th2;
        FileOutputStream fileOutputStream;
        String sb2;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        r10 = null;
        r10 = null;
        r10 = null;
        FileOutputStream fileOutputStream2 = null;
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.c;
                String str3 = (String) this.b;
                u3 u3Var = i4Var.L;
                if (i4Var.M == null || i4Var.v0[0].c.F == null) {
                    return;
                }
                if (i3 != 0) {
                    if (i3 != 1 || str3 == null) {
                        return;
                    }
                    if (str3.startsWith("mailto:")) {
                        str3 = str3.substring(7);
                    } else if (str3.startsWith("tel:")) {
                        str3 = str3.substring(4);
                    }
                    org.telegram.messenger.g0.g(str3);
                    return;
                }
                int lastIndexOf = str3.lastIndexOf(35);
                if (lastIndexOf != -1) {
                    String lowerCase = !TextUtils.isEmpty(i4Var.v0[0].c.F.cached_page.url) ? i4Var.v0[0].c.F.cached_page.url.toLowerCase() : i4Var.v0[0].c.F.url.toLowerCase();
                    try {
                        str = URLDecoder.decode(str3.substring(lastIndexOf + 1), "UTF-8");
                    } catch (Exception unused) {
                        str = "";
                    }
                    if (str3.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(str)) {
                            i4Var.T(str, true);
                            return;
                        } else {
                            i4Var.v0[0].d.h1(u3Var == null ? 0 : 1, u3Var != null ? org.telegram.messenger.g0.L(32.0f) : 0);
                            i4Var.k(null);
                            return;
                        }
                    }
                }
                sf.c.t(i4Var.M, str3);
                return;
            case 1:
                cb cbVar = (cb) this.c;
                String str4 = (String) this.b;
                if (i3 == 0) {
                    sf.c.p(cbVar.a.n.getParentActivity(), str4, true);
                    return;
                }
                if (i3 == 1) {
                    if (str4.startsWith("mailto:")) {
                        str4 = str4.substring(7);
                    } else if (str4.startsWith("tel:")) {
                        str4 = str4.substring(4);
                    }
                    org.telegram.messenger.g0.g(str4);
                    return;
                }
                return;
            case 2:
                wm wmVar = (wm) this.c;
                String str5 = (String) this.b;
                org.telegram.messenger.g0.g(str5);
                org.telegram.ui.Components.fc.a0(wmVar).i(org.telegram.messenger.bd.a0(null, null, 2131750885, str5)).j();
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.c;
                uw uwVar = (uw) this.b;
                int i10 = i3 == 0 ? 0 : i3 == 1 ? 1 : i3 == 2 ? 2 : 3;
                if (arrayList != null) {
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        org.telegram.messenger.us.t(org.telegram.messenger.h10.t0).T(((Long) arrayList.get(i11)).longValue(), i10, 0);
                    }
                }
                if (org.telegram.ui.Components.fc.a(uwVar)) {
                    org.telegram.ui.Components.fc.z(uwVar, i10, 0, null).j();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.vc0 vc0Var = (org.telegram.ui.Components.vc0) this.c;
                org.telegram.messenger.f0 f0Var = (org.telegram.messenger.f0) this.b;
                if (i3 == 0) {
                    try {
                        ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", f0Var.c(false)));
                        if (org.telegram.messenger.g0.I3()) {
                            Toast.makeText(vc0Var.q1.getParentActivity(), org.telegram.messenger.bd.M0(2131744204, null), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        return;
                    }
                }
                return;
            case 5:
                org.telegram.ui.Components.ar0 ar0Var = (org.telegram.ui.Components.ar0) this.c;
                String str6 = (String) this.b;
                if (i3 == 0) {
                    ar0Var.a.b1(str6);
                    return;
                }
                ar0Var.getClass();
                if (i3 == 1) {
                    if (str6.startsWith("mailto:")) {
                        str6 = str6.substring(7);
                    } else if (str6.startsWith("tel:")) {
                        str6 = str6.substring(4);
                    }
                    org.telegram.messenger.g0.g(str6);
                    return;
                }
                return;
            case 6:
                sz szVar = (sz) this.c;
                String str7 = (String) this.b;
                if (i3 == 0) {
                    wz wzVar = szVar.a.w;
                    SpannableStringBuilder[] spannableStringBuilderArr = wz.t0;
                    wzVar.g(str7);
                    return;
                }
                szVar.getClass();
                if (i3 == 1) {
                    if (str7.startsWith("mailto:")) {
                        str7 = str7.substring(7);
                    } else if (str7.startsWith("tel:")) {
                        str7 = str7.substring(4);
                    }
                    org.telegram.messenger.g0.g(str7);
                    return;
                }
                return;
            case 7:
                c30 c30Var = (c30) this.c;
                ArrayList arrayList2 = (ArrayList) this.b;
                x30 x30Var = c30Var.b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i3);
                int intValue = num.intValue();
                x30Var.q5 = num;
                x30Var.Q1(true, true);
                x30Var.q5 = null;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.o2(c30Var, intValue, 14));
                return;
            case 8:
                yj0 yj0Var = (yj0) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                try {
                    tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                    try {
                        tL_secureRequiredType.type = (TLRPC.SecureValueType) ((Class) arrayList3.get(i3)).newInstance();
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    tL_secureRequiredType = null;
                }
                if (!yj0.z1(tL_secureRequiredType.type)) {
                    if (yj0.x1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    yj0Var.I1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                yj0Var.I1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 9:
                mu0.a((mu0) this.c, (Context) this.b, i3);
                return;
            case 10:
                ny0 ny0Var = (ny0) this.c;
                switch (((u70) this.b).a) {
                    case 11:
                        xi.e.e.b(i3 == 0 ? wi.r0.b : wi.r0.c);
                        break;
                    case 12:
                        xi.e.f.b(wi.n0.values()[i3]);
                        break;
                    case 13:
                        xi.e.g.b(i3 == 0 ? wi.o0.b : wi.o0.c);
                        break;
                    default:
                        xi.c cVar = xi.e.h;
                        int i12 = ny0.d[i3];
                        synchronized (cVar) {
                            cVar.b = i12;
                            cVar.a = true;
                            xi.d.a.edit().putInt("round_video_video_bitrate", i12).apply();
                            break;
                        }
                }
                ((n4) ny0Var.c).f();
                return;
            case 11:
                b21 b21Var = (b21) this.c;
                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.b));
                org.telegram.messenger.camera.q.r(null, 2131744204, new org.telegram.ui.Components.fc(b21Var.c, null));
                return;
            case 12:
                v51 v51Var = (v51) this.c;
                org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) this.b;
                ThemeActivity themeActivity = v51Var.e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i3 == 0) {
                    if (j6Var.G == null) {
                        themeActivity.getMessagesController().y4(j6Var, null);
                        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.s4, j6Var, null);
                        return;
                    }
                    String str8 = "https://" + themeActivity.getMessagesController().V2 + "/addtheme/" + j6Var.G.slug;
                    themeActivity.showDialog(new org.telegram.ui.Components.oo0(themeActivity.getParentActivity(), null, str8, false, str8, false, null));
                    return;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        q4Var = ((org.telegram.ui.ActionBar.d2) themeActivity).parentLayout;
                        if (q4Var != null) {
                            org.telegram.ui.ActionBar.k6.u(j6Var, true, false);
                            q4Var2 = ((org.telegram.ui.ActionBar.d2) themeActivity).parentLayout;
                            ((ActionBarLayout) q4Var2).X(true, true);
                            new ThemeEditorView().d(themeActivity.getParentActivity(), j6Var);
                            return;
                        }
                        return;
                    }
                    if (i3 == 3) {
                        themeActivity.presentFragment(new o71(j6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131751485, "DeleteThemeTitle");
                    alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131751486, "DeleteThemeAlert");
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, "Delete"), new rb0(26, v51Var, j6Var));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    themeActivity.showDialog(s1Var);
                    TextView textView = (TextView) s1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                        return;
                    }
                    return;
                }
                if (j6Var.b == null && j6Var.d == null) {
                    StringBuilder sb3 = new StringBuilder();
                    int[] iArr = org.telegram.ui.ActionBar.k6.em;
                    for (int i13 = 0; i13 < iArr.length; i13++) {
                        sb3.append(org.telegram.ui.ActionBar.u4.c(i13));
                        sb3.append("=");
                        sb3.append(iArr[i13]);
                        sb3.append("\n");
                    }
                    q02 = new File(org.telegram.messenger.t0.h(), "default_theme.attheme");
                    try {
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(q02);
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                        } catch (Exception e11) {
                            e = e11;
                        }
                    } catch (Exception e12) {
                        org.telegram.messenger.a8.g(e12, true);
                    }
                    try {
                        fileOutputStream.write(org.telegram.messenger.g0.h1(sb3.toString()));
                        fileOutputStream.close();
                    } catch (Exception e13) {
                        e = e13;
                        fileOutputStream2 = fileOutputStream;
                        org.telegram.messenger.a8.g(e, true);
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        str2 = j6Var.a;
                        if (!str2.endsWith(".attheme")) {
                        }
                        file = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.w7.q(str2));
                        if (org.telegram.messenger.g0.E(q02, file)) {
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        fileOutputStream2 = fileOutputStream;
                        if (fileOutputStream2 == null) {
                            throw th2;
                        }
                        try {
                            fileOutputStream2.close();
                            throw th2;
                        } catch (Exception e14) {
                            org.telegram.messenger.a8.g(e14, true);
                            throw th2;
                        }
                    }
                } else {
                    String str9 = j6Var.d;
                    q02 = str9 != null ? org.telegram.ui.ActionBar.k6.q0(str9) : new File(j6Var.b);
                }
                str2 = j6Var.a;
                if (!str2.endsWith(".attheme")) {
                    str2 = str2.concat(".attheme");
                }
                file = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.w7.q(str2));
                try {
                    if (org.telegram.messenger.g0.E(q02, file)) {
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/xml");
                    if (Build.VERSION.SDK_INT >= 24) {
                        try {
                            Activity parentActivity = themeActivity.getParentActivity();
                            StringBuilder sb4 = new StringBuilder();
                            org.telegram.messenger.t0.d();
                            sb4.append("org.telegram.messenger.beta");
                            sb4.append(".provider");
                            intent.putExtra("android.intent.extra.STREAM", FileProvider.d(parentActivity, sb4.toString(), file));
                            intent.setFlags(1);
                        } catch (Exception unused4) {
                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                        }
                    } else {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    }
                    themeActivity.startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131745469, "ShareFile")), 500);
                    return;
                } catch (Exception e15) {
                    org.telegram.messenger.a8.g(e15, true);
                    return;
                }
            case 13:
                pg.m.a((pg.m) this.c, (Integer[][]) this.b, i3);
                return;
            default:
                tg.b1 b1Var = (tg.b1) this.c;
                ArrayList arrayList4 = (ArrayList) this.b;
                SharedPreferences sharedPreferences = b1Var.g;
                ArrayList arrayList5 = b1Var.c;
                if (i3 != 0) {
                    tg.a1 a1Var = new tg.a1();
                    a1Var.a = i3 - 1;
                    a1Var.b = arrayList4;
                    arrayList5.add(a1Var);
                    String string = sharedPreferences.getString("moretemplates", null);
                    if (string == null) {
                        sb2 = "" + a1Var.a;
                    } else {
                        StringBuilder h = t4.c.h(string, "|");
                        h.append(a1Var.a);
                        sb2 = h.toString();
                    }
                    for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                        StringBuilder h7 = t4.c.h(sb2, ",");
                        h7.append(Math.round(((tg.z0) arrayList4.get(i14)).a));
                        h7.append(",");
                        h7.append(Math.round(((tg.z0) arrayList4.get(i14)).b));
                        sb2 = h7.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", sb2).apply();
                    return;
                }
                StringBuilder sb5 = new StringBuilder("[");
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    tg.a1 a1Var2 = (tg.a1) arrayList5.get(i15);
                    if (i15 > 0) {
                        sb5.append(",\n");
                    }
                    sb5.append("\t{\n\t\t\"shape\": ");
                    sb5.append(a1Var2.a);
                    sb5.append(",\n\t\t\"points\": [");
                    for (int i16 = 0; i16 < a1Var2.b.size(); i16++) {
                        if (i16 > 0) {
                            sb5.append(",");
                        }
                        tg.z0 z0Var = (tg.z0) a1Var2.b.get(i16);
                        sb5.append("[");
                        sb5.append(Math.round(z0Var.a));
                        sb5.append(",");
                        sb5.append(Math.round(z0Var.b));
                        sb5.append("]");
                    }
                    sb5.append("],\n\t\t\"freq\": ");
                    sb5.append(Math.round(((a1Var2.c / b1Var.a) * 100.0f) * 100.0f) / 100.0f);
                    sb5.append("\n\t}");
                }
                sb5.append("\n]");
                Log.i("shapedetector", sb5.toString());
                return;
        }
    }
}
