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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class tk0 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public sk0 f;
    public final gg.c2 h;
    public final /* synthetic */ NotificationsCustomSettingsActivity n;

    public tk0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
        this.n = notificationsCustomSettingsActivity;
        this.c = context;
        gg.c2 c2Var = new gg.c2(true);
        this.h = c2Var;
        c2Var.a = new fu(this, 26);
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    public final Object E(int i10) {
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
        gg.c2 c2Var = this.h;
        ArrayList arrayList = c2Var.e;
        if (f7 < 0 || f7 >= arrayList.size()) {
            return null;
        }
        return c2Var.e.get(f7);
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
        gg.c2 c2Var = this.h;
        int i10 = this.n.s;
        c2Var.g(null, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
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
            ((org.telegram.ui.Cells.w3) view).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
            return;
        }
        org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
        if (i10 < this.d.size()) {
            abVar.g((wk0) this.d.get(i10), (CharSequence) this.e.get(i10), i10 != this.d.size() - 1);
            abVar.setAddButtonVisible(false);
        } else {
            int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.d);
            ArrayList arrayList = this.h.e;
            abVar.d((TLObject) arrayList.get(f7), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), f7 != arrayList.size() - 1);
            abVar.setAddButtonVisible(true);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View abVar;
        if (i10 != 0) {
            abVar = new org.telegram.ui.Cells.w3(this.c, null);
            abVar.setBackgroundColor(0);
            abVar.setTag(-33024);
        } else {
            abVar = new org.telegram.ui.Cells.ab(4, 0, this.c, null, false, true);
        }
        return new org.telegram.ui.Components.fl0(abVar);
    }
}
