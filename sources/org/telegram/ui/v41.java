package org.telegram.ui;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v41 implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v41(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                return SecretMediaViewer.a((SecretMediaViewer) this.b, windowInsets);
            default:
                return d71.b((w51) this.b, view, windowInsets);
        }
    }
}
