// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wga extends q59 {
    public final Context c;
    public final int d;
    public final ylb e;
    public final uga f;
    public final ArrayList h = new ArrayList(10);
    public final ArrayList n = new ArrayList();
    public sea r;
    public final /* synthetic */ nha s;

    public wga(nha nhaVar, Context context, int i, ylb ylbVar) {
        this.s = nhaVar;
        this.c = context;
        this.d = i;
        this.e = ylbVar;
        this.f = new uga(this, i, ylbVar);
        E();
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    public final void E() {
        ArrayList arrayList = this.n;
        arrayList.clear();
        ArrayList c = this.s.w1[8].c();
        int i = 0;
        for (int i2 = 0; i2 < c.size(); i2++) {
            k47 k47Var = (k47) c.get(i2);
            if (k47Var.X != i) {
                int i3 = k47Var.k.date;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                long j = i3;
                tL_message.message = jb6.u(j, false);
                tL_message.id = 0;
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j * 1000);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                k47 k47Var2 = new k47(this.d, tL_message, false, false);
                k47Var2.D = 10;
                k47Var2.U = 1;
                k47Var2.l0 = true;
                arrayList.add(k47Var2);
                i = k47Var.X;
            }
            arrayList.add(k47Var);
        }
    }

    @Override // y59
    public final int b() {
        return this.n.size();
    }

    @Override // y59
    public final int d(int i) {
        if (i < 0) {
            return 0;
        }
        ArrayList arrayList = this.n;
        if (i < arrayList.size()) {
            return ((k47) arrayList.get(i)).U;
        }
        return 0;
    }

    @Override // y59
    public final void f() {
        E();
        super.f();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        if (i >= 0) {
            ArrayList arrayList = this.n;
            if (i < arrayList.size()) {
                k47 k47Var = (k47) arrayList.get(i);
                int i2 = u69Var.f;
                View view = u69Var.a;
                if (i2 == 0) {
                    ((rc2) view).z3(k47Var, null, false, false, false, false);
                } else {
                    ((cm1) view).setMessageObject(k47Var);
                }
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new b59(new cm1(this.e, this.c, false));
        }
        ylb ylbVar = this.e;
        vga vgaVar = new vga(this.c, this.d, false, null, ylbVar);
        vgaVar.setDelegate(this.f);
        return new b59(vgaVar);
    }
}
