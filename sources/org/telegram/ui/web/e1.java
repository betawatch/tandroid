package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e1 extends AsyncTask {
    public final HashMap a = new HashMap();
    public final yu0 b;
    public Exception c;

    public e1(yu0 yu0Var) {
        this.b = yu0Var;
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
            if (responseCode >= 200 && responseCode < 300) {
                return (httpURLConnection.getContentType() == null || !httpURLConnection.getContentType().contains("svg")) ? BitmapFactory.decodeStream(new BufferedInputStream(httpURLConnection.getInputStream())) : SvgHelper.getBitmap((InputStream) new BufferedInputStream(httpURLConnection.getInputStream()), 64, 64, false);
            }
            httpURLConnection.disconnect();
            return null;
        } catch (Exception e10) {
            this.c = e10;
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        yu0 yu0Var = this.b;
        if (yu0Var != null) {
            if (this.c == null) {
                yu0Var.run(bitmap);
            } else {
                yu0Var.run(null);
            }
        }
    }
}
