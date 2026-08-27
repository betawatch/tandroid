package zf;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import lh.r5;
import lh.rb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ w0(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                r5 r5Var = (r5) this.b;
                r5Var.u0 = ((Integer) obj).intValue();
                r5Var.v0 = ((Integer) obj2).intValue();
                AndroidUtilities.runOnUIThread(new qf.b(r5Var, 24), 60L);
                break;
            default:
                ((rb) this.b).Z((Bitmap) obj, ((Float) obj2).floatValue());
                break;
        }
    }
}
