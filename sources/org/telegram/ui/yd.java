package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class yd extends org.telegram.ui.Components.ld0 {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                je jeVar = (je) this.M;
                org.telegram.ui.Components.t61 t61Var = jeVar.a1;
                fi.o oVar = jeVar.Y0;
                if (oVar != null && !oVar.isFocusable()) {
                    oVar.setFocusable(true);
                    oVar.setFocusableInTouchMode(true);
                    int x12 = t61Var.x1(3);
                    if (x12 >= 0 && x12 < t61Var.Y2.x.size()) {
                        t61Var.B0();
                        t61Var.x0(x12);
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
                    int x13 = gVar.e.x1(1);
                    if (x13 >= 0 && x13 < gVar.e.Y2.x.size()) {
                        gVar.e.B0();
                        gVar.e.x0(x13);
                    }
                    gVar.Q.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
