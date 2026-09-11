package sg;

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
import com.google.android.gms.internal.vision.e2;
import di.ec;
import java.util.ArrayList;
import java.util.HashSet;
import ji.m4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.t00;
import org.telegram.ui.t5;
import w7.x5;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class d0 extends kl0 {
    public final /* synthetic */ k0 c;

    public d0(k0 k0Var) {
        this.c = k0Var;
    }

    @Override // org.telegram.ui.Components.kl0
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
                if (k0Var.Y) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (k0Var.B0.size() == 1) {
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
                TLRPC.Chat chat2 = (TLRPC.Chat) k0Var.z0.get(i10 - k0Var.o0);
                f4Var.e(chat2, chat2.title, (String) k0Var.A0.get(i10 - k0Var.o0), ((float) i10) != ((float) k0Var.p0) - 1.0f);
                f4Var.c(hashSet.contains(chat2), false);
                return;
            }
            if (i12 == 11 || i12 == 34) {
                TLRPC.User user = (TLRPC.User) k0Var.B0.get(i10 - k0Var.o0);
                ArrayList arrayList = k0Var.C0;
                boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                f4Var.R = true;
                f4Var.Q = requirementtocontactpremium;
                f4Var.g();
                if (z10) {
                    formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                } else {
                    i11 = ((f3) k0Var).currentAccount;
                    formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                }
                f4Var.e(user, ContactsController.formatName(user.first_name, user.last_name), formatUserStatus, ((float) i10) != ((float) k0Var.p0) - 1.0f);
                f4Var.c(hashSet.contains(user), false);
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
        t5 t5Var = g0Var.c;
        ImageView imageView = g0Var.a;
        j5 j5Var = g0Var.b;
        if (f0Var instanceof e0) {
            g0Var.f = (e0) f0Var;
            g0Var.e = null;
            imageView.setVisibility(8);
            j5Var.setVisibility(8);
            t5Var.setVisibility(0);
            j5 j5Var2 = g0Var.d;
            e0 e0Var = g0Var.f;
            j5Var2.l(LocaleController.formatPluralString(e0Var.h ? "BoostLevelUnlocks" : "BoostLevel", e0Var.g, new Object[0]), false);
            return;
        }
        if (f0Var != null) {
            g0Var.f = null;
            g0Var.e = f0Var;
            imageView.setVisibility(0);
            imageView.setImageResource(g0Var.e.a);
            j5Var.setVisibility(0);
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
                    spannableString.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                j5Var.l(spannableStringBuilder, false);
            } else {
                String string2 = LocaleController.getString(f0Var2.b);
                String str = string2 != null ? string2 : "";
                if (g0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(g0Var.e.c);
                        spannableString2.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                        spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                    }
                    j5Var.l(spannableStringBuilder2, false);
                } else {
                    j5Var.l(str, false);
                }
            }
            t5Var.setVisibility(8);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        int i11;
        int i12;
        View view;
        View view2;
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
        f6 f6Var10;
        f6 f6Var11;
        f6 f6Var12;
        Context context = viewGroup.getContext();
        final int i17 = 0;
        k0 k0Var = this.c;
        switch (i10) {
            case 1:
                view2 = new org.telegram.ui.Cells.n(context, new c0(this), true, 9);
                break;
            case 2:
                int i18 = j6.a7;
                f6Var = ((f3) k0Var).resourcesProvider;
                view2 = new a7(context, j6.v0(i18, f6Var), 0);
                break;
            case 3:
                View l4Var = new l4(context);
                l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                view2 = l4Var;
                break;
            case 4:
                f6Var2 = ((f3) k0Var).resourcesProvider;
                View f4Var = new f4(1, 0, context, f6Var2, false, false);
                i11 = ((f3) k0Var).backgroundPaddingLeft;
                i12 = ((f3) k0Var).backgroundPaddingLeft;
                f4Var.setPadding(i11, 0, i12, 0);
                view2 = f4Var;
                break;
            case 5:
                t00 t00Var = new t00(context, null);
                t00Var.setViewType(k0Var.h0 == 2 ? 22 : 21);
                t00Var.setIsSingleCell(true);
                t00Var.setIgnoreHeightCheck(true);
                t00Var.setItemsCount(10);
                view2 = t00Var;
                break;
            case 6:
                view = new jn(k0Var.getContext(), 29);
                view2 = view;
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
                i13 = ((f3) k0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i13;
                i14 = ((f3) k0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i14, 0);
                TextView textView = new TextView(context);
                if (k0Var.Q0 == null && ChatObject.hasAdminRights(k0Var.s1())) {
                    k0Var.Q0 = new org.telegram.ui.web.b(this, 29);
                }
                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(k0Var.Q0 == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, x5.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp2 = AndroidUtilities.dp(8.0f);
                int i19 = j6.e7;
                f6Var3 = ((f3) k0Var).resourcesProvider;
                int v02 = j6.v0(i19, f6Var3);
                int i20 = j6.i6;
                f6Var4 = ((f3) k0Var).resourcesProvider;
                int k10 = i0.a.k(j6.v0(i20, f6Var4), 76);
                textView.setBackground(j6.i0(dp2, dp2, dp2, dp2, v02, k10, k10));
                int i21 = j6.G6;
                f6Var5 = ((f3) k0Var).resourcesProvider;
                textView.setTextColor(j6.v0(i21, f6Var5));
                final int i22 = 2;
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: sg.b0
                    public final /* synthetic */ d0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        f6 f6Var13;
                        switch (i22) {
                            case 0:
                                k0 k0Var2 = this.b.c;
                                n2 n2Var = k0Var2.n;
                                long j3 = k0Var2.a0;
                                f6Var13 = ((f3) k0Var2).resourcesProvider;
                                ug.n.m(n2Var, f6Var13, j3, null);
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
                    f6Var6 = ((f3) k0Var).resourcesProvider;
                    imageView.setColorFilter(j6.v0(i23, f6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp3 = AndroidUtilities.dp(20.0f);
                    f6Var7 = ((f3) k0Var).resourcesProvider;
                    int k11 = i0.a.k(j6.v0(i20, f6Var7), 76);
                    imageView.setBackground(j6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
                    frameLayout.addView(imageView, x5.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i24 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: sg.b0
                        public final /* synthetic */ d0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            f6 f6Var13;
                            switch (i24) {
                                case 0:
                                    k0 k0Var2 = this.b.c;
                                    n2 n2Var = k0Var2.n;
                                    long j3 = k0Var2.a0;
                                    f6Var13 = ((f3) k0Var2).resourcesProvider;
                                    ug.n.m(n2Var, f6Var13, j3, null);
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
                view2 = view;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i15 = ((f3) k0Var).backgroundPaddingLeft;
                int dp4 = AndroidUtilities.dp(6.0f) + i15;
                i16 = ((f3) k0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp4, 0, AndroidUtilities.dp(6.0f) + i16, 0);
                linearLayout.setOrientation(1);
                k90 k90Var = new k90(context);
                d90 d90Var = new d90(context, null);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(k0Var.x1() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new ec(this, 8), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = k0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i25 = j6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i25, PorterDuff.Mode.SRC_IN));
                nq nqVar = new nq(0, mutate);
                nqVar.setColorKey(i25);
                nqVar.setSize(AndroidUtilities.dp(18.0f));
                nqVar.setWidth(AndroidUtilities.dp(11.0f));
                nqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
                d90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                d90Var.setTextSize(1, 14.0f);
                d90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                f6Var8 = ((f3) k0Var).resourcesProvider;
                if (f6Var8 instanceof bi.b) {
                    int i26 = j6.y6;
                    f6Var11 = ((f3) k0Var).resourcesProvider;
                    d90Var.setTextColor(j6.v0(i26, f6Var11));
                } else {
                    int i27 = j6.G6;
                    f6Var9 = ((f3) k0Var).resourcesProvider;
                    d90Var.setTextColor(j6.v0(i27, f6Var9));
                }
                final int i28 = 1;
                d90Var.setGravity(1);
                d90Var.setOnClickListener(new View.OnClickListener(this) { // from class: sg.b0
                    public final /* synthetic */ d0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        f6 f6Var13;
                        switch (i17) {
                            case 0:
                                k0 k0Var2 = this.b.c;
                                n2 n2Var = k0Var2.n;
                                long j3 = k0Var2.a0;
                                f6Var13 = ((f3) k0Var2).resourcesProvider;
                                ug.n.m(n2Var, f6Var13, j3, null);
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
                k90Var.setOnClickListener(new m4(d90Var, 10));
                if (k0Var.y1()) {
                    f6Var10 = ((f3) k0Var).resourcesProvider;
                    di.d dVar = new di.d(context, f6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: sg.b0
                        public final /* synthetic */ d0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            f6 f6Var13;
                            switch (i28) {
                                case 0:
                                    k0 k0Var2 = this.b.c;
                                    n2 n2Var = k0Var2.n;
                                    long j3 = k0Var2.a0;
                                    f6Var13 = ((f3) k0Var2).resourcesProvider;
                                    ug.n.m(n2Var, f6Var13, j3, null);
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
                    linearLayout2.addView(k0Var.G0, x5.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, x5.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, x5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(k0Var.F0, x5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(k90Var, x5.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(d90Var, x5.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view2 = linearLayout;
                break;
            case 9:
                f6Var12 = ((f3) k0Var).resourcesProvider;
                view2 = new g0(k0Var, context, f6Var12);
                break;
            default:
                j0 j0Var = new j0(k0Var, context);
                k0Var.d0 = j0Var;
                view2 = j0Var;
                break;
        }
        return e2.l(view2, view2, -1, -2);
    }
}
