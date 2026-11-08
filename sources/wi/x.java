package wi;

import android.media.MediaCodec;
import android.media.MediaFormat;
import bi.h4;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.video.MP4Builder;
import org.telegram.messenger.video.Mp4Movie;
import org.telegram.ui.Cells.f1;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class x {
    public final File a;
    public final int b;
    public final boolean c;
    public final o d;
    public final org.telegram.ui.web.a0 e;
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
    public final w g = new w(33333);
    public final w h = new w(21333);
    public int l = -1;
    public int m = -1;
    public long q = Long.MIN_VALUE;
    public final MediaCodec.BufferInfo u = new MediaCodec.BufferInfo();

    public x(File file, int i7, boolean z9, o oVar, org.telegram.ui.web.a0 a0Var) {
        this.a = file;
        this.b = i7;
        this.c = z9;
        this.d = oVar;
        this.e = a0Var;
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
        int i7;
        int i10;
        p(byteBuffer, bufferInfo);
        int i11 = bufferInfo.offset;
        int i12 = bufferInfo.size + i11;
        int f10 = f(byteBuffer, i11, i12);
        if (f10 == bufferInfo.offset) {
            i7 = o(byteBuffer, f10, i12);
            i10 = 0;
            while (f10 >= 0) {
                i10++;
                f10 = f(byteBuffer, o(byteBuffer, f10, i12) + f10, i12);
            }
        } else {
            i7 = 0;
            i10 = 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(d(byteBuffer, bufferInfo));
        sb2.append(", format=");
        sb2.append(i10 > 0 ? "annex-b" : "avcc");
        sb2.append(", nalCount=");
        sb2.append(i10);
        sb2.append(", firstPrefix=");
        sb2.append(i7);
        sb2.append(", head=");
        int i13 = bufferInfo.offset;
        StringBuilder sb3 = new StringBuilder();
        int min = Math.min(16, i12 - i13);
        for (int i14 = 0; i14 < min; i14++) {
            if (i14 > 0) {
                sb3.append(' ');
            }
            int i15 = byteBuffer.get(i13 + i14) & 255;
            if (i15 < 16) {
                sb3.append('0');
            }
            sb3.append(Integer.toHexString(i15));
        }
        sb2.append(sb3.toString());
        return sb2.toString();
    }

    public static int f(ByteBuffer byteBuffer, int i7, int i10) {
        int i11;
        while (true) {
            int i12 = i7 + 2;
            if (i12 >= i10) {
                return -1;
            }
            if (byteBuffer.get(i7) != 0 || byteBuffer.get(i7 + 1) != 0 || (byteBuffer.get(i12) != 1 && ((i11 = i7 + 3) >= i10 || byteBuffer.get(i12) != 0 || byteBuffer.get(i11) != 1))) {
                i7++;
            }
        }
        return i7;
    }

    public static boolean m(MediaFormat mediaFormat, MediaFormat mediaFormat2, String... strArr) {
        if (mediaFormat != null) {
            for (String str : strArr) {
                ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                ByteBuffer byteBuffer2 = mediaFormat2.getByteBuffer(str);
                if (byteBuffer != null && byteBuffer2 != null) {
                    int a10 = a(byteBuffer);
                    int a11 = a(byteBuffer2);
                    int limit = byteBuffer.limit() - a10;
                    if (limit == byteBuffer2.limit() - a11) {
                        for (int i7 = 0; i7 < limit; i7++) {
                            if (byteBuffer.get(a10 + i7) == byteBuffer2.get(a11 + i7)) {
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

    public static int o(ByteBuffer byteBuffer, int i7, int i10) {
        return (i7 + 3 >= i10 || byteBuffer.get(i7 + 2) != 0) ? 3 : 4;
    }

    public static void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i7 = bufferInfo.offset;
        int i10 = bufferInfo.size;
        long j3 = i7 + i10;
        if (i7 < 0 || i10 < 0 || j3 > byteBuffer.limit()) {
            throw new IOException("Invalid codec buffer range: offset=" + bufferInfo.offset + ", size=" + bufferInfo.size + ", position=" + byteBuffer.position() + ", limit=" + byteBuffer.limit() + ", capacity=" + byteBuffer.capacity());
        }
    }

    public final MediaCodec.BufferInfo b(boolean z9, MediaCodec.BufferInfo bufferInfo, long j3) {
        long max;
        w wVar = this.h;
        w wVar2 = this.g;
        w wVar3 = z9 ? wVar2 : wVar;
        if (j3 < 0) {
            max = Math.max(0L, j3 + bufferInfo.presentationTimeUs);
        } else {
            if (this.q != j3) {
                this.q = j3;
                this.r = Math.max(j3, Math.max(wVar2.a(), wVar.a()));
                wVar2.a = Long.MIN_VALUE;
                wVar2.b = Long.MIN_VALUE;
                wVar.a = Long.MIN_VALUE;
                wVar.b = Long.MIN_VALUE;
            }
            if (wVar3.a == Long.MIN_VALUE) {
                wVar3.a = bufferInfo.presentationTimeUs;
            }
            max = this.r + Math.max(0L, bufferInfo.presentationTimeUs - wVar3.a);
        }
        long j10 = bufferInfo.presentationTimeUs;
        long j11 = wVar3.b;
        if (j11 != Long.MIN_VALUE) {
            long j12 = j10 - j11;
            if (j12 > 0 && j12 < 1000000) {
                wVar3.d = j12;
            }
        }
        wVar3.b = j10;
        wVar3.c = Math.max(wVar3.c, max);
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
        } catch (Exception e10) {
            throw new IOException("Unable to create preview MP4", e10);
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
        } catch (Exception e10) {
            throw new IOException("Unable to finish MP4", e10);
        }
    }

    public final synchronized long h() {
        long a10;
        try {
            a10 = this.g.a();
            if (this.c) {
                a10 = Math.max(a10, this.h.a());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a10 / 1000;
    }

    public final synchronized int i() {
        return this.s;
    }

    public final void j() {
        ArrayList arrayList = this.f;
        if (this.j != null) {
            boolean z9 = this.c;
            if (z9 && this.k == null) {
                return;
            }
            Mp4Movie mp4Movie = new Mp4Movie();
            File file = this.a;
            mp4Movie.setCacheFile(file);
            int i7 = this.b;
            mp4Movie.setSize(i7, i7);
            try {
                MP4Builder createMovie = new MP4Builder().createMovie(mp4Movie, true, false);
                this.i = createMovie;
                this.l = createMovie.addTrack(this.j, false);
                if (z9) {
                    this.m = this.i.addTrack(this.k, true);
                }
                this.d.b("MP4 initialized: file=" + file.getName() + ", output=" + i7 + "x" + i7 + ", includeAudio=" + z9 + ", pendingSamples=" + arrayList.size());
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    v vVar = (v) arrayList.get(i10);
                    r(vVar.a, vVar.b, vVar.c);
                }
                arrayList.clear();
            } catch (Exception e10) {
                throw new IOException("Unable to initialize MP4", e10);
            }
        }
    }

    public final void k(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int position;
        int limit;
        p(byteBuffer, bufferInfo);
        int i7 = bufferInfo.offset;
        int i10 = bufferInfo.size + i7;
        int f10 = f(byteBuffer, i7, i10);
        if (f10 != bufferInfo.offset) {
            int i11 = bufferInfo.size;
            ByteBuffer byteBuffer2 = this.t;
            if (byteBuffer2 == null || byteBuffer2.capacity() < i11) {
                this.t = ByteBuffer.allocateDirect(i11);
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
        int i12 = 0;
        int i13 = f10;
        int i14 = 0;
        while (i13 >= 0) {
            int o4 = o(byteBuffer, i13, i10) + i13;
            i13 = f(byteBuffer, o4, i10);
            int i15 = i13 < 0 ? i10 : i13;
            if (i15 > o4) {
                i12++;
                i14 = ((i15 + 4) - o4) + i14;
            }
        }
        if (i12 == 0) {
            throw new IOException("Annex-B video sample contains no NAL units");
        }
        ByteBuffer byteBuffer3 = this.t;
        if (byteBuffer3 == null || byteBuffer3.capacity() < i14) {
            this.t = ByteBuffer.allocateDirect(i14);
        }
        this.t.clear();
        position = byteBuffer.position();
        limit = byteBuffer.limit();
        while (f10 >= 0) {
            try {
                int o10 = f10 + o(byteBuffer, f10, i10);
                int f11 = f(byteBuffer, o10, i10);
                int i16 = f11 < 0 ? i10 : f11;
                if (i16 > o10) {
                    this.t.putInt(i16 - o10);
                    byteBuffer.position(o10);
                    byteBuffer.limit(i16);
                    this.t.put(byteBuffer);
                }
                f10 = f11;
            } finally {
            }
        }
        byteBuffer.limit(limit);
        byteBuffer.position(position);
        this.t.flip();
        this.u.set(0, this.t.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
    }

    public final void l(long j3) {
        if (j3 <= this.n) {
            return;
        }
        this.n = j3;
        if (this.w) {
            return;
        }
        org.telegram.ui.web.a0 a0Var = this.e;
        t0 t0Var = (t0) a0Var.b;
        p0 p0Var = (p0) a0Var.c;
        synchronized (t0Var.g) {
            try {
                long j10 = p0Var.c;
                long j11 = j3 - j10;
                if (j11 > 0 && !p0Var.d) {
                    p0Var.c = j3;
                    t0Var.k.execute(new h4(t0Var, p0Var, j10, j11, 8));
                }
            } finally {
            }
        }
    }

    public final synchronized void n(MediaFormat mediaFormat, boolean z9) {
        try {
            if (this.x) {
                return;
            }
            if (this.i == null) {
                if (z9) {
                    this.j = mediaFormat;
                } else if (this.c) {
                    this.k = mediaFormat;
                }
                j();
                return;
            }
            MediaFormat mediaFormat2 = z9 ? this.j : this.k;
            if ((!z9 || m(mediaFormat2, mediaFormat, "csd-0", "csd-1")) && (z9 || !this.c || m(mediaFormat2, mediaFormat, "csd-0"))) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z9 ? "Video" : "Audio");
            sb2.append(" codec configuration changed between segments");
            throw new u(sb2.toString());
        } finally {
        }
    }

    public final synchronized void q(boolean z9, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, long j3) {
        try {
            if (!this.x) {
                if (!z9) {
                    if (this.c) {
                    }
                }
                if (bufferInfo.size > 0) {
                    MediaCodec.BufferInfo b10 = b(z9, bufferInfo, j3);
                    if (this.i != null) {
                        r(z9, byteBuffer, b10);
                        return;
                    }
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    allocateDirect.put(byteBuffer).flip();
                    b10.offset = 0;
                    this.f.add(new v(z9, allocateDirect, b10));
                }
            }
        } finally {
        }
    }

    public final void r(boolean z9, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer byteBuffer2;
        MediaCodec.BufferInfo bufferInfo2;
        String d;
        o oVar = this.d;
        if (z9) {
            try {
                r2 = this.v ? null : e(byteBuffer, bufferInfo);
                k(byteBuffer, bufferInfo);
                byteBuffer2 = this.t;
                bufferInfo2 = this.u;
                if (!this.v) {
                    this.v = true;
                    oVar.b("first video sample prepared: " + r2 + ", outputSize=" + bufferInfo2.size);
                }
            } catch (Exception e10) {
                if (!z9) {
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
                oVar.a(f1.n(z9 ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND, ", ", r2, sb2), e10);
                StringBuilder sb3 = new StringBuilder("Unable to write ");
                if (z9) {
                    str = MediaStreamTrack.VIDEO_TRACK_KIND;
                }
                throw new IOException(f1.n(str, " MP4 sample: ", r2, sb3), e10);
            }
        } else {
            byteBuffer2 = byteBuffer;
            bufferInfo2 = bufferInfo;
        }
        long writeSampleData = this.i.writeSampleData(z9 ? this.l : this.m, byteBuffer2, bufferInfo2, false);
        if (z9) {
            this.o++;
        } else {
            this.p++;
        }
        if (writeSampleData > 0) {
            l(writeSampleData);
        }
    }
}
