package pg;

import android.view.View;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements z10 {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.z10
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
