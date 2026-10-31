package w7;

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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class r {
    public static int a(MediaExtractor mediaExtractor) {
        for (int i10 = 0; i10 < mediaExtractor.getTrackCount(); i10++) {
            String string = mediaExtractor.getTrackFormat(i10).getString("mime");
            if (string != null && string.startsWith("video/")) {
                return i10;
            }
        }
        return -1;
    }

    public static int b(MediaExtractor mediaExtractor, MediaCodec mediaCodec, MediaCodec mediaCodec2, li.z0 z0Var, long j10, long j11, li.a1 a1Var) {
        long j12;
        boolean z10;
        long j13;
        long j14;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int dequeueOutputBuffer;
        int dequeueInputBuffer;
        MediaCodec mediaCodec3 = mediaCodec;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        int i12 = 0;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z13 = false;
        int i13 = 0;
        boolean z14 = false;
        boolean z15 = false;
        int i14 = 0;
        while (!z13) {
            if (z14 || (dequeueInputBuffer = mediaCodec3.dequeueInputBuffer(10000L)) < 0) {
                j12 = elapsedRealtime;
                z10 = z13;
                j13 = 10000;
                j14 = 0;
                z11 = false;
            } else {
                long sampleTime = mediaExtractor.getSampleTime();
                int i15 = (mediaExtractor.getSampleFlags() & 1) != 0 ? 1 : i12;
                if (sampleTime < 0 || (sampleTime >= j11 && i15 != 0)) {
                    j12 = elapsedRealtime;
                    z10 = z13;
                    j14 = 0;
                    j13 = 10000;
                    mediaCodec3 = mediaCodec;
                    mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                } else {
                    ByteBuffer inputBuffer = mediaCodec3.getInputBuffer(dequeueInputBuffer);
                    int readSampleData = inputBuffer == null ? -1 : mediaExtractor.readSampleData(inputBuffer, i12);
                    if (readSampleData < 0) {
                        j12 = elapsedRealtime;
                        z10 = z13;
                        j14 = 0;
                        j13 = 10000;
                        mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        mediaCodec3 = mediaCodec;
                    } else {
                        j12 = elapsedRealtime;
                        z10 = z13;
                        j14 = 0;
                        j13 = 10000;
                        mediaCodec3 = mediaCodec;
                        mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, sampleTime, 0);
                        mediaExtractor.advance();
                        z11 = true;
                    }
                }
                z14 = true;
                z11 = true;
            }
            if (z15 || (dequeueOutputBuffer = mediaCodec3.dequeueOutputBuffer(bufferInfo, j13)) < 0) {
                z12 = true;
            } else {
                long j15 = bufferInfo.presentationTimeUs;
                boolean z16 = bufferInfo.size > 0 && j15 >= j10 && j15 < j11;
                mediaCodec3.releaseOutputBuffer(dequeueOutputBuffer, z16);
                if (z16) {
                    synchronized (z0Var.b) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() + 2500;
                        while (!z0Var.m) {
                            long elapsedRealtime3 = elapsedRealtime2 - SystemClock.elapsedRealtime();
                            if (elapsedRealtime3 <= j14) {
                                throw new IOException("Decoded frame did not arrive");
                            }
                            try {
                                z0Var.b.wait(elapsedRealtime3);
                                j14 = 0;
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                                throw new IOException("Video re-encoding was interrupted", e);
                            }
                        }
                        z0Var.m = false;
                    }
                    z0Var.k.updateTexImage();
                    z0Var.k.getTransformMatrix(z0Var.c);
                    int i16 = z0Var.a;
                    GLES20.glViewport(0, 0, i16, i16);
                    GLES20.glUseProgram(z0Var.i);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, z0Var.j);
                    int glGetAttribLocation = GLES20.glGetAttribLocation(z0Var.i, "aPosition");
                    int glGetAttribLocation2 = GLES20.glGetAttribLocation(z0Var.i, "aTextureCoord");
                    FloatBuffer floatBuffer = z0Var.d;
                    floatBuffer.position(0);
                    GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 16, (Buffer) z0Var.d);
                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                    floatBuffer.position(2);
                    GLES20.glVertexAttribPointer(glGetAttribLocation2, 2, 5126, false, 16, (Buffer) z0Var.d);
                    GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                    z12 = true;
                    GLES20.glUniformMatrix4fv(GLES20.glGetUniformLocation(z0Var.i, "uTextureMatrix"), 1, false, z0Var.c, 0);
                    GLES20.glDrawArrays(5, 0, 4);
                    EGLExt.eglPresentationTimeANDROID(z0Var.f, z0Var.h, j15 * 1000);
                    if (!EGL14.eglSwapBuffers(z0Var.f, z0Var.h)) {
                        throw new IllegalStateException("eglSwapBuffers failed: 0x" + Integer.toHexString(EGL14.eglGetError()));
                    }
                } else {
                    z12 = true;
                }
                if ((bufferInfo.flags & 4) != 0) {
                    mediaCodec2.signalEndOfInputStream();
                    z15 = z12;
                }
                z11 = z12;
            }
            int dequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, z15 ? 10000L : 0L);
            int i17 = i14;
            z13 = z10;
            while (true) {
                if (dequeueOutputBuffer2 == -1) {
                    i10 = 0;
                    break;
                }
                if (dequeueOutputBuffer2 == -2) {
                    MediaFormat outputFormat = mediaCodec2.getOutputFormat();
                    i17 = li.o.f(outputFormat);
                    a1Var.s(outputFormat);
                } else if (dequeueOutputBuffer2 >= 0) {
                    ByteBuffer outputBuffer = mediaCodec2.getOutputBuffer(dequeueOutputBuffer2);
                    int i18 = bufferInfo2.flags;
                    boolean z17 = (i18 & 2) != 0 ? z12 : false;
                    if (outputBuffer != null && (i11 = bufferInfo2.size) > 0 && !z17) {
                        if (i17 > 0 && (i18 & 1) != 0 && i11 > i17) {
                            bufferInfo2.offset += i17;
                            bufferInfo2.size = i11 - i17;
                        }
                        a1Var.p(outputBuffer, bufferInfo2);
                        i13++;
                    }
                    boolean z18 = (bufferInfo2.flags & 4) != 0 ? z12 : false;
                    i10 = 0;
                    mediaCodec2.releaseOutputBuffer(dequeueOutputBuffer2, false);
                    z13 = z18;
                    if (z18) {
                        break;
                    }
                    dequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, 0L);
                    z11 = z12;
                }
                dequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo2, 0L);
                z11 = z12;
            }
            long elapsedRealtime4 = SystemClock.elapsedRealtime();
            if (z11) {
                elapsedRealtime = elapsedRealtime4;
            } else {
                if (elapsedRealtime4 - j12 > 5000) {
                    throw new IOException("Video re-encoding stalled");
                }
                elapsedRealtime = j12;
            }
            i14 = i17;
            i12 = i10;
        }
        return i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5, types: [li.z0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(File file, long j10, long j11, long j12, int i10, int i11, int i12, li.a1 a1Var) {
        Throwable th2;
        MediaCodec mediaCodec;
        Object obj;
        Throwable th3;
        Object obj2;
        ?? r12;
        ?? r62;
        Surface createInputSurface;
        MediaCodec createDecoderByType;
        MediaCodec mediaCodec2;
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaCodec mediaCodec3 = null;
        try {
            try {
                mediaExtractor.setDataSource(file.getAbsolutePath());
                int a2 = a(mediaExtractor);
                if (a2 < 0) {
                    throw new IOException("Source file has no video track");
                }
                mediaExtractor.selectTrack(a2);
                mediaExtractor.seekTo(j10, 0);
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(a2);
                mediaCodec = MediaCodec.createEncoderByType("video/avc");
                try {
                    mediaCodec.configure(li.o.c(i10, i11, i12), (Surface) null, (MediaCrypto) null, 1);
                    createInputSurface = mediaCodec.createInputSurface();
                } catch (IllegalArgumentException e) {
                    e = e;
                    th3 = e;
                    obj2 = null;
                    throw new IOException("Video re-encoding failed", th3);
                } catch (IllegalStateException e7) {
                    e = e7;
                    th3 = e;
                    obj2 = null;
                    throw new IOException("Video re-encoding failed", th3);
                } catch (Throwable th4) {
                    th2 = th4;
                    obj = null;
                    r12 = obj;
                    r62 = obj;
                    if (mediaCodec3 != null) {
                    }
                    if (r62 != 0) {
                    }
                    if (mediaCodec != null) {
                    }
                    if (r12 != 0) {
                    }
                    mediaExtractor.release();
                    throw th2;
                }
                try {
                    mediaCodec.start();
                    li.z0 z0Var = new li.z0(createInputSurface, i10);
                    try {
                        createDecoderByType = MediaCodec.createDecoderByType(trackFormat.getString("mime"));
                    } catch (IllegalArgumentException | IllegalStateException e10) {
                        th3 = e10;
                    }
                    try {
                        createDecoderByType.configure(trackFormat, z0Var.l, (MediaCrypto) null, 0);
                        createDecoderByType.start();
                        mediaCodec2 = createDecoderByType;
                        try {
                            b(mediaExtractor, mediaCodec2, mediaCodec, z0Var, j11, j12, a1Var);
                            try {
                                mediaCodec2.stop();
                            } catch (IllegalStateException unused) {
                            }
                            mediaCodec2.release();
                            z0Var.d();
                            try {
                                mediaCodec.stop();
                            } catch (IllegalStateException unused2) {
                            }
                            mediaCodec.release();
                            if (createInputSurface != null) {
                                createInputSurface.release();
                            }
                            mediaExtractor.release();
                        } catch (IllegalArgumentException e11) {
                            e = e11;
                            th3 = e;
                            throw new IOException("Video re-encoding failed", th3);
                        } catch (IllegalStateException e12) {
                            e = e12;
                            th3 = e;
                            throw new IOException("Video re-encoding failed", th3);
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            mediaCodec3 = mediaCodec2;
                            r62 = z0Var;
                            r12 = createInputSurface;
                            if (mediaCodec3 != null) {
                                try {
                                    mediaCodec3.stop();
                                } catch (IllegalStateException unused3) {
                                }
                                mediaCodec3.release();
                            }
                            if (r62 != 0) {
                                r62.d();
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
                            throw th2;
                        }
                    } catch (IllegalArgumentException e13) {
                        e = e13;
                        mediaCodec2 = createDecoderByType;
                        th3 = e;
                        throw new IOException("Video re-encoding failed", th3);
                    } catch (IllegalStateException e14) {
                        e = e14;
                        mediaCodec2 = createDecoderByType;
                        th3 = e;
                        throw new IOException("Video re-encoding failed", th3);
                    } catch (Throwable th6) {
                        th = th6;
                        mediaCodec2 = createDecoderByType;
                    }
                } catch (IllegalArgumentException e15) {
                    e = e15;
                    th3 = e;
                    throw new IOException("Video re-encoding failed", th3);
                } catch (IllegalStateException e16) {
                    e = e16;
                    th3 = e;
                    throw new IOException("Video re-encoding failed", th3);
                } catch (Throwable th7) {
                    th2 = th7;
                    r62 = 0;
                    r12 = createInputSurface;
                }
            } catch (Throwable th8) {
                th2 = th8;
                r62 = j11;
                r12 = i12;
            }
        } catch (IllegalArgumentException e17) {
            e = e17;
            th3 = e;
            obj2 = null;
            throw new IOException("Video re-encoding failed", th3);
        } catch (IllegalStateException e18) {
            e = e18;
            th3 = e;
            obj2 = null;
            throw new IOException("Video re-encoding failed", th3);
        } catch (Throwable th9) {
            th2 = th9;
            mediaCodec = null;
            obj = null;
        }
    }
}
