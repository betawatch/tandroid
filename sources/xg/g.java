package xg;

import ah.r;
import android.view.View;
import org.telegram.messenger.c20;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
