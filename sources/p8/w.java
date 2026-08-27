package p8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class w {
    public Object[] a;
    public int b;
    public boolean c;

    public w() {
        l.a(4, "initialCapacity");
        this.a = new Object[4];
        this.b = 0;
    }

    public static int d(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            i12 = Integer.highestOneBit(i11 - 1) << 1;
        }
        return i12 < 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : i12;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(this.b + 1);
        Object[] objArr = this.a;
        int i10 = this.b;
        this.b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void b(List list) {
        if (list instanceof Collection) {
            List list2 = list;
            e(list2.size() + this.b);
            if (list2 instanceof u) {
                this.b = ((u) list2).n(this.b, this.a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final l0 c() {
        this.c = true;
        return z.s(this.b, this.a);
    }

    public final void e(int i10) {
        Object[] objArr = this.a;
        if (objArr.length < i10) {
            this.a = Arrays.copyOf(objArr, d(objArr.length, i10));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }
}
