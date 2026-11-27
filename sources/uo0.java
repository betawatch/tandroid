// default package

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class uo0 {
    public static final WeakHashMap k = new WeakHashMap();
    public static KeyStore l;
    public final Context a;
    public final int b;
    public final long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;
    public z8d i;
    public qe2 j;

    public uo0(Context context, int i, long j) {
        this.a = context;
        this.b = i;
        this.c = j;
        f();
    }

    public static void a() {
        Context context = a.b;
        if (context == null) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            context.getSharedPreferences("2botbiometry_" + i, 0).edit().clear().apply();
        }
        k.clear();
    }

    public static uo0 b(Context context, int i, long j) {
        Pair pair = new Pair(Integer.valueOf(i), Long.valueOf(j));
        WeakHashMap weakHashMap = k;
        uo0 uo0Var = (uo0) weakHashMap.get(pair);
        if (uo0Var != null) {
            return uo0Var;
        }
        uo0 uo0Var2 = new uo0(context, i, j);
        weakHashMap.put(pair, uo0Var2);
        return uo0Var2;
    }

    public static void c(Activity activity, int i, pcc pccVar) {
        int i2 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i, 0);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = sharedPreferences.getAll().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Long l2 = (Long) obj;
            uo0 b = b(activity, i, l2.longValue());
            if (b.e && b.f) {
                hashMap.put(l2, Boolean.valueOf(!b.d));
            }
        }
        if (arrayList.isEmpty()) {
            pccVar.a(new ArrayList());
        } else {
            kf7.a0(i).a.c(new gp6(i, arrayList, hashMap, pccVar));
        }
    }

    public final SecretKey d() {
        if (l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = l;
        StringBuilder sb = new StringBuilder("9bot_");
        long j = this.c;
        sb.append(j);
        if (keyStore2.containsAlias(sb.toString())) {
            return (SecretKey) l.getKey("9bot_" + j, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(qu6.n(j, "9bot_"), 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        }
        if (i >= 24) {
            builder.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject e() {
        String str;
        String string;
        JSONObject jSONObject = new JSONObject();
        Context context = this.a;
        try {
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (new fj0(new ej0(context, (byte) 0)).a(15) == 0) {
            str = "unknown";
            if (str == null) {
                jSONObject.put("available", true);
                jSONObject.put(TeXSymbolParser.TYPE_ATTR, str);
            } else {
                jSONObject.put("available", false);
            }
            jSONObject.put("access_requested", this.f);
            jSONObject.put("access_granted", (this.e || this.d) ? false : true);
            jSONObject.put("token_saved", !TextUtils.isEmpty(this.g));
            SharedPreferences sharedPreferences = context.getSharedPreferences("2botbiometry_" + this.b, 0);
            StringBuilder sb = new StringBuilder("device_id");
            long j = this.c;
            sb.append(j);
            string = sharedPreferences.getString(sb.toString(), null);
            if (string == null) {
                byte[] bArr = new byte[32];
                new SecureRandom().nextBytes(bArr);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                String n = qu6.n(j, "device_id");
                string = Utilities.f(bArr);
                edit.putString(n, string).apply();
            }
            jSONObject.put("device_id", string);
            return jSONObject;
        }
        str = null;
        if (str == null) {
        }
        jSONObject.put("access_requested", this.f);
        jSONObject.put("access_granted", (this.e || this.d) ? false : true);
        jSONObject.put("token_saved", !TextUtils.isEmpty(this.g));
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("2botbiometry_" + this.b, 0);
        StringBuilder sb2 = new StringBuilder("device_id");
        long j2 = this.c;
        sb2.append(j2);
        string = sharedPreferences2.getString(sb2.toString(), null);
        if (string == null) {
        }
        jSONObject.put("device_id", string);
        return jSONObject;
    }

    public final void f() {
        SharedPreferences k2 = bp1.k(new StringBuilder("2botbiometry_"), this.b, this.a, 0);
        long j = this.c;
        this.g = k2.getString(String.valueOf(j), null);
        this.h = k2.getString(String.valueOf(j) + "_iv", null);
        boolean z = true;
        boolean z2 = this.g != null;
        this.e = z2;
        if (!z2) {
            if (!k2.getBoolean(j + "_requested", false)) {
                z = false;
            }
        }
        this.f = z;
        this.d = k2.getBoolean(j + "_disabled", false);
    }

    public final hj0 g(boolean z) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey d = d();
            if (z) {
                cipher.init(2, d, new IvParameterSpec(Utilities.v(this.h)));
            } else {
                cipher.init(1, d);
            }
            return new hj0(cipher);
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public final void h(String str, boolean z, String str2, kcc kccVar) {
        int i;
        this.j = null;
        try {
            if (this.i == null) {
                this.i = new z8d(LaunchActivity.H1, sr.g(this.a), new so0(this, (byte) 0));
            }
            hj0 g = g(z);
            TLRPC.User X1 = uc7.s1(this.b).X1(Long.valueOf(this.c));
            ij0 ij0Var = new ij0();
            ij0Var.a = lbc.r(X1);
            ij0Var.c = ob6.M0(2131753749, null);
            ij0Var.d = (byte) 15;
            if (!TextUtils.isEmpty(str)) {
                ij0Var.b = str;
            }
            ij0 a = ij0Var.a();
            if (g != null) {
                Cipher cipher = g.b;
                if (!z && Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.g = null;
                        } else {
                            this.g = Utilities.f(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.f(cipher.getIV());
                        }
                        i();
                        kccVar.a(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        g = g(z);
                    }
                }
            }
            this.j = new qe2((Object) kccVar, (Object) ((g == null || Build.VERSION.SDK_INT >= 30) ? null : g), (byte) 3);
            if (g == null || (i = Build.VERSION.SDK_INT) >= 30) {
                this.i.R0(a, null);
                return;
            }
            z8d z8dVar = this.i;
            z8dVar.getClass();
            int a2 = nrd.a(a, g);
            if ((a2 & jn7.d4) == 255) {
                lq5.j("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            } else if (i >= 30 || !nrd.b(a2)) {
                z8dVar.R0(a, g);
            } else {
                lq5.j("Crypto-based authentication is not supported for device credential prior to API 30.");
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
            kccVar.a(Boolean.FALSE, null, null);
        }
    }

    public final void i() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("2botbiometry_" + this.b, 0).edit();
        boolean z = this.f;
        long j = this.c;
        if (z) {
            edit.putBoolean(j + "_requested", true);
        } else {
            edit.remove(j + "_requested");
        }
        if (this.e) {
            String valueOf = String.valueOf(j);
            String str = this.g;
            if (str == null) {
                str = "";
            }
            edit.putString(valueOf, str);
            String str2 = String.valueOf(j) + "_iv";
            String str3 = this.h;
            edit.putString(str2, str3 != null ? str3 : "");
        } else {
            edit.remove(String.valueOf(j));
            edit.remove(String.valueOf(j) + "_iv");
        }
        if (this.d) {
            edit.putBoolean(j + "_disabled", true);
        } else {
            edit.remove(j + "_disabled");
        }
        edit.apply();
    }

    public final void j(String str, final String str2, final gt gtVar) {
        h(str, false, str2, new kcc() { // from class: ro0
            @Override // kcc
            public final void a(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                gj0 gj0Var = (gj0) obj2;
                hj0 hj0Var = (hj0) obj3;
                uo0 uo0Var = uo0.this;
                uo0Var.getClass();
                if (gj0Var != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            uo0Var.g = null;
                            uo0Var.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                hj0Var = uo0Var.g(false);
                            }
                            if (hj0Var == null) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                            Cipher cipher = hj0Var.b;
                            uo0Var.g = Utilities.f(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                            uo0Var.h = Utilities.f(cipher.getIV());
                        }
                        uo0Var.i();
                    } catch (Exception e) {
                        cc4.g(e, true);
                        bool = Boolean.FALSE;
                    }
                }
                gtVar.a(bool);
            }
        });
    }
}
