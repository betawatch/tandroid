package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xv0 extends org.telegram.ui.Components.il0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public xv0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return i10 == 1 || i10 == 8;
    }

    @Override // f2.p0
    public final int h() {
        return this.c.h;
    }

    @Override // f2.p0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        if (i10 >= premiumPreviewFragment.n && i10 < premiumPreviewFragment.r) {
            return 1;
        }
        if (i10 >= premiumPreviewFragment.v && i10 < premiumPreviewFragment.w) {
            return 1;
        }
        if (i10 == 0) {
            return 4;
        }
        if (i10 == premiumPreviewFragment.x || i10 == premiumPreviewFragment.y || i10 == premiumPreviewFragment.A || i10 == premiumPreviewFragment.D) {
            return 5;
        }
        if (i10 == premiumPreviewFragment.B) {
            return 6;
        }
        if (i10 == premiumPreviewFragment.s || i10 == premiumPreviewFragment.C) {
            return 7;
        }
        return i10 == premiumPreviewFragment.showAdsRow ? 8 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x02be  */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.n1 n1Var, int i10) {
        TLRPC.TL_help_premiumPromo premiumPromo;
        String str;
        String str2;
        int i11;
        View view = n1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z10 = premiumPreviewFragment.d0;
        int i12 = premiumPreviewFragment.n;
        boolean z11 = false;
        if (i10 >= i12 && i10 < premiumPreviewFragment.r) {
            ((qv0) view).a((fw0) premiumPreviewFragment.b.get(i10 - i12), i10 != premiumPreviewFragment.r - 1);
            return;
        }
        int i13 = premiumPreviewFragment.v;
        if (i10 >= i13 && i10 < premiumPreviewFragment.w) {
            ((qv0) view).a((fw0) premiumPreviewFragment.c.get(i10 - i13), i10 != premiumPreviewFragment.w - 1);
            return;
        }
        String str3 = "";
        if (i10 == premiumPreviewFragment.x) {
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setText("");
            y8Var.setFixedSize(12);
            return;
        }
        if (i10 != premiumPreviewFragment.y && i10 != premiumPreviewFragment.A && i10 != premiumPreviewFragment.D) {
            if (i10 == premiumPreviewFragment.s) {
                ((org.telegram.ui.Cells.k4) view).setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeatures));
                return;
            }
            if (i10 == premiumPreviewFragment.C) {
                ((org.telegram.ui.Cells.k4) view).setText(LocaleController.getString(R.string.ShowAdsTitle));
                return;
            }
            if (i10 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                String string = LocaleController.getString(R.string.ShowAds);
                if (userFull != null && !userFull.sponsored_enabled) {
                    r6 = false;
                }
                m8Var.j(string, r6, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.y8 y8Var2 = (org.telegram.ui.Cells.y8) view;
        if (!z10) {
            y8Var2.setTextColor(org.telegram.ui.ActionBar.g6.l1(0.75f, -1));
            y8Var2.getTextView().setLinkTextColor(-1);
            y8Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.g6.l1(0.15f, -1)));
        }
        y8Var2.setFixedSize(0);
        if (i10 == premiumPreviewFragment.D) {
            y8Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ShowAdsInfo), new vk0(this, 24)), true));
            return;
        }
        int i14 = premiumPreviewFragment.y;
        if (i10 == i14 && premiumPreviewFragment.c0 == 1) {
            y8Var2.setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeaturesInfo));
            return;
        }
        if (i10 != i14 || (premiumPromo = premiumPreviewFragment.getMediaDataController().getPremiumPromo()) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(premiumPromo.status_text);
        MediaDataController.addTextStyleRuns(premiumPromo.status_entities, premiumPromo.status_text, spannableString);
        org.telegram.ui.Components.i01[] i01VarArr = (org.telegram.ui.Components.i01[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.i01.class);
        int length = i01VarArr.length;
        int i15 = 0;
        while (i15 < length) {
            org.telegram.ui.Components.h01 h01Var = i01VarArr[i15].b;
            TLRPC.MessageEntity messageEntity = h01Var.d;
            if (messageEntity != null) {
                String str4 = premiumPromo.status_text;
                int i16 = messageEntity.offset;
                str = TextUtils.substring(str4, i16, messageEntity.length + i16);
            } else {
                str = null;
            }
            TLRPC.MessageEntity messageEntity2 = h01Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.x41(str, 0, h01Var), h01Var.b, h01Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    str2 = str3;
                    i11 = 33;
                    spannableString.setSpan(new org.telegram.ui.Components.a51(str, h01Var), h01Var.b, h01Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.c51(u3.c.e("mailto:", str), h01Var), h01Var.b, h01Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.y41(str, h01Var), h01Var.b, h01Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.y41("http://".concat(str), h01Var), h01Var.b, h01Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.a51(u3.c.e("card:", str), h01Var), h01Var.b, h01Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = qe.b.d(str, z11);
                    if (str.startsWith("+")) {
                        d = u3.c.e("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.y41(u3.c.e("tel:", d), h01Var), h01Var.b, h01Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.c51 c51Var = new org.telegram.ui.Components.c51(h01Var.d.url, h01Var);
                    c51Var.b = true;
                    spannableString.setSpan(c51Var, h01Var.b, h01Var.c, 33);
                    if (!z10) {
                        spannableString.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), h01Var.b, h01Var.c, 33);
                    }
                } else {
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                        StringBuilder sb2 = new StringBuilder(str3);
                        str2 = str3;
                        sb2.append(((TLRPC.TL_messageEntityMentionName) h01Var.d).user_id);
                        spannableString.setSpan(new org.telegram.ui.Components.d51(sb2.toString(), 0, h01Var), h01Var.b, h01Var.c, 33);
                    } else {
                        str2 = str3;
                        if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            spannableString.setSpan(new org.telegram.ui.Components.d51(str2 + ((TLRPC.TL_inputMessageEntityMentionName) h01Var.d).user_id.user_id, 0, h01Var), h01Var.b, h01Var.c, 33);
                        } else if ((h01Var.a & 4) != 0) {
                            str2 = str2;
                            i11 = 33;
                            spannableString.setSpan(new org.telegram.ui.Components.z41(spannableString, h01Var.b, h01Var.c, (byte) 0, h01Var), h01Var.b, h01Var.c, 33);
                        } else {
                            str2 = str2;
                            spannableString.setSpan(new org.telegram.ui.Components.i01(h01Var, 0), h01Var.b, h01Var.c, 33);
                            i15++;
                            str3 = str2;
                            z11 = false;
                        }
                    }
                    i11 = 33;
                }
                if ((h01Var.a & 256) != 0) {
                    spannableString.setSpan(new org.telegram.ui.Components.i01(h01Var, 0), h01Var.b, h01Var.c, i11);
                    i15++;
                    str3 = str2;
                    z11 = false;
                }
                i15++;
                str3 = str2;
                z11 = false;
            }
            str2 = str3;
            i11 = 33;
            if ((h01Var.a & 256) != 0) {
            }
            i15++;
            str3 = str2;
            z11 = false;
        }
        y8Var2.setText(spannableString);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View d2Var;
        org.telegram.ui.ActionBar.c6 c6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                d2Var = new cg.d2(this, context);
                break;
            case 2:
                d2Var = new org.telegram.ui.Cells.x6(context, 0, 0);
                break;
            case 3:
            default:
                d2Var = new op0(this, context, 2);
                d2Var.setTag(-33024);
                break;
            case 4:
                d2Var = new cg.a(context);
                break;
            case 5:
                d2Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 6:
                d2Var = new View(context);
                d2Var.setTag(-33024);
                break;
            case 7:
                d2Var = new org.telegram.ui.Cells.k4(context);
                break;
            case 8:
                c6Var = ((org.telegram.ui.ActionBar.o2) this.c).resourceProvider;
                d2Var = new org.telegram.ui.Cells.m8(23, context, c6Var, false, true);
                break;
        }
        return th.m(d2Var, d2Var, -1, -2);
    }
}
