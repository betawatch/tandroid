package vg;

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
import b8.mf;
import ci.t4;
import gi.ka;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.z70;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b0 extends sj0 {
    public final /* synthetic */ i0 c;

    public b0(i0 i0Var) {
        this.c = i0Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        i0 i0Var = this.c;
        int i3 = i0Var.a2;
        if ((i3 == 11 || i3 == 34) && !i0Var.R1) {
            return false;
        }
        int i10 = d1Var.f;
        return i10 == 1 || i10 == 4;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.d2;
    }

    @Override // u4.h0
    public final int d(int i3) {
        int i10;
        i0 i0Var = this.c;
        if (i0Var.e2 == i3) {
            return 0;
        }
        if (i0Var.f2 == i3) {
            return 2;
        }
        if (i0Var.g2 == i3) {
            return 3;
        }
        if (i0Var.j2 == i3) {
            return 5;
        }
        if (i0Var.k2 == i3) {
            return 6;
        }
        if (i0Var.S1 == i3) {
            return 7;
        }
        if (i0Var.l2 == i3) {
            return 8;
        }
        ArrayList arrayList = i0Var.n2;
        if (arrayList != null && i3 >= (i10 = i0Var.m2) && i3 <= arrayList.size() + i10) {
            return 9;
        }
        int i11 = i0Var.a2;
        return (i11 == 5 || i11 == 11 || i11 == 34) ? 4 : 1;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        i0 i0Var = this.c;
        int i10 = i0Var.a2;
        HashSet hashSet = i0Var.r2;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) i0Var.b2.get(i3 - i0Var.h2);
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            nVar.a(chat, false);
            nVar.r.a(hashSet.contains(chat), currentChannel == chat);
            return;
        }
        if (i11 != 9) {
            if (i11 == 3) {
                n4 n4Var = (n4) view;
                if (i10 != 11 && i10 != 34) {
                    if (i10 == 2) {
                        n4Var.setText(bd.M0(2131742801, null));
                        return;
                    } else {
                        n4Var.setText(bd.M0(2131749041, null));
                        return;
                    }
                }
                if (i0Var.R1) {
                    n4Var.setText(bd.M0(2131752402, null));
                    return;
                } else if (i0Var.u2.size() == 1) {
                    n4Var.setText(bd.M0(2131752399, null));
                    return;
                } else {
                    n4Var.setText(bd.M0(2131752398, null));
                    return;
                }
            }
            if (i11 != 4) {
                return;
            }
            h4 h4Var = (h4) view;
            if (i10 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) i0Var.s2.get(i3 - i0Var.h2);
                h4Var.e(chat2, chat2.title, (String) i0Var.t2.get(i3 - i0Var.h2), ((float) i3) != ((float) i0Var.i2) - 1.0f);
                h4Var.c(hashSet.contains(chat2), false);
                return;
            } else {
                if (i10 == 11 || i10 == 34) {
                    TLRPC.User user = (TLRPC.User) i0Var.u2.get(i3 - i0Var.h2);
                    ArrayList arrayList = i0Var.v2;
                    boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                    TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                    h4Var.S = true;
                    h4Var.R = requirementtocontactpremium;
                    h4Var.g();
                    h4Var.e(user, g5.m(0, user.first_name, user.last_name), z10 ? bd.M0(2131749134, null) : bd.d0(i0Var.a, user, null, null), ((float) i3) != ((float) i0Var.i2) - 1.0f);
                    h4Var.c(hashSet.contains(user), false);
                    return;
                }
                return;
            }
        }
        int i12 = i3 - i0Var.m2;
        ArrayList arrayList2 = i0Var.n2;
        if (arrayList2 == null || i12 < 0 || i12 >= arrayList2.size()) {
            return;
        }
        e0 e0Var = (e0) view;
        d0 d0Var = (d0) i0Var.n2.get(i12);
        t4 t4Var = e0Var.c;
        ImageView imageView = e0Var.a;
        k5 k5Var = e0Var.b;
        if (d0Var instanceof c0) {
            e0Var.f = (c0) d0Var;
            e0Var.e = null;
            imageView.setVisibility(8);
            k5Var.setVisibility(8);
            t4Var.setVisibility(0);
            k5 k5Var2 = e0Var.d;
            c0 c0Var = e0Var.f;
            k5Var2.l(bd.G(c0Var.g, c0Var.h ? "BoostLevelUnlocks" : "BoostLevel", new Object[0]), false);
            return;
        }
        if (d0Var != null) {
            e0Var.f = null;
            e0Var.e = d0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(e0Var.e.a);
            k5Var.setVisibility(0);
            d0 d0Var2 = e0Var.e;
            if (d0Var2.d != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e0Var.e.d);
                sb2.append("_");
                int i13 = e0Var.e.e;
                bd.E0();
                sb2.append(bd.f1(bd.E0().A.a(i13)));
                String N0 = bd.N0(sb2.toString());
                if (N0 == null || N0.startsWith("LOC_ERR")) {
                    N0 = bd.N0(e0Var.e.d + "_other");
                }
                if (N0 == null) {
                    N0 = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                int indexOf = N0.indexOf("%d");
                if (indexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(N0);
                    SpannableString spannableString = new SpannableString(a1.g.o(e0Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                k5Var.l(spannableStringBuilder, false);
            } else {
                String M0 = bd.M0(d0Var2.b, null);
                String str = M0 != null ? M0 : "";
                if (e0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(e0Var.e.c);
                        spannableString2.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    k5Var.l(spannableStringBuilder2, false);
                } else {
                    k5Var.l(str, false);
                }
            }
            t4Var.setVisibility(8);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        Context context = viewGroup.getContext();
        int i10 = 10;
        final int i11 = 0;
        i0 i0Var = this.c;
        switch (i3) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new a0(this), true, 9);
                break;
            case 2:
                int i12 = k6.a7;
                View x6Var = new x6(context, k6.w0(i12, i0Var.J0), 0);
                r6.i(i12, x6Var, i0Var.J0);
                view = x6Var;
                break;
            case 3:
                View n4Var = new n4(context);
                n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                view = n4Var;
                break;
            case 4:
                View h4Var = new h4(1, 0, context, i0Var.J0, false, false);
                int i13 = i0Var.u0;
                h4Var.setPadding(i13, 0, i13, 0);
                view = h4Var;
                break;
            case 5:
                iz izVar = new iz(context, null);
                izVar.setViewType(i0Var.a2 == 2 ? 22 : 21);
                izVar.setIsSingleCell(true);
                izVar.setIgnoreHeightCheck(true);
                izVar.setItemsCount(10);
                view = izVar;
                break;
            case 6:
                view = new sm(i0Var.getContext(), 29);
                break;
            case 7:
                final int i14 = 2;
                FrameLayout frameLayout = new FrameLayout(i0Var.getContext());
                frameLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + i0Var.u0, 0, org.telegram.messenger.g0.L(6.0f) + i0Var.u0, 0);
                TextView textView = new TextView(context);
                if (i0Var.J2 == null && t3.N(i0Var.n1())) {
                    i0Var.J2 = new r4.u(this, 18);
                }
                textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(i0Var.J2 == null ? 18.0f : 50.0f), org.telegram.messenger.g0.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, mf.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L = org.telegram.messenger.g0.L(8.0f);
                int i15 = k6.e7;
                int w02 = k6.w0(i15, i0Var.J0);
                int i16 = k6.i6;
                int o10 = i0.a.o(k6.w0(i16, i0Var.J0), 76);
                org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, w02, o10, o10);
                n6 N = r6.N(i15);
                n6 h = r6.h(i16, 76);
                e6 e6Var = i0Var.J0;
                textView.setBackground(k02);
                r6.k(textView, k02, N, h, e6Var);
                r6.V(textView, k6.G6, i0Var.J0);
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: vg.z
                    public final /* synthetic */ b0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                i0 i0Var2 = this.b.c;
                                xg.n.I0(i0Var2.p1, i0Var2.J0, i0Var2.T1, null);
                                break;
                            case 1:
                                i0 i0Var3 = this.b.c;
                                org.telegram.messenger.g0.g(i0Var3.k1());
                                i0Var3.dismiss();
                                break;
                            case 2:
                                org.telegram.messenger.g0.g(this.b.c.k1());
                                break;
                            default:
                                i0 i0Var4 = this.b.c;
                                i0Var4.J2.run();
                                i0Var4.dismiss();
                                break;
                        }
                    }
                });
                if (i0Var.J2 != null) {
                    ImageView imageView = new ImageView(i0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    r6.t(imageView, k6.j5, i0Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    int L2 = org.telegram.messenger.g0.L(20.0f);
                    int o11 = i0.a.o(k6.w0(i16, i0Var.J0), 76);
                    org.telegram.ui.Cells.y k03 = k6.k0(L2, L2, L2, L2, 0, o11, o11);
                    n6 h7 = r6.h(i16, 76);
                    e6 e6Var2 = i0Var.J0;
                    imageView.setBackground(k03);
                    r6.k(imageView, k03, null, h7, e6Var2);
                    frameLayout.addView(imageView, mf.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i17 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: vg.z
                        public final /* synthetic */ b0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i17) {
                                case 0:
                                    i0 i0Var2 = this.b.c;
                                    xg.n.I0(i0Var2.p1, i0Var2.J0, i0Var2.T1, null);
                                    break;
                                case 1:
                                    i0 i0Var3 = this.b.c;
                                    org.telegram.messenger.g0.g(i0Var3.k1());
                                    i0Var3.dismiss();
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.g(this.b.c.k1());
                                    break;
                                default:
                                    i0 i0Var4 = this.b.c;
                                    i0Var4.J2.run();
                                    i0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(i0Var.k1());
                textView.setGravity(17);
                view = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + i0Var.u0, 0, org.telegram.messenger.g0.L(6.0f) + i0Var.u0, 0);
                linearLayout.setOrientation(1);
                z70 z70Var = new z70(context);
                s70 s70Var = new s70(context, null);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.M0(i0Var.r1() ? 2131753189 : 2131753190, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131753188, null));
                spannableStringBuilder.setSpan(new ka(this, i10), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = i0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i18 = k6.Uc;
                mutate.setColorFilter(new PorterDuffColorFilter(i18, PorterDuff.Mode.SRC_IN));
                wp wpVar = new wp(0, mutate);
                wpVar.a(i18);
                wpVar.c(org.telegram.messenger.g0.L(18.0f));
                wpVar.F = org.telegram.messenger.g0.L(11.0f);
                wpVar.r = -org.telegram.messenger.g0.L(5.0f);
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                s70Var.setText(TextUtils.concat(X2, " ", org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">")));
                s70Var.setTextSize(1, 14.0f);
                s70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                e6 e6Var3 = i0Var.J0;
                if (e6Var3 instanceof ei.b) {
                    r6.V(s70Var, k6.y6, e6Var3);
                } else {
                    r6.V(s70Var, k6.G6, e6Var3);
                }
                final int i19 = 1;
                s70Var.setGravity(1);
                s70Var.setOnClickListener(new View.OnClickListener(this) { // from class: vg.z
                    public final /* synthetic */ b0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                i0 i0Var2 = this.b.c;
                                xg.n.I0(i0Var2.p1, i0Var2.J0, i0Var2.T1, null);
                                break;
                            case 1:
                                i0 i0Var3 = this.b.c;
                                org.telegram.messenger.g0.g(i0Var3.k1());
                                i0Var3.dismiss();
                                break;
                            case 2:
                                org.telegram.messenger.g0.g(this.b.c.k1());
                                break;
                            default:
                                i0 i0Var4 = this.b.c;
                                i0Var4.J2.run();
                                i0Var4.dismiss();
                                break;
                        }
                    }
                });
                z70Var.setOnClickListener(new ii.m(s70Var, 29));
                if (i0Var.s1()) {
                    gi.d dVar = new gi.d(context, i0Var.J0, true);
                    dVar.i(bd.M0(2131751767, null), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: vg.z
                        public final /* synthetic */ b0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i19) {
                                case 0:
                                    i0 i0Var2 = this.b.c;
                                    xg.n.I0(i0Var2.p1, i0Var2.J0, i0Var2.T1, null);
                                    break;
                                case 1:
                                    i0 i0Var3 = this.b.c;
                                    org.telegram.messenger.g0.g(i0Var3.k1());
                                    i0Var3.dismiss();
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.g(this.b.c.k1());
                                    break;
                                default:
                                    i0 i0Var4 = this.b.c;
                                    i0Var4.J2.run();
                                    i0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(i0Var.z2, mf.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, mf.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, mf.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(i0Var.y2, mf.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(z70Var, mf.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(s70Var, mf.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                view = new e0(i0Var, context, i0Var.J0);
                break;
            default:
                h0 h0Var = new h0(i0Var, context);
                i0Var.W1 = h0Var;
                view = h0Var;
                break;
        }
        return k2.p1.p(view, view, -1, -2);
    }
}
