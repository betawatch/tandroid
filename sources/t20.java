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
import org.telegram.ui.ActionBar.e;
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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class t20 extends c79 {
    public final /* synthetic */ byte c;
    public final Object d;
    public final Object e;

    public t20(Context context) {
        this.c = (byte) 17;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        jf3 jf3Var = new jf3();
        jf3Var.a = ob6.M0(2131743824, null);
        jf3Var.b = ob6.M0(2131743816, null);
        jf3Var.c = (byte) 0;
        jf3Var.d = (byte) 0;
        jf3Var.e = true;
        jf3Var.f = false;
        jf3Var.g = (byte) 0;
        jf3Var.h = currentTimeMillis;
        jf3Var.i = false;
        jf3Var.j = false;
        jf3Var.k = 2;
        arrayList.add(jf3Var);
        jf3 jf3Var2 = new jf3();
        jf3Var2.a = ob6.M0(2131743823, null);
        jf3Var2.b = ob6.M0(2131743815, null);
        jf3Var2.c = (byte) 1;
        jf3Var2.d = (byte) 2;
        jf3Var2.e = false;
        jf3Var2.f = false;
        jf3Var2.g = (byte) 0;
        jf3Var2.h = currentTimeMillis - 3600;
        jf3Var2.i = false;
        jf3Var2.j = false;
        jf3Var2.k = -1;
        arrayList.add(jf3Var2);
        jf3 jf3Var3 = new jf3();
        jf3Var3.a = ob6.M0(2131743822, null);
        jf3Var3.b = ob6.M0(2131743814, null);
        jf3Var3.c = (byte) 2;
        jf3Var3.d = (byte) 3;
        jf3Var3.e = false;
        jf3Var3.f = true;
        jf3Var3.g = (byte) 0;
        jf3Var3.h = currentTimeMillis - 7200;
        jf3Var3.i = false;
        jf3Var3.j = true;
        jf3Var3.k = -1;
        arrayList.add(jf3Var3);
        jf3 jf3Var4 = new jf3();
        jf3Var4.a = ob6.M0(2131743821, null);
        jf3Var4.b = ob6.M0(2131743813, null);
        jf3Var4.c = (byte) 3;
        jf3Var4.d = (byte) 0;
        jf3Var4.e = false;
        jf3Var4.f = false;
        jf3Var4.g = (byte) 2;
        jf3Var4.h = currentTimeMillis - 10800;
        jf3Var4.i = false;
        jf3Var4.j = false;
        jf3Var4.k = -1;
        arrayList.add(jf3Var4);
        jf3 jf3Var5 = new jf3();
        jf3Var5.a = ob6.M0(2131743820, null);
        jf3Var5.b = ob6.M0(2131743812, null);
        jf3Var5.c = (byte) 4;
        jf3Var5.d = (byte) 0;
        jf3Var5.e = false;
        jf3Var5.f = false;
        jf3Var5.g = (byte) 1;
        jf3Var5.h = currentTimeMillis - 14400;
        jf3Var5.i = false;
        jf3Var5.j = false;
        jf3Var5.k = 2;
        arrayList.add(jf3Var5);
        jf3 jf3Var6 = new jf3();
        jf3Var6.a = ob6.M0(2131743819, null);
        jf3Var6.b = ob6.M0(2131743811, null);
        jf3Var6.c = (byte) 5;
        jf3Var6.d = (byte) 0;
        jf3Var6.e = false;
        jf3Var6.f = false;
        jf3Var6.g = (byte) 0;
        jf3Var6.h = currentTimeMillis - 18000;
        jf3Var6.i = false;
        jf3Var6.j = false;
        jf3Var6.k = -1;
        arrayList.add(jf3Var6);
        jf3 jf3Var7 = new jf3();
        jf3Var7.a = ob6.M0(2131743818, null);
        jf3Var7.b = ob6.M0(2131743810, null);
        jf3Var7.c = (byte) 6;
        jf3Var7.d = (byte) 0;
        jf3Var7.e = false;
        jf3Var7.f = false;
        jf3Var7.g = (byte) 0;
        jf3Var7.h = currentTimeMillis - 21600;
        jf3Var7.i = true;
        jf3Var7.j = false;
        jf3Var7.k = -1;
        arrayList.add(jf3Var7);
        jf3 jf3Var8 = new jf3();
        jf3Var8.a = ob6.M0(2131743817, null);
        jf3Var8.b = ob6.M0(2131743809, null);
        jf3Var8.c = (byte) 0;
        jf3Var8.d = (byte) 0;
        jf3Var8.e = false;
        jf3Var8.f = false;
        jf3Var8.g = (byte) 0;
        jf3Var8.h = currentTimeMillis - 25200;
        jf3Var8.i = true;
        jf3Var8.j = false;
        jf3Var8.k = -1;
        arrayList.add(jf3Var8);
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
    private final void G(f89 f89Var, int i) {
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
        int i31 = f89Var.f;
        if (i31 == 0) {
            mf5 mf5Var = (mf5) f89Var.a;
            NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
            if (i == notificationsSettingsActivity.y) {
                mf5Var.setText(ob6.M0(2131747636, "NotificationsForChats"));
                return;
            }
            if (i == notificationsSettingsActivity.F) {
                mf5Var.setText(ob6.M0(2131748973, "InAppNotifications"));
                return;
            }
            if (i == notificationsSettingsActivity.L) {
                mf5Var.setText(ob6.M0(2131750850, "Events"));
                return;
            }
            if (i == notificationsSettingsActivity.N) {
                mf5Var.setText(ob6.M0(2131747618, "NotificationsOther"));
                return;
            }
            if (i == notificationsSettingsActivity.T) {
                mf5Var.setText(ob6.M0(2131745845, "Reset"));
                return;
            }
            if (i == notificationsSettingsActivity.H) {
                mf5Var.setText(ob6.M0(2131742931, "VoipNotificationSettings"));
                return;
            } else if (i == notificationsSettingsActivity.O) {
                mf5Var.setText(ob6.M0(2131753726, "BadgeNumber"));
                return;
            } else {
                if (i == notificationsSettingsActivity.r) {
                    mf5Var.setText(ob6.M0(2131745064, "ShowNotificationsFor"));
                    return;
                }
                return;
            }
        }
        if (i31 == 1) {
            wkb wkbVar = (wkb) f89Var.a;
            i2 = ((e) ((NotificationsSettingsActivity) this.e)).currentAccount;
            SharedPreferences sharedPreferences = uc7.s1(i2).X3;
            i3 = ((NotificationsSettingsActivity) this.e).inappSoundRow;
            if (i == i3) {
                wkbVar.f(ob6.M0(2131748969, null), sharedPreferences.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            i4 = ((NotificationsSettingsActivity) this.e).inappVibrateRow;
            if (i == i4) {
                wkbVar.f(ob6.M0(2131748968, null), sharedPreferences.getBoolean("EnableInAppVibrate", true), true);
                return;
            }
            i5 = ((NotificationsSettingsActivity) this.e).inappPreviewRow;
            if (i == i5) {
                wkbVar.f(ob6.M0(2131748970, null), sharedPreferences.getBoolean("EnableInAppPreview", true), true);
                return;
            }
            i6 = ((NotificationsSettingsActivity) this.e).inappPriorityRow;
            if (i == i6) {
                wkbVar.g(ob6.M0(2131748972, null), ob6.M0(2131748971, null), sharedPreferences.getBoolean("EnableInAppPopup", true), true, false);
                return;
            }
            i7 = ((NotificationsSettingsActivity) this.e).contactJoinedRow;
            if (i == i7) {
                wkbVar.f(ob6.M0(2131751755, "ContactJoined"), sharedPreferences.getBoolean("EnableContactJoined", true), true);
                return;
            }
            i8 = ((NotificationsSettingsActivity) this.e).pinnedMessageRow;
            if (i == i8) {
                wkbVar.f(ob6.M0(2131746955, "PinnedMessages"), sharedPreferences.getBoolean("PinnedMessages", true), false);
                return;
            }
            NotificationsSettingsActivity notificationsSettingsActivity2 = (NotificationsSettingsActivity) this.e;
            if (i == notificationsSettingsActivity2.Q) {
                wkbVar.f("Android Auto", sharedPreferences.getBoolean("EnableAutoNotifications", false), true);
                return;
            }
            if (i == notificationsSettingsActivity2.w) {
                wkbVar.g(ob6.M0(2131747603, "NotificationsService"), ob6.M0(2131747600, "NotificationsServiceInfo"), sharedPreferences.getBoolean("pushService", ((NotificationsSettingsActivity) this.e).getMessagesController().l4.G3.f), true, true);
                return;
            }
            if (i == notificationsSettingsActivity2.x) {
                wkbVar.g(ob6.M0(2131747602, "NotificationsServiceConnection"), ob6.M0(2131747601, "NotificationsServiceConnectionInfo"), sharedPreferences.getBoolean("pushConnection", ((NotificationsSettingsActivity) this.e).getMessagesController().l4.H3.f), true, true);
                return;
            }
            i9 = notificationsSettingsActivity2.badgeNumberShowRow;
            if (i == i9) {
                wkbVar.f(ob6.M0(2131753724, "BadgeNumberShow"), ((NotificationsSettingsActivity) this.e).getNotificationsController().S, true);
                return;
            }
            i10 = ((NotificationsSettingsActivity) this.e).badgeNumberMutedRow;
            if (i == i10) {
                wkbVar.f(ob6.M0(2131753725, "BadgeNumberMutedChats"), ((NotificationsSettingsActivity) this.e).getNotificationsController().T, true);
                return;
            }
            i11 = ((NotificationsSettingsActivity) this.e).badgeNumberMessagesRow;
            if (i == i11) {
                wkbVar.f(ob6.M0(2131753723, "BadgeNumberUnread"), ((NotificationsSettingsActivity) this.e).getNotificationsController().U, false);
                return;
            }
            i12 = ((NotificationsSettingsActivity) this.e).inchatSoundRow;
            if (i == i12) {
                wkbVar.f(ob6.M0(2131748967, "InChatSound"), sharedPreferences.getBoolean("EnableInChatSound", true), true);
                return;
            }
            NotificationsSettingsActivity notificationsSettingsActivity3 = (NotificationsSettingsActivity) this.e;
            if (i == notificationsSettingsActivity3.I) {
                wkbVar.f(ob6.M0(2131743269, "Vibrate"), sharedPreferences.getBoolean("EnableCallVibrate", true), true);
                return;
            }
            i13 = notificationsSettingsActivity3.accountsAllRow;
            if (i == i13) {
                wkbVar.f(ob6.M0(2131754295, "AllAccounts"), uc7.f1().getBoolean("AllAccounts", true), false);
                return;
            }
            return;
        }
        if (i31 == 2) {
            dlb dlbVar = (dlb) f89Var.a;
            dlbVar.setMultilineDetail(true);
            i14 = ((NotificationsSettingsActivity) this.e).resetNotificationsRow;
            if (i == i14) {
                dlbVar.a(ob6.M0(2131745839, "ResetAllNotifications"), ob6.M0(2131743541, "UndoAllCustom"), false);
                return;
            }
            return;
        }
        if (i31 != 3) {
            if (i31 != 5) {
                if (i31 == 6) {
                    ilb ilbVar = (ilb) f89Var.a;
                    if (i == ((NotificationsSettingsActivity) this.e).s) {
                        ilbVar.setText(ob6.M0(2131745063, "ShowNotificationsForInfo"));
                        return;
                    }
                    return;
                }
                return;
            }
            qmb qmbVar = (qmb) f89Var.a;
            i30 = ((e) ((NotificationsSettingsActivity) this.e)).currentAccount;
            SharedPreferences sharedPreferences2 = uc7.s1(i30).X3;
            NotificationsSettingsActivity notificationsSettingsActivity4 = (NotificationsSettingsActivity) this.e;
            if (i == notificationsSettingsActivity4.J) {
                String string = sharedPreferences2.getString("CallsRingtone", ob6.M0(2131751564, "DefaultRingtone"));
                if (string.equals("NoSound")) {
                    string = ob6.M0(2131747882, "NoSound");
                }
                qmbVar.c(ob6.M0(2131742893, "VoipSettingsRingtone"), string, ((NotificationsSettingsActivity) this.e).X, false);
                ((NotificationsSettingsActivity) this.e).X = false;
                return;
            }
            if (i != notificationsSettingsActivity4.I) {
                if (i == notificationsSettingsActivity4.R) {
                    int i32 = sharedPreferences2.getInt("repeat_messages", 60);
                    qmbVar.c(ob6.M0(2131746002, "RepeatNotifications"), i32 == 0 ? ob6.M0(2131746001, "RepeatNotificationsNever") : i32 < 60 ? ob6.G(i32, "Minutes", new Object[0]) : ob6.G(i32 / 60, "Hours", new Object[0]), ((NotificationsSettingsActivity) this.e).Y, false);
                    ((NotificationsSettingsActivity) this.e).Y = false;
                    return;
                }
                return;
            }
            int i33 = sharedPreferences2.getInt("vibrate_calls", 0);
            if (i33 == 0) {
                qmbVar.c(ob6.M0(2131743269, "Vibrate"), ob6.M0(2131743268, "VibrationDefault"), ((NotificationsSettingsActivity) this.e).W, true);
            } else if (i33 == 1) {
                qmbVar.c(ob6.M0(2131743269, "Vibrate"), ob6.M0(2131745094, "Short"), ((NotificationsSettingsActivity) this.e).W, true);
            } else if (i33 == 2) {
                qmbVar.c(ob6.M0(2131743269, "Vibrate"), ob6.M0(2131743267, "VibrationDisabled"), ((NotificationsSettingsActivity) this.e).W, true);
            } else if (i33 == 3) {
                qmbVar.c(ob6.M0(2131743269, "Vibrate"), ob6.M0(2131748477, "Long"), ((NotificationsSettingsActivity) this.e).W, true);
            } else if (i33 == 4) {
                qmbVar.c(ob6.M0(2131743269, "Vibrate"), ob6.M0(2131747548, "OnlyIfSilent"), ((NotificationsSettingsActivity) this.e).W, true);
            }
            ((NotificationsSettingsActivity) this.e).W = false;
            return;
        }
        uo7 uo7Var = (uo7) f89Var.a;
        i15 = ((e) ((NotificationsSettingsActivity) this.e)).currentAccount;
        SharedPreferences sharedPreferences3 = uc7.s1(i15).X3;
        i16 = ((e) ((NotificationsSettingsActivity) this.e)).currentAccount;
        int currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
        i17 = ((NotificationsSettingsActivity) this.e).privateRow;
        if (i == i17) {
            M0 = ob6.M0(2131747605, null);
            arrayList = ((NotificationsSettingsActivity) this.e).d;
            i21 = sharedPreferences3.getInt("EnableAll2", 0);
            i22 = R.drawable.msg_openprofile;
        } else {
            i18 = ((NotificationsSettingsActivity) this.e).groupRow;
            if (i != i18) {
                i19 = ((NotificationsSettingsActivity) this.e).storiesRow;
                int i34 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i == i19) {
                    M0 = ob6.M0(2131747659, null);
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
                        M0 = ob6.M0(2131747663, null);
                        i21 = (sharedPreferences3.getBoolean("EnableReactionsMessages", true) || sharedPreferences3.getBoolean("EnableReactionsStories", true)) ? 0 : Integer.MAX_VALUE;
                        arrayList = null;
                        i23 = R.drawable.msg_reactions;
                        arrayList2 = null;
                    } else {
                        M0 = ob6.M0(2131747648, null);
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
                            sb.append(ob6.M0(2131747619, "NotificationsOn"));
                        } else if (i21 - 31536000 >= currentTime) {
                            sb.append(ob6.M0(2131747621, "NotificationsOff"));
                        } else {
                            Object[] objArr = new Object[1];
                            objArr[i26] = ob6.e1(i21);
                            sb.append(ob6.a0("NotificationsOffUntil", null, 2131747620, objArr));
                        }
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        int size = arrayList.size();
                        i28 = ((NotificationsSettingsActivity) this.e).storiesRow;
                        if (i == i28 && !sharedPreferences3.contains("EnableAllStories") && arrayList2 != null) {
                            size += arrayList2.size();
                        }
                        sb.append(ob6.G(size, "Exception", new Object[i26]));
                    } else if (arrayList2 == null || arrayList2.isEmpty()) {
                        sb.append(ob6.M0(2131743914, "TapToChange"));
                    } else {
                        if (i21 > 0) {
                            sb.append(ob6.M0(2131747621, "NotificationsOff"));
                        } else {
                            sb.append(ob6.M0(2131747619, "NotificationsOn"));
                        }
                        if (!arrayList2.isEmpty() && !sharedPreferences3.contains("EnableAllStories")) {
                            sb.append(", ");
                            sb.append(ob6.G(arrayList2.size(), "AutoException", new Object[0]));
                        }
                    }
                    z = i24;
                } else if (i21 > 0) {
                    sb.append(ob6.M0(2131747621, "NotificationsOff"));
                    z = i26;
                } else {
                    if (sharedPreferences3.getBoolean("EnableReactionsMessages", true)) {
                        sb.append(ob6.M0(2131747662, null));
                    }
                    if (sharedPreferences3.getBoolean("EnableReactionsStories", true)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(ob6.M0(2131747661, null));
                    }
                    z = 1;
                }
                i29 = ((NotificationsSettingsActivity) this.e).reactionsRow;
                uo7Var.b(charSequence, sb, i23, z, i25, false, i == i29, false);
            }
            M0 = ob6.M0(2131747634, null);
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
        uo7Var.b(charSequence2, sb2, i23, z, i25, false, i == i29, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ee, code lost:
    
        if (org.telegram.ui.Wallet.c.C(r7).R() == false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void H(f89 f89Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        PasscodeActivity passcodeActivity = (PasscodeActivity) this.e;
        int i9 = f89Var.f;
        View view = f89Var.a;
        boolean z = true;
        if (i9 == 0) {
            wkb wkbVar = (wkb) view;
            i2 = passcodeActivity.fingerprintRow;
            if (i == i2) {
                wkbVar.f(ob6.M0(2131743528, null), xea.C, false);
                return;
            }
            if (i == passcodeActivity.O) {
                wkbVar.f(ob6.M0(2131745569, null), xea.z, false);
                return;
            }
            if (i != passcodeActivity.L) {
                if (i == passcodeActivity.K) {
                    String M0 = ob6.M0(2131742816, null);
                    i3 = ((e) passcodeActivity).currentAccount;
                    wkbVar.f(M0, c.C(i3).S(), false);
                    return;
                }
                return;
            }
            String M02 = ob6.M0(2131742817, null);
            i4 = ((e) passcodeActivity).currentAccount;
            if (c.C(i4).e()) {
                i5 = ((e) passcodeActivity).currentAccount;
            }
            z = false;
            wkbVar.f(M02, z, false);
            return;
        }
        if (i9 == 1) {
            qmb qmbVar = (qmb) view;
            i6 = passcodeActivity.changePasscodeRow;
            if (i == i6) {
                qmbVar.b(ob6.M0(2131752525, null), true);
                if (xea.r.isEmpty()) {
                    int i10 = aob.E6;
                    qmbVar.setTag(Integer.valueOf(i10));
                    yob.X(qmbVar.getTextView(), i10, null);
                    return;
                } else {
                    int i11 = aob.G6;
                    qmbVar.setTag(Integer.valueOf(i11));
                    yob.X(qmbVar.getTextView(), i11, null);
                    return;
                }
            }
            i7 = passcodeActivity.autoLockRow;
            if (i == i7) {
                int i12 = xea.x;
                qmbVar.c(ob6.M0(2131753793, null), i12 == 0 ? ob6.a0("AutoLockDisabled", null, 2131753792, new Object[0]) : i12 < 3600 ? ob6.a0("AutoLockInTime", null, 2131753791, ob6.G(i12 / 60, "Minutes", new Object[0])) : i12 < 86400 ? ob6.a0("AutoLockInTime", null, 2131753791, ob6.G((int) Math.ceil((i12 / 60.0f) / 60.0f), "Hours", new Object[0])) : ob6.a0("AutoLockInTime", null, 2131753791, ob6.G((int) Math.ceil(((i12 / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])), false, true);
                int i13 = aob.G6;
                qmbVar.setTag(Integer.valueOf(i13));
                yob.X(qmbVar.getTextView(), i13, null);
                return;
            }
            i8 = passcodeActivity.disablePasscodeRow;
            if (i == i8) {
                qmbVar.b(ob6.M0(2131751398, null), false);
                int i14 = aob.q7;
                qmbVar.setTag(Integer.valueOf(i14));
                yob.X(qmbVar.getTextView(), i14, null);
                return;
            }
            return;
        }
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 == 4) {
                    sy7 sy7Var = (sy7) view;
                    sy7Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    sy7Var.a.d();
                    return;
                }
                return;
            }
            mf5 mf5Var = (mf5) view;
            mf5Var.setHeight(46);
            if (i == passcodeActivity.N) {
                mf5Var.setText(ob6.M0(2131745571, null));
                return;
            } else {
                if (i == passcodeActivity.J) {
                    mf5Var.setText(ob6.M0(2131742729, null));
                    return;
                }
                return;
            }
        }
        ilb ilbVar = (ilb) view;
        if (i == passcodeActivity.H) {
            ilbVar.setText(ob6.M0(2131747382, null));
            ilbVar.setBackground(null);
            ilbVar.getTextView().setGravity(1);
        } else if (i == passcodeActivity.I) {
            ilbVar.setText(ob6.M0(2131753790, null));
            ilbVar.getTextView().setGravity(ob6.a0 ? 5 : 3);
        } else if (i == passcodeActivity.M) {
            ilbVar.setText(ob6.M0(2131742728, null));
            ilbVar.getTextView().setGravity(ob6.a0 ? 5 : 3);
        } else if (i == passcodeActivity.P) {
            ilbVar.setText(ob6.M0(2131745570, null));
            ilbVar.getTextView().setGravity(ob6.a0 ? 5 : 3);
        }
    }

    private final void I(f89 f89Var, int i) {
        c98 c98Var = (c98) this.e;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0) {
            if (i2 == 1) {
                l88 l88Var = (l88) view;
                l88Var.setTag(Integer.valueOf(i));
                if (i == c98Var.E) {
                    l88Var.a(c98Var.O, ob6.M0(2131743767, null));
                    return;
                } else {
                    if (i == c98Var.F) {
                        l88Var.a(c98Var.P, ob6.M0(2131743768, null));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        o88 o88Var = (o88) view;
        o88Var.setTag(Integer.valueOf(i));
        if (i == c98Var.b) {
            o88Var.a(ob6.M0(2131751091, null), 0, c98Var.H);
            return;
        }
        if (i == c98Var.r) {
            o88Var.a(ob6.M0(2131749056, null), -100, c98Var.Q);
            return;
        }
        if (i == c98Var.d) {
            o88Var.a(ob6.M0(2131751734, null), -100, c98Var.J);
            return;
        }
        if (i == c98Var.c) {
            o88Var.a(ob6.M0(2131750822, null), -100, c98Var.I);
            return;
        }
        if (i == c98Var.f) {
            o88Var.a(ob6.M0(2131742580, null), -100, c98Var.K);
            return;
        }
        if (i == c98Var.e) {
            o88Var.a(ob6.M0(2131745675, null), -100, c98Var.L);
            return;
        }
        if (i == c98Var.w) {
            o88Var.a(ob6.M0(2131743176, null), 0, c98Var.S);
            return;
        }
        if (i == c98Var.s) {
            o88Var.a(ob6.M0(2131745193, null), -100, c98Var.R);
            return;
        }
        if (i == c98Var.x) {
            o88Var.a(ob6.M0(2131749295, null), 0, c98Var.T);
            return;
        }
        if (i == c98Var.y) {
            o88Var.a(ob6.M0(2131745095, null), 0, c98Var.V);
        } else if (i == c98Var.h) {
            o88Var.a(ob6.M0(2131750811, null), 0, c98Var.M);
        } else if (i == c98Var.n) {
            o88Var.a(ob6.M0(2131745021, null), 0, c98Var.N);
        }
    }

    private final void J(f89 f89Var, int i) {
        boolean Q0;
        l98 l98Var = (l98) this.e;
        do6 do6Var = l98Var.K;
        ArrayList arrayList = l98Var.n;
        ArrayList arrayList2 = l98Var.c;
        HashMap hashMap = l98Var.b;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            d88 d88Var = (d88) view;
            d88Var.setItemSize(l98Var.S);
            de0 imageView = d88Var.getImageView();
            d88Var.setTag(Integer.valueOf(i));
            imageView.q();
            if (do6Var != null) {
                no6 no6Var = (no6) do6Var.e.get(i);
                d88Var.d(no6Var, arrayList2.size() > 1, true, false, false);
                int i3 = no6Var.C;
                d88Var.b(l98Var.e ? arrayList2.indexOf(Integer.valueOf(i3)) : -1, hashMap.containsKey(Integer.valueOf(i3)), false);
                Q0 = PhotoViewer.Q0(no6Var.I);
            } else {
                ro6 ro6Var = (ro6) l98Var.f.get(i);
                d88Var.e(ro6Var);
                d88Var.getVideoInfoContainer().setVisibility(4);
                d88Var.b(l98Var.e ? arrayList2.indexOf(ro6Var.B) : -1, hashMap.containsKey(ro6Var.B), false);
                Q0 = PhotoViewer.Q0(ro6Var.g());
            }
            imageView.getImageReceiver().v0(!Q0, true);
            d88Var.getCheckBox().setVisibility((l98Var.U != 0 || Q0) ? 8 : 0);
            return;
        }
        if (i2 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = l98Var.S;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i2 == 2) {
            no6 no6Var2 = (no6) do6Var.e.get(i);
            zea zeaVar = (zea) view;
            zeaVar.setPhotoEntry(no6Var2);
            zeaVar.b(hashMap.containsKey(Integer.valueOf(no6Var2.C)), false);
            zeaVar.setTag(Integer.valueOf(i));
            return;
        }
        if (i2 == 3) {
            skb skbVar = (skb) view;
            if (i < arrayList.size()) {
                skbVar.o(R.drawable.msg_recent, (CharSequence) arrayList.get(i), false);
            } else {
                skbVar.o(R.drawable.msg_clear_recent, ob6.M0(2131752032, null), false);
            }
        }
    }

    private final void K(f89 f89Var, int i) {
        PhotoViewer photoViewer = (PhotoViewer) this.e;
        Context context = (Context) this.d;
        p98 p98Var = (p98) f89Var.a;
        int L = hl.L(85.0f);
        int L2 = i != 0 ? hl.L(6.0f) : 0;
        p98Var.f = L;
        og2 og2Var = p98Var.c;
        de0 de0Var = p98Var.a;
        jo0 jo0Var = p98Var.e;
        p98Var.h = L2;
        ((FrameLayout.LayoutParams) p98Var.b.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) de0Var.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) jo0Var.getLayoutParams()).rightMargin = L2;
        de0Var.q();
        Object obj = photoViewer.d.u().get(photoViewer.d.d().get(i));
        if (!(obj instanceof no6)) {
            if (obj instanceof ro6) {
                ro6 ro6Var = (ro6) obj;
                p98Var.setTag(ro6Var);
                p98Var.setImage(ro6Var);
                jo0Var.setVisibility(4);
                og2Var.a.f(-1, true, false);
                og2Var.setVisibility(0);
                return;
            }
            return;
        }
        no6 no6Var = (no6) obj;
        int i2 = no6Var.C;
        String str = no6Var.I;
        p98Var.setTag(no6Var);
        jo0Var.setVisibility(4);
        String str2 = no6Var.c;
        if (str2 != null) {
            de0Var.o(str2, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (str != null) {
            de0Var.r(no6Var.J, no6Var.K, true);
            if (!no6Var.b || no6Var.d()) {
                de0Var.o(dze.d("thumb://", i2, ":", str), null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                jo0Var.setVisibility(0);
                p98Var.d.setText(hl.g0(no6Var.E, false, false));
                de0Var.o("vthumb://" + i2 + ":" + str, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            de0Var.setImageResource(R.drawable.nophotos);
        }
        og2Var.a.f(-1, true, false);
        og2Var.setVisibility(0);
    }

    private final void L(f89 f89Var, int i) {
        int i2;
        int i3;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i4 = f89Var.f;
        View view = f89Var.a;
        switch (i4) {
            case 1:
                qmb qmbVar = (qmb) view;
                yob.X(qmbVar.getTextView(), aob.G6, null);
                i2 = proxyListActivity.proxyAddRow;
                if (i == i2) {
                    qmbVar.b(ob6.M0(2131754384, null), proxyListActivity.E != -1);
                    break;
                } else if (i == proxyListActivity.E) {
                    yob.X(qmbVar.getTextView(), aob.p7, null);
                    qmbVar.b(ob6.M0(2131751545, null), false);
                    break;
                }
                break;
            case 2:
                mf5 mf5Var = (mf5) view;
                if (i == proxyListActivity.h) {
                    mf5Var.setText(ob6.M0(2131746332, null));
                    break;
                }
                break;
            case 3:
                wkb wkbVar = (wkb) view;
                i3 = proxyListActivity.useProxyRow;
                if (i == i3) {
                    wkbVar.f(ob6.M0(2131743438, null), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else if (i == proxyListActivity.w) {
                    wkbVar.f(ob6.M0(2131743440, null), xea.W0, true);
                    break;
                }
                break;
            case 4:
                ilb ilbVar = (ilb) view;
                if (i == proxyListActivity.y) {
                    ilbVar.setText(ob6.M0(2131746330, null));
                    break;
                }
                break;
            case 5:
                hx8 hx8Var = (hx8) view;
                wea weaVar = (wea) arrayList2.get(i - proxyListActivity.n);
                hx8Var.setProxy(weaVar);
                hx8Var.setChecked(xea.x1 == weaVar);
                boolean contains = arrayList.contains(arrayList2.get(i - proxyListActivity.n));
                hx8Var.h = contains;
                hx8Var.f.a(contains, false);
                hx8Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i == proxyListActivity.x) {
                    zma zmaVar = (zma) view;
                    ArrayList arrayList3 = new ArrayList(ix8.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                        strArr[i5] = ob6.a0(null, null, 2131746329, arrayList3.get(i5));
                    }
                    zmaVar.setCallback(new ku7((byte) 29));
                    zmaVar.b(xea.X0, null, strArr);
                    break;
                }
                break;
        }
    }

    private final void M(f89 f89Var, int i) {
        TextView textView;
        dka dkaVar = (dka) this.e;
        int i2 = f89Var.f;
        if (i2 == 0) {
            ((aka) f89Var.a).setDialog(dka.E0(i - 1));
        } else {
            if (i2 != 1 || (textView = dkaVar.o1) == null) {
                return;
            }
            textView.setText(ob6.a0("SharingLiveLocationTitle", null, 2131745120, ob6.G(id6.g(), "Chats", new Object[0])));
        }
    }

    private final void N(f89 f89Var, int i) {
        yeb yebVar = (yeb) f89Var.a;
        zeb zebVar = (zeb) this.d;
        ArrayList arrayList = zebVar.x;
        String str = arrayList == null ? null : ((hs6) arrayList.get(i)).a;
        int direction = zebVar.getDirection();
        int i2 = yeb.h;
        yebVar.a = str;
        if (str == null || !str.startsWith("animated_")) {
            yebVar.setImageDrawable(pv3.f(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = yebVar.b;
                if (!(drawable instanceof wl) || ((wl) drawable).h() != parseLong) {
                    yebVar.setImageDrawable(wl.m(yac.t0, parseLong, null, yebVar.f.c()));
                }
            } catch (Exception unused) {
                yebVar.setImageDrawable(null);
            }
        }
        if (yebVar.d != direction) {
            yebVar.d = direction;
            yebVar.requestLayout();
        }
    }

    private final void O(f89 f89Var, int i) {
        ArrayList arrayList = (ArrayList) this.e;
        if (f89Var.f == 0) {
            of3 of3Var = (of3) f89Var.a;
            of3Var.t2 = i != arrayList.size() - 1;
            of3Var.setDialog((jf3) arrayList.get(i));
        }
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
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
                int b2 = f89Var.b();
                if (b2 != 1) {
                    i = ((e) ((kp9) obj)).currentAccount;
                    if (!MediaController.v0(i) || b2 != 2) {
                    }
                }
                break;
            case 1:
                int b3 = f89Var.b();
                a72 a72Var = (a72) obj;
                if (b3 == a72Var.v0 || b3 == a72Var.H0 || b3 == a72Var.C0 || b3 == a72Var.G0 || b3 == a72Var.D0 || b3 == a72Var.I0 || b3 == a72Var.E0 || b3 == a72Var.F0 || b3 == a72Var.J0 || b3 == a72Var.K0 || b3 == a72Var.O0.b || b3 == a72Var.N0.b || b3 == a72Var.M0) {
                    break;
                }
                break;
            case 2:
                int b4 = f89Var.b();
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
                int b5 = f89Var.b();
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
                if (ik8.G(3)[f89Var.f] == 1) {
                    break;
                }
                break;
            case 7:
                int b6 = f89Var.b();
                th6 th6Var = (th6) obj;
                if (b6 == th6Var.c || b6 == th6Var.d || b6 == th6Var.e || b6 == th6Var.f || b6 == th6Var.h || b6 == th6Var.r) {
                    break;
                }
                break;
            case 8:
                int b7 = f89Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                if (b7 != notificationsSettingsActivity.y && b7 != notificationsSettingsActivity.E && b7 != notificationsSettingsActivity.F && b7 != notificationsSettingsActivity.L && b7 != notificationsSettingsActivity.N && b7 != notificationsSettingsActivity.T && b7 != notificationsSettingsActivity.O && b7 != notificationsSettingsActivity.M && b7 != notificationsSettingsActivity.S && b7 != notificationsSettingsActivity.G && b7 != notificationsSettingsActivity.H && b7 != notificationsSettingsActivity.P && b7 != notificationsSettingsActivity.r && b7 != notificationsSettingsActivity.s && b7 != notificationsSettingsActivity.U && b7 != notificationsSettingsActivity.K) {
                    break;
                }
                break;
            case 9:
                int b8 = f89Var.b();
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
                l98 l98Var = (l98) obj;
                if (l98Var.K == null) {
                    if (TextUtils.isEmpty(l98Var.w)) {
                        if (f89Var.f != 3) {
                        }
                    } else if (f89Var.b() >= l98Var.f.size()) {
                    }
                }
                break;
            case 14:
                int b9 = f89Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                i17 = proxyListActivity.useProxyRow;
                if (b9 != i17 && b9 != proxyListActivity.w) {
                    i18 = proxyListActivity.proxyAddRow;
                    if (b9 != i18 && b9 != proxyListActivity.E && (b9 < proxyListActivity.n || b9 >= proxyListActivity.r)) {
                    }
                }
                break;
            case 15:
                if (f89Var.f == 0) {
                    break;
                }
                break;
            case 17:
                if (f89Var.f != 1) {
                    break;
                }
                break;
        }
        return true;
    }

    public final void E() {
        jla jlaVar;
        jla jlaVar2;
        jla jlaVar3;
        jla jlaVar4;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        int size = proxyListActivity.F.size();
        jlaVar = ((e) proxyListActivity).simpleActionBar;
        boolean z = jlaVar.z();
        if (size <= 0) {
            if (z) {
                jlaVar2 = ((e) proxyListActivity).simpleActionBar;
                jlaVar2.y();
                int i = proxyListActivity.n;
                n(i, proxyListActivity.r - i, 2);
                return;
            }
            return;
        }
        jlaVar3 = ((e) proxyListActivity).simpleActionBar;
        jlaVar3.H(size, z);
        if (z) {
            return;
        }
        jlaVar4 = ((e) proxyListActivity).simpleActionBar;
        jlaVar4.L();
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
        wea weaVar = (wea) proxyListActivity.G.get(i - i2);
        if (arrayList.contains(weaVar)) {
            arrayList.remove(weaVar);
        } else {
            arrayList.add(weaVar);
        }
        h(i, 1);
        E();
    }

    @Override // j79
    public final int b() {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return 4;
            case 1:
                return ((a72) obj).R0;
            case 2:
                return ((DataAutoDownloadActivity) obj).y;
            case 3:
                return ((DataSettingsActivity) obj).U;
            case 4:
                return ((fg4) obj).h.size();
            case 5:
                int size = ((ah4) obj).u1.size();
                return size < 10 ? size + 1 : size;
            case 6:
                return ((ll4) obj).F.size();
            case 7:
                return ((th6) obj).w;
            case 8:
                return ((NotificationsSettingsActivity) obj).V;
            case 9:
                return ((PasscodeActivity) obj).Q;
            case 10:
                if (((w78) obj).d != null) {
                    return (int) Math.ceil(r4.size() / r2.f);
                }
                return 0;
            case 11:
                return ((c98) obj).G;
            case 12:
                l98 l98Var = (l98) obj;
                ArrayList arrayList = l98Var.n;
                ArrayList arrayList2 = l98Var.f;
                do6 do6Var = l98Var.K;
                if (do6Var != null) {
                    return do6Var.e.size();
                }
                if (!arrayList2.isEmpty()) {
                    return arrayList2.size() + (!l98Var.s ? 1 : 0);
                }
                if (!TextUtils.isEmpty(l98Var.w) || arrayList.isEmpty()) {
                    return 0;
                }
                return arrayList.size() + 2;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                ed8 ed8Var = photoViewer.d;
                if (ed8Var == null || ed8Var.d() == null) {
                    return 0;
                }
                return photoViewer.d.d().size();
            case 14:
                return ((ProxyListActivity) obj).e;
            case 15:
                return id6.g() + 1;
            case 16:
                ArrayList arrayList3 = ((zeb) this.d).x;
                if (arrayList3 != null) {
                    return arrayList3.size();
                }
                return 0;
            case 17:
                return ((ArrayList) obj).size();
            default:
                return ((uic) obj).h.size();
        }
    }

    @Override // j79
    public final long c(int i) {
        int i2;
        int i3;
        int i4;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 4:
                i2 = ((fg4) obj).m0.get(i);
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
                return ((wea) proxyListActivity.G.get(i - r2)).hashCode();
            case 16:
                if (((zeb) this.d).x == null) {
                    return 0L;
                }
                return ((hs6) r2.get(i)).a.hashCode();
            case 18:
                i2 = ((ric) ((uic) obj).h.get(i)).a;
                break;
            default:
                return super.c(i);
        }
        return i2;
    }

    @Override // j79
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
                a72 a72Var = (a72) obj;
                if (i == a72Var.C0 || i == a72Var.G0 || i == a72Var.H0 || i == a72Var.D0 || i == a72Var.E0 || i == a72Var.F0 || i == a72Var.I0 || i == a72Var.N0.b || i == a72Var.O0.b) {
                    return 10;
                }
                if (i == a72Var.m0 || i == a72Var.t0 || i == a72Var.x0 || i == a72Var.p0) {
                    return 0;
                }
                if (i == a72Var.s0) {
                    return 1;
                }
                if (i == a72Var.w0 || i == a72Var.y0 || i == a72Var.r0 || i == a72Var.L0) {
                    return 2;
                }
                if (i == a72Var.v0 || i == a72Var.J0 || i == a72Var.M0) {
                    return 3;
                }
                if (i == a72Var.n0) {
                    return 4;
                }
                if (i == a72Var.o0) {
                    return 11;
                }
                if (i == a72Var.q0) {
                    return 7;
                }
                if (i == a72Var.z0 || i == a72Var.A0 || i == a72Var.K0) {
                    return 6;
                }
                if (i == a72Var.B0) {
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
                return ik8.F(((dl4) ((ll4) obj).F.get(i)).b);
            case 7:
                th6 th6Var = (th6) obj;
                if (i == 0) {
                    return 0;
                }
                if (i == th6Var.c || i == th6Var.d || i == th6Var.e || i == th6Var.f || i == th6Var.h) {
                    return 1;
                }
                if (i == th6Var.n) {
                    return 2;
                }
                return i == th6Var.r ? 3 : 4;
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
                c98 c98Var = (c98) obj;
                return (i == c98Var.E || i == c98Var.F) ? 1 : 0;
            case 12:
                l98 l98Var = (l98) obj;
                ArrayList arrayList = l98Var.f;
                if (l98Var.Z) {
                    return 2;
                }
                if (l98Var.K == null) {
                    if (arrayList.isEmpty()) {
                        return i != l98Var.n.size() ? 3 : 4;
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
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
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
        kq3 o;
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
        kq3 o2;
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
        skb skbVar;
        int i33;
        tic ticVar;
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
                i2 = ((e) ((kp9) obj2)).currentAccount;
                boolean v0 = MediaController.v0(i2);
                int i36 = f89Var.f;
                View view = f89Var.a;
                if (i36 == 0) {
                    ((mf5) view).setText(ob6.M0(2131753917, null));
                    break;
                } else if (i36 == 1) {
                    ((wkb) view).f(ob6.M0(2131753911, null), v0, false);
                    break;
                } else if (i36 == 2) {
                    qmb qmbVar = (qmb) view;
                    qmbVar.setEnabled(v0);
                    qmbVar.c(ob6.M0(2131753915, null), ob6.M0(((f30) phd.c.a()) == f30.b ? 2131753913 : 2131753914, null), false, false);
                    break;
                } else {
                    ((ilb) view).setText(ob6.M0(2131753916, null));
                    break;
                }
            case 1:
                Context context = (Context) obj;
                a72 a72Var = (a72) obj2;
                boolean z8 = a72Var.f0;
                cdc cdcVar = a72Var.N0;
                cdc cdcVar2 = a72Var.O0;
                vnb vnbVar = a72Var.a;
                boolean z9 = a72Var.n;
                int i37 = f89Var.f;
                View view2 = f89Var.a;
                if (i37 != 0) {
                    if (i37 != 6) {
                        if (i37 != 2) {
                            if (i37 != 3) {
                                if (i37 != 9) {
                                    if (i37 == 10) {
                                        xh8 xh8Var = (xh8) view2;
                                        xh8Var.setDivider(false);
                                        if (i == a72Var.C0) {
                                            xh8Var.a(ob6.M0(2131746851, null), ob6.M0(2131746850, null), ol5.c, R.drawable.filled_poll_view_24, !a72Var.b0);
                                        } else {
                                            if (i == a72Var.G0) {
                                                xh8Var.a(ob6.M0(2131746876, null), ob6.M0(2131746875, null), ol5.f, R.drawable.filled_poll_multiple_24, a72Var.c0);
                                            } else if (i == a72Var.E0) {
                                                xh8Var.a(ob6.M0(2131746874, null), ob6.M0(2131746873, null), ol5.w, R.drawable.filled_poll_revote_24, a72Var.S);
                                            } else if (i == a72Var.D0) {
                                                xh8Var.a(ob6.M0(2131746878, null), ob6.M0(2131746877, null), ol5.s, R.drawable.filled_poll_add_24, a72Var.U);
                                            } else if (i == a72Var.F0) {
                                                xh8Var.a(ob6.M0(2131746849, null), ob6.M0(2131746848, null), ol5.h, R.drawable.filled_poll_shuffle_24, a72Var.T);
                                            } else if (i == a72Var.H0) {
                                                xh8Var.a(ob6.M0(2131746853, null), ob6.M0(2131746852, null), ol5.n, R.drawable.filled_poll_correct_24, a72Var.d0);
                                            } else if (i == cdcVar2.b) {
                                                xh8Var.a(ob6.M0(2131746864, null), ob6.M0(2131746863, null), ol5.e, R.drawable.filled_location, cdcVar2.a);
                                            } else if (i == cdcVar.b) {
                                                xh8Var.a(ob6.M0(2131746856, null), ob6.M0(2131746855, null), ol5.d, R.drawable.msg_folders_groups, cdcVar.a);
                                            } else if (i == a72Var.I0) {
                                                xh8Var.a(ob6.M0(2131746862, null), ob6.M0(2131746861, null), ol5.r, R.drawable.filled_poll_deadline_24, (a72Var.V == 0 && a72Var.W == 0) ? false : true);
                                                xh8Var = xh8Var;
                                                xh8Var.setDivider((a72Var.V == 0 && a72Var.W == 0) ? false : true);
                                            }
                                            xh8Var = xh8Var;
                                        }
                                        if (i == a72Var.H0) {
                                            xh8Var.getCheckBox().a.a(z8, false);
                                            break;
                                        } else if (i == a72Var.D0) {
                                            Switch checkBox = xh8Var.getCheckBox();
                                            if (!a72Var.d0 && !a72Var.b0) {
                                                z7 = false;
                                            }
                                            checkBox.a.a(z7, false);
                                            break;
                                        } else {
                                            xh8Var.getCheckBox().a.a(false, false);
                                            break;
                                        }
                                    }
                                } else {
                                    view2.requestLayout();
                                    break;
                                }
                            } else {
                                skb skbVar2 = (skb) view2;
                                if (i == a72Var.M0) {
                                    String M04 = ob6.M0(2131746872, null);
                                    ArrayList arrayList = a72Var.Q0;
                                    if (arrayList.isEmpty()) {
                                        G = ob6.M0(2131745539, null);
                                        z = false;
                                    } else if (arrayList.size() == 1) {
                                        z = false;
                                        G = ob6.i0(2131750481, (String) arrayList.get(0));
                                    } else {
                                        z = false;
                                        G = ob6.G(arrayList.size(), "PollV2AllowedCountriesListManyP", new Object[0]);
                                    }
                                    skbVar2.q(M04, G, z, true);
                                    break;
                                } else if (i == a72Var.J0) {
                                    a72Var.T(skbVar2, false);
                                    break;
                                } else {
                                    skbVar2.g(-1, aob.Zl);
                                    Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                                    Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                                    int v02 = aob.v0(aob.N6, vnbVar);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                                    drawable2.setColorFilter(new PorterDuffColorFilter(aob.v0(aob.k7, vnbVar), mode));
                                    a72Var.o1 = drawable;
                                    a72Var.p1 = drawable2;
                                    skbVar2.p(ob6.M0(z9 ? 2131743721 : 2131754464, null), new zm2(drawable, drawable2), false);
                                    skbVar2.x = 20;
                                    skbVar2.s = 58;
                                    break;
                                }
                            }
                        } else {
                            ilb ilbVar = (ilb) view2;
                            ilbVar.setFixedSize(0);
                            new zm2(new ColorDrawable(aob.v0(aob.a7, vnbVar)), aob.W0(context, R.drawable.greydivider_bottom, aob.b7)).x = true;
                            if (i == a72Var.r0) {
                                ilbVar.setText(ob6.M0(2131754465, null));
                                break;
                            } else if (i == a72Var.y0) {
                                ilbVar.setFixedSize(12);
                                ilbVar.setText(null);
                                break;
                            } else {
                                int i38 = a72Var.K - a72Var.N;
                                if (i38 <= 0) {
                                    ilbVar.setText(ob6.M0(z9 ? 2131743761 : 2131754462, null));
                                    break;
                                } else if (z9) {
                                    ilbVar.setText(ob6.H(',', "TodoNewTaskInfo", i38));
                                    break;
                                } else if (i == a72Var.L0) {
                                    ilbVar.setText(ob6.M0(2131746865, null));
                                    break;
                                } else {
                                    ilbVar.setText(ob6.a0(null, null, 2131754463, ob6.G(i38, "Option", new Object[0])));
                                    break;
                                }
                            }
                        }
                    } else {
                        wkb wkbVar = (wkb) view2;
                        if (i == a72Var.z0) {
                            wkbVar.f(ob6.M0(2131743746, null), a72Var.g0, a72Var.A0 != -1);
                            wkbVar.e(null, true);
                            break;
                        } else if (i == a72Var.A0) {
                            wkbVar.f(ob6.M0(2131743745, null), a72Var.h0, false);
                            wkbVar.e(null, true);
                            break;
                        } else if (i == a72Var.K0) {
                            wkbVar.f(ob6.M0(2131746866, null), a72Var.a0, false);
                            wkbVar.e(null, true);
                            break;
                        }
                    }
                } else {
                    mf5 mf5Var = (mf5) view2;
                    if (i == a72Var.m0) {
                        mf5Var.getTextView().setGravity(19);
                        mf5Var.setText(ob6.M0(z9 ? 2131743707 : 2131746892, null));
                        break;
                    } else if (i == a72Var.p0) {
                        mf5Var.getTextView().setGravity(19);
                        mf5Var.setText(ob6.M0(2131754466, null));
                        break;
                    } else {
                        mf5Var.getTextView().setGravity((ob6.a0 ? 5 : 3) | 16);
                        if (i == a72Var.t0) {
                            if (z8) {
                                mf5Var.setText(ob6.M0(2131746174, null));
                                break;
                            } else {
                                mf5Var.setText(ob6.M0(z9 ? 2131743725 : 2131754239, null));
                                break;
                            }
                        } else if (i == a72Var.x0) {
                            mf5Var.setText(ob6.M0(2131745223, null));
                            break;
                        }
                    }
                }
                break;
            case 2:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj2;
                int i39 = dataAutoDownloadActivity.f;
                kq3 kq3Var = dataAutoDownloadActivity.H;
                int i40 = f89Var.f;
                View view3 = f89Var.a;
                if (i40 != 0) {
                    if (i40 != 2) {
                        if (i40 != 3) {
                            if (i40 != 4) {
                                if (i40 == 5) {
                                    ilb ilbVar2 = (ilb) view3;
                                    if (i == dataAutoDownloadActivity.x) {
                                        ilbVar2.setText(ob6.M0(2131753836, null));
                                        ilbVar2.setFixedSize(0);
                                        ilbVar2.setImportantForAccessibility(1);
                                        break;
                                    } else if (i == dataAutoDownloadActivity.n) {
                                        if (dataAutoDownloadActivity.r == -1) {
                                            if (i39 == 0) {
                                                ilbVar2.setText(ob6.M0(2131753816, null));
                                            } else if (i39 == 1) {
                                                ilbVar2.setText(ob6.M0(2131753811, null));
                                            } else if (i39 == 2) {
                                                ilbVar2.setText(ob6.M0(2131753814, null));
                                            }
                                            ilbVar2.setImportantForAccessibility(1);
                                            break;
                                        } else {
                                            ilbVar2.setText(null);
                                            ilbVar2.setFixedSize(12);
                                            ilbVar2.setImportantForAccessibility(4);
                                            break;
                                        }
                                    }
                                }
                            } else {
                                uo7 uo7Var = (uo7) view3;
                                uo7Var.setDrawLine(true);
                                i4 = dataAutoDownloadActivity.photosRow;
                                if (i == i4) {
                                    M0 = ob6.M0(2131753810, null);
                                    i7 = 1;
                                } else {
                                    i5 = dataAutoDownloadActivity.videosRow;
                                    if (i == i5) {
                                        M0 = ob6.M0(2131753799, null);
                                        i7 = 4;
                                    } else {
                                        i6 = dataAutoDownloadActivity.storiesRow;
                                        if (i == i6) {
                                            M0 = ob6.M0(2131753802, null);
                                            uo7Var.setDrawLine(false);
                                            i7 = -1;
                                        } else {
                                            M0 = ob6.M0(2131753831, null);
                                            i7 = 8;
                                        }
                                    }
                                }
                                if (i39 == 0) {
                                    i15 = ((e) dataAutoDownloadActivity).currentAccount;
                                    o = lq3.q(i15).n();
                                } else if (i39 == 1) {
                                    i9 = ((e) dataAutoDownloadActivity).currentAccount;
                                    o = lq3.q(i9).p();
                                } else {
                                    i8 = ((e) dataAutoDownloadActivity).currentAccount;
                                    o = lq3.q(i8).o();
                                }
                                long j = o.b[lq3.x(i7)];
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
                                                    sb.append(ob6.M0(2131753834, null));
                                                } else if (i41 == 1) {
                                                    sb.append(ob6.M0(2131753807, null));
                                                } else if (i41 == 2) {
                                                    sb.append(ob6.M0(2131753828, null));
                                                } else if (i41 == 3) {
                                                    sb.append(ob6.M0(2131753835, null));
                                                }
                                                i11++;
                                            }
                                            i41++;
                                        } else if (i11 == 4) {
                                            sb.setLength(0);
                                            i13 = dataAutoDownloadActivity.photosRow;
                                            if (i == i13) {
                                                sb.append(ob6.M0(2131753819, null));
                                            } else {
                                                sb.append(ob6.a0("AutoDownloadUpToOnAllChats", null, 2131753800, hl.i0(j, false, false)));
                                            }
                                        } else if (i11 == 0) {
                                            sb.append(ob6.M0(2131753821, null));
                                        } else {
                                            i12 = dataAutoDownloadActivity.photosRow;
                                            sb = i == i12 ? new StringBuilder(ob6.a0("AutoDownloadOnFor", null, 2131753818, sb.toString())) : new StringBuilder(ob6.a0("AutoDownloadOnUpToFor", null, 2131753813, hl.i0(j, false, false), sb.toString()));
                                        }
                                    }
                                } else if (o.e) {
                                    sb = new StringBuilder(ob6.a0("AutoDownloadOn", null, 2131753820, sb.toString()));
                                    i11 = 1;
                                } else {
                                    sb = new StringBuilder(ob6.a0("AutoDownloadOff", null, 2131753821, sb.toString()));
                                    i11 = 0;
                                }
                                if (dataAutoDownloadActivity.h) {
                                    uo7Var.setChecked(i11 != 0);
                                }
                                boolean z10 = i11 != 0;
                                i14 = dataAutoDownloadActivity.storiesRow;
                                uo7Var.b(M0, sb, 0, z10, 0, true, i != i14, false);
                                break;
                            }
                        } else {
                            dataAutoDownloadActivity.q0((zma) view3);
                            break;
                        }
                    } else {
                        mf5 mf5Var2 = (mf5) view3;
                        if (i == dataAutoDownloadActivity.r) {
                            mf5Var2.setText(ob6.M0(2131753832, null));
                            break;
                        } else if (i == dataAutoDownloadActivity.w) {
                            mf5Var2.setText(ob6.M0(2131753801, null));
                            break;
                        }
                    }
                } else {
                    wkb wkbVar2 = (wkb) view3;
                    i3 = dataAutoDownloadActivity.autoDownloadRow;
                    if (i == i3) {
                        wkbVar2.setDrawCheckRipple(true);
                        wkbVar2.f(ob6.M0(2131753823, null), kq3Var.g, false);
                        wkbVar2.setTag(Integer.valueOf(kq3Var.g ? aob.f6 : aob.e6));
                        yob.h(kq3Var.g ? aob.f6 : aob.e6, null, wkbVar2);
                        break;
                    }
                }
                break;
            case 3:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj2;
                int i42 = f89Var.f;
                View view4 = f89Var.a;
                switch (i42) {
                    case 1:
                        qmb qmbVar2 = (qmb) view4;
                        qmbVar2.setCanDisable(false);
                        yob.X(qmbVar2.getTextView(), aob.G6, null);
                        i16 = dataSettingsActivity.useLessDataForCallsRow;
                        if (i == i16) {
                            qmbVar2.setIcon(0);
                            int i43 = uc7.e1().getInt("VoipDataSaving", xkc.c());
                            qmbVar2.c(ob6.M0(2131742881, null), i43 != 0 ? i43 != 1 ? i43 != 2 ? i43 != 3 ? null : ob6.M0(2131743448, null) : ob6.M0(2131743451, null) : ob6.M0(2131743449, null) : ob6.M0(2131743450, null), dataSettingsActivity.V, true);
                            dataSettingsActivity.V = false;
                            break;
                        } else {
                            i17 = dataSettingsActivity.proxyRow;
                            if (i == i17) {
                                qmbVar2.setIcon(0);
                                qmbVar2.b(ob6.M0(2131746328, null), false);
                                break;
                            } else {
                                i18 = dataSettingsActivity.resetDownloadRow;
                                if (i == i18) {
                                    qmbVar2.setIcon(0);
                                    qmbVar2.setCanDisable(true);
                                    yob.X(qmbVar2.getTextView(), aob.p7, null);
                                    qmbVar2.b(ob6.M0(2131745838, null), false);
                                    break;
                                } else {
                                    i19 = dataSettingsActivity.clearDraftsRow;
                                    if (i == i19) {
                                        qmbVar2.setIcon(0);
                                        qmbVar2.b(ob6.M0(2131746570, null), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        mf5 mf5Var3 = (mf5) view4;
                        if (i == dataSettingsActivity.d) {
                            mf5Var3.setText(ob6.M0(2131753760, null));
                            break;
                        } else if (i == 0) {
                            mf5Var3.setText(ob6.M0(2131751641, null));
                            break;
                        } else if (i == dataSettingsActivity.N) {
                            mf5Var3.setText(ob6.M0(2131752577, null));
                            break;
                        } else if (i == dataSettingsActivity.P) {
                            mf5Var3.setText(ob6.M0(2131746338, null));
                            break;
                        } else if (i == dataSettingsActivity.y) {
                            mf5Var3.setText(ob6.M0(2131744091, null));
                            break;
                        } else if (i == dataSettingsActivity.J) {
                            mf5Var3.setText(ob6.M0(2131753757, null));
                            break;
                        } else if (i == dataSettingsActivity.S) {
                            mf5Var3.setText(ob6.M0(2131745646, null));
                            break;
                        }
                        break;
                    case 3:
                        wkb wkbVar3 = (wkb) view4;
                        if (i == dataSettingsActivity.E) {
                            wkbVar3.f(ob6.M0(2131751109, null), xea.x0, dataSettingsActivity.G != -1);
                            break;
                        } else if (i != dataSettingsActivity.F) {
                            if (i == dataSettingsActivity.H) {
                                wkbVar3.f("(beta only) Show MKV as Video", xea.z0, true);
                                break;
                            } else if (i == dataSettingsActivity.G) {
                                wkbVar3.f("(beta only) Stream All Videos", xea.y0, false);
                                break;
                            } else if (i == dataSettingsActivity.K) {
                                String M05 = ob6.M0(2131753758, null);
                                boolean z11 = xea.a;
                                wkbVar3.f(M05, i86.e(2048), true);
                                break;
                            } else if (i == dataSettingsActivity.L) {
                                String M06 = ob6.M0(2131753756, null);
                                boolean z12 = xea.a;
                                wkbVar3.f(M06, i86.e(1024), false);
                                break;
                            }
                        }
                        break;
                    case 4:
                        ilb ilbVar3 = (ilb) view4;
                        if (i == dataSettingsActivity.I) {
                            ilbVar3.setText(ob6.M0(2131751123, null));
                            break;
                        }
                        break;
                    case 5:
                        uo7 uo7Var2 = (uo7) view4;
                        i20 = dataSettingsActivity.saveToGalleryPeerRow;
                        if (i == i20) {
                            M03 = ob6.M0(2131745647, null);
                            kt9 kt9Var = eye.a;
                            i32 = ((e) dataSettingsActivity).currentAccount;
                            c = kt9Var.c(i32);
                            a = eye.a.a();
                        } else {
                            i21 = dataSettingsActivity.saveToGalleryGroupsRow;
                            if (i == i21) {
                                M03 = ob6.M0(2131745654, null);
                                kt9 kt9Var2 = eye.b;
                                i31 = ((e) dataSettingsActivity).currentAccount;
                                c = kt9Var2.c(i31);
                                a = eye.b.a();
                            } else {
                                i22 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (i == i22) {
                                    M03 = ob6.M0(2131745656, null);
                                    kt9 kt9Var3 = eye.c;
                                    i30 = ((e) dataSettingsActivity).currentAccount;
                                    c = kt9Var3.c(i30);
                                    z3 = eye.c.a();
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
                                                    sb2.append(ob6.M0(2131747928, null));
                                                } else {
                                                    if (z13) {
                                                        sb2.append(ob6.M0(2131753809, null));
                                                    }
                                                    if (z14) {
                                                        if (sb2.length() > 0) {
                                                            sb2.append(", ");
                                                        }
                                                        sb2.append(ob6.M0(2131753798, null));
                                                        sb2.append(String.format(" (%1$s)", hl.i0(jArr[1], true, false)));
                                                    }
                                                    if (z15) {
                                                        if (sb2.length() > 0) {
                                                            sb2.append(", ");
                                                        }
                                                        sb2.append(ob6.M0(2131753830, null));
                                                        sb2.append(String.format(" (%1$s)", hl.i0(jArr[lq3.x(8)], true, false)));
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
                                    uo7Var2.setAnimationsEnabled(true);
                                    uo7Var2.b(str, charSequence2, 0, z3, 0, true, z2, false);
                                    break;
                                } else {
                                    if (i == dataSettingsActivity.e) {
                                        M02 = ob6.M0(2131742515, null);
                                        i28 = ((e) dataSettingsActivity).currentAccount;
                                        z4 = lq3.q(i28).N.g;
                                        i29 = ((e) dataSettingsActivity).currentAccount;
                                        o2 = lq3.q(i29).n();
                                    } else if (i == dataSettingsActivity.h) {
                                        M02 = ob6.M0(2131742517, null);
                                        i26 = ((e) dataSettingsActivity).currentAccount;
                                        z4 = lq3.q(i26).O.g;
                                        i27 = ((e) dataSettingsActivity).currentAccount;
                                        o2 = lq3.q(i27).p();
                                    } else {
                                        M02 = ob6.M0(2131742516, null);
                                        i23 = ((e) dataSettingsActivity).currentAccount;
                                        boolean z17 = lq3.q(i23).P.g;
                                        i24 = ((e) dataSettingsActivity).currentAccount;
                                        o2 = lq3.q(i24).o();
                                        i25 = dataSettingsActivity.resetDownloadRow;
                                        z2 = i25 >= 0;
                                        z3 = z17;
                                        str = M02;
                                        charSequence = null;
                                        if (o2 == null) {
                                        }
                                        uo7Var2.setAnimationsEnabled(true);
                                        uo7Var2.b(str, charSequence2, 0, z3, 0, true, z2, false);
                                    }
                                    z3 = z4;
                                    z2 = true;
                                    str = M02;
                                    charSequence = null;
                                    if (o2 == null) {
                                    }
                                    uo7Var2.setAnimationsEnabled(true);
                                    uo7Var2.b(str, charSequence2, 0, z3, 0, true, z2, false);
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
                        uo7Var2.setAnimationsEnabled(true);
                        uo7Var2.b(str, charSequence2, 0, z3, 0, true, z2, false);
                        break;
                    case 6:
                        skb skbVar3 = (skb) view4;
                        if (i == dataSettingsActivity.s) {
                            if (dataSettingsActivity.X) {
                                skbVar3.r(ob6.M0(2131744473, null), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                                skbVar = skbVar3;
                                skbVar.h(45, true, dataSettingsActivity.W);
                            } else {
                                skbVar = skbVar3;
                                String M07 = ob6.M0(2131744473, null);
                                long j2 = dataSettingsActivity.Y;
                                skbVar.r(M07, j2 <= 0 ? "" : hl.i0(j2, false, false), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                                skbVar.h(45, false, dataSettingsActivity.W);
                            }
                            dataSettingsActivity.W = false;
                        } else {
                            skbVar = skbVar3;
                            if (i == dataSettingsActivity.w) {
                                i33 = ((e) dataSettingsActivity).currentAccount;
                                a2b c4 = a2b.c(i33);
                                skbVar.r(ob6.M0(2131748052, null), hl.i0(c4.e(2, 6) + c4.e(1, 6) + c4.e(0, 6) + c4.d(2, 6) + c4.d(1, 6) + c4.d(0, 6), false, false), true, R.drawable.msg_filled_datausage, -11154873, -14175180, false);
                            } else {
                                if (i == dataSettingsActivity.n) {
                                    String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
                                    if (!TextUtils.isEmpty(xea.e0)) {
                                        int size = dataSettingsActivity.c.size();
                                        while (true) {
                                            if (i35 < size) {
                                                String absolutePath2 = ((File) dataSettingsActivity.c.get(i35)).getAbsolutePath();
                                                if (absolutePath2.startsWith(xea.e0)) {
                                                    absolutePath = absolutePath2;
                                                } else {
                                                    i35++;
                                                }
                                            }
                                        }
                                    }
                                    skbVar.r(ob6.M0(2131744477, null), ob6.M0((absolutePath == null || absolutePath.contains("/storage/emulated/")) ? 2131748942 : 2131745568, null), true, R.drawable.msg_filled_sdcard, -1007845, -1996271, false);
                                }
                                skbVar = skbVar;
                            }
                        }
                        skbVar.setOffsetFromImage(64);
                        break;
                }
            case 4:
                dg4 dg4Var = (dg4) f89Var.a;
                int id = dg4Var.b != null ? dg4Var.getId() : -1;
                bg4 bg4Var = (bg4) ((fg4) obj2).h.get(i);
                dg4Var.b = bg4Var;
                dg4Var.e = i;
                dg4Var.setContentDescription(bg4Var.b);
                dg4Var.requestLayout();
                boolean z18 = dg4Var.n;
                bg4 bg4Var2 = dg4Var.b;
                if (z18 != (bg4Var2 != null && bg4Var2.g)) {
                    hm.release(dg4Var, dg4Var.r);
                    hm.release(dg4Var, dg4Var.P);
                    hm.release(dg4Var, dg4Var.R);
                    hm.release(dg4Var, dg4Var.T);
                    if (dg4Var.m0) {
                        dg4Var.r = hm.update(dg4Var.b.g ? 26 : 0, dg4Var, dg4Var.r, dg4Var.s);
                        dg4Var.P = hm.update(dg4Var.b.g ? 26 : 0, dg4Var, dg4Var.P, dg4Var.Q);
                        dg4Var.R = hm.update(dg4Var.b.g ? 26 : 0, dg4Var, dg4Var.R, dg4Var.S);
                        dg4Var.T = hm.update(dg4Var.b.g ? 26 : 0, dg4Var, dg4Var.T, dg4Var.U);
                    }
                    dg4Var.n = dg4Var.b.g;
                }
                if (id != dg4Var.getId()) {
                    dg4Var.l0 = dg4Var.b.f ? 1.0f : 0.0f;
                    break;
                }
                break;
            case 5:
                Activity activity = (Activity) obj;
                hx0 hx0Var = (hx0) f89Var.a;
                ah4 ah4Var = (ah4) obj2;
                ArrayList arrayList2 = ah4Var.v1;
                ArrayList arrayList3 = ah4Var.u1;
                if (i < arrayList3.size()) {
                    yob.s(hx0Var.getImageView(), aob.J5, null, PorterDuff.Mode.MULTIPLY);
                    ac7 ac7Var = (ac7) arrayList3.get(i);
                    yob.X(hx0Var.getTextView(), aob.j5, null);
                    int i46 = ac7Var.g;
                    int i47 = uc7.t5;
                    int i48 = i46 & 31;
                    hx0Var.a(r47.A5(pv3.m(ac7Var.b, hx0Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0), ac7Var.c, hx0Var.getTextView().getPaint().getFontMetricsInt(), false), 0, new pb2(ah4Var.getContext(), i48 == 3 ? R.drawable.msg_openprofile : ((i46 & 64) == 0 || i48 != 31) ? i48 == 8 ? R.drawable.msg_channel : i48 == 4 ? R.drawable.msg_groups : i48 == 1 ? R.drawable.msg_contacts : i48 == 16 ? R.drawable.msg_bots : R.drawable.msg_folders : R.drawable.msg_markunread, ac7Var.m), false);
                    hx0Var.getTextView().setEmojiColor(aob.v0(aob.Fi, ah4Var.J0));
                    for (int i49 = 0; i49 < arrayList2.size(); i49++) {
                        if (!ac7Var.a(k5.a(ah4Var.a), ((Long) arrayList2.get(i49)).longValue())) {
                            z7 = false;
                        }
                    }
                    hx0Var.setChecked(z7);
                    break;
                } else {
                    hx0Var.getImageView().setColorFilter((ColorFilter) null);
                    Drawable drawable3 = activity.getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable4 = activity.getResources().getDrawable(R.drawable.poll_add_plus);
                    ImageView imageView = hx0Var.getImageView();
                    int i50 = aob.N6;
                    PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                    yob.x(imageView, drawable3, i50, null, mode2);
                    yob.x(hx0Var.getImageView(), drawable4, aob.k7, null, mode2);
                    zm2 zm2Var = new zm2(drawable3, drawable4);
                    yob.X(hx0Var.getTextView(), aob.q6, null);
                    hx0Var.a(ob6.M0(2131751681, null), 0, zm2Var, false);
                    break;
                }
                break;
            case 6:
                View view5 = f89Var.a;
                dl4 dl4Var = (dl4) ((ll4) obj2).F.get(i);
                int i51 = dl4Var.b;
                rn rnVar = dl4Var.f;
                String str2 = dl4Var.a;
                int F = ik8.F(i51);
                if (F != 0) {
                    if (F != 1) {
                        if (F == 2) {
                            kl4 kl4Var = (kl4) view5;
                            kl4Var.f = str2.toString();
                            kl4Var.d = ((Float) rnVar.get(null)).floatValue();
                            kl4Var.b = dl4Var.d;
                            kl4Var.c = dl4Var.e;
                            kl4Var.e = rnVar;
                            kl4Var.invalidate();
                            break;
                        }
                    } else {
                        mf5 mf5Var4 = (mf5) view5;
                        mf5Var4.setTextColor(aob.w0(null, aob.L6, false));
                        mf5Var4.setText(str2);
                        break;
                    }
                } else {
                    bd bdVar = (bd) view5;
                    bdVar.setTextColor(aob.w0(null, aob.j5, false));
                    bdVar.a(0, str2);
                    break;
                }
                break;
            case 7:
                th6 th6Var = (th6) obj2;
                int i52 = f89Var.f;
                View view6 = f89Var.a;
                if (i52 != 0) {
                    if (i52 != 1) {
                        if (i52 != 3) {
                            if (i52 == 4) {
                                ilb ilbVar4 = (ilb) view6;
                                if (i == th6Var.s) {
                                    ilbVar4.setText(ob6.M0(2131748496, null));
                                    break;
                                }
                            }
                        } else {
                            qmb qmbVar3 = (qmb) view6;
                            if (i == th6Var.r) {
                                yob.X(qmbVar3.getTextView(), aob.p7, null);
                                qmbVar3.b(ob6.M0(2131748495, null), false);
                                break;
                            }
                        }
                    } else {
                        dlb dlbVar = (dlb) view6;
                        if (i == th6Var.c) {
                            dlbVar.b(R.drawable.msg_contact_add, ob6.M0(2131754461, null), ob6.M0(2131754460, null), true);
                            break;
                        } else if (i == th6Var.d) {
                            dlbVar.b(R.drawable.msg_permissions, ob6.M0(2131745249, null), ob6.M0(2131745248, null), true);
                            break;
                        } else if (i == th6Var.e) {
                            dlbVar.b(R.drawable.msg_clearcache, ob6.M0(2131752063, null), ob6.M0(2131752059, null), true);
                            break;
                        } else if (i == th6Var.f) {
                            dlbVar.b(R.drawable.msg_newphone, ob6.M0(2131752518, null), ob6.M0(2131752517, null), true);
                            break;
                        } else if (i == th6Var.h) {
                            dlbVar.b(R.drawable.msg_help, ob6.M0(2131751748, null), ob6.M0(2131751747, null), false);
                            break;
                        }
                    }
                } else {
                    mf5 mf5Var5 = (mf5) view6;
                    if (i == 0) {
                        mf5Var5.setText(ob6.M0(2131754263, null));
                        break;
                    }
                }
                break;
            case 8:
                G(f89Var, i);
                break;
            case 9:
                H(f89Var, i);
                break;
            case 10:
                o98 o98Var = (o98) f89Var.a;
                w78 w78Var = (w78) obj2;
                o98Var.setAlbumsCount(w78Var.f);
                while (true) {
                    byte b2 = w78Var.f;
                    if (i34 >= b2) {
                        o98Var.requestLayout();
                        break;
                    } else {
                        int i53 = (b2 * i) + i34;
                        if (i53 < w78Var.d.size()) {
                            o98Var.a(i34, (do6) w78Var.d.get(i53));
                        } else {
                            o98Var.a(i34, null);
                        }
                        i34++;
                    }
                }
            case 11:
                I(f89Var, i);
                break;
            case 12:
                J(f89Var, i);
                break;
            case 13:
                K(f89Var, i);
                break;
            case 14:
                L(f89Var, i);
                break;
            case 15:
                M(f89Var, i);
                break;
            case 16:
                N(f89Var, i);
                break;
            case 17:
                O(f89Var, i);
                break;
            default:
                sic sicVar = (sic) f89Var.a;
                uic uicVar = (uic) obj2;
                ric ricVar = (ric) uicVar.h.get(i);
                sicVar.a = ricVar;
                sicVar.setContentDescription(ricVar.b);
                sicVar.setAlpha(1.0f);
                sicVar.requestLayout();
                if (uicVar.n0 && (ticVar = uicVar.E) != null && ticVar.A(i)) {
                    z5 = true;
                }
                sicVar.setReordering(z5);
                break;
        }
    }

    @Override // j79
    public final void u(f89 f89Var, int i, List list) {
        int i2;
        boolean contains;
        switch (this.c) {
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                ArrayList arrayList = proxyListActivity.F;
                int i3 = f89Var.f;
                View view = f89Var.a;
                if (i3 == 5 && !list.isEmpty()) {
                    hx8 hx8Var = (hx8) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i - proxyListActivity.n))) != hx8Var.h) {
                        hx8Var.h = contains;
                        hx8Var.f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        hx8Var.a(!arrayList.isEmpty(), true);
                        break;
                    }
                } else if (f89Var.f != 3 || !list.contains(0)) {
                    t(f89Var, i);
                    break;
                } else {
                    wkb wkbVar = (wkb) view;
                    i2 = proxyListActivity.useProxyRow;
                    if (i != i2) {
                        if (i == proxyListActivity.w) {
                            wkbVar.setChecked(xea.W0);
                            break;
                        }
                    } else {
                        wkbVar.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
            default:
                super.u(f89Var, i, list);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [u62] */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        View mf5Var;
        View view;
        FrameLayout frameLayout2;
        View view2;
        View mf5Var2;
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        vnb vnbVar4;
        vnb vnbVar5;
        View wkbVar;
        l88 l88Var;
        ViewGroup viewGroup2;
        View scaVar;
        FrameLayout frameLayout3;
        byte b = this.c;
        byte b2 = 6;
        byte b3 = 17;
        byte b4 = 4;
        byte b5 = 3;
        Object obj = this.e;
        final byte b6 = 2;
        final byte b7 = 1;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                Context context = (Context) obj2;
                if (i == 0) {
                    frameLayout = new mf5(context);
                } else if (i == 1) {
                    frameLayout = new wkb(context);
                } else if (i == 2) {
                    qmb qmbVar = new qmb(context);
                    qmbVar.setCanDisable(true);
                    frameLayout = qmbVar;
                } else {
                    frameLayout = new ilb(context);
                }
                frameLayout.setLayoutParams(new r79(-1, -2));
                return new n69(frameLayout);
            case 1:
                Context context2 = (Context) obj2;
                a72 a72Var = (a72) obj;
                boolean z = a72Var.n;
                vnb vnbVar6 = a72Var.a;
                switch (i) {
                    case 0:
                        mf5Var = new mf5((Context) obj2, aob.L6, 21, 15, false, a72Var.a);
                        break;
                    case 1:
                        View scaVar2 = new sca(context2, (uh9) null);
                        new zm2(new ColorDrawable(aob.v0(aob.a7, vnbVar6)), aob.W0(context2, R.drawable.greydivider, aob.b7)).x = true;
                        mf5Var = scaVar2;
                        break;
                    case 2:
                        mf5Var = new ilb(context2, vnbVar6);
                        break;
                    case 3:
                        mf5Var = new skb(context2, vnbVar6);
                        break;
                    case 4:
                    case 11:
                        v62 v62Var = new v62(this, (Context) obj2, a72Var.J ? 1 : 0, a72Var.a, i);
                        if (i == 11 && !z) {
                            v62Var.setTextRight(98);
                            yg8 b8 = v62Var.b();
                            final boolean z2 = false ? 1 : 0;
                            b8.setOnClickListener(new View.OnClickListener(this) { // from class: u62
                                public final /* synthetic */ t20 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    byte b9 = z2;
                                    t20 t20Var = this.b;
                                    switch (b9) {
                                        case 0:
                                            ((a72) t20Var.e).d0(-2);
                                            break;
                                        case 1:
                                            ((a72) t20Var.e).d0(-3);
                                            break;
                                        default:
                                            ((a72) t20Var.e).W(view3, (zh8) view3.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        v62Var.e();
                        v62Var.setIconsColor(aob.o7);
                        v62Var.c(new w62(this, v62Var, i));
                        mf5Var = v62Var;
                        break;
                    case 5:
                    default:
                        y62 y62Var = new y62(this, (Context) obj2, a72Var.J ? 1 : 0, new View.OnClickListener(this) { // from class: u62
                            public final /* synthetic */ t20 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                byte b9 = b6;
                                t20 t20Var = this.b;
                                switch (b9) {
                                    case 0:
                                        ((a72) t20Var.e).d0(-2);
                                        break;
                                    case 1:
                                        ((a72) t20Var.e).d0(-3);
                                        break;
                                    default:
                                        ((a72) t20Var.e).W(view3, (zh8) view3.getParent(), true);
                                        break;
                                }
                            }
                        }, a72Var.a);
                        if (!z) {
                            y62Var.setTextRight(jn7.V1);
                            y62Var.b().setOnClickListener(new sb1((Object) this, (Object) y62Var, (byte) 12));
                        }
                        int i2 = aob.o7;
                        y62Var.setIconsColor(i2);
                        og2 og2Var = y62Var.r;
                        if (og2Var != null) {
                            og2Var.getCheckBoxBase().i(hl.L(6.0f));
                            CheckBoxBase checkBoxBase = og2Var.getCheckBoxBase();
                            float f = y62Var.a.e;
                            if (checkBoxBase.w != f) {
                                checkBoxBase.w = f;
                                checkBoxBase.b();
                            }
                        }
                        y62Var.getCheckBox().b(-1, i2, aob.k7);
                        y62Var.c(new ry(this, y62Var, b6));
                        y62Var.setShowNextButton(true);
                        EditTextBoldCursor textView = y62Var.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new hf(this, y62Var, b6));
                        textView.setOnKeyListener(new x6(y62Var, b6));
                        mf5Var = y62Var;
                        break;
                    case 6:
                        mf5Var = new wkb(context2, vnbVar6);
                        break;
                    case 7:
                        x62 x62Var = new x62(this, context2, a72Var.J ? 1 : 0);
                        x62Var.e();
                        if (!z) {
                            x62Var.setTextRight(98);
                            x62Var.b().setOnClickListener(new View.OnClickListener(this) { // from class: u62
                                public final /* synthetic */ t20 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    byte b9 = b7;
                                    t20 t20Var = this.b;
                                    switch (b9) {
                                        case 0:
                                            ((a72) t20Var.e).d0(-2);
                                            break;
                                        case 1:
                                            ((a72) t20Var.e).d0(-3);
                                            break;
                                        default:
                                            ((a72) t20Var.e).W(view3, (zh8) view3.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        x62Var.setIconsColor(aob.o7);
                        x62Var.c(new ry(this, x62Var, b7));
                        mf5Var = x62Var;
                        break;
                    case 8:
                        View t62Var = new t62(context2, false ? 1 : 0);
                        t62Var.setTag(-33024);
                        mf5Var = t62Var;
                        break;
                    case 9:
                        View tbVar = new tb(b2, context2, this);
                        tbVar.setTag(-33024);
                        mf5Var = tbVar;
                        break;
                    case 10:
                        xh8 xh8Var = new xh8(context2, vnbVar6);
                        xh8Var.getCheckBox().setIcon(R.drawable.permission_locked);
                        mf5Var = xh8Var;
                        break;
                }
                return qu6.h(mf5Var, mf5Var, -1, -2);
            case 2:
                Context context3 = (Context) obj2;
                if (i == 0) {
                    wkb wkbVar2 = new wkb(context3);
                    wkbVar2.d(aob.g6, aob.O6, aob.P6, aob.Q6, aob.R6);
                    wkbVar2.setTypeface(hl.o());
                    wkbVar2.setHeight(56);
                    view = wkbVar2;
                } else if (i == 1) {
                    view = new sca(context3, (uh9) null);
                } else if (i == 2) {
                    view = new mf5(context3);
                } else if (i != 3) {
                    view = i != 4 ? new ilb(context3) : new uo7(context3);
                } else {
                    zma zmaVar = new zma(context3, null);
                    zmaVar.setCallback(new ht2(this, (byte) 14));
                    view = zmaVar;
                }
                return qu6.h(view, view, -1, -2);
            case 3:
                Context context4 = (Context) obj2;
                View skbVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new skb(context4) : new uo7(context4) : new ilb(context4) : new wkb(context4) : new mf5(context4, 22) : new qmb(context4) : new sca(context4, (uh9) null);
                return qu6.h(skbVar, skbVar, -1, -2);
            case 4:
                return new n69(new dg4((fg4) obj, (Context) obj2));
            case 5:
                hx0 hx0Var = new hx0(0, null, (Activity) obj2);
                hx0Var.setBackground(null);
                hx0Var.setLayoutParams(new r79(-1, -2));
                return new n69(hx0Var);
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                int F = ik8.F(ik8.G(3)[i]);
                if (F == 1) {
                    frameLayout2 = new mf5(launchActivity);
                } else if (F != 2) {
                    frameLayout2 = new bd(launchActivity, null);
                } else {
                    kl4 kl4Var = new kl4(launchActivity);
                    kl4Var.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    kl4Var.h = textPaint;
                    textPaint.setTextSize(hl.L(16.0f));
                    uy9 uy9Var = new uy9(launchActivity);
                    kl4Var.a = uy9Var;
                    uy9Var.setReportChanges(true);
                    uy9Var.setDelegate(new aj3((Object) kl4Var, (byte) 5));
                    uy9Var.setImportantForAccessibility(2);
                    kl4Var.addView(uy9Var, tre.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout2 = kl4Var;
                }
                frameLayout2.setLayoutParams(new r79(-1, -2));
                return new n69(frameLayout2);
            case 7:
                Context context5 = (Context) obj2;
                if (i == 0) {
                    View mf5Var3 = new mf5(context5);
                    yob.h(aob.d6, null, mf5Var3);
                    view2 = mf5Var3;
                } else if (i == 1) {
                    dlb dlbVar = new dlb(context5);
                    dlbVar.setMultilineDetail(true);
                    yob.h(aob.d6, null, dlbVar);
                    view2 = dlbVar;
                } else if (i == 2) {
                    view2 = new sca(context5, (uh9) null);
                } else if (i != 3) {
                    view2 = new ilb(context5);
                } else {
                    View qmbVar2 = new qmb(context5);
                    yob.h(aob.d6, null, qmbVar2);
                    view2 = qmbVar2;
                }
                return qu6.h(view2, view2, -1, -2);
            case 8:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context6 = (Context) obj2;
                if (i == 0) {
                    vnbVar = ((e) notificationsSettingsActivity).resourceProvider;
                    mf5Var2 = new mf5(context6, vnbVar);
                } else if (i == 1) {
                    vnbVar2 = ((e) notificationsSettingsActivity).resourceProvider;
                    mf5Var2 = new wkb(context6, vnbVar2);
                } else if (i == 2) {
                    mf5Var2 = new dlb(context6);
                } else if (i == 3) {
                    vnbVar3 = ((e) notificationsSettingsActivity).resourceProvider;
                    mf5Var2 = new uo7((Context) obj2, 21, 64, true, vnbVar3);
                } else if (i == 4) {
                    mf5Var2 = new sca(context6, (uh9) null);
                } else if (i != 5) {
                    vnbVar5 = ((e) notificationsSettingsActivity).resourceProvider;
                    mf5Var2 = new ilb(context6, vnbVar5);
                } else {
                    vnbVar4 = ((e) notificationsSettingsActivity).resourceProvider;
                    mf5Var2 = new qmb(0, vnbVar4, context6);
                }
                return new n69(mf5Var2);
            case 9:
                Context context7 = (Context) obj2;
                if (i == 0) {
                    wkbVar = new wkb(context7);
                } else if (i == 1) {
                    wkbVar = new qmb(context7);
                } else if (i == 3) {
                    wkbVar = new mf5(context7);
                } else if (i != 4) {
                    wkbVar = new ilb(context7);
                } else {
                    wkbVar = new sy7(context7);
                    wkbVar.setTag(-33024);
                }
                return new n69(wkbVar);
            case 10:
                Context context8 = (Context) obj2;
                o98 o98Var = new o98(context8);
                o98Var.e = new Paint();
                o98Var.b = new do6[4];
                o98Var.a = new m98[4];
                for (int i3 = 0; i3 < 4; i3++) {
                    o98Var.a[i3] = new m98(o98Var, context8);
                    o98Var.addView(o98Var.a[i3]);
                    o98Var.a[i3].setVisibility(4);
                    o98Var.a[i3].setTag(Integer.valueOf(i3));
                    o98Var.a[i3].setOnClickListener(new am7(o98Var, (byte) 15));
                }
                o98Var.setDelegate(new jz7(this, b5));
                return new n69(o98Var);
            case 11:
                Context context9 = (Context) obj2;
                if (i == 0) {
                    vnb vnbVar7 = ((c98) obj).J0;
                    o88 o88Var = new o88(context9);
                    o88Var.e = new li7(o88Var, (byte) 7);
                    TextView textView2 = new TextView(context9);
                    o88Var.a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    o88Var.addView(textView2, tre.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context9);
                    o88Var.b = textView3;
                    yob.X(textView3, aob.qg, vnbVar7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    o88Var.addView(textView3, tre.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    q88 q88Var = new q88(context9);
                    Paint paint = new Paint();
                    q88Var.a = paint;
                    Paint paint2 = new Paint(1);
                    q88Var.b = paint2;
                    q88Var.c = hl.L(16.0f);
                    q88Var.d = 0;
                    q88Var.e = 0.0f;
                    q88Var.f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    o88Var.c = q88Var;
                    o88Var.addView(q88Var, tre.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    o88Var.setSeekBarDelegate(new jz7(this, b4));
                    l88Var = o88Var;
                } else {
                    l88 l88Var2 = new l88(context9);
                    l88Var2.setOnClickListener(new am7(this, (byte) 13));
                    l88Var = l88Var2;
                }
                return new n69(l88Var);
            case 12:
                l98 l98Var = (l98) obj;
                boolean z3 = l98Var.s0;
                Context context10 = (Context) obj2;
                if (i == 0) {
                    d88 d88Var = new d88(context10, null);
                    d88Var.setDelegate(new i98(this));
                    d88Var.getCheckFrame().setVisibility(l98Var.U == 0 ? (byte) 0 : (byte) 8);
                    viewGroup2 = d88Var;
                } else if (i == 1) {
                    ViewGroup frameLayout4 = new FrameLayout(context10);
                    frameLayout4.setLayoutParams(new r79(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(context10, null);
                    radialProgressView.setProgressColor(-11371101);
                    frameLayout4.addView(radialProgressView, tre.c(-1.0f, -1));
                    viewGroup2 = frameLayout4;
                } else if (i == 2) {
                    viewGroup2 = new zea(1, null, context10);
                } else if (i != 3) {
                    hp3 hp3Var = new hp3(context10, null);
                    hp3Var.setForceDarkTheme(z3);
                    viewGroup2 = hp3Var;
                } else {
                    skb skbVar2 = new skb(23, context10, true);
                    skbVar2.setLayoutParams(new r79(-1, -2));
                    viewGroup2 = skbVar2;
                    if (z3) {
                        yob.W(skbVar2.a, l98Var.w0, null);
                        yob.s(skbVar2.e, aob.ih, null, PorterDuff.Mode.MULTIPLY);
                        viewGroup2 = skbVar2;
                    }
                }
                return new n69(viewGroup2);
            case 13:
                Context context11 = (Context) obj2;
                p98 p98Var = new p98(context11);
                p98Var.setWillNotDraw(false);
                de0 de0Var = new de0(context11);
                p98Var.a = de0Var;
                de0Var.setRoundRadius(hl.L(4.0f));
                p98Var.addView(de0Var, tre.c(-1.0f, -1));
                FrameLayout frameLayout5 = new FrameLayout(context11);
                p98Var.b = frameLayout5;
                p98Var.addView(frameLayout5, tre.e(42, 42, 53));
                jo0 jo0Var = new jo0(context11);
                jo0Var.c = new Path();
                jo0Var.b = new float[8];
                jo0Var.d = new RectF();
                jo0Var.e = new Paint(1);
                p98Var.e = jo0Var;
                jo0Var.setWillNotDraw(false);
                jo0Var.setPadding(hl.L(3.0f), 0, hl.L(3.0f), 0);
                p98Var.addView(jo0Var, tre.e(-1, 16, 83));
                jo0Var.addView(qd4.k(context11, R.drawable.ic_video), tre.e(-2, -2, 19));
                TextView textView4 = new TextView(context11);
                p98Var.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                jo0Var.addView(textView4, tre.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                og2 og2Var2 = new og2(24, null, context11);
                p98Var.c = og2Var2;
                og2Var2.setDrawBackgroundAsArc(11);
                og2Var2.b(aob.W9, aob.X9, aob.V9);
                p98Var.addView(og2Var2, tre.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                og2Var2.setVisibility(0);
                p98Var.setFocusable(true);
                frameLayout5.setOnClickListener(new am7(this, b3));
                return new n69(p98Var);
            case 14:
                Context context12 = (Context) obj2;
                if (i == 0) {
                    scaVar = new sca(context12, (uh9) null);
                } else if (i == 1) {
                    scaVar = new qmb(context12);
                    yob.h(aob.d6, null, scaVar);
                } else if (i == 2) {
                    scaVar = new mf5(context12);
                    yob.h(aob.d6, null, scaVar);
                } else if (i == 3) {
                    scaVar = new wkb(context12);
                    yob.h(aob.d6, null, scaVar);
                } else if (i == 4) {
                    scaVar = new ilb(context12);
                } else if (i != 6) {
                    scaVar = new hx8((ProxyListActivity) obj, context12);
                    yob.h(aob.d6, null, scaVar);
                } else {
                    scaVar = new zma(context12, null);
                    yob.h(aob.d6, null, scaVar);
                }
                return qu6.h(scaVar, scaVar, -1, -2);
            case 15:
                Context context13 = (Context) obj2;
                dka dkaVar = (dka) obj;
                if (i != 0) {
                    FrameLayout ir8Var = new ir8(context13, r10);
                    ir8Var.setWillNotDraw(false);
                    TextView textView5 = new TextView(context13);
                    dkaVar.o1 = textView5;
                    yob.X(textView5, aob.J5, dkaVar.J0);
                    dkaVar.o1.setTextSize(1, 14.0f);
                    dkaVar.o1.setGravity(17);
                    dkaVar.o1.setPadding(0, 0, 0, hl.L(8.0f));
                    ir8Var.addView(dkaVar.o1, tre.c(40.0f, -1));
                    frameLayout3 = ir8Var;
                } else {
                    frameLayout3 = new aka(54, dkaVar.J0, context13, false);
                }
                return new n69(frameLayout3);
            case 16:
                return new n69(new yeb((zeb) obj, ((zeb) obj2).getContext()));
            case 17:
                Context context14 = (Context) obj2;
                View of3Var = i == 0 ? new of3(context14, false) : new ua6(context14);
                of3Var.setLayoutParams(new r79(-1, -2));
                return new n69(of3Var);
            default:
                return new n69(new sic((uic) obj, (Context) obj2));
        }
    }

    @Override // j79
    public final void y(f89 f89Var) {
        int i;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 1:
                a72 a72Var = (a72) obj;
                ih8 ih8Var = a72Var.n1;
                boolean z = a72Var.n;
                int i2 = f89Var.f;
                View view = f89Var.a;
                if (i2 != 4) {
                    if (i2 != 11) {
                        if (i2 != 5) {
                            if (i2 == 7) {
                                zh8 zh8Var = (zh8) view;
                                zh8Var.setTag(1);
                                CharSequence charSequence = a72Var.Q;
                                zh8Var.o(charSequence != null ? charSequence : "", ob6.M0(2131754467, null), false);
                                zh8Var.setTag(null);
                                if (!z) {
                                    zh8Var.e.a(ih8Var.b(-3), false);
                                }
                                a72Var.h0(f89Var.b(), view);
                                break;
                            }
                        } else {
                            int b2 = f89Var.b();
                            zh8 zh8Var2 = (zh8) view;
                            zh8Var2.setTag(1);
                            zh8Var2.a.a(a72Var.c0, false);
                            int i3 = b2 - a72Var.u0;
                            zh8Var2.o(a72Var.L[i3], ob6.M0(z ? 2131743708 : 2131747501, null), true);
                            zh8Var2.setTag(null);
                            if (a72Var.l0 == b2) {
                                EditTextBoldCursor textView = zh8Var2.getTextView();
                                textView.requestFocus();
                                hl.E3(textView);
                                a72Var.l0 = -1;
                            }
                            if (!z) {
                                zh8Var2.e.a(ih8Var.b(i3), false);
                            }
                            a72Var.h0(b2, view);
                            break;
                        }
                    } else {
                        zh8 zh8Var3 = (zh8) view;
                        zh8Var3.setTag(1);
                        CharSequence charSequence2 = a72Var.P;
                        zh8Var3.o(charSequence2 != null ? charSequence2 : "", ob6.M0(2131746176, null), false);
                        zh8Var3.setTag(null);
                        zh8Var3.e.a(ih8Var.b(-2), false);
                        a72Var.h0(f89Var.b(), view);
                        break;
                    }
                } else {
                    zh8 zh8Var4 = (zh8) view;
                    zh8Var4.setTag(1);
                    CharSequence charSequence3 = a72Var.O;
                    zh8Var4.o(charSequence3 != null ? charSequence3 : "", ob6.M0(z ? 2131743706 : 2131746175, null), true);
                    zh8Var4.setTag(null);
                    a72Var.h0(f89Var.b(), view);
                    break;
                }
                break;
            case 3:
                if (f89Var.f == 3) {
                    wkb wkbVar = (wkb) f89Var.a;
                    int b3 = f89Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b3 != dataSettingsActivity.F) {
                        if (b3 != dataSettingsActivity.E) {
                            if (b3 != dataSettingsActivity.G) {
                                if (b3 != dataSettingsActivity.H) {
                                    if (b3 != dataSettingsActivity.K) {
                                        if (b3 == dataSettingsActivity.L) {
                                            boolean z2 = xea.a;
                                            wkbVar.setChecked(i86.e(1024));
                                            break;
                                        }
                                    } else {
                                        boolean z3 = xea.a;
                                        wkbVar.setChecked(i86.e(2048));
                                        break;
                                    }
                                } else {
                                    wkbVar.setChecked(xea.z0);
                                    break;
                                }
                            } else {
                                wkbVar.setChecked(xea.y0);
                                break;
                            }
                        } else {
                            wkbVar.setChecked(xea.x0);
                            break;
                        }
                    } else {
                        wkbVar.setChecked(xea.A0);
                        break;
                    }
                }
                break;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (f89Var.f == 3) {
                    wkb wkbVar2 = (wkb) f89Var.a;
                    int b4 = f89Var.b();
                    i = proxyListActivity.useProxyRow;
                    if (b4 != i) {
                        if (b4 == proxyListActivity.w) {
                            wkbVar2.setChecked(xea.W0);
                            break;
                        }
                    } else {
                        wkbVar2.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
        }
    }

    @Override // j79
    public final void z(f89 f89Var) {
        switch (this.c) {
            case 1:
                a72 a72Var = (a72) this.e;
                int i = f89Var.f;
                if (i == 4 || i == 11 || i == 5) {
                    EditTextBoldCursor textView = ((zh8) f89Var.a).getTextView();
                    if (textView.isFocused()) {
                        if (a72Var.J) {
                            s62 s62Var = a72Var.y;
                            if (s62Var != null) {
                                s62Var.e();
                            }
                            a72Var.Y(true);
                        }
                        a72Var.h1 = null;
                        textView.clearFocus();
                        hl.t1(textView);
                        break;
                    }
                }
                break;
        }
    }

    public t20(ll4 ll4Var, LaunchActivity launchActivity) {
        this.c = (byte) 6;
        this.e = ll4Var;
        this.d = launchActivity;
    }

    public /* synthetic */ t20(Object obj, Object obj2, byte b) {
        this.c = b;
        this.e = obj;
        this.d = obj2;
    }

    public t20(ProxyListActivity proxyListActivity, Context context) {
        this.c = (byte) 14;
        this.e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
