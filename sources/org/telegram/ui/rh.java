package org.telegram.ui;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rh(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.Chat chat;
        int i10 = this.a;
        int i11 = 2;
        MessageObject messageObject = null;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                a0.i iVar = (a0.i) obj2;
                m6 m6Var = (m6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i12 = 0; i12 < messageObject.messageOwner.media.webpage.attributes.size(); i12++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i12);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new rh(m6Var, messageObject.messageOwner.media.webpage));
                            break;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new fu0(m6Var, 28));
                break;
            case 1:
                ((m6) obj).run(Boolean.TRUE, (TLRPC.WebPage) obj2);
                break;
            case 2:
                xn xnVar = (xn) obj2;
                View view = (View) obj;
                if (xnVar.getParentActivity() != null) {
                    xnVar.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    xnVar.K0.q(16.0f);
                    xnVar.K0.p(true);
                    xnVar.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    xnVar.K0.l(0.0f, 96.0f);
                    xnVar.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - xnVar.za) - xnVar.X0.getHeight()));
                    xnVar.X0.addView(xnVar.K0, w7.x5.e(-1, 100, 87));
                    ci.e4 e4Var = xnVar.K0;
                    e4Var.l0 = new pf(xnVar, 7);
                    e4Var.u();
                    org.telegram.ui.Components.k40.v.b();
                    break;
                }
                break;
            case 3:
                ((xn) obj2).X0.removeView((org.telegram.ui.Components.gk0) obj);
                break;
            case 4:
                MessageObject messageObject2 = (MessageObject) obj;
                xn xnVar2 = ((ti) obj2).s;
                MessageObject messageObject3 = (MessageObject) xnVar2.o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) xnVar2.o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                xnVar2.qc(messageObject2, true);
                zg.l0.f();
                break;
            case 5:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                xn xnVar3 = ((bm) ((cn) obj2).f).a.Q;
                int i13 = xn.Gc;
                xnVar3.Ma();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                break;
            case 6:
                ci.e4 e4Var2 = (ci.e4) obj;
                xn xnVar4 = ((jn) obj2).a;
                xnVar4.X0.removeView(e4Var2);
                if (e4Var2 == xnVar4.A1) {
                    xnVar4.A1 = null;
                    break;
                }
                break;
            case 7:
                Long l4 = (Long) obj;
                xn xnVar5 = ((dn) obj2).c1.a;
                String str = (l4.longValue() >= 0 || (chat = xnVar5.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.xc.a0(xnVar5).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 8:
                so soVar = (so) obj2;
                soVar.getClass();
                soVar.presentFragment(ra1.d0((TLRPC.Chat) obj, true));
                break;
            case 9:
                gp gpVar = (gp) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = gpVar.getMessagesController().getInputChannel(gpVar.Z);
                gpVar.h0 = gpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new aa(gpVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 10:
                gp gpVar2 = (gp) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                boolean z10 = tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                gpVar2.c0 = z10;
                if (!z10 && gpVar2.getUserConfig().isPremium() && !gpVar2.d0 && gpVar2.x != null) {
                    gpVar2.d0 = true;
                    gpVar2.b0();
                    gpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new to(gpVar2, i11));
                    break;
                }
                break;
            case 11:
                sp.U((sp) obj2, (org.telegram.ui.ActionBar.b2[]) obj);
                break;
            case 12:
                sp spVar = (sp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    spVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    spVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                spVar.w = false;
                spVar.x = true;
                spVar.b0();
                break;
            case 13:
                ((op) obj2).x.d.P = false;
                ((org.telegram.ui.Components.j80) obj).run();
                break;
            case 14:
                ((op) obj2).x.d.O = false;
                ((org.telegram.ui.Components.k80) obj).run();
                break;
            case 15:
                sp spVar2 = ((op) obj2).x.d;
                spVar2.O = false;
                spVar2.P = false;
                ((Runnable) obj).run();
                break;
            case 16:
                op opVar = (op) obj2;
                opVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                opVar.h = true;
                opVar.c.setChecked(true);
                break;
            case 17:
                qr qrVar = (qr) obj2;
                qrVar.getClass();
                qrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).id, 0, true);
                break;
            case 18:
                TLRPC.User user = (TLRPC.User) obj;
                qr qrVar2 = ((fr) obj2).a;
                if (org.telegram.ui.Components.xc.a(qrVar2)) {
                    org.telegram.ui.Components.xc.C(qrVar2, user.first_name).j();
                    break;
                }
                break;
            case 19:
                ((org.telegram.ui.Components.e0) obj2).u0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                break;
            case 20:
                org.telegram.ui.Components.q qVar = (org.telegram.ui.Components.q) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                qVar.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    break;
                }
                break;
            case 21:
                xz0 xz0Var = (xz0) obj;
                if (((boolean[]) obj2)[0]) {
                    xz0Var.run();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) obj2;
                TLObject tLObject2 = (TLObject) obj;
                daVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    daVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 23:
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                qcVar.n = true;
                org.telegram.ui.Components.ub ubVar = qcVar.e;
                if (ubVar instanceof org.telegram.ui.Components.vb) {
                    org.telegram.ui.Components.wb wbVar = (org.telegram.ui.Components.wb) ((org.telegram.ui.Components.vb) ubVar);
                    wbVar.b.setText(charSequence);
                    AndroidUtilities.updateViewShow(wbVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(wbVar.b, true, false, true);
                }
                qcVar.i(true);
                break;
            case 24:
                boolean[] zArr = (boolean[]) obj2;
                Runnable runnable = (Runnable) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    runnable.run();
                    break;
                }
                break;
            case 25:
                ((org.telegram.ui.Components.ld) obj2).removeView((ci.e4) obj);
                break;
            case 26:
                int i14 = ChatActivityEnterView.n5;
                ((ChatActivityEnterView) obj2).removeView((ci.e4) obj);
                break;
            case 27:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                int i15 = ChatActivityEnterView.n5;
                chatActivityEnterView.setFieldText((CharSequence) obj);
                chatActivityEnterView.W = null;
                break;
            case 28:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) obj2;
                int i16 = ChatActivityEnterView.n5;
                ((org.telegram.ui.Components.sd) obj).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.P2, true);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView3 = ((org.telegram.ui.Components.rg) obj2).V;
                chatActivityEnterView3.i1 = chatActivityEnterView3.h1.getAudioRightMs() - chatActivityEnterView3.h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.h1.getAudioLeftMs(), chatActivityEnterView3.h1.getAudioRightMs(), (org.telegram.ui.Components.og) obj);
                break;
        }
    }

    public /* synthetic */ rh(m6 m6Var, TLRPC.WebPage webPage) {
        this.a = 1;
        this.b = m6Var;
        this.c = webPage;
    }
}
