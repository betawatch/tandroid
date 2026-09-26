package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tt(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.wl0 wl0Var;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.a;
        int i11 = 24;
        int i12 = 14;
        int i13 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ut utVar = (ut) obj2;
                ArrayList arrayList = (ArrayList) obj;
                wt wtVar = utVar.h;
                if (wtVar.f) {
                    utVar.e = arrayList;
                    if (wtVar.e && (wl0Var = wtVar.a) != null) {
                        s4.h0 adapter = wl0Var.getAdapter();
                        ut utVar2 = wtVar.d;
                        if (adapter != utVar2) {
                            wtVar.a.setAdapter(utVar2);
                            wtVar.a.setFastScrollVisible(false);
                        }
                    }
                    utVar.l();
                    break;
                }
                break;
            case 1:
                MessagesController.getInstance(((yt) obj2).currentAccount).processUpdates((TLRPC.Updates) obj, false);
                break;
            case 2:
                qy.d0((qy) obj2, (String) obj);
                break;
            case 3:
                ei.k3.j(((qy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 4:
                qy qyVar = (qy) obj2;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) obj;
                org.telegram.ui.ActionBar.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                    e3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new lv(qyVar, i11), 300L);
                break;
            case 5:
                ((py) obj).a.postOnAnimation(new lv((qy) obj2, i12));
                break;
            case 6:
                qy qyVar2 = (qy) obj2;
                qyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (qyVar2.V2 == 0 && qyVar2.X2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 7:
                ArrayList arrayList2 = (ArrayList) obj;
                qy qyVar3 = ((pw) obj2).b;
                qyVar3.y3 = 2;
                qyVar3.A4(true, true);
                qyVar3.o3();
                while (i13 < arrayList2.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList2.get(i13)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i13);
                    if (qyVar3.getMessagesController().isForum(j3) || qyVar3.getMessagesController().isMonoForumWithManageRights(j3)) {
                        qyVar3.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    qyVar3.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController = qyVar3.getMessagesController();
                    int i14 = dialog.top_message;
                    messagesController.markDialogAsRead(j3, i14, i14, dialog.last_message_date, false, 0L, 0, true, 0);
                    i13++;
                }
                break;
            case 8:
                ((pw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 9:
                CharSequence charSequence = (CharSequence) obj;
                qy qyVar4 = ((bx) obj2).a;
                qyVar4.H2 = null;
                org.telegram.ui.Components.zq0 zq0Var = qyVar4.G2;
                if (zq0Var != null && zq0Var.h) {
                    zq0Var.e(charSequence, false);
                    break;
                }
                break;
            case 10:
                org.telegram.ui.ActionBar.m2[] m2VarArr = (org.telegram.ui.ActionBar.m2[]) obj;
                ((px) obj2).b.removeSelfFromStack();
                if (m2VarArr[1] != null) {
                    m2VarArr[0].removeSelfFromStack();
                    m2VarArr[1].finishFragment();
                    break;
                } else {
                    m2VarArr[0].finishFragment();
                    break;
                }
            case 11:
                cz czVar = (cz) obj2;
                wn wnVar = czVar.a;
                org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(wnVar.getParentActivity(), czVar.a, ((MessageObject) obj).getInputStickerSet(), null, wnVar.Y, wnVar.getResourceProvider());
                fy0Var.setCalcMandatoryInsets(wnVar.x9());
                wnVar.showDialog(fy0Var);
                break;
            case 12:
                wz wzVar = (wz) obj2;
                wzVar.getClass();
                ((org.telegram.ui.ActionBar.a2) obj).dismiss();
                xz xzVar = wzVar.E;
                yz yzVar = xzVar.c;
                Utilities.Callback callback = yzVar.x;
                if (callback != null) {
                    callback.run(yzVar.d);
                }
                xzVar.c.finishFragment();
                break;
            case 13:
                b10 b10Var = (b10) obj2;
                yz yzVar2 = new yz(b10Var.r, ((s00) obj).m);
                yzVar2.y = new b00(b10Var, 1);
                yzVar2.x = new b00(b10Var, 2);
                b10Var.presentFragment(yzVar2);
                break;
            case 14:
                b10 b10Var2 = (b10) obj2;
                Runnable runnable = (Runnable) obj;
                b10Var2.h = false;
                b10Var2.s = false;
                b10Var2.r.flags = b10Var2.y;
                b10Var2.i0(true);
                b10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 15:
                b10 b10Var3 = (b10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList3 = b10Var3.L;
                b10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    b10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    b10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList3.clear();
                    arrayList3.addAll(tL_chatlists_exportedInvites.invites);
                    b10Var3.w0();
                }
                b10Var3.M = 0;
                break;
            case 16:
                b10 b10Var4 = (b10) obj2;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj;
                MessagesController.DialogFilter dialogFilter = b10Var4.r;
                if (a2Var != null) {
                    try {
                        a2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                b10Var4.getMessagesController().removeFilter(dialogFilter);
                b10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                b10Var4.finishFragment();
                break;
            case 17:
                b10 b10Var5 = (b10) obj2;
                b10Var5.getClass();
                b10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 18:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.x = true;
                    break;
                }
                break;
            case 19:
                FiltersSetupActivity filtersSetupActivity2 = ((z10) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 20:
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = ((d60) obj2).Y1;
                for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                    if (((org.telegram.ui.Components.voip.u) arrayList5.get(i15)).w != null) {
                        arrayList4.remove(((org.telegram.ui.Components.voip.u) arrayList5.get(i15)).w);
                    }
                }
                while (i13 < arrayList4.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList4.get(i13);
                    if (videoParticipant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                    }
                    i13++;
                }
                break;
            case 21:
                d60 d60Var = (d60) obj2;
                d60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                d60Var.dismiss();
                break;
            case 22:
                w5 w5Var = (w5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.t2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new tt(23, w5Var, ci.n0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 23:
                ((d60) ((w5) obj2).b).U0.setNewColors((int[]) obj);
                break;
            case 24:
                o70.V((o70) obj2, (TLRPC.TL_error) obj);
                break;
            case 25:
                k70 k70Var = (k70) obj2;
                String str = (String) obj;
                l70 l70Var = k70Var.a;
                l70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                l70Var.c = l70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new lo(i11, k70Var, str), 66);
                break;
            case 26:
                TLObject tLObject2 = (TLObject) obj;
                l70 l70Var2 = ((k70) obj2).a;
                if (tLObject2 != null) {
                    o70.a0(l70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    o70.a0(l70Var2.h, null);
                    break;
                }
            case 27:
                n70 n70Var = (n70) obj2;
                String str2 = (String) obj;
                n70Var.h = str2;
                o70 o70Var = n70Var.r;
                if (o70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                n70Var.n = o70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(n70Var, str2, str2, i12), 66);
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.a6(7, (h80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            default:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.l();
                break;
        }
    }
}
