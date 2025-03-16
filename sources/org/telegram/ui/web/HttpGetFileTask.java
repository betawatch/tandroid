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
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.recorder.StoryEntry;

/* loaded from: classes5.dex */
public class HttpGetFileTask extends AsyncTask {
    private Utilities.Callback doneCallback;
    private Exception exception;
    private File file;
    private long max_size = -1;
    private Utilities.Callback progressCallback;

    public HttpGetFileTask(Utilities.Callback callback, Utilities.Callback callback2) {
        this.doneCallback = callback;
        this.progressCallback = callback2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInBackground$0(float f) {
        this.progressCallback.run(Float.valueOf(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$doInBackground$1() {
        this.progressCallback.run(Float.valueOf(1.0f));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x012e, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0132, code lost:
    
        if (r17.progressCallback == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0134, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new org.telegram.ui.web.HttpGetFileTask$$ExternalSyntheticLambda1(r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x013c, code lost:
    
        if (r10 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x013e, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0145, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0148, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x014f, code lost:
    
        if (isCancelled() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0154, code lost:
    
        return r17.file;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e1, code lost:
    
        r17.file.delete();
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x015a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017c A[LOOP:0: B:2:0x0009->B:35:0x017c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0186 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public File doInBackground(String... strArr) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        int i = 0;
        String str = strArr[0];
        long j = 0;
        long j2 = 0;
        int i2 = 0;
        while (i2 < 5) {
            boolean z = i2 > 0;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("GET");
                if (z) {
                    httpURLConnection.setRequestProperty("Range", "bytes=" + j2 + "-");
                }
                httpURLConnection.setDoInput(true);
                int responseCode = httpURLConnection.getResponseCode();
                InputStream errorStream = (responseCode < 200 || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
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
                        j2 = j;
                        z = false;
                    } catch (Exception e) {
                        e = e;
                        j2 = j;
                        if (!(e instanceof ProtocolException)) {
                            this.exception = e;
                            FileLog.e(e);
                            return null;
                        }
                        FileLog.d("got unexpected end of stream, lets try to resume");
                        i2++;
                        i = 0;
                    }
                }
                long contentLengthLong = Build.VERSION.SDK_INT >= 24 ? httpURLConnection.getContentLengthLong() : httpURLConnection.getContentLength();
                long j3 = this.max_size;
                if (j3 > j && contentLengthLong > j3) {
                    errorStream.close();
                    if (this.file != null) {
                        this.file = null;
                    }
                    return null;
                }
                if (this.file == null) {
                    this.file = StoryEntry.makeCacheFile(UserConfig.selectedAccount, MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType()));
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(errorStream, LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.file, z);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            byte[] bArr = new byte[LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM];
                            while (true) {
                                int read = bufferedInputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                try {
                                    channel.write(ByteBuffer.wrap(bArr, i, read));
                                    j2 += read;
                                    if (isCancelled()) {
                                        try {
                                            try {
                                                break;
                                            } catch (Exception e2) {
                                                FileLog.e(e2);
                                                try {
                                                    channel.close();
                                                    try {
                                                        fileOutputStream.close();
                                                        try {
                                                            bufferedInputStream.close();
                                                            return null;
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            j = 0;
                                                            if (!(e instanceof ProtocolException)) {
                                                            }
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        j = 0;
                                                        try {
                                                            bufferedInputStream.close();
                                                            throw th;
                                                        } catch (Throwable th5) {
                                                            th.addSuppressed(th5);
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    th2 = th6;
                                                    j = 0;
                                                    try {
                                                        fileOutputStream.close();
                                                        throw th2;
                                                    } catch (Throwable th7) {
                                                        th2.addSuppressed(th7);
                                                        throw th2;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th8) {
                                            th3 = th8;
                                            j = 0;
                                            if (channel != null) {
                                                throw th3;
                                            }
                                            try {
                                                channel.close();
                                                throw th3;
                                            } catch (Throwable th9) {
                                                th3.addSuppressed(th9);
                                                throw th3;
                                            }
                                        }
                                    } else {
                                        if (contentLengthLong > 0) {
                                            final float clamp01 = Utilities.clamp01(j2 / contentLengthLong);
                                            if (this.progressCallback != null) {
                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.HttpGetFileTask$$ExternalSyntheticLambda0
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        HttpGetFileTask.this.lambda$doInBackground$0(clamp01);
                                                    }
                                                });
                                            }
                                        }
                                        i = 0;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    j = 0;
                                    th3 = th;
                                    if (channel != null) {
                                    }
                                }
                            }
                        } catch (Throwable th11) {
                            th = th11;
                        }
                    } catch (Throwable th12) {
                        th2 = th12;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    bufferedInputStream.close();
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                if (!(e instanceof ProtocolException)) {
                }
            }
        }
        this.exception = new RuntimeException("too many retries");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(File file) {
        Utilities.Callback callback = this.doneCallback;
        if (callback != null) {
            if (this.exception != null) {
                file = null;
            }
            callback.run(file);
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
}
