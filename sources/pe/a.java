package pe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a implements Iterator {
    public int a;
    public Object b;
    public final /* synthetic */ b c;

    public a(b bVar) {
        this.c = bVar;
        this.a = bVar.b.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        synchronized (this.c.b) {
            try {
                this.b = null;
                while (true) {
                    if (this.b != null || (i10 = this.a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.c.b;
                    int i11 = i10 - 1;
                    this.a = i11;
                    Reference reference = (Reference) arrayList.get(i11);
                    Object obj = reference.get();
                    if (obj != null && !this.c.c.contains(reference)) {
                        this.b = obj;
                        break;
                    }
                }
                if (this.b == null) {
                    b bVar = this.c;
                    if (bVar.a) {
                        ArrayList arrayList2 = bVar.b;
                        ArrayList arrayList3 = bVar.d;
                        ArrayList arrayList4 = bVar.c;
                        if (!bVar.e) {
                            throw new IllegalStateException();
                        }
                        bVar.e = false;
                        if (!arrayList4.isEmpty()) {
                            arrayList2.removeAll(arrayList4);
                            arrayList4.clear();
                        }
                        if (!arrayList3.isEmpty()) {
                            arrayList2.addAll(arrayList3);
                            arrayList3.clear();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.b != null) {
            return true;
        }
        Semaphore semaphore = this.c.f;
        if (semaphore != null) {
            semaphore.release();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
