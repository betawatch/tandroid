package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vc implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vc(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        MessageObject threadMessage;
        ArrayList<TLRPC.Document> arrayList;
        int i11 = this.a;
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i11) {
            case 0:
                yc ycVar = (yc) obj3;
                MessagesController.PeerColors peerColors = (MessagesController.PeerColors) obj2;
                View view = (View) obj;
                ycVar.getClass();
                if (view instanceof xc) {
                    xc xcVar = (xc) view;
                    xcVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, ycVar.a));
                    ycVar.b.getClass();
                    int R = RecyclerView.R(view);
                    if (peerColors != null && R >= 0 && R < peerColors.colors.size()) {
                        xcVar.a(peerColors.colors.get(R));
                        break;
                    }
                }
                break;
            case 1:
                sg.j0 j0Var = (sg.j0) obj2;
                j0Var.H1((ChannelBoostsController.CanApplyBoost) obj);
                ((qe) obj3).w0.showDialog(j0Var);
                break;
            case 2:
                fo foVar = (fo) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = foVar.getMessagesController().getInputPeer(foVar.T5);
                tL_messages_sendQuickReplyMessages.shortcut_id = ((ig.a2) obj2).a;
                foVar.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages, null);
                sk skVar = foVar.Y;
                if (skVar != null) {
                    skVar.setFieldText(null);
                    break;
                }
                break;
            case 3:
                fo foVar2 = (fo) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, foVar2.T5, foVar2.n5, foVar2.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = foVar2.H8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = foVar2.S8();
                of2.suggestionParams = foVar2.g5;
                foVar2.getSendMessagesHelper().sendMessage(of2);
                foVar2.Y.setFieldText("");
                foVar2.j9(false);
                break;
            case 4:
                fo foVar3 = (fo) obj3;
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) obj2;
                Long l4 = (Long) obj;
                if (foVar3.R3 == 1) {
                    org.telegram.ui.Components.g5.L(foVar3.getParentActivity(), foVar3.T5, new f7(foVar3, botInlineResult, l4, i12), foVar3.ea);
                    break;
                } else {
                    foVar3.gb(botInlineResult, true, 0, l4.longValue());
                    break;
                }
            case 5:
                fo.k1((fo) obj3, (n41[]) obj2, (org.telegram.ui.Components.m80) obj);
                break;
            case 6:
                ((fo) obj3).jb = true;
                ((fc) obj2).run();
                break;
            case 7:
                fo foVar4 = (fo) obj3;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) obj2;
                TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
                try {
                    a2VarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                a2VarArr[0] = null;
                if (tL_statsPollStats != null) {
                    if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                        org.telegram.messenger.q.r(R.string.PollStatsWillLater, org.telegram.ui.Components.zc.a0(foVar4), R.raw.timer_toast, 24);
                        break;
                    } else {
                        new uh.g(foVar4.getParentActivity(), foVar4.ea, tL_statsPollStats).show();
                        break;
                    }
                }
                break;
            case 8:
                fo foVar5 = (fo) obj3;
                MessageObject messageObject = (MessageObject) obj2;
                foVar5.getClass();
                TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
                if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                    foVar5.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                    break;
                }
                break;
            case 9:
                ig.a2 a2Var = (ig.a2) obj2;
                String str = (String) obj;
                fo foVar6 = ((sj) obj3).b;
                if (a2Var != null) {
                    i10 = ((org.telegram.ui.ActionBar.m2) foVar6).currentAccount;
                    ig.b2.f(i10).k(a2Var.a, str);
                }
                foVar6.Q3 = str;
                foVar6.a1.setTitle(str);
                break;
            case 10:
                MessageObject messageObject2 = (MessageObject) obj2;
                Long l10 = (Long) obj;
                fo foVar7 = ((qn) obj3).a;
                if (foVar7.i7()) {
                    SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(messageObject2.getDiceEmoji(), foVar7.T5, foVar7.n5, foVar7.X3, null, false, null, null, null, true, 0, 0, null, false);
                    of3.sendMessageChatArguments = foVar7.H8();
                    of3.dice_stake = l10.longValue();
                    foVar7.getSendMessagesHelper().sendMessage(of3);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj2;
                fo foVar8 = ((qn) obj3).a;
                if (((Boolean) obj).booleanValue()) {
                    for (int i15 = 0; i15 < foVar8.x0.getChildCount(); i15++) {
                        View childAt = foVar8.x0.getChildAt(i15);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                            if (u1Var2.getMessageObject() != null && u1Var2.getMessageObject().isSensitive()) {
                                u1Var2.h4();
                            }
                        }
                    }
                    break;
                } else {
                    if (u1Var.getMessageObject() != null) {
                        u1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
                    }
                    u1Var.h4();
                    break;
                }
                break;
            case 12:
                qn qnVar = (qn) obj3;
                vc vcVar = (vc) obj2;
                fo foVar9 = qnVar.a;
                if (((Boolean) obj).booleanValue()) {
                    foVar9.getMessagesController().setContentSettings(true);
                    org.telegram.ui.Components.zc.a0(foVar9).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new bn(qnVar, 8)), true)).k(true);
                    vcVar.run(Boolean.TRUE);
                    break;
                } else {
                    org.telegram.ui.Components.zc.a0(foVar9).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 13:
                TLRPC.Message message = (TLRPC.Message) obj2;
                ((qn) obj3).a.getMessagesController().rejectSuggestedMessage(DialogObject.getPeerDialogId(message.peer_id), message.id, (String) obj);
                break;
            case 14:
                io ioVar = (io) obj3;
                ioVar.f.t(((eg.a) obj).b, ((TLRPC.WallPaper) obj2).settings.intensity);
                View view2 = ioVar.b;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 15:
                Long l11 = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((org.telegram.ui.Components.qf) obj3).a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject3 = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of4 = SendMessagesHelper.SendMessageParams.of((String) obj2, j10, messageObject3, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                fo foVar10 = chatActivityEnterView.P2;
                of4.sendMessageChatArguments = foVar10 != null ? foVar10.H8() : null;
                of4.effect_id = chatActivityEnterView.S4;
                of4.payStars = l11.longValue();
                of4.monoForumPeer = chatActivityEnterView.getSendMonoForumPeerId();
                of4.suggestionParams = chatActivityEnterView.getSendMessageSuggestionParams();
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of4);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                org.telegram.ui.Components.ze zeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                zeVar.setEffect(0L);
                break;
            case 16:
                org.telegram.ui.Components.vi viVar = (org.telegram.ui.Components.vi) obj3;
                org.telegram.ui.Components.oi oiVar = (org.telegram.ui.Components.oi) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i16 = viVar.M1;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i16).getInputUser(oiVar.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i16).sendRequest(tL_messages_toggleBotInAttachMenu, new to(5, viVar, oiVar), 66);
                break;
            case 17:
                org.telegram.ui.Components.vi viVar2 = (org.telegram.ui.Components.vi) obj3;
                ((fo) obj2).g5 = (MessageSuggestionParams) obj;
                boolean J1 = viVar2.J1(0, true, 0, viVar2.u1(), viVar2.Q0);
                org.telegram.ui.Components.of ofVar = viVar2.h0;
                if (ofVar != null) {
                    ofVar.h(!J1);
                    viVar2.h0 = null;
                    break;
                }
                break;
            case 18:
                ((fi.q4) obj3).getWebViewContainer().F((String) obj2, (String) obj, false);
                break;
            case 19:
                org.telegram.ui.Components.hj hjVar = (org.telegram.ui.Components.hj) obj3;
                MessagesController messagesController = (MessagesController) obj2;
                Long l12 = (Long) obj;
                hjVar.i0 = false;
                TLRPC.User user = l12 != null ? messagesController.getUser(l12) : null;
                hjVar.h0 = user;
                hjVar.j0 = user == null;
                if (user != null) {
                    hjVar.R();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.ul ulVar = ((org.telegram.ui.Components.rl) obj3).b;
                ulVar.x0.b(((org.telegram.ui.Components.tl) obj2).c, ulVar.y0, true, 0, ((Long) obj).longValue());
                ulVar.b.dismiss(true);
                break;
            case 21:
                org.telegram.ui.Components.bw bwVar = (org.telegram.ui.Components.bw) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.aw(bwVar, i14));
                    break;
                }
                break;
            case 22:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                org.telegram.ui.Components.sk skVar2 = (org.telegram.ui.Components.sk) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                skVar2.run();
                break;
            case 23:
                org.telegram.ui.Components.uy uyVar = (org.telegram.ui.Components.uy) obj3;
                org.telegram.ui.Components.vy vyVar = uyVar.a;
                org.telegram.ui.Components.wz wzVar = vyVar.F;
                MediaDataController.getInstance(wzVar.c1).getEmojiSuggestions(wzVar.W0, vyVar.v, false, new androidx.car.app.utils.a(29, uyVar, (Runnable) obj, (String) obj2), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(wzVar.c1).isPremium(), false, true, 25);
                break;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                org.telegram.ui.Components.vy vyVar2 = ((org.telegram.ui.Components.uy) obj3).a;
                if (ConnectionsManager.getInstance(vyVar2.F.c1).getConnectionState() != 3) {
                    runnable.run();
                    break;
                } else {
                    org.telegram.ui.Components.vy.E(vyVar2, runnable, arrayList2, false);
                    break;
                }
            case 25:
                org.telegram.ui.Components.pz pzVar = (org.telegram.ui.Components.pz) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj4 = arrayList3.get(i13);
                    i13++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(pzVar.w.Q.c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        pzVar.n.add(new org.telegram.ui.Components.oy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 26:
                org.telegram.ui.Components.o10 o10Var = (org.telegram.ui.Components.o10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if (o10Var.a0 != null || (o10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    org.telegram.ui.Components.sc M = org.telegram.ui.Components.zc.a0(m2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, o10Var.f0)), arrayList4.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", o10Var.h0.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]), R.raw.folder_in);
                    M.j = 5000;
                    M.j();
                    break;
                } else {
                    org.telegram.ui.Components.sc M2 = org.telegram.ui.Components.zc.a0(m2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, o10Var.f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M2.j = 5000;
                    M2.j();
                    break;
                }
                break;
            case 27:
                View view3 = (View) obj3;
                org.telegram.ui.Components.d dVar = (org.telegram.ui.Components.d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view3.getWidth() > 0 && view3.getHeight() > 0) {
                    view3.getLocationOnScreen(new int[2]);
                    int clamp = Utilities.clamp((int) ((r2[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int clamp2 = Utilities.clamp((int) ((r2[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int clamp3 = Utilities.clamp((int) ((view3.getWidth() / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth() - clamp, 0);
                    int clamp4 = Utilities.clamp((int) ((view3.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight() - clamp2, 0);
                    if ((clamp != 0 || clamp2 != 0 || clamp3 != bitmap.getWidth() || clamp4 != bitmap.getHeight()) && clamp3 > 0 && clamp4 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, clamp, clamp2, clamp3, clamp4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.g6.I.q() ? 2.0f : 3.0f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? -0.2f : -0.07f);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                break;
            case 28:
                MessagesController messagesController2 = (MessagesController) obj3;
                org.telegram.ui.Components.gs0 gs0Var = (org.telegram.ui.Components.gs0) obj2;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController2.setContentSettings(true);
                    if (U != null) {
                        org.telegram.ui.Components.zc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new org.telegram.ui.Components.ud(i12, U)), true)).k(true);
                    }
                    gs0Var.run(Boolean.TRUE);
                    break;
                } else if (U != null) {
                    org.telegram.ui.Components.zc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.xv0.j((org.telegram.ui.Components.xv0) obj3, (TL_stories.StoryItem) obj2, (bi.p8) obj);
                break;
        }
    }
}
