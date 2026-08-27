package org.telegram.ui;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class uw0 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ PrivacyControlActivity d;

    public uw0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int b10 = o1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.X) {
            i16 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).currentAccount;
            if (!ContactsController.getInstance(i16).getLoadingPrivacyInfo(3)) {
                return true;
            }
        }
        i10 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 == i10 || b10 == privacyControlActivity.V) {
            return true;
        }
        i11 = privacyControlActivity.photoForRestRow;
        if (b10 == i11) {
            return true;
        }
        i12 = privacyControlActivity.readRow;
        if (b10 == i12) {
            return true;
        }
        i13 = privacyControlActivity.showGiftIconRow;
        if (b10 == i13 || b10 == privacyControlActivity.a0 || b10 == privacyControlActivity.j0 || b10 == privacyControlActivity.k0 || b10 == privacyControlActivity.l0 || b10 == privacyControlActivity.i0 || b10 == privacyControlActivity.h0) {
            return true;
        }
        if (privacyControlActivity.x == 12 && privacyControlActivity.u0()) {
            return false;
        }
        i14 = privacyControlActivity.nobodyRow;
        if (b10 == i14 || b10 == privacyControlActivity.K || b10 == privacyControlActivity.c0) {
            return true;
        }
        i15 = privacyControlActivity.everybodyRow;
        return b10 == i15 || b10 == privacyControlActivity.P || b10 == privacyControlActivity.O;
    }

    public final int E(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long longValue = ((Long) arrayList.get(i11)).longValue();
            if (longValue > 0) {
                i10++;
            } else {
                TLRPC.Chat chat = this.d.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    i10 += chat.participants_count;
                }
            }
        }
        return i10;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.n0;
    }

    @Override // f2.q0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i10 == privacyControlActivity.O || i10 == privacyControlActivity.P || i10 == privacyControlActivity.X || i10 == privacyControlActivity.a0) {
            return 0;
        }
        if (i10 == privacyControlActivity.Q || i10 == privacyControlActivity.L || i10 == privacyControlActivity.M || i10 == privacyControlActivity.f0 || i10 == privacyControlActivity.Y || i10 == privacyControlActivity.V || i10 == privacyControlActivity.Z || i10 == privacyControlActivity.b0) {
            return 1;
        }
        i11 = privacyControlActivity.setBirthdayRow;
        if (i10 == i11 || i10 == privacyControlActivity.g0 || i10 == privacyControlActivity.m0) {
            return 1;
        }
        if (i10 == privacyControlActivity.J || i10 == privacyControlActivity.d0 || i10 == privacyControlActivity.N || i10 == privacyControlActivity.W || i10 == privacyControlActivity.R) {
            return 2;
        }
        i12 = privacyControlActivity.giftTypesHeaderRow;
        if (i10 == i12) {
            return 2;
        }
        i13 = privacyControlActivity.everybodyRow;
        if (i10 == i13 || i10 == privacyControlActivity.K) {
            return 3;
        }
        i14 = privacyControlActivity.nobodyRow;
        if (i10 == i14 || i10 == privacyControlActivity.c0 || i10 == privacyControlActivity.S || i10 == privacyControlActivity.T) {
            return 3;
        }
        if (i10 == privacyControlActivity.I) {
            return 4;
        }
        if (i10 == privacyControlActivity.U) {
            return 5;
        }
        i15 = privacyControlActivity.photoForRestRow;
        if (i10 == i15) {
            return 6;
        }
        i16 = privacyControlActivity.currentPhotoForRestRow;
        if (i10 == i16) {
            return 7;
        }
        i17 = privacyControlActivity.readRow;
        if (i10 == i17) {
            return 8;
        }
        i18 = privacyControlActivity.showGiftIconRow;
        if (i10 == i18 || i10 == privacyControlActivity.j0 || i10 == privacyControlActivity.k0 || i10 == privacyControlActivity.l0 || i10 == privacyControlActivity.h0 || i10 == privacyControlActivity.i0) {
            return 8;
        }
        i19 = privacyControlActivity.priceRow;
        if (i10 == i19) {
            return 9;
        }
        return i10 == privacyControlActivity.e0 ? 10 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        PrivacyControlActivity privacyControlActivity = this.d;
        boolean[] zArr = privacyControlActivity.A;
        int i23 = privacyControlActivity.x;
        int i24 = o1Var.f;
        View view = o1Var.a;
        int i25 = 9;
        final int i26 = 1;
        r8 = 0;
        int i27 = 0;
        r8 = 0;
        int i28 = 0;
        r8 = 0;
        int i29 = 0;
        r8 = 0;
        int i30 = 0;
        r8 = 0;
        int i31 = 0;
        if (i24 == 0) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            x9Var.setTextColor(privacyControlActivity.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
            if (i10 == privacyControlActivity.O) {
                String formatPluralString = privacyControlActivity.C.size() != 0 ? LocaleController.formatPluralString("Users", E(privacyControlActivity.C), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
                if (privacyControlActivity.y[privacyControlActivity.E == 2 ? (char) 0 : (char) 1]) {
                    ArrayList arrayList = privacyControlActivity.C;
                    formatPluralString = (arrayList == null || arrayList.isEmpty()) ? LocaleController.formatString(R.string.PrivacyPremium, new Object[0]) : LocaleController.formatString(R.string.PrivacyPremiumAnd, formatPluralString);
                }
                if (i23 != 10) {
                    int i32 = privacyControlActivity.E;
                    if (zArr[i32] && i32 != 0) {
                        ArrayList arrayList2 = privacyControlActivity.C;
                        formatPluralString = (arrayList2 == null || arrayList2.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, formatPluralString);
                    }
                }
                if (i23 == 10) {
                    x9Var.c(LocaleController.getString(R.string.PrivateMessagesExceptions), formatPluralString, false, false);
                } else if (i23 == 0 || i23 == 4 || i23 == 9 || i23 == 14) {
                    x9Var.c(LocaleController.getString(R.string.AlwaysShareWith), formatPluralString, false, privacyControlActivity.P != -1);
                } else {
                    x9Var.c(LocaleController.getString(R.string.AlwaysAllow), formatPluralString, false, privacyControlActivity.P != -1);
                }
                if (i23 == 12) {
                    x9Var.setEnabled(!privacyControlActivity.u0());
                    return;
                }
                return;
            }
            if (i10 != privacyControlActivity.P) {
                if (i10 == privacyControlActivity.X) {
                    i11 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).currentAccount;
                    x9Var.c(LocaleController.getString(R.string.PrivacyP2P2), ContactsController.getInstance(i11).getLoadingPrivacyInfo(3) ? LocaleController.getString(R.string.Loading) : PrivacySettingsActivity.x0(3, privacyControlActivity.getAccountInstance()), false, false);
                    return;
                } else {
                    if (i10 == privacyControlActivity.a0) {
                        x9Var.b(LocaleController.getString(privacyControlActivity.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumForPremium : R.string.PrivacyLastSeenPremium), false);
                        x9Var.setTextColor(privacyControlActivity.getThemedColor(org.telegram.ui.ActionBar.g6.n6));
                        return;
                    }
                    return;
                }
            }
            String formatPluralString2 = privacyControlActivity.D.size() != 0 ? LocaleController.formatPluralString("Users", E(privacyControlActivity.D), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
            int i33 = privacyControlActivity.E;
            if (zArr[i33] && i33 == 0) {
                ArrayList arrayList3 = privacyControlActivity.D;
                formatPluralString2 = (arrayList3 == null || arrayList3.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, formatPluralString2);
            }
            if (i23 == 0 || i23 == 4 || i23 == 9 || i23 == 14) {
                x9Var.c(LocaleController.getString(R.string.NeverShareWith), formatPluralString2, false, false);
            } else {
                x9Var.c(LocaleController.getString(R.string.NeverAllow), formatPluralString2, false, false);
            }
            if (i23 == 12) {
                x9Var.setEnabled(!privacyControlActivity.u0());
                return;
            }
            return;
        }
        if (i24 == 1) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == privacyControlActivity.M) {
                x8Var.setText(LocaleController.getString(R.string.PrivateMessagesChargePriceInfo));
            } else {
                int i34 = privacyControlActivity.L;
                if (i10 == i34 && i23 == 10) {
                    String string = LocaleController.getString(R.string.PrivacyMessagesInfo);
                    final int i35 = r8 ? 1 : 0;
                    x8Var.setText(AndroidUtilities.replaceSingleTag(string, new Runnable(this) { // from class: org.telegram.ui.rw0
                        public final /* synthetic */ uw0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i35) {
                                case 0:
                                    this.b.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                    break;
                                default:
                                    uw0 uw0Var = this.b;
                                    PrivacyControlActivity privacyControlActivity2 = uw0Var.d;
                                    privacyControlActivity2.showDialog(org.telegram.ui.Components.y4.m(privacyControlActivity2.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new sw0(uw0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).a);
                                    break;
                            }
                        }
                    }));
                } else if (i10 == i34 && i23 == 8) {
                    x8Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo));
                } else {
                    i12 = privacyControlActivity.setBirthdayRow;
                    if (i10 == i12) {
                        x8Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PrivacyBirthdaySet), new Runnable(this) { // from class: org.telegram.ui.rw0
                            public final /* synthetic */ uw0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i26) {
                                    case 0:
                                        this.b.d.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                                        break;
                                    default:
                                        uw0 uw0Var = this.b;
                                        PrivacyControlActivity privacyControlActivity2 = uw0Var.d;
                                        privacyControlActivity2.showDialog(org.telegram.ui.Components.y4.m(privacyControlActivity2.getParentActivity(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new sw0(uw0Var, 1), null, false, false, privacyControlActivity2.getResourceProvider()).a);
                                        break;
                                }
                            }
                        }), true));
                    } else if (i10 == privacyControlActivity.L) {
                        if (i23 == 6) {
                            if (privacyControlActivity.E == 1 && privacyControlActivity.F == 1) {
                                x8Var.setText(LocaleController.getString(R.string.PrivacyPhoneInfo3));
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Locale locale = Locale.ENGLISH;
                                String e9 = s3.c.e("https://t.me/+", privacyControlActivity.getUserConfig().getClientPhone());
                                SpannableString spannableString = new SpannableString(e9);
                                spannableString.setSpan(new tw0(this, e9), 0, e9.length(), 33);
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo)).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo4)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                x8Var.setText(spannableStringBuilder);
                            }
                        } else if (i23 == 5) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyForwardsInfo));
                        } else if (i23 == 4) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo));
                        } else if (i23 == 9) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyBioInfo3));
                        } else if (i23 == 14) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyMusicInfo3));
                        } else if (i23 == 11) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo));
                        } else if (i23 == 12) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyGiftsInfo));
                        } else if (i23 == 3) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyCallsP2PHelp));
                        } else if (i23 == 2) {
                            x8Var.setText(LocaleController.getString(R.string.WhoCanCallMeInfo));
                        } else if (i23 == 1) {
                            x8Var.setText(LocaleController.getString(R.string.WhoCanAddMeInfo));
                        } else {
                            x8Var.setText(LocaleController.getString(R.string.CustomHelp));
                        }
                    } else if (i10 == privacyControlActivity.Q) {
                        if (i23 == 6) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyPhoneInfo2));
                        } else if (i23 == 5) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyForwardsInfo2));
                        } else if (i23 == 4) {
                            int i36 = privacyControlActivity.E;
                            if (i36 == 2) {
                                x8Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo5)));
                            } else if (i36 == 0) {
                                x8Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo3)));
                            } else {
                                x8Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo4));
                            }
                        } else if (i23 == 3) {
                            x8Var.setText(LocaleController.getString(R.string.CustomP2PInfo));
                        } else if (i23 == 9) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyBioInfo));
                        } else if (i23 == 14) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyMusicInfo));
                        } else if (i23 == 11) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo3));
                        } else if (i23 == 2) {
                            x8Var.setText(LocaleController.getString(R.string.CustomCallInfo));
                        } else if (i23 == 1) {
                            x8Var.setText(LocaleController.getString(R.string.CustomShareInfo));
                        } else if (i23 == 12) {
                            x8Var.setText(LocaleController.getString(R.string.CustomShareGiftsInfo));
                        } else if (i23 == 8) {
                            x8Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo2));
                        } else if (i23 == 10) {
                            x8Var.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsInfo));
                        } else {
                            x8Var.setText(LocaleController.getString(R.string.CustomShareSettingsHelp));
                        }
                    } else if (i10 == privacyControlActivity.V) {
                        x8Var.setText(LocaleController.getString(R.string.PhotoForRestDescription));
                    } else if (i10 == privacyControlActivity.Z) {
                        x8Var.setText(LocaleController.getString(R.string.HideReadTimeInfo));
                    } else if (i10 == privacyControlActivity.b0) {
                        x8Var.setText(LocaleController.getString(privacyControlActivity.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumInfoForPremium : R.string.PrivacyLastSeenPremiumInfo));
                    } else if (i10 == privacyControlActivity.f0) {
                        x8Var.setText(LocaleController.formatString(R.string.PrivateMessagesPriceInfo, nh.k.G0(privacyControlActivity.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((privacyControlActivity.H * (privacyControlActivity.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * privacyControlActivity.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                    } else if (i10 == privacyControlActivity.g0) {
                        SpannableString spannableString2 = new SpannableString(ImageLoader.AUTOPLAY_FILTER);
                        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.msg_input_gift, 0);
                        cqVar.setScale(0.583f, 0.583f);
                        spannableString2.setSpan(cqVar, 0, 1, 33);
                        x8Var.setText(LocaleController.formatSpannable(R.string.PrivacyGiftsShowIconInfo, spannableString2));
                    } else if (i10 == privacyControlActivity.m0) {
                        x8Var.setText(LocaleController.getString(R.string.PrivacyGiftsTypeInfo));
                    }
                }
            }
            x8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.a7, false));
            return;
        }
        if (i24 == 2) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 != privacyControlActivity.J) {
                if (i10 == privacyControlActivity.N) {
                    if (i23 == 10) {
                        j4Var.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsHeader));
                        return;
                    } else {
                        j4Var.setText(LocaleController.getString(R.string.AddExceptions));
                        return;
                    }
                }
                if (i10 == privacyControlActivity.W) {
                    j4Var.setText(LocaleController.getString(R.string.PrivacyP2PHeader));
                    return;
                }
                if (i10 == privacyControlActivity.R) {
                    j4Var.setText(LocaleController.getString(R.string.PrivacyPhoneTitle2));
                    return;
                }
                if (i10 == privacyControlActivity.d0) {
                    j4Var.setText(LocaleController.getString(R.string.PrivateMessagesPriceHeader));
                    return;
                }
                i13 = privacyControlActivity.giftTypesHeaderRow;
                if (i10 == i13) {
                    j4Var.setText(LocaleController.getString(R.string.PrivacyGiftsTypeHeader));
                    return;
                }
                return;
            }
            if (i23 == 6) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyPhoneTitle));
                return;
            }
            if (i23 == 5) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyForwardsTitle));
                return;
            }
            if (i23 == 4) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoTitle));
                return;
            }
            if (i23 == 9) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyBioTitle));
                return;
            }
            if (i23 == 14) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyMusicTitle));
                return;
            }
            if (i23 == 3) {
                j4Var.setText(LocaleController.getString(R.string.P2PEnabledWith));
                return;
            }
            if (i23 == 2) {
                j4Var.setText(LocaleController.getString(R.string.WhoCanCallMe));
                return;
            }
            if (i23 == 1) {
                j4Var.setText(LocaleController.getString(R.string.WhoCanAddMe));
                return;
            }
            if (i23 == 8) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesTitle));
                return;
            }
            if (i23 == 10) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyMessagesTitle));
                return;
            }
            if (i23 == 11) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyBirthdayTitle));
                return;
            } else if (i23 == 12) {
                j4Var.setText(LocaleController.getString(R.string.PrivacyGiftsTitle));
                return;
            } else {
                j4Var.setText(LocaleController.getString(R.string.LastSeenTitle));
                return;
            }
        }
        if (i24 != 3) {
            if (i24 != 8) {
                if (i24 != 9) {
                    return;
                }
                org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
                i22 = privacyControlActivity.priceRow;
                if (i10 == i22) {
                    int[] a2 = org.telegram.ui.Cells.u7.a((int) privacyControlActivity.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    dl0 dl0Var = new dl0(this, i25);
                    org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7();
                    t7Var.c = a2;
                    t7Var.d = 20;
                    t7Var.e = dl0Var;
                    u7Var.d((int) Utilities.clamp(privacyControlActivity.H, privacyControlActivity.getMessagesController().starsPaidMessageAmountMax, 1L), t7Var, new sw0(this, r8 ? 1 : 0));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.setCheckBoxIcon(0);
            i20 = privacyControlActivity.readRow;
            if (i10 == i20) {
                p8Var.f(LocaleController.getString(R.string.HideReadTime), privacyControlActivity.x0, false);
                return;
            }
            i21 = privacyControlActivity.showGiftIconRow;
            if (i10 == i21) {
                p8Var.f(LocaleController.getString(R.string.PrivacyGiftsShowIcon), privacyControlActivity.z0, false);
                return;
            }
            if (i10 == privacyControlActivity.h0) {
                p8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeUnlimited), privacyControlActivity.B0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.B0) {
                    i27 = R.drawable.permission_locked;
                }
                p8Var.setCheckBoxIcon(i27);
                return;
            }
            if (i10 == privacyControlActivity.i0) {
                p8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeLimited), privacyControlActivity.D0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.D0) {
                    i28 = R.drawable.permission_locked;
                }
                p8Var.setCheckBoxIcon(i28);
                return;
            }
            if (i10 == privacyControlActivity.j0) {
                p8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeUnique), privacyControlActivity.F0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.F0) {
                    i29 = R.drawable.permission_locked;
                }
                p8Var.setCheckBoxIcon(i29);
                return;
            }
            if (i10 == privacyControlActivity.k0) {
                p8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeFromChannels), privacyControlActivity.H0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.H0) {
                    i30 = R.drawable.permission_locked;
                }
                p8Var.setCheckBoxIcon(i30);
                return;
            }
            if (i10 == privacyControlActivity.l0) {
                p8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypePremium), privacyControlActivity.J0, false);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.J0) {
                    i31 = R.drawable.permission_locked;
                }
                p8Var.setCheckBoxIcon(i31);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
        g6Var.setRadioIcon(null);
        i14 = privacyControlActivity.everybodyRow;
        if (i10 != i14 && i10 != privacyControlActivity.K) {
            i19 = privacyControlActivity.nobodyRow;
            if (i10 != i19 && i10 != privacyControlActivity.c0) {
                if (i10 == privacyControlActivity.T) {
                    g6Var.c(LocaleController.getString(R.string.LastSeenContacts), privacyControlActivity.F == 1, false);
                } else if (i10 == privacyControlActivity.S) {
                    g6Var.c(LocaleController.getString(R.string.LastSeenEverybody), privacyControlActivity.F == 0, true);
                }
                if (i23 != 12) {
                    g6Var.b(null, !privacyControlActivity.u0());
                    return;
                }
                return;
            }
        }
        i15 = privacyControlActivity.everybodyRow;
        if (i10 == i15) {
            if (i23 == 3) {
                g6Var.c(LocaleController.getString(R.string.P2PEverybody), privacyControlActivity.E == 0, true);
            } else {
                g6Var.c(LocaleController.getString(R.string.LastSeenEverybody), privacyControlActivity.E == 0, true);
            }
        } else if (i10 == privacyControlActivity.K) {
            if ((i23 == 8 && !privacyControlActivity.getUserConfig().isPremium()) || (i23 == 10 && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium())) {
                g6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i23 == 3) {
                String string2 = LocaleController.getString(R.string.P2PContacts);
                boolean z10 = privacyControlActivity.E == 2;
                i18 = privacyControlActivity.nobodyRow;
                g6Var.c(string2, z10, (i18 == -1 && privacyControlActivity.c0 == -1) ? false : true);
            } else if (i23 == 10) {
                String string3 = LocaleController.getString(R.string.PrivacyMessagesContactsAndPremium);
                boolean z11 = privacyControlActivity.E == 2;
                i17 = privacyControlActivity.nobodyRow;
                g6Var.c(string3, z11, (i17 == -1 && privacyControlActivity.c0 == -1) ? false : true);
            } else {
                String string4 = LocaleController.getString(R.string.LastSeenContacts);
                boolean z12 = privacyControlActivity.E == 2;
                i16 = privacyControlActivity.nobodyRow;
                g6Var.c(string4, z12, (i16 == -1 && privacyControlActivity.c0 == -1) ? false : true);
            }
        } else if (i10 == privacyControlActivity.c0) {
            if (i23 == 10 && !privacyControlActivity.getUserConfig().isPremium()) {
                g6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            g6Var.c(LocaleController.getString(R.string.PrivateMessagesChargePrice), privacyControlActivity.E == 3, false);
        } else {
            if ((i23 == 8 && !privacyControlActivity.getUserConfig().isPremium()) || (i23 == 10 && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium())) {
                g6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i23 == 3) {
                g6Var.c(LocaleController.getString(R.string.P2PNobody), privacyControlActivity.E == 1, false);
            } else {
                g6Var.c(LocaleController.getString(R.string.LastSeenNobody), privacyControlActivity.E == 1, false);
            }
        }
        if (i23 != 12) {
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        org.telegram.ui.ActionBar.c6 c6Var2;
        org.telegram.ui.ActionBar.c6 c6Var3;
        View view;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i10) {
            case 0:
                org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context);
                x9Var.setCanDisable(true);
                view = x9Var;
                break;
            case 1:
                view = new org.telegram.ui.Cells.x8(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.j4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.g6(context, null);
                break;
            case 4:
                view = privacyControlActivity.e;
                break;
            case 5:
            default:
                view = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            case 6:
                org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(privacyControlActivity.getParentActivity());
                privacyControlActivity.q0 = l8Var;
                if (privacyControlActivity.t0 == null) {
                    l8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), false);
                } else {
                    l8Var.m(R.drawable.msg_addphoto, LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), true);
                }
                privacyControlActivity.q0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                privacyControlActivity.q0.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                privacyControlActivity.p0 = new org.telegram.ui.Components.oi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                privacyControlActivity.q0.e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
                privacyControlActivity.q0.e.setAnimation(privacyControlActivity.p0);
                view = privacyControlActivity.q0;
                break;
            case 7:
                privacyControlActivity.r0 = new org.telegram.ui.Components.n9(privacyControlActivity.getParentActivity());
                privacyControlActivity.s0 = new hs(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.t0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.u0;
                    if (photo != null) {
                        org.telegram.ui.Components.n9 n9Var = privacyControlActivity.r0;
                        ImageLocation forPhoto = ImageLocation.getForPhoto(photoSize, photo);
                        i12 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).currentAccount;
                        n9Var.h(forPhoto, "50_50", null, UserConfig.getInstance(i12).getCurrentUser());
                    } else {
                        org.telegram.ui.Components.n9 n9Var2 = privacyControlActivity.r0;
                        ImageLocation forLocal = ImageLocation.getForLocal(photoSize.location);
                        i11 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).currentAccount;
                        n9Var2.h(forLocal, "50_50", null, UserConfig.getInstance(i11).getCurrentUser());
                    }
                }
                privacyControlActivity.s0.addView(privacyControlActivity.r0, h7.z5.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.s0.i(LocaleController.getString(R.string.RemovePublicPhoto), false);
                privacyControlActivity.s0.getImageView().setVisibility(0);
                privacyControlActivity.s0.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                hs hsVar = privacyControlActivity.s0;
                int i13 = org.telegram.ui.ActionBar.g6.p7;
                hsVar.e(i13, i13);
                view = privacyControlActivity.s0;
                break;
            case 8:
                c6Var = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.p8(context, c6Var);
                break;
            case 9:
                c6Var2 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.u7(context, c6Var2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                c6Var3 = ((org.telegram.ui.ActionBar.n2) privacyControlActivity).resourceProvider;
                lh.d dVar = new lh.d(context, c6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(cqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.g(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new u50(this, 25));
                frameLayout.addView(dVar, h7.z5.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new org.telegram.ui.Components.lk0(view);
    }
}
