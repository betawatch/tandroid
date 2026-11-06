package org.telegram.ui.web;

import android.os.AsyncTask;
import android.os.Build;
import android.webkit.MimeTypeMap;
import fi.e7;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.m5;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public class HttpGetFileTask extends AsyncTask<String, Void, File> {
    private c20 doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private c20 progressCallback;

    public HttpGetFileTask(c20 c20Var, c20 c20Var2) {
        this.doneCallback = c20Var;
        this.progressCallback = c20Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInBackground$0(float f10) {
        this.progressCallback.a(Float.valueOf(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInBackground$1() {
        this.progressCallback.a(Float.valueOf(1.0f));
    }

    public HttpGetFileTask setDestFile(File file) {
        this.file = file;
        return this;
    }

    public HttpGetFileTask setMaxSize(long j3) {
        this.max_size = j3;
        return this;
    }

    public HttpGetFileTask setOverrideExtension(String str) {
        this.overrideExt = str;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0100, code lost:
    
        r18.file.delete();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019e A[LOOP:0: B:2:0x0008->B:36:0x019e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01aa A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [int] */
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
        FileOutputStream fileOutputStream;
        FileChannel channel;
        int i7 = 0;
        String str = strArr[0];
        int i10 = 0;
        long j3 = 0;
        ?? r19 = strArr;
        while (true) {
            Object obj = null;
            if (i10 >= 5) {
                this.exception = new RuntimeException("too many retries");
                return null;
            }
            int i11 = i10 > 0 ? 1 : i7;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("GET");
                if (i11 != 0) {
                    httpURLConnection.setRequestProperty("Range", "bytes=" + j3 + "-");
                }
                httpURLConnection.setDoInput(true);
                int responseCode = httpURLConnection.getResponseCode();
                InputStream errorStream = (responseCode < 200 || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                int responseCode2 = httpURLConnection.getResponseCode();
                ?? r02 = i11;
                if (i11 != 0) {
                    r02 = i11;
                    if (responseCode2 != 206) {
                        a8.b("failed to resume, server doesn't support partial content. downloading from the beginning");
                        try {
                            File file = this.file;
                            if (file != null) {
                                try {
                                    file.delete();
                                } catch (Exception unused) {
                                }
                                this.file = null;
                            }
                            r02 = i7;
                            j3 = 0;
                        } catch (Exception e10) {
                            e = e10;
                            r17 = str;
                            r19 = 0;
                            j3 = 0;
                            if (e instanceof ProtocolException) {
                            }
                        }
                    }
                }
                long contentLengthLong = Build.VERSION.SDK_INT >= 24 ? httpURLConnection.getContentLengthLong() : httpURLConnection.getContentLength();
                try {
                    long j10 = this.max_size;
                    r17 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                    if (r17 > 0 && contentLengthLong > j10) {
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
                        this.file = e7.w(p10.s0, str2);
                    }
                    try {
                        bufferedInputStream = new BufferedInputStream(errorStream, TLObject.FLAG_14);
                        try {
                            fileOutputStream = new FileOutputStream(this.file, (boolean) r02);
                            try {
                                channel = fileOutputStream.getChannel();
                                try {
                                    byte[] bArr = new byte[TLObject.FLAG_14];
                                    while (true) {
                                        int read = bufferedInputStream.read(bArr);
                                        r19 = obj;
                                        if (read == -1) {
                                            if (this.progressCallback != null) {
                                                org.telegram.messenger.g0.h3(new m5(this, 16));
                                            }
                                            if (channel != null) {
                                                channel.close();
                                            }
                                            fileOutputStream.close();
                                            bufferedInputStream.close();
                                            return isCancelled() ? r19 : this.file;
                                        }
                                        try {
                                            channel.write(ByteBuffer.wrap(bArr, i7, read));
                                            r17 = str;
                                            j3 += read;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r17 = str;
                                        }
                                        try {
                                            if (isCancelled()) {
                                                try {
                                                    break;
                                                } catch (Exception e11) {
                                                    a8.g(e11, true);
                                                }
                                            } else {
                                                if (contentLengthLong > 0) {
                                                    float l10 = Utilities.l(j3 / contentLengthLong);
                                                    if (this.progressCallback != null) {
                                                        org.telegram.messenger.g0.h3(new org.telegram.ui.b0(this, l10, 3));
                                                    }
                                                }
                                                obj = r19;
                                                str = r17;
                                                i7 = 0;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            Throwable th4 = th;
                                            if (channel == null) {
                                                throw th4;
                                            }
                                            try {
                                                try {
                                                    channel.close();
                                                    throw th4;
                                                } catch (Throwable th5) {
                                                    th4.addSuppressed(th5);
                                                    throw th4;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                Throwable th7 = th;
                                                try {
                                                    try {
                                                        fileOutputStream.close();
                                                        throw th7;
                                                    } catch (Throwable th8) {
                                                        th7.addSuppressed(th8);
                                                        throw th7;
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    Throwable th10 = th;
                                                    try {
                                                        bufferedInputStream.close();
                                                        throw th10;
                                                    } catch (Throwable th11) {
                                                        th10.addSuppressed(th11);
                                                        throw th10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    r17 = str;
                                    r19 = obj;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                r17 = str;
                                r19 = 0;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            r17 = str;
                            r19 = 0;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        if (e instanceof ProtocolException) {
                            this.exception = e;
                            a8.g(e, true);
                            return r19;
                        }
                        a8.b("got unexpected end of stream, lets try to resume");
                        i10++;
                        str = r17;
                        i7 = 0;
                        r19 = r19;
                    }
                } catch (Exception e13) {
                    e = e13;
                    r17 = str;
                    r19 = 0;
                }
            } catch (Exception e14) {
                e = e14;
                r17 = str;
                r19 = 0;
            }
            a8.b("got unexpected end of stream, lets try to resume");
            i10++;
            str = r17;
            i7 = 0;
            r19 = r19;
        }
        channel.close();
        fileOutputStream.close();
        bufferedInputStream.close();
        return r19;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(File file) {
        c20 c20Var = this.doneCallback;
        if (c20Var != null) {
            if (this.exception == null) {
                c20Var.a(file);
            } else {
                c20Var.a(null);
            }
        }
    }
}
