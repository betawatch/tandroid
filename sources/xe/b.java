package xe;

import c8.td;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b implements Iterable {
    public final boolean a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public final Semaphore f;
    public b h;
    public a n;

    public b() {
        this(false, true);
    }

    public final boolean add(Object obj) {
        synchronized (this.b) {
            try {
                boolean z9 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (!this.e) {
                    this.b.add(new WeakReference(obj));
                    return true;
                }
                ArrayList arrayList = this.d;
                boolean z10 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Reference reference = (Reference) arrayList.get(size);
                    Object obj2 = reference != null ? reference.get() : null;
                    if (obj2 == null) {
                        arrayList.remove(size);
                    } else if (obj2 == obj) {
                        z10 = true;
                    }
                }
                if (!z10) {
                    arrayList.add(new WeakReference(obj));
                    z9 = true;
                }
                td.a(this.c, obj);
                return z9;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void clear() {
        synchronized (this.b) {
            try {
                if (this.e) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        Reference reference = (Reference) obj;
                        if (!this.c.contains(reference)) {
                            this.c.add(reference);
                        }
                        td.a(this.d, reference.get());
                    }
                } else {
                    this.b.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        ArrayList arrayList = this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((Reference) arrayList.get(size)).get() == obj) {
                return size;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        synchronized (this.b) {
            try {
                if (this.e) {
                    return this.b.isEmpty() && this.d.isEmpty();
                }
                ArrayList arrayList = this.b;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 2; size >= 0; size--) {
                        if (((Reference) arrayList.get(size)).get() == null) {
                            arrayList.remove(size);
                        }
                    }
                }
                return this.b.isEmpty();
            } finally {
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Semaphore semaphore = this.f;
        if (semaphore != null) {
            semaphore.acquireUninterruptibly();
        }
        synchronized (this.b) {
            try {
                if (!this.a) {
                    if (this.b.isEmpty()) {
                        return Collections.emptyIterator();
                    }
                    return new a(this);
                }
                if (this.e) {
                    throw new IllegalStateException();
                }
                this.e = true;
                a aVar = this.n;
                if (aVar == null) {
                    this.n = new a(this);
                } else {
                    aVar.a = this.b.size();
                    this.n.b = null;
                }
                return this.n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean remove(Object obj) {
        synchronized (this.b) {
            try {
                int indexOf = indexOf(obj);
                if (indexOf == -1) {
                    return false;
                }
                if (this.e) {
                    Reference reference = (Reference) this.b.get(indexOf);
                    if (!this.c.contains(reference)) {
                        this.c.add(reference);
                    }
                    td.a(this.d, reference.get());
                } else {
                    this.b.remove(indexOf);
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(boolean z9, boolean z10) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = z9 ? new Semaphore(1) : null;
        this.a = z10;
        this.b = new ArrayList();
    }
}
