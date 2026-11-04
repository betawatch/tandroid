package x7;

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
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a7 {
    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            n9.h.c();
            n9.h c2 = n9.h.c();
            c2.a();
            Context context = c2.a;
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Intent intent) {
        int parseInt;
        int i3;
        String string;
        String string2;
        char c2;
        String string3;
        String string4;
        long parseLong;
        ab.d dVar;
        String str;
        String str2;
        if (d(intent)) {
            c("_nr", intent.getExtras());
        }
        int i10 = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : a()) {
            k5.f fVar = (k5.f) FirebaseMessaging.n.get();
            if (fVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            if (intent == null) {
                dVar = null;
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
                    i3 = 0;
                    string = extras.getString("google.to");
                    if (TextUtils.isEmpty(string)) {
                        try {
                            n9.h c10 = n9.h.c();
                            try {
                                Object obj2 = ua.d.m;
                                string = (String) Tasks.await(((ua.d) c10.b(ua.e.class)).e());
                            } catch (InterruptedException e10) {
                                e = e10;
                                throw new RuntimeException(e);
                            }
                        } catch (InterruptedException | ExecutionException e11) {
                            e = e11;
                        }
                    }
                    String str3 = string;
                    n9.h c11 = n9.h.c();
                    c11.a();
                    String packageName = c11.a.getPackageName();
                    ab.b bVar = !y00.w(extras) ? ab.b.c : ab.b.b;
                    string2 = extras.getString("google.delivered_priority");
                    if (string2 == null) {
                        if (!"1".equals(extras.getString("google.priority_reduced"))) {
                            string2 = extras.getString("google.priority");
                        }
                        c2 = 2;
                        if (c2 == 2) {
                            i10 = 5;
                        } else if (c2 == 1) {
                            i10 = 10;
                        }
                        int i11 = i10;
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
                            } catch (NumberFormatException e12) {
                                Log.w("FirebaseMessaging", "error parsing project number", e12);
                            }
                            dVar = new ab.d(parseLong > 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i11, i3, str5, str7, str8);
                        }
                        n9.h c12 = n9.h.c();
                        n9.k kVar = c12.c;
                        c12.a();
                        str = kVar.e;
                        if (str != null) {
                            try {
                                parseLong = Long.parseLong(str);
                            } catch (NumberFormatException e13) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e13);
                            }
                            dVar = new ab.d(parseLong > 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i11, i3, str5, str7, str8);
                        }
                        c12.a();
                        str2 = kVar.b;
                        if (str2.startsWith("1:")) {
                            String[] split = str2.split(":");
                            if (split.length >= 2) {
                                String str9 = split[1];
                                if (!str9.isEmpty()) {
                                    try {
                                        parseLong = Long.parseLong(str9);
                                    } catch (NumberFormatException e14) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e14);
                                    }
                                }
                            }
                            parseLong = 0;
                        } else {
                            try {
                                parseLong = Long.parseLong(str2);
                            } catch (NumberFormatException e15) {
                                Log.w("FirebaseMessaging", "error parsing app ID", e15);
                            }
                        }
                        dVar = new ab.d(parseLong > 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i11, i3, str5, str7, str8);
                    }
                    if ("high".equals(string2)) {
                        if (!"normal".equals(string2)) {
                            c2 = 0;
                        }
                        c2 = 2;
                    } else {
                        c2 = 1;
                    }
                    if (c2 == 2) {
                    }
                    int i112 = i10;
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
                    n9.h c122 = n9.h.c();
                    n9.k kVar2 = c122.c;
                    c122.a();
                    str = kVar2.e;
                    if (str != null) {
                    }
                    c122.a();
                    str2 = kVar2.b;
                    if (str2.startsWith("1:")) {
                    }
                    dVar = new ab.d(parseLong > 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i112, i3, str5, str7, str8);
                }
                i3 = parseInt;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                }
                String str32 = string;
                n9.h c112 = n9.h.c();
                c112.a();
                String packageName2 = c112.a.getPackageName();
                ab.b bVar2 = !y00.w(extras) ? ab.b.c : ab.b.b;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                }
                if ("high".equals(string2)) {
                }
                if (c2 == 2) {
                }
                int i1122 = i10;
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
                n9.h c1222 = n9.h.c();
                n9.k kVar22 = c1222.c;
                c1222.a();
                str = kVar22.e;
                if (str != null) {
                }
                c1222.a();
                str2 = kVar22.b;
                if (str2.startsWith("1:")) {
                }
                dVar = new ab.d(parseLong > 0 ? parseLong : 0L, str4, str32, bVar2, packageName2, str6, i1122, i3, str5, str7, str8);
            }
            if (dVar == null) {
                return;
            }
            try {
                ((n5.q) fVar).a("FCM_CLIENT_EVENT_LOGGING", new k5.c("proto"), new z9.j(8)).a(new k5.a(null, new ab.e(dVar), k5.d.a, new k5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new l2.d(27));
            } catch (RuntimeException e16) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e16);
            }
        }
    }

    public static void c(String str, Bundle bundle) {
        try {
            n9.h.c();
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
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e10);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e11);
                }
            }
            String str2 = y00.w(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            if (n9.h.c().b(o9.a.class) != null) {
                throw new ClassCastException();
            }
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
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
