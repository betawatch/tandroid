package xg;

import ai.b3;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import b8.pf;
import ci.e9;
import gi.o1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import k2.p1;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.g5;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.li;
import org.telegram.messenger.m5;
import org.telegram.messenger.n10;
import org.telegram.messenger.t1;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gg0;
import org.telegram.ui.hg0;
import org.telegram.ui.ig0;
import org.telegram.ui.p00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class e1 extends ma implements cs {
    public static c1 C2;
    public boolean A2;
    public int B2;
    public final int Q1;
    public final ig0 R1;
    public final hg0 S1;
    public final org.telegram.ui.Components.voip.r0 T1;
    public final gg0 U1;
    public final wo V1;
    public final bh.a W1;
    public final FrameLayout X1;
    public final ArrayList Y1;
    public final ArrayList Z1;
    public final HashSet a2;
    public final ArrayList b2;
    public final ArrayList c2;
    public final ArrayList d2;
    public final HashMap e2;
    public final ArrayList f2;
    public final LinkedHashMap g2;
    public String h2;
    public yg.h i2;
    public int j2;
    public final ArrayList k2;
    public boolean l2;
    public float m2;
    public yo n2;
    public final t1 o2;
    public final wi.i0 p2;
    public int q2;
    public xp r2;
    public String s2;
    public p00 t2;
    public u10 u2;
    public final HashSet v2;
    public n10 w2;
    public xp x2;
    public xp y2;
    public boolean z2;

    public e1(Context context, int i3, t1 t1Var, int i10, e6 e6Var) {
        super(context, null, true, false, e6Var);
        float f10;
        this.Y1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Z1 = arrayList;
        HashSet hashSet = new HashSet();
        this.a2 = hashSet;
        this.b2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.c2 = arrayList2;
        this.d2 = new ArrayList();
        this.e2 = new HashMap();
        this.f2 = new ArrayList();
        this.g2 = new LinkedHashMap();
        this.j2 = org.telegram.messenger.g0.L(120.0f);
        this.k2 = new ArrayList();
        this.l2 = false;
        this.p2 = new wi.i0(this, 2);
        this.q2 = -1;
        this.v2 = new HashSet();
        this.a = i3;
        int i11 = k6.h5;
        P(i11);
        this.s = false;
        this.Q1 = i10;
        this.o2 = t1Var;
        yg.h hVar = this.i2;
        int i12 = 1;
        if (hVar != null) {
            hVar.y = i10 == 4;
        }
        gg0 gg0Var = new gg0(i12, getContext(), e6Var);
        this.U1 = gg0Var;
        gg0Var.setOnCloseClickListener(new x0(this, 11));
        gg0Var.setText(O0());
        gg0Var.setCloseImageVisible(false);
        gg0Var.f.c(false, 0.0f);
        this.n2 = new yo(this, 3);
        hg0 hg0Var = new hg0(this, getContext(), e6Var, i12);
        this.S1 = hg0Var;
        r6.i(i11, hg0Var, e6Var);
        hg0Var.setOnSearchTextChange(new y0(this, 3));
        hg0Var.b.r(bd.M0((!hashSet.isEmpty() || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2131745846 : 2131749658, null), false);
        org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(16, getContext(), this);
        this.T1 = r0Var;
        ViewGroup viewGroup = this.b;
        int i13 = this.u0;
        viewGroup.addView(gg0Var, 0, mf.f(-2.0f, -1, 55, i13, 0, i13, 0));
        ViewGroup viewGroup2 = this.b;
        int i14 = this.u0;
        viewGroup2.addView(hg0Var, mf.f(-2.0f, -1, 55, i14, 0, i14, 0));
        ViewGroup viewGroup3 = this.b;
        int i15 = this.u0;
        viewGroup3.addView(r0Var, mf.f(1.0f, -1, 55, i15, 0, i15, 0));
        bh.a aVar = new bh.a(getContext(), e6Var, (tj0) null);
        this.W1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        r6.i(i11, aVar, e6Var);
        if (i10 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i16 = k6.i6;
            org.telegram.ui.Cells.y a02 = k6.a0(k6.w0(i16, this.J0), 6, 6);
            n6 N = r6.N(i16);
            linearLayout.setBackground(a02);
            r6.k(linearLayout, a02, null, N, e6Var);
            wo woVar = new wo(24, context, e6Var);
            this.V1 = woVar;
            woVar.b(k6.Ci, k6.j7, k6.k7);
            woVar.setDrawUnchecked(true);
            woVar.a(false, false);
            woVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(woVar, mf.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            r6.V(textView, k6.j5, e6Var);
            p1.u(textView, 1, 14.0f, null, 2131751825);
            linearLayout.addView(textView, mf.t(-2, -2, 16, 9, 0, 0, 0));
            pf.b(linearLayout, 0.025f, 1.5f);
            final int i17 = 0;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: xg.b1
                public final /* synthetic */ e1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            this.b.V1.a(!r3.a.q, true);
                            break;
                        default:
                            this.b.k1();
                            break;
                    }
                }
            });
            aVar.addView(linearLayout, mf.t(-2, -2, 17, 0, 0, 0, 8));
        }
        final int i18 = 1;
        ig0 ig0Var = new ig0(this, getContext(), e6Var, 1);
        this.R1 = ig0Var;
        if (i10 == 4) {
            f10 = 0.0f;
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        } else {
            f10 = 0.0f;
        }
        ig0Var.setOnClickListener(new View.OnClickListener(this) { // from class: xg.b1
            public final /* synthetic */ e1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        this.b.V1.a(!r3.a.q, true);
                        break;
                    default:
                        this.b.k1();
                        break;
                }
            }
        });
        aVar.addView(ig0Var, mf.r(-1, 48, 87));
        if (i10 == 4) {
            ViewGroup viewGroup4 = this.b;
            int i19 = this.u0;
            viewGroup4.addView(aVar, mf.f(-2.0f, -1, 87, i19, 0, i19, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.X1 = frameLayout;
        ViewGroup viewGroup5 = this.b;
        int i20 = this.u0;
        viewGroup5.addView(frameLayout, mf.f(300.0f, -1, 87, i20, 0, i20, org.telegram.messenger.g0.L(68.0f)));
        yg.h hVar2 = this.i2;
        tj0 tj0Var = this.l1;
        hVar2.n = arrayList;
        hVar2.f = tj0Var;
        int i21 = this.u0;
        tj0Var.setPadding(i21, 0, i21, org.telegram.messenger.g0.L(i10 != 1 ? 60.0f : f10));
        this.l1.j(new wh.d(this, 2));
        this.l1.setOnItemClickListener(new o4.r0(this, i10, e6Var, i3));
        if (i10 == 4) {
            this.l1.setOnItemLongClickListener((ij0) new k2.q(this, i10, 19));
        }
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(xq.h);
        int i22 = 0;
        kVar.C = false;
        kVar.m = false;
        this.l1.setItemAnimator(kVar);
        this.l1.i(new o1(this, 9));
        hg0Var.setText("");
        hg0Var.d.b(false);
        hg0Var.b(false, hashSet, new x0(this, 12), null);
        gg0Var.setText(O0());
        ia iaVar = this.m1;
        if (iaVar != null) {
            iaVar.setTitle(O0());
        }
        n1(false);
        j1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(li.b0(this.a).j1);
        }
        p1(false, true);
        if (i10 == 0 || i10 == 2) {
            s.j(i3, null, new y0(this, i22));
        }
        if (i10 == 0 || i10 == 2) {
            e9.y(i3, false).U();
        }
    }

    public static boolean i1(Intent intent) {
        String scheme;
        String path;
        Uri data = intent.getData();
        if (data != null && (scheme = data.getScheme()) != null) {
            if (scheme.equals("http") || scheme.equals("https")) {
                String lowerCase = data.getHost().toLowerCase();
                if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = data.getPath()) != null && path.startsWith("/premium_multigift")) {
                    l1(0, null);
                    return true;
                }
            } else if (scheme.equals("tg")) {
                String uri = data.toString();
                if (uri.startsWith("tg:premium_multigift") || uri.startsWith("tg://premium_multigift")) {
                    l1(0, null);
                    return true;
                }
            }
        }
        return false;
    }

    public static e1 l1(int i3, t1 t1Var) {
        d2 Q = LaunchActivity.Q();
        if (Q == null) {
            return null;
        }
        c1 c1Var = C2;
        if (c1Var != null) {
            return c1Var;
        }
        c1 c1Var2 = new c1(Q.getContext(), Q.getCurrentAccount(), t1Var, i3, Q.getResourceProvider());
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(Q)) {
            c1Var2.a0(Q);
        }
        Q.showDialog(c1Var2);
        C2 = c1Var2;
        return c1Var2;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        C2 = null;
        org.telegram.messenger.g0.r(this.p2);
    }

    @Override // org.telegram.ui.Components.ma
    public final sj0 L0(tj0 tj0Var) {
        yg.h hVar = new yg.h(getContext(), this.J0, false);
        this.i2 = hVar;
        hVar.s = true;
        return hVar;
    }

    @Override // org.telegram.ui.Components.ma
    public final CharSequence O0() {
        String str = this.s2;
        if (str != null) {
            return str;
        }
        int i3 = this.Q1;
        if (i3 != 0) {
            if (i3 == 1) {
                return bd.M0(2131749615, null);
            }
            if (i3 != 2) {
                return i3 != 4 ? bd.M0(2131749608, null) : bd.M0(2131743435, null);
            }
        }
        return bd.M0(2131749609, null);
    }

    @Override // org.telegram.ui.Components.ma
    public final void R0(Canvas canvas, int i3) {
        float max = Math.max(i3, org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(8.0f)) + org.telegram.messenger.g0.L(8.0f);
        gg0 gg0Var = this.U1;
        gg0Var.setTranslationY(max);
        float translationY = gg0Var.getTranslationY() + gg0Var.getMeasuredHeight();
        hg0 hg0Var = this.S1;
        hg0Var.setTranslationY(translationY);
        float translationY2 = hg0Var.getTranslationY() + hg0Var.getMeasuredHeight();
        this.T1.setTranslationY(translationY2);
        this.l1.setTranslationY((r2.getMeasuredHeight() + (hg0Var.getMeasuredHeight() + gg0Var.getMeasuredHeight())) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void c0(Configuration configuration) {
        o1(false, true);
    }

    public final int d1(String str, ArrayList arrayList, ArrayList arrayList2) {
        int i3 = 0;
        if (arrayList2.isEmpty()) {
            return 0;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user != null && !user.bot && !l10.A(user.id)) {
                long j10 = user.id;
                if (j10 != 0 && !this.v2.contains(Long.valueOf(j10))) {
                    Long valueOf = Long.valueOf(user.id);
                    HashSet hashSet = this.a2;
                    hashSet.contains(valueOf);
                    i3 += org.telegram.messenger.g0.L(56.0f);
                    yg.g c2 = yg.g.c(user, hashSet.contains(Long.valueOf(user.id)));
                    g1(c2);
                    arrayList3.add(c2);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i3;
        }
        int L = org.telegram.messenger.g0.L(32.0f) + i3;
        arrayList.add(yg.g.b(str));
        arrayList.addAll(arrayList3);
        return L;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.S2) {
            dismiss();
            return;
        }
        if (i3 == hs.O) {
            org.telegram.messenger.g0.h3(new x0(this, 0));
        } else if (i3 == hs.S0) {
            org.telegram.messenger.g0.h3(new x0(this, 6));
        } else if (i3 == hs.E0) {
            org.telegram.messenger.g0.h3(new x0(this, 10));
        }
    }

    @Override // org.telegram.ui.ActionBar.t2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.z1
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.S1.getEditText());
        super.dismiss();
    }

    public final void e1() {
        int i3;
        if (!this.a2.isEmpty() || (i3 = this.Q1) == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
            if (this.l2) {
                return;
            }
            this.l2 = true;
            org.telegram.messenger.g0.i3(new x0(this, 3), 10L);
            return;
        }
        if (this.l2) {
            this.l2 = false;
            org.telegram.messenger.g0.i3(new x0(this, 4), 10L);
        }
    }

    public final void f1() {
        if (TextUtils.isEmpty(this.h2)) {
            return;
        }
        this.h2 = null;
        this.S1.setText("");
        org.telegram.messenger.g0.r(this.p2);
        o1(true, true);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [xg.z0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [xg.z0] */
    public final yg.g g1(yg.g gVar) {
        int i3 = this.Q1;
        if (i3 != 4) {
            gVar.n = i3 == 3 ? null : new org.telegram.ui.web.d(7, this, gVar.c);
            return gVar;
        }
        TLRPC.User user = gVar.c;
        if (user == null) {
            return gVar;
        }
        final long j10 = user.id;
        final int i10 = 0;
        ?? r22 = new View.OnClickListener(this) { // from class: xg.z0
            public final /* synthetic */ e1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        e1 e1Var = this.b;
                        HashSet hashSet = e1Var.a2;
                        hashSet.add(Long.valueOf(j10));
                        n10 n10Var = e1Var.w2;
                        if (n10Var != null) {
                            n10Var.a(Boolean.FALSE, hashSet);
                            e1Var.w2 = null;
                        }
                        e1Var.dismiss();
                        break;
                    default:
                        e1 e1Var2 = this.b;
                        HashSet hashSet2 = e1Var2.a2;
                        hashSet2.add(Long.valueOf(j10));
                        n10 n10Var2 = e1Var2.w2;
                        if (n10Var2 != null) {
                            n10Var2.a(Boolean.TRUE, hashSet2);
                            e1Var2.w2 = null;
                        }
                        e1Var2.dismiss();
                        break;
                }
            }
        };
        final int i11 = 1;
        ?? r32 = new View.OnClickListener(this) { // from class: xg.z0
            public final /* synthetic */ e1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        e1 e1Var = this.b;
                        HashSet hashSet = e1Var.a2;
                        hashSet.add(Long.valueOf(j10));
                        n10 n10Var = e1Var.w2;
                        if (n10Var != null) {
                            n10Var.a(Boolean.FALSE, hashSet);
                            e1Var.w2 = null;
                        }
                        e1Var.dismiss();
                        break;
                    default:
                        e1 e1Var2 = this.b;
                        HashSet hashSet2 = e1Var2.a2;
                        hashSet2.add(Long.valueOf(j10));
                        n10 n10Var2 = e1Var2.w2;
                        if (n10Var2 != null) {
                            n10Var2.a(Boolean.TRUE, hashSet2);
                            e1Var2.w2 = null;
                        }
                        e1Var2.dismiss();
                        break;
                }
            }
        };
        gVar.o = r22;
        gVar.p = r32;
        return gVar;
    }

    public final int h1() {
        if (this.Q1 == 4) {
            return Math.max(0, (hp.s1(this.a).P6 - this.v2.size()) - 1);
        }
        return 10;
    }

    public final void j1(boolean z10) {
        ArrayList arrayList = this.b2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(g5.r(this.a).f0);
            this.e2.putAll(g5.r(this.a).h0);
            this.f2.addAll(g5.r(this.a).i0);
            if (z10) {
                o1(true, true);
            }
        }
    }

    public final void k1() {
        HashSet hashSet = this.a2;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.k2;
            boolean isEmpty = arrayList.isEmpty();
            int i3 = this.Q1;
            if (!isEmpty || i3 == 0 || i3 == 2 || i3 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.g2.values()) {
                    if (hashSet.contains(Long.valueOf(user.id))) {
                        arrayList2.add(user);
                    }
                }
                org.telegram.messenger.g0.v1(this.S1.getEditText());
                if (i3 == 1) {
                    return;
                }
                if (i3 == 4) {
                    n10 n10Var = this.w2;
                    if (n10Var != null) {
                        wo woVar = this.V1;
                        n10Var.a(Boolean.valueOf(woVar != null && woVar.a.q), hashSet);
                        this.w2 = null;
                    }
                    dismiss();
                    return;
                }
                List c2 = s.c(s.b(arrayList2.size(), arrayList));
                if (arrayList2.size() == 1) {
                    long j10 = ((TLRPC.User) arrayList2.get(0)).id;
                    if (l10.b(hp.s1(h10.t0).b2(j10))) {
                        org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131743752, m5.t(j10)), new fc(this.c, this.J0), R.raw.error, 36);
                        return;
                    }
                    b3 b3Var = new b3(getContext(), this.a, j10, c2, new y0(this, r5 ? 1 : 0));
                    t1 t1Var = this.o2;
                    b3Var.e1(t1Var != null && t1Var.a(j10));
                    b3Var.show();
                }
            }
        }
    }

    public final void m1() {
        String H = this.Q1 == 4 ? bd.H(',', "UserSelectorLimit", h1()) : bd.M0(2131753272, null);
        e6 e6Var = this.J0;
        j2 j2Var = this.c;
        new fc(j2Var, e6Var).Q(R.raw.chats_infotip, 36, H).k(true);
        try {
            j2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void n1(boolean z10) {
        ig0 ig0Var = this.R1;
        ig0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = this.Q1;
        HashSet hashSet = this.a2;
        if (i3 == 4) {
            spannableStringBuilder.append((CharSequence) bd.M0(2131752623, null));
        } else if (hashSet.size() != 0) {
            spannableStringBuilder.append((CharSequence) bd.M0(2131749669, "GiftPremiumProceedBtn"));
        } else if (bd.a0) {
            spannableStringBuilder.append((CharSequence) bd.M0(2131749682, "GiftPremiumChooseRecipientsBtn"));
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.n2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.n2, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) bd.M0(2131749682, "GiftPremiumChooseRecipientsBtn"));
        }
        ig0Var.c(hashSet.size(), true);
        ig0Var.i(spannableStringBuilder, z10, false);
        ig0Var.setEnabled(hashSet.size() > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0470  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o1(boolean z10, boolean z11) {
        float f10;
        float f11;
        int L;
        TLRPC.User f12;
        float f13;
        long j10;
        yg.g gVar;
        int size;
        int i3;
        int i10;
        ArrayList arrayList;
        t1 t1Var;
        HashSet hashSet;
        String str;
        yg.h hVar;
        ArrayList arrayList2 = this.Y1;
        arrayList2.clear();
        ArrayList arrayList3 = this.Z1;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        boolean isEmpty = TextUtils.isEmpty(this.h2);
        HashSet hashSet2 = this.v2;
        int i11 = this.Q1;
        HashSet hashSet3 = this.a2;
        if (isEmpty) {
            if (this.z2 && i11 == 3) {
                if (this.y2 == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.filled_gift_send).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    xp xpVar = new xp(k6.L(org.telegram.messenger.g0.L(40.0f), k6.w0(k6.Ci, this.J0)), mutate);
                    int L2 = org.telegram.messenger.g0.L(24.0f);
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    xpVar.e = L2;
                    xpVar.f = L3;
                    this.y2 = xpVar;
                }
                xp xpVar2 = this.y2;
                String M0 = bd.M0(2131750115, null);
                yg.g gVar2 = new yg.g(3, true);
                gVar2.i = 5;
                gVar2.r = xpVar2;
                gVar2.g = M0;
                gVar2.h = "";
                arrayList3.add(gVar2);
            }
            if (this.A2 && i11 == 3 && ((org.telegram.messenger.h0) hp.s1(this.a).x7.j0.b).c) {
                if (this.x2 == null) {
                    Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_wallet_move).mutate();
                    f10 = 40.0f;
                    mutate2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    f11 = 24.0f;
                    xp xpVar3 = new xp(k6.L(org.telegram.messenger.g0.L(40.0f), k6.w0(k6.Ci, this.J0)), mutate2);
                    int L4 = org.telegram.messenger.g0.L(24.0f);
                    int L5 = org.telegram.messenger.g0.L(24.0f);
                    xpVar3.e = L4;
                    xpVar3.f = L5;
                    this.x2 = xpVar3;
                } else {
                    f10 = 40.0f;
                    f11 = 24.0f;
                }
                String t10 = org.telegram.ui.Wallet.k0.x(this.a).t();
                int i12 = this.B2;
                if (i12 > 0) {
                    str = bd.G(i12, "Gift2ExportTONUnlocksIn", new Object[0]);
                } else if (t10 == null || t10.length() < 20) {
                    str = "";
                } else {
                    int w02 = k6.w0(k6.r5, this.J0);
                    int length = t10.length();
                    String substring = t10.substring(0, 4);
                    String substring2 = t10.substring(4, 8);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(t10.substring(8, 10));
                    int i13 = length - 8;
                    sb2.append(t10.substring(length - 10, i13));
                    String sb3 = sb2.toString();
                    int i14 = length - 4;
                    String[] strArr = {substring, substring2, sb3, t10.substring(i13, i14), t10.substring(i14, length)};
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i15 = 0;
                    while (i15 < 5) {
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) strArr[i15]);
                        spannableStringBuilder.setSpan(new d1(w02, i15 == 2), length2, spannableStringBuilder.length(), 33);
                        i15++;
                    }
                    str = spannableStringBuilder;
                }
                xp xpVar4 = this.x2;
                String M02 = bd.M0(2131750112, null);
                yg.g gVar3 = new yg.g(3, true);
                gVar3.i = 4;
                gVar3.r = xpVar4;
                gVar3.g = M02;
                gVar3.h = str;
                arrayList3.add(gVar3);
            } else {
                f10 = 40.0f;
                f11 = 24.0f;
            }
            if (this.A2 && i11 == 3 && !((org.telegram.messenger.h0) hp.s1(this.a).x7.j0.b).c) {
                if (this.r2 == null) {
                    Drawable mutate3 = getContext().getResources().getDrawable(R.drawable.fragment).mutate();
                    mutate3.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    xp xpVar5 = new xp(k6.L(org.telegram.messenger.g0.L(f10), -16777216), mutate3);
                    int L6 = org.telegram.messenger.g0.L(f11);
                    int L7 = org.telegram.messenger.g0.L(f11);
                    xpVar5.e = L6;
                    xpVar5.f = L7;
                    this.r2 = xpVar5;
                }
                xp xpVar6 = this.r2;
                String M03 = bd.M0(2131749998, null);
                int i16 = this.B2;
                String G = i16 > 0 ? bd.G(i16, "Gift2ExportTONUnlocksIn", new Object[0]) : "";
                yg.g gVar4 = new yg.g(3, true);
                gVar4.i = 2;
                gVar4.r = xpVar6;
                gVar4.g = M03;
                gVar4.h = G;
                arrayList3.add(gVar4);
            }
            TLRPC.UserFull b22 = hp.s1(this.a).b2(h10.i(this.a).e());
            if (b22 == null) {
                hp.s1(this.a).W2(h10.i(this.a).f(), 0, true, null);
            }
            if ((i11 == 0 || i11 == 2) && b22 != null && b22.birthday == null) {
                L = org.telegram.messenger.g0.L(50.0f);
                String M04 = bd.M0(2131749584, null);
                yg.g gVar5 = new yg.g(9, false);
                gVar5.i = 1;
                gVar5.j = R.drawable.menu_birthday;
                gVar5.g = M04;
                arrayList3.add(gVar5);
            } else {
                L = 0;
            }
            if (this.t2 != null && i11 == 4) {
                String M05 = bd.M0(2131743430, null);
                yg.g gVar6 = new yg.g(9, false);
                gVar6.i = 3;
                gVar6.j = R.drawable.msg2_link2;
                gVar6.g = M05;
                arrayList3.add(gVar6);
            }
            t1 t1Var2 = this.o2;
            if (t1Var2 != null) {
                L = d1(bd.M0(2131753704, null), arrayList3, t1Var2.b) + d1(bd.M0(2131753711, null), arrayList3, t1Var2.c) + L + d1(bd.M0(2131753705, null), arrayList3, t1Var2.d);
            }
            if ((i11 == 0 || i11 == 2) && (f12 = h10.i(this.a).f()) != null) {
                arrayList3.add(yg.g.b(bd.M0(2131750107, null)));
                yg.g c2 = yg.g.c(f12, hashSet3.contains(Long.valueOf(f12.id)));
                c2.h = bd.M0(2131750108, null);
                arrayList3.add(c2);
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = this.c2;
            if (arrayList5.isEmpty()) {
                f13 = 32.0f;
                j10 = 0;
            } else {
                ArrayList arrayList6 = new ArrayList();
                int size2 = arrayList5.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj = arrayList5.get(i17);
                    i17++;
                    TLRPC.User a22 = hp.s1(this.a).a2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (a22 != null) {
                        long j11 = a22.id;
                        if (j11 != 0 && !a22.self && !a22.bot && !l10.A(j11) && !l10.x(a22) && (t1Var2 == null || !t1Var2.a(a22.id))) {
                            if (!hashSet2.contains(Long.valueOf(a22.id))) {
                                if (hashSet3.contains(Long.valueOf(a22.id))) {
                                    arrayList4.add(Long.valueOf(a22.id));
                                }
                                L += org.telegram.messenger.g0.L(56.0f);
                                yg.g c10 = yg.g.c(a22, hashSet3.contains(Long.valueOf(a22.id)));
                                g1(c10);
                                arrayList6.add(c10);
                            }
                        }
                    }
                }
                f13 = 32.0f;
                j10 = 0;
                if (!arrayList6.isEmpty()) {
                    L += org.telegram.messenger.g0.L(32.0f);
                    gVar = yg.g.b(bd.M0(2131749680, null));
                    arrayList3.add(gVar);
                    arrayList3.addAll(arrayList6);
                    ArrayList arrayList7 = this.f2;
                    size = arrayList7.size();
                    i3 = L;
                    i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList7.get(i10);
                        int i18 = i10 + 1;
                        String str2 = (String) obj2;
                        ArrayList arrayList8 = new ArrayList();
                        for (TLRPC.TL_contact tL_contact : (List) this.e2.get(str2)) {
                            int i19 = i18;
                            long e10 = h10.i(this.a).e();
                            ArrayList arrayList9 = arrayList7;
                            int i20 = size;
                            long j12 = tL_contact.user_id;
                            if (j12 == e10 || j12 == j10 || ((t1Var2 != null && t1Var2.a(j12)) || hashSet2.contains(Long.valueOf(tL_contact.user_id)))) {
                                arrayList = arrayList9;
                                t1Var = t1Var2;
                            } else {
                                arrayList = arrayList9;
                                t1Var = t1Var2;
                                TLRPC.User a23 = hp.s1(this.a).a2(Long.valueOf(tL_contact.user_id));
                                if (a23 != null && !a23.bot) {
                                    hashSet = hashSet2;
                                    if (!l10.A(a23.id)) {
                                        i3 += org.telegram.messenger.g0.L(56.0f);
                                        if (hashSet3.contains(Long.valueOf(a23.id))) {
                                            arrayList4.add(Long.valueOf(a23.id));
                                        }
                                        yg.g c11 = yg.g.c(a23, hashSet3.contains(Long.valueOf(a23.id)));
                                        g1(c11);
                                        arrayList8.add(c11);
                                    }
                                    hashSet2 = hashSet;
                                    t1Var2 = t1Var;
                                    i18 = i19;
                                    arrayList7 = arrayList;
                                    size = i20;
                                }
                            }
                            hashSet = hashSet2;
                            hashSet2 = hashSet;
                            t1Var2 = t1Var;
                            i18 = i19;
                            arrayList7 = arrayList;
                            size = i20;
                        }
                        int i21 = i18;
                        ArrayList arrayList10 = arrayList7;
                        int i22 = size;
                        t1 t1Var3 = t1Var2;
                        HashSet hashSet4 = hashSet2;
                        if (!arrayList8.isEmpty()) {
                            int L8 = org.telegram.messenger.g0.L(f13) + i3;
                            String upperCase = str2.toUpperCase();
                            yg.g gVar7 = new yg.g(7, false);
                            gVar7.g = upperCase;
                            arrayList3.add(gVar7);
                            arrayList3.addAll(arrayList8);
                            i3 = L8;
                        }
                        hashSet2 = hashSet4;
                        t1Var2 = t1Var3;
                        i10 = i21;
                        arrayList7 = arrayList10;
                        size = i22;
                    }
                    if (gVar != null && arrayList4.size() > 0 && !hashSet3.isEmpty()) {
                        String M06 = bd.M0(2131751458, null);
                        org.telegram.ui.web.d dVar = new org.telegram.ui.web.d(6, this, arrayList4);
                        gVar.h = M06;
                        gVar.m = dVar;
                    }
                }
            }
            gVar = null;
            ArrayList arrayList72 = this.f2;
            size = arrayList72.size();
            i3 = L;
            i10 = 0;
            while (i10 < size) {
            }
            if (gVar != null) {
                String M062 = bd.M0(2131751458, null);
                org.telegram.ui.web.d dVar2 = new org.telegram.ui.web.d(6, this, arrayList4);
                gVar.h = M062;
                gVar.m = dVar2;
            }
        } else {
            ArrayList arrayList11 = this.d2;
            int size3 = arrayList11.size();
            int i23 = 0;
            i3 = 0;
            while (i23 < size3) {
                Object obj3 = arrayList11.get(i23);
                i23++;
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (!user.bot && !l10.A(user.id)) {
                        long j13 = user.id;
                        i3 = org.telegram.messenger.g0.L(56.0f) + i3;
                        if (!hashSet2.contains(Long.valueOf(user.id))) {
                            yg.g c12 = yg.g.c(user, hashSet3.contains(Long.valueOf(j13)));
                            g1(c12);
                            arrayList3.add(c12);
                        }
                    }
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (i11 == 3 && t3.V(chat)) {
                        long j14 = -chat.id;
                        i3 += org.telegram.messenger.g0.L(56.0f);
                        if (!hashSet2.contains(Long.valueOf(-chat.id))) {
                            boolean contains = hashSet3.contains(Long.valueOf(j14));
                            yg.g gVar8 = new yg.g(3, true);
                            gVar8.e = chat;
                            gVar8.c = null;
                            gVar8.d = null;
                            gVar8.k = contains;
                            arrayList3.add(gVar8);
                        }
                    }
                }
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(new yg.g(5, false));
            i3 += org.telegram.messenger.g0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.q.y * 0.6f)) - i3);
        yg.g gVar9 = new yg.g(-1, false);
        gVar9.l = max;
        arrayList3.add(gVar9);
        if (!z11 || (hVar = this.i2) == null) {
            return;
        }
        if (z10) {
            hVar.E(arrayList2, arrayList3);
        } else {
            hVar.f();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.a).c(this, hs.S2);
        hs.f(this.a).c(this, hs.E0);
        hs.f(this.a).c(this, hs.O);
        hs.f(this.a).c(this, hs.S0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.a).n(this, hs.S2);
        hs.f(this.a).n(this, hs.E0);
        hs.f(this.a).n(this, hs.O);
        hs.f(this.a).n(this, hs.S0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 int, still in use, count: 2, list:
          (r5v2 int) from 0x0053: MOVE (r3v6 int) = (r5v2 int) (LINE:84)
          (r5v2 int) from 0x002b: MOVE (r2v4 int) = (r5v2 int) (LINE:44)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    public final void p1(boolean r10, boolean r11) {
        /*
            r9 = this;
            r9.o1(r10, r11)
            r11 = -1
            r0 = 0
            r2 = r11
            r1 = r0
            r3 = r1
        L8:
            org.telegram.ui.Components.tj0 r4 = r9.l1
            int r5 = r4.getChildCount()
            if (r1 >= r5) goto L57
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof bh.p
            if (r5 == 0) goto L54
            int r5 = androidx.recyclerview.widget.RecyclerView.R(r4)
            int r6 = r5 + (-1)
            if (r6 < 0) goto L54
            java.util.ArrayList r7 = r9.Z1
            int r8 = r7.size()
            if (r6 < r8) goto L29
            goto L54
        L29:
            if (r2 != r11) goto L2c
            r2 = r5
        L2c:
            java.lang.Object r3 = r7.get(r6)
            yg.g r3 = (yg.g) r3
            bh.p r4 = (bh.p) r4
            boolean r6 = r3.k
            r4.c(r6, r10)
            org.telegram.tgnet.TLRPC$Chat r3 = r3.e
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L50
            yg.h r7 = r9.i2
            int r3 = r7.F(r3)
            r7 = 200(0xc8, float:2.8E-43)
            if (r3 <= r7) goto L4c
            r6 = 1050253722(0x3e99999a, float:0.3)
        L4c:
            r4.i(r10, r6)
            goto L53
        L50:
            r4.i(r10, r6)
        L53:
            r3 = r5
        L54:
            int r1 = r1 + 1
            goto L8
        L57:
            if (r10 == 0) goto L68
            yg.h r11 = r9.i2
            r11.k(r0, r2)
            yg.h r11 = r9.i2
            int r0 = r11.b()
            int r0 = r0 - r3
            r11.k(r3, r0)
        L68:
            r9.n1(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xg.e1.p1(boolean, boolean):void");
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void s0() {
        super.s0();
        try {
            int w02 = k6.w0(k6.Ci, this.J0);
            xp xpVar = this.y2;
            if (xpVar != null) {
                k6.C1(w02, xpVar.a);
            }
            xp xpVar2 = this.x2;
            if (xpVar2 != null) {
                k6.C1(w02, xpVar2.a);
            }
            tj0 tj0Var = this.l1;
            if (tj0Var != null) {
                for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
                    tj0Var.getChildAt(i3).invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
