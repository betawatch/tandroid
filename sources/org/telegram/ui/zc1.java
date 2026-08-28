package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zc1 implements org.telegram.ui.Components.tj0 {
    public final /* synthetic */ qn a;
    public final /* synthetic */ MessageObject b;
    public final /* synthetic */ org.telegram.ui.Components.uj0 c;
    public final /* synthetic */ dd1 d;

    public zc1(dd1 dd1Var, qn qnVar, MessageObject messageObject, org.telegram.ui.Components.uj0 uj0Var) {
        this.d = dd1Var;
        this.a = qnVar;
        this.b = messageObject;
        this.c = uj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    @Override // org.telegram.ui.Components.tj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        float f10;
        hg.s0 s0Var;
        hg.p0 l10;
        float f11;
        int i9;
        float f12;
        int id2 = this.b.getId();
        qn qnVar = this.a;
        org.telegram.ui.Cells.a0 q82 = qnVar.q8(id2, true);
        float f13 = 0.0f;
        if (q82 instanceof org.telegram.ui.Cells.t1) {
            hg.s0 s0Var2 = ((org.telegram.ui.Cells.t1) q82).J;
            hg.p0 l11 = s0Var2.l(r0Var);
            if (l11 == null) {
                f12 = 0.0f;
                f10 = f12;
                qnVar.ab(q82, this.b, this.c, view, f13, f10, r0Var, false, (r0Var == null && r0Var.a) ? true : z10, z11, false);
                this.d.c(false);
            }
            f13 = s0Var2.c + l11.x + (l11.A / 2.0f);
            f11 = s0Var2.d + l11.y;
            i9 = l11.B;
        } else if (!(q82 instanceof org.telegram.ui.Cells.w0) || (l10 = (s0Var = ((org.telegram.ui.Cells.w0) q82).y0).l(r0Var)) == null) {
            f10 = 0.0f;
            qnVar.ab(q82, this.b, this.c, view, f13, f10, r0Var, false, (r0Var == null && r0Var.a) ? true : z10, z11, false);
            this.d.c(false);
        } else {
            f13 = s0Var.c + l10.x + (l10.A / 2.0f);
            f11 = s0Var.d + l10.y;
            i9 = l10.B;
        }
        f12 = f11 + (i9 / 2.0f);
        f10 = f12;
        qnVar.ab(q82, this.b, this.c, view, f13, f10, r0Var, false, (r0Var == null && r0Var.a) ? true : z10, z11, false);
        this.d.c(false);
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.tj0
    public final /* synthetic */ void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
