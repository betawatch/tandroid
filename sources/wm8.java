// default package

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class wm8 implements AutoCloseable {
    public long e;
    public boolean f;
    public dk2 h;
    public Throwable n;
    public volatile Set r;
    public final Object a = new Object();
    public final LinkedHashMap c = new LinkedHashMap(16, 0.75f, true);
    public final HashMap d = new HashMap();
    public final ExecutorService b = Executors.newSingleThreadExecutor(new y20((byte) 4));

    public wm8(c22 c22Var, c22 c22Var2) {
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

    public final boolean a() {
        synchronized (this.a) {
            if (this.f) {
                return false;
            }
            if (this.h != null) {
                return true;
            }
            if (this.n == null) {
                try {
                    try {
                        dk2 a = c22.a();
                        try {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Collections.addAll(linkedHashSet, a.a.a());
                            if (linkedHashSet.contains("func")) {
                                linkedHashSet.add("fc");
                            }
                            if (linkedHashSet.contains("fift")) {
                                linkedHashSet.add("fif");
                            }
                            if (linkedHashSet.contains("tlb")) {
                                linkedHashSet.add("tl-b");
                            }
                            this.r = DesugarCollections.unmodifiableSet(linkedHashSet);
                            this.h = a;
                            return true;
                        } catch (Error | RuntimeException e) {
                            a.close();
                            throw e;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        this.n = e;
                        try {
                            cc4.g(e, true);
                        } catch (LinkageError | RuntimeException unused) {
                        }
                        return false;
                    }
                } catch (LinkageError e3) {
                    e = e3;
                    this.n = e;
                    cc4.g(e, true);
                    return false;
                } catch (OutOfMemoryError e4) {
                    e = e4;
                    this.n = e;
                    cc4.g(e, true);
                    return false;
                }
            }
            return false;
        }
    }

    public final void c(um8 um8Var, um4 um4Var) {
        sm8 sm8Var = new sm8(um8Var, um4Var);
        long j = sm8Var.b;
        if (j > 8388608) {
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.put(um8Var, sm8Var);
        this.e += j;
        while (true) {
            if (linkedHashMap.size() <= 256 && this.e <= 8388608) {
                return;
            }
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            this.e -= ((sm8) entry.getValue()).b;
            linkedHashMap.remove(entry.getKey());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            if (this.f) {
                return;
            }
            this.f = true;
            Iterator it = this.d.values().iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    this.d.clear();
                    this.c.clear();
                    this.e = 0L;
                    this.b.execute(new rm8(this, (byte) 0));
                    this.b.shutdown();
                    return;
                }
                ArrayList arrayList = (ArrayList) it.next();
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((vm8) obj).a = null;
                }
            }
        }
    }

    public final vm8 d(String str, String str2, tm8 tm8Var) {
        if (str == null) {
            throw null;
        }
        um8 um8Var = new um8(str, b(str2));
        vm8 vm8Var = new vm8();
        vm8Var.a = tm8Var;
        synchronized (this.a) {
            if (this.f) {
                throw new IllegalStateException("Service is closed");
            }
            ArrayList arrayList = (ArrayList) this.d.get(um8Var);
            if (arrayList != null) {
                arrayList.add(vm8Var);
                return vm8Var;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(vm8Var);
            this.d.put(um8Var, arrayList2);
            this.b.execute(new h68(this, um8Var, (byte) 21));
            return vm8Var;
        }
    }
}
