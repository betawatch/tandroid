package org.telegram.ui;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t9 implements com.google.android.gms.common.api.o {
    public final /* synthetic */ int a;

    public /* synthetic */ t9(int i7) {
        this.a = i7;
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
