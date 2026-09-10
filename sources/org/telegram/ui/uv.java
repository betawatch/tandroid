package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class uv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uv(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets;
        int i10 = this.a;
        int i11 = 14;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                wy.e0((wy) obj2, (String) obj);
                break;
            case 1:
                di.n3.j(((wy) obj2).currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, null);
                break;
            case 2:
                wy wyVar = (wy) obj2;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj;
                org.telegram.ui.ActionBar.h3 h3Var = h3VarArr[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    h3VarArr[0] = null;
                }
                AndroidUtilities.runOnUIThread(new rv(wyVar, 24), 300L);
                break;
            case 3:
                ((vy) obj).a.postOnAnimation(new rv((wy) obj2, i11));
                break;
            case 4:
                wy wyVar2 = (wy) obj2;
                wyVar2.getMessagesController().addDialogToFolder((ArrayList) obj, (wyVar2.V2 == 0 && wyVar2.X2 == 0) ? 0 : 1, -1, null, 0L);
                break;
            case 5:
                ArrayList arrayList = (ArrayList) obj;
                wy wyVar3 = ((vw) obj2).b;
                wyVar3.y3 = 2;
                wyVar3.A4(true, true);
                wyVar3.o3();
                while (i12 < arrayList.size()) {
                    long j3 = ((TLRPC.Dialog) arrayList.get(i12)).id;
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i12);
                    if (wyVar3.getMessagesController().isForum(j3) || wyVar3.getMessagesController().isMonoForumWithManageRights(j3)) {
                        wyVar3.getMessagesController().markAllTopicsAsRead(j3);
                    }
                    wyVar3.getMessagesController().markMentionsAsRead(j3, 0L);
                    MessagesController messagesController = wyVar3.getMessagesController();
                    int i13 = dialog.top_message;
                    messagesController.markDialogAsRead(j3, i13, i13, dialog.last_message_date, false, 0L, 0, true, 0);
                    i12++;
                }
                break;
            case 6:
                ((vw) obj2).d((MessagesController.DialogFilter) obj);
                break;
            case 7:
                CharSequence charSequence = (CharSequence) obj;
                wy wyVar4 = ((hx) obj2).a;
                wyVar4.H2 = null;
                org.telegram.ui.Components.xq0 xq0Var = wyVar4.G2;
                if (xq0Var != null && xq0Var.h) {
                    xq0Var.e(charSequence, false);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.p2[] p2VarArr = (org.telegram.ui.ActionBar.p2[]) obj;
                ((vx) obj2).b.removeSelfFromStack();
                if (p2VarArr[1] != null) {
                    p2VarArr[0].removeSelfFromStack();
                    p2VarArr[1].finishFragment();
                    break;
                } else {
                    p2VarArr[0].finishFragment();
                    break;
                }
            case 9:
                iz izVar = (iz) obj2;
                eo eoVar = izVar.a;
                org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(eoVar.getParentActivity(), izVar.a, ((MessageObject) obj).getInputStickerSet(), null, eoVar.Y, eoVar.getResourceProvider());
                hy0Var.setCalcMandatoryInsets(eoVar.x9());
                eoVar.showDialog(hy0Var);
                break;
            case 10:
                c00 c00Var = (c00) obj2;
                c00Var.getClass();
                ((org.telegram.ui.ActionBar.d2) obj).dismiss();
                d00 d00Var = c00Var.E;
                e00 e00Var = d00Var.c;
                Utilities.Callback callback = e00Var.x;
                if (callback != null) {
                    callback.run(e00Var.d);
                }
                d00Var.c.finishFragment();
                break;
            case 11:
                h10 h10Var = (h10) obj2;
                e00 e00Var2 = new e00(h10Var.r, ((y00) obj).m);
                e00Var2.y = new h00(h10Var, 1);
                e00Var2.x = new h00(h10Var, 2);
                h10Var.presentFragment(e00Var2);
                break;
            case 12:
                h10 h10Var2 = (h10) obj2;
                Runnable runnable = (Runnable) obj;
                h10Var2.h = false;
                h10Var2.s = false;
                h10Var2.r.flags = h10Var2.y;
                h10Var2.i0(true);
                h10Var2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 13:
                h10 h10Var3 = (h10) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList2 = h10Var3.L;
                h10Var3.N = false;
                if (tLObject instanceof TL_chatlists.TL_chatlists_exportedInvites) {
                    TL_chatlists.TL_chatlists_exportedInvites tL_chatlists_exportedInvites = (TL_chatlists.TL_chatlists_exportedInvites) tLObject;
                    h10Var3.getMessagesController().putChats(tL_chatlists_exportedInvites.chats, false);
                    h10Var3.getMessagesController().putUsers(tL_chatlists_exportedInvites.users, false);
                    arrayList2.clear();
                    arrayList2.addAll(tL_chatlists_exportedInvites.invites);
                    h10Var3.w0();
                }
                h10Var3.M = 0;
                break;
            case 14:
                h10 h10Var4 = (h10) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                MessagesController.DialogFilter dialogFilter = h10Var4.r;
                if (d2Var != null) {
                    try {
                        d2Var.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                h10Var4.getMessagesController().removeFilter(dialogFilter);
                h10Var4.getMessagesStorage().deleteDialogFilter(dialogFilter);
                h10Var4.finishFragment();
                break;
            case 15:
                h10 h10Var5 = (h10) obj2;
                h10Var5.getClass();
                h10Var5.m0(((TL_chatlists.TL_chatlists_exportedChatlistInvite) obj).invite);
                break;
            case 16:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) obj2;
                if (((TLRPC.TL_messages_toggleDialogFilterTags) obj).enabled && !filtersSetupActivity.x) {
                    filtersSetupActivity.getMessagesController().loadRemoteFilters(true);
                    filtersSetupActivity.x = true;
                    break;
                }
                break;
            case 17:
                FiltersSetupActivity filtersSetupActivity2 = ((f20) obj2).e;
                filtersSetupActivity2.getMessagesController().suggestedFilters.remove((TLRPC.TL_dialogFilterSuggested) obj);
                filtersSetupActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogFiltersUpdated, new Object[0]);
                break;
            case 18:
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = ((j60) obj2).Y1;
                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                    if (((org.telegram.ui.Components.voip.t) arrayList4.get(i14)).w != null) {
                        arrayList3.remove(((org.telegram.ui.Components.voip.t) arrayList4.get(i14)).w);
                    }
                }
                while (i12 < arrayList3.size()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList3.get(i12);
                    if (videoParticipant.participant.self) {
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().setLocalSink(null, videoParticipant.presentation);
                        }
                    } else if (VoIPService.getSharedInstance() != null) {
                        VoIPService.getSharedInstance().removeRemoteSink(videoParticipant.participant, videoParticipant.presentation);
                    }
                    i12++;
                }
                break;
            case 19:
                j60 j60Var = (j60) obj2;
                j60Var.d.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShowAlert, 6, ((TLRPC.TL_error) obj).text);
                j60Var.dismiss();
                break;
            case 20:
                x5 x5Var = (x5) obj2;
                try {
                    Bitmap bitmap = ((org.telegram.ui.Components.voip.r2) obj).e.getBitmap(100, 100);
                    if (bitmap == null) {
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(new uv(21, x5Var, bi.r0.b(bitmap, true)));
                        break;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 21:
                ((j60) ((x5) obj2).b).U0.setNewColors((int[]) obj);
                break;
            case 22:
                s70.V((s70) obj2, (TLRPC.TL_error) obj);
                break;
            case 23:
                o70 o70Var = (o70) obj2;
                String str = (String) obj;
                p70 p70Var = o70Var.a;
                p70Var.e = str;
                TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                tL_inputStickerSetShortName.short_name = str;
                p70Var.c = p70Var.h.getConnectionsManager().sendRequest(tL_messages_getStickerSet, new org.telegram.ui.Components.th(19, o70Var, str), 66);
                break;
            case 24:
                TLObject tLObject2 = (TLObject) obj;
                p70 p70Var2 = ((o70) obj2).a;
                if (tLObject2 != null) {
                    s70.a0(p70Var2.h, (TLRPC.TL_messages_stickerSet) tLObject2);
                    break;
                } else {
                    s70.a0(p70Var2.h, null);
                    break;
                }
            case 25:
                r70 r70Var = (r70) obj2;
                String str2 = (String) obj;
                r70Var.h = str2;
                s70 s70Var = r70Var.r;
                if (s70Var.N) {
                    TLRPC.TL_messages_searchEmojiStickerSets tL_messages_searchEmojiStickerSets = new TLRPC.TL_messages_searchEmojiStickerSets();
                    tL_messages_searchEmojiStickerSets.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchEmojiStickerSets;
                } else {
                    TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets2 = new TLRPC.TL_messages_searchStickerSets();
                    tL_messages_searchStickerSets2.q = str2;
                    tL_messages_searchStickerSets = tL_messages_searchStickerSets2;
                }
                r70Var.n = s70Var.getConnectionsManager().sendRequest(tL_messages_searchStickerSets, new aa(r70Var, str2, str2, i11), 66);
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new n(5, (m80) obj2, (CacheByChatsController.KeepMediaException) obj), 150L);
                break;
            case 27:
                LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) obj2;
                languageSelectActivity.e = (ArrayList) obj;
                languageSelectActivity.c.l();
                break;
            case 28:
                LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) obj2;
                String str3 = (String) obj;
                int i15 = 27;
                if (str3.trim().toLowerCase().length() == 0) {
                    AndroidUtilities.runOnUIThread(new uv(i15, languageSelectActivity2, new ArrayList()));
                    break;
                } else {
                    System.currentTimeMillis();
                    ArrayList arrayList5 = new ArrayList();
                    int size = languageSelectActivity2.h.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) languageSelectActivity2.h.get(i16);
                        if (localeInfo.name.toLowerCase().startsWith(str3) || localeInfo.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList5.add(localeInfo);
                        }
                    }
                    int size2 = languageSelectActivity2.f.size();
                    while (i12 < size2) {
                        LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) languageSelectActivity2.f.get(i12);
                        if (localeInfo2.name.toLowerCase().startsWith(str3) || localeInfo2.nameEnglish.toLowerCase().startsWith(str3)) {
                            arrayList5.add(localeInfo2);
                        }
                        i12++;
                    }
                    AndroidUtilities.runOnUIThread(new uv(i15, languageSelectActivity2, arrayList5));
                    break;
                }
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject3 = (TLObject) obj;
                Pattern pattern = LaunchActivity.B1;
                if (tLObject3 instanceof TL_account.resolvedBusinessChatLinks) {
                    TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject3;
                    MessagesController.getInstance(launchActivity.O).putUsers(resolvedbusinesschatlinks.users, false);
                    MessagesController.getInstance(launchActivity.O).putChats(resolvedbusinesschatlinks.chats, false);
                    MessagesStorage.getInstance(launchActivity.O).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
                    Bundle bundle = new Bundle();
                    TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        bundle.putLong("user_id", peer.user_id);
                    } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                        bundle.putLong("chat_id", peer.channel_id);
                    }
                    eo eoVar2 = new eo(bundle);
                    eoVar2.ia = resolvedbusinesschatlinks;
                    launchActivity.q0(eoVar2, false, true);
                    break;
                } else {
                    launchActivity.B0(org.telegram.ui.Components.d5.N(launchActivity, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
                    break;
                }
        }
    }
}
