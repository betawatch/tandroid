// default package

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class xoe {
    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            jg4.c();
            jg4 c = jg4.c();
            c.a();
            Context context = c.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Intent intent) {
        int parseInt;
        int i;
        String string;
        String string2;
        char c;
        String string3;
        String string4;
        long parseLong;
        ed7 ed7Var;
        String str;
        String str2;
        if (d(intent)) {
            c("_nr", intent.getExtras());
        }
        int i2 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : a()) {
            f1c f1cVar = (f1c) FirebaseMessaging.m.get();
            if (f1cVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            if (intent == null) {
                ed7Var = null;
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    parseInt = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            parseInt = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                        }
                    }
                    i = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            jg4 c2 = jg4.c();
                            Object obj2 = qg4.l;
                            string = (String) Tasks.await(((qg4) c2.b(rg4.class)).e());
                        } catch (InterruptedException | ExecutionException e) {
                            sdb.b(e);
                            return;
                        }
                    }
                    String str3 = string;
                    jg4 c3 = jg4.c();
                    c3.a();
                    String packageName = c3.a.getPackageName();
                    cd7 cd7Var = !z24.U(extras) ? cd7.c : cd7.b;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 == null) {
                        if (!"1".equals(extras.getString("google.priority_reduced"))) {
                            string2 = extras.getString("google.priority");
                        }
                        c = 2;
                        if (c == 2) {
                            i2 = 5;
                        } else if (c == 1) {
                            i2 = 10;
                        }
                        int i3 = i2;
                        string3 = extras.getString("google.message_id");
                        if (string3 == null) {
                            string3 = extras.getString("message_id");
                        }
                        String str4 = string3 != null ? string3 : "";
                        string4 = extras.getString("from");
                        if (string4 != null || !string4.startsWith("/topics/")) {
                            string4 = null;
                        }
                        String str5 = string4 != null ? string4 : "";
                        String string5 = extras.getString("collapse_key");
                        String str6 = string5 != null ? string5 : "";
                        String string6 = extras.getString("google.c.a.m_l");
                        String str7 = string6 != null ? string6 : "";
                        String string7 = extras.getString("google.c.a.c_l");
                        String str8 = string7 != null ? string7 : "";
                        if (extras.containsKey("google.c.sender.id")) {
                            try {
                                parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException e2) {
                                Log.w("FirebaseMessaging", "error parsing project number", e2);
                            }
                            ed7Var = new ed7(parseLong > 0 ? parseLong : 0L, str4, str3, cd7Var, packageName, str6, i3, i, str5, str7, str8);
                        }
                        jg4 c4 = jg4.c();
                        xg4 xg4Var = c4.c;
                        c4.a();
                        str = xg4Var.e;
                        if (str != null) {
                            try {
                                parseLong = Long.parseLong(str);
                            } catch (NumberFormatException e3) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e3);
                            }
                            ed7Var = new ed7(parseLong > 0 ? parseLong : 0L, str4, str3, cd7Var, packageName, str6, i3, i, str5, str7, str8);
                        }
                        c4.a();
                        str2 = xg4Var.b;
                        if (str2.startsWith("1:")) {
                            String[] split = str2.split(":");
                            if (split.length >= 2) {
                                String str9 = split[1];
                                if (!str9.isEmpty()) {
                                    try {
                                        parseLong = Long.parseLong(str9);
                                    } catch (NumberFormatException e4) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e4);
                                    }
                                }
                            }
                            parseLong = 0;
                        } else {
                            try {
                                parseLong = Long.parseLong(str2);
                            } catch (NumberFormatException e5) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e5);
                            }
                        }
                        ed7Var = new ed7(parseLong > 0 ? parseLong : 0L, str4, str3, cd7Var, packageName, str6, i3, i, str5, str7, str8);
                    }
                    if ("high".equals(string2)) {
                        if (!"normal".equals(string2)) {
                            c = 0;
                        }
                        c = 2;
                    } else {
                        c = 1;
                    }
                    if (c == 2) {
                    }
                    int i32 = i2;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                    }
                    if (string3 != null) {
                    }
                    string4 = extras.getString("from");
                    if (string4 != null) {
                    }
                    string4 = null;
                    if (string4 != null) {
                    }
                    String string52 = extras.getString("collapse_key");
                    if (string52 != null) {
                    }
                    String string62 = extras.getString("google.c.a.m_l");
                    if (string62 != null) {
                    }
                    String string72 = extras.getString("google.c.a.c_l");
                    if (string72 != null) {
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                    }
                    jg4 c42 = jg4.c();
                    xg4 xg4Var2 = c42.c;
                    c42.a();
                    str = xg4Var2.e;
                    if (str != null) {
                    }
                    c42.a();
                    str2 = xg4Var2.b;
                    if (str2.startsWith("1:")) {
                    }
                    ed7Var = new ed7(parseLong > 0 ? parseLong : 0L, str4, str3, cd7Var, packageName, str6, i32, i, str5, str7, str8);
                }
                i = parseInt;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                }
                String str32 = string;
                jg4 c32 = jg4.c();
                c32.a();
                String packageName2 = c32.a.getPackageName();
                cd7 cd7Var2 = !z24.U(extras) ? cd7.c : cd7.b;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                }
                if ("high".equals(string2)) {
                }
                if (c == 2) {
                }
                int i322 = i2;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 != null) {
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                }
                string4 = null;
                if (string4 != null) {
                }
                String string522 = extras.getString("collapse_key");
                if (string522 != null) {
                }
                String string622 = extras.getString("google.c.a.m_l");
                if (string622 != null) {
                }
                String string722 = extras.getString("google.c.a.c_l");
                if (string722 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                jg4 c422 = jg4.c();
                xg4 xg4Var22 = c422.c;
                c422.a();
                str = xg4Var22.e;
                if (str != null) {
                }
                c422.a();
                str2 = xg4Var22.b;
                if (str2.startsWith("1:")) {
                }
                ed7Var = new ed7(parseLong > 0 ? parseLong : 0L, str4, str32, cd7Var2, packageName2, str6, i322, i, str5, str7, str8);
            }
            if (ed7Var != null) {
                try {
                    ((g1c) f1cVar).a("FCM_CLIENT_EVENT_LOGGING", new s24("proto"), new yw6((byte) 27)).a(new n90(null, new fd7(ed7Var), cj8.a, new ha0(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new fyb((byte) 3));
                } catch (RuntimeException e6) {
                    Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e6);
                }
            }
        }
    }

    public static void c(String str, Bundle bundle) {
        try {
            jg4.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = z24.U(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            if (jg4.c().b(qj.class) == null) {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            } else {
                fyb.g();
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean d(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }
}
