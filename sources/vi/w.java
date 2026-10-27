package vi;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.ui.bh1;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class w {
    public final File a;
    public final int b;
    public final boolean c;
    public final n d;
    public final bh1 e;
    public MP4Builder i;
    public MediaFormat j;
    public MediaFormat k;
    public long n;
    public long o;
    public long p;
    public long r;
    public int s;
    public ByteBuffer t;
    public boolean v;
    public boolean w;
    public boolean x;
    public final ArrayList f = new ArrayList();
    public final v g = new v(33333);
    public final v h = new v(21333);
    public int l = -1;
    public int m = -1;
    public long q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo u = new MediaCodec.BufferInfo();

    public w(File file, int i10, boolean z10, n nVar, bh1 bh1Var) {
        this.a = file;
        this.b = i10;
        this.c = z10;
        this.d = nVar;
        this.e = bh1Var;
    }

    public static int a(ByteBuffer byteBuffer) {
        if (byteBuffer.limit() >= 4 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 0 && byteBuffer.get(3) == 1) {
            return 4;
        }
        return (byteBuffer.limit() >= 3 && byteBuffer.get(0) == 0 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 1) ? 3 : 0;
    }

    public static String d(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        return "offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", ptsUs=" + bufferInfo.presentationTimeUs + ", flags=" + bufferInfo.flags + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity();
    }

    public static String e(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10;
        int i11;
        p(byteBuffer, bufferInfo);
        int i12 = bufferInfo.offset;
        int i13 = bufferInfo.size + i12;
        int f7 = f(byteBuffer, i12, i13);
        if (f7 == bufferInfo.offset) {
            i10 = o(byteBuffer, f7, i13);
            i11 = 0;
            while (f7 >= 0) {
                i11++;
                f7 = f(byteBuffer, o(byteBuffer, f7, i13) + f7, i13);
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(byteBuffer, bufferInfo));
        sb2.append(", format=");
        sb2.append(i11 > 0 ? "annex-b" : "avcc");
        sb2.append(", nalCount=");
        sb2.append(i11);
        sb2.append(", firstPrefix=");
        sb2.append(i10);
        sb2.append(", head=");
        int i14 = bufferInfo.offset;
        StringBuilder sb3 = new StringBuilder();
        int min = Math.min(16, i13 - i14);
        for (int i15 = 0; i15 < min; i15++) {
            if (i15 > 0) {
                sb3.append(' ');
            }
            int i16 = byteBuffer.get(i14 + i15) & 255;
            if (i16 < 16) {
                sb3.append('0');
            }
            sb3.append(Integer.toHexString(i16));
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public static int f(ByteBuffer byteBuffer, int i10, int i11) {
        int i12;
        while (true) {
            int i13 = i10 + 2;
            if (i13 >= i11) {
                return -1;
            }
            if (byteBuffer.get(i10) != 0 || byteBuffer.get(i10 + 1) != 0 || (byteBuffer.get(i13) != 1 && ((i12 = i10 + 3) >= i11 || byteBuffer.get(i13) != 0 || byteBuffer.get(i12) != 1))) {
                i10++;
            }
        }
        return i10;
    }

    public static boolean m(MediaFormat mediaFormat, MediaFormat mediaFormat2, String... strArr) {
        if (mediaFormat != null) {
            for (String str : strArr) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer(str);
                if (byteBuffer != null && byteBuffer2 != null) {
                    int a2 = a(byteBuffer);
                    int a10 = a(byteBuffer2);
                    int limit = byteBuffer.limit() - a2;
                    if (limit == byteBuffer2.limit() - a10) {
                        for (int i10 = 0; i10 < limit; i10++) {
                            if (byteBuffer.get(a2 + i10) == byteBuffer2.get(a10 + i10)) {
                            }
                        }
                    }
                } else if (byteBuffer == byteBuffer2) {
                }
            }
            return true;
        }
        return false;
    }

    public static int o(ByteBuffer byteBuffer, int i10, int i11) {
        return (i10 + 3 >= i11 || byteBuffer.get(i10 + 2) != 0) ? 3 : 4;
    }

    public static void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i10 = bufferInfo.offset;
        int i11 = bufferInfo.size;
        long j10 = i10 + i11;
        if (i10 < 0 || i11 < 0 || j10 > byteBuffer.limit()) {
            throw new IOException("Invalid codec buffer range: offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity());
        }
    }

    public final MediaCodec.BufferInfo b(boolean z10, MediaCodec.BufferInfo bufferInfo, long j10) {
        long max;
        v vVar = this.h;
        v vVar2 = this.g;
        v vVar3 = z10 ? vVar2 : vVar;
        if (j10 < 0) {
            max = Math.max(0L, j10 + bufferInfo.presentationTimeUs);
        } else {
            if (this.q != j10) {
                this.q = j10;
                this.r = Math.max(j10, Math.max(vVar2.a(), vVar.a()));
                vVar2.a = Long.MIN_VALUE;
                vVar2.b = Long.MIN_VALUE;
                vVar.a = Long.MIN_VALUE;
                vVar.b = Long.MIN_VALUE;
            }
            if (vVar3.a == Long.MIN_VALUE) {
                vVar3.a = bufferInfo.presentationTimeUs;
            }
            max = this.r + Math.max(0L, bufferInfo.presentationTimeUs - vVar3.a);
        }
        long j11 = bufferInfo.presentationTimeUs;
        long j12 = vVar3.b;
        if (j12 != Long.MIN_VALUE) {
            long j13 = j11 - j12;
            if (j13 > 0 && j13 < 1000000) {
                vVar3.d = j13;
            }
        }
        vVar3.b = j11;
        vVar3.c = Math.max(vVar3.c, max);
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, max, bufferInfo.flags);
        return bufferInfo2;
    }

    public final synchronized void c(File file) {
        if (this.i == null) {
            throw new IOException("MP4 tracks are not initialized");
        }
        long nanoTime = System.nanoTime();
        try {
            this.i.finishMovie(file);
            this.d.b("MP4 preview written: file=" + file.getName() + ", size=" + file.length() + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
        } catch (Exception e) {
            throw new IOException("Unable to create preview MP4", e);
        }
    }

    public final synchronized void g() {
        if (this.x) {
            return;
        }
        if (this.i == null) {
            throw new IOException("MP4 tracks are not initialized");
        }
        long nanoTime = System.nanoTime();
        try {
            this.i.finishMovie();
            this.x = true;
            l(this.a.length());
            this.d.b("MP4 finalized: file=" + this.a.getName() + ", size=" + this.a.length() + ", videoSamples=" + this.o + ", audioSamples=" + this.p + ", elapsedMs=" + ((System.nanoTime() - nanoTime) / 1000000));
        } catch (Exception e) {
            throw new IOException("Unable to finish MP4", e);
        }
    }

    public final synchronized long h() {
        long a2;
        try {
            a2 = this.g.a();
            if (this.c) {
                a2 = Math.max(a2, this.h.a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a2 / 1000;
    }

    public final synchronized int i() {
        return this.s;
    }

    public final void j() {
        ArrayList arrayList = this.f;
        if (this.j != null) {
            boolean z10 = this.c;
            if (z10 && this.k == null) {
                return;
            }
            Mp4Movie mp4Movie = new Mp4Movie();
            File file = this.a;
            mp4Movie.setCacheFile(file);
            int i10 = this.b;
            mp4Movie.setSize(i10, i10);
            try {
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                this.i = createMovie;
                this.l = createMovie.addTrack(this.j, false);
                if (z10) {
                    this.m = this.i.addTrack(this.k, true);
                }
                this.d.b("MP4 initialized: file=" + file.getName() + ", output=" + i10 + "x" + i10 + ", includeAudio=" + z10 + ", pendingSamples=" + arrayList.size());
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    u uVar = (u) arrayList.get(i11);
                    r(uVar.a, uVar.b, uVar.c);
                }
                arrayList.clear();
            } catch (Exception e) {
                throw new IOException("Unable to initialize MP4", e);
            }
        }
    }

    public final void k(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int position;
        int limit;
        p(byteBuffer, bufferInfo);
        int i10 = bufferInfo.offset;
        int i11 = bufferInfo.size + i10;
        int f7 = f(byteBuffer, i10, i11);
        if (f7 != bufferInfo.offset) {
            int i12 = bufferInfo.size;
            ByteBuffer byteBuffer2 = this.t;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i12) {
                this.t = ByteBuffer.allocateDirect(i12);
            }
            this.t.clear();
            position = byteBuffer.position();
            limit = byteBuffer.limit();
            try {
                byteBuffer.position(bufferInfo.offset);
                byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                this.t.put(byteBuffer);
                byteBuffer.limit(limit);
                byteBuffer.position(position);
                this.t.flip();
                this.u.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                return;
            } finally {
            }
        }
        int i13 = 0;
        int i14 = f7;
        int i15 = 0;
        while (i14 >= 0) {
            int o10 = o(byteBuffer, i14, i11) + i14;
            i14 = f(byteBuffer, o10, i11);
            int i16 = i14 < 0 ? i11 : i14;
            if (i16 > o10) {
                i13++;
                i15 = ((i16 + 4) - o10) + i15;
            }
        }
        if (i13 == 0) {
            throw new IOException("Annex-B video sample contains no NAL units");
        }
        ByteBuffer byteBuffer3 = this.t;
        if (byteBuffer3 == null || byteBuffer3.capacity() < i15) {
            this.t = ByteBuffer.allocateDirect(i15);
        }
        this.t.clear();
        position = byteBuffer.position();
        limit = byteBuffer.limit();
        while (f7 >= 0) {
            try {
                int o11 = f7 + o(byteBuffer, f7, i11);
                int f10 = f(byteBuffer, o11, i11);
                int i17 = f10 < 0 ? i11 : f10;
                if (i17 > o11) {
                    this.t.putInt(i17 - o11);
                    byteBuffer.position(o11);
                    byteBuffer.limit(i17);
                    this.t.put(byteBuffer);
                }
                f7 = f10;
            } finally {
            }
        }
        byteBuffer.limit(limit);
        byteBuffer.position(position);
        this.t.flip();
        this.u.set(0, this.t.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    public final void l(long j10) {
        if (j10 <= this.n) {
            return;
        }
        this.n = j10;
        if (this.w) {
            return;
        }
        bh1 bh1Var = this.e;
        u0 u0Var = (u0) bh1Var.b;
        q0 q0Var = (q0) bh1Var.c;
        synchronized (u0Var.g) {
            try {
                long j11 = q0Var.c;
                long j12 = j10 - j11;
                if (j12 > 0 && !q0Var.d) {
                    q0Var.c = j10;
                    u0Var.k.execute(new a3.h0(u0Var, q0Var, j11, j12, 16));
                }
            } finally {
            }
        }
    }

    public final synchronized void n(MediaFormat mediaFormat, boolean z10) {
        try {
            if (this.x) {
                return;
            }
            if (this.i == null) {
                if (z10) {
                    this.j = mediaFormat;
                } else if (this.c) {
                    this.k = mediaFormat;
                }
                j();
                return;
            }
            MediaFormat mediaFormat2 = z10 ? this.j : this.k;
            if ((!z10 || m(mediaFormat2, mediaFormat, "csd-0", "csd-1")) && (z10 || !this.c || m(mediaFormat2, mediaFormat, "csd-0"))) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z10 ? "Video" : "Audio");
            sb2.append(" codec configuration changed between segments");
            throw new t(sb2.toString());
        } finally {
        }
    }

    public final synchronized void q(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j10) {
        try {
            if (!this.x) {
                if (!z10) {
                    if (this.c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo b10 = b(z10, bufferInfo, j10);
                    if (this.i != null) {
                        r(z10, byteBuffer, b10);
                        return;
                    }
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    allocateDirect.put(byteBuffer).flip();
                    b10.offset = 0;
                    this.f.add(new u(z10, allocateDirect, b10));
                }
            }
        } finally {
        }
    }

    public final void r(boolean z10, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        MediaCodec.BufferInfo bufferInfo2;
        String d;
        n nVar = this.d;
        if (z10) {
            try {
                r2 = this.v ? null : e(byteBuffer, bufferInfo);
                k(byteBuffer, bufferInfo);
                byteBuffer2 = this.t;
                bufferInfo2 = this.u;
                if (!this.v) {
                    this.v = true;
                    nVar.b("first video sample prepared: " + r2 + ", outputSize=" + bufferInfo2.size);
                }
            } catch (Exception e) {
                if (!z10) {
                    r2 = d(byteBuffer, bufferInfo);
                } else if (r2 == null) {
                    try {
                        d = e(byteBuffer, bufferInfo);
                    } catch (Exception unused) {
                        d = d(byteBuffer, bufferInfo);
                    }
                    r2 = d;
                }
                StringBuilder sb2 = new StringBuilder("MP4 sample write failed: track=");
                String str = MediaStreamTrack.AUDIO_TRACK_KIND;
                nVar.a(a1.g.q(z10 ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND, ", ", r2, sb2), e);
                StringBuilder sb3 = new StringBuilder("Unable to write ");
                if (z10) {
                    str = MediaStreamTrack.VIDEO_TRACK_KIND;
                }
                throw new IOException(a1.g.q(str, " MP4 sample: ", r2, sb3), e);
            }
        } else {
            byteBuffer2 = byteBuffer;
            bufferInfo2 = bufferInfo;
        }
        long writeSampleData = this.i.writeSampleData(z10 ? this.l : this.m, byteBuffer2, bufferInfo2, false);
        if (z10) {
            this.o++;
        } else {
            this.p++;
        }
        if (writeSampleData > 0) {
            l(writeSampleData);
        }
    }
}
