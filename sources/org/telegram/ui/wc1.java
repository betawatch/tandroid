package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class wc1 implements org.telegram.ui.Components.bl0 {
    public final /* synthetic */ sn a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.cl0 c;
    public final /* synthetic */ ad1 d;

    public wc1(ad1 ad1Var, sn snVar, MessageObject messageObject, org.telegram.ui.Components.cl0 cl0Var) {
        this.d = ad1Var;
        this.a = snVar;
        this.b = messageObject;
        this.c = cl0Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ boolean k() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.bl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        float f7;
        ah.j1 j1Var;
        ah.g1 l4;
        float f10;
        int i10;
        float f11;
        int id2 = this.b.getId();
        sn snVar = this.a;
        org.telegram.ui.Cells.a0 t82 = snVar.t8(id2, true);
        float f12 = 0.0f;
        if (t82 instanceof org.telegram.ui.Cells.u1) {
            ah.j1 j1Var2 = ((org.telegram.ui.Cells.u1) t82).N;
            ah.g1 l10 = j1Var2.l(i1Var);
            if (l10 == null) {
                f11 = 0.0f;
                f7 = f11;
                snVar.eb(t82, this.b, this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = j1Var2.c + l10.x + (l10.A / 2.0f);
            f10 = j1Var2.d + l10.y;
            i10 = l10.B;
        } else if (!(t82 instanceof org.telegram.ui.Cells.w0) || (l4 = (j1Var = ((org.telegram.ui.Cells.w0) t82).E0).l(i1Var)) == null) {
            f7 = 0.0f;
            snVar.eb(t82, this.b, this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = j1Var.c + l4.x + (l4.A / 2.0f);
            f10 = j1Var.d + l4.y;
            i10 = l4.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        snVar.eb(t82, this.b, this.c, view, f12, f7, i1Var, false, (i1Var == null && i1Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.bl0
    public final /* synthetic */ void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
