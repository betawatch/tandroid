// default package

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
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class z16 extends n39 {
    public final /* synthetic */ h26 c;

    public z16(h26 h26Var) {
        this.c = h26Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        h26 h26Var = this.c;
        int i = h26Var.c2;
        if ((i == 11 || i == 34) && !h26Var.T1) {
            return false;
        }
        int i2 = s49Var.f;
        return i2 == 1 || i2 == 4;
    }

    @Override // w39
    public final int b() {
        return this.c.f2;
    }

    @Override // w39
    public final int d(int i) {
        int i2;
        h26 h26Var = this.c;
        if (h26Var.g2 == i) {
            return 0;
        }
        if (h26Var.h2 == i) {
            return 2;
        }
        if (h26Var.i2 == i) {
            return 3;
        }
        if (h26Var.l2 == i) {
            return 5;
        }
        if (h26Var.m2 == i) {
            return 6;
        }
        if (h26Var.U1 == i) {
            return 7;
        }
        if (h26Var.n2 == i) {
            return 8;
        }
        ArrayList arrayList = h26Var.p2;
        if (arrayList != null && i >= (i2 = h26Var.o2) && i <= arrayList.size() + i2) {
            return 9;
        }
        int i3 = h26Var.c2;
        return (i3 == 5 || i3 == 11 || i3 == 34) ? 4 : 1;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        h26 h26Var = this.c;
        int i2 = h26Var.c2;
        HashSet hashSet = h26Var.t2;
        int i3 = s49Var.f;
        View view = s49Var.a;
        if (i3 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) h26Var.d2.get(i - h26Var.j2);
            jb jbVar = (jb) view;
            TLRPC.Chat currentChannel = jbVar.getCurrentChannel();
            jbVar.a(chat, false);
            jbVar.r.a(hashSet.contains(chat), currentChannel == chat);
            return;
        }
        if (i3 != 9) {
            if (i3 == 3) {
                ld5 ld5Var = (ld5) view;
                if (i2 != 11 && i2 != 34) {
                    if (i2 == 2) {
                        ld5Var.setText(k96.M0(2131742528, null));
                        return;
                    } else {
                        ld5Var.setText(k96.M0(2131748841, null));
                        return;
                    }
                }
                if (h26Var.T1) {
                    ld5Var.setText(k96.M0(2131752390, null));
                    return;
                } else if (h26Var.w2.size() == 1) {
                    ld5Var.setText(k96.M0(2131752387, null));
                    return;
                } else {
                    ld5Var.setText(k96.M0(2131752386, null));
                    return;
                }
            }
            if (i3 == 4) {
                za5 za5Var = (za5) view;
                if (i2 == 5) {
                    TLRPC.Chat chat2 = (TLRPC.Chat) h26Var.u2.get(i - h26Var.j2);
                    za5Var.e(chat2, chat2.title, (String) h26Var.v2.get(i - h26Var.j2), ((float) i) != ((float) h26Var.k2) - 1.0f);
                    za5Var.c(hashSet.contains(chat2), false);
                    return;
                } else {
                    if (i2 == 11 || i2 == 34) {
                        TLRPC.User user = (TLRPC.User) h26Var.w2.get(i - h26Var.j2);
                        ArrayList arrayList = h26Var.x2;
                        boolean z = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                        TL_account.requirementToContactPremium requirementtocontactpremium = z ? new TL_account.requirementToContactPremium() : null;
                        za5Var.S = true;
                        za5Var.R = requirementtocontactpremium;
                        za5Var.g();
                        za5Var.e(user, qu2.m(0, user.first_name, user.last_name), z ? k96.M0(2131748934, null) : k96.d0(h26Var.a, user, null, null), ((float) i) != ((float) h26Var.k2) - 1.0f);
                        za5Var.c(hashSet.contains(user), false);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int i4 = i - h26Var.o2;
        ArrayList arrayList2 = h26Var.p2;
        if (arrayList2 == null || i4 < 0 || i4 >= arrayList2.size()) {
            return;
        }
        c26 c26Var = (c26) view;
        b26 b26Var = (b26) h26Var.p2.get(i4);
        jo0 jo0Var = c26Var.c;
        ImageView imageView = c26Var.a;
        jia jiaVar = c26Var.b;
        if (b26Var instanceof a26) {
            c26Var.f = (a26) b26Var;
            c26Var.e = null;
            imageView.setVisibility(8);
            jiaVar.setVisibility(8);
            jo0Var.setVisibility(0);
            jia jiaVar2 = c26Var.d;
            a26 a26Var = c26Var.f;
            jiaVar2.l(k96.G(a26Var.g, a26Var.h ? "BoostLevelUnlocks" : "BoostLevel", new Object[0]), false);
            return;
        }
        if (b26Var != null) {
            c26Var.f = null;
            c26Var.e = b26Var;
            imageView.setVisibility(0);
            imageView.setImageResource(c26Var.e.a);
            jiaVar.setVisibility(0);
            b26 b26Var2 = c26Var.e;
            if (b26Var2.d != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(c26Var.e.d);
                sb.append("_");
                int i5 = c26Var.e.e;
                k96.D0();
                sb.append(k96.f1(k96.D0().A.a(i5)));
                String N0 = k96.N0(sb.toString());
                if (N0.startsWith("LOC_ERR")) {
                    N0 = k96.N0(c26Var.e.d + "_other");
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                int indexOf = N0.indexOf("%d");
                if (indexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(N0);
                    SpannableString spannableString = new SpannableString(de9.l(new StringBuilder(), c26Var.e.e, ""));
                    spannableString.setSpan(new z3c(gl.o()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                jiaVar.l(spannableStringBuilder, false);
            } else {
                String M0 = k96.M0(b26Var2.b, null);
                if (c26Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M0);
                    int indexOf2 = M0.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(M0);
                        SpannableString spannableString2 = new SpannableString(c26Var.e.c);
                        spannableString2.setSpan(new z3c(gl.o()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    jiaVar.l(spannableStringBuilder2, false);
                } else {
                    jiaVar.l(M0, false);
                }
            }
            jo0Var.setVisibility(8);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        final byte b = 0;
        h26 h26Var = this.c;
        switch (i) {
            case 1:
                view2 = new jb(context, new y16(this), true, 9);
                view = view2;
                break;
            case 2:
                int i2 = bkb.Z6;
                View b9aVar = new b9a(context, bkb.v0(i2, h26Var.J0), 0);
                zkb.h(i2, h26Var.J0, b9aVar);
                view = b9aVar;
                break;
            case 3:
                View ld5Var = new ld5(context);
                ld5Var.setPadding(0, 0, 0, gl.L(8.0f));
                view = ld5Var;
                break;
            case 4:
                View za5Var = new za5(1, 0, h26Var.J0, context, false, false);
                int i3 = h26Var.u0;
                za5Var.setPadding(i3, 0, i3, 0);
                view = za5Var;
                break;
            case 5:
                pi4 pi4Var = new pi4(context, null);
                pi4Var.setViewType(h26Var.c2 == 2 ? 22 : 21);
                pi4Var.setIsSingleCell(true);
                pi4Var.setIgnoreHeightCheck(true);
                pi4Var.setItemsCount(10);
                view = pi4Var;
                break;
            case 6:
                view = new d62(h26Var.getContext(), (byte) 11);
                break;
            case 7:
                final byte b2 = 2;
                FrameLayout frameLayout = new FrameLayout(h26Var.getContext());
                frameLayout.setPadding(gl.L(6.0f) + h26Var.u0, 0, gl.L(6.0f) + h26Var.u0, 0);
                TextView textView = new TextView(context);
                if (h26Var.L2 == null && hc2.N(h26Var.e1())) {
                    h26Var.L2 = new tp5(this, (byte) 10);
                }
                textView.setPadding(gl.L(18.0f), gl.L(13.0f), gl.L(h26Var.L2 == null ? 18.0f : 50.0f), gl.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, nme.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L = gl.L(8.0f);
                int i4 = bkb.d7;
                int v0 = bkb.v0(i4, h26Var.J0);
                int i5 = bkb.h6;
                int o = bm2.o(bkb.v0(i5, h26Var.J0), 76);
                ff0 i0 = bkb.i0(L, L, L, L, v0, o, o);
                vkb M = zkb.M(i4);
                vkb g = zkb.g(i5, 76);
                wjb wjbVar = h26Var.J0;
                textView.setBackground(i0);
                zkb.j(textView, i0, M, g, wjbVar);
                zkb.X(textView, bkb.F6, h26Var.J0);
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: x16
                    public final /* synthetic */ z16 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        byte b3 = b2;
                        z16 z16Var = this.b;
                        switch (b3) {
                            case 0:
                                h26 h26Var2 = z16Var.c;
                                dn0.D0(h26Var2.r1, h26Var2.J0, h26Var2.V1, null);
                                break;
                            case 1:
                                h26 h26Var3 = z16Var.c;
                                gl.g(h26Var3.b1());
                                h26Var3.dismiss();
                                break;
                            case 2:
                                gl.g(z16Var.c.b1());
                                break;
                            default:
                                h26 h26Var4 = z16Var.c;
                                h26Var4.L2.run();
                                h26Var4.dismiss();
                                break;
                        }
                    }
                });
                if (h26Var.L2 != null) {
                    ImageView imageView = new ImageView(h26Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    zkb.s(imageView, bkb.i5, h26Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
                    int L2 = gl.L(20.0f);
                    int o2 = bm2.o(bkb.v0(i5, h26Var.J0), 76);
                    ff0 i02 = bkb.i0(L2, L2, L2, L2, 0, o2, o2);
                    vkb g2 = zkb.g(i5, 76);
                    wjb wjbVar2 = h26Var.J0;
                    imageView.setBackground(i02);
                    zkb.j(imageView, i02, null, g2, wjbVar2);
                    frameLayout.addView(imageView, nme.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final byte b3 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: x16
                        public final /* synthetic */ z16 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            byte b32 = b3;
                            z16 z16Var = this.b;
                            switch (b32) {
                                case 0:
                                    h26 h26Var2 = z16Var.c;
                                    dn0.D0(h26Var2.r1, h26Var2.J0, h26Var2.V1, null);
                                    break;
                                case 1:
                                    h26 h26Var3 = z16Var.c;
                                    gl.g(h26Var3.b1());
                                    h26Var3.dismiss();
                                    break;
                                case 2:
                                    gl.g(z16Var.c.b1());
                                    break;
                                default:
                                    h26 h26Var4 = z16Var.c;
                                    h26Var4.L2.run();
                                    h26Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(h26Var.b1());
                textView.setGravity(17);
                view = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(gl.L(6.0f) + h26Var.u0, 0, gl.L(6.0f) + h26Var.u0, 0);
                linearLayout.setOrientation(1);
                nf6 nf6Var = new nf6(context);
                l46 l46Var = new l46(context, null);
                SpannableStringBuilder T2 = gl.T2(k96.M0(h26Var.i1() ? 2131753186 : 2131753187, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131753185, null));
                spannableStringBuilder.setSpan(new r21(this, (byte) 7), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = h26Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i6 = bkb.Wc;
                mutate.setColorFilter(new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_IN));
                cm2 cm2Var = new cm2(0, mutate);
                cm2Var.a(i6);
                cm2Var.c(gl.L(18.0f));
                cm2Var.F = gl.L(11.0f);
                cm2Var.r = -gl.L(5.0f);
                spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
                l46Var.setText(TextUtils.concat(T2, " ", gl.H2(spannableStringBuilder, spannableString, ">")));
                l46Var.setTextSize(1, 14.0f);
                l46Var.setLineSpacing(gl.L(3.0f), 1.0f);
                wjb wjbVar3 = h26Var.J0;
                if (wjbVar3 instanceof f53) {
                    zkb.X(l46Var, bkb.x6, wjbVar3);
                } else {
                    zkb.X(l46Var, bkb.F6, wjbVar3);
                }
                l46Var.setGravity(1);
                l46Var.setOnClickListener(new View.OnClickListener(this) { // from class: x16
                    public final /* synthetic */ z16 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        byte b32 = b;
                        z16 z16Var = this.b;
                        switch (b32) {
                            case 0:
                                h26 h26Var2 = z16Var.c;
                                dn0.D0(h26Var2.r1, h26Var2.J0, h26Var2.V1, null);
                                break;
                            case 1:
                                h26 h26Var3 = z16Var.c;
                                gl.g(h26Var3.b1());
                                h26Var3.dismiss();
                                break;
                            case 2:
                                gl.g(z16Var.c.b1());
                                break;
                            default:
                                h26 h26Var4 = z16Var.c;
                                h26Var4.L2.run();
                                h26Var4.dismiss();
                                break;
                        }
                    }
                });
                nf6Var.setOnClickListener(new b95(l46Var, (byte) 16));
                if (h26Var.j1()) {
                    final byte b4 = 1;
                    u41 u41Var = new u41(h26Var.J0, context, true);
                    u41Var.i(k96.M0(2131751755, null), false, true);
                    u41Var.setOnClickListener(new View.OnClickListener(this) { // from class: x16
                        public final /* synthetic */ z16 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            byte b32 = b4;
                            z16 z16Var = this.b;
                            switch (b32) {
                                case 0:
                                    h26 h26Var2 = z16Var.c;
                                    dn0.D0(h26Var2.r1, h26Var2.J0, h26Var2.V1, null);
                                    break;
                                case 1:
                                    h26 h26Var3 = z16Var.c;
                                    gl.g(h26Var3.b1());
                                    h26Var3.dismiss();
                                    break;
                                case 2:
                                    gl.g(z16Var.c.b1());
                                    break;
                                default:
                                    h26 h26Var4 = z16Var.c;
                                    h26Var4.L2.run();
                                    h26Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(h26Var.B2, nme.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(u41Var, nme.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, nme.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(h26Var.A2, nme.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(nf6Var, nme.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(l46Var, nme.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view2 = linearLayout;
                view = view2;
                break;
            case 9:
                view = new c26(h26Var, context, h26Var.J0);
                break;
            default:
                f26 f26Var = new f26(h26Var, context);
                h26Var.Y1 = f26Var;
                view = f26Var;
                break;
        }
        return ls6.h(view, view, -1, -2);
    }
}
