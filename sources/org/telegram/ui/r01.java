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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r01 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ t01 d;

    public r01(t01 t01Var, Context context) {
        this.d = t01Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int b10 = o1Var.b();
        t01 t01Var = this.d;
        if (b10 == t01Var.A) {
            return t01Var.n;
        }
        if (o1Var.b() == t01Var.S) {
            return true;
        }
        switch (o1Var.f) {
        }
        return t01Var.n;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.U;
    }

    @Override // f2.q0
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

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
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
        int i17 = o1Var.f;
        View view = o1Var.a;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                if (i10 != t01Var.v) {
                    if (i10 != t01Var.G) {
                        if (i10 != t01Var.P) {
                            if (i10 == t01Var.L) {
                                j4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                                break;
                            }
                        } else {
                            j4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                            break;
                        }
                    } else {
                        j4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                        break;
                    }
                } else {
                    j4Var.setText(LocaleController.getString(R.string.General));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j11, j10);
                i11 = ((org.telegram.ui.ActionBar.n2) t01Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 != t01Var.S) {
                    x9Var.setTextColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                    if (i10 != t01Var.B) {
                        if (i10 != t01Var.M) {
                            if (i10 != t01Var.C) {
                                if (i10 != t01Var.E) {
                                    if (i10 != t01Var.D) {
                                        if (i10 == t01Var.N) {
                                            int c10 = org.telegram.messenger.y1.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                                            if (c10 != 0 && c10 != 4) {
                                                if (c10 != 1) {
                                                    if (c10 != 2) {
                                                        if (c10 == 3) {
                                                            x9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        x9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    x9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                                                    break;
                                                }
                                            } else {
                                                x9Var.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c11 = org.telegram.messenger.y1.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int c12 = org.telegram.messenger.y1.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (c11 != 0) {
                                            x9Var.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c11), LocaleController.formatPluralString("Minutes", c12 / 60, new Object[0])), false, t01Var.E != -1);
                                            break;
                                        } else {
                                            x9Var.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, t01Var.E != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c13 = org.telegram.messenger.y1.c("priority_", sharedPrefKey, notificationsSettings, 3);
                                    if (c13 != 0) {
                                        if (c13 != 1 && c13 != 2) {
                                            if (c13 != 3) {
                                                if (c13 != 4) {
                                                    if (c13 == 5) {
                                                        x9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    x9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                                                    break;
                                                }
                                            } else {
                                                x9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                                                break;
                                            }
                                        } else {
                                            x9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                                            break;
                                        }
                                    } else {
                                        x9Var.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c14 = org.telegram.messenger.y1.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String string = LocaleController.getString(R.string.Vibrate);
                                                String string2 = LocaleController.getString(R.string.Long);
                                                if (t01Var.D == -1 && t01Var.E == -1) {
                                                    r9 = false;
                                                }
                                                x9Var.c(string, string2, false, r9);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (t01Var.D == -1 && t01Var.E == -1) {
                                                r9 = false;
                                            }
                                            x9Var.c(string3, string4, false, r9);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (t01Var.D == -1 && t01Var.E == -1) {
                                            r9 = false;
                                        }
                                        x9Var.c(string5, string6, false, r9);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (t01Var.D == -1 && t01Var.E == -1) {
                                        r9 = false;
                                    }
                                    x9Var.c(string7, string8, false, r9);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(s3.c.e("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            x9Var.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(s3.c.e("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j12 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j12 != 0) {
                            TLRPC.Document c15 = t01Var.getMediaDataController().ringtoneDataStore.c(j12);
                            string10 = c15 == null ? LocaleController.getString(R.string.CustomSound) : kk0.a0(c15, c15.file_name_fixed);
                        } else if (string10.equals("NoSound")) {
                            string10 = LocaleController.getString(R.string.NoSound);
                        } else if (string10.equals("Default")) {
                            string10 = LocaleController.getString(R.string.SoundDefault);
                        }
                        x9Var.c(LocaleController.getString(R.string.Sound), string10, false, true);
                        break;
                    }
                } else {
                    x9Var.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    x9Var.setTextColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.q7));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                x8Var.setFixedSize(0);
                if (i10 != t01Var.J) {
                    if (i10 != t01Var.R) {
                        if (i10 != t01Var.F) {
                            if (i10 == t01Var.O) {
                                x8Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (t01Var.E != -1) {
                            x8Var.setText(LocaleController.getString(R.string.PriorityInfo));
                            break;
                        } else {
                            x8Var.setText("");
                            break;
                        }
                    } else {
                        x8Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                        break;
                    }
                } else {
                    x8Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j11, j10);
                i12 = ((org.telegram.ui.ActionBar.n2) t01Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(sharedPrefKey2);
                int c16 = notificationsSettings2.contains(sb2.toString()) ? org.telegram.messenger.y1.c("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j11) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.r8.f[i18] == c16) {
                            c16 = org.telegram.ui.Cells.r8.e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                r8Var.b(c16, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                i13 = ((org.telegram.ui.ActionBar.n2) t01Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int c17 = org.telegram.messenger.y1.c("popup_", NotificationsController.getSharedPrefKey(j11, j10), notificationsSettings3, 0);
                if (c17 == 0) {
                    c17 = notificationsSettings3.getInt(DialogObject.isChatDialog(j11) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != t01Var.H) {
                    if (i10 == t01Var.I) {
                        g6Var.c(LocaleController.getString(R.string.PopupDisabled), c17 == 2, false);
                        g6Var.setTag(2);
                        break;
                    }
                } else {
                    g6Var.c(LocaleController.getString(R.string.PopupEnabled), c17 == 1, true);
                    g6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
                if (DialogObject.isUserDialog(j11)) {
                    i15 = ((org.telegram.ui.ActionBar.n2) t01Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j11));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.n2) t01Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j11));
                }
                raVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
                boolean z10 = i10 > 0;
                r9 = i10 < t01Var.U - 1;
                if (w6Var.c != z10 || w6Var.d != r9) {
                    w6Var.c = z10;
                    w6Var.d = r9;
                    int i19 = w6Var.b;
                    if (i19 != 0) {
                        w6Var.setBackgroundColor(i19);
                        break;
                    } else {
                        w6Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                i16 = ((org.telegram.ui.ActionBar.n2) t01Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i10 != t01Var.y) {
                    if (i10 != t01Var.A) {
                        if (i10 == t01Var.K) {
                            String e9 = s3.c.e(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j11, j10));
                            if (t01Var.V || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                                r10 = true;
                            }
                            p8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(e9, r10), true);
                            break;
                        }
                    } else {
                        String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j11, j10);
                        p8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey3, true), true);
                        break;
                    }
                } else {
                    p8Var.f(LocaleController.getString(R.string.Notifications), t01Var.n, true);
                    break;
                }
                break;
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View j4Var;
        t01 t01Var = this.d;
        org.telegram.ui.ActionBar.c6 c6Var = t01Var.d;
        Context context = this.c;
        switch (i10) {
            case 0:
                j4Var = new org.telegram.ui.Cells.j4(context, c6Var);
                j4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 1:
                j4Var = new org.telegram.ui.Cells.x9(context, 0, c6Var);
                j4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 2:
                j4Var = new org.telegram.ui.Cells.x8(context, c6Var);
                break;
            case 3:
                j4Var = new org.telegram.ui.Cells.r8(context, c6Var);
                j4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 4:
                j4Var = new org.telegram.ui.Cells.g6(context, c6Var);
                j4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 5:
                j4Var = new org.telegram.ui.Cells.ra(context, c6Var);
                j4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
            case 6:
                j4Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                break;
            default:
                j4Var = new org.telegram.ui.Cells.p8(context, c6Var);
                j4Var.setBackgroundColor(t01Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
                break;
        }
        return org.telegram.ui.Cells.pa.l(j4Var, j4Var, -1, -2);
    }

    @Override // f2.q0
    public final void y(f2.o1 o1Var) {
        int i10 = o1Var.f;
        View view = o1Var.a;
        t01 t01Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.j4) view).a(null, t01Var.n);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            if (o1Var.b() == t01Var.S) {
                x9Var.a(null, true);
                return;
            } else {
                x9Var.a(null, t01Var.n);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.x8) view).c(null, t01Var.n);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.r8) view).a(null, t01Var.n);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.g6) view).b(null, t01Var.n);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
        if (o1Var.b() == t01Var.A) {
            p8Var.e(null, t01Var.n);
        } else if (o1Var.b() == t01Var.K) {
            p8Var.e(null, t01Var.n);
        } else {
            p8Var.e(null, true);
        }
    }
}
