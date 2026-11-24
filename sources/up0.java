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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class up0 {
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
    public k6d i;
    public lf2 j;

    public up0(Context context, int i, long j) {
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

    public static up0 b(Context context, int i, long j) {
        Pair pair = new Pair(Integer.valueOf(i), Long.valueOf(j));
        WeakHashMap weakHashMap = k;
        up0 up0Var = (up0) weakHashMap.get(pair);
        if (up0Var != null) {
            return up0Var;
        }
        up0 up0Var2 = new up0(context, i, j);
        weakHashMap.put(pair, up0Var2);
        return up0Var2;
    }

    public static void c(Activity activity, int i, qac qacVar) {
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
                    fc4.g(e, true);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Long l2 = (Long) obj;
            up0 b = b(activity, i, l2.longValue());
            if (b.e && b.f) {
                hashMap.put(l2, Boolean.valueOf(!b.d));
            }
        }
        if (arrayList.isEmpty()) {
            qacVar.a(new ArrayList());
        } else {
            cf7.Y(i).a.c(new up6(i, arrayList, hashMap, qacVar));
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
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(kt6.n(j, "9bot_"), 3);
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
            fc4.g(e, true);
        }
        if (new ek0(new dk0(context, (byte) 0)).a(15) == 0) {
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
                String n = kt6.n(j, "device_id");
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
        SharedPreferences k2 = aq1.k(new StringBuilder("2botbiometry_"), this.b, this.a, 0);
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

    public final gk0 g(boolean z) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey d = d();
            if (z) {
                cipher.init(2, d, new IvParameterSpec(Utilities.v(this.h)));
            } else {
                cipher.init(1, d);
            }
            return new gk0(cipher);
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public final void h(String str, boolean z, String str2, lac lacVar) {
        int i;
        this.j = null;
        try {
            if (this.i == null) {
                this.i = new k6d(LaunchActivity.H1, rs.g(this.a), new sp0(this, (byte) 0));
            }
            gk0 g = g(z);
            TLRPC.User W1 = oc7.r1(this.b).W1(Long.valueOf(this.c));
            hk0 hk0Var = new hk0();
            hk0Var.a = m9c.r(W1);
            hk0Var.c = jb6.M0(2131753721, null);
            hk0Var.d = (byte) 15;
            if (!TextUtils.isEmpty(str)) {
                hk0Var.b = str;
            }
            hk0 a = hk0Var.a();
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
                        lacVar.a(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        g = g(z);
                    }
                }
            }
            this.j = new lf2((Object) lacVar, (Object) ((g == null || Build.VERSION.SDK_INT >= 30) ? null : g), (byte) 5);
            if (g == null || (i = Build.VERSION.SDK_INT) >= 30) {
                this.i.n(a, null);
                return;
            }
            k6d k6dVar = this.i;
            k6dVar.getClass();
            int a2 = zod.a(a, g);
            if ((a2 & nm7.d4) == 255) {
                u36.j("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            } else if (i >= 30 || !zod.b(a2)) {
                k6dVar.n(a, g);
            } else {
                u36.j("Crypto-based authentication is not supported for device credential prior to API 30.");
            }
        } catch (Exception e2) {
            fc4.g(e2, true);
            lacVar.a(Boolean.FALSE, null, null);
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

    public final void j(String str, final String str2, final iu iuVar) {
        h(str, false, str2, new lac() { // from class: rp0
            @Override // lac
            public final void a(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                fk0 fk0Var = (fk0) obj2;
                gk0 gk0Var = (gk0) obj3;
                up0 up0Var = up0.this;
                up0Var.getClass();
                if (fk0Var != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            up0Var.g = null;
                            up0Var.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                gk0Var = up0Var.g(false);
                            }
                            if (gk0Var == null) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                            Cipher cipher = gk0Var.b;
                            up0Var.g = Utilities.f(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                            up0Var.h = Utilities.f(cipher.getIV());
                        }
                        up0Var.i();
                    } catch (Exception e) {
                        fc4.g(e, true);
                        bool = Boolean.FALSE;
                    }
                }
                iuVar.a(bool);
            }
        });
    }
}
