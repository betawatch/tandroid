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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class v99 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v99(int i, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040b  */
    /* JADX WARN: Type inference failed for: r0v42, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r0v95, types: [rp2] */
    /* JADX WARN: Type inference failed for: r12v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v51, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v53, types: [org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_messages_emojiGroups] */
    /* JADX WARN: Type inference failed for: r5v26, types: [ora] */
    /* JADX WARN: Type inference failed for: r5v30, types: [e] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, vh6] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, vh6] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        byte b = 4;
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
                il9 il9Var = (il9) this.d;
                c41.b0(dVar).c(jb6.M0(2131754485, null)).j();
                oc7.r1(i2).l0(false);
                gm.c3(il9Var);
                return;
            case 1:
                bo1 bo1Var = (bo1) this.c;
                c41 c41Var = (c41) this.d;
                int i3 = this.b;
                bo1Var.run();
                c41Var.c(jb6.M0(2131754485, null)).j();
                oc7.r1(i3).l0(false);
                return;
            case 2:
                kk9 kk9Var = (kk9) this.c;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.d;
                int i4 = this.b;
                nk9 m = kk9Var.getGrid().m(pagetablecell);
                if (m != null) {
                    ne9 ne9Var = m.a;
                    ne9Var.O();
                    ne9Var.setSelection(Math.max(0, Math.min(i4, ne9Var.length())));
                    return;
                }
                return;
            case 3:
                dw9 dw9Var = (dw9) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                int i5 = this.b;
                message.send_state = 0;
                nm7 notificationCenter = dw9Var.getNotificationCenter();
                Integer valueOf = Integer.valueOf(message.id);
                Integer valueOf2 = Integer.valueOf(message.id);
                Long valueOf3 = Long.valueOf(message.dialog_id);
                Integer valueOf4 = Integer.valueOf(i5);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, message, valueOf3, 0L, valueOf4, bool);
                dw9Var.getNotificationCenter().k(22, Integer.valueOf(message.id), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i5), bool);
                dw9Var.getSendMessagesHelper().c0(message.id);
                dw9Var.getSendMessagesHelper().h0(message.id, false);
                return;
            case 4:
                qca qcaVar = (qca) this.c;
                int i6 = this.b;
                ArrayList arrayList = (ArrayList) this.d;
                oca ocaVar = qcaVar.e;
                tca tcaVar = qcaVar.L;
                if (i6 == qcaVar.r) {
                    qcaVar.b();
                    qcaVar.J = false;
                    qcaVar.w = i6;
                    if (qcaVar.s != i6) {
                        ocaVar.b();
                    }
                    vba vbaVar = tcaVar.A1;
                    qca qcaVar2 = tcaVar.H1;
                    if (vbaVar.getAdapter() != qcaVar2) {
                        tcaVar.H0();
                        qcaVar2.f();
                    }
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        TLObject tLObject = ((ica) arrayList.get(i7)).b;
                        if (tLObject instanceof TLRPC.User) {
                            oc7.r1(tcaVar.a).c4((TLRPC.User) tLObject, true, false);
                        } else if (tLObject instanceof TLRPC.Chat) {
                            oc7.r1(tcaVar.a).V3((TLRPC.Chat) tLObject, true);
                        }
                    }
                    ?? r2 = !qcaVar.d.isEmpty() && arrayList.isEmpty();
                    if (qcaVar.d.isEmpty()) {
                        arrayList.isEmpty();
                    }
                    if (r2 != false) {
                        tcaVar.H0();
                    }
                    qcaVar.d = arrayList;
                    ocaVar.f(arrayList, null);
                    int i8 = qcaVar.K;
                    if (qcaVar.b() != 0 || ocaVar.e() || qcaVar.J) {
                        tcaVar.s2.b(i8);
                    } else {
                        tcaVar.L1.e(false, true);
                    }
                    qcaVar.f();
                    tcaVar.D0(true);
                    return;
                }
                return;
            case 5:
                ((nha) this.c).A0(this.b, (TL_stories.StoryItem) this.d);
                return;
            case 6:
                nha nhaVar = (nha) this.c;
                nhaVar.L(this.b, (r59) this.d, false);
                nhaVar.N1 = null;
                return;
            case 7:
                d dVar2 = (d) this.c;
                vh6 vh6Var = (vh6) this.d;
                int i9 = this.b;
                if (dVar2 instanceof yv1) {
                    yv1 yv1Var = (yv1) dVar2;
                    yv1Var.i6();
                    undoView = yv1Var.N3;
                } else if (dVar2 instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) dVar2).M;
                }
                UndoView undoView3 = undoView;
                if (undoView3 != null) {
                    if (vh6Var.m() == 1) {
                        undoView3.m(Integer.valueOf(i9), 53, ((TLRPC.Dialog) vh6Var.n(0)).id);
                        return;
                    } else {
                        undoView3.k(0L, 53, Integer.valueOf(i9), Integer.valueOf(vh6Var.m()), null, null);
                        return;
                    }
                }
                return;
            case 8:
                zga zgaVar = (zga) this.c;
                int i10 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i10 == zgaVar.F) {
                    zgaVar.E = ConnectionsManager.getInstance(zgaVar.d).sendRequest(tL_messages_search, new w22(zgaVar, i10, b));
                    return;
                }
                return;
            case 9:
                zga zgaVar2 = (zga) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                int i11 = this.b;
                ArrayList arrayList2 = zgaVar2.h;
                int i12 = zgaVar2.d;
                if ((tLObject2 instanceof TLRPC.messages_Messages) && i11 == zgaVar2.F) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    oc7.r1(i12).d4(messages_messages.users, false);
                    oc7.r1(i12).X3(messages_messages.chats, false);
                    cf7.Y(i12).j1(messages_messages.users, messages_messages.chats, true, true);
                    for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                        k47 k47Var = new k47(i12, messages_messages.messages.get(i13), false, true);
                        if (k47Var.z2()) {
                            k47Var.S2 = true;
                        }
                        k47Var.J5(zgaVar2.x, true);
                        arrayList2.add(k47Var);
                    }
                    zgaVar2.w = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        zgaVar2.s = arrayList2.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        zgaVar2.s = true;
                    }
                    zgaVar2.G(false);
                    zgaVar2.r = false;
                    zgaVar2.E = -1;
                    return;
                }
                return;
            case 10:
                sla slaVar = (sla) this.c;
                int i14 = this.b;
                rc2 rc2Var = (rc2) this.d;
                slaVar.Z0 = false;
                if (!slaVar.W0 && slaVar.X0) {
                    slaVar.x(true);
                    return;
                }
                slaVar.n0 = slaVar.g1[0];
                slaVar.g();
                er3.q(i14).v(rc2Var);
                slaVar.D();
                slaVar.s();
                return;
            case 11:
                ura uraVar = (ura) this.c;
                int i15 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = uraVar.W;
                qra qraVar = uraVar.f;
                ?? r5 = uraVar.h;
                if (starGift != null) {
                    sra sraVar = new sra(uraVar.getContext());
                    sraVar.a(starGift, false);
                    sraVar.setRotation(180.0f);
                    r5.f(i15, sraVar);
                    sraVar.setScaleX(0.5f);
                    sraVar.setScaleY(0.5f);
                    sraVar.setAlpha(0.0f);
                    ViewPropertyAnimator duration = sraVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    d53 d53Var = d53.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(d53Var);
                    interpolator.setUpdateListener(new rha(uraVar, b));
                    interpolator.start();
                    r5.a[i15].setVisibility(8);
                    qraVar.setVisibility(0);
                    qraVar.setAlpha(0.0f);
                    qraVar.animate().alpha(0.5f).setDuration(820L).setInterpolator(d53Var).start();
                    return;
                }
                ?? frameLayout = new FrameLayout(uraVar.getContext());
                s09 s09Var = new s09(uraVar.getContext());
                s09Var.f(R.raw.gift_broken, 32, 32, null);
                frameLayout.addView(s09Var, qoe.e(32, 32, 17));
                s09Var.setScaleX(0.5f);
                s09Var.setScaleY(0.5f);
                s09Var.setAlpha(0.0f);
                s09Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                uraVar.m0 = s09Var;
                frameLayout.setBackground(new isa(gm.L(12.0f), cmb.p1(0.075f, -1)));
                r5.a[i15].setVisibility(8);
                frameLayout.setRotation(180.0f);
                r5.f(i15, frameLayout);
                uraVar.G.a(iArr[2], iArr[3]);
                tra traVar = uraVar.b;
                int[] iArr2 = uraVar.V;
                traVar.a(iArr2[2], iArr2[3]);
                qraVar.a(iArr[3], iArr[2]);
                return;
            case 12:
                ((spa) this.d).a(jb6.a0(null, null, 2131749979, bc.J0(this.b)), (lsa) this.c, Boolean.FALSE);
                return;
            case 13:
                jva jvaVar = (jva) this.c;
                int i16 = this.b;
                TLObject tLObject3 = (TLObject) this.d;
                boolean[] zArr = jvaVar.r;
                ArrayList[] arrayListArr = jvaVar.q;
                int i17 = jvaVar.a;
                jvaVar.t[i16] = false;
                if (tLObject3 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject3;
                    oc7.r1(i17).d4(starsStatus.users, false);
                    oc7.r1(i17).X3(starsStatus.chats, false);
                    arrayListArr[i16].addAll(starsStatus.history);
                    zArr[i16] = !arrayListArr[i16].isEmpty() || zArr[i16];
                    boolean[] zArr2 = jvaVar.u;
                    r11 = (starsStatus.flags & 1) == 0;
                    zArr2[i16] = r11;
                    jvaVar.s[i16] = r11 ? null : starsStatus.next_offset;
                    jvaVar.i0(starsStatus.balance);
                    nm7.f(i17).k(nm7.B3, new Object[0]);
                    return;
                }
                return;
            case 14:
                Context context = (Context) this.c;
                int i18 = this.b;
                l11.u(context, "https://" + oc7.r1(i18).N2 + "/nft/" + ((String) this.d));
                return;
            case 15:
                ?? r1 = this.b;
                Integer num = (Integer) this.c;
                ?? r52 = (e) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = cf7.Y(r1).b;
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
                                fc4.g(e, true);
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
                    SQLiteDatabase sQLiteDatabase2 = cf7.Y(i19).b;
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
                    fc4.g(e3, true);
                    return;
                }
            case 17:
                l2b l2bVar = (l2b) this.c;
                vh6 vh6Var2 = (vh6) this.d;
                int i20 = this.b;
                d dVar3 = l2bVar.U2.F1;
                if (dVar3 instanceof yv1) {
                    yv1 yv1Var2 = (yv1) dVar3;
                    yv1Var2.i6();
                    undoView2 = yv1Var2.N3;
                } else if (dVar3 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) dVar3).M;
                }
                UndoView undoView4 = undoView2;
                if (undoView4 != null) {
                    if (vh6Var2.m() == 1) {
                        undoView4.m(Integer.valueOf(i20), 53, ((TLRPC.Dialog) vh6Var2.n(0)).id);
                        return;
                    } else {
                        undoView4.k(0L, 53, Integer.valueOf(i20), Integer.valueOf(vh6Var2.m()), null, null);
                        return;
                    }
                }
                return;
            case 18:
                TLObject tLObject4 = (TLObject) this.c;
                int i21 = this.b;
                ?? r0 = (rp2) this.d;
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
                gm.c3(new sb4(this.b, ((cf7) this.c).i0(new ArrayList((HashSet) this.d))));
                return;
            case 20:
                fab fabVar = (fab) this.c;
                ArrayList arrayList4 = (ArrayList) this.d;
                int i22 = this.b;
                oab oabVar = fabVar.d;
                eab eabVar = oabVar.o0;
                int i23 = oabVar.h;
                eabVar.B0 = arrayList4;
                eabVar.z0 = i23;
                eabVar.setAdapter(null);
                eabVar.setAdapter(eabVar.A0);
                eabVar.setCurrentItem(i22);
                eabVar.D0 = true;
                return;
            case 21:
                fdb fdbVar = (fdb) this.c;
                String str2 = (String) this.d;
                int i24 = this.b;
                ArrayList arrayList5 = new ArrayList(1);
                ds6 ds6Var = new ds6();
                ds6Var.a = str2;
                ds6Var.b = null;
                arrayList5.add(ds6Var);
                hs6.d0(fdbVar.a).Q(arrayList5, 15, false, false, new tda(fdbVar, i24, str2, arrayList5));
                return;
            case 22:
                iib iibVar = (iib) this.c;
                cf7 cf7Var = (cf7) this.d;
                int i25 = this.b;
                ArrayList arrayList6 = new ArrayList();
                ?? vh6Var3 = new vh6();
                ?? vh6Var4 = new vh6();
                try {
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase3 = cf7Var.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase3.queryFinalized("SELECT DISTINCT uid FROM media_v4 WHERE uid != 0 AND mid > 0 AND type = 4", new Object[0]);
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        if (!pg3.B(longValue)) {
                            arrayList6.add(Long.valueOf(longValue));
                            if (pg3.D(longValue)) {
                                arrayList7.add(Long.valueOf(longValue));
                            } else {
                                arrayList8.add(Long.valueOf(-longValue));
                            }
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList7.isEmpty()) {
                        ArrayList arrayList9 = new ArrayList();
                        cf7Var.k0(arrayList7, arrayList9, false);
                        int size2 = arrayList9.size();
                        int i26 = 0;
                        while (i26 < size2) {
                            Object obj = arrayList9.get(i26);
                            i26++;
                            TLRPC.User user = (TLRPC.User) obj;
                            vh6Var3.k(user, user.id);
                        }
                    }
                    if (!arrayList8.isEmpty()) {
                        ArrayList arrayList10 = new ArrayList();
                        cf7Var.P(TextUtils.join(",", arrayList8), arrayList10);
                        int size3 = arrayList10.size();
                        while (i < size3) {
                            Object obj2 = arrayList10.get(i);
                            i++;
                            TLRPC.Chat chat = (TLRPC.Chat) obj2;
                            vh6Var4.k(chat, chat.id);
                        }
                    }
                } catch (Exception e4) {
                    fc4.g(e4, true);
                }
                gm.c3(new i77((Object) iibVar, i25, (Object) arrayList6, (Object) vh6Var3, (Object) vh6Var4, (byte) 28));
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
                        gm.c3(new tda((Object) c0Var, c0Var.d, (Object) new ArrayList(), (Object) new ArrayList(), (byte) 9));
                        return;
                    }
                    String S0 = jb6.D0().S0(lowerCase, true, false);
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
                        String c = nxe.c(((cnb) arrayList13.get(0)).e);
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
                    gm.c3(new tda((Object) c0Var, i27, (Object) arrayList11, (Object) arrayList12, (byte) 9));
                    return;
                } catch (Exception e5) {
                    fc4.g(e5, true);
                    return;
                }
            case 24:
                gm.c3(new tda(this.c, this.d, this.b, (Object) neb.c(gm.p, R.raw.default_pattern, gm.L(120.0f), gm.L(140.0f), -16777216, 1), (byte) 10));
                return;
            case 25:
                ((eqb) this.c).b((short[]) this.d, this.b);
                return;
            case 26:
                krb krbVar = (krb) this.c;
                qm1 qm1Var = (qm1) this.d;
                int i31 = this.b;
                yv1 yv1Var3 = qm1Var.b;
                int i32 = yv1.xd;
                yv1Var3.Ta(i31);
                if (i31 != 1 && i31 != 13) {
                    r11 = false;
                }
                krbVar.b(r11);
                return;
            case 27:
                k47 k47Var2 = (k47) this.c;
                mc2 mc2Var = (mc2) this.d;
                int i33 = this.b;
                HashMap hashMap = v0c.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(v0c.r(k47Var2)));
                }
                if (mc2Var != null) {
                    mc2Var.Y(3);
                }
                nm7.f(i33).k(nm7.A1, k47Var2);
                nm7.f(i33).k(nm7.E1, new Object[0]);
                return;
            case 28:
                l9c l9cVar = (l9c) this.c;
                String str5 = (String) this.d;
                int i34 = this.b;
                l9cVar.c.remove(str5);
                ConnectionsManager.getInstance(l9cVar.a).cancelRequest(i34, true);
                return;
            default:
                int i35 = this.b;
                tmc tmcVar = (tmc) this.c;
                c cVar = (c) this.d;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i35);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new kc(r12), new p((Object) tmcVar, (Object) cVar, (Object) connectionsManager, (byte) 26));
                return;
        }
    }

    public /* synthetic */ v99(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ v99(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
