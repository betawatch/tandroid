// default package

import android.util.Log;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class uja extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ yja c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uja(yja yjaVar, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = yjaVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        yja yjaVar = this.c;
        switch (b) {
            case 0:
                return new uja(yjaVar, zw2Var, (byte) 0);
            default:
                return new uja(yjaVar, zw2Var, (byte) 1);
        }
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
        }
        return ((uja) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
    }

    @Override // qf0
    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = f9c.a;
        byte b2 = 0;
        Object obj3 = vx2.a;
        yja yjaVar = this.c;
        zw2 zw2Var = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        ixe.b(obj);
                        return obj2;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ixe.b(obj);
                um4 um4Var = new um4(yjaVar.e.getData(), new tja(yjaVar, null), b2);
                z73 z73Var = new z73(yjaVar, (byte) 2);
                this.b = true;
                return um4Var.k(z73Var, this) == obj3 ? obj3 : obj2;
            default:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        ixe.b(obj);
                        o73 o73Var = yjaVar.e;
                        wja wjaVar = new wja(yjaVar, zw2Var, b2);
                        this.b = true;
                        if (o73Var.a(wjaVar, this) == obj3) {
                            obj2 = obj3;
                        }
                    } else {
                        if (!z2) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ixe.b(obj);
                    }
                    return obj2;
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                    o9a o9aVar = yjaVar.h;
                    if (o9aVar == null) {
                        ur5.e("localSessionData");
                        throw null;
                    }
                    yjaVar.d.getClass();
                    yjaVar.h = o9a.a(o9aVar, null, srb.a(), null, 5);
                    return obj2;
                }
        }
    }
}
