package org.telegram.ui;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z9 implements com.google.android.gms.common.api.o {
    public final /* synthetic */ int a;

    public /* synthetic */ z9(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.common.api.o
    public final void a(Status status) {
        switch (this.a) {
            case 0:
                c5.d.b.decrementAndGet();
                break;
            case 1:
                c5.d.b.decrementAndGet();
                break;
            case 2:
                c5.d.b.decrementAndGet();
                break;
            case 3:
                c5.d.b.decrementAndGet();
                break;
            default:
                c5.d.b.decrementAndGet();
                break;
        }
    }
}
