package zf;

import android.graphics.RectF;
import java.util.Comparator;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.Size;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ e0(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0040 A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int lambda$initCamera$0;
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) obj;
                RectF rectF2 = (RectF) obj2;
                if (Math.abs(rectF.top - rectF2.top) > 1.0E-4f) {
                    return rectF.top < rectF2.top ? -1 : 1;
                }
                if (Math.abs(rectF.left - rectF2.left) <= 1.0E-4f) {
                    return 0;
                }
                if (rectF.left < rectF2.left) {
                }
            default:
                lambda$initCamera$0 = CameraController.lambda$initCamera$0((Size) obj, (Size) obj2);
                return lambda$initCamera$0;
        }
    }
}
