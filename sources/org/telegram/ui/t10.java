package org.telegram.ui;

import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t10 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.c2[] b;

    public /* synthetic */ t10(org.telegram.ui.Cells.c2[] c2VarArr, int i10) {
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
                RectF rectF = ProfileActivity.S6;
                c2VarArr[0].c(!r5.b(), true);
                break;
        }
    }
}
