package wg;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.j3;
import c8.ma;
import c8.ra;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.n5;
import org.telegram.messenger.o10;
import org.telegram.messenger.q10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.sa;
import org.telegram.ui.rg0;
import org.telegram.ui.sg0;
import org.telegram.ui.tg0;
import org.telegram.ui.uv;
import org.telegram.ui.v00;
import ug.j1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class d1 extends sa implements fs {
    public final int T1;
    public final tg0 U1;
    public final sg0 V1;
    public final uv W1;
    public final rg0 X1;
    public final mp Y1;
    public final ah.a Z1;
    public final ArrayList a2;
    public final ArrayList b2;
    public final HashSet c2;
    public final ArrayList d2;
    public final ArrayList e2;
    public final ArrayList f2;
    public final HashMap g2;
    public final ArrayList h2;
    public final LinkedHashMap i2;
    public String j2;
    public xg.h k2;
    public int l2;
    public final ArrayList m2;
    public boolean n2;
    public float o2;
    public op p2;
    public final s4.s0 q2;
    public int r2;
    public v00 s2;
    public final HashSet t2;
    public q10 u2;

    public d1(Context context, int i7, fi.h0 h0Var) {
        super(context, null, true, false, h0Var);
        this.a2 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.b2 = arrayList;
        HashSet hashSet = new HashSet();
        this.c2 = hashSet;
        this.d2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.e2 = arrayList2;
        this.f2 = new ArrayList();
        this.g2 = new HashMap();
        this.h2 = new ArrayList();
        this.i2 = new LinkedHashMap();
        this.l2 = org.telegram.messenger.g0.L(120.0f);
        this.m2 = new ArrayList();
        final int i10 = 0;
        this.n2 = false;
        this.q2 = new s4.s0(this, 9);
        this.r2 = -1;
        this.t2 = new HashSet();
        this.a = i7;
        int i11 = n6.h5;
        Q(i11);
        this.s = false;
        this.T1 = 4;
        xg.h hVar = this.k2;
        int i12 = 1;
        if (hVar != null) {
            hVar.y = true;
        }
        rg0 rg0Var = new rg0(i12, getContext(), h0Var);
        this.X1 = rg0Var;
        rg0Var.setOnCloseClickListener(new x0(this, 10));
        rg0Var.setText(P0());
        rg0Var.setCloseImageVisible(false);
        rg0Var.f.c(false, 0.0f);
        this.p2 = new op(this, 3);
        sg0 sg0Var = new sg0(this, getContext(), h0Var, i12);
        this.V1 = sg0Var;
        u6.h(i11, sg0Var, h0Var);
        sg0Var.setOnSearchTextChange(new y0(this, i12));
        hashSet.isEmpty();
        sg0Var.b.r(gd.M0(2131745641, null), false);
        uv uvVar = new uv(15, getContext(), this);
        this.W1 = uvVar;
        ViewGroup viewGroup = this.b;
        int i13 = this.u0;
        viewGroup.addView(rg0Var, 0, ma.f(-2.0f, -1, 55, i13, 0, i13, 0));
        ViewGroup viewGroup2 = this.b;
        int i14 = this.u0;
        viewGroup2.addView(sg0Var, ma.f(-2.0f, -1, 55, i14, 0, i14, 0));
        ViewGroup viewGroup3 = this.b;
        int i15 = this.u0;
        viewGroup3.addView(uvVar, ma.f(1.0f, -1, 55, i15, 0, i15, 0));
        ah.a aVar = new ah.a(getContext(), h0Var, (ck0) null);
        this.Z1 = aVar;
        aVar.setClickable(true);
        aVar.setOrientation(1);
        aVar.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f));
        u6.h(i11, aVar, h0Var);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(4.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i16 = n6.i6;
        org.telegram.ui.Cells.y a02 = n6.a0(n6.w0(i16, this.J0), 6, 6);
        q6 M = u6.M(i16);
        linearLayout.setBackground(a02);
        u6.j(linearLayout, a02, null, M, h0Var);
        mp mpVar = new mp(24, context, h0Var);
        this.Y1 = mpVar;
        mpVar.b(n6.Fi, n6.j7, n6.k7);
        mpVar.setDrawUnchecked(true);
        mpVar.a(false, false);
        mpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(mpVar, ma.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        u6.U(textView, n6.j5, h0Var);
        i5.c.r(14.0f, 1, 2131751814, textView, null);
        linearLayout.addView(textView, ma.t(-2, -2, 16, 9, 0, 0, 0));
        ra.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: wg.b1
            public final /* synthetic */ d1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i17 = i10;
                d1 d1Var = this.b;
                switch (i17) {
                    case 0:
                        d1Var.Y1.a(!r1.a.q, true);
                        break;
                    default:
                        int i18 = d1Var.T1;
                        ArrayList arrayList3 = d1Var.m2;
                        HashSet hashSet2 = d1Var.c2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || i18 == 0 || i18 == 2 || i18 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : d1Var.i2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                org.telegram.messenger.g0.v1(d1Var.V1.getEditText());
                                if (i18 != 1) {
                                    int i19 = 0;
                                    if (i18 == 4) {
                                        q10 q10Var = d1Var.u2;
                                        if (q10Var != null) {
                                            mp mpVar2 = d1Var.Y1;
                                            q10Var.a(Boolean.valueOf(mpVar2 != null && mpVar2.a.q), hashSet2);
                                            d1Var.u2 = null;
                                        }
                                        d1Var.dismiss();
                                        break;
                                    } else {
                                        List c10 = s.c(s.b(arrayList4.size(), arrayList3));
                                        if (arrayList4.size() == 1) {
                                            long j3 = ((TLRPC.User) arrayList4.get(0)).id;
                                            if (o10.b(j3)) {
                                                n10.u(gd.a0(null, null, 2131743505, n5.t(j3)), new lc(d1Var.c, d1Var.J0), R.raw.error, 36);
                                                break;
                                            } else {
                                                j3 j3Var = new j3(d1Var.getContext(), d1Var.a, j3, c10, new y0(d1Var, i19));
                                                j3Var.g1(false);
                                                j3Var.show();
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        aVar.addView(linearLayout, ma.t(-2, -2, 17, 0, 0, 0, 8));
        final int i17 = 1;
        tg0 tg0Var = new tg0(this, getContext(), h0Var, i17);
        this.U1 = tg0Var;
        aVar.setAlpha(0.0f);
        aVar.setVisibility(8);
        tg0Var.setOnClickListener(new View.OnClickListener(this) { // from class: wg.b1
            public final /* synthetic */ d1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i172 = i17;
                d1 d1Var = this.b;
                switch (i172) {
                    case 0:
                        d1Var.Y1.a(!r1.a.q, true);
                        break;
                    default:
                        int i18 = d1Var.T1;
                        ArrayList arrayList3 = d1Var.m2;
                        HashSet hashSet2 = d1Var.c2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || i18 == 0 || i18 == 2 || i18 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : d1Var.i2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                org.telegram.messenger.g0.v1(d1Var.V1.getEditText());
                                if (i18 != 1) {
                                    int i19 = 0;
                                    if (i18 == 4) {
                                        q10 q10Var = d1Var.u2;
                                        if (q10Var != null) {
                                            mp mpVar2 = d1Var.Y1;
                                            q10Var.a(Boolean.valueOf(mpVar2 != null && mpVar2.a.q), hashSet2);
                                            d1Var.u2 = null;
                                        }
                                        d1Var.dismiss();
                                        break;
                                    } else {
                                        List c10 = s.c(s.b(arrayList4.size(), arrayList3));
                                        if (arrayList4.size() == 1) {
                                            long j3 = ((TLRPC.User) arrayList4.get(0)).id;
                                            if (o10.b(j3)) {
                                                n10.u(gd.a0(null, null, 2131743505, n5.t(j3)), new lc(d1Var.c, d1Var.J0), R.raw.error, 36);
                                                break;
                                            } else {
                                                j3 j3Var = new j3(d1Var.getContext(), d1Var.a, j3, c10, new y0(d1Var, i19));
                                                j3Var.g1(false);
                                                j3Var.show();
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                }
            }
        });
        aVar.addView(tg0Var, ma.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i18 = this.u0;
        viewGroup4.addView(aVar, ma.f(-2.0f, -1, 87, i18, 0, i18, 0));
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup viewGroup5 = this.b;
        int i19 = this.u0;
        viewGroup5.addView(frameLayout, ma.f(300.0f, -1, 87, i19, 0, i19, org.telegram.messenger.g0.L(68.0f)));
        xg.h hVar2 = this.k2;
        ck0 ck0Var = this.o1;
        hVar2.n = arrayList;
        hVar2.f = ck0Var;
        int i20 = this.u0;
        ck0Var.setPadding(i20, 0, i20, org.telegram.messenger.g0.L(60.0f));
        this.o1.j(new j1(this, 3));
        this.o1.setOnItemClickListener(new c1(this, h0Var, i7));
        this.o1.setOnItemLongClickListener(new c1(this));
        v4.k kVar = new v4.k();
        kVar.n(350L);
        kVar.o(lr.h);
        kVar.C = false;
        kVar.m = false;
        this.o1.setItemAnimator(kVar);
        this.o1.i(new ai.i0(this, 10));
        sg0Var.setText("");
        sg0Var.d.b(false);
        sg0Var.b(false, hashSet, new x0(this, 11), null);
        rg0Var.setText(P0());
        na naVar = this.p1;
        if (naVar != null) {
            naVar.setTitle(P0());
        }
        k1(false);
        i1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(ri.d0(this.a).j1);
        }
        m1(false, true);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void L() {
        super.L();
        org.telegram.messenger.g0.r(this.q2);
    }

    @Override // org.telegram.ui.Components.sa
    public final bk0 M0(ck0 ck0Var) {
        xg.h hVar = new xg.h(getContext(), this.J0, false);
        this.k2 = hVar;
        hVar.s = true;
        return hVar;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence P0() {
        int i7 = this.T1;
        if (i7 != 0) {
            if (i7 == 1) {
                return gd.M0(2131749432, null);
            }
            if (i7 != 2) {
                return i7 != 4 ? gd.M0(2131749425, null) : gd.M0(2131743188, null);
            }
        }
        return gd.M0(2131749426, null);
    }

    @Override // org.telegram.ui.Components.sa
    public final void S0(Canvas canvas, int i7) {
        float max = Math.max(i7, org.telegram.messenger.g0.m - org.telegram.messenger.g0.L(8.0f)) + org.telegram.messenger.g0.L(8.0f);
        rg0 rg0Var = this.X1;
        rg0Var.setTranslationY(max);
        float translationY = rg0Var.getTranslationY() + rg0Var.getMeasuredHeight();
        sg0 sg0Var = this.V1;
        sg0Var.setTranslationY(translationY);
        float translationY2 = sg0Var.getTranslationY() + sg0Var.getMeasuredHeight();
        this.W1.setTranslationY(translationY2);
        this.o1.setTranslationY((r2.getMeasuredHeight() + (sg0Var.getMeasuredHeight() + rg0Var.getMeasuredHeight())) - org.telegram.messenger.g0.L(8.0f));
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void c0(Configuration configuration) {
        l1(false, true);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.U2) {
            dismiss();
            return;
        }
        if (i7 == ks.O) {
            org.telegram.messenger.g0.g3(new x0(this, 0));
        } else if (i7 == ks.S0) {
            org.telegram.messenger.g0.g3(new x0(this, 6));
        } else if (i7 == ks.E0) {
            org.telegram.messenger.g0.g3(new x0(this, 9));
        }
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
    public final void dismiss() {
        org.telegram.messenger.g0.v1(this.V1.getEditText());
        super.dismiss();
    }

    public final void e1() {
        int i7;
        if (!this.c2.isEmpty() || (i7 = this.T1) == 1 || i7 == 2 || i7 == 4) {
            if (this.n2) {
                return;
            }
            this.n2 = true;
            org.telegram.messenger.g0.h3(new x0(this, 3), 10L);
            return;
        }
        if (this.n2) {
            this.n2 = false;
            org.telegram.messenger.g0.h3(new x0(this, 4), 10L);
        }
    }

    public final void f1() {
        if (TextUtils.isEmpty(this.j2)) {
            return;
        }
        this.j2 = null;
        this.V1.setText("");
        org.telegram.messenger.g0.r(this.q2);
        l1(true, true);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [wg.z0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [wg.z0] */
    public final xg.g g1(xg.g gVar) {
        if (this.T1 != 4) {
            gVar.m = new ug.a0(3, this, gVar.c);
            return gVar;
        }
        TLRPC.User user = gVar.c;
        if (user == null) {
            return gVar;
        }
        final long j3 = user.id;
        final int i7 = 0;
        ?? r22 = new View.OnClickListener(this) { // from class: wg.z0
            public final /* synthetic */ d1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        d1 d1Var = this.b;
                        HashSet hashSet = d1Var.c2;
                        hashSet.add(Long.valueOf(j3));
                        q10 q10Var = d1Var.u2;
                        if (q10Var != null) {
                            q10Var.a(Boolean.FALSE, hashSet);
                            d1Var.u2 = null;
                        }
                        d1Var.dismiss();
                        break;
                    default:
                        d1 d1Var2 = this.b;
                        HashSet hashSet2 = d1Var2.c2;
                        hashSet2.add(Long.valueOf(j3));
                        q10 q10Var2 = d1Var2.u2;
                        if (q10Var2 != null) {
                            q10Var2.a(Boolean.TRUE, hashSet2);
                            d1Var2.u2 = null;
                        }
                        d1Var2.dismiss();
                        break;
                }
            }
        };
        final int i10 = 1;
        ?? r32 = new View.OnClickListener(this) { // from class: wg.z0
            public final /* synthetic */ d1 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        d1 d1Var = this.b;
                        HashSet hashSet = d1Var.c2;
                        hashSet.add(Long.valueOf(j3));
                        q10 q10Var = d1Var.u2;
                        if (q10Var != null) {
                            q10Var.a(Boolean.FALSE, hashSet);
                            d1Var.u2 = null;
                        }
                        d1Var.dismiss();
                        break;
                    default:
                        d1 d1Var2 = this.b;
                        HashSet hashSet2 = d1Var2.c2;
                        hashSet2.add(Long.valueOf(j3));
                        q10 q10Var2 = d1Var2.u2;
                        if (q10Var2 != null) {
                            q10Var2.a(Boolean.TRUE, hashSet2);
                            d1Var2.u2 = null;
                        }
                        d1Var2.dismiss();
                        break;
                }
            }
        };
        gVar.n = r22;
        gVar.o = r32;
        return gVar;
    }

    public final int h1() {
        if (this.T1 == 4) {
            return Math.max(0, (org.telegram.messenger.mp.u1(this.a).S6 - this.t2.size()) - 1);
        }
        return 10;
    }

    public final void i1(boolean z10) {
        ArrayList arrayList = this.d2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(i5.r(this.a).f0);
            this.g2.putAll(i5.r(this.a).h0);
            this.h2.addAll(i5.r(this.a).i0);
            if (z10) {
                l1(true, true);
            }
        }
    }

    public final void j1() {
        String H = this.T1 == 4 ? gd.H(',', "UserSelectorLimit", h1()) : gd.M0(2131753270, null);
        i6 i6Var = this.J0;
        n2 n2Var = this.c;
        new lc(n2Var, i6Var).Q(R.raw.chats_infotip, 36, H).k(true);
        try {
            n2Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void k1(boolean z10) {
        tg0 tg0Var = this.U1;
        tg0Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i7 = this.T1;
        HashSet hashSet = this.c2;
        if (i7 == 4) {
            spannableStringBuilder.append((CharSequence) gd.M0(2131752612, null));
        } else if (hashSet.size() != 0) {
            spannableStringBuilder.append((CharSequence) gd.M0(2131749489, "GiftPremiumProceedBtn"));
        } else if (gd.a0) {
            spannableStringBuilder.append((CharSequence) gd.M0(2131749502, "GiftPremiumChooseRecipientsBtn"));
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.p2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.p2, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) gd.M0(2131749502, "GiftPremiumChooseRecipientsBtn"));
        }
        tg0Var.c(hashSet.size(), true);
        tg0Var.i(spannableStringBuilder, z10, false);
        tg0Var.setEnabled(hashSet.size() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l1(boolean z10, boolean z11) {
        int L;
        TLRPC.User f10;
        float f11;
        float f12;
        long j3;
        xg.g gVar;
        int size;
        int i7;
        int i10;
        int i11;
        HashSet hashSet;
        xg.h hVar;
        ArrayList arrayList = this.a2;
        arrayList.clear();
        ArrayList arrayList2 = this.b2;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.j2);
        HashSet hashSet2 = this.t2;
        HashSet hashSet3 = this.c2;
        if (isEmpty) {
            TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(this.a).d2(j10.i(this.a).e());
            if (d2 == null) {
                org.telegram.messenger.mp.u1(this.a).c3(j10.i(this.a).f(), 0, true, null);
            }
            int i12 = this.T1;
            if ((i12 == 0 || i12 == 2) && d2 != null && d2.birthday == null) {
                L = org.telegram.messenger.g0.L(50.0f);
                String M0 = gd.M0(2131749401, null);
                xg.g gVar2 = new xg.g(9, false);
                gVar2.h = 1;
                gVar2.i = R.drawable.menu_birthday;
                gVar2.f = M0;
                arrayList2.add(gVar2);
            } else {
                L = 0;
            }
            if (this.s2 != null && i12 == 4) {
                String M02 = gd.M0(2131743183, null);
                xg.g gVar3 = new xg.g(9, false);
                gVar3.h = 3;
                gVar3.i = R.drawable.msg2_link2;
                gVar3.f = M02;
                arrayList2.add(gVar3);
            }
            if ((i12 == 0 || i12 == 2) && (f10 = j10.i(this.a).f()) != null) {
                arrayList2.add(xg.g.b(gd.M0(2131750083, null)));
                xg.g c10 = xg.g.c(f10, hashSet3.contains(Long.valueOf(f10.id)));
                c10.g = gd.M0(2131750084, null);
                arrayList2.add(c10);
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.e2;
            if (arrayList4.isEmpty()) {
                f11 = 56.0f;
                f12 = 32.0f;
                j3 = 0;
            } else {
                ArrayList arrayList5 = new ArrayList();
                f11 = 56.0f;
                int size2 = arrayList4.size();
                int i13 = 0;
                f12 = 32.0f;
                while (i13 < size2) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    ArrayList arrayList6 = arrayList4;
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (c22 != null) {
                        long j10 = c22.id;
                        if (j10 != 0 && !c22.self && !c22.bot && !o10.B(j10) && !o10.y(c22) && !hashSet2.contains(Long.valueOf(c22.id))) {
                            if (hashSet3.contains(Long.valueOf(c22.id))) {
                                arrayList3.add(Long.valueOf(c22.id));
                            }
                            L += org.telegram.messenger.g0.L(56.0f);
                            xg.g c11 = xg.g.c(c22, hashSet3.contains(Long.valueOf(c22.id)));
                            g1(c11);
                            arrayList5.add(c11);
                        }
                    }
                    arrayList4 = arrayList6;
                }
                j3 = 0;
                if (!arrayList5.isEmpty()) {
                    L += org.telegram.messenger.g0.L(32.0f);
                    gVar = xg.g.b(gd.M0(2131749500, null));
                    arrayList2.add(gVar);
                    arrayList2.addAll(arrayList5);
                    ArrayList arrayList7 = this.h2;
                    size = arrayList7.size();
                    i7 = 0;
                    while (i7 < size) {
                        Object obj2 = arrayList7.get(i7);
                        int i14 = i7 + 1;
                        String str = (String) obj2;
                        ArrayList arrayList8 = new ArrayList();
                        for (TLRPC.TL_contact tL_contact : (List) this.g2.get(str)) {
                            long e10 = j10.i(this.a).e();
                            int i15 = i14;
                            String str2 = str;
                            long j11 = tL_contact.user_id;
                            if (j11 == e10 || j11 == j3 || hashSet2.contains(Long.valueOf(j11))) {
                                i11 = L;
                                hashSet = hashSet2;
                            } else {
                                i11 = L;
                                hashSet = hashSet2;
                                TLRPC.User c23 = org.telegram.messenger.mp.u1(this.a).c2(Long.valueOf(tL_contact.user_id));
                                if (c23 != null && !c23.bot && !o10.B(c23.id)) {
                                    int L2 = org.telegram.messenger.g0.L(f11) + i11;
                                    if (hashSet3.contains(Long.valueOf(c23.id))) {
                                        arrayList3.add(Long.valueOf(c23.id));
                                    }
                                    xg.g c12 = xg.g.c(c23, hashSet3.contains(Long.valueOf(c23.id)));
                                    g1(c12);
                                    arrayList8.add(c12);
                                    L = L2;
                                    i14 = i15;
                                    hashSet2 = hashSet;
                                    str = str2;
                                }
                            }
                            i14 = i15;
                            hashSet2 = hashSet;
                            L = i11;
                            str = str2;
                        }
                        int i16 = L;
                        int i17 = i14;
                        String str3 = str;
                        HashSet hashSet4 = hashSet2;
                        if (arrayList8.isEmpty()) {
                            L = i16;
                        } else {
                            L = org.telegram.messenger.g0.L(f12) + i16;
                            String upperCase = str3.toUpperCase();
                            xg.g gVar4 = new xg.g(7, false);
                            gVar4.f = upperCase;
                            arrayList2.add(gVar4);
                            arrayList2.addAll(arrayList8);
                        }
                        i7 = i17;
                        hashSet2 = hashSet4;
                    }
                    if (gVar != null && arrayList3.size() > 0 && !hashSet3.isEmpty()) {
                        String M03 = gd.M0(2131751446, null);
                        ug.a0 a0Var = new ug.a0(2, this, arrayList3);
                        gVar.g = M03;
                        gVar.l = a0Var;
                    }
                    i10 = L;
                }
            }
            gVar = null;
            ArrayList arrayList72 = this.h2;
            size = arrayList72.size();
            i7 = 0;
            while (i7 < size) {
            }
            if (gVar != null) {
                String M032 = gd.M0(2131751446, null);
                ug.a0 a0Var2 = new ug.a0(2, this, arrayList3);
                gVar.g = M032;
                gVar.l = a0Var2;
            }
            i10 = L;
        } else {
            ArrayList arrayList9 = this.f2;
            int size3 = arrayList9.size();
            i10 = 0;
            int i18 = 0;
            while (i18 < size3) {
                Object obj3 = arrayList9.get(i18);
                i18++;
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (!user.bot && !o10.B(user.id)) {
                        long j12 = user.id;
                        i10 += org.telegram.messenger.g0.L(56.0f);
                        if (!hashSet2.contains(Long.valueOf(user.id))) {
                            xg.g c13 = xg.g.c(user, hashSet3.contains(Long.valueOf(j12)));
                            g1(c13);
                            arrayList2.add(c13);
                        }
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new xg.g(5, false));
            i10 += org.telegram.messenger.g0.L(150.0f);
        }
        int max = Math.max(0, ((int) (org.telegram.messenger.g0.q.y * 0.6f)) - i10);
        xg.g gVar5 = new xg.g(-1, false);
        gVar5.k = max;
        arrayList2.add(gVar5);
        if (!z11 || (hVar = this.k2) == null) {
            return;
        }
        if (z10) {
            hVar.E(arrayList, arrayList2);
        } else {
            hVar.f();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 int, still in use, count: 2, list:
          (r5v2 int) from 0x003e: MOVE (r3v7 int) = (r5v2 int) (LINE:63)
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
    public final void m1(boolean r10, boolean r11) {
        /*
            r9 = this;
            r9.l1(r10, r11)
            r11 = -1
            r0 = 0
            r2 = r11
            r1 = r0
            r3 = r1
        L8:
            org.telegram.ui.Components.ck0 r4 = r9.o1
            int r5 = r4.getChildCount()
            if (r1 >= r5) goto L42
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof ah.r
            if (r5 == 0) goto L3f
            int r5 = androidx.recyclerview.widget.RecyclerView.R(r4)
            int r6 = r5 + (-1)
            if (r6 < 0) goto L3f
            java.util.ArrayList r7 = r9.b2
            int r8 = r7.size()
            if (r6 < r8) goto L29
            goto L3f
        L29:
            if (r2 != r11) goto L2c
            r2 = r5
        L2c:
            java.lang.Object r3 = r7.get(r6)
            xg.g r3 = (xg.g) r3
            ah.r r4 = (ah.r) r4
            boolean r3 = r3.j
            r4.c(r3, r10)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4.i(r10, r3)
            r3 = r5
        L3f:
            int r1 = r1 + 1
            goto L8
        L42:
            if (r10 == 0) goto L53
            xg.h r11 = r9.k2
            r11.k(r0, r2)
            xg.h r11 = r9.k2
            int r0 = r11.b()
            int r0 = r0 - r3
            r11.k(r3, r0)
        L53:
            r9.k1(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wg.d1.m1(boolean, boolean):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.a).c(this, ks.U2);
        ks.f(this.a).c(this, ks.E0);
        ks.f(this.a).c(this, ks.O);
        ks.f(this.a).c(this, ks.S0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.a).n(this, ks.U2);
        ks.f(this.a).n(this, ks.E0);
        ks.f(this.a).n(this, ks.O);
        ks.f(this.a).n(this, ks.S0);
    }

    @Override // org.telegram.ui.ActionBar.x2
    public final void s0() {
        super.s0();
        ck0 ck0Var = this.o1;
        if (ck0Var != null) {
            for (int i7 = 0; i7 < ck0Var.getChildCount(); i7++) {
                try {
                    ck0Var.getChildAt(i7).invalidate();
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            }
        }
    }
}
