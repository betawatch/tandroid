// default package

import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class sb4 extends oa4 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, gw2 gw2Var) {
        rb4 rb4Var;
        int i;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (gw2Var instanceof rb4) {
            rb4Var = (rb4) gw2Var;
            int i2 = rb4Var.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                rb4Var.e = i2 - TLObject.FLAG_31;
                Object obj2 = rb4Var.c;
                i = rb4Var.e;
                g5c g5cVar = g5c.a;
                if (i != 0) {
                    qse.b(obj2);
                    if (this.c.get()) {
                        sc8.j("This scope has already been closed.");
                        return null;
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.a);
                    try {
                        a5a a5aVar = this.b;
                        p4c p4cVar = new p4c(fileOutputStream3);
                        rb4Var.a = fileOutputStream3;
                        rb4Var.b = fileOutputStream3;
                        rb4Var.e = 1;
                        a5aVar.i(obj, p4cVar);
                        bx2 bx2Var = bx2.a;
                        if (g5cVar == bx2Var) {
                            return bx2Var;
                        }
                        fileOutputStream2 = fileOutputStream3;
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream3;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = rb4Var.b;
                    fileOutputStream = rb4Var.a;
                    try {
                        qse.b(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            erd.a(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                erd.a(fileOutputStream, null);
                return g5cVar;
            }
        }
        rb4Var = new rb4(this, gw2Var);
        Object obj22 = rb4Var.c;
        i = rb4Var.e;
        g5c g5cVar2 = g5c.a;
        if (i != 0) {
        }
        fileOutputStream2.getFD().sync();
        erd.a(fileOutputStream, null);
        return g5cVar2;
    }
}
