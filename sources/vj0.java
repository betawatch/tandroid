// default package

import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vj0 extends dia {
    public final Context r;
    public final int s;

    public vj0(Context context) {
        super(new z83[1], new tj0[1]);
        this.r = context;
        this.s = -1;
    }

    @Override // dia
    public final b93 g() {
        return new tj0(this);
    }

    @Override // u83
    public final String getName() {
        return "BitmapFactoryImageDecoder";
    }

    @Override // dia
    public final x83 i(z83 z83Var, b93 b93Var, boolean z) {
        tj0 tj0Var = (tj0) b93Var;
        ByteBuffer byteBuffer = z83Var.c;
        byteBuffer.getClass();
        gre.p(byteBuffer.hasArray());
        gre.f(byteBuffer.arrayOffset() == 0);
        try {
            int i = this.s;
            if (i == -1) {
                Context context = this.r;
                if (context != null) {
                    Point y = g8c.y(context);
                    int i2 = y.x;
                    int i3 = y.y;
                    fm4 fm4Var = z83Var.a;
                    if (fm4Var != null) {
                        int i4 = fm4Var.V;
                        if (i4 != -1) {
                            i2 *= i4;
                        }
                        int i5 = fm4Var.W;
                        if (i5 != -1) {
                            i3 *= i5;
                        }
                    }
                    i = (Math.max(i2, i3) << 1) - 1;
                } else {
                    i = TLObject.FLAG_12;
                }
            }
            tj0Var.a = yz.f(byteBuffer.remaining(), i, byteBuffer.array());
            tj0Var.timeUs = z83Var.e;
            return null;
        } catch (av7 e) {
            return new ck5("Could not decode image data with BitmapFactory.", e);
        } catch (IOException e2) {
            return new ck5(e2);
        }
    }
}
