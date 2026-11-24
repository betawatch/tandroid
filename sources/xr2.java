// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xr2 extends huc {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xr2(String str, buc bucVar, int i, byte b) {
        super(str, bucVar, i);
        this.b = b;
    }

    @Override // huc
    public final void a() {
        byte b = this.b;
        buc bucVar = this.a;
        switch (b) {
            case 0:
                try {
                    bucVar.b();
                    break;
                } catch (cuc e) {
                    xf4 xf4Var = bucVar.d;
                    xf4Var.f(e);
                    ArrayList arrayList = (ArrayList) xf4Var.u();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        o15 o15Var = (o15) obj;
                        try {
                            try {
                                gl.c3(new tn6((Object) o15Var.c, xf4Var.b, o15Var.a, (Object) "connect error: ".concat(p15.b(e)), (byte) 24));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            o15Var.getClass();
                        }
                    }
                    return;
                }
            default:
                bucVar.d();
                break;
        }
    }
}
