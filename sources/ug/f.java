package ug;

import android.view.View;
import org.telegram.messenger.Utilities;
import xg.l;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Utilities.Callback {
    public final /* synthetic */ boolean a;

    public /* synthetic */ f(boolean z10) {
        this.a = z10;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        View view = (View) obj;
        if (view instanceof l) {
            ((l) view).g(this.a, true);
        }
    }
}
