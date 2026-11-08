package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qf(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.Chat M0;
        int i7 = this.a;
        org.telegram.messenger.ij ijVar = null;
        char c10 = 1;
        Object[] objArr = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                an.a0((an) obj2, (org.telegram.ui.Components.k60) obj);
                break;
            case 1:
                an anVar = (an) obj2;
                anVar.getClass();
                anVar.presentFragment(ProfileActivity.A4(((TLRPC.User[]) obj)[0].id));
                break;
            case 2:
                an anVar2 = (an) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                q1Var.getLocationInWindow(new int[2]);
                anVar2.N1.setTranslationY(q1Var.getTimeY() + ((r0[1] - r3.getTop()) - org.telegram.messenger.g0.L(120.0f)));
                anVar2.N1.p(0.0f, ((((-org.telegram.messenger.g0.L(16.0f)) + r0[0]) + q1Var.B9) + q1Var.z9) - (q1Var.C9 / 2.0f));
                anVar2.N1.w();
                break;
            case 3:
                ((bi.z2) obj2).a((TLRPC.User) obj);
                break;
            case 4:
                an.r1((an) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 5:
                an anVar3 = (an) obj2;
                int[] iArr = (int[]) obj;
                anVar3.getClass();
                if (iArr[0] != 0) {
                    anVar3.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 6:
                ((an) obj2).w8((pg) obj);
                break;
            case 7:
                an anVar4 = (an) obj2;
                vf.c.q(anVar4.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), anVar4.v8 == 0, false);
                break;
            case 8:
                ((an) obj2).Ka((TLRPC.Chat) obj);
                break;
            case 9:
                an.H1((an) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 10:
                an anVar5 = (an) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131745305, null), anVar5);
                    break;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131753955, null), anVar5);
                    break;
                } else {
                    org.telegram.ui.Components.v4.t0(tL_error.text, anVar5);
                    break;
                }
            case 11:
                a0.h hVar = (a0.h) obj2;
                n6 n6Var = (n6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    ijVar = (org.telegram.messenger.ij) ((ArrayList) hVar.n(0)).get(0);
                }
                if (ijVar != null && (message = ijVar.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i10 = 0; i10 < ijVar.k.media.webpage.attributes.size(); i10++) {
                        TLRPC.WebPageAttribute webPageAttribute = ijVar.k.media.webpage.attributes.get(i10);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            org.telegram.messenger.g0.h3(new qf(12, n6Var, ijVar.k.media.webpage));
                            break;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new bh(n6Var, objArr == true ? 1 : 0));
                break;
            case 12:
                ((n6) obj2).a(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 13:
                an anVar6 = (an) obj2;
                View view = (View) obj;
                if (anVar6.getParentActivity() != null) {
                    anVar6.Y0.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    anVar6.Y0.l(anVar6.K);
                    anVar6.Y0.s(16.0f);
                    anVar6.Y0.r(true);
                    anVar6.Y0.u(org.telegram.messenger.id.M0(2131753102, null));
                    anVar6.Y0.o(0.0f, 96.0f);
                    anVar6.Y0.setTranslationY(org.telegram.messenger.g0.L(10.0f) + ((view.getTop() - anVar6.Ta) - anVar6.l1.getHeight()));
                    anVar6.l1.addView(anVar6.Y0, c8.ha.e(-1, 100, 87));
                    fi.m3 m3Var = anVar6.Y0;
                    m3Var.q0 = new ae(anVar6, 3);
                    m3Var.w();
                    org.telegram.ui.Components.z20.x.b();
                    break;
                }
                break;
            case 14:
                ((an) obj2).l1.removeView((org.telegram.ui.Components.ii0) obj);
                break;
            case 15:
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj;
                an anVar7 = ((di) obj2).s;
                org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) anVar7.E6[0].get(ijVar2.f1());
                if (ijVar3 != null && ijVar3 != ijVar2) {
                    org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) anVar7.E6[0].get(ijVar2.f1());
                    ijVar4.k.reactions = ijVar2.k.reactions;
                    ijVar2 = ijVar4;
                }
                anVar7.Uc(ijVar2, true);
                ch.k0.f();
                break;
            case 16:
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) obj;
                an anVar8 = ((el) ((em) obj2).f).a.Q;
                int i11 = an.id;
                anVar8.lb();
                t0Var.getMessageObject().r = false;
                t0Var.invalidate();
                break;
            case 17:
                fi.m3 m3Var2 = (fi.m3) obj;
                an anVar9 = ((lm) obj2).a;
                anVar9.l1.removeView(m3Var2);
                if (m3Var2 == anVar9.O1) {
                    anVar9.O1 = null;
                    break;
                }
                break;
            case 18:
                Long l10 = (Long) obj;
                an anVar10 = ((fm) obj2).S2.a;
                String str = (l10.longValue() >= 0 || (M0 = anVar10.getMessagesController().M0(Long.valueOf(-l10.longValue()))) == null) ? "" : M0.title;
                org.telegram.messenger.camera.q.s(TextUtils.isEmpty(str) ? org.telegram.messenger.id.M0(2131746185, null) : org.telegram.messenger.id.a0(null, null, 2131746186, str), org.telegram.ui.Components.hc.a0(anVar10), R.raw.contact_check, 36);
                break;
            case 19:
                pn pnVar = (pn) obj2;
                pnVar.getClass();
                pnVar.presentFragment(c51.g0((TLRPC.Chat) obj, true));
                break;
            case 20:
                go goVar = (go) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = goVar.getMessagesController().h1(goVar.Z);
                goVar.h0 = goVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new z9(goVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 21:
                go goVar2 = (go) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                boolean z9 = tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                goVar2.c0 = z9;
                if (!z9 && goVar2.getUserConfig().q() && !goVar2.d0 && goVar2.y != null) {
                    goVar2.d0 = true;
                    goVar2.h0();
                    goVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new qn(goVar2, c10 == true ? 1 : 0));
                    break;
                }
                break;
            case 22:
                so.Z((so) obj2, (org.telegram.ui.ActionBar.u1[]) obj);
                break;
            case 23:
                so soVar = (so) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    soVar.getMessagesController().S3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    soVar.w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (org.telegram.messenger.t3.c0(next) || org.telegram.messenger.t3.p0(next)) {
                            it.remove();
                        }
                    }
                }
                soVar.x = false;
                soVar.y = true;
                soVar.g0();
                break;
            case 24:
                ((oo) obj2).y.d.P = false;
                ((org.telegram.ui.Components.d70) obj).run();
                break;
            case 25:
                ((oo) obj2).y.d.O = false;
                ((org.telegram.ui.Components.e70) obj).run();
                break;
            case 26:
                so soVar2 = ((oo) obj2).y.d;
                soVar2.O = false;
                soVar2.P = false;
                ((Runnable) obj).run();
                break;
            case 27:
                oo ooVar = (oo) obj2;
                ooVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                ooVar.h = true;
                ooVar.c.setChecked(true);
                break;
            case 28:
                oq oqVar = (oq) obj2;
                oqVar.getClass();
                oqVar.getMessagesController().V2(0, ((TLRPC.Updates) obj).chats.get(0).id, true);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                oq oqVar2 = ((dq) obj2).a;
                if (org.telegram.ui.Components.hc.a(oqVar2)) {
                    org.telegram.ui.Components.hc.C(user.first_name, oqVar2).j();
                    break;
                }
                break;
        }
    }
}
