// default package

import android.os.Bundle;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xv6 implements h53 {
    public ArrayList a;

    public xv6(byte b) {
        switch (b) {
            case 2:
                this.a = new ArrayList();
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    @Override // h53
    public final long a(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((i53) arrayList.get(0)).b) {
            return ((i53) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((i53) arrayList.get(i)).b;
            if (j < j2) {
                long j3 = ((i53) arrayList.get(i - 1)).d;
                return (j3 == -9223372036854775807L || j3 <= j || j3 >= j2) ? j2 : j3;
            }
        }
        long j4 = ((i53) lne.b(arrayList)).d;
        if (j4 == -9223372036854775807L || j >= j4) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // h53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(i53 i53Var, long j) {
        boolean z;
        int size;
        ArrayList arrayList = this.a;
        long j2 = i53Var.b;
        jte.f(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = i53Var.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j2 >= ((i53) arrayList.get(size)).b) {
                        arrayList.add(size + 1, i53Var);
                        return z;
                    }
                    if (((i53) arrayList.get(size)).b <= j) {
                        z = false;
                    }
                }
                arrayList.add(0, i53Var);
                return z;
            }
        }
        z = false;
        while (size >= 0) {
        }
        arrayList.add(0, i53Var);
        return z;
    }

    @Override // h53
    public final mo5 c(long j) {
        int h = h(j);
        if (h == 0) {
            ko5 ko5Var = mo5.b;
            return y79.e;
        }
        i53 i53Var = (i53) this.a.get(h - 1);
        long j2 = i53Var.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return i53Var.a;
        }
        ko5 ko5Var2 = mo5.b;
        return y79.e;
    }

    @Override // h53
    public final void clear() {
        this.a.clear();
    }

    @Override // h53
    public final long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((i53) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((i53) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                i53 i53Var = (i53) arrayList.get(i - 1);
                long j3 = i53Var.d;
                return (j3 == -9223372036854775807L || j3 > j) ? i53Var.b : j3;
            }
        }
        i53 i53Var2 = (i53) lne.b(arrayList);
        long j4 = i53Var2.d;
        return (j4 == -9223372036854775807L || j < j4) ? i53Var2.b : j4;
    }

    @Override // h53
    public final void e(long j) {
        ArrayList arrayList = this.a;
        int h = h(j);
        if (h == 0) {
            return;
        }
        long j2 = ((i53) arrayList.get(h - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            h--;
        }
        arrayList.subList(0, h).clear();
    }

    public final void f(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (str == null) {
                u36.j("category must not be null");
                return;
            }
            ArrayList arrayList2 = this.a;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.a = arrayList2;
            }
            if (!arrayList2.contains(str)) {
                this.a.add(str);
            }
        }
    }

    public final yv6 g() {
        if (this.a == null) {
            return yv6.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new yv6(bundle, this.a);
    }

    public final int h(long j) {
        ArrayList arrayList = this.a;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((i53) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    public final synchronized List i() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.a));
    }
}
