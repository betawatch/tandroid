package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ v6 c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ t6 e;

    public /* synthetic */ s6(boolean[] zArr, v6 v6Var, long[] jArr, t6 t6Var, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = v6Var;
        this.d = jArr;
        this.e = t6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s6(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                this.b[0] = true;
                this.c.a(1.0f);
                long[] jArr = this.d;
                long j10 = jArr[0];
                t6 t6Var = this.e;
                if (j10 <= 0) {
                    t6Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new yt0(t6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
