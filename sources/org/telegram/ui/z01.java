package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class z01 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ b11 d;

    public z01(b11 b11Var, Context context) {
        this.d = b11Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        b11 b11Var = this.d;
        if (b10 == b11Var.E) {
            return b11Var.n;
        }
        if (b1Var.b() == b11Var.W) {
            return true;
        }
        switch (b1Var.f) {
        }
        return b11Var.n;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.Y;
    }

    @Override // s4.g0
    public final int j(int i10) {
        b11 b11Var = this.d;
        if (i10 == b11Var.v || i10 == b11Var.K || i10 == b11Var.T || i10 == b11Var.P) {
            return 0;
        }
        if (i10 == b11Var.F || i10 == b11Var.G || i10 == b11Var.I || i10 == b11Var.H || i10 == b11Var.Q || i10 == b11Var.R || i10 == b11Var.W) {
            return 1;
        }
        if (i10 == b11Var.N || i10 == b11Var.V || i10 == b11Var.J || i10 == b11Var.S) {
            return 2;
        }
        if (i10 == b11Var.U) {
            return 3;
        }
        if (i10 == b11Var.L || i10 == b11Var.M) {
            return 4;
        }
        if (i10 == b11Var.w) {
            return 5;
        }
        if (i10 == b11Var.x || i10 == b11Var.X) {
            return 6;
        }
        return (i10 == b11Var.y || i10 == b11Var.E || i10 == b11Var.O) ? 7 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        TLObject chat;
        int i15;
        int i16;
        b11 b11Var = this.d;
        long j10 = b11Var.f;
        long j11 = b11Var.e;
        int i17 = b1Var.f;
        View view = b1Var.a;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 != b11Var.v) {
                    if (i10 != b11Var.K) {
                        if (i10 != b11Var.T) {
                            if (i10 == b11Var.P) {
                                l4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                                break;
                            }
                        } else {
                            l4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                            break;
                        }
                    } else {
                        l4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                        break;
                    }
                } else {
                    l4Var.setText(LocaleController.getString(R.string.General));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.n2) b11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 != b11Var.W) {
                    baVar.setTextColor(b11Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6));
                    if (i10 != b11Var.F) {
                        if (i10 != b11Var.Q) {
                            if (i10 != b11Var.G) {
                                if (i10 != b11Var.I) {
                                    if (i10 != b11Var.H) {
                                        if (i10 == b11Var.R) {
                                            int c10 = org.telegram.messenger.g0.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                                            if (c10 != 0 && c10 != 4) {
                                                if (c10 != 1) {
                                                    if (c10 != 2) {
                                                        if (c10 == 3) {
                                                            baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                                                    break;
                                                }
                                            } else {
                                                baVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c11 = org.telegram.messenger.g0.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int c12 = org.telegram.messenger.g0.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (c11 != 0) {
                                            baVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c11), LocaleController.formatPluralString("Minutes", c12 / 60, new Object[0])), false, b11Var.I != -1);
                                            break;
                                        } else {
                                            baVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, b11Var.I != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c13 = org.telegram.messenger.g0.c("priority_", sharedPrefKey, notificationsSettings, 3);
                                    if (c13 != 0) {
                                        if (c13 != 1 && c13 != 2) {
                                            if (c13 != 3) {
                                                if (c13 != 4) {
                                                    if (c13 == 5) {
                                                        baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                                                    break;
                                                }
                                            } else {
                                                baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                                                break;
                                            }
                                        } else {
                                            baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                                            break;
                                        }
                                    } else {
                                        baVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c14 = org.telegram.messenger.g0.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String string = LocaleController.getString(R.string.Vibrate);
                                                String string2 = LocaleController.getString(R.string.Long);
                                                if (b11Var.H == -1 && b11Var.I == -1) {
                                                    r9 = false;
                                                }
                                                baVar.c(string, string2, false, r9);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (b11Var.H == -1 && b11Var.I == -1) {
                                                r9 = false;
                                            }
                                            baVar.c(string3, string4, false, r9);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (b11Var.H == -1 && b11Var.I == -1) {
                                            r9 = false;
                                        }
                                        baVar.c(string5, string6, false, r9);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (b11Var.H == -1 && b11Var.I == -1) {
                                        r9 = false;
                                    }
                                    baVar.c(string7, string8, false, r9);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(r4.c.h("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            baVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(r4.c.h("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j12 != 0) {
                            TLRPC.Document c15 = b11Var.getMediaDataController().ringtoneDataStore.c(j12);
                            string10 = c15 == null ? LocaleController.getString(R.string.CustomSound) : mk0.a0(c15, c15.file_name_fixed);
                        } else if (string10.equals("NoSound")) {
                            string10 = LocaleController.getString(R.string.NoSound);
                        } else if (string10.equals("Default")) {
                            string10 = LocaleController.getString(R.string.SoundDefault);
                        }
                        baVar.c(LocaleController.getString(R.string.Sound), string10, false, true);
                        break;
                    }
                } else {
                    baVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    baVar.setTextColor(b11Var.getThemedColor(org.telegram.ui.ActionBar.h6.q7));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                d9Var.setFixedSize(0);
                if (i10 != b11Var.N) {
                    if (i10 != b11Var.V) {
                        if (i10 != b11Var.J) {
                            if (i10 == b11Var.S) {
                                d9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (b11Var.I != -1) {
                            d9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                            break;
                        } else {
                            d9Var.setText("");
                            break;
                        }
                    } else {
                        d9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                        break;
                    }
                } else {
                    d9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i12 = ((org.telegram.ui.ActionBar.n2) b11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(sharedPrefKey2);
                int c16 = notificationsSettings2.contains(sb2.toString()) ? org.telegram.messenger.g0.c("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j11) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.x8.f[i18] == c16) {
                            c16 = org.telegram.ui.Cells.x8.e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                x8Var.b(c16, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                i13 = ((org.telegram.ui.ActionBar.n2) b11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int c17 = org.telegram.messenger.g0.c("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (c17 == 0) {
                    c17 = notificationsSettings3.getInt(DialogObject.isChatDialog(j11) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != b11Var.L) {
                    if (i10 == b11Var.M) {
                        j6Var.c(LocaleController.getString(R.string.PopupDisabled), c17 == 2, false);
                        j6Var.setTag(2);
                        break;
                    }
                } else {
                    j6Var.c(LocaleController.getString(R.string.PopupEnabled), c17 == 1, true);
                    j6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
                if (DialogObject.isUserDialog(j11)) {
                    i15 = ((org.telegram.ui.ActionBar.n2) b11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j11));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.n2) b11Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j11));
                }
                uaVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
                boolean z10 = i10 > 0;
                r9 = i10 < b11Var.Y - 1;
                if (z6Var.c != z10 || z6Var.d != r9) {
                    z6Var.c = z10;
                    z6Var.d = r9;
                    int i19 = z6Var.b;
                    if (i19 != 0) {
                        z6Var.setBackgroundColor(i19);
                        break;
                    } else {
                        z6Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                i16 = ((org.telegram.ui.ActionBar.n2) b11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i10 != b11Var.y) {
                    if (i10 != b11Var.E) {
                        if (i10 == b11Var.O) {
                            String h = r4.c.h(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j11, j10));
                            if (b11Var.Z || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                                r10 = true;
                            }
                            v8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(h, r10), true);
                            break;
                        }
                    } else {
                        String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                        v8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey3, true), true);
                        break;
                    }
                } else {
                    v8Var.f(LocaleController.getString(R.string.Notifications), b11Var.n, true);
                    break;
                }
                break;
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        b11 b11Var = this.d;
        org.telegram.ui.ActionBar.d6 d6Var = b11Var.d;
        Context context = this.c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(context, d6Var);
                l4Var.setBackgroundColor(b11Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                break;
            case 1:
                l4Var = new org.telegram.ui.Cells.ba(context, 0, d6Var);
                l4Var.setBackgroundColor(b11Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.d9(context, d6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.x8(context, d6Var);
                l4Var.setBackgroundColor(b11Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                break;
            case 4:
                l4Var = new org.telegram.ui.Cells.j6(context, d6Var);
                l4Var.setBackgroundColor(b11Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                break;
            case 5:
                l4Var = new org.telegram.ui.Cells.ua(context, d6Var);
                l4Var.setBackgroundColor(b11Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                break;
            default:
                l4Var = new org.telegram.ui.Cells.v8(context, d6Var);
                l4Var.setBackgroundColor(b11Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(l4Var, l4Var, -1, -2);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        int i10 = b1Var.f;
        View view = b1Var.a;
        b11 b11Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.l4) view).a(null, b11Var.n);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            if (b1Var.b() == b11Var.W) {
                baVar.a(null, true);
                return;
            } else {
                baVar.a(null, b11Var.n);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.d9) view).c(null, b11Var.n);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.x8) view).a(null, b11Var.n);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.j6) view).b(null, b11Var.n);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
        if (b1Var.b() == b11Var.E) {
            v8Var.e(null, b11Var.n);
        } else if (b1Var.b() == b11Var.O) {
            v8Var.e(null, b11Var.n);
        } else {
            v8Var.e(null, true);
        }
    }
}
