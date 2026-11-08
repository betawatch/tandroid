package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class a1 extends AsyncTask {
    public final /* synthetic */ int a = 1;
    public final HashMap b = new HashMap();
    public Exception c;
    public final c20 d;

    public a1(c20 c20Var) {
        this.d = c20Var;
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
                } catch (Exception e10) {
                    this.c = e10;
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
                } catch (Exception e11) {
                    this.c = e11;
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
                org.telegram.ui.Wallet.t tVar = (org.telegram.ui.Wallet.t) this.d;
                if (tVar != null) {
                    if (this.c != null) {
                        tVar.a(null);
                        break;
                    } else {
                        tVar.a(bitmap);
                        break;
                    }
                }
                break;
            default:
                String str = (String) obj;
                c20 c20Var = this.d;
                if (c20Var != null) {
                    if (this.c != null) {
                        c20Var.a(null);
                        break;
                    } else {
                        c20Var.a(str);
                        break;
                    }
                }
                break;
        }
    }

    public a1(org.telegram.ui.Wallet.t tVar) {
        this.d = tVar;
    }
}
