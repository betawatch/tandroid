package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ zv0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ rv0(zv0 zv0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.r2 r2Var, ArrayList arrayList) {
        this.b = zv0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = r2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zv0 zv0Var = this.b;
                zv0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.r2 r2Var = this.e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f;
                    arrayList.remove(this.d);
                    r2Var.getSendMessagesHelper().sendVote(zv0Var.H, arrayList, null);
                } else {
                    r2Var.getSendMessagesHelper().sendVote(zv0Var.H, null, null);
                }
                zv0Var.c(true);
                break;
            default:
                zv0 zv0Var2 = this.b;
                zv0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.r2 r2Var2 = this.e;
                if (z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    r2Var2.getSendMessagesHelper().sendVote(zv0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    r2Var2.getSendMessagesHelper().sendVote(zv0Var2.H, arrayList3, null);
                }
                zv0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ rv0(zv0 zv0Var, boolean z10, org.telegram.ui.ActionBar.r2 r2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = zv0Var;
        this.c = z10;
        this.e = r2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
