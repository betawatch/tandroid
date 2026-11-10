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
import bi.m5;
import c8.ha;
import fi.ka;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class b0 extends oj0 {
    public final /* synthetic */ i0 c;

    public b0(i0 i0Var) {
        this.c = i0Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        i0 i0Var = this.c;
        int i7 = i0Var.c2;
        if ((i7 == 11 || i7 == 34) && !i0Var.T1) {
            return false;
        }
        int i10 = d1Var.f;
        return i10 == 1 || i10 == 4;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.f2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        int i10;
        i0 i0Var = this.c;
        if (i0Var.g2 == i7) {
            return 0;
        }
        if (i0Var.h2 == i7) {
            return 2;
        }
        if (i0Var.i2 == i7) {
            return 3;
        }
        if (i0Var.l2 == i7) {
            return 5;
        }
        if (i0Var.m2 == i7) {
            return 6;
        }
        if (i0Var.U1 == i7) {
            return 7;
        }
        if (i0Var.n2 == i7) {
            return 8;
        }
        ArrayList arrayList = i0Var.p2;
        if (arrayList != null && i7 >= (i10 = i0Var.o2) && i7 <= arrayList.size() + i10) {
            return 9;
        }
        int i11 = i0Var.c2;
        return (i11 == 5 || i11 == 11 || i11 == 34) ? 4 : 1;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        i0 i0Var = this.c;
        int i10 = i0Var.c2;
        HashSet hashSet = i0Var.t2;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) i0Var.d2.get(i7 - i0Var.j2);
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
                        n4Var.setText(id.M0(2131742791, null));
                        return;
                    } else {
                        n4Var.setText(id.M0(2131749033, null));
                        return;
                    }
                }
                if (i0Var.T1) {
                    n4Var.setText(id.M0(2131752402, null));
                    return;
                } else if (i0Var.w2.size() == 1) {
                    n4Var.setText(id.M0(2131752399, null));
                    return;
                } else {
                    n4Var.setText(id.M0(2131752398, null));
                    return;
                }
            }
            if (i11 != 4) {
                return;
            }
            h4 h4Var = (h4) view;
            if (i10 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) i0Var.u2.get(i7 - i0Var.j2);
                h4Var.e(chat2, chat2.title, (String) i0Var.v2.get(i7 - i0Var.j2), ((float) i7) != ((float) i0Var.k2) - 1.0f);
                h4Var.c(hashSet.contains(chat2), false);
                return;
            } else {
                if (i10 == 11 || i10 == 34) {
                    TLRPC.User user = (TLRPC.User) i0Var.w2.get(i7 - i0Var.j2);
                    ArrayList arrayList = i0Var.x2;
                    boolean z9 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                    TL_account.requirementToContactPremium requirementtocontactpremium = z9 ? new TL_account.requirementToContactPremium() : null;
                    h4Var.R = true;
                    h4Var.Q = requirementtocontactpremium;
                    h4Var.g();
                    h4Var.e(user, g5.m(0, user.first_name, user.last_name), z9 ? id.M0(2131749126, null) : id.d0(i0Var.a, user, null, null), ((float) i7) != ((float) i0Var.k2) - 1.0f);
                    h4Var.c(hashSet.contains(user), false);
                    return;
                }
                return;
            }
        }
        int i12 = i7 - i0Var.o2;
        ArrayList arrayList2 = i0Var.p2;
        if (arrayList2 == null || i12 < 0 || i12 >= arrayList2.size()) {
            return;
        }
        e0 e0Var = (e0) view;
        d0 d0Var = (d0) i0Var.p2.get(i12);
        m5 m5Var = e0Var.c;
        ImageView imageView = e0Var.a;
        org.telegram.ui.ActionBar.m5 m5Var2 = e0Var.b;
        if (d0Var instanceof c0) {
            e0Var.f = (c0) d0Var;
            e0Var.e = null;
            imageView.setVisibility(8);
            m5Var2.setVisibility(8);
            m5Var.setVisibility(0);
            org.telegram.ui.ActionBar.m5 m5Var3 = e0Var.d;
            c0 c0Var = e0Var.f;
            m5Var3.l(id.G(c0Var.g, c0Var.h ? "BoostLevelUnlocks" : "BoostLevel", new Object[0]), false);
            return;
        }
        if (d0Var != null) {
            e0Var.f = null;
            e0Var.e = d0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(e0Var.e.a);
            m5Var2.setVisibility(0);
            d0 d0Var2 = e0Var.e;
            if (d0Var2.d != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e0Var.e.d);
                sb2.append("_");
                int i13 = e0Var.e.e;
                id.E0();
                sb2.append(id.f1(id.E0().A.a(i13)));
                String N0 = id.N0(sb2.toString());
                if (N0 == null || N0.startsWith("LOC_ERR")) {
                    N0 = id.N0(e0Var.e.d + "_other");
                }
                if (N0 == null) {
                    N0 = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                int indexOf = N0.indexOf("%d");
                if (indexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(N0);
                    SpannableString spannableString = new SpannableString(a8.p0.n(e0Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                m5Var2.l(spannableStringBuilder, false);
            } else {
                String M0 = id.M0(d0Var2.b, null);
                String str = M0 != null ? M0 : "";
                if (e0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(e0Var.e.c);
                        spannableString2.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    m5Var2.l(spannableStringBuilder2, false);
                } else {
                    m5Var2.l(str, false);
                }
            }
            m5Var.setVisibility(8);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = viewGroup.getContext();
        int i10 = 10;
        final int i11 = 0;
        i0 i0Var = this.c;
        switch (i7) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new a0(this), true, 9);
                break;
            case 2:
                int i12 = m6.a7;
                View y6Var = new y6(context, m6.w0(i12, i0Var.I0), 0);
                t6.h(i12, y6Var, i0Var.I0);
                view = y6Var;
                break;
            case 3:
                View n4Var = new n4(context);
                n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                view = n4Var;
                break;
            case 4:
                View h4Var = new h4(1, 0, context, i0Var.I0, false, false);
                int i13 = i0Var.t0;
                h4Var.setPadding(i13, 0, i13, 0);
                view = h4Var;
                break;
            case 5:
                lz lzVar = new lz(context, null);
                lzVar.setViewType(i0Var.c2 == 2 ? 22 : 21);
                lzVar.setIsSingleCell(true);
                lzVar.setIgnoreHeightCheck(true);
                lzVar.setItemsCount(10);
                view = lzVar;
                break;
            case 6:
                view = new sm(i0Var.getContext(), 28);
                break;
            case 7:
                final int i14 = 2;
                FrameLayout frameLayout = new FrameLayout(i0Var.getContext());
                frameLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + i0Var.t0, 0, org.telegram.messenger.g0.L(6.0f) + i0Var.t0, 0);
                TextView textView = new TextView(context);
                if (i0Var.L2 == null && t3.N(i0Var.n1())) {
                    i0Var.L2 = new sh.b(this, 14);
                }
                textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(i0Var.L2 == null ? 18.0f : 50.0f), org.telegram.messenger.g0.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, ha.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L = org.telegram.messenger.g0.L(8.0f);
                int i15 = m6.e7;
                int w02 = m6.w0(i15, i0Var.I0);
                int i16 = m6.i6;
                int o4 = i0.a.o(m6.w0(i16, i0Var.I0), 76);
                org.telegram.ui.Cells.y k02 = m6.k0(L, L, L, L, w02, o4, o4);
                p6 M = t6.M(i15);
                p6 g10 = t6.g(i16, 76);
                h6 h6Var = i0Var.I0;
                textView.setBackground(k02);
                t6.j(textView, k02, M, g10, h6Var);
                t6.U(textView, m6.G6, i0Var.I0);
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: ug.z
                    public final /* synthetic */ b0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                i0 i0Var2 = this.b.c;
                                wg.l.I0(i0Var2.r1, i0Var2.I0, i0Var2.V1, null);
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
                                i0Var4.L2.run();
                                i0Var4.dismiss();
                                break;
                        }
                    }
                });
                if (i0Var.L2 != null) {
                    ImageView imageView = new ImageView(i0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    t6.s(imageView, m6.j5, i0Var.I0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    int L2 = org.telegram.messenger.g0.L(20.0f);
                    int o10 = i0.a.o(m6.w0(i16, i0Var.I0), 76);
                    org.telegram.ui.Cells.y k03 = m6.k0(L2, L2, L2, L2, 0, o10, o10);
                    p6 g11 = t6.g(i16, 76);
                    h6 h6Var2 = i0Var.I0;
                    imageView.setBackground(k03);
                    t6.j(imageView, k03, null, g11, h6Var2);
                    frameLayout.addView(imageView, ha.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i17 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ug.z
                        public final /* synthetic */ b0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i17) {
                                case 0:
                                    i0 i0Var2 = this.b.c;
                                    wg.l.I0(i0Var2.r1, i0Var2.I0, i0Var2.V1, null);
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
                                    i0Var4.L2.run();
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
                linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + i0Var.t0, 0, org.telegram.messenger.g0.L(6.0f) + i0Var.t0, 0);
                linearLayout.setOrientation(1);
                d80 d80Var = new d80(context);
                w70 w70Var = new w70(context, null);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.M0(i0Var.r1() ? 2131753189 : 2131753190, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131753188, null));
                spannableStringBuilder.setSpan(new ka(this, i10), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = i0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i18 = m6.Uc;
                mutate.setColorFilter(new PorterDuffColorFilter(i18, PorterDuff.Mode.SRC_IN));
                wp wpVar = new wp(0, mutate);
                wpVar.a(i18);
                wpVar.c(org.telegram.messenger.g0.L(18.0f));
                wpVar.E = org.telegram.messenger.g0.L(11.0f);
                wpVar.r = -org.telegram.messenger.g0.L(5.0f);
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                w70Var.setText(TextUtils.concat(X2, " ", org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">")));
                w70Var.setTextSize(1, 14.0f);
                w70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                h6 h6Var3 = i0Var.I0;
                if (h6Var3 instanceof di.b) {
                    t6.U(w70Var, m6.y6, h6Var3);
                } else {
                    t6.U(w70Var, m6.G6, h6Var3);
                }
                w70Var.setGravity(1);
                w70Var.setOnClickListener(new View.OnClickListener(this) { // from class: ug.z
                    public final /* synthetic */ b0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                i0 i0Var2 = this.b.c;
                                wg.l.I0(i0Var2.r1, i0Var2.I0, i0Var2.V1, null);
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
                                i0Var4.L2.run();
                                i0Var4.dismiss();
                                break;
                        }
                    }
                });
                d80Var.setOnClickListener(new ii.g(w70Var, 25));
                if (i0Var.s1()) {
                    final int i19 = 1;
                    fi.d dVar = new fi.d(context, i0Var.I0, true);
                    dVar.i(id.M0(2131751767, null), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ug.z
                        public final /* synthetic */ b0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i19) {
                                case 0:
                                    i0 i0Var2 = this.b.c;
                                    wg.l.I0(i0Var2.r1, i0Var2.I0, i0Var2.V1, null);
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
                                    i0Var4.L2.run();
                                    i0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(i0Var.B2, ha.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, ha.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, ha.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(i0Var.A2, ha.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(d80Var, ha.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(w70Var, ha.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                view = new e0(i0Var, context, i0Var.I0);
                break;
            default:
                h0 h0Var = new h0(i0Var, context);
                i0Var.Y1 = h0Var;
                view = h0Var;
                break;
        }
        return jg.g.r(view, view, -1, -2);
    }
}
