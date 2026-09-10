package org.telegram.ui.web;

import android.os.AsyncTask;
import android.os.Build;
import android.webkit.MimeTypeMap;
import bi.r9;
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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
    /* JADX WARN: Removed duplicated region for block: B:35:0x0178 A[LOOP:0: B:2:0x0009->B:35:0x0178, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0183 A[SYNTHETIC] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public File doInBackground(String... strArr) {
        long j3;
        BufferedInputStream bufferedInputStream;
        Throwable th2;
        FileOutputStream fileOutputStream;
        Throwable th3;
        FileChannel channel;
        String str = strArr[0];
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        while (i10 < 5) {
            boolean z10 = i10 > 0;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod("GET");
                if (z10) {
                    httpURLConnection.setRequestProperty("Range", "bytes=" + j11 + "-");
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
                        j11 = j10;
                        z10 = false;
                    } catch (Exception e) {
                        e = e;
                        j11 = j10;
                        j3 = j11;
                        if (e instanceof ProtocolException) {
                            this.exception = e;
                            FileLog.e(e);
                            return null;
                        }
                        FileLog.d("got unexpected end of stream, lets try to resume");
                        i10++;
                        j10 = j3;
                    }
                }
                long contentLengthLong = Build.VERSION.SDK_INT >= 24 ? httpURLConnection.getContentLengthLong() : httpURLConnection.getContentLength();
                long j12 = this.max_size;
                int i11 = (j12 > j10 ? 1 : (j12 == j10 ? 0 : -1));
                j3 = i11;
                try {
                    try {
                        try {
                            try {
                                try {
                                    if (i11 > 0) {
                                        int i12 = (contentLengthLong > j12 ? 1 : (contentLengthLong == j12 ? 0 : -1));
                                        j3 = i12;
                                        if (i12 > 0) {
                                            errorStream.close();
                                            if (this.file != null) {
                                                this.file = null;
                                            }
                                            return null;
                                        }
                                    }
                                    byte[] bArr = new byte[16384];
                                    while (true) {
                                        int read = bufferedInputStream.read(bArr);
                                        j3 = j10;
                                        if (read == -1) {
                                            if (this.progressCallback != null) {
                                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.x(this, 14));
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
                                            j11 += read;
                                            if (isCancelled()) {
                                                try {
                                                    break;
                                                } catch (Exception e7) {
                                                    FileLog.e(e7);
                                                }
                                            } else {
                                                if (contentLengthLong > j3) {
                                                    float clamp01 = Utilities.clamp01(j11 / contentLengthLong);
                                                    if (this.progressCallback != null) {
                                                        AndroidUtilities.runOnUIThread(new org.telegram.ui.c0(this, clamp01, 5));
                                                    }
                                                }
                                                j10 = j3;
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
                                    j3 = j10;
                                }
                                channel = fileOutputStream.getChannel();
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
                            j3 = j10;
                            th3 = th;
                            fileOutputStream.close();
                            throw th3;
                        }
                        fileOutputStream = new FileOutputStream(this.file, z10);
                    } catch (Throwable th11) {
                        th = th11;
                        th2 = th;
                        try {
                            try {
                                bufferedInputStream.close();
                                throw th2;
                            } catch (Throwable th12) {
                                th2.addSuppressed(th12);
                                throw th2;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            if (e instanceof ProtocolException) {
                            }
                        }
                    }
                } catch (Throwable th13) {
                    th = th13;
                    j3 = j10;
                    th2 = th;
                    bufferedInputStream.close();
                    throw th2;
                }
                if (this.file == null) {
                    String str2 = this.overrideExt;
                    if (str2 == null) {
                        str2 = MimeTypeMap.getSingleton().getExtensionFromMimeType(httpURLConnection.getContentType());
                    }
                    this.file = r9.w(UserConfig.selectedAccount, str2);
                }
                bufferedInputStream = new BufferedInputStream(errorStream, 16384);
            } catch (Exception e11) {
                e = e11;
                j3 = j10;
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
