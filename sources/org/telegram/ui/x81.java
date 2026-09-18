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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x81(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.gl0 gl0Var;
        int i10;
        int i11;
        org.telegram.ui.web.d1 d1Var;
        org.telegram.ui.web.h0 h0Var;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 0;
        int i15 = 0;
        int i16 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                y81 y81Var = (y81) obj2;
                a0.i iVar = (a0.i) obj;
                f91 f91Var = y81Var.b1;
                org.telegram.ui.Components.xc.x(f91Var.getParentActivity(), f91Var.b, iVar.m(), iVar.m() == 1 ? ((TLRPC.Dialog) iVar.n(0)).id : 0L, y81Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), y81Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                break;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                new r91(n2Var.getContext(), n2Var.getCurrentAccount(), n2Var.getResourceProvider(), (of) obj).show();
                break;
            case 2:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.m8) obj);
                break;
            case 3:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.w8) {
                    ((org.telegram.ui.Cells.w8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
            case 4:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.j6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.j6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.j6.x), Double.valueOf(org.telegram.ui.ActionBar.j6.y));
                }
                org.telegram.ui.ActionBar.j6.q1();
                org.telegram.ui.Components.wl0 wl0Var = themeActivity2.b;
                if (wl0Var != null && (gl0Var = (org.telegram.ui.Components.gl0) wl0Var.L(themeActivity2.Y)) != null) {
                    View view2 = gl0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.ea) {
                        ((org.telegram.ui.Cells.ea) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.w, false, false);
                        break;
                    }
                }
                break;
            case 5:
                vd1 vd1Var = (vd1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (vd1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    vd1Var.A0.f(vd1Var.K0[0], true);
                    break;
                }
                break;
            case 6:
                ae1.X((ae1) obj2, (String) obj);
                break;
            case 7:
                ae1.V((ae1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 8:
                ke1 ke1Var = (ke1) obj2;
                ke1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                ke1Var.c(true);
                break;
            case 9:
                ke1 ke1Var2 = (ke1) obj2;
                ke1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                ke1Var2.c(true);
                break;
            case 10:
                jf1 jf1Var = (jf1) obj2;
                jf1Var.getClass();
                Bundle bundle = new Bundle();
                dg1 dg1Var = jf1Var.b;
                bundle.putLong("dialog_id", -dg1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                dg1Var.presentFragment(new w11(bundle, null));
                break;
            case 11:
                zf1 zf1Var = (zf1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = zf1Var.d0;
                dg1 dg1Var2 = zf1Var.u0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i17 = 0;
                while (true) {
                    ArrayList arrayList3 = dg1Var2.b;
                    if (i17 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        zf1Var.M();
                        if (!arrayList.isEmpty()) {
                            zf1Var.m0 = false;
                            zf1Var.p0.b(0);
                        }
                        zf1Var.K(str2);
                        break;
                    } else {
                        if (((uf1) arrayList3.get(i17)).c != null && ((uf1) arrayList3.get(i17)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((uf1) arrayList3.get(i17)).c);
                            ((uf1) arrayList3.get(i17)).c.searchQuery = lowerCase;
                        }
                        i17++;
                    }
                }
                break;
            case 12:
                gg1 gg1Var = ((fg1) obj2).b;
                gg1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                gg1Var.a.V();
                break;
            case 13:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 14:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 15:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 16:
                gh1.g0((gh1) obj2, (String) obj);
                break;
            case 17:
                Runnable runnable = (Runnable) obj;
                for (gs gsVar : ((gh1) obj2).w.f) {
                    gsVar.l(0.0f);
                }
                runnable.run();
                break;
            case 18:
                nh1 nh1Var = (nh1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = nh1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = nh1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(nh1Var.a).putChats(arrayList5, false);
                nh1Var.d = false;
                nh1Var.c = true;
                int size = arrayList4.size();
                while (i15 < size) {
                    Object obj3 = arrayList4.get(i15);
                    i15++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 19:
                si1 si1Var = (si1) obj2;
                si1Var.U.a(new bi1(si1Var, (VoIPService) obj, i16), true);
                break;
            case 20:
                si1 si1Var2 = (si1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.m2.T = false;
                org.telegram.ui.Components.voip.m2.i();
                ViewPropertyAnimator duration = si1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f;
                duration.setInterpolator(qrVar).start();
                si1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                si1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                si1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                si1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                si1Var2.j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar).start();
                si1Var2.h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                si1Var2.i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                si1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(qrVar).start();
                valueAnimator.addListener(new gi1(si1Var2, i13));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(qrVar);
                valueAnimator.start();
                break;
            case 21:
                bj1 bj1Var = (bj1) obj2;
                int[] iArr = (int[]) obj;
                bj1Var.getClass();
                int i18 = iArr[0] - 1;
                iArr[0] = i18;
                if (i18 == 0) {
                    WallpapersListActivity wallpapersListActivity = bj1Var.a;
                    int[][] iArr2 = WallpapersListActivity.i0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 22:
                hj1 hj1Var = (hj1) obj2;
                String str3 = (String) obj;
                hj1Var.d.clear();
                hj1Var.e.clear();
                hj1Var.f = true;
                hj1Var.F(str3, "", true);
                hj1Var.h = str3;
                hj1Var.l();
                hj1Var.y = null;
                break;
            case 23:
                hj1 hj1Var2 = (hj1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = hj1Var2.E;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = hj1Var2.x;
                hj1Var2.x = null;
                hj1Var2.F(str4, "", false);
                break;
            case 24:
                String str5 = (String) obj;
                nj1 nj1Var = ((mj1) obj2).a;
                Activity parentActivity = nj1Var.getParentActivity();
                MessageObject messageObject = nj1Var.n;
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
                    nj1Var.showDialog(org.telegram.ui.Components.vq0.N0(nj1Var.getParentActivity(), messageObject, null, false, nj1Var.h));
                    break;
                }
                break;
            case 25:
                org.telegram.ui.web.d1 d1Var2 = (org.telegram.ui.web.d1) obj2;
                ei.r rVar = d1Var2.j0;
                rVar.f = true;
                rVar.k();
                d1Var2.w((ai.da) obj);
                break;
            case 26:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                if (botWebViewContainer$BotWebViewProxy != null && (d1Var = botWebViewContainer$BotWebViewProxy.a) != null && (h0Var = d1Var.c) != null) {
                    h0Var.f(arrayList6);
                    break;
                }
                break;
            case 27:
                ArrayList arrayList7 = (ArrayList) obj2;
                LongSparseArray longSparseArray = (LongSparseArray) obj;
                org.telegram.ui.web.f1.c.addAll(0, arrayList7);
                for (int i19 = 0; i19 < longSparseArray.size(); i19++) {
                    org.telegram.ui.web.f1.d.put(longSparseArray.keyAt(i19), (org.telegram.ui.web.e1) longSparseArray.valueAt(i19));
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
            case 28:
                org.telegram.ui.web.h1 h1Var = ((org.telegram.ui.web.g1) obj2).h;
                ArrayList arrayList9 = h1Var.h;
                arrayList9.clear();
                arrayList9.addAll((ArrayList) obj);
                h1Var.n = false;
                org.telegram.ui.Components.n61 n61Var = h1Var.a;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                f1Var.setEnabled(((org.telegram.ui.web.h2) obj).b() != null);
                f1Var.animate().alpha(f1Var.isEnabled() ? 1.0f : 0.5f);
                break;
        }
    }

    public /* synthetic */ x81(y81 y81Var, a0.i iVar, int i10) {
        this.a = 0;
        this.b = y81Var;
        this.c = iVar;
    }
}
