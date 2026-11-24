// default package

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProxyListActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class s20 extends n39 {
    public final /* synthetic */ byte c;
    public final Object d;
    public final Object e;

    public s20(Context context) {
        this.c = (byte) 17;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        pe3 pe3Var = new pe3();
        pe3Var.a = k96.M0(2131743930, null);
        pe3Var.b = k96.M0(2131743922, null);
        pe3Var.c = (byte) 0;
        pe3Var.d = (byte) 0;
        pe3Var.e = true;
        pe3Var.f = false;
        pe3Var.g = (byte) 0;
        pe3Var.h = currentTimeMillis;
        pe3Var.i = false;
        pe3Var.j = false;
        pe3Var.k = 2;
        arrayList.add(pe3Var);
        pe3 pe3Var2 = new pe3();
        pe3Var2.a = k96.M0(2131743929, null);
        pe3Var2.b = k96.M0(2131743921, null);
        pe3Var2.c = (byte) 1;
        pe3Var2.d = (byte) 2;
        pe3Var2.e = false;
        pe3Var2.f = false;
        pe3Var2.g = (byte) 0;
        pe3Var2.h = currentTimeMillis - 3600;
        pe3Var2.i = false;
        pe3Var2.j = false;
        pe3Var2.k = -1;
        arrayList.add(pe3Var2);
        pe3 pe3Var3 = new pe3();
        pe3Var3.a = k96.M0(2131743928, null);
        pe3Var3.b = k96.M0(2131743920, null);
        pe3Var3.c = (byte) 2;
        pe3Var3.d = (byte) 3;
        pe3Var3.e = false;
        pe3Var3.f = true;
        pe3Var3.g = (byte) 0;
        pe3Var3.h = currentTimeMillis - 7200;
        pe3Var3.i = false;
        pe3Var3.j = true;
        pe3Var3.k = -1;
        arrayList.add(pe3Var3);
        pe3 pe3Var4 = new pe3();
        pe3Var4.a = k96.M0(2131743927, null);
        pe3Var4.b = k96.M0(2131743919, null);
        pe3Var4.c = (byte) 3;
        pe3Var4.d = (byte) 0;
        pe3Var4.e = false;
        pe3Var4.f = false;
        pe3Var4.g = (byte) 2;
        pe3Var4.h = currentTimeMillis - 10800;
        pe3Var4.i = false;
        pe3Var4.j = false;
        pe3Var4.k = -1;
        arrayList.add(pe3Var4);
        pe3 pe3Var5 = new pe3();
        pe3Var5.a = k96.M0(2131743926, null);
        pe3Var5.b = k96.M0(2131743918, null);
        pe3Var5.c = (byte) 4;
        pe3Var5.d = (byte) 0;
        pe3Var5.e = false;
        pe3Var5.f = false;
        pe3Var5.g = (byte) 1;
        pe3Var5.h = currentTimeMillis - 14400;
        pe3Var5.i = false;
        pe3Var5.j = false;
        pe3Var5.k = 2;
        arrayList.add(pe3Var5);
        pe3 pe3Var6 = new pe3();
        pe3Var6.a = k96.M0(2131743925, null);
        pe3Var6.b = k96.M0(2131743917, null);
        pe3Var6.c = (byte) 5;
        pe3Var6.d = (byte) 0;
        pe3Var6.e = false;
        pe3Var6.f = false;
        pe3Var6.g = (byte) 0;
        pe3Var6.h = currentTimeMillis - 18000;
        pe3Var6.i = false;
        pe3Var6.j = false;
        pe3Var6.k = -1;
        arrayList.add(pe3Var6);
        pe3 pe3Var7 = new pe3();
        pe3Var7.a = k96.M0(2131743924, null);
        pe3Var7.b = k96.M0(2131743916, null);
        pe3Var7.c = (byte) 6;
        pe3Var7.d = (byte) 0;
        pe3Var7.e = false;
        pe3Var7.f = false;
        pe3Var7.g = (byte) 0;
        pe3Var7.h = currentTimeMillis - 21600;
        pe3Var7.i = true;
        pe3Var7.j = false;
        pe3Var7.k = -1;
        arrayList.add(pe3Var7);
        pe3 pe3Var8 = new pe3();
        pe3Var8.a = k96.M0(2131743923, null);
        pe3Var8.b = k96.M0(2131743915, null);
        pe3Var8.c = (byte) 0;
        pe3Var8.d = (byte) 0;
        pe3Var8.e = false;
        pe3Var8.f = false;
        pe3Var8.g = (byte) 0;
        pe3Var8.h = currentTimeMillis - 25200;
        pe3Var8.i = true;
        pe3Var8.j = false;
        pe3Var8.k = -1;
        arrayList.add(pe3Var8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void G(s49 s49Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
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
        CharSequence M0;
        ArrayList arrayList;
        int i21;
        int i22;
        int i23;
        ArrayList arrayList2;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z;
        int i28;
        int i29;
        int i30;
        int i31 = s49Var.f;
        if (i31 == 0) {
            ld5 ld5Var = (ld5) s49Var.a;
            NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
            if (i == notificationsSettingsActivity.y) {
                ld5Var.setText(k96.M0(2131747716, "NotificationsForChats"));
                return;
            }
            if (i == notificationsSettingsActivity.F) {
                ld5Var.setText(k96.M0(2131749027, "InAppNotifications"));
                return;
            }
            if (i == notificationsSettingsActivity.L) {
                ld5Var.setText(k96.M0(2131750873, "Events"));
                return;
            }
            if (i == notificationsSettingsActivity.N) {
                ld5Var.setText(k96.M0(2131747698, "NotificationsOther"));
                return;
            }
            if (i == notificationsSettingsActivity.T) {
                ld5Var.setText(k96.M0(2131745925, "Reset"));
                return;
            }
            if (i == notificationsSettingsActivity.H) {
                ld5Var.setText(k96.M0(2131743037, "VoipNotificationSettings"));
                return;
            } else if (i == notificationsSettingsActivity.O) {
                ld5Var.setText(k96.M0(2131753730, "BadgeNumber"));
                return;
            } else {
                if (i == notificationsSettingsActivity.r) {
                    ld5Var.setText(k96.M0(2131745144, "ShowNotificationsFor"));
                    return;
                }
                return;
            }
        }
        if (i31 == 1) {
            ahb ahbVar = (ahb) s49Var.a;
            i2 = ((d) ((NotificationsSettingsActivity) this.e)).currentAccount;
            SharedPreferences sharedPreferences = na7.q1(i2).W3;
            i3 = ((NotificationsSettingsActivity) this.e).inappSoundRow;
            if (i == i3) {
                ahbVar.f(k96.M0(2131749023, null), sharedPreferences.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            i4 = ((NotificationsSettingsActivity) this.e).inappVibrateRow;
            if (i == i4) {
                ahbVar.f(k96.M0(2131749022, null), sharedPreferences.getBoolean("EnableInAppVibrate", true), true);
                return;
            }
            i5 = ((NotificationsSettingsActivity) this.e).inappPreviewRow;
            if (i == i5) {
                ahbVar.f(k96.M0(2131749024, null), sharedPreferences.getBoolean("EnableInAppPreview", true), true);
                return;
            }
            i6 = ((NotificationsSettingsActivity) this.e).inappPriorityRow;
            if (i == i6) {
                ahbVar.g(k96.M0(2131749026, null), k96.M0(2131749025, null), sharedPreferences.getBoolean("EnableInAppPopup", true), true, false);
                return;
            }
            i7 = ((NotificationsSettingsActivity) this.e).contactJoinedRow;
            if (i == i7) {
                ahbVar.f(k96.M0(2131751778, "ContactJoined"), sharedPreferences.getBoolean("EnableContactJoined", true), true);
                return;
            }
            i8 = ((NotificationsSettingsActivity) this.e).pinnedMessageRow;
            if (i == i8) {
                ahbVar.f(k96.M0(2131747035, "PinnedMessages"), sharedPreferences.getBoolean("PinnedMessages", true), false);
                return;
            }
            NotificationsSettingsActivity notificationsSettingsActivity2 = (NotificationsSettingsActivity) this.e;
            if (i == notificationsSettingsActivity2.Q) {
                ahbVar.f("Android Auto", sharedPreferences.getBoolean("EnableAutoNotifications", false), true);
                return;
            }
            if (i == notificationsSettingsActivity2.w) {
                ahbVar.g(k96.M0(2131747683, "NotificationsService"), k96.M0(2131747680, "NotificationsServiceInfo"), sharedPreferences.getBoolean("pushService", ((NotificationsSettingsActivity) this.e).getMessagesController().k4.y3.f), true, true);
                return;
            }
            if (i == notificationsSettingsActivity2.x) {
                ahbVar.g(k96.M0(2131747682, "NotificationsServiceConnection"), k96.M0(2131747681, "NotificationsServiceConnectionInfo"), sharedPreferences.getBoolean("pushConnection", ((NotificationsSettingsActivity) this.e).getMessagesController().k4.z3.f), true, true);
                return;
            }
            i9 = notificationsSettingsActivity2.badgeNumberShowRow;
            if (i == i9) {
                ahbVar.f(k96.M0(2131753728, "BadgeNumberShow"), ((NotificationsSettingsActivity) this.e).getNotificationsController().S, true);
                return;
            }
            i10 = ((NotificationsSettingsActivity) this.e).badgeNumberMutedRow;
            if (i == i10) {
                ahbVar.f(k96.M0(2131753729, "BadgeNumberMutedChats"), ((NotificationsSettingsActivity) this.e).getNotificationsController().T, true);
                return;
            }
            i11 = ((NotificationsSettingsActivity) this.e).badgeNumberMessagesRow;
            if (i == i11) {
                ahbVar.f(k96.M0(2131753727, "BadgeNumberUnread"), ((NotificationsSettingsActivity) this.e).getNotificationsController().U, false);
                return;
            }
            i12 = ((NotificationsSettingsActivity) this.e).inchatSoundRow;
            if (i == i12) {
                ahbVar.f(k96.M0(2131749021, "InChatSound"), sharedPreferences.getBoolean("EnableInChatSound", true), true);
                return;
            }
            NotificationsSettingsActivity notificationsSettingsActivity3 = (NotificationsSettingsActivity) this.e;
            if (i == notificationsSettingsActivity3.I) {
                ahbVar.f(k96.M0(2131743375, "Vibrate"), sharedPreferences.getBoolean("EnableCallVibrate", true), true);
                return;
            }
            i13 = notificationsSettingsActivity3.accountsAllRow;
            if (i == i13) {
                ahbVar.f(k96.M0(2131754299, "AllAccounts"), na7.d1().getBoolean("AllAccounts", true), false);
                return;
            }
            return;
        }
        if (i31 == 2) {
            hhb hhbVar = (hhb) s49Var.a;
            hhbVar.setMultilineDetail(true);
            i14 = ((NotificationsSettingsActivity) this.e).resetNotificationsRow;
            if (i == i14) {
                hhbVar.a(k96.M0(2131745919, "ResetAllNotifications"), k96.M0(2131743647, "UndoAllCustom"), false);
                return;
            }
            return;
        }
        if (i31 != 3) {
            if (i31 != 5) {
                if (i31 == 6) {
                    mhb mhbVar = (mhb) s49Var.a;
                    if (i == ((NotificationsSettingsActivity) this.e).s) {
                        mhbVar.setText(k96.M0(2131745143, "ShowNotificationsForInfo"));
                        return;
                    }
                    return;
                }
                return;
            }
            uib uibVar = (uib) s49Var.a;
            i30 = ((d) ((NotificationsSettingsActivity) this.e)).currentAccount;
            SharedPreferences sharedPreferences2 = na7.q1(i30).W3;
            NotificationsSettingsActivity notificationsSettingsActivity4 = (NotificationsSettingsActivity) this.e;
            if (i == notificationsSettingsActivity4.J) {
                String string = sharedPreferences2.getString("CallsRingtone", k96.M0(2131751587, "DefaultRingtone"));
                if (string.equals("NoSound")) {
                    string = k96.M0(2131747959, "NoSound");
                }
                uibVar.c(k96.M0(2131742999, "VoipSettingsRingtone"), string, ((NotificationsSettingsActivity) this.e).X, false);
                ((NotificationsSettingsActivity) this.e).X = false;
                return;
            }
            if (i != notificationsSettingsActivity4.I) {
                if (i == notificationsSettingsActivity4.R) {
                    int i32 = sharedPreferences2.getInt("repeat_messages", 60);
                    uibVar.c(k96.M0(2131746082, "RepeatNotifications"), i32 == 0 ? k96.M0(2131746081, "RepeatNotificationsNever") : i32 < 60 ? k96.G(i32, "Minutes", new Object[0]) : k96.G(i32 / 60, "Hours", new Object[0]), ((NotificationsSettingsActivity) this.e).Y, false);
                    ((NotificationsSettingsActivity) this.e).Y = false;
                    return;
                }
                return;
            }
            int i33 = sharedPreferences2.getInt("vibrate_calls", 0);
            if (i33 == 0) {
                uibVar.c(k96.M0(2131743375, "Vibrate"), k96.M0(2131743374, "VibrationDefault"), ((NotificationsSettingsActivity) this.e).W, true);
            } else if (i33 == 1) {
                uibVar.c(k96.M0(2131743375, "Vibrate"), k96.M0(2131745174, "Short"), ((NotificationsSettingsActivity) this.e).W, true);
            } else if (i33 == 2) {
                uibVar.c(k96.M0(2131743375, "Vibrate"), k96.M0(2131743373, "VibrationDisabled"), ((NotificationsSettingsActivity) this.e).W, true);
            } else if (i33 == 3) {
                uibVar.c(k96.M0(2131743375, "Vibrate"), k96.M0(2131748531, "Long"), ((NotificationsSettingsActivity) this.e).W, true);
            } else if (i33 == 4) {
                uibVar.c(k96.M0(2131743375, "Vibrate"), k96.M0(2131747628, "OnlyIfSilent"), ((NotificationsSettingsActivity) this.e).W, true);
            }
            ((NotificationsSettingsActivity) this.e).W = false;
            return;
        }
        vl7 vl7Var = (vl7) s49Var.a;
        i15 = ((d) ((NotificationsSettingsActivity) this.e)).currentAccount;
        SharedPreferences sharedPreferences3 = na7.q1(i15).W3;
        i16 = ((d) ((NotificationsSettingsActivity) this.e)).currentAccount;
        int currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
        i17 = ((NotificationsSettingsActivity) this.e).privateRow;
        if (i == i17) {
            M0 = k96.M0(2131747685, null);
            arrayList = ((NotificationsSettingsActivity) this.e).d;
            i21 = sharedPreferences3.getInt("EnableAll2", 0);
            i22 = R.drawable.msg_openprofile;
        } else {
            i18 = ((NotificationsSettingsActivity) this.e).groupRow;
            if (i != i18) {
                i19 = ((NotificationsSettingsActivity) this.e).storiesRow;
                int i34 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i == i19) {
                    M0 = k96.M0(2131747739, null);
                    NotificationsSettingsActivity notificationsSettingsActivity5 = (NotificationsSettingsActivity) this.e;
                    ArrayList arrayList3 = notificationsSettingsActivity5.h;
                    ArrayList arrayList4 = notificationsSettingsActivity5.n;
                    if (sharedPreferences3.getBoolean("EnableAllStories", false)) {
                        i34 = 0;
                    }
                    i23 = R.drawable.msg_menu_stories;
                    i21 = i34;
                    arrayList = arrayList3;
                    arrayList2 = arrayList4;
                } else {
                    i20 = ((NotificationsSettingsActivity) this.e).reactionsRow;
                    if (i == i20) {
                        M0 = k96.M0(2131747743, null);
                        i21 = (sharedPreferences3.getBoolean("EnableReactionsMessages", true) || sharedPreferences3.getBoolean("EnableReactionsStories", true)) ? 0 : Integer.MAX_VALUE;
                        arrayList = null;
                        i23 = R.drawable.msg_reactions;
                        arrayList2 = null;
                    } else {
                        M0 = k96.M0(2131747728, null);
                        arrayList = ((NotificationsSettingsActivity) this.e).f;
                        i21 = sharedPreferences3.getInt("EnableChannel2", 0);
                        i22 = R.drawable.msg_channel;
                    }
                }
                i24 = i21 >= currentTime ? 1 : 0;
                if (i24 == 0 || i21 - 31536000 >= currentTime) {
                    i25 = 0;
                    i26 = 0;
                } else {
                    i26 = 0;
                    i25 = 2;
                }
                StringBuilder sb = new StringBuilder();
                i27 = ((NotificationsSettingsActivity) this.e).reactionsRow;
                CharSequence charSequence = M0;
                if (i == i27) {
                    if (arrayList != null && !arrayList.isEmpty()) {
                        i24 = i21 < currentTime ? 1 : i26;
                        if (i24 != 0) {
                            sb.append(k96.M0(2131747699, "NotificationsOn"));
                        } else if (i21 - 31536000 >= currentTime) {
                            sb.append(k96.M0(2131747701, "NotificationsOff"));
                        } else {
                            Object[] objArr = new Object[1];
                            objArr[i26] = k96.e1(i21);
                            sb.append(k96.a0("NotificationsOffUntil", null, 2131747700, objArr));
                        }
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        int size = arrayList.size();
                        i28 = ((NotificationsSettingsActivity) this.e).storiesRow;
                        if (i == i28 && !sharedPreferences3.contains("EnableAllStories") && arrayList2 != null) {
                            size += arrayList2.size();
                        }
                        sb.append(k96.G(size, "Exception", new Object[i26]));
                    } else if (arrayList2 == null || arrayList2.isEmpty()) {
                        sb.append(k96.M0(2131744020, "TapToChange"));
                    } else {
                        if (i21 > 0) {
                            sb.append(k96.M0(2131747701, "NotificationsOff"));
                        } else {
                            sb.append(k96.M0(2131747699, "NotificationsOn"));
                        }
                        if (!arrayList2.isEmpty() && !sharedPreferences3.contains("EnableAllStories")) {
                            sb.append(", ");
                            sb.append(k96.G(arrayList2.size(), "AutoException", new Object[0]));
                        }
                    }
                    z = i24;
                } else if (i21 > 0) {
                    sb.append(k96.M0(2131747701, "NotificationsOff"));
                    z = i26;
                } else {
                    if (sharedPreferences3.getBoolean("EnableReactionsMessages", true)) {
                        sb.append(k96.M0(2131747742, null));
                    }
                    if (sharedPreferences3.getBoolean("EnableReactionsStories", true)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(k96.M0(2131747741, null));
                    }
                    z = 1;
                }
                i29 = ((NotificationsSettingsActivity) this.e).reactionsRow;
                vl7Var.b(charSequence, sb, i23, z, i25, false, i == i29, false);
            }
            M0 = k96.M0(2131747714, null);
            arrayList = ((NotificationsSettingsActivity) this.e).e;
            i21 = sharedPreferences3.getInt("EnableGroup2", 0);
            i22 = R.drawable.msg_groups;
        }
        i23 = i22;
        arrayList2 = null;
        if (i21 >= currentTime) {
        }
        if (i24 == 0) {
        }
        i25 = 0;
        i26 = 0;
        StringBuilder sb2 = new StringBuilder();
        i27 = ((NotificationsSettingsActivity) this.e).reactionsRow;
        CharSequence charSequence2 = M0;
        if (i == i27) {
        }
        i29 = ((NotificationsSettingsActivity) this.e).reactionsRow;
        vl7Var.b(charSequence2, sb2, i23, z, i25, false, i == i29, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ee, code lost:
    
        if (org.telegram.ui.Wallet.c.C(r7).Q() == false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void H(s49 s49Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        PasscodeActivity passcodeActivity = (PasscodeActivity) this.e;
        int i9 = s49Var.f;
        View view = s49Var.a;
        boolean z = true;
        if (i9 == 0) {
            ahb ahbVar = (ahb) view;
            i2 = passcodeActivity.fingerprintRow;
            if (i == i2) {
                ahbVar.f(k96.M0(2131743634, null), gba.C, false);
                return;
            }
            if (i == passcodeActivity.O) {
                ahbVar.f(k96.M0(2131745649, null), gba.z, false);
                return;
            }
            if (i != passcodeActivity.L) {
                if (i == passcodeActivity.K) {
                    String M0 = k96.M0(2131742922, null);
                    i3 = ((d) passcodeActivity).currentAccount;
                    ahbVar.f(M0, c.C(i3).R(), false);
                    return;
                }
                return;
            }
            String M02 = k96.M0(2131742923, null);
            i4 = ((d) passcodeActivity).currentAccount;
            if (c.C(i4).e()) {
                i5 = ((d) passcodeActivity).currentAccount;
            }
            z = false;
            ahbVar.f(M02, z, false);
            return;
        }
        if (i9 == 1) {
            uib uibVar = (uib) view;
            i6 = passcodeActivity.changePasscodeRow;
            if (i == i6) {
                uibVar.b(k96.M0(2131752532, null), true);
                if (gba.r.isEmpty()) {
                    int i10 = bkb.D6;
                    uibVar.setTag(Integer.valueOf(i10));
                    zkb.X(uibVar.getTextView(), i10, null);
                    return;
                } else {
                    int i11 = bkb.F6;
                    uibVar.setTag(Integer.valueOf(i11));
                    zkb.X(uibVar.getTextView(), i11, null);
                    return;
                }
            }
            i7 = passcodeActivity.autoLockRow;
            if (i == i7) {
                int i12 = gba.x;
                uibVar.c(k96.M0(2131753797, null), i12 == 0 ? k96.a0("AutoLockDisabled", null, 2131753796, new Object[0]) : i12 < 3600 ? k96.a0("AutoLockInTime", null, 2131753795, k96.G(i12 / 60, "Minutes", new Object[0])) : i12 < 86400 ? k96.a0("AutoLockInTime", null, 2131753795, k96.G((int) Math.ceil((i12 / 60.0f) / 60.0f), "Hours", new Object[0])) : k96.a0("AutoLockInTime", null, 2131753795, k96.G((int) Math.ceil(((i12 / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])), false, true);
                int i13 = bkb.F6;
                uibVar.setTag(Integer.valueOf(i13));
                zkb.X(uibVar.getTextView(), i13, null);
                return;
            }
            i8 = passcodeActivity.disablePasscodeRow;
            if (i == i8) {
                uibVar.b(k96.M0(2131751421, null), false);
                int i14 = bkb.p7;
                uibVar.setTag(Integer.valueOf(i14));
                zkb.X(uibVar.getTextView(), i14, null);
                return;
            }
            return;
        }
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 == 4) {
                    lv7 lv7Var = (lv7) view;
                    lv7Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    lv7Var.a.d();
                    return;
                }
                return;
            }
            ld5 ld5Var = (ld5) view;
            ld5Var.setHeight(46);
            if (i == passcodeActivity.N) {
                ld5Var.setText(k96.M0(2131745651, null));
                return;
            } else {
                if (i == passcodeActivity.J) {
                    ld5Var.setText(k96.M0(2131742835, null));
                    return;
                }
                return;
            }
        }
        mhb mhbVar = (mhb) view;
        if (i == passcodeActivity.H) {
            mhbVar.setText(k96.M0(2131747462, null));
            mhbVar.setBackground(null);
            mhbVar.getTextView().setGravity(1);
        } else if (i == passcodeActivity.I) {
            mhbVar.setText(k96.M0(2131753794, null));
            mhbVar.getTextView().setGravity(k96.a0 ? 5 : 3);
        } else if (i == passcodeActivity.M) {
            mhbVar.setText(k96.M0(2131742834, null));
            mhbVar.getTextView().setGravity(k96.a0 ? 5 : 3);
        } else if (i == passcodeActivity.P) {
            mhbVar.setText(k96.M0(2131745650, null));
            mhbVar.getTextView().setGravity(k96.a0 ? 5 : 3);
        }
    }

    private final void I(s49 s49Var, int i) {
        l58 l58Var = (l58) this.e;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0) {
            if (i2 == 1) {
                w48 w48Var = (w48) view;
                w48Var.setTag(Integer.valueOf(i));
                if (i == l58Var.E) {
                    w48Var.a(l58Var.O, k96.M0(2131743873, null));
                    return;
                } else {
                    if (i == l58Var.F) {
                        w48Var.a(l58Var.P, k96.M0(2131743874, null));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        x48 x48Var = (x48) view;
        x48Var.setTag(Integer.valueOf(i));
        if (i == l58Var.b) {
            x48Var.a(k96.M0(2131751114, null), 0, l58Var.H);
            return;
        }
        if (i == l58Var.r) {
            x48Var.a(k96.M0(2131749110, null), -100, l58Var.Q);
            return;
        }
        if (i == l58Var.d) {
            x48Var.a(k96.M0(2131751757, null), -100, l58Var.J);
            return;
        }
        if (i == l58Var.c) {
            x48Var.a(k96.M0(2131750845, null), -100, l58Var.I);
            return;
        }
        if (i == l58Var.f) {
            x48Var.a(k96.M0(2131742686, null), -100, l58Var.K);
            return;
        }
        if (i == l58Var.e) {
            x48Var.a(k96.M0(2131745755, null), -100, l58Var.L);
            return;
        }
        if (i == l58Var.w) {
            x48Var.a(k96.M0(2131743282, null), 0, l58Var.S);
            return;
        }
        if (i == l58Var.s) {
            x48Var.a(k96.M0(2131745273, null), -100, l58Var.R);
            return;
        }
        if (i == l58Var.x) {
            x48Var.a(k96.M0(2131749349, null), 0, l58Var.T);
            return;
        }
        if (i == l58Var.y) {
            x48Var.a(k96.M0(2131745175, null), 0, l58Var.V);
        } else if (i == l58Var.h) {
            x48Var.a(k96.M0(2131750834, null), 0, l58Var.M);
        } else if (i == l58Var.n) {
            x48Var.a(k96.M0(2131745101, null), 0, l58Var.N);
        }
    }

    private final void J(s49 s49Var, int i) {
        boolean P0;
        u58 u58Var = (u58) this.e;
        xl6 xl6Var = u58Var.K;
        ArrayList arrayList = u58Var.n;
        ArrayList arrayList2 = u58Var.c;
        HashMap hashMap = u58Var.b;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            o48 o48Var = (o48) view;
            o48Var.setItemSize(u58Var.S);
            be0 imageView = o48Var.getImageView();
            o48Var.setTag(Integer.valueOf(i));
            imageView.q();
            if (xl6Var != null) {
                jm6 jm6Var = (jm6) xl6Var.e.get(i);
                o48Var.d(jm6Var, arrayList2.size() > 1, true, false, false);
                int i3 = jm6Var.C;
                o48Var.b(u58Var.e ? arrayList2.indexOf(Integer.valueOf(i3)) : -1, hashMap.containsKey(Integer.valueOf(i3)), false);
                P0 = PhotoViewer.P0(jm6Var.I);
            } else {
                nm6 nm6Var = (nm6) u58Var.f.get(i);
                o48Var.e(nm6Var);
                o48Var.getVideoInfoContainer().setVisibility(4);
                o48Var.b(u58Var.e ? arrayList2.indexOf(nm6Var.B) : -1, hashMap.containsKey(nm6Var.B), false);
                P0 = PhotoViewer.P0(nm6Var.g());
            }
            imageView.getImageReceiver().v0(!P0, true);
            o48Var.getCheckBox().setVisibility((u58Var.U != 0 || P0) ? 8 : 0);
            return;
        }
        if (i2 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = u58Var.S;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i2 == 2) {
            jm6 jm6Var2 = (jm6) xl6Var.e.get(i);
            iba ibaVar = (iba) view;
            ibaVar.setPhotoEntry(jm6Var2);
            ibaVar.b(hashMap.containsKey(Integer.valueOf(jm6Var2.C)), false);
            ibaVar.setTag(Integer.valueOf(i));
            return;
        }
        if (i2 == 3) {
            wgb wgbVar = (wgb) view;
            if (i < arrayList.size()) {
                wgbVar.o(R.drawable.msg_recent, (CharSequence) arrayList.get(i), false);
            } else {
                wgbVar.o(R.drawable.msg_clear_recent, k96.M0(2131752055, null), false);
            }
        }
    }

    private final void K(s49 s49Var, int i) {
        PhotoViewer photoViewer = (PhotoViewer) this.e;
        Context context = (Context) this.d;
        y58 y58Var = (y58) s49Var.a;
        int L = gl.L(85.0f);
        int L2 = i != 0 ? gl.L(6.0f) : 0;
        y58Var.f = L;
        wf2 wf2Var = y58Var.c;
        be0 be0Var = y58Var.a;
        jo0 jo0Var = y58Var.e;
        y58Var.h = L2;
        ((FrameLayout.LayoutParams) y58Var.b.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) be0Var.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) jo0Var.getLayoutParams()).rightMargin = L2;
        be0Var.q();
        Object obj = photoViewer.d.u().get(photoViewer.d.d().get(i));
        if (!(obj instanceof jm6)) {
            if (obj instanceof nm6) {
                nm6 nm6Var = (nm6) obj;
                y58Var.setTag(nm6Var);
                y58Var.setImage(nm6Var);
                jo0Var.setVisibility(4);
                wf2Var.a.f(-1, true, false);
                wf2Var.setVisibility(0);
                return;
            }
            return;
        }
        jm6 jm6Var = (jm6) obj;
        int i2 = jm6Var.C;
        String str = jm6Var.I;
        y58Var.setTag(jm6Var);
        jo0Var.setVisibility(4);
        String str2 = jm6Var.c;
        if (str2 != null) {
            be0Var.o(str2, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (str != null) {
            be0Var.r(jm6Var.J, jm6Var.K, true);
            if (!jm6Var.b || jm6Var.d()) {
                be0Var.o(mue.d("thumb://", i2, ":", str), null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                jo0Var.setVisibility(0);
                y58Var.d.setText(gl.g0(jm6Var.E, false, false));
                be0Var.o("vthumb://" + i2 + ":" + str, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            be0Var.setImageResource(R.drawable.nophotos);
        }
        wf2Var.a.f(-1, true, false);
        wf2Var.setVisibility(0);
    }

    private final void L(s49 s49Var, int i) {
        int i2;
        int i3;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i4 = s49Var.f;
        View view = s49Var.a;
        switch (i4) {
            case 1:
                uib uibVar = (uib) view;
                zkb.X(uibVar.getTextView(), bkb.F6, null);
                i2 = proxyListActivity.proxyAddRow;
                if (i == i2) {
                    uibVar.b(k96.M0(2131754388, null), proxyListActivity.E != -1);
                    break;
                } else if (i == proxyListActivity.E) {
                    zkb.X(uibVar.getTextView(), bkb.o7, null);
                    uibVar.b(k96.M0(2131751568, null), false);
                    break;
                }
                break;
            case 2:
                ld5 ld5Var = (ld5) view;
                if (i == proxyListActivity.h) {
                    ld5Var.setText(k96.M0(2131746412, null));
                    break;
                }
                break;
            case 3:
                ahb ahbVar = (ahb) view;
                i3 = proxyListActivity.useProxyRow;
                if (i == i3) {
                    ahbVar.f(k96.M0(2131743544, null), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else if (i == proxyListActivity.w) {
                    ahbVar.f(k96.M0(2131743546, null), gba.X0, true);
                    break;
                }
                break;
            case 4:
                mhb mhbVar = (mhb) view;
                if (i == proxyListActivity.y) {
                    mhbVar.setText(k96.M0(2131746410, null));
                    break;
                }
                break;
            case 5:
                yt8 yt8Var = (yt8) view;
                fba fbaVar = (fba) arrayList2.get(i - proxyListActivity.n);
                yt8Var.setProxy(fbaVar);
                yt8Var.setChecked(gba.y1 == fbaVar);
                boolean contains = arrayList.contains(arrayList2.get(i - proxyListActivity.n));
                yt8Var.h = contains;
                yt8Var.f.a(contains, false);
                yt8Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i == proxyListActivity.x) {
                    fja fjaVar = (fja) view;
                    ArrayList arrayList3 = new ArrayList(zt8.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                        strArr[i5] = k96.a0(null, null, 2131746409, arrayList3.get(i5));
                    }
                    fjaVar.setCallback(new sc8((byte) 7));
                    fjaVar.b(gba.Y0, null, strArr);
                    break;
                }
                break;
        }
    }

    private final void M(s49 s49Var, int i) {
        TextView textView;
        kga kgaVar = (kga) this.e;
        int i2 = s49Var.f;
        if (i2 == 0) {
            ((hga) s49Var.a).setDialog(kga.D0(i - 1));
        } else {
            if (i2 != 1 || (textView = kgaVar.o1) == null) {
                return;
            }
            textView.setText(k96.a0("SharingLiveLocationTitle", null, 2131745200, k96.G(eb6.g(), "Chats", new Object[0])));
        }
    }

    private final void N(s49 s49Var, int i) {
        cbb cbbVar = (cbb) s49Var.a;
        dbb dbbVar = (dbb) this.d;
        ArrayList arrayList = dbbVar.x;
        String str = arrayList == null ? null : ((dq6) arrayList.get(i)).a;
        int direction = dbbVar.getDirection();
        int i2 = cbb.h;
        cbbVar.a = str;
        if (str == null || !str.startsWith("animated_")) {
            cbbVar.setImageDrawable(vu3.f(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = cbbVar.b;
                if (!(drawable instanceof vl) || ((vl) drawable).h() != parseLong) {
                    cbbVar.setImageDrawable(vl.m(y6c.t0, parseLong, null, cbbVar.f.c()));
                }
            } catch (Exception unused) {
                cbbVar.setImageDrawable(null);
            }
        }
        if (cbbVar.d != direction) {
            cbbVar.d = direction;
            cbbVar.requestLayout();
        }
    }

    private final void O(s49 s49Var, int i) {
        ArrayList arrayList = (ArrayList) this.e;
        if (s49Var.f == 0) {
            ue3 ue3Var = (ue3) s49Var.a;
            ue3Var.t2 = i != arrayList.size() - 1;
            ue3Var.setDialog((pe3) arrayList.get(i));
        }
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
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
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                int b2 = s49Var.b();
                if (b2 != 1) {
                    i = ((d) ((vl9) obj)).currentAccount;
                    if (!MediaController.r0(i) || b2 != 2) {
                    }
                }
                break;
            case 1:
                int b3 = s49Var.b();
                k62 k62Var = (k62) obj;
                if (b3 == k62Var.v0 || b3 == k62Var.H0 || b3 == k62Var.C0 || b3 == k62Var.G0 || b3 == k62Var.D0 || b3 == k62Var.I0 || b3 == k62Var.E0 || b3 == k62Var.F0 || b3 == k62Var.J0 || b3 == k62Var.K0 || b3 == k62Var.O0.b || b3 == k62Var.N0.b || b3 == k62Var.M0) {
                    break;
                }
                break;
            case 2:
                int b4 = s49Var.b();
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj;
                i2 = dataAutoDownloadActivity.photosRow;
                if (b4 != i2) {
                    i3 = dataAutoDownloadActivity.videosRow;
                    if (b4 != i3) {
                        i4 = dataAutoDownloadActivity.filesRow;
                        if (b4 != i4) {
                            i5 = dataAutoDownloadActivity.storiesRow;
                            if (b4 != i5) {
                            }
                        }
                    }
                }
                break;
            case 3:
                int b5 = s49Var.b();
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                if (b5 != dataSettingsActivity.e && b5 != dataSettingsActivity.f && b5 != dataSettingsActivity.h && b5 != dataSettingsActivity.s) {
                    i6 = dataSettingsActivity.useLessDataForCallsRow;
                    if (b5 != i6 && b5 != dataSettingsActivity.w) {
                        i7 = dataSettingsActivity.proxyRow;
                        if (b5 != i7) {
                            i8 = dataSettingsActivity.clearDraftsRow;
                            if (b5 != i8 && b5 != dataSettingsActivity.F && b5 != dataSettingsActivity.E && b5 != dataSettingsActivity.G && b5 != dataSettingsActivity.H && b5 != dataSettingsActivity.L && b5 != dataSettingsActivity.K && b5 != dataSettingsActivity.n) {
                                i9 = dataSettingsActivity.saveToGalleryGroupsRow;
                                if (b5 != i9) {
                                    i10 = dataSettingsActivity.saveToGalleryPeerRow;
                                    if (b5 != i10) {
                                        i11 = dataSettingsActivity.saveToGalleryChannelsRow;
                                        if (b5 != i11) {
                                            i12 = dataSettingsActivity.resetDownloadRow;
                                            if (b5 != i12) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 6:
                if (ug8.G(3)[s49Var.f] == 1) {
                    break;
                }
                break;
            case 7:
                int b6 = s49Var.b();
                pf6 pf6Var = (pf6) obj;
                if (b6 == pf6Var.c || b6 == pf6Var.d || b6 == pf6Var.e || b6 == pf6Var.f || b6 == pf6Var.h || b6 == pf6Var.r) {
                    break;
                }
                break;
            case 8:
                int b7 = s49Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                if (b7 != notificationsSettingsActivity.y && b7 != notificationsSettingsActivity.E && b7 != notificationsSettingsActivity.F && b7 != notificationsSettingsActivity.L && b7 != notificationsSettingsActivity.N && b7 != notificationsSettingsActivity.T && b7 != notificationsSettingsActivity.O && b7 != notificationsSettingsActivity.M && b7 != notificationsSettingsActivity.S && b7 != notificationsSettingsActivity.G && b7 != notificationsSettingsActivity.H && b7 != notificationsSettingsActivity.P && b7 != notificationsSettingsActivity.r && b7 != notificationsSettingsActivity.s && b7 != notificationsSettingsActivity.U && b7 != notificationsSettingsActivity.K) {
                    break;
                }
                break;
            case 9:
                int b8 = s49Var.b();
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                i13 = passcodeActivity.fingerprintRow;
                if (b8 != i13) {
                    i14 = passcodeActivity.autoLockRow;
                    if (b8 != i14 && b8 != passcodeActivity.O) {
                        i15 = passcodeActivity.changePasscodeRow;
                        if (b8 != i15) {
                            i16 = passcodeActivity.disablePasscodeRow;
                            if (b8 != i16 && b8 != passcodeActivity.K && b8 != passcodeActivity.L) {
                            }
                        }
                    }
                }
                break;
            case 12:
                u58 u58Var = (u58) obj;
                if (u58Var.K == null) {
                    if (TextUtils.isEmpty(u58Var.w)) {
                        if (s49Var.f != 3) {
                        }
                    } else if (s49Var.b() >= u58Var.f.size()) {
                    }
                }
                break;
            case 14:
                int b9 = s49Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                i17 = proxyListActivity.useProxyRow;
                if (b9 != i17 && b9 != proxyListActivity.w) {
                    i18 = proxyListActivity.proxyAddRow;
                    if (b9 != i18 && b9 != proxyListActivity.E && (b9 < proxyListActivity.n || b9 >= proxyListActivity.r)) {
                    }
                }
                break;
            case 15:
                if (s49Var.f == 0) {
                    break;
                }
                break;
            case 17:
                if (s49Var.f != 1) {
                    break;
                }
                break;
        }
        return true;
    }

    public final void E() {
        pha phaVar;
        pha phaVar2;
        pha phaVar3;
        pha phaVar4;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        int size = proxyListActivity.F.size();
        phaVar = ((d) proxyListActivity).simpleActionBar;
        boolean x = phaVar.x();
        if (size <= 0) {
            if (x) {
                phaVar2 = ((d) proxyListActivity).simpleActionBar;
                phaVar2.w();
                int i = proxyListActivity.n;
                n(i, proxyListActivity.r - i, 2);
                return;
            }
            return;
        }
        phaVar3 = ((d) proxyListActivity).simpleActionBar;
        phaVar3.F(size, x);
        if (x) {
            return;
        }
        phaVar4 = ((d) proxyListActivity).simpleActionBar;
        phaVar4.J();
        int i2 = proxyListActivity.n;
        n(i2, proxyListActivity.r - i2, 2);
    }

    public final void F() {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        proxyListActivity.F.clear();
        int i = proxyListActivity.n;
        n(i, proxyListActivity.r - i, 1);
        E();
    }

    public final void P(int i) {
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        int i2 = proxyListActivity.n;
        if (i < i2 || i >= proxyListActivity.r) {
            return;
        }
        fba fbaVar = (fba) proxyListActivity.G.get(i - i2);
        if (arrayList.contains(fbaVar)) {
            arrayList.remove(fbaVar);
        } else {
            arrayList.add(fbaVar);
        }
        h(i, 1);
        E();
    }

    @Override // w39
    public final int b() {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return 4;
            case 1:
                return ((k62) obj).R0;
            case 2:
                return ((DataAutoDownloadActivity) obj).y;
            case 3:
                return ((DataSettingsActivity) obj).U;
            case 4:
                return ((he4) obj).h.size();
            case 5:
                int size = ((cf4) obj).u1.size();
                return size < 10 ? size + 1 : size;
            case 6:
                return ((hj4) obj).F.size();
            case 7:
                return ((pf6) obj).w;
            case 8:
                return ((NotificationsSettingsActivity) obj).V;
            case 9:
                return ((PasscodeActivity) obj).Q;
            case 10:
                if (((g48) obj).d != null) {
                    return (int) Math.ceil(r4.size() / r2.f);
                }
                return 0;
            case 11:
                return ((l58) obj).G;
            case 12:
                u58 u58Var = (u58) obj;
                ArrayList arrayList = u58Var.n;
                ArrayList arrayList2 = u58Var.f;
                xl6 xl6Var = u58Var.K;
                if (xl6Var != null) {
                    return xl6Var.e.size();
                }
                if (!arrayList2.isEmpty()) {
                    return arrayList2.size() + (!u58Var.s ? 1 : 0);
                }
                if (!TextUtils.isEmpty(u58Var.w) || arrayList.isEmpty()) {
                    return 0;
                }
                return arrayList.size() + 2;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                o98 o98Var = photoViewer.d;
                if (o98Var == null || o98Var.d() == null) {
                    return 0;
                }
                return photoViewer.d.d().size();
            case 14:
                return ((ProxyListActivity) obj).e;
            case 15:
                return eb6.g() + 1;
            case 16:
                ArrayList arrayList3 = ((dbb) this.d).x;
                if (arrayList3 != null) {
                    return arrayList3.size();
                }
                return 0;
            case 17:
                return ((ArrayList) obj).size();
            default:
                return ((vec) obj).h.size();
        }
    }

    @Override // w39
    public final long c(int i) {
        int i2;
        int i3;
        int i4;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 4:
                i2 = ((he4) obj).l0.get(i);
                break;
            case 11:
            case 12:
                return i;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (i == proxyListActivity.f) {
                    return -1L;
                }
                if (i == proxyListActivity.s) {
                    return -2L;
                }
                i3 = proxyListActivity.proxyAddRow;
                if (i == i3) {
                    return -3L;
                }
                i4 = proxyListActivity.useProxyRow;
                if (i == i4) {
                    return -4L;
                }
                if (i == proxyListActivity.h) {
                    return -6L;
                }
                if (i == proxyListActivity.E) {
                    return -8L;
                }
                if (i == proxyListActivity.w) {
                    return -9L;
                }
                if (i == proxyListActivity.x) {
                    return -10L;
                }
                if (i == proxyListActivity.y) {
                    return -11L;
                }
                if (i < proxyListActivity.n || i >= proxyListActivity.r) {
                    return -7L;
                }
                return ((fba) proxyListActivity.G.get(i - r2)).hashCode();
            case 16:
                if (((dbb) this.d).x == null) {
                    return 0L;
                }
                return ((dq6) r2.get(i)).a.hashCode();
            case 18:
                i2 = ((sec) ((vec) obj).h.get(i)).a;
                break;
            default:
                return super.c(i);
        }
        return i2;
    }

    @Override // w39
    public final int d(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
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
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                if (i == 0) {
                    return 0;
                }
                if (i == 1) {
                    return 1;
                }
                return i == 2 ? 2 : 3;
            case 1:
                k62 k62Var = (k62) obj;
                if (i == k62Var.C0 || i == k62Var.G0 || i == k62Var.H0 || i == k62Var.D0 || i == k62Var.E0 || i == k62Var.F0 || i == k62Var.I0 || i == k62Var.N0.b || i == k62Var.O0.b) {
                    return 10;
                }
                if (i == k62Var.m0 || i == k62Var.t0 || i == k62Var.x0 || i == k62Var.p0) {
                    return 0;
                }
                if (i == k62Var.s0) {
                    return 1;
                }
                if (i == k62Var.w0 || i == k62Var.y0 || i == k62Var.r0 || i == k62Var.L0) {
                    return 2;
                }
                if (i == k62Var.v0 || i == k62Var.J0 || i == k62Var.M0) {
                    return 3;
                }
                if (i == k62Var.n0) {
                    return 4;
                }
                if (i == k62Var.o0) {
                    return 11;
                }
                if (i == k62Var.q0) {
                    return 7;
                }
                if (i == k62Var.z0 || i == k62Var.A0 || i == k62Var.K0) {
                    return 6;
                }
                if (i == k62Var.B0) {
                    return 8;
                }
                return i == 0 ? 9 : 5;
            case 2:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj;
                i2 = dataAutoDownloadActivity.autoDownloadRow;
                if (i == i2) {
                    return 0;
                }
                if (i == dataAutoDownloadActivity.s) {
                    return 1;
                }
                if (i == dataAutoDownloadActivity.r || i == dataAutoDownloadActivity.w) {
                    return 2;
                }
                i3 = dataAutoDownloadActivity.usageProgressRow;
                if (i == i3) {
                    return 3;
                }
                i4 = dataAutoDownloadActivity.photosRow;
                if (i != i4) {
                    i5 = dataAutoDownloadActivity.videosRow;
                    if (i != i5) {
                        i6 = dataAutoDownloadActivity.filesRow;
                        if (i != i6) {
                            i7 = dataAutoDownloadActivity.storiesRow;
                            if (i != i7) {
                                return 5;
                            }
                        }
                    }
                }
                return 4;
            case 3:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                if (i == dataSettingsActivity.r || i == dataSettingsActivity.x || i == dataSettingsActivity.O || i == dataSettingsActivity.Q || i == dataSettingsActivity.M || i == dataSettingsActivity.R || i == dataSettingsActivity.T) {
                    return 0;
                }
                if (i == dataSettingsActivity.d || i == dataSettingsActivity.y || i == dataSettingsActivity.N || i == 0 || i == dataSettingsActivity.P || i == dataSettingsActivity.J || i == dataSettingsActivity.S) {
                    return 2;
                }
                if (i == dataSettingsActivity.F || i == dataSettingsActivity.E || i == dataSettingsActivity.G || i == dataSettingsActivity.H || i == dataSettingsActivity.K || i == dataSettingsActivity.L) {
                    return 3;
                }
                if (i == dataSettingsActivity.I) {
                    return 4;
                }
                if (i != dataSettingsActivity.e && i != dataSettingsActivity.h && i != dataSettingsActivity.f) {
                    i8 = dataSettingsActivity.saveToGalleryGroupsRow;
                    if (i != i8) {
                        i9 = dataSettingsActivity.saveToGalleryPeerRow;
                        if (i != i9) {
                            i10 = dataSettingsActivity.saveToGalleryChannelsRow;
                            if (i != i10) {
                                return (i == dataSettingsActivity.s || i == dataSettingsActivity.w || i == dataSettingsActivity.n) ? 6 : 1;
                            }
                        }
                    }
                }
                return 5;
            case 4:
            case 5:
                return 0;
            case 6:
                return ug8.F(((zi4) ((hj4) obj).F.get(i)).b);
            case 7:
                pf6 pf6Var = (pf6) obj;
                if (i == 0) {
                    return 0;
                }
                if (i == pf6Var.c || i == pf6Var.d || i == pf6Var.e || i == pf6Var.f || i == pf6Var.h) {
                    return 1;
                }
                if (i == pf6Var.n) {
                    return 2;
                }
                return i == pf6Var.r ? 3 : 4;
            case 8:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                if (i == notificationsSettingsActivity.L || i == notificationsSettingsActivity.N || i == notificationsSettingsActivity.T || i == notificationsSettingsActivity.H || i == notificationsSettingsActivity.O || i == notificationsSettingsActivity.F || i == notificationsSettingsActivity.y || i == notificationsSettingsActivity.r) {
                    return 0;
                }
                i11 = notificationsSettingsActivity.inappSoundRow;
                if (i != i11) {
                    i12 = notificationsSettingsActivity.inappVibrateRow;
                    if (i != i12 && i != notificationsSettingsActivity.x) {
                        i13 = notificationsSettingsActivity.inappPreviewRow;
                        if (i != i13) {
                            i14 = notificationsSettingsActivity.contactJoinedRow;
                            if (i != i14) {
                                i15 = notificationsSettingsActivity.pinnedMessageRow;
                                if (i != i15 && i != notificationsSettingsActivity.w) {
                                    i16 = notificationsSettingsActivity.badgeNumberMutedRow;
                                    if (i != i16) {
                                        i17 = notificationsSettingsActivity.badgeNumberMessagesRow;
                                        if (i != i17) {
                                            i18 = notificationsSettingsActivity.badgeNumberShowRow;
                                            if (i != i18) {
                                                i19 = notificationsSettingsActivity.inappPriorityRow;
                                                if (i != i19) {
                                                    i20 = notificationsSettingsActivity.inchatSoundRow;
                                                    if (i != i20 && i != notificationsSettingsActivity.Q) {
                                                        i21 = notificationsSettingsActivity.accountsAllRow;
                                                        if (i != i21) {
                                                            i22 = notificationsSettingsActivity.resetNotificationsRow;
                                                            if (i == i22) {
                                                                return 2;
                                                            }
                                                            i23 = notificationsSettingsActivity.privateRow;
                                                            if (i != i23) {
                                                                i24 = notificationsSettingsActivity.groupRow;
                                                                if (i != i24) {
                                                                    i25 = notificationsSettingsActivity.channelsRow;
                                                                    if (i != i25) {
                                                                        i26 = notificationsSettingsActivity.storiesRow;
                                                                        if (i != i26) {
                                                                            i27 = notificationsSettingsActivity.reactionsRow;
                                                                            if (i != i27) {
                                                                                if (i == notificationsSettingsActivity.K || i == notificationsSettingsActivity.E || i == notificationsSettingsActivity.M || i == notificationsSettingsActivity.S || i == notificationsSettingsActivity.G || i == notificationsSettingsActivity.P || i == notificationsSettingsActivity.U) {
                                                                                    return 4;
                                                                                }
                                                                                return i != notificationsSettingsActivity.s ? 5 : 6;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            return 3;
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
                return 1;
            case 9:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                i28 = passcodeActivity.fingerprintRow;
                if (i != i28 && i != passcodeActivity.O && i != passcodeActivity.L && i != passcodeActivity.K) {
                    i29 = passcodeActivity.changePasscodeRow;
                    if (i != i29) {
                        i30 = passcodeActivity.autoLockRow;
                        if (i != i30) {
                            i31 = passcodeActivity.disablePasscodeRow;
                            if (i != i31) {
                                if (i == passcodeActivity.I || i == passcodeActivity.P || i == passcodeActivity.H || i == passcodeActivity.M) {
                                    return 2;
                                }
                                if (i == passcodeActivity.N || i == passcodeActivity.J) {
                                    return 3;
                                }
                                if (i == 0) {
                                    return 4;
                                }
                            }
                        }
                    }
                    return 1;
                }
                return 0;
            case 10:
                return 0;
            case 11:
                l58 l58Var = (l58) obj;
                return (i == l58Var.E || i == l58Var.F) ? 1 : 0;
            case 12:
                u58 u58Var = (u58) obj;
                ArrayList arrayList = u58Var.f;
                if (u58Var.Z) {
                    return 2;
                }
                if (u58Var.K == null) {
                    if (arrayList.isEmpty()) {
                        return i != u58Var.n.size() ? 3 : 4;
                    }
                    if (i >= arrayList.size()) {
                        return 1;
                    }
                }
                return 0;
            case 13:
                return 0;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (i == proxyListActivity.f || i == proxyListActivity.s) {
                    return 0;
                }
                i32 = proxyListActivity.proxyAddRow;
                if (i == i32 || i == proxyListActivity.E) {
                    return 1;
                }
                i33 = proxyListActivity.useProxyRow;
                if (i == i33 || i == proxyListActivity.w) {
                    return 3;
                }
                if (i == proxyListActivity.h) {
                    return 2;
                }
                if (i != proxyListActivity.x) {
                    return (i < proxyListActivity.n || i >= proxyListActivity.r) ? 4 : 5;
                }
                return 6;
            case 15:
                return i != 0 ? 0 : 1;
            case 16:
            default:
                return super.d(i);
            case 17:
                return i != ((ArrayList) obj).size() ? 0 : 1;
            case 18:
                return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:214:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0654  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        int i2;
        boolean z;
        String G;
        int i3;
        int i4;
        int i5;
        int i6;
        String M0;
        int i7;
        int i8;
        tp3 o;
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
        String M02;
        int i23;
        int i24;
        tp3 o2;
        int i25;
        boolean z2;
        boolean z3;
        int i26;
        boolean z4;
        int i27;
        String str;
        CharSequence charSequence;
        int i28;
        int i29;
        String M03;
        int i30;
        CharSequence c;
        int i31;
        boolean a;
        CharSequence charSequence2;
        int i32;
        wgb wgbVar;
        int i33;
        uec uecVar;
        byte b = this.c;
        Object obj = this.d;
        char c2 = 4;
        Object obj2 = this.e;
        r8 = false;
        r8 = false;
        boolean z5 = false;
        int i34 = 0;
        int i35 = 0;
        r8 = false;
        boolean z6 = false;
        boolean z7 = true;
        switch (b) {
            case 0:
                i2 = ((d) ((vl9) obj2)).currentAccount;
                boolean r0 = MediaController.r0(i2);
                int i36 = s49Var.f;
                View view = s49Var.a;
                if (i36 == 0) {
                    ((ld5) view).setText(k96.M0(2131753921, null));
                    break;
                } else if (i36 == 1) {
                    ((ahb) view).f(k96.M0(2131753915, null), r0, false);
                    break;
                } else if (i36 == 2) {
                    uib uibVar = (uib) view;
                    uibVar.setEnabled(r0);
                    uibVar.c(k96.M0(2131753919, null), k96.M0(((e30) wcd.c.a()) == e30.b ? 2131753917 : 2131753918, null), false, false);
                    break;
                } else {
                    ((mhb) view).setText(k96.M0(2131753920, null));
                    break;
                }
            case 1:
                Context context = (Context) obj;
                k62 k62Var = (k62) obj2;
                boolean z8 = k62Var.f0;
                c9c c9cVar = k62Var.N0;
                c9c c9cVar2 = k62Var.O0;
                wjb wjbVar = k62Var.a;
                boolean z9 = k62Var.n;
                int i37 = s49Var.f;
                View view2 = s49Var.a;
                if (i37 != 0) {
                    if (i37 != 6) {
                        if (i37 != 2) {
                            if (i37 != 3) {
                                if (i37 != 9) {
                                    if (i37 == 10) {
                                        je8 je8Var = (je8) view2;
                                        je8Var.setDivider(false);
                                        if (i == k62Var.C0) {
                                            je8Var.a(k96.M0(2131746931, null), k96.M0(2131746930, null), mj5.c, R.drawable.filled_poll_view_24, !k62Var.b0);
                                        } else {
                                            if (i == k62Var.G0) {
                                                je8Var.a(k96.M0(2131746956, null), k96.M0(2131746955, null), mj5.f, R.drawable.filled_poll_multiple_24, k62Var.c0);
                                            } else if (i == k62Var.E0) {
                                                je8Var.a(k96.M0(2131746954, null), k96.M0(2131746953, null), mj5.w, R.drawable.filled_poll_revote_24, k62Var.S);
                                            } else if (i == k62Var.D0) {
                                                je8Var.a(k96.M0(2131746958, null), k96.M0(2131746957, null), mj5.s, R.drawable.filled_poll_add_24, k62Var.U);
                                            } else if (i == k62Var.F0) {
                                                je8Var.a(k96.M0(2131746929, null), k96.M0(2131746928, null), mj5.h, R.drawable.filled_poll_shuffle_24, k62Var.T);
                                            } else if (i == k62Var.H0) {
                                                je8Var.a(k96.M0(2131746933, null), k96.M0(2131746932, null), mj5.n, R.drawable.filled_poll_correct_24, k62Var.d0);
                                            } else if (i == c9cVar2.b) {
                                                je8Var.a(k96.M0(2131746944, null), k96.M0(2131746943, null), mj5.e, R.drawable.filled_location, c9cVar2.a);
                                            } else if (i == c9cVar.b) {
                                                je8Var.a(k96.M0(2131746936, null), k96.M0(2131746935, null), mj5.d, R.drawable.msg_folders_groups, c9cVar.a);
                                            } else if (i == k62Var.I0) {
                                                je8Var.a(k96.M0(2131746942, null), k96.M0(2131746941, null), mj5.r, R.drawable.filled_poll_deadline_24, (k62Var.V == 0 && k62Var.W == 0) ? false : true);
                                                je8Var = je8Var;
                                                je8Var.setDivider((k62Var.V == 0 && k62Var.W == 0) ? false : true);
                                            }
                                            je8Var = je8Var;
                                        }
                                        if (i == k62Var.H0) {
                                            je8Var.getCheckBox().a.a(z8, false);
                                            break;
                                        } else if (i == k62Var.D0) {
                                            Switch checkBox = je8Var.getCheckBox();
                                            if (!k62Var.d0 && !k62Var.b0) {
                                                z7 = false;
                                            }
                                            checkBox.a.a(z7, false);
                                            break;
                                        } else {
                                            je8Var.getCheckBox().a.a(false, false);
                                            break;
                                        }
                                    }
                                } else {
                                    view2.requestLayout();
                                    break;
                                }
                            } else {
                                wgb wgbVar2 = (wgb) view2;
                                if (i == k62Var.M0) {
                                    String M04 = k96.M0(2131746952, null);
                                    ArrayList arrayList = k62Var.Q0;
                                    if (arrayList.isEmpty()) {
                                        G = k96.M0(2131745619, null);
                                        z = false;
                                    } else if (arrayList.size() == 1) {
                                        z = false;
                                        G = k96.i0(2131750504, (String) arrayList.get(0));
                                    } else {
                                        z = false;
                                        G = k96.G(arrayList.size(), "PollV2AllowedCountriesListManyP", new Object[0]);
                                    }
                                    wgbVar2.q(M04, G, z, true);
                                    break;
                                } else if (i == k62Var.J0) {
                                    k62Var.U(wgbVar2, false);
                                    break;
                                } else {
                                    wgbVar2.g(-1, bkb.Yl);
                                    Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                                    Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                                    int v0 = bkb.v0(bkb.M6, wjbVar);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    drawable.setColorFilter(new PorterDuffColorFilter(v0, mode));
                                    drawable2.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.j7, wjbVar), mode));
                                    k62Var.o1 = drawable;
                                    k62Var.p1 = drawable2;
                                    wgbVar2.p(k96.M0(z9 ? 2131743827 : 2131754468, null), new fm2(drawable, drawable2), false);
                                    wgbVar2.x = 20;
                                    wgbVar2.s = 58;
                                    break;
                                }
                            }
                        } else {
                            mhb mhbVar = (mhb) view2;
                            mhbVar.setFixedSize(0);
                            new fm2(new ColorDrawable(bkb.v0(bkb.Z6, wjbVar)), bkb.W0(context, R.drawable.greydivider_bottom, bkb.a7)).x = true;
                            if (i == k62Var.r0) {
                                mhbVar.setText(k96.M0(2131754469, null));
                                break;
                            } else if (i == k62Var.y0) {
                                mhbVar.setFixedSize(12);
                                mhbVar.setText(null);
                                break;
                            } else {
                                int i38 = k62Var.K - k62Var.N;
                                if (i38 <= 0) {
                                    mhbVar.setText(k96.M0(z9 ? 2131743867 : 2131754466, null));
                                    break;
                                } else if (z9) {
                                    mhbVar.setText(k96.H(',', "TodoNewTaskInfo", i38));
                                    break;
                                } else if (i == k62Var.L0) {
                                    mhbVar.setText(k96.M0(2131746945, null));
                                    break;
                                } else {
                                    mhbVar.setText(k96.a0(null, null, 2131754467, k96.G(i38, "Option", new Object[0])));
                                    break;
                                }
                            }
                        }
                    } else {
                        ahb ahbVar = (ahb) view2;
                        if (i == k62Var.z0) {
                            ahbVar.f(k96.M0(2131743852, null), k62Var.g0, k62Var.A0 != -1);
                            ahbVar.e(null, true);
                            break;
                        } else if (i == k62Var.A0) {
                            ahbVar.f(k96.M0(2131743851, null), k62Var.h0, false);
                            ahbVar.e(null, true);
                            break;
                        } else if (i == k62Var.K0) {
                            ahbVar.f(k96.M0(2131746946, null), k62Var.a0, false);
                            ahbVar.e(null, true);
                            break;
                        }
                    }
                } else {
                    ld5 ld5Var = (ld5) view2;
                    if (i == k62Var.m0) {
                        ld5Var.getTextView().setGravity(19);
                        ld5Var.setText(k96.M0(z9 ? 2131743813 : 2131746972, null));
                        break;
                    } else if (i == k62Var.p0) {
                        ld5Var.getTextView().setGravity(19);
                        ld5Var.setText(k96.M0(2131754470, null));
                        break;
                    } else {
                        ld5Var.getTextView().setGravity((k96.a0 ? 5 : 3) | 16);
                        if (i == k62Var.t0) {
                            if (z8) {
                                ld5Var.setText(k96.M0(2131746254, null));
                                break;
                            } else {
                                ld5Var.setText(k96.M0(z9 ? 2131743831 : 2131754243, null));
                                break;
                            }
                        } else if (i == k62Var.x0) {
                            ld5Var.setText(k96.M0(2131745303, null));
                            break;
                        }
                    }
                }
                break;
            case 2:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj2;
                int i39 = dataAutoDownloadActivity.f;
                tp3 tp3Var = dataAutoDownloadActivity.H;
                int i40 = s49Var.f;
                View view3 = s49Var.a;
                if (i40 != 0) {
                    if (i40 != 2) {
                        if (i40 != 3) {
                            if (i40 != 4) {
                                if (i40 == 5) {
                                    mhb mhbVar2 = (mhb) view3;
                                    if (i == dataAutoDownloadActivity.x) {
                                        mhbVar2.setText(k96.M0(2131753840, null));
                                        mhbVar2.setFixedSize(0);
                                        mhbVar2.setImportantForAccessibility(1);
                                        break;
                                    } else if (i == dataAutoDownloadActivity.n) {
                                        if (dataAutoDownloadActivity.r == -1) {
                                            if (i39 == 0) {
                                                mhbVar2.setText(k96.M0(2131753820, null));
                                            } else if (i39 == 1) {
                                                mhbVar2.setText(k96.M0(2131753815, null));
                                            } else if (i39 == 2) {
                                                mhbVar2.setText(k96.M0(2131753818, null));
                                            }
                                            mhbVar2.setImportantForAccessibility(1);
                                            break;
                                        } else {
                                            mhbVar2.setText(null);
                                            mhbVar2.setFixedSize(12);
                                            mhbVar2.setImportantForAccessibility(4);
                                            break;
                                        }
                                    }
                                }
                            } else {
                                vl7 vl7Var = (vl7) view3;
                                vl7Var.setDrawLine(true);
                                i4 = dataAutoDownloadActivity.photosRow;
                                if (i == i4) {
                                    M0 = k96.M0(2131753814, null);
                                    i7 = 1;
                                } else {
                                    i5 = dataAutoDownloadActivity.videosRow;
                                    if (i == i5) {
                                        M0 = k96.M0(2131753803, null);
                                        i7 = 4;
                                    } else {
                                        i6 = dataAutoDownloadActivity.storiesRow;
                                        if (i == i6) {
                                            M0 = k96.M0(2131753806, null);
                                            vl7Var.setDrawLine(false);
                                            i7 = -1;
                                        } else {
                                            M0 = k96.M0(2131753835, null);
                                            i7 = 8;
                                        }
                                    }
                                }
                                if (i39 == 0) {
                                    i15 = ((d) dataAutoDownloadActivity).currentAccount;
                                    o = up3.q(i15).n();
                                } else if (i39 == 1) {
                                    i9 = ((d) dataAutoDownloadActivity).currentAccount;
                                    o = up3.q(i9).p();
                                } else {
                                    i8 = ((d) dataAutoDownloadActivity).currentAccount;
                                    o = up3.q(i8).o();
                                }
                                long j = o.b[up3.x(i7)];
                                StringBuilder sb = new StringBuilder();
                                i10 = dataAutoDownloadActivity.storiesRow;
                                if (i != i10) {
                                    i11 = 0;
                                    int i41 = 0;
                                    while (true) {
                                        int[] iArr = o.a;
                                        if (i41 < iArr.length) {
                                            if ((iArr[i41] & i7) != 0) {
                                                if (sb.length() != 0) {
                                                    sb.append(", ");
                                                }
                                                if (i41 == 0) {
                                                    sb.append(k96.M0(2131753838, null));
                                                } else if (i41 == 1) {
                                                    sb.append(k96.M0(2131753811, null));
                                                } else if (i41 == 2) {
                                                    sb.append(k96.M0(2131753832, null));
                                                } else if (i41 == 3) {
                                                    sb.append(k96.M0(2131753839, null));
                                                }
                                                i11++;
                                            }
                                            i41++;
                                        } else if (i11 == 4) {
                                            sb.setLength(0);
                                            i13 = dataAutoDownloadActivity.photosRow;
                                            if (i == i13) {
                                                sb.append(k96.M0(2131753823, null));
                                            } else {
                                                sb.append(k96.a0("AutoDownloadUpToOnAllChats", null, 2131753804, gl.i0(j, false, false)));
                                            }
                                        } else if (i11 == 0) {
                                            sb.append(k96.M0(2131753825, null));
                                        } else {
                                            i12 = dataAutoDownloadActivity.photosRow;
                                            sb = i == i12 ? new StringBuilder(k96.a0("AutoDownloadOnFor", null, 2131753822, sb.toString())) : new StringBuilder(k96.a0("AutoDownloadOnUpToFor", null, 2131753817, gl.i0(j, false, false), sb.toString()));
                                        }
                                    }
                                } else if (o.e) {
                                    sb = new StringBuilder(k96.a0("AutoDownloadOn", null, 2131753824, sb.toString()));
                                    i11 = 1;
                                } else {
                                    sb = new StringBuilder(k96.a0("AutoDownloadOff", null, 2131753825, sb.toString()));
                                    i11 = 0;
                                }
                                if (dataAutoDownloadActivity.h) {
                                    vl7Var.setChecked(i11 != 0);
                                }
                                boolean z10 = i11 != 0;
                                i14 = dataAutoDownloadActivity.storiesRow;
                                vl7Var.b(M0, sb, 0, z10, 0, true, i != i14, false);
                                break;
                            }
                        } else {
                            dataAutoDownloadActivity.q0((fja) view3);
                            break;
                        }
                    } else {
                        ld5 ld5Var2 = (ld5) view3;
                        if (i == dataAutoDownloadActivity.r) {
                            ld5Var2.setText(k96.M0(2131753836, null));
                            break;
                        } else if (i == dataAutoDownloadActivity.w) {
                            ld5Var2.setText(k96.M0(2131753805, null));
                            break;
                        }
                    }
                } else {
                    ahb ahbVar2 = (ahb) view3;
                    i3 = dataAutoDownloadActivity.autoDownloadRow;
                    if (i == i3) {
                        ahbVar2.setDrawCheckRipple(true);
                        ahbVar2.f(k96.M0(2131753827, null), tp3Var.g, false);
                        ahbVar2.setTag(Integer.valueOf(tp3Var.g ? bkb.e6 : bkb.d6));
                        zkb.h(tp3Var.g ? bkb.e6 : bkb.d6, null, ahbVar2);
                        break;
                    }
                }
                break;
            case 3:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj2;
                int i42 = s49Var.f;
                View view4 = s49Var.a;
                switch (i42) {
                    case 1:
                        uib uibVar2 = (uib) view4;
                        uibVar2.setCanDisable(false);
                        zkb.X(uibVar2.getTextView(), bkb.F6, null);
                        i16 = dataSettingsActivity.useLessDataForCallsRow;
                        if (i == i16) {
                            uibVar2.setIcon(0);
                            int i43 = na7.c1().getInt("VoipDataSaving", rgc.c());
                            uibVar2.c(k96.M0(2131742987, null), i43 != 0 ? i43 != 1 ? i43 != 2 ? i43 != 3 ? null : k96.M0(2131743554, null) : k96.M0(2131743557, null) : k96.M0(2131743555, null) : k96.M0(2131743556, null), dataSettingsActivity.V, true);
                            dataSettingsActivity.V = false;
                            break;
                        } else {
                            i17 = dataSettingsActivity.proxyRow;
                            if (i == i17) {
                                uibVar2.setIcon(0);
                                uibVar2.b(k96.M0(2131746408, null), false);
                                break;
                            } else {
                                i18 = dataSettingsActivity.resetDownloadRow;
                                if (i == i18) {
                                    uibVar2.setIcon(0);
                                    uibVar2.setCanDisable(true);
                                    zkb.X(uibVar2.getTextView(), bkb.o7, null);
                                    uibVar2.b(k96.M0(2131745918, null), false);
                                    break;
                                } else {
                                    i19 = dataSettingsActivity.clearDraftsRow;
                                    if (i == i19) {
                                        uibVar2.setIcon(0);
                                        uibVar2.b(k96.M0(2131746650, null), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        ld5 ld5Var3 = (ld5) view4;
                        if (i == dataSettingsActivity.d) {
                            ld5Var3.setText(k96.M0(2131753764, null));
                            break;
                        } else if (i == 0) {
                            ld5Var3.setText(k96.M0(2131751664, null));
                            break;
                        } else if (i == dataSettingsActivity.N) {
                            ld5Var3.setText(k96.M0(2131752584, null));
                            break;
                        } else if (i == dataSettingsActivity.P) {
                            ld5Var3.setText(k96.M0(2131746418, null));
                            break;
                        } else if (i == dataSettingsActivity.y) {
                            ld5Var3.setText(k96.M0(2131744197, null));
                            break;
                        } else if (i == dataSettingsActivity.J) {
                            ld5Var3.setText(k96.M0(2131753761, null));
                            break;
                        } else if (i == dataSettingsActivity.S) {
                            ld5Var3.setText(k96.M0(2131745726, null));
                            break;
                        }
                        break;
                    case 3:
                        ahb ahbVar3 = (ahb) view4;
                        if (i == dataSettingsActivity.E) {
                            ahbVar3.f(k96.M0(2131751132, null), gba.x0, dataSettingsActivity.G != -1);
                            break;
                        } else if (i != dataSettingsActivity.F) {
                            if (i == dataSettingsActivity.H) {
                                ahbVar3.f("(beta only) Show MKV as Video", gba.z0, true);
                                break;
                            } else if (i == dataSettingsActivity.G) {
                                ahbVar3.f("(beta only) Stream All Videos", gba.y0, false);
                                break;
                            } else if (i == dataSettingsActivity.K) {
                                String M05 = k96.M0(2131753762, null);
                                boolean z11 = gba.a;
                                ahbVar3.f(M05, e66.e(2048), true);
                                break;
                            } else if (i == dataSettingsActivity.L) {
                                String M06 = k96.M0(2131753760, null);
                                boolean z12 = gba.a;
                                ahbVar3.f(M06, e66.e(1024), false);
                                break;
                            }
                        }
                        break;
                    case 4:
                        mhb mhbVar3 = (mhb) view4;
                        if (i == dataSettingsActivity.I) {
                            mhbVar3.setText(k96.M0(2131751146, null));
                            break;
                        }
                        break;
                    case 5:
                        vl7 vl7Var2 = (vl7) view4;
                        i20 = dataSettingsActivity.saveToGalleryPeerRow;
                        if (i == i20) {
                            M03 = k96.M0(2131745727, null);
                            sp9 sp9Var = mte.a;
                            i32 = ((d) dataSettingsActivity).currentAccount;
                            c = sp9Var.c(i32);
                            a = mte.a.a();
                        } else {
                            i21 = dataSettingsActivity.saveToGalleryGroupsRow;
                            if (i == i21) {
                                M03 = k96.M0(2131745734, null);
                                sp9 sp9Var2 = mte.b;
                                i31 = ((d) dataSettingsActivity).currentAccount;
                                c = sp9Var2.c(i31);
                                a = mte.b.a();
                            } else {
                                i22 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (i == i22) {
                                    M03 = k96.M0(2131745736, null);
                                    sp9 sp9Var3 = mte.c;
                                    i30 = ((d) dataSettingsActivity).currentAccount;
                                    c = sp9Var3.c(i30);
                                    z3 = mte.c.a();
                                    z2 = false;
                                    str = M03;
                                    charSequence = c;
                                    o2 = null;
                                    if (o2 == null) {
                                        long[] jArr = o2.b;
                                        StringBuilder sb2 = new StringBuilder();
                                        int i44 = 0;
                                        boolean z13 = false;
                                        int i45 = 0;
                                        boolean z14 = false;
                                        boolean z15 = false;
                                        while (true) {
                                            int[] iArr2 = o2.a;
                                            char c3 = c2;
                                            boolean z16 = z13;
                                            if (i44 < iArr2.length) {
                                                if (!z13) {
                                                    z16 = z13;
                                                    if ((iArr2[i44] & 1) != 0) {
                                                        i45++;
                                                        z16 = true;
                                                    }
                                                }
                                                if (!z14 && (iArr2[i44] & 4) != 0) {
                                                    i45++;
                                                    z14 = true;
                                                }
                                                if (!z15 && (iArr2[i44] & 8) != 0) {
                                                    i45++;
                                                    z15 = true;
                                                }
                                                i44++;
                                                c2 = c3;
                                                z13 = z16;
                                                z14 = z14;
                                                z15 = z15;
                                            } else {
                                                if (!o2.g || i45 == 0) {
                                                    sb2.append(k96.M0(2131748005, null));
                                                } else {
                                                    if (z13) {
                                                        sb2.append(k96.M0(2131753813, null));
                                                    }
                                                    if (z14) {
                                                        if (sb2.length() > 0) {
                                                            sb2.append(", ");
                                                        }
                                                        sb2.append(k96.M0(2131753802, null));
                                                        sb2.append(String.format(" (%1$s)", gl.i0(jArr[1], true, false)));
                                                    }
                                                    if (z15) {
                                                        if (sb2.length() > 0) {
                                                            sb2.append(", ");
                                                        }
                                                        sb2.append(k96.M0(2131753834, null));
                                                        sb2.append(String.format(" (%1$s)", gl.i0(jArr[up3.x(8)], true, false)));
                                                    }
                                                }
                                                if ((z13 || z14 || z15) && z3) {
                                                    z6 = true;
                                                }
                                                z3 = z6;
                                                charSequence2 = sb2;
                                            }
                                        }
                                    } else {
                                        charSequence2 = charSequence;
                                    }
                                    vl7Var2.setAnimationsEnabled(true);
                                    vl7Var2.b(str, charSequence2, 0, z3, 0, true, z2, false);
                                    break;
                                } else {
                                    if (i == dataSettingsActivity.e) {
                                        M02 = k96.M0(2131742621, null);
                                        i28 = ((d) dataSettingsActivity).currentAccount;
                                        z4 = up3.q(i28).N.g;
                                        i29 = ((d) dataSettingsActivity).currentAccount;
                                        o2 = up3.q(i29).n();
                                    } else if (i == dataSettingsActivity.h) {
                                        M02 = k96.M0(2131742623, null);
                                        i26 = ((d) dataSettingsActivity).currentAccount;
                                        z4 = up3.q(i26).O.g;
                                        i27 = ((d) dataSettingsActivity).currentAccount;
                                        o2 = up3.q(i27).p();
                                    } else {
                                        M02 = k96.M0(2131742622, null);
                                        i23 = ((d) dataSettingsActivity).currentAccount;
                                        boolean z17 = up3.q(i23).P.g;
                                        i24 = ((d) dataSettingsActivity).currentAccount;
                                        o2 = up3.q(i24).o();
                                        i25 = dataSettingsActivity.resetDownloadRow;
                                        z2 = i25 >= 0;
                                        z3 = z17;
                                        str = M02;
                                        charSequence = null;
                                        if (o2 == null) {
                                        }
                                        vl7Var2.setAnimationsEnabled(true);
                                        vl7Var2.b(str, charSequence2, 0, z3, 0, true, z2, false);
                                    }
                                    z3 = z4;
                                    z2 = true;
                                    str = M02;
                                    charSequence = null;
                                    if (o2 == null) {
                                    }
                                    vl7Var2.setAnimationsEnabled(true);
                                    vl7Var2.b(str, charSequence2, 0, z3, 0, true, z2, false);
                                }
                            }
                        }
                        z3 = a;
                        z2 = true;
                        str = M03;
                        charSequence = c;
                        o2 = null;
                        if (o2 == null) {
                        }
                        vl7Var2.setAnimationsEnabled(true);
                        vl7Var2.b(str, charSequence2, 0, z3, 0, true, z2, false);
                        break;
                    case 6:
                        wgb wgbVar3 = (wgb) view4;
                        if (i == dataSettingsActivity.s) {
                            if (dataSettingsActivity.X) {
                                wgbVar3.r(k96.M0(2131744579, null), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                                wgbVar = wgbVar3;
                                wgbVar.h(45, true, dataSettingsActivity.W);
                            } else {
                                wgbVar = wgbVar3;
                                String M07 = k96.M0(2131744579, null);
                                long j2 = dataSettingsActivity.Y;
                                wgbVar.r(M07, j2 <= 0 ? "" : gl.i0(j2, false, false), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                                wgbVar.h(45, false, dataSettingsActivity.W);
                            }
                            dataSettingsActivity.W = false;
                        } else {
                            wgbVar = wgbVar3;
                            if (i == dataSettingsActivity.w) {
                                i33 = ((d) dataSettingsActivity).currentAccount;
                                yxa c4 = yxa.c(i33);
                                wgbVar.r(k96.M0(2131748106, null), gl.i0(c4.e(2, 6) + c4.e(1, 6) + c4.e(0, 6) + c4.d(2, 6) + c4.d(1, 6) + c4.d(0, 6), false, false), true, R.drawable.msg_filled_datausage, -11154873, -14175180, false);
                            } else {
                                if (i == dataSettingsActivity.n) {
                                    String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
                                    if (!TextUtils.isEmpty(gba.e0)) {
                                        int size = dataSettingsActivity.c.size();
                                        while (true) {
                                            if (i35 < size) {
                                                String absolutePath2 = ((File) dataSettingsActivity.c.get(i35)).getAbsolutePath();
                                                if (absolutePath2.startsWith(gba.e0)) {
                                                    absolutePath = absolutePath2;
                                                } else {
                                                    i35++;
                                                }
                                            }
                                        }
                                    }
                                    wgbVar.r(k96.M0(2131744583, null), k96.M0((absolutePath == null || absolutePath.contains("/storage/emulated/")) ? 2131748996 : 2131745648, null), true, R.drawable.msg_filled_sdcard, -1007845, -1996271, false);
                                }
                                wgbVar = wgbVar;
                            }
                        }
                        wgbVar.setOffsetFromImage(64);
                        break;
                }
            case 4:
                fe4 fe4Var = (fe4) s49Var.a;
                int id = fe4Var.b != null ? fe4Var.getId() : -1;
                de4 de4Var = (de4) ((he4) obj2).h.get(i);
                fe4Var.b = de4Var;
                fe4Var.e = i;
                fe4Var.setContentDescription(de4Var.b);
                fe4Var.requestLayout();
                boolean z18 = fe4Var.n;
                de4 de4Var2 = fe4Var.b;
                if (z18 != (de4Var2 != null && de4Var2.g)) {
                    gm.release(fe4Var, fe4Var.r);
                    gm.release(fe4Var, fe4Var.P);
                    gm.release(fe4Var, fe4Var.R);
                    gm.release(fe4Var, fe4Var.T);
                    if (fe4Var.m0) {
                        fe4Var.r = gm.update(fe4Var.b.g ? 26 : 0, fe4Var, fe4Var.r, fe4Var.s);
                        fe4Var.P = gm.update(fe4Var.b.g ? 26 : 0, fe4Var, fe4Var.P, fe4Var.Q);
                        fe4Var.R = gm.update(fe4Var.b.g ? 26 : 0, fe4Var, fe4Var.R, fe4Var.S);
                        fe4Var.T = gm.update(fe4Var.b.g ? 26 : 0, fe4Var, fe4Var.T, fe4Var.U);
                    }
                    fe4Var.n = fe4Var.b.g;
                }
                if (id != fe4Var.getId()) {
                    fe4Var.l0 = fe4Var.b.f ? 1.0f : 0.0f;
                    break;
                }
                break;
            case 5:
                Activity activity = (Activity) obj;
                zw0 zw0Var = (zw0) s49Var.a;
                cf4 cf4Var = (cf4) obj2;
                ArrayList arrayList2 = cf4Var.v1;
                ArrayList arrayList3 = cf4Var.u1;
                if (i < arrayList3.size()) {
                    zkb.s(zw0Var.getImageView(), bkb.I5, null, PorterDuff.Mode.MULTIPLY);
                    t97 t97Var = (t97) arrayList3.get(i);
                    zkb.X(zw0Var.getTextView(), bkb.i5, null);
                    int i46 = t97Var.g;
                    int i47 = na7.r5;
                    int i48 = i46 & 31;
                    zw0Var.a(k27.A5(vu3.m(t97Var.b, zw0Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0), t97Var.c, zw0Var.getTextView().getPaint().getFontMetricsInt(), false), 0, new za2(cf4Var.getContext(), i48 == 3 ? R.drawable.msg_openprofile : ((i46 & 64) == 0 || i48 != 31) ? i48 == 8 ? R.drawable.msg_channel : i48 == 4 ? R.drawable.msg_groups : i48 == 1 ? R.drawable.msg_contacts : i48 == 16 ? R.drawable.msg_bots : R.drawable.msg_folders : R.drawable.msg_markunread, t97Var.m), false);
                    zw0Var.getTextView().setEmojiColor(bkb.v0(bkb.Ei, cf4Var.J0));
                    for (int i49 = 0; i49 < arrayList2.size(); i49++) {
                        if (!t97Var.a(j5.a(cf4Var.a), ((Long) arrayList2.get(i49)).longValue())) {
                            z7 = false;
                        }
                    }
                    zw0Var.setChecked(z7);
                    break;
                } else {
                    zw0Var.getImageView().setColorFilter((ColorFilter) null);
                    Drawable drawable3 = activity.getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable4 = activity.getResources().getDrawable(R.drawable.poll_add_plus);
                    ImageView imageView = zw0Var.getImageView();
                    int i50 = bkb.M6;
                    PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                    zkb.x(imageView, drawable3, i50, null, mode2);
                    zkb.x(zw0Var.getImageView(), drawable4, bkb.j7, null, mode2);
                    fm2 fm2Var = new fm2(drawable3, drawable4);
                    zkb.X(zw0Var.getTextView(), bkb.p6, null);
                    zw0Var.a(k96.M0(2131751704, null), 0, fm2Var, false);
                    break;
                }
                break;
            case 6:
                View view5 = s49Var.a;
                zi4 zi4Var = (zi4) ((hj4) obj2).F.get(i);
                int i51 = zi4Var.b;
                qn qnVar = zi4Var.f;
                String str2 = zi4Var.a;
                int F = ug8.F(i51);
                if (F != 0) {
                    if (F != 1) {
                        if (F == 2) {
                            gj4 gj4Var = (gj4) view5;
                            gj4Var.f = str2.toString();
                            gj4Var.d = ((Float) qnVar.get(null)).floatValue();
                            gj4Var.b = zi4Var.d;
                            gj4Var.c = zi4Var.e;
                            gj4Var.e = qnVar;
                            gj4Var.invalidate();
                            break;
                        }
                    } else {
                        ld5 ld5Var4 = (ld5) view5;
                        ld5Var4.setTextColor(bkb.w0(null, bkb.K6, false));
                        ld5Var4.setText(str2);
                        break;
                    }
                } else {
                    ad adVar = (ad) view5;
                    adVar.setTextColor(bkb.w0(null, bkb.i5, false));
                    adVar.a(0, str2);
                    break;
                }
                break;
            case 7:
                pf6 pf6Var = (pf6) obj2;
                int i52 = s49Var.f;
                View view6 = s49Var.a;
                if (i52 != 0) {
                    if (i52 != 1) {
                        if (i52 != 3) {
                            if (i52 == 4) {
                                mhb mhbVar4 = (mhb) view6;
                                if (i == pf6Var.s) {
                                    mhbVar4.setText(k96.M0(2131748550, null));
                                    break;
                                }
                            }
                        } else {
                            uib uibVar3 = (uib) view6;
                            if (i == pf6Var.r) {
                                zkb.X(uibVar3.getTextView(), bkb.o7, null);
                                uibVar3.b(k96.M0(2131748549, null), false);
                                break;
                            }
                        }
                    } else {
                        hhb hhbVar = (hhb) view6;
                        if (i == pf6Var.c) {
                            hhbVar.b(R.drawable.msg_contact_add, k96.M0(2131754465, null), k96.M0(2131754464, null), true);
                            break;
                        } else if (i == pf6Var.d) {
                            hhbVar.b(R.drawable.msg_permissions, k96.M0(2131745329, null), k96.M0(2131745328, null), true);
                            break;
                        } else if (i == pf6Var.e) {
                            hhbVar.b(R.drawable.msg_clearcache, k96.M0(2131752086, null), k96.M0(2131752082, null), true);
                            break;
                        } else if (i == pf6Var.f) {
                            hhbVar.b(R.drawable.msg_newphone, k96.M0(2131752525, null), k96.M0(2131752524, null), true);
                            break;
                        } else if (i == pf6Var.h) {
                            hhbVar.b(R.drawable.msg_help, k96.M0(2131751771, null), k96.M0(2131751770, null), false);
                            break;
                        }
                    }
                } else {
                    ld5 ld5Var5 = (ld5) view6;
                    if (i == 0) {
                        ld5Var5.setText(k96.M0(2131754267, null));
                        break;
                    }
                }
                break;
            case 8:
                G(s49Var, i);
                break;
            case 9:
                H(s49Var, i);
                break;
            case 10:
                x58 x58Var = (x58) s49Var.a;
                g48 g48Var = (g48) obj2;
                x58Var.setAlbumsCount(g48Var.f);
                while (true) {
                    byte b2 = g48Var.f;
                    if (i34 >= b2) {
                        x58Var.requestLayout();
                        break;
                    } else {
                        int i53 = (b2 * i) + i34;
                        if (i53 < g48Var.d.size()) {
                            x58Var.a(i34, (xl6) g48Var.d.get(i53));
                        } else {
                            x58Var.a(i34, null);
                        }
                        i34++;
                    }
                }
            case 11:
                I(s49Var, i);
                break;
            case 12:
                J(s49Var, i);
                break;
            case 13:
                K(s49Var, i);
                break;
            case 14:
                L(s49Var, i);
                break;
            case 15:
                M(s49Var, i);
                break;
            case 16:
                N(s49Var, i);
                break;
            case 17:
                O(s49Var, i);
                break;
            default:
                tec tecVar = (tec) s49Var.a;
                vec vecVar = (vec) obj2;
                sec secVar = (sec) vecVar.h.get(i);
                tecVar.a = secVar;
                tecVar.setContentDescription(secVar.b);
                tecVar.setAlpha(1.0f);
                tecVar.requestLayout();
                if (vecVar.n0 && (uecVar = vecVar.E) != null && uecVar.B(i)) {
                    z5 = true;
                }
                tecVar.setReordering(z5);
                break;
        }
    }

    @Override // w39
    public final void u(s49 s49Var, int i, List list) {
        int i2;
        boolean contains;
        switch (this.c) {
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                ArrayList arrayList = proxyListActivity.F;
                int i3 = s49Var.f;
                View view = s49Var.a;
                if (i3 == 5 && !list.isEmpty()) {
                    yt8 yt8Var = (yt8) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i - proxyListActivity.n))) != yt8Var.h) {
                        yt8Var.h = contains;
                        yt8Var.f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        yt8Var.a(!arrayList.isEmpty(), true);
                        break;
                    }
                } else if (s49Var.f != 3 || !list.contains(0)) {
                    t(s49Var, i);
                    break;
                } else {
                    ahb ahbVar = (ahb) view;
                    i2 = proxyListActivity.useProxyRow;
                    if (i != i2) {
                        if (i == proxyListActivity.w) {
                            ahbVar.setChecked(gba.X0);
                            break;
                        }
                    } else {
                        ahbVar.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
            default:
                super.u(s49Var, i, list);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [e62] */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        View ld5Var;
        View view;
        FrameLayout frameLayout2;
        View view2;
        View ld5Var2;
        wjb wjbVar;
        wjb wjbVar2;
        wjb wjbVar3;
        wjb wjbVar4;
        wjb wjbVar5;
        View ahbVar;
        w48 w48Var;
        ViewGroup viewGroup2;
        View b9aVar;
        FrameLayout frameLayout3;
        byte b = this.c;
        byte b2 = 7;
        Object obj = this.e;
        final byte b3 = 2;
        final byte b4 = 1;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                Context context = (Context) obj2;
                if (i == 0) {
                    frameLayout = new ld5(context);
                } else if (i == 1) {
                    frameLayout = new ahb(context);
                } else if (i == 2) {
                    uib uibVar = new uib(context);
                    uibVar.setCanDisable(true);
                    frameLayout = uibVar;
                } else {
                    frameLayout = new mhb(context);
                }
                frameLayout.setLayoutParams(new e49(-1, -2));
                return new y29(frameLayout);
            case 1:
                Context context2 = (Context) obj2;
                k62 k62Var = (k62) obj;
                boolean z = k62Var.n;
                wjb wjbVar6 = k62Var.a;
                switch (i) {
                    case 0:
                        ld5Var = new ld5((Context) obj2, bkb.K6, 21, 15, false, k62Var.a);
                        break;
                    case 1:
                        View b9aVar2 = new b9a(context2, (de9) null);
                        new fm2(new ColorDrawable(bkb.v0(bkb.Z6, wjbVar6)), bkb.W0(context2, R.drawable.greydivider, bkb.a7)).x = true;
                        ld5Var = b9aVar2;
                        break;
                    case 2:
                        ld5Var = new mhb(context2, wjbVar6);
                        break;
                    case 3:
                        ld5Var = new wgb(context2, wjbVar6);
                        break;
                    case 4:
                    case 11:
                        f62 f62Var = new f62(this, (Context) obj2, k62Var.J ? 1 : 0, k62Var.a, i);
                        if (i == 11 && !z) {
                            f62Var.setTextRight(98);
                            kd8 b5 = f62Var.b();
                            final boolean z2 = false ? 1 : 0;
                            b5.setOnClickListener(new View.OnClickListener(this) { // from class: e62
                                public final /* synthetic */ s20 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    byte b6 = z2;
                                    s20 s20Var = this.b;
                                    switch (b6) {
                                        case 0:
                                            ((k62) s20Var.e).e0(-2);
                                            break;
                                        case 1:
                                            ((k62) s20Var.e).e0(-3);
                                            break;
                                        default:
                                            ((k62) s20Var.e).X(view3, (le8) view3.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        f62Var.e();
                        f62Var.setIconsColor(bkb.n7);
                        f62Var.c(new g62(this, f62Var, i));
                        ld5Var = f62Var;
                        break;
                    case 5:
                    default:
                        i62 i62Var = new i62(this, (Context) obj2, k62Var.J ? 1 : 0, new View.OnClickListener(this) { // from class: e62
                            public final /* synthetic */ s20 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                byte b6 = b3;
                                s20 s20Var = this.b;
                                switch (b6) {
                                    case 0:
                                        ((k62) s20Var.e).e0(-2);
                                        break;
                                    case 1:
                                        ((k62) s20Var.e).e0(-3);
                                        break;
                                    default:
                                        ((k62) s20Var.e).X(view3, (le8) view3.getParent(), true);
                                        break;
                                }
                            }
                        }, k62Var.a);
                        if (!z) {
                            i62Var.setTextRight(kk7.V1);
                            i62Var.b().setOnClickListener(new kb1((Object) this, (Object) i62Var, (byte) 10));
                        }
                        int i2 = bkb.n7;
                        i62Var.setIconsColor(i2);
                        wf2 wf2Var = i62Var.r;
                        if (wf2Var != null) {
                            wf2Var.getCheckBoxBase().i(gl.L(6.0f));
                            CheckBoxBase checkBoxBase = wf2Var.getCheckBoxBase();
                            float f = i62Var.a.e;
                            if (checkBoxBase.w != f) {
                                checkBoxBase.w = f;
                                checkBoxBase.b();
                            }
                        }
                        i62Var.getCheckBox().b(-1, i2, bkb.j7);
                        i62Var.c(new qy(this, i62Var, b3));
                        i62Var.setShowNextButton(true);
                        EditTextBoldCursor textView = i62Var.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new df(this, i62Var, b3));
                        textView.setOnKeyListener(new w6(i62Var, b3));
                        ld5Var = i62Var;
                        break;
                    case 6:
                        ld5Var = new ahb(context2, wjbVar6);
                        break;
                    case 7:
                        h62 h62Var = new h62(this, context2, k62Var.J ? 1 : 0);
                        h62Var.e();
                        if (!z) {
                            h62Var.setTextRight(98);
                            h62Var.b().setOnClickListener(new View.OnClickListener(this) { // from class: e62
                                public final /* synthetic */ s20 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    byte b6 = b4;
                                    s20 s20Var = this.b;
                                    switch (b6) {
                                        case 0:
                                            ((k62) s20Var.e).e0(-2);
                                            break;
                                        case 1:
                                            ((k62) s20Var.e).e0(-3);
                                            break;
                                        default:
                                            ((k62) s20Var.e).X(view3, (le8) view3.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        h62Var.setIconsColor(bkb.n7);
                        h62Var.c(new qy(this, h62Var, b4));
                        ld5Var = h62Var;
                        break;
                    case 8:
                        View d62Var = new d62(context2, false ? 1 : 0);
                        d62Var.setTag(-33024);
                        ld5Var = d62Var;
                        break;
                    case 9:
                        View sbVar = new sb((byte) 5, context2, this);
                        sbVar.setTag(-33024);
                        ld5Var = sbVar;
                        break;
                    case 10:
                        je8 je8Var = new je8(context2, wjbVar6);
                        je8Var.getCheckBox().setIcon(R.drawable.permission_locked);
                        ld5Var = je8Var;
                        break;
                }
                return ls6.h(ld5Var, ld5Var, -1, -2);
            case 2:
                Context context3 = (Context) obj2;
                if (i == 0) {
                    ahb ahbVar2 = new ahb(context3);
                    ahbVar2.d(bkb.f6, bkb.N6, bkb.O6, bkb.P6, bkb.Q6);
                    ahbVar2.setTypeface(gl.o());
                    ahbVar2.setHeight(56);
                    view = ahbVar2;
                } else if (i == 1) {
                    view = new b9a(context3, (de9) null);
                } else if (i == 2) {
                    view = new ld5(context3);
                } else if (i != 3) {
                    view = i != 4 ? new mhb(context3) : new vl7(context3);
                } else {
                    fja fjaVar = new fja(context3, null);
                    fjaVar.setCallback(new vu2(this, (byte) 12));
                    view = fjaVar;
                }
                return ls6.h(view, view, -1, -2);
            case 3:
                Context context4 = (Context) obj2;
                View wgbVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new wgb(context4) : new vl7(context4) : new mhb(context4) : new ahb(context4) : new ld5(context4, 22) : new uib(context4) : new b9a(context4, (de9) null);
                return ls6.h(wgbVar, wgbVar, -1, -2);
            case 4:
                return new y29(new fe4((he4) obj, (Context) obj2));
            case 5:
                zw0 zw0Var = new zw0(0, null, (Activity) obj2);
                zw0Var.setBackground(null);
                zw0Var.setLayoutParams(new e49(-1, -2));
                return new y29(zw0Var);
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                int F = ug8.F(ug8.G(3)[i]);
                if (F == 1) {
                    frameLayout2 = new ld5(launchActivity);
                } else if (F != 2) {
                    frameLayout2 = new ad(launchActivity, null);
                } else {
                    gj4 gj4Var = new gj4(launchActivity);
                    gj4Var.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    gj4Var.h = textPaint;
                    textPaint.setTextSize(gl.L(16.0f));
                    av9 av9Var = new av9(launchActivity);
                    gj4Var.a = av9Var;
                    av9Var.setReportChanges(true);
                    av9Var.setDelegate(new s34(gj4Var, b3));
                    av9Var.setImportantForAccessibility(2);
                    gj4Var.addView(av9Var, nme.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout2 = gj4Var;
                }
                frameLayout2.setLayoutParams(new e49(-1, -2));
                return new y29(frameLayout2);
            case 7:
                Context context5 = (Context) obj2;
                if (i == 0) {
                    View ld5Var3 = new ld5(context5);
                    zkb.h(bkb.c6, null, ld5Var3);
                    view2 = ld5Var3;
                } else if (i == 1) {
                    hhb hhbVar = new hhb(context5);
                    hhbVar.setMultilineDetail(true);
                    zkb.h(bkb.c6, null, hhbVar);
                    view2 = hhbVar;
                } else if (i == 2) {
                    view2 = new b9a(context5, (de9) null);
                } else if (i != 3) {
                    view2 = new mhb(context5);
                } else {
                    View uibVar2 = new uib(context5);
                    zkb.h(bkb.c6, null, uibVar2);
                    view2 = uibVar2;
                }
                return ls6.h(view2, view2, -1, -2);
            case 8:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context6 = (Context) obj2;
                if (i == 0) {
                    wjbVar = ((d) notificationsSettingsActivity).resourceProvider;
                    ld5Var2 = new ld5(context6, wjbVar);
                } else if (i == 1) {
                    wjbVar2 = ((d) notificationsSettingsActivity).resourceProvider;
                    ld5Var2 = new ahb(context6, wjbVar2);
                } else if (i == 2) {
                    ld5Var2 = new hhb(context6);
                } else if (i == 3) {
                    wjbVar3 = ((d) notificationsSettingsActivity).resourceProvider;
                    ld5Var2 = new vl7((Context) obj2, 21, 64, true, wjbVar3);
                } else if (i == 4) {
                    ld5Var2 = new b9a(context6, (de9) null);
                } else if (i != 5) {
                    wjbVar5 = ((d) notificationsSettingsActivity).resourceProvider;
                    ld5Var2 = new mhb(context6, wjbVar5);
                } else {
                    wjbVar4 = ((d) notificationsSettingsActivity).resourceProvider;
                    ld5Var2 = new uib(0, wjbVar4, context6);
                }
                return new y29(ld5Var2);
            case 9:
                Context context7 = (Context) obj2;
                if (i == 0) {
                    ahbVar = new ahb(context7);
                } else if (i == 1) {
                    ahbVar = new uib(context7);
                } else if (i == 3) {
                    ahbVar = new ld5(context7);
                } else if (i != 4) {
                    ahbVar = new mhb(context7);
                } else {
                    ahbVar = new lv7(context7);
                    ahbVar.setTag(-33024);
                }
                return new y29(ahbVar);
            case 10:
                Context context8 = (Context) obj2;
                x58 x58Var = new x58(context8);
                x58Var.e = new Paint();
                x58Var.b = new xl6[4];
                x58Var.a = new v58[4];
                for (int i3 = 0; i3 < 4; i3++) {
                    x58Var.a[i3] = new v58(x58Var, context8);
                    x58Var.addView(x58Var.a[i3]);
                    x58Var.a[i3].setVisibility(4);
                    x58Var.a[i3].setTag(Integer.valueOf(i3));
                    x58Var.a[i3].setOnClickListener(new fr7(x58Var, (byte) 13));
                }
                x58Var.setDelegate(new im6(this, (byte) 27));
                return new y29(x58Var);
            case 11:
                Context context9 = (Context) obj2;
                if (i == 0) {
                    wjb wjbVar7 = ((l58) obj).J0;
                    x48 x48Var = new x48(context9);
                    x48Var.e = new bg7(x48Var, b2);
                    TextView textView2 = new TextView(context9);
                    x48Var.a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    x48Var.addView(textView2, nme.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context9);
                    x48Var.b = textView3;
                    zkb.X(textView3, bkb.pg, wjbVar7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    x48Var.addView(textView3, nme.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    z48 z48Var = new z48(context9);
                    Paint paint = new Paint();
                    z48Var.a = paint;
                    Paint paint2 = new Paint(1);
                    z48Var.b = paint2;
                    z48Var.c = gl.L(16.0f);
                    z48Var.d = 0;
                    z48Var.e = 0.0f;
                    z48Var.f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    x48Var.c = z48Var;
                    x48Var.addView(z48Var, nme.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    x48Var.setSeekBarDelegate(new im6(this, (byte) 28));
                    w48Var = x48Var;
                } else {
                    w48 w48Var2 = new w48(context9);
                    w48Var2.setOnClickListener(new fr7(this, (byte) 11));
                    w48Var = w48Var2;
                }
                return new y29(w48Var);
            case 12:
                u58 u58Var = (u58) obj;
                boolean z3 = u58Var.s0;
                Context context10 = (Context) obj2;
                if (i == 0) {
                    o48 o48Var = new o48(context10, null);
                    o48Var.setDelegate(new r58(this));
                    o48Var.getCheckFrame().setVisibility(u58Var.U != 0 ? 8 : 0);
                    viewGroup2 = o48Var;
                } else if (i == 1) {
                    ViewGroup frameLayout4 = new FrameLayout(context10);
                    frameLayout4.setLayoutParams(new e49(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(context10, null);
                    radialProgressView.setProgressColor(-11371101);
                    frameLayout4.addView(radialProgressView, nme.c(-1.0f, -1));
                    viewGroup2 = frameLayout4;
                } else if (i == 2) {
                    viewGroup2 = new iba(1, null, context10);
                } else if (i != 3) {
                    qo3 qo3Var = new qo3(context10, null);
                    qo3Var.setForceDarkTheme(z3);
                    viewGroup2 = qo3Var;
                } else {
                    wgb wgbVar2 = new wgb(23, context10, true);
                    wgbVar2.setLayoutParams(new e49(-1, -2));
                    viewGroup2 = wgbVar2;
                    if (z3) {
                        zkb.W(wgbVar2.a, u58Var.w0, null);
                        zkb.s(wgbVar2.e, bkb.hh, null, PorterDuff.Mode.MULTIPLY);
                        viewGroup2 = wgbVar2;
                    }
                }
                return new y29(viewGroup2);
            case 13:
                Context context11 = (Context) obj2;
                y58 y58Var = new y58(context11);
                y58Var.setWillNotDraw(false);
                be0 be0Var = new be0(context11);
                y58Var.a = be0Var;
                be0Var.setRoundRadius(gl.L(4.0f));
                y58Var.addView(be0Var, nme.c(-1.0f, -1));
                FrameLayout frameLayout5 = new FrameLayout(context11);
                y58Var.b = frameLayout5;
                y58Var.addView(frameLayout5, nme.e(42, 42, 53));
                jo0 jo0Var = new jo0(context11);
                jo0Var.c = new Path();
                jo0Var.b = new float[8];
                jo0Var.d = new RectF();
                jo0Var.e = new Paint(1);
                y58Var.e = jo0Var;
                jo0Var.setWillNotDraw(false);
                jo0Var.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
                y58Var.addView(jo0Var, nme.e(-1, 16, 83));
                jo0Var.addView(tb4.k(context11, R.drawable.ic_video), nme.e(-2, -2, 19));
                TextView textView4 = new TextView(context11);
                y58Var.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                jo0Var.addView(textView4, nme.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                wf2 wf2Var2 = new wf2(24, null, context11);
                y58Var.c = wf2Var2;
                wf2Var2.setDrawBackgroundAsArc(11);
                wf2Var2.b(bkb.V9, bkb.W9, bkb.U9);
                y58Var.addView(wf2Var2, nme.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                wf2Var2.setVisibility(0);
                y58Var.setFocusable(true);
                frameLayout5.setOnClickListener(new fr7(this, (byte) 15));
                return new y29(y58Var);
            case 14:
                Context context12 = (Context) obj2;
                if (i == 0) {
                    b9aVar = new b9a(context12, (de9) null);
                } else if (i == 1) {
                    b9aVar = new uib(context12);
                    zkb.h(bkb.c6, null, b9aVar);
                } else if (i == 2) {
                    b9aVar = new ld5(context12);
                    zkb.h(bkb.c6, null, b9aVar);
                } else if (i == 3) {
                    b9aVar = new ahb(context12);
                    zkb.h(bkb.c6, null, b9aVar);
                } else if (i == 4) {
                    b9aVar = new mhb(context12);
                } else if (i != 6) {
                    b9aVar = new yt8((ProxyListActivity) obj, context12);
                    zkb.h(bkb.c6, null, b9aVar);
                } else {
                    b9aVar = new fja(context12, null);
                    zkb.h(bkb.c6, null, b9aVar);
                }
                return ls6.h(b9aVar, b9aVar, -1, -2);
            case 15:
                Context context13 = (Context) obj2;
                kga kgaVar = (kga) obj;
                if (i != 0) {
                    FrameLayout ar8Var = new ar8(context13, b2);
                    ar8Var.setWillNotDraw(false);
                    TextView textView5 = new TextView(context13);
                    kgaVar.o1 = textView5;
                    zkb.X(textView5, bkb.I5, kgaVar.J0);
                    kgaVar.o1.setTextSize(1, 14.0f);
                    kgaVar.o1.setGravity(17);
                    kgaVar.o1.setPadding(0, 0, 0, gl.L(8.0f));
                    ar8Var.addView(kgaVar.o1, nme.c(40.0f, -1));
                    frameLayout3 = ar8Var;
                } else {
                    frameLayout3 = new hga(54, kgaVar.J0, context13, false);
                }
                return new y29(frameLayout3);
            case 16:
                return new y29(new cbb((dbb) obj, ((dbb) obj2).getContext()));
            case 17:
                Context context14 = (Context) obj2;
                View ue3Var = i == 0 ? new ue3(context14, false) : new q86(context14);
                ue3Var.setLayoutParams(new e49(-1, -2));
                return new y29(ue3Var);
            default:
                return new y29(new tec((vec) obj, (Context) obj2));
        }
    }

    @Override // w39
    public final void y(s49 s49Var) {
        int i;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 1:
                k62 k62Var = (k62) obj;
                ud8 ud8Var = k62Var.n1;
                boolean z = k62Var.n;
                int i2 = s49Var.f;
                View view = s49Var.a;
                if (i2 != 4) {
                    if (i2 != 11) {
                        if (i2 != 5) {
                            if (i2 == 7) {
                                le8 le8Var = (le8) view;
                                le8Var.setTag(1);
                                CharSequence charSequence = k62Var.Q;
                                le8Var.o(charSequence != null ? charSequence : "", k96.M0(2131754471, null), false);
                                le8Var.setTag(null);
                                if (!z) {
                                    le8Var.e.a(ud8Var.b(-3), false);
                                }
                                k62Var.i0(s49Var.b(), view);
                                break;
                            }
                        } else {
                            int b2 = s49Var.b();
                            le8 le8Var2 = (le8) view;
                            le8Var2.setTag(1);
                            le8Var2.a.a(k62Var.c0, false);
                            int i3 = b2 - k62Var.u0;
                            le8Var2.o(k62Var.L[i3], k96.M0(z ? 2131743814 : 2131747581, null), true);
                            le8Var2.setTag(null);
                            if (k62Var.l0 == b2) {
                                EditTextBoldCursor textView = le8Var2.getTextView();
                                textView.requestFocus();
                                gl.F3(textView);
                                k62Var.l0 = -1;
                            }
                            if (!z) {
                                le8Var2.e.a(ud8Var.b(i3), false);
                            }
                            k62Var.i0(b2, view);
                            break;
                        }
                    } else {
                        le8 le8Var3 = (le8) view;
                        le8Var3.setTag(1);
                        CharSequence charSequence2 = k62Var.P;
                        le8Var3.o(charSequence2 != null ? charSequence2 : "", k96.M0(2131746256, null), false);
                        le8Var3.setTag(null);
                        le8Var3.e.a(ud8Var.b(-2), false);
                        k62Var.i0(s49Var.b(), view);
                        break;
                    }
                } else {
                    le8 le8Var4 = (le8) view;
                    le8Var4.setTag(1);
                    CharSequence charSequence3 = k62Var.O;
                    le8Var4.o(charSequence3 != null ? charSequence3 : "", k96.M0(z ? 2131743812 : 2131746255, null), true);
                    le8Var4.setTag(null);
                    k62Var.i0(s49Var.b(), view);
                    break;
                }
                break;
            case 3:
                if (s49Var.f == 3) {
                    ahb ahbVar = (ahb) s49Var.a;
                    int b3 = s49Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b3 != dataSettingsActivity.F) {
                        if (b3 != dataSettingsActivity.E) {
                            if (b3 != dataSettingsActivity.G) {
                                if (b3 != dataSettingsActivity.H) {
                                    if (b3 != dataSettingsActivity.K) {
                                        if (b3 == dataSettingsActivity.L) {
                                            boolean z2 = gba.a;
                                            ahbVar.setChecked(e66.e(1024));
                                            break;
                                        }
                                    } else {
                                        boolean z3 = gba.a;
                                        ahbVar.setChecked(e66.e(2048));
                                        break;
                                    }
                                } else {
                                    ahbVar.setChecked(gba.z0);
                                    break;
                                }
                            } else {
                                ahbVar.setChecked(gba.y0);
                                break;
                            }
                        } else {
                            ahbVar.setChecked(gba.x0);
                            break;
                        }
                    } else {
                        ahbVar.setChecked(gba.A0);
                        break;
                    }
                }
                break;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (s49Var.f == 3) {
                    ahb ahbVar2 = (ahb) s49Var.a;
                    int b4 = s49Var.b();
                    i = proxyListActivity.useProxyRow;
                    if (b4 != i) {
                        if (b4 == proxyListActivity.w) {
                            ahbVar2.setChecked(gba.X0);
                            break;
                        }
                    } else {
                        ahbVar2.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
        }
    }

    @Override // w39
    public final void z(s49 s49Var) {
        switch (this.c) {
            case 1:
                k62 k62Var = (k62) this.e;
                int i = s49Var.f;
                if (i == 4 || i == 11 || i == 5) {
                    EditTextBoldCursor textView = ((le8) s49Var.a).getTextView();
                    if (textView.isFocused()) {
                        if (k62Var.J) {
                            c62 c62Var = k62Var.y;
                            if (c62Var != null) {
                                c62Var.e();
                            }
                            k62Var.Z(true);
                        }
                        k62Var.h1 = null;
                        textView.clearFocus();
                        gl.t1(textView);
                        break;
                    }
                }
                break;
        }
    }

    public s20(hj4 hj4Var, LaunchActivity launchActivity) {
        this.c = (byte) 6;
        this.e = hj4Var;
        this.d = launchActivity;
    }

    public /* synthetic */ s20(Object obj, Object obj2, byte b) {
        this.c = b;
        this.e = obj;
        this.d = obj2;
    }

    public s20(ProxyListActivity proxyListActivity, Context context) {
        this.c = (byte) 14;
        this.e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
