package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yw0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ PrivacySettingsActivity d;

    public yw0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
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
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int b10 = q1Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i9 = privacySettingsActivity.passcodeRow;
        if (b10 != i9) {
            i10 = privacySettingsActivity.passwordRow;
            if (b10 != i10) {
                i11 = privacySettingsActivity.passkeysRow;
                if (b10 != i11) {
                    i12 = privacySettingsActivity.blockedRow;
                    if (b10 != i12 && b10 != privacySettingsActivity.s) {
                        i13 = privacySettingsActivity.secretWebpageRow;
                        if (b10 != i13) {
                            i14 = privacySettingsActivity.webSessionsRow;
                            if (b10 != i14 && (b10 != privacySettingsActivity.n || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1))) {
                                i15 = privacySettingsActivity.lastSeenRow;
                                if (b10 != i15 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) {
                                    i16 = privacySettingsActivity.callsRow;
                                    if (b10 != i16 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                                        i17 = privacySettingsActivity.profilePhotoRow;
                                        if (b10 != i17 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                                            i18 = privacySettingsActivity.bioRow;
                                            if (b10 != i18 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                                                i19 = privacySettingsActivity.musicRow;
                                                if (b10 != i19 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                                                    i20 = privacySettingsActivity.birthdayRow;
                                                    if (b10 != i20 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                                                        i21 = privacySettingsActivity.giftsRow;
                                                        if (b10 != i21 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                                                            i22 = privacySettingsActivity.forwardsRow;
                                                            if (b10 != i22 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) {
                                                                i23 = privacySettingsActivity.phoneNumberRow;
                                                                if (b10 != i23 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                                                                    i24 = privacySettingsActivity.voicesRow;
                                                                    if (b10 != i24 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) {
                                                                        i25 = privacySettingsActivity.noncontactsRow;
                                                                        if (b10 != i25) {
                                                                            i26 = privacySettingsActivity.deleteAccountRow;
                                                                            if (b10 != i26 || privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) {
                                                                                i27 = privacySettingsActivity.newChatsRow;
                                                                                if (b10 != i27 || privacySettingsActivity.getContactsController().getLoadingGlobalSettings()) {
                                                                                    i28 = privacySettingsActivity.emailLoginRow;
                                                                                    if (b10 != i28) {
                                                                                        i29 = privacySettingsActivity.paymentsClearRow;
                                                                                        if (b10 != i29) {
                                                                                            i30 = privacySettingsActivity.secretMapRow;
                                                                                            if (b10 != i30) {
                                                                                                i31 = privacySettingsActivity.contactsSyncRow;
                                                                                                if (b10 != i31 && b10 != privacySettingsActivity.C) {
                                                                                                    i32 = privacySettingsActivity.contactsDeleteRow;
                                                                                                    if (b10 != i32) {
                                                                                                        i33 = privacySettingsActivity.contactsSuggestRow;
                                                                                                        if (b10 != i33) {
                                                                                                            i34 = privacySettingsActivity.autoDeleteMesages;
                                                                                                            if (b10 != i34 && b10 != privacySettingsActivity.D) {
                                                                                                                return false;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.K;
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
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i9 == privacySettingsActivity.C) {
            return 0;
        }
        i10 = privacySettingsActivity.lastSeenRow;
        if (i9 == i10) {
            return 0;
        }
        i11 = privacySettingsActivity.phoneNumberRow;
        if (i9 == i11) {
            return 0;
        }
        i12 = privacySettingsActivity.deleteAccountRow;
        if (i9 == i12) {
            return 0;
        }
        i13 = privacySettingsActivity.webSessionsRow;
        if (i9 == i13 || i9 == privacySettingsActivity.n) {
            return 0;
        }
        i14 = privacySettingsActivity.paymentsClearRow;
        if (i9 == i14) {
            return 0;
        }
        i15 = privacySettingsActivity.secretMapRow;
        if (i9 == i15) {
            return 0;
        }
        i16 = privacySettingsActivity.contactsDeleteRow;
        if (i9 == i16 || i9 == privacySettingsActivity.D) {
            return 0;
        }
        if (i9 == privacySettingsActivity.h || i9 == privacySettingsActivity.A || i9 == privacySettingsActivity.r || i9 == privacySettingsActivity.v || i9 == privacySettingsActivity.J || i9 == privacySettingsActivity.E || i9 == privacySettingsActivity.H || i9 == privacySettingsActivity.x) {
            return 1;
        }
        if (i9 == 0 || i9 == privacySettingsActivity.y || i9 == privacySettingsActivity.f || i9 == privacySettingsActivity.I || i9 == privacySettingsActivity.B || i9 == privacySettingsActivity.G || i9 == privacySettingsActivity.w) {
            return 2;
        }
        i17 = privacySettingsActivity.secretWebpageRow;
        if (i9 == i17) {
            return 3;
        }
        i18 = privacySettingsActivity.contactsSyncRow;
        if (i9 == i18) {
            return 3;
        }
        i19 = privacySettingsActivity.contactsSuggestRow;
        if (i9 == i19) {
            return 3;
        }
        i20 = privacySettingsActivity.newChatsRow;
        if (i9 == i20) {
            return 3;
        }
        if (i9 == privacySettingsActivity.F) {
            return 4;
        }
        i21 = privacySettingsActivity.autoDeleteMesages;
        if (i9 == i21 || i9 == privacySettingsActivity.s) {
            return 5;
        }
        i22 = privacySettingsActivity.emailLoginRow;
        if (i9 == i22) {
            return 5;
        }
        i23 = privacySettingsActivity.passwordRow;
        if (i9 == i23) {
            return 5;
        }
        i24 = privacySettingsActivity.passkeysRow;
        if (i9 == i24) {
            return 5;
        }
        i25 = privacySettingsActivity.passcodeRow;
        if (i9 == i25) {
            return 5;
        }
        i26 = privacySettingsActivity.blockedRow;
        return i9 == i26 ? 5 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
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
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z10;
        int i26;
        String string;
        boolean z11;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        String str;
        String format;
        String string2;
        int i38;
        String string3;
        String str2;
        String string4;
        int i39;
        String str3;
        boolean z12;
        String str4;
        String format2;
        String str5;
        String formatTTLString;
        int i40 = q1Var.f;
        View view = q1Var.a;
        int i41 = 16;
        String str6 = null;
        boolean z13 = false;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i40 == 0) {
            boolean z14 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i9;
            view.setTag(Integer.valueOf(i9));
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            baVar.setBetterLayout(true);
            i10 = privacySettingsActivity.webSessionsRow;
            if (i9 == i10) {
                baVar.b(LocaleController.getString("WebSessionsTitle", R.string.WebSessionsTitle), false);
            } else {
                i11 = privacySettingsActivity.phoneNumberRow;
                if (i9 == i11) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                        z10 = true;
                        i41 = 30;
                    } else {
                        str6 = PrivacySettingsActivity.w0(6, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    baVar.c(LocaleController.getString("PrivacyPhone", R.string.PrivacyPhone), str6, false, true);
                } else {
                    i12 = privacySettingsActivity.lastSeenRow;
                    if (i9 == i12) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) {
                            z10 = true;
                            i41 = 30;
                        } else {
                            str6 = PrivacySettingsActivity.w0(0, privacySettingsActivity.getAccountInstance());
                            z10 = false;
                        }
                        baVar.c(LocaleController.getString("PrivacyLastSeen", R.string.PrivacyLastSeen), str6, false, true);
                    } else if (i9 == privacySettingsActivity.n) {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1)) {
                            z10 = true;
                            i41 = 30;
                        } else {
                            str6 = PrivacySettingsActivity.w0(1, privacySettingsActivity.getAccountInstance());
                            z10 = false;
                        }
                        baVar.c(LocaleController.getString(R.string.PrivacyInvites), str6, false, false);
                    } else {
                        i13 = privacySettingsActivity.callsRow;
                        if (i9 == i13) {
                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                                z10 = true;
                                i41 = 30;
                            } else {
                                str6 = PrivacySettingsActivity.w0(2, privacySettingsActivity.getAccountInstance());
                                z10 = false;
                            }
                            baVar.c(LocaleController.getString("Calls", R.string.Calls), str6, false, true);
                        } else {
                            i14 = privacySettingsActivity.profilePhotoRow;
                            if (i9 == i14) {
                                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                                    z10 = true;
                                    i41 = 30;
                                } else {
                                    str6 = PrivacySettingsActivity.w0(4, privacySettingsActivity.getAccountInstance());
                                    z10 = false;
                                }
                                baVar.c(LocaleController.getString("PrivacyProfilePhoto", R.string.PrivacyProfilePhoto), str6, false, true);
                            } else {
                                i15 = privacySettingsActivity.bioRow;
                                if (i9 == i15) {
                                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                                        z10 = true;
                                        i41 = 30;
                                    } else {
                                        str6 = PrivacySettingsActivity.w0(9, privacySettingsActivity.getAccountInstance());
                                        z10 = false;
                                    }
                                    baVar.c(LocaleController.getString("PrivacyBio", R.string.PrivacyBio), str6, false, true);
                                } else {
                                    i16 = privacySettingsActivity.musicRow;
                                    if (i9 == i16) {
                                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                                            z10 = true;
                                            i41 = 30;
                                        } else {
                                            str6 = PrivacySettingsActivity.w0(14, privacySettingsActivity.getAccountInstance());
                                            z10 = false;
                                        }
                                        baVar.c(LocaleController.getString(R.string.PrivacyMusic), str6, false, true);
                                    } else {
                                        i17 = privacySettingsActivity.birthdayRow;
                                        if (i9 == i17) {
                                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                                                z10 = true;
                                                i41 = 30;
                                            } else {
                                                str6 = PrivacySettingsActivity.w0(11, privacySettingsActivity.getAccountInstance());
                                                z10 = false;
                                            }
                                            baVar.c(LocaleController.getString(R.string.PrivacyBirthday), str6, false, true);
                                        } else {
                                            i18 = privacySettingsActivity.giftsRow;
                                            if (i9 == i18) {
                                                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                                                    z10 = true;
                                                    i41 = 30;
                                                } else {
                                                    str6 = PrivacySettingsActivity.w0(12, privacySettingsActivity.getAccountInstance());
                                                    z10 = false;
                                                }
                                                baVar.c(LocaleController.getString(R.string.PrivacyGifts), str6, false, true);
                                            } else {
                                                i19 = privacySettingsActivity.forwardsRow;
                                                if (i9 == i19) {
                                                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) {
                                                        z10 = true;
                                                        i41 = 30;
                                                    } else {
                                                        str6 = PrivacySettingsActivity.w0(5, privacySettingsActivity.getAccountInstance());
                                                        z10 = false;
                                                    }
                                                    baVar.c(LocaleController.getString("PrivacyForwards", R.string.PrivacyForwards), str6, false, true);
                                                } else {
                                                    i20 = privacySettingsActivity.voicesRow;
                                                    if (i9 == i20) {
                                                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) {
                                                            string = null;
                                                            z11 = true;
                                                            i41 = 30;
                                                        } else {
                                                            string = !privacySettingsActivity.getUserConfig().isPremium() ? LocaleController.getString(R.string.P2PEverybody) : PrivacySettingsActivity.w0(8, privacySettingsActivity.getAccountInstance());
                                                            z11 = false;
                                                        }
                                                        SpannableStringBuilder t02 = PrivacySettingsActivity.t0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyVoiceMessages));
                                                        i27 = privacySettingsActivity.noncontactsRow;
                                                        baVar.c(t02, string, false, i27 != -1);
                                                        baVar.getValueImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.m6, false), PorterDuff.Mode.MULTIPLY));
                                                        z13 = z11;
                                                    } else {
                                                        i21 = privacySettingsActivity.noncontactsRow;
                                                        if (i9 == i21) {
                                                            String string5 = LocaleController.getString(privacySettingsActivity.U ? R.string.ContactsAndFee : privacySettingsActivity.T ? R.string.ContactsAndPremium : R.string.P2PEverybody);
                                                            CharSequence t03 = (!privacySettingsActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium || privacySettingsActivity.getMessagesController().starsPaidMessagesAvailable) ? PrivacySettingsActivity.t0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyMessages)) : LocaleController.getString(R.string.PrivacyMessages);
                                                            i26 = privacySettingsActivity.musicRow;
                                                            baVar.c(t03, string5, false, i26 != -1);
                                                        } else if (i9 == privacySettingsActivity.C) {
                                                            baVar.b(LocaleController.getString("TelegramPassport", R.string.TelegramPassport), true);
                                                        } else {
                                                            i22 = privacySettingsActivity.deleteAccountRow;
                                                            if (i9 == i22) {
                                                                if (privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) {
                                                                    z10 = true;
                                                                } else {
                                                                    int deleteAccountTTL = privacySettingsActivity.getContactsController().getDeleteAccountTTL();
                                                                    str6 = deleteAccountTTL <= 182 ? LocaleController.formatPluralString("Months", deleteAccountTTL / 30, new Object[0]) : deleteAccountTTL == 365 ? LocaleController.formatPluralString("Months", 12, new Object[0]) : deleteAccountTTL == 548 ? LocaleController.formatPluralString("Months", 18, new Object[0]) : deleteAccountTTL == 730 ? LocaleController.formatPluralString("Months", 24, new Object[0]) : deleteAccountTTL > 30 ? LocaleController.formatPluralString("Months", (int) Math.round(deleteAccountTTL / 30.0d), new Object[0]) : LocaleController.formatPluralString("Days", deleteAccountTTL, new Object[0]);
                                                                    z10 = false;
                                                                }
                                                                baVar.c(LocaleController.getString("DeleteAccountIfAwayFor3", R.string.DeleteAccountIfAwayFor3), str6, privacySettingsActivity.M, false);
                                                                privacySettingsActivity.M = false;
                                                            } else {
                                                                i23 = privacySettingsActivity.paymentsClearRow;
                                                                if (i9 == i23) {
                                                                    baVar.b(LocaleController.getString("PrivacyPaymentsClear", R.string.PrivacyPaymentsClear), true);
                                                                } else if (i9 == privacySettingsActivity.D) {
                                                                    baVar.b(LocaleController.getString(R.string.PrivacyBiometryBotsButton), true);
                                                                } else {
                                                                    i24 = privacySettingsActivity.secretMapRow;
                                                                    if (i9 == i24) {
                                                                        int i42 = SharedConfig.mapPreviewType;
                                                                        baVar.c(LocaleController.getString("MapPreviewProvider", R.string.MapPreviewProvider), i42 != 0 ? i42 != 1 ? i42 != 2 ? LocaleController.getString("MapPreviewProviderYandex", R.string.MapPreviewProviderYandex) : LocaleController.getString("MapPreviewProviderNobody", R.string.MapPreviewProviderNobody) : LocaleController.getString("MapPreviewProviderGoogle", R.string.MapPreviewProviderGoogle) : LocaleController.getString("MapPreviewProviderTelegram", R.string.MapPreviewProviderTelegram), privacySettingsActivity.N, true);
                                                                        privacySettingsActivity.N = false;
                                                                    } else {
                                                                        i25 = privacySettingsActivity.contactsDeleteRow;
                                                                        if (i9 == i25) {
                                                                            baVar.b(LocaleController.getString("SyncContactsDelete", R.string.SyncContactsDelete), true);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z13 = z10;
            }
            baVar.r = z13;
            baVar.y = i41;
            if (z14) {
                baVar.A = true;
            } else {
                baVar.x = z13 ? 1.0f : 0.0f;
            }
            baVar.invalidate();
            return;
        }
        if (i40 == 1) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 == privacySettingsActivity.A) {
                b9Var.setText(LocaleController.getString("DeleteAccountHelp", R.string.DeleteAccountHelp));
                return;
            }
            if (i9 == privacySettingsActivity.r) {
                b9Var.setText(LocaleController.getString("GroupsAndChannelsHelp", R.string.GroupsAndChannelsHelp));
                return;
            }
            if (i9 == privacySettingsActivity.v) {
                b9Var.setText(LocaleController.getString("SessionsSettingsInfo", R.string.SessionsSettingsInfo));
                return;
            }
            if (i9 == privacySettingsActivity.J) {
                b9Var.setText(LocaleController.getString("SecretWebPageInfo", R.string.SecretWebPageInfo));
                return;
            }
            if (i9 == privacySettingsActivity.E) {
                b9Var.setText(LocaleController.getString("PrivacyBotsInfo", R.string.PrivacyBotsInfo));
                return;
            }
            if (i9 == privacySettingsActivity.h) {
                b9Var.setText(LocaleController.getString(R.string.PrivacyInvitesInfo));
                return;
            } else if (i9 == privacySettingsActivity.H) {
                b9Var.setText(LocaleController.getString("SuggestContactsInfo", R.string.SuggestContactsInfo));
                return;
            } else {
                if (i9 == privacySettingsActivity.x) {
                    b9Var.setText(LocaleController.getString("ArchiveAndMuteInfo", R.string.ArchiveAndMuteInfo));
                    return;
                }
                return;
            }
        }
        if (i40 == 2) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i9 == privacySettingsActivity.f) {
                m4Var.setText(LocaleController.getString("PrivacyTitle", R.string.PrivacyTitle));
                return;
            }
            if (i9 == 0) {
                m4Var.setText(LocaleController.getString("SecurityTitle", R.string.SecurityTitle));
                return;
            }
            if (i9 == privacySettingsActivity.y) {
                m4Var.setText(LocaleController.getString("DeleteMyAccount", R.string.DeleteMyAccount));
                return;
            }
            if (i9 == privacySettingsActivity.I) {
                m4Var.setText(LocaleController.getString("SecretChat", R.string.SecretChat));
                return;
            }
            if (i9 == privacySettingsActivity.B) {
                m4Var.setText(LocaleController.getString("PrivacyBots", R.string.PrivacyBots));
                return;
            } else if (i9 == privacySettingsActivity.G) {
                m4Var.setText(LocaleController.getString("Contacts", R.string.Contacts));
                return;
            } else {
                if (i9 == privacySettingsActivity.w) {
                    m4Var.setText(LocaleController.getString("NewChatsFromNonContacts", R.string.NewChatsFromNonContacts));
                    return;
                }
                return;
            }
        }
        if (i40 == 3) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            i28 = privacySettingsActivity.secretWebpageRow;
            if (i9 == i28) {
                t8Var.f(LocaleController.getString("SecretWebPage", R.string.SecretWebPage), privacySettingsActivity.getMessagesController().secretWebpagePreview == 1, false);
                return;
            }
            i29 = privacySettingsActivity.contactsSyncRow;
            if (i9 == i29) {
                t8Var.f(LocaleController.getString("SyncContacts", R.string.SyncContacts), privacySettingsActivity.P, true);
                return;
            }
            i30 = privacySettingsActivity.contactsSuggestRow;
            if (i9 == i30) {
                t8Var.f(LocaleController.getString("SuggestContacts", R.string.SuggestContacts), privacySettingsActivity.R, false);
                return;
            }
            i31 = privacySettingsActivity.newChatsRow;
            if (i9 == i31) {
                t8Var.f(LocaleController.getString("ArchiveAndMute", R.string.ArchiveAndMute), privacySettingsActivity.S, false);
                return;
            }
            return;
        }
        if (i40 != 5) {
            return;
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
        boolean z15 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i9;
        view.setTag(Integer.valueOf(i9));
        p8Var.setPrioritizeTitleOverValue(false);
        org.telegram.ui.Components.j6 j6Var = p8Var.c;
        i32 = privacySettingsActivity.autoDeleteMesages;
        if (i9 == i32) {
            int globalTTl = privacySettingsActivity.getUserConfig().getGlobalTTl();
            if (globalTTl == -1) {
                formatTTLString = null;
                z13 = true;
            } else {
                formatTTLString = globalTTl > 0 ? LocaleController.formatTTLString(globalTTl * 60) : LocaleController.getString("PasswordOff", R.string.PasswordOff);
            }
            p8Var.s(LocaleController.getString("AutoDeleteMessages", R.string.AutoDeleteMessages), formatTTLString, true, R.drawable.msg2_autodelete, true);
        } else {
            String str7 = "";
            if (i9 == privacySettingsActivity.s) {
                if (privacySettingsActivity.W.i0() != 0) {
                    format2 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.W.i0()));
                } else if (privacySettingsActivity.getMessagesController().lastKnownSessionsCount == 0) {
                    str5 = "";
                    z13 = true;
                    privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.W.i0();
                    p8Var.s(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
                } else {
                    format2 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().lastKnownSessionsCount));
                }
                str5 = format2;
                privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.W.i0();
                p8Var.s(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
            } else {
                i33 = privacySettingsActivity.emailLoginRow;
                if (i9 == i33) {
                    TL_account.Password password = privacySettingsActivity.d;
                    if (password == null) {
                        z12 = true;
                        str4 = str7;
                    } else {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(password.login_email_pattern);
                        int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                        int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                            org.telegram.ui.Components.vz0 vz0Var = new org.telegram.ui.Components.vz0();
                            vz0Var.a |= 256;
                            vz0Var.b = indexOf;
                            int i43 = lastIndexOf + 1;
                            vz0Var.c = i43;
                            valueOf.setSpan(new org.telegram.ui.Components.wz0(vz0Var, 0), indexOf, i43, 0);
                        }
                        z12 = false;
                        str4 = valueOf;
                    }
                    p8Var.setPrioritizeTitleOverValue(true);
                    String string6 = LocaleController.getString(R.string.EmailLogin);
                    int i44 = R.drawable.msg2_email;
                    p8Var.w = 16;
                    p8Var.s = 58;
                    org.telegram.ui.ActionBar.h5 h5Var = p8Var.a;
                    h5Var.l(string6, false);
                    h5Var.i(null);
                    org.telegram.ui.ActionBar.h5 h5Var2 = p8Var.d;
                    h5Var2.setVisibility(0);
                    h5Var2.l(str4, false);
                    j6Var.setVisibility(8);
                    p8Var.h.setVisibility(8);
                    org.telegram.ui.Components.pi0 pi0Var = p8Var.e;
                    pi0Var.setVisibility(0);
                    pi0Var.setTranslationX(0.0f);
                    pi0Var.setTranslationY(0.0f);
                    pi0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                    pi0Var.setImageResource(i44);
                    p8Var.r = true;
                    p8Var.setWillNotDraw(false);
                    Switch r02 = p8Var.f;
                    if (r02 != null) {
                        r02.setVisibility(8);
                    }
                    org.telegram.ui.Components.i5 i5Var = p8Var.G;
                    if (i5Var != null) {
                        i5Var.g(null, false);
                    }
                    z13 = z12;
                } else {
                    i34 = privacySettingsActivity.passwordRow;
                    if (i9 == i34) {
                        int i45 = R.drawable.menu_2sv;
                        TL_account.Password password2 = privacySettingsActivity.d;
                        if (password2 == null) {
                            i39 = i45;
                            str3 = "";
                            z13 = true;
                        } else {
                            if (password2.has_password) {
                                i45 = R.drawable.menu_2sv_on;
                                string4 = LocaleController.getString(R.string.PasswordOn);
                            } else {
                                string4 = LocaleController.getString(R.string.PasswordOff);
                            }
                            i39 = i45;
                            str3 = string4;
                        }
                        p8Var.s(LocaleController.getString(R.string.TwoStepVerification), str3, true, i39, true);
                    } else {
                        i35 = privacySettingsActivity.passkeysRow;
                        if (i9 == i35) {
                            ArrayList arrayList = privacySettingsActivity.e;
                            if (arrayList == null) {
                                str2 = "";
                                z13 = true;
                            } else {
                                if (arrayList.size() == 1 && j6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.e.get(0)).name) < AndroidUtilities.displaySize.x / 3.0f) {
                                    string3 = ((TL_account.Passkey) privacySettingsActivity.e.get(0)).name;
                                } else if (privacySettingsActivity.e.size() > 0) {
                                    string3 = privacySettingsActivity.e.size() + "";
                                } else {
                                    string3 = LocaleController.getString(R.string.PasswordOff);
                                }
                                str2 = string3;
                            }
                            p8Var.s(LocaleController.getString(R.string.Passkey), str2, true, R.drawable.msg2_permissions, true);
                        } else {
                            i36 = privacySettingsActivity.passcodeRow;
                            if (i9 == i36) {
                                if (SharedConfig.passcodeHash.length() != 0) {
                                    string2 = LocaleController.getString(R.string.PasswordOn);
                                    i38 = R.drawable.msg2_secret;
                                } else {
                                    string2 = LocaleController.getString(R.string.PasswordOff);
                                    i38 = R.drawable.msg2_secret;
                                }
                                p8Var.s(LocaleController.getString(R.string.Passcode), string2, true, i38, true);
                            } else {
                                i37 = privacySettingsActivity.blockedRow;
                                if (i9 == i37) {
                                    int i46 = privacySettingsActivity.getMessagesController().totalBlockedCount;
                                    if (i46 == 0) {
                                        format = LocaleController.getString("BlockedEmpty", R.string.BlockedEmpty);
                                    } else if (i46 > 0) {
                                        format = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(i46));
                                    } else {
                                        str = "";
                                        z13 = true;
                                        p8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                                    }
                                    str = format;
                                    p8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        p8Var.f(16, z13, z15);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.c;
        return new org.telegram.ui.Components.ik0(i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 4 ? i9 != 5 ? new org.telegram.ui.Cells.t8(context) : new org.telegram.ui.Cells.p8(context) : new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null) : new org.telegram.ui.Cells.m4(context) : new org.telegram.ui.Cells.b9(context) : new org.telegram.ui.Cells.ba(context));
    }
}
