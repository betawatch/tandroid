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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class ww0 extends org.telegram.ui.Components.yl0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public ww0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 1 || i10 == 8;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.h;
    }

    @Override // s4.h0
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
        if (i10 == premiumPreviewFragment.x || i10 == premiumPreviewFragment.y || i10 == premiumPreviewFragment.E || i10 == premiumPreviewFragment.H) {
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

    /* JADX WARN: Removed duplicated region for block: B:79:0x02be  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
        TLRPC.TL_help_premiumPromo premiumPromo;
        String str;
        String str2;
        int i11;
        View view = c1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z10 = premiumPreviewFragment.h0;
        int i12 = premiumPreviewFragment.n;
        boolean z11 = false;
        if (i10 >= i12 && i10 < premiumPreviewFragment.r) {
            ((ow0) view).a((ex0) premiumPreviewFragment.b.get(i10 - i12), i10 != premiumPreviewFragment.r - 1);
            return;
        }
        int i13 = premiumPreviewFragment.v;
        if (i10 >= i13 && i10 < premiumPreviewFragment.w) {
            ((ow0) view).a((ex0) premiumPreviewFragment.c.get(i10 - i13), i10 != premiumPreviewFragment.w - 1);
            return;
        }
        String str3 = "";
        if (i10 == premiumPreviewFragment.x) {
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            e9Var.setText("");
            e9Var.setFixedSize(12);
            return;
        }
        if (i10 != premiumPreviewFragment.y && i10 != premiumPreviewFragment.E && i10 != premiumPreviewFragment.H) {
            if (i10 == premiumPreviewFragment.s) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeatures));
                return;
            }
            if (i10 == premiumPreviewFragment.G) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.ShowAdsTitle));
                return;
            }
            if (i10 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                String string = LocaleController.getString(R.string.ShowAds);
                if (userFull != null && !userFull.sponsored_enabled) {
                    r6 = false;
                }
                r8Var.j(string, r6, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.e9 e9Var2 = (org.telegram.ui.Cells.e9) view;
        if (!z10) {
            e9Var2.setTextColor(org.telegram.ui.ActionBar.i6.l1(0.75f, -1));
            e9Var2.getTextView().setLinkTextColor(-1);
            e9Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.15f, -1)));
        }
        e9Var2.setFixedSize(0);
        if (i10 == premiumPreviewFragment.H) {
            e9Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ShowAdsInfo), new nl0(this, 24)), true));
            return;
        }
        int i14 = premiumPreviewFragment.y;
        if (i10 == i14 && premiumPreviewFragment.g0 == 1) {
            e9Var2.setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeaturesInfo));
            return;
        }
        if (i10 != i14 || (premiumPromo = premiumPreviewFragment.getMediaDataController().getPremiumPromo()) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(premiumPromo.status_text);
        MediaDataController.addTextStyleRuns(premiumPromo.status_entities, premiumPromo.status_text, spannableString);
        org.telegram.ui.Components.n11[] n11VarArr = (org.telegram.ui.Components.n11[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.n11.class);
        int length = n11VarArr.length;
        int i15 = 0;
        while (i15 < length) {
            org.telegram.ui.Components.m11 m11Var = n11VarArr[i15].b;
            TLRPC.MessageEntity messageEntity = m11Var.d;
            if (messageEntity != null) {
                String str4 = premiumPromo.status_text;
                int i16 = messageEntity.offset;
                str = TextUtils.substring(str4, i16, messageEntity.length + i16);
            } else {
                str = null;
            }
            TLRPC.MessageEntity messageEntity2 = m11Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.h61(str, 0, m11Var), m11Var.b, m11Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    str2 = str3;
                    i11 = 33;
                    spannableString.setSpan(new org.telegram.ui.Components.k61(str, m11Var), m11Var.b, m11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.m61(t8.b.i("mailto:", str), m11Var), m11Var.b, m11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.i61(str, m11Var), m11Var.b, m11Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.i61("http://".concat(str), m11Var), m11Var.b, m11Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.k61(t8.b.i("card:", str), m11Var), m11Var.b, m11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = gf.b.d(str, z11);
                    if (str.startsWith("+")) {
                        d = t8.b.i("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.i61(t8.b.i("tel:", d), m11Var), m11Var.b, m11Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.m61 m61Var = new org.telegram.ui.Components.m61(m11Var.d.url, m11Var);
                    m61Var.b = true;
                    spannableString.setSpan(m61Var, m11Var.b, m11Var.c, 33);
                    if (!z10) {
                        spannableString.setSpan(new org.telegram.ui.Components.d61(AndroidUtilities.bold()), m11Var.b, m11Var.c, 33);
                    }
                } else {
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                        StringBuilder sb2 = new StringBuilder(str3);
                        str2 = str3;
                        sb2.append(((TLRPC.TL_messageEntityMentionName) m11Var.d).user_id);
                        spannableString.setSpan(new org.telegram.ui.Components.n61(sb2.toString(), 0, m11Var), m11Var.b, m11Var.c, 33);
                    } else {
                        str2 = str3;
                        if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            spannableString.setSpan(new org.telegram.ui.Components.n61(str2 + ((TLRPC.TL_inputMessageEntityMentionName) m11Var.d).user_id.user_id, 0, m11Var), m11Var.b, m11Var.c, 33);
                        } else if ((m11Var.a & 4) != 0) {
                            str2 = str2;
                            i11 = 33;
                            spannableString.setSpan(new org.telegram.ui.Components.j61(spannableString, m11Var.b, m11Var.c, (byte) 0, m11Var), m11Var.b, m11Var.c, 33);
                        } else {
                            str2 = str2;
                            spannableString.setSpan(new org.telegram.ui.Components.n11(m11Var, 0), m11Var.b, m11Var.c, 33);
                            i15++;
                            str3 = str2;
                            z11 = false;
                        }
                    }
                    i11 = 33;
                }
                if ((m11Var.a & 256) != 0) {
                    spannableString.setSpan(new org.telegram.ui.Components.n11(m11Var, 0), m11Var.b, m11Var.c, i11);
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
            if ((m11Var.a & 256) != 0) {
            }
            i15++;
            str3 = str2;
            z11 = false;
        }
        e9Var2.setText(spannableString);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View vw0Var;
        org.telegram.ui.ActionBar.d6 d6Var;
        Context context = viewGroup.getContext();
        switch (i10) {
            case 1:
                vw0Var = new vw0(this, context);
                break;
            case 2:
                vw0Var = new org.telegram.ui.Cells.b7(context, 0, 0);
                break;
            case 3:
            default:
                vw0Var = new n20(this, context, 6);
                vw0Var.setTag(-33024);
                break;
            case 4:
                vw0Var = new rg.a(context);
                break;
            case 5:
                vw0Var = new org.telegram.ui.Cells.e9(context);
                break;
            case 6:
                vw0Var = new View(context);
                vw0Var.setTag(-33024);
                break;
            case 7:
                vw0Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                d6Var = ((org.telegram.ui.ActionBar.n2) this.c).resourceProvider;
                vw0Var = new org.telegram.ui.Cells.r8(23, context, d6Var, false, true);
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(vw0Var, vw0Var, -1, -2);
    }
}
