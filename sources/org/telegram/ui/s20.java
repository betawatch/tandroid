package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Cells.y1[] b;

    public /* synthetic */ s20(org.telegram.ui.Cells.y1[] y1VarArr, int i10) {
        this.a = i10;
        this.b = y1VarArr;
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
