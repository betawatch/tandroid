package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public interface l {
    void b(long j10, int i10, int i11, int i12);

    void d(int i10, h2.d dVar, long j10, int i11);

    void e(int i10);

    void f(a3.m mVar, Handler handler);

    void flush();

    void g();

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    void h(int i10, long j10);

    int i();

    int j(MediaCodec.BufferInfo bufferInfo);

    void k(int i10);

    void l(org.telegram.ui.web.v vVar);

    void m(Surface surface);

    void n(ArrayList arrayList);

    boolean o(m.l lVar);

    void p(ArrayList arrayList);

    void release();

    void setParameters(Bundle bundle);
}
