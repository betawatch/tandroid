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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sbc extends ny0 implements fn7 {
    public final byte S1;
    public final oi7 T1;
    public final ni7 U1;
    public final nf9 V1;
    public final mi7 W1;
    public final og2 X1;
    public final dr0 Y1;
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
    public n2a j2;
    public int k2;
    public final ArrayList l2;
    public boolean m2;
    public float n2;
    public tg2 o2;
    public final bva p2;
    public int q2;
    public z55 r2;
    public final HashSet s2;
    public icc t2;

    public sbc(Activity activity, int i, w53 w53Var) {
        super(activity, null, true, false, w53Var);
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
        this.k2 = hl.L(120.0f);
        this.l2 = new ArrayList();
        final byte b = 0;
        this.m2 = false;
        this.p2 = new bva(this, (byte) 9);
        this.q2 = -1;
        this.s2 = new HashSet();
        this.a = i;
        int i2 = aob.h5;
        L(i2);
        this.s = false;
        this.S1 = (byte) 4;
        n2a n2aVar = this.j2;
        byte b2 = 1;
        if (n2aVar != null) {
            n2aVar.y = true;
        }
        mi7 mi7Var = new mi7(getContext(), w53Var, b2);
        this.W1 = mi7Var;
        mi7Var.setOnCloseClickListener(new mbc(this, (byte) 10));
        mi7Var.setText(K0());
        mi7Var.setCloseImageVisible(false);
        mi7Var.f.c(false, 0.0f);
        this.o2 = new tg2(this, (byte) 4);
        ni7 ni7Var = new ni7(this, getContext(), w53Var, (byte) 1);
        this.U1 = ni7Var;
        yob.h(i2, w53Var, ni7Var);
        ni7Var.setOnSearchTextChange(new nbc(this, b2));
        hashSet.isEmpty();
        ni7Var.b.r(ob6.M0(2131745564, null), false);
        nf9 nf9Var = new nf9((byte) 15, getContext(), this);
        this.V1 = nf9Var;
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.addView(mi7Var, 0, tre.f(-2.0f, -1, 55, i3, 0, i3, 0));
        ViewGroup viewGroup2 = this.b;
        int i4 = this.u0;
        viewGroup2.addView(ni7Var, tre.f(-2.0f, -1, 55, i4, 0, i4, 0));
        ViewGroup viewGroup3 = this.b;
        int i5 = this.u0;
        viewGroup3.addView(nf9Var, tre.f(1.0f, -1, 55, i5, 0, i5, 0));
        dr0 dr0Var = new dr0(getContext(), w53Var, (d79) null);
        this.Y1 = dr0Var;
        dr0Var.setClickable(true);
        dr0Var.setOrientation(1);
        dr0Var.setPadding(hl.L(10.0f), hl.L(10.0f), hl.L(10.0f), hl.L(10.0f));
        yob.h(i2, w53Var, dr0Var);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(hl.L(12.0f), hl.L(4.0f), hl.L(12.0f), hl.L(4.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i6 = aob.i6;
        hf0 Y = aob.Y(aob.v0(i6, this.J0), 6, 6);
        uob M = yob.M(i6);
        linearLayout.setBackground(Y);
        yob.j(linearLayout, Y, null, M, w53Var);
        og2 og2Var = new og2(24, w53Var, activity);
        this.X1 = og2Var;
        og2Var.b(aob.Fi, aob.j7, aob.k7);
        og2Var.setDrawUnchecked(true);
        og2Var.a(false, false);
        og2Var.setDrawBackgroundAsArc(10);
        linearLayout.addView(og2Var, tre.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        yob.X(textView, aob.j5, w53Var);
        bs2.r(14.0f, 1, 2131751790, textView, null);
        linearLayout.addView(textView, tre.t(-2, -2, 16, 9, 0, 0, 0));
        iye.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: qbc
            public final /* synthetic */ sbc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                sbc sbcVar = this.b;
                switch (b3) {
                    case 0:
                        sbcVar.X1.a(!r14.a.q, true);
                        break;
                    default:
                        byte b4 = sbcVar.S1;
                        ArrayList arrayList3 = sbcVar.l2;
                        HashSet hashSet2 = sbcVar.b2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || b4 == 0 || b4 == 2 || b4 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : sbcVar.h2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                hl.t1(sbcVar.U1.getEditText());
                                if (b4 != 1) {
                                    byte b5 = 0;
                                    if (b4 == 4) {
                                        icc iccVar = sbcVar.t2;
                                        if (iccVar != null) {
                                            og2 og2Var2 = sbcVar.X1;
                                            iccVar.a(Boolean.valueOf(og2Var2 != null && og2Var2.a.q), hashSet2);
                                            sbcVar.t2 = null;
                                        }
                                        sbcVar.dismiss();
                                        break;
                                    } else {
                                        List d = on0.d(on0.c(arrayList4.size(), arrayList3));
                                        if (arrayList4.size() == 1) {
                                            long j = ((TLRPC.User) arrayList4.get(0)).id;
                                            if (lbc.b(j)) {
                                                c00.v(ob6.a0(null, null, 2131743397, wf3.s(j)), new d31(sbcVar.c, sbcVar.J0), R.raw.error, 36);
                                                break;
                                            } else {
                                                yx4 yx4Var = new yx4(sbcVar.getContext(), sbcVar.a, j, d, new nbc(sbcVar, b5));
                                                yx4Var.b1(false);
                                                yx4Var.show();
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
        dr0Var.addView(linearLayout, tre.t(-2, -2, 17, 0, 0, 0, 8));
        final byte b3 = 1;
        oi7 oi7Var = new oi7(this, getContext(), w53Var, (byte) 1);
        this.T1 = oi7Var;
        dr0Var.setAlpha(0.0f);
        dr0Var.setVisibility(8);
        oi7Var.setOnClickListener(new View.OnClickListener(this) { // from class: qbc
            public final /* synthetic */ sbc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                sbc sbcVar = this.b;
                switch (b32) {
                    case 0:
                        sbcVar.X1.a(!r14.a.q, true);
                        break;
                    default:
                        byte b4 = sbcVar.S1;
                        ArrayList arrayList3 = sbcVar.l2;
                        HashSet hashSet2 = sbcVar.b2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || b4 == 0 || b4 == 2 || b4 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : sbcVar.h2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                hl.t1(sbcVar.U1.getEditText());
                                if (b4 != 1) {
                                    byte b5 = 0;
                                    if (b4 == 4) {
                                        icc iccVar = sbcVar.t2;
                                        if (iccVar != null) {
                                            og2 og2Var2 = sbcVar.X1;
                                            iccVar.a(Boolean.valueOf(og2Var2 != null && og2Var2.a.q), hashSet2);
                                            sbcVar.t2 = null;
                                        }
                                        sbcVar.dismiss();
                                        break;
                                    } else {
                                        List d = on0.d(on0.c(arrayList4.size(), arrayList3));
                                        if (arrayList4.size() == 1) {
                                            long j = ((TLRPC.User) arrayList4.get(0)).id;
                                            if (lbc.b(j)) {
                                                c00.v(ob6.a0(null, null, 2131743397, wf3.s(j)), new d31(sbcVar.c, sbcVar.J0), R.raw.error, 36);
                                                break;
                                            } else {
                                                yx4 yx4Var = new yx4(sbcVar.getContext(), sbcVar.a, j, d, new nbc(sbcVar, b5));
                                                yx4Var.b1(false);
                                                yx4Var.show();
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
        dr0Var.addView(oi7Var, tre.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i7 = this.u0;
        viewGroup4.addView(dr0Var, tre.f(-2.0f, -1, 87, i7, 0, i7, 0));
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup viewGroup5 = this.b;
        int i8 = this.u0;
        viewGroup5.addView(frameLayout, tre.f(300.0f, -1, 87, i8, 0, i8, hl.L(68.0f)));
        n2a n2aVar2 = this.j2;
        d79 d79Var = this.n1;
        n2aVar2.n = arrayList;
        n2aVar2.f = d79Var;
        int i9 = this.u0;
        d79Var.setPadding(i9, 0, i9, hl.L(60.0f));
        this.n1.j(new qhb(this, (byte) 5));
        this.n1.setOnItemClickListener(new rbc(this, w53Var, i));
        this.n1.setOnItemLongClickListener(new rbc(this));
        zb3 zb3Var = new zb3();
        zb3Var.n(350L);
        zb3Var.o(k43.h);
        zb3Var.C = false;
        zb3Var.m = false;
        this.n1.setItemAnimator(zb3Var);
        this.n1.i(new lr(this, (byte) 10));
        ni7Var.setText("");
        ni7Var.d.b(false);
        ni7Var.b(false, hashSet, new mbc(this, (byte) 11), null);
        mi7Var.setText(K0());
        jy0 jy0Var = this.o1;
        if (jy0Var != null) {
            jy0Var.setTitle(K0());
        }
        f1(false);
        d1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(ls6.d0(this.a).j1);
        }
        h1(false, true);
    }

    @Override // nx0
    public final void H() {
        super.H();
        hl.r(this.p2);
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        n2a n2aVar = new n2a(this.J0, getContext(), false);
        this.j2 = n2aVar;
        n2aVar.s = true;
        return n2aVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        byte b = this.S1;
        if (b != 0) {
            if (b == 1) {
                return ob6.M0(2131749378, null);
            }
            if (b != 2) {
                return b != 4 ? ob6.M0(2131749371, null) : ob6.M0(2131743077, null);
            }
        }
        return ob6.M0(2131749372, null);
    }

    @Override // ny0
    public final void N0(Canvas canvas, int i) {
        float max = Math.max(i, hl.m - hl.L(8.0f)) + hl.L(8.0f);
        mi7 mi7Var = this.W1;
        mi7Var.setTranslationY(max);
        float translationY = mi7Var.getTranslationY() + mi7Var.getMeasuredHeight();
        ni7 ni7Var = this.U1;
        ni7Var.setTranslationY(translationY);
        float translationY2 = ni7Var.getTranslationY() + ni7Var.getMeasuredHeight();
        this.V1.setTranslationY(translationY2);
        this.n1.setTranslationY((r2.getMeasuredHeight() + (ni7Var.getMeasuredHeight() + mi7Var.getMeasuredHeight())) - hl.L(8.0f));
    }

    @Override // nx0
    public final void Z(Configuration configuration) {
        g1(false, true);
    }

    public final void Z0() {
        byte b;
        if (!this.b2.isEmpty() || (b = this.S1) == 1 || b == 2 || b == 4) {
            if (this.m2) {
                return;
            }
            this.m2 = true;
            hl.d3(new mbc(this, (byte) 3), 10L);
            return;
        }
        if (this.m2) {
            this.m2 = false;
            hl.d3(new mbc(this, (byte) 4), 10L);
        }
    }

    public final void a1() {
        if (TextUtils.isEmpty(this.i2)) {
            return;
        }
        this.i2 = null;
        this.U1.setText("");
        hl.r(this.p2);
        g1(true, true);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [obc] */
    /* JADX WARN: Type inference failed for: r3v1, types: [obc] */
    public final m2a b1(m2a m2aVar) {
        TLRPC.User user = m2aVar.c;
        if (this.S1 != 4) {
            m2aVar.m = new jjb(this, user, (byte) 10);
            return m2aVar;
        }
        if (user == null) {
            return m2aVar;
        }
        final long j = user.id;
        final byte b = 0;
        ?? r2 = new View.OnClickListener(this) { // from class: obc
            public final /* synthetic */ sbc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                long j2 = j;
                sbc sbcVar = this.b;
                switch (b2) {
                    case 0:
                        HashSet hashSet = sbcVar.b2;
                        hashSet.add(Long.valueOf(j2));
                        icc iccVar = sbcVar.t2;
                        if (iccVar != null) {
                            iccVar.a(Boolean.FALSE, hashSet);
                            sbcVar.t2 = null;
                        }
                        sbcVar.dismiss();
                        break;
                    default:
                        HashSet hashSet2 = sbcVar.b2;
                        hashSet2.add(Long.valueOf(j2));
                        icc iccVar2 = sbcVar.t2;
                        if (iccVar2 != null) {
                            iccVar2.a(Boolean.TRUE, hashSet2);
                            sbcVar.t2 = null;
                        }
                        sbcVar.dismiss();
                        break;
                }
            }
        };
        final byte b2 = 1;
        ?? r3 = new View.OnClickListener(this) { // from class: obc
            public final /* synthetic */ sbc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                long j2 = j;
                sbc sbcVar = this.b;
                switch (b22) {
                    case 0:
                        HashSet hashSet = sbcVar.b2;
                        hashSet.add(Long.valueOf(j2));
                        icc iccVar = sbcVar.t2;
                        if (iccVar != null) {
                            iccVar.a(Boolean.FALSE, hashSet);
                            sbcVar.t2 = null;
                        }
                        sbcVar.dismiss();
                        break;
                    default:
                        HashSet hashSet2 = sbcVar.b2;
                        hashSet2.add(Long.valueOf(j2));
                        icc iccVar2 = sbcVar.t2;
                        if (iccVar2 != null) {
                            iccVar2.a(Boolean.TRUE, hashSet2);
                            sbcVar.t2 = null;
                        }
                        sbcVar.dismiss();
                        break;
                }
            }
        };
        m2aVar.n = r2;
        m2aVar.o = r3;
        return m2aVar;
    }

    public final int c1() {
        if (this.S1 == 4) {
            return Math.max(0, (uc7.s1(this.a).l4.E3.f() - this.s2.size()) - 1);
        }
        return 10;
    }

    public final void d1(boolean z) {
        ArrayList arrayList = this.c2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(lv2.r(this.a).f0);
            this.f2.putAll(lv2.r(this.a).h0);
            this.g2.addAll(lv2.r(this.a).i0);
            if (z) {
                g1(true, true);
            }
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.U2) {
            dismiss();
            return;
        }
        if (i == jn7.N) {
            hl.c3(new mbc(this, (byte) 0));
        } else if (i == jn7.S0) {
            hl.c3(new mbc(this, (byte) 7));
        } else if (i == jn7.E0) {
            hl.c3(new mbc(this, (byte) 9));
        }
    }

    @Override // nx0, android.app.Dialog, android.content.DialogInterface, ag0
    public final void dismiss() {
        hl.t1(this.U1.getEditText());
        super.dismiss();
    }

    public final void e1() {
        String H = this.S1 == 4 ? ob6.H(',', "UserSelectorLimit", c1()) : ob6.M0(2131753265, null);
        vnb vnbVar = this.J0;
        ex0 ex0Var = this.c;
        new d31(ex0Var, vnbVar).Q(R.raw.chats_infotip, 36, H).k(true);
        try {
            ex0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public final void f1(boolean z) {
        oi7 oi7Var = this.T1;
        oi7Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        byte b = this.S1;
        HashSet hashSet = this.b2;
        if (b == 4) {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131752604, null));
        } else if (hashSet.size() != 0) {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131749450, "GiftPremiumProceedBtn"));
        } else if (ob6.a0) {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131749463, "GiftPremiumChooseRecipientsBtn"));
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.o2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.o2, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) ob6.M0(2131749463, "GiftPremiumChooseRecipientsBtn"));
        }
        oi7Var.c(hashSet.size(), true);
        oi7Var.i(spannableStringBuilder, z, false);
        oi7Var.setEnabled(hashSet.size() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g1(boolean z, boolean z2) {
        int L;
        TLRPC.User f;
        float f2;
        float f3;
        long j;
        m2a m2aVar;
        int size;
        int i;
        int i2;
        int i3;
        HashSet hashSet;
        n2a n2aVar;
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        ArrayList arrayList2 = this.a2;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.i2);
        HashSet hashSet2 = this.s2;
        HashSet hashSet3 = this.b2;
        if (isEmpty) {
            TLRPC.UserFull Y1 = uc7.s1(this.a).Y1(yac.h(this.a).e());
            if (Y1 == null) {
                uc7.s1(this.a).f3(yac.h(this.a).f(), 0, true, null);
            }
            byte b = this.S1;
            if ((b == 0 || b == 2) && Y1 != null && Y1.birthday == null) {
                L = hl.L(50.0f);
                String M0 = ob6.M0(2131749347, null);
                m2a m2aVar2 = new m2a(9, false);
                m2aVar2.h = (byte) 1;
                m2aVar2.i = R.drawable.menu_birthday;
                m2aVar2.f = M0;
                arrayList2.add(m2aVar2);
            } else {
                L = 0;
            }
            if (this.r2 != null && b == 4) {
                String M02 = ob6.M0(2131743072, null);
                m2a m2aVar3 = new m2a(9, false);
                m2aVar3.h = (byte) 3;
                m2aVar3.i = R.drawable.msg2_link2;
                m2aVar3.f = M02;
                arrayList2.add(m2aVar3);
            }
            if ((b == 0 || b == 2) && (f = yac.h(this.a).f()) != null) {
                arrayList2.add(m2a.b(ob6.M0(2131750058, null)));
                m2a c = m2a.c(f, hashSet3.contains(Long.valueOf(f.id)));
                c.g = ob6.M0(2131750059, null);
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
                f2 = 56.0f;
                int size2 = arrayList4.size();
                int i4 = 0;
                f3 = 32.0f;
                while (i4 < size2) {
                    Object obj = arrayList4.get(i4);
                    i4++;
                    ArrayList arrayList6 = arrayList4;
                    TLRPC.User X1 = uc7.s1(this.a).X1(Long.valueOf(((TLRPC.TL_topPeer) obj).peer.user_id));
                    if (X1 != null) {
                        long j2 = X1.id;
                        if (j2 != 0 && !X1.self && !X1.bot && !lbc.C(j2) && !lbc.z(X1) && !hashSet2.contains(Long.valueOf(X1.id))) {
                            if (hashSet3.contains(Long.valueOf(X1.id))) {
                                arrayList3.add(Long.valueOf(X1.id));
                            }
                            L += hl.L(56.0f);
                            m2a c2 = m2a.c(X1, hashSet3.contains(Long.valueOf(X1.id)));
                            b1(c2);
                            arrayList5.add(c2);
                        }
                    }
                    arrayList4 = arrayList6;
                }
                j = 0;
                if (!arrayList5.isEmpty()) {
                    L += hl.L(32.0f);
                    m2aVar = m2a.b(ob6.M0(2131749461, null));
                    arrayList2.add(m2aVar);
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
                            long e = yac.h(this.a).e();
                            ArrayList arrayList9 = arrayList7;
                            int i5 = size;
                            long j3 = tL_contact.user_id;
                            if (j3 == e || j3 == j || hashSet2.contains(Long.valueOf(j3))) {
                                i3 = L;
                                hashSet = hashSet2;
                            } else {
                                i3 = L;
                                hashSet = hashSet2;
                                TLRPC.User X12 = uc7.s1(this.a).X1(Long.valueOf(tL_contact.user_id));
                                if (X12 != null && !X12.bot && !lbc.C(X12.id)) {
                                    int L2 = hl.L(f2) + i3;
                                    if (hashSet3.contains(Long.valueOf(X12.id))) {
                                        arrayList3.add(Long.valueOf(X12.id));
                                    }
                                    m2a c3 = m2a.c(X12, hashSet3.contains(Long.valueOf(X12.id)));
                                    b1(c3);
                                    arrayList8.add(c3);
                                    L = L2;
                                    arrayList7 = arrayList9;
                                    hashSet2 = hashSet;
                                    size = i5;
                                }
                            }
                            arrayList7 = arrayList9;
                            hashSet2 = hashSet;
                            L = i3;
                            size = i5;
                        }
                        int i6 = L;
                        ArrayList arrayList10 = arrayList7;
                        int i7 = size;
                        HashSet hashSet4 = hashSet2;
                        if (arrayList8.isEmpty()) {
                            L = i6;
                        } else {
                            L = hl.L(f3) + i6;
                            String upperCase = str.toUpperCase();
                            m2a m2aVar4 = new m2a(7, false);
                            m2aVar4.f = upperCase;
                            arrayList2.add(m2aVar4);
                            arrayList2.addAll(arrayList8);
                        }
                        arrayList7 = arrayList10;
                        hashSet2 = hashSet4;
                        size = i7;
                    }
                    if (m2aVar != null && arrayList3.size() > 0 && !hashSet3.isEmpty()) {
                        String M03 = ob6.M0(2131751422, null);
                        jjb jjbVar = new jjb(this, arrayList3, (byte) 9);
                        m2aVar.g = M03;
                        m2aVar.l = jjbVar;
                    }
                    i2 = L;
                }
            }
            m2aVar = null;
            ArrayList arrayList72 = this.g2;
            size = arrayList72.size();
            i = 0;
            while (i < size) {
            }
            if (m2aVar != null) {
                String M032 = ob6.M0(2131751422, null);
                jjb jjbVar2 = new jjb(this, arrayList3, (byte) 9);
                m2aVar.g = M032;
                m2aVar.l = jjbVar2;
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
                    if (!user.bot && !lbc.C(user.id)) {
                        long j4 = user.id;
                        i2 += hl.L(56.0f);
                        if (!hashSet2.contains(Long.valueOf(user.id))) {
                            m2a c4 = m2a.c(user, hashSet3.contains(Long.valueOf(j4)));
                            b1(c4);
                            arrayList2.add(c4);
                        }
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new m2a(5, false));
            i2 += hl.L(150.0f);
        }
        int max = Math.max(0, ((int) (hl.q.y * 0.6f)) - i2);
        m2a m2aVar5 = new m2a(-1, false);
        m2aVar5.k = max;
        arrayList2.add(m2aVar5);
        if (!z2 || (n2aVar = this.j2) == null) {
            return;
        }
        if (z) {
            n2aVar.E(arrayList, arrayList2);
        } else {
            n2aVar.f();
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
    public final void h1(boolean r10, boolean r11) {
        /*
            r9 = this;
            r9.g1(r10, r11)
            r11 = -1
            r0 = 0
            r2 = r11
            r1 = r0
            r3 = r1
        L8:
            d79 r4 = r9.n1
            int r5 = r4.getChildCount()
            if (r1 >= r5) goto L41
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof e3a
            if (r5 == 0) goto L3e
            int r5 = androidx.recyclerview.widget.RecyclerView.S(r4)
            int r6 = r5 + (-1)
            if (r6 < 0) goto L3e
            java.util.ArrayList r7 = r9.a2
            int r8 = r7.size()
            if (r6 >= r8) goto L3e
            if (r2 != r11) goto L2b
            r2 = r5
        L2b:
            java.lang.Object r3 = r7.get(r6)
            m2a r3 = (m2a) r3
            e3a r4 = (e3a) r4
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
            n2a r11 = r9.j2
            r11.l(r0, r2)
            n2a r11 = r9.j2
            int r0 = r11.b()
            int r0 = r0 - r3
            r11.l(r3, r0)
        L52:
            r9.f1(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sbc.h1(boolean, boolean):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.a).b(this, jn7.U2);
        jn7.f(this.a).b(this, jn7.E0);
        jn7.f(this.a).b(this, jn7.N);
        jn7.f(this.a).b(this, jn7.S0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.a).n(this, jn7.U2);
        jn7.f(this.a).n(this, jn7.E0);
        jn7.f(this.a).n(this, jn7.N);
        jn7.f(this.a).n(this, jn7.S0);
    }

    @Override // nx0
    public final void p0() {
        super.p0();
        d79 d79Var = this.n1;
        if (d79Var != null) {
            for (int i = 0; i < d79Var.getChildCount(); i++) {
                try {
                    d79Var.getChildAt(i).invalidate();
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            }
        }
    }
}
