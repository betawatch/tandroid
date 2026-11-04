package zd;

import b8.ib;
import java.io.Serializable;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l implements c {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ c b;
    public final /* synthetic */ Serializable c;

    public l(c cVar, kotlin.jvm.internal.r rVar) {
        this.b = cVar;
        this.c = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    @Override // zd.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, fd.c cVar) {
        k kVar;
        int i3;
        l lVar;
        o oVar;
        int i10;
        boolean z10;
        Object obj2;
        Object obj3;
        l lVar2;
        switch (this.a) {
            case 0:
                if (cVar instanceof k) {
                    kVar = (k) cVar;
                    int i11 = kVar.d;
                    if ((i11 & TLObject.FLAG_31) != 0) {
                        kVar.d = i11 - TLObject.FLAG_31;
                        Object obj4 = kVar.b;
                        gd.a aVar = gd.a.a;
                        i3 = kVar.d;
                        if (i3 != 0) {
                            ib.b(obj4);
                            try {
                                c cVar2 = this.b;
                                kVar.a = this;
                                kVar.d = 1;
                                if (cVar2.b(obj, kVar) == aVar) {
                                    return aVar;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                lVar = this;
                                ((kotlin.jvm.internal.r) lVar.c).a = th;
                                throw th;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            lVar = kVar.a;
                            try {
                                ib.b(obj4);
                            } catch (Throwable th3) {
                                th = th3;
                                ((kotlin.jvm.internal.r) lVar.c).a = th;
                                throw th;
                            }
                        }
                        return dd.k.a;
                    }
                }
                kVar = new k(this, cVar);
                Object obj42 = kVar.b;
                gd.a aVar2 = gd.a.a;
                i3 = kVar.d;
                if (i3 != 0) {
                }
                return dd.k.a;
            default:
                if (cVar instanceof o) {
                    oVar = (o) cVar;
                    int i12 = oVar.c;
                    if ((i12 & TLObject.FLAG_31) != 0) {
                        oVar.c = i12 - TLObject.FLAG_31;
                        Object obj5 = oVar.b;
                        gd.a aVar3 = gd.a.a;
                        i10 = oVar.c;
                        z10 = true;
                        if (i10 != 0) {
                            ib.b(obj5);
                            gb.c cVar3 = (gb.c) this.c;
                            oVar.a = this;
                            oVar.e = obj;
                            oVar.c = 1;
                            Object invoke = cVar3.invoke(obj, oVar);
                            if (invoke == aVar3) {
                                return aVar3;
                            }
                            obj2 = invoke;
                            obj3 = obj;
                            lVar2 = this;
                        } else {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                lVar2 = oVar.a;
                                ib.b(obj5);
                                if (z10) {
                                    return dd.k.a;
                                }
                                throw new ae.a(lVar2);
                            }
                            Object obj6 = oVar.e;
                            l lVar3 = oVar.a;
                            ib.b(obj5);
                            obj3 = obj6;
                            lVar2 = lVar3;
                            obj2 = obj5;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z10 = false;
                        } else {
                            c cVar4 = lVar2.b;
                            oVar.a = lVar2;
                            oVar.e = null;
                            oVar.c = 2;
                            if (cVar4.b(obj3, oVar) == aVar3) {
                                return aVar3;
                            }
                        }
                        if (z10) {
                        }
                    }
                }
                oVar = new o(this, cVar);
                Object obj52 = oVar.b;
                gd.a aVar32 = gd.a.a;
                i10 = oVar.c;
                z10 = true;
                if (i10 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z10) {
                }
        }
    }

    public l(gb.c cVar, c cVar2) {
        this.c = cVar;
        this.b = cVar2;
    }
}
