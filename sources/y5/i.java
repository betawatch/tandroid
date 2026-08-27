package y5;

import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i {
    public static final c9.b b = new c9.b("LibraryVersion", "");
    public static final i c = new i();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        IOException e9;
        String str2;
        InputStream inputStream;
        c9.b bVar = b;
        l.g(str, "Please provide a valid libraryName");
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
                inputStream = i.class.getResourceAsStream("/" + str + ".properties");
            } catch (IOException e10) {
                e9 = e10;
                str2 = null;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (inputStream != null) {
                properties.load(inputStream);
                str3 = properties.getProperty("version", null);
                String str4 = str + " version is " + str3;
                if (Log.isLoggable(bVar.b, 2)) {
                    String str5 = bVar.c;
                    if (str5 != null) {
                        str4 = str5.concat(str4);
                    }
                    Log.v("LibraryVersion", str4);
                }
            } else {
                String str6 = "Failed to get app version for libraryName: " + str;
                if (Log.isLoggable(bVar.b, 5)) {
                    String str7 = bVar.c;
                    if (str7 != null) {
                        str6 = str7.concat(str6);
                    }
                    Log.w("LibraryVersion", str6);
                }
            }
        } catch (IOException e11) {
            e9 = e11;
            inputStream2 = inputStream;
            str2 = null;
            String str8 = "Failed to get app version for libraryName: " + str;
            if (Log.isLoggable(bVar.b, 6)) {
                String str9 = bVar.c;
                if (str9 != null) {
                    str8 = str9.concat(str8);
                }
                Log.e("LibraryVersion", str8, e9);
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
                f6.b.a(inputStream2);
            }
            throw th;
        }
        if (inputStream != null) {
            f6.b.a(inputStream);
        }
        if (str3 == null) {
            if (Log.isLoggable(bVar.b, 3)) {
                String str10 = bVar.c;
                Log.d("LibraryVersion", str10 != null ? str10.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            }
            str3 = "UNKNOWN";
        }
        concurrentHashMap.put(str, str3);
        return str3;
    }
}
