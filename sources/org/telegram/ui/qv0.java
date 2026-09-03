package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qv0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ yv0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ qv0(yv0 yv0Var, boolean z4, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList) {
        this.b = yv0Var;
        this.c = z4;
        this.d = pollAnswer;
        this.e = p2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yv0 yv0Var = this.b;
                yv0Var.getClass();
                boolean z4 = this.c;
                org.telegram.ui.ActionBar.p2 p2Var = this.e;
                if (z4) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f;
                    arrayList.remove(this.d);
                    p2Var.getSendMessagesHelper().sendVote(yv0Var.E, arrayList, null);
                } else {
                    p2Var.getSendMessagesHelper().sendVote(yv0Var.E, null, null);
                }
                yv0Var.c(true);
                break;
            default:
                yv0 yv0Var2 = this.b;
                yv0Var2.getClass();
                boolean z10 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = this.e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(yv0Var2.E, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    p2Var2.getSendMessagesHelper().sendVote(yv0Var2.E, arrayList3, null);
                }
                yv0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ qv0(yv0 yv0Var, boolean z4, org.telegram.ui.ActionBar.p2 p2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = yv0Var;
        this.c = z4;
        this.e = p2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
