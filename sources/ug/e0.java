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
import hi.ia;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.i4;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e0 extends bk0 {
    public final /* synthetic */ l0 c;

    public e0(l0 l0Var) {
        this.c = l0Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        l0 l0Var = this.c;
        int i7 = l0Var.d2;
        if ((i7 == 11 || i7 == 34) && !l0Var.U1) {
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
        l0 l0Var = this.c;
        if (l0Var.h2 == i7) {
            return 0;
        }
        if (l0Var.i2 == i7) {
            return 2;
        }
        if (l0Var.j2 == i7) {
            return 3;
        }
        if (l0Var.m2 == i7) {
            return 5;
        }
        if (l0Var.n2 == i7) {
            return 6;
        }
        if (l0Var.V1 == i7) {
            return 7;
        }
        if (l0Var.o2 == i7) {
            return 8;
        }
        ArrayList arrayList = l0Var.q2;
        if (arrayList != null && i7 >= (i10 = l0Var.p2) && i7 <= arrayList.size() + i10) {
            return 9;
        }
        int i11 = l0Var.d2;
        return (i11 == 5 || i11 == 11 || i11 == 34) ? 4 : 1;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        l0 l0Var = this.c;
        int i10 = l0Var.d2;
        HashSet hashSet = l0Var.u2;
        int i11 = f1Var.f;
        View view = f1Var.a;
        if (i11 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) l0Var.e2.get(i7 - l0Var.k2);
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
                        o4Var.setText(gd.M0(2131742533, null));
                        return;
                    } else {
                        o4Var.setText(gd.M0(2131748841, null));
                        return;
                    }
                }
                if (l0Var.U1) {
                    o4Var.setText(gd.M0(2131752391, null));
                    return;
                } else if (l0Var.x2.size() == 1) {
                    o4Var.setText(gd.M0(2131752388, null));
                    return;
                } else {
                    o4Var.setText(gd.M0(2131752387, null));
                    return;
                }
            }
            if (i11 != 4) {
                return;
            }
            i4 i4Var = (i4) view;
            if (i10 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) l0Var.v2.get(i7 - l0Var.k2);
                i4Var.e(chat2, chat2.title, (String) l0Var.w2.get(i7 - l0Var.k2), ((float) i7) != ((float) l0Var.l2) - 1.0f);
                i4Var.c(hashSet.contains(chat2), false);
                return;
            } else {
                if (i10 == 11 || i10 == 34) {
                    TLRPC.User user = (TLRPC.User) l0Var.x2.get(i7 - l0Var.k2);
                    ArrayList arrayList = l0Var.y2;
                    boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                    TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                    i4Var.S = true;
                    i4Var.R = requirementtocontactpremium;
                    i4Var.g();
                    i4Var.e(user, i5.m(0, user.first_name, user.last_name), z10 ? gd.M0(2131748934, null) : gd.d0(l0Var.a, user, null, null), ((float) i7) != ((float) l0Var.l2) - 1.0f);
                    i4Var.c(hashSet.contains(user), false);
                    return;
                }
                return;
            }
        }
        int i12 = i7 - l0Var.p2;
        ArrayList arrayList2 = l0Var.q2;
        if (arrayList2 == null || i12 < 0 || i12 >= arrayList2.size()) {
            return;
        }
        h0 h0Var = (h0) view;
        g0 g0Var = (g0) l0Var.q2.get(i12);
        n4 n4Var = h0Var.c;
        ImageView imageView = h0Var.a;
        n5 n5Var = h0Var.b;
        if (g0Var instanceof f0) {
            h0Var.f = (f0) g0Var;
            h0Var.e = null;
            imageView.setVisibility(8);
            n5Var.setVisibility(8);
            n4Var.setVisibility(0);
            n5 n5Var2 = h0Var.d;
            f0 f0Var = h0Var.f;
            n5Var2.l(gd.G(f0Var.g, f0Var.h ? "BoostLevelUnlocks" : "BoostLevel", new Object[0]), false);
            return;
        }
        if (g0Var != null) {
            h0Var.f = null;
            h0Var.e = g0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(h0Var.e.a);
            n5Var.setVisibility(0);
            g0 g0Var2 = h0Var.e;
            if (g0Var2.d != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(h0Var.e.d);
                sb2.append("_");
                int i13 = h0Var.e.e;
                gd.E0();
                sb2.append(gd.f1(gd.E0().A.a(i13)));
                String N0 = gd.N0(sb2.toString());
                if (N0 == null || N0.startsWith("LOC_ERR")) {
                    N0 = gd.N0(h0Var.e.d + "_other");
                }
                if (N0 == null) {
                    N0 = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                int indexOf = N0.indexOf("%d");
                if (indexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(N0);
                    SpannableString spannableString = new SpannableString(a8.p0.n(h0Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                n5Var.l(spannableStringBuilder, false);
            } else {
                String M0 = gd.M0(g0Var2.b, null);
                String str = M0 != null ? M0 : "";
                if (h0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(h0Var.e.c);
                        spannableString2.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    n5Var.l(spannableStringBuilder2, false);
                } else {
                    n5Var.l(str, false);
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
        l0 l0Var = this.c;
        switch (i7) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new d0(this), true, 9);
                break;
            case 2:
                int i12 = n6.a7;
                View z6Var = new z6(context, n6.w0(i12, l0Var.J0), 0);
                u6.h(i12, z6Var, l0Var.J0);
                view = z6Var;
                break;
            case 3:
                View o4Var = new o4(context);
                o4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                view = o4Var;
                break;
            case 4:
                View i4Var = new i4(1, 0, context, l0Var.J0, false, false);
                int i13 = l0Var.u0;
                i4Var.setPadding(i13, 0, i13, 0);
                view = i4Var;
                break;
            case 5:
                wz wzVar = new wz(context, null);
                wzVar.setViewType(l0Var.d2 == 2 ? 22 : 21);
                wzVar.setIsSingleCell(true);
                wzVar.setIgnoreHeightCheck(true);
                wzVar.setItemsCount(10);
                view = wzVar;
                break;
            case 6:
                view = new jn(l0Var.getContext(), 28);
                break;
            case 7:
                final int i14 = 2;
                FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
                frameLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + l0Var.u0, 0, org.telegram.messenger.g0.L(6.0f) + l0Var.u0, 0);
                TextView textView = new TextView(context);
                if (l0Var.M2 == null && v3.N(l0Var.o1())) {
                    l0Var.M2 = new org.telegram.ui.web.z0(this, 24);
                }
                textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(l0Var.M2 == null ? 18.0f : 50.0f), org.telegram.messenger.g0.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, ma.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L = org.telegram.messenger.g0.L(8.0f);
                int i15 = n6.e7;
                int w02 = n6.w0(i15, l0Var.J0);
                int i16 = n6.i6;
                int o4 = i0.a.o(n6.w0(i16, l0Var.J0), 76);
                org.telegram.ui.Cells.y k02 = n6.k0(L, L, L, L, w02, o4, o4);
                q6 M = u6.M(i15);
                q6 g10 = u6.g(i16, 76);
                i6 i6Var = l0Var.J0;
                textView.setBackground(k02);
                u6.j(textView, k02, M, g10, i6Var);
                u6.U(textView, n6.G6, l0Var.J0);
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: ug.c0
                    public final /* synthetic */ e0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                l0 l0Var2 = this.b.c;
                                wg.l.J0(l0Var2.s1, l0Var2.J0, l0Var2.W1, null);
                                break;
                            case 1:
                                l0 l0Var3 = this.b.c;
                                org.telegram.messenger.g0.g(l0Var3.l1());
                                l0Var3.dismiss();
                                break;
                            case 2:
                                org.telegram.messenger.g0.g(this.b.c.l1());
                                break;
                            default:
                                l0 l0Var4 = this.b.c;
                                l0Var4.M2.run();
                                l0Var4.dismiss();
                                break;
                        }
                    }
                });
                if (l0Var.M2 != null) {
                    ImageView imageView = new ImageView(l0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    u6.s(imageView, n6.j5, l0Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    int L2 = org.telegram.messenger.g0.L(20.0f);
                    int o10 = i0.a.o(n6.w0(i16, l0Var.J0), 76);
                    org.telegram.ui.Cells.y k03 = n6.k0(L2, L2, L2, L2, 0, o10, o10);
                    q6 g11 = u6.g(i16, 76);
                    i6 i6Var2 = l0Var.J0;
                    imageView.setBackground(k03);
                    u6.j(imageView, k03, null, g11, i6Var2);
                    frameLayout.addView(imageView, ma.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i17 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ug.c0
                        public final /* synthetic */ e0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i17) {
                                case 0:
                                    l0 l0Var2 = this.b.c;
                                    wg.l.J0(l0Var2.s1, l0Var2.J0, l0Var2.W1, null);
                                    break;
                                case 1:
                                    l0 l0Var3 = this.b.c;
                                    org.telegram.messenger.g0.g(l0Var3.l1());
                                    l0Var3.dismiss();
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.g(this.b.c.l1());
                                    break;
                                default:
                                    l0 l0Var4 = this.b.c;
                                    l0Var4.M2.run();
                                    l0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(l0Var.l1());
                textView.setGravity(17);
                view = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + l0Var.u0, 0, org.telegram.messenger.g0.L(6.0f) + l0Var.u0, 0);
                linearLayout.setOrientation(1);
                r80 r80Var = new r80(context);
                k80 k80Var = new k80(context, null);
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.M0(l0Var.s1() ? 2131753187 : 2131753188, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.M0(2131753186, null));
                spannableStringBuilder.setSpan(new ia(this, i10), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = l0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i18 = n6.Xc;
                mutate.setColorFilter(new PorterDuffColorFilter(i18, PorterDuff.Mode.SRC_IN));
                lq lqVar = new lq(0, mutate);
                lqVar.a(i18);
                lqVar.c(org.telegram.messenger.g0.L(18.0f));
                lqVar.F = org.telegram.messenger.g0.L(11.0f);
                lqVar.r = -org.telegram.messenger.g0.L(5.0f);
                spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
                k80Var.setText(TextUtils.concat(W2, " ", org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">")));
                k80Var.setTextSize(1, 14.0f);
                k80Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                i6 i6Var3 = l0Var.J0;
                if (i6Var3 instanceof fi.b) {
                    u6.U(k80Var, n6.y6, i6Var3);
                } else {
                    u6.U(k80Var, n6.G6, i6Var3);
                }
                final int i19 = 1;
                k80Var.setGravity(1);
                k80Var.setOnClickListener(new View.OnClickListener(this) { // from class: ug.c0
                    public final /* synthetic */ e0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                l0 l0Var2 = this.b.c;
                                wg.l.J0(l0Var2.s1, l0Var2.J0, l0Var2.W1, null);
                                break;
                            case 1:
                                l0 l0Var3 = this.b.c;
                                org.telegram.messenger.g0.g(l0Var3.l1());
                                l0Var3.dismiss();
                                break;
                            case 2:
                                org.telegram.messenger.g0.g(this.b.c.l1());
                                break;
                            default:
                                l0 l0Var4 = this.b.c;
                                l0Var4.M2.run();
                                l0Var4.dismiss();
                                break;
                        }
                    }
                });
                r80Var.setOnClickListener(new sh.b(k80Var, 3));
                if (l0Var.t1()) {
                    hi.d dVar = new hi.d(context, l0Var.J0, true);
                    dVar.i(gd.M0(2131751756, null), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ug.c0
                        public final /* synthetic */ e0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i19) {
                                case 0:
                                    l0 l0Var2 = this.b.c;
                                    wg.l.J0(l0Var2.s1, l0Var2.J0, l0Var2.W1, null);
                                    break;
                                case 1:
                                    l0 l0Var3 = this.b.c;
                                    org.telegram.messenger.g0.g(l0Var3.l1());
                                    l0Var3.dismiss();
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.g(this.b.c.l1());
                                    break;
                                default:
                                    l0 l0Var4 = this.b.c;
                                    l0Var4.M2.run();
                                    l0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(l0Var.C2, ma.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, ma.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, ma.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(l0Var.B2, ma.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(r80Var, ma.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(k80Var, ma.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                view = new h0(l0Var, context, l0Var.J0);
                break;
            default:
                k0 k0Var = new k0(l0Var, context);
                l0Var.Z1 = k0Var;
                view = k0Var;
                break;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
