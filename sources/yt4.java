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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class yt4 implements icc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yt4(c cVar, p pVar) {
        this.a = (byte) 5;
        this.b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    @Override // icc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        pcc pccVar;
        float f;
        float f2;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        nj0 nj0Var;
        float f3;
        TL_stars.StarsAmount starsAmount;
        p5b p5bVar;
        ArrayList<TLRPC.Message> arrayList5;
        int i3;
        byte b = this.a;
        byte b2 = 6;
        byte b3 = 8;
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
                au4 au4Var = (au4) obj3;
                if (obj != null && au4Var.o1 == null && (obj instanceof no6) && (pccVar = au4Var.p1) != null) {
                    pccVar.a((no6) obj);
                    break;
                }
                break;
            case 1:
                ov4 ov4Var = (ov4) obj3;
                TL_payments.StarGiftActiveAuctions starGiftActiveAuctions = (TL_payments.StarGiftActiveAuctions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (starGiftActiveAuctions != null && tL_error == null && (starGiftActiveAuctions instanceof TL_payments.TL_starGiftActiveAuctions)) {
                    TL_payments.TL_starGiftActiveAuctions tL_starGiftActiveAuctions = (TL_payments.TL_starGiftActiveAuctions) starGiftActiveAuctions;
                    ov4Var.getMessagesController().j4(tL_starGiftActiveAuctions.users, false);
                    ov4Var.getMessagesController().c4(tL_starGiftActiveAuctions.chats, false);
                    ArrayList<TL_stars.TL_StarGiftActiveAuctionState> arrayList6 = tL_starGiftActiveAuctions.auctions;
                    int size = arrayList6.size();
                    int i6 = 0;
                    while (i6 < size) {
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState = arrayList6.get(i6);
                        i6++;
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState2 = tL_StarGiftActiveAuctionState;
                        ov4Var.a(tL_StarGiftActiveAuctionState2.gift, tL_StarGiftActiveAuctionState2.state, tL_StarGiftActiveAuctionState2.user_state);
                    }
                    break;
                }
                break;
            case 2:
                bx4 bx4Var = (bx4) obj3;
                ArrayList arrayList7 = (ArrayList) obj;
                ((l9c) obj2).G = true;
                if (bx4Var.j2) {
                    float f4 = 8.0f;
                    arrayList7.add(b8c.D(hl.L(8.0f) + a.getCurrentActionBarHeight()));
                    if (TextUtils.isEmpty(bx4Var.k2)) {
                        f = 8.0f;
                        TLRPC.UserFull Y1 = uc7.s1(bx4Var.a).Y1(yac.h(bx4Var.a).e());
                        if (Y1 == null) {
                            uc7.s1(bx4Var.a).f3(yac.h(bx4Var.a).f(), 0, true, null);
                        }
                        if (bx4Var.V1 != null) {
                            int size2 = arrayList7.size();
                            if (bx4Var.V1.b) {
                                zm2 zm2Var = bx4Var.W1;
                                if (zm2Var == null) {
                                    zm2Var = bx4Var.b1(R.drawable.filled_gift_send, aob.v0(aob.Fi, bx4Var.J0));
                                    bx4Var.W1 = zm2Var;
                                }
                                String M0 = ob6.M0(2131750066, null);
                                int i7 = yw4.b;
                                b8c K = b8c.K(yw4.class);
                                f3 = 56.0f;
                                K.d = -97;
                                K.l = zm2Var;
                                K.m = M0;
                                K.n = null;
                                arrayList7.add(K);
                            } else {
                                f3 = 56.0f;
                            }
                            zw4 zw4Var = bx4Var.V1;
                            if (zw4Var.c) {
                                int i8 = zw4Var.d;
                                String G = i8 > 0 ? ob6.G(i8, "Gift2ExportTONUnlocksIn", new Object[0]) : null;
                                if (uc7.s1(bx4Var.a).k4.v0.f) {
                                    if (bx4Var.X1 == null) {
                                        bx4Var.X1 = bx4Var.b1(R.drawable.filled_wallet_move, aob.v0(aob.Fi, bx4Var.J0));
                                    }
                                    String x = c.C(bx4Var.a).x();
                                    if (G != null || x == null || x.length() < 20) {
                                        f2 = 12.0f;
                                    } else {
                                        int v0 = aob.v0(aob.r5, bx4Var.J0);
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
                                            spannableStringBuilder.setSpan(new uw4(v0, i11 == 2), length2, spannableStringBuilder.length(), 33);
                                            i11++;
                                        }
                                        G = spannableStringBuilder;
                                    }
                                    zm2 zm2Var2 = bx4Var.X1;
                                    String M02 = ob6.M0(2131750063, null);
                                    int i12 = yw4.b;
                                    b8c K2 = b8c.K(yw4.class);
                                    K2.d = -98;
                                    K2.l = zm2Var2;
                                    K2.m = M02;
                                    K2.n = G;
                                    arrayList7.add(K2);
                                } else {
                                    f2 = 12.0f;
                                    zm2 zm2Var3 = bx4Var.Y1;
                                    if (zm2Var3 == null) {
                                        zm2Var3 = bx4Var.b1(R.drawable.fragment, -16777216);
                                        bx4Var.Y1 = zm2Var3;
                                    }
                                    String M03 = ob6.M0(2131749936, null);
                                    int i13 = yw4.b;
                                    b8c K3 = b8c.K(yw4.class);
                                    K3.d = -99;
                                    K3.l = zm2Var3;
                                    K3.m = M03;
                                    K3.n = G;
                                    arrayList7.add(K3);
                                }
                            } else {
                                f2 = 12.0f;
                            }
                            i = hl.L(f3) * (arrayList7.size() - size2);
                        } else {
                            f2 = 12.0f;
                            i = 0;
                        }
                        if (!bx4Var.S1 && bx4Var.U1 == null && bx4Var.V1 == null && Y1 != null && Y1.birthday == null) {
                            b8c c = b8c.c(1, R.drawable.menu_birthday, ob6.M0(2131749347, null));
                            c.r = true;
                            arrayList7.add(c);
                            i += hl.L(50.0f);
                        }
                        if (bx4Var.T1 != null) {
                            arrayList = arrayList7;
                            i = i + bx4Var.a1(arrayList, 2, ob6.M0(2131753704, null), bx4Var.T1.c, null) + bx4Var.a1(arrayList, 3, ob6.M0(2131753697, null), bx4Var.T1.b, null) + bx4Var.a1(arrayList, 4, ob6.M0(2131753698, null), bx4Var.T1.d, null);
                        } else {
                            arrayList = arrayList7;
                        }
                        TLRPC.User f5 = yac.h(bx4Var.a).f();
                        if (!bx4Var.S1 && bx4Var.U1 == null && bx4Var.V1 == null && f5 != null) {
                            ArrayList arrayList8 = new ArrayList(1);
                            arrayList8.add(f5);
                            i += bx4Var.a1(arrayList, 5, ob6.M0(2131750058, null), arrayList8, ob6.M0(2131750059, null));
                        }
                        uc7 s1 = uc7.s1(bx4Var.a);
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = bx4Var.e2;
                        int size3 = arrayList10.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj4 = arrayList10.get(i14);
                            i14++;
                            TLRPC.User X1 = s1.X1(Long.valueOf(((TLRPC.TL_topPeer) obj4).peer.user_id));
                            if (X1 != null && !X1.self && !lbc.z(X1)) {
                                long j = X1.id;
                                nj0 nj0Var2 = bx4Var.T1;
                                if (nj0Var2 == null || !nj0Var2.a(j)) {
                                    arrayList9.add(X1);
                                }
                            }
                        }
                        if (!bx4Var.Z1.isEmpty()) {
                            HashSet hashSet = new HashSet();
                            int size4 = arrayList9.size();
                            int i15 = 0;
                            while (i15 < size4) {
                                Object obj5 = arrayList9.get(i15);
                                i15++;
                                hashSet.add(Long.valueOf(((TLRPC.User) obj5).id));
                            }
                            ArrayList arrayList11 = bx4Var.b2;
                            int size5 = arrayList11.size();
                            int i16 = 0;
                            while (i16 < size5) {
                                Object obj6 = arrayList11.get(i16);
                                i16++;
                                hashSet.add(Long.valueOf(((TLRPC.TL_contact) obj6).user_id));
                            }
                            ArrayList arrayList12 = new ArrayList();
                            for (TLRPC.User user : bx4Var.Z1.values()) {
                                if (!hashSet.contains(Long.valueOf(user.id))) {
                                    arrayList12.add(user);
                                }
                            }
                            i += bx4Var.a1(arrayList, 7, null, arrayList12, null);
                        }
                        ArrayList arrayList13 = arrayList9;
                        int a1 = i + bx4Var.a1(arrayList, 6, ob6.M0(2131749461, null), arrayList9, null);
                        long e = yac.h(bx4Var.a).e();
                        int i17 = 0;
                        while (i17 < bx4Var.d2.size()) {
                            String str = (String) bx4Var.d2.get(i17);
                            ArrayList arrayList14 = (ArrayList) bx4Var.c2.get(str);
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
                                    if (j2 != e && ((nj0Var = bx4Var.T1) == null || !nj0Var.a(j2))) {
                                        TLRPC.User X12 = s1.X1(Long.valueOf(tL_contact.user_id));
                                        if (X12 != null) {
                                            arrayList13.add(X12);
                                        }
                                    }
                                }
                                arrayList3 = arrayList13;
                                int a12 = bx4Var.a1(arrayList, i17 + 8, str.toUpperCase(), arrayList3, null);
                                arrayList4 = arrayList;
                                a1 += a12;
                            }
                            i17++;
                            arrayList = arrayList4;
                            arrayList13 = arrayList3;
                        }
                        arrayList2 = arrayList;
                        i2 = a1;
                    } else if (bx4Var.f2.isEmpty() && bx4Var.g2.isEmpty()) {
                        if (bx4Var.l2 >= 0) {
                            int j1 = bx4.j1(null, arrayList7);
                            for (int i19 = 0; i19 < 3; i19++) {
                                arrayList7.add(b8c.q(i19, 6));
                            }
                            i2 = hl.L(168.0f) + j1;
                        } else {
                            arrayList7.add(v12.i(ob6.M0(2131745535, null), ob6.M0(2131747898, null)));
                            i2 = hl.L(200.0f);
                        }
                        f = 8.0f;
                        f2 = 12.0f;
                        arrayList2 = arrayList7;
                    } else {
                        int a13 = bx4Var.a1(arrayList7, 1, null, bx4Var.f2, null);
                        boolean isEmpty = bx4Var.f2.isEmpty();
                        ArrayList arrayList15 = bx4Var.g2;
                        int i20 = 0;
                        int i21 = 0;
                        while (i20 < arrayList15.size()) {
                            if (i20 == 0 && isEmpty) {
                                i21 += bx4.j1(null, arrayList7);
                            }
                            TLRPC.Chat chat = (TLRPC.Chat) arrayList15.get(i20);
                            int i22 = vw4.b;
                            b8c K4 = b8c.K(vw4.class);
                            K4.d = 1;
                            K4.y = -chat.id;
                            K4.H = chat;
                            arrayList7.add(K4);
                            i21 += hl.L(56.0f);
                            i20++;
                            f4 = f4;
                            isEmpty = isEmpty;
                        }
                        f = f4;
                        i2 = a13 + i21;
                        f2 = 12.0f;
                        arrayList2 = arrayList7;
                    }
                    arrayList2.add(b8c.C(null));
                    int L = hl.L(f2) + i2;
                    int measuredHeight = bx4Var.n1.getMeasuredHeight();
                    if (measuredHeight <= 0) {
                        measuredHeight = hl.q.y;
                    }
                    arrayList2.add(b8c.D(Math.max(0, hl.L(2.0f) + (((measuredHeight - hl.m) - (hl.L(f) + a.getCurrentActionBarHeight())) - L))));
                    break;
                }
                break;
            case 3:
                ((yx4) obj3).Z0((ArrayList) obj, (l9c) obj2);
                break;
            case 4:
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = (TLRPC.TL_starsRevenueStatus) obj;
                ((gt7) obj3).a(Long.valueOf(Math.max(0L, (tL_starsRevenueStatus == null || (starsAmount = tL_starsRevenueStatus.available_balance) == null || !tL_starsRevenueStatus.withdrawal_enabled) ? 0L : starsAmount.amount)), (TLRPC.TL_error) obj2);
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
                ((v35) obj3).a((tL_error2 == null && (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) ? null : a55.z(tL_error2, "closeSession"));
                break;
            case 7:
                a55 a55Var = (a55) obj3;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                c cVar = a55Var.b;
                ArrayList arrayList16 = a55Var.d;
                a55Var.e = -1;
                if (tL_error3 != null || tonconnectsessions == null) {
                    a55.z(tL_error3, "getSessions");
                    cVar.T();
                    break;
                } else {
                    arrayList16.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList17 = tonconnectsessions.sessions;
                    if (arrayList17 != null) {
                        arrayList16.addAll(arrayList17);
                    }
                    cVar.T();
                    break;
                }
            case 8:
                ((r55) obj3).Z((ArrayList) obj, (l9c) obj2);
                break;
            case 9:
                ((ArrayList) obj).add(b8c.j(-1, ((xd5) obj3).T1));
                break;
            case 10:
                we5 we5Var = (we5) obj3;
                ArrayList arrayList18 = (ArrayList) obj;
                ArrayList arrayList19 = new ArrayList(0);
                we5Var.c = arrayList19;
                arrayList19.addAll(df5.a(we5Var.a).f);
                if (!we5Var.c.isEmpty()) {
                    for (int i23 = 0; i23 < we5Var.c.size(); i23++) {
                        String str3 = (String) we5Var.c.get(i23);
                        if (str3.startsWith("#") || str3.startsWith("$")) {
                            arrayList18.add(b8c.c(i23 + 1, str3.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str3.substring(1)));
                        }
                    }
                    arrayList18.add(b8c.c(0, R.drawable.msg_clear_recent, ob6.M0(2131752054, null)));
                    break;
                }
                break;
            case 11:
                ef5 ef5Var = (ef5) obj3;
                ArrayList arrayList20 = (ArrayList) obj;
                ArrayList arrayList21 = ef5Var.R;
                boolean z3 = ef5Var.S && (p5bVar = ef5Var.T) != null && p5bVar.i.size() > 0;
                if (z3) {
                    p5b p5bVar2 = ef5Var.T;
                    int i24 = wc7.b;
                    b8c K5 = b8c.K(wc7.class);
                    K5.H = p5bVar2;
                    arrayList20.add(K5);
                }
                ef5Var.U = z3;
                while (i4 < arrayList21.size()) {
                    int i25 = i4 + 1;
                    r47 r47Var = (r47) arrayList21.get(i4);
                    b8c b8cVar = new b8c(33);
                    b8cVar.d = i25;
                    b8cVar.H = r47Var;
                    arrayList20.add(b8cVar);
                    i4 = i25;
                }
                if (ef5Var.V || !ef5Var.Y) {
                    arrayList20.add(b8c.q(-2, 1));
                    arrayList20.add(b8c.q(-3, 1));
                    arrayList20.add(b8c.q(-4, 1));
                }
                if (!ef5Var.U && z3) {
                    hl.c3(new ea5(ef5Var, b2));
                    break;
                }
                break;
            case 12:
                bu5 bu5Var = (bu5) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                fu5 fu5Var = bu5Var.G;
                fu5Var.f.setAlpha(1.0f);
                if (fu5Var.u) {
                    bu5Var.c = bitmap;
                }
                nz4 nz4Var = fu5Var.n;
                if (nz4Var != null) {
                    nz4Var.a(bitmap2);
                    uk0.c(fu5Var.n, bu5Var);
                    ViewGroup viewGroup = fu5Var.A;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                e66 e66Var = (e66) obj3;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                e66Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    uc7.s1(e66Var.b).j4(tL_tones.users, false);
                    e S = LaunchActivity.S();
                    if (S != null && !tL_tones.tones.isEmpty()) {
                        new f0(S.getContext(), tL_tones.tones.get(0), S.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error4 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error4.text)) {
                        bs2.v(null, 2131754971, e66.d(), R.raw.error, 36);
                        break;
                    } else {
                        e66.d().g0(tL_error4, false);
                        break;
                    }
                }
                break;
            case 14:
                tc6 tc6Var = (tc6) obj3;
                ArrayList arrayList22 = (ArrayList) obj;
                String M04 = ob6.M0(2131752679, null);
                String M05 = ob6.M0(2131752673, null);
                b8c b8cVar2 = new b8c(2);
                b8cVar2.m = M04;
                b8cVar2.p = M05;
                b8cVar2.k = R.raw.biz_map;
                arrayList22.add(b8cVar2);
                arrayList22.add(b8c.k(tc6Var.d));
                arrayList22.add(b8c.C(null));
                b8c i26 = b8c.i(1, ob6.M0(2131752672, null));
                i26.L(tc6Var.x != null);
                arrayList22.add(i26);
                if (tc6Var.x != null) {
                    arrayList22.add(b8c.k(tc6Var.f));
                }
                arrayList22.add(b8c.C(null));
                if (tc6Var.w != null && (tc6Var.x != null || !TextUtils.isEmpty(tc6Var.y))) {
                    z2 = true;
                }
                tc6Var.G = z2;
                if (z2) {
                    b8c e2 = b8c.e(2, ob6.M0(2131752677, null));
                    e2.s = true;
                    arrayList22.add(e2);
                    arrayList22.add(b8c.C(null));
                }
                tc6Var.Y(true);
                break;
            case 15:
                cg6 cg6Var = (cg6) obj3;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                qh6 qh6Var = cg6Var.Q;
                cg6Var.J = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    cg6Var.n();
                    qh6Var.K1(false, true);
                    cg6Var.postDelayed(new z56(cg6Var, auth_authorization, (byte) 15), 150L);
                    break;
                } else {
                    qh6Var.y1(false, true);
                    if (tL_error5.text.contains("PHONE_NUMBER_INVALID")) {
                        qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748933, "InvalidPhoneNumber"));
                        break;
                    } else if (!tL_error5.text.contains("PHONE_CODE_EMPTY") && !tL_error5.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            cg6Var.c(true);
                            qh6Var.J1(0, true, null, true);
                            qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, "CodeExpired"));
                            break;
                        } else if (tL_error5.text.contains("FIRSTNAME_INVALID")) {
                            qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748936, "InvalidFirstName"));
                            break;
                        } else if (tL_error5.text.contains("LASTNAME_INVALID")) {
                            qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748934, "InvalidLastName"));
                            break;
                        } else {
                            qh6Var.z1(ob6.M0(2131745798, null), tL_error5.text);
                            break;
                        }
                    } else {
                        qh6Var.z1(ob6.M0(2131745798, null), ob6.M0(2131748937, "InvalidCode"));
                        break;
                    }
                }
            case 16:
                ls6 ls6Var = (ls6) obj3;
                TLRPC.contacts_TopPeers contacts_toppeers = (TLRPC.contacts_TopPeers) obj;
                if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeers) {
                    TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) contacts_toppeers;
                    ls6Var.getMessagesController().j4(tL_contacts_topPeers.users, false);
                    ls6Var.getMessagesController().c4(tL_contacts_topPeers.chats, false);
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    for (int i27 = 0; i27 < tL_contacts_topPeers.categories.size(); i27++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i27);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        boolean z4 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline;
                        ArrayList<TLRPC.TL_topPeer> arrayList23 = tL_topPeerCategoryPeers.peers;
                        if (z4) {
                            ls6Var.k1 = arrayList23;
                            ls6Var.getUserConfig().F = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                            ls6Var.m1 = arrayList23;
                            ls6Var.getUserConfig().H = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                            ls6Var.l1 = arrayList23;
                            ls6Var.getUserConfig().G = currentTimeMillis;
                        } else {
                            ls6Var.j1 = arrayList23;
                            long e3 = ls6Var.getUserConfig().e();
                            int i28 = 0;
                            while (true) {
                                if (i28 < ls6Var.j1.size()) {
                                    if (((TLRPC.TL_topPeer) ls6Var.j1.get(i28)).peer.user_id == e3) {
                                        ls6Var.j1.remove(i28);
                                    } else {
                                        i28++;
                                    }
                                }
                            }
                            ls6Var.getUserConfig().E = (int) (System.currentTimeMillis() / 1000);
                        }
                    }
                    ls6Var.getUserConfig().u(false);
                    ls6Var.o();
                    ls6Var.getNotificationCenter().k(82, new Object[0]);
                    ls6Var.getNotificationCenter().k(83, new Object[0]);
                    ls6Var.getNotificationCenter().k(84, new Object[0]);
                    ls6Var.getNotificationCenter().k(85, new Object[0]);
                    ls6Var.getMessagesStorage().a.c(new mn6(ls6Var, tL_contacts_topPeers, b3));
                    break;
                } else if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeersDisabled) {
                    ls6Var.getUserConfig().W = false;
                    ls6Var.getUserConfig().s = (int) (System.currentTimeMillis() / 1000);
                    ls6Var.getUserConfig().u(false);
                    ls6Var.H();
                    break;
                }
                break;
            case 17:
                vw7 vw7Var = (vw7) obj3;
                vw7Var.A0 = ((Integer) obj).intValue();
                vw7Var.B0 = ((Integer) obj2).intValue();
                hl.d3(new z96(vw7Var, (byte) 24), 60L);
                break;
            case 18:
                pt2 pt2Var = (pt2) obj3;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (((TLRPC.TL_error) obj2) == null && messages_messages != null && (arrayList5 = messages_messages.messages) != null && !arrayList5.isEmpty()) {
                    i5 = messages_messages.messages.get(0).id;
                }
                hl.c3(new ja7(pt2Var, i5, (byte) 1));
                break;
            case 19:
                mn2 mn2Var = (mn2) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (tL_error6 != null) {
                    mn2Var.a(null, tL_error6);
                    break;
                } else {
                    mn2Var.a(new TLRPC.TL_boolTrue(), null);
                    break;
                }
            case 20:
                a71 a71Var = (a71) obj3;
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                    a71Var.a(Boolean.FALSE, tL_webBrowserSettings, Long.valueOf(tL_webBrowserSettings.hash), Boolean.TRUE);
                    break;
                } else if (webBrowserSettings instanceof TL_account.TL_webBrowserSettingsNotModified) {
                    Object obj8 = Boolean.TRUE;
                    a71Var.a(obj8, null, 0L, obj8);
                    break;
                } else {
                    cc4.d("getting web settings error ".concat(tL_error7 != null ? tL_error7.code + " " + tL_error7.text : ""));
                    Object obj9 = Boolean.FALSE;
                    if (tL_error7 != null && ((i3 = tL_error7.code) == -2000 || i3 == -2001)) {
                        z = false;
                    }
                    a71Var.a(obj9, null, 0L, Boolean.valueOf(z));
                    break;
                }
            case 21:
                ((ArrayList) obj).add(b8c.k(((jl7) obj3).T1));
                break;
            case 22:
                ms7 ms7Var = (ms7) obj3;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                TextView textView = ms7Var.a2;
                ms7Var.e2 = null;
                if (wallettransaction2 != null) {
                    long j3 = wallettransaction2.fee;
                    if (j3 > 0) {
                        ms7Var.f2 = j3;
                        textView.setText(ob6.a0(null, null, 2131749577, it7.l(j3)));
                        if (!ms7Var.k2) {
                            ms7Var.k2 = false;
                            hl.r(ms7Var.l2);
                            ms7Var.c2.setLoading(false);
                            ms7Var.b1();
                            break;
                        }
                    }
                }
                textView.setVisibility(8);
                if (!ms7Var.k2) {
                }
                break;
            case 23:
                ((vt7) obj3).a0((ArrayList) obj);
                break;
            case 24:
                xt7 xt7Var = (xt7) obj3;
                ArrayList arrayList24 = (ArrayList) obj;
                ArrayList arrayList25 = xt7Var.b;
                String M06 = ob6.M0(2131752733, null);
                b8c b8cVar3 = new b8c(9);
                b8cVar3.d = -1;
                b8cVar3.m = M06;
                b8cVar3.L(xt7Var.r);
                arrayList24.add(b8cVar3);
                arrayList24.add(b8c.C(null));
                if (xt7Var.r) {
                    for (int i29 = 0; i29 < arrayList25.size(); i29++) {
                        if (i29 > 0) {
                            arrayList24.add(b8c.C(null));
                        }
                        ut7 ut7Var = (ut7) arrayList25.get(i29);
                        if (!xt7Var.Y()) {
                            int i30 = i29 * 3;
                            arrayList24.add(b8c.f(ob6.M0(2131752732, null), ut7.a(ut7Var.a), i30));
                            arrayList24.add(b8c.f(ob6.M0(2131752738, null), ut7.a(ut7Var.b), i30 + 1));
                            b8c e4 = b8c.e(i30 + 2, ob6.M0(2131746048, null));
                            e4.s = true;
                            arrayList24.add(e4);
                        }
                    }
                    if (xt7Var.Z()) {
                        arrayList24.add(b8c.C(null));
                        b8c c2 = b8c.c(-2, R.drawable.menu_premium_clock_add, ob6.M0(2131752739, null));
                        c2.r = true;
                        arrayList24.add(c2);
                    }
                    arrayList24.add(b8c.C(ob6.M0(2131752734, null)));
                    break;
                }
                break;
            case 25:
                dx7 dx7Var = (dx7) obj3;
                dx7Var.a0(dx7Var.g0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 26:
                ((qbb) obj3).X(((Float) obj2).floatValue(), (Bitmap) obj);
                break;
            case 27:
                ji8 ji8Var = (ji8) obj3;
                nz4 nz4Var2 = ji8Var.G;
                Bitmap bitmap3 = (Bitmap) obj2;
                ji8Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                ji8Var.x = paint;
                Bitmap bitmap4 = ji8Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap4, tileMode, tileMode);
                ji8Var.w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                hl.i(colorMatrix, aob.I.o() ? 0.05f : 0.25f);
                hl.h(colorMatrix, aob.I.o() ? -0.02f : -0.04f);
                ji8Var.x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                ji8Var.y = new Matrix();
                nz4Var2.a(bitmap3);
                uk0.c(nz4Var2, ji8Var.c);
                ji8Var.H.d();
                break;
            case 28:
                ArrayList arrayList26 = (ArrayList) obj;
                i1b i1bVar = ((li8) obj3).T1;
                if (i1bVar != null) {
                    arrayList26.add(b8c.D(hl.L(12.0f)));
                    arrayList26.add(b8c.h(0, 0, i1bVar));
                    break;
                }
                break;
            default:
                ((y0) obj3).a((TL_stats.TL_statsPollStats) obj);
                break;
        }
    }

    public /* synthetic */ yt4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
