package zh;

import a8.ee;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ca;
import bi.e6;
import bi.p8;
import bi.pa;
import bi.q9;
import bi.t9;
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
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.db;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.ub;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.zp;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public abstract class r2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap V = new HashMap();
    public final TextView E;
    public final zp F;
    public final FrameLayout G;
    public int H;
    public k80 I;
    public SpannableStringBuilder J;
    public int K;
    public int L;
    public int M;
    public oi.q N;
    public boolean O;
    public int P;
    public final r1 Q;
    public final oe.b R;
    public int S;
    public int T;
    public final hh.c U;
    public final org.telegram.ui.ActionBar.r2 a;
    public final int b;
    public final long c;
    public final t9 d;
    public final q9 e;
    public final u6 f;
    public final v1 h;
    public final t91 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder v;
    public final fi.d w;
    public int x;
    public final LinearLayout y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r2(int i10, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, u6 u6Var) {
        super(context);
        int i11;
        String str;
        this.H = -1;
        vs0 vs0Var = (vs0) this;
        int i12 = 1;
        this.Q = new r1(vs0Var, i12);
        this.R = new oe.b(0, new u1(vs0Var), ds.h, 380L, true);
        this.T = AndroidUtilities.displaySize.y;
        this.a = r2Var;
        this.b = i10;
        if (DialogObject.isEncryptedDialog(j10)) {
            TLRPC.EncryptedChat m10 = org.telegram.messenger.t.m(MessagesController.getInstance(i10), j10);
            if (m10 != null) {
                this.c = m10.user_id;
            } else {
                this.c = j10;
            }
        } else {
            this.c = j10;
        }
        ca.y(i10, false).Q(this.c);
        t9 G = ca.y(i10, false).G(this.c, true);
        this.d = G;
        q9 F = ca.y(i10, false).F(this.c, true);
        this.e = F;
        F.g = G;
        G.o = true;
        if ((r2Var instanceof ProfileActivity) && ((ProfileActivity) r2Var).v1) {
            G.g = 4;
            G.e = true;
            G.j(true);
        } else if (!G.e || G.g != 783) {
            G.g = 783;
            G.e = true;
            G.j(true);
        }
        G.b();
        this.f = u6Var;
        v1 v1Var = new v1(vs0Var, context, r2Var);
        this.h = v1Var;
        v1Var.setAllowDisallowInterceptTouch(true);
        v1Var.setAdapter(new w1(vs0Var, i10, u6Var));
        addView(v1Var, gb1.i(-1, -1, 119));
        t91 n10 = v1Var.n(10, true);
        this.n = n10;
        n10.g(y6.Gh, y6.G6, y6.Eh, y6.Hh, y6.s8);
        n10.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        n10.setClipToPadding(false);
        n10.r = 12;
        n10.setPreTabClick(new u1(vs0Var));
        n10.setOnTabLongClick(new e6(vs0Var, i10, r2Var, context, u6Var));
        addView(n10, gb1.i(-1, 42, 48));
        hh.c cVar = new hh.c();
        int i13 = y6.d6;
        cVar.a(y6.w0(i13, u6Var));
        this.U = cVar;
        ch.b bVar = new ch.b(cVar);
        di.i4 i4Var = new di.i4(context);
        eh.d c10 = bVar.c(i4Var, new fh.b(i13, u6Var), false);
        c10.w(AndroidUtilities.dp(8.0f));
        c10.x(AndroidUtilities.dp(22.0f));
        i4Var.setBackground(c10);
        gb1.c(i4Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams i14 = gb1.i(-1, 60, 87);
        i14.bottomMargin += AndroidUtilities.navigationBarHeight;
        addView(frameLayout, i14);
        frameLayout.addView(i4Var, gb1.i(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.G = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.y = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i15 = y6.i6;
        org.telegram.ui.Cells.y Z = y6.Z(y6.w0(i15, u6Var), 24, 24);
        b7 N = f7.N(i15);
        linearLayout.setBackground(Z);
        f7.k(linearLayout, Z, null, N, u6Var);
        zp zpVar = new zp(context, 24, u6Var);
        this.F = zpVar;
        zpVar.b(y6.h7, y6.j7, y6.k7);
        zpVar.setDrawUnchecked(true);
        zpVar.a(false, false);
        zpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(zpVar, gb1.x(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.E = textView;
        f7.V(textView, y6.j5, u6Var);
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, gb1.x(-2, -2, 16, 9, 0, 0, 0));
        i4Var.addView(linearLayout, gb1.h(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        gb1.c(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new pa(vs0Var, r2Var, i10, 24));
        Boolean bool = G.h;
        if (bool != null) {
            zpVar.a(bool.booleanValue(), false);
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
                spannableStringBuilder.setSpan(new zq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.t.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new zq(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.v = spannableStringBuilder2;
                fi.d dVar = new fi.d(context, u6Var, true);
                this.w = dVar;
                dVar.setUseWrapContent(true);
                dVar.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                dVar.setRoundRadius(AndroidUtilities.dp(19.0f));
                dVar.i(spannableStringBuilder, false, true);
                dVar.setStateListAnimator(null);
                i4Var.addView(dVar, gb1.i(-2, -1, 17));
                i4Var.setOnClickListener(new bs0(vs0Var, z10, i10, i12));
                dVar.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(d() ? 0 : 8);
                this.x = 60;
                addView(frameLayout2, gb1.i(-1, 200, 87));
                m();
                o();
            }
            i11 = R.string.ProfileGiftsSendChannel;
        } else {
            i11 = R.string.ProfileGiftsSend;
        }
        str = LocaleController.getString(i11);
        sb2.append(str);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder3.setSpan(new zq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(org.telegram.messenger.t.h(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new zq(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.v = spannableStringBuilder22;
        fi.d dVar2 = new fi.d(context, u6Var, true);
        this.w = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar2.setRoundRadius(AndroidUtilities.dp(19.0f));
        dVar2.i(spannableStringBuilder3, false, true);
        dVar2.setStateListAnimator(null);
        i4Var.addView(dVar2, gb1.i(-2, -1, 17));
        i4Var.setOnClickListener(new bs0(vs0Var, z10, i10, i12));
        dVar2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(d() ? 0 : 8);
        this.x = 60;
        addView(frameLayout2, gb1.i(-1, 200, 87));
        m();
        o();
    }

    public static void j(org.telegram.ui.ActionBar.g1 g1Var, t9 t9Var, Runnable runnable, int i10) {
        g1Var.setOnClickListener(new pa(t9Var, i10, runnable, 23));
        g1Var.setOnLongClickListener(new db(t9Var, i10, runnable));
    }

    public final void a() {
        t9 t9Var;
        m2 currentPage = getCurrentPage();
        if (currentPage == null || (t9Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i10 = t9Var.d;
        new l4(this.a, this.c, i10, new hi.p4(this, i10, currentPage, 6)).show();
    }

    public final boolean b() {
        q9 q9Var = this.e;
        return q9Var.h() && q9Var.d().size() < MessagesController.getInstance(this.b).config.stargiftsCollectionsLimit.get();
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
        fi.d dVar = this.w;
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
            o();
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            dVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.x = 60;
            setVisibleHeight(this.T);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.P <= 0) {
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
                if (((TL_stars.TL_starGiftCollection) d.get(i10)).collection_id == this.P) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (i10 < 0 || tL_starGiftCollection == null) {
            return;
        }
        this.P = 0;
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
        if (this.O) {
            return true;
        }
        m2 currentPage = getCurrentPage();
        return currentPage != null && currentPage.h;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - org.telegram.messenger.t.C(this.x, Math.max(AndroidUtilities.dp(240.0f), this.T) + (-r0.getTop()), 1);
        if (this.T < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.T, AndroidUtilities.dp(this.x));
        }
        return (int) (AndroidUtilities.dp(this.x) - translationY);
    }

    public t9 getCurrentList() {
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
        t9 t9Var;
        int i11;
        m2 currentPage = getCurrentPage();
        t9 t9Var2 = this.d;
        if (currentPage == null || (t9Var = currentPage.e) == t9Var2) {
            if (t9Var2 != null && (i10 = t9Var2.n) > 0) {
                return i10;
            }
        } else if (t9Var != null && (i11 = t9Var.n) > 0) {
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
        t9 t9Var = this.d;
        if (t9Var != null && !t9Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < t9Var.l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) t9Var.l.get(i11)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.id))) {
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
        t91 t91Var = this.n;
        if (t91Var != null) {
            return t91Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        f80 f80Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        View currentFocus = findActivity != null ? findActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        u6 u6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        if (str != null) {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.a.R = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.a.T = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        y1 y1Var = new y1(this, context, u6Var);
        y1Var.lineYFix = true;
        y1Var.setOnEditorActionListener(new z1(y1Var, callback, e2VarArr, currentFocus));
        MediaDataController.getInstance(this.b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        y1Var.setTextSize(1, 18.0f);
        f7.V(y1Var, y6.j5, u6Var);
        f7.m(y1Var, 34, y6.Xh, u6Var);
        y1Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        y1Var.setFocusable(true);
        y1Var.setInputType(147457);
        f7.G(y1Var, y6.k6, y6.l6, y6.p7, u6Var);
        y1Var.setImeOptions(6);
        y1Var.setBackgroundDrawable(null);
        y1Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        y1Var.addTextChangedListener(new a2(y1Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        y1Var.setText(str);
        linearLayout.addView(y1Var, gb1.o(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        alertDialog$Builder.a.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.k(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new zg1(28, y1Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new vg.d(18));
        e2VarArr[0] = alertDialog$Builder.a;
        k80 k80Var = this.I;
        if (k80Var != null && (f80Var = k80Var.m) != null) {
            f80Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.a.getClassGuid());
        e2VarArr[0].setOnDismissListener(new hi.y0(this, y1Var, findActivity, 6));
        e2VarArr[0].setOnShowListener(new jg.s(y1Var, 3));
        e2VarArr[0].show();
        org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
        e2Var.j0 = false;
        e2Var.d(-1);
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
            q9 q9Var = this.e;
            if (i11 < q9Var.d().size()) {
                t9 e = (i11 < 0 || i11 >= q9Var.d().size()) ? null : q9Var.e(((TL_stars.TL_starGiftCollection) q9Var.d().get(i11)).collection_id);
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
        v1 v1Var = this.h;
        if (v1Var == null) {
            return;
        }
        if (v1Var.getCurrentPosition() == v1Var.getNextPosition()) {
            nextPositionAlpha = k(v1Var.getCurrentPosition()) ? 1.0f : 0.0f;
        } else {
            nextPositionAlpha = (v1Var.getNextPositionAlpha() * (k(v1Var.getNextPosition()) ? 1.0f : 0.0f)) + (v1Var.getCurrentPositionAlpha() * (k(v1Var.getCurrentPosition()) ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout = this.r;
        float C = org.telegram.messenger.t.C(this.x, (-frameLayout.getTop()) + this.T, 1);
        float dp = ((AndroidUtilities.dp(68.0f) + 2) * nextPositionAlpha) + C;
        boolean z10 = this.T > AndroidUtilities.dp(184.0f);
        oe.b bVar = this.R;
        bVar.a(z10, true);
        float f7 = bVar.e;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + C, (AndroidUtilities.dp(16.0f) * nextPositionAlpha) + C, f7);
        float f10 = (1.0f - nextPositionAlpha) * f7;
        this.G.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + dp, dp, f7) - AndroidUtilities.dp(200.0f));
        frameLayout.setTranslationY(lerp - this.S);
        frameLayout.setAlpha(f10);
        frameLayout.setVisibility(f10 <= 0.0f ? 4 : 0);
        this.w.i((!this.e.h() || v1Var.getPositionAnimated() < 0.5f) ? this.s : this.v, true, true);
        qc qcVar = qc.x;
        if (qcVar == null || (ubVar = qcVar.e) == null) {
            return;
        }
        ubVar.updatePosition();
    }

    public final void m() {
        fi.d dVar = this.w;
        dVar.updateColors();
        int i10 = y6.Oh;
        u6 u6Var = this.f;
        int b12 = ((vs0) this).W.b1(y6.w0(i10, u6Var));
        if (!(dVar.getBackground() instanceof ShapeDrawable)) {
            dVar.setBackground(y6.c0(AndroidUtilities.dp(19.0f), b12));
        } else if (((ShapeDrawable) dVar.getBackground()).getPaint().getColor() != b12) {
            y6.z1(b12, dVar.getBackground());
            dVar.invalidate();
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    m2 m2Var = (m2) view;
                    u6 u6Var2 = m2Var.c;
                    if (m2Var.r != null) {
                        m2Var.v.setTextColor(y6.w0(y6.G6, u6Var2));
                        m2Var.w.setTextColor(y6.w0(y6.Oh, u6Var2));
                    } else {
                        m2Var.E.setTextColor(y6.w0(y6.G6, u6Var2));
                        m2Var.F.setTextColor(y6.w0(y6.y6, u6Var2));
                        m2Var.G.updateColors();
                    }
                }
            }
        }
        this.E.setTextColor(y6.w0(y6.j5, u6Var));
    }

    public final void n() {
        for (View view : this.h.getViewPages()) {
            if (view instanceof m2) {
                m2 m2Var = (m2) view;
                h2 h2Var = m2Var.f;
                int paddingTop = h2Var.getPaddingTop();
                m2Var.g();
                int paddingTop2 = paddingTop - h2Var.getPaddingTop();
                if (paddingTop2 != 0) {
                    AndroidUtilities.doOnLayout(h2Var, new q1(m2Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
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
        o();
        t9 t9Var = this.d;
        if (t9Var != null) {
            t9Var.o = true;
            t9Var.b();
        }
        q9 q9Var = this.e;
        if (q9Var != null) {
            q9Var.j = true;
            q9Var.i();
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
        t9 t9Var = this.d;
        if (t9Var != null) {
            t9Var.o = false;
        }
        q9 q9Var = this.e;
        if (q9Var != null) {
            q9Var.j = false;
        }
    }

    public final void p() {
        float f7;
        t91 t91Var = this.n;
        if (t91Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.K, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        t91Var.setTranslationY(min);
        t91Var.setScaleX(lerp);
        t91Var.setScaleY(lerp);
        v1 v1Var = this.h;
        if (v1Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : v1Var.getViewPages()) {
                if (view instanceof m2) {
                    f7 += ((m2) view).H ? 1.0f : 0.0f;
                }
            }
        } else {
            f7 = 0.0f;
        }
        t91Var.setAlpha(ee.a(f7, 0.0f, 1.0f) * clamp01);
    }

    public abstract void q(boolean z10);

    public void setButtonOffset(int i10) {
        if (this.S != i10) {
            this.S = i10;
            l();
        }
    }

    public void setGlassEngine(oi.q qVar) {
        this.N = qVar;
        v1 v1Var = this.h;
        qVar.c(v1Var);
        for (View view : v1Var.getViewPages()) {
            if (view instanceof m2) {
                qVar.b(((m2) view).f);
            }
        }
    }

    public void setPaddingTop(int i10) {
        if (this.K != i10) {
            this.K = i10;
            n();
            p();
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
        if (this.O == z10) {
            return;
        }
        this.O = z10;
        q(g());
        this.n.setReordering(z10);
        if (z10) {
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) U;
                profileActivity.O4(false);
                AndroidUtilities.runOnUIThread(new p8(profileActivity, 1));
            }
        }
        if (z10) {
            return;
        }
        r1 r1Var = this.Q;
        AndroidUtilities.cancelRunOnUIThread(r1Var);
        AndroidUtilities.runOnUIThread(r1Var);
    }

    public void setVisibleHeight(int i10) {
        this.T = i10;
        l();
        v1 v1Var = this.h;
        if (v1Var != null) {
            for (View view : v1Var.getViewPages()) {
                if (view instanceof m2) {
                    ((m2) view).setVisibleHeight(this.T);
                }
            }
        }
    }
}
