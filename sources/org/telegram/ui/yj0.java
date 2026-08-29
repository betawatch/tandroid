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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yj0 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public xj0 f;
    public final rf.k1 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public yj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        rf.k1 k1Var = new rf.k1(true);
        this.h = k1Var;
        k1Var.a = new xt(this, 25);
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int e10 = th.e(1, i10, this.d);
        rf.k1 k1Var = this.h;
        ArrayList arrayList = k1Var.e;
        if (e10 < 0 || e10 >= arrayList.size()) {
            return null;
        }
        return k1Var.e.get(e10);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            xj0 xj0Var = new xj0(this, str, 0);
            this.f = xj0Var;
            dispatchQueue.postRunnable(xj0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        rf.k1 k1Var = this.h;
        int i10 = this.n.s;
        k1Var.g(null, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
        l();
    }

    @Override // f2.p0
    public final int h() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return i10 == this.d.size() ? 1 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
        if (i10 < this.d.size()) {
            saVar.g((bk0) this.d.get(i10), (CharSequence) this.e.get(i10), i10 != this.d.size() - 1);
            saVar.setAddButtonVisible(false);
        } else {
            int e10 = th.e(1, i10, this.d);
            ArrayList arrayList = this.h.e;
            saVar.d((TLObject) arrayList.get(e10), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), e10 != arrayList.size() - 1);
            saVar.setAddButtonVisible(true);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View saVar;
        if (i10 != 0) {
            saVar = new org.telegram.ui.Cells.s3(this.c, null);
            saVar.setBackgroundColor(0);
            saVar.setTag(-33024);
        } else {
            saVar = new org.telegram.ui.Cells.sa(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.vk0(saVar);
    }
}
