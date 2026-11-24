// default package

import android.app.Activity;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qy1 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qy1(c cVar, v25 v25Var, rqc rqcVar) {
        this.a = (byte) 28;
        this.b = v25Var;
        this.c = rqcVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // qac
    public final void a(Object obj) {
        k47 threadMessage;
        ArrayList<TLRPC.Document> arrayList;
        byte b = this.a;
        byte b2 = 3;
        int i = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((ry1) obj3).a;
                long j = chatActivityEnterView.G3;
                k47 k47Var = chatActivityEnterView.J3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                y5a b3 = y5a.b((String) obj2, j, k47Var, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                yv1 yv1Var = chatActivityEnterView.F3;
                b3.K = yv1Var != null ? yv1Var.X6() : null;
                b3.O = chatActivityEnterView.W6;
                b3.Q = l.longValue();
                b3.R = chatActivityEnterView.getSendMonoForumPeerId();
                b3.T = chatActivityEnterView.getSendMessageSuggestionParams();
                a6a.B(chatActivityEnterView.R).q0(b3);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                by1 by1Var = chatActivityEnterView.K0;
                chatActivityEnterView.W6 = 0L;
                by1Var.setEffect(0L);
                return;
            case 1:
                i22 i22Var = (i22) obj3;
                b22 b22Var = (b22) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i2 = i22Var.G3;
                tL_messages_toggleBotInAttachMenu.bot = oc7.r1(i2).n1(b22Var.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_toggleBotInAttachMenu, new pm(i22Var, b22Var, (byte) 19), 66);
                return;
            case 2:
                i22 i22Var2 = (i22) obj3;
                ((yv1) obj2).y5 = (v67) obj;
                boolean p1 = i22Var2.p1(true, 0, 0, i22Var2.K2, i22Var2.a1());
                oy1 oy1Var = i22Var2.b2;
                if (oy1Var != null) {
                    oy1Var.f(!p1);
                    i22Var2.b2 = null;
                    return;
                }
                return;
            case 3:
                ((e32) obj3).getWebViewContainer().D((String) obj2, (String) obj, false);
                return;
            case 4:
                s22 s22Var = (s22) obj3;
                oc7 oc7Var = (oc7) obj2;
                Long l2 = (Long) obj;
                s22Var.j0 = false;
                TLRPC.User W1 = l2 != null ? oc7Var.W1(l2) : null;
                s22Var.i0 = W1;
                s22Var.k0 = W1 == null;
                if (W1 != null) {
                    s22Var.R();
                    return;
                }
                return;
            case 5:
                oz8 oz8Var = (oz8) obj2;
                pz8 f = pz8.f(z8c.t0);
                i22 i22Var3 = ((a82) obj3).b;
                long V0 = i22Var3.V0();
                int i3 = f.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = oc7.r1(i3).i1(V0);
                tL_messages_sendQuickReplyMessages.shortcut_id = oz8Var.a;
                cf7 Y = cf7.Y(i3);
                Y.a.c(new no8((Object) f, (Object) Y, (Object) oz8Var, (Object) tL_messages_sendQuickReplyMessages, (byte) 6));
                i22Var3.dismiss();
                return;
            case 6:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str = (String) obj;
                ch9 ch9Var = ((p82) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str;
                    ch9Var.g3.O(false);
                    return;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str;
                    ch9Var.N1(pageblockmath2);
                    return;
                }
            case 7:
                a92 a92Var = (a92) obj3;
                ah7 ah7Var = a92Var.f;
                ah7Var.r(((TLRPC.WallPaper) obj2).settings.intensity, ((osc) obj).a);
                ah7Var.s(ah7Var.f());
                View view = a92Var.b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 8:
                io2 io2Var = (io2) obj3;
                io2Var.getClass();
                io2Var.a0(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                return;
            case 9:
                io2 io2Var2 = (io2) obj3;
                io2Var2.getClass();
                io2Var2.Z((String) obj2, ((Boolean) obj).booleanValue());
                return;
            case 10:
                pp2 pp2Var = (pp2) obj3;
                pp2Var.F0((TLRPC.Chat) obj2, pp2Var.o1, ((Boolean) obj).booleanValue());
                return;
            case 11:
                hx2 hx2Var = (hx2) obj3;
                d dVar = (d) obj2;
                Long l3 = (Long) obj;
                Bundle bundle = new Bundle();
                if (l3.longValue() >= 0) {
                    bundle.putLong("user_id", l3.longValue());
                } else {
                    bundle.putLong("chat_id", -l3.longValue());
                }
                dVar.presentFragment(new ProfileActivity(bundle, null));
                hx2Var.d();
                return;
            case 12:
                dx2 dx2Var = (dx2) obj3;
                Boolean bool = (Boolean) obj;
                ((qac) obj2).a(bool);
                if (bool.booleanValue()) {
                    dx2Var.a.d();
                    return;
                }
                return;
            case 13:
                nk3 nk3Var = (nk3) obj3;
                Activity activity = (Activity) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                nk3Var.showDialog(new wn7(activity, !use.a(), new wh3(activity, (byte) 0)));
                return;
            case 14:
                final to3 to3Var = (to3) obj3;
                byte[] bArr = (byte[]) obj2;
                Integer num = (Integer) obj;
                vo3 vo3Var = to3Var.b;
                if (vo3Var.h || vo3Var.g) {
                    vo3Var.r = false;
                    return;
                }
                int i4 = vo3Var.v;
                int[] iArr = vo3.F;
                final boolean z = i4 >= 0 && i4 < 4 && num.intValue() >= iArr[vo3Var.v];
                final boolean z2 = num.intValue() >= iArr[0] && num.intValue() - vo3Var.y < 100 && num.intValue() - vo3Var.z >= 100;
                vo3Var.y = num.intValue();
                if (z || z2) {
                    DictationLid.h(0, new eo3() { // from class: so3
                        @Override // eo3
                        public final void a(float[] fArr, long j2, int i5) {
                            in3 X;
                            vo3 vo3Var2 = to3.this.b;
                            vo3Var2.r = false;
                            if (fArr != null) {
                                vo3Var2.z = i5;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= 4) {
                                        i6 = 4;
                                        break;
                                    } else if (vo3.F[i6] > i5) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                                vo3Var2.v = i6;
                                ts2.w(new StringBuilder("tinyasr: tinylid "), (!z2 || z) ? "at a step" : "after a pause", "Dictation");
                                if (vo3Var2.h || vo3Var2.g) {
                                    return;
                                }
                                fo3 k = DictationLid.k(DictationLid.g(i5), fArr);
                                Log.d("Dictation", "tinyasr: tinylid " + i5 + " ms speech in " + j2 + " ms: " + k + " (route " + vo3Var2.l + ")");
                                if (k != null) {
                                    String str2 = k.a;
                                    if (!k.c || (X = DictationAsr.X(str2, vo3Var2.l, false)) == null) {
                                        return;
                                    }
                                    gn3 gn3Var = (gn3) X.b;
                                    in3 in3Var = vo3Var2.l;
                                    if (gn3Var == ((gn3) in3Var.b) && ((String) X.c).equals((String) in3Var.c)) {
                                        vo3Var2.s = true;
                                        DictationLid.i(str2);
                                        vo3Var2.k(str2);
                                    } else if (!vo3Var2.s || k.b >= 0.8f) {
                                        vo3Var2.s = true;
                                        DictationLid.i(str2);
                                        vo3Var2.k(str2);
                                        Log.d("Dictation", "tinyasr: switching to " + X);
                                        vo3Var2.i(X);
                                    }
                                }
                            }
                        }
                    }, vo3Var.a(), bArr);
                    return;
                } else {
                    vo3Var.r = false;
                    return;
                }
            case 15:
                nx3 nx3Var = (nx3) obj3;
                iuc iucVar = (iuc) obj;
                kx3 kx3Var = ((kx3[]) obj2)[0];
                StringBuilder sb = new StringBuilder();
                sb.append(iucVar == null ? "🌤" : iucVar.c);
                sb.append(" ");
                sb.append(iucVar == null ? juc.a() ? "24°C" : "72°F" : iucVar.a());
                CharSequence m = gw3.m(sb.toString(), nx3Var.b.getFontMetricsInt(), false, null, 0);
                TextPaint textPaint = kx3Var.o.b;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(m, textPaint, gm.q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                kx3Var.k = staticLayout;
                kx3Var.l = staticLayout.getLineCount() > 0 ? kx3Var.k.getLineWidth(0) : 0.0f;
                kx3Var.m = kx3Var.k.getLineCount() > 0 ? kx3Var.k.getLineLeft(0) : 0.0f;
                kx3Var.b = gm.N(17.6f) + kx3Var.l;
                kx3Var.c = gm.N(36.0f);
                nx3Var.invalidate();
                nx3Var.requestLayout();
                return;
            case 16:
                yy3 yy3Var = (yy3) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) != null || zArr[0]) {
                    return;
                }
                zArr[0] = true;
                gm.c3(new xy3(yy3Var, 1 == true ? 1 : 0));
                return;
            case 17:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                pv3 pv3Var = (pv3) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                pv3Var.run();
                return;
            case 18:
                d24 d24Var = (d24) obj3;
                e24 e24Var = d24Var.a;
                e34 e34Var = e24Var.G;
                hs6.d0(e34Var.d1).X(e34Var.X0, e24Var.w, false, new wu2((Object) d24Var, obj2, obj, (byte) 9), gda.E || z8c.h(e34Var.d1).p(), false, true, false, 25);
                return;
            case 19:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                e24 e24Var2 = ((d24) obj3).a;
                if (ConnectionsManager.getInstance(e24Var2.G.d1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    e24Var2.F(runnable, arrayList2, false);
                    return;
                }
            case 20:
                y24 y24Var = (y24) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i < size) {
                    Object obj4 = arrayList3.get(i);
                    i++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet m0 = hs6.d0(y24Var.x.R.d1).m0(hs6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        arrayList = m0 != null ? m0.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        y24Var.n.add(new x14(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 21:
                z28 z28Var = (z28) obj2;
                Integer num2 = (Integer) obj;
                qf4 qf4Var = ((nf4) obj3).e;
                if (!qf4Var.getUserConfig().p()) {
                    qf4Var.showDialog(new kj8((d) qf4Var, 35, true));
                    return;
                }
                int intValue = num2.intValue();
                qf4Var.F = intValue;
                z28Var.a(intValue, true);
                ef4 ef4Var = qf4Var.J;
                if (ef4Var != null) {
                    ef4Var.d(!qf4Var.getUserConfig().p() ? -1 : qf4Var.F, true);
                }
                qf4Var.l0(true);
                return;
            case 22:
                ln4 ln4Var = (ln4) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                d dVar2 = (d) obj;
                if (ln4Var.V1 != null || (ln4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    u31 I = c41.b0(dVar2).I(R.raw.folder_in, gm.S2(jb6.a0(null, null, 2131750558, ln4Var.a2)), arrayList4.size() <= 0 ? jb6.G(ln4Var.c2.size(), "FolderLinkUpdatedSubtitle", new Object[0]) : jb6.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]));
                    I.j = 5000;
                    I.j();
                    return;
                } else {
                    u31 I2 = c41.b0(dVar2).I(R.raw.contact_check, gm.S2(jb6.a0(null, null, 2131750610, ln4Var.a2)), jb6.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I2.j = 5000;
                    I2.j();
                    return;
                }
            case 23:
                ux4 ux4Var = (ux4) obj3;
                qac qacVar = (qac) obj2;
                Boolean bool2 = (Boolean) obj;
                if (qacVar != null) {
                    qacVar.a(bool2);
                }
                if (bool2.booleanValue()) {
                    ux4Var.O0 = true;
                }
                ux4Var.dismiss();
                return;
            case 24:
                r97 r97Var = (r97) obj2;
                if (((Object[]) obj)[1] == ((ava) obj3)) {
                    r97Var.run();
                    return;
                }
                return;
            case 25:
                y25 y25Var = (y25) obj3;
                try {
                    ((qac) obj2).a((String) obj);
                    y25Var.close();
                    return;
                } catch (Throwable th) {
                    y25Var.close();
                    throw th;
                }
            case 26:
                ((y25) obj3).close();
                ((qqc) obj2).a((String) obj);
                return;
            case 27:
                ((c) obj3).q.put((TL_wallet.walletTransaction) obj, (qac) obj2);
                return;
            case 28:
                v25 v25Var = (v25) obj3;
                rqc rqcVar = (rqc) obj2;
                String str2 = (String) obj;
                if (str2 == null) {
                    c.O("prepare disable backup: done!");
                    rqcVar.a(v25Var, null);
                    return;
                } else {
                    v25Var.close();
                    c.m("prepare disable backup, failed to save secret phrase to local storage: ".concat(str2));
                    rqcVar.a(null, str2);
                    return;
                }
            default:
                c cVar = (c) obj3;
                sqc sqcVar = (sqc) obj2;
                String str3 = (String) obj;
                if (str3 != null) {
                    c.m("disableBackupWithoutUpdatingPhrase: ".concat(str3));
                    sqcVar.a(str3);
                    return;
                } else {
                    c.O("sending disableBackup to server");
                    e08.a(cVar.a, new pb((byte) 6), null, null, null, new qp0(cVar, sqcVar, b2), true, true, new s34((qn4) null, (c25) null));
                    return;
                }
        }
    }

    public /* synthetic */ qy1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
