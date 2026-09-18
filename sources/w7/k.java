package w7;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public abstract class k {
    public static a3.z a(File file, ki.o oVar, long j3, long j10, boolean z10) {
        long e = e(file);
        long max = Math.max(0L, j3 * 1000);
        long min = Math.min(e, Math.max(max, j10 * 1000));
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, true);
            long j11 = -1;
            if (d >= 0) {
                mediaExtractor.selectTrack(d);
                mediaExtractor.seekTo(max, 1);
                long sampleTime = mediaExtractor.getSampleTime();
                if (sampleTime >= 0 && sampleTime < min) {
                    j11 = sampleTime;
                }
            }
            if (j11 < 0 || j11 >= min) {
                throw new IOException("Trim range has no video sync sample");
            }
            mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(file.getAbsolutePath());
                int d10 = d(mediaExtractor, true);
                int d11 = d(mediaExtractor, false);
                if (d10 < 0 || (z10 && d11 < 0)) {
                    throw new IOException("Source file has no required tracks");
                }
                oVar.f(mediaExtractor.getTrackFormat(d10), true);
                if (z10) {
                    oVar.f(mediaExtractor.getTrackFormat(d11), false);
                }
                mediaExtractor.release();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(TLObject.FLAG_21);
                long j12 = j11;
                b(file, oVar, true, j12, min, allocateDirect);
                if (z10) {
                    b(file, oVar, false, j12, min, allocateDirect);
                }
                return new a3.z(j12 / 1000, (min - j12) / 1000);
            } finally {
            }
        } finally {
        }
    }

    public static void b(File file, ki.o oVar, boolean z10, long j3, long j10, ByteBuffer byteBuffer) {
        boolean z11 = z10;
        MediaExtractor mediaExtractor = new MediaExtractor();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            int d = d(mediaExtractor, z11);
            if (d < 0) {
                throw new IOException("Source track disappeared");
            }
            mediaExtractor.selectTrack(d);
            mediaExtractor.seekTo(j3, z11 ? 1 : 2);
            while (mediaExtractor.getSampleTime() >= 0 && mediaExtractor.getSampleTime() < j3) {
                mediaExtractor.advance();
            }
            while (mediaExtractor.getSampleTime() >= 0 && mediaExtractor.getSampleTime() < j10) {
                byteBuffer.clear();
                int readSampleData = mediaExtractor.readSampleData(byteBuffer, 0);
                if (readSampleData >= 0) {
                    bufferInfo.set(0, readSampleData, mediaExtractor.getSampleTime(), mediaExtractor.getSampleFlags());
                    oVar.g(z11, byteBuffer, bufferInfo, -j3);
                    mediaExtractor.advance();
                    z11 = z10;
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

    public static long e(File file) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            mediaExtractor.setDataSource(file.getAbsolutePath());
            long j3 = 0;
            for (int i10 = 0; i10 < mediaExtractor.getTrackCount(); i10++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i10);
                if (trackFormat.containsKey("durationUs")) {
                    j3 = Math.max(j3, trackFormat.getLong("durationUs"));
                }
            }
            return j3;
        } finally {
            mediaExtractor.release();
        }
    }
}
