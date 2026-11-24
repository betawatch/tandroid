// default package

import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sd4 extends oc4 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, qx2 qx2Var) {
        rd4 rd4Var;
        int i;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (qx2Var instanceof rd4) {
            rd4Var = (rd4) qx2Var;
            int i2 = rd4Var.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                rd4Var.e = i2 - TLObject.FLAG_31;
                Object obj2 = rd4Var.c;
                i = rd4Var.e;
                g7c g7cVar = g7c.a;
                if (i != 0) {
                    tue.b(obj2);
                    if (this.c.get()) {
                        dq9.m("This scope has already been closed.");
                        return null;
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.a);
                    try {
                        c7a c7aVar = this.b;
                        p6c p6cVar = new p6c(fileOutputStream3);
                        rd4Var.a = fileOutputStream3;
                        rd4Var.b = fileOutputStream3;
                        rd4Var.e = 1;
                        c7aVar.n(obj, p6cVar);
                        ly2 ly2Var = ly2.a;
                        if (g7cVar == ly2Var) {
                            return ly2Var;
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
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = rd4Var.b;
                    fileOutputStream = rd4Var.a;
                    try {
                        tue.b(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            htd.a(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                htd.a(fileOutputStream, null);
                return g7cVar;
            }
        }
        rd4Var = new rd4(this, qx2Var);
        Object obj22 = rd4Var.c;
        i = rd4Var.e;
        g7c g7cVar2 = g7c.a;
        if (i != 0) {
        }
        fileOutputStream2.getFD().sync();
        htd.a(fileOutputStream, null);
        return g7cVar2;
    }
}
