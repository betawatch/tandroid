package rh;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.b30;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.ic;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
import org.telegram.ui.o60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b8 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new b8());
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0797  */
    @Override // org.telegram.ui.Components.z41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        SpannableString spannableString;
        int L;
        boolean z11;
        boolean z12;
        String str;
        Object obj;
        int i10;
        boolean z13;
        ic icVar;
        int i11;
        String str2;
        long j10;
        boolean z14;
        c8 c8Var = (c8) view;
        TL_stars.StarsTransaction starsTransaction = (TL_stars.StarsTransaction) a51Var.G;
        boolean z15 = a51Var.q;
        g9 g9Var = c8Var.d;
        SpannableString spannableString2 = c8Var.w;
        SpannableString spannableString3 = c8Var.x;
        org.telegram.ui.Components.r8 r8Var = c8Var.b;
        int i12 = c8Var.a;
        TextView textView = c8Var.r;
        TextView textView2 = c8Var.s;
        g9 g9Var2 = c8Var.c;
        TextView textView3 = c8Var.f;
        Integer num = 0;
        p80 p80Var = c8Var.n;
        long o10 = org.telegram.messenger.o5.o(starsTransaction.peer.peer);
        boolean z16 = starsTransaction.amount instanceof TL_stars.TL_starsTonAmount;
        int i13 = starsTransaction.flags;
        boolean z17 = (i13 & 131072) == 0 && (i13 & 65536) != 0;
        boolean z18 = !(o10 == 0 || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details || starsTransaction.posts_search) || starsTransaction.subscription || starsTransaction.floodskip || !(starsTransaction.stargift == null || starsTransaction.stargift_upgrade || starsTransaction.stargift_drop_original_details) || (starsTransaction.gift && (starsTransaction.peer instanceof TL_stars.TL_starsTransactionPeerFragment));
        c8Var.y = z18;
        boolean z19 = z18;
        LinearLayout.LayoutParams layoutParams = c8Var.h;
        if (z19) {
            spannableString = spannableString2;
            L = 0;
        } else {
            spannableString = spannableString2;
            L = org.telegram.messenger.i0.L(4.33f);
        }
        layoutParams.bottomMargin = L;
        p80Var.setVisibility(c8Var.y ? 0 : 8);
        textView.setTextSize(1, c8Var.y ? 13.0f : 14.0f);
        textView.setText(cd.Q(starsTransaction.date));
        if (starsTransaction.refund) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", cd.L0(2131745048, null)));
        } else if (starsTransaction.failed) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", cd.L0(2131745128, null)));
        } else if (starsTransaction.pending) {
            textView.setText(TextUtils.concat(textView.getText(), " — ", cd.L0(2131745071, null)));
        }
        g9Var2.setTranslationX(0.0f);
        g9Var2.setTranslationY(0.0f);
        g9Var.setVisibility(8);
        g9Var2.setRoundRadius(org.telegram.messenger.i0.L(46.0f));
        if (starsTransaction.stargift_upgrade && starsTransaction.stargift != null) {
            g9Var2.setImageDrawable(new p3(g9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(cd.L0(2131749932, null));
            p80Var.setVisibility(8);
        } else if (starsTransaction.stargift_drop_original_details && starsTransaction.stargift != null) {
            g9Var2.setImageDrawable(new p3(g9Var2, starsTransaction.stargift, 46, 0.25f));
            textView3.setText(cd.L0(2131749934, null));
            p80Var.setVisibility(8);
        } else {
            if (!starsTransaction.posts_search) {
                if (o10 != 0) {
                    if (h20.A(o10)) {
                        str = cd.L0(2131744943, null);
                        g9Var2.setImageDrawable(c8.a(44, "fragment"));
                        z12 = false;
                    } else if (o10 >= 0) {
                        TLRPC.User Z1 = vp.r1(i12).Z1(Long.valueOf(o10));
                        z12 = Z1 == null;
                        r8Var.r(Z1);
                        g9Var2.e(Z1, r8Var);
                        str = h20.p(Z1);
                    } else {
                        TLRPC.Chat L0 = vp.r1(i12).L0(Long.valueOf(-o10));
                        z12 = L0 == null;
                        r8Var.q(L0);
                        g9Var2.e(L0, r8Var);
                        str = L0 == null ? "" : L0.title;
                    }
                    if (starsTransaction.stargift != null) {
                        o60 o60Var = new o60(16.0f, i12, p80Var);
                        o60Var.a(4.0f);
                        o60Var.f = false;
                        SpannableString spannableString4 = new SpannableString("x");
                        spannableString4.setSpan(o60Var, 0, 1, 33);
                        h8.c1(o60Var.b, starsTransaction.stargift, 16);
                        textView3.setText(str);
                        if (starsTransaction.offer) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x ");
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.o5(starsTransaction.stargift.getDocument(), p80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder.append((CharSequence) cd.L0(starsTransaction.refund ? 2131745231 : 2131745236, null));
                            } else {
                                spannableStringBuilder.append((CharSequence) cd.L0(starsTransaction.refund ? 2131745235 : 2131745232, null));
                            }
                            p80Var.setText(spannableStringBuilder);
                        } else if (starsTransaction.stargift_resale) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x ");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.o5(starsTransaction.stargift.getDocument(), p80Var.getPaint().getFontMetricsInt()), 0, 1, 33);
                            if (starsTransaction.amount.negative()) {
                                spannableStringBuilder2.append((CharSequence) cd.L0(starsTransaction.refund ? 2131745231 : 2131745234, null));
                            } else {
                                spannableStringBuilder2.append((CharSequence) cd.L0(starsTransaction.refund ? 2131745233 : 2131745232, null));
                            }
                            p80Var.setText(spannableStringBuilder2);
                        } else if (starsTransaction.stargift_prepaid_upgrade) {
                            p80Var.setText(TextUtils.concat(spannableString4, " ", cd.L0(2131749939, null)));
                        } else if (starsTransaction.stargift instanceof TL_stars.TL_starGiftUnique) {
                            p80Var.setText(cd.L0(starsTransaction.refund ? 2131745229 : 2131745230, null));
                        } else if (starsTransaction.refund) {
                            p80Var.setText(TextUtils.concat(spannableString4, " ", cd.L0(starsTransaction.stargift_auction_bid ? 2131749938 : starsTransaction.amount.amount > 0 ? starsTransaction.stargift_upgrade ? 2131749935 : 2131749936 : 2131749937, null)));
                        } else {
                            if (starsTransaction.stargift_auction_bid) {
                                i11 = 2131749941;
                            } else if (starsTransaction.amount.amount > 0) {
                                i11 = 2131749940;
                            } else if (starsTransaction.stargift_upgrade) {
                                str2 = null;
                                i11 = 2131749932;
                                p80Var.setText(TextUtils.concat(spannableString4, " ", cd.L0(i11, str2)));
                            } else {
                                i11 = 2131749933;
                            }
                            str2 = null;
                            p80Var.setText(TextUtils.concat(spannableString4, " ", cd.L0(i11, str2)));
                        }
                    } else if (starsTransaction.subscription) {
                        textView3.setText(str);
                        int i14 = starsTransaction.subscription_period;
                        if (i14 == 2592000) {
                            p80Var.setVisibility(0);
                            p80Var.setText(cd.L0(2131744948, null));
                        } else {
                            String str3 = i14 == 300 ? "5 minutes" : "Minute";
                            p80Var.setVisibility(0);
                            Locale locale = Locale.US;
                            p80Var.setText(str3.concat(" subscription fee"));
                        }
                    } else if (starsTransaction.phonegroup_message) {
                        textView3.setText(str);
                        p80Var.setVisibility(z12 ? 8 : 0);
                        p80Var.setText(cd.L0(starsTransaction.reaction ? 2131744962 : 2131744963, null));
                    } else if (starsTransaction.paid_message) {
                        textView3.setText(str);
                        p80Var.setVisibility(z12 ? 8 : 0);
                        p80Var.setText(cd.H(',', "StarsTransactionMessageFee", starsTransaction.paid_messages));
                    } else if (starsTransaction.premium_gift) {
                        textView3.setText(str);
                        p80Var.setVisibility(z12 ? 8 : 0);
                        p80Var.setText(cd.L0(2131744953, null));
                    } else if (z17) {
                        textView3.setText(str);
                        p80Var.setVisibility(z12 ? 8 : 0);
                        obj = null;
                        p80Var.setText(cd.a0(null, null, 2131745179, xh.i.I0(starsTransaction.starref_commission_permille)));
                    } else if (starsTransaction.gift) {
                        textView3.setText(str);
                        p80Var.setVisibility(z12 ? 8 : 0);
                        p80Var.setText(cd.L0(2131745120, null));
                    } else if ((starsTransaction.flags & TLObject.FLAG_13) != 0) {
                        textView3.setText(str);
                        p80Var.setVisibility(z12 ? 8 : 0);
                        obj = null;
                        p80Var.setText(cd.L0(2131745111, null));
                    } else {
                        obj = null;
                        if (starsTransaction.reaction) {
                            textView3.setText(str);
                            p80Var.setVisibility(z12 ? 8 : 0);
                            p80Var.setText(cd.L0(2131745049, null));
                        } else if (starsTransaction.extended_media.isEmpty()) {
                            z11 = z16;
                            if (starsTransaction.photo != null) {
                                o60 o60Var2 = new o60(14.0f, i12, p80Var);
                                o60Var2.a(4.0f);
                                o60Var2.f = false;
                                SpannableString spannableString5 = new SpannableString("x");
                                spannableString5.setSpan(o60Var2, 0, 1, 33);
                                o60Var2.b.q0(ic.p(b30.c(starsTransaction.photo)), "14_14", null, null, num, 0);
                                textView3.setText(str);
                                p80Var.setVisibility(z12 ? 8 : 0);
                                String str4 = starsTransaction.title;
                                p80Var.setText(org.telegram.messenger.k6.m(TextUtils.concat(spannableString5, " ", str4 != null ? str4 : ""), p80Var.getPaint().getFontMetricsInt(), false, null, 0));
                            } else {
                                textView3.setText(str);
                                p80Var.setVisibility(z12 ? 8 : 0);
                                String str5 = starsTransaction.title;
                                p80Var.setText(org.telegram.messenger.k6.m(str5 != null ? str5 : "", p80Var.getPaint().getFontMetricsInt(), false, null, 0));
                            }
                        } else {
                            if (z15) {
                                textView3.setText(str);
                                p80Var.setVisibility(0);
                                p80Var.setText(cd.L0(2131745222, null));
                            } else {
                                textView3.setText(cd.L0(2131745222, null));
                                p80Var.setVisibility(z12 ? 8 : 0);
                                p80Var.setText(str);
                            }
                            c8Var.e = 0;
                            int i15 = 0;
                            for (int i16 = 2; i15 < Math.min(i16, starsTransaction.extended_media.size()); i16 = 2) {
                                TLRPC.MessageMedia messageMedia = starsTransaction.extended_media.get(i15);
                                g9 g9Var3 = i15 == 0 ? g9Var2 : g9Var;
                                g9Var3.setRoundRadius(org.telegram.messenger.i0.L(12.0f));
                                if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                                    i10 = 0;
                                    ic i17 = ic.i(org.telegram.messenger.b8.w(messageMedia.photo.sizes, org.telegram.messenger.i0.L(46.0f), true, null, false), messageMedia.photo);
                                    z13 = z16;
                                    icVar = i17;
                                } else {
                                    i10 = 0;
                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                        boolean z20 = z16;
                                        icVar = ic.c(org.telegram.messenger.b8.w(messageMedia.document.thumbs, org.telegram.messenger.i0.L(46.0f), true, null, false), messageMedia.document);
                                        z13 = z20;
                                    } else {
                                        z13 = z16;
                                        icVar = null;
                                    }
                                }
                                g9Var3.setVisibility(i10);
                                Integer num2 = num;
                                g9Var3.m(icVar, "46_46", null, null, null, num2);
                                c8Var.e++;
                                i15++;
                                z16 = z13;
                                num = num2;
                            }
                            z11 = z16;
                            int i18 = 0;
                            while (i18 < c8Var.e) {
                                g9 g9Var4 = i18 == 0 ? g9Var2 : g9Var;
                                float f7 = i18;
                                g9Var4.setTranslationX(((f7 - (c8Var.e / 2.0f)) * org.telegram.messenger.i0.L(4.33f)) + org.telegram.messenger.i0.L(2.0f));
                                g9Var4.setTranslationY((f7 - (c8Var.e / 2.0f)) * org.telegram.messenger.i0.L(4.33f));
                                i18++;
                            }
                        }
                    }
                    z11 = z16;
                } else {
                    z11 = z16;
                    if (starsTransaction.floodskip) {
                        textView3.setText(cd.L0(2131744977, null));
                        p80Var.setText(cd.H(',', "StarsTransactionFloodskipMessages", starsTransaction.floodskip_number));
                        g9Var2.setImageDrawable(c8.a(44, "api"));
                    } else {
                        TL_stars.StarsTransactionPeer starsTransactionPeer = starsTransaction.peer;
                        if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAppStore) {
                            textView3.setText(cd.L0(2131744964, null));
                            g9Var2.setImageDrawable(c8.a(44, "ios"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPlayMarket) {
                            textView3.setText(cd.L0(2131744964, null));
                            g9Var2.setImageDrawable(c8.a(44, "android"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerFragment) {
                            if (starsTransaction.gift) {
                                textView3.setText(cd.L0(2131745120, null));
                                p80Var.setText(cd.L0(z11 ? 2131744946 : 2131744943, null));
                                p80Var.setVisibility(0);
                            } else {
                                textView3.setText(cd.L0((z15 || (!starsTransaction.refund ? !starsTransaction.amount.negative() : !starsTransaction.amount.positive())) ? 2131744939 : 2131744969, null));
                            }
                            g9Var2.setImageDrawable(c8.a(44, "fragment"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerPremiumBot) {
                            textView3.setText(cd.L0(2131744979, null));
                            g9Var2.setImageDrawable(c8.a(44, "premiumbot"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerUnsupported) {
                            textView3.setText(cd.L0(2131744941, null));
                            g9Var2.setImageDrawable(c8.a(44, "?"));
                        } else if (starsTransactionPeer instanceof TL_stars.TL_starsTransactionPeerAds) {
                            textView3.setText(cd.L0(2131744980, null));
                            g9Var2.setImageDrawable(c8.a(44, "ads"));
                        } else {
                            textView3.setText("");
                            g9Var2.setImageDrawable(null);
                        }
                    }
                }
                TL_stars.StarsAmount starsAmount = starsTransaction.amount;
                j10 = starsAmount.amount;
                if (j10 <= 0 || (j10 == 0 && starsAmount.nanos > 0)) {
                    textView2.setVisibility(0);
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.ik, null);
                    textView2.setText(TextUtils.concat("+", h8.K0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
                    z14 = z10;
                } else {
                    if (j10 < 0 || (j10 == 0 && starsAmount.nanos < 0)) {
                        textView2.setVisibility(0);
                        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.kk, null);
                        textView2.setText(TextUtils.concat(h8.K0(starsTransaction.amount), " ", z11 ? spannableString3 : spannableString));
                    } else {
                        textView2.setVisibility(8);
                    }
                    z14 = z10;
                }
                c8Var.D = z14;
                c8Var.setWillNotDraw(!z14);
            }
            g9Var2.setImageDrawable(c8.a(44, "search"));
            textView3.setText(cd.L0(2131744954, null));
            p80Var.setVisibility(8);
        }
        z11 = z16;
        TL_stars.StarsAmount starsAmount2 = starsTransaction.amount;
        j10 = starsAmount2.amount;
        if (j10 <= 0) {
        }
        textView2.setVisibility(0);
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.ik, null);
        textView2.setText(TextUtils.concat("+", h8.K0(starsTransaction.amount), " ", !z11 ? spannableString3 : spannableString));
        z14 = z10;
        c8Var.D = z14;
        c8Var.setWillNotDraw(!z14);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new c8(i10, context, p6Var);
    }
}
