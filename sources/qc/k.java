package qc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import ne.s;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k implements qe.a {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public k(char c3) {
        this.a = c3;
    }

    @Override // qe.a
    public final void a(s sVar, s sVar2, int i10) {
        qe.a aVar;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (qe.a) linkedList.getFirst();
                break;
            } else {
                aVar = (qe.a) it.next();
                if (aVar.d() <= i10) {
                    break;
                }
            }
        }
        aVar.a(sVar, sVar2, i10);
    }

    @Override // qe.a
    public final char b() {
        return this.a;
    }

    @Override // qe.a
    public final int c(ke.c cVar, ke.c cVar2) {
        qe.a aVar;
        int i10 = cVar.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = (qe.a) linkedList.getFirst();
                break;
            }
            aVar = (qe.a) it.next();
            if (aVar.d() <= i10) {
                break;
            }
        }
        return aVar.c(cVar, cVar2);
    }

    @Override // qe.a
    public final int d() {
        return this.b;
    }

    @Override // qe.a
    public final char e() {
        return this.a;
    }

    public final void f(qe.a aVar) {
        int d = aVar.d();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int d10 = ((qe.a) listIterator.next()).d();
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
