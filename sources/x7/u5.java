package x7;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import b8.ig;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class u5 {
    public static m2.r0 a(File file, wi.w wVar, long j10, long j11, boolean z10, a7.d dVar) {
        long j12;
        long j13;
        String str;
        wi.w wVar2 = wVar;
        long max = Math.max(0L, j10 * 1000);
        long max2 = Math.max(max, j11 * 1000);
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            int d10 = d(mediaExtractor, false);
            if (d < 0 || (z10 && d10 < 0)) {
                throw new IOException("Source file has no required tracks");
            }
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(d);
            MediaFormat trackFormat2 = z10 ? mediaExtractor.getTrackFormat(d10) : null;
            mediaExtractor.release();
            int i3 = dVar.c;
            synchronized (wVar) {
                wVar2.s = i3;
            }
            if (trackFormat2 != null) {
                wVar2.n(trackFormat2, false);
            }
            mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(file.getAbsolutePath());
                int d11 = d(mediaExtractor, true);
                long j14 = Long.MAX_VALUE;
                if (d11 >= 0) {
                    mediaExtractor.selectTrack(d11);
                    j12 = Long.MIN_VALUE;
                    while (true) {
                        if (mediaExtractor.getSampleTime() < 0) {
                            break;
                        }
                        long sampleTime = mediaExtractor.getSampleTime();
                        boolean z11 = (mediaExtractor.getSampleFlags() & 1) != 0;
                        if (sampleTime >= max2) {
                            break;
                        }
                        if (z11) {
                            if (sampleTime > max) {
                                j14 = sampleTime;
                                break;
                            }
                            j12 = sampleTime;
                        }
                        mediaExtractor.advance();
                    }
                } else {
                    j12 = Long.MIN_VALUE;
                }
                mediaExtractor.release();
                long[] jArr = {j12, j14};
                long j15 = jArr[0];
                long j16 = jArr[1];
                if (j15 == Long.MIN_VALUE) {
                    throw new IOException("Trim range has no video sync sample");
                }
                if (j15 == max) {
                    wVar2.n(trackFormat, true);
                    b(file, wVar2, max, max, max2);
                    str = "copy";
                    j13 = 0;
                } else {
                    long min = Math.min(j16, max2);
                    p7.d dVar2 = new p7.d(19);
                    j13 = 0;
                    v5.c(file, j15, max, min, dVar.a, dVar.b, dVar.c, dVar2);
                    if (((MediaFormat) dVar2.c) == null || ((ArrayList) dVar2.b).isEmpty()) {
                        throw new IOException("Re-encoded trim start produced no frames");
                    }
                    boolean m10 = wi.w.m(trackFormat, (MediaFormat) dVar2.c, "csd-0", "csd-1");
                    if (min >= max2) {
                        wVar2.n(m10 ? trackFormat : (MediaFormat) dVar2.c, true);
                        e(wVar2, dVar2, max);
                        str = "reencode-range-in-gop";
                        max = max;
                    } else if (m10) {
                        wVar2.n(trackFormat, true);
                        e(wVar2, dVar2, max);
                        b(file, wVar2, j16, max, max2);
                        max = max;
                        str = "reencode-head";
                    } else {
                        max = max;
                        v5.c(file, j15, max, max2, dVar.a, dVar.b, dVar.c, new ig(wVar2, max, 9));
                        str = "reencode-all";
                    }
                }
                if (z10) {
                    mediaExtractor = new MediaExtractor();
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_21);
                    try {
                        mediaExtractor.setDataSource(file.getAbsolutePath());
                        int d12 = d(mediaExtractor, false);
                        if (d12 < 0) {
                            throw new IOException("Source track disappeared");
                        }
                        mediaExtractor.selectTrack(d12);
                        mediaExtractor.seekTo(max, 2);
                        while (mediaExtractor.getSampleTime() >= j13 && mediaExtractor.getSampleTime() < max) {
                            mediaExtractor.advance();
                        }
                        while (mediaExtractor.getSampleTime() >= j13 && mediaExtractor.getSampleTime() < max2) {
                            allocateDirect.clear();
                            int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                            if (readSampleData >= 0) {
                                bufferInfo.set(0, readSampleData, mediaExtractor.getSampleTime(), mediaExtractor.getSampleFlags());
                                ByteBuffer byteBuffer = allocateDirect;
                                wVar2.q(false, byteBuffer, bufferInfo, -max);
                                mediaExtractor.advance();
                                allocateDirect = byteBuffer;
                                wVar2 = wVar;
                            }
                        }
                    } finally {
                    }
                }
                long h = wVar.h();
                m2.r0 r0Var = new m2.r0();
                r0Var.a = max / 1000;
                r0Var.b = h;
                r0Var.c = str;
                return r0Var;
            } finally {
            }
        } finally {
        }
    }

    public static void b(File file, wi.w wVar, long j10, long j11, long j12) {
        ByteBuffer byteBuffer;
        MediaCodec.BufferInfo bufferInfo;
        wi.w wVar2;
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_21);
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            if (d < 0) {
                throw new IOException("Source track disappeared");
            }
            mediaExtractor.selectTrack(d);
            mediaExtractor.seekTo(j10, 0);
            while (mediaExtractor.getSampleTime() >= 0) {
                long sampleTime = mediaExtractor.getSampleTime();
                if (sampleTime < j12) {
                    if (sampleTime >= j10) {
                        allocateDirect.clear();
                        int readSampleData = mediaExtractor.readSampleData(allocateDirect, 0);
                        if (readSampleData < 0) {
                            break;
                        }
                        bufferInfo2.set(0, readSampleData, sampleTime, mediaExtractor.getSampleFlags());
                        byteBuffer = allocateDirect;
                        bufferInfo = bufferInfo2;
                        wVar2 = wVar;
                        wVar2.q(true, byteBuffer, bufferInfo, -j11);
                    } else {
                        byteBuffer = allocateDirect;
                        bufferInfo = bufferInfo2;
                        wVar2 = wVar;
                    }
                    mediaExtractor.advance();
                    wVar = wVar2;
                    allocateDirect = byteBuffer;
                    bufferInfo2 = bufferInfo;
                }
            }
        } finally {
            mediaExtractor.release();
        }
    }

    public static void c(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.setLength(0L);
                randomAccessFile.close();
            } finally {
            }
        } catch (IOException unused) {
        }
        if (file.exists()) {
            file.delete();
        }
    }

    public static int d(MediaExtractor mediaExtractor, boolean z10) {
        String str = z10 ? "video/" : "audio/";
        for (int i3 = 0; i3 < mediaExtractor.getTrackCount(); i3++) {
            String string = mediaExtractor.getTrackFormat(i3).getString("mime");
            if (string != null && string.startsWith(str)) {
                return i3;
            }
        }
        return -1;
    }

    public static void e(wi.w wVar, p7.d dVar, long j10) {
        ArrayList arrayList = (ArrayList) dVar.b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            wVar.q(true, (ByteBuffer) arrayList.get(i3), (MediaCodec.BufferInfo) ((ArrayList) dVar.d).get(i3), -j10);
        }
    }
}
