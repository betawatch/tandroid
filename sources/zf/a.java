package zf;

import android.os.Bundle;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar, String str, Bundle bundle, int i7) {
        this.a = i7;
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

    public a(b bVar, int i7, Bundle bundle) {
        this.a = 0;
        this.b = bVar;
    }

    public a(b bVar, Bundle bundle) {
        this.a = 2;
        this.b = bVar;
    }
}
