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
import c8.ja;
import di.k4;
import hi.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.z70;
import tg.h2;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c0 extends tj0 {
    public final /* synthetic */ j0 c;

    public c0(j0 j0Var) {
        this.c = j0Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        j0 j0Var = this.c;
        int i7 = j0Var.d2;
        if ((i7 == 11 || i7 == 34) && !j0Var.U1) {
            return false;
        }
        int i10 = e1Var.f;
        return i10 == 1 || i10 == 4;
    }

    @Override // v4.h0
    public final int b() {
        return this.c.g2;
    }

    @Override // v4.h0
    public final int d(int i7) {
        int i10;
        j0 j0Var = this.c;
        if (j0Var.h2 == i7) {
            return 0;
        }
        if (j0Var.i2 == i7) {
            return 2;
        }
        if (j0Var.j2 == i7) {
            return 3;
        }
        if (j0Var.m2 == i7) {
            return 5;
        }
        if (j0Var.n2 == i7) {
            return 6;
        }
        if (j0Var.V1 == i7) {
            return 7;
        }
        if (j0Var.o2 == i7) {
            return 8;
        }
        ArrayList arrayList = j0Var.q2;
        if (arrayList != null && i7 >= (i10 = j0Var.p2) && i7 <= arrayList.size() + i10) {
            return 9;
        }
        int i11 = j0Var.d2;
        return (i11 == 5 || i11 == 11 || i11 == 34) ? 4 : 1;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        j0 j0Var = this.c;
        int i10 = j0Var.d2;
        HashSet hashSet = j0Var.u2;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) j0Var.e2.get(i7 - j0Var.k2);
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
                        n4Var.setText(hd.M0(2131742791, null));
                        return;
                    } else {
                        n4Var.setText(hd.M0(2131749033, null));
                        return;
                    }
                }
                if (j0Var.U1) {
                    n4Var.setText(hd.M0(2131752402, null));
                    return;
                } else if (j0Var.x2.size() == 1) {
                    n4Var.setText(hd.M0(2131752399, null));
                    return;
                } else {
                    n4Var.setText(hd.M0(2131752398, null));
                    return;
                }
            }
            if (i11 != 4) {
                return;
            }
            h4 h4Var = (h4) view;
            if (i10 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) j0Var.v2.get(i7 - j0Var.k2);
                h4Var.e(chat2, chat2.title, (String) j0Var.w2.get(i7 - j0Var.k2), ((float) i7) != ((float) j0Var.l2) - 1.0f);
                h4Var.c(hashSet.contains(chat2), false);
                return;
            } else {
                if (i10 == 11 || i10 == 34) {
                    TLRPC.User user = (TLRPC.User) j0Var.x2.get(i7 - j0Var.k2);
                    ArrayList arrayList = j0Var.y2;
                    boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                    TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                    h4Var.S = true;
                    h4Var.R = requirementtocontactpremium;
                    h4Var.g();
                    h4Var.e(user, g5.m(0, user.first_name, user.last_name), z10 ? hd.M0(2131749126, null) : hd.d0(j0Var.a, user, null, null), ((float) i7) != ((float) j0Var.l2) - 1.0f);
                    h4Var.c(hashSet.contains(user), false);
                    return;
                }
                return;
            }
        }
        int i12 = i7 - j0Var.p2;
        ArrayList arrayList2 = j0Var.q2;
        if (arrayList2 == null || i12 < 0 || i12 >= arrayList2.size()) {
            return;
        }
        f0 f0Var = (f0) view;
        e0 e0Var = (e0) j0Var.q2.get(i12);
        k4 k4Var = f0Var.c;
        ImageView imageView = f0Var.a;
        j5 j5Var = f0Var.b;
        if (e0Var instanceof d0) {
            f0Var.f = (d0) e0Var;
            f0Var.e = null;
            imageView.setVisibility(8);
            j5Var.setVisibility(8);
            k4Var.setVisibility(0);
            j5 j5Var2 = f0Var.d;
            d0 d0Var = f0Var.f;
            j5Var2.l(hd.G(d0Var.g, d0Var.h ? "BoostLevelUnlocks" : "BoostLevel", new Object[0]), false);
            return;
        }
        if (e0Var != null) {
            f0Var.f = null;
            f0Var.e = e0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(f0Var.e.a);
            j5Var.setVisibility(0);
            e0 e0Var2 = f0Var.e;
            if (e0Var2.d != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(f0Var.e.d);
                sb2.append("_");
                int i13 = f0Var.e.e;
                hd.E0();
                sb2.append(hd.f1(hd.E0().A.a(i13)));
                String N0 = hd.N0(sb2.toString());
                if (N0 == null || N0.startsWith("LOC_ERR")) {
                    N0 = hd.N0(f0Var.e.d + "_other");
                }
                if (N0 == null) {
                    N0 = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                int indexOf = N0.indexOf("%d");
                if (indexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(N0);
                    SpannableString spannableString = new SpannableString(a8.p0.n(f0Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                j5Var.l(spannableStringBuilder, false);
            } else {
                String M0 = hd.M0(e0Var2.b, null);
                String str = M0 != null ? M0 : "";
                if (f0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(f0Var.e.c);
                        spannableString2.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    j5Var.l(spannableStringBuilder2, false);
                } else {
                    j5Var.l(str, false);
                }
            }
            k4Var.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        pz pzVar;
        View view;
        Context context = viewGroup.getContext();
        int i10 = 10;
        final int i11 = 0;
        j0 j0Var = this.c;
        switch (i7) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new b0(this), true, 9);
                break;
            case 2:
                int i12 = j6.a7;
                View x6Var = new x6(context, j6.w0(i12, j0Var.J0), 0);
                q6.h(i12, x6Var, j0Var.J0);
                view = x6Var;
                break;
            case 3:
                View n4Var = new n4(context);
                n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                view = n4Var;
                break;
            case 4:
                View h4Var = new h4(1, 0, context, j0Var.J0, false, false);
                int i13 = j0Var.u0;
                h4Var.setPadding(i13, 0, i13, 0);
                view = h4Var;
                break;
            case 5:
                pz pzVar2 = new pz(context, null);
                pzVar2.setViewType(j0Var.d2 == 2 ? 22 : 21);
                pzVar2.setIsSingleCell(true);
                pzVar2.setIgnoreHeightCheck(true);
                pzVar2.setItemsCount(10);
                pzVar = pzVar2;
                view = pzVar;
                break;
            case 6:
                view = new bn(j0Var.getContext(), 28);
                break;
            case 7:
                final int i14 = 2;
                ?? frameLayout = new FrameLayout(j0Var.getContext());
                frameLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + j0Var.u0, 0, org.telegram.messenger.g0.L(6.0f) + j0Var.u0, 0);
                TextView textView = new TextView(context);
                if (j0Var.M2 == null && t3.N(j0Var.n1())) {
                    j0Var.M2 = new q2.d(this, 21);
                }
                textView.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(j0Var.M2 == null ? 18.0f : 50.0f), org.telegram.messenger.g0.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, ja.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L = org.telegram.messenger.g0.L(8.0f);
                int i15 = j6.e7;
                int w02 = j6.w0(i15, j0Var.J0);
                int i16 = j6.i6;
                int o4 = i0.a.o(j6.w0(i16, j0Var.J0), 76);
                org.telegram.ui.Cells.y k02 = j6.k0(L, L, L, L, w02, o4, o4);
                m6 M = q6.M(i15);
                m6 g10 = q6.g(i16, 76);
                e6 e6Var = j0Var.J0;
                textView.setBackground(k02);
                q6.j(textView, k02, M, g10, e6Var);
                q6.U(textView, j6.G6, j0Var.J0);
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: ug.a0
                    public final /* synthetic */ c0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i14) {
                            case 0:
                                j0 j0Var2 = this.b.c;
                                wg.l.I0(j0Var2.s1, j0Var2.J0, j0Var2.W1, null);
                                break;
                            case 1:
                                j0 j0Var3 = this.b.c;
                                org.telegram.messenger.g0.g(j0Var3.k1());
                                j0Var3.dismiss();
                                break;
                            case 2:
                                org.telegram.messenger.g0.g(this.b.c.k1());
                                break;
                            default:
                                j0 j0Var4 = this.b.c;
                                j0Var4.M2.run();
                                j0Var4.dismiss();
                                break;
                        }
                    }
                });
                if (j0Var.M2 != null) {
                    ImageView imageView = new ImageView(j0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    q6.s(imageView, j6.j5, j0Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    int L2 = org.telegram.messenger.g0.L(20.0f);
                    int o10 = i0.a.o(j6.w0(i16, j0Var.J0), 76);
                    org.telegram.ui.Cells.y k03 = j6.k0(L2, L2, L2, L2, 0, o10, o10);
                    m6 g11 = q6.g(i16, 76);
                    e6 e6Var2 = j0Var.J0;
                    imageView.setBackground(k03);
                    q6.j(imageView, k03, null, g11, e6Var2);
                    frameLayout.addView(imageView, ja.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i17 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ug.a0
                        public final /* synthetic */ c0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i17) {
                                case 0:
                                    j0 j0Var2 = this.b.c;
                                    wg.l.I0(j0Var2.s1, j0Var2.J0, j0Var2.W1, null);
                                    break;
                                case 1:
                                    j0 j0Var3 = this.b.c;
                                    org.telegram.messenger.g0.g(j0Var3.k1());
                                    j0Var3.dismiss();
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.g(this.b.c.k1());
                                    break;
                                default:
                                    j0 j0Var4 = this.b.c;
                                    j0Var4.M2.run();
                                    j0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(j0Var.k1());
                textView.setGravity(17);
                pzVar = frameLayout;
                view = pzVar;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + j0Var.u0, 0, org.telegram.messenger.g0.L(6.0f) + j0Var.u0, 0);
                linearLayout.setOrientation(1);
                g80 g80Var = new g80(context);
                z70 z70Var = new z70(context, null);
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.M0(j0Var.r1() ? 2131753189 : 2131753190, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131753188, null));
                spannableStringBuilder.setSpan(new ha(this, i10), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = j0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i18 = j6.Xc;
                mutate.setColorFilter(new PorterDuffColorFilter(i18, PorterDuff.Mode.SRC_IN));
                eq eqVar = new eq(0, mutate);
                eqVar.a(i18);
                eqVar.c(org.telegram.messenger.g0.L(18.0f));
                eqVar.F = org.telegram.messenger.g0.L(11.0f);
                eqVar.r = -org.telegram.messenger.g0.L(5.0f);
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
                z70Var.setText(TextUtils.concat(X2, " ", org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">")));
                z70Var.setTextSize(1, 14.0f);
                z70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                e6 e6Var3 = j0Var.J0;
                if (e6Var3 instanceof fi.b) {
                    q6.U(z70Var, j6.y6, e6Var3);
                } else {
                    q6.U(z70Var, j6.G6, e6Var3);
                }
                final int i19 = 1;
                z70Var.setGravity(1);
                z70Var.setOnClickListener(new View.OnClickListener(this) { // from class: ug.a0
                    public final /* synthetic */ c0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i11) {
                            case 0:
                                j0 j0Var2 = this.b.c;
                                wg.l.I0(j0Var2.s1, j0Var2.J0, j0Var2.W1, null);
                                break;
                            case 1:
                                j0 j0Var3 = this.b.c;
                                org.telegram.messenger.g0.g(j0Var3.k1());
                                j0Var3.dismiss();
                                break;
                            case 2:
                                org.telegram.messenger.g0.g(this.b.c.k1());
                                break;
                            default:
                                j0 j0Var4 = this.b.c;
                                j0Var4.M2.run();
                                j0Var4.dismiss();
                                break;
                        }
                    }
                });
                g80Var.setOnClickListener(new h2(z70Var, i19));
                if (j0Var.s1()) {
                    hi.d dVar = new hi.d(context, j0Var.J0, true);
                    dVar.i(hd.M0(2131751767, null), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: ug.a0
                        public final /* synthetic */ c0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i19) {
                                case 0:
                                    j0 j0Var2 = this.b.c;
                                    wg.l.I0(j0Var2.s1, j0Var2.J0, j0Var2.W1, null);
                                    break;
                                case 1:
                                    j0 j0Var3 = this.b.c;
                                    org.telegram.messenger.g0.g(j0Var3.k1());
                                    j0Var3.dismiss();
                                    break;
                                case 2:
                                    org.telegram.messenger.g0.g(this.b.c.k1());
                                    break;
                                default:
                                    j0 j0Var4 = this.b.c;
                                    j0Var4.M2.run();
                                    j0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(j0Var.C2, ja.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, ja.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, ja.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(j0Var.B2, ja.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(g80Var, ja.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(z70Var, ja.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                view = new f0(j0Var, context, j0Var.J0);
                break;
            default:
                i0 i0Var = new i0(j0Var, context);
                j0Var.Z1 = i0Var;
                view = i0Var;
                break;
        }
        return i5.c.q(view, view, -1, -2);
    }
}
