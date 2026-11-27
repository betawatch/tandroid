// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class sp7 extends c79 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public rp7 f;
    public final sv9 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public sp7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        sv9 sv9Var = new sv9(true);
        this.h = sv9Var;
        sv9Var.a = new bm6(this, (byte) 19);
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    public final Object E(int i) {
        ArrayList arrayList = this.h.e;
        if (i >= 0 && i < this.d.size()) {
            return this.d.get(i);
        }
        int k = bs2.k(1, i, this.d);
        if (k < 0 || k >= arrayList.size()) {
            return null;
        }
        return arrayList.get(k);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.g.a(this.f);
            this.f = null;
        }
        byte b = 0;
        if (str != null) {
            to3 to3Var = Utilities.g;
            rp7 rp7Var = new rp7(this, str, b);
            this.f = rp7Var;
            to3Var.d(rp7Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        sv9 sv9Var = this.h;
        int i = this.n.s;
        sv9Var.g(null, true, (i == 1 || i == 3) ? false : true, true, false, 0L, false, 0, 0);
        f();
    }

    @Override // j79
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // j79
    public final int d(int i) {
        return i == this.d.size() ? 1 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            ((p55) view).setText(ob6.M0(2131754369, "AddToExceptions"));
            return;
        }
        vac vacVar = (vac) view;
        int size = this.d.size();
        ArrayList arrayList = this.d;
        if (i < size) {
            vacVar.f((vp7) arrayList.get(i), (CharSequence) this.e.get(i), i != this.d.size() - 1);
            vacVar.setAddButtonVisible(false);
        } else {
            int k = bs2.k(1, i, arrayList);
            ArrayList arrayList2 = this.h.e;
            vacVar.d((TLObject) arrayList2.get(k), null, ob6.M0(2131747619, "NotificationsOn"), k != arrayList2.size() - 1);
            vacVar.setAddButtonVisible(true);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View vacVar;
        if (i != 0) {
            vacVar = new p55(this.c, null);
            vacVar.setBackgroundColor(0);
            vacVar.setTag(-33024);
        } else {
            vacVar = new vac(4, 0, null, this.c, false, true);
        }
        return new n69(vacVar);
    }
}
