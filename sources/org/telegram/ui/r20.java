package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.z1[] b;

    public /* synthetic */ r20(org.telegram.ui.Cells.z1[] z1VarArr, int i10) {
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
