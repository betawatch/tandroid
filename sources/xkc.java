// default package

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class xkc {
    public static long a;

    public static boolean a(TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = tL_messageActionPhoneCall.reason;
        if (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed)) {
            Iterator<String> it = uc7.s1(yac.t0).X3.getStringSet("calls_access_hashes", Collections.EMPTY_SET).iterator();
            while (it.hasNext()) {
                String[] split = it.next().split(" ");
                if (split.length >= 2) {
                    if (split[0].equals(tL_messageActionPhoneCall.call_id + "")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void b(final TLRPC.User user, final TLRPC.Chat chat, final String str, final TLRPC.InputPeer inputPeer, boolean z, final boolean z2, final boolean z3, final boolean z4, final Activity activity, final e eVar, final k5 k5Var, boolean z5, boolean z6, boolean z7) {
        vc2 g1;
        TLRPC.ChatFull N0;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.ChatFull N02;
        TLRPC.Peer peer;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            if (SystemClock.elapsedRealtime() - a >= (chat != null ? jn7.d3 : 2000)) {
                if (z5 && chat != null && !z4 && (N02 = uc7.s1(k5Var.a).N0(chat.id)) != null && (peer = N02.groupcall_default_join_as) != null) {
                    final TLRPC.InputPeer j1 = uc7.s1(k5Var.a).j1(r47.B1(peer));
                    bw5.E0(activity, -chat.id, k5Var, new cf7() { // from class: pkc
                        @Override // cf7
                        public final void A(boolean z8) {
                            String str2 = str;
                            Activity activity2 = activity;
                            TLRPC.Chat chat2 = chat;
                            TLRPC.User user2 = user;
                            TLRPC.InputPeer inputPeer2 = j1;
                            boolean z9 = z2;
                            boolean z10 = z3;
                            e eVar2 = eVar;
                            k5 k5Var2 = k5Var;
                            if (z8 || str2 == null) {
                                xkc.b(user2, chat2, str2, inputPeer2, !z8, z9, z10, false, activity2, eVar2, k5Var2, false, false, false);
                                return;
                            }
                            vkc vkcVar = new vkc(activity2, chat2, user2, chat2, str2, inputPeer2, z9, z10, activity2, eVar2, k5Var2);
                            if (eVar2 != null) {
                                eVar2.showDialog(vkcVar);
                            }
                        }
                    });
                    return;
                }
                if (z5 && chat != null) {
                    bw5.F0(activity, -chat.id, k5Var, eVar, !z4 ? 1 : 0, null, new qkc(z4, activity, k5Var, chat, str, user, z2, z3, eVar));
                    return;
                }
                if (z6 && !z && (inputPeer instanceof TLRPC.TL_inputPeerUser) && chat != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.anonymous && (!xc2.T(chat) || chat.megagroup)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
                    String M0 = ob6.M0(xc2.W(chat) ? 2131743099 : 2131742958, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(xc2.W(chat) ? 2131743129 : 2131743021, null);
                    alertDialog$Builder.j(ob6.M0(2131743094, null), new fd() { // from class: rkc
                        @Override // fd
                        public final void w(id idVar2, int i) {
                            xkc.b(TLRPC.User.this, chat, str, inputPeer, false, z2, z3, z4, activity, eVar, k5Var, false, false, false);
                        }
                    });
                    ik8.y(null, 2131752570, alertDialog$Builder, null);
                    return;
                }
                if (chat != null && inputPeer != null && (N0 = uc7.s1(k5Var.a).N0(chat.id)) != null) {
                    if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                        N0.groupcall_default_join_as = tL_peerUser;
                        tL_peerUser.user_id = inputPeer.user_id;
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                        TLRPC.TL_peerChat tL_peerChat = new TLRPC.TL_peerChat();
                        N0.groupcall_default_join_as = tL_peerChat;
                        tL_peerChat.chat_id = inputPeer.chat_id;
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                        N0.groupcall_default_join_as = tL_peerChannel;
                        tL_peerChannel.channel_id = inputPeer.channel_id;
                    }
                    boolean z8 = N0 instanceof TLRPC.TL_chatFull;
                    int i = N0.flags;
                    if (z8) {
                        N0.flags = i | 32768;
                    } else {
                        N0.flags = i | 67108864;
                    }
                }
                if (chat != null && !z4 && (g1 = uc7.s1(k5Var.a).g1(chat.id, false, null)) != null && g1.k()) {
                    j95.T0((LaunchActivity) activity, k5Var, chat, inputPeer, z, str);
                    return;
                }
                a = SystemClock.elapsedRealtime();
                Intent intent = new Intent(activity, (Class<?>) VoIPService.class);
                if (user != null) {
                    intent.putExtra("user_id", user.id);
                } else {
                    intent.putExtra("chat_id", chat.id);
                    intent.putExtra("createGroupCall", z4);
                    intent.putExtra("hasFewPeers", z);
                    intent.putExtra("isRtmpStream", z7);
                    intent.putExtra("hash", str);
                    if (inputPeer != null) {
                        intent.putExtra("peerChannelId", inputPeer.channel_id);
                        intent.putExtra("peerChatId", inputPeer.chat_id);
                        intent.putExtra("peerUserId", inputPeer.user_id);
                        intent.putExtra("peerAccessHash", inputPeer.access_hash);
                    }
                }
                intent.putExtra("is_outgoing", true);
                intent.putExtra("start_incall_activity", true);
                intent.putExtra("video_call", z2);
                intent.putExtra("can_video_call", z3);
                intent.putExtra("account", yac.t0);
                try {
                    activity.startService(intent);
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
        }
    }

    public static int c() {
        boolean z = lq3.q(0).K.f;
        boolean z2 = lq3.q(0).L.f;
        boolean z3 = lq3.q(0).M.f;
        if (z || z2 || z3) {
            if (z && !z2 && !z3) {
                return 3;
            }
            if (z && z2 && !z3) {
                return 1;
            }
            if (z && z2 && z3) {
                return 2;
            }
            if (f11.a) {
                cc4.l("Invalid call data saving preset configuration: " + z + "/" + z2 + "/" + z3);
            }
        }
        return 0;
    }

    public static String d(String str) {
        Calendar calendar = Calendar.getInstance();
        return new File(a.b.getExternalFilesDir(null), String.format(Locale.US, "logs/%02d_%02d_%04d_%02d_%02d_%02d_%s.txt", Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), str)).getAbsolutePath();
    }

    public static String e(String str) {
        File file = new File(a.b.getCacheDir(), "voip_logs");
        if (!file.exists()) {
            file.mkdirs();
        }
        boolean z = f11.a;
        return new File(file, str.concat("_stats.log")).getAbsolutePath();
    }

    public static void f(TLRPC.User user, TLRPC.Chat chat, String str, boolean z, boolean z2, boolean z3, Boolean bool, Activity activity, e eVar, k5 k5Var) {
        k5 k5Var2;
        char c;
        long j;
        String str2;
        int i;
        if (activity != null) {
            if (user == null && chat == null) {
                return;
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null) {
                if (VoIPService.callIShouldHavePutIntoIntent == null) {
                    b(user, chat, str, null, false, z, z2, z3, activity, eVar, k5Var, bool != null ? bool.booleanValue() : true, true, false);
                    return;
                }
                return;
            }
            long j2 = user != null ? user.id : -chat.id;
            long callerId = sharedInstance.getCallerId();
            if (callerId == j2) {
                k5Var2 = k5Var;
                if (sharedInstance.getAccount() == k5Var2.a) {
                    if (user != null || !(activity instanceof LaunchActivity)) {
                        activity.startActivity(new Intent(activity, (Class<?>) LaunchActivity.class).setAction(user != null ? "voip" : "voip_chat"));
                        return;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        sharedInstance.setGroupCallHash(str);
                    }
                    j95.T0((LaunchActivity) activity, k5.a(yac.t0), null, null, false, null);
                    return;
                }
            } else {
                k5Var2 = k5Var;
            }
            if (sharedInstance.isConference()) {
                StringBuilder sb = new StringBuilder();
                c = 1;
                if (sharedInstance.groupCall != null) {
                    int account = sharedInstance.getAccount();
                    int i2 = 0;
                    int i3 = 0;
                    j = 0;
                    while (i2 < sharedInstance.groupCall.d.m()) {
                        int i4 = i2;
                        long n = wf3.n(((TLRPC.GroupCallParticipant) sharedInstance.groupCall.d.n(i2)).peer);
                        if (n != yac.h(account).e()) {
                            i3++;
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(wf3.r(account, n));
                            if (i3 >= 2) {
                                break;
                            }
                        }
                        i2 = i4 + 1;
                    }
                    if (i3 < sharedInstance.groupCall.d.m() - 1) {
                        sb.append(ob6.G((sharedInstance.groupCall.d.m() - 1) - i3, "AndOther", new Object[0]));
                    }
                } else {
                    j = 0;
                }
                i = j2 > j ? 2131742919 : 2131742918;
                str2 = sb.toString();
            } else {
                c = 1;
                j = 0;
                if (callerId > 0) {
                    TLRPC.User user2 = sharedInstance.getUser();
                    str2 = lv2.m(0, user2.first_name, user2.last_name);
                    i = j2 > 0 ? 2131742925 : 2131742924;
                } else {
                    str2 = sharedInstance.getChat().title;
                    i = j2 > 0 ? 2131742921 : 2131742922;
                }
            }
            String m = user != null ? lv2.m(0, user.first_name, user.last_name) : chat.title;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            String M0 = ob6.M0(callerId < j ? 2131742920 : 2131742923, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            Object[] objArr = new Object[2];
            objArr[0] = str2;
            objArr[c] = m;
            idVar.U = hl.S2(ob6.a0(null, null, i, objArr));
            alertDialog$Builder.j(ob6.M0(2131747558, null), new qkc(user, chat, str, z, z2, z3, activity, eVar, k5Var2));
            ik8.y(null, 2131752570, alertDialog$Builder, null);
        }
    }

    public static void g(Activity activity, int i, TLRPC.InputGroupCall inputGroupCall, boolean z, TLRPC.GroupCall groupCall, HashSet hashSet) {
        if (activity == null) {
            return;
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().hangUp(new q25(activity, i, inputGroupCall, z, groupCall, hashSet));
            return;
        }
        a = SystemClock.elapsedRealtime();
        Intent intent = new Intent(activity, (Class<?>) VoIPService.class);
        intent.putExtra("chat_id", 0L);
        int i2 = 0;
        intent.putExtra("createGroupCall", false);
        intent.putExtra("hasFewPeers", false);
        intent.putExtra("isRtmpStream", false);
        intent.putExtra("hash", (String) null);
        intent.putExtra("is_outgoing", true);
        intent.putExtra("start_incall_activity", true);
        intent.putExtra("video_call", false);
        SerializedData serializedData = new SerializedData(inputGroupCall.getObjectSize());
        inputGroupCall.serializeToStream(serializedData);
        intent.putExtra("joinConference", serializedData.toByteArray());
        if (groupCall != null) {
            SerializedData serializedData2 = new SerializedData(groupCall.getObjectSize());
            groupCall.serializeToStream(serializedData2);
            intent.putExtra("joinConferenceCall", serializedData2.toByteArray());
        }
        if (hashSet != null) {
            long[] jArr = new long[hashSet.size()];
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                jArr[i2] = ((Long) it.next()).longValue();
                i2++;
            }
            intent.putExtra("inviteUsers", jArr);
        }
        intent.putExtra("account", i);
        intent.putExtra("video_call", z);
        intent.putExtra("can_video_call", true);
        try {
            activity.startService(intent);
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    public static void h(Activity activity, Runnable runnable, int i) {
        boolean z = i == 102;
        if (!activity.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO") || (z && !activity.shouldShowRequestPermissionRationale("android.permission.CAMERA"))) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            SpannableStringBuilder S2 = hl.S2(ob6.M0(z ? 2131742936 : 2131742935, null));
            id idVar = alertDialog$Builder.a;
            idVar.U = S2;
            alertDialog$Builder.j(ob6.M0(2131745223, null), new oe(activity, (byte) 4));
            alertDialog$Builder.g(ob6.M0(2131751737, null), null);
            idVar.setOnDismissListener(new ud(runnable, (byte) 3));
            int i2 = z ? R.raw.permission_request_camera : R.raw.permission_request_microphone;
            int i3 = aob.L5;
            alertDialog$Builder.l(i2, 72, aob.w0(null, i3, false), null);
            alertDialog$Builder.m(i3, null);
            alertDialog$Builder.o();
        }
    }

    public static void i(Activity activity) {
        final SharedPreferences e1 = uc7.e1();
        final byte b = 1;
        LinearLayout m = bs2.m(activity, 1);
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setText("Please only change these settings if you know exactly what they do.");
        yob.X(textView, aob.j5, null);
        m.addView(textView, tre.k(16.0f, 8.0f, 16.0f, 8.0f, -1, -2));
        final wkb wkbVar = new wkb(activity);
        final byte b2 = 0;
        wkbVar.f("Force TCP", e1.getBoolean("dbg_force_tcp_in_calls", false), false);
        wkbVar.setOnClickListener(new View.OnClickListener() { // from class: tkc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                wkb wkbVar2 = wkbVar;
                SharedPreferences sharedPreferences = e1;
                switch (b3) {
                    case 0:
                        boolean z = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        boolean z2 = !z;
                        edit.putBoolean("dbg_force_tcp_in_calls", z2);
                        edit.commit();
                        wkbVar2.setChecked(z2);
                        break;
                    case 1:
                        boolean z3 = sharedPreferences.getBoolean("dbg_dump_call_stats", false);
                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                        boolean z4 = !z3;
                        edit2.putBoolean("dbg_dump_call_stats", z4);
                        edit2.commit();
                        wkbVar2.setChecked(z4);
                        break;
                    default:
                        boolean z5 = sharedPreferences.getBoolean("dbg_force_connection_service", false);
                        SharedPreferences.Editor edit3 = sharedPreferences.edit();
                        boolean z6 = !z5;
                        edit3.putBoolean("dbg_force_connection_service", z6);
                        edit3.commit();
                        wkbVar2.setChecked(z6);
                        break;
                }
            }
        });
        m.addView(wkbVar);
        if (f11.a) {
            final wkb wkbVar2 = new wkb(activity);
            wkbVar2.f("Dump detailed stats", e1.getBoolean("dbg_dump_call_stats", false), false);
            wkbVar2.setOnClickListener(new View.OnClickListener() { // from class: tkc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b3 = b;
                    wkb wkbVar22 = wkbVar2;
                    SharedPreferences sharedPreferences = e1;
                    switch (b3) {
                        case 0:
                            boolean z = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z2 = !z;
                            edit.putBoolean("dbg_force_tcp_in_calls", z2);
                            edit.commit();
                            wkbVar22.setChecked(z2);
                            break;
                        case 1:
                            boolean z3 = sharedPreferences.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences.edit();
                            boolean z4 = !z3;
                            edit2.putBoolean("dbg_dump_call_stats", z4);
                            edit2.commit();
                            wkbVar22.setChecked(z4);
                            break;
                        default:
                            boolean z5 = sharedPreferences.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences.edit();
                            boolean z6 = !z5;
                            edit3.putBoolean("dbg_force_connection_service", z6);
                            edit3.commit();
                            wkbVar22.setChecked(z6);
                            break;
                    }
                }
            });
            m.addView(wkbVar2);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            final wkb wkbVar3 = new wkb(activity);
            wkbVar3.f("Enable ConnectionService", e1.getBoolean("dbg_force_connection_service", false), false);
            final byte b3 = 2;
            wkbVar3.setOnClickListener(new View.OnClickListener() { // from class: tkc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b32 = b3;
                    wkb wkbVar22 = wkbVar3;
                    SharedPreferences sharedPreferences = e1;
                    switch (b32) {
                        case 0:
                            boolean z = sharedPreferences.getBoolean("dbg_force_tcp_in_calls", false);
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            boolean z2 = !z;
                            edit.putBoolean("dbg_force_tcp_in_calls", z2);
                            edit.commit();
                            wkbVar22.setChecked(z2);
                            break;
                        case 1:
                            boolean z3 = sharedPreferences.getBoolean("dbg_dump_call_stats", false);
                            SharedPreferences.Editor edit2 = sharedPreferences.edit();
                            boolean z4 = !z3;
                            edit2.putBoolean("dbg_dump_call_stats", z4);
                            edit2.commit();
                            wkbVar22.setChecked(z4);
                            break;
                        default:
                            boolean z5 = sharedPreferences.getBoolean("dbg_force_connection_service", false);
                            SharedPreferences.Editor edit3 = sharedPreferences.edit();
                            boolean z6 = !z5;
                            edit3.putBoolean("dbg_force_connection_service", z6);
                            edit3.commit();
                            wkbVar22.setChecked(z6);
                            break;
                    }
                }
            });
            m.addView(wkbVar3);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.S = ob6.M0(2131751610, null);
        alertDialog$Builder.n(m);
        alertDialog$Builder.o();
    }

    public static void j(final Activity activity, azb azbVar, boolean z, final long j, final long j2, final int i, final boolean z2) {
        File file;
        String str;
        String str2;
        String M0;
        String str3;
        boolean z3 = f11.a;
        File file2 = new File(a.b.getExternalFilesDir(null), "logs");
        String[] list = file2.list();
        if (list != null) {
            for (String str4 : list) {
                if (str4.endsWith("voip" + j + ".txt")) {
                    file = new File(file2, str4);
                    break;
                }
            }
        }
        File file3 = new File(a.b.getCacheDir(), "voip_logs");
        if (!file3.exists()) {
            file3.mkdirs();
        }
        file = new File(file3, j + ".log");
        final File file4 = file;
        final int[] iArr = {0};
        int i2 = 1;
        LinearLayout m = bs2.m(activity, 1);
        int L = hl.L(16.0f);
        m.setPadding(L, L, L, 0);
        final TextView textView = new TextView(activity);
        textView.setTextSize(2, 16.0f);
        yob.X(textView, aob.j5, null);
        uh9.q(textView, 17, null, 2131742908);
        m.addView(textView);
        final rh0 rh0Var = new rh0(activity);
        rh0Var.c = new Paint();
        rh0Var.d = (byte) 5;
        rh0Var.e = 0;
        rh0Var.a = BitmapFactory.decodeResource(rh0Var.getResources(), R.drawable.ic_rating_star_filled).extractAlpha();
        rh0Var.b = BitmapFactory.decodeResource(rh0Var.getResources(), R.drawable.ic_rating_star).extractAlpha();
        m.addView(rh0Var, tre.t(-2, -2, 1, 0, 16, 0, 0));
        final LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        y00 y00Var = new y00((byte) 16);
        if (z) {
            str = "distorted_video";
            str2 = "pixelated_video";
        } else {
            str = null;
            str2 = null;
        }
        String[] strArr = {str, str2, "echo", "noise", "interruptions", "distorted_speech", "silent_local", "silent_remote", "dropped"};
        int i3 = 0;
        while (i3 < 9) {
            if (strArr[i3] != null) {
                sg2 sg2Var = new sg2(activity, i2);
                sg2Var.setClipToPadding(false);
                sg2Var.setTag(strArr[i3]);
                switch (i3) {
                    case 0:
                        M0 = ob6.M0(2131746143, null);
                        str3 = M0;
                        break;
                    case 1:
                        M0 = ob6.M0(2131746142, null);
                        str3 = M0;
                        break;
                    case 2:
                        M0 = ob6.M0(2131746148, null);
                        str3 = M0;
                        break;
                    case 3:
                        M0 = ob6.M0(2131746146, null);
                        str3 = M0;
                        break;
                    case 4:
                        M0 = ob6.M0(2131746147, null);
                        str3 = M0;
                        break;
                    case 5:
                        M0 = ob6.M0(2131746150, null);
                        str3 = M0;
                        break;
                    case 6:
                        M0 = ob6.M0(2131746145, null);
                        str3 = M0;
                        break;
                    case 7:
                        M0 = ob6.M0(2131746144, null);
                        str3 = M0;
                        break;
                    case 8:
                        M0 = ob6.M0(2131746149, null);
                        str3 = M0;
                        break;
                    default:
                        str3 = null;
                        break;
                }
                sg2Var.e(str3, null, false, false, false);
                sg2Var.setOnClickListener(y00Var);
                sg2Var.setTag(strArr[i3]);
                linearLayout.addView(sg2Var);
            }
            i3++;
            i2 = 1;
        }
        m.addView(linearLayout, tre.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        linearLayout.setVisibility(8);
        final EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(activity);
        editTextBoldCursor.setHint(ob6.M0(2131743059, null));
        editTextBoldCursor.setInputType(147457);
        yob.X(editTextBoldCursor, aob.j5, null);
        yob.D(editTextBoldCursor, aob.t5, null);
        editTextBoldCursor.setBackground(null);
        yob.F(editTextBoldCursor, aob.u5, aob.v5, aob.q7, null);
        editTextBoldCursor.setPadding(0, hl.L(4.0f), 0, hl.L(4.0f));
        editTextBoldCursor.setTextSize(1, 18.0f);
        editTextBoldCursor.setVisibility(8);
        m.addView(editTextBoldCursor, tre.k(8.0f, 8.0f, 8.0f, 0.0f, -1, -2));
        final boolean[] zArr = {true};
        final sg2 sg2Var2 = new sg2(activity, 1);
        jjb jjbVar = new jjb((byte) 14, (KeyEvent.Callback) sg2Var2, (Object) zArr);
        sg2Var2.e(ob6.M0(2131752585, null), null, true, false, false);
        sg2Var2.setClipToPadding(false);
        sg2Var2.setOnClickListener(jjbVar);
        m.addView(sg2Var2, tre.k(-8.0f, 0.0f, -8.0f, 0.0f, -1, -2));
        final TextView textView2 = new TextView(activity);
        textView2.setTextSize(2, 14.0f);
        ik8.x(textView2, aob.r5, null, null, 2131752584);
        textView2.setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        textView2.setOnClickListener(jjbVar);
        m.addView(textView2);
        sg2Var2.setVisibility(8);
        textView2.setVisibility(8);
        if (!file4.exists()) {
            zArr[0] = false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.S = ob6.M0(2131752595, null);
        alertDialog$Builder.n(m);
        alertDialog$Builder.j(ob6.M0(2131745368, null), new vr9((byte) 16));
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.a.setOnDismissListener(new dl8(azbVar, (byte) 15));
        final id idVar = alertDialog$Builder.a;
        if (f11.a && file4.exists()) {
            yw9 yw9Var = new yw9(activity, file4, (byte) 23);
            idVar.s0 = "Send log";
            idVar.t0 = yw9Var;
        }
        idVar.show();
        idVar.getWindow().setSoftInputMode(3);
        final View c = idVar.c(-1);
        c.setEnabled(false);
        rh0Var.setOnRatingChangeListener(new em0(c));
        c.setOnClickListener(new View.OnClickListener() { // from class: okc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                rh0 rh0Var2 = rh0.this;
                int rating = rh0Var2.getRating();
                LinearLayout linearLayout2 = linearLayout;
                EditTextBoldCursor editTextBoldCursor2 = editTextBoldCursor;
                File file5 = file4;
                id idVar2 = idVar;
                if (rating < 4) {
                    int[] iArr2 = iArr;
                    if (iArr2[0] != 1) {
                        iArr2[0] = 1;
                        rh0Var2.setVisibility(8);
                        textView.setVisibility(8);
                        idVar2.setTitle(ob6.M0(2131752586, null));
                        editTextBoldCursor2.setVisibility(0);
                        if (file5.exists()) {
                            sg2Var2.setVisibility(0);
                            textView2.setVisibility(0);
                        }
                        linearLayout2.setVisibility(0);
                        ((TextView) c).setText(ob6.M0(2131745368, null).toUpperCase());
                        return;
                    }
                }
                int i4 = yac.t0;
                TL_phone.setCallRating setcallrating = new TL_phone.setCallRating();
                setcallrating.rating = rh0Var2.getRating();
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < linearLayout2.getChildCount(); i5++) {
                    sg2 sg2Var3 = (sg2) linearLayout2.getChildAt(i5);
                    if (sg2Var3.b()) {
                        arrayList.add("#" + sg2Var3.getTag());
                    }
                }
                if (setcallrating.rating < 5) {
                    setcallrating.comment = editTextBoldCursor2.getText().toString();
                } else {
                    setcallrating.comment = "";
                }
                boolean isEmpty = arrayList.isEmpty();
                boolean[] zArr2 = zArr;
                if (!isEmpty && !zArr2[0]) {
                    setcallrating.comment += " " + TextUtils.join(" ", arrayList);
                }
                TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
                setcallrating.peer = tL_inputPhoneCall;
                tL_inputPhoneCall.access_hash = j2;
                tL_inputPhoneCall.id = j;
                setcallrating.user_initiative = z2;
                ConnectionsManager.getInstance(i).sendRequest(setcallrating, new rt(i4, zArr2, file5, setcallrating, arrayList, activity));
                idVar2.dismiss();
            }
        });
    }

    public static void k(Activity activity, TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall) {
        Iterator<String> it = uc7.s1(yac.t0).X3.getStringSet("calls_access_hashes", Collections.EMPTY_SET).iterator();
        while (it.hasNext()) {
            String[] split = it.next().split(" ");
            if (split.length >= 2) {
                if (split[0].equals(tL_messageActionPhoneCall.call_id + "")) {
                    try {
                        j(activity, null, tL_messageActionPhoneCall.video, tL_messageActionPhoneCall.call_id, Long.parseLong(split[1]), yac.t0, true);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
        }
    }

    public static void l(TLRPC.Chat chat, String str, boolean z, Boolean bool, Activity activity, e eVar, k5 k5Var) {
        if (activity == null) {
            return;
        }
        if (ConnectionsManager.getInstance(yac.t0).getConnectionState() == 3) {
            f(null, chat, str, false, false, z, bool, activity, eVar, k5Var);
            return;
        }
        byte b = 1;
        boolean z2 = Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        String M0 = ob6.M0(z2 ? 2131742928 : 2131742926, null);
        id idVar = alertDialog$Builder.a;
        idVar.S = M0;
        idVar.U = ob6.M0(z2 ? 2131743007 : 2131743008, null);
        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
        if (z2) {
            Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                alertDialog$Builder.h(ob6.M0(2131742927, null), new ukc(activity, intent, b));
            }
        }
        try {
            alertDialog$Builder.o();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(TLRPC.User user, boolean z, boolean z2, Activity activity, TLRPC.UserFull userFull, k5 k5Var) {
        int i;
        if (k5Var == null) {
            if (uc7.s1(yac.t0).x2()) {
                i = yac.t0;
                i5.b(i);
                return;
            }
            if (userFull == null && userFull.phone_calls_private) {
                jj.i0(activity, k5Var.a, user.id);
                return;
            }
            byte b = 0;
            if (ConnectionsManager.getInstance(yac.t0).getConnectionState() != 3) {
                ArrayList arrayList = new ArrayList();
                if (activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                }
                if (z && activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    arrayList.add("android.permission.CAMERA");
                }
                if (arrayList.isEmpty()) {
                    f(user, null, null, z, z2, false, null, activity, null, k5Var);
                    return;
                } else {
                    activity.requestPermissions((String[]) arrayList.toArray(new String[0]), z ? jn7.m1 : 101);
                    return;
                }
            }
            boolean z3 = Settings.System.getInt(activity.getContentResolver(), "airplane_mode_on", 0) != 0;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
            String M0 = ob6.M0(z3 ? 2131742928 : 2131742926, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(z3 ? 2131742929 : 2131742930, null);
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            if (z3) {
                Intent intent = new Intent("android.settings.AIRPLANE_MODE_SETTINGS");
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    alertDialog$Builder.h(ob6.M0(2131742927, null), new ukc(activity, intent, b));
                }
            }
            try {
                alertDialog$Builder.o();
                return;
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        int i2 = k5Var.a;
        if (uc7.s1(i2).x2()) {
            i = i2;
            i5.b(i);
            return;
        }
        if (userFull == null) {
        }
        byte b2 = 0;
        if (ConnectionsManager.getInstance(yac.t0).getConnectionState() != 3) {
        }
    }
}
