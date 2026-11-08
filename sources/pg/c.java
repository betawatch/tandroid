package pg;

import android.view.View;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements c20 {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ((View) obj).invalidate();
                break;
            default:
                break;
        }
    }
}
