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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class tk0 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public sk0 f;
    public final hg.b2 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public tk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        hg.b2 b2Var = new hg.b2(true);
        this.h = b2Var;
        b2Var.a = new iu(this, 25);
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
        hg.b2 b2Var = this.h;
        ArrayList arrayList = b2Var.e;
        if (f7 < 0 || f7 >= arrayList.size()) {
            return null;
        }
        return b2Var.e.get(f7);
    }

    public final void F(String str) {
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        if (str != null) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            sk0 sk0Var = new sk0(this, str, 0);
            this.f = sk0Var;
            dispatchQueue.postRunnable(sk0Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.h.f(null, null);
        hg.b2 b2Var = this.h;
        int i10 = this.n.s;
        b2Var.g(null, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
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
        org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
        if (i10 < this.d.size()) {
            zaVar.g((wk0) this.d.get(i10), (CharSequence) this.e.get(i10), i10 != this.d.size() - 1);
            zaVar.setAddButtonVisible(false);
        } else {
            int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
            ArrayList arrayList = this.h.e;
            zaVar.e((TLObject) arrayList.get(f7), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), f7 != arrayList.size() - 1);
            zaVar.setAddButtonVisible(true);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View zaVar;
        if (i10 != 0) {
            zaVar = new org.telegram.ui.Cells.u3(this.c, null);
            zaVar.setBackgroundColor(0);
            zaVar.setTag(-33024);
        } else {
            zaVar = new org.telegram.ui.Cells.za(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.vk0(zaVar);
    }
}
