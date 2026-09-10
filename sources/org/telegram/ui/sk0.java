package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class sk0 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public rk0 f;
    public final fg.d2 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public sk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        fg.d2 d2Var = new fg.d2(true);
        this.h = d2Var;
        d2Var.a = new iu(this, 25);
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int e = com.google.android.gms.internal.vision.e2.e(1, i10, this.d);
        fg.d2 d2Var = this.h;
        ArrayList arrayList = d2Var.e;
        if (e < 0 || e >= arrayList.size()) {
            return null;
        }
        return d2Var.e.get(e);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            rk0 rk0Var = new rk0(this, str, 0);
            this.f = rk0Var;
            dispatchQueue.postRunnable(rk0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        fg.d2 d2Var = this.h;
        int i10 = this.n.s;
        d2Var.g(null, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
        l();
    }

    @Override // s4.h0
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
        if (i10 < this.d.size()) {
            bbVar.g((vk0) this.d.get(i10), (CharSequence) this.e.get(i10), i10 != this.d.size() - 1);
            bbVar.setAddButtonVisible(false);
        } else {
            int e = com.google.android.gms.internal.vision.e2.e(1, i10, this.d);
            ArrayList arrayList = this.h.e;
            bbVar.d((TLObject) arrayList.get(e), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), e != arrayList.size() - 1);
            bbVar.setAddButtonVisible(true);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View bbVar;
        if (i10 != 0) {
            bbVar = new org.telegram.ui.Cells.u3(this.c, null);
            bbVar.setBackgroundColor(0);
            bbVar.setTag(-33024);
        } else {
            bbVar = new org.telegram.ui.Cells.bb(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.fl0(bbVar);
    }
}
