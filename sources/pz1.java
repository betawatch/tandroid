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
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pz1 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pz1(c cVar, v05 v05Var, poc pocVar) {
        this.a = (byte) 27;
        this.b = v05Var;
        this.c = pocVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // p8c
    public final void a(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        byte b = this.a;
        byte b2 = 3;
        byte b3 = 9;
        int i = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                x02 x02Var = (x02) obj3;
                q02 q02Var = (q02) obj2;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i2 = x02Var.G3;
                tL_messages_toggleBotInAttachMenu.bot = na7.q1(i2).m1(q02Var.c.bot_id);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_toggleBotInAttachMenu, new pl(x02Var, q02Var, (byte) 19), 66);
                return;
            case 1:
                x02 x02Var2 = (x02) obj3;
                ((mu1) obj2).y5 = (u47) obj;
                boolean p1 = x02Var2.p1(true, 0, 0, x02Var2.K2, x02Var2.a1());
                bx1 bx1Var = x02Var2.b2;
                if (bx1Var != null) {
                    bx1Var.f(!p1);
                    x02Var2.b2 = null;
                    return;
                }
                return;
            case 2:
                ((s12) obj3).getWebViewContainer().D((String) obj2, (String) obj, false);
                return;
            case 3:
                h12 h12Var = (h12) obj3;
                na7 na7Var = (na7) obj2;
                Long l = (Long) obj;
                h12Var.j0 = false;
                TLRPC.User V1 = l != null ? na7Var.V1(l) : null;
                h12Var.i0 = V1;
                h12Var.k0 = V1 == null;
                if (V1 != null) {
                    h12Var.S();
                    return;
                }
                return;
            case 4:
                nx8 nx8Var = (nx8) obj2;
                ox8 f = ox8.f(y6c.t0);
                x02 x02Var3 = ((p62) obj3).b;
                long V0 = x02Var3.V0();
                int i3 = f.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages.peer = na7.q1(i3).h1(V0);
                tL_messages_sendQuickReplyMessages.shortcut_id = nx8Var.a;
                ad7 Y = ad7.Y(i3);
                Y.a.c(new bm8((Object) f, (Object) Y, (Object) nx8Var, (Object) tL_messages_sendQuickReplyMessages, (byte) 6));
                x02Var3.dismiss();
                return;
            case 5:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str = (String) obj;
                ye9 ye9Var = ((e72) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str;
                    ye9Var.g3.O(false);
                    return;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str;
                    ye9Var.N1(pageblockmath2);
                    return;
                }
            case 6:
                p72 p72Var = (p72) obj3;
                ye7 ye7Var = p72Var.f;
                ye7Var.r(((TLRPC.WallPaper) obj2).settings.intensity, ((mqc) obj).a);
                ye7Var.s(ye7Var.f());
                View view = p72Var.b;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 7:
                xm2 xm2Var = (xm2) obj3;
                xm2Var.getClass();
                xm2Var.Z(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                return;
            case 8:
                xm2 xm2Var2 = (xm2) obj3;
                xm2Var2.getClass();
                xm2Var2.Y((String) obj2, ((Boolean) obj).booleanValue());
                return;
            case 9:
                eo2 eo2Var = (eo2) obj3;
                eo2Var.F0((TLRPC.Chat) obj2, eo2Var.o1, ((Boolean) obj).booleanValue());
                return;
            case 10:
                xv2 xv2Var = (xv2) obj3;
                d dVar = (d) obj2;
                Long l2 = (Long) obj;
                Bundle bundle = new Bundle();
                if (l2.longValue() >= 0) {
                    bundle.putLong("user_id", l2.longValue());
                } else {
                    bundle.putLong("chat_id", -l2.longValue());
                }
                dVar.presentFragment(new ProfileActivity(bundle, null));
                xv2Var.d();
                return;
            case 11:
                tv2 tv2Var = (tv2) obj3;
                Boolean bool = (Boolean) obj;
                ((p8c) obj2).a(bool);
                if (bool.booleanValue()) {
                    tv2Var.a.d();
                    return;
                }
                return;
            case 12:
                cj3 cj3Var = (cj3) obj3;
                Activity activity = (Activity) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                cj3Var.showDialog(new tl7(activity, !rqe.a(), new jg3(activity, (byte) 0)));
                return;
            case 13:
                final jn3 jn3Var = (jn3) obj3;
                byte[] bArr = (byte[]) obj2;
                Integer num = (Integer) obj;
                ln3 ln3Var = jn3Var.b;
                if (ln3Var.h || ln3Var.g) {
                    ln3Var.r = false;
                    return;
                }
                int i4 = ln3Var.v;
                int[] iArr = ln3.F;
                final boolean z = i4 >= 0 && i4 < 4 && num.intValue() >= iArr[ln3Var.v];
                final boolean z2 = num.intValue() >= iArr[0] && num.intValue() - ln3Var.y < 100 && num.intValue() - ln3Var.z >= 100;
                ln3Var.y = num.intValue();
                if (z || z2) {
                    DictationLid.h(0, new um3() { // from class: in3
                        @Override // um3
                        public final void a(float[] fArr, long j, int i5) {
                            xl3 X;
                            ln3 ln3Var2 = jn3.this.b;
                            ln3Var2.r = false;
                            if (fArr != null) {
                                ln3Var2.z = i5;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= 4) {
                                        i6 = 4;
                                        break;
                                    } else if (ln3.F[i6] > i5) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                                ln3Var2.v = i6;
                                ir2.x(new StringBuilder("tinyasr: tinylid "), (!z2 || z) ? "at a step" : "after a pause", "Dictation");
                                if (ln3Var2.h || ln3Var2.g) {
                                    return;
                                }
                                vm3 k = DictationLid.k(DictationLid.g(i5), fArr);
                                Log.d("Dictation", "tinyasr: tinylid " + i5 + " ms speech in " + j + " ms: " + k + " (route " + ln3Var2.l + ")");
                                if (k != null) {
                                    String str2 = k.a;
                                    if (!k.c || (X = DictationAsr.X(str2, ln3Var2.l, false)) == null) {
                                        return;
                                    }
                                    vl3 vl3Var = (vl3) X.b;
                                    xl3 xl3Var = ln3Var2.l;
                                    if (vl3Var == ((vl3) xl3Var.b) && ((String) X.c).equals((String) xl3Var.c)) {
                                        ln3Var2.s = true;
                                        DictationLid.i(str2);
                                        ln3Var2.k(str2);
                                    } else if (!ln3Var2.s || k.b >= 0.8f) {
                                        ln3Var2.s = true;
                                        DictationLid.i(str2);
                                        ln3Var2.k(str2);
                                        Log.d("Dictation", "tinyasr: switching to " + X);
                                        ln3Var2.i(X);
                                    }
                                }
                            }
                        }
                    }, ln3Var.a(), bArr);
                    return;
                } else {
                    ln3Var.r = false;
                    return;
                }
            case 14:
                cw3 cw3Var = (cw3) obj3;
                fsc fscVar = (fsc) obj;
                zv3 zv3Var = ((zv3[]) obj2)[0];
                StringBuilder sb = new StringBuilder();
                sb.append(fscVar == null ? "🌤" : fscVar.c);
                sb.append(" ");
                sb.append(fscVar == null ? gsc.a() ? "24°C" : "72°F" : fscVar.a());
                CharSequence m = vu3.m(sb.toString(), cw3Var.b.getFontMetricsInt(), false, null, 0);
                TextPaint textPaint = zv3Var.o.b;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(m, textPaint, gl.q.x * 0.8f, TextUtils.TruncateAt.END), textPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                zv3Var.k = staticLayout;
                zv3Var.l = staticLayout.getLineCount() > 0 ? zv3Var.k.getLineWidth(0) : 0.0f;
                zv3Var.m = zv3Var.k.getLineCount() > 0 ? zv3Var.k.getLineLeft(0) : 0.0f;
                zv3Var.b = gl.N(17.6f) + zv3Var.l;
                zv3Var.c = gl.N(36.0f);
                cw3Var.invalidate();
                cw3Var.requestLayout();
                return;
            case 15:
                ox3 ox3Var = (ox3) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) != null || zArr[0]) {
                    return;
                }
                zArr[0] = true;
                gl.d3(new nx3(ox3Var, 1 == true ? 1 : 0));
                return;
            case 16:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                eu3 eu3Var = (eu3) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                eu3Var.run();
                return;
            case 17:
                s04 s04Var = (s04) obj3;
                t04 t04Var = s04Var.a;
                t14 t14Var = t04Var.G;
                hq6.d0(t14Var.d1).X(t14Var.X0, t04Var.w, false, new lt2(s04Var, (String) obj2, (Runnable) obj, b3), gba.E || y6c.h(t14Var.d1).p(), false, true, false, 25);
                return;
            case 18:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                t04 t04Var2 = ((s04) obj3).a;
                if (ConnectionsManager.getInstance(t04Var2.G.d1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    t04Var2.F(runnable, arrayList2, false);
                    return;
                }
            case 19:
                n14 n14Var = (n14) obj3;
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
                        TLRPC.TL_messages_stickerSet m0 = hq6.d0(n14Var.x.R.d1).m0(hq6.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        arrayList = m0 != null ? m0.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        n14Var.n.add(new m04(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 20:
                w08 w08Var = (w08) obj2;
                Integer num2 = (Integer) obj;
                pd4 pd4Var = ((md4) obj3).e;
                if (!pd4Var.getUserConfig().p()) {
                    pd4Var.showDialog(new jh8((d) pd4Var, 35, true));
                    return;
                }
                int intValue = num2.intValue();
                pd4Var.F = intValue;
                w08Var.a(intValue, true);
                ed4 ed4Var = pd4Var.J;
                if (ed4Var != null) {
                    ed4Var.d(!pd4Var.getUserConfig().p() ? -1 : pd4Var.F, true);
                }
                pd4Var.k0(true);
                return;
            case 21:
                ll4 ll4Var = (ll4) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                d dVar2 = (d) obj;
                if (ll4Var.V1 != null || (ll4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    m21 I = u21.b0(dVar2).I(R.raw.folder_in, gl.T2(k96.a0(null, null, 2131750609, ll4Var.a2)), arrayList4.size() <= 0 ? k96.G(ll4Var.c2.size(), "FolderLinkUpdatedSubtitle", new Object[0]) : k96.G(arrayList4.size(), "FolderLinkUpdatedJoinedSubtitle", new Object[0]));
                    I.j = 5000;
                    I.j();
                    return;
                } else {
                    m21 I2 = u21.b0(dVar2).I(R.raw.contact_check, gl.T2(k96.a0(null, null, 2131750661, ll4Var.a2)), k96.G(arrayList4.size(), "FolderLinkAddedSubtitle", new Object[0]));
                    I2.j = 5000;
                    I2.j();
                    return;
                }
            case 22:
                tv4 tv4Var = (tv4) obj3;
                p8c p8cVar = (p8c) obj2;
                Boolean bool2 = (Boolean) obj;
                if (p8cVar != null) {
                    p8cVar.a(bool2);
                }
                if (bool2.booleanValue()) {
                    tv4Var.O0 = true;
                }
                tv4Var.dismiss();
                return;
            case 23:
                o77 o77Var = (o77) obj2;
                if (((Object[]) obj)[1] == ((xsa) obj3)) {
                    o77Var.run();
                    return;
                }
                return;
            case 24:
                y05 y05Var = (y05) obj3;
                try {
                    ((p8c) obj2).a((String) obj);
                    y05Var.close();
                    return;
                } catch (Throwable th) {
                    y05Var.close();
                    throw th;
                }
            case 25:
                ((y05) obj3).close();
                ((ooc) obj2).a((String) obj);
                return;
            case 26:
                ((c) obj3).q.put((TL_wallet.walletTransaction) obj, (p8c) obj2);
                return;
            case 27:
                v05 v05Var = (v05) obj3;
                poc pocVar = (poc) obj2;
                String str2 = (String) obj;
                if (str2 == null) {
                    c.O("prepare disable backup: done!");
                    pocVar.a(v05Var, null);
                    return;
                } else {
                    v05Var.close();
                    c.m("prepare disable backup, failed to save secret phrase to local storage: ".concat(str2));
                    pocVar.a(null, str2);
                    return;
                }
            case 28:
                c cVar = (c) obj3;
                qoc qocVar = (qoc) obj2;
                String str3 = (String) obj;
                if (str3 != null) {
                    c.m("disableBackupWithoutUpdatingPhrase: ".concat(str3));
                    qocVar.a(str3);
                    return;
                } else {
                    c.O("sending disableBackup to server");
                    cy7.a(cVar.a, new pb((byte) 6), null, null, null, new qo0(cVar, qocVar, b2), true, true, new h24((iu4) null, (c05) null));
                    return;
                }
            default:
                gl.d3(new jf4((r25) obj3, (hj3) obj2, (String) obj, b3));
                return;
        }
    }

    public /* synthetic */ pz1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
