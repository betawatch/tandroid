// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pd5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rd5 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ pd5(rd5 rd5Var, String str, int i, byte b) {
        this.a = b;
        this.b = rd5Var;
        this.c = str;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                rd5 rd5Var = this.b;
                String str = this.c;
                int i = this.d;
                if (rd5Var.e != null) {
                    rd5Var.e = null;
                    hl.c3(new pd5(rd5Var, str, i, (byte) 1));
                    break;
                }
                break;
            default:
                rd5 rd5Var2 = this.b;
                String str2 = this.c;
                int i2 = this.d;
                rd5Var2.e = null;
                if (!xc2.T(rd5Var2.x.P1) && rd5Var2.x.Q1 != null) {
                    arrayList = new ArrayList(rd5Var2.x.Q1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.g.c(new gp6((Object) rd5Var2, (Object) str2, i2, (Object) arrayList2, (byte) 27));
                } else {
                    rd5Var2.h = false;
                }
                rd5Var2.d.g(str2, xc2.w(3, rd5Var2.x.P1), false, true, false, xc2.T(rd5Var2.x.P1) ? rd5Var2.x.P1.id : 0L, false, 2, i2);
                break;
        }
    }
}
