// default package

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class v5b {
    public static in3 A;
    public static final long[] y = {30000, 90000};
    public static String z;
    public final String b;
    public final t5b c;
    public final Runnable e;
    public in3 f;
    public int g;
    public boolean h;
    public long l;
    public long m;
    public r5b n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public q5b t;
    public ed1 u;
    public float v;
    public rm1 w;
    public j2b x;
    public final Set a = DesugarCollections.synchronizedSet(new HashSet());
    public int d = -1;
    public final TreeMap i = new TreeMap();
    public final HashMap j = new HashMap();
    public long k = Long.MAX_VALUE;
    public final ArrayList s = new ArrayList();

    public v5b(t5b t5bVar, long j, long j2, Runnable runnable) {
        this.c = t5bVar;
        this.e = runnable;
        this.l = j;
        this.m = j2;
        String str = t5bVar.f() + "|" + j;
        this.b = str;
        if (str.equals(z)) {
            this.f = A;
        } else {
            new Thread(new n40((Object) this, j, j2, (Object) t5bVar, (byte) 16), "StoryCaptions").start();
        }
    }

    public static int a(long j) {
        return (int) (Math.max(0L, j) / 30000);
    }

    public static long d(int[] iArr, int i) {
        return iArr[((i + 1) << 2) + 2] - iArr[(i << 2) + 3];
    }

    public static int g(int i, int i2, float[] fArr) {
        int max = Math.max(0, i);
        int min = Math.min(fArr.length, i2);
        int max2 = Math.max(0, Math.min(fArr.length, (max + min) / 2));
        double d = Double.MAX_VALUE;
        while (true) {
            int i3 = max + 1600;
            if (i3 > min) {
                return max2;
            }
            double d2 = 0.0d;
            for (int i4 = max; i4 < i3; i4++) {
                float f = fArr[i4];
                d2 += f * f;
            }
            if (d2 < d) {
                max2 = max + 800;
                d = d2;
            }
            max += 800;
        }
    }

    public static float k(float[] fArr, float[] fArr2, int i, int i2) {
        return (fArr[i2 + 1] - fArr[i]) - fArr2[i];
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0274 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013b A[Catch: all -> 0x0260, TryCatch #0 {all -> 0x0260, blocks: (B:70:0x0134, B:72:0x013b, B:74:0x0145, B:75:0x0149, B:77:0x014f, B:82:0x0157, B:85:0x015f, B:87:0x0163, B:91:0x0172, B:92:0x0179, B:95:0x01c3, B:97:0x01c6, B:101:0x01d9, B:105:0x01f4, B:107:0x0205, B:109:0x020c, B:111:0x021f, B:113:0x022c, B:164:0x0248), top: B:69:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float[] b(t5b t5bVar, long j, long j2, long[] jArr) {
        MediaExtractor mediaExtractor;
        Closeable closeable;
        long j3;
        MediaFormat mediaFormat;
        MediaCodec mediaCodec;
        int integer;
        MediaCodec mediaCodec2;
        MediaCodec mediaCodec3;
        MediaCodec mediaCodec4;
        int dequeueOutputBuffer;
        String str;
        long j4;
        String str2;
        String str3 = "channel-count";
        String str4 = "sample-rate";
        Set set = this.a;
        long j5 = 1000;
        long max = Math.max(0L, j) * 1000;
        long j6 = j + 600000;
        if (j2 > j) {
            j6 = Math.min(j2, j6);
        }
        long j7 = j6 * 1000;
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        MediaCodec mediaCodec5 = null;
        try {
            closeable = t5bVar.n(mediaExtractor2);
            if (closeable != null) {
                try {
                    set.add(closeable);
                } catch (Throwable th) {
                    th = th;
                    mediaExtractor = mediaExtractor2;
                    if (mediaCodec5 != null) {
                    }
                    mediaExtractor.release();
                    if (closeable == null) {
                    }
                }
            }
            try {
                if (this.h && closeable != null) {
                    ((u5b) closeable).close();
                }
                int i = 0;
                while (true) {
                    if (i >= mediaExtractor2.getTrackCount()) {
                        j3 = j5;
                        mediaFormat = null;
                        break;
                    }
                    mediaFormat = mediaExtractor2.getTrackFormat(i);
                    j3 = j5;
                    String string = mediaFormat.getString("mime");
                    if (string != null && string.startsWith("audio/")) {
                        mediaExtractor2.selectTrack(i);
                        break;
                    }
                    i++;
                    j5 = j3;
                }
                if (mediaFormat == null) {
                    mediaExtractor2.release();
                    if (closeable != null) {
                        set.remove(closeable);
                        try {
                            ((u5b) closeable).close();
                        } catch (Throwable unused) {
                        }
                    }
                    return null;
                }
                if (max > 0) {
                    mediaExtractor2.seekTo(max, 0);
                }
                MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
                try {
                    createDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                    createDecoderByType.start();
                    if (mediaFormat.containsKey("sample-rate")) {
                        try {
                            integer = mediaFormat.getInteger("sample-rate");
                        } catch (Throwable th2) {
                            th = th2;
                            mediaExtractor = mediaExtractor2;
                            mediaCodec5 = createDecoderByType;
                            if (mediaCodec5 != null) {
                            }
                            mediaExtractor.release();
                            if (closeable == null) {
                            }
                        }
                    } else {
                        integer = 48000;
                    }
                    int integer2 = mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : 1;
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    float[] fArr = new float[480000];
                    boolean z2 = false;
                    int i2 = 0;
                    boolean z3 = false;
                    long j8 = -1;
                    double d = 0.0d;
                    while (!z2) {
                        long j9 = j7;
                        try {
                            if (!z3) {
                                try {
                                    int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(5000L);
                                    if (dequeueInputBuffer >= 0) {
                                        int readSampleData = mediaExtractor2.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                                        try {
                                            if (readSampleData >= 0) {
                                                try {
                                                    if (mediaExtractor2.getSampleTime() <= j9) {
                                                        mediaCodec3 = createDecoderByType;
                                                        try {
                                                            mediaCodec3.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor2.getSampleTime(), 0);
                                                            mediaExtractor2.advance();
                                                            mediaCodec = mediaCodec3;
                                                            mediaExtractor = mediaExtractor2;
                                                            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 5000L);
                                                            if (dequeueOutputBuffer == -2) {
                                                                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                                                                if (outputFormat.containsKey(str4)) {
                                                                    integer = outputFormat.getInteger(str4);
                                                                }
                                                                if (outputFormat.containsKey(str3)) {
                                                                    integer2 = outputFormat.getInteger(str3);
                                                                }
                                                            } else if (dequeueOutputBuffer >= 0) {
                                                                if ((bufferInfo.flags & 4) != 0) {
                                                                    z2 = true;
                                                                }
                                                                if (bufferInfo.size > 0) {
                                                                    long j10 = bufferInfo.presentationTimeUs;
                                                                    if (j10 + 100000 >= max) {
                                                                        if (j8 < 0) {
                                                                            jArr[0] = j10 / j3;
                                                                            j8 = j10;
                                                                        }
                                                                        ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(dequeueOutputBuffer);
                                                                        outputBuffer.position(bufferInfo.offset);
                                                                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                                                                        ShortBuffer asShortBuffer = outputBuffer.order(ByteOrder.LITTLE_ENDIAN).asShortBuffer();
                                                                        int remaining = asShortBuffer.remaining() / Math.max(1, integer2);
                                                                        String str5 = str3;
                                                                        str = str4;
                                                                        double d2 = integer / 16000.0d;
                                                                        double d3 = remaining;
                                                                        int i3 = i2;
                                                                        int i4 = i3 + ((int) (d3 / d2)) + 2;
                                                                        j4 = max;
                                                                        str2 = str5;
                                                                        if (i4 > 9680000) {
                                                                            z2 = true;
                                                                        }
                                                                        if (fArr.length < i4) {
                                                                            fArr = Arrays.copyOf(fArr, Math.max(i4, fArr.length << 1));
                                                                        }
                                                                        i2 = i3;
                                                                        double d4 = d;
                                                                        while (d4 < d3) {
                                                                            int i5 = (int) d4;
                                                                            d4 += d2;
                                                                            float[] fArr2 = fArr;
                                                                            int max2 = Math.max(i5 + 1, Math.min(remaining, (int) d4));
                                                                            int i6 = remaining;
                                                                            int i7 = i5;
                                                                            int i8 = 0;
                                                                            while (i7 < max2) {
                                                                                int i9 = i8;
                                                                                int i10 = 0;
                                                                                while (i10 < integer2) {
                                                                                    i9 += asShortBuffer.get((i7 * integer2) + i10);
                                                                                    i10++;
                                                                                    i7 = i7;
                                                                                }
                                                                                i7++;
                                                                                i8 = i9;
                                                                            }
                                                                            fArr2[i2] = (i8 / ((max2 - i5) * integer2)) / 32768.0f;
                                                                            i2++;
                                                                            fArr = fArr2;
                                                                            remaining = i6;
                                                                        }
                                                                        d = d4 - d3;
                                                                        mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                                        mediaExtractor2 = mediaExtractor;
                                                                        str3 = str2;
                                                                        str4 = str;
                                                                        max = j4;
                                                                        createDecoderByType = mediaCodec;
                                                                        j7 = j9;
                                                                    }
                                                                }
                                                                str = str4;
                                                                j4 = max;
                                                                str2 = str3;
                                                                i2 = i2;
                                                                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                                                                mediaExtractor2 = mediaExtractor;
                                                                str3 = str2;
                                                                str4 = str;
                                                                max = j4;
                                                                createDecoderByType = mediaCodec;
                                                                j7 = j9;
                                                            }
                                                            str = str4;
                                                            j4 = max;
                                                            str2 = str3;
                                                            mediaExtractor2 = mediaExtractor;
                                                            str3 = str2;
                                                            str4 = str;
                                                            max = j4;
                                                            createDecoderByType = mediaCodec;
                                                            j7 = j9;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            mediaExtractor = mediaExtractor2;
                                                            mediaCodec5 = mediaCodec3;
                                                            if (mediaCodec5 != null) {
                                                            }
                                                            mediaExtractor.release();
                                                            if (closeable == null) {
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    mediaCodec3 = createDecoderByType;
                                                }
                                            }
                                            mediaCodec4.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                            mediaCodec = mediaCodec4;
                                            z3 = true;
                                            mediaExtractor = mediaExtractor2;
                                            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 5000L);
                                            if (dequeueOutputBuffer == -2) {
                                            }
                                            str = str4;
                                            j4 = max;
                                            str2 = str3;
                                            mediaExtractor2 = mediaExtractor;
                                            str3 = str2;
                                            str4 = str;
                                            max = j4;
                                            createDecoderByType = mediaCodec;
                                            j7 = j9;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            mediaCodec2 = mediaCodec4;
                                            mediaCodec5 = mediaCodec2;
                                            mediaExtractor = mediaExtractor2;
                                            if (mediaCodec5 != null) {
                                            }
                                            mediaExtractor.release();
                                            if (closeable == null) {
                                            }
                                        }
                                        mediaCodec4 = createDecoderByType;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    mediaCodec2 = createDecoderByType;
                                }
                            }
                            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 5000L);
                            if (dequeueOutputBuffer == -2) {
                            }
                            str = str4;
                            j4 = max;
                            str2 = str3;
                            mediaExtractor2 = mediaExtractor;
                            str3 = str2;
                            str4 = str;
                            max = j4;
                            createDecoderByType = mediaCodec;
                            j7 = j9;
                        } catch (Throwable th7) {
                            th = th7;
                            mediaCodec5 = mediaCodec;
                            if (mediaCodec5 != null) {
                                try {
                                    mediaCodec5.stop();
                                    mediaCodec5.release();
                                } catch (Throwable unused2) {
                                }
                            }
                            mediaExtractor.release();
                            if (closeable == null) {
                                throw th;
                            }
                            set.remove(closeable);
                            try {
                                ((u5b) closeable).close();
                                throw th;
                            } catch (Throwable unused3) {
                                throw th;
                            }
                        }
                        mediaCodec = createDecoderByType;
                        mediaExtractor = mediaExtractor2;
                    }
                    mediaExtractor = mediaExtractor2;
                    mediaCodec = createDecoderByType;
                    int i11 = i2;
                    float[] copyOf = i11 == 0 ? null : Arrays.copyOf(fArr, i11);
                    try {
                        mediaCodec.stop();
                        mediaCodec.release();
                    } catch (Throwable unused4) {
                    }
                    mediaExtractor.release();
                    if (closeable != null) {
                        set.remove(closeable);
                        try {
                            ((u5b) closeable).close();
                        } catch (Throwable unused5) {
                        }
                    }
                    return copyOf;
                } catch (Throwable th8) {
                    th = th8;
                    mediaExtractor = mediaExtractor2;
                    mediaCodec = createDecoderByType;
                }
            } catch (Throwable th9) {
                th = th9;
                mediaExtractor = mediaExtractor2;
                mediaCodec5 = null;
            }
        } catch (Throwable th10) {
            th = th10;
            mediaExtractor = mediaExtractor2;
            mediaCodec5 = null;
            closeable = null;
        }
    }

    public final void c() {
        int i;
        Closeable[] closeableArr;
        this.h = true;
        i();
        synchronized (this.a) {
            closeableArr = (Closeable[]) this.a.toArray(new Closeable[0]);
        }
        for (Closeable closeable : closeableArr) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean e(int i) {
        p5b p5bVar = (p5b) this.i.get(Integer.valueOf(i));
        return (p5bVar != null && p5bVar.c) || ((long) i) * 30000 >= this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        int a;
        int a2;
        q5b q5bVar;
        if (!this.o || this.p || this.h || this.f == null) {
            return;
        }
        int a3 = a(this.l);
        long j = this.m;
        if (j <= this.l) {
            j = this.k;
            if (j == Long.MAX_VALUE) {
                a = ConnectionsManager.DEFAULT_DATACENTER_ID;
                r5b r5bVar = this.n;
                a2 = a(r5bVar == null ? r5bVar.get() : this.l);
                if (e(a2)) {
                    int i = -1;
                    if (this.d >= 0) {
                        for (int i2 = a2 + 1; i2 <= this.d + a2 && i < 0 && i2 * 30000 < this.k; i2++) {
                            if (!e(i2)) {
                                i = i2;
                            }
                        }
                    } else {
                        for (int max = Math.max(a3, a2); max <= a && i < 0 && max * 30000 < this.k; max++) {
                            if (!e(max)) {
                                i = max;
                            }
                        }
                        while (a3 < a2 && a3 <= a && i < 0) {
                            if (!e(a3)) {
                                i = a3;
                            }
                            a3++;
                        }
                    }
                    a2 = i;
                }
                if (a2 >= 0) {
                    if (this.r || (q5bVar = this.t) == null) {
                        return;
                    }
                    this.r = true;
                    q5bVar.a(this.s);
                    return;
                }
                this.p = true;
                final int i3 = this.g;
                final long j2 = a2 * 30000;
                final long j3 = 30000 + j2;
                Integer valueOf = Integer.valueOf(a2);
                HashMap hashMap = this.j;
                final Long l = (Long) hashMap.get(valueOf);
                final Long l2 = (Long) hashMap.get(Integer.valueOf(a2 + 1));
                final int i4 = a2;
                new Thread(new Runnable() { // from class: m5b
                    @Override // java.lang.Runnable
                    public final void run() {
                        float[] fArr;
                        long j4;
                        final long j5;
                        final long j6;
                        final long j7;
                        final float[] fArr2;
                        long j8;
                        char c;
                        long longValue;
                        long longValue2;
                        v5b v5bVar = v5b.this;
                        long j9 = j2;
                        long[] jArr = {j9};
                        long j10 = j9 - 2000;
                        long max2 = Math.max(0L, j9 - 3500);
                        long j11 = j3;
                        long j12 = j11 + 2000;
                        try {
                            fArr = v5bVar.b(v5bVar.c, max2, 3500 + j11, jArr);
                        } catch (Throwable th) {
                            Log.e("Dictation", "captions: can't hear the video", th);
                            fArr = null;
                        }
                        final int i5 = i4;
                        if (fArr != null) {
                            long j13 = jArr[0];
                            long length = (fArr.length / 16) + j13;
                            j8 = length < j11 + 2500 ? length : Long.MAX_VALUE;
                            if (i5 == 0) {
                                longValue = j13;
                                c = 4;
                            } else {
                                c = 4;
                                Long l3 = l;
                                longValue = l3 != null ? l3.longValue() : (v5b.g(((int) (j10 - j13)) << 4, ((int) ((j9 + 2000) - j13)) << 4, fArr) / 16) + j13;
                            }
                            if (j8 <= j12) {
                                longValue2 = j8;
                            } else {
                                Long l4 = l2;
                                longValue2 = l4 != null ? l4.longValue() : j13 + (v5b.g(((int) ((j11 - 2000) - j13)) << 4, ((int) (j12 - j13)) << 4, fArr) / 16);
                            }
                            long max3 = Math.max(j13, Math.min(length, longValue));
                            long max4 = Math.max(max3, Math.min(length, longValue2));
                            int max5 = (int) Math.max(0L, Math.min(fArr.length, ((max3 - 1500) - j13) << c));
                            j4 = max2;
                            int max6 = (int) Math.max(max5, Math.min(fArr.length, ((max4 + 1500) - j13) << c));
                            long j14 = (max5 / 16) + j13;
                            if (max4 - max3 >= 100) {
                                fArr2 = Arrays.copyOfRange(fArr, max5, max6);
                                j7 = max4;
                                v5bVar = v5bVar;
                                j5 = max3;
                            } else {
                                j7 = max4;
                                v5bVar = v5bVar;
                                j5 = max3;
                                fArr2 = null;
                            }
                            j6 = j14;
                        } else {
                            j4 = max2;
                            j5 = j9;
                            j6 = j5;
                            j7 = j11;
                            fArr2 = null;
                            j8 = Long.MAX_VALUE;
                        }
                        final long j15 = fArr == null ? j4 : j8;
                        final int i6 = i3;
                        final v5b v5bVar2 = v5bVar;
                        gm.c3(new Runnable() { // from class: n5b
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i7;
                                long j16;
                                q5b q5bVar2;
                                v5b v5bVar3 = v5b.this;
                                int i8 = i6;
                                long j17 = j15;
                                int i9 = i5;
                                float[] fArr3 = fArr2;
                                long j18 = j5;
                                long j19 = j7;
                                long j20 = j6;
                                HashMap hashMap2 = v5bVar3.j;
                                if (v5bVar3.h || i8 != v5bVar3.g) {
                                    return;
                                }
                                if (j17 != Long.MAX_VALUE) {
                                    i7 = i9;
                                    j16 = j18;
                                    v5bVar3.k = Math.min(v5bVar3.k, Math.max(j17, 1L));
                                } else {
                                    i7 = i9;
                                    j16 = j18;
                                }
                                p5b p5bVar = new p5b();
                                v5bVar3.i.put(Integer.valueOf(i7), p5bVar);
                                if (fArr3 == null) {
                                    p5bVar.c = true;
                                    v5bVar3.p = false;
                                    if (i7 != 0 || v5bVar3.k > 1 || v5bVar3.q || (q5bVar2 = v5bVar3.t) == null) {
                                        v5bVar3.f();
                                        return;
                                    } else {
                                        v5bVar3.o = false;
                                        q5bVar2.n();
                                        return;
                                    }
                                }
                                hashMap2.put(Integer.valueOf(i7), Long.valueOf(j16));
                                if (j19 < v5bVar3.k) {
                                    hashMap2.put(Integer.valueOf(i7 + 1), Long.valueOf(j19));
                                }
                                long j21 = i7 == 0 ? Long.MIN_VALUE : j16;
                                if (j19 >= v5bVar3.k) {
                                    j19 = Long.MAX_VALUE;
                                }
                                gn3 gn3Var = (gn3) v5bVar3.f.b;
                                if (v5bVar3.t != null && v5bVar3.x == null && !DictationAsr.A(gn3Var) && !DictationAsr.y(gn3Var)) {
                                    j2b j2bVar = new j2b(v5bVar3, gn3Var, new long[2], (byte) 5);
                                    v5bVar3.x = j2bVar;
                                    DictationAsr.i(j2bVar);
                                }
                                j2b j2bVar2 = v5bVar3.x;
                                in3 in3Var = v5bVar3.f;
                                o5b o5bVar = new o5b(v5bVar3, i8, p5bVar, j20, j21, j19);
                                gn3[] gn3VarArr = DictationAsr.a;
                                boolean[] zArr = {false};
                                DictationAsr.i0((gn3) in3Var.b, true, new an3(zArr, o5bVar, fArr3, in3Var));
                                v5bVar3.w = new rm1(zArr, (byte) 2);
                                if (j2bVar2 == null || j2bVar2 != v5bVar3.x) {
                                    return;
                                }
                                j2bVar2.run();
                            }
                        });
                    }
                }, "StoryCaptions").start();
                return;
            }
        }
        a = a(j - 1);
        r5b r5bVar2 = this.n;
        a2 = a(r5bVar2 == null ? r5bVar2.get() : this.l);
        if (e(a2)) {
        }
        if (a2 >= 0) {
        }
    }

    public final void h(long j, long j2, q5b q5bVar) {
        this.t = q5bVar;
        if (this.f != null) {
            this.l = j;
            this.m = j2;
            this.o = true;
            this.r = false;
            ArrayList arrayList = this.s;
            if (!arrayList.isEmpty()) {
                q5bVar.a(arrayList);
            }
            f();
        }
    }

    public final void i() {
        this.g++;
        rm1 rm1Var = this.w;
        if (rm1Var != null) {
            rm1Var.run();
            this.w = null;
        }
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            if (!((p5b) it.next()).c) {
                it.remove();
            }
        }
        this.p = false;
        this.o = false;
        j();
        this.t = null;
    }

    public final void j() {
        j2b j2bVar = this.x;
        if (j2bVar != null) {
            DictationAsr.T(j2bVar);
            this.x = null;
            q5b q5bVar = this.t;
            if (q5bVar != null) {
                q5bVar.f(0L, 0L, false);
            }
        }
    }
}
