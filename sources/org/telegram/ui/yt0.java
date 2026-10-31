package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yt0 extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public yt0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 8;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.h;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        if (i10 >= premiumPreviewFragment.n && i10 < premiumPreviewFragment.r) {
            return 1;
        }
        if (i10 >= premiumPreviewFragment.w && i10 < premiumPreviewFragment.x) {
            return 1;
        }
        if (i10 == 0) {
            return 4;
        }
        if (i10 == premiumPreviewFragment.y || i10 == premiumPreviewFragment.D || i10 == premiumPreviewFragment.E || i10 == premiumPreviewFragment.H) {
            return 5;
        }
        if (i10 == premiumPreviewFragment.F) {
            return 6;
        }
        if (i10 == premiumPreviewFragment.s || i10 == premiumPreviewFragment.G) {
            return 7;
        }
        return i10 == premiumPreviewFragment.showAdsRow ? 8 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x02ac  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        String str;
        int i11;
        boolean z10;
        View view = c1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z11 = premiumPreviewFragment.h0;
        int i12 = premiumPreviewFragment.n;
        boolean z12 = false;
        if (i10 >= i12 && i10 < premiumPreviewFragment.r) {
            ((st0) view).a((eu0) premiumPreviewFragment.b.get(i10 - i12), i10 != premiumPreviewFragment.r - 1);
            return;
        }
        int i13 = premiumPreviewFragment.w;
        if (i10 >= i13 && i10 < premiumPreviewFragment.x) {
            ((st0) view).a((eu0) premiumPreviewFragment.c.get(i10 - i13), i10 != premiumPreviewFragment.x - 1);
            return;
        }
        if (i10 == premiumPreviewFragment.y) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setText("");
            b9Var.setFixedSize(12);
            return;
        }
        String str2 = null;
        if (i10 != premiumPreviewFragment.D && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
            if (i10 == premiumPreviewFragment.s) {
                ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.cd.L0(2131747009, null));
                return;
            }
            if (i10 == premiumPreviewFragment.G) {
                ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.cd.L0(2131745368, null));
                return;
            }
            if (i10 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull a2 = premiumPreviewFragment.getMessagesController().a2(premiumPreviewFragment.getUserConfig().e());
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                String L0 = org.telegram.messenger.cd.L0(2131745370, null);
                if (a2 != null && !a2.sponsored_enabled) {
                    r6 = false;
                }
                p8Var.l(L0, r6, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.b9 b9Var2 = (org.telegram.ui.Cells.b9) view;
        if (!z11) {
            b9Var2.setTextColor(org.telegram.ui.ActionBar.t6.r1(0.75f, -1));
            b9Var2.getTextView().setLinkTextColor(-1);
            b9Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.15f, -1)));
        }
        b9Var2.setFixedSize(0);
        if (i10 == premiumPreviewFragment.H) {
            b9Var2.setText(org.telegram.messenger.i0.G2(org.telegram.messenger.i0.T2(org.telegram.messenger.cd.L0(2131745369, null), new mg0(this, 27)), true));
            return;
        }
        int i14 = premiumPreviewFragment.D;
        if (i10 == i14 && premiumPreviewFragment.g0 == 1) {
            b9Var2.setText(org.telegram.messenger.cd.L0(2131747008, null));
            return;
        }
        if (i10 != i14 || (tL_help_premiumPromo = premiumPreviewFragment.getMediaDataController().D) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(tL_help_premiumPromo.status_text);
        org.telegram.messenger.ui.g(tL_help_premiumPromo.status_entities, tL_help_premiumPromo.status_text, spannableString, -1);
        org.telegram.ui.Components.zz0[] zz0VarArr = (org.telegram.ui.Components.zz0[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.zz0.class);
        int length = zz0VarArr.length;
        int i15 = 0;
        while (i15 < length) {
            org.telegram.ui.Components.yz0 yz0Var = zz0VarArr[i15].b;
            TLRPC.MessageEntity messageEntity = yz0Var.d;
            if (messageEntity != null) {
                String str3 = tL_help_premiumPromo.status_text;
                int i16 = messageEntity.offset;
                str = TextUtils.substring(str3, i16, messageEntity.length + i16);
            } else {
                str = str2;
            }
            TLRPC.MessageEntity messageEntity2 = yz0Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.b51(str, 0, yz0Var), yz0Var.b, yz0Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    i11 = i15;
                    spannableString.setSpan(new org.telegram.ui.Components.e51(str, yz0Var), yz0Var.b, yz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.g51(sc.e.h("mailto:", str), yz0Var), yz0Var.b, yz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.c51(str, yz0Var), yz0Var.b, yz0Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.c51("http://".concat(str), yz0Var), yz0Var.b, yz0Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.e51(sc.e.h("card:", str), yz0Var), yz0Var.b, yz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = af.b.d(str, z12);
                    if (str.startsWith("+")) {
                        d = sc.e.h("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.c51(sc.e.h("tel:", d), yz0Var), yz0Var.b, yz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.g51 g51Var = new org.telegram.ui.Components.g51(yz0Var.d.url, yz0Var);
                    g51Var.b = r6;
                    spannableString.setSpan(g51Var, yz0Var.b, yz0Var.c, 33);
                    if (!z11) {
                        spannableString.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), yz0Var.b, yz0Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                    spannableString.setSpan(new org.telegram.ui.Components.h51("" + ((TLRPC.TL_messageEntityMentionName) yz0Var.d).user_id, 0, yz0Var), yz0Var.b, yz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                    spannableString.setSpan(new org.telegram.ui.Components.h51("" + ((TLRPC.TL_inputMessageEntityMentionName) yz0Var.d).user_id.user_id, 0, yz0Var), yz0Var.b, yz0Var.c, 33);
                } else if ((yz0Var.a & 4) != 0) {
                    i11 = i15;
                    spannableString.setSpan(new org.telegram.ui.Components.d51(spannableString, yz0Var.b, yz0Var.c, (byte) 0, yz0Var), yz0Var.b, yz0Var.c, 33);
                } else {
                    i11 = i15;
                    spannableString.setSpan(new org.telegram.ui.Components.zz0(yz0Var, 0), yz0Var.b, yz0Var.c, 33);
                    z10 = false;
                    int i17 = i11 + 1;
                    z12 = z10;
                    str2 = null;
                    i15 = i17;
                    r6 = true;
                }
                if ((yz0Var.a & 256) != 0) {
                    z10 = false;
                    spannableString.setSpan(new org.telegram.ui.Components.zz0(yz0Var, 0), yz0Var.b, yz0Var.c, 33);
                    int i172 = i11 + 1;
                    z12 = z10;
                    str2 = null;
                    i15 = i172;
                    r6 = true;
                }
                z10 = false;
                int i1722 = i11 + 1;
                z12 = z10;
                str2 = null;
                i15 = i1722;
                r6 = true;
            }
            i11 = i15;
            if ((yz0Var.a & 256) != 0) {
            }
            z10 = false;
            int i17222 = i11 + 1;
            z12 = z10;
            str2 = null;
            i15 = i17222;
            r6 = true;
        }
        b9Var2.setText(spannableString);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View u1Var;
        org.telegram.ui.ActionBar.p6 p6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                u1Var = new kg.u1(this, context);
                break;
            case 2:
                u1Var = new org.telegram.ui.Cells.c7(context, 0, 0);
                break;
            case 3:
            default:
                u1Var = new do0(this, context, 2);
                u1Var.setTag(-33024);
                break;
            case 4:
                u1Var = new jg.z2(context);
                break;
            case 5:
                u1Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 6:
                u1Var = new View(context);
                u1Var.setTag(-33024);
                break;
            case 7:
                u1Var = new org.telegram.ui.Cells.p4(context);
                break;
            case 8:
                p6Var = ((org.telegram.ui.ActionBar.k2) this.c).resourceProvider;
                u1Var = new org.telegram.ui.Cells.p8(23, context, p6Var, false, true);
                break;
        }
        return sc.e.o(u1Var, u1Var, -1, -2);
    }
}
