package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
interface MediaCodecWrapper {
    void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i9);

    Surface createInputSurface();

    int dequeueInputBuffer(long j10);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j10);

    void flush();

    MediaCodecInfo getCodecInfo();

    ByteBuffer getInputBuffer(int i9);

    MediaFormat getInputFormat();

    ByteBuffer getOutputBuffer(int i9);

    MediaFormat getOutputFormat();

    MediaFormat getOutputFormat(int i9);

    void queueInputBuffer(int i9, int i10, int i11, long j10, int i12);

    void release();

    void releaseOutputBuffer(int i9, boolean z10);

    void setParameters(Bundle bundle);

    void start();

    void stop();
}
