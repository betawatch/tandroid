package org.telegram.ui.web;

import android.os.AsyncTask;
import android.os.Build;
import android.webkit.MimeTypeMap;
import ci.l8;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public class HttpGetFileTask extends AsyncTask<String, Void, File> {
    private Utilities.Callback<File> doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private Utilities.Callback<Float> progressCallback;

    public HttpGetFileTask(Utilities.Callback<File> callback, Utilities.Callback<Float> callback2) {
        this.doneCallback = callback;
        this.progressCallback = callback2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInBackground$0(float f7) {
        this.progressCallback.run(Float.valueOf(f7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInBackground$1() {
        this.progressCallback.run(Float.valueOf(1.0f));
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

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ec, code lost:
    
        r18.file.delete();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0176 A[LOOP:0: B:2:0x0009->B:35:0x0176, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11, types: [long] */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v2, types: [int] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public File doInBackground(String... strArr) {
        ?? r16;
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        FileOutputStream fileOutputStream;
        Throwable th3;
        FileChannel channel;
        String str = strArr[0];
        long j3 = 0;
        int i10 = 0;
        long j10 = 0;
        while (i10 < 5) {
            boolean z10 = i10 > 0;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("GET");
                if (z10) {
                    httpURLConnection.setRequestProperty("Range", "bytes=" + j10 + "-");
                }
                httpURLConnection.setDoInput(true);
                int responseCode = httpURLConnection.getResponseCode();
                InputStream errorStream = (responseCode < 200 || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                int responseCode2 = httpURLConnection.getResponseCode();
                if (z10 && responseCode2 != 206) {
                    FileLog.d("failed to resume, server doesn't support partial content. downloading from the beginning");
                    try {
                        File file = this.file;
                        if (file != null) {
                            try {
                                file.delete();
                            } catch (Exception unused) {
                            }
                            this.file = null;
                        }
                        z10 = false;
                        j10 = j3;
                    } catch (Exception e7) {
                        e = e7;
                        j10 = j3;
                        r16 = j10;
                        if (e instanceof ProtocolException) {
                            this.exception = e;
                            FileLog.e(e);
                            return null;
                        }
                        FileLog.d("got unexpected end of stream, lets try to resume");
                        i10++;
                        j3 = r16;
                    }
                }
                long contentLengthLong = Build.VERSION.SDK_INT >= 24 ? httpURLConnection.getContentLengthLong() : httpURLConnection.getContentLength();
                long j11 = this.max_size;
                r16 = (j11 > j3 ? 1 : (j11 == j3 ? 0 : -1));
                if (r16 <= 0 || contentLengthLong <= j11) {
                    if (this.file == null) {
                        String str2 = this.overrideExt;
                        if (str2 == null) {
                            str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType());
                        }
                        this.file = l8.w(UserConfig.selectedAccount, str2);
                    }
                    bufferedInputStream = new BufferedInputStream(errorStream, 16384);
                    try {
                        try {
                            fileOutputStream = new FileOutputStream(this.file, z10);
                            try {
                                try {
                                    channel = fileOutputStream.getChannel();
                                    try {
                                        byte[] bArr = new byte[16384];
                                        while (true) {
                                            int read = bufferedInputStream.read(bArr);
                                            r16 = j3;
                                            if (read == -1) {
                                                if (this.progressCallback != null) {
                                                    AndroidUtilities.runOnUIThread(new q0(this, 3));
                                                }
                                                if (channel != null) {
                                                    channel.close();
                                                }
                                                fileOutputStream.close();
                                                bufferedInputStream.close();
                                                if (isCancelled()) {
                                                    return null;
                                                }
                                                return this.file;
                                            }
                                            try {
                                                channel.write(ByteBuffer.wrap(bArr, 0, read));
                                                j10 += read;
                                                if (isCancelled()) {
                                                    try {
                                                        break;
                                                    } catch (Exception e10) {
                                                        FileLog.e(e10);
                                                    }
                                                } else {
                                                    if (contentLengthLong > r16) {
                                                        float clamp01 = Utilities.clamp01(j10 / contentLengthLong);
                                                        if (this.progressCallback != null) {
                                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.c0(this, clamp01, 5));
                                                        }
                                                    }
                                                    j3 = r16;
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
                                        r16 = j3;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    th3 = th;
                                    try {
                                        fileOutputStream.close();
                                        throw th3;
                                    } catch (Throwable th9) {
                                        th3.addSuppressed(th9);
                                        throw th3;
                                    }
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                r16 = j3;
                                th3 = th;
                                fileOutputStream.close();
                                throw th3;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            r16 = j3;
                            th2 = th;
                            try {
                                try {
                                    bufferedInputStream.close();
                                    throw th2;
                                } catch (Throwable th12) {
                                    th2.addSuppressed(th12);
                                    throw th2;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                if (e instanceof ProtocolException) {
                                }
                            }
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        th2 = th;
                        bufferedInputStream.close();
                        throw th2;
                    }
                } else {
                    errorStream.close();
                    if (this.file != null) {
                        this.file = null;
                    }
                }
                return null;
            } catch (Exception e12) {
                e = e12;
                r16 = j3;
            }
        }
        this.exception = new RuntimeException("too many retries");
        return null;
        channel.close();
        fileOutputStream.close();
        bufferedInputStream.close();
        return null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(File file) {
        Utilities.Callback<File> callback = this.doneCallback;
        if (callback != null) {
            if (this.exception == null) {
                callback.run(file);
            } else {
                callback.run(null);
            }
        }
    }
}
