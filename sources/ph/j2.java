package ph;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.aq0;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.v71;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dg0;
import org.telegram.ui.xy0;
import rh.e6;
import rh.u5;
import rh.v5;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class j2 extends FrameLayout implements us {
    public static final HashMap U = new HashMap();
    public final LinearLayout D;
    public final TextView E;
    public final ep F;
    public final FrameLayout G;
    public int H;
    public z60 I;
    public SpannableStringBuilder J;
    public int K;
    public int L;
    public int M;
    public ei.r N;
    public boolean O;
    public int P;
    public final m1 Q;
    public final fe.b R;
    public int S;
    public int T;
    public final org.telegram.ui.ActionBar.k2 a;
    public final int b;
    public final long c;
    public final v5 d;
    public final u5 e;
    public final p6 f;
    public final xy0 h;
    public final v71 n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder w;
    public final vh.d x;
    public int y;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0303  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j2(org.telegram.ui.ActionBar.k2 k2Var, Context context, int i10, long j10, p6 p6Var, tg.b bVar) {
        super(context);
        String str;
        int i11;
        String str2;
        this.H = -1;
        vq0 vq0Var = (vq0) this;
        this.Q = new m1(vq0Var, 0);
        this.R = new fe.b(0, new n1(vq0Var), gr.h, 380L, true);
        this.T = org.telegram.messenger.i0.q.y;
        this.a = k2Var;
        this.b = i10;
        if (o5.C(j10)) {
            TLRPC.EncryptedChat Z0 = vp.r1(i10).Z0(Integer.valueOf((int) (4294967295L & j10)));
            if (Z0 != null) {
                this.c = Z0.user_id;
            } else {
                this.c = j10;
            }
        } else {
            this.c = j10;
        }
        e6.y(i10, false).P(this.c);
        int i12 = 1;
        v5 G = e6.y(i10, false).G(this.c, true);
        this.d = G;
        u5 F = e6.y(i10, false).F(this.c, true);
        this.e = F;
        F.g = G;
        G.o = true;
        if ((k2Var instanceof ProfileActivity) && ((ProfileActivity) k2Var).u1) {
            G.g = 4;
            G.e = true;
            G.j(true);
        } else if (!G.e || G.g != 783) {
            G.g = 783;
            G.e = true;
            G.j(true);
        }
        G.b();
        this.f = p6Var;
        xy0 xy0Var = new xy0(vq0Var, context, k2Var, i12);
        this.h = xy0Var;
        xy0Var.setAllowDisallowInterceptTouch(true);
        xy0Var.setAdapter(new r1(vq0Var, i10, p6Var));
        addView(xy0Var, b6.e(-1, -1, zs.E1));
        v71 n10 = xy0Var.n(10, true);
        this.n = n10;
        n10.g(t6.ui, t6.G6, t6.si, t6.vi, t6.s8);
        n10.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        n10.setClipToPadding(false);
        n10.r = 12;
        n10.setPreTabClick(new n1(vq0Var));
        n10.setOnTabLongClick(new jg.q2(vq0Var, i10, k2Var, context, p6Var, 5));
        addView(n10, b6.e(-1, 42, 48));
        dg0 dg0Var = new dg0(context);
        vg.f c10 = bVar.c(dg0Var, new wg.b(t6.d6, p6Var), false);
        c10.p(org.telegram.messenger.i0.L(8.0f));
        c10.q(org.telegram.messenger.i0.L(22.0f));
        dg0Var.setBackground(c10);
        w7.e6.b(dg0Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e = b6.e(-1, 60, 87);
        e.bottomMargin += org.telegram.messenger.i0.n;
        addView(frameLayout, e);
        frameLayout.addView(dg0Var, b6.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.G = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.D = linearLayout;
        linearLayout.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i13 = t6.i6;
        org.telegram.ui.Cells.y a02 = t6.a0(t6.w0(i13, p6Var), 24, 24);
        w6 N = a7.N(i13);
        linearLayout.setBackground(a02);
        a7.k(linearLayout, a02, null, N, p6Var);
        ep epVar = new ep(24, context, p6Var);
        this.F = epVar;
        epVar.b(t6.h7, t6.j7, t6.k7);
        epVar.setDrawUnchecked(true);
        epVar.a(false, false);
        epVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(epVar, b6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.E = textView;
        a7.V(textView, t6.j5, p6Var);
        sc.e.u(textView, 1, 14.0f, null, 2131750266);
        linearLayout.addView(textView, b6.t(-2, -2, 16, 9, 0, 0, 0));
        dg0Var.addView(linearLayout, b6.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        w7.e6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new jg.w1(vq0Var, k2Var, i10, 23));
        Boolean bool = G.h;
        if (bool != null) {
            epVar.a(bool.booleanValue(), false);
        }
        TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(this.c));
        boolean z10 = this.c < 0 || !(Z1 == null || h20.B(Z1) || h20.t(Z1));
        StringBuilder sb2 = new StringBuilder("G ");
        if (z10) {
            long j11 = this.c;
            if (j11 >= 0) {
                str2 = cd.a0(null, null, 2131746681, o5.t(j11));
                sb2.append(str2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
                spannableStringBuilder.setSpan(new dq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a1.g.m(null, 2131746690, new StringBuilder("+ ")));
                spannableStringBuilder2.setSpan(new dq(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.w = spannableStringBuilder2;
                vh.d dVar = new vh.d(context, p6Var, true);
                this.x = dVar;
                dVar.setUseWrapContent(true);
                dVar.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
                dVar.setRoundRadius(org.telegram.messenger.i0.L(19.0f));
                dVar.i(spannableStringBuilder, false, true);
                dVar.setStateListAnimator(null);
                dg0Var.addView(dVar, b6.e(-2, -1, 17));
                dg0Var.setOnClickListener(new aq0(vq0Var, z10, i10, i12));
                dVar.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(!d() ? 0 : 8);
                this.y = 60;
                addView(frameLayout2, b6.e(-1, zs.e3, 87));
                m();
                o();
            }
            i11 = 2131746682;
            str = null;
        } else {
            str = null;
            i11 = 2131746683;
        }
        str2 = cd.L0(i11, str);
        sb2.append(str2);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder3.setSpan(new dq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder(a1.g.m(null, 2131746690, new StringBuilder("+ ")));
        spannableStringBuilder22.setSpan(new dq(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.w = spannableStringBuilder22;
        vh.d dVar2 = new vh.d(context, p6Var, true);
        this.x = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        dVar2.setRoundRadius(org.telegram.messenger.i0.L(19.0f));
        dVar2.i(spannableStringBuilder3, false, true);
        dVar2.setStateListAnimator(null);
        dg0Var.addView(dVar2, b6.e(-2, -1, 17));
        dg0Var.setOnClickListener(new aq0(vq0Var, z10, i10, i12));
        dVar2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(!d() ? 0 : 8);
        this.y = 60;
        addView(frameLayout2, b6.e(-1, zs.e3, 87));
        m();
        o();
    }

    public static void j(org.telegram.ui.ActionBar.b1 b1Var, v5 v5Var, Runnable runnable, int i10) {
        b1Var.setOnClickListener(new jg.w1(v5Var, i10, runnable, 22));
        b1Var.setOnLongClickListener(new sa(v5Var, i10, runnable));
    }

    public final void a() {
        v5 v5Var;
        f2 currentPage = getCurrentPage();
        if (currentPage == null || (v5Var = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i10 = v5Var.d;
        new t3(this.a, this.c, i10, new jg.o2(this, i10, currentPage, 4)).show();
    }

    public final boolean b() {
        u5 u5Var = this.e;
        return u5Var.h() && u5Var.d().size() < ((org.telegram.messenger.l0) vp.r1(this.b).y7.t.a).c;
    }

    public final boolean c() {
        long j10 = this.c;
        int i10 = this.b;
        return j10 >= 0 ? j10 == 0 || j10 == d20.i(i10).e() : org.telegram.messenger.w3.w(5, vp.r1(i10).L0(Long.valueOf(-j10)));
    }

    public final boolean d() {
        return this.c < 0 && this.d.h != null;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = zs.G3;
        LinearLayout linearLayout = this.D;
        vh.d dVar = this.x;
        long j10 = this.c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() != j10) {
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
        if (i10 == zs.H3) {
            if (((Long) objArr[0]).longValue() != j10) {
                return;
            }
            f(true);
            o();
            return;
        }
        if (i10 == zs.r) {
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
        xy0 xy0Var = this.h;
        if (xy0Var == null || this.n == null) {
            return;
        }
        xy0Var.o(z10);
        e();
    }

    public final boolean g() {
        if (this.O) {
            return true;
        }
        f2 currentPage = getCurrentPage();
        return currentPage != null && currentPage.h;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - m5.z(this.y, Math.max(org.telegram.messenger.i0.L(240.0f), this.T) + (-r0.getTop()), 1);
        if (this.T < org.telegram.messenger.i0.L(240.0f)) {
            translationY += Math.min(org.telegram.messenger.i0.L(240.0f) - this.T, org.telegram.messenger.i0.L(this.y));
        }
        return (int) (org.telegram.messenger.i0.L(this.y) - translationY);
    }

    public v5 getCurrentList() {
        f2 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public tk0 getCurrentListView() {
        f2 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public f2 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (f2) currentView;
    }

    public int getGiftsCount() {
        int i10;
        v5 v5Var;
        int i11;
        f2 currentPage = getCurrentPage();
        v5 v5Var2 = this.d;
        if (currentPage == null || (v5Var = currentPage.e) == v5Var2) {
            if (v5Var2 != null && (i10 = v5Var2.n) > 0) {
                return i10;
            }
        } else if (v5Var != null && (i11 = v5Var.n) > 0) {
            return i11;
        }
        long j10 = this.c;
        int i12 = this.b;
        if (j10 >= 0) {
            TLRPC.UserFull a2 = vp.r1(i12).a2(j10);
            if (a2 != null) {
                return a2.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull M0 = vp.r1(i12).M0(-j10);
        if (M0 != null) {
            return M0.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long j10 = 0;
        v5 v5Var = this.d;
        if (v5Var != null && !v5Var.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < v5Var.l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) v5Var.l.get(i11)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.id))) {
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.id));
                    i10++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        xy0 xy0Var = this.h;
        float f7 = 0.0f;
        if (xy0Var.getViewPages() != null) {
            for (View view : xy0Var.getViewPages()) {
                if (view instanceof f2) {
                    f7 = (((f2) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f7;
                }
            }
        }
        return f7;
    }

    public float getTabsVisibility() {
        v71 v71Var = this.n;
        if (v71Var != null) {
            return v71Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, q20 q20Var) {
        u60 u60Var;
        Context context = getContext();
        Activity W = org.telegram.messenger.i0.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.x1[] x1VarArr = new org.telegram.ui.ActionBar.x1[1];
        p6 p6Var = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        if (str != null) {
            x1Var.R = cd.L0(2131750224, null);
        } else {
            x1Var.R = cd.L0(2131750104, null);
            x1Var.T = cd.L0(2131750105, null);
        }
        t1 t1Var = new t1(this, context, p6Var);
        t1Var.r0 = true;
        t1Var.setOnEditorActionListener(new org.telegram.ui.web.q0(t1Var, q20Var, x1VarArr, currentFocus, 1));
        ui.b0(this.b).M(org.telegram.messenger.i0.G0(), true);
        t1Var.setTextSize(1, 18.0f);
        a7.V(t1Var, t6.j5, p6Var);
        a7.m(t1Var, 34, t6.Li, p6Var);
        t1Var.setHintText(cd.L0(2131750106, null));
        t1Var.setFocusable(true);
        t1Var.setInputType(147457);
        a7.G(t1Var, t6.k6, t6.l6, t6.p7, p6Var);
        t1Var.setImeOptions(6);
        t1Var.setBackgroundDrawable(null);
        t1Var.setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f));
        int i10 = 3;
        t1Var.addTextChangedListener(new jg.f3(i10, t1Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        t1Var.setText(str);
        linearLayout.addView(t1Var, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        x1Var.a = org.telegram.messenger.i0.L(292.0f);
        alertDialog$Builder.k(cd.L0(str != null ? 2131751336 : 2131751753, null), new org.telegram.ui.web.k0(i10, t1Var, q20Var));
        alertDialog$Builder.h(cd.L0(2131752589, null), new org.telegram.utils.twidget.t(7));
        x1VarArr[0] = x1Var;
        z60 z60Var = this.I;
        if (z60Var != null && (u60Var = z60Var.m) != null) {
            u60Var.setSoftInputMode(48);
        }
        org.telegram.messenger.i0.Y2(W, this.a.getClassGuid());
        x1VarArr[0].setOnDismissListener(new org.telegram.ui.Components.z1(this, t1Var, W, 4));
        x1VarArr[0].setOnShowListener(new ag.d0(t1Var, i10));
        x1VarArr[0].show();
        org.telegram.ui.ActionBar.x1 x1Var2 = x1VarArr[0];
        x1Var2.j0 = false;
        x1Var2.d(-1);
        t1Var.setSelection(t1Var.getText().length());
    }

    public final void i() {
        f2 currentPage = getCurrentPage();
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
            u5 u5Var = this.e;
            if (i11 < u5Var.d().size()) {
                v5 e = (i11 < 0 || i11 >= u5Var.d().size()) ? null : u5Var.e(((TL_stars.TL_starGiftCollection) u5Var.d().get(i11)).collection_id);
                if (e != null) {
                    return e.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        bb bbVar;
        xy0 xy0Var = this.h;
        if (xy0Var == null) {
            return;
        }
        if (xy0Var.getCurrentPosition() == xy0Var.getNextPosition()) {
            nextPositionAlpha = k(xy0Var.getCurrentPosition()) ? 1.0f : 0.0f;
        } else {
            nextPositionAlpha = (xy0Var.getNextPositionAlpha() * (k(xy0Var.getNextPosition()) ? 1.0f : 0.0f)) + (xy0Var.getCurrentPositionAlpha() * (k(xy0Var.getCurrentPosition()) ? 1.0f : 0.0f));
        }
        FrameLayout frameLayout = this.r;
        float z10 = m5.z(this.y, (-frameLayout.getTop()) + this.T, 1);
        float L = ((org.telegram.messenger.i0.L(68.0f) + 2) * nextPositionAlpha) + z10;
        boolean z11 = this.T > org.telegram.messenger.i0.L(184.0f);
        fe.b bVar = this.R;
        bVar.a(z11, true);
        float f7 = bVar.e;
        float T1 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(60.0f) + z10, (org.telegram.messenger.i0.L(16.0f) * nextPositionAlpha) + z10, f7);
        float f10 = (1.0f - nextPositionAlpha) * f7;
        this.G.setTranslationY(org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(60.0f) + L, L, f7) - org.telegram.messenger.i0.L(200.0f));
        frameLayout.setTranslationY(T1 - this.S);
        frameLayout.setAlpha(f10);
        frameLayout.setVisibility(f10 <= 0.0f ? 4 : 0);
        this.x.i((!this.e.h() || xy0Var.getPositionAnimated() < 0.5f) ? this.s : this.w, true, true);
        wb wbVar = wb.w;
        if (wbVar == null || (bbVar = wbVar.e) == null) {
            return;
        }
        bbVar.updatePosition();
    }

    public final void m() {
        vh.d dVar = this.x;
        dVar.updateColors();
        int i10 = t6.Ci;
        p6 p6Var = this.f;
        int c12 = ((vq0) this).V.c1(t6.w0(i10, p6Var));
        if (!(dVar.getBackground() instanceof ShapeDrawable)) {
            dVar.setBackground(t6.d0(org.telegram.messenger.i0.L(19.0f), c12));
        } else if (((ShapeDrawable) dVar.getBackground()).getPaint().getColor() != c12) {
            t6.C1(c12, dVar.getBackground());
            dVar.invalidate();
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    f2 f2Var = (f2) view;
                    p6 p6Var2 = f2Var.c;
                    if (f2Var.r != null) {
                        f2Var.w.setTextColor(t6.w0(t6.G6, p6Var2));
                        f2Var.x.setTextColor(t6.w0(t6.Ci, p6Var2));
                    } else {
                        f2Var.E.setTextColor(t6.w0(t6.G6, p6Var2));
                        f2Var.F.setTextColor(t6.w0(t6.y6, p6Var2));
                        f2Var.G.updateColors();
                    }
                }
            }
        }
        this.E.setTextColor(t6.w0(t6.j5, p6Var));
    }

    public final void n() {
        for (View view : this.h.getViewPages()) {
            if (view instanceof f2) {
                f2 f2Var = (f2) view;
                ii iiVar = f2Var.f;
                int paddingTop = iiVar.getPaddingTop();
                f2Var.g();
                int paddingTop2 = paddingTop - iiVar.getPaddingTop();
                if (paddingTop2 != 0) {
                    org.telegram.messenger.i0.J(iiVar, new p1(f2Var, paddingTop2, 0));
                }
            }
        }
    }

    public final void o() {
        boolean z10 = !this.e.d().isEmpty() || b();
        xy0 xy0Var = this.h;
        if (xy0Var.getViewPages() != null) {
            for (View view : xy0Var.getViewPages()) {
                if (view instanceof f2) {
                    ((f2) view).setHasTabs(z10);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.b;
        zs.f(i10).c(this, zs.G3);
        zs.f(i10).c(this, zs.H3);
        zs.f(i10).c(this, zs.r);
        f2 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        v5 v5Var = this.d;
        if (v5Var != null) {
            v5Var.o = true;
            v5Var.b();
        }
        u5 u5Var = this.e;
        if (u5Var != null) {
            u5Var.j = true;
            u5Var.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        f2 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.b;
        zs.f(i10).n(this, zs.G3);
        zs.f(i10).n(this, zs.H3);
        zs.f(i10).n(this, zs.r);
        v5 v5Var = this.d;
        if (v5Var != null) {
            v5Var.o = false;
        }
        u5 u5Var = this.e;
        if (u5Var != null) {
            u5Var.j = false;
        }
    }

    public final void p() {
        float f7;
        v71 v71Var = this.n;
        if (v71Var == null) {
            return;
        }
        float min = Math.min(this.K, getTabsHeight() - org.telegram.messenger.i0.L(42.0f));
        float l4 = Utilities.l(org.telegram.messenger.i0.z1(min - this.K, -org.telegram.messenger.i0.L(42.0f), 0.0f));
        float T1 = org.telegram.messenger.i0.T1(0.9f, 1.0f, l4);
        v71Var.setTranslationY(min);
        v71Var.setScaleX(T1);
        v71Var.setScaleY(T1);
        xy0 xy0Var = this.h;
        if (xy0Var.getViewPages() != null) {
            f7 = 0.0f;
            for (View view : xy0Var.getViewPages()) {
                if (view instanceof f2) {
                    f7 += ((f2) view).H ? 1.0f : 0.0f;
                }
            }
        } else {
            f7 = 0.0f;
        }
        v71Var.setAlpha(w7.u.a(f7, 0.0f, 1.0f) * l4);
    }

    public abstract void q(boolean z10);

    public void setButtonOffset(int i10) {
        if (this.S != i10) {
            this.S = i10;
            l();
        }
    }

    public void setGlassEngine(ei.r rVar) {
        this.N = rVar;
        xy0 xy0Var = this.h;
        rVar.c(xy0Var);
        for (View view : xy0Var.getViewPages()) {
            if (view instanceof f2) {
                rVar.b(((f2) view).f);
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
        f2 currentPage = getCurrentPage();
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
            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
            if (T instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) T;
                profileActivity.T4(false);
                org.telegram.messenger.i0.g3(new q1(profileActivity, 0));
            }
        }
        if (z10) {
            return;
        }
        m1 m1Var = this.Q;
        org.telegram.messenger.i0.r(m1Var);
        org.telegram.messenger.i0.g3(m1Var);
    }

    public void setVisibleHeight(int i10) {
        this.T = i10;
        l();
        xy0 xy0Var = this.h;
        if (xy0Var != null) {
            for (View view : xy0Var.getViewPages()) {
                if (view instanceof f2) {
                    ((f2) view).setVisibleHeight(this.T);
                }
            }
        }
    }
}
