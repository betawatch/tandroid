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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class uw0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ PrivacyControlActivity d;

    public uw0(PrivacyControlActivity privacyControlActivity, Context context) {
        this.d = privacyControlActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int b10 = q1Var.b();
        PrivacyControlActivity privacyControlActivity = this.d;
        if (b10 == privacyControlActivity.X) {
            i15 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).currentAccount;
            if (!ContactsController.getInstance(i15).getLoadingPrivacyInfo(3)) {
                return true;
            }
        }
        i9 = privacyControlActivity.currentPhotoForRestRow;
        if (b10 == i9 || b10 == privacyControlActivity.V) {
            return true;
        }
        i10 = privacyControlActivity.photoForRestRow;
        if (b10 == i10) {
            return true;
        }
        i11 = privacyControlActivity.readRow;
        if (b10 == i11) {
            return true;
        }
        i12 = privacyControlActivity.showGiftIconRow;
        if (b10 == i12 || b10 == privacyControlActivity.a0 || b10 == privacyControlActivity.j0 || b10 == privacyControlActivity.k0 || b10 == privacyControlActivity.l0 || b10 == privacyControlActivity.i0 || b10 == privacyControlActivity.h0) {
            return true;
        }
        if (privacyControlActivity.x == 12 && privacyControlActivity.t0()) {
            return false;
        }
        i13 = privacyControlActivity.nobodyRow;
        if (b10 == i13 || b10 == privacyControlActivity.K || b10 == privacyControlActivity.c0) {
            return true;
        }
        i14 = privacyControlActivity.everybodyRow;
        return b10 == i14 || b10 == privacyControlActivity.P || b10 == privacyControlActivity.O;
    }

    public final int E(ArrayList arrayList) {
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long longValue = ((Long) arrayList.get(i10)).longValue();
            if (longValue > 0) {
                i9++;
            } else {
                TLRPC.Chat chat = this.d.getMessagesController().getChat(Long.valueOf(-longValue));
                if (chat != null) {
                    i9 += chat.participants_count;
                }
            }
        }
        return i9;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.n0;
    }

    @Override // f2.r0
    public final int j(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        PrivacyControlActivity privacyControlActivity = this.d;
        if (i9 == privacyControlActivity.O || i9 == privacyControlActivity.P || i9 == privacyControlActivity.X || i9 == privacyControlActivity.a0) {
            return 0;
        }
        if (i9 == privacyControlActivity.Q || i9 == privacyControlActivity.L || i9 == privacyControlActivity.M || i9 == privacyControlActivity.f0 || i9 == privacyControlActivity.Y || i9 == privacyControlActivity.V || i9 == privacyControlActivity.Z || i9 == privacyControlActivity.b0) {
            return 1;
        }
        i10 = privacyControlActivity.setBirthdayRow;
        if (i9 == i10 || i9 == privacyControlActivity.g0 || i9 == privacyControlActivity.m0) {
            return 1;
        }
        if (i9 == privacyControlActivity.J || i9 == privacyControlActivity.d0 || i9 == privacyControlActivity.N || i9 == privacyControlActivity.W || i9 == privacyControlActivity.R) {
            return 2;
        }
        i11 = privacyControlActivity.giftTypesHeaderRow;
        if (i9 == i11) {
            return 2;
        }
        i12 = privacyControlActivity.everybodyRow;
        if (i9 == i12 || i9 == privacyControlActivity.K) {
            return 3;
        }
        i13 = privacyControlActivity.nobodyRow;
        if (i9 == i13 || i9 == privacyControlActivity.c0 || i9 == privacyControlActivity.S || i9 == privacyControlActivity.T) {
            return 3;
        }
        if (i9 == privacyControlActivity.I) {
            return 4;
        }
        if (i9 == privacyControlActivity.U) {
            return 5;
        }
        i14 = privacyControlActivity.photoForRestRow;
        if (i9 == i14) {
            return 6;
        }
        i15 = privacyControlActivity.currentPhotoForRestRow;
        if (i9 == i15) {
            return 7;
        }
        i16 = privacyControlActivity.readRow;
        if (i9 == i16) {
            return 8;
        }
        i17 = privacyControlActivity.showGiftIconRow;
        if (i9 == i17 || i9 == privacyControlActivity.j0 || i9 == privacyControlActivity.k0 || i9 == privacyControlActivity.l0 || i9 == privacyControlActivity.h0 || i9 == privacyControlActivity.i0) {
            return 8;
        }
        i18 = privacyControlActivity.priceRow;
        if (i9 == i18) {
            return 9;
        }
        return i9 == privacyControlActivity.e0 ? 10 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // f2.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
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
        PrivacyControlActivity privacyControlActivity = this.d;
        boolean[] zArr = privacyControlActivity.A;
        int i22 = privacyControlActivity.x;
        int i23 = q1Var.f;
        View view = q1Var.a;
        int i24 = 9;
        final int i25 = 1;
        r8 = 0;
        int i26 = 0;
        r8 = 0;
        int i27 = 0;
        r8 = 0;
        int i28 = 0;
        r8 = 0;
        int i29 = 0;
        r8 = 0;
        int i30 = 0;
        if (i23 == 0) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            baVar.setTextColor(privacyControlActivity.getThemedColor(org.telegram.ui.ActionBar.f6.G6));
            if (i9 == privacyControlActivity.O) {
                String formatPluralString = privacyControlActivity.C.size() != 0 ? LocaleController.formatPluralString("Users", E(privacyControlActivity.C), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
                if (privacyControlActivity.y[privacyControlActivity.E == 2 ? (char) 0 : (char) 1]) {
                    ArrayList arrayList = privacyControlActivity.C;
                    formatPluralString = (arrayList == null || arrayList.isEmpty()) ? LocaleController.formatString(R.string.PrivacyPremium, new Object[0]) : LocaleController.formatString(R.string.PrivacyPremiumAnd, formatPluralString);
                }
                if (i22 != 10) {
                    int i31 = privacyControlActivity.E;
                    if (zArr[i31] && i31 != 0) {
                        ArrayList arrayList2 = privacyControlActivity.C;
                        formatPluralString = (arrayList2 == null || arrayList2.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, formatPluralString);
                    }
                }
                if (i22 == 10) {
                    baVar.c(LocaleController.getString(R.string.PrivateMessagesExceptions), formatPluralString, false, false);
                } else if (i22 == 0 || i22 == 4 || i22 == 9 || i22 == 14) {
                    baVar.c(LocaleController.getString(R.string.AlwaysShareWith), formatPluralString, false, privacyControlActivity.P != -1);
                } else {
                    baVar.c(LocaleController.getString(R.string.AlwaysAllow), formatPluralString, false, privacyControlActivity.P != -1);
                }
                if (i22 == 12) {
                    baVar.setEnabled(!privacyControlActivity.t0());
                    return;
                }
                return;
            }
            if (i9 != privacyControlActivity.P) {
                if (i9 == privacyControlActivity.X) {
                    i10 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).currentAccount;
                    baVar.c(LocaleController.getString(R.string.PrivacyP2P2), ContactsController.getInstance(i10).getLoadingPrivacyInfo(3) ? LocaleController.getString(R.string.Loading) : PrivacySettingsActivity.w0(3, privacyControlActivity.getAccountInstance()), false, false);
                    return;
                } else {
                    if (i9 == privacyControlActivity.a0) {
                        baVar.b(LocaleController.getString(privacyControlActivity.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumForPremium : R.string.PrivacyLastSeenPremium), false);
                        baVar.setTextColor(privacyControlActivity.getThemedColor(org.telegram.ui.ActionBar.f6.n6));
                        return;
                    }
                    return;
                }
            }
            String formatPluralString2 = privacyControlActivity.D.size() != 0 ? LocaleController.formatPluralString("Users", E(privacyControlActivity.D), new Object[0]) : LocaleController.getString(R.string.EmpryUsersPlaceholder);
            int i32 = privacyControlActivity.E;
            if (zArr[i32] && i32 == 0) {
                ArrayList arrayList3 = privacyControlActivity.D;
                formatPluralString2 = (arrayList3 == null || arrayList3.isEmpty()) ? LocaleController.formatString(R.string.PrivacyValueBots, new Object[0]) : LocaleController.formatString(R.string.PrivacyValueBotsAnd, formatPluralString2);
            }
            if (i22 == 0 || i22 == 4 || i22 == 9 || i22 == 14) {
                baVar.c(LocaleController.getString(R.string.NeverShareWith), formatPluralString2, false, false);
            } else {
                baVar.c(LocaleController.getString(R.string.NeverAllow), formatPluralString2, false, false);
            }
            if (i22 == 12) {
                baVar.setEnabled(!privacyControlActivity.t0());
                return;
            }
            return;
        }
        if (i23 == 1) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 == privacyControlActivity.M) {
                b9Var.setText(LocaleController.getString(R.string.PrivateMessagesChargePriceInfo));
            } else {
                int i33 = privacyControlActivity.L;
                if (i9 == i33 && i22 == 10) {
                    String string = LocaleController.getString(R.string.PrivacyMessagesInfo);
                    final int i34 = r8 ? 1 : 0;
                    b9Var.setText(AndroidUtilities.replaceSingleTag(string, new Runnable(this) { // from class: org.telegram.ui.rw0
                        public final /* synthetic */ uw0 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i34) {
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
                } else if (i9 == i33 && i22 == 8) {
                    b9Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo));
                } else {
                    i11 = privacyControlActivity.setBirthdayRow;
                    if (i9 == i11) {
                        b9Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PrivacyBirthdaySet), new Runnable(this) { // from class: org.telegram.ui.rw0
                            public final /* synthetic */ uw0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i25) {
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
                    } else if (i9 == privacyControlActivity.L) {
                        if (i22 == 6) {
                            if (privacyControlActivity.E == 1 && privacyControlActivity.F == 1) {
                                b9Var.setText(LocaleController.getString(R.string.PrivacyPhoneInfo3));
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                Locale locale = Locale.ENGLISH;
                                String d = ta.b.d("https://t.me/+", privacyControlActivity.getUserConfig().getClientPhone());
                                SpannableString spannableString = new SpannableString(d);
                                spannableString.setSpan(new tw0(this, d), 0, d.length(), 33);
                                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo)).append((CharSequence) "\n\n").append((CharSequence) LocaleController.getString(R.string.PrivacyPhoneInfo4)).append((CharSequence) "\n").append((CharSequence) spannableString);
                                b9Var.setText(spannableStringBuilder);
                            }
                        } else if (i22 == 5) {
                            b9Var.setText(LocaleController.getString(R.string.PrivacyForwardsInfo));
                        } else if (i22 == 4) {
                            b9Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo));
                        } else if (i22 == 9) {
                            b9Var.setText(LocaleController.getString(R.string.PrivacyBioInfo3));
                        } else if (i22 == 14) {
                            b9Var.setText(LocaleController.getString(R.string.PrivacyMusicInfo3));
                        } else if (i22 == 11) {
                            b9Var.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo));
                        } else if (i22 == 12) {
                            b9Var.setText(LocaleController.getString(R.string.PrivacyGiftsInfo));
                        } else if (i22 == 3) {
                            b9Var.setText(LocaleController.getString(R.string.PrivacyCallsP2PHelp));
                        } else if (i22 == 2) {
                            b9Var.setText(LocaleController.getString(R.string.WhoCanCallMeInfo));
                        } else if (i22 == 1) {
                            b9Var.setText(LocaleController.getString(R.string.WhoCanAddMeInfo));
                        } else {
                            b9Var.setText(LocaleController.getString(R.string.CustomHelp));
                        }
                    } else if (i9 == privacyControlActivity.Q) {
                        if (i22 == 6) {
                            b9Var.setText(LocaleController.getString(R.string.PrivacyPhoneInfo2));
                        } else if (i22 == 5) {
                            b9Var.setText(LocaleController.getString(R.string.PrivacyForwardsInfo2));
                        } else if (i22 == 4) {
                            int i35 = privacyControlActivity.E;
                            if (i35 == 2) {
                                b9Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo5)));
                            } else if (i35 == 0) {
                                b9Var.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PrivacyProfilePhotoInfo3)));
                            } else {
                                b9Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoInfo4));
                            }
                        } else if (i22 == 3) {
                            b9Var.setText(LocaleController.getString(R.string.CustomP2PInfo));
                        } else if (i22 == 9) {
                            b9Var.setText(LocaleController.getString(R.string.PrivacyBioInfo));
                        } else if (i22 == 14) {
                            b9Var.setText(LocaleController.getString(R.string.PrivacyMusicInfo));
                        } else if (i22 == 11) {
                            b9Var.setText(LocaleController.getString(R.string.PrivacyBirthdayInfo3));
                        } else if (i22 == 2) {
                            b9Var.setText(LocaleController.getString(R.string.CustomCallInfo));
                        } else if (i22 == 1) {
                            b9Var.setText(LocaleController.getString(R.string.CustomShareInfo));
                        } else if (i22 == 12) {
                            b9Var.setText(LocaleController.getString(R.string.CustomShareGiftsInfo));
                        } else if (i22 == 8) {
                            b9Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesInfo2));
                        } else if (i22 == 10) {
                            b9Var.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsInfo));
                        } else {
                            b9Var.setText(LocaleController.getString(R.string.CustomShareSettingsHelp));
                        }
                    } else if (i9 == privacyControlActivity.V) {
                        b9Var.setText(LocaleController.getString(R.string.PhotoForRestDescription));
                    } else if (i9 == privacyControlActivity.Z) {
                        b9Var.setText(LocaleController.getString(R.string.HideReadTimeInfo));
                    } else if (i9 == privacyControlActivity.b0) {
                        b9Var.setText(LocaleController.getString(privacyControlActivity.getUserConfig().isPremium() ? R.string.PrivacyLastSeenPremiumInfoForPremium : R.string.PrivacyLastSeenPremiumInfo));
                    } else if (i9 == privacyControlActivity.f0) {
                        b9Var.setText(LocaleController.formatString(R.string.PrivateMessagesPriceInfo, mh.l.F0(privacyControlActivity.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((int) (((privacyControlActivity.H * (privacyControlActivity.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f)) / 1000.0d) * privacyControlActivity.getMessagesController().starsUsdWithdrawRate1000)) / 100.0d)));
                    } else if (i9 == privacyControlActivity.g0) {
                        SpannableString spannableString2 = new SpannableString(ImageLoader.AUTOPLAY_FILTER);
                        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.msg_input_gift, 0);
                        eqVar.setScale(0.583f, 0.583f);
                        spannableString2.setSpan(eqVar, 0, 1, 33);
                        b9Var.setText(LocaleController.formatSpannable(R.string.PrivacyGiftsShowIconInfo, spannableString2));
                    } else if (i9 == privacyControlActivity.m0) {
                        b9Var.setText(LocaleController.getString(R.string.PrivacyGiftsTypeInfo));
                    }
                }
            }
            b9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
            return;
        }
        if (i23 == 2) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i9 != privacyControlActivity.J) {
                if (i9 == privacyControlActivity.N) {
                    if (i22 == 10) {
                        m4Var.setText(LocaleController.getString(R.string.PrivateMessagesExceptionsHeader));
                        return;
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.AddExceptions));
                        return;
                    }
                }
                if (i9 == privacyControlActivity.W) {
                    m4Var.setText(LocaleController.getString(R.string.PrivacyP2PHeader));
                    return;
                }
                if (i9 == privacyControlActivity.R) {
                    m4Var.setText(LocaleController.getString(R.string.PrivacyPhoneTitle2));
                    return;
                }
                if (i9 == privacyControlActivity.d0) {
                    m4Var.setText(LocaleController.getString(R.string.PrivateMessagesPriceHeader));
                    return;
                }
                i12 = privacyControlActivity.giftTypesHeaderRow;
                if (i9 == i12) {
                    m4Var.setText(LocaleController.getString(R.string.PrivacyGiftsTypeHeader));
                    return;
                }
                return;
            }
            if (i22 == 6) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyPhoneTitle));
                return;
            }
            if (i22 == 5) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyForwardsTitle));
                return;
            }
            if (i22 == 4) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyProfilePhotoTitle));
                return;
            }
            if (i22 == 9) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyBioTitle));
                return;
            }
            if (i22 == 14) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyMusicTitle));
                return;
            }
            if (i22 == 3) {
                m4Var.setText(LocaleController.getString(R.string.P2PEnabledWith));
                return;
            }
            if (i22 == 2) {
                m4Var.setText(LocaleController.getString(R.string.WhoCanCallMe));
                return;
            }
            if (i22 == 1) {
                m4Var.setText(LocaleController.getString(R.string.WhoCanAddMe));
                return;
            }
            if (i22 == 8) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyVoiceMessagesTitle));
                return;
            }
            if (i22 == 10) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyMessagesTitle));
                return;
            }
            if (i22 == 11) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyBirthdayTitle));
                return;
            } else if (i22 == 12) {
                m4Var.setText(LocaleController.getString(R.string.PrivacyGiftsTitle));
                return;
            } else {
                m4Var.setText(LocaleController.getString(R.string.LastSeenTitle));
                return;
            }
        }
        if (i23 != 3) {
            if (i23 != 8) {
                if (i23 != 9) {
                    return;
                }
                org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
                i21 = privacyControlActivity.priceRow;
                if (i9 == i21) {
                    int[] a2 = org.telegram.ui.Cells.x7.a((int) privacyControlActivity.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, MediaDataController.MAX_LINKS_COUNT, 400, 500, MediaDataController.MAX_STYLE_RUNS_COUNT, 2500, 5000, 7500, 9000, 10000});
                    dl0 dl0Var = new dl0(this, i24);
                    org.telegram.ui.Cells.w7 w7Var = new org.telegram.ui.Cells.w7();
                    w7Var.c = a2;
                    w7Var.d = 20;
                    w7Var.e = dl0Var;
                    x7Var.d((int) Utilities.clamp(privacyControlActivity.H, privacyControlActivity.getMessagesController().starsPaidMessageAmountMax, 1L), w7Var, new sw0(this, r8 ? 1 : 0));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            t8Var.setCheckBoxIcon(0);
            i19 = privacyControlActivity.readRow;
            if (i9 == i19) {
                t8Var.f(LocaleController.getString(R.string.HideReadTime), privacyControlActivity.x0, false);
                return;
            }
            i20 = privacyControlActivity.showGiftIconRow;
            if (i9 == i20) {
                t8Var.f(LocaleController.getString(R.string.PrivacyGiftsShowIcon), privacyControlActivity.z0, false);
                return;
            }
            if (i9 == privacyControlActivity.h0) {
                t8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeUnlimited), privacyControlActivity.B0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.B0) {
                    i26 = R.drawable.permission_locked;
                }
                t8Var.setCheckBoxIcon(i26);
                return;
            }
            if (i9 == privacyControlActivity.i0) {
                t8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeLimited), privacyControlActivity.D0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.D0) {
                    i27 = R.drawable.permission_locked;
                }
                t8Var.setCheckBoxIcon(i27);
                return;
            }
            if (i9 == privacyControlActivity.j0) {
                t8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeUnique), privacyControlActivity.F0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.F0) {
                    i28 = R.drawable.permission_locked;
                }
                t8Var.setCheckBoxIcon(i28);
                return;
            }
            if (i9 == privacyControlActivity.k0) {
                t8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypeFromChannels), privacyControlActivity.H0, true);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.H0) {
                    i29 = R.drawable.permission_locked;
                }
                t8Var.setCheckBoxIcon(i29);
                return;
            }
            if (i9 == privacyControlActivity.l0) {
                t8Var.f(LocaleController.getString(R.string.PrivacyGiftsTypePremium), privacyControlActivity.J0, false);
                if (!privacyControlActivity.getUserConfig().isPremium() && privacyControlActivity.J0) {
                    i30 = R.drawable.permission_locked;
                }
                t8Var.setCheckBoxIcon(i30);
                return;
            }
            return;
        }
        org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
        j6Var.setRadioIcon(null);
        i13 = privacyControlActivity.everybodyRow;
        if (i9 != i13 && i9 != privacyControlActivity.K) {
            i18 = privacyControlActivity.nobodyRow;
            if (i9 != i18 && i9 != privacyControlActivity.c0) {
                if (i9 == privacyControlActivity.T) {
                    j6Var.c(LocaleController.getString(R.string.LastSeenContacts), privacyControlActivity.F == 1, false);
                } else if (i9 == privacyControlActivity.S) {
                    j6Var.c(LocaleController.getString(R.string.LastSeenEverybody), privacyControlActivity.F == 0, true);
                }
                if (i22 != 12) {
                    j6Var.b(null, !privacyControlActivity.t0());
                    return;
                }
                return;
            }
        }
        i14 = privacyControlActivity.everybodyRow;
        if (i9 == i14) {
            if (i22 == 3) {
                j6Var.c(LocaleController.getString(R.string.P2PEverybody), privacyControlActivity.E == 0, true);
            } else {
                j6Var.c(LocaleController.getString(R.string.LastSeenEverybody), privacyControlActivity.E == 0, true);
            }
        } else if (i9 == privacyControlActivity.K) {
            if ((i22 == 8 && !privacyControlActivity.getUserConfig().isPremium()) || (i22 == 10 && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium())) {
                j6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i22 == 3) {
                String string2 = LocaleController.getString(R.string.P2PContacts);
                boolean z10 = privacyControlActivity.E == 2;
                i17 = privacyControlActivity.nobodyRow;
                j6Var.c(string2, z10, (i17 == -1 && privacyControlActivity.c0 == -1) ? false : true);
            } else if (i22 == 10) {
                String string3 = LocaleController.getString(R.string.PrivacyMessagesContactsAndPremium);
                boolean z11 = privacyControlActivity.E == 2;
                i16 = privacyControlActivity.nobodyRow;
                j6Var.c(string3, z11, (i16 == -1 && privacyControlActivity.c0 == -1) ? false : true);
            } else {
                String string4 = LocaleController.getString(R.string.LastSeenContacts);
                boolean z12 = privacyControlActivity.E == 2;
                i15 = privacyControlActivity.nobodyRow;
                j6Var.c(string4, z12, (i15 == -1 && privacyControlActivity.c0 == -1) ? false : true);
            }
        } else if (i9 == privacyControlActivity.c0) {
            if (i22 == 10 && !privacyControlActivity.getUserConfig().isPremium()) {
                j6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            j6Var.c(LocaleController.getString(R.string.PrivateMessagesChargePrice), privacyControlActivity.E == 3, false);
        } else {
            if ((i22 == 8 && !privacyControlActivity.getUserConfig().isPremium()) || (i22 == 10 && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium())) {
                j6Var.setRadioIcon(privacyControlActivity.getParentActivity().getResources().getDrawable(R.drawable.mini_switch_lock).mutate());
            }
            if (i22 == 3) {
                j6Var.c(LocaleController.getString(R.string.P2PNobody), privacyControlActivity.E == 1, false);
            } else {
                j6Var.c(LocaleController.getString(R.string.LastSeenNobody), privacyControlActivity.E == 1, false);
            }
        }
        if (i22 != 12) {
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        View view;
        Context context = this.c;
        PrivacyControlActivity privacyControlActivity = this.d;
        switch (i9) {
            case 0:
                org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context);
                baVar.setCanDisable(true);
                view = baVar;
                break;
            case 1:
                view = new org.telegram.ui.Cells.b9(context);
                break;
            case 2:
                view = new org.telegram.ui.Cells.m4(context);
                break;
            case 3:
                view = new org.telegram.ui.Cells.j6(context, null);
                break;
            case 4:
                view = privacyControlActivity.e;
                break;
            case 5:
            default:
                view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                break;
            case 6:
                org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(privacyControlActivity.getParentActivity());
                privacyControlActivity.q0 = p8Var;
                if (privacyControlActivity.t0 == null) {
                    p8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SetPhotoForRest, new Object[0]), false);
                } else {
                    p8Var.m(R.drawable.msg_addphoto, LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]), true);
                }
                privacyControlActivity.q0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                privacyControlActivity.q0.e(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                privacyControlActivity.p0 = new org.telegram.ui.Components.mi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                privacyControlActivity.q0.e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
                privacyControlActivity.q0.e.setAnimation(privacyControlActivity.p0);
                view = privacyControlActivity.q0;
                break;
            case 7:
                privacyControlActivity.r0 = new org.telegram.ui.Components.o9(privacyControlActivity.getParentActivity());
                privacyControlActivity.s0 = new gs(this, privacyControlActivity.getParentActivity());
                TLRPC.PhotoSize photoSize = privacyControlActivity.t0;
                if (photoSize != null) {
                    TLRPC.Photo photo = privacyControlActivity.u0;
                    if (photo != null) {
                        org.telegram.ui.Components.o9 o9Var = privacyControlActivity.r0;
                        ImageLocation forPhoto = ImageLocation.getForPhoto(photoSize, photo);
                        i11 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).currentAccount;
                        o9Var.h(forPhoto, "50_50", null, UserConfig.getInstance(i11).getCurrentUser());
                    } else {
                        org.telegram.ui.Components.o9 o9Var2 = privacyControlActivity.r0;
                        ImageLocation forLocal = ImageLocation.getForLocal(photoSize.location);
                        i10 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).currentAccount;
                        o9Var2.h(forLocal, "50_50", null, UserConfig.getInstance(i10).getCurrentUser());
                    }
                }
                privacyControlActivity.s0.addView(privacyControlActivity.r0, g7.e6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
                privacyControlActivity.s0.i(LocaleController.getString(R.string.RemovePublicPhoto), false);
                privacyControlActivity.s0.getImageView().setVisibility(0);
                privacyControlActivity.s0.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                gs gsVar = privacyControlActivity.s0;
                int i12 = org.telegram.ui.ActionBar.f6.p7;
                gsVar.e(i12, i12);
                view = privacyControlActivity.s0;
                break;
            case 8:
                b6Var = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.t8(context, b6Var);
                break;
            case 9:
                b6Var2 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).resourceProvider;
                view = new org.telegram.ui.Cells.x7(context, b6Var2);
                break;
            case 10:
                FrameLayout frameLayout = new FrameLayout(context);
                b6Var3 = ((org.telegram.ui.ActionBar.o2) privacyControlActivity).resourceProvider;
                kh.d dVar = new kh.d(context, b6Var3, true);
                dVar.setRoundRadius(24);
                org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.msg_mini_lock3, 0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PrivateMessagesChargePremiumLocked));
                spannableStringBuilder.append((CharSequence) " l");
                spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                dVar.g(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new q50(this, 25));
                frameLayout.addView(dVar, g7.e6.d(-1, 48.0f, 119, 18.0f, 0.0f, 18.0f, 16.0f));
                view = frameLayout;
                break;
        }
        return new org.telegram.ui.Components.ik0(view);
    }
}
