package y7;

import a8.xa;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class s2 implements oa.a, zi.x0 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    @Override // oa.a
    public /* bridge */ /* synthetic */ oa.a c(Class cls, na.d dVar) {
        ((HashMap) this.b).put(cls, dVar);
        ((HashMap) this.c).remove(cls);
        return this;
    }

    @Override // zi.x0
    public void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        allocateDirect.put(byteBuffer).flip();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ((ArrayList) this.b).add(allocateDirect);
        ((ArrayList) this.c).add(bufferInfo2);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.b);
                sb2.append('{');
                i61 i61Var = (i61) ((i61) this.c).d;
                String str = "";
                while (i61Var != null) {
                    Object obj = i61Var.c;
                    sb2.append(str);
                    String str2 = (String) i61Var.b;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
                    }
                    i61Var = (i61) i61Var.d;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override // zi.x0
    public void w(MediaFormat mediaFormat) {
        this.d = mediaFormat;
    }

    public s2(int i7) {
        this.a = i7;
        switch (i7) {
            case 6:
                this.b = new ArrayList();
                this.c = new ArrayList();
                break;
            default:
                this.b = new HashMap();
                this.c = new HashMap();
                this.d = z7.e.c;
                break;
        }
    }

    public /* synthetic */ s2(String str) {
        this.a = 0;
        i61 i61Var = new i61(29, false);
        this.c = i61Var;
        this.d = i61Var;
        this.b = str;
    }

    public s2(zi.p0 p0Var, Range range, xa xaVar) {
        this.a = 5;
        this.b = p0Var;
        this.c = range;
        this.d = xaVar;
    }
}
