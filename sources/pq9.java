// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pq9 extends qx2 implements jm4 {
    public final jm4 a;
    public final cy2 b;
    public final int c;
    public cy2 d;
    public px2 e;

    public pq9(jm4 jm4Var, cy2 cy2Var) {
        super(pq2.c, k34.a);
        this.a = jm4Var;
        this.b = cy2Var;
        this.c = ((Number) cy2Var.fold(0, new qn2((byte) 5))).intValue();
    }

    @Override // jm4
    public final Object c(Object obj, px2 px2Var) {
        try {
            Object d = d(px2Var, obj);
            return d == ly2.a ? d : g7c.a;
        } catch (Throwable th) {
            this.d = new nr3(px2Var.getContext(), th);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(px2 px2Var, Object obj) {
        List list;
        Comparable comparable;
        String str;
        cy2 context = px2Var.getContext();
        pne.a(context);
        cy2 cy2Var = this.d;
        if (cy2Var != context) {
            int i = 0;
            if (cy2Var instanceof nr3) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((nr3) cy2Var).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                x46 x46Var = new x46(str2);
                if (x46Var.hasNext()) {
                    Object next = x46Var.next();
                    if (x46Var.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (x46Var.hasNext()) {
                            arrayList.add(x46Var.next());
                        }
                        list = arrayList;
                    } else {
                        list = lm2.a(next);
                    }
                } else {
                    list = n34.a;
                }
                List list2 = list;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (!hbb.h((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(mm2.c(arrayList2, 10));
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    String str3 = (String) obj3;
                    int length = str3.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        char charAt = str3.charAt(i3);
                        if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 == -1) {
                        i3 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(i3));
                }
                Iterator it = arrayList3.iterator();
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
                list.size();
                int size2 = list.size() - 1;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list2) {
                    int i4 = i + 1;
                    if (i < 0) {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                    String str4 = (String) obj4;
                    if ((i != 0 && i != size2) || !hbb.h(str4)) {
                        str4.getClass();
                        if (intValue >= 0) {
                            int length3 = str4.length();
                            if (intValue <= length3) {
                                length3 = intValue;
                            }
                            str = str4.substring(length3);
                            if (str == null) {
                                arrayList4.add(str);
                            }
                            i = i4;
                        } else {
                            c1b.a(td4.o(intValue, "Requested character count ", " is less than zero."));
                        }
                    }
                    str = null;
                    if (str == null) {
                    }
                    i = i4;
                }
                StringBuilder sb = new StringBuilder(length2);
                km2.e(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.fold(0, new fs4() { // from class: sq9
                /* JADX WARN: Code restructure failed: missing block: B:26:0x002e, code lost:
                
                    if (r4 != null) goto L15;
                 */
                @Override // fs4
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj5, Object obj6) {
                    int intValue2 = ((Integer) obj5).intValue();
                    ay2 ay2Var = (ay2) obj6;
                    by2 key = ay2Var.getKey();
                    ay2 ay2Var2 = pq9.this.b.get(key);
                    if (key != nf5.c) {
                        if (ay2Var != ay2Var2) {
                            intValue2 = TLObject.FLAG_31;
                        }
                        intValue2++;
                    } else {
                        av5 av5Var = (av5) ay2Var2;
                        av5 av5Var2 = (av5) ay2Var;
                        while (true) {
                            if (av5Var2 != null) {
                                if (av5Var2 == av5Var || !(av5Var2 instanceof ss9)) {
                                    break;
                                }
                                th2 th2Var = (th2) fy.a.getObjectVolatile((ss9) av5Var2, ov5.a);
                                av5Var2 = th2Var != null ? th2Var.getParent() : null;
                            } else {
                                av5Var2 = null;
                                break;
                            }
                        }
                        if (av5Var2 != av5Var) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + av5Var2 + ", expected child of " + av5Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                    }
                    return Integer.valueOf(intValue2);
                }
            })).intValue() != this.c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.d = context;
        }
        this.e = px2Var;
        hs4 hs4Var = rq9.a;
        jm4 jm4Var = this.a;
        jm4Var.getClass();
        Object a = hs4Var.a(jm4Var, obj, this);
        if (!rr5.a(a, ly2.a)) {
            this.e = null;
        }
        return a;
    }

    @Override // og0, my2
    public final my2 getCallerFrame() {
        px2 px2Var = this.e;
        if (px2Var instanceof my2) {
            return (my2) px2Var;
        }
        return null;
    }

    @Override // qx2, px2
    public final cy2 getContext() {
        cy2 cy2Var = this.d;
        return cy2Var == null ? k34.a : cy2Var;
    }

    @Override // og0
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        Throwable a = tc9.a(obj);
        if (a != null) {
            this.d = new nr3(getContext(), a);
        }
        px2 px2Var = this.e;
        if (px2Var != null) {
            px2Var.resumeWith(obj);
        }
        return ly2.a;
    }
}
