package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
interface MediaCodecWrapper {
    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i7);

    Surface createInputSurface();

    int dequeueInputBuffer(long j3);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j3);

    void flush();

    MediaCodecInfo getCodecInfo();

    ByteBuffer getInputBuffer(int i7);

    MediaFormat getInputFormat();

    ByteBuffer getOutputBuffer(int i7);

    MediaFormat getOutputFormat();

    MediaFormat getOutputFormat(int i7);

    void queueInputBuffer(int i7, int i10, int i11, long j3, int i12);

    void release();

    void releaseOutputBuffer(int i7, boolean z10);

    void setParameters(Bundle bundle);

    void start();

    void stop();
}
