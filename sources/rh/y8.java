package rh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bj;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ej;
import org.telegram.messenger.jj;
import org.telegram.messenger.kt;
import org.telegram.messenger.q20;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.el0;
import org.telegram.ui.ex0;
import org.telegram.ui.h51;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y8 extends org.telegram.ui.ActionBar.z2 implements us {
    public final ep A1;
    public final kg.h B1;
    public final jj C1;
    public final ArrayList D1;
    public final a E1;
    public int F1;
    public th.p1 G1;
    public int H1;
    public d0 I1;
    public final dq[] J1;
    public boolean K1;
    public boolean L1;
    public un M1;
    public View N1;
    public ValueAnimator O1;
    public final org.telegram.ui.ActionBar.p6 i1;
    public final int j1;
    public final boolean k1;
    public final boolean l1;
    public final LinearLayout m1;
    public final FrameLayout n1;
    public final LinearLayout o1;
    public final n8 p1;
    public final FrameLayout q1;
    public final FrameLayout r1;
    public final g9 s1;
    public final vh.d t1;
    public final x8 u1;
    public long v1;
    public long w1;
    public final th.h0 x1;
    public final th.c0 y1;
    public final View z1;

    public y8(Context context, final int i10, final long j10, un unVar, jj jjVar, ArrayList arrayList, boolean z10, final boolean z11, long j11, final org.telegram.ui.ActionBar.p6 p6Var) {
        super(1, context, p6Var, false);
        TLRPC.MessageReactor messageReactor;
        boolean z12;
        int[] iArr;
        String a02;
        String str;
        long j12;
        int i11;
        Context context2;
        this.J1 = new dq[1];
        this.L1 = false;
        this.i1 = p6Var;
        this.j1 = i10;
        this.C1 = jjVar;
        this.D1 = arrayList;
        this.k1 = z11;
        this.l1 = z10;
        a aVar = new a(i10, context, p6Var);
        this.E1 = aVar;
        aVar.setScaleX(0.6f);
        aVar.setScaleY(0.6f);
        aVar.setAlpha(0.0f);
        this.c.addView(aVar, w7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        w7.e6.a(aVar);
        aVar.setOnClickListener(new h51(2, context, p6Var));
        long e = d20.i(i10).e();
        if (arrayList != null) {
            int size = arrayList.size();
            int i12 = 0;
            TLRPC.MessageReactor messageReactor2 = null;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                TLRPC.MessageReactor messageReactor3 = (TLRPC.MessageReactor) obj;
                long o10 = org.telegram.messenger.o5.o(messageReactor3.peer_id);
                if (messageReactor3.anonymous && messageReactor3.my) {
                    o10 = e;
                }
                if (messageReactor3.my || o10 == e) {
                    messageReactor2 = messageReactor3;
                }
            }
            messageReactor = messageReactor2;
        } else {
            messageReactor = null;
        }
        boolean z13 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z11) {
            if (arrayList != null) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    if (((TLRPC.MessageReactor) arrayList.get(i13)).my) {
                        break;
                    }
                    i13++;
                }
            }
            this.v1 = j11;
        } else {
            this.v1 = e6.y(i10, false).A(jjVar);
        }
        long j13 = this.v1;
        this.w1 = j13 == 2666000 ? e : j13;
        P(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, p6Var));
        this.F1 = this.G0;
        LinearLayout linearLayout = new LinearLayout(context);
        this.m1 = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.n1 = frameLayout;
        linearLayout.addView(frameLayout, w7.b6.o(-1, -2));
        this.p1 = new n8(this, context, p6Var, z11, i10);
        int[] iArr2 = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j14 = vp.r1(i10).a6;
        ArrayList arrayList2 = new ArrayList();
        int i14 = 0;
        while (true) {
            if (i14 >= 9) {
                z12 = z13;
                break;
            }
            int i15 = iArr2[i14];
            z12 = z13;
            if (i15 > j14) {
                arrayList2.add(Integer.valueOf((int) j14));
                break;
            }
            arrayList2.add(Integer.valueOf(i15));
            if (iArr2[i14] == j14) {
                break;
            }
            i14++;
            z13 = z12;
        }
        int[] iArr3 = new int[arrayList2.size()];
        for (int i16 = 0; i16 < arrayList2.size(); i16++) {
            iArr3[i16] = ((Integer) arrayList2.get(i16)).intValue();
        }
        n8 n8Var = this.p1;
        n8Var.e0 = iArr3;
        if (z10 || z11) {
            if (!z10) {
                n8Var.setAlpha(0.5f);
            }
            this.n1.addView(this.p1, w7.b6.d(-1, -2.0f, 55, 0.0f, z11 ? -50.0f : 0.0f, 0.0f, (!z11 || z12) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.o1 = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z11) {
            this.n1.addView(linearLayout2, w7.b6.d(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.q1 = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.r1 = frameLayout3;
        int L = org.telegram.messenger.i0.L(14.0f);
        int i17 = org.telegram.ui.ActionBar.t6.i5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i17, p6Var));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i17);
        frameLayout3.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(frameLayout3, d02, N, null, p6Var);
        g9 g9Var = new g9(context);
        this.s1 = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(14.0f));
        g9Var.getImageReceiver().A0 = true;
        M0();
        frameLayout3.addView(g9Var, w7.b6.e(28, 28, zs.A1));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i18 = org.telegram.ui.ActionBar.t6.r5;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.t(imageView, i18, p6Var, mode);
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, w7.b6.d(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, w7.b6.e(52, 28, 17));
        frameLayout2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(8.0f), 0);
        linearLayout2.addView(frameLayout2, w7.b6.q(-2, -1, 0.0f, zs.A1, 6, 4, 6, 0));
        w7.e6.a(frameLayout2);
        r.g(i10).o();
        el0 el0Var = new el0(context, 2);
        int i19 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(el0Var, i19, p6Var);
        el0Var.setTextSize(1, 20.0f);
        el0Var.setGravity(17);
        el0Var.setText(cd.L0(2131745056, null));
        el0Var.setTypeface(org.telegram.messenger.i0.o());
        el0Var.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(el0Var, w7.b6.q(-1, -2, 1.0f, zs.E1, 2, 0, 2, 0));
        final int i20 = 0;
        L0(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.W5, p6Var, mode);
        w7.e6.a(imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: rh.k8
            public final /* synthetic */ y8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i20) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        y8 y8Var = this.b;
                        ep epVar = y8Var.A1;
                        epVar.a(!epVar.a.q, true);
                        y8Var.v1 = epVar.a.q ? y8Var.w1 : 2666000L;
                        y8Var.M0();
                        x8 x8Var = y8Var.u1;
                        if (x8Var != null) {
                            x8Var.setMyPrivacy(y8Var.v1);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2, w7.b6.q(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.n1.addView(linearLayout3, w7.b6.d(-1, -2.0f, 55, 0.0f, z11 ? 0.0f : z10 ? 179.0f : 45.0f, 0.0f, 15.0f));
        TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView, i19, p6Var);
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor != null) {
            a02 = cd.H(',', "StarsReactionTextSent", messageReactor.count);
            iArr = null;
        } else {
            iArr = null;
            a02 = cd.a0(null, null, 2131745061, L0 == null ? "" : L0.title);
        }
        textView.setText(org.telegram.messenger.k6.m(org.telegram.messenger.i0.W2(a02), textView.getPaint().getFontMetricsInt(), false, iArr, 0));
        if (z10 && !z11) {
            linearLayout3.addView(textView, w7.b6.t(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z12) {
            if (!z11) {
                linearLayout3.addView(new org.telegram.ui.ActionBar.f5(context, p6Var), w7.b6.t(-1, 30, 55, 0, 20, 0, 0));
            }
            x8 x8Var = new x8(this, context, z11);
            this.u1 = x8Var;
            x8Var.setOnSenderClickListener(new q20() { // from class: rh.l8
                @Override // org.telegram.messenger.q20
                public final void a(Object obj2) {
                    Long l4 = (Long) obj2;
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T == null) {
                        return;
                    }
                    long longValue = l4.longValue();
                    y8 y8Var = y8.this;
                    boolean z14 = z11;
                    if (longValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l4.longValue());
                        if (l4.longValue() == d20.i(i10).e()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        T.presentFragment(new o8(y8Var, bundle, z14));
                        y8Var.dismiss();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l4.longValue());
                        T.presentFragment(new p8(y8Var, bundle2, z14));
                    }
                    y8Var.dismiss();
                }
            });
            this.m1.addView(x8Var, w7.b6.k(0.0f, z11 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, zs.v1));
            View view = new View(context);
            this.z1 = view;
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d7, view, p6Var);
            if (!z11 && (z10 || messageReactor != null)) {
                this.m1.addView(view, w7.b6.n(1.0f / org.telegram.messenger.i0.p, -1, 7, 24, 0, 24, 0));
            }
            str = null;
        } else {
            str = null;
            this.u1 = null;
            this.z1 = null;
        }
        if (z11) {
            int i21 = org.telegram.ui.ActionBar.t6.j5;
            TextView b10 = w7.g6.b(context, 20.0f, i21, true, p6Var);
            b10.setGravity(17);
            b10.setText(cd.L0(z10 ? 2131748801 : 2131748803, str));
            this.m1.addView(b10, w7.b6.t(-1, -2, 7, 32, 6, 32, 9));
            TextView b11 = w7.g6.b(context, 14.0f, i21, false, p6Var);
            b11.setGravity(17);
            org.telegram.messenger.m5.q(null, null, z10 ? 2131748802 : z12 ? 2131748804 : 2131748805, new Object[]{org.telegram.messenger.o5.l(d20.s0, j10)}, b11);
            this.m1.addView(b11, w7.b6.t(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z11) {
            th.h0 h0Var = new th.h0();
            this.x1 = h0Var;
            h0Var.c = this.v1;
            h0Var.g = 50L;
            h0Var.e = true;
            th.c0 c0Var = new th.c0(i10, context, true);
            this.y1 = c0Var;
            c0Var.set(h0Var);
            this.m1.addView(c0Var, w7.b6.t(-2, -2, 17, 32, 0, 32, 20));
        }
        ep epVar = new ep(21, context, p6Var);
        this.A1 = epVar;
        epVar.b(org.telegram.ui.ActionBar.t6.h7, org.telegram.ui.ActionBar.t6.j7, org.telegram.ui.ActionBar.t6.k7);
        epVar.setDrawUnchecked(true);
        epVar.a(this.v1 != 2666000, false);
        x8 x8Var2 = this.u1;
        if (x8Var2 != null) {
            x8Var2.setMyPrivacy(this.v1);
        }
        epVar.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        org.telegram.ui.ActionBar.a7.V(textView2, i19, p6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(cd.L0(2131745064, null));
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
        f7.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(8.0f));
        f7.addView(epVar, w7.b6.t(21, 21, 16, 0, 0, 9, 0));
        f7.addView(textView2, w7.b6.r(-2, -2, 16));
        final int i22 = 1;
        f7.setOnClickListener(new View.OnClickListener(this) { // from class: rh.k8
            public final /* synthetic */ y8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i22) {
                    case 0:
                        this.b.dismiss();
                        break;
                    default:
                        y8 y8Var = this.b;
                        ep epVar2 = y8Var.A1;
                        epVar2.a(!epVar2.a.q, true);
                        y8Var.v1 = epVar2.a.q ? y8Var.w1 : 2666000L;
                        y8Var.M0();
                        x8 x8Var3 = y8Var.u1;
                        if (x8Var3 != null) {
                            x8Var3.setMyPrivacy(y8Var.v1);
                            break;
                        }
                        break;
                }
            }
        });
        w7.e6.b(f7, 0.05f, 1.2f);
        int i23 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y a03 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i23, p6Var), 6, 6);
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i23);
        f7.setBackground(a03);
        org.telegram.ui.ActionBar.a7.k(f7, a03, null, N2, p6Var);
        if (!z11 && (z10 || messageReactor != null)) {
            this.m1.addView(f7, w7.b6.t(-2, -2, 1, 0, z12 ? 10 : 4, 0, 10));
        }
        vh.d dVar = new vh.d(context, p6Var, true);
        this.t1 = dVar;
        dVar.f();
        if (z10 || z11) {
            if (!z10) {
                dVar.setAlpha(0.5f);
                dVar.setEnabled(false);
            }
            this.m1.addView(dVar, w7.b6.k(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        N0(0L);
        dVar.i(h8.X0(false, cd.a0(null, null, 2131745065, cd.E(50L, ',')), this.J1), true, true);
        if (z10) {
            j12 = 0;
            i11 = 10;
            context2 = context;
            dVar.setOnClickListener(new y6(this, jjVar, unVar, i10, z11, context, p6Var, j10, L0));
        } else {
            j12 = 0;
            i11 = 10;
            context2 = context;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: rh.m8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long j15;
                int i24 = i10;
                r g10 = r.g(i24);
                g10.o();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = g10.l;
                if (arrayList4 != null) {
                    arrayList3.addAll(arrayList4);
                }
                arrayList3.add(0, d20.i(i24).f());
                y8 y8Var = y8.this;
                z60 F = z60.F(y8Var.b, p6Var, y8Var.r1);
                int size2 = arrayList3.size();
                int i25 = 0;
                while (i25 < size2) {
                    int i26 = i25 + 1;
                    TLObject tLObject = (TLObject) arrayList3.get(i25);
                    if (tLObject instanceof TLRPC.User) {
                        j15 = ((TLRPC.User) tLObject).id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (org.telegram.messenger.w3.V(chat)) {
                                j15 = -chat.id;
                            }
                        }
                        i25 = i26;
                    }
                    if (j15 != j10) {
                        long j16 = y8Var.v1;
                        F.g(tLObject, j15 == j16 || (j16 == 0 && j15 == d20.i(i24).e()), new kt(y8Var, j15, z11, 2));
                    }
                    i25 = i26;
                }
                F.t = false;
                F.Y = true;
                F.s = 0;
                F.V(5);
                F.Z();
            }
        });
        p80 p80Var = new p80(context2, p6Var);
        p80Var.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.z6, p6Var);
        if (!z11 || z10) {
            p80Var.setText(org.telegram.messenger.i0.T2(cd.L0(2131745063, null), new ph.p0(context2, i11)));
        } else {
            p80Var.setText(cd.L0(2131748806, null));
        }
        p80Var.setGravity(17);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.k5, p6Var);
        if (z10 || z11) {
            this.m1.addView(p80Var, w7.b6.t(-1, -2, 17, 14, 8, 14, 12));
        }
        this.N = this.m1;
        kg.h hVar = new kg.h(context2, 1, 2, 5);
        this.B1 = hVar;
        lg.h hVar2 = hVar.b;
        hVar2.z = org.telegram.ui.ActionBar.t6.Tk;
        hVar2.A = org.telegram.ui.ActionBar.t6.Uk;
        hVar2.b();
        hVar.b.k = 1.0f;
        hVar.setVisibility(4);
        hVar.setPaused(true);
        this.c.addView(hVar, w7.b6.c(150.0f, zs.g2));
        this.p1.setValue(50);
        if (arrayList != null) {
            long j15 = j12;
            for (int i24 = 0; i24 < arrayList.size(); i24++) {
                long j16 = ((TLRPC.MessageReactor) arrayList.get(i24)).count;
                if (j16 > j15) {
                    j15 = j16;
                }
            }
            j15 = messageReactor != null ? j15 - messageReactor.count : j15;
            if (j15 > j12) {
                this.p1.setStarsTop(j15 + 1);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void G(ArrayList arrayList, boolean z10) {
        Property property = View.ALPHA;
        float[] fArr = {z10 ? 1.0f : 0.0f};
        a aVar = this.E1;
        arrayList.add(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_X, z10 ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(aVar, (Property<a, Float>) View.SCALE_Y, z10 ? 1.0f : 0.6f));
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        if (this.p1.k0) {
            return false;
        }
        return this.b0;
    }

    public final void J0(final a6 a6Var) {
        sg.m0 m0Var;
        View view;
        sg.p0 p0Var;
        th.p1 p1Var;
        View view2;
        sg.p0 p0Var2;
        sg.m0 m0Var2;
        jj jjVar;
        n8 n8Var = this.p1;
        kg.h hVar = this.B1;
        jj jjVar2 = this.C1;
        if (jjVar2 != null && (view2 = this.M1.fragmentView) != null && view2.isAttachedToWindow()) {
            View view3 = this.N1;
            if (view3 instanceof org.telegram.ui.Cells.q1) {
                p0Var2 = ((org.telegram.ui.Cells.q1) view3).N;
                p0Var2.getClass();
                m0Var2 = p0Var2.k("stars");
            } else if (view3 instanceof org.telegram.ui.Cells.s0) {
                p0Var2 = ((org.telegram.ui.Cells.s0) view3).E0;
                p0Var2.getClass();
                m0Var2 = p0Var2.k("stars");
            } else {
                p0Var2 = null;
                m0Var2 = null;
            }
            if (m0Var2 == null && p0Var2 != null) {
                ej k92 = this.M1.k9(jjVar2);
                if (k92 != null && !k92.e.isEmpty()) {
                    ArrayList arrayList = k92.d;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            jjVar = null;
                            break;
                        }
                        Object obj = arrayList.get(i10);
                        i10++;
                        jjVar = (jj) obj;
                        bj d = k92.d(jjVar);
                        if (d != null) {
                            int i11 = d.l;
                            if ((i11 & 1) != 0 && (i11 & 8) != 0) {
                                break;
                            }
                        }
                    }
                    if (jjVar != null) {
                        view3 = this.M1.A8(jjVar.f1(), false);
                    }
                }
                if (view3 == null) {
                    return;
                }
                if (view3 instanceof org.telegram.ui.Cells.q1) {
                    p0Var2 = ((org.telegram.ui.Cells.q1) view3).N;
                    p0Var2.getClass();
                    m0Var2 = p0Var2.k("stars");
                }
            }
            if (m0Var2 == null) {
                return;
            }
            p0Var = p0Var2;
            m0Var = m0Var2;
            view = view3;
        } else {
            if (this.G1 == null) {
                return;
            }
            m0Var = null;
            view = null;
            p0Var = null;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        n8Var.getLocationInWindow(iArr);
        rectF.set(n8Var.G.getBounds());
        rectF.inset(-org.telegram.messenger.i0.L(3.5f), -org.telegram.messenger.i0.L(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        i8 i8Var = new i8(this, 2);
        hVar.a0 = i8Var;
        if (hVar.W) {
            hVar.a0 = null;
            i8Var.run();
        }
        if (m0Var != null) {
            m0Var.k = false;
        }
        if (view != null) {
            view.invalidate();
        }
        sg.m0 m0Var3 = m0Var;
        th.c0[] c0VarArr = new th.c0[1];
        if (this.k1 && (p1Var = this.G1) != null) {
            c0VarArr[0] = p1Var.d(this.H1);
        }
        final RectF rectF2 = new RectF();
        final mg.c0 c0Var = new mg.c0(this, c0VarArr, iArr, rectF2, view, p0Var, m0Var3, 17);
        View view4 = view;
        c0Var.run();
        hVar.setPaused(false);
        hVar.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        hVar.setTranslationX(rectF3.centerX() - (org.telegram.messenger.i0.L(150.0f) / 2.0f));
        hVar.setTranslationY(rectF3.centerY() - (org.telegram.messenger.i0.L(150.0f) / 2.0f));
        hVar.setScaleX(rectF3.width() / org.telegram.messenger.i0.L(150.0f));
        hVar.setScaleY(rectF3.height() / org.telegram.messenger.i0.L(150.0f));
        ValueAnimator valueAnimator = this.O1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.O1 = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rh.j8
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                c0Var.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                org.telegram.messenger.i0.Z1(rectF4, rectF5, floatValue, rectF6);
                y8 y8Var = y8.this;
                kg.h hVar2 = y8Var.B1;
                hVar2.setTranslationX(rectF6.centerX() - (org.telegram.messenger.i0.L(150.0f) / 2.0f));
                hVar2.setTranslationY(rectF6.centerY() - (org.telegram.messenger.i0.L(150.0f) / 2.0f));
                float T1 = org.telegram.messenger.i0.T1(Math.max(rectF6.width() / org.telegram.messenger.i0.L(150.0f), rectF6.height() / org.telegram.messenger.i0.L(150.0f)), 1.0f, (float) Math.sin(floatValue * 3.141592653589793d));
                hVar2.setScaleX(T1);
                hVar2.setScaleY(T1);
                lg.h hVar3 = hVar2.b;
                hVar3.d = 360.0f * floatValue;
                hVar3.k = Math.max(0.0f, 1.0f - (4.0f * floatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || floatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.b0(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    y8Var.c.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                Runnable runnable = a6Var;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        this.O1.addListener(new q8(this, m0Var3, view4, c0VarArr, zArr, rectF2, a6Var));
        this.O1.setDuration(800L);
        this.O1.setInterpolator(new org.telegram.ui.Cells.p2(1));
        this.O1.start();
    }

    public final boolean K0() {
        if (!this.k1) {
            r g10 = r.g(this.j1);
            g10.o();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = g10.l;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                if ((obj instanceof TLRPC.Chat) && org.telegram.messenger.w3.V((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        ValueAnimator valueAnimator = this.O1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.L();
        }
    }

    public final void L0(boolean z10) {
        FrameLayout frameLayout = this.q1;
        if ((frameLayout.getVisibility() == 0) != K0()) {
            frameLayout.setVisibility(K0() ? 0 : 8);
            if (z10) {
                if (K0()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.o1, changeBounds);
            }
        }
    }

    public final void M0() {
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.p = 0.42f;
        long j10 = this.v1;
        g9 g9Var = this.s1;
        if (j10 == 2666000) {
            r8Var.g(21);
            int i10 = org.telegram.ui.ActionBar.t6.c8;
            org.telegram.ui.ActionBar.p6 p6Var = this.i1;
            r8Var.i(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
            g9Var.e(null, r8Var);
            return;
        }
        int i11 = this.j1;
        if (j10 >= 0) {
            TLRPC.User Z1 = vp.r1(i11).Z1(Long.valueOf(this.v1));
            r8Var.r(Z1);
            g9Var.e(Z1, r8Var);
        } else {
            TLRPC.Chat L0 = vp.r1(i11).L0(Long.valueOf(-this.v1));
            r8Var.q(L0);
            g9Var.e(L0, r8Var);
        }
    }

    public final void N0(long j10) {
        x8 x8Var;
        long j11;
        long j12;
        long j13 = 0;
        if ((!this.k1 || this.l1 || j10 <= 0) && (x8Var = this.u1) != null) {
            ArrayList arrayList = new ArrayList();
            long e = d20.i(this.j1).e();
            int i10 = 1;
            ArrayList arrayList2 = this.D1;
            if (arrayList2 != null) {
                j12 = 0;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i11);
                    long o10 = org.telegram.messenger.o5.o(messageReactor.peer_id);
                    long j14 = j13;
                    boolean z10 = messageReactor.anonymous;
                    if (z10) {
                        o10 = messageReactor.my ? e : (-i11) - i10;
                    }
                    if (messageReactor.my || o10 == e) {
                        j12 = messageReactor.count;
                    } else {
                        long j15 = messageReactor.count;
                        t8 t8Var = new t8();
                        t8Var.a = z10;
                        t8Var.b = false;
                        t8Var.c = o10;
                        t8Var.d = j15;
                        arrayList.add(t8Var);
                    }
                    i11++;
                    j13 = j14;
                    i10 = 1;
                }
                j11 = j13;
            } else {
                j11 = 0;
                j12 = 0;
            }
            long j16 = j12 + j10;
            if (j16 > j11) {
                boolean z11 = this.v1 == 2666000;
                t8 t8Var2 = new t8();
                t8Var2.a = z11;
                t8Var2.b = true;
                t8Var2.c = e;
                t8Var2.d = j16;
                arrayList.add(t8Var2);
            }
            Collections.sort(arrayList, new ex0(14));
            x8Var.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean Y(float f7, float f10) {
        a aVar = this.E1;
        if (f7 < aVar.getX() || f7 > aVar.getX() + aVar.getWidth() || f10 < aVar.getY() || f10 > aVar.getY() + aVar.getHeight()) {
            return super.Y(f7, f10);
        }
        return false;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.M3) {
            L0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        Long A1;
        if (!this.K1 && !this.L1) {
            this.L1 = true;
            jj jjVar = this.C1;
            if (jjVar != null && ((A1 = jjVar.A1()) == null || A1.longValue() != this.v1)) {
                jjVar.I5(this.v1);
                x5 b10 = x5.b(jjVar);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i10 = this.j1;
                vp r12 = vp.r1(i10);
                long j10 = b10.a;
                int i11 = b10.b;
                tL_messages_togglePaidReactionPrivacy.peer = r12.i1(j10);
                tL_messages_togglePaidReactionPrivacy.msg_id = i11;
                long j11 = this.v1;
                if (j11 == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j11 == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = vp.r1(i10).i1(this.v1);
                }
                zs.f(i10).k(zs.I1, Long.valueOf(b10.a), Integer.valueOf(i11), Long.valueOf(this.v1));
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_togglePaidReactionPrivacy, new ag.c(this, 18));
            }
        }
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.f(this.j1).c(this, zs.M3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.f(this.j1).n(this, zs.M3);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 >= 0 || this.G0 != this.F1 || (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.i1)) == this.G0) {
                return;
            }
            this.G0 = w02;
            this.F1 = w02;
            E0(w02);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
