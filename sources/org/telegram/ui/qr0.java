package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xr0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ qr0(xr0 xr0Var, boolean z10, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.e2 e2Var, ArrayList arrayList) {
        this.b = xr0Var;
        this.c = z10;
        this.d = pollAnswer;
        this.e = e2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xr0 xr0Var = this.b;
                xr0Var.getClass();
                boolean z10 = this.c;
                org.telegram.ui.ActionBar.e2 e2Var = this.e;
                if (z10) {
                    ArrayList arrayList = this.f;
                    arrayList.remove(this.d);
                    e2Var.getSendMessagesHelper().w0(xr0Var.I, arrayList, null);
                } else {
                    e2Var.getSendMessagesHelper().w0(xr0Var.I, null, null);
                }
                xr0Var.c(true);
                break;
            default:
                xr0 xr0Var2 = this.b;
                xr0Var2.getClass();
                boolean z11 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.e2 e2Var2 = this.e;
                if (z11) {
                    ArrayList arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    e2Var2.getSendMessagesHelper().w0(xr0Var2.I, arrayList2, null);
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(pollAnswer);
                    e2Var2.getSendMessagesHelper().w0(xr0Var2.I, arrayList3, null);
                }
                xr0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ qr0(xr0 xr0Var, boolean z10, org.telegram.ui.ActionBar.e2 e2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = xr0Var;
        this.c = z10;
        this.e = e2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
