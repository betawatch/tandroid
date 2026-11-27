// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class xae implements OnSuccessListener, q9d, OnCompleteListener {
    public Object a;

    public /* synthetic */ xae(Object obj) {
        this.a = obj;
    }

    @Override // q9d
    public final void b(Bitmap bitmap) {
        he6 he6Var = alf.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f = width;
            int height = bitmap.getHeight();
            int d = (int) qu6.d(f, 9.0f, 16.0f, 0.5f);
            float f2 = (d - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f2, f, height + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, d, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((alf) this.a).e(0, bitmap2);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        md1.h((md1) ((kad) this.a).c, "launchApplication", task);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        z9f z9fVar;
        b6f b;
        id1 id1Var = (id1) this.a;
        Bundle bundle = (Bundle) obj;
        if (wae.j) {
            Context context = id1Var.a;
            qa4 qa4Var = id1Var.f;
            wae waeVar = new wae(context, qa4Var, id1Var.c, id1Var.j, id1Var.g);
            int i = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i == 0) {
                if (!z) {
                    return;
                }
                i = 0;
                z = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String o = qd4.o(packageName, ".client_cast_analytics_data");
            waeVar.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? (byte) 1 : (byte) 2;
            h5c.b(context);
            waeVar.g = h5c.a().c(q51.e).a("CAST_SENDER_SDK", new n34("proto"), faf.f);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                waeVar.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(o, 0);
            if (i != 0) {
                wjb b2 = xjb.b();
                b2.a = new ve9(qa4Var, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b2.c = new a94[]{zid.c};
                b2.b = false;
                b2.d = (char) 8426;
                qa4Var.e(0, b2.a()).addOnSuccessListener(new ykf(waeVar, packageName, i, sharedPreferences));
            }
            if (z) {
                xve.h(sharedPreferences);
                he6 he6Var = z9f.i;
                synchronized (z9f.class) {
                    z9fVar = z9f.k;
                    if (z9fVar == null) {
                        z9fVar = new z9f(sharedPreferences, waeVar, packageName);
                        z9f.k = z9fVar;
                    }
                }
                String str = z9fVar.c;
                SharedPreferences sharedPreferences2 = z9fVar.b;
                HashSet hashSet = z9fVar.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = z9fVar.g;
                hashSet2.clear();
                z9fVar.h = 0L;
                String str2 = z9f.j;
                if (str2.equals(string) && str.equals(string2)) {
                    z9fVar.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j = sharedPreferences2.getLong(str3, 0L);
                            if (j != 0 && currentTimeMillis - j > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                b6f b3 = z9f.b(str3.substring(41));
                                if (b3 != null) {
                                    hashSet2.add(b3);
                                    hashSet.add(b3);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b = z9f.b(str3.substring(41))) != null) {
                                hashSet.add(b);
                            }
                        }
                    }
                    z9fVar.c(hashSet3);
                    z9fVar.e.post(z9fVar.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    z9fVar.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                z9f.a(b6f.h);
            }
        }
    }
}
