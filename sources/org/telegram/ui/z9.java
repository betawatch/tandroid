package org.telegram.ui;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
