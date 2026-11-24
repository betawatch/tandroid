// default package

import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class r06 {
    public static final ce3 b = new ce3("LibraryVersion", "");
    public static final r06 c = new r06();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        IOException e;
        String str2;
        InputStream inputStream;
        ce3 ce3Var = b;
        fre.g(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream2 = null;
        r6 = null;
        String str3 = null;
        inputStream2 = null;
        try {
            try {
                inputStream = r06.class.getResourceAsStream("/" + str + ".properties");
            } catch (IOException e2) {
                e = e2;
                str2 = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str3 = properties.getProperty("version", null);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(str3).length());
                sb.append(str);
                sb.append(" version is ");
                sb.append(str3);
                String sb2 = sb.toString();
                if (Log.isLoggable(ce3Var.b, 2)) {
                    String str4 = ce3Var.c;
                    if (str4 != null) {
                        sb2 = str4.concat(sb2);
                    }
                    Log.v("LibraryVersion", sb2);
                }
            } else {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                sb3.append("Failed to get app version for libraryName: ");
                sb3.append(str);
                String sb4 = sb3.toString();
                if (Log.isLoggable(ce3Var.b, 5)) {
                    String str5 = ce3Var.c;
                    if (str5 != null) {
                        sb4 = str5.concat(sb4);
                    }
                    Log.w("LibraryVersion", sb4);
                }
            }
        } catch (IOException e3) {
            e = e3;
            inputStream2 = inputStream;
            str2 = null;
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 43);
            sb5.append("Failed to get app version for libraryName: ");
            sb5.append(str);
            String sb6 = sb5.toString();
            if (Log.isLoggable(ce3Var.b, 6)) {
                String str6 = ce3Var.c;
                if (str6 != null) {
                    sb6 = str6.concat(sb6);
                }
                Log.e("LibraryVersion", sb6, e);
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
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                fke.a(inputStream2);
            }
            throw th;
        }
        if (inputStream != null) {
            fke.a(inputStream);
        }
        if (str3 == null) {
            if (Log.isLoggable(ce3Var.b, 3)) {
                String str7 = ce3Var.c;
                Log.d("LibraryVersion", str7 != null ? str7.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            }
            str3 = "UNKNOWN";
        }
        concurrentHashMap.put(str, str3);
        return str3;
    }
}
