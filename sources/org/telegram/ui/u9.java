package org.telegram.ui;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u9 implements com.google.android.gms.common.api.o {
    public final /* synthetic */ int a;

    public /* synthetic */ u9(int i7) {
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
