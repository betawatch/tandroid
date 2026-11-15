package qi;

import ai.y0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.a8;
import org.telegram.ui.web.e1;
import p4.q0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class p implements AutoCloseable {
    public final q0 b;
    public final q0 c;
    public long r;
    public boolean s;
    public a w;
    public Throwable x;
    public volatile Set y;
    public final Object a = new Object();
    public final LinkedHashMap h = new LinkedHashMap(16, 0.75f, true);
    public final HashMap n = new HashMap();
    public final int e = 256;
    public final long f = 8388608;
    public final ExecutorService d = Executors.newSingleThreadExecutor(new y0(8));

    public p(q0 q0Var, q0 q0Var2) {
        this.b = q0Var;
        this.c = q0Var2;
    }

    public static String b(String str) {
        String lowerCase;
        if (str == null) {
            return "";
        }
        lowerCase = str.trim().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase) {
            case "c#":
                return "csharp";
            case "fc":
                return "func";
            case "c++":
                return "cpp";
            case "fif":
                return "fift";
            case "tl-b":
                return "tlb";
            default:
                return lowerCase;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        synchronized (this.a) {
            try {
                if (this.s) {
                    return false;
                }
                if (this.w != null) {
                    return true;
                }
                if (this.x == null) {
                    try {
                        try {
                            this.b.getClass();
                            a b10 = q0.b();
                            try {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                Collections.addAll(linkedHashSet, b10.a.a());
                                if (linkedHashSet.contains("func")) {
                                    linkedHashSet.add("fc");
                                }
                                if (linkedHashSet.contains("fift")) {
                                    linkedHashSet.add("fif");
                                }
                                if (linkedHashSet.contains("tlb")) {
                                    linkedHashSet.add("tl-b");
                                }
                                this.y = DesugarCollections.unmodifiableSet(linkedHashSet);
                                this.w = b10;
                                return true;
                            } catch (Error e10) {
                                e = e10;
                                b10.close();
                                throw e;
                            } catch (RuntimeException e11) {
                                e = e11;
                                b10.close();
                                throw e;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            this.x = e;
                            if (this.c != null) {
                                try {
                                    a8.g(e, true);
                                } catch (LinkageError | RuntimeException unused) {
                                }
                            }
                            return false;
                        }
                    } catch (LinkageError e13) {
                        e = e13;
                        this.x = e;
                        if (this.c != null) {
                        }
                        return false;
                    } catch (OutOfMemoryError e14) {
                        e = e14;
                        this.x = e;
                        if (this.c != null) {
                        }
                        return false;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public final void c(n nVar, ji.j jVar) {
        l lVar = new l(nVar, jVar);
        int i7 = this.e;
        if (i7 == 0) {
            return;
        }
        long j3 = lVar.b;
        long j10 = this.f;
        if (j3 > j10) {
            return;
        }
        LinkedHashMap linkedHashMap = this.h;
        linkedHashMap.put(nVar, lVar);
        this.r += j3;
        while (true) {
            if (linkedHashMap.size() <= i7 && this.r <= j10) {
                return;
            }
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            this.r -= ((l) entry.getValue()).b;
            linkedHashMap.remove(entry.getKey());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (this.s) {
                    return;
                }
                this.s = true;
                for (ArrayList arrayList : this.n.values()) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((o) obj).a = null;
                    }
                }
                this.n.clear();
                this.h.clear();
                this.r = 0L;
                this.d.execute(new k(this, 0));
                this.d.shutdown();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final o d(String str, String str2, m mVar) {
        if (str == null) {
            throw null;
        }
        n nVar = new n(str, b(str2));
        o oVar = new o();
        oVar.a = mVar;
        synchronized (this.a) {
            try {
                if (this.s) {
                    throw new IllegalStateException("Service is closed");
                }
                ArrayList arrayList = (ArrayList) this.n.get(nVar);
                if (arrayList != null) {
                    arrayList.add(oVar);
                    return oVar;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(oVar);
                this.n.put(nVar, arrayList2);
                this.d.execute(new e1(12, this, nVar));
                return oVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
