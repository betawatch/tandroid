package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ as0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ sr0(as0 as0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList) {
        this.b = as0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = g2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                as0 as0Var = this.b;
                as0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.g2 g2Var = this.e;
                if (z10) {
                    ArrayList arrayList = this.f;
                    arrayList.remove(this.d);
                    g2Var.getSendMessagesHelper().w0(as0Var.I, arrayList, null);
                } else {
                    g2Var.getSendMessagesHelper().w0(as0Var.I, null, null);
                }
                as0Var.c(true);
                break;
            default:
                as0 as0Var2 = this.b;
                as0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.g2 g2Var2 = this.e;
                if (z11) {
                    ArrayList arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    g2Var2.getSendMessagesHelper().w0(as0Var2.I, arrayList2, null);
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(pollAnswer);
                    g2Var2.getSendMessagesHelper().w0(as0Var2.I, arrayList3, null);
                }
                as0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ sr0(as0 as0Var, boolean z10, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = as0Var;
        this.c = z10;
        this.e = g2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
