package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tq b;

    public /* synthetic */ sq(tq tqVar, int i7) {
        this.a = i7;
        this.b = tqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fi.w3 w3Var = this.b.a;
                if (w3Var != null) {
                    w3Var.f3.O(true);
                    break;
                }
                break;
            default:
                fi.w3 w3Var2 = this.b.a;
                if (w3Var2 != null) {
                    w3Var2.f3.O(true);
                    break;
                }
                break;
        }
    }
}
