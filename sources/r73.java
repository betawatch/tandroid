// default package

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r73 extends eeb implements fs4 {
    public Iterator a;
    public xha b;
    public Object c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ List f;
    public final /* synthetic */ ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r73(List list, ArrayList arrayList, px2 px2Var) {
        super(2, px2Var);
        this.f = list;
        this.h = arrayList;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        r73 r73Var = new r73(this.f, this.h, px2Var);
        r73Var.e = obj;
        return r73Var;
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        return ((r73) create(obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        xha xhaVar;
        Iterator it2;
        Object obj2;
        byte b = this.d;
        ly2 ly2Var = ly2.a;
        if (b == 0) {
            tue.b(obj);
            obj = this.e;
            it = this.f.iterator();
            list = this.h;
        } else if (b == 1) {
            obj2 = this.c;
            xha xhaVar2 = this.b;
            it2 = this.a;
            List list2 = (List) this.e;
            tue.b(obj);
            xhaVar = xhaVar2;
            list = list2;
            if (!((Boolean) obj).booleanValue()) {
                list.add(new q73(xhaVar, null, (byte) 0));
                this.e = list;
                this.a = it2;
                this.b = null;
                this.c = null;
                this.d = (byte) 2;
                obj = xhaVar.b.a(new bia((SharedPreferences) xhaVar.e.getValue(), xhaVar.f), obj2, this);
                if (obj != ly2Var) {
                    it = it2;
                }
                return ly2Var;
            }
            obj = obj2;
            it = it2;
        } else {
            if (b != 2) {
                dq9.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = this.a;
            list = (List) this.e;
            tue.b(obj);
        }
        if (!it.hasNext()) {
            xha xhaVar3 = (xha) it.next();
            this.e = list;
            this.a = it;
            this.b = xhaVar3;
            this.c = obj;
            this.d = (byte) 1;
            Object a = xhaVar3.a(obj, this);
            if (a != ly2Var) {
                Iterator it3 = it;
                obj2 = obj;
                obj = a;
                xhaVar = xhaVar3;
                it2 = it3;
                if (!((Boolean) obj).booleanValue()) {
                }
                if (!it.hasNext()) {
                    return obj;
                }
            }
            return ly2Var;
        }
    }
}
