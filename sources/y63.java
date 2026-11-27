// default package

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class y63 extends yfb implements is4 {
    public Iterator a;
    public oja b;
    public Object c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ List f;
    public final /* synthetic */ ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y63(List list, ArrayList arrayList, zw2 zw2Var) {
        super(2, zw2Var);
        this.f = list;
        this.h = arrayList;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        y63 y63Var = new y63(this.f, this.h, zw2Var);
        y63Var.e = obj;
        return y63Var;
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        return ((y63) create(obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        oja ojaVar;
        Iterator it2;
        Object obj2;
        byte b = this.d;
        vx2 vx2Var = vx2.a;
        if (b == 0) {
            ixe.b(obj);
            obj = this.e;
            it = this.f.iterator();
            list = this.h;
        } else if (b == 1) {
            obj2 = this.c;
            oja ojaVar2 = this.b;
            it2 = this.a;
            List list2 = (List) this.e;
            ixe.b(obj);
            ojaVar = ojaVar2;
            list = list2;
            if (!((Boolean) obj).booleanValue()) {
                list.add(new x63(ojaVar, null, (byte) 0));
                this.e = list;
                this.a = it2;
                this.b = null;
                this.c = null;
                this.d = (byte) 2;
                obj = ojaVar.b.a(new sja((SharedPreferences) ojaVar.e.getValue(), ojaVar.f), obj2, this);
                if (obj != vx2Var) {
                    it = it2;
                }
                return vx2Var;
            }
            obj = obj2;
            it = it2;
        } else {
            if (b != 2) {
                grb.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = this.a;
            list = (List) this.e;
            ixe.b(obj);
        }
        if (!it.hasNext()) {
            oja ojaVar3 = (oja) it.next();
            this.e = list;
            this.a = it;
            this.b = ojaVar3;
            this.c = obj;
            this.d = (byte) 1;
            Object a = ojaVar3.a(obj, this);
            if (a != vx2Var) {
                Iterator it3 = it;
                obj2 = obj;
                obj = a;
                ojaVar = ojaVar3;
                it2 = it3;
                if (!((Boolean) obj).booleanValue()) {
                }
                if (!it.hasNext()) {
                    return obj;
                }
            }
            return vx2Var;
        }
    }
}
