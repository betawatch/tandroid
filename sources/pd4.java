// default package

import java.io.FileOutputStream;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class pd4 extends lc4 {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, ax2 ax2Var) {
        od4 od4Var;
        int i;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (ax2Var instanceof od4) {
            od4Var = (od4) ax2Var;
            int i2 = od4Var.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                od4Var.e = i2 - TLObject.FLAG_31;
                Object obj2 = od4Var.c;
                i = od4Var.e;
                f9c f9cVar = f9c.a;
                if (i != 0) {
                    ixe.b(obj2);
                    if (this.c.get()) {
                        grb.i("This scope has already been closed.");
                        return null;
                    }
                    FileOutputStream fileOutputStream3 = new FileOutputStream(this.a);
                    try {
                        s8a s8aVar = this.b;
                        o8c o8cVar = new o8c(fileOutputStream3);
                        od4Var.a = fileOutputStream3;
                        od4Var.b = fileOutputStream3;
                        od4Var.e = 1;
                        s8aVar.n(obj, o8cVar);
                        vx2 vx2Var = vx2.a;
                        if (f9cVar == vx2Var) {
                            return vx2Var;
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
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = od4Var.b;
                    fileOutputStream = od4Var.a;
                    try {
                        ixe.b(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            uvd.a(fileOutputStream, th);
                            throw th3;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                uvd.a(fileOutputStream, null);
                return f9cVar;
            }
        }
        od4Var = new od4(this, ax2Var);
        Object obj22 = od4Var.c;
        i = od4Var.e;
        f9c f9cVar2 = f9c.a;
        if (i != 0) {
        }
        fileOutputStream2.getFD().sync();
        uvd.a(fileOutputStream, null);
        return f9cVar2;
    }
}
