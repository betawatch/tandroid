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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class s30 extends q59 {
    public final /* synthetic */ byte c;
    public final Object d;
    public final Object e;

    public s30(Context context) {
        this.c = (byte) 17;
        this.d = context;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        cg3 cg3Var = new cg3();
        cg3Var.a = jb6.M0(2131743856, null);
        cg3Var.b = jb6.M0(2131743848, null);
        cg3Var.c = (byte) 0;
        cg3Var.d = (byte) 0;
        cg3Var.e = true;
        cg3Var.f = false;
        cg3Var.g = (byte) 0;
        cg3Var.h = currentTimeMillis;
        cg3Var.i = false;
        cg3Var.j = false;
        cg3Var.k = 2;
        arrayList.add(cg3Var);
        cg3 cg3Var2 = new cg3();
        cg3Var2.a = jb6.M0(2131743855, null);
        cg3Var2.b = jb6.M0(2131743847, null);
        cg3Var2.c = (byte) 1;
        cg3Var2.d = (byte) 2;
        cg3Var2.e = false;
        cg3Var2.f = false;
        cg3Var2.g = (byte) 0;
        cg3Var2.h = currentTimeMillis - 3600;
        cg3Var2.i = false;
        cg3Var2.j = false;
        cg3Var2.k = -1;
        arrayList.add(cg3Var2);
        cg3 cg3Var3 = new cg3();
        cg3Var3.a = jb6.M0(2131743854, null);
        cg3Var3.b = jb6.M0(2131743846, null);
        cg3Var3.c = (byte) 2;
        cg3Var3.d = (byte) 3;
        cg3Var3.e = false;
        cg3Var3.f = true;
        cg3Var3.g = (byte) 0;
        cg3Var3.h = currentTimeMillis - 7200;
        cg3Var3.i = false;
        cg3Var3.j = true;
        cg3Var3.k = -1;
        arrayList.add(cg3Var3);
        cg3 cg3Var4 = new cg3();
        cg3Var4.a = jb6.M0(2131743853, null);
        cg3Var4.b = jb6.M0(2131743845, null);
        cg3Var4.c = (byte) 3;
        cg3Var4.d = (byte) 0;
        cg3Var4.e = false;
        cg3Var4.f = false;
        cg3Var4.g = (byte) 2;
        cg3Var4.h = currentTimeMillis - 10800;
        cg3Var4.i = false;
        cg3Var4.j = false;
        cg3Var4.k = -1;
        arrayList.add(cg3Var4);
        cg3 cg3Var5 = new cg3();
        cg3Var5.a = jb6.M0(2131743852, null);
        cg3Var5.b = jb6.M0(2131743844, null);
        cg3Var5.c = (byte) 4;
        cg3Var5.d = (byte) 0;
        cg3Var5.e = false;
        cg3Var5.f = false;
        cg3Var5.g = (byte) 1;
        cg3Var5.h = currentTimeMillis - 14400;
        cg3Var5.i = false;
        cg3Var5.j = false;
        cg3Var5.k = 2;
        arrayList.add(cg3Var5);
        cg3 cg3Var6 = new cg3();
        cg3Var6.a = jb6.M0(2131743851, null);
        cg3Var6.b = jb6.M0(2131743843, null);
        cg3Var6.c = (byte) 5;
        cg3Var6.d = (byte) 0;
        cg3Var6.e = false;
        cg3Var6.f = false;
        cg3Var6.g = (byte) 0;
        cg3Var6.h = currentTimeMillis - 18000;
        cg3Var6.i = false;
        cg3Var6.j = false;
        cg3Var6.k = -1;
        arrayList.add(cg3Var6);
        cg3 cg3Var7 = new cg3();
        cg3Var7.a = jb6.M0(2131743850, null);
        cg3Var7.b = jb6.M0(2131743842, null);
        cg3Var7.c = (byte) 6;
        cg3Var7.d = (byte) 0;
        cg3Var7.e = false;
        cg3Var7.f = false;
        cg3Var7.g = (byte) 0;
        cg3Var7.h = currentTimeMillis - 21600;
        cg3Var7.i = true;
        cg3Var7.j = false;
        cg3Var7.k = -1;
        arrayList.add(cg3Var7);
        cg3 cg3Var8 = new cg3();
        cg3Var8.a = jb6.M0(2131743849, null);
        cg3Var8.b = jb6.M0(2131743841, null);
        cg3Var8.c = (byte) 0;
        cg3Var8.d = (byte) 0;
        cg3Var8.e = false;
        cg3Var8.f = false;
        cg3Var8.g = (byte) 0;
        cg3Var8.h = currentTimeMillis - 25200;
        cg3Var8.i = true;
        cg3Var8.j = false;
        cg3Var8.k = -1;
        arrayList.add(cg3Var8);
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
    private final void G(u69 u69Var, int i) {
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
        int i31 = u69Var.f;
        if (i31 == 0) {
            jf5 jf5Var = (jf5) u69Var.a;
            NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.e;
            if (i == notificationsSettingsActivity.y) {
                jf5Var.setText(jb6.M0(2131747642, "NotificationsForChats"));
                return;
            }
            if (i == notificationsSettingsActivity.F) {
                jf5Var.setText(jb6.M0(2131748976, "InAppNotifications"));
                return;
            }
            if (i == notificationsSettingsActivity.L) {
                jf5Var.setText(jb6.M0(2131750822, "Events"));
                return;
            }
            if (i == notificationsSettingsActivity.N) {
                jf5Var.setText(jb6.M0(2131747624, "NotificationsOther"));
                return;
            }
            if (i == notificationsSettingsActivity.T) {
                jf5Var.setText(jb6.M0(2131745851, "Reset"));
                return;
            }
            if (i == notificationsSettingsActivity.H) {
                jf5Var.setText(jb6.M0(2131742963, "VoipNotificationSettings"));
                return;
            } else if (i == notificationsSettingsActivity.O) {
                jf5Var.setText(jb6.M0(2131753698, "BadgeNumber"));
                return;
            } else {
                if (i == notificationsSettingsActivity.r) {
                    jf5Var.setText(jb6.M0(2131745070, "ShowNotificationsFor"));
                    return;
                }
                return;
            }
        }
        if (i31 == 1) {
            bjb bjbVar = (bjb) u69Var.a;
            i2 = ((d) ((NotificationsSettingsActivity) this.e)).currentAccount;
            SharedPreferences sharedPreferences = oc7.r1(i2).W3;
            i3 = ((NotificationsSettingsActivity) this.e).inappSoundRow;
            if (i == i3) {
                bjbVar.f(jb6.M0(2131748972, null), sharedPreferences.getBoolean("EnableInAppSounds", true), true);
                return;
            }
            i4 = ((NotificationsSettingsActivity) this.e).inappVibrateRow;
            if (i == i4) {
                bjbVar.f(jb6.M0(2131748971, null), sharedPreferences.getBoolean("EnableInAppVibrate", true), true);
                return;
            }
            i5 = ((NotificationsSettingsActivity) this.e).inappPreviewRow;
            if (i == i5) {
                bjbVar.f(jb6.M0(2131748973, null), sharedPreferences.getBoolean("EnableInAppPreview", true), true);
                return;
            }
            i6 = ((NotificationsSettingsActivity) this.e).inappPriorityRow;
            if (i == i6) {
                bjbVar.g(jb6.M0(2131748975, null), jb6.M0(2131748974, null), sharedPreferences.getBoolean("EnableInAppPopup", true), true, false);
                return;
            }
            i7 = ((NotificationsSettingsActivity) this.e).contactJoinedRow;
            if (i == i7) {
                bjbVar.f(jb6.M0(2131751727, "ContactJoined"), sharedPreferences.getBoolean("EnableContactJoined", true), true);
                return;
            }
            i8 = ((NotificationsSettingsActivity) this.e).pinnedMessageRow;
            if (i == i8) {
                bjbVar.f(jb6.M0(2131746961, "PinnedMessages"), sharedPreferences.getBoolean("PinnedMessages", true), false);
                return;
            }
            NotificationsSettingsActivity notificationsSettingsActivity2 = (NotificationsSettingsActivity) this.e;
            if (i == notificationsSettingsActivity2.Q) {
                bjbVar.f("Android Auto", sharedPreferences.getBoolean("EnableAutoNotifications", false), true);
                return;
            }
            if (i == notificationsSettingsActivity2.w) {
                bjbVar.g(jb6.M0(2131747609, "NotificationsService"), jb6.M0(2131747606, "NotificationsServiceInfo"), sharedPreferences.getBoolean("pushService", ((NotificationsSettingsActivity) this.e).getMessagesController().l4.y3.f), true, true);
                return;
            }
            if (i == notificationsSettingsActivity2.x) {
                bjbVar.g(jb6.M0(2131747608, "NotificationsServiceConnection"), jb6.M0(2131747607, "NotificationsServiceConnectionInfo"), sharedPreferences.getBoolean("pushConnection", ((NotificationsSettingsActivity) this.e).getMessagesController().l4.z3.f), true, true);
                return;
            }
            i9 = notificationsSettingsActivity2.badgeNumberShowRow;
            if (i == i9) {
                bjbVar.f(jb6.M0(2131753696, "BadgeNumberShow"), ((NotificationsSettingsActivity) this.e).getNotificationsController().S, true);
                return;
            }
            i10 = ((NotificationsSettingsActivity) this.e).badgeNumberMutedRow;
            if (i == i10) {
                bjbVar.f(jb6.M0(2131753697, "BadgeNumberMutedChats"), ((NotificationsSettingsActivity) this.e).getNotificationsController().T, true);
                return;
            }
            i11 = ((NotificationsSettingsActivity) this.e).badgeNumberMessagesRow;
            if (i == i11) {
                bjbVar.f(jb6.M0(2131753695, "BadgeNumberUnread"), ((NotificationsSettingsActivity) this.e).getNotificationsController().U, false);
                return;
            }
            i12 = ((NotificationsSettingsActivity) this.e).inchatSoundRow;
            if (i == i12) {
                bjbVar.f(jb6.M0(2131748970, "InChatSound"), sharedPreferences.getBoolean("EnableInChatSound", true), true);
                return;
            }
            NotificationsSettingsActivity notificationsSettingsActivity3 = (NotificationsSettingsActivity) this.e;
            if (i == notificationsSettingsActivity3.I) {
                bjbVar.f(jb6.M0(2131743301, "Vibrate"), sharedPreferences.getBoolean("EnableCallVibrate", true), true);
                return;
            }
            i13 = notificationsSettingsActivity3.accountsAllRow;
            if (i == i13) {
                bjbVar.f(jb6.M0(2131754267, "AllAccounts"), oc7.e1().getBoolean("AllAccounts", true), false);
                return;
            }
            return;
        }
        if (i31 == 2) {
            ijb ijbVar = (ijb) u69Var.a;
            ijbVar.setMultilineDetail(true);
            i14 = ((NotificationsSettingsActivity) this.e).resetNotificationsRow;
            if (i == i14) {
                ijbVar.a(jb6.M0(2131745845, "ResetAllNotifications"), jb6.M0(2131743573, "UndoAllCustom"), false);
                return;
            }
            return;
        }
        if (i31 != 3) {
            if (i31 != 5) {
                if (i31 == 6) {
                    njb njbVar = (njb) u69Var.a;
                    if (i == ((NotificationsSettingsActivity) this.e).s) {
                        njbVar.setText(jb6.M0(2131745069, "ShowNotificationsForInfo"));
                        return;
                    }
                    return;
                }
                return;
            }
            vkb vkbVar = (vkb) u69Var.a;
            i30 = ((d) ((NotificationsSettingsActivity) this.e)).currentAccount;
            SharedPreferences sharedPreferences2 = oc7.r1(i30).W3;
            NotificationsSettingsActivity notificationsSettingsActivity4 = (NotificationsSettingsActivity) this.e;
            if (i == notificationsSettingsActivity4.J) {
                String string = sharedPreferences2.getString("CallsRingtone", jb6.M0(2131751536, "DefaultRingtone"));
                if (string.equals("NoSound")) {
                    string = jb6.M0(2131747885, "NoSound");
                }
                vkbVar.c(jb6.M0(2131742925, "VoipSettingsRingtone"), string, ((NotificationsSettingsActivity) this.e).X, false);
                ((NotificationsSettingsActivity) this.e).X = false;
                return;
            }
            if (i != notificationsSettingsActivity4.I) {
                if (i == notificationsSettingsActivity4.R) {
                    int i32 = sharedPreferences2.getInt("repeat_messages", 60);
                    vkbVar.c(jb6.M0(2131746008, "RepeatNotifications"), i32 == 0 ? jb6.M0(2131746007, "RepeatNotificationsNever") : i32 < 60 ? jb6.G(i32, "Minutes", new Object[0]) : jb6.G(i32 / 60, "Hours", new Object[0]), ((NotificationsSettingsActivity) this.e).Y, false);
                    ((NotificationsSettingsActivity) this.e).Y = false;
                    return;
                }
                return;
            }
            int i33 = sharedPreferences2.getInt("vibrate_calls", 0);
            if (i33 == 0) {
                vkbVar.c(jb6.M0(2131743301, "Vibrate"), jb6.M0(2131743300, "VibrationDefault"), ((NotificationsSettingsActivity) this.e).W, true);
            } else if (i33 == 1) {
                vkbVar.c(jb6.M0(2131743301, "Vibrate"), jb6.M0(2131745100, "Short"), ((NotificationsSettingsActivity) this.e).W, true);
            } else if (i33 == 2) {
                vkbVar.c(jb6.M0(2131743301, "Vibrate"), jb6.M0(2131743299, "VibrationDisabled"), ((NotificationsSettingsActivity) this.e).W, true);
            } else if (i33 == 3) {
                vkbVar.c(jb6.M0(2131743301, "Vibrate"), jb6.M0(2131748480, "Long"), ((NotificationsSettingsActivity) this.e).W, true);
            } else if (i33 == 4) {
                vkbVar.c(jb6.M0(2131743301, "Vibrate"), jb6.M0(2131747554, "OnlyIfSilent"), ((NotificationsSettingsActivity) this.e).W, true);
            }
            ((NotificationsSettingsActivity) this.e).W = false;
            return;
        }
        yn7 yn7Var = (yn7) u69Var.a;
        i15 = ((d) ((NotificationsSettingsActivity) this.e)).currentAccount;
        SharedPreferences sharedPreferences3 = oc7.r1(i15).W3;
        i16 = ((d) ((NotificationsSettingsActivity) this.e)).currentAccount;
        int currentTime = ConnectionsManager.getInstance(i16).getCurrentTime();
        i17 = ((NotificationsSettingsActivity) this.e).privateRow;
        if (i == i17) {
            M0 = jb6.M0(2131747611, null);
            arrayList = ((NotificationsSettingsActivity) this.e).d;
            i21 = sharedPreferences3.getInt("EnableAll2", 0);
            i22 = R.drawable.msg_openprofile;
        } else {
            i18 = ((NotificationsSettingsActivity) this.e).groupRow;
            if (i != i18) {
                i19 = ((NotificationsSettingsActivity) this.e).storiesRow;
                int i34 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (i == i19) {
                    M0 = jb6.M0(2131747665, null);
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
                        M0 = jb6.M0(2131747669, null);
                        i21 = (sharedPreferences3.getBoolean("EnableReactionsMessages", true) || sharedPreferences3.getBoolean("EnableReactionsStories", true)) ? 0 : Integer.MAX_VALUE;
                        arrayList = null;
                        i23 = R.drawable.msg_reactions;
                        arrayList2 = null;
                    } else {
                        M0 = jb6.M0(2131747654, null);
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
                            sb.append(jb6.M0(2131747625, "NotificationsOn"));
                        } else if (i21 - 31536000 >= currentTime) {
                            sb.append(jb6.M0(2131747627, "NotificationsOff"));
                        } else {
                            Object[] objArr = new Object[1];
                            objArr[i26] = jb6.e1(i21);
                            sb.append(jb6.a0("NotificationsOffUntil", null, 2131747626, objArr));
                        }
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        int size = arrayList.size();
                        i28 = ((NotificationsSettingsActivity) this.e).storiesRow;
                        if (i == i28 && !sharedPreferences3.contains("EnableAllStories") && arrayList2 != null) {
                            size += arrayList2.size();
                        }
                        sb.append(jb6.G(size, "Exception", new Object[i26]));
                    } else if (arrayList2 == null || arrayList2.isEmpty()) {
                        sb.append(jb6.M0(2131743946, "TapToChange"));
                    } else {
                        if (i21 > 0) {
                            sb.append(jb6.M0(2131747627, "NotificationsOff"));
                        } else {
                            sb.append(jb6.M0(2131747625, "NotificationsOn"));
                        }
                        if (!arrayList2.isEmpty() && !sharedPreferences3.contains("EnableAllStories")) {
                            sb.append(", ");
                            sb.append(jb6.G(arrayList2.size(), "AutoException", new Object[0]));
                        }
                    }
                    z = i24;
                } else if (i21 > 0) {
                    sb.append(jb6.M0(2131747627, "NotificationsOff"));
                    z = i26;
                } else {
                    if (sharedPreferences3.getBoolean("EnableReactionsMessages", true)) {
                        sb.append(jb6.M0(2131747668, null));
                    }
                    if (sharedPreferences3.getBoolean("EnableReactionsStories", true)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append(jb6.M0(2131747667, null));
                    }
                    z = 1;
                }
                i29 = ((NotificationsSettingsActivity) this.e).reactionsRow;
                yn7Var.b(charSequence, sb, i23, z, i25, false, i == i29, false);
            }
            M0 = jb6.M0(2131747640, null);
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
        yn7Var.b(charSequence2, sb2, i23, z, i25, false, i == i29, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ee, code lost:
    
        if (org.telegram.ui.Wallet.c.C(r7).Q() == false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void H(u69 u69Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        PasscodeActivity passcodeActivity = (PasscodeActivity) this.e;
        int i9 = u69Var.f;
        View view = u69Var.a;
        boolean z = true;
        if (i9 == 0) {
            bjb bjbVar = (bjb) view;
            i2 = passcodeActivity.fingerprintRow;
            if (i == i2) {
                bjbVar.f(jb6.M0(2131743560, null), gda.C, false);
                return;
            }
            if (i == passcodeActivity.O) {
                bjbVar.f(jb6.M0(2131745575, null), gda.z, false);
                return;
            }
            if (i != passcodeActivity.L) {
                if (i == passcodeActivity.K) {
                    String M0 = jb6.M0(2131742848, null);
                    i3 = ((d) passcodeActivity).currentAccount;
                    bjbVar.f(M0, c.C(i3).R(), false);
                    return;
                }
                return;
            }
            String M02 = jb6.M0(2131742849, null);
            i4 = ((d) passcodeActivity).currentAccount;
            if (c.C(i4).e()) {
                i5 = ((d) passcodeActivity).currentAccount;
            }
            z = false;
            bjbVar.f(M02, z, false);
            return;
        }
        if (i9 == 1) {
            vkb vkbVar = (vkb) view;
            i6 = passcodeActivity.changePasscodeRow;
            if (i == i6) {
                vkbVar.b(jb6.M0(2131752497, null), true);
                if (gda.r.isEmpty()) {
                    int i10 = cmb.D6;
                    vkbVar.setTag(Integer.valueOf(i10));
                    anb.X(vkbVar.getTextView(), i10, null);
                    return;
                } else {
                    int i11 = cmb.F6;
                    vkbVar.setTag(Integer.valueOf(i11));
                    anb.X(vkbVar.getTextView(), i11, null);
                    return;
                }
            }
            i7 = passcodeActivity.autoLockRow;
            if (i == i7) {
                int i12 = gda.x;
                vkbVar.c(jb6.M0(2131753765, null), i12 == 0 ? jb6.a0("AutoLockDisabled", null, 2131753764, new Object[0]) : i12 < 3600 ? jb6.a0("AutoLockInTime", null, 2131753763, jb6.G(i12 / 60, "Minutes", new Object[0])) : i12 < 86400 ? jb6.a0("AutoLockInTime", null, 2131753763, jb6.G((int) Math.ceil((i12 / 60.0f) / 60.0f), "Hours", new Object[0])) : jb6.a0("AutoLockInTime", null, 2131753763, jb6.G((int) Math.ceil(((i12 / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0])), false, true);
                int i13 = cmb.F6;
                vkbVar.setTag(Integer.valueOf(i13));
                anb.X(vkbVar.getTextView(), i13, null);
                return;
            }
            i8 = passcodeActivity.disablePasscodeRow;
            if (i == i8) {
                vkbVar.b(jb6.M0(2131751370, null), false);
                int i14 = cmb.p7;
                vkbVar.setTag(Integer.valueOf(i14));
                anb.X(vkbVar.getTextView(), i14, null);
                return;
            }
            return;
        }
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 == 4) {
                    nx7 nx7Var = (nx7) view;
                    nx7Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    nx7Var.a.d();
                    return;
                }
                return;
            }
            jf5 jf5Var = (jf5) view;
            jf5Var.setHeight(46);
            if (i == passcodeActivity.N) {
                jf5Var.setText(jb6.M0(2131745577, null));
                return;
            } else {
                if (i == passcodeActivity.J) {
                    jf5Var.setText(jb6.M0(2131742761, null));
                    return;
                }
                return;
            }
        }
        njb njbVar = (njb) view;
        if (i == passcodeActivity.H) {
            njbVar.setText(jb6.M0(2131747388, null));
            njbVar.setBackground(null);
            njbVar.getTextView().setGravity(1);
        } else if (i == passcodeActivity.I) {
            njbVar.setText(jb6.M0(2131753762, null));
            njbVar.getTextView().setGravity(jb6.a0 ? 5 : 3);
        } else if (i == passcodeActivity.M) {
            njbVar.setText(jb6.M0(2131742760, null));
            njbVar.getTextView().setGravity(jb6.a0 ? 5 : 3);
        } else if (i == passcodeActivity.P) {
            njbVar.setText(jb6.M0(2131745576, null));
            njbVar.getTextView().setGravity(jb6.a0 ? 5 : 3);
        }
    }

    private final void I(u69 u69Var, int i) {
        n78 n78Var = (n78) this.e;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0) {
            if (i2 == 1) {
                y68 y68Var = (y68) view;
                y68Var.setTag(Integer.valueOf(i));
                if (i == n78Var.E) {
                    y68Var.a(n78Var.O, jb6.M0(2131743799, null));
                    return;
                } else {
                    if (i == n78Var.F) {
                        y68Var.a(n78Var.P, jb6.M0(2131743800, null));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        z68 z68Var = (z68) view;
        z68Var.setTag(Integer.valueOf(i));
        if (i == n78Var.b) {
            z68Var.a(jb6.M0(2131751063, null), 0, n78Var.H);
            return;
        }
        if (i == n78Var.r) {
            z68Var.a(jb6.M0(2131749059, null), -100, n78Var.Q);
            return;
        }
        if (i == n78Var.d) {
            z68Var.a(jb6.M0(2131751706, null), -100, n78Var.J);
            return;
        }
        if (i == n78Var.c) {
            z68Var.a(jb6.M0(2131750794, null), -100, n78Var.I);
            return;
        }
        if (i == n78Var.f) {
            z68Var.a(jb6.M0(2131742612, null), -100, n78Var.K);
            return;
        }
        if (i == n78Var.e) {
            z68Var.a(jb6.M0(2131745681, null), -100, n78Var.L);
            return;
        }
        if (i == n78Var.w) {
            z68Var.a(jb6.M0(2131743208, null), 0, n78Var.S);
            return;
        }
        if (i == n78Var.s) {
            z68Var.a(jb6.M0(2131745199, null), -100, n78Var.R);
            return;
        }
        if (i == n78Var.x) {
            z68Var.a(jb6.M0(2131749298, null), 0, n78Var.T);
            return;
        }
        if (i == n78Var.y) {
            z68Var.a(jb6.M0(2131745101, null), 0, n78Var.V);
        } else if (i == n78Var.h) {
            z68Var.a(jb6.M0(2131750783, null), 0, n78Var.M);
        } else if (i == n78Var.n) {
            z68Var.a(jb6.M0(2131745027, null), 0, n78Var.N);
        }
    }

    private final void J(u69 u69Var, int i) {
        boolean Q0;
        w78 w78Var = (w78) this.e;
        yn6 yn6Var = w78Var.K;
        ArrayList arrayList = w78Var.n;
        ArrayList arrayList2 = w78Var.c;
        HashMap hashMap = w78Var.b;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            q68 q68Var = (q68) view;
            q68Var.setItemSize(w78Var.S);
            bf0 imageView = q68Var.getImageView();
            q68Var.setTag(Integer.valueOf(i));
            imageView.q();
            if (yn6Var != null) {
                jo6 jo6Var = (jo6) yn6Var.e.get(i);
                q68Var.d(jo6Var, arrayList2.size() > 1, true, false, false);
                int i3 = jo6Var.C;
                q68Var.b(w78Var.e ? arrayList2.indexOf(Integer.valueOf(i3)) : -1, hashMap.containsKey(Integer.valueOf(i3)), false);
                Q0 = PhotoViewer.Q0(jo6Var.I);
            } else {
                no6 no6Var = (no6) w78Var.f.get(i);
                q68Var.e(no6Var);
                q68Var.getVideoInfoContainer().setVisibility(4);
                q68Var.b(w78Var.e ? arrayList2.indexOf(no6Var.B) : -1, hashMap.containsKey(no6Var.B), false);
                Q0 = PhotoViewer.Q0(no6Var.g());
            }
            imageView.getImageReceiver().v0(!Q0, true);
            q68Var.getCheckBox().setVisibility((w78Var.U != 0 || Q0) ? 8 : 0);
            return;
        }
        if (i2 == 1) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = w78Var.S;
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        if (i2 == 2) {
            jo6 jo6Var2 = (jo6) yn6Var.e.get(i);
            ida idaVar = (ida) view;
            idaVar.setPhotoEntry(jo6Var2);
            idaVar.b(hashMap.containsKey(Integer.valueOf(jo6Var2.C)), false);
            idaVar.setTag(Integer.valueOf(i));
            return;
        }
        if (i2 == 3) {
            xib xibVar = (xib) view;
            if (i < arrayList.size()) {
                xibVar.o(R.drawable.msg_recent, (CharSequence) arrayList.get(i), false);
            } else {
                xibVar.o(R.drawable.msg_clear_recent, jb6.M0(2131752004, null), false);
            }
        }
    }

    private final void K(u69 u69Var, int i) {
        PhotoViewer photoViewer = (PhotoViewer) this.e;
        Context context = (Context) this.d;
        a88 a88Var = (a88) u69Var.a;
        int L = gm.L(85.0f);
        int L2 = i != 0 ? gm.L(6.0f) : 0;
        a88Var.f = L;
        jh2 jh2Var = a88Var.c;
        bf0 bf0Var = a88Var.a;
        jp0 jp0Var = a88Var.e;
        a88Var.h = L2;
        ((FrameLayout.LayoutParams) a88Var.b.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) bf0Var.getLayoutParams()).rightMargin = L2;
        ((FrameLayout.LayoutParams) jp0Var.getLayoutParams()).rightMargin = L2;
        bf0Var.q();
        Object obj = photoViewer.d.u().get(photoViewer.d.d().get(i));
        if (!(obj instanceof jo6)) {
            if (obj instanceof no6) {
                no6 no6Var = (no6) obj;
                a88Var.setTag(no6Var);
                a88Var.setImage(no6Var);
                jp0Var.setVisibility(4);
                jh2Var.a.f(-1, true, false);
                jh2Var.setVisibility(0);
                return;
            }
            return;
        }
        jo6 jo6Var = (jo6) obj;
        int i2 = jo6Var.C;
        String str = jo6Var.I;
        a88Var.setTag(jo6Var);
        jp0Var.setVisibility(4);
        String str2 = jo6Var.c;
        if (str2 != null) {
            bf0Var.o(str2, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (str != null) {
            bf0Var.r(jo6Var.J, jo6Var.K, true);
            if (!jo6Var.b || jo6Var.d()) {
                bf0Var.o(mle.d("thumb://", i2, ":", str), null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                jp0Var.setVisibility(0);
                a88Var.d.setText(gm.g0(jo6Var.E, false, false));
                bf0Var.o("vthumb://" + i2 + ":" + str, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            bf0Var.setImageResource(R.drawable.nophotos);
        }
        jh2Var.a.f(-1, true, false);
        jh2Var.setVisibility(0);
    }

    private final void L(u69 u69Var, int i) {
        int i2;
        int i3;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        ArrayList arrayList = proxyListActivity.F;
        ArrayList arrayList2 = proxyListActivity.G;
        int i4 = u69Var.f;
        View view = u69Var.a;
        switch (i4) {
            case 1:
                vkb vkbVar = (vkb) view;
                anb.X(vkbVar.getTextView(), cmb.F6, null);
                i2 = proxyListActivity.proxyAddRow;
                if (i == i2) {
                    vkbVar.b(jb6.M0(2131754388, null), proxyListActivity.E != -1);
                    break;
                } else if (i == proxyListActivity.E) {
                    anb.X(vkbVar.getTextView(), cmb.o7, null);
                    vkbVar.b(jb6.M0(2131751517, null), false);
                    break;
                }
                break;
            case 2:
                jf5 jf5Var = (jf5) view;
                if (i == proxyListActivity.h) {
                    jf5Var.setText(jb6.M0(2131746338, null));
                    break;
                }
                break;
            case 3:
                bjb bjbVar = (bjb) view;
                i3 = proxyListActivity.useProxyRow;
                if (i == i3) {
                    bjbVar.f(jb6.M0(2131743470, null), proxyListActivity.d, proxyListActivity.w != -1);
                    break;
                } else if (i == proxyListActivity.w) {
                    bjbVar.f(jb6.M0(2131743472, null), gda.W0, true);
                    break;
                }
                break;
            case 4:
                njb njbVar = (njb) view;
                if (i == proxyListActivity.y) {
                    njbVar.setText(jb6.M0(2131746336, null));
                    break;
                }
                break;
            case 5:
                zv8 zv8Var = (zv8) view;
                fda fdaVar = (fda) arrayList2.get(i - proxyListActivity.n);
                zv8Var.setProxy(fdaVar);
                zv8Var.setChecked(gda.x1 == fdaVar);
                boolean contains = arrayList.contains(arrayList2.get(i - proxyListActivity.n));
                zv8Var.h = contains;
                zv8Var.f.a(contains, false);
                zv8Var.a(!arrayList.isEmpty(), false);
                break;
            case 6:
                if (i == proxyListActivity.x) {
                    hla hlaVar = (hla) view;
                    ArrayList arrayList3 = new ArrayList(aw8.d);
                    String[] strArr = new String[arrayList3.size()];
                    for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                        strArr[i5] = jb6.a0(null, null, 2131746335, arrayList3.get(i5));
                    }
                    hlaVar.setCallback(new i98((byte) 9));
                    hlaVar.b(gda.X0, null, strArr);
                    break;
                }
                break;
        }
    }

    private final void M(u69 u69Var, int i) {
        TextView textView;
        mia miaVar = (mia) this.e;
        int i2 = u69Var.f;
        if (i2 == 0) {
            ((jia) u69Var.a).setDialog(mia.D0(i - 1));
        } else {
            if (i2 != 1 || (textView = miaVar.o1) == null) {
                return;
            }
            textView.setText(jb6.a0("SharingLiveLocationTitle", null, 2131745126, jb6.G(dd6.g(), "Chats", new Object[0])));
        }
    }

    private final void N(u69 u69Var, int i) {
        edb edbVar = (edb) u69Var.a;
        fdb fdbVar = (fdb) this.d;
        ArrayList arrayList = fdbVar.x;
        String str = arrayList == null ? null : ((ds6) arrayList.get(i)).a;
        int direction = fdbVar.getDirection();
        int i2 = edb.h;
        edbVar.a = str;
        if (str == null || !str.startsWith("animated_")) {
            edbVar.setImageDrawable(gw3.f(str));
        } else {
            try {
                long parseLong = Long.parseLong(str.substring(9));
                Drawable drawable = edbVar.b;
                if (!(drawable instanceof vm) || ((vm) drawable).h() != parseLong) {
                    edbVar.setImageDrawable(vm.m(z8c.t0, parseLong, null, edbVar.f.c()));
                }
            } catch (Exception unused) {
                edbVar.setImageDrawable(null);
            }
        }
        if (edbVar.d != direction) {
            edbVar.d = direction;
            edbVar.requestLayout();
        }
    }

    private final void O(u69 u69Var, int i) {
        ArrayList arrayList = (ArrayList) this.e;
        if (u69Var.f == 0) {
            hg3 hg3Var = (hg3) u69Var.a;
            hg3Var.t2 = i != arrayList.size() - 1;
            hg3Var.setDialog((cg3) arrayList.get(i));
        }
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
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
                int b2 = u69Var.b();
                if (b2 != 1) {
                    i = ((d) ((vn9) obj)).currentAccount;
                    if (!MediaController.r0(i) || b2 != 2) {
                    }
                }
                break;
            case 1:
                int b3 = u69Var.b();
                v72 v72Var = (v72) obj;
                if (b3 == v72Var.v0 || b3 == v72Var.H0 || b3 == v72Var.C0 || b3 == v72Var.G0 || b3 == v72Var.D0 || b3 == v72Var.I0 || b3 == v72Var.E0 || b3 == v72Var.F0 || b3 == v72Var.J0 || b3 == v72Var.K0 || b3 == v72Var.O0.b || b3 == v72Var.N0.b || b3 == v72Var.M0) {
                    break;
                }
                break;
            case 2:
                int b4 = u69Var.b();
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
                int b5 = u69Var.b();
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
                if (wi8.G(3)[u69Var.f] == 1) {
                    break;
                }
                break;
            case 7:
                int b6 = u69Var.b();
                ph6 ph6Var = (ph6) obj;
                if (b6 == ph6Var.c || b6 == ph6Var.d || b6 == ph6Var.e || b6 == ph6Var.f || b6 == ph6Var.h || b6 == ph6Var.r) {
                    break;
                }
                break;
            case 8:
                int b7 = u69Var.b();
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                if (b7 != notificationsSettingsActivity.y && b7 != notificationsSettingsActivity.E && b7 != notificationsSettingsActivity.F && b7 != notificationsSettingsActivity.L && b7 != notificationsSettingsActivity.N && b7 != notificationsSettingsActivity.T && b7 != notificationsSettingsActivity.O && b7 != notificationsSettingsActivity.M && b7 != notificationsSettingsActivity.S && b7 != notificationsSettingsActivity.G && b7 != notificationsSettingsActivity.H && b7 != notificationsSettingsActivity.P && b7 != notificationsSettingsActivity.r && b7 != notificationsSettingsActivity.s && b7 != notificationsSettingsActivity.U && b7 != notificationsSettingsActivity.K) {
                    break;
                }
                break;
            case 9:
                int b8 = u69Var.b();
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
                w78 w78Var = (w78) obj;
                if (w78Var.K == null) {
                    if (TextUtils.isEmpty(w78Var.w)) {
                        if (u69Var.f != 3) {
                        }
                    } else if (u69Var.b() >= w78Var.f.size()) {
                    }
                }
                break;
            case 14:
                int b9 = u69Var.b();
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                i17 = proxyListActivity.useProxyRow;
                if (b9 != i17 && b9 != proxyListActivity.w) {
                    i18 = proxyListActivity.proxyAddRow;
                    if (b9 != i18 && b9 != proxyListActivity.E && (b9 < proxyListActivity.n || b9 >= proxyListActivity.r)) {
                    }
                }
                break;
            case 15:
                if (u69Var.f == 0) {
                    break;
                }
                break;
            case 17:
                if (u69Var.f != 1) {
                    break;
                }
                break;
        }
        return true;
    }

    public final void E() {
        rja rjaVar;
        rja rjaVar2;
        rja rjaVar3;
        rja rjaVar4;
        ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
        int size = proxyListActivity.F.size();
        rjaVar = ((d) proxyListActivity).simpleActionBar;
        boolean x = rjaVar.x();
        if (size <= 0) {
            if (x) {
                rjaVar2 = ((d) proxyListActivity).simpleActionBar;
                rjaVar2.w();
                int i = proxyListActivity.n;
                n(i, proxyListActivity.r - i, 2);
                return;
            }
            return;
        }
        rjaVar3 = ((d) proxyListActivity).simpleActionBar;
        rjaVar3.F(size, x);
        if (x) {
            return;
        }
        rjaVar4 = ((d) proxyListActivity).simpleActionBar;
        rjaVar4.J();
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
        fda fdaVar = (fda) proxyListActivity.G.get(i - i2);
        if (arrayList.contains(fdaVar)) {
            arrayList.remove(fdaVar);
        } else {
            arrayList.add(fdaVar);
        }
        h(i, 1);
        E();
    }

    @Override // y59
    public final int b() {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return 4;
            case 1:
                return ((v72) obj).R0;
            case 2:
                return ((DataAutoDownloadActivity) obj).y;
            case 3:
                return ((DataSettingsActivity) obj).U;
            case 4:
                return ((ig4) obj).h.size();
            case 5:
                int size = ((dh4) obj).u1.size();
                return size < 10 ? size + 1 : size;
            case 6:
                return ((ll4) obj).F.size();
            case 7:
                return ((ph6) obj).w;
            case 8:
                return ((NotificationsSettingsActivity) obj).V;
            case 9:
                return ((PasscodeActivity) obj).Q;
            case 10:
                if (((j68) obj).d != null) {
                    return (int) Math.ceil(r4.size() / r2.f);
                }
                return 0;
            case 11:
                return ((n78) obj).G;
            case 12:
                w78 w78Var = (w78) obj;
                ArrayList arrayList = w78Var.n;
                ArrayList arrayList2 = w78Var.f;
                yn6 yn6Var = w78Var.K;
                if (yn6Var != null) {
                    return yn6Var.e.size();
                }
                if (!arrayList2.isEmpty()) {
                    return arrayList2.size() + (!w78Var.s ? 1 : 0);
                }
                if (!TextUtils.isEmpty(w78Var.w) || arrayList.isEmpty()) {
                    return 0;
                }
                return arrayList.size() + 2;
            case 13:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                pb8 pb8Var = photoViewer.d;
                if (pb8Var == null || pb8Var.d() == null) {
                    return 0;
                }
                return photoViewer.d.d().size();
            case 14:
                return ((ProxyListActivity) obj).e;
            case 15:
                return dd6.g() + 1;
            case 16:
                ArrayList arrayList3 = ((fdb) this.d).x;
                if (arrayList3 != null) {
                    return arrayList3.size();
                }
                return 0;
            case 17:
                return ((ArrayList) obj).size();
            default:
                return ((vgc) obj).h.size();
        }
    }

    @Override // y59
    public final long c(int i) {
        int i2;
        int i3;
        int i4;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 4:
                i2 = ((ig4) obj).l0.get(i);
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
                return ((fda) proxyListActivity.G.get(i - r2)).hashCode();
            case 16:
                if (((fdb) this.d).x == null) {
                    return 0L;
                }
                return ((ds6) r2.get(i)).a.hashCode();
            case 18:
                i2 = ((sgc) ((vgc) obj).h.get(i)).a;
                break;
            default:
                return super.c(i);
        }
        return i2;
    }

    @Override // y59
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
                v72 v72Var = (v72) obj;
                if (i == v72Var.C0 || i == v72Var.G0 || i == v72Var.H0 || i == v72Var.D0 || i == v72Var.E0 || i == v72Var.F0 || i == v72Var.I0 || i == v72Var.N0.b || i == v72Var.O0.b) {
                    return 10;
                }
                if (i == v72Var.m0 || i == v72Var.t0 || i == v72Var.x0 || i == v72Var.p0) {
                    return 0;
                }
                if (i == v72Var.s0) {
                    return 1;
                }
                if (i == v72Var.w0 || i == v72Var.y0 || i == v72Var.r0 || i == v72Var.L0) {
                    return 2;
                }
                if (i == v72Var.v0 || i == v72Var.J0 || i == v72Var.M0) {
                    return 3;
                }
                if (i == v72Var.n0) {
                    return 4;
                }
                if (i == v72Var.o0) {
                    return 11;
                }
                if (i == v72Var.q0) {
                    return 7;
                }
                if (i == v72Var.z0 || i == v72Var.A0 || i == v72Var.K0) {
                    return 6;
                }
                if (i == v72Var.B0) {
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
                return wi8.F(((dl4) ((ll4) obj).F.get(i)).b);
            case 7:
                ph6 ph6Var = (ph6) obj;
                if (i == 0) {
                    return 0;
                }
                if (i == ph6Var.c || i == ph6Var.d || i == ph6Var.e || i == ph6Var.f || i == ph6Var.h) {
                    return 1;
                }
                if (i == ph6Var.n) {
                    return 2;
                }
                return i == ph6Var.r ? 3 : 4;
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
                n78 n78Var = (n78) obj;
                return (i == n78Var.E || i == n78Var.F) ? 1 : 0;
            case 12:
                w78 w78Var = (w78) obj;
                ArrayList arrayList = w78Var.f;
                if (w78Var.Z) {
                    return 2;
                }
                if (w78Var.K == null) {
                    if (arrayList.isEmpty()) {
                        return i != w78Var.n.size() ? 3 : 4;
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
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
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
        dr3 o;
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
        dr3 o2;
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
        xib xibVar;
        int i33;
        ugc ugcVar;
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
                i2 = ((d) ((vn9) obj2)).currentAccount;
                boolean r0 = MediaController.r0(i2);
                int i36 = u69Var.f;
                View view = u69Var.a;
                if (i36 == 0) {
                    ((jf5) view).setText(jb6.M0(2131753889, null));
                    break;
                } else if (i36 == 1) {
                    ((bjb) view).f(jb6.M0(2131753883, null), r0, false);
                    break;
                } else if (i36 == 2) {
                    vkb vkbVar = (vkb) view;
                    vkbVar.setEnabled(r0);
                    vkbVar.c(jb6.M0(2131753887, null), jb6.M0(((e40) yed.c.a()) == e40.b ? 2131753885 : 2131753886, null), false, false);
                    break;
                } else {
                    ((njb) view).setText(jb6.M0(2131753888, null));
                    break;
                }
            case 1:
                Context context = (Context) obj;
                v72 v72Var = (v72) obj2;
                boolean z8 = v72Var.f0;
                dbc dbcVar = v72Var.N0;
                dbc dbcVar2 = v72Var.O0;
                ylb ylbVar = v72Var.a;
                boolean z9 = v72Var.n;
                int i37 = u69Var.f;
                View view2 = u69Var.a;
                if (i37 != 0) {
                    if (i37 != 6) {
                        if (i37 != 2) {
                            if (i37 != 3) {
                                if (i37 != 9) {
                                    if (i37 == 10) {
                                        lg8 lg8Var = (lg8) view2;
                                        lg8Var.setDivider(false);
                                        if (i == v72Var.C0) {
                                            lg8Var.a(jb6.M0(2131746857, null), jb6.M0(2131746856, null), ll5.c, R.drawable.filled_poll_view_24, !v72Var.b0);
                                        } else {
                                            if (i == v72Var.G0) {
                                                lg8Var.a(jb6.M0(2131746882, null), jb6.M0(2131746881, null), ll5.f, R.drawable.filled_poll_multiple_24, v72Var.c0);
                                            } else if (i == v72Var.E0) {
                                                lg8Var.a(jb6.M0(2131746880, null), jb6.M0(2131746879, null), ll5.w, R.drawable.filled_poll_revote_24, v72Var.S);
                                            } else if (i == v72Var.D0) {
                                                lg8Var.a(jb6.M0(2131746884, null), jb6.M0(2131746883, null), ll5.s, R.drawable.filled_poll_add_24, v72Var.U);
                                            } else if (i == v72Var.F0) {
                                                lg8Var.a(jb6.M0(2131746855, null), jb6.M0(2131746854, null), ll5.h, R.drawable.filled_poll_shuffle_24, v72Var.T);
                                            } else if (i == v72Var.H0) {
                                                lg8Var.a(jb6.M0(2131746859, null), jb6.M0(2131746858, null), ll5.n, R.drawable.filled_poll_correct_24, v72Var.d0);
                                            } else if (i == dbcVar2.b) {
                                                lg8Var.a(jb6.M0(2131746870, null), jb6.M0(2131746869, null), ll5.e, R.drawable.filled_location, dbcVar2.a);
                                            } else if (i == dbcVar.b) {
                                                lg8Var.a(jb6.M0(2131746862, null), jb6.M0(2131746861, null), ll5.d, R.drawable.msg_folders_groups, dbcVar.a);
                                            } else if (i == v72Var.I0) {
                                                lg8Var.a(jb6.M0(2131746868, null), jb6.M0(2131746867, null), ll5.r, R.drawable.filled_poll_deadline_24, (v72Var.V == 0 && v72Var.W == 0) ? false : true);
                                                lg8Var = lg8Var;
                                                lg8Var.setDivider((v72Var.V == 0 && v72Var.W == 0) ? false : true);
                                            }
                                            lg8Var = lg8Var;
                                        }
                                        if (i == v72Var.H0) {
                                            lg8Var.getCheckBox().a.a(z8, false);
                                            break;
                                        } else if (i == v72Var.D0) {
                                            Switch checkBox = lg8Var.getCheckBox();
                                            if (!v72Var.d0 && !v72Var.b0) {
                                                z7 = false;
                                            }
                                            checkBox.a.a(z7, false);
                                            break;
                                        } else {
                                            lg8Var.getCheckBox().a.a(false, false);
                                            break;
                                        }
                                    }
                                } else {
                                    view2.requestLayout();
                                    break;
                                }
                            } else {
                                xib xibVar2 = (xib) view2;
                                if (i == v72Var.M0) {
                                    String M04 = jb6.M0(2131746878, null);
                                    ArrayList arrayList = v72Var.Q0;
                                    if (arrayList.isEmpty()) {
                                        G = jb6.M0(2131745545, null);
                                        z = false;
                                    } else if (arrayList.size() == 1) {
                                        z = false;
                                        G = jb6.i0(2131750453, (String) arrayList.get(0));
                                    } else {
                                        z = false;
                                        G = jb6.G(arrayList.size(), "PollV2AllowedCountriesListManyP", new Object[0]);
                                    }
                                    xibVar2.q(M04, G, z, true);
                                    break;
                                } else if (i == v72Var.J0) {
                                    v72Var.T(xibVar2, false);
                                    break;
                                } else {
                                    xibVar2.g(-1, cmb.Yl);
                                    Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                                    Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                                    int v0 = cmb.v0(cmb.M6, ylbVar);
                                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                                    drawable.setColorFilter(new PorterDuffColorFilter(v0, mode));
                                    drawable2.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.j7, ylbVar), mode));
                                    v72Var.o1 = drawable;
                                    v72Var.p1 = drawable2;
                                    xibVar2.p(jb6.M0(z9 ? 2131743753 : 2131754468, null), new sn2(drawable, drawable2), false);
                                    xibVar2.x = 20;
                                    xibVar2.s = 58;
                                    break;
                                }
                            }
                        } else {
                            njb njbVar = (njb) view2;
                            njbVar.setFixedSize(0);
                            new sn2(new ColorDrawable(cmb.v0(cmb.Z6, ylbVar)), cmb.W0(context, R.drawable.greydivider_bottom, cmb.a7)).x = true;
                            if (i == v72Var.r0) {
                                njbVar.setText(jb6.M0(2131754469, null));
                                break;
                            } else if (i == v72Var.y0) {
                                njbVar.setFixedSize(12);
                                njbVar.setText(null);
                                break;
                            } else {
                                int i38 = v72Var.K - v72Var.N;
                                if (i38 <= 0) {
                                    njbVar.setText(jb6.M0(z9 ? 2131743793 : 2131754466, null));
                                    break;
                                } else if (z9) {
                                    njbVar.setText(jb6.H(',', "TodoNewTaskInfo", i38));
                                    break;
                                } else if (i == v72Var.L0) {
                                    njbVar.setText(jb6.M0(2131746871, null));
                                    break;
                                } else {
                                    njbVar.setText(jb6.a0(null, null, 2131754467, jb6.G(i38, "Option", new Object[0])));
                                    break;
                                }
                            }
                        }
                    } else {
                        bjb bjbVar = (bjb) view2;
                        if (i == v72Var.z0) {
                            bjbVar.f(jb6.M0(2131743778, null), v72Var.g0, v72Var.A0 != -1);
                            bjbVar.e(null, true);
                            break;
                        } else if (i == v72Var.A0) {
                            bjbVar.f(jb6.M0(2131743777, null), v72Var.h0, false);
                            bjbVar.e(null, true);
                            break;
                        } else if (i == v72Var.K0) {
                            bjbVar.f(jb6.M0(2131746872, null), v72Var.a0, false);
                            bjbVar.e(null, true);
                            break;
                        }
                    }
                } else {
                    jf5 jf5Var = (jf5) view2;
                    if (i == v72Var.m0) {
                        jf5Var.getTextView().setGravity(19);
                        jf5Var.setText(jb6.M0(z9 ? 2131743739 : 2131746898, null));
                        break;
                    } else if (i == v72Var.p0) {
                        jf5Var.getTextView().setGravity(19);
                        jf5Var.setText(jb6.M0(2131754470, null));
                        break;
                    } else {
                        jf5Var.getTextView().setGravity((jb6.a0 ? 5 : 3) | 16);
                        if (i == v72Var.t0) {
                            if (z8) {
                                jf5Var.setText(jb6.M0(2131746180, null));
                                break;
                            } else {
                                jf5Var.setText(jb6.M0(z9 ? 2131743757 : 2131754211, null));
                                break;
                            }
                        } else if (i == v72Var.x0) {
                            jf5Var.setText(jb6.M0(2131745229, null));
                            break;
                        }
                    }
                }
                break;
            case 2:
                DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) obj2;
                int i39 = dataAutoDownloadActivity.f;
                dr3 dr3Var = dataAutoDownloadActivity.H;
                int i40 = u69Var.f;
                View view3 = u69Var.a;
                if (i40 != 0) {
                    if (i40 != 2) {
                        if (i40 != 3) {
                            if (i40 != 4) {
                                if (i40 == 5) {
                                    njb njbVar2 = (njb) view3;
                                    if (i == dataAutoDownloadActivity.x) {
                                        njbVar2.setText(jb6.M0(2131753808, null));
                                        njbVar2.setFixedSize(0);
                                        njbVar2.setImportantForAccessibility(1);
                                        break;
                                    } else if (i == dataAutoDownloadActivity.n) {
                                        if (dataAutoDownloadActivity.r == -1) {
                                            if (i39 == 0) {
                                                njbVar2.setText(jb6.M0(2131753788, null));
                                            } else if (i39 == 1) {
                                                njbVar2.setText(jb6.M0(2131753783, null));
                                            } else if (i39 == 2) {
                                                njbVar2.setText(jb6.M0(2131753786, null));
                                            }
                                            njbVar2.setImportantForAccessibility(1);
                                            break;
                                        } else {
                                            njbVar2.setText(null);
                                            njbVar2.setFixedSize(12);
                                            njbVar2.setImportantForAccessibility(4);
                                            break;
                                        }
                                    }
                                }
                            } else {
                                yn7 yn7Var = (yn7) view3;
                                yn7Var.setDrawLine(true);
                                i4 = dataAutoDownloadActivity.photosRow;
                                if (i == i4) {
                                    M0 = jb6.M0(2131753782, null);
                                    i7 = 1;
                                } else {
                                    i5 = dataAutoDownloadActivity.videosRow;
                                    if (i == i5) {
                                        M0 = jb6.M0(2131753771, null);
                                        i7 = 4;
                                    } else {
                                        i6 = dataAutoDownloadActivity.storiesRow;
                                        if (i == i6) {
                                            M0 = jb6.M0(2131753774, null);
                                            yn7Var.setDrawLine(false);
                                            i7 = -1;
                                        } else {
                                            M0 = jb6.M0(2131753803, null);
                                            i7 = 8;
                                        }
                                    }
                                }
                                if (i39 == 0) {
                                    i15 = ((d) dataAutoDownloadActivity).currentAccount;
                                    o = er3.q(i15).n();
                                } else if (i39 == 1) {
                                    i9 = ((d) dataAutoDownloadActivity).currentAccount;
                                    o = er3.q(i9).p();
                                } else {
                                    i8 = ((d) dataAutoDownloadActivity).currentAccount;
                                    o = er3.q(i8).o();
                                }
                                long j = o.b[er3.x(i7)];
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
                                                    sb.append(jb6.M0(2131753806, null));
                                                } else if (i41 == 1) {
                                                    sb.append(jb6.M0(2131753779, null));
                                                } else if (i41 == 2) {
                                                    sb.append(jb6.M0(2131753800, null));
                                                } else if (i41 == 3) {
                                                    sb.append(jb6.M0(2131753807, null));
                                                }
                                                i11++;
                                            }
                                            i41++;
                                        } else if (i11 == 4) {
                                            sb.setLength(0);
                                            i13 = dataAutoDownloadActivity.photosRow;
                                            if (i == i13) {
                                                sb.append(jb6.M0(2131753791, null));
                                            } else {
                                                sb.append(jb6.a0("AutoDownloadUpToOnAllChats", null, 2131753772, gm.i0(j, false, false)));
                                            }
                                        } else if (i11 == 0) {
                                            sb.append(jb6.M0(2131753793, null));
                                        } else {
                                            i12 = dataAutoDownloadActivity.photosRow;
                                            sb = i == i12 ? new StringBuilder(jb6.a0("AutoDownloadOnFor", null, 2131753790, sb.toString())) : new StringBuilder(jb6.a0("AutoDownloadOnUpToFor", null, 2131753785, gm.i0(j, false, false), sb.toString()));
                                        }
                                    }
                                } else if (o.e) {
                                    sb = new StringBuilder(jb6.a0("AutoDownloadOn", null, 2131753792, sb.toString()));
                                    i11 = 1;
                                } else {
                                    sb = new StringBuilder(jb6.a0("AutoDownloadOff", null, 2131753793, sb.toString()));
                                    i11 = 0;
                                }
                                if (dataAutoDownloadActivity.h) {
                                    yn7Var.setChecked(i11 != 0);
                                }
                                boolean z10 = i11 != 0;
                                i14 = dataAutoDownloadActivity.storiesRow;
                                yn7Var.b(M0, sb, 0, z10, 0, true, i != i14, false);
                                break;
                            }
                        } else {
                            dataAutoDownloadActivity.r0((hla) view3);
                            break;
                        }
                    } else {
                        jf5 jf5Var2 = (jf5) view3;
                        if (i == dataAutoDownloadActivity.r) {
                            jf5Var2.setText(jb6.M0(2131753804, null));
                            break;
                        } else if (i == dataAutoDownloadActivity.w) {
                            jf5Var2.setText(jb6.M0(2131753773, null));
                            break;
                        }
                    }
                } else {
                    bjb bjbVar2 = (bjb) view3;
                    i3 = dataAutoDownloadActivity.autoDownloadRow;
                    if (i == i3) {
                        bjbVar2.setDrawCheckRipple(true);
                        bjbVar2.f(jb6.M0(2131753795, null), dr3Var.g, false);
                        bjbVar2.setTag(Integer.valueOf(dr3Var.g ? cmb.e6 : cmb.d6));
                        anb.h(dr3Var.g ? cmb.e6 : cmb.d6, null, bjbVar2);
                        break;
                    }
                }
                break;
            case 3:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj2;
                int i42 = u69Var.f;
                View view4 = u69Var.a;
                switch (i42) {
                    case 1:
                        vkb vkbVar2 = (vkb) view4;
                        vkbVar2.setCanDisable(false);
                        anb.X(vkbVar2.getTextView(), cmb.F6, null);
                        i16 = dataSettingsActivity.useLessDataForCallsRow;
                        if (i == i16) {
                            vkbVar2.setIcon(0);
                            int i43 = oc7.d1().getInt("VoipDataSaving", sic.c());
                            vkbVar2.c(jb6.M0(2131742913, null), i43 != 0 ? i43 != 1 ? i43 != 2 ? i43 != 3 ? null : jb6.M0(2131743480, null) : jb6.M0(2131743483, null) : jb6.M0(2131743481, null) : jb6.M0(2131743482, null), dataSettingsActivity.V, true);
                            dataSettingsActivity.V = false;
                            break;
                        } else {
                            i17 = dataSettingsActivity.proxyRow;
                            if (i == i17) {
                                vkbVar2.setIcon(0);
                                vkbVar2.b(jb6.M0(2131746334, null), false);
                                break;
                            } else {
                                i18 = dataSettingsActivity.resetDownloadRow;
                                if (i == i18) {
                                    vkbVar2.setIcon(0);
                                    vkbVar2.setCanDisable(true);
                                    anb.X(vkbVar2.getTextView(), cmb.o7, null);
                                    vkbVar2.b(jb6.M0(2131745844, null), false);
                                    break;
                                } else {
                                    i19 = dataSettingsActivity.clearDraftsRow;
                                    if (i == i19) {
                                        vkbVar2.setIcon(0);
                                        vkbVar2.b(jb6.M0(2131746576, null), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        jf5 jf5Var3 = (jf5) view4;
                        if (i == dataSettingsActivity.d) {
                            jf5Var3.setText(jb6.M0(2131753732, null));
                            break;
                        } else if (i == 0) {
                            jf5Var3.setText(jb6.M0(2131751613, null));
                            break;
                        } else if (i == dataSettingsActivity.N) {
                            jf5Var3.setText(jb6.M0(2131752549, null));
                            break;
                        } else if (i == dataSettingsActivity.P) {
                            jf5Var3.setText(jb6.M0(2131746344, null));
                            break;
                        } else if (i == dataSettingsActivity.y) {
                            jf5Var3.setText(jb6.M0(2131744123, null));
                            break;
                        } else if (i == dataSettingsActivity.J) {
                            jf5Var3.setText(jb6.M0(2131753729, null));
                            break;
                        } else if (i == dataSettingsActivity.S) {
                            jf5Var3.setText(jb6.M0(2131745652, null));
                            break;
                        }
                        break;
                    case 3:
                        bjb bjbVar3 = (bjb) view4;
                        if (i == dataSettingsActivity.E) {
                            bjbVar3.f(jb6.M0(2131751081, null), gda.x0, dataSettingsActivity.G != -1);
                            break;
                        } else if (i != dataSettingsActivity.F) {
                            if (i == dataSettingsActivity.H) {
                                bjbVar3.f("(beta only) Show MKV as Video", gda.z0, true);
                                break;
                            } else if (i == dataSettingsActivity.G) {
                                bjbVar3.f("(beta only) Stream All Videos", gda.y0, false);
                                break;
                            } else if (i == dataSettingsActivity.K) {
                                String M05 = jb6.M0(2131753730, null);
                                boolean z11 = gda.a;
                                bjbVar3.f(M05, e86.e(2048), true);
                                break;
                            } else if (i == dataSettingsActivity.L) {
                                String M06 = jb6.M0(2131753728, null);
                                boolean z12 = gda.a;
                                bjbVar3.f(M06, e86.e(1024), false);
                                break;
                            }
                        }
                        break;
                    case 4:
                        njb njbVar3 = (njb) view4;
                        if (i == dataSettingsActivity.I) {
                            njbVar3.setText(jb6.M0(2131751095, null));
                            break;
                        }
                        break;
                    case 5:
                        yn7 yn7Var2 = (yn7) view4;
                        i20 = dataSettingsActivity.saveToGalleryPeerRow;
                        if (i == i20) {
                            M03 = jb6.M0(2131745653, null);
                            tr9 tr9Var = pve.a;
                            i32 = ((d) dataSettingsActivity).currentAccount;
                            c = tr9Var.c(i32);
                            a = pve.a.a();
                        } else {
                            i21 = dataSettingsActivity.saveToGalleryGroupsRow;
                            if (i == i21) {
                                M03 = jb6.M0(2131745660, null);
                                tr9 tr9Var2 = pve.b;
                                i31 = ((d) dataSettingsActivity).currentAccount;
                                c = tr9Var2.c(i31);
                                a = pve.b.a();
                            } else {
                                i22 = dataSettingsActivity.saveToGalleryChannelsRow;
                                if (i == i22) {
                                    M03 = jb6.M0(2131745662, null);
                                    tr9 tr9Var3 = pve.c;
                                    i30 = ((d) dataSettingsActivity).currentAccount;
                                    c = tr9Var3.c(i30);
                                    z3 = pve.c.a();
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
                                                    sb2.append(jb6.M0(2131747931, null));
                                                } else {
                                                    if (z13) {
                                                        sb2.append(jb6.M0(2131753781, null));
                                                    }
                                                    if (z14) {
                                                        if (sb2.length() > 0) {
                                                            sb2.append(", ");
                                                        }
                                                        sb2.append(jb6.M0(2131753770, null));
                                                        sb2.append(String.format(" (%1$s)", gm.i0(jArr[1], true, false)));
                                                    }
                                                    if (z15) {
                                                        if (sb2.length() > 0) {
                                                            sb2.append(", ");
                                                        }
                                                        sb2.append(jb6.M0(2131753802, null));
                                                        sb2.append(String.format(" (%1$s)", gm.i0(jArr[er3.x(8)], true, false)));
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
                                    yn7Var2.setAnimationsEnabled(true);
                                    yn7Var2.b(str, charSequence2, 0, z3, 0, true, z2, false);
                                    break;
                                } else {
                                    if (i == dataSettingsActivity.e) {
                                        M02 = jb6.M0(2131742547, null);
                                        i28 = ((d) dataSettingsActivity).currentAccount;
                                        z4 = er3.q(i28).N.g;
                                        i29 = ((d) dataSettingsActivity).currentAccount;
                                        o2 = er3.q(i29).n();
                                    } else if (i == dataSettingsActivity.h) {
                                        M02 = jb6.M0(2131742549, null);
                                        i26 = ((d) dataSettingsActivity).currentAccount;
                                        z4 = er3.q(i26).O.g;
                                        i27 = ((d) dataSettingsActivity).currentAccount;
                                        o2 = er3.q(i27).p();
                                    } else {
                                        M02 = jb6.M0(2131742548, null);
                                        i23 = ((d) dataSettingsActivity).currentAccount;
                                        boolean z17 = er3.q(i23).P.g;
                                        i24 = ((d) dataSettingsActivity).currentAccount;
                                        o2 = er3.q(i24).o();
                                        i25 = dataSettingsActivity.resetDownloadRow;
                                        z2 = i25 >= 0;
                                        z3 = z17;
                                        str = M02;
                                        charSequence = null;
                                        if (o2 == null) {
                                        }
                                        yn7Var2.setAnimationsEnabled(true);
                                        yn7Var2.b(str, charSequence2, 0, z3, 0, true, z2, false);
                                    }
                                    z3 = z4;
                                    z2 = true;
                                    str = M02;
                                    charSequence = null;
                                    if (o2 == null) {
                                    }
                                    yn7Var2.setAnimationsEnabled(true);
                                    yn7Var2.b(str, charSequence2, 0, z3, 0, true, z2, false);
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
                        yn7Var2.setAnimationsEnabled(true);
                        yn7Var2.b(str, charSequence2, 0, z3, 0, true, z2, false);
                        break;
                    case 6:
                        xib xibVar3 = (xib) view4;
                        if (i == dataSettingsActivity.s) {
                            if (dataSettingsActivity.X) {
                                xibVar3.r(jb6.M0(2131744505, null), "", false, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                                xibVar = xibVar3;
                                xibVar.h(45, true, dataSettingsActivity.W);
                            } else {
                                xibVar = xibVar3;
                                String M07 = jb6.M0(2131744505, null);
                                long j2 = dataSettingsActivity.Y;
                                xibVar.r(M07, j2 <= 0 ? "" : gm.i0(j2, false, false), true, R.drawable.msg_filled_storageusage, -11565578, -13276952, false);
                                xibVar.h(45, false, dataSettingsActivity.W);
                            }
                            dataSettingsActivity.W = false;
                        } else {
                            xibVar = xibVar3;
                            if (i == dataSettingsActivity.w) {
                                i33 = ((d) dataSettingsActivity).currentAccount;
                                b0b c4 = b0b.c(i33);
                                xibVar.r(jb6.M0(2131748055, null), gm.i0(c4.e(2, 6) + c4.e(1, 6) + c4.e(0, 6) + c4.d(2, 6) + c4.d(1, 6) + c4.d(0, 6), false, false), true, R.drawable.msg_filled_datausage, -11154873, -14175180, false);
                            } else {
                                if (i == dataSettingsActivity.n) {
                                    String absolutePath = ((File) dataSettingsActivity.c.get(0)).getAbsolutePath();
                                    if (!TextUtils.isEmpty(gda.e0)) {
                                        int size = dataSettingsActivity.c.size();
                                        while (true) {
                                            if (i35 < size) {
                                                String absolutePath2 = ((File) dataSettingsActivity.c.get(i35)).getAbsolutePath();
                                                if (absolutePath2.startsWith(gda.e0)) {
                                                    absolutePath = absolutePath2;
                                                } else {
                                                    i35++;
                                                }
                                            }
                                        }
                                    }
                                    xibVar.r(jb6.M0(2131744509, null), jb6.M0((absolutePath == null || absolutePath.contains("/storage/emulated/")) ? 2131748945 : 2131745574, null), true, R.drawable.msg_filled_sdcard, -1007845, -1996271, false);
                                }
                                xibVar = xibVar;
                            }
                        }
                        xibVar.setOffsetFromImage(64);
                        break;
                }
            case 4:
                gg4 gg4Var = (gg4) u69Var.a;
                int id = gg4Var.b != null ? gg4Var.getId() : -1;
                eg4 eg4Var = (eg4) ((ig4) obj2).h.get(i);
                gg4Var.b = eg4Var;
                gg4Var.e = i;
                gg4Var.setContentDescription(eg4Var.b);
                gg4Var.requestLayout();
                boolean z18 = gg4Var.n;
                eg4 eg4Var2 = gg4Var.b;
                if (z18 != (eg4Var2 != null && eg4Var2.g)) {
                    gn.release(gg4Var, gg4Var.r);
                    gn.release(gg4Var, gg4Var.P);
                    gn.release(gg4Var, gg4Var.R);
                    gn.release(gg4Var, gg4Var.T);
                    if (gg4Var.m0) {
                        gg4Var.r = gn.update(gg4Var.b.g ? 26 : 0, gg4Var, gg4Var.r, gg4Var.s);
                        gg4Var.P = gn.update(gg4Var.b.g ? 26 : 0, gg4Var, gg4Var.P, gg4Var.Q);
                        gg4Var.R = gn.update(gg4Var.b.g ? 26 : 0, gg4Var, gg4Var.R, gg4Var.S);
                        gg4Var.T = gn.update(gg4Var.b.g ? 26 : 0, gg4Var, gg4Var.T, gg4Var.U);
                    }
                    gg4Var.n = gg4Var.b.g;
                }
                if (id != gg4Var.getId()) {
                    gg4Var.l0 = gg4Var.b.f ? 1.0f : 0.0f;
                    break;
                }
                break;
            case 5:
                Activity activity = (Activity) obj;
                gy0 gy0Var = (gy0) u69Var.a;
                dh4 dh4Var = (dh4) obj2;
                ArrayList arrayList2 = dh4Var.v1;
                ArrayList arrayList3 = dh4Var.u1;
                if (i < arrayList3.size()) {
                    anb.s(gy0Var.getImageView(), cmb.I5, null, PorterDuff.Mode.MULTIPLY);
                    ub7 ub7Var = (ub7) arrayList3.get(i);
                    anb.X(gy0Var.getTextView(), cmb.i5, null);
                    int i46 = ub7Var.g;
                    int i47 = oc7.t5;
                    int i48 = i46 & 31;
                    gy0Var.a(k47.A5(gw3.m(ub7Var.b, gy0Var.getTextView().getPaint().getFontMetricsInt(), false, null, 0), ub7Var.c, gy0Var.getTextView().getPaint().getFontMetricsInt(), false), 0, new kc2(dh4Var.getContext(), i48 == 3 ? R.drawable.msg_openprofile : ((i46 & 64) == 0 || i48 != 31) ? i48 == 8 ? R.drawable.msg_channel : i48 == 4 ? R.drawable.msg_groups : i48 == 1 ? R.drawable.msg_contacts : i48 == 16 ? R.drawable.msg_bots : R.drawable.msg_folders : R.drawable.msg_markunread, ub7Var.m), false);
                    gy0Var.getTextView().setEmojiColor(cmb.v0(cmb.Ei, dh4Var.J0));
                    for (int i49 = 0; i49 < arrayList2.size(); i49++) {
                        if (!ub7Var.a(j5.a(dh4Var.a), ((Long) arrayList2.get(i49)).longValue())) {
                            z7 = false;
                        }
                    }
                    gy0Var.setChecked(z7);
                    break;
                } else {
                    gy0Var.getImageView().setColorFilter((ColorFilter) null);
                    Drawable drawable3 = activity.getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable4 = activity.getResources().getDrawable(R.drawable.poll_add_plus);
                    ImageView imageView = gy0Var.getImageView();
                    int i50 = cmb.M6;
                    PorterDuff.Mode mode2 = PorterDuff.Mode.MULTIPLY;
                    anb.x(imageView, drawable3, i50, null, mode2);
                    anb.x(gy0Var.getImageView(), drawable4, cmb.j7, null, mode2);
                    sn2 sn2Var = new sn2(drawable3, drawable4);
                    anb.X(gy0Var.getTextView(), cmb.p6, null);
                    gy0Var.a(jb6.M0(2131751653, null), 0, sn2Var, false);
                    break;
                }
                break;
            case 6:
                View view5 = u69Var.a;
                dl4 dl4Var = (dl4) ((ll4) obj2).F.get(i);
                int i51 = dl4Var.b;
                ro roVar = dl4Var.f;
                String str2 = dl4Var.a;
                int F = wi8.F(i51);
                if (F != 0) {
                    if (F != 1) {
                        if (F == 2) {
                            kl4 kl4Var = (kl4) view5;
                            kl4Var.f = str2.toString();
                            kl4Var.d = ((Float) roVar.get(null)).floatValue();
                            kl4Var.b = dl4Var.d;
                            kl4Var.c = dl4Var.e;
                            kl4Var.e = roVar;
                            kl4Var.invalidate();
                            break;
                        }
                    } else {
                        jf5 jf5Var4 = (jf5) view5;
                        jf5Var4.setTextColor(cmb.w0(null, cmb.K6, false));
                        jf5Var4.setText(str2);
                        break;
                    }
                } else {
                    ae aeVar = (ae) view5;
                    aeVar.setTextColor(cmb.w0(null, cmb.i5, false));
                    aeVar.a(0, str2);
                    break;
                }
                break;
            case 7:
                ph6 ph6Var = (ph6) obj2;
                int i52 = u69Var.f;
                View view6 = u69Var.a;
                if (i52 != 0) {
                    if (i52 != 1) {
                        if (i52 != 3) {
                            if (i52 == 4) {
                                njb njbVar4 = (njb) view6;
                                if (i == ph6Var.s) {
                                    njbVar4.setText(jb6.M0(2131748499, null));
                                    break;
                                }
                            }
                        } else {
                            vkb vkbVar3 = (vkb) view6;
                            if (i == ph6Var.r) {
                                anb.X(vkbVar3.getTextView(), cmb.o7, null);
                                vkbVar3.b(jb6.M0(2131748498, null), false);
                                break;
                            }
                        }
                    } else {
                        ijb ijbVar = (ijb) view6;
                        if (i == ph6Var.c) {
                            ijbVar.b(R.drawable.msg_contact_add, jb6.M0(2131754465, null), jb6.M0(2131754464, null), true);
                            break;
                        } else if (i == ph6Var.d) {
                            ijbVar.b(R.drawable.msg_permissions, jb6.M0(2131745255, null), jb6.M0(2131745254, null), true);
                            break;
                        } else if (i == ph6Var.e) {
                            ijbVar.b(R.drawable.msg_clearcache, jb6.M0(2131752035, null), jb6.M0(2131752031, null), true);
                            break;
                        } else if (i == ph6Var.f) {
                            ijbVar.b(R.drawable.msg_newphone, jb6.M0(2131752490, null), jb6.M0(2131752489, null), true);
                            break;
                        } else if (i == ph6Var.h) {
                            ijbVar.b(R.drawable.msg_help, jb6.M0(2131751720, null), jb6.M0(2131751719, null), false);
                            break;
                        }
                    }
                } else {
                    jf5 jf5Var5 = (jf5) view6;
                    if (i == 0) {
                        jf5Var5.setText(jb6.M0(2131754235, null));
                        break;
                    }
                }
                break;
            case 8:
                G(u69Var, i);
                break;
            case 9:
                H(u69Var, i);
                break;
            case 10:
                z78 z78Var = (z78) u69Var.a;
                j68 j68Var = (j68) obj2;
                z78Var.setAlbumsCount(j68Var.f);
                while (true) {
                    byte b2 = j68Var.f;
                    if (i34 >= b2) {
                        z78Var.requestLayout();
                        break;
                    } else {
                        int i53 = (b2 * i) + i34;
                        if (i53 < j68Var.d.size()) {
                            z78Var.a(i34, (yn6) j68Var.d.get(i53));
                        } else {
                            z78Var.a(i34, null);
                        }
                        i34++;
                    }
                }
            case 11:
                I(u69Var, i);
                break;
            case 12:
                J(u69Var, i);
                break;
            case 13:
                K(u69Var, i);
                break;
            case 14:
                L(u69Var, i);
                break;
            case 15:
                M(u69Var, i);
                break;
            case 16:
                N(u69Var, i);
                break;
            case 17:
                O(u69Var, i);
                break;
            default:
                tgc tgcVar = (tgc) u69Var.a;
                vgc vgcVar = (vgc) obj2;
                sgc sgcVar = (sgc) vgcVar.h.get(i);
                tgcVar.a = sgcVar;
                tgcVar.setContentDescription(sgcVar.b);
                tgcVar.setAlpha(1.0f);
                tgcVar.requestLayout();
                if (vgcVar.n0 && (ugcVar = vgcVar.E) != null && ugcVar.D(i)) {
                    z5 = true;
                }
                tgcVar.setReordering(z5);
                break;
        }
    }

    @Override // y59
    public final void w(u69 u69Var, int i, List list) {
        int i2;
        boolean contains;
        switch (this.c) {
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) this.e;
                ArrayList arrayList = proxyListActivity.F;
                int i3 = u69Var.f;
                View view = u69Var.a;
                if (i3 == 5 && !list.isEmpty()) {
                    zv8 zv8Var = (zv8) view;
                    if (list.contains(1) && (contains = arrayList.contains(proxyListActivity.G.get(i - proxyListActivity.n))) != zv8Var.h) {
                        zv8Var.h = contains;
                        zv8Var.f.a(contains, true);
                    }
                    if (list.contains(2)) {
                        zv8Var.a(!arrayList.isEmpty(), true);
                        break;
                    }
                } else if (u69Var.f != 3 || !list.contains(0)) {
                    t(u69Var, i);
                    break;
                } else {
                    bjb bjbVar = (bjb) view;
                    i2 = proxyListActivity.useProxyRow;
                    if (i != i2) {
                        if (i == proxyListActivity.w) {
                            bjbVar.setChecked(gda.W0);
                            break;
                        }
                    } else {
                        bjbVar.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
            default:
                super.w(u69Var, i, list);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [p72] */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        View jf5Var;
        View view;
        FrameLayout frameLayout2;
        View view2;
        View jf5Var2;
        ylb ylbVar;
        ylb ylbVar2;
        ylb ylbVar3;
        ylb ylbVar4;
        ylb ylbVar5;
        View bjbVar;
        y68 y68Var;
        ViewGroup viewGroup2;
        View bbaVar;
        FrameLayout frameLayout3;
        byte b = this.c;
        byte b2 = 6;
        byte b3 = 7;
        Object obj = this.e;
        final byte b4 = 0;
        final byte b5 = 2;
        final byte b6 = 1;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                Context context = (Context) obj2;
                if (i == 0) {
                    frameLayout = new jf5(context);
                } else if (i == 1) {
                    frameLayout = new bjb(context);
                } else if (i == 2) {
                    vkb vkbVar = new vkb(context);
                    vkbVar.setCanDisable(true);
                    frameLayout = vkbVar;
                } else {
                    frameLayout = new njb(context);
                }
                frameLayout.setLayoutParams(new g69(-1, -2));
                return new b59(frameLayout);
            case 1:
                Context context2 = (Context) obj2;
                v72 v72Var = (v72) obj;
                boolean z = v72Var.n;
                ylb ylbVar6 = v72Var.a;
                switch (i) {
                    case 0:
                        jf5Var = new jf5((Context) obj2, cmb.K6, 21, 15, false, v72Var.a);
                        break;
                    case 1:
                        View bbaVar2 = new bba(context2, (hg9) null);
                        new sn2(new ColorDrawable(cmb.v0(cmb.Z6, ylbVar6)), cmb.W0(context2, R.drawable.greydivider, cmb.a7)).x = true;
                        jf5Var = bbaVar2;
                        break;
                    case 2:
                        jf5Var = new njb(context2, ylbVar6);
                        break;
                    case 3:
                        jf5Var = new xib(context2, ylbVar6);
                        break;
                    case 4:
                    case 11:
                        q72 q72Var = new q72(this, (Context) obj2, v72Var.J ? 1 : 0, v72Var.a, i);
                        if (i == 11 && !z) {
                            q72Var.setTextRight(98);
                            q72Var.b().setOnClickListener(new View.OnClickListener(this) { // from class: p72
                                public final /* synthetic */ s30 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    byte b7 = b4;
                                    s30 s30Var = this.b;
                                    switch (b7) {
                                        case 0:
                                            ((v72) s30Var.e).e0(-2);
                                            break;
                                        case 1:
                                            ((v72) s30Var.e).e0(-3);
                                            break;
                                        default:
                                            ((v72) s30Var.e).X(view3, (ng8) view3.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        q72Var.e();
                        q72Var.setIconsColor(cmb.n7);
                        q72Var.c(new r72(this, q72Var, i));
                        jf5Var = q72Var;
                        break;
                    case 5:
                    default:
                        t72 t72Var = new t72(this, (Context) obj2, v72Var.J ? 1 : 0, new View.OnClickListener(this) { // from class: p72
                            public final /* synthetic */ s30 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                byte b7 = b5;
                                s30 s30Var = this.b;
                                switch (b7) {
                                    case 0:
                                        ((v72) s30Var.e).e0(-2);
                                        break;
                                    case 1:
                                        ((v72) s30Var.e).e0(-3);
                                        break;
                                    default:
                                        ((v72) s30Var.e).X(view3, (ng8) view3.getParent(), true);
                                        break;
                                }
                            }
                        }, v72Var.a);
                        if (!z) {
                            t72Var.setTextRight(nm7.V1);
                            t72Var.b().setOnClickListener(new rc1((Object) this, (Object) t72Var, (byte) 11));
                        }
                        int i2 = cmb.n7;
                        t72Var.setIconsColor(i2);
                        jh2 jh2Var = t72Var.r;
                        if (jh2Var != null) {
                            jh2Var.getCheckBoxBase().i(gm.L(6.0f));
                            CheckBoxBase checkBoxBase = jh2Var.getCheckBoxBase();
                            float f = t72Var.a.e;
                            if (checkBoxBase.w != f) {
                                checkBoxBase.w = f;
                                checkBoxBase.b();
                            }
                        }
                        t72Var.getCheckBox().b(-1, i2, cmb.j7);
                        t72Var.c(new qz(this, t72Var, b5));
                        t72Var.setShowNextButton(true);
                        EditTextBoldCursor textView = t72Var.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new eg(this, t72Var, b5));
                        textView.setOnKeyListener(new w6(t72Var, b5));
                        jf5Var = t72Var;
                        break;
                    case 6:
                        jf5Var = new bjb(context2, ylbVar6);
                        break;
                    case 7:
                        s72 s72Var = new s72(this, context2, v72Var.J ? 1 : 0);
                        s72Var.e();
                        if (!z) {
                            s72Var.setTextRight(98);
                            s72Var.b().setOnClickListener(new View.OnClickListener(this) { // from class: p72
                                public final /* synthetic */ s30 b;

                                {
                                    this.b = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    byte b7 = b6;
                                    s30 s30Var = this.b;
                                    switch (b7) {
                                        case 0:
                                            ((v72) s30Var.e).e0(-2);
                                            break;
                                        case 1:
                                            ((v72) s30Var.e).e0(-3);
                                            break;
                                        default:
                                            ((v72) s30Var.e).X(view3, (ng8) view3.getParent(), true);
                                            break;
                                    }
                                }
                            });
                        }
                        s72Var.setIconsColor(cmb.n7);
                        s72Var.c(new qz(this, s72Var, b6));
                        jf5Var = s72Var;
                        break;
                    case 8:
                        View o72Var = new o72(context2, b4);
                        o72Var.setTag(-33024);
                        jf5Var = o72Var;
                        break;
                    case 9:
                        View sbVar = new sb(b2, context2, this);
                        sbVar.setTag(-33024);
                        jf5Var = sbVar;
                        break;
                    case 10:
                        lg8 lg8Var = new lg8(context2, ylbVar6);
                        lg8Var.getCheckBox().setIcon(R.drawable.permission_locked);
                        jf5Var = lg8Var;
                        break;
                }
                return kt6.h(jf5Var, jf5Var, -1, -2);
            case 2:
                Context context3 = (Context) obj2;
                if (i == 0) {
                    bjb bjbVar2 = new bjb(context3);
                    bjbVar2.d(cmb.f6, cmb.N6, cmb.O6, cmb.P6, cmb.Q6);
                    bjbVar2.setTypeface(gm.o());
                    bjbVar2.setHeight(56);
                    view = bjbVar2;
                } else if (i == 1) {
                    view = new bba(context3, (hg9) null);
                } else if (i == 2) {
                    view = new jf5(context3);
                } else if (i != 3) {
                    view = i != 4 ? new njb(context3) : new yn7(context3);
                } else {
                    hla hlaVar = new hla(context3, null);
                    hlaVar.setCallback(new wm2(this, (byte) 15));
                    view = hlaVar;
                }
                return kt6.h(view, view, -1, -2);
            case 3:
                Context context4 = (Context) obj2;
                View xibVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new xib(context4) : new yn7(context4) : new njb(context4) : new bjb(context4) : new jf5(context4, 22) : new vkb(context4) : new bba(context4, (hg9) null);
                return kt6.h(xibVar, xibVar, -1, -2);
            case 4:
                return new b59(new gg4((ig4) obj, (Context) obj2));
            case 5:
                gy0 gy0Var = new gy0(0, null, (Activity) obj2);
                gy0Var.setBackground(null);
                gy0Var.setLayoutParams(new g69(-1, -2));
                return new b59(gy0Var);
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                int F = wi8.F(wi8.G(3)[i]);
                if (F == 1) {
                    frameLayout2 = new jf5(launchActivity);
                } else if (F != 2) {
                    frameLayout2 = new ae(launchActivity, null);
                } else {
                    kl4 kl4Var = new kl4(launchActivity);
                    kl4Var.setWillNotDraw(false);
                    TextPaint textPaint = new TextPaint(1);
                    kl4Var.h = textPaint;
                    textPaint.setTextSize(gm.L(16.0f));
                    dx9 dx9Var = new dx9(launchActivity);
                    kl4Var.a = dx9Var;
                    dx9Var.setReportChanges(true);
                    dx9Var.setDelegate(new fk3(kl4Var));
                    dx9Var.setImportantForAccessibility(2);
                    kl4Var.addView(dx9Var, qoe.d(-1, 38.0f, 83, 5.0f, 29.0f, 47.0f, 0.0f));
                    frameLayout2 = kl4Var;
                }
                frameLayout2.setLayoutParams(new g69(-1, -2));
                return new b59(frameLayout2);
            case 7:
                Context context5 = (Context) obj2;
                if (i == 0) {
                    View jf5Var3 = new jf5(context5);
                    anb.h(cmb.c6, null, jf5Var3);
                    view2 = jf5Var3;
                } else if (i == 1) {
                    ijb ijbVar = new ijb(context5);
                    ijbVar.setMultilineDetail(true);
                    anb.h(cmb.c6, null, ijbVar);
                    view2 = ijbVar;
                } else if (i == 2) {
                    view2 = new bba(context5, (hg9) null);
                } else if (i != 3) {
                    view2 = new njb(context5);
                } else {
                    View vkbVar2 = new vkb(context5);
                    anb.h(cmb.c6, null, vkbVar2);
                    view2 = vkbVar2;
                }
                return kt6.h(view2, view2, -1, -2);
            case 8:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                Context context6 = (Context) obj2;
                if (i == 0) {
                    ylbVar = ((d) notificationsSettingsActivity).resourceProvider;
                    jf5Var2 = new jf5(context6, ylbVar);
                } else if (i == 1) {
                    ylbVar2 = ((d) notificationsSettingsActivity).resourceProvider;
                    jf5Var2 = new bjb(context6, ylbVar2);
                } else if (i == 2) {
                    jf5Var2 = new ijb(context6);
                } else if (i == 3) {
                    ylbVar3 = ((d) notificationsSettingsActivity).resourceProvider;
                    jf5Var2 = new yn7((Context) obj2, 21, 64, true, ylbVar3);
                } else if (i == 4) {
                    jf5Var2 = new bba(context6, (hg9) null);
                } else if (i != 5) {
                    ylbVar5 = ((d) notificationsSettingsActivity).resourceProvider;
                    jf5Var2 = new njb(context6, ylbVar5);
                } else {
                    ylbVar4 = ((d) notificationsSettingsActivity).resourceProvider;
                    jf5Var2 = new vkb(0, ylbVar4, context6);
                }
                return new b59(jf5Var2);
            case 9:
                Context context7 = (Context) obj2;
                if (i == 0) {
                    bjbVar = new bjb(context7);
                } else if (i == 1) {
                    bjbVar = new vkb(context7);
                } else if (i == 3) {
                    bjbVar = new jf5(context7);
                } else if (i != 4) {
                    bjbVar = new njb(context7);
                } else {
                    bjbVar = new nx7(context7);
                    bjbVar.setTag(-33024);
                }
                return new b59(bjbVar);
            case 10:
                Context context8 = (Context) obj2;
                z78 z78Var = new z78(context8);
                z78Var.e = new Paint();
                z78Var.b = new yn6[4];
                z78Var.a = new x78[4];
                for (int i3 = 0; i3 < 4; i3++) {
                    z78Var.a[i3] = new x78(z78Var, context8);
                    z78Var.addView(z78Var.a[i3]);
                    z78Var.a[i3].setVisibility(4);
                    z78Var.a[i3].setTag(Integer.valueOf(i3));
                    z78Var.a[i3].setOnClickListener(new m67(z78Var, (byte) 16));
                }
                z78Var.setDelegate(new h68(this, b4));
                return new b59(z78Var);
            case 11:
                Context context9 = (Context) obj2;
                if (i == 0) {
                    ylb ylbVar7 = ((n78) obj).J0;
                    z68 z68Var = new z68(context9);
                    z68Var.e = new ei7(z68Var, b3);
                    TextView textView2 = new TextView(context9);
                    z68Var.a = textView2;
                    textView2.setGravity(5);
                    textView2.setTextColor(-1);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setMaxLines(1);
                    textView2.setSingleLine(true);
                    textView2.setEllipsize(TextUtils.TruncateAt.END);
                    z68Var.addView(textView2, qoe.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    TextView textView3 = new TextView(context9);
                    z68Var.b = textView3;
                    anb.X(textView3, cmb.pg, ylbVar7);
                    textView3.setTextSize(1, 12.0f);
                    textView3.setGravity(5);
                    textView3.setSingleLine(true);
                    z68Var.addView(textView3, qoe.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
                    b78 b78Var = new b78(context9);
                    Paint paint = new Paint();
                    b78Var.a = paint;
                    Paint paint2 = new Paint(1);
                    b78Var.b = paint2;
                    b78Var.c = gm.L(16.0f);
                    b78Var.d = 0;
                    b78Var.e = 0.0f;
                    b78Var.f = false;
                    paint.setColor(-11711155);
                    paint2.setColor(-1);
                    z68Var.c = b78Var;
                    z68Var.addView(b78Var, qoe.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
                    z68Var.setSeekBarDelegate(new h68(this, b6));
                    y68Var = z68Var;
                } else {
                    y68 y68Var2 = new y68(context9);
                    y68Var2.setOnClickListener(new m67(this, (byte) 14));
                    y68Var = y68Var2;
                }
                return new b59(y68Var);
            case 12:
                w78 w78Var = (w78) obj;
                boolean z2 = w78Var.s0;
                Context context10 = (Context) obj2;
                if (i == 0) {
                    q68 q68Var = new q68(context10, null);
                    q68Var.setDelegate(new t78(this));
                    q68Var.getCheckFrame().setVisibility(w78Var.U != 0 ? 8 : 0);
                    viewGroup2 = q68Var;
                } else if (i == 1) {
                    ViewGroup frameLayout4 = new FrameLayout(context10);
                    frameLayout4.setLayoutParams(new g69(-1, -2));
                    RadialProgressView radialProgressView = new RadialProgressView(context10, null);
                    radialProgressView.setProgressColor(-11371101);
                    frameLayout4.addView(radialProgressView, qoe.c(-1.0f, -1));
                    viewGroup2 = frameLayout4;
                } else if (i == 2) {
                    viewGroup2 = new ida(1, null, context10);
                } else if (i != 3) {
                    aq3 aq3Var = new aq3(context10, null);
                    aq3Var.setForceDarkTheme(z2);
                    viewGroup2 = aq3Var;
                } else {
                    xib xibVar2 = new xib(23, context10, true);
                    xibVar2.setLayoutParams(new g69(-1, -2));
                    viewGroup2 = xibVar2;
                    if (z2) {
                        anb.W(xibVar2.a, w78Var.w0, null);
                        anb.s(xibVar2.e, cmb.hh, null, PorterDuff.Mode.MULTIPLY);
                        viewGroup2 = xibVar2;
                    }
                }
                return new b59(viewGroup2);
            case 13:
                Context context11 = (Context) obj2;
                a88 a88Var = new a88(context11);
                a88Var.setWillNotDraw(false);
                bf0 bf0Var = new bf0(context11);
                a88Var.a = bf0Var;
                bf0Var.setRoundRadius(gm.L(4.0f));
                a88Var.addView(bf0Var, qoe.c(-1.0f, -1));
                FrameLayout frameLayout5 = new FrameLayout(context11);
                a88Var.b = frameLayout5;
                a88Var.addView(frameLayout5, qoe.e(42, 42, 53));
                jp0 jp0Var = new jp0(context11);
                jp0Var.c = new Path();
                jp0Var.b = new float[8];
                jp0Var.d = new RectF();
                jp0Var.e = new Paint(1);
                a88Var.e = jp0Var;
                jp0Var.setWillNotDraw(false);
                jp0Var.setPadding(gm.L(3.0f), 0, gm.L(3.0f), 0);
                a88Var.addView(jp0Var, qoe.e(-1, 16, 83));
                jp0Var.addView(td4.k(context11, R.drawable.ic_video), qoe.e(-2, -2, 19));
                TextView textView4 = new TextView(context11);
                a88Var.d = textView4;
                textView4.setTextColor(-1);
                textView4.setTextSize(1, 12.0f);
                textView4.setImportantForAccessibility(2);
                jp0Var.addView(textView4, qoe.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
                jh2 jh2Var2 = new jh2(24, null, context11);
                a88Var.c = jh2Var2;
                jh2Var2.setDrawBackgroundAsArc(11);
                jh2Var2.b(cmb.V9, cmb.W9, cmb.U9);
                a88Var.addView(jh2Var2, qoe.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
                jh2Var2.setVisibility(0);
                a88Var.setFocusable(true);
                frameLayout5.setOnClickListener(new m67(this, (byte) 18));
                return new b59(a88Var);
            case 14:
                Context context12 = (Context) obj2;
                if (i == 0) {
                    bbaVar = new bba(context12, (hg9) null);
                } else if (i == 1) {
                    bbaVar = new vkb(context12);
                    anb.h(cmb.c6, null, bbaVar);
                } else if (i == 2) {
                    bbaVar = new jf5(context12);
                    anb.h(cmb.c6, null, bbaVar);
                } else if (i == 3) {
                    bbaVar = new bjb(context12);
                    anb.h(cmb.c6, null, bbaVar);
                } else if (i == 4) {
                    bbaVar = new njb(context12);
                } else if (i != 6) {
                    bbaVar = new zv8((ProxyListActivity) obj, context12);
                    anb.h(cmb.c6, null, bbaVar);
                } else {
                    bbaVar = new hla(context12, null);
                    anb.h(cmb.c6, null, bbaVar);
                }
                return kt6.h(bbaVar, bbaVar, -1, -2);
            case 15:
                Context context13 = (Context) obj2;
                mia miaVar = (mia) obj;
                if (i != 0) {
                    FrameLayout ct8Var = new ct8(context13, b3);
                    ct8Var.setWillNotDraw(false);
                    TextView textView5 = new TextView(context13);
                    miaVar.o1 = textView5;
                    anb.X(textView5, cmb.I5, miaVar.J0);
                    miaVar.o1.setTextSize(1, 14.0f);
                    miaVar.o1.setGravity(17);
                    miaVar.o1.setPadding(0, 0, 0, gm.L(8.0f));
                    ct8Var.addView(miaVar.o1, qoe.c(40.0f, -1));
                    frameLayout3 = ct8Var;
                } else {
                    frameLayout3 = new jia(54, miaVar.J0, context13, false);
                }
                return new b59(frameLayout3);
            case 16:
                return new b59(new edb((fdb) obj, ((fdb) obj2).getContext()));
            case 17:
                Context context14 = (Context) obj2;
                View hg3Var = i == 0 ? new hg3(context14, false) : new pa6(context14);
                hg3Var.setLayoutParams(new g69(-1, -2));
                return new b59(hg3Var);
            default:
                return new b59(new tgc((vgc) obj, (Context) obj2));
        }
    }

    @Override // y59
    public final void y(u69 u69Var) {
        int i;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 1:
                v72 v72Var = (v72) obj;
                wf8 wf8Var = v72Var.n1;
                boolean z = v72Var.n;
                int i2 = u69Var.f;
                View view = u69Var.a;
                if (i2 != 4) {
                    if (i2 != 11) {
                        if (i2 != 5) {
                            if (i2 == 7) {
                                ng8 ng8Var = (ng8) view;
                                ng8Var.setTag(1);
                                CharSequence charSequence = v72Var.Q;
                                ng8Var.o(charSequence != null ? charSequence : "", jb6.M0(2131754471, null), false);
                                ng8Var.setTag(null);
                                if (!z) {
                                    ng8Var.e.a(wf8Var.b(-3), false);
                                }
                                v72Var.i0(u69Var.b(), view);
                                break;
                            }
                        } else {
                            int b2 = u69Var.b();
                            ng8 ng8Var2 = (ng8) view;
                            ng8Var2.setTag(1);
                            ng8Var2.a.a(v72Var.c0, false);
                            int i3 = b2 - v72Var.u0;
                            ng8Var2.o(v72Var.L[i3], jb6.M0(z ? 2131743740 : 2131747507, null), true);
                            ng8Var2.setTag(null);
                            if (v72Var.l0 == b2) {
                                EditTextBoldCursor textView = ng8Var2.getTextView();
                                textView.requestFocus();
                                gm.E3(textView);
                                v72Var.l0 = -1;
                            }
                            if (!z) {
                                ng8Var2.e.a(wf8Var.b(i3), false);
                            }
                            v72Var.i0(b2, view);
                            break;
                        }
                    } else {
                        ng8 ng8Var3 = (ng8) view;
                        ng8Var3.setTag(1);
                        CharSequence charSequence2 = v72Var.P;
                        ng8Var3.o(charSequence2 != null ? charSequence2 : "", jb6.M0(2131746182, null), false);
                        ng8Var3.setTag(null);
                        ng8Var3.e.a(wf8Var.b(-2), false);
                        v72Var.i0(u69Var.b(), view);
                        break;
                    }
                } else {
                    ng8 ng8Var4 = (ng8) view;
                    ng8Var4.setTag(1);
                    CharSequence charSequence3 = v72Var.O;
                    ng8Var4.o(charSequence3 != null ? charSequence3 : "", jb6.M0(z ? 2131743738 : 2131746181, null), true);
                    ng8Var4.setTag(null);
                    v72Var.i0(u69Var.b(), view);
                    break;
                }
                break;
            case 3:
                if (u69Var.f == 3) {
                    bjb bjbVar = (bjb) u69Var.a;
                    int b3 = u69Var.b();
                    DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                    if (b3 != dataSettingsActivity.F) {
                        if (b3 != dataSettingsActivity.E) {
                            if (b3 != dataSettingsActivity.G) {
                                if (b3 != dataSettingsActivity.H) {
                                    if (b3 != dataSettingsActivity.K) {
                                        if (b3 == dataSettingsActivity.L) {
                                            boolean z2 = gda.a;
                                            bjbVar.setChecked(e86.e(1024));
                                            break;
                                        }
                                    } else {
                                        boolean z3 = gda.a;
                                        bjbVar.setChecked(e86.e(2048));
                                        break;
                                    }
                                } else {
                                    bjbVar.setChecked(gda.z0);
                                    break;
                                }
                            } else {
                                bjbVar.setChecked(gda.y0);
                                break;
                            }
                        } else {
                            bjbVar.setChecked(gda.x0);
                            break;
                        }
                    } else {
                        bjbVar.setChecked(gda.A0);
                        break;
                    }
                }
                break;
            case 14:
                ProxyListActivity proxyListActivity = (ProxyListActivity) obj;
                if (u69Var.f == 3) {
                    bjb bjbVar2 = (bjb) u69Var.a;
                    int b4 = u69Var.b();
                    i = proxyListActivity.useProxyRow;
                    if (b4 != i) {
                        if (b4 == proxyListActivity.w) {
                            bjbVar2.setChecked(gda.W0);
                            break;
                        }
                    } else {
                        bjbVar2.setChecked(proxyListActivity.d);
                        break;
                    }
                }
                break;
        }
    }

    @Override // y59
    public final void z(u69 u69Var) {
        switch (this.c) {
            case 1:
                v72 v72Var = (v72) this.e;
                int i = u69Var.f;
                if (i == 4 || i == 11 || i == 5) {
                    EditTextBoldCursor textView = ((ng8) u69Var.a).getTextView();
                    if (textView.isFocused()) {
                        if (v72Var.J) {
                            n72 n72Var = v72Var.y;
                            if (n72Var != null) {
                                n72Var.e();
                            }
                            v72Var.Z(true);
                        }
                        v72Var.h1 = null;
                        textView.clearFocus();
                        gm.t1(textView);
                        break;
                    }
                }
                break;
        }
    }

    public s30(ll4 ll4Var, LaunchActivity launchActivity) {
        this.c = (byte) 6;
        this.e = ll4Var;
        this.d = launchActivity;
    }

    public /* synthetic */ s30(Object obj, Object obj2, byte b) {
        this.c = b;
        this.e = obj;
        this.d = obj2;
    }

    public s30(ProxyListActivity proxyListActivity, Context context) {
        this.c = (byte) 14;
        this.e = proxyListActivity;
        this.d = context;
        C(true);
    }
}
