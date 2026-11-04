package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
interface MediaCodecWrapper {
    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i3);

    Surface createInputSurface();

    int dequeueInputBuffer(long j10);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j10);

    void flush();

    MediaCodecInfo getCodecInfo();

    ByteBuffer getInputBuffer(int i3);

    MediaFormat getInputFormat();

    ByteBuffer getOutputBuffer(int i3);

    MediaFormat getOutputFormat();

    MediaFormat getOutputFormat(int i3);

    void queueInputBuffer(int i3, int i10, int i11, long j10, int i12);

    void release();

    void releaseOutputBuffer(int i3, boolean z10);

    void setParameters(Bundle bundle);

    void start();

    void stop();
}
