// default package

import android.graphics.Bitmap;
import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class ve8 {
    public static uo3 a;
    public static final rt4 b = new rt4(25165824, (byte) 2);
    public static final rr4 c = new rr4(16, 0.75f, true, (byte) 2);
    public static final HashMap d = new HashMap();

    public static int a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
