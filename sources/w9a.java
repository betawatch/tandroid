// default package

import android.util.Log;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class w9a extends yfb implements is4 {
    public oq5 a;
    public y9a b;
    public v9a c;
    public ji4 d;
    public s9a e;
    public bba f;
    public byte h;
    public final /* synthetic */ y9a n;
    public final /* synthetic */ s9a r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9a(y9a y9aVar, s9a s9aVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.n = y9aVar;
        this.r = s9aVar;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        return new w9a(this.n, this.r, zw2Var);
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        return ((w9a) create((ux2) obj, (zw2) obj2)).invokeSuspend(f9c.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0059, code lost:
    
        if (r1 != r6) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0045, code lost:
    
        if (r1 != r6) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b3  */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object B;
        oq5 oq5Var;
        v9a v9aVar;
        ji4 ji4Var;
        bba bbaVar;
        Object b;
        s9a s9aVar;
        ty2 ty2Var;
        String str;
        s63 s63Var;
        ty2 ty2Var2;
        byte b2 = this.h;
        y9a y9aVar = this.n;
        vx2 vx2Var = vx2.a;
        if (b2 == 0) {
            ixe.b(obj);
            this.h = (byte) 1;
            int i = y9a.g;
            a = y9aVar.a(this);
        } else {
            if (b2 != 1) {
                if (b2 == 2) {
                    ixe.b(obj);
                    B = obj;
                    oq5Var = (oq5) B;
                    v9aVar = v9a.a;
                    ji4Var = y9aVar.a;
                    bbaVar = y9aVar.c;
                    nj4 nj4Var = nj4.a;
                    this.a = oq5Var;
                    this.b = y9aVar;
                    this.c = v9aVar;
                    this.d = ji4Var;
                    s9a s9aVar2 = this.r;
                    this.e = s9aVar2;
                    this.f = bbaVar;
                    this.h = (byte) 3;
                    b = nj4Var.b(this);
                    if (b != vx2Var) {
                        s9aVar = s9aVar2;
                        Map map = (Map) b;
                        String str2 = oq5Var.a;
                        String str3 = oq5Var.b;
                        v9aVar.getClass();
                        ji4Var.getClass();
                        s9aVar.getClass();
                        bbaVar.getClass();
                        map.getClass();
                        str3.getClass();
                        String str4 = s9aVar.a;
                        String str5 = s9aVar.b;
                        int i2 = s9aVar.c;
                        long j = s9aVar.d;
                        ty2Var = (ty2) map.get(iaa.b);
                        s63 s63Var2 = s63.d;
                        s63 s63Var3 = s63.c;
                        s63 s63Var4 = s63.b;
                        if (ty2Var != null) {
                        }
                        ty2Var2 = (ty2) map.get(iaa.a);
                        if (ty2Var2 != null) {
                        }
                        u9a u9aVar = new u9a(new aaa(str4, str5, i2, j, new t63(s63Var, s63Var2, bbaVar.a()), str2, str), v9a.a(ji4Var));
                        int i3 = y9a.g;
                        y9aVar.getClass();
                        y9aVar.d.a(u9aVar);
                        Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                        return f9c.a;
                    }
                    return vx2Var;
                }
                if (b2 != 3) {
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bba bbaVar2 = this.f;
                s9aVar = this.e;
                ji4Var = this.d;
                v9aVar = this.c;
                y9aVar = this.b;
                oq5 oq5Var2 = this.a;
                ixe.b(obj);
                bbaVar = bbaVar2;
                oq5Var = oq5Var2;
                b = obj;
                Map map2 = (Map) b;
                String str22 = oq5Var.a;
                String str32 = oq5Var.b;
                v9aVar.getClass();
                ji4Var.getClass();
                s9aVar.getClass();
                bbaVar.getClass();
                map2.getClass();
                str32.getClass();
                String str42 = s9aVar.a;
                String str52 = s9aVar.b;
                int i22 = s9aVar.c;
                long j2 = s9aVar.d;
                ty2Var = (ty2) map2.get(iaa.b);
                s63 s63Var22 = s63.d;
                s63 s63Var32 = s63.c;
                s63 s63Var42 = s63.b;
                if (ty2Var != null) {
                    str = str32;
                    s63Var = s63Var42;
                } else {
                    str = str32;
                    s63Var = ty2Var.a.a() ? s63Var32 : s63Var22;
                }
                ty2Var2 = (ty2) map2.get(iaa.a);
                if (ty2Var2 != null) {
                    s63Var22 = s63Var42;
                } else if (ty2Var2.a.a()) {
                    s63Var22 = s63Var32;
                }
                u9a u9aVar2 = new u9a(new aaa(str42, str52, i22, j2, new t63(s63Var, s63Var22, bbaVar.a()), str22, str), v9a.a(ji4Var));
                int i32 = y9a.g;
                y9aVar.getClass();
                try {
                    y9aVar.d.a(u9aVar2);
                    Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                } catch (RuntimeException e) {
                    Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e);
                }
                return f9c.a;
            }
            ixe.b(obj);
            a = obj;
        }
        if (((Boolean) a).booleanValue()) {
            ri4 ri4Var = y9aVar.b;
            this.h = (byte) 2;
            B = oq5.c.B(ri4Var, this);
        }
        return f9c.a;
    }
}
