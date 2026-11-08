package zh;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ea;
import bi.i6;
import bi.la;
import bi.t9;
import bi.v9;
import bi.w8;
import c8.ha;
import c8.j9;
import c8.ka;
import hi.d4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.gb;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sq0;
import org.telegram.ui.tb0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class d2 extends FrameLayout implements ls {
    public static final HashMap U = new HashMap();
    public final LinearLayout D;
    public final TextView E;
    public final wo F;
    public final FrameLayout G;
    public int H;
    public k60 I;
    public SpannableStringBuilder J;
    public int K;
    public int L;
    public int M;
    public oi.q N;
    public boolean O;
    public int P;
    public final h1 Q;
    public final te.a R;
    public int S;
    public int T;
    public final org.telegram.ui.ActionBar.f2 a;
    public final int b;
    public final long c;
    public final v9 d;
    public final t9 e;
    public final f6 f;
    public final ei.a h;
    public final u61 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder w;
    public final fi.d x;
    public int y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0302  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d2(org.telegram.ui.ActionBar.f2 f2Var, Context context, int i7, long j3, f6 f6Var, dh.c cVar) {
        super(context);
        String str;
        int i10;
        String str2;
        this.H = -1;
        up0 up0Var = (up0) this;
        this.Q = new h1(up0Var, 0);
        this.R = new te.a(0, new i1(up0Var), xq.h, 380L, true);
        this.T = org.telegram.messenger.g0.q.y;
        this.a = f2Var;
        this.b = i7;
        if (m5.C(j3)) {
            TLRPC.EncryptedChat a12 = qp.s1(i7).a1(Integer.valueOf((int) (4294967295L & j3)));
            if (a12 != null) {
                this.c = a12.user_id;
            } else {
                this.c = j3;
            }
        } else {
            this.c = j3;
        }
        ea.y(i7, false).P(this.c);
        v9 G = ea.y(i7, false).G(this.c, true);
        this.d = G;
        t9 F = ea.y(i7, false).F(this.c, true);
        this.e = F;
        F.g = G;
        G.o = true;
        if ((f2Var instanceof ProfileActivity) && ((ProfileActivity) f2Var).u1) {
            G.g = 4;
            G.e = true;
            G.j(true);
        } else if (!G.e || G.g != 783) {
            G.g = 783;
            G.e = true;
            G.j(true);
        }
        G.a();
        this.f = f6Var;
        ei.a aVar = new ei.a(up0Var, context, f2Var, 2);
        this.h = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new l1(up0Var, i7, f6Var));
        addView(aVar, ha.e(-1, -1, qs.E1));
        u61 n10 = aVar.n(10, true);
        this.n = n10;
        n10.g(k6.ui, k6.G6, k6.si, k6.vi, k6.s8);
        n10.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        n10.setClipToPadding(false);
        n10.r = 12;
        n10.setPreTabClick(new i1(up0Var));
        n10.setOnTabLongClick(new i6(up0Var, i7, f2Var, context, f6Var));
        addView(n10, ha.e(-1, 42, 48));
        sq0 sq0Var = new sq0(context);
        fh.g c10 = cVar.c(sq0Var, new gh.b(k6.d6, f6Var), false);
        c10.q(org.telegram.messenger.g0.L(8.0f));
        c10.r(org.telegram.messenger.g0.L(22.0f));
        sq0Var.setBackground(c10);
        ka.b(sq0Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e10 = ha.e(-1, 60, 87);
        e10.bottomMargin += org.telegram.messenger.g0.n;
        addView(frameLayout, e10);
        frameLayout.addView(sq0Var, ha.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.G = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.D = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i11 = k6.i6;
        org.telegram.ui.Cells.y a02 = k6.a0(k6.w0(i11, f6Var), 24, 24);
        n6 N = r6.N(i11);
        linearLayout.setBackground(a02);
        r6.k(linearLayout, a02, null, N, f6Var);
        wo woVar = new wo(24, context, f6Var);
        this.F = woVar;
        woVar.b(k6.h7, k6.j7, k6.k7);
        woVar.setDrawUnchecked(true);
        woVar.a(false, false);
        woVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(woVar, ha.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.E = textView;
        r6.V(textView, k6.j5, f6Var);
        jg.g.v(textView, 1, 14.0f, null, 2131750258);
        linearLayout.addView(textView, ha.t(-2, -2, 16, 9, 0, 0, 0));
        sq0Var.addView(linearLayout, ha.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        ka.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new la(up0Var, f2Var, i7, 24));
        Boolean bool = G.h;
        if (bool != null) {
            woVar.a(bool.booleanValue(), false);
        }
        TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(this.c));
        boolean z9 = this.c < 0 || !(a22 == null || t10.B(a22) || t10.t(a22));
        StringBuilder sb2 = new StringBuilder("G ");
        if (z9) {
            long j10 = this.c;
            if (j10 >= 0) {
                str2 = id.a0(null, null, 2131746667, m5.t(j10));
                sb2.append(str2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
                spannableStringBuilder.setSpan(new wp(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jg.g.l(2131746676, null, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new wp(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.w = spannableStringBuilder2;
                fi.d dVar = new fi.d(context, f6Var, true);
                this.x = dVar;
                dVar.setUseWrapContent(true);
                dVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
                dVar.setRoundRadius(org.telegram.messenger.g0.L(19.0f));
                dVar.i(spannableStringBuilder, false, true);
                dVar.setStateListAnimator(null);
                sq0Var.addView(dVar, ha.e(-2, -1, 17));
                sq0Var.setOnClickListener(new yo0(up0Var, z9, i7, 1));
                dVar.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(d() ? 0 : 8);
                this.y = 60;
                addView(frameLayout2, ha.e(-1, qs.e3, 87));
                m();
                o();
            }
            i10 = 2131746668;
            str = null;
        } else {
            str = null;
            i10 = 2131746669;
        }
        str2 = id.M0(i10, str);
        sb2.append(str2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder3.setSpan(new wp(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(jg.g.l(2131746676, null, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new wp(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.w = spannableStringBuilder22;
        fi.d dVar2 = new fi.d(context, f6Var, true);
        this.x = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        dVar2.setRoundRadius(org.telegram.messenger.g0.L(19.0f));
        dVar2.i(spannableStringBuilder3, false, true);
        dVar2.setStateListAnimator(null);
        sq0Var.addView(dVar2, ha.e(-2, -1, 17));
        sq0Var.setOnClickListener(new yo0(up0Var, z9, i7, 1));
        dVar2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(d() ? 0 : 8);
        this.y = 60;
        addView(frameLayout2, ha.e(-1, qs.e3, 87));
        m();
        o();
    }

    public static void j(org.telegram.ui.ActionBar.z0 z0Var, v9 v9Var, Runnable runnable, int i7) {
        z0Var.setOnClickListener(new la(v9Var, i7, runnable, 23));
        z0Var.setOnLongClickListener(new sa(v9Var, i7, runnable));
    }

    public final void a() {
        v9 v9Var;
        z1 currentPage = getCurrentPage();
        if (currentPage == null || (v9Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i7 = v9Var.d;
        new n3(this.a, this.c, i7, new d4(this, i7, currentPage, 6)).show();
    }

    public final boolean b() {
        t9 t9Var = this.e;
        return t9Var.h() && t9Var.d().size() < ((org.telegram.messenger.j0) qp.s1(this.b).x7.t.b).c;
    }

    public final boolean c() {
        long j3 = this.c;
        int i7 = this.b;
        return j3 >= 0 ? j3 == 0 || j3 == p10.i(i7).e() : org.telegram.messenger.t3.w(5, qp.s1(i7).M0(Long.valueOf(-j3)));
    }

    public final boolean d() {
        return this.c < 0 && this.d.h != null;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.G3;
        LinearLayout linearLayout = this.D;
        fi.d dVar = this.x;
        long j3 = this.c;
        if (i7 == i11) {
            if (((Long) objArr[0]).longValue() != j3) {
                return;
            }
            dVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.y = 60;
            Boolean bool = this.d.h;
            if (bool != null) {
                this.F.a(bool.booleanValue(), true);
                return;
            }
            return;
        }
        if (i7 == qs.H3) {
            if (((Long) objArr[0]).longValue() != j3) {
                return;
            }
            f(true);
            o();
            return;
        }
        if (i7 == qs.r) {
            dVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.y = 60;
            setVisibleHeight(this.T);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.P <= 0) {
            return;
        }
        ArrayList d = this.e.d();
        int i7 = 0;
        while (true) {
            if (i7 >= d.size()) {
                i7 = -1;
                tL_starGiftCollection = null;
                break;
            } else {
                if (((TL_stars.TL_starGiftCollection) d.get(i7)).collection_id == this.P) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i7);
                    break;
                }
                i7++;
            }
        }
        if (i7 < 0 || tL_starGiftCollection == null) {
            return;
        }
        this.P = 0;
        this.n.d(tL_starGiftCollection.collection_id, i7 + 1);
    }

    public final void f(boolean z9) {
        ei.a aVar = this.h;
        if (aVar == null || this.n == null) {
            return;
        }
        aVar.o(z9);
        e();
    }

    public final boolean g() {
        if (this.O) {
            return true;
        }
        z1 currentPage = getCurrentPage();
        return currentPage != null && currentPage.h;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - k5.z(this.y, Math.max(org.telegram.messenger.g0.L(240.0f), this.T) + (-r0.getTop()), 1);
        if (this.T < org.telegram.messenger.g0.L(240.0f)) {
            translationY += Math.min(org.telegram.messenger.g0.L(240.0f) - this.T, org.telegram.messenger.g0.L(this.y));
        }
        return (int) (org.telegram.messenger.g0.L(this.y) - translationY);
    }

    public v9 getCurrentList() {
        z1 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public pj0 getCurrentListView() {
        z1 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public z1 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (z1) currentView;
    }

    public int getGiftsCount() {
        int i7;
        v9 v9Var;
        int i10;
        z1 currentPage = getCurrentPage();
        v9 v9Var2 = this.d;
        if (currentPage == null || (v9Var = currentPage.e) == v9Var2) {
            if (v9Var2 != null && (i7 = v9Var2.n) > 0) {
                return i7;
            }
        } else if (v9Var != null && (i10 = v9Var.n) > 0) {
            return i10;
        }
        long j3 = this.c;
        int i11 = this.b;
        if (j3 >= 0) {
            TLRPC.UserFull b22 = qp.s1(i11).b2(j3);
            if (b22 != null) {
                return b22.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull N0 = qp.s1(i11).N0(-j3);
        if (N0 != null) {
            return N0.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long j3 = 0;
        v9 v9Var = this.d;
        if (v9Var != null && !v9Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i7 = 0;
            for (int i10 = 0; i7 < 3 && i10 < v9Var.l.size(); i10++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) v9Var.l.get(i10)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.id))) {
                    j3 = Objects.hash(Long.valueOf(j3), Long.valueOf(document.id));
                    i7++;
                }
            }
        }
        return j3;
    }

    public float getTabsHeight() {
        ei.a aVar = this.h;
        float f10 = 0.0f;
        if (aVar.getViewPages() != null) {
            for (View view : aVar.getViewPages()) {
                if (view instanceof z1) {
                    f10 = (((z1) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f10;
                }
            }
        }
        return f10;
    }

    public float getTabsVisibility() {
        u61 u61Var = this.n;
        if (u61Var != null) {
            return u61Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, c20 c20Var) {
        f60 f60Var;
        Context context = getContext();
        Activity W = org.telegram.messenger.g0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
        f6 f6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, f6Var);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (str != null) {
            u1Var.R = id.M0(2131750216, null);
        } else {
            u1Var.R = id.M0(2131750096, null);
            u1Var.T = id.M0(2131750097, null);
        }
        n1 n1Var = new n1(this, context, f6Var);
        n1Var.r0 = true;
        n1Var.setOnEditorActionListener(new org.telegram.ui.web.p0(n1Var, c20Var, u1VarArr, currentFocus, 1));
        ui.b0(this.b).M(org.telegram.messenger.g0.G0(), true);
        n1Var.setTextSize(1, 18.0f);
        r6.V(n1Var, k6.j5, f6Var);
        r6.m(n1Var, 34, k6.Li, f6Var);
        n1Var.setHintText(id.M0(2131750098, null));
        n1Var.setFocusable(true);
        n1Var.setInputType(147457);
        r6.G(n1Var, k6.k6, k6.l6, k6.p7, f6Var);
        int i7 = 6;
        n1Var.setImeOptions(6);
        n1Var.setBackgroundDrawable(null);
        n1Var.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        int i10 = 3;
        n1Var.addTextChangedListener(new tb0(i10, n1Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        n1Var.setText(str);
        linearLayout.addView(n1Var, ha.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        u1Var.a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder.k(id.M0(str != null ? 2131751336 : 2131751753, null), new org.telegram.ui.web.a0(27, n1Var, c20Var));
        alertDialog$Builder.h(id.M0(2131752589, null), new z3.j(2));
        u1VarArr[0] = u1Var;
        k60 k60Var = this.I;
        if (k60Var != null && (f60Var = k60Var.m) != null) {
            f60Var.setSoftInputMode(48);
        }
        org.telegram.messenger.g0.Z2(W, this.a.getClassGuid());
        u1VarArr[0].setOnDismissListener(new hi.o0(this, n1Var, W, i7));
        u1VarArr[0].setOnShowListener(new kg.r(n1Var, i10));
        u1VarArr[0].show();
        org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr[0];
        u1Var2.j0 = false;
        u1Var2.d(-1);
        n1Var.setSelection(n1Var.getText().length());
    }

    public final void i() {
        z1 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i7) {
        if (i7 == 0) {
            return false;
        }
        int i10 = i7 - 1;
        if (i10 >= 0) {
            t9 t9Var = this.e;
            if (i10 < t9Var.d().size()) {
                v9 e10 = (i10 < 0 || i10 >= t9Var.d().size()) ? null : t9Var.e(((TL_stars.TL_starGiftCollection) t9Var.d().get(i10)).collection_id);
                if (e10 != null) {
                    return e10.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        gb gbVar;
        ei.a aVar = this.h;
        if (aVar == null) {
            return;
        }
        if (aVar.getCurrentPosition() == aVar.getNextPosition()) {
            nextPositionAlpha = k(aVar.getCurrentPosition()) ? 1.0f : 0.0f;
        } else {
            nextPositionAlpha = (aVar.getNextPositionAlpha() * (k(aVar.getNextPosition()) ? 1.0f : 0.0f)) + (aVar.getCurrentPositionAlpha() * (k(aVar.getCurrentPosition()) ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout = this.r;
        float z9 = k5.z(this.y, (-frameLayout.getTop()) + this.T, 1);
        float L = ((org.telegram.messenger.g0.L(68.0f) + 2) * nextPositionAlpha) + z9;
        boolean z10 = this.T > org.telegram.messenger.g0.L(184.0f);
        te.a aVar2 = this.R;
        aVar2.a(z10, true);
        float f10 = aVar2.e;
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + z9, (org.telegram.messenger.g0.L(16.0f) * nextPositionAlpha) + z9, f10);
        float f11 = (1.0f - nextPositionAlpha) * f10;
        this.G.setTranslationY(org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(60.0f) + L, L, f10) - org.telegram.messenger.g0.L(200.0f));
        frameLayout.setTranslationY(T1 - this.S);
        frameLayout.setAlpha(f11);
        frameLayout.setVisibility(f11 <= 0.0f ? 4 : 0);
        this.x.i((!this.e.h() || aVar.getPositionAnimated() < 0.5f) ? this.s : this.w, true, true);
        cc ccVar = cc.w;
        if (ccVar == null || (gbVar = ccVar.e) == null) {
            return;
        }
        gbVar.updatePosition();
    }

    public final void m() {
        fi.d dVar = this.x;
        dVar.updateColors();
        int i7 = k6.Ci;
        f6 f6Var = this.f;
        int f12 = ((up0) this).V.f1(k6.w0(i7, f6Var));
        if (!(dVar.getBackground() instanceof ShapeDrawable)) {
            dVar.setBackground(k6.d0(org.telegram.messenger.g0.L(19.0f), f12));
        } else if (((ShapeDrawable) dVar.getBackground()).getPaint().getColor() != f12) {
            k6.C1(f12, dVar.getBackground());
            dVar.invalidate();
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    z1 z1Var = (z1) view;
                    f6 f6Var2 = z1Var.c;
                    if (z1Var.r != null) {
                        z1Var.w.setTextColor(k6.w0(k6.G6, f6Var2));
                        z1Var.x.setTextColor(k6.w0(k6.Ci, f6Var2));
                    } else {
                        z1Var.E.setTextColor(k6.w0(k6.G6, f6Var2));
                        z1Var.F.setTextColor(k6.w0(k6.y6, f6Var2));
                        z1Var.G.updateColors();
                    }
                }
            }
        }
        this.E.setTextColor(k6.w0(k6.j5, f6Var));
    }

    public final void n() {
        for (View view : this.h.getViewPages()) {
            if (view instanceof z1) {
                z1 z1Var = (z1) view;
                fi.w3 w3Var = z1Var.f;
                int paddingTop = w3Var.getPaddingTop();
                z1Var.g();
                int paddingTop2 = paddingTop - w3Var.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.g0.J(w3Var, new k1(z1Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
        boolean z9 = !this.e.d().isEmpty() || b();
        ei.a aVar = this.h;
        if (aVar.getViewPages() != null) {
            for (View view : aVar.getViewPages()) {
                if (view instanceof z1) {
                    ((z1) view).setHasTabs(z9);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = this.b;
        qs.f(i7).c(this, qs.G3);
        qs.f(i7).c(this, qs.H3);
        qs.f(i7).c(this, qs.r);
        z1 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        v9 v9Var = this.d;
        if (v9Var != null) {
            v9Var.o = true;
            v9Var.a();
        }
        t9 t9Var = this.e;
        if (t9Var != null) {
            t9Var.j = true;
            t9Var.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        z1 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i7 = this.b;
        qs.f(i7).n(this, qs.G3);
        qs.f(i7).n(this, qs.H3);
        qs.f(i7).n(this, qs.r);
        v9 v9Var = this.d;
        if (v9Var != null) {
            v9Var.o = false;
        }
        t9 t9Var = this.e;
        if (t9Var != null) {
            t9Var.j = false;
        }
    }

    public final void p() {
        float f10;
        u61 u61Var = this.n;
        if (u61Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - org.telegram.messenger.g0.L(42.0f));
        float l10 = Utilities.l(org.telegram.messenger.g0.z1(min - this.K, -org.telegram.messenger.g0.L(42.0f), 0.0f));
        float T1 = org.telegram.messenger.g0.T1(0.9f, 1.0f, l10);
        u61Var.setTranslationY(min);
        u61Var.setScaleX(T1);
        u61Var.setScaleY(T1);
        ei.a aVar = this.h;
        if (aVar.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : aVar.getViewPages()) {
                if (view instanceof z1) {
                    f10 += ((z1) view).H ? 1.0f : 0.0f;
                }
            }
        } else {
            f10 = 0.0f;
        }
        u61Var.setAlpha(j9.a(f10, 0.0f, 1.0f) * l10);
    }

    public abstract void q(boolean z9);

    public void setButtonOffset(int i7) {
        if (this.S != i7) {
            this.S = i7;
            l();
        }
    }

    public void setGlassEngine(oi.q qVar) {
        this.N = qVar;
        ei.a aVar = this.h;
        qVar.c(aVar);
        for (View view : aVar.getViewPages()) {
            if (view instanceof z1) {
                qVar.b(((z1) view).f);
            }
        }
    }

    public void setPaddingTop(int i7) {
        if (this.K != i7) {
            this.K = i7;
            n();
            p();
            l();
        }
    }

    public void setReordering(boolean z9) {
        z1 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.setReordering(z9);
        }
    }

    public void setReorderingCollections(boolean z9) {
        if (this.O == z9) {
            return;
        }
        this.O = z9;
        q(g());
        this.n.setReordering(z9);
        if (z9) {
            org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.U4(false);
                org.telegram.messenger.g0.h3(new w8(profileActivity, 1));
            }
        }
        if (z9) {
            return;
        }
        h1 h1Var = this.Q;
        org.telegram.messenger.g0.r(h1Var);
        org.telegram.messenger.g0.h3(h1Var);
    }

    public void setVisibleHeight(int i7) {
        this.T = i7;
        l();
        ei.a aVar = this.h;
        if (aVar != null) {
            for (View view : aVar.getViewPages()) {
                if (view instanceof z1) {
                    ((z1) view).setVisibleHeight(this.T);
                }
            }
        }
    }
}
