package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class w81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w81(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.fl0 fl0Var;
        int i10;
        int i11;
        org.telegram.ui.web.d1 d1Var;
        org.telegram.ui.web.h0 h0Var;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.xc.a0((i91) obj2).k(false).j();
                break;
            case 1:
                i91.X((i91) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 2:
                b91 b91Var = (b91) obj2;
                a0.i iVar = (a0.i) obj;
                i91 i91Var = b91Var.b1;
                org.telegram.ui.Components.xc.x(i91Var.getParentActivity(), i91Var.b, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, b91Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), b91Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new t91(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (of) obj).show();
                break;
            case 4:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.n8) obj);
                break;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.x8) {
                    ((org.telegram.ui.Cells.x8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
            case 6:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.j6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.j6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.j6.x), Double.valueOf(org.telegram.ui.ActionBar.j6.y));
                }
                org.telegram.ui.ActionBar.j6.q1();
                org.telegram.ui.Components.vl0 vl0Var = themeActivity2.b;
                if (vl0Var != null && (fl0Var = (org.telegram.ui.Components.fl0) vl0Var.L(themeActivity2.Y)) != null) {
                    View view2 = fl0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.fa) {
                        ((org.telegram.ui.Cells.fa) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.w, false, false);
                        break;
                    }
                }
                break;
            case 7:
                xd1 xd1Var = (xd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (xd1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    xd1Var.A0.f(xd1Var.K0[0], true);
                    break;
                }
                break;
            case 8:
                ce1.X((ce1) obj2, (String) obj);
                break;
            case 9:
                ce1.V((ce1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 10:
                me1 me1Var = (me1) obj2;
                me1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                me1Var.c(true);
                break;
            case 11:
                me1 me1Var2 = (me1) obj2;
                me1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                me1Var2.c(true);
                break;
            case 12:
                lf1 lf1Var = (lf1) obj2;
                lf1Var.getClass();
                Bundle bundle = new Bundle();
                fg1 fg1Var = lf1Var.b;
                bundle.putLong("dialog_id", -fg1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                fg1Var.presentFragment(new w11(bundle, null));
                break;
            case 13:
                bg1 bg1Var = (bg1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = bg1Var.d0;
                fg1 fg1Var2 = bg1Var.u0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = fg1Var2.b;
                    if (i16 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        bg1Var.M();
                        if (!arrayList.isEmpty()) {
                            bg1Var.m0 = false;
                            bg1Var.p0.b(0);
                        }
                        bg1Var.K(str2);
                        break;
                    } else {
                        if (((wf1) arrayList3.get(i16)).c != null && ((wf1) arrayList3.get(i16)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((wf1) arrayList3.get(i16)).c);
                            ((wf1) arrayList3.get(i16)).c.searchQuery = lowerCase;
                        }
                        i16++;
                    }
                }
                break;
            case 14:
                ig1 ig1Var = ((hg1) obj2).b;
                ig1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                ig1Var.a.V();
                break;
            case 15:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 16:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 17:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 18:
                ih1.g0((ih1) obj2, (String) obj);
                break;
            case 19:
                Runnable runnable = (Runnable) obj;
                gs[] gsVarArr = ((ih1) obj2).w.f;
                int length = gsVarArr.length;
                while (i14 < length) {
                    gsVarArr[i14].l(0.0f);
                    i14++;
                }
                runnable.run();
                break;
            case 20:
                ph1 ph1Var = (ph1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = ph1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = ph1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(ph1Var.a).putChats(arrayList5, false);
                ph1Var.d = false;
                ph1Var.c = true;
                int size = arrayList4.size();
                while (i14 < size) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 21:
                ti1 ti1Var = (ti1) obj2;
                ti1Var.U.a(new ci1(ti1Var, (VoIPService) obj, i15), true);
                break;
            case 22:
                ti1 ti1Var2 = (ti1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.m2.T = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = ti1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f;
                duration.setInterpolator(qrVar).start();
                ti1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                ti1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                ti1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                ti1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                valueAnimator.addListener(new hi1(ti1Var2, i13));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(qrVar);
                valueAnimator.start();
                break;
            case 23:
                cj1 cj1Var = (cj1) obj2;
                int[] iArr = (int[]) obj;
                cj1Var.getClass();
                int i17 = iArr[0] - 1;
                iArr[0] = i17;
                if (i17 == 0) {
                    WallpapersListActivity wallpapersListActivity = cj1Var.a;
                    int[][] iArr2 = WallpapersListActivity.i0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 24:
                ij1 ij1Var = (ij1) obj2;
                String str3 = (String) obj;
                ij1Var.d.clear();
                ij1Var.e.clear();
                ij1Var.f = true;
                ij1Var.F(str3, "", true);
                ij1Var.h = str3;
                ij1Var.l();
                ij1Var.y = null;
                break;
            case 25:
                ij1 ij1Var2 = (ij1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = ij1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = ij1Var2.x;
                ij1Var2.x = null;
                ij1Var2.F(str4, "", false);
                break;
            case 26:
                String str5 = (String) obj;
                oj1 oj1Var = ((nj1) obj2).a;
                Activity parentActivity = oj1Var.getParentActivity();
                MessageObject messageObject = oj1Var.n;
                if (parentActivity != null) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d(str5);
                    }
                    str5.getClass();
                    if (str5.equals("share_game")) {
                        messageObject.messageOwner.with_my_score = false;
                    } else if (str5.equals("share_score")) {
                        messageObject.messageOwner.with_my_score = true;
                    }
                    oj1Var.showDialog(org.telegram.ui.Components.uq0.N0(oj1Var.getParentActivity(), messageObject, null, false, oj1Var.h));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) obj2;
                ei.r rVar = d1Var2.j0;
                rVar.f = true;
                rVar.k();
                d1Var2.w((ai.da) obj);
                break;
            case 28:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (d1Var = botWebViewContainer$BotWebViewProxy.a) != null && (h0Var = d1Var.c) != null) {
                    h0Var.f(arrayList6);
                    break;
                }
                break;
            default:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.f1.c.addAll(0, arrayList7);
                for (int i18 = 0; i18 < longSparseArray.size(); i18++) {
                    org.telegram.ui.web.f1.d.put(longSparseArray.keyAt(i18), (org.telegram.ui.web.e1) longSparseArray.valueAt(i18));
                }
                org.telegram.ui.web.f1.b = true;
                org.telegram.ui.web.f1.a = false;
                ArrayList arrayList8 = org.telegram.ui.web.f1.e;
                if (arrayList8 != null) {
                    int size2 = arrayList8.size();
                    while (i14 < size2) {
                        Object obj4 = arrayList8.get(i14);
                        i14++;
                        ((Utilities.Callback) obj4).run(arrayList7);
                    }
                    org.telegram.ui.web.f1.e = null;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ w81(b91 b91Var, a0.i iVar, int i10) {
        this.a = 2;
        this.b = b91Var;
        this.c = iVar;
    }
}
