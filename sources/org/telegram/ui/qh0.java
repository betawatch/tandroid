package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class qh0 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public ph0 f;
    public final jg.z1 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public qh0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.a = new zr(this, 25);
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final Object E(int i7) {
        if (i7 >= 0 && i7 < this.d.size()) {
            return this.d.get(i7);
        }
        int f10 = i5.c.f(1, i7, this.d);
        jg.z1 z1Var = this.h;
        ArrayList arrayList = z1Var.e;
        if (f10 < 0 || f10 >= arrayList.size()) {
            return null;
        }
        return z1Var.e.get(f10);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        if (str != null) {
            org.telegram.messenger.q5 q5Var = Utilities.g;
            ph0 ph0Var = new ph0(this, str, 0);
            this.f = ph0Var;
            q5Var.d(ph0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        jg.z1 z1Var = this.h;
        int i7 = this.n.s;
        z1Var.g(null, true, (i7 == 1 || i7 == 3) ? false : true, true, false, 0L, false, 0, 0);
        f();
    }

    @Override // v4.i0
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // v4.i0
    public final int d(int i7) {
        return i7 == this.d.size() ? 1 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.y3) view).setText(org.telegram.messenger.gd.N0(2131754373, "AddToExceptions"));
            return;
        }
        org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
        if (i7 < this.d.size()) {
            saVar.f((sh0) this.d.get(i7), (CharSequence) this.e.get(i7), i7 != this.d.size() - 1);
            saVar.setAddButtonVisible(false);
        } else {
            int f10 = i5.c.f(1, i7, this.d);
            ArrayList arrayList = this.h.e;
            saVar.d((TLObject) arrayList.get(f10), null, org.telegram.messenger.gd.N0(2131747698, "NotificationsOn"), f10 != arrayList.size() - 1);
            saVar.setAddButtonVisible(true);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View saVar;
        if (i7 != 0) {
            saVar = new org.telegram.ui.Cells.y3(this.c, null);
            saVar.setBackgroundColor(0);
            saVar.setTag(-33024);
        } else {
            saVar = new org.telegram.ui.Cells.sa(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.mj0(saVar);
    }
}
