package vf;

import android.os.Bundle;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, String str, Bundle bundle, int i10) {
        this.a = i10;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b.getClass();
                break;
            case 1:
                this.b.b.getClass();
                break;
            case 2:
                this.b.b.getClass();
                break;
            default:
                this.b.b.getClass();
                break;
        }
    }

    public a(b bVar, int i10, Bundle bundle) {
        this.a = 0;
        this.b = bVar;
    }

    public a(b bVar, Bundle bundle) {
        this.a = 2;
        this.b = bVar;
    }
}
