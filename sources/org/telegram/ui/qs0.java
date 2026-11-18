package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class qs0 extends org.telegram.ui.Components.bk0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public qs0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 1 || i7 == 8;
    }

    @Override // v4.i0
    public final int b() {
        return this.c.h;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 0;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        if (i7 >= premiumPreviewFragment.n && i7 < premiumPreviewFragment.r) {
            return 1;
        }
        if (i7 >= premiumPreviewFragment.w && i7 < premiumPreviewFragment.x) {
            return 1;
        }
        if (i7 == 0) {
            return 4;
        }
        if (i7 == premiumPreviewFragment.y || i7 == premiumPreviewFragment.E || i7 == premiumPreviewFragment.F || i7 == premiumPreviewFragment.I) {
            return 5;
        }
        if (i7 == premiumPreviewFragment.G) {
            return 6;
        }
        if (i7 == premiumPreviewFragment.s || i7 == premiumPreviewFragment.H) {
            return 7;
        }
        return i7 == premiumPreviewFragment.showAdsRow ? 8 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x02ac  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        String str;
        int i10;
        boolean z10;
        View view = f1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z11 = premiumPreviewFragment.i0;
        int i11 = premiumPreviewFragment.n;
        boolean z12 = false;
        if (i7 >= i11 && i7 < premiumPreviewFragment.r) {
            ((js0) view).a((ws0) premiumPreviewFragment.b.get(i7 - i11), i7 != premiumPreviewFragment.r - 1);
            return;
        }
        int i12 = premiumPreviewFragment.w;
        if (i7 >= i12 && i7 < premiumPreviewFragment.x) {
            ((js0) view).a((ws0) premiumPreviewFragment.c.get(i7 - i12), i7 != premiumPreviewFragment.x - 1);
            return;
        }
        if (i7 == premiumPreviewFragment.y) {
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setText("");
            a9Var.setFixedSize(12);
            return;
        }
        String str2 = null;
        if (i7 != premiumPreviewFragment.E && i7 != premiumPreviewFragment.F && i7 != premiumPreviewFragment.I) {
            if (i7 == premiumPreviewFragment.s) {
                ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.gd.M0(2131746801, null));
                return;
            }
            if (i7 == premiumPreviewFragment.H) {
                ((org.telegram.ui.Cells.o4) view).setText(org.telegram.messenger.gd.M0(2131745155, null));
                return;
            }
            if (i7 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull d2 = premiumPreviewFragment.getMessagesController().d2(premiumPreviewFragment.getUserConfig().e());
                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                String M0 = org.telegram.messenger.gd.M0(2131745157, null);
                if (d2 != null && !d2.sponsored_enabled) {
                    r6 = false;
                }
                n8Var.l(M0, r6, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view;
        if (!z11) {
            a9Var2.setTextColor(org.telegram.ui.ActionBar.n6.r1(0.75f, -1));
            a9Var2.getTextView().setLinkTextColor(-1);
            a9Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.15f, -1)));
        }
        a9Var2.setFixedSize(0);
        if (i7 == premiumPreviewFragment.I) {
            a9Var2.setText(org.telegram.messenger.g0.H2(org.telegram.messenger.g0.T2(org.telegram.messenger.gd.M0(2131745156, null), new if0(this, 27)), true));
            return;
        }
        int i13 = premiumPreviewFragment.E;
        if (i7 == i13 && premiumPreviewFragment.h0 == 1) {
            a9Var2.setText(org.telegram.messenger.gd.M0(2131746800, null));
            return;
        }
        if (i7 != i13 || (tL_help_premiumPromo = premiumPreviewFragment.getMediaDataController().E) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(tL_help_premiumPromo.status_text);
        org.telegram.messenger.ri.g(tL_help_premiumPromo.status_entities, tL_help_premiumPromo.status_text, spannableString, -1);
        org.telegram.ui.Components.ez0[] ez0VarArr = (org.telegram.ui.Components.ez0[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.ez0.class);
        int length = ez0VarArr.length;
        int i14 = 0;
        while (i14 < length) {
            org.telegram.ui.Components.dz0 dz0Var = ez0VarArr[i14].b;
            TLRPC.MessageEntity messageEntity = dz0Var.d;
            if (messageEntity != null) {
                String str3 = tL_help_premiumPromo.status_text;
                int i15 = messageEntity.offset;
                str = TextUtils.substring(str3, i15, messageEntity.length + i15);
            } else {
                str = str2;
            }
            TLRPC.MessageEntity messageEntity2 = dz0Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.m41(str, 0, dz0Var), dz0Var.b, dz0Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.p41(str, dz0Var), dz0Var.b, dz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.r41(p5.c.k("mailto:", str), dz0Var), dz0Var.b, dz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.n41(str, dz0Var), dz0Var.b, dz0Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.n41("http://".concat(str), dz0Var), dz0Var.b, dz0Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.p41(p5.c.k("card:", str), dz0Var), dz0Var.b, dz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = pf.b.d(str, z12);
                    if (str.startsWith("+")) {
                        d = p5.c.k("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.n41(p5.c.k("tel:", d), dz0Var), dz0Var.b, dz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(dz0Var.d.url, dz0Var);
                    r41Var.b = r6;
                    spannableString.setSpan(r41Var, dz0Var.b, dz0Var.c, 33);
                    if (!z11) {
                        spannableString.setSpan(new org.telegram.ui.Components.i41(org.telegram.messenger.g0.o()), dz0Var.b, dz0Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                    spannableString.setSpan(new org.telegram.ui.Components.s41("" + ((TLRPC.TL_messageEntityMentionName) dz0Var.d).user_id, 0, dz0Var), dz0Var.b, dz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                    spannableString.setSpan(new org.telegram.ui.Components.s41("" + ((TLRPC.TL_inputMessageEntityMentionName) dz0Var.d).user_id.user_id, 0, dz0Var), dz0Var.b, dz0Var.c, 33);
                } else if ((dz0Var.a & 4) != 0) {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.o41(spannableString, dz0Var.b, dz0Var.c, (byte) 0, dz0Var), dz0Var.b, dz0Var.c, 33);
                } else {
                    i10 = i14;
                    spannableString.setSpan(new org.telegram.ui.Components.ez0(dz0Var, 0), dz0Var.b, dz0Var.c, 33);
                    z10 = false;
                    int i16 = i10 + 1;
                    z12 = z10;
                    str2 = null;
                    i14 = i16;
                    r6 = true;
                }
                if ((dz0Var.a & 256) != 0) {
                    z10 = false;
                    spannableString.setSpan(new org.telegram.ui.Components.ez0(dz0Var, 0), dz0Var.b, dz0Var.c, 33);
                    int i162 = i10 + 1;
                    z12 = z10;
                    str2 = null;
                    i14 = i162;
                    r6 = true;
                }
                z10 = false;
                int i1622 = i10 + 1;
                z12 = z10;
                str2 = null;
                i14 = i1622;
                r6 = true;
            }
            i10 = i14;
            if ((dz0Var.a & 256) != 0) {
            }
            z10 = false;
            int i16222 = i10 + 1;
            z12 = z10;
            str2 = null;
            i14 = i16222;
            r6 = true;
        }
        a9Var2.setText(spannableString);
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View ps0Var;
        org.telegram.ui.ActionBar.i6 i6Var;
        Context context = viewGroup.getContext();
        switch (i7) {
            case 1:
                ps0Var = new ps0(this, context);
                break;
            case 2:
                ps0Var = new org.telegram.ui.Cells.z6(context, 0, 0);
                break;
            case 3:
            default:
                ps0Var = new uv(7, context, this);
                ps0Var.setTag(-33024);
                break;
            case 4:
                ps0Var = new ai.r2(context);
                break;
            case 5:
                ps0Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 6:
                ps0Var = new View(context);
                ps0Var.setTag(-33024);
                break;
            case 7:
                ps0Var = new org.telegram.ui.Cells.o4(context);
                break;
            case 8:
                i6Var = ((org.telegram.ui.ActionBar.h2) this.c).resourceProvider;
                ps0Var = new org.telegram.ui.Cells.n8(23, context, i6Var, false, true);
                break;
        }
        return i5.c.q(ps0Var, ps0Var, -1, -2);
    }
}
