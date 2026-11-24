// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class rg8 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ xg8 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ d e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ rg8(xg8 xg8Var, boolean z, TLRPC.PollAnswer pollAnswer, d dVar, ArrayList arrayList) {
        this.b = xg8Var;
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
        xg8 xg8Var = this.b;
        switch (b) {
            case 0:
                if (z) {
                    arrayList.remove(pollAnswer);
                    dVar.getSendMessagesHelper().v0(xg8Var.I, arrayList, null);
                } else {
                    dVar.getSendMessagesHelper().v0(xg8Var.I, null, null);
                }
                xg8Var.b(true);
                break;
            default:
                if (z) {
                    arrayList.add(pollAnswer);
                    dVar.getSendMessagesHelper().v0(xg8Var.I, arrayList, null);
                } else {
                    ArrayList arrayList2 = new ArrayList(1);
                    arrayList2.add(pollAnswer);
                    dVar.getSendMessagesHelper().v0(xg8Var.I, arrayList2, null);
                }
                xg8Var.b(true);
                break;
        }
    }

    public /* synthetic */ rg8(xg8 xg8Var, boolean z, d dVar, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = xg8Var;
        this.c = z;
        this.e = dVar;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
