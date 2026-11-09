package wg;

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
import bi.ea;
import c8.ha;
import c8.ka;
import fi.o1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t1;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.yo;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.n00;
import org.telegram.ui.og0;
import org.telegram.ui.pg0;
import org.telegram.ui.qg0;
import org.telegram.ui.u00;
import zh.g1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class f1 extends na implements ls {
    public static d1 B2;
    public int A2;
    public final int P1;
    public final qg0 Q1;
    public final pg0 R1;
    public final n00 S1;
    public final og0 T1;
    public final wo U1;
    public final ah.a V1;
    public final FrameLayout W1;
    public final ArrayList X1;
    public final ArrayList Y1;
    public final HashSet Z1;
    public final ArrayList a2;
    public final ArrayList b2;
    public final ArrayList c2;
    public final HashMap d2;
    public final ArrayList e2;
    public final LinkedHashMap f2;
    public String g2;
    public xg.i h2;
    public int i2;
    public final ArrayList j2;
    public boolean k2;
    public float l2;
    public yo m2;
    public final t1 n2;
    public final tg.y o2;
    public int p2;
    public xp q2;
    public String r2;
    public u00 s2;
    public c20 t2;
    public final HashSet u2;
    public v10 v2;
    public xp w2;
    public xp x2;
    public boolean y2;
    public boolean z2;

    public f1(Context context, int i7, t1 t1Var, int i10, g6 g6Var) {
        super(context, null, true, false, g6Var);
        float f10;
        this.X1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.Y1 = arrayList;
        HashSet hashSet = new HashSet();
        this.Z1 = hashSet;
        this.a2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.b2 = arrayList2;
        this.c2 = new ArrayList();
        this.d2 = new HashMap();
        this.e2 = new ArrayList();
        this.f2 = new LinkedHashMap();
        this.i2 = org.telegram.messenger.g0.L(120.0f);
        this.j2 = new ArrayList();
        this.k2 = false;
        this.o2 = new tg.y(this, 6);
        this.p2 = -1;
        this.u2 = new HashSet();
        this.a = i7;
        int i11 = l6.h5;
        P(i11);
        this.s = false;
        this.P1 = i10;
        this.n2 = t1Var;
        xg.i iVar = this.h2;
        int i12 = 1;
        if (iVar != null) {
            iVar.y = i10 == 4;
        }
        og0 og0Var = new og0(i12, getContext(), g6Var);
        this.T1 = og0Var;
        og0Var.setOnCloseClickListener(new x0(this, 11));
        og0Var.setText(O0());
        og0Var.setCloseImageVisible(false);
        og0Var.f.c(false, 0.0f);
        int i13 = 3;
        this.m2 = new yo(this, i13);
        pg0 pg0Var = new pg0(this, getContext(), g6Var, i12);
        this.R1 = pg0Var;
        s6.h(i11, pg0Var, g6Var);
        pg0Var.setOnSearchTextChange(new y0(this, i13));
        pg0Var.b.r(id.M0((!hashSet.isEmpty() || i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2131745836 : 2131749650, null), false);
        n00 n00Var = new n00(14, getContext(), this);
        this.S1 = n00Var;
        ViewGroup viewGroup = this.b;
        int i14 = this.t0;
        viewGroup.addView(og0Var, 0, ha.f(-2.0f, -1, 55, i14, 0, i14, 0));
        ViewGroup viewGroup2 = this.b;
        int i15 = this.t0;
        viewGroup2.addView(pg0Var, ha.f(-2.0f, -1, 55, i15, 0, i15, 0));
        ViewGroup viewGroup3 = this.b;
        int i16 = this.t0;
        viewGroup3.addView(n00Var, ha.f(1.0f, -1, 55, i16, 0, i16, 0));
        ah.a aVar = new ah.a(getContext(), g6Var, (qj0) null);
        this.V1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        s6.h(i11, aVar, g6Var);
        if (i10 == 4) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
            linearLayout.setClipToPadding(false);
            linearLayout.setOrientation(0);
            int i17 = l6.i6;
            org.telegram.ui.Cells.y a02 = l6.a0(l6.w0(i17, this.I0), 6, 6);
            o6 M = s6.M(i17);
            linearLayout.setBackground(a02);
            s6.j(linearLayout, a02, null, M, g6Var);
            wo woVar = new wo(24, context, g6Var);
            this.U1 = woVar;
            woVar.b(l6.Ci, l6.j7, l6.k7);
            woVar.setDrawUnchecked(true);
            woVar.a(false, false);
            woVar.setDrawBackgroundAsArc(10);
            linearLayout.addView(woVar, ha.t(26, 26, 16, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            s6.U(textView, l6.j5, g6Var);
            jg.g.v(textView, 1, 14.0f, null, 2131751825);
            linearLayout.addView(textView, ha.t(-2, -2, 16, 9, 0, 0, 0));
            ka.b(linearLayout, 0.025f, 1.5f);
            final int i18 = 0;
            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: wg.c1
                public final /* synthetic */ f1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            this.b.U1.a(!r3.a.q, true);
                            break;
                        default:
                            this.b.k1();
                            break;
                    }
                }
            });
            aVar.addView(linearLayout, ha.t(-2, -2, 17, 0, 0, 0, 8));
        }
        final int i19 = 1;
        qg0 qg0Var = new qg0(this, getContext(), g6Var, i19);
        this.Q1 = qg0Var;
        if (i10 == 4) {
            f10 = 0.0f;
            aVar.setAlpha(0.0f);
            aVar.setVisibility(8);
        } else {
            f10 = 0.0f;
        }
        qg0Var.setOnClickListener(new View.OnClickListener(this) { // from class: wg.c1
            public final /* synthetic */ f1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i19) {
                    case 0:
                        this.b.U1.a(!r3.a.q, true);
                        break;
                    default:
                        this.b.k1();
                        break;
                }
            }
        });
        aVar.addView(qg0Var, ha.r(-1, 48, 87));
        if (i10 == 4) {
            ViewGroup viewGroup4 = this.b;
            int i20 = this.t0;
            viewGroup4.addView(aVar, ha.f(-2.0f, -1, 87, i20, 0, i20, 0));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.W1 = frameLayout;
        ViewGroup viewGroup5 = this.b;
        int i21 = this.t0;
        viewGroup5.addView(frameLayout, ha.f(300.0f, -1, 87, i21, 0, i21, org.telegram.messenger.g0.L(68.0f)));
        xg.i iVar2 = this.h2;
        qj0 qj0Var = this.k1;
        iVar2.n = arrayList;
        iVar2.f = qj0Var;
        int i22 = this.t0;
        qj0Var.setPadding(i22, 0, i22, org.telegram.messenger.g0.L(i10 != 1 ? 60.0f : f10));
        this.k1.j(new ui(this, 29));
        this.k1.setOnItemClickListener(new us(this, i10, g6Var, i7));
        if (i10 == 4) {
            this.k1.setOnItemLongClickListener((fj0) new l2.q(this, i10, 19));
        }
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(xq.h);
        int i23 = 0;
        kVar.C = false;
        kVar.m = false;
        this.k1.setItemAnimator(kVar);
        this.k1.i(new o1(this, 9));
        pg0Var.setText("");
        pg0Var.d.b(false);
        pg0Var.b(false, hashSet, new x0(this, 12), null);
        og0Var.setText(O0());
        ja jaVar = this.l1;
        if (jaVar != null) {
            jaVar.setTitle(O0());
        }
        n1(false);
        j1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(org.telegram.messenger.ui.b0(this.a).i1);
        }
        p1(false, true);
        if (i10 == 0 || i10 == 2) {
            r.j(i7, null, new y0(this, i23));
        }
        if (i10 == 0 || i10 == 2) {
            ea.y(i7, false).U();
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

    public static f1 l1(int i7, t1 t1Var) {
        f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return null;
        }
        d1 d1Var = B2;
        if (d1Var != null) {
            return d1Var;
        }
        d1 d1Var2 = new d1(Q.getContext(), Q.getCurrentAccount(), t1Var, i7, Q.getResourceProvider());
        if (!org.telegram.messenger.g0.Q1() && !org.telegram.messenger.g0.u1(Q)) {
            d1Var2.a0(Q);
        }
        Q.showDialog(d1Var2);
        B2 = d1Var2;
        return d1Var2;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        B2 = null;
        org.telegram.messenger.g0.r(this.o2);
    }

    @Override // org.telegram.ui.Components.na
    public final pj0 L0(qj0 qj0Var) {
        xg.i iVar = new xg.i(getContext(), this.I0, false);
        this.h2 = iVar;
        iVar.s = true;
        return iVar;
    }

    @Override // org.telegram.ui.Components.na
    public final CharSequence O0() {
        String str = this.r2;
        if (str != null) {
            return str;
        }
        int i7 = this.P1;
        if (i7 != 0) {
            if (i7 == 1) {
                return id.M0(2131749607, null);
            }
            if (i7 != 2) {
                return i7 != 4 ? id.M0(2131749600, null) : id.M0(2131743425, null);
            }
        }
        return id.M0(2131749601, null);
    }

    @Override // org.telegram.ui.Components.na
    public final void R0(Canvas canvas, int i7) {
        float max = Math.max(i7, org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(8.0f)) + org.telegram.messenger.g0.L(8.0f);
        og0 og0Var = this.T1;
        og0Var.setTranslationY(max);
        float translationY = og0Var.getTranslationY() + og0Var.getMeasuredHeight();
        pg0 pg0Var = this.R1;
        pg0Var.setTranslationY(translationY);
        float translationY2 = pg0Var.getTranslationY() + pg0Var.getMeasuredHeight();
        this.S1.setTranslationY(translationY2);
        this.k1.setTranslationY((r2.getMeasuredHeight() + (pg0Var.getMeasuredHeight() + og0Var.getMeasuredHeight())) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void c0(Configuration configuration) {
        o1(false, true);
    }

    public final int d1(String str, ArrayList arrayList, ArrayList arrayList2) {
        int i7 = 0;
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
            if (user != null && !user.bot && !t10.A(user.id)) {
                long j3 = user.id;
                if (j3 != 0 && !this.u2.contains(Long.valueOf(j3))) {
                    Long valueOf = Long.valueOf(user.id);
                    HashSet hashSet = this.Z1;
                    hashSet.contains(valueOf);
                    i7 += org.telegram.messenger.g0.L(56.0f);
                    xg.h c10 = xg.h.c(user, hashSet.contains(Long.valueOf(user.id)));
                    g1(c10);
                    arrayList3.add(c10);
                }
            }
        }
        if (arrayList3.isEmpty()) {
            return i7;
        }
        int L = org.telegram.messenger.g0.L(32.0f) + i7;
        arrayList.add(xg.h.b(str));
        arrayList.addAll(arrayList3);
        return L;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.S2) {
            dismiss();
            return;
        }
        if (i7 == qs.O) {
            org.telegram.messenger.g0.h3(new x0(this, 0));
        } else if (i7 == qs.S0) {
            org.telegram.messenger.g0.h3(new x0(this, 6));
        } else if (i7 == qs.E0) {
            org.telegram.messenger.g0.h3(new x0(this, 10));
        }
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.R1.getEditText());
        super.dismiss();
    }

    public final void e1() {
        int i7;
        if (!this.Z1.isEmpty() || (i7 = this.P1) == 1 || i7 == 2 || i7 == 3 || i7 == 4) {
            if (this.k2) {
                return;
            }
            this.k2 = true;
            org.telegram.messenger.g0.i3(new x0(this, 3), 10L);
            return;
        }
        if (this.k2) {
            this.k2 = false;
            org.telegram.messenger.g0.i3(new x0(this, 4), 10L);
        }
    }

    public final void f1() {
        if (TextUtils.isEmpty(this.g2)) {
            return;
        }
        this.g2 = null;
        this.R1.setText("");
        org.telegram.messenger.g0.r(this.o2);
        o1(true, true);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [wg.a1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [wg.a1] */
    public final xg.h g1(xg.h hVar) {
        int i7 = this.P1;
        if (i7 != 4) {
            hVar.n = i7 == 3 ? null : new z0(1, this, hVar.c);
            return hVar;
        }
        TLRPC.User user = hVar.c;
        if (user == null) {
            return hVar;
        }
        final long j3 = user.id;
        final int i10 = 0;
        ?? r22 = new View.OnClickListener(this) { // from class: wg.a1
            public final /* synthetic */ f1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        f1 f1Var = this.b;
                        HashSet hashSet = f1Var.Z1;
                        hashSet.add(Long.valueOf(j3));
                        v10 v10Var = f1Var.v2;
                        if (v10Var != null) {
                            v10Var.a(Boolean.FALSE, hashSet);
                            f1Var.v2 = null;
                        }
                        f1Var.dismiss();
                        break;
                    default:
                        f1 f1Var2 = this.b;
                        HashSet hashSet2 = f1Var2.Z1;
                        hashSet2.add(Long.valueOf(j3));
                        v10 v10Var2 = f1Var2.v2;
                        if (v10Var2 != null) {
                            v10Var2.a(Boolean.TRUE, hashSet2);
                            f1Var2.v2 = null;
                        }
                        f1Var2.dismiss();
                        break;
                }
            }
        };
        final int i11 = 1;
        ?? r32 = new View.OnClickListener(this) { // from class: wg.a1
            public final /* synthetic */ f1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        f1 f1Var = this.b;
                        HashSet hashSet = f1Var.Z1;
                        hashSet.add(Long.valueOf(j3));
                        v10 v10Var = f1Var.v2;
                        if (v10Var != null) {
                            v10Var.a(Boolean.FALSE, hashSet);
                            f1Var.v2 = null;
                        }
                        f1Var.dismiss();
                        break;
                    default:
                        f1 f1Var2 = this.b;
                        HashSet hashSet2 = f1Var2.Z1;
                        hashSet2.add(Long.valueOf(j3));
                        v10 v10Var2 = f1Var2.v2;
                        if (v10Var2 != null) {
                            v10Var2.a(Boolean.TRUE, hashSet2);
                            f1Var2.v2 = null;
                        }
                        f1Var2.dismiss();
                        break;
                }
            }
        };
        hVar.o = r22;
        hVar.p = r32;
        return hVar;
    }

    public final int h1() {
        if (this.P1 == 4) {
            return Math.max(0, (qp.s1(this.a).P6 - this.u2.size()) - 1);
        }
        return 10;
    }

    public final void j1(boolean z9) {
        ArrayList arrayList = this.a2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(g5.r(this.a).e0);
            this.d2.putAll(g5.r(this.a).g0);
            this.e2.addAll(g5.r(this.a).h0);
            if (z9) {
                o1(true, true);
            }
        }
    }

    public final void k1() {
        HashSet hashSet = this.Z1;
        if (hashSet.size() != 0) {
            ArrayList arrayList = this.j2;
            boolean isEmpty = arrayList.isEmpty();
            int i7 = this.P1;
            if (!isEmpty || i7 == 0 || i7 == 2 || i7 == 4) {
                ArrayList arrayList2 = new ArrayList();
                for (TLRPC.User user : this.f2.values()) {
                    if (hashSet.contains(Long.valueOf(user.id))) {
                        arrayList2.add(user);
                    }
                }
                org.telegram.messenger.g0.v1(this.R1.getEditText());
                if (i7 == 1) {
                    return;
                }
                if (i7 == 4) {
                    v10 v10Var = this.v2;
                    if (v10Var != null) {
                        wo woVar = this.U1;
                        v10Var.a(Boolean.valueOf(woVar != null && woVar.a.q), hashSet);
                        this.v2 = null;
                    }
                    dismiss();
                    return;
                }
                List c10 = r.c(r.b(arrayList2.size(), arrayList));
                if (arrayList2.size() == 1) {
                    long j3 = ((TLRPC.User) arrayList2.get(0)).id;
                    if (t10.b(qp.s1(p10.s0).b2(j3))) {
                        org.telegram.messenger.camera.q.s(id.a0(null, null, 2131743742, m5.t(j3)), new hc(this.c, this.I0), R.raw.error, 36);
                        return;
                    }
                    g1 g1Var = new g1(getContext(), this.a, j3, c10, new y0(this, r5 ? 1 : 0));
                    t1 t1Var = this.n2;
                    g1Var.e1(t1Var != null && t1Var.a(j3));
                    g1Var.show();
                }
            }
        }
    }

    public final void m1() {
        String H = this.P1 == 4 ? id.H(',', "UserSelectorLimit", h1()) : id.M0(2131753272, null);
        g6 g6Var = this.I0;
        l2 l2Var = this.c;
        new hc(l2Var, g6Var).Q(R.raw.chats_infotip, 36, H).k(true);
        try {
            l2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void n1(boolean z9) {
        qg0 qg0Var = this.Q1;
        qg0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = this.P1;
        HashSet hashSet = this.Z1;
        if (i7 == 4) {
            spannableStringBuilder.append((CharSequence) id.M0(2131752623, null));
        } else if (hashSet.size() != 0) {
            spannableStringBuilder.append((CharSequence) id.M0(2131749661, "GiftPremiumProceedBtn"));
        } else if (id.a0) {
            spannableStringBuilder.append((CharSequence) id.M0(2131749674, "GiftPremiumChooseRecipientsBtn"));
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.m2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.m2, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) id.M0(2131749674, "GiftPremiumChooseRecipientsBtn"));
        }
        qg0Var.c(hashSet.size(), true);
        qg0Var.i(spannableStringBuilder, z9, false);
        qg0Var.setEnabled(hashSet.size() > 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o1(boolean z9, boolean z10) {
        float f10;
        float f11;
        int L;
        TLRPC.User f12;
        float f13;
        long j3;
        xg.h hVar;
        int size;
        int i7;
        int i10;
        boolean z11;
        ArrayList arrayList;
        t1 t1Var;
        HashSet hashSet;
        String str;
        xg.i iVar;
        ArrayList arrayList2 = this.X1;
        arrayList2.clear();
        ArrayList arrayList3 = this.Y1;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        boolean isEmpty = TextUtils.isEmpty(this.g2);
        HashSet hashSet2 = this.u2;
        int i11 = this.P1;
        HashSet hashSet3 = this.Z1;
        if (isEmpty) {
            if (this.y2 && i11 == 3) {
                if (this.x2 == null) {
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.filled_gift_send).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    xp xpVar = new xp(l6.L(org.telegram.messenger.g0.L(40.0f), l6.w0(l6.Ci, this.I0)), mutate);
                    int L2 = org.telegram.messenger.g0.L(24.0f);
                    int L3 = org.telegram.messenger.g0.L(24.0f);
                    xpVar.e = L2;
                    xpVar.f = L3;
                    this.x2 = xpVar;
                }
                xp xpVar2 = this.x2;
                String M0 = id.M0(2131750107, null);
                xg.h hVar2 = new xg.h(3, true);
                hVar2.i = 5;
                hVar2.r = xpVar2;
                hVar2.g = M0;
                hVar2.h = "";
                arrayList3.add(hVar2);
            }
            if (this.z2 && i11 == 3 && ((org.telegram.messenger.h0) qp.s1(this.a).x7.j0.b).c) {
                if (this.w2 == null) {
                    Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_wallet_move).mutate();
                    f10 = 40.0f;
                    mutate2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    f11 = 24.0f;
                    xp xpVar3 = new xp(l6.L(org.telegram.messenger.g0.L(40.0f), l6.w0(l6.Ci, this.I0)), mutate2);
                    int L4 = org.telegram.messenger.g0.L(24.0f);
                    int L5 = org.telegram.messenger.g0.L(24.0f);
                    xpVar3.e = L4;
                    xpVar3.f = L5;
                    this.w2 = xpVar3;
                } else {
                    f10 = 40.0f;
                    f11 = 24.0f;
                }
                String t6 = org.telegram.ui.Wallet.l0.x(this.a).t();
                int i12 = this.A2;
                if (i12 > 0) {
                    str = id.G(i12, "Gift2ExportTONUnlocksIn", new Object[0]);
                } else if (t6 == null || t6.length() < 20) {
                    str = "";
                } else {
                    int w02 = l6.w0(l6.r5, this.I0);
                    int length = t6.length();
                    String substring = t6.substring(0, 4);
                    String substring2 = t6.substring(4, 8);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(t6.substring(8, 10));
                    int i13 = length - 8;
                    sb2.append(t6.substring(length - 10, i13));
                    String sb3 = sb2.toString();
                    int i14 = length - 4;
                    String[] strArr = {substring, substring2, sb3, t6.substring(i13, i14), t6.substring(i14, length)};
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i15 = 0;
                    while (i15 < 5) {
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) strArr[i15]);
                        spannableStringBuilder.setSpan(new e1(w02, i15 == 2), length2, spannableStringBuilder.length(), 33);
                        i15++;
                    }
                    str = spannableStringBuilder;
                }
                xp xpVar4 = this.w2;
                String M02 = id.M0(2131750104, null);
                xg.h hVar3 = new xg.h(3, true);
                hVar3.i = 4;
                hVar3.r = xpVar4;
                hVar3.g = M02;
                hVar3.h = str;
                arrayList3.add(hVar3);
            } else {
                f10 = 40.0f;
                f11 = 24.0f;
            }
            if (this.z2 && i11 == 3 && !((org.telegram.messenger.h0) qp.s1(this.a).x7.j0.b).c) {
                if (this.q2 == null) {
                    Drawable mutate3 = getContext().getResources().getDrawable(R.drawable.fragment).mutate();
                    mutate3.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    xp xpVar5 = new xp(l6.L(org.telegram.messenger.g0.L(f10), -16777216), mutate3);
                    int L6 = org.telegram.messenger.g0.L(f11);
                    int L7 = org.telegram.messenger.g0.L(f11);
                    xpVar5.e = L6;
                    xpVar5.f = L7;
                    this.q2 = xpVar5;
                }
                xp xpVar6 = this.q2;
                String M03 = id.M0(2131749990, null);
                int i16 = this.A2;
                String G = i16 > 0 ? id.G(i16, "Gift2ExportTONUnlocksIn", new Object[0]) : "";
                xg.h hVar4 = new xg.h(3, true);
                hVar4.i = 2;
                hVar4.r = xpVar6;
                hVar4.g = M03;
                hVar4.h = G;
                arrayList3.add(hVar4);
            }
            TLRPC.UserFull b22 = qp.s1(this.a).b2(p10.i(this.a).e());
            if (b22 == null) {
                qp.s1(this.a).W2(p10.i(this.a).f(), 0, true, null);
            }
            if ((i11 == 0 || i11 == 2) && b22 != null && b22.birthday == null) {
                L = org.telegram.messenger.g0.L(50.0f);
                String M04 = id.M0(2131749576, null);
                xg.h hVar5 = new xg.h(9, false);
                hVar5.i = 1;
                hVar5.j = R.drawable.menu_birthday;
                hVar5.g = M04;
                arrayList3.add(hVar5);
            } else {
                L = 0;
            }
            if (this.s2 != null && i11 == 4) {
                String M05 = id.M0(2131743420, null);
                xg.h hVar6 = new xg.h(9, false);
                hVar6.i = 3;
                hVar6.j = R.drawable.msg2_link2;
                hVar6.g = M05;
                arrayList3.add(hVar6);
            }
            t1 t1Var2 = this.n2;
            if (t1Var2 != null) {
                L = d1(id.M0(2131753704, null), arrayList3, t1Var2.b) + d1(id.M0(2131753711, null), arrayList3, t1Var2.c) + L + d1(id.M0(2131753705, null), arrayList3, t1Var2.d);
            }
            if ((i11 == 0 || i11 == 2) && (f12 = p10.i(this.a).f()) != null) {
                arrayList3.add(xg.h.b(id.M0(2131750099, null)));
                xg.h c10 = xg.h.c(f12, hashSet3.contains(Long.valueOf(f12.id)));
                c10.h = id.M0(2131750100, null);
                arrayList3.add(c10);
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = this.b2;
            if (arrayList5.isEmpty()) {
                f13 = 32.0f;
                j3 = 0;
            } else {
                ArrayList arrayList6 = new ArrayList();
                int size2 = arrayList5.size();
                int i17 = 0;
                while (i17 < size2) {
                    Object obj = arrayList5.get(i17);
                    i17++;
                    TLRPC.User a22 = qp.s1(this.a).a2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (a22 != null) {
                        long j10 = a22.id;
                        if (j10 != 0 && !a22.self && !a22.bot && !t10.A(j10) && !t10.x(a22) && (t1Var2 == null || !t1Var2.a(a22.id))) {
                            if (!hashSet2.contains(Long.valueOf(a22.id))) {
                                if (hashSet3.contains(Long.valueOf(a22.id))) {
                                    arrayList4.add(Long.valueOf(a22.id));
                                }
                                L += org.telegram.messenger.g0.L(56.0f);
                                xg.h c11 = xg.h.c(a22, hashSet3.contains(Long.valueOf(a22.id)));
                                g1(c11);
                                arrayList6.add(c11);
                            }
                        }
                    }
                }
                f13 = 32.0f;
                j3 = 0;
                if (!arrayList6.isEmpty()) {
                    L += org.telegram.messenger.g0.L(32.0f);
                    hVar = xg.h.b(id.M0(2131749672, null));
                    arrayList3.add(hVar);
                    arrayList3.addAll(arrayList6);
                    ArrayList arrayList7 = this.e2;
                    size = arrayList7.size();
                    i7 = L;
                    i10 = 0;
                    while (i10 < size) {
                        Object obj2 = arrayList7.get(i10);
                        int i18 = i10 + 1;
                        String str2 = (String) obj2;
                        ArrayList arrayList8 = new ArrayList();
                        for (TLRPC.TL_contact tL_contact : (List) this.d2.get(str2)) {
                            int i19 = i18;
                            long e10 = p10.i(this.a).e();
                            ArrayList arrayList9 = arrayList7;
                            int i20 = size;
                            long j11 = tL_contact.user_id;
                            if (j11 == e10 || j11 == j3 || ((t1Var2 != null && t1Var2.a(j11)) || hashSet2.contains(Long.valueOf(tL_contact.user_id)))) {
                                arrayList = arrayList9;
                                t1Var = t1Var2;
                            } else {
                                arrayList = arrayList9;
                                t1Var = t1Var2;
                                TLRPC.User a23 = qp.s1(this.a).a2(Long.valueOf(tL_contact.user_id));
                                if (a23 != null && !a23.bot) {
                                    hashSet = hashSet2;
                                    if (!t10.A(a23.id)) {
                                        i7 += org.telegram.messenger.g0.L(56.0f);
                                        if (hashSet3.contains(Long.valueOf(a23.id))) {
                                            arrayList4.add(Long.valueOf(a23.id));
                                        }
                                        xg.h c12 = xg.h.c(a23, hashSet3.contains(Long.valueOf(a23.id)));
                                        g1(c12);
                                        arrayList8.add(c12);
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
                            int L8 = org.telegram.messenger.g0.L(f13) + i7;
                            String upperCase = str2.toUpperCase();
                            xg.h hVar7 = new xg.h(7, false);
                            hVar7.g = upperCase;
                            arrayList3.add(hVar7);
                            arrayList3.addAll(arrayList8);
                            i7 = L8;
                        }
                        hashSet2 = hashSet4;
                        t1Var2 = t1Var3;
                        i10 = i21;
                        arrayList7 = arrayList10;
                        size = i22;
                    }
                    if (hVar != null && arrayList4.size() > 0 && !hashSet3.isEmpty()) {
                        String M06 = id.M0(2131751457, null);
                        z11 = false;
                        z0 z0Var = new z0(0 == true ? 1 : 0, this, arrayList4);
                        hVar.h = M06;
                        hVar.m = z0Var;
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new xg.h(5, z11));
                            i7 += org.telegram.messenger.g0.L(150.0f);
                        }
                        int max = Math.max(0, ((int) (org.telegram.messenger.g0.q.y * 0.6f)) - i7);
                        xg.h hVar8 = new xg.h(-1, false);
                        hVar8.l = max;
                        arrayList3.add(hVar8);
                        if (!z10 || (iVar = this.h2) == null) {
                            return;
                        }
                        if (z9) {
                            iVar.E(arrayList2, arrayList3);
                            return;
                        } else {
                            iVar.f();
                            return;
                        }
                    }
                }
            }
            hVar = null;
            ArrayList arrayList72 = this.e2;
            size = arrayList72.size();
            i7 = L;
            i10 = 0;
            while (i10 < size) {
            }
            if (hVar != null) {
                String M062 = id.M0(2131751457, null);
                z11 = false;
                z0 z0Var2 = new z0(0 == true ? 1 : 0, this, arrayList4);
                hVar.h = M062;
                hVar.m = z0Var2;
                if (arrayList3.isEmpty()) {
                }
                int max2 = Math.max(0, ((int) (org.telegram.messenger.g0.q.y * 0.6f)) - i7);
                xg.h hVar82 = new xg.h(-1, false);
                hVar82.l = max2;
                arrayList3.add(hVar82);
                if (z10) {
                    return;
                } else {
                    return;
                }
            }
        } else {
            ArrayList arrayList11 = this.c2;
            int size3 = arrayList11.size();
            int i23 = 0;
            i7 = 0;
            while (i23 < size3) {
                Object obj3 = arrayList11.get(i23);
                i23++;
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (!user.bot && !t10.A(user.id)) {
                        long j12 = user.id;
                        i7 = org.telegram.messenger.g0.L(56.0f) + i7;
                        if (!hashSet2.contains(Long.valueOf(user.id))) {
                            xg.h c13 = xg.h.c(user, hashSet3.contains(Long.valueOf(j12)));
                            g1(c13);
                            arrayList3.add(c13);
                        }
                    }
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (i11 == 3 && t3.V(chat)) {
                        long j13 = -chat.id;
                        i7 += org.telegram.messenger.g0.L(56.0f);
                        if (!hashSet2.contains(Long.valueOf(-chat.id))) {
                            boolean contains = hashSet3.contains(Long.valueOf(j13));
                            xg.h hVar9 = new xg.h(3, true);
                            hVar9.e = chat;
                            hVar9.c = null;
                            hVar9.d = null;
                            hVar9.k = contains;
                            arrayList3.add(hVar9);
                        }
                    }
                }
            }
        }
        z11 = false;
        if (arrayList3.isEmpty()) {
        }
        int max22 = Math.max(0, ((int) (org.telegram.messenger.g0.q.y * 0.6f)) - i7);
        xg.h hVar822 = new xg.h(-1, false);
        hVar822.l = max22;
        arrayList3.add(hVar822);
        if (z10) {
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.a).c(this, qs.S2);
        qs.f(this.a).c(this, qs.E0);
        qs.f(this.a).c(this, qs.O);
        qs.f(this.a).c(this, qs.S0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.a).n(this, qs.S2);
        qs.f(this.a).n(this, qs.E0);
        qs.f(this.a).n(this, qs.O);
        qs.f(this.a).n(this, qs.S0);
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
            org.telegram.ui.Components.qj0 r4 = r9.k1
            int r5 = r4.getChildCount()
            if (r1 >= r5) goto L57
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof ah.r
            if (r5 == 0) goto L54
            int r5 = androidx.recyclerview.widget.RecyclerView.R(r4)
            int r6 = r5 + (-1)
            if (r6 < 0) goto L54
            java.util.ArrayList r7 = r9.Y1
            int r8 = r7.size()
            if (r6 < r8) goto L29
            goto L54
        L29:
            if (r2 != r11) goto L2c
            r2 = r5
        L2c:
            java.lang.Object r3 = r7.get(r6)
            xg.h r3 = (xg.h) r3
            ah.r r4 = (ah.r) r4
            boolean r6 = r3.k
            r4.c(r6, r10)
            org.telegram.tgnet.TLRPC$Chat r3 = r3.e
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L50
            xg.i r7 = r9.h2
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
            xg.i r11 = r9.h2
            r11.k(r0, r2)
            xg.i r11 = r9.h2
            int r0 = r11.b()
            int r0 = r0 - r3
            r11.k(r3, r0)
        L68:
            r9.n1(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.f1.p1(boolean, boolean):void");
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        try {
            int w02 = l6.w0(l6.Ci, this.I0);
            xp xpVar = this.x2;
            if (xpVar != null) {
                l6.C1(w02, xpVar.a);
            }
            xp xpVar2 = this.w2;
            if (xpVar2 != null) {
                l6.C1(w02, xpVar2.a);
            }
            qj0 qj0Var = this.k1;
            if (qj0Var != null) {
                for (int i7 = 0; i7 < qj0Var.getChildCount(); i7++) {
                    qj0Var.getChildAt(i7).invalidate();
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
