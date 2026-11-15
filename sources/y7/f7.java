package y7;

import a8.xa;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class f7 implements oa.a, zi.y0 {
    public Object a;
    public Object b;
    public Object c;

    public f7(int i7) {
        switch (i7) {
            case 4:
                this.a = new ArrayList();
                this.b = new ArrayList();
                break;
            default:
                this.a = new HashMap();
                this.b = new HashMap();
                this.c = z7.e.c;
                break;
        }
    }

    @Override // zi.y0
    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.a).add(allocateDirect);
        ((ArrayList) this.b).add(bufferInfo2);
    }

    @Override // oa.a
    public /* bridge */ /* synthetic */ oa.a b(Class cls, na.d dVar) {
        ((HashMap) this.a).put(cls, dVar);
        ((HashMap) this.b).remove(cls);
        return this;
    }

    @Override // zi.y0
    public void o(MediaFormat mediaFormat) {
        this.c = mediaFormat;
    }

    public f7(zi.q0 q0Var, Range range, xa xaVar) {
        this.a = q0Var;
        this.b = range;
        this.c = xaVar;
    }
}
