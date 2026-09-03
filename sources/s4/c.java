package s4;

import android.net.Uri;
import h5.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c implements n4.a {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final b6.h i;
    public final t j;
    public final Uri k;
    public final i l;
    public final List m;

    public c(long j10, long j11, long j12, boolean z4, long j13, long j14, long j15, long j16, i iVar, b6.h hVar, t tVar, Uri uri, ArrayList arrayList) {
        this.a = j10;
        this.b = j11;
        this.c = j12;
        this.d = z4;
        this.e = j13;
        this.f = j14;
        this.g = j15;
        this.h = j16;
        this.l = iVar;
        this.i = hVar;
        this.k = uri;
        this.j = tVar;
        this.m = arrayList;
    }

    @Override // n4.a
    public final Object a(List list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new n4.b(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= this.m.size()) {
                break;
            }
            if (((n4.b) linkedList.peek()).a != i10) {
                long c3 = c(i10);
                if (c3 != -9223372036854775807L) {
                    j11 += c3;
                }
            } else {
                h b10 = b(i10);
                List list2 = b10.c;
                n4.b bVar = (n4.b) linkedList.poll();
                int i11 = bVar.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = bVar.b;
                    a aVar = (a) list2.get(i12);
                    List list3 = aVar.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m) list3.get(bVar.c));
                        bVar = (n4.b) linkedList.poll();
                        if (bVar.a != i11) {
                            break;
                        }
                    } while (bVar.b == i12);
                    j10 = j11;
                    arrayList2.add(new a(aVar.a, aVar.b, arrayList3, aVar.d, aVar.e, aVar.f));
                    if (bVar.a != i11) {
                        break;
                    }
                    j11 = j10;
                }
                linkedList.addFirst(bVar);
                arrayList.add(new h(b10.a, b10.b - j10, arrayList2, b10.d));
                j11 = j10;
            }
            i10++;
        }
        long j12 = j11;
        long j13 = this.b;
        return new c(this.a, j13 != -9223372036854775807L ? j13 - j12 : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final h b(int i10) {
        return (h) this.m.get(i10);
    }

    public final long c(int i10) {
        List list = this.m;
        if (i10 != list.size() - 1) {
            return ((h) list.get(i10 + 1)).b - ((h) list.get(i10)).b;
        }
        long j10 = this.b;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - ((h) list.get(i10)).b;
    }

    public final long d(int i10) {
        return d0.G(c(i10));
    }
}
