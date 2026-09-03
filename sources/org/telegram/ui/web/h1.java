package org.telegram.ui.web;

import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h1 extends AsyncTask {
    public final HashMap a = new HashMap();
    public final Utilities.Callback b;
    public Exception c;

    public h1(Utilities.Callback callback) {
        this.b = callback;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(((String[]) objArr)[0]).openConnection();
            for (Map.Entry entry : this.a.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            int responseCode = httpURLConnection.getResponseCode();
            BufferedReader bufferedReader = (responseCode < 200 || responseCode >= 300) ? new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream())) : new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        } catch (Exception e6) {
            this.c = e6;
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        Utilities.Callback callback = this.b;
        if (callback != null) {
            if (this.c == null) {
                callback.run(str);
            } else {
                callback.run(null);
            }
        }
    }
}
