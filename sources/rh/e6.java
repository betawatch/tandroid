package rh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Comparator$-CC;
import j$.util.Comparator$-EL;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b30;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.dq;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.ic;
import org.telegram.messenger.im;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.messenger.sq;
import org.telegram.messenger.vp;
import org.telegram.messenger.x00;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.tb;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ix0;
import org.telegram.ui.mb;
import org.telegram.ui.nc;
import org.telegram.ui.qz0;
import org.telegram.ui.ul0;
import org.telegram.ui.un;
import org.telegram.ui.w90;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e6 {
    public static volatile e6[][] S = (e6[][]) Array.newInstance((Class<?>) e6.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean A;
    public c6 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public z5 N;
    public final int a;
    public final boolean b;
    public long c;
    public boolean d;
    public boolean e;
    public long g;
    public boolean h;
    public boolean i;
    public ArrayList j;
    public boolean k;
    public boolean l;
    public ArrayList m;
    public boolean n;
    public boolean o;
    public ArrayList p;
    public String w;
    public boolean x;
    public boolean y;
    public TL_stars.StarsAmount f = TL_stars.StarsAmount.ofStars(0);
    public final ArrayList[] q = {new ArrayList(), new ArrayList(), new ArrayList()};
    public final boolean[] r = new boolean[3];
    public final String[] s = new String[3];
    public final boolean[] t = new boolean[3];
    public final boolean[] u = new boolean[3];
    public final ArrayList v = new ArrayList();
    public final ArrayList z = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public final ArrayList J = new ArrayList();
    public final LongSparseArray K = new LongSparseArray();
    public final LongSparseArray L = new LongSparseArray();
    public final ConcurrentHashMap M = new ConcurrentHashMap();
    public final ConcurrentHashMap O = new ConcurrentHashMap();
    public final ConcurrentHashMap P = new ConcurrentHashMap();
    public final Set Q = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ConcurrentHashMap R = new ConcurrentHashMap();

    static {
        for (int i10 = 0; i10 < 2; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                T[i10][i11] = new Object();
            }
        }
    }

    public e6(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    public static org.telegram.ui.ActionBar.p6 I() {
        org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
        if (T2 != null) {
            return T2.getResourceProvider();
        }
        return null;
    }

    public static e6 L(int i10) {
        return y(i10, true);
    }

    public static boolean T(int i10, sf.a aVar) {
        return aVar == null || x(i10, aVar.a).s().b >= aVar.b;
    }

    public static void a(e6 e6Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = e6Var.I;
        ArrayList arrayList2 = e6Var.J;
        int i10 = e6Var.a;
        ArrayList arrayList3 = e6Var.H;
        e6Var.C = false;
        e6Var.D = true;
        if (!(starGifts instanceof TL_stars.TL_starGifts)) {
            if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
                int i11 = e6Var.F;
                long currentTimeMillis = System.currentTimeMillis();
                e6Var.G = currentTimeMillis;
                hs a02 = hs.a0(i10);
                a02.a.c(new org.telegram.ui.z(i11, 6, currentTimeMillis, a02, arrayList3));
                return;
            }
            return;
        }
        TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
        vp.r1(i10).V3(tL_starGifts.users, false);
        vp.r1(i10).P3(tL_starGifts.chats, false);
        hs.a0(i10).m1(tL_starGifts.users, tL_starGifts.chats, true, true);
        arrayList3.clear();
        arrayList3.addAll(tL_starGifts.gifts);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        Collections.sort(arrayList2, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new bi.t6(17)), new bi.t6(18)));
        arrayList.clear();
        arrayList.addAll(arrayList3);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new bi.t6(19)));
        e6Var.F = tL_starGifts.hash;
        e6Var.G = System.currentTimeMillis();
        zs.f(i10).k(zs.F3, new Object[0]);
        ArrayList<TL_stars.StarGift> arrayList4 = tL_starGifts.gifts;
        int i12 = e6Var.F;
        long j10 = e6Var.G;
        hs a03 = hs.a0(i10);
        a03.a.c(new org.telegram.ui.z(i12, 6, j10, a03, arrayList4));
    }

    public static /* synthetic */ void b(e6 e6Var, ArrayList arrayList, Integer num, Long l4, ArrayList arrayList2, ArrayList arrayList3) {
        int i10 = e6Var.a;
        vp.r1(i10).V3(arrayList2, true);
        vp.r1(i10).P3(arrayList3, true);
        e6Var.E = true;
        ArrayList arrayList4 = e6Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = e6Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new bi.t6(14)), new bi.t6(15)));
        ArrayList arrayList6 = e6Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$-CC.comparingInt(new bi.t6(16)));
        e6Var.F = num.intValue();
        e6Var.G = l4.longValue();
        e6Var.C = false;
        zs.f(i10).k(zs.F3, new Object[0]);
        e6Var.U();
    }

    public static void c0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String L0 = cd.L0(2131745078, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = L0;
        x1Var.T = cd.L0(2131745079, null);
        i0.a.w(null, 2131747847, alertDialog$Builder, null);
    }

    public static void e(String str) {
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        ((Q == null || Q.visibleDialog != null) ? cc.X() : cc.a0(Q)).Q(R.raw.error, 36, cd.a0(null, null, 2131743903, str)).j();
    }

    public static boolean k(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        int i10 = savedStarGift.flags;
        if ((i10 & 2048) == 0 || (savedStarGift2.flags & 2048) == 0 || savedStarGift.saved_id != savedStarGift2.saved_id) {
            return ((i10 & 8) == 0 || (savedStarGift2.flags & 8) == 0 || savedStarGift.msg_id != savedStarGift2.msg_id) ? false : true;
        }
        return true;
    }

    public static TL_stars.StarGiftAttribute l(ArrayList arrayList, Class cls) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
            if (cls.isInstance(starGiftAttribute)) {
                return (TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute);
            }
        }
        return null;
    }

    public static ArrayList m(ArrayList arrayList, Class cls) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.StarGiftAttribute starGiftAttribute = (TL_stars.StarGiftAttribute) obj;
            if (cls.isInstance(starGiftAttribute)) {
                arrayList2.add((TL_stars.StarGiftAttribute) cls.cast(starGiftAttribute));
            }
        }
        return arrayList2;
    }

    public static long o(TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_messages_sendMessage) {
            return ((TLRPC.TL_messages_sendMessage) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            return ((TLRPC.TL_messages_sendMultiMedia) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            return ((TLRPC.TL_messages_sendInlineBotResult) tLObject).allow_paid_stars;
        }
        if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            return ((TLRPC.TL_messages_forwardMessages) tLObject).allow_paid_stars / r4.id.size();
        }
        if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            return ((TLRPC.TL_messages_sendMedia) tLObject).allow_paid_stars;
        }
        return 0L;
    }

    public static Context t(org.telegram.ui.ActionBar.k2 k2Var) {
        if (k2Var != null && k2Var.getContext() != null) {
            return k2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.I1;
        }
        if (org.telegram.messenger.w0.b != null) {
            return org.telegram.messenger.w0.b;
        }
        return null;
    }

    public static e6 w(int i10) {
        return y(i10, false);
    }

    public static e6 x(int i10, sf.b bVar) {
        return y(i10, bVar == sf.b.b);
    }

    public static e6 y(int i10, boolean z10) {
        e6 e6Var;
        e6 e6Var2 = S[z10 ? 1 : 0][i10];
        if (e6Var2 != null) {
            return e6Var2;
        }
        synchronized (T[z10 ? 1 : 0][i10]) {
            try {
                e6Var = S[z10 ? 1 : 0][i10];
                if (e6Var == null) {
                    e6[] e6VarArr = S[z10 ? 1 : 0];
                    e6 e6Var3 = new e6(i10, z10);
                    e6VarArr[i10] = e6Var3;
                    e6Var = e6Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e6Var;
    }

    public final long A(jj jjVar) {
        Long l4;
        c6 c6Var = this.B;
        if (c6Var != null && c6Var.a.equals(x5.b(jjVar)) && (l4 = this.B.n) != null) {
            return l4.longValue();
        }
        Long A1 = jjVar == null ? null : jjVar.A1();
        if (A1 != null) {
            return A1.longValue();
        }
        Long x12 = vp.r1(this.a).x1();
        if (x12 != null) {
            return x12.longValue();
        }
        return 0L;
    }

    public final long B(x5 x5Var, TLRPC.TL_messageReactions tL_messageReactions) {
        ArrayList<TLRPC.MessageReactor> arrayList;
        Long l4;
        c6 c6Var = this.B;
        if (c6Var != null && c6Var.a.equals(x5Var) && (l4 = this.B.n) != null) {
            return l4.longValue();
        }
        Long l10 = null;
        if (tL_messageReactions != null && (arrayList = tL_messageReactions.top_reactors) != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                TLRPC.MessageReactor messageReactor = arrayList.get(i10);
                i10++;
                TLRPC.MessageReactor messageReactor2 = messageReactor;
                if (messageReactor2 != null && messageReactor2.my) {
                    if (messageReactor2.anonymous) {
                        l10 = 2666000L;
                        break;
                    }
                    TLRPC.Peer peer = messageReactor2.peer_id;
                    if (peer != null) {
                        l10 = Long.valueOf(org.telegram.messenger.o5.o(peer));
                        break;
                    }
                }
            }
        }
        if (l10 != null) {
            return l10.longValue();
        }
        Long x12 = vp.r1(this.a).x1();
        if (x12 != null) {
            return x12.longValue();
        }
        return 0L;
    }

    public final void C(long j10, long j11, q20 q20Var) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i10 = this.a;
        getpaidmessagesrevenue.user_id = vp.r1(i10).n1(j10);
        if (j11 != 0) {
            getpaidmessagesrevenue.parent_peer = vp.r1(i10).i1(j11);
        }
        ConnectionsManager.getInstance(i10).sendRequest(getpaidmessagesrevenue, new m5(q20Var, 0));
    }

    public final long D(int i10, long j10) {
        c6 c6Var = this.B;
        if (c6Var == null) {
            return 0L;
        }
        x5 x5Var = c6Var.a;
        if (x5Var.a == j10 && x5Var.b == i10 && c6Var.l) {
            return c6Var.h;
        }
        return 0L;
    }

    public final long E(jj jjVar) {
        TLRPC.Message message;
        if (jjVar == null || (message = jjVar.k) == null) {
            return 0L;
        }
        return ((message.isThreadMessage || jjVar.k3()) && jjVar.k.fwd_from != null) ? D(jjVar.k.fwd_from.saved_from_msg_id, jjVar.Z0()) : D(jjVar.f1(), jj.B0(jjVar.k));
    }

    public final u5 F(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        u5 u5Var = (u5) longSparseArray.get(j10);
        if (u5Var != null || !z10) {
            return u5Var;
        }
        u5 u5Var2 = new u5(this.a, j10);
        longSparseArray.put(j10, u5Var2);
        return u5Var2;
    }

    public final v5 G(long j10, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        v5 v5Var = (v5) longSparseArray.get(j10);
        if (v5Var != null || !z10) {
            return v5Var;
        }
        v5 v5Var2 = new v5(this.a, j10, true);
        longSparseArray.put(j10, v5Var2);
        return v5Var2;
    }

    public final void H(TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, q20 q20Var) {
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = org.telegram.messenger.w0.b;
        }
        org.telegram.ui.ActionBar.p6 I = I();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.e) {
            r(new ag.a3(this, q20Var, starGift, j10, 19));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = vp.r1(this.a).i1(j10);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u10 = xh.m2.u(I, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new ul0(29, this, q20Var));
    }

    public final TL_stars.StarGift J(long j10) {
        U();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 >= arrayList.size()) {
                return null;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i10);
            if (starGift.id == j10) {
                return starGift;
            }
            i10++;
        }
    }

    public final void K(long j10, q20 q20Var) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j10));
        if (stargiftupgradepreview != null) {
            q20Var.a(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j10;
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new mg.x(this, j10, q20Var, 5));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, q20 q20Var) {
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, org.telegram.messenger.w0.b, null);
        x1Var.r(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new mb((Object) this, x1Var, (Object) inputSavedStarGift, q20Var, 15));
    }

    public final boolean N(int i10) {
        return this.e && !this.q[i10].isEmpty();
    }

    public final void O() {
        this.e = false;
        p();
        this.e = true;
    }

    public final void P(long j10) {
        v5 G = G(j10, false);
        if (G != null) {
            G.j(false);
        }
        u5 u5Var = (u5) this.K.get(j10);
        if (u5Var != null) {
            u5Var.g();
        }
    }

    public final void Q(TLRPC.UserFull userFull) {
        if (userFull == null) {
            return;
        }
        long j10 = userFull.id;
        v5 G = G(j10, false);
        if (G != null && G.n != userFull.stargifts_count) {
            G.j(false);
        }
        u5 u5Var = (u5) this.K.get(j10);
        if (u5Var != null) {
            u5Var.g();
        }
    }

    public final void R() {
        if (this.x) {
            return;
        }
        this.v.clear();
        this.w = null;
        this.x = false;
        this.y = false;
        V();
    }

    public final void S(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            boolean[] zArr = this.t;
            if (!zArr[i10]) {
                this.q[i10].clear();
                this.s[i10] = null;
                zArr[i10] = false;
                this.u[i10] = false;
                if (z10) {
                    W(i10);
                }
            }
        }
    }

    public final void U() {
        if (this.C) {
            return;
        }
        if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
            this.C = true;
            boolean z10 = this.E;
            int i10 = this.a;
            if (z10) {
                int i11 = this.F;
                ph.h1 h1Var = new ph.h1(this, 11);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i11;
                ConnectionsManager.getInstance(i10).sendRequest(getstargifts, new ag.c(h1Var, 16));
                return;
            }
            d0 d0Var = new d0(this, 4);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            hs a02 = hs.a0(i10);
            a02.a.c(new r4(a02, arrayList3, arrayList2, arrayList, d0Var, 2));
        }
    }

    public final void V() {
        if (this.b || this.x || this.y) {
            return;
        }
        this.x = true;
        TL_stars.TL_getStarsSubscriptions tL_getStarsSubscriptions = new TL_stars.TL_getStarsSubscriptions();
        tL_getStarsSubscriptions.peer = new TLRPC.TL_inputPeerSelf();
        String str = this.w;
        tL_getStarsSubscriptions.offset = str;
        if (str == null) {
            tL_getStarsSubscriptions.offset = "";
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new g5(this, 1));
    }

    public final void W(int i10) {
        boolean[] zArr = this.t;
        if (zArr[i10] || this.u[i10]) {
            return;
        }
        zArr[i10] = true;
        TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
        tL_payments_getStarsTransactions.ton = this.b;
        tL_payments_getStarsTransactions.peer = new TLRPC.TL_inputPeerSelf();
        tL_payments_getStarsTransactions.inbound = i10 == 1;
        tL_payments_getStarsTransactions.outbound = i10 == 2;
        String str = this.s[i10];
        tL_payments_getStarsTransactions.offset = str;
        if (str == null) {
            tL_payments_getStarsTransactions.offset = "";
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new org.telegram.messenger.voip.g0(this, i10, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03c5  */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(jj jjVar, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Runnable runnable, q20 q20Var) {
        long j10;
        String str;
        boolean z10;
        org.telegram.ui.ActionBar.z2 z2Var;
        p5 p5Var;
        qz0 qz0Var;
        ViewGroup viewGroup;
        jj jjVar2;
        int i10;
        float f7;
        ?? r22;
        int i11;
        long j11;
        int i12;
        long j12;
        TLRPC.Message message;
        boolean z11;
        String str2;
        int i13;
        String G;
        String G2;
        String str3;
        char c10;
        String G3;
        boolean z12;
        TLRPC.User Z1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        int[] iArr;
        String L0;
        TLRPC.Message message2;
        int i14;
        int i15;
        p7 p7Var;
        FrameLayout frameLayout;
        ic icVar;
        boolean z13;
        ic icVar2;
        p5 p5Var2;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        vp.r1(this.a).V3(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = org.telegram.messenger.w0.b;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.p6 I = I();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            r(new org.telegram.ui.v8(this, runnable, jjVar, inputInvoice, tL_payments_paymentFormStars, q20Var, 23));
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        int i16 = 0;
        long j13 = 0;
        while (i16 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i16);
            i16++;
            j13 += tL_labeledPrice.amount;
        }
        if (jjVar == null || jjVar.D != 29) {
            j10 = tL_payments_paymentFormStars.bot_id;
        } else {
            TLRPC.Message message3 = jjVar.k;
            TLRPC.MessageFwdHeader messageFwdHeader2 = message3.fwd_from;
            j10 = (messageFwdHeader2 == null || (peer2 = messageFwdHeader2.from_id) == null) ? jj.B0(message3) : org.telegram.messenger.o5.o(peer2);
        }
        long j14 = j10;
        if (j14 >= 0) {
            TLRPC.User Z12 = vp.r1(this.a).Z1(Long.valueOf(j14));
            str = h20.p(Z12);
            z10 = !h20.t(Z12);
        } else {
            TLRPC.Chat L02 = vp.r1(this.a).L0(Long.valueOf(-j14));
            str = L02 == null ? "" : L02.title;
            z10 = false;
        }
        String str4 = tL_payments_paymentFormStars.title;
        runnable.run();
        int i17 = tL_payments_paymentFormStars.invoice.subscription_period;
        long j15 = j13;
        boolean[] zArr = {false};
        int i18 = this.a;
        TLRPC.WebDocument webDocument = tL_payments_paymentFormStars.photo;
        p5 p5Var3 = new p5(this, j15, zArr, q20Var, context2, I, z10, str, jjVar, inputInvoice, tL_payments_paymentFormStars, i17, j14);
        qz0 qz0Var2 = new qz0(this, zArr, q20Var);
        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context2, I, false);
        TLRPC.User Z13 = vp.r1(i18).Z1(Long.valueOf(j14));
        LinearLayout f10 = org.telegram.messenger.m5.f(context2, 1);
        f10.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.addView(new o7(context2, 40, 0, 0), w7.b6.c(-1.0f, -1));
        if (jjVar == null || (message2 = jjVar.k) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
            z2Var = k10;
            p5Var = p5Var3;
            qz0Var = qz0Var2;
            viewGroup = frameLayout2;
            jjVar2 = jjVar;
            i10 = i17;
            f7 = 20.0f;
            if (webDocument != null) {
                FrameLayout frameLayout3 = new FrameLayout(context2);
                g9 g9Var = new g9(context2);
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(18.0f));
                g9Var.p(ic.p(b30.c(webDocument)), "80_80", null, null);
                frameLayout3.addView(g9Var, w7.b6.e(80, 80, 48));
                viewGroup.addView(frameLayout3, w7.b6.e(80, 87, 17));
                TextView textView = new TextView(context2);
                textView.setTypeface(org.telegram.messenger.i0.o1("fonts/num.otf"));
                r22 = 1;
                textView.setTextSize(1, 13.0f);
                i11 = -1;
                textView.setTextColor(-1);
                j11 = j15;
                textView.setText(h8.T0(i0.a.k((int) j15, ',', new StringBuilder("XTR ")), 0.85f, null));
                i12 = 0;
                textView.setPadding(org.telegram.messenger.i0.L(5.33f), 0, org.telegram.messenger.i0.L(5.33f), 0);
                textView.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(16.0f), -1133566));
                FrameLayout frameLayout4 = new FrameLayout(context2);
                int L = org.telegram.messenger.i0.L(20.0f);
                int i19 = org.telegram.ui.ActionBar.t6.h5;
                ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i19, I));
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i19);
                frameLayout4.setBackground(d02);
                org.telegram.ui.ActionBar.a7.k(frameLayout4, d02, N, null, I);
                frameLayout4.setPadding(org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f), org.telegram.messenger.i0.L(1.33f));
                frameLayout4.addView(textView, w7.b6.r(-2, 16, zs.E1));
                frameLayout3.addView(frameLayout4, w7.b6.a(-2.0f, 18.66f, 81));
                w7 w7Var = new w7(i18, context2, I);
                w7.e6.a(w7Var);
                w7Var.setOnClickListener(new d7(w7Var, r22));
                viewGroup.addView(w7Var, w7.b6.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f10.addView(viewGroup, w7.b6.r(i11, zs.C1, 7));
                TextView g10 = org.telegram.messenger.m5.g(context2, r22, f7);
                g10.setTypeface(org.telegram.messenger.i0.o());
                int i20 = org.telegram.ui.ActionBar.t6.j5;
                org.telegram.ui.ActionBar.a7.V(g10, i20, I);
                if (i10 <= 0) {
                    if (webDocument != null) {
                        L0 = str4;
                        iArr = null;
                    } else {
                        iArr = null;
                        L0 = cd.L0(2131745133, null);
                    }
                    g10.setText(org.telegram.messenger.k6.m(L0, g10.getPaint().getFontMetricsInt(), i12, iArr, i12));
                } else {
                    g10.setText(org.telegram.messenger.k6.m(webDocument != null ? str4 : cd.L0(2131745140, null), g10.getPaint().getFontMetricsInt(), i12, null, i12));
                }
                zs.i(g10);
                g10.setGravity(17);
                f10.addView(g10, w7.b6.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
                if (webDocument != null) {
                    LinearLayout f11 = org.telegram.messenger.m5.f(context2, i12);
                    int L2 = org.telegram.messenger.i0.L(28.0f);
                    int i21 = org.telegram.ui.ActionBar.t6.a7;
                    Drawable d03 = org.telegram.ui.ActionBar.t6.d0(L2, org.telegram.ui.ActionBar.t6.w0(i21, I));
                    org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i21);
                    f11.setBackground(d03);
                    org.telegram.ui.ActionBar.a7.k(f11, d03, N2, null, I);
                    g9 g9Var2 = new g9(context2);
                    g9Var2.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
                    org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                    r8Var.r(Z13);
                    g9Var2.e(Z13, r8Var);
                    f11.addView(g9Var2, w7.b6.o(28, 28));
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(r22, 13.0f);
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.G6, I);
                    textView2.setText(h20.p(Z13));
                    f11.addView(textView2, w7.b6.t(-2, -2, 16, 6, 0, 10, 0));
                    f10.addView(f11, w7.b6.t(-2, 28, 1, 0, 8, 0, 2));
                }
                TextView textView3 = new TextView(context2);
                textView3.setTextSize(r22, 14.0f);
                org.telegram.ui.ActionBar.a7.V(textView3, i20, I);
                if (jjVar2 == null && (message = jjVar2.k) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    long B0 = jj.B0(message);
                    TLRPC.Message message4 = jjVar2.k;
                    if (message4 != null && (messageFwdHeader = message4.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                        B0 = org.telegram.messenger.o5.o(peer);
                    }
                    if (B0 < 0 && jjVar2.Z0() > 0 && (Z1 = vp.r1(i18).Z1(Long.valueOf(jjVar2.Z0()))) != null && Z1.bot) {
                        B0 = Z1.id;
                    }
                    if (B0 >= 0) {
                        TLRPC.User Z14 = vp.r1(i18).Z1(Long.valueOf(B0));
                        str2 = h20.p(Z14);
                        z11 = (Z14 == null || !Z14.bot) ? i12 : r22;
                    } else {
                        TLRPC.Chat L03 = vp.r1(i18).L0(Long.valueOf(-B0));
                        String str5 = L03 != null ? L03.title : "";
                        z11 = i12;
                        str2 = str5;
                    }
                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) jjVar2.k.media;
                    int i22 = i12;
                    int i23 = i22;
                    int i24 = i23;
                    while (i22 < tL_messageMediaPaidMedia.extended_media.size()) {
                        TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i22);
                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                            if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
                                z12 = r22;
                            }
                            z12 = i12;
                        } else {
                            if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                z12 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media instanceof TLRPC.TL_messageMediaDocument;
                            }
                            z12 = i12;
                        }
                        if (z12) {
                            i23++;
                        } else {
                            i24++;
                        }
                        i22++;
                    }
                    if (i23 == 0) {
                        str3 = z11 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                        long j16 = j11;
                        int i25 = (int) j16;
                        Object[] objArr = new Object[2];
                        objArr[i12] = i24 == r22 ? cd.L0(2131745149, null) : cd.G(i24, "StarsConfirmPurchaseMedia_Photos", new Object[i12]);
                        objArr[r22] = str2;
                        G2 = cd.G(i25, str3, objArr);
                        j12 = j16;
                    } else {
                        j12 = j11;
                        if (i24 == 0) {
                            str3 = z11 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                            int i26 = (int) j12;
                            if (i23 == r22) {
                                G3 = cd.L0(2131745148, null);
                                c10 = 0;
                            } else {
                                c10 = 0;
                                G3 = cd.G(i23, "StarsConfirmPurchaseMedia_Videos", new Object[0]);
                            }
                            Object[] objArr2 = new Object[2];
                            objArr2[c10] = G3;
                            objArr2[r22] = str2;
                            G2 = cd.G(i26, str3, objArr2);
                        } else {
                            String str6 = z11 ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                            int i27 = (int) j12;
                            if (i24 == r22) {
                                G = cd.L0(2131745149, null);
                                i13 = 0;
                            } else {
                                i13 = 0;
                                G = cd.G(i24, "StarsConfirmPurchaseMedia_Photos", new Object[0]);
                            }
                            String L04 = i23 == r22 ? cd.L0(2131745148, null) : cd.G(i23, "StarsConfirmPurchaseMedia_Videos", new Object[i13]);
                            Object[] objArr3 = new Object[3];
                            objArr3[i13] = G;
                            objArr3[r22] = L04;
                            objArr3[2] = str2;
                            G2 = cd.G(i27, str6, objArr3);
                        }
                    }
                    textView3.setText(org.telegram.messenger.i0.W2(G2));
                } else {
                    j12 = j11;
                    if (i10 <= 0) {
                        String p5 = h20.p(Z13);
                        Object[] objArr4 = new Object[2];
                        objArr4[0] = str4;
                        objArr4[r22] = p5;
                        textView3.setText(org.telegram.messenger.i0.W2(cd.K("StarsConfirmSubscriptionText2", (int) j12, ',', objArr4)));
                    } else {
                        String p9 = h20.p(Z13);
                        Object[] objArr5 = new Object[2];
                        objArr5[0] = str4;
                        objArr5[r22] = p9;
                        textView3.setText(org.telegram.messenger.i0.W2(cd.K("StarsConfirmPurchaseText2", (int) j12, ',', objArr5)));
                    }
                }
                textView3.setMaxWidth(vh.p2.a(textView3.getText(), textView3.getPaint()));
                textView3.setGravity(17);
                f10.addView(textView3, w7.b6.t(-2, -2, 1, 0, 6, 0, 18));
                vh.d dVar = new vh.d(context2, I, r22);
                if (i10 <= 0) {
                    dVar.i(h8.S0(org.telegram.messenger.i0.W2(cd.H(',', "StarsConfirmSubscriptionButton", (int) j12))), false, r22);
                } else {
                    dVar.i(h8.S0(org.telegram.messenger.i0.W2(cd.H(',', "StarsConfirmPurchaseButton", (int) j12))), false, r22);
                }
                f10.addView(dVar, w7.b6.c(48.0f, -1));
                p80 p80Var = new p80(context2, I);
                org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.z6, I);
                org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, I);
                p80Var.setTextSize(r22, 14.0f);
                p80Var.setText(org.telegram.messenger.i0.T2(cd.L0(i10 <= 0 ? 2131745137 : 2131745144, null), new ph.p0(context2, 9)));
                p80Var.setGravity(17);
                f10.addView(p80Var, w7.b6.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
                org.telegram.ui.ActionBar.z2 z2Var2 = z2Var;
                z2Var2.N = f10;
                dVar.setOnClickListener(new e7(p5Var, z2Var2, dVar, r22));
                z2Var2.setOnDismissListener(new ag.x(qz0Var, 13));
                z2Var2.O();
                z2Var2.show();
            }
            g9 g9Var3 = new g9(context2);
            g9Var3.setRoundRadius(org.telegram.messenger.i0.L(80.0f));
            org.telegram.ui.Components.r8 r8Var2 = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
            r8Var2.r(Z13);
            g9Var3.e(Z13, r8Var2);
            viewGroup.addView(g9Var3, w7.b6.e(80, 80, 17));
        } else {
            p7 p7Var2 = new p7(context2);
            p7Var2.H = new Path();
            p7Var2.I = new RectF();
            p7Var2.J = i0.a.f(context2, R.drawable.large_locked_post);
            p7Var2.setRoundRadius(org.telegram.messenger.i0.L(24.0f));
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) jjVar.k.media;
            if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                z2Var = k10;
                qz0Var = qz0Var2;
                viewGroup = frameLayout2;
                p5Var = p5Var3;
                jjVar2 = jjVar;
                i10 = i17;
                i14 = 17;
                i15 = 80;
                f7 = 20.0f;
            } else {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                    icVar2 = ic.f(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, jjVar.k);
                    p7Var = p7Var2;
                    qz0Var = qz0Var2;
                    frameLayout = frameLayout2;
                    p5Var2 = p5Var3;
                    icVar = null;
                    z13 = true;
                } else {
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                            p7Var = p7Var2;
                            qz0Var = qz0Var2;
                            frameLayout = frameLayout2;
                            icVar = null;
                            z13 = true;
                            icVar2 = ic.i(org.telegram.messenger.b8.w(messageMedia.photo.sizes, org.telegram.messenger.i0.L(80.0f), true, null, false), messageMedia.photo);
                        } else {
                            p7Var = p7Var2;
                            qz0Var = qz0Var2;
                            frameLayout = frameLayout2;
                            icVar = null;
                            z13 = true;
                            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                icVar2 = ic.c(org.telegram.messenger.b8.w(messageMedia.document.thumbs, org.telegram.messenger.i0.L(80.0f), true, null, false), messageMedia.document);
                            }
                        }
                        p5Var2 = p5Var3;
                    } else {
                        p7Var = p7Var2;
                        qz0Var = qz0Var2;
                        frameLayout = frameLayout2;
                        icVar = null;
                        z13 = true;
                    }
                    icVar2 = icVar;
                    p5Var2 = p5Var3;
                }
                p5Var = p5Var2;
                viewGroup = frameLayout;
                i14 = 17;
                f7 = 20.0f;
                p7Var2 = p7Var;
                z2Var = k10;
                i10 = i17;
                i15 = 80;
                p7Var2.m(icVar2, "80_80_b2", null, null, null, jjVar);
                jjVar2 = jjVar;
            }
            viewGroup.addView(p7Var2, w7.b6.e(i15, i15, i14));
        }
        j11 = j15;
        r22 = 1;
        i11 = -1;
        i12 = 0;
        w7 w7Var2 = new w7(i18, context2, I);
        w7.e6.a(w7Var2);
        w7Var2.setOnClickListener(new d7(w7Var2, r22));
        viewGroup.addView(w7Var2, w7.b6.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        f10.addView(viewGroup, w7.b6.r(i11, zs.C1, 7));
        TextView g102 = org.telegram.messenger.m5.g(context2, r22, f7);
        g102.setTypeface(org.telegram.messenger.i0.o());
        int i202 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(g102, i202, I);
        if (i10 <= 0) {
        }
        zs.i(g102);
        g102.setGravity(17);
        f10.addView(g102, w7.b6.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
        if (webDocument != null) {
        }
        TextView textView32 = new TextView(context2);
        textView32.setTextSize(r22, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView32, i202, I);
        if (jjVar2 == null) {
        }
        j12 = j11;
        if (i10 <= 0) {
        }
        textView32.setMaxWidth(vh.p2.a(textView32.getText(), textView32.getPaint()));
        textView32.setGravity(17);
        f10.addView(textView32, w7.b6.t(-2, -2, 1, 0, 6, 0, 18));
        vh.d dVar2 = new vh.d(context2, I, r22);
        if (i10 <= 0) {
        }
        f10.addView(dVar2, w7.b6.c(48.0f, -1));
        p80 p80Var2 = new p80(context2, I);
        org.telegram.ui.ActionBar.a7.V(p80Var2, org.telegram.ui.ActionBar.t6.z6, I);
        org.telegram.ui.ActionBar.a7.H(p80Var2, org.telegram.ui.ActionBar.t6.Uc, I);
        p80Var2.setTextSize(r22, 14.0f);
        p80Var2.setText(org.telegram.messenger.i0.T2(cd.L0(i10 <= 0 ? 2131745137 : 2131745144, null), new ph.p0(context2, 9)));
        p80Var2.setGravity(17);
        f10.addView(p80Var2, w7.b6.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
        org.telegram.ui.ActionBar.z2 z2Var22 = z2Var;
        z2Var22.N = f10;
        dVar2.setOnClickListener(new e7(p5Var, z2Var22, dVar2, r22));
        z2Var22.setOnDismissListener(new ag.x(qz0Var, 13));
        z2Var22.O();
        z2Var22.show();
    }

    public final void Y(String str, TLRPC.ChatInvite chatInvite, j20 j20Var) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        Context context = org.telegram.messenger.w0.b;
        org.telegram.ui.ActionBar.p6 I = I();
        if (context == null) {
            return;
        }
        long j10 = chatInvite.subscription_pricing.amount;
        String str2 = chatInvite.title;
        TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
        tL_inputInvoiceChatInviteSubscription.hash = str;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new im(this, j20Var, j10, str2, context, I, chatInvite, str));
    }

    public final void Z(final jj jjVar, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final q20 q20Var) {
        long j10;
        String str;
        TLRPC.User Z1;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars == null) {
            return;
        }
        final Context context = org.telegram.messenger.w0.b;
        final org.telegram.ui.ActionBar.p6 I = I();
        if (context == null) {
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        final long j11 = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j11 += tL_labeledPrice.amount;
        }
        if (jjVar != null) {
            TLRPC.Message message = jjVar.k;
            j10 = (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) ? jj.B0(message) : org.telegram.messenger.o5.o(peer);
            if (j10 < 0 && jjVar.Z0() > 0 && (Z1 = vp.r1(this.a).Z1(Long.valueOf(jjVar.Z0()))) != null && Z1.bot) {
                j10 = Z1.id;
            }
        } else {
            j10 = tL_payments_paymentFormStars.bot_id;
        }
        final long j12 = j10;
        if (j12 >= 0) {
            str = h20.p(vp.r1(this.a).Z1(Long.valueOf(j12)));
        } else {
            TLRPC.Chat L0 = vp.r1(this.a).L0(Long.valueOf(-j12));
            str = L0 == null ? "" : L0.title;
        }
        final String str2 = str;
        final String str3 = tL_payments_paymentFormStars.title;
        final int i11 = tL_payments_paymentFormStars.invoice.subscription_period;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
        tL_payments_sendStarsForm.invoice = inputInvoice;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: rh.t4
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final e6 e6Var = e6.this;
                final q20 q20Var2 = q20Var;
                final jj jjVar2 = jjVar;
                final Context context2 = context;
                final long j13 = j11;
                final String str4 = str2;
                final int i12 = i11;
                final String str5 = str3;
                final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                final long j14 = j12;
                final org.telegram.ui.ActionBar.p6 p6Var = I;
                final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.w4
                    /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
                    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        boolean z10;
                        boolean z11;
                        LaunchActivity launchActivity;
                        w90 w90Var;
                        TLRPC.Message message2;
                        e6 e6Var2 = e6.this;
                        TLObject tLObject2 = tLObject;
                        q20 q20Var3 = q20Var2;
                        jj jjVar3 = jjVar2;
                        Context context3 = context2;
                        long j15 = j13;
                        String str6 = str4;
                        int i13 = i12;
                        String str7 = str5;
                        TLRPC.InputInvoice inputInvoice3 = inputInvoice2;
                        long j16 = j14;
                        TLRPC.TL_error tL_error2 = tL_error;
                        org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars3 = tL_payments_paymentFormStars2;
                        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                        cc X = (Q == null || Q.visibleDialog != null) ? cc.X() : cc.a0(Q);
                        boolean z12 = tLObject2 instanceof TLRPC.TL_payments_paymentResult;
                        int i14 = 0;
                        if (!z12) {
                            if (tL_error2 != null) {
                                z10 = false;
                                if ("BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                    if (vp.r1(e6Var2.a).k7) {
                                        q20Var3.a(Boolean.FALSE);
                                        e6.c0(context3, p6Var2);
                                        return;
                                    } else {
                                        boolean[] zArr = {false};
                                        x7 x7Var = new x7(context3, p6Var2, j15, 0, str6, new org.telegram.ui.v8(e6Var2, zArr, jjVar3, inputInvoice3, tL_payments_paymentFormStars3, q20Var3, 21), j16);
                                        x7Var.setOnDismissListener(new org.telegram.ui.ActionBar.e3(q20Var3, zArr));
                                        x7Var.show();
                                        return;
                                    }
                                }
                            } else {
                                z10 = false;
                            }
                            if (tL_error2 == null || !"FORM_EXPIRED".equals(tL_error2.text)) {
                                cc ccVar = X;
                                q20Var3.a(Boolean.FALSE);
                                ccVar.Q(R.raw.error, 36, cd.a0(null, null, 2131743903, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                                if (jjVar3 != null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia.peer = vp.r1(e6Var2.a).i1(j16);
                                    tL_messages_getExtendedMedia.id.add(Integer.valueOf(jjVar3.f1()));
                                    ConnectionsManager.getInstance(e6Var2.a).sendRequest(tL_messages_getExtendedMedia, null);
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                            JSONObject u10 = xh.m2.u(p6Var2, z10);
                            if (u10 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                tL_dataJSON.data = u10.toString();
                                tL_payments_getPaymentForm.flags |= 1;
                            }
                            tL_payments_getPaymentForm.invoice = inputInvoice3;
                            ConnectionsManager.getInstance(e6Var2.a).sendRequest(tL_payments_getPaymentForm, new mg.z(e6Var2, jjVar3, inputInvoice3, q20Var3, X, 13));
                            return;
                        }
                        q20Var3.a(Boolean.TRUE);
                        Utilities.d.c(new b5(e6Var2, (TLRPC.TL_payments_paymentResult) tLObject2, i14));
                        if (jjVar3 != null && (message2 = jjVar3.k) != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            Drawable f7 = i0.a.f(context3, R.drawable.star_small_inner);
                            String L02 = cd.L0(2131745106, null);
                            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.G((int) j15, "StarsMediaPurchaseCompletedInfo", str6));
                            X.getClass();
                            tb tbVar = new tb(X.W(), X.c);
                            tbVar.a.setImageDrawable(f7);
                            tbVar.b.setText(L02);
                            tbVar.c.setText(W2);
                            X.b(tbVar, 2750).j();
                        } else {
                            if (i13 <= 0) {
                                z11 = true;
                                X.I(R.raw.stars_send, cd.L0(2131745070, null), org.telegram.messenger.i0.W2(cd.G((int) j15, "StarsPurchaseCompletedInfo", str7, str6))).j();
                                launchActivity = LaunchActivity.I1;
                                if (launchActivity != null && (w90Var = launchActivity.x0) != null) {
                                    w90Var.c(z11);
                                }
                                if ((inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                    e6Var2.S(true);
                                }
                                if (jjVar3 == null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia2.peer = vp.r1(e6Var2.a).i1(j16);
                                    tL_messages_getExtendedMedia2.id.add(Integer.valueOf(jjVar3.f1()));
                                    ConnectionsManager.getInstance(e6Var2.a).sendRequest(tL_messages_getExtendedMedia2, null);
                                    return;
                                }
                                return;
                            }
                            X.I(R.raw.stars_send, cd.L0(2131745172, null), org.telegram.messenger.i0.W2(cd.G((int) j15, "StarsBotSubscriptionCompletedInfo", str7, str6))).j();
                        }
                        z11 = true;
                        launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            w90Var.c(z11);
                        }
                        if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                        }
                        e6Var2.S(true);
                        if (jjVar3 == null) {
                        }
                    }
                });
            }
        });
    }

    public final void a0(long j10, long j11, boolean z10) {
        int i10 = this.a;
        x00 x00Var = vp.r1(i10).r7;
        TLRPC.TL_forumTopic f7 = x00Var.f(j10, j11);
        if (f7 != null) {
            f7.nopaid_messages_exception = z10;
            a0.h hVar = x00Var.a;
            if (((ArrayList) hVar.f(j10)) != null) {
                x00Var.getMessagesStorage().C1(x00Var.getConnectionsManager().getCurrentTime(), -j10, (List) hVar.f(j10), true);
            }
            zs.f(i10).k(zs.N3, Long.valueOf(j11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c6 b0(final jj jjVar, final un unVar, final long j10, boolean z10, boolean z11, final Long l4) {
        String str;
        long j11;
        final e6 e6Var;
        jj jjVar2;
        TLRPC.ReactionCount reactionCount;
        boolean z12;
        String str2;
        x5 b10 = x5.b(jjVar);
        int i10 = this.a;
        e6 y3 = y(i10, false);
        Context t10 = t(unVar);
        if (t10 == null) {
            return null;
        }
        str = "";
        if (z11 && y3.e && y3.q(null, false, false).amount <= 0) {
            long a2 = unVar.a();
            if (a2 >= 0) {
                str = h20.k(unVar.getMessagesController().Z1(Long.valueOf(a2)));
            } else {
                TLRPC.Chat L0 = unVar.getMessagesController().L0(Long.valueOf(-a2));
                if (L0 != null) {
                    str = L0.title;
                }
            }
            final int i11 = 0;
            new x7(t10, unVar.getResourceProvider(), j10, 5, str, new Runnable(this) { // from class: rh.i5
                public final /* synthetic */ e6 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.b.b0(jjVar, unVar, j10, true, true, l4);
                            break;
                        default:
                            this.b.b0(jjVar, unVar, j10, true, true, l4);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        c6 c6Var = this.B;
        if (c6Var == null || !c6Var.a.equals(b10)) {
            c6 c6Var2 = this.B;
            if (c6Var2 != null) {
                c6Var2.b();
            }
            ConnectionsManager.getInstance(i10).getCurrentTime();
            j11 = 0;
            e6Var = this;
            c6 c6Var3 = new c6(e6Var, b10, jjVar, unVar, z10);
            e6Var.B = c6Var3;
            c6Var3.n = l4;
        } else {
            j11 = 0;
            e6Var = this;
        }
        if (e6Var.B.h + j10 > vp.r1(i10).a6) {
            e6Var.B.b();
            ConnectionsManager.getInstance(i10).getCurrentTime();
            e6Var.B = new c6(e6Var, b10, jjVar, unVar, z10);
        }
        final long j12 = e6Var.B.h + j10;
        if (z11 && y3.e) {
            if (y3.q(null, false, false).amount < j12) {
                e6Var.B.a();
                long a10 = unVar.a();
                if (a10 >= j11) {
                    str2 = h20.k(unVar.getMessagesController().Z1(Long.valueOf(a10)));
                } else {
                    TLRPC.Chat L02 = unVar.getMessagesController().L0(Long.valueOf(-a10));
                    str2 = L02 != null ? L02.title : "";
                }
                final int i12 = 1;
                new x7(t10, unVar.getResourceProvider(), j12, 5, str2, new Runnable(e6Var) { // from class: rh.i5
                    public final /* synthetic */ e6 b;

                    {
                        this.b = e6Var;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                this.b.b0(jjVar, unVar, j12, true, true, l4);
                                break;
                            default:
                                this.b.b0(jjVar, unVar, j12, true, true, l4);
                                break;
                        }
                    }
                }, 0L).show();
                return null;
            }
            jjVar2 = jjVar;
            reactionCount = null;
        } else {
            jjVar2 = jjVar;
            reactionCount = null;
        }
        c6 c6Var4 = e6Var.B;
        if (jjVar2 != null) {
            TLRPC.Message message = jjVar2.k;
            if (message.reactions == null) {
                message.reactions = new TLRPC.TL_messageReactions();
                TLRPC.Message message2 = jjVar2.k;
                message2.reactions.reactions_as_tags = jj.B0(message2) == d20.i(jjVar2.I1).e();
                jjVar2.k.reactions.can_see_list = jjVar2.o3() || jjVar2.p3();
            }
            for (int i13 = 0; i13 < jjVar2.k.reactions.results.size(); i13++) {
                if (!(jjVar2.k.reactions.results.get(i13).reaction instanceof TLRPC.TL_reactionPaid)) {
                }
            }
            z12 = true;
            a6 a6Var = c6Var4.p;
            e6 e6Var2 = c6Var4.q;
            int i14 = e6Var2.a;
            qb qbVar = c6Var4.e;
            jj jjVar3 = c6Var4.b;
            if (!c6Var4.i || c6Var4.j) {
                boolean z13 = org.telegram.messenger.v2.a;
            } else {
                c6Var4.h += j10;
                System.currentTimeMillis();
                qbVar.c.a();
                qbVar.c.c(org.telegram.messenger.i0.W2(cd.G((int) c6Var4.h, "StarsSentText", new Object[0])), true, true);
                if (c6Var4.m) {
                    c6Var4.f.b = 5000L;
                    org.telegram.messenger.i0.r(a6Var);
                    org.telegram.messenger.i0.h3(a6Var, 5000L);
                }
                int i15 = zs.o1;
                if (z12) {
                    c6Var4.l = true;
                    jjVar3.f((int) j10, c6Var4.c(), true);
                    e6Var2.g += j10;
                    zs.f(i14).k(i15, Long.valueOf(jj.B0(jjVar3.k)), Integer.valueOf(jjVar3.f1()), jjVar3.k.reactions);
                    zs.f(i14).k(zs.y3, new Object[0]);
                } else {
                    c6Var4.l = false;
                    TLRPC.Message message3 = jjVar3.k;
                    if (message3.reactions == null) {
                        message3.reactions = new TLRPC.TL_messageReactions();
                        TLRPC.Message message4 = jjVar3.k;
                        message4.reactions.reactions_as_tags = jj.B0(message4) == d20.i(jjVar3.I1).e();
                        jjVar3.k.reactions.can_see_list = jjVar3.o3() || jjVar3.p3();
                    }
                    for (int i16 = 0; i16 < jjVar3.k.reactions.results.size(); i16++) {
                        if (jjVar3.k.reactions.results.get(i16).reaction instanceof TLRPC.TL_reactionPaid) {
                            reactionCount = jjVar3.k.reactions.results.get(i16);
                        }
                    }
                    if (reactionCount == null) {
                        TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                        tL_reactionCount.reaction = new TLRPC.TL_reactionPaid();
                        tL_reactionCount.count = 1;
                        tL_reactionCount.chosen = true;
                        jjVar3.k.reactions.results.add(0, tL_reactionCount);
                        c6Var4.k--;
                    }
                    zs.f(i14).k(i15, Long.valueOf(jj.B0(jjVar3.k)), Integer.valueOf(jjVar3.f1()), jjVar3.k.reactions);
                    c6Var4.k += j10;
                }
                qbVar.b.setText(c6Var4.d());
            }
            c6 c6Var5 = e6Var.B;
            c6Var5.n = l4;
            return c6Var5;
        }
        if (!z10) {
            z12 = false;
            a6 a6Var2 = c6Var4.p;
            e6 e6Var22 = c6Var4.q;
            int i142 = e6Var22.a;
            qb qbVar2 = c6Var4.e;
            jj jjVar32 = c6Var4.b;
            if (c6Var4.i) {
            }
            boolean z132 = org.telegram.messenger.v2.a;
            c6 c6Var52 = e6Var.B;
            c6Var52.n = l4;
            return c6Var52;
        }
        z12 = true;
        a6 a6Var22 = c6Var4.p;
        e6 e6Var222 = c6Var4.q;
        int i1422 = e6Var222.a;
        qb qbVar22 = c6Var4.e;
        jj jjVar322 = c6Var4.b;
        if (c6Var4.i) {
        }
        boolean z1322 = org.telegram.messenger.v2.a;
        c6 c6Var522 = e6Var.B;
        c6Var522.n = l4;
        return c6Var522;
    }

    public final boolean c(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList == null || arrayList.isEmpty() || o(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int f12 = ((jj) obj).f1();
            hashSet.add(Integer.valueOf(f12));
            if (this.Q.remove(Integer.valueOf(f12))) {
                this.R.put(Integer.valueOf(f12), new l5(this, hashSet, runnable, 1));
                z10 = true;
            }
        }
        return !z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        if (r9.a == r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x007b, code lost:
    
        if (r0.intValue() >= 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0082, code lost:
    
        if (r1 >= 100) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(jj jjVar) {
        boolean z10;
        i2.j0 j0Var;
        org.telegram.ui.ActionBar.k2 T2;
        z5 z5Var;
        TLRPC.Message message = jjVar.k;
        if (message == null) {
            return;
        }
        long j10 = message.paid_message_stars;
        if (j10 <= 0 || jj.c3(message)) {
            return;
        }
        z5 z5Var2 = this.N;
        if (z5Var2 == null || z5Var2.g <= 0 || !z5Var2.m || z5Var2.n || z5Var2.o) {
            if (!org.telegram.ui.Components.s4.c0(this.a, jj.B0(jjVar.k))) {
                Long l4 = (Long) this.O.get(Long.valueOf(jj.B0(jjVar.k)));
                if (l4 == null || System.currentTimeMillis() - l4.longValue() <= 5000) {
                    Integer num = (Integer) this.P.get(Long.valueOf(jj.B0(jjVar.k)));
                    if (num != null) {
                    }
                }
            }
            z10 = false;
            int f12 = jjVar.f1();
            if (z10) {
                this.Q.add(Integer.valueOf(f12));
            }
            long B0 = jj.B0(jjVar.k);
            int i10 = 7;
            nc ncVar = new nc(i10, this, z10);
            j0Var = new i2.j0(this, z10, f12, i10);
            T2 = LaunchActivity.T();
            z5Var = this.N;
            if (z5Var != null && (z5Var.o || z5Var.n)) {
                this.N = null;
            }
            if (this.N != null) {
                if (T2 != null && !T2.isRemovingFromStack()) {
                    z5 z5Var3 = this.N;
                    if (z5Var3.b == B0) {
                    }
                }
                this.N.a();
                this.N = null;
            }
            if (T2 != null || T2.isRemovingFromStack()) {
                j0Var.run();
            }
            if (this.N == null) {
                this.N = new z5(T2, B0);
            }
            z5 z5Var4 = this.N;
            qb qbVar = z5Var4.d;
            ub ubVar = z5Var4.e;
            y5 y5Var = z5Var4.p;
            if (z5Var4.n || z5Var4.o) {
                j0Var.run();
                return;
            }
            z5Var4.g++;
            z5Var4.k.add(jjVar);
            z5Var4.h += j10;
            z5Var4.i = ncVar;
            z5Var4.j.add(j0Var);
            if (z5Var4.m && !z10) {
                z5Var4.m = false;
                org.telegram.messenger.i0.r(y5Var);
                wb wbVar = z5Var4.c;
                wbVar.j = 5000;
                wbVar.i(true);
                if (System.currentTimeMillis() - z5Var4.l > 500) {
                    ubVar.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
                } else {
                    ubVar.setAlpha(0.0f);
                    ubVar.setVisibility(8);
                }
            }
            d6 d6Var = z5Var4.f;
            if (d6Var != null && z5Var4.m) {
                d6Var.b = 3000L;
                org.telegram.messenger.i0.r(y5Var);
                org.telegram.messenger.i0.h3(y5Var, 3000L);
            }
            org.telegram.ui.Components.f6 f6Var = qbVar.b;
            int i11 = z5Var4.g;
            f6Var.setText(i11 == 1 ? cd.L0(2131747719, null) : cd.G(i11, "PaidMessageSentTitle", new Object[0]));
            qbVar.c.setText(org.telegram.messenger.i0.W2(cd.H(',', "PaidMessageSentSubtitle", Math.max(0, (int) z5Var4.h))));
            qbVar.a.d();
            return;
        }
        z10 = true;
        int f122 = jjVar.f1();
        if (z10) {
        }
        long B02 = jj.B0(jjVar.k);
        int i102 = 7;
        nc ncVar2 = new nc(i102, this, z10);
        j0Var = new i2.j0(this, z10, f122, i102);
        T2 = LaunchActivity.T();
        z5Var = this.N;
        if (z5Var != null) {
            this.N = null;
        }
        if (this.N != null) {
        }
        if (T2 != null) {
        }
        j0Var.run();
    }

    public final void d0(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        jj jjVar = (jj) list.get(0);
        long B0 = jj.B0(jjVar.k);
        int i10 = this.a;
        if (B0 >= 0) {
            vp.r1(i10).U2(vp.r1(i10).Z1(Long.valueOf(B0)), 0, true, null);
        } else {
            vp.r1(i10).T2(0, -B0, true);
        }
        cc.a0(LaunchActivity.T()).Q(R.raw.error, 36, h8.S0(TextUtils.concat(cd.G((int) jjVar.k.errorAllowedPriceStars, "PaidMessagesSendErrorToast1", new Object[0]), " ", cd.G((int) jjVar.k.errorNewPriceStars, "PaidMessagesSendErrorToast2", new Object[0])))).j();
    }

    public final void e0(LaunchActivity launchActivity, long j10, String str) {
        if (this.e) {
            f0(launchActivity, j10, str);
        } else {
            r(new ag.a3(this, launchActivity, j10, str, 21));
        }
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, j20 j20Var, TLRPC.InputPeer inputPeer) {
        if (activity == null) {
            return;
        }
        int i10 = this.a;
        if (vp.r1(i10).k7) {
            org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
            if (Q == null || Q.getContext() == null) {
                c0(activity, null);
                return;
            } else {
                c0(Q.getContext(), Q.getResourceProvider());
                return;
            }
        }
        boolean z10 = ((org.telegram.messenger.j0) vp.r1(i10).y7.h0.b).c && inputPeer != null;
        if ((!org.telegram.messenger.v2.b() && org.telegram.messenger.u1.i().k()) || z10) {
            if (!org.telegram.messenger.u1.i().k()) {
                j20Var.a(Boolean.FALSE, "INVOICE DISABLED");
                return;
            }
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            c5.a aVar = new c5.a();
            aVar.c = "inapp";
            aVar.b = tL_starsTopupOption.store_product;
            c5.p a2 = aVar.a();
            org.telegram.messenger.f8.b("StarsController.buy starts queryProductDetails");
            org.telegram.messenger.u1.i().o(Arrays.asList(a2), new a1.d(j20Var, tL_inputStorePaymentStarsTopup, tL_starsTopupOption, activity, 19));
            return;
        }
        TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup2 = new TLRPC.TL_inputStorePaymentStarsTopup();
        tL_inputStorePaymentStarsTopup2.stars = tL_starsTopupOption.stars;
        tL_inputStorePaymentStarsTopup2.amount = tL_starsTopupOption.amount;
        tL_inputStorePaymentStarsTopup2.currency = tL_starsTopupOption.currency;
        tL_inputStorePaymentStarsTopup2.spend_purpose_peer = inputPeer;
        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsTopup2;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u10 = xh.m2.u(I(), false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new ag.p0(this, j20Var, tL_inputInvoiceStars, 20));
    }

    public final void f0(LaunchActivity launchActivity, long j10, String str) {
        if (p().amount < j10 && j10 > 0) {
            new x7(launchActivity, null, j10, 4, str, new r5.a(5), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
        if (T2 == null) {
            return;
        }
        wb K = cc.a0(T2).K(R.raw.stars_topup, cd.L0(2131744982, null), cd.L0(2131744981, null), new r5.a(4));
        K.j = 5000;
        K.k(true);
    }

    public final void g(final long j10, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final j20 j20Var) {
        int i10;
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = org.telegram.messenger.w0.b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.p6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                r(new org.telegram.messenger.voip.g(this, j20Var, j10, tLObject, tL_textWithEntities));
                return;
            }
            if (z10) {
                i10 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                return;
            } else {
                i10 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            }
            final String l4 = org.telegram.messenger.o5.l(this.a, j10);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = vp.r1(this.a).n1(j10);
            tL_inputInvoicePremiumGiftStars.months = i10;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject u10 = xh.m2.u(I, false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: rh.u4
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final e6 e6Var = e6.this;
                    final j20 j20Var2 = j20Var;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.p6 p6Var = I;
                    final String str = l4;
                    final long j11 = j10;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.y4
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject4 = tLObject2;
                            boolean z11 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            j20 j20Var3 = j20Var2;
                            if (!z11) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                e6.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                                j20Var3.a(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            int i11 = 0;
                            long j12 = 0;
                            while (i11 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                                i11++;
                                j12 += tL_labeledPrice.amount;
                            }
                            e6 e6Var2 = e6.this;
                            ConnectionsManager.getInstance(e6Var2.a).sendRequest(tL_payments_sendStarsForm, new a5(e6Var2, j20Var3, context3, p6Var, j12, str, j11, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(final long j10, final long j11, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i10 = this.a;
        togglenopaidmessagesexception.user_id = vp.r1(i10).n1(j10);
        if (j11 != 0) {
            togglenopaidmessagesexception.parent_peer = vp.r1(i10).i1(j11);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i10).sendRequest(togglenopaidmessagesexception, new RequestDelegate() { // from class: rh.j5
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.i0.g3(new sq(e6.this, tLObject, j11, j10, z11));
            }
        });
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, j20 j20Var) {
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = org.telegram.messenger.w0.b;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.p6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new org.telegram.messenger.voip.g(this, j20Var, tL_payments_paymentFormStarGift, starGift, j10, 14));
            return;
        }
        String l4 = org.telegram.messenger.o5.l(this.a, j10);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = vp.r1(this.a).i1(j10);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        int i10 = 0;
        JSONObject u10 = xh.m2.u(I, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftResale;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
        int size = arrayList.size();
        long j11 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j11 += tL_labeledPrice.amount;
            size = size;
            context2 = context2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new a5(this, j20Var, context2, I, j11, l4, tL_payments_paymentFormStarGift, starGift, j10));
    }

    public final void h0(String str, TLRPC.ChatInvite chatInvite, j20 j20Var) {
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.I1;
            if (context == null) {
                context = org.telegram.messenger.w0.b;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.p6 I = I();
            long j10 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i10 = d20.s0;
                boolean[] zArr = {false};
                r5 r5Var = new r5(this, j10, i10, zArr, j20Var, context2, I, chatInvite, str);
                o oVar = new o(this, zArr, j20Var);
                org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context2, I, false);
                LinearLayout f7 = org.telegram.messenger.m5.f(context2, 1);
                f7.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new o7(context2, 40, 0, 0), w7.b6.c(-1.0f, -1));
                g9 g9Var = new g9(context2);
                g9Var.setRoundRadius(org.telegram.messenger.i0.L(80.0f));
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                r8Var.s(chatInvite.color);
                String str2 = chatInvite.title;
                r8Var.A = true;
                r8Var.n = 0;
                r8Var.m = false;
                org.telegram.ui.Components.r8.a(str2, null, null, r8Var.q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    g9Var.j(ic.i(org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.L(80.0f), false, null, false), chatInvite.photo), "80_80", r8Var, chatInvite);
                } else {
                    g9Var.setImageDrawable(r8Var);
                }
                frameLayout.addView(g9Var, w7.b6.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i11 = org.telegram.ui.ActionBar.t6.h5;
                org.telegram.ui.ActionBar.a7.y(frameLayout, drawable, i11, I, PorterDuff.Mode.SRC_IN);
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, w7.b6.e(26, 26, 17));
                imageView.setTranslationX(org.telegram.messenger.i0.L(26.0f));
                imageView.setTranslationY(org.telegram.messenger.i0.L(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, w7.b6.e(26, 26, 17));
                imageView2.setTranslationX(org.telegram.messenger.i0.L(26.0f));
                imageView2.setTranslationY(org.telegram.messenger.i0.L(26.0f));
                w7 w7Var = new w7(i10, context2, I);
                w7.e6.a(w7Var);
                w7Var.setOnClickListener(new d7(w7Var, 0));
                frameLayout.addView(w7Var, w7.b6.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f7.addView(frameLayout, w7.b6.r(-1, zs.C1, 7));
                TextView g10 = org.telegram.messenger.m5.g(context2, 1, 20.0f);
                g10.setTypeface(org.telegram.messenger.i0.o());
                int i12 = org.telegram.ui.ActionBar.t6.j5;
                z20.p(g10, i12, I, null, 2131745030);
                g10.setGravity(17);
                TextView f10 = z20.f(f7, g10, w7.b6.t(-2, -2, 1, 0, 8, 0, 0), context2);
                f10.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.a7.V(f10, i12, I);
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i13 = tL_starsSubscriptionPricing.period;
                if (i13 == 2592000) {
                    f10.setText(org.telegram.messenger.i0.W2(cd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeText", chatInvite.title)));
                } else {
                    f10.setText(org.telegram.messenger.i0.W2(cd.G((int) tL_starsSubscriptionPricing.amount, "StarsSubscribeTextTest", chatInvite.title, i13 == 300 ? "5 minutes" : "a minute")));
                }
                f10.setMaxWidth(vh.p2.a(f10.getText(), f10.getPaint()));
                f10.setGravity(17);
                f7.addView(f10, w7.b6.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView textView = new TextView(context2);
                    textView.setTextSize(1, 14.0f);
                    org.telegram.ui.ActionBar.a7.V(textView, i12, I);
                    textView.setText(org.telegram.messenger.k6.m(chatInvite.about, textView.getPaint().getFontMetricsInt(), false, null, 0));
                    textView.setGravity(17);
                    f7.addView(textView, w7.b6.t(-2, -2, 1, 0, 6, 0, 22));
                }
                vh.d dVar = new vh.d(context2, I, true);
                dVar.i(cd.L0(2131745039, null), false, true);
                f7.addView(dVar, w7.b6.o(-1, 48));
                p80 p80Var = new p80(context2, I);
                p80Var.setText(org.telegram.messenger.i0.T2(cd.L0(2131745038, null), new ph.p0(context2, 8)));
                p80Var.setGravity(17);
                p80Var.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.B6, I);
                org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, I);
                f7.addView(p80Var, w7.b6.t(-1, -2, 49, 14, 14, 14, 6));
                k10.N = f7;
                dVar.setOnClickListener(new e7(r5Var, k10, dVar, 0));
                k10.setOnDismissListener(new ag.x(oVar, 12));
                k10.Q(i11);
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (!org.telegram.messenger.i0.Q1() && T2 != null && !org.telegram.messenger.i0.u1(T2)) {
                    k10.a0(T2);
                }
                k10.show();
            }
        }
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final ph.u3 u3Var) {
        Context context = LaunchActivity.I1;
        if (context == null) {
            context = org.telegram.messenger.w0.b;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.p6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new Runnable() { // from class: rh.k4
                @Override // java.lang.Runnable
                public final void run() {
                    e6 e6Var = e6.this;
                    boolean z12 = e6Var.e;
                    ph.u3 u3Var2 = u3Var;
                    if (z12) {
                        e6Var.i(starGift, z10, z11, j10, tL_textWithEntities, u3Var2);
                    } else {
                        e6.e("NO_BALANCE");
                        u3Var2.a(Boolean.FALSE, null);
                    }
                }
            });
            return;
        }
        final String l4 = org.telegram.messenger.o5.l(this.a, j10);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z10;
        tL_inputInvoiceStarGift.peer = vp.r1(this.a).i1(j10);
        tL_inputInvoiceStarGift.gift_id = starGift.id;
        tL_inputInvoiceStarGift.include_upgrade = z11;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject u10 = xh.m2.u(I, false);
        if (u10 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = u10.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: rh.l4
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final e6 e6Var = e6.this;
                final ph.u3 u3Var2 = u3Var;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final org.telegram.ui.ActionBar.p6 p6Var = I;
                final String str = l4;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z12 = z10;
                final boolean z13 = z11;
                final long j11 = j10;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.z4
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final ph.u3 u3Var3 = u3Var2;
                        if (!z14) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            e6.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            u3Var3.a(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                        int size = arrayList.size();
                        int i10 = 0;
                        final long j12 = 0;
                        while (i10 < size) {
                            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                            i10++;
                            j12 += tL_labeledPrice.amount;
                        }
                        final e6 e6Var2 = e6.this;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(e6Var2.a);
                        final Context context4 = context3;
                        final org.telegram.ui.ActionBar.p6 p6Var2 = p6Var;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z15 = z12;
                        final boolean z16 = z13;
                        final long j13 = j11;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: rh.e5
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final e6 e6Var3 = e6.this;
                                final ph.u3 u3Var4 = u3Var3;
                                final Context context5 = context4;
                                final org.telegram.ui.ActionBar.p6 p6Var3 = p6Var2;
                                final long j14 = j12;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z17 = z15;
                                final boolean z18 = z16;
                                final long j15 = j13;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.q4
                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r11v10 */
                                    /* JADX WARN: Type inference failed for: r11v8 */
                                    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str4;
                                        SpannableStringBuilder spannableStringBuilder;
                                        w90 w90Var;
                                        ?? r11;
                                        e6 e6Var4 = e6.this;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        ph.u3 u3Var5 = u3Var4;
                                        Context context6 = context5;
                                        org.telegram.ui.ActionBar.p6 p6Var4 = p6Var3;
                                        long j16 = j14;
                                        String str5 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z19 = z17;
                                        boolean z20 = z18;
                                        long j17 = j15;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                                        cc X = (Q == null || Q.visibleDialog != null) ? cc.X() : cc.a0(Q);
                                        if (!(tLObject4 instanceof TLRPC.TL_payments_paymentResult)) {
                                            if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                if (vp.r1(e6Var4.a).k7) {
                                                    u3Var5.a(Boolean.FALSE, null);
                                                    e6.c0(context6, p6Var4);
                                                    return;
                                                } else {
                                                    boolean[] zArr = {false};
                                                    x7 x7Var = new x7(context6, p6Var4, j16, 6, str5, new f5(e6Var4, zArr, starGift5, z19, z20, j17, tL_textWithEntities5, u3Var5), 0L);
                                                    x7Var.setOnDismissListener(new mg.g(15, u3Var5, zArr));
                                                    x7Var.show();
                                                    return;
                                                }
                                            }
                                            if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                u3Var5.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                return;
                                            } else if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                u3Var5.a(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                return;
                                            } else {
                                                u3Var5.a(Boolean.FALSE, null);
                                                X.Q(R.raw.error, 36, cd.a0(null, null, 2131743903, tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS")).j();
                                                return;
                                            }
                                        }
                                        Utilities.d.c(new b5(e6Var4, (TLRPC.TL_payments_paymentResult) tLObject4, 2));
                                        e6Var4.D = false;
                                        e6Var4.E = true;
                                        e6Var4.G = 0L;
                                        e6Var4.U();
                                        e6Var4.P(j17);
                                        e6Var4.S(true);
                                        u3Var5.a(Boolean.TRUE, null);
                                        org.telegram.messenger.w1 b10 = org.telegram.messenger.y1.a(e6Var4.a).b();
                                        if (b10 != null && b10.a(j17)) {
                                            vp.r1(e6Var4.a).f7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j17, false).apply();
                                        }
                                        if (starGift5 == null || !starGift5.limited_per_user) {
                                            str4 = str5;
                                            spannableStringBuilder = null;
                                        } else {
                                            int i11 = starGift5.per_user_remains - 1;
                                            starGift5.per_user_remains = i11;
                                            spannableStringBuilder = org.telegram.messenger.i0.W2(cd.H(',', "Gift2SentRemainsLimit", Math.max(0, i11)));
                                            str4 = str5;
                                        }
                                        if (j17 < 0) {
                                            long j18 = -j17;
                                            TLRPC.ChatFull M0 = vp.r1(e6Var4.a).M0(j18);
                                            if (M0 != null) {
                                                M0.stargifts_count++;
                                                M0.flags2 |= 262144;
                                                vp.r1(e6Var4.a).O3(M0);
                                            }
                                            if (Q instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) Q;
                                                if (profileActivity.a() == j17) {
                                                    ix0 ix0Var = profileActivity.N;
                                                    if (ix0Var != null) {
                                                        ix0Var.K1(true);
                                                        profileActivity.N.f1(14);
                                                        r11 = 0;
                                                        profileActivity.T4(false);
                                                    } else {
                                                        r11 = 0;
                                                    }
                                                    cc a02 = cc.a0(Q);
                                                    TLRPC.Document document = starGift5.sticker;
                                                    String L0 = cd.L0(2131745127, null);
                                                    if (spannableStringBuilder == null) {
                                                        Object[] objArr = new Object[1];
                                                        objArr[r11] = str4;
                                                        spannableStringBuilder = org.telegram.messenger.i0.W2(cd.G((int) j16, "StarsGiftCompletedChannelText", objArr));
                                                    }
                                                    a02.s(document, L0, spannableStringBuilder).k(r11);
                                                }
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("chat_id", j18);
                                            bundle.putBoolean("open_gifts", true);
                                            ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                            profileActivity2.whenFullyVisible(new org.telegram.messenger.voip.g(profileActivity2, starGift5, spannableStringBuilder, j16, str4, 15));
                                            Q.presentFragment(profileActivity2);
                                        } else if ((Q instanceof un) && ((un) Q).a() == j17) {
                                            cc a03 = cc.a0(Q);
                                            TLRPC.Document document2 = starGift5.sticker;
                                            String L02 = cd.L0(2131745127, null);
                                            if (spannableStringBuilder == null) {
                                                spannableStringBuilder = org.telegram.messenger.i0.W2(cd.G((int) j16, "StarsGiftCompletedText", new Object[0]));
                                            }
                                            a03.s(document2, L02, spannableStringBuilder).k(true);
                                        } else {
                                            zs f7 = zs.f(e6Var4.a);
                                            int i12 = zs.v;
                                            Long valueOf = Long.valueOf(j17);
                                            Boolean bool = Boolean.FALSE;
                                            f7.k(i12, valueOf, bool);
                                            zs.f(e6Var4.a).k(zs.u, Long.valueOf(j17), bool);
                                            un ha = un.ha(j17);
                                            ha.whenFullyVisible(new ag.a3(ha, starGift5, spannableStringBuilder, j16, 20));
                                            Q.presentFragment(ha);
                                        }
                                        vp.r1(e6Var4.a).f7.edit().putBoolean("show_gift_for_" + j17, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j17, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.I1;
                                        if (launchActivity == null || (w90Var = launchActivity.x0) == null) {
                                            return;
                                        }
                                        w90Var.c(true);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }

    public final void i0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f.equals(starsAmount);
        int i10 = zs.y3;
        int i11 = this.a;
        if (!equals) {
            this.f = starsAmount;
            this.g = 0L;
            zs.f(i11).k(i10, new Object[0]);
        } else if (this.g != 0) {
            this.g = 0L;
            zs.f(i11).k(i10, new Object[0]);
        }
    }

    public final boolean j() {
        if (!this.b) {
            return false;
        }
        org.telegram.messenger.w0.u();
        if (!org.telegram.messenger.v2.a()) {
            org.telegram.messenger.w0.r();
            TL_stars.StarsAmount p5 = p();
            if (p5.nanos == 0 && p5.amount == 0) {
                return false;
            }
        }
        return true;
    }

    public final void j0(final jj jjVar, final long j10, final Runnable runnable, final boolean z10) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (jjVar == null) {
            runnable.run();
            return;
        }
        final long B0 = jj.B0(jjVar.k);
        final int f12 = jjVar.f1();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) jjVar.k.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i10 = this.a;
        tL_messages_editMessage.peer = vp.r1(i10).i1(B0);
        int i11 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i11;
        tL_messages_editMessage.schedule_date = jjVar.k.date;
        tL_messages_editMessage.id = f12;
        tL_messages_editMessage.flags = i11 | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j10;
        int i12 = 0;
        while (i12 < tL_messageMediaPaidMedia2.extended_media.size()) {
            TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia2.extended_media.get(i12);
            if (!(messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia)) {
                runnable.run();
                return;
            }
            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
            if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) messageMedia).photo;
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto.id = tL_inputPhoto;
                tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaPhoto);
            } else {
                tL_messageMediaPaidMedia = tL_messageMediaPaidMedia2;
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) messageMedia).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    tL_inputMediaDocument.id = tL_inputDocument;
                    tL_inputMediaPaidMedia.extended_media.add(tL_inputMediaDocument);
                }
            }
            i12++;
            tL_messageMediaPaidMedia2 = tL_messageMediaPaidMedia;
        }
        tL_messages_editMessage.media = tL_inputMediaPaidMedia;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: rh.o5
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.i0.g3(new dq(e6.this, tLObject, runnable, tL_error, z10, B0, f12, jjVar, j10));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j10) {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i10 >= longSparseArray.size()) {
                return null;
            }
            v5 v5Var = (v5) longSparseArray.valueAt(i10);
            for (int i11 = 0; i11 < v5Var.l.size(); i11++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) v5Var.l.get(i11);
                if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.id == j10) {
                    return savedStarGift;
                }
            }
            i10++;
        }
    }

    public final TL_stars.StarsAmount p() {
        return q(null, true, false);
    }

    public final TL_stars.StarsAmount q(Runnable runnable, boolean z10, boolean z11) {
        if (((!this.e || System.currentTimeMillis() - this.c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new h5(0, this, runnable));
        }
        if (!z10 || this.g <= 0) {
            return this.f;
        }
        sf.a m10 = sf.a.m(this.f);
        return sf.a.g(Math.max(0L, m10.a() - this.g), m10.a).o();
    }

    public final void r(Runnable runnable) {
        q(runnable, true, false);
    }

    public final sf.a s() {
        sf.a l4 = sf.a.l(p());
        if (l4 == null) {
            return sf.a.i(0L, this.b ? sf.b.b : sf.b.a);
        }
        return l4;
    }

    public final ArrayList u() {
        if (this.k || this.l) {
            return this.m;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new g5(this, 3));
        return this.m;
    }

    public final ArrayList v() {
        if (this.n || this.o) {
            return this.p;
        }
        this.n = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new g5(this, 4));
        return this.p;
    }

    public final ArrayList z() {
        if (this.h || this.i) {
            return this.j;
        }
        this.h = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new g5(this, 2));
        return this.j;
    }
}
