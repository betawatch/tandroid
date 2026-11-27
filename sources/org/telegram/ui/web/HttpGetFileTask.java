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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class HttpGetFileTask extends AsyncTask<String, Void, File> {
    private pcc doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private pcc progressCallback;

    public HttpGetFileTask(pcc pccVar, pcc pccVar2) {
        this.doneCallback = pccVar;
        this.progressCallback = pccVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInBackground$0(float f) {
        this.progressCallback.a(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInBackground$1() {
        this.progressCallback.a(Float.valueOf(1.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x00ef, code lost:
    
        r18.file.delete();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018f A[LOOP:0: B:2:0x0008->B:35:0x018f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v2, types: [int] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v12 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v17 */
    /* JADX WARN: Type inference failed for: r19v18 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public File doInBackground(String... strArr) {
        ?? r17;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        int i = 0;
        String str = strArr[0];
        int i2 = 0;
        long j = 0;
        ?? r19 = strArr;
        while (true) {
            Object obj = null;
            if (i2 >= 5) {
                this.exception = new RuntimeException("too many retries");
                return null;
            }
            int i3 = i2 > 0 ? 1 : i;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
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
                        cc4.b("failed to resume, server doesn't support partial content. downloading from the beginning");
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
                            r17 = str;
                            r19 = 0;
                            j = 0;
                            if (e instanceof ProtocolException) {
                                this.exception = e;
                                cc4.g(e, true);
                                return r19;
                            }
                            cc4.b("got unexpected end of stream, lets try to resume");
                            i2++;
                            str = r17;
                            i = 0;
                            r19 = r19;
                        }
                    }
                }
                long contentLengthLong = Build.VERSION.SDK_INT >= 24 ? httpURLConnection.getContentLengthLong() : httpURLConnection.getContentLength();
                long j2 = this.max_size;
                r17 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (r17 > 0 && contentLengthLong > j2) {
                    errorStream.close();
                    if (this.file != null) {
                        this.file = null;
                    }
                    return null;
                }
                if (this.file == null) {
                    String str2 = this.overrideExt;
                    if (str2 == null) {
                        str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType());
                    }
                    this.file = c8b.w(yac.t0, str2);
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
                                            r19 = obj;
                                            if (read == -1) {
                                                if (this.progressCallback != null) {
                                                    hl.c3(new ea5(this, (byte) 10));
                                                }
                                                if (channel != null) {
                                                    channel.close();
                                                }
                                                fileOutputStream.close();
                                                bufferedInputStream.close();
                                                return isCancelled() ? r19 : this.file;
                                            }
                                            try {
                                                channel.write(ByteBuffer.wrap(bArr, i, read));
                                                r17 = str;
                                                j += read;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r17 = str;
                                            }
                                            try {
                                                if (isCancelled()) {
                                                    try {
                                                        break;
                                                    } catch (Exception e2) {
                                                        cc4.g(e2, true);
                                                    }
                                                } else {
                                                    if (contentLengthLong > 0) {
                                                        float l = Utilities.l(j / contentLengthLong);
                                                        if (this.progressCallback != null) {
                                                            hl.c3(new jt(this, l, (byte) 2));
                                                        }
                                                    }
                                                    obj = r19;
                                                    str = r17;
                                                    i = 0;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                Throwable th5 = th;
                                                if (channel == null) {
                                                    throw th5;
                                                }
                                                try {
                                                    channel.close();
                                                    throw th5;
                                                } catch (Throwable th6) {
                                                    th5.addSuppressed(th6);
                                                    throw th5;
                                                }
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        r17 = str;
                                        r19 = obj;
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
                                r17 = str;
                                r19 = 0;
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
                        r17 = str;
                        r19 = 0;
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
                r17 = str;
                r19 = 0;
            }
            cc4.b("got unexpected end of stream, lets try to resume");
            i2++;
            str = r17;
            i = 0;
            r19 = r19;
        }
        channel.close();
        fileOutputStream.close();
        bufferedInputStream.close();
        return r19;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(File file) {
        pcc pccVar = this.doneCallback;
        if (pccVar != null) {
            if (this.exception == null) {
                pccVar.a(file);
            } else {
                pccVar.a(null);
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
