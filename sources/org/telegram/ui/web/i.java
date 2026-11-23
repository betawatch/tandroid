package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class i implements gs {
    public final int b;
    public final Runnable c;
    public final String d;
    public boolean f;
    public boolean h;
    public boolean n;
    public final ArrayList a = new ArrayList();
    public final int e = ConnectionsManager.generateClassGuid();

    public i(String str, int i7, Runnable runnable) {
        this.b = i7;
        this.d = str;
        this.c = runnable;
    }

    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        int i7 = this.b;
        ls.f(i7).c(this, ls.V);
        ls.f(i7).c(this, ls.H1);
        if (TextUtils.isEmpty(this.d)) {
            d();
        }
    }

    public final void b(ArrayList arrayList) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.a;
            if (i7 >= arrayList2.size()) {
                return;
            }
            if (arrayList.contains(Integer.valueOf(((gj) arrayList2.get(i7)).e1()))) {
                arrayList2.remove(i7);
                i7--;
            }
            i7++;
        }
    }

    public final void c() {
        if (this.h) {
            this.h = false;
            int i7 = this.b;
            ls.f(i7).n(this, ls.V);
            ls.f(i7).n(this, ls.H1);
            ConnectionsManager.getInstance(i7).cancelRequestsForGuid(this.e);
            this.n = false;
        }
    }

    public final void d() {
        ArrayList arrayList;
        if (this.n || this.f) {
            return;
        }
        this.n = true;
        int i7 = this.b;
        long e10 = k10.i(i7).e();
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        while (true) {
            arrayList = this.a;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 = Math.min(i11, ((gj) arrayList.get(i10)).e1());
            i10++;
        }
        si d02 = si.d0(i7);
        int i12 = arrayList.isEmpty() ? 30 : 50;
        if (i11 == Integer.MAX_VALUE) {
            i11 = 0;
        }
        d02.Q0(e10, i12, i11, 0, 3, 0L, 1, this.e, 0, null, this.d);
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ls.V;
        ArrayList arrayList = this.a;
        if (i7 != i11) {
            if (i7 == ls.H1) {
                arrayList.add(0, (gj) objArr[0]);
            }
        } else if (((Integer) objArr[3]).intValue() == this.e) {
            this.n = false;
            ArrayList arrayList2 = (ArrayList) objArr[2];
            this.f = ((Boolean) objArr[5]).booleanValue();
            arrayList.addAll(arrayList2);
            this.c.run();
        }
    }
}
