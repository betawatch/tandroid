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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class u11 extends org.telegram.ui.Components.vl0 {
    public final Context c;
    public final /* synthetic */ w11 d;

    public u11(w11 w11Var, Context context) {
        this.d = w11Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vl0
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
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 != w11Var.v) {
                    if (i10 != w11Var.K) {
                        if (i10 != w11Var.T) {
                            if (i10 == w11Var.P) {
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
                i11 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
                if (i10 != w11Var.W) {
                    eaVar.setTextColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                    if (i10 != w11Var.F) {
                        if (i10 != w11Var.Q) {
                            if (i10 != w11Var.G) {
                                if (i10 != w11Var.I) {
                                    if (i10 != w11Var.H) {
                                        if (i10 == w11Var.R) {
                                            int d = org.telegram.messenger.q.d("calls_vibrate_", sharedPrefKey, notificationsSettings, 0);
                                            if (d != 0 && d != 4) {
                                                if (d != 1) {
                                                    if (d != 2) {
                                                        if (d == 3) {
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
                                        int d10 = org.telegram.messenger.q.d("smart_max_count_", sharedPrefKey, notificationsSettings, 2);
                                        int d11 = org.telegram.messenger.q.d("smart_delay_", sharedPrefKey, notificationsSettings, 180);
                                        if (d10 != 0) {
                                            eaVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.formatString("SmartNotificationsInfo", R.string.SmartNotificationsInfo, Integer.valueOf(d10), LocaleController.formatPluralString("Minutes", d11 / 60, new Object[0])), false, w11Var.I != -1);
                                            break;
                                        } else {
                                            eaVar.c(LocaleController.getString(R.string.SmartNotifications), LocaleController.getString(R.string.SmartNotificationsDisabled), false, w11Var.I != -1);
                                            break;
                                        }
                                    }
                                } else {
                                    int d12 = org.telegram.messenger.q.d("priority_", sharedPrefKey, notificationsSettings, 3);
                                    if (d12 != 0) {
                                        if (d12 != 1 && d12 != 2) {
                                            if (d12 != 3) {
                                                if (d12 != 4) {
                                                    if (d12 == 5) {
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
                                int d13 = org.telegram.messenger.q.d("vibrate_", sharedPrefKey, notificationsSettings, 0);
                                if (d13 != 0 && d13 != 4) {
                                    if (d13 != 1) {
                                        if (d13 != 2) {
                                            if (d13 == 3) {
                                                String string = LocaleController.getString(R.string.Vibrate);
                                                String string2 = LocaleController.getString(R.string.Long);
                                                if (w11Var.H == -1 && w11Var.I == -1) {
                                                    r9 = false;
                                                }
                                                eaVar.c(string, string2, false, r9);
                                                break;
                                            }
                                        } else {
                                            String string3 = LocaleController.getString(R.string.Vibrate);
                                            String string4 = LocaleController.getString(R.string.VibrationDisabled);
                                            if (w11Var.H == -1 && w11Var.I == -1) {
                                                r9 = false;
                                            }
                                            eaVar.c(string3, string4, false, r9);
                                            break;
                                        }
                                    } else {
                                        String string5 = LocaleController.getString(R.string.Vibrate);
                                        String string6 = LocaleController.getString(R.string.Short);
                                        if (w11Var.H == -1 && w11Var.I == -1) {
                                            r9 = false;
                                        }
                                        eaVar.c(string5, string6, false, r9);
                                        break;
                                    }
                                } else {
                                    String string7 = LocaleController.getString(R.string.Vibrate);
                                    String string8 = LocaleController.getString(R.string.VibrationDefault);
                                    if (w11Var.H == -1 && w11Var.I == -1) {
                                        r9 = false;
                                    }
                                    eaVar.c(string7, string8, false, r9);
                                    break;
                                }
                            }
                        } else {
                            String string9 = notificationsSettings.getString(t8.b.i("ringtone_", sharedPrefKey), LocaleController.getString(R.string.DefaultRingtone));
                            if (string9.equals("NoSound")) {
                                string9 = LocaleController.getString(R.string.NoSound);
                            }
                            eaVar.c(LocaleController.getString(R.string.VoipSettingsRingtone), string9, false, false);
                            break;
                        }
                    } else {
                        String string10 = notificationsSettings.getString(t8.b.i("sound_", sharedPrefKey), LocaleController.getString(R.string.SoundDefault));
                        long j11 = notificationsSettings.getLong("sound_document_id_" + sharedPrefKey, 0L);
                        if (j11 != 0) {
                            TLRPC.Document c10 = w11Var.getMediaDataController().ringtoneDataStore.c(j11);
                            string10 = c10 == null ? LocaleController.getString(R.string.CustomSound) : bl0.a0(c10, c10.file_name_fixed);
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
                    eaVar.setTextColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.q7));
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                if (i10 != w11Var.N) {
                    if (i10 != w11Var.V) {
                        if (i10 != w11Var.J) {
                            if (i10 == w11Var.S) {
                                e9Var.setText(LocaleController.getString(R.string.VoipRingtoneInfo));
                                break;
                            }
                        } else if (w11Var.I != -1) {
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
                i12 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i12);
                StringBuilder sb2 = new StringBuilder("color_");
                sb2.append(sharedPrefKey2);
                int d14 = notificationsSettings2.contains(sb2.toString()) ? org.telegram.messenger.q.d("color_", sharedPrefKey2, notificationsSettings2, -16776961) : DialogObject.isChatDialog(j10) ? notificationsSettings2.getInt("GroupLed", -16776961) : notificationsSettings2.getInt("MessagesLed", -16776961);
                int i18 = 0;
                while (true) {
                    if (i18 < 9) {
                        if (org.telegram.ui.Cells.y8.f[i18] == d14) {
                            d14 = org.telegram.ui.Cells.y8.e[i18];
                        } else {
                            i18++;
                        }
                    }
                }
                y8Var.b(d14, LocaleController.getString(R.string.NotificationsLedColor), false);
                break;
            case 4:
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                i13 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i13);
                int d15 = org.telegram.messenger.q.d("popup_", NotificationsController.getSharedPrefKey(j10, j3), notificationsSettings3, 0);
                if (d15 == 0) {
                    d15 = notificationsSettings3.getInt(DialogObject.isChatDialog(j10) ? "popupGroup" : "popupAll", 0) != 0 ? 1 : 2;
                }
                if (i10 != w11Var.L) {
                    if (i10 == w11Var.M) {
                        k6Var.c(LocaleController.getString(R.string.PopupDisabled), d15 == 2, false);
                        k6Var.setTag(2);
                        break;
                    }
                } else {
                    k6Var.c(LocaleController.getString(R.string.PopupEnabled), d15 == 1, true);
                    k6Var.setTag(1);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.Cells.ya yaVar = (org.telegram.ui.Cells.ya) view;
                if (DialogObject.isUserDialog(j10)) {
                    i15 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                    chat = MessagesController.getInstance(i15).getUser(Long.valueOf(j10));
                } else {
                    i14 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                    chat = MessagesController.getInstance(i14).getChat(Long.valueOf(-j10));
                }
                yaVar.a(chat, null);
                break;
            case 6:
                org.telegram.ui.Cells.b7 b7Var = (org.telegram.ui.Cells.b7) view;
                boolean z10 = i10 > 0;
                r9 = i10 < w11Var.Y - 1;
                if (b7Var.c != z10 || b7Var.d != r9) {
                    b7Var.c = z10;
                    b7Var.d = r9;
                    int i19 = b7Var.b;
                    if (i19 != 0) {
                        b7Var.setBackgroundColor(i19);
                        break;
                    } else {
                        b7Var.setBackground(null);
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                i16 = ((org.telegram.ui.ActionBar.n2) w11Var).currentAccount;
                SharedPreferences notificationsSettings4 = MessagesController.getNotificationsSettings(i16);
                if (i10 != w11Var.y) {
                    if (i10 != w11Var.E) {
                        if (i10 == w11Var.O) {
                            String i20 = t8.b.i(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY, NotificationsController.getSharedPrefKey(j10, j3));
                            if (w11Var.Z || (notificationsSettings4.contains("EnableAllStories") && notificationsSettings4.getBoolean("EnableAllStories", true))) {
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
                    w8Var.f(LocaleController.getString(R.string.Notifications), w11Var.n, true);
                    break;
                }
                break;
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View m4Var;
        w11 w11Var = this.d;
        org.telegram.ui.ActionBar.e6 e6Var = w11Var.d;
        Context context = this.c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(context, e6Var);
                m4Var.setBackgroundColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 1:
                m4Var = new org.telegram.ui.Cells.ea(context, 0, e6Var);
                m4Var.setBackgroundColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.e9(context, e6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.y8(context, e6Var);
                m4Var.setBackgroundColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 4:
                m4Var = new org.telegram.ui.Cells.k6(context, e6Var);
                m4Var.setBackgroundColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 5:
                m4Var = new org.telegram.ui.Cells.ya(context, e6Var);
                m4Var.setBackgroundColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                break;
            default:
                m4Var = new org.telegram.ui.Cells.w8(context, e6Var);
                m4Var.setBackgroundColor(w11Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        int i10 = c1Var.f;
        View view = c1Var.a;
        w11 w11Var = this.d;
        if (i10 == 0) {
            ((org.telegram.ui.Cells.m4) view).a(null, w11Var.n);
            return;
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            if (c1Var.b() == w11Var.W) {
                eaVar.a(null, true);
                return;
            } else {
                eaVar.a(null, w11Var.n);
                return;
            }
        }
        if (i10 == 2) {
            ((org.telegram.ui.Cells.e9) view).c(null, w11Var.n);
            return;
        }
        if (i10 == 3) {
            ((org.telegram.ui.Cells.y8) view).a(null, w11Var.n);
            return;
        }
        if (i10 == 4) {
            ((org.telegram.ui.Cells.k6) view).b(null, w11Var.n);
            return;
        }
        if (i10 != 7) {
            return;
        }
        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
        if (c1Var.b() == w11Var.E) {
            w8Var.e(null, w11Var.n);
        } else if (c1Var.b() == w11Var.O) {
            w8Var.e(null, w11Var.n);
        } else {
            w8Var.e(null, true);
        }
    }
}
