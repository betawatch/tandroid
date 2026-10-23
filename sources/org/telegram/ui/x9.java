package org.telegram.ui;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
