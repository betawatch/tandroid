// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vt4 implements jac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vt4(c cVar, p pVar) {
        this.a = (byte) 5;
        this.b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c1  */
    @Override // jac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        qac qacVar;
        float f;
        float f2;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        mk0 mk0Var;
        float f3;
        TL_stars.StarsAmount starsAmount;
        u3b u3bVar;
        ArrayList<TLRPC.Message> arrayList5;
        int i3;
        byte b = this.a;
        byte b2 = 9;
        boolean z = true;
        int i4 = 0;
        r14 = 0;
        r14 = 0;
        r14 = 0;
        int i5 = 0;
        r14 = false;
        boolean z2 = false;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                xt4 xt4Var = (xt4) obj3;
                if (obj != null && xt4Var.o1 == null && (obj instanceof jo6) && (qacVar = xt4Var.p1) != null) {
                    qacVar.a((jo6) obj);
                    break;
                }
                break;
            case 1:
                lv4 lv4Var = (lv4) obj3;
                TL_payments.StarGiftActiveAuctions starGiftActiveAuctions = (TL_payments.StarGiftActiveAuctions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (starGiftActiveAuctions != null && tL_error == null && (starGiftActiveAuctions instanceof TL_payments.TL_starGiftActiveAuctions)) {
                    TL_payments.TL_starGiftActiveAuctions tL_starGiftActiveAuctions = (TL_payments.TL_starGiftActiveAuctions) starGiftActiveAuctions;
                    lv4Var.getMessagesController().d4(tL_starGiftActiveAuctions.users, false);
                    lv4Var.getMessagesController().X3(tL_starGiftActiveAuctions.chats, false);
                    ArrayList<TL_stars.TL_StarGiftActiveAuctionState> arrayList6 = tL_starGiftActiveAuctions.auctions;
                    int size = arrayList6.size();
                    int i6 = 0;
                    while (i6 < size) {
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState = arrayList6.get(i6);
                        i6++;
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState2 = tL_StarGiftActiveAuctionState;
                        lv4Var.a(tL_StarGiftActiveAuctionState2.gift, tL_StarGiftActiveAuctionState2.state, tL_StarGiftActiveAuctionState2.user_state);
                    }
                    break;
                }
                break;
            case 2:
                yw4 yw4Var = (yw4) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                ((l7c) obj2).G = true;
                if (yw4Var.j2) {
                    float f4 = 8.0f;
                    arrayList7.add(c6c.D(gm.L(8.0f) + a.getCurrentActionBarHeight()));
                    if (TextUtils.isEmpty(yw4Var.k2)) {
                        f = 8.0f;
                        TLRPC.UserFull X1 = oc7.r1(yw4Var.a).X1(z8c.h(yw4Var.a).e());
                        if (X1 == null) {
                            oc7.r1(yw4Var.a).b3(z8c.h(yw4Var.a).f(), 0, true, null);
                        }
                        if (yw4Var.V1 != null) {
                            int size2 = arrayList7.size();
                            if (yw4Var.V1.b) {
                                sn2 sn2Var = yw4Var.W1;
                                if (sn2Var == null) {
                                    sn2Var = yw4Var.a1(R.drawable.filled_gift_send, cmb.v0(cmb.Ei, yw4Var.J0));
                                    yw4Var.W1 = sn2Var;
                                }
                                String M0 = jb6.M0(2131750040, null);
                                int i7 = vw4.b;
                                c6c K = c6c.K(vw4.class);
                                f3 = 56.0f;
                                K.d = -97;
                                K.l = sn2Var;
                                K.m = M0;
                                K.n = null;
                                arrayList7.add(K);
                            } else {
                                f3 = 56.0f;
                            }
                            ww4 ww4Var = yw4Var.V1;
                            if (ww4Var.c) {
                                int i8 = ww4Var.d;
                                String G = i8 > 0 ? jb6.G(i8, "Gift2ExportTONUnlocksIn", new Object[0]) : null;
                                if (oc7.r1(yw4Var.a).l4.n0.f) {
                                    if (yw4Var.X1 == null) {
                                        yw4Var.X1 = yw4Var.a1(R.drawable.filled_wallet_move, cmb.v0(cmb.Ei, yw4Var.J0));
                                    }
                                    String x = c.C(yw4Var.a).x();
                                    if (G != null || x == null || x.length() < 20) {
                                        f2 = 12.0f;
                                    } else {
                                        int v0 = cmb.v0(cmb.q5, yw4Var.J0);
                                        int length = x.length();
                                        f2 = 12.0f;
                                        int i9 = length - 8;
                                        int i10 = length - 4;
                                        String[] strArr = {x.substring(0, 4), x.substring(4, 8), x.substring(8, 10).concat(x.substring(length - 10, i9)), x.substring(i9, i10), x.substring(i10, length)};
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                        int i11 = 0;
                                        while (i11 < 5) {
                                            int length2 = spannableStringBuilder.length();
                                            spannableStringBuilder.append((CharSequence) strArr[i11]);
                                            spannableStringBuilder.setSpan(new rw4(v0, i11 == 2), length2, spannableStringBuilder.length(), 33);
                                            i11++;
                                        }
                                        G = spannableStringBuilder;
                                    }
                                    sn2 sn2Var2 = yw4Var.X1;
                                    String M02 = jb6.M0(2131750037, null);
                                    int i12 = vw4.b;
                                    c6c K2 = c6c.K(vw4.class);
                                    K2.d = -98;
                                    K2.l = sn2Var2;
                                    K2.m = M02;
                                    K2.n = G;
                                    arrayList7.add(K2);
                                } else {
                                    f2 = 12.0f;
                                    sn2 sn2Var3 = yw4Var.Y1;
                                    if (sn2Var3 == null) {
                                        sn2Var3 = yw4Var.a1(R.drawable.fragment, -16777216);
                                        yw4Var.Y1 = sn2Var3;
                                    }
                                    String M03 = jb6.M0(2131749923, null);
                                    int i13 = vw4.b;
                                    c6c K3 = c6c.K(vw4.class);
                                    K3.d = -99;
                                    K3.l = sn2Var3;
                                    K3.m = M03;
                                    K3.n = G;
                                    arrayList7.add(K3);
                                }
                            } else {
                                f2 = 12.0f;
                            }
                            i = gm.L(f3) * (arrayList7.size() - size2);
                        } else {
                            f2 = 12.0f;
                            i = 0;
                        }
                        if (!yw4Var.S1 && yw4Var.U1 == null && yw4Var.V1 == null && X1 != null && X1.birthday == null) {
                            c6c c = c6c.c(1, R.drawable.menu_birthday, jb6.M0(2131749350, null));
                            c.r = true;
                            arrayList7.add(c);
                            i += gm.L(50.0f);
                        }
                        if (yw4Var.T1 != null) {
                            arrayList = arrayList7;
                            i = i + yw4Var.Z0(arrayList, 2, jb6.M0(2131753676, null), yw4Var.T1.c, null) + yw4Var.Z0(arrayList, 3, jb6.M0(2131753669, null), yw4Var.T1.b, null) + yw4Var.Z0(arrayList, 4, jb6.M0(2131753670, null), yw4Var.T1.d, null);
                        } else {
                            arrayList = arrayList7;
                        }
                        TLRPC.User f5 = z8c.h(yw4Var.a).f();
                        if (!yw4Var.S1 && yw4Var.U1 == null && yw4Var.V1 == null && f5 != null) {
                            ArrayList arrayList8 = new ArrayList(1);
                            arrayList8.add(f5);
                            i += yw4Var.Z0(arrayList, 5, jb6.M0(2131750032, null), arrayList8, jb6.M0(2131750033, null));
                        }
                        oc7 r1 = oc7.r1(yw4Var.a);
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = yw4Var.e2;
                        int size3 = arrayList10.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj4 = arrayList10.get(i14);
                            i14++;
                            TLRPC.User W1 = r1.W1(Long.valueOf(((TLRPC.TL_topPeer) obj4).peer.user_id));
                            if (W1 != null && !W1.self && !m9c.z(W1)) {
                                long j = W1.id;
                                mk0 mk0Var2 = yw4Var.T1;
                                if (mk0Var2 == null || !mk0Var2.a(j)) {
                                    arrayList9.add(W1);
                                }
                            }
                        }
                        if (!yw4Var.Z1.isEmpty()) {
                            HashSet hashSet = new HashSet();
                            int size4 = arrayList9.size();
                            int i15 = 0;
                            while (i15 < size4) {
                                Object obj5 = arrayList9.get(i15);
                                i15++;
                                hashSet.add(Long.valueOf(((TLRPC.User) obj5).id));
                            }
                            ArrayList arrayList11 = yw4Var.b2;
                            int size5 = arrayList11.size();
                            int i16 = 0;
                            while (i16 < size5) {
                                Object obj6 = arrayList11.get(i16);
                                i16++;
                                hashSet.add(Long.valueOf(((TLRPC.TL_contact) obj6).user_id));
                            }
                            ArrayList arrayList12 = new ArrayList();
                            for (TLRPC.User user : yw4Var.Z1.values()) {
                                if (!hashSet.contains(Long.valueOf(user.id))) {
                                    arrayList12.add(user);
                                }
                            }
                            i += yw4Var.Z0(arrayList, 7, null, arrayList12, null);
                        }
                        ArrayList arrayList13 = arrayList9;
                        int Z0 = i + yw4Var.Z0(arrayList, 6, jb6.M0(2131749449, null), arrayList9, null);
                        long e = z8c.h(yw4Var.a).e();
                        int i17 = 0;
                        while (i17 < yw4Var.d2.size()) {
                            String str = (String) yw4Var.d2.get(i17);
                            ArrayList arrayList14 = (ArrayList) yw4Var.c2.get(str);
                            if (arrayList14 == null) {
                                arrayList3 = arrayList13;
                                arrayList4 = arrayList;
                            } else {
                                arrayList13.clear();
                                int size6 = arrayList14.size();
                                int i18 = 0;
                                while (i18 < size6) {
                                    Object obj7 = arrayList14.get(i18);
                                    i18++;
                                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj7;
                                    long j2 = tL_contact.user_id;
                                    if (j2 != e && ((mk0Var = yw4Var.T1) == null || !mk0Var.a(j2))) {
                                        TLRPC.User W12 = r1.W1(Long.valueOf(tL_contact.user_id));
                                        if (W12 != null) {
                                            arrayList13.add(W12);
                                        }
                                    }
                                }
                                arrayList3 = arrayList13;
                                int Z02 = yw4Var.Z0(arrayList, i17 + 8, str.toUpperCase(), arrayList3, null);
                                arrayList4 = arrayList;
                                Z0 += Z02;
                            }
                            i17++;
                            arrayList = arrayList4;
                            arrayList13 = arrayList3;
                        }
                        arrayList2 = arrayList;
                        i2 = Z0;
                    } else {
                        if (yw4Var.f2.isEmpty() && yw4Var.g2.isEmpty()) {
                            if (yw4Var.l2 >= 0) {
                                int i1 = yw4.i1(null, arrayList7);
                                for (int i19 = 0; i19 < 3; i19++) {
                                    arrayList7.add(c6c.q(i19, 6));
                                }
                                i2 = gm.L(168.0f) + i1;
                            } else {
                                arrayList7.add(q22.i(jb6.M0(2131745541, null), jb6.M0(2131747901, null)));
                                i2 = gm.L(200.0f);
                            }
                            arrayList2 = arrayList7;
                            f = 8.0f;
                        } else {
                            int Z03 = yw4Var.Z0(arrayList7, 1, null, yw4Var.f2, null);
                            boolean isEmpty = yw4Var.f2.isEmpty();
                            ArrayList arrayList15 = yw4Var.g2;
                            int i20 = 0;
                            int i21 = 0;
                            while (i20 < arrayList15.size()) {
                                if (i20 == 0 && isEmpty) {
                                    i21 += yw4.i1(null, arrayList7);
                                }
                                TLRPC.Chat chat = (TLRPC.Chat) arrayList15.get(i20);
                                int i22 = sw4.b;
                                c6c K4 = c6c.K(sw4.class);
                                K4.d = 1;
                                K4.y = -chat.id;
                                K4.H = chat;
                                arrayList7.add(K4);
                                i21 += gm.L(56.0f);
                                i20++;
                                f4 = f4;
                                isEmpty = isEmpty;
                            }
                            f = f4;
                            i2 = Z03 + i21;
                            arrayList2 = arrayList7;
                        }
                        f2 = 12.0f;
                    }
                    arrayList2.add(c6c.C(null));
                    int L = gm.L(f2) + i2;
                    int measuredHeight = yw4Var.n1.getMeasuredHeight();
                    if (measuredHeight <= 0) {
                        measuredHeight = gm.q.y;
                    }
                    arrayList2.add(c6c.D(Math.max(0, gm.L(2.0f) + (((measuredHeight - gm.m) - (gm.L(f) + a.getCurrentActionBarHeight())) - L))));
                    break;
                }
                break;
            case 3:
                ((ux4) obj3).Y0((ArrayList) obj, (l7c) obj2);
                break;
            case 4:
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = (TLRPC.TL_starsRevenueStatus) obj;
                ((ds7) obj3).a(Long.valueOf(Math.max(0L, (tL_starsRevenueStatus == null || (starsAmount = tL_starsRevenueStatus.available_balance) == null || !tL_starsRevenueStatus.withdrawal_enabled) ? 0L : starsAmount.amount)), (TLRPC.TL_error) obj2);
                break;
            case 5:
                p pVar = (p) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str2 = (String) obj2;
                if (wallettransaction == null) {
                    c.m("emulate disable backup, no transaction: ".concat(str2 != null ? str2 : "NULL_ERROR"));
                    if (str2 == null) {
                        str2 = "NULL_ERROR";
                    }
                    pVar.a(null, str2);
                    break;
                } else {
                    pVar.a(Long.valueOf(wallettransaction.fee), null);
                    break;
                }
            case 6:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((u35) obj3).a((tL_error2 == null && (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) ? null : w45.z(tL_error2, "closeSession"));
                break;
            case 7:
                w45 w45Var = (w45) obj3;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                c cVar = w45Var.b;
                ArrayList arrayList16 = w45Var.d;
                w45Var.e = -1;
                if (tL_error3 != null || tonconnectsessions == null) {
                    w45.z(tL_error3, "getSessions");
                    cVar.S();
                    break;
                } else {
                    arrayList16.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList17 = tonconnectsessions.sessions;
                    if (arrayList17 != null) {
                        arrayList16.addAll(arrayList17);
                    }
                    cVar.S();
                    break;
                }
            case 8:
                ((n55) obj3).a0((ArrayList) obj, (l7c) obj2);
                break;
            case 9:
                ((ArrayList) obj).add(c6c.j(-1, ((ud5) obj3).T1));
                break;
            case 10:
                te5 te5Var = (te5) obj3;
                ArrayList arrayList18 = (ArrayList) obj;
                ArrayList arrayList19 = new ArrayList(0);
                te5Var.c = arrayList19;
                arrayList19.addAll(af5.a(te5Var.a).f);
                if (!te5Var.c.isEmpty()) {
                    for (int i23 = 0; i23 < te5Var.c.size(); i23++) {
                        String str3 = (String) te5Var.c.get(i23);
                        if (str3.startsWith("#") || str3.startsWith("$")) {
                            arrayList18.add(c6c.c(i23 + 1, str3.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str3.substring(1)));
                        }
                    }
                    arrayList18.add(c6c.c(0, R.drawable.msg_clear_recent, jb6.M0(2131752026, null)));
                    break;
                }
                break;
            case 11:
                bf5 bf5Var = (bf5) obj3;
                ArrayList arrayList20 = (ArrayList) obj;
                ArrayList arrayList21 = bf5Var.R;
                boolean z3 = bf5Var.S && (u3bVar = bf5Var.T) != null && u3bVar.i.size() > 0;
                if (z3) {
                    u3b u3bVar2 = bf5Var.T;
                    int i24 = qc7.b;
                    c6c K5 = c6c.K(qc7.class);
                    K5.H = u3bVar2;
                    arrayList20.add(K5);
                }
                bf5Var.U = z3;
                while (i4 < arrayList21.size()) {
                    int i25 = i4 + 1;
                    k47 k47Var = (k47) arrayList21.get(i4);
                    c6c c6cVar = new c6c(33);
                    c6cVar.d = i25;
                    c6cVar.H = k47Var;
                    arrayList20.add(c6cVar);
                    i4 = i25;
                }
                if (bf5Var.V || !bf5Var.Y) {
                    arrayList20.add(c6c.q(-2, 1));
                    arrayList20.add(c6c.q(-3, 1));
                    arrayList20.add(c6c.q(-4, 1));
                }
                if (!bf5Var.U && z3) {
                    gm.c3(new qn4(bf5Var, (byte) 28));
                    break;
                }
                break;
            case 12:
                yt5 yt5Var = (yt5) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                bu5 bu5Var = yt5Var.G;
                bu5Var.f.setAlpha(1.0f);
                if (bu5Var.u) {
                    yt5Var.c = bitmap;
                }
                jz4 jz4Var = bu5Var.n;
                if (jz4Var != null) {
                    jz4Var.a(bitmap2);
                    tl0.c(bu5Var.n, yt5Var);
                    ViewGroup viewGroup = bu5Var.A;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                a66 a66Var = (a66) obj3;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                a66Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    oc7.r1(a66Var.b).d4(tL_tones.users, false);
                    d S = LaunchActivity.S();
                    if (S != null && !tL_tones.tones.isEmpty()) {
                        new e0(S.getContext(), tL_tones.tones.get(0), S.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error4 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error4.text)) {
                        ts2.u(null, 2131754974, a66.d(), R.raw.error, 36);
                        break;
                    } else {
                        a66.d().g0(tL_error4, false);
                        break;
                    }
                }
                break;
            case 14:
                oc6 oc6Var = (oc6) obj3;
                ArrayList arrayList22 = (ArrayList) obj;
                String M04 = jb6.M0(2131752651, null);
                String M05 = jb6.M0(2131752645, null);
                c6c c6cVar2 = new c6c(2);
                c6cVar2.m = M04;
                c6cVar2.p = M05;
                c6cVar2.k = R.raw.biz_map;
                arrayList22.add(c6cVar2);
                arrayList22.add(c6c.k(oc6Var.d));
                arrayList22.add(c6c.C(null));
                c6c i26 = c6c.i(1, jb6.M0(2131752644, null));
                i26.L(oc6Var.x != null);
                arrayList22.add(i26);
                if (oc6Var.x != null) {
                    arrayList22.add(c6c.k(oc6Var.f));
                }
                arrayList22.add(c6c.C(null));
                if (oc6Var.w != null && (oc6Var.x != null || !TextUtils.isEmpty(oc6Var.y))) {
                    z2 = true;
                }
                oc6Var.G = z2;
                if (z2) {
                    c6c e2 = c6c.e(2, jb6.M0(2131752649, null));
                    e2.s = true;
                    arrayList22.add(e2);
                    arrayList22.add(c6c.C(null));
                }
                oc6Var.Z(true);
                break;
            case 15:
                zf6 zf6Var = (zf6) obj3;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                mh6 mh6Var = zf6Var.Q;
                zf6Var.J = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    zf6Var.n();
                    mh6Var.K1(false, true);
                    zf6Var.postDelayed(new k16(zf6Var, auth_authorization, (byte) 19), 150L);
                    break;
                } else {
                    mh6Var.y1(false, true);
                    if (tL_error5.text.contains("PHONE_NUMBER_INVALID")) {
                        mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131748936, "InvalidPhoneNumber"));
                        break;
                    } else if (!tL_error5.text.contains("PHONE_CODE_EMPTY") && !tL_error5.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            zf6Var.d(true);
                            mh6Var.J1(0, true, null, true);
                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, "CodeExpired"));
                            break;
                        } else if (tL_error5.text.contains("FIRSTNAME_INVALID")) {
                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131748939, "InvalidFirstName"));
                            break;
                        } else if (tL_error5.text.contains("LASTNAME_INVALID")) {
                            mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131748937, "InvalidLastName"));
                            break;
                        } else {
                            mh6Var.z1(jb6.M0(2131745804, null), tL_error5.text);
                            break;
                        }
                    } else {
                        mh6Var.z1(jb6.M0(2131745804, null), jb6.M0(2131748940, "InvalidCode"));
                        break;
                    }
                }
            case 16:
                hs6 hs6Var = (hs6) obj3;
                TLRPC.contacts_TopPeers contacts_toppeers = (TLRPC.contacts_TopPeers) obj;
                if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeers) {
                    TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) contacts_toppeers;
                    hs6Var.getMessagesController().d4(tL_contacts_topPeers.users, false);
                    hs6Var.getMessagesController().X3(tL_contacts_topPeers.chats, false);
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    for (int i27 = 0; i27 < tL_contacts_topPeers.categories.size(); i27++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i27);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        boolean z4 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline;
                        ArrayList<TLRPC.TL_topPeer> arrayList23 = tL_topPeerCategoryPeers.peers;
                        if (z4) {
                            hs6Var.k1 = arrayList23;
                            hs6Var.getUserConfig().F = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                            hs6Var.m1 = arrayList23;
                            hs6Var.getUserConfig().H = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                            hs6Var.l1 = arrayList23;
                            hs6Var.getUserConfig().G = currentTimeMillis;
                        } else {
                            hs6Var.j1 = arrayList23;
                            long e3 = hs6Var.getUserConfig().e();
                            int i28 = 0;
                            while (true) {
                                if (i28 < hs6Var.j1.size()) {
                                    if (((TLRPC.TL_topPeer) hs6Var.j1.get(i28)).peer.user_id == e3) {
                                        hs6Var.j1.remove(i28);
                                    } else {
                                        i28++;
                                    }
                                }
                            }
                            hs6Var.getUserConfig().E = (int) (System.currentTimeMillis() / 1000);
                        }
                    }
                    hs6Var.getUserConfig().u(false);
                    hs6Var.o();
                    hs6Var.getNotificationCenter().k(82, new Object[0]);
                    hs6Var.getNotificationCenter().k(83, new Object[0]);
                    hs6Var.getNotificationCenter().k(84, new Object[0]);
                    hs6Var.getNotificationCenter().k(85, new Object[0]);
                    hs6Var.getMessagesStorage().a.c(new lj6(hs6Var, tL_contacts_topPeers, b2));
                    break;
                } else if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeersDisabled) {
                    hs6Var.getUserConfig().W = false;
                    hs6Var.getUserConfig().s = (int) (System.currentTimeMillis() / 1000);
                    hs6Var.getUserConfig().u(false);
                    hs6Var.H();
                    break;
                }
                break;
            case 17:
                pv7 pv7Var = (pv7) obj3;
                pv7Var.A0 = ((Integer) obj).intValue();
                pv7Var.B0 = ((Integer) obj2).intValue();
                gm.d3(new pg6(pv7Var, (byte) 18), 60L);
                break;
            case 18:
                gu2 gu2Var = (gu2) obj3;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (((TLRPC.TL_error) obj2) == null && messages_messages != null && (arrayList5 = messages_messages.messages) != null && !arrayList5.isEmpty()) {
                    i5 = messages_messages.messages.get(0).id;
                }
                gm.c3(new ga7(gu2Var, i5, (byte) 1));
                break;
            case 19:
                eo2 eo2Var = (eo2) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (tL_error6 != null) {
                    eo2Var.a(null, tL_error6);
                    break;
                } else {
                    eo2Var.a(new TLRPC.TL_boolTrue(), null);
                    break;
                }
            case 20:
                z71 z71Var = (z71) obj3;
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                    z71Var.a(Boolean.FALSE, tL_webBrowserSettings, Long.valueOf(tL_webBrowserSettings.hash), Boolean.TRUE);
                    break;
                } else if (webBrowserSettings instanceof TL_account.TL_webBrowserSettingsNotModified) {
                    Object obj8 = Boolean.TRUE;
                    z71Var.a(obj8, null, 0L, obj8);
                    break;
                } else {
                    fc4.d("getting web settings error ".concat(tL_error7 != null ? tL_error7.code + " " + tL_error7.text : ""));
                    Object obj9 = Boolean.FALSE;
                    if (tL_error7 != null && ((i3 = tL_error7.code) == -2000 || i3 == -2001)) {
                        z = false;
                    }
                    z71Var.a(obj9, null, 0L, Boolean.valueOf(z));
                    break;
                }
            case 21:
                ((ArrayList) obj).add(c6c.k(((el7) obj3).T1));
                break;
            case 22:
                pr7 pr7Var = (pr7) obj3;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                TextView textView = pr7Var.a2;
                pr7Var.e2 = null;
                if (wallettransaction2 != null) {
                    long j3 = wallettransaction2.fee;
                    if (j3 > 0) {
                        pr7Var.f2 = j3;
                        textView.setText(jb6.a0(null, null, 2131749565, fs7.k(j3)));
                        if (!pr7Var.k2) {
                            pr7Var.k2 = false;
                            gm.r(pr7Var.l2);
                            pr7Var.c2.setLoading(false);
                            pr7Var.a1();
                            break;
                        }
                    }
                }
                textView.setVisibility(8);
                if (!pr7Var.k2) {
                }
                break;
            case 23:
                ((ss7) obj3).b0((ArrayList) obj);
                break;
            case 24:
                us7 us7Var = (us7) obj3;
                ArrayList arrayList24 = (ArrayList) obj;
                ArrayList arrayList25 = us7Var.b;
                String M06 = jb6.M0(2131752705, null);
                c6c c6cVar3 = new c6c(9);
                c6cVar3.d = -1;
                c6cVar3.m = M06;
                c6cVar3.L(us7Var.r);
                arrayList24.add(c6cVar3);
                arrayList24.add(c6c.C(null));
                if (us7Var.r) {
                    for (int i29 = 0; i29 < arrayList25.size(); i29++) {
                        if (i29 > 0) {
                            arrayList24.add(c6c.C(null));
                        }
                        rs7 rs7Var = (rs7) arrayList25.get(i29);
                        if (!us7Var.Z()) {
                            int i30 = i29 * 3;
                            arrayList24.add(c6c.f(jb6.M0(2131752704, null), rs7.a(rs7Var.a), i30));
                            arrayList24.add(c6c.f(jb6.M0(2131752710, null), rs7.a(rs7Var.b), i30 + 1));
                            c6c e4 = c6c.e(i30 + 2, jb6.M0(2131746054, null));
                            e4.s = true;
                            arrayList24.add(e4);
                        }
                    }
                    if (us7Var.a0()) {
                        arrayList24.add(c6c.C(null));
                        c6c c2 = c6c.c(-2, R.drawable.menu_premium_clock_add, jb6.M0(2131752711, null));
                        c2.r = true;
                        arrayList24.add(c2);
                    }
                    arrayList24.add(c6c.C(jb6.M0(2131752706, null)));
                    break;
                }
                break;
            case 25:
                xv7 xv7Var = (xv7) obj3;
                xv7Var.a0(xv7Var.g0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 26:
                ((u9b) obj3).X(((Float) obj2).floatValue(), (Bitmap) obj);
                break;
            case 27:
                xg8 xg8Var = (xg8) obj3;
                jz4 jz4Var2 = xg8Var.G;
                Bitmap bitmap3 = (Bitmap) obj2;
                xg8Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                xg8Var.x = paint;
                Bitmap bitmap4 = xg8Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap4, tileMode, tileMode);
                xg8Var.w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                gm.i(colorMatrix, cmb.I.o() ? 0.05f : 0.25f);
                gm.h(colorMatrix, cmb.I.o() ? -0.02f : -0.04f);
                xg8Var.x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                xg8Var.y = new Matrix();
                jz4Var2.a(bitmap3);
                tl0.c(jz4Var2, xg8Var.c);
                xg8Var.H.d();
                break;
            case 28:
                ArrayList arrayList26 = (ArrayList) obj;
                jza jzaVar = ((zg8) obj3).T1;
                if (jzaVar != null) {
                    arrayList26.add(c6c.D(gm.L(12.0f)));
                    arrayList26.add(c6c.h(0, 0, jzaVar));
                    break;
                }
                break;
            default:
                ((x0) obj3).a((TL_stats.TL_statsPollStats) obj);
                break;
        }
    }

    public /* synthetic */ vt4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
