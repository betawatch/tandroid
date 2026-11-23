package pg;

import android.view.View;
import org.telegram.messenger.y10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements y10 {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.y10
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
