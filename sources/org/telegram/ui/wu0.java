package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class wu0 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final /* synthetic */ PrivacySettingsActivity d;

    public wu0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
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
        int i35;
        int b10 = c1Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i10 = privacySettingsActivity.passcodeRow;
        if (b10 != i10) {
            i11 = privacySettingsActivity.passwordRow;
            if (b10 != i11) {
                i12 = privacySettingsActivity.passkeysRow;
                if (b10 != i12) {
                    i13 = privacySettingsActivity.blockedRow;
                    if (b10 != i13 && b10 != privacySettingsActivity.s) {
                        i14 = privacySettingsActivity.secretWebpageRow;
                        if (b10 != i14) {
                            i15 = privacySettingsActivity.webSessionsRow;
                            if (b10 != i15 && (b10 != privacySettingsActivity.n || privacySettingsActivity.getContactsController().t(1))) {
                                i16 = privacySettingsActivity.lastSeenRow;
                                if (b10 != i16 || privacySettingsActivity.getContactsController().t(0)) {
                                    i17 = privacySettingsActivity.callsRow;
                                    if (b10 != i17 || privacySettingsActivity.getContactsController().t(2)) {
                                        i18 = privacySettingsActivity.profilePhotoRow;
                                        if (b10 != i18 || privacySettingsActivity.getContactsController().t(4)) {
                                            i19 = privacySettingsActivity.bioRow;
                                            if (b10 != i19 || privacySettingsActivity.getContactsController().t(9)) {
                                                i20 = privacySettingsActivity.musicRow;
                                                if (b10 != i20 || privacySettingsActivity.getContactsController().t(14)) {
                                                    i21 = privacySettingsActivity.birthdayRow;
                                                    if (b10 != i21 || privacySettingsActivity.getContactsController().t(11)) {
                                                        i22 = privacySettingsActivity.giftsRow;
                                                        if (b10 != i22 || privacySettingsActivity.getContactsController().t(12)) {
                                                            i23 = privacySettingsActivity.forwardsRow;
                                                            if (b10 != i23 || privacySettingsActivity.getContactsController().t(5)) {
                                                                i24 = privacySettingsActivity.phoneNumberRow;
                                                                if (b10 != i24 || privacySettingsActivity.getContactsController().t(6)) {
                                                                    i25 = privacySettingsActivity.voicesRow;
                                                                    if (b10 != i25 || privacySettingsActivity.getContactsController().t(8)) {
                                                                        i26 = privacySettingsActivity.noncontactsRow;
                                                                        if (b10 != i26) {
                                                                            i27 = privacySettingsActivity.deleteAccountRow;
                                                                            if (b10 == i27 && privacySettingsActivity.getContactsController().G == 2) {
                                                                                return true;
                                                                            }
                                                                            i28 = privacySettingsActivity.newChatsRow;
                                                                            if (b10 != i28 || privacySettingsActivity.getContactsController().F != 2) {
                                                                                i29 = privacySettingsActivity.emailLoginRow;
                                                                                if (b10 != i29) {
                                                                                    i30 = privacySettingsActivity.paymentsClearRow;
                                                                                    if (b10 != i30) {
                                                                                        i31 = privacySettingsActivity.secretMapRow;
                                                                                        if (b10 != i31) {
                                                                                            i32 = privacySettingsActivity.contactsSyncRow;
                                                                                            if (b10 != i32 && b10 != privacySettingsActivity.G) {
                                                                                                i33 = privacySettingsActivity.contactsDeleteRow;
                                                                                                if (b10 != i33) {
                                                                                                    i34 = privacySettingsActivity.contactsSuggestRow;
                                                                                                    if (b10 != i34) {
                                                                                                        i35 = privacySettingsActivity.autoDeleteMesages;
                                                                                                        if (b10 != i35 && b10 != privacySettingsActivity.H) {
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
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.d.O;
    }

    @Override // s4.g0
    public final int d(int i10) {
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
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i10 == privacySettingsActivity.G) {
            return 0;
        }
        i11 = privacySettingsActivity.lastSeenRow;
        if (i10 == i11) {
            return 0;
        }
        i12 = privacySettingsActivity.phoneNumberRow;
        if (i10 == i12) {
            return 0;
        }
        i13 = privacySettingsActivity.deleteAccountRow;
        if (i10 == i13) {
            return 0;
        }
        i14 = privacySettingsActivity.webSessionsRow;
        if (i10 == i14 || i10 == privacySettingsActivity.n) {
            return 0;
        }
        i15 = privacySettingsActivity.paymentsClearRow;
        if (i10 == i15) {
            return 0;
        }
        i16 = privacySettingsActivity.secretMapRow;
        if (i10 == i16) {
            return 0;
        }
        i17 = privacySettingsActivity.contactsDeleteRow;
        if (i10 == i17 || i10 == privacySettingsActivity.H) {
            return 0;
        }
        if (i10 == privacySettingsActivity.h || i10 == privacySettingsActivity.E || i10 == privacySettingsActivity.r || i10 == privacySettingsActivity.w || i10 == privacySettingsActivity.N || i10 == privacySettingsActivity.I || i10 == privacySettingsActivity.L || i10 == privacySettingsActivity.y) {
            return 1;
        }
        if (i10 == 0 || i10 == privacySettingsActivity.D || i10 == privacySettingsActivity.f || i10 == privacySettingsActivity.M || i10 == privacySettingsActivity.F || i10 == privacySettingsActivity.K || i10 == privacySettingsActivity.x) {
            return 2;
        }
        i18 = privacySettingsActivity.secretWebpageRow;
        if (i10 == i18) {
            return 3;
        }
        i19 = privacySettingsActivity.contactsSyncRow;
        if (i10 == i19) {
            return 3;
        }
        i20 = privacySettingsActivity.contactsSuggestRow;
        if (i10 == i20) {
            return 3;
        }
        i21 = privacySettingsActivity.newChatsRow;
        if (i10 == i21) {
            return 3;
        }
        if (i10 == privacySettingsActivity.J) {
            return 4;
        }
        i22 = privacySettingsActivity.autoDeleteMesages;
        if (i10 == i22 || i10 == privacySettingsActivity.s) {
            return 5;
        }
        i23 = privacySettingsActivity.emailLoginRow;
        if (i10 == i23) {
            return 5;
        }
        i24 = privacySettingsActivity.passwordRow;
        if (i10 == i24) {
            return 5;
        }
        i25 = privacySettingsActivity.passkeysRow;
        if (i10 == i25) {
            return 5;
        }
        i26 = privacySettingsActivity.passcodeRow;
        if (i10 == i26) {
            return 5;
        }
        i27 = privacySettingsActivity.blockedRow;
        return i10 == i27 ? 5 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
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
        boolean z10;
        int i27;
        String L0;
        boolean z11;
        int i28;
        String B0;
        String B02;
        boolean z12;
        String B03;
        String B04;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        String str;
        String format;
        String L02;
        String str2;
        String L03;
        int i39;
        String str3;
        boolean z13;
        String str4;
        String format2;
        String str5;
        String c02;
        int i40 = c1Var.f;
        View view = c1Var.a;
        String str6 = null;
        boolean z14 = false;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i40 == 0) {
            int i41 = 16;
            boolean z15 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i10;
            view.setTag(Integer.valueOf(i10));
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            x9Var.setBetterLayout(true);
            i11 = privacySettingsActivity.webSessionsRow;
            if (i10 == i11) {
                x9Var.b(org.telegram.messenger.cd.L0(2131742937, "WebSessionsTitle"), false);
            } else {
                i12 = privacySettingsActivity.phoneNumberRow;
                if (i10 == i12) {
                    if (privacySettingsActivity.getContactsController().t(6)) {
                        z10 = true;
                        i41 = 30;
                    } else {
                        str6 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 6);
                        z10 = false;
                    }
                    x9Var.c(org.telegram.messenger.cd.L0(2131746805, "PrivacyPhone"), str6, false, true);
                } else {
                    i13 = privacySettingsActivity.lastSeenRow;
                    if (i10 == i13) {
                        if (privacySettingsActivity.getContactsController().t(0)) {
                            z10 = true;
                            i41 = 30;
                        } else {
                            str6 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 0);
                            z10 = false;
                        }
                        x9Var.c(org.telegram.messenger.cd.L0(2131746830, "PrivacyLastSeen"), str6, false, true);
                    } else {
                        if (i10 == privacySettingsActivity.n) {
                            if (privacySettingsActivity.getContactsController().t(1)) {
                                B04 = null;
                                z12 = true;
                                i41 = 30;
                            } else {
                                B04 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 1);
                                z12 = false;
                            }
                            x9Var.c(org.telegram.messenger.cd.L0(2131746832, null), B04, false, false);
                        } else {
                            i14 = privacySettingsActivity.callsRow;
                            if (i10 == i14) {
                                if (privacySettingsActivity.getContactsController().t(2)) {
                                    z10 = true;
                                    i41 = 30;
                                } else {
                                    str6 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 2);
                                    z10 = false;
                                }
                                x9Var.c(org.telegram.messenger.cd.L0(2131752596, "Calls"), str6, false, true);
                            } else {
                                i15 = privacySettingsActivity.profilePhotoRow;
                                if (i10 == i15) {
                                    if (privacySettingsActivity.getContactsController().t(4)) {
                                        z10 = true;
                                        i41 = 30;
                                    } else {
                                        str6 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 4);
                                        z10 = false;
                                    }
                                    x9Var.c(org.telegram.messenger.cd.L0(2131746792, "PrivacyProfilePhoto"), str6, false, true);
                                } else {
                                    i16 = privacySettingsActivity.bioRow;
                                    if (i10 == i16) {
                                        if (privacySettingsActivity.getContactsController().t(9)) {
                                            z10 = true;
                                            i41 = 30;
                                        } else {
                                            str6 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 9);
                                            z10 = false;
                                        }
                                        x9Var.c(org.telegram.messenger.cd.L0(2131746882, "PrivacyBio"), str6, false, true);
                                    } else {
                                        i17 = privacySettingsActivity.musicRow;
                                        if (i10 == i17) {
                                            if (privacySettingsActivity.getContactsController().t(14)) {
                                                B03 = null;
                                                z12 = true;
                                                i41 = 30;
                                            } else {
                                                B03 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 14);
                                                z12 = false;
                                            }
                                            x9Var.c(org.telegram.messenger.cd.L0(2131746819, null), B03, false, true);
                                        } else {
                                            i18 = privacySettingsActivity.birthdayRow;
                                            if (i10 == i18) {
                                                if (privacySettingsActivity.getContactsController().t(11)) {
                                                    B02 = null;
                                                    z12 = true;
                                                    i41 = 30;
                                                } else {
                                                    B02 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 11);
                                                    z12 = false;
                                                }
                                                x9Var.c(org.telegram.messenger.cd.L0(2131746875, null), B02, false, true);
                                            } else {
                                                i19 = privacySettingsActivity.giftsRow;
                                                if (i10 == i19) {
                                                    if (privacySettingsActivity.getContactsController().t(12)) {
                                                        B0 = null;
                                                        z11 = true;
                                                        i41 = 30;
                                                    } else {
                                                        B0 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 12);
                                                        z11 = false;
                                                    }
                                                    x9Var.c(org.telegram.messenger.cd.L0(2131746844, null), B0, false, true);
                                                } else {
                                                    i20 = privacySettingsActivity.forwardsRow;
                                                    if (i10 == i20) {
                                                        if (privacySettingsActivity.getContactsController().t(5)) {
                                                            z10 = true;
                                                            i41 = 30;
                                                        } else {
                                                            str6 = PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 5);
                                                            z10 = false;
                                                        }
                                                        x9Var.c(org.telegram.messenger.cd.L0(2131746852, "PrivacyForwards"), str6, false, true);
                                                    } else {
                                                        i21 = privacySettingsActivity.voicesRow;
                                                        int i42 = 2131747769;
                                                        if (i10 == i21) {
                                                            if (privacySettingsActivity.getContactsController().t(8)) {
                                                                L0 = null;
                                                                z11 = true;
                                                                i41 = 30;
                                                            } else {
                                                                L0 = !privacySettingsActivity.getUserConfig().q() ? org.telegram.messenger.cd.L0(2131747769, null) : PrivacySettingsActivity.B0(privacySettingsActivity.getAccountInstance(), 8);
                                                                z11 = false;
                                                            }
                                                            SpannableStringBuilder y02 = PrivacySettingsActivity.y0(privacySettingsActivity, org.telegram.messenger.cd.L0(2131746773, null));
                                                            i28 = privacySettingsActivity.noncontactsRow;
                                                            x9Var.c(y02, L0, false, i28 != -1);
                                                            org.telegram.ui.ActionBar.a7.t(x9Var.getValueImageView(), org.telegram.ui.ActionBar.t6.m6, null, PorterDuff.Mode.MULTIPLY);
                                                        } else {
                                                            i22 = privacySettingsActivity.noncontactsRow;
                                                            if (i10 == i22) {
                                                                if (privacySettingsActivity.Y) {
                                                                    i42 = 2131751779;
                                                                } else if (privacySettingsActivity.X) {
                                                                    i42 = 2131751778;
                                                                }
                                                                String L04 = org.telegram.messenger.cd.L0(i42, null);
                                                                CharSequence y03 = (!privacySettingsActivity.getMessagesController().K5 || privacySettingsActivity.getMessagesController().M6) ? PrivacySettingsActivity.y0(privacySettingsActivity, org.telegram.messenger.cd.L0(2131746825, null)) : org.telegram.messenger.cd.L0(2131746825, null);
                                                                i27 = privacySettingsActivity.musicRow;
                                                                x9Var.c(y03, L04, false, i27 != -1);
                                                            } else if (i10 == privacySettingsActivity.G) {
                                                                x9Var.b(org.telegram.messenger.cd.L0(2131744262, "TelegramPassport"), true);
                                                            } else {
                                                                i23 = privacySettingsActivity.deleteAccountRow;
                                                                if (i10 == i23) {
                                                                    if (privacySettingsActivity.getContactsController().G != 2) {
                                                                        z10 = true;
                                                                    } else {
                                                                        int i43 = privacySettingsActivity.getContactsController().H;
                                                                        str6 = i43 <= 182 ? org.telegram.messenger.cd.G(i43 / 30, "Months", new Object[0]) : i43 == 365 ? org.telegram.messenger.cd.G(12, "Months", new Object[0]) : i43 == 548 ? org.telegram.messenger.cd.G(18, "Months", new Object[0]) : i43 == 730 ? org.telegram.messenger.cd.G(24, "Months", new Object[0]) : i43 > 30 ? org.telegram.messenger.cd.G((int) Math.round(i43 / 30.0d), "Months", new Object[0]) : org.telegram.messenger.cd.G(i43, "Days", new Object[0]);
                                                                        z10 = false;
                                                                    }
                                                                    x9Var.c(org.telegram.messenger.cd.L0(2131751596, "DeleteAccountIfAwayFor3"), str6, privacySettingsActivity.Q, false);
                                                                    privacySettingsActivity.Q = false;
                                                                } else {
                                                                    i24 = privacySettingsActivity.paymentsClearRow;
                                                                    if (i10 == i24) {
                                                                        x9Var.b(org.telegram.messenger.cd.L0(2131746812, "PrivacyPaymentsClear"), true);
                                                                    } else if (i10 == privacySettingsActivity.H) {
                                                                        x9Var.b(org.telegram.messenger.cd.L0(2131746877, null), true);
                                                                    } else {
                                                                        i25 = privacySettingsActivity.secretMapRow;
                                                                        if (i10 == i25) {
                                                                            int i44 = org.telegram.messenger.tz.o0;
                                                                            x9Var.c(org.telegram.messenger.cd.L0(2131748704, "MapPreviewProvider"), i44 != 0 ? i44 != 1 ? i44 != 2 ? org.telegram.messenger.cd.L0(2131748699, "MapPreviewProviderYandex") : org.telegram.messenger.cd.L0(2131748702, "MapPreviewProviderNobody") : org.telegram.messenger.cd.L0(2131748703, "MapPreviewProviderGoogle") : org.telegram.messenger.cd.L0(2131748701, "MapPreviewProviderTelegram"), privacySettingsActivity.R, true);
                                                                            privacySettingsActivity.R = false;
                                                                        } else {
                                                                            i26 = privacySettingsActivity.contactsDeleteRow;
                                                                            if (i10 == i26) {
                                                                                x9Var.b(org.telegram.messenger.cd.L0(2131744322, "SyncContactsDelete"), true);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                z14 = z11;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        z14 = z12;
                    }
                }
                z14 = z10;
            }
            x9Var.r = z14;
            x9Var.D = i41;
            if (z15) {
                x9Var.E = true;
            } else {
                x9Var.y = z14 ? 1.0f : 0.0f;
            }
            x9Var.invalidate();
            return;
        }
        if (i40 == 1) {
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i10 == privacySettingsActivity.E) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131751598, "DeleteAccountHelp"));
                return;
            }
            if (i10 == privacySettingsActivity.r) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131749390, "GroupsAndChannelsHelp"));
                return;
            }
            if (i10 == privacySettingsActivity.w) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131745569, "SessionsSettingsInfo"));
                return;
            }
            if (i10 == privacySettingsActivity.N) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131745700, "SecretWebPageInfo"));
                return;
            }
            if (i10 == privacySettingsActivity.I) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131746864, "PrivacyBotsInfo"));
                return;
            }
            if (i10 == privacySettingsActivity.h) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131746831, null));
                return;
            } else if (i10 == privacySettingsActivity.L) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131744436, "SuggestContactsInfo"));
                return;
            } else {
                if (i10 == privacySettingsActivity.y) {
                    b9Var.setText(org.telegram.messenger.cd.L0(2131754170, "ArchiveAndMuteInfo"));
                    return;
                }
                return;
            }
        }
        if (i40 == 2) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
            if (i10 == privacySettingsActivity.f) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746784, "PrivacyTitle"));
                return;
            }
            if (i10 == 0) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131745699, "SecurityTitle"));
                return;
            }
            if (i10 == privacySettingsActivity.D) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131751519, "DeleteMyAccount"));
                return;
            }
            if (i10 == privacySettingsActivity.M) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131745712, "SecretChat"));
                return;
            }
            if (i10 == privacySettingsActivity.F) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131746865, "PrivacyBots"));
                return;
            } else if (i10 == privacySettingsActivity.K) {
                p4Var.setText(org.telegram.messenger.cd.L0(2131751780, "Contacts"));
                return;
            } else {
                if (i10 == privacySettingsActivity.x) {
                    p4Var.setText(org.telegram.messenger.cd.L0(2131748299, "NewChatsFromNonContacts"));
                    return;
                }
                return;
            }
        }
        if (i40 == 3) {
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            i29 = privacySettingsActivity.secretWebpageRow;
            if (i10 == i29) {
                t8Var.f(org.telegram.messenger.cd.L0(2131745701, "SecretWebPage"), privacySettingsActivity.getMessagesController().G2 == 1, false);
                return;
            }
            i30 = privacySettingsActivity.contactsSyncRow;
            if (i10 == i30) {
                t8Var.f(org.telegram.messenger.cd.L0(2131744324, "SyncContacts"), privacySettingsActivity.T, true);
                return;
            }
            i31 = privacySettingsActivity.contactsSuggestRow;
            if (i10 == i31) {
                t8Var.f(org.telegram.messenger.cd.L0(2131744438, "SuggestContacts"), privacySettingsActivity.V, false);
                return;
            }
            i32 = privacySettingsActivity.newChatsRow;
            if (i10 == i32) {
                t8Var.f(org.telegram.messenger.cd.L0(2131754171, "ArchiveAndMute"), privacySettingsActivity.W, false);
                return;
            }
            return;
        }
        if (i40 != 5) {
            return;
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
        boolean z16 = view.getTag() != null && ((Integer) view.getTag()).intValue() == i10;
        view.setTag(Integer.valueOf(i10));
        p8Var.setPrioritizeTitleOverValue(false);
        org.telegram.ui.Components.f6 f6Var = p8Var.c;
        i33 = privacySettingsActivity.autoDeleteMesages;
        if (i10 == i33) {
            int i45 = privacySettingsActivity.getUserConfig().p0;
            if (i45 == -1) {
                c02 = null;
                z14 = true;
            } else {
                c02 = i45 > 0 ? org.telegram.messenger.cd.c0(i45 * 60) : org.telegram.messenger.cd.L0(2131747455, "PasswordOff");
            }
            p8Var.u(org.telegram.messenger.cd.L0(2131753850, "AutoDeleteMessages"), c02, true, R.drawable.msg2_autodelete, true);
        } else {
            String str7 = "";
            if (i10 == privacySettingsActivity.s) {
                if (privacySettingsActivity.a0.n0() != 0) {
                    format2 = String.format(org.telegram.messenger.cd.D0().y, "%d", Integer.valueOf(privacySettingsActivity.a0.n0()));
                } else if (privacySettingsActivity.getMessagesController().a == 0) {
                    str5 = "";
                    z14 = true;
                    privacySettingsActivity.getMessagesController().a = privacySettingsActivity.a0.n0();
                    p8Var.u(org.telegram.messenger.cd.L0(2131745568, null), str5, true, R.drawable.msg2_devices, false);
                } else {
                    format2 = String.format(org.telegram.messenger.cd.D0().y, "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().a));
                }
                str5 = format2;
                privacySettingsActivity.getMessagesController().a = privacySettingsActivity.a0.n0();
                p8Var.u(org.telegram.messenger.cd.L0(2131745568, null), str5, true, R.drawable.msg2_devices, false);
            } else {
                i34 = privacySettingsActivity.emailLoginRow;
                if (i10 == i34) {
                    TL_account.Password password = privacySettingsActivity.d;
                    if (password == null) {
                        z13 = true;
                        str4 = str7;
                    } else {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(password.login_email_pattern);
                        int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                        int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                            org.telegram.ui.Components.yz0 yz0Var = new org.telegram.ui.Components.yz0();
                            yz0Var.a |= 256;
                            yz0Var.b = indexOf;
                            int i46 = lastIndexOf + 1;
                            yz0Var.c = i46;
                            valueOf.setSpan(new org.telegram.ui.Components.zz0(yz0Var, 0), indexOf, i46, 0);
                        }
                        z13 = false;
                        str4 = valueOf;
                    }
                    p8Var.setPrioritizeTitleOverValue(true);
                    String L05 = org.telegram.messenger.cd.L0(2131751203, null);
                    p8Var.x = p8Var.getDefaultImageLeft();
                    p8Var.s = p8Var.c(false);
                    org.telegram.ui.ActionBar.u5 u5Var = p8Var.a;
                    u5Var.l(L05, false);
                    u5Var.i(null);
                    org.telegram.ui.ActionBar.u5 u5Var2 = p8Var.d;
                    u5Var2.setVisibility(0);
                    u5Var2.l(str4, false);
                    f6Var.setVisibility(8);
                    p8Var.h.setVisibility(8);
                    org.telegram.ui.Components.ei0 ei0Var = p8Var.e;
                    ei0Var.setVisibility(0);
                    ei0Var.setTranslationX(0.0f);
                    ei0Var.setTranslationY(0.0f);
                    ei0Var.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
                    ei0Var.setImageResource(R.drawable.msg2_email);
                    p8Var.r = true;
                    p8Var.setWillNotDraw(false);
                    Switch r02 = p8Var.f;
                    if (r02 != null) {
                        r02.setVisibility(8);
                    }
                    org.telegram.ui.Components.d5 d5Var = p8Var.K;
                    if (d5Var != null) {
                        d5Var.g(null, false);
                    }
                    z14 = z13;
                } else {
                    i35 = privacySettingsActivity.passwordRow;
                    if (i10 == i35) {
                        TL_account.Password password2 = privacySettingsActivity.d;
                        int i47 = R.drawable.menu_2sv;
                        if (password2 == null) {
                            i39 = R.drawable.menu_2sv;
                            str3 = "";
                            z14 = true;
                        } else {
                            if (password2.has_password) {
                                L03 = org.telegram.messenger.cd.L0(2131747454, null);
                                i47 = R.drawable.menu_2sv_on;
                            } else {
                                L03 = org.telegram.messenger.cd.L0(2131747455, null);
                            }
                            i39 = i47;
                            str3 = L03;
                        }
                        p8Var.u(org.telegram.messenger.cd.L0(2131743963, null), str3, true, i39, true);
                    } else {
                        i36 = privacySettingsActivity.passkeysRow;
                        if (i10 == i36) {
                            ArrayList arrayList = privacySettingsActivity.e;
                            if (arrayList == null) {
                                str2 = "";
                                z14 = true;
                            } else {
                                if (arrayList.size() == 1 && f6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.e.get(0)).name) < org.telegram.messenger.i0.q.x / 3.0f) {
                                    L02 = ((TL_account.Passkey) privacySettingsActivity.e.get(0)).name;
                                } else if (privacySettingsActivity.e.size() > 0) {
                                    L02 = privacySettingsActivity.e.size() + "";
                                } else {
                                    L02 = org.telegram.messenger.cd.L0(2131747455, null);
                                }
                                str2 = L02;
                            }
                            p8Var.u(org.telegram.messenger.cd.L0(2131747667, null), str2, true, R.drawable.msg2_permissions, true);
                        } else {
                            i37 = privacySettingsActivity.passcodeRow;
                            if (i10 == i37) {
                                p8Var.u(org.telegram.messenger.cd.L0(2131747673, null), org.telegram.messenger.tz.s.length() != 0 ? org.telegram.messenger.cd.L0(2131747454, null) : org.telegram.messenger.cd.L0(2131747455, null), true, R.drawable.msg2_secret, true);
                            } else {
                                i38 = privacySettingsActivity.blockedRow;
                                if (i10 == i38) {
                                    int i48 = privacySettingsActivity.getMessagesController().H0;
                                    if (i48 == 0) {
                                        format = org.telegram.messenger.cd.L0(2131753682, "BlockedEmpty");
                                    } else if (i48 > 0) {
                                        format = String.format(org.telegram.messenger.cd.D0().y, "%d", Integer.valueOf(i48));
                                    } else {
                                        str = "";
                                        z14 = true;
                                        p8Var.u(org.telegram.messenger.cd.L0(2131753681, "BlockedUsers"), str, true, R.drawable.msg2_block2, true);
                                    }
                                    str = format;
                                    p8Var.u(org.telegram.messenger.cd.L0(2131753681, "BlockedUsers"), str, true, R.drawable.msg2_block2, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        p8Var.h(16, z14, z16);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return new org.telegram.ui.Components.ck0(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 5 ? new org.telegram.ui.Cells.t8(context) : new org.telegram.ui.Cells.p8(context) : new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.f1) null) : new org.telegram.ui.Cells.p4(context) : new org.telegram.ui.Cells.b9(context) : new org.telegram.ui.Cells.x9(context));
    }
}
