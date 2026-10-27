package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_feed;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zj0 extends org.telegram.ui.ActionBar.r2 implements qg0, NotificationCenter.NotificationCenterDelegate, rh.d {
    public fi.d E;
    public Boolean F;
    public vj0 G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public ValueAnimator L;
    public float M;
    public String N;
    public sj0 O;
    public hh.c a;
    public final xj0[] b;
    public final ArrayList c;
    public final HashSet d;
    public final HashSet e;
    public boolean f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public fi.h1 v;
    public yj0 w;
    public int x;
    public di.i4 y;

    public zj0() {
        super(null);
        this.b = new xj0[]{new xj0(), new xj0(), new xj0()};
        this.c = new ArrayList();
        this.d = new HashSet();
        this.e = new HashSet();
        this.N = "";
    }

    public static void V(zj0 zj0Var) {
        HashSet hashSet = zj0Var.d;
        if (zj0Var.f || hashSet.isEmpty() || hashSet.equals(zj0Var.e)) {
            return;
        }
        zj0Var.f = true;
        zj0Var.p0(true);
        TL_feed.TL_feed_setInterestCategories tL_feed_setInterestCategories = new TL_feed.TL_feed_setInterestCategories();
        tL_feed_setInterestCategories.category_ids.addAll(hashSet);
        zj0Var.getConnectionsManager().bindRequestToGuid(zj0Var.getConnectionsManager().sendRequest(tL_feed_setInterestCategories, new l10(15, zj0Var, tL_feed_setInterestCategories)), zj0Var.classGuid);
    }

    public static void W(zj0 zj0Var, ImageView imageView) {
        if (zj0Var.H) {
            return;
        }
        org.telegram.ui.ActionBar.b6 titleTextView = zj0Var.actionBar.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.addOnLayoutChangeListener(new uj0(titleTextView.getTranslationX(), titleTextView.getLeft()));
        }
        zj0Var.actionBar.setBackButtonDrawable(null);
        imageView.setAlpha(1.0f);
    }

    public static void Y(zj0 zj0Var, boolean z10) {
        if (zj0Var.H == z10) {
            return;
        }
        zj0Var.H = z10;
        ImageView backButton = zj0Var.actionBar.getBackButton();
        boolean z11 = (backButton == null || backButton.getVisibility() == 8) ? false : true;
        if (z10 && !z11) {
            org.telegram.ui.ActionBar.b6 titleTextView = zj0Var.actionBar.getTitleTextView();
            if (titleTextView != null) {
                titleTextView.addOnLayoutChangeListener(new uj0(titleTextView.getTranslationX(), titleTextView.getLeft()));
            }
            zj0Var.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
            backButton = zj0Var.actionBar.getBackButton();
            backButton.setAlpha(0.0f);
        }
        if (backButton != null) {
            backButton.animate().cancel();
            backButton.animate().alpha(z10 ? 1.0f : 0.0f).setDuration(150L).withEndAction(z10 ? null : new kb0(24, zj0Var, backButton)).start();
        }
        ValueAnimator valueAnimator = zj0Var.L;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        zj0Var.w.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(zj0Var.M, z10 ? 1.0f : 0.0f);
        zj0Var.L = ofFloat;
        ofFloat.addUpdateListener(new b3(zj0Var, 16));
        zj0Var.L.addListener(new k50(zj0Var, 5));
        zj0Var.L.setDuration(220L);
        zj0Var.L.setInterpolator(org.telegram.ui.Components.ds.h);
        zj0Var.L.start();
        if (z10) {
            return;
        }
        zj0Var.n0("");
    }

    public static void a0(zj0 zj0Var) {
        if (zj0Var.H && TextUtils.isEmpty(zj0Var.N)) {
            zj0Var.actionBar.g(true);
        }
    }

    public static void d0(View view, boolean z10) {
        view.animate().cancel();
        if (z10) {
            view.setVisibility(0);
        }
        view.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(220L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(z10 ? null : new hh(2, view)).start();
    }

    public static void e0(org.telegram.ui.Components.s71 s71Var) {
        if (s71Var == null) {
            return;
        }
        s71Var.getViewTreeObserver().addOnPreDrawListener(new i7(s71Var, 3));
        s71Var.invalidate();
    }

    public static void o0(xj0 xj0Var) {
        org.telegram.ui.Components.s71 s71Var = xj0Var.d;
        if (s71Var != null) {
            s71Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.qg0
    public final void D() {
        boolean z10 = this.I;
        xj0[] xj0VarArr = this.b;
        if (z10) {
            e0(xj0VarArr[2].d);
            return;
        }
        fi.h1 h1Var = this.v;
        if (h1Var != null) {
            e0(xj0VarArr[h1Var.getCurrentPosition()].d);
        }
    }

    @Override // rh.d
    public final void M() {
        int i10 = this.K;
        if (this.J == i10) {
            return;
        }
        this.J = i10;
        p0(false);
    }

    @Override // rh.d
    public final View O() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2, org.telegram.ui.qg0
    public final boolean T(MotionEvent motionEvent, boolean z10) {
        ValueAnimator valueAnimator;
        if (!this.I) {
            fi.h1 h1Var = this.v;
            if (h1Var == null || ((valueAnimator = h1Var.S) != null && valueAnimator.isRunning())) {
                return false;
            }
            this.v.getLocationOnScreen(new int[2]);
            if (motionEvent.getRawY() >= r0[1]) {
                if (this.v.canScrollHorizontally(z10 ? 1 : -1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c0(xj0 xj0Var, TLRPC.Message message, int i10) {
        int i11 = 0;
        if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.peer_id != null) {
            String str = MessageObject.getDialogId(message) + ":" + message.id;
            HashSet hashSet = xj0Var.b;
            ArrayList arrayList = xj0Var.a;
            if (hashSet.add(str)) {
                MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
                if (xj0Var == this.b[2]) {
                    messageObject.setQuery(this.N);
                }
                if (message.grouped_id != 0) {
                    long dialogId = messageObject.getDialogId();
                    long j10 = messageObject.messageOwner.grouped_id;
                    while (true) {
                        IdentityHashMap identityHashMap = xj0Var.c;
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        Object obj = arrayList.get(i11);
                        if (obj instanceof MessageObject) {
                            MessageObject messageObject2 = (MessageObject) obj;
                            if (messageObject2.messageOwner.grouped_id == j10 && messageObject2.getDialogId() == dialogId) {
                                ArrayList arrayList2 = (ArrayList) identityHashMap.get(messageObject2);
                                if (arrayList2 == null) {
                                    arrayList2 = org.telegram.messenger.t.l(messageObject2);
                                }
                                arrayList2.add(messageObject);
                                Collections.sort(arrayList2, new dv(3));
                                if (!TextUtils.isEmpty(messageObject2.messageOwner.message) || TextUtils.isEmpty(messageObject.messageOwner.message)) {
                                    messageObject = messageObject2;
                                } else {
                                    identityHashMap.remove(messageObject2);
                                    arrayList.set(i11, messageObject);
                                }
                                identityHashMap.put(messageObject, arrayList2);
                                return true;
                            }
                        }
                        i11++;
                    }
                }
                if (i10 < 0) {
                    arrayList.add(messageObject);
                    return true;
                }
                arrayList.add(i10, messageObject);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.NewsTitle));
        this.actionBar.setCastShadows(false);
        int i10 = 15;
        this.actionBar.setActionBarMenuOnItemClick(new c20(this, i10));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        k0 k0Var = new k0(this, context, i10);
        st stVar = new st(this, 25);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(k0Var, stVar);
        int i11 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.f7.i(i11, k0Var, getResourceProvider());
        this.fragmentView = k0Var;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.h1.d.add(this);
        }
        fi.h1 h1Var = new fi.h1(this, context, 4);
        this.v = h1Var;
        h1Var.setAllowDisallowInterceptTouch(false);
        this.v.setAdapter(new bi.e5(this, context, 1));
        yj0 yj0Var = new yj0(this, context);
        this.w = yj0Var;
        k0Var.addView(yj0Var, org.telegram.ui.Components.kb1.h(-1, 36.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        k0Var.addView(this.v, org.telegram.ui.Components.kb1.h(-1, -1.0f, 119, 0.0f, 42.0f, 0.0f, -42.0f));
        vj0 vj0Var = new vj0(this, context);
        this.G = vj0Var;
        vj0Var.setImportantForAccessibility(2);
        k0Var.addView(this.G, org.telegram.ui.Components.kb1.h(-1, 12.0f, 48, 0.0f, 42.0f, 0.0f, 0.0f));
        xj0[] xj0VarArr = this.b;
        xj0VarArr[2].d = h0(context, 2);
        xj0VarArr[2].d.setAlpha(0.0f);
        xj0VarArr[2].d.setVisibility(8);
        k0Var.addView(xj0VarArr[2].d, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        hh.c cVar = new hh.c();
        this.a = cVar;
        cVar.a(getThemedColor(i11));
        ch.b bVar = new ch.b(cVar);
        di.i4 i4Var = new di.i4(context);
        this.y = i4Var;
        eh.d c10 = bVar.c(i4Var, new fh.b(i11, this.resourceProvider), false);
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(22.0f));
        this.y.setBackground(c10);
        org.telegram.ui.Components.kb1.c(this.y, 0.02f, 1.2f);
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.E = dVar;
        dVar.setUseWrapContent(true);
        this.E.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.E.setRoundRadius(19);
        this.E.i(LocaleController.getString(R.string.NewsSaveInterests), false, true);
        this.E.setShowZero(true);
        this.E.setStateListAnimator(null);
        this.y.addView(this.E, org.telegram.ui.Components.kb1.i(-2, -1, 17));
        this.y.setOnClickListener(new z50(this, 12));
        k0Var.addView(this.y, org.telegram.ui.Components.kb1.i(-2, 60, 81));
        p0(false);
        k0();
        setBulletinDelegate(new d9(this, 6));
        return k0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.channelNewsUpdated) {
            l0(1, true);
            return;
        }
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            if (((Boolean) objArr[2]).booleanValue() || ((Integer) objArr[3]).intValue() != 0 || longValue >= 0) {
                return;
            }
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-longValue));
            if (!ChatObject.isChannelAndNotMegaGroup(chat) || ChatObject.isNotInChat(chat)) {
                return;
            }
            xj0 xj0Var = this.b[1];
            if (xj0Var.i) {
                if (xj0Var.h && xj0Var.m) {
                    return;
                }
                ArrayList arrayList = (ArrayList) objArr[1];
                org.telegram.ui.Components.s71 s71Var = xj0Var.d;
                boolean z10 = (s71Var == null || s71Var.canScrollVertically(-1)) ? false : true;
                int size = arrayList.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    TLRPC.Message message = ((MessageObject) obj).messageOwner;
                    if (message != null && message.id > 0 && !(message instanceof TLRPC.TL_messageService) && c0(xj0Var, message, 0)) {
                        i12++;
                    }
                }
                if (i12 > 0) {
                    o0(xj0Var);
                    if (z10) {
                        xj0Var.d.v0(0);
                    }
                }
            }
        }
    }

    public final FrameLayout f0(Context context, int i10) {
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
        frameLayout.addView(linearLayout, org.telegram.ui.Components.kb1.i(-1, -2, 17));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        linearLayout.addView(y9Var, org.telegram.ui.Components.kb1.u(130, 130, 1));
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(y9Var, "UtyaDuck", "😎", "130_130");
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(i10 == 1 ? R.string.NewsCaughtUpTitleScroll : i10 == 2 ? R.string.NewsCaughtUpTitleHeadlines : R.string.NewsCaughtUpTitle));
        textView.setTextSize(20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, getResourceProvider());
        textView.setGravity(17);
        TextView e = org.telegram.messenger.wh.e(linearLayout, textView, org.telegram.ui.Components.kb1.o(0.0f, 16.0f, 0.0f, 0.0f, -1, -2), context);
        e.setText(LocaleController.getString(i10 == 1 ? R.string.NewsCaughtUpSubtitleScroll : i10 == 2 ? R.string.NewsCaughtUpSubtitleHeadlines : R.string.NewsCaughtUpSubtitle));
        e.setTextSize(14.0f);
        org.telegram.ui.ActionBar.f7.V(e, org.telegram.ui.ActionBar.y6.y6, getResourceProvider());
        e.setGravity(17);
        linearLayout.addView(e, org.telegram.ui.Components.kb1.o(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        return frameLayout;
    }

    public final bi.mc g0(Context context) {
        org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(context);
        bk0Var.f(R.raw.utyan_empty, 130, 130, null);
        bk0Var.d();
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SearchEmptyViewTitle2));
        textView.setTextSize(20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, getResourceProvider());
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        textView2.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        textView2.setTextSize(14.0f);
        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.y6, getResourceProvider());
        textView2.setGravity(17);
        bi.mc mcVar = new bi.mc(context, textView, textView2, bk0Var);
        mcVar.setOrientation(1);
        mcVar.setGravity(17);
        mcVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(12.0f));
        mcVar.addView(bk0Var, org.telegram.ui.Components.kb1.x(130, 130, 1, 0, 0, 0, 16));
        mcVar.addView(textView, org.telegram.ui.Components.kb1.r(-1, -2));
        mcVar.addView(textView2, org.telegram.ui.Components.kb1.o(0.0f, 8.0f, 0.0f, 0.0f, -1, -2));
        return mcVar;
    }

    public final org.telegram.ui.Components.s71 h0(Context context, int i10) {
        xj0 xj0Var = this.b[i10];
        org.telegram.ui.Components.s71 s71Var = new org.telegram.ui.Components.s71(context, this.currentAccount, this.classGuid, false, new bi.v0(this, i10, xj0Var, context, 8), new i2.z(this, i10, xj0Var, 14), null, this.resourceProvider);
        s71Var.setClipToPadding(false);
        s71Var.setPadding(0, 0, 0, i0(i10));
        s71Var.j(new wj0(this, i10, s71Var, xj0Var));
        return s71Var;
    }

    public final int i0(int i10) {
        int dp = AndroidUtilities.dp((j0() ? 60 : 0) + 72) + this.x;
        return i10 == 2 ? Math.max(dp, this.J) : AndroidUtilities.dp(42.0f) + dp;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0() {
        if (this.f) {
            return true;
        }
        HashSet hashSet = this.d;
        return (hashSet.isEmpty() || hashSet.equals(this.e)) ? false : true;
    }

    @Override // rh.d
    public final void k(r0.k1 k1Var) {
        int i10 = k1Var.a.f(8).d;
        if (this.J == i10) {
            return;
        }
        this.J = i10;
        p0(false);
    }

    public final void k0() {
        if (this.n || this.h) {
            return;
        }
        this.n = true;
        this.r = false;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(new TL_feed.TL_feed_getInterestCategories(), new rj0(this, 0)), this.classGuid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0(int i10, boolean z10) {
        TL_feed.TL_feed_getForYou tL_feed_getForYou;
        org.telegram.ui.Components.wz wzVar;
        xj0 xj0Var = this.b[i10];
        if (this.h) {
            return;
        }
        if (xj0Var.h) {
            xj0Var.l |= z10;
            return;
        }
        if (z10 || !xj0Var.j) {
            if (i10 == 2 && TextUtils.isEmpty(this.N)) {
                return;
            }
            if (i10 != 2 || z10 || (this.O == null && xj0Var.i)) {
                String str = this.N;
                xj0Var.m = z10;
                xj0Var.n = z10;
                if (z10 && (wzVar = xj0Var.e) != null) {
                    wzVar.setRefreshing(true);
                }
                xj0Var.h = true;
                xj0Var.k = false;
                o0(xj0Var);
                if (i10 == 0 || i10 == 2) {
                    TL_feed.TL_feed_getForYou tL_feed_getForYou2 = new TL_feed.TL_feed_getForYou();
                    tL_feed_getForYou2.limit = 30;
                    if (i10 == 2) {
                        tL_feed_getForYou2.query = str;
                    }
                    tL_feed_getForYou = tL_feed_getForYou2;
                } else {
                    TL_feed.TL_feed_getFeed tL_feed_getFeed = new TL_feed.TL_feed_getFeed();
                    tL_feed_getFeed.limit = 30;
                    tL_feed_getFeed.offset_position = z10 ? null : xj0Var.o;
                    tL_feed_getForYou = tL_feed_getFeed;
                }
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_feed_getForYou, new org.telegram.messenger.zb(this, xj0Var, i10, str, z10)), this.classGuid);
            }
        }
    }

    public final void m0(xj0 xj0Var) {
        org.telegram.ui.Components.s71 s71Var;
        int i10;
        int i11;
        int i12;
        if (this.h || (s71Var = xj0Var.d) == null) {
            return;
        }
        int L0 = s71Var.f3.L0();
        int N0 = xj0Var.d.f3.N0();
        if (L0 < 0) {
            return;
        }
        TLRPC.Message message = null;
        while (L0 <= N0) {
            org.telegram.ui.Components.u61 G = xj0Var.d.g3.G(L0);
            if (G != null) {
                Object obj = G.G;
                if (obj instanceof MessageObject) {
                    TLRPC.Message message2 = ((MessageObject) obj).messageOwner;
                    if (message == null || (i11 = message2.date) > (i12 = message.date) || (i11 == i12 && message2.id > message.id)) {
                        message = message2;
                    }
                }
            }
            L0++;
        }
        if (message == null) {
            return;
        }
        TL_feed.FeedPosition feedPosition = new TL_feed.FeedPosition();
        int i13 = message.date;
        feedPosition.date = i13;
        feedPosition.peer = message.peer_id;
        int i14 = message.id;
        feedPosition.id = i14;
        TL_feed.FeedPosition feedPosition2 = xj0Var.p;
        if (feedPosition2 == null || i13 > (i10 = feedPosition2.date) || (i13 == i10 && i14 > feedPosition2.id)) {
            xj0Var.p = feedPosition;
            tj0 tj0Var = xj0Var.q;
            if (tj0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(tj0Var);
            }
            tj0 tj0Var2 = new tj0(this, xj0Var, 1);
            xj0Var.q = tj0Var2;
            AndroidUtilities.runOnUIThread(tj0Var2, 500L);
        }
    }

    public final void n0(String str) {
        if (str.equals(this.N)) {
            return;
        }
        this.N = str;
        xj0[] xj0VarArr = this.b;
        xj0 xj0Var = xj0VarArr[2];
        sj0 sj0Var = this.O;
        if (sj0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sj0Var);
        }
        this.O = null;
        xj0Var.a.clear();
        xj0Var.b.clear();
        xj0Var.c.clear();
        xj0Var.f = null;
        xj0Var.i = false;
        xj0Var.k = false;
        xj0Var.j = false;
        xj0Var.l = false;
        o0(xj0Var);
        boolean z10 = this.H && !TextUtils.isEmpty(this.N);
        if (this.I != z10) {
            this.I = z10;
            org.telegram.ui.Components.s71 s71Var = xj0VarArr[2].d;
            boolean z11 = !z10;
            d0(this.v, z11);
            d0(this.G, z11);
            d0(s71Var, z10);
            if (z10) {
                s71Var.v0(0);
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sj0 sj0Var2 = new sj0(this, 2);
        this.O = sj0Var2;
        AndroidUtilities.runOnUIThread(sj0Var2, 500L);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (!this.H) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        this.actionBar.g(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        if (!super.onFragmentCreate()) {
            return false;
        }
        getNotificationCenter().addWeakObserver(this, NotificationCenter.channelNewsUpdated);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.didReceiveNewMessages);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        this.h = true;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            launchActivity.h1.d.remove(this);
        }
        sj0 sj0Var = this.O;
        if (sj0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sj0Var);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.channelNewsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        setBulletinDelegate(null);
        super.onFragmentDestroy();
        for (xj0 xj0Var : this.b) {
            tj0 tj0Var = xj0Var.q;
            if (tj0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(tj0Var);
                xj0Var.q.run();
            }
            xj0Var.d = null;
            xj0Var.e = null;
            xj0Var.f = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            hh.c cVar = this.a;
            if (cVar != null) {
                cVar.a(getThemedColor(org.telegram.ui.ActionBar.y6.d6));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0(boolean z10) {
        int i02;
        boolean j02 = j0();
        if (this.y != null) {
            Boolean bool = this.F;
            if (bool == null || bool.booleanValue() != j02) {
                this.F = Boolean.valueOf(j02);
                this.y.animate().cancel();
                if (!z10) {
                    this.y.setAlpha(j02 ? 1.0f : 0.0f);
                    this.y.setScaleX(j02 ? 1.0f : 0.7f);
                    this.y.setScaleY(j02 ? 1.0f : 0.7f);
                    this.y.setTranslationY(j02 ? 0.0f : AndroidUtilities.dp(10.0f));
                    this.y.setVisibility(j02 ? 0 : 8);
                } else if (j02) {
                    if (this.y.getVisibility() != 0) {
                        this.y.setAlpha(0.0f);
                        this.y.setScaleX(0.7f);
                        this.y.setScaleY(0.7f);
                        this.y.setTranslationY(AndroidUtilities.dp(10.0f));
                    }
                    this.y.setVisibility(0);
                    this.y.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(320L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(null).start();
                } else {
                    this.y.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).translationY(AndroidUtilities.dp(10.0f)).setDuration(320L).setInterpolator(org.telegram.ui.Components.ds.h).withEndAction(new sj0(this, 1)).start();
                }
            }
            this.y.setEnabled(!this.f);
            this.E.setLoading(this.f);
            fi.d dVar = this.E;
            HashSet hashSet = this.d;
            dVar.b(hashSet.size(), z10);
            this.y.setContentDescription(LocaleController.getString(R.string.NewsSaveInterests) + ", " + hashSet.size());
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.y.getLayoutParams();
            layoutParams.bottomMargin = AndroidUtilities.dp(72.0f) + this.x;
            this.y.setLayoutParams(layoutParams);
        }
        int i10 = 0;
        while (true) {
            xj0[] xj0VarArr = this.b;
            if (i10 >= xj0VarArr.length) {
                return;
            }
            xj0 xj0Var = xj0VarArr[i10];
            if (xj0Var.d != null && xj0Var.d.getPaddingBottom() != (i02 = i0(i10))) {
                xj0Var.d.setPadding(0, 0, 0, i02);
                ViewGroup viewGroup = xj0Var.f;
                if (viewGroup != null) {
                    viewGroup.requestLayout();
                }
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.qg0
    public final void s() {
        boolean z10 = this.I;
        xj0[] xj0VarArr = this.b;
        if (z10) {
            xj0VarArr[2].d.y0(0);
            return;
        }
        fi.h1 h1Var = this.v;
        if (h1Var == null || xj0VarArr[h1Var.getCurrentPosition()].d == null) {
            return;
        }
        xj0VarArr[this.v.getCurrentPosition()].d.y0(0);
    }

    @Override // org.telegram.ui.qg0
    public final /* synthetic */ hh.d y() {
        return null;
    }

    @Override // rh.d
    public final /* synthetic */ void t() {
    }
}
