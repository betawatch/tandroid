package xg;

import ah.r;
import android.view.View;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements z10 {
    public final /* synthetic */ boolean a;

    public /* synthetic */ g(boolean z10) {
        this.a = z10;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        View view = (View) obj;
        if (view instanceof r) {
            ((r) view).g(this.a, true);
        }
    }
}
