package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y00 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c2[] b;

    public /* synthetic */ y00(org.telegram.ui.Cells.c2[] c2VarArr, int i7) {
        this.a = i7;
        this.b = c2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        org.telegram.ui.Cells.c2[] c2VarArr = this.b;
        switch (i7) {
            case 0:
                c2VarArr[((Integer) view.getTag()).intValue()].c(!c2VarArr[r5.intValue()].b(), true);
                break;
            case 1:
                c2VarArr[0].c(!r5.b(), true);
                break;
            default:
                RectF rectF = ProfileActivity.S6;
                c2VarArr[0].c(!r5.b(), true);
                break;
        }
    }
}
