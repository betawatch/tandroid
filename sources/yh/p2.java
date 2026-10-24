package yh;

import ai.ha;
import ai.ia;
import ai.j6;
import ai.t8;
import ai.v9;
import ai.y9;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ei.m7;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.e8;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public abstract class p2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap U = new HashMap();
    public final TextView E;
    public final xp F;
    public final FrameLayout G;
    public int H;
    public j80 I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public int M;
    public final q1 N;
    public final ne.b O;
    public int P;
    public int Q;
    public final gh.c R;
    public m7 S;
    public ViewGroup T;
    public final org.telegram.ui.ActionBar.o2 a;
    public final int b;
    public final long c;
    public final y9 d;
    public final v9 e;
    public final g6 f;
    public final u1 h;
    public final k91 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder v;
    public final ei.d w;
    public int x;
    public final LinearLayout y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p2(int i10, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, g6 g6Var) {
        super(context);
        int i11;
        String str;
        this.H = -1;
        ns0 ns0Var = (ns0) this;
        this.N = new q1(ns0Var, 2);
        this.O = new ne.b(0, new t1(ns0Var), bs.h, 380L, true);
        this.Q = AndroidUtilities.displaySize.y;
        this.a = o2Var;
        this.b = i10;
        if (DialogObject.isEncryptedDialog(j10)) {
            TLRPC.EncryptedChat l4 = org.telegram.messenger.v0.l(MessagesController.getInstance(i10), j10);
            if (l4 != null) {
                this.c = l4.user_id;
            } else {
                this.c = j10;
            }
        } else {
            this.c = j10;
        }
        ha.y(i10, false).Q(this.c);
        int i12 = 1;
        y9 G = ha.y(i10, false).G(this.c, true);
        this.d = G;
        v9 F = ha.y(i10, false).F(this.c, true);
        this.e = F;
        F.g = G;
        G.o = true;
        if ((o2Var instanceof ProfileActivity) && ((ProfileActivity) o2Var).w1) {
            G.g = 4;
            G.e = true;
            G.j(true);
        } else if (!G.e || G.g != 783) {
            G.g = 783;
            G.e = true;
            G.j(true);
        }
        G.a();
        this.f = g6Var;
        u1 u1Var = new u1(ns0Var, context, o2Var);
        this.h = u1Var;
        u1Var.setAllowDisallowInterceptTouch(true);
        u1Var.setAdapter(new v1(ns0Var, i10, g6Var));
        addView(u1Var, z5.e(-1, -1, 119));
        k91 n10 = u1Var.n(10, true);
        this.n = n10;
        n10.g(k6.Gh, k6.G6, k6.Eh, k6.Hh, k6.s8);
        n10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        n10.setClipToPadding(false);
        n10.r = 12;
        n10.setPreTabClick(new t1(ns0Var));
        n10.setOnTabLongClick(new j6(ns0Var, i10, o2Var, context, g6Var));
        addView(n10, z5.e(-1, 42, 48));
        gh.c cVar = new gh.c();
        int i13 = k6.d6;
        cVar.a(k6.w0(i13, g6Var));
        this.R = cVar;
        bh.b bVar = new bh.b(cVar);
        ci.h4 h4Var = new ci.h4(context);
        dh.d c10 = bVar.c(h4Var, new eh.b(i13, g6Var), false);
        c10.p(AndroidUtilities.dp(8.0f));
        c10.q(AndroidUtilities.dp(22.0f));
        h4Var.setBackground(c10);
        b6.b(h4Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e = z5.e(-1, 60, 87);
        e.bottomMargin += AndroidUtilities.navigationBarHeight;
        addView(frameLayout, e);
        frameLayout.addView(h4Var, z5.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.G = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.y = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i14 = k6.i6;
        org.telegram.ui.Cells.y Z = k6.Z(k6.w0(i14, g6Var), 24, 24);
        n6 O = r6.O(i14);
        linearLayout.setBackground(Z);
        r6.k(linearLayout, Z, null, O, g6Var);
        xp xpVar = new xp(context, 24, g6Var);
        this.F = xpVar;
        xpVar.b(k6.h7, k6.j7, k6.k7);
        xpVar.setDrawUnchecked(true);
        xpVar.a(false, false);
        xpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(xpVar, z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.E = textView;
        r6.W(textView, k6.j5, g6Var);
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, z5.t(-2, -2, 16, 9, 0, 0, 0));
        h4Var.addView(linearLayout, z5.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        b6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new ia(ns0Var, o2Var, i10, 22));
        Boolean bool = G.h;
        if (bool != null) {
            xpVar.a(bool.booleanValue(), false);
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
                spannableStringBuilder.setSpan(new xq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.v0.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new xq(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.v = spannableStringBuilder2;
                ei.d dVar = new ei.d(context, g6Var, true);
                this.w = dVar;
                dVar.setUseWrapContent(true);
                dVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                dVar.setRoundRadius(AndroidUtilities.dp(19.0f));
                dVar.i(spannableStringBuilder, false, true);
                dVar.setStateListAnimator(null);
                h4Var.addView(dVar, z5.e(-2, -1, 17));
                h4Var.setOnClickListener(new vr0(ns0Var, z10, i10, i12));
                dVar.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(d() ? 0 : 8);
                this.x = 60;
                addView(frameLayout2, z5.e(-1, 200, 87));
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
        spannableStringBuilder3.setSpan(new xq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(org.telegram.messenger.v0.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new xq(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.v = spannableStringBuilder22;
        ei.d dVar2 = new ei.d(context, g6Var, true);
        this.w = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar2.setRoundRadius(AndroidUtilities.dp(19.0f));
        dVar2.i(spannableStringBuilder3, false, true);
        dVar2.setStateListAnimator(null);
        h4Var.addView(dVar2, z5.e(-2, -1, 17));
        h4Var.setOnClickListener(new vr0(ns0Var, z10, i10, i12));
        dVar2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(d() ? 0 : 8);
        this.x = 60;
        addView(frameLayout2, z5.e(-1, 200, 87));
        m();
        n();
    }

    public static void j(org.telegram.ui.ActionBar.e1 e1Var, y9 y9Var, Runnable runnable, int i10) {
        e1Var.setOnClickListener(new ia(y9Var, i10, runnable, 23));
        e1Var.setOnLongClickListener(new za(y9Var, i10, runnable));
    }

    public final void a() {
        y9 y9Var;
        l2 currentPage = getCurrentPage();
        if (currentPage == null || (y9Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i10 = y9Var.d;
        new k4(this.a, this.c, i10, new gi.g4(this, i10, currentPage, 6)).show();
    }

    public final boolean b() {
        v9 v9Var = this.e;
        return v9Var.h() && v9Var.d().size() < MessagesController.getInstance(this.b).config.stargiftsCollectionsLimit.get();
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
        ei.d dVar = this.w;
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
        u1 u1Var = this.h;
        if (u1Var == null || this.n == null) {
            return;
        }
        u1Var.o(z10);
        e();
    }

    public final boolean g() {
        if (this.L) {
            return true;
        }
        l2 currentPage = getCurrentPage();
        return currentPage != null && currentPage.n;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - org.telegram.messenger.v0.B(this.x, Math.max(AndroidUtilities.dp(240.0f), this.Q) + (-r0.getTop()), 1);
        if (this.Q < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.Q, AndroidUtilities.dp(this.x));
        }
        return (int) (AndroidUtilities.dp(this.x) - translationY);
    }

    public y9 getCurrentList() {
        l2 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public mm0 getCurrentListView() {
        l2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public l2 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (l2) currentView;
    }

    public int getGiftsCount() {
        int i10;
        y9 y9Var;
        int i11;
        l2 currentPage = getCurrentPage();
        y9 y9Var2 = this.d;
        if (currentPage == null || (y9Var = currentPage.e) == y9Var2) {
            if (y9Var2 != null && (i10 = y9Var2.n) > 0) {
                return i10;
            }
        } else if (y9Var != null && (i11 = y9Var.n) > 0) {
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
        y9 y9Var = this.d;
        if (y9Var != null && !y9Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < y9Var.l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) y9Var.l.get(i11)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.id))) {
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.id));
                    i10++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        u1 u1Var = this.h;
        float f7 = 0.0f;
        if (u1Var.getViewPages() != null) {
            for (View view : u1Var.getViewPages()) {
                if (view instanceof l2) {
                    f7 = (((l2) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f7;
                }
            }
        }
        return f7;
    }

    public float getTabsVisibility() {
        k91 k91Var = this.n;
        if (k91Var != null) {
            return k91Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        e80 e80Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        g6 g6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        if (str != null) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        x1 x1Var = new x1(this, context, g6Var);
        x1Var.lineYFix = true;
        x1Var.setOnEditorActionListener(new y1(x1Var, callback, c2VarArr, currentFocus));
        MediaDataController.getInstance(this.b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        x1Var.setTextSize(1, 18.0f);
        r6.W(x1Var, k6.j5, g6Var);
        r6.m(x1Var, 34, k6.Xh, g6Var);
        x1Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        x1Var.setFocusable(true);
        x1Var.setInputType(147457);
        r6.H(x1Var, k6.k6, k6.l6, k6.p7, g6Var);
        x1Var.setImeOptions(6);
        x1Var.setBackgroundDrawable(null);
        x1Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        x1Var.addTextChangedListener(new z1(x1Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        x1Var.setText(str);
        linearLayout.addView(x1Var, z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.a.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.k(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new e8(24, x1Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new v0.k(14));
        c2VarArr[0] = alertDialog$Builder.a;
        j80 j80Var = this.I;
        if (j80Var != null && (e80Var = j80Var.m) != null) {
            e80Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.a.getClassGuid());
        c2VarArr[0].setOnDismissListener(new gi.r0(this, x1Var, findActivity, 6));
        c2VarArr[0].setOnShowListener(new ig.r(x1Var, 3));
        c2VarArr[0].show();
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        c2Var.j0 = false;
        c2Var.d(-1);
        x1Var.setSelection(x1Var.getText().length());
    }

    public final void i() {
        l2 currentPage = getCurrentPage();
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
            v9 v9Var = this.e;
            if (i11 < v9Var.d().size()) {
                y9 e = (i11 < 0 || i11 >= v9Var.d().size()) ? null : v9Var.e(((TL_stars.TL_starGiftCollection) v9Var.d().get(i11)).collection_id);
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
        u1 u1Var = this.h;
        if (u1Var == null) {
            return;
        }
        if (u1Var.getCurrentPosition() == u1Var.getNextPosition()) {
            nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * (k(u1Var.getCurrentPosition()) ? 1.0f : 0.0f);
        } else {
            nextPositionAlpha = ((u1Var.getNextPositionAlpha() * (k(u1Var.getNextPosition()) ? 1.0f : 0.0f)) + (u1Var.getCurrentPositionAlpha() * (k(u1Var.getCurrentPosition()) ? 1.0f : 0.0f))) * (AndroidUtilities.dp(68.0f) + 2);
        }
        FrameLayout frameLayout = this.r;
        float B = nextPositionAlpha + org.telegram.messenger.v0.B(this.x, (-frameLayout.getTop()) + this.Q, 1);
        boolean z10 = this.Q > AndroidUtilities.dp(184.0f);
        ne.b bVar = this.O;
        bVar.a(z10, true);
        float f7 = bVar.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f7);
        this.G.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
        frameLayout.setTranslationY(lerp - this.P);
        frameLayout.setAlpha(f7);
        frameLayout.setVisibility(f7 <= 0.0f ? 4 : 0);
        this.w.i((!this.e.h() || u1Var.getPositionAnimated() < 0.5f) ? this.s : this.v, true, true);
        qc qcVar = qc.w;
        if (qcVar == null || (ubVar = qcVar.e) == null) {
            return;
        }
        ubVar.updatePosition();
    }

    public final void m() {
        ei.d dVar = this.w;
        dVar.updateColors();
        int i10 = k6.Oh;
        g6 g6Var = this.f;
        int Y0 = ((ns0) this).V.Y0(k6.w0(i10, g6Var));
        if (!(dVar.getBackground() instanceof ShapeDrawable)) {
            dVar.setBackground(k6.c0(AndroidUtilities.dp(19.0f), Y0));
        } else if (((ShapeDrawable) dVar.getBackground()).getPaint().getColor() != Y0) {
            k6.z1(Y0, dVar.getBackground());
            dVar.invalidate();
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    l2 l2Var = (l2) view;
                    g6 g6Var2 = l2Var.c;
                    if (l2Var.s != null) {
                        l2Var.w.setTextColor(k6.w0(k6.G6, g6Var2));
                        l2Var.x.setTextColor(k6.w0(k6.Oh, g6Var2));
                    } else {
                        l2Var.F.setTextColor(k6.w0(k6.G6, g6Var2));
                        l2Var.G.setTextColor(k6.w0(k6.y6, g6Var2));
                        l2Var.H.updateColors();
                    }
                }
            }
        }
        this.E.setTextColor(k6.w0(k6.j5, g6Var));
    }

    public final void n() {
        boolean z10 = !this.e.d().isEmpty() || b();
        u1 u1Var = this.h;
        if (u1Var.getViewPages() != null) {
            for (View view : u1Var.getViewPages()) {
                if (view instanceof l2) {
                    ((l2) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f7;
        k91 k91Var = this.n;
        if (k91Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        k91Var.setTranslationY(min);
        k91Var.setScaleX(lerp);
        k91Var.setScaleY(lerp);
        u1 u1Var = this.h;
        if (u1Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : u1Var.getViewPages()) {
                if (view instanceof l2) {
                    f7 += ((l2) view).I ? 1.0f : 0.0f;
                }
            }
        } else {
            f7 = 0.0f;
        }
        k91Var.setAlpha(w7.r.a(f7, 0.0f, 1.0f) * clamp01);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        l2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        y9 y9Var = this.d;
        if (y9Var != null) {
            y9Var.o = true;
            y9Var.a();
        }
        v9 v9Var = this.e;
        if (v9Var != null) {
            v9Var.j = true;
            v9Var.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        l2 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        y9 y9Var = this.d;
        if (y9Var != null) {
            y9Var.o = false;
        }
        v9 v9Var = this.e;
        if (v9Var != null) {
            v9Var.j = false;
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
                if (view instanceof l2) {
                    l2 l2Var = (l2) view;
                    g2 g2Var = l2Var.f;
                    int paddingTop = g2Var.getPaddingTop();
                    g2Var.setPadding(AndroidUtilities.dp(9.0f), this.K, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(g2Var, new r1(l2Var, paddingTop - g2Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        l2 currentPage = getCurrentPage();
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
            org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
            if (U2 instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U2;
                profileActivity.I4(false);
                AndroidUtilities.runOnUIThread(new t8(profileActivity, 1));
            }
        }
        if (z10) {
            return;
        }
        q1 q1Var = this.N;
        AndroidUtilities.cancelRunOnUIThread(q1Var);
        AndroidUtilities.runOnUIThread(q1Var);
    }

    public void setVisibleHeight(int i10) {
        this.Q = i10;
        l();
        u1 u1Var = this.h;
        if (u1Var != null) {
            for (View view : u1Var.getViewPages()) {
                if (view instanceof l2) {
                    ((l2) view).setVisibleHeight(this.Q);
                }
            }
        }
    }
}
