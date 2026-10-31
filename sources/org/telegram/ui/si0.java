package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class si0 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ri0 f;
    public final zf.m1 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public si0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        zf.m1 m1Var = new zf.m1(true);
        this.h = m1Var;
        m1Var.a = new tt(this, 25);
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int e = sc.e.e(1, i10, this.d);
        zf.m1 m1Var = this.h;
        ArrayList arrayList = m1Var.e;
        if (e < 0 || e >= arrayList.size()) {
            return null;
        }
        return m1Var.e.get(e);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        if (str != null) {
            org.telegram.messenger.r5 r5Var = Utilities.g;
            ri0 ri0Var = new ri0(this, str, 0);
            this.f = ri0Var;
            r5Var.d(ri0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        zf.m1 m1Var = this.h;
        int i10 = this.n.s;
        m1Var.g(null, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
        f();
    }

    @Override // s4.g0
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.L0(2131754376, "AddToExceptions"));
            return;
        }
        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
        if (i10 < this.d.size()) {
            paVar.f((ui0) this.d.get(i10), (CharSequence) this.e.get(i10), i10 != this.d.size() - 1);
            paVar.setAddButtonVisible(false);
        } else {
            int e = sc.e.e(1, i10, this.d);
            ArrayList arrayList = this.h.e;
            paVar.d((TLObject) arrayList.get(e), null, org.telegram.messenger.cd.L0(2131747908, "NotificationsOn"), e != arrayList.size() - 1);
            paVar.setAddButtonVisible(true);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View paVar;
        if (i10 != 0) {
            paVar = new org.telegram.ui.Cells.z3(this.c, null);
            paVar.setBackgroundColor(0);
            paVar.setTag(-33024);
        } else {
            paVar = new org.telegram.ui.Cells.pa(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.ck0(paVar);
    }
}
