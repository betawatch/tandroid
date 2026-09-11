package q2;

import android.content.Context;
import android.graphics.Point;
import b2.s;
import b2.s0;
import e2.d0;
import h2.h;
import h2.j;
import java.io.IOException;
import java.nio.ByteBuffer;
import v7.l7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class c extends j {
    public final Context o;
    public final int p;

    public c(Context context) {
        super(new h2.g[1], new a[1]);
        this.o = context;
        this.p = -1;
    }

    @Override // h2.j
    public final h2.g f() {
        return new h2.g(1, 0);
    }

    @Override // h2.j
    public final h g() {
        return new a(this);
    }

    @Override // h2.j
    public final h2.e h(Throwable th2) {
        return new d("Unexpected decode error", th2);
    }

    @Override // h2.j
    public final h2.e i(h2.g gVar, h hVar, boolean z10) {
        a aVar = (a) hVar;
        ByteBuffer byteBuffer = gVar.e;
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
                    s sVar = gVar.c;
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
            aVar.f = l7.a(byteBuffer.remaining(), i10, byteBuffer.array());
            aVar.c = gVar.h;
            return null;
        } catch (s0 e7) {
            return new d("Could not decode image data with BitmapFactory.", e7);
        } catch (IOException e10) {
            return new d(e10);
        }
    }
}
