package q2;

import android.content.Context;
import android.graphics.Point;
import b2.s;
import b2.s0;
import e2.d0;
import h2.h;
import h2.j;
import h2.l;
import java.io.IOException;
import java.nio.ByteBuffer;
import v7.m7;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        e2.d.g(byteBuffer.hasArray());
        e2.d.b(byteBuffer.arrayOffset() == 0);
        try {
            int i10 = this.p;
            if (i10 == -1) {
                Context context = this.o;
                if (context != null) {
                    Point w10 = d0.w(context);
                    int i11 = w10.x;
                    int i12 = w10.y;
                    s sVar = hVar.a;
                    if (sVar != null) {
                        int i13 = sVar.Q;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                        int i14 = sVar.R;
                        if (i14 != -1) {
                            i12 *= i14;
                        }
                    }
                    i10 = (Math.max(i11, i12) * 2) - 1;
                } else {
                    i10 = 4096;
                }
            }
            aVar.a = m7.a(byteBuffer.remaining(), i10, byteBuffer.array());
            aVar.timeUs = hVar.e;
            return null;
        } catch (s0 e) {
            return new c("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e7) {
            return new c(e7);
        }
    }
}
