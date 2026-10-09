package xh;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.w7;
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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.n91;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.x5;
import w7.z5;
import yh.d5;
import yh.e5;
import yh.m5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class s2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap T = new HashMap();
    public final TextView E;
    public final dq F;
    public final FrameLayout G;
    public int H;
    public p80 I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public int M;
    public final u1 N;
    public final me.b O;
    public int P;
    public int Q;
    public w7 R;
    public ViewGroup S;
    public final org.telegram.ui.ActionBar.n2 a;
    public final int b;
    public final long c;
    public final e5 d;
    public final d5 e;
    public final e6 f;
    public final x1 h;
    public final n91 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder v;
    public final ci.d w;
    public int x;
    public final LinearLayout y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s2(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, e6 e6Var) {
        super(context);
        int i11;
        String str;
        this.H = -1;
        rs0 rs0Var = (rs0) this;
        this.N = new u1(rs0Var, 2);
        this.O = new me.b(0, new w1(rs0Var), hs.h, 380L, true);
        this.Q = AndroidUtilities.displaySize.y;
        this.a = n2Var;
        this.b = i10;
        if (DialogObject.isEncryptedDialog(j3)) {
            TLRPC.EncryptedChat l4 = org.telegram.messenger.q.l(MessagesController.getInstance(i10), j3);
            if (l4 != null) {
                this.c = l4.user_id;
            } else {
                this.c = j3;
            }
        } else {
            this.c = j3;
        }
        m5.y(i10, false).Q(this.c);
        int i12 = 1;
        e5 G = m5.y(i10, false).G(this.c, true);
        this.d = G;
        d5 F = m5.y(i10, false).F(this.c, true);
        this.e = F;
        F.g = G;
        G.o = true;
        if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).v1) {
            G.g = 4;
            G.e = true;
            G.i(true);
        } else if (!G.e || G.g != 783) {
            G.g = 783;
            G.e = true;
            G.i(true);
        }
        G.a();
        this.f = e6Var;
        x1 x1Var = new x1(rs0Var, context, n2Var);
        this.h = x1Var;
        x1Var.setAllowDisallowInterceptTouch(true);
        x1Var.setAdapter(new y1(rs0Var, i10, e6Var));
        addView(x1Var, x5.e(-1, -1, 119));
        n91 n10 = x1Var.n(10, true);
        this.n = n10;
        n10.g(i6.Gh, i6.G6, i6.Eh, i6.Hh, i6.s8);
        n10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        n10.setClipToPadding(false);
        n10.r = 12;
        n10.setPreTabClick(new w1(rs0Var));
        n10.setOnTabLongClick(new org.telegram.ui.Components.e2(rs0Var, i10, n2Var, context, e6Var, 5));
        addView(n10, x5.e(-1, 42, 48));
        fh.c cVar = new fh.c();
        int i13 = i6.d6;
        cVar.a(i6.w0(i13, e6Var));
        ah.c cVar2 = new ah.c(cVar);
        ai.x5 x5Var = new ai.x5(context);
        ch.d c10 = cVar2.c(x5Var, new dh.b(i13, e6Var), false);
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(22.0f));
        x5Var.setBackground(c10);
        z5.b(x5Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e7 = x5.e(-1, 60, 87);
        e7.bottomMargin += AndroidUtilities.navigationBarHeight;
        addView(frameLayout, e7);
        frameLayout.addView(x5Var, x5.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.G = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.y = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(i6.Z(i6.w0(i6.i6, e6Var), 24, 24));
        dq dqVar = new dq(context, 24, e6Var);
        this.F = dqVar;
        dqVar.b(i6.h7, i6.j7, i6.k7);
        dqVar.setDrawUnchecked(true);
        dqVar.a(false, false);
        dqVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(dqVar, x5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.E = textView;
        bi.o(i6.j5, e6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, x5.t(-2, -2, 16, 9, 0, 0, 0));
        x5Var.addView(linearLayout, x5.a(38.0f, 0.0f, 6.0f, 0.0f, 6.0f, -2, 17));
        z5.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new sa(rs0Var, n2Var, i10, 21));
        Boolean bool = G.h;
        if (bool != null) {
            dqVar.a(bool.booleanValue(), false);
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.c));
        boolean z10 = this.c < 0 || !(user == null || UserObject.isUserSelf(user) || UserObject.isBot(user));
        StringBuilder sb2 = new StringBuilder("G ");
        if (z10) {
            long j10 = this.c;
            if (j10 >= 0) {
                str = LocaleController.formatString(R.string.ProfileGiftsSendUser, DialogObject.getShortName(j10));
                sb2.append(str);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
                spannableStringBuilder.setSpan(new er(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.q.g(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new er(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.v = spannableStringBuilder2;
                ci.d dVar = new ci.d(context, e6Var, true);
                this.w = dVar;
                dVar.setUseWrapContent(true);
                dVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                dVar.setRoundRadius(AndroidUtilities.dp(19.0f));
                dVar.g(spannableStringBuilder, false, true);
                dVar.setStateListAnimator(null);
                x5Var.addView(dVar, x5.e(-2, -1, 17));
                x5Var.setOnClickListener(new zr0(rs0Var, z10, i10, i12));
                dVar.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(d() ? 0 : 8);
                this.x = 60;
                addView(frameLayout2, x5.e(-1, 200, 87));
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
        spannableStringBuilder3.setSpan(new er(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(org.telegram.messenger.q.g(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new er(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.v = spannableStringBuilder22;
        ci.d dVar2 = new ci.d(context, e6Var, true);
        this.w = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar2.setRoundRadius(AndroidUtilities.dp(19.0f));
        dVar2.g(spannableStringBuilder3, false, true);
        dVar2.setStateListAnimator(null);
        x5Var.addView(dVar2, x5.e(-2, -1, 17));
        x5Var.setOnClickListener(new zr0(rs0Var, z10, i10, i12));
        dVar2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(d() ? 0 : 8);
        this.x = 60;
        addView(frameLayout2, x5.e(-1, 200, 87));
        m();
        n();
    }

    public static void j(org.telegram.ui.ActionBar.f1 f1Var, e5 e5Var, Runnable runnable, int i10) {
        f1Var.setOnClickListener(new sa(e5Var, i10, runnable, 22));
        f1Var.setOnLongClickListener(new ab(e5Var, i10, runnable));
    }

    public final void a() {
        e5 e5Var;
        o2 currentPage = getCurrentPage();
        if (currentPage == null || (e5Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i10 = e5Var.d;
        new m4(this.a, this.c, i10, new ei.q4(this, i10, currentPage, 5)).show();
    }

    public final boolean b() {
        d5 d5Var = this.e;
        return d5Var.h() && d5Var.d().size() < MessagesController.getInstance(this.b).config.stargiftsCollectionsLimit.get();
    }

    public final boolean c() {
        long j3 = this.c;
        int i10 = this.b;
        return j3 >= 0 ? j3 == 0 || j3 == UserConfig.getInstance(i10).getClientUserId() : ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j3)), 5);
    }

    public final boolean d() {
        return this.c < 0 && this.d.h != null;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.y;
        ci.d dVar = this.w;
        long j3 = this.c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() != j3) {
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
            if (((Long) objArr[0]).longValue() != j3) {
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
        x1 x1Var = this.h;
        if (x1Var == null || this.n == null) {
            return;
        }
        x1Var.o(z10);
        e();
    }

    public final boolean g() {
        if (this.L) {
            return true;
        }
        o2 currentPage = getCurrentPage();
        return currentPage != null && currentPage.n;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - org.telegram.messenger.q.B(this.x, Math.max(AndroidUtilities.dp(240.0f), this.Q) + (-r0.getTop()), 1);
        if (this.Q < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.Q, AndroidUtilities.dp(this.x));
        }
        return (int) (AndroidUtilities.dp(this.x) - translationY);
    }

    public e5 getCurrentList() {
        o2 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public qm0 getCurrentListView() {
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public o2 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (o2) currentView;
    }

    public int getGiftsCount() {
        int i10;
        e5 e5Var;
        int i11;
        o2 currentPage = getCurrentPage();
        e5 e5Var2 = this.d;
        if (currentPage == null || (e5Var = currentPage.e) == e5Var2) {
            if (e5Var2 != null && (i10 = e5Var2.n) > 0) {
                return i10;
            }
        } else if (e5Var != null && (i11 = e5Var.n) > 0) {
            return i11;
        }
        long j3 = this.c;
        int i12 = this.b;
        if (j3 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j3);
            if (userFull != null) {
                return userFull.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(-j3);
        if (chatFull != null) {
            return chatFull.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long j3 = 0;
        e5 e5Var = this.d;
        if (e5Var != null && !e5Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < e5Var.l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) e5Var.l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.id));
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.id));
                    i10++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        x1 x1Var = this.h;
        float f7 = 0.0f;
        if (x1Var.getViewPages() != null) {
            for (View view : x1Var.getViewPages()) {
                if (view instanceof o2) {
                    f7 = (((o2) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f7;
                }
            }
        }
        return f7;
    }

    public float getTabsVisibility() {
        n91 n91Var = this.n;
        if (n91Var != null) {
            return n91Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        k80 k80Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        e6 e6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
        if (str != null) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        a2 a2Var = new a2(this, context, e6Var);
        a2Var.lineYFix = true;
        a2Var.setOnEditorActionListener(new b2(a2Var, callback, b2VarArr, currentFocus));
        MediaDataController.getInstance(this.b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        a2Var.setTextSize(1, 18.0f);
        a2Var.setTextColor(i6.w0(i6.j5, e6Var));
        a2Var.setHintColor(i6.w0(i6.Xh, e6Var));
        a2Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        a2Var.setFocusable(true);
        a2Var.setInputType(147457);
        a2Var.setLineColors(i6.w0(i6.k6, e6Var), i6.w0(i6.l6, e6Var), i6.w0(i6.p7, e6Var));
        a2Var.setImeOptions(6);
        a2Var.setBackgroundDrawable(null);
        a2Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        a2Var.addTextChangedListener(new c2(a2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        a2Var.setText(str);
        linearLayout.addView(a2Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.a.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.k(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new qg.x1(16, a2Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xa.b(2));
        b2VarArr[0] = alertDialog$Builder.a;
        p80 p80Var = this.I;
        if (p80Var != null && (k80Var = p80Var.m) != null) {
            k80Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.a.getClassGuid());
        b2VarArr[0].setOnDismissListener(new ei.t0(this, a2Var, findActivity, 6));
        b2VarArr[0].setOnShowListener(new hg.s(3, a2Var));
        b2VarArr[0].show();
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        b2Var.h0 = false;
        b2Var.d(-1);
        a2Var.setSelection(a2Var.getText().length());
    }

    public final void i() {
        o2 currentPage = getCurrentPage();
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
            d5 d5Var = this.e;
            if (i11 < d5Var.d().size()) {
                e5 e7 = (i11 < 0 || i11 >= d5Var.d().size()) ? null : d5Var.e(((TL_stars.TL_starGiftCollection) d5Var.d().get(i11)).collection_id);
                if (e7 != null) {
                    return e7.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        xb xbVar;
        x1 x1Var = this.h;
        if (x1Var == null) {
            return;
        }
        if (x1Var.getCurrentPosition() == x1Var.getNextPosition()) {
            nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * (k(x1Var.getCurrentPosition()) ? 1.0f : 0.0f);
        } else {
            nextPositionAlpha = ((x1Var.getNextPositionAlpha() * (k(x1Var.getNextPosition()) ? 1.0f : 0.0f)) + (x1Var.getCurrentPositionAlpha() * (k(x1Var.getCurrentPosition()) ? 1.0f : 0.0f))) * (AndroidUtilities.dp(68.0f) + 2);
        }
        FrameLayout frameLayout = this.r;
        float B = nextPositionAlpha + org.telegram.messenger.q.B(this.x, (-frameLayout.getTop()) + this.Q, 1);
        boolean z10 = this.Q > AndroidUtilities.dp(184.0f);
        me.b bVar = this.O;
        bVar.a(z10, true);
        float f7 = bVar.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f7);
        this.G.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
        frameLayout.setTranslationY(lerp - this.P);
        frameLayout.setAlpha(f7);
        frameLayout.setVisibility(f7 <= 0.0f ? 4 : 0);
        this.w.g((!this.e.h() || x1Var.getPositionAnimated() < 0.5f) ? this.s : this.v, true, true);
        tc tcVar = tc.w;
        if (tcVar == null || (xbVar = tcVar.e) == null) {
            return;
        }
        xbVar.updatePosition();
    }

    public final void m() {
        ci.d dVar = this.w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = i6.Oh;
        e6 e6Var = this.f;
        dVar.setBackground(i6.c0(dp, ((rs0) this).U.V0(i6.w0(i10, e6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    o2 o2Var = (o2) view;
                    e6 e6Var2 = o2Var.c;
                    if (o2Var.s != null) {
                        o2Var.w.setTextColor(i6.w0(i6.G6, e6Var2));
                        TextView textView = o2Var.x;
                        int i11 = i6.Oh;
                        textView.setTextColor(i6.w0(i11, e6Var2));
                        o2Var.x.setBackground(i6.Z(i6.m1(0.1f, i6.w0(i11, e6Var2)), 4, 4));
                    } else {
                        o2Var.F.setTextColor(i6.w0(i6.G6, e6Var2));
                        o2Var.G.setTextColor(i6.w0(i6.y6, e6Var2));
                        o2Var.H.j();
                    }
                }
            }
        }
        this.E.setTextColor(i6.w0(i6.j5, e6Var));
        this.y.setBackground(i6.Z(i6.w0(i6.i6, e6Var), 24, 24));
    }

    public final void n() {
        boolean z10 = !this.e.d().isEmpty() || b();
        x1 x1Var = this.h;
        if (x1Var.getViewPages() != null) {
            for (View view : x1Var.getViewPages()) {
                if (view instanceof o2) {
                    ((o2) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f7;
        n91 n91Var = this.n;
        if (n91Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        n91Var.setTranslationY(min);
        n91Var.setScaleX(lerp);
        n91Var.setScaleY(lerp);
        x1 x1Var = this.h;
        if (x1Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : x1Var.getViewPages()) {
                if (view instanceof o2) {
                    f7 += ((o2) view).I ? 1.0f : 0.0f;
                }
            }
        } else {
            f7 = 0.0f;
        }
        n91Var.setAlpha(w7.o.a(f7, 0.0f, 1.0f) * clamp01);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        o2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.o = true;
            e5Var.a();
        }
        d5 d5Var = this.e;
        if (d5Var != null) {
            d5Var.j = true;
            d5Var.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        o2 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        e5 e5Var = this.d;
        if (e5Var != null) {
            e5Var.o = false;
        }
        d5 d5Var = this.e;
        if (d5Var != null) {
            d5Var.j = false;
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
                if (view instanceof o2) {
                    o2 o2Var = (o2) view;
                    j2 j2Var = o2Var.f;
                    int paddingTop = j2Var.getPaddingTop();
                    j2Var.setPadding(AndroidUtilities.dp(9.0f), this.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(j2Var, new v1(o2Var, paddingTop - j2Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        o2 currentPage = getCurrentPage();
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
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new s1(profileActivity, 0));
            }
        }
        if (z10) {
            return;
        }
        u1 u1Var = this.N;
        AndroidUtilities.cancelRunOnUIThread(u1Var);
        AndroidUtilities.runOnUIThread(u1Var);
    }

    public void setVisibleHeight(int i10) {
        this.Q = i10;
        l();
        x1 x1Var = this.h;
        if (x1Var != null) {
            for (View view : x1Var.getViewPages()) {
                if (view instanceof o2) {
                    ((o2) view).setVisibleHeight(this.Q);
                }
            }
        }
    }
}
