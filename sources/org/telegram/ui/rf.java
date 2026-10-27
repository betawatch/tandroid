package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ rf(wn wnVar, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = wnVar;
        this.c = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                li liVar = new li(wnVar, wnVar, wnVar.getParentActivity(), wnVar.ua, this.c);
                liVar.setCalcMandatoryInsets(wnVar.I9());
                liVar.setDimBehind(false);
                wnVar.J7(false);
                wnVar.showDialog(liVar);
                break;
            default:
                wn wnVar2 = this.b;
                if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.aw(wnVar2, wnVar2.getParentActivity(), wnVar2.ua, this.c).show();
                    wnVar2.J7(true);
                    break;
                }
                break;
        }
    }
}
