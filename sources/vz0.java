// default package

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.TreeMap;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class vz0 {
    public final String a;
    public final HandlerThread b;
    public final Handler c;
    public SurfaceTextureHelper d;
    public Surface e;
    public MediaCodec g;
    public String h;
    public int i;
    public int j;
    public ByteBuffer k;
    public ByteBuffer l;
    public MediaExtractor n;
    public boolean o;
    public boolean q;
    public boolean t;
    public boolean u;
    public final /* synthetic */ wz0 v;
    public final TreeMap f = new TreeMap();
    public long m = -1;
    public long p = -1;
    public final ArrayDeque r = new ArrayDeque();
    public final MediaCodec.BufferInfo s = new MediaCodec.BufferInfo();

    public vz0(wz0 wz0Var, String str) {
        this.v = wz0Var;
        this.a = str;
        HandlerThread handlerThread = new HandlerThread("BroadcastTile");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.c = handler;
        handler.post(new tz0(this, (byte) 1));
    }

    public final void a() {
        TreeMap treeMap;
        long j;
        long[] jArr;
        boolean z;
        String str;
        String str2;
        long[] jArr2;
        String str3;
        String str4;
        char c;
        int dequeueInputBuffer;
        MediaFormat mediaFormat;
        String str5;
        long nanoTime = System.nanoTime() / 1000000;
        Iterator it = this.v.e.iterator();
        long[] jArr3 = null;
        while (it.hasNext()) {
            long[] jArr4 = (long[]) it.next();
            if (jArr4[1] > nanoTime) {
                break;
            } else {
                jArr3 = jArr4;
            }
        }
        if (jArr3 != null) {
            long j2 = jArr3[0];
            while (true) {
                treeMap = this.f;
                if (treeMap.isEmpty() || ((Long) treeMap.firstKey()).longValue() >= j2) {
                    break;
                } else {
                    treeMap.pollFirstEntry();
                }
            }
            sz0 sz0Var = (sz0) treeMap.get(Long.valueOf(j2));
            if (sz0Var != null) {
                long j3 = this.m;
                ArrayDeque arrayDeque = this.r;
                if (j3 != j2) {
                    MediaExtractor mediaExtractor = this.n;
                    if (mediaExtractor != null) {
                        mediaExtractor.release();
                        this.n = null;
                    }
                    this.m = -1L;
                    MediaExtractor mediaExtractor2 = new MediaExtractor();
                    this.n = mediaExtractor2;
                    mediaExtractor2.setDataSource(new rz0(sz0Var.a));
                    int i = 0;
                    while (true) {
                        if (i >= this.n.getTrackCount()) {
                            i = -1;
                            mediaFormat = null;
                            break;
                        }
                        mediaFormat = this.n.getTrackFormat(i);
                        String string = mediaFormat.getString("mime");
                        if (string != null && string.startsWith("video/")) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (i < 0) {
                        this.m = j2;
                        this.o = true;
                        j = nanoTime;
                        jArr = jArr3;
                        z = true;
                        str = "height";
                        str2 = "width";
                        jArr2 = null;
                    } else {
                        this.n.selectTrack(i);
                        String string2 = mediaFormat.getString("mime");
                        int integer = mediaFormat.getInteger("width");
                        int integer2 = mediaFormat.getInteger("height");
                        ByteBuffer byteBuffer = mediaFormat.containsKey("csd-0") ? mediaFormat.getByteBuffer("csd-0") : null;
                        z = true;
                        ByteBuffer byteBuffer2 = mediaFormat.containsKey("csd-1") ? mediaFormat.getByteBuffer("csd-1") : null;
                        j = nanoTime;
                        if (this.g != null && string2.equals(this.h) && integer == this.i && integer2 == this.j) {
                            ByteBuffer byteBuffer3 = this.k;
                            if ((byteBuffer == null || byteBuffer3 == null) ? byteBuffer == byteBuffer3 : byteBuffer.equals(byteBuffer3)) {
                                ByteBuffer byteBuffer4 = this.l;
                                if ((byteBuffer2 == null || byteBuffer4 == null) ? byteBuffer2 == byteBuffer4 : byteBuffer2.equals(byteBuffer4)) {
                                    this.g.flush();
                                    jArr = jArr3;
                                    str = "height";
                                    str2 = "width";
                                    jArr2 = null;
                                    this.d.setFrameRotation(sz0Var.b);
                                    arrayDeque.clear();
                                    this.o = false;
                                    this.q = false;
                                    this.p = this.n.getSampleTime();
                                    this.m = j2;
                                }
                            }
                        }
                        arrayDeque.clear();
                        MediaCodec mediaCodec = this.g;
                        if (mediaCodec != null) {
                            try {
                                mediaCodec.stop();
                            } catch (Throwable unused) {
                            }
                            this.g.release();
                            str5 = null;
                            this.g = null;
                        } else {
                            str5 = null;
                        }
                        this.h = str5;
                        String c2 = wz0.c(string2);
                        if (c2 == null) {
                            sc8.j(b00.h("no hardware decoder for ", string2));
                            return;
                        }
                        MediaCodec createByCodecName = MediaCodec.createByCodecName(c2);
                        this.g = createByCodecName;
                        jArr = jArr3;
                        str = "height";
                        str2 = "width";
                        jArr2 = null;
                        createByCodecName.configure(mediaFormat, this.e, (MediaCrypto) null, 0);
                        this.g.start();
                        this.h = string2;
                        this.i = integer;
                        this.j = integer2;
                        this.k = byteBuffer;
                        this.l = byteBuffer2;
                        this.d.setTextureSize(integer, integer2);
                        if (w01.a) {
                            StringBuilder sb = new StringBuilder("[BroadcastHwVideo] ");
                            ls6.u(sb, this.a, ": ", c2, " ");
                            sb.append(integer);
                            sb.append("x");
                            sb.append(integer2);
                            fa4.b(sb.toString());
                        }
                        this.d.setFrameRotation(sz0Var.b);
                        arrayDeque.clear();
                        this.o = false;
                        this.q = false;
                        this.p = this.n.getSampleTime();
                        this.m = j2;
                    }
                } else {
                    j = nanoTime;
                    jArr = jArr3;
                    z = true;
                    str = "height";
                    str2 = "width";
                    jArr2 = null;
                }
                double d = (jArr[2] / 1000.0d) + ((j - jArr[z ? 1 : 0]) / 1000.0d);
                if (this.g != null && this.n != null) {
                    while (!this.o && (dequeueInputBuffer = this.g.dequeueInputBuffer(0L)) >= 0) {
                        ByteBuffer inputBuffer = this.g.getInputBuffer(dequeueInputBuffer);
                        int readSampleData = inputBuffer != null ? this.n.readSampleData(inputBuffer, 0) : -1;
                        MediaCodec mediaCodec2 = this.g;
                        if (readSampleData < 0) {
                            mediaCodec2.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                            this.o = z;
                        } else {
                            mediaCodec2.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.n.getSampleTime(), 0);
                            this.n.advance();
                        }
                        z = true;
                    }
                }
                if (this.g != null) {
                    while (true) {
                        MediaCodec mediaCodec3 = this.g;
                        MediaCodec.BufferInfo bufferInfo = this.s;
                        int dequeueOutputBuffer = mediaCodec3.dequeueOutputBuffer(bufferInfo, 0L);
                        if (dequeueOutputBuffer >= 0) {
                            if ((bufferInfo.flags & 4) == 0 || bufferInfo.size != 0) {
                                arrayDeque.addLast(new long[]{dequeueOutputBuffer, bufferInfo.presentationTimeUs});
                            } else {
                                this.g.releaseOutputBuffer(dequeueOutputBuffer, false);
                            }
                            str3 = str2;
                            str4 = str;
                        } else if (dequeueOutputBuffer == -2) {
                            MediaFormat outputFormat = this.g.getOutputFormat();
                            str3 = str2;
                            int integer3 = outputFormat.getInteger(str3);
                            str4 = str;
                            int integer4 = outputFormat.getInteger(str4);
                            if (outputFormat.containsKey("crop-right") && outputFormat.containsKey("crop-left")) {
                                integer3 = (outputFormat.getInteger("crop-right") - outputFormat.getInteger("crop-left")) + 1;
                            }
                            if (outputFormat.containsKey("crop-bottom") && outputFormat.containsKey("crop-top")) {
                                integer4 = (outputFormat.getInteger("crop-bottom") - outputFormat.getInteger("crop-top")) + 1;
                            }
                            this.d.setTextureSize(integer3, integer4);
                        } else {
                            str3 = str2;
                            str4 = str;
                            if (dequeueOutputBuffer == -1) {
                                break;
                            }
                        }
                        str2 = str3;
                        str = str4;
                    }
                    if (arrayDeque.isEmpty()) {
                        return;
                    }
                    long j4 = this.p;
                    if (j4 >= 0) {
                        c = 1;
                    } else {
                        c = 1;
                        j4 = ((long[]) arrayDeque.peekFirst())[1];
                    }
                    long j5 = j4 + ((long) (d * 1000000.0d));
                    while (!arrayDeque.isEmpty() && ((long[]) arrayDeque.peekFirst())[c] <= j5) {
                        if (jArr2 != null) {
                            this.g.releaseOutputBuffer((int) jArr2[0], false);
                        }
                        jArr2 = (long[]) arrayDeque.pollFirst();
                        c = 1;
                    }
                    if (jArr2 == null && !this.q) {
                        jArr2 = (long[]) arrayDeque.pollFirst();
                    }
                    if (jArr2 != null) {
                        this.g.releaseOutputBuffer((int) jArr2[0], true);
                        this.q = true;
                    }
                }
            }
        }
    }
}
