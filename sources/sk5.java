// default package

import android.net.Uri;
import android.os.AsyncTask;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sk5 extends AsyncTask {
    public final tk5 a;
    public boolean b = true;
    public HttpURLConnection c;
    public final boolean d;
    public final /* synthetic */ fl5 e;

    public sk5(fl5 fl5Var, tk5 tk5Var) {
        this.e = fl5Var;
        this.a = tk5Var;
        this.d = Uri.parse(tk5Var.i.g).getQueryParameter("s") != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r2 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c4, code lost:
    
        if (r2 == null) goto L53;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00ef A[Catch: all -> 0x012f, TryCatch #5 {all -> 0x012f, blocks: (B:79:0x00e2, B:81:0x00e6, B:83:0x00ec, B:84:0x0115, B:101:0x00ef, B:103:0x00f3, B:104:0x00f6, B:106:0x00fa, B:108:0x0100, B:110:0x010c, B:111:0x010f, B:113:0x0113), top: B:78:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6 A[Catch: all -> 0x012f, TryCatch #5 {all -> 0x012f, blocks: (B:79:0x00e2, B:81:0x00e6, B:83:0x00ec, B:84:0x0115, B:101:0x00ef, B:103:0x00f3, B:104:0x00f6, B:106:0x00fa, B:108:0x0100, B:110:0x010c, B:111:0x010f, B:113:0x0113), top: B:78:0x00e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011c A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #15 {all -> 0x011f, blocks: (B:87:0x0118, B:89:0x011c), top: B:86:0x0118 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012b A[Catch: Exception -> 0x012e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x012e, blocks: (B:39:0x00ce, B:93:0x012b), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doInBackground(Object[] objArr) {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        HttpURLConnection httpURLConnection;
        int read;
        int responseCode;
        String str = null;
        try {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(this.a.i.g.replace("athumb://", "https://")).openConnection();
                this.c = httpURLConnection2;
                httpURLConnection2.setConnectTimeout(5000);
                this.c.setReadTimeout(5000);
                this.c.connect();
                try {
                    HttpURLConnection httpURLConnection3 = this.c;
                    if (httpURLConnection3 != null && (responseCode = httpURLConnection3.getResponseCode()) != 200 && responseCode != 202 && responseCode != 304) {
                        this.b = false;
                    }
                } catch (Exception e) {
                    fa4.g(e, false);
                }
                InputStream inputStream2 = this.c.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[32768];
                        while (!isCancelled() && (read = inputStream2.read(bArr)) > 0) {
                            byteArrayOutputStream2.write(bArr, 0, read);
                        }
                        this.b = false;
                        JSONArray jSONArray = new JSONObject(new String(byteArrayOutputStream2.toByteArray())).getJSONArray("results");
                        if (jSONArray.length() > 0) {
                            String string = jSONArray.getJSONObject(0).getString("artworkUrl100");
                            if (this.d) {
                                try {
                                    HttpURLConnection httpURLConnection4 = this.c;
                                    if (httpURLConnection4 != null) {
                                        httpURLConnection4.disconnect();
                                    }
                                } catch (Throwable unused) {
                                }
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Throwable th) {
                                        fa4.g(th, true);
                                    }
                                }
                                try {
                                    byteArrayOutputStream2.close();
                                } catch (Exception unused2) {
                                }
                                return string;
                            }
                            str = string.replace("100x100", "600x600");
                            try {
                                HttpURLConnection httpURLConnection5 = this.c;
                                if (httpURLConnection5 != null) {
                                    httpURLConnection5.disconnect();
                                }
                            } catch (Throwable unused3) {
                            }
                        } else {
                            try {
                                HttpURLConnection httpURLConnection6 = this.c;
                                if (httpURLConnection6 != null) {
                                    httpURLConnection6.disconnect();
                                }
                            } catch (Throwable unused4) {
                            }
                        }
                        try {
                            inputStream2.close();
                        } catch (Throwable th2) {
                            fa4.g(th2, true);
                        }
                        byteArrayOutputStream2.close();
                    } catch (Throwable th3) {
                        inputStream = inputStream2;
                        th = th3;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        try {
                            if (th instanceof SocketTimeoutException) {
                                if (th instanceof UnknownHostException) {
                                    this.b = false;
                                } else if (th instanceof SocketException) {
                                    if (th.getMessage() != null && th.getMessage().contains("ECONNRESET")) {
                                        this.b = false;
                                    }
                                } else if (th instanceof FileNotFoundException) {
                                    this.b = false;
                                }
                            } else if (a.r()) {
                                this.b = false;
                            }
                            fa4.g(th, false);
                            try {
                                httpURLConnection = this.c;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                            } catch (Throwable unused5) {
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th4) {
                                    fa4.g(th4, true);
                                }
                            }
                            if (byteArrayOutputStream != null) {
                                return null;
                            }
                            byteArrayOutputStream.close();
                            return str;
                        } catch (Throwable th5) {
                            try {
                                HttpURLConnection httpURLConnection7 = this.c;
                                if (httpURLConnection7 != null) {
                                    httpURLConnection7.disconnect();
                                }
                            } catch (Throwable unused6) {
                            }
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th6) {
                                    fa4.g(th6, true);
                                }
                            }
                            if (byteArrayOutputStream == null) {
                                throw th5;
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th5;
                            } catch (Exception unused7) {
                                throw th5;
                            }
                        }
                    }
                } catch (Throwable th7) {
                    inputStream = inputStream2;
                    th = th7;
                    byteArrayOutputStream = null;
                }
            } catch (Exception unused8) {
                return str;
            }
        } catch (Throwable th8) {
            th = th8;
            inputStream = null;
            byteArrayOutputStream = null;
            if (th instanceof SocketTimeoutException) {
            }
            fa4.g(th, false);
            httpURLConnection = this.c;
            if (httpURLConnection != null) {
            }
            if (inputStream != null) {
            }
            if (byteArrayOutputStream != null) {
            }
        }
        return str;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        this.e.s.c(new rk5(this, (byte) 0));
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        String str = (String) obj;
        fl5 fl5Var = this.e;
        co3 co3Var = fl5Var.s;
        if (str != null) {
            co3Var.c(new hb5(this, str, (byte) 9));
        } else if (this.b) {
            co3Var.c(new jk5(fl5Var, this.a.e, (byte) 0));
        }
        co3Var.c(new rk5(this, (byte) 1));
    }
}
