// default package

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vk0 extends fka {
    public final Context r;
    public final int s;

    public vk0(Context context) {
        super(new la3[1], new tk0[1]);
        this.r = context;
        this.s = -1;
    }

    @Override // fka
    public final na3 g() {
        return new tk0(this);
    }

    @Override // ga3
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // fka
    public final ja3 i(la3 la3Var, na3 na3Var, boolean z) {
        tk0 tk0Var = (tk0) na3Var;
        ByteBuffer byteBuffer = la3Var.c;
        byteBuffer.getClass();
        jte.p(byteBuffer.hasArray());
        jte.f(byteBuffer.arrayOffset() == 0);
        try {
            int i = this.s;
            if (i == -1) {
                Context context = this.r;
                if (context != null) {
                    Point y = hac.y(context);
                    int i2 = y.x;
                    int i3 = y.y;
                    go4 go4Var = la3Var.a;
                    if (go4Var != null) {
                        int i4 = go4Var.V;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = go4Var.W;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) << 1) - 1;
                } else {
                    i = TLObject.FLAG_12;
                }
            }
            tk0Var.a = y00.f(byteBuffer.remaining(), i, byteBuffer.array());
            tk0Var.timeUs = la3Var.e;
            return null;
        } catch (bx7 e) {
            return new cm5("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new cm5(e2);
        }
    }
}
