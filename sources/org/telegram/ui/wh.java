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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wh(int i10, Object obj, Object obj2) {
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
                n6 n6Var = (n6) obj;
                if (iVar.m() == 1 && iVar.n(0) != null && ((ArrayList) iVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) iVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i12 = 0; i12 < messageObject.messageOwner.media.webpage.attributes.size(); i12++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i12);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new wh(n6Var, messageObject.messageOwner.media.webpage));
                            break;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new ou0(n6Var, 28));
                break;
            case 1:
                ((n6) obj).run(Boolean.TRUE, (TLRPC.WebPage) obj2);
                break;
            case 2:
                bo boVar = (bo) obj2;
                View view = (View) obj;
                if (boVar.getParentActivity() != null) {
                    boVar.K0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    boVar.K0.q(16.0f);
                    boVar.K0.p(true);
                    boVar.K0.s(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    boVar.K0.l(0.0f, 96.0f);
                    boVar.K0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - boVar.za) - boVar.X0.getHeight()));
                    boVar.X0.addView(boVar.K0, w7.x5.e(-1, 100, 87));
                    ci.f4 f4Var = boVar.K0;
                    f4Var.l0 = new sf(boVar, 7);
                    f4Var.u();
                    org.telegram.ui.Components.j40.v.b();
                    break;
                }
                break;
            case 3:
                ((bo) obj2).X0.removeView((org.telegram.ui.Components.gk0) obj);
                break;
            case 4:
                MessageObject messageObject2 = (MessageObject) obj;
                bo boVar2 = ((xi) obj2).s;
                MessageObject messageObject3 = (MessageObject) boVar2.o6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) boVar2.o6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                boVar2.qc(messageObject2, true);
                zg.l0.f();
                break;
            case 5:
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) obj;
                bo boVar3 = ((em) ((gn) obj2).f).a.Q;
                int i13 = bo.Gc;
                boVar3.Ma();
                w0Var.getMessageObject().flickerLoading = false;
                w0Var.invalidate();
                break;
            case 6:
                ci.f4 f4Var2 = (ci.f4) obj;
                bo boVar4 = ((nn) obj2).a;
                boVar4.X0.removeView(f4Var2);
                if (f4Var2 == boVar4.A1) {
                    boVar4.A1 = null;
                    break;
                }
                break;
            case 7:
                Long l4 = (Long) obj;
                bo boVar5 = ((hn) obj2).c1.a;
                String str = (l4.longValue() >= 0 || (chat = boVar5.getMessagesController().getChat(Long.valueOf(-l4.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.vc.a0(boVar5).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 8:
                wo woVar = (wo) obj2;
                woVar.getClass();
                woVar.presentFragment(ab1.d0((TLRPC.Chat) obj, true));
                break;
            case 9:
                kp kpVar = (kp) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = kpVar.getMessagesController().getInputChannel(kpVar.Z);
                kpVar.h0 = kpVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new ca(kpVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 10:
                kp kpVar2 = (kp) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                boolean z10 = tL_error == null || !tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                kpVar2.c0 = z10;
                if (!z10 && kpVar2.getUserConfig().isPremium() && !kpVar2.d0 && kpVar2.x != null) {
                    kpVar2.d0 = true;
                    kpVar2.b0();
                    kpVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new xo(kpVar2, i11));
                    break;
                }
                break;
            case 11:
                wp.U((wp) obj2, (org.telegram.ui.ActionBar.c2[]) obj);
                break;
            case 12:
                wp wpVar = (wp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    wpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    wpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                wpVar.w = false;
                wpVar.x = true;
                wpVar.b0();
                break;
            case 13:
                ((sp) obj2).x.d.P = false;
                ((org.telegram.ui.Components.i80) obj).run();
                break;
            case 14:
                ((sp) obj2).x.d.O = false;
                ((org.telegram.ui.Components.j80) obj).run();
                break;
            case 15:
                wp wpVar2 = ((sp) obj2).x.d;
                wpVar2.O = false;
                wpVar2.P = false;
                ((Runnable) obj).run();
                break;
            case 16:
                sp spVar = (sp) obj2;
                spVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                spVar.h = true;
                spVar.c.setChecked(true);
                break;
            case 17:
                ur urVar = (ur) obj2;
                urVar.getClass();
                urVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).id, 0, true);
                break;
            case 18:
                TLRPC.User user = (TLRPC.User) obj;
                ur urVar2 = ((jr) obj2).a;
                if (org.telegram.ui.Components.vc.a(urVar2)) {
                    org.telegram.ui.Components.vc.C(urVar2, user.first_name).j();
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
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    qVar.dismiss();
                    break;
                }
                break;
            case 21:
                g01 g01Var = (g01) obj;
                if (((boolean[]) obj2)[0]) {
                    g01Var.run();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.Components.ba baVar = (org.telegram.ui.Components.ba) obj2;
                TLObject tLObject2 = (TLObject) obj;
                baVar.getClass();
                if ((tLObject2 instanceof TLRPC.TL_help_appUpdate) && !((TLRPC.TL_help_appUpdate) tLObject2).can_not_skip) {
                    baVar.setVisibility(8);
                    SharedConfig.pendingAppUpdate = null;
                    SharedConfig.saveConfig();
                    break;
                }
                break;
            case 23:
                org.telegram.ui.Components.oc ocVar = (org.telegram.ui.Components.oc) obj2;
                CharSequence charSequence = (CharSequence) obj;
                ocVar.n = true;
                org.telegram.ui.Components.sb sbVar = ocVar.e;
                if (sbVar instanceof org.telegram.ui.Components.tb) {
                    org.telegram.ui.Components.ub ubVar = (org.telegram.ui.Components.ub) ((org.telegram.ui.Components.tb) sbVar);
                    ubVar.b.setText(charSequence);
                    AndroidUtilities.updateViewShow(ubVar.d, false, false, true);
                    AndroidUtilities.updateViewShow(ubVar.b, true, false, true);
                }
                ocVar.i(true);
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
                ((org.telegram.ui.Components.jd) obj2).removeView((ci.f4) obj);
                break;
            case 26:
                int i14 = ChatActivityEnterView.n5;
                ((ChatActivityEnterView) obj2).removeView((ci.f4) obj);
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
                ((org.telegram.ui.Components.qd) obj).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView2.Q, chatActivityEnterView2.P2, true);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView3 = ((org.telegram.ui.Components.qg) obj2).V;
                chatActivityEnterView3.i1 = chatActivityEnterView3.h1.getAudioRightMs() - chatActivityEnterView3.h1.getAudioLeftMs();
                MediaController.getInstance().trimCurrentRecording(chatActivityEnterView3.h1.getAudioLeftMs(), chatActivityEnterView3.h1.getAudioRightMs(), (org.telegram.ui.Components.ng) obj);
                break;
        }
    }

    public /* synthetic */ wh(n6 n6Var, TLRPC.WebPage webPage) {
        this.a = 1;
        this.b = n6Var;
        this.c = webPage;
    }
}
