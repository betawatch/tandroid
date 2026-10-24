package org.telegram.ui;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
