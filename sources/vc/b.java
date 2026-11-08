package vc;

import a8.wa;
import c8.od;
import c8.yc;
import g9.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.Security;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.hy0;
import tc.d;
import tc.e;
import tc.f;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class b {
    public static final c a = new c();

    public static HttpURLConnection a(String str, l lVar) {
        Throwable th2;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.stripe.com/v1/tokens").openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(80000);
        httpURLConnection.setUseCaches(false);
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Charset", "UTF-8");
        hashMap.put("Accept", "application/json");
        hashMap.put("User-Agent", "Stripe/v1 JavaBindings/3.5.0");
        hashMap.put("Authorization", "Bearer " + lVar.a);
        String[] strArr = {"os.name", "os.version", "os.arch", "java.version", "java.vendor", "java.vm.version", "java.vm.vendor"};
        HashMap hashMap2 = new HashMap();
        for (int i7 = 0; i7 < 7; i7++) {
            String str2 = strArr[i7];
            hashMap2.put(str2, System.getProperty(str2));
        }
        hashMap2.put("bindings.version", "3.5.0");
        hashMap2.put("lang", "Java");
        hashMap2.put("publisher", "Stripe");
        hashMap.put("X-Stripe-Client-User-Agent", new JSONObject(hashMap2).toString());
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (httpURLConnection instanceof HttpsURLConnection) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(a);
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        try {
            outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(str.getBytes("UTF-8"));
                outputStream.close();
                return httpURLConnection;
            } catch (Throwable th3) {
                th2 = th3;
                if (outputStream == null) {
                    throw th2;
                }
                outputStream.close();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
            outputStream = null;
        }
    }

    public static String b(HashMap hashMap) {
        StringBuilder sb2 = new StringBuilder();
        for (a aVar : d(null, hashMap)) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            String str = aVar.a;
            String str2 = aVar.b;
            sb2.append((str == null ? null : URLEncoder.encode(str, "UTF-8")) + "=" + (str2 == null ? null : URLEncoder.encode(str2, "UTF-8")));
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r4 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        java.security.Security.setProperty("networkaddress.cache.ttl", "-1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        java.security.Security.setProperty("networkaddress.cache.ttl", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0083, code lost:
    
        if (r4 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hy0 c(HashMap hashMap, l lVar) {
        String str;
        int i7;
        String str2;
        String str3;
        Boolean bool = Boolean.TRUE;
        hy0 hy0Var = null;
        try {
            str = Security.getProperty("networkaddress.cache.ttl");
        } catch (SecurityException unused) {
            str = null;
        }
        try {
            Security.setProperty("networkaddress.cache.ttl", "0");
        } catch (SecurityException unused2) {
            bool = Boolean.FALSE;
            if (!lVar.a.trim().isEmpty()) {
            }
        }
        if (!lVar.a.trim().isEmpty()) {
            throw new tc.c("No API key provided. (HINT: set your API key using 'Stripe.apiKey = <API-KEY>'. You can generate API keys from the Stripe web interface. See https://stripe.com/api for details or email support@stripe.com if you have questions.", null);
        }
        try {
            wa f10 = f(hashMap, lVar);
            i7 = f10.b;
            str2 = (String) f10.c;
            Map map = (Map) f10.d;
            List list = map == null ? null : (List) map.get("Request-Id");
            str3 = (list == null || list.size() <= 0) ? null : (String) list.get(0);
        } catch (JSONException unused3) {
            if (bool.booleanValue()) {
            }
        } catch (Throwable th2) {
            if (bool.booleanValue()) {
                if (str == null) {
                    Security.setProperty("networkaddress.cache.ttl", "-1");
                } else {
                    Security.setProperty("networkaddress.cache.ttl", str);
                }
            }
            throw th2;
        }
        if (i7 < 200 || i7 >= 300) {
            g(i7, str2, str3);
            throw null;
        }
        hy0Var = yc.a(str2);
        if (bool.booleanValue()) {
        }
        return hy0Var;
    }

    public static LinkedList d(String str, Map map) {
        LinkedList linkedList = new LinkedList();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (str != null) {
                    str2 = str + "[" + str2 + "]";
                }
                linkedList.addAll(e(value, str2));
            }
        }
        return linkedList;
    }

    public static List e(Object obj, String str) {
        if (obj instanceof Map) {
            return d(str, (Map) obj);
        }
        if (!(obj instanceof List)) {
            if ("".equals(obj)) {
                throw new d(f1.m("You cannot set '", str, "' to an empty string. We interpret empty strings as null in requests. You may set '", str, "' to null to delete the property."), null, null);
            }
            if (obj == null) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(new a(str, ""));
                return linkedList;
            }
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(new a(str, obj.toString()));
            return linkedList2;
        }
        List list = (List) obj;
        LinkedList linkedList3 = new LinkedList();
        Iterator it = list.iterator();
        String r10 = rf.b.r(str, "[]");
        if (list.isEmpty()) {
            linkedList3.add(new a(str, ""));
            return linkedList3;
        }
        while (it.hasNext()) {
            linkedList3.addAll(e(it.next(), r10));
        }
        return linkedList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wa f(HashMap hashMap, l lVar) {
        String next;
        HttpURLConnection httpURLConnection = null;
        try {
            String b10 = b(hashMap);
            try {
                try {
                    HttpURLConnection a10 = a(b10, lVar);
                    try {
                        int responseCode = a10.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            InputStream errorStream = a10.getErrorStream();
                            next = new Scanner(errorStream, "UTF-8").useDelimiter("\\A").next();
                            errorStream.close();
                        } else {
                            InputStream inputStream = a10.getInputStream();
                            next = new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
                            inputStream.close();
                        }
                        Map<String, List<String>> headerFields = a10.getHeaderFields();
                        wa waVar = new wa((char) 0, 23);
                        waVar.b = responseCode;
                        waVar.c = next;
                        waVar.d = headerFields;
                        a10.disconnect();
                        return waVar;
                    } catch (IOException e10) {
                        e = e10;
                        throw new tc.a("IOException during API request to Stripe (https://api.stripe.com/v1/tokens): " + e.getMessage() + " Please check your internet connection and try again. If this problem persists, you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com.", null, e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = b10;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
            } catch (Throwable th3) {
                th = th3;
                if (httpURLConnection != null) {
                }
                throw th;
            }
        } catch (UnsupportedEncodingException e12) {
            throw new d("Unable to encode parameters to UTF-8. Please contact support@stripe.com for assistance.", null, e12);
        }
    }

    public static void g(int i7, String str, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("error");
            od.a(jSONObject.optString("charge"));
            od.a(jSONObject.optString("code"));
            od.a(jSONObject.optString("decline_code"));
            str3 = od.a(jSONObject.optString("message"));
            od.a(jSONObject.optString("param"));
            od.a(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
        } catch (JSONException unused) {
            str3 = "An improperly formatted error response was found.";
        }
        if (i7 == 429) {
            throw new f(str3, str2, null);
        }
        switch (i7) {
            case 400:
                throw new d(str3, str2, null);
            case 401:
                throw new tc.c(str3, str2);
            case 402:
                throw new d(str3, str2, null);
            case 403:
                throw new e(str3, str2);
            case 404:
                throw new d(str3, str2, null);
            default:
                throw new tc.b(str3, str2, null);
        }
    }
}
