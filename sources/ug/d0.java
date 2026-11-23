package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import di.n4;
import hi.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.i4;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class d0 extends dk0 {
    public final /* synthetic */ k0 c;

    public d0(k0 k0Var) {
        this.c = k0Var;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        k0 k0Var = this.c;
        int i7 = k0Var.d2;
        if ((i7 == 11 || i7 == 34) && !k0Var.U1) {
            return false;
        }
        int i10 = f1Var.f;
        return i10 == 1 || i10 == 4;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.g2;
    }

    @Override // v4.i0
    public final int d(int i7) {
        int i10;
        k0 k0Var = this.c;
        if (k0Var.h2 == i7) {
            return 0;
        }
        if (k0Var.i2 == i7) {
            return 2;
        }
        if (k0Var.j2 == i7) {
            return 3;
        }
        if (k0Var.m2 == i7) {
            return 5;
        }
        if (k0Var.n2 == i7) {
            return 6;
        }
        if (k0Var.V1 == i7) {
            return 7;
        }
        if (k0Var.o2 == i7) {
            return 8;
        }
        ArrayList arrayList = k0Var.q2;
        if (arrayList != null && i7 >= (i10 = k0Var.p2) && i7 <= arrayList.size() + i10) {
            return 9;
        }
        int i11 = k0Var.d2;
        return (i11 == 5 || i11 == 11 || i11 == 34) ? 4 : 1;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        k0 k0Var = this.c;
        int i10 = k0Var.d2;
        HashSet hashSet = k0Var.u2;
        int i11 = f1Var.f;
        View view = f1Var.a;
        if (i11 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) k0Var.e2.get(i7 - k0Var.k2);
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            nVar.a(chat, false);
            nVar.r.a(hashSet.contains(chat), currentChannel == chat);
            return;
        }
        if (i11 != 9) {
            if (i11 == 3) {
                o4 o4Var = (o4) view;
                if (i10 != 11 && i10 != 34) {
                    if (i10 == 2) {
                        o4Var.setText(hd.N0(2131742525, null));
                        return;
                    } else {
                        o4Var.setText(hd.N0(2131748840, null));
                        return;
                    }
                }
                if (k0Var.U1) {
                    o4Var.setText(hd.N0(2131752390, null));
                    return;
                } else if (k0Var.x2.size() == 1) {
                    o4Var.setText(hd.N0(2131752387, null));
                    return;
                } else {
                    o4Var.setText(hd.N0(2131752386, null));
                    return;
                }
            }
            if (i11 != 4) {
                return;
            }
            i4 i4Var = (i4) view;
            if (i10 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) k0Var.v2.get(i7 - k0Var.k2);
                i4Var.e(chat2, chat2.title, (String) k0Var.w2.get(i7 - k0Var.k2), ((float) i7) != ((float) k0Var.l2) - 1.0f);
                i4Var.c(hashSet.contains(chat2), false);
                return;
            } else {
                if (i10 == 11 || i10 == 34) {
                    TLRPC.User user = (TLRPC.User) k0Var.x2.get(i7 - k0Var.k2);
                    ArrayList arrayList = k0Var.y2;
                    boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                    TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                    i4Var.S = true;
                    i4Var.R = requirementtocontactpremium;
                    i4Var.g();
                    i4Var.e(user, i5.m(0, user.first_name, user.last_name), z10 ? hd.N0(2131748933, null) : hd.d0(k0Var.a, user, null, null), ((float) i7) != ((float) k0Var.l2) - 1.0f);
                    i4Var.c(hashSet.contains(user), false);
                    return;
                }
                return;
            }
        }
        int i12 = i7 - k0Var.p2;
        ArrayList arrayList2 = k0Var.q2;
        if (arrayList2 == null || i12 < 0 || i12 >= arrayList2.size()) {
            return;
        }
        g0 g0Var = (g0) view;
        f0 f0Var = (f0) k0Var.q2.get(i12);
        n4 n4Var = g0Var.c;
        ImageView imageView = g0Var.a;
        m5 m5Var = g0Var.b;
        if (f0Var instanceof e0) {
            g0Var.f = (e0) f0Var;
            g0Var.e = null;
            imageView.setVisibility(8);
            m5Var.setVisibility(8);
            n4Var.setVisibility(0);
            m5 m5Var2 = g0Var.d;
            e0 e0Var = g0Var.f;
            m5Var2.l(hd.G(e0Var.g, e0Var.h ? "BoostLevelUnlocks" : "BoostLevel", new Object[0]), false);
            return;
        }
        if (f0Var != null) {
            g0Var.f = null;
            g0Var.e = f0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(g0Var.e.a);
            m5Var.setVisibility(0);
            f0 f0Var2 = g0Var.e;
            if (f0Var2.d != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(g0Var.e.d);
                sb2.append("_");
                int i13 = g0Var.e.e;
                hd.E0();
                sb2.append(hd.g1(hd.E0().A.a(i13)));
                String O0 = hd.O0(sb2.toString());
                if (O0 == null || O0.startsWith("LOC_ERR")) {
                    O0 = hd.O0(g0Var.e.d + "_other");
                }
                if (O0 == null) {
                    O0 = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(O0);
                int indexOf = O0.indexOf("%d");
                if (indexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(O0);
                    SpannableString spannableString = new SpannableString(a8.p0.n(g0Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                m5Var.l(spannableStringBuilder, false);
            } else {
                String N0 = hd.N0(f0Var2.b, null);
                String str = N0 != null ? N0 : "";
                if (g0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(g0Var.e.c);
                        spannableString2.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    m5Var.l(spannableStringBuilder2, false);
                } else {
                    m5Var.l(str, false);
                }
            }
            n4Var.setVisibility(8);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        int i10 = 10;
        final int i11 = 0;
        k0 k0Var = this.c;
        switch (i7) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new c0(this), true, 9);
                break;
            case 2:
                int i12 = m6.a7;
                View z6Var = new z6(context, m6.w0(i12, k0Var.J0), 0);
                t6.h(i12, z6Var, k0Var.J0);
                view = z6Var;
                break;
            case 3:
                View o4Var = new o4(context);
                o4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                view = o4Var;
                break;
            case 4:
                View i4Var = new i4(1, 0, context, k0Var.J0, false, false);
                int i13 = k0Var.u0;
                i4Var.setPadding(i13, 0, i13, 0);
                view = i4Var;
                break;
            case 5:
                yz yzVar = new yz(context, null);
                yzVar.setViewType(k0Var.d2 == 2 ? 22 : 21);
                yzVar.setIsSingleCell(true);
                yzVar.setIgnoreHeightCheck(true);
                yzVar.setItemsCount(10);
                view = yzVar;
                break;
            case 6:
                view = new ln(k0Var.getContext(), 28);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
                frameLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + k0Var.u0, 0, org.telegram.messenger.g0.L(6.0f) + k0Var.u0, 0);
                TextView textView = new TextView(context);
                if (k0Var.M2 == null && v3.N(k0Var.o1())) {
                    k0Var.M2 = new org.telegram.ui.web.z0(this, 24);
                }
                textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(k0Var.M2 == null ? 18.0f : 50.0f), org.telegram.messenger.g0.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, ma.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L = org.telegram.messenger.g0.L(8.0f);
                int i14 = m6.e7;
                int w02 = m6.w0(i14, k0Var.J0);
                int i15 = m6.i6;
                int o4 = i0.a.o(m6.w0(i15, k0Var.J0), 76);
                org.telegram.ui.Cells.y k02 = m6.k0(L, L, L, L, w02, o4, o4);
                p6 M = t6.M(i14);
                p6 g10 = t6.g(i15, 76);
                h6 h6Var = k0Var.J0;
                textView.setBackground(k02);
                t6.j(textView, k02, M, g10, h6Var);
                t6.U(textView, m6.G6, k0Var.J0);
                final int i16 = 2;
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: ug.b0
                    public final /* synthetic */ d0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i16) {
                            case 0:
                                k0 k0Var2 = this.b.c;
                                wg.l.J0(k0Var2.s1, k0Var2.J0, k0Var2.W1, null);
                                break;
                            case 1:
                                k0 k0Var3 = this.b.c;
                                org.telegram.messenger.g0.g(k0Var3.l1());
                                k0Var3.dismiss();
                                break;
                            case 2:
                                org.telegram.messenger.g0.g(this.b.c.l1());
                                break;
                            default:
                                k0 k0Var4 = this.b.c;
                                k0Var4.M2.run();
                                k0Var4.dismiss();
                                break;
                        }
                    }
                });
                if (k0Var.M2 != null) {
                    ImageView imageView = new ImageView(k0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    t6.s(imageView, m6.j5, k0Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    int L2 = org.telegram.messenger.g0.L(20.0f);
                    int o10 = i0.a.o(m6.w0(i15, k0Var.J0), 76);
                    org.telegram.ui.Cells.y k03 = m6.k0(L2, L2, L2, L2, 0, o10, o10);
                    p6 g11 = t6.g(i15, 76);
                    h6 h6Var2 = k0Var.J0;
                    imageView.setBackground(k03);
                    t6.j(imageView, k03, null, g11, h6Var2);
                    frameLayout.addView(imageView, ma.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i17 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ug.b0
                        public final /* synthetic */ d0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i17) {
                                case 0:
                                    k0 k0Var2 = this.b.c;
                                    wg.l.J0(k0Var2.s1, k0Var2.J0, k0Var2.W1, null);
                                    break;
                                case 1:
                                    k0 k0Var3 = this.b.c;
                                    org.telegram.messenger.g0.g(k0Var3.l1());
                                    k0Var3.dismiss();
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.g(this.b.c.l1());
                                    break;
                                default:
                                    k0 k0Var4 = this.b.c;
                                    k0Var4.M2.run();
                                    k0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(k0Var.l1());
                textView.setGravity(17);
                view = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + k0Var.u0, 0, org.telegram.messenger.g0.L(6.0f) + k0Var.u0, 0);
                linearLayout.setOrientation(1);
                t80 t80Var = new t80(context);
                m80 m80Var = new m80(context, null);
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(hd.N0(k0Var.s1() ? 2131753186 : 2131753187, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.N0(2131753185, null));
                spannableStringBuilder.setSpan(new ha(this, i10), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                int i18 = 2;
                Drawable mutate = k0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i19 = m6.Xc;
                mutate.setColorFilter(new PorterDuffColorFilter(i19, PorterDuff.Mode.SRC_IN));
                nq nqVar = new nq(0, mutate);
                nqVar.a(i19);
                nqVar.c(org.telegram.messenger.g0.L(18.0f));
                nqVar.F = org.telegram.messenger.g0.L(11.0f);
                nqVar.r = -org.telegram.messenger.g0.L(5.0f);
                spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
                m80Var.setText(TextUtils.concat(W2, " ", org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">")));
                m80Var.setTextSize(1, 14.0f);
                m80Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                h6 h6Var3 = k0Var.J0;
                if (h6Var3 instanceof fi.b) {
                    t6.U(m80Var, m6.y6, h6Var3);
                } else {
                    t6.U(m80Var, m6.G6, h6Var3);
                }
                final int i20 = 1;
                m80Var.setGravity(1);
                m80Var.setOnClickListener(new View.OnClickListener(this) { // from class: ug.b0
                    public final /* synthetic */ d0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                k0 k0Var2 = this.b.c;
                                wg.l.J0(k0Var2.s1, k0Var2.J0, k0Var2.W1, null);
                                break;
                            case 1:
                                k0 k0Var3 = this.b.c;
                                org.telegram.messenger.g0.g(k0Var3.l1());
                                k0Var3.dismiss();
                                break;
                            case 2:
                                org.telegram.messenger.g0.g(this.b.c.l1());
                                break;
                            default:
                                k0 k0Var4 = this.b.c;
                                k0Var4.M2.run();
                                k0Var4.dismiss();
                                break;
                        }
                    }
                });
                t80Var.setOnClickListener(new tg.u(m80Var, i18));
                if (k0Var.t1()) {
                    hi.e eVar = new hi.e(context, k0Var.J0, true);
                    eVar.i(hd.N0(2131751755, null), false, true);
                    eVar.setOnClickListener(new View.OnClickListener(this) { // from class: ug.b0
                        public final /* synthetic */ d0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i20) {
                                case 0:
                                    k0 k0Var2 = this.b.c;
                                    wg.l.J0(k0Var2.s1, k0Var2.J0, k0Var2.W1, null);
                                    break;
                                case 1:
                                    k0 k0Var3 = this.b.c;
                                    org.telegram.messenger.g0.g(k0Var3.l1());
                                    k0Var3.dismiss();
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.g(this.b.c.l1());
                                    break;
                                default:
                                    k0 k0Var4 = this.b.c;
                                    k0Var4.M2.run();
                                    k0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(k0Var.C2, ma.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(eVar, ma.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, ma.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(k0Var.B2, ma.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(t80Var, ma.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(m80Var, ma.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                view = new g0(k0Var, context, k0Var.J0);
                break;
            default:
                j0 j0Var = new j0(k0Var, context);
                k0Var.Z1 = j0Var;
                view = j0Var;
                break;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
