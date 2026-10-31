package w7;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class q {
    public static k2.v0 a(File file, li.z zVar, long j10, long j11, boolean z10, a3.l lVar) {
        long j12;
        long j13;
        String str;
        li.z zVar2 = zVar;
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
            int i10 = lVar.c;
            synchronized (zVar) {
                zVar2.s = i10;
            }
            if (trackFormat2 != null) {
                zVar2.n(trackFormat2, false);
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
                    zVar2.n(trackFormat, true);
                    b(file, zVar2, max, max, max2);
                    str = "copy";
                    j13 = 0;
                } else {
                    long min = Math.min(j16, max2);
                    li.k kVar = new li.k(1);
                    j13 = 0;
                    r.c(file, j15, max, min, lVar.a, lVar.b, lVar.c, kVar);
                    if (((MediaFormat) kVar.d) == null || ((ArrayList) kVar.b).isEmpty()) {
                        throw new IOException("Re-encoded trim start produced no frames");
                    }
                    boolean m10 = li.z.m(trackFormat, (MediaFormat) kVar.d, "csd-0", "csd-1");
                    if (min >= max2) {
                        zVar2.n(m10 ? trackFormat : (MediaFormat) kVar.d, true);
                        e(zVar2, kVar, max);
                        str = "reencode-range-in-gop";
                        max = max;
                    } else if (m10) {
                        zVar2.n(trackFormat, true);
                        e(zVar2, kVar, max);
                        b(file, zVar2, j16, max, max2);
                        max = max;
                        str = "reencode-head";
                    } else {
                        max = max;
                        r.c(file, j15, max, max2, lVar.a, lVar.b, lVar.c, new c3.g0(zVar2, max, 5));
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
                                zVar2.q(false, byteBuffer, bufferInfo, -max);
                                mediaExtractor.advance();
                                allocateDirect = byteBuffer;
                                zVar2 = zVar;
                            }
                        }
                    } finally {
                    }
                }
                long h = zVar.h();
                k2.v0 v0Var = new k2.v0();
                v0Var.a = max / 1000;
                v0Var.b = h;
                v0Var.c = str;
                return v0Var;
            } finally {
            }
        } finally {
        }
    }

    public static void b(File file, li.z zVar, long j10, long j11, long j12) {
        ByteBuffer byteBuffer;
        MediaCodec.BufferInfo bufferInfo;
        li.z zVar2;
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
                        zVar2 = zVar;
                        zVar2.q(true, byteBuffer, bufferInfo, -j11);
                    } else {
                        byteBuffer = allocateDirect;
                        bufferInfo = bufferInfo2;
                        zVar2 = zVar;
                    }
                    mediaExtractor.advance();
                    zVar = zVar2;
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
        for (int i10 = 0; i10 < mediaExtractor.getTrackCount(); i10++) {
            String string = mediaExtractor.getTrackFormat(i10).getString("mime");
            if (string != null && string.startsWith(str)) {
                return i10;
            }
        }
        return -1;
    }

    public static void e(li.z zVar, li.k kVar, long j10) {
        ArrayList arrayList = (ArrayList) kVar.b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            zVar.q(true, (ByteBuffer) arrayList.get(i10), (MediaCodec.BufferInfo) ((ArrayList) kVar.c).get(i10), -j10);
        }
    }
}
