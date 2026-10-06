package ug;

import android.view.View;
import org.telegram.messenger.Utilities;
import xg.l;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
