package u2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.ui.Components.cf;
import org.telegram.ui.web.e1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public interface l {
    void d(int i7, int i10, int i11, long j3);

    void e(int i7, k2.d dVar, long j3, int i10);

    void f(int i7);

    void flush();

    void g();

    ByteBuffer getInputBuffer(int i7);

    ByteBuffer getOutputBuffer(int i7);

    MediaFormat getOutputFormat();

    void h(int i7, long j3);

    int i();

    int j(MediaCodec.BufferInfo bufferInfo);

    void k(d3.k kVar, Handler handler);

    void l(int i7);

    boolean m(cf cfVar);

    void n(Surface surface);

    void o(e1 e1Var);

    void p(ArrayList arrayList);

    void q(ArrayList arrayList);

    void release();

    void setParameters(Bundle bundle);
}
