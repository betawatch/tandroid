package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w01(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.fl0 fl0Var;
        int i10 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                x01 x01Var = (x01) obj2;
                x01Var.f.add((z01) obj);
                x01Var.a();
                break;
            case 1:
                ((o21) obj2).e0(34, (Bitmap) obj, true);
                break;
            case 2:
                j21 j21Var = (j21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken != null) {
                    int i11 = j21Var.G;
                    if (i11 != 0 && i11 < tL_exportedContactToken.expires) {
                        try {
                            try {
                                Vibrator vibrator = (Vibrator) j21Var.getContext().getSystemService("vibrator");
                                if (vibrator != null) {
                                    vibrator.vibrate(100L);
                                }
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            j21Var.performHapticFeedback(0, 2);
                        }
                    }
                    j21Var.G = tL_exportedContactToken.expires;
                    j21Var.c(tL_exportedContactToken.url, null, false, true);
                    break;
                } else {
                    j21Var.getClass();
                    break;
                }
            case 3:
                l31 l31Var = (l31) ((View[]) obj2)[0];
                l31Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                l31Var.c = null;
                l31Var.d = null;
                l31Var.f.V2.N(false);
                break;
            case 4:
                ((l31) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
            case 5:
                l31 l31Var2 = (l31) ((View[]) obj2)[0];
                l31Var2.b = null;
                l31Var2.c = (TLRPC.TL_reportResultChooseOption) obj;
                l31Var2.d = null;
                l31Var2.f.V2.N(false);
                break;
            case 6:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.qc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                break;
            case 7:
                org.telegram.ui.Components.qc.a0((org.telegram.ui.ActionBar.p2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.a90) obj);
                break;
            case 8:
                ((SecretMediaViewer) obj2).J = false;
                ((lu0) obj).a.setVisible(false, true);
                break;
            case 9:
                ((SecretMediaViewer) ((n7.qa) obj2).c).h((File) obj);
                break;
            case 10:
                r61 r61Var = (r61) obj2;
                r61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.p2) obj).presentFragment(new StickersActivity(5, r61Var.I0));
                Runnable runnable = r61Var.Q1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 11:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.qc.a0((p81) obj2).k(false).j();
                break;
            case 12:
                p81.W((p81) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 13:
                i81 i81Var = (i81) obj2;
                a0.h hVar = (a0.h) obj;
                p81 p81Var = i81Var.Y0;
                org.telegram.ui.Components.qc.x(p81Var.getParentActivity(), p81Var.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, i81Var.getThemedColor(org.telegram.ui.ActionBar.k6.Fi), i81Var.getThemedColor(org.telegram.ui.ActionBar.k6.Hi)).j();
                break;
            case 14:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj2;
                new z81(p2Var.getContext(), p2Var.getCurrentAccount(), p2Var.getResourceProvider(), (lh.a1) obj).show();
                break;
            case 15:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.k8) obj);
                break;
            case 16:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
            case 17:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.k6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.k6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.k6.x), Double.valueOf(org.telegram.ui.ActionBar.k6.y));
                }
                org.telegram.ui.ActionBar.k6.q1();
                org.telegram.ui.Components.tl0 tl0Var = themeActivity2.b;
                if (tl0Var != null && (fl0Var = (org.telegram.ui.Components.fl0) tl0Var.K(themeActivity2.V)) != null) {
                    View view2 = fl0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.aa) {
                        ((org.telegram.ui.Cells.aa) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.k6.w, false, false);
                        break;
                    }
                }
                break;
            case 18:
                ed1 ed1Var = (ed1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (ed1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    ed1Var.x0.f(ed1Var.H0[0], true);
                    break;
                }
                break;
            case 19:
                jd1.X((jd1) obj2, (String) obj);
                break;
            case 20:
                jd1.V((jd1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 21:
                ud1 ud1Var = (ud1) obj2;
                ud1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ud1Var.c(true);
                break;
            case 22:
                ud1 ud1Var2 = (ud1) obj2;
                ud1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                ud1Var2.c(true);
                break;
            case 23:
                re1 re1Var = (re1) obj2;
                re1Var.getClass();
                Bundle bundle = new Bundle();
                mf1 mf1Var = re1Var.b;
                bundle.putLong("dialog_id", -mf1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                mf1Var.presentFragment(new g11(bundle, null));
                break;
            case 24:
                if1 if1Var = (if1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = if1Var.W;
                mf1 mf1Var2 = if1Var.q0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = mf1Var2.b;
                    if (i12 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        if1Var.L();
                        if (!arrayList.isEmpty()) {
                            if1Var.i0 = false;
                            if1Var.l0.b(0);
                        }
                        if1Var.J(str2);
                        break;
                    } else {
                        if (((df1) arrayList3.get(i12)).c != null && ((df1) arrayList3.get(i12)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((df1) arrayList3.get(i12)).c);
                            ((df1) arrayList3.get(i12)).c.searchQuery = lowerCase;
                        }
                        i12++;
                    }
                }
                break;
            case 25:
                pf1 pf1Var = ((of1) obj2).b;
                pf1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                pf1Var.a.V();
                break;
            case 26:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 27:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 28:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            default:
                qg1.g0((qg1) obj2, (String) obj);
                break;
        }
    }

    public /* synthetic */ w01(i81 i81Var, a0.h hVar, int i10) {
        this.a = 13;
        this.b = i81Var;
        this.c = hVar;
    }
}
