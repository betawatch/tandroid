package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fw0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ wv0(fw0 fw0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList) {
        this.b = fw0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = n2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fw0 fw0Var = this.b;
                fw0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.n2 n2Var = this.e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f;
                    arrayList.remove(this.d);
                    n2Var.getSendMessagesHelper().sendVote(fw0Var.H, arrayList, null);
                } else {
                    n2Var.getSendMessagesHelper().sendVote(fw0Var.H, null, null);
                }
                fw0Var.c(true);
                break;
            default:
                fw0 fw0Var2 = this.b;
                fw0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = this.e;
                if (z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(fw0Var2.H, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    n2Var2.getSendMessagesHelper().sendVote(fw0Var2.H, arrayList3, null);
                }
                fw0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ wv0(fw0 fw0Var, boolean z10, org.telegram.ui.ActionBar.n2 n2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = fw0Var;
        this.c = z10;
        this.e = n2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
