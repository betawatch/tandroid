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
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.w5;
import vh.n5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public class HttpGetFileTask extends AsyncTask<String, Void, File> {
    private q20 doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private q20 progressCallback;

    public HttpGetFileTask(q20 q20Var, q20 q20Var2) {
        this.doneCallback = q20Var;
        this.progressCallback = q20Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInBackground$0(float f7) {
        this.progressCallback.a(Float.valueOf(f7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInBackground$1() {
        this.progressCallback.a(Float.valueOf(1.0f));
    }

    public HttpGetFileTask setDestFile(File file) {
        this.file = file;
        return this;
    }

    public HttpGetFileTask setMaxSize(long j10) {
        this.max_size = j10;
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
        int i10 = 0;
        String str = strArr[0];
        int i11 = 0;
        long j10 = 0;
        ?? r19 = strArr;
        while (true) {
            Object obj = null;
            if (i11 >= 5) {
                this.exception = new RuntimeException("too many retries");
                return null;
            }
            int i12 = i11 > 0 ? 1 : i10;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("GET");
                if (i12 != 0) {
                    httpURLConnection.setRequestProperty("Range", "bytes=" + j10 + "-");
                }
                httpURLConnection.setDoInput(true);
                int responseCode = httpURLConnection.getResponseCode();
                InputStream errorStream = (responseCode < 200 || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                int responseCode2 = httpURLConnection.getResponseCode();
                ?? r02 = i12;
                if (i12 != 0) {
                    r02 = i12;
                    if (responseCode2 != 206) {
                        f8.b("failed to resume, server doesn't support partial content. downloading from the beginning");
                        try {
                            File file = this.file;
                            if (file != null) {
                                try {
                                    file.delete();
                                } catch (Exception unused) {
                                }
                                this.file = null;
                            }
                            r02 = i10;
                            j10 = 0;
                        } catch (Exception e) {
                            e = e;
                            r17 = str;
                            r19 = 0;
                            j10 = 0;
                            if (e instanceof ProtocolException) {
                            }
                        }
                    }
                }
                long contentLengthLong = Build.VERSION.SDK_INT >= 24 ? httpURLConnection.getContentLengthLong() : httpURLConnection.getContentLength();
                try {
                    long j11 = this.max_size;
                    r17 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                    if (r17 > 0 && contentLengthLong > j11) {
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
                        this.file = n5.w(d20.s0, str2);
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
                                                org.telegram.messenger.i0.g3(new w5(this, 17));
                                            }
                                            if (channel != null) {
                                                channel.close();
                                            }
                                            fileOutputStream.close();
                                            bufferedInputStream.close();
                                            return isCancelled() ? r19 : this.file;
                                        }
                                        try {
                                            channel.write(ByteBuffer.wrap(bArr, i10, read));
                                            r17 = str;
                                            j10 += read;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r17 = str;
                                        }
                                        try {
                                            if (isCancelled()) {
                                                try {
                                                    break;
                                                } catch (Exception e7) {
                                                    f8.g(e7, true);
                                                }
                                            } else {
                                                if (contentLengthLong > 0) {
                                                    float l4 = Utilities.l(j10 / contentLengthLong);
                                                    if (this.progressCallback != null) {
                                                        org.telegram.messenger.i0.g3(new org.telegram.ui.a0(this, l4, 3));
                                                    }
                                                }
                                                obj = r19;
                                                str = r17;
                                                i10 = 0;
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
                    } catch (Exception e10) {
                        e = e10;
                        if (e instanceof ProtocolException) {
                            this.exception = e;
                            f8.g(e, true);
                            return r19;
                        }
                        f8.b("got unexpected end of stream, lets try to resume");
                        i11++;
                        str = r17;
                        i10 = 0;
                        r19 = r19;
                    }
                } catch (Exception e11) {
                    e = e11;
                    r17 = str;
                    r19 = 0;
                }
            } catch (Exception e12) {
                e = e12;
                r17 = str;
                r19 = 0;
            }
            f8.b("got unexpected end of stream, lets try to resume");
            i11++;
            str = r17;
            i10 = 0;
            r19 = r19;
        }
        channel.close();
        fileOutputStream.close();
        bufferedInputStream.close();
        return r19;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(File file) {
        q20 q20Var = this.doneCallback;
        if (q20Var != null) {
            if (this.exception == null) {
                q20Var.a(file);
            } else {
                q20Var.a(null);
            }
        }
    }
}
