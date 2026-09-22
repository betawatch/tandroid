package yh;

import ai.z8;
import android.app.Activity;
import android.content.Context;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.kd;
import ci.xa;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.bg;
import org.telegram.messenger.cg;
import org.telegram.messenger.kg;
import org.telegram.messenger.rk;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bj1;
import org.telegram.ui.ib0;
import org.telegram.ui.l01;
import org.telegram.ui.n31;
import org.telegram.ui.u21;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class u5 {
    public static volatile u5[][] S = (u5[][]) Array.newInstance((Class<?>) u5.class, 2, 4);
    public static final Object[][] T = (Object[][]) Array.newInstance((Class<?>) Object.class, 2, 4);
    public boolean A;
    public t5 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public long G;
    public p5 N;
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

    public u5(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
    }

    public static org.telegram.ui.ActionBar.f6 I() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            return U.getResourceProvider();
        }
        return null;
    }

    public static u5 L(int i10) {
        return y(i10, true);
    }

    public static boolean U(int i10, zf.a aVar) {
        return aVar == null || x(i10, aVar.a).s().b >= aVar.b;
    }

    public static /* synthetic */ void a(u5 u5Var, TL_stars.StarGifts starGifts) {
        ArrayList arrayList = u5Var.I;
        ArrayList arrayList2 = u5Var.J;
        int i10 = u5Var.a;
        ArrayList arrayList3 = u5Var.H;
        u5Var.C = false;
        u5Var.D = true;
        if (!(starGifts instanceof TL_stars.TL_starGifts)) {
            if (starGifts instanceof TL_stars.TL_starGiftsNotModified) {
                int i11 = u5Var.F;
                long currentTimeMillis = System.currentTimeMillis();
                u5Var.G = currentTimeMillis;
                u5Var.c0(i11, currentTimeMillis, arrayList3);
                return;
            }
            return;
        }
        TL_stars.TL_starGifts tL_starGifts = (TL_stars.TL_starGifts) starGifts;
        MessagesController.getInstance(i10).putUsers(tL_starGifts.users, false);
        MessagesController.getInstance(i10).putChats(tL_starGifts.chats, false);
        MessagesStorage.getInstance(i10).putUsersAndChats(tL_starGifts.users, tL_starGifts.chats, true, true);
        arrayList3.clear();
        arrayList3.addAll(tL_starGifts.gifts);
        arrayList2.clear();
        arrayList2.addAll(arrayList3);
        Collections.sort(arrayList2, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new ai.f7(17)), new ai.f7(18)));
        arrayList.clear();
        arrayList.addAll(arrayList3);
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new ai.f7(19)));
        u5Var.F = tL_starGifts.hash;
        u5Var.G = System.currentTimeMillis();
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        u5Var.c0(u5Var.F, u5Var.G, tL_starGifts.gifts);
    }

    public static /* synthetic */ void b(u5 u5Var, ArrayList arrayList, Integer num, Long l4, ArrayList arrayList2, ArrayList arrayList3) {
        int i10 = u5Var.a;
        MessagesController.getInstance(i10).putUsers(arrayList2, true);
        MessagesController.getInstance(i10).putChats(arrayList3, true);
        u5Var.E = true;
        ArrayList arrayList4 = u5Var.H;
        arrayList4.clear();
        arrayList4.addAll(arrayList);
        ArrayList arrayList5 = u5Var.J;
        arrayList5.clear();
        arrayList5.addAll(arrayList4);
        Collections.sort(arrayList5, Comparator$-EL.thenComparingInt(Comparator$-CC.comparingInt(new ai.f7(14)), new ai.f7(15)));
        ArrayList arrayList6 = u5Var.I;
        arrayList6.clear();
        arrayList6.addAll(arrayList4);
        Collections.sort(arrayList6, Comparator$-CC.comparingInt(new ai.f7(16)));
        u5Var.F = num.intValue();
        u5Var.G = l4.longValue();
        u5Var.C = false;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starGiftsLoaded, new Object[0]);
        u5Var.V();
    }

    public static void e(String str) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        hg.k0.q(R.string.UnknownErrorCode, new Object[]{str}, (R == null || R.visibleDialog != null) ? xc.X() : xc.a0(R), R.raw.error, 36);
    }

    public static void e0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.StarsNotAvailableTitle);
        alertDialog$Builder.a.T = LocaleController.getString(R.string.StarsNotAvailableText);
        org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder, null);
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

    public static Context t(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var != null && n2Var.getContext() != null) {
            return n2Var.getContext();
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && !launchActivity.isFinishing()) {
            return LaunchActivity.G1;
        }
        if (ApplicationLoader.applicationContext != null) {
            return ApplicationLoader.applicationContext;
        }
        return null;
    }

    public static u5 w(int i10) {
        return y(i10, false);
    }

    public static u5 x(int i10, zf.b bVar) {
        return y(i10, bVar == zf.b.b);
    }

    public static u5 y(int i10, boolean z10) {
        u5 u5Var;
        u5 u5Var2 = S[z10 ? 1 : 0][i10];
        if (u5Var2 != null) {
            return u5Var2;
        }
        synchronized (T[z10 ? 1 : 0][i10]) {
            try {
                u5Var = S[z10 ? 1 : 0][i10];
                if (u5Var == null) {
                    u5[] u5VarArr = S[z10 ? 1 : 0];
                    u5 u5Var3 = new u5(i10, z10);
                    u5VarArr[i10] = u5Var3;
                    u5Var = u5Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u5Var;
    }

    public final long A(MessageObject messageObject) {
        Long l4;
        t5 t5Var = this.B;
        if (t5Var != null && t5Var.a.equals(n5.b(messageObject)) && (l4 = this.B.n) != null) {
            return l4.longValue();
        }
        Long myPaidReactionPeer = messageObject == null ? null : messageObject.getMyPaidReactionPeer();
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final long B(n5 n5Var, TLRPC.TL_messageReactions tL_messageReactions) {
        Long l4;
        t5 t5Var = this.B;
        if (t5Var != null && t5Var.a.equals(n5Var) && (l4 = this.B.n) != null) {
            return l4.longValue();
        }
        Long myPaidReactionPeer = MessageObject.getMyPaidReactionPeer(tL_messageReactions);
        if (myPaidReactionPeer != null) {
            return myPaidReactionPeer.longValue();
        }
        Long paidReactionsDialogId = MessagesController.getInstance(this.a).getPaidReactionsDialogId();
        if (paidReactionsDialogId != null) {
            return paidReactionsDialogId.longValue();
        }
        return 0L;
    }

    public final void C(long j3, long j10, Utilities.Callback callback) {
        TL_account.getPaidMessagesRevenue getpaidmessagesrevenue = new TL_account.getPaidMessagesRevenue();
        int i10 = this.a;
        getpaidmessagesrevenue.user_id = MessagesController.getInstance(i10).getInputUser(j3);
        if (j10 != 0) {
            getpaidmessagesrevenue.parent_peer = MessagesController.getInstance(i10).getInputPeer(j10);
        }
        ConnectionsManager.getInstance(i10).sendRequest(getpaidmessagesrevenue, new ai.d8(1, callback));
    }

    public final long D(int i10, long j3) {
        t5 t5Var = this.B;
        if (t5Var == null) {
            return 0L;
        }
        n5 n5Var = t5Var.a;
        if (n5Var.a == j3 && n5Var.b == i10 && t5Var.l) {
            return t5Var.h;
        }
        return 0L;
    }

    public final long E(MessageObject messageObject) {
        TLRPC.Message message;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return 0L;
        }
        return ((message.isThreadMessage || messageObject.isForwardedChannelPost()) && messageObject.messageOwner.fwd_from != null) ? D(messageObject.messageOwner.fwd_from.saved_from_msg_id, messageObject.getFromChatId()) : D(messageObject.getId(), messageObject.getDialogId());
    }

    public final k5 F(long j3, boolean z10) {
        LongSparseArray longSparseArray = this.K;
        k5 k5Var = (k5) longSparseArray.get(j3);
        if (k5Var != null || !z10) {
            return k5Var;
        }
        k5 k5Var2 = new k5(this.a, j3);
        longSparseArray.put(j3, k5Var2);
        return k5Var2;
    }

    public final l5 G(long j3, boolean z10) {
        LongSparseArray longSparseArray = this.L;
        l5 l5Var = (l5) longSparseArray.get(j3);
        if (l5Var != null || !z10) {
            return l5Var;
        }
        l5 l5Var2 = new l5(this.a, j3, true);
        longSparseArray.put(j3, l5Var2);
        return l5Var2;
    }

    public final void H(TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback callback) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        org.telegram.ui.ActionBar.f6 I = I();
        if (starGift == null || context == null) {
            return;
        }
        if (!this.e) {
            r(new z21(this, callback, starGift, j3, 11));
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.a).getInputPeer(j3);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject p5 = ei.k3.p(I, false);
        if (p5 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p5.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new bj1(10, this, callback));
    }

    public final TL_stars.StarGift J(long j3) {
        V();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 >= arrayList.size()) {
                return null;
            }
            TL_stars.StarGift starGift = (TL_stars.StarGift) arrayList.get(i10);
            if (starGift.id == j3) {
                return starGift;
            }
            i10++;
        }
    }

    public final void K(long j3, Utilities.Callback callback) {
        TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) this.M.get(Long.valueOf(j3));
        if (stargiftupgradepreview != null) {
            callback.run(stargiftupgradepreview);
            return;
        }
        TL_stars.getStarGiftUpgradePreview getstargiftupgradepreview = new TL_stars.getStarGiftUpgradePreview();
        getstargiftupgradepreview.gift_id = j3;
        ConnectionsManager.getInstance(this.a).sendRequest(getstargiftupgradepreview, new ai.u1(this, j3, callback, 5));
    }

    public final void M(TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2Var.q(200L);
        TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
        getsavedstargift.stargift.add(inputSavedStarGift);
        ConnectionsManager.getInstance(this.a).sendRequest(getsavedstargift, new ai.p3(this, b2Var, inputSavedStarGift, callback, 18));
    }

    public final boolean N() {
        return O(0);
    }

    public final boolean O(int i10) {
        return this.e && !this.q[i10].isEmpty();
    }

    public final void P() {
        this.e = false;
        p();
        this.e = true;
    }

    public final void Q(long j3) {
        l5 G = G(j3, false);
        if (G != null) {
            G.i(false);
        }
        k5 k5Var = (k5) this.K.get(j3);
        if (k5Var != null) {
            k5Var.g();
        }
    }

    public final void R(TLRPC.UserFull userFull) {
        long j3 = userFull.id;
        l5 G = G(j3, false);
        if (G != null && G.n != userFull.stargifts_count) {
            G.i(false);
        }
        k5 k5Var = (k5) this.K.get(j3);
        if (k5Var != null) {
            k5Var.g();
        }
    }

    public final void S() {
        if (this.x) {
            return;
        }
        this.v.clear();
        this.w = null;
        this.x = false;
        this.y = false;
        W();
    }

    public final void T(boolean z10) {
        for (int i10 = 0; i10 < 3; i10++) {
            boolean[] zArr = this.t;
            if (!zArr[i10]) {
                this.q[i10].clear();
                this.s[i10] = null;
                zArr[i10] = false;
                this.u[i10] = false;
                if (z10) {
                    X(i10);
                }
            }
        }
    }

    public final void V() {
        if (this.C) {
            return;
        }
        if (!this.D || System.currentTimeMillis() - this.G >= 60000) {
            this.C = true;
            boolean z10 = this.E;
            int i10 = this.a;
            if (z10) {
                int i11 = this.F;
                org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(this, 24);
                TL_stars.getStarGifts getstargifts = new TL_stars.getStarGifts();
                getstargifts.hash = i11;
                ConnectionsManager.getInstance(i10).sendRequest(getstargifts, new ai.m8(b1Var, 27));
                return;
            }
            r5.d dVar = new r5.d(this, 23);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i10);
            messagesStorage.getStorageQueue().postRunnable(new u(messagesStorage, arrayList3, arrayList2, arrayList, dVar, 4));
        }
    }

    public final void W() {
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_getStarsSubscriptions, new w4(this, 1));
    }

    public final void X(int i10) {
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
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsTransactions, new ai.g8(this, i10, 9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04c4  */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(MessageObject messageObject, TLRPC.InputInvoice inputInvoice, TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, Runnable runnable, Utilities.Callback callback) {
        long j3;
        String str;
        boolean z10;
        org.telegram.ui.ActionBar.f3 f3Var;
        x4 x4Var;
        n31 n31Var;
        ViewGroup viewGroup;
        MessageObject messageObject2;
        int i10;
        ?? r22;
        int i11;
        long j10;
        int i12;
        long j11;
        TLRPC.Message message;
        String str2;
        boolean z11;
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        int i13;
        int i14;
        String formatPluralString;
        String str3;
        boolean z12;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message2;
        int i15;
        int i16;
        a7 a7Var;
        x4 x4Var2;
        ImageLocation imageLocation;
        TLRPC.Peer peer2;
        if (tL_payments_paymentFormStars == null || tL_payments_paymentFormStars.invoice == null) {
            return;
        }
        MessagesController.getInstance(this.a).putUsers(tL_payments_paymentFormStars.users, false);
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.f6 I = I();
        if (context2 == null) {
            return;
        }
        if (!this.e) {
            r(new z8(this, runnable, messageObject, inputInvoice, tL_payments_paymentFormStars, callback, 19));
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        long j12 = 0;
        int i17 = 0;
        while (i17 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i17);
            i17++;
            j12 += tL_labeledPrice.amount;
        }
        if (messageObject == null || messageObject.type != 29) {
            j3 = tL_payments_paymentFormStars.bot_id;
        } else {
            TLRPC.MessageFwdHeader messageFwdHeader2 = messageObject.messageOwner.fwd_from;
            j3 = (messageFwdHeader2 == null || (peer2 = messageFwdHeader2.from_id) == null) ? messageObject.getDialogId() : DialogObject.getPeerDialogId(peer2);
        }
        long j13 = j3;
        if (j13 >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.a).getUser(Long.valueOf(j13));
            String userName = UserObject.getUserName(user2);
            UserObject.isBot(user2);
            str = userName;
            z10 = !UserObject.isBot(user2);
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.a).getChat(Long.valueOf(-j13));
            str = chat == null ? "" : chat.title;
            z10 = false;
        }
        String str4 = tL_payments_paymentFormStars.title;
        runnable.run();
        int i18 = tL_payments_paymentFormStars.invoice.subscription_period;
        long j14 = j12;
        boolean[] zArr = {false};
        int i19 = this.a;
        TLRPC.WebDocument webDocument = tL_payments_paymentFormStars.photo;
        x4 x4Var3 = new x4(this, j14, zArr, callback, context2, I, z10, str, messageObject, inputInvoice, tL_payments_paymentFormStars, i18, j13);
        n31 n31Var2 = new n31(this, zArr, callback);
        org.telegram.ui.ActionBar.f3 j15 = rk.j(1, context2, I, false);
        TLRPC.User user3 = MessagesController.getInstance(i19).getUser(Long.valueOf(j13));
        LinearLayout f7 = rk.f(context2, 1);
        f7.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.addView(new y6(context2, 40, 0), w7.y5.c(-1.0f, -1));
        if (messageObject == null || (message2 = messageObject.messageOwner) == null || !(message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
            f3Var = j15;
            x4Var = x4Var3;
            n31Var = n31Var2;
            viewGroup = frameLayout;
            messageObject2 = messageObject;
            i10 = i18;
            if (webDocument != null) {
                FrameLayout frameLayout2 = new FrameLayout(context2);
                v9 v9Var = new v9(context2);
                v9Var.setRoundRadius(AndroidUtilities.dp(18.0f));
                v9Var.n(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), "80_80", null, null);
                frameLayout2.addView(v9Var, w7.y5.e(80, 80, 48));
                viewGroup.addView(frameLayout2, w7.y5.e(80, 87, 17));
                TextView textView = new TextView(context2);
                textView.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
                r22 = 1;
                textView.setTextSize(1, 13.0f);
                i11 = -1;
                textView.setTextColor(-1);
                j10 = j14;
                textView.setText(w7.R0(hg.k0.j((int) j14, ',', new StringBuilder("XTR ")), 0.85f, null));
                i12 = 0;
                textView.setPadding(AndroidUtilities.dp(5.33f), 0, AndroidUtilities.dp(5.33f), 0);
                textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(16.0f), -1133566));
                FrameLayout frameLayout3 = new FrameLayout(context2);
                frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, I)));
                frameLayout3.setPadding(AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f), AndroidUtilities.dp(1.33f));
                frameLayout3.addView(textView, w7.y5.q(-2, 16, 119));
                frameLayout2.addView(frameLayout3, w7.y5.a(-2.0f, 18.66f, 81));
                k7 k7Var = new k7(context2, i19, I);
                w7.a6.a(k7Var);
                k7Var.setOnClickListener(new g6(k7Var, i12));
                viewGroup.addView(k7Var, w7.y5.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f7.addView(viewGroup, w7.y5.q(i11, 117, 7));
                TextView f10 = org.telegram.messenger.l0.f(context2, r22, 20.0f);
                f10.setTypeface(AndroidUtilities.bold());
                int i20 = org.telegram.ui.ActionBar.j6.j5;
                f10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i20, I));
                if (i10 <= 0) {
                    f10.setText(Emoji.replaceEmoji(webDocument != null ? str4 : LocaleController.getString(R.string.StarsConfirmSubscriptionTitle), f10.getPaint().getFontMetricsInt(), i12));
                } else {
                    f10.setText(Emoji.replaceEmoji(webDocument != null ? str4 : LocaleController.getString(R.string.StarsConfirmPurchaseTitle), f10.getPaint().getFontMetricsInt(), i12));
                }
                NotificationCenter.listenEmojiLoading(f10);
                f10.setGravity(17);
                f7.addView(f10, w7.y5.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
                if (webDocument != null) {
                    LinearLayout f11 = rk.f(context2, i12);
                    f11.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, I)));
                    v9 v9Var2 = new v9(context2);
                    v9Var2.setRoundRadius(AndroidUtilities.dp(14.0f));
                    g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
                    g9Var.r(user3);
                    v9Var2.e(user3, g9Var);
                    f11.addView(v9Var2, w7.y5.n(28, 28));
                    TextView textView2 = new TextView(context2);
                    textView2.setTextSize(r22, 13.0f);
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, I));
                    textView2.setText(UserObject.getUserName(user3));
                    f11.addView(textView2, w7.y5.t(-2, -2, 16, 6, 0, 10, 0));
                    f7.addView(f11, w7.y5.t(-2, 28, 1, 0, 8, 0, 2));
                }
                TextView f12 = org.telegram.messenger.l0.f(context2, r22, 14.0f);
                f12.setTextColor(org.telegram.ui.ActionBar.j6.v0(i20, I));
                if (messageObject2 == null && (message = messageObject2.messageOwner) != null && (message.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    long dialogId = messageObject2.getDialogId();
                    TLRPC.Message message3 = messageObject2.messageOwner;
                    if (message3 != null && (messageFwdHeader = message3.fwd_from) != null && (peer = messageFwdHeader.from_id) != null) {
                        dialogId = DialogObject.getPeerDialogId(peer);
                    }
                    if (dialogId < 0 && messageObject2.getFromChatId() > 0 && (user = MessagesController.getInstance(i19).getUser(Long.valueOf(messageObject2.getFromChatId()))) != null && user.bot) {
                        dialogId = user.id;
                    }
                    if (dialogId >= 0) {
                        TLRPC.User user4 = MessagesController.getInstance(i19).getUser(Long.valueOf(dialogId));
                        str2 = UserObject.getUserName(user4);
                        if (user4 != null && user4.bot) {
                            z11 = true;
                            tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject2.messageOwner.media;
                            i14 = 0;
                            int i21 = 0;
                            for (i13 = 0; i13 < tL_messageMediaPaidMedia.extended_media.size(); i13++) {
                                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i13);
                                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                                    if ((((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia).flags & 4) != 0) {
                                        z12 = true;
                                    }
                                    z12 = false;
                                } else {
                                    if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                        z12 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media instanceof TLRPC.TL_messageMediaDocument;
                                    }
                                    z12 = false;
                                }
                                if (z12) {
                                    i14++;
                                } else {
                                    i21++;
                                }
                            }
                            if (i14 != 0) {
                                str3 = z11 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                                long j16 = j10;
                                int i22 = (int) j16;
                                Object[] objArr = new Object[2];
                                objArr[i12] = i21 == r22 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i21, new Object[i12]);
                                objArr[r22] = str2;
                                formatPluralString = LocaleController.formatPluralString(str3, i22, objArr);
                                j11 = j16;
                            } else {
                                j11 = j10;
                                if (i21 == 0) {
                                    str3 = z11 ? "StarsConfirmPurchaseMediaBotOne2" : "StarsConfirmPurchaseMediaOne2";
                                    int i23 = (int) j11;
                                    Object[] objArr2 = new Object[2];
                                    objArr2[i12] = i14 == r22 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i14, new Object[i12]);
                                    objArr2[r22] = str2;
                                    formatPluralString = LocaleController.formatPluralString(str3, i23, objArr2);
                                } else {
                                    String str5 = z11 ? "StarsConfirmPurchaseMediaBotTwo2" : "StarsConfirmPurchaseMediaTwo2";
                                    int i24 = (int) j11;
                                    String string = i21 == r22 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SinglePhoto) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Photos", i21, new Object[i12]);
                                    String string2 = i14 == r22 ? LocaleController.getString(R.string.StarsConfirmPurchaseMedia_SingleVideo) : LocaleController.formatPluralString("StarsConfirmPurchaseMedia_Videos", i14, new Object[i12]);
                                    Object[] objArr3 = new Object[3];
                                    objArr3[i12] = string;
                                    objArr3[r22] = string2;
                                    objArr3[2] = str2;
                                    formatPluralString = LocaleController.formatPluralString(str5, i24, objArr3);
                                }
                            }
                            f12.setText(AndroidUtilities.replaceTags(formatPluralString));
                        }
                    } else {
                        TLRPC.Chat chat2 = MessagesController.getInstance(i19).getChat(Long.valueOf(-dialogId));
                        str2 = chat2 != null ? chat2.title : "";
                    }
                    z11 = false;
                    tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageObject2.messageOwner.media;
                    i14 = 0;
                    int i212 = 0;
                    while (i13 < tL_messageMediaPaidMedia.extended_media.size()) {
                    }
                    if (i14 != 0) {
                    }
                    f12.setText(AndroidUtilities.replaceTags(formatPluralString));
                } else {
                    j11 = j10;
                    if (i10 <= 0) {
                        String userName2 = UserObject.getUserName(user3);
                        Object[] objArr4 = new Object[2];
                        objArr4[i12] = str4;
                        objArr4[r22] = userName2;
                        f12.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionText2", (int) j11, objArr4)));
                    } else {
                        String userName3 = UserObject.getUserName(user3);
                        Object[] objArr5 = new Object[2];
                        objArr5[i12] = str4;
                        objArr5[r22] = userName3;
                        f12.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseText2", (int) j11, objArr5)));
                    }
                }
                f12.setMaxWidth(ci.f4.a(f12.getText(), f12.getPaint()));
                f12.setGravity(17);
                f7.addView(f12, w7.y5.t(-2, -2, 1, 0, 6, 0, 18));
                ci.d dVar = new ci.d(context2, I, r22);
                if (i10 <= 0) {
                    dVar.g(w7.Q0(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmSubscriptionButton", (int) j11))), i12, r22);
                } else {
                    dVar.g(w7.Q0(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsConfirmPurchaseButton", (int) j11))), i12, r22);
                }
                f7.addView(dVar, w7.y5.c(48.0f, -1));
                n90 n90Var = new n90(context2, I);
                n90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, I));
                n90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, I));
                n90Var.setTextSize(r22, 14.0f);
                n90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10 <= 0 ? R.string.StarsConfirmSubscriptionTOS : R.string.StarsConfirmPurchaseTOS), new di.a(context2, 8)));
                n90Var.setGravity(17);
                f7.addView(n90Var, w7.y5.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
                org.telegram.ui.ActionBar.f3 f3Var2 = f3Var;
                f3Var2.customView = f7;
                dVar.setOnClickListener(new xg.e(x4Var, f3Var2, dVar, 7));
                f3Var2.setOnDismissListener(new ai.g5(n31Var, 12));
                f3Var2.fixNavigationBar();
                f3Var2.show();
            }
            v9 v9Var3 = new v9(context2);
            v9Var3.setRoundRadius(AndroidUtilities.dp(80.0f));
            g9 g9Var2 = new g9((org.telegram.ui.ActionBar.f6) null);
            g9Var2.r(user3);
            v9Var3.e(user3, g9Var2);
            viewGroup.addView(v9Var3, w7.y5.e(80, 80, 17));
        } else {
            a7 a7Var2 = new a7(context2);
            a7Var2.H = new Path();
            a7Var2.I = new RectF();
            a7Var2.J = context2.getResources().getDrawable(R.drawable.large_locked_post).mutate();
            a7Var2.setRoundRadius(AndroidUtilities.dp(24.0f));
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
            if (tL_messageMediaPaidMedia2.extended_media.isEmpty()) {
                f3Var = j15;
                n31Var = n31Var2;
                viewGroup = frameLayout;
                x4Var = x4Var3;
                messageObject2 = messageObject;
                i10 = i18;
                i15 = 17;
                i16 = 80;
            } else {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia2.extended_media.get(0);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMediaPreview) {
                    imageLocation = ImageLocation.getForObject(((TLRPC.TL_messageExtendedMediaPreview) messageExtendedMedia2).thumb, messageObject.messageOwner);
                    a7Var = a7Var2;
                    x4Var2 = x4Var3;
                } else {
                    if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                        TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia2).media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                            a7Var = a7Var2;
                            imageLocation = ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(messageMedia.photo.sizes, AndroidUtilities.dp(80.0f), true), messageMedia.photo);
                        } else {
                            a7Var = a7Var2;
                            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                imageLocation = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(messageMedia.document.thumbs, AndroidUtilities.dp(80.0f), true), messageMedia.document);
                            }
                        }
                        x4Var2 = x4Var3;
                    } else {
                        a7Var = a7Var2;
                    }
                    x4Var2 = x4Var3;
                    imageLocation = null;
                }
                a7Var2 = a7Var;
                f3Var = j15;
                i10 = i18;
                viewGroup = frameLayout;
                x4Var = x4Var2;
                i16 = 80;
                n31Var = n31Var2;
                i15 = 17;
                a7Var2.l(imageLocation, "80_80_b2", null, null, null, messageObject);
                messageObject2 = messageObject;
            }
            viewGroup.addView(a7Var2, w7.y5.e(i16, i16, i15));
        }
        j10 = j14;
        r22 = 1;
        i11 = -1;
        i12 = 0;
        k7 k7Var2 = new k7(context2, i19, I);
        w7.a6.a(k7Var2);
        k7Var2.setOnClickListener(new g6(k7Var2, i12));
        viewGroup.addView(k7Var2, w7.y5.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
        f7.addView(viewGroup, w7.y5.q(i11, 117, 7));
        TextView f102 = org.telegram.messenger.l0.f(context2, r22, 20.0f);
        f102.setTypeface(AndroidUtilities.bold());
        int i202 = org.telegram.ui.ActionBar.j6.j5;
        f102.setTextColor(org.telegram.ui.ActionBar.j6.v0(i202, I));
        if (i10 <= 0) {
        }
        NotificationCenter.listenEmojiLoading(f102);
        f102.setGravity(17);
        f7.addView(f102, w7.y5.t(-2, -2, 1, 0, webDocument == null ? -8 : 8, 0, 0));
        if (webDocument != null) {
        }
        TextView f122 = org.telegram.messenger.l0.f(context2, r22, 14.0f);
        f122.setTextColor(org.telegram.ui.ActionBar.j6.v0(i202, I));
        if (messageObject2 == null) {
        }
        j11 = j10;
        if (i10 <= 0) {
        }
        f122.setMaxWidth(ci.f4.a(f122.getText(), f122.getPaint()));
        f122.setGravity(17);
        f7.addView(f122, w7.y5.t(-2, -2, 1, 0, 6, 0, 18));
        ci.d dVar2 = new ci.d(context2, I, r22);
        if (i10 <= 0) {
        }
        f7.addView(dVar2, w7.y5.c(48.0f, -1));
        n90 n90Var2 = new n90(context2, I);
        n90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, I));
        n90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, I));
        n90Var2.setTextSize(r22, 14.0f);
        n90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(i10 <= 0 ? R.string.StarsConfirmSubscriptionTOS : R.string.StarsConfirmPurchaseTOS), new di.a(context2, 8)));
        n90Var2.setGravity(17);
        f7.addView(n90Var2, w7.y5.k(0.0f, 12.0f, 0.0f, 2.0f, -1, -2));
        org.telegram.ui.ActionBar.f3 f3Var22 = f3Var;
        f3Var22.customView = f7;
        dVar2.setOnClickListener(new xg.e(x4Var, f3Var22, dVar2, 7));
        f3Var22.setOnDismissListener(new ai.g5(n31Var, 12));
        f3Var22.fixNavigationBar();
        f3Var22.show();
    }

    public final void Z(final String str, final TLRPC.ChatInvite chatInvite, final Utilities.Callback2 callback2) {
        if (chatInvite == null || chatInvite.subscription_pricing == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final org.telegram.ui.ActionBar.f6 I = I();
        if (context == null) {
            return;
        }
        final long j3 = chatInvite.subscription_pricing.amount;
        final String str2 = chatInvite.title;
        TLRPC.TL_inputInvoiceChatInviteSubscription tL_inputInvoiceChatInviteSubscription = new TLRPC.TL_inputInvoiceChatInviteSubscription();
        tL_inputInvoiceChatInviteSubscription.hash = str;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = chatInvite.subscription_form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceChatInviteSubscription;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: yh.i4
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final u5 u5Var = u5.this;
                final Utilities.Callback2 callback22 = callback2;
                final long j10 = j3;
                final String str3 = str2;
                final Context context2 = context;
                final org.telegram.ui.ActionBar.f6 f6Var = I;
                final TLRPC.ChatInvite chatInvite2 = chatInvite;
                final String str4 = str;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.o4
                    @Override // java.lang.Runnable
                    public final void run() {
                        ib0 ib0Var;
                        u5 u5Var2 = u5.this;
                        TLObject tLObject2 = tLObject;
                        Utilities.Callback2 callback23 = callback22;
                        long j11 = j10;
                        String str5 = str3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        Context context3 = context2;
                        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        TLRPC.ChatInvite chatInvite3 = chatInvite2;
                        String str6 = str4;
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        xc a02 = !AndroidUtilities.hasDialogOnTop(R) ? xc.a0(R) : xc.X();
                        int i10 = 0;
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 == null || !"BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                callback23.run(0L, Boolean.FALSE);
                                hg.k0.q(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, a02, R.raw.error, 36);
                                return;
                            } else if (!MessagesController.getInstance(u5Var2.a).starsPurchaseAvailable()) {
                                callback23.run(0L, Boolean.FALSE);
                                u5.e0(context3, f6Var2);
                                return;
                            } else {
                                boolean[] zArr = {false};
                                l7 l7Var = new l7(context3, f6Var2, j11, 1, chatInvite3.title, new u(u5Var2, zArr, str6, chatInvite3, callback23, 3), 0L);
                                l7Var.setOnDismissListener(new u4(callback23, zArr, 0));
                                l7Var.show();
                                return;
                            }
                        }
                        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                        Utilities.stageQueue.postRunnable(new t4(u5Var2, tL_payments_paymentResult, i10));
                        TLRPC.Updates updates = tL_payments_paymentResult.updates;
                        TLRPC.Update update = updates.update;
                        long j12 = update instanceof TL_update.TL_updateChannel ? -((TL_update.TL_updateChannel) update).channel_id : 0L;
                        if (updates.updates != null) {
                            for (int i11 = 0; i11 < tL_payments_paymentResult.updates.updates.size(); i11++) {
                                if (tL_payments_paymentResult.updates.updates.get(i11) instanceof TL_update.TL_updateChannel) {
                                    j12 = -((TL_update.TL_updateChannel) tL_payments_paymentResult.updates.updates.get(i11)).channel_id;
                                }
                            }
                        }
                        callback23.run(Long.valueOf(j12), Boolean.TRUE);
                        if (j12 == 0) {
                            a02.M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j11, str5)), R.raw.stars_send).j();
                        }
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null && (ib0Var = launchActivity.x0) != null) {
                            ib0Var.c(true);
                        }
                        u5Var2.T(true);
                        u5Var2.S();
                    }
                });
            }
        });
    }

    public final void a0(final MessageObject messageObject, final TLRPC.InputInvoice inputInvoice, final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars, final Utilities.Callback callback) {
        long j3;
        String str;
        TLRPC.User user;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        if (tL_payments_paymentFormStars == null) {
            return;
        }
        final Context context = ApplicationLoader.applicationContext;
        final org.telegram.ui.ActionBar.f6 I = I();
        if (context == null) {
            return;
        }
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
        int size = arrayList.size();
        final long j10 = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j10 += tL_labeledPrice.amount;
        }
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            j3 = (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) ? messageObject.getDialogId() : DialogObject.getPeerDialogId(peer);
            if (j3 < 0 && messageObject.getFromChatId() > 0 && (user = MessagesController.getInstance(this.a).getUser(Long.valueOf(messageObject.getFromChatId()))) != null && user.bot) {
                j3 = user.id;
            }
        } else {
            j3 = tL_payments_paymentFormStars.bot_id;
        }
        final long j11 = j3;
        if (j11 >= 0) {
            str = UserObject.getUserName(MessagesController.getInstance(this.a).getUser(Long.valueOf(j11)));
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.a).getChat(Long.valueOf(-j11));
            str = chat == null ? "" : chat.title;
        }
        final String str2 = str;
        final String str3 = tL_payments_paymentFormStars.title;
        final int i11 = tL_payments_paymentFormStars.invoice.subscription_period;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
        tL_payments_sendStarsForm.invoice = inputInvoice;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: yh.f5
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final u5 u5Var = u5.this;
                final Utilities.Callback callback2 = callback;
                final MessageObject messageObject2 = messageObject;
                final Context context2 = context;
                final long j12 = j10;
                final String str4 = str2;
                final int i12 = i11;
                final String str5 = str3;
                final TLRPC.InputInvoice inputInvoice2 = inputInvoice;
                final long j13 = j11;
                final org.telegram.ui.ActionBar.f6 f6Var = I;
                final TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars2 = tL_payments_paymentFormStars;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.h5
                    /* JADX WARN: Removed duplicated region for block: B:26:0x010d  */
                    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        boolean z10;
                        LaunchActivity launchActivity;
                        ib0 ib0Var;
                        TLRPC.Message message2;
                        u5 u5Var2 = u5.this;
                        TLObject tLObject2 = tLObject;
                        Utilities.Callback callback3 = callback2;
                        MessageObject messageObject3 = messageObject2;
                        Context context3 = context2;
                        long j14 = j12;
                        String str6 = str4;
                        int i13 = i12;
                        String str7 = str5;
                        TLRPC.InputInvoice inputInvoice3 = inputInvoice2;
                        long j15 = j13;
                        TLRPC.TL_error tL_error2 = tL_error;
                        org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars3 = tL_payments_paymentFormStars2;
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        xc X = (R == null || R.visibleDialog != null) ? xc.X() : xc.a0(R);
                        if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                            if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                                if (!MessagesController.getInstance(u5Var2.a).starsPurchaseAvailable()) {
                                    callback3.run(Boolean.FALSE);
                                    u5.e0(context3, f6Var2);
                                    return;
                                } else {
                                    boolean[] zArr = {false};
                                    l7 l7Var = new l7(context3, f6Var2, j14, 0, str6, new z8(u5Var2, zArr, messageObject3, inputInvoice3, tL_payments_paymentFormStars3, callback3, 21), j15);
                                    l7Var.setOnDismissListener(new org.telegram.ui.ActionBar.k3(callback3, zArr));
                                    l7Var.show();
                                    return;
                                }
                            }
                            if (tL_error2 != null && "FORM_EXPIRED".equals(tL_error2.text)) {
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject p5 = ei.k3.p(f6Var2, false);
                                if (p5 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = p5.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = inputInvoice3;
                                ConnectionsManager.getInstance(u5Var2.a).sendRequest(tL_payments_getPaymentForm, new kd(u5Var2, messageObject3, inputInvoice3, callback3, X, 14));
                                return;
                            }
                            xc xcVar = X;
                            callback3.run(Boolean.FALSE);
                            hg.k0.q(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, xcVar, R.raw.error, 36);
                            if (messageObject3 != null) {
                                TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia = new TLRPC.TL_messages_getExtendedMedia();
                                tL_messages_getExtendedMedia.peer = MessagesController.getInstance(u5Var2.a).getInputPeer(j15);
                                tL_messages_getExtendedMedia.id.add(Integer.valueOf(messageObject3.getId()));
                                ConnectionsManager.getInstance(u5Var2.a).sendRequest(tL_messages_getExtendedMedia, null);
                                return;
                            }
                            return;
                        }
                        callback3.run(Boolean.TRUE);
                        Utilities.stageQueue.postRunnable(new t4(u5Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 4));
                        if (messageObject3 != null && (message2 = messageObject3.messageOwner) != null && (message2.media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                            Drawable mutate = context3.getResources().getDrawable(R.drawable.star_small_inner).mutate();
                            String string = LocaleController.getString(R.string.StarsMediaPurchaseCompleted);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsMediaPurchaseCompletedInfo", (int) j14, str6));
                            X.getClass();
                            mc mcVar = new mc(X.W(), X.c);
                            mcVar.a.setImageDrawable(mutate);
                            mcVar.b.setText(string);
                            mcVar.c.setText(replaceTags);
                            X.b(mcVar, 2750).j();
                        } else {
                            if (i13 <= 0) {
                                z10 = true;
                                X.M(LocaleController.getString(R.string.StarsPurchaseCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsPurchaseCompletedInfo", (int) j14, str7, str6)), R.raw.stars_send).j();
                                launchActivity = LaunchActivity.G1;
                                if (launchActivity != null && (ib0Var = launchActivity.x0) != null) {
                                    ib0Var.c(z10);
                                }
                                if ((inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) || !(((TLRPC.TL_inputInvoiceStars) inputInvoice3).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift)) {
                                    u5Var2.T(true);
                                }
                                if (messageObject3 == null) {
                                    TLRPC.TL_messages_getExtendedMedia tL_messages_getExtendedMedia2 = new TLRPC.TL_messages_getExtendedMedia();
                                    tL_messages_getExtendedMedia2.peer = MessagesController.getInstance(u5Var2.a).getInputPeer(j15);
                                    tL_messages_getExtendedMedia2.id.add(Integer.valueOf(messageObject3.getId()));
                                    ConnectionsManager.getInstance(u5Var2.a).sendRequest(tL_messages_getExtendedMedia2, null);
                                    return;
                                }
                                return;
                            }
                            X.M(LocaleController.getString(R.string.StarsBotSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsBotSubscriptionCompletedInfo", (int) j14, str7, str6)), R.raw.stars_send).j();
                        }
                        z10 = true;
                        launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            ib0Var.c(z10);
                        }
                        if (inputInvoice3 instanceof TLRPC.TL_inputInvoiceStars) {
                        }
                        u5Var2.T(true);
                        if (messageObject3 == null) {
                        }
                    }
                });
            }
        });
    }

    public final void b0(long j3, long j10, boolean z10) {
        int i10 = this.a;
        TopicsController topicsController = MessagesController.getInstance(i10).getTopicsController();
        TLRPC.TL_forumTopic findTopic = topicsController.findTopic(j3, j10);
        if (findTopic != null) {
            findTopic.nopaid_messages_exception = z10;
            topicsController.saveTopics(j3);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesFeeUpdated, Long.valueOf(j10));
        }
    }

    public final boolean c(TLObject tLObject, ArrayList arrayList, Runnable runnable) {
        if (arrayList.isEmpty() || o(tLObject) <= 0) {
            return true;
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            int id2 = ((MessageObject) obj).getId();
            hashSet.add(Integer.valueOf(id2));
            if (this.Q.remove(Integer.valueOf(id2))) {
                this.R.put(Integer.valueOf(id2), new tg.r(this, hashSet, runnable, 19));
                z10 = true;
            }
        }
        return !z10;
    }

    public final void c0(int i10, long j3, ArrayList arrayList) {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.a);
        messagesStorage.getStorageQueue().postRunnable(new cg(messagesStorage, j3, arrayList, i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
    
        if (r12.a == r7) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0079, code lost:
    
        if (r4.intValue() >= 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0080, code lost:
    
        if (r2 >= 100) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(MessageObject messageObject) {
        boolean z10;
        i2.f0 f0Var;
        org.telegram.ui.ActionBar.n2 U;
        p5 p5Var;
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return;
        }
        long j3 = message.paid_message_stars;
        if (j3 <= 0 || messageObject.isEphemeral()) {
            return;
        }
        p5 p5Var2 = this.N;
        if (p5Var2 == null || p5Var2.g <= 0 || !p5Var2.m || p5Var2.n || p5Var2.o) {
            if (!org.telegram.ui.Components.d5.d0(this.a, messageObject.getDialogId())) {
                Long l4 = (Long) this.O.get(Long.valueOf(messageObject.getDialogId()));
                if (l4 == null || System.currentTimeMillis() - l4.longValue() <= 5000) {
                    Integer num = (Integer) this.P.get(Long.valueOf(messageObject.getDialogId()));
                    if (num != null) {
                    }
                }
            }
            z10 = false;
            int id2 = messageObject.getId();
            if (z10) {
                this.Q.add(Integer.valueOf(id2));
            }
            long dialogId = messageObject.getDialogId();
            ai.i3 i3Var = new ai.i3(6, this, z10);
            f0Var = new i2.f0(this, z10, id2, 4);
            U = LaunchActivity.U();
            p5Var = this.N;
            if (p5Var != null && (p5Var.o || p5Var.n)) {
                this.N = null;
            }
            if (this.N != null) {
                if (U != null && !U.isRemovingFromStack()) {
                    p5 p5Var3 = this.N;
                    if (p5Var3.b == dialogId) {
                    }
                }
                this.N.a();
                this.N = null;
            }
            if (U != null || U.isRemovingFromStack()) {
                f0Var.run();
            }
            if (this.N == null) {
                this.N = new p5(U, dialogId);
            }
            p5 p5Var4 = this.N;
            jc jcVar = p5Var4.d;
            nc ncVar = p5Var4.e;
            o5 o5Var = p5Var4.p;
            if (p5Var4.n || p5Var4.o) {
                f0Var.run();
                return;
            }
            p5Var4.g++;
            p5Var4.k.add(messageObject);
            p5Var4.h += j3;
            p5Var4.i = i3Var;
            p5Var4.j.add(f0Var);
            if (p5Var4.m && !z10) {
                p5Var4.m = false;
                AndroidUtilities.cancelRunOnUIThread(o5Var);
                pc pcVar = p5Var4.c;
                pcVar.j = 5000;
                pcVar.i(true);
                if (System.currentTimeMillis() - p5Var4.l > 500) {
                    ncVar.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).start();
                } else {
                    ncVar.setAlpha(0.0f);
                    ncVar.setVisibility(8);
                }
            }
            ic icVar = p5Var4.f;
            if (icVar != null && p5Var4.m) {
                icVar.b = 3000L;
                AndroidUtilities.cancelRunOnUIThread(o5Var);
                AndroidUtilities.runOnUIThread(o5Var, 3000L);
            }
            org.telegram.ui.Components.o6 o6Var = jcVar.b;
            int i10 = p5Var4.g;
            o6Var.setText(i10 == 1 ? LocaleController.getString(R.string.PaidMessageSentTitleOne) : LocaleController.formatPluralString("PaidMessageSentTitle", i10, new Object[0]));
            jcVar.c.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("PaidMessageSentSubtitle", Math.max(0, (int) p5Var4.h))));
            jcVar.a.d();
            return;
        }
        z10 = true;
        int id22 = messageObject.getId();
        if (z10) {
        }
        long dialogId2 = messageObject.getDialogId();
        ai.i3 i3Var2 = new ai.i3(6, this, z10);
        f0Var = new i2.f0(this, z10, id22, 4);
        U = LaunchActivity.U();
        p5Var = this.N;
        if (p5Var != null) {
            this.N = null;
        }
        if (this.N != null) {
        }
        if (U != null) {
        }
        f0Var.run();
    }

    public final t5 d0(final MessageObject messageObject, final zn znVar, final long j3, boolean z10, boolean z11, final Long l4) {
        String str;
        long j10;
        final u5 u5Var;
        String str2;
        n5 b10 = n5.b(messageObject);
        int i10 = this.a;
        u5 y3 = y(i10, false);
        Context t10 = t(znVar);
        if (t10 == null) {
            return null;
        }
        str = "";
        if (z11 && y3.e && y3.q(false, false, null).amount <= 0) {
            long a2 = znVar.a();
            if (a2 >= 0) {
                str = UserObject.getForcedFirstName(znVar.getMessagesController().getUser(Long.valueOf(a2)));
            } else {
                TLRPC.Chat chat = znVar.getMessagesController().getChat(Long.valueOf(-a2));
                if (chat != null) {
                    str = chat.title;
                }
            }
            final int i11 = 0;
            new l7(t10, znVar.getResourceProvider(), j3, 5, str, new Runnable(this) { // from class: yh.y4
                public final /* synthetic */ u5 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            this.b.d0(messageObject, znVar, j3, true, true, l4);
                            break;
                        default:
                            this.b.d0(messageObject, znVar, j3, true, true, l4);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        t5 t5Var = this.B;
        if (t5Var == null || !t5Var.a.equals(b10)) {
            t5 t5Var2 = this.B;
            if (t5Var2 != null) {
                t5Var2.b();
            }
            ConnectionsManager.getInstance(i10).getCurrentTime();
            j10 = 0;
            u5Var = this;
            t5 t5Var3 = new t5(u5Var, b10, messageObject, znVar, z10);
            u5Var.B = t5Var3;
            t5Var3.n = l4;
        } else {
            j10 = 0;
            u5Var = this;
        }
        if (u5Var.B.h + j3 > MessagesController.getInstance(i10).starsPaidReactionAmountMax) {
            u5Var.B.b();
            ConnectionsManager.getInstance(i10).getCurrentTime();
            u5Var.B = new t5(u5Var, b10, messageObject, znVar, z10);
        }
        final long j11 = u5Var.B.h + j3;
        if (z11 && y3.e && y3.q(false, false, null).amount < j11) {
            u5Var.B.a();
            long a10 = znVar.a();
            if (a10 >= j10) {
                str2 = UserObject.getForcedFirstName(znVar.getMessagesController().getUser(Long.valueOf(a10)));
            } else {
                TLRPC.Chat chat2 = znVar.getMessagesController().getChat(Long.valueOf(-a10));
                str2 = chat2 != null ? chat2.title : "";
            }
            final int i12 = 1;
            new l7(t10, znVar.getResourceProvider(), j11, 5, str2, new Runnable(u5Var) { // from class: yh.y4
                public final /* synthetic */ u5 b;

                {
                    this.b = u5Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            this.b.d0(messageObject, znVar, j11, true, true, l4);
                            break;
                        default:
                            this.b.d0(messageObject, znVar, j11, true, true, l4);
                            break;
                    }
                }
            }, 0L).show();
            return null;
        }
        t5 t5Var4 = u5Var.B;
        boolean z12 = !(messageObject == null || messageObject.doesPaidReactionExist()) || z10;
        q5 q5Var = t5Var4.p;
        u5 u5Var2 = t5Var4.q;
        int i13 = u5Var2.a;
        jc jcVar = t5Var4.e;
        MessageObject messageObject2 = t5Var4.b;
        if (!t5Var4.i && !t5Var4.j) {
            t5Var4.h += j3;
            System.currentTimeMillis();
            jcVar.c.a();
            jcVar.c.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSentText", (int) t5Var4.h, new Object[0])), true, true);
            if (t5Var4.m) {
                t5Var4.f.b = 5000L;
                AndroidUtilities.cancelRunOnUIThread(q5Var);
                AndroidUtilities.runOnUIThread(q5Var, 5000L);
            }
            if (z12) {
                t5Var4.l = true;
                messageObject2.addPaidReactions((int) j3, true, t5Var4.c());
                u5Var2.g += j3;
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
            } else {
                t5Var4.l = false;
                if (messageObject2.ensurePaidReactionsExist(true)) {
                    t5Var4.k--;
                }
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(messageObject2.getDialogId()), Integer.valueOf(messageObject2.getId()), messageObject2.messageOwner.reactions);
                t5Var4.k += j3;
            }
            jcVar.b.setText(t5Var4.d());
        } else if (BuildVars.DEBUG_PRIVATE_VERSION) {
            throw new RuntimeException("adding more amount to committed reactions");
        }
        t5 t5Var5 = u5Var.B;
        t5Var5.n = l4;
        return t5Var5;
    }

    public final void f(Activity activity, TL_stars.TL_starsTopupOption tL_starsTopupOption, Utilities.Callback2 callback2, TLRPC.InputPeer inputPeer) {
        if (activity == null) {
            return;
        }
        int i10 = this.a;
        if (!MessagesController.getInstance(i10).starsPurchaseAvailable()) {
            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
            if (R == null || R.getContext() == null) {
                e0(activity, null);
                return;
            } else {
                e0(R.getContext(), R.getResourceProvider());
                return;
            }
        }
        boolean z10 = AppGlobalConfig.getInstance(i10).starsSpendTopUpInvoiceDisabled.get() && inputPeer != null;
        if ((!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) || z10) {
            if (!BillingController.getInstance().isReady()) {
                callback2.run(Boolean.FALSE, "INVOICE DISABLED");
                return;
            }
            TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = new TLRPC.TL_inputStorePaymentStarsTopup();
            tL_inputStorePaymentStarsTopup.stars = tL_starsTopupOption.stars;
            tL_inputStorePaymentStarsTopup.currency = tL_starsTopupOption.currency;
            tL_inputStorePaymentStarsTopup.amount = tL_starsTopupOption.amount;
            c5.a aVar = new c5.a();
            aVar.c = "inapp";
            aVar.b = tL_starsTopupOption.store_product;
            c5.q a2 = aVar.a();
            FileLog.d("StarsController.buy starts queryProductDetails");
            BillingController.getInstance().queryProductDetails(Arrays.asList(a2), new a1.d(callback2, tL_inputStorePaymentStarsTopup, tL_starsTopupOption, activity, 21));
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
        JSONObject p5 = ei.k3.p(I(), false);
        if (p5 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p5.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
        ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new ai.t5(this, callback2, tL_inputInvoiceStars, 25));
    }

    public final void f0(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        MessageObject messageObject = (MessageObject) list.get(0);
        long dialogId = messageObject.getDialogId();
        int i10 = this.a;
        if (dialogId >= 0) {
            MessagesController.getInstance(i10).loadFullUser(MessagesController.getInstance(i10).getUser(Long.valueOf(dialogId)), 0, true);
        } else {
            MessagesController.getInstance(i10).loadFullChat(-dialogId, 0, true);
        }
        xc.a0(LaunchActivity.U()).Q(R.raw.error, 36, w7.Q0(TextUtils.concat(LocaleController.formatPluralString("PaidMessagesSendErrorToast1", (int) messageObject.messageOwner.errorAllowedPriceStars, new Object[0]), " ", LocaleController.formatPluralString("PaidMessagesSendErrorToast2", (int) messageObject.messageOwner.errorNewPriceStars, new Object[0])))).j();
    }

    public final void g(final long j3, final TLObject tLObject, final TLRPC.TL_textWithEntities tL_textWithEntities, final Utilities.Callback2 callback2) {
        int i10;
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.f6 I = I();
        boolean z10 = tLObject instanceof TLRPC.TL_premiumGiftOption;
        if ((z10 || (tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) && context2 != null) {
            if (!this.e) {
                r(new org.telegram.messenger.voip.f(this, callback2, j3, tLObject, tL_textWithEntities));
                return;
            }
            if (z10) {
                i10 = ((TLRPC.TL_premiumGiftOption) tLObject).months;
            } else if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                return;
            } else {
                i10 = ((TLRPC.TL_premiumGiftCodeOption) tLObject).months;
            }
            final String name = DialogObject.getName(this.a, j3);
            final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = new TLRPC.TL_inputInvoicePremiumGiftStars();
            tL_inputInvoicePremiumGiftStars.user_id = MessagesController.getInstance(this.a).getInputUser(j3);
            tL_inputInvoicePremiumGiftStars.months = i10;
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputInvoicePremiumGiftStars.flags |= 1;
                tL_inputInvoicePremiumGiftStars.message = tL_textWithEntities;
            }
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p5 = ei.k3.p(I, false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftStars;
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: yh.n4
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                    final u5 u5Var = u5.this;
                    final Utilities.Callback2 callback22 = callback2;
                    final TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars2 = tL_inputInvoicePremiumGiftStars;
                    final Context context3 = context2;
                    final org.telegram.ui.ActionBar.f6 f6Var = I;
                    final String str = name;
                    final long j10 = j3;
                    final TLObject tLObject3 = tLObject;
                    final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.p4
                        @Override // java.lang.Runnable
                        public final void run() {
                            TLObject tLObject4 = tLObject2;
                            boolean z11 = tLObject4 instanceof TLRPC.TL_payments_paymentFormStars;
                            Utilities.Callback2 callback23 = callback22;
                            if (!z11) {
                                TLRPC.TL_error tL_error2 = tL_error;
                                u5.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                                callback23.run(Boolean.FALSE, null);
                                return;
                            }
                            TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject4;
                            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                            tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                            tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars2;
                            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                            int size = arrayList.size();
                            int i11 = 0;
                            long j11 = 0;
                            while (i11 < size) {
                                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                                i11++;
                                j11 += tL_labeledPrice.amount;
                            }
                            u5 u5Var2 = u5.this;
                            ConnectionsManager.getInstance(u5Var2.a).sendRequest(tL_payments_sendStarsForm, new r4(u5Var2, callback23, context3, f6Var, j11, str, j10, tLObject3, tL_textWithEntities2));
                        }
                    });
                }
            });
        }
    }

    public final void g0(LaunchActivity launchActivity, long j3, String str) {
        if (this.e) {
            h0(launchActivity, j3, str);
        } else {
            r(new z21(this, launchActivity, j3, str, 13));
        }
    }

    public final void h(TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, Utilities.Callback2 callback2) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Context context2 = context;
        org.telegram.ui.ActionBar.f6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new org.telegram.messenger.voip.f(this, callback2, tL_payments_paymentFormStarGift, starGift, j3, 12));
            return;
        }
        String name = DialogObject.getName(this.a, j3);
        TLRPC.TL_inputInvoiceStarGiftResale tL_inputInvoiceStarGiftResale = new TLRPC.TL_inputInvoiceStarGiftResale();
        tL_inputInvoiceStarGiftResale.slug = starGift.slug;
        tL_inputInvoiceStarGiftResale.to_id = MessagesController.getInstance(this.a).getInputPeer(j3);
        tL_inputInvoiceStarGiftResale.ton = this.b;
        tL_inputInvoiceStarGiftResale.message = tL_textWithEntities;
        tL_inputInvoiceStarGiftResale.show_name = !z10;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        int i10 = 0;
        JSONObject p5 = ei.k3.p(I, false);
        if (p5 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p5.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftResale;
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftResale;
        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
        int size = arrayList.size();
        long j10 = 0;
        while (i10 < size) {
            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
            i10++;
            j10 += tL_labeledPrice.amount;
            size = size;
            context2 = context2;
        }
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_sendStarsForm, new r4(this, callback2, context2, I, j10, name, tL_payments_paymentFormStarGift, starGift, j3));
    }

    public final void h0(LaunchActivity launchActivity, long j3, String str) {
        if (p().amount < j3 && j3 > 0) {
            new l7(launchActivity, null, j3, 4, str, new u21(21), 0L).show();
            return;
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        pc J = xc.a0(U).J(R.raw.stars_topup, LocaleController.getString(R.string.StarsTopupLinkEnough), LocaleController.getString(R.string.StarsTopupLinkTopupAnyway), new u21(20));
        J.j = 5000;
        J.k(true);
    }

    public final void i(final TL_stars.StarGift starGift, final boolean z10, final boolean z11, final long j3, final TLRPC.TL_textWithEntities tL_textWithEntities, final xh.n4 n4Var) {
        Context context = LaunchActivity.G1;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        final Context context2 = context;
        final org.telegram.ui.ActionBar.f6 I = I();
        if (starGift == null || context2 == null) {
            return;
        }
        if (!this.e) {
            r(new Runnable() { // from class: yh.g4
                @Override // java.lang.Runnable
                public final void run() {
                    u5 u5Var = u5.this;
                    boolean z12 = u5Var.e;
                    xh.n4 n4Var2 = n4Var;
                    if (z12) {
                        u5Var.i(starGift, z10, z11, j3, tL_textWithEntities, n4Var2);
                    } else {
                        u5.e("NO_BALANCE");
                        n4Var2.run(Boolean.FALSE, null);
                    }
                }
            });
            return;
        }
        final String name = DialogObject.getName(this.a, j3);
        final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift = new TLRPC.TL_inputInvoiceStarGift();
        tL_inputInvoiceStarGift.hide_name = z10;
        tL_inputInvoiceStarGift.peer = MessagesController.getInstance(this.a).getInputPeer(j3);
        tL_inputInvoiceStarGift.gift_id = starGift.id;
        tL_inputInvoiceStarGift.include_upgrade = z11;
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputInvoiceStarGift.flags |= 2;
            tL_inputInvoiceStarGift.message = tL_textWithEntities;
        }
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        JSONObject p5 = ei.k3.p(I, false);
        if (p5 != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = p5.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGift;
        ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: yh.h4
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final u5 u5Var = u5.this;
                final xh.n4 n4Var2 = n4Var;
                final TLRPC.TL_inputInvoiceStarGift tL_inputInvoiceStarGift2 = tL_inputInvoiceStarGift;
                final Context context3 = context2;
                final org.telegram.ui.ActionBar.f6 f6Var = I;
                final String str = name;
                final TL_stars.StarGift starGift2 = starGift;
                final boolean z12 = z10;
                final boolean z13 = z11;
                final long j10 = j3;
                final TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_textWithEntities;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.q4
                    @Override // java.lang.Runnable
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        boolean z14 = tLObject2 instanceof TLRPC.TL_payments_paymentFormStarGift;
                        final xh.n4 n4Var3 = n4Var2;
                        if (!z14) {
                            TLRPC.TL_error tL_error2 = tL_error;
                            u5.e(tL_error2 == null ? "NO_PAYMENT_FORM" : tL_error2.text);
                            n4Var3.run(Boolean.FALSE, null);
                            return;
                        }
                        TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) tLObject2;
                        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                        tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStarGift.form_id;
                        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGift2;
                        ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
                        int size = arrayList.size();
                        int i10 = 0;
                        final long j11 = 0;
                        while (i10 < size) {
                            TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                            i10++;
                            j11 += tL_labeledPrice.amount;
                        }
                        final u5 u5Var2 = u5.this;
                        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(u5Var2.a);
                        final Context context4 = context3;
                        final org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                        final String str2 = str;
                        final TL_stars.StarGift starGift3 = starGift2;
                        final boolean z15 = z12;
                        final boolean z16 = z13;
                        final long j12 = j10;
                        final TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_textWithEntities2;
                        connectionsManager.sendRequest(tL_payments_sendStarsForm, new RequestDelegate() { // from class: yh.v4
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject3, final TLRPC.TL_error tL_error3) {
                                final u5 u5Var3 = u5.this;
                                final xh.n4 n4Var4 = n4Var3;
                                final Context context5 = context4;
                                final org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
                                final long j13 = j11;
                                final String str3 = str2;
                                final TL_stars.StarGift starGift4 = starGift3;
                                final boolean z17 = z15;
                                final boolean z18 = z16;
                                final long j14 = j12;
                                final TLRPC.TL_textWithEntities tL_textWithEntities4 = tL_textWithEntities3;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: yh.e4
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i11;
                                        String str4;
                                        SpannableStringBuilder spannableStringBuilder;
                                        ib0 ib0Var;
                                        u5 u5Var4 = u5.this;
                                        TLObject tLObject4 = tLObject3;
                                        TLRPC.TL_error tL_error4 = tL_error3;
                                        xh.n4 n4Var5 = n4Var4;
                                        Context context6 = context5;
                                        org.telegram.ui.ActionBar.f6 f6Var4 = f6Var3;
                                        long j15 = j13;
                                        String str5 = str3;
                                        TL_stars.StarGift starGift5 = starGift4;
                                        boolean z19 = z17;
                                        boolean z20 = z18;
                                        long j16 = j14;
                                        TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_textWithEntities4;
                                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                                        xc X = (R == null || R.visibleDialog != null) ? xc.X() : xc.a0(R);
                                        boolean z21 = tLObject4 instanceof TLRPC.TL_payments_paymentResult;
                                        int i12 = 1;
                                        if (!z21) {
                                            if (tL_error4 != null && "BALANCE_TOO_LOW".equals(tL_error4.text)) {
                                                if (!MessagesController.getInstance(u5Var4.a).starsPurchaseAvailable()) {
                                                    n4Var5.run(Boolean.FALSE, null);
                                                    u5.e0(context6, f6Var4);
                                                    return;
                                                } else {
                                                    boolean[] zArr = {false};
                                                    l7 l7Var = new l7(context6, f6Var4, j15, 6, str5, new xa(u5Var4, zArr, starGift5, z19, z20, j16, tL_textWithEntities5, n4Var5), 0L);
                                                    l7Var.setOnDismissListener(new ei.e0(n4Var5, zArr, 16));
                                                    l7Var.show();
                                                    return;
                                                }
                                            }
                                            if (tL_error4 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error4.text)) {
                                                n4Var5.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                                                return;
                                            }
                                            if (tL_error4 != null && "STARGIFT_USER_USAGE_LIMITED".equals(tL_error4.text)) {
                                                n4Var5.run(Boolean.FALSE, "STARGIFT_USER_USAGE_LIMITED");
                                                return;
                                            }
                                            n4Var5.run(Boolean.FALSE, null);
                                            hg.k0.q(R.string.UnknownErrorCode, new Object[]{tL_error4 != null ? tL_error4.text : "FAILED_SEND_STARS"}, X, R.raw.error, 36);
                                            return;
                                        }
                                        Utilities.stageQueue.postRunnable(new t4(u5Var4, (TLRPC.TL_payments_paymentResult) tLObject4, i12));
                                        u5Var4.D = false;
                                        u5Var4.E = true;
                                        u5Var4.G = 0L;
                                        u5Var4.V();
                                        u5Var4.Q(j16);
                                        u5Var4.T(true);
                                        n4Var5.run(Boolean.TRUE, null);
                                        if (BirthdayController.getInstance(u5Var4.a).contains(j16)) {
                                            i11 = 0;
                                            MessagesController.getInstance(u5Var4.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j16, false).apply();
                                        } else {
                                            i11 = 0;
                                        }
                                        if (starGift5 == null || !starGift5.limited_per_user) {
                                            str4 = str5;
                                            spannableStringBuilder = null;
                                        } else {
                                            int i13 = starGift5.per_user_remains - 1;
                                            starGift5.per_user_remains = i13;
                                            str4 = str5;
                                            spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SentRemainsLimit", Math.max(i11, i13)));
                                        }
                                        if (j16 < 0) {
                                            long j17 = -j16;
                                            TLRPC.ChatFull chatFull = MessagesController.getInstance(u5Var4.a).getChatFull(j17);
                                            if (chatFull != null) {
                                                chatFull.stargifts_count++;
                                                chatFull.flags2 |= 262144;
                                                MessagesController.getInstance(u5Var4.a).putChatFull(chatFull);
                                            }
                                            if (R instanceof ProfileActivity) {
                                                ProfileActivity profileActivity = (ProfileActivity) R;
                                                if (profileActivity.a() == j16) {
                                                    l01 l01Var = profileActivity.O;
                                                    if (l01Var != null) {
                                                        l01Var.v1(true);
                                                        profileActivity.O.Y0(14);
                                                        profileActivity.G4(false);
                                                    }
                                                    xc a02 = xc.a0(R);
                                                    TLRPC.Document document = starGift5.sticker;
                                                    String string = LocaleController.getString(R.string.StarsGiftCompleted);
                                                    if (spannableStringBuilder == null) {
                                                        spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j15, str4));
                                                    }
                                                    a02.s(document, string, spannableStringBuilder).k(false);
                                                }
                                            }
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("chat_id", j17);
                                            bundle.putBoolean("open_gifts", true);
                                            ProfileActivity profileActivity2 = new ProfileActivity(bundle, null);
                                            profileActivity2.whenFullyVisible(new org.telegram.messenger.voip.f(profileActivity2, starGift5, spannableStringBuilder, j15, str4, 13));
                                            R.presentFragment(profileActivity2);
                                        } else if ((R instanceof zn) && ((zn) R).a() == j16) {
                                            xc a03 = xc.a0(R);
                                            TLRPC.Document document2 = starGift5.sticker;
                                            String string2 = LocaleController.getString(R.string.StarsGiftCompleted);
                                            if (spannableStringBuilder == null) {
                                                spannableStringBuilder = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j15, new Object[0]));
                                            }
                                            a03.s(document2, string2, spannableStringBuilder).k(true);
                                        } else {
                                            NotificationCenter notificationCenter = NotificationCenter.getInstance(u5Var4.a);
                                            int i14 = NotificationCenter.closeProfileActivity;
                                            Long valueOf = Long.valueOf(j16);
                                            Boolean bool = Boolean.FALSE;
                                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i14, valueOf, bool);
                                            NotificationCenter.getInstance(u5Var4.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j16), bool);
                                            zn R9 = zn.R9(j16);
                                            R9.whenFullyVisible(new z21(R9, starGift5, spannableStringBuilder, j15, 12));
                                            R.presentFragment(R9);
                                        }
                                        MessagesController.getInstance(u5Var4.a).getMainSettings().edit().putBoolean("show_gift_for_" + j16, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j16, true).apply();
                                        LaunchActivity launchActivity = LaunchActivity.G1;
                                        if (launchActivity == null || (ib0Var = launchActivity.x0) == null) {
                                            return;
                                        }
                                        ib0Var.c(true);
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }

    public final void i0(final long j3, final long j10, boolean z10, final boolean z11) {
        TL_account.toggleNoPaidMessagesException togglenopaidmessagesexception = new TL_account.toggleNoPaidMessagesException();
        int i10 = this.a;
        togglenopaidmessagesexception.user_id = MessagesController.getInstance(i10).getInputUser(j3);
        if (j10 != 0) {
            togglenopaidmessagesexception.parent_peer = MessagesController.getInstance(i10).getInputPeer(j10);
        }
        togglenopaidmessagesexception.refund_charged = z10;
        togglenopaidmessagesexception.require_payment = !z11;
        ConnectionsManager.getInstance(i10).sendRequest(togglenopaidmessagesexception, new RequestDelegate() { // from class: yh.z4
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new kg(u5.this, tLObject, j10, j3, z11));
            }
        });
    }

    public final boolean j() {
        if (!this.b) {
            return false;
        }
        if (di.i.B0()) {
            return true;
        }
        TL_stars.StarsAmount p5 = p();
        return (p5.nanos == 0 && p5.amount == 0) ? false : true;
    }

    public final void j0(String str, TLRPC.ChatInvite chatInvite, Utilities.Callback2 callback2) {
        int i10;
        if (chatInvite != null && chatInvite.subscription_pricing != null) {
            Context context = LaunchActivity.G1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            Context context2 = context;
            org.telegram.ui.ActionBar.f6 I = I();
            long j3 = chatInvite.subscription_pricing.amount;
            if (context2 != null) {
                int i11 = UserConfig.selectedAccount;
                boolean[] zArr = {false};
                g5 g5Var = new g5(this, j3, i11, zArr, callback2, context2, I, chatInvite, str);
                u2.j0 j0Var = new u2.j0(this, zArr, callback2);
                org.telegram.ui.ActionBar.f3 j10 = rk.j(1, context2, I, false);
                LinearLayout f7 = rk.f(context2, 1);
                f7.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(new y6(context2, 40, 0), w7.y5.c(-1.0f, -1));
                v9 v9Var = new v9(context2);
                v9Var.setRoundRadius(AndroidUtilities.dp(80.0f));
                g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
                g9Var.s(chatInvite.color);
                String str2 = chatInvite.title;
                g9Var.A = true;
                g9Var.n = 0;
                g9Var.m = false;
                g9.a(str2, null, null, g9Var.q);
                TLRPC.Photo photo = chatInvite.photo;
                if (photo != null) {
                    v9Var.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.dp(80.0f)), chatInvite.photo), "80_80", g9Var, chatInvite);
                } else {
                    v9Var.setImageDrawable(g9Var);
                }
                frameLayout.addView(v9Var, w7.y5.e(80, 80, 17));
                Drawable drawable = context2.getResources().getDrawable(R.drawable.star_small_outline);
                int i12 = org.telegram.ui.ActionBar.j6.h5;
                drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, I), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = context2.getResources().getDrawable(R.drawable.star_small_inner);
                ImageView imageView = new ImageView(context2);
                imageView.setImageDrawable(drawable);
                frameLayout.addView(imageView, w7.y5.e(26, 26, 17));
                imageView.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView.setTranslationY(AndroidUtilities.dp(26.0f));
                imageView.setScaleX(1.2f);
                imageView.setScaleY(1.2f);
                ImageView imageView2 = new ImageView(context2);
                imageView2.setImageDrawable(drawable2);
                frameLayout.addView(imageView2, w7.y5.e(26, 26, 17));
                imageView2.setTranslationX(AndroidUtilities.dp(26.0f));
                imageView2.setTranslationY(AndroidUtilities.dp(26.0f));
                k7 k7Var = new k7(context2, i11, I);
                w7.a6.a(k7Var);
                k7Var.setOnClickListener(new g6(k7Var, 1));
                frameLayout.addView(k7Var, w7.y5.d(-2, -2.0f, 53, 0.0f, 0.0f, -8.0f, 0.0f));
                f7.addView(frameLayout, w7.y5.q(-1, 117, 7));
                TextView f10 = org.telegram.messenger.l0.f(context2, 1, 20.0f);
                f10.setTypeface(AndroidUtilities.bold());
                int i13 = org.telegram.ui.ActionBar.j6.j5;
                f10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, I));
                rk.l(R.string.StarsSubscribeTitle, f10, 17);
                TextView h = com.google.android.gms.internal.vision.e2.h(f7, f10, w7.y5.t(-2, -2, 1, 0, 8, 0, 0), context2);
                h.setTextSize(1, 14.0f);
                h.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, I));
                TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                int i14 = tL_starsSubscriptionPricing.period;
                if (i14 == 2592000) {
                    i10 = i12;
                    h.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeText", (int) tL_starsSubscriptionPricing.amount, chatInvite.title)));
                } else {
                    i10 = i12;
                    h.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscribeTextTest", (int) tL_starsSubscriptionPricing.amount, chatInvite.title, i14 == 300 ? "5 minutes" : "a minute")));
                }
                h.setMaxWidth(ci.f4.a(h.getText(), h.getPaint()));
                h.setGravity(17);
                f7.addView(h, w7.y5.t(-2, -2, 1, 0, 6, 0, 22));
                if (!TextUtils.isEmpty(chatInvite.about)) {
                    TextView f11 = org.telegram.messenger.l0.f(context2, 1, 14.0f);
                    f11.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, I));
                    f11.setText(Emoji.replaceEmoji(chatInvite.about, f11.getPaint().getFontMetricsInt(), false));
                    f11.setGravity(17);
                    f7.addView(f11, w7.y5.t(-2, -2, 1, 0, 6, 0, 22));
                }
                ci.d dVar = new ci.d(context2, I, true);
                dVar.g(LocaleController.getString(R.string.StarsSubscribeButton), false, true);
                f7.addView(dVar, w7.y5.n(-1, 48));
                n90 n90Var = new n90(context2, I);
                n90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsSubscribeInfo), new di.a(context2, 11)));
                n90Var.setGravity(17);
                n90Var.setTextSize(1, 13.0f);
                n90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, I));
                n90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, I));
                f7.addView(n90Var, w7.y5.t(-1, -2, 49, 14, 14, 14, 6));
                j10.customView = f7;
                dVar.setOnClickListener(new xg.e(g5Var, j10, dVar, 8));
                j10.setOnDismissListener(new ai.g5(j0Var, 14));
                j10.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(i10, I));
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && U != null && !AndroidUtilities.hasDialogOnTop(U)) {
                    j10.makeAttached(U);
                }
                j10.show();
            }
        }
    }

    public final void k0(TL_stars.StarsAmount starsAmount) {
        boolean equals = this.f.equals(starsAmount);
        int i10 = this.a;
        if (!equals) {
            this.f = starsAmount;
            this.g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        } else if (this.g != 0) {
            this.g = 0L;
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starBalanceUpdated, new Object[0]);
        }
    }

    public final void l0(final MessageObject messageObject, final long j3, final Runnable runnable, final boolean z10) {
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia;
        if (messageObject == null) {
            runnable.run();
            return;
        }
        final long dialogId = messageObject.getDialogId();
        final int id2 = messageObject.getId();
        TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia2 = (TLRPC.TL_messageMediaPaidMedia) messageObject.messageOwner.media;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        int i10 = this.a;
        tL_messages_editMessage.peer = MessagesController.getInstance(i10).getInputPeer(dialogId);
        int i11 = tL_messages_editMessage.flags;
        tL_messages_editMessage.flags = 32768 | i11;
        tL_messages_editMessage.schedule_date = messageObject.messageOwner.date;
        tL_messages_editMessage.id = id2;
        tL_messages_editMessage.flags = i11 | 49152;
        TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = new TLRPC.TL_inputMediaPaidMedia();
        tL_inputMediaPaidMedia.stars_amount = j3;
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editMessage, new RequestDelegate() { // from class: yh.e5
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new bg(u5.this, tLObject, runnable, tL_error, z10, dialogId, id2, messageObject, j3));
            }
        });
    }

    public final TL_stars.SavedStarGift n(long j3) {
        TL_stars.StarGift starGift;
        int i10 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.L;
            if (i10 >= longSparseArray.size()) {
                return null;
            }
            l5 l5Var = (l5) longSparseArray.valueAt(i10);
            for (int i11 = 0; i11 < l5Var.l.size(); i11++) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) l5Var.l.get(i11);
                if (savedStarGift != null && (starGift = savedStarGift.gift) != null && starGift.id == j3) {
                    return savedStarGift;
                }
            }
            i10++;
        }
    }

    public final TL_stars.StarsAmount p() {
        return q(true, false, null);
    }

    public final TL_stars.StarsAmount q(boolean z10, boolean z11, Runnable runnable) {
        if (((!this.e || System.currentTimeMillis() - this.c > 60000) && !this.d) || z11) {
            this.d = true;
            TL_stars.TL_payments_getStarsStatus tL_payments_getStarsStatus = new TL_stars.TL_payments_getStarsStatus();
            tL_payments_getStarsStatus.ton = this.b;
            tL_payments_getStarsStatus.peer = new TLRPC.TL_inputPeerSelf();
            ConnectionsManager.getInstance(this.a).sendRequest(tL_payments_getStarsStatus, new bj1(11, this, runnable));
        }
        if (!z10 || this.g <= 0) {
            return this.f;
        }
        zf.a m10 = zf.a.m(this.f);
        return zf.a.g(Math.max(0L, m10.a() - this.g), m10.a).o();
    }

    public final void r(Runnable runnable) {
        q(true, false, runnable);
    }

    public final zf.a s() {
        zf.a l4 = zf.a.l(p());
        if (l4 == null) {
            return zf.a.i(0L, this.b ? zf.b.b : zf.b.a);
        }
        return l4;
    }

    public final ArrayList u() {
        if (this.k || this.l) {
            return this.m;
        }
        this.k = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiftOptions(), new w4(this, 3));
        return this.m;
    }

    public final ArrayList v() {
        if (this.n || this.o) {
            return this.p;
        }
        this.n = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsGiveawayOptions(), new w4(this, 4));
        return this.p;
    }

    public final ArrayList z() {
        if (this.h || this.i) {
            return this.j;
        }
        this.h = true;
        ConnectionsManager.getInstance(this.a).sendRequest(new TL_stars.TL_payments_getStarsTopupOptions(), new w4(this, 2));
        return this.j;
    }
}
