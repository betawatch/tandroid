// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class r9b {
    public static final t9b a = new t9b();

    public static HttpURLConnection a(String str, g29 g29Var) {
        Throwable th;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://api.stripe.com/v1/tokens").openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(80000);
        httpURLConnection.setUseCaches(false);
        HashMap hashMap = new HashMap();
        hashMap.put("Accept-Charset", "UTF-8");
        hashMap.put("Accept", "application/json");
        hashMap.put("User-Agent", "Stripe/v1 JavaBindings/3.5.0");
        hashMap.put("Authorization", "Bearer " + ((String) g29Var.b));
        String[] strArr = {"os.name", "os.version", "os.arch", "java.version", "java.vendor", "java.vm.version", "java.vm.vendor"};
        HashMap hashMap2 = new HashMap();
        for (int i = 0; i < 7; i++) {
            String str2 = strArr[i];
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
            } catch (Throwable th2) {
                th = th2;
                if (outputStream == null) {
                    throw th;
                }
                outputStream.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    public static String b(HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        for (q9b q9bVar : d(null, hashMap)) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            String str = q9bVar.a;
            String str2 = q9bVar.b;
            sb.append((str == null ? null : URLEncoder.encode(str, "UTF-8")) + "=" + (str2 == null ? null : URLEncoder.encode(str2, "UTF-8")));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        java.security.Security.setProperty("networkaddress.cache.ttl", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        java.security.Security.setProperty("networkaddress.cache.ttl", "-1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vk9 c(HashMap hashMap, g29 g29Var) {
        String str;
        int i;
        String str2;
        String str3;
        Boolean bool = Boolean.TRUE;
        vk9 vk9Var = null;
        try {
            str = Security.getProperty("networkaddress.cache.ttl");
        } catch (SecurityException unused) {
            str = null;
        }
        try {
            Security.setProperty("networkaddress.cache.ttl", "0");
        } catch (SecurityException unused2) {
            bool = Boolean.FALSE;
            if (!((String) g29Var.b).trim().isEmpty()) {
            }
        }
        if (!((String) g29Var.b).trim().isEmpty()) {
            throw new v40("No API key provided. (HINT: set your API key using 'Stripe.apiKey = <API-KEY>'. You can generate API keys from the Stripe web interface. See https://stripe.com/api for details or email support@stripe.com if you have questions.", null);
        }
        try {
            kp f = f(hashMap, g29Var);
            i = f.b;
            str2 = (String) f.c;
            Map map = (Map) f.d;
            List list = map == null ? null : (List) map.get("Request-Id");
            str3 = (list == null || list.size() <= 0) ? null : (String) list.get(0);
        } catch (JSONException unused3) {
            if (bool.booleanValue()) {
            }
        } catch (Throwable th) {
            if (bool.booleanValue()) {
                if (str == null) {
                    Security.setProperty("networkaddress.cache.ttl", "-1");
                } else {
                    Security.setProperty("networkaddress.cache.ttl", str);
                }
            }
            throw th;
        }
        if (i < 200 || i >= 300) {
            g(i, str2, str3);
            throw null;
        }
        vk9Var = qve.a(str2);
        if (bool.booleanValue()) {
        }
        return vk9Var;
    }

    public static LinkedList d(String str, Map map) {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (str != null) {
                str2 = tb4.q(str, "[", str2, "]");
            }
            linkedList.addAll(e(value, str2));
        }
        return linkedList;
    }

    public static List e(Object obj, String str) {
        if (obj instanceof Map) {
            return d(str, (Map) obj);
        }
        if (!(obj instanceof List)) {
            if ("".equals(obj)) {
                throw new sc1(b00.i("You cannot set '", str, "' to an empty string. We interpret empty strings as null in requests. You may set '", str, "' to null to delete the property."), null, null);
            }
            if (obj == null) {
                LinkedList linkedList = new LinkedList();
                linkedList.add(new q9b(str, ""));
                return linkedList;
            }
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(new q9b(str, obj.toString()));
            return linkedList2;
        }
        List list = (List) obj;
        LinkedList linkedList3 = new LinkedList();
        Iterator it = list.iterator();
        String o = tb4.o(str, "[]");
        if (list.isEmpty()) {
            linkedList3.add(new q9b(str, ""));
            return linkedList3;
        }
        while (it.hasNext()) {
            linkedList3.addAll(e(it.next(), o));
        }
        return linkedList3;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kp f(HashMap hashMap, g29 g29Var) {
        HttpURLConnection httpURLConnection;
        String next;
        HttpURLConnection httpURLConnection2 = null;
        try {
            try {
                httpURLConnection = a(b(hashMap), g29Var);
                try {
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        if (responseCode < 200 || responseCode >= 300) {
                            InputStream errorStream = httpURLConnection.getErrorStream();
                            next = new Scanner(errorStream, "UTF-8").useDelimiter("\\A").next();
                            errorStream.close();
                        } else {
                            InputStream inputStream = httpURLConnection.getInputStream();
                            next = new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
                            inputStream.close();
                        }
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        kp kpVar = new kp((byte) 15, false);
                        kpVar.b = responseCode;
                        kpVar.c = next;
                        kpVar.d = headerFields;
                        httpURLConnection.disconnect();
                        return kpVar;
                    } catch (IOException e) {
                        e = e;
                        throw new e1("IOException during API request to Stripe (https://api.stripe.com/v1/tokens): " + e.getMessage() + " Please check your internet connection and try again. If this problem persists, you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com.", null, e);
                    }
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection2 != null) {
                }
                throw th;
            }
        } catch (UnsupportedEncodingException e3) {
            throw new sc1("Unable to encode parameters to UTF-8. Please contact support@stripe.com for assistance.", null, e3);
        }
    }

    public static void g(int i, String str, String str2) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("error");
            oue.a(jSONObject.optString("charge"));
            oue.a(jSONObject.optString("code"));
            oue.a(jSONObject.optString("decline_code"));
            str3 = oue.a(jSONObject.optString("message"));
            oue.a(jSONObject.optString("param"));
            oue.a(jSONObject.optString(TeXSymbolParser.TYPE_ATTR));
        } catch (JSONException unused) {
            str3 = "An improperly formatted error response was found.";
        }
        if (i == 429) {
            throw new ez8(str3, str2, null);
        }
        switch (i) {
            case 400:
                throw new sc1(str3, str2, null);
            case 401:
                throw new v40(str3, str2);
            case 402:
                throw new sc1(str3, str2, null);
            case 403:
                throw new h38(str3, str2);
            case 404:
                throw new sc1(str3, str2, null);
            default:
                throw new f1(str3, str2, null);
        }
    }
}
