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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y70 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ c80 n;

    public y70(c80 c80Var, Context context) {
        this.n = c80Var;
        this.c = context;
    }

    @Override // f2.o0
    public final void A(f2.l1 l1Var) {
        View view = l1Var.a;
        if (view instanceof org.telegram.ui.Cells.p4) {
            ((org.telegram.ui.Cells.p4) view).a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return l1Var.f != 2;
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
            timer2.schedule(new x70(this, str), 200L, 300L);
        }
    }

    @Override // f2.o0
    public final int h() {
        return this.h ? this.d.size() : this.n.w.size() + 2;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (this.h) {
            return 0;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10 == 1 ? 2 : 0;
    }

    @Override // f2.o0
    public final void l() {
        super.l();
        c80 c80Var = this.n;
        y70 y70Var = c80Var.s;
        if (y70Var == null || c80Var.B) {
            return;
        }
        c80Var.r.setVisibility(y70Var.h() == 2 ? 0 : 4);
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        ContactsController.Contact contact;
        CharSequence charSequence;
        if (l1Var.f == 0) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) l1Var.a;
            boolean z4 = this.h;
            c80 c80Var = this.n;
            if (z4) {
                contact = (ContactsController.Contact) this.d.get(i10);
                charSequence = (CharSequence) this.e.get(i10);
            } else {
                contact = (ContactsController.Contact) c80Var.w.get(i10 - 2);
                charSequence = null;
            }
            p4Var.f = contact;
            p4Var.h = charSequence;
            p4Var.a();
            boolean containsKey = c80Var.C.containsKey(contact.key);
            org.telegram.ui.Components.lp lpVar = p4Var.e;
            if (lpVar != null) {
                lpVar.a(containsKey, false);
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 1) {
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(context);
            int i11 = org.telegram.ui.ActionBar.j6.G6;
            o8Var.e(i11, i11);
            o8Var.s(LocaleController.getString(R.string.ShareTelegram2), "", false, R.drawable.msg_shareout, false);
            view = o8Var;
        } else {
            view = i10 == 2 ? new org.telegram.ui.Cells.z6(context, (b) null) : new org.telegram.ui.Cells.p4(context, true);
        }
        return new org.telegram.ui.Components.el0(view);
    }
}
