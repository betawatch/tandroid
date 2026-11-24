// default package

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qi4 {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");
    public final Context a;
    public final nv8 b;
    public final re1 c;

    public qi4(Context context, nv8 nv8Var) {
        this.a = context;
        this.b = nv8Var;
        re1 re1Var = new re1();
        f8e f8eVar = f8e.E;
        if (f8eVar == null) {
            Pattern pattern = uac.b;
            f8eVar = new f8e();
            f8e.E = f8eVar;
        }
        uac uacVar = uac.c;
        if (uacVar == null) {
            uacVar = new uac(f8eVar);
            uac.c = uacVar;
        }
        re1Var.c = uacVar;
        this.c = re1Var;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e2) {
            throw new ui4(e2.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", b10.i("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : b10.h(", ", str)));
    }

    public static long d(String str) {
        ite.a("Invalid Expiration Timestamp.", d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static wa0 e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        long j = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        qb0 qb0Var = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str4 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        str = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        j = d(jsonReader.nextString());
                        b = (byte) (b | 1);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                if (b != 1) {
                    dq9.m("Missing required properties: tokenExpirationTimestamp");
                    return null;
                }
                qb0Var = new qb0(str, j, 0);
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new wa0(str2, str3, str4, qb0Var, 1);
    }

    public static qb0 f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, e));
        byte b = (byte) (0 | 1);
        jsonReader.beginObject();
        long j = 0;
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                j = d(jsonReader.nextString());
                b = (byte) (b | 1);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        if (b == 1) {
            return new qb0(str, j, 1);
        }
        dq9.m("Missing required properties: tokenExpirationTimestamp");
        return null;
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.1.2");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            dq9.o(e2);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.1.2");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e2) {
            dq9.o(e2);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            wa3.d("Cannot send request to FIS servers. No OutputStream available.");
            return;
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0 A[Catch: NameNotFoundException -> 0x00e1, TryCatch #0 {NameNotFoundException -> 0x00e1, blocks: (B:8:0x0068, B:10:0x007a, B:17:0x0084, B:21:0x0090, B:23:0x00a0, B:27:0x00b9, B:29:0x00c3, B:31:0x00dc), top: B:7:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9 A[Catch: NameNotFoundException -> 0x00e1, TryCatch #0 {NameNotFoundException -> 0x00e1, blocks: (B:8:0x0068, B:10:0x007a, B:17:0x0084, B:21:0x0090, B:23:0x00a0, B:27:0x00b9, B:29:0x00c3, B:31:0x00dc), top: B:7:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HttpURLConnection c(URL url, String str) {
        PackageInfo b;
        Signature[] signatureArr;
        byte[] bArr;
        MessageDigest messageDigest;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.a;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            of5 of5Var = (of5) this.b.get();
            if (of5Var != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) Tasks.await(((ac3) of5Var).b()));
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    Log.w("ContentValues", "Failed to get heartbeats header", e2);
                } catch (ExecutionException e3) {
                    Log.w("ContentValues", "Failed to get heartbeats header", e3);
                }
            }
            String str2 = null;
            try {
                b = s0d.a(context).b(64, context.getPackageName());
                signatureArr = b.signatures;
            } catch (PackageManager.NameNotFoundException e4) {
                Log.e("ContentValues", "No such package: " + context.getPackageName(), e4);
            }
            if (signatureArr != null && signatureArr.length == 1) {
                int i = 0;
                while (true) {
                    if (i >= 2) {
                        messageDigest = null;
                        break;
                    }
                    try {
                        messageDigest = MessageDigest.getInstance("SHA1");
                    } catch (NoSuchAlgorithmException unused) {
                    }
                    if (messageDigest != null) {
                        break;
                    }
                    i++;
                }
                if (messageDigest != null) {
                    bArr = messageDigest.digest(b.signatures[0].toByteArray());
                    if (bArr != null) {
                        Log.e("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                    } else {
                        int length = bArr.length;
                        StringBuilder sb = new StringBuilder(length << 1);
                        for (int i2 = 0; i2 < length; i2++) {
                            char[] cArr = zbd.a;
                            sb.append(cArr[(bArr[i2] & 240) >>> 4]);
                            sb.append(cArr[bArr[i2] & 15]);
                        }
                        str2 = sb.toString();
                    }
                    httpURLConnection.addRequestProperty("X-Android-Cert", str2);
                    httpURLConnection.addRequestProperty("x-goog-api-key", str);
                    return httpURLConnection;
                }
            }
            bArr = null;
            if (bArr != null) {
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", str2);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused2) {
            throw new ui4("Firebase Installations Service is unavailable. Please try again later.");
        }
    }
}
