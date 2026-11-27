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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class rx1 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rx1(c cVar, z25 z25Var, ctc ctcVar) {
        this.a = (byte) 28;
        this.b = z25Var;
        this.c = ctcVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // pcc
    public final void a(Object obj) {
        r47 threadMessage;
        ArrayList<TLRPC.Document> arrayList;
        byte b = this.a;
        byte b2 = 3;
        int i = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                ChatActivityEnterView chatActivityEnterView = ((sx1) obj3).a;
                long j = chatActivityEnterView.F3;
                r47 r47Var = chatActivityEnterView.I3;
                threadMessage = chatActivityEnterView.getThreadMessage();
                p7a b3 = p7a.b((String) obj2, j, r47Var, threadMessage, null, false, null, null, null, true, 0, 0, null, false);
                zu1 zu1Var = chatActivityEnterView.E3;
                b3.K = zu1Var != null ? zu1Var.X6() : null;
                b3.O = chatActivityEnterView.o7;
                b3.Q = l.longValue();
                b3.R = chatActivityEnterView.getSendMonoForumPeerId();
                b3.T = chatActivityEnterView.getSendMessageSuggestionParams();
                r7a.B(chatActivityEnterView.R).q0(b3);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.n0.c();
                bx1 bx1Var = chatActivityEnterView.K0;
                chatActivityEnterView.o7 = 0L;
                bx1Var.setEffect(0L);
                return;
            case 1:
                n12 n12Var = (n12) obj3;
                g12 g12Var = (g12) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i2 = n12Var.G3;
                tL_messages_toggleBotInAttachMenu.bot = uc7.s1(i2).o1(g12Var.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_toggleBotInAttachMenu, new ql(n12Var, g12Var, (byte) 18), 66);
                return;
            case 2:
                n12 n12Var2 = (n12) obj3;
                ((zu1) obj2).y5 = (b77) obj;
                boolean q1 = n12Var2.q1(true, 0, 0, n12Var2.K2, n12Var2.b1());
                ox1 ox1Var = n12Var2.b2;
                if (ox1Var != null) {
                    ox1Var.f(!q1);
                    n12Var2.b2 = null;
                    return;
                }
                return;
            case 3:
                ((j22) obj3).getWebViewContainer().D((String) obj2, (String) obj, false);
                return;
            case 4:
                x12 x12Var = (x12) obj3;
                uc7 uc7Var = (uc7) obj2;
                Long l2 = (Long) obj;
                x12Var.j0 = false;
                TLRPC.User X1 = l2 != null ? uc7Var.X1(l2) : null;
                x12Var.i0 = X1;
                x12Var.k0 = X1 == null;
                if (X1 != null) {
                    x12Var.R();
                    return;
                }
                return;
            case 5:
                a19 a19Var = (a19) obj2;
                b19 f = b19.f(yac.t0);
                n12 n12Var3 = ((f72) obj3).b;
                long W0 = n12Var3.W0();
                int i3 = f.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = uc7.s1(i3).j1(W0);
                tL_messages_sendQuickReplyMessages.shortcut_id = a19Var.a;
                kf7 a0 = kf7.a0(i3);
                a0.a.c(new vp8((Object) f, (Object) a0, (Object) a19Var, (Object) tL_messages_sendQuickReplyMessages, (byte) 7));
                n12Var3.dismiss();
                return;
            case 6:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str = (String) obj;
                pi9 pi9Var = ((v72) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str;
                    pi9Var.g3.O(false);
                    return;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str;
                    pi9Var.O1(pageblockmath2);
                    return;
                }
            case 7:
                g82 g82Var = (g82) obj3;
                ih7 ih7Var = g82Var.f;
                ih7Var.r(((TLRPC.WallPaper) obj2).settings.intensity, ((avc) obj).a);
                ih7Var.s(ih7Var.f());
                View view = g82Var.b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 8:
                qn2 qn2Var = (qn2) obj3;
                qn2Var.getClass();
                qn2Var.Z(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                return;
            case 9:
                qn2 qn2Var2 = (qn2) obj3;
                qn2Var2.getClass();
                qn2Var2.Y((String) obj2, ((Boolean) obj).booleanValue());
                return;
            case 10:
                xo2 xo2Var = (xo2) obj3;
                xo2Var.G0((TLRPC.Chat) obj2, xo2Var.o1, ((Boolean) obj).booleanValue());
                return;
            case 11:
                rw2 rw2Var = (rw2) obj3;
                e eVar = (e) obj2;
                Long l3 = (Long) obj;
                Bundle bundle = new Bundle();
                if (l3.longValue() >= 0) {
                    bundle.putLong("user_id", l3.longValue());
                } else {
                    bundle.putLong("chat_id", -l3.longValue());
                }
                eVar.presentFragment(new ProfileActivity(bundle, null));
                rw2Var.d();
                return;
            case 12:
                nw2 nw2Var = (nw2) obj3;
                Boolean bool = (Boolean) obj;
                ((pcc) obj2).a(bool);
                if (bool.booleanValue()) {
                    nw2Var.a.d();
                    return;
                }
                return;
            case 13:
                uj3 uj3Var = (uj3) obj3;
                Activity activity = (Activity) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                uj3Var.showDialog(new so7(activity, !jve.a(), new dh3(activity, (byte) 0)));
                return;
            case 14:
                final ao3 ao3Var = (ao3) obj3;
                byte[] bArr = (byte[]) obj2;
                Integer num = (Integer) obj;
                co3 co3Var = ao3Var.b;
                if (co3Var.h || co3Var.g) {
                    co3Var.r = false;
                    return;
                }
                int i4 = co3Var.v;
                int[] iArr = co3.F;
                final boolean z = i4 >= 0 && i4 < 4 && num.intValue() >= iArr[co3Var.v];
                final boolean z2 = num.intValue() >= iArr[0] && num.intValue() - co3Var.y < 100 && num.intValue() - co3Var.z >= 100;
                co3Var.y = num.intValue();
                if (z || z2) {
                    DictationLid.i(0, new ln3() { // from class: zn3
                        @Override // ln3
                        public final void a(float[] fArr, long j2, int i5) {
                            ao3 ao3Var2 = ao3.this;
                            boolean z3 = z2;
                            boolean z4 = z;
                            co3 co3Var2 = ao3Var2.b;
                            byte b4 = 0;
                            co3Var2.r = false;
                            if (fArr != null) {
                                co3Var2.z = i5;
                                int i6 = 0;
                                while (true) {
                                    int[] iArr2 = co3.F;
                                    if (i6 >= 4) {
                                        i6 = 4;
                                        break;
                                    } else if (iArr2[i6] > i5) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                                co3Var2.v = i6;
                                bs2.x(new StringBuilder("tinyasr: tinylid "), (!z3 || z4) ? "at a step" : "after a pause", "Dictation");
                                if (co3Var2.h || co3Var2.g) {
                                    return;
                                }
                                if (DictationAsr.E()) {
                                    co3Var2.c.d(DictationLid.d, fArr, i5);
                                }
                                mn3 l4 = DictationLid.l(DictationLid.h(i5), fArr);
                                Log.d("Dictation", "tinyasr: tinylid " + i5 + " ms speech in " + j2 + " ms: " + l4 + " (route " + co3Var2.l + ")");
                                if (l4 != null) {
                                    String str2 = l4.a;
                                    if (l4.c) {
                                        pm3 pm3Var = co3Var2.l;
                                        nm3 M = DictationAsr.M(str2, pm3Var, false, false);
                                        pm3 pm3Var2 = M == null ? null : new pm3(M, str2, (ArrayList) pm3Var.d, b4);
                                        if (pm3Var2 != null) {
                                            nm3 nm3Var = (nm3) pm3Var2.b;
                                            pm3 pm3Var3 = co3Var2.l;
                                            if (nm3Var == ((nm3) pm3Var3.b) && ((String) pm3Var2.c).equals((String) pm3Var3.c)) {
                                                co3Var2.s = true;
                                                DictationLid.j(str2);
                                                co3Var2.k(str2);
                                            } else if (!co3Var2.s || l4.b >= 0.8f) {
                                                co3Var2.s = true;
                                                DictationLid.j(str2);
                                                co3Var2.k(str2);
                                                Log.d("Dictation", "tinyasr: switching to " + pm3Var2);
                                                co3Var2.i(pm3Var2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }, co3Var.a(), bArr);
                    return;
                } else {
                    co3Var.r = false;
                    return;
                }
            case 15:
                xw3 xw3Var = (xw3) obj3;
                vwc vwcVar = (vwc) obj;
                uw3 uw3Var = ((uw3[]) obj2)[0];
                StringBuilder sb = new StringBuilder();
                sb.append(vwcVar == null ? "🌤" : vwcVar.c);
                sb.append(" ");
                sb.append(vwcVar == null ? wwc.a() ? "24°C" : "72°F" : vwcVar.a());
                CharSequence m = pv3.m(sb.toString(), xw3Var.b.getFontMetricsInt(), false, null, 0);
                TextPaint textPaint = uw3Var.o.b;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(m, textPaint, hl.q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                uw3Var.k = staticLayout;
                uw3Var.l = staticLayout.getLineCount() > 0 ? uw3Var.k.getLineWidth(0) : 0.0f;
                uw3Var.m = uw3Var.k.getLineCount() > 0 ? uw3Var.k.getLineLeft(0) : 0.0f;
                uw3Var.b = hl.N(17.6f) + uw3Var.l;
                uw3Var.c = hl.N(36.0f);
                xw3Var.invalidate();
                xw3Var.requestLayout();
                return;
            case 16:
                jy3 jy3Var = (jy3) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) != null || zArr[0]) {
                    return;
                }
                zArr[0] = true;
                hl.c3(new iy3(jy3Var, 1 == true ? 1 : 0));
                return;
            case 17:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                vx3 vx3Var = (vx3) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                vx3Var.run();
                return;
            case 18:
                n14 n14Var = (n14) obj3;
                o14 o14Var = n14Var.a;
                o24 o24Var = o14Var.G;
                ls6.d0(o24Var.d1).X(o24Var.X0, o14Var.w, false, new fu2((Object) n14Var, obj2, obj, (byte) 9), xea.E || yac.h(o24Var.d1).p(), false, true, false, 25);
                return;
            case 19:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                o14 o14Var2 = ((n14) obj3).a;
                if (ConnectionsManager.getInstance(o14Var2.G.d1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    o14Var2.F(runnable, arrayList2, false);
                    return;
                }
            case 20:
                i24 i24Var = (i24) obj3;
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
                        TLRPC.TL_messages_stickerSet m0 = ls6.d0(i24Var.x.R.d1).m0(ls6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        arrayList = m0 != null ? m0.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        i24Var.n.add(new h14(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 21:
                d48 d48Var = (d48) obj2;
                Integer num2 = (Integer) obj;
                nf4 nf4Var = ((kf4) obj3).e;
                if (!nf4Var.getUserConfig().p()) {
                    nf4Var.showDialog(new xk8((e) nf4Var, 35, true));
                    return;
                }
                int intValue = num2.intValue();
                nf4Var.F = intValue;
                d48Var.a(intValue, true);
                cf4 cf4Var = nf4Var.J;
                if (cf4Var != null) {
                    cf4Var.d(!nf4Var.getUserConfig().p() ? -1 : nf4Var.F, true);
                }
                nf4Var.k0(true);
                return;
            case 22:
                qn4 qn4Var = (qn4) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                e eVar2 = (e) obj;
                if (qn4Var.V1 != null || (qn4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    v21 I = d31.b0(eVar2).I(R.raw.folder_in, hl.S2(ob6.a0(null, null, 2131750586, qn4Var.a2)), arrayList4.size() <= 0 ? ob6.G(qn4Var.c2.size(), "FolderLinkUpdatedSubtitle", new Object[0]) : ob6.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]));
                    I.j = 5000;
                    I.j();
                    return;
                } else {
                    v21 I2 = d31.b0(eVar2).I(R.raw.contact_check, hl.S2(ob6.a0(null, null, 2131750638, qn4Var.a2)), ob6.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I2.j = 5000;
                    I2.j();
                    return;
                }
            case 23:
                yx4 yx4Var = (yx4) obj3;
                pcc pccVar = (pcc) obj2;
                Boolean bool2 = (Boolean) obj;
                if (pccVar != null) {
                    pccVar.a(bool2);
                }
                if (bool2.booleanValue()) {
                    yx4Var.O0 = true;
                }
                yx4Var.dismiss();
                return;
            case 24:
                da7 da7Var = (da7) obj2;
                if (((Object[]) obj)[1] == ((axa) obj3)) {
                    da7Var.run();
                    return;
                }
                return;
            case 25:
                c35 c35Var = (c35) obj3;
                try {
                    ((pcc) obj2).a((String) obj);
                    c35Var.close();
                    return;
                } catch (Throwable th) {
                    c35Var.close();
                    throw th;
                }
            case 26:
                ((c35) obj3).close();
                ((btc) obj2).a((String) obj);
                return;
            case 27:
                ((c) obj3).q.put((TL_wallet.walletTransaction) obj, (pcc) obj2);
                return;
            case 28:
                z25 z25Var = (z25) obj3;
                ctc ctcVar = (ctc) obj2;
                String str2 = (String) obj;
                if (str2 == null) {
                    c.P("prepare disable backup: done!");
                    ctcVar.a(z25Var, null);
                    return;
                } else {
                    z25Var.close();
                    c.m("prepare disable backup, failed to save secret phrase to local storage: ".concat(str2));
                    ctcVar.a(null, str2);
                    return;
                }
            default:
                c cVar = (c) obj3;
                dtc dtcVar = (dtc) obj2;
                String str3 = (String) obj;
                if (str3 != null) {
                    c.m("disableBackupWithoutUpdatingPhrase: ".concat(str3));
                    dtcVar.a(str3);
                    return;
                } else {
                    c.P("sending disableBackup to server");
                    i18.a(cVar.a, new sb((byte) 6), null, null, null, new qo0(cVar, dtcVar, b2), true, true, new c34((rj4) null, (g25) null));
                    return;
                }
        }
    }

    public /* synthetic */ rx1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
