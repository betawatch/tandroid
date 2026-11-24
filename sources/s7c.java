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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class s7c extends fy0 implements gk7 {
    public final byte S1;
    public final eg7 T1;
    public final dg7 U1;
    public final si9 V1;
    public final cg7 W1;
    public final wf2 X1;
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
    public ty9 j2;
    public int k2;
    public final ArrayList l2;
    public boolean m2;
    public float n2;
    public bg2 o2;
    public final xia p2;
    public int q2;
    public w35 r2;
    public final HashSet s2;
    public i8c t2;

    public s7c(Activity activity, int i, e53 e53Var) {
        super(activity, null, true, false, e53Var);
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
        this.k2 = gl.L(120.0f);
        this.l2 = new ArrayList();
        final byte b = 0;
        this.m2 = false;
        byte b2 = 10;
        this.p2 = new xia(this, (byte) 10);
        this.q2 = -1;
        this.s2 = new HashSet();
        this.a = i;
        int i2 = bkb.g5;
        M(i2);
        this.s = false;
        this.S1 = (byte) 4;
        ty9 ty9Var = this.j2;
        byte b3 = 1;
        if (ty9Var != null) {
            ty9Var.y = true;
        }
        cg7 cg7Var = new cg7(getContext(), e53Var, b3);
        this.W1 = cg7Var;
        cg7Var.setOnCloseClickListener(new m7c(this, b2));
        cg7Var.setText(J0());
        cg7Var.setCloseImageVisible(false);
        cg7Var.f.c(false, 0.0f);
        this.o2 = new bg2(this, (byte) 4);
        dg7 dg7Var = new dg7(this, getContext(), e53Var, (byte) 1);
        this.U1 = dg7Var;
        zkb.h(i2, e53Var, dg7Var);
        dg7Var.setOnSearchTextChange(new n7c(this, b3));
        hashSet.isEmpty();
        dg7Var.b.r(k96.M0(2131745644, null), false);
        si9 si9Var = new si9((byte) 14, getContext(), this);
        this.V1 = si9Var;
        ViewGroup viewGroup = this.b;
        int i3 = this.u0;
        viewGroup.addView(cg7Var, 0, nme.f(-2.0f, -1, 55, i3, 0, i3, 0));
        ViewGroup viewGroup2 = this.b;
        int i4 = this.u0;
        viewGroup2.addView(dg7Var, nme.f(-2.0f, -1, 55, i4, 0, i4, 0));
        ViewGroup viewGroup3 = this.b;
        int i5 = this.u0;
        viewGroup3.addView(si9Var, nme.f(1.0f, -1, 55, i5, 0, i5, 0));
        dr0 dr0Var = new dr0(getContext(), e53Var, (o39) null);
        this.Y1 = dr0Var;
        dr0Var.setClickable(true);
        dr0Var.setOrientation(1);
        dr0Var.setPadding(gl.L(10.0f), gl.L(10.0f), gl.L(10.0f), gl.L(10.0f));
        zkb.h(i2, e53Var, dr0Var);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setPadding(gl.L(12.0f), gl.L(4.0f), gl.L(12.0f), gl.L(4.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        int i6 = bkb.h6;
        ff0 Y = bkb.Y(bkb.v0(i6, this.J0), 6, 6);
        vkb M = zkb.M(i6);
        linearLayout.setBackground(Y);
        zkb.j(linearLayout, Y, null, M, e53Var);
        wf2 wf2Var = new wf2(24, e53Var, activity);
        this.X1 = wf2Var;
        wf2Var.b(bkb.Ei, bkb.i7, bkb.j7);
        wf2Var.setDrawUnchecked(true);
        wf2Var.a(false, false);
        wf2Var.setDrawBackgroundAsArc(10);
        linearLayout.addView(wf2Var, nme.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        zkb.X(textView, bkb.i5, e53Var);
        ir2.r(14.0f, 1, 2131751813, textView, null);
        linearLayout.addView(textView, nme.t(-2, -2, 16, 9, 0, 0, 0));
        ote.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: q7c
            public final /* synthetic */ s7c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b;
                s7c s7cVar = this.b;
                switch (b4) {
                    case 0:
                        s7cVar.X1.a(!r14.a.q, true);
                        break;
                    default:
                        byte b5 = s7cVar.S1;
                        ArrayList arrayList3 = s7cVar.l2;
                        HashSet hashSet2 = s7cVar.b2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || b5 == 0 || b5 == 2 || b5 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : s7cVar.h2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                gl.t1(s7cVar.U1.getEditText());
                                if (b5 != 1) {
                                    byte b6 = 0;
                                    if (b5 == 4) {
                                        i8c i8cVar = s7cVar.t2;
                                        if (i8cVar != null) {
                                            wf2 wf2Var2 = s7cVar.X1;
                                            i8cVar.a(Boolean.valueOf(wf2Var2 != null && wf2Var2.a.q), hashSet2);
                                            s7cVar.t2 = null;
                                        }
                                        s7cVar.dismiss();
                                        break;
                                    } else {
                                        List d = on0.d(on0.c(arrayList4.size(), arrayList3));
                                        if (arrayList4.size() == 1) {
                                            long j = ((TLRPC.User) arrayList4.get(0)).id;
                                            if (l7c.b(j)) {
                                                b00.u(k96.a0(null, null, 2131743503, cf3.s(j)), new u21(s7cVar.c, s7cVar.J0), R.raw.error, 36);
                                                break;
                                            } else {
                                                tv4 tv4Var = new tv4(s7cVar.getContext(), s7cVar.a, j, d, new n7c(s7cVar, b6));
                                                tv4Var.a1(false);
                                                tv4Var.show();
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
        dr0Var.addView(linearLayout, nme.t(-2, -2, 17, 0, 0, 0, 8));
        final byte b4 = 1;
        eg7 eg7Var = new eg7(this, getContext(), e53Var, (byte) 1);
        this.T1 = eg7Var;
        dr0Var.setAlpha(0.0f);
        dr0Var.setVisibility(8);
        eg7Var.setOnClickListener(new View.OnClickListener(this) { // from class: q7c
            public final /* synthetic */ s7c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b42 = b4;
                s7c s7cVar = this.b;
                switch (b42) {
                    case 0:
                        s7cVar.X1.a(!r14.a.q, true);
                        break;
                    default:
                        byte b5 = s7cVar.S1;
                        ArrayList arrayList3 = s7cVar.l2;
                        HashSet hashSet2 = s7cVar.b2;
                        if (hashSet2.size() != 0) {
                            if (!arrayList3.isEmpty() || b5 == 0 || b5 == 2 || b5 == 4) {
                                ArrayList arrayList4 = new ArrayList();
                                for (TLRPC.User user : s7cVar.h2.values()) {
                                    if (hashSet2.contains(Long.valueOf(user.id))) {
                                        arrayList4.add(user);
                                    }
                                }
                                gl.t1(s7cVar.U1.getEditText());
                                if (b5 != 1) {
                                    byte b6 = 0;
                                    if (b5 == 4) {
                                        i8c i8cVar = s7cVar.t2;
                                        if (i8cVar != null) {
                                            wf2 wf2Var2 = s7cVar.X1;
                                            i8cVar.a(Boolean.valueOf(wf2Var2 != null && wf2Var2.a.q), hashSet2);
                                            s7cVar.t2 = null;
                                        }
                                        s7cVar.dismiss();
                                        break;
                                    } else {
                                        List d = on0.d(on0.c(arrayList4.size(), arrayList3));
                                        if (arrayList4.size() == 1) {
                                            long j = ((TLRPC.User) arrayList4.get(0)).id;
                                            if (l7c.b(j)) {
                                                b00.u(k96.a0(null, null, 2131743503, cf3.s(j)), new u21(s7cVar.c, s7cVar.J0), R.raw.error, 36);
                                                break;
                                            } else {
                                                tv4 tv4Var = new tv4(s7cVar.getContext(), s7cVar.a, j, d, new n7c(s7cVar, b6));
                                                tv4Var.a1(false);
                                                tv4Var.show();
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
        dr0Var.addView(eg7Var, nme.r(-1, 48, 87));
        ViewGroup viewGroup4 = this.b;
        int i7 = this.u0;
        viewGroup4.addView(dr0Var, nme.f(-2.0f, -1, 87, i7, 0, i7, 0));
        FrameLayout frameLayout = new FrameLayout(getContext());
        ViewGroup viewGroup5 = this.b;
        int i8 = this.u0;
        viewGroup5.addView(frameLayout, nme.f(300.0f, -1, 87, i8, 0, i8, gl.L(68.0f)));
        ty9 ty9Var2 = this.j2;
        o39 o39Var = this.n1;
        ty9Var2.n = arrayList;
        ty9Var2.f = o39Var;
        int i9 = this.u0;
        o39Var.setPadding(i9, 0, i9, gl.L(60.0f));
        this.n1.j(new vdb(this, (byte) 5));
        this.n1.setOnItemClickListener(new r7c(this, e53Var, i));
        this.n1.setOnItemLongClickListener(new r7c(this));
        gb3 gb3Var = new gb3();
        gb3Var.n(350L);
        gb3Var.o(s33.h);
        gb3Var.C = false;
        gb3Var.m = false;
        this.n1.setItemAnimator(gb3Var);
        this.n1.i(new kr(this, (byte) 10));
        dg7Var.setText("");
        dg7Var.d.b(false);
        dg7Var.b(false, hashSet, new m7c(this, (byte) 11), null);
        cg7Var.setText(J0());
        by0 by0Var = this.o1;
        if (by0Var != null) {
            by0Var.setTitle(J0());
        }
        e1(false);
        c1(false);
        if (arrayList2.isEmpty()) {
            arrayList2.addAll(hq6.d0(this.a).j1);
        }
        g1(false, true);
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        ty9 ty9Var = new ty9(this.J0, getContext(), false);
        this.j2 = ty9Var;
        ty9Var.s = true;
        return ty9Var;
    }

    @Override // fx0
    public final void I() {
        super.I();
        gl.r(this.p2);
    }

    @Override // fy0
    public final CharSequence J0() {
        byte b = this.S1;
        if (b != 0) {
            if (b == 1) {
                return k96.M0(2131749432, null);
            }
            if (b != 2) {
                return b != 4 ? k96.M0(2131749425, null) : k96.M0(2131743183, null);
            }
        }
        return k96.M0(2131749426, null);
    }

    @Override // fy0
    public final void M0(Canvas canvas, int i) {
        float max = Math.max(i, gl.m - gl.L(8.0f)) + gl.L(8.0f);
        cg7 cg7Var = this.W1;
        cg7Var.setTranslationY(max);
        float translationY = cg7Var.getTranslationY() + cg7Var.getMeasuredHeight();
        dg7 dg7Var = this.U1;
        dg7Var.setTranslationY(translationY);
        float translationY2 = dg7Var.getTranslationY() + dg7Var.getMeasuredHeight();
        this.V1.setTranslationY(translationY2);
        this.n1.setTranslationY((r2.getMeasuredHeight() + (dg7Var.getMeasuredHeight() + cg7Var.getMeasuredHeight())) - gl.L(8.0f));
    }

    public final void Y0() {
        byte b;
        if (!this.b2.isEmpty() || (b = this.S1) == 1 || b == 2 || b == 4) {
            if (this.m2) {
                return;
            }
            this.m2 = true;
            gl.e3(new m7c(this, (byte) 3), 10L);
            return;
        }
        if (this.m2) {
            this.m2 = false;
            gl.e3(new m7c(this, (byte) 4), 10L);
        }
    }

    @Override // fx0
    public final void Z(Configuration configuration) {
        f1(false, true);
    }

    public final void Z0() {
        if (TextUtils.isEmpty(this.i2)) {
            return;
        }
        this.i2 = null;
        this.U1.setText("");
        gl.r(this.p2);
        f1(true, true);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [o7c] */
    /* JADX WARN: Type inference failed for: r3v1, types: [o7c] */
    public final sy9 a1(sy9 sy9Var) {
        TLRPC.User user = sy9Var.c;
        if (this.S1 != 4) {
            sy9Var.m = new vzb(this, user, (byte) 7);
            return sy9Var;
        }
        if (user == null) {
            return sy9Var;
        }
        final long j = user.id;
        final byte b = 0;
        ?? r2 = new View.OnClickListener(this) { // from class: o7c
            public final /* synthetic */ s7c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                long j2 = j;
                s7c s7cVar = this.b;
                switch (b2) {
                    case 0:
                        HashSet hashSet = s7cVar.b2;
                        hashSet.add(Long.valueOf(j2));
                        i8c i8cVar = s7cVar.t2;
                        if (i8cVar != null) {
                            i8cVar.a(Boolean.FALSE, hashSet);
                            s7cVar.t2 = null;
                        }
                        s7cVar.dismiss();
                        break;
                    default:
                        HashSet hashSet2 = s7cVar.b2;
                        hashSet2.add(Long.valueOf(j2));
                        i8c i8cVar2 = s7cVar.t2;
                        if (i8cVar2 != null) {
                            i8cVar2.a(Boolean.TRUE, hashSet2);
                            s7cVar.t2 = null;
                        }
                        s7cVar.dismiss();
                        break;
                }
            }
        };
        final byte b2 = 1;
        ?? r3 = new View.OnClickListener(this) { // from class: o7c
            public final /* synthetic */ s7c b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b2;
                long j2 = j;
                s7c s7cVar = this.b;
                switch (b22) {
                    case 0:
                        HashSet hashSet = s7cVar.b2;
                        hashSet.add(Long.valueOf(j2));
                        i8c i8cVar = s7cVar.t2;
                        if (i8cVar != null) {
                            i8cVar.a(Boolean.FALSE, hashSet);
                            s7cVar.t2 = null;
                        }
                        s7cVar.dismiss();
                        break;
                    default:
                        HashSet hashSet2 = s7cVar.b2;
                        hashSet2.add(Long.valueOf(j2));
                        i8c i8cVar2 = s7cVar.t2;
                        if (i8cVar2 != null) {
                            i8cVar2.a(Boolean.TRUE, hashSet2);
                            s7cVar.t2 = null;
                        }
                        s7cVar.dismiss();
                        break;
                }
            }
        };
        sy9Var.n = r2;
        sy9Var.o = r3;
        return sy9Var;
    }

    public final int b1() {
        if (this.S1 == 4) {
            return Math.max(0, (na7.q1(this.a).k4.w3.f() - this.s2.size()) - 1);
        }
        return 10;
    }

    public final void c1(boolean z) {
        ArrayList arrayList = this.c2;
        if (arrayList.isEmpty()) {
            arrayList.addAll(qu2.r(this.a).f0);
            this.f2.putAll(qu2.r(this.a).h0);
            this.g2.addAll(qu2.r(this.a).i0);
            if (z) {
                f1(true, true);
            }
        }
    }

    public final void d1() {
        String H = this.S1 == 4 ? k96.H(',', "UserSelectorLimit", b1()) : k96.M0(2131753269, null);
        wjb wjbVar = this.J0;
        ww0 ww0Var = this.c;
        new u21(ww0Var, wjbVar).Q(R.raw.chats_infotip, 36, H).k(true);
        try {
            ww0Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.T2) {
            dismiss();
            return;
        }
        if (i == kk7.N) {
            gl.d3(new m7c(this, (byte) 0));
        } else if (i == kk7.R0) {
            gl.d3(new m7c(this, (byte) 6));
        } else if (i == kk7.D0) {
            gl.d3(new m7c(this, (byte) 9));
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        gl.t1(this.U1.getEditText());
        super.dismiss();
    }

    public final void e1(boolean z) {
        eg7 eg7Var = this.T1;
        eg7Var.setShowZero(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        byte b = this.S1;
        HashSet hashSet = this.b2;
        if (b == 4) {
            spannableStringBuilder.append((CharSequence) k96.M0(2131752611, null));
        } else if (hashSet.size() != 0) {
            spannableStringBuilder.append((CharSequence) k96.M0(2131749489, "GiftPremiumProceedBtn"));
        } else if (k96.a0) {
            spannableStringBuilder.append((CharSequence) k96.M0(2131749502, "GiftPremiumChooseRecipientsBtn"));
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.o2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) "d").setSpan(this.o2, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) k96.M0(2131749502, "GiftPremiumChooseRecipientsBtn"));
        }
        eg7Var.c(hashSet.size(), true);
        eg7Var.i(spannableStringBuilder, z, false);
        eg7Var.setEnabled(hashSet.size() > 0);
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
        sy9 sy9Var;
        int size;
        int i;
        int i2;
        int i3;
        ty9 ty9Var;
        ArrayList arrayList = this.Z1;
        arrayList.clear();
        ArrayList arrayList2 = this.a2;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        boolean isEmpty = TextUtils.isEmpty(this.i2);
        HashSet hashSet = this.s2;
        HashSet hashSet2 = this.b2;
        if (isEmpty) {
            TLRPC.UserFull W1 = na7.q1(this.a).W1(y6c.h(this.a).e());
            if (W1 == null) {
                na7.q1(this.a).Y2(y6c.h(this.a).f(), 0, true, null);
            }
            byte b = this.S1;
            if ((b == 0 || b == 2) && W1 != null && W1.birthday == null) {
                L = gl.L(50.0f);
                String M0 = k96.M0(2131749401, null);
                sy9 sy9Var2 = new sy9(9, false);
                sy9Var2.h = (byte) 1;
                sy9Var2.i = R.drawable.menu_birthday;
                sy9Var2.f = M0;
                arrayList2.add(sy9Var2);
            } else {
                L = 0;
            }
            if (this.r2 != null && b == 4) {
                String M02 = k96.M0(2131743178, null);
                sy9 sy9Var3 = new sy9(9, false);
                sy9Var3.h = (byte) 3;
                sy9Var3.i = R.drawable.msg2_link2;
                sy9Var3.f = M02;
                arrayList2.add(sy9Var3);
            }
            if ((b == 0 || b == 2) && (f = y6c.h(this.a).f()) != null) {
                arrayList2.add(sy9.b(k96.M0(2131750083, null)));
                sy9 c = sy9.c(f, hashSet2.contains(Long.valueOf(f.id)));
                c.g = k96.M0(2131750084, null);
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
                    na7 q1 = na7.q1(this.a);
                    TLRPC.Peer peer = ((TLRPC.TL_topPeer) obj).peer;
                    ArrayList arrayList6 = arrayList4;
                    TLRPC.User V1 = q1.V1(Long.valueOf(peer.user_id));
                    if (V1 != null) {
                        long j2 = V1.id;
                        if (j2 != 0 && !V1.self && !V1.bot && !l7c.B(j2) && !l7c.y(V1) && !hashSet.contains(Long.valueOf(V1.id))) {
                            if (hashSet2.contains(Long.valueOf(V1.id))) {
                                arrayList3.add(Long.valueOf(V1.id));
                            }
                            L += gl.L(56.0f);
                            sy9 c2 = sy9.c(V1, hashSet2.contains(Long.valueOf(V1.id)));
                            a1(c2);
                            arrayList5.add(c2);
                        }
                    }
                    arrayList4 = arrayList6;
                }
                f3 = 32.0f;
                j = 0;
                if (!arrayList5.isEmpty()) {
                    L += gl.L(32.0f);
                    sy9Var = sy9.b(k96.M0(2131749500, null));
                    arrayList2.add(sy9Var);
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
                            long e = y6c.h(this.a).e();
                            ArrayList arrayList9 = arrayList7;
                            int i5 = size;
                            long j3 = tL_contact.user_id;
                            if (j3 == e || j3 == j || hashSet.contains(Long.valueOf(j3))) {
                                i3 = L;
                            } else {
                                i3 = L;
                                HashSet hashSet3 = hashSet;
                                TLRPC.User V12 = na7.q1(this.a).V1(Long.valueOf(tL_contact.user_id));
                                if (V12 == null || V12.bot) {
                                    hashSet = hashSet3;
                                } else {
                                    hashSet = hashSet3;
                                    if (!l7c.B(V12.id)) {
                                        int L2 = gl.L(f2) + i3;
                                        if (hashSet2.contains(Long.valueOf(V12.id))) {
                                            arrayList3.add(Long.valueOf(V12.id));
                                        }
                                        sy9 c3 = sy9.c(V12, hashSet2.contains(Long.valueOf(V12.id)));
                                        a1(c3);
                                        arrayList8.add(c3);
                                        arrayList7 = arrayList9;
                                        L = L2;
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
                            L = gl.L(f3) + i6;
                            String upperCase = str.toUpperCase();
                            sy9 sy9Var4 = new sy9(7, false);
                            sy9Var4.f = upperCase;
                            arrayList2.add(sy9Var4);
                            arrayList2.addAll(arrayList8);
                        }
                        arrayList7 = arrayList10;
                        size = i7;
                    }
                    if (sy9Var != null && arrayList3.size() > 0 && !hashSet2.isEmpty()) {
                        String M03 = k96.M0(2131751445, null);
                        vzb vzbVar = new vzb(this, arrayList3, (byte) 6);
                        sy9Var.g = M03;
                        sy9Var.l = vzbVar;
                    }
                    i2 = L;
                }
            }
            sy9Var = null;
            ArrayList arrayList72 = this.g2;
            size = arrayList72.size();
            i = 0;
            while (i < size) {
            }
            if (sy9Var != null) {
                String M032 = k96.M0(2131751445, null);
                vzb vzbVar2 = new vzb(this, arrayList3, (byte) 6);
                sy9Var.g = M032;
                sy9Var.l = vzbVar2;
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
                    if (!user.bot && !l7c.B(user.id)) {
                        long j4 = user.id;
                        i2 += gl.L(56.0f);
                        if (!hashSet.contains(Long.valueOf(user.id))) {
                            sy9 c4 = sy9.c(user, hashSet2.contains(Long.valueOf(j4)));
                            a1(c4);
                            arrayList2.add(c4);
                        }
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(new sy9(5, false));
            i2 += gl.L(150.0f);
        }
        int max = Math.max(0, ((int) (gl.q.y * 0.6f)) - i2);
        sy9 sy9Var5 = new sy9(-1, false);
        sy9Var5.k = max;
        arrayList2.add(sy9Var5);
        if (!z2 || (ty9Var = this.j2) == null) {
            return;
        }
        if (z) {
            ty9Var.E(arrayList, arrayList2);
        } else {
            ty9Var.f();
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
            o39 r4 = r9.n1
            int r5 = r4.getChildCount()
            if (r1 >= r5) goto L41
            android.view.View r4 = r4.getChildAt(r1)
            boolean r5 = r4 instanceof kz9
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
            sy9 r3 = (sy9) r3
            kz9 r4 = (kz9) r4
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
            ty9 r11 = r9.j2
            r11.l(r0, r2)
            ty9 r11 = r9.j2
            int r0 = r11.b()
            int r0 = r0 - r3
            r11.l(r3, r0)
        L52:
            r9.e1(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s7c.g1(boolean, boolean):void");
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        kk7.f(this.a).b(this, kk7.T2);
        kk7.f(this.a).b(this, kk7.D0);
        kk7.f(this.a).b(this, kk7.N);
        kk7.f(this.a).b(this, kk7.R0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.a).n(this, kk7.T2);
        kk7.f(this.a).n(this, kk7.D0);
        kk7.f(this.a).n(this, kk7.N);
        kk7.f(this.a).n(this, kk7.R0);
    }

    @Override // fx0
    public final void p0() {
        super.p0();
        o39 o39Var = this.n1;
        if (o39Var != null) {
            for (int i = 0; i < o39Var.getChildCount(); i++) {
                try {
                    o39Var.getChildAt(i).invalidate();
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            }
        }
    }
}
