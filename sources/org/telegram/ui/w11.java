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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class w11 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ y11 d;

    public w11(y11 y11Var, Context context) {
        this.d = y11Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        y11 y11Var = this.d;
        if (b10 == y11Var.E) {
            return y11Var.n;
        }
        if (c1Var.b() == y11Var.W) {
            return true;
        }
        switch (c1Var.f) {
        }
        return y11Var.n;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.Y;
    }

    @Override // s4.h0
    public final int j(int i10) {
        y11 y11Var = this.d;
        if (i10 == y11Var.v || i10 == y11Var.K || i10 == y11Var.T || i10 == y11Var.P) {
            return 0;
        }
        if (i10 == y11Var.F || i10 == y11Var.G || i10 == y11Var.I || i10 == y11Var.H || i10 == y11Var.Q || i10 == y11Var.R || i10 == y11Var.W) {
            return 1;
        }
        if (i10 == y11Var.N || i10 == y11Var.V || i10 == y11Var.J || i10 == y11Var.S) {
            return 2;
        }
        if (i10 == y11Var.U) {
            return 3;
        }
        if (i10 == y11Var.L || i10 == y11Var.M) {
            return 4;
        }
        if (i10 == y11Var.w) {
            return 5;
        }
        if (i10 == y11Var.x || i10 == y11Var.X) {
            return 6;
        }
        return (i10 == y11Var.y || i10 == y11Var.E || i10 == y11Var.O) ? 7 : 0;
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
        y11 y11Var = this.d;
        long j3 = y11Var.f;
        long j10 = y11Var.e;
        int i17 = c1Var.f;
        View view = c1Var.a;
        switch (i17) {
            case 0:
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 != y11Var.v) {
                    if (i10 != y11Var.K) {
                        if (i10 != y11Var.T) {
                            if (i10 == y11Var.P) {
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
                org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
                String sharedPrefKey = NotificationsController.getSharedPrefKey(j10, j3);
                i11 = ((org.telegram.ui.ActionBar.n2) y11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 != y11Var.W) {
                    eaVar.setTextColor(y11Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                    if (i10 != y11Var.F) {
                        if (i10 != y11Var.Q) {
                            if (i10 != y11Var.G) {
                                if (i10 != y11Var.I) {
                                    if (i10 != y11Var.H) {
                                        if (i10 == y11Var.R) {
                                            int c10 = org.telegram.messenger.w1.c("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
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
                                        int c11 = org.telegram.messenger.w1.c("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int c12 = org.telegram.messenger.w1.c("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (c11 != 0) {
                                            eaVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(c11), LocaleController.formatPluralString("Minutes", c12 / 60, new Object[0])), false, y11Var.I != -1);
                                            break;
                                        } else {
                                            eaVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, y11Var.I != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int c13 = org.telegram.messenger.w1.c("priority_", sharedPrefKey, notificationsSettings, 3);
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
                                int c14 = org.telegram.messenger.w1.c("vibrate_", sharedPrefKey, notificationsSettings, 0);
                                if (c14 != 0 && c14 != 4) {
                                    if (c14 != 1) {
                                        if (c14 != 2) {
                                            if (c14 == 3) {
                                                String string = LocaleController.getString(R.string.Vibrate);
                                                String string2 = LocaleController.getString(R.string.Long);
                                                if (y11Var.H == -1 && y11Var.I == -1) {
                                                    r9 = false;
                                                }
                                                eaVar.c(string, string2, false, r9);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (y11Var.H == -1 && y11Var.I == -1) {
                                                r9 = false;
                                            }
                                            eaVar.c(string3, string4, false, r9);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (y11Var.H == -1 && y11Var.I == -1) {
                                            r9 = false;
                                        }
                                        eaVar.c(string5, string6, false, r9);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (y11Var.H == -1 && y11Var.I == -1) {
                                        r9 = false;
                                    }
                                    eaVar.c(string7, string8, false, r9);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(org.telegram.ui.Cells.p6.i("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            eaVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(org.telegram.ui.Cells.p6.i("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j11 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j11 != 0) {
                            TLRPC.Document c15 = y11Var.getMediaDataController().ringtoneDataStore.c(j11);
                            string10 = c15 == null ? LocaleController.getString(R.string.CustomSound) : bl0.a0(c15, c15.file_name_fixed);
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
                    eaVar.setTextColor(y11Var.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 != y11Var.N) {
                    if (i10 != y11Var.V) {
                        if (i10 != y11Var.J) {
                            if (i10 == y11Var.S) {
                                e9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (y11Var.I != -1) {
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
                i12 = ((org.telegram.ui.ActionBar.n2) y11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(sharedPrefKey2);
                int c16 = notificationsSettings2.contains(sb2.toString()) ? org.telegram.messenger.w1.c("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j10) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
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
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                i13 = ((org.telegram.ui.ActionBar.n2) y11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int c17 = org.telegram.messenger.w1.c("popup_", NotificationsController.getSharedPrefKey(j10, j3), notificationsSettings3, 0);
                if (c17 == 0) {
                    c17 = notificationsSettings3.getInt(DialogObject.isChatDialog(j10) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != y11Var.L) {
                    if (i10 == y11Var.M) {
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
                org.telegram.ui.Cells.ya yaVar = (org.telegram.ui.Cells.ya) view;
                if (DialogObject.isUserDialog(j10)) {
                    i15 = ((org.telegram.ui.ActionBar.n2) y11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j10));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.n2) y11Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j10));
                }
                yaVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.a7 a7Var = (org.telegram.ui.Cells.a7) view;
                boolean z10 = i10 > 0;
                r9 = i10 < y11Var.Y - 1;
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
                i16 = ((org.telegram.ui.ActionBar.n2) y11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i10 != y11Var.y) {
                    if (i10 != y11Var.E) {
                        if (i10 == y11Var.O) {
                            String i20 = org.telegram.ui.Cells.p6.i(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j10, j3));
                            if (y11Var.Z || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
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
                    w8Var.f(LocaleController.getString(R.string.Notifications), y11Var.n, true);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        y11 y11Var = this.d;
        org.telegram.ui.ActionBar.f6 f6Var = y11Var.d;
        Context context = this.c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(context, f6Var);
                l4Var.setBackgroundColor(y11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 1:
                l4Var = new org.telegram.ui.Cells.ea(context, 0, f6Var);
                l4Var.setBackgroundColor(y11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.e9(context, f6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.y8(context, f6Var);
                l4Var.setBackgroundColor(y11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 4:
                l4Var = new org.telegram.ui.Cells.j6(context, f6Var);
                l4Var.setBackgroundColor(y11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 5:
                l4Var = new org.telegram.ui.Cells.ya(context, f6Var);
                l4Var.setBackgroundColor(y11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                break;
            default:
                l4Var = new org.telegram.ui.Cells.w8(context, f6Var);
                l4Var.setBackgroundColor(y11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
        }
        return com.google.android.gms.internal.vision.e2.l(l4Var, l4Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        View view = c1Var.a;
        y11 y11Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.l4) view).a(null, y11Var.n);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            if (c1Var.b() == y11Var.W) {
                eaVar.a(null, true);
                return;
            } else {
                eaVar.a(null, y11Var.n);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.e9) view).c(null, y11Var.n);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.y8) view).a(null, y11Var.n);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.j6) view).b(null, y11Var.n);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
        if (c1Var.b() == y11Var.E) {
            w8Var.e(null, y11Var.n);
        } else if (c1Var.b() == y11Var.O) {
            w8Var.e(null, y11Var.n);
        } else {
            w8Var.e(null, true);
        }
    }
}
