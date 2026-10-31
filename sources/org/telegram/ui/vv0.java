package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ vv0(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        Runnable runnable = this.b;
        switch (i10) {
            case 0:
                RectF rectF = ProfileActivity.R6;
                runnable.run();
                break;
            default:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
