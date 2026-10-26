package tg;

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
import bi.j5;
import fi.hb;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.f7;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class c0 extends lm0 {
    public final /* synthetic */ j0 c;

    public c0(j0 j0Var) {
        this.c = j0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        j0 j0Var = this.c;
        int i10 = j0Var.h0;
        if ((i10 == 11 || i10 == 34) && !j0Var.Y) {
            return false;
        }
        int i11 = e1Var.f;
        return i11 == 1 || i11 == 4;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.k0;
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        j0 j0Var = this.c;
        if (j0Var.l0 == i10) {
            return 0;
        }
        if (j0Var.m0 == i10) {
            return 2;
        }
        if (j0Var.n0 == i10) {
            return 3;
        }
        if (j0Var.q0 == i10) {
            return 5;
        }
        if (j0Var.r0 == i10) {
            return 6;
        }
        if (j0Var.Z == i10) {
            return 7;
        }
        if (j0Var.s0 == i10) {
            return 8;
        }
        ArrayList arrayList = j0Var.u0;
        if (arrayList != null && i10 >= (i11 = j0Var.t0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = j0Var.h0;
        return (i12 == 5 || i12 == 11 || i12 == 34) ? 4 : 1;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        String formatUserStatus;
        j0 j0Var = this.c;
        int i12 = j0Var.h0;
        HashSet hashSet = j0Var.y0;
        int i13 = e1Var.f;
        View view = e1Var.a;
        if (i13 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) j0Var.i0.get(i10 - j0Var.o0);
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            nVar.a(chat, false);
            nVar.r.a(hashSet.contains(chat), currentChannel == chat);
            return;
        }
        if (i13 != 9) {
            if (i13 == 3) {
                q4 q4Var = (q4) view;
                if (i12 != 11 && i12 != 34) {
                    if (i12 == 2) {
                        q4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        q4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                }
                if (j0Var.Y) {
                    q4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (j0Var.B0.size() == 1) {
                    q4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    q4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            if (i13 != 4) {
                return;
            }
            k4 k4Var = (k4) view;
            if (i12 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) j0Var.z0.get(i10 - j0Var.o0);
                k4Var.e(chat2, chat2.title, (String) j0Var.A0.get(i10 - j0Var.o0), ((float) i10) != ((float) j0Var.p0) - 1.0f);
                k4Var.c(hashSet.contains(chat2), false);
                return;
            }
            if (i12 == 11 || i12 == 34) {
                TLRPC.User user = (TLRPC.User) j0Var.B0.get(i10 - j0Var.o0);
                ArrayList arrayList = j0Var.C0;
                boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                k4Var.R = true;
                k4Var.Q = requirementtocontactpremium;
                k4Var.g();
                if (z10) {
                    formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                } else {
                    i11 = ((k3) j0Var).currentAccount;
                    formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                }
                k4Var.e(user, ContactsController.formatName(user.first_name, user.last_name), formatUserStatus, ((float) i10) != ((float) j0Var.p0) - 1.0f);
                k4Var.c(hashSet.contains(user), false);
                return;
            }
            return;
        }
        int i14 = i10 - j0Var.t0;
        ArrayList arrayList2 = j0Var.u0;
        if (arrayList2 == null || i14 < 0 || i14 >= arrayList2.size()) {
            return;
        }
        f0 f0Var = (f0) view;
        e0 e0Var = (e0) j0Var.u0.get(i14);
        j5 j5Var = f0Var.c;
        ImageView imageView = f0Var.a;
        b6 b6Var = f0Var.b;
        if (e0Var instanceof d0) {
            f0Var.f = (d0) e0Var;
            f0Var.e = null;
            imageView.setVisibility(8);
            b6Var.setVisibility(8);
            j5Var.setVisibility(0);
            b6 b6Var2 = f0Var.d;
            d0 d0Var = f0Var.f;
            b6Var2.l(LocaleController.formatPluralString(d0Var.h ? "BoostLevelUnlocks" : "BoostLevel", d0Var.g, new Object[0]), false);
            return;
        }
        if (e0Var != null) {
            f0Var.f = null;
            f0Var.e = e0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(f0Var.e.a);
            b6Var.setVisibility(0);
            e0 e0Var2 = f0Var.e;
            if (e0Var2.d != null) {
                String string = LocaleController.getString(f0Var.e.d + "_" + LocaleController.getStringParamForNumber(f0Var.e.e));
                if (string == null || string.startsWith("LOC_ERR")) {
                    string = LocaleController.getString(f0Var.e.d + "_other");
                }
                if (string == null) {
                    string = "";
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf("%d");
                if (indexOf >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(string);
                    SpannableString spannableString = new SpannableString(a1.g.n(f0Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new q61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                b6Var.l(spannableStringBuilder, false);
            } else {
                String string2 = LocaleController.getString(e0Var2.b);
                String str = string2 != null ? string2 : "";
                if (f0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(f0Var.e.c);
                        spannableString2.setSpan(new q61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    b6Var.l(spannableStringBuilder2, false);
                } else {
                    b6Var.l(str, false);
                }
            }
            j5Var.setVisibility(8);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        u6 u6Var;
        u6 u6Var2;
        u6 u6Var3;
        int i11;
        int i12;
        int i13;
        int i14;
        u6 u6Var4;
        u6 u6Var5;
        u6 u6Var6;
        u6 u6Var7;
        u6 u6Var8;
        u6 u6Var9;
        u6 u6Var10;
        int i15;
        int i16;
        u6 u6Var11;
        u6 u6Var12;
        View view;
        u6 u6Var13;
        u6 u6Var14;
        u6 u6Var15;
        Context context = viewGroup.getContext();
        int i17 = 10;
        final int i18 = 0;
        j0 j0Var = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new b0(this), true, 9);
                break;
            case 2:
                int i19 = y6.a7;
                u6Var = ((k3) j0Var).resourcesProvider;
                View f7Var = new f7(context, y6.w0(i19, u6Var), 0);
                u6Var2 = ((k3) j0Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.i(i19, f7Var, u6Var2);
                view = f7Var;
                break;
            case 3:
                View q4Var = new q4(context);
                q4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                view = q4Var;
                break;
            case 4:
                u6Var3 = ((k3) j0Var).resourcesProvider;
                View k4Var = new k4(1, 0, context, u6Var3, false, false);
                i11 = ((k3) j0Var).backgroundPaddingLeft;
                i12 = ((k3) j0Var).backgroundPaddingLeft;
                k4Var.setPadding(i11, 0, i12, 0);
                view = k4Var;
                break;
            case 5:
                c10 c10Var = new c10(context, null);
                c10Var.setViewType(j0Var.h0 == 2 ? 22 : 21);
                c10Var.setIsSingleCell(true);
                c10Var.setIgnoreHeightCheck(true);
                c10Var.setItemsCount(10);
                view = c10Var;
                break;
            case 6:
                view = new vn(j0Var.getContext(), 29);
                break;
            case 7:
                final int i20 = 2;
                FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
                i13 = ((k3) j0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i13;
                i14 = ((k3) j0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i14, 0);
                TextView textView = new TextView(context);
                if (j0Var.Q0 == null && ChatObject.hasAdminRights(j0Var.w1())) {
                    j0Var.Q0 = new org.telegram.ui.web.h1(this, 24);
                }
                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(j0Var.Q0 == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, gb1.h(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp2 = AndroidUtilities.dp(8.0f);
                int i21 = y6.e7;
                u6Var4 = ((k3) j0Var).resourcesProvider;
                int w02 = y6.w0(i21, u6Var4);
                int i22 = y6.i6;
                u6Var5 = ((k3) j0Var).resourcesProvider;
                int o10 = i0.a.o(y6.w0(i22, u6Var5), 76);
                org.telegram.ui.Cells.y j02 = y6.j0(dp2, dp2, dp2, dp2, w02, o10, o10);
                b7 N = org.telegram.ui.ActionBar.f7.N(i21);
                b7 h = org.telegram.ui.ActionBar.f7.h(i22, 76);
                u6Var6 = ((k3) j0Var).resourcesProvider;
                textView.setBackground(j02);
                org.telegram.ui.ActionBar.f7.k(textView, j02, N, h, u6Var6);
                int i23 = y6.G6;
                u6Var7 = ((k3) j0Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.V(textView, i23, u6Var7);
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: tg.a0
                    public final /* synthetic */ c0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        u6 u6Var16;
                        switch (i20) {
                            case 0:
                                j0 j0Var2 = this.b.c;
                                r2 r2Var = j0Var2.n;
                                long j10 = j0Var2.a0;
                                u6Var16 = ((k3) j0Var2).resourcesProvider;
                                vg.n.m(r2Var, u6Var16, j10, null);
                                break;
                            case 1:
                                j0 j0Var3 = this.b.c;
                                AndroidUtilities.addToClipboard(j0Var3.t1());
                                j0Var3.dismiss();
                                break;
                            case 2:
                                AndroidUtilities.addToClipboard(this.b.c.t1());
                                break;
                            default:
                                j0 j0Var4 = this.b.c;
                                j0Var4.Q0.run();
                                j0Var4.dismiss();
                                break;
                        }
                    }
                });
                if (j0Var.Q0 != null) {
                    ImageView imageView = new ImageView(j0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i24 = y6.j5;
                    u6Var8 = ((k3) j0Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.t(imageView, i24, u6Var8, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp3 = AndroidUtilities.dp(20.0f);
                    u6Var9 = ((k3) j0Var).resourcesProvider;
                    int o11 = i0.a.o(y6.w0(i22, u6Var9), 76);
                    org.telegram.ui.Cells.y j03 = y6.j0(dp3, dp3, dp3, dp3, 0, o11, o11);
                    b7 h10 = org.telegram.ui.ActionBar.f7.h(i22, 76);
                    u6Var10 = ((k3) j0Var).resourcesProvider;
                    imageView.setBackground(j03);
                    org.telegram.ui.ActionBar.f7.k(imageView, j03, null, h10, u6Var10);
                    frameLayout.addView(imageView, gb1.h(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i25 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: tg.a0
                        public final /* synthetic */ c0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            u6 u6Var16;
                            switch (i25) {
                                case 0:
                                    j0 j0Var2 = this.b.c;
                                    r2 r2Var = j0Var2.n;
                                    long j10 = j0Var2.a0;
                                    u6Var16 = ((k3) j0Var2).resourcesProvider;
                                    vg.n.m(r2Var, u6Var16, j10, null);
                                    break;
                                case 1:
                                    j0 j0Var3 = this.b.c;
                                    AndroidUtilities.addToClipboard(j0Var3.t1());
                                    j0Var3.dismiss();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.b.c.t1());
                                    break;
                                default:
                                    j0 j0Var4 = this.b.c;
                                    j0Var4.Q0.run();
                                    j0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(j0Var.t1());
                textView.setGravity(17);
                view = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i15 = ((k3) j0Var).backgroundPaddingLeft;
                int dp4 = AndroidUtilities.dp(6.0f) + i15;
                i16 = ((k3) j0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp4, 0, AndroidUtilities.dp(6.0f) + i16, 0);
                linearLayout.setOrientation(1);
                ga0 ga0Var = new ga0(context);
                z90 z90Var = new z90(context, null);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(j0Var.B1() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new hb(this, i17), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = j0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i26 = y6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i26, PorterDuff.Mode.SRC_IN));
                zq zqVar = new zq(0, mutate);
                zqVar.setColorKey(i26);
                zqVar.setSize(AndroidUtilities.dp(18.0f));
                zqVar.setWidth(AndroidUtilities.dp(11.0f));
                zqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
                z90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                z90Var.setTextSize(1, 14.0f);
                z90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                u6Var11 = ((k3) j0Var).resourcesProvider;
                if (u6Var11 instanceof di.b) {
                    int i27 = y6.y6;
                    u6Var14 = ((k3) j0Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.V(z90Var, i27, u6Var14);
                } else {
                    int i28 = y6.G6;
                    u6Var12 = ((k3) j0Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.V(z90Var, i28, u6Var12);
                }
                final int i29 = 1;
                z90Var.setGravity(1);
                z90Var.setOnClickListener(new View.OnClickListener(this) { // from class: tg.a0
                    public final /* synthetic */ c0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        u6 u6Var16;
                        switch (i18) {
                            case 0:
                                j0 j0Var2 = this.b.c;
                                r2 r2Var = j0Var2.n;
                                long j10 = j0Var2.a0;
                                u6Var16 = ((k3) j0Var2).resourcesProvider;
                                vg.n.m(r2Var, u6Var16, j10, null);
                                break;
                            case 1:
                                j0 j0Var3 = this.b.c;
                                AndroidUtilities.addToClipboard(j0Var3.t1());
                                j0Var3.dismiss();
                                break;
                            case 2:
                                AndroidUtilities.addToClipboard(this.b.c.t1());
                                break;
                            default:
                                j0 j0Var4 = this.b.c;
                                j0Var4.Q0.run();
                                j0Var4.dismiss();
                                break;
                        }
                    }
                });
                ga0Var.setOnClickListener(new ig.d0(z90Var, 21));
                if (j0Var.C1()) {
                    u6Var13 = ((k3) j0Var).resourcesProvider;
                    fi.d dVar = new fi.d(context, u6Var13, true);
                    dVar.i(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: tg.a0
                        public final /* synthetic */ c0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            u6 u6Var16;
                            switch (i29) {
                                case 0:
                                    j0 j0Var2 = this.b.c;
                                    r2 r2Var = j0Var2.n;
                                    long j10 = j0Var2.a0;
                                    u6Var16 = ((k3) j0Var2).resourcesProvider;
                                    vg.n.m(r2Var, u6Var16, j10, null);
                                    break;
                                case 1:
                                    j0 j0Var3 = this.b.c;
                                    AndroidUtilities.addToClipboard(j0Var3.t1());
                                    j0Var3.dismiss();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.b.c.t1());
                                    break;
                                default:
                                    j0 j0Var4 = this.b.c;
                                    j0Var4.Q0.run();
                                    j0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(j0Var.G0, gb1.t(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, gb1.t(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, gb1.o(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(j0Var.F0, gb1.o(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(ga0Var, gb1.o(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(z90Var, gb1.o(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                u6Var15 = ((k3) j0Var).resourcesProvider;
                view = new f0(j0Var, context, u6Var15);
                break;
            default:
                i0 i0Var = new i0(j0Var, context);
                j0Var.d0 = i0Var;
                view = i0Var;
                break;
        }
        return ic.a.n(view, view, -1, -2);
    }
}
