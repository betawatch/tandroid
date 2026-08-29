package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zu0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ iv0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ zu0(iv0 iv0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList) {
        this.b = iv0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = o2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iv0 iv0Var = this.b;
                iv0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.o2 o2Var = this.e;
                if (z10) {
                    ArrayList<TLRPC.PollAnswer> arrayList = this.f;
                    arrayList.remove(this.d);
                    o2Var.getSendMessagesHelper().sendVote(iv0Var.D, arrayList, null);
                } else {
                    o2Var.getSendMessagesHelper().sendVote(iv0Var.D, null, null);
                }
                iv0Var.c(true);
                break;
            default:
                iv0 iv0Var2 = this.b;
                iv0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = this.e;
                if (z11) {
                    ArrayList<TLRPC.PollAnswer> arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(iv0Var2.D, arrayList2, null);
                } else {
                    ArrayList<TLRPC.PollAnswer> arrayList3 = new ArrayList<>(1);
                    arrayList3.add(pollAnswer);
                    o2Var2.getSendMessagesHelper().sendVote(iv0Var2.D, arrayList3, null);
                }
                iv0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ zu0(iv0 iv0Var, boolean z10, org.telegram.ui.ActionBar.o2 o2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = iv0Var;
        this.c = z10;
        this.e = o2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
