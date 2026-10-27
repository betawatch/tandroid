package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class uv0 implements org.telegram.ui.Components.fl0 {
    public final /* synthetic */ wn a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.gl0 c;
    public final /* synthetic */ zv0 d;

    public uv0(zv0 zv0Var, wn wnVar, MessageObject messageObject, org.telegram.ui.Components.gl0 gl0Var) {
        this.d = zv0Var;
        this.a = wnVar;
        this.b = messageObject;
        this.c = gl0Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ boolean o() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.fl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        float f7;
        bh.y0 y0Var;
        bh.v0 l4;
        float f10;
        int i10;
        float f11;
        int id2 = this.b.getId();
        wn wnVar = this.a;
        org.telegram.ui.Cells.z A8 = wnVar.A8(id2, true);
        float f12 = 0.0f;
        if (A8 instanceof org.telegram.ui.Cells.s1) {
            bh.y0 y0Var2 = ((org.telegram.ui.Cells.s1) A8).N;
            bh.v0 l10 = y0Var2.l(x0Var);
            if (l10 == null) {
                f11 = 0.0f;
                f7 = f11;
                wnVar.nb(A8, this.b, this.c, view, f12, f7, x0Var, false, (x0Var == null && x0Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f12 = y0Var2.c + l10.x + (l10.A / 2.0f);
            f10 = y0Var2.d + l10.y;
            i10 = l10.B;
        } else if (!(A8 instanceof org.telegram.ui.Cells.v0) || (l4 = (y0Var = ((org.telegram.ui.Cells.v0) A8).E0).l(x0Var)) == null) {
            f7 = 0.0f;
            wnVar.nb(A8, this.b, this.c, view, f12, f7, x0Var, false, (x0Var == null && x0Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f12 = y0Var.c + l4.x + (l4.A / 2.0f);
            f10 = y0Var.d + l4.y;
            i10 = l4.B;
        }
        f11 = f10 + (i10 / 2.0f);
        f7 = f11;
        wnVar.nb(A8, this.b, this.c, view, f12, f7, x0Var, false, (x0Var == null && x0Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.fl0
    public final /* synthetic */ void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
