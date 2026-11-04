package s2;

import android.content.Context;
import android.graphics.Point;
import b8.zb;
import d2.v;
import d2.v0;
import g2.n0;
import j2.h;
import j2.j;
import j2.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends l {
    public final Context o;
    public final int p;

    public b(Context context) {
        super(new h[1], new a[1]);
        this.o = context;
        this.p = -1;
    }

    @Override // j2.l
    public final h f() {
        return new h(1, 0);
    }

    @Override // j2.l
    public final j g() {
        return new a(this);
    }

    @Override // j2.e
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // j2.l
    public final j2.f h(Throwable th2) {
        return new c("Unexpected decode error", th2);
    }

    @Override // j2.l
    public final j2.f i(h hVar, j jVar, boolean z10) {
        a aVar = (a) jVar;
        ByteBuffer byteBuffer = hVar.c;
        byteBuffer.getClass();
        zb.p(byteBuffer.hasArray());
        zb.f(byteBuffer.arrayOffset() == 0);
        try {
            int i3 = this.p;
            if (i3 == -1) {
                Context context = this.o;
                if (context != null) {
                    Point y9 = n0.y(context);
                    int i10 = y9.x;
                    int i11 = y9.y;
                    v vVar = hVar.a;
                    if (vVar != null) {
                        int i12 = vVar.R;
                        if (i12 != -1) {
                            i10 *= i12;
                        }
                        int i13 = vVar.S;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                    }
                    i3 = (Math.max(i10, i11) * 2) - 1;
                } else {
                    i3 = TLObject.FLAG_12;
                }
            }
            aVar.a = cg.n0.b(byteBuffer.remaining(), i3, byteBuffer.array());
            aVar.timeUs = hVar.e;
            return null;
        } catch (v0 e10) {
            return new c("Could not decode image data with BitmapFactory.", e10);
        } catch (IOException e11) {
            return new c(e11);
        }
    }
}
