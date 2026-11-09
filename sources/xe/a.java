package xe;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        int i7;
        synchronized (this.c.b) {
            try {
                this.b = null;
                while (true) {
                    if (this.b != null || (i7 = this.a) <= 0) {
                        break;
                    }
                    ArrayList arrayList = this.c.b;
                    int i10 = i7 - 1;
                    this.a = i10;
                    Reference reference = (Reference) arrayList.get(i10);
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
