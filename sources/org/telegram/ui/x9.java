package org.telegram.ui;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class x9 implements com.google.android.gms.common.api.o {
    public final /* synthetic */ int a;

    public /* synthetic */ x9(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        switch (this.a) {
            case 0:
                b5.d.b.decrementAndGet();
                break;
            case 1:
                b5.d.b.decrementAndGet();
                break;
            case 2:
                b5.d.b.decrementAndGet();
                break;
            case 3:
                b5.d.b.decrementAndGet();
                break;
            default:
                b5.d.b.decrementAndGet();
                break;
        }
    }
}
