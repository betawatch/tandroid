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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class r01 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ t01 d;

    public r01(t01 t01Var, Context context) {
        this.d = t01Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int b10 = n1Var.b();
        t01 t01Var = this.d;
        if (b10 == t01Var.A) {
            return t01Var.n;
        }
        if (n1Var.b() == t01Var.S) {
            return true;
        }
        switch (n1Var.f) {
        }
        return t01Var.n;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.U;
    }

    @Override // f2.p0
    public final int j(int i10) {
        t01 t01Var = this.d;
        if (i10 == t01Var.v || i10 == t01Var.G || i10 == t01Var.P || i10 == t01Var.L) {
            return 0;
        }
        if (i10 == t01Var.B || i10 == t01Var.C || i10 == t01Var.E || i10 == t01Var.D || i10 == t01Var.M || i10 == t01Var.N || i10 == t01Var.S) {
            return 1;
        }
        if (i10 == t01Var.J || i10 == t01Var.R || i10 == t01Var.F || i10 == t01Var.O) {
            return 2;
        }
        if (i10 == t01Var.Q) {
            return 3;
        }
        if (i10 == t01Var.H || i10 == t01Var.I) {
            return 4;
        }
        if (i10 == t01Var.w) {
            return 5;
        }
        if (i10 == t01Var.x || i10 == t01Var.T) {
            return 6;
        }
        return (i10 == t01Var.y || i10 == t01Var.A || i10 == t01Var.K) ? 7 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        TLObject chat;
        int i15;
        int i16;
        t01 t01Var = this.d;
        long j10 = t01Var.f;
        long j11 = t01Var.e;
        int i17 = n1Var.f;
        View view = n1Var.a;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                if (i10 != t01Var.v) {
                    if (i10 != t01Var.G) {
                        if (i10 != t01Var.P) {
                            if (i10 == t01Var.L) {
                                k4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                                break;
                            }
                        } else {
                            k4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                            break;
                        }
                    } else {
                        k4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                        break;
                    }
                } else {
                    k4Var.setText(LocaleController.getString(R.string.General));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 != t01Var.S) {
                    y9Var.setTextColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                    if (i10 != t01Var.B) {
                        if (i10 != t01Var.M) {
                            if (i10 != t01Var.C) {
                                if (i10 != t01Var.E) {
                                    if (i10 != t01Var.D) {
                                        if (i10 == t01Var.N) {
                                            int c3 = org.telegram.messenger.x3.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                                            if (c3 != 0 && c3 != 4) {
                                                if (c3 != 1) {
                                                    if (c3 != 2) {
                                                        if (c3 == 3) {
                                                            y9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        y9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    y9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                                                    break;
                                                }
                                            } else {
                                                y9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c6 = org.telegram.messenger.x3.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int c10 = org.telegram.messenger.x3.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (c6 != 0) {
                                            y9Var.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c6), LocaleController.formatPluralString("Minutes", c10 / 60, new Object[0])), false, t01Var.E != -1);
                                            break;
                                        } else {
                                            y9Var.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, t01Var.E != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c11 = org.telegram.messenger.x3.c("priority_", sharedPrefKey, notificationsSettings, 3);
                                    if (c11 != 0) {
                                        if (c11 != 1 && c11 != 2) {
                                            if (c11 != 3) {
                                                if (c11 != 4) {
                                                    if (c11 == 5) {
                                                        y9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    y9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                                                    break;
                                                }
                                            } else {
                                                y9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                                                break;
                                            }
                                        } else {
                                            y9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                                            break;
                                        }
                                    } else {
                                        y9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c12 = org.telegram.messenger.x3.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                                if (c12 != 0 && c12 != 4) {
                                    if (c12 != 1) {
                                        if (c12 != 2) {
                                            if (c12 == 3) {
                                                String string = LocaleController.getString(R.string.Vibrate);
                                                String string2 = LocaleController.getString(R.string.Long);
                                                if (t01Var.D == -1 && t01Var.E == -1) {
                                                    r9 = false;
                                                }
                                                y9Var.c(string, string2, false, r9);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (t01Var.D == -1 && t01Var.E == -1) {
                                                r9 = false;
                                            }
                                            y9Var.c(string3, string4, false, r9);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (t01Var.D == -1 && t01Var.E == -1) {
                                            r9 = false;
                                        }
                                        y9Var.c(string5, string6, false, r9);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (t01Var.D == -1 && t01Var.E == -1) {
                                        r9 = false;
                                    }
                                    y9Var.c(string7, string8, false, r9);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(u3.c.e("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            y9Var.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(u3.c.e("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j12 != 0) {
                            TLRPC.Document c13 = t01Var.getMediaDataController().ringtoneDataStore.c(j12);
                            string10 = c13 == null ? LocaleController.getString(R.string.CustomSound) : gk0.a0(c13, c13.file_name_fixed);
                        } else if (string10.equals("NoSound")) {
                            string10 = LocaleController.getString(R.string.NoSound);
                        } else if (string10.equals("Default")) {
                            string10 = LocaleController.getString(R.string.SoundDefault);
                        }
                        y9Var.c(LocaleController.getString(R.string.Sound), string10, false, true);
                        break;
                    }
                } else {
                    y9Var.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    y9Var.setTextColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                if (i10 != t01Var.J) {
                    if (i10 != t01Var.R) {
                        if (i10 != t01Var.F) {
                            if (i10 == t01Var.O) {
                                y8Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (t01Var.E != -1) {
                            y8Var.setText(LocaleController.getString(R.string.PriorityInfo));
                            break;
                        } else {
                            y8Var.setText("");
                            break;
                        }
                    } else {
                        y8Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                        break;
                    }
                } else {
                    y8Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i12 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(sharedPrefKey2);
                int c14 = notificationsSettings2.contains(sb2.toString()) ? org.telegram.messenger.x3.c("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j11) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.s8.f[i18] == c14) {
                            c14 = org.telegram.ui.Cells.s8.e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                s8Var.b(c14, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                i13 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int c15 = org.telegram.messenger.x3.c("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (c15 == 0) {
                    c15 = notificationsSettings3.getInt(DialogObject.isChatDialog(j11) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != t01Var.H) {
                    if (i10 == t01Var.I) {
                        h6Var.c(LocaleController.getString(R.string.PopupDisabled), c15 == 2, false);
                        h6Var.setTag(2);
                        break;
                    }
                } else {
                    h6Var.c(LocaleController.getString(R.string.PopupEnabled), c15 == 1, true);
                    h6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
                if (DialogObject.isUserDialog(j11)) {
                    i15 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j11));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j11));
                }
                raVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.x6 x6Var = (org.telegram.ui.Cells.x6) view;
                boolean z10 = i10 > 0;
                r9 = i10 < t01Var.U - 1;
                if (x6Var.c != z10 || x6Var.d != r9) {
                    x6Var.c = z10;
                    x6Var.d = r9;
                    int i19 = x6Var.b;
                    if (i19 != 0) {
                        x6Var.setBackgroundColor(i19);
                        break;
                    } else {
                        x6Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                i16 = ((org.telegram.ui.ActionBar.o2) t01Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i10 != t01Var.y) {
                    if (i10 != t01Var.A) {
                        if (i10 == t01Var.K) {
                            String e10 = u3.c.e(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j11, j10));
                            if (t01Var.V || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                                r10 = true;
                            }
                            q8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(e10, r10), true);
                            break;
                        }
                    } else {
                        String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                        q8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey3, true), true);
                        break;
                    }
                } else {
                    q8Var.f(LocaleController.getString(R.string.Notifications), t01Var.n, true);
                    break;
                }
                break;
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View k4Var;
        t01 t01Var = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = t01Var.d;
        Context context = this.c;
        switch (i10) {
            case 0:
                k4Var = new org.telegram.ui.Cells.k4(context, c6Var);
                k4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 1:
                k4Var = new org.telegram.ui.Cells.y9(context, 0, c6Var);
                k4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 2:
                k4Var = new org.telegram.ui.Cells.y8(context, c6Var);
                break;
            case 3:
                k4Var = new org.telegram.ui.Cells.s8(context, c6Var);
                k4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 4:
                k4Var = new org.telegram.ui.Cells.h6(context, c6Var);
                k4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 5:
                k4Var = new org.telegram.ui.Cells.ra(context, c6Var);
                k4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 6:
                k4Var = new org.telegram.ui.Cells.x6(context, (b) null);
                break;
            default:
                k4Var = new org.telegram.ui.Cells.q8(context, c6Var);
                k4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
        }
        return th.m(k4Var, k4Var, -1, -2);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        int i10 = n1Var.f;
        View view = n1Var.a;
        t01 t01Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.k4) view).a(null, t01Var.n);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
            if (n1Var.b() == t01Var.S) {
                y9Var.a(null, true);
                return;
            } else {
                y9Var.a(null, t01Var.n);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.y8) view).c(null, t01Var.n);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.s8) view).a(null, t01Var.n);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.h6) view).b(null, t01Var.n);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
        if (n1Var.b() == t01Var.A) {
            q8Var.e(null, t01Var.n);
        } else if (n1Var.b() == t01Var.K) {
            q8Var.e(null, t01Var.n);
        } else {
            q8Var.e(null, true);
        }
    }
}
