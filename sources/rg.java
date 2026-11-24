// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.media.metrics.LogSessionId;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rg implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rg(hq6 hq6Var, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z) {
        this.a = (byte) 28;
        this.c = hq6Var;
        this.d = tLObject;
        this.e = str;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList;
        int i;
        wjb wjbVar;
        si9 si9Var;
        boolean z;
        SQLitePreparedStatement executeFast;
        int i2;
        SQLitePreparedStatement sQLitePreparedStatement;
        ArrayList arrayList2;
        int i3;
        SQLitePreparedStatement sQLitePreparedStatement2;
        byte b = 6;
        byte b2 = 15;
        byte b3 = 3;
        int i4 = 2;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r12 = null;
        String str = null;
        int i5 = 1;
        int i6 = 0;
        switch (this.a) {
            case 0:
                boolean z2 = this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                boolean[] zArr = (boolean[]) this.e;
                if (z2 && hc2.T(chat)) {
                    View c = alertDialog$Builder.a.c(-1);
                    if (c instanceof TextView) {
                        TextView textView = (TextView) c;
                        if (zArr[0]) {
                            textView.setText(k96.M0(hc2.V(chat) ? 2131752410 : 2131751518, null));
                            return;
                        }
                        if (chat.monoforum) {
                            textView.setText(k96.M0(2131748803, null));
                            return;
                        } else if (chat.megagroup) {
                            textView.setText(k96.M0(2131748799, null));
                            return;
                        } else {
                            textView.setText(k96.M0(2131748812, null));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                u21 u21Var = (u21) this.d;
                boolean z3 = this.b;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.c;
                wjb wjbVar2 = (wjb) this.e;
                m21 I = u21Var.I(R.raw.star_premium_2, z3 ? k96.M0(2131753478, "BoostingGiveawayCreated") : k96.M0(2131753589, "BoostingAwardsCreated"), gl.N2(z3 ? k96.M0(hc2.V(chat2) ? 2131753552 : 2131753551, null) : k96.M0(hc2.V(chat2) ? 2131753554 : 2131753553, null), bkb.wj, 0, new sm0(chat2), wjbVar2));
                I.j = 5000;
                I.j();
                return;
            case 2:
                t61 t61Var = (t61) this.c;
                Pair pair = (Pair) this.d;
                Object obj = this.e;
                boolean z4 = this.b;
                HashMap hashMap = t61Var.c;
                if (hashMap == null || (arrayList = (ArrayList) hashMap.get(pair)) == null) {
                    return;
                }
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    ((p8c) obj2).a(obj);
                }
                if (z4) {
                    arrayList.clear();
                    t61Var.c.remove(pair);
                    return;
                }
                return;
            case 3:
                ((CameraController) this.c).lambda$initCamera$3(this.b, (Exception) this.d, (Runnable) this.e);
                return;
            case 4:
                ((mu1) this.c).K8((String) this.d, (k27) this.e, this.b);
                return;
            case 5:
                mu1 mu1Var = (mu1) this.c;
                zjb zjbVar = (zjb) this.d;
                akb akbVar = (akb) this.e;
                boolean z5 = this.b;
                zjb i8 = akbVar.i(false);
                int i9 = zjbVar.a;
                UndoView undoView = mu1Var.N3;
                bkb.I1(akbVar, false, i9, undoView != null ? undoView.getUndoButton() : null);
                if (z5) {
                    bkb.j0(akbVar, i8, true);
                    return;
                }
                return;
            case 6:
                wt1 wt1Var = (wt1) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z6 = this.b;
                k27 k27Var = (k27) this.e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                mu1 mu1Var2 = wt1Var.a;
                ls6.s(null, null, 2131744153, new Object[]{mu1Var2.getMessagesController().y1(cf3.n(message.from_id), false)}, spannableStringBuilder);
                spannableStringBuilder.append((CharSequence) "\n\n");
                nj n = nj.n(message.suggested_post.price);
                int f = n.a == oj.b ? mu1Var2.getMessagesController().k4.g.f() : mu1Var2.getMessagesController().k4.d.f();
                if (z6) {
                    n = nj.j((n.b / 1000) * f, n.a);
                }
                if (message.suggested_post.schedule_date == 0) {
                    if (z6) {
                        ls6.s(null, null, 2131744150, new Object[]{n.g(), bc.I0(f)}, spannableStringBuilder);
                    } else {
                        ls6.s(null, null, 2131744149, new Object[]{n.g()}, spannableStringBuilder);
                    }
                } else if (z6) {
                    ls6.s(null, null, 2131744151, new Object[]{n.g(), t47.F0(message.suggested_post.schedule_date), bc.I0(f)}, spannableStringBuilder);
                } else {
                    ls6.s(null, null, 2131744148, new Object[]{n.g(), t47.F0(message.suggested_post.schedule_date)}, spannableStringBuilder);
                }
                spannableStringBuilder.append(' ');
                i = ((d) mu1Var2).currentAccount;
                ls6.s(null, null, 2131744152, new Object[]{Long.valueOf(na7.q1(i).k4.h.g(TimeUnit.HOURS))}, spannableStringBuilder);
                m21[] m21VarArr = new m21[1];
                n1 n1Var = new n1(m21VarArr, (byte) 13);
                hd[] hdVarArr = new hd[1];
                hd s0 = ij.s0(mu1Var2, k96.M0(2131744133, null), spannableStringBuilder, k96.M0(message.suggested_post.schedule_date == 0 ? 2131748058 : 2131744132, null), false, new b87((Object) wt1Var, (Object) message, (Object) hdVarArr, (Object) k27Var, (Object) n1Var, (byte) 19));
                hdVarArr[0] = s0;
                s0.setOnDismissListener(n1Var);
                if (z6 && n.a == oj.a) {
                    e11 a = f11.a(mu1Var2.getParentActivity());
                    wjbVar = ((d) mu1Var2).resourceProvider;
                    m21 G = new u21(a, wjbVar).G(R.raw.info, 10, k96.M0(2131744147, null));
                    G.j = 60000;
                    G.k(true);
                    m21VarArr[0] = G;
                    return;
                }
                return;
            case 7:
                ku1 ku1Var = (ku1) this.c;
                ku1Var.r((jy3) this.d, (TLRPC.WallPaper) this.e, this.b);
                ku1Var.o(ku1Var.h);
                at1 at1Var = ku1Var.G.m1;
                if (at1Var == null || (si9Var = at1Var.M) == null) {
                    return;
                }
                si9Var.invalidate();
                return;
            case 8:
                c32 c32Var = (c32) this.c;
                String str2 = (String) this.d;
                boolean z7 = this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                c32Var.getClass();
                String lowerCase = str2.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    gl.c3(new kx1(c32Var, new ArrayList(), b2));
                    return;
                }
                String S0 = k96.D0().S0(lowerCase, true, false);
                if (!lowerCase.equals(S0) && S0.length() != 0) {
                    str = S0;
                }
                int i10 = (str != null ? 1 : 0) + 1;
                String[] strArr = new String[i10];
                strArr[0] = lowerCase;
                if (str != null) {
                    strArr[1] = str;
                }
                ArrayList arrayList4 = new ArrayList();
                if (!z7) {
                    for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                        w22 w22Var = (w22) arrayList3.get(i11);
                        File file = w22Var.f;
                        if (file != null && !file.isDirectory()) {
                            int i12 = 0;
                            while (true) {
                                if (i12 < i10) {
                                    String str3 = strArr[i12];
                                    String str4 = w22Var.b;
                                    if (str4 != null ? str4.toLowerCase().contains(str3) : false) {
                                        arrayList4.add(w22Var);
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                    }
                }
                gl.c3(new kx1(c32Var, arrayList4, b2));
                return;
            case 9:
                f92 f92Var = (f92) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z8 = this.b;
                if (tL_error == null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                    f92Var.m0 = tL_chatInviteExported;
                    TLRPC.ChatFull chatFull = f92Var.Z;
                    if (chatFull != null) {
                        chatFull.exported_invite = tL_chatInviteExported;
                    }
                    if (z8) {
                        if (f92Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(f92Var.getParentActivity());
                        alertDialog$Builder2.a.U = k96.M0(2131745832, null);
                        alertDialog$Builder2.a.S = k96.M0(2131745830, null);
                        alertDialog$Builder2.g(k96.M0(2131747638, null), null);
                        f92Var.showDialog(alertDialog$Builder2.a);
                    }
                }
                f36 f36Var = f92Var.H;
                if (f36Var != null) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = f92Var.m0;
                    f36Var.setLink(tL_chatInviteExported2 != null ? tL_chatInviteExported2.link : null);
                    f92Var.H.c(f92Var.m0, f92Var.a0);
                    return;
                }
                return;
            case 10:
                t92 t92Var = (t92) this.d;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.c;
                boolean z9 = this.b;
                iu5 iu5Var = (iu5) this.e;
                chat3.join_to_send = z9;
                na7 messagesController = t92Var.y.d.getMessagesController();
                long j = chat3.id;
                mn6 mn6Var = new mn6(t92Var, z9, chat3, b2);
                n92 n92Var = new n92(t92Var, iu5Var, b3);
                messagesController.getClass();
                TLRPC.TL_channels_toggleJoinToSend tL_channels_toggleJoinToSend = new TLRPC.TL_channels_toggleJoinToSend();
                tL_channels_toggleJoinToSend.channel = messagesController.f1(j);
                tL_channels_toggleJoinToSend.enabled = z9;
                messagesController.getConnectionsManager().sendRequest(tL_channels_toggleJoinToSend, new k45(messagesController, mn6Var, n92Var, (byte) 22), 64);
                return;
            case 11:
                t92 t92Var2 = (t92) this.d;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.c;
                boolean z10 = this.b;
                hu5 hu5Var = (hu5) this.e;
                chat4.join_request = z10;
                t92Var2.y.d.getMessagesController().i5(chat4.id, 0L, z10, false, false, new s92(t92Var2, (byte) 0), new n92(t92Var2, hu5Var, (byte) 2));
                return;
            case 12:
                fc2 fc2Var = (fc2) this.c;
                boolean z11 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                TL_phone.getGroupParticipants getgroupparticipants = (TL_phone.getGroupParticipants) this.e;
                fc2Var.u = false;
                if (z11) {
                    fc2Var.v = false;
                }
                if (tLObject2 != null) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject2;
                    na7.q1(fc2Var.C.a).b4(groupparticipants.users, false);
                    na7.q1(fc2Var.C.a).V3(groupparticipants.chats, false);
                    fc2Var.n(groupparticipants.participants, z11, getgroupparticipants.offset, groupparticipants.next_offset, groupparticipants.version, groupparticipants.count);
                    return;
                }
                return;
            case 13:
                je2 je2Var = (je2) this.c;
                ArrayList arrayList5 = (ArrayList) this.d;
                ResultCallback resultCallback = (ResultCallback) this.e;
                boolean z12 = this.b;
                je2Var.b = new ArrayList(arrayList5);
                resultCallback.onComplete(je2Var.d((z12 ? 1 : 0) | 2));
                return;
            case 14:
                qu2 qu2Var = (qu2) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                boolean z13 = this.b;
                String str5 = (String) this.e;
                int size2 = arrayList6.size();
                boolean z14 = false;
                int i13 = 0;
                while (i13 < size2) {
                    Object obj3 = arrayList6.get(i13);
                    i13++;
                    TLRPC.User user = (TLRPC.User) obj3;
                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) qu2Var.g0.get(Long.valueOf(user.id));
                    if (tL_contact != null) {
                        qu2Var.f0.remove(tL_contact);
                        qu2Var.g0.remove(Long.valueOf(user.id));
                        z14 = true;
                    }
                }
                if (z14) {
                    qu2Var.d(false);
                }
                kk7 notificationCenter = qu2Var.getNotificationCenter();
                int i14 = na7.q5;
                notificationCenter.k(2, 1);
                qu2Var.getNotificationCenter().k(25, new Object[0]);
                if (z13) {
                    kk7.e().k(kk7.R4, 1, k96.a0("DeletedFromYourContacts", null, 2131751454, str5));
                    return;
                }
                return;
            case 15:
                bl3 bl3Var = (bl3) this.c;
                boolean z15 = this.b;
                l35 l35Var = (l35) this.d;
                yk3 yk3Var = (yk3) this.e;
                if (z15) {
                    return;
                }
                bl3Var.c = yk3Var;
                l35Var.setRightText(bl3Var.H(yk3Var));
                l35Var.setRightTextMargin(6);
                bl3Var.J.clear();
                bl3Var.d = true;
                bl3Var.f();
                bl3Var.P();
                return;
            case 16:
                lv3 lv3Var = (lv3) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                String str6 = (String) this.e;
                boolean z16 = this.b;
                nv3 nv3Var = lv3Var.s;
                if (lv3Var.r) {
                    if (tLObject3 instanceof TLRPC.messages_BotResults) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject3;
                        ew3 ew3Var = nv3Var.r;
                        ArrayList arrayList7 = nv3Var.n;
                        int i15 = ew3.C1;
                        ad7.Y(ew3Var.a).s1(str6, messages_botresults);
                        lv3Var.h = messages_botresults.next_offset;
                        if (z16) {
                            arrayList7.clear();
                        }
                        arrayList7.size();
                        arrayList7.addAll(messages_botresults.results);
                        lv3Var.f();
                    }
                    nv3Var.d.c(false);
                    lv3Var.r = false;
                    return;
                }
                return;
            case 17:
                Context context = (Context) this.c;
                boolean z17 = this.b;
                y54 y54Var = (y54) this.d;
                uc8 uc8Var = (uc8) this.e;
                qr6 b4 = qr6.b(context);
                if (b4 == null) {
                    lad.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z17) {
                    l93 l93Var = y54Var.s;
                    l93Var.getClass();
                    l93Var.f.a(b4);
                }
                LogSessionId d = b4.d();
                synchronized (uc8Var) {
                    tc8 tc8Var = uc8Var.b;
                    tc8Var.getClass();
                    tc8Var.a(d);
                }
                return;
            case 18:
                String str7 = (String) this.c;
                boolean z18 = this.b;
                fx0 fx0Var = (fx0) this.d;
                wjb wjbVar3 = (wjb) this.e;
                gl.g(str7);
                ww0 ww0Var = fx0Var.c;
                if (z18) {
                    new u21(ww0Var, wjbVar3).i(k96.M0(2131747102, null)).j();
                    return;
                } else {
                    new u21(ww0Var, wjbVar3).k(false).j();
                    return;
                }
            case 19:
                fx0 fx0Var2 = (fx0) this.c;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                boolean z19 = this.b;
                hd hdVar = (hd) this.e;
                if (fx0Var2 != null && !fx0Var2.J) {
                    fx0Var2.v0(true);
                    editTextBoldCursor.requestFocus();
                    if (z19) {
                        gl.c3(new l(editTextBoldCursor, b));
                        return;
                    }
                    return;
                }
                if (hdVar == null || !hdVar.isShowing()) {
                    return;
                }
                hdVar.k(true);
                editTextBoldCursor.requestFocus();
                if (z19) {
                    gl.c3(new l(editTextBoldCursor, (byte) 7));
                    return;
                }
                return;
            case 20:
                h75 h75Var = (h75) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) this.e;
                boolean z20 = this.b;
                if (tLObject4 instanceof TLRPC.TL_chatInviteExported) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tLObject4;
                    if (chatFull2 != null) {
                        chatFull2.exported_invite = tL_chatInviteExported3;
                        return;
                    } else {
                        h75Var.o1(null, tL_chatInviteExported3.link, true, z20);
                        return;
                    }
                }
                return;
            case 21:
                bb5 bb5Var = (bb5) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z21 = this.b;
                if (tL_error2 == null) {
                    bb5Var.f = (TLRPC.TL_chatInviteExported) tLObject5;
                    if (z21) {
                        if (bb5Var.getParentActivity() == null) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bb5Var.getParentActivity());
                        alertDialog$Builder3.a.U = k96.M0(2131745832, null);
                        alertDialog$Builder3.a.S = k96.M0(2131745830, null);
                        alertDialog$Builder3.g(k96.M0(2131747638, null), null);
                        bb5Var.showDialog(alertDialog$Builder3.a);
                    }
                }
                bb5Var.e = false;
                bb5Var.a.f();
                return;
            case 22:
                fu5 fu5Var = (fu5) this.c;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.d;
                boolean z22 = this.b;
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = (TLRPC.TL_messages_importChatInvite) this.e;
                d dVar = fu5Var.n1;
                if (dVar == null || dVar.getParentActivity() == null) {
                    return;
                }
                if (tL_error3 != null) {
                    if ("INVITE_REQUEST_SENT".equals(tL_error3.text)) {
                        fu5Var.setOnDismissListener(new bu5((byte) 1, fu5Var, z22));
                    } else {
                        ij.c0(fu5Var.a, tL_error3, dVar, tL_messages_importChatInvite, new Object[0]);
                    }
                }
                fu5Var.dismiss();
                return;
            case 23:
                MediaController mediaController = (MediaController) this.c;
                y97 y97Var = (y97) this.d;
                j5 j5Var = (j5) this.e;
                boolean z23 = this.b;
                String[] strArr2 = MediaController.W1;
                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                tL_document.access_hash = y97Var.b;
                tL_document.id = y97Var.a;
                tL_document.mime_type = "sound/ogg";
                tL_document.file_reference = y97Var.c;
                tL_document.dc_id = ConnectionsManager.getInstance(j5Var.a).getCurrentDatacenterId();
                ba4.G(j5Var.a);
                File J = ba4.J(tL_document, null, true, true);
                if (!J.exists()) {
                    gl.c3(new oh6((Object) j5Var, (Object) tL_document, (byte) 4));
                    return;
                } else {
                    if (z23) {
                        return;
                    }
                    gl.c3(new oh6(mediaController, J, b3));
                    return;
                }
            case 24:
                MediaController mediaController2 = (MediaController) this.c;
                File file2 = (File) this.d;
                boolean z24 = this.b;
                TLRPC.TL_document tL_document2 = (TLRPC.TL_document) this.e;
                String[] strArr3 = MediaController.W1;
                mediaController2.getClass();
                if (file2.exists()) {
                    hq6.d0(mediaController2.i1).D1(mediaController2.n1, mediaController2.o1, cq6.a(mediaController2, file2.getAbsolutePath(), z24));
                } else {
                    boolean z25 = w01.a;
                    fa4.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.m1), true);
                }
                tL_document2.date = ConnectionsManager.getInstance(mediaController2.i1).getCurrentTime();
                tL_document2.size = (int) file2.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                byte[] waveform = MediaController.getWaveform(file2.getAbsolutePath());
                tL_documentAttributeAudio.waveform = waveform;
                if (waveform != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                tL_documentAttributeAudio.duration = mediaController2.l1 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                kk7.f(mediaController2.i1).k(kk7.n2, new Object[0]);
                kk7.f(mediaController2.i1).k(kk7.r2, Integer.valueOf(mediaController2.h1), tL_document2, file2.getAbsolutePath());
                mediaController2.X(false);
                return;
            case 25:
                hq6 hq6Var = (hq6) this.c;
                ArrayList arrayList8 = (ArrayList) this.d;
                boolean z26 = this.b;
                ArrayList arrayList9 = (ArrayList) this.e;
                hq6Var.getMessagesController().b4(arrayList8, z26);
                hq6Var.getMessagesController().V3(arrayList9, z26);
                return;
            case 26:
                hq6 hq6Var2 = (hq6) this.c;
                boolean z27 = this.b;
                ArrayList arrayList10 = (ArrayList) this.d;
                vf6 vf6Var = (vf6) this.e;
                try {
                    hq6Var2.getMessagesStorage().b.beginTransaction();
                    if (z27) {
                        try {
                            executeFast = hq6Var2.getMessagesStorage().b.executeFast("UPDATE scheduled_messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        } catch (Exception e) {
                            e = e;
                            z = true;
                            fa4.g(e, z);
                            return;
                        }
                    } else {
                        executeFast = hq6Var2.getMessagesStorage().b.executeFast("UPDATE messages_v2 SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                        sQLitePreparedStatement3 = hq6Var2.getMessagesStorage().b.executeFast("UPDATE messages_topics SET replydata = ?, reply_to_message_id = ? WHERE mid = ? AND uid = ?");
                    }
                    int i16 = 0;
                    while (i16 < arrayList10.size()) {
                        TLRPC.Message message2 = (TLRPC.Message) arrayList10.get(i16);
                        SparseArray sparseArray = (SparseArray) vf6Var.f(k27.B0(message2));
                        if (sparseArray == null || (arrayList2 = (ArrayList) sparseArray.get(message2.id)) == null) {
                            i2 = i4;
                            sQLitePreparedStatement = sQLitePreparedStatement3;
                        } else {
                            k27.p5(message2);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message2.getObjectSize());
                            message2.serializeToStream(nativeByteBuffer);
                            int i17 = i6;
                            while (i17 < arrayList2.size()) {
                                k27 k27Var2 = (k27) arrayList2.get(i17);
                                while (i6 < i4) {
                                    SQLitePreparedStatement sQLitePreparedStatement4 = i6 == 0 ? executeFast : sQLitePreparedStatement3;
                                    if (sQLitePreparedStatement4 == null) {
                                        i3 = i4;
                                        sQLitePreparedStatement2 = sQLitePreparedStatement3;
                                    } else {
                                        sQLitePreparedStatement4.requery();
                                        sQLitePreparedStatement4.bindByteBuffer(i5, nativeByteBuffer);
                                        sQLitePreparedStatement4.bindInteger(i4, message2.id);
                                        sQLitePreparedStatement4.bindInteger(3, k27Var2.e1());
                                        i3 = i4;
                                        sQLitePreparedStatement2 = sQLitePreparedStatement3;
                                        sQLitePreparedStatement4.bindLong(4, k27.B0(k27Var2.k));
                                        sQLitePreparedStatement4.step();
                                    }
                                    i6++;
                                    sQLitePreparedStatement3 = sQLitePreparedStatement2;
                                    i4 = i3;
                                    i5 = 1;
                                }
                                i17++;
                                i5 = 1;
                                i6 = 0;
                            }
                            i2 = i4;
                            sQLitePreparedStatement = sQLitePreparedStatement3;
                            nativeByteBuffer.reuse();
                        }
                        i16++;
                        sQLitePreparedStatement3 = sQLitePreparedStatement;
                        i4 = i2;
                        i5 = 1;
                        i6 = 0;
                    }
                    SQLitePreparedStatement sQLitePreparedStatement5 = sQLitePreparedStatement3;
                    executeFast.dispose();
                    if (sQLitePreparedStatement5 != null) {
                        sQLitePreparedStatement5.dispose();
                    }
                    hq6Var2.getMessagesStorage().b.commitTransaction();
                    return;
                } catch (Exception e2) {
                    e = e2;
                    z = true;
                }
                break;
            case 27:
                hq6 hq6Var3 = (hq6) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.e;
                boolean z28 = this.b;
                if (tLObject6 instanceof TLRPC.TL_emojiList) {
                    SerializedData serializedData = new SerializedData(tLObject6.getObjectSize());
                    tLObject6.serializeToStream(serializedData);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    if (z28) {
                        hq6Var3.M1 = (TLRPC.TL_emojiList) tLObject6;
                        edit.putString("profile", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("profile_last_check", System.currentTimeMillis());
                    } else {
                        hq6Var3.N1 = (TLRPC.TL_emojiList) tLObject6;
                        edit.putString("group", Utilities.f(serializedData.toByteArray()));
                        edit.putLong("group_last_check", System.currentTimeMillis());
                    }
                    edit.apply();
                    return;
                }
                return;
            case 28:
                hq6 hq6Var4 = (hq6) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                String str8 = (String) this.e;
                boolean z29 = this.b;
                if (tLObject7 instanceof TLRPC.TL_messages_stickerSet) {
                    hq6Var4.t1(str8, z29, (TLRPC.TL_messages_stickerSet) tLObject7, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                } else {
                    hq6Var4.t1(str8, z29, null, false, (int) (System.currentTimeMillis() / 1000));
                    return;
                }
            default:
                na7 na7Var = (na7) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                boolean z30 = this.b;
                TLRPC.TL_contacts_getBlocked tL_contacts_getBlocked = (TLRPC.TL_contacts_getBlocked) this.e;
                LongSparseIntArray longSparseIntArray = na7Var.x0;
                if (tLObject8 != null) {
                    TLRPC.contacts_Blocked contacts_blocked = (TLRPC.contacts_Blocked) tLObject8;
                    na7Var.b4(contacts_blocked.users, false);
                    na7Var.V3(contacts_blocked.chats, false);
                    na7Var.getMessagesStorage().j1(contacts_blocked.users, contacts_blocked.chats, true, true);
                    if (z30) {
                        longSparseIntArray.clear();
                    }
                    na7Var.y0 = Math.max(contacts_blocked.count, contacts_blocked.blocked.size());
                    na7Var.z0 = contacts_blocked.blocked.size() < tL_contacts_getBlocked.limit;
                    int size3 = contacts_blocked.blocked.size();
                    for (int i18 = 0; i18 < size3; i18++) {
                        longSparseIntArray.put(k27.B1(contacts_blocked.blocked.get(i18).peer_id), 1);
                    }
                    na7Var.w0 = false;
                    na7Var.getNotificationCenter().k(43, new Object[0]);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ rg(t92 t92Var, TLRPC.Chat chat, boolean z, Runnable runnable, byte b) {
        this.a = b;
        this.d = t92Var;
        this.c = chat;
        this.b = z;
        this.e = runnable;
    }

    public /* synthetic */ rg(u21 u21Var, boolean z, TLRPC.Chat chat, wjb wjbVar) {
        this.a = (byte) 1;
        this.d = u21Var;
        this.b = z;
        this.c = chat;
        this.e = wjbVar;
    }

    public /* synthetic */ rg(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ rg(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }

    public /* synthetic */ rg(Object obj, boolean z, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rg(String str, int i, fx0 fx0Var, wjb wjbVar) {
        this.a = (byte) 18;
        this.c = str;
        this.b = i;
        this.d = fx0Var;
        this.e = wjbVar;
    }

    public /* synthetic */ rg(boolean z, TLRPC.Chat chat, AlertDialog$Builder alertDialog$Builder, boolean[] zArr) {
        this.a = (byte) 0;
        this.b = z;
        this.c = chat;
        this.d = alertDialog$Builder;
        this.e = zArr;
    }
}
