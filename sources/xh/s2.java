package xh;

import ai.w5;
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
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.eb;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.x5;
import w7.z5;
import yh.k5;
import yh.l5;
import yh.t5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public abstract class s2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap T = new HashMap();
    public final TextView E;
    public final op F;
    public final FrameLayout G;
    public int H;
    public o70 I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public int M;
    public final u1 N;
    public final le.c O;
    public int P;
    public int Q;
    public w7 R;
    public ViewGroup S;
    public final org.telegram.ui.ActionBar.n2 a;
    public final int b;
    public final long c;
    public final l5 d;
    public final k5 e;
    public final d6 f;
    public final x1 h;
    public final g81 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder v;
    public final ci.d w;
    public int x;
    public final LinearLayout y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s2(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, d6 d6Var) {
        super(context);
        int i11;
        String str;
        this.H = -1;
        nr0 nr0Var = (nr0) this;
        this.N = new u1(nr0Var, 2);
        this.O = new le.c(0, new w1(nr0Var), rr.h, 380L, true);
        this.Q = AndroidUtilities.displaySize.y;
        this.a = n2Var;
        this.b = i10;
        if (DialogObject.isEncryptedDialog(j3)) {
            TLRPC.EncryptedChat l4 = org.telegram.messenger.z0.l(MessagesController.getInstance(i10), j3);
            if (l4 != null) {
                this.c = l4.user_id;
            } else {
                this.c = j3;
            }
        } else {
            this.c = j3;
        }
        t5.y(i10, false).Q(this.c);
        int i12 = 1;
        l5 G = t5.y(i10, false).G(this.c, true);
        this.d = G;
        k5 F = t5.y(i10, false).F(this.c, true);
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
        this.f = d6Var;
        x1 x1Var = new x1(nr0Var, context, n2Var);
        this.h = x1Var;
        x1Var.setAllowDisallowInterceptTouch(true);
        x1Var.setAdapter(new y1(nr0Var, i10, d6Var));
        addView(x1Var, x5.e(-1, -1, 119));
        g81 n10 = x1Var.n(10, true);
        this.n = n10;
        int i13 = h6.Gh;
        int i14 = h6.G6;
        int i15 = h6.Eh;
        int i16 = h6.Hh;
        int i17 = h6.s8;
        n10.P = i13;
        n10.Q = i14;
        n10.R = i15;
        n10.S = i16;
        n10.T = i17;
        n10.O.setColor(h6.v0(i13, n10.j0));
        n10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        n10.setClipToPadding(false);
        n10.r = 12;
        n10.setPreTabClick(new w1(nr0Var));
        n10.setOnTabLongClick(new org.telegram.ui.Components.e2(nr0Var, i10, n2Var, context, d6Var, 5));
        addView(n10, x5.e(-1, 42, 48));
        fh.c cVar = new fh.c();
        int i18 = h6.d6;
        cVar.a(h6.v0(i18, d6Var));
        ah.c cVar2 = new ah.c(cVar);
        w5 w5Var = new w5(context);
        ch.d c10 = cVar2.c(w5Var, new dh.b(i18, d6Var), false);
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(22.0f));
        w5Var.setBackground(c10);
        z5.b(w5Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e = x5.e(-1, 60, 87);
        e.bottomMargin += AndroidUtilities.navigationBarHeight;
        addView(frameLayout, e);
        frameLayout.addView(w5Var, x5.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.G = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.y = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(h6.Y(h6.v0(h6.i6, d6Var), 24, 24));
        op opVar = new op(context, 24, d6Var);
        this.F = opVar;
        opVar.b(h6.h7, h6.j7, h6.k7);
        opVar.setDrawUnchecked(true);
        opVar.a(false, false);
        opVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(opVar, x5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.E = textView;
        ul.o(h6.j5, d6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, x5.t(-2, -2, 16, 9, 0, 0, 0));
        w5Var.addView(linearLayout, x5.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        z5.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new wa(nr0Var, n2Var, i10, 19));
        Boolean bool = G.h;
        if (bool != null) {
            opVar.a(bool.booleanValue(), false);
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
                spannableStringBuilder.setSpan(new pq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.z0.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new pq(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.v = spannableStringBuilder2;
                ci.d dVar = new ci.d(context, d6Var, true);
                this.w = dVar;
                dVar.setUseWrapContent(true);
                dVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                dVar.setRoundRadius(AndroidUtilities.dp(19.0f));
                dVar.g(spannableStringBuilder, false, true);
                dVar.setStateListAnimator(null);
                w5Var.addView(dVar, x5.e(-2, -1, 17));
                w5Var.setOnClickListener(new uq0(nr0Var, z10, i10, i12));
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
        spannableStringBuilder3.setSpan(new pq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(org.telegram.messenger.z0.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new pq(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.v = spannableStringBuilder22;
        ci.d dVar2 = new ci.d(context, d6Var, true);
        this.w = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar2.setRoundRadius(AndroidUtilities.dp(19.0f));
        dVar2.g(spannableStringBuilder3, false, true);
        dVar2.setStateListAnimator(null);
        w5Var.addView(dVar2, x5.e(-2, -1, 17));
        w5Var.setOnClickListener(new uq0(nr0Var, z10, i10, i12));
        dVar2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(d() ? 0 : 8);
        this.x = 60;
        addView(frameLayout2, x5.e(-1, 200, 87));
        m();
        n();
    }

    public static void j(org.telegram.ui.ActionBar.f1 f1Var, l5 l5Var, Runnable runnable, int i10) {
        f1Var.setOnClickListener(new wa(l5Var, i10, runnable, 20));
        f1Var.setOnLongClickListener(new eb(l5Var, i10, runnable));
    }

    public final void a() {
        l5 l5Var;
        o2 currentPage = getCurrentPage();
        if (currentPage == null || (l5Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i10 = l5Var.d;
        new m4(this.a, this.c, i10, new ei.r4(this, i10, currentPage, 5)).show();
    }

    public final boolean b() {
        k5 k5Var = this.e;
        return k5Var.h() && k5Var.d().size() < MessagesController.getInstance(this.b).config.stargiftsCollectionsLimit.get();
    }

    public final boolean c() {
        int i10 = this.b;
        long j3 = this.c;
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
        float translationY = this.r.getTranslationY() - org.telegram.messenger.z0.B(this.x, Math.max(AndroidUtilities.dp(240.0f), this.Q) + (-r0.getTop()), 1);
        if (this.Q < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.Q, AndroidUtilities.dp(this.x));
        }
        return (int) (AndroidUtilities.dp(this.x) - translationY);
    }

    public l5 getCurrentList() {
        o2 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public ml0 getCurrentListView() {
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
        l5 l5Var;
        int i11;
        o2 currentPage = getCurrentPage();
        l5 l5Var2 = this.d;
        if (currentPage == null || (l5Var = currentPage.e) == l5Var2) {
            if (l5Var2 != null && (i10 = l5Var2.n) > 0) {
                return i10;
            }
        } else if (l5Var != null && (i11 = l5Var.n) > 0) {
            return i11;
        }
        int i12 = this.b;
        long j3 = this.c;
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
        l5 l5Var = this.d;
        if (l5Var != null && !l5Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < l5Var.l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) l5Var.l.get(i11)).gift.getDocument();
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
        g81 g81Var = this.n;
        if (g81Var != null) {
            return g81Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        j70 j70Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        d6 d6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        if (str != null) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        a2 a2Var = new a2(this, context, d6Var);
        a2Var.lineYFix = true;
        a2Var.setOnEditorActionListener(new b2(a2Var, callback, b2VarArr, currentFocus));
        MediaDataController.getInstance(this.b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        a2Var.setTextSize(1, 18.0f);
        a2Var.setTextColor(h6.v0(h6.j5, d6Var));
        a2Var.setHintColor(h6.v0(h6.Xh, d6Var));
        a2Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        a2Var.setFocusable(true);
        a2Var.setInputType(147457);
        a2Var.setLineColors(h6.v0(h6.k6, d6Var), h6.v0(h6.l6, d6Var), h6.v0(h6.p7, d6Var));
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
        alertDialog$Builder.k(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new tg.d(11, a2Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new v3.d(10));
        b2VarArr[0] = alertDialog$Builder.a;
        o70 o70Var = this.I;
        if (o70Var != null && (j70Var = o70Var.m) != null) {
            j70Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.a.getClassGuid());
        b2VarArr[0].setOnDismissListener(new ei.t0(this, a2Var, findActivity, 6));
        b2VarArr[0].setOnShowListener(new hg.t(3, a2Var));
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
            k5 k5Var = this.e;
            if (i11 < k5Var.d().size()) {
                l5 e = (i11 < 0 || i11 >= k5Var.d().size()) ? null : k5Var.e(((TL_stars.TL_starGiftCollection) k5Var.d().get(i11)).collection_id);
                if (e != null) {
                    return e.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        ub ubVar;
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
        float B = nextPositionAlpha + org.telegram.messenger.z0.B(this.x, (-frameLayout.getTop()) + this.Q, 1);
        boolean z10 = this.Q > AndroidUtilities.dp(184.0f);
        le.c cVar = this.O;
        cVar.a(z10, true);
        float f7 = cVar.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f7);
        this.G.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
        frameLayout.setTranslationY(lerp - this.P);
        frameLayout.setAlpha(f7);
        frameLayout.setVisibility(f7 <= 0.0f ? 4 : 0);
        this.w.g((!this.e.h() || x1Var.getPositionAnimated() < 0.5f) ? this.s : this.v, true, true);
        qc qcVar = qc.w;
        if (qcVar == null || (ubVar = qcVar.e) == null) {
            return;
        }
        ubVar.updatePosition();
    }

    public final void m() {
        ci.d dVar = this.w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = h6.Oh;
        d6 d6Var = this.f;
        dVar.setBackground(h6.b0(dp, ((nr0) this).U.V0(h6.v0(i10, d6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    o2 o2Var = (o2) view;
                    d6 d6Var2 = o2Var.c;
                    if (o2Var.s != null) {
                        o2Var.w.setTextColor(h6.v0(h6.G6, d6Var2));
                        TextView textView = o2Var.x;
                        int i11 = h6.Oh;
                        textView.setTextColor(h6.v0(i11, d6Var2));
                        o2Var.x.setBackground(h6.Y(h6.l1(0.1f, h6.v0(i11, d6Var2)), 4, 4));
                    } else {
                        o2Var.F.setTextColor(h6.v0(h6.G6, d6Var2));
                        o2Var.G.setTextColor(h6.v0(h6.y6, d6Var2));
                        o2Var.H.j();
                    }
                }
            }
        }
        this.E.setTextColor(h6.v0(h6.j5, d6Var));
        this.y.setBackground(h6.Y(h6.v0(h6.i6, d6Var), 24, 24));
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
        g81 g81Var = this.n;
        if (g81Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        g81Var.setTranslationY(min);
        g81Var.setScaleX(lerp);
        g81Var.setScaleY(lerp);
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
        g81Var.setAlpha(w7.p.a(f7, 0.0f, 1.0f) * clamp01);
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
        l5 l5Var = this.d;
        if (l5Var != null) {
            l5Var.o = true;
            l5Var.a();
        }
        k5 k5Var = this.e;
        if (k5Var != null) {
            k5Var.j = true;
            k5Var.i();
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
        l5 l5Var = this.d;
        if (l5Var != null) {
            l5Var.o = false;
        }
        k5 k5Var = this.e;
        if (k5Var != null) {
            k5Var.j = false;
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
