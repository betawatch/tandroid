// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class w73 extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w73(Object obj, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = obj;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                w73 w73Var = new w73((i0b) obj2, zw2Var, (byte) 0);
                w73Var.b = obj;
                return w73Var;
            case 1:
                w73 w73Var2 = new w73((gq2) obj2, zw2Var, (byte) 1);
                w73Var2.b = obj;
                return w73Var2;
            case 2:
                w73 w73Var3 = new w73((ur4) obj2, zw2Var, (byte) 2);
                w73Var3.b = obj;
                return w73Var3;
            default:
                w73 w73Var4 = new w73((Set) obj2, zw2Var, (byte) 3);
                w73Var4.b = obj;
                return w73Var4;
        }
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        switch (b) {
            case 0:
                return ((w73) create((i0b) obj, (zw2) obj2)).invokeSuspend(f9cVar);
            case 1:
                ((w73) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9cVar);
                return f9cVar;
            case 2:
                ((w73) create((rj7) obj, (zw2) obj2)).invokeSuspend(f9cVar);
                return f9cVar;
            default:
                return ((w73) create((rj7) obj, (zw2) obj2)).invokeSuspend(f9cVar);
        }
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        Unsafe unsafe;
        long j;
        int intVolatile;
        byte b = this.a;
        f9c f9cVar = f9c.a;
        boolean z = false;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ixe.b(obj);
                i0b i0bVar = (i0b) this.b;
                if ((i0bVar instanceof k63) && i0bVar.a <= ((i0b) obj2).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                ixe.b(obj);
                mx2 c = ((ux2) this.b).c();
                gq2 gq2Var = (gq2) obj2;
                try {
                    frb frbVar = new frb();
                    frbVar.f = gqe.c(gqe.b(c), true, frbVar);
                    try {
                        do {
                            unsafe = fx.a;
                            j = frb.h;
                            intVolatile = unsafe.getIntVolatile(frbVar, j);
                            if (intVolatile != 0) {
                                if (intVolatile != 2 && intVolatile != 3) {
                                    frb.n(intVolatile);
                                    throw null;
                                }
                            }
                            gq2Var.invoke();
                            return f9cVar;
                        } while (!unsafe.compareAndSwapInt(frbVar, j, intVolatile, 0));
                        gq2Var.invoke();
                        return f9cVar;
                    } finally {
                        frbVar.m();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 2:
                ixe.b(obj);
                ((ur4) obj2).invoke((rj7) this.b);
                return f9cVar;
            default:
                ixe.b(obj);
                Set keySet = ((rj7) this.b).a().keySet();
                ArrayList arrayList = new ArrayList(ul2.c(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zj8) it.next()).a);
                }
                Set set = (Set) obj2;
                if (set != qja.a) {
                    if (!set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                z = true;
                return Boolean.valueOf(z);
        }
    }
}
