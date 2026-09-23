package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class zd1 implements org.telegram.ui.Components.fk0 {
    public final /* synthetic */ xn a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.gk0 c;
    public final /* synthetic */ de1 d;

    public zd1(de1 de1Var, xn xnVar, MessageObject messageObject, org.telegram.ui.Components.gk0 gk0Var) {
        this.d = de1Var;
        this.a = xnVar;
        this.b = messageObject;
        this.c = gk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.fk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(View view, zg.p0 p0Var, boolean z10, boolean z11) {
        float f7;
        zg.q0 q0Var;
        zg.n0 m10;
        float f10;
        int i10;
        float f11;
        int id2 = this.b.getId();
        xn xnVar = this.a;
        org.telegram.ui.Cells.a0 q82 = xnVar.q8(id2, true);
        float f12 = 0.0f;
        if (q82 instanceof org.telegram.ui.Cells.t1) {
            zg.q0 q0Var2 = ((org.telegram.ui.Cells.t1) q82).N;
            zg.n0 m11 = q0Var2.m(p0Var);
            if (m11 == null) {
                f11 = 0.0f;
                f7 = f11;
                xnVar.ab(q82, this.b, this.c, view, f12, f7, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = q0Var2.c + m11.x + (m11.A / 2.0f);
            f10 = q0Var2.d + m11.y;
            i10 = m11.B;
        } else if (!(q82 instanceof org.telegram.ui.Cells.w0) || (m10 = (q0Var = ((org.telegram.ui.Cells.w0) q82).C0).m(p0Var)) == null) {
            f7 = 0.0f;
            xnVar.ab(q82, this.b, this.c, view, f12, f7, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = q0Var.c + m10.x + (m10.A / 2.0f);
            f10 = q0Var.d + m10.y;
            i10 = m10.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        xnVar.ab(q82, this.b, this.c, view, f12, f7, p0Var, false, (p0Var == null && p0Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ void o() {
    }

    @Override // org.telegram.ui.Components.fk0
    public final /* synthetic */ void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
