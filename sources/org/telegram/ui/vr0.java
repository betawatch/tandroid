package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vr0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ cs0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.PollAnswer d;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ vr0(cs0 cs0Var, boolean z9, TLRPC.PollAnswer pollAnswer, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList) {
        this.b = cs0Var;
        this.c = z9;
        this.d = pollAnswer;
        this.e = f2Var;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cs0 cs0Var = this.b;
                cs0Var.getClass();
                boolean z9 = this.c;
                org.telegram.ui.ActionBar.f2 f2Var = this.e;
                if (z9) {
                    ArrayList arrayList = this.f;
                    arrayList.remove(this.d);
                    f2Var.getSendMessagesHelper().w0(cs0Var.H, arrayList, null);
                } else {
                    f2Var.getSendMessagesHelper().w0(cs0Var.H, null, null);
                }
                cs0Var.c(true);
                break;
            default:
                cs0 cs0Var2 = this.b;
                cs0Var2.getClass();
                boolean z10 = this.c;
                TLRPC.PollAnswer pollAnswer = this.d;
                org.telegram.ui.ActionBar.f2 f2Var2 = this.e;
                if (z10) {
                    ArrayList arrayList2 = this.f;
                    arrayList2.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(cs0Var2.H, arrayList2, null);
                } else {
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(pollAnswer);
                    f2Var2.getSendMessagesHelper().w0(cs0Var2.H, arrayList3, null);
                }
                cs0Var2.c(true);
                break;
        }
    }

    public /* synthetic */ vr0(cs0 cs0Var, boolean z9, org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, TLRPC.PollAnswer pollAnswer) {
        this.b = cs0Var;
        this.c = z9;
        this.e = f2Var;
        this.f = arrayList;
        this.d = pollAnswer;
    }
}
