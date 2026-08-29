package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vf(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.Chat chat;
        int i10 = this.a;
        MessageObject messageObject = null;
        int i11 = 2;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((jh.g2) obj2).run((TLRPC.User) obj);
                break;
            case 1:
                tn tnVar = (tn) obj2;
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                s1Var.getLocationInWindow(new int[2]);
                tnVar.v1.setTranslationY(s1Var.getTimeY() + ((r0[1] - r3.getTop()) - AndroidUtilities.dp(120.0f)));
                tnVar.v1.n(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r0[0]) + s1Var.nb) + s1Var.lb) - (s1Var.ob / 2.0f));
                tnVar.v1.v();
                break;
            case 2:
                tn.M0((tn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 3:
                tn tnVar2 = (tn) obj2;
                int[] iArr = (int[]) obj;
                tnVar2.getClass();
                if (iArr[0] != 0) {
                    tnVar2.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 4:
                ((tn) obj2).h8((vg) obj);
                break;
            case 5:
                tn tnVar3 = (tn) obj2;
                ye.d.p(tnVar3.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), tnVar3.b8 == 0, false);
                break;
            case 6:
                ((tn) obj2).ka((TLRPC.Chat) obj);
                break;
            case 7:
                tn.d0((tn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 8:
                tn tnVar4 = (tn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.c5.w0(tnVar4, LocaleController.getString(R.string.SlowmodeSendError));
                    break;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.c5.w0(tnVar4, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    break;
                } else {
                    org.telegram.ui.Components.c5.w0(tnVar4, tL_error.text);
                    break;
                }
            case 9:
                a0.h hVar = (a0.h) obj2;
                l6 l6Var = (l6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    messageObject = (MessageObject) ((ArrayList) hVar.n(0)).get(0);
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i12 = 0; i12 < messageObject.messageOwner.media.webpage.attributes.size(); i12++) {
                        TLRPC.WebPageAttribute webPageAttribute = messageObject.messageOwner.media.webpage.attributes.get(i12);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            AndroidUtilities.runOnUIThread(new vf(10, l6Var, messageObject.messageOwner.media.webpage));
                            break;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new it0(l6Var, 28));
                break;
            case 10:
                ((l6) obj2).run(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 11:
                tn tnVar5 = (tn) obj2;
                View view = (View) obj;
                if (tnVar5.getParentActivity() != null) {
                    tnVar5.G0.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    tnVar5.G0.r(16.0f);
                    tnVar5.G0.q(true);
                    tnVar5.G0.t(LocaleController.getString(R.string.BotCantReadChatTooltip));
                    tnVar5.G0.m(0.0f, 96.0f);
                    tnVar5.G0.setTranslationY(AndroidUtilities.dp(10.0f) + ((view.getTop() - tnVar5.va) - tnVar5.T0.getHeight()));
                    tnVar5.T0.addView(tnVar5.G0, i7.f6.e(-1, 100, 87));
                    nh.t3 t3Var = tnVar5.G0;
                    t3Var.h0 = new df(tnVar5, 7);
                    t3Var.v();
                    org.telegram.ui.Components.h40.v.b();
                    break;
                }
                break;
            case 12:
                ((tn) obj2).T0.removeView((org.telegram.ui.Components.fk0) obj);
                break;
            case 13:
                MessageObject messageObject2 = (MessageObject) obj;
                tn tnVar6 = ((ni) obj2).s;
                MessageObject messageObject3 = (MessageObject) tnVar6.k6[0].get(messageObject2.getId());
                if (messageObject3 != null && messageObject3 != messageObject2) {
                    MessageObject messageObject4 = (MessageObject) tnVar6.k6[0].get(messageObject2.getId());
                    messageObject4.messageOwner.reactions = messageObject2.messageOwner.reactions;
                    messageObject2 = messageObject4;
                }
                tnVar6.qc(messageObject2, true);
                kg.m0.f();
                break;
            case 14:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) obj;
                tn tnVar7 = ((vl) ((ym) obj2).f).a.M;
                int i13 = tn.Dc;
                tnVar7.Ma();
                v0Var.getMessageObject().flickerLoading = false;
                v0Var.invalidate();
                break;
            case 15:
                nh.t3 t3Var2 = (nh.t3) obj;
                tn tnVar8 = ((fn) obj2).a;
                tnVar8.T0.removeView(t3Var2);
                if (t3Var2 == tnVar8.w1) {
                    tnVar8.w1 = null;
                    break;
                }
                break;
            case 16:
                Long l10 = (Long) obj;
                tn tnVar9 = ((zm) obj2).Y0.a;
                String str = (l10.longValue() >= 0 || (chat = tnVar9.getMessagesController().getChat(Long.valueOf(-l10.longValue()))) == null) ? "" : chat.title;
                org.telegram.ui.Components.tc.a0(tnVar9).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.RepostedToProfile) : LocaleController.formatString(R.string.RepostedToChannelProfile, str))).j();
                break;
            case 17:
                ko koVar = (ko) obj2;
                koVar.getClass();
                koVar.presentFragment(t91.d0((TLRPC.Chat) obj, true));
                break;
            case 18:
                yo yoVar = (yo) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = yoVar.getMessagesController().getInputChannel(yoVar.V);
                yoVar.d0 = yoVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new x9(yoVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 19:
                yo yoVar2 = (yo) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                boolean z10 = tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                yoVar2.Y = z10;
                if (!z10 && yoVar2.getUserConfig().isPremium() && !yoVar2.Z && yoVar2.x != null) {
                    yoVar2.Z = true;
                    yoVar2.b0();
                    yoVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new lo(yoVar2, i11));
                    break;
                }
                break;
            case 20:
                kp.U((kp) obj2, (org.telegram.ui.ActionBar.c2[]) obj);
                break;
            case 21:
                kp kpVar = (kp) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    kpVar.getMessagesController().putChats(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    kpVar.v = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (ChatObject.isForum(next) || ChatObject.isMonoForum(next)) {
                            it.remove();
                        }
                    }
                }
                kpVar.w = false;
                kpVar.x = true;
                kpVar.b0();
                break;
            case 22:
                ((gp) obj2).x.d.L = false;
                ((org.telegram.ui.Components.e80) obj).run();
                break;
            case 23:
                ((gp) obj2).x.d.K = false;
                ((org.telegram.ui.Components.f80) obj).run();
                break;
            case 24:
                kp kpVar2 = ((gp) obj2).x.d;
                kpVar2.K = false;
                kpVar2.L = false;
                ((Runnable) obj).run();
                break;
            case 25:
                gp gpVar = (gp) obj2;
                gpVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                gpVar.h = true;
                gpVar.c.setChecked(true);
                break;
            case 26:
                jr jrVar = (jr) obj2;
                jrVar.getClass();
                jrVar.getMessagesController().loadFullChat(((TLRPC.Updates) obj).chats.get(0).id, 0, true);
                break;
            case 27:
                TLRPC.User user = (TLRPC.User) obj;
                jr jrVar2 = ((yq) obj2).a;
                if (org.telegram.ui.Components.tc.a(jrVar2)) {
                    org.telegram.ui.Components.tc.C(jrVar2, user.first_name).j();
                    break;
                }
                break;
            case 28:
                ((org.telegram.ui.Components.g0) obj2).q0.unsave((TL_aicompose.TL_aiComposeTone) obj);
                break;
            default:
                org.telegram.ui.Components.s sVar = (org.telegram.ui.Components.s) obj2;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) obj;
                sVar.getClass();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(tL_aiComposeTone.author_id));
                    sVar.dismiss();
                    break;
                }
                break;
        }
    }
}
