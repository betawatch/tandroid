// default package

import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wm5 extends AsyncTask {
    public final String a;
    public final File b;
    public final String c;
    public int d;
    public RandomAccessFile e = null;
    public boolean f = true;
    public long g;
    public final int h;
    public final /* synthetic */ fn5 i;

    public wm5(fn5 fn5Var, String str, File file, String str2, int i) {
        this.i = fn5Var;
        this.a = str;
        this.b = file;
        this.c = str2;
        this.h = i;
    }

    public final void a(long j, long j2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (j != j2) {
            long j3 = this.g;
            if (j3 != 0 && j3 >= elapsedRealtime - 100) {
                return;
            }
        }
        this.g = elapsedRealtime;
        Utilities.d.c(new vm5(this, j, j2, (byte) 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0140 A[Catch: all -> 0x0146, TRY_LEAVE, TryCatch #3 {all -> 0x0146, blocks: (B:71:0x013c, B:73:0x0140), top: B:70:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        InputStream inputStream;
        URLConnection uRLConnection;
        InputStream inputStream2;
        List<String> list;
        String str;
        RandomAccessFile randomAccessFile;
        int responseCode;
        boolean z = false;
        try {
            uRLConnection = new URL(this.a).openConnection();
            try {
                uRLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                uRLConnection.setConnectTimeout(5000);
                uRLConnection.setReadTimeout(5000);
                if (uRLConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                    httpURLConnection.setInstanceFollowRedirects(true);
                    int responseCode2 = httpURLConnection.getResponseCode();
                    if (responseCode2 == 302 || responseCode2 == 301 || responseCode2 == 303) {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        String headerField2 = httpURLConnection.getHeaderField("Set-Cookie");
                        uRLConnection = new URL(headerField).openConnection();
                        uRLConnection.setRequestProperty("Cookie", headerField2);
                        uRLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; CPU iPhone OS 10_0 like Mac OS X) AppleWebKit/602.1.38 (KHTML, like Gecko) Version/10.0 Mobile/14A5297c Safari/602.1");
                    }
                }
                uRLConnection.connect();
                inputStream2 = uRLConnection.getInputStream();
                try {
                    this.e = new RandomAccessFile(this.b, "rws");
                } catch (Throwable th) {
                    inputStream = inputStream2;
                    th = th;
                    if (th instanceof SocketTimeoutException) {
                        if (a.r()) {
                            this.f = false;
                        }
                    } else if (th instanceof UnknownHostException) {
                        this.f = false;
                    } else if (th instanceof SocketException) {
                        if (th.getMessage() != null && th.getMessage().contains("ECONNRESET")) {
                            this.f = false;
                        }
                    } else if (th instanceof FileNotFoundException) {
                        this.f = false;
                    }
                    fc4.g(th, true);
                    inputStream2 = inputStream;
                    if (this.f) {
                    }
                    return Boolean.valueOf(z);
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            uRLConnection = null;
        }
        if (this.f) {
            try {
                if ((uRLConnection instanceof HttpURLConnection) && (responseCode = ((HttpURLConnection) uRLConnection).getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                    this.f = false;
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
            if (uRLConnection != null) {
                try {
                    Map<String, List<String>> headerFields = uRLConnection.getHeaderFields();
                    if (headerFields != null && (list = headerFields.get("content-Length")) != null && !list.isEmpty() && (str = list.get(0)) != null) {
                        this.d = Utilities.z(str).intValue();
                    }
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            }
            if (inputStream2 != null) {
                try {
                    byte[] bArr = new byte[32768];
                    int i = 0;
                    while (!isCancelled()) {
                        try {
                            int read = inputStream2.read(bArr);
                            if (read > 0) {
                                this.e.write(bArr, 0, read);
                                i += read;
                                int i2 = this.d;
                                if (i2 > 0) {
                                    a(i, i2);
                                }
                            } else if (read == -1) {
                                try {
                                    int i3 = this.d;
                                    if (i3 != 0) {
                                        long j = i3;
                                        a(j, j);
                                    }
                                    z = true;
                                } catch (Exception e3) {
                                    e = e3;
                                    z = true;
                                    fc4.g(e, true);
                                    randomAccessFile = this.e;
                                    if (randomAccessFile != null) {
                                    }
                                    if (inputStream2 != null) {
                                    }
                                    return Boolean.valueOf(z);
                                } catch (Throwable th4) {
                                    th = th4;
                                    z = true;
                                    fc4.g(th, true);
                                    randomAccessFile = this.e;
                                    if (randomAccessFile != null) {
                                    }
                                    if (inputStream2 != null) {
                                    }
                                    return Boolean.valueOf(z);
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            try {
                randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                    this.e = null;
                }
            } catch (Throwable th6) {
                fc4.g(th6, true);
            }
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (Throwable th7) {
                    fc4.g(th7, true);
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        gm.c3(new ob4((Object) this.i, (Object) this, 2, (byte) 4));
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        gm.c3(new ob4((Object) this.i, (Object) this, ((Boolean) obj).booleanValue() ? 2 : 1, (byte) 4));
    }
}
