package org.telegram.ui;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe1 implements OnFailureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vh.d b;

    public /* synthetic */ qe1(vh.d dVar, int i10) {
        this.a = i10;
        this.b = dVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.f8.d("wear-auth: /answer send failed: " + exc.getMessage());
                this.b.setLoading(false);
                break;
            default:
                org.telegram.messenger.f8.d("wear-auth: /token send failed: " + exc.getMessage());
                this.b.setLoading(false);
                break;
        }
    }
}
