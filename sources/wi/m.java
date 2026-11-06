package wi;

import android.media.AudioRecord;
import android.media.AudioTimestamp;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.TLObject;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final class m implements s {
    public boolean A;
    public volatile long C;
    public boolean D;
    public boolean E;
    public long F;
    public long G;
    public long H;
    public int I;
    public int J;
    public int K;
    public long L;
    public long M;
    public int N;
    public volatile long O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final x a;
    public int a0;
    public final long b;
    public int b0;
    public final int c;
    public boolean c0;
    public final int d;
    public long d0;
    public final int e;
    public final n f;
    public final c g;
    public final c h;
    public MediaCodec n;
    public MediaCodec o;
    public AudioRecord p;
    public Surface q;
    public Thread r;
    public Thread s;
    public d t;
    public d u;
    public volatile boolean v;
    public volatile boolean w;
    public volatile boolean x;
    public boolean y;
    public int z;
    public final AtomicBoolean i = new AtomicBoolean();
    public final ArrayList j = new ArrayList();
    public final AudioTimestamp k = new AudioTimestamp();
    public final long[] l = new long[256];
    public final long[] m = new long[256];
    public volatile long B = Long.MAX_VALUE;

    public m(x xVar, long j3, int i7, int i10, int i11, n nVar, c cVar, c cVar2) {
        this.a = xVar;
        this.b = j3;
        this.c = i7;
        this.d = i10;
        this.e = i11;
        this.f = nVar;
        this.g = cVar;
        this.h = cVar2;
    }

    public static MediaFormat c(int i7, int i10, int i11) {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i7, i7);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", i10);
        createVideoFormat.setInteger("frame-rate", i11);
        createVideoFormat.setInteger("i-frame-interval", 1);
        return createVideoFormat;
    }

    public static int f(MediaFormat mediaFormat) {
        if (!mediaFormat.containsKey("prepend-sps-pps-to-idr-frames") || mediaFormat.getInteger("prepend-sps-pps-to-idr-frames") != 1) {
            return 0;
        }
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
        ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
        return (byteBuffer == null ? 0 : byteBuffer.remaining()) + (byteBuffer2 != null ? byteBuffer2.remaining() : 0);
    }

    public static String k(long j3, long j10) {
        if (j3 == Long.MIN_VALUE) {
            return "n/a";
        }
        return j3 + ".." + j10;
    }

    public final void a() {
        int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
        if (minBufferSize <= 0) {
            throw new IllegalStateException("Unsupported audio recording configuration");
        }
        int max = Math.max(minBufferSize * 4, TLObject.FLAG_14);
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 48000, 1);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", 64000);
        createAudioFormat.setInteger("max-input-size", max);
        this.o = MediaCodec.createEncoderByType("audio/mp4a-latm");
        this.f.b("audio encoder configure: codec=" + this.o.getName() + ", format=" + createAudioFormat + ", minBufferSize=" + minBufferSize + ", audioBufferSize=" + max);
        this.o.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        AudioRecord audioRecord = new AudioRecord(5, 48000, 16, 2, max);
        this.p = audioRecord;
        if (audioRecord.getState() != 1) {
            throw new IllegalStateException("Unable to initialize AudioRecord");
        }
    }

    public final void b() {
        int i7 = this.c;
        int i10 = this.d;
        int i11 = this.e;
        MediaFormat c10 = c(i7, i10, i11);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.n = createEncoderByType;
        MediaCodecInfo.VideoCapabilities videoCapabilities = createEncoderByType.getCodecInfo().getCapabilitiesForType("video/avc").getVideoCapabilities();
        if (!videoCapabilities.isSizeSupported(i7, i7) || !videoCapabilities.areSizeAndRateSupported(i7, i7, i11)) {
            throw new IOException(a8.p0.n(i11, " fps", jg.g.o("Video encoder does not support ", i7, "x", i7, " at ")));
        }
        this.f.b("video encoder configure: codec=" + this.n.getName() + ", format=" + c10);
        this.n.configure(c10, (Surface) null, (MediaCrypto) null, 1);
        this.q = this.n.createInputSurface();
    }

    public final boolean d(MediaCodec.BufferInfo bufferInfo, long j3) {
        ByteBuffer outputBuffer;
        int dequeueOutputBuffer = this.o.dequeueOutputBuffer(bufferInfo, j3);
        boolean z9 = false;
        while (true) {
            boolean z10 = true;
            if (dequeueOutputBuffer < 0) {
                break;
            }
            if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0 && (outputBuffer = this.o.getOutputBuffer(dequeueOutputBuffer)) != null && !this.x) {
                if (bufferInfo.presentationTimeUs >= this.B) {
                    this.Z++;
                    this.a0++;
                } else if (this.c0) {
                    this.J++;
                    this.H += bufferInfo.size;
                    m(false, bufferInfo);
                    v(false, outputBuffer, bufferInfo);
                } else {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    int position = outputBuffer.position();
                    int limit = outputBuffer.limit();
                    try {
                        outputBuffer.position(bufferInfo.offset);
                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        allocateDirect.put(outputBuffer).flip();
                        outputBuffer.limit(limit);
                        outputBuffer.position(position);
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                        this.j.add(new l(allocateDirect, bufferInfo2));
                        long j10 = this.O;
                        if (j10 != Long.MIN_VALUE && bufferInfo.presentationTimeUs >= j10) {
                            e(j10, false);
                        }
                    } catch (Throwable th2) {
                        outputBuffer.limit(limit);
                        outputBuffer.position(position);
                        throw th2;
                    }
                }
            }
            if ((bufferInfo.flags & 4) == 0) {
                z10 = false;
            }
            z9 |= z10;
            this.o.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.o.dequeueOutputBuffer(bufferInfo, 0L);
        }
        if (dequeueOutputBuffer == -2) {
            s(this.o.getOutputFormat(), false);
        }
        if (z9 && !this.c0 && this.O != Long.MIN_VALUE) {
            e(this.O, true);
        }
        return z9;
    }

    public final void e(long j3, boolean z9) {
        ArrayList arrayList = this.j;
        if (arrayList.isEmpty()) {
            return;
        }
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                i7 = -1;
                break;
            } else if (((l) arrayList.get(i7)).b.presentationTimeUs >= j3) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0) {
            if (!z9) {
                return;
            } else {
                i7 = arrayList.size() - 1;
            }
        } else if (i7 > 0 && j3 - ((l) arrayList.get(i7 - 1)).b.presentationTimeUs <= ((l) arrayList.get(i7)).b.presentationTimeUs - j3) {
            i7--;
        }
        for (int i10 = 0; i10 < i7; i10++) {
            this.Z++;
        }
        l lVar = (l) arrayList.get(i7);
        this.d0 = lVar.b.presentationTimeUs - j3;
        while (i7 < arrayList.size()) {
            l lVar2 = (l) arrayList.get(i7);
            ByteBuffer byteBuffer = lVar2.a;
            MediaCodec.BufferInfo bufferInfo = lVar2.b;
            this.J++;
            this.H += bufferInfo.size;
            m(false, bufferInfo);
            v(false, byteBuffer, bufferInfo);
            i7++;
        }
        arrayList.clear();
        this.c0 = true;
        StringBuilder t6 = a8.p0.t(j3, "A/V start aligned: videoPtsUs=", ", audioPtsUs=");
        t6.append(lVar.b.presentationTimeUs);
        t6.append(", deltaUs=");
        t6.append(this.d0);
        this.f.b(t6.toString());
    }

    public final boolean g() {
        return (this.O == Long.MIN_VALUE || this.P == Long.MIN_VALUE || this.Q == Long.MIN_VALUE || this.R == Long.MIN_VALUE) ? false : true;
    }

    public final void h(Thread thread, long j3) {
        if (thread == null) {
            return;
        }
        try {
            thread.join(j3);
            if (thread.isAlive()) {
                this.f.b("encoder thread did not stop: " + thread.getName());
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void i() {
        synchronized (this) {
            if (this.t != null && !this.v) {
                d dVar = this.t;
                this.t = null;
                this.f.b("audio capture ready; waiting for common A/V start frame");
                dVar.run();
            }
        }
    }

    public final void j() {
        boolean z9;
        synchronized (this) {
            try {
                z9 = true;
                int i7 = this.z - 1;
                this.z = i7;
                if (!this.A || i7 != 0) {
                    z9 = false;
                }
                if (z9) {
                    this.A = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z9) {
            this.f.b("deferred codec release: encoder threads exited");
            n();
        }
    }

    public final void l(long j3) {
        int i7;
        long j10 = this.C;
        long max = Math.max(0L, j10 - 256);
        do {
            j10--;
            if (j10 < max) {
                return;
            } else {
                i7 = (int) (j10 % 256);
            }
        } while (this.l[i7] != j3);
        long nanoTime = System.nanoTime() - this.m[i7];
        this.K++;
        this.L += nanoTime;
        this.M = Math.max(this.M, nanoTime);
        if (this.K % 30 == 0) {
            this.f.b("codec latency: average=" + ((this.L / this.K) / 1000000.0f) + " ms, max=" + (this.M / 1000000.0f) + " ms");
        }
    }

    public final void m(boolean z9, MediaCodec.BufferInfo bufferInfo) {
        long j3 = bufferInfo.presentationTimeUs;
        if (!z9) {
            if (this.Q == Long.MIN_VALUE) {
                this.Q = j3;
            }
            long j10 = this.R;
            if (j10 != Long.MIN_VALUE && j3 < j10) {
                this.W++;
            }
            this.R = Math.max(j10, j3);
            return;
        }
        if (this.O == Long.MIN_VALUE) {
            this.O = j3;
        }
        long j11 = this.P;
        if (j11 != Long.MIN_VALUE && j3 < j11) {
            this.V++;
        }
        this.P = Math.max(j11, j3);
        if ((bufferInfo.flags & 1) != 0) {
            this.U++;
            long j12 = this.S;
            if (j12 != Long.MIN_VALUE) {
                this.T = Math.max(this.T, j3 - j12);
            }
            this.S = j3;
        }
    }

    public final void n() {
        this.D = false;
        this.E = false;
        this.t = null;
        this.u = null;
        AudioRecord audioRecord = this.p;
        if (audioRecord != null) {
            audioRecord.release();
            this.p = null;
        }
        Surface surface = this.q;
        if (surface != null) {
            surface.release();
            this.q = null;
        }
        MediaCodec mediaCodec = this.n;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (IllegalStateException unused) {
            }
            mediaCodec.release();
        }
        MediaCodec mediaCodec2 = this.o;
        if (mediaCodec2 != null) {
            try {
                mediaCodec2.stop();
            } catch (IllegalStateException unused2) {
            }
            mediaCodec2.release();
        }
        this.o = null;
        this.n = null;
        this.s = null;
        this.r = null;
    }

    public final void o(RuntimeException runtimeException) {
        String str;
        StringBuilder sb2 = new StringBuilder("codec error");
        if (runtimeException instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) runtimeException;
            str = ": diagnostic=" + codecException.getDiagnosticInfo() + ", recoverable=" + codecException.isRecoverable() + ", transient=" + codecException.isTransient();
        } else {
            str = "";
        }
        sb2.append(str);
        this.f.a(sb2.toString(), runtimeException);
        if (this.i.compareAndSet(false, true)) {
            this.g.a(runtimeException);
        }
    }

    public final long p() {
        synchronized (this) {
            try {
                if (this.D && this.E) {
                    if (this.v) {
                        return this.B;
                    }
                    this.v = true;
                    long max = Math.max(0L, (SystemClock.elapsedRealtimeNanos() - this.F) / 1000);
                    this.B = max;
                    AudioRecord audioRecord = this.p;
                    if (audioRecord != null) {
                        try {
                            if (audioRecord.getRecordingState() == 3) {
                                audioRecord.stop();
                            }
                        } catch (IllegalStateException e10) {
                            this.f.a("AudioRecord stop failed", e10);
                        }
                    }
                    this.f.b("recording stop boundary: presentationTimeUs=" + max);
                    return max;
                }
                return Long.MAX_VALUE;
            } finally {
            }
        }
    }

    public final void q() {
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = 0;
        this.A = false;
        this.B = Long.MAX_VALUE;
        this.F = 0L;
        this.H = 0L;
        this.G = 0L;
        this.J = 0;
        this.I = 0;
        this.C = 0L;
        this.K = 0;
        this.M = 0L;
        this.L = 0L;
        this.P = Long.MIN_VALUE;
        this.O = Long.MIN_VALUE;
        this.R = Long.MIN_VALUE;
        this.Q = Long.MIN_VALUE;
        this.S = Long.MIN_VALUE;
        this.T = 0L;
        this.U = 0;
        this.W = 0;
        this.V = 0;
        this.Y = 0;
        this.X = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = false;
        this.d0 = Long.MIN_VALUE;
        this.t = null;
        this.u = null;
        this.j.clear();
    }

    public final long r(int i7) {
        long max = Math.max(0L, ((SystemClock.elapsedRealtimeNanos() - this.F) / 1000) - ((i7 * 1000000) / 48000));
        int i10 = Build.VERSION.SDK_INT;
        n nVar = this.f;
        if (i10 >= 24) {
            AudioRecord audioRecord = this.p;
            AudioTimestamp audioTimestamp = this.k;
            if (audioRecord.getTimestamp(audioTimestamp, 1) == 0) {
                long max2 = Math.max(0L, ((audioTimestamp.nanoTime - this.F) / 1000) - ((audioTimestamp.framePosition * 1000000) / 48000));
                nVar.b("audio timestamp alignment: framePosition=" + audioTimestamp.framePosition + ", timestampDeltaUs=" + ((audioTimestamp.nanoTime - this.F) / 1000) + ", timestampBaseUs=" + max2 + ", readCompletionBaseUs=" + max);
                return max2;
            }
        }
        nVar.b("audio timestamp unavailable: readCompletionBaseUs=" + max);
        return max;
    }

    public final void s(MediaFormat mediaFormat, boolean z9) {
        if (z9) {
            try {
                this.N = f(mediaFormat);
                x xVar = this.a;
                int i7 = this.e;
                synchronized (xVar) {
                    xVar.s = i7;
                }
            } catch (u e10) {
                if (this.x) {
                    return;
                }
                this.x = true;
                this.f.a("recording segment rejected; earlier segments are kept", e10);
                this.h.a(e10);
                return;
            } catch (IOException e11) {
                throw new IllegalStateException(e11);
            }
        }
        n nVar = this.f;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z9 ? MediaStreamTrack.VIDEO_TRACK_KIND : MediaStreamTrack.AUDIO_TRACK_KIND);
        sb2.append(" output format: ");
        sb2.append(mediaFormat);
        nVar.b(sb2.toString());
        this.a.n(mediaFormat, z9);
    }

    public final synchronized void t(d dVar, d dVar2) {
        if (this.E) {
            return;
        }
        if (!this.D) {
            throw new IllegalStateException("Recorder is not prepared");
        }
        try {
            this.o.start();
            this.p.startRecording();
            if (this.p.getRecordingState() != 3) {
                throw new IllegalStateException("Unable to start AudioRecord");
            }
            this.F = SystemClock.elapsedRealtimeNanos();
            this.t = dVar;
            this.u = dVar2;
            this.E = true;
            this.f.b("audio and video recording started: timeOriginNs=" + this.F + ", timelineOffsetUs=" + this.b + ", audioSessionId=" + this.p.getAudioSessionId());
            final int i7 = 0;
            this.r = new Thread(new Runnable(this) { // from class: wi.k
                public final /* synthetic */ m b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    long j3;
                    long j10;
                    int i10 = i7;
                    m mVar = this.b;
                    mVar.getClass();
                    switch (i10) {
                        case 0:
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            boolean z9 = false;
                            while (!z9) {
                                try {
                                    try {
                                    } catch (RuntimeException e10) {
                                        if (mVar.v) {
                                            mVar.f.a("video drain failed while stopping", e10);
                                        } else {
                                            mVar.o(e10);
                                        }
                                    }
                                    if (mVar.w) {
                                        mVar.j();
                                        return;
                                    }
                                    int dequeueOutputBuffer = mVar.n.dequeueOutputBuffer(bufferInfo, 10000L);
                                    if (dequeueOutputBuffer == -2) {
                                        mVar.s(mVar.n.getOutputFormat(), true);
                                    } else if (dequeueOutputBuffer >= 0) {
                                        if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                            if (bufferInfo.presentationTimeUs < mVar.B) {
                                                mVar.I++;
                                                mVar.G += bufferInfo.size;
                                                mVar.m(true, bufferInfo);
                                                mVar.l(bufferInfo.presentationTimeUs);
                                                mVar.v(true, mVar.n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                            } else {
                                                mVar.b0++;
                                            }
                                        }
                                        z9 = (bufferInfo.flags & 4) != 0;
                                        mVar.n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    }
                                } catch (Throwable th2) {
                                    mVar.j();
                                    throw th2;
                                }
                            }
                            mVar.j();
                            return;
                        default:
                            Process.setThreadPriority(-16);
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            long j11 = Long.MIN_VALUE;
                            boolean z10 = false;
                            long j12 = Long.MIN_VALUE;
                            boolean z11 = false;
                            long j13 = 0;
                            while (!z10) {
                                try {
                                    try {
                                        if (!mVar.w) {
                                            z10 = mVar.d(bufferInfo2, z11 ? 10000L : 0L);
                                            if (!z10) {
                                                int dequeueInputBuffer = mVar.o.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (mVar.v) {
                                                        mVar.o.queueInputBuffer(dequeueInputBuffer, 0, 0, j12 == j11 ? 0L : j12 + ((1000000 * j13) / 48000), 4);
                                                        z11 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = mVar.o.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            mVar.o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j3 = j11;
                                                            int read = mVar.p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = mVar.X + 1;
                                                                    mVar.X = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    mVar.Y++;
                                                                }
                                                                mVar.o.queueInputBuffer(dequeueInputBuffer, 0, 0, j12 == j3 ? 0L : j12 + ((1000000 * j13) / 48000), 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j12 == j3) {
                                                                    long r10 = mVar.r(i12);
                                                                    n nVar = mVar.f;
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("first audio input: basePtsUs=");
                                                                    sb2.append(r10);
                                                                    sb2.append(", frames=");
                                                                    sb2.append(i12);
                                                                    sb2.append(", timestampSource=");
                                                                    j10 = 48000;
                                                                    sb2.append(Build.VERSION.SDK_INT >= 24 ? "AudioTimestamp" : "read completion");
                                                                    nVar.b(sb2.toString());
                                                                    j12 = r10;
                                                                } else {
                                                                    j10 = 48000;
                                                                }
                                                                mVar.o.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j12 + ((1000000 * j13) / j10), 0);
                                                                j13 += i12;
                                                                mVar.i();
                                                            }
                                                            j11 = j3;
                                                        }
                                                    }
                                                }
                                                j3 = j11;
                                                j11 = j3;
                                            }
                                        }
                                    } catch (RuntimeException e11) {
                                        if (mVar.v) {
                                            mVar.f.a("audio capture failed while stopping", e11);
                                        } else {
                                            mVar.o(e11);
                                        }
                                    }
                                    mVar.j();
                                    return;
                                } catch (Throwable th3) {
                                    mVar.j();
                                    throw th3;
                                }
                            }
                            mVar.j();
                            return;
                    }
                }
            }, "RoundVideoVideoEncoder");
            final int i10 = 1;
            this.s = new Thread(new Runnable(this) { // from class: wi.k
                public final /* synthetic */ m b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    long j3;
                    long j10;
                    int i102 = i10;
                    m mVar = this.b;
                    mVar.getClass();
                    switch (i102) {
                        case 0:
                            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                            boolean z9 = false;
                            while (!z9) {
                                try {
                                    try {
                                    } catch (RuntimeException e10) {
                                        if (mVar.v) {
                                            mVar.f.a("video drain failed while stopping", e10);
                                        } else {
                                            mVar.o(e10);
                                        }
                                    }
                                    if (mVar.w) {
                                        mVar.j();
                                        return;
                                    }
                                    int dequeueOutputBuffer = mVar.n.dequeueOutputBuffer(bufferInfo, 10000L);
                                    if (dequeueOutputBuffer == -2) {
                                        mVar.s(mVar.n.getOutputFormat(), true);
                                    } else if (dequeueOutputBuffer >= 0) {
                                        if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                                            if (bufferInfo.presentationTimeUs < mVar.B) {
                                                mVar.I++;
                                                mVar.G += bufferInfo.size;
                                                mVar.m(true, bufferInfo);
                                                mVar.l(bufferInfo.presentationTimeUs);
                                                mVar.v(true, mVar.n.getOutputBuffer(dequeueOutputBuffer), bufferInfo);
                                            } else {
                                                mVar.b0++;
                                            }
                                        }
                                        z9 = (bufferInfo.flags & 4) != 0;
                                        mVar.n.releaseOutputBuffer(dequeueOutputBuffer, false);
                                    }
                                } catch (Throwable th2) {
                                    mVar.j();
                                    throw th2;
                                }
                            }
                            mVar.j();
                            return;
                        default:
                            Process.setThreadPriority(-16);
                            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                            long j11 = Long.MIN_VALUE;
                            boolean z10 = false;
                            long j12 = Long.MIN_VALUE;
                            boolean z11 = false;
                            long j13 = 0;
                            while (!z10) {
                                try {
                                    try {
                                        if (!mVar.w) {
                                            z10 = mVar.d(bufferInfo2, z11 ? 10000L : 0L);
                                            if (!z10) {
                                                int dequeueInputBuffer = mVar.o.dequeueInputBuffer(10000L);
                                                if (dequeueInputBuffer >= 0) {
                                                    if (mVar.v) {
                                                        mVar.o.queueInputBuffer(dequeueInputBuffer, 0, 0, j12 == j11 ? 0L : j12 + ((1000000 * j13) / 48000), 4);
                                                        z11 = true;
                                                    } else {
                                                        ByteBuffer inputBuffer = mVar.o.getInputBuffer(dequeueInputBuffer);
                                                        if (inputBuffer == null) {
                                                            mVar.o.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                                                        } else {
                                                            inputBuffer.clear();
                                                            j3 = j11;
                                                            int read = mVar.p.read(inputBuffer, Math.min(inputBuffer.remaining(), 2048));
                                                            if (read <= 0) {
                                                                if (read < 0) {
                                                                    int i11 = mVar.X + 1;
                                                                    mVar.X = i11;
                                                                    if (read == -6 || i11 >= 3) {
                                                                        throw new IllegalStateException("AudioRecord read failed: " + read);
                                                                    }
                                                                } else {
                                                                    mVar.Y++;
                                                                }
                                                                mVar.o.queueInputBuffer(dequeueInputBuffer, 0, 0, j12 == j3 ? 0L : j12 + ((1000000 * j13) / 48000), 0);
                                                            } else {
                                                                int i12 = read / 2;
                                                                if (j12 == j3) {
                                                                    long r10 = mVar.r(i12);
                                                                    n nVar = mVar.f;
                                                                    StringBuilder sb2 = new StringBuilder();
                                                                    sb2.append("first audio input: basePtsUs=");
                                                                    sb2.append(r10);
                                                                    sb2.append(", frames=");
                                                                    sb2.append(i12);
                                                                    sb2.append(", timestampSource=");
                                                                    j10 = 48000;
                                                                    sb2.append(Build.VERSION.SDK_INT >= 24 ? "AudioTimestamp" : "read completion");
                                                                    nVar.b(sb2.toString());
                                                                    j12 = r10;
                                                                } else {
                                                                    j10 = 48000;
                                                                }
                                                                mVar.o.queueInputBuffer(dequeueInputBuffer, 0, i12 * 2, j12 + ((1000000 * j13) / j10), 0);
                                                                j13 += i12;
                                                                mVar.i();
                                                            }
                                                            j11 = j3;
                                                        }
                                                    }
                                                }
                                                j3 = j11;
                                                j11 = j3;
                                            }
                                        }
                                    } catch (RuntimeException e11) {
                                        if (mVar.v) {
                                            mVar.f.a("audio capture failed while stopping", e11);
                                        } else {
                                            mVar.o(e11);
                                        }
                                    }
                                    mVar.j();
                                    return;
                                } catch (Throwable th3) {
                                    mVar.j();
                                    throw th3;
                                }
                            }
                            mVar.j();
                            return;
                    }
                }
            }, "RoundVideoAudioEncoder");
            this.z = 2;
            this.r.start();
            this.s.start();
        } catch (RuntimeException e10) {
            n();
            throw e10;
        }
    }

    public final void u() {
        p();
        synchronized (this) {
            try {
                if (this.D && !this.y) {
                    if (!this.E) {
                        n();
                        return;
                    }
                    this.y = true;
                    try {
                        this.n.signalEndOfInputStream();
                    } catch (IllegalStateException e10) {
                        this.f.a("video encoder EOS failed", e10);
                    }
                    h(this.r, 5000L);
                    h(this.s, 5000L);
                    long j3 = g() ? this.Q - this.O : Long.MIN_VALUE;
                    long j10 = g() ? this.R - this.P : Long.MIN_VALUE;
                    long j11 = this.O;
                    long j12 = this.P;
                    long j13 = (j11 == Long.MIN_VALUE || j12 <= j11) ? 0L : j12 - j11;
                    long j14 = this.Q;
                    long j15 = this.R;
                    long j16 = (j14 == Long.MIN_VALUE || j15 <= j14) ? 0L : j15 - j14;
                    n nVar = this.f;
                    StringBuilder sb2 = new StringBuilder("codec summary: videoBuffers=");
                    sb2.append(this.I);
                    sb2.append(", videoBytes=");
                    sb2.append(this.G);
                    sb2.append(", videoPts=");
                    long j17 = j13;
                    sb2.append(k(this.O, this.P));
                    sb2.append(", actualVideoBitrate=");
                    sb2.append(j17 <= 0 ? "n/a" : String.valueOf((this.G * 8000000) / j17));
                    sb2.append(", keyframes=");
                    sb2.append(this.U);
                    sb2.append(", maxKeyframeIntervalUs=");
                    sb2.append(this.T);
                    sb2.append(", nonMonotonicVideoPts=");
                    sb2.append(this.V);
                    sb2.append(", audioBuffers=");
                    sb2.append(this.J);
                    sb2.append(", audioBytes=");
                    sb2.append(this.H);
                    sb2.append(", audioPts=");
                    sb2.append(k(this.Q, this.R));
                    sb2.append(", actualAudioBitrate=");
                    sb2.append(j16 <= 0 ? "n/a" : String.valueOf((this.H * 8000000) / j16));
                    sb2.append(", nonMonotonicAudioPts=");
                    sb2.append(this.W);
                    sb2.append(", avStartDeltaUs=");
                    sb2.append(j3 == Long.MIN_VALUE ? "n/a" : String.valueOf(j3));
                    sb2.append(", avEndDeltaUs=");
                    sb2.append(j10 == Long.MIN_VALUE ? "n/a" : String.valueOf(j10));
                    sb2.append(", audioReadErrors=");
                    sb2.append(this.X);
                    sb2.append(", emptyAudioReads=");
                    sb2.append(this.Y);
                    sb2.append(", droppedAudioBuffers=");
                    sb2.append(this.Z);
                    sb2.append(", droppedAudioAfterStop=");
                    sb2.append(this.a0);
                    sb2.append(", droppedVideoAfterStop=");
                    sb2.append(this.b0);
                    sb2.append(", stopPresentationTimeUs=");
                    sb2.append(this.B == Long.MAX_VALUE ? "n/a" : Long.valueOf(this.B));
                    sb2.append(", alignedAudioStartDeltaUs=");
                    long j18 = this.d0;
                    sb2.append(j18 == Long.MIN_VALUE ? "n/a" : String.valueOf(j18));
                    sb2.append(", codecLatencyAvgMs=");
                    int i7 = this.K;
                    sb2.append(i7 != 0 ? Float.valueOf((this.L / i7) / 1000000.0f) : "n/a");
                    sb2.append(", codecLatencyMaxMs=");
                    sb2.append(this.M / 1000000.0f);
                    nVar.b(sb2.toString());
                    synchronized (this) {
                        try {
                            if (this.z > 0) {
                                this.w = true;
                            }
                        } finally {
                        }
                    }
                    if (this.w) {
                        h(this.r, 1000L);
                        h(this.s, 1000L);
                    }
                    synchronized (this) {
                        try {
                            if (this.z <= 0) {
                                n();
                                return;
                            }
                            this.A = true;
                            this.f.b("codec release deferred until encoder threads exit: running=" + this.z);
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final void v(boolean z9, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        int i7;
        if (byteBuffer == null || this.x) {
            return;
        }
        if (z9) {
            try {
                int i10 = this.N;
                if (i10 > 0 && (bufferInfo.flags & 1) != 0 && (i7 = bufferInfo.size) > i10) {
                    bufferInfo.offset += i10;
                    bufferInfo.size = i7 - i10;
                }
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
        this.a.q(z9, byteBuffer, bufferInfo, this.b);
    }
}
