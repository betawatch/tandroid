package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rb extends w7.d6 {
    public org.telegram.messenger.jj a;
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
        org.telegram.messenger.jj jjVar = this.a;
        sb sbVar = this.f;
        if (jjVar != null) {
            int indexOf = sbVar.o0.indexOf(jjVar) + sbVar.E.f;
            if (indexOf >= 0) {
                sbVar.y.i1(indexOf, this.e, false);
            }
        } else {
            sbVar.y.i1(this.b, this.d, this.c);
        }
        this.a = null;
        sbVar.V = true;
        sbVar.h1();
        org.telegram.messenger.i0.g3(new rr0(this, 21));
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
