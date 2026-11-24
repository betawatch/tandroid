// default package

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t9c extends mz0 implements jm7 {
    public final byte S1;
    public final hi7 T1;
    public final gi7 U1;
    public final xd9 V1;
    public final fi7 W1;
    public final jh2 X1;
    public final ds0 Y1;
    public final ArrayList Z1;
    public final ArrayList a2;
    public final HashSet b2;
    public final ArrayList c2;
    public final ArrayList d2;
    public final ArrayList e2;
    public final HashMap f2;
    public final ArrayList g2;
    public final LinkedHashMap h2;
    public String i2;
    public v0a j2;
    public int k2;
    public final ArrayList l2;
    public boolean m2;
    public float n2;
    public ph2 o2;
    public final zka p2;
    public int q2;
    public v55 r2;
    public final HashSet s2;
    public jac t2;

    public t9c(Activity activity, int i, q63 q63Var) {
        super(activity, null, true, false, q63Var);
        this.Z1 = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.a2 = arrayList;
        HashSet hashSet = new HashSet();
        this.b2 = hashSet;
        this.c2 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.d2 = arrayList2;
        this.e2 = new ArrayList();
        this.f2 = new HashMap();
        this.g2 = new ArrayList();
        this.h2 = new LinkedHashMap();
        this.k2 = gm.L(120.0f);
        this.l2 = new ArrayList();
        final byte b = 0;
        this.m2 = false;
        byte b2 = 10;
        this.p2 = new zka(this, (byte) 10);
        this.q2 = -1;
        this.s2 = new HashSet();
        this.a = i;
        int i2 = cmb.g5;
        L(i2);
        this.s = false;
        this.S1 = (byte) 4;
        v0a v0aVar = this.j2;
        byte b3 = 1;
        if (v0aVar != null) {
            v0aVar.y = true;
        }
        fi7 fi7Var = new fi7(getContext(), q63Var, b3);
        this.W1 = fi7Var;
        fi7Var.setOnCloseClickListener(new n9c(this, b2));
        fi7Var.setText(J0());
        fi7Var.setCloseImageVisible(false);
        fi7Var.f.c(false, 0.0f);
        this.o2 = new ph2(this, (byte) 4);
        gi7 gi7Var = new gi7(this, getContext(), q63Var, (byte) 1);
        this.U1 = gi7Var;
        anb.h(i2, q63Var, gi7Var);
        gi7Var.setOnSearchTextChange(new o9c(this, b3));
        hashSet.isEmpty();
        gi7Var.b.r(jb6.M0(2131745570, null), false);
        xd9 xd9Var = new xd9((byte) 15, getContext(), this);
        this.V1 = xd9Var;
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.addView(fi7Var, 0, qoe.f(-2.0f, -1, 55, i3, 0, i3, 0));
        ViewGroup viewGroup2 = this.b;
        int i4 = this.u0;
        viewGroup2.addView(gi7Var, qoe.f(-2.0f, -1, 55, i4, 0, i4, 0));
        ViewGroup viewGroup3 = this.b;
        int i5 = this.u0;
        viewGroup3.addView(xd9Var, qoe.f(1.0f, -1, 55, i5, 0, i5, 0));
        ds0 ds0Var = new ds0(getContext(), q63Var, (r59) null);
        this.Y1 = ds0Var;
        ds0Var.setClickable(true);
        ds0Var.setOrientation(1);
        ds0Var.setPadding(gm.L(10.0f), gm.L(10.0f), gm.L(10.0f), gm.L(10.0f));
        anb.h(i2, q63Var, ds0Var);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(gm.L(12.0f), gm.L(4.0f), gm.L(12.0f), gm.L(4.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i6 = cmb.h6;
        fg0 Y = cmb.Y(cmb.v0(i6, this.J0), 6, 6);
        wmb M = anb.M(i6);
        linearLayout.setBackground(Y);
        anb.j(linearLayout, Y, null, M, q63Var);
        jh2 jh2Var = new jh2(24, q63Var, activity);
        this.X1 = jh2Var;
        jh2Var.b(cmb.Ei, cmb.i7, cmb.j7);
        jh2Var.setDrawUnchecked(true);
        jh2Var.a(false, false);
        jh2Var.setDrawBackgroundAsArc(10);
        linearLayout.addView(jh2Var, qoe.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        anb.X(textView, cmb.i5, q63Var);
        ts2.q(14.0f, 1, 2131751762, textView, null);
        linearLayout.addView(textView, qoe.t(-2, -2, 16, 9, 0, 0, 0));
        rve.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: r9c
            public final /* synthetic */ t9c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b;
                t9c t9cVar = this.b;
                switch (b4) {
                    case 0:
                        t9cVar.X1.a(!r14.a.q, true);
                        break;
                    default:
                        byte b5 = t9cVar.S1;
                        ArrayList arrayList3 = t9cVar.l2;
                        HashSet hashSet2 = t9cVar.b2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || b5 == 0 || b5 == 2 || b5 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : t9cVar.h2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                gm.t1(t9cVar.U1.getEditText());
                                if (b5 != 1) {
                                    byte b6 = 0;
                                    if (b5 == 4) {
                                        jac jacVar = t9cVar.t2;
                                        if (jacVar != null) {
                                            jh2 jh2Var2 = t9cVar.X1;
                                            jacVar.a(Boolean.valueOf(jh2Var2 != null && jh2Var2.a.q), hashSet2);
                                            t9cVar.t2 = null;
                                        }
                                        t9cVar.dismiss();
                                        break;
                                    } else {
                                        List d = oo0.d(oo0.c(arrayList4.size(), arrayList3));
                                        if (arrayList4.size() == 1) {
                                            long j = ((TLRPC.User) arrayList4.get(0)).id;
                                            if (m9c.b(j)) {
                                                b10.u(jb6.a0(null, null, 2131743429, pg3.s(j)), new c41(t9cVar.c, t9cVar.J0), R.raw.error, 36);
                                                break;
                                            } else {
                                                ux4 ux4Var = new ux4(t9cVar.getContext(), t9cVar.a, j, d, new o9c(t9cVar, b6));
                                                ux4Var.a1(false);
                                                ux4Var.show();
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
        ds0Var.addView(linearLayout, qoe.t(-2, -2, 17, 0, 0, 0, 8));
        final byte b4 = 1;
        hi7 hi7Var = new hi7(this, getContext(), q63Var, (byte) 1);
        this.T1 = hi7Var;
        ds0Var.setAlpha(0.0f);
        ds0Var.setVisibility(8);
        hi7Var.setOnClickListener(new View.OnClickListener(this) { // from class: r9c
            public final /* synthetic */ t9c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b42 = b4;
                t9c t9cVar = this.b;
                switch (b42) {
                    case 0:
                        t9cVar.X1.a(!r14.a.q, true);
                        break;
                    default:
                        byte b5 = t9cVar.S1;
                        ArrayList arrayList3 = t9cVar.l2;
                        HashSet hashSet2 = t9cVar.b2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || b5 == 0 || b5 == 2 || b5 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : t9cVar.h2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                gm.t1(t9cVar.U1.getEditText());
                                if (b5 != 1) {
                                    byte b6 = 0;
                                    if (b5 == 4) {
                                        jac jacVar = t9cVar.t2;
                                        if (jacVar != null) {
                                            jh2 jh2Var2 = t9cVar.X1;
                                            jacVar.a(Boolean.valueOf(jh2Var2 != null && jh2Var2.a.q), hashSet2);
                                            t9cVar.t2 = null;
                                        }
                                        t9cVar.dismiss();
                                        break;
                                    } else {
                                        List d = oo0.d(oo0.c(arrayList4.size(), arrayList3));
                                        if (arrayList4.size() == 1) {
                                            long j = ((TLRPC.User) arrayList4.get(0)).id;
                                            if (m9c.b(j)) {
                                                b10.u(jb6.a0(null, null, 2131743429, pg3.s(j)), new c41(t9cVar.c, t9cVar.J0), R.raw.error, 36);
                                                break;
                                            } else {
                                                ux4 ux4Var = new ux4(t9cVar.getContext(), t9cVar.a, j, d, new o9c(t9cVar, b6));
                                                ux4Var.a1(false);
                                                ux4Var.show();
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
        ds0Var.addView(hi7Var, qoe.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i7 = this.u0;
        viewGroup4.addView(ds0Var, qoe.f(-2.0f, -1, 87, i7, 0, i7, 0));
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup viewGroup5 = this.b;
        int i8 = this.u0;
        viewGroup5.addView(frameLayout, qoe.f(300.0f, -1, 87, i8, 0, i8, gm.L(68.0f)));
        v0a v0aVar2 = this.j2;
        r59 r59Var = this.n1;
        v0aVar2.n = arrayList;
        v0aVar2.f = r59Var;
        int i9 = this.u0;
        r59Var.setPadding(i9, 0, i9, gm.L(60.0f));
        this.n1.j(new k2b(this, (byte) 6));
        this.n1.setOnItemClickListener(new s9c(this, q63Var, i));
        this.n1.setOnItemLongClickListener(new s9c(this));
        sc3 sc3Var = new sc3();
        sc3Var.n(350L);
        sc3Var.o(d53.h);
        sc3Var.C = false;
        sc3Var.m = false;
        this.n1.setItemAnimator(sc3Var);
        this.n1.i(new ks(this, (byte) 10));
        gi7Var.setText("");
        gi7Var.d.b(false);
        gi7Var.b(false, hashSet, new n9c(this, (byte) 11), null);
        fi7Var.setText(J0());
        iz0 iz0Var = this.o1;
        if (iz0Var != null) {
            iz0Var.setTitle(J0());
        }
        e1(false);
        c1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(hs6.d0(this.a).j1);
        }
        g1(false, true);
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        v0a v0aVar = new v0a(this.J0, getContext(), false);
        this.j2 = v0aVar;
        v0aVar.s = true;
        return v0aVar;
    }

    @Override // my0
    public final void H() {
        super.H();
        gm.r(this.p2);
    }

    @Override // mz0
    public final CharSequence J0() {
        byte b = this.S1;
        if (b != 0) {
            if (b == 1) {
                return jb6.M0(2131749381, null);
            }
            if (b != 2) {
                return b != 4 ? jb6.M0(2131749374, null) : jb6.M0(2131743109, null);
            }
        }
        return jb6.M0(2131749375, null);
    }

    @Override // mz0
    public final void M0(Canvas canvas, int i) {
        float max = Math.max(i, gm.m - gm.L(8.0f)) + gm.L(8.0f);
        fi7 fi7Var = this.W1;
        fi7Var.setTranslationY(max);
        float translationY = fi7Var.getTranslationY() + fi7Var.getMeasuredHeight();
        gi7 gi7Var = this.U1;
        gi7Var.setTranslationY(translationY);
        float translationY2 = gi7Var.getTranslationY() + gi7Var.getMeasuredHeight();
        this.V1.setTranslationY(translationY2);
        this.n1.setTranslationY((r2.getMeasuredHeight() + (gi7Var.getMeasuredHeight() + fi7Var.getMeasuredHeight())) - gm.L(8.0f));
    }

    public final void Y0() {
        byte b;
        if (!this.b2.isEmpty() || (b = this.S1) == 1 || b == 2 || b == 4) {
            if (this.m2) {
                return;
            }
            this.m2 = true;
            gm.d3(new n9c(this, (byte) 3), 10L);
            return;
        }
        if (this.m2) {
            this.m2 = false;
            gm.d3(new n9c(this, (byte) 4), 10L);
        }
    }

    @Override // my0
    public final void Z(Configuration configuration) {
        f1(false, true);
    }

    public final void Z0() {
        if (TextUtils.isEmpty(this.i2)) {
            return;
        }
        this.i2 = null;
        this.U1.setText("");
        gm.r(this.p2);
        f1(true, true);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [p9c] */
    /* JADX WARN: Type inference failed for: r3v1, types: [p9c] */
    public final u0a a1(u0a u0aVar) {
        TLRPC.User user = u0aVar.c;
        if (this.S1 != 4) {
            u0aVar.m = new fyb(this, user, (byte) 8);
            return u0aVar;
        }
        if (user == null) {
            return u0aVar;
        }
        final long j = user.id;
        final byte b = 0;
        ?? r2 = new View.OnClickListener(this) { // from class: p9c
            public final /* synthetic */ t9c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                long j2 = j;
                t9c t9cVar = this.b;
                switch (b2) {
                    case 0:
                        HashSet hashSet = t9cVar.b2;
                        hashSet.add(Long.valueOf(j2));
                        jac jacVar = t9cVar.t2;
                        if (jacVar != null) {
                            jacVar.a(Boolean.FALSE, hashSet);
                            t9cVar.t2 = null;
                        }
                        t9cVar.dismiss();
                        break;
                    default:
                        HashSet hashSet2 = t9cVar.b2;
                        hashSet2.add(Long.valueOf(j2));
                        jac jacVar2 = t9cVar.t2;
                        if (jacVar2 != null) {
                            jacVar2.a(Boolean.TRUE, hashSet2);
                            t9cVar.t2 = null;
                        }
                        t9cVar.dismiss();
                        break;
                }
            }
        };
        final byte b2 = 1;
        ?? r3 = new View.OnClickListener(this) { // from class: p9c
            public final /* synthetic */ t9c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                long j2 = j;
                t9c t9cVar = this.b;
                switch (b22) {
                    case 0:
                        HashSet hashSet = t9cVar.b2;
                        hashSet.add(Long.valueOf(j2));
                        jac jacVar = t9cVar.t2;
                        if (jacVar != null) {
                            jacVar.a(Boolean.FALSE, hashSet);
                            t9cVar.t2 = null;
                        }
                        t9cVar.dismiss();
                        break;
                    default:
                        HashSet hashSet2 = t9cVar.b2;
                        hashSet2.add(Long.valueOf(j2));
                        jac jacVar2 = t9cVar.t2;
                        if (jacVar2 != null) {
                            jacVar2.a(Boolean.TRUE, hashSet2);
                            t9cVar.t2 = null;
                        }
                        t9cVar.dismiss();
                        break;
                }
            }
        };
        u0aVar.n = r2;
        u0aVar.o = r3;
        return u0aVar;
    }

    public final int b1() {
        if (this.S1 == 4) {
            return Math.max(0, (oc7.r1(this.a).l4.w3.f() - this.s2.size()) - 1);
        }
        return 10;
    }

    public final void c1(boolean z) {
        ArrayList arrayList = this.c2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(bw2.r(this.a).f0);
            this.f2.putAll(bw2.r(this.a).h0);
            this.g2.addAll(bw2.r(this.a).i0);
            if (z) {
                f1(true, true);
            }
        }
    }

    public final void d1() {
        String H = this.S1 == 4 ? jb6.H(',', "UserSelectorLimit", b1()) : jb6.M0(2131753237, null);
        ylb ylbVar = this.J0;
        dy0 dy0Var = this.c;
        new c41(dy0Var, ylbVar).Q(R.raw.chats_infotip, 36, H).k(true);
        try {
            dy0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.U2) {
            dismiss();
            return;
        }
        if (i == nm7.N) {
            gm.c3(new n9c(this, (byte) 0));
        } else if (i == nm7.S0) {
            gm.c3(new n9c(this, (byte) 6));
        } else if (i == nm7.E0) {
            gm.c3(new n9c(this, (byte) 9));
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        gm.t1(this.U1.getEditText());
        super.dismiss();
    }

    public final void e1(boolean z) {
        hi7 hi7Var = this.T1;
        hi7Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        byte b = this.S1;
        HashSet hashSet = this.b2;
        if (b == 4) {
            spannableStringBuilder.append((CharSequence) jb6.M0(2131752576, null));
        } else if (hashSet.size() != 0) {
            spannableStringBuilder.append((CharSequence) jb6.M0(2131749438, "GiftPremiumProceedBtn"));
        } else if (jb6.a0) {
            spannableStringBuilder.append((CharSequence) jb6.M0(2131749451, "GiftPremiumChooseRecipientsBtn"));
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.o2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.o2, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) jb6.M0(2131749451, "GiftPremiumChooseRecipientsBtn"));
        }
        hi7Var.c(hashSet.size(), true);
        hi7Var.i(spannableStringBuilder, z, false);
        hi7Var.setEnabled(hashSet.size() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f1(boolean z, boolean z2) {
        int L;
        TLRPC.User f;
        float f2;
        float f3;
        long j;
        u0a u0aVar;
        int size;
        int i;
        int i2;
        int i3;
        v0a v0aVar;
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        ArrayList arrayList2 = this.a2;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.i2);
        HashSet hashSet = this.s2;
        HashSet hashSet2 = this.b2;
        if (isEmpty) {
            TLRPC.UserFull X1 = oc7.r1(this.a).X1(z8c.h(this.a).e());
            if (X1 == null) {
                oc7.r1(this.a).b3(z8c.h(this.a).f(), 0, true, null);
            }
            byte b = this.S1;
            if ((b == 0 || b == 2) && X1 != null && X1.birthday == null) {
                L = gm.L(50.0f);
                String M0 = jb6.M0(2131749350, null);
                u0a u0aVar2 = new u0a(9, false);
                u0aVar2.h = (byte) 1;
                u0aVar2.i = R.drawable.menu_birthday;
                u0aVar2.f = M0;
                arrayList2.add(u0aVar2);
            } else {
                L = 0;
            }
            if (this.r2 != null && b == 4) {
                String M02 = jb6.M0(2131743104, null);
                u0a u0aVar3 = new u0a(9, false);
                u0aVar3.h = (byte) 3;
                u0aVar3.i = R.drawable.msg2_link2;
                u0aVar3.f = M02;
                arrayList2.add(u0aVar3);
            }
            if ((b == 0 || b == 2) && (f = z8c.h(this.a).f()) != null) {
                arrayList2.add(u0a.b(jb6.M0(2131750032, null)));
                u0a c = u0a.c(f, hashSet2.contains(Long.valueOf(f.id)));
                c.g = jb6.M0(2131750033, null);
                arrayList2.add(c);
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.d2;
            if (arrayList4.isEmpty()) {
                f2 = 56.0f;
                f3 = 32.0f;
                j = 0;
            } else {
                ArrayList arrayList5 = new ArrayList();
                int size2 = arrayList4.size();
                f2 = 56.0f;
                int i4 = 0;
                while (i4 < size2) {
                    Object obj = arrayList4.get(i4);
                    i4++;
                    oc7 r1 = oc7.r1(this.a);
                    TLRPC.Peer peer = ((TLRPC.TL_topPeer) obj).peer;
                    ArrayList arrayList6 = arrayList4;
                    TLRPC.User W1 = r1.W1(Long.valueOf(peer.user_id));
                    if (W1 != null) {
                        long j2 = W1.id;
                        if (j2 != 0 && !W1.self && !W1.bot && !m9c.C(j2) && !m9c.z(W1) && !hashSet.contains(Long.valueOf(W1.id))) {
                            if (hashSet2.contains(Long.valueOf(W1.id))) {
                                arrayList3.add(Long.valueOf(W1.id));
                            }
                            L += gm.L(56.0f);
                            u0a c2 = u0a.c(W1, hashSet2.contains(Long.valueOf(W1.id)));
                            a1(c2);
                            arrayList5.add(c2);
                        }
                    }
                    arrayList4 = arrayList6;
                }
                f3 = 32.0f;
                j = 0;
                if (!arrayList5.isEmpty()) {
                    L += gm.L(32.0f);
                    u0aVar = u0a.b(jb6.M0(2131749449, null));
                    arrayList2.add(u0aVar);
                    arrayList2.addAll(arrayList5);
                    ArrayList arrayList7 = this.g2;
                    size = arrayList7.size();
                    i = 0;
                    while (i < size) {
                        Object obj2 = arrayList7.get(i);
                        i++;
                        String str = (String) obj2;
                        ArrayList arrayList8 = new ArrayList();
                        for (TLRPC.TL_contact tL_contact : (List) this.f2.get(str)) {
                            long e = z8c.h(this.a).e();
                            ArrayList arrayList9 = arrayList7;
                            int i5 = size;
                            long j3 = tL_contact.user_id;
                            if (j3 == e || j3 == j || hashSet.contains(Long.valueOf(j3))) {
                                i3 = L;
                            } else {
                                i3 = L;
                                HashSet hashSet3 = hashSet;
                                TLRPC.User W12 = oc7.r1(this.a).W1(Long.valueOf(tL_contact.user_id));
                                if (W12 == null || W12.bot) {
                                    hashSet = hashSet3;
                                } else {
                                    hashSet = hashSet3;
                                    if (!m9c.C(W12.id)) {
                                        int L2 = gm.L(f2) + i3;
                                        if (hashSet2.contains(Long.valueOf(W12.id))) {
                                            arrayList3.add(Long.valueOf(W12.id));
                                        }
                                        u0a c3 = u0a.c(W12, hashSet2.contains(Long.valueOf(W12.id)));
                                        a1(c3);
                                        arrayList8.add(c3);
                                        L = L2;
                                        arrayList7 = arrayList9;
                                        size = i5;
                                    }
                                }
                            }
                            arrayList7 = arrayList9;
                            L = i3;
                            size = i5;
                        }
                        int i6 = L;
                        ArrayList arrayList10 = arrayList7;
                        int i7 = size;
                        if (arrayList8.isEmpty()) {
                            L = i6;
                        } else {
                            L = gm.L(f3) + i6;
                            String upperCase = str.toUpperCase();
                            u0a u0aVar4 = new u0a(7, false);
                            u0aVar4.f = upperCase;
                            arrayList2.add(u0aVar4);
                            arrayList2.addAll(arrayList8);
                        }
                        arrayList7 = arrayList10;
                        size = i7;
                    }
                    if (u0aVar != null && arrayList3.size() > 0 && !hashSet2.isEmpty()) {
                        String M03 = jb6.M0(2131751394, null);
                        fyb fybVar = new fyb(this, arrayList3, (byte) 7);
                        u0aVar.g = M03;
                        u0aVar.l = fybVar;
                    }
                    i2 = L;
                }
            }
            u0aVar = null;
            ArrayList arrayList72 = this.g2;
            size = arrayList72.size();
            i = 0;
            while (i < size) {
            }
            if (u0aVar != null) {
                String M032 = jb6.M0(2131751394, null);
                fyb fybVar2 = new fyb(this, arrayList3, (byte) 7);
                u0aVar.g = M032;
                u0aVar.l = fybVar2;
            }
            i2 = L;
        } else {
            ArrayList arrayList11 = this.e2;
            int size3 = arrayList11.size();
            i2 = 0;
            int i8 = 0;
            while (i8 < size3) {
                Object obj3 = arrayList11.get(i8);
                i8++;
                TLObject tLObject = (TLObject) obj3;
                if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (!user.bot && !m9c.C(user.id)) {
                        long j4 = user.id;
                        i2 += gm.L(56.0f);
                        if (!hashSet.contains(Long.valueOf(user.id))) {
                            u0a c4 = u0a.c(user, hashSet2.contains(Long.valueOf(j4)));
                            a1(c4);
                            arrayList2.add(c4);
                        }
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new u0a(5, false));
            i2 += gm.L(150.0f);
        }
        int max = Math.max(0, ((int) (gm.q.y * 0.6f)) - i2);
        u0a u0aVar5 = new u0a(-1, false);
        u0aVar5.k = max;
        arrayList2.add(u0aVar5);
        if (!z2 || (v0aVar = this.j2) == null) {
            return;
        }
        if (z) {
            v0aVar.E(arrayList, arrayList2);
        } else {
            v0aVar.f();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 int, still in use, count: 2, list:
          (r5v2 int) from 0x003d: MOVE (r3v7 int) = (r5v2 int) (LINE:62)
          (r5v2 int) from 0x002a: MOVE (r2v4 int) = (r5v2 int) (LINE:43)
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
    public final void g1(boolean r10, boolean r11) {
        /*
            r9 = this;
            r9.f1(r10, r11)
            r11 = -1
            r0 = 0
            r2 = r11
            r1 = r0
            r3 = r1
        L8:
            r59 r4 = r9.n1
            int r5 = r4.getChildCount()
            if (r1 >= r5) goto L41
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof m1a
            if (r5 == 0) goto L3e
            int r5 = androidx.recyclerview.widget.RecyclerView.R(r4)
            int r6 = r5 + (-1)
            if (r6 < 0) goto L3e
            java.util.ArrayList r7 = r9.a2
            int r8 = r7.size()
            if (r6 >= r8) goto L3e
            if (r2 != r11) goto L2b
            r2 = r5
        L2b:
            java.lang.Object r3 = r7.get(r6)
            u0a r3 = (u0a) r3
            m1a r4 = (m1a) r4
            boolean r3 = r3.j
            r4.c(r3, r10)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4.i(r10, r3)
            r3 = r5
        L3e:
            int r1 = r1 + 1
            goto L8
        L41:
            if (r10 == 0) goto L52
            v0a r11 = r9.j2
            r11.l(r0, r2)
            v0a r11 = r9.j2
            int r0 = r11.b()
            int r0 = r0 - r3
            r11.l(r3, r0)
        L52:
            r9.e1(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t9c.g1(boolean, boolean):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).b(this, nm7.U2);
        nm7.f(this.a).b(this, nm7.E0);
        nm7.f(this.a).b(this, nm7.N);
        nm7.f(this.a).b(this, nm7.S0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.a).n(this, nm7.U2);
        nm7.f(this.a).n(this, nm7.E0);
        nm7.f(this.a).n(this, nm7.N);
        nm7.f(this.a).n(this, nm7.S0);
    }

    @Override // my0
    public final void p0() {
        super.p0();
        r59 r59Var = this.n1;
        if (r59Var != null) {
            for (int i = 0; i < r59Var.getChildCount(); i++) {
                try {
                    r59Var.getChildAt(i).invalidate();
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            }
        }
    }
}
