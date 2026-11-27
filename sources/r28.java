// default package

import android.os.AsyncTask;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.Scanner;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.ui.p;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class r28 extends AsyncTask {
    public final /* synthetic */ zc1 a;
    public final /* synthetic */ p b;

    public r28(p pVar, zc1 zc1Var) {
        this.b = pVar;
        this.a = zc1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|2|3|(15:52|53|(3:55|56|(1:58))|(1:7)(2:48|(1:50)(1:51))|8|9|10|11|12|13|14|15|(1:23)(1:19)|20|21)|5|(0)(0)|8|9|10|11|12|13|14|15|(1:17)|23|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0150, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013e, code lost:
    
        r15 = r14;
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0158, code lost:
    
        cc4.g(r14, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015b, code lost:
    
        if (r15 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015d, code lost:
    
        r15.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0161, code lost:
    
        r14 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0162, code lost:
    
        r4 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0163, code lost:
    
        if (r4 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0165, code lost:
    
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0168, code lost:
    
        throw r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014e, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013b, code lost:
    
        r4 = r14;
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0079, code lost:
    
        if (r14.endsWith(".smart-glocal.com/cds/v1/tokenize/card") == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084 A[Catch: all -> 0x0154, Exception -> 0x0156, TryCatch #4 {all -> 0x0154, blocks: (B:3:0x000c, B:53:0x0058, B:56:0x006b, B:58:0x0073, B:7:0x007e, B:8:0x009b, B:48:0x0084, B:50:0x008c, B:51:0x0094), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007e A[Catch: all -> 0x0154, Exception -> 0x0156, TRY_ENTER, TryCatch #4 {all -> 0x0154, blocks: (B:3:0x000c, B:53:0x0058, B:56:0x006b, B:58:0x0073, B:7:0x007e, B:8:0x009b, B:48:0x0084, B:50:0x008c, B:51:0x0094), top: B:2:0x000c }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        JSONObject jSONObject;
        String string;
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        int responseCode;
        p pVar = this.b;
        zc1 zc1Var = this.a;
        HttpURLConnection httpURLConnection2 = null;
        r4 = null;
        r4 = null;
        String str = null;
        try {
            try {
                jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("number", (String) zc1Var.a);
                jSONObject2.put("expiration_month", String.format(Locale.US, "%02d", (Integer) zc1Var.m));
                jSONObject2.put("expiration_year", String.valueOf((Integer) zc1Var.n));
                jSONObject2.put("security_code", String.valueOf((String) zc1Var.b));
                jSONObject.put("card", jSONObject2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            HttpURLConnection httpURLConnection3 = null;
        }
        try {
            if (pVar.D0.native_params != null) {
                try {
                    string = new JSONObject(pVar.D0.native_params.data).getString("tokenize_url");
                    if (string != null) {
                        try {
                            if (string.startsWith("https://")) {
                            }
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception unused2) {
                }
                httpURLConnection = (HttpURLConnection) (string == null ? new URL(string) : pVar.D0.invoice.test ? new URL("https://tgb-playground.smart-glocal.com/cds/v1/tokenize/card") : new URL("https://tgb.smart-glocal.com/cds/v1/tokenize/card")).openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(80000);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("X-PUBLIC-TOKEN", pVar.k0);
                outputStream = httpURLConnection.getOutputStream();
                outputStream.write(jSONObject.toString().getBytes("UTF-8"));
                outputStream.close();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 || responseCode >= 300) {
                    boolean z = f11.a;
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    String next = new Scanner(errorStream, "UTF-8").useDelimiter("\\A").next();
                    errorStream.close();
                    cc4.d(String.valueOf(next));
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    InputStream inputStream = httpURLConnection.getInputStream();
                    String next2 = new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
                    inputStream.close();
                    jSONObject3.put("token", new JSONObject(next2).getJSONObject("data").getString("token"));
                    jSONObject3.put(TeXSymbolParser.TYPE_ATTR, "card");
                    str = jSONObject3.toString();
                }
                httpURLConnection.disconnect();
                return str;
            }
            outputStream.write(jSONObject.toString().getBytes("UTF-8"));
            outputStream.close();
            responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200) {
            }
            boolean z2 = f11.a;
            InputStream errorStream2 = httpURLConnection.getErrorStream();
            String next3 = new Scanner(errorStream2, "UTF-8").useDelimiter("\\A").next();
            errorStream2.close();
            cc4.d(String.valueOf(next3));
            httpURLConnection.disconnect();
            return str;
        } catch (Throwable th2) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
        string = null;
        httpURLConnection = (HttpURLConnection) (string == null ? new URL(string) : pVar.D0.invoice.test ? new URL("https://tgb-playground.smart-glocal.com/cds/v1/tokenize/card") : new URL("https://tgb.smart-glocal.com/cds/v1/tokenize/card")).openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(80000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("X-PUBLIC-TOKEN", pVar.k0);
        outputStream = httpURLConnection.getOutputStream();
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        p pVar = this.b;
        if (pVar.R0) {
            return;
        }
        if (str == null) {
            jj.t0(ob6.M0(2131747131, null), pVar);
        } else {
            pVar.x0 = str;
            pVar.h0();
        }
        pVar.N0(true, false);
        pVar.J0(false);
    }
}
