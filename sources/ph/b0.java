package ph;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Pair;
import java.net.HttpURLConnection;
import java.net.URL;
import nh.t4;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class b0 extends AsyncTask {
    public String a;
    public long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ t4 d;

    public b0(String str, t4 t4Var) {
        this.c = str;
        this.d = t4Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.c).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setConnectTimeout(MediaDataController.MAX_STYLE_RUNS_COUNT);
            httpURLConnection.setReadTimeout(MediaDataController.MAX_STYLE_RUNS_COUNT);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.setDoInput(false);
            httpURLConnection.getResponseCode();
            if (Build.VERSION.SDK_INT >= 24) {
                this.b = httpURLConnection.getContentLengthLong();
            } else {
                this.b = httpURLConnection.getContentLength();
            }
            String contentType = httpURLConnection.getContentType();
            this.a = contentType;
            if (contentType.contains("; ")) {
                String str = this.a;
                this.a = str.substring(0, str.indexOf("; "));
            }
            httpURLConnection.getInputStream().close();
            return null;
        } catch (Exception e10) {
            FileLog.e(e10);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        h0.h.put(this.c, new Pair(this.a, Long.valueOf(this.b)));
        this.d.run(this.a, Long.valueOf(this.b));
    }
}
