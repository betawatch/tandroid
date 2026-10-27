package q2;

import a8.yb;
import ag.t0;
import android.content.Context;
import android.graphics.Point;
import b2.x;
import b2.x0;
import e2.n0;
import h2.h;
import h2.j;
import h2.l;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b extends l {
    public final Context o;
    public final int p;

    public b(Context context) {
        super(new h[1], new a[1]);
        this.o = context;
        this.p = -1;
    }

    @Override // h2.l
    public final h f() {
        return new h(1, 0);
    }

    @Override // h2.l
    public final j g() {
        return new a(this);
    }

    @Override // h2.e
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // h2.l
    public final h2.f h(Throwable th2) {
        return new c("Unexpected decode error", th2);
    }

    @Override // h2.l
    public final h2.f i(h hVar, j jVar, boolean z10) {
        a aVar = (a) jVar;
        ByteBuffer byteBuffer = hVar.c;
        byteBuffer.getClass();
        yb.p(byteBuffer.hasArray());
        yb.g(byteBuffer.arrayOffset() == 0);
        try {
            int i10 = this.p;
            if (i10 == -1) {
                Context context = this.o;
                if (context != null) {
                    Point y3 = n0.y(context);
                    int i11 = y3.x;
                    int i12 = y3.y;
                    x xVar = hVar.a;
                    if (xVar != null) {
                        int i13 = xVar.R;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                        int i14 = xVar.S;
                        if (i14 != -1) {
                            i12 *= i14;
                        }
                    }
                    i10 = (Math.max(i11, i12) * 2) - 1;
                } else {
                    i10 = 4096;
                }
            }
            aVar.a = t0.b(byteBuffer.remaining(), i10, byteBuffer.array());
            aVar.timeUs = hVar.e;
            return null;
        } catch (x0 e) {
            return new c("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e10) {
            return new c(e10);
        }
    }
}
