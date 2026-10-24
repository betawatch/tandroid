package sg;

import ai.o5;
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
import com.google.android.gms.internal.play_billing.k3;
import ei.kb;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.y90;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class c0 extends lm0 {
    public final /* synthetic */ j0 c;

    public c0(j0 j0Var) {
        this.c = j0Var;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        j0 j0Var = this.c;
        int i10 = j0Var.h0;
        if ((i10 == 11 || i10 == 34) && !j0Var.Y) {
            return false;
        }
        int i11 = b1Var.f;
        return i11 == 1 || i11 == 4;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.k0;
    }

    @Override // s4.g0
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

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        String formatUserStatus;
        j0 j0Var = this.c;
        int i12 = j0Var.h0;
        HashSet hashSet = j0Var.y0;
        int i13 = b1Var.f;
        View view = b1Var.a;
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
                l4 l4Var = (l4) view;
                if (i12 != 11 && i12 != 34) {
                    if (i12 == 2) {
                        l4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        l4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                }
                if (j0Var.Y) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (j0Var.B0.size() == 1) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            if (i13 != 4) {
                return;
            }
            f4 f4Var = (f4) view;
            if (i12 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) j0Var.z0.get(i10 - j0Var.o0);
                f4Var.e(chat2, chat2.title, (String) j0Var.A0.get(i10 - j0Var.o0), ((float) i10) != ((float) j0Var.p0) - 1.0f);
                f4Var.c(hashSet.contains(chat2), false);
                return;
            }
            if (i12 == 11 || i12 == 34) {
                TLRPC.User user = (TLRPC.User) j0Var.B0.get(i10 - j0Var.o0);
                ArrayList arrayList = j0Var.C0;
                boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                f4Var.R = true;
                f4Var.Q = requirementtocontactpremium;
                f4Var.g();
                if (z10) {
                    formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                } else {
                    i11 = ((h3) j0Var).currentAccount;
                    formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                }
                f4Var.e(user, ContactsController.formatName(user.first_name, user.last_name), formatUserStatus, ((float) i10) != ((float) j0Var.p0) - 1.0f);
                f4Var.c(hashSet.contains(user), false);
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
        o5 o5Var = f0Var.c;
        ImageView imageView = f0Var.a;
        n5 n5Var = f0Var.b;
        if (e0Var instanceof d0) {
            f0Var.f = (d0) e0Var;
            f0Var.e = null;
            imageView.setVisibility(8);
            n5Var.setVisibility(8);
            o5Var.setVisibility(0);
            n5 n5Var2 = f0Var.d;
            d0 d0Var = f0Var.f;
            n5Var2.l(LocaleController.formatPluralString(d0Var.h ? "BoostLevelUnlocks" : "BoostLevel", d0Var.g, new Object[0]), false);
            return;
        }
        if (e0Var != null) {
            f0Var.f = null;
            f0Var.e = e0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(f0Var.e.a);
            n5Var.setVisibility(0);
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
                    spannableString.setSpan(new j61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                n5Var.l(spannableStringBuilder, false);
            } else {
                String string2 = LocaleController.getString(e0Var2.b);
                String str = string2 != null ? string2 : "";
                if (f0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(f0Var.e.c);
                        spannableString2.setSpan(new j61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    n5Var.l(spannableStringBuilder2, false);
                } else {
                    n5Var.l(str, false);
                }
            }
            o5Var.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        int i11;
        int i12;
        b10 b10Var;
        View view;
        int i13;
        int i14;
        g6 g6Var4;
        g6 g6Var5;
        g6 g6Var6;
        g6 g6Var7;
        g6 g6Var8;
        g6 g6Var9;
        g6 g6Var10;
        int i15;
        int i16;
        g6 g6Var11;
        g6 g6Var12;
        g6 g6Var13;
        g6 g6Var14;
        g6 g6Var15;
        Context context = viewGroup.getContext();
        int i17 = 10;
        final int i18 = 0;
        j0 j0Var = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new b0(this), true, 9);
                break;
            case 2:
                int i19 = k6.a7;
                g6Var = ((h3) j0Var).resourcesProvider;
                View b7Var = new b7(context, k6.w0(i19, g6Var), 0);
                g6Var2 = ((h3) j0Var).resourcesProvider;
                r6.i(i19, b7Var, g6Var2);
                view = b7Var;
                break;
            case 3:
                View l4Var = new l4(context);
                l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                view = l4Var;
                break;
            case 4:
                g6Var3 = ((h3) j0Var).resourcesProvider;
                View f4Var = new f4(1, 0, context, g6Var3, false, false);
                i11 = ((h3) j0Var).backgroundPaddingLeft;
                i12 = ((h3) j0Var).backgroundPaddingLeft;
                f4Var.setPadding(i11, 0, i12, 0);
                view = f4Var;
                break;
            case 5:
                b10 b10Var2 = new b10(context, null);
                b10Var2.setViewType(j0Var.h0 == 2 ? 22 : 21);
                b10Var2.setIsSingleCell(true);
                b10Var2.setIgnoreHeightCheck(true);
                b10Var2.setItemsCount(10);
                b10Var = b10Var2;
                view = b10Var;
                break;
            case 6:
                view = new un(j0Var.getContext(), 29);
                break;
            case 7:
                final int i20 = 2;
                ?? frameLayout = new FrameLayout(j0Var.getContext());
                i13 = ((h3) j0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i13;
                i14 = ((h3) j0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i14, 0);
                TextView textView = new TextView(context);
                if (j0Var.Q0 == null && ChatObject.hasAdminRights(j0Var.w1())) {
                    j0Var.Q0 = new org.telegram.ui.web.a2(this, 21);
                }
                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(j0Var.Q0 == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, z5.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp2 = AndroidUtilities.dp(8.0f);
                int i21 = k6.e7;
                g6Var4 = ((h3) j0Var).resourcesProvider;
                int w02 = k6.w0(i21, g6Var4);
                int i22 = k6.i6;
                g6Var5 = ((h3) j0Var).resourcesProvider;
                int o10 = i0.a.o(k6.w0(i22, g6Var5), 76);
                org.telegram.ui.Cells.y j02 = k6.j0(dp2, dp2, dp2, dp2, w02, o10, o10);
                n6 O = r6.O(i21);
                n6 h = r6.h(i22, 76);
                g6Var6 = ((h3) j0Var).resourcesProvider;
                textView.setBackground(j02);
                r6.k(textView, j02, O, h, g6Var6);
                int i23 = k6.G6;
                g6Var7 = ((h3) j0Var).resourcesProvider;
                r6.W(textView, i23, g6Var7);
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: sg.a0
                    public final /* synthetic */ c0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        g6 g6Var16;
                        switch (i20) {
                            case 0:
                                j0 j0Var2 = this.b.c;
                                o2 o2Var = j0Var2.n;
                                long j10 = j0Var2.a0;
                                g6Var16 = ((h3) j0Var2).resourcesProvider;
                                ug.l.m(o2Var, g6Var16, j10, null);
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
                    int i24 = k6.j5;
                    g6Var8 = ((h3) j0Var).resourcesProvider;
                    r6.t(imageView, i24, g6Var8, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp3 = AndroidUtilities.dp(20.0f);
                    g6Var9 = ((h3) j0Var).resourcesProvider;
                    int o11 = i0.a.o(k6.w0(i22, g6Var9), 76);
                    org.telegram.ui.Cells.y j03 = k6.j0(dp3, dp3, dp3, dp3, 0, o11, o11);
                    n6 h10 = r6.h(i22, 76);
                    g6Var10 = ((h3) j0Var).resourcesProvider;
                    imageView.setBackground(j03);
                    r6.k(imageView, j03, null, h10, g6Var10);
                    frameLayout.addView(imageView, z5.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i25 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: sg.a0
                        public final /* synthetic */ c0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            g6 g6Var16;
                            switch (i25) {
                                case 0:
                                    j0 j0Var2 = this.b.c;
                                    o2 o2Var = j0Var2.n;
                                    long j10 = j0Var2.a0;
                                    g6Var16 = ((h3) j0Var2).resourcesProvider;
                                    ug.l.m(o2Var, g6Var16, j10, null);
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
                b10Var = frameLayout;
                view = b10Var;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i15 = ((h3) j0Var).backgroundPaddingLeft;
                int dp4 = AndroidUtilities.dp(6.0f) + i15;
                i16 = ((h3) j0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp4, 0, AndroidUtilities.dp(6.0f) + i16, 0);
                linearLayout.setOrientation(1);
                fa0 fa0Var = new fa0(context);
                y90 y90Var = new y90(context, null);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(j0Var.B1() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new kb(this, i17), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = j0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i26 = k6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i26, PorterDuff.Mode.SRC_IN));
                xq xqVar = new xq(0, mutate);
                xqVar.setColorKey(i26);
                xqVar.setSize(AndroidUtilities.dp(18.0f));
                xqVar.setWidth(AndroidUtilities.dp(11.0f));
                xqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(xqVar, 0, spannableString.length(), 33);
                y90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                y90Var.setTextSize(1, 14.0f);
                y90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                g6Var11 = ((h3) j0Var).resourcesProvider;
                if (g6Var11 instanceof ci.b) {
                    int i27 = k6.y6;
                    g6Var14 = ((h3) j0Var).resourcesProvider;
                    r6.W(y90Var, i27, g6Var14);
                } else {
                    int i28 = k6.G6;
                    g6Var12 = ((h3) j0Var).resourcesProvider;
                    r6.W(y90Var, i28, g6Var12);
                }
                y90Var.setGravity(1);
                y90Var.setOnClickListener(new View.OnClickListener(this) { // from class: sg.a0
                    public final /* synthetic */ c0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        g6 g6Var16;
                        switch (i18) {
                            case 0:
                                j0 j0Var2 = this.b.c;
                                o2 o2Var = j0Var2.n;
                                long j10 = j0Var2.a0;
                                g6Var16 = ((h3) j0Var2).resourcesProvider;
                                ug.l.m(o2Var, g6Var16, j10, null);
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
                fa0Var.setOnClickListener(new hg.r0(y90Var, 20));
                if (j0Var.C1()) {
                    g6Var13 = ((h3) j0Var).resourcesProvider;
                    final int i29 = 1;
                    ei.d dVar = new ei.d(context, g6Var13, true);
                    dVar.i(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: sg.a0
                        public final /* synthetic */ c0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            g6 g6Var16;
                            switch (i29) {
                                case 0:
                                    j0 j0Var2 = this.b.c;
                                    o2 o2Var = j0Var2.n;
                                    long j10 = j0Var2.a0;
                                    g6Var16 = ((h3) j0Var2).resourcesProvider;
                                    ug.l.m(o2Var, g6Var16, j10, null);
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
                    linearLayout2.addView(j0Var.G0, z5.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, z5.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, z5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(j0Var.F0, z5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(fa0Var, z5.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(y90Var, z5.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                g6Var15 = ((h3) j0Var).resourcesProvider;
                view = new f0(j0Var, context, g6Var15);
                break;
            default:
                i0 i0Var = new i0(j0Var, context);
                j0Var.d0 = i0Var;
                view = i0Var;
                break;
        }
        return k3.l(view, view, -1, -2);
    }
}
