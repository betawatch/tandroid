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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.recorder.StoryEntry;

/* loaded from: classes3.dex */
public class HttpGetFileTask extends AsyncTask {
    private Utilities.Callback doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private String overrideExt;
    private Utilities.Callback progressCallback;

    public HttpGetFileTask(Utilities.Callback callback, Utilities.Callback callback2) {
        this.doneCallback = callback;
        this.progressCallback = callback2;
    }

    public HttpGetFileTask setOverrideExtension(String str) {
        this.overrideExt = str;
        return this;
    }

    public HttpGetFileTask setDestFile(File file) {
        this.file = file;
        return this;
    }

    public HttpGetFileTask setMaxSize(long j) {
        this.max_size = j;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00ec, code lost:
    
        r18.file.delete();
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0174 A[LOOP:0: B:2:0x0009->B:35:0x0174, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017f A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public File doInBackground(String... strArr) {
        long j;
        InputStream errorStream;
        long contentLength;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
        String str = strArr[0];
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        while (i < 5) {
            boolean z = i > 0;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("GET");
                if (z) {
                    httpURLConnection.setRequestProperty("Range", "bytes=" + j3 + "-");
                }
                httpURLConnection.setDoInput(true);
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode < 300) {
                    errorStream = httpURLConnection.getInputStream();
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                }
                int responseCode2 = httpURLConnection.getResponseCode();
                if (z && responseCode2 != 206) {
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
                        j3 = j2;
                        z = false;
                    } catch (Exception e) {
                        e = e;
                        j3 = j2;
                        j = j3;
                        if (!(e instanceof ProtocolException)) {
                            FileLog.d("got unexpected end of stream, lets try to resume");
                            i++;
                            j2 = j;
                        } else {
                            this.exception = e;
                            FileLog.e(e);
                            return null;
                        }
                    }
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    contentLength = httpURLConnection.getContentLengthLong();
                } else {
                    contentLength = httpURLConnection.getContentLength();
                }
                long j4 = this.max_size;
                int i2 = (j4 > j2 ? 1 : (j4 == j2 ? 0 : -1));
                j = i2;
                if (i2 > 0) {
                    int i3 = (contentLength > j4 ? 1 : (contentLength == j4 ? 0 : -1));
                    j = i3;
                    if (i3 > 0) {
                        errorStream.close();
                        if (this.file != null) {
                            this.file = null;
                        }
                        return null;
                    }
                }
                if (this.file == null) {
                    String str2 = this.overrideExt;
                    if (str2 == null) {
                        str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType());
                    }
                    this.file = StoryEntry.makeCacheFile(UserConfig.selectedAccount, str2);
                }
                bufferedInputStream = new BufferedInputStream(errorStream, 16384);
                try {
                    try {
                        fileOutputStream = new FileOutputStream(this.file, z);
                        try {
                            try {
                                channel = fileOutputStream.getChannel();
                                try {
                                    byte[] bArr = new byte[16384];
                                    while (true) {
                                        int read = bufferedInputStream.read(bArr);
                                        j = j2;
                                        if (read != -1) {
                                            try {
                                                channel.write(ByteBuffer.wrap(bArr, 0, read));
                                                j3 += read;
                                                if (isCancelled()) {
                                                    try {
                                                        break;
                                                    } catch (Exception e2) {
                                                        FileLog.e(e2);
                                                    }
                                                } else {
                                                    if (contentLength > j) {
                                                        final float clamp01 = Utilities.clamp01(j3 / contentLength);
                                                        if (this.progressCallback != null) {
                                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.HttpGetFileTask$$ExternalSyntheticLambda0
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    HttpGetFileTask.this.progressCallback.run(Float.valueOf(clamp01));
                                                                }
                                                            });
                                                        }
                                                    }
                                                    j2 = j;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                Throwable th4 = th;
                                                if (channel == null) {
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
                                        } else {
                                            if (this.progressCallback != null) {
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.HttpGetFileTask$$ExternalSyntheticLambda1
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        HttpGetFileTask.this.progressCallback.run(Float.valueOf(1.0f));
                                                    }
                                                });
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
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    j = j2;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                th2 = th;
                                try {
                                    fileOutputStream.close();
                                    throw th2;
                                } catch (Throwable th8) {
                                    th2.addSuppressed(th8);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            j = j2;
                            th2 = th;
                            fileOutputStream.close();
                            throw th2;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        j = j2;
                        th = th;
                        try {
                            try {
                                bufferedInputStream.close();
                                throw th;
                            } catch (Throwable th11) {
                                th.addSuppressed(th11);
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            if (!(e instanceof ProtocolException)) {
                            }
                        }
                    }
                } catch (Throwable th12) {
                    th = th12;
                    th = th;
                    bufferedInputStream.close();
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                j = j2;
            }
        }
        this.exception = new RuntimeException("too many retries");
        return null;
        channel.close();
        fileOutputStream.close();
        bufferedInputStream.close();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(File file) {
        Utilities.Callback callback = this.doneCallback;
        if (callback != null) {
            if (this.exception == null) {
                callback.run(file);
            } else {
                callback.run(null);
            }
        }
    }
}
