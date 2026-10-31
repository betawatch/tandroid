package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.web.v1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public interface l {
    void a(int i10, int i11, int i12, long j10);

    void b(int i10, h2.d dVar, long j10, int i11);

    void c(int i10);

    void d(a3.m mVar, Handler handler);

    void e();

    void f(v1 v1Var);

    void flush();

    void g(int i10, long j10);

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    int h();

    int i(MediaCodec.BufferInfo bufferInfo);

    boolean j(n2.u uVar);

    void k(int i10);

    void l(Surface surface);

    void m(ArrayList arrayList);

    void n(ArrayList arrayList);

    void release();

    void setParameters(Bundle bundle);
}
