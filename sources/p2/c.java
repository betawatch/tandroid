package p2;

import android.net.Uri;
import e2.e0;
import e2.f1;
import h2.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.telegram.messenger.m6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c implements w2.a {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final m6 i;
    public final e0 j;
    public final Uri k;
    public final i l;
    public final List m;

    public c(long j3, long j10, long j11, boolean z9, long j12, long j13, long j14, long j15, i iVar, m6 m6Var, e0 e0Var, Uri uri, ArrayList arrayList) {
        this.a = j3;
        this.b = j10;
        this.c = j11;
        this.d = z9;
        this.e = j12;
        this.f = j13;
        this.g = j14;
        this.h = j15;
        this.l = iVar;
        this.i = m6Var;
        this.k = uri;
        this.j = e0Var;
        this.m = arrayList;
    }

    @Override // w2.a
    public final Object a(List list) {
        long j3;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new f1(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= this.m.size()) {
                break;
            }
            if (((f1) linkedList.peek()).a != i7) {
                long c10 = c(i7);
                if (c10 != -9223372036854775807L) {
                    j10 += c10;
                }
            } else {
                h b10 = b(i7);
                List list2 = b10.c;
                f1 f1Var = (f1) linkedList.poll();
                int i10 = f1Var.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i11 = f1Var.b;
                    a aVar = (a) list2.get(i11);
                    List list3 = aVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(f1Var.c));
                        f1Var = (f1) linkedList.poll();
                        if (f1Var.a != i10) {
                            break;
                        }
                    } while (f1Var.b == i11);
                    j3 = j10;
                    arrayList2.add(new a(aVar.a, aVar.b, arrayList3, aVar.d, aVar.e, aVar.f));
                    if (f1Var.a != i10) {
                        break;
                    }
                    j10 = j3;
                }
                linkedList.addFirst(f1Var);
                arrayList.add(new h(b10.a, b10.b - j3, arrayList2, b10.d));
                j10 = j3;
            }
            i7++;
        }
        long j11 = j10;
        long j12 = this.b;
        return new c(this.a, j12 != -9223372036854775807L ? j12 - j11 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final h b(int i7) {
        return (h) this.m.get(i7);
    }

    public final long c(int i7) {
        long j3;
        long j10;
        List list = this.m;
        if (i7 == list.size() - 1) {
            j3 = this.b;
            if (j3 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j10 = ((h) list.get(i7)).b;
        } else {
            j3 = ((h) list.get(i7 + 1)).b;
            j10 = ((h) list.get(i7)).b;
        }
        return j3 - j10;
    }

    public final long d(int i7) {
        return m0.S(c(i7));
    }
}
