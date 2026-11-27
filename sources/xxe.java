// default package

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.view.Surface;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public abstract class xxe {
    public static int a(MediaExtractor mediaExtractor) {
        for (int i = 0; i < mediaExtractor.getTrackCount(); i++) {
            String string = mediaExtractor.getTrackFormat(i).getString("mime");
            if (string != null && string.startsWith("video/")) {
                return i;
            }
        }
        return -1;
    }

    public static int b(MediaExtractor mediaExtractor, MediaCodec mediaCodec, MediaCodec mediaCodec2, np9 np9Var, long j, long j2, op9 op9Var) {
        long j3;
        boolean z;
        long j4;
        long j5;
        boolean z2;
        boolean z3;
        int i;
        int dequeueOutputBuffer;
        int dequeueInputBuffer;
        MediaCodec mediaCodec3 = mediaCodec;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        int i2 = 0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z4 = false;
        int i3 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i4 = 0;
        while (!z4) {
            if (z5 || (dequeueInputBuffer = mediaCodec3.dequeueInputBuffer(10000L)) < 0) {
                j3 = elapsedRealtime;
                z = z4;
                j4 = 10000;
                j5 = 0;
                z2 = false;
            } else {
                long sampleTime = mediaExtractor.getSampleTime();
                int i5 = (mediaExtractor.getSampleFlags() & 1) != 0 ? 1 : i2;
                if (sampleTime < 0 || (sampleTime >= j2 && i5 != 0)) {
                    j3 = elapsedRealtime;
                    z = z4;
                    j5 = 0;
                    j4 = 10000;
                    mediaCodec3 = mediaCodec;
                    mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                } else {
                    ByteBuffer inputBuffer = mediaCodec3.getInputBuffer(dequeueInputBuffer);
                    int readSampleData = inputBuffer == null ? -1 : mediaExtractor.readSampleData(inputBuffer, i2);
                    if (readSampleData < 0) {
                        j3 = elapsedRealtime;
                        z = z4;
                        j5 = 0;
                        j4 = 10000;
                        mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        mediaCodec3 = mediaCodec;
                    } else {
                        j3 = elapsedRealtime;
                        z = z4;
                        j5 = 0;
                        j4 = 10000;
                        mediaCodec3 = mediaCodec;
                        mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, sampleTime, 0);
                        mediaExtractor.advance();
                        z2 = true;
                    }
                }
                z5 = true;
                z2 = true;
            }
            if (z6 || (dequeueOutputBuffer = mediaCodec3.dequeueOutputBuffer(bufferInfo, j4)) < 0) {
                z3 = true;
            } else {
                long j6 = bufferInfo.presentationTimeUs;
                boolean z7 = bufferInfo.size > 0 && j6 >= j && j6 < j2;
                mediaCodec3.releaseOutputBuffer(dequeueOutputBuffer, z7);
                if (z7) {
                    synchronized (np9Var.b) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() + 2500;
                        while (!np9Var.m) {
                            long elapsedRealtime3 = elapsedRealtime2 - SystemClock.elapsedRealtime();
                            if (elapsedRealtime3 <= j5) {
                                throw new IOException("Decoded frame did not arrive");
                            }
                            try {
                                np9Var.b.wait(elapsedRealtime3);
                                j5 = 0;
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                                throw new IOException("Video re-encoding was interrupted", e);
                            }
                        }
                        np9Var.m = false;
                    }
                    np9Var.k.updateTexImage();
                    np9Var.k.getTransformMatrix(np9Var.c);
                    short s = np9Var.a;
                    GLES20.glViewport(0, 0, s, s);
                    GLES20.glUseProgram(np9Var.i);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, np9Var.j);
                    int glGetAttribLocation = GLES20.glGetAttribLocation(np9Var.i, "aPosition");
                    int glGetAttribLocation2 = GLES20.glGetAttribLocation(np9Var.i, "aTextureCoord");
                    FloatBuffer floatBuffer = np9Var.d;
                    floatBuffer.position(0);
                    GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 16, (Buffer) np9Var.d);
                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                    floatBuffer.position(2);
                    GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 16, (Buffer) np9Var.d);
                    GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                    z3 = true;
                    GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(np9Var.i, "uTextureMatrix"), 1, false, np9Var.c, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    EGLExt.eglPresentationTimeANDROID(np9Var.f, np9Var.h, j6 * 1000);
                    if (!EGL14.eglSwapBuffers(np9Var.f, np9Var.h)) {
                        lq5.o(Integer.toHexString(EGL14.eglGetError()), "eglSwapBuffers failed: 0x");
                        return 0;
                    }
                } else {
                    z3 = true;
                }
                if ((bufferInfo.flags & 4) != 0) {
                    mediaCodec2.signalEndOfInputStream();
                    z6 = z3;
                }
                z2 = z3;
            }
            int dequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, z6 ? 10000L : 0L);
            int i6 = i4;
            z4 = z;
            while (dequeueOutputBuffer2 != -1) {
                if (dequeueOutputBuffer2 != -2) {
                    if (dequeueOutputBuffer2 >= 0) {
                        ByteBuffer outputBuffer = mediaCodec2.getOutputBuffer(dequeueOutputBuffer2);
                        int i7 = bufferInfo2.flags;
                        boolean z8 = (i7 & 2) != 0 ? z3 : false;
                        if (outputBuffer != null && (i = bufferInfo2.size) > 0 && !z8) {
                            if (i6 > 0 && (i7 & 1) != 0 && i > i6) {
                                bufferInfo2.offset += i6;
                                bufferInfo2.size = i - i6;
                            }
                            op9Var.k(outputBuffer, bufferInfo2);
                            i3++;
                        }
                        boolean z9 = (bufferInfo2.flags & 4) != 0 ? z3 : false;
                        mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer2, false);
                        z4 = z9;
                        if (z9) {
                            break;
                        }
                    }
                } else {
                    MediaFormat outputFormat = mediaCodec2.getOutputFormat();
                    i6 = rn9.f(outputFormat);
                    op9Var.o(outputFormat);
                }
                dequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, 0L);
                z2 = z3;
            }
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            if (z2) {
                elapsedRealtime = elapsedRealtime4;
            } else {
                if (elapsedRealtime4 - j3 > 5000) {
                    su3.e("Video re-encoding stalled");
                    return 0;
                }
                elapsedRealtime = j3;
            }
            i4 = i6;
            i2 = 0;
        }
        return i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5, types: [np9] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(File file, long j, long j2, long j3, int i, int i2, int i3, op9 op9Var) {
        Throwable th;
        MediaCodec mediaCodec;
        Object obj;
        Throwable th2;
        Object obj2;
        ?? r12;
        ?? r6;
        Surface createInputSurface;
        MediaCodec createDecoderByType;
        MediaCodec mediaCodec2;
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaCodec mediaCodec3 = null;
        try {
            try {
                mediaExtractor.setDataSource(file.getAbsolutePath());
                int a = a(mediaExtractor);
                if (a < 0) {
                    throw new IOException("Source file has no video track");
                }
                mediaExtractor.selectTrack(a);
                mediaExtractor.seekTo(j, 0);
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(a);
                mediaCodec = MediaCodec.createEncoderByType("video/avc");
                try {
                    mediaCodec.configure(rn9.c(i, i2, i3), (Surface) null, (MediaCrypto) null, 1);
                    createInputSurface = mediaCodec.createInputSurface();
                } catch (IllegalArgumentException e) {
                    e = e;
                    th2 = e;
                    obj2 = null;
                    throw new IOException("Video re-encoding failed", th2);
                } catch (IllegalStateException e2) {
                    e = e2;
                    th2 = e;
                    obj2 = null;
                    throw new IOException("Video re-encoding failed", th2);
                } catch (Throwable th3) {
                    th = th3;
                    obj = null;
                    r12 = obj;
                    r6 = obj;
                    if (mediaCodec3 != null) {
                    }
                    if (r6 != 0) {
                    }
                    if (mediaCodec != null) {
                    }
                    if (r12 != 0) {
                    }
                    mediaExtractor.release();
                    throw th;
                }
                try {
                    mediaCodec.start();
                    np9 np9Var = new np9(createInputSurface, i);
                    try {
                        createDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
                    } catch (IllegalArgumentException | IllegalStateException e3) {
                        th2 = e3;
                    }
                    try {
                        createDecoderByType.configure(trackFormat, np9Var.l, (MediaCrypto) null, 0);
                        createDecoderByType.start();
                        mediaCodec2 = createDecoderByType;
                        try {
                            b(mediaExtractor, mediaCodec2, mediaCodec, np9Var, j2, j3, op9Var);
                            try {
                                mediaCodec2.stop();
                            } catch (IllegalStateException unused) {
                            }
                            mediaCodec2.release();
                            np9Var.d();
                            try {
                                mediaCodec.stop();
                            } catch (IllegalStateException unused2) {
                            }
                            mediaCodec.release();
                            if (createInputSurface != null) {
                                createInputSurface.release();
                            }
                            mediaExtractor.release();
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                            th2 = e;
                            throw new IOException("Video re-encoding failed", th2);
                        } catch (IllegalStateException e5) {
                            e = e5;
                            th2 = e;
                            throw new IOException("Video re-encoding failed", th2);
                        } catch (Throwable th4) {
                            th = th4;
                            th = th;
                            mediaCodec3 = mediaCodec2;
                            r6 = np9Var;
                            r12 = createInputSurface;
                            if (mediaCodec3 != null) {
                                try {
                                    mediaCodec3.stop();
                                } catch (IllegalStateException unused3) {
                                }
                                mediaCodec3.release();
                            }
                            if (r6 != 0) {
                                r6.d();
                            }
                            if (mediaCodec != null) {
                                try {
                                    mediaCodec.stop();
                                } catch (IllegalStateException unused4) {
                                }
                                mediaCodec.release();
                            }
                            if (r12 != 0) {
                                r12.release();
                            }
                            mediaExtractor.release();
                            throw th;
                        }
                    } catch (IllegalArgumentException e6) {
                        e = e6;
                        mediaCodec2 = createDecoderByType;
                        th2 = e;
                        throw new IOException("Video re-encoding failed", th2);
                    } catch (IllegalStateException e7) {
                        e = e7;
                        mediaCodec2 = createDecoderByType;
                        th2 = e;
                        throw new IOException("Video re-encoding failed", th2);
                    } catch (Throwable th5) {
                        th = th5;
                        mediaCodec2 = createDecoderByType;
                    }
                } catch (IllegalArgumentException e8) {
                    e = e8;
                    th2 = e;
                    throw new IOException("Video re-encoding failed", th2);
                } catch (IllegalStateException e9) {
                    e = e9;
                    th2 = e;
                    throw new IOException("Video re-encoding failed", th2);
                } catch (Throwable th6) {
                    th = th6;
                    r6 = 0;
                    r12 = createInputSurface;
                }
            } catch (Throwable th7) {
                th = th7;
                r6 = j2;
                r12 = i3;
            }
        } catch (IllegalArgumentException e10) {
            e = e10;
            th2 = e;
            obj2 = null;
            throw new IOException("Video re-encoding failed", th2);
        } catch (IllegalStateException e11) {
            e = e11;
            th2 = e;
            obj2 = null;
            throw new IOException("Video re-encoding failed", th2);
        } catch (Throwable th8) {
            th = th8;
            mediaCodec = null;
            obj = null;
        }
    }
}
