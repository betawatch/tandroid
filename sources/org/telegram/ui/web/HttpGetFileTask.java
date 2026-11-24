package org.telegram.ui.web;

import android.os.AsyncTask;
import android.os.Build;
import android.webkit.MimeTypeMap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class HttpGetFileTask extends AsyncTask<String, Void, File> {
    private qac doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private qac progressCallback;

    public HttpGetFileTask(qac qacVar, qac qacVar2) {
        this.doneCallback = qacVar;
        this.progressCallback = qacVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInBackground$0(float f) {
        this.progressCallback.a(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInBackground$1() {
        this.progressCallback.a(Float.valueOf(1.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f2, code lost:
    
        r19.file.delete();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0195 A[LOOP:0: B:2:0x0008->B:35:0x0195, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v13 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r20v18 */
    /* JADX WARN: Type inference failed for: r20v19 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public File doInBackground(String... strArr) {
        String str;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        int i = 0;
        String str2 = strArr[0];
        int i2 = 0;
        long j = 0;
        ?? r20 = strArr;
        while (true) {
            Object obj = null;
            if (i2 >= 5) {
                this.exception = new RuntimeException("too many retries");
                return null;
            }
            int i3 = i2 > 0 ? 1 : i;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                httpURLConnection.setRequestMethod("GET");
                if (i3 != 0) {
                    httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-");
                }
                httpURLConnection.setDoInput(true);
                int responseCode = httpURLConnection.getResponseCode();
                InputStream errorStream = (responseCode < 200 || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                int responseCode2 = httpURLConnection.getResponseCode();
                ?? r0 = i3;
                if (i3 != 0) {
                    r0 = i3;
                    if (responseCode2 != 206) {
                        fc4.b("failed to resume, server doesn't support partial content. downloading from the beginning");
                        try {
                            File file = this.file;
                            if (file != null) {
                                try {
                                    file.delete();
                                } catch (Exception unused) {
                                }
                                this.file = null;
                            }
                            r0 = i;
                            j = 0;
                        } catch (Exception e) {
                            e = e;
                            str = str2;
                            r20 = 0;
                            j = 0;
                            if (e instanceof ProtocolException) {
                                this.exception = e;
                                fc4.g(e, true);
                                return r20;
                            }
                            fc4.b("got unexpected end of stream, lets try to resume");
                            i2++;
                            str2 = str;
                            i = 0;
                            r20 = r20;
                        }
                    }
                }
                long contentLengthLong = Build.VERSION.SDK_INT >= 24 ? httpURLConnection.getContentLengthLong() : httpURLConnection.getContentLength();
                long j2 = 0;
                try {
                    long j3 = this.max_size;
                    if (j3 > 0 && contentLengthLong > j3) {
                        errorStream.close();
                        if (this.file != null) {
                            this.file = null;
                        }
                        return null;
                    }
                    if (this.file == null) {
                        String str3 = this.overrideExt;
                        if (str3 == null) {
                            str3 = MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType());
                        }
                        this.file = g6b.w(z8c.t0, str3);
                    }
                    try {
                        bufferedInputStream = new BufferedInputStream(errorStream, TLObject.FLAG_14);
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(this.file, (boolean) r0);
                                try {
                                    try {
                                        channel = fileOutputStream.getChannel();
                                        try {
                                            byte[] bArr = new byte[TLObject.FLAG_14];
                                            while (true) {
                                                int read = bufferedInputStream.read(bArr);
                                                r20 = obj;
                                                long j4 = j2;
                                                byte b = 2;
                                                if (read == -1) {
                                                    if (this.progressCallback != null) {
                                                        gm.c3(new kg5(this, b));
                                                    }
                                                    if (channel != null) {
                                                        channel.close();
                                                    }
                                                    fileOutputStream.close();
                                                    bufferedInputStream.close();
                                                    return isCancelled() ? r20 : this.file;
                                                }
                                                try {
                                                    channel.write(ByteBuffer.wrap(bArr, i, read));
                                                    str = str2;
                                                    j += read;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    str = str2;
                                                    Throwable th4 = th;
                                                    if (channel != null) {
                                                        throw th4;
                                                    }
                                                    try {
                                                        channel.close();
                                                        throw th4;
                                                    } catch (Throwable th5) {
                                                        th4.addSuppressed(th5);
                                                        throw th4;
                                                    }
                                                }
                                                try {
                                                    if (isCancelled()) {
                                                        try {
                                                            break;
                                                        } catch (Exception e2) {
                                                            fc4.g(e2, true);
                                                        }
                                                    } else {
                                                        if (contentLengthLong > j4) {
                                                            float l = Utilities.l(j / contentLengthLong);
                                                            if (this.progressCallback != null) {
                                                                gm.c3(new ku(this, l, b));
                                                            }
                                                        }
                                                        obj = r20;
                                                        str2 = str;
                                                        j2 = j4;
                                                        i = 0;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    Throwable th42 = th;
                                                    if (channel != null) {
                                                    }
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            r20 = obj;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        th2 = th;
                                        try {
                                            fileOutputStream.close();
                                            throw th2;
                                        } catch (Throwable th9) {
                                            th2.addSuppressed(th9);
                                            throw th2;
                                        }
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    r20 = 0;
                                    str = str2;
                                    th2 = th;
                                    fileOutputStream.close();
                                    throw th2;
                                }
                            } catch (Throwable th11) {
                                th = th11;
                                th = th;
                                try {
                                    bufferedInputStream.close();
                                    throw th;
                                } catch (Throwable th12) {
                                    th.addSuppressed(th12);
                                    throw th;
                                }
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            r20 = 0;
                            str = str2;
                            th = th;
                            bufferedInputStream.close();
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        if (e instanceof ProtocolException) {
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    r20 = 0;
                    str = str2;
                }
            } catch (Exception e5) {
                e = e5;
                str = str2;
                r20 = 0;
            }
            fc4.b("got unexpected end of stream, lets try to resume");
            i2++;
            str2 = str;
            i = 0;
            r20 = r20;
        }
        channel.close();
        fileOutputStream.close();
        bufferedInputStream.close();
        return r20;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(File file) {
        qac qacVar = this.doneCallback;
        if (qacVar != null) {
            if (this.exception == null) {
                qacVar.a(file);
            } else {
                qacVar.a(null);
            }
        }
    }

    public HttpGetFileTask setDestFile(File file) {
        this.file = file;
        return this;
    }

    public HttpGetFileTask setMaxSize(long j) {
        this.max_size = j;
        return this;
    }

    public HttpGetFileTask setOverrideExtension(String str) {
        this.overrideExt = str;
        return this;
    }
}
