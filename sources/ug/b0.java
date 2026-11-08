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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class b0 extends oj0 {
    public final /* synthetic */ i0 c;

    public b0(i0 i0Var) {
        this.c = i0Var;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        i0 i0Var = this.c;
        int i7 = i0Var.Z1;
        if ((i7 == 11 || i7 == 34) && !i0Var.Q1) {
            return false;
        }
        int i10 = d1Var.f;
        return i10 == 1 || i10 == 4;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.c2;
    }

    @Override // v4.g0
    public final int d(int i7) {
        int i10;
        i0 i0Var = this.c;
        if (i0Var.d2 == i7) {
            return 0;
        }
        if (i0Var.e2 == i7) {
            return 2;
        }
        if (i0Var.f2 == i7) {
            return 3;
        }
        if (i0Var.i2 == i7) {
            return 5;
        }
        if (i0Var.j2 == i7) {
            return 6;
        }
        if (i0Var.R1 == i7) {
            return 7;
        }
        if (i0Var.k2 == i7) {
            return 8;
        }
        ArrayList arrayList = i0Var.m2;
        if (arrayList != null && i7 >= (i10 = i0Var.l2) && i7 <= arrayList.size() + i10) {
            return 9;
        }
        int i11 = i0Var.Z1;
        return (i11 == 5 || i11 == 11 || i11 == 34) ? 4 : 1;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        i0 i0Var = this.c;
        int i10 = i0Var.Z1;
        HashSet hashSet = i0Var.q2;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) i0Var.a2.get(i7 - i0Var.g2);
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
                        n4Var.setText(id.M0(2131742794, null));
                        return;
                    } else {
                        n4Var.setText(id.M0(2131749034, null));
                        return;
                    }
                }
                if (i0Var.Q1) {
                    n4Var.setText(id.M0(2131752402, null));
                    return;
                } else if (i0Var.t2.size() == 1) {
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
                TLRPC.Chat chat2 = (TLRPC.Chat) i0Var.r2.get(i7 - i0Var.g2);
                h4Var.e(chat2, chat2.title, (String) i0Var.s2.get(i7 - i0Var.g2), ((float) i7) != ((float) i0Var.h2) - 1.0f);
                h4Var.c(hashSet.contains(chat2), false);
                return;
            } else {
                if (i10 == 11 || i10 == 34) {
                    TLRPC.User user = (TLRPC.User) i0Var.t2.get(i7 - i0Var.g2);
                    ArrayList arrayList = i0Var.u2;
                    boolean z9 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                    TL_account.requirementToContactPremium requirementtocontactpremium = z9 ? new TL_account.requirementToContactPremium() : null;
                    h4Var.R = true;
                    h4Var.Q = requirementtocontactpremium;
                    h4Var.g();
                    h4Var.e(user, g5.m(0, user.first_name, user.last_name), z9 ? id.M0(2131749127, null) : id.d0(i0Var.a, user, null, null), ((float) i7) != ((float) i0Var.h2) - 1.0f);
                    h4Var.c(hashSet.contains(user), false);
                    return;
                }
                return;
            }
        }
        int i12 = i7 - i0Var.l2;
        ArrayList arrayList2 = i0Var.m2;
        if (arrayList2 == null || i12 < 0 || i12 >= arrayList2.size()) {
            return;
        }
        e0 e0Var = (e0) view;
        d0 d0Var = (d0) i0Var.m2.get(i12);
        m5 m5Var = e0Var.c;
        ImageView imageView = e0Var.a;
        k5 k5Var = e0Var.b;
        if (d0Var instanceof c0) {
            e0Var.f = (c0) d0Var;
            e0Var.e = null;
            imageView.setVisibility(8);
            k5Var.setVisibility(8);
            m5Var.setVisibility(0);
            k5 k5Var2 = e0Var.d;
            c0 c0Var = e0Var.f;
            k5Var2.l(id.G(c0Var.g, c0Var.h ? "BoostLevelUnlocks" : "BoostLevel", new Object[0]), false);
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
                k5Var.l(spannableStringBuilder, false);
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
                    k5Var.l(spannableStringBuilder2, false);
                } else {
                    k5Var.l(str, false);
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
                int i12 = k6.a7;
                View y6Var = new y6(context, k6.w0(i12, i0Var.I0), 0);
                r6.i(i12, y6Var, i0Var.I0);
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
                mz mzVar = new mz(context, null);
                mzVar.setViewType(i0Var.Z1 == 2 ? 22 : 21);
                mzVar.setIsSingleCell(true);
                mzVar.setIgnoreHeightCheck(true);
                mzVar.setItemsCount(10);
                view = mzVar;
                break;
            case 6:
                view = new tm(i0Var.getContext(), 28);
                break;
            case 7:
                final int i14 = 2;
                FrameLayout frameLayout = new FrameLayout(i0Var.getContext());
                frameLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + i0Var.t0, 0, org.telegram.messenger.g0.L(6.0f) + i0Var.t0, 0);
                TextView textView = new TextView(context);
                if (i0Var.I2 == null && t3.N(i0Var.n1())) {
                    i0Var.I2 = new sg.t0(this, 16);
                }
                textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(i0Var.I2 == null ? 18.0f : 50.0f), org.telegram.messenger.g0.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, ha.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L = org.telegram.messenger.g0.L(8.0f);
                int i15 = k6.e7;
                int w02 = k6.w0(i15, i0Var.I0);
                int i16 = k6.i6;
                int o4 = i0.a.o(k6.w0(i16, i0Var.I0), 76);
                org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, w02, o4, o4);
                n6 N = r6.N(i15);
                n6 h = r6.h(i16, 76);
                f6 f6Var = i0Var.I0;
                textView.setBackground(k02);
                r6.k(textView, k02, N, h, f6Var);
                r6.V(textView, k6.G6, i0Var.I0);
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
                                wg.l.I0(i0Var2.o1, i0Var2.I0, i0Var2.S1, null);
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
                                i0Var4.I2.run();
                                i0Var4.dismiss();
                                break;
                        }
                    }
                });
                if (i0Var.I2 != null) {
                    ImageView imageView = new ImageView(i0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    r6.t(imageView, k6.j5, i0Var.I0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    int L2 = org.telegram.messenger.g0.L(20.0f);
                    int o10 = i0.a.o(k6.w0(i16, i0Var.I0), 76);
                    org.telegram.ui.Cells.y k03 = k6.k0(L2, L2, L2, L2, 0, o10, o10);
                    n6 h7 = r6.h(i16, 76);
                    f6 f6Var2 = i0Var.I0;
                    imageView.setBackground(k03);
                    r6.k(imageView, k03, null, h7, f6Var2);
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
                                    wg.l.I0(i0Var2.o1, i0Var2.I0, i0Var2.S1, null);
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
                                    i0Var4.I2.run();
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
                int i18 = k6.Uc;
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
                f6 f6Var3 = i0Var.I0;
                if (f6Var3 instanceof di.b) {
                    r6.V(w70Var, k6.y6, f6Var3);
                } else {
                    r6.V(w70Var, k6.G6, f6Var3);
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
                                wg.l.I0(i0Var2.o1, i0Var2.I0, i0Var2.S1, null);
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
                                i0Var4.I2.run();
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
                                    wg.l.I0(i0Var2.o1, i0Var2.I0, i0Var2.S1, null);
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
                                    i0Var4.I2.run();
                                    i0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(i0Var.y2, ha.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, ha.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, ha.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(i0Var.x2, ha.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
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
                i0Var.V1 = h0Var;
                view = h0Var;
                break;
        }
        return jg.g.r(view, view, -1, -2);
    }
}
