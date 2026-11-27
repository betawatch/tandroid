// default package

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import org.json.JSONObject;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ot0 {
    public final int a;
    public final long b;
    public final long c;
    public final boolean d;
    public String e;

    public ot0(int i, long j, long j2, boolean z) {
        this.a = i;
        this.b = j2;
        this.c = j;
        this.d = z;
    }

    public static File b() {
        try {
            File filesDir = a.b.getFilesDir();
            if (filesDir != null) {
                File file = new File(filesDir, "apps_storage/");
                file.mkdirs();
                if (filesDir.exists() || filesDir.mkdirs()) {
                    if (filesDir.canWrite()) {
                        return file;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return new File("");
    }

    public static SecretKey g() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("MiniAppsKey")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(new KeyGenParameterSpec.Builder("MiniAppsKey", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setUserAuthenticationRequired(false).build());
            keyGenerator.generateKey();
        }
        return (SecretKey) keyStore.getKey("MiniAppsKey", null);
    }

    public static HashMap i() {
        HashMap hashMap = new HashMap();
        try {
            File file = new File(b(), "secure_config.json");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                JSONObject jSONObject = new JSONObject(new String(bArr));
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    nt0 nt0Var = new nt0();
                    nt0Var.a = next;
                    nt0Var.b = jSONObject2.getLong("user_id");
                    nt0Var.c = jSONObject2.getString("user_name");
                    nt0Var.d = jSONObject2.getLong("created_at");
                    nt0Var.e = jSONObject2.getLong("edited_at");
                    hashMap.put(next, nt0Var);
                }
                return hashMap;
            } catch (OutOfMemoryError e) {
                cc4.g(e, true);
                throw new RuntimeException("QUOTA_EXCEEDED");
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
            return hashMap;
        }
    }

    public static void k(HashMap hashMap) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("user_id", ((nt0) entry.getValue()).b);
                jSONObject2.put("user_name", ((nt0) entry.getValue()).c);
                jSONObject2.put("created_at", ((nt0) entry.getValue()).d);
                jSONObject2.put("edited_at", ((nt0) entry.getValue()).e);
                jSONObject.put((String) entry.getKey(), jSONObject2);
            }
            File file = new File(b(), "secure_config.json");
            byte[] bytes = jSONObject.toString().getBytes();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final byte[] a(File file) {
        byte[] bArr;
        FileInputStream fileInputStream = new FileInputStream(file);
        int length = (int) file.length();
        boolean z = this.d;
        if (z) {
            int read = fileInputStream.read();
            bArr = new byte[read];
            length = (length - 1) - read;
            fileInputStream.read(bArr);
        } else {
            bArr = null;
        }
        try {
            byte[] bArr2 = new byte[length];
            fileInputStream.read(bArr2);
            fileInputStream.close();
            if (!z) {
                return bArr2;
            }
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, g(), new GCMParameterSpec(128, bArr));
                return cipher.doFinal(bArr2);
            } catch (Exception e) {
                cc4.g(e, true);
                this.l(file, "{}".getBytes());
                xi4.l("UNKNOWN_ERROR");
                return null;
            }
        } catch (OutOfMemoryError e2) {
            cc4.g(e2, true);
            xi4.l("QUOTA_EXCEEDED");
            return null;
        }
    }

    public final File c() {
        long j;
        if (this.d && TextUtils.isEmpty(this.e)) {
            HashMap i = i();
            Iterator it = i.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                j = this.c;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((nt0) entry.getValue()).b == j) {
                    this.e = (String) entry.getKey();
                    break;
                }
            }
            if (TextUtils.isEmpty(this.e)) {
                String uuid = UUID.randomUUID().toString();
                this.e = uuid;
                nt0 nt0Var = new nt0();
                nt0Var.a = uuid;
                nt0Var.b = j;
                nt0Var.c = wf3.l(yac.h(this.a).f());
                long currentTimeMillis = System.currentTimeMillis();
                nt0Var.e = currentTimeMillis;
                nt0Var.d = currentTimeMillis;
                i.put(this.e, nt0Var);
                k(i);
            }
        }
        return d(this.e);
    }

    public final File d(String str) {
        File b = b();
        StringBuilder sb = new StringBuilder();
        long j = this.c;
        boolean z = this.d;
        Object obj = str;
        if (!z) {
            obj = Long.valueOf(j);
        }
        sb.append(obj);
        sb.append("_");
        long j2 = this.b;
        sb.append(j2);
        sb.append(z ? "_s" : "");
        File file = new File(b, sb.toString());
        File b2 = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j2);
        sb2.append(z ? "_s" : "");
        File file2 = new File(b2, sb2.toString());
        if (!file.exists() && file2.exists()) {
            file2.renameTo(file);
            return file;
        }
        if (z) {
            File file3 = new File(b(), j + "_" + j2 + "_s");
            if (!file.exists() && file3.exists()) {
                file3.renameTo(file);
            }
        }
        return file;
    }

    public final JSONObject e(File file) {
        if (!file.exists() || file.length() > 5242880) {
            return new JSONObject();
        }
        try {
            return new JSONObject(new String(a(file)));
        } catch (Exception e) {
            cc4.g(e, true);
            return new JSONObject();
        }
    }

    public final Pair f(String str) {
        JSONObject e = e(c());
        String optString = e.optString(str);
        boolean z = false;
        if (this.d && optString == null && !e.keys().hasNext()) {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < 4; i++) {
                yac h = yac.h(i);
                if (h.o()) {
                    hashSet.add(Long.valueOf(h.e()));
                }
            }
            Iterator it = ((Set) Collection.-EL.stream(i().values()).filter(new lt0(hashSet, (byte) 0)).collect(Collectors.toSet())).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    File d = d(((nt0) it.next()).a);
                    if (d.exists() && e(d).has(str)) {
                        z = true;
                        break;
                    }
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
        }
        return new Pair(optString, Boolean.valueOf(z));
    }

    public final ArrayList h(String str) {
        if (e(c()).keys().hasNext()) {
            xi4.l("STORAGE_NOT_EMPTY");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 4; i++) {
            yac h = yac.h(i);
            if (h.o()) {
                hashSet.add(Long.valueOf(h.e()));
            }
        }
        for (nt0 nt0Var : (Set) Collection.-EL.stream(i().values()).filter(new lt0(hashSet, (byte) 1)).collect(Collectors.toSet())) {
            try {
                File d = d(nt0Var.a);
                if (d.exists() && e(d).has(str)) {
                    arrayList.add(nt0Var);
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return arrayList;
    }

    public final void j(String str) {
        if (e(c()).keys().hasNext()) {
            xi4.l("STORAGE_NOT_EMPTY");
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 4; i++) {
            yac h = yac.h(i);
            if (h.o()) {
                hashSet.add(Long.valueOf(h.e()));
            }
        }
        HashMap i2 = i();
        nt0 nt0Var = (nt0) i2.get(str);
        if (nt0Var == null) {
            xi4.l("STORAGE_NOT_FOUND");
            return;
        }
        nt0Var.b = this.c;
        nt0Var.c = wf3.l(yac.h(this.a).f());
        nt0Var.e = System.currentTimeMillis();
        k(i2);
        this.e = nt0Var.a;
    }

    public final void l(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        if (this.d) {
            try {
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, g());
                byte[] iv = cipher.getIV();
                fileOutputStream.write(iv.length);
                fileOutputStream.write(iv);
                bArr = cipher.doFinal(bArr);
            } catch (Exception e) {
                cc4.g(e, true);
                xi4.l("UNKNOWN_ERROR");
                return;
            }
        }
        fileOutputStream.write(bArr);
        fileOutputStream.close();
    }

    public final void m(JSONObject jSONObject) {
        try {
            byte[] bytes = jSONObject.toString().getBytes();
            if (bytes.length > 5242880) {
                xi4.l("QUOTA_EXCEEDED");
                return;
            }
            try {
                l(c(), bytes);
            } catch (Exception e) {
                cc4.g(e, true);
                xi4.l("UNKNOWN_ERROR");
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
            xi4.l("UNKNOWN_ERROR");
        } catch (OutOfMemoryError e3) {
            cc4.g(e3, true);
            xi4.l("QUOTA_EXCEEDED");
        }
    }

    public final void n(String str, String str2) {
        if (str2.length() + str.length() > 5242880) {
            xi4.l("QUOTA_EXCEEDED");
            return;
        }
        JSONObject e = e(c());
        try {
            e.put(str, str2);
            int length = e.length();
            boolean z = this.d;
            if (length > 10 && z) {
                xi4.l("QUOTA_EXCEEDED");
                return;
            }
            m(e);
            if (z) {
                try {
                    HashMap i = i();
                    nt0 nt0Var = (nt0) i.get(this.e);
                    if (nt0Var != null) {
                        nt0Var.e = System.currentTimeMillis();
                        k(i);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
            xi4.l("UNKNOWN_ERROR");
        }
    }
}
