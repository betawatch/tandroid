package org.telegram.ui;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
