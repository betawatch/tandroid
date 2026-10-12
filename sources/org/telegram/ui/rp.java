package org.telegram.ui;

import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class rp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rp(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aq.U((aq) this.b, (org.telegram.ui.ActionBar.a2[]) this.c);
                break;
            case 1:
                aq aqVar = (aq) this.b;
                TLObject tLObject = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    aqVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    aqVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                aqVar.w = false;
                aqVar.x = true;
                aqVar.b0();
                break;
            case 2:
                wp wpVar = (wp) this.b;
                org.telegram.ui.Components.i90 i90Var = (org.telegram.ui.Components.i90) this.c;
                wpVar.x.d.P = false;
                i90Var.run();
                break;
            case 3:
                wp wpVar2 = (wp) this.b;
                org.telegram.ui.Components.j90 j90Var = (org.telegram.ui.Components.j90) this.c;
                wpVar2.x.d.O = false;
                j90Var.run();
                break;
            case 4:
                wp wpVar3 = (wp) this.b;
                Runnable runnable = (Runnable) this.c;
                aq aqVar2 = wpVar3.x.d;
                aqVar2.O = false;
                aqVar2.P = false;
                runnable.run();
                break;
            case 5:
                wp wpVar4 = (wp) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                wpVar4.getClass();
                chat.join_request = true;
                wpVar4.h = true;
                wpVar4.c.setChecked(true);
                break;
            case 6:
                yr yrVar = (yr) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                yrVar.getClass();
                yrVar.getMessagesController().loadFullChat(updates.chats.get(0).id, 0, true);
                break;
            case 7:
                nr nrVar = (nr) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                yr yrVar2 = nrVar.a;
                if (org.telegram.ui.Components.zc.a(yrVar2)) {
                    org.telegram.ui.Components.zc.C(yrVar2, user.first_name).j();
                    break;
                }
                break;
            case 8:
                ((org.telegram.ui.Components.e0) this.b).u0.unsave((TL_aicompose.TL_aiComposeTone) this.c);
                break;
            case 9:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) this.b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.c;
                qVar.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    break;
                }
                break;
            case 10:
                boolean[] zArr = (boolean[]) this.b;
                uz0 uz0Var = (uz0) this.c;
                if (zArr[0]) {
                    uz0Var.run();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.fa faVar = (org.telegram.ui.Components.fa) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                faVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    faVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.sc scVar = (org.telegram.ui.Components.sc) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                scVar.n = true;
                ViewParent viewParent = scVar.e;
                if (viewParent instanceof org.telegram.ui.Components.xb) {
                    org.telegram.ui.Components.yb ybVar = (org.telegram.ui.Components.yb) ((org.telegram.ui.Components.xb) viewParent);
                    ybVar.b.setText(charSequence);
                    AndroidUtilities.updateViewShow(ybVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(ybVar.b, true, false, true);
                }
                scVar.i(true);
                break;
            case 13:
                boolean[] zArr2 = (boolean[]) this.b;
                Runnable runnable2 = (Runnable) this.c;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    runnable2.run();
                    break;
                }
                break;
            case 14:
                ((org.telegram.ui.Components.md) this.b).removeView((di.d4) this.c);
                break;
            case 15:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                di.d4 d4Var = (di.d4) this.c;
                int i10 = ChatActivityEnterView.n5;
                chatActivityEnterView.removeView(d4Var);
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.b;
                CharSequence charSequence2 = (CharSequence) this.c;
                int i11 = ChatActivityEnterView.n5;
                chatActivityEnterView2.setFieldText(charSequence2);
                chatActivityEnterView2.W = null;
                break;
            case 17:
                ChatActivityEnterView chatActivityEnterView3 = (ChatActivityEnterView) this.b;
                org.telegram.ui.Components.td tdVar = (org.telegram.ui.Components.td) this.c;
                int i12 = ChatActivityEnterView.n5;
                tdVar.run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView3.Q, chatActivityEnterView3.Q2, true);
                break;
            case 18:
                org.telegram.ui.Components.tg tgVar = (org.telegram.ui.Components.tg) this.b;
                org.telegram.ui.Components.qg qgVar = (org.telegram.ui.Components.qg) this.c;
                ChatActivityEnterView chatActivityEnterView4 = tgVar.V;
                chatActivityEnterView4.i1 = chatActivityEnterView4.h1.getAudioRightMs() - chatActivityEnterView4.h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView4.h1.getAudioLeftMs(), chatActivityEnterView4.h1.getAudioRightMs(), qgVar);
                break;
            case 19:
                ((org.telegram.ui.Components.vi) this.b).containerView.removeView((di.d4) this.c);
                break;
            case 20:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) this.b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.c;
                viVar.dismiss(true);
                if (m2Var != null) {
                    m2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 21:
                org.telegram.ui.Components.vi viVar2 = (org.telegram.ui.Components.vi) this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                if (!viVar2.isDismissed() && editTextBoldCursor.isFocusable() && editTextBoldCursor.hasFocus() && editTextBoldCursor.isShown()) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.vi viVar3 = (org.telegram.ui.Components.vi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = ((org.telegram.ui.Components.oi) this.c).c;
                tL_attachMenuBot.side_menu_disclaimer_needed = false;
                tL_attachMenuBot.inactive = false;
                viVar3.R1(tL_attachMenuBot.bot_id, null, false, true);
                MediaDataController.getInstance(viVar3.M1).updateAttachMenuBotsInCache();
                break;
            case 23:
                org.telegram.ui.Components.vi viVar4 = (org.telegram.ui.Components.vi) this.b;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = (TLRPC.TL_attachMenuBot) this.c;
                MediaDataController.getInstance(viVar4.M1).loadAttachMenuBots(false, true);
                if (viVar4.B0 == viVar4.A0.get(tL_attachMenuBot2.bot_id)) {
                    viVar4.U1(viVar4.j0);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.hj hjVar = (org.telegram.ui.Components.hj) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                hjVar.G = false;
                hjVar.H = arrayList2;
                hjVar.S();
                break;
            case 25:
                org.telegram.ui.Components.hj hjVar2 = (org.telegram.ui.Components.hj) this.b;
                ((org.telegram.ui.Components.vi) this.c).b1();
                hjVar2.O();
                hjVar2.b.b2(hjVar2, 0);
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new rp(27, (org.telegram.ui.Components.yj) this.b, ((org.telegram.ui.Components.xj) this.c).run()));
                break;
            case 27:
                ((org.telegram.ui.Components.yj) this.b).setStatus((CharSequence) this.c);
                break;
            case 28:
                org.telegram.ui.Components.ok okVar = (org.telegram.ui.Components.ok) this.b;
                String str = (String) this.c;
                okVar.getClass();
                ArrayList arrayList3 = new ArrayList(okVar.X.v.c);
                if (okVar.X.v.d.isEmpty()) {
                    arrayList3.addAll(0, okVar.X.v.e);
                }
                Utilities.searchQueue.postRunnable(new bi.h4(okVar, str, !okVar.R.isEmpty(), arrayList3, 17));
                break;
            default:
                org.telegram.ui.Components.ok okVar2 = (org.telegram.ui.Components.ok) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                org.telegram.ui.Components.pk pkVar = okVar2.X;
                boolean z10 = pkVar.b0;
                org.telegram.ui.Components.ek ekVar = pkVar.r;
                if (z10) {
                    s4.g0 adapter = ekVar.getAdapter();
                    org.telegram.ui.Components.ok okVar3 = pkVar.y;
                    if (adapter != okVar3) {
                        ekVar.setAdapter(okVar3);
                    }
                }
                okVar2.s = arrayList4;
                okVar2.l();
                break;
        }
    }
}
