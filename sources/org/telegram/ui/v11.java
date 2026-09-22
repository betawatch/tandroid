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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v11 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ x11 d;

    public v11(x11 x11Var, Context context) {
        this.d = x11Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        x11 x11Var = this.d;
        if (b10 == x11Var.E) {
            return x11Var.n;
        }
        if (c1Var.b() == x11Var.W) {
            return true;
        }
        switch (c1Var.f) {
        }
        return x11Var.n;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.Y;
    }

    @Override // s4.h0
    public final int j(int i10) {
        x11 x11Var = this.d;
        if (i10 == x11Var.v || i10 == x11Var.K || i10 == x11Var.T || i10 == x11Var.P) {
            return 0;
        }
        if (i10 == x11Var.F || i10 == x11Var.G || i10 == x11Var.I || i10 == x11Var.H || i10 == x11Var.Q || i10 == x11Var.R || i10 == x11Var.W) {
            return 1;
        }
        if (i10 == x11Var.N || i10 == x11Var.V || i10 == x11Var.J || i10 == x11Var.S) {
            return 2;
        }
        if (i10 == x11Var.U) {
            return 3;
        }
        if (i10 == x11Var.L || i10 == x11Var.M) {
            return 4;
        }
        if (i10 == x11Var.w) {
            return 5;
        }
        if (i10 == x11Var.x || i10 == x11Var.X) {
            return 6;
        }
        return (i10 == x11Var.y || i10 == x11Var.E || i10 == x11Var.O) ? 7 : 0;
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
        x11 x11Var = this.d;
        long j3 = x11Var.f;
        long j10 = x11Var.e;
        int i17 = c1Var.f;
        View view = c1Var.a;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 != x11Var.v) {
                    if (i10 != x11Var.K) {
                        if (i10 != x11Var.T) {
                            if (i10 == x11Var.P) {
                                m4Var.setText(LocaleController.getString(R.string.VoipNotificationSettings));
                                break;
                            }
                        } else {
                            m4Var.setText(LocaleController.getString(R.string.NotificationsLed));
                            break;
                        }
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.ProfilePopupNotification));
                        break;
                    }
                } else {
                    m4Var.setText(LocaleController.getString(R.string.General));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j3);
                i11 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 != x11Var.W) {
                    eaVar.setTextColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.G6));
                    if (i10 != x11Var.F) {
                        if (i10 != x11Var.Q) {
                            if (i10 != x11Var.G) {
                                if (i10 != x11Var.I) {
                                    if (i10 != x11Var.H) {
                                        if (i10 == x11Var.R) {
                                            int c10 = org.telegram.messenger.y0.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                                            if (c10 != 0 && c10 != 4) {
                                                if (c10 != 1) {
                                                    if (c10 != 2) {
                                                        if (c10 == 3) {
                                                            eaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Long), false, true);
                                                            break;
                                                        }
                                                    } else {
                                                        eaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDisabled), false, true);
                                                        break;
                                                    }
                                                } else {
                                                    eaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.Short), false, true);
                                                    break;
                                                }
                                            } else {
                                                eaVar.c(LocaleController.getString(R.string.Vibrate), LocaleController.getString(R.string.VibrationDefault), false, true);
                                                break;
                                            }
                                        }
                                    } else {
                                        int c11 = org.telegram.messenger.y0.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int c12 = org.telegram.messenger.y0.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (c11 != 0) {
                                            eaVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c11), LocaleController.formatPluralString("Minutes", c12 / 60, new Object[0])), false, x11Var.I != -1);
                                            break;
                                        } else {
                                            eaVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, x11Var.I != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c13 = org.telegram.messenger.y0.c("priority_", sharedPrefKey, notificationsSettings, 3);
                                    if (c13 != 0) {
                                        if (c13 != 1 && c13 != 2) {
                                            if (c13 != 3) {
                                                if (c13 != 4) {
                                                    if (c13 == 5) {
                                                        eaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityMedium), false, false);
                                                        break;
                                                    }
                                                } else {
                                                    eaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityLow), false, false);
                                                    break;
                                                }
                                            } else {
                                                eaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPrioritySettings), false, false);
                                                break;
                                            }
                                        } else {
                                            eaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityUrgent), false, false);
                                            break;
                                        }
                                    } else {
                                        eaVar.c(LocaleController.getString(R.string.NotificationsImportance), LocaleController.getString(R.string.NotificationsPriorityHigh), false, false);
                                        break;
                                    }
                                }
                            } else {
                                int c14 = org.telegram.messenger.y0.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String string = LocaleController.getString(R.string.Vibrate);
                                                String string2 = LocaleController.getString(R.string.Long);
                                                if (x11Var.H == -1 && x11Var.I == -1) {
                                                    r9 = false;
                                                }
                                                eaVar.c(string, string2, false, r9);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (x11Var.H == -1 && x11Var.I == -1) {
                                                r9 = false;
                                            }
                                            eaVar.c(string3, string4, false, r9);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (x11Var.H == -1 && x11Var.I == -1) {
                                            r9 = false;
                                        }
                                        eaVar.c(string5, string6, false, r9);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (x11Var.H == -1 && x11Var.I == -1) {
                                        r9 = false;
                                    }
                                    eaVar.c(string7, string8, false, r9);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(org.telegram.ui.Cells.q3.i("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            eaVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(org.telegram.ui.Cells.q3.i("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j11 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j11 != 0) {
                            TLRPC.Document c15 = x11Var.getMediaDataController().ringtoneDataStore.c(j11);
                            string10 = c15 == null ? LocaleController.getString(R.string.CustomSound) : yk0.a0(c15, c15.file_name_fixed);
                        } else if (string10.equals("NoSound")) {
                            string10 = LocaleController.getString(R.string.NoSound);
                        } else if (string10.equals("Default")) {
                            string10 = LocaleController.getString(R.string.SoundDefault);
                        }
                        eaVar.c(LocaleController.getString(R.string.Sound), string10, false, true);
                        break;
                    }
                } else {
                    eaVar.b(LocaleController.getString(R.string.ResetCustomNotifications), false);
                    eaVar.setTextColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.q7));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 != x11Var.N) {
                    if (i10 != x11Var.V) {
                        if (i10 != x11Var.J) {
                            if (i10 == x11Var.S) {
                                e9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (x11Var.I != -1) {
                            e9Var.setText(LocaleController.getString(R.string.PriorityInfo));
                            break;
                        } else {
                            e9Var.setText("");
                            break;
                        }
                    } else {
                        e9Var.setText(LocaleController.getString(R.string.NotificationsLedInfo));
                        break;
                    }
                } else {
                    e9Var.setText(LocaleController.getString(R.string.ProfilePopupNotificationInfo));
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                String sharedPrefKey2 = NotificationsController.getSharedPrefKey(j10, j3);
                i12 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(sharedPrefKey2);
                int c16 = notificationsSettings2.contains(sb2.toString()) ? org.telegram.messenger.y0.c("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j10) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.y8.f[i18] == c16) {
                            c16 = org.telegram.ui.Cells.y8.e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                y8Var.b(c16, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                i13 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int c17 = org.telegram.messenger.y0.c("popup_", NotificationsController.getSharedPrefKey(j10, j3), notificationsSettings3, 0);
                if (c17 == 0) {
                    c17 = notificationsSettings3.getInt(DialogObject.isChatDialog(j10) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != x11Var.L) {
                    if (i10 == x11Var.M) {
                        k6Var.c(LocaleController.getString(R.string.PopupDisabled), c17 == 2, false);
                        k6Var.setTag(2);
                        break;
                    }
                } else {
                    k6Var.c(LocaleController.getString(R.string.PopupEnabled), c17 == 1, true);
                    k6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
                if (DialogObject.isUserDialog(j10)) {
                    i15 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j10));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j10));
                }
                zaVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.a7 a7Var = (org.telegram.ui.Cells.a7) view;
                boolean z10 = i10 > 0;
                r9 = i10 < x11Var.Y - 1;
                if (a7Var.c != z10 || a7Var.d != r9) {
                    a7Var.c = z10;
                    a7Var.d = r9;
                    int i19 = a7Var.b;
                    if (i19 != 0) {
                        a7Var.setBackgroundColor(i19);
                        break;
                    } else {
                        a7Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                i16 = ((org.telegram.ui.ActionBar.n2) x11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i10 != x11Var.y) {
                    if (i10 != x11Var.E) {
                        if (i10 == x11Var.O) {
                            String i20 = org.telegram.ui.Cells.q3.i(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j10, j3));
                            if (x11Var.Z || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
                                r10 = true;
                            }
                            w8Var.f(LocaleController.getString(R.string.StoriesSoundEnabled), notificationsSettings4.getBoolean(i20, r10), true);
                            break;
                        }
                    } else {
                        String sharedPrefKey3 = NotificationsController.getSharedPrefKey(j10, j3);
                        w8Var.f(LocaleController.getString(R.string.MessagePreview), notificationsSettings4.getBoolean(NotificationsSettingsFacade.PROPERTY_CONTENT_PREVIEW + sharedPrefKey3, true), true);
                        break;
                    }
                } else {
                    w8Var.f(LocaleController.getString(R.string.Notifications), x11Var.n, true);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        x11 x11Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = x11Var.d;
        Context context = this.c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context, e6Var);
                m4Var.setBackgroundColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.ea(context, 0, e6Var);
                m4Var.setBackgroundColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.e9(context, e6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.y8(context, e6Var);
                m4Var.setBackgroundColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.k6(context, e6Var);
                m4Var.setBackgroundColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.za(context, e6Var);
                m4Var.setBackgroundColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.q3) null);
                break;
            default:
                m4Var = new org.telegram.ui.Cells.w8(context, e6Var);
                m4Var.setBackgroundColor(x11Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        View view = c1Var.a;
        x11 x11Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.m4) view).a(null, x11Var.n);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            if (c1Var.b() == x11Var.W) {
                eaVar.a(null, true);
                return;
            } else {
                eaVar.a(null, x11Var.n);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.e9) view).c(null, x11Var.n);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.y8) view).a(null, x11Var.n);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.k6) view).b(null, x11Var.n);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
        if (c1Var.b() == x11Var.E) {
            w8Var.e(null, x11Var.n);
        } else if (c1Var.b() == x11Var.O) {
            w8Var.e(null, x11Var.n);
        } else {
            w8Var.e(null, true);
        }
    }
}
