package rg;

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
import ci.zb;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.u5;
import w7.z5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class d0 extends yl0 {
    public final /* synthetic */ k0 c;

    public d0(k0 k0Var) {
        this.c = k0Var;
    }

    @Override // org.telegram.ui.Components.yl0
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
                    i11 = ((f3) k0Var).currentAccount;
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
        i5 i5Var = g0Var.b;
        if (f0Var instanceof e0) {
            g0Var.f = (e0) f0Var;
            g0Var.e = null;
            imageView.setVisibility(8);
            i5Var.setVisibility(8);
            u5Var.setVisibility(0);
            i5 i5Var2 = g0Var.d;
            e0 e0Var = g0Var.f;
            i5Var2.l(LocaleController.formatPluralString(e0Var.h ? "BoostLevelUnlocks" : "BoostLevel", e0Var.g, new Object[0]), false);
            return;
        }
        if (f0Var != null) {
            g0Var.f = null;
            g0Var.e = f0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(g0Var.e.a);
            i5Var.setVisibility(0);
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
                    SpannableString spannableString = new SpannableString(a4.a.o(g0Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new e61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                i5Var.l(spannableStringBuilder, false);
            } else {
                String string2 = LocaleController.getString(f0Var2.b);
                String str = string2 != null ? string2 : "";
                if (g0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(g0Var.e.c);
                        spannableString2.setSpan(new e61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    i5Var.l(spannableStringBuilder2, false);
                } else {
                    i5Var.l(str, false);
                }
            }
            u5Var.setVisibility(8);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        d6 d6Var;
        d6 d6Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        d6 d6Var3;
        d6 d6Var4;
        d6 d6Var5;
        d6 d6Var6;
        d6 d6Var7;
        int i15;
        int i16;
        d6 d6Var8;
        d6 d6Var9;
        View view;
        d6 d6Var10;
        d6 d6Var11;
        d6 d6Var12;
        Context context = viewGroup.getContext();
        final int i17 = 0;
        k0 k0Var = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new c0(this), true, 9);
                break;
            case 2:
                int i18 = i6.a7;
                d6Var = ((f3) k0Var).resourcesProvider;
                view = new b7(context, i6.v0(i18, d6Var), 0);
                break;
            case 3:
                View m4Var = new m4(context);
                m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                view = m4Var;
                break;
            case 4:
                d6Var2 = ((f3) k0Var).resourcesProvider;
                View g4Var = new g4(1, 0, context, d6Var2, false, false);
                i11 = ((f3) k0Var).backgroundPaddingLeft;
                i12 = ((f3) k0Var).backgroundPaddingLeft;
                g4Var.setPadding(i11, 0, i12, 0);
                view = g4Var;
                break;
            case 5:
                w00 w00Var = new w00(context, null);
                w00Var.setViewType(k0Var.h0 == 2 ? 22 : 21);
                w00Var.setIsSingleCell(true);
                w00Var.setIgnoreHeightCheck(true);
                w00Var.setItemsCount(10);
                view = w00Var;
                break;
            case 6:
                view = new nn(k0Var.getContext(), 29);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
                i13 = ((f3) k0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i13;
                i14 = ((f3) k0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i14, 0);
                TextView textView = new TextView(context);
                if (k0Var.Q0 == null && ChatObject.hasAdminRights(k0Var.s1())) {
                    k0Var.Q0 = new org.telegram.ui.web.u0(this, 26);
                }
                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(k0Var.Q0 == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, z5.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp2 = AndroidUtilities.dp(8.0f);
                int i19 = i6.e7;
                d6Var3 = ((f3) k0Var).resourcesProvider;
                int v02 = i6.v0(i19, d6Var3);
                int i20 = i6.i6;
                d6Var4 = ((f3) k0Var).resourcesProvider;
                int k10 = i0.a.k(i6.v0(i20, d6Var4), 76);
                textView.setBackground(i6.i0(dp2, dp2, dp2, dp2, v02, k10, k10));
                int i21 = i6.G6;
                d6Var5 = ((f3) k0Var).resourcesProvider;
                textView.setTextColor(i6.v0(i21, d6Var5));
                final int i22 = 2;
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: rg.b0
                    public final /* synthetic */ d0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        d6 d6Var13;
                        switch (i22) {
                            case 0:
                                k0 k0Var2 = this.b.c;
                                n2 n2Var = k0Var2.n;
                                long j3 = k0Var2.a0;
                                d6Var13 = ((f3) k0Var2).resourcesProvider;
                                tg.m.m(n2Var, d6Var13, j3, null);
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
                    int i23 = i6.j5;
                    d6Var6 = ((f3) k0Var).resourcesProvider;
                    imageView.setColorFilter(i6.v0(i23, d6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp3 = AndroidUtilities.dp(20.0f);
                    d6Var7 = ((f3) k0Var).resourcesProvider;
                    int k11 = i0.a.k(i6.v0(i20, d6Var7), 76);
                    imageView.setBackground(i6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
                    frameLayout.addView(imageView, z5.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i24 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: rg.b0
                        public final /* synthetic */ d0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            d6 d6Var13;
                            switch (i24) {
                                case 0:
                                    k0 k0Var2 = this.b.c;
                                    n2 n2Var = k0Var2.n;
                                    long j3 = k0Var2.a0;
                                    d6Var13 = ((f3) k0Var2).resourcesProvider;
                                    tg.m.m(n2Var, d6Var13, j3, null);
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
                i15 = ((f3) k0Var).backgroundPaddingLeft;
                int dp4 = AndroidUtilities.dp(6.0f) + i15;
                i16 = ((f3) k0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp4, 0, AndroidUtilities.dp(6.0f) + i16, 0);
                linearLayout.setOrientation(1);
                x90 x90Var = new x90(context);
                q90 q90Var = new q90(context, null);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(k0Var.x1() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new zb(this, 8), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = k0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i25 = i6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i25, PorterDuff.Mode.SRC_IN));
                rq rqVar = new rq(0, mutate);
                rqVar.setColorKey(i25);
                rqVar.setSize(AndroidUtilities.dp(18.0f));
                rqVar.setWidth(AndroidUtilities.dp(11.0f));
                rqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(rqVar, 0, spannableString.length(), 33);
                q90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                q90Var.setTextSize(1, 14.0f);
                q90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                d6Var8 = ((f3) k0Var).resourcesProvider;
                if (d6Var8 instanceof ai.d) {
                    int i26 = i6.y6;
                    d6Var11 = ((f3) k0Var).resourcesProvider;
                    q90Var.setTextColor(i6.v0(i26, d6Var11));
                } else {
                    int i27 = i6.G6;
                    d6Var9 = ((f3) k0Var).resourcesProvider;
                    q90Var.setTextColor(i6.v0(i27, d6Var9));
                }
                final int i28 = 1;
                q90Var.setGravity(1);
                q90Var.setOnClickListener(new View.OnClickListener(this) { // from class: rg.b0
                    public final /* synthetic */ d0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        d6 d6Var13;
                        switch (i17) {
                            case 0:
                                k0 k0Var2 = this.b.c;
                                n2 n2Var = k0Var2.n;
                                long j3 = k0Var2.a0;
                                d6Var13 = ((f3) k0Var2).resourcesProvider;
                                tg.m.m(n2Var, d6Var13, j3, null);
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
                x90Var.setOnClickListener(new org.telegram.ui.Components.voip.o(q90Var, 9));
                if (k0Var.y1()) {
                    d6Var10 = ((f3) k0Var).resourcesProvider;
                    ci.d dVar = new ci.d(context, d6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: rg.b0
                        public final /* synthetic */ d0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            d6 d6Var13;
                            switch (i28) {
                                case 0:
                                    k0 k0Var2 = this.b.c;
                                    n2 n2Var = k0Var2.n;
                                    long j3 = k0Var2.a0;
                                    d6Var13 = ((f3) k0Var2).resourcesProvider;
                                    tg.m.m(n2Var, d6Var13, j3, null);
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
                    linearLayout2.addView(k0Var.G0, z5.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, z5.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, z5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(k0Var.F0, z5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(x90Var, z5.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(q90Var, z5.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                d6Var12 = ((f3) k0Var).resourcesProvider;
                view = new g0(k0Var, context, d6Var12);
                break;
            default:
                j0 j0Var = new j0(k0Var, context);
                k0Var.d0 = j0Var;
                view = j0Var;
                break;
        }
        return e2.k(view, view, -1, -2);
    }
}
