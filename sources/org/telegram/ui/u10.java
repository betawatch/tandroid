package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c2[] b;

    public /* synthetic */ u10(org.telegram.ui.Cells.c2[] c2VarArr, int i10) {
        this.a = i10;
        this.b = c2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Cells.c2[] c2VarArr = this.b;
        switch (i10) {
            case 0:
                c2VarArr[((Integer) view.getTag()).intValue()].c(!c2VarArr[r5.intValue()].b(), true);
                break;
            case 1:
                c2VarArr[0].c(!r5.b(), true);
                break;
            default:
                RectF rectF = ProfileActivity.R6;
                c2VarArr[0].c(!r5.b(), true);
                break;
        }
    }
}
