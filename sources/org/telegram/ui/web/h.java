package org.telegram.ui.web;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class h implements ls {
    public final int b;
    public final Runnable c;
    public final String d;
    public boolean f;
    public boolean h;
    public boolean n;
    public final ArrayList a = new ArrayList();
    public final int e = ConnectionsManager.generateClassGuid();

    public h(String str, int i7, Runnable runnable) {
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
        qs.f(i7).c(this, qs.V);
        qs.f(i7).c(this, qs.H1);
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
            if (arrayList.contains(Integer.valueOf(((ij) arrayList2.get(i7)).e1()))) {
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
            qs.f(i7).n(this, qs.V);
            qs.f(i7).n(this, qs.H1);
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
        long e10 = p10.i(i7).e();
        int i10 = 0;
        int i11 = Integer.MAX_VALUE;
        while (true) {
            arrayList = this.a;
            if (i10 >= arrayList.size()) {
                break;
            }
            i11 = Math.min(i11, ((ij) arrayList.get(i10)).e1());
            i10++;
        }
        ui b02 = ui.b0(i7);
        int i12 = arrayList.isEmpty() ? 30 : 50;
        if (i11 == Integer.MAX_VALUE) {
            i11 = 0;
        }
        b02.N0(e10, i12, i11, 0, 3, 0L, 1, this.e, 0, null, this.d);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.V;
        ArrayList arrayList = this.a;
        if (i7 != i11) {
            if (i7 == qs.H1) {
                arrayList.add(0, (ij) objArr[0]);
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
