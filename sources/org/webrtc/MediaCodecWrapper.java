package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
interface MediaCodecWrapper {
    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10);

    Surface createInputSurface();

    int dequeueInputBuffer(long j10);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j10);

    void flush();

    MediaCodecInfo getCodecInfo();

    ByteBuffer getInputBuffer(int i10);

    MediaFormat getInputFormat();

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    MediaFormat getOutputFormat(int i10);

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13);

    void release();

    void releaseOutputBuffer(int i10, boolean z10);

    void setParameters(Bundle bundle);

    void start();

    void stop();
}
