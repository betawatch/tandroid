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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ur4 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ur4(c cVar, p pVar) {
        this.a = (byte) 5;
        this.b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c1  */
    @Override // i8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        p8c p8cVar;
        float f;
        float f2;
        int i;
        int i2;
        String str;
        ArrayList arrayList;
        TLRPC.User V1;
        TL_stars.StarsAmount starsAmount;
        t1b t1bVar;
        ArrayList<TLRPC.Message> arrayList2;
        int i3;
        byte b = this.a;
        byte b2 = 8;
        boolean z = true;
        int i4 = 0;
        r13 = 0;
        r13 = 0;
        r13 = 0;
        int i5 = 0;
        r13 = false;
        boolean z2 = false;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                wr4 wr4Var = (wr4) obj3;
                if (obj != null && wr4Var.o1 == null && (obj instanceof jm6) && (p8cVar = wr4Var.p1) != null) {
                    p8cVar.a((jm6) obj);
                    break;
                }
                break;
            case 1:
                kt4 kt4Var = (kt4) obj3;
                TL_payments.StarGiftActiveAuctions starGiftActiveAuctions = (TL_payments.StarGiftActiveAuctions) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (starGiftActiveAuctions != null && tL_error == null && (starGiftActiveAuctions instanceof TL_payments.TL_starGiftActiveAuctions)) {
                    TL_payments.TL_starGiftActiveAuctions tL_starGiftActiveAuctions = (TL_payments.TL_starGiftActiveAuctions) starGiftActiveAuctions;
                    kt4Var.getMessagesController().b4(tL_starGiftActiveAuctions.users, false);
                    kt4Var.getMessagesController().V3(tL_starGiftActiveAuctions.chats, false);
                    ArrayList<TL_stars.TL_StarGiftActiveAuctionState> arrayList3 = tL_starGiftActiveAuctions.auctions;
                    int size = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size) {
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState = arrayList3.get(i6);
                        i6++;
                        TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState2 = tL_StarGiftActiveAuctionState;
                        kt4Var.a(tL_StarGiftActiveAuctionState2.gift, tL_StarGiftActiveAuctionState2.state, tL_StarGiftActiveAuctionState2.user_state);
                    }
                    break;
                }
                break;
            case 2:
                xu4 xu4Var = (xu4) obj3;
                ArrayList arrayList4 = (ArrayList) obj;
                ((l5c) obj2).G = true;
                if (xu4Var.j2) {
                    float f3 = 8.0f;
                    arrayList4.add(c4c.D(gl.L(8.0f) + a.getCurrentActionBarHeight()));
                    if (TextUtils.isEmpty(xu4Var.k2)) {
                        f = 8.0f;
                        TLRPC.UserFull W1 = na7.q1(xu4Var.a).W1(y6c.h(xu4Var.a).e());
                        if (W1 == null) {
                            na7.q1(xu4Var.a).Z2(y6c.h(xu4Var.a).f(), 0, true, null);
                        }
                        if (xu4Var.V1 != null) {
                            int size2 = arrayList4.size();
                            if (xu4Var.V1.b) {
                                fm2 fm2Var = xu4Var.W1;
                                if (fm2Var == null) {
                                    fm2Var = xu4Var.a1(R.drawable.filled_gift_send, bkb.v0(bkb.Ei, xu4Var.J0));
                                    xu4Var.W1 = fm2Var;
                                }
                                String M0 = k96.M0(2131750091, null);
                                int i7 = uu4.b;
                                c4c K = c4c.K(uu4.class);
                                K.d = -97;
                                K.l = fm2Var;
                                K.m = M0;
                                K.n = null;
                                arrayList4.add(K);
                            }
                            vu4 vu4Var = xu4Var.V1;
                            if (vu4Var.c) {
                                int i8 = vu4Var.d;
                                String G = i8 > 0 ? k96.G(i8, "Gift2ExportTONUnlocksIn", new Object[0]) : null;
                                if (na7.q1(xu4Var.a).k4.n0.f) {
                                    if (xu4Var.X1 == null) {
                                        xu4Var.X1 = xu4Var.a1(R.drawable.filled_wallet_move, bkb.v0(bkb.Ei, xu4Var.J0));
                                    }
                                    String x = c.C(xu4Var.a).x();
                                    if (G != null || x == null || x.length() < 20) {
                                        f2 = 12.0f;
                                    } else {
                                        int v0 = bkb.v0(bkb.q5, xu4Var.J0);
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
                                            spannableStringBuilder.setSpan(new qu4(v0, i11 == 2), length2, spannableStringBuilder.length(), 33);
                                            i11++;
                                        }
                                        G = spannableStringBuilder;
                                    }
                                    fm2 fm2Var2 = xu4Var.X1;
                                    String M02 = k96.M0(2131750088, null);
                                    int i12 = uu4.b;
                                    c4c K2 = c4c.K(uu4.class);
                                    K2.d = -98;
                                    K2.l = fm2Var2;
                                    K2.m = M02;
                                    K2.n = G;
                                    arrayList4.add(K2);
                                } else {
                                    f2 = 12.0f;
                                    fm2 fm2Var3 = xu4Var.Y1;
                                    if (fm2Var3 == null) {
                                        fm2Var3 = xu4Var.a1(R.drawable.fragment, -16777216);
                                        xu4Var.Y1 = fm2Var3;
                                    }
                                    String M03 = k96.M0(2131749974, null);
                                    int i13 = uu4.b;
                                    c4c K3 = c4c.K(uu4.class);
                                    K3.d = -99;
                                    K3.l = fm2Var3;
                                    K3.m = M03;
                                    K3.n = G;
                                    arrayList4.add(K3);
                                }
                            } else {
                                f2 = 12.0f;
                            }
                            i = gl.L(56.0f) * (arrayList4.size() - size2);
                        } else {
                            f2 = 12.0f;
                            i = 0;
                        }
                        if (!xu4Var.S1 && xu4Var.U1 == null && xu4Var.V1 == null && W1 != null && W1.birthday == null) {
                            c4c c = c4c.c(1, R.drawable.menu_birthday, k96.M0(2131749401, null));
                            c.r = true;
                            arrayList4.add(c);
                            i += gl.L(50.0f);
                        }
                        if (xu4Var.T1 != null) {
                            i = i + xu4Var.Z0(arrayList4, 2, k96.M0(2131753708, null), xu4Var.T1.c, null) + xu4Var.Z0(arrayList4, 3, k96.M0(2131753701, null), xu4Var.T1.b, null) + xu4Var.Z0(arrayList4, 4, k96.M0(2131753702, null), xu4Var.T1.d, null);
                        }
                        TLRPC.User f4 = y6c.h(xu4Var.a).f();
                        if (!xu4Var.S1 && xu4Var.U1 == null && xu4Var.V1 == null && f4 != null) {
                            ArrayList arrayList5 = new ArrayList(1);
                            arrayList5.add(f4);
                            i += xu4Var.Z0(arrayList4, 5, k96.M0(2131750083, null), arrayList5, k96.M0(2131750084, null));
                        }
                        na7 q1 = na7.q1(xu4Var.a);
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = xu4Var.e2;
                        int size3 = arrayList7.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj4 = arrayList7.get(i14);
                            i14++;
                            TLRPC.User V12 = q1.V1(Long.valueOf(((TLRPC.TL_topPeer) obj4).peer.user_id));
                            if (V12 != null && !V12.self && !l7c.z(V12)) {
                                long j = V12.id;
                                mj0 mj0Var = xu4Var.T1;
                                if (mj0Var == null || !mj0Var.a(j)) {
                                    arrayList6.add(V12);
                                }
                            }
                        }
                        if (!xu4Var.Z1.isEmpty()) {
                            HashSet hashSet = new HashSet();
                            int size4 = arrayList6.size();
                            int i15 = 0;
                            while (i15 < size4) {
                                Object obj5 = arrayList6.get(i15);
                                i15++;
                                hashSet.add(Long.valueOf(((TLRPC.User) obj5).id));
                            }
                            ArrayList arrayList8 = xu4Var.b2;
                            int size5 = arrayList8.size();
                            int i16 = 0;
                            while (i16 < size5) {
                                Object obj6 = arrayList8.get(i16);
                                i16++;
                                hashSet.add(Long.valueOf(((TLRPC.TL_contact) obj6).user_id));
                            }
                            ArrayList arrayList9 = new ArrayList();
                            for (TLRPC.User user : xu4Var.Z1.values()) {
                                if (!hashSet.contains(Long.valueOf(user.id))) {
                                    arrayList9.add(user);
                                }
                            }
                            i += xu4Var.Z0(arrayList4, 7, null, arrayList9, null);
                        }
                        ArrayList arrayList10 = arrayList6;
                        int Z0 = i + xu4Var.Z0(arrayList4, 6, k96.M0(2131749500, null), arrayList6, null);
                        long e = y6c.h(xu4Var.a).e();
                        i2 = Z0;
                        int i17 = 0;
                        while (i17 < xu4Var.d2.size()) {
                            String str2 = (String) xu4Var.d2.get(i17);
                            ArrayList arrayList11 = (ArrayList) xu4Var.c2.get(str2);
                            if (arrayList11 == null) {
                                arrayList = arrayList10;
                                str = r11;
                            } else {
                                arrayList10.clear();
                                int size6 = arrayList11.size();
                                int i18 = 0;
                                while (i18 < size6) {
                                    Object obj7 = arrayList11.get(i18);
                                    i18++;
                                    TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) obj7;
                                    long j2 = tL_contact.user_id;
                                    if (j2 != e) {
                                        String str3 = r11;
                                        mj0 mj0Var2 = xu4Var.T1;
                                        if ((mj0Var2 == null || !mj0Var2.a(j2)) && (V1 = q1.V1(Long.valueOf(tL_contact.user_id))) != null) {
                                            arrayList10.add(V1);
                                        }
                                        r11 = str3;
                                    }
                                }
                                str = r11;
                                arrayList = arrayList10;
                                i2 += xu4Var.Z0(arrayList4, i17 + 8, str2.toUpperCase(), arrayList, null);
                            }
                            i17++;
                            arrayList10 = arrayList;
                            r11 = str;
                        }
                    } else {
                        if (xu4Var.f2.isEmpty() && xu4Var.g2.isEmpty()) {
                            if (xu4Var.l2 >= 0) {
                                int i1 = xu4.i1(null, arrayList4);
                                for (int i19 = 0; i19 < 3; i19++) {
                                    arrayList4.add(c4c.q(i19, 6));
                                }
                                i2 = gl.L(168.0f) + i1;
                            } else {
                                arrayList4.add(f12.i(k96.M0(2131745615, null), k96.M0(2131747975, null)));
                                i2 = gl.L(200.0f);
                            }
                            f = 8.0f;
                        } else {
                            int Z02 = xu4Var.Z0(arrayList4, 1, null, xu4Var.f2, null);
                            boolean isEmpty = xu4Var.f2.isEmpty();
                            ArrayList arrayList12 = xu4Var.g2;
                            int i20 = 0;
                            int i21 = 0;
                            while (i20 < arrayList12.size()) {
                                if (i20 == 0 && isEmpty) {
                                    i21 += xu4.i1(null, arrayList4);
                                }
                                TLRPC.Chat chat = (TLRPC.Chat) arrayList12.get(i20);
                                int i22 = ru4.b;
                                c4c K4 = c4c.K(ru4.class);
                                K4.d = 1;
                                K4.y = -chat.id;
                                K4.H = chat;
                                arrayList4.add(K4);
                                i21 += gl.L(56.0f);
                                i20++;
                                f3 = f3;
                            }
                            f = f3;
                            i2 = Z02 + i21;
                        }
                        f2 = 12.0f;
                    }
                    arrayList4.add(c4c.C(r11));
                    int L = gl.L(f2) + i2;
                    int measuredHeight = xu4Var.n1.getMeasuredHeight();
                    if (measuredHeight <= 0) {
                        measuredHeight = gl.q.y;
                    }
                    arrayList4.add(c4c.D(Math.max(0, gl.L(2.0f) + (((measuredHeight - gl.m) - (gl.L(f) + a.getCurrentActionBarHeight())) - L))));
                    break;
                }
                break;
            case 3:
                ((tv4) obj3).Y0((ArrayList) obj, (l5c) obj2);
                break;
            case 4:
                TLRPC.TL_starsRevenueStatus tL_starsRevenueStatus = (TLRPC.TL_starsRevenueStatus) obj;
                ((aq7) obj3).a(Long.valueOf(Math.max(0L, (tL_starsRevenueStatus == null || (starsAmount = tL_starsRevenueStatus.available_balance) == null || !tL_starsRevenueStatus.withdrawal_enabled) ? 0L : starsAmount.amount)), (TLRPC.TL_error) obj2);
                break;
            case 5:
                p pVar = (p) obj3;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str4 = (String) obj2;
                if (wallettransaction == null) {
                    c.m("emulate disable backup, no transaction: ".concat(str4 != null ? str4 : "NULL_ERROR"));
                    if (str4 == null) {
                        str4 = "NULL_ERROR";
                    }
                    pVar.a(null, str4);
                    break;
                } else {
                    pVar.a(Long.valueOf(wallettransaction.fee), null);
                    break;
                }
            case 6:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ((x15) obj3).a((tL_error2 == null && (((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) ? null : w25.z(tL_error2, "closeSession"));
                break;
            case 7:
                w25 w25Var = (w25) obj3;
                TL_wallet.tonConnectSessions tonconnectsessions = (TL_wallet.tonConnectSessions) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                c cVar = w25Var.b;
                ArrayList arrayList13 = w25Var.d;
                w25Var.e = -1;
                if (tL_error3 != null || tonconnectsessions == null) {
                    w25.z(tL_error3, "getSessions");
                    cVar.S();
                    break;
                } else {
                    arrayList13.clear();
                    ArrayList<TL_wallet.tonConnectSession> arrayList14 = tonconnectsessions.sessions;
                    if (arrayList14 != null) {
                        arrayList13.addAll(arrayList14);
                    }
                    cVar.S();
                    break;
                }
            case 8:
                ((o35) obj3).Z((ArrayList) obj, (l5c) obj2);
                break;
            case 9:
                ((ArrayList) obj).add(c4c.j(-1, ((wb5) obj3).T1));
                break;
            case 10:
                vc5 vc5Var = (vc5) obj3;
                ArrayList arrayList15 = (ArrayList) obj;
                ArrayList arrayList16 = new ArrayList(0);
                vc5Var.c = arrayList16;
                arrayList16.addAll(cd5.a(vc5Var.a).f);
                if (!vc5Var.c.isEmpty()) {
                    for (int i23 = 0; i23 < vc5Var.c.size(); i23++) {
                        String str5 = (String) vc5Var.c.get(i23);
                        if (str5.startsWith("#") || str5.startsWith("$")) {
                            arrayList15.add(c4c.c(i23 + 1, str5.startsWith("$") ? R.drawable.menu_cashtag : R.drawable.menu_hashtag, str5.substring(1)));
                        }
                    }
                    arrayList15.add(c4c.c(0, R.drawable.msg_clear_recent, k96.M0(2131752077, null)));
                    break;
                }
                break;
            case 11:
                dd5 dd5Var = (dd5) obj3;
                ArrayList arrayList17 = (ArrayList) obj;
                ArrayList arrayList18 = dd5Var.R;
                boolean z3 = dd5Var.S && (t1bVar = dd5Var.T) != null && t1bVar.i.size() > 0;
                if (z3) {
                    t1b t1bVar2 = dd5Var.T;
                    int i24 = pa7.b;
                    c4c K5 = c4c.K(pa7.class);
                    K5.H = t1bVar2;
                    arrayList17.add(K5);
                }
                dd5Var.U = z3;
                while (i4 < arrayList18.size()) {
                    int i25 = i4 + 1;
                    k27 k27Var = (k27) arrayList18.get(i4);
                    c4c c4cVar = new c4c(33);
                    c4cVar.d = i25;
                    c4cVar.H = k27Var;
                    arrayList17.add(c4cVar);
                    i4 = i25;
                }
                if (dd5Var.V || !dd5Var.Y) {
                    arrayList17.add(c4c.q(-2, 1));
                    arrayList17.add(c4c.q(-3, 1));
                    arrayList17.add(c4c.q(-4, 1));
                }
                if (!dd5Var.U && z3) {
                    gl.c3(new iu4(dd5Var, (byte) 21));
                    break;
                }
                break;
            case 12:
                zr5 zr5Var = (zr5) obj3;
                Bitmap bitmap = (Bitmap) obj;
                Bitmap bitmap2 = (Bitmap) obj2;
                cs5 cs5Var = zr5Var.G;
                cs5Var.f.setAlpha(1.0f);
                if (cs5Var.u) {
                    zr5Var.c = bitmap;
                }
                hx4 hx4Var = cs5Var.n;
                if (hx4Var != null) {
                    hx4Var.a(bitmap2);
                    tk0.c(cs5Var.n, zr5Var);
                    ViewGroup viewGroup = cs5Var.A;
                    if (viewGroup != null) {
                        viewGroup.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                a46 a46Var = (a46) obj3;
                TL_aicompose.Tones tones = (TL_aicompose.Tones) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                a46Var.c();
                if (tones instanceof TL_aicompose.TL_tones) {
                    TL_aicompose.TL_tones tL_tones = (TL_aicompose.TL_tones) tones;
                    na7.q1(a46Var.b).b4(tL_tones.users, false);
                    d S = LaunchActivity.S();
                    if (S != null && !tL_tones.tones.isEmpty()) {
                        new e0(S.getContext(), tL_tones.tones.get(0), S.getResourceProvider()).show();
                        break;
                    }
                } else if (tL_error4 != null) {
                    if ("AICOMPOSE_TONE_SLUG_INVALID".equalsIgnoreCase(tL_error4.text)) {
                        ir2.v(null, 2131754974, a46.d(), R.raw.error, 36);
                        break;
                    } else {
                        a46.d().g0(tL_error4, false);
                        break;
                    }
                }
                break;
            case 14:
                pa6 pa6Var = (pa6) obj3;
                ArrayList arrayList19 = (ArrayList) obj;
                String M04 = k96.M0(2131752686, null);
                String M05 = k96.M0(2131752680, null);
                c4c c4cVar2 = new c4c(2);
                c4cVar2.m = M04;
                c4cVar2.p = M05;
                c4cVar2.k = R.raw.biz_map;
                arrayList19.add(c4cVar2);
                arrayList19.add(c4c.k(pa6Var.d));
                arrayList19.add(c4c.C(null));
                c4c i26 = c4c.i(1, k96.M0(2131752679, null));
                i26.L(pa6Var.x != null);
                arrayList19.add(i26);
                if (pa6Var.x != null) {
                    arrayList19.add(c4c.k(pa6Var.f));
                }
                arrayList19.add(c4c.C(null));
                if (pa6Var.w != null && (pa6Var.x != null || !TextUtils.isEmpty(pa6Var.y))) {
                    z2 = true;
                }
                pa6Var.G = z2;
                if (z2) {
                    c4c e2 = c4c.e(2, k96.M0(2131752684, null));
                    e2.s = true;
                    arrayList19.add(e2);
                    arrayList19.add(c4c.C(null));
                }
                pa6Var.Y(true);
                break;
            case 15:
                ae6 ae6Var = (ae6) obj3;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                mf6 mf6Var = ae6Var.Q;
                ae6Var.J = false;
                if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                    ae6Var.n();
                    mf6Var.J1(false, true);
                    ae6Var.postDelayed(new kz5(ae6Var, auth_authorization, (byte) 18), 150L);
                    break;
                } else {
                    mf6Var.x1(false, true);
                    if (tL_error5.text.contains("PHONE_NUMBER_INVALID")) {
                        mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131748987, "InvalidPhoneNumber"));
                        break;
                    } else if (!tL_error5.text.contains("PHONE_CODE_EMPTY") && !tL_error5.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error5.text.contains("PHONE_CODE_EXPIRED")) {
                            ae6Var.d(true);
                            mf6Var.I1(0, true, null, true);
                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131752009, "CodeExpired"));
                            break;
                        } else if (tL_error5.text.contains("FIRSTNAME_INVALID")) {
                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131748990, "InvalidFirstName"));
                            break;
                        } else if (tL_error5.text.contains("LASTNAME_INVALID")) {
                            mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131748988, "InvalidLastName"));
                            break;
                        } else {
                            mf6Var.y1(k96.M0(2131745878, null), tL_error5.text);
                            break;
                        }
                    } else {
                        mf6Var.y1(k96.M0(2131745878, null), k96.M0(2131748991, "InvalidCode"));
                        break;
                    }
                }
            case 16:
                hq6 hq6Var = (hq6) obj3;
                TLRPC.contacts_TopPeers contacts_toppeers = (TLRPC.contacts_TopPeers) obj;
                if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeers) {
                    TLRPC.TL_contacts_topPeers tL_contacts_topPeers = (TLRPC.TL_contacts_topPeers) contacts_toppeers;
                    hq6Var.getMessagesController().b4(tL_contacts_topPeers.users, false);
                    hq6Var.getMessagesController().V3(tL_contacts_topPeers.chats, false);
                    int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                    for (int i27 = 0; i27 < tL_contacts_topPeers.categories.size(); i27++) {
                        TLRPC.TL_topPeerCategoryPeers tL_topPeerCategoryPeers = tL_contacts_topPeers.categories.get(i27);
                        TLRPC.TopPeerCategory topPeerCategory = tL_topPeerCategoryPeers.category;
                        boolean z4 = topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsInline;
                        ArrayList<TLRPC.TL_topPeer> arrayList20 = tL_topPeerCategoryPeers.peers;
                        if (z4) {
                            hq6Var.k1 = arrayList20;
                            hq6Var.getUserConfig().F = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsApp) {
                            hq6Var.m1 = arrayList20;
                            hq6Var.getUserConfig().H = currentTimeMillis;
                        } else if (topPeerCategory instanceof TLRPC.TL_topPeerCategoryBotsGuestChat) {
                            hq6Var.l1 = arrayList20;
                            hq6Var.getUserConfig().G = currentTimeMillis;
                        } else {
                            hq6Var.j1 = arrayList20;
                            long e3 = hq6Var.getUserConfig().e();
                            int i28 = 0;
                            while (true) {
                                if (i28 < hq6Var.j1.size()) {
                                    if (((TLRPC.TL_topPeer) hq6Var.j1.get(i28)).peer.user_id == e3) {
                                        hq6Var.j1.remove(i28);
                                    } else {
                                        i28++;
                                    }
                                }
                            }
                            hq6Var.getUserConfig().E = (int) (System.currentTimeMillis() / 1000);
                        }
                    }
                    hq6Var.getUserConfig().u(false);
                    hq6Var.o();
                    hq6Var.getNotificationCenter().k(81, new Object[0]);
                    hq6Var.getNotificationCenter().k(82, new Object[0]);
                    hq6Var.getNotificationCenter().k(83, new Object[0]);
                    hq6Var.getNotificationCenter().k(84, new Object[0]);
                    hq6Var.getMessagesStorage().a.c(new oh6(hq6Var, tL_contacts_topPeers, b2));
                    break;
                } else if (contacts_toppeers instanceof TLRPC.TL_contacts_topPeersDisabled) {
                    hq6Var.getUserConfig().W = false;
                    hq6Var.getUserConfig().s = (int) (System.currentTimeMillis() / 1000);
                    hq6Var.getUserConfig().u(false);
                    hq6Var.H();
                    break;
                }
                break;
            case 17:
                ot7 ot7Var = (ot7) obj3;
                ot7Var.A0 = ((Integer) obj).intValue();
                ot7Var.B0 = ((Integer) obj2).intValue();
                gl.d3(new vl6(ot7Var, (byte) 11), 60L);
                break;
            case 18:
                vs2 vs2Var = (vs2) obj3;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                if (((TLRPC.TL_error) obj2) == null && messages_messages != null && (arrayList2 = messages_messages.messages) != null && !arrayList2.isEmpty()) {
                    i5 = messages_messages.messages.get(0).id;
                }
                gl.c3(new f87(vs2Var, i5, (byte) 1));
                break;
            case 19:
                sm2 sm2Var = (sm2) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (tL_error6 != null) {
                    sm2Var.a(null, tL_error6);
                    break;
                } else {
                    sm2Var.a(new TLRPC.TL_boolTrue(), null);
                    break;
                }
            case 20:
                s61 s61Var = (s61) obj3;
                TL_account.WebBrowserSettings webBrowserSettings = (TL_account.WebBrowserSettings) obj;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj2;
                if (webBrowserSettings instanceof TL_account.TL_webBrowserSettings) {
                    TL_account.TL_webBrowserSettings tL_webBrowserSettings = (TL_account.TL_webBrowserSettings) webBrowserSettings;
                    s61Var.a(Boolean.FALSE, tL_webBrowserSettings, Long.valueOf(tL_webBrowserSettings.hash), Boolean.TRUE);
                    break;
                } else if (webBrowserSettings instanceof TL_account.TL_webBrowserSettingsNotModified) {
                    Object obj8 = Boolean.TRUE;
                    s61Var.a(obj8, null, 0L, obj8);
                    break;
                } else {
                    fa4.d("getting web settings error ".concat(tL_error7 != null ? tL_error7.code + " " + tL_error7.text : ""));
                    Object obj9 = Boolean.FALSE;
                    if (tL_error7 != null && ((i3 = tL_error7.code) == -2000 || i3 == -2001)) {
                        z = false;
                    }
                    s61Var.a(obj9, null, 0L, Boolean.valueOf(z));
                    break;
                }
            case 21:
                ((ArrayList) obj).add(c4c.k(((cj7) obj3).T1));
                break;
            case 22:
                mp7 mp7Var = (mp7) obj3;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                TextView textView = mp7Var.a2;
                mp7Var.e2 = null;
                if (wallettransaction2 != null) {
                    long j3 = wallettransaction2.fee;
                    if (j3 > 0) {
                        mp7Var.f2 = j3;
                        textView.setText(k96.a0(null, null, 2131749616, cq7.k(j3)));
                        if (!mp7Var.k2) {
                            mp7Var.k2 = false;
                            gl.r(mp7Var.l2);
                            mp7Var.c2.setLoading(false);
                            mp7Var.a1();
                            break;
                        }
                    }
                }
                textView.setVisibility(8);
                if (!mp7Var.k2) {
                }
                break;
            case 23:
                ((qq7) obj3).a0((ArrayList) obj);
                break;
            case 24:
                sq7 sq7Var = (sq7) obj3;
                ArrayList arrayList21 = (ArrayList) obj;
                ArrayList arrayList22 = sq7Var.b;
                String M06 = k96.M0(2131752740, null);
                c4c c4cVar3 = new c4c(9);
                c4cVar3.d = -1;
                c4cVar3.m = M06;
                c4cVar3.L(sq7Var.r);
                arrayList21.add(c4cVar3);
                arrayList21.add(c4c.C(null));
                if (sq7Var.r) {
                    for (int i29 = 0; i29 < arrayList22.size(); i29++) {
                        if (i29 > 0) {
                            arrayList21.add(c4c.C(null));
                        }
                        pq7 pq7Var = (pq7) arrayList22.get(i29);
                        if (!sq7Var.Y()) {
                            int i30 = i29 * 3;
                            arrayList21.add(c4c.f(k96.M0(2131752739, null), pq7.a(pq7Var.a), i30));
                            arrayList21.add(c4c.f(k96.M0(2131752745, null), pq7.a(pq7Var.b), i30 + 1));
                            c4c e4 = c4c.e(i30 + 2, k96.M0(2131746128, null));
                            e4.s = true;
                            arrayList21.add(e4);
                        }
                    }
                    if (sq7Var.Z()) {
                        arrayList21.add(c4c.C(null));
                        c4c c2 = c4c.c(-2, R.drawable.menu_premium_clock_add, k96.M0(2131752746, null));
                        c2.r = true;
                        arrayList21.add(c2);
                    }
                    arrayList21.add(c4c.C(k96.M0(2131752741, null)));
                    break;
                }
                break;
            case 25:
                wt7 wt7Var = (wt7) obj3;
                wt7Var.a0(wt7Var.g0((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2));
                break;
            case 26:
                ((s7b) obj3).X(((Float) obj2).floatValue(), (Bitmap) obj);
                break;
            case 27:
                ve8 ve8Var = (ve8) obj3;
                hx4 hx4Var2 = ve8Var.G;
                Bitmap bitmap3 = (Bitmap) obj2;
                ve8Var.s = (Bitmap) obj;
                Paint paint = new Paint(1);
                ve8Var.x = paint;
                Bitmap bitmap4 = ve8Var.s;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap4, tileMode, tileMode);
                ve8Var.w = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                gl.i(colorMatrix, bkb.I.o() ? 0.05f : 0.25f);
                gl.h(colorMatrix, bkb.I.o() ? -0.02f : -0.04f);
                ve8Var.x.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                ve8Var.y = new Matrix();
                hx4Var2.a(bitmap3);
                tk0.c(hx4Var2, ve8Var.c);
                ve8Var.H.d();
                break;
            case 28:
                ArrayList arrayList23 = (ArrayList) obj;
                gxa gxaVar = ((xe8) obj3).T1;
                if (gxaVar != null) {
                    arrayList23.add(c4c.D(gl.L(12.0f)));
                    arrayList23.add(c4c.h(0, 0, gxaVar));
                    break;
                }
                break;
            default:
                ((x0) obj3).a((TL_stats.TL_statsPollStats) obj);
                break;
        }
    }

    public /* synthetic */ ur4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
