package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qv0(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.text.SpannableStringBuilder] */
    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        ArrayList arrayList;
        boolean z10;
        String str;
        int i10;
        String str2;
        String[] strArr;
        String str3;
        String str4;
        String str5;
        org.telegram.ui.Components.bj0 bj0Var;
        int i11 = this.a;
        String str6 = null;
        boolean z11 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ((bw0) obj2).e.presentFragment(ProfileActivity.A4(((Long) obj).longValue()));
                break;
            case 1:
                x9 x9Var = new x9(null);
                x9Var.d = (org.telegram.ui.ActionBar.e6) obj;
                ((org.telegram.ui.ActionBar.d2) obj2).presentFragment(x9Var);
                break;
            case 2:
                lw0 lw0Var = (lw0) obj2;
                String str7 = (String) obj;
                ArrayList arrayList2 = lw0Var.d;
                org.telegram.ui.ActionBar.d2 d2Var = lw0Var.e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str7.split(" ");
                String[] strArr2 = new String[split.length];
                int i12 = 0;
                while (i12 < split.length) {
                    String str8 = str6;
                    String S0 = org.telegram.messenger.bd.E0().S0(split[i12], true, false);
                    strArr2[i12] = S0;
                    if (S0.equals(split[i12])) {
                        strArr2[i12] = str8;
                    }
                    i12++;
                    str6 = str8;
                }
                String str9 = str6;
                int i13 = 0;
                while (true) {
                    kw0[] kw0VarArr = lw0Var.c;
                    boolean z12 = z11;
                    if (i13 >= kw0VarArr.length) {
                        String[] strArr3 = strArr2;
                        String str10 = str7;
                        if (lw0Var.F != null) {
                            int size = arrayList2.size();
                            int i14 = 0;
                            while (i14 < size) {
                                org.telegram.messenger.to toVar = (org.telegram.messenger.to) arrayList2.get(i14);
                                String str11 = " " + toVar.a.toLowerCase();
                                ?? r10 = str9;
                                int i15 = 0;
                                while (true) {
                                    if (i15 < split.length) {
                                        if (split[i15].length() != 0) {
                                            String str12 = split[i15];
                                            int indexOf = str11.indexOf(" " + str12);
                                            i3 = size;
                                            if (indexOf < 0 && (str = strArr3[i15]) != null) {
                                                indexOf = str11.indexOf(" ".concat(str));
                                                str12 = str;
                                            }
                                            if (indexOf >= 0) {
                                                if (r10 == 0) {
                                                    r10 = new SpannableStringBuilder(toVar.a);
                                                }
                                                arrayList = arrayList2;
                                                r10.setSpan(new ForegroundColorSpan(d2Var.getThemedColor(org.telegram.ui.ActionBar.k6.q6)), indexOf, str12.length() + indexOf, 33);
                                                z10 = r10;
                                            }
                                        } else {
                                            i3 = size;
                                            arrayList = arrayList2;
                                            z10 = r10;
                                        }
                                        if (z10 && i15 == split.length - 1) {
                                            arrayList4.add(toVar);
                                            arrayList5.add(z10);
                                        }
                                        i15++;
                                        size = i3;
                                        arrayList2 = arrayList;
                                        r10 = z10;
                                    } else {
                                        i3 = size;
                                    }
                                }
                                i14++;
                                size = i3;
                                arrayList2 = arrayList2;
                            }
                        }
                        org.telegram.messenger.g0.h3(new xt0(lw0Var, str10, arrayList3, arrayList4, arrayList5, 1));
                        break;
                    } else {
                        kw0 kw0Var = kw0VarArr[i13];
                        if (kw0Var != null) {
                            String str13 = kw0Var.a;
                            String str14 = " " + str13.toLowerCase();
                            String str15 = str9;
                            int i16 = 0;
                            while (i16 < split.length) {
                                if (split[i16].length() != 0) {
                                    String str16 = split[i16];
                                    i10 = i13;
                                    int indexOf2 = str14.indexOf(" " + str16);
                                    if (indexOf2 >= 0 || (str5 = strArr2[i16]) == null) {
                                        str5 = str16;
                                    } else {
                                        indexOf2 = str14.indexOf(" ".concat(str5));
                                    }
                                    if (indexOf2 >= 0) {
                                        String str17 = str5;
                                        ?? spannableStringBuilder = str15 == null ? new SpannableStringBuilder(str13) : str15;
                                        str2 = str14;
                                        strArr = strArr2;
                                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(d2Var.getThemedColor(org.telegram.ui.ActionBar.k6.q6));
                                        int length = str17.length() + indexOf2;
                                        str3 = str7;
                                        spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 33);
                                        str4 = spannableStringBuilder;
                                    } else {
                                        i13 = i10 + 1;
                                        z11 = z12;
                                        str7 = str7;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    i10 = i13;
                                    str2 = str14;
                                    strArr = strArr2;
                                    str3 = str7;
                                    str4 = str15;
                                }
                                if (str4 != null && i16 == split.length - 1) {
                                    if (kw0Var.f == 502) {
                                        int i17 = 0;
                                        while (true) {
                                            if (i17 >= 4) {
                                                i17 = -1;
                                            } else if (org.telegram.messenger.h10.i(i17).p()) {
                                                i17++;
                                            }
                                        }
                                        if (i17 < 0) {
                                        }
                                    }
                                    arrayList3.add(kw0Var);
                                    arrayList5.add(str4);
                                }
                                i16++;
                                str15 = str4;
                                i13 = i10;
                                str7 = str3;
                                str14 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i10 = i13;
                        i13 = i10 + 1;
                        z11 = z12;
                        str7 = str7;
                        strArr2 = strArr2;
                    }
                }
                break;
            case 3:
                lw0 lw0Var2 = (lw0) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                lw0Var2.d.addAll(arrayList6);
                int i18 = lw0Var2.f;
                org.telegram.messenger.hp.s1(i18).q2 = arrayList6;
                org.telegram.messenger.hp.s1(i18).r2 = lw0Var2.F;
                if (!lw0Var2.x) {
                    lw0Var2.f();
                    break;
                }
                break;
            case 4:
                pw0 pw0Var = (pw0) obj2;
                pw0Var.f.add((rw0) obj);
                pw0Var.a();
                break;
            case 5:
                dy0 dy0Var = (dy0) ((View[]) obj2)[0];
                dy0Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                dy0Var.c = null;
                dy0Var.d = null;
                dy0Var.f.g3.O(false);
                break;
            case 6:
                ((dy0) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 7:
                dy0 dy0Var2 = (dy0) ((View[]) obj2)[0];
                dy0Var2.b = null;
                dy0Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                dy0Var2.d = null;
                dy0Var2.f.g3.O(false);
                break;
            case 8:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.fc) obj).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                break;
            case 9:
                org.telegram.ui.Components.fc.a0((org.telegram.ui.ActionBar.d2) obj2).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                org.telegram.messenger.g0.h3((org.telegram.ui.Components.j50) obj);
                break;
            case 10:
                ((SecretMediaViewer) obj2).L = false;
                ((mq0) obj).a.O0(false, true);
                break;
            case 11:
                ((SecretMediaViewer) ((mi.h0) obj2).c).i((File) obj);
                break;
            case 12:
                g11 g11Var = (g11) obj2;
                g11Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.d2) obj).presentFragment(new StickersActivity(5, g11Var.M0));
                Runnable runnable = g11Var.V1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                org.telegram.messenger.g0.g((String) obj);
                org.telegram.ui.Components.fc.a0((c31) obj2).k(false).j();
                break;
            case 14:
                c31.b0((c31) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 15:
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                new j31(d2Var2.getContext(), d2Var2.getCurrentAccount(), d2Var2.getResourceProvider(), (mi.f) obj).show();
                break;
            case 16:
                ((StickersActivity) obj2).s0((org.telegram.ui.Cells.f8) obj);
                break;
            case 17:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().F4(true);
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(themeActivity.getMessagesController().S4());
                    break;
                }
                break;
            case 18:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str18 = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.k6.w = str18;
                if (str18 == null) {
                    org.telegram.ui.ActionBar.k6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.k6.x), Double.valueOf(org.telegram.ui.ActionBar.k6.y));
                }
                org.telegram.ui.ActionBar.k6.w1();
                org.telegram.ui.Components.tj0 tj0Var = themeActivity2.b;
                if (tj0Var != null && (bj0Var = (org.telegram.ui.Components.bj0) tj0Var.K(themeActivity2.Z)) != null) {
                    View view2 = bj0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.v9) {
                        ((org.telegram.ui.Cells.v9) view2).c(org.telegram.messenger.bd.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.k6.w, false, false);
                        break;
                    }
                }
                break;
            case 19:
                l71 l71Var = (l71) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (l71Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    l71Var.C0.c(l71Var.M0[0]);
                    break;
                }
                break;
            case 20:
                o71.c0((o71) obj2, (String) obj);
                break;
            case 21:
                o71.a0((o71) obj2, (TLRPC.TL_theme) obj);
                break;
            case 22:
                w71 w71Var = (w71) obj2;
                w71Var.getClass();
                org.telegram.messenger.g0.g((String) obj);
                w71Var.c(true);
                break;
            case 23:
                w71 w71Var2 = (w71) obj2;
                w71Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.zi.h0(((TLRPC.TodoItem) obj).title, false));
                w71Var2.c(true);
                break;
            case 24:
                u81 u81Var = (u81) obj2;
                u81Var.getClass();
                Bundle bundle = new Bundle();
                m91 m91Var = u81Var.b;
                bundle.putLong("dialog_id", -m91Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                m91Var.presentFragment(new yw0(bundle, null));
                break;
            case 25:
                i91 i91Var = (i91) obj2;
                String str19 = (String) obj;
                ArrayList arrayList7 = i91Var.f0;
                m91 m91Var2 = i91Var.w0;
                String lowerCase = str19.trim().toLowerCase();
                ArrayList arrayList8 = new ArrayList();
                int i19 = 0;
                while (true) {
                    ArrayList arrayList9 = m91Var2.b;
                    if (i19 >= arrayList9.size()) {
                        arrayList7.clear();
                        arrayList7.addAll(arrayList8);
                        i91Var.N();
                        if (!arrayList7.isEmpty()) {
                            i91Var.o0 = false;
                            i91Var.r0.b(0);
                        }
                        i91Var.L(str19);
                        break;
                    } else {
                        if (((e91) arrayList9.get(i19)).c != null && ((e91) arrayList9.get(i19)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList8.add(((e91) arrayList9.get(i19)).c);
                            ((e91) arrayList9.get(i19)).c.searchQuery = lowerCase;
                        }
                        i19++;
                    }
                }
                break;
            case 26:
                p91 p91Var = ((o91) obj2).b;
                p91Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                p91Var.a.a0();
                break;
            case 27:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 28:
                TwoStepVerificationActivity.i0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            default:
                TwoStepVerificationActivity.b0((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
        }
    }
}
