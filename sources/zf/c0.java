package zf;

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
import g7.e6;
import java.util.ArrayList;
import java.util.HashSet;
import kh.lb;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c0 extends vk0 {
    public final /* synthetic */ j0 c;

    public c0(j0 j0Var) {
        this.c = j0Var;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        j0 j0Var = this.c;
        int i9 = j0Var.d0;
        if ((i9 == 11 || i9 == 34) && !j0Var.U) {
            return false;
        }
        int i10 = q1Var.f;
        return i10 == 1 || i10 == 4;
    }

    @Override // f2.r0
    public final int h() {
        return this.c.g0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        int i10;
        j0 j0Var = this.c;
        if (j0Var.h0 == i9) {
            return 0;
        }
        if (j0Var.i0 == i9) {
            return 2;
        }
        if (j0Var.j0 == i9) {
            return 3;
        }
        if (j0Var.m0 == i9) {
            return 5;
        }
        if (j0Var.n0 == i9) {
            return 6;
        }
        if (j0Var.V == i9) {
            return 7;
        }
        if (j0Var.o0 == i9) {
            return 8;
        }
        ArrayList arrayList = j0Var.q0;
        if (arrayList != null && i9 >= (i10 = j0Var.p0) && i9 <= arrayList.size() + i10) {
            return 9;
        }
        int i11 = j0Var.d0;
        return (i11 == 5 || i11 == 11 || i11 == 34) ? 4 : 1;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        String formatUserStatus;
        j0 j0Var = this.c;
        int i11 = j0Var.d0;
        HashSet hashSet = j0Var.u0;
        int i12 = q1Var.f;
        View view = q1Var.a;
        if (i12 == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) j0Var.e0.get(i9 - j0Var.k0);
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            nVar.a(chat, false);
            nVar.r.a(hashSet.contains(chat), currentChannel == chat);
            return;
        }
        if (i12 != 9) {
            if (i12 == 3) {
                m4 m4Var = (m4) view;
                if (i11 != 11 && i11 != 34) {
                    if (i11 == 2) {
                        m4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                }
                if (j0Var.U) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (j0Var.x0.size() == 1) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            if (i12 != 4) {
                return;
            }
            g4 g4Var = (g4) view;
            if (i11 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) j0Var.v0.get(i9 - j0Var.k0);
                g4Var.e(chat2, chat2.title, (String) j0Var.w0.get(i9 - j0Var.k0), ((float) i9) != ((float) j0Var.l0) - 1.0f);
                g4Var.c(hashSet.contains(chat2), false);
                return;
            }
            if (i11 == 11 || i11 == 34) {
                TLRPC.User user = (TLRPC.User) j0Var.x0.get(i9 - j0Var.k0);
                ArrayList arrayList = j0Var.y0;
                boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                g4Var.N = true;
                g4Var.M = requirementtocontactpremium;
                g4Var.g();
                if (z10) {
                    formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                } else {
                    i10 = ((f3) j0Var).currentAccount;
                    formatUserStatus = LocaleController.formatUserStatus(i10, user, null, null);
                }
                g4Var.e(user, ContactsController.formatName(user.first_name, user.last_name), formatUserStatus, ((float) i9) != ((float) j0Var.l0) - 1.0f);
                g4Var.c(hashSet.contains(user), false);
                return;
            }
            return;
        }
        int i13 = i9 - j0Var.p0;
        ArrayList arrayList2 = j0Var.q0;
        if (arrayList2 == null || i13 < 0 || i13 >= arrayList2.size()) {
            return;
        }
        f0 f0Var = (f0) view;
        e0 e0Var = (e0) j0Var.q0.get(i13);
        bh.g gVar = f0Var.c;
        ImageView imageView = f0Var.a;
        h5 h5Var = f0Var.b;
        if (e0Var instanceof d0) {
            f0Var.f = (d0) e0Var;
            f0Var.e = null;
            imageView.setVisibility(8);
            h5Var.setVisibility(8);
            gVar.setVisibility(0);
            h5 h5Var2 = f0Var.d;
            d0 d0Var = f0Var.f;
            h5Var2.l(LocaleController.formatPluralString(d0Var.h ? "BoostLevelUnlocks" : "BoostLevel", d0Var.g, new Object[0]), false);
            return;
        }
        if (e0Var != null) {
            f0Var.f = null;
            f0Var.e = e0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(f0Var.e.a);
            h5Var.setVisibility(0);
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
                    SpannableString spannableString = new SpannableString(aa.d.l(f0Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new i41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                h5Var.l(spannableStringBuilder, false);
            } else {
                String string2 = LocaleController.getString(e0Var2.b);
                String str = string2 != null ? string2 : "";
                if (f0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(f0Var.e.c);
                        spannableString2.setSpan(new i41(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    h5Var.l(spannableStringBuilder2, false);
                } else {
                    h5Var.l(str, false);
                }
            }
            gVar.setVisibility(8);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        b6 b6Var;
        b6 b6Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        b6 b6Var3;
        b6 b6Var4;
        b6 b6Var5;
        b6 b6Var6;
        b6 b6Var7;
        int i14;
        int i15;
        b6 b6Var8;
        b6 b6Var9;
        View view;
        b6 b6Var10;
        b6 b6Var11;
        b6 b6Var12;
        Context context = viewGroup.getContext();
        final int i16 = 0;
        j0 j0Var = this.c;
        switch (i9) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new a0(this), true, 9);
                break;
            case 2:
                int i17 = f6.a7;
                b6Var = ((f3) j0Var).resourcesProvider;
                view = new z6(context, f6.v0(i17, b6Var), 0);
                break;
            case 3:
                View m4Var = new m4(context);
                m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                view = m4Var;
                break;
            case 4:
                b6Var2 = ((f3) j0Var).resourcesProvider;
                View g4Var = new g4(1, 0, context, b6Var2, false, false);
                i10 = ((f3) j0Var).backgroundPaddingLeft;
                i11 = ((f3) j0Var).backgroundPaddingLeft;
                g4Var.setPadding(i10, 0, i11, 0);
                view = g4Var;
                break;
            case 5:
                e00 e00Var = new e00(context, null);
                e00Var.setViewType(j0Var.d0 == 2 ? 22 : 21);
                e00Var.setIsSingleCell(true);
                e00Var.setIgnoreHeightCheck(true);
                e00Var.setItemsCount(10);
                view = e00Var;
                break;
            case 6:
                view = new b0(j0Var.getContext(), 0);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
                i12 = ((f3) j0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i12;
                i13 = ((f3) j0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i13, 0);
                TextView textView = new TextView(context);
                if (j0Var.M0 == null && ChatObject.hasAdminRights(j0Var.s1())) {
                    j0Var.M0 = new pf.o1(this, 26);
                }
                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(j0Var.M0 == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, e6.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp2 = AndroidUtilities.dp(8.0f);
                int i18 = f6.e7;
                b6Var3 = ((f3) j0Var).resourcesProvider;
                int v02 = f6.v0(i18, b6Var3);
                int i19 = f6.i6;
                b6Var4 = ((f3) j0Var).resourcesProvider;
                int k10 = i0.a.k(f6.v0(i19, b6Var4), 76);
                textView.setBackground(f6.i0(dp2, dp2, dp2, dp2, v02, k10, k10));
                int i20 = f6.G6;
                b6Var5 = ((f3) j0Var).resourcesProvider;
                textView.setTextColor(f6.v0(i20, b6Var5));
                final int i21 = 2;
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: zf.z
                    public final /* synthetic */ c0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        b6 b6Var13;
                        switch (i21) {
                            case 0:
                                j0 j0Var2 = this.b.c;
                                o2 o2Var = j0Var2.n;
                                long j10 = j0Var2.W;
                                b6Var13 = ((f3) j0Var2).resourcesProvider;
                                bg.a0.m(o2Var, b6Var13, j10, null);
                                break;
                            case 1:
                                j0 j0Var3 = this.b.c;
                                AndroidUtilities.addToClipboard(j0Var3.p1());
                                j0Var3.dismiss();
                                break;
                            case 2:
                                AndroidUtilities.addToClipboard(this.b.c.p1());
                                break;
                            default:
                                j0 j0Var4 = this.b.c;
                                j0Var4.M0.run();
                                j0Var4.dismiss();
                                break;
                        }
                    }
                });
                if (j0Var.M0 != null) {
                    ImageView imageView = new ImageView(j0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i22 = f6.j5;
                    b6Var6 = ((f3) j0Var).resourcesProvider;
                    imageView.setColorFilter(f6.v0(i22, b6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp3 = AndroidUtilities.dp(20.0f);
                    b6Var7 = ((f3) j0Var).resourcesProvider;
                    int k11 = i0.a.k(f6.v0(i19, b6Var7), 76);
                    imageView.setBackground(f6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
                    frameLayout.addView(imageView, e6.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i23 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: zf.z
                        public final /* synthetic */ c0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            b6 b6Var13;
                            switch (i23) {
                                case 0:
                                    j0 j0Var2 = this.b.c;
                                    o2 o2Var = j0Var2.n;
                                    long j10 = j0Var2.W;
                                    b6Var13 = ((f3) j0Var2).resourcesProvider;
                                    bg.a0.m(o2Var, b6Var13, j10, null);
                                    break;
                                case 1:
                                    j0 j0Var3 = this.b.c;
                                    AndroidUtilities.addToClipboard(j0Var3.p1());
                                    j0Var3.dismiss();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.b.c.p1());
                                    break;
                                default:
                                    j0 j0Var4 = this.b.c;
                                    j0Var4.M0.run();
                                    j0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                }
                textView.setText(j0Var.p1());
                textView.setGravity(17);
                view = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i14 = ((f3) j0Var).backgroundPaddingLeft;
                int dp4 = AndroidUtilities.dp(6.0f) + i14;
                i15 = ((f3) j0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp4, 0, AndroidUtilities.dp(6.0f) + i15, 0);
                linearLayout.setOrientation(1);
                s80 s80Var = new s80(context);
                l80 l80Var = new l80(context, null);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(j0Var.x1() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new lb(this, 8), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = j0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i24 = f6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i24, PorterDuff.Mode.SRC_IN));
                eq eqVar = new eq(0, mutate);
                eqVar.setColorKey(i24);
                eqVar.setSize(AndroidUtilities.dp(18.0f));
                eqVar.setWidth(AndroidUtilities.dp(11.0f));
                eqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
                l80Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                l80Var.setTextSize(1, 14.0f);
                l80Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                b6Var8 = ((f3) j0Var).resourcesProvider;
                if (b6Var8 instanceof ih.b) {
                    int i25 = f6.y6;
                    b6Var11 = ((f3) j0Var).resourcesProvider;
                    l80Var.setTextColor(f6.v0(i25, b6Var11));
                } else {
                    int i26 = f6.G6;
                    b6Var9 = ((f3) j0Var).resourcesProvider;
                    l80Var.setTextColor(f6.v0(i26, b6Var9));
                }
                l80Var.setGravity(1);
                l80Var.setOnClickListener(new View.OnClickListener(this) { // from class: zf.z
                    public final /* synthetic */ c0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        b6 b6Var13;
                        switch (i16) {
                            case 0:
                                j0 j0Var2 = this.b.c;
                                o2 o2Var = j0Var2.n;
                                long j10 = j0Var2.W;
                                b6Var13 = ((f3) j0Var2).resourcesProvider;
                                bg.a0.m(o2Var, b6Var13, j10, null);
                                break;
                            case 1:
                                j0 j0Var3 = this.b.c;
                                AndroidUtilities.addToClipboard(j0Var3.p1());
                                j0Var3.dismiss();
                                break;
                            case 2:
                                AndroidUtilities.addToClipboard(this.b.c.p1());
                                break;
                            default:
                                j0 j0Var4 = this.b.c;
                                j0Var4.M0.run();
                                j0Var4.dismiss();
                                break;
                        }
                    }
                });
                s80Var.setOnClickListener(new x8(l80Var, 27));
                if (j0Var.y1()) {
                    b6Var10 = ((f3) j0Var).resourcesProvider;
                    final int i27 = 1;
                    kh.d dVar = new kh.d(context, b6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: zf.z
                        public final /* synthetic */ c0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            b6 b6Var13;
                            switch (i27) {
                                case 0:
                                    j0 j0Var2 = this.b.c;
                                    o2 o2Var = j0Var2.n;
                                    long j10 = j0Var2.W;
                                    b6Var13 = ((f3) j0Var2).resourcesProvider;
                                    bg.a0.m(o2Var, b6Var13, j10, null);
                                    break;
                                case 1:
                                    j0 j0Var3 = this.b.c;
                                    AndroidUtilities.addToClipboard(j0Var3.p1());
                                    j0Var3.dismiss();
                                    break;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.b.c.p1());
                                    break;
                                default:
                                    j0 j0Var4 = this.b.c;
                                    j0Var4.M0.run();
                                    j0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(j0Var.C0, e6.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, e6.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, e6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(j0Var.B0, e6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(s80Var, e6.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(l80Var, e6.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                b6Var12 = ((f3) j0Var).resourcesProvider;
                view = new f0(j0Var, context, b6Var12);
                break;
            default:
                i0 i0Var = new i0(j0Var, context);
                j0Var.Z = i0Var;
                view = i0Var;
                break;
        }
        return j3.r0.s(view, view, -1, -2);
    }
}
