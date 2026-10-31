package xd;

import bd.k;
import c3.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ld.q;
import td.e0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g extends ed.c implements wd.c {
    public final wd.c a;
    public final cd.h b;
    public final int c;
    public cd.h d;
    public ed.c e;

    public g(wd.c cVar, cd.h hVar) {
        super(d.a, cd.i.a);
        this.a = cVar;
        this.b = hVar;
        this.c = ((Number) hVar.fold(0, f.b)).intValue();
    }

    @Override // wd.c
    public final Object b(Object obj, ed.c cVar) {
        try {
            Object c10 = c(cVar, obj);
            return c10 == dd.a.a ? c10 : ad.j.a;
        } catch (Throwable th2) {
            this.d = new c(cVar.getContext(), th2);
            throw th2;
        }
    }

    public final Object c(ed.c cVar, Object obj) {
        Comparable comparable;
        String str;
        cd.h context = cVar.getContext();
        e0.h(context);
        cd.h hVar = this.d;
        if (hVar != context) {
            int i10 = 0;
            if (hVar instanceof c) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((c) hVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                kotlin.jvm.internal.i.e(str2, "<this>");
                List a2 = qd.d.a(new qd.e(str2, 2));
                List list = a2;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!rd.j.e((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k.d(arrayList));
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj3 = arrayList.get(i11);
                    i11++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            i12 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i12);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 == -1) {
                        i12 = str3.length();
                    }
                    arrayList2.add(Integer.valueOf(i12));
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int intValue = num != null ? num.intValue() : 0;
                int length2 = str2.length();
                a2.size();
                int a10 = bd.j.a(a2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    int i13 = i10 + 1;
                    if (i10 < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if ((i10 == 0 || i10 == a10) && rd.j.e(str4)) {
                        str = null;
                    } else {
                        kotlin.jvm.internal.i.e(str4, "<this>");
                        if (intValue < 0) {
                            throw new IllegalArgumentException(i0.a.j(intValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length3 = str4.length();
                        if (intValue <= length3) {
                            length3 = intValue;
                        }
                        str = str4.substring(length3);
                        kotlin.jvm.internal.i.d(str, "substring(...)");
                    }
                    if (str != null) {
                        arrayList3.add(str);
                    }
                    i10 = i13;
                }
                StringBuilder sb2 = new StringBuilder(length2);
                bd.i.g(arrayList3, sb2, "\n", "", "", "...", null);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (((Number) context.fold(0, new j(this))).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = cVar;
        q qVar = i.a;
        wd.c cVar2 = this.a;
        kotlin.jvm.internal.i.c(cVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object a11 = qVar.a(cVar2, obj, this);
        if (!kotlin.jvm.internal.i.a(a11, dd.a.a)) {
            this.e = null;
        }
        return a11;
    }

    @Override // ed.a, ed.d
    public final ed.d getCallerFrame() {
        ed.c cVar = this.e;
        if (i0.t(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // ed.c, cd.c
    public final cd.h getContext() {
        cd.h hVar = this.d;
        return hVar == null ? cd.i.a : hVar;
    }

    @Override // ed.a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // ed.a
    public final Object invokeSuspend(Object obj) {
        Throwable a2 = ad.g.a(obj);
        if (a2 != null) {
            this.d = new c(getContext(), a2);
        }
        ed.c cVar = this.e;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return dd.a.a;
    }
}
