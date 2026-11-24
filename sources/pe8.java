// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pe8 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ve8 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ d e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ pe8(ve8 ve8Var, boolean z, TLRPC.PollAnswer pollAnswer, d dVar, ArrayList arrayList) {
        this.b = ve8Var;
        this.c = z;
        this.d = pollAnswer;
        this.e = dVar;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.f;
        d dVar = this.e;
        TLRPC.PollAnswer pollAnswer = this.d;
        boolean z = this.c;
        ve8 ve8Var = this.b;
        switch (b) {
            case 0:
                if (z) {
                    arrayList.remove(pollAnswer);
                    dVar.getSendMessagesHelper().v0(ve8Var.I, arrayList, null);
                } else {
                    dVar.getSendMessagesHelper().v0(ve8Var.I, null, null);
                }
                ve8Var.b(true);
                break;
            default:
                if (z) {
                    arrayList.add(pollAnswer);
                    dVar.getSendMessagesHelper().v0(ve8Var.I, arrayList, null);
                } else {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    dVar.getSendMessagesHelper().v0(ve8Var.I, arrayList2, null);
                }
                ve8Var.b(true);
                break;
        }
    }

    public /* synthetic */ pe8(ve8 ve8Var, boolean z, d dVar, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = ve8Var;
        this.c = z;
        this.e = dVar;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
