// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class xyc extends Thread {
    public final ryc a;

    public xyc(String str, ryc rycVar, int i) {
        super(str);
        this.a = rycVar;
    }

    public abstract void a();

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        vh4 vh4Var = this.a.d;
        int i = 0;
        if (vh4Var != null) {
            ArrayList arrayList = (ArrayList) vh4Var.s();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                s35 s35Var = (s35) obj;
                try {
                    try {
                        s35Var.getClass();
                    } catch (Throwable unused) {
                        s35Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        a();
        if (vh4Var != null) {
            ArrayList arrayList2 = (ArrayList) vh4Var.s();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                s35 s35Var2 = (s35) obj2;
                try {
                    try {
                        s35Var2.getClass();
                    } catch (Throwable unused3) {
                        s35Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
    }
}
