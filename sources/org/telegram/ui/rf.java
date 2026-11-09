package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rf(int i7, Object obj, Object obj2) {
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
                cn.b0((cn) obj2, (org.telegram.ui.Components.l60) obj);
                break;
            case 1:
                cn cnVar = (cn) obj2;
                cnVar.getClass();
                cnVar.presentFragment(ProfileActivity.D4(((TLRPC.User[]) obj)[0].id));
                break;
            case 2:
                ((bi.z2) obj2).a((TLRPC.User) obj);
                break;
            case 3:
                cn cnVar2 = (cn) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                q1Var.getLocationInWindow(new int[2]);
                cnVar2.N1.setTranslationY(q1Var.getTimeY() + ((r0[1] - r3.getTop()) - org.telegram.messenger.g0.L(120.0f)));
                cnVar2.N1.p(0.0f, ((((-org.telegram.messenger.g0.L(16.0f)) + r0[0]) + q1Var.B9) + q1Var.z9) - (q1Var.C9 / 2.0f));
                cnVar2.N1.w();
                break;
            case 4:
                cn.v1((cn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 5:
                cn cnVar3 = (cn) obj2;
                int[] iArr = (int[]) obj;
                cnVar3.getClass();
                if (iArr[0] != 0) {
                    cnVar3.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 6:
                ((cn) obj2).x8((jg) obj);
                break;
            case 7:
                cn cnVar4 = (cn) obj2;
                vf.c.q(cnVar4.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), cnVar4.v8 == 0, false);
                break;
            case 8:
                ((cn) obj2).Ma((TLRPC.Chat) obj);
                break;
            case 9:
                cn.W0((cn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 10:
                cn cnVar5 = (cn) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131745302, null), cnVar5);
                    break;
                } else if (tL_error.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.v4.t0(org.telegram.messenger.id.M0(2131753955, null), cnVar5);
                    break;
                } else {
                    org.telegram.ui.Components.v4.t0(tL_error.text, cnVar5);
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
                            org.telegram.messenger.g0.h3(new rf(12, n6Var, ijVar.k.media.webpage));
                            break;
                        }
                    }
                }
                org.telegram.messenger.g0.h3(new dh(n6Var, objArr == true ? 1 : 0));
                break;
            case 12:
                ((n6) obj2).a(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 13:
                cn cnVar6 = (cn) obj2;
                View view = (View) obj;
                if (cnVar6.getParentActivity() != null) {
                    cnVar6.Y0.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    cnVar6.Y0.l(cnVar6.K);
                    cnVar6.Y0.s(16.0f);
                    cnVar6.Y0.r(true);
                    cnVar6.Y0.u(org.telegram.messenger.id.M0(2131753102, null));
                    cnVar6.Y0.o(0.0f, 96.0f);
                    cnVar6.Y0.setTranslationY(org.telegram.messenger.g0.L(10.0f) + ((view.getTop() - cnVar6.Va) - cnVar6.l1.getHeight()));
                    cnVar6.l1.addView(cnVar6.Y0, c8.ha.e(-1, 100, 87));
                    fi.m3 m3Var = cnVar6.Y0;
                    m3Var.q0 = new ae(cnVar6, 3);
                    m3Var.w();
                    org.telegram.ui.Components.a30.x.b();
                    break;
                }
                break;
            case 14:
                ((cn) obj2).l1.removeView((org.telegram.ui.Components.ji0) obj);
                break;
            case 15:
                org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) obj;
                cn cnVar7 = ((fi) obj2).s;
                org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) cnVar7.E6[0].get(ijVar2.e1());
                if (ijVar3 != null && ijVar3 != ijVar2) {
                    org.telegram.messenger.ij ijVar4 = (org.telegram.messenger.ij) cnVar7.E6[0].get(ijVar2.e1());
                    ijVar4.k.reactions = ijVar2.k.reactions;
                    ijVar2 = ijVar4;
                }
                cnVar7.Xc(ijVar2, true);
                ch.k0.f();
                break;
            case 16:
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) obj;
                cn cnVar8 = ((gl) ((gm) obj2).f).a.Q;
                int i11 = cn.kd;
                cnVar8.ob();
                t0Var.getMessageObject().r = false;
                t0Var.invalidate();
                break;
            case 17:
                fi.m3 m3Var2 = (fi.m3) obj;
                cn cnVar9 = ((nm) obj2).a;
                cnVar9.l1.removeView(m3Var2);
                if (m3Var2 == cnVar9.O1) {
                    cnVar9.O1 = null;
                    break;
                }
                break;
            case 18:
                Long l10 = (Long) obj;
                cn cnVar10 = ((hm) obj2).S2.a;
                String str = (l10.longValue() >= 0 || (M0 = cnVar10.getMessagesController().M0(Long.valueOf(-l10.longValue()))) == null) ? "" : M0.title;
                org.telegram.messenger.camera.q.s(TextUtils.isEmpty(str) ? org.telegram.messenger.id.M0(2131746182, null) : org.telegram.messenger.id.a0(null, null, 2131746183, str), org.telegram.ui.Components.hc.a0(cnVar10), R.raw.contact_check, 36);
                break;
            case 19:
                rn rnVar = (rn) obj2;
                rnVar.getClass();
                rnVar.presentFragment(d51.g0((TLRPC.Chat) obj, true));
                break;
            case 20:
                io ioVar = (io) obj2;
                String str2 = (String) obj;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = new TLRPC.TL_channels_checkUsername();
                tL_channels_checkUsername.username = str2;
                tL_channels_checkUsername.channel = ioVar.getMessagesController().h1(ioVar.Z);
                ioVar.h0 = ioVar.getConnectionsManager().sendRequest(tL_channels_checkUsername, new z9(ioVar, str2, tL_channels_checkUsername, 6), 2);
                break;
            case 21:
                io ioVar2 = (io) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                boolean z9 = tL_error2 == null || !tL_error2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH");
                ioVar2.c0 = z9;
                if (!z9 && ioVar2.getUserConfig().q() && !ioVar2.d0 && ioVar2.y != null) {
                    ioVar2.d0 = true;
                    ioVar2.h0();
                    ioVar2.getConnectionsManager().sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new sn(ioVar2, c10 == true ? 1 : 0));
                    break;
                }
                break;
            case 22:
                uo.Z((uo) obj2, (org.telegram.ui.ActionBar.u1[]) obj);
                break;
            case 23:
                uo uoVar = (uo) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                    uoVar.getMessagesController().S3(messages_chats.chats, false);
                    ArrayList<TLRPC.Chat> arrayList = messages_chats.chats;
                    uoVar.w = arrayList;
                    Iterator<TLRPC.Chat> it = arrayList.iterator();
                    while (it.hasNext()) {
                        TLRPC.Chat next = it.next();
                        if (org.telegram.messenger.t3.c0(next) || org.telegram.messenger.t3.p0(next)) {
                            it.remove();
                        }
                    }
                }
                uoVar.x = false;
                uoVar.y = true;
                uoVar.g0();
                break;
            case 24:
                ((qo) obj2).y.d.P = false;
                ((org.telegram.ui.Components.e70) obj).run();
                break;
            case 25:
                ((qo) obj2).y.d.O = false;
                ((org.telegram.ui.Components.f70) obj).run();
                break;
            case 26:
                uo uoVar2 = ((qo) obj2).y.d;
                uoVar2.O = false;
                uoVar2.P = false;
                ((Runnable) obj).run();
                break;
            case 27:
                qo qoVar = (qo) obj2;
                qoVar.getClass();
                ((TLRPC.Chat) obj).join_request = true;
                qoVar.h = true;
                qoVar.c.setChecked(true);
                break;
            case 28:
                qq qqVar = (qq) obj2;
                qqVar.getClass();
                qqVar.getMessagesController().V2(0, ((TLRPC.Updates) obj).chats.get(0).id, true);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                qq qqVar2 = ((fq) obj2).a;
                if (org.telegram.ui.Components.hc.a(qqVar2)) {
                    org.telegram.ui.Components.hc.C(user.first_name, qqVar2).j();
                    break;
                }
                break;
        }
    }
}
