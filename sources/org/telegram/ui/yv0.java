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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yv0 extends org.telegram.ui.Components.vk0 {
    public final /* synthetic */ PremiumPreviewFragment c;

    public yv0(PremiumPreviewFragment premiumPreviewFragment) {
        this.c = premiumPreviewFragment;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return i9 == 1 || i9 == 8;
    }

    @Override // f2.r0
    public final int h() {
        return this.c.h;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == 0) {
            return 0;
        }
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        if (i9 >= premiumPreviewFragment.n && i9 < premiumPreviewFragment.r) {
            return 1;
        }
        if (i9 >= premiumPreviewFragment.v && i9 < premiumPreviewFragment.w) {
            return 1;
        }
        if (i9 == 0) {
            return 4;
        }
        if (i9 == premiumPreviewFragment.x || i9 == premiumPreviewFragment.y || i9 == premiumPreviewFragment.A || i9 == premiumPreviewFragment.D) {
            return 5;
        }
        if (i9 == premiumPreviewFragment.B) {
            return 6;
        }
        if (i9 == premiumPreviewFragment.s || i9 == premiumPreviewFragment.C) {
            return 7;
        }
        return i9 == premiumPreviewFragment.showAdsRow ? 8 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x02be  */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        TLRPC.TL_help_premiumPromo premiumPromo;
        String str;
        String str2;
        int i10;
        View view = q1Var.a;
        PremiumPreviewFragment premiumPreviewFragment = this.c;
        boolean z10 = premiumPreviewFragment.d0;
        int i11 = premiumPreviewFragment.n;
        boolean z11 = false;
        if (i9 >= i11 && i9 < premiumPreviewFragment.r) {
            ((qv0) view).a((gw0) premiumPreviewFragment.b.get(i9 - i11), i9 != premiumPreviewFragment.r - 1);
            return;
        }
        int i12 = premiumPreviewFragment.v;
        if (i9 >= i12 && i9 < premiumPreviewFragment.w) {
            ((qv0) view).a((gw0) premiumPreviewFragment.c.get(i9 - i12), i9 != premiumPreviewFragment.w - 1);
            return;
        }
        String str3 = "";
        if (i9 == premiumPreviewFragment.x) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            b9Var.setText("");
            b9Var.setFixedSize(12);
            return;
        }
        if (i9 != premiumPreviewFragment.y && i9 != premiumPreviewFragment.A && i9 != premiumPreviewFragment.D) {
            if (i9 == premiumPreviewFragment.s) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeatures));
                return;
            }
            if (i9 == premiumPreviewFragment.C) {
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.ShowAdsTitle));
                return;
            }
            if (i9 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                String string = LocaleController.getString(R.string.ShowAds);
                if (userFull != null && !userFull.sponsored_enabled) {
                    r6 = false;
                }
                p8Var.j(string, r6, false);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.b9 b9Var2 = (org.telegram.ui.Cells.b9) view;
        if (!z10) {
            b9Var2.setTextColor(org.telegram.ui.ActionBar.f6.l1(0.75f, -1));
            b9Var2.getTextView().setLinkTextColor(-1);
            b9Var2.setLinkTextRippleColor(Integer.valueOf(org.telegram.ui.ActionBar.f6.l1(0.15f, -1)));
        }
        b9Var2.setFixedSize(0);
        if (i9 == premiumPreviewFragment.D) {
            b9Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ShowAdsInfo), new zk0(this, 24)), true));
            return;
        }
        int i13 = premiumPreviewFragment.y;
        if (i9 == i13 && premiumPreviewFragment.c0 == 1) {
            b9Var2.setText(LocaleController.getString(R.string.PremiumPreviewMoreBusinessFeaturesInfo));
            return;
        }
        if (i9 != i13 || (premiumPromo = premiumPreviewFragment.getMediaDataController().getPremiumPromo()) == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(premiumPromo.status_text);
        MediaDataController.addTextStyleRuns(premiumPromo.status_entities, premiumPromo.status_text, spannableString);
        org.telegram.ui.Components.wz0[] wz0VarArr = (org.telegram.ui.Components.wz0[]) spannableString.getSpans(0, spannableString.length(), org.telegram.ui.Components.wz0.class);
        int length = wz0VarArr.length;
        int i14 = 0;
        while (i14 < length) {
            org.telegram.ui.Components.vz0 vz0Var = wz0VarArr[i14].b;
            TLRPC.MessageEntity messageEntity = vz0Var.d;
            if (messageEntity != null) {
                String str4 = premiumPromo.status_text;
                int i15 = messageEntity.offset;
                str = TextUtils.substring(str4, i15, messageEntity.length + i15);
            } else {
                str = null;
            }
            TLRPC.MessageEntity messageEntity2 = vz0Var.d;
            if (messageEntity2 instanceof TLRPC.TL_messageEntityBotCommand) {
                spannableString.setSpan(new org.telegram.ui.Components.m41(str, 0, vz0Var), vz0Var.b, vz0Var.c, 33);
            } else {
                if ((messageEntity2 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity2 instanceof TLRPC.TL_messageEntityMention) || (messageEntity2 instanceof TLRPC.TL_messageEntityCashtag)) {
                    str2 = str3;
                    i10 = 33;
                    spannableString.setSpan(new org.telegram.ui.Components.p41(str, vz0Var), vz0Var.b, vz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityEmail) {
                    spannableString.setSpan(new org.telegram.ui.Components.r41(ta.b.d("mailto:", str), vz0Var), vz0Var.b, vz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityUrl) {
                    if (str.toLowerCase().contains("://")) {
                        spannableString.setSpan(new org.telegram.ui.Components.n41(str, vz0Var), vz0Var.b, vz0Var.c, 33);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.n41("http://".concat(str), vz0Var), vz0Var.b, vz0Var.c, 33);
                    }
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityBankCard) {
                    spannableString.setSpan(new org.telegram.ui.Components.p41(ta.b.d("card:", str), vz0Var), vz0Var.b, vz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityPhone) {
                    String d = ne.b.d(str, z11);
                    if (str.startsWith("+")) {
                        d = ta.b.d("+", d);
                    }
                    spannableString.setSpan(new org.telegram.ui.Components.n41(ta.b.d("tel:", d), vz0Var), vz0Var.b, vz0Var.c, 33);
                } else if (messageEntity2 instanceof TLRPC.TL_messageEntityTextUrl) {
                    org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(vz0Var.d.url, vz0Var);
                    r41Var.b = true;
                    spannableString.setSpan(r41Var, vz0Var.b, vz0Var.c, 33);
                    if (!z10) {
                        spannableString.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), vz0Var.b, vz0Var.c, 33);
                    }
                } else {
                    if (messageEntity2 instanceof TLRPC.TL_messageEntityMentionName) {
                        StringBuilder sb2 = new StringBuilder(str3);
                        str2 = str3;
                        sb2.append(((TLRPC.TL_messageEntityMentionName) vz0Var.d).user_id);
                        spannableString.setSpan(new org.telegram.ui.Components.s41(sb2.toString(), 0, vz0Var), vz0Var.b, vz0Var.c, 33);
                    } else {
                        str2 = str3;
                        if (messageEntity2 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                            spannableString.setSpan(new org.telegram.ui.Components.s41(str2 + ((TLRPC.TL_inputMessageEntityMentionName) vz0Var.d).user_id.user_id, 0, vz0Var), vz0Var.b, vz0Var.c, 33);
                        } else if ((vz0Var.a & 4) != 0) {
                            str2 = str2;
                            i10 = 33;
                            spannableString.setSpan(new org.telegram.ui.Components.o41(spannableString, vz0Var.b, vz0Var.c, (byte) 0, vz0Var), vz0Var.b, vz0Var.c, 33);
                        } else {
                            str2 = str2;
                            spannableString.setSpan(new org.telegram.ui.Components.wz0(vz0Var, 0), vz0Var.b, vz0Var.c, 33);
                            i14++;
                            str3 = str2;
                            z11 = false;
                        }
                    }
                    i10 = 33;
                }
                if ((vz0Var.a & 256) != 0) {
                    spannableString.setSpan(new org.telegram.ui.Components.wz0(vz0Var, 0), vz0Var.b, vz0Var.c, i10);
                    i14++;
                    str3 = str2;
                    z11 = false;
                }
                i14++;
                str3 = str2;
                z11 = false;
            }
            str2 = str3;
            i10 = 33;
            if ((vz0Var.a & 256) != 0) {
            }
            i14++;
            str3 = str2;
            z11 = false;
        }
        b9Var2.setText(spannableString);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View xv0Var;
        org.telegram.ui.ActionBar.b6 b6Var;
        Context context = viewGroup.getContext();
        switch (i9) {
            case 1:
                xv0Var = new xv0(this, context);
                break;
            case 2:
                xv0Var = new org.telegram.ui.Cells.z6(context, 0, 0);
                break;
            case 3:
            default:
                xv0Var = new yi0(this, context, 4);
                xv0Var.setTag(-33024);
                break;
            case 4:
                xv0Var = new zf.a(context);
                break;
            case 5:
                xv0Var = new org.telegram.ui.Cells.b9(context);
                break;
            case 6:
                xv0Var = new View(context);
                xv0Var.setTag(-33024);
                break;
            case 7:
                xv0Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 8:
                b6Var = ((org.telegram.ui.ActionBar.o2) this.c).resourceProvider;
                xv0Var = new org.telegram.ui.Cells.p8(23, context, b6Var, false, true);
                break;
        }
        return j3.r0.s(xv0Var, xv0Var, -1, -2);
    }
}
