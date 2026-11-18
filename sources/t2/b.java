package t2;

import a8.la;
import android.content.Context;
import android.graphics.Point;
import bg.o0;
import e2.t0;
import e2.u;
import h2.l0;
import java.io.IOException;
import java.nio.ByteBuffer;
import k2.h;
import k2.j;
import k2.l;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class b extends l {
    public final Context o;
    public final int p;

    public b(Context context) {
        super(new h[1], new a[1]);
        this.o = context;
        this.p = -1;
    }

    @Override // k2.l
    public final h f() {
        return new h(1, 0);
    }

    @Override // k2.l
    public final j g() {
        return new a(this);
    }

    @Override // k2.e
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // k2.l
    public final k2.f h(Throwable th2) {
        return new c("Unexpected decode error", th2);
    }

    @Override // k2.l
    public final k2.f i(h hVar, j jVar, boolean z10) {
        a aVar = (a) jVar;
        ByteBuffer byteBuffer = hVar.c;
        byteBuffer.getClass();
        la.p(byteBuffer.hasArray());
        la.f(byteBuffer.arrayOffset() == 0);
        try {
            int i7 = this.p;
            if (i7 == -1) {
                Context context = this.o;
                if (context != null) {
                    Point y10 = l0.y(context);
                    int i10 = y10.x;
                    int i11 = y10.y;
                    u uVar = hVar.a;
                    if (uVar != null) {
                        int i12 = uVar.R;
                        if (i12 != -1) {
                            i10 *= i12;
                        }
                        int i13 = uVar.S;
                        if (i13 != -1) {
                            i11 *= i13;
                        }
                    }
                    i7 = (Math.max(i10, i11) * 2) - 1;
                } else {
                    i7 = TLObject.FLAG_12;
                }
            }
            aVar.a = o0.b(byteBuffer.remaining(), i7, byteBuffer.array());
            aVar.timeUs = hVar.e;
            return null;
        } catch (t0 e10) {
            return new c("Could not decode image data with BitmapFactory.", e10);
        } catch (IOException e11) {
            return new c(e11);
        }
    }
}
