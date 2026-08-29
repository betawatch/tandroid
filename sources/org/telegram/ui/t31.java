package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t31(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.vk0 vk0Var;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 0;
        int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                ((SecretMediaViewer) obj2).I = false;
                ((zt0) obj).a.setVisible(false, true);
                break;
            case 1:
                ((SecretMediaViewer) ((oc.i) obj2).c).h((File) obj);
                break;
            case 2:
                d61 d61Var = (d61) obj2;
                d61Var.v(null, false, false);
                ((org.telegram.ui.ActionBar.o2) obj).presentFragment(new StickersActivity(5, d61Var.H0));
                Runnable runnable = d61Var.P1;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                AndroidUtilities.addToClipboard((String) obj);
                org.telegram.ui.Components.tc.a0((b81) obj2).k(false).j();
                break;
            case 4:
                b81.W((b81) obj2, (TLRPC.TL_attachMenuBot) obj);
                break;
            case 5:
                u71 u71Var = (u71) obj2;
                a0.h hVar = (a0.h) obj;
                b81 b81Var = u71Var.X0;
                org.telegram.ui.Components.tc.x(b81Var.getParentActivity(), b81Var.b, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, u71Var.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), u71Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi)).j();
                break;
            case 6:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                new l81(o2Var.getContext(), o2Var.getCurrentAccount(), o2Var.getResourceProvider(), (tm) obj).show();
                break;
            case 7:
                ((StickersActivity) obj2).n0((org.telegram.ui.Cells.i8) obj);
                break;
            case 8:
                ThemeActivity themeActivity = (ThemeActivity) obj2;
                View view = (View) obj;
                themeActivity.getMessagesController().setContentSettings(true);
                if (view instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view).setChecked(themeActivity.getMessagesController().showSensitiveContent());
                    break;
                }
                break;
            case 9:
                ThemeActivity themeActivity2 = (ThemeActivity) obj2;
                String str = (String) obj;
                themeActivity2.getClass();
                org.telegram.ui.ActionBar.g6.w = str;
                if (str == null) {
                    org.telegram.ui.ActionBar.g6.w = String.format("(%.06f, %.06f)", Double.valueOf(org.telegram.ui.ActionBar.g6.x), Double.valueOf(org.telegram.ui.ActionBar.g6.y));
                }
                org.telegram.ui.ActionBar.g6.q1();
                org.telegram.ui.Components.jl0 jl0Var = themeActivity2.b;
                if (jl0Var != null && (vk0Var = (org.telegram.ui.Components.vk0) jl0Var.K(themeActivity2.U)) != null) {
                    View view2 = vk0Var.a;
                    if (view2 instanceof org.telegram.ui.Cells.y9) {
                        ((org.telegram.ui.Cells.y9) view2).c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.g6.w, false, false);
                        break;
                    }
                }
                break;
            case 10:
                qc1 qc1Var = (qc1) obj2;
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                if (qc1Var.n == 3) {
                    sharedPreferences.edit().putBoolean("bganimationhint", true).commit();
                    qc1Var.w0.f(qc1Var.G0[0], true);
                    break;
                }
                break;
            case 11:
                vc1.X((vc1) obj2, (String) obj);
                break;
            case 12:
                vc1.V((vc1) obj2, (TLRPC.TL_theme) obj);
                break;
            case 13:
                fd1 fd1Var = (fd1) obj2;
                fd1Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                fd1Var.c(true);
                break;
            case 14:
                fd1 fd1Var2 = (fd1) obj2;
                fd1Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) obj).title, false));
                fd1Var2.c(true);
                break;
            case 15:
                de1 de1Var = (de1) obj2;
                de1Var.getClass();
                Bundle bundle = new Bundle();
                ze1 ze1Var = de1Var.b;
                bundle.putLong("dialog_id", -ze1Var.a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) obj).id);
                ze1Var.presentFragment(new t01(bundle, null));
                break;
            case 16:
                ve1 ve1Var = (ve1) obj2;
                String str2 = (String) obj;
                ArrayList arrayList = ve1Var.V;
                ze1 ze1Var2 = ve1Var.p0;
                String lowerCase = str2.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i16 = 0;
                while (true) {
                    ArrayList arrayList3 = ze1Var2.b;
                    if (i16 >= arrayList3.size()) {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        ve1Var.L();
                        if (!arrayList.isEmpty()) {
                            ve1Var.h0 = false;
                            ve1Var.k0.b(0);
                        }
                        ve1Var.J(str2);
                        break;
                    } else {
                        if (((pe1) arrayList3.get(i16)).c != null && ((pe1) arrayList3.get(i16)).c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((pe1) arrayList3.get(i16)).c);
                            ((pe1) arrayList3.get(i16)).c.searchQuery = lowerCase;
                        }
                        i16++;
                    }
                }
                break;
            case 17:
                cf1 cf1Var = ((bf1) obj2).b;
                cf1Var.a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) obj).id));
                cf1Var.a.V();
                break;
            case 18:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) obj2, (byte[]) obj);
                break;
            case 19:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) obj2, (TL_account.updatePasswordSettings) obj);
                break;
            case 20:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) obj2, (TLRPC.TL_error) obj);
                break;
            case 21:
                cg1.g0((cg1) obj2, (String) obj);
                break;
            case 22:
                Runnable runnable2 = (Runnable) obj;
                ur[] urVarArr = ((cg1) obj2).w.f;
                int length = urVarArr.length;
                while (i14 < length) {
                    urVarArr[i14].l(0.0f);
                    i14++;
                }
                runnable2.run();
                break;
            case 23:
                ig1 ig1Var = (ig1) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList4 = ig1Var.f;
                ArrayList<TLRPC.Chat> arrayList5 = ig1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                MessagesController.getInstance(ig1Var.a).putChats(arrayList5, false);
                ig1Var.d = false;
                ig1Var.c = true;
                int size = arrayList4.size();
                while (i14 < size) {
                    Object obj3 = arrayList4.get(i14);
                    i14++;
                    ((Runnable) obj3).run();
                }
                arrayList4.clear();
                break;
            case 24:
                oh1 oh1Var = (oh1) obj2;
                oh1Var.Q.a(new xg1(oh1Var, (VoIPService) obj, i15), true);
                break;
            case 25:
                oh1 oh1Var2 = (oh1) obj2;
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                org.telegram.ui.Components.voip.o2.P = false;
                org.telegram.ui.Components.voip.o2.i();
                ViewPropertyAnimator duration = oh1Var2.G.animate().setDuration(150L);
                org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f;
                duration.setInterpolator(jrVar).start();
                oh1Var2.D.animate().alpha(1.0f).setDuration(150L).setInterpolator(jrVar).start();
                oh1Var2.E.animate().alpha(1.0f).setDuration(150L).setInterpolator(jrVar).start();
                oh1Var2.J.animate().alpha(1.0f).setDuration(150L).setInterpolator(jrVar).start();
                oh1Var2.T.animate().alpha(1.0f).setDuration(150L).setInterpolator(jrVar).start();
                oh1Var2.f0.animate().alpha(1.0f).setDuration(150L).setInterpolator(jrVar).start();
                oh1Var2.d0.animate().alpha(1.0f).setDuration(350L).setInterpolator(jrVar).start();
                oh1Var2.e0.animate().alpha(1.0f).setDuration(350L).setInterpolator(jrVar).start();
                oh1Var2.I0.animate().alpha(1.0f).setDuration(350L).setInterpolator(jrVar).start();
                valueAnimator.addListener(new ch1(oh1Var2, i13));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(jrVar);
                valueAnimator.start();
                break;
            case 26:
                wh1 wh1Var = (wh1) obj2;
                int[] iArr = (int[]) obj;
                wh1Var.getClass();
                int i17 = iArr[0] - 1;
                iArr[0] = i17;
                if (i17 == 0) {
                    WallpapersListActivity wallpapersListActivity = wh1Var.a;
                    int[][] iArr2 = WallpapersListActivity.g0;
                    wallpapersListActivity.B0(true);
                    break;
                }
                break;
            case 27:
                ci1 ci1Var = (ci1) obj2;
                String str3 = (String) obj;
                ci1Var.d.clear();
                ci1Var.e.clear();
                ci1Var.f = true;
                ci1Var.F(str3, "", true);
                ci1Var.h = str3;
                ci1Var.l();
                ci1Var.y = null;
                break;
            case 28:
                ci1 ci1Var2 = (ci1) obj2;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) obj);
                WallpapersListActivity wallpapersListActivity2 = ci1Var2.A;
                i10 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity2).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity2.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str4 = ci1Var2.x;
                ci1Var2.x = null;
                ci1Var2.F(str4, "", false);
                break;
            default:
                String str5 = (String) obj;
                ji1 ji1Var = ((ii1) obj2).a;
                Activity parentActivity = ji1Var.getParentActivity();
                MessageObject messageObject = ji1Var.n;
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
                    ji1Var.showDialog(org.telegram.ui.Components.dq0.N0(ji1Var.getParentActivity(), messageObject, null, false, ji1Var.h));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t31(u71 u71Var, a0.h hVar, int i10) {
        this.a = 5;
        this.b = u71Var;
        this.c = hVar;
    }
}
