package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ bs0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ ur0(bs0 bs0Var, boolean z9, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList) {
        this.b = bs0Var;
        this.c = z9;
        this.d = pollAnswer;
        this.e = f2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bs0 bs0Var = this.b;
                bs0Var.getClass();
                boolean z9 = this.c;
                org.telegram.ui.ActionBar.f2 f2Var = this.e;
                if (z9) {
                    ArrayList arrayList = this.f;
                    arrayList.remove(this.d);
                    f2Var.getSendMessagesHelper().w0(bs0Var.H, arrayList, null);
                } else {
                    f2Var.getSendMessagesHelper().w0(bs0Var.H, null, null);
                }
                bs0Var.c(true);
                break;
            default:
                bs0 bs0Var2 = this.b;
                bs0Var2.getClass();
                boolean z10 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = this.e;
                if (z10) {
                    ArrayList arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(bs0Var2.H, arrayList2, null);
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(bs0Var2.H, arrayList3, null);
                }
                bs0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ ur0(bs0 bs0Var, boolean z9, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = bs0Var;
        this.c = z9;
        this.e = f2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
