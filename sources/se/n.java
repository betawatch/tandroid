package se;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import ve.r;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n implements ye.a {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public n(char c10) {
        this.a = c10;
    }

    @Override // ye.a
    public final int a(b bVar, b bVar2) {
        ye.a aVar;
        int i10 = bVar.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (ye.a) linkedList.getFirst();
                break;
            }
            aVar = (ye.a) it.next();
            if (aVar.d() <= i10) {
                break;
            }
        }
        return aVar.a(bVar, bVar2);
    }

    @Override // ye.a
    public final char b() {
        return this.a;
    }

    @Override // ye.a
    public final void c(r rVar, r rVar2, int i10) {
        ye.a aVar;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (ye.a) linkedList.getFirst();
                break;
            } else {
                aVar = (ye.a) it.next();
                if (aVar.d() <= i10) {
                    break;
                }
            }
        }
        aVar.c(rVar, rVar2, i10);
    }

    @Override // ye.a
    public final int d() {
        return this.b;
    }

    @Override // ye.a
    public final char e() {
        return this.a;
    }

    public final void f(ye.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d10 = ((ye.a) listIterator.next()).d();
            if (d > d10) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (d == d10) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + d);
            }
        }
        linkedList.add(aVar);
        this.b = d;
    }
}
