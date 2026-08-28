package xd;

import g7.g8;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        this(true);
    }

    public final boolean add(Object obj) {
        synchronized (this.b) {
            try {
                boolean z10 = false;
                if (indexOf(obj) != -1) {
                    return false;
                }
                if (!this.e) {
                    this.b.add(new WeakReference(obj));
                    return true;
                }
                ArrayList arrayList = this.d;
                boolean z11 = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Reference reference = (Reference) arrayList.get(size);
                    Object obj2 = reference != null ? reference.get() : null;
                    if (obj2 == null) {
                        arrayList.remove(size);
                    } else if (obj2 == obj) {
                        z11 = true;
                    }
                }
                if (!z11) {
                    arrayList.add(new WeakReference(obj));
                    z10 = true;
                }
                g8.a(this.c, obj);
                return z10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void clear() {
        synchronized (this.b) {
            try {
                if (this.e) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        Reference reference = (Reference) obj;
                        if (!this.c.contains(reference)) {
                            this.c.add(reference);
                        }
                        g8.a(this.d, reference.get());
                    }
                } else {
                    this.b.clear();
                }
            } catch (Throwable th) {
                throw th;
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
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                throw new IllegalStateException();
            }
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
            } catch (Throwable th) {
                throw th;
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
                    g8.a(this.d, reference.get());
                } else {
                    this.b.remove(indexOf);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public b(boolean z10) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f = null;
        this.a = z10;
        this.b = new ArrayList();
    }
}
