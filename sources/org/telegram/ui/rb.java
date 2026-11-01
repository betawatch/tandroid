package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class rb extends w7.d6 {
    public org.telegram.messenger.kj a;
    public int b = 0;
    public boolean c = true;
    public int d = 0;
    public int e;
    public final /* synthetic */ sb f;

    public rb(sb sbVar) {
        this.f = sbVar;
    }

    @Override // w7.d6
    public final void a() {
        org.telegram.messenger.kj kjVar = this.a;
        sb sbVar = this.f;
        if (kjVar != null) {
            int indexOf = sbVar.o0.indexOf(kjVar) + sbVar.E.f;
            if (indexOf >= 0) {
                sbVar.y.i1(indexOf, this.e, false);
            }
        } else {
            sbVar.y.i1(this.b, this.d, this.c);
        }
        this.a = null;
        sbVar.V = true;
        sbVar.i1();
        org.telegram.messenger.i0.g3(new qr0(this, 21));
    }

    @Override // w7.d6
    public final void c() {
        sb sbVar = this.f;
        sbVar.K0 = sbVar.getNotificationCenter().q(sb.R0, sbVar.K0, true);
    }

    @Override // w7.d6
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.q1) {
            this.f.h.add((org.telegram.ui.Cells.q1) view);
        }
    }
}
