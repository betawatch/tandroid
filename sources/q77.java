// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class q77 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ q77(uc7 uc7Var, long j, long j2, ArrayList arrayList) {
        this.b = uc7Var;
        this.d = j;
        this.e = j2;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                kf7 messagesStorage = uc7Var.getMessagesStorage();
                int i = (int) this.e;
                long j = this.d;
                ArrayList arrayList = this.c;
                uc7Var.getMessagesStorage().T1(j, -j, arrayList, messagesStorage.P0(j, arrayList, false, true, 5, i));
                break;
            case 1:
                uc7 uc7Var2 = this.b;
                ArrayList arrayList2 = this.c;
                long j2 = this.d;
                hl.c3(new p77(uc7Var2, arrayList2, j2, (byte) 1));
                kf7 messagesStorage2 = uc7Var2.getMessagesStorage();
                long j3 = this.e;
                messagesStorage2.F(arrayList2, j3);
                uc7Var2.getMessagesStorage().T1(j3, j2, arrayList2, uc7Var2.getMessagesStorage().P0(j3, arrayList2, false, true, 0, 0));
                break;
            default:
                qyb qybVar = uc7Var.getMessagesController().h4;
                long j4 = this.d;
                long j5 = this.e;
                qybVar.B(0, j4, j5, false);
                uc7Var.getMessagesStorage().j2(0, j4, j5, false);
                uc7Var.getNotificationCenter().k(jn7.c5, Long.valueOf(j4), Long.valueOf(j5), 0, this.c);
                break;
        }
    }

    public /* synthetic */ q77(uc7 uc7Var, long j, ArrayList arrayList, long j2) {
        this.b = uc7Var;
        this.d = j;
        this.c = arrayList;
        this.e = j2;
    }

    public /* synthetic */ q77(uc7 uc7Var, ArrayList arrayList, long j, long j2) {
        this.b = uc7Var;
        this.c = arrayList;
        this.d = j;
        this.e = j2;
    }
}
