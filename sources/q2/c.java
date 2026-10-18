package q2;

import android.content.Context;
import android.graphics.Point;
import b2.w;
import b2.w0;
import e0.e0;
import e2.m0;
import h2.h;
import h2.j;
import h2.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class c extends l {
    public final Context o;
    public final int p;

    public c(Context context) {
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
        return new d("Unexpected decode error", th2);
    }

    @Override // h2.l
    public final h2.f i(h hVar, j jVar, boolean z10) {
        a aVar = (a) jVar;
        ByteBuffer byteBuffer = hVar.c;
        byteBuffer.getClass();
        u6.p(byteBuffer.hasArray());
        u6.g(byteBuffer.arrayOffset() == 0);
        try {
            int i10 = this.p;
            if (i10 == -1) {
                Context context = this.o;
                if (context != null) {
                    Point y3 = m0.y(context);
                    int i11 = y3.x;
                    int i12 = y3.y;
                    w wVar = hVar.a;
                    if (wVar != null) {
                        int i13 = wVar.R;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                        int i14 = wVar.S;
                        if (i14 != -1) {
                            i12 *= i14;
                        }
                    }
                    i10 = (Math.max(i11, i12) * 2) - 1;
                } else {
                    i10 = 4096;
                }
            }
            aVar.a = e0.a(byteBuffer.remaining(), i10, byteBuffer.array());
            aVar.timeUs = hVar.e;
            return null;
        } catch (w0 e) {
            return new d("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e7) {
            return new d(e7);
        }
    }
}
