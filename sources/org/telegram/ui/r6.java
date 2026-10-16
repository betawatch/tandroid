package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                    AndroidUtilities.runOnUIThread(new su0(s6Var, 16), Math.max(0L, 1000 - (System.currentTimeMillis() - jArr[0])));
                    break;
                }
        }
    }
}
