package rh;

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
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.et;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class p {
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
    public o5.i i;
    public dh.v j;

    public p(Context context, int i10, long j10) {
        this.a = context;
        this.b = i10;
        this.c = j10;
        h();
    }

    public static void b() {
        Context context = ApplicationLoader.applicationContext;
        if (context == null) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            context.getSharedPreferences("2botbiometry_" + i10, 0).edit().clear().apply();
        }
        k.clear();
    }

    public static p c(Context context, int i10, long j10) {
        Pair pair = new Pair(Integer.valueOf(i10), Long.valueOf(j10));
        WeakHashMap weakHashMap = k;
        p pVar = (p) weakHashMap.get(pair);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(context, i10, j10);
        weakHashMap.put(pair, pVar2);
        return pVar2;
    }

    public static void d(Activity activity, int i10, Utilities.Callback callback) {
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
                    FileLog.e(e);
                }
            }
        }
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Long l10 = (Long) obj;
            p c3 = c(activity, i10, l10.longValue());
            if (c3.e && c3.f) {
                hashMap.put(l10, Boolean.valueOf(!c3.d));
            }
        }
        if (arrayList.isEmpty()) {
            callback.run(new ArrayList());
        } else {
            MessagesStorage.getInstance(i10).getStorageQueue().postRunnable(new et(i10, arrayList, hashMap, callback, 13));
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
        StringBuilder sb = new StringBuilder("9bot_");
        long j10 = this.c;
        sb.append(j10);
        if (keyStore2.containsAlias(sb.toString())) {
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
            FileLog.e(e);
        }
        if (new af.d(new androidx.biometric.t(context, 0)).i(15) == 0) {
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
            long j10 = this.c;
            sb.append(j10);
            string = sharedPreferences.getString(sb.toString(), null);
            if (string == null) {
                byte[] bArr = new byte[32];
                new SecureRandom().nextBytes(bArr);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                String n10 = android.support.v4.media.a.n(j10, "device_id");
                string = Utilities.bytesToHex(bArr);
                edit.putString(n10, string).apply();
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
        long j102 = this.c;
        sb2.append(j102);
        string = sharedPreferences2.getString(sb2.toString(), null);
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
        boolean z4 = true;
        boolean z10 = this.g != null;
        this.e = z10;
        if (!z10) {
            if (!sharedPreferences.getBoolean(j10 + "_requested", false)) {
                z4 = false;
            }
        }
        this.f = z4;
        this.d = sharedPreferences.getBoolean(j10 + "_disabled", false);
    }

    public final androidx.biometric.v i(boolean z4) {
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return null;
            }
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            SecretKey e = e();
            if (z4) {
                cipher.init(2, e, new IvParameterSpec(Utilities.hexToBytes(this.h)));
            } else {
                cipher.init(1, e);
            }
            return new androidx.biometric.v(cipher);
        } catch (Exception e6) {
            FileLog.e(e6);
            return null;
        }
    }

    public final void j(String str, boolean z4, String str2, Utilities.Callback3 callback3) {
        int i10;
        int i11;
        this.j = null;
        try {
            if (this.i == null) {
                this.i = new o5.i(LaunchActivity.D1, f0.f.e(this.a), new n(this));
            }
            androidx.biometric.v i12 = i(z4);
            TLRPC.User user = MessagesController.getInstance(this.b).getUser(Long.valueOf(this.c));
            h5.u uVar = new h5.u(1);
            uVar.b = UserObject.getUserName(user);
            uVar.d = LocaleController.getString(R.string.Back);
            uVar.a = 15;
            if (!TextUtils.isEmpty(str)) {
                uVar.c = str;
            }
            x5.k c3 = uVar.c();
            if (i12 != null) {
                Cipher cipher = i12.b;
                if (!z4 && (i11 = Build.VERSION.SDK_INT) >= 30) {
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            this.g = null;
                        } else if (i11 < 23) {
                            this.g = str2;
                        } else {
                            this.g = Utilities.bytesToHex(cipher.doFinal(str2.getBytes(StandardCharsets.UTF_8)));
                            this.h = Utilities.bytesToHex(cipher.getIV());
                        }
                        k();
                        callback3.run(Boolean.TRUE, null, null);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        i12 = i(z4);
                    }
                }
            }
            this.j = new dh.v(26, callback3, (i12 == null || Build.VERSION.SDK_INT >= 30) ? null : i12);
            if (i12 == null || (i10 = Build.VERSION.SDK_INT) >= 30) {
                this.i.h(c3, null);
                return;
            }
            o5.i iVar = this.i;
            iVar.getClass();
            int i13 = c3.a;
            int i14 = i13 != 0 ? i13 : 15;
            if ((i14 & 255) == 255) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
            }
            if (i10 < 30 && com.google.android.gms.internal.cast.n.a(i14)) {
                throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
            }
            iVar.h(c3, i12);
        } catch (Exception e6) {
            FileLog.e(e6);
            callback3.run(Boolean.FALSE, null, null);
        }
    }

    public final void k() {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("2botbiometry_" + this.b, 0).edit();
        boolean z4 = this.f;
        long j10 = this.c;
        if (z4) {
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

    public final void l(String str, final String str2, final kh.h hVar) {
        j(str, false, str2, new Utilities.Callback3() { // from class: rh.m
            @Override // org.telegram.messenger.Utilities.Callback3
            public final void run(Object obj, Object obj2, Object obj3) {
                String str3 = str2;
                Boolean bool = (Boolean) obj;
                androidx.biometric.u uVar = (androidx.biometric.u) obj2;
                androidx.biometric.v vVar = (androidx.biometric.v) obj3;
                p pVar = p.this;
                pVar.getClass();
                if (uVar != null) {
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            pVar.g = null;
                            pVar.h = null;
                        } else {
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 < 23) {
                                pVar.g = str3;
                                pVar.h = null;
                            } else {
                                if (i10 >= 30) {
                                    vVar = pVar.i(false);
                                }
                                if (vVar == null) {
                                    throw new RuntimeException("No cryptoObject found");
                                }
                                Cipher cipher = vVar.b;
                                pVar.g = Utilities.bytesToHex(cipher.doFinal(str3.getBytes(StandardCharsets.UTF_8)));
                                pVar.h = Utilities.bytesToHex(cipher.getIV());
                            }
                        }
                        pVar.k();
                    } catch (Exception e) {
                        FileLog.e(e);
                        bool = Boolean.FALSE;
                    }
                }
                hVar.run(bool);
            }
        });
    }
}
