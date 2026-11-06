package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ az b;

    public /* synthetic */ zy(az azVar, int i7) {
        this.a = i7;
        this.b = azVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                az azVar = this.b;
                azVar.b(azVar.D);
                break;
        }
    }
}
