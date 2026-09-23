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
import ci.ac;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.u00;
import org.telegram.ui.u5;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class c0 extends ll0 {
    public final /* synthetic */ j0 c;

    public c0(j0 j0Var) {
        this.c = j0Var;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        j0 j0Var = this.c;
        int i10 = j0Var.h0;
        if ((i10 == 11 || i10 == 34) && !j0Var.Y) {
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        String formatUserStatus;
        j0 j0Var = this.c;
        int i12 = j0Var.h0;
        HashSet hashSet = j0Var.y0;
        int i13 = c1Var.f;
        View view = c1Var.a;
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
                if (j0Var.Y) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (j0Var.B0.size() == 1) {
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
                TLRPC.Chat chat2 = (TLRPC.Chat) j0Var.z0.get(i10 - j0Var.o0);
                g4Var.e(chat2, chat2.title, (String) j0Var.A0.get(i10 - j0Var.o0), ((float) i10) != ((float) j0Var.p0) - 1.0f);
                g4Var.c(hashSet.contains(chat2), false);
                return;
            }
            if (i12 == 11 || i12 == 34) {
                TLRPC.User user = (TLRPC.User) j0Var.B0.get(i10 - j0Var.o0);
                ArrayList arrayList = j0Var.C0;
                boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                g4Var.R = true;
                g4Var.Q = requirementtocontactpremium;
                g4Var.g();
                if (z10) {
                    formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                } else {
                    i11 = ((f3) j0Var).currentAccount;
                    formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                }
                g4Var.e(user, ContactsController.formatName(user.first_name, user.last_name), formatUserStatus, ((float) i10) != ((float) j0Var.p0) - 1.0f);
                g4Var.c(hashSet.contains(user), false);
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
        u5 u5Var = f0Var.c;
        ImageView imageView = f0Var.a;
        i5 i5Var = f0Var.b;
        if (e0Var instanceof d0) {
            f0Var.f = (d0) e0Var;
            f0Var.e = null;
            imageView.setVisibility(8);
            i5Var.setVisibility(8);
            u5Var.setVisibility(0);
            i5 i5Var2 = f0Var.d;
            d0 d0Var = f0Var.f;
            i5Var2.l(LocaleController.formatPluralString(d0Var.h ? "BoostLevelUnlocks" : "BoostLevel", d0Var.g, new Object[0]), false);
            return;
        }
        if (e0Var != null) {
            f0Var.f = null;
            f0Var.e = e0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(f0Var.e.a);
            i5Var.setVisibility(0);
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
                    SpannableString spannableString = new SpannableString(a4.a.o(f0Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                i5Var.l(spannableStringBuilder, false);
            } else {
                String string2 = LocaleController.getString(e0Var2.b);
                String str = string2 != null ? string2 : "";
                if (f0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(f0Var.e.c);
                        spannableString2.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
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
        j0 j0Var = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new b0(this), true, 9);
                break;
            case 2:
                int i18 = h6.a7;
                d6Var = ((f3) j0Var).resourcesProvider;
                view = new a7(context, h6.v0(i18, d6Var), 0);
                break;
            case 3:
                View m4Var = new m4(context);
                m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                view = m4Var;
                break;
            case 4:
                d6Var2 = ((f3) j0Var).resourcesProvider;
                View g4Var = new g4(1, 0, context, d6Var2, false, false);
                i11 = ((f3) j0Var).backgroundPaddingLeft;
                i12 = ((f3) j0Var).backgroundPaddingLeft;
                g4Var.setPadding(i11, 0, i12, 0);
                view = g4Var;
                break;
            case 5:
                u00 u00Var = new u00(context, null);
                u00Var.setViewType(j0Var.h0 == 2 ? 22 : 21);
                u00Var.setIsSingleCell(true);
                u00Var.setIgnoreHeightCheck(true);
                u00Var.setItemsCount(10);
                view = u00Var;
                break;
            case 6:
                view = new ln(j0Var.getContext(), 29);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
                i13 = ((f3) j0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i13;
                i14 = ((f3) j0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i14, 0);
                TextView textView = new TextView(context);
                if (j0Var.Q0 == null && ChatObject.hasAdminRights(j0Var.s1())) {
                    j0Var.Q0 = new org.telegram.ui.web.t0(this, 25);
                }
                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(j0Var.Q0 == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, x5.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp2 = AndroidUtilities.dp(8.0f);
                int i19 = h6.e7;
                d6Var3 = ((f3) j0Var).resourcesProvider;
                int v02 = h6.v0(i19, d6Var3);
                int i20 = h6.i6;
                d6Var4 = ((f3) j0Var).resourcesProvider;
                int k10 = i0.a.k(h6.v0(i20, d6Var4), 76);
                textView.setBackground(h6.i0(dp2, dp2, dp2, dp2, v02, k10, k10));
                int i21 = h6.G6;
                d6Var5 = ((f3) j0Var).resourcesProvider;
                textView.setTextColor(h6.v0(i21, d6Var5));
                final int i22 = 2;
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: rg.a0
                    public final /* synthetic */ c0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        d6 d6Var13;
                        switch (i22) {
                            case 0:
                                j0 j0Var2 = this.b.c;
                                n2 n2Var = j0Var2.n;
                                long j3 = j0Var2.a0;
                                d6Var13 = ((f3) j0Var2).resourcesProvider;
                                tg.o.m(n2Var, d6Var13, j3, null);
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
                                j0Var4.Q0.run();
                                j0Var4.dismiss();
                                break;
                        }
                    }
                });
                if (j0Var.Q0 != null) {
                    ImageView imageView = new ImageView(j0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i23 = h6.j5;
                    d6Var6 = ((f3) j0Var).resourcesProvider;
                    imageView.setColorFilter(h6.v0(i23, d6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp3 = AndroidUtilities.dp(20.0f);
                    d6Var7 = ((f3) j0Var).resourcesProvider;
                    int k11 = i0.a.k(h6.v0(i20, d6Var7), 76);
                    imageView.setBackground(h6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
                    frameLayout.addView(imageView, x5.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i24 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: rg.a0
                        public final /* synthetic */ c0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            d6 d6Var13;
                            switch (i24) {
                                case 0:
                                    j0 j0Var2 = this.b.c;
                                    n2 n2Var = j0Var2.n;
                                    long j3 = j0Var2.a0;
                                    d6Var13 = ((f3) j0Var2).resourcesProvider;
                                    tg.o.m(n2Var, d6Var13, j3, null);
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
                                    j0Var4.Q0.run();
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
                i15 = ((f3) j0Var).backgroundPaddingLeft;
                int dp4 = AndroidUtilities.dp(6.0f) + i15;
                i16 = ((f3) j0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp4, 0, AndroidUtilities.dp(6.0f) + i16, 0);
                linearLayout.setOrientation(1);
                k90 k90Var = new k90(context);
                d90 d90Var = new d90(context, null);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(j0Var.x1() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new ac(this, 8), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = j0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i25 = h6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i25, PorterDuff.Mode.SRC_IN));
                pq pqVar = new pq(0, mutate);
                pqVar.setColorKey(i25);
                pqVar.setSize(AndroidUtilities.dp(18.0f));
                pqVar.setWidth(AndroidUtilities.dp(11.0f));
                pqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(pqVar, 0, spannableString.length(), 33);
                d90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                d90Var.setTextSize(1, 14.0f);
                d90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                d6Var8 = ((f3) j0Var).resourcesProvider;
                if (d6Var8 instanceof ai.d) {
                    int i26 = h6.y6;
                    d6Var11 = ((f3) j0Var).resourcesProvider;
                    d90Var.setTextColor(h6.v0(i26, d6Var11));
                } else {
                    int i27 = h6.G6;
                    d6Var9 = ((f3) j0Var).resourcesProvider;
                    d90Var.setTextColor(h6.v0(i27, d6Var9));
                }
                final int i28 = 1;
                d90Var.setGravity(1);
                d90Var.setOnClickListener(new View.OnClickListener(this) { // from class: rg.a0
                    public final /* synthetic */ c0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        d6 d6Var13;
                        switch (i17) {
                            case 0:
                                j0 j0Var2 = this.b.c;
                                n2 n2Var = j0Var2.n;
                                long j3 = j0Var2.a0;
                                d6Var13 = ((f3) j0Var2).resourcesProvider;
                                tg.o.m(n2Var, d6Var13, j3, null);
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
                                j0Var4.Q0.run();
                                j0Var4.dismiss();
                                break;
                        }
                    }
                });
                k90Var.setOnClickListener(new org.telegram.ui.Components.voip.o(d90Var, 9));
                if (j0Var.y1()) {
                    d6Var10 = ((f3) j0Var).resourcesProvider;
                    ci.d dVar = new ci.d(context, d6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: rg.a0
                        public final /* synthetic */ c0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            d6 d6Var13;
                            switch (i28) {
                                case 0:
                                    j0 j0Var2 = this.b.c;
                                    n2 n2Var = j0Var2.n;
                                    long j3 = j0Var2.a0;
                                    d6Var13 = ((f3) j0Var2).resourcesProvider;
                                    tg.o.m(n2Var, d6Var13, j3, null);
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
                                    j0Var4.Q0.run();
                                    j0Var4.dismiss();
                                    break;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(j0Var.G0, x5.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, x5.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, x5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(j0Var.F0, x5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(k90Var, x5.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(d90Var, x5.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                d6Var12 = ((f3) j0Var).resourcesProvider;
                view = new f0(j0Var, context, d6Var12);
                break;
            default:
                i0 i0Var = new i0(j0Var, context);
                j0Var.d0 = i0Var;
                view = i0Var;
                break;
        }
        return e2.k(view, view, -1, -2);
    }
}
