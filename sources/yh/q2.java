package yh;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.i5;
import di.v7;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.a6;
import zh.e5;
import zh.f5;
import zh.n5;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public abstract class q2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap T = new HashMap();
    public final TextView E;
    public final aq F;
    public final FrameLayout G;
    public int H;
    public m80 I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public int M;
    public final s1 N;
    public final ne.b O;
    public int P;
    public int Q;
    public v7 R;
    public ViewGroup S;
    public final org.telegram.ui.ActionBar.m2 a;
    public final int b;
    public final long c;
    public final f5 d;
    public final e5 e;
    public final c6 f;
    public final v1 h;
    public final j91 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder v;
    public final di.d w;
    public int x;
    public final LinearLayout y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q2(int i10, long j10, Context context, org.telegram.ui.ActionBar.m2 m2Var, c6 c6Var) {
        super(context);
        int i11;
        String str;
        this.H = -1;
        ns0 ns0Var = (ns0) this;
        this.N = new s1(ns0Var, 2);
        this.O = new ne.b(0, new u1(ns0Var), es.h, 380L, true);
        this.Q = AndroidUtilities.displaySize.y;
        this.a = m2Var;
        this.b = i10;
        if (DialogObject.isEncryptedDialog(j10)) {
            TLRPC.EncryptedChat m10 = org.telegram.messenger.q.m(MessagesController.getInstance(i10), j10);
            if (m10 != null) {
                this.c = m10.user_id;
            } else {
                this.c = j10;
            }
        } else {
            this.c = j10;
        }
        n5.y(i10, false).Q(this.c);
        int i12 = 1;
        f5 G = n5.y(i10, false).G(this.c, true);
        this.d = G;
        e5 F = n5.y(i10, false).F(this.c, true);
        this.e = F;
        F.g = G;
        G.o = true;
        if ((m2Var instanceof ProfileActivity) && ((ProfileActivity) m2Var).v1) {
            G.g = 4;
            G.e = true;
            G.i(true);
        } else if (!G.e || G.g != 783) {
            G.g = 783;
            G.e = true;
            G.i(true);
        }
        G.a();
        this.f = c6Var;
        v1 v1Var = new v1(ns0Var, context, m2Var);
        this.h = v1Var;
        v1Var.setAllowDisallowInterceptTouch(true);
        v1Var.setAdapter(new w1(ns0Var, i10, c6Var));
        addView(v1Var, a6.e(-1, -1, 119));
        j91 n10 = v1Var.n(10, true);
        this.n = n10;
        n10.g(g6.Gh, g6.G6, g6.Eh, g6.Hh, g6.s8);
        n10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        n10.setClipToPadding(false);
        n10.r = 12;
        n10.setPreTabClick(new u1(ns0Var));
        n10.setOnTabLongClick(new org.telegram.ui.Components.e2(ns0Var, i10, m2Var, context, c6Var, 5));
        addView(n10, a6.e(-1, 42, 48));
        gh.c cVar = new gh.c();
        int i13 = g6.d6;
        cVar.a(g6.w0(i13, c6Var));
        bh.b bVar = new bh.b(cVar);
        i5 i5Var = new i5(context);
        dh.d c10 = bVar.c(i5Var, new eh.b(i13, c6Var), false);
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(22.0f));
        i5Var.setBackground(c10);
        w7.c6.b(i5Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e = a6.e(-1, 60, 87);
        e.bottomMargin += AndroidUtilities.navigationBarHeight;
        addView(frameLayout, e);
        frameLayout.addView(i5Var, a6.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.G = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.y = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(g6.Z(g6.w0(g6.i6, c6Var), 24, 24));
        aq aqVar = new aq(context, 24, c6Var);
        this.F = aqVar;
        aqVar.b(g6.h7, g6.j7, g6.k7);
        aqVar.setDrawUnchecked(true);
        aqVar.a(false, false);
        aqVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(aqVar, a6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.E = textView;
        yh.n(g6.j5, c6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, a6.t(-2, -2, 16, 9, 0, 0, 0));
        i5Var.addView(linearLayout, a6.a(38.0f, 0.0f, 6.0f, 0.0f, 6.0f, -2, 17));
        w7.c6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new sa(ns0Var, m2Var, i10, 21));
        Boolean bool = G.h;
        if (bool != null) {
            aqVar.a(bool.booleanValue(), false);
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.c));
        boolean z10 = this.c < 0 || !(user == null || UserObject.isUserSelf(user) || UserObject.isBot(user));
        StringBuilder sb2 = new StringBuilder("G ");
        if (z10) {
            long j11 = this.c;
            if (j11 >= 0) {
                str = LocaleController.formatString(R.string.ProfileGiftsSendUser, DialogObject.getShortName(j11));
                sb2.append(str);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
                spannableStringBuilder.setSpan(new br(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.q.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new br(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.v = spannableStringBuilder2;
                di.d dVar = new di.d(context, c6Var, true);
                this.w = dVar;
                dVar.setUseWrapContent(true);
                dVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                dVar.setRoundRadius(AndroidUtilities.dp(19.0f));
                dVar.g(spannableStringBuilder, false, true);
                dVar.setStateListAnimator(null);
                i5Var.addView(dVar, a6.e(-2, -1, 17));
                i5Var.setOnClickListener(new wr0(ns0Var, z10, i10, i12));
                dVar.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(d() ? 0 : 8);
                this.x = 60;
                addView(frameLayout2, a6.e(-1, 200, 87));
                m();
                n();
            }
            i11 = R.string.ProfileGiftsSendChannel;
        } else {
            i11 = R.string.ProfileGiftsSend;
        }
        str = LocaleController.getString(i11);
        sb2.append(str);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder3.setSpan(new br(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(org.telegram.messenger.q.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new br(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.v = spannableStringBuilder22;
        di.d dVar2 = new di.d(context, c6Var, true);
        this.w = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar2.setRoundRadius(AndroidUtilities.dp(19.0f));
        dVar2.g(spannableStringBuilder3, false, true);
        dVar2.setStateListAnimator(null);
        i5Var.addView(dVar2, a6.e(-2, -1, 17));
        i5Var.setOnClickListener(new wr0(ns0Var, z10, i10, i12));
        dVar2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(d() ? 0 : 8);
        this.x = 60;
        addView(frameLayout2, a6.e(-1, 200, 87));
        m();
        n();
    }

    public static void j(org.telegram.ui.ActionBar.e1 e1Var, f5 f5Var, Runnable runnable, int i10) {
        e1Var.setOnClickListener(new sa(f5Var, i10, runnable, 22));
        e1Var.setOnLongClickListener(new ab(f5Var, i10, runnable));
    }

    public final void a() {
        f5 f5Var;
        m2 currentPage = getCurrentPage();
        if (currentPage == null || (f5Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i10 = f5Var.d;
        new k4(this.a, this.c, i10, new fi.r4(this, i10, currentPage, 5)).show();
    }

    public final boolean b() {
        e5 e5Var = this.e;
        return e5Var.h() && e5Var.d().size() < MessagesController.getInstance(this.b).config.stargiftsCollectionsLimit.get();
    }

    public final boolean c() {
        long j10 = this.c;
        int i10 = this.b;
        return j10 >= 0 ? j10 == 0 || j10 == UserConfig.getInstance(i10).getClientUserId() : ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public final boolean d() {
        return this.c < 0 && this.d.h != null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.y;
        di.d dVar = this.w;
        long j10 = this.c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() != j10) {
                return;
            }
            dVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.x = 60;
            Boolean bool = this.d.h;
            if (bool != null) {
                this.F.a(bool.booleanValue(), true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() != j10) {
                return;
            }
            f(true);
            n();
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            dVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.x = 60;
            setVisibleHeight(this.Q);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.M <= 0) {
            return;
        }
        ArrayList d = this.e.d();
        int i10 = 0;
        while (true) {
            if (i10 >= d.size()) {
                i10 = -1;
                tL_starGiftCollection = null;
                break;
            } else {
                if (((TL_stars.TL_starGiftCollection) d.get(i10)).collection_id == this.M) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (i10 < 0 || tL_starGiftCollection == null) {
            return;
        }
        this.M = 0;
        this.n.d(tL_starGiftCollection.collection_id, i10 + 1);
    }

    public final void f(boolean z10) {
        v1 v1Var = this.h;
        if (v1Var == null || this.n == null) {
            return;
        }
        v1Var.o(z10);
        e();
    }

    public final boolean g() {
        if (this.L) {
            return true;
        }
        m2 currentPage = getCurrentPage();
        return currentPage != null && currentPage.n;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - org.telegram.messenger.q.D(this.x, Math.max(AndroidUtilities.dp(240.0f), this.Q) + (-r0.getTop()), 1);
        if (this.Q < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.Q, AndroidUtilities.dp(this.x));
        }
        return (int) (AndroidUtilities.dp(this.x) - translationY);
    }

    public f5 getCurrentList() {
        m2 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public mm0 getCurrentListView() {
        m2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public m2 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (m2) currentView;
    }

    public int getGiftsCount() {
        int i10;
        f5 f5Var;
        int i11;
        m2 currentPage = getCurrentPage();
        f5 f5Var2 = this.d;
        if (currentPage == null || (f5Var = currentPage.e) == f5Var2) {
            if (f5Var2 != null && (i10 = f5Var2.n) > 0) {
                return i10;
            }
        } else if (f5Var != null && (i11 = f5Var.n) > 0) {
            return i11;
        }
        long j10 = this.c;
        int i12 = this.b;
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
            if (userFull != null) {
                return userFull.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(-j10);
        if (chatFull != null) {
            return chatFull.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long j10 = 0;
        f5 f5Var = this.d;
        if (f5Var != null && !f5Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < f5Var.l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) f5Var.l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.id));
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.id));
                    i10++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        v1 v1Var = this.h;
        float f7 = 0.0f;
        if (v1Var.getViewPages() != null) {
            for (View view : v1Var.getViewPages()) {
                if (view instanceof m2) {
                    f7 = (((m2) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f7;
                }
            }
        }
        return f7;
    }

    public float getTabsVisibility() {
        j91 j91Var = this.n;
        if (j91Var != null) {
            return j91Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        h80 h80Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        c6 c6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (str != null) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        y1 y1Var = new y1(this, context, c6Var);
        y1Var.lineYFix = true;
        y1Var.setOnEditorActionListener(new z1(y1Var, callback, a2VarArr, currentFocus));
        MediaDataController.getInstance(this.b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        y1Var.setTextSize(1, 18.0f);
        y1Var.setTextColor(g6.w0(g6.j5, c6Var));
        y1Var.setHintColor(g6.w0(g6.Xh, c6Var));
        y1Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        y1Var.setFocusable(true);
        y1Var.setInputType(147457);
        y1Var.setLineColors(g6.w0(g6.k6, c6Var), g6.w0(g6.l6, c6Var), g6.w0(g6.p7, c6Var));
        y1Var.setImeOptions(6);
        y1Var.setBackgroundDrawable(null);
        y1Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        y1Var.addTextChangedListener(new a2(y1Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        y1Var.setText(str);
        linearLayout.addView(y1Var, a6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.a.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.k(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new org.telegram.ui.web.c0(20, y1Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new t0.a(28));
        a2VarArr[0] = alertDialog$Builder.a;
        m80 m80Var = this.I;
        if (m80Var != null && (h80Var = m80Var.m) != null) {
            h80Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.a.getClassGuid());
        a2VarArr[0].setOnDismissListener(new fi.s0(this, y1Var, findActivity, 6));
        a2VarArr[0].setOnShowListener(new ig.r(3, y1Var));
        a2VarArr[0].show();
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        a2Var.h0 = false;
        a2Var.d(-1);
        y1Var.setSelection(y1Var.getText().length());
    }

    public final void i() {
        m2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i10) {
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            e5 e5Var = this.e;
            if (i11 < e5Var.d().size()) {
                f5 e = (i11 < 0 || i11 >= e5Var.d().size()) ? null : e5Var.e(((TL_stars.TL_starGiftCollection) e5Var.d().get(i11)).collection_id);
                if (e != null) {
                    return e.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        wb wbVar;
        v1 v1Var = this.h;
        if (v1Var == null) {
            return;
        }
        if (v1Var.getCurrentPosition() == v1Var.getNextPosition()) {
            nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * (k(v1Var.getCurrentPosition()) ? 1.0f : 0.0f);
        } else {
            nextPositionAlpha = ((v1Var.getNextPositionAlpha() * (k(v1Var.getNextPosition()) ? 1.0f : 0.0f)) + (v1Var.getCurrentPositionAlpha() * (k(v1Var.getCurrentPosition()) ? 1.0f : 0.0f))) * (AndroidUtilities.dp(68.0f) + 2);
        }
        FrameLayout frameLayout = this.r;
        float D = nextPositionAlpha + org.telegram.messenger.q.D(this.x, (-frameLayout.getTop()) + this.Q, 1);
        boolean z10 = this.Q > AndroidUtilities.dp(184.0f);
        ne.b bVar = this.O;
        bVar.a(z10, true);
        float f7 = bVar.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + D, D, f7);
        this.G.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
        frameLayout.setTranslationY(lerp - this.P);
        frameLayout.setAlpha(f7);
        frameLayout.setVisibility(f7 <= 0.0f ? 4 : 0);
        this.w.g((!this.e.h() || v1Var.getPositionAnimated() < 0.5f) ? this.s : this.v, true, true);
        sc scVar = sc.w;
        if (scVar == null || (wbVar = scVar.e) == null) {
            return;
        }
        wbVar.updatePosition();
    }

    public final void m() {
        di.d dVar = this.w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = g6.Oh;
        c6 c6Var = this.f;
        dVar.setBackground(g6.c0(dp, ((ns0) this).U.V0(g6.w0(i10, c6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    m2 m2Var = (m2) view;
                    c6 c6Var2 = m2Var.c;
                    if (m2Var.s != null) {
                        m2Var.w.setTextColor(g6.w0(g6.G6, c6Var2));
                        TextView textView = m2Var.x;
                        int i11 = g6.Oh;
                        textView.setTextColor(g6.w0(i11, c6Var2));
                        m2Var.x.setBackground(g6.Z(g6.m1(0.1f, g6.w0(i11, c6Var2)), 4, 4));
                    } else {
                        m2Var.F.setTextColor(g6.w0(g6.G6, c6Var2));
                        m2Var.G.setTextColor(g6.w0(g6.y6, c6Var2));
                        m2Var.H.j();
                    }
                }
            }
        }
        this.E.setTextColor(g6.w0(g6.j5, c6Var));
        this.y.setBackground(g6.Z(g6.w0(g6.i6, c6Var), 24, 24));
    }

    public final void n() {
        boolean z10 = !this.e.d().isEmpty() || b();
        v1 v1Var = this.h;
        if (v1Var.getViewPages() != null) {
            for (View view : v1Var.getViewPages()) {
                if (view instanceof m2) {
                    ((m2) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f7;
        j91 j91Var = this.n;
        if (j91Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        j91Var.setTranslationY(min);
        j91Var.setScaleX(lerp);
        j91Var.setScaleY(lerp);
        v1 v1Var = this.h;
        if (v1Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : v1Var.getViewPages()) {
                if (view instanceof m2) {
                    f7 += ((m2) view).I ? 1.0f : 0.0f;
                }
            }
        } else {
            f7 = 0.0f;
        }
        j91Var.setAlpha(w7.s.a(f7, 0.0f, 1.0f) * clamp01);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        m2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.o = true;
            f5Var.a();
        }
        e5 e5Var = this.e;
        if (e5Var != null) {
            e5Var.j = true;
            e5Var.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m2 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.o = false;
        }
        e5 e5Var = this.e;
        if (e5Var != null) {
            e5Var.j = false;
        }
    }

    public abstract void p(boolean z10);

    public void setButtonOffset(int i10) {
        if (this.P != i10) {
            this.P = i10;
            l();
        }
    }

    public void setPaddingTop(int i10) {
        if (this.K != i10) {
            this.K = i10;
            for (View view : this.h.getViewPages()) {
                if (view instanceof m2) {
                    m2 m2Var = (m2) view;
                    h2 h2Var = m2Var.f;
                    int paddingTop = h2Var.getPaddingTop();
                    h2Var.setPadding(AndroidUtilities.dp(9.0f), this.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(h2Var, new t1(m2Var, paddingTop - h2Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        m2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.setReordering(z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.L == z10) {
            return;
        }
        this.L = z10;
        p(g());
        this.n.setReordering(z10);
        if (z10) {
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new q1(profileActivity, 0));
            }
        }
        if (z10) {
            return;
        }
        s1 s1Var = this.N;
        AndroidUtilities.cancelRunOnUIThread(s1Var);
        AndroidUtilities.runOnUIThread(s1Var);
    }

    public void setVisibleHeight(int i10) {
        this.Q = i10;
        l();
        v1 v1Var = this.h;
        if (v1Var != null) {
            for (View view : v1Var.getViewPages()) {
                if (view instanceof m2) {
                    ((m2) view).setVisibleHeight(this.Q);
                }
            }
        }
    }
}
