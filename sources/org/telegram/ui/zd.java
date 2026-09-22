package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class zd extends org.telegram.ui.Components.kd0 {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                ke keVar = (ke) this.M;
                org.telegram.ui.Components.u61 u61Var = keVar.a1;
                fi.o oVar = keVar.Y0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int y12 = u61Var.y1(3);
                    if (y12 >= 0 && y12 < u61Var.Y2.x.size()) {
                        u61Var.C0();
                        u61Var.y0(y12);
                    }
                    oVar.requestFocus();
                }
                break;
            default:
                yh.g gVar = (yh.g) this.M;
                fi.o oVar2 = gVar.Q;
                if (oVar2 != null && !oVar2.isFocusable()) {
                    gVar.Q.setFocusable(true);
                    gVar.Q.setFocusableInTouchMode(true);
                    int y13 = gVar.e.y1(1);
                    if (y13 >= 0 && y13 < gVar.e.Y2.x.size()) {
                        gVar.e.C0();
                        gVar.e.y0(y13);
                    }
                    gVar.Q.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
