package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq b;
    public final /* synthetic */ long c;

    public /* synthetic */ tp(dq dqVar, long j10, int i10) {
        this.a = i10;
        this.b = dqVar;
        this.c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                long j10 = this.c;
                dq dqVar = this.b;
                dqVar.n = j10;
                dqVar.r = true;
                dqVar.n0();
                break;
            default:
                dq.Z(this.b, this.c);
                break;
        }
    }
}
