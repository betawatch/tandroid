package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class v70 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ y70 n;

    public v70(y70 y70Var, Context context) {
        this.n = y70Var;
        this.c = context;
    }

    @Override // s4.h0
    public final void A(s4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.t4) {
            ((org.telegram.ui.Cells.t4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f != 2;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            l();
        } else {
            Timer timer2 = new Timer();
            this.f = timer2;
            timer2.schedule(new u70(this, str), 200L, 300L);
        }
    }

    @Override // s4.h0
    public final int h() {
        return this.h ? this.d.size() : this.n.v.size() + 2;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (this.h) {
            return 0;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10 == 1 ? 2 : 0;
    }

    @Override // s4.h0
    public final void l() {
        super.l();
        y70 y70Var = this.n;
        v70 v70Var = y70Var.s;
        if (v70Var == null || y70Var.x) {
            return;
        }
        y70Var.r.setVisibility(v70Var.h() == 2 ? 0 : 4);
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (e1Var.f == 0) {
            org.telegram.ui.Cells.t4 t4Var = (org.telegram.ui.Cells.t4) e1Var.a;
            boolean z10 = this.h;
            y70 y70Var = this.n;
            if (z10) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) y70Var.v.get(i10 - 2);
                charSequence = null;
            }
            t4Var.a(contact, charSequence);
            boolean containsKey = y70Var.y.containsKey(contact.key);
            org.telegram.ui.Components.aq aqVar = t4Var.e;
            if (aqVar != null) {
                aqVar.a(containsKey, false);
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
            int i11 = org.telegram.ui.ActionBar.y6.G6;
            v8Var.g(i11, i11);
            v8Var.u(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            view = v8Var;
        } else {
            view = i10 == 2 ? new org.telegram.ui.Cells.f7(context, (d3) null) : new org.telegram.ui.Cells.t4(context, true);
        }
        return new org.telegram.ui.Components.wl0(view);
    }
}
