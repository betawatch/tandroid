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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        org.telegram.ui.Components.vk0 vk0Var;
        int i10;
        int i11;
        org.telegram.ui.web.d1 d1Var;
        org.telegram.ui.web.i0 i0Var;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.yc.a0((i91) obj2).k(false).j();
                break;
            case 1:
                i91.X((i91) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 2:
                b91 b91Var = (b91) obj2;
                a0.i iVar = (a0.i) obj;
                i91 i91Var = b91Var.b1;
                org.telegram.ui.Components.yc.x(i91Var.getParentActivity(), i91Var.b, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, b91Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), b91Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                break;
            case 3:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new t91(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (nf) obj).show();
                break;
            case 4:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                break;
            case 5:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
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
                org.telegram.ui.Components.ll0 ll0Var = themeActivity2.b;
                if (ll0Var != null && (vk0Var = (org.telegram.ui.Components.vk0) ll0Var.K(themeActivity2.Y)) != null) {
                    View view2 = vk0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.w, false, false);
                        break;
                    }
                }
                break;
            case 7:
                wd1 wd1Var = (wd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (wd1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    wd1Var.A0.f(wd1Var.K0[0], true);
                    break;
                }
                break;
            case 8:
                be1.X((be1) obj2, (String) obj);
                break;
            case 9:
                be1.V((be1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 10:
                le1 le1Var = (le1) obj2;
                le1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                le1Var.c(true);
                break;
            case 11:
                le1 le1Var2 = (le1) obj2;
                le1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                le1Var2.c(true);
                break;
            case 12:
                kf1 kf1Var = (kf1) obj2;
                kf1Var.getClass();
                Bundle bundle = new Bundle();
                eg1 eg1Var = kf1Var.b;
                bundle.putLong("dialog_id", -eg1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                eg1Var.presentFragment(new y11(bundle, null));
                break;
            case 13:
                ag1 ag1Var = (ag1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ag1Var.c0;
                eg1 eg1Var2 = ag1Var.t0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = eg1Var2.b;
                    if (i16 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        ag1Var.L();
                        if (!arrayList.isEmpty()) {
                            ag1Var.l0 = false;
                            ag1Var.o0.b(0);
                        }
                        ag1Var.J(str2);
                        break;
                    } else {
                        if (((vf1) arrayList3.get(i16)).c != null && ((vf1) arrayList3.get(i16)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((vf1) arrayList3.get(i16)).c);
                            ((vf1) arrayList3.get(i16)).c.searchQuery = lowerCase;
                        }
                        i16++;
                    }
                }
                break;
            case 14:
                hg1 hg1Var = ((gg1) obj2).b;
                hg1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                hg1Var.a.V();
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
                hh1.g0((hh1) obj2, (String) obj);
                break;
            case 19:
                Runnable runnable = (Runnable) obj;
                gs[] gsVarArr = ((hh1) obj2).w.f;
                int length = gsVarArr.length;
                while (i14 < length) {
                    gsVarArr[i14].l(0.0f);
                    i14++;
                }
                runnable.run();
                break;
            case 20:
                oh1 oh1Var = (oh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = oh1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = oh1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(oh1Var.a).putChats(arrayList5, false);
                oh1Var.d = false;
                oh1Var.c = true;
                int size = arrayList4.size();
                while (i14 < size) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 21:
                ui1 ui1Var = (ui1) obj2;
                ui1Var.U.a(new di1(ui1Var, (VoIPService) obj, i15), true);
                break;
            case 22:
                ui1 ui1Var2 = (ui1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.k2.T = false;
                org.telegram.ui.Components.voip.k2.i();
                ViewPropertyAnimator duration = ui1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
                duration.setInterpolator(prVar).start();
                ui1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ui1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ui1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ui1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ui1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
                ui1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                ui1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                ui1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(prVar).start();
                valueAnimator.addListener(new ii1(ui1Var2, i13));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(prVar);
                valueAnimator.start();
                break;
            case 23:
                dj1 dj1Var = (dj1) obj2;
                int[] iArr = (int[]) obj;
                dj1Var.getClass();
                int i17 = iArr[0] - 1;
                iArr[0] = i17;
                if (i17 == 0) {
                    WallpapersListActivity wallpapersListActivity = dj1Var.a;
                    int[][] iArr2 = WallpapersListActivity.k0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 24:
                jj1 jj1Var = (jj1) obj2;
                String str3 = (String) obj;
                jj1Var.d.clear();
                jj1Var.e.clear();
                jj1Var.f = true;
                jj1Var.F(str3, "", true);
                jj1Var.h = str3;
                jj1Var.l();
                jj1Var.y = null;
                break;
            case 25:
                jj1 jj1Var2 = (jj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = jj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = jj1Var2.x;
                jj1Var2.x = null;
                jj1Var2.F(str4, "", false);
                break;
            case 26:
                String str5 = (String) obj;
                qj1 qj1Var = ((pj1) obj2).a;
                Activity parentActivity = qj1Var.getParentActivity();
                MessageObject messageObject = qj1Var.n;
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
                    qj1Var.showDialog(org.telegram.ui.Components.hq0.N0(qj1Var.getParentActivity(), messageObject, null, false, qj1Var.h));
                    break;
                }
                break;
            case 27:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) obj2;
                fi.s sVar = d1Var2.j0;
                sVar.f = true;
                sVar.k();
                d1Var2.w((bi.k9) obj);
                break;
            case 28:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (d1Var = botWebViewContainer$BotWebViewProxy.a) != null && (i0Var = d1Var.c) != null) {
                    i0Var.f(arrayList6);
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
