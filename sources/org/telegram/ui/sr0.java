package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ zr0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ sr0(zr0 zr0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList) {
        this.b = zr0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = g2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zr0 zr0Var = this.b;
                zr0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.g2 g2Var = this.e;
                if (z10) {
                    ArrayList arrayList = this.f;
                    arrayList.remove(this.d);
                    g2Var.getSendMessagesHelper().w0(zr0Var.I, arrayList, null);
                } else {
                    g2Var.getSendMessagesHelper().w0(zr0Var.I, null, null);
                }
                zr0Var.c(true);
                break;
            default:
                zr0 zr0Var2 = this.b;
                zr0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.g2 g2Var2 = this.e;
                if (z11) {
                    ArrayList arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    g2Var2.getSendMessagesHelper().w0(zr0Var2.I, arrayList2, null);
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(pollAnswer);
                    g2Var2.getSendMessagesHelper().w0(zr0Var2.I, arrayList3, null);
                }
                zr0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ sr0(zr0 zr0Var, boolean z10, org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = zr0Var;
        this.c = z10;
        this.e = g2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
