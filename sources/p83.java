// default package

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p83 extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p83(Object obj, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = obj;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                p83 p83Var = new p83((iya) obj2, px2Var, (byte) 0);
                p83Var.b = obj;
                return p83Var;
            case 1:
                p83 p83Var2 = new p83((yq2) obj2, px2Var, (byte) 1);
                p83Var2.b = obj;
                return p83Var2;
            case 2:
                p83 p83Var3 = new p83((rr4) obj2, px2Var, (byte) 2);
                p83Var3.b = obj;
                return p83Var3;
            default:
                p83 p83Var4 = new p83((Set) obj2, px2Var, (byte) 3);
                p83Var4.b = obj;
                return p83Var4;
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        switch (b) {
            case 0:
                return ((p83) create((iya) obj, (px2) obj2)).invokeSuspend(g7cVar);
            case 1:
                ((p83) create((ky2) obj, (px2) obj2)).invokeSuspend(g7cVar);
                return g7cVar;
            case 2:
                ((p83) create((lj7) obj, (px2) obj2)).invokeSuspend(g7cVar);
                return g7cVar;
            default:
                return ((p83) create((lj7) obj, (px2) obj2)).invokeSuspend(g7cVar);
        }
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        Unsafe unsafe;
        long j;
        int intVolatile;
        byte b = this.a;
        g7c g7cVar = g7c.a;
        boolean z = false;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                tue.b(obj);
                iya iyaVar = (iya) this.b;
                if ((iyaVar instanceof e73) && iyaVar.a <= ((iya) obj2).a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                tue.b(obj);
                cy2 c = ((ky2) this.b).c();
                yq2 yq2Var = (yq2) obj2;
                try {
                    hpb hpbVar = new hpb();
                    hpbVar.f = pne.c(pne.b(c), true, hpbVar);
                    try {
                        do {
                            unsafe = fy.a;
                            j = hpb.h;
                            intVolatile = unsafe.getIntVolatile(hpbVar, j);
                            if (intVolatile != 0) {
                                if (intVolatile != 2 && intVolatile != 3) {
                                    hpb.n(intVolatile);
                                    throw null;
                                }
                            }
                            yq2Var.invoke();
                            return g7cVar;
                        } while (!unsafe.compareAndSwapInt(hpbVar, j, intVolatile, 0));
                        yq2Var.invoke();
                        return g7cVar;
                    } finally {
                        hpbVar.m();
                    }
                } catch (InterruptedException e) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
                }
            case 2:
                tue.b(obj);
                ((rr4) obj2).invoke((lj7) this.b);
                return g7cVar;
            default:
                tue.b(obj);
                Set keySet = ((lj7) this.b).a().keySet();
                ArrayList arrayList = new ArrayList(mm2.c(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ni8) it.next()).a);
                }
                Set set = (Set) obj2;
                if (set != zha.a) {
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
