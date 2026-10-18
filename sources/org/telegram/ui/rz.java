package org.telegram.ui;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p00 b;

    public /* synthetic */ rz(p00 p00Var, int i10) {
        this.a = i10;
        this.b = p00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p00.V(this.b);
                break;
            default:
                p00.W(this.b);
                break;
        }
    }
}
