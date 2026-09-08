package org.telegram.ui;

import android.graphics.Bitmap;
import android.text.TextUtils;
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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yt(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.ll0 ll0Var;
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.a;
        int i11 = 14;
        int i12 = 24;
        int i13 = 0;
        int i14 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                zt ztVar = (zt) obj2;
                String lowerCase = ((String) obj).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new yt(i14, ztVar, new ArrayList()));
                    break;
                } else {
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = ztVar.f;
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj3 = arrayList2.get(i13);
                        i13++;
                        vt vtVar = (vt) obj3;
                        String str = vtVar.a;
                        if (str == null) {
                            str = "";
                        }
                        String lowerCase2 = str.toLowerCase();
                        String lowerCase3 = AndroidUtilities.translitSafe(vtVar.a).toLowerCase();
                        String str2 = vtVar.b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String lowerCase4 = str2.toLowerCase();
                        String lowerCase5 = AndroidUtilities.translitSafe(vtVar.b).toLowerCase();
                        String str3 = vtVar.c;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String concat = TextUtils.isEmpty(str3) ? "" : "+".concat(str3);
                        if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(translitSafe) || org.telegram.messenger.w1.w(" ", translitSafe, lowerCase5) || str3.startsWith(lowerCase) || concat.startsWith(lowerCase)) {
                            arrayList.add(vtVar);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new yt(1, ztVar, arrayList));
                    break;
                }
                break;
            case 1:
                zt ztVar2 = (zt) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                bu buVar = ztVar2.h;
                if (buVar.f) {
                    ztVar2.e = arrayList3;
                    if (buVar.e && (ll0Var = buVar.a) != null) {
                        s4.h0 adapter = ll0Var.getAdapter();
                        zt ztVar3 = buVar.d;
                        if (adapter != ztVar3) {
                            buVar.a.setAdapter(ztVar3);
                            buVar.a.setFastScrollVisible(false);
                        }
                    }
                    ztVar2.l();
                    break;
                }
                break;
            case 2:
                MessagesController.getInstance(((du) obj2).currentAccount).processUpdates((TLRPC.Updates) obj, false);
                break;
            case 3:
                uy.e0((uy) obj2, (String) obj);
                break;
            case 4:
                fi.k3.j(((uy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 5:
                uy uyVar = (uy) obj2;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) obj;
                org.telegram.ui.ActionBar.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                    f3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new qv(uyVar, i12), 300L);
                break;
            case 6:
                ((ty) obj).a.postOnAnimation(new qv((uy) obj2, i11));
                break;
            case 7:
                uy uyVar2 = (uy) obj2;
                uyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (uyVar2.V2 == 0 && uyVar2.X2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 8:
                ArrayList arrayList4 = (ArrayList) obj;
                uy uyVar3 = ((tw) obj2).b;
                uyVar3.y3 = 2;
                uyVar3.A4(true, true);
                uyVar3.o3();
                while (i13 < arrayList4.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList4.get(i13)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList4.get(i13);
                    if (uyVar3.getMessagesController().isForum(j3) || uyVar3.getMessagesController().isMonoForumWithManageRights(j3)) {
                        uyVar3.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    uyVar3.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController = uyVar3.getMessagesController();
                    int i15 = dialog.top_message;
                    messagesController.markDialogAsRead(j3, i15, i15, dialog.last_message_date, false, 0L, 0, true, 0);
                    i13++;
                }
                break;
            case 9:
                ((tw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 10:
                CharSequence charSequence = (CharSequence) obj;
                uy uyVar4 = ((fx) obj2).a;
                uyVar4.H2 = null;
                org.telegram.ui.Components.mq0 mq0Var = uyVar4.G2;
                if (mq0Var != null && mq0Var.h) {
                    mq0Var.e(charSequence, false);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.n2[] n2VarArr = (org.telegram.ui.ActionBar.n2[]) obj;
                ((tx) obj2).b.removeSelfFromStack();
                if (n2VarArr[1] != null) {
                    n2VarArr[0].removeSelfFromStack();
                    n2VarArr[1].finishFragment();
                    break;
                } else {
                    n2VarArr[0].finishFragment();
                    break;
                }
            case 12:
                gz gzVar = (gz) obj2;
                co coVar = gzVar.a;
                org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(coVar.getParentActivity(), gzVar.a, ((MessageObject) obj).getInputStickerSet(), null, coVar.Y, coVar.getResourceProvider());
                ux0Var.setCalcMandatoryInsets(coVar.x9());
                coVar.showDialog(ux0Var);
                break;
            case 13:
                a00 a00Var = (a00) obj2;
                a00Var.getClass();
                ((org.telegram.ui.ActionBar.b2) obj).dismiss();
                b00 b00Var = a00Var.E;
                c00 c00Var = b00Var.c;
                Utilities.Callback callback = c00Var.x;
                if (callback != null) {
                    callback.run(c00Var.d);
                }
                b00Var.c.finishFragment();
                break;
            case 14:
                f10 f10Var = (f10) obj2;
                c00 c00Var2 = new c00(f10Var.r, ((w00) obj).m);
                c00Var2.y = new f00(f10Var, 1);
                c00Var2.x = new f00(f10Var, 2);
                f10Var.presentFragment(c00Var2);
                break;
            case 15:
                f10 f10Var2 = (f10) obj2;
                Runnable runnable = (Runnable) obj;
                f10Var2.h = false;
                f10Var2.s = false;
                f10Var2.r.flags = f10Var2.y;
                f10Var2.i0(true);
                f10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 16:
                f10 f10Var3 = (f10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList5 = f10Var3.L;
                f10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    f10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    f10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList5.clear();
                    arrayList5.addAll(tL_chatlists_exportedInvites.invites);
                    f10Var3.w0();
                }
                f10Var3.M = 0;
                break;
            case 17:
                f10 f10Var4 = (f10) obj2;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj;
                MessagesController.DialogFilter dialogFilter = f10Var4.r;
                if (b2Var != null) {
                    try {
                        b2Var.dismiss();
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                f10Var4.getMessagesController().removeFilter(dialogFilter);
                f10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                f10Var4.finishFragment();
                break;
            case 18:
                f10 f10Var5 = (f10) obj2;
                f10Var5.getClass();
                f10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 19:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.x = true;
                    break;
                }
                break;
            case 20:
                FiltersSetupActivity filtersSetupActivity2 = ((e20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 21:
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = ((j60) obj2).Y1;
                for (int i16 = 0; i16 < arrayList7.size(); i16++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList7.get(i16)).w != null) {
                        arrayList6.remove(((org.telegram.ui.Components.voip.t) arrayList7.get(i16)).w);
                    }
                }
                while (i13 < arrayList6.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList6.get(i13);
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
            case 22:
                j60 j60Var = (j60) obj2;
                j60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                j60Var.dismiss();
                break;
            case 23:
                w5 w5Var = (w5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.q2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new yt(i12, w5Var, di.n0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 24:
                ((j60) ((w5) obj2).b).U0.setNewColors((int[]) obj);
                break;
            case 25:
                u70.V((u70) obj2, (TLRPC.TL_error) obj);
                break;
            case 26:
                q70 q70Var = (q70) obj2;
                String str4 = (String) obj;
                r70 r70Var = q70Var.a;
                r70Var.e = str4;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str4;
                r70Var.c = r70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new ro(i12, q70Var, str4), 66);
                break;
            case 27:
                TLObject tLObject2 = (TLObject) obj;
                r70 r70Var2 = ((q70) obj2).a;
                if (tLObject2 != null) {
                    u70.a0(r70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    u70.a0(r70Var2.h, null);
                    break;
                }
            case 28:
                t70 t70Var = (t70) obj2;
                String str5 = (String) obj;
                t70Var.h = str5;
                u70 u70Var = t70Var.r;
                if (u70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str5;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str5;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                t70Var.n = u70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(t70Var, str5, str5, i11), 66);
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.c6(8, (m80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
        }
    }
}
