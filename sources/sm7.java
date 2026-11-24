// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class sm7 extends n39 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public rm7 f;
    public final zr9 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public sm7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        zr9 zr9Var = new zr9(true);
        this.h = zr9Var;
        zr9Var.a = new im6(this, (byte) 14);
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    public final Object E(int i) {
        ArrayList arrayList = this.h.e;
        if (i >= 0 && i < this.d.size()) {
            return this.d.get(i);
        }
        int k = ir2.k(1, i, this.d);
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
            co3 co3Var = Utilities.g;
            rm7 rm7Var = new rm7(this, str, b);
            this.f = rm7Var;
            co3Var.d(rm7Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        zr9 zr9Var = this.h;
        int i = this.n.s;
        zr9Var.g(null, true, (i == 1 || i == 3) ? false : true, true, false, 0L, false, 0, 0);
        f();
    }

    @Override // w39
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // w39
    public final int d(int i) {
        return i == this.d.size() ? 1 : 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            ((l35) view).setText(k96.M0(2131754373, "AddToExceptions"));
            return;
        }
        v6c v6cVar = (v6c) view;
        int size = this.d.size();
        ArrayList arrayList = this.d;
        if (i < size) {
            v6cVar.f((vm7) arrayList.get(i), (CharSequence) this.e.get(i), i != this.d.size() - 1);
            v6cVar.setAddButtonVisible(false);
        } else {
            int k = ir2.k(1, i, arrayList);
            ArrayList arrayList2 = this.h.e;
            v6cVar.d((TLObject) arrayList2.get(k), null, k96.M0(2131747699, "NotificationsOn"), k != arrayList2.size() - 1);
            v6cVar.setAddButtonVisible(true);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View v6cVar;
        if (i != 0) {
            v6cVar = new l35(this.c, null);
            v6cVar.setBackgroundColor(0);
            v6cVar.setTag(-33024);
        } else {
            v6cVar = new v6c(4, 0, null, this.c, false, true);
        }
        return new y29(v6cVar);
    }
}
