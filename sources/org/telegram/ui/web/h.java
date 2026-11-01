package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class h implements vs {
    public final int b;
    public final Runnable c;
    public final String d;
    public boolean f;
    public boolean h;
    public boolean n;
    public final ArrayList a = new ArrayList();
    public final int e = ConnectionsManager.generateClassGuid();

    public h(String str, int i10, Runnable runnable) {
        this.b = i10;
        this.d = str;
        this.c = runnable;
    }

    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        int i10 = this.b;
        at.f(i10).c(this, at.V);
        at.f(i10).c(this, at.H1);
        if (TextUtils.isEmpty(this.d)) {
            d();
        }
    }

    public final void b(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.a;
            if (i10 >= arrayList2.size()) {
                return;
            }
            if (arrayList.contains(Integer.valueOf(((kj) arrayList2.get(i10)).f1()))) {
                arrayList2.remove(i10);
                i10--;
            }
            i10++;
        }
    }

    public final void c() {
        if (this.h) {
            this.h = false;
            int i10 = this.b;
            at.f(i10).n(this, at.V);
            at.f(i10).n(this, at.H1);
            ConnectionsManager.getInstance(i10).cancelRequestsForGuid(this.e);
            this.n = false;
        }
    }

    public final void d() {
        ArrayList arrayList;
        if (this.n || this.f) {
            return;
        }
        this.n = true;
        int i10 = this.b;
        long e = e20.i(i10).e();
        int i11 = 0;
        int i12 = Integer.MAX_VALUE;
        while (true) {
            arrayList = this.a;
            if (i11 >= arrayList.size()) {
                break;
            }
            i12 = Math.min(i12, ((kj) arrayList.get(i11)).f1());
            i11++;
        }
        vi b02 = vi.b0(i10);
        int i13 = arrayList.isEmpty() ? 30 : 50;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        b02.N0(e, i13, i12, 0, 3, 0L, 1, this.e, 0, null, this.d);
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = at.V;
        ArrayList arrayList = this.a;
        if (i10 != i12) {
            if (i10 == at.H1) {
                arrayList.add(0, (kj) objArr[0]);
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
