package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uy0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ uy0(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.run();
                break;
            default:
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
