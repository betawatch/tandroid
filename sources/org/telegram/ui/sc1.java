package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sc1 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi.d b;

    public /* synthetic */ sc1(fi.d dVar, int i7) {
        this.a = i7;
        this.b = dVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.a8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.b.setLoading(false);
                break;
            default:
                org.telegram.messenger.a8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.b.setLoading(false);
                break;
        }
    }
}
