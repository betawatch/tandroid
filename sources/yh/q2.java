package yh;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.g5;
import di.z7;
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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.cb;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import w7.x5;
import w7.z5;
import zh.i5;
import zh.j5;
import zh.s5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class q2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap T = new HashMap();
    public final TextView E;
    public final mp F;
    public final FrameLayout G;
    public int H;
    public n70 I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public int M;
    public final s1 N;
    public final le.b O;
    public int P;
    public int Q;
    public z7 R;
    public ViewGroup S;
    public final org.telegram.ui.ActionBar.n2 a;
    public final int b;
    public final long c;
    public final j5 d;
    public final i5 e;
    public final f6 f;
    public final v1 h;
    public final h81 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder v;
    public final di.d w;
    public int x;
    public final LinearLayout y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0304  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q2(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, f6 f6Var) {
        super(context);
        int i11;
        String str;
        this.H = -1;
        nr0 nr0Var = (nr0) this;
        this.N = new s1(nr0Var, 2);
        this.O = new le.b(0, new u1(nr0Var), pr.h, 380L, true);
        this.Q = AndroidUtilities.displaySize.y;
        this.a = n2Var;
        this.b = i10;
        if (DialogObject.isEncryptedDialog(j3)) {
            TLRPC.EncryptedChat m10 = org.telegram.messenger.w1.m(MessagesController.getInstance(i10), j3);
            if (m10 != null) {
                this.c = m10.user_id;
            } else {
                this.c = j3;
            }
        } else {
            this.c = j3;
        }
        s5.y(i10, false).Q(this.c);
        int i12 = 1;
        j5 G = s5.y(i10, false).G(this.c, true);
        this.d = G;
        i5 F = s5.y(i10, false).F(this.c, true);
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
        this.f = f6Var;
        v1 v1Var = new v1(nr0Var, context, n2Var);
        this.h = v1Var;
        v1Var.setAllowDisallowInterceptTouch(true);
        v1Var.setAdapter(new w1(nr0Var, i10, f6Var));
        addView(v1Var, x5.e(-1, -1, 119));
        h81 n10 = v1Var.n(10, true);
        this.n = n10;
        int i13 = j6.Gh;
        int i14 = j6.G6;
        int i15 = j6.Eh;
        int i16 = j6.Hh;
        int i17 = j6.s8;
        n10.P = i13;
        n10.Q = i14;
        n10.R = i15;
        n10.S = i16;
        n10.T = i17;
        n10.O.setColor(j6.v0(i13, n10.j0));
        n10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        n10.setClipToPadding(false);
        n10.r = 12;
        n10.setPreTabClick(new u1(nr0Var));
        n10.setOnTabLongClick(new org.telegram.ui.Components.e2(nr0Var, i10, n2Var, context, f6Var, 5));
        addView(n10, x5.e(-1, 42, 48));
        gh.c cVar = new gh.c();
        int i18 = j6.d6;
        cVar.a(j6.v0(i18, f6Var));
        g5 g5Var = new g5(context);
        eh.b bVar = new eh.b(i18, f6Var);
        dh.f fVar = new dh.f(cVar);
        fVar.n(bVar);
        fVar.o(AndroidUtilities.dp(8.0f));
        fVar.p(AndroidUtilities.dp(22.0f));
        g5Var.setBackground(fVar);
        z5.b(g5Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e7 = x5.e(-1, 60, 87);
        e7.bottomMargin += AndroidUtilities.navigationBarHeight;
        addView(frameLayout, e7);
        frameLayout.addView(g5Var, x5.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.G = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.y = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(j6.Y(j6.v0(j6.i6, f6Var), 24, 24));
        mp mpVar = new mp(context, 24, f6Var);
        this.F = mpVar;
        mpVar.b(j6.h7, j6.j7, j6.k7);
        mpVar.setDrawUnchecked(true);
        mpVar.a(false, false);
        mpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(mpVar, x5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.E = textView;
        vl.n(j6.j5, f6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, x5.t(-2, -2, 16, 9, 0, 0, 0));
        g5Var.addView(linearLayout, x5.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        z5.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new ua(nr0Var, n2Var, i10, 19));
        Boolean bool = G.h;
        if (bool != null) {
            mpVar.a(bool.booleanValue(), false);
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
                spannableStringBuilder.setSpan(new nq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.w1.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new nq(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.v = spannableStringBuilder2;
                di.d dVar = new di.d(context, f6Var, true);
                this.w = dVar;
                dVar.setUseWrapContent(true);
                dVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                dVar.setRoundRadius(AndroidUtilities.dp(19.0f));
                dVar.g(spannableStringBuilder, false, true);
                dVar.setStateListAnimator(null);
                g5Var.addView(dVar, x5.e(-2, -1, 17));
                g5Var.setOnClickListener(new uq0(nr0Var, z10, i10, i12));
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
        spannableStringBuilder3.setSpan(new nq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(org.telegram.messenger.w1.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new nq(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.v = spannableStringBuilder22;
        di.d dVar2 = new di.d(context, f6Var, true);
        this.w = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar2.setRoundRadius(AndroidUtilities.dp(19.0f));
        dVar2.g(spannableStringBuilder3, false, true);
        dVar2.setStateListAnimator(null);
        g5Var.addView(dVar2, x5.e(-2, -1, 17));
        g5Var.setOnClickListener(new uq0(nr0Var, z10, i10, i12));
        dVar2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(d() ? 0 : 8);
        this.x = 60;
        addView(frameLayout2, x5.e(-1, 200, 87));
        m();
        n();
    }

    public static void j(org.telegram.ui.ActionBar.f1 f1Var, j5 j5Var, Runnable runnable, int i10) {
        f1Var.setOnClickListener(new ua(j5Var, i10, runnable, 20));
        f1Var.setOnLongClickListener(new cb(j5Var, i10, runnable));
    }

    public final void a() {
        j5 j5Var;
        m2 currentPage = getCurrentPage();
        if (currentPage == null || (j5Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i10 = j5Var.d;
        new k4(this.a, this.c, i10, new fi.s4(this, i10, currentPage, 5)).show();
    }

    public final boolean b() {
        i5 i5Var = this.e;
        return i5Var.h() && i5Var.d().size() < MessagesController.getInstance(this.b).config.stargiftsCollectionsLimit.get();
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
        di.d dVar = this.w;
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
        float translationY = this.r.getTranslationY() - org.telegram.messenger.w1.B(this.x, Math.max(AndroidUtilities.dp(240.0f), this.Q) + (-r0.getTop()), 1);
        if (this.Q < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.Q, AndroidUtilities.dp(this.x));
        }
        return (int) (AndroidUtilities.dp(this.x) - translationY);
    }

    public j5 getCurrentList() {
        m2 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public ll0 getCurrentListView() {
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
        j5 j5Var;
        int i11;
        m2 currentPage = getCurrentPage();
        j5 j5Var2 = this.d;
        if (currentPage == null || (j5Var = currentPage.e) == j5Var2) {
            if (j5Var2 != null && (i10 = j5Var2.n) > 0) {
                return i10;
            }
        } else if (j5Var != null && (i11 = j5Var.n) > 0) {
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
        j5 j5Var = this.d;
        if (j5Var != null && !j5Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < j5Var.l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) j5Var.l.get(i11)).gift.getDocument();
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
        h81 h81Var = this.n;
        if (h81Var != null) {
            return h81Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        i70 i70Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        f6 f6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        if (str != null) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        y1 y1Var = new y1(this, context, f6Var);
        y1Var.lineYFix = true;
        y1Var.setOnEditorActionListener(new z1(y1Var, callback, b2VarArr, currentFocus));
        MediaDataController.getInstance(this.b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        y1Var.setTextSize(1, 18.0f);
        y1Var.setTextColor(j6.v0(j6.j5, f6Var));
        y1Var.setHintColor(j6.v0(j6.Xh, f6Var));
        y1Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        y1Var.setFocusable(true);
        y1Var.setInputType(147457);
        y1Var.setLineColors(j6.v0(j6.k6, f6Var), j6.v0(j6.l6, f6Var), j6.v0(j6.p7, f6Var));
        y1Var.setImeOptions(6);
        y1Var.setBackgroundDrawable(null);
        y1Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        y1Var.addTextChangedListener(new a2(y1Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        y1Var.setText(str);
        linearLayout.addView(y1Var, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.a.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.k(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new sg.x(11, y1Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new t0.a(26));
        b2VarArr[0] = alertDialog$Builder.a;
        n70 n70Var = this.I;
        if (n70Var != null && (i70Var = n70Var.m) != null) {
            i70Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.a.getClassGuid());
        b2VarArr[0].setOnDismissListener(new fi.t0(this, y1Var, findActivity, 6));
        b2VarArr[0].setOnShowListener(new ig.r(3, y1Var));
        b2VarArr[0].show();
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        b2Var.h0 = false;
        b2Var.d(-1);
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
            i5 i5Var = this.e;
            if (i11 < i5Var.d().size()) {
                j5 e7 = (i11 < 0 || i11 >= i5Var.d().size()) ? null : i5Var.e(((TL_stars.TL_starGiftCollection) i5Var.d().get(i11)).collection_id);
                if (e7 != null) {
                    return e7.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        ub ubVar;
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
        float B = nextPositionAlpha + org.telegram.messenger.w1.B(this.x, (-frameLayout.getTop()) + this.Q, 1);
        boolean z10 = this.Q > AndroidUtilities.dp(184.0f);
        le.b bVar = this.O;
        bVar.a(z10, true);
        float f7 = bVar.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f7);
        this.G.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
        frameLayout.setTranslationY(lerp - this.P);
        frameLayout.setAlpha(f7);
        frameLayout.setVisibility(f7 <= 0.0f ? 4 : 0);
        this.w.g((!this.e.h() || v1Var.getPositionAnimated() < 0.5f) ? this.s : this.v, true, true);
        qc qcVar = qc.w;
        if (qcVar == null || (ubVar = qcVar.e) == null) {
            return;
        }
        ubVar.updatePosition();
    }

    public final void m() {
        di.d dVar = this.w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = j6.Oh;
        f6 f6Var = this.f;
        dVar.setBackground(j6.b0(dp, ((nr0) this).U.V0(j6.v0(i10, f6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    m2 m2Var = (m2) view;
                    f6 f6Var2 = m2Var.c;
                    if (m2Var.s != null) {
                        m2Var.w.setTextColor(j6.v0(j6.G6, f6Var2));
                        TextView textView = m2Var.x;
                        int i11 = j6.Oh;
                        textView.setTextColor(j6.v0(i11, f6Var2));
                        m2Var.x.setBackground(j6.Y(j6.l1(0.1f, j6.v0(i11, f6Var2)), 4, 4));
                    } else {
                        m2Var.F.setTextColor(j6.v0(j6.G6, f6Var2));
                        m2Var.G.setTextColor(j6.v0(j6.y6, f6Var2));
                        m2Var.H.j();
                    }
                }
            }
        }
        this.E.setTextColor(j6.v0(j6.j5, f6Var));
        this.y.setBackground(j6.Y(j6.v0(j6.i6, f6Var), 24, 24));
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
        h81 h81Var = this.n;
        if (h81Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        h81Var.setTranslationY(min);
        h81Var.setScaleX(lerp);
        h81Var.setScaleY(lerp);
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
        h81Var.setAlpha(w7.p.a(f7, 0.0f, 1.0f) * clamp01);
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
        j5 j5Var = this.d;
        if (j5Var != null) {
            j5Var.o = true;
            j5Var.a();
        }
        i5 i5Var = this.e;
        if (i5Var != null) {
            i5Var.j = true;
            i5Var.i();
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
        j5 j5Var = this.d;
        if (j5Var != null) {
            j5Var.o = false;
        }
        i5 i5Var = this.e;
        if (i5Var != null) {
            i5Var.j = false;
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
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
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
