package q6;

import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j {
    public static final f5.a b = new f5.a("LibraryVersion", "");
    public static final j c = new j();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        IOException e10;
        String str2;
        InputStream inputStream;
        f5.a aVar = b;
        m.f(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream2 = null;
        r7 = null;
        String str3 = null;
        inputStream2 = null;
        try {
            try {
                inputStream = j.class.getResourceAsStream("/" + str + ".properties");
            } catch (IOException e11) {
                e10 = e11;
                str2 = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str3 = properties.getProperty("version", null);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str3).length());
                sb2.append(str);
                sb2.append(" version is ");
                sb2.append(str3);
                String sb3 = sb2.toString();
                if (Log.isLoggable(aVar.a, 2)) {
                    String str4 = aVar.b;
                    if (str4 != null) {
                        sb3 = str4.concat(sb3);
                    }
                    Log.v("LibraryVersion", sb3);
                }
            } else {
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43);
                sb4.append("Failed to get app version for libraryName: ");
                sb4.append(str);
                String sb5 = sb4.toString();
                if (Log.isLoggable(aVar.a, 5)) {
                    String str5 = aVar.b;
                    if (str5 != null) {
                        sb5 = str5.concat(sb5);
                    }
                    Log.w("LibraryVersion", sb5);
                }
            }
        } catch (IOException e12) {
            e10 = e12;
            inputStream2 = inputStream;
            str2 = null;
            StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 43);
            sb6.append("Failed to get app version for libraryName: ");
            sb6.append(str);
            String sb7 = sb6.toString();
            if (Log.isLoggable(aVar.a, 6)) {
                String str6 = aVar.b;
                if (str6 != null) {
                    sb7 = str6.concat(sb7);
                }
                Log.e("LibraryVersion", sb7, e10);
            }
            InputStream inputStream3 = inputStream2;
            str3 = str2;
            inputStream = inputStream3;
            if (inputStream != null) {
            }
            if (str3 == null) {
            }
            concurrentHashMap.put(str, str3);
            return str3;
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                x6.b.a(inputStream2);
            }
            throw th;
        }
        if (inputStream != null) {
            x6.b.a(inputStream);
        }
        if (str3 == null) {
            if (Log.isLoggable(aVar.a, 3)) {
                String str7 = aVar.b;
                Log.d("LibraryVersion", str7 != null ? str7.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            }
            str3 = "UNKNOWN";
        }
        concurrentHashMap.put(str, str3);
        return str3;
    }
}
