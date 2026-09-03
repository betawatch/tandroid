package org.telegram.ui;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y9 implements com.google.android.gms.common.api.o {
    public final /* synthetic */ int a;

    public /* synthetic */ y9(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        switch (this.a) {
            case 0:
                d1.f.b.decrementAndGet();
                break;
            case 1:
                d1.f.b.decrementAndGet();
                break;
            case 2:
                d1.f.b.decrementAndGet();
                break;
            case 3:
                d1.f.b.decrementAndGet();
                break;
            default:
                d1.f.b.decrementAndGet();
                break;
        }
    }
}
