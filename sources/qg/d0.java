package qg;

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
import bi.pd;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.u5;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d0 extends ul0 {
    public final /* synthetic */ k0 c;

    public d0(k0 k0Var) {
        this.c = k0Var;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        k0 k0Var = this.c;
        int i10 = k0Var.h0;
        if ((i10 == 11 || i10 == 34) && !k0Var.Y) {
            return false;
        }
        int i11 = c1Var.f;
        return i11 == 1 || i11 == 4;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.k0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        k0 k0Var = this.c;
        if (k0Var.l0 == i10) {
            return 0;
        }
        if (k0Var.m0 == i10) {
            return 2;
        }
        if (k0Var.n0 == i10) {
            return 3;
        }
        if (k0Var.q0 == i10) {
            return 5;
        }
        if (k0Var.r0 == i10) {
            return 6;
        }
        if (k0Var.Z == i10) {
            return 7;
        }
        if (k0Var.s0 == i10) {
            return 8;
        }
        ArrayList arrayList = k0Var.u0;
        if (arrayList != null && i10 >= (i11 = k0Var.t0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = k0Var.h0;
        return (i12 == 5 || i12 == 11 || i12 == 34) ? 4 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String formatUserStatus;
        k0 k0Var = this.c;
        int i12 = k0Var.h0;
        HashSet hashSet = k0Var.y0;
        int i13 = c1Var.f;
        View view = c1Var.a;
        if (i13 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) k0Var.i0.get(i10 - k0Var.o0);
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            nVar.a(chat, false);
            nVar.r.a(hashSet.contains(chat), currentChannel == chat);
            return;
        }
        if (i13 != 9) {
            if (i13 == 3) {
                m4 m4Var = (m4) view;
                if (i12 != 11 && i12 != 34) {
                    if (i12 == 2) {
                        m4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                }
                if (k0Var.Y) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (k0Var.B0.size() == 1) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            if (i13 != 4) {
                return;
            }
            g4 g4Var = (g4) view;
            if (i12 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) k0Var.z0.get(i10 - k0Var.o0);
                g4Var.e(chat2, chat2.title, (String) k0Var.A0.get(i10 - k0Var.o0), ((float) i10) != ((float) k0Var.p0) - 1.0f);
                g4Var.c(hashSet.contains(chat2), false);
                return;
            }
            if (i12 == 11 || i12 == 34) {
                TLRPC.User user = (TLRPC.User) k0Var.B0.get(i10 - k0Var.o0);
                ArrayList arrayList = k0Var.C0;
                boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                g4Var.R = true;
                g4Var.Q = requirementtocontactpremium;
                g4Var.g();
                if (z10) {
                    formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                } else {
                    i11 = ((h3) k0Var).currentAccount;
                    formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                }
                g4Var.e(user, ContactsController.formatName(user.first_name, user.last_name), formatUserStatus, ((float) i10) != ((float) k0Var.p0) - 1.0f);
                g4Var.c(hashSet.contains(user), false);
                return;
            }
            return;
        }
        int i14 = i10 - k0Var.t0;
        ArrayList arrayList2 = k0Var.u0;
        if (arrayList2 == null || i14 < 0 || i14 >= arrayList2.size()) {
            return;
        }
        g0 g0Var = (g0) view;
        f0 f0Var = (f0) k0Var.u0.get(i14);
        u5 u5Var = g0Var.c;
        ImageView imageView = g0Var.a;
        l5 l5Var = g0Var.b;
        if (f0Var instanceof e0) {
            g0Var.f = (e0) f0Var;
            g0Var.e = null;
            imageView.setVisibility(8);
            l5Var.setVisibility(8);
            u5Var.setVisibility(0);
            l5 l5Var2 = g0Var.d;
            e0 e0Var = g0Var.f;
            l5Var2.l(LocaleController.formatPluralString(e0Var.h ? "BoostLevelUnlocks" : "BoostLevel", e0Var.g, new Object[0]), false);
            return;
        }
        if (f0Var != null) {
            g0Var.f = null;
            g0Var.e = f0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(g0Var.e.a);
            l5Var.setVisibility(0);
            f0 f0Var2 = g0Var.e;
            if (f0Var2.d != null) {
                String string = LocaleController.getString(g0Var.e.d + "_" + LocaleController.getStringParamForNumber(g0Var.e.e));
                if (string == null || string.startsWith("LOC_ERR")) {
                    string = LocaleController.getString(g0Var.e.d + "_other");
                }
                if (string == null) {
                    string = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf("%d");
                if (indexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(string);
                    SpannableString spannableString = new SpannableString(a4.a.n(g0Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new s51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                l5Var.l(spannableStringBuilder, false);
            } else {
                String string2 = LocaleController.getString(f0Var2.b);
                String str = string2 != null ? string2 : "";
                if (g0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(g0Var.e.c);
                        spannableString2.setSpan(new s51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    l5Var.l(spannableStringBuilder2, false);
                } else {
                    l5Var.l(str, false);
                }
            }
            u5Var.setVisibility(8);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        f6 f6Var3;
        f6 f6Var4;
        f6 f6Var5;
        f6 f6Var6;
        f6 f6Var7;
        int i15;
        int i16;
        f6 f6Var8;
        f6 f6Var9;
        View view;
        f6 f6Var10;
        f6 f6Var11;
        f6 f6Var12;
        Context context = viewGroup.getContext();
        final int i17 = 0;
        k0 k0Var = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new c0(this), true, 9);
                break;
            case 2:
                int i18 = j6.a7;
                f6Var = ((h3) k0Var).resourcesProvider;
                view = new c7(context, j6.v0(i18, f6Var), 0);
                break;
            case 3:
                View m4Var = new m4(context);
                m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                view = m4Var;
                break;
            case 4:
                f6Var2 = ((h3) k0Var).resourcesProvider;
                View g4Var = new g4(1, 0, context, f6Var2, false, false);
                i11 = ((h3) k0Var).backgroundPaddingLeft;
                i12 = ((h3) k0Var).backgroundPaddingLeft;
                g4Var.setPadding(i11, 0, i12, 0);
                view = g4Var;
                break;
            case 5:
                a10 a10Var = new a10(context, null);
                a10Var.setViewType(k0Var.h0 == 2 ? 22 : 21);
                a10Var.setIsSingleCell(true);
                a10Var.setIgnoreHeightCheck(true);
                a10Var.setItemsCount(10);
                view = a10Var;
                break;
            case 6:
                view = new qn(k0Var.getContext(), 28);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
                i13 = ((h3) k0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i13;
                i14 = ((h3) k0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i14, 0);
                TextView textView = new TextView(context);
                if (k0Var.Q0 == null && ChatObject.hasAdminRights(k0Var.s1())) {
                    k0Var.Q0 = new org.telegram.ui.Components.voip.x(this, 29);
                }
                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(k0Var.Q0 == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, a6.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp2 = AndroidUtilities.dp(8.0f);
                int i19 = j6.e7;
                f6Var3 = ((h3) k0Var).resourcesProvider;
                int v02 = j6.v0(i19, f6Var3);
                int i20 = j6.i6;
                f6Var4 = ((h3) k0Var).resourcesProvider;
                int k10 = i0.a.k(j6.v0(i20, f6Var4), 76);
                textView.setBackground(j6.i0(dp2, dp2, dp2, dp2, v02, k10, k10));
                int i21 = j6.G6;
                f6Var5 = ((h3) k0Var).resourcesProvider;
                textView.setTextColor(j6.v0(i21, f6Var5));
                final int i22 = 2;
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: qg.b0
                    public final /* synthetic */ d0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        f6 f6Var13;
                        switch (i22) {
                            case 0:
                                k0 k0Var2 = this.b.c;
                                p2 p2Var = k0Var2.n;
                                long j3 = k0Var2.a0;
                                f6Var13 = ((h3) k0Var2).resourcesProvider;
                                sg.m.m(p2Var, f6Var13, j3, null);
                                break;
                            case 1:
                                k0 k0Var3 = this.b.c;
                                AndroidUtilities.addToClipboard(k0Var3.p1());
                                k0Var3.dismiss();
                                break;
                            case 2:
                                AndroidUtilities.addToClipboard(this.b.c.p1());
                                break;
                            default:
                                k0 k0Var4 = this.b.c;
                                k0Var4.Q0.run();
                                k0Var4.dismiss();
                                break;
                        }
                    }
                });
                if (k0Var.Q0 != null) {
                    ImageView imageView = new ImageView(k0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i23 = j6.j5;
                    f6Var6 = ((h3) k0Var).resourcesProvider;
                    imageView.setColorFilter(j6.v0(i23, f6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp3 = AndroidUtilities.dp(20.0f);
                    f6Var7 = ((h3) k0Var).resourcesProvider;
                    int k11 = i0.a.k(j6.v0(i20, f6Var7), 76);
                    imageView.setBackground(j6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
                    frameLayout.addView(imageView, a6.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i24 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: qg.b0
                        public final /* synthetic */ d0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            f6 f6Var13;
                            switch (i24) {
                                case 0:
                                    k0 k0Var2 = this.b.c;
                                    p2 p2Var = k0Var2.n;
                                    long j3 = k0Var2.a0;
                                    f6Var13 = ((h3) k0Var2).resourcesProvider;
                                    sg.m.m(p2Var, f6Var13, j3, null);
                                    break;
                                case 1:
                                    k0 k0Var3 = this.b.c;
                                    AndroidUtilities.addToClipboard(k0Var3.p1());
                                    k0Var3.dismiss();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.b.c.p1());
                                    break;
                                default:
                                    k0 k0Var4 = this.b.c;
                                    k0Var4.Q0.run();
                                    k0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(k0Var.p1());
                textView.setGravity(17);
                view = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i15 = ((h3) k0Var).backgroundPaddingLeft;
                int dp4 = AndroidUtilities.dp(6.0f) + i15;
                i16 = ((h3) k0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp4, 0, AndroidUtilities.dp(6.0f) + i16, 0);
                linearLayout.setOrientation(1);
                t90 t90Var = new t90(context);
                m90 m90Var = new m90(context, null);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(k0Var.x1() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new pd(this, 8), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = k0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i25 = j6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i25, PorterDuff.Mode.SRC_IN));
                uq uqVar = new uq(0, mutate);
                uqVar.setColorKey(i25);
                uqVar.setSize(AndroidUtilities.dp(18.0f));
                uqVar.setWidth(AndroidUtilities.dp(11.0f));
                uqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(uqVar, 0, spannableString.length(), 33);
                m90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                m90Var.setTextSize(1, 14.0f);
                m90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                f6Var8 = ((h3) k0Var).resourcesProvider;
                if (f6Var8 instanceof zh.b) {
                    int i26 = j6.y6;
                    f6Var11 = ((h3) k0Var).resourcesProvider;
                    m90Var.setTextColor(j6.v0(i26, f6Var11));
                } else {
                    int i27 = j6.G6;
                    f6Var9 = ((h3) k0Var).resourcesProvider;
                    m90Var.setTextColor(j6.v0(i27, f6Var9));
                }
                m90Var.setGravity(1);
                m90Var.setOnClickListener(new View.OnClickListener(this) { // from class: qg.b0
                    public final /* synthetic */ d0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        f6 f6Var13;
                        switch (i17) {
                            case 0:
                                k0 k0Var2 = this.b.c;
                                p2 p2Var = k0Var2.n;
                                long j3 = k0Var2.a0;
                                f6Var13 = ((h3) k0Var2).resourcesProvider;
                                sg.m.m(p2Var, f6Var13, j3, null);
                                break;
                            case 1:
                                k0 k0Var3 = this.b.c;
                                AndroidUtilities.addToClipboard(k0Var3.p1());
                                k0Var3.dismiss();
                                break;
                            case 2:
                                AndroidUtilities.addToClipboard(this.b.c.p1());
                                break;
                            default:
                                k0 k0Var4 = this.b.c;
                                k0Var4.Q0.run();
                                k0Var4.dismiss();
                                break;
                        }
                    }
                });
                t90Var.setOnClickListener(new org.telegram.ui.web.c(m90Var, 4));
                if (k0Var.y1()) {
                    f6Var10 = ((h3) k0Var).resourcesProvider;
                    final int i28 = 1;
                    bi.d dVar = new bi.d(context, f6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: qg.b0
                        public final /* synthetic */ d0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            f6 f6Var13;
                            switch (i28) {
                                case 0:
                                    k0 k0Var2 = this.b.c;
                                    p2 p2Var = k0Var2.n;
                                    long j3 = k0Var2.a0;
                                    f6Var13 = ((h3) k0Var2).resourcesProvider;
                                    sg.m.m(p2Var, f6Var13, j3, null);
                                    break;
                                case 1:
                                    k0 k0Var3 = this.b.c;
                                    AndroidUtilities.addToClipboard(k0Var3.p1());
                                    k0Var3.dismiss();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.b.c.p1());
                                    break;
                                default:
                                    k0 k0Var4 = this.b.c;
                                    k0Var4.Q0.run();
                                    k0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(k0Var.G0, a6.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, a6.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, a6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(k0Var.F0, a6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(t90Var, a6.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(m90Var, a6.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                f6Var12 = ((h3) k0Var).resourcesProvider;
                view = new g0(k0Var, context, f6Var12);
                break;
            default:
                j0 j0Var = new j0(k0Var, context);
                k0Var.d0 = j0Var;
                view = j0Var;
                break;
        }
        return e2.j(view, view, -1, -2);
    }
}
