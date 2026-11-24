// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b0;
import org.telegram.ui.Components.c0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class t79 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t79(int i, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0412  */
    /* JADX WARN: Type inference failed for: r0v42, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r0v95, types: [go2] */
    /* JADX WARN: Type inference failed for: r12v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v51, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v53, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_messages_emojiGroups] */
    /* JADX WARN: Type inference failed for: r5v26, types: [opa] */
    /* JADX WARN: Type inference failed for: r5v30, types: [e] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object, vf6] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, vf6] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        byte b = 4;
        byte b2 = 2;
        UndoView undoView = null;
        r10 = null;
        String str = null;
        UndoView undoView2 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = null;
        ?? r12 = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                d dVar = (d) this.c;
                int i2 = this.b;
                tj9 tj9Var = (tj9) this.d;
                u21.b0(dVar).c(k96.M0(2131754485, null)).j();
                na7.q1(i2).l0(false);
                gl.d3(tj9Var);
                return;
            case 1:
                en1 en1Var = (en1) this.c;
                u21 u21Var = (u21) this.d;
                int i3 = this.b;
                en1Var.run();
                u21Var.c(k96.M0(2131754485, null)).j();
                na7.q1(i3).l0(false);
                return;
            case 2:
                ii9 ii9Var = (ii9) this.c;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.d;
                int i4 = this.b;
                li9 m = ii9Var.getGrid().m(pagetablecell);
                if (m != null) {
                    mc9 mc9Var = m.a;
                    mc9Var.O();
                    mc9Var.setSelection(Math.max(0, Math.min(i4, mc9Var.length())));
                    return;
                }
                return;
            case 3:
                bu9 bu9Var = (bu9) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                int i5 = this.b;
                message.send_state = 0;
                kk7 notificationCenter = bu9Var.getNotificationCenter();
                Integer valueOf = Integer.valueOf(message.id);
                Integer valueOf2 = Integer.valueOf(message.id);
                Long valueOf3 = Long.valueOf(message.dialog_id);
                Integer valueOf4 = Integer.valueOf(i5);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, message, valueOf3, 0L, valueOf4, bool);
                bu9Var.getNotificationCenter().k(22, Integer.valueOf(message.id), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i5), bool);
                bu9Var.getSendMessagesHelper().c0(message.id);
                bu9Var.getSendMessagesHelper().h0(message.id, false);
                return;
            case 4:
                qaa qaaVar = (qaa) this.c;
                int i6 = this.b;
                ArrayList arrayList = (ArrayList) this.d;
                oaa oaaVar = qaaVar.e;
                taa taaVar = qaaVar.L;
                if (i6 == qaaVar.r) {
                    qaaVar.b();
                    qaaVar.J = false;
                    qaaVar.w = i6;
                    if (qaaVar.s != i6) {
                        oaaVar.b();
                    }
                    v9a v9aVar = taaVar.A1;
                    qaa qaaVar2 = taaVar.H1;
                    if (v9aVar.getAdapter() != qaaVar2) {
                        taaVar.H0();
                        qaaVar2.f();
                    }
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        TLObject tLObject = ((iaa) arrayList.get(i7)).b;
                        if (tLObject instanceof TLRPC.User) {
                            na7.q1(taaVar.a).Z3((TLRPC.User) tLObject, true, false);
                        } else if (tLObject instanceof TLRPC.Chat) {
                            na7.q1(taaVar.a).S3((TLRPC.Chat) tLObject, true);
                        }
                    }
                    ?? r2 = !qaaVar.d.isEmpty() && arrayList.isEmpty();
                    if (qaaVar.d.isEmpty()) {
                        arrayList.isEmpty();
                    }
                    if (r2 != false) {
                        taaVar.H0();
                    }
                    qaaVar.d = arrayList;
                    oaaVar.f(arrayList, null);
                    int i8 = qaaVar.K;
                    if (qaaVar.b() != 0 || oaaVar.e() || qaaVar.J) {
                        taaVar.s2.b(i8);
                    } else {
                        taaVar.L1.e(false, true);
                    }
                    qaaVar.f();
                    taaVar.D0(true);
                    return;
                }
                return;
            case 5:
                ((nfa) this.c).A0(this.b, (TL_stories.StoryItem) this.d);
                return;
            case 6:
                nfa nfaVar = (nfa) this.c;
                nfaVar.L(this.b, (o39) this.d, false);
                nfaVar.N1 = null;
                return;
            case 7:
                d dVar2 = (d) this.c;
                vf6 vf6Var = (vf6) this.d;
                int i9 = this.b;
                if (dVar2 instanceof mu1) {
                    mu1 mu1Var = (mu1) dVar2;
                    mu1Var.Z5();
                    undoView = mu1Var.N3;
                } else if (dVar2 instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) dVar2).M;
                }
                UndoView undoView3 = undoView;
                if (undoView3 != null) {
                    if (vf6Var.m() == 1) {
                        undoView3.m(Integer.valueOf(i9), 53, ((TLRPC.Dialog) vf6Var.n(0)).id);
                        return;
                    } else {
                        undoView3.k(0L, 53, Integer.valueOf(i9), Integer.valueOf(vf6Var.m()), null, null);
                        return;
                    }
                }
                return;
            case 8:
                zea zeaVar = (zea) this.c;
                int i10 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i10 == zeaVar.F) {
                    zeaVar.E = ConnectionsManager.getInstance(zeaVar.d).sendRequest(tL_messages_search, new l12(zeaVar, i10, b));
                    return;
                }
                return;
            case 9:
                zea zeaVar2 = (zea) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                int i11 = this.b;
                ArrayList arrayList2 = zeaVar2.h;
                int i12 = zeaVar2.d;
                if ((tLObject2 instanceof TLRPC.messages_Messages) && i11 == zeaVar2.F) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    na7.q1(i12).a4(messages_messages.users, false);
                    na7.q1(i12).U3(messages_messages.chats, false);
                    ad7.Y(i12).j1(messages_messages.users, messages_messages.chats, true, true);
                    for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                        k27 k27Var = new k27(i12, messages_messages.messages.get(i13), false, true);
                        if (k27Var.z2()) {
                            k27Var.S2 = true;
                        }
                        k27Var.J5(zeaVar2.x, true);
                        arrayList2.add(k27Var);
                    }
                    zeaVar2.w = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        zeaVar2.s = arrayList2.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        zeaVar2.s = true;
                    }
                    zeaVar2.G(false);
                    zeaVar2.r = false;
                    zeaVar2.E = -1;
                    return;
                }
                return;
            case 10:
                rja rjaVar = (rja) this.c;
                int i14 = this.b;
                gb2 gb2Var = (gb2) this.d;
                rjaVar.Z0 = false;
                if (!rjaVar.W0 && rjaVar.X0) {
                    rjaVar.x(true);
                    return;
                }
                rjaVar.n0 = rjaVar.g1[0];
                rjaVar.g();
                up3.q(i14).v(gb2Var);
                rjaVar.D();
                rjaVar.s();
                return;
            case 11:
                upa upaVar = (upa) this.c;
                int i15 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = upaVar.W;
                qpa qpaVar = upaVar.f;
                ?? r5 = upaVar.h;
                if (starGift != null) {
                    spa spaVar = new spa(upaVar.getContext());
                    spaVar.a(starGift, false);
                    spaVar.setRotation(180.0f);
                    r5.f(i15, spaVar);
                    spaVar.setScaleX(0.5f);
                    spaVar.setScaleY(0.5f);
                    spaVar.setAlpha(0.0f);
                    ViewPropertyAnimator duration = spaVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    s33 s33Var = s33.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(s33Var);
                    interpolator.setUpdateListener(new gja(upaVar, b2));
                    interpolator.start();
                    r5.a[i15].setVisibility(8);
                    qpaVar.setVisibility(0);
                    qpaVar.setAlpha(0.0f);
                    qpaVar.animate().alpha(0.5f).setDuration(820L).setInterpolator(s33Var).start();
                    return;
                }
                ?? frameLayout = new FrameLayout(upaVar.getContext());
                ry8 ry8Var = new ry8(upaVar.getContext());
                ry8Var.f(R.raw.gift_broken, 32, 32, null);
                frameLayout.addView(ry8Var, nme.e(32, 32, 17));
                ry8Var.setScaleX(0.5f);
                ry8Var.setScaleY(0.5f);
                ry8Var.setAlpha(0.0f);
                ry8Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                upaVar.m0 = ry8Var;
                frameLayout.setBackground(new iqa(gl.L(12.0f), bkb.p1(0.075f, -1)));
                r5.a[i15].setVisibility(8);
                frameLayout.setRotation(180.0f);
                r5.f(i15, frameLayout);
                upaVar.G.a(iArr[2], iArr[3]);
                tpa tpaVar = upaVar.b;
                int[] iArr2 = upaVar.V;
                tpaVar.a(iArr2[2], iArr2[3]);
                qpaVar.a(iArr[3], iArr[2]);
                return;
            case 12:
                ((sna) this.d).a(k96.a0(null, null, 2131750030, bc.I0(this.b)), (lqa) this.c, Boolean.FALSE);
                return;
            case 13:
                gta gtaVar = (gta) this.c;
                int i16 = this.b;
                TLObject tLObject3 = (TLObject) this.d;
                boolean[] zArr = gtaVar.r;
                ArrayList[] arrayListArr = gtaVar.q;
                int i17 = gtaVar.a;
                gtaVar.t[i16] = false;
                if (tLObject3 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject3;
                    na7.q1(i17).a4(starsStatus.users, false);
                    na7.q1(i17).U3(starsStatus.chats, false);
                    arrayListArr[i16].addAll(starsStatus.history);
                    zArr[i16] = !arrayListArr[i16].isEmpty() || zArr[i16];
                    boolean[] zArr2 = gtaVar.u;
                    r11 = (starsStatus.flags & 1) == 0;
                    zArr2[i16] = r11;
                    gtaVar.s[i16] = r11 ? null : starsStatus.next_offset;
                    gtaVar.i0(starsStatus.balance);
                    kk7.f(i17).k(kk7.A3, new Object[0]);
                    return;
                }
                return;
            case 14:
                Context context = (Context) this.c;
                int i18 = this.b;
                d01.t(context, "https://" + na7.q1(i18).N2 + "/nft/" + ((String) this.d));
                return;
            case 15:
                ?? r1 = this.b;
                Integer num = (Integer) this.c;
                ?? r52 = (e) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = ad7.Y(r1).b;
                        if (sQLiteDatabase != null) {
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM emoji_groups WHERE type = ?", num);
                            try {
                                if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                                    messages_emojigroups = null;
                                } else {
                                    messages_emojigroups = TLRPC.messages_EmojiGroups.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                                    byteBufferValue.reuse();
                                }
                                if (messages_emojigroups instanceof TLRPC.TL_messages_emojiGroups) {
                                    r52.a(Long.valueOf(r2.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    r52.a(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e) {
                                e = e;
                                fa4.g(e, true);
                                r52.a(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor3 = r1;
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteCursor3 != null) {
                    }
                    throw th;
                }
                break;
            case 16:
                int i19 = this.b;
                ?? r22 = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num2 = (Integer) this.d;
                try {
                    SQLiteDatabase sQLiteDatabase2 = ad7.Y(i19).b;
                    if (sQLiteDatabase2 != null) {
                        if (r22 == null) {
                            sQLiteDatabase2.executeFast("DELETE FROM emoji_groups WHERE type = " + num2).stepThis().dispose();
                        } else {
                            SQLitePreparedStatement executeFast = sQLiteDatabase2.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(r22.getObjectSize());
                            r22.serializeToStream(nativeByteBuffer);
                            executeFast.bindInteger(1, num2.intValue());
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                        }
                    }
                    return;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            case 17:
                i0b i0bVar = (i0b) this.c;
                vf6 vf6Var2 = (vf6) this.d;
                int i20 = this.b;
                d dVar3 = i0bVar.U2.F1;
                if (dVar3 instanceof mu1) {
                    mu1 mu1Var2 = (mu1) dVar3;
                    mu1Var2.Z5();
                    undoView2 = mu1Var2.N3;
                } else if (dVar3 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) dVar3).M;
                }
                UndoView undoView4 = undoView2;
                if (undoView4 != null) {
                    if (vf6Var2.m() == 1) {
                        undoView4.m(Integer.valueOf(i20), 53, ((TLRPC.Dialog) vf6Var2.n(0)).id);
                        return;
                    } else {
                        undoView4.k(0L, 53, Integer.valueOf(i20), Integer.valueOf(vf6Var2.m()), null, null);
                        return;
                    }
                }
                return;
            case 18:
                TLObject tLObject4 = (TLObject) this.c;
                int i21 = this.b;
                ?? r0 = (go2) this.d;
                if (tLObject4 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList3 = ((TL_stories.TL_albums) tLObject4).albums;
                    int size = arrayList3.size();
                    while (r12 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList3.get(r12);
                        r12++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i21) {
                            r0.a(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                r0.a(null);
                return;
            case 19:
                gl.d3(new s94(this.b, ((ad7) this.c).i0(new ArrayList((HashSet) this.d))));
                return;
            case 20:
                d8b d8bVar = (d8b) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                int i22 = this.b;
                m8b m8bVar = d8bVar.d;
                c8b c8bVar = m8bVar.o0;
                int i23 = m8bVar.h;
                c8bVar.B0 = arrayList4;
                c8bVar.z0 = i23;
                c8bVar.setAdapter(null);
                c8bVar.setAdapter(c8bVar.A0);
                c8bVar.setCurrentItem(i22);
                c8bVar.D0 = true;
                return;
            case 21:
                dbb dbbVar = (dbb) this.c;
                String str2 = (String) this.d;
                int i24 = this.b;
                ArrayList arrayList5 = new ArrayList(1);
                dq6 dq6Var = new dq6();
                dq6Var.a = str2;
                dq6Var.b = null;
                arrayList5.add(dq6Var);
                hq6.d0(dbbVar.a).Q(arrayList5, 15, false, false, new ica((Object) dbbVar, i24, (Object) str2, (Object) arrayList5, (byte) 6));
                return;
            case 22:
                hgb hgbVar = (hgb) this.c;
                ad7 ad7Var = (ad7) this.d;
                int i25 = this.b;
                ArrayList arrayList6 = new ArrayList();
                ?? vf6Var3 = new vf6();
                ?? vf6Var4 = new vf6();
                try {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase3.queryFinalized("SELECT DISTINCT uid FROM media_v4 WHERE uid != 0 AND mid > 0 AND type = 4", new Object[0]);
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        if (!cf3.B(longValue)) {
                            arrayList6.add(Long.valueOf(longValue));
                            if (cf3.D(longValue)) {
                                arrayList7.add(Long.valueOf(longValue));
                            } else {
                                arrayList8.add(Long.valueOf(-longValue));
                            }
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList7.isEmpty()) {
                        ArrayList arrayList9 = new ArrayList();
                        ad7Var.k0(arrayList7, arrayList9, false);
                        int size2 = arrayList9.size();
                        int i26 = 0;
                        while (i26 < size2) {
                            Object obj = arrayList9.get(i26);
                            i26++;
                            TLRPC.User user = (TLRPC.User) obj;
                            vf6Var3.k(user, user.id);
                        }
                    }
                    if (!arrayList8.isEmpty()) {
                        ArrayList arrayList10 = new ArrayList();
                        ad7Var.P(TextUtils.join(",", arrayList8), arrayList10);
                        int size3 = arrayList10.size();
                        while (i < size3) {
                            Object obj2 = arrayList10.get(i);
                            i++;
                            TLRPC.Chat chat = (TLRPC.Chat) obj2;
                            vf6Var4.k(chat, chat.id);
                        }
                    }
                } catch (Exception e4) {
                    fa4.g(e4, true);
                }
                gl.d3(new i57((Object) hgbVar, i25, (Object) arrayList6, (Object) vf6Var3, (Object) vf6Var4, (byte) 27));
                return;
            case 23:
                c0 c0Var = (c0) this.c;
                String str3 = (String) this.d;
                int i27 = this.b;
                b0 b0Var = c0Var.r.r1;
                try {
                    String lowerCase = str3.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        c0Var.d = -1;
                        gl.d3(new ica((Object) c0Var, c0Var.d, (Object) new ArrayList(), (Object) new ArrayList(), (byte) 8));
                        return;
                    }
                    String S0 = k96.D0().S0(lowerCase, true, false);
                    if (!lowerCase.equals(S0) && S0.length() != 0) {
                        str = S0;
                    }
                    int i28 = (str != null ? 1 : 0) + 1;
                    String[] strArr = new String[i28];
                    strArr[0] = lowerCase;
                    if (str != null) {
                        strArr[1] = str;
                    }
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    int size4 = b0Var.d.size();
                    for (int i29 = 0; i29 < size4; i29++) {
                        ArrayList arrayList13 = (ArrayList) b0Var.d.get(i29);
                        String c = lve.c(((blb) arrayList13.get(0)).e);
                        String lowerCase2 = c.toLowerCase();
                        int i30 = 0;
                        while (true) {
                            if (i30 < i28) {
                                String str4 = strArr[i30];
                                if (lowerCase2.contains(str4)) {
                                    arrayList11.add(arrayList13);
                                    arrayList12.add(c0.E(c, str4));
                                } else {
                                    i30++;
                                }
                            }
                        }
                    }
                    gl.d3(new ica((Object) c0Var, i27, (Object) arrayList11, (Object) arrayList12, (byte) 8));
                    return;
                } catch (Exception e5) {
                    fa4.g(e5, true);
                    return;
                }
            case 24:
                gl.d3(new ica(this.c, this.d, this.b, (Object) lcb.c(gl.p, R.raw.default_pattern, gl.L(120.0f), gl.L(140.0f), -16777216, 1), (byte) 9));
                return;
            case 25:
                ((dob) this.c).b((short[]) this.d, this.b);
                return;
            case 26:
                jpb jpbVar = (jpb) this.c;
                hl1 hl1Var = (hl1) this.d;
                int i31 = this.b;
                mu1 mu1Var3 = hl1Var.b;
                int i32 = mu1.md;
                mu1Var3.Ha(i31);
                if (i31 != 1 && i31 != 13) {
                    r11 = false;
                }
                jpbVar.b(r11);
                return;
            case 27:
                k27 k27Var2 = (k27) this.c;
                bb2 bb2Var = (bb2) this.d;
                int i33 = this.b;
                HashMap hashMap = uyb.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(uyb.r(k27Var2)));
                }
                if (bb2Var != null) {
                    bb2Var.c0(3);
                }
                kk7.f(i33).k(kk7.z1, k27Var2);
                kk7.f(i33).k(kk7.D1, new Object[0]);
                return;
            case 28:
                k7c k7cVar = (k7c) this.c;
                String str5 = (String) this.d;
                int i34 = this.b;
                k7cVar.c.remove(str5);
                ConnectionsManager.getInstance(k7cVar.a).cancelRequest(i34, true);
                return;
            default:
                int i35 = this.b;
                ukc ukcVar = (ukc) this.c;
                c cVar = (c) this.d;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i35);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new hc(r12), new p((Object) ukcVar, (Object) cVar, (Object) connectionsManager, (byte) 26));
                return;
        }
    }

    public /* synthetic */ t79(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ t79(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
