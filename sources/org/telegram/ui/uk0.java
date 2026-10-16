package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vk0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ uk0(vk0 vk0Var, String str, int i10) {
        this.a = i10;
        this.b = vk0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vk0 vk0Var = this.b;
                String str = this.c;
                vk0Var.getClass();
                AndroidUtilities.runOnUIThread(new uk0(vk0Var, str, 1));
                break;
            default:
                vk0 vk0Var2 = this.b;
                String str2 = this.c;
                hg.a2 a2Var = vk0Var2.h;
                int i10 = vk0Var2.n.s;
                a2Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.searchQueue.postRunnable(new tf0(vk0Var2, str2, new ArrayList(vk0Var2.n.w), 8));
                break;
        }
    }
}
