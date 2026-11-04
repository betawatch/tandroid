package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class j implements cs {
    public final int b;
    public final Runnable c;
    public final String d;
    public boolean f;
    public boolean h;
    public boolean n;
    public final ArrayList a = new ArrayList();
    public final int e = ConnectionsManager.generateClassGuid();

    public j(String str, int i3, Runnable runnable) {
        this.b = i3;
        this.d = str;
        this.c = runnable;
    }

    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        int i3 = this.b;
        hs.f(i3).c(this, hs.V);
        hs.f(i3).c(this, hs.H1);
        if (TextUtils.isEmpty(this.d)) {
            d();
        }
    }

    public final void b(ArrayList arrayList) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.a;
            if (i3 >= arrayList2.size()) {
                return;
            }
            if (arrayList.contains(Integer.valueOf(((zi) arrayList2.get(i3)).f1()))) {
                arrayList2.remove(i3);
                i3--;
            }
            i3++;
        }
    }

    public final void c() {
        if (this.h) {
            this.h = false;
            int i3 = this.b;
            hs.f(i3).n(this, hs.V);
            hs.f(i3).n(this, hs.H1);
            ConnectionsManager.getInstance(i3).cancelRequestsForGuid(this.e);
            this.n = false;
        }
    }

    public final void d() {
        ArrayList arrayList;
        if (this.n || this.f) {
            return;
        }
        this.n = true;
        int i3 = this.b;
        long e10 = h10.i(i3).e();
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        while (true) {
            arrayList = this.a;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 = Math.min(i11, ((zi) arrayList.get(i10)).f1());
            i10++;
        }
        li b02 = li.b0(i3);
        int i12 = arrayList.isEmpty() ? 30 : 50;
        if (i11 == Integer.MAX_VALUE) {
            i11 = 0;
        }
        b02.N0(e10, i12, i11, 0, 3, 0L, 1, this.e, 0, null, this.d);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.V;
        ArrayList arrayList = this.a;
        if (i3 != i11) {
            if (i3 == hs.H1) {
                arrayList.add(0, (zi) objArr[0]);
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
