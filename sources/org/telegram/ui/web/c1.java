package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.q20;
import org.telegram.ui.f11;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class c1 extends AsyncTask {
    public final /* synthetic */ int a = 1;
    public final HashMap b = new HashMap();
    public Exception c;
    public final q20 d;

    public c1(q20 q20Var) {
        this.d = q20Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.a) {
            case 0:
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry : this.b.entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null) {
                            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setDoInput(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        httpURLConnection.disconnect();
                        break;
                    } else if (httpURLConnection.getContentType() == null || !httpURLConnection.getContentType().contains("svg")) {
                        break;
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    this.c = e;
                    return null;
                }
                break;
            default:
                try {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
                    for (Map.Entry entry2 : this.b.entrySet()) {
                        if (entry2.getKey() != null && entry2.getValue() != null) {
                            httpURLConnection2.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                        }
                    }
                    httpURLConnection2.setRequestMethod("GET");
                    httpURLConnection2.setDoInput(true);
                    int responseCode2 = httpURLConnection2.getResponseCode();
                    BufferedReader bufferedReader = (responseCode2 < 200 || responseCode2 >= 300) ? new BufferedReader(new InputStreamReader(httpURLConnection2.getErrorStream())) : new BufferedReader(new InputStreamReader(httpURLConnection2.getInputStream()));
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            bufferedReader.close();
                            break;
                        } else {
                            sb2.append(readLine);
                        }
                    }
                } catch (Exception e7) {
                    this.c = e7;
                    return null;
                }
                break;
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        switch (this.a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                f11 f11Var = (f11) this.d;
                if (f11Var != null) {
                    if (this.c != null) {
                        f11Var.a(null);
                        break;
                    } else {
                        f11Var.a(bitmap);
                        break;
                    }
                }
                break;
            default:
                String str = (String) obj;
                q20 q20Var = this.d;
                if (q20Var != null) {
                    if (this.c != null) {
                        q20Var.a(null);
                        break;
                    } else {
                        q20Var.a(str);
                        break;
                    }
                }
                break;
        }
    }

    public c1(f11 f11Var) {
        this.d = f11Var;
    }
}
