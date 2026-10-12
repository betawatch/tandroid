package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class r6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ v6 c;
    public final /* synthetic */ long[] d;
    public final /* synthetic */ s6 e;

    public /* synthetic */ r6(boolean[] zArr, v6 v6Var, long[] jArr, s6 s6Var, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = v6Var;
        this.d = jArr;
        this.e = s6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new r6(this.b, this.c, this.d, this.e, 1));
                break;
            default:
                this.b[0] = true;
                this.c.a(1.0f);
                long[] jArr = this.d;
                long j10 = jArr[0];
                s6 s6Var = this.e;
                if (j10 <= 0) {
                    s6Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new tu0(s6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
