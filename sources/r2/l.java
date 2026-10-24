package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public interface l {
    void a(long j10, int i10, int i11, int i12);

    void b(int i10, h2.d dVar, long j10, int i11);

    void c(int i10);

    void d(a3.m mVar, Handler handler);

    void e(p2.b bVar);

    void f();

    void flush();

    void g(int i10, long j10);

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    int h();

    int i(MediaCodec.BufferInfo bufferInfo);

    void j(int i10);

    void k(Surface surface);

    void l(ArrayList arrayList);

    void m(ArrayList arrayList);

    boolean n(l2.f fVar);

    void release();

    void setParameters(Bundle bundle);
}
