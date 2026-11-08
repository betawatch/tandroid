package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tc1 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi.d b;

    public /* synthetic */ tc1(fi.d dVar, int i7) {
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
