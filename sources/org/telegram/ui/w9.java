package org.telegram.ui;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w9 implements com.google.android.gms.common.api.o {
    public final /* synthetic */ int a;

    public /* synthetic */ w9(int i10) {
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
