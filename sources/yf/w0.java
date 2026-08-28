package yf;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import kh.s5;
import kh.vb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ w0(int i9, FrameLayout frameLayout) {
        this.a = i9;
        this.b = frameLayout;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                s5 s5Var = (s5) this.b;
                s5Var.u0 = ((Integer) obj).intValue();
                s5Var.v0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new pf.o1(s5Var, 17), 60L);
                break;
            default:
                ((vb) this.b).Z((Bitmap) obj, ((Float) obj2).floatValue());
                break;
        }
    }
}
