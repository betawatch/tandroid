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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class u11 extends org.telegram.ui.Components.xl0 {
    public final Context c;
    public final /* synthetic */ w11 d;

    public u11(w11 w11Var, Context context) {
        this.d = w11Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        w11 w11Var = this.d;
        if (b10 == w11Var.E) {
            return w11Var.n;
        }
        if (c1Var.b() == w11Var.W) {
            return true;
        }
        switch (c1Var.f) {
        }
        return w11Var.n;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.Y;
    }

    @Override // s4.h0
    public final int j(int i10) {
        w11 w11Var = this.d;
        if (i10 == w11Var.v || i10 == w11Var.K || i10 == w11Var.T || i10 == w11Var.P) {
            return 0;
        }
        if (i10 == w11Var.F || i10 == w11Var.G || i10 == w11Var.I || i10 == w11Var.H || i10 == w11Var.Q || i10 == w11Var.R || i10 == w11Var.W) {
            return 1;
        }
        if (i10 == w11Var.N || i10 == w11Var.V || i10 == w11Var.J || i10 == w11Var.S) {
            return 2;
        }
        if (i10 == w11Var.U) {
            return 3;
        }
        if (i10 == w11Var.L || i10 == w11Var.M) {
            return 4;
        }
        if (i10 == w11Var.w) {
            return 5;
        }
        if (i10 == w11Var.x || i10 == w11Var.X) {
            return 6;
        }
        return (i10 == w11Var.y || i10 == w11Var.E || i10 == w11Var.O) ? 7 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        TLObject chat;
        int i15;
        int i16;
        w11 w11Var = this.d;
        long j3 = w11Var.f;
        long j10 = w11Var.e;
        int i17 = c1Var.f;
        View view = c1Var.a;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i10 != w11Var.v) {
                    if (i10 != w11Var.K) {
                        if (i10 != w11Var.T) {
                            if (i10 == w11Var.P) {
                                n4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                                break;
                            }
                        } else {
                            n4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                            break;
                        }
                    } else {
                        n4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                        break;
                    }
                } else {
                    n4Var.setText(LocaleController.getString(R.string.General));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j3);
                i11 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 != w11Var.W) {
                    faVar.setTextColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                    if (i10 != w11Var.F) {
                        if (i10 != w11Var.Q) {
                            if (i10 != w11Var.G) {
                                if (i10 != w11Var.I) {
                                    if (i10 != w11Var.H) {
                                        if (i10 == w11Var.R) {
                                            int c10 = org.telegram.messenger.l0.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                                            if (c10 != 0 && c10 != 4) {
                                                if (c10 != 1) {
                                                    if (c10 != 2) {
                                                        if (c10 == 3) {
                                                            faVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        faVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    faVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                                                    break;
                                                }
                                            } else {
                                                faVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c11 = org.telegram.messenger.l0.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int c12 = org.telegram.messenger.l0.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (c11 != 0) {
                                            faVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c11), LocaleController.formatPluralString("Minutes", c12 / 60, new Object[0])), false, w11Var.I != -1);
                                            break;
                                        } else {
                                            faVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, w11Var.I != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c13 = org.telegram.messenger.l0.c("priority_", sharedPrefKey, notificationsSettings, 3);
                                    if (c13 != 0) {
                                        if (c13 != 1 && c13 != 2) {
                                            if (c13 != 3) {
                                                if (c13 != 4) {
                                                    if (c13 == 5) {
                                                        faVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    faVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                                                    break;
                                                }
                                            } else {
                                                faVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                                                break;
                                            }
                                        } else {
                                            faVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                                            break;
                                        }
                                    } else {
                                        faVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c14 = org.telegram.messenger.l0.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String string = LocaleController.getString(R.string.Vibrate);
                                                String string2 = LocaleController.getString(R.string.Long);
                                                if (w11Var.H == -1 && w11Var.I == -1) {
                                                    r9 = false;
                                                }
                                                faVar.c(string, string2, false, r9);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (w11Var.H == -1 && w11Var.I == -1) {
                                                r9 = false;
                                            }
                                            faVar.c(string3, string4, false, r9);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (w11Var.H == -1 && w11Var.I == -1) {
                                            r9 = false;
                                        }
                                        faVar.c(string5, string6, false, r9);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (w11Var.H == -1 && w11Var.I == -1) {
                                        r9 = false;
                                    }
                                    faVar.c(string7, string8, false, r9);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(v7.j0.g("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            faVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(v7.j0.g("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j11 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j11 != 0) {
                            TLRPC.Document c15 = w11Var.getMediaDataController().ringtoneDataStore.c(j11);
                            string10 = c15 == null ? LocaleController.getString(R.string.CustomSound) : bl0.a0(c15, c15.file_name_fixed);
                        } else if (string10.equals("NoSound")) {
                            string10 = LocaleController.getString(R.string.NoSound);
                        } else if (string10.equals("Default")) {
                            string10 = LocaleController.getString(R.string.SoundDefault);
                        }
                        faVar.c(LocaleController.getString(R.string.Sound), string10, false, true);
                        break;
                    }
                } else {
                    faVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    faVar.setTextColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                f9Var.setFixedSize(0);
                if (i10 != w11Var.N) {
                    if (i10 != w11Var.V) {
                        if (i10 != w11Var.J) {
                            if (i10 == w11Var.S) {
                                f9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (w11Var.I != -1) {
                            f9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                            break;
                        } else {
                            f9Var.setText("");
                            break;
                        }
                    } else {
                        f9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                        break;
                    }
                } else {
                    f9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, j3);
                i12 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(sharedPrefKey2);
                int c16 = notificationsSettings2.contains(sb2.toString()) ? org.telegram.messenger.l0.c("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j10) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.z8.f[i18] == c16) {
                            c16 = org.telegram.ui.Cells.z8.e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                z8Var.b(c16, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.l6 l6Var = (org.telegram.ui.Cells.l6) view;
                i13 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int c17 = org.telegram.messenger.l0.c("popup_", NotificationsController.getSharedPrefKey(j10, j3), notificationsSettings3, 0);
                if (c17 == 0) {
                    c17 = notificationsSettings3.getInt(DialogObject.isChatDialog(j10) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != w11Var.L) {
                    if (i10 == w11Var.M) {
                        l6Var.c(LocaleController.getString(R.string.PopupDisabled), c17 == 2, false);
                        l6Var.setTag(2);
                        break;
                    }
                } else {
                    l6Var.c(LocaleController.getString(R.string.PopupEnabled), c17 == 1, true);
                    l6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                if (DialogObject.isUserDialog(j10)) {
                    i15 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j10));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j10));
                }
                zaVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.c7 c7Var = (org.telegram.ui.Cells.c7) view;
                boolean z10 = i10 > 0;
                r9 = i10 < w11Var.Y - 1;
                if (c7Var.c != z10 || c7Var.d != r9) {
                    c7Var.c = z10;
                    c7Var.d = r9;
                    int i19 = c7Var.b;
                    if (i19 != 0) {
                        c7Var.setBackgroundColor(i19);
                        break;
                    } else {
                        c7Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                i16 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i10 != w11Var.y) {
                    if (i10 != w11Var.E) {
                        if (i10 == w11Var.O) {
                            String g10 = v7.j0.g(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j10, j3));
                            if (w11Var.Z || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                                r10 = true;
                            }
                            x8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(g10, r10), true);
                            break;
                        }
                    } else {
                        String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j10, j3);
                        x8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey3, true), true);
                        break;
                    }
                } else {
                    x8Var.f(LocaleController.getString(R.string.Notifications), w11Var.n, true);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View n4Var;
        w11 w11Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = w11Var.d;
        Context context = this.c;
        switch (i10) {
            case 0:
                n4Var = new org.telegram.ui.Cells.n4(context, f6Var);
                n4Var.setBackgroundColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 1:
                n4Var = new org.telegram.ui.Cells.fa(context, 0, f6Var);
                n4Var.setBackgroundColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 2:
                n4Var = new org.telegram.ui.Cells.f9(context, f6Var);
                break;
            case 3:
                n4Var = new org.telegram.ui.Cells.z8(context, f6Var);
                n4Var.setBackgroundColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 4:
                n4Var = new org.telegram.ui.Cells.l6(context, f6Var);
                n4Var.setBackgroundColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 5:
                n4Var = new org.telegram.ui.Cells.za(context, f6Var);
                n4Var.setBackgroundColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 6:
                n4Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
                break;
            default:
                n4Var = new org.telegram.ui.Cells.x8(context, f6Var);
                n4Var.setBackgroundColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(n4Var, n4Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        View view = c1Var.a;
        w11 w11Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.n4) view).a(null, w11Var.n);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
            if (c1Var.b() == w11Var.W) {
                faVar.a(null, true);
                return;
            } else {
                faVar.a(null, w11Var.n);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.f9) view).c(null, w11Var.n);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.z8) view).a(null, w11Var.n);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.l6) view).b(null, w11Var.n);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        if (c1Var.b() == w11Var.E) {
            x8Var.e(null, w11Var.n);
        } else if (c1Var.b() == w11Var.O) {
            x8Var.e(null, w11Var.n);
        } else {
            x8Var.e(null, true);
        }
    }
}
