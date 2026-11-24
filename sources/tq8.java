// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class tq8 extends FrameLayout implements gk7 {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final wf2 G;
    public final FrameLayout H;
    public int I;
    public cs5 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public qw4 O;
    public boolean P;
    public int Q;
    public final tp8 R;
    public final fm0 S;
    public int T;
    public int U;
    public final d a;
    public final int b;
    public final long c;
    public final xsa d;
    public final wsa e;
    public final wjb f;
    public final uq0 h;
    public final vec n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder w;
    public final u41 x;
    public byte y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tq8(d dVar, Context context, int i, long j, wjb wjbVar, kl0 kl0Var) {
        super(context);
        String str;
        int i2;
        String str2;
        long j2 = j;
        this.I = -1;
        lca lcaVar = (lca) this;
        this.R = new tp8(lcaVar, (byte) 0);
        this.S = new fm0(0, new wp8(lcaVar), s33.h, 380L, true);
        this.U = gl.q.y;
        this.a = dVar;
        this.b = i;
        if (cf3.B(j2)) {
            TLRPC.EncryptedChat Y0 = na7.q1(i).Y0(Integer.valueOf((int) (4294967295L & j2)));
            if (Y0 != null) {
                j2 = Y0.user_id;
                this.c = j2;
            } else {
                this.c = j2;
            }
        } else {
            this.c = j2;
        }
        long j3 = j2;
        gta.v(i, false).M(j3);
        byte b = 1;
        xsa D = gta.v(i, false).D(j3, true);
        this.d = D;
        wsa C = gta.v(i, false).C(j3, true);
        this.e = C;
        C.g = D;
        D.o = true;
        if ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).v1) {
            D.g = 4;
            D.e = true;
            D.k(true);
        } else if (!D.e || D.g != 783) {
            D.g = 783;
            D.e = true;
            D.k(true);
        }
        D.a();
        this.f = wjbVar;
        uq0 uq0Var = new uq0(lcaVar, context, dVar, b);
        this.h = uq0Var;
        uq0Var.setAllowDisallowInterceptTouch(true);
        uq0Var.setAdapter(new aq8(lcaVar, i, wjbVar));
        addView(uq0Var, nme.e(-1, -1, kk7.D1));
        vec l = uq0Var.l(10, true);
        this.n = l;
        l.h(bkb.wi, bkb.F6, bkb.ui, bkb.xi, bkb.r8);
        l.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        l.setClipToPadding(false);
        l.r = 12;
        l.setPreTabClick(new wp8(lcaVar));
        l.setOnTabLongClick(new gg(lcaVar, i, dVar, context, wjbVar));
        addView(l, nme.e(-1, 42, 48));
        a6 a6Var = new a6(context);
        il0 c = kl0Var.c(a6Var, new bl0(bkb.c6, wjbVar), false);
        c.q(gl.L(8.0f));
        c.r(gl.L(22.0f));
        a6Var.setBackground(c);
        ote.b(a6Var, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        FrameLayout.LayoutParams e = nme.e(-1, 60, 87);
        e.bottomMargin += gl.n;
        addView(frameLayout, e);
        frameLayout.addView(a6Var, nme.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setPadding(gl.L(12.0f), gl.L(8.0f), gl.L(12.0f), gl.L(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i3 = bkb.h6;
        ff0 Y = bkb.Y(bkb.v0(i3, wjbVar), 24, 24);
        vkb M = zkb.M(i3);
        linearLayout.setBackground(Y);
        zkb.j(linearLayout, Y, null, M, wjbVar);
        wf2 wf2Var = new wf2(24, wjbVar, context);
        this.G = wf2Var;
        wf2Var.b(bkb.g7, bkb.i7, bkb.j7);
        wf2Var.setDrawUnchecked(true);
        wf2Var.a(false, false);
        wf2Var.setDrawBackgroundAsArc(10);
        linearLayout.addView(wf2Var, nme.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.F = textView;
        zkb.X(textView, bkb.i5, wjbVar);
        ir2.r(14.0f, 1, 2131750241, textView, null);
        linearLayout.addView(textView, nme.t(-2, -2, 16, 9, 0, 0, 0));
        a6Var.addView(linearLayout, nme.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        ote.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new wg((Object) lcaVar, (Object) dVar, i, (byte) 13));
        Boolean bool = D.h;
        if (bool != null) {
            wf2Var.a(bool.booleanValue(), false);
        }
        TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j3));
        boolean z = j3 < 0 || !(V1 == null || l7c.D(V1) || l7c.v(V1));
        if (!z) {
            str = null;
            i2 = 2131746475;
        } else {
            if (j3 >= 0) {
                str2 = k96.a0(null, null, 2131746473, cf3.s(j3));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("G ".concat(str2));
                spannableStringBuilder.setSpan(new cm2(R.drawable.filled_gift_simple, 0), 0, 1, 33);
                this.s = spannableStringBuilder;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("+ ".concat(k96.M0(2131746482, null)));
                spannableStringBuilder2.setSpan(new cm2(R.drawable.filled_add_album, 0), 0, 1, 33);
                this.w = spannableStringBuilder2;
                u41 u41Var = new u41(wjbVar, context, true);
                this.x = u41Var;
                u41Var.setUseWrapContent(true);
                u41Var.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
                u41Var.setRoundRadius(gl.L(19.0f));
                u41Var.i(spannableStringBuilder, false, true);
                u41Var.setStateListAnimator(null);
                a6Var.addView(u41Var, nme.e(-2, -1, 17));
                a6Var.setOnClickListener(new yp8(lcaVar, z, i, (byte) 0));
                u41Var.setVisibility(!d() ? 8 : 0);
                linearLayout.setVisibility(!d() ? 0 : 8);
                this.y = (byte) 60;
                addView(frameLayout2, nme.e(-1, kk7.d3, 87));
                m();
                o();
            }
            i2 = 2131746474;
            str = null;
        }
        str2 = k96.M0(i2, str);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("G ".concat(str2));
        spannableStringBuilder3.setSpan(new cm2(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder22 = new SpannableStringBuilder("+ ".concat(k96.M0(2131746482, null)));
        spannableStringBuilder22.setSpan(new cm2(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.w = spannableStringBuilder22;
        u41 u41Var2 = new u41(wjbVar, context, true);
        this.x = u41Var2;
        u41Var2.setUseWrapContent(true);
        u41Var2.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        u41Var2.setRoundRadius(gl.L(19.0f));
        u41Var2.i(spannableStringBuilder3, false, true);
        u41Var2.setStateListAnimator(null);
        a6Var.addView(u41Var2, nme.e(-2, -1, 17));
        a6Var.setOnClickListener(new yp8(lcaVar, z, i, (byte) 0));
        u41Var2.setVisibility(!d() ? 8 : 0);
        linearLayout.setVisibility(!d() ? 0 : 8);
        this.y = (byte) 60;
        addView(frameLayout2, nme.e(-1, kk7.d3, 87));
        m();
        o();
    }

    public static void j(a8 a8Var, final xsa xsaVar, final Runnable runnable, final int i) {
        a8Var.setOnClickListener(new View.OnClickListener() { // from class: up8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xsa xsaVar2 = xsa.this;
                xsaVar2.getClass();
                short s = i;
                int i2 = (s & 15) != 0 ? 15 : (s & 768) != 0 ? 768 : 0;
                int flag = TLObject.setFlag(xsaVar2.g & i2, s, !TLObject.hasFlag(r2, s));
                if (flag == 0) {
                    flag = i2 & (~s);
                }
                int i3 = xsaVar2.g;
                int i4 = ((~i2) & i3) | flag;
                if (i3 != i4) {
                    xsaVar2.g = i4;
                    xsaVar2.k(true);
                }
                runnable.run();
            }
        });
        a8Var.setOnLongClickListener(new View.OnLongClickListener() { // from class: vp8
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                xsa.this.g(i, true);
                runnable.run();
                return true;
            }
        });
    }

    public final void a() {
        xsa xsaVar;
        pq8 currentPage = getCurrentPage();
        if (currentPage == null || (xsaVar = currentPage.e) == null || !currentPage.d) {
            return;
        }
        int i = xsaVar.d;
        new ny9(this.a, this.c, i, new a61((Object) this, i, (Object) currentPage, (byte) 3)).show();
    }

    public final boolean b() {
        wsa wsaVar = this.e;
        return wsaVar.h() && wsaVar.d().size() < na7.q1(this.b).k4.x.f();
    }

    public final boolean c() {
        long j = this.c;
        int i = this.b;
        return j >= 0 ? j == 0 || j == y6c.h(i).e() : hc2.w(5, na7.q1(i).K0(Long.valueOf(-j)));
    }

    public final boolean d() {
        return this.c < 0 && this.d.h != null;
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.H3;
        LinearLayout linearLayout = this.E;
        u41 u41Var = this.x;
        long j = this.c;
        if (i == i3) {
            if (((Long) objArr[0]).longValue() == j) {
                u41Var.setVisibility(d() ? 8 : 0);
                linearLayout.setVisibility(d() ? 0 : 8);
                this.y = (byte) 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.G.a(bool.booleanValue(), true);
                    return;
                }
                return;
            }
            return;
        }
        if (i == kk7.I3) {
            if (((Long) objArr[0]).longValue() == j) {
                f(true);
                o();
                return;
            }
            return;
        }
        if (i == 2) {
            u41Var.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.y = (byte) 60;
            setVisibleHeight(this.U);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.Q > 0) {
            ArrayList d = this.e.d();
            int i = 0;
            while (true) {
                if (i >= d.size()) {
                    i = -1;
                    tL_starGiftCollection = null;
                    break;
                } else {
                    if (((TL_stars.TL_starGiftCollection) d.get(i)).collection_id == this.Q) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (i < 0 || tL_starGiftCollection == null) {
                return;
            }
            this.Q = 0;
            this.n.e(tL_starGiftCollection.collection_id, i + 1);
        }
    }

    public final void f(boolean z) {
        uq0 uq0Var = this.h;
        if (uq0Var == null || this.n == null) {
            return;
        }
        uq0Var.m(z);
        e();
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        pq8 currentPage = getCurrentPage();
        return currentPage != null && currentPage.h;
    }

    public int getBottomOffset() {
        float translationY = this.r.getTranslationY() - ls6.x(this.y, Math.max(gl.L(240.0f), this.U) + (-r0.getTop()), 1);
        if (this.U < gl.L(240.0f)) {
            translationY += Math.min(gl.L(240.0f) - this.U, gl.L(this.y));
        }
        return (int) (gl.L(this.y) - translationY);
    }

    public xsa getCurrentList() {
        pq8 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.e : this.d;
    }

    public o39 getCurrentListView() {
        pq8 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public pq8 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (pq8) currentView;
    }

    public int getGiftsCount() {
        int i;
        xsa xsaVar;
        int i2;
        pq8 currentPage = getCurrentPage();
        xsa xsaVar2 = this.d;
        if (currentPage == null || (xsaVar = currentPage.e) == xsaVar2) {
            if (xsaVar2 != null && (i = xsaVar2.n) > 0) {
                return i;
            }
        } else if (xsaVar != null && (i2 = xsaVar.n) > 0) {
            return i2;
        }
        long j = this.c;
        int i3 = this.b;
        if (j >= 0) {
            TLRPC.UserFull W1 = na7.q1(i3).W1(j);
            if (W1 != null) {
                return W1.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull L0 = na7.q1(i3).L0(-j);
        if (L0 != null) {
            return L0.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long j = 0;
        xsa xsaVar = this.d;
        if (xsaVar != null && !xsaVar.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (int i2 = 0; i < 3 && i2 < xsaVar.l.size(); i2++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) xsaVar.l.get(i2)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.id))) {
                    j = Objects.hash(Long.valueOf(j), Long.valueOf(document.id));
                    i++;
                }
            }
        }
        return j;
    }

    public float getTabsHeight() {
        uq0 uq0Var = this.h;
        float f = 0.0f;
        if (uq0Var.getViewPages() != null) {
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof pq8) {
                    f = (((pq8) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f;
                }
            }
        }
        return f;
    }

    public float getTabsVisibility() {
        vec vecVar = this.n;
        if (vecVar != null) {
            return vecVar.getAlpha();
        }
        return 0.0f;
    }

    public final void h(p8c p8cVar, String str) {
        xr5 xr5Var;
        Context context = getContext();
        Activity W = gl.W(context);
        View currentFocus = W != null ? W.getCurrentFocus() : null;
        byte b = 1;
        hd[] hdVarArr = new hd[1];
        wjb wjbVar = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        hd hdVar = alertDialog$Builder.a;
        if (str != null) {
            hdVar.S = k96.M0(2131750199, null);
        } else {
            hdVar.S = k96.M0(2131750079, null);
            hdVar.U = k96.M0(2131750080, null);
        }
        dq8 dq8Var = new dq8(this, context, wjbVar);
        dq8Var.s0 = true;
        dq8Var.setOnEditorActionListener(new xu0(dq8Var, p8cVar, hdVarArr, currentFocus, (byte) 1));
        hq6.d0(this.b).O(gl.F0(), true);
        dq8Var.setTextSize(1, 18.0f);
        zkb.X(dq8Var, bkb.i5, wjbVar);
        zkb.l(dq8Var, 34, bkb.Ni, wjbVar);
        dq8Var.setHintText(k96.M0(2131750081, null));
        dq8Var.setFocusable(true);
        dq8Var.setInputType(147457);
        zkb.F(dq8Var, bkb.j6, bkb.k6, bkb.o7, wjbVar);
        byte b2 = 6;
        dq8Var.setImeOptions(6);
        dq8Var.setBackgroundDrawable(null);
        dq8Var.setPadding(0, gl.L(6.0f), 0, gl.L(6.0f));
        dq8Var.addTextChangedListener(new fd6(dq8Var, b));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        dq8Var.setText(str);
        linearLayout.addView(dq8Var, nme.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        hdVar.a = gl.L(292.0f);
        alertDialog$Builder.j(k96.M0(str != null ? 2131751323 : 2131751741, null), new dx6((Object) dq8Var, (Object) p8cVar, (byte) 29));
        byte b3 = 5;
        alertDialog$Builder.g(k96.M0(2131752577, null), new sc8((byte) 5));
        hdVarArr[0] = hdVar;
        cs5 cs5Var = this.J;
        if (cs5Var != null && (xr5Var = cs5Var.m) != null) {
            xr5Var.setSoftInputMode(48);
        }
        gl.U2(W, this.a.getClassGuid());
        hdVarArr[0].setOnDismissListener(new ag(this, dq8Var, W, b2));
        hdVarArr[0].setOnShowListener(new jg(dq8Var, b3));
        hdVarArr[0].show();
        hd hdVar2 = hdVarArr[0];
        hdVar2.k0 = false;
        hdVar2.c(-1);
        dq8Var.setSelection(dq8Var.getText().length());
    }

    public final void i() {
        pq8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i) {
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            wsa wsaVar = this.e;
            if (i2 < wsaVar.d().size()) {
                xsa e = (i2 < 0 || i2 >= wsaVar.d().size()) ? null : wsaVar.e(((TL_stars.TL_starGiftCollection) wsaVar.d().get(i2)).collection_id);
                if (e != null) {
                    return e.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        q11 q11Var;
        uq0 uq0Var = this.h;
        if (uq0Var != null) {
            if (uq0Var.getCurrentPosition() == uq0Var.getNextPosition()) {
                nextPositionAlpha = k(uq0Var.getCurrentPosition()) ? 1.0f : 0.0f;
            } else {
                nextPositionAlpha = (uq0Var.getNextPositionAlpha() * (k(uq0Var.getNextPosition()) ? 1.0f : 0.0f)) + (uq0Var.getCurrentPositionAlpha() * (k(uq0Var.getCurrentPosition()) ? 1.0f : 0.0f));
            }
            FrameLayout frameLayout = this.r;
            float x = ls6.x(this.y, (-frameLayout.getTop()) + this.U, 1);
            float L = ((gl.L(68.0f) + 2) * nextPositionAlpha) + x;
            boolean z = this.U > gl.L(184.0f);
            fm0 fm0Var = this.S;
            fm0Var.a(z, true);
            float f = fm0Var.e;
            float R1 = gl.R1(gl.L(60.0f) + x, (gl.L(16.0f) * nextPositionAlpha) + x, f);
            float f2 = (1.0f - nextPositionAlpha) * f;
            this.H.setTranslationY(gl.R1(gl.L(60.0f) + L, L, f) - gl.L(200.0f));
            frameLayout.setTranslationY(R1 - this.T);
            frameLayout.setAlpha(f2);
            frameLayout.setVisibility(f2 <= 0.0f ? 4 : 0);
            this.x.i((!this.e.h() || uq0Var.getPositionAnimated() < 0.5f) ? this.s : this.w, true, true);
            m21 m21Var = m21.w;
            if (m21Var == null || (q11Var = m21Var.e) == null) {
                return;
            }
            q11Var.updatePosition();
        }
    }

    public final void m() {
        u41 u41Var = this.x;
        u41Var.updateColors();
        int i = bkb.Ei;
        wjb wjbVar = this.f;
        int c1 = ((lca) this).W.c1(bkb.v0(i, wjbVar));
        if (!(u41Var.getBackground() instanceof ShapeDrawable)) {
            u41Var.setBackground(bkb.b0(gl.L(19.0f), c1));
        } else if (((ShapeDrawable) u41Var.getBackground()).getPaint().getColor() != c1) {
            bkb.A1(c1, u41Var.getBackground());
            u41Var.invalidate();
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    pq8 pq8Var = (pq8) view;
                    wjb wjbVar2 = pq8Var.c;
                    if (pq8Var.r != null) {
                        pq8Var.w.setTextColor(bkb.v0(bkb.F6, wjbVar2));
                        pq8Var.x.setTextColor(bkb.v0(bkb.Ei, wjbVar2));
                    } else {
                        pq8Var.F.setTextColor(bkb.v0(bkb.F6, wjbVar2));
                        pq8Var.G.setTextColor(bkb.v0(bkb.x6, wjbVar2));
                        pq8Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(bkb.v0(bkb.i5, wjbVar));
    }

    public final void n() {
        byte b = 0;
        for (View view : this.h.getViewPages()) {
            if (view instanceof pq8) {
                pq8 pq8Var = (pq8) view;
                va vaVar = pq8Var.f;
                int paddingTop = vaVar.getPaddingTop();
                pq8Var.g();
                int paddingTop2 = paddingTop - vaVar.getPaddingTop();
                if (paddingTop2 != 0) {
                    gl.J(vaVar, new zp8(pq8Var, paddingTop2, b));
                }
            }
        }
    }

    public final void o() {
        boolean z = !this.e.d().isEmpty() || b();
        uq0 uq0Var = this.h;
        if (uq0Var.getViewPages() != null) {
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof pq8) {
                    ((pq8) view).setHasTabs(z);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.b;
        kk7.f(i).b(this, kk7.H3);
        kk7.f(i).b(this, kk7.I3);
        kk7.f(i).b(this, 2);
        pq8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        xsa xsaVar = this.d;
        if (xsaVar != null) {
            xsaVar.o = true;
            xsaVar.a();
        }
        wsa wsaVar = this.e;
        if (wsaVar != null) {
            wsaVar.j = true;
            wsaVar.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        pq8 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i = this.b;
        kk7.f(i).n(this, kk7.H3);
        kk7.f(i).n(this, kk7.I3);
        kk7.f(i).n(this, 2);
        xsa xsaVar = this.d;
        if (xsaVar != null) {
            xsaVar.o = false;
        }
        wsa wsaVar = this.e;
        if (wsaVar != null) {
            wsaVar.j = false;
        }
    }

    public final void p() {
        float f;
        vec vecVar = this.n;
        if (vecVar == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - gl.L(42.0f));
        float l = Utilities.l(gl.x1(min - this.L, -gl.L(42.0f), 0.0f));
        float R1 = gl.R1(0.9f, 1.0f, l);
        vecVar.setTranslationY(min);
        vecVar.setScaleX(R1);
        vecVar.setScaleY(R1);
        uq0 uq0Var = this.h;
        if (uq0Var.getViewPages() != null) {
            f = 0.0f;
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof pq8) {
                    f += ((pq8) view).I ? 1.0f : 0.0f;
                }
            }
        } else {
            f = 0.0f;
        }
        vecVar.setAlpha(moe.a(f, 0.0f, 1.0f) * l);
    }

    public abstract void q(boolean z);

    public void setButtonOffset(int i) {
        if (this.T != i) {
            this.T = i;
            l();
        }
    }

    public void setGlassEngine(qw4 qw4Var) {
        this.O = qw4Var;
        uq0 uq0Var = this.h;
        qw4Var.c(uq0Var);
        for (View view : uq0Var.getViewPages()) {
            if (view instanceof pq8) {
                qw4Var.b(((pq8) view).f);
            }
        }
    }

    public void setPaddingTop(int i) {
        if (this.L != i) {
            this.L = i;
            n();
            p();
            l();
        }
    }

    public void setReordering(boolean z) {
        pq8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.setReordering(z);
        }
    }

    public void setReorderingCollections(boolean z) {
        if (this.P != z) {
            this.P = z;
            q(g());
            this.n.setReordering(z);
            if (z) {
                d S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.j3(false);
                    gl.c3(new v36(profileActivity, (byte) 28));
                }
            }
            if (z) {
                return;
            }
            tp8 tp8Var = this.R;
            gl.r(tp8Var);
            gl.c3(tp8Var);
        }
    }

    public void setVisibleHeight(int i) {
        this.U = i;
        l();
        uq0 uq0Var = this.h;
        if (uq0Var != null) {
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof pq8) {
                    ((pq8) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
