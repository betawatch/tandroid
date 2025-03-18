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
    private String overrideExt;
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
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0133, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0137, code lost:
    
        if (r17.progressCallback == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0139, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new org.telegram.ui.web.HttpGetFileTask$$ExternalSyntheticLambda1(r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0141, code lost:
    
        if (r10 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0143, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x014a, code lost:
    
        r15.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x014d, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0154, code lost:
    
        if (isCancelled() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0159, code lost:
    
        return r17.file;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e6, code lost:
    
        r17.file.delete();
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0181 A[LOOP:0: B:2:0x0009->B:35:0x0181, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018b A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public File doInBackground(String... strArr) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        FileOutputStream fileOutputStream;
        Throwable th2;
        FileChannel channel;
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
                    String str2 = this.overrideExt;
                    if (str2 == null) {
                        str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType());
                    }
                    this.file = StoryEntry.makeCacheFile(UserConfig.selectedAccount, str2);
                }
                bufferedInputStream = new BufferedInputStream(errorStream, LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM);
                try {
                    fileOutputStream = new FileOutputStream(this.file, z);
                    try {
                        channel = fileOutputStream.getChannel();
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
                                    try {
                                        if (isCancelled()) {
                                            try {
                                                break;
                                            } catch (Exception e2) {
                                                FileLog.e(e2);
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
                                    } catch (Throwable th4) {
                                        th3 = th4;
                                        j = 0;
                                        if (channel != null) {
                                            throw th3;
                                        }
                                        try {
                                            channel.close();
                                            throw th3;
                                        } catch (Throwable th5) {
                                            th3.addSuppressed(th5);
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    j = 0;
                                    th3 = th;
                                    if (channel != null) {
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                        }
                    } catch (Throwable th8) {
                        th2 = th8;
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
                    try {
                        bufferedInputStream.close();
                        throw th;
                    } catch (Throwable th11) {
                        th.addSuppressed(th11);
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                if (!(e instanceof ProtocolException)) {
                }
            }
        }
        this.exception = new RuntimeException("too many retries");
        return null;
        try {
            channel.close();
            try {
                fileOutputStream.close();
                try {
                    bufferedInputStream.close();
                    return null;
                } catch (Exception e4) {
                    e = e4;
                    j = 0;
                    if (!(e instanceof ProtocolException)) {
                    }
                }
            } catch (Throwable th12) {
                th = th12;
                j = 0;
                bufferedInputStream.close();
                throw th;
            }
        } catch (Throwable th13) {
            th2 = th13;
            j = 0;
            fileOutputStream.close();
            throw th2;
        }
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

    public HttpGetFileTask setOverrideExtension(String str) {
        this.overrideExt = str;
        return this;
    }
}
