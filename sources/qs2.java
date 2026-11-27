// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qs2 extends xyc {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qs2(String str, ryc rycVar, int i, byte b) {
        super(str, rycVar, i);
        this.b = b;
    }

    @Override // xyc
    public final void a() {
        byte b = this.b;
        ryc rycVar = this.a;
        switch (b) {
            case 0:
                try {
                    rycVar.b();
                    break;
                } catch (syc e) {
                    vh4 vh4Var = rycVar.d;
                    vh4Var.d(e);
                    ArrayList arrayList = (ArrayList) vh4Var.s();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        s35 s35Var = (s35) obj;
                        try {
                            try {
                                hl.c3(new gp6((Object) s35Var.c, vh4Var.b, s35Var.a, (Object) "connect error: ".concat(t35.b(e)), (byte) 25));
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            s35Var.getClass();
                        }
                    }
                    return;
                }
            default:
                rycVar.d();
                break;
        }
    }
}
