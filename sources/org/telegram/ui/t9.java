package org.telegram.ui;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t9 implements com.google.android.gms.common.api.o {
    public final /* synthetic */ int a;

    public /* synthetic */ t9(int i9) {
        this.a = i9;
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
