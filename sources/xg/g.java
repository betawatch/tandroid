package xg;

import ah.r;
import android.view.View;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements c20 {
    public final /* synthetic */ boolean a;

    public /* synthetic */ g(boolean z9) {
        this.a = z9;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        View view = (View) obj;
        if (view instanceof r) {
            ((r) view).g(this.a, true);
        }
    }
}
