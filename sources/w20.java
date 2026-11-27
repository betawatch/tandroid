// default package

import java.io.File;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class w20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i30 b;
    public final /* synthetic */ g30 c;

    public /* synthetic */ w20(i30 i30Var, g30 g30Var, int i) {
        this.a = (byte) 4;
        this.b = i30Var;
        this.c = g30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        switch (this.a) {
            case 0:
                i30 i30Var = this.b;
                g30 g30Var = this.c;
                i30Var.g.G(g30Var.a, g30Var.b);
                return;
            case 1:
                i30 i30Var2 = this.b;
                g30 g30Var2 = this.c;
                lh2 lh2Var = i30Var2.g;
                long j = g30Var2.a;
                lh2Var.getClass();
                return;
            case 2:
                i30 i30Var3 = this.b;
                g30 g30Var3 = this.c;
                i30Var3.g.G(g30Var3.a, g30Var3.b);
                return;
            case 3:
                i30 i30Var4 = this.b;
                g30 g30Var4 = this.c;
                lh2 lh2Var2 = i30Var4.g;
                long j2 = g30Var4.a;
                lh2Var2.getClass();
                return;
            default:
                i30 i30Var5 = this.b;
                g30 g30Var5 = this.c;
                lh2 lh2Var3 = i30Var5.g;
                long j3 = g30Var5.a;
                synchronized (((v20) lh2Var3.c).c) {
                    file = (File) ((v20) lh2Var3.c).d.remove(Long.valueOf(j3));
                }
                if (file != null) {
                    ((v20) lh2Var3.c).a.post(new u20(lh2Var3, j3, (sn6) lh2Var3.b, file, (byte) 0));
                    return;
                }
                return;
        }
    }

    public /* synthetic */ w20(i30 i30Var, g30 g30Var, long j, long j2, byte b) {
        this.a = b;
        this.b = i30Var;
        this.c = g30Var;
    }

    public /* synthetic */ w20(i30 i30Var, g30 g30Var, Exception exc) {
        this.a = (byte) 3;
        this.b = i30Var;
        this.c = g30Var;
    }
}
