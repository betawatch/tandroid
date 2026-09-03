package org.telegram.ui;

import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tb0 implements Executor {
    public final /* synthetic */ int a;

    public /* synthetic */ tb0(int i10) {
        this.a = i10;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
