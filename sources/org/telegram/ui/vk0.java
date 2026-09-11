package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class vk0 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ NotificationsSettingsActivity d;

    public vk0(NotificationsSettingsActivity notificationsSettingsActivity, Context context) {
        this.d = notificationsSettingsActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        return (b10 == notificationsSettingsActivity.x || b10 == notificationsSettingsActivity.y || b10 == notificationsSettingsActivity.E || b10 == notificationsSettingsActivity.K || b10 == notificationsSettingsActivity.M || b10 == notificationsSettingsActivity.S || b10 == notificationsSettingsActivity.N || b10 == notificationsSettingsActivity.L || b10 == notificationsSettingsActivity.R || b10 == notificationsSettingsActivity.F || b10 == notificationsSettingsActivity.G || b10 == notificationsSettingsActivity.O || b10 == notificationsSettingsActivity.r || b10 == notificationsSettingsActivity.s || b10 == notificationsSettingsActivity.T || b10 == notificationsSettingsActivity.J) ? false : true;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.U;
    }

    @Override // s4.h0
    public final int j(int i10) {
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
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (i10 == notificationsSettingsActivity.K || i10 == notificationsSettingsActivity.M || i10 == notificationsSettingsActivity.S || i10 == notificationsSettingsActivity.G || i10 == notificationsSettingsActivity.N || i10 == notificationsSettingsActivity.E || i10 == notificationsSettingsActivity.x || i10 == notificationsSettingsActivity.r) {
            return 0;
        }
        i11 = notificationsSettingsActivity.inappSoundRow;
        if (i10 == i11) {
            return 1;
        }
        i12 = notificationsSettingsActivity.inappVibrateRow;
        if (i10 == i12 || i10 == notificationsSettingsActivity.w) {
            return 1;
        }
        i13 = notificationsSettingsActivity.inappPreviewRow;
        if (i10 == i13) {
            return 1;
        }
        i14 = notificationsSettingsActivity.contactJoinedRow;
        if (i10 == i14) {
            return 1;
        }
        i15 = notificationsSettingsActivity.pinnedMessageRow;
        if (i10 == i15 || i10 == notificationsSettingsActivity.v) {
            return 1;
        }
        i16 = notificationsSettingsActivity.badgeNumberMutedRow;
        if (i10 == i16) {
            return 1;
        }
        i17 = notificationsSettingsActivity.badgeNumberMessagesRow;
        if (i10 == i17) {
            return 1;
        }
        i18 = notificationsSettingsActivity.badgeNumberShowRow;
        if (i10 == i18) {
            return 1;
        }
        i19 = notificationsSettingsActivity.inappPriorityRow;
        if (i10 == i19) {
            return 1;
        }
        i20 = notificationsSettingsActivity.inchatSoundRow;
        if (i10 == i20 || i10 == notificationsSettingsActivity.P) {
            return 1;
        }
        i21 = notificationsSettingsActivity.accountsAllRow;
        if (i10 == i21) {
            return 1;
        }
        i22 = notificationsSettingsActivity.resetNotificationsRow;
        if (i10 == i22) {
            return 2;
        }
        i23 = notificationsSettingsActivity.privateRow;
        if (i10 == i23) {
            return 3;
        }
        i24 = notificationsSettingsActivity.groupRow;
        if (i10 == i24) {
            return 3;
        }
        i25 = notificationsSettingsActivity.channelsRow;
        if (i10 == i25) {
            return 3;
        }
        i26 = notificationsSettingsActivity.storiesRow;
        if (i10 == i26) {
            return 3;
        }
        i27 = notificationsSettingsActivity.reactionsRow;
        if (i10 == i27) {
            return 3;
        }
        if (i10 == notificationsSettingsActivity.J || i10 == notificationsSettingsActivity.y || i10 == notificationsSettingsActivity.L || i10 == notificationsSettingsActivity.R || i10 == notificationsSettingsActivity.F || i10 == notificationsSettingsActivity.O || i10 == notificationsSettingsActivity.T) {
            return 4;
        }
        return i10 == notificationsSettingsActivity.s ? 6 : 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022b  */
    @Override // s4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.c1 c1Var, int i10) {
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
        String string;
        ArrayList arrayList;
        int i31;
        int i32;
        ArrayList arrayList2;
        boolean z10;
        String str;
        int i33;
        int i34;
        boolean z11;
        int i35;
        int i36;
        int i37;
        int i38 = c1Var.f;
        View view = c1Var.a;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        if (i38 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == notificationsSettingsActivity.x) {
                l4Var.setText(LocaleController.getString("NotificationsForChats", R.string.NotificationsForChats));
                return;
            }
            if (i10 == notificationsSettingsActivity.E) {
                l4Var.setText(LocaleController.getString("InAppNotifications", R.string.InAppNotifications));
                return;
            }
            if (i10 == notificationsSettingsActivity.K) {
                l4Var.setText(LocaleController.getString("Events", R.string.Events));
                return;
            }
            if (i10 == notificationsSettingsActivity.M) {
                l4Var.setText(LocaleController.getString("NotificationsOther", R.string.NotificationsOther));
                return;
            }
            if (i10 == notificationsSettingsActivity.S) {
                l4Var.setText(LocaleController.getString("Reset", R.string.Reset));
                return;
            }
            if (i10 == notificationsSettingsActivity.G) {
                l4Var.setText(LocaleController.getString("VoipNotificationSettings", R.string.VoipNotificationSettings));
                return;
            } else if (i10 == notificationsSettingsActivity.N) {
                l4Var.setText(LocaleController.getString("BadgeNumber", R.string.BadgeNumber));
                return;
            } else {
                if (i10 == notificationsSettingsActivity.r) {
                    l4Var.setText(LocaleController.getString("ShowNotificationsFor", R.string.ShowNotificationsFor));
                    return;
                }
                return;
            }
        }
        if (i38 == 1) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            i11 = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).currentAccount;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i11);
            i12 = notificationsSettingsActivity.inappSoundRow;
            if (i10 == i12) {
                w8Var.f(LocaleController.getString(R.string.InAppSounds), notificationsSettings.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            i13 = notificationsSettingsActivity.inappVibrateRow;
            if (i10 == i13) {
                w8Var.f(LocaleController.getString(R.string.InAppVibrate), notificationsSettings.getBoolean("EnableInAppVibrate", true), true);
                return;
            }
            i14 = notificationsSettingsActivity.inappPreviewRow;
            if (i10 == i14) {
                w8Var.f(LocaleController.getString(R.string.InAppPreview), notificationsSettings.getBoolean("EnableInAppPreview", true), true);
                return;
            }
            i15 = notificationsSettingsActivity.inappPriorityRow;
            if (i10 == i15) {
                w8Var.g(LocaleController.getString(R.string.InAppPopup), LocaleController.getString(R.string.InAppPopupInfo), notificationsSettings.getBoolean("EnableInAppPopup", true), true, false);
                return;
            }
            i16 = notificationsSettingsActivity.contactJoinedRow;
            if (i10 == i16) {
                w8Var.f(LocaleController.getString("ContactJoined", R.string.ContactJoined), notificationsSettings.getBoolean("EnableContactJoined", true), true);
                return;
            }
            i17 = notificationsSettingsActivity.pinnedMessageRow;
            if (i10 == i17) {
                w8Var.f(LocaleController.getString("PinnedMessages", R.string.PinnedMessages), notificationsSettings.getBoolean("PinnedMessages", true), false);
                return;
            }
            if (i10 == notificationsSettingsActivity.P) {
                w8Var.f("Android Auto", notificationsSettings.getBoolean("EnableAutoNotifications", false), true);
                return;
            }
            if (i10 == notificationsSettingsActivity.v) {
                w8Var.g(LocaleController.getString("NotificationsService", R.string.NotificationsService), LocaleController.getString("NotificationsServiceInfo", R.string.NotificationsServiceInfo), notificationsSettings.getBoolean("pushService", notificationsSettingsActivity.getMessagesController().keepAliveService), true, true);
                return;
            }
            if (i10 == notificationsSettingsActivity.w) {
                w8Var.g(LocaleController.getString("NotificationsServiceConnection", R.string.NotificationsServiceConnection), LocaleController.getString("NotificationsServiceConnectionInfo", R.string.NotificationsServiceConnectionInfo), notificationsSettings.getBoolean("pushConnection", notificationsSettingsActivity.getMessagesController().backgroundConnection), true, true);
                return;
            }
            i18 = notificationsSettingsActivity.badgeNumberShowRow;
            if (i10 == i18) {
                w8Var.f(LocaleController.getString("BadgeNumberShow", R.string.BadgeNumberShow), notificationsSettingsActivity.getNotificationsController().showBadgeNumber, true);
                return;
            }
            i19 = notificationsSettingsActivity.badgeNumberMutedRow;
            if (i10 == i19) {
                w8Var.f(LocaleController.getString("BadgeNumberMutedChats", R.string.BadgeNumberMutedChats), notificationsSettingsActivity.getNotificationsController().showBadgeMuted, true);
                return;
            }
            i20 = notificationsSettingsActivity.badgeNumberMessagesRow;
            if (i10 == i20) {
                w8Var.f(LocaleController.getString("BadgeNumberUnread", R.string.BadgeNumberUnread), notificationsSettingsActivity.getNotificationsController().showBadgeMessages, false);
                return;
            }
            i21 = notificationsSettingsActivity.inchatSoundRow;
            if (i10 == i21) {
                w8Var.f(LocaleController.getString("InChatSound", R.string.InChatSound), notificationsSettings.getBoolean("EnableInChatSound", true), true);
                return;
            }
            if (i10 == notificationsSettingsActivity.H) {
                w8Var.f(LocaleController.getString("Vibrate", R.string.Vibrate), notificationsSettings.getBoolean("EnableCallVibrate", true), true);
                return;
            }
            i22 = notificationsSettingsActivity.accountsAllRow;
            if (i10 == i22) {
                w8Var.f(LocaleController.getString("AllAccounts", R.string.AllAccounts), MessagesController.getGlobalNotificationsSettings().getBoolean("AllAccounts", true), false);
                return;
            }
            return;
        }
        if (i38 == 2) {
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            d9Var.setMultilineDetail(true);
            i23 = notificationsSettingsActivity.resetNotificationsRow;
            if (i10 == i23) {
                d9Var.a(LocaleController.getString("ResetAllNotifications", R.string.ResetAllNotifications), LocaleController.getString("UndoAllCustom", R.string.UndoAllCustom), false);
                return;
            }
            return;
        }
        if (i38 != 3) {
            if (i38 != 5) {
                if (i38 != 6) {
                    return;
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (i10 == notificationsSettingsActivity.s) {
                    e9Var.setText(LocaleController.getString("ShowNotificationsForInfo", R.string.ShowNotificationsForInfo));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            i37 = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).currentAccount;
            SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(i37);
            if (i10 == notificationsSettingsActivity.I) {
                String string2 = notificationsSettings2.getString("CallsRingtone", LocaleController.getString("DefaultRingtone", R.string.DefaultRingtone));
                if (string2.equals("NoSound")) {
                    string2 = LocaleController.getString("NoSound", R.string.NoSound);
                }
                eaVar.c(LocaleController.getString("VoipSettingsRingtone", R.string.VoipSettingsRingtone), string2, notificationsSettingsActivity.W, false);
                notificationsSettingsActivity.W = false;
                return;
            }
            if (i10 != notificationsSettingsActivity.H) {
                if (i10 == notificationsSettingsActivity.Q) {
                    int i39 = notificationsSettings2.getInt("repeat_messages", 60);
                    eaVar.c(LocaleController.getString("RepeatNotifications", R.string.RepeatNotifications), i39 == 0 ? LocaleController.getString("RepeatNotificationsNever", R.string.RepeatNotificationsNever) : i39 < 60 ? LocaleController.formatPluralString("Minutes", i39, new Object[0]) : LocaleController.formatPluralString("Hours", i39 / 60, new Object[0]), notificationsSettingsActivity.X, false);
                    notificationsSettingsActivity.X = false;
                    return;
                }
                return;
            }
            int i40 = notificationsSettings2.getInt("vibrate_calls", 0);
            if (i40 == 0) {
                eaVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDefault", R.string.VibrationDefault), notificationsSettingsActivity.V, true);
            } else if (i40 == 1) {
                eaVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Short", R.string.Short), notificationsSettingsActivity.V, true);
            } else if (i40 == 2) {
                eaVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("VibrationDisabled", R.string.VibrationDisabled), notificationsSettingsActivity.V, true);
            } else if (i40 == 3) {
                eaVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("Long", R.string.Long), notificationsSettingsActivity.V, true);
            } else if (i40 == 4) {
                eaVar.c(LocaleController.getString("Vibrate", R.string.Vibrate), LocaleController.getString("OnlyIfSilent", R.string.OnlyIfSilent), notificationsSettingsActivity.V, true);
            }
            notificationsSettingsActivity.V = false;
            return;
        }
        org.telegram.ui.Cells.i5 i5Var = (org.telegram.ui.Cells.i5) view;
        i24 = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).currentAccount;
        SharedPreferences notificationsSettings3 = MessagesController.getNotificationsSettings(i24);
        i25 = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).currentAccount;
        int currentTime = ConnectionsManager.getInstance(i25).getCurrentTime();
        i26 = notificationsSettingsActivity.privateRow;
        ArrayList arrayList3 = null;
        if (i10 == i26) {
            string = LocaleController.getString(R.string.NotificationsPrivateChats);
            arrayList = notificationsSettingsActivity.d;
            i31 = notificationsSettings3.getInt("EnableAll2", 0);
            i32 = R.drawable.msg_openprofile;
        } else {
            i27 = notificationsSettingsActivity.groupRow;
            if (i10 != i27) {
                i28 = notificationsSettingsActivity.storiesRow;
                i29 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i10 == i28) {
                    string = LocaleController.getString(R.string.NotificationStories);
                    arrayList3 = notificationsSettingsActivity.h;
                    arrayList2 = notificationsSettingsActivity.n;
                    if (notificationsSettings3.getBoolean("EnableAllStories", false)) {
                        i29 = 0;
                    }
                    i32 = R.drawable.msg_menu_stories;
                } else {
                    i30 = notificationsSettingsActivity.reactionsRow;
                    if (i10 == i30) {
                        string = LocaleController.getString(R.string.NotificationReactions);
                        int i41 = (notificationsSettings3.getBoolean("EnableReactionsMessages", true) || notificationsSettings3.getBoolean("EnableReactionsStories", true)) ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
                        i32 = R.drawable.msg_reactions;
                        i29 = i41;
                        arrayList2 = null;
                    } else {
                        string = LocaleController.getString(R.string.NotificationsChannels);
                        arrayList = notificationsSettingsActivity.f;
                        i31 = notificationsSettings3.getInt("EnableChannel2", 0);
                        i32 = R.drawable.msg_channel;
                    }
                }
                z10 = i29 >= currentTime;
                if (!z10 && i29 - 31536000 < currentTime) {
                    str = string;
                    i33 = 2;
                } else {
                    str = string;
                    i33 = 0;
                }
                StringBuilder sb2 = new StringBuilder();
                i34 = notificationsSettingsActivity.reactionsRow;
                if (i10 != i34) {
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        z10 = i29 < currentTime;
                        if (z10) {
                            sb2.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                        } else if (i29 - 31536000 >= currentTime) {
                            sb2.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                        } else {
                            sb2.append(LocaleController.formatString("NotificationsOffUntil", R.string.NotificationsOffUntil, LocaleController.stringForMessageListDate(i29)));
                        }
                        if (sb2.length() != 0) {
                            sb2.append(", ");
                        }
                        int size = arrayList3.size();
                        i35 = notificationsSettingsActivity.storiesRow;
                        if (i10 == i35 && !notificationsSettings3.contains("EnableAllStories") && arrayList2 != null) {
                            size += arrayList2.size();
                        }
                        sb2.append(LocaleController.formatPluralString("Exception", size, new Object[0]));
                    } else if (arrayList2 == null || arrayList2.isEmpty()) {
                        sb2.append(LocaleController.getString("TapToChange", R.string.TapToChange));
                    } else {
                        if (i29 > 0) {
                            sb2.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                        } else {
                            sb2.append(LocaleController.getString("NotificationsOn", R.string.NotificationsOn));
                        }
                        if (!arrayList2.isEmpty() && !notificationsSettings3.contains("EnableAllStories")) {
                            sb2.append(", ");
                            sb2.append(LocaleController.formatPluralString("AutoException", arrayList2.size(), new Object[0]));
                        }
                    }
                    z11 = z10;
                } else if (i29 > 0) {
                    sb2.append(LocaleController.getString("NotificationsOff", R.string.NotificationsOff));
                    z11 = false;
                } else {
                    if (notificationsSettings3.getBoolean("EnableReactionsMessages", true)) {
                        sb2.append(LocaleController.getString(R.string.NotificationReactionsMessages));
                    }
                    if (notificationsSettings3.getBoolean("EnableReactionsStories", true)) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(LocaleController.getString(R.string.NotificationReactionsStories));
                    }
                    z11 = true;
                }
                i36 = notificationsSettingsActivity.reactionsRow;
                i5Var.b(str, sb2, i32, z11, i33, false, i10 != i36, false);
            }
            string = LocaleController.getString(R.string.NotificationsGroups);
            arrayList = notificationsSettingsActivity.e;
            i31 = notificationsSettings3.getInt("EnableGroup2", 0);
            i32 = R.drawable.msg_groups;
        }
        int i42 = i31;
        arrayList2 = null;
        arrayList3 = arrayList;
        i29 = i42;
        if (i29 >= currentTime) {
        }
        if (z10) {
            str = string;
            i33 = 2;
            StringBuilder sb22 = new StringBuilder();
            i34 = notificationsSettingsActivity.reactionsRow;
            if (i10 != i34) {
            }
            i36 = notificationsSettingsActivity.reactionsRow;
            i5Var.b(str, sb22, i32, z11, i33, false, i10 != i36, false);
        }
        str = string;
        i33 = 0;
        StringBuilder sb222 = new StringBuilder();
        i34 = notificationsSettingsActivity.reactionsRow;
        if (i10 != i34) {
        }
        i36 = notificationsSettingsActivity.reactionsRow;
        i5Var.b(str, sb222, i32, z11, i33, false, i10 != i36, false);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View l4Var;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        NotificationsSettingsActivity notificationsSettingsActivity = this.d;
        Context context = this.c;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider;
            l4Var = new org.telegram.ui.Cells.l4(context, f6Var);
        } else if (i10 == 1) {
            f6Var2 = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider;
            l4Var = new org.telegram.ui.Cells.w8(context, f6Var2);
        } else if (i10 == 2) {
            l4Var = new org.telegram.ui.Cells.d9(context);
        } else if (i10 == 3) {
            f6Var3 = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider;
            l4Var = new org.telegram.ui.Cells.i5(21, 64, this.c, f6Var3, true);
        } else if (i10 == 4) {
            l4Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
        } else if (i10 != 5) {
            f6Var5 = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider;
            l4Var = new org.telegram.ui.Cells.e9(context, f6Var5);
        } else {
            f6Var4 = ((org.telegram.ui.ActionBar.n2) notificationsSettingsActivity).resourceProvider;
            l4Var = new org.telegram.ui.Cells.ea(context, 0, f6Var4);
        }
        return new org.telegram.ui.Components.vk0(l4Var);
    }
}
