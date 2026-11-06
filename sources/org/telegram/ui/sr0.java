package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ zr0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ sr0(zr0 zr0Var, boolean z9, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList) {
        this.b = zr0Var;
        this.c = z9;
        this.d = pollAnswer;
        this.e = f2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zr0 zr0Var = this.b;
                zr0Var.getClass();
                boolean z9 = this.c;
                org.telegram.ui.ActionBar.f2 f2Var = this.e;
                if (z9) {
                    ArrayList arrayList = this.f;
                    arrayList.remove(this.d);
                    f2Var.getSendMessagesHelper().w0(zr0Var.H, arrayList, null);
                } else {
                    f2Var.getSendMessagesHelper().w0(zr0Var.H, null, null);
                }
                zr0Var.c(true);
                break;
            default:
                zr0 zr0Var2 = this.b;
                zr0Var2.getClass();
                boolean z10 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = this.e;
                if (z10) {
                    ArrayList arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(zr0Var2.H, arrayList2, null);
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(zr0Var2.H, arrayList3, null);
                }
                zr0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ sr0(zr0 zr0Var, boolean z9, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = zr0Var;
        this.c = z9;
        this.e = f2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
