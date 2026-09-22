package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.z1[] b;

    public /* synthetic */ w20(org.telegram.ui.Cells.z1[] z1VarArr, int i10) {
        this.a = i10;
        this.b = z1VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) view.getTag()).intValue();
                this.b[intValue].c(!r1[r3.intValue()].b(), true);
                break;
            case 1:
                this.b[0].c(!r3.b(), true);
                break;
            default:
                this.b[0].c(!r3.b(), true);
                break;
        }
    }
}
