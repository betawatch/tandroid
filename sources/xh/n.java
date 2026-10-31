package xh;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.l20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.pc0;
import org.telegram.ui.LaunchActivity;
import rh.s6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n {
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
    public k6.h i;
    public s6 j;

    public n(Context context, int i10, long j10) {
        this.a = context;
        this.b = i10;
        this.c = j10;
        h();
    }

    public static void b() {
        Context context = org.telegram.messenger.w0.b;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("2botbiometry_" + i10, 0).edit().clear().apply();
        }
        k.clear();
    }

    public static n c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        WeakHashMap weakHashMap = k;
        n nVar = (n) weakHashMap.get(pair);
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(context, i10, j10);
        weakHashMap.put(pair, nVar2);
        return nVar2;
    }

    public static void d(Activity activity, int i10, q20 q20Var) {
        int i11 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences("2botbiometry_" + i10, 0);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, ?>> it = sharedPreferences.getAll().entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (key.endsWith("_requested")) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(key.substring(0, key.length() - 10))));
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Long l4 = (Long) obj;
            n c10 = c(activity, i10, l4.longValue());
            if (c10.e && c10.f) {
                hashMap.put(l4, Boolean.valueOf(!c10.d));
            }
        }
        if (arrayList.isEmpty()) {
            q20Var.a(new ArrayList());
        } else {
            hs.a0(i10).a.c(new c11(i10, arrayList, hashMap, q20Var, 21));
        }
    }

    public final boolean a() {
        return this.f;
    }

    public final SecretKey e() {
        if (l == null) {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            l = keyStore;
            keyStore.load(null);
        }
        KeyStore keyStore2 = l;
        StringBuilder sb2 = new StringBuilder("9bot_");
        long j10 = this.c;
        sb2.append(j10);
        if (keyStore2.containsAlias(sb2.toString())) {
            return (SecretKey) l.getKey("9bot_" + j10, null);
        }
        KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("9bot_" + j10, 3);
        builder.setBlockModes("CBC");
        builder.setEncryptionPaddings("PKCS7Padding");
        builder.setUserAuthenticationRequired(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            builder.setUserAuthenticationParameters(60, 2);
        }
        if (i10 >= 24) {
            builder.setInvalidatedByBiometricEnrollment(true);
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(builder.build());
        return keyGenerator.generateKey();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject f() {
        String str;
        String string;
        JSONObject jSONObject = new JSONObject();
        Context context = this.a;
        try {
        } catch (Exception e) {
            f8.g(e, true);
        }
        if (new android.support.v4.media.session.a0(new androidx.biometric.s(context, 0)).h(15) == 0) {
            str = "unknown";
            if (str == null) {
                jSONObject.put("available", true);
                jSONObject.put(TeXSymbolParser.TYPE_ATTR, str);
            } else {
                jSONObject.put("available", false);
            }
            jSONObject.put("access_requested", this.f);
            jSONObject.put("access_granted", (this.e || this.d) ? false : true);
            jSONObject.put("token_saved", true ^ TextUtils.isEmpty(this.g));
            SharedPreferences sharedPreferences = context.getSharedPreferences("2botbiometry_" + this.b, 0);
            StringBuilder sb2 = new StringBuilder("device_id");
            long j10 = this.c;
            sb2.append(j10);
            string = sharedPreferences.getString(sb2.toString(), null);
            if (string == null) {
                byte[] bArr = new byte[32];
                new SecureRandom().nextBytes(bArr);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                String l4 = a1.g.l(j10, "device_id");
                string = Utilities.f(bArr);
                edit.putString(l4, string).apply();
            }
            jSONObject.put("device_id", string);
            return jSONObject;
        }
        str = null;
        if (str == null) {
        }
        jSONObject.put("access_requested", this.f);
        jSONObject.put("access_granted", (this.e || this.d) ? false : true);
        jSONObject.put("token_saved", true ^ TextUtils.isEmpty(this.g));
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("2botbiometry_" + this.b, 0);
        StringBuilder sb22 = new StringBuilder("device_id");
        long j102 = this.c;
        sb22.append(j102);
        string = sharedPreferences2.getString(sb22.toString(), null);
        if (string == null) {
        }
        jSONObject.put("device_id", string);
        return jSONObject;
    }

    public final boolean g() {
        return this.e;
    }

    public final void h() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("2botbiometry_" + this.b, 0);
        long j10 = this.c;
        this.g = sharedPreferences.getString(String.valueOf(j10), null);
        this.h = sharedPreferences.getString(String.valueOf(j10) + "_iv", null);
        boolean z10 = true;
        boolean z11 = this.g != null;
        this.e = z11;
        if (!z11) {
            if (!sharedPreferences.getBoolean(j10 + "_requested", false)) {
                z10 = false;
            }
        }
        this.f = z10;
        this.d = sharedPreferences.getBoolean(j10 + "_disabled", false);
    }

    public final androidx.biometric.u i(boolean z10) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey e = e();
            if (z10) {
                cipher.init(2, e, new IvParameterSpec(Utilities.v(this.h)));
            } else {
                cipher.init(1, e);
            }
            return new androidx.biometric.u(cipher);
        } catch (Exception e7) {
            f8.g(e7, true);
            return null;
        }
    }

    public final void j(String str, boolean z10, String str2, l20 l20Var) {
        int i10;
        this.j = null;
        try {
            if (this.i == null) {
                this.i = new k6.h(LaunchActivity.I1, f0.c.d(this.a), new pc0(this, 1));
            }
            androidx.biometric.u i11 = i(z10);
            TLRPC.User Z1 = vp.r1(this.b).Z1(Long.valueOf(this.c));
            j6.m mVar = new j6.m(1);
            mVar.b = h20.p(Z1);
            mVar.d = cd.L0(2131753756, null);
            mVar.a = 15;
            if (!TextUtils.isEmpty(str)) {
                mVar.c = str;
            }
            j6.m c10 = mVar.c();
            if (i11 != null) {
                Cipher cipher = i11.b;
                if (!z10 && Build.VERSION.SDK_INT >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.g = null;
                        } else {
                            this.g = Utilities.f(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.f(cipher.getIV());
                        }
                        k();
                        l20Var.a(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e) {
                        f8.g(e, true);
                        i11 = i(z10);
                    }
                }
            }
            this.j = new s6(6, l20Var, (i11 == null || Build.VERSION.SDK_INT >= 30) ? null : i11);
            if (i11 == null || (i10 = Build.VERSION.SDK_INT) >= 30) {
                this.i.a(c10, null);
                return;
            }
            k6.h hVar = this.i;
            hVar.getClass();
            int i12 = c10.a;
            int i13 = i12 != 0 ? i12 : 15;
            if ((i13 & zs.e4) == 255) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            if (i10 < 30 && v7.k.a(i13)) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
            }
            hVar.a(c10, i11);
        } catch (Exception e7) {
            f8.g(e7, true);
            l20Var.a(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("2botbiometry_" + this.b, 0).edit();
        boolean z10 = this.f;
        long j10 = this.c;
        if (z10) {
            edit.putBoolean(j10 + "_requested", true);
        } else {
            edit.remove(j10 + "_requested");
        }
        if (this.e) {
            String valueOf = String.valueOf(j10);
            String str = this.g;
            if (str == null) {
                str = "";
            }
            edit.putString(valueOf, str);
            String str2 = String.valueOf(j10) + "_iv";
            String str3 = this.h;
            edit.putString(str2, str3 != null ? str3 : "");
        } else {
            edit.remove(String.valueOf(j10));
            edit.remove(String.valueOf(j10) + "_iv");
        }
        if (this.d) {
            edit.putBoolean(j10 + "_disabled", true);
        } else {
            edit.remove(j10 + "_disabled");
        }
        edit.apply();
    }

    public final void l(String str, final String str2, final kg.d0 d0Var) {
        j(str, false, str2, new l20() { // from class: xh.l
            @Override // org.telegram.messenger.l20
            public final void a(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.t tVar = (androidx.biometric.t) obj2;
                androidx.biometric.u uVar = (androidx.biometric.u) obj3;
                n nVar = n.this;
                nVar.getClass();
                if (tVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            nVar.g = null;
                            nVar.h = null;
                        } else {
                            if (Build.VERSION.SDK_INT >= 30) {
                                uVar = nVar.i(false);
                            }
                            if (uVar == null) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                            Cipher cipher = uVar.b;
                            nVar.g = Utilities.f(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                            nVar.h = Utilities.f(cipher.getIV());
                        }
                        nVar.k();
                    } catch (Exception e) {
                        f8.g(e, true);
                        bool = Boolean.FALSE;
                    }
                }
                d0Var.a(bool);
            }
        });
    }
}
