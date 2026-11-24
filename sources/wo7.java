// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.NotificationsCustomSettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wo7 extends q59 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public vo7 f;
    public final bu9 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public wo7(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        bu9 bu9Var = new bu9(true);
        this.h = bu9Var;
        bu9Var.a = new cj6(this, (byte) 17);
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    public final Object E(int i) {
        ArrayList arrayList = this.h.e;
        if (i >= 0 && i < this.d.size()) {
            return this.d.get(i);
        }
        int k = ts2.k(1, i, this.d);
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
            mp3 mp3Var = Utilities.g;
            vo7 vo7Var = new vo7(this, str, b);
            this.f = vo7Var;
            mp3Var.d(vo7Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        bu9 bu9Var = this.h;
        int i = this.n.s;
        bu9Var.g(null, true, (i == 1 || i == 3) ? false : true, true, false, 0L, false, 0, 0);
        f();
    }

    @Override // y59
    public final int b() {
        int size = this.d.size();
        ArrayList arrayList = this.h.e;
        return !arrayList.isEmpty() ? arrayList.size() + 1 + size : size;
    }

    @Override // y59
    public final int d(int i) {
        return i == this.d.size() ? 1 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0) {
            if (i2 != 1) {
                return;
            }
            ((l55) view).setText(jb6.M0(2131754373, "AddToExceptions"));
            return;
        }
        w8c w8cVar = (w8c) view;
        int size = this.d.size();
        ArrayList arrayList = this.d;
        if (i < size) {
            w8cVar.f((zo7) arrayList.get(i), (CharSequence) this.e.get(i), i != this.d.size() - 1);
            w8cVar.setAddButtonVisible(false);
        } else {
            int k = ts2.k(1, i, arrayList);
            ArrayList arrayList2 = this.h.e;
            w8cVar.d((TLObject) arrayList2.get(k), null, jb6.M0(2131747625, "NotificationsOn"), k != arrayList2.size() - 1);
            w8cVar.setAddButtonVisible(true);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View w8cVar;
        if (i != 0) {
            w8cVar = new l55(this.c, null);
            w8cVar.setBackgroundColor(0);
            w8cVar.setTag(-33024);
        } else {
            w8cVar = new w8c(4, 0, null, this.c, false, true);
        }
        return new b59(w8cVar);
    }
}
