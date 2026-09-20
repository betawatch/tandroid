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
import ci.dc;
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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.t51;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.t5;
import w7.y5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class c0 extends ul0 {
    public final /* synthetic */ j0 c;

    public c0(j0 j0Var) {
        this.c = j0Var;
    }

    @Override // org.telegram.ui.Components.ul0
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
                n4 n4Var = (n4) view;
                if (i12 != 11 && i12 != 34) {
                    if (i12 == 2) {
                        n4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        n4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                }
                if (j0Var.Y) {
                    n4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (j0Var.B0.size() == 1) {
                    n4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    n4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            if (i13 != 4) {
                return;
            }
            h4 h4Var = (h4) view;
            if (i12 == 5) {
                TLRPC.Chat chat2 = (TLRPC.Chat) j0Var.z0.get(i10 - j0Var.o0);
                h4Var.e(chat2, chat2.title, (String) j0Var.A0.get(i10 - j0Var.o0), ((float) i10) != ((float) j0Var.p0) - 1.0f);
                h4Var.c(hashSet.contains(chat2), false);
                return;
            }
            if (i12 == 11 || i12 == 34) {
                TLRPC.User user = (TLRPC.User) j0Var.B0.get(i10 - j0Var.o0);
                ArrayList arrayList = j0Var.C0;
                boolean z10 = arrayList != null && arrayList.contains(Long.valueOf(user.id));
                TL_account.requirementToContactPremium requirementtocontactpremium = z10 ? new TL_account.requirementToContactPremium() : null;
                h4Var.R = true;
                h4Var.Q = requirementtocontactpremium;
                h4Var.g();
                if (z10) {
                    formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                } else {
                    i11 = ((f3) j0Var).currentAccount;
                    formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                }
                h4Var.e(user, ContactsController.formatName(user.first_name, user.last_name), formatUserStatus, ((float) i10) != ((float) j0Var.p0) - 1.0f);
                h4Var.c(hashSet.contains(user), false);
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
        t5 t5Var = f0Var.c;
        ImageView imageView = f0Var.a;
        j5 j5Var = f0Var.b;
        if (e0Var instanceof d0) {
            f0Var.f = (d0) e0Var;
            f0Var.e = null;
            imageView.setVisibility(8);
            j5Var.setVisibility(8);
            t5Var.setVisibility(0);
            j5 j5Var2 = f0Var.d;
            d0 d0Var = f0Var.f;
            j5Var2.l(LocaleController.formatPluralString(d0Var.h ? "BoostLevelUnlocks" : "BoostLevel", d0Var.g, new Object[0]), false);
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
                    SpannableString spannableString = new SpannableString(a4.a.n(f0Var.e.e, "", new StringBuilder()));
                    spannableString.setSpan(new t51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                }
                j5Var.l(spannableStringBuilder, false);
            } else {
                String string2 = LocaleController.getString(e0Var2.b);
                String str = string2 != null ? string2 : "";
                if (f0Var.e.c != null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str);
                    int indexOf2 = str.indexOf("%s");
                    if (indexOf2 >= 0) {
                        spannableStringBuilder2 = new SpannableStringBuilder(str);
                        SpannableString spannableString2 = new SpannableString(f0Var.e.c);
                        spannableString2.setSpan(new t51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
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
        j0 j0Var = this.c;
        switch (i10) {
            case 1:
                view = new org.telegram.ui.Cells.n(context, new b0(this), true, 9);
                break;
            case 2:
                int i18 = j6.a7;
                f6Var = ((f3) j0Var).resourcesProvider;
                view = new c7(context, j6.v0(i18, f6Var), 0);
                break;
            case 3:
                View n4Var = new n4(context);
                n4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                view = n4Var;
                break;
            case 4:
                f6Var2 = ((f3) j0Var).resourcesProvider;
                View h4Var = new h4(1, 0, context, f6Var2, false, false);
                i11 = ((f3) j0Var).backgroundPaddingLeft;
                i12 = ((f3) j0Var).backgroundPaddingLeft;
                h4Var.setPadding(i11, 0, i12, 0);
                view = h4Var;
                break;
            case 5:
                t00 t00Var = new t00(context, null);
                t00Var.setViewType(j0Var.h0 == 2 ? 22 : 21);
                t00Var.setIsSingleCell(true);
                t00Var.setIgnoreHeightCheck(true);
                t00Var.setItemsCount(10);
                view = t00Var;
                break;
            case 6:
                view = new kn(j0Var.getContext(), 29);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
                i13 = ((f3) j0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i13;
                i14 = ((f3) j0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i14, 0);
                TextView textView = new TextView(context);
                if (j0Var.Q0 == null && ChatObject.hasAdminRights(j0Var.s1())) {
                    j0Var.Q0 = new org.telegram.ui.web.r0(this, 26);
                }
                textView.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(j0Var.Q0 == null ? 18.0f : 50.0f), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, y5.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp2 = AndroidUtilities.dp(8.0f);
                int i19 = j6.e7;
                f6Var3 = ((f3) j0Var).resourcesProvider;
                int v02 = j6.v0(i19, f6Var3);
                int i20 = j6.i6;
                f6Var4 = ((f3) j0Var).resourcesProvider;
                int k10 = i0.a.k(j6.v0(i20, f6Var4), 76);
                textView.setBackground(j6.i0(dp2, dp2, dp2, dp2, v02, k10, k10));
                int i21 = j6.G6;
                f6Var5 = ((f3) j0Var).resourcesProvider;
                textView.setTextColor(j6.v0(i21, f6Var5));
                final int i22 = 2;
                textView.setOnClickListener(new View.OnClickListener(this) { // from class: rg.a0
                    public final /* synthetic */ c0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        f6 f6Var13;
                        switch (i22) {
                            case 0:
                                j0 j0Var2 = this.b.c;
                                n2 n2Var = j0Var2.n;
                                long j3 = j0Var2.a0;
                                f6Var13 = ((f3) j0Var2).resourcesProvider;
                                tg.m.m(n2Var, f6Var13, j3, null);
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
                    int i23 = j6.j5;
                    f6Var6 = ((f3) j0Var).resourcesProvider;
                    imageView.setColorFilter(j6.v0(i23, f6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp3 = AndroidUtilities.dp(20.0f);
                    f6Var7 = ((f3) j0Var).resourcesProvider;
                    int k11 = i0.a.k(j6.v0(i20, f6Var7), 76);
                    imageView.setBackground(j6.i0(dp3, dp3, dp3, dp3, 0, k11, k11));
                    frameLayout.addView(imageView, y5.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    final int i24 = 3;
                    imageView.setOnClickListener(new View.OnClickListener(this) { // from class: rg.a0
                        public final /* synthetic */ c0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            f6 f6Var13;
                            switch (i24) {
                                case 0:
                                    j0 j0Var2 = this.b.c;
                                    n2 n2Var = j0Var2.n;
                                    long j3 = j0Var2.a0;
                                    f6Var13 = ((f3) j0Var2).resourcesProvider;
                                    tg.m.m(n2Var, f6Var13, j3, null);
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
                r90 r90Var = new r90(context);
                k90 k90Var = new k90(context, null);
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(j0Var.x1() ? R.string.BoostingStoriesByGiftingGroup2 : R.string.BoostingStoriesByGiftingChannel2));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new dc(this, 8), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = j0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i25 = j6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i25, PorterDuff.Mode.SRC_IN));
                oq oqVar = new oq(0, mutate);
                oqVar.setColorKey(i25);
                oqVar.setSize(AndroidUtilities.dp(18.0f));
                oqVar.setWidth(AndroidUtilities.dp(11.0f));
                oqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
                k90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                k90Var.setTextSize(1, 14.0f);
                k90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                f6Var8 = ((f3) j0Var).resourcesProvider;
                if (f6Var8 instanceof ai.d) {
                    int i26 = j6.y6;
                    f6Var11 = ((f3) j0Var).resourcesProvider;
                    k90Var.setTextColor(j6.v0(i26, f6Var11));
                } else {
                    int i27 = j6.G6;
                    f6Var9 = ((f3) j0Var).resourcesProvider;
                    k90Var.setTextColor(j6.v0(i27, f6Var9));
                }
                final int i28 = 1;
                k90Var.setGravity(1);
                k90Var.setOnClickListener(new View.OnClickListener(this) { // from class: rg.a0
                    public final /* synthetic */ c0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        f6 f6Var13;
                        switch (i17) {
                            case 0:
                                j0 j0Var2 = this.b.c;
                                n2 n2Var = j0Var2.n;
                                long j3 = j0Var2.a0;
                                f6Var13 = ((f3) j0Var2).resourcesProvider;
                                tg.m.m(n2Var, f6Var13, j3, null);
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
                r90Var.setOnClickListener(new org.telegram.ui.Components.voip.o(k90Var, 9));
                if (j0Var.y1()) {
                    f6Var10 = ((f3) j0Var).resourcesProvider;
                    ci.d dVar = new ci.d(context, f6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) { // from class: rg.a0
                        public final /* synthetic */ c0 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            f6 f6Var13;
                            switch (i28) {
                                case 0:
                                    j0 j0Var2 = this.b.c;
                                    n2 n2Var = j0Var2.n;
                                    long j3 = j0Var2.a0;
                                    f6Var13 = ((f3) j0Var2).resourcesProvider;
                                    tg.m.m(n2Var, f6Var13, j3, null);
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
                    linearLayout2.addView(j0Var.G0, y5.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, y5.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, y5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(j0Var.F0, y5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(r90Var, y5.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(k90Var, y5.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                view = linearLayout;
                break;
            case 9:
                f6Var12 = ((f3) j0Var).resourcesProvider;
                view = new f0(j0Var, context, f6Var12);
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
